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
class FACE_TARGET
   --
   -- This pseudo expression is used to simulate some target of some
   -- invariable TYPE. As an example, this kind of object is used to
   -- simulate the target of a CECIL call.
   --

inherit EXPRESSION;

creation make

feature

   is_current: BOOLEAN is false;

   is_writable: BOOLEAN is false;

   is_static: BOOLEAN is false;

   is_pre_computable: BOOLEAN is false;

   is_manifest_string: BOOLEAN is false;

   is_result: BOOLEAN is false;

   is_void: BOOLEAN is false;

   can_be_dropped: BOOLEAN is true;

   use_current: BOOLEAN is false;

   c_simple: BOOLEAN is true;

   precedence: INTEGER is
      do
         Result := atomic_precedence;
      end;

   to_integer_or_error: INTEGER is
      do
	 to_integer_error;
      end;

   start_lookup_class: BASE_CLASS is
      do
         Result := result_type.base_class;
      end;

   result_type: E_TYPE;

   static_value: INTEGER is
      do
      end;

   start_position: POSITION is
      do
      end;

   assertion_check(tag: CHARACTER) is
      do
      end;

   afd_check is
      do
      end;

   to_runnable(ct: E_TYPE): like Current is
      do
         Result := Current;
      end;

   stupid_switch(r: ARRAY[RUN_CLASS]): BOOLEAN is
      do
	 Result := true;
      end;

   isa_dca_inline_argument: INTEGER is 0;

   dca_inline_argument(formal_arg_type: E_TYPE) is
      do
	 check false end;
      end;

   compile_to_c is
      do
	 cpp.put_character('C');
      end;

   mapping_c_target(target_type: E_TYPE) is
      do
	 target_type.mapping_cast;
         compile_to_c;
      end;

   mapping_c_arg(formal_arg_type: E_TYPE) is
      do
         mapping_c_target(result_type);
      end;

   c_frame_descriptor(format, locals: STRING) is do end;

   collect_c_tmp is do end;

   compile_to_jvm is
      do
         result_type.jvm_push_local(0);
      end;

   compile_target_to_jvm is
      do
         compile_to_jvm;
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

   jvm_assign is
      do
	 check false end;
      end;

   compile_to_jvm_into(dest: E_TYPE): INTEGER is
      do
      end;

   pretty_print is
      do
	 check false end;
      end;

   print_as_target is
      do
	 check false end;
      end;

   bracketed_pretty_print is
      do
	 check false end;
      end;

   short is
      do
	 check false end;
      end;

   short_target is
      do
	 check false end;
      end;

feature {NONE}

   make(rt: like result_type) is
      require
         rt /= Void
      do
         result_type := rt;
      ensure
         result_type = rt
      end;

invariant

   result_type /= Void;

end -- FACE_TARGET
