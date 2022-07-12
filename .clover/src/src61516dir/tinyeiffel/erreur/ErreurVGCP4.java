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
public class ErreurVGCP4 extends Erreur {static class __CLOVER_127_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}

	public ErreurVGCP4(Classe classe,NomFeature nom,
						Feature feature)
	{__CLOVER_127_0.cloverRec.M[894]++;
		assert((((classe!=null)) && (++__CLOVER_127_0.cloverRec.CT[3330]!=0|true)) || (++__CLOVER_127_0.cloverRec.CF[3330]==0&false));
		assert((((nom!=null)) && (++__CLOVER_127_0.cloverRec.CT[3331]!=0|true)) || (++__CLOVER_127_0.cloverRec.CF[3331]==0&false));
		assert((((feature!=null)) && (++__CLOVER_127_0.cloverRec.CT[3332]!=0|true)) || (++__CLOVER_127_0.cloverRec.CF[3332]==0&false));
		assert((((feature instanceof FeatureRoutine)) && (++__CLOVER_127_0.cloverRec.CT[3333]!=0|true)) || (++__CLOVER_127_0.cloverRec.CF[3333]==0&false));
		assert((((((FeatureRoutine)feature).once)) && (++__CLOVER_127_0.cloverRec.CT[3334]!=0|true)) || (++__CLOVER_127_0.cloverRec.CF[3334]==0&false));
		__CLOVER_127_0.cloverRec.S[14674]++;this.classe=classe;
		__CLOVER_127_0.cloverRec.S[14675]++;this.nom=nom;
		__CLOVER_127_0.cloverRec.S[14676]++;this.feature=feature;
	}

	Classe classe;
	NomFeature nom;
	Feature feature;

	/* (non-Javadoc)
	 * @see erreur.Erreur#toMsg()
	 */
	public String toMsg() {__CLOVER_127_0.cloverRec.M[895]++;
		__CLOVER_127_0.cloverRec.S[14677]++;return "Dans la classe "+classe.nom+", la routine "+
				"de creation "+nom+" est d\u00e9clar\u00e9 once a la "+
				"ligne "+feature.debut();
	}

}
