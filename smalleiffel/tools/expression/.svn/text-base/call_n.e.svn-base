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
class CALL_N
   --
   -- For calls with more than one argument : "bar.foo(...)".
   -- For other calls, use CALL_0 or CALL_1.
   --

inherit CALL;

creation make

feature

   is_pre_computable: BOOLEAN is false;

   can_be_dropped: BOOLEAN is false;

   arguments: EFFECTIVE_ARG_LIST;

   run_feature: RUN_FEATURE;

   to_integer_or_error: INTEGER is
      do
	 to_integer_error;
      end;

   result_type: E_TYPE is
      local
         tla: TYPE_LIKE_ARGUMENT;
         e: EXPRESSION;
      do
         Result := run_feature.result_type;
         if Result.is_like_current then
            Result := run_feature.current_type;
         else
            tla ?= Result;
            if tla /= Void then
               e := arguments.expression(tla.rank);
               Result := e.result_type.run_type;
            end;
         end;
      end;

   precedence: INTEGER is
      do
         Result := dot_precedence;
      end;

   compile_to_c is
      do
         call_proc_call_c2c;
      end;

   isa_dca_inline_argument: INTEGER is
      do
      end;

   dca_inline_argument(formal_arg_type: E_TYPE) is
      do
      end;

   arg_count: INTEGER is
      do
         Result := arguments.count;
      end;

   to_runnable(ct: E_TYPE): like Current is
      do
	 if current_type = Void then
	    current_type := ct;
	    runnable_target(ct);
	    runnable_arguments(ct);
	    run_feature_for(ct);
	    Result := Current;
	    debug debug_info_update end;
	    run_feature_match;
	 else
	    create Result.make(target,feature_name,arguments);
	    Result := Result.to_runnable(ct);
	 end;
      end;

   bracketed_pretty_print, pretty_print is
      do
         target.print_as_target;
         fmt.put_string(feature_name.to_string);
         fmt.level_incr;
         arguments.pretty_print;
         fmt.level_decr;
      end;

   short is
      do
         target.short_target;
         run_feature.name.short;
         arguments.short;
      end;

   short_target is
      do
         short;
         short_print.a_dot;
      end;

   compile_to_jvm is
      do
         call_proc_call_c2jvm;
      end;

   jvm_branch_if_false: INTEGER is
      do
         Result := jvm_standard_branch_if_false;
      end;

   jvm_branch_if_true: INTEGER is
      do
         Result := jvm_standard_branch_if_true;
      end;

   assertion_check(tag: CHARACTER) is
      do
         if tag = 'R' then
            run_feature.vape_check_from(start_position);
         end;
         target.assertion_check(tag);
         arguments.assertion_check(tag);
      end;

   is_static: BOOLEAN is
      local
         running: ARRAY[RUN_CLASS];
         rf: like run_feature;
      do
         running := run_feature.run_class.running;
         if running /= Void and then running.count = 1 then
            rf := running.first.dynamic(run_feature);
            if rf.is_static then
               Result := true;
            end;
         end;
      end;

   static_value: INTEGER is
      local
         running: ARRAY[RUN_CLASS];
         rf: like run_feature;
      do
         running := run_feature.run_class.running;
         if running /= Void and then running.count = 1 then
            rf := running.first.dynamic(run_feature);
            if rf.is_static then
               Result := rf.static_value_mem;
            end;
         end;
      end;

feature {RUN_FEATURE_3,RUN_FEATURE_4}

   finalize is
      local
         rc: RUN_CLASS;
         rf: RUN_FEATURE;
      do
         rf := run_feature;
         rc := rf.run_class;
         run_feature := rc.running.first.dynamic(rf);
      end;

feature {NONE}

   make(t: like target; sn: like feature_name; a: like arguments) is
      require
         t /= Void;
         sn /= Void;
         a.count > 1;
      do
         target := t;
         feature_name := sn;
         arguments := a;
      ensure
         target = t;
         feature_name = sn;
         arguments = a
      end;

   run_feature_match is
      do
         run_feature_has_result;
	 small_eiffel.argument_passing_check(feature_name.start_position,
					     arguments,run_feature);
      end;

invariant

   arguments.count > 1;

end -- CALL_N

