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
class ASSERTION_LEVEL_NUMBERING
   --
   -- To mangle assertion level information on a single value.
   --

inherit GLOBALS;

feature

   level_name(level: INTEGER): STRING is
      do
	 inspect
	    level
	 when level_unknown then
	    Result := once "unknown";
	 when level_boost then
	    Result := fz_boost;
	 when level_no then
	    Result := fz_no;
	 when level_require then
	    Result := fz_require;
	 when level_ensure then
	    Result := fz_ensure;
	 when level_invariant then
	    Result := fz_invariant;
	 when level_loop then
	    Result := fz_loop;
	 when level_all then
	    Result := fz_all;
	 when level_debug then
	    Result := fz_debug;
	 end;
      end;

   level_unknown: INTEGER is 0;
	 -- To memeorize the fact that the assertion level is not yet known.

   level_boost: INTEGER is 1;
         -- The -boost hight speed level. Do not check for Void target. Do
         -- not check system level validity.

   level_no: INTEGER is 2;
         -- No assertion checking of any kind.

   level_require: INTEGER is 3;
         -- Evaluate the preconditions.

   level_ensure: INTEGER is 4;
         -- Also evaluate postconditions.

   level_invariant: INTEGER is 5;
         -- Also evaluate the class invariant on entry to and return from.

   level_loop: INTEGER is 6;
         -- Also evaluate the loop variant and the loop invariant.

   level_all: INTEGER is 7;
         -- Also evaluate the check instruction. The default value.

   level_debug: INTEGER is 8;
         -- Also evaluate the debug instruction.

end -- ASSERTION_LEVEL_NUMBERING
