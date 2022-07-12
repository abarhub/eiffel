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
class SHORT
   --
   -- The `short' command.
   --

inherit COMMAND_LINE_TOOLS;

creation make

feature

   command_name: STRING is "short";

   command_line_help_summary: STRING is "[
      Usage: short [format] [options] <ClassName>
         or: short [format] [options] <ACEfileName>.ace <ClassName>

      Option summary:

      Information:
        -help               Display this help information
        -version            Display SmallEiffel version information
        -verbose            Display detailed information about what the
                             program is doing

      Warning levels:
        -case_insensitive   Make class and feature names case-insensitive
        -no_style_warning   Don't print warnings about style violations
        -no_warning         Don't print any warnings (implies -no_style_warning)

        -sort               Sort features alphabetically
        -short              Don't include inherited features

      Formatting (specify at most one; default is -plain):
        -plain, -pretty, -tex1, -tex2, -tex3, -html1, -html2
                            Specify the style of formatting (see short.txt)

      ]";

feature {NONE}

   format: STRING;
	 -- The selected format directory to find hooks files.

   parents: FIXED_ARRAY[BASE_CLASS] is
         -- From `ace..root_class' up to ANY included.
      once
         !!Result.with_capacity(4);
      end;

   run_class: RUN_CLASS;
	 -- The corresponding one of the class to short.

   run_feature_list: FIXED_ARRAY[RUN_FEATURE] is
	 -- To be printed by the short command.
      once
         !!Result.with_capacity(256);
      end;

   sort: BOOLEAN;
	 -- True if the -sort flag is used.

   is_sort_flag(flag: STRING): BOOLEAN is
      do
	 if (once "-sort").same_as(flag) then
	    Result := true;
	    sort := true;
	 end;
      end;

   short: BOOLEAN;

   make is
      local
         bc: BASE_CLASS; cn: CLASS_NAME; i: INTEGER; ccl: CREATION_CLAUSE_LIST;
      do
         small_eiffel.set_short_flag;
         if argument_count = 0 then
            fatal_bad_usage
         end;
	 if not ace_file_mode then
	    from
	       i := 1;
	    until
	       i > argument_count
	    loop
	       if is_valid_argument_for_ace_mode(argument(i)) then end;
	       i := i + 1;
	    end;
	    ace.command_line_parsed(command_name);
	 end;
	 if help_flag then
	    die_with_code(exit_success_code);
	 end;
	 if version_flag then
	    die_with_code(exit_success_code);
	 end;
	 if ace.root_class_name = Void then
	    fatal_bad_usage
	 end;
	 create cn.unknown_position(ace.root_class_name);
	 bc := small_eiffel.base_class(cn);
	 if small_eiffel.no_file_for(bc.name.to_string) then
	    -- *** I may consider here to add an extra comment to
	    -- warn the user on the fact that this class has no file
	    -- and that this file is magically handled by the
	    -- compiler.
	 end;
	 parents.add_last(bc);
	 if not short then
	    bc.up_to_any_in(parents);
	 end;
	 if format = Void then
	    format := once "plain";
	 end;
	 -- Prepare data:
	 compute_run_class(bc);
	 run_class.runnable_class_invariant;
	 -- Print the class interface:
	 short_print.start(format,bc,run_class);
	 ccl := bc.creation_clause_list;
	 if ccl = Void or else not ccl.short then
	    short_print.hook(once "hook102");
	 end;
	 compute_run_feature_list;
	 if sort then
	    short_print.hook_or(once "hook200",once "feature(s)%N");
	    sort_run_feature_list;
	    from
	       i := 0;
	    until
	       i > run_feature_list.upper
	    loop
	       short_print.a_run_feature(run_feature_list.item(i));
	       i := i + 1;
	    end;
	    short_print.hook(once "hook201");
	 end;
	 short_print.finish;
      end;

   is_short_flag(flag: STRING): BOOLEAN is
      do
	 if (once "-short").same_as(flag) then
	    Result := true;
	    short := true;
	 end;
      end;

   compute_run_class(bc: BASE_CLASS) is
      local
         fgl: FORMAL_GENERIC_LIST;
         bcn: STRING;
         sp: POSITION;
         t, ct: E_TYPE;
         gl: ARRAY[E_TYPE];
         i: INTEGER;
         fga: FORMAL_GENERIC_ARG;
      do
         bcn := bc.name.to_string;
         sp := bc.name.start_position;
         fgl := bc.formal_generic_list;
         if as_any = bcn then
            !TYPE_ANY!ct.make(sp);
         elseif as_native_array = bcn then
            !TYPE_CHARACTER!t.make(sp);
            !TYPE_NATIVE_ARRAY!ct.make(sp,t);
         elseif as_array = bcn then
            !TYPE_ANY!t.make(sp);
            !TYPE_ARRAY!ct.make(sp,t);
         elseif as_integer = bcn then
            !TYPE_INTEGER!ct.make(sp);
         elseif as_real = bcn then
            !TYPE_REAL!ct.make(sp);
         elseif as_double = bcn then
            !TYPE_DOUBLE!ct.make(sp);
         elseif as_character = bcn then
            !TYPE_CHARACTER!ct.make(sp);
         elseif as_boolean = bcn then
            !TYPE_BOOLEAN!ct.make(sp);
         elseif as_pointer = bcn then
            !TYPE_POINTER!ct.make(sp);
         elseif as_string = bcn then
            !TYPE_STRING!ct.make(sp);
         elseif fgl /= Void then
            from
               i := 1;
               !!gl.with_capacity(fgl.count,1);
            until
               i > fgl.count
            loop
               fga := fgl.item(i);
               if fga.constraint = Void then
                  !TYPE_ANY!t.make(sp);
               else
                  t := fga.constraint;
               end;
               gl.add_last(t);
               i := i + 1;
            end;
            !TYPE_GENERIC!ct.make(bc.name,gl);
         else
            !TYPE_CLASS!ct.make(bc.name);
         end;
         run_class := ct.run_class;
      end;

   compute_run_feature_list is
      local
         i: INTEGER;
         bc: BASE_CLASS;
         rc: RUN_CLASS;
         fcl: FEATURE_CLAUSE_LIST;
      do
         from
            i := parents.upper;
            rc := run_class;
         until
            i < 0
         loop
            bc := parents.item(i);
            fcl := bc.feature_clause_list;
            if fcl /= Void then
               fcl.for_short(bc.name,sort,run_feature_list,rc);
            end;
            i := i - 1;
         end;
      end;

   sort_run_feature_list is
      local
         min, max, buble: INTEGER;
         moved: BOOLEAN;
      do
         from
            max := run_feature_list.upper;
            min := 0;
            moved := true;
         until
            not moved
         loop
            moved := false;
            if max - min > 0 then
               from
                  buble := min + 1;
               until
                  buble > max
               loop
                  if gt(buble - 1,buble) then
                     run_feature_list.swap(buble - 1,buble);
                     moved := true;
                  end;
                  buble := buble + 1;
               end;
               max := max - 1;
            end;
            if moved and then max - min > 0 then
               from
                  moved := false;
                  buble := max - 1;
               until
                  buble < min
               loop
                  if gt(buble,buble + 1) then
                     run_feature_list.swap(buble,buble + 1);
                     moved := true;
                  end;
                  buble := buble - 1;
               end;
               min := min + 1;
            end;
         end;
      end;

   gt(i,j: INTEGER): BOOLEAN is
      local
         n1, n2: STRING;
      do
         n1 := run_feature_list.item(i).name.to_key;
         n2 := run_feature_list.item(j).name.to_key;
         Result :=  n1 > n2;
      end;

   fatal_bad_usage is
      do
         system_tools.bad_use_exit(Current);
      end;

   is_valid_argument_for_ace_mode(arg: STRING): BOOLEAN is
	 -- Because of style options, this function always returns True.
	 -- Futhermore, this function is used for non ACE mode too.
      do
	 Result := true;
	 if is_version_flag(arg) then
	 elseif is_help_flag(arg) then
	 elseif is_sort_flag(arg) then
	 elseif is_short_flag(arg) then
	 elseif is_case_insensitive_flag(arg) then
	 elseif is_no_warning_flag(arg) then
	 elseif is_no_style_warning_flag(arg) then
	 elseif arg.item(1) = '-' then
	    arg.remove_first(1);
	    format := arg;
	 else
	    if arg.has_suffix(eiffel_suffix) then
	       arg.remove_suffix(eiffel_suffix);
	    end;
	    if as_bit_n_ref.same_as(arg) then
	       ace.set_root_class_name_using(as_bit_n);
	    else
	       ace.set_root_class_name_using(arg);
	    end;
	 end;
      end;

   valid_argument_for_ace_mode: STRING is
      "Only the -version, -help, -no_warning, and -no_style_warning are allowed in%N%
      %ACE file mode.%N";

end -- SHORT -- The command.
