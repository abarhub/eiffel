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
deferred class COMMAND_LINE_TOOLS
   --
   -- Some useful tools to handle command flags. Actually, this class is
   -- inherited by all command line tools of SmallEiffel (eg. "compile",
   -- "compile_to_c", "compile_to_jvm", "finder", "clean", "short",
   -- "pretty", and "install" as well).
   --

inherit GLOBALS;


feature

   command_name: STRING is
	 -- Is supposed to return the name of the command itself (eg.
	 -- "compile", "compile_to_c", "finder", "clean", etc.).
      deferred
      end;

   command_line_help_summary: STRING is
	 -- The traditional "-help" flag summary of information about
	 -- available options.
      deferred
      end;

feature {NONE}

   flag_match(flag, arg: STRING): BOOLEAN is
	 -- Does `arg' smoothly match with the `flag' model?
	 -- Where `arg' can be like -`flag' or  --`flag' as well as
	 -- the classic Windows notation  /`flag' too.
      require
	 not flag.is_empty and arg /= Void
      local
	 i_flag, i_arg: INTEGER;
      do
	 i_arg := arg.count;
	 if i_arg >= 2 then
	    from
	       i_flag := flag.count;
	       inspect
		  arg.first
	       when '-' then
		  if arg.item(2) = '-' then
		     Result :=  i_flag + 2 = i_arg;
		  else
		     Result := i_flag + 1 = i_arg;
		  end;
	       when '/' then
		  Result := i_flag + 1 = i_arg;
	       else
	       end;
	    until
	       not Result or else i_flag = 0
	    loop
	       if flag.item(i_flag).same_as(arg.item(i_arg)) then
		  i_arg := i_arg - 1;
		  i_flag := i_flag - 1;
	       else
		  Result := false;
	       end;
	    end;
	 end;
      end;

   is_valid_argument_for_ace_mode(arg: STRING): BOOLEAN is
	 -- Is the `arg' command line argument allowed in ACE file mode ?
      require
	 arg /= Void
      deferred
      end;

   valid_argument_for_ace_mode: STRING is
	 -- An explanation to be given to the user when the call to
	 -- `is_valid_argument_for_ace_mode' returns false.
      deferred
      end;

   is_help_flag(flag: STRING): BOOLEAN is
	 -- Is it like some traditional help `flag'?
      do
         if (flag_match(fz_help,flag)
	     or else
	     flag_match(once "h",flag)
	     or else
	     (once "?").is_equal(flag))
	  then
	    if not help_flag then
	       std_output.put_string(command_line_help_summary);
	    end;
	    inspect
	       argument_count
	    when 1 then
	       die_with_code(exit_success_code);
	    when 2 then
	       if version_flag then
		  die_with_code(exit_success_code);
	       end;
	    else
	    end;
	    help_flag := true;
            Result := true;
         end;
      end;

   help_flag: BOOLEAN;
	 -- Memory of `is_help_flag'.

   search_for_verbose_flag is
         -- Seach the -verbose flag amongs arguments in order to
         -- become verbose as soon as possible (should be called
         -- first when the command accept this flag).
      local
         i: INTEGER;
      do
         from
            i := argument_count;
         until
            i = 0
         loop
            if is_verbose_flag(argument(i)) then end;
	    i := i - 1;
         end;
         echo.put_string(small_eiffel.copyright);
      end;

   search_for_cc_flag(argc: INTEGER) is
         -- To know about the C compiler as soon as possible.
      local
         i: INTEGER;
         c_compiler: STRING;
      do
         from
            i := 1;
         until
            i > argc
         loop
            if flag_match(fz_cc,argument(i)) then
               if i < argc then
                  i := i + 1;
                  c_compiler := argument(i);
                  i := argc + 1;
               end;
            end;
            i := i + 1;
         end;
         system_tools.set_c_compiler(c_compiler);
      end;

   ace_file_mode: BOOLEAN is
         -- Search for some ACE file name in the command line arguments.
         -- When some argument has the appropriate suffix (ie. ".ace" or
         -- ".ACE"), the `ace' parser is automatically launched in order to
         -- parse this configuration file. The caller is then notified
         -- that we are now in ACE mode (the result is true). When we are
         -- in ACE mode, remainings allowed argument are automatically
         -- handled.
      local
         i: INTEGER;
	 arg: STRING;
      do
	 -- First, search for some *.ace or *.ACE file name:
	 from
            i := argument_count;
         until
            i = 0
         loop
	    arg := argument(i);
            if arg.has_suffix(once ".ace") or else arg.has_suffix(once ".ACE") then
	       Result := true;
	       ace.analyse_ace_file(arg);
            end;
	    i := i - 1;
         end;
	 if Result then
	    -- Second, check that other arguments are allowed in ACE
	    -- file mode:
	    from
	       i := 1
	    until
	       i > argument_count
	    loop
	       arg := argument(i);
	       if arg = ace.file_path then
	       elseif is_valid_argument_for_ace_mode(arg) then
	       else
		  echo.w_put_string("Flag or argument %"");
		  echo.w_put_string(arg);
		  echo.w_put_string("%" is not allowed when an ACE file (");
		  echo.w_put_string(ace.file_path);
		  echo.w_put_string(") is used.%N");
		  echo.w_put_string(valid_argument_for_ace_mode);
		  system_tools.bad_use_exit(Current);
	       end;
	       i := i + 1;
	    end;
	 end;
      end;

   is_some_flag(arg: STRING): BOOLEAN is
      do
	 if not arg.is_empty then
	    Result := (arg.first = '-' or else arg.first = '?');
	 end;
      end;

   is_case_insensitive_flag(flag: STRING): BOOLEAN is
      do
         if flag_match(fz_case_insensitive,flag) then
            Result := true;
            eiffel_parser.set_case_insensitive;
         end;
      end;

   is_no_style_warning_flag(flag: STRING): BOOLEAN is
      do
         if flag_match(fz_no_style_warning,flag) then
            Result := true;
            eiffel_parser.set_no_style_warning;
         end;
      end;

   is_no_warning_flag(flag: STRING): BOOLEAN is
      do
         if flag_match(fz_no_warning,flag) then
            Result := true;
            eh.set_no_warning;
         end;
      end;

   is_trace_flag(flag: STRING): BOOLEAN is
      do
         if flag_match(fz_trace,flag) then
            Result := true;
            ace.set_default_trace;
         end;
      end;

   is_verbose_flag(flag: STRING): BOOLEAN is
      do
         if flag_match(fz_verbose,flag) then
	    echo.set_verbose;
            Result := true;
         end;
      end;

   is_clean_flag(flag: STRING): BOOLEAN is
      do
         if flag_match(fz_clean,flag) then
	    ace.set_clean(true);
            Result := true;
         end;
      end;

   is_version_flag(flag: STRING): BOOLEAN is
      do
         if flag_match(fz_version,flag) or else flag_match(once "v",flag) then
	    if not version_flag then
	       std_output.put_string(once "Version of command %"");
	       std_output.put_string(command_name);
	       std_output.put_string(once "%" is:%N");
	       std_output.put_string(small_eiffel.copyright);
	    end;
	    inspect
	       argument_count
	    when 1 then
	       die_with_code(exit_success_code);
	    when 2 then
	       if help_flag then
		  die_with_code(exit_success_code);
	       end;
	    else
	    end;
	    version_flag := true;
            Result := true;
         end;
      end;

   version_flag: BOOLEAN;
	 -- Memory of `is_version_flag'.

   is_a_compilation_level_flag(flag: STRING): BOOLEAN is
	 -- Is the `flag' one of this list: "-boost", "-no_check",
	 -- "-require_check", "-ensure_check", "-invariant_check",
	 -- "-loop_check", "-all_check", or "-debug_check" ?
      do
         if flag_match(fz_boost,flag) then
            Result := true;
            ace.set_boost;
	 elseif flag_match(fz_no_check,flag) then
            Result := true;
            ace.set_no_check;
	 elseif flag_match(once "require_check",flag) then
            Result := true;
            ace.set_require_check;
	 elseif flag_match(once "ensure_check",flag) then
            Result := true;
            ace.set_ensure_check;
	 elseif flag_match(once "invariant_check",flag) then
            Result := true;
            ace.set_invariant_check;
	 elseif flag_match(once "loop_check",flag) then
            Result := true;
            ace.set_loop_check;
	 elseif flag_match(once "all_check",flag) then
            Result := true;
            ace.set_all_check;
	 elseif flag_match(once "debug_check",flag) then
            Result := true;
            ace.set_debug_check;
         end;
	 if Result then
	    check_for_level(flag);
	 end;
      end;

   is_cecil_flag(flag: STRING; argi, argc: INTEGER): BOOLEAN is
      do
         if flag_match(fz_cecil,flag) then
            Result := true;
            if argi < argc then
               cecil_pool.add_file(argument(argi + 1));
            else
               echo.w_put_string(command_name);
               echo.w_put_string(": missing file name after -cecil flag.%N");
               die_with_code(exit_failure_code);
            end;
         end;
      end;

   is_o_flag(flag: STRING; argi, argc: INTEGER;
             code_printer: CODE_PRINTER): BOOLEAN is
      local
         executable_name: STRING;
      do
         if fz_o.is_equal(flag) then
            Result := true;
            if argi < argc then
               executable_name := argument(argi + 1);
               if executable_name.has_suffix(eiffel_suffix) then
                  echo.w_put_string("Bad executable name: %"");
                  echo.w_put_string(executable_name);
                  echo.w_put_string(
                  "%". Must not use Eiffel source file suffix %
                   %with option %"-o <executable_name>%".");
                  die_with_code(exit_failure_code);
               end;
               ace.set_executable_name(executable_name);
            else
               echo.w_put_string(command_name);
               echo.w_put_string(": missing output name after -o flag.%N");
               die_with_code(exit_failure_code);
            end;
         end;
      end;

   is_manifest_string_trace(flag: STRING): BOOLEAN is
      do
         if flag_match(fz_manifest_string_trace,flag) then
	    ace.set_manifest_string_trace;
            Result := true;
         end;
      end;

   level_flag: STRING;

   check_for_level(new_level_flag: STRING) is
      do
         if level_flag /= Void then
            if not level_flag.same_as(new_level_flag) then
               echo.w_put_string(command_name);
               echo.w_put_string(": level is already set to ");
               echo.w_put_string(level_flag);
               echo.w_put_string(". Bad flag ");
               echo.w_put_string(new_level_flag);
               echo.w_put_string(fz_b0);
               die_with_code(exit_failure_code);
            end;
         else
            level_flag := new_level_flag;
         end;
      end;

   unknown_flag_exit(flag: STRING) is
      do
         echo.w_put_string(command_name);
         echo.w_put_string(": unknown flag %"");
         echo.w_put_string(flag);
         echo.w_put_string("%".%N");
         system_tools.bad_use_exit(Current);
      end;

end -- COMMAND_LINE_TOOLS
