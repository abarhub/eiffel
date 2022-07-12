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
class TEXT_FILE_READ
   --
   -- Basic input facilities to read a named file on the disc.
   --
   -- Note: most features are common with STD_INPUT so you can test your
   --       program on the screen first and then, just changing of
   --       instance (STD_INPUT/TEXT_FILE_READ), doing the same in a file.
   --

inherit INPUT_STREAM;

creation make, connect_to

feature

   path: STRING;
         -- Not Void when connected to the corresponding file on the disk.

   is_connected: BOOLEAN is
      do
         Result := path /= Void;
      ensure
	 definition: Result = (path /= Void)
      end;

   connect_to(new_path: STRING) is
	 --  Open text file for reading. The stream is positioned at the
	 --  beginning of the file.
      require
         not is_connected;
         not new_path.is_empty
      local
         p: POINTER;
      do
         p := new_path.to_external;
         input_stream := basic_io_text_file_read_open(p);
         if input_stream.is_not_null then
            push_back_flag := false;
            memory := (' ').code;
            path := new_path;
         end;
      end;

   disconnect is
      require
         is_connected
      do
         basic_io_fclose(input_stream);
         path := Void;
      end;

   read_character is
      do
         if push_back_flag then
            push_back_flag := false;
         else
            memory := basic_io_getc(input_stream);
         end;
      end;

   last_character: CHARACTER is
      do
         Result := memory.to_character;
      end;

   unread_character is
      do
         push_back_flag := true;
      end;

   end_of_input: BOOLEAN is
      do
         if not push_back_flag then
            Result := memory = basic_io_eof;
         end;
      end;

   read_line_in(buffer: STRING) is
      local
	 idx, remainder: INTEGER; storage: NATIVE_ARRAY[CHARACTER];
	 m: like memory;
      do
	 storage := buffer.storage;
	 idx := buffer.count;
	 remainder := buffer.capacity - idx;
         from
            read_character;
	    m := memory;
         until
            m = basic_io_eof or else m = ('%N').code or else m = ('%R').code
         loop
	    if remainder > 0 then
	       storage.put(m.to_character,idx);
	       idx := idx + 1;
	       remainder := remainder - 1;
	    else
	       buffer.set_count(idx);
	       buffer.extend(m.to_character);
	       storage := buffer.storage;
	       idx := buffer.count;
	       remainder := buffer.capacity - idx;
	    end;
            m := basic_io_getc(input_stream);
         end;
	 buffer.set_count(idx);
	 memory := m;
         if m = ('%R').code then
            read_character;
            if memory /= ('%N').code then push_back_flag := true end;
         end;
      end;

feature {FILE_TOOLS}

   same_as(other: like Current): BOOLEAN is
      require
         is_connected;
         other.is_connected
      local
         is1, is2: like input_stream;
         c1, c2: INTEGER;
      do
         from
            is1 := input_stream;
            is2 := other.input_stream;
         until
            c1 /= c2 or else c1 = basic_io_eof
         loop
            c1 := basic_io_getc(is1);
            c2 := basic_io_getc(is2);
         end
         Result :=  c1 = c2;
         disconnect;
         other.disconnect;
      ensure
         not is_connected;
         not other.is_connected
      end;

feature {INPUT_STREAM}

   input_stream: POINTER;

feature {NONE}

   make is
	 -- The new created object is not connected. (See also `connect_to'.)
      do
      ensure
	 not is_connected
      end;

   basic_io_text_file_read_open(path_pointer: POINTER): POINTER is
      external "SmallEiffel"
      end;

   basic_io_fclose(stream_pointer : POINTER) is
      external "SmallEiffel"
      end;

   memory: INTEGER;
         -- Memory of the last available user's value.

end -- TEXT_FILE_READ

