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

public class Expr_Entier extends Expr implements ToXML {static class __CLOVER_14_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}

  public Expr_Entier(String entier,Token oper) {__CLOVER_14_0.cloverRec.M[85]++;
    __CLOVER_14_0.cloverRec.S[515]++;this.op=Expr.Entier;
    __CLOVER_14_0.cloverRec.S[516]++;str=entier;
    __CLOVER_14_0.cloverRec.S[517]++;this.oper=oper;
  }


    public Position debut()
    {__CLOVER_14_0.cloverRec.M[86]++;
      __CLOVER_14_0.cloverRec.S[518]++;if((((oper==null) && (++__CLOVER_14_0.cloverRec.CT[149]!=0|true)) || (++__CLOVER_14_0.cloverRec.CF[149]==0&false)))
      {{
        __CLOVER_14_0.cloverRec.S[519]++;System.out.println("op="+op);
        assert((((false)) && (++__CLOVER_14_0.cloverRec.CT[150]!=0|true)) || (++__CLOVER_14_0.cloverRec.CF[150]==0&false));
        //return new Position(-1,-1);
      }
      }__CLOVER_14_0.cloverRec.S[520]++;return oper.debut();
    }

    public final Token oper;
    public final String str;
	/* (non-Javadoc)
	 * @see ast.Expr#check_egal(ast.Expr)
	 */
	public void check_egal(Expr e) {__CLOVER_14_0.cloverRec.M[87]++;
		assert((((e!=null)) && (++__CLOVER_14_0.cloverRec.CT[151]!=0|true)) || (++__CLOVER_14_0.cloverRec.CF[151]==0&false));
		assert((((e instanceof Expr_Entier)) && (++__CLOVER_14_0.cloverRec.CT[152]!=0|true)) || (++__CLOVER_14_0.cloverRec.CF[152]==0&false));
		__CLOVER_14_0.cloverRec.S[521]++;Expr_Entier e2=(Expr_Entier)e;
		assert((((str.equals(e2.str))) && (++__CLOVER_14_0.cloverRec.CT[153]!=0|true)) || (++__CLOVER_14_0.cloverRec.CF[153]==0&false));
	}

	public String toString()
	{__CLOVER_14_0.cloverRec.M[88]++;
		__CLOVER_14_0.cloverRec.S[522]++;return str;
	}

	/* (non-Javadoc)
	 * @see ast.Expr#toXML(java.io.PrintStream)
	 */
	public void toXML(PrintStream out) {__CLOVER_14_0.cloverRec.M[89]++;
		assert((((out!=null)) && (++__CLOVER_14_0.cloverRec.CT[154]!=0|true)) || (++__CLOVER_14_0.cloverRec.CF[154]==0&false));
		__CLOVER_14_0.cloverRec.S[523]++;out.println("<expression>");
		__CLOVER_14_0.cloverRec.S[524]++;out.println("<entier valeur=\""+str+"\" />");
		__CLOVER_14_0.cloverRec.S[525]++;out.println("</expression>");
	}

}