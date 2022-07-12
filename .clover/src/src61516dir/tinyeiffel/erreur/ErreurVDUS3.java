/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ *//*
 * Created on 6 oct. 2003
 *
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
package tinyeiffel.erreur;

import tinyeiffel.ast.*;

/**
 * @author BARRET
 *
 * Erreur VDUS no 3
 * L'attribut est effectif plusieurs fois dans la classe
 */
public class ErreurVDUS3 extends Erreur {static class __CLOVER_109_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}

	public ErreurVDUS3(Classe c,Attribut a,Heritage heritage)
	{__CLOVER_109_0.cloverRec.M[852]++;
		assert((((c!=null)) && (++__CLOVER_109_0.cloverRec.CT[3244]!=0|true)) || (++__CLOVER_109_0.cloverRec.CF[3244]==0&false));
		assert((((a!=null)) && (++__CLOVER_109_0.cloverRec.CT[3245]!=0|true)) || (++__CLOVER_109_0.cloverRec.CF[3245]==0&false));
		assert((((heritage!=null)) && (++__CLOVER_109_0.cloverRec.CT[3246]!=0|true)) || (++__CLOVER_109_0.cloverRec.CF[3246]==0&false));
		assert((((c.nom.compareToIgnoreCase(a.classe.nom)!=0)) && (++__CLOVER_109_0.cloverRec.CT[3247]!=0|true)) || (++__CLOVER_109_0.cloverRec.CF[3247]==0&false));
		__CLOVER_109_0.cloverRec.S[14558]++;classe=c;
		__CLOVER_109_0.cloverRec.S[14559]++;attribut=a;
		__CLOVER_109_0.cloverRec.S[14560]++;this.heritage=heritage;
	}
	
	/* (non-Javadoc)
	 * @see erreur.Erreur#toMsg()
	 */
	public String toMsg() {__CLOVER_109_0.cloverRec.M[853]++;
		__CLOVER_109_0.cloverRec.S[14561]++;return "Erreur dans la classe "+classe.nom+
				" a la ligne "+heritage.debut()+" : "+
				"l'attribut undefine "+attribut+" n'est pas"+
				" concret dans la classe "+attribut.classe.nom+
				" a la ligne "+attribut.nom.debut();
	}

	public Attribut attribut;
	public Classe classe;
	public Heritage heritage;

}
