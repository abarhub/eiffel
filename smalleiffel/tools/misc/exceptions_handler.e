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
class EXCEPTIONS_HANDLER
   --
   -- Unique global object in charge of EXCEPTION handling.
   --
inherit GLOBALS;

creation make

feature

   used: BOOLEAN;
         -- Indicate wheter the live code uses EXCEPTIONS or not.

feature {E_INSPECT}

   bad_inspect_value(p: POSITION) is
	 -- When some Eiffel "inspect" instruction without the optional
	 -- "else" part does not match the input.
      require
         ace.no_check
      do
         if used then
            cpp.put_string(
               once "internal_exception_handler(Incorrect_inspect_value);%N");
         else
            cpp.put_string(once "error1(%"Invalid inspect (nothing selected).%",");
            cpp.put_position(p)
            cpp.put_string(fz_14);
         end;
      end;

feature {RUN_FEATURE}

   set_used is
      do
         used := true;
      end;

feature {C_PRETTY_PRINTER}

   customize_c_runtime is
      do
         if used then
            cpp.sys_runtime_h_and_c(once "exceptions");
         end;
      end;

   initialize_runtime is
      do
         if used then
            cpp.put_string(once "setup_signal_handler();%N");
         end;
      end;

   se_evobt is
      require
         ace.boost
      do
         if used then
            cpp.put_string(once "internal_exception_handler(Void_call_target)");
         else
            cpp.put_string(once "se_print_run_time_stack(),exit(1)");
         end;
      end;

feature {NONE}

   make is
      do
      end;

end -- EXCEPTIONS_HANDLER
