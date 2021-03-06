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
deferred class CREATE_TOOLS
--
-- Common root for OLD_CREATION, CREATE_INSTRUCTION and CREATE_EXPRESSION
--

inherit GLOBALS;

feature

   frozen afd_check is
      local
	 args: like arguments;
      do
	 args := arguments;
	 if args /= Void then
	    args.afd_check;
	 end;
      end;

feature {NONE}

   start_position: POSITION;

   type: E_TYPE;
         -- Explicit optional generator name if any.

   writable: EXPRESSION;
         -- If any, the target of the creation call.

   call: PROC_CALL;
         -- Optional initialisation call if any. (The target of `call' is
         -- the `writable' entity.)

   run_feature: RUN_FEATURE;
         -- When checked, if any, the only one corresponding creation
         -- procedure.

   current_type: E_TYPE;
         -- Not Void when checked in this context.

   check_create_clause(t: E_TYPE) is
	 -- Where `t' is the TYPE to create.
      require
         t.is_run_type
      local
         fn: FEATURE_NAME; bottom, top: BASE_CLASS; args: like arguments;
	 arg_count: INTEGER; w: like writable; rc: RUN_CLASS;
      do
	 rc := t.run_class;
	 if call = Void then
	    run_feature := rc.a_default_create;
	    if run_feature /= Void then
	    elseif t.base_class.has_creation_clause then
	       eh.append("Creation clause exists for ");
	       eh.add_type(t,". ");
	       error(start_position,"You must use a constructor.");
	    end;
	 else
	    fn := call.feature_name;
	    top := fn.start_position.base_class;
	    bottom := t.base_class;
	    if t.is_like_current then
	       check
		  bottom = top or else bottom.is_subclass_of(top)
	       end;
	       fn := bottom.new_name_of(top,fn);
	       if fn = Void then
		  fn := call.feature_name;
		  eh.feature_not_found(fn);
		  eh.append(" Type to create is %"");
		  eh.append(t.run_time_mark);
		  fatal_error(fz_03);
	       end;
	    end;
	    run_feature := rc.get_feature(fn);
	    if run_feature = Void then
	       cp_not_found(fn);
	    end;
	    if small_eiffel.short_flag then
	    elseif not rc.base_class.has_creation(fn) then
	       eh.add_position(call.feature_name.start_position);
	       eh.add_position(fn.start_position);
	       eh.append(fn.to_string);
	       eh.append(" is not in the creation list of ");
	       eh.add_type(t,fz_dot_blank);
	       eh.print_as_fatal_error;
	    end;
	    run_feature.run_class.add_client(current_type.run_class);
	    if run_feature.result_type /= Void then
	       eh.add_position(run_feature.start_position);
	       eh.add_position(fn.start_position);
	       fatal_error(fz_ffinap);
	    end;
	    arg_count := arguments_count;
	    if arg_count > 0 then
	       args := arguments.to_runnable(current_type);
	       if args = Void then
		  error(call.arguments.start_position,fz_bad_arguments);
	       end;
	    end;
	    small_eiffel.argument_passing_check(call.start_position,
						args,run_feature);
	    w := writable;
	    if w = Void then
	       w := call.target;
	    end;
	    call := call.runnable_create(current_type,w,args,run_feature);
	 end;
      end;

   arguments: EFFECTIVE_ARG_LIST is
      do
	 if call /= Void then
	    Result := call.arguments;
	 end;
      end;

   arguments_count: INTEGER is
      do
         if call /= Void then
            Result := call.arg_count;
         end;
      end;

   cp_not_found(fn: FEATURE_NAME) is
      do
         eh.add_position(call.feature_name.start_position);
         eh.add_position(fn.start_position);
         fatal_error("Creation procedure not found.");
      end;

   check_created_type(t: E_TYPE) is
      require
         t.is_run_type
      local
         rt: like t;
      do
         rt := t.run_type;
         if small_eiffel.short_flag then
         elseif rt.base_class.is_deferred then
            eh.add_type(rt," is deferred. ");
            warning(start_position,"Cannot create object.");
         end;
         if t.is_formal_generic then
            eh.add_position(start_position);
            eh.append("Creation call on formal generic type (");
            eh.add_type(t,").");
            eh.print_as_fatal_error;
         end;
         rt.run_class.set_at_run_time;
      end;

   check_explicit_type is
      require
	 type /= Void
      local
         t: E_TYPE;
      do
         t := type.to_runnable(current_type);
         if t = Void or else not t.is_run_type then
            eh.add_position(type.start_position);
            fatal_error("Invalid explicit type.");
         else
            type := t;
         end;
	 if writable /= Void then
	    if not type.is_a(writable.result_type) then
	       fatal_error(" Bad explicit type mark.");
	    end;
	 end;
      end;

   compile_to_jvm0(t: E_TYPE) is
         -- Push the new object with default initialization.
      require
         t /= Void
      local
         dummy: INTEGER;
      do
         if t.is_reference then
            t.run_class.jvm_basic_new;
         else
            dummy := t.jvm_push_default;
         end;
      end;

invariant

   not start_position.is_unknown;

end -- CREATE_TOOLS
