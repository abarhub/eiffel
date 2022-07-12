/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ */package tinyeiffel.ast;

import java.io.PrintStream;

/**
 * <p>Title: l'ast d'eiffel</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>Company: </p>
 * @author Barret Alain
 * @version 1.0
 */

public class Expr_Var extends Expr implements ToXML {static class __CLOVER_19_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}
  public Expr_Var(String nom,Token oper) {__CLOVER_19_0.cloverRec.M[113]++;
    __CLOVER_19_0.cloverRec.S[632]++;this.op=Expr.Var;
    assert((((nom!=null)) && (++__CLOVER_19_0.cloverRec.CT[194]!=0|true)) || (++__CLOVER_19_0.cloverRec.CF[194]==0&false));
    assert((((oper!=null)) && (++__CLOVER_19_0.cloverRec.CT[195]!=0|true)) || (++__CLOVER_19_0.cloverRec.CF[195]==0&false));
    assert((((!nom.equals(""))) && (++__CLOVER_19_0.cloverRec.CT[196]!=0|true)) || (++__CLOVER_19_0.cloverRec.CF[196]==0&false));
    __CLOVER_19_0.cloverRec.S[633]++;this.nom=nom;
    __CLOVER_19_0.cloverRec.S[634]++;this.oper=oper;
  }

  public Position debut()
  {__CLOVER_19_0.cloverRec.M[114]++;
    assert((((oper!=null)) && (++__CLOVER_19_0.cloverRec.CT[197]!=0|true)) || (++__CLOVER_19_0.cloverRec.CF[197]==0&false));
    __CLOVER_19_0.cloverRec.S[635]++;Position p=oper.debut();
    assert((((p!=null)) && (++__CLOVER_19_0.cloverRec.CT[198]!=0|true)) || (++__CLOVER_19_0.cloverRec.CF[198]==0&false));
    __CLOVER_19_0.cloverRec.S[636]++;return p;
  }

  public final String nom;
  public final Token oper;
	/* (non-Javadoc)
	 * @see ast.Expr#check_egal(ast.Expr)
	 */
	public void check_egal(Expr e) {__CLOVER_19_0.cloverRec.M[115]++;
		assert((((e!=null)) && (++__CLOVER_19_0.cloverRec.CT[199]!=0|true)) || (++__CLOVER_19_0.cloverRec.CF[199]==0&false));
		assert((((e instanceof Expr_Var)) && (++__CLOVER_19_0.cloverRec.CT[200]!=0|true)) || (++__CLOVER_19_0.cloverRec.CF[200]==0&false)):"different:"+
			this.toString()+"/="+e.toString();
		__CLOVER_19_0.cloverRec.S[637]++;Expr_Var e2=(Expr_Var)e;
		assert((((nom.equals(e2.nom))) && (++__CLOVER_19_0.cloverRec.CT[201]!=0|true)) || (++__CLOVER_19_0.cloverRec.CF[201]==0&false));
	}

	/* (non-Javadoc)
	 * @see ast.Expr#toXML(java.io.PrintStream)
	 */
	public void toXML(PrintStream out) {__CLOVER_19_0.cloverRec.M[116]++;
		assert((((out!=null)) && (++__CLOVER_19_0.cloverRec.CT[202]!=0|true)) || (++__CLOVER_19_0.cloverRec.CF[202]==0&false));
		__CLOVER_19_0.cloverRec.S[638]++;out.println("<expression>");
		__CLOVER_19_0.cloverRec.S[639]++;out.println("<variable nom=\""+nom+"\"/>");
		__CLOVER_19_0.cloverRec.S[640]++;out.println("</expression>");
	}

	public String toString()
	{__CLOVER_19_0.cloverRec.M[117]++;
		__CLOVER_19_0.cloverRec.S[641]++;return nom;
	}

}