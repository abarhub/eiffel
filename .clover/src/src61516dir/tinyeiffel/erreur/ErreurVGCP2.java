/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ *//*
 * Created on 3 d\u00e9c. 2003
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
public class ErreurVGCP2 extends Erreur {static class __CLOVER_125_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}

	public ErreurVGCP2(Classe classe,NomFeature nom1,
		NomFeature nom2)
	{__CLOVER_125_0.cloverRec.M[890]++;
		assert((((classe!=null)) && (++__CLOVER_125_0.cloverRec.CT[3325]!=0|true)) || (++__CLOVER_125_0.cloverRec.CF[3325]==0&false));
		assert((((nom1!=null)) && (++__CLOVER_125_0.cloverRec.CT[3326]!=0|true)) || (++__CLOVER_125_0.cloverRec.CF[3326]==0&false));
		assert((((nom2!=null)) && (++__CLOVER_125_0.cloverRec.CT[3327]!=0|true)) || (++__CLOVER_125_0.cloverRec.CF[3327]==0&false));
		__CLOVER_125_0.cloverRec.S[14667]++;this.classe=classe;
		__CLOVER_125_0.cloverRec.S[14668]++;this.nom1=nom1;
		__CLOVER_125_0.cloverRec.S[14669]++;this.nom2=nom2;
	}

	Classe classe;
	NomFeature nom1,nom2;

	/* (non-Javadoc)
	 * @see erreur.Erreur#toMsg()
	 */
	public String toMsg() {__CLOVER_125_0.cloverRec.M[891]++;
		__CLOVER_125_0.cloverRec.S[14670]++;return "Dans la classe "+classe.nom+", l'attribut "+
				nom1+" est d\u00e9clar\u00e9 plusieurs fois dans la "+
				"section cr\u00e9ation aux lignes "+nom2.debut()+
				" et "+nom1.debut();
	}

}
