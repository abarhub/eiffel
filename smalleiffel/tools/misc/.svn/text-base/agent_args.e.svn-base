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
class AGENT_ARGS

inherit GLOBALS; HASHABLE redefine is_equal end;

creation {AGENT_POOL} make

feature

   hash_code: INTEGER is
      do
	 Result := signature.hash_code;
      end;

   is_equal(other: like Current): BOOLEAN is
      do
	 Result := signature.is_equal(other.signature);
      end;

   signature: STRING;
	 -- Computed using `arguments' and `result_type'.

feature {AGENT_POOL}

   result_type: E_TYPE;

   c_define is
      require
	 cpp.on_c
      local
	 boost: BOOLEAN; i, count: INTEGER;
      do
	 boost := ace.boost;
	 buffer.clear;
	 if result_type = Void then
	    buffer.append(fz_void);
	 else
	    result_type.c_type_for_result_in(buffer);
	 end;
	 buffer.extend(' ');
	 buffer.append(signature);
	 buffer.extend('(');
	 if not boost then
	    buffer.append("se_dump_stack*caller,");
	 end;
	 buffer.append("/*agent*/T0*a");
	 if types /= Void then
	    count := types.count;
	    from i := 1 until i > count
	    loop
	       buffer.extend(',');
	       types.item(i).c_type_for_argument_in(buffer);
	       buffer.extend(' ');
	       buffer.extend('a');
	       i.append_in(buffer);
	       i := i + 1;
	    end;
	 end;
	 buffer.extend(')');
	 cpp.put_c_heading(buffer);
	 buffer.clear;
	 -- The actual protype of `afp':
	 if result_type = Void then
	    buffer.append("void");
	 else
	    result_type.c_type_for_result_in(buffer);
	 end;
	 buffer.append("(*afp)(");
	 if not boost then buffer.append("se_dump_stack*,") end;
	 buffer.append("se_agent*");
	 if types /= Void then
	    from i := 1; until i > count
	    loop
	       buffer.extend(',');
	       types.item(i).c_type_for_argument_in(buffer);
	       i := i + 1;
	    end;
	 end;
	 buffer.append(");%N");
         if not boost then
            buffer.append("se_frame_descriptor fd=%
			  %{%"agent call wrapper 1%",0,0,%"%",1};%N%
			  %se_dump_stack ds;%N%
			  %ds.fd=&fd;%Nds.p=0;%N%
                          %ds.caller=caller;%N");
         end;
	 buffer.append("afp=((void*)(((se_agent*)a)->u0.afp));%N");
	 if result_type /= Void then
	    buffer.append("return ");
	 end;
	 buffer.append("afp(");
	 if not boost then buffer.append("&ds,") end;
	 buffer.append("((se_agent*)a)");
	 if types /= Void then
	    from i := 1; until i > count
	    loop
	       buffer.extend(',');
	       buffer.extend('a');
	       i.append_in(buffer);
	       i := i + 1;
	    end;
	 end;
	 buffer.append(");%N}%N");
	 cpp.put_string(buffer);
      ensure
	 cpp.on_c
      end;

   jvm_define(actual: BOOLEAN) is
	 -- Define both the deferred wrapper or the `actual' definition.
      local
	 flags, i: INTEGER; descripteur: STRING;
	 ca: CODE_ATTRIBUTE; cp: CONSTANT_POOL;
      do
	 ca := code_attribute;
	 cp := constant_pool;
	 flags := 9;
	 descripteur := once "....................";
	 descripteur.clear;
	 descripteur.extend('(');
	 if types /= Void then
	    from 
	       i := 1;
	    until
	       i > types.count
	    loop
	       types.item(i).jvm_descriptor_in(descripteur);
	       i := i + 1;
	    end;
	 end;
	 descripteur.append(")V");
	 method_info.start(flags,signature,descripteur);
	 if actual then
	    ca.opcode_return;
	 else
	    ca.opcode_return;
	 end;
	 method_info.finish;
      end;

