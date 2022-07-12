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
class ONCE_MANIFEST_STRING_POOL
   --
   -- Unique global object in charge of once manifest string used (i.e. once
   -- manifest string in live code).
   --

inherit GLOBALS;

feature {MANIFEST_STRING}

   register(ms: MANIFEST_STRING): STRING is
         -- To register a runnable one.
         -- Choose the appropriate mangling.
      require
         not small_eiffel.is_ready;
         ms.is_once
      local
         x: INTEGER;
      do
         header.copy(once "ms");
         x := ms.start_position.base_class.id;
         x.append_in(header);
         header.extend('_');
         x := ms.to_string.hash_code;
         x.append_in(header);
         from
         until
            not mangling_dictionary.has(header)
         loop
            header.extend('a');
         end;
         Result := header.twin;
         mangling_dictionary.add(ms,Result);
	 -- To look for identical definition in order to optimize
	 -- a delivery:
	 -- multiple_definitions_warning(ms);
      end;

   se_ms_c_call_in(buffer: STRING; ms: MANIFEST_STRING) is
      do
	 buffer.append(once "se_ms(");
	 ms.count.append_in(buffer);
	 buffer.extend(',');
	 string_to_c_code(ms.to_string,buffer);
	 buffer.extend(')');
      end;

   se_ms_trace_c_call_in(buffer: STRING; ms: MANIFEST_STRING) is
      local
	 p: POSITION;
      do
	 buffer.append(once "se_ms_trace(");
	 ms.count.append_in(buffer);
	 buffer.extend(',');
	 string_to_c_code(ms.to_string,buffer);
	 p := ms.start_position;
	 buffer.extend(',');
	 p.line.append_in(buffer);
	 buffer.extend(',');
	 p.column.append_in(buffer);
	 buffer.extend(',');
	 string_to_c_code(p.path,buffer);
	 buffer.extend(')');
      end;

