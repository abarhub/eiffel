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
class TYPE_LIKE_FEATURE
   --
   -- For an anchored declaration type mark using a feature name.
   --
   -- See also TYPE_LIKE_ARG and TYPE_LIKE_CURRENT.
   --

inherit TYPE_ANCHORED redefine is_like_feature end;

creation {EIFFEL_PARSER} make

creation {TYPE_LIKE_FEATURE} with

feature

   is_like_feature: BOOLEAN is true;

   is_like_current: BOOLEAN is false;

   is_like_argument: BOOLEAN is false;

   like_what: FEATURE_NAME;
	 -- The one written after the "like" keyword.

   like_feature: E_FEATURE;
	 -- The corresponding one using `start_position' and `like_what'.

   written_mark: STRING;

   run_type: E_TYPE;
         -- When runnable only.

   start_lookup_name: CLASS_NAME is
      local
         bc: BASE_CLASS; rt: E_TYPE;
      do
	 if run_type /= Void then
	    Result := run_type.start_lookup_name;
	 else
	    if like_feature = Void then
	       bc := start_position.base_class;
	       like_feature := bc.e_feature(like_what);
	       if like_feature /= Void then
		  rt := like_feature.result_type;
	       end;
	       if rt = Void then
		  if like_feature /= Void then
		     eh.add_position(like_feature.start_position);
		  end;
		  eh.append(fz_bad_anchor);
		  eh.add_position(start_position);
		  eh.print_as_fatal_error;
	       end;
	    end;
	    rt := like_feature.result_type;
	    Result := rt.start_lookup_name;
	 end;
      end;

   is_run_type: BOOLEAN is
      do
         Result := run_type /= Void;
      end;

   to_runnable(ct: E_TYPE): like Current is
      local
         rc: RUN_CLASS;
         rt: E_TYPE;
      do
         anchor_cycle_start;
         rc := ct.run_class;
         rt := rc.get_result_type(like_what,ct);
         if run_type = Void then
            run_type := rt;
            Result := Current;
         elseif run_type = rt then
            Result := Current;
         else
            !!Result.with(Current,rt);
         end;
         anchor_cycle_end;
      end;

   stupid_switch(r: ARRAY[RUN_CLASS]): BOOLEAN is
      do
	 Result := standard_stupid_switch(r);
      end;

   is_a(other: E_TYPE): BOOLEAN is
      local
         tlf: like Current;
      do
         if other.is_like_feature then
            tlf ?= other;
            if like_what.to_string = tlf.like_what.to_string then
               Result := true;
            else
               Result := run_type.is_a(other);
            end;
         else
            Result := run_type.is_a(other);
         end;
         if not Result then
            eh.add_position(start_position);
         end;
      end;

feature {E_TYPE}

   short_hook is
      do
         short_print.hook_or("like","like ");
         like_what.short;
      end;

feature {NONE}

   make(sp: like start_position; lw: like like_what) is
      require
         not sp.is_unknown;
         lw /= Void
      do
         start_position := sp;
         like_what := lw;
         written_mark_buffer.copy(fz_like);
         written_mark_buffer.extend(' ');
         like_what.declaration_in(written_mark_buffer);
         written_mark := string_aliaser.item(written_mark_buffer);
      ensure
         start_position = sp
      end;

   with(model: like Current; rt: like run_type) is
      require
         model /= Void;
         rt /= Void
      do
         start_position := model.start_position;
         like_what := model.like_what;
	 like_feature := model.like_feature;
         written_mark := model.written_mark;
         run_type := rt;
      ensure
         start_position = model.start_position;
         like_what = model.like_what;
         like_feature = model.like_feature;
         written_mark = model.written_mark;
         run_type = rt;
      end;

end -- TYPE_LIKE_FEATURE

