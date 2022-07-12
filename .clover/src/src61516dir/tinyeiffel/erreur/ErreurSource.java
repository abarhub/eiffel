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
 * Erreur lexicale ou de parsing
 */
public class ErreurSource extends Erreur {static class __CLOVER_91_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}

	public ErreurSource(String msg,int ligne,int colonne,
				String fichier)
	{__CLOVER_91_0.cloverRec.M[814]++;
		__CLOVER_91_0.cloverRec.S[14464]++;this.msg=msg;
		__CLOVER_91_0.cloverRec.S[14465]++;this.ligne=ligne;
		__CLOVER_91_0.cloverRec.S[14466]++;this.colonne=colonne;
		__CLOVER_91_0.cloverRec.S[14467]++;this.fichier=fichier;
	}

	public String toString()
	{__CLOVER_91_0.cloverRec.M[815]++;
		__CLOVER_91_0.cloverRec.S[14468]++;return "Erreur "+fichier+"("+ligne+","+
				colonne+") : "+msg;
	}
	
	

	public final String msg,fichier;
	public final int ligne,colonne; 

	/* (non-Javadoc)
	 * @see erreur.Erreur#toMsg()
	 */
	public String toMsg() {__CLOVER_91_0.cloverRec.M[816]++;
		__CLOVER_91_0.cloverRec.S[14469]++;return toString();
	}

}
