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
class AGENT_POOL
   --
   -- Singleton object in charge of agents.
   -- This singleton is shared via the GLOBALS.`agent_pool' once function.
   --

inherit GLOBALS;

feature {E_AGENT}

   register(e_agent: E_AGENT): INTEGER is
	 -- The registered one gets it's id as the `Result' of this
	 -- function.
      do
	 if list = Void then
	    create list.with_capacity(12);
	 end;
	 list.add_last(e_agent);
	 Result := list.upper + 1;
	 -- Note that it may not be a really good idea to use the array
	 -- index as an id because this may imply many C recompilations.
      end;

feature {SMALL_EIFFEL}

   falling_down is
      local
         i: INTEGER;
      do
	 if list /= Void then
	    from
	       i := list.upper;
	    until
	       i < list.lower
	    loop
	       list.item(i).falling_down;
	       i := i - 1;
	    end;
	 end;
      end;

   customize_jvm_runtime is
      local
	i:INTEGER;
      do
	 jvm.write_super_agent_class;
         if (list/=Void) then
	   from
	     i := 0;
	   until
	     i > (list.count-1)
	   loop
	     jvm.write_agent_class(list.item(i));
	     i := i + 1;
	   end;--loop
         end;--if
      end;

feature {JVM}

   jvm_define_deferred_methods is
      local
	 i: INTEGER;
      do
	 method_info.add_init(fz_java_lang_object);
	 from
	    i := 1;
	 until
	    i > agent_args_set.count
	 loop
	    agent_args_set.item(i).jvm_define(false);
	    i := i + 1;
	 end;
	 method_info.finish;
      end;

   ajout_call_full(i:INTEGER) is
	 -- ** NOM MOCHE ***
      do
	 method_info.add_init(fz_java_lang_object);
	 agent_args_set.item(i).jvm_define(true);
	 method_info.finish;
      end;

feature {AGENT_INSTRUCTION,AGENT_EXPRESSION}

   register_agent_call(args: EFFECTIVE_ARG_LIST;
		       rf: RUN_FEATURE): AGENT_ARGS is
	 -- Where `rf' is the `call' or the `item' feature.
      require
	 args.count = 1
      local
	 toa: TYPE_OF_AGENT;
      do
	 check
	    rf.name.to_string = as_item or rf.name.to_string = as_call
	 end;
	 toa ?= rf.current_type;
	 create Result.make(toa.open,args,rf.result_type);
	 agent_args_set.add(Result);
      ensure
	 Result /= Void
      end;

feature {SMALL_EIFFEL}

   c_header_pass1 is
      require
         cpp.on_h
      do
         if list /= Void then
	    cpp.put_string(once "typedef union _se_agent se_agent;%N%
			   %typedef struct _se_agent0 se_agent0;%N");
         end;
      ensure
         cpp.on_h
      end;

feature {C_PRETTY_PRINTER}

   customize_c_runtime is
      require
	 cpp.on_h
      local
	 i: INTEGER; boost: BOOLEAN;
      do
	 boost := ace.boost;
	 if list /= Void then
	    cpp.put_string(once "struct _se_agent0{");
	    if not boost then
	       cpp.put_string(once "Tid id;")
	    end;
	    cpp.put_string(once "void*(*afp)(");
	    if not boost then
	       cpp.put_string(once "se_dump_stack*,")
	    end;
	    cpp.put_string(once "se_agent*);};%N");
	    from
	       i := list.upper;
	    until
	       i < list.lower
	    loop
	       list.item(i).c_define_type_1(boost);
	       i := i - 1;
	    end;
	    cpp.put_string(once "union _se_agent{T0 s0;se_agent0 u0;");
	    from
	       i := list.upper;
	    until
	       i < list.lower
	    loop
	       list.item(i).c_define_type_2;
	       i := i - 1;
	    end;
	    cpp.put_string(once "};%N");
            cpp.sys_runtime_h_and_c(once "agents");
	    cpp.swap_on_c;
	    echo.print_count(once "Agent definition wrapper",list.count);
	    from
	       i := list.upper;
	    until
	       i < list.lower
	    loop
	       list.item(i).c_define_function(boost);
	       i := i - 1;
	    end;
	    echo.print_count(once "Agent call wrapper",agent_args_set.count);
	    from
	       i := 1;
	    until
	       i > agent_args_set.count
	    loop
	       agent_args_set.item(i).c_define;
	       i := i + 1;
	    end;
	    cpp.swap_on_h;
	 end;
      ensure
	 cpp.on_h
      end;

feature {GC_HANDLER}

   gc_info_in(body: STRING) is
         -- Produce C code to print GC information.
      do
         if list /= Void then
	    body.append(
               once "if (gc_info_nb_agent)%Nfprintf(SE_GCINFO,%"%%d\tagent(s)%
                    % created. (store_left=%%d).\n%",%
	            %gc_info_nb_agent,store_left_agent);%N");
	 end;
      end;

feature {NONE}

   list: FIXED_ARRAY[E_AGENT];

   agent_args_set: SET[AGENT_ARGS] is
      once
	 create Result.make;
      end;

   singleton_memory: AGENT_POOL is
      once
	 Result := Current;
      end;

invariant

   is_real_singleton: Current = singleton_memory

end -- AGENT_POOL
