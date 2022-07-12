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
class SYSTEM_TOOLS
   --
   -- Singleton object to handle system dependant information.
   -- This singleton is shared via the GLOBALS.`system_tools' once function.
   --
   -- Only this object is supposed to handle contents of the `SmallEiffel'
   -- system environment variable.
   --
   -- You may also want to customize this class in order to support a
   -- new operating system (please let us know).
   --

inherit GLOBALS;

creation make, install

feature {NONE}

   -- Currently handled system list :
   unix_system:        STRING is "UNIX";
   windows_system:     STRING is "Windows";
   cygwin_system:      STRING is "Cygwin";
   beos_system:        STRING is "BeOS";
   macintosh_system:   STRING is "Macintosh";
   amiga_system:       STRING is "Amiga";
   dos_system:         STRING is "DOS";
   os2_system:         STRING is "OS2";
   open_vms_system:    STRING is "OpenVMS";
   elate_system:       STRING is "Elate";

   -- Currently handled C compiler list :
   gcc:                STRING is "gcc";
   gpp:                STRING is "g++";
   lcc_win32:          STRING is "lcc-win32";
   cc:                 STRING is "cc";
   wcl386:             STRING is "wcl386";
   bcc32:              STRING is "bcc32";
   cl:                 STRING is "cl";
   sas_c:              STRING is "sc";
   dice:               STRING is "dice";
   vbcc:               STRING is "vbcc";
   ccc:                STRING is "ccc";
   vpcc:               STRING is "vpcc";
   open_vms_cc:        STRING is "OpenVMS_CC";

