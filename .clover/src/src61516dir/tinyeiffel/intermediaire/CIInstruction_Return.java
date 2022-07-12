/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ *//*
 * Created on 22 f\u00e9vr. 2004
 *
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
package tinyeiffel.intermediaire;

import java.io.PrintStream;

/**
 * @author BARRET
 *
 * To change the template for this generated type comment go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
public class CIInstruction_Return extends CIInstruction {static class __CLOVER_216_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}

	/**
	 * 
	 */
	public CIInstruction_Return(CISource source) {__CLOVER_216_0.cloverRec.M[1271]++;
		__CLOVER_216_0.cloverRec.S[18850]++;this.source=source;
	}

	/* (non-Javadoc)
	 * @see intermediaire.Instruction#affiche(java.io.PrintStream)
	 */
	public void affiche(PrintStream out) {__CLOVER_216_0.cloverRec.M[1272]++;
		assert((((out!=null)) && (++__CLOVER_216_0.cloverRec.CT[5216]!=0|true)) || (++__CLOVER_216_0.cloverRec.CF[5216]==0&false));
		__CLOVER_216_0.cloverRec.S[18851]++;out.println("Return");
	}

	/* (non-Javadoc)
	 * @see intermediaire.Instruction#toXML(java.io.PrintStream)
	 */
	public void toXML(PrintStream out) {__CLOVER_216_0.cloverRec.M[1273]++;
		assert((((out!=null)) && (++__CLOVER_216_0.cloverRec.CT[5217]!=0|true)) || (++__CLOVER_216_0.cloverRec.CF[5217]==0&false));
		__CLOVER_216_0.cloverRec.S[18852]++;out.print("<instr_return ");
		__CLOVER_216_0.cloverRec.S[18853]++;if((((source!=null) && (++__CLOVER_216_0.cloverRec.CT[5218]!=0|true)) || (++__CLOVER_216_0.cloverRec.CF[5218]==0&false)))
		{{
			__CLOVER_216_0.cloverRec.S[18854]++;out.println(">");
			__CLOVER_216_0.cloverRec.S[18855]++;source.toXML(out);
			__CLOVER_216_0.cloverRec.S[18856]++;out.println("</instr_return>");
		}
		}else
		{{
			__CLOVER_216_0.cloverRec.S[18857]++;out.println(" />");
		}
	}}

	/* (non-Javadoc)
	 * @see intermediaire.Instruction#check_egal(intermediaire.Instruction)
	 */
	public void check_egal(CIInstruction instr) {__CLOVER_216_0.cloverRec.M[1274]++;
		assert((((instr!=null)) && (++__CLOVER_216_0.cloverRec.CT[5219]!=0|true)) || (++__CLOVER_216_0.cloverRec.CF[5219]==0&false));
		assert((((instr instanceof CIInstruction_Return)) && (++__CLOVER_216_0.cloverRec.CT[5220]!=0|true)) || (++__CLOVER_216_0.cloverRec.CF[5220]==0&false));
		__CLOVER_216_0.cloverRec.S[18858]++;if((((source!=null) && (++__CLOVER_216_0.cloverRec.CT[5221]!=0|true)) || (++__CLOVER_216_0.cloverRec.CF[5221]==0&false)))
		{{
			__CLOVER_216_0.cloverRec.S[18859]++;source.check_egal(((CIInstruction_Return)instr).source);
		}
		}else
		{{
			assert((((((CIInstruction_Return)instr).source==null)) && (++__CLOVER_216_0.cloverRec.CT[5222]!=0|true)) || (++__CLOVER_216_0.cloverRec.CF[5222]==0&false));
		}
	}}

	public CISource source;
}
