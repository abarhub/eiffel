/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ *//*
 * Created on 1 d\u00e9c. 2003
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
public class ErreurVREG extends Erreur {static class __CLOVER_152_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}

	public ErreurVREG(Classe classe,Feature feature,
						DeclareVar nom1,DeclareVar nom2,
						boolean local)
	{__CLOVER_152_0.cloverRec.M[953]++;
		assert((((classe!=null)) && (++__CLOVER_152_0.cloverRec.CT[3474]!=0|true)) || (++__CLOVER_152_0.cloverRec.CF[3474]==0&false));
		assert((((feature!=null)) && (++__CLOVER_152_0.cloverRec.CT[3475]!=0|true)) || (++__CLOVER_152_0.cloverRec.CF[3475]==0&false));
		assert((((nom1!=null)) && (++__CLOVER_152_0.cloverRec.CT[3476]!=0|true)) || (++__CLOVER_152_0.cloverRec.CF[3476]==0&false));
		assert((((nom2!=null)) && (++__CLOVER_152_0.cloverRec.CT[3477]!=0|true)) || (++__CLOVER_152_0.cloverRec.CF[3477]==0&false));
		__CLOVER_152_0.cloverRec.S[14836]++;this.classe=classe;
		__CLOVER_152_0.cloverRec.S[14837]++;this.feature=feature;
		__CLOVER_152_0.cloverRec.S[14838]++;this.nom1=nom1;
		__CLOVER_152_0.cloverRec.S[14839]++;this.nom2=nom2;
		__CLOVER_152_0.cloverRec.S[14840]++;this.local=local;
	}

	Classe classe;
	Feature feature;
	DeclareVar nom1,nom2;
	boolean local;

	/* (non-Javadoc)
	 * @see erreur.Erreur#toMsg()
	 */
	public String toMsg() {__CLOVER_152_0.cloverRec.M[954]++;
		__CLOVER_152_0.cloverRec.S[14841]++;if((((local) && (++__CLOVER_152_0.cloverRec.CT[3478]!=0|true)) || (++__CLOVER_152_0.cloverRec.CF[3478]==0&false)))
			{__CLOVER_152_0.cloverRec.S[14842]++;return "Dans la classe "+classe.nom+", le nom du parametre"+
				" formel "+nom1.nom+" est declar\u00e9 plusieurs fois "+
				" aux lignes "+nom1.debut()+" et "+nom2.debut();
		}else
			{__CLOVER_152_0.cloverRec.S[14843]++;return "Dans la classe "+classe.nom+", le nom de la"+
				" variable locale "+nom1.nom+" est declar\u00e9 plusieurs fois "+
				" aux lignes "+nom1.debut()+" et "+nom2.debut();
	}}


}
