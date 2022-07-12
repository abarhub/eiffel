/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ *//*
 * Created on 5 juin 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package tinyeiffel.erreur;

/**
 * @author barret
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class ErreurIntermediaire extends Erreur {static class __CLOVER_89_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}

	/**
	 * 
	 */
	public ErreurIntermediaire(String m) {__CLOVER_89_0.cloverRec.M[808]++;
		assert((((m!=null)) && (++__CLOVER_89_0.cloverRec.CT[3190]!=0|true)) || (++__CLOVER_89_0.cloverRec.CF[3190]==0&false));
		__CLOVER_89_0.cloverRec.S[14457]++;msg=m;
	}

	public String toString()
	{__CLOVER_89_0.cloverRec.M[809]++;
		__CLOVER_89_0.cloverRec.S[14458]++;return "Erreur dans le code intermediaire : "+msg;
	}
	
	public final String msg;

	/* (non-Javadoc)
	 * @see erreur.Erreur#toMsg()
	 */
	public String toMsg() {__CLOVER_89_0.cloverRec.M[810]++;
		__CLOVER_89_0.cloverRec.S[14459]++;return toString();
	}
}
