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
class C_PRETTY_PRINTER
   --
   -- Singleton in charge of handling C code pretty printing.
   -- This singleton is shared via the GLOBALS.`cpp' once function.
   --

inherit CODE_PRINTER;

feature

   on_h: BOOLEAN is
      require
	 small_eiffel.is_ready
      do
	 Result := current_out = out_h;
      end;

   on_c: BOOLEAN is
      require
	 small_eiffel.is_ready
      do
	 Result := current_out = out_c;
      end;

   swap_on_c is
      do
	 current_out := out_c;
      ensure
	 on_c;
      end;

   swap_on_h is
      do
	 current_out := out_h;
      ensure
	 on_h;
      end;

   put_string_on_h(string: STRING) is
      do
	 out_h.put_string(string);
      end;

   put_extern1(decl: STRING) is
      do
	 out_h.put_string(fz_extern);
	 out_h.put_string(decl);
	 out_h.put_string(fz_00);
	 out_c.put_string(decl);
	 out_c.put_string(fz_00);
      end;

   put_extern2(decl: STRING; init: CHARACTER) is
      do
	 out_h.put_string(fz_extern);
	 out_h.put_string(decl);
	 out_h.put_string(fz_00);
	 out_c.put_string(decl);
	 out_c.put_character('=');
	 out_c.put_character(init);
	 out_c.put_string(fz_00);
      end;

   put_extern3(var, value: STRING) is
      do
	 out_c.put_string(once "char ");
	 out_c.put_string(var);
	 out_c.put_string(once "[]=%"");
	 out_c.put_string(value);
	 out_c.put_string(once "%";%N");
	 out_h.put_string(once "extern char ");
	 out_h.put_string(var);
	 out_h.put_character('[');
	 out_h.put_character(']');
	 out_h.put_string(fz_00);
      end;

   put_extern4(t, var: STRING; value: INTEGER) is
      do
	 out_c.put_string(t);
	 out_c.put_character(' ');
	 out_c.put_string(var);
	 out_c.put_character('[');
	 out_c.put_integer(value);
	 out_c.put_string(once "];%N");
	 out_h.put_string(fz_extern);
	 out_h.put_string(t);
	 out_h.put_character(' ');
	 out_h.put_string(var);
	 out_h.put_character('[');
	 out_h.put_character(']');
	 out_h.put_string(fz_00);
      end;

   put_extern5(decl: STRING; init: STRING) is
      do
	 out_h.put_string(fz_extern);
	 out_h.put_string(decl);
	 out_h.put_string(fz_00);
	 out_c.put_string(decl);
	 out_c.put_character('=');
	 out_c.put_string(init);
	 out_c.put_string(fz_00);
      end;

   put_extern6(decl: STRING; init: INTEGER) is
      do
	 out_h.put_string(fz_extern);
	 out_h.put_string(decl);
	 out_h.put_string(fz_00);
	 out_c.put_string(decl);
	 out_c.put_character('=');
	 out_c.put_integer(init);
	 out_c.put_string(fz_00);
      end;

   put_extern7(decl: STRING) is
      do
	 out_h.put_string(fz_extern);
	 out_h.put_string(decl);
	 out_h.put_string(fz_00);
	 out_c.put_string(decl);
	 out_c.put_character('=');
      end;

   put_c_heading(heading: STRING) is
      do
	 out_h.put_string(heading);
	 out_h.put_string(fz_00);
	 out_c.put_character('%N');
	 out_c.put_string(heading);
	 out_c.put_string(fz_11);
      end;

   put_c_function(heading, body:STRING) is
      require
	 not heading.is_empty;
	 body /= Void
      do
	 put_c_heading(heading);
	 out_c.put_string(body);
	 out_c.put_string(fz_12);
      end;

   put_string(c: STRING) is
      require
	 small_eiffel.is_ready
      do
	 current_out.put_string(c);
      end;

   put_string_c(s: STRING) is
      require
	 small_eiffel.is_ready;
	 on_c
      do
	 tmp_string.clear;
	 once_manifest_string_pool.string_to_c_code(s,tmp_string);
	 out_c.put_string(tmp_string);
      end;

   put_character(c: CHARACTER) is
      require
	 small_eiffel.is_ready
      do
	 current_out.put_character(c);
      end;

   put_integer(i: INTEGER) is
      require
	 small_eiffel.is_ready
      do
	 current_out.put_integer(i);
      end;

   put_real(r: REAL) is
      require
	 small_eiffel.is_ready
      do
	 current_out.put_real(r);
      end;

   put_array1(array_name: CHARACTER; value: INTEGER) is
      do
	 current_out.put_character(array_name);
	 current_out.put_character('[');
	 current_out.put_integer(value);
	 current_out.put_character(']');
      end;

   put_se_string(c_string: STRING) is
      do
	 current_out.put_string(once "se_string(");
	 put_string_c(c_string);
	 current_out.put_character(')');
      end;

   put_position(p: POSITION) is
      require
	 on_c;
	 small_eiffel.is_ready
      do
	 out_c.put_integer(p.mangling.to_integer);
      end;

   put_position_in_ds(p: POSITION) is
      require
	 on_c;
	 small_eiffel.is_ready
      do
	 out_c.put_string(once "ds.p=");
	 put_position(p);
	 out_c.put_string(fz_00);
      end;

   put_target_as_target is
	 -- Produce C code to pass the current stacked target as
	 -- a target of a new call : user expanded are passed with
	 -- a pointer and class invariant code is produced.
      require
	 small_eiffel.is_ready
      local
	 code: INTEGER; rf: RUN_FEATURE; target: EXPRESSION;
	 args: EFFECTIVE_ARG_LIST; ct: E_TYPE; ivt_flag: BOOLEAN;
      do
	 code := stack_code.item(top);
	 inspect
	    code
	 when C_direct_call then
	    target := stack_target.item(top);
	    rf := stack_rf.item(top);
	    ct := rf.current_type;
	    target.mapping_c_target(ct);
	 when C_check_id then
	    target := stack_target.item(top);
	    rf := stack_rf.item(top);
	    ct := rf.current_type;
	    check
	       ct.is_reference;
	    end;
	    if ace.boost then
	       target.mapping_c_target(ct);
	    else
	       ivt_flag := call_invariant_start(ct);
	       check_id(target,rf.id);
	       if ivt_flag then
		  call_invariant_end;
	       end;
	    end;
	 when C_inline_dca then
	    ct := stack_rf.item(top).current_type;
	    ct := ct.run_class.running.first.current_type;
	    check
	       ct.run_class.running.count = 1
	    end;
	    put_character('(');
	    ct.mapping_cast;
	    put_character('(');
	    put_target_as_value;
	    put_string(fz_13);
	 when C_same_target then
	    rf := stack_rf.item(top);
	    args := stack_args.item(top);
	    top := top - 1;
	    put_target_as_target;
	    top := top + 1;
	    stack_code.put(code,top);
	    stack_rf.put(rf,top);
	    stack_args.put(args,top);
	 else
	    common_put_target;
	 end;
      end;

   put_target_as_value is
	 -- Produce C code for a simple access to the stacked target.
	 -- User's expanded values are not given using a pointer.
	 -- There is no C code to check the class invariant.
      require
	 small_eiffel.is_ready
      local
	 code: INTEGER;
	 rf, static_rf: RUN_FEATURE;
	 target: EXPRESSION;
	 args: EFFECTIVE_ARG_LIST;
	 c0c: CALL_0_C;
	 direct_rf: RUN_FEATURE;
      do
	 code := stack_code.item(top);
	 inspect
	    code
	 when C_direct_call then
	    stack_target.item(top).compile_to_c;
	 when C_check_id then
	    stack_rf.item(top).current_type.mapping_cast;
	    stack_target.item(top).compile_to_c;
	 when C_inline_dca then
	    rf := stack_rf.item(top);
	    target := stack_target.item(top);
	    args := stack_args.item(top);
	    static_rf := stack_static_rf.item(top);
	    top := top - 1;
	    c0c ?= target;
	    direct_rf := c0c.run_feature;
	    direct_rf.mapping_c;
	    top := top + 1;
	    stack_code.put(code,top);
	    stack_rf.put(rf,top);
	    stack_target.put(target,top);
	    stack_args.put(args,top);
	    stack_static_rf.put(static_rf,top);
	 when C_same_target then
	    rf := stack_rf.item(top);
	    args := stack_args.item(top);
	    top := top - 1;
	    put_target_as_value;
	    top := top + 1;
	    stack_code.put(code,top);
	    stack_rf.put(rf,top);
	    stack_args.put(args,top);
	 else
	    common_put_target;
	 end;
      end;

   put_error0(msg: STRING) is
	 -- Print `msg' and then stop execution.
	 -- Also print stack when not -boost.
      do
	 if ace.boost then
	    put_comment(msg);
	    put_string(
               "%Nse_signal_handler(14/*System_level_type_error*/);%N");
	 else
	    put_string(once "error0(");
	    put_string_c(msg);
	    put_string(once ",NULL);%N");
	 end;
      end;

   put_position_comment(mark: CHARACTER; p: POSITION) is
      require
	 mark = '[' or mark = ']'
	 not p.is_unknown
      do
	 put_position_comment_on(current_out,mark,p);
      end;

   put_comment(str: STRING) is
      do
	 put_string(fz_open_c_comment);
	 put_string(str);
	 put_string(fz_close_c_comment);
      end;

   put_comment_line(str: STRING) is
      do
	 put_character('%N');
	 put_comment(str);
	 put_character('%N');
      end;

   define_main(rf3: RUN_FEATURE_3) is
      do
	 swap_on_c;
	 -- Declare eiffel_root_object :
	 tmp_string.clear;
	 tmp_string.extend('T');
	 rf3.run_class.id.append_in(tmp_string);
	 tmp_string.append(once "*eiffel_root_object");
	 put_extern5(tmp_string,fz_null);
	 -- Save argv argc :
	 put_extern1(once "int se_argc");
	 put_extern1(once "char**se_argv");
	 define_initialize_eiffel_runtime(rf3);
	 if not ace.no_main then
	    next_bunch_size(1);
	    really_define_c_main(rf3);
	 end;
      end;

   trace_boolean_expression(e: EXPRESSION) is
	 -- Produce a C boolean expression including trace code.
      require
	 e.result_type.is_boolean;
	 ace.no_check;
      do
	 put_character('(');
	 se_trace_exp(e.start_position);
	 put_character(',');
	 e.compile_to_c;
	 put_character(')');
      end;

   next_bunch_size(size: INTEGER) is
      do
	 if not ace.no_split then
	    if bunch_counter = 1 and then bunch_size >= 200 then
	       split_c_file_now(size);
	    elseif size >= 200 then
	       split_c_file_now(size);
	    elseif bunch_size >= 400 then
	       split_c_file_now(size);
	    else
	       bunch_counter := bunch_counter + 1;
	       bunch_size := bunch_size + size;
	    end;
	 end;
      end;

