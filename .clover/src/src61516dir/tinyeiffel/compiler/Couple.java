/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ *//*
 * Created on 21 janv. 2004
 *
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
package tinyeiffel.compiler;

import tinyeiffel.ast.*;
/**
 * @author BARRET
 *
 * To change the template for this generated type comment go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
public class Couple {static class __CLOVER_63_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}

	/**
	 * 
	 */
	public Couple(Classe classe,int no,Conversion conv) {__CLOVER_63_0.cloverRec.M[470]++;
		assert((((classe!=null)) && (++__CLOVER_63_0.cloverRec.CT[1895]!=0|true)) || (++__CLOVER_63_0.cloverRec.CF[1895]==0&false));
		assert((((no>=0)) && (++__CLOVER_63_0.cloverRec.CT[1896]!=0|true)) || (++__CLOVER_63_0.cloverRec.CF[1896]==0&false));
		__CLOVER_63_0.cloverRec.S[5778]++;this.classe=classe;
		__CLOVER_63_0.cloverRec.S[5779]++;this.no=no;
		__CLOVER_63_0.cloverRec.S[5780]++;conversion=conv;
	}

	Classe classe;
	Conversion conversion;
	int no;

}
