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
class COMPILE_TO_JVM
   --
   -- The `compile_to_jvm' command.
   --

inherit COMMAND_LINE_TOOLS;

creation make

feature

   command_name: STRING is "compile_to_jvm";

   command_line_help_summary: STRING is
      "Usage: compile_to_jvm [options] <Root-Class> <Root-Procedure>%N%
      %   or: compile_to_jvm [options] <ACEfileName>.ace%N%
      %%N%
      %For information about and examples of ACE files, have a look%N%
      %in the SmallEiffel/lib_show/ace directory.%N%
      %%N%
      %Most of the following options are not available when using%N%
      %an ACE file.%N%
      %%N%
      %Option summary:%N%
      %%N%
      %Information:%N%
      %  -help               Display this help information%N%
      %  -version            Display SmallEiffel version information%N%
      %  -verbose            Display detailed information about what the%N%
      %                       compiler is doing%N%
      %%N%
      %Warning levels:%N%
      %  -case_insensitive   Make class and feature names case-insensitive%N%
      %  -no_style_warning   Don't print warnings about style violations%N%
      %  -no_warning         Don't print any warnings (implies -no_style_warning)%N%
      %%N%
      %Optimization and debugging levels (specify at most one; default is -all_check):%N%
      %  -boost              Enable all optimizations,%N%
      %                       but disable all run-time checks%N%
      %  -no_check           Enable Void target and system-level checking%N%
      %  -require_check      Enable precondition checking (implies -no_check)%N%
      %  -ensure_check       Enable postcondition checking (implies -require_check)%N%
      %  -invariant_check    Enable class invariant checking (implies -ensure_check)%N%
      %  -loop_check         Enable loop variant and invariant checking%N%
      %                       (implies -invariant_check)%N%
      %  -all_check          Enable %"check%" blocks (implies -loop_check)%N%
      %  -debug_check        Enable %"debug%" blocks (implies -all_check)%N%
      %%N%
      %Compilation and run-time system:%N%
      %  -cecil <file>       Take CECIL information from <file>%N%
      %                       (may be used more than once)%N%
      %  -o <file>           Use <file> as the name of the output directory and the%N%
      %                       name of the generated root class%N%
      %  -trace              Enable the internal debugger%N";

feature {NONE}

   make is
      local
         argc, argi: INTEGER;
         arg, executable_name: STRING;
      do
         eiffel_parser.set_drop_comments;
         argc := argument_count;
         if argc < 1 then
            system_tools.bad_use_exit(Current);
         end;
         search_for_verbose_flag;
	 if not ace_file_mode then
	    from
	       argi := 1;
	    until
	       argi > argc
	    loop
	       arg := argument(argi);
	       if is_help_flag(arg) then
		  argi := argi + 1;
	       elseif is_case_insensitive_flag(arg) then
		  argi := argi + 1;
	       elseif is_no_style_warning_flag(arg) then
		  argi := argi + 1;
	       elseif is_no_warning_flag(arg) then
		  argi := argi + 1;
	       elseif is_version_flag(arg) then
		  argi := argi + 1;
	       elseif is_verbose_flag(arg) then
		  argi := argi + 1;
	       elseif is_a_compilation_level_flag(arg) then
		  argi := argi + 1;
	       elseif is_trace_flag(arg) then
		  argi := argi + 1;
	       elseif is_cecil_flag(arg,argi,argc) then
		  argi := argi + 2;
	       elseif is_o_flag(arg,argi,argc,jvm) then
		  argi := argi + 2;
	       elseif arg.item(1) /= '-' then
		  ace.set_root_class_name_using(arg);
		  argi := argi + 1;
		  if argi <= argc then
		     arg := argument(argi);
		     if arg.item(1) /= '-' then
			ace.set_root_procedure_name(arg);
			argi := argi + 1;
		     end;
		  end;
	       else
		  unknown_flag_exit(arg);
	       end;
	    end;
	    ace.command_line_parsed(command_name);
	 end;
	 if ace.executable_name = Void then
	    executable_name := ace.root_class_name.twin;
	    executable_name.to_lower;
	    ace.set_executable_name(executable_name);
	 end;
         small_eiffel.compile_to_jvm;
         string_aliaser.echo_information;
      end;

   is_valid_argument_for_ace_mode(arg: STRING): BOOLEAN is
      do
	 if (is_version_flag(arg)
	     or else
	     is_help_flag(arg)
	     or else
	     is_no_style_warning_flag(arg)
	     or else
	     is_no_warning_flag(arg)
	     or else
	     is_verbose_flag(arg))
	  then
	    Result := true;
	 end;
      end;

   valid_argument_for_ace_mode: STRING is
      "Only the flags -verbose, -version, and -help are allowed in ACE%N%
      %file mode.%
      %%N";

end -- COMPILE_TO_JVM
