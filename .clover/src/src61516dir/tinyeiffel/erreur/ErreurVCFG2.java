/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ *//*
 * Created on 22 nov. 2003
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
public class ErreurVCFG2 extends Erreur {static class __CLOVER_98_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}

	public ErreurVCFG2(Classe classe,Type type1,Type type2)
	{__CLOVER_98_0.cloverRec.M[829]++;
		assert((((classe!=null)) && (++__CLOVER_98_0.cloverRec.CT[3205]!=0|true)) || (++__CLOVER_98_0.cloverRec.CF[3205]==0&false));
		assert((((type1!=null)) && (++__CLOVER_98_0.cloverRec.CT[3206]!=0|true)) || (++__CLOVER_98_0.cloverRec.CF[3206]==0&false));
		assert((((type2!=null)) && (++__CLOVER_98_0.cloverRec.CT[3207]!=0|true)) || (++__CLOVER_98_0.cloverRec.CF[3207]==0&false));
		__CLOVER_98_0.cloverRec.S[14485]++;this.classe=classe;
		__CLOVER_98_0.cloverRec.S[14486]++;this.type1=type1;
		__CLOVER_98_0.cloverRec.S[14487]++;this.type2=type2;
	}

	Classe classe;
	Type type1,type2;

	/* (non-Javadoc)
	 * @see erreur.Erreur#toMsg()
	 */
	public String toMsg() {__CLOVER_98_0.cloverRec.M[830]++;
		__CLOVER_98_0.cloverRec.S[14488]++;return "Le type generique "+type1+" a la ligne "+type1.debut()+
				" dans la classe "+classe.nom+
				" est deja pr\u00e9sent dans la liste de g\u00e9n\u00e9rique "+
				" a la ligne "+type2.debut();
	}


}
