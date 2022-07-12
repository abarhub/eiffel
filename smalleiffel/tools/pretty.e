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
class PRETTY
   --
   -- The `pretty' command.
   --

inherit COMMAND_LINE_TOOLS;

creation make

feature

   command_name: STRING is "pretty";

   command_line_help_summary: STRING is
      "Usage: pretty [options] <ClassNames> ...%N%
      %%N%
      %Option summary:%N%
      %%N%
      %Information:%N%
      %  -help               Display this help information%N%
      %  -version            Display SmallEiffel version information%N%
      %  -verbose            Display detailed information about what the%N%
      %                       program is doing%N%
      %%N%
      %Style (default is -default):%N%
      %  -zen                Print as little as possible (%"Current%" only when necessary,%N%
      %                       no end comments, compact printing)%N%
      %  -default            Print using the default style options%N%
      %  -end                Include end comments (implies -default)%N%
      %  -parano             Print as much as possible (implies -end)%N";

feature {NONE}

   make is
      do
         small_eiffel.set_pretty_flag;
         if argument_count < 1 then
            system_tools.bad_use_exit(Current);
         else
            automat;
         end;
      end;

   state: INTEGER;
	 -- Of the automata in charge of argument parsing.
         -- 0: nothing done.
         -- 1: end.
         -- 2: error.

   style: STRING;
	 -- The selected one among: -default -zen -end -parano

   class_names: FIXED_ARRAY[STRING] is
      once
         !!Result.with_capacity(12);
      end;

   automat is
      local
         i: INTEGER; arg: STRING;
      do
         from
            i := 1;
         until
            i > argument_count or else state > 0
         loop
            arg := argument(i);
	    if is_some_flag(arg) then
	       if is_no_style_warning_flag(arg) then
	       elseif is_no_warning_flag(arg) then
	       elseif is_version_flag(arg) then
	       elseif is_help_flag(arg) then
	       elseif ("-default").is_equal(arg) then
		  if style /= Void then
		     error_style(arg);
		  else
		     fmt.set_default;
		     style := arg;
		  end;
	       elseif ("-zen").is_equal(arg) then
		  if style /= Void then
		     error_style(arg);
		  else
		     fmt.set_zen;
		     style := arg;
		  end;
	       elseif ("-end").is_equal(arg) then
		  if style /= Void then
		     error_style(arg);
		  else
		     fmt.set_end;
		     style := arg;
		  end;
	       elseif ("-parano").is_equal(arg) then
		  if style /= Void then
		     error_style(arg);
		  else
		     fmt.set_parano;
		     style := arg;
		  end;
	       else
		  echo.w_put_string("Unknown flag: ");
		  echo.w_put_string(arg);
		  echo.w_put_character('%N');
		  state := 2;
	       end;
	    else
               class_names.add_last(arg);
            end;
	    i := i + 1;
         end;
         if nb_errors > 0 then
            eh.append("No pretty printing done.");
            eh.print_as_error;
         else
            if class_names.is_empty then
               eh.append("No class to pretty print.");
               eh.print_as_error;
            else
	       ace.start_pretty_mode;
	       from
		  i := class_names.lower;
	       until
		  i > class_names.upper
	       loop
		  pretty_for(class_names.item(i));
		  i := i + 1;
	       end;
            end;
         end;
      end;

   error_style(style2: STRING) is
      do
         state := 2;
         eh.append("pretty: format style is already set to ");
         eh.append(style);
         eh.append(". Bad flag ");
         eh.append(style2);
         eh.append(fz_dot_blank);
         eh.print_as_error;
      end;

   pretty_for(name: STRING) is
      require
         name /= Void
      local
         root_class: STRING; bc: BASE_CLASS; cn: CLASS_NAME;
      do
         ace.set_root_class_name_using(name);
         root_class := ace.root_class_name;
	 create cn.unknown_position(root_class);
         bc := small_eiffel.base_class(cn);
         if bc = Void then
            eh.append("No pretty printing done for %"");
            eh.append(name);
            fatal_error("%".");
         else
            path.copy(bc.path);
            backup.copy(path);
            backup.remove_suffix(eiffel_suffix);
            backup.append(backup_suffix);
            if file_exists(backup) then
               eh.append("Security backup file %"");
               eh.append(backup);
               fatal_error("%" already exists. Remove this file first and %
			     %then run pretty again.");
            end;
            rename_file(path,backup);
            if not file_exists(backup) then
               eh.append("Cannot rename %"");
               eh.append(path);
               fatal_error("%".");
            end;
            echo.tfw_connect(new_file,path);
            fmt.connect_to(new_file);
            bc.pretty_print;
            new_file.disconnect;
            if not small_eiffel.re_load_class(bc) then
               eh.append("Error during `pretty' printing.%N%
                         %Cannot parse output of pretty.%N%
                         %Backup file %"");
               eh.append(backup);
               fatal_error("%" not removed.");
            end;
         end;
      end;

   path: STRING is
      once
         !!Result.make(256);
      end;

   backup: STRING is
      once
         !!Result.make(256);
      end;

   new_file: TEXT_FILE_WRITE is
      once
         !!Result.make;
      end;

end -- PRETTY
