/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ *//*
 * Created on 7 d\u00e9c. 2003
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
public class ErreurVAVE extends Erreur {static class __CLOVER_93_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}

	public ErreurVAVE(Classe classe,Instr instr)
	{__CLOVER_93_0.cloverRec.M[819]++;
		assert((((classe!=null)) && (++__CLOVER_93_0.cloverRec.CT[3193]!=0|true)) || (++__CLOVER_93_0.cloverRec.CF[3193]==0&false));
		assert((((instr!=null)) && (++__CLOVER_93_0.cloverRec.CT[3194]!=0|true)) || (++__CLOVER_93_0.cloverRec.CF[3194]==0&false));
		assert((((instr instanceof Instr_Loop)) && (++__CLOVER_93_0.cloverRec.CT[3195]!=0|true)) || (++__CLOVER_93_0.cloverRec.CF[3195]==0&false));
		assert((((((Instr_Loop)instr).variant!=null)) && (++__CLOVER_93_0.cloverRec.CT[3196]!=0|true)) || (++__CLOVER_93_0.cloverRec.CF[3196]==0&false));
		__CLOVER_93_0.cloverRec.S[14473]++;this.classe=classe;
		__CLOVER_93_0.cloverRec.S[14474]++;this.instr=(Instr_Loop)instr;
	}

	Classe classe;
	Instr_Loop instr;

	/* (non-Javadoc)
	 * @see erreur.Erreur#toMsg()
	 */
	public String toMsg() {__CLOVER_93_0.cloverRec.M[820]++;
		__CLOVER_93_0.cloverRec.S[14475]++;return "Dans la classe "+classe.nom+", le variant a la "+
				"ligne "+instr.variant.debut()+" n'est pas un entier";
	}

}
