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
public class ErreurVCCH2 extends Erreur {static class __CLOVER_96_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}

	public ErreurVCCH2(Classe classe)
	{__CLOVER_96_0.cloverRec.M[825]++;
		assert((((classe!=null)) && (++__CLOVER_96_0.cloverRec.CT[3201]!=0|true)) || (++__CLOVER_96_0.cloverRec.CF[3201]==0&false));
		assert((((classe.deferred)) && (++__CLOVER_96_0.cloverRec.CT[3202]!=0|true)) || (++__CLOVER_96_0.cloverRec.CF[3202]==0&false));
		__CLOVER_96_0.cloverRec.S[14480]++;this.classe=classe;
	}

	Classe classe;

	public String toMsg() {__CLOVER_96_0.cloverRec.M[826]++;
		__CLOVER_96_0.cloverRec.S[14481]++;return "La classe abstraite "+classe.nom+" n'a pas d'"+
				"attributs deferred";
	}


}
