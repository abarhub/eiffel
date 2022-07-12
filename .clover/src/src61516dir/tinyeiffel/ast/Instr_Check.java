/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ */package tinyeiffel.ast;

import java.io.PrintStream;
import java.util.*;

public class Instr_Check extends Instr implements ToXML
{static class __CLOVER_33_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}
	public Instr_Check(Vector expr)
	{__CLOVER_33_0.cloverRec.M[193]++;
		__CLOVER_33_0.cloverRec.S[981]++;liste_expr=new Assert[expr.size()];
		__CLOVER_33_0.cloverRec.S[982]++;expr.copyInto(liste_expr);
	}

        public Position debut()
        {__CLOVER_33_0.cloverRec.M[194]++;
          __CLOVER_33_0.cloverRec.S[983]++;return tcheck.debut();
        }

	public Assert liste_expr[];
        public Token tcheck,tend;
	/* (non-Javadoc)
	 * @see ast.Instr#check_egal(ast.Instr)
	 */
	public void check_egal(Instr instr) {__CLOVER_33_0.cloverRec.M[195]++;
		assert((((instr!=null)) && (++__CLOVER_33_0.cloverRec.CT[367]!=0|true)) || (++__CLOVER_33_0.cloverRec.CF[367]==0&false));
		assert((((instr instanceof Instr_Check)) && (++__CLOVER_33_0.cloverRec.CT[368]!=0|true)) || (++__CLOVER_33_0.cloverRec.CF[368]==0&false));
		__CLOVER_33_0.cloverRec.S[984]++;Instr_Check ins=(Instr_Check)instr;
		__CLOVER_33_0.cloverRec.S[985]++;int i;
		assert((((liste_expr.length==ins.liste_expr.length)) && (++__CLOVER_33_0.cloverRec.CT[369]!=0|true)) || (++__CLOVER_33_0.cloverRec.CF[369]==0&false));
		__CLOVER_33_0.cloverRec.S[986]++;for(i=0;(((i<liste_expr.length) && (++__CLOVER_33_0.cloverRec.CT[370]!=0|true)) || (++__CLOVER_33_0.cloverRec.CF[370]==0&false));i++)
		{{
			__CLOVER_33_0.cloverRec.S[987]++;liste_expr[i].check_egal(ins.liste_expr[i]);
		}
	}}

	/* (non-Javadoc)
	 * @see ast.Instr#toXML(java.io.PrintStream)
	 */
	public void toXML(PrintStream out) {__CLOVER_33_0.cloverRec.M[196]++;
		__CLOVER_33_0.cloverRec.S[988]++;out.println("<instruction>");
		__CLOVER_33_0.cloverRec.S[989]++;out.println("<check>");
		__CLOVER_33_0.cloverRec.S[990]++;if((((liste_expr!=null) && (++__CLOVER_33_0.cloverRec.CT[371]!=0|true)) || (++__CLOVER_33_0.cloverRec.CF[371]==0&false)))
		{{
			__CLOVER_33_0.cloverRec.S[991]++;for(int i=0;(((i<liste_expr.length) && (++__CLOVER_33_0.cloverRec.CT[372]!=0|true)) || (++__CLOVER_33_0.cloverRec.CF[372]==0&false));i++)
			{{
				__CLOVER_33_0.cloverRec.S[992]++;liste_expr[i].toXML(out);
			}
		}}
		}__CLOVER_33_0.cloverRec.S[993]++;out.println("</check>");
		__CLOVER_33_0.cloverRec.S[994]++;out.println("</instruction>");
	}

}