feature {INSTALL}

   system_list: ARRAY[STRING] is
      once
         Result := <<
                     unix_system,
                     windows_system,
                     cygwin_system,
                     beos_system,
                     macintosh_system,
                     amiga_system,
                     dos_system,
                     os2_system,
                     open_vms_system,
                     elate_system
                     >>;
      end;

   compiler_list: ARRAY[STRING] is
      once
         Result := <<
                     gcc,
                     lcc_win32,
                     cc,
                     wcl386,
                     bcc32,
                     cl,
                     sas_c,
                     dice,
                     vbcc,
                     ccc,
                     vpcc,
                     open_vms_cc
                     >>;
      end;

   add_x_suffix(cmd: STRING) is
      local
         suffix: STRING;
      do
         suffix := x_suffix;
         if not cmd.has_suffix(suffix) then
            cmd.append(suffix);
         end;
      end;

   make is
      local
         system_se_path: STRING;
         i: INTEGER;
      do
         system_se_path := echo.getenv(fz_smalleiffel,Void);
         if system_se_path = Void then
            system_se_path := fz_smalleiffel.twin;
            system_se_path.to_upper;
            system_se_path := echo.getenv(system_se_path,Void);
            if system_se_path = Void then
               echo.put_string(
                  once "System environment variable %"SmallEiffel%" not set.%N%
                  %Trying default value: %"");
               system_se_path := "/usr/lib/SmallEiffel/sys/system.se";
               echo.put_string(system_se_path);
               echo.put_string(fz_03);
            end;
         else
            echo.put_string(once "SmallEiffel=%"");
            echo.put_string(system_se_path);
            echo.put_string(fz_b0);
         end;
         if system_se_path.has_suffix(fz_system_se) then
            echo.tfr_connect(tmp_file_read,system_se_path);
         else
            echo.put_string(
               "You should update the value of the %"SmallEiffel%" %
               %system environment variable.%N%
               %Since release -0.79, the %"SmallEiffel%" system %
               %environment variable must be the absolute path of %
               %the %"system.se%" file.%N%
               %For example %"/usr/lib/SmallEiffel/sys/system.se%" %
               %under Unix like system.%N");
            if system_se_path.has('/') then
               echo.put_string(once "Hope this is a Unix like system.%N");
               tmp_path.copy(system_se_path);
               tmp_path.extend_unless('/');
               tmp_path.append(fz_sys);
               tmp_path.extend('/');
               tmp_path.append(fz_system_se);
               echo.tfr_connect(tmp_file_read,tmp_path);
            end;
            if not tmp_file_read.is_connected then
               if system_se_path.has('\') then
                  echo.put_string(once "Hope this is a Windows like system.%N");
                  tmp_path.copy(system_se_path);
                  tmp_path.extend_unless('\');
                  tmp_path.append(fz_sys);
                  tmp_path.extend('\');
                  tmp_path.append(fz_system_se);
                  echo.tfr_connect(tmp_file_read,tmp_path);
               end;
            end;
            if not tmp_file_read.is_connected then
               if system_se_path.has(':') then
                  echo.put_string(once "Hope this is a Macintosh like system.%N");
                  tmp_path.copy(system_se_path);
                  tmp_path.extend_unless(':');
                  tmp_path.append(fz_sys);
                  tmp_path.extend(':');
                  tmp_path.append(fz_system_se);
                  echo.tfr_connect(tmp_file_read,tmp_path);
               end;
            end;
            if not tmp_file_read.is_connected then
               if system_se_path.has(']') then
                  echo.put_string(once "Hope this is a VMS system.%N");
                  tmp_path.copy(system_se_path);
                  tmp_path.extend_unless(']');
                  tmp_path.remove_last(1);
                  tmp_path.extend('.');
                  tmp_path.append(fz_sys);
                  tmp_path.extend(']');
                  tmp_path.append(fz_system_se);
                  echo.tfr_connect(tmp_file_read,tmp_path);
               end;
            end;
            if not tmp_file_read.is_connected then
               echo.put_string(once "Last chance.%N");
               tmp_path.copy(system_se_path);
               tmp_path.append(fz_system_se);
               echo.tfr_connect(tmp_file_read,tmp_path);
            end;
         end;
         if not tmp_file_read.is_connected then
            echo.w_put_string(
               "Unable to find file %"system.se%".%N%
               %Please, set the environment variable %"SmallEiffel%" %
               %with the appropriate absolute path to this file.%N%
               %Example for Unix: %"/usr/lib/SmallEiffel/sys/system.se%"%N%
               %Example for DOS/Windows: %"C:\SmallEiffel\sys\system.se%"%N");
            die_with_code(exit_failure_code);
         end;
         tmp_file_read.read_line;
         system_name := tmp_file_read.last_string;
         i := system_list.index_of(system_name);
         if i > system_list.upper then
            echo.w_put_string(once "Unknown system name in file%N%"");
            echo.w_put_string(tmp_file_read.path);
            echo.w_put_string(once "%".%NCurrently handled system names :%N");
            from
               i := 1;
            until
               i > system_list.upper
            loop
               echo.w_put_string(system_list.item(i));
               echo.w_put_character('%N');
               i := i + 1;
            end;
            die_with_code(exit_failure_code);
         else
            system_name := system_list.item(i);
            echo.put_string(once "System is %"");
            echo.put_string(system_name);
            echo.put_string(fz_b0);
         end;
         sys_directory := tmp_file_read.path.twin;
         sys_directory.remove_suffix(fz_system_se);
         tmp_file_read.disconnect;
         bin_directory := sys_directory.twin;
         parent_directory(bin_directory);
         subdirectory(bin_directory,fz_bin);
      end;

   system_name: STRING;

   install_extra_options is
         -- Add some extra options during `install' time.
      do
         check
            c_compiler /= Void
            -- This ought to be in a require clause, but
            -- `c_compiler' has access restrictions
         end
         if c_compiler = gcc or else c_compiler = gpp then
            if not c_compiler_options.has('O') then
               append_token(c_compiler_options,o2);
            end;
         elseif c_compiler = lcc_win32 then
            if not c_compiler_options.has('O') then
               append_token(c_compiler_options,once "-O");
            end;
         elseif c_compiler = sas_c then
            if not Scoptions_exists then
               append_token(c_compiler_options,once "Optimize OptimizerTime");
            end;
         elseif c_compiler = dice then
         elseif c_compiler = vbcc then
         elseif c_compiler = ccc then
            if not c_compiler_options.has('O') then
               append_token(c_compiler_options,o2);
            end;
         elseif c_compiler = vpcc then
         elseif c_compiler = open_vms_cc then
         end;
      end;

feature {NONE}

   sys_directory: STRING;
         -- The SmallEiffel/sys directory computed with the value of
         -- the environment variable `SmallEiffel'.
         -- For example, under UNIX: "/usr/lib/SmallEiffel/sys/"

   bin_directory: STRING;
         -- For example, under UNIX: "/usr/lib/SmallEiffel/bin/"

   install is
      do
      end;

feature {COMPILE,INSTALL}

   command_path_in(command, command_name: STRING) is
         -- Append in `command' the correct path for `command_name'.
      do
         if system_name = open_vms_system then
            command.append(once "mcr ");
         end;
         command.append(bin_directory);
         command.append(command_name);
         command.append(x_suffix);
      end;

   remove_other_extra_files(name: STRING) is
         -- Remove some other extra file which may be created while
         -- compiling `name' root class in split mode.
      local
         n: STRING;
      do
         if c_compiler = lcc_win32 or else c_compiler = sas_c then
            n := name + lnk_suffix;
            echo.file_removing(n);
         end;
      end;

feature {COMPILE}

   remove_make_script_and_other_extra_files is
         -- Remove the *.make file script and some other extra files.
      local
         name: STRING;
      do
         name := new_make_script;
         name.remove_suffix(make_suffix);
         remove_other_extra_files(name);
      end;

   cygnus_bug(make_file: TEXT_FILE_READ; make_script_name: STRING) is
         -- Because of a bug in cygnus on windows 95/NT.
      local
         time_out: INTEGER;
      do
         make_file.connect_to(make_script_name);
         from
            time_out := 2000;
         until
            time_out = 0 or else make_file.is_connected
         loop
            make_file.connect_to(make_script_name);
            time_out := time_out - 1;
         end;
      end;

feature {COMPILE,CLEAN}

   new_make_script: STRING is
         -- Compute the corresponding make file script name and remove
         -- the old existing one if any.
      do
         Result := path_h;
         Result.remove_last(2);
         Result.append(make_suffix);
         echo.file_removing(Result);
      end;

feature {GC_HANDLER}

   put_mark_stack_and_registers is
         -- Add customized assembly code to mark registers.
      local
         architecture: STRING;
      do
         tmp_path.copy(sys_directory);
         tmp_path.append(fz_gc);
         echo.tfr_connect_or_exit(tmp_file_read,tmp_path);
         architecture := echo.read_word_in(tmp_file_read);
         tmp_file_read.disconnect;
         if as_none.is_equal(architecture) then
            eh.append(
               "Assembly Code for Garbage Collector not selected in %"");
            eh.append(tmp_path);
            eh.append(
               "%". Default generic (hazardous) C code is provided. %
                % Have a look in the SmallEiffel FAQ.");
            eh.print_as_warning;
            architecture := "generic.c";
         end;
         tmp_path.copy(sys_directory);
         subdirectory(tmp_path,fz_gc_lib);
         tmp_path.append(architecture);
         echo.tfr_connect_or_exit(tmp_file_read,tmp_path);
         cpp.put_c_file(tmp_file_read);
      end;

feature {SHORT_PRINT}

   format_directory(format: STRING): STRING is
      require
         format /= Void
      do
         !!Result.make(sys_directory.count + 10);
         Result.copy(sys_directory);
         parent_directory(Result);
         subdirectory(Result,once "short");
         subdirectory(Result,format);
      end;

feature

   is_c_plus_plus_file_path(path: STRING): BOOLEAN is
         -- True when there `path' has one of the following
         -- suffix: ".cpp", ".cc", or ".C".
      do
         if path.has_suffix(c_plus_plus_suffix) then
            Result := true;
         elseif path.has_suffix(once ".cc") then
            Result := true;
         elseif path.has_suffix(once ".C") then
            Result := true;
         end;
      end;

feature {CLUSTER,JVM,ACE}

   file_path(parent_path, file_name: STRING) is
         -- Use the `system_name' knowledge to call feature `compute_file_path_with'
         -- of BASIC_DIRECTORY. The `parent_path' is modified accordingly.
      do
         set_basic_directory_notation;
         basic_directory.compute_file_path_with(parent_path,file_name);
         parent_path.copy(basic_directory.last_entry);
      end;

feature

   make_suffix: STRING is
      -- Suffix for make file produced by `compile_to_c'.
      once
         if dos_system = system_name then
            Result := once ".BAT";
         elseif windows_system = system_name then
            Result := once ".bat";
         elseif open_vms_system = system_name then
            Result := once ".com";
         elseif os2_system = system_name then
            Result := once ".CMD";
         elseif elate_system = system_name then
            Result := once ".scf";
         else
            Result := once ".make";
         end;
      end;

   x_suffix: STRING is
         -- Executable files suffix.
      once
         if dos_system = system_name then
            Result := exe_suffix;
            Result.to_upper;
         elseif open_vms_system = system_name then
            Result := exe_suffix;
            Result.to_upper;
         elseif os2_system = system_name then
            Result := exe_suffix;
         elseif windows_system = system_name then
            Result := exe_suffix;
         elseif cygwin_system = system_name then
            Result := exe_suffix;
         elseif elate_system = system_name then
            Result := once ".00";
         else
            create Result.make(4);
         end;
      ensure
         Result /= Void
      end;

   object_suffix: STRING is
         -- Of object File produced by the C Compiler.
      once
         if c_compiler = gcc then
            Result := o_suffix;
         elseif c_compiler = lcc_win32 then
            Result := obj_suffix;
         elseif c_compiler = cc then
            Result := o_suffix;
         elseif c_compiler = wcl386 then
            Result := obj_suffix;
         elseif c_compiler = bcc32 then
            Result := obj_suffix;
         elseif c_compiler = cl then
            Result := obj_suffix;
         elseif c_compiler = sas_c then
            Result := o_suffix;
         elseif c_compiler = dice then
            Result := o_suffix;
         elseif c_compiler = vbcc then
            Result := o_suffix;
         elseif c_compiler = ccc then
            Result := o_suffix;
         elseif c_compiler = vpcc then
            Result := o_suffix;
         elseif c_compiler = open_vms_cc then
            Result := obj_suffix;
            Result.to_upper;
         end;
      end;

feature {NATIVE_SMALL_EIFFEL}

   add_lib_math is
      once
         if beos_system = system_name then
         elseif c_compiler = gcc then
            add_external_lib(libm);
         elseif c_compiler = bcc32 then
            add_external_lib(libm);
         elseif c_compiler = cl then
         elseif c_compiler = sas_c then
            -- math library is included automatically if
            -- "Math=..." was specified (as it is in
            -- default `sas_c_compiler_options')
         elseif c_compiler = dice then
            add_external_lib(libm);
         elseif c_compiler = vbcc then
            if amiga_system = system_name then
               add_external_lib(once "mieee");
            else
               add_external_lib(libm);
            end;
         elseif c_compiler = ccc then
            add_external_lib(libcpml);
         elseif c_compiler = vpcc then
         elseif c_compiler = open_vms_cc then
         end;
      end;

feature {COMPILE,COMPILE_TO_C}

   extra_arg(arg: STRING; argi: INTEGER; next_arg: STRING): INTEGER is
      require
         arg /= Void;
         argi >= 1
      do
         if arg.item(1) /= '-' then
            if arg.has_suffix(object_suffix) then
               append_token(external_object_files,arg);
               Result := argi + 1;
            elseif arg.has_suffix(c_suffix) then
               append_token(external_c_files,arg);
               Result := argi + 1;
            elseif is_c_plus_plus_file_path(arg) then
               append_token(external_c_plus_plus_files,arg);
               Result := argi + 1;
            elseif arg.has_suffix(once ".a") then
               add_external_lib(arg);
               Result := argi + 1;
            elseif arg.has_suffix(once ".lib") then
               add_external_lib(arg);
               Result := argi + 1;
            elseif arg.has_suffix(once ".res") then
               -- For lcc-win32 resource files :
               add_external_lib(arg);
               Result := argi + 1;
            elseif ace.root_class_name = Void then
               ace.set_root_class_name_using(arg);
               Result := argi + 1;
               if next_arg /= Void then
                  if next_arg.item(1) /= '-' then
                     if next_arg.has_suffix(object_suffix) then
                     elseif next_arg.has_suffix(c_suffix) then
                     elseif is_c_plus_plus_file_path(next_arg) then
                     else
                        ace.set_root_procedure_name(next_arg);
                        Result := argi + 2;
                     end;
                  end;
               end;
            else
               append_token(c_compiler_options,arg);
               Result := argi + 1;
            end;
         elseif arg.has_prefix(once "-l") then
            do_add_external_lib(arg);
            Result := argi + 1;
         elseif arg.has_prefix(l_flag) then
            append_token(external_lib_path,arg);
            if (l_flag).is_equal(arg) then
               if next_arg /= Void then
                  append_token(external_lib_path,next_arg);
                  Result := argi + 2;
               end;
            else
               Result := argi + 1;
            end;
         elseif (once "-subsystem").is_equal(arg) then
            append_token(linker_options,arg);
            if next_arg /= Void then
               append_token(linker_options,next_arg);
               Result := argi + 2;
            else
               Result := argi + 1;
            end;
         elseif (once "-include").is_equal(arg) then
            if next_arg /= Void then
               append_token(c_compiler_options,arg);
               append_token(c_compiler_options,next_arg);
               Result := argi + 2;
            else
               Result := argi + 1;
            end;
         else
            append_token(c_compiler_options,arg);
            Result := argi + 1;
         end;
      ensure
         Result > old argi
      end;

feature {ACE, COMMAND_LINE_TOOLS}

   bad_use_exit(command: COMMAND_LINE_TOOLS) is
         -- Print the traditional `command_line_help_summary' as well as some extra
         -- information to find more help.
      require
         command /= Void
      local
         command_name: STRING;
      do
         echo.w_put_string("Bad use of command `");
         command_name := command.command_name;
         echo.w_put_string(command_name);
         echo.w_put_string("'.%N");
         echo.w_put_string(command.command_line_help_summary);
         tmp_path.copy(sys_directory);
         parent_directory(tmp_path);
         subdirectory(tmp_path,"man");
         tmp_path.append(command_name);
         tmp_path.append(".txt");
         echo.w_put_string(
            "If SmallEiffel is correctly installed, you should find%N%
            %more information in file: %"");
         echo.w_put_string(tmp_path);
         echo.w_put_string(
            "%".%NYou can also have a look at http://SmallEiffel.loria.fr%N");
         die_with_code(exit_failure_code);
      end;

   set_c_compiler(cc_arg: STRING) is
         -- If `cc_arg' is not Void, this `cc_arg' is used as the C compiler.
         -- Otherwise, when `cc_arg' is Void, read the selected one in the
         -- "SmallEiffel/sys/compiler.se" file.
      local
         i: INTEGER;
         sd: STRING;
         c: CHARACTER;
      do
         if cc_arg /= Void then
            i := compiler_list.index_of(cc_arg);
            if i > compiler_list.upper then
               echo.w_put_string(once "compile_to_c: %"");
               echo.w_put_string(cc_arg);
               echo.w_put_string(
               once "%": unknown C compiler name after -cc flag or in the ACE file.%N");
               show_compiler_list_then_exit;
            end;
            c_compiler := compiler_list.item(i);
         else
            sd := sys_directory;
            tmp_path.copy(sd);
            tmp_path.append(once "compiler.se");
            echo.tfr_connect_or_exit(tmp_file_read,tmp_path);
            c_compiler := echo.read_word_in(tmp_file_read);
            i := compiler_list.index_of(c_compiler);
            if i > compiler_list.upper then
               echo.w_put_string(once "Unknown compiler name in file%N%"");
               echo.w_put_string(tmp_file_read.path);
               echo.w_put_string(fz_b0);
               show_compiler_list_then_exit;
            end;
            c_compiler := compiler_list.item(i);
            if not tmp_file_read.end_of_input then
               from
                  c := tmp_file_read.last_character;
               until
                  c = '%N' or else c ='%R'
               loop
                  c_compiler_options.extend(c);
                  tmp_file_read.read_character;
                  if not tmp_file_read.end_of_input then
                     c := tmp_file_read.last_character;
                  end;
               end;
            end;
            tmp_file_read.disconnect;
            from
            until c_compiler_options.is_empty or else
               not c_compiler_options.first.is_separator
            loop
               c_compiler_options.remove_first(1);
            end;
            -- Setting default `c_compiler_options' only when there is no C
            -- compiler option after the name of the compiler we have just
            -- read in file "compiler.se". This allow the advanced user to
            -- tune exactly the C compiler according to its needs.
            if c_compiler_options.is_empty then
               if gcc = c_compiler then
                  c_compiler_options.copy(o2);
               elseif lcc_win32 = c_compiler then
                  c_compiler_options.copy(once "-O");
               elseif cc = c_compiler then
                  c_compiler_options.copy(once "-O");
               elseif wcl386 = c_compiler then
               elseif bcc32 = c_compiler then
                  c_compiler_options.copy(once "-5 -w-aus -w-par -w-rvl -O2 -O-v");
               elseif cl = c_compiler then
                  c_compiler_options.copy(once "-O2 -nologo -D%"WIN32%"");
               elseif sas_c = c_compiler then
                  c_compiler_options.clear;
                  linker_options.copy(once "Link");
                  if not Scoptions_exists then
                     append_token(linker_options, once "SmallCode SmallData");
                  end;
               elseif dice = c_compiler then
                  c_compiler_options.copy(once "-mD -mC");
               elseif vbcc = c_compiler then
                  if amiga_system = system_name then
                     c_compiler_options.copy(once "-DAMIGA");
                  end;
               elseif ccc = c_compiler then
                  c_compiler_options.copy(o2);
               elseif vpcc = c_compiler then
               else
                  check false end;
               end;
            end;
         end;
      ensure
         compiler_list.fast_has(c_compiler)
      end;

feature {ACE, COMPILE_TO_C}

   set_no_strip is
      do
         no_strip := true;
      end;

feature {ACE,C_PRETTY_PRINTER}

   c_compiler_options: STRING is "";
         -- C compiler options including extra include path,
         -- optimization flags, etc.

feature {C_PRETTY_PRINTER}

   put_c_main_function_type(out_c: TEXT_FILE_WRITE) is
      do
         if open_vms_system = system_name then
            out_c.put_string(fz_void);
         else
            out_c.put_string(fz_int);
         end;
      end;

   put_c_main_function_exit(out_c: TEXT_FILE_WRITE) is
      do
         out_c.put_string(once "}%Nexit(0);%N");
         if open_vms_system = system_name then
            out_c.put_string(once "return;}%N");
         else
            out_c.put_string(once "return 0;}%N");
         end;
      end;

   sys_runtime(name: STRING; suffix: CHARACTER) is
         -- Prepare `tmp_file_read' to access the corresponding file of the
         -- SmallEiffel sys/runtime directory. The complete path is
         -- always available in `tmp_path' to the caller in order to emit an
         -- error message when the corresponding file is not found. (This
         -- routine does not emit errors message itself just because this
         -- may be normal. See also `mandatory_sys_runtime'.)
      require
         name /= Void;
         suffix = 'c' or suffix = 'h'
      do
         sys_runtime_(name,suffix);
         echo.tfr_connect(tmp_file_read,tmp_path);
      end;

   mandatory_sys_runtime(name: STRING; suffix: CHARACTER) is
         -- Same as `sys_runtime', but emit an error message when the
         -- corresponding file does not exists.
      do
         sys_runtime_(name,suffix);
         echo.tfr_connect_or_exit(tmp_file_read,tmp_path);
      ensure
         tmp_file_read.is_connected
      end;

   path_h: STRING is
         -- Create a new STRING which is the name of the main *.h file.
      do
         Result := ace.root_class_name.twin;
         Result.to_lower;
         if dos_system = system_name then
            from
            until
               Result.count <= 4
            loop
               Result.remove_last(1);
            end;
         end;
         Result.append(h_suffix);
      end;

   strip_executable(cmd: STRING): BOOLEAN is
      local
         executable_name: STRING;
      do
         cmd.clear;
         if not no_strip then
            executable_name := ace.executable_name;
            if unix_system = system_name then
               Result := true;
               cmd.append(once "strip ");
               if executable_name = Void then
                  cmd.append(once "a.out");
               else
                  cmd.append(executable_name);
               end;
            elseif os2_system = system_name then
               Result := true;
               cmd.append(once "emxbind -qs ");
               if executable_name = Void then
                  cmd.append(once "a.exe");
               else
                  cmd.append(executable_name);
               end;
            end;
         end;
      end;

   add_c_plus_plus_file(f: STRING) is
      require
         is_c_plus_plus_file_path(f)
      do
         append_token(external_c_plus_plus_files,f);
      end;

   is_linking_mandatory: BOOLEAN is
         -- Is is mandatory to link again this executable even when
         -- nothing has changed in the generated C code ?
      do
         Result := not external_object_files.is_empty;
         if not Result then
            Result := not external_c_files.is_empty;
         end;
         if not Result then
            Result := not external_c_plus_plus_files.is_empty;
         end;
      end;

   add_lib_basic_picasso is
      once
         if system_name = unix_system then
            add_external_lib_path(once "/usr/X11R6/lib");
            add_external_lib_path(once "/usr/X/lib");
            add_external_lib(once "X11");
         end;
      end;

feature {C_PRETTY_PRINTER,INSTALL}

   split_mode_c_compiler_command(cmd, c_file_name: STRING) is
         -- Where c_file_name is the name of one slice.
      do
         cmd.clear;
         if c_compiler = gcc then
            if is_c_plus_plus_file_path(c_file_name) then
               cmd.append(gpp);
            else
               cmd.append(gcc);
            end
            append_token(cmd,c_compiler_options);
            append_token(cmd,external_header_path);
            append_token(cmd,c_flag);
            append_token(cmd,c_file_name);
         elseif c_compiler = lcc_win32 then
            cmd.append(lcc);
            append_token(cmd,c_compiler_options);
            append_token(cmd,external_header_path);
            append_token(cmd,c_file_name);
         elseif c_compiler = cc then
            cmd.append(cc);
            append_token(cmd,c_compiler_options);
            append_token(cmd,external_header_path);
            append_token(cmd,c_flag);
            append_token(cmd,c_file_name);
         elseif c_compiler = wcl386 then
            cmd.append(once "wcc386");
            append_token(cmd,c_compiler_options);
            append_token(cmd,external_header_path);
            append_token(cmd,c_file_name);
         elseif c_compiler = bcc32 then
            cmd.append(bcc32);
            append_token(cmd,c_compiler_options);
            append_token(cmd,external_header_path);
            append_token(cmd,c_flag);
            append_token(cmd,c_file_name);
         elseif c_compiler = cl then
            cmd.append(cl);
            append_token(cmd,c_compiler_options);
            append_token(cmd,external_header_path);
            append_token(cmd,c_flag);
            append_token(cmd,c_file_name);
         elseif c_compiler = sas_c then
            cmd.append(sas_c);
            append_token(cmd,sas_c_compiler_options(true));
            append_token(cmd,c_compiler_options);
            append_token(cmd,external_header_path);
            append_token(cmd,c_file_name);
         elseif c_compiler = dice then
            cmd.append(dcc);
            append_token(cmd,c_compiler_options);
            append_token(cmd,external_header_path);
            append_token(cmd,c_flag);
            append_token(cmd,c_file_name);
         elseif c_compiler = vbcc then
            cmd.append(vc);
            append_token(cmd,c_compiler_options);
            append_token(cmd,external_header_path);
            append_token(cmd,c_flag);
            append_token(cmd,c_file_name);
         elseif c_compiler = ccc then
            cmd.append(ccc);
            append_token(cmd,c_compiler_options);
            append_token(cmd,external_header_path);
            append_token(cmd,c_flag);
            append_token(cmd,c_file_name);
         elseif c_compiler = vpcc then
            cmd.append(vpcc);
            append_token(cmd,c_compiler_options);
            append_token(cmd,external_header_path);
            append_token(cmd,c_flag);
            append_token(cmd,c_file_name);
         elseif c_compiler = open_vms_cc then
            -- BdB: external_header_path to be added here somehow
            cmd.append(once "cc/warning=disable=(embedcomment,longextern) ");
            cmd.append(c_file_name);
            cmd.remove_last(2);
         end;
      end;

   split_mode_linker_command(cmd, c_name: STRING; max: INTEGER) is
         -- Where `c_name' is only the prefix name (i.e. "compile_to_c").
      local
         script, lst: TEXT_FILE_WRITE; i: INTEGER; name: STRING;
      do
         cmd.clear;
         if c_compiler = gcc then
            if external_c_plus_plus_files.is_empty then
               cmd.append(gcc);
            else
               cmd.append(gpp);
            end
            append_token(cmd,c_compiler_options);
            append_token(cmd,external_header_path);
            append_token(cmd,linker_options);
            append_token(cmd,external_lib_path);
            add_executable_name(cmd);
            add_objects(cmd,c_name,max);
            append_token(cmd,external_c_files);
            append_token(cmd,external_c_plus_plus_files);
            append_token(cmd,external_object_files);
            append_token(cmd,external_lib);
         elseif c_compiler = lcc_win32 then
            external_c_files_for_lcc_win32(cmd);
            cmd.append(lcclnk);
            if not no_strip then
               append_token(cmd,s_flag);
            end;
            append_token(cmd,linker_options);
            add_executable_name(cmd);
            if max < 4 then
               -- Object files are passed in the command line:
               add_objects(cmd,c_name,max);
            else
               -- Object files are listed in a *.lnk file:
               name := c_name;
               name.append(lnk_suffix);
               append_token(cmd, "@" + name);
               create lst.make;
               echo.tfw_connect(lst,name);
               from
                  name.remove_last(4);
                  i := 1;
               until
                  i > max
               loop
                  lst.put_string(name);
                  lst.put_integer(i);
                  lst.put_string(obj_suffix);
                  lst.put_new_line;
                  i := i + 1;
               end;
               lst.disconnect;
            end;
            append_token(cmd,external_object_files);
            append_token(cmd,external_lib);
         elseif c_compiler = cc then
            cmd.append(cc);
            append_token(cmd,c_compiler_options);
            append_token(cmd,external_header_path);
            append_token(cmd,linker_options);
            append_token(cmd,external_lib_path);
            add_executable_name(cmd);
            add_objects(cmd,c_name,max);
            append_token(cmd,external_c_files);
            append_token(cmd,external_c_plus_plus_files);
            append_token(cmd,external_object_files);
            append_token(cmd,external_lib);
         elseif c_compiler = wcl386 then
            cmd.append(once "wlink");
            append_token(cmd,c_compiler_options);
            append_token(cmd,external_header_path);
            append_token(cmd,linker_options);
            append_token(cmd,external_lib_path);
            add_executable_name(cmd);
            add_objects(cmd,c_name,max);
            append_token(cmd,external_c_files);
            append_token(cmd,external_c_plus_plus_files);
            append_token(cmd,external_object_files);
            append_token(cmd,external_lib);
         elseif c_compiler = bcc32 then
            cmd.append(bcc32);
            append_token(cmd,c_compiler_options);
            append_token(cmd,external_header_path);
            append_token(cmd,linker_options);
            append_token(cmd,external_lib_path);
            add_executable_name(cmd);
            add_objects(cmd,c_name,max);
            append_token(cmd,external_c_files);
            append_token(cmd,external_c_plus_plus_files);
            append_token(cmd,external_object_files);
            append_token(cmd,external_lib);
            add_lib_math;
         elseif c_compiler = cl then
            cmd.append(cl);
            append_token(cmd,c_compiler_options);
            append_token(cmd,external_header_path);
            add_executable_name(cmd);
            add_objects(cmd,c_name,max);
            append_token(cmd,external_c_files);
            append_token(cmd,external_c_plus_plus_files);
            append_token(cmd,external_object_files);
            append_token(cmd,once " /link");
            append_token(cmd,linker_options);
            append_token(cmd,external_lib_path);
            append_token(cmd,external_lib);
            add_lib_math;
         elseif c_compiler = sas_c then
            cmd.append(sas_c);
            append_token(cmd,sas_c_compiler_options(true));
            append_token(cmd,c_compiler_options);
            append_token(cmd,external_header_path);
            append_token(cmd,linker_options);
            append_token(cmd,c_name);
            cmd.append(once "#1#2#3#4#5#6#7#8#9#?.o");
            append_token(cmd,external_c_files);
            append_token(cmd,external_c_plus_plus_files);
            append_token(cmd,external_object_files);
            append_token(cmd,external_lib);
            add_executable_name(cmd);
            if not no_strip then
               cmd.append(once " StripDebug");
            end;
         elseif c_compiler = dice then
            cmd.append(dcc);
            append_token(cmd,c_compiler_options);
            append_token(cmd,external_header_path);
            append_token(cmd,linker_options);
            append_token(cmd,external_lib_path);
            add_executable_name(cmd);
            add_objects(cmd,c_name,max);
            append_token(cmd,external_c_files);
            append_token(cmd,external_c_plus_plus_files);
            append_token(cmd,external_object_files);
            append_token(cmd,external_lib);
            if no_strip then
               -- no typo; "-s" means "include symbol table",
               -- not "strip debug information"
               append_token(cmd,once "-s -d1");
            end;
            add_lib_math;
         elseif c_compiler = vbcc then
            cmd.append(vc);
            append_token(cmd,c_compiler_options);
            append_token(cmd,external_header_path);
            append_token(cmd,linker_options);
            append_token(cmd,external_lib_path);
            add_executable_name(cmd);
            add_lib_math;
            add_objects(cmd,c_name,max);
            append_token(cmd,external_c_files);
            append_token(cmd,external_c_plus_plus_files);
            append_token(cmd,external_object_files);
            append_token(cmd,external_lib);
         elseif c_compiler = ccc then
            cmd.append(ccc);
            append_token(cmd,c_compiler_options);
            append_token(cmd,external_header_path);
            append_token(cmd,linker_options);
            append_token(cmd,external_lib_path);
            add_executable_name(cmd);
            add_objects(cmd,c_name,max);
            append_token(cmd,external_c_files);
            append_token(cmd,external_c_plus_plus_files);
            append_token(cmd,external_object_files);
            append_token(cmd,external_lib);
         elseif c_compiler = vpcc then
            cmd.append(vpcc);
            append_token(cmd,c_compiler_options);
            append_token(cmd,external_header_path);
            append_token(cmd,linker_options);
            append_token(cmd,external_lib_path);
            add_executable_name(cmd);
            add_objects(cmd,c_name,max);
            append_token(cmd,external_c_files);
            append_token(cmd,external_c_plus_plus_files);
            append_token(cmd,external_object_files);
            append_token(cmd,external_lib);
         elseif c_compiler = open_vms_cc then
            create script.make;
            echo.tfw_connect(script,once "linkit.com");
            script.put_string(once "$ link/exe=");
            cmd.clear;
            add_executable_name(cmd);
            script.put_string(cmd);
            script.put_character(' ');
            from
               i := 1;
            until
               i >= max
            loop
               script.put_string(c_name);
               script.put_integer(i);
               script.put_string(once ",-%N");
               i := i + 1;
            end;
            script.put_string(c_name);
            script.put_integer(i);
            script.put_character('%N');
            script.disconnect;
            cmd.clear;
            cmd.append(once "@linkit.com%Ndelete linkit.com;")
         end;
      end;

   no_split_mode_command(cmd, c_file_name: STRING) is
      require
         c_file_name.has_suffix(once ".c")
      do
         cmd.clear;
         if c_compiler = gcc then
            if external_c_plus_plus_files.is_empty then
               cmd.append(gcc);
            else
               cmd.append(gpp);
            end
            append_token(cmd,c_compiler_options);
            append_token(cmd,external_header_path);
            append_token(cmd,linker_options);
            append_token(cmd,external_lib_path);
            add_executable_name(cmd);
            append_token(cmd,c_file_name);
            append_token(cmd,external_c_files);
            append_token(cmd,external_c_plus_plus_files);
            append_token(cmd,external_object_files);
            append_token(cmd,external_lib);
         elseif c_compiler = lcc_win32 then
            cmd.append(lcc);
            append_token(cmd,c_compiler_options);
            append_token(cmd,external_header_path);
            append_token(cmd,c_file_name);
            cmd.extend('%N');
            external_c_files_for_lcc_win32(cmd);
            cmd.append(lcclnk);
            if not no_strip then
               append_token(cmd,s_flag);
            end;
            append_token(cmd,linker_options);
            add_executable_name(cmd);
            c_file_name.remove_suffix(c_suffix);
            c_file_name.append(object_suffix);
            append_token(cmd,c_file_name);
            append_token(cmd,external_object_files);
            append_token(cmd,external_lib);
         elseif c_compiler = cc then
            cmd.append(cc);
            append_token(cmd,c_compiler_options);
            append_token(cmd,external_header_path);
            append_token(cmd,linker_options);
            append_token(cmd,external_lib_path);
            add_executable_name(cmd);
            append_token(cmd,c_file_name);
            append_token(cmd,external_c_files);
            append_token(cmd,external_c_plus_plus_files);
            append_token(cmd,external_object_files);
            append_token(cmd,external_lib);
         elseif c_compiler = wcl386 then
            cmd.append(wcl386);
            append_token(cmd,c_compiler_options);
            append_token(cmd,external_header_path);
            append_token(cmd,linker_options);
            append_token(cmd,external_lib_path);
            add_executable_name(cmd);
            append_token(cmd,c_file_name);
            append_token(cmd,external_c_files);
            append_token(cmd,external_c_plus_plus_files);
            append_token(cmd,external_object_files);
            append_token(cmd,external_lib);
         elseif c_compiler = bcc32 then
            cmd.append(bcc32);
            append_token(cmd,c_compiler_options);
            append_token(cmd,external_header_path);
            append_token(cmd,linker_options);
            append_token(cmd,external_lib_path);
            add_executable_name(cmd);
            append_token(cmd,c_file_name);
            append_token(cmd,external_c_files);
            append_token(cmd,external_c_plus_plus_files);
            append_token(cmd,external_object_files);
            append_token(cmd,external_lib);
            add_lib_math;
         elseif c_compiler = cl then
            cmd.append(cl);
            append_token(cmd,c_compiler_options);
            append_token(cmd,external_header_path);
            add_executable_name(cmd);
            append_token(cmd,c_file_name);
            append_token(cmd,external_c_files);
            append_token(cmd,external_c_plus_plus_files);
            append_token(cmd,external_object_files);
            append_token(cmd,once " /link");
            append_token(cmd,linker_options);
            append_token(cmd,external_lib_path);
            append_token(cmd,external_lib);
            add_lib_math;
         elseif c_compiler = sas_c then
            cmd.append(sas_c);
            append_token(cmd,sas_c_compiler_options(false));
            append_token(cmd,c_compiler_options);
            append_token(cmd,external_header_path);
            append_token(cmd,linker_options);
            append_token(cmd,external_lib_path);
            append_token(cmd,c_file_name);
            append_token(cmd,external_c_files);
            append_token(cmd,external_c_plus_plus_files);
            append_token(cmd,external_object_files);
            append_token(cmd,external_lib);
            add_lib_math;
            add_executable_name(cmd);
         elseif c_compiler = dice then
            cmd.append(dcc);
            append_token(cmd,c_compiler_options);
            append_token(cmd,external_header_path);
            append_token(cmd,linker_options);
            append_token(cmd,external_lib_path);
            add_executable_name(cmd);
            append_token(cmd,c_file_name);
            append_token(cmd,external_c_files);
            append_token(cmd,external_c_plus_plus_files);
            append_token(cmd,external_object_files);
            append_token(cmd,external_lib);
            add_lib_math;
            if no_strip then
               append_token(cmd,once "-s");
            end;
         elseif c_compiler = vbcc then
            cmd.append(vc);
            append_token(cmd,c_compiler_options);
            append_token(cmd,external_header_path);
            append_token(cmd,linker_options);
            append_token(cmd,external_lib_path);
            add_executable_name(cmd);
            add_lib_math;
            append_token(cmd,c_file_name);
            append_token(cmd,external_c_files);
            append_token(cmd,external_c_plus_plus_files);
            append_token(cmd,external_object_files);
            append_token(cmd,external_lib);
         elseif c_compiler = ccc then
            cmd.append(ccc);
            append_token(cmd,c_compiler_options);
            append_token(cmd,external_header_path);
            append_token(cmd,linker_options);
            append_token(cmd,external_lib_path);
            add_executable_name(cmd);
            append_token(cmd,c_file_name);
            append_token(cmd,external_c_files);
            append_token(cmd,external_c_plus_plus_files);
            append_token(cmd,external_object_files);
            append_token(cmd,external_lib);
         elseif c_compiler = vpcc then
            cmd.append(vpcc);
            append_token(cmd,c_compiler_options);
            append_token(cmd,external_header_path);
            append_token(cmd,linker_options);
            append_token(cmd,external_lib_path);
            add_executable_name(cmd);
            append_token(cmd,c_file_name);
            append_token(cmd,external_c_files);
            append_token(cmd,external_c_plus_plus_files);
            append_token(cmd,external_object_files);
            append_token(cmd,external_lib);
         elseif c_compiler = open_vms_cc then
            cmd.append(once "cc/warning=disable=(embedcomment,longextern) ");
            cmd.append(c_file_name);
            cmd.remove_last(2);
            cmd.append(once "%Nlink/exe=");
            add_executable_name(cmd);
            cmd.extend(' ');
            cmd.append(c_file_name);
            cmd.remove_last(2);
         end;
      end;

feature {NONE} -- SAS/c support functions:

   Scoptions_exists: BOOLEAN is
         -- Is there a file "SCOPTIONS" in the current directory?
      once
         Result := file_tools.is_readable(once "SCOPTIONS")
      end;

   sas_c_compiler_options(split: BOOLEAN): STRING is
         -- C compiler options or "" if no SCOPTIONS exists.
         -- If `split' is True, "Data=Far" is used, otherwise
         -- "Data=Auto".
      do
         if Scoptions_exists then
            Result := ""
         else
            !!Result.make(0)
            Result.append(once "Math=IEEE Parameters=Both Code=Far");
            -- cause bloat, but avoid linker errors
            if split then
               Result.append(once " Data=Far");
            else
               Result.append(once " Data=Auto");
            end
            Result.append(once " Ignore=93,194,304");
            -- ignore the following warnings:
            --  93: no reference to identifier X
            -- 194: too much local data for NEAR reference,
            --      some changed to FAR (only with Data=Auto)
            -- 304: dead assignment eliminated
            Result.append(once " NoVersion NoIcons");
            -- avoid cluttering the display with messages and
            -- the current directory with icon files
         end
      end;

feature {ACE}

   read_loadpath_files is
         -- For command line mode only (no ACE file used). Read the good
         -- old "loadpath.se" file as well as the "loadpath.<system>" file
         -- to drive class file searching while in plain command line mode.
      require
         ace.file_path = Void
      do
         loadpath_read(fz_loadpath_se,1);
         tmp_path.copy(sys_directory);
         tmp_path.append(once "loadpath.");
         tmp_path.append(system_name);
         loadpath_read(tmp_path,1);
      end;

   system_name_in(msg: STRING) is
         -- Append in `msg' the current `system_name'.
      do
         if system_name /= Void then
            msg.append(once "The selected system name is %"");
            msg.append(system_name);
            msg.append(fz_b0);
         else
            msg.append(once "No information available about the system used %
                       %(check your%NSmallEiffel installation).%N");
         end;
      end;

   set_external_header_path(a_paths: STRING) is
         -- Set `external_header_path' to `a_paths', but format it according to rules
         -- for current C compiler.
      local
         paths: ARRAY[STRING]; i: INTEGER;
      do
         paths := a_paths.split;
         from
            i := paths.lower;
         until
            i > paths.upper
         loop
            add_external_header_path(paths.item(i));
            i := i + 1;
         end
      end

   set_external_lib_path(a_paths: STRING) is
         -- Set `external_lib_path' to `a_paths', but format it according to rules for
         -- current C compiler and linker.
      local
         lib_paths: ARRAY[STRING]; i: INTEGER;
      do
         lib_paths := a_paths.split;
         from
            i := lib_paths.lower;
         until
            i > lib_paths.upper
         loop
            add_external_lib_path(lib_paths.item(i));
            i := i + 1;
         end
      end

   set_external_lib(a_libs: STRING) is
         -- Set `external_lib' to `a_libs', but format it according to rules for
         -- current C compiler and linker.
      local
         lib_files: ARRAY[STRING]; i: INTEGER;
      do
         lib_files := a_libs.split;
         from
            i := lib_files.lower;
         until
            i > lib_files.upper
         loop
            add_external_lib(lib_files.item(i));
            i := i + 1;
         end
      end

   external_object_files: STRING is "";
         -- External object files.

   external_c_files: STRING is "";
         -- External C files.

   linker_options: STRING is "";
         -- Those options are only to be passed to the linker.

   external_c_plus_plus_files: STRING is "";
         -- External C++ files.

   no_strip: BOOLEAN;

feature {ECHO}

   parent_directory(some_path: STRING) is
         -- Use the `system_name' knowledge to call feature `compute_parent_directory_of'
         -- of BASIC_DIRECTORY. The `some_path' is modified accordingly.
      require
         some_path.count > 0
      do
         set_basic_directory_notation;
         basic_directory.compute_parent_directory_of(some_path);
         some_path.copy(basic_directory.last_entry);
      end;

feature {CLUSTER}

   cluster_path(directory_path: STRING) is
      require
         directory_path /= Void
      local
         s: STRING;
      do
         s := system_name;
         check
            s /= Void
         end;
         if s = unix_system then
            directory_path.replace_all('\','/');
         elseif s = windows_system or else s = dos_system or else s = os2_system
          then
            directory_path.replace_all('/','\');
         else
            -- Do nothing for other operating systems :-(
         end;
      end;

feature {NONE}

   basic_directory: BASIC_DIRECTORY;

   set_basic_directory_notation is
      local
         s: STRING; letter_code: CHARACTER;
      once
         s := system_name;
         if s = Void then
         elseif s = unix_system then
            letter_code := 'U';
         elseif s = windows_system or else s = dos_system or else s = os2_system then
            letter_code := 'W';
         elseif s = beos_system then
            letter_code := 'U';
         elseif s = macintosh_system then
            letter_code := 'M';
         elseif s = amiga_system then
            letter_code := 'A';
         elseif s = open_vms_system then
            letter_code := 'V';
         elseif s = cygwin_system then
            letter_code := 'C';
         elseif s = elate_system then
            letter_code := 'U';
         else
            check false end;
         end;
         if s /= Void then
            basic_directory.notation.put(letter_code,1);
         end;
      end;

   c_compiler: STRING;
         -- One item of `compiler_list'.

   subdirectory(parent_path, entry_name: STRING) is
         -- Use the `system_name' knowledge to call feature `compute_subdirectory_with'
         -- of BASIC_DIRECTORY. The `parent_path' is modified accordingly.
      require
         not parent_path.is_empty;
         not entry_name.is_empty
      do
         set_basic_directory_notation;
         basic_directory.compute_subdirectory_with(parent_path,entry_name);
         parent_path.copy(basic_directory.last_entry);
      end;

   append_token(line, token: STRING) is
      do
         if not token.is_empty then
            if token.first /= ' ' then
               if not line.is_empty then
                  line.extend_unless(' ');
               end;
            end;
            line.append(token);
         end;
      end;

   loadpath_read(path: STRING; level: INTEGER) is
      local
         file: TEXT_FILE_READ;
         buffer: STRING;
      do
         if level > 5 or else ace.cluster_count > 1024 then
            echo.w_put_string(
               "Eiffel source loading path too long or infinite %
               %loadpath.se includes.%N");
            !!buffer.make(5000);
            ace.view_in(buffer);
            echo.w_put_string(buffer);
            die_with_code(exit_failure_code);
         end;
         !!file.make;
         echo.tfr_connect(file,path);
         if file.is_connected then
            from
               echo.put_string(once "Append contents of  %"");
               echo.put_string(path);
               echo.put_string(once "%" to loading path.%N");
            until
               file.end_of_input
            loop
               file.read_line;
               buffer := file.last_string.twin;
               environment_variable_substitution(path,buffer);
               if buffer.has_suffix(fz_loadpath_se) then
                  loadpath_read(buffer,level + 1);
               elseif buffer.is_empty then
                  if not file.end_of_input then
                     ace.cluster_add_last(buffer);
                  end;
               else
                  ace.cluster_add_last(buffer);
               end;
            end;
            file.disconnect;
         end;
      end;

   external_c_files_for_lcc_win32(cmd: STRING) is
         -- Because lcc_win32 does not accept *.c file while linking as
         -- other C compiler do :-(
      local
         c_files: ARRAY[STRING]; c_file: STRING; i: INTEGER;
      do
         if not external_c_files.is_empty then
            c_files := external_c_files.split;
            external_c_files.clear;
            if c_files /= Void then
               from
                  i := c_files.lower;
               until
                  i > c_files.upper
               loop
                  c_file := c_files.item(i);
                  cmd.append(lcc);
                  append_token(cmd,c_compiler_options);
                  append_token(cmd,c_file);
                  cmd.extend('%N');
                  c_file.remove_suffix(c_suffix);
                  c_file.append(object_suffix);
                  append_token(external_object_files,c_file);
                  i := i + 1;
               end;
            end;
         end;
      end;

feature {ID_PROVIDER}

   id_file_path: STRING is
      once
         Result := path_h;
         Result.remove_suffix(h_suffix);
         Result.append(once ".id");
      end;

feature {NONE}

   external_header_path: STRING is "";
         -- Additional paths where .h files can be found.

   external_lib_path: STRING is "";
         -- External libraries path to be added at link time.

   external_lib: STRING is "";
         -- External libraries to be added at link time.

   do_add_external_lib(a_lib: STRING) is
         -- Low level function which appends a library to
         -- `external_lib' if it is not already in
         -- `external_lib'. `a_lib' should be formatted for the
         -- current linker.
      do
         if not external_lib.has_substring(a_lib) then
            append_token(external_lib,a_lib);
         end;
      end

   sys_runtime_(name: STRING; suffix: CHARACTER) is
         -- Common part to implement `sys_runtime' and `mandatory_sys_runtime'.
      require
         name /= Void;
         suffix = 'c' or suffix = 'h'
      do
         tmp_path.copy(sys_directory);
         subdirectory(tmp_path,fz_runtime);
         tmp_path.append(name);
         tmp_path.extend('.');
         tmp_path.extend(suffix);
      end;

   environment_variable_substitution(path, line: STRING) is
         -- If any, substitute some environment variable by it's value.
         -- The only one accepted notation is :
         --                                        ${...}
      local
         i, state, mem1, mem2: INTEGER;
         c: CHARACTER;
         value, variable: STRING;
      do
         from
            i := 1;
         until
            i > line.count
         loop
            c := line.item(i);
            inspect
               state
            when 0 then -- Initial state.
               if c = '$' then
                  state := 1;
                  mem1 := i;
               end;
            when 1 then -- "$" read.
               if c = '{' then
                  state := 2;
                  !!variable.make(8);
               else
                  state := 0;
               end;
            when 2 then -- "${" read.
               if c = '}' then
                  state := 3;
                  mem2 := i;
               else
                  variable.extend(c);
               end;
            else -- First correct variable found.
            end;
            i := i + 1;
         end;
         if state = 3 then
            value := echo.getenv(variable,path);
            if value /= Void then
               variable.copy(line);
               line.keep_head(mem1 - 1);
               line.append(value);
               variable.remove_first(mem2);
               line.append(variable);
               environment_variable_substitution(path,line)
            end;
         end;
      end;

   show_compiler_list_then_exit is
      local
         i: INTEGER;
      do
         echo.w_put_string(once "Currently handled compiler names:%N");
         from
            i := 1;
         until
            i > compiler_list.upper
         loop
            echo.w_put_string(compiler_list.item(i));
            echo.w_put_character('%N');
            i := i + 1;
         end;
         die_with_code(exit_failure_code);
      end;

   add_executable_name(cmd: STRING) is
      local
         executable_name: STRING;
      do
         executable_name := ace.executable_name;
         if executable_name = Void then
            executable_name := ace.root_class_name.twin;
            executable_name.to_lower;
            if c_compiler = lcc_win32 then
               append_token(cmd,o_flag);
               append_token(cmd,executable_name);
               add_x_suffix(cmd);
            elseif c_compiler = bcc32 then
               append_token(cmd,e_flag);
               cmd.append(executable_name);
               add_x_suffix(cmd);
            elseif c_compiler = wcl386 then
               append_token(cmd,o_flag);
               cmd.append(executable_name);
               add_x_suffix(cmd);
            elseif c_compiler = sas_c then
               executable_name := ace.root_class_name.twin;
               executable_name.to_lower;
               cmd.append(fz_to_);
               cmd.append(executable_name);
            elseif c_compiler = dice then
               append_token(cmd,o_flag);
               cmd.append(executable_name);
            elseif c_compiler = vbcc then
               append_token(cmd,o_flag);
               cmd.append(executable_name);
            elseif c_compiler = vpcc then
               append_token(cmd,o_flag);
               cmd.append(executable_name);
            elseif c_compiler = open_vms_cc then
               cmd.append(executable_name);
            end;
         elseif c_compiler = gcc then
            append_token(cmd,o_flag);
            append_token(cmd,executable_name);
            add_x_suffix(cmd);
         elseif c_compiler = lcc_win32 then
            append_token(cmd,o_flag);
            append_token(cmd,executable_name);
            add_x_suffix(cmd);
         elseif c_compiler = cc then
            append_token(cmd,o_flag);
            append_token(cmd,executable_name);
            add_x_suffix(cmd);
         elseif c_compiler = wcl386 then
            append_token(cmd,o_flag);
            append_token(cmd,executable_name);
            add_x_suffix(cmd);
         elseif c_compiler = bcc32 then
            append_token(cmd,e_flag);
            cmd.append(executable_name);
            add_x_suffix(cmd);
         elseif c_compiler = cl then
            append_token(cmd,o_flag);
            cmd.append(executable_name);
            add_x_suffix(cmd);
         elseif c_compiler = sas_c then
            cmd.append(fz_to_);
            append_token(cmd,executable_name);
         elseif c_compiler = dice then
            append_token(cmd,o_flag);
            append_token(cmd,executable_name);
            add_x_suffix(cmd);
         elseif c_compiler = vbcc then
            append_token(cmd,o_flag);
            append_token(cmd,executable_name);
            add_x_suffix(cmd);
         elseif c_compiler = ccc then
            append_token(cmd,o_flag);
            append_token(cmd,executable_name);
            add_x_suffix(cmd);
         elseif c_compiler = vpcc then
            append_token(cmd,o_flag);
            append_token(cmd,executable_name);
            add_x_suffix(cmd);
         elseif c_compiler = open_vms_cc then
            cmd.append(executable_name);
         end;
      end;

   add_objects(cmd, c_name: STRING; max: INTEGER) is
         -- Add objects files numbered from 1 to `max' included.
      local
         i: INTEGER; short_command: BOOLEAN;
      do
         if max.in_range(3,99) then
            if unix_system = system_name then
               short_command := true;
            elseif cygwin_system = system_name then
               short_command := true;
            end;
         end;
         if short_command then
            add_objects_(cmd,c_name,1,max);
         else
            from
               i := 1 until i > max
            loop
               append_token(cmd,c_name);
               i.append_in(cmd);
               cmd.append(object_suffix);
               i := i + 1;
            end;
         end;
      end;

   add_objects_(cmd, c_name: STRING; min, max: INTEGER) is
         -- This is a good recursive example ;-)
      require
         max.in_range(1,99);
         min.in_range(1,max + 1);
      local
         c, i1, i2, new_min: INTEGER;
      do
         if min > max then
            check min = max + 1 end;
         elseif min < 9 then
            append_token(cmd,c_name);
            cmd.append(once "[1-");
            i1 := (9).min(max);
            i1.append_in(cmd);
            cmd.extend(']');
            cmd.append(object_suffix);
            add_objects_(cmd,c_name,i1 + 1,max);
         elseif min = max then
            append_token(cmd,c_name);
            min.append_in(cmd);
            cmd.append(object_suffix);
         else
            check (min \\ 10) = 0 end;
            c := max - min + 1;
            check c >= 2 end;
            if c <= 10 then
               i1 := min // 10;
               i2 := max \\ 10;
               append_token(cmd,c_name);
               i1.append_in(cmd);
               cmd.extend('[');
               cmd.extend('0');
               cmd.extend('-');
               i2.append_in(cmd);
               cmd.extend(']');
               cmd.append(object_suffix);
            elseif c < 20 then
               add_objects_(cmd,c_name,min,min + 9);
               add_objects_(cmd,c_name,min + 10,max);
            else
               i1 := min // 10;
               i2 := (max - 9) // 10;
               check (i2 * 10) + 9 <= max end;
               append_token(cmd,c_name);
               cmd.extend('[');
               i1.append_in(cmd);
               cmd.extend('-');
               i2.append_in(cmd);
               cmd.append(once "][0-9]");
               cmd.append(object_suffix);
               new_min := (i2 * 10) + 10;
               add_objects_(cmd,c_name,new_min,max);
            end;
         end;
      ensure
         (min < max) implies (cmd.count > old cmd.count);
         c_name.is_equal(old c_name.twin);
         max = old max;
      end;

   add_external_header_path(path: STRING) is
         -- Append `path' to `external_header_path' taking into account
         -- how the current linker likes it to get this path.
         -- If `path' appears to be already formatted, no formatting is
         -- added by this routine.
      require
         not path.is_empty
      do
         token_buffer.clear
         -- everybody likes the Unix way
         if path.item (1) /= '-' then
            token_buffer.copy(once "-I");
         end
         token_buffer.append_string(path);
         token_buffer.extend_unless(' ');
         if not external_header_path.has_substring(token_buffer) then
            append_token(external_header_path,token_buffer);
         end;
      end;

   add_external_lib(lib: STRING) is
         -- Append `lib' to `external_lib' taking into account
         -- how the current linker likes it to get an additional library.
         -- If `lib' appears to be already formatted, no formatting is
         -- added by this routine.
      require
         not lib.is_empty
      do
         token_buffer.clear
         if c_compiler = lcc_win32 or else c_compiler = cl then
            -- they don't need an option
         else
            -- the Unix way
            if lib.item (1) /= '-' then
               token_buffer.copy(once "-l");
            end
         end
         token_buffer.append_string(lib);
         token_buffer.extend_unless(' ');
         do_add_external_lib(token_buffer);
      end;

   add_external_lib_path(path: STRING) is
         -- Append `path' to `external_lib_path' taking into account
         -- how the current linker likes it to get this path.
         -- If `path' appears to be already formatted, no formatting is
         -- added by this routine.
      require
         not path.is_empty
      do
         token_buffer.clear
         if c_compiler = lcc_win32 then
            -- lcc_win32 doesn't support paths
         elseif c_compiler = cl then
            -- Microsoft's own way of library searching
            if path.item (1) /= '/' then
               token_buffer.copy(once "/LIBPATH:");
            end
         else
            -- the Unix way
            if path.item (1) /= '-' then
               token_buffer.copy(l_flag);
            end
         end
         token_buffer.append_string(path);
         token_buffer.extend_unless(' ');
         if not external_lib_path.has_substring(token_buffer) then
            append_token(external_lib_path,token_buffer);
         end;
      end;

   token_buffer: STRING is
      once
         !!Result.make(128);
      end;

   exe_suffix: STRING is ".exe";

   o_suffix: STRING is ".o";

   obj_suffix: STRING is ".obj";

   c_flag: STRING is "-c";

   o_flag: STRING is "-o";

   e_flag: STRING is "-e";

   s_flag: STRING is "-s";

   lcc: STRING is "lcc";

   vc: STRING is "vc";

   dcc: STRING is "dcc";

   lcclnk: STRING is "lcclnk";

   lnk_suffix: STRING is ".lnk";

   libm: STRING is "m";

   l_flag: STRING is "-L";

   o2: STRING is "-O2";

   libcpml: STRING is "cpml";

   fz_to_: STRING is " To ";

   fz_loadpath_se: STRING is "loadpath.se";

   singleton_memory: SYSTEM_TOOLS is
      once
         Result := Current;
      end;

invariant

   is_real_singleton: Current = singleton_memory

end -- SYSTEM_TOOLS
