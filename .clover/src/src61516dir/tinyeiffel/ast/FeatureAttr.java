/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ */package tinyeiffel.ast;

import java.io.PrintStream;

public class FeatureAttr extends Feature implements ToXML
{static class __CLOVER_22_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}
	public FeatureAttr()
	{__CLOVER_22_0.cloverRec.M[142]++;
		
	}

	public boolean est_variable()
	{__CLOVER_22_0.cloverRec.M[143]++;
		__CLOVER_22_0.cloverRec.S[781]++;return true;
	}

	
	/* (non-Javadoc)
	 * @see ast.Feature#check_egal(ast.Feature)
	 */
	public void check_egal(Feature f) {__CLOVER_22_0.cloverRec.M[144]++;
		__CLOVER_22_0.cloverRec.S[782]++;super.check_egal(f);
		assert((((f instanceof FeatureAttr)) && (++__CLOVER_22_0.cloverRec.CT[281]!=0|true)) || (++__CLOVER_22_0.cloverRec.CF[281]==0&false));
	}

	/* (non-Javadoc)
	 * @see ast.Feature#toXML(java.io.PrintStream)
	 */
	public void toXML(PrintStream out) {__CLOVER_22_0.cloverRec.M[145]++;
		assert((((out!=null)) && (++__CLOVER_22_0.cloverRec.CT[282]!=0|true)) || (++__CLOVER_22_0.cloverRec.CF[282]==0&false));
		__CLOVER_22_0.cloverRec.S[783]++;toXMLDebut(out);
		__CLOVER_22_0.cloverRec.S[784]++;toXMLFin(out);
	}

}