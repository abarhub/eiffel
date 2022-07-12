/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ */package tinyeiffel.ast;

import java.io.PrintStream;

public class Instr_Affect extends Instr implements ToXML
{static class __CLOVER_31_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}
	public Instr_Affect(String nom,Expr expr)
	{__CLOVER_31_0.cloverRec.M[181]++;
		__CLOVER_31_0.cloverRec.S[921]++;this.expr=expr;
		__CLOVER_31_0.cloverRec.S[922]++;this.nom=nom;
	}

        public void set_token(Token tid,Token tegal)
        {__CLOVER_31_0.cloverRec.M[182]++;
          __CLOVER_31_0.cloverRec.S[923]++;this.tid=tid;
          __CLOVER_31_0.cloverRec.S[924]++;this.tegal=tegal;
        }

        public Position debut()
        {__CLOVER_31_0.cloverRec.M[183]++;
        	__CLOVER_31_0.cloverRec.S[925]++;if((((tcurrent!=null) && (++__CLOVER_31_0.cloverRec.CT[336]!=0|true)) || (++__CLOVER_31_0.cloverRec.CF[336]==0&false)))
        		{__CLOVER_31_0.cloverRec.S[926]++;return tcurrent.debut();
          	}else
          		{__CLOVER_31_0.cloverRec.S[927]++;return tid.debut();
        }}

	public Expr expr;
	public String nom,var_current;
        public Token tid,tegal,tcurrent;
		/* (non-Javadoc)
		 * @see ast.Instr#check_egal(ast.Instr)
		 */
		public void check_egal(Instr instr) {__CLOVER_31_0.cloverRec.M[184]++;
			assert((((instr!=null)) && (++__CLOVER_31_0.cloverRec.CT[337]!=0|true)) || (++__CLOVER_31_0.cloverRec.CF[337]==0&false));
			assert((((instr instanceof Instr_Affect)) && (++__CLOVER_31_0.cloverRec.CT[338]!=0|true)) || (++__CLOVER_31_0.cloverRec.CF[338]==0&false));
			__CLOVER_31_0.cloverRec.S[928]++;Instr_Affect ins=(Instr_Affect)instr;
			assert((((nom.equals(ins.nom))) && (++__CLOVER_31_0.cloverRec.CT[339]!=0|true)) || (++__CLOVER_31_0.cloverRec.CF[339]==0&false));
			__CLOVER_31_0.cloverRec.S[929]++;expr.check_egal(ins.expr);
			__CLOVER_31_0.cloverRec.S[930]++;if((((var_current==null) && (++__CLOVER_31_0.cloverRec.CT[340]!=0|true)) || (++__CLOVER_31_0.cloverRec.CF[340]==0&false)))
				{assert((((ins.var_current==null)) && (++__CLOVER_31_0.cloverRec.CT[341]!=0|true)) || (++__CLOVER_31_0.cloverRec.CF[341]==0&false));
			}else
				{assert((((var_current.equalsIgnoreCase(ins.var_current))) && (++__CLOVER_31_0.cloverRec.CT[342]!=0|true)) || (++__CLOVER_31_0.cloverRec.CF[342]==0&false));
		}}
	/* (non-Javadoc)
	 * @see ast.Instr#toXML(java.io.PrintStream)
	 */
	public void toXML(PrintStream out) {__CLOVER_31_0.cloverRec.M[185]++;
		assert((((out!=null)) && (++__CLOVER_31_0.cloverRec.CT[343]!=0|true)) || (++__CLOVER_31_0.cloverRec.CF[343]==0&false));
		__CLOVER_31_0.cloverRec.S[931]++;out.println("<instruction>");
		__CLOVER_31_0.cloverRec.S[932]++;if((((var_current!=null) && (++__CLOVER_31_0.cloverRec.CT[344]!=0|true)) || (++__CLOVER_31_0.cloverRec.CF[344]==0&false)))
		{{
			__CLOVER_31_0.cloverRec.S[933]++;out.println("<affect current=\""+var_current+"\">");
		}
		}else
		{{
			__CLOVER_31_0.cloverRec.S[934]++;out.println("<affect>");
		}
		}__CLOVER_31_0.cloverRec.S[935]++;out.println("<variable nom=\""+nom+"\" />");
		__CLOVER_31_0.cloverRec.S[936]++;expr.toXML(out);
		__CLOVER_31_0.cloverRec.S[937]++;out.println("</affect>");
		__CLOVER_31_0.cloverRec.S[938]++;out.println("</instruction>");
	}

}