/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ *//*
 * Created on 18 nov. 2003
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
public class ErreurVMCN1 extends Erreur {static class __CLOVER_135_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}

	
	public ErreurVMCN1(Classe cl, Heritage herit_anc1,
						Heritage herit_anc2,NomFeature nom)
	{__CLOVER_135_0.cloverRec.M[911]++;
		assert((((cl!=null)) && (++__CLOVER_135_0.cloverRec.CT[3355]!=0|true)) || (++__CLOVER_135_0.cloverRec.CF[3355]==0&false));
		assert((((herit_anc1!=null)) && (++__CLOVER_135_0.cloverRec.CT[3356]!=0|true)) || (++__CLOVER_135_0.cloverRec.CF[3356]==0&false));
		assert((((herit_anc2!=null)) && (++__CLOVER_135_0.cloverRec.CT[3357]!=0|true)) || (++__CLOVER_135_0.cloverRec.CF[3357]==0&false));
		assert((((nom!=null)) && (++__CLOVER_135_0.cloverRec.CT[3358]!=0|true)) || (++__CLOVER_135_0.cloverRec.CF[3358]==0&false));
		__CLOVER_135_0.cloverRec.S[14707]++;classe=cl;
		__CLOVER_135_0.cloverRec.S[14708]++;heritage1=herit_anc1;
		__CLOVER_135_0.cloverRec.S[14709]++;heritage2=herit_anc2;
		__CLOVER_135_0.cloverRec.S[14710]++;this.nom=nom;
	}

	Classe classe;
	Heritage heritage1,heritage2;
	NomFeature nom;

	/* (non-Javadoc)
	 * @see erreur.Erreur#toMsg()
	 */
	public String toMsg() {__CLOVER_135_0.cloverRec.M[912]++;
		__CLOVER_135_0.cloverRec.S[14711]++;return "conflit pour l'attribut deferred "+nom+" dans la "+
				"classe "+classe.nom+"entre les heritages "+
				heritage1.type.nom+" et "+heritage2.type.nom+
				" aux lignes "+heritage1.debut()+
				" et "+heritage2.debut();
	}

}
