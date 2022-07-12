/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ *//*
 * Created on 26 f\u00e9vr. 2004
 *
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
package tinyeiffel.intermediaire;

import java.util.*;
import java.io.*;

/**
 * @author BARRET
 *
 * To change the template for this generated type comment go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
public class CIListe_Instr {static class __CLOVER_220_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}

	/**
	 * 
	 */
	public CIListe_Instr() {__CLOVER_220_0.cloverRec.M[1292]++;
		__CLOVER_220_0.cloverRec.S[18916]++;liste=new Vector();
	}

	public void ajoute(CIInstruction v)
	{__CLOVER_220_0.cloverRec.M[1293]++;
		assert((((v!=null)) && (++__CLOVER_220_0.cloverRec.CT[5265]!=0|true)) || (++__CLOVER_220_0.cloverRec.CF[5265]==0&false));
		__CLOVER_220_0.cloverRec.S[18917]++;liste.addElement(v);
	}

	public void ajoute(Vector v)
	{__CLOVER_220_0.cloverRec.M[1294]++;
		__CLOVER_220_0.cloverRec.S[18918]++;int i;
		assert((((v!=null)) && (++__CLOVER_220_0.cloverRec.CT[5266]!=0|true)) || (++__CLOVER_220_0.cloverRec.CF[5266]==0&false));
		__CLOVER_220_0.cloverRec.S[18919]++;for(i=0;(((i<v.size()) && (++__CLOVER_220_0.cloverRec.CT[5267]!=0|true)) || (++__CLOVER_220_0.cloverRec.CF[5267]==0&false));i++)
		{{
			assert((((v.elementAt(i) instanceof CIInstruction)) && (++__CLOVER_220_0.cloverRec.CT[5268]!=0|true)) || (++__CLOVER_220_0.cloverRec.CF[5268]==0&false));
		}
		}__CLOVER_220_0.cloverRec.S[18920]++;liste.addAll(v);
	}

	public CIInstruction elt(int i)
	{__CLOVER_220_0.cloverRec.M[1295]++;
		assert((((i>=0)) && (++__CLOVER_220_0.cloverRec.CT[5269]!=0|true)) || (++__CLOVER_220_0.cloverRec.CF[5269]==0&false));
		assert((((i<size())) && (++__CLOVER_220_0.cloverRec.CT[5270]!=0|true)) || (++__CLOVER_220_0.cloverRec.CF[5270]==0&false));
		__CLOVER_220_0.cloverRec.S[18921]++;return (CIInstruction)liste.elementAt(i);
	}

	public int size()
	{__CLOVER_220_0.cloverRec.M[1296]++;
		__CLOVER_220_0.cloverRec.S[18922]++;return liste.size();
	}

	public void toXML(PrintStream out)
	{__CLOVER_220_0.cloverRec.M[1297]++;
		__CLOVER_220_0.cloverRec.S[18923]++;int i;
		assert((((out!=null)) && (++__CLOVER_220_0.cloverRec.CT[5271]!=0|true)) || (++__CLOVER_220_0.cloverRec.CF[5271]==0&false));
		//out.println("<instruction>");
		__CLOVER_220_0.cloverRec.S[18924]++;for(i=0;(((i<size()) && (++__CLOVER_220_0.cloverRec.CT[5272]!=0|true)) || (++__CLOVER_220_0.cloverRec.CF[5272]==0&false));i++)
		{{
			__CLOVER_220_0.cloverRec.S[18925]++;elt(i).toXML(out);
		}
		//out.println("</instruction>");
	}}

	public void check_egal(CIListe_Instr liste_var)
	{__CLOVER_220_0.cloverRec.M[1298]++;
		assert((((liste_var!=null)) && (++__CLOVER_220_0.cloverRec.CT[5273]!=0|true)) || (++__CLOVER_220_0.cloverRec.CF[5273]==0&false));
		__CLOVER_220_0.cloverRec.S[18926]++;if((((size()==0) && (++__CLOVER_220_0.cloverRec.CT[5274]!=0|true)) || (++__CLOVER_220_0.cloverRec.CF[5274]==0&false)))
			{assert((((liste_var==null||liste_var.size()==0)) && (++__CLOVER_220_0.cloverRec.CT[5275]!=0|true)) || (++__CLOVER_220_0.cloverRec.CF[5275]==0&false));
		}else
		{{
			assert((((liste_var!=null)) && (++__CLOVER_220_0.cloverRec.CT[5276]!=0|true)) || (++__CLOVER_220_0.cloverRec.CF[5276]==0&false));
			assert((((liste_var.size()==size())) && (++__CLOVER_220_0.cloverRec.CT[5277]!=0|true)) || (++__CLOVER_220_0.cloverRec.CF[5277]==0&false));
			__CLOVER_220_0.cloverRec.S[18927]++;for(int i=0;(((i<size()) && (++__CLOVER_220_0.cloverRec.CT[5278]!=0|true)) || (++__CLOVER_220_0.cloverRec.CF[5278]==0&false));i++)
			{{
				__CLOVER_220_0.cloverRec.S[18928]++;elt(i).check_egal(liste_var.elt(i));
			}
		}}
	}}

	protected Vector liste;

}
