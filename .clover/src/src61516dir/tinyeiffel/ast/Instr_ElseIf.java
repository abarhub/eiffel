/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ */package tinyeiffel.ast;

import java.io.PrintStream;
import java.util.*;

public class Instr_ElseIf extends Instr implements Suite, ToXML
{static class __CLOVER_37_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}
	public Instr_ElseIf(Expr e,Vector instr)
	{__CLOVER_37_0.cloverRec.M[211]++;
		__CLOVER_37_0.cloverRec.S[1062]++;expr=e;
		__CLOVER_37_0.cloverRec.S[1063]++;liste_instr=new Instr[instr.size()];
		__CLOVER_37_0.cloverRec.S[1064]++;instr.copyInto(liste_instr);
	}

        public Position debut()
        {__CLOVER_37_0.cloverRec.M[212]++;
          __CLOVER_37_0.cloverRec.S[1065]++;return telseif.debut();
        }

	public Expr expr;
	public Instr liste_instr[];
	private Instr suivant;
        public Token telseif,tthen;
	/* (non-Javadoc)
	 * @see ast.Instr#check_egal(ast.Instr)
	 */
	public void check_egal(Instr instr) {__CLOVER_37_0.cloverRec.M[213]++;
		assert((((instr!=null)) && (++__CLOVER_37_0.cloverRec.CT[409]!=0|true)) || (++__CLOVER_37_0.cloverRec.CF[409]==0&false));
		assert((((instr instanceof Instr_ElseIf)) && (++__CLOVER_37_0.cloverRec.CT[410]!=0|true)) || (++__CLOVER_37_0.cloverRec.CF[410]==0&false));
		__CLOVER_37_0.cloverRec.S[1066]++;Instr_ElseIf ins=(Instr_ElseIf)instr;
		__CLOVER_37_0.cloverRec.S[1067]++;int i;
		assert((((liste_instr.length==ins.liste_instr.length)) && (++__CLOVER_37_0.cloverRec.CT[411]!=0|true)) || (++__CLOVER_37_0.cloverRec.CF[411]==0&false));
		__CLOVER_37_0.cloverRec.S[1068]++;for(i=0;(((i<liste_instr.length) && (++__CLOVER_37_0.cloverRec.CT[412]!=0|true)) || (++__CLOVER_37_0.cloverRec.CF[412]==0&false));i++)
		{{
			__CLOVER_37_0.cloverRec.S[1069]++;liste_instr[i].check_egal(ins.liste_instr[i]);
		}
		}__CLOVER_37_0.cloverRec.S[1070]++;expr.check_egal(ins.expr);
		__CLOVER_37_0.cloverRec.S[1071]++;if((((suivant==null) && (++__CLOVER_37_0.cloverRec.CT[413]!=0|true)) || (++__CLOVER_37_0.cloverRec.CF[413]==0&false)))
		{{
			assert((((ins.suivant==null)) && (++__CLOVER_37_0.cloverRec.CT[414]!=0|true)) || (++__CLOVER_37_0.cloverRec.CF[414]==0&false));
		}
		}else
		{{
			assert((((ins.suivant!=null)) && (++__CLOVER_37_0.cloverRec.CT[415]!=0|true)) || (++__CLOVER_37_0.cloverRec.CF[415]==0&false));
			__CLOVER_37_0.cloverRec.S[1072]++;suivant.check_egal(ins.suivant);
		}
	}}

	/* (non-Javadoc)
	 * @see ast.Instr#toXML(java.io.PrintStream)
	 */
	public void toXML(PrintStream out) {__CLOVER_37_0.cloverRec.M[214]++;
		assert((((out!=null)) && (++__CLOVER_37_0.cloverRec.CT[416]!=0|true)) || (++__CLOVER_37_0.cloverRec.CF[416]==0&false));
		__CLOVER_37_0.cloverRec.S[1073]++;out.println("<elseif>");
		__CLOVER_37_0.cloverRec.S[1074]++;expr.toXML(out);
		__CLOVER_37_0.cloverRec.S[1075]++;int i;
		__CLOVER_37_0.cloverRec.S[1076]++;if((((liste_instr!=null) && (++__CLOVER_37_0.cloverRec.CT[417]!=0|true)) || (++__CLOVER_37_0.cloverRec.CF[417]==0&false)))
		{{
			__CLOVER_37_0.cloverRec.S[1077]++;for(i=0;(((i<liste_instr.length) && (++__CLOVER_37_0.cloverRec.CT[418]!=0|true)) || (++__CLOVER_37_0.cloverRec.CF[418]==0&false));i++)
			{{
				__CLOVER_37_0.cloverRec.S[1078]++;liste_instr[i].toXML(out);
			}
		}}
		}__CLOVER_37_0.cloverRec.S[1079]++;out.println("</elseif>");
	}

	/* (non-Javadoc)
	 * @see ast.Suite#getSuivant()
	 */
	public Instr getSuivant() {__CLOVER_37_0.cloverRec.M[215]++;
		__CLOVER_37_0.cloverRec.S[1080]++;return suivant;
	}

	/* (non-Javadoc)
	 * @see ast.Suite#setSuivant(ast.Instr)
	 */
	public void setSuivant(Instr instr) {__CLOVER_37_0.cloverRec.M[216]++;
		assert((((instr!=null)) && (++__CLOVER_37_0.cloverRec.CT[419]!=0|true)) || (++__CLOVER_37_0.cloverRec.CF[419]==0&false));
		__CLOVER_37_0.cloverRec.S[1081]++;suivant=instr;
	}

}