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
class CLASS_NAME
   --
   -- To store the base class name of a class.
   --

inherit
   NAME
      redefine is_equal
      end;
   HASHABLE;

creation make, unknown_position

feature

   start_position: POSITION;
	 -- Of the first character.

   to_string: STRING;
	 -- The name itself.

   hash_code: INTEGER;
	 -- A memory cache for `to_string.hash_code'.

   is_subclass_of(other: CLASS_NAME): BOOLEAN is
      require
         to_string /= other.to_string
      do
         if as_none = to_string then
            Result := true;
         elseif as_any = other.to_string then
            Result := true;
         elseif as_none = other.to_string then
         else
            Result := base_class.is_subclass_of(other.base_class);
         end;
      end;

   predefined: BOOLEAN is
         -- All following classes are handled in a special way
         -- by the TYPE_* corresponding class.
      do
         Result := (as_any = to_string or else
                    as_array = to_string or else
                    as_boolean = to_string or else
                    as_character = to_string or else
                    as_double = to_string or else
                    as_integer = to_string or else
                    as_none = to_string or else
                    as_pointer = to_string or else
                    as_real = to_string or else
                    as_string = to_string);
      end;

   to_runnable: E_TYPE is
         -- Return the corresponding simple (not generic) run type.
      do
         if as_any = to_string then
            !TYPE_ANY!Result.make(start_position);
         elseif as_boolean = to_string then
            !TYPE_BOOLEAN!Result.make(start_position);
         elseif as_character = to_string then
            !TYPE_CHARACTER!Result.make(start_position);
         elseif as_double = to_string then
            !TYPE_DOUBLE!Result.make(start_position);
         elseif as_integer = to_string then
            !TYPE_INTEGER!Result.make(start_position);
         elseif as_none = to_string then
            !TYPE_NONE!Result.make(start_position);
         elseif as_pointer = to_string then
            !TYPE_POINTER!Result.make(start_position);
         elseif as_real = to_string then
            !TYPE_REAL!Result.make(start_position);
         elseif as_string = to_string then
            !TYPE_STRING!Result.make(start_position);
         else
            !TYPE_CLASS!Result.make(Current);
         end;
      end;

   base_class: BASE_CLASS is
      do
         Result := small_eiffel.base_class(Current);
      end;

   is_a(other: like Current): BOOLEAN is
      require
         other /= Void;
         eh.is_empty;
      local
         to_string2: STRING;
         bc1, bc2: like base_class;
      do
         to_string2 := other.to_string;
         if as_any = to_string2 then
            Result := true;
         elseif to_string = to_string2 then
            Result := true;
         elseif as_none = to_string2 then
         else
            bc1 := base_class;
            bc2 := other.base_class;
            if bc1 = Void then
               eh.append("Unable to load ");
               eh.append(to_string);
               error(start_position,fz_dot_blank);
            elseif bc2 = Void then
               eh.append("Unable to load ");
               eh.append(to_string2);
               error(start_position,fz_dot_blank);
            else
               Result := bc1.is_subclass_of(bc2);
            end;
         end;
      end;

   pretty_print is
      do
         fmt.put_string(to_string);
      end;

   is_equal(other: like Current): BOOLEAN is
      do
	 Result := to_string = other.to_string;
      end;

feature {EIFFEL_PARSER}

   set_accurate_position(sp: like start_position) is
      do
         start_position := sp;
      ensure
         start_position = sp
      end;

feature {NONE}

   make(n: STRING; sp: like start_position) is
      require
         n = string_aliaser.item(n)
      do
         to_string := n;
	 hash_code := to_string.hash_code;
         start_position := sp;
      ensure
         start_position = sp;
         to_string = n
      end;

   unknown_position(n: STRING) is
      require
         n = string_aliaser.item(n)
      do
         to_string := n;
	 hash_code := to_string.hash_code;
      ensure
         to_string = n
      end;

invariant

   to_string = string_aliaser.item(to_string);

   hash_code = to_string.hash_code;

end -- CLASS_NAME

