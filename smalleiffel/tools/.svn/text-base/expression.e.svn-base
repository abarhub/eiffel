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
deferred class EXPRESSION
   --
   -- Any kind of Eiffel expression.
   --

inherit GLOBALS;

feature

   start_position: POSITION is
         -- Of the expression if any.
      deferred
      end;

   is_current: BOOLEAN is
         -- Is it a `Current' like expression (really written `Current' or some
         -- implicit not-written `Current') ?
      deferred
      end;

   is_manifest_string: BOOLEAN is
         -- Is it a manifest string (i.e. a basic manifest string or some
         -- verbatim manifest string)?
      deferred
      end;

   is_void: BOOLEAN is
         -- Is it the built-in Void?
      deferred
      end;

   is_result: BOOLEAN is
         -- Is it the pseudo local variable `Result' ?
      deferred
      end;

   is_writable: BOOLEAN is
         -- Is is something that one can find on the left-hand-side
         -- of the := operator ?
      deferred
      end;

   start_lookup_class: BASE_CLASS is
         -- The one where the lookup process must start according to the
         -- `result_type', but also according to its `start_position'. The `Result' may be
         -- Void when this information is too difficult to compute, or when
         -- there is no need to compute some renaming. Hence the Void `Result',
         -- for example in class MANIFEST_STRING or when the result type is
         -- NONE, TUPLE or some agent type.
      deferred
      end;

   result_type: E_TYPE is
         -- The `result_type' is available only when the expression has been
         -- checked (see `to_runnable').
      deferred
      ensure
         Result /= Void
      end;

   use_current: BOOLEAN is
         -- True if `Current' is used somewhere inside this expression. As for
         -- `result_type', this information is available only for checked
         -- expressions.
      require
         small_eiffel.is_ready
      deferred
      end;

   stupid_switch(r: ARRAY[RUN_CLASS]): BOOLEAN is
      require
         small_eiffel.is_ready;
         ace.boost;
         r.count > 1
      deferred
      end;

   to_runnable(ct: E_TYPE): EXPRESSION is
         -- Gives the corresponding expression checked in the `ct' context
         -- (i.e. when `ct' is the type of `Current').
      require
         ct.run_type = ct;
         ct.run_class /= Void
      deferred
      ensure
         nb_errors = 0 implies Result.result_type.is_run_type
      end;

feature

   to_integer_or_error: INTEGER is
	 -- Gives the corresponding INTEGER value or emit the `to_integer_error'
	 -- for non constant expression.
      deferred
      end;

   isa_dca_inline_argument: INTEGER is
         -- Interpretation of the Result:
         --    -1 : yes and no ARGUMENT_NAME used
         --     0 : not inlinable
         --   > 0 : inlinable and ARGUMENT_NAME rank is used.
      require
         ace.boost and small_eiffel.is_ready
      deferred
      ensure
         Result >= -1
      end;

   dca_inline_argument(formal_arg_type: E_TYPE) is
      require
         formal_arg_type /= Void;
         isa_dca_inline_argument /= 0
      deferred
      end;

   assertion_check(tag: CHARACTER) is
         -- Assume the current code in inside some assertion (a require
         -- clause or some class invariant for example). The `tag' mangling
         -- is:
         --   'R' when we are inside some require clause.
         --   'E' when we are inside some ensure clause.
         --   '_' for all other assertions.
         -- This flag is used to check VAPE and VEEN as well.
      require
         ace.no_check;
         ("RE_").has(tag)
      deferred
      end;

feature  -- Handling of precedence (priority of expressions):

   precedence: INTEGER is
      deferred
      ensure
         1 <= Result and Result <= atomic_precedence
      end;

feature

   frozen base_class_written: BASE_CLASS is
         -- The base class where this expression is written.
      do
         Result := start_position.base_class;
      end;

   frozen written_in: CLASS_NAME is
         -- The name of the base class where this expression is written.
      do
         Result := start_position.base_class_name;
      end;

   afd_check is
         -- After Falling Down Check.
      deferred
      end;

feature -- To produce C code:

   collect_c_tmp is
         -- Traverse the expression to collect extra mandatory C temporary
	 -- variables (for user expanded) just before `compile_to_c'.
      require
         small_eiffel.is_ready
      deferred
      end;

   mapping_c_target(formal_type: E_TYPE) is
         -- Produce C code in order to pass Current expression as the target
         -- of a feature call. When it is needed, C code to check invariant
         -- is automatically added as well as a C cast according to the
         -- destination `formal_type'.
      require
         small_eiffel.is_ready;
         formal_type.run_class.at_run_time;
	 result_type.is_a(formal_type)
      deferred
      end;

   debug_it(ft, rt: E_TYPE): BOOLEAN is
      local
	 ftrt, rtrt: STRING;
      do
	 ftrt := ft.run_time_mark;
	 rtrt := rt.run_time_mark;
	 Result := rt.is_a(ft)
	 if not Result then
	    eh.add_position(start_position);
	    eh.append("Debugging EXPRESSION");
	    eh.print_as_warning;
	    sedb_breakpoint;
	 else
	    Result := true;
	 end;
      end;

   mapping_c_arg(formal_type: E_TYPE) is
         -- Produce C code in order to pass Current expression as an
         -- argument of the feature called.
         -- Thus, it is the same jobs as `mapping_c_target' without
         -- the invariant call.
      require
         small_eiffel.is_ready
	 debug_it(formal_type,result_type)
--	 result_type.is_a(formal_type)
      deferred
      end;

   compile_to_c is
         -- Produce C code to access the value of the expression: user's
         -- expanded are no longuer pointer.
      require
         small_eiffel.is_ready;
         cpp.on_c
      deferred
      ensure
         cpp.on_c
      end;

   c_frame_descriptor(format, locals: STRING) is
	 -- Prepare information for the C frame descriptor.
      require
	 ace.no_check
      deferred
      end;

   c_simple: BOOLEAN is
         -- True when the C code of `compile_to_c' has no side effect at all and
         -- that `compile_to_c' on the corresponding simple expression can be
         -- called more than once without any problem/penalty.
      deferred
      end;

   can_be_dropped: BOOLEAN is
         -- True if evaluation of current expression has no possible side
         -- effects. Thus, in such a case, an unused expression can be
         -- dropped (for example target of real procedure or real function).
      require
         small_eiffel.is_ready
      deferred
      end;

feature  -- Finding `int' Constant C expression:

   is_static: BOOLEAN is
         -- True if expression has always the same static value of type
         -- INTEGER or BOOLEAN.
      require
         small_eiffel.is_ready
      deferred
      end;

   static_value: INTEGER is
         -- Note: BOOLEAN value are mapped with 0 or 1.
      require
         is_static
      deferred
      end;

   is_pre_computable: BOOLEAN is
         -- Can the current expression be pre-computed in main function to
         -- speed up a once function ?
      require
         small_eiffel.is_ready
      deferred
      end;

feature -- For `compile_to_jvm':

   compile_to_jvm is
         -- Produce Java byte code in order to push expression value on the
         -- jvm stack.
      require
         small_eiffel.is_ready
      deferred
      end;

   compile_target_to_jvm is
         -- Same as `compile_to_jvm', but add class invariant check when needed.
      require
         small_eiffel.is_ready
      deferred
      end;

   compile_to_jvm_into(dest: E_TYPE): INTEGER is
         -- Assume `result_type' conforms to `dest'. Produce Java byte code in order
         -- to convert the expression into `dest' (comparisons = and /=,
         -- argument passing and assignment). Result gives the space in the
         -- jvm stack.
         -- *** SHOULD BE REMOVE AS SOON AS IMPLICIT_CAST WILL BE
         --     CORRECT ***
      require
         conversion_check(dest,result_type)
      deferred
      ensure
         Result >= 1
      end;

   frozen standard_compile_target_to_jvm is
      do
         compile_to_jvm;
         result_type.jvm_check_class_invariant;
      end;

   frozen standard_compile_to_jvm_into(dest: E_TYPE): INTEGER is
      require
         conversion_check(dest,result_type)
      do
         compile_to_jvm;
         Result := result_type.run_type.jvm_convert_to(dest);
      ensure
         Result >= 1
      end;

   conversion_check(dest, rt: E_TYPE): BOOLEAN is
      do
         Result := true;
         if rt.is_a(dest) then
         else
            eh.cancel;
            if dest.is_a(rt) then
            else
               warning(start_position,
                ". Impossible conversion (EXPRESSION).");
            end;
         end;
      end;

   jvm_branch_if_false: INTEGER is
         -- Gives the `program_counter' to be resolved.
      require
         result_type.is_boolean
      deferred
      end;

   jvm_branch_if_true: INTEGER is
         -- Gives the `program_counter' to be resolved.
      require
         result_type.is_boolean
      deferred
      end;

   jvm_assign is
         -- Basic assignment using value on top of stack.
      require
         is_writable
      deferred
      end;

feature -- Pretty printing:

   pretty_print is
         -- Start the `pretty_print' process.
      require
         fmt.indent_level >= 1;
      deferred
      ensure
         fmt.indent_level = old fmt.indent_level;
      end;

   print_as_target is
         -- Print the expression viewed as a target plus the
         -- corresponding dot when it is necessary.
      deferred
      end;

   bracketed_pretty_print is
         -- Add bracket only when it is necessary.
      deferred
      end;

feature -- For the `short' command:

   short is
      deferred
      end;

   short_target is
         -- A target with the following dot if needed.
      deferred
      end;

   frozen bracketed_short is
      do
         short_print.hook_or("open_b","(");
         short;
         short_print.hook_or("close_b",")");
      end;

feature {NONE}

   frozen jvm_standard_branch_if_false: INTEGER is
         -- Gives the `program_counter' to be resolved.
      require
         result_type.is_boolean
      do
         compile_to_jvm;
         Result := code_attribute.opcode_ifeq;
      end;

   frozen jvm_standard_branch_if_true: INTEGER is
         -- Gives the `program_counter' to be resolved.
      require
         result_type.is_boolean
      do
         compile_to_jvm;
         Result := code_attribute.opcode_ifne
      end;

   frozen to_integer_error is
	 -- The `to_integer_or_error' message.
      do
	 eh.append(fz_iinaiv);
	 eh.add_position(start_position);
	 eh.print_as_error;
      end;

end -- EXPRESSION
