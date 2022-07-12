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
class RUN_CLASS
   --
   -- Only for class with objects at execution time.
   --

inherit
   HASHABLE redefine is_equal end;
   GLOBALS;
   ASSERTION_LEVEL_NUMBERING;

creation {SMALL_EIFFEL} make

feature

   current_type: E_TYPE;
         -- The runnable corresponding one.

   run_time_mark: STRING;
	 -- Alias the one of `current_type'.

   base_class: BASE_CLASS;
         -- Alias the one of `current_type'.

   base_class_name: CLASS_NAME;
         -- Alias the one of `base_class'.

   id: INTEGER;
         -- Id of the receiver to produce C code.

   at_run_time: BOOLEAN;
         -- True if `current_type' is really created (only when
         -- direct instances of `current_type' exists at run time).

   running: ARRAY[RUN_CLASS];
         -- Void or the set of all `at_run_time' directly compatible
         -- run classes. A run class is directly compatible with one
         -- another only when it can be directly substitute with
         -- current run class. Thus, if current run class is
	 -- reference, `running' are all reference run classes. If current
	 -- run class is expanded, `running' has only one element (the
	 -- current class itself).

   run_time_set: RUN_TIME_SET is
         -- Void or the set of all possible other types which may be
         -- actually returned by an expression of the `Current' type.
	 -- This information is only available when whole system
	 -- analysis is completely finished (see `small_eiffel.status').
	 -- Thus, if the type of `Current' is a reference type, the
	 -- `run_time_set' has only reference run classes elements. If the
	 -- type of `Current' is an expanded type, the `run_time_set'
	 -- has only `Current' as a single element. Futhermore, the
	 -- size of the `run_time_set' depends on live assignments
	 -- (as well as argument passing and creation statement) that
	 -- are found in the live code.
      require
	 small_eiffel.status >= 1
      do
	 Result := run_time_set_memory;
      end;

   class_invariant: CLASS_INVARIANT;
         -- Collected Runnable invariant if any and only is necessary.

   compile_to_c_done: BOOLEAN;
         -- True if `compile_to_c' has already be called.

   hash_code: INTEGER;
	 -- Actually, in order to speed up the compiler, this is a cache
	 -- for value `run_time_mark'.

   is_equal(other: like Current): BOOLEAN is
      do
	 Result := Current = other;
      end;

feature {RUN_CLASS,E_STRIP}

   feature_dictionary: DICTIONARY[RUN_FEATURE,FEATURE_NAME];
         -- Access to the runnable version of a feature.

feature {NONE}

   tagged_mem: INTEGER;
         -- 0 when not computed, 1 when tagged or -1

   make(t: like current_type; rtm: STRING) is
      require
	 rtm = t.run_time_mark;
         t.run_type = t;
      local
         rcd: DICTIONARY[RUN_CLASS,STRING]; rc: RUN_CLASS;
         i: INTEGER; type_tuple: TYPE_TUPLE;
      do
	 run_time_mark := rtm;
	 hash_code := rtm.hash_code;
         create feature_dictionary.make;
         small_eiffel.run_class_dictionary.add(Current,rtm);
         compile_to_c_done := true;
         current_type := t;
         !!actuals_clients.with_capacity(16);
         base_class := t.base_class;
         base_class_name := t.base_class_name;
         id := id_provider.item(rtm);
         small_eiffel.incr_magic_count;
         if t.is_expanded then
            set_at_run_time;
            base_class.check_expanded_with(t);
         else
            from
               rcd := small_eiffel.run_class_dictionary;
               i := 1;
            until
               i > rcd.count
            loop
               rc := rcd.item(i);
               if rc.at_run_time and then
                  rc.current_type.is_reference and then
                  rc.is_running_of(Current)
                then
                  add_running(rc);
               end;
               i := i + 1;
            end;
         end;
	 type_tuple ?= Current;
	 if type_tuple /= Void then
	    type_tuple.load_basic_features;
	 end;
      ensure
         current_type = t
      end;

