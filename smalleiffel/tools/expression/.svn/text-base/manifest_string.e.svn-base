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
class MANIFEST_STRING
   --
   -- Any kind of manifest strings: simple basic manifest strings as well
   -- as multi-line verbatim manifest strings. Also note that the onceness
   -- status of the corresponding manifest string is also part of the
   -- MANIFEST_STRING object knowledge.
   --

inherit EXPRESSION;

creation {EIFFEL_PARSER} make

feature

   start_position: POSITION;
         -- Of the first opening '%"' character or of the "once"  keyword
         -- if any.

   is_once: BOOLEAN;
	 -- Is it a once manifest string?

   to_string: STRING;
         -- The content of the Eiffel string from the programmer's point of
         -- view (i.e. what is inside the manifest string at run time).
	 -- (See also `source_view'.)

feature {NONE}

   source_view: FIXED_ARRAY[STRING];
	 -- The manifest string as it appear in the Eiffel source file (see
	 -- also `to_string'). This information is only computed for
	 -- formatting tools (`pretty' or `short' for example).

feature {MANIFEST_STRING,ONCE_MANIFEST_STRING_POOL}

   mangling: STRING;
         -- When runnable. Name to be used for the corresponding C
         -- global variable or for the JVM corresponding field.

feature

   is_manifest_string: BOOLEAN is true;

   is_manifest_array: BOOLEAN is false;

   is_writable: BOOLEAN is false;

   is_current: BOOLEAN is false;

   is_static: BOOLEAN is false;

   is_void: BOOLEAN is false;

   is_result: BOOLEAN is false;

   use_current: BOOLEAN is false;

   is_pre_computable: BOOLEAN is true;

   c_simple: BOOLEAN is true;

   can_be_dropped: BOOLEAN is true;

   start_lookup_class: BASE_CLASS is do end;

   result_type: TYPE_STRING is
      do
         Result := type_string;
      end;

   assertion_check(tag: CHARACTER) is
      do
      end;

   to_integer_or_error: INTEGER is
      do
	 to_integer_error;
      end;

   static_value: INTEGER is
      do
      end;

   isa_dca_inline_argument: INTEGER is
      do
      end;

   dca_inline_argument(formal_arg_type: E_TYPE) is
      do
      end;

   compile_to_c is
      do
	 c_code.clear;
	 c_code.extend('(');
	 c_code.append(fz_cast_t0_star);
	 if is_once then
	    c_code.append(mangling);
	 elseif ace.manifest_string_trace then
	    once_manifest_string_pool.se_ms_trace_c_call_in(c_code,Current);
	 else
	    once_manifest_string_pool.se_ms_c_call_in(c_code,Current);
	 end;
	 c_code.extend(')');
	 cpp.put_string(c_code);
      end;

   mapping_c_target(target_type: E_TYPE) is
      do
	 if is_once then
	    cpp.put_string(mangling);
	 else
	    c_code.clear;
	    if ace.manifest_string_trace then
	       once_manifest_string_pool.se_ms_trace_c_call_in(c_code,Current);
	    else
	       once_manifest_string_pool.se_ms_c_call_in(c_code,Current);
	    end;
	    cpp.put_string(c_code);
	 end;
      end;

   mapping_c_arg(formal_arg_type: E_TYPE) is
      do
         compile_to_c;
      end;

   collect_c_tmp is do end;

   c_frame_descriptor(format, locals: STRING) is do end;

   afd_check is do end;

   count: INTEGER is
      do
         Result := to_string.count;
      end;

   compile_target_to_jvm, compile_to_jvm is
      local
         idx: INTEGER;
      do
	 if is_once then
	    idx := fieldref_idx;
	    code_attribute.opcode_getstatic(idx,1);
	 else
	    code_attribute.opcode_push_manifest_string(to_string);
	 end;
      end;

   compile_to_jvm_assignment(a: ASSIGNMENT) is
      do
      end;

   jvm_branch_if_false: INTEGER is
      do
      end;

   jvm_branch_if_true: INTEGER is
      do
      end;

   jvm_assign is
      do
      end;

   compile_to_jvm_into(dest: E_TYPE): INTEGER is
      do
         Result := 1;
         compile_to_jvm;
      end;

   to_runnable(ct: E_TYPE): MANIFEST_STRING is
      do
	 type_string_set_at_run_time;	 
	 if is_once then
	    if mangling = Void then
	       mangling := once_manifest_string_pool.register(Current);
	    end;
	 end;
         Result := Current;
      end;

   stupid_switch(r: ARRAY[RUN_CLASS]): BOOLEAN is
      do
         Result := true;
      end;

   precedence: INTEGER is
      do
         Result := atomic_precedence;
      end;

   bracketed_pretty_print, pretty_print is
      local
         i: INTEGER;
      do
	 if is_once then
	    fmt.keyword(fz_once);
	 end;
         from
            i := source_view.lower;
         until
            i > source_view.upper
         loop
	    fmt.put_string(source_view.item(i));
            i := i + 1;
         end;
      end;

   print_as_target is
      do
         fmt.put_character('(');
         pretty_print;
         fmt.put_character(')');
         fmt.put_character('.');
      end;

   short is
      local
         i, j: INTEGER; line_view: STRING;
      do
	 if is_once then
	    short_print.hook_or(fz_once,once "once ");
	 end;
         short_print.hook_or("open_ms","%"");
         from
            i := source_view.lower;
         until
            i > source_view.upper
         loop
            line_view := source_view.item(i);
	    from
	       j := 1;
	    until
	       j > line_view.count
	    loop
	       if i = source_view.lower and then j = 1 then
		  -- (to skip the opening %")
	       elseif i = source_view.upper and then j = line_view.count then
		  -- (to skip the closing %")
	       else
		  short_print.a_character(line_view.item(j))
	       end;
	       j := j + 1;
	    end;
            i := i + 1;
         end;
         short_print.hook_or("close_ms","%"");
      end;

   short_target is
      do
         bracketed_short;
         short_print.a_dot;
      end;

feature {EIFFEL_PARSER,CST_ATT_STRING}

   set_is_once(flag: BOOLEAN) is
      do
	 is_once := flag;
      ensure
	 is_once = flag
      end;

feature {EIFFEL_PARSER}

   set_source_view(sv: like source_view) is
      do
	 check
	    (sv /= Void) = (small_eiffel.short_flag or
			    small_eiffel.pretty_flag)
	 end;
	 source_view := sv;
      ensure
	 source_view = sv
      end;

feature {ONCE_MANIFEST_STRING_POOL}

   fieldref_idx: INTEGER is
      do
         Result := constant_pool.idx_fieldref_for_manifest_string(mangling);
      end;

feature {NONE}

   make(sp: like start_position; onceness: like is_once;
	ts: like to_string) is
      require
         not sp.is_unknown;
	 ts /= Void
      do
         start_position := sp;
	 is_once := onceness;
         to_string := ts.twin;
      ensure
         start_position = sp;
	 is_once = onceness;
	 to_string /= ts and then to_string.is_equal(ts)
      end;

   pretty_print_character(i: INTEGER) is
      require
         1 <= i;
         i <= count;
      local
         val: INTEGER;
      do
         if percent /= Void and then percent.fast_has(i) then
            tmp_string.clear;
            character_coding(to_string.item(i),tmp_string);
            fmt.put_string(tmp_string);
         elseif ascii /= Void and then ascii.fast_has(i) then
            val := to_string.item(i).code;
            fmt.put_string("%%/");
            fmt.put_integer(val);
            fmt.put_string(as_slash);
         else
            fmt.put_character(to_string.item(i));
         end;
      end;

   c_code: STRING is
      once
	 create Result.make(512);
      end;

   type_string_set_at_run_time is
      once
	 type_string.set_at_run_time;
      end;

invariant

   not start_position.is_unknown;

   to_string /= Void;

end -- MANIFEST_STRING
