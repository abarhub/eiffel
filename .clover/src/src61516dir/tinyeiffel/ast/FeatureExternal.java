/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ */package tinyeiffel.ast;

import java.io.PrintStream;

public class FeatureExternal extends Feature implements ToXML
{static class __CLOVER_25_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}
	public FeatureExternal(Chaine str,Chaine alias)
	{__CLOVER_25_0.cloverRec.M[155]++;
		__CLOVER_25_0.cloverRec.S[800]++;this.str=str;
		__CLOVER_25_0.cloverRec.S[801]++;this.alias=alias;
	}
	
	public boolean est_routine()
	{__CLOVER_25_0.cloverRec.M[156]++;
		__CLOVER_25_0.cloverRec.S[802]++;return true;
	}

	public Chaine str,alias;
	/* (non-Javadoc)
	 * @see ast.Feature#check_egal(ast.Feature)
	 */
	public void check_egal(Feature f) {__CLOVER_25_0.cloverRec.M[157]++;
		__CLOVER_25_0.cloverRec.S[803]++;super.check_egal(f);
		assert((((f instanceof FeatureExternal)) && (++__CLOVER_25_0.cloverRec.CT[287]!=0|true)) || (++__CLOVER_25_0.cloverRec.CF[287]==0&false));
		__CLOVER_25_0.cloverRec.S[804]++;FeatureExternal f2=(FeatureExternal)f;
		__CLOVER_25_0.cloverRec.S[805]++;str.check_egal(f2.str);
		__CLOVER_25_0.cloverRec.S[806]++;if((((alias==null) && (++__CLOVER_25_0.cloverRec.CT[288]!=0|true)) || (++__CLOVER_25_0.cloverRec.CF[288]==0&false)))
			{assert((((f2.alias==null)) && (++__CLOVER_25_0.cloverRec.CT[289]!=0|true)) || (++__CLOVER_25_0.cloverRec.CF[289]==0&false));
		}else
			{__CLOVER_25_0.cloverRec.S[807]++;alias.check_egal(f2.alias);
	}}

	/* (non-Javadoc)
	 * @see ast.Feature#toXML(java.io.PrintStream)
	 */
	public void toXML(PrintStream out) {__CLOVER_25_0.cloverRec.M[158]++;
		assert((((out!=null)) && (++__CLOVER_25_0.cloverRec.CT[290]!=0|true)) || (++__CLOVER_25_0.cloverRec.CF[290]==0&false));
		__CLOVER_25_0.cloverRec.S[808]++;toXMLCorpsDebut(out);
		__CLOVER_25_0.cloverRec.S[809]++;out.println("<external>");
		__CLOVER_25_0.cloverRec.S[810]++;str.toXML(out);
		__CLOVER_25_0.cloverRec.S[811]++;if((((alias!=null) && (++__CLOVER_25_0.cloverRec.CT[291]!=0|true)) || (++__CLOVER_25_0.cloverRec.CF[291]==0&false)))
			{__CLOVER_25_0.cloverRec.S[812]++;alias.toXML(out);
		}__CLOVER_25_0.cloverRec.S[813]++;out.println("</external>");
		__CLOVER_25_0.cloverRec.S[814]++;toXMLCorpsFin(out);
	}

	public boolean est_external()
	{__CLOVER_25_0.cloverRec.M[159]++;
		__CLOVER_25_0.cloverRec.S[815]++;return true;
	}

}