feature {AGENT_INSTRUCTION,AGENT_EXPRESSION}

   c_agent_definition_call(agent_target: EXPRESSION) is
      require
	 agent_target /= Void
      local
	 boost: BOOLEAN;
      do
	 if result_type = Void then
	    cpp.se_trace_ins(agent_target.start_position);
	 end;
	 cpp.put_string(signature);
	 cpp.put_character('(');
	 boost := ace.boost;
	 if not boost then
	    cpp.put_string("&ds,");
	 end;
	 agent_target.compile_to_c;
	 if face_tuple.count > 0 then
	    cpp.put_character(',');
	    face_tuple.compile_to_c;
	 end;
	 cpp.put_character(')');
      end;

   jvm_agent_definition_call(agent_target: EXPRESSION) is
      require
	 agent_target /= Void
      local
	i,count,idx:INTEGER;
	cp:CONSTANT_POOL;
	ca:CODE_ATTRIBUTE;
	class_name,descripteur:STRING;
	place:INTEGER;
      do
	ca:=code_attribute;
	cp:=constant_pool;
	place:=0;
	agent_target.compile_to_jvm;
	face_tuple.compile_to_jvm;
	descripteur:="(";
	if types /= Void then
	  count := types.count;
	  from i := 1 until i > count
	  loop
	    types.item(i).jvm_descriptor_in(descripteur)
            descripteur.remove_last(1);
	    place:=place+types.item(i).jvm_stack_space;
	    i := i + 1;
	  end;
	descripteur:=descripteur+")";
	end;
	if (result_type /= Void) then
	  result_type.jvm_descriptor_in(descripteur);
	else
          descripteur:=descripteur+"V";
	end;
	class_name:="_agent";
	idx:=cp.idx_methodref3(class_name,signature,descripteur);
	ca.opcode_invokevirtual(idx,place);
      end;

feature {NONE}

   types: ARRAY[E_TYPE];

   face_tuple: FACE_TUPLE;

   debug_info: STRING;

   make(open: TYPE_TUPLE; args: EFFECTIVE_ARG_LIST; rt: like result_type) is
	 -- Also check type conformance of `args' with `open'.
      require
	 open /= Void;
	 args.count = 1
      local
	 i, count: INTEGER; e: EXPRESSION; t, ft: E_TYPE;
      do
	 result_type := rt;
	 create signature.make(32);
	 signature.append(as_call);
	 signature.extend('_');
	 debug
	    debug_info := ("agent_args:").twin;
	 end;
	 face_tuple ?= args.expression(1);
	 if face_tuple = Void then
	    eh.add_position(args.expression(1).start_position);
	    eh.append(
               "Only the explicit manifest TUPLE notation (i.e. the square %
	       %bracketed notation) is allowed here. If you cannot work %
	       %around, please contact us on our mailing list %
	       %(SmallEiffel@loria.fr).");
	    eh.print_as_fatal_error;
	 else
	    from
	       count := face_tuple.count;
	       if count > 0 then
		  create types.make(1,count);
	       end;
	       if count /= open.count then
		  eh.add_position(open.start_position);
		  eh.add_position(args.start_position);
		  eh.append("Bad number of open arguments for agent call.");
		  eh.print_as_fatal_error;
	       end;
	       i := 1;
	    until
	       i > count
	    loop
	       e := face_tuple.expression(i);
	       t := e.result_type.run_type;
	       extend_signature(t);
	       types.put(t,i);
	       ft := open.type(i);
	       if not t.is_a(ft) then
		  eh.add_position(ft.start_position);
		  eh.add_position(e.start_position);
		  eh.append("Incompatible open arguments for agent call.");
		  eh.print_as_fatal_error;
	       end;
	       i := i + 1;
	    end;
	 end;
	 if rt = Void then
	    signature.extend('v');
	 else
	    extend_signature(rt);
	 end;
      ensure
	 result_type = rt
      end;

   extend_signature(t: E_TYPE) is
      do
	 debug
	    debug_info.append(t.run_time_mark);
	    debug_info.extend(' ');
	 end;
	 if t.is_reference then
	    signature.extend('r');
	    signature.extend('0');
	 else
	    signature.extend('e');
	    t.id.append_in(signature);
	 end;
      end;

   buffer: STRING is
      once
	 create Result.make(256);
      end;

invariant

   not signature.is_empty;

   face_tuple /= Void;

end -- AGENT_ARGS
