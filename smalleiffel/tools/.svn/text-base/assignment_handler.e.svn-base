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
class ASSIGNMENT_HANDLER
   --
   -- Singleton object used to register assignments from one type to another.
   -- First, one have to note that assignments not only occurs in the
   -- assignment itself but also while passing some argument or for creation
   -- statements.
   -- The `assignment_handler' singleton also builds the assignments type graph in
   -- order to compute the possible dynamic types of some expression. The
   -- assignments type graph is then used to buils RUN_TIME_SETs which are
   -- used to implement dynamic binding.
   -- This information is also mandatory to perform whole system analysis
   -- from the type safety point of view.
   -- This singleton is shared via the GLOBALS.`assignment_handler' once function.
   --

inherit GLOBALS;

feature {IMPLICIT_CAST}

   register(position: POSITION; source_type, destination_type: E_TYPE) is
         -- Register some assignment at occuring at `position' from some
         -- `source_type' into some `destination_type'.
      require
         source_type.run_time_mark /= destination_type.run_time_mark;
         source_type.is_expanded or destination_type.is_expanded
      local
	 s: like source;
      do
         computes_for(source_type,destination_type);
	 s := source_types.reference_at(entry);
         if s /= Void then
            source := s;
            if not source.is_a(source_type) then
               eh.cancel;
               source_types.put(source_type,entry);
            end;
         else
            if source.is_expanded then
               destination.run_class.set_at_run_time;
            end;
            source_types.put(source_type,entry);
            destination_types.put(destination_type,entry);
         end;
      end;

