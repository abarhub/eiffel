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
class BINARY_FILE_READ

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
	 -- Open binary file for reading. The stream is positioned at the
	 -- beginning of the file.
      require
         not is_connected;
         not new_path.is_empty
      do
         input_stream := basic_io_binary_file_read_open(new_path.to_external);
         if input_stream.is_not_null then
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

   read_byte is
         -- Read a byte and assign it to `last_byte'.
      require
         is_connected;
         not end_of_input
      do
         last_byte := basic_io_getc(input_stream);
      end;

   last_byte: INTEGER;
         -- Last byte read with `read_byte'.

   end_of_input: BOOLEAN is
         -- Has end-of-input been reached ?
         -- True when the last character has been read.
      require
         is_connected
      do
         Result := last_byte = basic_io_eof;
      end;

feature {NONE}

   input_stream: POINTER;

   make is
	 -- The new created object is not connected. (See also `connect_to'.)
      do
      end;

   basic_io_binary_file_read_open(path_pointer: POINTER): POINTER is
      external "SmallEiffel"
      end;

   basic_io_getc(stream_pointer: POINTER): INTEGER is
      external "SmallEiffel"
      end;

   basic_io_eof: INTEGER is
      external "SmallEiffel"
      end;

   basic_io_fclose(stream_pointer : POINTER) is
      external "SmallEiffel"
      end;

end -- BINARY_FILE_READ