feature {SMALL_EIFFEL}

   get_started is
      require
	 small_eiffel.is_ready
      do
	 echo.file_removing(path_make);
	 top := -1;
	 if ace.no_split then
	    echo.tfw_connect(out_c,path_c);
	 else
	    backup_tfw_connect(out_c,path_c);
	 end;
	 current_out := out_c;
	 begin_c_linkage (out_c)
	 add_first_include(path_h);
	 !!out_h.make;
	 echo.tfw_connect(out_h,path_h);
	 current_out := out_h;
	 begin_c_linkage (out_h)
	 put_banner(out_h);
	 out_h.put_character('%N');
	 sys_runtime_h_and_c(fz_base);
	 current_out := out_c;
      ensure
	 on_c
      end;

   cecil_define is
      local
	 save_out_h: like out_h;
      do
	 save_out_h := out_h;
	 cecil_pool.c_define_users;
	 out_h := save_out_h;
      end;

   define_used_basics is
	 -- Produce C code only when used.
      do
	 echo.put_string(once "Define used basics.%N");
	 assignment_handler.c_definitions;
	 bit_constant_definition;
	 if sure_void_count > 0 then
	    echo.put_string(once "Calls with a Void target : ");
	    echo.put_integer(sure_void_count);
	    echo.put_string(once " (yes it is dangerous).%N");
	 end;
	 echo.print_count(once "Direct Call",direct_call_count);
	 echo.print_count(once "Direct (Stupid-Switch) Call",
			  stupid_switch_call_count);
	 echo.print_count(once "Check Id Call",check_id_call_count);
	 echo.print_count(once "Switched Call",switched_call_count);
	 echo.print_count(once "Inlined Procedure",inlined_procedure_count);
	 echo.print_count(once "Inlined Function",inlined_function_count);
	 echo.print_count(once "Static Expression",static_expression_count);
	 echo.print_count(once "Procedure",procedure_count);
	 echo.print_count(once "Function",function_count);
	 echo.print_count(once "Procedure without Current",real_procedure_count);
	 echo.print_count(once "Function without Current",real_function_count);
	 echo.print_count(once "Precursor routine",precursor_routine_count);
	 echo.put_string(once "Internal stacks size used : ");
	 echo.put_integer(stack_code.count);
	 echo.put_character('%N');
	 end;

   customize_runtime(sys_runtime_basic: SET[STRING]) is
      require
	 sys_runtime_basic /= Void
      local
	 i: INTEGER; item: STRING;
      do
	 if ace.no_check then
	    sys_runtime_h_and_c(fz_no_check);
	    if ace.wedit then
	       out_h.put_string(once "#define SE_WEDIT 1%N");
	    end;
	    if ace.trace_support then
	       put_extern2(once "int se_trace_flag",'0');
	       out_h.put_string(once "#define SE_TRACE 1%N");
	    end;
	    sys_runtime_h_and_c(once "trace");
	 else
	    sys_runtime_h_and_c(once "boost");
	 end;
	 exceptions_handler.customize_c_runtime;
	 gc_handler.customize_c_runtime;
	 agent_pool.customize_c_runtime;
	 if small_eiffel.deep_twin_used then
	    sys_runtime_h_and_c(as_deep_twin);
	 end;
	 from
	    i := sys_runtime_basic.lower;
	 until
	    i > sys_runtime_basic.upper
	 loop
	    item := sys_runtime_basic.item(i);
	    if item.has_prefix(once "basic_picasso") then
	       system_tools.add_lib_basic_picasso;
	    end;
	    sys_runtime_h_and_c(item);
	    i := i + 1;
	 end;
      end;

feature {RUN_FEATURE,NATIVE}

   target_cannot_be_dropped: BOOLEAN is
	 -- True when top target cannot be dropped because we are
	 -- not sure that target is non Void or that target has
	 -- no side effects. When Result is true, printed
	 -- C code is : "(((void)(<target>))"
      require
	 small_eiffel.is_ready
      local
	 target: EXPRESSION;
	 target_type: E_TYPE;
      do
	 inspect
	    stack_code.item(top)
	 when C_direct_call, C_check_id then
	    target := stack_target.item(top);
	    target_type := target.result_type;
	    Result := not target.can_be_dropped;
	 when C_inline_dca then
	    Result := true;
	 when C_same_target then
	    top := top - 1;
	    Result := target_cannot_be_dropped;
	    top := top + 1;
	 else
	 end;
	 if Result then
	    put_string(once "((/*UT*/(void)(");
	    if target_type = Void then
	       put_target_as_target;
	    elseif target_type.is_user_expanded then
	       put_target_as_value;
	    else
	       put_target_as_target;
	    end;
	    put_string(fz_13);
	 end;
      end;

   arguments_cannot_be_dropped: BOOLEAN is
	 -- True when arguments cannot be dropped.
	 -- Printed C code is like :
	 --  "(((void)<exp1>),((void)<exp2>),...((void)<expN>)"
      do
	 if not no_args_to_eval then
	    Result := true;
	    put_string(once "((/*UA*/(void)(");
	    put_arguments;
	    put_string(fz_13);
	 end;
      end;

   cannot_drop_all: BOOLEAN is
	 -- Result is true when something (target or one argument)
	 -- cannot be dropped. Thus when something cannot be dropped,
	 -- Result is true and C code is printed :
	 --  "(((void)<exp1>),((void)<exp2>),...((void)<expN>)"
      do
	 if target_cannot_be_dropped then
	    Result := true;
	    put_character(',');
	    if arguments_cannot_be_dropped then
	       put_character(')');
	    else
	       put_character('0');
	    end;
	 else
	    Result := arguments_cannot_be_dropped;
	 end;
      end;

