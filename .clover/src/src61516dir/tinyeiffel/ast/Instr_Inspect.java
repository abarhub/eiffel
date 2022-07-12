/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ */package tinyeiffel.ast;

import java.io.PrintStream;
import java.util.*;

public class Instr_Inspect extends Instr implements Suite, ToXML
{static class __CLOVER_39_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}
	public Instr_Inspect(Expr expr,Vector when,
		Vector liste_instr)
	{__CLOVER_39_0.cloverRec.M[223]++;
		__CLOVER_39_0.cloverRec.S[1109]++;this.expr=expr;
		__CLOVER_39_0.cloverRec.S[1110]++;this.when=when;
		__CLOVER_39_0.cloverRec.S[1111]++;this.liste_instr=new Instr[liste_instr.size()];
		__CLOVER_39_0.cloverRec.S[1112]++;liste_instr.copyInto(this.liste_instr);
	}

        public Position debut()
        {__CLOVER_39_0.cloverRec.M[224]++;
          __CLOVER_39_0.cloverRec.S[1113]++;return tinspect.debut();
        }

	public Expr expr;
	public Vector when;
	public Instr[] liste_instr;
	private Instr suivant;
        public Token tinspect,twhen,tthen;
	/* (non-Javadoc)
	 * @see ast.Instr#check_egal(ast.Instr)
	 */
	public void check_egal(Instr instr) {__CLOVER_39_0.cloverRec.M[225]++;
		assert((((instr!=null)) && (++__CLOVER_39_0.cloverRec.CT[434]!=0|true)) || (++__CLOVER_39_0.cloverRec.CF[434]==0&false));
		assert((((instr instanceof Instr_Inspect)) && (++__CLOVER_39_0.cloverRec.CT[435]!=0|true)) || (++__CLOVER_39_0.cloverRec.CF[435]==0&false));
		__CLOVER_39_0.cloverRec.S[1114]++;Instr_Inspect ins=(Instr_Inspect)instr;
		__CLOVER_39_0.cloverRec.S[1115]++;int i;
		assert((((liste_instr.length==ins.liste_instr.length)) && (++__CLOVER_39_0.cloverRec.CT[436]!=0|true)) || (++__CLOVER_39_0.cloverRec.CF[436]==0&false));
		__CLOVER_39_0.cloverRec.S[1116]++;for(i=0;(((i<liste_instr.length) && (++__CLOVER_39_0.cloverRec.CT[437]!=0|true)) || (++__CLOVER_39_0.cloverRec.CF[437]==0&false));i++)
		{{
			__CLOVER_39_0.cloverRec.S[1117]++;liste_instr[i].check_egal(ins.liste_instr[i]);
		}
		}assert((((when.size()==ins.when.size())) && (++__CLOVER_39_0.cloverRec.CT[438]!=0|true)) || (++__CLOVER_39_0.cloverRec.CF[438]==0&false));
		__CLOVER_39_0.cloverRec.S[1118]++;for(i=0;(((i<when.size()) && (++__CLOVER_39_0.cloverRec.CT[439]!=0|true)) || (++__CLOVER_39_0.cloverRec.CF[439]==0&false));i++)
		{{
			__CLOVER_39_0.cloverRec.S[1119]++;Vector v1=(Vector)when.elementAt(i);
			__CLOVER_39_0.cloverRec.S[1120]++;Vector u1=(Vector)ins.when.elementAt(i);
			assert((((v1.size()==u1.size())) && (++__CLOVER_39_0.cloverRec.CT[440]!=0|true)) || (++__CLOVER_39_0.cloverRec.CF[440]==0&false));
			__CLOVER_39_0.cloverRec.S[1121]++;for(int j=0;(((j<v1.size()) && (++__CLOVER_39_0.cloverRec.CT[441]!=0|true)) || (++__CLOVER_39_0.cloverRec.CF[441]==0&false));j++)
			{{
				assert((((v1.elementAt(j) instanceof Expr)) && (++__CLOVER_39_0.cloverRec.CT[442]!=0|true)) || (++__CLOVER_39_0.cloverRec.CF[442]==0&false));
				assert((((u1.elementAt(j) instanceof Expr)) && (++__CLOVER_39_0.cloverRec.CT[443]!=0|true)) || (++__CLOVER_39_0.cloverRec.CF[443]==0&false));
				__CLOVER_39_0.cloverRec.S[1122]++;Expr e=(Expr)v1.elementAt(j);
				__CLOVER_39_0.cloverRec.S[1123]++;Expr e2=(Expr)u1.elementAt(j);
				__CLOVER_39_0.cloverRec.S[1124]++;e.check_egal(e2);
			}
		}}
		}__CLOVER_39_0.cloverRec.S[1125]++;expr.check_egal(ins.expr);
		__CLOVER_39_0.cloverRec.S[1126]++;if((((suivant==null) && (++__CLOVER_39_0.cloverRec.CT[444]!=0|true)) || (++__CLOVER_39_0.cloverRec.CF[444]==0&false)))
			{assert((((ins.suivant==null)) && (++__CLOVER_39_0.cloverRec.CT[445]!=0|true)) || (++__CLOVER_39_0.cloverRec.CF[445]==0&false));
		}else
			{__CLOVER_39_0.cloverRec.S[1127]++;suivant.check_egal(ins.suivant);
	}}

	/* (non-Javadoc)
	 * @see ast.Instr#toXML(java.io.PrintStream)
	 */
	public void toXML(PrintStream out) {__CLOVER_39_0.cloverRec.M[226]++;
		__CLOVER_39_0.cloverRec.S[1128]++;out.println("<instruction>");
		__CLOVER_39_0.cloverRec.S[1129]++;out.println("<inspect>");
		__CLOVER_39_0.cloverRec.S[1130]++;expr.toXML(out);
		__CLOVER_39_0.cloverRec.S[1131]++;Instr ins=this;
		__CLOVER_39_0.cloverRec.S[1132]++;Instr_Inspect insi;
		__CLOVER_39_0.cloverRec.S[1133]++;while((((ins!=null) && (++__CLOVER_39_0.cloverRec.CT[446]!=0|true)) || (++__CLOVER_39_0.cloverRec.CF[446]==0&false)))
		{{
			assert((((ins instanceof Instr_Inspect)) && (++__CLOVER_39_0.cloverRec.CT[447]!=0|true)) || (++__CLOVER_39_0.cloverRec.CF[447]==0&false));
			__CLOVER_39_0.cloverRec.S[1134]++;insi=(Instr_Inspect)ins;
			__CLOVER_39_0.cloverRec.S[1135]++;Expr e;
			__CLOVER_39_0.cloverRec.S[1136]++;out.println("<when_then>");
			__CLOVER_39_0.cloverRec.S[1137]++;for(int i=0;(((i<insi.when.size()) && (++__CLOVER_39_0.cloverRec.CT[448]!=0|true)) || (++__CLOVER_39_0.cloverRec.CF[448]==0&false));i++)
			{{
				__CLOVER_39_0.cloverRec.S[1138]++;out.println("<expression_when>");
				assert((((insi.when.elementAt(i) instanceof Vector)) && (++__CLOVER_39_0.cloverRec.CT[449]!=0|true)) || (++__CLOVER_39_0.cloverRec.CF[449]==0&false));
				__CLOVER_39_0.cloverRec.S[1139]++;Vector v=(Vector)insi.when.elementAt(i);
				__CLOVER_39_0.cloverRec.S[1140]++;for(int j=0;(((j<v.size()) && (++__CLOVER_39_0.cloverRec.CT[450]!=0|true)) || (++__CLOVER_39_0.cloverRec.CF[450]==0&false));j++)
				{{
					assert((((v.elementAt(j) instanceof Expr)) && (++__CLOVER_39_0.cloverRec.CT[451]!=0|true)) || (++__CLOVER_39_0.cloverRec.CF[451]==0&false));
					__CLOVER_39_0.cloverRec.S[1141]++;e=(Expr)v.elementAt(j);
					__CLOVER_39_0.cloverRec.S[1142]++;e.toXML(out);
				}
				}__CLOVER_39_0.cloverRec.S[1143]++;out.println("</expression_when>");
			}
			}__CLOVER_39_0.cloverRec.S[1144]++;for(int k=0;(((k<insi.liste_instr.length) && (++__CLOVER_39_0.cloverRec.CT[452]!=0|true)) || (++__CLOVER_39_0.cloverRec.CF[452]==0&false));k++)
			{{
				__CLOVER_39_0.cloverRec.S[1145]++;insi.liste_instr[k].toXML(out);
			}
			}__CLOVER_39_0.cloverRec.S[1146]++;out.println("</when_then>");
			__CLOVER_39_0.cloverRec.S[1147]++;ins=((Suite)ins).getSuivant();
		}
		}__CLOVER_39_0.cloverRec.S[1148]++;out.println("</inspect>");
		__CLOVER_39_0.cloverRec.S[1149]++;out.println("</instruction>");
	}

	/* (non-Javadoc)
	 * @see ast.Suite#getSuivant()
	 */
	public Instr getSuivant() {__CLOVER_39_0.cloverRec.M[227]++;
		__CLOVER_39_0.cloverRec.S[1150]++;return suivant;
	}

	/* (non-Javadoc)
	 * @see ast.Suite#setSuivant(ast.Instr)
	 */
	public void setSuivant(Instr instr) {__CLOVER_39_0.cloverRec.M[228]++;
		assert((((instr!=null)) && (++__CLOVER_39_0.cloverRec.CT[453]!=0|true)) || (++__CLOVER_39_0.cloverRec.CF[453]==0&false));
		__CLOVER_39_0.cloverRec.S[1151]++;suivant=instr;
	}

}