feature

   is_tagged: BOOLEAN is
      require
         small_eiffel.is_ready
      do
         if tagged_mem = 0 then
            if current_type.is_expanded then
               tagged_mem := -1;
            elseif at_run_time then
               if ace.boost then
                  if small_eiffel.is_tagged(Current) then
                     tagged_mem := 1;
                  else
                     tagged_mem := -1;
                  end;
               else
                  tagged_mem := 1;
               end;
            end;
         end;
         Result := tagged_mem = 1;
      ensure
         tagged_mem /= 0
      end;

   is_expanded: BOOLEAN is
      do
         Result := current_type.is_expanded;
      end;

   writable_attributes: ARRAY[RUN_FEATURE_2] is
         -- Computed and ordered array of writable attributes. Storage in C
         -- struct is to be done in reverse order (from `upper' to `lower').
         -- Order is done according to the level of attribute definition in
         -- the inheritance graph to allow more stupid switch to be removed.
      require
         small_eiffel.is_ready;
         at_run_time
      local
         rf2: RUN_FEATURE_2;
         i: INTEGER;
      do
         if writable_attributes_mem = Void then
            from
               i := 1;
            until
               i > feature_dictionary.count
            loop
               rf2 ?= feature_dictionary.item(i);
               if rf2 /= Void then
                  if writable_attributes_mem = Void then
                     !!writable_attributes_mem.with_capacity(4,1);
		  end;
		  writable_attributes_mem.add_last(rf2);
               end;
               i := i + 1;
            end;
            if writable_attributes_mem /= Void then
               sort_wam(writable_attributes_mem);
            end;
         end;
         Result := writable_attributes_mem;
      ensure
         Result /= Void implies Result.lower = 1
      end;

   is_running_of(other: like Current): BOOLEAN is
         -- Can the Current RUN_CLASS be used in place of `other'.
      require
         other /= Void
      local
         t1, t2: E_TYPE;
      do
         if other = Current then
            Result := true;
         else
            t1 := current_type;
	    t2 := other.current_type;
	    if t1.is_basic_eiffel_expanded and then
	       t2.is_basic_eiffel_expanded then
	    else
	       Result := t1.is_a(t2);
	       if not Result then
		  eh.cancel;
	       end;
	    end;
         end;
      ensure
         nb_errors = old nb_errors
      end;

   c_sizeof: INTEGER is
         -- The C sizeof for an object of this RUN_CLASS on the
         -- current architecture.
      require
         at_run_time
      local
         wa: ARRAY[RUN_FEATURE_2];
         a: RUN_FEATURE_2;
         i: INTEGER;
      do
         if is_tagged then
            Result := (1).object_size;
         end;
         wa := writable_attributes;
         if wa /= Void then
            from
               i := wa.upper;
            until
               i = 0
            loop
               a := wa.item(i);
               Result := Result + a.result_type.c_sizeof;
               i := i - 1;
            end;
         end;
         if Result = 0 then
            Result := 1;
         end;
      end;

feature {TYPE_TUPLE,SMALL_EIFFEL}

   definitions_for_tuple(type_tuple: TYPE_TUPLE; types: ARRAY[E_TYPE]) is
	 -- Add extra Eiffel code to handle the TUPLE type.
      require
	 type_tuple = type_tuple.run_type
      local
	 count, i: INTEGER; name: STRING; sp: POSITION;
	 sfn: FEATURE_NAME; cai: CST_ATT_INTEGER; rf: RUN_FEATURE;
      do
	 if not feature_dictionary.has(count_fn) then
	    if types /= Void then
	       count := types.count;
	    end;
	    -- Adding `count':
	    sp.set_in(type_tuple.base_class);
	    create sfn.simple_feature_name(as_count,sp);
	    !!cai.implicit(type_tuple.base_class,sfn,count);
	    rf := cai.to_run_feature(type_tuple,sfn);
	    -- Adding attributes (read/write):
	    if count >= 1 then
	       tuple_field(type_tuple,as_first,types.item(1));
	    end;
	    if count >= 2 then
	       tuple_field(type_tuple,as_second,types.item(2));
	    end;
	    if count >= 3 then
	       tuple_field(type_tuple,as_third,types.item(3));
	    end;
	    if count >= 4 then
	       tuple_field(type_tuple,as_fourth,types.item(4));
	    end;
	    if count >= 5 then
	       tuple_field(type_tuple,as_fifth,types.item(5));
	    end;
	    from
	       i := 6;
	    until
	       i > count
	    loop
	       !!name.make(8);
	       name.copy(once "item_");
	       i.append_in(name);
	       name := string_aliaser.item(name);
	       tuple_field(type_tuple,name,types.item(i));
	       i := i + 1;
	    end;
	 end;
      end;

feature {NONE}

   tuple_field(type_tuple: E_TYPE; name: STRING; type: E_TYPE) is
	 -- Add a new writable attribute supposed to be written in `type_tuple'.
      require
	 type_tuple /= Void;
	 string_aliaser.item(name) = name;
	 type /= Void
      local
	 sp: POSITION; bc: BASE_CLASS; wa: WRITABLE_ATTRIBUTE;
	 sfn, set_sfn: FEATURE_NAME; rf2: RUN_FEATURE_2; rf: RUN_FEATURE;
	 set_name: STRING; aw: E_PROCEDURE;
      do
	 bc := type_tuple.base_class;
	 sp.set_in(bc);
	 -- The attribute:
	 create sfn.simple_feature_name(name,sp);
	 check
	    not feature_dictionary.has(sfn)
	 end;
	 create wa.implicit(bc,sfn,type);
	 rf2 := wa.to_run_feature(type_tuple,sfn);
	 sfn.set_run_feature_2(rf2);
	 -- The procedure to write the attribute:
	 set_name := once "set_" + name;
	 set_name := string_aliaser.item(set_name);
	 create set_sfn.simple_feature_name(set_name,sp);
	 check
	    not feature_dictionary.has(set_sfn)
	 end;
	 create aw.attribute_writer(bc,set_sfn,sfn);
	 rf := aw.to_run_feature(type_tuple,set_sfn);
	 check
	    feature_dictionary.has(sfn);
	    feature_dictionary.has(set_sfn);
	 end;
      end;

feature {E_TYPE}

   jvm_to_reference is
         -- Produce code to convert the pushed expanded into the
         -- corresponding TYPE_REF_TO_EXP type.
      require
         current_type.is_expanded
      local
         ref_type: E_TYPE;
      do
         ref_type := current_type.actual_reference(type_any);
         ref_type.run_class.jvm_reference_from(current_type);
      end;

feature {RUN_CLASS}

   jvm_reference_from(exp_type: E_TYPE) is
      require
         current_type.is_reference and exp_type.is_expanded
      local
         idx: INTEGER; ca: like code_attribute; cp: like constant_pool;
      do
         ca := code_attribute;
         cp := constant_pool;
         idx := jvm_constant_pool_index;
         ca.opcode_new(idx);
         ca.opcode_dup;
         idx := cp.idx_methodref1(idx,fz_35,fz_29);
         ca.opcode_invokespecial(idx,-1);
         ca.opcode_dup_x1;
         ca.opcode_swap;
         tmp_string.clear;
         exp_type.jvm_descriptor_in(tmp_string);
         idx := cp.idx_fieldref3(fully_qualified_name,as_item,tmp_string);
         ca.opcode_putfield(idx,-2);
      end;

feature {TYPE_LIKE_FEATURE}

   get_result_type(fn: FEATURE_NAME; ct: E_TYPE): E_TYPE is
         -- Computes only the result type of `fn' when this feature
         -- is not yet runnable.
         -- Possible rename is also done using the `start_position' of
         -- `fn'. No return when an error occurs because `fatal_error'
         -- is called.
      require
         not small_eiffel.is_ready;
         fn /= Void
      local
         fn2: FEATURE_NAME; wbc: BASE_CLASS; rf: RUN_FEATURE;
         f: E_FEATURE; bc: BASE_CLASS;
      do
         wbc := fn.start_position.base_class;
         fn2 := base_class.new_name_of(wbc,fn);
	 rf := feature_dictionary.reference_at(fn2);
         if rf /= Void then
            Result := rf.result_type;
            if Result.is_run_type then
               Result := Result.run_type;
            else
               Result := Result.to_runnable(current_type);
               Result := Result.run_type;
            end;
         else
            bc := base_class;
            f := bc.look_up_for(Current,fn2);
            if f = Void then
               efnf(bc,fn2);
               eh.add_position(fn.start_position);
               eh.add_position(fn2.start_position);
               fatal_error(" Anchor not found.");
            else
               Result := f.result_type;
               if Result = Void  then
                  eh.add_position(f.start_position);
                  eh.add_position(fn.start_position);
                  eh.add_position(fn2.start_position);
                  fatal_error(" Anchor found is a procedure.");
               else
                  Result := Result.to_runnable(current_type);
                  Result := Result.run_type;
               end;
            end;
         end;
      ensure
         Result = Result.run_type
      end;

feature

   get_rf_with(fn: FEATURE_NAME): RUN_FEATURE is
         -- Compute or simply fetch the corresponding RUN_FEATURE.
         -- Possible rename are also done using `start_position' of
         -- `fn'. No return when an error occurs because `fatal_error'
         -- is called.
      require
         base_class = fn.start_position.base_class or else
         base_class.is_subclass_of(fn.start_position.base_class)
      local
         fn2: FEATURE_NAME; wbc: BASE_CLASS;
      do
         wbc := fn.start_position.base_class;
         fn2 := base_class.new_name_of(wbc,fn);
         if fn2 /= fn then
            eh.add_position(fn.start_position);
            Result := get_or_fatal_error(fn2);
            eh.cancel;
         else
            Result := get_or_fatal_error(fn2);
         end;
      ensure
         Result /= Void
      end;

   dynamic(up_rf: RUN_FEATURE): RUN_FEATURE is
         -- Assume the current type of `up_rf' is a kind of
         -- `current_type'. The result is the concrete one
         -- according to dynamic dispatch rules.
      require
         up_rf /= Void;
         is_running_of(up_rf.run_class)
      local
         fn, up_fn: FEATURE_NAME; up_type: E_TYPE;
      do
         up_type := up_rf.current_type;
         if Current = up_type.run_class then
            Result := up_rf;
         else
            up_fn := up_rf.name;
            fn := base_class.new_name_of(up_type.base_class,up_fn);
            Result := get_or_fatal_error(fn);
         end;
      ensure
         Result /= Void;
         Result.run_class = Current;
      end;

feature

   a_default_create: RUN_FEATURE_3 is
	 -- When the corresponding `base_class' has a `default_create' or to get the
	 -- creation procedure of and expanded class.
      local
	 bc: BASE_CLASS;
      do
	 bc := base_class;
	 Result := base_class.a_default_create(current_type);
      end;

   set_at_run_time is
         -- Set Current `at_run_time' and do needed update of others
         -- instances of RUN_CLASS.
      require
	 -- small_eiffel.status < 3
      local
         rcd: DICTIONARY[RUN_CLASS,STRING]; rc: RUN_CLASS; i: INTEGER;
      do
         if not at_run_time  then
	    check small_eiffel.status < 3 end;
            at_run_time := true;
            compile_to_c_done := false;
            add_running(Current);
            small_eiffel.incr_magic_count;
            if current_type.is_reference then
               from
                  rcd := small_eiffel.run_class_dictionary;
                  i := 1;
               until
                  i > rcd.count
               loop
                  rc := rcd.item(i);
                  if Current.is_running_of(rc) then
                     rc.add_running(Current);
                  end;
                  i := i + 1;
               end;
            end;
         end;
      ensure
         at_run_time;
         running.has(Current)
      end;

feature {E_TYPE}

   gc_mark_to_follow: BOOLEAN is
	 -- *** TO REMOVE ***
      local
         i: INTEGER; r: like running; rc: like Current;
      do
         r := running;
         if r /= Void then
            from
               i := r.upper;
            until
               Result or else i = 0
            loop
               rc := r.item(i);
               if rc = Current then
                  Result := need_gc_mark;
               else
                  Result := rc.current_type.need_gc_mark_function;
               end;
               i := i - 1;
            end;
         end;
      end;

feature {E_TYPE}

   c_print_function is
      require
         ace.no_check
      local
         body: STRING; ct, t: E_TYPE; i: INTEGER;  wa: like writable_attributes;
         rf2: RUN_FEATURE_2;
      do
         body := c_code_buffer;
         body.clear;
         ct := current_type;
         tmp_string.copy(once "void se_prinT");
         id.append_in(tmp_string);
         tmp_string.append(once "(T");
         id.append_in(tmp_string);
         if ct.is_reference then
            tmp_string.extend('*');
         end;
         tmp_string.append(once "*o)");
         if ct.is_reference then
            body.append(once "if(*o==NULL){%N%
                        %fprintf(SE_ERR,%"Void%");%N%
                        %return;%N}%N");
         end;
         body.append(once "fprintf(SE_ERR,%"");
         body.append(run_time_mark);
         body.append(once "%");%N");
         if ct.is_reference or else ct.is_native_array then
            body.append(once "fprintf(SE_ERR,%"#%%p%",*o);%N");
         end;
         wa := writable_attributes;
         if wa /= Void then
            body.append(once "fprintf(SE_ERR,%"\n\t[ %");%N");
            from
               i := wa.upper;
            until
               i = 0
            loop
               rf2 := wa.item(i);
               t := rf2.result_type;
               body.append(once "fprintf(SE_ERR,%"");
               body.append(rf2.name.to_string);
               body.append(once " = %");%Nse_prinT");
               if t.is_expanded then
                  t.id.append_in(body);
		  body.extend('(');
              elseif t.is_string then
		  body.append(once "7((EIF_STRING*)");
               else
		  body.append(once "0((T0**)");
               end;
               body.append(once "(&((*o)");
               if ct.is_reference then
                  body.append(once "->");
               else
                  body.extend('.');
               end;
               body.extend('_');
               body.append(rf2.name.to_string);
               body.append(once ")));%N");
               i := i - 1;
               if i > 0 then
                  body.append(once "fprintf(SE_ERR,%"\n\t  %");%N");
               end;
            end;
            body.append(once "fprintf(SE_ERR,%"\n\t]%");%N");
         end;
         cpp.put_c_function(tmp_string,body);
      end;

   c_object_model_in(str: STRING) is
      local
         wa: like writable_attributes;
         i: INTEGER;
         rf2: RUN_FEATURE_2;
         t: E_TYPE;
      do
         wa := writable_attributes;
         if wa = Void then
            if is_tagged then
               str.extend('{');
               id.append_in(str);
               str.extend('}');
            else
               current_type.c_initialize_in(str);
            end;
         else
            str.extend('{');
            if is_tagged then
               id.append_in(str);
               str.extend(',');
            end;
            from
               i := wa.upper;
            until
               i = 0
            loop
               rf2 := wa.item(i);
               t := rf2.result_type;
               t.c_initialize_in(str);
               i := i - 1;
               if i > 0 then
                  str.extend(',');
               end;
            end;
            str.extend('}');
         end;
      end;

feature {SMALL_EIFFEL}

   falling_down is
         -- Falling down of Current `feature_dictionary' in `running'.
      local
         rf: RUN_FEATURE; i: INTEGER;
      do
         from
            i := 1;
         until
            i > feature_dictionary.count
         loop
            rf := feature_dictionary.item(i);
            rf.fall_down;
            i := i + 1;
         end;
         gc_handler.falling_down(Current);
         runnable_class_invariant;
	 if small_eiffel.deep_twin_used then
	    if current_type.is_native_array then
	       rf := get_feature_with(as_deep_twin_from);
	    else
	       rf := get_feature_with(as_deep_twin);
	    end;
	 end;
	 if small_eiffel.is_deep_equal_used then
	    if current_type.is_native_array then
	       rf := get_feature_with(as_deep_memcmp);
	    else
	       rf := get_feature_with(as_deep_equal);
	       rf := get_feature_with(as_is_deep_equal);
	    end;
	 end;
      end;

   afd_check is
         -- After Falling Down Check.
      local
         rf: RUN_FEATURE; i: INTEGER; rc: like Current; rt: E_TYPE;
      do
         from
            i := 1;
         until
            i > feature_dictionary.count
         loop
            rf := feature_dictionary.item(i);
            rf.afd_check;
            rt := rf.result_type;
            if rt /= Void then
               if rt.is_none then
               else
                  rc := rt.run_class;
               end;
            end;
            i := i + 1;
         end;
         if class_invariant /= Void then
            class_invariant.afd_check;
         end;
      end;

feature {SHORT}

   runnable_class_invariant is
      local
	 ct: like current_type
      do
         if not runnable_class_invariant_done then
            runnable_class_invariant_done := true;
	    ct := current_type;
            if ((ct.base_class.invariant_check and then at_run_time)
		or else
		small_eiffel.short_flag)
	     then
	       assertion_collector.invariant_start;
	       base_class.collect_invariant(Current);
	       class_invariant := assertion_collector.invariant_end(ct);
	    end;
         end;
      end;

feature

   c_header_pass1 is
      require
         cpp.on_h
      do
         if at_run_time then
            if c_header_pass_level_done < 1 then
               current_type.c_header_pass1;
               c_header_pass_level_done := 1;
            end;
         end;
      ensure
         cpp.on_h
      end;

   c_header_pass2 is
      require
         cpp.on_h
      do
         if at_run_time then
            if c_header_pass_level_done < 2 then
               current_type.c_header_pass2;
               c_header_pass_level_done := 2;
            end;
         end;
      ensure
         cpp.on_h
      end;

   c_header_pass3 is
      require
         cpp.on_h
      local
         i: INTEGER;
         attribute_type: E_TYPE;
      do
         if at_run_time then
            if c_header_pass_level_done < 3 then
               if current_type.is_user_expanded and then
                  writable_attributes /= Void
                then
                  from
                     i := writable_attributes.upper;
                  until
                     i = 0
                  loop
                     attribute_type := writable_attributes.item(i).result_type;
                     if attribute_type.is_expanded then
                        attribute_type.run_class.c_header_pass3;
                     end;
                     i := i - 1;
                  end;
               end;
               current_type.c_header_pass3;
               c_header_pass_level_done := 3;
            end;
         end;
      ensure
         cpp.on_h
      end;

   c_header_pass4 is
      require
         cpp.on_h
      do
         if at_run_time then
            if c_header_pass_level_done < 4 then
               current_type.c_header_pass4;
               c_header_pass_level_done := 4;
            end;
         end;
      ensure
         cpp.on_h
      end;

feature {GC_HANDLER}

   get_memory_dispose: RUN_FEATURE_3 is
      local
         memory, bc: BASE_CLASS;
      do
         memory := small_eiffel.memory_class_used;
         if memory /= Void then
            bc := base_class;
            if memory /= bc and then bc.is_subclass_of(memory) then
               if bc.has_simple_feature_name(as_dispose) then
                  Result ?= get_feature_with(as_dispose);
                  if Result /= Void then
                     Result := Result.memory_dispose;
                 end;
               end;
            end;
         end;
      end;

   gc_define1 is
      require
         not gc_handler.is_off
      do
         if at_run_time then
	    cpp.next_bunch_size(1);
            current_type.gc_define1;
         end;
      end;

   gc_define2 is
      require
         not gc_handler.is_off
      do
         if at_run_time then
	    cpp.next_bunch_size(4);
            current_type.gc_define2;
         end;
      end;

   gc_info_in(str: STRING) is
         -- Produce C code to print GC information.
      require
         not gc_handler.is_off;
         gc_handler.info_flag
      do
         if at_run_time then
            current_type.gc_info_in(str);
         end;
      end;

   just_before_gc_mark_in(body: STRING) is
      require
         not gc_handler.is_off
      do
         if at_run_time then
            current_type.just_before_gc_mark_in(body);
         end;
      end;

   gc_initialize is
         -- Produce code to initialize GC in the main C function.
      require
         not gc_handler.is_off
      do
         if at_run_time then
            current_type.gc_initialize;
         end;
      end;

feature {E_TYPE}

   gc_mark_fixed_size(is_unmarked: BOOLEAN; body: STRING) is
         -- The main purpose is to compute for example the best body for
         -- the corresponding gc_markXXX function (as well as
         -- gc_align_markXXX). In fact, this feature can be called to
         -- produce C code when C variable `o' is not NULL and when `o' is of
         -- some concrete type (Tid*) where `id' is the one of the current
         -- RUN_CLASS. -- Finally, when `is_unmarked' is true, object `o' is
         -- unmarked.
      require
         not gc_handler.is_off;
         not current_type.is_native_array;
         at_run_time
      local
         rf2: RUN_FEATURE_2;
         t: E_TYPE;
         rc: RUN_CLASS;
         i: INTEGER;
      do
         wa_buf.clear;
         wa_cyclic_buf.clear;
         if writable_attributes /= Void then
            from
               i := writable_attributes.upper;
            until
               i = 0
            loop
               rf2 := writable_attributes.item(i);
               t := rf2.result_type;
               if t.need_gc_mark_function then
                  rc :=  t.run_class;
                  wa_cycle.clear;
                  wa_cycle.add_last(rf2);
                  if rc.is_wa_cycle(Current) then
                     wa_cyclic_buf.add_last(rf2);
                  else
                     wa_buf.add_last(rf2);
                  end;
               end;
               i := i - 1;
            end;
         end;
         if wa_buf.is_empty and then wa_cyclic_buf.is_empty then
            gc_set_fsoh_marked_in(body);
         else
            if wa_cyclic_buf.upper >= 0 then
               body.append(once "begin:%N");
            end;
            if not is_unmarked then
               body.append(
                  once "if(((gc");
               id.append_in(body);
               body.append(
                  once "*)o)->header.flag==FSOH_UNMARKED){%N");
            end;
            gc_set_fsoh_marked_in(body);
            from -- Ordinary attributes :
               i := wa_buf.upper;
            until
               i < 0
            loop
               rf2 := wa_buf.item(i);
               mark_attribute(body,rf2);
               i := i - 1;
            end;
            from -- Cyclic attributes :
               i := wa_cyclic_buf.upper;
            until
               i < 0
            loop
               rf2 := wa_cyclic_buf.item(i);
               t := rf2.result_type;
               rc :=  t.run_class;
               wa_cycle.clear;
               wa_cycle.add_last(rf2);
               if rc.is_wa_cycle(Current) then
               end;
               if i = 0 and then
                  wa_cycle.count = 1 and then
                  rc.running /= Void and then
                  rc.running.count = 1 and then
                  rc.running.first = Current
                then
                  body.append(once "o=(void*)o->_");
                  body.append(rf2.name.to_string);
                  body.append(once ";%Nif((o!=NULL)");
                  if is_unmarked then
                     body.append(once "&&(((gc");
                     id.append_in(body);
                     body.append(
                        once "*)o)->header.flag==FSOH_UNMARKED))");
                  else
                     body.extend(')');
                  end;
                  body.append(once "goto begin;%N");
               else
                  mark_attribute(body,rf2);
               end;
               i := i - 1;
            end;
            if not is_unmarked then
               body.extend('}');
            end;
         end;
      end;

feature {E_TYPE}

   gc_align_mark_fixed_size(body: STRING) is
         -- Compute the best body for gc_align_markXXX of
         -- a fixed_size object.
      require
         not gc_handler.is_off;
         not current_type.is_native_array;
         at_run_time
      do
         body.append(fz_gc);
         id.append_in(body);
         body.append(once "*b=((gc");
         id.append_in(body);
	 body.append(
            once "*)(&(c->first_object)));%N%
            %if((c->header.state_type==FSO_STORE_CHUNK)%
            %&&(((char*)p)>=((char*)store");
         id.append_in(body);
         body.append(
            once ")))return;%N%
            %if(((char*)p)>((char*)(b+(c->count_minus_one))))return;%N%
            %if(((char*)p)<((char*)b))return;%N%
            %if(((((char*)p)-((char*)b))%%sizeof(*p))==0){%N%
            %if(p->header.flag==FSOH_UNMARKED){%N%
            %T");
         id.append_in(body);
         body.append(once "*o=(&(p->object));%N");
         gc_mark_fixed_size(true,body);
         body.append(once "}%N}%N");
      end;

feature {RUN_CLASS}

   fill_up_with(rc: RUN_CLASS; fd: like feature_dictionary) is
         -- Fill up `feature_dictionary' with all features coming from
         -- `rc' X `fd'.
      require
         rc /= Current;
         is_running_of(rc);
         fd /= Void;
      local
         bc1, bc2: BASE_CLASS;
         fn1, fn2: FEATURE_NAME;
         rf: RUN_FEATURE;
         i: INTEGER;
      do
         from
            i := 1;
            bc1 := rc.base_class;
            bc2 := base_class;
         until
            i > fd.count
         loop
            rf := fd.item(i);
            if rf.fall_in(Current) then
               fn1 := rf.name;
               fn2 := bc2.name_of(bc1,fn1);
               rf := get_feature(fn2);
            end;
            i := i + 1;
         end;
      end;

   add_running(rc: RUN_CLASS) is
      require
         rc /= Void;
      do
         if running = Void then
	    !!running.with_capacity(8,1);
	    running.add_last(rc);
         else
            if not running.fast_has(rc) then
               running.add_last(rc);
            end;
         end;
      end;

feature

   at(fn: FEATURE_NAME): RUN_FEATURE is
         -- Simple read acces into the `feature_dictionary' using `fn' as the final
         -- name to know if this one is already computed.
      require
         fn /= Void
      do
	 Result := feature_dictionary.reference_at(fn);
      end;

   get_feature_with(n: STRING): RUN_FEATURE is
         -- Assume that `n' is really the final name in current RUN_CLASS.
	 -- Retrieve or compute the corresponding one.
      require
         n /= Void
      local
	 sfn: FEATURE_NAME;
      do
	 create sfn.unknown_position(n);
	 Result := feature_dictionary.reference_at(sfn);
         if Result = Void then
            Result := get_feature(sfn);
         end;
      end;

   get_copy: RUN_FEATURE is
      do
         Result := get_rf_with(class_general.get_copy.first_name);
      end;

   get_feature(fn: FEATURE_NAME): RUN_FEATURE is
         -- Assume that `fn' is really the final name in current
         -- RUN_CLASS. Don't look for rename.
      require
         fn /= Void
      local
         f: E_FEATURE; bc: BASE_CLASS;
      do
	 Result := feature_dictionary.reference_at(fn);
         if Result = Void then
            check
               small_eiffel.status < 3
            end;
            bc := base_class;
            f := bc.look_up_for(Current,fn);
            if f = Void then
               efnf(bc,fn);
            else
               Result := f.to_run_feature(current_type,fn);
               if Result = Void  then
                  efnf(bc,fn);
               else
                  check
		     feature_dictionary.has(Result.name);
		  end;
               end;
            end;
         end;
      end;

feature {JVM}

   jvm_define_class_invariant is
         -- If needed, call the invariant for the pushed value.
      local
         ci: like class_invariant;
      do
	 ci := class_invariant;
	 if ci /= Void then
	    jvm.define_class_invariant_method(ci);
         end;
      end;

feature {JVM,E_TYPE}

   jvm_check_class_invariant is
         -- If needed, call the invariant for the stack-top object.
         -- If invariant is correct, the same stack-top object is left
         -- on the stack.
      local
         ci: like class_invariant;
         idx: INTEGER;
         ca: like code_attribute;
         cp: like constant_pool;
      do
	 ci := class_invariant;
	 if ci /= Void then
	    ca := code_attribute;
	    cp := constant_pool;
	    ca.opcode_dup;
	    opcode_checkcast;
	    idx := cp.idx_methodref3(fully_qualified_name,fz_invariant,
				     fz_29);
	    ca.opcode_invokevirtual(idx,-1);
	 end;
      end;

feature {SMALL_EIFFEL}

   compile_to_jvm is
      require
         at_run_time
      local
         i: INTEGER;
         rf: RUN_FEATURE;
         type_reference: TYPE_REFERENCE;
      do
         echo.put_character('%T');
         echo.put_string(run_time_mark);
         echo.put_character('%N');
         jvm.start_new_class(Current);
         from
            i := 1;
         until
            i > feature_dictionary.count
         loop
            rf := feature_dictionary.item(i);
            jvm.set_current_frame(rf);
            rf.jvm_field_or_method;
            i := i + 1;
         end;
         type_reference ?= current_type;
         if type_reference = Void then
            jvm.prepare_fields;
         else
            type_reference.jvm_prepare_item_field;
         end;
         jvm.prepare_methods;
         jvm.finish_class;
      end;

feature {MANIFEST_ARRAY}

   fully_qualified_name: STRING is
      do
         if fully_qualified_name_memory = Void then
            fully_qualified_name_memory2.copy(ace.executable_name);
            fully_qualified_name_memory2.extend('/');
            fully_qualified_name_memory2.append(unqualified_name);
            !!fully_qualified_name_memory.copy(fully_qualified_name_memory2);
         end;
         Result := fully_qualified_name_memory;
      end;

feature {E_TYPE}

   jvm_type_descriptor_in(str: STRING) is
         -- Append in `str' the appropriate JVM type descriptor.
      require
         at_run_time;
         running.fast_has(Current)
      do
         check
            current_type.is_user_expanded
         end;
         str.extend('L');
         str.append(fully_qualified_name);
         str.extend(';');
      end;

feature {RUN_FEATURE}

   jvm_invoke(idx, stack_level: INTEGER) is
      local
         ct: like current_type;
      do
         ct := current_type;
         inspect
            ct.jvm_method_flags
         when 17 then
            code_attribute.opcode_invokevirtual(idx,stack_level);
         when 9 then
            code_attribute.opcode_invokestatic(idx,stack_level);
         end;
      end;

feature

   jvm_basic_new is
         -- Poduce bytecode to push a new created object with the
         -- basic default value (the corresponding creation procedure
         -- if any is not called).
      local
         i, idx: INTEGER;
         wa: ARRAY[RUN_FEATURE_2];
         rf2: RUN_FEATURE_2;
         t2: E_TYPE;
         ca: like code_attribute;
         cp: like constant_pool;
      do
         ca := code_attribute;
         cp := constant_pool;
         idx := jvm_constant_pool_index;
         ca.opcode_new(idx);
         ca.opcode_dup;
      	 idx := cp.idx_methodref1(idx,fz_35,fz_29);
         ca.opcode_invokespecial(idx,-1);
         wa := writable_attributes;
         if wa /= Void then
            from
               i := wa.upper;
            until
               i = 0
            loop
               rf2 := wa.item(i);
               t2 := rf2.result_type.run_type;
               if t2.is_user_expanded then
                  ca.opcode_dup;
                  t2.run_class.jvm_expanded_push_default;
                  idx := cp.idx_fieldref(rf2);
                  ca.opcode_putfield(idx,-2);
               elseif t2.is_bit then
                  ca.opcode_dup;
                  idx := t2.jvm_push_default;
                  idx := cp.idx_fieldref(rf2);
                  ca.opcode_putfield(idx,-2);
               end;
               i := i - 1;
            end;
         end;
      end;

feature {E_TYPE,RUN_CLASS,NATIVE_SMALL_EIFFEL}

   jvm_expanded_push_default is
         -- Push the corresponding new user's expanded (either dummy
         -- or not, initializer is automatically applied).
      require
         current_type.is_user_expanded
      local
         rf: RUN_FEATURE;
      do
         jvm_basic_new;
         rf := a_default_create;
         if rf /= Void then
            jvm.push_expanded_initialize(rf);
            rf.mapping_jvm;
            jvm.pop;
         end;
      end;

feature {NATIVE_SMALL_EIFFEL}

   deep_twin_in(body: STRING) is
      local
	 i: INTEGER;
         wa: ARRAY[RUN_FEATURE_2];
	 rf2: RUN_FEATURE_2;
	 t: E_TYPE;
	 name: STRING;
      do
	 if current_type.is_reference then
	    body.append(once "R=se_deep_twin_search((void*)C);%N%
			%if(R == NULL){%N");
	    current_type.c_type_for_target_in(body);
	    body.extend(' ');
	    gc_handler.allocation_in(once "new",body,Current);
	    body.append(once "R=((T0*)new);%N%
			%*new=*C;%N%
			%se_deep_twin_register(((T0*)C),((T0*)new));%N");
         else
	    body.append(once "se_deep_twin_start();%N%
			%R=*C;%N{");
	    current_type.c_type_for_target_in(body);
	    body.append(once " new=&(R);%N");
	 end;
         wa := writable_attributes;
         if wa /= Void then
            from
               i := wa.upper;
            until
               i = 0
            loop
               rf2 := wa.item(i);
	       name := rf2.name.to_string;
               t := rf2.result_type.run_type;
	       if t.is_reference then
		  body.append(once "if(new->_");
		  body.append(name);
		  body.append(once "!=NULL){%N%
			      %new->_");
		  body.append(name);
		  body.append(once "=X10deep_twin(");
		  if ace.no_check then
		     body.append(once "&ds,ds.p,");
		  end;
		  body.append(once "new->_");
		  body.append(name);
		  body.append(once ");%N}%N");
	       elseif t.is_native_array then
		  if get_feature_with(as_capacity) = Void then
		     eh.add_type(t,fz_dtideena);
		     eh.print_as_error;
		     eh.add_position(rf2.start_position);
		     eh.append(em1);
		     eh.print_as_fatal_error;
		  end;
		  body.append(once "new->_");
		  body.append(name);
		  body.append(once "=r");
		  t.id.append_in(body);
		  body.append(once "deep_twin_from(");
		  if ace.no_check then
		     body.append(once "&ds,");
		  end;
		  body.append(once "new->_");
		  body.append(name);
		  body.append(once ",new->_capacity);%N");
	       elseif t.is_dummy_expanded then
	       elseif t.is_user_expanded then
		  body.append(once "new->_");
		  body.append(name);
		  body.append(once "=r");
		  t.id.append_in(body);
		  body.append(once "deep_twin(");
		  if ace.no_check then
		     body.append(once "&ds,");
		  end;
		  body.append(once "&(new->_");
		  body.append(name);
		  body.append(once "));%N");
               else
               end;
               i := i - 1;
            end;
         end;
	 if current_type.is_user_expanded then
	    body.append(once "se_deep_twin_trats(NULL);%N");
	 end;
	 body.extend('}');
	 body.extend('%N');
      end;

   is_deep_equal_in(body: STRING) is
      local
	 i: INTEGER;
         wa: ARRAY[RUN_FEATURE_2];
	 rf2: RUN_FEATURE_2;
	 ct, t: E_TYPE;
	 name: STRING;
	 check_type: BOOLEAN;
      do
	 ct := current_type;
	 body.append(once "se_deep_equal_start();%N");
	 if ct.is_reference then
	    check_type := ct.run_class.is_tagged;
	    if check_type then
	       body.append(once "R=(C->id==a1->id);%N%
			   %if(R){%N");
	    end;
	    body.append(once "R=se_deep_equal_search(C,a1);%N");
	 end;
	 body.append(once "if(!R){%N");
	 ct.c_type_for_target_in(body);
	 body.append(once "deep=");
	 if ct.is_reference then
	    body.append(once "((void*)a1);%N");
	 else
	    body.append(once "((void*)(&a1));%N");
	 end;
	 body.append(once "R=1;%N");
         wa := writable_attributes;
         if wa /= Void then
            from
               i := wa.upper;
            until
               i = 0
            loop
               rf2 := wa.item(i);
	       name := rf2.name.to_string;
               t := rf2.result_type.run_type;
	       if t.is_basic_eiffel_expanded then
		  body.append(once "if(R)R=((C->_");
		  body.append(name);
		  body.append(once ")==(deep->_");
		  body.append(name);
		  body.append(once "));%N");
               end;
               i := i - 1;
            end;
            from
               i := wa.upper;
            until
               i = 0
            loop
               rf2 := wa.item(i);
	       name := rf2.name.to_string;
               t := rf2.result_type.run_type;
	       if t.is_reference then
		  body.append(once "if(R)R=r");
		  ct.id.append_in(body);
		  body.append(once "deep_equal(");
		  if ace.no_check then
		     body.append(once "&ds,");
		     if ct.is_reference then
			body.append(once "C,");
		     end;
		  end;
		  body.append(once "C->_");
		  body.append(name);
		  body.append(once ",deep->_");
		  body.append(name);
		  body.append(once ");%N");
	       elseif t.is_native_array then
		  if get_feature_with(as_capacity) = Void then
		     eh.add_type(t,fz_dtideena);
		     eh.print_as_error;
		     eh.add_position(rf2.start_position);
		     eh.append(em1);
		     eh.print_as_fatal_error;
	          end;
		  body.append(once "if(R)R=r");
		  t.id.append_in(body);
		  body.append(once "deep_memcmp(");
		  if ace.no_check then
		     body.append(once "&ds,");
		  end;
		  body.append(once "C->_");
		  body.append(name);
		  body.append(once ",deep->_");
		  body.append(name);
		  body.append(once ",C->_capacity);%N");
	       elseif t.is_dummy_expanded then
	       elseif t.is_user_expanded then
		  body.append(once "if(R)R=r");
		  t.id.append_in(body);
		  body.append(once "is_deep_equal(");
		  if ace.no_check then
		     body.append(once "&ds,");
		  end;
		  body.append(once "&(C->_");
		  body.append(name);
		  body.append(once "),deep->_");
		  body.append(name);
		  body.append(once ");%N");
               else
               end;
               i := i - 1;
            end;
         end;
	 if check_type then
	    body.append(once "}%N");
	 end;
	 body.append(once "}%Nse_deep_equal_trats();%N");
      end;

feature {JVM}

   unqualified_name: STRING is
         -- Also used for the corresponding file name.
      do
         unqualified_name_memory.copy(run_time_mark);
         unqualified_name_memory.to_lower;
         unqualified_name_memory.replace_all('[','O');
         unqualified_name_memory.replace_all(']','F');
         unqualified_name_memory.replace_all(' ','_');
         unqualified_name_memory.replace_all(',','_');
         Result := unqualified_name_memory;
      end;

feature

   jvm_constant_pool_index: INTEGER is
         -- The fully qualified index in the constant pool.
      do
         Result := constant_pool.idx_class2(fully_qualified_name);
      end;

feature {SMALL_EIFFEL}

   id_extra_information(tfw: TEXT_FILE_WRITE) is
      local
         r: like running;
         i: INTEGER;
         ct: E_TYPE;
      do
         ct := current_type;
         tfw.put_string(once "c-type: T");
         tfw.put_integer(id);
         tfw.put_character(' ');
         ct.id_extra_information(tfw);
         if ct.is_reference then
            tfw.put_string(once "ref-status: ");
            if at_run_time then
               tfw.put_string(once "live id-field: ");
               if ct.is_reference and then not is_tagged then
                  tfw.put_string(once "no ");
               else
                  tfw.put_string(once "yes ");
               end;
            else
               tfw.put_string(once "dead ");
            end;
            tfw.put_string(once "running-count: ");
            r := running;
            if r /= Void then
               tfw.put_integer(r.count);
            else
               tfw.put_character('0');
            end;
            tfw.put_character(' ');
            if r /= Void then
               tfw.put_string(once "running: ");
               from
                  i := r.upper;
               until
                  i = 0
               loop
                  tfw.put_integer(r.item(i).id);
                  tfw.put_character(' ');
                  i := i - 1;
               end;
            end;
	    if run_time_set /= Void then
	       run_time_set.id_extra_information(tfw);
	    end;
         end;
      end;

feature {SMALL_EIFFEL,RUN_CLASS}

   compile_to_c(deep: INTEGER) is
         -- Produce C code for features of Current. The `deep'
         -- indicator is used to sort the C output in the best order
         -- (more C  inlinings are possible when basic functions are
         -- produced first). As there is not always a total order
         -- between clients, the `deep' avoid infinite track.
         -- When `deep' is greater than 0, C code writting
         -- is produced whatever the real client relation is.
      require
         cpp.on_c;
         deep >= 0
      local
         i: INTEGER;
         rc1, rc2: like Current;
         cc1, cc2: INTEGER;
      do
         if compile_to_c_done then
         elseif not at_run_time then
            compile_to_c_done := true;
         elseif deep = 0 then
            really_compile_to_c;
         else
            i := actuals_clients.upper;
            if i >= 0 then
               from
                  rc1 := Current;
                  cc1 := i + 1;
               until
                  i = 0
               loop
                  rc2 := actuals_clients.item(i);
                  if not rc2.compile_to_c_done then
                     cc2 := rc2.actuals_clients.count;
                     if cc2 > cc1 then
                        rc1 := rc2;
                        cc1 := cc2;
                     end;
                  end;
                  i := i - 1;
               end;
               if rc1 = Current then
                  really_compile_to_c;
               else
                  rc1.compile_to_c(deep - 1);
               end;
            end;
         end;
      ensure
         cpp.on_c
      end;

feature {RUN_CLASS}

   actuals_clients: FIXED_ARRAY[RUN_CLASS];

feature {CREATE_TOOLS,RUN_FEATURE}

   add_client(rc: RUN_CLASS) is
      require
         rc /= Void
      local
         i: INTEGER;
      do
         i := actuals_clients.fast_index_of(rc);
         if i > actuals_clients.upper then
            actuals_clients.add_last(rc);
         end;
      end;

feature

   offset_of(rf2: RUN_FEATURE_2): INTEGER is
         -- Compute the displacement to access `rf2' in the corresponding
         -- C struct to remove a possible stupid switch.
         -- Result is in number of bytes.
      require
         at_run_time;
         writable_attributes.fast_has(rf2);
         small_eiffel.is_ready
      local
         wa: like writable_attributes;
         t: E_TYPE;
         i: INTEGER;
      do
         if is_tagged then
            Result := (1).object_size;
         end;
         from
            wa := writable_attributes;
            i := wa.upper;
         invariant
            i > 0
         until
            wa.item(i) = rf2
         loop
            t := wa.item(i).result_type;
            Result := Result + t.c_sizeof;
            i := i - 1;
         end;
      end;

feature

   wa_buf: FIXED_ARRAY[RUN_FEATURE_2] is
      once
         !!Result.with_capacity(24);
      end;

   wa_cyclic_buf: FIXED_ARRAY[RUN_FEATURE_2] is
      once
         !!Result.with_capacity(24);
      end;

feature {RUN_CLASS}

   is_wa_cycle(origin: like Current): BOOLEAN is
      do
         if Current = origin then
            Result := true;
         end;
      end;

feature -- Some useful JVM opcode:

   opcode_checkcast is
         -- May produce a `checkcast' opcode depending on
         -- `current_type' Java byte-code mapping.
      local
         ct: E_TYPE;
         idx: INTEGER;
      do
         ct := current_type;
         if ct.is_basic_eiffel_expanded then
         elseif ct.is_native_array then
            tmp_string.clear;
            ct.jvm_target_descriptor_in(tmp_string);
            idx := constant_pool.idx_class2(tmp_string);
            code_attribute.opcode_checkcast(idx);
         elseif ct.is_bit then
         else
            idx := jvm_constant_pool_index;
            code_attribute.opcode_checkcast(idx);
         end;
      end;

   opcode_instanceof is
      require
         not current_type.is_basic_eiffel_expanded
      local
         idx: INTEGER;
      do
         idx := jvm_constant_pool_index;
         code_attribute.opcode_instanceof(idx);
      end;

   opcode_getfield(rf2: RUN_FEATURE_2): INTEGER is
         -- Produce a `checkcast'/`getfield' for the given
         -- attribute of the top object of the stack.
         -- stack: ... object => ... value
      local
         idx: INTEGER;
      do
         opcode_checkcast;
         idx := constant_pool.idx_fieldref(rf2);
         Result := rf2.result_type.jvm_stack_space - 1;
         code_attribute.opcode_getfield(idx,Result);
      end;

feature {RUN_FEATURE}

   get_default_rescue(n: FEATURE_NAME): COMPOUND is
      local
         a_rescue: RUN_FEATURE_3;
         target: IMPLICIT_CURRENT;
         call_to_default_rescue: PROC_CALL_0;
      do
         a_rescue := base_class.get_default_rescue(Current,n);
         if a_rescue /= Void then
            !!target.make(n.start_position);
            !!call_to_default_rescue.make(target,a_rescue.name);
            !!Result.make(Void,call_to_default_rescue,Void);
         end;
      end;

   add_run_feature(rf: RUN_FEATURE; fn: FEATURE_NAME) is
      require
	 rf.run_class = Current; rf.name = fn
      do
         check
            not feature_dictionary.has(fn)
         end;
         feature_dictionary.add(rf,fn);
      end;

feature {ASSIGNMENT_HANDLER}

   shared_attributes(other: RUN_CLASS) is
      local
         rf2: RUN_FEATURE_2;
         i: INTEGER;
      do
         from
            i := 1;
         until
            i > feature_dictionary.count
         loop
            rf2 ?= feature_dictionary.item(i);
            if rf2 /= Void then
               rf2 ?= other.get_feature(rf2.name);
            end;
            i := i + 1;
         end;
      end;

feature {CREATE_EXPRESSION}

   create_function_register(rf: RUN_FEATURE) is
	 -- Register that there is a live create expression using `rf'
	 -- as the creation procedure.
      do
	 if create_function_list = Void then
	    !!create_function_list.with_capacity(4);
	 end;
	 if rf /= Void then
	    if not create_function_list.fast_has(rf) then
	       create_function_list.add_last(rf);
	    end;
	 end;
      end;

feature {NONE}

   create_function_list: FIXED_ARRAY[RUN_FEATURE];

   create_function_define(rf: RUN_FEATURE) is
      require
	 cpp.on_c
      local
	 boost: BOOLEAN; header, body: STRING;
	 args: FORMAL_ARG_LIST;
      do
	 boost := ace.boost;
	 header := c_code_buffer;
	 header.clear;
	 if current_type.is_reference then
	    current_type.c_type_for_target_in(header);
	 else
	    current_type.c_type_for_result_in(header);
	 end;
	 header.append(fz_create);
	 id.append_in(header);
	 if rf /= Void then
	    header.append(rf.name.to_string);
	 end;
	 header.extend('(');
	 if not boost then
	    header.append(once "se_dump_stack*caller");
	 end;
	 if rf /= Void then
	    args := rf.arguments;
	    if args /= Void then
	       if not boost then
		  header.extend(',');
	       end;
	       args.compile_to_c_in(header);
	    end;
	 end;
	 header.extend(')');
	 cpp.put_c_heading(header);
	 --
	 body := c_code_buffer;
	 body.clear;
	 if current_type.is_reference then
	    current_type.c_type_for_target_in(body);
	 else
	    current_type.c_type_for_argument_in(header);
	 end;
	 body.append(once " n;%N");
	 cpp.put_string(body);
         if not boost then
            cpp.put_string(once "se_frame_descriptor fd=%
			   %{%"create expression wrapper%",0,0,%"%",1};%N%
		           %se_dump_stack ds;%N%
			   %ds.fd=&fd;%Nds.p=0;%N%
                           %ds.caller=caller;%N");
         end;
	 if current_type.is_reference then
	    gc_handler.allocation_of(once "n",Current);
	 else
	    cpp.put_string(once "n=M")
	    cpp.put_integer(id);
	    cpp.put_string(once ";%N");
	 end;
	 if rf /= Void then
	    cpp.push_create_expression(rf);
	    rf.mapping_c;
	    cpp.pop;
	 end;
	 cpp.put_string(once "return n;%N}%N");
      end;

   mark_attribute(body: STRING; rf2: RUN_FEATURE_2) is
      do
         tmp_string.copy(once "o->_");
         tmp_string.append(rf2.name.to_string);
         tmp_string.append(fz_open_c_comment);
         offset_of(rf2).append_in(tmp_string);
         tmp_string.append(fz_close_c_comment);
         gc_handler.mark_for(body,tmp_string,rf2.result_type.run_class);
      end;

   gc_set_fsoh_marked_in(body: STRING) is
      do
         if current_type.is_reference then
            body.append(once "((gc");
            id.append_in(body);
            body.append(once "*)o)->header.flag=FSOH_MARKED;%N");
         end;
      end;

   need_gc_mark: BOOLEAN is
      require
         at_run_time
      local
         i: INTEGER;
         wa: like writable_attributes;
         rf2: RUN_FEATURE_2;
         t: E_TYPE;
      do
         wa := writable_attributes;
         if wa /= Void then
            from
               i := wa.upper;
            until
               Result or else i = 0
            loop
               rf2 := wa.item(i);
               t := rf2.result_type;
               Result := t.need_gc_mark_function;
               i := i - 1;
            end;
         end;
      end;

   wa_cycle: FIXED_ARRAY[RUN_FEATURE_2] is
      once
         !!Result.with_capacity(24);
      end;

   tmp_string: STRING is
      once
         !!Result.make(32);
      end;

   c_code_buffer: STRING is
      once
         !!Result.make(256);
      end;

   efnf(bc: BASE_CLASS; fn: FEATURE_NAME) is
      require
         bc /= Void;
         fn /= Void
      do
         eh.append(once "Current type is ");
         eh.append(run_time_mark);
         eh.append(once ". There is no feature ");
         eh.append(fn.to_string);
         eh.append(once " in class ");
         eh.append(bc.name.to_string);
         error(fn.start_position,fz_dot_blank);
      end;

   sort_wam(wam: like writable_attributes) is
         -- Sort `wam' to common attribute at the end.
      require
         wam.lower = 1
      local
         min, max, buble: INTEGER;
         moved: BOOLEAN;
      do
         from
            max := wam.upper;
            min := 1;
            moved := true;
         until
            not moved
         loop
            moved := false;
            if max - min > 0 then
               from
                  buble := min + 1;
               until
                  buble > max
               loop
                  if gt(wam.item(buble - 1),wam.item(buble)) then
                     wam.swap(buble - 1,buble);
                     moved := true;
                  end;
                  buble := buble + 1;
               end;
               max := max - 1;
            end;
            if moved and then max - min > 0 then
               from
                  moved := false;
                  buble := max - 1;
               until
                  buble < min
               loop
                  if gt(wam.item(buble),wam.item(buble + 1)) then
                     wam.swap(buble,buble + 1);
                     moved := true;
                  end;
                  buble := buble - 1;
               end;
               min := min + 1;
            end;
         end;
      end;

   gt(rf1, rf2: RUN_FEATURE_2): BOOLEAN is
         -- True if it is better to set attribute `rf1' before
         -- attribute `rf2'.
      local
         bc1, bc2: BASE_CLASS;
         bf1, bf2: E_FEATURE;
         bcn1, bcn2: CLASS_NAME;
      do
         bf1 := rf1.base_feature;
         bf2 := rf2.base_feature;
         bc1 := bf1.base_class;
         bc2 := bf2.base_class;
         bcn1 := bc1.name;
         bcn2 := bc2.name;
         if bcn1.to_string = bcn2.to_string then
            Result := bf1.start_position.before(bf2.start_position);
         elseif bcn2.is_subclass_of(bcn1) then
            Result := true;
         elseif bcn1.is_subclass_of(bcn2) then
         elseif bc1.parent_list = Void then
            if bc2.parent_list = Void then
               Result := bcn1.to_string < bcn2.to_string;
            else
               Result := true;
            end;
         elseif bc2.parent_list = Void then
         else
            Result := bc2.parent_list.count < bc1.parent_list.count
         end;
      end;

   writable_attributes_mem: like writable_attributes;

   really_compile_to_c is
      require
         at_run_time
      local
         bunch_size, assertion_level, i: INTEGER;
         rf: RUN_FEATURE;
      do
         compile_to_c_done := true;
	 bunch_size := feature_dictionary.count;
	 assertion_level := base_class.assertion_level
	 if assertion_level < level_require then
	 elseif assertion_level < level_ensure then
	    bunch_size := bunch_size + bunch_size // 4;
	 elseif assertion_level = level_ensure then
	    bunch_size := bunch_size + bunch_size // 3;
	 end;
	 if assertion_level >= level_invariant then
	    if class_invariant /= Void then
	       bunch_size := bunch_size + 2;
	    end;
	 end;
	 cpp.next_bunch_size(bunch_size);
	 if create_function_list /= Void then
	    if create_function_list.is_empty then
	       create_function_define(Void);
	    else
	       from
		  i := create_function_list.upper;
	       until
		  i < 0
	       loop
		  rf := create_function_list.item(i);
		  create_function_define(rf);
		  i := i - 1;
	       end;
	    end;
	 end;
         echo.put_character('%T');
         echo.put_string(run_time_mark);
         echo.put_string(once " (");
	 echo.put_integer(feature_dictionary.count)
         echo.put_string(once " features).%N");
         from
            i := 1;
         until
            i > feature_dictionary.count
         loop
            rf := feature_dictionary.item(i);
            rf.c_define;
            i := i + 1;
         end;
	 if class_invariant /= Void then
	    class_invariant.c_define;
         end;
      ensure
         compile_to_c_done
      end;

   unqualified_name_memory: STRING is
      once
         !!Result.make(32);
      end;

   fully_qualified_name_memory: STRING;

   fully_qualified_name_memory2: STRING is
      once
         !!Result.make(256);
      end;

   get_or_fatal_error(fn: FEATURE_NAME): RUN_FEATURE is
      do
         Result := get_feature(fn);
         if Result = Void then
            eh.add_position(fn.start_position);
            eh.append(once "Feature ");
            eh.append(fn.to_string);
            eh.append(once " not found when starting look up from ");
            eh.add_type(current_type,fz_dot_blank);
            eh.print_as_fatal_error;
         end;
      end;

   runnable_class_invariant_done: BOOLEAN;

   count_fn: FEATURE_NAME is
      once
	 create Result.unknown_position(as_count);
      end;

   c_header_pass_level_done: INTEGER;

   run_time_set_memory: RUN_TIME_SET;

   em1: STRING is
      "The `deep_twin'/`is_deep_equal' problem comes from this attribute."

invariant

   current_type.run_type = current_type;

   base_class = current_type.base_class;

   base_class_name = current_type.base_class_name;

end -- RUN_CLASS

