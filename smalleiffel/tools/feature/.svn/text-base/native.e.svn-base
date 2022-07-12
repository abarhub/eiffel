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
deferred class NATIVE
   --
   -- An external language clause definition (external "SmallEiffel", 
   -- external "C ...", external "C++ ...", external "dll ...".
   --

inherit GLOBALS;

feature

   external_tag: MANIFEST_STRING;
         -- The external language call description.

   start_position: POSITION is
	 -- Of the `external_tag'.
      do
	 Result := external_tag.start_position;
      end;
   
   frozen pretty_print is
      do
	 external_tag.pretty_print;
      end;
   
   use_current(er: EXTERNAL_ROUTINE): BOOLEAN is
	 -- Is `Current' used by such a call?
      require
         er /= Void
      deferred
      end;

   stupid_switch_function(r: ARRAY[RUN_CLASS]; name: STRING): BOOLEAN is
      require
         not r.is_empty
      deferred
      end;

   stupid_switch_procedure(r: ARRAY[RUN_CLASS]; name: STRING): BOOLEAN is
      require
         not r.is_empty
      deferred
      end;

   c_define_function(rf8: RUN_FEATURE_8; bcn, name: STRING) is
         -- Produce C code to define the corresponding `rf8' function.
	 -- (Or nothing when the code is inlined.)
      require
         rf8.base_feature.first_name.to_string = name;
         rf8.base_feature.base_class.name.to_string = bcn
      deferred
      end;

   c_mapping_function(rf8: RUN_FEATURE_8; bcn, name: STRING) is
         -- Produce C code to call the corresponding `rf8' function.
      require
         rf8.base_feature.first_name.to_string = name;
         rf8.base_feature.base_class.name.to_string = bcn
      deferred
      end;

   c_define_procedure(rf7: RUN_FEATURE_7; bcn, name: STRING) is
         -- Produce C code to define the corresponding `rf7' procedure.
	 -- (Or nothing when the code is inlined.)
      require
         rf7.base_feature.first_name.to_string = name;
         rf7.base_feature.base_class.name.to_string = bcn
      deferred
      end;

   c_mapping_procedure(rf7: RUN_FEATURE_7; bcn, name: STRING) is
         -- Produce C code to call the corresponding `rf7' procedure.
      require
         rf7.base_feature.first_name.to_string = name;
         rf7.base_feature.base_class.name.to_string = bcn
      deferred
      end;

   jvm_add_method_for_function(rf8: RUN_FEATURE_8; bcn, name: STRING) is
      require
         rf8.base_feature.first_name.to_string = name;
         rf8.base_feature.base_class.name.to_string = bcn
      deferred
      end;

   jvm_define_function(rf8: RUN_FEATURE_8; bcn, name: STRING) is
         -- Produce Java byte code to define `rf8'.
      require
         rf8.base_feature.first_name.to_string = name;
         rf8.base_feature.base_class.name.to_string = bcn
      deferred
      end;

   jvm_mapping_function(rf8: RUN_FEATURE_8; bcn, name: STRING) is
         -- Produce Java byte code to use `rf8'.
      require
         rf8.base_feature.first_name.to_string = name;
         rf8.base_feature.base_class.name.to_string = bcn
      deferred
      end;

   jvm_add_method_for_procedure(rf7: RUN_FEATURE_7; bcn, name: STRING) is
      require
         rf7.base_feature.first_name.to_string = name;
         rf7.base_feature.base_class.name.to_string = bcn
      deferred
      end;

   jvm_define_procedure(rf7: RUN_FEATURE_7; bcn, name: STRING) is
         -- Produce Java byte code to define `rf7'.
      require
         rf7.base_feature.first_name.to_string = name;
         rf7.base_feature.base_class.name.to_string = bcn
      deferred
      end;

   jvm_mapping_procedure(rf7: RUN_FEATURE_7; bcn, name: STRING) is
         -- Produce Java byte code to use `rf7'.
      require
         rf7.base_feature.first_name.to_string = name;
         rf7.base_feature.base_class.name.to_string = bcn
      deferred
      end;

feature {NONE}

   fe_c2jvm(rf: RUN_FEATURE) is
      do
         eh.add_position(jvm.target_position);
         eh.add_position(rf.start_position);
         fatal_error("Command 'compile_to_jvm' cannot compile this code.");
      end;

   fe_c2c(rf: RUN_FEATURE) is
      do
         eh.add_position(rf.start_position);
         fatal_error("Command 'compile_to_c' cannot compile this code.");
      end;

   make(et: like external_tag) is
      require
         et /= Void
      do
         external_tag := et;
      ensure
         external_tag = et
      end;

   body: STRING is
      once
         create Result.make(1024);
      end;

   buffer: STRING is
      once
	 create Result.make(32);
      end;

invariant

   external_tag /= Void implies not external_tag.is_once

end -- NATIVE

