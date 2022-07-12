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
class E_AGENT_CALL
   --
   -- Face call used during E_AGENT mapping of the actual called routine.
   --

inherit CALL_PROC_CALL;

creation {E_AGENT} make

feature

   run_feature: RUN_FEATURE;

   arguments: EFFECTIVE_ARG_LIST;

feature {NONE}

   creator: E_AGENT;
	 -- The `creator' of `Current'.

   make(c: like creator; rf: like run_feature) is
      require
	 c /= Void
      local
	 fal: FORMAL_ARG_LIST; argc, i: INTEGER;
      do
	 creator := c;
	 run_feature := rf;
	 create {FACE_TARGET} target.make(rf.current_type);
	 feature_name := rf.name;
	 fal := rf.arguments;
	 if fal /= Void then
	    argc := fal.count;
	    from
	       create arguments.make_1(face_argument(fal,1));
	       i := 2;
	    until
	       i > argc
	    loop
	       arguments.add_last(face_argument(fal,i));
	       i := i + 1;
	    end;
	 end;
      ensure
	 creator = c
      end;

   face_argument(fal: FORMAL_ARG_LIST; idx: INTEGER): FACE_ARGUMENT is
      require
	 idx.in_range(1,fal.count)
      local
	 rt: E_TYPE;
      do
	 rt := fal.type(idx).run_type;
	 create {FACE_ARGUMENT} Result.make(rt,idx);
      ensure
	 Result /= Void
      end;

invariant

   creator /= Void;

end -- E_AGENT_CALL
