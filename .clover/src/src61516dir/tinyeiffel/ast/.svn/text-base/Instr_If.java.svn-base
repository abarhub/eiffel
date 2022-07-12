/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ */package tinyeiffel.ast;

import java.io.PrintStream;
import java.util.*;

public class Instr_If extends Instr implements Suite, ToXML
{static class __CLOVER_38_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}
	public Instr_If(Expr expr,Vector instr)
	{__CLOVER_38_0.cloverRec.M[217]++;
		__CLOVER_38_0.cloverRec.S[1082]++;this.expr=expr;
		__CLOVER_38_0.cloverRec.S[1083]++;this.liste_instr=new Instr[instr.size()];
		__CLOVER_38_0.cloverRec.S[1084]++;instr.copyInto(this.liste_instr);
	}

        public Position debut()
        {__CLOVER_38_0.cloverRec.M[218]++;
          __CLOVER_38_0.cloverRec.S[1085]++;return tif.debut();
        }

	public Expr expr;
	public Instr liste_instr[];
	private Instr suivant;
        public Token tif,tthen;
	/* (non-Javadoc)
	 * @see ast.Instr#check_egal(ast.Instr)
	 */
	public void check_egal(Instr instr) {__CLOVER_38_0.cloverRec.M[219]++;
		assert((((instr!=null)) && (++__CLOVER_38_0.cloverRec.CT[420]!=0|true)) || (++__CLOVER_38_0.cloverRec.CF[420]==0&false));
		assert((((instr instanceof Instr_If)) && (++__CLOVER_38_0.cloverRec.CT[421]!=0|true)) || (++__CLOVER_38_0.cloverRec.CF[421]==0&false));
		__CLOVER_38_0.cloverRec.S[1086]++;Instr_If ins=(Instr_If)instr;
		__CLOVER_38_0.cloverRec.S[1087]++;int i;
		__CLOVER_38_0.cloverRec.S[1088]++;if((((liste_instr==null) && (++__CLOVER_38_0.cloverRec.CT[422]!=0|true)) || (++__CLOVER_38_0.cloverRec.CF[422]==0&false)))
			{assert((((ins.liste_instr==null)) && (++__CLOVER_38_0.cloverRec.CT[423]!=0|true)) || (++__CLOVER_38_0.cloverRec.CF[423]==0&false));
		}else
		{{
			assert((((liste_instr.length==ins.liste_instr.length)) && (++__CLOVER_38_0.cloverRec.CT[424]!=0|true)) || (++__CLOVER_38_0.cloverRec.CF[424]==0&false));
			__CLOVER_38_0.cloverRec.S[1089]++;for(i=0;(((i<liste_instr.length) && (++__CLOVER_38_0.cloverRec.CT[425]!=0|true)) || (++__CLOVER_38_0.cloverRec.CF[425]==0&false));i++)
			{{
				__CLOVER_38_0.cloverRec.S[1090]++;liste_instr[i].check_egal(ins.liste_instr[i]);
			}
		}}
		}__CLOVER_38_0.cloverRec.S[1091]++;expr.check_egal(ins.expr);
		__CLOVER_38_0.cloverRec.S[1092]++;if((((suivant==null) && (++__CLOVER_38_0.cloverRec.CT[426]!=0|true)) || (++__CLOVER_38_0.cloverRec.CF[426]==0&false)))
			{assert((((ins.suivant==null)) && (++__CLOVER_38_0.cloverRec.CT[427]!=0|true)) || (++__CLOVER_38_0.cloverRec.CF[427]==0&false));
		}else
		{{
			assert((((ins.suivant!=null)) && (++__CLOVER_38_0.cloverRec.CT[428]!=0|true)) || (++__CLOVER_38_0.cloverRec.CF[428]==0&false));
			__CLOVER_38_0.cloverRec.S[1093]++;suivant.check_egal(ins.suivant);
		}
	}}

	/* (non-Javadoc)
	 * @see ast.Instr#toXML(java.io.PrintStream)
	 */
	public void toXML(PrintStream out) {__CLOVER_38_0.cloverRec.M[220]++;
		assert((((out!=null)) && (++__CLOVER_38_0.cloverRec.CT[429]!=0|true)) || (++__CLOVER_38_0.cloverRec.CF[429]==0&false));
		__CLOVER_38_0.cloverRec.S[1094]++;out.println("<instruction>");
		__CLOVER_38_0.cloverRec.S[1095]++;out.println("<if>");
		__CLOVER_38_0.cloverRec.S[1096]++;expr.toXML(out);
		__CLOVER_38_0.cloverRec.S[1097]++;int i;
		__CLOVER_38_0.cloverRec.S[1098]++;if((((liste_instr!=null) && (++__CLOVER_38_0.cloverRec.CT[430]!=0|true)) || (++__CLOVER_38_0.cloverRec.CF[430]==0&false)))
		{{
			__CLOVER_38_0.cloverRec.S[1099]++;for(i=0;(((i<liste_instr.length) && (++__CLOVER_38_0.cloverRec.CT[431]!=0|true)) || (++__CLOVER_38_0.cloverRec.CF[431]==0&false));i++)
			{{
				__CLOVER_38_0.cloverRec.S[1100]++;liste_instr[i].toXML(out);
			}
		}}
		}__CLOVER_38_0.cloverRec.S[1101]++;Instr ins=suivant;
		__CLOVER_38_0.cloverRec.S[1102]++;while((((ins!=null) && (++__CLOVER_38_0.cloverRec.CT[432]!=0|true)) || (++__CLOVER_38_0.cloverRec.CF[432]==0&false)))
		{{
			__CLOVER_38_0.cloverRec.S[1103]++;ins.toXML(out);
			__CLOVER_38_0.cloverRec.S[1104]++;ins=((Suite)ins).getSuivant();
		}
		}__CLOVER_38_0.cloverRec.S[1105]++;out.println("</if>");
		__CLOVER_38_0.cloverRec.S[1106]++;out.println("</instruction>");
	}

	/* (non-Javadoc)
	 * @see ast.Suite#getSuivant()
	 */
	public Instr getSuivant() {__CLOVER_38_0.cloverRec.M[221]++;
		__CLOVER_38_0.cloverRec.S[1107]++;return suivant;
	}

	/* (non-Javadoc)
	 * @see ast.Suite#setSuivant(ast.Instr)
	 */
	public void setSuivant(Instr instr) {__CLOVER_38_0.cloverRec.M[222]++;
		assert((((instr!=null)) && (++__CLOVER_38_0.cloverRec.CT[433]!=0|true)) || (++__CLOVER_38_0.cloverRec.CF[433]==0&false));
		__CLOVER_38_0.cloverRec.S[1108]++;suivant=instr;
	}

}