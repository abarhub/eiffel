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

public class Expr_Vrai extends Expr implements ToXML {static class __CLOVER_20_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}
  public Expr_Vrai(Token oper) {__CLOVER_20_0.cloverRec.M[118]++;
    __CLOVER_20_0.cloverRec.S[642]++;this.op=Expr.Vrai;
    __CLOVER_20_0.cloverRec.S[643]++;this.oper=oper;
  }

  public Position debut()
  {__CLOVER_20_0.cloverRec.M[119]++;
    __CLOVER_20_0.cloverRec.S[644]++;if((((oper==null) && (++__CLOVER_20_0.cloverRec.CT[203]!=0|true)) || (++__CLOVER_20_0.cloverRec.CF[203]==0&false)))
    {{
      __CLOVER_20_0.cloverRec.S[645]++;System.out.println("op="+op);
      assert((((false)) && (++__CLOVER_20_0.cloverRec.CT[204]!=0|true)) || (++__CLOVER_20_0.cloverRec.CF[204]==0&false));
      //return new Position(-1,-1);
    }
    }__CLOVER_20_0.cloverRec.S[646]++;return oper.debut();
  }

  public final Token oper;

	/* (non-Javadoc)
	 * @see ast.Expr#check_egal(ast.Expr)
	 */
	public void check_egal(Expr e) {__CLOVER_20_0.cloverRec.M[120]++;
		assert((((e!=null)) && (++__CLOVER_20_0.cloverRec.CT[205]!=0|true)) || (++__CLOVER_20_0.cloverRec.CF[205]==0&false));
		assert((((e instanceof Expr_Vrai)) && (++__CLOVER_20_0.cloverRec.CT[206]!=0|true)) || (++__CLOVER_20_0.cloverRec.CF[206]==0&false));
	}

	/* (non-Javadoc)
	 * @see ast.Expr#toXML(java.io.PrintStream)
	 */
	public void toXML(PrintStream out) {__CLOVER_20_0.cloverRec.M[121]++;
		assert((((out!=null)) && (++__CLOVER_20_0.cloverRec.CT[207]!=0|true)) || (++__CLOVER_20_0.cloverRec.CF[207]==0&false));
		__CLOVER_20_0.cloverRec.S[647]++;out.println("<expression>");
		__CLOVER_20_0.cloverRec.S[648]++;out.println("<vrai />");
		__CLOVER_20_0.cloverRec.S[649]++;out.println("</expression>");
	}

	public String toString()
	{__CLOVER_20_0.cloverRec.M[122]++;
		__CLOVER_20_0.cloverRec.S[650]++;return "true";
	}

}