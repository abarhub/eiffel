/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ *//*
 * Created on 26 d\u00e9c. 2003
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
public class ErreurAffect extends Erreur {static class __CLOVER_88_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}

	public ErreurAffect(Classe classe,Instr_Affect instr,String nom)
	{__CLOVER_88_0.cloverRec.M[804]++;
		assert((((classe!=null)) && (++__CLOVER_88_0.cloverRec.CT[3179]!=0|true)) || (++__CLOVER_88_0.cloverRec.CF[3179]==0&false));
		assert((((instr!=null)) && (++__CLOVER_88_0.cloverRec.CT[3180]!=0|true)) || (++__CLOVER_88_0.cloverRec.CF[3180]==0&false));
		assert((((nom!=null)) && (++__CLOVER_88_0.cloverRec.CT[3181]!=0|true)) || (++__CLOVER_88_0.cloverRec.CF[3181]==0&false));
		__CLOVER_88_0.cloverRec.S[14440]++;this.classe=classe;
		__CLOVER_88_0.cloverRec.S[14441]++;this.instr1=instr;
		__CLOVER_88_0.cloverRec.S[14442]++;this.nom=nom;
		__CLOVER_88_0.cloverRec.S[14443]++;type=affect;
	}
	
	public ErreurAffect(Classe classe,Instr_TentAffect instr,String nom)
	{__CLOVER_88_0.cloverRec.M[805]++;
		assert((((classe!=null)) && (++__CLOVER_88_0.cloverRec.CT[3182]!=0|true)) || (++__CLOVER_88_0.cloverRec.CF[3182]==0&false));
		assert((((instr!=null)) && (++__CLOVER_88_0.cloverRec.CT[3183]!=0|true)) || (++__CLOVER_88_0.cloverRec.CF[3183]==0&false));
		assert((((nom!=null)) && (++__CLOVER_88_0.cloverRec.CT[3184]!=0|true)) || (++__CLOVER_88_0.cloverRec.CF[3184]==0&false));
		__CLOVER_88_0.cloverRec.S[14444]++;this.classe=classe;
		__CLOVER_88_0.cloverRec.S[14445]++;this.instr2=instr;
		__CLOVER_88_0.cloverRec.S[14446]++;this.nom=nom;
		__CLOVER_88_0.cloverRec.S[14447]++;type=tent_affect;
	}

	public ErreurAffect(Classe classe,Instr_Creation instr,String nom)
	{__CLOVER_88_0.cloverRec.M[806]++;
		assert((((classe!=null)) && (++__CLOVER_88_0.cloverRec.CT[3185]!=0|true)) || (++__CLOVER_88_0.cloverRec.CF[3185]==0&false));
		assert((((instr!=null)) && (++__CLOVER_88_0.cloverRec.CT[3186]!=0|true)) || (++__CLOVER_88_0.cloverRec.CF[3186]==0&false));
		assert((((nom!=null)) && (++__CLOVER_88_0.cloverRec.CT[3187]!=0|true)) || (++__CLOVER_88_0.cloverRec.CF[3187]==0&false));
		__CLOVER_88_0.cloverRec.S[14448]++;this.classe=classe;
		__CLOVER_88_0.cloverRec.S[14449]++;this.instr3=instr;
		__CLOVER_88_0.cloverRec.S[14450]++;this.nom=nom;
		__CLOVER_88_0.cloverRec.S[14451]++;type=creation;
	}

	Classe classe;
	Instr_Affect instr1;
	Instr_TentAffect instr2;
	Instr_Creation instr3;
	String nom;
	int type;
	final int affect=1;
	final int tent_affect=2;
	final int creation=3;

	/* (non-Javadoc)
	 * @see erreur.Erreur#toMsg()
	 */
	public String toMsg() {__CLOVER_88_0.cloverRec.M[807]++;
		__CLOVER_88_0.cloverRec.S[14452]++;if((((type==affect) && (++__CLOVER_88_0.cloverRec.CT[3188]!=0|true)) || (++__CLOVER_88_0.cloverRec.CF[3188]==0&false)))
			{__CLOVER_88_0.cloverRec.S[14453]++;return "Dans la classe "+classe.nom+", l'affectation "+
				"n'a pas pour cible une variable a la ligne "+
			instr1.tid.debut();
		}else {__CLOVER_88_0.cloverRec.S[14454]++;if((((type==tent_affect) && (++__CLOVER_88_0.cloverRec.CT[3189]!=0|true)) || (++__CLOVER_88_0.cloverRec.CF[3189]==0&false)))
			{__CLOVER_88_0.cloverRec.S[14455]++;return "Dans la classe "+classe.nom+", la tentative "+
				"d'affectation n'a pas pour cible une variable"+
				" a la ligne "+instr2.tid.debut();
		}else
			{__CLOVER_88_0.cloverRec.S[14456]++;return "Dans la classe "+classe.nom+", la creation "+
				"n'a pas pour cible une variable"+
				" a la ligne "+instr3.tid.debut();
	}}}

}
