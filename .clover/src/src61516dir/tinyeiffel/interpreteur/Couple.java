/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ *//*
 * Created on 23 juin 2004
 *
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
package tinyeiffel.interpreteur;

import tinyeiffel.ast.*;

/**
 * @author BARRET
 *
 * To change the template for this generated type comment go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
public class Couple {static class __CLOVER_232_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}

	/**
	 * 
	 */
	public Couple(Donnee d,Type t) {__CLOVER_232_0.cloverRec.M[1356]++;
		assert((((d!=null)) && (++__CLOVER_232_0.cloverRec.CT[5653]!=0|true)) || (++__CLOVER_232_0.cloverRec.CF[5653]==0&false));
		assert((((t!=null)) && (++__CLOVER_232_0.cloverRec.CT[5654]!=0|true)) || (++__CLOVER_232_0.cloverRec.CF[5654]==0&false));
		__CLOVER_232_0.cloverRec.S[19754]++;this.donnee=d;
		__CLOVER_232_0.cloverRec.S[19755]++;this.type=t;
	}

	public Donnee donnee;
	public Type type;
}
