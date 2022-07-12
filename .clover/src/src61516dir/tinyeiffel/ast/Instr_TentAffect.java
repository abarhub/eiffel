/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ */package tinyeiffel.ast;

import java.io.PrintStream;

public class Instr_TentAffect extends Instr implements ToXML
{static class __CLOVER_42_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}
	public Instr_TentAffect(String nom,Expr expr)
	{__CLOVER_42_0.cloverRec.M[238]++;
		__CLOVER_42_0.cloverRec.S[1204]++;this.nom=nom;
		__CLOVER_42_0.cloverRec.S[1205]++;this.expr=expr;
	}

        public void set_token(Token tid,Token tegal)
        {__CLOVER_42_0.cloverRec.M[239]++;
           __CLOVER_42_0.cloverRec.S[1206]++;this.tid=tid;
           __CLOVER_42_0.cloverRec.S[1207]++;this.tegal=tegal;
        }

        public Position debut()
        {__CLOVER_42_0.cloverRec.M[240]++;
        	__CLOVER_42_0.cloverRec.S[1208]++;if((((tcurrent!=null) && (++__CLOVER_42_0.cloverRec.CT[475]!=0|true)) || (++__CLOVER_42_0.cloverRec.CF[475]==0&false)))
        		{__CLOVER_42_0.cloverRec.S[1209]++;return tcurrent.debut();
        	}else
          		{__CLOVER_42_0.cloverRec.S[1210]++;return tid.debut();
        }}

	public Expr expr;
	public String nom,var_current;
        public Token tid,tegal,tcurrent;
	/* (non-Javadoc)
	 * @see ast.Instr#check_egal(ast.Instr)
	 */
	public void check_egal(Instr instr) {__CLOVER_42_0.cloverRec.M[241]++;
		assert((((instr!=null)) && (++__CLOVER_42_0.cloverRec.CT[476]!=0|true)) || (++__CLOVER_42_0.cloverRec.CF[476]==0&false));
		assert((((instr instanceof Instr_TentAffect)) && (++__CLOVER_42_0.cloverRec.CT[477]!=0|true)) || (++__CLOVER_42_0.cloverRec.CF[477]==0&false));
		__CLOVER_42_0.cloverRec.S[1211]++;Instr_TentAffect ins=(Instr_TentAffect)instr;
		assert((((nom.equals(ins.nom))) && (++__CLOVER_42_0.cloverRec.CT[478]!=0|true)) || (++__CLOVER_42_0.cloverRec.CF[478]==0&false));
		__CLOVER_42_0.cloverRec.S[1212]++;expr.check_egal(ins.expr);
		__CLOVER_42_0.cloverRec.S[1213]++;if((((var_current==null) && (++__CLOVER_42_0.cloverRec.CT[479]!=0|true)) || (++__CLOVER_42_0.cloverRec.CF[479]==0&false)))
		{{
			assert((((ins.var_current==null)) && (++__CLOVER_42_0.cloverRec.CT[480]!=0|true)) || (++__CLOVER_42_0.cloverRec.CF[480]==0&false));
		}
		}else
		{{
			assert((((var_current.equalsIgnoreCase(ins.var_current))) && (++__CLOVER_42_0.cloverRec.CT[481]!=0|true)) || (++__CLOVER_42_0.cloverRec.CF[481]==0&false));
		}
	}}

	/* (non-Javadoc)
	 * @see ast.Instr#toXML(java.io.PrintStream)
	 */
	public void toXML(PrintStream out) {__CLOVER_42_0.cloverRec.M[242]++;
		assert((((out!=null)) && (++__CLOVER_42_0.cloverRec.CT[482]!=0|true)) || (++__CLOVER_42_0.cloverRec.CF[482]==0&false));
		__CLOVER_42_0.cloverRec.S[1214]++;out.println("<instruction>");
		__CLOVER_42_0.cloverRec.S[1215]++;if((((var_current!=null) && (++__CLOVER_42_0.cloverRec.CT[483]!=0|true)) || (++__CLOVER_42_0.cloverRec.CF[483]==0&false)))
		{{
			__CLOVER_42_0.cloverRec.S[1216]++;out.println("<tentative_affect current=\""+var_current+"\">");
		}
		}else
		{{
			__CLOVER_42_0.cloverRec.S[1217]++;out.println("<tentative_affect>");
		}
		}__CLOVER_42_0.cloverRec.S[1218]++;out.println("<variable nom=\""+nom+"\" />");
		__CLOVER_42_0.cloverRec.S[1219]++;expr.toXML(out);
		__CLOVER_42_0.cloverRec.S[1220]++;out.println("</tentative_affect>");
		__CLOVER_42_0.cloverRec.S[1221]++;out.println("</instruction>");
	}

}