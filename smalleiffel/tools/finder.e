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
class FINDER
   --
   -- The `finder' command.
   --

inherit COMMAND_LINE_TOOLS;

creation make

feature

   command_name: STRING is "finder";

   command_line_help_summary: STRING is "[
      Usage: finder [options] <ClassName>
         or: finder [options] <ACEfileName>.ace <ClassName>

      The finder command tells you where the class <ClassName> is by
      printing the complete path of the corresponding file.
      Hint: to see the search path used, just run finder with
      some non-existent class name.%

      This command may also be useful in shell scripts to check if the
      source file exists. (Use the exit status.)

      Option summary:

      Information:
        -help               Display this help information
        -version            Display SmallEiffel version information
        -verbose            Display detailed information about what the
                             program is doing

      ]";

feature {NONE}

   make is
      local
         argi: INTEGER;
         arg, search_key, file_path: STRING;
	 ace_mode: BOOLEAN;
      do
	 if argument_count = 0 then
	    system_tools.bad_use_exit(Current);
	 end;
         search_for_verbose_flag;
	 ace_mode := ace_file_mode;
	 from
	    argi := 1;
	 until
	    argi > argument_count
	 loop
	    arg := argument(argi);
	    if ace.file_path = arg then
	    elseif is_some_flag(arg) then
	       if is_valid_argument_for_ace_mode(arg) then
	       end;
	    elseif search_key /= Void then
	       system_tools.bad_use_exit(Current);
	    else
	       search_key := arg;
	       ace.set_root_class_name_using(arg);
	    end;
	    argi := argi + 1;
	 end;
	 if ace.file_path = Void then
	    ace.command_line_parsed(command_name);
	 end;
	 if search_key = Void then
	    system_tools.bad_use_exit(Current);
	 end;
	 file_path := small_eiffel.find_path_for(ace.root_class_name);
	 if file_path = Void then
	    std_error.put_string("No file found for %"");
	    std_error.put_string(search_key);
	    std_error.put_string("%".%N");
	    die_with_code(exit_failure_code);
	 else
	    std_output.put_string(file_path);
	    std_output.put_character('%N');
	 end;
      end;

   is_valid_argument_for_ace_mode(arg: STRING): BOOLEAN is
      do
	 if is_some_flag(arg) then
	    if (is_version_flag(arg)
		or else
		is_verbose_flag(arg)
		or else
		is_help_flag(arg))
	     then
	       Result := true;
	    end;
	 else
	    Result := true;
	 end;
      end;

   valid_argument_for_ace_mode: STRING is
      "Only the -verbose, -version, and -help flags are allowed in ACE %
      %file mode.%N";

end -- FINDER
