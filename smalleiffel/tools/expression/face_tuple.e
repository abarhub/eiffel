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
class FACE_TUPLE
   --
   -- Pseudo expression used to avoid creation of TUPLEs at run-time.
   -- Very important for an efficient agents implementation.
   --

inherit EXPRESSION;

creation make

feature

   is_void: BOOLEAN is false;

   is_current: BOOLEAN is false;

   c_simple: BOOLEAN is false;

   is_pre_computable: BOOLEAN is false;

   can_be_dropped: BOOLEAN is false;

   precedence: INTEGER is 2;

   is_static: BOOLEAN is false;

   is_manifest_string: BOOLEAN is false;

   is_result: BOOLEAN is false;

   is_writable: BOOLEAN is false;

   static_value: INTEGER is 0;

   start_position: POSITION is
      do
	 Result := tuple_expression.start_position;
      end;

   debug_info: STRING;

   to_runnable(ct: E_TYPE): like Current is
      do
	 if current_type = Void then
	    current_type := ct;
	    tuple_expression := tuple_expression.to_runnable_(ct);
	    Result := Current;
	    debug
	       create debug_info.make(32);
	       debug_info.append("ct:");
	       debug_info.append(ct.run_time_mark);
	       debug_info.append(" result_type:");
	       debug_info.append(tuple_expression.result_type.run_time_mark);
	    end;
	 else
	    create Result.make(tuple_expression);
	    Result := Result.to_runnable(ct);
	 end;
      end;

   compile_to_c is
      local
	 i: INTEGER; list: FIXED_ARRAY[EXPRESSION];
      do
	 list := tuple_expression.list;
	 if list /= Void then
	    from until i > list.upper
	    loop
	       list.item(i).compile_to_c;
	       if i < list.upper then
		  cpp.put_character(',');
	       end;
	       i := i + 1;
	    end;
	 end;
      end;

   mapping_c_target(formal_type: E_TYPE) is
      do
	 check false end;
      end;

   mapping_c_arg(formal_arg_type: E_TYPE) is
      do
	 check false end;
      end;

   c_frame_descriptor(format, locals: STRING) is
      do
	 check false end;
      end;

   result_type: E_TYPE is
      do
	 Result := tuple_expression.result_type;
      end;

   afd_check is
      do
	 tuple_expression.afd_check;
      end;

   collect_c_tmp is
      do
	 tuple_expression.collect_c_tmp;
      end;

   to_integer_or_error: INTEGER is
      do
	 to_integer_error;
      end;

   stupid_switch(r: ARRAY[RUN_CLASS]): BOOLEAN is
      do
	 check false end;
      end;

   isa_dca_inline_argument: INTEGER is 0;

   dca_inline_argument(formal_arg_type: E_TYPE) is
      do
	 check false end;
      end;

   assertion_check(tag: CHARACTER) is
      do
	 tuple_expression.assertion_check(tag);
      end;

   use_current: BOOLEAN is
      do
	 Result := tuple_expression.use_current;
      end;

   start_lookup_class: BASE_CLASS is
      do
	 Result := tuple_expression.start_lookup_class;
      end;

   pretty_print is
      do
	 tuple_expression.pretty_print;
      end;

   print_as_target is
      do
	 tuple_expression.print_as_target;
      end;

   bracketed_pretty_print is
      do
	 tuple_expression.bracketed_pretty_print;
      end;

   short is
      do
	 tuple_expression.short;
      end;

   short_target is
      do
	 tuple_expression.short_target;
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

   compile_to_jvm is
      local
	 i: INTEGER; list: FIXED_ARRAY[EXPRESSION];
      do
	 list := tuple_expression.list;
	 if list /= Void then
	    from
	       i := list.lower;
	    until
	       i > list.upper
	    loop
	       list.item(i).compile_to_jvm;
	       i := i + 1;
	    end;
	 end;
      end;

   compile_to_jvm_into(dest: E_TYPE): INTEGER is
      do
	 check false end;
      end;

   compile_target_to_jvm is
      do
	 check false end;
      end;

feature {AGENT_ARGS}

   count: INTEGER is
      local
	 list: FIXED_ARRAY[EXPRESSION];
      do
	 list := tuple_expression.list;
	 if list /= Void then
	    Result := list.count;
	 end;
      end;

   expression(i: INTEGER): EXPRESSION is
      require
	 i.in_range(1,count)
      local
	 list: FIXED_ARRAY[EXPRESSION];
      do
	 list := tuple_expression.list;
	 Result := list.item(i - 1);
      end;

feature {NONE}

   current_type: E_TYPE;

   tuple_expression: TUPLE_EXPRESSION;
	 -- The hided one.

   make(te: like tuple_expression) is
      require
	 te /= Void
      do
	 tuple_expression := te;
      ensure
	 tuple_expression = te
      end;

invariant

   tuple_expression /= Void

end --  FACE_TUPLE

