/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ *//*
 * Created on 11 oct. 2003
 *
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
package tinyeiffel.erreur;

import tinyeiffel.ast.*;

/**
 * @author BARRET
 *
 * Erreur VWEQ
 * L'expression doit etre de type BOOLEAN
 */
public class ErreurVWEQ extends Erreur {static class __CLOVER_172_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}

	public ErreurVWEQ(Classe classe,Expr_Binaire expr,Type t1,Type t2)
	{__CLOVER_172_0.cloverRec.M[999]++;
		assert((((t1!=null)) && (++__CLOVER_172_0.cloverRec.CT[3587]!=0|true)) || (++__CLOVER_172_0.cloverRec.CF[3587]==0&false));
		assert((((t2!=null)) && (++__CLOVER_172_0.cloverRec.CT[3588]!=0|true)) || (++__CLOVER_172_0.cloverRec.CF[3588]==0&false));
		assert((((classe!=null)) && (++__CLOVER_172_0.cloverRec.CT[3589]!=0|true)) || (++__CLOVER_172_0.cloverRec.CF[3589]==0&false));
		assert((((expr!=null)) && (++__CLOVER_172_0.cloverRec.CT[3590]!=0|true)) || (++__CLOVER_172_0.cloverRec.CF[3590]==0&false));
		assert((((expr.op==Expr.Egal||expr.op==Expr.Diff)) && (++__CLOVER_172_0.cloverRec.CT[3591]!=0|true)) || (++__CLOVER_172_0.cloverRec.CF[3591]==0&false));
		__CLOVER_172_0.cloverRec.S[15009]++;this.expr=expr;
		__CLOVER_172_0.cloverRec.S[15010]++;this.t1=t1;
		__CLOVER_172_0.cloverRec.S[15011]++;this.t2=t2;
		__CLOVER_172_0.cloverRec.S[15012]++;this.classe=classe;
	}

	public Expr_Binaire expr;
	Type t1,t2;
	Classe classe;

	/* (non-Javadoc)
	 * @see erreur.Erreur#toMsg()
	 */
	public String toMsg() {__CLOVER_172_0.cloverRec.M[1000]++;
		__CLOVER_172_0.cloverRec.S[15013]++;return "Erreur dans la comparaison dans la classe "+classe.nom+
				" : les types "+t1+" et "+t2+" ne sont pas compatibles "+
				" a la ligne "+expr.debut();
	}

}
