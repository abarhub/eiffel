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

public class Expr_Appel extends Expr implements ToXML {static class __CLOVER_10_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}
  public Expr_Appel(String nom,Vector param,Token oper) {__CLOVER_10_0.cloverRec.M[62]++;
    __CLOVER_10_0.cloverRec.S[333]++;this.op=Expr.Appel;
    __CLOVER_10_0.cloverRec.S[334]++;this.parametre=param;
    __CLOVER_10_0.cloverRec.S[335]++;this.nom=nom;
    __CLOVER_10_0.cloverRec.S[336]++;this.oper=oper;
  }

    public Position debut()
    {__CLOVER_10_0.cloverRec.M[63]++;
      assert((((oper!=null)) && (++__CLOVER_10_0.cloverRec.CT[100]!=0|true)) || (++__CLOVER_10_0.cloverRec.CF[100]==0&false));
      __CLOVER_10_0.cloverRec.S[337]++;Position p=oper.debut();
      assert((((p!=null)) && (++__CLOVER_10_0.cloverRec.CT[101]!=0|true)) || (++__CLOVER_10_0.cloverRec.CF[101]==0&false));
      __CLOVER_10_0.cloverRec.S[338]++;return p;
    }

    public String nom;
    public Vector parametre;
    public final Token oper;
	/* (non-Javadoc)
	 * @see ast.Expr#check_egal(ast.Expr)
	 */
	public void check_egal(Expr e) {__CLOVER_10_0.cloverRec.M[64]++;
		assert((((e!=null)) && (++__CLOVER_10_0.cloverRec.CT[102]!=0|true)) || (++__CLOVER_10_0.cloverRec.CF[102]==0&false));
		assert((((e instanceof Expr_Appel)) && (++__CLOVER_10_0.cloverRec.CT[103]!=0|true)) || (++__CLOVER_10_0.cloverRec.CF[103]==0&false));
		__CLOVER_10_0.cloverRec.S[339]++;Expr_Appel e2=(Expr_Appel)e;
		assert((((nom.equals(e2.nom))) && (++__CLOVER_10_0.cloverRec.CT[104]!=0|true)) || (++__CLOVER_10_0.cloverRec.CF[104]==0&false));
		assert((((parametre.size()==e2.parametre.size())) && (++__CLOVER_10_0.cloverRec.CT[105]!=0|true)) || (++__CLOVER_10_0.cloverRec.CF[105]==0&false));
		__CLOVER_10_0.cloverRec.S[340]++;for(int i=0;(((i<parametre.size()) && (++__CLOVER_10_0.cloverRec.CT[106]!=0|true)) || (++__CLOVER_10_0.cloverRec.CF[106]==0&false));i++)
		{{
			__CLOVER_10_0.cloverRec.S[341]++;Expr e3=(Expr)parametre.elementAt(i);
			__CLOVER_10_0.cloverRec.S[342]++;Expr e4=(Expr)e2.parametre.elementAt(i);
			__CLOVER_10_0.cloverRec.S[343]++;e3.check_egal(e4);
		}
	}}

	/* (non-Javadoc)
	 * @see ast.Expr#toXML(java.io.PrintStream)
	 */
	public void toXML(PrintStream out) {__CLOVER_10_0.cloverRec.M[65]++;
		assert((((out!=null)) && (++__CLOVER_10_0.cloverRec.CT[107]!=0|true)) || (++__CLOVER_10_0.cloverRec.CF[107]==0&false));
		__CLOVER_10_0.cloverRec.S[344]++;out.println("<expression>");
		__CLOVER_10_0.cloverRec.S[345]++;out.println("<appel nom=\""+nom+"\">");
		__CLOVER_10_0.cloverRec.S[346]++;if((((parametre!=null) && (++__CLOVER_10_0.cloverRec.CT[108]!=0|true)) || (++__CLOVER_10_0.cloverRec.CF[108]==0&false)))
		{{
			__CLOVER_10_0.cloverRec.S[347]++;for(int i=0;(((i<parametre.size()) && (++__CLOVER_10_0.cloverRec.CT[109]!=0|true)) || (++__CLOVER_10_0.cloverRec.CF[109]==0&false));i++)
			{{
				__CLOVER_10_0.cloverRec.S[348]++;out.println("<parametre_reel>");
				__CLOVER_10_0.cloverRec.S[349]++;((Expr)parametre.elementAt(i)).toXML(out);
				__CLOVER_10_0.cloverRec.S[350]++;out.println("</parametre_reel>");
			}
		}}
		}__CLOVER_10_0.cloverRec.S[351]++;out.println("</appel>");
		__CLOVER_10_0.cloverRec.S[352]++;out.println("</expression>");
	}
	
	public String toString()
	{__CLOVER_10_0.cloverRec.M[66]++;
		__CLOVER_10_0.cloverRec.S[353]++;String res;
		__CLOVER_10_0.cloverRec.S[354]++;res=nom+"(";
		__CLOVER_10_0.cloverRec.S[355]++;if((((parametre!=null) && (++__CLOVER_10_0.cloverRec.CT[110]!=0|true)) || (++__CLOVER_10_0.cloverRec.CF[110]==0&false)))
		{{
			__CLOVER_10_0.cloverRec.S[356]++;for(int i=0;(((i<parametre.size()) && (++__CLOVER_10_0.cloverRec.CT[111]!=0|true)) || (++__CLOVER_10_0.cloverRec.CF[111]==0&false));i++)
			{{
				__CLOVER_10_0.cloverRec.S[357]++;if((((i>0) && (++__CLOVER_10_0.cloverRec.CT[112]!=0|true)) || (++__CLOVER_10_0.cloverRec.CF[112]==0&false)))
					{__CLOVER_10_0.cloverRec.S[358]++;res+=",";
				}__CLOVER_10_0.cloverRec.S[359]++;res+=parametre.elementAt(i);
			}
		}}
		}__CLOVER_10_0.cloverRec.S[360]++;res+=")";
		__CLOVER_10_0.cloverRec.S[361]++;return res;
	}
}