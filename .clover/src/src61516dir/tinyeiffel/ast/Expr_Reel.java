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

public class Expr_Reel extends Expr implements ToXML {static class __CLOVER_16_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}
  public Expr_Reel(String reel,Token oper) {__CLOVER_16_0.cloverRec.M[95]++;
    __CLOVER_16_0.cloverRec.S[535]++;this.op=Expr.Reel;
    __CLOVER_16_0.cloverRec.S[536]++;str=reel;
    __CLOVER_16_0.cloverRec.S[537]++;this.oper=oper;
  }

      public Position debut()
      {__CLOVER_16_0.cloverRec.M[96]++;
        __CLOVER_16_0.cloverRec.S[538]++;if((((oper==null) && (++__CLOVER_16_0.cloverRec.CT[160]!=0|true)) || (++__CLOVER_16_0.cloverRec.CF[160]==0&false)))
        {{
          __CLOVER_16_0.cloverRec.S[539]++;System.out.println("op="+op);
          assert((((false)) && (++__CLOVER_16_0.cloverRec.CT[161]!=0|true)) || (++__CLOVER_16_0.cloverRec.CF[161]==0&false));
          //return new Position(-1,-1);
        }
        }__CLOVER_16_0.cloverRec.S[540]++;return oper.debut();
      }

      public final Token oper;
      public final String str;
	/* (non-Javadoc)
	 * @see ast.Expr#check_egal(ast.Expr)
	 */
	public void check_egal(Expr e) {__CLOVER_16_0.cloverRec.M[97]++;
		assert((((e!=null)) && (++__CLOVER_16_0.cloverRec.CT[162]!=0|true)) || (++__CLOVER_16_0.cloverRec.CF[162]==0&false));
		assert((((e instanceof Expr_Reel)) && (++__CLOVER_16_0.cloverRec.CT[163]!=0|true)) || (++__CLOVER_16_0.cloverRec.CF[163]==0&false));
		__CLOVER_16_0.cloverRec.S[541]++;Expr_Reel e2=(Expr_Reel)e;
		assert((((str.equals(e2.str))) && (++__CLOVER_16_0.cloverRec.CT[164]!=0|true)) || (++__CLOVER_16_0.cloverRec.CF[164]==0&false));
	}

	/* (non-Javadoc)
	 * @see ast.Expr#toXML(java.io.PrintStream)
	 */
	public void toXML(PrintStream out) {__CLOVER_16_0.cloverRec.M[98]++;
		assert((((out!=null)) && (++__CLOVER_16_0.cloverRec.CT[165]!=0|true)) || (++__CLOVER_16_0.cloverRec.CF[165]==0&false));
		__CLOVER_16_0.cloverRec.S[542]++;out.println("<expression>");
		__CLOVER_16_0.cloverRec.S[543]++;out.println("<reel valeur=\""+str+"\" />");
		__CLOVER_16_0.cloverRec.S[544]++;out.println("</expression>");
	}

	public String toString()
	{__CLOVER_16_0.cloverRec.M[99]++;
		__CLOVER_16_0.cloverRec.S[545]++;return str;
	}

}