feature

   put_arguments is
	 -- Produce code to access effective arguments list.
      require
	 small_eiffel.is_ready
      local
	 i: INTEGER; fal: FORMAL_ARG_LIST;
      do
	 from
	    fal := stack_rf.item(top).arguments;
	    i := 1;
	 until
	    i > fal.count
	 loop
	    put_ith_argument(i);
	    if i < fal.count then put_character(',') end;
	    i := i + 1;
	 end;
      end;

   put_ith_argument(index: INTEGER) is
	 -- Produce code to access to the ith argument.
      require
	 small_eiffel.is_ready
	 index >= 1
      local
	 code: INTEGER; rf, static_rf: RUN_FEATURE; target: EXPRESSION;
	 args: EFFECTIVE_ARG_LIST; fal: FORMAL_ARG_LIST; switch: SWITCH;
      do
	 code := stack_code.item(top);
	 inspect
	    code
	 when C_switch then
	    fal := stack_rf.item(top).arguments;
	    static_rf := stack_static_rf.item(top);
	    switch.put_ith_argument(static_rf,fal,index);
	 when C_create_expression then
	    put_character('a');
	    put_integer(index);
	 when C_inline_dca then
	    rf := stack_rf.item(top);
	    target := stack_target.item(top);
	    args := stack_args.item(top);
	    static_rf := stack_static_rf.item(top);
	    top := top - 1;
	    if rf /= Void then
	       args.dca_inline_ith(rf.arguments,index);
	    else
	       -- No rf for "=" and "/=".
	       args.dca_inline_ith(static_rf.arguments,index);
	    end;
	    top := top + 1;
	    stack_code.put(code,top);
	    stack_rf.put(rf,top);
	    stack_target.put(target,top);
	    stack_args.put(args,top);
	    stack_static_rf.put(static_rf,top);
	 when C_inline_one_pc then
	    print_argument(index);
	 when C_inside_twin then
	    check
	       index = 1
	    end;
	    if stack_rf.item(top).current_type.is_reference then
	       put_string(once "((T0*)C)");
	    else
	       put_string(once "*C");
	    end;
	 when
	    C_create_instruction,
	    C_direct_call,
	    C_check_id,
	    C_same_target,
	    C_precursor
	  then
	    fal := stack_rf.item(top).arguments;
	    stack_args.item(top).compile_to_c_ith(fal,index);
	 end;
     end;

feature {NATIVE_SMALL_EIFFEL}

   put_c_inline_h is
      local
	 c_code: STRING;
      do
	 c_code := get_inline_ms.to_string;
	 if not c_inline_h_mem.fast_has(c_code) then
	    c_inline_h_mem.add_last(c_code);
	    out_h.put_string(c_code);
	    out_h.put_character('%N');
	 end;
      end;

   put_c_inline_c is
      local
	 c_code: MANIFEST_STRING;
      do
	 c_code := get_inline_ms;
	 out_c.put_string(c_code.to_string);
      end;

   put_trace_switch is
      do
	 if ace.trace_support then
	    put_string(once "se_trace_flag=(");
	    put_ith_argument(1);
	    put_string(fz_14);
	 end;
      end;

   put_sedb_breakpoint is
      do
	 if ace.trace_support then
	    put_string(once "sedb_breakpoint(&ds);%N");
	 end;
      end;

feature {NATIVE_SMALL_EIFFEL}

   put_generating_type(t: E_TYPE) is
      local
	 rc: RUN_CLASS;
      do
	 put_string(fz_cast_t0_star);
	 put_character('(');
	 put_character('t');
	 put_character('[');
	 if t.is_reference then
	    rc := t.run_class;
	    if rc.is_tagged then
	       put_character('(');
	       put_target_as_value;
	       put_character(')');
	       put_string(fz_arrow_id);
	    else
	       put_integer(rc.id);
	    end;
	 else
	    put_integer(t.id);
	 end;
	 put_character(']');
	 put_character(')');
      end;

   put_generator(t: E_TYPE) is
      require
	 t.is_run_type;
      local
	 rc: RUN_CLASS;
      do
	 put_string(fz_cast_t0_star);
	 put_character('(');
	 put_character('g');
	 put_character('[');
	 if t.is_reference then
	    rc := t.run_class;
	    if rc.is_tagged then
	       put_character('(');
	       put_target_as_value;
	       put_character(')');
	       put_string(fz_arrow_id);
	    else
	       put_integer(rc.id);
	    end;
	 else
	    put_integer(t.id);
	 end;
	 put_character(']');
	 put_character(')');
      end;

   target_position_in_error_handler is
	 -- Add the target position into the `error_handler'.
      local
	 target: EXPRESSION;
      do
	 target := stack_target.item(top);
	 if target /= Void then
	    eh.add_position(target.start_position);
	 end;
      end;

   put_object_size(t: E_TYPE) is
      require
	 t.is_run_type;
      local
	 tcbd: BOOLEAN;
      do
	 tcbd := target_cannot_be_dropped;
	 if tcbd then
	    out_c.put_character(',');
	 end;
	 out_c.put_string(once "sizeof(T");
	 out_c.put_integer(t.id);
	 out_c.put_character(')');
	 if tcbd then
	    out_c.put_character(')');
	 end;
      end;

feature {CECIL_FILE}

   connect_cecil_out_h(user_path_h: STRING) is
      do
	 !!out_h.make;
	 echo.tfw_connect(out_h,user_path_h);
	 system_tools.mandatory_sys_runtime(fz_base,'h');
	 put_file(tmp_file_read,out_h);
	 out_h.put_string(
			  once "extern void*eiffel_root_object;%N%N%
			  %typedef char* T9;%N%
			  %/* Available Eiffel routines via -cecil:%N*/%N");
      end;

   disconnect_cecil_out_h is
      do
	 out_h.disconnect;
      end;

feature {CECIL_POOL,RUN_FEATURE}

   push_direct(rf: RUN_FEATURE; t: EXPRESSION; args: EFFECTIVE_ARG_LIST) is
      require
	 rf /= Void;
	 t /= Void
      do
	 stack_push(C_direct_call);
	 stack_rf.put(rf,top);
	 stack_target.put(t,top);
	 stack_args.put(args,top);
	 direct_call_count := direct_call_count + 1;
      end;

feature {RUN_FEATURE_3}

   push_inline_one_pc(rf: RUN_FEATURE) is
      do
	 stack_push(C_inline_one_pc);
	 stack_rf.put(rf,top);
      end;

feature {RUN_FEATURE_3,RUN_FEATURE_4}

   push_inline_dca(relay_rf: RUN_FEATURE; dpca: CALL_PROC_CALL) is
	 -- Where `dpca' is inside `relay_rf'.
      require
	 relay_rf /= Void;
	 dpca /= Void
      do
	 stack_push(C_inline_dca);
	 stack_rf.put(dpca.run_feature,top);
	 stack_static_rf.put(relay_rf,top);
	 stack_target.put(dpca.target,top);
	 stack_args.put(dpca.arguments,top);
	 direct_call_count := direct_call_count + 1;
      end;

   push_same_target(rf: RUN_FEATURE; args: EFFECTIVE_ARG_LIST) is
      require
	 rf /= Void
      do
	 stack_push(C_same_target);
	 stack_rf.put(rf,top);
	 stack_args.put(args,top);
      end;

feature {CECIL_POOL}

   push_cpc(up_rf: RUN_FEATURE; r: ARRAY[RUN_CLASS];
	    t: EXPRESSION; args: EFFECTIVE_ARG_LIST) is
      local
	 dyn_rf: RUN_FEATURE;
      do
	 if r = Void then
	    se_evobt(up_rf,t);
	 elseif r.count = 1 then
	    dyn_rf := r.first.dynamic(up_rf);
	    push_check(dyn_rf,t,args);
	    dyn_rf.mapping_c;
	    pop;
	 else
	    use_switch(up_rf,r,t,args);
	 end;
      end;

