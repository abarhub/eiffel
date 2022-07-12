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
class RUN_FEATURE_7

inherit RUN_FEATURE;

creation make

feature

   base_feature: EXTERNAL_PROCEDURE;

   arguments: FORMAL_ARG_LIST;

   require_assertion: RUN_REQUIRE;

   ensure_assertion: E_ENSURE;

   is_deferred: BOOLEAN is false;

   is_pre_computable: BOOLEAN is false;

   is_static: BOOLEAN is false;

   static_value_mem: INTEGER is 0;

   can_be_dropped: BOOLEAN is false;

   is_once_procedure: BOOLEAN is false;

   is_once_function: BOOLEAN is false;

   arg_count: INTEGER is
      do
         if arguments /= Void then
            Result := arguments.count;
         end;
      end;

   result_type: E_TYPE is
      do
      end;

   local_vars: LOCAL_VAR_LIST is
      do
      end;

   routine_body: COMPOUND is
      do
      end;

   rescue_compound: COMPOUND is
      do
      end;

   afd_check is
      do
         routine_afd_check;
      end;

   collect_c_tmp is
      do
      end;

   mapping_c is
      local
         bf: like base_feature;
         native: NATIVE;
         bcn: STRING;
      do
         bf := base_feature;
         native := bf.native;
         bcn := bf.base_class.name.to_string;
         native.c_mapping_procedure(Current,bcn,bf.first_name.to_string);
      end;

   c_define is
      local
         bf: like base_feature;
         native: NATIVE;
         bcn: STRING;
      do
         bf := base_feature;
         native := bf.native;
         bcn := bf.base_class.name.to_string;
         native.c_define_procedure(Current,bcn,bf.first_name.to_string);
      end;

feature {NONE}

   tmp_string: STRING is
      once
         !!Result.make(80);
      end;

feature {ADDRESS_OF_POOL}

   address_of_c_define(caller: ADDRESS_OF) is
      do
      end;

feature {ADDRESS_OF}

   address_of_c_mapping is
      do
      end;

feature {NONE}

   initialize is
      local
         n: STRING;
	 base_class: BASE_CLASS;
      do
	 base_class := current_type.base_class;
         n := base_feature.first_name.to_string;
         arguments := base_feature.arguments;
         if arguments /= Void then
            if not arguments.is_runnable(current_type) then
               !!arguments.with(arguments,current_type);
            end;
         end;
         if base_class.require_check then
            if as_copy = name.to_string
               and then current_type.is_expanded
             then
            else
               require_assertion := run_require;
            end;
         end;
         if base_class.ensure_check then
            ensure_assertion := run_ensure;
         end;
         if n.has_prefix(fz_basic_) then
            small_eiffel.register_sys_runtime_basic_of(n);
	 elseif as_raise_exception = n then
            exceptions_handler.set_used;
         end;
      end;

   compute_use_current is
      do
         if base_feature.use_current then
            use_current_state := True_state;
         else
            std_compute_use_current;
         end;
      end;

   compute_stupid_switch(r: ARRAY[RUN_CLASS]) is
      do
         small_eiffel.push(Current);
         if base_feature.native.stupid_switch_procedure(r,name.to_string) then
            stupid_switch_state := True_state;
         else
            stupid_switch_state := False_state;
         end;
         small_eiffel.pop;
      end;

feature {NATIVE}

   external_c_prototype_from(p: POSITION) is
      do
         external_c_prototype(p,base_feature);
      end;

   c_opening is
      do
         define_prototype;
         c_define_opening;
      end;

   c_closing is
      do
         c_define_closing;
         cpp.put_string(fz_12);
      end;

   jvm_opening is
      do
         method_info_start;
         jvm_define_opening;
      end;

   jvm_closing is
      do
         jvm_define_closing;
         code_attribute.opcode_return;
         method_info.finish;
      end;

feature {RUN_CLASS}

   jvm_field_or_method is
      local
         bf: like base_feature;
         native: NATIVE;
         bcn: STRING;
      do
         bf := base_feature;
         native := bf.native;
         bcn := bf.base_class.name.to_string;
         native.jvm_add_method_for_procedure(Current,bcn,bf.first_name.to_string);
      end;

feature

   mapping_jvm is
      local
         bf: like base_feature;
         native: NATIVE;
         bcn: STRING;
      do
         bf := base_feature;
         native := bf.native;
         bcn := bf.base_class.name.to_string;
         native.jvm_mapping_procedure(Current,bcn,bf.first_name.to_string);
      end;

feature {JVM}

   jvm_define is
      local
         bf: like base_feature;
         native: NATIVE;
         bcn: STRING;
      do
         bf := base_feature;
         native := bf.native;
         bcn := bf.base_class.name.to_string;
         native.jvm_define_procedure(Current,bcn,bf.first_name.to_string);
      end;

feature {NONE}

   update_tmp_jvm_descriptor is
      do
         routine_update_tmp_jvm_descriptor;
      end;

   stupid_switch_comment: STRING is "SSERRF7";

end -- RUN_FEATURE_7

