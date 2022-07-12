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
expanded class FILE_TOOLS

feature

   same_files(path1, path2: STRING): BOOLEAN is
         -- True if the `path1' file exists and has the very same content
         -- as file `path2'.
      require else
         path1 /= Void;
         path2 /= Void
      do
         tfr1.connect_to(path1);
         if tfr1.is_connected then
            tfr2.connect_to(path2);
            if tfr2.is_connected then
               Result := tfr1.same_as(tfr2);
	    else
	       tfr1.disconnect;
            end;
         end;
      end;

   is_readable(path: STRING): BOOLEAN is
         -- True if `path' file exists and is a readable file.
      require
         path /= Void
      do
         tfr1.connect_to(path);
         Result := tfr1.is_connected;
         if Result then
            tfr1.disconnect;
         end;
      end;

   is_empty(path: STRING): BOOLEAN is
         -- True if `path' file exists, is readable and is an empty file.
      do
         tfr1.connect_to(path);
         if tfr1.is_connected then
            tfr1.read_character;
            Result := tfr1.end_of_input;
            tfr1.disconnect;
         end;
      end;

   rename_to(old_path, new_path: STRING) is
         -- Try to change the name or the location of a file.
      require
         old_path /= Void;
         new_path /= Void
      local
         p1, p2: POINTER;
      do
         if file_exists(new_path) then
            delete(new_path);
         end;
         p1 := old_path.to_external;
         p2 := new_path.to_external;
         basic_io_rename(p1,p2);
      end;

   delete(path: STRING) is
         -- Try to delete the given `path' file.
      require
         path /= Void
      local
         p: POINTER;
      do
         p := path.to_external;
         basic_io_remove(p);
      end;

   size_of(path: STRING): INTEGER is
	 -- Total size of file `path' in number of bytes.
      require
	 file_exists(path)
      local
	 p: POINTER;
      do
	 p := path.to_external;
	 Result := basic_fstat_st_size(p);
      end;

   last_change_of(path: STRING): TIME is
	 -- Of the last modification of `path'.
      require
	 file_exists(path)
      local
	 p: POINTER; time_memory: DOUBLE;
      do
	 p := path.to_external;
	 time_memory := basic_fstat_st_mtime(p);
	 Result.set_time_memory(time_memory);
      end;

feature {NONE}

   basic_io_remove(path: POINTER) is
         -- To implement `delete'.
      external "SmallEiffel"
      end;

   basic_io_rename(old_path, new_path: POINTER) is
      external "SmallEiffel"
      end;

   basic_fstat_st_size(path: POINTER): INTEGER is
      external "SmallEiffel"
      end;

   basic_fstat_st_mtime(path: POINTER): DOUBLE is
      external "SmallEiffel"
      end;

   tfr1: TEXT_FILE_READ is
      once
         !!Result.make;
      end;

   tfr2: TEXT_FILE_READ is
      once
         !!Result.make;
      end;

   tmp_string: STRING is
      once
         !!Result.make(256);
      end;

end -- FILE_TOOLS

