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
public class CIInstruction_Si extends CIInstruction {static class __CLOVER_217_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}

	/**
	 * 
	 */
	public CIInstruction_Si(CIExpr expr,String label,
			CISource source) {__CLOVER_217_0.cloverRec.M[1275]++;
		assert((((expr!=null)) && (++__CLOVER_217_0.cloverRec.CT[5223]!=0|true)) || (++__CLOVER_217_0.cloverRec.CF[5223]==0&false));
		assert((((label!=null)) && (++__CLOVER_217_0.cloverRec.CT[5224]!=0|true)) || (++__CLOVER_217_0.cloverRec.CF[5224]==0&false));
		__CLOVER_217_0.cloverRec.S[18860]++;this.expr=expr;
		__CLOVER_217_0.cloverRec.S[18861]++;this.label=label;
		__CLOVER_217_0.cloverRec.S[18862]++;this.source=source;
	}

	public void affiche(PrintStream out)
	{__CLOVER_217_0.cloverRec.M[1276]++;
		__CLOVER_217_0.cloverRec.S[18863]++;out.println("If "+expr+" then "+label);
	}

	public void toXML(PrintStream out)
	{__CLOVER_217_0.cloverRec.M[1277]++;
		__CLOVER_217_0.cloverRec.S[18864]++;out.println("<instr_si label=\""+label+"\">");
		__CLOVER_217_0.cloverRec.S[18865]++;out.println("<expression>");
		__CLOVER_217_0.cloverRec.S[18866]++;expr.toXML(out);
		__CLOVER_217_0.cloverRec.S[18867]++;out.println("</expression>");
		__CLOVER_217_0.cloverRec.S[18868]++;if((((source!=null) && (++__CLOVER_217_0.cloverRec.CT[5225]!=0|true)) || (++__CLOVER_217_0.cloverRec.CF[5225]==0&false)))
		{{
			__CLOVER_217_0.cloverRec.S[18869]++;source.toXML(out);
		}
		}__CLOVER_217_0.cloverRec.S[18870]++;out.println("</instr_si>");
	}

	public void check_egal(CIInstruction instr)
	{__CLOVER_217_0.cloverRec.M[1278]++;
		assert((((instr!=null)) && (++__CLOVER_217_0.cloverRec.CT[5226]!=0|true)) || (++__CLOVER_217_0.cloverRec.CF[5226]==0&false));
		assert((((instr instanceof CIInstruction_Si)) && (++__CLOVER_217_0.cloverRec.CT[5227]!=0|true)) || (++__CLOVER_217_0.cloverRec.CF[5227]==0&false));
		__CLOVER_217_0.cloverRec.S[18871]++;CIInstruction_Si ins=(CIInstruction_Si)instr;
		assert((((label!=null)) && (++__CLOVER_217_0.cloverRec.CT[5228]!=0|true)) || (++__CLOVER_217_0.cloverRec.CF[5228]==0&false));
		assert((((ins.label!=null)) && (++__CLOVER_217_0.cloverRec.CT[5229]!=0|true)) || (++__CLOVER_217_0.cloverRec.CF[5229]==0&false));
		assert((((expr!=null)) && (++__CLOVER_217_0.cloverRec.CT[5230]!=0|true)) || (++__CLOVER_217_0.cloverRec.CF[5230]==0&false));
		assert((((ins.expr!=null)) && (++__CLOVER_217_0.cloverRec.CT[5231]!=0|true)) || (++__CLOVER_217_0.cloverRec.CF[5231]==0&false));
		assert((((label.equalsIgnoreCase(ins.label))) && (++__CLOVER_217_0.cloverRec.CT[5232]!=0|true)) || (++__CLOVER_217_0.cloverRec.CF[5232]==0&false));
		__CLOVER_217_0.cloverRec.S[18872]++;expr.check_egal(ins.expr);
		__CLOVER_217_0.cloverRec.S[18873]++;if((((source!=null) && (++__CLOVER_217_0.cloverRec.CT[5233]!=0|true)) || (++__CLOVER_217_0.cloverRec.CF[5233]==0&false)))
		{{
			__CLOVER_217_0.cloverRec.S[18874]++;source.check_egal(ins.source);
		}
		}else
		{{
			assert((((ins.source==null)) && (++__CLOVER_217_0.cloverRec.CT[5234]!=0|true)) || (++__CLOVER_217_0.cloverRec.CF[5234]==0&false));
		}
	}}
	
	public String label;
	public CIExpr expr;
	public CISource source;

}
