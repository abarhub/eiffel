/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ *//*
 * Created on 27 sept. 2003
 *
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
package tinyeiffel.erreur;

/**
 * @author BARRET
 *
 * Erreur g\u00e9n\u00e9rique d'entr\u00e9e/sortie
 */
public class ErreurIO extends Erreur {static class __CLOVER_90_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}

	public ErreurIO(String msg,String fichier)
	{__CLOVER_90_0.cloverRec.M[811]++;
		__CLOVER_90_0.cloverRec.S[14460]++;this.msg=msg;
		__CLOVER_90_0.cloverRec.S[14461]++;this.fichier=fichier;
	}

	public String toString()
	{__CLOVER_90_0.cloverRec.M[812]++;
		__CLOVER_90_0.cloverRec.S[14462]++;return "Erreur "+fichier+" : "+msg;
	}

	public final String msg,fichier;

	/* (non-Javadoc)
	 * @see erreur.Erreur#toMsg()
	 */
	public String toMsg() {__CLOVER_90_0.cloverRec.M[813]++;
		__CLOVER_90_0.cloverRec.S[14463]++;return toString();
	}

}
