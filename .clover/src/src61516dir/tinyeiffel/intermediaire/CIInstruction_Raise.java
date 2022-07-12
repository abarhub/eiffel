/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ *//*
 * Created on 24 f\u00e9vr. 2004
 *
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
package tinyeiffel.intermediaire;

import java.io.PrintStream;

/**
 * @author BARRET
 *
 * To change the template for this generated type comment go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
public class CIInstruction_Raise extends CIInstruction {static class __CLOVER_215_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}

	/**
	 * 
	 */
	public CIInstruction_Raise(CIExpr no,CIExpr nom,
			CISource source) {__CLOVER_215_0.cloverRec.M[1266]++;
		assert((((nom!=null)) && (++__CLOVER_215_0.cloverRec.CT[5201]!=0|true)) || (++__CLOVER_215_0.cloverRec.CF[5201]==0&false));
		__CLOVER_215_0.cloverRec.S[18823]++;this.no=no;
		__CLOVER_215_0.cloverRec.S[18824]++;this.nom=nom;
		__CLOVER_215_0.cloverRec.S[18825]++;this.source=source;
	}

	/**
	 * no=
	 * 1 - loop_invariant
	 * 2 - loop_variant
	 * 3 - no_more_memory
	 * 4 - routine_failure
	 * 5 - Void_assigned_to_expanded
	 * 6 - Void_call_target
	 * 7 - incorrect_inspect_value
	 * @param no
	 */
	public CIInstruction_Raise(CIExpr no,CISource source) {__CLOVER_215_0.cloverRec.M[1267]++;
		__CLOVER_215_0.cloverRec.S[18826]++;this.no=no;
		__CLOVER_215_0.cloverRec.S[18827]++;this.nom=null;
		__CLOVER_215_0.cloverRec.S[18828]++;this.source=source;
	}

	/* (non-Javadoc)
	 * @see intermediaire.Instruction#affiche(java.io.PrintStream)
	 */
	public void affiche(PrintStream out) {__CLOVER_215_0.cloverRec.M[1268]++;
		assert((((out!=null)) && (++__CLOVER_215_0.cloverRec.CT[5202]!=0|true)) || (++__CLOVER_215_0.cloverRec.CF[5202]==0&false));
		__CLOVER_215_0.cloverRec.S[18829]++;out.print("raise "+no);
		__CLOVER_215_0.cloverRec.S[18830]++;if((((nom!=null) && (++__CLOVER_215_0.cloverRec.CT[5203]!=0|true)) || (++__CLOVER_215_0.cloverRec.CF[5203]==0&false)))
			{__CLOVER_215_0.cloverRec.S[18831]++;out.print(","+nom);
		}__CLOVER_215_0.cloverRec.S[18832]++;out.println();
	}

	/* (non-Javadoc)
	 * @see intermediaire.Instruction#toXML(java.io.PrintStream)
	 */
	public void toXML(PrintStream out) {__CLOVER_215_0.cloverRec.M[1269]++;
		assert((((out!=null)) && (++__CLOVER_215_0.cloverRec.CT[5204]!=0|true)) || (++__CLOVER_215_0.cloverRec.CF[5204]==0&false));
		__CLOVER_215_0.cloverRec.S[18833]++;out.println("<instr_raise>");
		__CLOVER_215_0.cloverRec.S[18834]++;out.println("<expression>");
		__CLOVER_215_0.cloverRec.S[18835]++;no.toXML(out);
		__CLOVER_215_0.cloverRec.S[18836]++;out.println("</expression>");
		__CLOVER_215_0.cloverRec.S[18837]++;if((((nom!=null) && (++__CLOVER_215_0.cloverRec.CT[5205]!=0|true)) || (++__CLOVER_215_0.cloverRec.CF[5205]==0&false)))
		{{
			__CLOVER_215_0.cloverRec.S[18838]++;out.println("<expression>");
			__CLOVER_215_0.cloverRec.S[18839]++;nom.toXML(out);
			__CLOVER_215_0.cloverRec.S[18840]++;out.println("</expression>");
		}
		}__CLOVER_215_0.cloverRec.S[18841]++;if((((source!=null) && (++__CLOVER_215_0.cloverRec.CT[5206]!=0|true)) || (++__CLOVER_215_0.cloverRec.CF[5206]==0&false)))
		{{
			__CLOVER_215_0.cloverRec.S[18842]++;source.toXML(out);
		}
		}__CLOVER_215_0.cloverRec.S[18843]++;out.println("</instr_raise >");
	}

	/* (non-Javadoc)
	 * @see intermediaire.Instruction#check_egal(intermediaire.Instruction)
	 */
	public void check_egal(CIInstruction instr) {__CLOVER_215_0.cloverRec.M[1270]++;
		assert((((instr!=null)) && (++__CLOVER_215_0.cloverRec.CT[5207]!=0|true)) || (++__CLOVER_215_0.cloverRec.CF[5207]==0&false));
		assert((((instr instanceof CIInstruction_Raise)) && (++__CLOVER_215_0.cloverRec.CT[5208]!=0|true)) || (++__CLOVER_215_0.cloverRec.CF[5208]==0&false));
		__CLOVER_215_0.cloverRec.S[18844]++;CIInstruction_Raise ins=(CIInstruction_Raise)instr;
		assert((((no!=null)) && (++__CLOVER_215_0.cloverRec.CT[5209]!=0|true)) || (++__CLOVER_215_0.cloverRec.CF[5209]==0&false));
		assert((((ins.no!=null)) && (++__CLOVER_215_0.cloverRec.CT[5210]!=0|true)) || (++__CLOVER_215_0.cloverRec.CF[5210]==0&false));
		__CLOVER_215_0.cloverRec.S[18845]++;no.check_egal(ins.no);
		__CLOVER_215_0.cloverRec.S[18846]++;if((((nom==null) && (++__CLOVER_215_0.cloverRec.CT[5211]!=0|true)) || (++__CLOVER_215_0.cloverRec.CF[5211]==0&false)))
		{{
			assert((((ins.nom==null)) && (++__CLOVER_215_0.cloverRec.CT[5212]!=0|true)) || (++__CLOVER_215_0.cloverRec.CF[5212]==0&false));
		}
		}else
		{{
			assert((((ins.nom!=null)) && (++__CLOVER_215_0.cloverRec.CT[5213]!=0|true)) || (++__CLOVER_215_0.cloverRec.CF[5213]==0&false));
			__CLOVER_215_0.cloverRec.S[18847]++;nom.check_egal(ins.nom);
		}
		}__CLOVER_215_0.cloverRec.S[18848]++;if((((source!=null) && (++__CLOVER_215_0.cloverRec.CT[5214]!=0|true)) || (++__CLOVER_215_0.cloverRec.CF[5214]==0&false)))
		{{
			__CLOVER_215_0.cloverRec.S[18849]++;source.check_egal(ins.source);
		}
		}else
		{{
			assert((((ins.source==null)) && (++__CLOVER_215_0.cloverRec.CT[5215]!=0|true)) || (++__CLOVER_215_0.cloverRec.CF[5215]==0&false));
		}
	}}

	public final CIExpr no;
	public final CIExpr nom;
	public CISource source;

}
