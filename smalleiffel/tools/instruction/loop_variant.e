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
class LOOP_VARIANT
   --
   -- For the variant part of a loop instruction.
   --

inherit GLOBALS;

creation make

feature

   comment1: COMMENT;
	 -- if any the one after the %"variant%" keyword.

   tag: TAG_NAME;
	 -- if any, the optional tag name.

   comment2: COMMENT;

   expression: EXPRESSION;
	 -- the variant INTEGER expression.

   start_position: POSITION is
      do
	 if tag /= Void then
	    Result := tag.start_position;
	 else
	    Result := expression.start_position;
	 end;
      end;

feature {E_LOOP}

   frozen use_current: BOOLEAN is
      do
         Result := expression.use_current;
      end;

   pretty_print is
      do
         if comment1 /= Void then
            comment1.pretty_print;
         else
            fmt.indent;
         end;
	 if tag /= Void then
	    fmt.put_string(tag.to_string);
	    fmt.put_string(": ");
	 end;
         if comment2 /= Void then
            comment2.pretty_print;
         else
            fmt.indent;
         end;
         expression.pretty_print
      end;

   frozen afd_check is
      do
         expression.afd_check;
      end;

feature {E_LOOP, LOOP_VARIANT}

   frozen to_runnable(ct: E_TYPE): like Current is
      local
         e: like expression;
      do
         if current_type = Void then
            current_type := ct;
            e := expression.to_runnable(ct);
            if e = Void then
               error(start_position,"Bad loop variant.");
            else
               expression := e;
               if not expression.result_type.is_integer then
                  error(expression.start_position,
                        "Expression of variant must be INTEGER.");
               end;
            end;
            if nb_errors = 0 then
               Result := Current;
            end;
         else
            !!Result.make(comment1,tag,comment2,expression);
            Result := Result.to_runnable(ct);
         end;
      end;

feature {NONE}

   current_type: E_TYPE;
	 -- Non Void when checked in.

   make(c1: COMMENT; t: like tag; c2: COMMENT exp: like expression) is
      require
         exp /= Void
      do
         comment1 := c1;
         tag := t;
         comment2 := c2;
         expression := exp;
      ensure
         comment1 = c1;
         tag = t;
         comment2 = c2;
         expression = exp;
      end;

invariant

   expression /= Void;

end -- LOOP_VARIANT
