/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ *//*
 * Created on 5 juin 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package tinyeiffel.intermediaire;

import java.io.PrintStream;

/**
 * @author barret
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class CITypeAncre extends CIType {static class __CLOVER_229_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}

	/**
	 * @param nom
	 * @param source
	 */
	public CITypeAncre(String nom, CISource source) {__CLOVER_229_0.cloverRec.M[1336]++;
		assert((((nom!=null)) && (++__CLOVER_229_0.cloverRec.CT[5432]!=0|true)) || (++__CLOVER_229_0.cloverRec.CF[5432]==0&false));
		__CLOVER_229_0.cloverRec.S[19177]++;this.nom=nom;
		__CLOVER_229_0.cloverRec.S[19178]++;is_like=true;
		__CLOVER_229_0.cloverRec.S[19179]++;this.source=source;
	}

	public void check_egal(CIType t)
	{__CLOVER_229_0.cloverRec.M[1337]++;
		assert((((t!=null)) && (++__CLOVER_229_0.cloverRec.CT[5433]!=0|true)) || (++__CLOVER_229_0.cloverRec.CF[5433]==0&false));
		assert((((is_like==t.is_like)) && (++__CLOVER_229_0.cloverRec.CT[5434]!=0|true)) || (++__CLOVER_229_0.cloverRec.CF[5434]==0&false));
		assert((((t instanceof CITypeAncre)) && (++__CLOVER_229_0.cloverRec.CT[5435]!=0|true)) || (++__CLOVER_229_0.cloverRec.CF[5435]==0&false));
		__CLOVER_229_0.cloverRec.S[19180]++;CITypeAncre t2=(CITypeAncre)t;
		assert((((nom!=null)) && (++__CLOVER_229_0.cloverRec.CT[5436]!=0|true)) || (++__CLOVER_229_0.cloverRec.CF[5436]==0&false));
		assert((((t2.nom!=null)) && (++__CLOVER_229_0.cloverRec.CT[5437]!=0|true)) || (++__CLOVER_229_0.cloverRec.CF[5437]==0&false));
		assert((((nom.equalsIgnoreCase(t2.nom))) && (++__CLOVER_229_0.cloverRec.CT[5438]!=0|true)) || (++__CLOVER_229_0.cloverRec.CF[5438]==0&false));
		assert((((t instanceof CITypeAncre)) && (++__CLOVER_229_0.cloverRec.CT[5439]!=0|true)) || (++__CLOVER_229_0.cloverRec.CF[5439]==0&false));
		__CLOVER_229_0.cloverRec.S[19181]++;if((((source!=null) && (++__CLOVER_229_0.cloverRec.CT[5440]!=0|true)) || (++__CLOVER_229_0.cloverRec.CF[5440]==0&false)))
		{{
			__CLOVER_229_0.cloverRec.S[19182]++;source.check_egal(t.source);
		}
		}else
		{{
			assert((((t.source==null)) && (++__CLOVER_229_0.cloverRec.CT[5441]!=0|true)) || (++__CLOVER_229_0.cloverRec.CF[5441]==0&false));
		}
	}}

	public final String nom;
	//public CISource source;


	public String toString()
	{__CLOVER_229_0.cloverRec.M[1338]++;
		__CLOVER_229_0.cloverRec.S[19183]++;String res="";
		__CLOVER_229_0.cloverRec.S[19184]++;res="like "+nom;
		__CLOVER_229_0.cloverRec.S[19185]++;return res;
	}

	public void toXML(PrintStream out)
	{__CLOVER_229_0.cloverRec.M[1339]++;
		assert((((out!=null)) && (++__CLOVER_229_0.cloverRec.CT[5442]!=0|true)) || (++__CLOVER_229_0.cloverRec.CF[5442]==0&false));
		
		__CLOVER_229_0.cloverRec.S[19186]++;out.print("<type est_like=\"oui\" nom=\""+nom+"\" ");
		__CLOVER_229_0.cloverRec.S[19187]++;if((((source!=null) && (++__CLOVER_229_0.cloverRec.CT[5443]!=0|true)) || (++__CLOVER_229_0.cloverRec.CF[5443]==0&false)))
		{{
			__CLOVER_229_0.cloverRec.S[19188]++;out.println(">");
			__CLOVER_229_0.cloverRec.S[19189]++;source.toXML(out);
			__CLOVER_229_0.cloverRec.S[19190]++;out.println("</type>");
		}
		}else
		{{
			__CLOVER_229_0.cloverRec.S[19191]++;out.println("/>");
		}
	}}

}
