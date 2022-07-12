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
class COMPILE_TO_C
   --
   -- The `compile_to_c' command.
   --

inherit COMMAND_LINE_TOOLS;

creation make

feature

   command_name: STRING is "compile_to_c";

   command_line_help_summary: STRING is "[
      Usage: compile_to_c [options] <RootClass> <RootProcedure> ...
         or: compile_to_c [options] <ACEfileName>.ace

      For information about and examples of ACE files, have a look
      in the SmallEiffel/lib_show/ace directory.

      Most of the following options are not available when using
      an ACE file.

      Option summary:

      Information:
        -help               Display this help information
        -version            Display SmallEiffel version information
        -verbose            Display detailed information about what the
                             compiler is doing

      Warning levels:
        -case_insensitive   Make class and feature names case-insensitive
        -no_style_warning   Don't print warnings about style violations
        -no_warning         Don't print any warnings (implies -no_style_warning)

      Optimization and debugging levels (specify at most one; default is -all_check):
        -boost              Enable all optimizations,
                             but disable all run-time checks
        -no_check           Enable Void target and system-level checking
        -require_check      Enable precondition checking (implies -no_check)
        -ensure_check       Enable postcondition checking (implies -require_check)
        -invariant_check    Enable class invariant checking (implies -ensure_check)
        -loop_check         Enable loop variant and invariant checking
                             (implies -invariant_check)
        -all_check          Enable 'check' blocks (implies -loop_check)
        -debug_check        Enable 'debug' blocks (implies -all_check)

      C compilation and run-time system:
        -cc <command>       Specify the C compiler to use
        -cecil <file>       Take CECIL information from <file>
                             (may be used more than once)
        -o <file>           Put the executable program into <file>
        -no_main            Don't include a main() in the generated executable
        -no_gc              Disable garbage collection
        -gc_info            Enable status messages from the garbage collector
        -no_strip           Don't run 'strip' on the generated executable
        -no_split           Generate only one C file
        -trace              Enable sedb, the internal debugger
        -manifest_string_trace
                            Enable the trace support to track non-once
                            manifest string creation
        -wedit              Include support for the Wedit debugger

      ]";


feature {NONE}

   make is
      local
         argc, argi: INTEGER; arg: STRING;
      do
         eiffel_parser.set_drop_comments;
         argc := argument_count;
         if argc < 1 then
            system_tools.bad_use_exit(Current);
         end;
         search_for_verbose_flag;
	 search_for_cc_flag(argc);
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
	       elseif is_cecil_flag(arg,argi,argc) then
		  argi := argi + 2;
	       elseif is_o_flag(arg,argi,argc,cpp) then
		  argi := argi + 2;
	       elseif flag_match(fz_no_main,arg) then
		  ace.set_no_main;
		  argi := argi + 1;
	       elseif (once "-no_gc").is_equal(arg) then
		  gc_handler.no_gc;
		  argi := argi + 1;
	       elseif flag_match(fz_gc_info,arg) then
		  gc_handler.set_info_flag;
		  argi := argi + 1;
	       elseif is_manifest_string_trace(arg) then
		  argi := argi + 1;
	       elseif flag_match(fz_no_strip,arg) then
		  system_tools.set_no_strip;
		  argi := argi + 1;
	       elseif flag_match(fz_no_split,arg) then
		  ace.set_no_split(true);
		  argi := argi + 1;
	       elseif is_trace_flag(arg) then
		  argi := argi + 1;
	       elseif flag_match(fz_wedit,arg) then
		  ace.set_wedit(true);
		  argi := argi + 1;
	       elseif flag_match(fz_cc,arg) then
		  if argi < argc then
		     argi := argi + 2;
		  else
		     echo.w_put_string(command_name);
		     echo.w_put_string(
		        ": missing compiler name after -cc flag.%N");
		     die_with_code(exit_failure_code);
		  end;
	       elseif argi < argc then
		  argi := system_tools.extra_arg(arg,argi,argument(argi + 1));
	       else
		  argi := system_tools.extra_arg(arg,argi,Void);
	       end;
	    end;
	    ace.command_line_parsed(command_name);
	 end;
         small_eiffel.compile_to_c;
         id_provider.disk_save;
         string_aliaser.echo_information;
      end;

   is_valid_argument_for_ace_mode(arg: STRING): BOOLEAN is
      do
	 if (is_version_flag(arg)
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

end -- COMPILE_TO_C
