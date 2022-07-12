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
class OLD_CREATION
   --
   -- The good old style (bang bang !!) creation instruction.
   --

inherit CREATE_INSTRUCTION redefine pretty_print

creation {EIFFEL_PARSER,CREATE_INSTRUCTION} make

feature

   pretty_print is
      do
         fmt.put_character('!');
	 if type /= Void then
	    type.pretty_print;
	 end;
         fmt.put_character('!');
	 if call /= Void then
	    call.pretty_print;
	 else
	    writable.pretty_print;
	    if fmt.semi_colon_flag then
	       fmt.put_character(';');
	    end;
	 end;
      end;

end -- OLD_CREATION

