-- This file is  free  software, which  comes  along  with  SmallEiffel. This
-- software  is  distributed  in the hope that it will be useful, but WITHOUT
-- ANY  WARRANTY;  without  even  the  implied warranty of MERCHANTABILITY or
-- FITNESS  FOR A PARTICULAR PURPOSE. You can modify it as you want, provided
-- this header is kept unaltered, and a notification of the changes is added.
-- You  are  allowed  to  redistribute  it and sell it, alone or as a part of
-- another product.
--       Copyright (C) 1994-2002 LORIA - INRIA - U.H.P. Nancy 1 - FRANCE
--          Dominique COLNET and Suzanne COLLIN - SmallEiffel@loria.fr
--                       http://SmallEiffel.loria.fr
--
expanded class POINTER
--
-- References to objects meant to be exchanged with non-Eiffel
-- software.
--
-- Note : An Eiffel POINTER is mapped as C type "void *" or as
-- Java "java.lang.Object" type.
--

inherit
   POINTER_REF
      redefine fill_tagged_out_memory, hash_code
      end;

feature

   is_null: BOOLEAN is
         -- Is the external POINTER a NULL pointer ?
      do
         Result := not is_not_null;
      end;

   is_not_null: BOOLEAN is
         -- Is the external POINTER a non-NULL pointer ?
      external "SmallEiffel"
      end;

   to_string: STRING is
      do
	 string_buffer.clear;
	 Current.append_in(string_buffer);
	 Result := string_buffer.twin;
      end;

   append_in(buffer: STRING) is
         -- Append on `str' a viewable version of `Current'.
      local
	 storage: NATIVE_ARRAY[CHARACTER]; i: INTEGER;
      do
         from
	    storage := string_buffer.storage;
	    sprintf_pointer(storage);
            i := 0;
         until
            storage.item(i) = '%U'
         loop
            buffer.extend(storage.item(i));
            i := i + 1;
         end;
      end;

   fill_tagged_out_memory is
      do
         Current.append_in(tagged_out_memory);
      end;

   hash_code: INTEGER is
      local
	 storage: NATIVE_ARRAY[CHARACTER];
      do
	 storage := string_buffer.storage;
	 sprintf_pointer(storage);
         string_buffer.from_external(storage.to_pointer);
	 Result := string_buffer.hash_code;
      end;

   plus(p: POINTER; offset: INTEGER): POINTER is
        -- Pointer `p' moved by an offset of `offset' bytes.
      external "C inline"
      alias "(((char*)$p)+$offset)"
      end;

   infix "+" (offset: INTEGER): POINTER is
        -- `Current' moved by an offset of `offset' bytes.
      do
	 Result := plus(Current,offset);
      ensure
	 Result = plus(Current,offset)
      end;

   to_any: ANY is
         -- Dangerous forced conversion. This function assume that `Current' is
         -- really a reference to some Eiffel allocated object.
      do
         Result := pointer_to_any(Current);
      ensure
	 Result = pointer_to_any(Current)
      end;

   pointer_to_any(p: POINTER): ANY is
         -- Dangerous forced conversion. This function assume that `p' is
         -- really a reference to some Eiffel allocated object.
      external "C inline"
      alias "((void*)$p)"
      end;

feature {NONE}

   string_buffer: STRING is
      once
	 !!Result.make(64);
      end;

   sprintf_pointer(native_array: NATIVE_ARRAY[CHARACTER]) is
      external "SmallEiffel"
      end;

end -- POINTER
