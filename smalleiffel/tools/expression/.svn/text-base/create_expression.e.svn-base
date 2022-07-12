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
class CREATE_EXPRESSION
   --
   -- The new style create expression.
   --

inherit CREATE_TOOLS; EXPRESSION;

creation make

feature

   is_current: BOOLEAN is false;

   is_pre_computable: BOOLEAN is false;

   c_simple: BOOLEAN is false;

   can_be_dropped: BOOLEAN is false;

   is_manifest_string: BOOLEAN is false;

   is_static: BOOLEAN is false;

   static_value: INTEGER is
      do
	 check false end;
      end;

   is_void: BOOLEAN is false;

   is_result: BOOLEAN is false;

   isa_dca_inline_argument: INTEGER is 0;

   is_writable: BOOLEAN is false;

   dca_inline_argument(formal_arg_type: E_TYPE) is do end;

   to_runnable(ct: E_TYPE): like Current is
      do
         if current_type = Void then
	    current_type := ct;
	    check_explicit_type;
            check_created_type(type);
            check_create_clause(type);
	    type.run_class.create_function_register(run_feature);
            Result := Current;
         else
            !!Result.make(start_position,type,call);
            Result := Result.to_runnable(ct);
         end;
      end;

   mapping_c_target(formal_type: E_TYPE) is
      local
	 rc: RUN_CLASS; boost: BOOLEAN;
	 args: like arguments;
      do
	 check formal_type.run_time_mark = type.run_time_mark end;
	 boost := ace.boost;
	 rc := type.run_class;
	 cpp.put_string(fz_create);
	 cpp.put_integer(rc.id);
	 if run_feature /= Void then
	    cpp.put_string(run_feature.name.to_string);
	 end;
	 cpp.put_character('(');
	 if not boost then
	    cpp.put_string(once "&ds");
	 end;
	 args := arguments;
	 if args /= Void then
	    if not boost then
	       cpp.put_character(',');
	    end;
	    args.compile_to_c(run_feature.arguments);
	 end;
	 cpp.put_character(')');
      end;

   mapping_c_arg(formal_arg_type: E_TYPE) is
      do
         compile_to_c;
      end;

   c_frame_descriptor(format, locals: STRING) is
      do
      end;

   assertion_check(tag: CHARACTER) is
      do
	 if run_feature /= Void then
	    if tag = 'R' then
	       run_feature.vape_check_from(start_position);
	    end;
	 end;
      end;

   result_type: E_TYPE is
      do
	 Result := type;
      end;

   use_current: BOOLEAN is
      local
	 args: like arguments;
      do
	 args := arguments;
	 if args /= Void then
	    Result := args.use_current;
	 end;
      end;

   start_lookup_class: BASE_CLASS is
      do
	 Result := type.base_class;
      end;

   to_integer_or_error: INTEGER is
      do
	 to_integer_error;
      end;

   collect_c_tmp is
      do
         if arguments /= Void then
            arguments.collect_c_tmp;
         end;
      end;

   compile_to_c is
      do
	 if type.is_reference then
	    cpp.put_string(once "((T0*)");
	 end;
	 mapping_c_target(type);
	 if type.is_reference then
	    cpp.put_character(')');
	 end;
      end;

   stupid_switch(r: ARRAY[RUN_CLASS]): BOOLEAN is
      do
	 Result := true;
      end;

   compile_target_to_jvm, compile_to_jvm is
      do
         compile_to_jvm0(type);
	 if run_feature /= Void then
	    jvm.inside_create_instruction(run_feature,call);
	 end;
         type.jvm_check_class_invariant;
      end;

   compile_to_jvm_into(dest: E_TYPE): INTEGER is
      do
         Result := standard_compile_to_jvm_into(dest);
      end;

   jvm_assign is
      do
      end;

   jvm_branch_if_false: INTEGER is
      do
      end;

   jvm_branch_if_true: INTEGER is
      do
      end;

   bracketed_pretty_print, pretty_print is
      local
	 semi_colon_flag: BOOLEAN;
      do
         fmt.keyword(fz_create);
	 fmt.put_character('{');
	 type.pretty_print;
	 fmt.put_character('}');
	 if call /= Void then
	    fmt.put_character('.');
	    semi_colon_flag := fmt.semi_colon_flag;
	    fmt.set_semi_colon_flag(false);
	    call.pretty_print;
	    fmt.set_semi_colon_flag(semi_colon_flag);
	 end;
      end;

   print_as_target is
      do
         fmt.put_character('(');
         pretty_print;
         fmt.put_character(')');
         fmt.put_character('.');
      end;

   precedence: INTEGER is
      do
         Result := atomic_precedence;
      end;

   short is
      do
         short_print.hook_or(once "create_open",once "create {");
	 type.short
         short_print.hook_or(once "create_close",once "}");
	 if call /= Void then
	    call.short;
	 end;
      end;

   short_target is
      do
         bracketed_short;
         short_print.a_dot;
      end;

feature {NONE}

   se_tmp_buffer: STRING is
      once
	 !!Result.make(64);
      end;

   make(sp: like start_position; t: like type; c: like call) is
      require
         not sp.is_unknown;
         t /= Void;
      do
         start_position := sp;
         type := t;
         call := c;
      ensure
         start_position = sp;
         type = t;
         call = c;
      end;

invariant

   type /= Void;

   writable = Void;

end -- CREATE_EXPRESSION
