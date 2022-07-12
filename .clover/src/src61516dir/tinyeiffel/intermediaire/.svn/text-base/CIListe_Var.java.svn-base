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
public class CIListe_Var {static class __CLOVER_221_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}

	/**
	 * 
	 */
	public CIListe_Var() {__CLOVER_221_0.cloverRec.M[1299]++;
		__CLOVER_221_0.cloverRec.S[18929]++;liste=new Vector();
	}

	public void ajoute(CIDeclare_Var v)
	{__CLOVER_221_0.cloverRec.M[1300]++;
		assert((((v!=null)) && (++__CLOVER_221_0.cloverRec.CT[5279]!=0|true)) || (++__CLOVER_221_0.cloverRec.CF[5279]==0&false));
		__CLOVER_221_0.cloverRec.S[18930]++;liste.addElement(v);
	}

	public void ajoute(Vector v)
	{__CLOVER_221_0.cloverRec.M[1301]++;
		__CLOVER_221_0.cloverRec.S[18931]++;int i;
		assert((((v!=null)) && (++__CLOVER_221_0.cloverRec.CT[5280]!=0|true)) || (++__CLOVER_221_0.cloverRec.CF[5280]==0&false));
		__CLOVER_221_0.cloverRec.S[18932]++;for(i=0;(((i<v.size()) && (++__CLOVER_221_0.cloverRec.CT[5281]!=0|true)) || (++__CLOVER_221_0.cloverRec.CF[5281]==0&false));i++)
		{{
			assert((((v.elementAt(i) instanceof CIDeclare_Var)) && (++__CLOVER_221_0.cloverRec.CT[5282]!=0|true)) || (++__CLOVER_221_0.cloverRec.CF[5282]==0&false));
		}
		}__CLOVER_221_0.cloverRec.S[18933]++;liste.addAll(v);
	}

	public CIDeclare_Var ajoute(String nom,CIType type)
	{__CLOVER_221_0.cloverRec.M[1302]++;
		__CLOVER_221_0.cloverRec.S[18934]++;CIDeclare_Var v;
		assert((((nom!=null)) && (++__CLOVER_221_0.cloverRec.CT[5283]!=0|true)) || (++__CLOVER_221_0.cloverRec.CF[5283]==0&false));
		assert((((type!=null)) && (++__CLOVER_221_0.cloverRec.CT[5284]!=0|true)) || (++__CLOVER_221_0.cloverRec.CF[5284]==0&false));
		
		__CLOVER_221_0.cloverRec.S[18935]++;v=new CIDeclare_Var(nom,type,null);
		__CLOVER_221_0.cloverRec.S[18936]++;ajoute(v);
		__CLOVER_221_0.cloverRec.S[18937]++;return v;
	}

	public CIDeclare_Var donne_var(String nom)
	{__CLOVER_221_0.cloverRec.M[1303]++;
		__CLOVER_221_0.cloverRec.S[18938]++;int i;
		__CLOVER_221_0.cloverRec.S[18939]++;CIDeclare_Var d;
		__CLOVER_221_0.cloverRec.S[18940]++;for(i=0;(((i<liste.size()) && (++__CLOVER_221_0.cloverRec.CT[5285]!=0|true)) || (++__CLOVER_221_0.cloverRec.CF[5285]==0&false));i++)
		{{
			__CLOVER_221_0.cloverRec.S[18941]++;d=(CIDeclare_Var)liste.elementAt(i);
			__CLOVER_221_0.cloverRec.S[18942]++;if((((d.nom.equalsIgnoreCase(nom)) && (++__CLOVER_221_0.cloverRec.CT[5286]!=0|true)) || (++__CLOVER_221_0.cloverRec.CF[5286]==0&false)))
				{__CLOVER_221_0.cloverRec.S[18943]++;return d;
		}}
		}__CLOVER_221_0.cloverRec.S[18944]++;return null;
	}

	public CIDeclare_Var elt(int i)
	{__CLOVER_221_0.cloverRec.M[1304]++;
		assert((((i>=0)) && (++__CLOVER_221_0.cloverRec.CT[5287]!=0|true)) || (++__CLOVER_221_0.cloverRec.CF[5287]==0&false));
		assert((((i<size())) && (++__CLOVER_221_0.cloverRec.CT[5288]!=0|true)) || (++__CLOVER_221_0.cloverRec.CF[5288]==0&false));
		__CLOVER_221_0.cloverRec.S[18945]++;return (CIDeclare_Var)liste.elementAt(i);
	}

	public int size()
	{__CLOVER_221_0.cloverRec.M[1305]++;
		__CLOVER_221_0.cloverRec.S[18946]++;return liste.size();
	}

	public void toXML(PrintStream out)
	{__CLOVER_221_0.cloverRec.M[1306]++;
		__CLOVER_221_0.cloverRec.S[18947]++;int i;
		assert((((out!=null)) && (++__CLOVER_221_0.cloverRec.CT[5289]!=0|true)) || (++__CLOVER_221_0.cloverRec.CF[5289]==0&false));
		__CLOVER_221_0.cloverRec.S[18948]++;for(i=0;(((i<size()) && (++__CLOVER_221_0.cloverRec.CT[5290]!=0|true)) || (++__CLOVER_221_0.cloverRec.CF[5290]==0&false));i++)
		{{
			__CLOVER_221_0.cloverRec.S[18949]++;elt(i).toXML(out);
		}
	}}

	public void check_egal(CIListe_Var liste_var)
	{__CLOVER_221_0.cloverRec.M[1307]++;
		assert((((liste_var!=null)) && (++__CLOVER_221_0.cloverRec.CT[5291]!=0|true)) || (++__CLOVER_221_0.cloverRec.CF[5291]==0&false));
		__CLOVER_221_0.cloverRec.S[18950]++;if((((size()==0) && (++__CLOVER_221_0.cloverRec.CT[5292]!=0|true)) || (++__CLOVER_221_0.cloverRec.CF[5292]==0&false)))
			{assert((((liste_var==null||liste_var.size()==0)) && (++__CLOVER_221_0.cloverRec.CT[5293]!=0|true)) || (++__CLOVER_221_0.cloverRec.CF[5293]==0&false));
		}else
		{{
			assert((((liste_var!=null)) && (++__CLOVER_221_0.cloverRec.CT[5294]!=0|true)) || (++__CLOVER_221_0.cloverRec.CF[5294]==0&false));
			assert((((liste_var.size()==size())) && (++__CLOVER_221_0.cloverRec.CT[5295]!=0|true)) || (++__CLOVER_221_0.cloverRec.CF[5295]==0&false));
			__CLOVER_221_0.cloverRec.S[18951]++;for(int i=0;(((i<size()) && (++__CLOVER_221_0.cloverRec.CT[5296]!=0|true)) || (++__CLOVER_221_0.cloverRec.CF[5296]==0&false));i++)
			{{
				__CLOVER_221_0.cloverRec.S[18952]++;elt(i).check_egal(liste_var.elt(i));
			}
		}}
	}}

	protected Vector liste;

}
