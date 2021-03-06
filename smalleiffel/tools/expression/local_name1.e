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
class LOCAL_NAME1
   --
   -- A local name in some declaration list.
   --

inherit LOCAL_ARGUMENT1; LOCAL_NAME;

creation make

feature

   assertion_check(tag: CHARACTER) is
      do
      end;

   to_runnable(ct: E_TYPE): like Current is
      require
	 result_type /= Void
      local
         rt: E_TYPE;
      do
         rt := result_type.to_runnable(ct);
         if rt = Void then
            eh.add_position(result_type.start_position);
            error(start_position,"Bad local variable.");
         elseif rt.run_class = Void then
	    -- To make this RUN_CLASS live.
         end;
	 if refer_to = 0 then
	    if not produce_c then
	       warning(start_position,once "Unused local variable.");
	       refer_to_increment;
	    end;
	 end;
         if rt = result_type then
            Result := Current;
         else
            Result := twin;
            Result.set_result_type(rt);
         end;
      end;

   produce_c: BOOLEAN is
         -- True if some C code must be produced for this local variable
         -- (i.e. the local is really used or this local variable is
         -- of some user expanded type with possibles side effects).
      do
         if is_live then
            Result := true;
         elseif result_type.is_expanded then
	    Result := not result_type.is_basic_eiffel_expanded;
         end;
      end;

feature {LOCAL_VAR_LIST}

   c_declare is
         -- C declaration of the local.
      local
         t: E_TYPE;
      do
         if produce_c then
            t := result_type.run_type;
            tmp_string.clear;
            t.c_type_for_result_in(tmp_string);
            tmp_string.extend(' ');
            cpp.put_string(tmp_string);
            cpp.print_local(to_string);
            cpp.put_character('=');
            t.c_initialize;
            cpp.put_string(fz_00);
         end;
      end;

feature {DECLARATION_LIST}

   name_clash(ct: E_TYPE) is
      do
         name_clash_for(ct,once "Conflict between local/feature name (VRLE).");
      end;

feature {LOCAL_NAME2}

   refer_to_increment is
      do
	 refer_to := refer_to + 1;
      end;

   set_is_live is
      do
         is_live := true;
      end;

feature {NONE}

   refer_to: INTEGER;
	 -- How many `refer_to' LOCAL_NAME2 for this local declaration.

   is_live: BOOLEAN;
         -- Is this local name really used inside the living code ?

   make(sp: POSITION; n: STRING) is
      require
         not sp.is_unknown;
         n = string_aliaser.item(n)
      do
         start_position := sp;
         to_string := n;
      ensure
         start_position = sp;
         to_string = n
      end;

end -- LOCAL_NAME1
