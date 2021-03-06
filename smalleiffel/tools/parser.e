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
deferred class PARSER
   --
   -- To share some features amongs parsers (actually the
   -- EIFFEL_PARSER and the ACE parser).
   --
inherit GLOBALS;

feature {NONE}

   line, column: INTEGER;
	 -- Current `line' number and current `column' number.

   current_line: STRING;
	 -- Current line string of `text'.

   cc: CHARACTER;
	 -- Current character in the `current_line'.

   pos(l, c: INTEGER): POSITION is
	 -- Initialize a new one at line `l' and column `c'.
      require
	 l >= 1; c >= 1
      deferred
      end;

   end_of_text: CHARACTER is '%/0/'; -- Flag of the end of the `text'.

   last_comment: COMMENT;
	 -- Void or waiting comment.

   drop_comments: BOOLEAN;
	 -- When objects COMMENT are not necessary.

   skip_comments is
	 -- Skip separators and comments if any. Unless `drop_comments',
	 -- comments are stored in `last_comment'.
      local
	 sp: POSITION; stop: BOOLEAN;
      do
	 from
	 until
	    stop
	 loop
	    inspect
	       cc
	    when ' ','%T','%N' then
	       next_char;
	    when '-' then
	       next_char;
	       if cc = '-' then
		  if drop_comments then
		     if line = parser_buffer.count then
			cc := end_of_text;
			stop := true;
		     else
			line := line + 1;
			column := 1;
			current_line := parser_buffer.item(line);
			if current_line.count = 0 then
			   cc := '%N';
			else
			   cc := current_line.first;
			end;
		     end;
		  else
		     from
			sp := pos(line,column - 1);
			next_char;
			lcs.clear;
		     until
			cc = '%N'
		     loop
			lcs.extend(cc);
			next_char;
		     end;
		     if last_comment = Void then
			!!last_comment.make(sp,lcs.twin);
		     else
			last_comment.add_last(lcs.twin);
		     end;
		  end;
	       else
		  cc := '-';
		  column := column - 1;
		  stop := true;
	       end;
	    else
	       stop := true;
	    end;
	 end;
      end;

   next_char is
      do
	 if column < current_line.count then
	    column := column + 1;
	    cc := current_line.item(column);
	 elseif column = current_line.count then
	    column := column + 1;
	    cc := '%N';
	 elseif line = parser_buffer.count then
	    cc := end_of_text;
	 else
	    line := line + 1;
	    column := 1;
	    current_line := parser_buffer.item(line);
	    if current_line.count = 0 then
	       cc := '%N';
	    else
	       cc := current_line.first;
	    end;
	 end;
      end;

   start_line, start_column: INTEGER;
	 -- To store beginning position of : `a_keyword', `a_integer',
	 -- `a_real', `skip1', `skip2' and `skip1unless2'.

   a_keyword(keyword: STRING): BOOLEAN is
	 -- Look for a `keyword' beginning strictly at current position, then,
	 -- `skip_comment' is automatically called. A keyword is never followed
	 -- by a character of this set: {'A'..'Z','a'..'z','0'..'9','_'}.
      require
	 keyword.count >= 1;
	 not keyword.has('%N')
      local
	 c, i, j: INTEGER;
      do
	 i := column;
	 c := keyword.count;
	 if current_line.count - i + 1 >= c then
	    from
	       start_line := line;
	       start_column := i;
	       j := 1;
	    until
	       c <= 0
	    loop
	       if current_line.item(i).same_as(keyword.item(j)) then
		  i := i + 1;
		  j := j + 1;
		  c := c - 1;
	       else
		  c := -1;
	       end;
	    end;
	 end;
	 if c = 0 then
	    if i > current_line.count then
	       Result := true;
	       cc := '%N';
	       column := i;
	       skip_comments;
	    else
	       inspect
		  current_line.item(i)
	       when ' ','%T','-' then
		  Result := true;
		  cc := current_line.item(i);
		  column := i;
		  skip_comments;
	       when 'a'..'z','A'..'Z','0'..'9','_' then
	       else
		  Result := true;
		  cc := current_line.item(i);
		  column := i;
	       end;
	    end;
	 end;
      end;

   skip1(char: CHARACTER): BOOLEAN is
      do
	 if char = cc then
	    start_line := line;
	    start_column := column;
	    Result := true;
	    next_char;
	    skip_comments;
	 end;
      end;

   fcp(msg: STRING) is
	 -- Fatal error at current position.
      do
	 eh.add_position(current_position);
	 fatal_error(msg);
      end;

   wcp(msg: STRING) is
	 -- Warning at current position.
      do
	 warning(current_position,msg);
      end;

   current_position: POSITION is
      do
	 Result := pos(line,column);
      end;

   lcs: STRING is
	 -- Last Comment String.
      once
	 !!Result.make(80);
      end;

   tmp_name: TMP_NAME;
	 -- The temporary buffer for some name.

   em1 : STRING is "Underscore in fractionnal part must group 3 digits.";
   em2 : STRING is "Feature name expected.";
   em3 : STRING is "Index value expected (%"indexing ...%").";
   em4 : STRING is "Error in inspect.";
   em5 : STRING is "Added %",%".";
   em6 : STRING is "Added %";%".";
   em7 : STRING is "Unexpected comma (deleted)."
   em8 : STRING is "Unexpected new line in manifest string.";
   em9 : STRING is "Underscore in number must group 3 digits.";
   em10: STRING is "Bad character constant.";
   em11: STRING is "Bad clients list.";
   em12: STRING is "Deleted extra coma.";
   em13: STRING is "Deleted extra separator.";
   em14: STRING is "Class name should use only uppercase letters.";
   em15: STRING is "Name of the current class expected.";
   em16: STRING is "Type mark expected.";
   em17: STRING is "Unexpected character.";
   em18: STRING is "Useless keyword deleted.";
   em20: STRING is "Explicit creation/create type mark must not be anchored.";
   em21: STRING is "A formal argument is not a writable variable.";
   em22: STRING is "Bad creation/create (writable expected).";
   em23: STRING is "Bad creation/create (procedure name expected).";
   em24: STRING is "Deleted extra semi-colon.";
   em25: STRING is "Identifier should use only lowercase letters.";
   em26: STRING is "Same identifier appears twice (local/formal).";
   em27: STRING is "Added %"(%".";
   em28: STRING is "Added %")%".";
   em29: STRING is "Added %":%".";
   em30: STRING is "Expected %"[%" (to start generic argument list).";
   em31: STRING is "Expected %"]%" (to finish generic argument list).";
   em32: STRING is "Type mark expected.";
   em33: STRING is "TUPLE type mark expected.";
   em34: STRING is "Bad agent (call expected).";
   em35: STRING is "Empty generic list (deleted)."
   em36: STRING is "Closing %"}%" expected.";
   em37: STRING is "Unknown special character.";
   em38: STRING is "Unexpected character in ascii code.";
   em39: STRING is "Bad (empty ?) ascii code.";
   em40: STRING is "Three digit is enought for an ascii code.";
   em41: STRING is "Error inside multi-line manifest string.";
   em42: STRING is "Extra blank or tab character removed in multi-line %
                   %manifest string.";

end -- PARSER
