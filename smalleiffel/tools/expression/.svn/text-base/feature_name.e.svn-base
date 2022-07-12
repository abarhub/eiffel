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
class FEATURE_NAME
   --
   -- For all kinds of feature names.
   --

inherit
   HASHABLE redefine is_equal end;
   EXPRESSION;
   NAME;

creation simple_feature_name, infix_name, prefix_name, frozen_name

creation {BASE_CLASS,RUN_CLASS} unknown_position

creation {PRECURSOR_CALL} precursor_name

creation {FEATURE_NAME} runnable_feature_name

feature

   start_position: POSITION;
	 -- Of the first character.

   to_string: STRING;
         -- The corresponding name (alone in a STRING).

   to_key: STRING;
         -- To avoid clash between different kinds of names (for example when
         -- using same infix/prefix operator). Also used to compute the C name
         -- or the JVM name of a feature.

   hash_code: INTEGER;
	 -- Actually, in order to speed up the compiler, this is a cache
	 -- for value `to_key.hash_code'.

   is_equal(other: like Current): BOOLEAN is
      do
	 Result := to_key = other.to_key;
      end;

   is_frozen: BOOLEAN is
      do
	 inspect
	    name_type
	 when C_frozen_name then
	    Result := true;
	 when C_precursor_name then
	    Result := feature_name.is_frozen;
	 else
	 end;
      end;

   is_simple_feature_name: BOOLEAN is
      do
	 Result := name_type = C_simple_feature_name;
      end;

   is_infix_name: BOOLEAN is
      do
	 Result := name_type = C_infix_name;
      end;

   is_prefix_name: BOOLEAN is
      do
	 Result := name_type = C_prefix_name;
      end;

   is_precursor_name: BOOLEAN is
      do
	 Result := name_type = C_precursor_name;
      end;

   is_current: BOOLEAN is false;

   is_manifest_string: BOOLEAN is false;

   is_result: BOOLEAN is false;

   is_void: BOOLEAN is false;

   c_simple: BOOLEAN is true;

   is_pre_computable: BOOLEAN is false;

   precedence: INTEGER is
      do
         Result := atomic_precedence;
      end;

   use_current: BOOLEAN is true;

   can_be_dropped: BOOLEAN is
      do
	 -- *** TRUE ???????????? ******
         check false end;
      end;

   is_writable: BOOLEAN is
      do
	 Result := C_simple_feature_name = name_type;
      end;

   infix_or_prefix: STRING is
	 -- Return "infix" or "prefix" or something appropriate.
      do
	 inspect
	    name_type
	 when C_simple_feature_name then
	 when C_infix_name then
	    Result := fz_infix;
	 when C_prefix_name then
	    Result := fz_prefix;
	 when C_precursor_name then
	    Result := as_precursor;
	 when C_frozen_name then
	    Result := feature_name.infix_or_prefix;
	 end;
      end;

   mapping_c_in(str: STRING) is
      do
	 str.append(to_key);
      end;

   result_type: E_TYPE is
      do
	 check C_simple_feature_name = name_type end;
         Result := run_feature_2.result_type;
      end;

   to_runnable(ct: E_TYPE): like Current is
      local
         wbc: BASE_CLASS; rf: RUN_FEATURE; new_name:  FEATURE_NAME;
         rf2: RUN_FEATURE_2;
      do
	 check C_simple_feature_name = name_type end;
         wbc := start_position.base_class;
         new_name := ct.base_class.new_name_of(wbc,Current);
         rf := ct.run_class.get_feature(new_name);
         if rf = Void then
            eh.add_feature_name(new_name);
            fatal_error(fz_feature_not_found);
         else
            rf2 ?= rf;
            if rf2 = Void then
               eh.add_position(rf.start_position);
               eh.add_position(start_position);
	       eh.append("Feature found is not writable.");
	       eh.print_as_fatal_error;
            end;
         end;
         if run_feature_2 = Void then
            run_feature_2 := rf2;
            Result := Current;
         elseif run_feature_2 = rf then
            Result := Current;
         else
            !!Result.runnable_feature_name(Current,rf2);
         end;
      end;

   start_lookup_class: BASE_CLASS is
      local
         bc: BASE_CLASS; e_feature: E_FEATURE; rt: E_TYPE;
      do
	 check C_simple_feature_name = name_type end;
         bc := start_position.base_class;
         if bc /= Void then
            e_feature := bc.e_feature(Current);
            if e_feature /= Void then
               rt := e_feature.result_type;
               if rt /= Void then
                  Result := rt.start_lookup_class;
               end;
            end;
         end;
      end;

   stupid_switch(r: ARRAY[RUN_CLASS]): BOOLEAN is
      local
         rf2: RUN_FEATURE_2;
      do
	 check C_simple_feature_name = name_type end;
         rf2 := run_feature_2;
         if rf2 /= Void then
            if small_eiffel.same_base_feature(rf2,r) then
               Result := rf2.stupid_switch(r) /= Void;
            end;
         end;
      end;

   afd_check is do end;

   collect_c_tmp is do end;

   compile_to_c is
      do
	 check C_simple_feature_name = name_type end;
         cpp.put_string(once "(/*SFN*/C->");
         run_feature_2.put_c_field_name;
         cpp.put_character(')');
      end;

   mapping_c_target(target_type: E_TYPE) is
      local
         flag: BOOLEAN;
      do
	 check C_simple_feature_name = name_type end;
         flag := cpp.call_invariant_start(target_type);
         compile_to_c;
         if flag then
            cpp.call_invariant_end;
         end;
      end;

   mapping_c_arg(formal_arg_type: E_TYPE) is
      do
	 check C_simple_feature_name = name_type end;
         compile_to_c;
      end;

   c_frame_descriptor(format, locals: STRING) is do end;

   isa_dca_inline_argument: INTEGER is 0;

   dca_inline_argument(formal_arg_type: E_TYPE) is do end;

   is_static: BOOLEAN is false;

   static_value: INTEGER is do end;

   assertion_check(tag: CHARACTER) is do end;

   to_integer_or_error: INTEGER is
      do
	 to_integer_error;
      end;

   origin_base_class: BASE_CLASS is
         -- Void or the BASE_CLASS where `Current' is written in.
      do
         Result := start_position.base_class;
      end;

   is_freeop: BOOLEAN is
      do
         inspect
            to_string @ 1
         when '@', '#', '|', '&' then
            Result := true;
         else
         end;
      end;

   declaration_in(buffer: STRING) is
      require
         buffer /= Void
      do
	 inspect
	    name_type
	 when C_simple_feature_name then
	    buffer.append(to_string);
	 when C_infix_name then
	    buffer.append(fz_infix);
	    buffer.extend(' ');
	    buffer.extend('%"');
	    buffer.append(to_string);
	    buffer.extend('%"');
	 when C_prefix_name then
	    buffer.append(fz_prefix);
	    buffer.extend(' ');
	    buffer.extend('%"');
	    buffer.append(to_string);
	    buffer.extend('%"');
	 when C_precursor_name then
	 when C_frozen_name then
	    feature_name.declaration_in(buffer);
	 end;
      end;

   declaration_pretty_print is
      do
	 inspect
	    name_type
	 when C_simple_feature_name then
	    fmt.put_string(to_string);
	 when C_infix_name then
	    fmt.keyword(fz_infix);
	    fmt.put_character('%"');
	    fmt.put_string(to_string);
	    fmt.put_character('%"');
	 when C_prefix_name then
	    fmt.keyword(fz_prefix);
	    fmt.put_character('%"');
	    fmt.put_string(to_string);
	    fmt.put_character('%"');
	 when C_frozen_name then
	    fmt.keyword(once "frozen");
	    feature_name.declaration_pretty_print;
	 end;
      end;


   pretty_print is
      do
	 inspect
	    name_type
	 when C_simple_feature_name, C_infix_name, C_prefix_name then
	    fmt.put_string(to_string);
	 when C_precursor_name then
	    fmt.put_string(as_precursor);
	 when C_frozen_name then
	    feature_name.pretty_print;
	 end;
      end;

   print_as_target is
      do
	 check C_simple_feature_name = name_type end;
         fmt.put_string(to_string);
         fmt.put_character('.');
      end;

   short is
      local
         i: INTEGER; c: CHARACTER;
      do
	 inspect
	    name_type
	 when C_simple_feature_name then
	    short_print.hook(once "Bsfn");
	    from i := 1 until i > to_string.count
	    loop
	       c := to_string.item(i);
	       if c = '_' then
		  short_print.hook_or(once "Usfn",once "_");
	       else
		  short_print.a_character(c);
	       end;
	       i := i + 1;
	    end;
	    short_print.hook(once "Asfn");
	 when C_infix_name then
	    short_print.a_infix_name(once "Bifn",once "infix %"",once "Aifn",once "%"",Current);
	 when C_prefix_name then
	    short_print.hook_or(once "Bpfn",once "prefix %"");
	    from i := 1 until i > to_string.count
	    loop
	       c := to_string.item(i);
	       short_print.a_character(c);
	       i := i + 1;
	    end;
	    short_print.hook_or(once "Apfn",once "%"");
	 when C_frozen_name then
	    feature_name.short;
	 end;
      end;

   short_target is
      do
	 check C_simple_feature_name = name_type end;
         short;
         short_print.a_dot;
      end;

   jvm_assign is
      local
         space, idx: INTEGER; rf2: like run_feature_2;
         ca: like code_attribute;
      do
	 check C_simple_feature_name = name_type end;
         rf2 := run_feature_2;
         ca := code_attribute;
         space := rf2.result_type.jvm_stack_space;
         ca.opcode_aload_0;
         if space = 1 then
            ca.opcode_swap;
         else
            ca.opcode_dup_x2;
            ca.opcode_pop;
         end;
         idx := constant_pool.idx_fieldref(rf2);
         ca.opcode_putfield(idx,-(space + 1));
      end;

   compile_target_to_jvm, compile_to_jvm is
      do
         eh.add_position(start_position);
         fatal_error(fz_jvm_error);
      end;

   jvm_branch_if_false: INTEGER is
      do
         compile_to_jvm;
         Result := code_attribute.opcode_ifeq;
      end;

   jvm_branch_if_true: INTEGER is
      do
         compile_to_jvm;
         Result := code_attribute.opcode_ifne;
      end;

   compile_to_jvm_into(dest: E_TYPE): INTEGER is
      do
         Result := standard_compile_to_jvm_into(dest);
      end;

feature {RUN_CLASS}

   set_run_feature_2(rf2: RUN_FEATURE_2) is
      require
	 rf2 /= Void
      do
	 run_feature_2 := rf2;
      ensure
	 run_feature_2 = rf2
      end;

feature {TYPE_BIT_2}

   run_feature(t: E_TYPE): RUN_FEATURE is
         -- Look for the corresponding runnable feature in `t';
      require
         t.is_run_type
      do
         Result := t.run_class.get_rf_with(Current);
      end;

feature {RUN_FEATURE_3}

   run_feature_2: RUN_FEATURE_2;
         -- The corresponding one when runnable.

feature {E_FEATURE}

   undefine_in(bc: BASE_CLASS) is
      require
         bc /= Void
      do
         if is_frozen then
            error(start_position,
                  "A frozen feature must not be undefined (VDUS).");
            bc.fatal_undefine(Current);
         end;
      end;

feature {FEATURE_NAME}

   runnable_feature_name(model: like Current; rf2: RUN_FEATURE_2) is
      require
         model.is_simple_feature_name; rf2 /= Void
      do
         start_position := model.start_position;
         to_string := model.to_string;
         to_key := to_string;
         run_feature_2 := rf2;
	 hash_code := model.hash_code;
	 name_type := C_simple_feature_name;
      ensure
         to_string = model.to_string;
         start_position = model.start_position;
         run_feature_2 = rf2
      end;

feature {BASE_CLASS}

   unknown_position(n: STRING) is
      require
         n = string_aliaser.item(n)
      local
	 up: POSITION;
      do
         start_position := up;
         to_string := n;
	 to_key := n;
	 hash_code := to_key.hash_code;
	 name_type := C_simple_feature_name;
      ensure
         to_string = n
      end;

feature {NONE}

   simple_feature_name(n: STRING; sp: like start_position) is
      require
         n = string_aliaser.item(n)
         not sp.is_unknown
      do
         start_position := sp;
         to_string := n;
         to_key := n;
	 hash_code := to_key.hash_code;
	 name_type := C_simple_feature_name;
      ensure
         to_string = n;
         start_position = sp
      end;

   name_type: INTEGER;
	 -- Dynamic binding is no longuer used for feature name in
	 -- order to allow `hash_code' memorization.

   C_simple_feature_name: INTEGER is 1;

   C_infix_name: INTEGER is 2;

   C_prefix_name: INTEGER is 3;

   C_frozen_name: INTEGER is 4;

   C_precursor_name: INTEGER is 5;

   prefix_name(n: STRING; sp: like start_position) is
      require
         n = string_aliaser.item(n);
         not sp.is_unknown
      do
         start_position := sp;
         to_string := n;
         to_key := string_aliaser.for_prefix(to_string);
	 hash_code := to_key.hash_code;
	 name_type := C_prefix_name;
      ensure
         to_string = n;
         start_position = sp;
         to_key = string_aliaser.item(to_key)
      end;

   infix_name(n: STRING; sp: like start_position) is
      require
         n = string_aliaser.item(n);
         not sp.is_unknown
      do
         start_position := sp;
         to_string := n;
         to_key := string_aliaser.for_infix(to_string);
	 hash_code := to_key.hash_code;
	 name_type := C_infix_name;
      ensure
         to_string = string_aliaser.item(n);
         start_position = sp;
         to_key = string_aliaser.item(to_key)
      end;

   feature_name: FEATURE_NAME;
	 -- Used to refer the corresponding one for `frozen_name' and `precursor_name'.

   frozen_name(fn: like feature_name) is
      require
         fn /= Void
      do
         feature_name := fn;
	 start_position := fn.start_position;
	 to_string := fn.to_string;
	 to_key := fn.to_key;
	 hash_code := fn.hash_code;
	 name_type := C_frozen_name;
      ensure
         feature_name = fn
      end;

   precursor_name(id: INTEGER; fn: like feature_name) is
         -- Where `fn' is name of the enclosing RUN_FEATURE which contains
         -- the Precursor call. The `id' is the one of the base class of
         -- the Precursor routine.
      require
         fn /= Void
      do
	 start_position := fn.start_position;
         feature_name := fn;
	 to_string := fn.to_string;
         !!to_key.make(8 + feature_name.to_key.count);
         to_key.extend('_');
         id.append_in(to_key);
         to_key.extend('P');
         to_key.append(feature_name.to_key);
         to_key := string_aliaser.item(to_key);
	 hash_code := to_key.hash_code;
	 name_type := C_precursor_name;
      ensure
         feature_name = fn
      end;

invariant

   name_type > 0;

   to_string = string_aliaser.item(to_string);

   to_key = string_aliaser.item(to_key);

   hash_code > 0;

end -- FEATURE_NAME
