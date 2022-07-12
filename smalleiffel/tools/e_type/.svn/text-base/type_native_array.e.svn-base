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
class TYPE_NATIVE_ARRAY

inherit E_TYPE;

creation make

creation {TYPE_NATIVE_ARRAY} set, make_runnable

feature

   base_class_name: CLASS_NAME;

   generic_list: ARRAY[E_TYPE];

   written_mark: STRING;

   run_type: like Current;
         -- Not Void when runnable.

   is_expanded: BOOLEAN is true;

   is_reference: BOOLEAN is false;

   is_generic: BOOLEAN is true;

   is_basic_eiffel_expanded: BOOLEAN is false;

   is_dummy_expanded: BOOLEAN is false;

   is_user_expanded: BOOLEAN is false;

   is_array: BOOLEAN is false;

   is_none: BOOLEAN is false;

   is_any: BOOLEAN is false;

   is_like_current: BOOLEAN is false;

   is_like_argument: BOOLEAN is false;

   is_like_feature: BOOLEAN is false;

   jvm_method_flags: INTEGER is 9;

   pretty_print is
      do
         fmt.put_string(written_mark);
      end;

   actual_reference(destination: E_TYPE): E_TYPE is
      do
         check false end;
      end;

   start_lookup_name: CLASS_NAME is
      do
         Result := base_class_name;
      end;

   elements_type: E_TYPE is
      do
         Result := generic_list.first;
      end;

   of_references: BOOLEAN is
      do
         Result := elements_type.is_reference;
      end;

   smallest_ancestor(other: E_TYPE): E_TYPE is
      local
         rto: E_TYPE;
      do
         rto := other.run_type;
         if rto.is_a(run_type) then
            Result := rto;
         elseif run_type.is_a(rto) then
            Result := run_type;
         else
            Result := type_any;
         end;
         eh.cancel;
      end;

   run_time_mark: STRING is
      do
         if is_run_type then
            Result := run_type.written_mark;
         end;
      end;

   is_run_type: BOOLEAN is
      local
         et: E_TYPE;
      do
         if run_type /= Void then
            Result := true;
         else
            et := elements_type;
            if et.is_run_type and then et.run_type = et then
               run_type := Current;
               load_basic_features;
               Result := true;
            end;
         end;
      end;

   to_runnable(ct: E_TYPE): like Current is
      local
         et1, et2: E_TYPE;
         rt: like Current;
      do
         et1 := elements_type;
         et2 := et1.to_runnable(ct);
         if et2 = Void then
            if et2 /= Void then
               eh.add_position(et2.start_position);
            end;
            eh.add_position(et1.start_position);
            fatal_error(fz_bga);
         end;
         et2 := et2.run_type;
         if run_type = Void then
            Result := Current;
            if et2 = et1 then
               run_type := Current;
               load_basic_features;
            else
               !!run_type.make_runnable(start_position,base_class_memory,et2);
               run_type.load_basic_features;
            end;
         elseif et2 = et1 then
            Result := Current;
         else
            !!rt.make_runnable(start_position,base_class_memory,et2);
            rt.load_basic_features;
            !!Result.set(base_class_memory,
			 rt.run_class,
			 base_class_name,
			 generic_list,
			 written_mark,
			 rt);
         end;
      end;

   stupid_switch(r: ARRAY[RUN_CLASS]): BOOLEAN is
      do
         Result := generic_list.first.stupid_switch(r);
      end;

   start_position: POSITION is
      do
         Result := base_class_name.start_position;
      end;

   is_a(other: E_TYPE): BOOLEAN is
      do
         -- Because of VNCE:
         Result := run_class = other.run_class;
         if not Result then
            eh.type_error(Current,other);
         end;
      end;

   id: INTEGER is
      do
         Result := run_class.id;
      end;

   c_sizeof: INTEGER is
      do
         Result := c_sizeof_pointer;
      end;

   c_header_pass1 is
      do
         generic_list.first.run_class.c_header_pass1;
      end;

   c_header_pass2 is
      local
         et: E_TYPE;
      do
         generic_list.first.run_class.c_header_pass2;
         et := elements_type.run_type;
         tmp_string.copy(fz_typedef);
         c_type_in(tmp_string);
         tmp_string.extend('T');
         id.append_in(tmp_string);
         tmp_string.append(fz_00);
         cpp.put_string(tmp_string);
      end;

   c_header_pass3 is
      do
      end;

   c_header_pass4 is
      do
         standard_c_print_function;
      end;

   need_c_struct: BOOLEAN is
      do
      end;

   c_initialize is
      do
         cpp.put_string(fz_null);
      end;

   c_initialize_in(str: STRING) is
      do
         str.append(fz_null);
      end;

   c_type_for_argument_in(str: STRING) is
      do
         str.extend('T');
         id.append_in(str);
      end;

   c_type_for_target_in(str: STRING) is
      do
         c_type_for_argument_in(str);
      end;

   c_type_for_result_in(str: STRING) is
      do
         c_type_for_argument_in(str);
      end;

   jvm_target_descriptor_in, jvm_descriptor_in(str: STRING) is
      do
         str.extend('[');
         elements_type.jvm_descriptor_in(str);
      end;

   jvm_return_code is
      do
         code_attribute.opcode_areturn;
      end;

   jvm_push_local(offset: INTEGER) is
      do
         code_attribute.opcode_aload(offset);
      end;

   jvm_check_class_invariant is
      do
      end;

   jvm_push_default: INTEGER is
      do
         code_attribute.opcode_aconst_null;
         Result := 1;
      end;

   jvm_write_local(offset: INTEGER) is
      do
         code_attribute.opcode_astore(offset);
      end;

   jvm_xnewarray is
      local
         idx: INTEGER;
      do
         tmp_string.clear;
         jvm_target_descriptor_in(tmp_string);
         idx := constant_pool.idx_class2(tmp_string);
         code_attribute.opcode_anewarray(idx);
      end;

   jvm_xastore is
      do
         code_attribute.opcode_aastore;
      end;

   jvm_xaload is
      do
         code_attribute.opcode_aaload;
      end;

   jvm_if_x_eq: INTEGER is
      do
         Result := code_attribute.opcode_if_acmpeq;
      end;

   jvm_if_x_ne: INTEGER is
      do
         Result := code_attribute.opcode_if_acmpne;
      end;

   jvm_to_reference is
      do
      end;

   jvm_expanded_from_reference(other: E_TYPE): INTEGER is
      do
         check
            false
         end;
      end;

   jvm_convert_to(destination: E_TYPE): INTEGER is
      do
         check
            run_time_mark = destination.run_time_mark
         end;
         Result := 1;
      end;

   jvm_standard_is_equal is
      local
         ca: like code_attribute;
         point1, point2: INTEGER;
      do
         ca := code_attribute;
         point1 := jvm_if_x_eq;
         ca.opcode_iconst_0;
         point2 := ca.opcode_goto;
         ca.resolve_u2_branch(point1);
         ca.opcode_iconst_1;
         ca.resolve_u2_branch(point2);
      end;

