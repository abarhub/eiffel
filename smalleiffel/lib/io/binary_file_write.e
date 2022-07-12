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
class BINARY_FILE_WRITE

creation make, connect_to, connect_for_appending_to

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
	 -- Truncate file to zero length or create binary file for writing.
	 -- The stream is positioned at the beginning of the file.
      require
         not is_connected;
         not new_path.is_empty
      local
	 p: POINTER;
      do
	 p := new_path.to_external;
         output_stream := basic_io_binary_file_write_open(p);
         if output_stream.is_not_null then
            path := new_path;
         end;
      end;

   connect_for_appending_to(new_path: STRING) is
	 -- Truncate file to zero length or create binary file for writing.
	 -- The stream is positioned at the beginning of the file.
      require
         not is_connected;
         not new_path.is_empty
      local
	 p: POINTER;
      do
	 p := new_path.to_external;
         output_stream := basic_io_binary_file_write_append(p);
         if output_stream.is_not_null then
            path := new_path;
         end;
      end;

   disconnect is
      require
         is_connected
      do
         basic_io_fclose(output_stream);
         path := Void;
      end;

   put_byte(byte: INTEGER) is
      require
         is_connected
      do
	 basic_io_putc(byte,output_stream);
      end;

feature {NONE}

   output_stream: POINTER;

   make is
	 -- The new created object is not connected. (See also `connect_to' and
	 -- `connect_for_appending_to'.)
      do
      ensure
	 not is_connected
      end;

   basic_io_binary_file_write_open(path_pointer: POINTER): POINTER is
      external "SmallEiffel"
      end;

   basic_io_binary_file_write_append(path_pointer: POINTER): POINTER is
      external "SmallEiffel"
      end;

   basic_io_putc(byte: INTEGER; stream: POINTER) is
      external "SmallEiffel"
      end;

   basic_io_fclose(stream_pointer : POINTER) is
      external "SmallEiffel"
      end;

end -- BINARY_FILE_WRITE
