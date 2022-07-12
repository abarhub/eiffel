/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ *//*
 * Created on 5 f\u00e9vr. 2004
 *
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
package tinyeiffel.intermediaire;

import java.io.*;
/**
 * @author BARRET
 *
 * To change the template for this generated type comment go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
public class CIInstruction_Affect extends CIInstruction {static class __CLOVER_211_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}

	/**
	 * 
	 */
	public CIInstruction_Affect(CIExpr_Var nom,CIExpr expr,CISource source) {__CLOVER_211_0.cloverRec.M[1250]++;
		assert((((nom!=null)) && (++__CLOVER_211_0.cloverRec.CT[5145]!=0|true)) || (++__CLOVER_211_0.cloverRec.CF[5145]==0&false));
		assert((((expr!=null)) && (++__CLOVER_211_0.cloverRec.CT[5146]!=0|true)) || (++__CLOVER_211_0.cloverRec.CF[5146]==0&false));
		__CLOVER_211_0.cloverRec.S[18747]++;this.nom=nom;
		__CLOVER_211_0.cloverRec.S[18748]++;this.expr=expr;
		__CLOVER_211_0.cloverRec.S[18749]++;this.source=source;
	}

	public void affiche(PrintStream out)
	{__CLOVER_211_0.cloverRec.M[1251]++;
		__CLOVER_211_0.cloverRec.S[18750]++;out.println(nom+":="+expr);
	}

	public void toXML(PrintStream out)
	{__CLOVER_211_0.cloverRec.M[1252]++;
		assert((((out!=null)) && (++__CLOVER_211_0.cloverRec.CT[5147]!=0|true)) || (++__CLOVER_211_0.cloverRec.CF[5147]==0&false));
		__CLOVER_211_0.cloverRec.S[18751]++;out.println("<instr_affect>");
		__CLOVER_211_0.cloverRec.S[18752]++;nom.toXML(out);
		__CLOVER_211_0.cloverRec.S[18753]++;out.println("<expression>");
		__CLOVER_211_0.cloverRec.S[18754]++;expr.toXML(out);
		__CLOVER_211_0.cloverRec.S[18755]++;out.println("</expression>");
		__CLOVER_211_0.cloverRec.S[18756]++;if((((source!=null) && (++__CLOVER_211_0.cloverRec.CT[5148]!=0|true)) || (++__CLOVER_211_0.cloverRec.CF[5148]==0&false)))
		{{
			__CLOVER_211_0.cloverRec.S[18757]++;source.toXML(out);
		}
		}__CLOVER_211_0.cloverRec.S[18758]++;out.println("</instr_affect>");
	}

	public void check_egal(CIInstruction instr)
	{__CLOVER_211_0.cloverRec.M[1253]++;
		assert((((instr!=null)) && (++__CLOVER_211_0.cloverRec.CT[5149]!=0|true)) || (++__CLOVER_211_0.cloverRec.CF[5149]==0&false));
		assert((((instr instanceof CIInstruction_Affect)) && (++__CLOVER_211_0.cloverRec.CT[5150]!=0|true)) || (++__CLOVER_211_0.cloverRec.CF[5150]==0&false));
		__CLOVER_211_0.cloverRec.S[18759]++;CIInstruction_Affect ins=(CIInstruction_Affect)instr;
		assert((((nom!=null)) && (++__CLOVER_211_0.cloverRec.CT[5151]!=0|true)) || (++__CLOVER_211_0.cloverRec.CF[5151]==0&false));
		assert((((ins.nom!=null)) && (++__CLOVER_211_0.cloverRec.CT[5152]!=0|true)) || (++__CLOVER_211_0.cloverRec.CF[5152]==0&false));
		assert((((expr!=null)) && (++__CLOVER_211_0.cloverRec.CT[5153]!=0|true)) || (++__CLOVER_211_0.cloverRec.CF[5153]==0&false));
		assert((((ins.expr!=null)) && (++__CLOVER_211_0.cloverRec.CT[5154]!=0|true)) || (++__CLOVER_211_0.cloverRec.CF[5154]==0&false));
		__CLOVER_211_0.cloverRec.S[18760]++;nom.check_egal(ins.nom);
		__CLOVER_211_0.cloverRec.S[18761]++;expr.check_egal(ins.expr);
		__CLOVER_211_0.cloverRec.S[18762]++;if((((source!=null) && (++__CLOVER_211_0.cloverRec.CT[5155]!=0|true)) || (++__CLOVER_211_0.cloverRec.CF[5155]==0&false)))
		{{
			__CLOVER_211_0.cloverRec.S[18763]++;source.check_egal(ins.source);
		}
		}else
		{{
			assert((((ins.source==null)) && (++__CLOVER_211_0.cloverRec.CT[5156]!=0|true)) || (++__CLOVER_211_0.cloverRec.CF[5156]==0&false));
		}
	}}
	
	public CIExpr_Var nom;
	public CIExpr expr;
	public CISource source;

}
