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
deferred class CALL_PREFIX
   --
   -- For all sort of prefix operators.
   -- Root of all CALL_PREFIX_*.
   --

inherit CALL_0 redefine print_as_target end;

feature

   is_pre_computable: BOOLEAN is false;

   operator: STRING is
      deferred
      end;

   frozen to_runnable(ct: E_TYPE): like Current is
      do
	 if current_type = Void then
	    current_type := ct;
	    runnable_target(ct);
	    run_feature_for(ct);
	    Result := Current;
	    debug debug_info_update end;
	    run_feature_match;
	 else
	    create Result.with(target,feature_name);
	    Result := Result.to_runnable(ct);
	 end;
      end;

   compile_to_c is
      do
         call_proc_call_c2c;
      end;

   frozen bracketed_pretty_print is
      do
         fmt.put_character('(');
         pretty_print;
         fmt.put_character(')');
      end;

   frozen pretty_print is
      do
         feature_name.pretty_print;
         fmt.put_character(' ');
         if target.precedence < precedence then
            fmt.put_character('(');
            target.pretty_print;
            fmt.put_character(')');
         else
            target.pretty_print;
         end;
      end;

   frozen print_as_target is
      do
         fmt.put_character('(');
         pretty_print;
         fmt.put_character(')');
         fmt.put_character('.');
      end;

   frozen short is
      do
         short_print.a_prefix_name(feature_name);
         if target.precedence < precedence then
            target.bracketed_short;
         else
            target.short;
         end;
      end;

   frozen short_target is
      do
         bracketed_short;
         short_print.a_dot;
      end;

feature {NONE}

   with(t: like target; fn: like feature_name) is
      require
         t /= Void;
         fn.to_string = operator
      do
         target := t;
         feature_name := fn;
      ensure
         target = t;
         feature_name = fn
      end;

end -- CALL_PREFIX
