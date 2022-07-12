/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ *//*
 * Created on 5 f\u00e9vr. 2004
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
public class CIExpr_Bool extends CIExpr_Scalaire {static class __CLOVER_197_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}

	/**
	 * 
	 */
	public CIExpr_Bool(boolean bool,CISource source) {__CLOVER_197_0.cloverRec.M[1161]++;
		__CLOVER_197_0.cloverRec.S[17321]++;this.bool=bool;
		__CLOVER_197_0.cloverRec.S[17322]++;this.source=source;
	}

	public String toString()
	{__CLOVER_197_0.cloverRec.M[1162]++;
		__CLOVER_197_0.cloverRec.S[17323]++;return ""+bool;
	}
	
	public void toXML(PrintStream out)
	{__CLOVER_197_0.cloverRec.M[1163]++;
		__CLOVER_197_0.cloverRec.S[17324]++;out.print("<expression_scalaire type=\"booleen\" text=\""+bool+"\" ");
		__CLOVER_197_0.cloverRec.S[17325]++;if((((source!=null) && (++__CLOVER_197_0.cloverRec.CT[4336]!=0|true)) || (++__CLOVER_197_0.cloverRec.CF[4336]==0&false)))
		{{
			__CLOVER_197_0.cloverRec.S[17326]++;out.println("/>");
			__CLOVER_197_0.cloverRec.S[17327]++;source.toXML(out);
			__CLOVER_197_0.cloverRec.S[17328]++;out.println("</expression_scalaire>");
		}
		}else
		{{
			__CLOVER_197_0.cloverRec.S[17329]++;out.println("/>");
		}
	}}

	public void check_egal(CIExpr e)
	{__CLOVER_197_0.cloverRec.M[1164]++;
		assert((((e!=null)) && (++__CLOVER_197_0.cloverRec.CT[4337]!=0|true)) || (++__CLOVER_197_0.cloverRec.CF[4337]==0&false));
		assert((((e instanceof CIExpr_Bool)) && (++__CLOVER_197_0.cloverRec.CT[4338]!=0|true)) || (++__CLOVER_197_0.cloverRec.CF[4338]==0&false));
		__CLOVER_197_0.cloverRec.S[17330]++;CIExpr_Bool e2=(CIExpr_Bool)e;
		assert((((bool==e2.bool)) && (++__CLOVER_197_0.cloverRec.CT[4339]!=0|true)) || (++__CLOVER_197_0.cloverRec.CF[4339]==0&false));
		__CLOVER_197_0.cloverRec.S[17331]++;if((((source!=null) && (++__CLOVER_197_0.cloverRec.CT[4340]!=0|true)) || (++__CLOVER_197_0.cloverRec.CF[4340]==0&false)))
		{{
			__CLOVER_197_0.cloverRec.S[17332]++;source.check_egal(e2.source);
		}
		}else
		{{
			assert((((e2.source==null)) && (++__CLOVER_197_0.cloverRec.CT[4341]!=0|true)) || (++__CLOVER_197_0.cloverRec.CF[4341]==0&false));
		}
	}}
	
	public final boolean bool;
	public CISource source;

}
