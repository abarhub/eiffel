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
class TYPE_FUNCTION
   --
   -- For agents of type FUNCTION or PREDICATE.
   --

inherit TYPE_OF_AGENT;

creation make

feature

   is_type_procedure: BOOLEAN is false;

   is_type_function: BOOLEAN is true;

   is_type_predicate: BOOLEAN is
      do
	 Result := res.is_boolean;
      end;

   is_run_type: BOOLEAN is
      do
	 if base.is_run_type then
	    if open.is_run_type then
	       Result := res.is_run_type;
	    end;
	 end;
      end;

   run_type: like Current is
      do
	 if run_type_memory = Void then
	    if base.run_type = base then
	       if open.run_type = open then
		  if res.run_type = res then
		     run_type_memory := Current;
		  end;
	       end;
	    end;
	    if run_type_memory = Void then
	       create run_type_memory.make(start_position,
					   base.run_type,
					   open.run_type,
					   res.run_type);
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
	    res := res.to_runnable(ct);
	    Result := Current;
	    base_class.load_feature_call(run_type);
	    base_class.load_feature_item(run_type,res);
	 else
	    create Result.make(start_position,base,open,res);
	    Result := Result.to_runnable(ct);
	 end;
      end;

   written_mark: STRING is
      local
	 mark: STRING; predicate: BOOLEAN;
      do
	 if written_mark_memory = Void then
	    predicate := is_type_predicate;
	    if predicate then
	       mark := as_predicate.twin;
	    else
	       mark := as_function.twin;
	    end;
	    mark.extend('[');
	    mark.append(base.written_mark);
	    mark.extend(',');
	    mark.append(open.written_mark);
	    if not predicate then
	       mark.extend(',');
	       mark.append(res.written_mark);
	    end;
	    mark.extend(']');
	    written_mark_memory := string_aliaser.item(mark);
	 end;
	 Result := written_mark_memory;
      end;

   run_time_mark: STRING is
      local
	 mark: STRING; predicate: BOOLEAN;
      do
	 if run_time_mark_memory = Void then
	    predicate := is_type_predicate;
	    if predicate then
	       mark := as_predicate.twin;
	    else
	       mark := as_function.twin;
	    end;
	    mark.extend('[');
	    mark.append(base.run_time_mark);
	    mark.extend(',');
	    mark.append(open.run_time_mark);
	    if not predicate then
	       mark.extend(',');
	       mark.append(res.run_time_mark);
	    end;
	    mark.extend(']');
	    run_time_mark_memory := string_aliaser.item(mark);
	 end;
	 Result := run_time_mark_memory;
      end;

feature {E_TYPE}

   short_hook is
      local
	 predicate : BOOLEAN; bcn: like base_class_name;
      do
	 predicate := is_type_predicate;
	 bcn := base_class_name;
	 if predicate then
	    create bcn.make(as_predicate,bcn.start_position);
	 end;
	 short_print.a_face_class_name(bcn);
         short_print.hook_or("open_sb","[");
	 base.short_hook;
	 short_print.hook_or("tm_sep",",");
	 open.short_hook;
	 if not predicate then
	    short_print.hook_or("tm_sep",",");
	    res.short_hook;
	 end;
         short_print.hook_or("close_sb","]");
      end;

feature {NONE}

   make(sp: like start_position; b: like base; o: like open; r: like res) is
      require
	 not sp.is_unknown
	 b /= Void;
	 o /= Void
      do
	 start_position := sp;
	 base := b;
	 open := o;
	 if r /= Void then
	    res := r;
	 else
	    create {TYPE_BOOLEAN} res.make(sp);
	 end;
	 create base_class_name.make(as_function,sp);
      ensure
	 start_position = sp;
	 base = b;
	 open = o;
	 res = r or else res.is_boolean
      end;

   is_a_(other: TYPE_OF_AGENT): BOOLEAN is
      do
	 if base.is_a(other.base) then
	    if open.is_a(other.open) then
	       if other.res /= Void then
		  Result := res.is_a(other.res);
	       else
		  Result := true;
	       end;
	    end;
	 end;
      end;

invariant

   res /= Void;

end -- TYPE_FUNCTION
