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
class TUPLE_EXPRESSION
   --
   -- Like:  [ foo , bar ]
   --

inherit EXPRESSION;

creation make

feature

   start_position: POSITION;
         -- Of opening bracket.

   result_type: TYPE_TUPLE;
         -- Computed according to the actual `list'.

   is_void: BOOLEAN is false;

   is_current: BOOLEAN is false;

   c_simple: BOOLEAN is false;

   isa_dca_inline_argument: INTEGER is 0;

   can_be_dropped: BOOLEAN is false;

   precedence: INTEGER is 2;

   is_static: BOOLEAN is false;

   is_manifest_string: BOOLEAN is false;

   is_result: BOOLEAN is false;

   is_writable: BOOLEAN is false;

   static_value: INTEGER is 0;

   bracketed_pretty_print is
      do
         fmt.put_character('(');
         pretty_print;
         fmt.put_character(')');
      end;

   pretty_print is
      local
         i: INTEGER;
      do
         fmt.put_string(once "[");
         fmt.level_incr;
         if list /= Void then
            from
               i := list.lower;
            until
               i > list.upper
            loop
               list.item(i).pretty_print;
               i := i + 1;
               if i <= list.upper then
                  fmt.put_character(',');
               end;
            end;
         end;
         fmt.put_string(once "]");
         fmt.level_decr;
      end;

   print_as_target is
      do
         fmt.put_character('(');
         pretty_print;
         fmt.put_character(')');
         fmt.put_character('.');
      end;

   short is
      local
         i: INTEGER;
      do
         short_print.hook_or(once "open_sb",once "[");
         if list /= Void then
            from
               i := list.lower;
            until
               i > list.upper
            loop
               list.item(i).short;
               i := i + 1;
               if i <= list.upper then
                  short_print.hook_or(once "ma_sep",once ",");
               end;
            end;
         end;
         short_print.hook_or(once "close_sb",once "]");
      end;

   short_target is
      do
         bracketed_short;
         short_print.a_dot;
      end;

   to_integer_or_error: INTEGER is
      do
	 to_integer_error;
      end;

   start_lookup_class: BASE_CLASS is do end;

   stupid_switch(r: ARRAY[RUN_CLASS]): BOOLEAN is
      local
         i: INTEGER;
      do
         Result := true;
         if list /= Void then
            from
               i := list.upper;
            until
               not Result or else i < list.lower
            loop
               Result := list.item(i).stupid_switch(r);
               i := i - 1;
            end;
         end;
      end;

   to_runnable(ct: E_TYPE): like Current is
      do
	 Result := to_runnable_(ct);
	 if nb_errors = 0 then
	    Result.result_type.run_class.set_at_run_time;
         end;
      end;

   use_current: BOOLEAN is
      local
         i: INTEGER;
      do
         if list /= Void then
            from
               i := list.upper;
            until
               i < list.lower or else Result
            loop
               Result := list.item(i).use_current;
               i := i - 1;
            end;
         end;
      end;

   afd_check is
      local
         i: INTEGER;
      do
         if list /= Void then
            from
               i := list.upper;
            until
               i < list.lower
            loop
               list.item(i).afd_check;
               i := i - 1;
            end;
         end;
      end;

   is_pre_computable: BOOLEAN is
      local
         i: INTEGER;
         e: EXPRESSION;
      do
         if list = Void then
            Result := true;
         elseif result_type.generic_list.first.is_string then
            from
               Result := true;
               i := list.upper;
            until
               not Result or else i < list.lower
            loop
               e := list.item(i);
               Result := e.is_pre_computable;
               i := i - 1;
            end;
         end;
      end;

   assertion_check(tag: CHARACTER) is
      local
         i: INTEGER; e: EXPRESSION;
      do
         if list /= Void then
            from
               i := list.upper;
            until
               i < list.lower
            loop
               e := list.item(i);
               e.assertion_check(tag);
               i := i - 1;
            end;
         end;
      end;

   dca_inline_argument(formal_arg_type: E_TYPE) is
      do
      end;

   collect_c_tmp is
      local
         i: INTEGER;
      do
	 if list /= Void then
	    from
	       i := list.upper;
	    until
	       i < list.lower
	    loop
	       list.item(i).collect_c_tmp;
	       i := i - 1;
	    end;
	 end;
      end;

   c_frame_descriptor(format, locals: STRING) is
      local
         i: INTEGER;
      do
         if list /= Void then
            from
               i := list.upper;
            until
               i < list.lower
            loop
               list.item(i).c_frame_descriptor(format,locals);
               i := i - 1;
            end;
         end;
      end;

   jvm_assign is
      do
	 check false end;
      end;

   jvm_branch_if_false: INTEGER is
      do
	 check false end;
      end;

   jvm_branch_if_true: INTEGER is
      do
	 check false end;
      end;

   compile_target_to_jvm, compile_to_jvm is
      do
	 fatal_not_yet_implemented(once "compile_to_jvm");
      end;

   compile_to_jvm_into(dest: E_TYPE): INTEGER is
      do
         Result := 1;
         compile_to_jvm;
      end;

   mapping_c_target(target_type: E_TYPE) is
      do
         cpp.put_character('(');
         target_type.mapping_cast;
         compile_to_c;
         cpp.put_character(')');
      end;

   mapping_c_arg(formal_arg_type: E_TYPE) is
      do
         compile_to_c;
      end;

   compile_to_c is
      local
         i: INTEGER; e: EXPRESSION; t: E_TYPE;
      do
         cpp.put_string(once "new_tuple");
	 cpp.put_integer(result_type.id);
         cpp.put_character('(');
         if list /= Void then
            from
               i := list.lower;
            until
               i > list.upper
            loop
               e := list.item(i);
	       t := e.result_type;
               e.mapping_c_arg(t);
	       if i < list.upper then
		  cpp.put_character(',');
		  cpp.put_character('%N');
	       end;
               i := i + 1;
            end;
         end;
         cpp.put_character(')');
      end;

feature {FACE_TUPLE}

   list: FIXED_ARRAY[EXPRESSION];
         -- Void or elements in the manifest array.

   debug_info: STRING;

   to_runnable_(ct: E_TYPE): like Current is
      local
         i: INTEGER; e: EXPRESSION; types: ARRAY[E_TYPE];
	 l: like list;
      do
         if current_type = Void then
            current_type := ct;
            if list /= Void then
               from
		  create types.with_capacity(list.count,1);
                  i := list.lower;
               until
                  i > list.upper
               loop
                  e := list.item(i).to_runnable(ct);
                  if e = Void then
                     eh.add_position(start_position);
                     error(list.item(i).start_position,
                           "Bad expression inside TUPLE.");
                     i := list.upper + 1;
                  else
                     list.put(e,i);
		     types.add_last(e.result_type.run_type);
                     i := i + 1;
                  end;
               end;
            end;
            if nb_errors = 0 then
               create result_type.make(start_position,types);
	       result_type := result_type.to_runnable(ct);
               Result := Current;
            end;
         else
	    l := list;
	    if l /= Void then
	       l := l.twin;
	    end;
            create Result.make(start_position,l);
            Result := Result.to_runnable(ct);
         end;
	 debug
	    debug_info := result_type.run_time_mark;
	 end;
      end;

feature {NONE}

   fatal_not_yet_implemented(method: STRING) is
      do
	 eh.add_position(start_position);
	 eh.append("TUPLE_EXPRESSION.");
	 eh.append(method);
	 eh.append(" not yet implemented.%N");
	 eh.print_as_fatal_error;
      end;

   current_type: E_TYPE;

   make(sp: like start_position; l: like list) is
      require
         not sp.is_unknown;
         l /= Void implies not l.is_empty;
      do
         start_position := sp;
         list := l;
      ensure
         start_position = sp;
         list = l;
      end;

end