feature {SMALL_EIFFEL}

   c_define1(string_at_run_time: BOOLEAN) is
      do
         if not string_at_run_time then
            cpp.put_string(
               once "typedef struct S7 T7;%N%
               %struct S7{T9 _storage;T2 _count;T2 _capacity;};%N");
         end;
      end;

   c_define2(string_at_run_time: BOOLEAN) is
      require
         cpp.on_c
      local
         i, j, function_count, mdc: INTEGER;
         ms: MANIFEST_STRING;
      do
         mdc := mangling_dictionary.count;
         echo.print_count(once "Manifest String",mdc);
         if mdc > 0 then
            from -- For the *.h file:
               i := 1;
            until
               i > mdc
            loop
               ms := mangling_dictionary.item(i);
	       header.copy(fz_t7_star);
	       header.append(ms.mangling);
	       cpp.put_extern1(header);
               i := i + 1;
            end;
         end;
         define_se_ms(string_at_run_time);
         if mdc > 0 then
            from -- For the *.c file:
               i := 1;
               function_count := 1;
            until
               function_count > 1 and then i > mdc
            loop
               header.copy(fz_void);
               header.extend(' ');
               header.append(fz_se_msi);
               function_count.append_in(header);
               header.append(fz_c_void_args);
               from
                  body.clear;
                  j := nb_ms_per_function;
               until
                  j = 0 or else i > mdc
               loop
                  ms := mangling_dictionary.item(i);
		  body.append(ms.mangling);
		  body.extend('=');
		  se_ms_c_call_in(body,ms);
		  body.extend(';');
		  body.extend('%N');
                  j := j - 1;
                  i := i + 1;
               end;
               function_count := function_count + 1;
               if i <= mdc then
                  body.append(fz_se_msi);
                  function_count.append_in(body);
                  body.append(fz_c_no_args_procedure);
               end;
	       cpp.next_bunch_size(3);
               cpp.put_c_function(header,body);
            end;
	    if mdc > 0 and then ace.manifest_string_trace then
	       cpp.sys_runtime_h_and_c(fz_manifest_string_trace);
	    end;
         end;
      ensure
         cpp.on_c
      end;

feature {C_PRETTY_PRINTER}

   string_to_c_code(s: STRING; c_code: STRING) is
      local
         break, s_count, i: INTEGER;

      do
         c_code.extend('%"');
         from
            i := 1;
	    s_count := s.count;
         until
            i > s_count
         loop
            character_to_c_code(s.item(i),c_code);
            i := i + 1;
	    break := break + 1;
	    if break > 1024 then
	       -- Because of a limitation of the Visual C/C++
	       -- compiler which do not like too long lines:
	       c_code.append(once "%"%N%"");
	       break := 0;
	    end;
         end;
         c_code.extend('%"');
      end;

   character_to_c_code(c: CHARACTER; c_code: STRING) is
      do
         if c = '%N' then
            c_code.extend('\');
            c_code.extend('n');
         elseif c = '\' then
            c_code.extend('\');
            c_code.extend('\');
         elseif c = '%"' then
            c_code.extend('\');
            c_code.extend('%"');
         elseif c = '%'' then
            c_code.extend('\');
            c_code.extend('%'');
         elseif c.code < 32 or else 122 < c.code then
            c_code.extend('\');
            c.code.to_octal.append_in(c_code);
            c_code.append(once "%"%"");
         else
            c_code.extend(c);
         end;
      end;

   c_call_initialize is
      require
         cpp.on_c
      do
         if mangling_dictionary.count > 0 then
            cpp.put_string(fz_se_msi);
            cpp.put_character('1');
            cpp.put_string(fz_c_no_args_procedure);
         end;
      ensure
         cpp.on_c
      end;

feature {GC_HANDLER}

   define_manifest_string_mark is
      local
         i, mdc, ms_count, function_count: INTEGER;
         ms: MANIFEST_STRING;
      do
         mdc := mangling_dictionary.count;
         function_count := 1;
         define_manifest_string_mark_header(function_count);
         from
            i := 1;
         until
            i > mdc
         loop
            if ms_count > 300 then
               ms_count := 0;
               function_count := function_count + 1;
               cpp.put_string(fz_manifest_string_mark);
               cpp.put_integer(function_count);
               cpp.put_string(fz_c_no_args_procedure);
               cpp.put_string(fz_12);
               define_manifest_string_mark_header(function_count);
            end;
            ms := mangling_dictionary.item(i);
	    cpp.put_string(once "((rsoh*)(");
	    cpp.put_string(ms.mangling);
	    cpp.put_string(once "->_storage)-1)->header.magic_flag=RSOH_MARKED;%N");
	    ms_count := ms_count + 1;
            i := i + 1;
         end;
         cpp.put_string(fz_12);
      end;

feature {JVM}

   jvm_define_fields is
      local
         cp: like constant_pool;
         ms: MANIFEST_STRING;
         name_idx, string_idx, i, mdc: INTEGER;
      do
         mdc := mangling_dictionary.count;
         if mdc > 0 then
            cp := constant_pool;
            string_idx := cp.idx_eiffel_string_descriptor;
            from
               i := 1;
            until
               i > mdc
            loop
               ms := mangling_dictionary.item(i);
               name_idx := cp.idx_utf8(ms.mangling);
               field_info.add(9,name_idx,string_idx);
               i := i + 1;
            end;
         end;
      end;

   jvm_initialize_fields is
      local
         cp: like constant_pool; ca: like code_attribute;
         ms: MANIFEST_STRING; i, mdc: INTEGER;
      do
         mdc := mangling_dictionary.count;
         if mdc > 0 then
            cp := constant_pool;
            ca := code_attribute;
            from
               i := 1;
            until
               i > mdc
            loop
               ms := mangling_dictionary.item(i);
               ca.opcode_push_manifest_string(ms.to_string);
               ca.opcode_putstatic(ms.fieldref_idx,-1);
               i := i + 1;
            end;
         end;
      end;

feature {NONE}

   mangling_dictionary: DICTIONARY[MANIFEST_STRING,STRING] is
      once
         !!Result.with_capacity(4096);
      end;

   header: STRING is
      once
         !!Result.make(64);
      end;

   body: STRING is
      once
         !!Result.make(2048);
      end;

   define_se_ms(string_at_run_time: BOOLEAN) is
      do
         header.copy(once "T7*se_ms(int c,char*e)");
         body.copy(once "/* Allocate a Manifest STRING.*/%NT7*");
         gc_handler.new_manifest_string_in(body,string_at_run_time);
	 common_body_for_se_string_and_se_ms(string_at_run_time);
         --
         header.copy(once "T7*se_string(char*e)");
         body.copy(once "/* Allocate an Eiffel STRING by copying C char*e */%N%
		   %int c=strlen(e);%N%
		   %T7*");
	 if string_at_run_time then
	    gc_handler.allocation_in(once "s",body,type_string.run_class);
	 else
	    gc_handler.new_manifest_string_in(body,string_at_run_time);
	 end;
	 common_body_for_se_string_and_se_ms(string_at_run_time);
      end;

   common_body_for_se_string_and_se_ms(string_at_run_time: BOOLEAN) is
      do
         body.append(once "s->_count=c;%N%
		     %s->_capacity=c+1;%N%
		     %s->_storage=((T9)");
         gc_handler.new_native9_in(body,string_at_run_time);
         body.append(once "(c+1));%N%
		     %memcpy(s->_storage,e,c+1);%N%
		     %return s;");
         cpp.put_c_function(header,body);
      end;

   define_manifest_string_mark_header(number: INTEGER) is
      do
         header.copy(fz_void);
         header.extend(' ');
         header.append(fz_manifest_string_mark);
         number.append_in(header);
         header.append(fz_c_void_args);
         cpp.put_c_heading(header);
      end;

   fz_manifest_string_mark: STRING is "manifest_string_mark";

   fz_se_msi: STRING is "se_msi";

   nb_ms_per_function: INTEGER is 50;

   memory: DICTIONARY[MANIFEST_STRING,STRING];

   multiple_definitions_warning(ms: MANIFEST_STRING) is
      local
	 ms2: MANIFEST_STRING;
      do
	 if memory = Void then
	    create memory.make;
	    eh.append("Multiple definition of manifest string enabled.");
	    eh.print_as_warning;
	 end;
	 ms2 := memory.reference_at(ms.to_string);
	 if ms2 /= Void then
	    eh.add_position(ms.start_position);
	    eh.add_position(ms2.start_position);
	    eh.append("Multiple definition of the same once manifest string.");
	    eh.print_as_warning;
	 else
	    memory.add(ms,ms.to_string);
	 end;
      end;

end -- ONCE_MANIFEST_STRING_POOL