feature {SWITCH}

   inside_switch_call(dyn_rf, static_rf: RUN_FEATURE) is
	 -- Call the `dyn_rf' inside switching function for `static_rf'.
      require
	 dyn_rf /= Void;
	 static_rf /= Void;
	 dyn_rf.run_class.dynamic(static_rf) = dyn_rf
      local
	 dyn_result, static_result: E_TYPE; msg: STRING;
	 cast, no_code, need_se_tmp: BOOLEAN;
      do
	 -- Extra comment to debug C code:
	 -- put_comment(dyn_rf.current_type.run_time_mark);
	 --
	 static_result := static_rf.result_type;
	 if static_result /= Void then
	    dyn_result := dyn_rf.result_type;
	    if static_result.is_user_expanded then
	       if dyn_result.is_user_expanded then
		  if dyn_result.run_class /= static_result.run_class then
		     no_code := true;
		  end;
	       end;
	    end;
	 end;
	 if no_code then
	    msg := "Conversion from: ";
	    msg.append(dyn_result.run_time_mark);
	    msg.append(once " to: ");
	    msg.append(static_result.run_time_mark);
	    msg.append(once " not yet implemented (sorry). %
			    %Please report on SmallEiffel@loria.fr.)");
	    put_error0(msg);
	 else
	    dyn_rf.collect_c_tmp;
	    need_se_tmp := se_tmp_open_declaration;
	    -- Opening section for Result :
	    if static_result /= Void then
	       out_c.put_string(once "R=(");
	       if static_result.is_native_array then
		  cast := true;
		  out_c.put_string(fz_b7);
		  out_c.put_integer(static_result.id);
		  out_c.put_character(')');
		  out_c.put_character('(');
	       end;
	       if dyn_result.is_expanded and then
		  static_result.is_reference
		then
		  assignment_handler.c_function_call(dyn_result,static_result);
	       end;
	    end;
	    stack_push(C_switch);
	    stack_rf.put(dyn_rf,top);
	    stack_static_rf.put(static_rf,top);
	    dyn_rf.mapping_c;
	    pop;
	    -- Closing section for Result:
	    if static_result /= Void then
	       if dyn_result.is_expanded
		  and then static_result.is_reference
		then
		  out_c.put_character(')');
	       end;
	       if cast then
		  out_c.put_character(')');
		  out_c.put_character(')');
	       end;
	       out_c.put_string(fz_14);
	    end;
	    if need_se_tmp then
	       se_tmp_close_declaration;
	    end;
	 end;
      end;

feature

   put_proc_call_0(rf3: RUN_FEATURE_3; writable: EXPRESSION; c_name: STRING) is
	 -- To call the expanded initializer `rf3' (ie. a procedure without
	 -- arguments) using `writable' or `c_name' as target.
      require
	 rf3.current_type.is_expanded;
	 rf3.arguments = Void;
	 (writable /= Void) xor (c_name /= Void)
      do
	 stack_push(C_expanded_initialize);
	 stack_target.put(writable,top);
	 stack_string.put(c_name,top);
	 stack_rf.put(Void,top);
	 direct_call_count := direct_call_count + 1;
	 rf3.mapping_c;
	 pop;
	 if call_invariant_start(rf3.current_type) then
	    put_character('&');
	    writable.compile_to_c;
	    call_invariant_end;
	    put_string(fz_00);
	 end;
      end;

feature {RUN_CLASS}

   push_create_expression(rf: RUN_FEATURE) is
      require
	 rf /= Void;
      do
	 stack_push(C_create_expression);
	 stack_rf.put(rf,top);
	 direct_call_count := direct_call_count + 1;
      end;

feature {CREATE_TOOLS}

   push_create_instruction(rf: RUN_FEATURE; args: EFFECTIVE_ARG_LIST) is
      require
	 rf /= Void;
      do
	 stack_push(C_create_instruction);
	 stack_rf.put(rf,top);
	 stack_args.put(args,top);
	 direct_call_count := direct_call_count + 1;
      end;

   expanded_attributes(rt: E_TYPE) is
	 -- Produce C code to initialize expanded attribute
	 -- of the new object juste created in variable "n".
      require
	 small_eiffel.is_ready;
	 rt.is_run_type
      local
	 wa: ARRAY[RUN_FEATURE]; a: RUN_FEATURE; at: E_TYPE;
	 i: INTEGER; rf3: RUN_FEATURE_3;
      do
	 wa := rt.run_class.writable_attributes;
	 if wa /= Void then
	    from
	       i := wa.upper;
	    until
	       i = 0
	    loop
	       a := wa.item(i);
	       at := a.result_type.run_type;
	       if at.is_user_expanded then
		  rf3 := at.run_class.a_default_create;
		  if rf3 /= Void then
		     stack_push(C_expanded_initialize);
		     stack_string.put(Void,top);
		     stack_target.put(Void,top);
		     stack_rf.put(a,top);
		     direct_call_count := direct_call_count + 1;
		     rf3.mapping_c;
		     pop;
		  end;
	       end;
	       i := i - 1;
	    end;
	 end;
      end;

feature {NATIVE}

   inside_twin(cpy: RUN_FEATURE) is
      do
	 stack_push(C_inside_twin);
	 stack_rf.put(cpy,top);
	 cpy.mapping_c;
	 pop;
      end;

feature {ASSERTION}

   check_assertion(e: EXPRESSION; tag_name: TAG_NAME) is
	 -- Produce a C boolean expression including trace code
	 -- and assertion check.
      require
	 e.result_type.is_boolean
      do
	 se_trace_ins(e.start_position);
	 put_string(once "ac_");
	 put_string(check_assertion_mode);
	 put_character('(');
	 if e.is_static then
	    static_expression_count := static_expression_count + 1;
	 end;
	 e.compile_to_c;
	 put_character(',');
	 if tag_name /= Void then
	    put_string_c(tag_name.to_string);
	 else
	    put_string(fz_null);
	 end;
	 put_string(fz_14);
      end;

feature {ASSERTION_LIST}

   set_check_assertion_mode(s: STRING) is
      require
	 s /= Void
      do
	 check_assertion_mode := s;
      ensure
	 check_assertion_mode = s
      end;

   increment_static_expression_count(increment: INTEGER) is
      do
	 static_expression_count := static_expression_count + increment;
      end;

feature

   se_trace_ins(p: POSITION) is
      do
	 if ace.no_check then
	    se_trace_exp(p);
	    out_c.put_string(fz_00);
	 end;
      end;

   se_trace_exp(p: POSITION) is
      do
	 if ace.no_check then
	    if ace.wedit then
	       out_c.put_string(once "ds.p=se_trace(");
	    elseif p.run_time_trace then
	       out_c.put_string(once "se_trace(&ds,");
	    else
	       out_c.put_string(once "(ds.p=");
	    end;
	    put_position(p);
	    out_c.put_character(')');
	 end;
      end;

feature -- Numbering of inspect variables :

   inspect_incr is
      do
	 inspect_level := inspect_level + 1;
      end;

   inspect_decr is
      do
	 inspect_level := inspect_level - 1;
      end;

   put_inspect is
      do
	 put_character('z');
	 put_integer(inspect_level);
      end;

feature -- Printing Current, local or argument :

   inline_level_incr is
      do
	 inline_level := inline_level + 1;
      end;

   inline_level_decr is
      do
	 inline_level := inline_level - 1;
      end;

   print_current is
      require
	 on_c
      local
	 level: INTEGER;
      do
	 out_c.put_character('C');
	 level := inline_level;
	 if level > 0 then
	    out_c.put_integer(level);
	 end;
      end;

   print_argument(rank: INTEGER) is
      require
	 on_c
      local
	 code: INTEGER;
      do
	 code := ('a').code + inline_level;
	 out_c.put_character(code.to_character);
	 out_c.put_integer(rank);
      end;

   print_local(name: STRING) is
      require
	 on_c
      local
	 level: INTEGER;
      do
	 from
	    level := inline_level + 1;
	 until
	    level = 0
	 loop
	    out_c.put_character('_');
	    level := level - 1;
	 end;
	 out_c.put_string(name);
      end;

feature {E_LOOP}

   variant_check(e: EXPRESSION) is
      do
	 se_trace_ins(e.start_position);
	 put_string(once "v=ac_lvc(c++,v,");
	 e.compile_to_c;
	 put_string(fz_14);
      end;

feature {RUN_FEATURE}

   current_class_invariant(current_type: E_TYPE) is
	 -- Add some C code to check class invariant with Current
	 -- at the end of a routine for `Current'.
      require
	 current_type.is_run_type
      local
	 rc: RUN_CLASS;
      do
	 rc := need_invariant(current_type);
	 if rc /= Void then
	    if rc.current_type.is_reference then
	       out_c.put_string(once "if(se_rci(caller,C))");
	    end;
	    out_c.put_string(fz_se_i);
	    out_c.put_integer(rc.id);
	    out_c.put_string(once "(&ds,C);%N");
	 end;
      end;

feature

   call_invariant_start(target_type: E_TYPE): BOOLEAN is
	 -- Start printing call of invariant only when it is needed
	 -- (`target_type' really has an invariant and when mode is
	 -- `-invariant_check').
	 -- When Result is true, `call_invariant_end' must be called to
	 -- finish the job.
      require
	 target_type.is_run_type;
      local
	 rc: RUN_CLASS;
      do
	 rc := need_invariant(target_type);
	 if rc /= Void then
	    out_c.put_string(fz_se_i);
	    out_c.put_integer(rc.id);
	    out_c.put_string(once "(&ds,");
	    Result := true;
	 end;
      end;

   call_invariant_end is
      do
	 out_c.put_character(')');
      end;

