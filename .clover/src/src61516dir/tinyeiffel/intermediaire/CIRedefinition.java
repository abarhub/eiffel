/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ *//*
 * Created on 1 f\u00e9vr. 2004
 *
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
package tinyeiffel.intermediaire;

/**
 * @author BARRET
 *
 * To change the template for this generated type comment go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
public class CIRedefinition {static class __CLOVER_224_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}

	/**
	 * 
	 */
	public CIRedefinition(CIAttribut attribut,CIAttribut redefinition[],
			CISource source) {__CLOVER_224_0.cloverRec.M[1322]++;
		assert((((attribut!=null)) && (++__CLOVER_224_0.cloverRec.CT[5366]!=0|true)) || (++__CLOVER_224_0.cloverRec.CF[5366]==0&false));
		assert((((redefinition!=null)) && (++__CLOVER_224_0.cloverRec.CT[5367]!=0|true)) || (++__CLOVER_224_0.cloverRec.CF[5367]==0&false));
		__CLOVER_224_0.cloverRec.S[19066]++;this.attribut=attribut;
		__CLOVER_224_0.cloverRec.S[19067]++;this.redefinition=redefinition;
		__CLOVER_224_0.cloverRec.S[19068]++;this.source=source;
	}

	public final CIAttribut attribut,redefinition[];
	public CISource source; // TODO: est-ce utile ?

}