feature {RUN_CLASS,E_TYPE}

   need_gc_mark_function: BOOLEAN is true;

   just_before_gc_mark_in(c_code: STRING) is
      do
         c_code.append(once "if(");
         gc_na_env_in(c_code);
         c_code.append(once ".store_left>0){%N");
         gc_na_env_in(c_code);
         c_code.append(once ".store->header.size=");
         gc_na_env_in(c_code);
         c_code.append(once ".store_left;%N");
         gc_na_env_in(c_code);
         c_code.append(once ".store->header.magic_flag=RSOH_FREE;%N");
         gc_na_env_in(c_code);
         c_code.append(once ".store_left=0;%N}%N");
         gc_na_env_in(c_code);
         c_code.append(once ".chunk_list=NULL;%N");
         gc_na_env_in(c_code);
         c_code.append(once ".store_chunk=NULL;%N");
      end;

   gc_info_in(c_code: STRING) is
      do
         c_code.append(fz_53);
         gc_info_nb_in(c_code);
         c_code.append(once ")%Nfprintf(SE_GCINFO,%"%%d\t");
         c_code.append(run_time_mark);
         c_code.append(once " created.\n%",");
         gc_info_nb_in(c_code);
         c_code.append(once ");%N");
      end;

   gc_define1 is
      local
         rc: RUN_CLASS;
         rcid: INTEGER;
      do
         rc := run_class;
         rcid := rc.id;
         -- ------------------------------------ Declare na_envXXX :
         header.copy(once "na_env ");
         gc_na_env_in(header);
         body.copy(once "{0,NULL,NULL,NULL,(void(*)(T0*))");
         gc_mark_in(body);
         body.extend('}');
         cpp.put_extern5(header,body);
         -- -------------------------------- Declare gc_info_nbXXX :
         if gc_handler.info_flag then
            header.copy(fz_int);
            header.extend(' ');
            gc_info_nb_in(header);
            cpp.put_extern2(header,'0');
         end;
      end;

   gc_define2 is
      local
         et: E_TYPE;
         et_rc: RUN_CLASS;
         rcid: INTEGER;
      do
         et := elements_type;
         et_rc := et.run_class;
         rcid := run_class.id;
         -- ----------------------------- Definiton for gc_markXXX :
         header.copy(fz_void);
         header.extend(' ');
         gc_mark_in(header);
         header.append(once "(T");
         rcid.append_in(header);
         header.append(once " o)");
         body.clear;
         gc_mark(false);
         cpp.put_c_function(header,body);
         -- --------------------------------- Definiton for newXXX :
         header.clear;
         header.extend('T');
         rcid.append_in(header);
         header.extend(' ');
         header.append(fz_new);
         rcid.append_in(header);
         header.append(once "(int size)");
         body.copy(once "size=(size*sizeof(");
         et.c_type_for_result_in(body);
         body.append(once "))+sizeof(rsoh);%N%
                     %if((size%%sizeof(double))!=0)%
                     %size+=(sizeof(double)-(size%%sizeof(double)));%N");
         if gc_handler.info_flag then
            gc_info_nb_in(body);
            body.append(once "++;%N");
         end;
         body.append(once "if (size<=(");
         gc_na_env_in(body);
         body.append(once ".store_left)){%N%
                     %rsoh*r=");
         gc_na_env_in(body);
         body.append(once ".store;%N");
         gc_na_env_in(body);
         body.append(once ".store_left-=size;%N%
                     %if(");
         gc_na_env_in(body);
         body.append(once ".store_left>sizeof(rsoh)){%N%
                      %r->header.size=size;%N");
         gc_na_env_in(body);
         body.append(once ".store=((rsoh*)(((char*)(");
         gc_na_env_in(body);
         body.append(once ".store))+size));%N}%N%
                     %else {%N%
                     %r->header.size=size+");
         gc_na_env_in(body);
         body.append(once ".store_left;%N");
         gc_na_env_in(body);
         body.append(
            once ".store_left=0;%N}%N%
            %(r->header.magic_flag)=RSOH_UNMARKED;%N%
            %((void)memset((r+1),0,r->header.size-sizeof(rsoh)));%N%
            %return((T");
         rcid.append_in(body);
         body.append(once ")(r+1));%N}%N%
            %return((T");
         rcid.append_in(body);
         body.append(once ")new_na(&");
         gc_na_env_in(body);
         body.append(once ",size));%N");
         cpp.put_c_function(header,body);
      end;

feature {TYPE_NATIVE_ARRAY}

   load_basic_features is
         -- Force some basic feature to be loaded.
      require
         run_type = Current
      local
         et: E_TYPE; rf: RUN_FEATURE; rc: RUN_CLASS;
      do
         rc := run_class;
         rc.set_at_run_time;
         et := elements_type;
         if et.is_expanded then
            et.run_class.set_at_run_time;
         end;
         rf := rc.get_feature_with(as_item);
         rf := rc.get_feature_with(as_put);
	 if et.is_user_expanded then
	    if et.run_class.a_default_create /= Void then
	       rf := rc.get_feature_with(as_clear_all);
	    end;
	 end;
      end;

feature {NONE}

   c_type_in(str: STRING) is
      local
         et: E_TYPE;
      do
         et := elements_type;
         str.extend('T');
         if et.is_reference then
            str.extend('0');
            str.extend('*');
         else
            et.id.append_in(str);
         end;
         str.extend('*');
      end;

feature {NONE}

   gc_mark(is_unmarked: BOOLEAN) is
         -- The main purpose is to compute for example the best
         -- body for the gc_markXXX function. In fact, this
         -- feature may be called to produce C code when C variable
         -- `o' is not NULL.
         -- Finally, when `is_unmarked' is true, object `o' is unmarked.
      require
         not gc_handler.is_off;
         is_native_array;
         run_class.at_run_time
      local
         et: E_TYPE;
         et_rc: RUN_CLASS;
      do
         et := elements_type;
         et_rc := et.run_class;
         if et.need_gc_mark_function then
            body.append(
               once "rsoh*h=((rsoh*)o)-1;%N");
            if not is_unmarked then
               body.append(
                  once "if((h->header.magic_flag)==RSOH_UNMARKED){%N");
            end;
            body.append(
               once "h->header.magic_flag=RSOH_MARKED;%N");
            body.extend('{');
            c_type_in(body);
            body.remove_last(1);
            body.extend(' ');
            body.extend('e');
            body.append(fz_00);
            c_type_in(body);
            body.append(
               once "p=((void*)(o+((((h->header.size)-sizeof(rsoh))/sizeof(e))-1)));%N%
               %for(;((void*)p)>=((void*)o);p--){%N%
               %e=*p;%N");
            gc_handler.mark_for(body,once "e",et_rc);
            body.append(once "%N}%N}%N");
            if not is_unmarked then
               body.extend('}');
            end;
         else
            body.append(
               once "(((rsoh*)o)-1)->header.magic_flag=RSOH_MARKED;%N");
         end;
      end;

feature {NONE}

   frozen gc_na_env_in(str: STRING) is
      do
         str.append(once "na_env");
         id.append_in(str);
      end;

feature {E_TYPE}

   frozen short_hook is
      do
         short_print.a_class_name(base_class_name);
         short_print.hook_or(once "open_sb",once "[");
         generic_list.first.short_hook;
         short_print.hook_or(once "close_sb",once "]");
      end;

feature {NONE}

   make(sp: like start_position; of_what: E_TYPE) is
      require
         not sp.is_unknown;
         of_what /= Void
      do
         !!base_class_name.make(as_native_array,sp);
         !!generic_list.make(1,1);
         generic_list.put(of_what,1);
         tmp_string.copy(as_native_array);
         tmp_string.extend('[');
         tmp_string.append(of_what.written_mark);
         tmp_string.extend(']');
         written_mark := string_aliaser.item(tmp_string);
      ensure
         start_position = sp
      end;

   make_runnable(sp: like start_position; bcm: like base_class_memory;
		 of_what: E_TYPE) is
      require
         not sp.is_unknown;
         of_what.run_type = of_what
      do
         make(sp,of_what);
         run_type := Current;
      ensure
         is_run_type;
         written_mark = run_time_mark
      end;

   set(bcm: like base_class_memory; rcm: like run_class_memory;
       bcn: like base_class_name; gl: like generic_list;
       wm: like written_mark; rt: like run_type) is
      require
	 rcm = rt.run_class;
	 bcn.to_string = rt.run_class.base_class_name.to_string;
	 gl.count = 1;
	 wm /= Void;
	 rt.is_run_type;
      do
	 base_class_memory := bcm;
	 run_class_memory := rcm;
	 base_class_name := bcn;
	 generic_list := gl;
	 written_mark := wm;
	 run_type := rt;
      ensure
	 base_class_memory = bcm;
	 run_class_memory = rcm;
	 base_class_name = bcn;
	 generic_list = gl;
	 written_mark = wm;
	 run_type = rt
      end;

end -- TYPE_NATIVE_ARRAY

