/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ *//*
 * Created on 20 juin 2004
 *
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
package tinyeiffel.interpreteur;

import java.util.*;
import tinyeiffel.ast.*;

/**
 * @author BARRET
 *
 * To change the template for this generated type comment go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
public class Frame {static class __CLOVER_238_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}

	/**
	 * 
	 */
	public Frame(String nom_classe,NomFeature nom_fonction,
					Interpreteur interp,Frame precedant,
					Map param,Donnee objet_courant) {__CLOVER_238_0.cloverRec.M[1378]++;
		assert((((nom_classe!=null)) && (++__CLOVER_238_0.cloverRec.CT[5695]!=0|true)) || (++__CLOVER_238_0.cloverRec.CF[5695]==0&false));
		assert((((nom_fonction!=null)) && (++__CLOVER_238_0.cloverRec.CT[5696]!=0|true)) || (++__CLOVER_238_0.cloverRec.CF[5696]==0&false));
		assert((((interp!=null)) && (++__CLOVER_238_0.cloverRec.CT[5697]!=0|true)) || (++__CLOVER_238_0.cloverRec.CF[5697]==0&false));
		assert((((objet_courant!=null)) && (++__CLOVER_238_0.cloverRec.CT[5698]!=0|true)) || (++__CLOVER_238_0.cloverRec.CF[5698]==0&false));
		__CLOVER_238_0.cloverRec.S[19824]++;this.nom_classe=nom_classe;
		__CLOVER_238_0.cloverRec.S[19825]++;this.nom_fonction=nom_fonction;
		__CLOVER_238_0.cloverRec.S[19826]++;this.interpreteur=interp;
		__CLOVER_238_0.cloverRec.S[19827]++;this.precedant=precedant;
		__CLOVER_238_0.cloverRec.S[19828]++;this.param=param;
		__CLOVER_238_0.cloverRec.S[19829]++;this.objet_courant=objet_courant;
	}

	public void set_local(FeatureRoutine f)
	{__CLOVER_238_0.cloverRec.M[1379]++;
		assert((((f!=null)) && (++__CLOVER_238_0.cloverRec.CT[5699]!=0|true)) || (++__CLOVER_238_0.cloverRec.CF[5699]==0&false));
		__CLOVER_238_0.cloverRec.S[19830]++;int i;
		__CLOVER_238_0.cloverRec.S[19831]++;DeclareVar dv;
		__CLOVER_238_0.cloverRec.S[19832]++;Donnee d;
		__CLOVER_238_0.cloverRec.S[19833]++;this.f=f;
		__CLOVER_238_0.cloverRec.S[19834]++;local=new HashMap();
		__CLOVER_238_0.cloverRec.S[19835]++;if((((f.local!=null) && (++__CLOVER_238_0.cloverRec.CT[5700]!=0|true)) || (++__CLOVER_238_0.cloverRec.CF[5700]==0&false)))
		{{
			__CLOVER_238_0.cloverRec.S[19836]++;for(i=0;(((i<f.local.length) && (++__CLOVER_238_0.cloverRec.CT[5701]!=0|true)) || (++__CLOVER_238_0.cloverRec.CF[5701]==0&false));i++)
			{{
				__CLOVER_238_0.cloverRec.S[19837]++;dv=f.local[i];
				__CLOVER_238_0.cloverRec.S[19838]++;d=interpreteur.defaut_var(dv.type);
				__CLOVER_238_0.cloverRec.S[19839]++;local.put(dv.nom,d);
			}
		}}
	}}

	public void set_var(String nom,Donnee d)
	{__CLOVER_238_0.cloverRec.M[1380]++;
		assert((((nom!=null)) && (++__CLOVER_238_0.cloverRec.CT[5702]!=0|true)) || (++__CLOVER_238_0.cloverRec.CF[5702]==0&false));
		assert((((d!=null)) && (++__CLOVER_238_0.cloverRec.CT[5703]!=0|true)) || (++__CLOVER_238_0.cloverRec.CF[5703]==0&false));
		__CLOVER_238_0.cloverRec.S[19840]++;if((((local!=null&&local.containsKey(nom)) && (++__CLOVER_238_0.cloverRec.CT[5704]!=0|true)) || (++__CLOVER_238_0.cloverRec.CF[5704]==0&false)))
			{__CLOVER_238_0.cloverRec.S[19841]++;local.put(nom,d);
		}else {__CLOVER_238_0.cloverRec.S[19842]++;if((((param!=null&&param.containsKey(nom)) && (++__CLOVER_238_0.cloverRec.CT[5705]!=0|true)) || (++__CLOVER_238_0.cloverRec.CF[5705]==0&false)))
			{__CLOVER_238_0.cloverRec.S[19843]++;param.put(nom,d);
		}else
		{{
			__CLOVER_238_0.cloverRec.S[19844]++;objet_courant.set(nom,d);
		}
	}}}

	public Donnee get_var(String nom)
	{__CLOVER_238_0.cloverRec.M[1381]++;
		assert((((nom!=null)) && (++__CLOVER_238_0.cloverRec.CT[5706]!=0|true)) || (++__CLOVER_238_0.cloverRec.CF[5706]==0&false));
		__CLOVER_238_0.cloverRec.S[19845]++;Donnee res;
		__CLOVER_238_0.cloverRec.S[19846]++;if((((local!=null&&local.containsKey(nom)) && (++__CLOVER_238_0.cloverRec.CT[5707]!=0|true)) || (++__CLOVER_238_0.cloverRec.CF[5707]==0&false)))
		{{
			__CLOVER_238_0.cloverRec.S[19847]++;res=(Donnee)local.get(nom);
		}
		}else
		{{
			__CLOVER_238_0.cloverRec.S[19848]++;if((((param!=null&&param.containsKey(nom)) && (++__CLOVER_238_0.cloverRec.CT[5708]!=0|true)) || (++__CLOVER_238_0.cloverRec.CF[5708]==0&false)))
			{{
				__CLOVER_238_0.cloverRec.S[19849]++;res=(Donnee)param.get(nom);
			}
			}else
			{{
				__CLOVER_238_0.cloverRec.S[19850]++;res=(Donnee)objet_courant.get(nom);
			}
		}}
		}__CLOVER_238_0.cloverRec.S[19851]++;return res;
	}

	public Classe get_classe()
	{__CLOVER_238_0.cloverRec.M[1382]++;
		__CLOVER_238_0.cloverRec.S[19852]++;Classe cl=interpreteur.cherche_classe(nom_classe);
		assert((((cl!=null)) && (++__CLOVER_238_0.cloverRec.CT[5709]!=0|true)) || (++__CLOVER_238_0.cloverRec.CF[5709]==0&false));
		__CLOVER_238_0.cloverRec.S[19853]++;return cl;
	}

	public String nom_classe;
	public NomFeature nom_fonction;
	public Feature f;
	public Map local;
	public Interpreteur interpreteur;
	public Frame precedant;
	public Map param;
	public Donnee objet_courant;
}
