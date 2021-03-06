--          This file is part of SmallEiffel The GNU Eiffel Compiler.
--       Copyright (C) 1994-2002 LORIA - INRIA - U.H.P. Nancy 1 - FRANCE
--          Dominique COLNET and Suzanne COLLIN - SmallEiffel@loria.fr
--                       http://SmallEiffel.loria.fr
-- SmallEiffel is  free  software;  you can  redistribute it and/or modify it
-- under the terms of the GNU General Public License as published by the Free
-- Software  Foundation;  either  version  2, or (at your option)  any  later
-- version. SmallEiffel is distributed in the hope that it will be useful,but
-- WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
-- or  FITNESS FOR A PARTICULAR PURPOSE.   See the GNU General Public License
-- for  more  details.  You  should  have  received a copy of the GNU General
-- Public  License  along  with  SmallEiffel;  see the file COPYING.  If not,
-- write to the  Free Software Foundation, Inc., 59 Temple Place - Suite 330,
-- Boston, MA 02111-1307, USA.
--
class NATIVE_C
   --
   -- For the external "C ..." definition.
   --

inherit NATIVE redefine make end;

creation make

feature

   use_current(er: EXTERNAL_ROUTINE): BOOLEAN is do end;

   stupid_switch_function(r: ARRAY[RUN_CLASS]; name: STRING): BOOLEAN is
      do
         Result := true;
      end;

   stupid_switch_procedure(r: ARRAY[RUN_CLASS]; name: STRING): BOOLEAN is
      do
         Result := true;
      end;

   c_define_function(rf8: RUN_FEATURE_8; bcn, name: STRING) is
      do
	 parse_external_tag;
	 if ace.no_check then
	    if need_prototype then 
	       rf8.external_c_prototype_from(start_position);
	    end;
	    rf8.c_opening;
	    c_mapping(rf8.base_feature,true,true,rf8.arg_count);
	    rf8.c_closing;
	 end;
      end;

   c_mapping_function(rf8: RUN_FEATURE_8; bcn, name: STRING) is
      do
	 parse_external_tag;
         if ace.no_check then
            rf8.default_mapping_function;
         else
	    if need_prototype then 
	       rf8.external_c_prototype_from(start_position);
	    end;
            c_mapping(rf8.base_feature,false,true,rf8.arg_count);
         end;
      end;

   c_define_procedure(rf7: RUN_FEATURE_7; bcn, name: STRING) is
      do
	 parse_external_tag;
	 if ace.no_check then
	    if need_prototype then 
	       rf7.external_c_prototype_from(start_position);
	    end;
	    rf7.c_opening;
	    c_mapping(rf7.base_feature,true,false,rf7.arg_count);
	    rf7.c_closing;
	 end;
      end;

   c_mapping_procedure(rf7: RUN_FEATURE_7; bcn, name: STRING) is
      do
	 parse_external_tag;
         if ace.no_check then
            rf7.default_mapping_procedure;
         else
	    if need_prototype then 
	       rf7.external_c_prototype_from(start_position);
	    end;
            c_mapping(rf7.base_feature,false,false,rf7.arg_count);
         end;
      end;

   jvm_add_method_for_function(rf8: RUN_FEATURE_8; bcn, name: STRING) is
      do
      end;

   jvm_define_function(rf8: RUN_FEATURE_8; bcn, name: STRING) is
      do
         fe_c2jvm(rf8);
      end;

   jvm_mapping_function(rf8: RUN_FEATURE_8; bcn, name: STRING) is
      do
         fe_c2jvm(rf8);
      end;

   jvm_add_method_for_procedure(rf7: RUN_FEATURE_7; bcn, name: STRING) is
      do
      end;

   jvm_define_procedure(rf7: RUN_FEATURE_7; bcn, name: STRING) is
      do
         fe_c2jvm(rf7);
      end;

   jvm_mapping_procedure(rf7: RUN_FEATURE_7; bcn, name: STRING) is
      do
         fe_c2jvm(rf7);
      end;

