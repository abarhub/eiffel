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
class ACE
   --
   -- Assembly of Classes in Eiffel.
   --
   -- Singleton object in charge of parsing the *.ace file if any.
   -- This singleton is also in charge to memorize and to give access to the
   -- corresponding information (keep in mind that we can still use only
   -- command line arguments to launch the compiler).
   -- This singleton is shared via the GLOBALS.`ace' once function.
   --

inherit PARSER; ASSERTION_LEVEL_NUMBERING;

feature

   file_path: STRING;
         -- Non Void when a ACE file is in use (keep in mind that one can
         -- stil launch a compilation without any ACE file, passing all the
         -- information using command arguments only).
         -- Usually, ACE files are suffixed with ".ace" or ".ACE".

   executable_name: STRING;
         -- The name of the executable to build (after the "system" keyword
         -- in the ACE file or after the -o flag in the command line).
         -- In command line mode, a Void value means that "a.out" is to be
         -- used for C mode while using gcc for example. For the Java
         -- byte-code this name is used as the name of the main output class
         -- file and as the name of the directory used to store auxilliary
         -- class files.

   root_class_name: STRING;
         -- The name of the root class using only upper case letters. This
         -- is actually the generating type of the very first live object at
         -- runtime. This `root_class_name' is after the "root" keyword in the
         -- ACE file or is given as a command line argument.

   root_procedure_name: STRING is
         -- The name of the procedure which is actually the main program.
         -- This procedure is supposed to be member of the creation clause
         -- of `root_class_name'.
      local
         bc: BASE_CLASS; cn: CLASS_NAME;
      do
         if root_procedure_name_memory = Void then
            create cn.unknown_position(root_class_name);
            bc := small_eiffel.base_class(cn);
            root_procedure_name_memory := bc.default_root_procedure_name;
         end;
         Result := root_procedure_name_memory;
      end;

   boost: BOOLEAN is
      do
         Result := default_assertion_level = level_boost;
      end;

   no_check: BOOLEAN is
      do
         Result := default_assertion_level >= level_no;
      end;

   require_check: BOOLEAN is
      do
         Result := default_assertion_level >= level_require;
      end;

   invariant_check: BOOLEAN is
      do
         Result := default_assertion_level >= level_invariant;
      end;

   all_check: BOOLEAN is
      do
         Result := default_assertion_level >= level_all;
      end;

   no_main: BOOLEAN;
         -- Don't include a main() in the generated executable.

   manifest_string_trace: BOOLEAN;

feature {BASE_CLASS}

   trace_of(base_class: BASE_CLASS): BOOLEAN is
      local
         cluster: CLUSTER;
      do
         cluster := base_class.cluster;
         if cluster /= Void then
            Result := cluster.trace(base_class.name);
         else
            Result := default_trace;
         end;
         if Result then
            trace_support := true;
            if default_assertion_level = level_boost then
               default_assertion_level := level_no;
            end;
         end;
      end;

feature {COMPOUND}

   debug_check(e_debug: E_DEBUG): BOOLEAN is
         -- Is this `e_debug' statement is active or not?
         -- Note: during the execution of this routine, the
         -- `default_assertion_level' may be switch from `level_boost' to `level_no'.
      require
         e_debug /= Void
      local
         base_class: BASE_CLASS; cluster: CLUSTER;
      do
         base_class := e_debug.start_position.base_class;
         cluster := base_class.cluster;
         if cluster /= Void then
            Result := cluster.debug_check(base_class.name,e_debug);
         else
            Result := default_debug(e_debug);
         end;
         if Result then
            if default_assertion_level = level_boost then
               default_assertion_level := level_no;
            end;
         end;
      end;

feature {BASE_CLASS}

   assertion_level_of(base_class: BASE_CLASS): INTEGER is
      require
         avoid_recomputation: base_class.assertion_level = level_unknown
      local
         cluster: CLUSTER;
      do
         cluster := base_class.cluster;
         if cluster /= Void then
            Result := cluster.assertion_level_of(base_class.name);
         else
            Result := default_assertion_level;
         end;
      ensure
         Result.in_range(level_boost,level_debug)
      end;

