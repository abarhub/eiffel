/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ *//*
 * Created on 12 f\u00e9vr. 2004
 *
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
package tinyeiffel.intermediaire;

import java.io.PrintStream;

/**
 * @author BARRET
 *
 * To change the template for this generated type comment go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
public class CIExpr_Type extends CIExpr {static class __CLOVER_204_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}

	/**
	 * 
	 */
	public CIExpr_Type(CIExpr_Var var,CIType type,CISource source) {__CLOVER_204_0.cloverRec.M[1186]++;
		assert((((var!=null)) && (++__CLOVER_204_0.cloverRec.CT[4388]!=0|true)) || (++__CLOVER_204_0.cloverRec.CF[4388]==0&false));
		assert((((type!=null)) && (++__CLOVER_204_0.cloverRec.CT[4389]!=0|true)) || (++__CLOVER_204_0.cloverRec.CF[4389]==0&false));
		__CLOVER_204_0.cloverRec.S[17405]++;this.var=var;
		__CLOVER_204_0.cloverRec.S[17406]++;this.type=type;
		__CLOVER_204_0.cloverRec.S[17407]++;this.source=source;
	}

	public String toString()
	{__CLOVER_204_0.cloverRec.M[1187]++;
		__CLOVER_204_0.cloverRec.S[17408]++;return "type_of("+var+","+type+")";
	}

	/* (non-Javadoc)
	 * @see intermediaire.Expr#toXML(java.io.PrintStream)
	 */
	public void toXML(PrintStream out) {__CLOVER_204_0.cloverRec.M[1188]++;
		assert((((out!=null)) && (++__CLOVER_204_0.cloverRec.CT[4390]!=0|true)) || (++__CLOVER_204_0.cloverRec.CF[4390]==0&false));
		__CLOVER_204_0.cloverRec.S[17409]++;out.println("<expression_type>");
		__CLOVER_204_0.cloverRec.S[17410]++;var.toXML(out);
		__CLOVER_204_0.cloverRec.S[17411]++;type.toXML(out);
		__CLOVER_204_0.cloverRec.S[17412]++;if((((source!=null) && (++__CLOVER_204_0.cloverRec.CT[4391]!=0|true)) || (++__CLOVER_204_0.cloverRec.CF[4391]==0&false)))
		{{
			__CLOVER_204_0.cloverRec.S[17413]++;source.toXML(out);
		}
		}__CLOVER_204_0.cloverRec.S[17414]++;out.println("</expression_type>");
	}

	public void check_egal(CIExpr e)
	{__CLOVER_204_0.cloverRec.M[1189]++;
		assert((((e!=null)) && (++__CLOVER_204_0.cloverRec.CT[4392]!=0|true)) || (++__CLOVER_204_0.cloverRec.CF[4392]==0&false));
		assert((((e instanceof CIExpr_Type)) && (++__CLOVER_204_0.cloverRec.CT[4393]!=0|true)) || (++__CLOVER_204_0.cloverRec.CF[4393]==0&false));
		__CLOVER_204_0.cloverRec.S[17415]++;CIExpr_Type e2=(CIExpr_Type)e;
		assert((((var!=null)) && (++__CLOVER_204_0.cloverRec.CT[4394]!=0|true)) || (++__CLOVER_204_0.cloverRec.CF[4394]==0&false));
		assert((((e2.var!=null)) && (++__CLOVER_204_0.cloverRec.CT[4395]!=0|true)) || (++__CLOVER_204_0.cloverRec.CF[4395]==0&false));
		assert((((type!=null)) && (++__CLOVER_204_0.cloverRec.CT[4396]!=0|true)) || (++__CLOVER_204_0.cloverRec.CF[4396]==0&false));
		assert((((e2.type!=null)) && (++__CLOVER_204_0.cloverRec.CT[4397]!=0|true)) || (++__CLOVER_204_0.cloverRec.CF[4397]==0&false));
		__CLOVER_204_0.cloverRec.S[17416]++;var.check_egal(e2.var);
		__CLOVER_204_0.cloverRec.S[17417]++;type.check_egal(e2.type);
		__CLOVER_204_0.cloverRec.S[17418]++;if((((source!=null) && (++__CLOVER_204_0.cloverRec.CT[4398]!=0|true)) || (++__CLOVER_204_0.cloverRec.CF[4398]==0&false)))
		{{
			__CLOVER_204_0.cloverRec.S[17419]++;source.check_egal(e2.source);
		}
		}else
		{{
			assert((((e2.source==null)) && (++__CLOVER_204_0.cloverRec.CT[4399]!=0|true)) || (++__CLOVER_204_0.cloverRec.CF[4399]==0&false));
		}
	}}
	
	public CIExpr_Var var;
	public CIType type;
	public CISource source;

}
