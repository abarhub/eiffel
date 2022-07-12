/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ */package tinyeiffel.ast;

import java.io.PrintStream;

/**
 * <p>Title: l'ast d'eiffel</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>Company: </p>
 * @author not attributable
 * @version 1.0
 */

public class Expr_Car extends Expr implements ToXML
{static class __CLOVER_12_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}
  public Expr_Car(String car,Token oper) {__CLOVER_12_0.cloverRec.M[75]++;
    __CLOVER_12_0.cloverRec.S[488]++;this.op=Expr.Char;
    __CLOVER_12_0.cloverRec.S[489]++;this.car=car;
    __CLOVER_12_0.cloverRec.S[490]++;this.oper=oper;
  }

  public Position debut()
  {__CLOVER_12_0.cloverRec.M[76]++;
    __CLOVER_12_0.cloverRec.S[491]++;if((((oper==null) && (++__CLOVER_12_0.cloverRec.CT[133]!=0|true)) || (++__CLOVER_12_0.cloverRec.CF[133]==0&false)))
    {{
      __CLOVER_12_0.cloverRec.S[492]++;System.out.println("op=" + op);
      assert ((((false)) && (++__CLOVER_12_0.cloverRec.CT[134]!=0|true)) || (++__CLOVER_12_0.cloverRec.CF[134]==0&false));
    }
    }__CLOVER_12_0.cloverRec.S[493]++;return oper.debut();
  }

  public final String car;
  public final Token oper;
	/* (non-Javadoc)
	 * @see ast.Expr#check_egal(ast.Expr)
	 */
	public void check_egal(Expr e) {__CLOVER_12_0.cloverRec.M[77]++;
		assert((((e!=null)) && (++__CLOVER_12_0.cloverRec.CT[135]!=0|true)) || (++__CLOVER_12_0.cloverRec.CF[135]==0&false));
		assert((((e instanceof Expr_Car)) && (++__CLOVER_12_0.cloverRec.CT[136]!=0|true)) || (++__CLOVER_12_0.cloverRec.CF[136]==0&false));
		__CLOVER_12_0.cloverRec.S[494]++;Expr_Car e2=(Expr_Car)e;
		assert((((car.equals(e2.car))) && (++__CLOVER_12_0.cloverRec.CT[137]!=0|true)) || (++__CLOVER_12_0.cloverRec.CF[137]==0&false)):"Difference:\""+car+
					"\"!=\""+e2.car+"\"";
	}

	/* (non-Javadoc)
	 * @see ast.Expr#toXML(java.io.PrintStream)
	 */
	public void toXML(PrintStream out) {__CLOVER_12_0.cloverRec.M[78]++;
		assert((((out!=null)) && (++__CLOVER_12_0.cloverRec.CT[138]!=0|true)) || (++__CLOVER_12_0.cloverRec.CF[138]==0&false));
		__CLOVER_12_0.cloverRec.S[495]++;out.println("<expression>");
		__CLOVER_12_0.cloverRec.S[496]++;out.print("<car>");
		__CLOVER_12_0.cloverRec.S[497]++;out.print(car);
		__CLOVER_12_0.cloverRec.S[498]++;out.println("</car>");
		__CLOVER_12_0.cloverRec.S[499]++;out.println("</expression>");
	}

	public String toString()
	{__CLOVER_12_0.cloverRec.M[79]++;
		__CLOVER_12_0.cloverRec.S[500]++;return car;
	}

}