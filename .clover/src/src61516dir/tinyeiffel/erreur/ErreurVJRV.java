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
public class ErreurVJRV extends Erreur {static class __CLOVER_132_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}

	public ErreurVJRV(Classe cl,Instr_TentAffect instr,
						Type type_src,Type type_cible)
	{__CLOVER_132_0.cloverRec.M[905]++;
		assert((((cl!=null)) && (++__CLOVER_132_0.cloverRec.CT[3347]!=0|true)) || (++__CLOVER_132_0.cloverRec.CF[3347]==0&false));
		assert((((instr!=null)) && (++__CLOVER_132_0.cloverRec.CT[3348]!=0|true)) || (++__CLOVER_132_0.cloverRec.CF[3348]==0&false));
		assert((((type_src!=null)) && (++__CLOVER_132_0.cloverRec.CT[3349]!=0|true)) || (++__CLOVER_132_0.cloverRec.CF[3349]==0&false));
		assert((((type_cible!=null)) && (++__CLOVER_132_0.cloverRec.CT[3350]!=0|true)) || (++__CLOVER_132_0.cloverRec.CF[3350]==0&false));
		__CLOVER_132_0.cloverRec.S[14696]++;classe=cl;
		__CLOVER_132_0.cloverRec.S[14697]++;this.instr=instr;
		__CLOVER_132_0.cloverRec.S[14698]++;this.type_src=type_src;
		__CLOVER_132_0.cloverRec.S[14699]++;this.type_cible=type_cible;
	}

	Classe classe;
	Instr_TentAffect instr;
	Type type_src,type_cible;

	/* (non-Javadoc)
	 * @see erreur.Erreur#toMsg()
	 */
	public String toMsg() {__CLOVER_132_0.cloverRec.M[906]++;
		__CLOVER_132_0.cloverRec.S[14700]++;return "Dans la classe "+classe.nom+", la tentative d'affectation "+
				"a la ligne "+instr.debut()+" est incorrecte, car "+type_src+
				" n'est pas de type r\u00e9f\u00e9rence";
	}


}
