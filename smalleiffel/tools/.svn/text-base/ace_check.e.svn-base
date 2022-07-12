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
class ACE_CHECK
   --
   -- The `ace_check' command.
   --

inherit COMMAND_LINE_TOOLS;

creation make

feature

   command_name: STRING is "ace_check";

   command_line_help_summary: STRING is
      "Usage: ace_check [options] <ACEfileName>.ace%N%
      %%N%
      %The ace_check command helps you to check the syntax of your ACE file.%N%
      %Option summary:%N%
      %%N%
      %  -help               Display this help information%N%
      %  -version            Display SmallEiffel version information%N";

feature {NONE}

   make is
      local
         argi: INTEGER; arg, view: STRING; verbose: BOOLEAN;
      do
	 if argument_count = 0 then
	    system_tools.bad_use_exit(Current);
	 end;
	 if ace_file_mode then end;
	 verbose := echo.verbose;
	 echo.unset_verbose;
	 from
	    argi := 1;
	 until
	    argi > argument_count
	 loop
	    arg := argument(argi);
	    if ace.file_path = arg then
	    elseif is_valid_argument_for_ace_mode(arg) then
	    else
	       std_error.put_string("Bad argument: %"");
	       std_error.put_string(arg);
	       std_error.put_string("%".%N");
	       die_with_code(exit_failure_code);
	    end;
	    argi := argi + 1;
	 end;
	 if ace.file_path = Void then
	    std_error.put_string("No ACE file name in command line.%N");
	    die_with_code(exit_failure_code);
	 end;
	 if verbose then
	    echo.set_verbose;
	 end;
	 !!view.make(2048);
	 ace.pretty_in(view);
	 std_output.put_string(view);
      end;

   is_valid_argument_for_ace_mode(arg: STRING): BOOLEAN is
      do
	 if is_some_flag(arg) then
	    if (is_version_flag(arg)
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
      "Only the -verbose, -version, and -help flags are allowed.%N";

end -- ACE_CHECK
