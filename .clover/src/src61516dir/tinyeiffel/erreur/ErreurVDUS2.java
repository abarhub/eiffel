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
public class ErreurVDUS2 extends Erreur {static class __CLOVER_108_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}

	public ErreurVDUS2(Classe classe,NomFeature nom,
						Heritage heritage,Feature feature)
	{__CLOVER_108_0.cloverRec.M[850]++;
		assert((((classe!=null)) && (++__CLOVER_108_0.cloverRec.CT[3239]!=0|true)) || (++__CLOVER_108_0.cloverRec.CF[3239]==0&false));
		assert((((nom!=null)) && (++__CLOVER_108_0.cloverRec.CT[3240]!=0|true)) || (++__CLOVER_108_0.cloverRec.CF[3240]==0&false));
		assert((((heritage!=null)) && (++__CLOVER_108_0.cloverRec.CT[3241]!=0|true)) || (++__CLOVER_108_0.cloverRec.CF[3241]==0&false));
		assert((((feature!=null)) && (++__CLOVER_108_0.cloverRec.CT[3242]!=0|true)) || (++__CLOVER_108_0.cloverRec.CF[3242]==0&false));
		__CLOVER_108_0.cloverRec.S[14551]++;this.classe=classe;
		__CLOVER_108_0.cloverRec.S[14552]++;this.nom=nom;
		__CLOVER_108_0.cloverRec.S[14553]++;this.heritage=heritage;
		__CLOVER_108_0.cloverRec.S[14554]++;this.feature=feature;
	}

	Classe classe;
	NomFeature nom;
	Heritage heritage;
	Feature feature;

	/* (non-Javadoc)
	 * @see erreur.Erreur#toMsg()
	 */
	public String toMsg() {__CLOVER_108_0.cloverRec.M[851]++;
		__CLOVER_108_0.cloverRec.S[14555]++;if((((feature.est_variable()) && (++__CLOVER_108_0.cloverRec.CT[3243]!=0|true)) || (++__CLOVER_108_0.cloverRec.CF[3243]==0&false)))
			{__CLOVER_108_0.cloverRec.S[14556]++;return "Dans la classe "+classe.nom+" "+
				"l'attribut "+nom+" herite de "+heritage.type.nom+
				" est undefine a la ligne "+heritage.debut()+
				" alors qu'il est une variable a la ligne "+feature.debut();
		}else
			{__CLOVER_108_0.cloverRec.S[14557]++;return "Dans la classe "+classe.nom+" "+
				"l'attribut "+nom+" herite de "+heritage.type.nom+
				" est undefine a la ligne "+heritage.debut()+
				" alors qu'il est frozen a la ligne "+feature.debut();
	}}


}
