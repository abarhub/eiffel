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
class COMPOUND
   --
   -- An ordered sequence of Eiffel instructions.
   --

inherit GLOBALS;

creation {EIFFEL_PARSER,E_PROCEDURE} make_0, make_1

creation {RUN_CLASS} make

creation {COMPOUND} from_compound

feature

   header_comment: COMMENT;
	 -- The one which may be placed at the beginning of the
	 -- compound.

   count: INTEGER is
      do
         if first_one = Void then
         elseif remainder /= Void then
            Result := remainder.upper + 2;
         else
            Result := 1;
         end;
      end;

   first: INSTRUCTION is
      require
         count >= 1
      do
         Result := first_one;
      ensure
         Result /= Void
      end;

   start_position: POSITION is
      do
         if first_one /= Void then
            Result := first_one.start_position;
         end;
      end;

   run_class: RUN_CLASS is
      do
         Result := current_type.run_class;
      end;

   afd_check is
      local
         i: INTEGER;
      do
         from
            i := count;
         until
            i = 0
         loop
            item(i).afd_check;
            i := i - 1;
         end;
      end;

   compile_to_c is
      local
         i, c: INTEGER;
         instruction: INSTRUCTION;
         need_se_tmp: BOOLEAN;
      do
	 from
	    i := 1;
	    c := count;
	 until
	    i > c
	 loop
	    instruction := item(i);
	    instruction.collect_c_tmp;
	    need_se_tmp := cpp.se_tmp_open_declaration;
	    instruction.compile_to_c;
	    if need_se_tmp then
	       cpp.se_tmp_close_declaration;
	    end;
	    i := i + 1;
	 end;
      end;

   compile_to_jvm is
      local
         i, c: INTEGER;
         instruction: INSTRUCTION;
         trace: BOOLEAN;
         ca: like code_attribute;
      do
         from
            c := count;
            ca := code_attribute;
            trace := start_position.run_time_trace;
            i := 1;
         until
            i > c
         loop
            instruction := item(i);
            if trace then
               ca.se_trace(current_type,instruction.start_position);
            end;
            instruction.compile_to_jvm;
            i := i + 1;
         end;
      end;

   use_current: BOOLEAN is
      local
         i: INTEGER;
      do
         from
            i := count;
         until
            Result or else i = 0
         loop
            Result := item(i).use_current;
            i := i - 1;
         end;
      end;

   stupid_switch(r: ARRAY[RUN_CLASS]): BOOLEAN is
      local
         i: INTEGER;
      do
         from
            Result := true
            i := count;
         until
            not Result or else i = 0
         loop
            Result := item(i).stupid_switch(r);
            i := i - 1;
         end;
      end;

   is_pre_computable: BOOLEAN is
      local
         i: INTEGER;
      do
         from
            i := count;
            Result := true;
         until
            not Result or else i = 0
         loop
            Result := item(i).is_pre_computable;
            i := i - 1;
         end;
      end;

   to_runnable(ct: E_TYPE): like Current is
      require
         ct.run_type = ct;
         nb_errors = 0
      local
         i: INTEGER;
         i1, i2: INSTRUCTION;
      do
         if first_one = Void then
            Result := Current;
         elseif current_type = Void then
            current_type := ct;
            from
               i := count;
            until
               i = 0
            loop
               i1 := item(i);
               i2 := i1.to_runnable(ct);
               if nb_errors > 0 then
                  eh.append("Bad instruction (when interpreted in ");
                  eh.append(current_type.written_mark);
                  eh.add_position(i1.start_position);
                  fatal_error(").");
               else
                  put(i2,i);
               end;
               i := i - 1;
            end;
            Result := Current;
         else
            !!Result.from_compound(Current);
            Result := Result.to_runnable(ct);
         end;
      ensure
         Result /= Void
      end;

   pretty_print is
      require
         fmt.indent_level >= 2
      local
         i, c: INTEGER;
      do
         c := count
         fmt.level_incr;
         fmt.indent;
         if header_comment /= Void then
            header_comment.pretty_print;
         end;
         from
            i := 1;
         until
            i > c
         loop
            fmt.set_semi_colon_flag(true);
            if fmt.zen_mode and then i = c then
               fmt.set_semi_colon_flag(false);
            end;
            fmt.indent;
            item(i).pretty_print;
            i := i + 1;
         end;
         fmt.level_decr;
      ensure
         fmt.indent_level = old fmt.indent_level
      end;

   empty_or_null_body: BOOLEAN is
      do
         Result := first_one = Void;
      end;

feature {EIFFEL_PARSER}

   add_last(instruction: INSTRUCTION) is
      require
	 instruction /= Void
      local
	 e_debug: E_DEBUG;
	 e_check: E_CHECK;
	 base_class: BASE_CLASS;
      do
	 if small_eiffel.pretty_flag then
	    perform_add_last(instruction);
	 else
	    e_debug ?= instruction;
	    if e_debug /= Void then
	       if ace.debug_check(e_debug) then
		  perform_add_last(e_debug);
	       end;
	    else
	       e_check ?= instruction;
	       if e_check /= Void then
		  base_class := e_check.start_position.base_class;
		  if base_class.all_check then
		     perform_add_last(e_check);
		  end;
	       else
		  perform_add_last(instruction);
	       end;
	    end;
	 end;
      ensure
	 count.in_range(old count,1 + old count)
      end;

feature {COMPOUND}

   first_one: INSTRUCTION;
         -- The `first_one' if any.

   remainder: FIXED_ARRAY[INSTRUCTION];
         -- Non Void when the list has more than one element.

   item(i: INTEGER): INSTRUCTION is
      require
         i.in_range(1,count)
      do
         if i = 1 then
            Result := first_one;
         else
            Result := remainder.item(i - 2);
         end;
      end;

feature {NONE}

   current_type: E_TYPE;
         -- Not Void when checked in.

   make_0(hc: like header_comment) is
      require
         hc /= Void
      do
         header_comment := hc;
      ensure
         header_comment = hc
      end;

   make_1(hc: like header_comment; fo: like first_one) is
      require
         fo /= Void
      do
         header_comment := hc;
	 add_last(fo);
      ensure
         header_comment = hc
      end;

   make(hc: like header_comment; fo: like first_one; r: like remainder) is
      require
         hc /= Void or else fo /= Void;
         r /= Void implies fo /= Void
      do
         header_comment := hc;
         first_one := fo;
         remainder := r;
      ensure
         header_comment = hc;
         first_one = fo;
         remainder = r
      end;

   from_compound(c: like Current) is
      require
         c /= Void
      do
         header_comment := c.header_comment;
         first_one := c.first_one;
         remainder := c.remainder;
         if remainder /= Void then
            remainder := remainder.twin;
         end;
      ensure
         header_comment = c.header_comment;
         count = c.count
      end;

   put(i: INSTRUCTION; idx: INTEGER) is
      require
         i /= Void;
         idx.in_range(1,count)
      do
         if idx = 1 then
            first_one := i;
         else
            remainder.put(i,idx - 2);
         end;
      end;

   perform_add_last(instruction: INSTRUCTION) is
	 -- Really perform the `add_last'.
      require
	 instruction /= Void
      do
	 if first_one = Void then
	    first_one := instruction;
	 else
	    if remainder = Void then
	       !!remainder.with_capacity(8);
	    end;
	    remainder.add_last(instruction);
	 end;
      ensure
	 count = 1 + old count
      end;

invariant

   remainder /= Void implies first_one /= Void;

end -- COMPOUND

