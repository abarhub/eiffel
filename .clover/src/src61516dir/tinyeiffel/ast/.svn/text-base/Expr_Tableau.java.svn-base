/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ */package tinyeiffel.ast;

import java.io.PrintStream;
import java.util.Vector;

/**
 * <p>Title: l'ast d'eiffel</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>Company: </p>
 * @author Barret Alain
 * @version 1.0
 */

public class Expr_Tableau extends Expr implements ToXML {static class __CLOVER_17_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}
  public Expr_Tableau(Vector tableau,Token oper) {__CLOVER_17_0.cloverRec.M[100]++;
    __CLOVER_17_0.cloverRec.S[546]++;this.op=Expr.Tableau;
    assert((((oper!=null)) && (++__CLOVER_17_0.cloverRec.CT[166]!=0|true)) || (++__CLOVER_17_0.cloverRec.CF[166]==0&false));
    __CLOVER_17_0.cloverRec.S[547]++;this.tableau=tableau;
    __CLOVER_17_0.cloverRec.S[548]++;this.oper=oper;
  }

    public Position debut()
    {__CLOVER_17_0.cloverRec.M[101]++;
      assert((((false)) && (++__CLOVER_17_0.cloverRec.CT[167]!=0|true)) || (++__CLOVER_17_0.cloverRec.CF[167]==0&false));
      __CLOVER_17_0.cloverRec.S[549]++;return null;
    }

    public Vector tableau;
    public Token oper;
	/* (non-Javadoc)
	 * @see ast.Expr#check_egal(ast.Expr)
	 */
	public void check_egal(Expr e) {__CLOVER_17_0.cloverRec.M[102]++;
		assert((((e!=null)) && (++__CLOVER_17_0.cloverRec.CT[168]!=0|true)) || (++__CLOVER_17_0.cloverRec.CF[168]==0&false));
		assert((((e instanceof Expr_Tableau)) && (++__CLOVER_17_0.cloverRec.CT[169]!=0|true)) || (++__CLOVER_17_0.cloverRec.CF[169]==0&false));
		__CLOVER_17_0.cloverRec.S[550]++;Expr_Tableau e2=(Expr_Tableau)e;
		assert((((tableau.size()==e2.tableau.size())) && (++__CLOVER_17_0.cloverRec.CT[170]!=0|true)) || (++__CLOVER_17_0.cloverRec.CF[170]==0&false));
		__CLOVER_17_0.cloverRec.S[551]++;for(int i=0;(((i<tableau.size()) && (++__CLOVER_17_0.cloverRec.CT[171]!=0|true)) || (++__CLOVER_17_0.cloverRec.CF[171]==0&false));i++)
		{{
			__CLOVER_17_0.cloverRec.S[552]++;Expr e3=(Expr)tableau.elementAt(i);
			__CLOVER_17_0.cloverRec.S[553]++;Expr e4=(Expr)e2.tableau.elementAt(i);
			__CLOVER_17_0.cloverRec.S[554]++;e3.check_egal(e4);		
		}
	}}

	/* (non-Javadoc)
	 * @see ast.Expr#toXML(java.io.PrintStream)
	 */
	public void toXML(PrintStream out) {__CLOVER_17_0.cloverRec.M[103]++;
		assert((((out!=null)) && (++__CLOVER_17_0.cloverRec.CT[172]!=0|true)) || (++__CLOVER_17_0.cloverRec.CF[172]==0&false));
		__CLOVER_17_0.cloverRec.S[555]++;out.println("<expression>");

		__CLOVER_17_0.cloverRec.S[556]++;out.println("<tableau>");
		__CLOVER_17_0.cloverRec.S[557]++;if((((tableau!=null) && (++__CLOVER_17_0.cloverRec.CT[173]!=0|true)) || (++__CLOVER_17_0.cloverRec.CF[173]==0&false)))
		{{
			__CLOVER_17_0.cloverRec.S[558]++;for(int i=0;(((i<tableau.size()) && (++__CLOVER_17_0.cloverRec.CT[174]!=0|true)) || (++__CLOVER_17_0.cloverRec.CF[174]==0&false));i++)
			{{
				__CLOVER_17_0.cloverRec.S[559]++;((Expr)tableau.elementAt(i)).toXML(out);
			}
		}}
		}__CLOVER_17_0.cloverRec.S[560]++;out.println("</tableau>");
		__CLOVER_17_0.cloverRec.S[561]++;out.println("</expression>");
	}

	public String toString()
	{__CLOVER_17_0.cloverRec.M[104]++;
		__CLOVER_17_0.cloverRec.S[562]++;String res;
		__CLOVER_17_0.cloverRec.S[563]++;res="<<";
		__CLOVER_17_0.cloverRec.S[564]++;if((((tableau!=null) && (++__CLOVER_17_0.cloverRec.CT[175]!=0|true)) || (++__CLOVER_17_0.cloverRec.CF[175]==0&false)))
		{{
			__CLOVER_17_0.cloverRec.S[565]++;for(int i=0;(((i<tableau.size()) && (++__CLOVER_17_0.cloverRec.CT[176]!=0|true)) || (++__CLOVER_17_0.cloverRec.CF[176]==0&false));i++)
			{{
				__CLOVER_17_0.cloverRec.S[566]++;if((((i>0) && (++__CLOVER_17_0.cloverRec.CT[177]!=0|true)) || (++__CLOVER_17_0.cloverRec.CF[177]==0&false)))
					{__CLOVER_17_0.cloverRec.S[567]++;res+=",";
				}__CLOVER_17_0.cloverRec.S[568]++;res+=tableau.elementAt(i);
			}
		}}
		}__CLOVER_17_0.cloverRec.S[569]++;res+=">>";
		__CLOVER_17_0.cloverRec.S[570]++;return res;
	}

}