/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ *//*
 * Created on 25 f\u00e9vr. 2004
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
public class CIAssertion {static class __CLOVER_186_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}

	/**
	 * 
	 */
	public CIAssertion(CISource source) {__CLOVER_186_0.cloverRec.M[1104]++;
		__CLOVER_186_0.cloverRec.S[16852]++;liste=new CIListe_Var();
		__CLOVER_186_0.cloverRec.S[16853]++;this.source=source;
	}

	public void affiche(PrintStream out)
	{__CLOVER_186_0.cloverRec.M[1105]++;
		__CLOVER_186_0.cloverRec.S[16854]++;int i;
		assert((((out!=null)) && (++__CLOVER_186_0.cloverRec.CT[4074]!=0|true)) || (++__CLOVER_186_0.cloverRec.CF[4074]==0&false));
	}

	public void toXML(PrintStream out,String nom)
	{__CLOVER_186_0.cloverRec.M[1106]++;
		__CLOVER_186_0.cloverRec.S[16855]++;int i;
		assert((((out!=null)) && (++__CLOVER_186_0.cloverRec.CT[4075]!=0|true)) || (++__CLOVER_186_0.cloverRec.CF[4075]==0&false));
		assert((((nom!=null)) && (++__CLOVER_186_0.cloverRec.CT[4076]!=0|true)) || (++__CLOVER_186_0.cloverRec.CF[4076]==0&false));
		__CLOVER_186_0.cloverRec.S[16856]++;out.println("<"+nom+">");
		//for(i=0;i<liste.size();i++)
		//	liste.elt(i).toXML(out);
		__CLOVER_186_0.cloverRec.S[16857]++;if((((liste!=null) && (++__CLOVER_186_0.cloverRec.CT[4077]!=0|true)) || (++__CLOVER_186_0.cloverRec.CF[4077]==0&false)))
			{__CLOVER_186_0.cloverRec.S[16858]++;liste.toXML(out);
		}__CLOVER_186_0.cloverRec.S[16859]++;out.println("<instruction>");
		__CLOVER_186_0.cloverRec.S[16860]++;if((((liste_instr!=null) && (++__CLOVER_186_0.cloverRec.CT[4078]!=0|true)) || (++__CLOVER_186_0.cloverRec.CF[4078]==0&false)))
			{__CLOVER_186_0.cloverRec.S[16861]++;liste_instr.toXML(out);
		//for(i=0;i<liste_instr.length;i++)
		//	liste_instr[i].toXML(out);
		}__CLOVER_186_0.cloverRec.S[16862]++;out.println("</instruction>");
		__CLOVER_186_0.cloverRec.S[16863]++;if((((source!=null) && (++__CLOVER_186_0.cloverRec.CT[4079]!=0|true)) || (++__CLOVER_186_0.cloverRec.CF[4079]==0&false)))
		{{
			__CLOVER_186_0.cloverRec.S[16864]++;source.toXML(out);
		}
		}__CLOVER_186_0.cloverRec.S[16865]++;out.println("</"+nom+">");
	}

	public void check_egal(CIAssertion a)
	{__CLOVER_186_0.cloverRec.M[1107]++;
		__CLOVER_186_0.cloverRec.S[16866]++;int i;
		assert((((a!=null)) && (++__CLOVER_186_0.cloverRec.CT[4080]!=0|true)) || (++__CLOVER_186_0.cloverRec.CF[4080]==0&false));
		__CLOVER_186_0.cloverRec.S[16867]++;if((((liste==null||liste.size()==0) && (++__CLOVER_186_0.cloverRec.CT[4081]!=0|true)) || (++__CLOVER_186_0.cloverRec.CF[4081]==0&false)))
			{assert((((a.liste==null||a.liste.size()==0)) && (++__CLOVER_186_0.cloverRec.CT[4082]!=0|true)) || (++__CLOVER_186_0.cloverRec.CF[4082]==0&false)):a.liste.size()+":"+a.liste.elt(0);
		}else
		{{
			/*assert(a.liste!=null);
			assert(a.liste.size()==liste.size());
			for(i=0;i<liste.size();i++)
			{
				liste.elt(i).check_egal(a.liste.elt(i));
			}*/
			__CLOVER_186_0.cloverRec.S[16868]++;liste.check_egal(a.liste);
		}
		}__CLOVER_186_0.cloverRec.S[16869]++;if((((liste_instr==null||liste_instr.size()==0) && (++__CLOVER_186_0.cloverRec.CT[4083]!=0|true)) || (++__CLOVER_186_0.cloverRec.CF[4083]==0&false)))
			{assert((((a.liste_instr==null||a.liste_instr.size()==0)) && (++__CLOVER_186_0.cloverRec.CT[4084]!=0|true)) || (++__CLOVER_186_0.cloverRec.CF[4084]==0&false));
		}else
		{{
			/*assert(a.liste_instr!=null);
			assert(a.liste_instr.length==liste_instr.length);
			for(i=0;i<liste_instr.length;i++)
			{
				liste_instr[i].check_egal(a.liste_instr[i]);
			}*/
			__CLOVER_186_0.cloverRec.S[16870]++;liste_instr.check_egal(a.liste_instr);
		}
		}__CLOVER_186_0.cloverRec.S[16871]++;if((((source!=null) && (++__CLOVER_186_0.cloverRec.CT[4085]!=0|true)) || (++__CLOVER_186_0.cloverRec.CF[4085]==0&false)))
		{{
			__CLOVER_186_0.cloverRec.S[16872]++;source.check_egal(a.source);
		}
		}else
		{{
			assert((((a.source==null)) && (++__CLOVER_186_0.cloverRec.CT[4086]!=0|true)) || (++__CLOVER_186_0.cloverRec.CF[4086]==0&false));
		}
	}}

	public final CIListe_Var liste;
	public CIListe_Instr liste_instr;
	public CISource source;

}
