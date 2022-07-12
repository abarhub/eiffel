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
class AGENT_EXPRESSION
   --
   -- Some agent is called using the `item' notation.
   --


inherit CALL_PROC_CALL; EXPRESSION;

creation {CALL_1_C} make

feature

   is_current: BOOLEAN is false;

   is_void: BOOLEAN is false;

   c_simple: BOOLEAN is false;

   can_be_dropped: BOOLEAN is false;

   is_manifest_string: BOOLEAN is false;

   is_static: BOOLEAN is false;

   is_pre_computable: BOOLEAN is false;

   is_result: BOOLEAN is false;

   is_writable: BOOLEAN is false;

   arg_count: INTEGER is 1;

   result_type: E_TYPE is
      do
	 Result := run_feature.result_type;
      end;

   start_lookup_class: BASE_CLASS is do end;

   stupid_switch(r: ARRAY[RUN_CLASS]): BOOLEAN is
      do
	 check false end;
      end;

   to_runnable(ct: E_TYPE): EXPRESSION is
      do
	 Result := creator.to_runnable(ct);
      end;

   compile_to_c is
      do
	 agent_args.c_agent_definition_call(target);
      end;

   mapping_c_arg(formal_arg_type: E_TYPE) is
      do
	 not_yet_implemented;
      end;

   mapping_c_target(formal_type: E_TYPE) is
      do
	 not_yet_implemented;
      end;

   c_frame_descriptor(format, locals: STRING) is do end;

   assertion_check(tag: CHARACTER) is do end;

   to_integer_or_error: INTEGER is
      do
	 to_integer_error;
      end;

   static_value: INTEGER is
      do
	 check false end;
      end;

   isa_dca_inline_argument: INTEGER is 0;

   dca_inline_argument(formal_arg_type: E_TYPE) is
      do
	 check false end;
      end;

   compile_to_jvm is
      do
	 agent_args.jvm_agent_definition_call(target);
      end;

   compile_to_jvm_into(dest: E_TYPE): INTEGER is
      do
	 not_yet_implemented;
      end;

   jvm_branch_if_true: INTEGER is
      do
	 check false end;
      end;

   jvm_branch_if_false: INTEGER is
      do
	 check false end;
      end;

   compile_target_to_jvm is
      do
	 not_yet_implemented;
      end;

   jvm_assign is
      do
	 check false end;
      end;

   precedence: INTEGER is
      do
         Result := atomic_precedence;
      end;

   short is
      do
	 not_yet_implemented;
      end;

   short_target is
      do
	 not_yet_implemented;
      end;

   pretty_print is
      do
	 creator.pretty_print;
      end;

   bracketed_pretty_print is
      do
	 fmt.put_character('(');
         pretty_print;
         fmt.put_character(')');
      end;

   print_as_target is
      do
	 fmt.put_character('(');
         pretty_print;
         fmt.put_character(')');
         fmt.put_character('.');
      end;

feature {NONE}

   creator: CALL_1_C;
	 -- The `creator' of `Current'.

   arguments: EFFECTIVE_ARG_LIST;

   run_feature: RUN_FEATURE;

   agent_args: AGENT_ARGS;
	 -- Computed using `feature_name' and `aguments'.

   make(c: like creator) is
      require
	 c.target /= Void;
	 c.feature_name.to_string = as_item;
	 c.run_feature.result_type /= Void
      do
	 creator := c;
	 target := creator.target;
	 feature_name := creator.feature_name;
	 arguments := creator.arguments;
	 run_feature := creator.run_feature;
	 agent_args := agent_pool.register_agent_call(arguments,run_feature);
      ensure
	 creator = c;
	 target = creator.target;
	 feature_name = creator.feature_name;
	 arguments = creator.arguments;
	 run_feature = creator.run_feature
      end;

end -- AGENT_EXPRESSION