feature

   macro_def(str: STRING; id: INTEGER) is
      do
	 tmp_string.clear;
	 tmp_string.extend('#');
	 tmp_string.append(fz_define);
	 tmp_string.extend(' ');
	 tmp_string.append(str);
	 tmp_string.extend(' ');
	 id.append_in(tmp_string);
	 tmp_string.extend('%N');
	 out_h.put_string(tmp_string);
      end;

feature

   write_make_file is
      local
	 score: DOUBLE;
      do
	 --
	 out_h.put_character('%N');
	 end_c_linkage (out_h)
	 out_h.disconnect;
	 out_c.put_character('%N');
	 end_c_linkage (out_c)
	 out_c.disconnect;
	 --
	 c_plus_plus_definitions;
         echo.tfw_connect(out_make,path_make);
	 if ace.no_split then
	    write_make_file_no_split;
	 else
	    write_make_file_split;
	 end;
	 if not executable_is_up_to_date and then
	    system_tools.strip_executable(tmp_string)
	  then
	    echo_make;
	 end;
	 out_make.disconnect;
	 if nb_errors > 0 then
	    echo.file_removing(path_make);
	 else
	    echo.put_string(once "Type inference score : ");
	    score := direct_call_count + check_id_call_count;
	    score := (score / (score + switched_call_count)) * 100.0;
	    echo.put_double_format(score,2);
	    echo.put_character('%%');
	    echo.put_character('%N');
	 end;
	 eiffel_parser.show_nb_warnings;
	 eiffel_parser.show_nb_errors;
	 echo.put_string(fz_02);
      end;

feature {CALL_PROC_CALL,E_AGENT}

   put_cpc(cpc: CALL_PROC_CALL) is
      local
	 target: EXPRESSION; target_type: E_TYPE; run_feature: RUN_FEATURE;
      do
	 target := cpc.target;
	 target_type := target.result_type.run_type;
	 run_feature := cpc.run_feature;
	 if target_type.is_expanded then
	    push_direct(run_feature,target,cpc.arguments);
	    run_feature.mapping_c;
	    pop;
	 elseif target.is_current then
	    push_direct(run_feature,target,cpc.arguments);
	    run_feature.mapping_c;
	    pop;
	 elseif target.is_manifest_string then
	    push_direct(run_feature,target,cpc.arguments);
	    run_feature.mapping_c;
	    pop;
	 else
	    push_cpc(run_feature,
		     target_type.run_class.running,
		     target,
		     cpc.arguments);
	 end;
      end;

feature

   sys_runtime_h_and_c(name: STRING) is
	 -- Inline corresponding SmallEiffel/sys/runtime/`name'.[hc]
	 -- file. (At least, one file should be found.)
      local
	 ok: BOOLEAN;
      do
	 system_tools.sys_runtime(name,'h');
	 if tmp_file_read.is_connected then
	    ok := true;
	    put_file(tmp_file_read,out_h);
	 end;
	 system_tools.sys_runtime(name,'c');
	 if tmp_file_read.is_connected then
	    ok := true;
	    put_file(tmp_file_read,out_c);
	 end;
	 if not ok then
	    eh.append("No support found in directory sys/runtime for %"");
	    eh.append(name);
	    eh.append("%" (i.e. file(s) %"");
	    tmp_path.remove_last(1);
	    eh.append(tmp_path);
	    eh.append("[hc]%" not found).");
	    eh.print_as_fatal_error;
	 end;
      end;

feature {SYSTEM_TOOLS}

   put_c_file(tfr: TEXT_FILE_READ) is
      require
	 not tfr.end_of_input
      do
	 put_file(tfr,out_c);
      ensure
	 not tfr.is_connected
      end;

feature

   put_recompilation_comment(key: INTEGER) is
      do
	 out_c.put_string(fz_open_c_comment);
	 out_c.put_integer(key);
	 out_c.put_string(fz_close_c_comment);
      end;

feature {COMPOUND,ASSERTION_LIST,E_LOOP}

   se_tmp_open_declaration: BOOLEAN is
	 -- True if some `se_tmpXX' temporay is needed.
      local
	 i: INTEGER; t: E_TYPE;
      do
	 from
	    tmp_string.clear;
	    tmp_string.extend('{');
	    i := se_tmp_list.upper;
	 until
	    i < 0
	 loop
	    t := se_tmp_list.item(i);
	    if t /= Void then
	       Result := true;
	       if t.is_expanded then
		  t.c_type_for_result_in(tmp_string);
	       else
		  t.c_type_for_target_in(tmp_string);
	       end;
	       tmp_string.append(once " se_tmp");
	       i.append_in(tmp_string);
	       tmp_string.append(fz_00);
	    end;
	    i := i - 1;
	 end;
	 if Result then
	    se_tmp_level := se_tmp_level + 1;
	    out_c.put_string(tmp_string);
	 end;
      end;

   se_tmp_close_declaration is
      do
	 check
	    se_tmp_level > 0
	 end;
	 se_tmp_level := se_tmp_level - 1;
	 out_c.put_string(fz_12);
	 if se_tmp_level = 0 then
	    se_tmp_list.clear;
	 end;
      end;

