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
class CREATE_INSTRUCTION
   --
   -- The new style create instruction.
   --

inherit CREATE_TOOLS; INSTRUCTION;

creation {EIFFEL_PARSER,CREATE_INSTRUCTION} make

feature

   to_runnable(ct: E_TYPE): like Current is
      local
	 t: E_TYPE;
      do
         if current_type = Void then
	    current_type := ct;
            check_writable(ct);
	    if type /= Void then
	       check_explicit_type;
	       t := type;
	    else
	       t := writable.result_type;
	    end;
            check_created_type(t);
            check_create_clause(t);
            Result := Current;
         else
            !!Result.make(start_position,type,writable,call);
            Result := Result.to_runnable(ct);
         end;
      end;

   is_pre_computable: BOOLEAN is
      local
         rfct: E_TYPE; rfn, rfctbcn: STRING;
	 args: like arguments;
      do
         if writable.is_result then
	    if run_feature = Void then
	       Result := true;
	    else
	       args := arguments;
	       if args = Void then
		  Result := true;
	       else
		  Result := args.is_pre_computable;
	       end;
	       if Result then
		  if run_feature.is_pre_computable then
		  else
		     rfct := run_feature.current_type;
		     rfctbcn := rfct.base_class.name.to_string;
		     rfn := run_feature.name.to_string;
		     if as_make= rfn then
			if as_array = rfctbcn then
			elseif as_fixed_array = rfctbcn then
			elseif as_string = rfctbcn then
			elseif as_dictionary = rfctbcn then
			elseif as_text_file_read = rfctbcn then
			elseif as_text_file_write = rfctbcn then
			else
			   Result := false;
			end;
		     elseif as_blank = rfn then
			if as_string = rfctbcn then
			else
			   Result := false;
			end;
		     elseif as_with_capacity = rfn then
			if as_array = rfctbcn then
			elseif as_fixed_array = rfctbcn then
			elseif as_dictionary = rfctbcn then
			else
			   Result := false;
			end;
		     else
			Result := false;
		     end;
		  end;
	       end;
	    end;
	 end;
      end;

   use_current: BOOLEAN is
      local
	 args: like arguments;
      do
	 if writable.use_current then
	    Result := true;
	 elseif run_feature /= Void then
	    args := arguments;
	    if args /= Void then
	       Result := args.use_current;
	    end;
	 end;
      end;

   collect_c_tmp is
      local
         args: like arguments;
      do
	 args := arguments;
	 if args /= Void then
	    args.collect_c_tmp;
	 end;
      end;

   stupid_switch(r: ARRAY[RUN_CLASS]): BOOLEAN is
      local
         t: E_TYPE;
      do
         if type /= Void then
            t := type;
         else
            t := writable.result_type;
         end;
         if t.is_anchored then
         elseif t.is_generic then
         else
            if call = Void then
               Result := writable.stupid_switch(r);
            else
               Result := call.stupid_switch(r);
            end;
         end;
      end;

   pretty_print is
      do
         fmt.keyword(fz_create);
	 if type /= Void then
	    fmt.put_character('{');
	    type.pretty_print;
	    fmt.put_character('}');
	    fmt.put_character(' ');
	 end;
	 if call /= Void then
	    call.pretty_print;
	 else
	    writable.pretty_print;
	    if fmt.semi_colon_flag then
	       fmt.put_character(';');
	    end;
	 end;
      end;

   compile_to_c is
      local
	 t: E_TYPE; rf3: RUN_FEATURE_3;
      do
	 t := type;
	 if t = Void then
	    t := writable.result_type.run_type;
	 end;
         if t.is_reference then
            c2c_opening(t);
	    if run_feature /= Void then
	       cpp.push_create_instruction(run_feature,arguments);
	       run_feature.mapping_c;
	       cpp.pop;
	    end;
            c2c_closing(t);
         else
	    writable.compile_to_c;
	    cpp.put_character('=');
	    cpp.put_character('M');
	    cpp.put_integer(t.id);
	    cpp.put_string(fz_00);
	    if run_feature /= Void then
	       check
		  run_feature = t.run_class.a_default_create
	       end;
	       rf3 ?= run_feature;
	       cpp.put_proc_call_0(rf3,writable,Void);
	    end;
         end;
      end;

   compile_to_jvm is
      local
         w: EXPRESSION; t: E_TYPE;
      do
         w := writable;
	 if type /= Void then
	    t := type;
	 else
	    t := writable.result_type;
	 end;
	 t := t.run_type;
         compile_to_jvm0(t);
	 if run_feature /= Void then
	    jvm.inside_create_instruction(run_feature,call);
	 end;
         t.jvm_check_class_invariant;
         w.jvm_assign;
      end;

   end_mark_comment: BOOLEAN is false;

feature {NONE}

   check_writable(ct: E_TYPE) is
      require
         ct /= Void
      local
         w: like writable;
      do
         w := writable.to_runnable(ct);
         if w = Void then
            eh.add_position(writable.start_position);
            fatal_error("Bad writable target for creation.");
         else
            writable := w;
         end;
      end;

   c2c_opening(t: E_TYPE) is
      require
         t.is_reference
      local
         rc: RUN_CLASS;
         once_result: ONCE_RESULT;
      do
         rc := t.run_class;
         cpp.se_trace_ins(start_position);
         cpp.put_character('{');
         gc_handler.declare_allocate_n(rc);
         cpp.expanded_attributes(t);
         once_result ?= writable;
         if once_result /= Void then
            cpp.put_string(once_result.c_variable_name);
            cpp.put_string(once "=((T0*)n);%N");
         end;
      end;

   c2c_closing(t: E_TYPE) is
      require
         t.is_reference
      local
         once_result: ONCE_RESULT;
      do
         once_result ?= writable;
         if once_result = Void then
            writable.compile_to_c;
            cpp.put_string(once "=((T0*)n);%N");
         end;
         if cpp.call_invariant_start(t) then
            cpp.put_character('n');
            cpp.call_invariant_end;
            cpp.put_character(';');
         end;
         cpp.put_character('}');
         cpp.put_character('%N');
      end;

   make(sp: like start_position;
	t: like type; w: like writable; c: like call) is
      require
         not sp.is_unknown;
         w /= Void;
      do
         start_position := sp;
         type := t;
         writable := w;
         call := c;
      ensure
         start_position = sp;
         type = t;
         writable = w;
         call = c;
      end;

invariant

   not start_position.is_unknown;

   writable.is_writable;

end -- CREATE_INSTRUCTION
