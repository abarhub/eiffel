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
class CREATION_CLAUSE
   --
   -- The store the contents of one creation clause.
   --   example 1
   --                creation {ANY} make
   --   example 2
   --                creation make, foo
   --   example 3
   --                creation {NONE,ANY} make, foo
   --   example 4
   --                creation
   --
   -- Note : The original text of the source file can be stored
   --        for pretty pretty_printing to be fine.
   --

inherit GLOBALS;

creation make

feature

   start_position: POSITION;
         -- Of the corresponding keyword.

   clients: CLIENT_LIST;

   comment: COMMENT;

feature {NONE}

   procedure_list: FEATURE_NAME_LIST;

   make(sp: like start_position; c: like clients;
        cm: like comment; pl: like procedure_list) is
      require
         not sp.is_unknown;
         c /= Void
      do
         start_position := sp;
         clients := c;
         comment := cm;
         procedure_list := pl;
      ensure
         clients = c;
         comment = cm
         procedure_list = pl
      end;

feature

   pretty_print is
      do
         fmt.set_indent_level(0);
         if not fmt.zen_mode then
            fmt.skip(1);
         else
            fmt.indent;
         end;
         fmt.keyword("creation");
         fmt.set_indent_level(1);
         if clients /= Void then
            clients.pretty_print;
         end;
         if comment /= void then
            comment.pretty_print;
         end;
         fmt.set_indent_level(1);
         if not fmt.zen_mode then
            fmt.indent;
         end;
         if procedure_list /= Void then
            procedure_list.pretty_print;
         end;
      end;

   short(heading_done: BOOLEAN): BOOLEAN is
         -- True when at least one creation list is printed.
      do
         if clients.gives_permission_to_any then
            if not heading_done then
               short_print.hook_or("hook100","creation%N");
            end;
            if procedure_list /= Void then
               procedure_list.short_for_creation;
            end;
            short_print.hook_or("hook101","");
            Result := true;
         else
            eh.cancel;
         end;
      end;

   has(fn: FEATURE_NAME): BOOLEAN is
      require
         fn /= Void
      do
         if procedure_list /= Void then
            Result := procedure_list.has(fn);
         end;
      end;

feature {CREATION_CLAUSE_LIST}

   default_root: STRING is
	 -- Return the default creation procedure name to be used as the root
	 -- procedure (the execution entry point of the system).
      do
         if procedure_list /= Void then
	    if procedure_list.has_make then
	       Result := as_make;
	    else
	       Result := procedure_list.first.to_string;
	    end;
	 end;
      end;

   root_creation_search(a_name: STRING): FEATURE_NAME is
      do
         if procedure_list /= Void then
            Result := procedure_list.root_creation_search(a_name);
         end;
      end;

   check_expanded_with(t: E_TYPE) is
      require
         t.is_expanded;
      local
         rf: RUN_FEATURE;
         rf3: RUN_FEATURE_3;
         rc: RUN_CLASS;
      do
         if procedure_list = Void then
            eh.add_position(start_position);
            fatal_error("Cannot create a class with an empty creation list.");
         end;
         if procedure_list.count > 1 then
            eh.add_type(t,fz_cbe);
            eh.add_position(start_position);
            fatal_error_vtec_2;
         end;
         rc := t.run_class;
         rf := rc.get_feature(procedure_list.first);
         if rf = Void then
            eh.add_position(start_position);
            eh.append("Creation procedure for ");
            eh.add_type(t," not found.");
            eh.print_as_fatal_error;
         end;
         rf3 ?= rf;
         if rf3 = Void then
            eh.add_position(start_position);
            eh.add_position(rf.start_position);
            fatal_error("Feature found is not a procedure.");
         end;
         if rf3.arguments /= Void then
            eh.add_type(t,fz_cbe);
            eh.add_position(start_position);
            eh.add_position(rf3.start_position);
            eh.append("Procedure found has arguments. ");
            fatal_error_vtec_2;
         end;
      end;

   a_default_create(type: E_TYPE): RUN_FEATURE_3 is
      require
         type /= Void
      local
	 i: INTEGER; fn, rfn: FEATURE_NAME;
	 rc: RUN_CLASS; rf: RUN_FEATURE;
      do
         if procedure_list /= Void then
	    rc := type.run_class;
	    from
	       i := procedure_list.count;
	    until
	       rf /= Void or else i <= 0
	    loop
	       fn := procedure_list.item(i);
	       if fn.to_string = as_default_create then
		  rf := rc.get_feature(fn);
		  rfn := fn;
	       end;
	       i := i - 1;
	    end;
	    if rf = Void and then type.is_expanded then
	       from
		  i := procedure_list.count;
	       until
		  rf /= Void or else i <= 0
	       loop
		  fn := procedure_list.item(i);
		  rf := rc.get_feature(fn);
		  rfn := fn;
		  if rf /= Void then
		     if rf.arguments /= Void then
			rf := Void;
		     end;
		  end;
		  i := i - 1;
	       end;
	    end;
	    if rf /= Void then
	       Result ?= rf;
	       if Result = Void then
		  eh.add_position(rf.start_position);
		  eh.add_position(rfn.start_position);
		  fatal_error(fz_ffinap);
	       end;
	    end;
         end;
      end;

invariant

   clients /= Void;

end -- CREATION_CLAUSE

