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
class E_DEBUG
   --
   -- The instruction "debug ... end".
   --

inherit INSTRUCTION;

creation make

feature

   start_position: POSITION;

   is_pre_computable: BOOLEAN is false;

   end_mark_comment: BOOLEAN is true;

   to_runnable(ct: E_TYPE): like Current is
      do
         if current_type = Void then
            current_type := ct;
	    if compound /= Void then
	       compound := compound.to_runnable(ct);
	    end;
            Result := Current;
         else
            !!Result.make(start_position,list,compound);
            Result := Result.to_runnable(ct);
         end;
      end;

   stupid_switch(r: ARRAY[RUN_CLASS]): BOOLEAN is
      do
         Result := true;
      end;

   afd_check is
      do
         if compound /= Void then
	    compound.afd_check;
         end;
      end;

   collect_c_tmp is
      do
      end;

   compile_to_c is
      do
         if compound /= Void then
	    compound.compile_to_c;
         end;
      end;

   compile_to_jvm is
      do
         if compound /= Void then
	    compound.compile_to_jvm;
         end;
      end;

   use_current: BOOLEAN is
      do
         if compound /= Void then
	    Result := compound.use_current;
         end;
      end;

   pretty_print is
      local
         i: INTEGER;
      do
         fmt.keyword("debug");
         fmt.level_incr;
         if list /= Void then
            fmt.put_character('(');
            from
               i := list.lower;
            until
               i > list.upper
            loop
               list.item(i).pretty_print;
               i := i + 1;
               if i <= list.upper then
                  fmt.put_character(',')
               end;
            end;
            fmt.put_character(')');
         end;
         fmt.level_decr;
         if compound /= Void then
            compound.pretty_print;
         end;
         fmt.indent;
         fmt.keyword("end;");
         if fmt.print_end_debug then
            fmt.put_end("debug");
         end;
      end;

feature {ACE, CLUSTER}

   match_debug_key(key: STRING): BOOLEAN is
      require
	 (not key.is_equal("yes")) and (not key.is_equal("no"))
      local
	 i: INTEGER;
      do
	 if list /= Void then
	    from
	       i := list.upper;
	    until
	       Result or else i < list.lower
	    loop
	       Result := list.item(i).to_string.is_equal(key);
	       i := i - 1;
	    end;
	 end;
      end;

feature {NONE}

   current_type: E_TYPE;

   list: FIXED_ARRAY[MANIFEST_STRING];

   compound: COMPOUND;

   make(sp: like start_position; l: like list; c: like compound) is
      require
         not sp.is_unknown
      do
         start_position := sp;
         list := l;
         compound := c;
      ensure
         start_position = sp;
         list = l;
         compound = c;
      end;

invariant

   not start_position.is_unknown

end -- E_DEBUG

