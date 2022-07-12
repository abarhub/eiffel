/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ *//*
 * Created on 27 mars 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package tinyeiffel.intermediaire;

import java.io.PrintStream;

/**
 * @author Barret
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class CISource {static class __CLOVER_227_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}

	public CISource(int ligne,int colonne,String fichier)
	{__CLOVER_227_0.cloverRec.M[1332]++;
		__CLOVER_227_0.cloverRec.S[19169]++;this.ligne=ligne;
		__CLOVER_227_0.cloverRec.S[19170]++;this.colonne=colonne;
		__CLOVER_227_0.cloverRec.S[19171]++;this.fichier=fichier;
	}
	
	public String toString()
	{__CLOVER_227_0.cloverRec.M[1333]++;
		__CLOVER_227_0.cloverRec.S[19172]++;return "source("+ligne+","+colonne+(((((fichier!=null)) && (++__CLOVER_227_0.cloverRec.CT[5422]!=0|true)) || (++__CLOVER_227_0.cloverRec.CF[5422]==0&false))?fichier:"")+")";
	}

	/* (non-Javadoc)
	 * @see intermediaire.Expr#toXML(java.io.PrintStream)
	 */
	public void toXML(PrintStream out) {__CLOVER_227_0.cloverRec.M[1334]++;
		assert((((out!=null)) && (++__CLOVER_227_0.cloverRec.CT[5423]!=0|true)) || (++__CLOVER_227_0.cloverRec.CF[5423]==0&false));
		__CLOVER_227_0.cloverRec.S[19173]++;if((((fichier!=null) && (++__CLOVER_227_0.cloverRec.CT[5424]!=0|true)) || (++__CLOVER_227_0.cloverRec.CF[5424]==0&false)))
		{{
			__CLOVER_227_0.cloverRec.S[19174]++;out.println("<source ligne="+ligne+
					" colonne="+colonne+" fichier=\""+fichier+"\" />");
		}
		}else
		{{
			__CLOVER_227_0.cloverRec.S[19175]++;out.println("<source ligne="+ligne+
					" colonne="+colonne+" />");
		}
	}}

	public void check_egal(CISource e)
	{__CLOVER_227_0.cloverRec.M[1335]++;
		assert((((e!=null)) && (++__CLOVER_227_0.cloverRec.CT[5425]!=0|true)) || (++__CLOVER_227_0.cloverRec.CF[5425]==0&false));
		assert((((e instanceof CISource)) && (++__CLOVER_227_0.cloverRec.CT[5426]!=0|true)) || (++__CLOVER_227_0.cloverRec.CF[5426]==0&false));
		//CISource e2=(CIExpr_Type)e;
		assert((((e.ligne==ligne)) && (++__CLOVER_227_0.cloverRec.CT[5427]!=0|true)) || (++__CLOVER_227_0.cloverRec.CF[5427]==0&false));
		assert((((e.colonne==colonne)) && (++__CLOVER_227_0.cloverRec.CT[5428]!=0|true)) || (++__CLOVER_227_0.cloverRec.CF[5428]==0&false));
		__CLOVER_227_0.cloverRec.S[19176]++;if((((fichier==null) && (++__CLOVER_227_0.cloverRec.CT[5429]!=0|true)) || (++__CLOVER_227_0.cloverRec.CF[5429]==0&false)))
		{{
			assert((((e.fichier==null)) && (++__CLOVER_227_0.cloverRec.CT[5430]!=0|true)) || (++__CLOVER_227_0.cloverRec.CF[5430]==0&false));
		}
		}else
		{{
			assert((((e.fichier.equals(fichier))) && (++__CLOVER_227_0.cloverRec.CT[5431]!=0|true)) || (++__CLOVER_227_0.cloverRec.CF[5431]==0&false));
		}
	}}
	
	public int ligne,colonne;
	public String fichier;
}
