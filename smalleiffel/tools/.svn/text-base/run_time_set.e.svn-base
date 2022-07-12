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
class RUN_TIME_SET
   --
   -- A set of RUN_CLASS associated with some RUN_CLASS which is
   -- present at run-time.
   --

inherit GLOBALS;

creation {RUN_CLASS} make

feature {RUN_CLASS}

   id_extra_information(tfw: TEXT_FILE_WRITE) is
      local
         c, i: INTEGER;
      do
	 c := list.count;
	 tfw.put_string("run_time_set_count: ");
	 tfw.put_integer(c);
	 tfw.put_string("run_time_set: ");
	 from until
	    i = c
	 loop
	    tfw.put_integer(list.item(i).id);
	    tfw.put_character(' ');
	    i := i + 1;
	 end;
      end;

feature {RUN_TIME_SET}

   owner: RUN_CLASS;
	 -- The `owner' of the `Current' set.

   list: FIXED_ARRAY[RUN_CLASS];
	 -- The content of this `list' is actually the set of possible
	 -- other types which may appear at run-time. This `list' is ordered
	 -- according to id's of elements.

feature {NONE}

   make(o: like owner; first: RUN_CLASS) is
      require
	 o /= Void;
	 first /= Void
      do
	 owner := o;
	 !!list.make(16);
	 list.add_last(first);
      ensure
	 owner = o;
	 list.fast_add(first)
      end;

invariant

   owner /= Void;

   list /= Void;

end -- RUN_TIME_SET