feature {RUN_FEATURE}

   se_tmp_register(t: E_TYPE) is
      require
	 t.is_expanded and not t.is_dummy_expanded
      do
	 se_tmp_list.add_last(t);
      end;

   se_tmp_open(t: E_TYPE): INTEGER is
	 -- The `Result' is the index of the `se_tmp' variable, because this
	 -- variable may be used more than once. Result >= 0 implies that
	 -- a temporary variable is used and thus that `se_tmp_close' must be
	 -- called. Result < 0 indicate that `t' is not registered.
      require
	 t /= Void
      local
	 stop: BOOLEAN;
      do
	 from
	    Result := se_tmp_list.upper;
	 until
	    stop
	 loop
	    if Result < 0 then
	       stop := true;
	    elseif t = se_tmp_list.item(Result) then
	       stop := true;
	       se_tmp_list.put(Void,Result);
	       out_c.put_character('(');
	       out_c.put_string(once "*(se_tmp");
	       out_c.put_integer(Result);
	       out_c.put_character('=');
	    else
	       Result := Result - 1;
	    end;
	 end;
      end;

   se_tmp_close(se_tmp_idx: INTEGER) is
	 -- Assume `se_tmp_idx' is the value obtained with `se_tmp_open'.
      require
	 se_tmp_idx >= 0
      do
	 check -- Obtained with `se_tmp_open':
	    se_tmp_list.item(se_tmp_idx) = Void
	 end;
	 cpp.put_character(',');
	 cpp.put_character('&');
	 out_c.put_string(once "se_tmp");
	 out_c.put_integer(se_tmp_idx);
	 cpp.put_character(')');
	 cpp.put_character(')');
      end;

feature {BIT_CONSTANT}

   register_bit_constant(bc: BIT_CONSTANT) is
      require
	 bc.result_type.is_c_unsigned_ptr
      do
	 if bit_constant_pool = void then
	    !!bit_constant_pool.with_capacity(4);
	 end;
	 bit_constant_pool.add_last(bc);
	 out_c.put_string(fz_se_bit_constant);
	 out_c.put_integer(bit_constant_pool.upper);
      end;

   bit_constant_definition is
      local
	 i: INTEGER;
	 bc: BIT_CONSTANT;
	 type_bit: TYPE_BIT;
      do
	 if bit_constant_pool /= Void then
	    from
	       i := bit_constant_pool.upper;
	    until
	       i < 0
	    loop
	       tmp_string.clear;
	       bc := bit_constant_pool.item(i)
	       type_bit := bc.result_type;
	       tmp_string.clear;
	       type_bit.c_type_for_argument_in(tmp_string);
	       tmp_string.extend(' ');
	       tmp_string.append(fz_se_bit_constant);
	       i.append_in(tmp_string);
	       put_extern7(tmp_string);
	       out_c.put_character('{');
	       bc.c_define;
	       out_c.put_character('}');
	       out_c.put_character(';');
	       out_c.put_character('%N');
	       i := i - 1;
	    end;
	 end;
      end;

feature {NATIVE}

   include_register(origin: POSITION; include_name: STRING) is
      do
	 if include_memory = Void then
	    create include_memory.make;
	 end;
	 if not include_memory.has(include_name) then
	    include_memory.add(include_name);
	    put_position_comment_on(out_h,'[',origin);
	    add_include_on(out_h,include_name);
	    put_position_comment_on(out_h,']',origin);
	 end;
      end;

feature {NATIVE_C_PLUS_PLUS}

   c_plus_plus_register(native: NATIVE_C_PLUS_PLUS) is
      do
	 if c_plus_plus = Void then
	    !!c_plus_plus.with_capacity(64);
	 end;
	 c_plus_plus.add_last(native);
      end;

   add_include(include: STRING) is
      do
	 add_include_on(out_h,include);
      end;

   add_include_on(output: TEXT_FILE_WRITE; include: STRING) is
      do
	 end_c_linkage (output)
	 output.put_string(once "#include ");
	 inspect
	    include.first
	 when '%"', '<' then
	 else
	    output.put_character('%"');
	 end;
	 output.put_string(include);
	 inspect
	    include.last
	 when '%"', '>' then
	 else
	    output.put_character('%"');
	 end;
	 output.put_character('%N');
	 begin_c_linkage (output)
      end;

feature {RUN_FEATURE_2}

   attribute_read_removal(up_rf: RUN_FEATURE; r: ARRAY[RUN_CLASS]): BOOLEAN is
      require
	 small_eiffel.is_ready;
	 r.count > 1
      local
	 rf2a, rf2b: RUN_FEATURE_2; offseta, offsetb: INTEGER;
	 rta, rtb: E_TYPE; i: INTEGER; rc: RUN_CLASS;
      do
	 from
	    Result := true;
	    i := r.upper;
	 until
	    not Result or else i = 0
	 loop
	    rc := r.item(i);
	    rf2b ?= rc.dynamic(up_rf);
	    if rf2b /= Void then
	       offsetb := rc.offset_of(rf2b);
	    end;
	    if rf2a = Void then
	       rf2a := rf2b;
	       offseta := offsetb;
	    end;
	    if rf2b = Void then
	       Result := false;
	    else
	       Result := offseta = offsetb;
	       if Result then
		  rta := rf2a.result_type;
		  rtb := rf2b.result_type;
		  if rta.is_reference then
		     Result := rtb.is_reference;
		  elseif rta.run_time_mark = rtb.run_time_mark then
		  elseif rta.is_native_array then
		     if rta.generic_list.first.is_reference then
			Result := rtb.generic_list.first.is_reference;
		     end;
		  else
		     Result := false;
		  end;
	       end
	    end;
	    i := i - 1;
	 end;
      end;

feature {NONE}

   stupid_switch(up_rf: RUN_FEATURE): BOOLEAN is
      require
	 small_eiffel.is_ready;
	 up_rf.run_class.running /= Void
      local
	 r: ARRAY[RUN_CLASS];
      do
	 r := up_rf.run_class.running;
	 if r.count > 1 then
	    small_eiffel.push(up_rf);
	    Result := stupid_switch_n(up_rf,r);
	    small_eiffel.pop;
	 else
	    Result := true;
	 end;
      end;

   stupid_switch_n(up_rf: RUN_FEATURE; r: ARRAY[RUN_CLASS]): BOOLEAN is
      require
	 small_eiffel.is_ready;
	 small_eiffel.top_rf = up_rf;
	 r.count > 1
      local
	 stupid: STRING;
      do
	 if small_eiffel.same_base_feature(up_rf,r) then
	    stupid := up_rf.stupid_switch(r);
	    if stupid /= Void then
	       put_comment(stupid);
	       Result := true;
	    end;
	 else
	    Result := attribute_read_removal(up_rf,r);
	    if Result then
	       put_comment(once "SSWA2");
	    end;
	 end;
      end;

   c_plus_plus: FIXED_ARRAY[NATIVE_C_PLUS_PLUS];

   begin_c_linkage (output: TEXT_FILE_WRITE) is
		 -- Begin wrap for C linkage
      do
	 output.put_string (once "#ifdef __cplusplus%Nextern %"C%" {%N#endif%N")
      end

   end_c_linkage (output: TEXT_FILE_WRITE) is
		 -- End wrap for C linkage
      do
	 output.put_string (once "#ifdef __cplusplus%N}%N#endif%N")
      end

   c_plus_plus_definitions is
      local
	 cpp_path_h, cpp_path_c: STRING;
	 i: INTEGER;
	 no_split_save: BOOLEAN;
      do
	 if c_plus_plus /= Void then
	    no_split_save := ace.no_split;
	    ace.set_no_split(true);
	    echo.put_string(once "C++ external definitions.%N");
	    cpp_path_h := system_tools.path_h.twin;
	    cpp_path_h.remove_last(2);
	    cpp_path_h.append(once "_external_cpp");
	    cpp_path_c := cpp_path_h.twin;
	    cpp_path_h.append(h_suffix);
	    cpp_path_c.append(c_plus_plus_suffix);
	    echo.tfw_connect(out_h,cpp_path_h);
	    echo.tfw_connect(out_c,cpp_path_c);
	    begin_c_linkage (out_c)
	    begin_c_linkage (out_h)
	    add_first_include(cpp_path_h);
	    system_tools.add_c_plus_plus_file(cpp_path_c);
	    sys_runtime_h_and_c(once "c_plus_plus");
	    if c_plus_plus /= Void then
	       from
		  i := c_plus_plus.upper;
	       until
		  i < 0
	       loop
		  c_plus_plus.item(i).c_plus_plus_definition;
		  i := i - 1;
	       end;
	    end;
	    end_c_linkage (out_c)
	    end_c_linkage (out_h)
	    out_h.disconnect;
	    out_c.disconnect;
	    ace.set_no_split(no_split_save);
	 end;
      end;

   echo_make is
      do
	 out_make.put_string(tmp_string);
	 out_make.put_character('%N');
      end;

   out_c: TEXT_FILE_WRITE is
	 -- The current *.c output file.
      once
	 !!Result.make;
      end;

   out_h: TEXT_FILE_WRITE;
	 -- The *.h output file.

   current_out: TEXT_FILE_WRITE;
	 -- Is `out_c' or `out_h'.

   out_make: TEXT_FILE_WRITE is
	 -- The *.make output file.
      once
	 !!Result.make;
      end;

   no_args_to_eval: BOOLEAN is
	 -- True if there is no C code to produce to eval arguments.
	 -- For example because there are  no arguments or because
	 -- we are inside a switching function for example.
      require
	 small_eiffel.is_ready
      local
	 code: INTEGER;
	 args: EFFECTIVE_ARG_LIST;
      do
	 code := stack_code.item(top);
	 inspect
	    code
	 when C_direct_call, C_check_id, C_create_instruction, C_same_target
	  then
	    args := stack_args.item(top);
	    if args = Void then
	       Result := true;
	    else
	       Result := args.can_be_dropped;
	    end;
	 when C_inline_dca then
	    top := top - 1;
	    Result := no_args_to_eval;
	    top := top + 1;
	 else
	    Result := true;
	 end;
      end;

   c_inline_h_mem: FIXED_ARRAY[STRING] is
      once
	 !!Result.with_capacity(4);
      end;

   se_evobt(rf: RUN_FEATURE; target: EXPRESSION) is
      require
	 rf /= Void;
	 target /= Void
      local
	 rt: E_TYPE;
      do
	 sure_void_count := sure_void_count + 1;
	 put_character('(');
	 if ace.no_check then
	    put_string(once "se_evobt");
	    put_character('(');
	    target.compile_to_c;
	    put_character(',');
	    put_position(target.start_position);
	    put_character(')');
	 else
	    put_string(once "/*se_evobt*/");
	    target.compile_to_c;
	    put_character(',');
	    exceptions_handler.se_evobt;
	 end;
	 rt := rf.result_type;
	 if rt /= Void then
	    put_character(',');
	    -- ***
	    -- *** Because a bug in FreeBSD/gcc we have put here this
	    -- *** strange unnecessary cast to avoid a strange
	    -- *** warning:
	    if rt.is_reference then
	       put_string(once "(T0*)");
	    end;
	    -- *** Hope FreeBSD gcc will be fixed (to remove this
	    -- *** stuff placed here, 30 june 2000).
	    -- ***
	    if rt.is_reference then
	       rt.c_initialize;
	    else
	       put_character('M');
	       put_integer(rt.id);
	    end;
	 end;
	 put_character(')');
	 if rt = Void then
	    put_string(fz_00);
	 end;
      end;

   push_check(rf: RUN_FEATURE; t: EXPRESSION; args: EFFECTIVE_ARG_LIST) is
      require
	 rf /= Void; t /= Void
      do
	 stack_push(C_check_id);
	 stack_rf.put(rf,top);
	 stack_target.put(t,top);
	 stack_args.put(args,top);
      end;

   use_switch(up_rf: RUN_FEATURE; r: ARRAY[RUN_CLASS];
	      t: EXPRESSION; args: EFFECTIVE_ARG_LIST) is
      require
	 up_rf /= Void;
	 r.count > 1
	 t /= Void;
	 on_c;
      local
	 rt: E_TYPE; rc: RUN_CLASS; rf: RUN_FEATURE;
	 switch: SWITCH; se_tmp_idx: INTEGER; cast: BOOLEAN;
      do
	 rt := up_rf.result_type;
	 if ace.boost and then stupid_switch(up_rf) then
	    stupid_switch_call_count := stupid_switch_call_count + 1;
	    switch_collection.remove(up_rf);
	    out_c.put_string(fz_open_c_comment);
	    out_c.put_character('X');
	    out_c.put_integer(up_rf.current_type.id);
	    out_c.put_string(up_rf.name.to_string);
	    out_c.put_string(fz_close_c_comment);
	    if rt /= Void and then rt.is_native_array then
	       cast := true;
	       out_c.put_string(fz_b7);
	       out_c.put_integer(rt.id);
	       out_c.put_character(')');
	       out_c.put_character('(');
	    end;
	    rc := r.item(1);
	    rf := rc.dynamic(up_rf);
	    push_direct(rf,t,args);
	    rf.mapping_c;
	    pop;
	    if cast then
	       out_c.put_character(')');
	       out_c.put_character(')');
	    end;
	 else
	    switched_call_count := switched_call_count + 1;
	    if rt /= Void then
	       se_tmp_idx := se_tmp_open(rt);
	    end;
	    out_c.put_string(switch.name(up_rf));
	    out_c.put_character('(');
	    if ace.no_check then
	       out_c.put_string(once "&ds,");
	       put_position(t.start_position)
	       out_c.put_character(',');
	    end;
	    t.compile_to_c;
	    if args /= Void then
	       out_c.put_character(',');
	       args.compile_to_c(up_rf.arguments);
	    end;
	    put_character(')');
	    if rt = Void then
	       out_c.put_string(fz_00);
	    elseif se_tmp_idx >= 0 then
	       se_tmp_close(se_tmp_idx);
	    end;
	 end;
      end;

   define_initialize_eiffel_runtime(rf3: RUN_FEATURE_3) is
      require
	 on_c
      local
	 no_check: BOOLEAN; rc: RUN_CLASS; ct: E_TYPE;
      do
	 no_check := ace.no_check;
	 ct := rf3.current_type;
	 rc := rf3.run_class;
	 echo.put_string(once "Define initialize stuff.%N");
	 small_eiffel.define_extern_tables;
	 put_c_heading(once "void initialize_eiffel_runtime(int argc,char*argv[])");
	 if no_check then
	    out_c.put_string(
             once "se_frame_descriptor irfd={%"Initialysing runtime.%",%
	     %0,0,%"%",1};%N%
             %se_dump_stack ds = {NULL,NULL,0,NULL,NULL};%N%
             %ds.fd=&irfd;%N%
             %ds.caller=se_dst;%N");
	 end;
	 out_c.put_string(once "se_argc=argc;%Nse_argv=argv;%N");
	 gc_handler.initialize_runtime;
	 exceptions_handler.initialize_runtime;
	 if no_check then
	    small_eiffel.initialize_path_table;
	 end;
	 if small_eiffel.generator_used then
	    small_eiffel.initialize_generator;
	 end;
	 if small_eiffel.generating_type_used then
	    small_eiffel.initialize_generating_type;
	 end;
	 if not exceptions_handler.used then
	    out_c.put_string(
	     once "#ifdef SIGINT%Nsignal(SIGINT,se_signal_handler);%N#endif%N%
	     %#ifdef SIGQUIT%Nsignal(SIGQUIT,se_signal_handler);%N#endif%N%
	     %#ifdef SIGTERM%Nsignal(SIGTERM,se_signal_handler);%N#endif%N%
	     %#ifdef SIGBREAK%Nsignal(SIGBREAK,se_signal_handler);%N#endif%N%
	     %#ifdef SIGKILL%Nsignal(SIGKILL,se_signal_handler);%N#endif%N");
	 end;
	 once_manifest_string_pool.c_call_initialize;
	 once_routine_pool.c_pre_compute;
	 if ace.trace_support then
	    out_c.put_string(once "se_trace_flag=1;%N");
	 end;
	 if not gc_handler.is_off then
	    out_c.put_string(fz_48);
	 end;
	 gc_handler.allocation_of(fz_eiffel_root_object,rc);
	 if ace.no_check then
	    out_c.put_string(once "se_dst=NULL;%N");
	 end;
	 out_c.put_string(fz_12);
      ensure
	 on_c
      end;

   check_assertion_mode: STRING;

   inspect_level: INTEGER;

   inline_level: INTEGER;

   check_id(e: EXPRESSION; id: INTEGER) is
	 -- Produce a C expression checking that `e' is not void and
	 -- that `e' is really of type `id'.
	 -- The result of the C expression is the pointer to the
	 -- corresponding Object.
      require
	 e.result_type.run_type.is_reference;
	 id > 0;
      do
	 if ace.no_check then
	    put_string(once "((T");
	    put_integer(id);
	    put_string(once "*)ci(");
	    put_integer(id);
	    put_character(',');
	    e.compile_to_c;
	    put_character(',');
	    put_position(e.start_position);
	    put_string(fz_13);
	    check_id_call_count := check_id_call_count + 1;
	 else
	    e.compile_to_c;
	    direct_call_count := direct_call_count + 1;
	 end;
      end;

   same_base_feature(r: ARRAY[RUN_CLASS]; up_rf: RUN_FEATURE): BOOLEAN is
	 -- True if all have the same final name and the same base_feature.
      require
	 not r.empty;
	 up_rf /= Void
      local
	 i: INTEGER;
	 up_bf, bf: E_FEATURE;
	 up_name, name: FEATURE_NAME;
	 rf: RUN_FEATURE;
      do
	 from
	    up_bf := up_rf.base_feature;
	    up_name := up_rf.name;
	    i := r.lower;
	    Result := true;
	 until
	    not Result or else i > r.upper
	 loop
	    rf := r.item(i).dynamic(up_rf);
	    bf := rf.base_feature;
	    name := rf.name;
	    Result := name.is_equal(up_name) and then bf = up_bf;
	    i := i + 1;
	 end;
      end;

   tmp_string: STRING is
      once
	 !!Result.make(256);
      end;

   tmp_string2: STRING is
      once
	 !!Result.make(128);
      end;

   tmp_string3: STRING is
      once
	 !!Result.make(128);
      end;

   need_invariant(target_type: E_TYPE): RUN_CLASS is
	 -- Give the good RUN_CLASS when `target_type' need some
	 -- class invariant checking.
      require
	 target_type.is_run_type
      do
	 Result := target_type.run_type.run_class;
	 if Result.at_run_time and then
	    Result.class_invariant /= Void then
	 else
	    Result := Void;
	 end;
      end;

   split_count: INTEGER;
	 -- Number of *.c files.

   path_h: STRING is
      once
	 Result := system_tools.path_h;
      ensure
	 Result.has_suffix(h_suffix)
      end;

   path_c: STRING is
      once
	 if ace.no_split then
	    Result := path_h.twin;
	    Result.remove_last(1);
	    Result.extend('c');
	 else
	    split_count := 1;
	    !!Result.make(path_h.count + 4);
	    path_c_in(Result,split_count);
	 end;
      ensure
	 Result.has_suffix(c_suffix);
      end;

   path_make: STRING is
      once
	 Result := path_h.twin;
	 Result.remove_last(2);
	 Result.append(system_tools.make_suffix);
      ensure
	 Result.has_suffix(system_tools.make_suffix);
      end;

   add_first_include(the_first_include: STRING) is
      do
	 put_banner(out_c);
	 add_include_on(out_c,the_first_include);
      end;

   put_banner(output: TEXT_FILE_WRITE) is
      require
	 output.is_connected
      do
	 output.put_string(once "/*%NANSI C code generated by ");
	 output.put_string(small_eiffel.copyright);
	 output.put_string(once "C Compiler options used: ");
	 output.put_string(system_tools.c_compiler_options);
	 output.put_string(once "%N*/%N");
      end;

   c_code_saved: BOOLEAN;

   get_inline_ms: MANIFEST_STRING is
      local
	 e: EXPRESSION;
      do
	 e := stack_args.item(top).expression(1);
	 Result ?= e;
	 if Result = Void then
	    eh.add_position(e.start_position);
	    fatal_error("Bad usage of C inlining (argument%
			% is not a manifest string).");
	 end;
      end;

   backup_tfw_connect(sfw: TEXT_FILE_WRITE; c_path: STRING) is
      require
	 not ace.no_split
      do
	 tmp_path.copy(c_path);
	 tmp_path.remove_last(2);
	 tmp_path.append(system_tools.object_suffix);
	 if file_exists(tmp_path) then
	    if file_exists(c_path) then
	       c_path.put('d',c_path.count);
	    end;
	 end;
	 echo.tfw_connect(sfw,c_path);
      end;

   path_c_in(str: STRING; number: INTEGER) is
      do
	 str.clear;
	 str.append(path_h);
	 str.remove_last(2);
	 number.append_in(str);
	 str.extend('.');
	 str.extend('c');
      end;

   write_make_file_split is
      require
	 not ace.no_split
      local
	 i: INTEGER;
	 no_change, recompile: BOOLEAN;
	 executable_name: STRING;
      do
	 from
	    no_change := true;
	    i := split_count;
	 until
	    i = 0
	 loop
	    recompile := true;
	    path_c_in(tmp_path,i);
	    tmp_string.copy(tmp_path);
	    tmp_string.put('d',tmp_string.count);
	    if file_exists(tmp_string) then
	       if file_tools.same_files(tmp_path,tmp_string) then
		  echo.put_string(fz_01);
		  echo.put_string(tmp_path);
		  echo.put_string(once "%" not changed.%N");
		  echo.file_removing(tmp_string);
		  recompile := false;
	       else
		  echo.file_renaming(tmp_string,tmp_path);
	       end;
	    end;
	    if recompile then
	       tmp_string2.copy(path_h);
	       tmp_string2.remove_last(2);
	       i.append_in(tmp_string2);
	       tmp_string2.extend('.');
	       tmp_string2.extend('c');
	       system_tools.split_mode_c_compiler_command(tmp_string,
							  tmp_string2);
	       echo_make;
	       no_change := false;
	    end;
	    i := i - 1;
	 end;
	 executable_name := ace.executable_name;
	 if no_change and then executable_name /= Void then
	    no_change := file_exists(executable_name)
	 else
	    no_change := false;
	 end;
	 if no_change and then not system_tools.is_linking_mandatory then
	    executable_is_up_to_date := true;
	    echo.put_string(once "Executable is up-to-date %
			    %(no C compilation, no linking done).%N");
	 else
	    tmp_string2.copy(path_h);
	    tmp_string2.remove_last(2);
	    system_tools.split_mode_linker_command(tmp_string,
						   tmp_string2,split_count);
	    echo_make;
	 end;
      end;

   executable_is_up_to_date: BOOLEAN;
	 -- When the executable seems to be already correct (no C
	 -- compilation and no linking is to be done).

   write_make_file_no_split is
      require
	 ace.no_split
      do
	 system_tools.no_split_mode_command(tmp_string,path_c);
	 echo_make;
      end;

   common_put_target is
      local
	 rf: RUN_FEATURE; flag: BOOLEAN; e: EXPRESSION; ct: E_TYPE;
	 c_name: STRING;
      do
	 inspect
	    stack_code.item(top)
	 when C_inside_twin then
	    rf := stack_rf.item(top);
	    ct := rf.current_type;
	    if ct.is_reference then
	       out_c.put_character('(');
	       ct.mapping_cast;
	       out_c.put_character('R');
	       out_c.put_character(')');
	    else
	       out_c.put_character('&');
	       out_c.put_character('R');
	    end;
	 when C_create_instruction, C_create_expression then
	    out_c.put_character('n');
	 when C_switch then
	    rf := stack_rf.item(top);
	    flag := call_invariant_start(rf.current_type);
	    out_c.put_string(once "((T");
	    out_c.put_integer(rf.id);
	    out_c.put_string(once "*)C)");
	    if flag then
	       call_invariant_end;
	    end;
	 when C_expanded_initialize then
	    out_c.put_character('&');
	    e := stack_target.item(top);
	    if e /= Void then
	       e.compile_to_c;
	    else
	       c_name := stack_string.item(top);
	       if c_name /= Void then
		  out_c.put_string(c_name);
	       else
		  out_c.put_string(once "n->_");
		  out_c.put_string(stack_rf.item(top).name.to_string);
	       end;
	    end;
	 when C_inline_one_pc then
	    print_current;
	 when C_precursor then
	    out_c.put_character('C');
	 end;
      end;

   put_file(tfr: TEXT_FILE_READ; output: TEXT_FILE_WRITE) is
      require
	 not tfr.end_of_input
      do
	 from
	    tfr.read_character;
	 until
	    tfr.end_of_input
	 loop
	    output.put_character(tfr.last_character);
	    tfr.read_character;
	 end;
	 tfr.disconnect;
      ensure
	 not tfr.is_connected
      end;

   really_define_c_main(rf3: RUN_FEATURE_3) is
      require
	 not ace.no_main
      local
	 id: INTEGER; rc: RUN_CLASS; ct: E_TYPE;
      do
	 echo.put_string(once "Define C main function.%N");
	 ct := rf3.current_type;
	 rc := rf3.run_class;
	 id := rc.id;
	 system_tools.put_c_main_function_type(out_c);
	 out_c.put_string(once " main(int argc,char*argv[]){%N%
			  %initialize_eiffel_runtime(argc,argv);%N");
	 out_c.put_string(once "{T");
	 out_c.put_integer(id);
	 out_c.put_string(once "*n=eiffel_root_object;%N");
	 if ace.no_check then
	    out_c.put_string(once "se_frame_descriptor root={%"System root.%",1,0,%"");
	    tmp_string.clear;
	    ct.c_frame_descriptor_in(tmp_string);
	    out_c.put_string(tmp_string);
	    out_c.put_string(once "%",1};%N%
			       %se_dump_stack ds;%N%
			       %ds.fd=&root;%N%
			       %ds.current=((void**)(&n));%N");
	    put_position_in_ds(rf3.start_position);
	    out_c.put_string(once "ds.caller=NULL;%Nse_dst=&ds;/*link*/%N");
	 end;
	 expanded_attributes(ct);
	 push_create_instruction(rf3,Void);
	 rf3.mapping_c;
	 pop;
	 if rc.class_invariant /= Void then
	    out_c.put_string(fz_se_i);
	    out_c.put_integer(id);
	    out_c.put_string(once "(&ds,n);%N");
	 end;
	 gc_handler.gc_info_before_exit;
	 system_tools.put_c_main_function_exit(out_c);
      end;

   bit_constant_pool: FIXED_ARRAY[BIT_CONSTANT];

   fz_se_bit_constant: STRING is "se_bit_constant";

   se_tmp_level: INTEGER;

   se_tmp_list: FIXED_ARRAY[E_TYPE] is
      once
	 !!Result.with_capacity(4);
      end;

   fz_base: STRING is "base";

   bunch_counter, bunch_size: INTEGER;

   split_c_file_now(new_bunch_size: INTEGER) is
      do
	 split_count := split_count + 1;
	 out_c.put_character('%N');
	 out_c.disconnect;
	 path_c_in(path_c,split_count);
	 backup_tfw_connect(out_c,path_c);
	 add_first_include(path_h);
	 if current_out /= out_h then
	    current_out := out_c;
	 end;
	 bunch_counter := 1;
	 bunch_size := new_bunch_size;
      end;

   include_memory: SET[STRING];

   put_position_comment_on(output: TEXT_FILE_WRITE;
			   mark: CHARACTER; p: POSITION) is
      require
	 mark = '[' or mark = ']';
	 not p.is_unknown
      do
	 output.put_string(fz_open_c_comment);
	 if mark = '[' then output.put_character('[') end;
	 output.put_string(once " from line ");
	 output.put_integer(p.line);
	 output.put_string(once " of ");
	 output.put_string(p.path);
	 if mark = ']' then
	    output.put_character(']');
	 else
	    output.put_character(':');
	 end;
	 output.put_string(fz_close_c_comment);
	 output.put_character('%N');
      end;

end -- C_PRETTY_PRINTER

