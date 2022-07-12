/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ *//*
 * Created on 20 nov. 2003
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
public class ErreurVDRD7 extends Erreur {static class __CLOVER_102_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}

	public ErreurVDRD7(Classe classe,
							Feature feature_directe,
							Heritage heritage,
							NomFeature nom)
	{__CLOVER_102_0.cloverRec.M[837]++;
		__CLOVER_102_0.cloverRec.S[14512]++;this.feature_directe=feature_directe;
		__CLOVER_102_0.cloverRec.S[14513]++;this.classe=classe;
		__CLOVER_102_0.cloverRec.S[14514]++;this.heritage=heritage;
		__CLOVER_102_0.cloverRec.S[14515]++;this.nom=nom;
	}

	Feature feature_directe;
	Classe classe;
	Heritage heritage;
	NomFeature nom;

	/* (non-Javadoc)
	 * @see erreur.Erreur#toMsg()
	 */
	public String toMsg() {__CLOVER_102_0.cloverRec.M[838]++;
		__CLOVER_102_0.cloverRec.S[14516]++;if((((feature_directe.est_external()) && (++__CLOVER_102_0.cloverRec.CT[3214]!=0|true)) || (++__CLOVER_102_0.cloverRec.CF[3214]==0&false)))
			{__CLOVER_102_0.cloverRec.S[14517]++;return "Impossible de redefinir l'attribut non external "+
						nom+" a la ligne "+heritage.debut()+
						" en un attribut external a la ligne "+
						feature_directe.debut();
		}else
			{__CLOVER_102_0.cloverRec.S[14518]++;return "Impossible de redefinir l'attribut external "+
				nom+" a la ligne "+heritage.debut()+
				" en un attribut non external a la ligne "+
				feature_directe.debut();
	}}


}
