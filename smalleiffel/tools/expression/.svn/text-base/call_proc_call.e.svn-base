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
deferred class CALL_PROC_CALL
   --
   -- Common root for CALL and PROC_CALL.
   --

inherit GLOBALS;

feature {CALL_PROC_CALL}

   current_type: E_TYPE;
	 -- Non Void when runnable and checked in `ct' context.

   debug_info: STRING;
	 -- For debug only.

   debug_info_update is
      local
	 i: INTEGER; e: EXPRESSION; t: E_TYPE;
      do
	 check debug_info = Void end;
	 create debug_info.make(32);
	 debug_info.append("ct:");
	 current_type.debug_info_in(debug_info);
	 debug_info.extend(' ');
	 debug_info.extend('{');
	 target.result_type.debug_info_in(debug_info)
	 debug_info.extend('}');
	 debug_info.extend('.');
	 debug_info.append(feature_name.to_string);
	 if arguments /= Void then
	    debug_info.extend('(');
	    from
	       i := 1;
	    until
	       i > arguments.count
	    loop
	       e := arguments.expression(i);
	       t := e.result_type;
	       t.debug_info_in(debug_info);
	       i := i + 1;
	       if i <= arguments.count then debug_info.extend(',') end;
	    end;
	    debug_info.extend(')');
	 end;
	 if run_feature /= Void then
	    debug_info.append(" rf: ");
	    run_feature.debug_info_in(debug_info);
	 end;
      end;

feature

   target: EXPRESSION;
         -- Target of the call.

   feature_name: FEATURE_NAME;
         -- Written selector name of the call.

feature -- Common deferred:

   run_feature: RUN_FEATURE is
         -- Non void when runnable if any `run_feature'.
      deferred
      end;

   arguments: EFFECTIVE_ARG_LIST is
         -- Arguments of the call if any.
      deferred
      ensure
         Result = Void or else Result.count > 0
      end;

   arg_count: INTEGER is
         -- The `arguments' count or 0.
      deferred
      ensure
         Result >= 0
      end;

feature -- Common frozen:

   frozen collect_c_tmp is
      do
         if run_feature /= Void then
            run_feature.collect_c_tmp;
         end;
         target.collect_c_tmp;
         if arguments /= Void then
            arguments.collect_c_tmp;
         end;
      end;

   frozen start_position: POSITION is
      do
         Result := feature_name.start_position;
      end;

   use_current, frozen standard_use_current: BOOLEAN is
      do
         if arg_count > 0 then
            Result := arguments.use_current;
         end;
         if Result then
         elseif target.is_current then
	    if small_eiffel.top_rf /= run_feature then
	       Result := run_feature.use_current;
	    end;
         else
            Result := target.use_current;
         end;
      end;

feature

   frozen afd_check is
      local
         rc: RUN_CLASS; running: ARRAY[RUN_CLASS];
      do
         if run_feature /= Void then
            rc := target.result_type.run_class;
            running := rc.running;
            if running = Void then
            elseif running.count > 1 then
               switch_collection.update(target,run_feature);
            end;
         end;
         target.afd_check;
         if arg_count > 0 then
            arguments.afd_check;
         end;
      end;

feature {RUN_FEATURE_3,RUN_FEATURE_4}

   finalize is
         -- For inlining of direct calls on an attribute.
      require
         ace.boost;
         small_eiffel.is_ready;
         run_feature.run_class.running.count = 1
      deferred
      ensure
         run_feature.run_class.at_run_time
      end;

feature {NONE}

   frozen call_proc_call_c2c is
      do
         cpp.put_cpc(Current);
      end;

   frozen call_proc_call_c2jvm is
      do
         jvm.call_proc_call_mapping(Current);
      end;

   frozen runnable_target(ct: E_TYPE) is
      require
         ct.run_type = ct
      local
	 t: like target;
      do
         t := target.to_runnable(ct);
         if t = Void then
            eh.add_position(target.start_position);
            fatal_error("Bad target.");
         end;
	 target := t;
      end;

   frozen runnable_arguments(ct: E_TYPE) is
      require
         ct.run_type = ct
      local
	 a: like arguments;
      do
         a := arguments.to_runnable(ct);
         if a = Void then
            eh.add_position(arguments.start_position);
            fatal_error(fz_bad_argument);
         end;
	 arguments := a;
      end;

   frozen run_feature_for(ct: E_TYPE) is
      require
         ct.run_type = ct
      local
         rf: RUN_FEATURE; rc: RUN_CLASS; rt: E_TYPE; bc: BASE_CLASS;
      do
         rt := target.result_type;
         if rt /= Void then
            rc := rt.run_class;
            if rc /= Void then
               bc := rc.base_class;
               rf := bc.run_feature_for(rc,target,feature_name,ct);
            end;
         end;
         if rf = Void then
            eh.add_position(feature_name.start_position);
            eh.append("Bad target for this call.");
            eh.print_as_fatal_error;
         end;
	 run_feature := rf;
      end;

   frozen call_proc_call_stupid_switch(r: ARRAY[RUN_CLASS]): BOOLEAN is
      local
	 tr: ARRAY[RUN_CLASS];
      do
         if arguments = Void then
            Result := true;
         else
            Result := arguments.stupid_switch(r);
         end;
         if Result then
            if target.is_current then
               if small_eiffel.same_base_feature(run_feature,r) then
                  Result := run_feature.stupid_switch(r) /= Void;
               else
                  Result := false;
               end;
            else
               Result := target.stupid_switch(r);
	       if Result then
		  if run_feature /= Void then
		     tr := run_feature.current_type.run_class.running;
		     if tr /= Void and then tr.count > 1 then
			Result := small_eiffel.same_base_feature(run_feature,tr);
		     end;
		  end;
	       end;
            end;
         end;
      end;

invariant

   target /= Void;

   feature_name /= Void;

end -- CALL_PROC_CALL
