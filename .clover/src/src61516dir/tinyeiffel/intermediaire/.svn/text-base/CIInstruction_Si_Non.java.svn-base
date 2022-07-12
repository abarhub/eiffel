/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ *//*
 * Created on 29 mars 2004
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
public class CIInstruction_Si_Non extends CIInstruction {static class __CLOVER_218_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}

	/**
	 * 
	 */
	public CIInstruction_Si_Non(CIExpr expr,String label,
			CISource source) {__CLOVER_218_0.cloverRec.M[1279]++;
		assert((((expr!=null)) && (++__CLOVER_218_0.cloverRec.CT[5235]!=0|true)) || (++__CLOVER_218_0.cloverRec.CF[5235]==0&false));
		assert((((label!=null)) && (++__CLOVER_218_0.cloverRec.CT[5236]!=0|true)) || (++__CLOVER_218_0.cloverRec.CF[5236]==0&false));
		__CLOVER_218_0.cloverRec.S[18875]++;this.expr=expr;
		__CLOVER_218_0.cloverRec.S[18876]++;this.label=label;
		__CLOVER_218_0.cloverRec.S[18877]++;this.source=source;
	}

	public void affiche(PrintStream out)
	{__CLOVER_218_0.cloverRec.M[1280]++;
		__CLOVER_218_0.cloverRec.S[18878]++;out.println("If_not "+expr+" then "+label);
	}

	public void toXML(PrintStream out)
	{__CLOVER_218_0.cloverRec.M[1281]++;
		__CLOVER_218_0.cloverRec.S[18879]++;out.println("<instr_si_non label=\""+label+"\">");
		__CLOVER_218_0.cloverRec.S[18880]++;out.println("<expression>");
		__CLOVER_218_0.cloverRec.S[18881]++;expr.toXML(out);
		__CLOVER_218_0.cloverRec.S[18882]++;out.println("</expression>");
		__CLOVER_218_0.cloverRec.S[18883]++;if((((source!=null) && (++__CLOVER_218_0.cloverRec.CT[5237]!=0|true)) || (++__CLOVER_218_0.cloverRec.CF[5237]==0&false)))
		{{
			__CLOVER_218_0.cloverRec.S[18884]++;source.toXML(out);
		}
		}__CLOVER_218_0.cloverRec.S[18885]++;out.println("</instr_si_non>");
	}

	public void check_egal(CIInstruction instr)
	{__CLOVER_218_0.cloverRec.M[1282]++;
		assert((((instr!=null)) && (++__CLOVER_218_0.cloverRec.CT[5238]!=0|true)) || (++__CLOVER_218_0.cloverRec.CF[5238]==0&false));
		assert((((instr instanceof CIInstruction_Si_Non)) && (++__CLOVER_218_0.cloverRec.CT[5239]!=0|true)) || (++__CLOVER_218_0.cloverRec.CF[5239]==0&false));
		__CLOVER_218_0.cloverRec.S[18886]++;CIInstruction_Si_Non ins=(CIInstruction_Si_Non)instr;
		assert((((label!=null)) && (++__CLOVER_218_0.cloverRec.CT[5240]!=0|true)) || (++__CLOVER_218_0.cloverRec.CF[5240]==0&false));
		assert((((ins.label!=null)) && (++__CLOVER_218_0.cloverRec.CT[5241]!=0|true)) || (++__CLOVER_218_0.cloverRec.CF[5241]==0&false));
		assert((((expr!=null)) && (++__CLOVER_218_0.cloverRec.CT[5242]!=0|true)) || (++__CLOVER_218_0.cloverRec.CF[5242]==0&false));
		assert((((ins.expr!=null)) && (++__CLOVER_218_0.cloverRec.CT[5243]!=0|true)) || (++__CLOVER_218_0.cloverRec.CF[5243]==0&false));
		assert((((label.equalsIgnoreCase(ins.label))) && (++__CLOVER_218_0.cloverRec.CT[5244]!=0|true)) || (++__CLOVER_218_0.cloverRec.CF[5244]==0&false));
		__CLOVER_218_0.cloverRec.S[18887]++;expr.check_egal(ins.expr);
		__CLOVER_218_0.cloverRec.S[18888]++;if((((source!=null) && (++__CLOVER_218_0.cloverRec.CT[5245]!=0|true)) || (++__CLOVER_218_0.cloverRec.CF[5245]==0&false)))
		{{
			__CLOVER_218_0.cloverRec.S[18889]++;source.check_egal(ins.source);
		}
		}else
		{{
			assert((((ins.source==null)) && (++__CLOVER_218_0.cloverRec.CT[5246]!=0|true)) || (++__CLOVER_218_0.cloverRec.CF[5246]==0&false));
		}
	}}
	
	public String label;
	public CIExpr expr;
	public CISource source;

}
