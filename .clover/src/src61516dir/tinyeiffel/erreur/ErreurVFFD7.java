/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ *//*
 * Created on 30 nov. 2003
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
public class ErreurVFFD7 extends Erreur {static class __CLOVER_117_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}

	public ErreurVFFD7(Classe classe,NomFeature nom,
						Feature feature)
	{__CLOVER_117_0.cloverRec.M[872]++;
		assert((((classe!=null)) && (++__CLOVER_117_0.cloverRec.CT[3287]!=0|true)) || (++__CLOVER_117_0.cloverRec.CF[3287]==0&false));
		assert((((nom!=null)) && (++__CLOVER_117_0.cloverRec.CT[3288]!=0|true)) || (++__CLOVER_117_0.cloverRec.CF[3288]==0&false));
		assert((((feature!=null)) && (++__CLOVER_117_0.cloverRec.CT[3289]!=0|true)) || (++__CLOVER_117_0.cloverRec.CF[3289]==0&false));
		assert((((feature.type_retour!=null)) && (++__CLOVER_117_0.cloverRec.CT[3290]!=0|true)) || (++__CLOVER_117_0.cloverRec.CF[3290]==0&false));
		assert((((feature instanceof FeatureRoutine &&
				((FeatureRoutine)feature).once)) && (++__CLOVER_117_0.cloverRec.CT[3291]!=0|true)) || (++__CLOVER_117_0.cloverRec.CF[3291]==0&false));
		__CLOVER_117_0.cloverRec.S[14616]++;this.classe=classe;
		__CLOVER_117_0.cloverRec.S[14617]++;this.nom=nom;
		__CLOVER_117_0.cloverRec.S[14618]++;this.feature=feature;
	}

	Classe classe;
	NomFeature nom;
	Feature feature;

	public String toMsg() {__CLOVER_117_0.cloverRec.M[873]++;
		__CLOVER_117_0.cloverRec.S[14619]++;if((((feature.type_retour.is_like) && (++__CLOVER_117_0.cloverRec.CT[3292]!=0|true)) || (++__CLOVER_117_0.cloverRec.CF[3292]==0&false)))
			{__CLOVER_117_0.cloverRec.S[14620]++;return "Dans la classe "+classe.nom+", l'attribut "+nom+
				" doit avoir un type de retour non ancr\u00e9 a la "+
				"ligne "+feature.debut();
		}else
			{__CLOVER_117_0.cloverRec.S[14621]++;return "Dans la classe "+classe.nom+", l'attribut "+nom+
				" doit avoir un type de retour non g\u00e9n\u00e9rique a la "+
				"ligne "+feature.debut();
	}}


}
