/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ *//*
 * Created on 15 mai 2004
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
public class ErreurVUAR4 extends Erreur {static class __CLOVER_168_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}

	public ErreurVUAR4(Expr expr,Classe classe1,Position pos1)
	{__CLOVER_168_0.cloverRec.M[991]++;
		assert((((classe1!=null)) && (++__CLOVER_168_0.cloverRec.CT[3574]!=0|true)) || (++__CLOVER_168_0.cloverRec.CF[3574]==0&false));
		assert((((expr!=null)) && (++__CLOVER_168_0.cloverRec.CT[3575]!=0|true)) || (++__CLOVER_168_0.cloverRec.CF[3575]==0&false));
		assert((((pos1!=null)) && (++__CLOVER_168_0.cloverRec.CT[3576]!=0|true)) || (++__CLOVER_168_0.cloverRec.CF[3576]==0&false));
		__CLOVER_168_0.cloverRec.S[14975]++;this.classe=classe1;
		__CLOVER_168_0.cloverRec.S[14976]++;this.expr=expr;
		__CLOVER_168_0.cloverRec.S[14977]++;this.pos=pos1;
	}

	public Classe classe;
	public Expr expr;
	Position pos;

	/* (non-Javadoc)
	 * @see erreur.Erreur#toMsg()
	 */
	public String toMsg() {__CLOVER_168_0.cloverRec.M[992]++;
		__CLOVER_168_0.cloverRec.S[14978]++;return "Tentative de prendre l'adresse d'une expression "+
				"qui n'est pas un attribut "+
				"a la ligne "+pos+" dans la classe "+classe.nom;
	}

}
