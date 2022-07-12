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
class ERROR_HANDLER
   --
   -- The unique `eh' object for Warning, Error and Fatal Error
   -- handling.
   -- This handler use an assynchronous strategy.
   --

inherit GLOBALS;

feature

   error_counter, warning_counter: INTEGER;
         -- Global counters.

   no_warning: BOOLEAN;
	 -- To avoid warning messages.

   is_empty: BOOLEAN is
         -- True when nothing stored in `explanation' and `positions'.
      do
         Result := explanation.is_empty and then positions.is_empty;
      end;

   set_no_warning is
      do
         no_warning := true;
      end;

   append(s: STRING) is
	 -- Append text `s' to the current `explanation'.
      require
         not s.is_empty
      do
         explanation.append(s);
      ensure
         not is_empty
      end;

   append_integer(i: INTEGER) is
	 -- Append integer `i' to the current `explanation'.
      do
         i.append_in(explanation);
      ensure
         not is_empty
      end;

   extend(c: CHARACTER) is
	 -- Append `c' to the current `explanation'.
      do
         explanation.extend(c);
      ensure
         not is_empty
      end;

   add_position(p: POSITION) is
	 -- If necessary, add `p' to the already known `positions'.
      do
         if p.is_unknown then
         else
            positions.add_last(p);
         end;
      end;

   add_type(t: E_TYPE; tail: STRING) is
      require
         t /= Void
      do
         append(once "Type ");
         if t.is_run_type then
            append(t.run_time_mark);
         else
            append(t.written_mark);
         end;
         append(tail);
         add_position(t.start_position);
      end;

   feature_not_found(fn: FEATURE_NAME) is
      require
         fn /= Void
      do
         add_position(fn.start_position);
         append(fz_09);
         append(fn.to_string);
         append(fz_not_found);
      end;

   add_feature_name(fn: FEATURE_NAME) is
      require
         fn /= Void
      do
         append(fn.to_string);
         extend(':');
         extend(' ');
         add_position(fn.start_position);
      end;

   type_error(t1, t2: E_TYPE) is
      require
	 t1 /= Void; t2 /= Void
      do
	 add_type(t1,once " is not a kind of ");
	 add_type(t2,fz_dot_blank);
      ensure
      not is_empty
      end;

   print_as_warning is
         -- Print `explanation' as a Warning report.
         -- After printing, `explanation' and `positions' are reset.
      require
         not is_empty
      do
         if no_warning then
            cancel;
         else
            do_print(once "Warning");
         end;
         warning_counter := warning_counter + 1;
      ensure
	 warning_counter = old warning_counter + 1
      end;

   print_as_error is
         -- Print `explanation' as an Error report.
         -- After printing, `explanation' and `positions' are reset.
      require
         not is_empty
      do
         do_print(once "Error");
         error_counter := error_counter + 1;
         if error_counter >= 6 then
            echo.w_put_string(fz_error_stars);
            echo.w_put_string(once "Too many errors.%N");
            die_with_code(exit_failure_code);
         end;
      ensure
         error_counter = old error_counter + 1;
      end;

   print_as_fatal_error is
         -- Print `explanation' as a Fatal Error.
         -- Execution is stopped after this call.
      do
         do_print(once "Fatal Error");
         die_with_code(exit_failure_code);
      end;

   cancel is
      -- Cancel a prepared report without printing it.
      do
         explanation.clear;
         positions.clear;
      ensure
         is_empty
      end;

feature {NONE}

   explanation: STRING is
         -- Current `explanation' text to be print with next Warning,
         -- the next Error or the next Fatal Error.
      once
         !!Result.make(1024);
      end;

   positions: FIXED_ARRAY[POSITION] is
         -- The list of `positions' to be shown with next Warning,
         -- the next Error or the next Fatal Error.
      once
         create Result.with_capacity(16);
      end;

   do_print(heading: STRING) is
      local
         i, cpt: INTEGER; cc, previous_cc: CHARACTER; p: POSITION;
	 stop: BOOLEAN; class_name: STRING;
      do
         echo.w_put_string(fz_error_stars);
         echo.w_put_string(heading);
         echo.w_put_character(':');
         echo.w_put_character(' ');
         from
            i := 1;
            cpt := 9 + heading.count;
         until
            i > explanation.count
         loop
            previous_cc := cc;
            cc := explanation.item(i);
            i := i + 1;
            if cpt > 60 then
               if cc = ' ' then
                  echo.w_put_character('%N');
                  cpt := 0;
               else
                  echo.w_put_character(cc);
                  cpt := cpt + 1;
               end;
            else
               echo.w_put_character(cc);
               inspect
                  cc
               when '%N' then
                  cpt := 0;
               else
                  cpt := cpt + 1;
               end;
            end;
         end;
         echo.w_put_character('%N');
         from
         until
            positions.is_empty
         loop
            p := positions.last;
	    positions.remove_last;
	    class_name := p.base_class_name.to_string;
	    if not small_eiffel.no_file_for(class_name) then
	       p.show;
	    end;
	    from stop := false until stop
	    loop
	       i := positions.fast_index_of(p);
	       if positions.valid_index(i) then
		  positions.remove(i);
	       else
		  stop := true;
	       end;
	    end;
         end;
         cancel;
         echo.w_put_string(once "------%N");
      ensure
         is_empty
      end;

end -- ERROR_HANDLER
