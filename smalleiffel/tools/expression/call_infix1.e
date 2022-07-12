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
deferred class CALL_INFIX1

inherit CALL_INFIX;

feature

   run_feature: RUN_FEATURE;

   frozen result_type: E_TYPE is
      local
         tla: TYPE_LIKE_ARGUMENT;
      do
         Result := run_feature.result_type;
         if Result.is_like_current then
            Result := run_feature.current_type;
         else
            tla ?= Result;
            if tla /= Void then
               Result := arg1.result_type.run_type;
            end;
         end;
      end;

   frozen to_runnable(ct: E_TYPE): like Current is
      local
         argument_type, target_type: E_TYPE;
      do
	 if current_type = Void then
	    current_type := ct;
	    runnable_target(ct);
	    runnable_arguments(ct);
	    target_type := target.result_type;
	    argument_type := arg1.result_type;
	    if argument_type.is_real then
	       if target_type.is_integer then
		  target := assignment_handler.implicit_cast(target,
							     argument_type);
	       end;
	    elseif argument_type.is_double then
	       if target_type.is_integer or else target_type.is_real then
		  target := assignment_handler.implicit_cast(target,
							     argument_type);
	       end;
	    end;
	    run_feature_for(ct);
	    Result := Current;
	    debug debug_info_update end;
	    run_feature_match;
	 else
	    create Result.with(target,feature_name,arguments);
	    Result := Result.to_runnable(ct);
	 end;
      end;

   frozen assertion_check(tag: CHARACTER) is
      do
         if tag = 'R' then
            run_feature.vape_check_from(start_position);
         end;
         target.assertion_check(tag);
         arg1.assertion_check(tag);
      end;

   frozen static_value: INTEGER is
      do
         Result := static_value_mem;
      end;

feature {RUN_FEATURE_3,RUN_FEATURE_4}

   finalize is
      local
         rc: RUN_CLASS; rf: RUN_FEATURE;
      do
         rf := run_feature;
         rc := rf.run_class;
         run_feature := rc.running.first.dynamic(rf);
      end;

feature {NONE}

   frozen with(t: like target; fn: like feature_name; a: like arguments) is
      require
         t /= Void;
         fn /= Void;
         a.count = 1;
      do
         target := t;
         feature_name := fn;
         arguments := a;
      ensure
         target = t;
         feature_name = fn;
         arguments = a;
      end;

   static_value_mem: INTEGER;

   frozen call_is_static: BOOLEAN is
      local
         rc: RUN_CLASS; running: ARRAY[RUN_CLASS]; rf: like run_feature;
      do
         if run_feature /= Void then
            rc := run_feature.run_class;
            if rc /= Void then
               running := rc.running;
               if running /= Void and then running.count = 1 then
                  rf := running.first.dynamic(run_feature);
                  if rf.is_static then
                     static_value_mem := rf.static_value_mem;
                     Result := true;
                  end;
               end;
            end;
         end;
      end;

end -- CALL_INFIX1