feature {EFFECTIVE_ARG_LIST,ASSIGNMENT,MANIFEST_ARRAY,CALL_INFIX1}

   implicit_cast(expression: EXPRESSION; into: E_TYPE): EXPRESSION is
         -- If necessary, wrap the `expression' inside an IMPLICIT_CAST
         -- invisible wrapper object.
      require
         expression.result_type.is_a(into)
      local
         source_bit, destination_bit: TYPE_BIT;
      do
         source := expression.result_type
         if source.run_time_mark = into.run_time_mark then
            Result := expression;
         elseif source.is_reference then
            if into.is_reference then
               -- Reference to Reference :
               Result := expression;
               generic_cast(into);
            else
               -- Reference to Expanded :
               !IMPLICIT_CAST!Result.make(expression,into);
            end;
         elseif into.is_reference then
            -- Expanded to Reference :
            computes_for(source,into);
            !IMPLICIT_CAST!Result.make(expression,destination);
         else
            -- Expanded to Expanded :
            if into.is_real and then source.is_integer then
               -- INTEGER to REAL :
               !IMPLICIT_CAST!Result.make(expression,into);
            elseif into.is_double then
               if source.is_integer or else source.is_real then
                  -- INTEGER to DOUBLE or REAL to DOUBLE :
                  !IMPLICIT_CAST!Result.make(expression,into);
               else
                  Result := expression;
               end;
            elseif into.is_bit then
               source_bit ?= source.run_type;
               destination_bit ?= into.run_type;
               if source_bit.nb /= destination_bit.nb then
                  !IMPLICIT_CAST!Result.make(expression,into);
               else
                  Result := expression;
               end;
            else
               Result := expression;
               generic_cast(into);
            end;
         end;
      ensure
         Result /= Void
      end;

feature {SWITCH, FORMAL_ARG_LIST, E_STRIP}

   passing(source_type, destination_type: E_TYPE) is
      local
	 unknown_position: POSITION;
      do
         if source_type.is_expanded then
            if destination_type.is_reference then
               register(unknown_position,source_type,destination_type);
            end;
         elseif destination_type.is_expanded then
            register(unknown_position,source_type,destination_type);
         else
            source := source_type;
            generic_cast(destination_type);
         end;
      end;

feature {IMPLICIT_CAST,C_PRETTY_PRINTER,E_STRIP,SWITCH}

   c_function_call(source_type, destination_type: E_TYPE) is
      do
         computes_for(source_type,destination_type);
         if source.run_time_mark /= destination.run_time_mark then
            cpp.put_character('T');
            cpp.put_integer(source.id);
            cpp.put_string(fz_to_t);
            cpp.put_integer(destination.id);
            cpp.put_character('(');
         else
            cpp.put_string(once "/*NO_CONVERSION*/(");
         end;
      end;

feature {C_PRETTY_PRINTER}

   c_definitions is
      local
         i: INTEGER;
      do
         from
            i := 1;
         until
            i > source_types.count
         loop
            source := source_types.item(i);
            entry := source_types.key(i);
            destination := destination_types.at(entry);
            computes_for(source,destination);
            if source.is_bit then
               c_function_definition;
            elseif source.is_expanded and then destination.is_expanded then
               -- Because it is worthless or already done with #define in
               -- "SmallEiffel/sys/runtime/base.h".
            else
               c_function_definition;
            end;
            i := i + 1;
         end;
      end;

feature {SMALL_EIFFEL}

   finish_falling_down is
      local
         i: INTEGER;
         source_type, destination_type: E_TYPE;
         rc1, rc2: RUN_CLASS;
      do
         from
            i := 1;
         until
            i > source_types.count
         loop
            source_type := source_types.item(i);
            entry := source_types.key(i);
            destination_type := destination_types.at(entry);
            computes_for(source_type,destination_type);
            if source.is_reference then
               if destination.is_expanded then
                  echo.put_string(entry);
                  echo.put_string(once " (once ");
                  echo.put_string(source_type.run_time_mark);
                  echo.put_string(fz_to);
                  echo.put_string(destination_type.run_time_mark);
                  echo.put_string(once ")%N");
                  small_eiffel.reference_to_expanded(source_type);
               end;
            end;
            if source.is_user_expanded then
               if destination.is_reference then
                  rc1 := source.run_class;
                  rc2 := destination.run_class;
               end;
            elseif destination.is_user_expanded then
               if source.is_reference then
                  rc1 := source.run_class;
                  rc2 := destination.run_class;
               end;
            end;
            if rc1 /= Void then
               rc1.shared_attributes(rc2);
               rc2.shared_attributes(rc1);
               rc1 := Void;
            end;
            i := i + 1;
         end;
      end;

feature {NONE}

   source, destination: E_TYPE;
         -- Temporary memory to store actual `source' and `destination' type.

   entry: STRING;
         -- Temporary memory to store the `entry' in dictionaries.

   computes_for(source_type, destination_type: E_TYPE) is
         -- Compute actual `source' and `destination' as well as the
         -- corresponding `entry' used for dictionaries.
      require
         source_type.is_expanded or destination_type.is_expanded
      do
         if source_type.is_expanded then
            source := source_type;
            if destination_type.is_expanded then
               destination := destination_type;
            else
               destination := source.actual_reference(destination_type);
            end;
         else
            destination := destination_type;
            source := destination.actual_reference(source_type);
         end;
         buffer.clear;
         buffer.append(source.run_time_mark);
         buffer.append(fz_to);
         buffer.append(destination.run_time_mark);
         entry := string_aliaser.item(buffer);
      end;

   source_types: DICTIONARY[E_TYPE,STRING] is
         -- All source types available from some `entry'.
      once
         !!Result.make;
      end;

   destination_types: DICTIONARY[E_TYPE,STRING] is
         -- All destination types available from `entry'.
      once
         !!Result.make;
      end;

   c_function_definition is
         -- Called to produce the C convertion function for `entry', `source'
         -- and `destination'.
      require
         source.run_time_mark /= destination.run_time_mark
      local
	 rc: RUN_CLASS;
      do
         echo.put_string(once "Conversion from ");
         echo.put_string(entry);
         echo.put_string(once " in C function ");
         buffer.clear;
         destination.c_type_for_result_in(buffer);
         buffer.extend(' ');
         buffer.extend('T');
         source.id.append_in(buffer);
         buffer.append(fz_to_t);
         destination.id.append_in(buffer);
         buffer.extend('(');
         source.c_type_for_argument_in(buffer)
         buffer.append(once " source)");
         echo.put_string(buffer);
         echo.put_string(fz_dot_new_line);
         if destination.is_expanded then
            if source.is_expanded then
	       -- expanded to expanded:
               buffer.copy(once "#define T");
               source.id.append_in(buffer);
               buffer.append(fz_to_t);
               destination.id.append_in(buffer);
               buffer.append(once "(x) (x)%N");
               cpp.put_string_on_h(buffer);
            elseif entry.has_prefix(fz_reference) then
	       -- general reference EXPANDED to expanded:
	       cpp.put_c_heading(buffer);
	       buffer.clear;
	       buffer.extend(' ');
	       destination.c_type_for_result_in(buffer);
	       buffer.append(once " destination;%N%
				  %memcpy(&destination,(((Tid*)source)");
	       rc := source.run_class;
	       if rc.is_tagged then
		  buffer.append(once "+1");
	       end;
	       buffer.append(once "),sizeof(destination));%N%
				  %return destination;%N}%N");
	       cpp.put_string(buffer);
	    else
	       -- *_REF to expanded:
	       cpp.put_c_heading(buffer);
	       buffer.copy(once "return (((");
	       source.c_type_for_target_in(buffer);
	       buffer.append(once ")source)->_item);%N}%N");
	       cpp.put_string(buffer);
	    end;
         else
	    -- expanded to reference :
            cpp.put_c_heading(buffer);
            cpp.put_character('T');
            cpp.put_integer(destination.id);
            cpp.put_character('*');
	    rc := destination.run_class;
            gc_handler.allocation_of(once "destination",rc);
	    if source.is_basic_eiffel_expanded then
	       cpp.put_string(once "destination->_item=source;%N");
	    else
	       cpp.put_string(once "memcpy((((Tid*)destination)");
	       if rc.is_tagged then
		  cpp.put_string(once "+1");
	       end;
	       cpp.put_string(once "),&source,sizeof(source));%N");
	    end;
            cpp.put_string(once "return ((T0*)destination);%N}%N");
         end;
      end;

   generic_cast(destination_type: E_TYPE) is
      local
         s_gl, d_gl: ARRAY[E_TYPE];
         s, d: E_TYPE;
         i, j: INTEGER;
      do
         if source.is_generic and then destination_type.is_generic then
            s_gl := source.generic_list;
            d_gl := destination_type.generic_list;
            from
               i := s_gl.upper;
            until
               i = 0
            loop
               from
                  j := d_gl.upper;
                  s := s_gl.item(i);
               until
                  j = 0
               loop
                  d := d_gl.item(j);
                  if d.is_a(s) then
                     passing(d,s);
                  else
                     eh.cancel;
                  end;
                  j := j - 1;
               end;
               i := i - 1;
            end;
         end;
      end;

   buffer: STRING is
      once
         !!Result.make(128);
      end;

   fz_to: STRING is " to ";

   singleton_memory: ASSIGNMENT_HANDLER is
      once
         Result := Current;
      end;

invariant

   is_real_singleton: Current = singleton_memory

end -- ASSIGNMENT_HANDLER
