/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ *//*
 * Created on 28 d\u00e9c. 2003
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
public class ErreurVGCC5 extends Erreur {static class __CLOVER_122_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}

	public ErreurVGCC5(Classe classe,Instr_Creation instr,
						Type type,int t)
	{__CLOVER_122_0.cloverRec.M[883]++;
		assert((((classe!=null)) && (++__CLOVER_122_0.cloverRec.CT[3310]!=0|true)) || (++__CLOVER_122_0.cloverRec.CF[3310]==0&false));
		assert((((instr!=null)) && (++__CLOVER_122_0.cloverRec.CT[3311]!=0|true)) || (++__CLOVER_122_0.cloverRec.CF[3311]==0&false));
		assert((((type!=null)) && (++__CLOVER_122_0.cloverRec.CT[3312]!=0|true)) || (++__CLOVER_122_0.cloverRec.CF[3312]==0&false));
		assert((((t==pas_appel||t==pas_fonction)) && (++__CLOVER_122_0.cloverRec.CT[3313]!=0|true)) || (++__CLOVER_122_0.cloverRec.CF[3313]==0&false));
		__CLOVER_122_0.cloverRec.S[14646]++;this.classe=classe;
		__CLOVER_122_0.cloverRec.S[14647]++;this.instr=instr;
		__CLOVER_122_0.cloverRec.S[14648]++;this.type=type;
		__CLOVER_122_0.cloverRec.S[14649]++;this.t=t;
	}


	Classe classe;
	Instr_Creation instr;
	Type type;
	int t;
	public static final int pas_fonction=1;
	public static final int pas_appel=2;

	/* (non-Javadoc)
	 * @see erreur.Erreur#toMsg()
	 */
	public String toMsg() {__CLOVER_122_0.cloverRec.M[884]++;
		__CLOVER_122_0.cloverRec.S[14650]++;if((((t==pas_appel) && (++__CLOVER_122_0.cloverRec.CT[3314]!=0|true)) || (++__CLOVER_122_0.cloverRec.CF[3314]==0&false)))
			{__CLOVER_122_0.cloverRec.S[14651]++;return "Dans la classe "+classe.nom+", l'instruction de "+
				"cr\u00e9ation n'a pas d'appel, mais la classe "+type+
				" a une section de cr\u00e9ation "+
				" a la ligne "+instr.debut();
		}else
			{__CLOVER_122_0.cloverRec.S[14652]++;return "Dans la classe "+classe.nom+", l'instruction de "+
				"cr\u00e9ation a un appel vers "+instr.nom2+", mais la classe "+type+
				" n'a pas d\u00e9clar\u00e9 cette routine dans la "+
				"section de cr\u00e9ation a la ligne "+instr.debut();
	}}


}
