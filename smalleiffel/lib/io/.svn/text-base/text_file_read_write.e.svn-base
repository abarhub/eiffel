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
class TEXT_FILE_READ_WRITE

inherit INPUT_STREAM; OUTPUT_STREAM;

creation make, connect_to, connect_for_appending_to

feature

   path: STRING;

   last_character: CHARACTER;

   is_connected: BOOLEAN is
      do
         Result := path /= Void;
      end;

   connect_to(new_path: STRING) is
	 -- Open for reading and writing. The stream is positioned at the
	 -- beginning of the file.
      local
         s: POINTER; tfw: TEXT_FILE_WRITE;
      do
         if not file_exists(new_path) then
            !!tfw.connect_to(new_path);
            tfw.disconnect;
         end;
         check file_exists(new_path) end;
         s := basic_io_text_file_read_write_open(new_path.to_external);
         if s.is_not_null then
            stream := s;
            path := new_path;
         end;
      end;

   connect_for_appending_to(new_path: STRING) is
	 -- Open for reading and writing. The file is created if it does not
	 -- exist. The stream is positioned at the end of the file.
      local
         s: POINTER; tfw: TEXT_FILE_WRITE;
      do
         if not file_exists(new_path) then
            !!tfw.connect_to(new_path);
            tfw.disconnect;
         end;
         check file_exists(new_path) end;
         s := basic_io_text_file_read_write_append(new_path.to_external);
         if s.is_not_null then
            stream := s;
            path := new_path;
         end;
      end;

   disconnect is
      require
         is_connected
      do
         basic_io_fclose(stream);
         path := Void;
      end;

   read_character is
      do
         basic_io_flush(stream);
         last_character := basic_io_getc(stream).to_character;
         push_back_flag := false;
      end;

   put_character(c: CHARACTER) is
      do
         basic_io_flush(stream);
         basic_io_putc(c,stream);
      end;

   unread_character is
      local
         p: POINTER;
         c: CHARACTER;
      do
         p := stream;
         c := last_character;
         c_inline_c("ungetc(_c,_p);");
         push_back_flag := true;
      end;

   end_of_input: BOOLEAN is
      do
         basic_io_flush(stream);
         Result := basic_io_feof(stream)
      end;

   read_line_in(str: STRING) is
      do
         read_character;
         if last_character /= '%N' then
            from
               str.extend(last_character);
            until
               end_of_input or else last_character = '%N'
            loop
               read_character;
               str.extend(last_character);
            end;
         end;
      end;

feature {NONE}

   stream: POINTER;

   make is
	 -- The new created object is not connected. (See also `connect_to' and
	 -- `connect_for_appending_to'.)
      do
      ensure
	 not is_connected
      end;

   basic_io_text_file_read_write_open(path_pointer: POINTER): POINTER is
      external "SmallEiffel"
      end;

   basic_io_text_file_read_write_append(path_pointer: POINTER): POINTER is
      external "SmallEiffel"
      end;

   basic_io_fclose(stream_pointer : POINTER) is
      external "SmallEiffel"
      end;

   basic_io_feof(stream_ptr: POINTER): BOOLEAN is
      external "SmallEiffel"
      end;

end -- TEXT_FILE_READ_WRITE