feature {NONE}

   parsing_done, need_prototype: BOOLEAN;

   macro: BOOLEAN;
	 -- Is the "macro" keyword used?

   struct: STRING;
	 -- Non Void when the "struct" keyword is used. The value is then 
	 -- the appropriate C cast to access the corresponding C struct.

   get, set: STRING;
	 -- Non Void if we have to access this `struct' name field.

   signature: FIXED_ARRAY[STRING];
	 -- Non Void when some external `signature' is used.

   c_inline: BOOLEAN;
	 -- When the C inline is used.

   parse_external_tag is
      local
	 file_name: STRING
      do
	 if not parsing_done then
	    parsing_done := true;
	    from
	       need_prototype := true;
	       mini_buffer.start_with(external_tag);
	       mini_buffer.next;
	       mini_buffer.skip_separators;
	    until
	       mini_buffer.is_off
	    loop
	       if mini_buffer.a_keyword(fz_macro) then
		  macro := true;
		  need_prototype := false;
	       elseif mini_buffer.a_keyword(fz_struct) then
		  need_prototype := false;
		  struct := mini_buffer.a_type_cast;
		  if mini_buffer.a_keyword(fz_set) then
		     set := mini_buffer.a_field_or_variable_name;
		     get := set;
		  elseif mini_buffer.a_keyword(fz_get) then
		     get := mini_buffer.a_field_or_variable_name;
		  else
		     bad_external("%"set%" or %"get%" keyword expected.");
		  end;
	       elseif mini_buffer.a_keyword(fz_use) then
	       elseif mini_buffer.a_keyword(fz_inline) then
		  c_inline := true;
		  need_prototype := false;
	       elseif mini_buffer.a_keyword(fz_signature) then
                  signature := mini_buffer.a_signature;
	       elseif mini_buffer.item = '(' then
                  signature := mini_buffer.a_signature;
	       else
		  inspect
		     mini_buffer.item
		  when ',', '|' then
		     mini_buffer.next;
		     mini_buffer.skip_separators;
		  else
		     file_name := mini_buffer.a_include;
		     need_prototype := false;
		     cpp.include_register(start_position,file_name);
		  end;
	       end;
	    end;
	 end;
      end;

   bad_external(msg: STRING) is
      do
	 eh.add_position(start_position);
	 eh.append(msg);
	 eh.print_as_fatal_error;
      end;

   c_mapping(er: EXTERNAL_ROUTINE; wrapped, is_function: BOOLEAN;
	     arg_count: INTEGER) is
	 -- Where `wrapped' means that the code is wrapped inside 
	 -- some function (-no_check mode).
      local
         tcbd, stop: BOOLEAN; p: POSITION; c_code, arg: STRING;
	 cc: CHARACTER; i, arg_idx: INTEGER;
      do
	 p := start_position;
	 cpp.put_position_comment('[',p);
	 if signature /= Void and then signature.upper /= arg_count then
	    bad_external("Bad number of arguments of external signature.");
	 end;
	 if wrapped then
	    cpp.se_trace_ins(p);
	    if is_function then cpp.put_string(once "R=("); end;
	 else
	    tcbd := cpp.target_cannot_be_dropped;
	    if tcbd then cpp.put_character(',') end;
	 end;
         if struct /= Void then
	    if set /= Void then
	       if is_function or else arg_count /= 2 then
		  eh.add_position(er.start_position);
		  bad_external("Bad prototype for C struture set external.");
	       end;
	    else
	       check get /= Void end;
	       if (not is_function) or else arg_count /= 1 then
		  eh.add_position(er.start_position);
		  bad_external("Bad prototype for C struture get external.");
	       end;
	    end;
	    cpp.put_string(once "(((");
	    cpp.put_string(struct);
	    cpp.put_string(once "*)");
	    if wrapped then
	       cpp.put_string(as_a1);
	    else
	       cpp.put_ith_argument(1);
	    end;
	    cpp.put_string(fz_72);
	    cpp.put_string(get);
	    cpp.put_character(')');
	    if set /= Void then
	       cpp.put_string(fz_47);
	       if wrapped then
		  cpp.put_string(once "a2");
	       else
		  cpp.put_ith_argument(2);
	       end;
	       cpp.put_character(')');
	    end;
	 elseif c_inline then
	    from
	       c_code := er.external_name;
	       i := 1;
	    until
	       i > c_code.count
	    loop
	       cc := c_code.item(i);
	       if cc /= '$' then
		  cpp.put_character(cc);
	       else
		  from
		     i := i + 1;
		     arg := once "local buffer...";
		     arg.clear;
		     stop := i > c_code.count;
		  until
		     stop
		  loop
		     cc := c_code.item(i);
		     inspect
			cc
		     when 'a'..'z', 'A'..'Z', '0'..'9', '_' then
			arg.extend(cc);
			i := i + 1;
		     else
			stop := true;
			i := i - 1;
		     end;
		  end;
		  arg := string_aliaser.item(arg);
		  arg_idx := er.argument_rank_of(arg);
		  if arg_idx > 0 then
		     if wrapped then
			cpp.put_character('a');
			cpp.put_integer(arg_idx);
		     else
			cpp.put_ith_argument(arg_idx);
		     end;
		  else
		     eh.add_position(er.start_position);
		     eh.add_position(start_position);
		     eh.append("Unknown %"$");
		     eh.append(arg);
		     eh.append("%" argument in external C inline definition.");
		     eh.print_as_fatal_error;
		  end;
	       end;
	       i := i + 1;
	    end;
	 else
	    cpp.put_string(er.external_name);
	    if arg_count > 0 then
	       cpp.put_character('(');
	       from
		  i := 1;
	       until
		  i > arg_count
	       loop
		  if signature /= Void then
		     cpp.put_character('(');
		     cpp.put_character('(');
		     cpp.put_string(signature.item(i));
		     cpp.put_character(')');
		  end;
		  if wrapped then
		     cpp.put_character('a');
		     cpp.put_integer(i);
		  else
		     cpp.put_ith_argument(i);
		  end;
		  if signature /= Void then
		     cpp.put_character(')');
		  end;
		  i := i + 1;
		  if i <= arg_count then cpp.put_character(',') end;
	       end;
	       cpp.put_character(')');
	    elseif not macro then
	       cpp.put_string(once "()");
	    end;
	 end;
	 if wrapped then
	    if is_function then
	       cpp.put_character(')');
	    end;
	    cpp.put_character(';');
	 else
	    if tcbd then cpp.put_character(')') end;
	    if not is_function then cpp.put_character(';') end;
	 end;
	 cpp.put_character('%N');
	 cpp.put_position_comment(']',p);
      end;

   make(et: like external_tag) is
	 -- To handle old external obsolete notation.
      local
	 oldies, new_notation: STRING; obsolete_warning: BOOLEAN;
      do
	 Precursor(et);
	 oldies := et.to_string;
	 if (once "C_WithoutCurrent").is_equal(oldies) then
	    obsolete_warning := true;
	    new_notation := "C";
	 elseif (once "C_WithCurrent").is_equal(oldies) then
	    obsolete_warning := true;
	 elseif (once "C_InlineWithoutCurrent").is_equal(oldies) then
	    obsolete_warning := true;
	    new_notation := "C macro";
	 elseif (once "C_InlineWithCurrent").is_equal(oldies) then
	    obsolete_warning := true;
	 end;
	 if obsolete_warning then
	    eh.add_position(start_position);
	    eh.append("Since release -0.74 this external C definition is %
		      %obsolete. You should update your code with the new %
		      %ETL external specification (see SmallEiffel/external/C %
		      %directory for examples).");
	    if new_notation /= Void then
	       et.to_string.copy(new_notation);
	       eh.append("Obsolete notation replaced with %"");
	       eh.append(new_notation);
	       eh.append("%". Update your code before the next release.");
	       eh.print_as_warning;
	    else
	       eh.print_as_error;
	    end;
	 end;
      end;

end -- NATIVE_C
