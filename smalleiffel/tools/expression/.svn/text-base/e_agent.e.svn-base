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
class E_AGENT
   --
   -- An agent definition: agent foo("bar",?)
   --

inherit EXPRESSION;

creation make

feature

   start_position: POSITION;
         -- Of the "agent" keyword.

   is_current: BOOLEAN is false;

   isa_dca_inline_argument: INTEGER is 0;

   dca_inline_argument(formal_arg_type: E_TYPE) is do end;

   start_lookup_class: BASE_CLASS is do end;

   is_pre_computable: BOOLEAN is false;

   to_integer_or_error: INTEGER is
      do
	 to_integer_error;
      end;

   to_runnable(ct: E_TYPE): like Current is
      local
         rc: RUN_CLASS; rt, rfrt: E_TYPE; bc: BASE_CLASS;
	 types: ARRAY[E_TYPE]; i: INTEGER; fal: FORMAL_ARG_LIST;
      do
	 if current_type = Void then
	    current_type := ct;
	    feature_name := call.feature_name;
	    if base /= Void then
	       rt := base.to_runnable(ct);
	       if rt = Void then
		  eh.add_position(base.start_position);
		  eh.append("Bad BASE type for agent.");
		  eh.print_as_fatal_error;
	       end;
	       create {FACE_TARGET} target.make(rt);
	    else
	       check target = Void end;
	       target := call.target.to_runnable(ct);
	       if target = Void then
		  eh.add_position(call.target.start_position);
		  eh.append("Bad target for agent definition.");
		  eh.print_as_fatal_error;
	       end;
	    end;
	    check target /= Void end;
	    rt := target.result_type;
	    rc := rt.run_class;
	    if rc /= Void then
	       bc := rc.base_class;
	       run_feature := bc.run_feature_for(rc,target,
						 call.feature_name,ct);
	    end;
	    arguments := call.arguments;
	    fal := run_feature.arguments;
	    if fal /= Void then
	       if arguments = Void then
		  -- Creating the ommited open argument list:
		  arguments := fal.open_args(feature_name.start_position);
	       end;
	    end;
	    if arguments /= Void then
	       arguments := arguments.open_operands_notify(Current,
							   run_feature);
	       arguments := arguments.to_runnable(ct);
	       if arguments = Void then
		  eh.add_position(call.arguments.start_position);
		  eh.append("Bad arguments for agent definition.");
		  eh.print_as_fatal_error;
	       end;
	    end;
	    --
	    small_eiffel.argument_passing_check(call.start_position,
						arguments,run_feature);
	    -- Computing `result_type':
	    if base /= Void then
	       create types.with_capacity(4,1);
	       types.add_last(base);
	    end;
	    if open_args /= Void then
	       if types = Void then
		  create types.with_capacity(4,1);
	       end;
	       from
		  i := open_args.lower;
	       until
		  i > open_args.upper
	       loop
		  types.add_last(open_args.item(i).result_type);
		  i := i + 1;
	       end;
	    end;
	    create open_tuple.make(start_position,types);
	    rfrt := run_feature.result_type;
	    if rfrt = Void then
	       create {TYPE_PROCEDURE}
                      result_type.make(start_position,rt,open_tuple);
	    else
	       create {TYPE_FUNCTION}
                      result_type.make(start_position,rt,open_tuple,rfrt);
	    end;
	    result_type := result_type.to_runnable(ct);
	    check result_type = result_type.run_type end;
	    se_agent_id := agent_pool.register(Current);
	    -- Computing `definition_function_name':
	    create definition_function_name.make(16);
	    definition_function_name.append(as_agent);
	    se_agent_id.append_in(definition_function_name);
	    -- Computing `execution_function_name':
	    create execution_function_name.make(16);
	    execution_function_name.extend('_');
	    execution_function_name.append(definition_function_name);
	    -- Finally:
	    result_type.run_class.set_at_run_time
	    Result := Current;
	 else
	    create Result.make(start_position,base,call);
	    Result := Result.to_runnable(ct);
	 end;
      end;

   result_type: E_TYPE;

   is_void: BOOLEAN is false;

   is_writable: BOOLEAN is false;

   c_simple: BOOLEAN is false;

   can_be_dropped: BOOLEAN is false;

   is_manifest_string: BOOLEAN is false;

   is_static: BOOLEAN is false;

   is_result: BOOLEAN is false;

   stupid_switch(r: ARRAY[RUN_CLASS]): BOOLEAN is
      do
      end;

   afd_check is
      local
         rc: RUN_CLASS; running: ARRAY[RUN_CLASS];
      do
	 rc := target.result_type.run_class;
	 running := rc.running;
	 if running = Void then
	 elseif running.count > 1 then
	    switch_collection.update(target,run_feature);
	 end;
         target.afd_check;
         if arguments /= Void then
            arguments.afd_check;
         end;
      end;

   collect_c_tmp is
      do
	 run_feature.collect_c_tmp;
         target.collect_c_tmp;
         if arguments /= Void then
            arguments.collect_c_tmp;
         end;
      end;

   compile_to_c is
      local
	 i: INTEGER; boost, need_comma: BOOLEAN; e: EXPRESSION;
      do
	 cpp.put_string(definition_function_name);
	 cpp.put_character('(');
	 boost := ace.boost;
	 if not boost then
	    cpp.put_string(once "&ds");
	    need_comma := true;
	 end;
	 if base = Void then
	    if need_comma then cpp.put_character(',') end;
	    target.mapping_c_arg(target.result_type);
	    need_comma := true;
	 end;
	 if arguments /= Void then
	    from i := 1 until i > arguments.count
	    loop
	       if is_closed_argument(i) then
		  if need_comma then
		     cpp.put_character(',')
		     need_comma := true;
		  end;
		  e := arguments.expression(i);
		  e.mapping_c_arg(e.result_type);
	       end;
	       i := i + 1;
	    end;
	 end;
	 cpp.put_character(')');
      end;

   mapping_c_target(formal_type: E_TYPE) is
      do
	 compile_to_c;
      end;

   mapping_c_arg(formal_arg_type: E_TYPE) is
      do
	 compile_to_c;
      end;

   use_current: BOOLEAN is
      do
	 if arguments /= Void then
	    Result := arguments.use_current;
	 end;
	 if not Result then
	    Result := target.is_current;
	 end;
      end;

   c_frame_descriptor(format, locals: STRING) is
      do
	 not_yet_implemented;
      end;

   assertion_check(tag: CHARACTER) is
      do
	 not_yet_implemented;
      end;

   static_value: INTEGER is
      do
	 check false end;
      end;

   bracketed_pretty_print, pretty_print is
      do
	 fmt.keyword(once "agent");
	 if base /= void then
	    fmt.put_character('{');
	    base.pretty_print;
	    fmt.put_character('}');
	    fmt.put_character('.');
	 end;
	 call.pretty_print;
      end;

   print_as_target is
      do
         fmt.put_character('(');
         pretty_print;
         fmt.put_character(')');
         fmt.put_character('.');
      end;

   short, short_target is
      do
	 not_yet_implemented;
      end;

   precedence: INTEGER is
      do
         Result := atomic_precedence;
      end;

   jvm_assign is
      do
	 check false end;
      end;

   compile_to_jvm_into(dest: E_TYPE): INTEGER is
      do
	 compile_to_jvm;
	 Result := 1;
      end;

   compile_target_to_jvm, compile_to_jvm is
      local
	 ca : CODE_ATTRIBUTE;
	 cp : CONSTANT_POOL;
	 class_name, variable, descripteur: STRING;
	 idx_agent: INTEGER;
	 arg_courant: EXPRESSION;
	 i,place: INTEGER;
      do
	 ca := code_attribute;
	 cp := constant_pool;
	 class_name := once "....";
	 class_name.clear;
	 class_name.append(ace.executable_name);
	 class_name.append(once "/_agent");
	 se_agent_id.append_in(class_name);
	 idx_agent := cp.idx_class2(class_name);
	 ca.opcode_new(idx_agent);
	 ca.opcode_dup;
         ca.opcode_invokespecial(cp.idx_methodref1(idx_agent,fz_35,fz_29),-1);
	 from
	    i := 1;
	 until
	    i = arguments.count
	 loop
	    if is_closed_argument(i) then
	       ca.opcode_dup;
	       arg_courant := arguments.expression(i);
	       arg_courant.compile_to_jvm;
	       descripteur := once "....";
	       descripteur.clear;
	       arg_courant.result_type.jvm_descriptor_in(descripteur);
	       place := arg_courant.result_type.jvm_stack_space;
	       variable := once "a....";
	       variable.clear;
	       variable.extend('a');
	       i.append_in(variable);
	       ca.opcode_putfield(cp.idx_fieldref3(class_name,variable,descripteur),place);
	     end;
	     i := i + 1;
	  end;
       end;

   jvm_branch_if_false: INTEGER is
      do
	 not_yet_implemented;
      end;

   jvm_branch_if_true: INTEGER is
      do
	 not_yet_implemented;
      end;

feature {AGENT_POOL}

   falling_down is
      do
	 switch_collection.update_with(run_feature);
      end;

   c_define_type_1(boost: BOOLEAN) is
      require
	 cpp.on_h; boost = ace.boost
      local
	 i, id: INTEGER; t: E_TYPE;
      do
	 id := se_agent_id;
	 buffer.clear;
	 buffer.append(once "typedef struct _se_agent");
	 id.append_in(buffer);
	 buffer.append(once " se_agent");
	 id.append_in(buffer);
	 buffer.append(once ";%Nstruct _se_agent");
	 id.append_in(buffer);
	 buffer.extend('{');
	 if not boost then
	    buffer.append(once "Tid id;")
	 end;
	 t := run_feature.result_type;
	 if t = void then
	    buffer.append(fz_void);
	 else
	    t.c_type_for_result_in(buffer);
	 end;
	 buffer.append(once "(*afp)(");
	 if not boost then buffer.append(once "se_dump_stack*,") end;
	 buffer.append(once "se_agent");
	 id.append_in(buffer);
	 buffer.extend('*');
	 if base /= Void then
	    buffer.extend(',');
	    t := run_feature.current_type;
	    t.c_type_for_result_in(buffer);
	 end;
	 if open_args /= Void then
	    from i := 1; until i > arguments.count
	    loop
	       if not is_closed_argument(i) then
		  buffer.extend(',');
		  t := arguments.expression(i).result_type;
		  t.c_type_for_result_in(buffer);
	       end;
	       i := i + 1;
	    end;
	 end;
	 buffer.append(once ");");
	 if base = Void then
	    t := run_feature.current_type;
	    t.c_type_for_argument_in(buffer);
	    buffer.append(once " C;");
	 end;
	 if arguments /= Void then
	    from
	       i := 1;
	    until
	       i > arguments.count
	    loop
	       if is_closed_argument(i) then
		  t := arguments.expression(i).result_type;
		  t.c_type_for_argument_in(buffer);
		  buffer.append(once " a");
		  i.append_in(buffer);
		  buffer.extend(';');
	       end;
	       i := i + 1;
	    end;
	 end;
	 buffer.append(once "};%N");
	 cpp.put_string(buffer);
      ensure
	 cpp.on_h
      end;

   c_define_type_2 is
      require
	 cpp.on_h
      local
	 id: INTEGER;
      do
	 id := se_agent_id;
	 cpp.put_string(once "se_agent");
	 cpp.put_integer(id);
	 cpp.put_character(' ');
	 cpp.put_character('u');
	 cpp.put_integer(id);
	 cpp.put_character(';');
      ensure
	 cpp.on_h
      end;

   c_define_function(boost: BOOLEAN) is
      require
	 cpp.on_c; boost = ace.boost
      local
	 t, rt: E_TYPE; i, id: INTEGER;
      do
	 id := se_agent_id;
	 -- The local execution function:
	 buffer.clear;
	 buffer.append(once "%Nstatic ");
	 t := run_feature.result_type;
	 if t /= Void then
	    t.c_type_for_result_in(buffer);
	 else
	    buffer.append(fz_void);
	 end;
	 buffer.extend(' ');
	 buffer.append(execution_function_name);
	 buffer.extend('(');
	 if not boost then
	    buffer.append(once "se_dump_stack*caller,");
	 end;
	 buffer.append(once "se_agent");
	 id.append_in(buffer);
	 buffer.extend('*');
	 buffer.extend('u');
	 if base /= Void then
	    buffer.extend(',');
	    t := run_feature.current_type;
	    t.c_type_for_result_in(buffer);
	    buffer.extend(' ');
	    buffer.extend('C');
	 end;
	 if open_args /= Void then
	    from i := 1; until i > arguments.count
	    loop
	       if not is_closed_argument(i) then
		  buffer.extend(',');
		  t := arguments.expression(i).result_type;
		  t.c_type_for_result_in(buffer);
		  buffer.extend(' ');
		  buffer.extend('a');
		  i.append_in(buffer);
	       end;
	       i := i + 1;
	    end;
	 end;
	 buffer.append(once "){%N");
	 if base = Void then
	    t := target.result_type;
	    t.c_type_for_argument_in(buffer);
	    buffer.append(once " C=u->C;%N");
	 end;
	 if arguments /= Void then
	    from
	       i := 1; until i > arguments.count
	    loop
	       if is_closed_argument(i) then
		  t := arguments.expression(i).result_type;
		  t.c_type_for_argument_in(buffer);
		  buffer.extend(' ');
		  buffer.extend('a');
		  i.append_in(buffer);
		  buffer.append(once "=u->a");
		  i.append_in(buffer);
		  buffer.extend(';');
		  buffer.extend('%N');
	       end;
	       i := i + 1;
	    end;
	 end;
	 cpp.put_string(buffer);
         if not boost then
            cpp.put_string(once "se_frame_descriptor fd=%
			   %{%"agent call wrapper 2%",0,0,%"%",1};%N%
		           %se_dump_stack ds;%N%
			   %ds.fd=&fd;%Nds.p=0;%N%
                           %ds.caller=caller;%N");
         end;
	 -- Calling the actual one:
	 create e_agent_call.make(Current,run_feature);
	 rt := run_feature.result_type;
	 if rt /= Void then
	    cpp.put_string(once "return ");
	 end;
	 cpp.put_cpc(e_agent_call);
	 if rt /= Void then
	    cpp.put_character(';');
	 end;
	 cpp.put_character('}');
	 -- The definition function:
	 buffer.clear;
	 buffer.append(once "/*agent*/T0*");
	 buffer.append(definition_function_name);
	 buffer.extend('(');
	 if not boost then
	    buffer.append(once "se_dump_stack*caller");
	 end;
	 if base = Void then
	    if buffer.last /= '(' then buffer.extend(',') end;
	    t := target.result_type;
	    t.c_type_for_argument_in(buffer);
	    buffer.extend(' ');
	    buffer.extend('C');
	 end;
	 if arguments /= Void then
	    from
	       i := 1; until i > arguments.count
	    loop
	       if is_closed_argument(i) then
		  if buffer.last /= '(' then buffer.extend(',') end;
		  t := arguments.expression(i).result_type;
		  t.c_type_for_argument_in(buffer);
		  buffer.extend(' ');
		  buffer.extend('a');
		  i.append_in(buffer);
	       end;
	       i := i + 1;
	    end;
	 end;
	 if buffer.last = '(' then buffer.append(fz_void) end;
	 buffer.extend(')');
	 cpp.put_c_heading(buffer);
	 cpp.put_string(once "se_agent");
	 cpp.put_integer(id);
	 cpp.put_string(once "*u=(void*)new_agent(");
	 if not boost then
	    cpp.put_integer(result_type.id);
	 end;
	 cpp.put_string(once ");%Nu->");
	 cpp.put_string(once "afp=");
	 cpp.put_string(execution_function_name);
	 cpp.put_string(once ";%N");
	 if base = Void then
	    cpp.put_string(once "u->C=C;%N");
	 end;
	 if arguments /= Void then
	    from
	       i := 1;
	    until
	       i > arguments.count
	    loop
	       if is_closed_argument(i) then
		  cpp.put_string(once "u->a");
		  cpp.put_integer(i);
		  cpp.put_string(once "=a");
		  cpp.put_integer(i);
		  cpp.put_string(once ";%N");
	       end;
	       i := i + 1;
	    end;
	 end;
	 cpp.put_string(once "return ((T0*)u);}%N");
      ensure
	 cpp.on_c
      end;

feature {OPEN_OPERAND}

   register(open_operand: OPEN_OPERAND) is
      require
	 open_operand /= Void
      do
	 if open_args = Void then
	    create open_args.with_capacity(4);
	 end;
	 open_args.add_last(open_operand);
      end;

feature {JVM}

   base: E_TYPE;
	 -- When the target itself is an open operand.

   call: CALL;
	 -- The one provided by the eiffel_parser.

   current_type: E_TYPE;
	 -- Not Void when checked in this context.

   target: EXPRESSION;
	 -- Computed one using `base' and `call'.

   run_feature: RUN_FEATURE;
	 -- Computed one using `target' and `call'.

   feature_name: FEATURE_NAME;
	 -- Computed one using `call'.

   arguments: EFFECTIVE_ARG_LIST;
	 -- Computed one using the `call'.

   open_args: FIXED_ARRAY[OPEN_OPERAND];
	 -- Computed using `arguments' to store, if any, the list of open
	 -- arguments. -- (The `target' is never part of this list, see `base'.)

   se_agent_id: INTEGER;

   open_tuple: TYPE_TUPLE;

   definition_function_name: STRING;
	 -- The name of the definition function.

   execution_function_name: STRING;
	 -- The name of the execution function.

   e_agent_call: E_AGENT_CALL;
	 -- The face CALL_PROC_CALL.

   make(sp: like start_position; b: like base; c: like call) is
      require
	 not sp.is_unknown;
	 c /= Void
      do
	 start_position := sp;
	 base := b;
	 call := c;
      ensure
	 start_position = sp;
	 base = b;
	 call = c
      end;

   is_closed_argument(i: INTEGER): BOOLEAN is
	 -- Is the `i'th argument a closed argument?
      require
	 i.in_range(1,arguments.count)
      local
	 e: EXPRESSION; open_operand: OPEN_OPERAND;
      do
	 e := arguments.expression(i);
	 open_operand ?= e;
	 Result := open_operand = Void;
      end;

   buffer: STRING is
      once
	 create Result.make(512);
      end;

invariant

   call /= Void;

end -- E_AGENT
