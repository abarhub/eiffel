/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ *//*
 * Created on 7 d\u00e9c. 2003
 *
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
package tinyeiffel.erreur;

import tinyeiffel.ast.*;
/**
 * @author BARRET
 *
 * To change the template for this generated type comment go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
public class ErreurVOMB2 extends Erreur {static class __CLOVER_141_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}

	public ErreurVOMB2(Classe classe,Expr expr,boolean entier)
	{__CLOVER_141_0.cloverRec.M[923]++;
		assert((((classe!=null)) && (++__CLOVER_141_0.cloverRec.CT[3381]!=0|true)) || (++__CLOVER_141_0.cloverRec.CF[3381]==0&false));
		assert((((expr!=null)) && (++__CLOVER_141_0.cloverRec.CT[3382]!=0|true)) || (++__CLOVER_141_0.cloverRec.CF[3382]==0&false));
		__CLOVER_141_0.cloverRec.S[14741]++;this.classe=classe;
		__CLOVER_141_0.cloverRec.S[14742]++;this.expr=expr;
		__CLOVER_141_0.cloverRec.S[14743]++;this.entier=entier;
		__CLOVER_141_0.cloverRec.S[14744]++;constant=false;
	}

	public ErreurVOMB2(Classe classe,Expr expr)
	{__CLOVER_141_0.cloverRec.M[924]++;
		assert((((classe!=null)) && (++__CLOVER_141_0.cloverRec.CT[3383]!=0|true)) || (++__CLOVER_141_0.cloverRec.CF[3383]==0&false));
		assert((((expr!=null)) && (++__CLOVER_141_0.cloverRec.CT[3384]!=0|true)) || (++__CLOVER_141_0.cloverRec.CF[3384]==0&false));
		__CLOVER_141_0.cloverRec.S[14745]++;this.classe=classe;
		__CLOVER_141_0.cloverRec.S[14746]++;this.expr=expr;
		__CLOVER_141_0.cloverRec.S[14747]++;constant=true;
	}

	Classe classe;
	Expr expr;
	boolean entier,constant;

	/* (non-Javadoc)
	 * @see erreur.Erreur#toMsg()
	 */
	public String toMsg() {__CLOVER_141_0.cloverRec.M[925]++;
		__CLOVER_141_0.cloverRec.S[14748]++;if((((constant) && (++__CLOVER_141_0.cloverRec.CT[3385]!=0|true)) || (++__CLOVER_141_0.cloverRec.CF[3385]==0&false)))
		{{
			__CLOVER_141_0.cloverRec.S[14749]++;return "Dans la classe "+classe.nom+", la constante"+
						" d'inspection n'est pas constante a la "+
						"ligne "+expr.debut();
		}
		}else
		{{
			__CLOVER_141_0.cloverRec.S[14750]++;if((((entier) && (++__CLOVER_141_0.cloverRec.CT[3386]!=0|true)) || (++__CLOVER_141_0.cloverRec.CF[3386]==0&false)))
				{__CLOVER_141_0.cloverRec.S[14751]++;return "Dans la classe "+classe.nom+", la constante"+
						" d'inspection n'est pas un INTEGER a la "+
						"ligne "+expr.debut();
			}else
				{__CLOVER_141_0.cloverRec.S[14752]++;return "Dans la classe "+classe.nom+", la constante"+
						" d'inspection n'est pas un CHARACTER a la "+
						"ligne "+expr.debut();
		}}
	}}

}
