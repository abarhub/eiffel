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
class PROC_CALL_1
   --
   -- For a procedure call with only one argument.
   --

inherit PROC_CALL redefine use_current end;

creation make

feature

   arguments: EFFECTIVE_ARG_LIST;

   arg_count: INTEGER is 1;

   arg1: EXPRESSION is
      do
         Result := arguments.first;
      end;

   to_runnable(ct: E_TYPE): INSTRUCTION is
      local
	 type_of_agent: TYPE_OF_AGENT;
      do
	 if current_type = Void then
	    current_type := ct;
	    runnable_target(ct);
	    run_feature_for(ct);
	    type_of_agent ?= run_feature.current_type;
	    if type_of_agent /= Void then
	       arguments := arguments.tuple_substitution;
	    end;
	    runnable_arguments(ct);
	    debug debug_info_update end;
	    if type_of_agent /= Void then
	       create {AGENT_INSTRUCTION} Result.make(Current);
	    else
	       run_feature_match;
	       Result := Current;
	    end;
	 else
	    create {PROC_CALL_1} Result.make(target,feature_name,arguments);
	    Result := Result.to_runnable(ct);
	 end;
      end;

   compile_to_jvm is
      do
         if as_c_inline_c = feature_name.to_string then
            eh.add_position(start_position);
            fatal_error(
               "Cannot use %"c_inline_c%" to produce Java byte code.");
         else
            call_proc_call_c2jvm;
         end;
      end;

   use_current: BOOLEAN is
      local
         ms: MANIFEST_STRING;
         s: STRING;
      do
         if as_c_inline_c = feature_name.to_string then
            ms ?= arg1;
            if ms /= Void then
               s := ms.to_string;
               Result := s.has('C');
            end;
         else
            Result := standard_use_current;
         end;
      end;

   pretty_print is
      do
         target.print_as_target;
         fmt.put_string(feature_name.to_string);
         fmt.put_character('(');
         arg1.pretty_print;
         fmt.put_character(')');
         if fmt.semi_colon_flag then
            fmt.put_character(';');
         end;
      end;

feature {CREATE_TOOLS,PROC_CALL}

   runnable_create(ct: E_TYPE; w: like target; a: like arguments;
		   rf: RUN_FEATURE): like Current is
      do
	 if current_type = Void then
	    current_type := ct;
            target := w;
            arguments := a;
            run_feature := rf;
            Result := Current;
	    debug debug_info_update end;
         else
            create Result.make(target,feature_name,arguments);
            Result := Result.runnable_create(ct,w,a,rf);
         end;
      end;

feature {NONE}

   make(t: like target; fn: like feature_name; a: like arguments) is
      require
         t /= Void;
         fn /= Void;
         a /= Void;
      do
         target := t;
         feature_name := fn;
         arguments := a;
      ensure
         target = t;
         feature_name = fn;
         arguments = a;
      end;

   run_feature_match is
      do
         run_feature_has_no_result;
	 small_eiffel.argument_passing_check(feature_name.start_position,
					     arguments,run_feature);
      end;

invariant

   arguments.count = 1

end -- PROC_CALL_1

