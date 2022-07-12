/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ *//*
 * Created on 8 mai 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package tinyeiffel.verification.type_verif;

import java.io.PrintStream;
import java.util.*;
import tinyeiffel.ast.*;

/**
 * @author Barret
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class VerifInspect extends Verif {static class __CLOVER_269_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}

	
	/**
	 * 
	 */
	public VerifInspect(VerifType type_expr,Vector liste_cas,Position pos) {__CLOVER_269_0.cloverRec.M[1623]++;
		assert((((type_expr!=null)) && (++__CLOVER_269_0.cloverRec.CT[6981]!=0|true)) || (++__CLOVER_269_0.cloverRec.CF[6981]==0&false));
		assert((((liste_cas!=null)) && (++__CLOVER_269_0.cloverRec.CT[6982]!=0|true)) || (++__CLOVER_269_0.cloverRec.CF[6982]==0&false));
		assert((((pos!=null)) && (++__CLOVER_269_0.cloverRec.CT[6983]!=0|true)) || (++__CLOVER_269_0.cloverRec.CF[6983]==0&false));
		__CLOVER_269_0.cloverRec.S[22905]++;this.type_expr=type_expr;
		__CLOVER_269_0.cloverRec.S[22906]++;this.liste_cas=liste_cas;
		__CLOVER_269_0.cloverRec.S[22907]++;this.pos=pos;
	}


	public void toXML(PrintStream out)
	{__CLOVER_269_0.cloverRec.M[1624]++;// TODO: a revoir
		__CLOVER_269_0.cloverRec.S[22908]++;int i;
		__CLOVER_269_0.cloverRec.S[22909]++;Expr e;
		assert((((out!=null)) && (++__CLOVER_269_0.cloverRec.CT[6984]!=0|true)) || (++__CLOVER_269_0.cloverRec.CF[6984]==0&false));
		__CLOVER_269_0.cloverRec.S[22910]++;out.println("<inspect>");
		__CLOVER_269_0.cloverRec.S[22911]++;type_expr.toXML(out);
		__CLOVER_269_0.cloverRec.S[22912]++;for(i=0;(((i<liste_cas.size()) && (++__CLOVER_269_0.cloverRec.CT[6985]!=0|true)) || (++__CLOVER_269_0.cloverRec.CF[6985]==0&false));i++)
		{{
			__CLOVER_269_0.cloverRec.S[22913]++;if((((liste_cas.elementAt(i) instanceof Vector) && (++__CLOVER_269_0.cloverRec.CT[6986]!=0|true)) || (++__CLOVER_269_0.cloverRec.CF[6986]==0&false)))
			{{
				//liste_cas.
			}
			}else
			{{
				__CLOVER_269_0.cloverRec.S[22914]++;e=(Expr)liste_cas.elementAt(i);
				__CLOVER_269_0.cloverRec.S[22915]++;e.toXML(out);
			}
		}}
		}__CLOVER_269_0.cloverRec.S[22916]++;pos.toXML(out);
		__CLOVER_269_0.cloverRec.S[22917]++;out.println("</inspect>");
	}
	
	public VerifType type_expr;
	/*
	 * Pour l'exemple :
	 * inspect t
	 * when 1,5,8..9 then
	 * when 7 then 
	 * when 9..5 then 
	 * else
	 * end
	 * ce vector doit etre de la forme :
	 * {1,5,{8,9},7,{9,5}}
	 * */
	public Vector liste_cas;
	public Position pos;
	
}
