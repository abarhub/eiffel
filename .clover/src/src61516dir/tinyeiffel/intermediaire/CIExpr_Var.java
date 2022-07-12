/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ *//*
 * Created on 5 f\u00e9vr. 2004
 *
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
package tinyeiffel.intermediaire;

import java.io.*;

/**
 * @author BARRET
 *
 * To change the template for this generated type comment go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
public class CIExpr_Var extends CIExpr_Scalaire {static class __CLOVER_206_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}

	/**
	 * 
	 */
	public CIExpr_Var(String nom,CISource source) {__CLOVER_206_0.cloverRec.M[1195]++;
		assert((((nom!=null)) && (++__CLOVER_206_0.cloverRec.CT[4412]!=0|true)) || (++__CLOVER_206_0.cloverRec.CF[4412]==0&false));
		__CLOVER_206_0.cloverRec.S[17478]++;this.nom=nom;
		__CLOVER_206_0.cloverRec.S[17479]++;this.source=source;
	}

	public CIExpr_Var(String nom,CIExpr_Scalaire indice,CISource source) {__CLOVER_206_0.cloverRec.M[1196]++;
		assert((((nom!=null)) && (++__CLOVER_206_0.cloverRec.CT[4413]!=0|true)) || (++__CLOVER_206_0.cloverRec.CF[4413]==0&false));
		assert((((indice!=null)) && (++__CLOVER_206_0.cloverRec.CT[4414]!=0|true)) || (++__CLOVER_206_0.cloverRec.CF[4414]==0&false));
		assert((((indice instanceof CIExpr_Entier||
				indice instanceof CIExpr_Var)) && (++__CLOVER_206_0.cloverRec.CT[4415]!=0|true)) || (++__CLOVER_206_0.cloverRec.CF[4415]==0&false));
		__CLOVER_206_0.cloverRec.S[17480]++;this.nom=nom;
		__CLOVER_206_0.cloverRec.S[17481]++;this.indice=indice;
		__CLOVER_206_0.cloverRec.S[17482]++;this.source=source;
	}
	
	public void set_src(String nom)
	{__CLOVER_206_0.cloverRec.M[1197]++;
		assert((((nom!=null)) && (++__CLOVER_206_0.cloverRec.CT[4416]!=0|true)) || (++__CLOVER_206_0.cloverRec.CF[4416]==0&false));
		__CLOVER_206_0.cloverRec.S[17483]++;src=nom;
	}
	
	public boolean a_indice()
	{__CLOVER_206_0.cloverRec.M[1198]++;
		__CLOVER_206_0.cloverRec.S[17484]++;return indice!=null;
	}
	
	public boolean a_src()
	{__CLOVER_206_0.cloverRec.M[1199]++;
		__CLOVER_206_0.cloverRec.S[17485]++;return src!=null;
	}
	
	public String toString()
	{__CLOVER_206_0.cloverRec.M[1200]++;
		__CLOVER_206_0.cloverRec.S[17486]++;String res;
		
		__CLOVER_206_0.cloverRec.S[17487]++;if((((a_src()) && (++__CLOVER_206_0.cloverRec.CT[4417]!=0|true)) || (++__CLOVER_206_0.cloverRec.CF[4417]==0&false)))
			{__CLOVER_206_0.cloverRec.S[17488]++;res=src;
		}else
			{__CLOVER_206_0.cloverRec.S[17489]++;res="";
		}__CLOVER_206_0.cloverRec.S[17490]++;if((((a_indice()) && (++__CLOVER_206_0.cloverRec.CT[4418]!=0|true)) || (++__CLOVER_206_0.cloverRec.CF[4418]==0&false)))
			{__CLOVER_206_0.cloverRec.S[17491]++;res+=nom+"["+indice+"]";
		}else
			{__CLOVER_206_0.cloverRec.S[17492]++;res+=nom;
		
		}__CLOVER_206_0.cloverRec.S[17493]++;return res;
	}

	public void toXML(PrintStream out)
	{__CLOVER_206_0.cloverRec.M[1201]++;
		__CLOVER_206_0.cloverRec.S[17494]++;out.println("<expression_scalaire type=\"var\" >");
		__CLOVER_206_0.cloverRec.S[17495]++;if((((a_src()) && (++__CLOVER_206_0.cloverRec.CT[4419]!=0|true)) || (++__CLOVER_206_0.cloverRec.CF[4419]==0&false)))
			{__CLOVER_206_0.cloverRec.S[17496]++;out.println("<var nom=\""+nom+"\" src=\""+src+"\" >");
		}else
			{__CLOVER_206_0.cloverRec.S[17497]++;out.println("<var nom=\""+nom+"\" >");
		}__CLOVER_206_0.cloverRec.S[17498]++;if((((indice!=null) && (++__CLOVER_206_0.cloverRec.CT[4420]!=0|true)) || (++__CLOVER_206_0.cloverRec.CF[4420]==0&false)))
			{__CLOVER_206_0.cloverRec.S[17499]++;indice.toXML(out);
		}__CLOVER_206_0.cloverRec.S[17500]++;out.println("</var>");
		__CLOVER_206_0.cloverRec.S[17501]++;if((((source!=null) && (++__CLOVER_206_0.cloverRec.CT[4421]!=0|true)) || (++__CLOVER_206_0.cloverRec.CF[4421]==0&false)))
		{{
			__CLOVER_206_0.cloverRec.S[17502]++;source.toXML(out);
		}
		}__CLOVER_206_0.cloverRec.S[17503]++;out.println("</expression_scalaire>");
	}

	public void check_egal(CIExpr e)
	{__CLOVER_206_0.cloverRec.M[1202]++;
		assert((((e!=null)) && (++__CLOVER_206_0.cloverRec.CT[4422]!=0|true)) || (++__CLOVER_206_0.cloverRec.CF[4422]==0&false));
		assert((((e instanceof CIExpr_Var)) && (++__CLOVER_206_0.cloverRec.CT[4423]!=0|true)) || (++__CLOVER_206_0.cloverRec.CF[4423]==0&false));
		__CLOVER_206_0.cloverRec.S[17504]++;CIExpr_Var e2=(CIExpr_Var)e;
		assert((((nom!=null)) && (++__CLOVER_206_0.cloverRec.CT[4424]!=0|true)) || (++__CLOVER_206_0.cloverRec.CF[4424]==0&false));
		assert((((e2.nom!=null)) && (++__CLOVER_206_0.cloverRec.CT[4425]!=0|true)) || (++__CLOVER_206_0.cloverRec.CF[4425]==0&false));
		assert((((nom.equalsIgnoreCase(e2.nom))) && (++__CLOVER_206_0.cloverRec.CT[4426]!=0|true)) || (++__CLOVER_206_0.cloverRec.CF[4426]==0&false));
		__CLOVER_206_0.cloverRec.S[17505]++;if((((indice!=null) && (++__CLOVER_206_0.cloverRec.CT[4427]!=0|true)) || (++__CLOVER_206_0.cloverRec.CF[4427]==0&false)))
		{{
			assert((((e2.indice!=null)) && (++__CLOVER_206_0.cloverRec.CT[4428]!=0|true)) || (++__CLOVER_206_0.cloverRec.CF[4428]==0&false));
			__CLOVER_206_0.cloverRec.S[17506]++;indice.check_egal(e2.indice);
		}
		}else
			{assert((((e2.indice==null)) && (++__CLOVER_206_0.cloverRec.CT[4429]!=0|true)) || (++__CLOVER_206_0.cloverRec.CF[4429]==0&false));
		}__CLOVER_206_0.cloverRec.S[17507]++;if((((src==null) && (++__CLOVER_206_0.cloverRec.CT[4430]!=0|true)) || (++__CLOVER_206_0.cloverRec.CF[4430]==0&false)))
			{assert((((e2.src==null)) && (++__CLOVER_206_0.cloverRec.CT[4431]!=0|true)) || (++__CLOVER_206_0.cloverRec.CF[4431]==0&false));
		}else
		{{
			assert((((e2.src!=null)) && (++__CLOVER_206_0.cloverRec.CT[4432]!=0|true)) || (++__CLOVER_206_0.cloverRec.CF[4432]==0&false)):"src="+src;
			assert((((src.equalsIgnoreCase(e2.src))) && (++__CLOVER_206_0.cloverRec.CT[4433]!=0|true)) || (++__CLOVER_206_0.cloverRec.CF[4433]==0&false));
		}
		}__CLOVER_206_0.cloverRec.S[17508]++;if((((source!=null) && (++__CLOVER_206_0.cloverRec.CT[4434]!=0|true)) || (++__CLOVER_206_0.cloverRec.CF[4434]==0&false)))
		{{
			__CLOVER_206_0.cloverRec.S[17509]++;source.check_egal(e2.source);
		}
		}else
		{{
			assert((((e2.source==null)) && (++__CLOVER_206_0.cloverRec.CT[4435]!=0|true)) || (++__CLOVER_206_0.cloverRec.CF[4435]==0&false));
		}
	}}
	
	public String nom,src;
	public CIExpr_Scalaire indice;
	public CISource source;

}
