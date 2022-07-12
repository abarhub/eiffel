/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ *//*
 * Created on 6 f\u00e9vr. 2004
 *
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
package tinyeiffel.intermediaire;

import java.io.*;
/**
 * @author BARRET
 *
 * To change the template for this generated type comment go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
public class CIExpr_Void extends CIExpr_Scalaire {static class __CLOVER_208_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}

	/**
	 * 
	 */
	public CIExpr_Void(CISource source) {__CLOVER_208_0.cloverRec.M[1207]++;
		__CLOVER_208_0.cloverRec.S[17540]++;this.source=source;
	}

	public String toString()
	{__CLOVER_208_0.cloverRec.M[1208]++;
		__CLOVER_208_0.cloverRec.S[17541]++;return "Void";
	}

	public void toXML(PrintStream out)
	{__CLOVER_208_0.cloverRec.M[1209]++;
		__CLOVER_208_0.cloverRec.S[17542]++;out.print("<expression_scalaire type=\"void\" ");
		__CLOVER_208_0.cloverRec.S[17543]++;if((((source!=null) && (++__CLOVER_208_0.cloverRec.CT[4455]!=0|true)) || (++__CLOVER_208_0.cloverRec.CF[4455]==0&false)))
		{{
			__CLOVER_208_0.cloverRec.S[17544]++;out.println("/>");
			__CLOVER_208_0.cloverRec.S[17545]++;source.toXML(out);
			__CLOVER_208_0.cloverRec.S[17546]++;out.println("</expression_scalaire>");
		}
		}else
		{{
			__CLOVER_208_0.cloverRec.S[17547]++;out.println("/>");
		}
	}}

	public void check_egal(CIExpr e)
	{__CLOVER_208_0.cloverRec.M[1210]++;
		assert((((e!=null)) && (++__CLOVER_208_0.cloverRec.CT[4456]!=0|true)) || (++__CLOVER_208_0.cloverRec.CF[4456]==0&false));
		assert((((e instanceof CIExpr_Void)) && (++__CLOVER_208_0.cloverRec.CT[4457]!=0|true)) || (++__CLOVER_208_0.cloverRec.CF[4457]==0&false));
		__CLOVER_208_0.cloverRec.S[17548]++;if((((source!=null) && (++__CLOVER_208_0.cloverRec.CT[4458]!=0|true)) || (++__CLOVER_208_0.cloverRec.CF[4458]==0&false)))
		{{
			__CLOVER_208_0.cloverRec.S[17549]++;source.check_egal(((CIExpr_Void)e).source);
		}
		}else
		{{
			assert((((((CIExpr_Void)e).source==null)) && (++__CLOVER_208_0.cloverRec.CT[4459]!=0|true)) || (++__CLOVER_208_0.cloverRec.CF[4459]==0&false));
		}
	}}
	
	public CISource source;
	
}
