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
deferred class TYPE_OF_AGENT
   --
   -- Common for all TYPEs of agents: TYPE_ROUTINE, TYPE_PROCEDURE,
   -- TYPE_FUNCTION and TYPE_PREDICATE.
   --

inherit E_TYPE;

feature

   is_any: BOOLEAN is false;

   is_none: BOOLEAN is false;

   start_position: POSITION;

   base_class_name: CLASS_NAME;

   is_reference: BOOLEAN is true;

   is_expanded: BOOLEAN is false;

   is_like_current: BOOLEAN is false;

   is_array: BOOLEAN is false;

   is_basic_eiffel_expanded: BOOLEAN is false;

   c_sizeof: INTEGER is
      do
         Result := c_sizeof_pointer;
      end;

   frozen c_type_for_target_in(buffer: STRING) is
      do
	 buffer.extend('T');
	 id.append_in(buffer);
	 buffer.extend('*');
      end;

   frozen c_type_for_argument_in,
   frozen c_type_for_result_in(buffer: STRING) is
      do
	 buffer.append("/*agent*/T0*");
      end;

   frozen start_lookup_name: CLASS_NAME is
      do
	 Result := base_class_name;
      end;

   is_like_feature: BOOLEAN is false;

   frozen is_a(other: E_TYPE): BOOLEAN is
      local
	 type_of_agent: TYPE_OF_AGENT;
      do
	 type_of_agent ?= other.run_type;
	 if type_of_agent /= Void then
	    Result := is_a_(type_of_agent);
	 end;
         if not Result then
            eh.type_error(Current,other);
         end;
      end;

   frozen generic_list: ARRAY[E_TYPE] is
      do
	 check false end;
      end;

   is_generic: BOOLEAN is false;

   c_initialize_in(str: STRING) is
      do
	 str.append(fz_null);
      end;

   c_initialize is
      do
	 cpp.put_string(fz_null);
      end;

   frozen c_header_pass1 is
      do
	 cpp.put_string(once "typedef T0 T");
	 cpp.put_integer(id);
	 cpp.put_character(';');
	 cpp.put_character('%N');
      end;

   frozen c_header_pass2 is
      do
      end;

   frozen c_header_pass3 is
      do
      end;

   frozen c_header_pass4 is
      do
         standard_c_print_function;
      end;

   just_before_gc_mark_in(str: STRING) is do end;

   frozen gc_define1 is
      do
	 cpp.put_string("#define gc_mark");
	 cpp.put_integer(id);
	 cpp.put_string("(x) gc_mark_agent((x))%N");
      end;

   frozen gc_define2 is do end;

   is_user_expanded: BOOLEAN is false;

   need_gc_mark_function: BOOLEAN is true;

   stupid_switch(r: ARRAY[RUN_CLASS]): BOOLEAN is do end;

   gc_info_in(str: STRING) is
      do
      end;

   is_dummy_expanded: BOOLEAN is false;

   need_c_struct: BOOLEAN is false;

   actual_reference(destination: E_TYPE): E_TYPE is
      do
	 check false end;
      end;

   is_like_argument: BOOLEAN is false;

   smallest_ancestor(other: E_TYPE): E_TYPE is
      do
	 not_yet_implemented;
      end;

   pretty_print is
      do
         fmt.put_string(written_mark);
      end;

   frozen id: INTEGER is
      do
	 Result := run_class.id;
      end;

   frozen jvm_xnewarray is
      do
	 not_yet_implemented;
      end;

   frozen jvm_check_class_invariant is do end;

   frozen jvm_if_x_ne: INTEGER is
      do
	 not_yet_implemented;
      end;

   frozen jvm_return_code is
      do
	 not_yet_implemented;
      end;

   frozen jvm_convert_to(destination: E_TYPE): INTEGER is
      do
	 not_yet_implemented;
      end;

   frozen jvm_target_descriptor_in(str: STRING) is
      do
	 not_yet_implemented;
      end;

   frozen jvm_push_local(offset: INTEGER) is
      do
         code_attribute.opcode_aload(offset);
      end;

   frozen jvm_xaload is
      do
	 not_yet_implemented;
      end;

   frozen jvm_write_local(offset: INTEGER) is
      do
         code_attribute.opcode_astore(offset);
      end;

   frozen jvm_expanded_from_reference(other: E_TYPE): INTEGER is
      do
	 check false end;
      end;

   frozen jvm_push_default: INTEGER is
      do
         code_attribute.opcode_aconst_null;
         Result := 1;
      end;

   frozen jvm_descriptor_in(str: STRING) is
      do
	 not_yet_implemented;
      end;

   frozen jvm_method_flags: INTEGER is
      do
	 not_yet_implemented;
      end;

   frozen jvm_standard_is_equal is
      do
	 not_yet_implemented;
      end;

   frozen jvm_xastore is
      do
	 not_yet_implemented;
      end;

   frozen jvm_if_x_eq: INTEGER is
      do
	 not_yet_implemented;
      end;

feature {TYPE_OF_AGENT, AGENT_POOL}

   base: E_TYPE;
	 -- Type to which the feature belongs.

   open: TYPE_TUPLE;
	 -- Tuple of the types of open operands, if any.

   res: E_TYPE;
	 -- If any, the type of the `Result'.

   current_type: E_TYPE;
	 -- Non Void when checked in.

   run_type_memory: like Current;

feature {NONE}

   written_mark_memory: STRING;

   run_time_mark_memory: STRING;

   is_a_(other: TYPE_OF_AGENT): BOOLEAN is
      deferred
      end;

invariant

   base /= Void;

   open /= Void;

end -- TYPE_OF_AGENT
