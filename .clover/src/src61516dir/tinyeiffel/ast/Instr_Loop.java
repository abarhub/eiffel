/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ */package tinyeiffel.ast;

import java.io.PrintStream;
import java.util.*;

public class Instr_Loop extends Instr implements ToXML
{static class __CLOVER_40_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}
	public Instr_Loop(Expr expr,Vector from,Vector loop,
		Vector invariant,Expr variant)
	{__CLOVER_40_0.cloverRec.M[229]++;
		__CLOVER_40_0.cloverRec.S[1152]++;this.expr=expr;
		__CLOVER_40_0.cloverRec.S[1153]++;this.from=new Instr[from.size()];
		__CLOVER_40_0.cloverRec.S[1154]++;from.copyInto(this.from);
		__CLOVER_40_0.cloverRec.S[1155]++;this.loop=new Instr[loop.size()];
		__CLOVER_40_0.cloverRec.S[1156]++;loop.copyInto(this.loop);
		__CLOVER_40_0.cloverRec.S[1157]++;this.invariant=new Assert[invariant.size()];
		__CLOVER_40_0.cloverRec.S[1158]++;invariant.copyInto(this.invariant);
		__CLOVER_40_0.cloverRec.S[1159]++;this.variant=variant;
	}

        public void set_token(Token tfrom,Token tuntil,Token tinvariant,
                              Token tvariant,Token tloop,Token tend)
        {__CLOVER_40_0.cloverRec.M[230]++;
          __CLOVER_40_0.cloverRec.S[1160]++;this.tfrom=tfrom;
          __CLOVER_40_0.cloverRec.S[1161]++;this.tuntil=tuntil;
          __CLOVER_40_0.cloverRec.S[1162]++;this.tinvariant=tinvariant;
          __CLOVER_40_0.cloverRec.S[1163]++;this.tvariant=tvariant;
          __CLOVER_40_0.cloverRec.S[1164]++;this.tloop=tloop;
          __CLOVER_40_0.cloverRec.S[1165]++;this.tend=tend;
        }

        public Position debut()
        {__CLOVER_40_0.cloverRec.M[231]++;
          __CLOVER_40_0.cloverRec.S[1166]++;return tfrom.debut();
        }

	public Expr expr;
	public Instr from[];
	public Instr loop[];
	public Assert invariant[];
	public Expr variant;
        public Token tfrom,tuntil,tinvariant,tvariant,tloop,tend;
	/* (non-Javadoc)
	 * @see ast.Instr#check_egal(ast.Instr)
	 */
	public void check_egal(Instr instr) {__CLOVER_40_0.cloverRec.M[232]++;
		assert((((instr!=null)) && (++__CLOVER_40_0.cloverRec.CT[454]!=0|true)) || (++__CLOVER_40_0.cloverRec.CF[454]==0&false));
		assert((((instr instanceof Instr_Loop)) && (++__CLOVER_40_0.cloverRec.CT[455]!=0|true)) || (++__CLOVER_40_0.cloverRec.CF[455]==0&false));
		__CLOVER_40_0.cloverRec.S[1167]++;Instr_Loop ins=(Instr_Loop)instr;
		__CLOVER_40_0.cloverRec.S[1168]++;int i;
		assert((((from.length==ins.from.length)) && (++__CLOVER_40_0.cloverRec.CT[456]!=0|true)) || (++__CLOVER_40_0.cloverRec.CF[456]==0&false));
		__CLOVER_40_0.cloverRec.S[1169]++;for(i=0;(((i<from.length) && (++__CLOVER_40_0.cloverRec.CT[457]!=0|true)) || (++__CLOVER_40_0.cloverRec.CF[457]==0&false));i++)
		{{
			__CLOVER_40_0.cloverRec.S[1170]++;from[i].check_egal(ins.from[i]);
		}
		/******/
		}assert((((loop.length==ins.loop.length)) && (++__CLOVER_40_0.cloverRec.CT[458]!=0|true)) || (++__CLOVER_40_0.cloverRec.CF[458]==0&false));
		__CLOVER_40_0.cloverRec.S[1171]++;for(i=0;(((i<loop.length) && (++__CLOVER_40_0.cloverRec.CT[459]!=0|true)) || (++__CLOVER_40_0.cloverRec.CF[459]==0&false));i++)
		{{
			__CLOVER_40_0.cloverRec.S[1172]++;loop[i].check_egal(ins.loop[i]);
		}
		/*****/
		}assert((((invariant.length==ins.invariant.length)) && (++__CLOVER_40_0.cloverRec.CT[460]!=0|true)) || (++__CLOVER_40_0.cloverRec.CF[460]==0&false));
		__CLOVER_40_0.cloverRec.S[1173]++;for(i=0;(((i<invariant.length) && (++__CLOVER_40_0.cloverRec.CT[461]!=0|true)) || (++__CLOVER_40_0.cloverRec.CF[461]==0&false));i++)
		{{
			__CLOVER_40_0.cloverRec.S[1174]++;invariant[i].check_egal(ins.invariant[i]);
		}
		}__CLOVER_40_0.cloverRec.S[1175]++;expr.check_egal(ins.expr);
		__CLOVER_40_0.cloverRec.S[1176]++;if((((variant==null) && (++__CLOVER_40_0.cloverRec.CT[462]!=0|true)) || (++__CLOVER_40_0.cloverRec.CF[462]==0&false)))
			{assert((((ins.variant==null)) && (++__CLOVER_40_0.cloverRec.CT[463]!=0|true)) || (++__CLOVER_40_0.cloverRec.CF[463]==0&false));
		}else
			{__CLOVER_40_0.cloverRec.S[1177]++;variant.check_egal(ins.variant);
	}}

	/* (non-Javadoc)
	 * @see ast.Instr#toXML(java.io.PrintStream)
	 */
	public void toXML(PrintStream out) {__CLOVER_40_0.cloverRec.M[233]++;
		assert((((out!=null)) && (++__CLOVER_40_0.cloverRec.CT[464]!=0|true)) || (++__CLOVER_40_0.cloverRec.CF[464]==0&false));
		__CLOVER_40_0.cloverRec.S[1178]++;int i;
		__CLOVER_40_0.cloverRec.S[1179]++;out.println("<instruction>");
		__CLOVER_40_0.cloverRec.S[1180]++;out.println("<loop>");
		__CLOVER_40_0.cloverRec.S[1181]++;if((((from!=null) && (++__CLOVER_40_0.cloverRec.CT[465]!=0|true)) || (++__CLOVER_40_0.cloverRec.CF[465]==0&false)))
		{{
			__CLOVER_40_0.cloverRec.S[1182]++;for(i=0;(((i<from.length) && (++__CLOVER_40_0.cloverRec.CT[466]!=0|true)) || (++__CLOVER_40_0.cloverRec.CF[466]==0&false));i++)
				{__CLOVER_40_0.cloverRec.S[1183]++;from[i].toXML(out);
		}}
		}__CLOVER_40_0.cloverRec.S[1184]++;expr.toXML(out);
		__CLOVER_40_0.cloverRec.S[1185]++;if((((variant!=null) && (++__CLOVER_40_0.cloverRec.CT[467]!=0|true)) || (++__CLOVER_40_0.cloverRec.CF[467]==0&false)))
		{{
			__CLOVER_40_0.cloverRec.S[1186]++;out.println("<variant>");
			__CLOVER_40_0.cloverRec.S[1187]++;variant.toXML(out);
			__CLOVER_40_0.cloverRec.S[1188]++;out.println("</variant>");
		}	
		}__CLOVER_40_0.cloverRec.S[1189]++;if((((invariant!=null&&invariant.length>0) && (++__CLOVER_40_0.cloverRec.CT[468]!=0|true)) || (++__CLOVER_40_0.cloverRec.CF[468]==0&false)))
		{{
			__CLOVER_40_0.cloverRec.S[1190]++;out.println("<invariant>");
			__CLOVER_40_0.cloverRec.S[1191]++;for(i=0;(((i<invariant.length) && (++__CLOVER_40_0.cloverRec.CT[469]!=0|true)) || (++__CLOVER_40_0.cloverRec.CF[469]==0&false));i++)
			{{
				__CLOVER_40_0.cloverRec.S[1192]++;invariant[i].toXML(out);
			}
			}__CLOVER_40_0.cloverRec.S[1193]++;out.println("</invariant>");
		}
		}__CLOVER_40_0.cloverRec.S[1194]++;if((((loop!=null) && (++__CLOVER_40_0.cloverRec.CT[470]!=0|true)) || (++__CLOVER_40_0.cloverRec.CF[470]==0&false)))
		{{
			__CLOVER_40_0.cloverRec.S[1195]++;for(i=0;(((i<loop.length) && (++__CLOVER_40_0.cloverRec.CT[471]!=0|true)) || (++__CLOVER_40_0.cloverRec.CF[471]==0&false));i++)
				{__CLOVER_40_0.cloverRec.S[1196]++;loop[i].toXML(out);
		}}
		}__CLOVER_40_0.cloverRec.S[1197]++;out.println("</loop>");
		__CLOVER_40_0.cloverRec.S[1198]++;out.println("</instruction>");
	}

}