feature {COMMAND_LINE_TOOLS}

   analyse_ace_file(fp: like file_path) is
         -- Parse `fp' which is supposed to be some file containing
         -- an ACE description.
      local
         echo_set_verbose_delayed: BOOLEAN;
      do
         if file_path /= Void then
            echo.w_put_string("Multiple ACE files in the command%
                              % line: %"");
            echo.w_put_string(file_path);
            echo.w_put_string("%" and %"");
            echo.w_put_string(fp);
            echo.w_put_string("%".%N");
            die_with_code(exit_failure_code);
         end;
         file_path := fp;
         parser_buffer.load_file(fp);
         if not parser_buffer.is_ready then
            eh.append("Cannot open %"");
            eh.append(fp);
            eh.append("%" file.%NACE file not found.");
            eh.print_as_fatal_error;
         end;
         echo.put_string("Parsing %"");
         echo.put_string(file_path);
         echo.put_string("%" ACE file.%N");
         line := 1;
         column := 1;
         current_line := parser_buffer.item(line);
         if current_line.count = 0 then
            cc := '%N';
         else
            cc := current_line.first;
         end;
         drop_comments := true;
         skip_comments;
         if not a_keyword(once "system") then
            eh.add_position(current_position);
            fatal_error("Keyword %"system%" expected. Invalid ACE file.");
         end;
         executable_name := a_name;
         if not a_keyword(once "root") then
            eh.add_position(current_position);
            fatal_error("Keyword %"root%" expected. Invalid ACE file.");
         end;
         root_class_name := a_name;
         a_cluster_mark;
         if skip1(':') then
            root_procedure_name_memory := a_name;
         end;
         if a_keyword(fz_default) then
            echo_set_verbose_delayed := a_system_level_defaults;
         end;
         if a_clusters then end;
         if a_keyword(fz_external) then
            a_external;
         end;
         if a_keyword(fz_generate) then
            a_generate;
         end;
         if a_keyword(fz_end) then end;
         if cc /= end_of_text then
            eh.add_position(current_position);
            fatal_error("End of text expected (invalid ACE file).");
         end;
         parser_buffer.release;
         get_started;
         if echo_set_verbose_delayed then
            echo.set_verbose;
         end;
      ensure
         file_path = fp;
         default_assertion_level /= level_unknown
      end;

feature {COMMAND_LINE_TOOLS,SYSTEM_TOOLS}

   set_root_class_name_using(command_line_name: STRING) is
         -- Compute the `root_class_name' name using the `command_line_name'
         -- as a model.
         -- Trailing Eiffel file suffix is removed if any.
         -- Leading path is also removed if any.
         -- Finally, the feature `to_upper' is applied.
      require
         not command_line_name.is_empty
      do
         compute_class_name_buffer_using(command_line_name);
         root_class_name := class_name_buffer.twin;
         root_class_name := string_aliaser.item(root_class_name);
      ensure
         root_class_name /= command_line_name;
         root_class_name = string_aliaser.item(root_class_name);
         not root_class_name.has_suffix(eiffel_suffix)
      end;

feature {COMPILE}

   clean: BOOLEAN;
         -- Should the clean command to be launched after compilation?

feature {COMPILE_TO_JVM,SYSTEM_TOOLS}

   set_root_procedure_name(rp: STRING) is
      do
         root_procedure_name_memory := rp;
      ensure
         root_procedure_name = rp
      end;

feature {COMMAND_LINE_TOOLS}

   set_boost is
      do
         default_assertion_level := level_boost;
      end;

   set_no_check is
      do
         default_assertion_level := level_no;
      end;

   set_require_check is
      do
         default_assertion_level := level_require;
      end;

   set_ensure_check is
      do
         default_assertion_level := level_ensure;
      end;

   set_invariant_check is
      do
         default_assertion_level := level_invariant;
      end;

   set_loop_check is
      do
         default_assertion_level := level_loop;
      end;

   set_all_check is
      do
         default_assertion_level := level_all;
      end;

   set_debug_check is
      do
         default_assertion_level := level_debug;
         default_debug_key := fz_yes;
      end;

   command_line_parsed(command_name: STRING) is
         -- Should be called the end of command line argument parsing
         -- (i.e. only in command line mode) to check among other things
         -- that the root class was actually given as argument.
      require
         file_path = Void
      do
         if root_class_name = Void then
            echo.w_put_string(command_name);
            echo.w_put_string(": error: No <Root-Class> in command line.%N");
            die_with_code(exit_failure_code);
         end;
         if trace_support and then boost then
            echo.w_put_string(command_name);
            echo.w_put_string(" : cannot use -trace with -boost flag.%N");
            die_with_code(exit_failure_code);
         end;
         system_tools.read_loadpath_files;
         get_started;
      ensure
         default_assertion_level /= level_unknown
      end;

   set_default_trace is
      do
         default_trace := true;
         trace_support := true;
      ensure
         default_trace = true;
         trace_support = true
      end;

   set_executable_name(name: STRING) is
      do
         executable_name := name;
      ensure
         executable_name = name
      end;

   set_clean(flag: BOOLEAN) is
      do
         clean := flag;
      end;

   set_manifest_string_trace is
      do
         manifest_string_trace := true;
      end;

feature {SMALL_EIFFEL}

   parser_buffer_for(name: STRING): BOOLEAN is
         -- The algorithm to search some class on the disk using the `name'
         -- key which is usually some simple class name using the standard
         -- notation, but which can also be any other kind of notation (even
         -- file path notation). When the `Result' is True, the `parser_buffer' is
         -- ready to be used. When no file can be found using `name' and the
         -- `cluster_list' information, a viewable information about this `cluster_list'
         -- is printed.
      require
         not parser_buffer.is_ready
      local
         i: INTEGER; cluster: CLUSTER; class_name: STRING;
      do
         from
            compute_class_name_buffer_using(name);
            class_name := string_aliaser.item(class_name_buffer);
            i := cluster_list.lower;
         until
            i > cluster_list.upper or else Result
         loop
            cluster := cluster_list.item(i);
            Result := cluster.parser_buffer_for(class_name);
            i := i + 1;
         end;
         if not Result and then file_path = Void then
            -- To handle old "rename.se" files.
            handle_rename_se_files;
            from
               i := cluster_list.lower;
            until
               i > cluster_list.upper or else Result
            loop
               cluster := cluster_list.item(i);
               Result := cluster.rename_se_parser_buffer_for(class_name);
               i := i + 1;
            end;
         end;
         if not Result then
            echo.w_put_string("Unable to find file for class %"");
            echo.w_put_string(name);
            echo.w_put_string("%". ");
            buffer.clear;
            view_in(buffer);
            echo.w_put_string(buffer);
         end;
      end;

   parse_include is
         -- Look for some class(es) to be loaded first because of
         -- some "include" option.
      local
         i: INTEGER;
      do
         if file_path /= Void then
            from
               i := cluster_list.lower;
            until
               i > cluster_list.upper
            loop
               cluster_list.item(i).include_parsing;
               i := i + 1;
            end;
         end;
      end;

feature {ACE_CHECK}

   pretty_in(txt: STRING) is
         -- Performs the `ace_check' and also prepare in `txt' a pretty version
         -- of the Ace file as it is memorized (can be also used to pretty
         -- one's ACE file).
      require
         file_path /= Void
      local
         i: INTEGER;
      do
         txt.append("system ");
         txt.append(executable_name);
         txt.append("%Nroot ");
         txt.append(root_class_name);
         txt.append(": %"");
         txt.append(root_procedure_name_memory);
         txt.append("%"%Ndefault%N   assertion (");
         txt.append(level_name(default_assertion_level));
         txt.append(")%N   debug (");
         txt.append(default_debug_key);
         txt.append(")%N");
         if default_trace then
            txt.append("   trace (yes)%N");
         else
            txt.append("   trace (no)%N");
         end;
         if gc_handler.is_off then
            txt.append("   collect (no)%N");
         else
            txt.append("   collect (yes)%N");
         end;
         if eiffel_parser.case_insensitive then
            txt.append("   case_insensitive (yes)%N");
         else
            txt.append("   case_insensitive (no)%N");
         end;
         if eiffel_parser.no_style_warning then
            txt.append("   no_style_warning (yes)%N");
         else
            txt.append("   no_style_warning (no)%N");
         end;
         if eh.no_warning then
            txt.append("   no_warning (yes)%N");
         else
            txt.append("   no_warning (no)%N");
         end;
         if echo.verbose then
            txt.append("   verbose (yes)%N");
         else
            txt.append("   verbose (no)%N");
         end;
         if manifest_string_trace then
            txt.append("   manifest_string_trace (yes)%N");
         else
            txt.append("   manifest_string_trace (no)%N");
         end;
         txt.append("cluster%N");
         from
            i := cluster_list.lower;
         until
            i > cluster_list.upper
         loop
            cluster_list.item(i).pretty_in(txt);
            i := i + 1;
         end;
         txt.append("external%N");
         if not system_tools.external_object_files.is_empty then
            txt.append("   external_object_files: %"");
            txt.append(system_tools.external_object_files);
            txt.append("%"%N");
         end;
         if not system_tools.external_c_files.is_empty then
            txt.append("   external_c_files: %"");
            txt.append(system_tools.external_c_files);
            txt.append("%"%N");
         end;
         if not system_tools.external_c_plus_plus_files.is_empty then
            txt.append("   external_c_plus_plus_files: %"");
            txt.append(system_tools.external_c_plus_plus_files);
            txt.append("%"%N");
         end;
         -- *** cecil_pool.pretty_ace_in(txt);
         -- *** to continue...
         txt.append("generate%N");
         if system_tools.no_strip then
            txt.append("   no_strip (yes)%N");
         else
            txt.append("   no_strip (no)%N");
         end;
         if no_split then
            txt.append("   no_split (yes)%N");
         else
            txt.append("   no_split (no)%N");
         end;
         if clean then
            txt.append("   clean (yes)%N");
         else
            txt.append("   clean (no)%N");
         end;
         -- *** to continue...
         txt.append("end%N");
      end;

feature {SYSTEM_TOOLS}

   view_in(msg: STRING) is
         -- Append in `msg' a viewable version of the `cluster_list' as well as
         -- some other informations to help the user to fix the problem.
      require
         msg /= Void
      local
         i, no: INTEGER;
         sed: STRING;
      do
         if small_eiffel.pretty_flag then
         elseif file_path = Void then
            msg.append(
         "%N%
         %You are in command line mode (i.e. no ACE file is used).%N%
         %The load path can be changed using a file called%N%
         %loadpath.se in the current working directory.%N%
         %Usually, this loadpath.se file is a simple list of directories.%N%
         %It is also possible to use system variables or include files. See%N%
         %the documentation for the finder command for more information.%N");
         else
            msg.append(
         "%N%
         %Eiffel class file searching is being done according to the ACE %
         %file %"");
            msg.append(file_path);
            msg.append("%".%N");
         end;
         if small_eiffel.pretty_flag then
            check cluster_list.count = 1 end;
            msg.append(
            "(Command pretty only looks in the current working directory.)%N");
         else
            msg.append("Files are being searched for in the following %
                       %list of clusters (");
            cluster_list.count.append_in(msg);
            msg.append(" items):%N");
            from
               i := cluster_list.lower;
            until
               i > cluster_list.upper
            loop
               no := no + 1;
               cluster_list.item(i).view_in(no,msg);
               i := i + 1;
            end;
            system_tools.system_name_in(msg);
            msg.append(
            "The value of the environment variable %"SmallEiffel%" is:%N%"");
            sed := echo.getenv(fz_smalleiffel,Void);
            if sed /= Void then
               msg.append(sed);
            end;
            msg.append("%".%N");
            if file_path /= Void then
               msg.append(
                  "Please, also note that you can use the %"ace_check%" command%N%
                  %to view all informations stored into your ACE file.%N");
            end;
         end;
      end;

   cluster_add_last(path: STRING) is
      require
         path /= Void
      local
         cluster: CLUSTER;
      do
         cluster := new_cluster(path);
      end;

   cluster_count: INTEGER is
      do
         Result := cluster_list.count;
      end;

feature {CLUSTER}

   default_trace: BOOLEAN;
         -- Code generated with the -trace flag mode and also the
         -- value of the `trace' tag of the "default" section in the
         -- ACE file.

   default_assertion_level: INTEGER;
         -- The default assertion level mangled using constants and tools
         -- from class ASSERTION_LEVEL_NUMBERING.
         -- This value memorize the command line flag such as (-boost,
         -- -no_check, -require_check, ...). When the ACE file is used,
         -- this value memorize the information after "assertion" tag
         -- of the default section.

   default_debug(e_debug: E_DEBUG): BOOLEAN is
      require
         e_debug /= Void
      do
         check default_debug_key /= Void end;
         if default_debug_key = fz_yes then
            Result := true;
         elseif default_debug_key = fz_no then
         else
            Result := e_debug.match_debug_key(default_debug_key);
         end;
      end;

   rename_se_clash(full_name: STRING): STRING is
         -- To handle old "rename.se" files.
      require
         file_path = Void
      local
         i: INTEGER;
      do
         from
            i := cluster_list.lower;
         until
            Result /= Void or else i > cluster_list.upper
         loop
            Result := cluster_list.item(i).rename_se_clash(full_name);
            i := i + 1;
         end;
      end;

feature {PRETTY}

   start_pretty_mode is
      do
         check
            file_path = Void;
            root_class_name = Void;
         end;
         set_debug_check;
         check
            cluster_list.is_empty
         end;
         cluster_add_last("");
      end;

feature {C_PRETTY_PRINTER, COMPILE_TO_C}

   no_split: BOOLEAN;
         -- True when the "-no_split" flag or equivalent is in use.

   trace_support: BOOLEAN;
         -- Is some support for run-time trace necessary?

   set_no_split(flag: BOOLEAN) is
      do
         no_split := flag;
      end;

   set_no_main is
      do
         no_main := true;
      ensure
         no_main
      end;

   wedit: BOOLEAN;
         -- When the code is generated for lcc/wedit (the -wedit flag).

   set_wedit(value: BOOLEAN) is
      do
         wedit := value;
      end;

feature {NONE}

   default_debug_key: STRING;
         -- To memorize some value after the "debug" keyword in the
         -- default section of the ACE file (see also `a_debug_key').

   a_name: STRING is
         -- Analyse what's called a Name (i.e. an Eiffel identifier or some
         -- manifest string). When the notation is like the one for manifest
         -- strings, only the content of the manifest string is returned.
         -- System environment variable are considered only inside
         -- manifest_strings.
      do
         Result := string_aliaser.item(a_cluster_path);
         check
            Result /= buffer
         end;
      ensure
         Result = string_aliaser.item(Result)
      end;


   a_cluster_path: STRING is
         -- Do the work of `a_name', but avoid the `string_aliaser' filter.
      local
         stop: BOOLEAN; p: POSITION; envar, value, cl: STRING; c, l: INTEGER;
      do
         buffer.clear;
         if skip1('%"') then
            from -- Manifest string notation:
               p := pos(start_line,start_column);
            until
               stop
            loop
               inspect
                  cc
               when '%"' then
                  stop := true;
               when end_of_text then
                  eh.add_position(p);
                  eh.append("Closing %" not found.");
                  eh.print_as_fatal_error;
               when '$' then
                  from
                     l := line; c := column; cl := current_line;
                     next_char;
                     if cc = '{' then
                        next_char;
                        !!envar.make(12);
                     else
                        buffer.extend('$');
                        line := l; column := c; current_line := cl;
                     end;
                  until
                     envar = Void
                  loop
                     inspect
                        cc
                     when '}' then
                        value := echo.getenv(envar,file_path);
                        if value /= Void then
                           buffer.append(value);
                        end;
                        envar := Void;
                     when end_of_text then
                        eh.add_position(p);
                        eh.append("Bad Environment variable.%N%
                                  %(Closing %"}%" not found.)");
                        eh.print_as_fatal_error;
                     else
                        envar.extend(cc);
                        next_char;
                     end;
                  end;
               else
                  buffer.extend(cc);
               end;
               next_char;
            end;
         else
            from -- Eiffel identifier or keyword notation:
            until
               stop
            loop
               inspect
                  cc
               when 'a'..'z', 'A'..'Z', '0'..'9', '_' then
                  buffer.extend(cc);
                  next_char;
               else
                  stop := true;
               end;
            end;
         end;
         if buffer.is_empty then
            fcp("Non empty name expected here.");
         end;
         skip_comments;
         Result := buffer;
      ensure
         Result = buffer;
         not buffer.is_empty
      end;

   a_cluster_mark is
      do
         -- At time beeing, this is just syntactic sugar because
         -- clusters are not handled :-(
         if skip1('(') then
            if a_name /= Void then end;
            if skip1(')') then end;
         end;
      end;

   a_system_level_defaults: BOOLEAN is
         -- The `Result' is used to delay the `echo.verbose' value setting
      local
         stop: BOOLEAN;
      do
         from until stop
         loop
            if cc = end_of_text then
               stop := true;
            elseif a_clusters then
               stop := true;
            elseif a_keyword(fz_external) then
               a_external;
               stop := true;
            elseif a_keyword(fz_generate) then
               a_generate;
               stop := true;
            elseif skip1(';') then
            elseif a_keyword(fz_assertion) then
               default_assertion_level := a_assertion_level;
            elseif a_keyword(fz_debug) then
               default_debug_key := a_debug_key;
            elseif a_keyword(once "collect") then
               if not a_yes_no_all then
                  gc_handler.no_gc;
               end;
            elseif a_keyword(fz_case_insensitive) then
               if a_yes_no_all then
                  eiffel_parser.set_case_insensitive;
               end;
            elseif a_keyword(fz_no_style_warning) then
               if a_yes_no_all then
                  eiffel_parser.set_no_style_warning;
               end;
            elseif a_keyword(fz_no_warning) then
               if a_yes_no_all then
                  eh.set_no_warning;
               end;
            elseif a_keyword(fz_trace) then
               if a_yes_no_all then
                  set_default_trace;
               end;
            elseif a_keyword(fz_verbose) then
               Result := a_yes_no_all;
            elseif a_keyword(fz_manifest_string_trace) then
               manifest_string_trace := a_yes_no_all;
            else
               stop := true;
            end;
         end;
      end;

   a_clusters: BOOLEAN is
         --++ clusters --> "cluster" { cluster_clause ";" ...}
      local
         stop: BOOLEAN;
      do
         if a_keyword(fz_cluster) then
            Result := true;
            from until stop
            loop
               if a_cluster_clause then
                  if skip1(';') then end;
                  if a_keyword(fz_end) then end;
               else
                  stop := true;
               end;
            end;
         end;
      end;

   a_cluster_clause: BOOLEAN is
         --++ cluster_clause --> [cluster_tag]
         --++                    directory_name
         --++                    cluster_properties
      local
         cluster_name: STRING;
         cluster: CLUSTER;
      do
         if cc = end_of_text then
         elseif a_keyword(fz_external) then
            a_external;
         elseif a_keyword(fz_generate) then
            a_generate;
         elseif cc = '%"' then
            Result := true;
            cluster := new_cluster(a_cluster_path);
            a_cluster_properties(cluster);
         elseif cc.is_letter then
            Result := true;
            cluster_name := a_name;
            if skip1(':') then
               if cc = '%"' then
                  cluster := new_cluster(a_cluster_path);
                  cluster.set_name(cluster_name);
               else
                  eh.add_position(current_position);
                  fatal_error("Cluster path expected after cluster name.");
               end;
            else
               cluster := new_cluster(cluster_name);
            end;
            a_cluster_properties(cluster);
         else
            fatal_error_in(fz_cluster);
         end;
      end;

   a_cluster_properties(cluster: CLUSTER) is
         --++ cluster_properties -->
         --++    [use]
         --++    [include]
         --++    [exclude]
         --++    [name_adaptation]
         --++    [default]
         --++    [options]
         --++    [visible]
      require
         cluster /= Void
      local
         stop: BOOLEAN;
      do
         if a_keyword(fz_use) then
            fcp("The %"use%" clause is not yet implemented.");
         end;
         if a_keyword(fz_include) then
            from until cc /= '%"'
            loop
               cluster.include_add_last(a_name);
               if skip1(';') then end;
            end;
         end;
         if a_keyword(fz_exclude) then
            from until cc /= '%"'
            loop
               cluster.exclude_add_last(a_name);
               if skip1(';') then end;
            end;
         end;
         if a_keyword(fz_adapt) then
            fcp("The %"adapt%" clause is not yet implemented.");
         end;
         if a_keyword(fz_default) then
            from until stop
            loop
               if a_keyword(fz_assertion) then
                  cluster.set_default_assertion_level(a_assertion_level);
               elseif a_keyword(fz_trace) then
                  cluster.set_default_trace(a_yes_no_all);
               elseif a_keyword(fz_debug) then
                  cluster.add_default_debug_key(a_debug_key);
               else
                  stop := true;
               end;
               if skip1(';') then end
            end;
         end;
         if a_keyword(fz_option) then
            from until not a_option_in_cluster_properties(cluster)
            loop
            end;
         end;
      end;

   a_option_in_cluster_properties(cluster: CLUSTER): BOOLEAN is
         -- Possible option after the keyword "option" in one
         -- `cluster' description.
      require
         cluster /= Void
      local
         level: INTEGER;
         class_name: CLASS_NAME;
         debug_key: STRING;
      do
         if a_keyword(fz_assertion) then
            Result := true;
            level := a_assertion_level;
            if not skip1(':') then
               wcp(em29);
            end;
            from
            until
               not a_class_name
            loop
               class_name := tmp_name.to_class_name;
               cluster.set_option_assertion_level(class_name,level);
               if skip1(',') then end;
            end;
         elseif a_keyword(fz_trace) then
            Result := true;
            if not skip1(':') then
               wcp(em29);
            end;
            from
            until
               not a_class_name
            loop
               class_name := tmp_name.to_class_name;
               cluster.add_option_trace(class_name);
               if skip1(',') then end;
            end;
         elseif a_keyword(fz_debug) then
            Result := true;
            debug_key := a_debug_key;
            if not skip1(':') then
               wcp(em29);
            end;
            from
            until
               not a_class_name
            loop
               class_name := tmp_name.to_class_name;
               cluster.add_option_debug_key(class_name,debug_key);
               if skip1(',') then end;
            end;
         end;
      end;

   a_class_name: BOOLEAN is
         -- A single class name strictly written using only uppercase letter
         -- in order to avoid any possible ambiguities. When the `Result' is
         -- true, the corresponding class name is stored as usual in the
         -- `tmp_name' buffer.
      do
         if cc.is_upper then
            from
               tmp_name.reset(pos(line,column));
               tmp_name.extend(cc);
            until
               Result
            loop
               next_char;
               inspect
                  cc
               when 'A'..'Z','0'..'9','_' then
                  tmp_name.extend(cc);
               else
                  Result := true;
               end;
            end;
            skip_comments;
         end;
      end;

   a_external is
      local
         stop: BOOLEAN;
      do
         from until stop
         loop
            if cc = end_of_text then
               stop := true;
            elseif a_keyword(fz_generate) then
               a_generate;
               stop := true;
            elseif skip1(';') then
            elseif a_keyword(once "external_c_files") then
               if skip1(':') then end;
               system_tools.external_c_files.copy(a_name);
	    elseif a_keyword(once "external_header_path") then
	       if skip1(':') then end;
	       system_tools.set_external_header_path(a_name);
            elseif a_keyword(once "external_c_plus_plus_files") then
               if skip1(':') then end;
               system_tools.external_c_plus_plus_files.copy(a_name);
            elseif a_keyword(once "external_object_files") then
               if skip1(':') then end;
               system_tools.external_object_files.copy(a_name);
            elseif a_keyword(fz_cecil) then
               cecil_pool.add_file(a_debug_key);
            elseif a_keyword(once "external_lib_path") then
               if skip1(':') then end;
               system_tools.set_external_lib_path(a_name);
            elseif a_keyword(once "external_lib") then
               if skip1(':') then end;
               system_tools.set_external_lib(a_name);
            else
               stop := true;
            end;
         end;
      end;

   a_generate is
      local
         stop, value: BOOLEAN;
      do
         from until stop
         loop
            if cc = end_of_text then
               stop := true;
            elseif skip1(';') then
            elseif a_keyword(fz_cc) then
               if skip1(':') then end;
               system_tools.set_c_compiler(a_name);
            elseif a_keyword(fz_gc_info) then
               if a_yes_no_all then
                  gc_handler.set_info_flag;
               end;
            elseif a_keyword(fz_no_strip) then
               if a_yes_no_all then
                  system_tools.set_no_strip;
               end;
            elseif a_keyword(fz_no_main) then
               if a_yes_no_all then
                  set_no_main;
               end;
            elseif a_keyword(fz_no_split) then
               set_no_split(a_yes_no_all);
            elseif a_keyword(fz_clean) then
               value := a_yes_no_all;
               -- Prority to the command line -clean flag:
               if not clean then
                  set_clean(value);
               end;
            elseif a_keyword(fz_wedit) then
               set_wedit(a_yes_no_all);
            elseif a_keyword(once "c_compiler_options") then
               if skip1(':') then end;
               system_tools.c_compiler_options.copy(a_name);
            elseif a_keyword(once "linker_options") then
               if skip1(':') then end;
               system_tools.linker_options.copy(a_name);
            else
               stop := true;
            end;
         end;
      end;

   a_yes_no_all: BOOLEAN is
         -- Return true for a notation like "(yes)" or for a notation
         -- like "(all)". Return false for a notation like "(no").
      do
         if not skip1('(') then
            wcp(em27);
         end;
         if a_keyword(fz_no) then
         elseif (a_keyword(fz_all)
                 or else
                 a_keyword(fz_yes))
          then
            Result := true;
         else
            fcp("At this point in the ACE file, you are supposed to %
                %say %"yes%", %"no%", or %"all%".");
         end;
         if not skip1(')') then
            wcp(em28);
         end;
      end;

   a_assertion_level: INTEGER is
      do
         if not skip1('(') then
            wcp(em27);
         end;
         if a_keyword(fz_boost) then
            Result := level_boost;
         elseif a_keyword(fz_no) then
            Result := level_no;
         elseif a_keyword(fz_require) then
            Result := level_require;
         elseif a_keyword(fz_ensure) then
            Result := level_ensure;
         elseif a_keyword(fz_invariant) then
            Result := level_invariant;
         elseif a_keyword(fz_loop) then
            Result := level_loop;
         elseif a_keyword(fz_check)
            or else a_keyword(fz_all)
            or else a_keyword(fz_yes)
          then
            Result := level_all;
         elseif a_keyword(fz_debug) then
            Result := level_debug;
         else
            eh.add_position(current_position);
            eh.append("Unknown assertion level tag.");
            eh.print_as_error;
            eh.append(
            "You have to fix the problem in your ACE file. Valid %
            %assertion level tags are: %"no%", %"require%", %"ensure%",%
            % %"invariant%", %"loop%", %"check%", %"all%", and %"debug%".");
            eh.print_as_fatal_error;
         end;
         if not skip1(')') then
            wcp(em28);
         end;
      ensure
         Result.in_range(level_boost,level_debug)
      end;

   a_debug_key: STRING is
         -- Return some acceptable notation for a debug key: "yes",
         -- "no" or some user defined key.
      do
         if not skip1('(') then
            wcp(em27);
         end;
         if a_keyword(fz_no) then
            Result := fz_no;
         elseif (a_keyword(fz_yes) or else a_keyword(fz_all)) then
            Result := fz_yes;
         else
            Result := a_name
         end;
         if not skip1(')') then
            wcp(em28);
         end;
      end;

   pos(l, c: INTEGER): POSITION is
      do
         Result.ace_file(l,c);
      end;

   buffer: STRING is
      once
         !!Result.make(256);
      end;

   cluster_list: FIXED_ARRAY[CLUSTER] is
      once
         !!Result.with_capacity(64);
      end;

   root_procedure_name_memory: STRING;

   class_name_buffer: STRING is
         -- Temporary buffer to store some class name like eg. "ARRAY".
      once
         !!Result.make(64);
      end;

   compute_class_name_buffer_using(name: STRING) is
         -- Compute some Eiffel class name in the `class_name_buffer' using the
         -- `name' information which can be some complete file path notation
         -- with some Eiffel file suffix. The result, stored in the
         -- `class_name_buffer' is written using the standard Eiffel notation for
         -- class names (upper case letters only).
      require
         not name.is_empty
      local
         i: INTEGER; c: CHARACTER;
      do
         class_name_buffer.copy(name);
         -- Removes the ".e" or the ".E" suffix if any:
         i := class_name_buffer.count;
         if i > 2 then
            if class_name_buffer.item(i - 1) = '.' then
               if class_name_buffer.item(i).same_as('e') then
                  class_name_buffer.remove_last(2);
               end;
            end;
         end;
         from
            i := class_name_buffer.count;
         until
            i = 0
         loop
            c := class_name_buffer.item(i);
            if c.is_letter then
               i := i - 1;
            elseif c = '_' then
               i := i - 1;
            elseif c.is_digit then
               i := i - 1;
            else
               class_name_buffer.remove_first(i);
               i := 0;
            end;
         end;
         class_name_buffer.to_upper;
      end;

   new_cluster(path: STRING): CLUSTER is
      require
         path /= Void
      do
         create Result.compute_directory_path_using(path);
         cluster_list.add_last(Result);
      end;

   get_started is
         -- Should be called to set some default values at the end of
         -- command line parsing or at the end of the ACE file parsing.
      local
         i: INTEGER;
      do
         if default_assertion_level = level_unknown then
            default_assertion_level := level_all;
         end;
         if default_debug_key = Void then
            default_debug_key := fz_no;
         end;
         from
            i := cluster_list.upper;
         until
            i < cluster_list.lower
         loop
            cluster_list.item(i).get_started;
            i := i - 1;
         end;
      end;

   fatal_error_in(section_name: STRING) is
      do
         eh.add_position(current_position);
         eh.append("Error in the %"");
         eh.append(section_name);
         fatal_error("%" section.");
      end;

   handle_rename_se_files is
      -- To handle old "rename.se" files.
      require
         file_path = Void
      local
         i: INTEGER;
      do
         if not handle_rename_se_files_flag then
            handle_rename_se_files_flag := true;
            from
               i := cluster_list.lower;
            until
               i > cluster_list.upper
            loop
               cluster_list.item(i).rename_se_read;
               i := i + 1;
            end;
         end;
      end;

   handle_rename_se_files_flag: BOOLEAN;
      -- To handle old "rename.se" files.

   singleton_memory: ACE is
      once
         Result := Current;
      end;

invariant

   is_real_singleton: Current = singleton_memory

end -- ACE
