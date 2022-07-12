/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ *//*
 * Created on 25 f\u00e9vr. 2004
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
public class CIListe_Global {static class __CLOVER_219_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}

	/**
	 * 
	 */
	public CIListe_Global() {__CLOVER_219_0.cloverRec.M[1283]++;
		__CLOVER_219_0.cloverRec.S[18890]++;liste=new Vector();
	}

	public void ajoute(CIDeclare_Var v)
	{__CLOVER_219_0.cloverRec.M[1284]++;
		assert((((v!=null)) && (++__CLOVER_219_0.cloverRec.CT[5247]!=0|true)) || (++__CLOVER_219_0.cloverRec.CF[5247]==0&false));
		__CLOVER_219_0.cloverRec.S[18891]++;liste.addElement(v);
	}

	public void ajoute(Vector v)
	{__CLOVER_219_0.cloverRec.M[1285]++;
		__CLOVER_219_0.cloverRec.S[18892]++;int i;
		assert((((v!=null)) && (++__CLOVER_219_0.cloverRec.CT[5248]!=0|true)) || (++__CLOVER_219_0.cloverRec.CF[5248]==0&false));
		__CLOVER_219_0.cloverRec.S[18893]++;for(i=0;(((i<v.size()) && (++__CLOVER_219_0.cloverRec.CT[5249]!=0|true)) || (++__CLOVER_219_0.cloverRec.CF[5249]==0&false));i++)
		{{
			assert((((v.elementAt(i) instanceof CIDeclare_Var)) && (++__CLOVER_219_0.cloverRec.CT[5250]!=0|true)) || (++__CLOVER_219_0.cloverRec.CF[5250]==0&false));
		}
		}__CLOVER_219_0.cloverRec.S[18894]++;liste.addAll(v);
	}

	public CIDeclare_Var ajoute(String nom,CIType type)
	{__CLOVER_219_0.cloverRec.M[1286]++;
		__CLOVER_219_0.cloverRec.S[18895]++;CIDeclare_Var v;
		assert((((nom!=null)) && (++__CLOVER_219_0.cloverRec.CT[5251]!=0|true)) || (++__CLOVER_219_0.cloverRec.CF[5251]==0&false));
		assert((((type!=null)) && (++__CLOVER_219_0.cloverRec.CT[5252]!=0|true)) || (++__CLOVER_219_0.cloverRec.CF[5252]==0&false));
		
		__CLOVER_219_0.cloverRec.S[18896]++;v=new CIDeclare_Var(nom,type,null);
		__CLOVER_219_0.cloverRec.S[18897]++;ajoute(v);
		__CLOVER_219_0.cloverRec.S[18898]++;return v;
	}

	public CIDeclare_Var donne_var(String nom)
	{__CLOVER_219_0.cloverRec.M[1287]++;
		__CLOVER_219_0.cloverRec.S[18899]++;int i;
		__CLOVER_219_0.cloverRec.S[18900]++;CIDeclare_Var d;
		__CLOVER_219_0.cloverRec.S[18901]++;for(i=0;(((i<liste.size()) && (++__CLOVER_219_0.cloverRec.CT[5253]!=0|true)) || (++__CLOVER_219_0.cloverRec.CF[5253]==0&false));i++)
		{{
			__CLOVER_219_0.cloverRec.S[18902]++;d=(CIDeclare_Var)liste.elementAt(i);
			__CLOVER_219_0.cloverRec.S[18903]++;if((((d.nom.equalsIgnoreCase(nom)) && (++__CLOVER_219_0.cloverRec.CT[5254]!=0|true)) || (++__CLOVER_219_0.cloverRec.CF[5254]==0&false)))
				{__CLOVER_219_0.cloverRec.S[18904]++;return d;
		}}
		}__CLOVER_219_0.cloverRec.S[18905]++;return null;
	}

	public CIDeclare_Var elt(int i)
	{__CLOVER_219_0.cloverRec.M[1288]++;
		assert((((i>=0)) && (++__CLOVER_219_0.cloverRec.CT[5255]!=0|true)) || (++__CLOVER_219_0.cloverRec.CF[5255]==0&false));
		assert((((i<size())) && (++__CLOVER_219_0.cloverRec.CT[5256]!=0|true)) || (++__CLOVER_219_0.cloverRec.CF[5256]==0&false));
		__CLOVER_219_0.cloverRec.S[18906]++;return (CIDeclare_Var)liste.elementAt(i);
	}

	public int size()
	{__CLOVER_219_0.cloverRec.M[1289]++;
		__CLOVER_219_0.cloverRec.S[18907]++;return liste.size();
	}

	public void toXML(PrintStream out)
	{__CLOVER_219_0.cloverRec.M[1290]++;
		__CLOVER_219_0.cloverRec.S[18908]++;int i;
		assert((((out!=null)) && (++__CLOVER_219_0.cloverRec.CT[5257]!=0|true)) || (++__CLOVER_219_0.cloverRec.CF[5257]==0&false));
		__CLOVER_219_0.cloverRec.S[18909]++;out.println("<system>");
		__CLOVER_219_0.cloverRec.S[18910]++;for(i=0;(((i<size()) && (++__CLOVER_219_0.cloverRec.CT[5258]!=0|true)) || (++__CLOVER_219_0.cloverRec.CF[5258]==0&false));i++)
		{{
			__CLOVER_219_0.cloverRec.S[18911]++;elt(i).toXML(out);
		}
		}__CLOVER_219_0.cloverRec.S[18912]++;out.println("</system>");
	}

	public void check_egal(CIListe_Global liste_var)
	{__CLOVER_219_0.cloverRec.M[1291]++;
		assert((((liste_var!=null)) && (++__CLOVER_219_0.cloverRec.CT[5259]!=0|true)) || (++__CLOVER_219_0.cloverRec.CF[5259]==0&false));
		__CLOVER_219_0.cloverRec.S[18913]++;if((((size()==0) && (++__CLOVER_219_0.cloverRec.CT[5260]!=0|true)) || (++__CLOVER_219_0.cloverRec.CF[5260]==0&false)))
			{assert((((liste_var==null||liste_var.size()==0)) && (++__CLOVER_219_0.cloverRec.CT[5261]!=0|true)) || (++__CLOVER_219_0.cloverRec.CF[5261]==0&false));
		}else
		{{
			assert((((liste_var!=null)) && (++__CLOVER_219_0.cloverRec.CT[5262]!=0|true)) || (++__CLOVER_219_0.cloverRec.CF[5262]==0&false));
			assert((((liste_var.size()==size())) && (++__CLOVER_219_0.cloverRec.CT[5263]!=0|true)) || (++__CLOVER_219_0.cloverRec.CF[5263]==0&false));
			__CLOVER_219_0.cloverRec.S[18914]++;for(int i=0;(((i<size()) && (++__CLOVER_219_0.cloverRec.CT[5264]!=0|true)) || (++__CLOVER_219_0.cloverRec.CF[5264]==0&false));i++)
			{{
				__CLOVER_219_0.cloverRec.S[18915]++;elt(i).check_egal(liste_var.elt(i));
			}
		}}
	}}

	protected Vector liste;

}
