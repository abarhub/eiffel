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
class AGENT_INSTRUCTION
   --
   -- Some agent is called using the `call' notation.
   --

inherit CALL_PROC_CALL; INSTRUCTION;

creation {PROC_CALL} make

feature

   pretty_print is
      do
	 creator.pretty_print;
      end;

   to_runnable(ct: E_TYPE): INSTRUCTION is
      do
	 Result := creator.to_runnable(ct);
      end;

   arg_count: INTEGER is 1;

   compile_to_c is
      do
	 agent_args.c_agent_definition_call(target);
	 cpp.put_character(';');
	 cpp.put_character('%N');
      end;

   end_mark_comment: BOOLEAN is false;

   stupid_switch(r: ARRAY[RUN_CLASS]): BOOLEAN is
      do
	 check false end;
      end;

   is_pre_computable: BOOLEAN is false;

   compile_to_jvm is
      do
	 agent_args.jvm_agent_definition_call(target);
      end;

feature {NONE}

   creator: PROC_CALL;
	 -- The `creator' of `Current'.

   arguments: EFFECTIVE_ARG_LIST;

   run_feature: RUN_FEATURE;

   agent_args: AGENT_ARGS;
	 -- Computed using `feature_name' and `aguments'.

   make(c: like creator) is
      require
	 c.target /= Void;
	 c.feature_name.to_string = as_call;
	 c.run_feature.result_type = Void
      do
	 creator := c;
	 target := creator.target;
	 feature_name := creator.feature_name;
	 arguments := creator.arguments;
	 run_feature := creator.run_feature;
	 agent_args := agent_pool.register_agent_call(arguments,run_feature);
      ensure
	 creator = c;
	 target = creator.target;
	 feature_name = creator.feature_name;
	 arguments = creator.arguments;
	 run_feature = creator.run_feature
      end;

invariant

   target /= Void;

   feature_name /= Void;

   run_feature /= Void;

end -- AGENT_INSTRUCTION
