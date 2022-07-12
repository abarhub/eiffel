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
class TYPE_PROCEDURE
   --
   -- For agents of type PROCEDURE.
   --

inherit TYPE_OF_AGENT;

creation make

feature

   is_type_procedure: BOOLEAN is true;

   is_type_function: BOOLEAN is false;

   is_type_predicate: BOOLEAN is false;

   is_run_type: BOOLEAN is
      do
	 if base.is_run_type then
	    Result := open.is_run_type;
	 end;
      end;

   run_type: like Current is
      do
	 if run_type_memory = Void then
	    if base.run_type = base then
	       if open.run_type = open then
		  run_type_memory := Current;
	       end;
	    end;
	    if run_type_memory = Void then
	       create run_type_memory.make(start_position,
					   base.run_type,
					   open.run_type);
	    end;
	 end;
	 Result := run_type_memory;
      end;

   to_runnable(ct: E_TYPE): like Current is
      do
	 if current_type = Void then
	    current_type := ct;
	    base := base.to_runnable(ct);
	    open := open.to_runnable(ct);
	    Result := Current;
	    base_class.load_feature_call(run_type);
	 else
	    create Result.make(start_position,base,open);
	    Result := Result.to_runnable(ct);
	 end;
      end;

   written_mark: STRING is
      local
	 mark: STRING;
      do
	 if written_mark_memory = Void then
	    mark := as_procedure.twin;
	    mark.extend('[');
	    mark.append(base.written_mark);
	    mark.extend(',');
	    mark.append(open.written_mark);
	    mark.extend(']');
	    written_mark_memory := string_aliaser.item(mark);
	 end;
	 Result := written_mark_memory;
      end;

   run_time_mark: STRING is
      local
	 mark: STRING;
      do
	 if run_time_mark_memory = Void then
	    mark := as_procedure.twin;
	    mark.extend('[');
	    mark.append(base.run_time_mark);
	    mark.extend(',');
	    mark.append(open.run_time_mark);
	    mark.extend(']');
	    run_time_mark_memory := string_aliaser.item(mark);
	 end;
	 Result := run_time_mark_memory;
      end;

feature {E_TYPE}

   short_hook is
      do
         short_print.a_face_class_name(base_class_name);
         short_print.hook_or("open_sb","[");
	 base.short_hook;
	 short_print.hook_or("tm_sep",",");
	 open.short_hook;
         short_print.hook_or("close_sb","]");
      end;

feature {NONE}

   make(sp: like start_position; b: like base; o: like open) is
      require
	 not sp.is_unknown;
	 b /= Void;
	 o /= Void
      do
	 start_position := sp;
	 base := b;
	 open := o;
	 create base_class_name.make(as_procedure,sp);
      ensure
	 start_position = sp;
	 base = b;
	 open = o
      end;

   is_a_(other: TYPE_OF_AGENT): BOOLEAN is
      do
	 if other.res = Void then
	    if base.is_a(other.base) then
	       Result := open.is_a(other.open);
	    end;
	 end;
      end;

end -- TYPE_PROCEDURE
