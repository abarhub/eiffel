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
class ECHO
   --
   -- Unique Global Object in charge of ECHOing some information
   -- messages during compilation for example.
   -- This object is used to implement the flag "-verbose".
   --
   --

inherit GLOBALS;

creation make

feature

   verbose: BOOLEAN;
         -- Is `echo' verbose (default is false).

feature

   make is
      do
      end;

feature  -- To echo some additional information (echo is only done
         -- when `verbose' is true).

   put_string(msg: STRING) is
      do
         if verbose then
            std_output.put_string(msg);
            std_output.flush;
         end;
      end;

   put_character(c: CHARACTER) is
      do
         if verbose then
            std_output.put_character(c);
            std_output.flush;
         end;
      end;

   put_new_line is
      do
         if verbose then
            std_output.put_new_line;
         end;
      end;

   put_integer(i: INTEGER) is
      do
         if verbose then
            std_output.put_integer(i);
            std_output.flush;
         end;
      end;

   put_double_format(d: DOUBLE; f: INTEGER) is
      do
         if verbose then
            std_output.put_double_format(d,f);
            std_output.flush;
         end;
      end;

   file_removing(path: STRING) is
         -- If `path' is an existing file, echo a message on `std_output'
         -- while removing the file. Otherwise, do nothing.
      require
         path /= Void
      do
         if file_exists(path) then
            put_string(once "Removing %"");
            put_string(path);
            put_string(fz_b0);
            remove_file(path);
         end;
      ensure
         may_fail: true or not file_exists(path)
      end;

   file_renaming(old_path, new_path: STRING) is
      require
         old_path /= Void;
         new_path /= Void
      do
         put_string(once "Renaming %"");
         put_string(old_path);
         put_string(once "%" as %"");
         put_string(new_path);
         put_string(fz_b0);
         rename_file(old_path,new_path);
      end;

   tfw_connect(tfw: TEXT_FILE_WRITE; path: STRING) is
      require
         not tfw.is_connected;
         path /= Void
      do
         tfw.connect_to(path);
         if tfw.is_connected then
            put_string(once "Writing %"");
            put_string(path);
            put_string(once "%" file.%N");
         else
            w_put_string(once "Cannot write file %"");
            w_put_string(path);
            w_put_string(fz_b0);
            die_with_code(exit_failure_code);
         end;
      ensure
         tfw.is_connected
      end;

   tfr_connect(tfr: TEXT_FILE_READ; path: STRING) is
      require
         not tfr.is_connected;
         path /= Void
      do
         put_string(once "Trying to read file %"");
         put_string(path);
         put_string(fz_b0);
         tfr.connect_to(path);
      end;

   tfr_connect_or_exit(tfr: TEXT_FILE_READ; path: STRING) is
      require
         not tfr.is_connected;
         path /= Void
      do
         tfr_connect(tfr,path);
         if not tfr.is_connected then
            w_put_string(fz_01);
            w_put_string(path);
            w_put_string("%" not found.%N");
            die_with_code(exit_failure_code);
         end;
      ensure
         tfr.is_connected
      end;

   read_word_in(tfr: TEXT_FILE_READ): STRING is
      require
         tfr.is_connected
      do
         put_string(once "Reading one word in %"");
         put_string(tfr.path);
         put_string(fz_b0);
         if tfr.end_of_input then
            w_put_string(once "Unexpected end_of_input while reading %"");
            w_put_string(tfr.path);
            w_put_string(fz_b0);
            die_with_code(exit_failure_code);
         else
            tfr.read_word;
            Result := tfr.last_string.twin;
         end;
      ensure
         tfr.is_connected
      end;

   system_call(cmd: STRING) is
	 -- To trace `SYSTEM.execute' calls. When the `cmd' is composed of
	 -- more than one line, each line is treated separately with one
	 -- `execute' call.
      require
         cmd.count > 0
      local
         i: INTEGER; cmd2: STRING; s: SYSTEM;
      do
         if cmd.last = '%N' then
            cmd.remove_last(1);
            system_call(cmd);
         elseif cmd.has('%N') then
            i := cmd.first_index_of('%N');
            cmd2 := cmd.substring(i + 1, cmd.count);
            cmd.remove_last(cmd.count - i + 1);
            system_call(cmd);
            system_call(cmd2);
         else
            put_string(once "System call %"");
            put_string(cmd);
            put_string(fz_b0);
            s.execute_command_line(cmd);
         end;
      end;

   print_count(msg: STRING; count: INTEGER) is
      require
         count >= 0;
      do
         if verbose then
            if count > 0 then
               put_string(once "Total ");
               put_string(msg);
               if count > 1 then
                  put_character('s');
               end;
               put_string(once ": ");
               put_integer(count);
               put_string(fz_dot_new_line);
            else
               put_string(once "No ");
               put_string(msg);
               put_string(fz_dot_new_line);
            end;
         end;
      end;

   getenv(variable, file: STRING): STRING is
	 -- To echo the `get_environment_variable' calls for the `variable' used in some
	 -- `file'. Compute automatically the "SmallEiffelDirectory" magic
	 -- variable using the SmallEiffel variable.
      require
	 variable /= Void
      local
	 s: SYSTEM;
      do
	 Result := s.get_environment_variable(variable);
	 if Result = Void and then (once "SmallEiffelDirectory").same_as(variable) then
	    Result := s.get_environment_variable(fz_smalleiffel);
	    if Result /= Void and then Result.count > 9 then
	       Result.remove_last(9); -- for "system.se".
	       if Result.count > 3 then -- for the "sys" directory.
		  system_tools.parent_directory(Result);
	       end;
	    end;
	 end;
	 if Result = Void then
	    put_string(once "Environment variable ${");
	    put_string(variable);
	    put_character('}');
	    if file /= Void then
	       put_string(once " used in file %"");
	       put_string(file);
	       put_character('%"');
	    end;
	    put_string(once " is not set.%N");
	 end;
      end;

feature  -- To echo some warning or some problem (echo is done whathever
         -- the value of `verbose').

   w_put_string(msg: STRING) is
      do
         std_error.put_string(msg);
         std_error.flush;
      end;

   w_put_character(c: CHARACTER) is
      do
         std_error.put_character(c);
         std_error.flush;
      end;

   w_put_integer(i: INTEGER) is
      do
         std_error.put_integer(i);
         std_error.flush;
      end;

feature {ACE,COMMAND_LINE_TOOLS}

   set_verbose is
      do
         verbose := true;
      end;

feature {ACE_CHECK}

   unset_verbose is
      do
         verbose := false;
      end;

end -- ECHO
