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
class CLASS_INVARIANT
   --
   -- To store a `class invariant'.
   --

inherit ASSERTION_LIST redefine pretty_print end;

creation make, make_runnable

feature

   name: STRING is
      do
         Result := fz_invariant;
      end;

   pretty_print is
      local
         indent_level, i: INTEGER;
      do
	 indent_level := fmt.indent_level;
         fmt.set_indent_level(0);
         if not fmt.zen_mode then
            fmt.skip(1);
         end;
         fmt.keyword(name);
         if header_comment /= Void then
            header_comment.pretty_print;
         end;
         if list /= Void then
            from
               i := 1;
            until
               i > list.upper
            loop
               fmt.set_indent_level(1);
               fmt.indent;
               if not fmt.zen_mode then
                  fmt.skip(1);
               end;
               fmt.set_semi_colon_flag(true);
               list.item(i).pretty_print;
               i := i + 1;
            end;
         end;
	 fmt.set_indent_level(indent_level);
      end;

   short(bc: BASE_CLASS) is
      local
         i: INTEGER;
      do
         bc.header_comment_for(Current);
         short_print.hook_or(once "hook811",once "invariant%N");
         if header_comment = Void then
            short_print.hook_or(once "hook812",once "");
         else
            short_print.hook_or(once "hook813",once "");
            header_comment.short(once "hook814",once "   --",once "hook815",once "%N");
            short_print.hook_or(once "hook816",once "");
         end;
         if list = Void then
            short_print.hook_or(once "hook817",once "");
         else
            short_print.hook_or(once "hook818",once "");
            from
               i := 1;
            until
               i = list.upper
            loop
               list.item(i).short(once "hook819",once "   ", -- before each assertion
                                  once "hook820",once "", -- no tag
                                  once "hook821",once "", -- before tag
                                  once "hook822",once ": ", -- after tag
                                  once "hook823",once "", -- no expression
                                  once "hook824",once "", -- before expression
                                  once "hook825",once ";", -- after expression except last
                                  once "hook826",once "%N", -- no comment
                                  once "hook827",once "", -- before comment
                                  once "hook828",once " --", -- comment begin line
                                  once "hook829",once "%N", -- comment end of line
                                  once "hook830",once "", -- after comment
                                  once "hook831",once ""); -- end of each assertion

               i := i + 1;
            end;
            list.item(i).short(once "hook819",once "   ", -- before each assertion
                               once "hook820",once "", -- no tag
                               once "hook821",once "", -- before tag
                               once "hook822",once ": ", -- after tag
                               once "hook823",once "", -- no expression
                               once "hook824",once "", -- before expression
                               once "hook832",once ";", -- after last expression
                               once "hook826",once "%N", -- no comment
                               once "hook827",once "", -- before comment
                               once "hook828",once " --", -- comment begin line
                               once "hook829",once "%N", -- comment end of line
                               once "hook830",once "", -- after comment
                               once "hook831",once "");
            short_print.hook_or(once "hook833",once "");
         end;
         short_print.hook_or(once "hook834",once "");
      ensure
         fmt.indent_level = old fmt.indent_level;
      end;

feature {NONE}

   check_assertion_mode: STRING is
      do
         Result := once "inv";
      end;

feature {RUN_CLASS}

   c_define is
         -- Define C function to check invariant.
      require
         current_type /= Void;
         run_class.at_run_time;
         small_eiffel.is_ready;
         cpp.on_c
      local
         id: INTEGER;
      do
         id := current_type.id;
         -- The invariant frame descriptor :
         c_code.copy(once "se_frame_descriptor se_ifd");
         id.append_in(c_code);
         cpp.put_extern7(c_code);
         c_code.copy(once "{%"invariant once ");
         c_code.append(current_type.run_time_mark);
         c_code.append(once "%",1,0,%"");
         current_type.c_frame_descriptor_in(c_code);
         c_code.append(once "%",1};%N");
         cpp.put_string(c_code);
         -- The function :
         c_code.clear;
         c_code.extend('T');
         id.append_in(c_code);
         c_code.extend('*');
         c_code.append(fz_se_i);
         id.append_in(c_code);
         c_code.append(once "(se_dump_stack*caller,T");
         id.append_in(c_code);
         c_code.append(once "*C)");
         cpp.put_c_heading(c_code);
         cpp.swap_on_c;
         c_code.copy(once "se_dump_stack ds;%Nds.fd=&se_ifd");
         id.append_in(c_code);
         c_code.append(once ";%Nds.current=((void**)&C);%N");
         cpp.put_string(c_code);
         cpp.put_position_in_ds(start_position);
         cpp.put_string(
            once "ds.caller=caller;%N%
            %se_dst=&ds;%N");
         compile_to_c;
         cpp.put_string(once "se_dst=caller;%Nreturn C;%N}%N");
      ensure
         cpp.on_c
      end;

feature {NONE}

   c_code: STRING is
      once
         !!Result.make(128);
      end;

end -- CLASS_INVARIANT

