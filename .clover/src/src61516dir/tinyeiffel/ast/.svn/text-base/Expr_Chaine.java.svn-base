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

public class Expr_Chaine extends Expr implements ToXML {static class __CLOVER_13_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}
  public Expr_Chaine(Chaine str) {__CLOVER_13_0.cloverRec.M[80]++;
      __CLOVER_13_0.cloverRec.S[501]++;this.op=Expr.Chaine;
      assert((((str!=null)) && (++__CLOVER_13_0.cloverRec.CT[139]!=0|true)) || (++__CLOVER_13_0.cloverRec.CF[139]==0&false));
      //assert(false);
      assert((((str.oper!=null)) && (++__CLOVER_13_0.cloverRec.CT[140]!=0|true)) || (++__CLOVER_13_0.cloverRec.CF[140]==0&false));
      __CLOVER_13_0.cloverRec.S[502]++;this.str2=str;
      __CLOVER_13_0.cloverRec.S[503]++;this.oper=str.oper;
      assert((((str.oper!=null)) && (++__CLOVER_13_0.cloverRec.CT[141]!=0|true)) || (++__CLOVER_13_0.cloverRec.CF[141]==0&false));
      //this.oper=str.oper;
      assert((((this.oper!=null)) && (++__CLOVER_13_0.cloverRec.CT[142]!=0|true)) || (++__CLOVER_13_0.cloverRec.CF[142]==0&false));
    }


     public Position debut()
      {__CLOVER_13_0.cloverRec.M[81]++;
        __CLOVER_13_0.cloverRec.S[504]++;if((((oper==null) && (++__CLOVER_13_0.cloverRec.CT[143]!=0|true)) || (++__CLOVER_13_0.cloverRec.CF[143]==0&false)))
        {{
          __CLOVER_13_0.cloverRec.S[505]++;System.out.println("op=" + op);
          assert ((((false)) && (++__CLOVER_13_0.cloverRec.CT[144]!=0|true)) || (++__CLOVER_13_0.cloverRec.CF[144]==0&false));
        }
        }__CLOVER_13_0.cloverRec.S[506]++;if((((oper==null) && (++__CLOVER_13_0.cloverRec.CT[145]!=0|true)) || (++__CLOVER_13_0.cloverRec.CF[145]==0&false)))
          {__CLOVER_13_0.cloverRec.S[507]++;return str2.oper.debut();
        }else
          {__CLOVER_13_0.cloverRec.S[508]++;return oper.debut();
      }}

      public final Token oper;
      public final Chaine str2;
	/* (non-Javadoc)
	 * @see ast.Expr#check_egal(ast.Expr)
	 */
	public void check_egal(Expr e) {__CLOVER_13_0.cloverRec.M[82]++;
		assert((((e!=null)) && (++__CLOVER_13_0.cloverRec.CT[146]!=0|true)) || (++__CLOVER_13_0.cloverRec.CF[146]==0&false));
		assert((((e instanceof Expr_Chaine)) && (++__CLOVER_13_0.cloverRec.CT[147]!=0|true)) || (++__CLOVER_13_0.cloverRec.CF[147]==0&false));
		__CLOVER_13_0.cloverRec.S[509]++;Expr_Chaine e2=(Expr_Chaine)e;
		__CLOVER_13_0.cloverRec.S[510]++;str2.check_egal(e2.str2);
	}

	/* (non-Javadoc)
	 * @see ast.Expr#toXML(java.io.PrintStream)
	 */
	public void toXML(PrintStream out) {__CLOVER_13_0.cloverRec.M[83]++;
		assert((((out!=null)) && (++__CLOVER_13_0.cloverRec.CT[148]!=0|true)) || (++__CLOVER_13_0.cloverRec.CF[148]==0&false));
		__CLOVER_13_0.cloverRec.S[511]++;out.println("<expression>");
		__CLOVER_13_0.cloverRec.S[512]++;str2.toXML(out);
		__CLOVER_13_0.cloverRec.S[513]++;out.println("</expression>");
	}

	public String toString()
	{__CLOVER_13_0.cloverRec.M[84]++;
		__CLOVER_13_0.cloverRec.S[514]++;return str2.toString();
	}

}