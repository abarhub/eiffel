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
public abstract class Donnee {static class __CLOVER_233_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}

	/**
	 * 
	 */
	public Donnee(String nom_classe,boolean expanded) {__CLOVER_233_0.cloverRec.M[1357]++;
		assert((((nom_classe!=null)) && (++__CLOVER_233_0.cloverRec.CT[5655]!=0|true)) || (++__CLOVER_233_0.cloverRec.CF[5655]==0&false));
		__CLOVER_233_0.cloverRec.S[19756]++;this.nom_classe=nom_classe;
		__CLOVER_233_0.cloverRec.S[19757]++;valeurs=new HashMap();
		__CLOVER_233_0.cloverRec.S[19758]++;type_special=false;
		__CLOVER_233_0.cloverRec.S[19759]++;est_expanded=expanded;
	}

	public Donnee get(String nom_attr)
	{__CLOVER_233_0.cloverRec.M[1358]++;
		assert((((nom_attr!=null)) && (++__CLOVER_233_0.cloverRec.CT[5656]!=0|true)) || (++__CLOVER_233_0.cloverRec.CF[5656]==0&false));
		__CLOVER_233_0.cloverRec.S[19760]++;Donnee data;
		__CLOVER_233_0.cloverRec.S[19761]++;data=(Donnee)valeurs.get(nom_attr);
		__CLOVER_233_0.cloverRec.S[19762]++;return data;
	}

	public void set(String nom,Donnee data)
	{__CLOVER_233_0.cloverRec.M[1359]++;
		assert((((nom!=null)) && (++__CLOVER_233_0.cloverRec.CT[5657]!=0|true)) || (++__CLOVER_233_0.cloverRec.CF[5657]==0&false));
		assert((((valeurs.containsKey(nom))) && (++__CLOVER_233_0.cloverRec.CT[5658]!=0|true)) || (++__CLOVER_233_0.cloverRec.CF[5658]==0&false));
		__CLOVER_233_0.cloverRec.S[19763]++;valeurs.put(nom,data);
	}

	public void add(String nom_attr,Donnee data)
	{__CLOVER_233_0.cloverRec.M[1360]++;
		assert((((nom_attr!=null)) && (++__CLOVER_233_0.cloverRec.CT[5659]!=0|true)) || (++__CLOVER_233_0.cloverRec.CF[5659]==0&false));
		assert((((!valeurs.containsKey(nom_attr))) && (++__CLOVER_233_0.cloverRec.CT[5660]!=0|true)) || (++__CLOVER_233_0.cloverRec.CF[5660]==0&false));
		__CLOVER_233_0.cloverRec.S[19764]++;valeurs.put(nom_attr,data);
	}

	public Donnee fun_is_equal(Donnee d)
	{__CLOVER_233_0.cloverRec.M[1361]++;
		__CLOVER_233_0.cloverRec.S[19765]++;String nom;
		__CLOVER_233_0.cloverRec.S[19766]++;Set set;
		__CLOVER_233_0.cloverRec.S[19767]++;Iterator iter;
		assert((((d!=null)) && (++__CLOVER_233_0.cloverRec.CT[5661]!=0|true)) || (++__CLOVER_233_0.cloverRec.CF[5661]==0&false));
		__CLOVER_233_0.cloverRec.S[19768]++;Donnee res=new Donnee_Boolean(),d1,d2;
		__CLOVER_233_0.cloverRec.S[19769]++;((Donnee_Boolean)res).valeur=false;
		__CLOVER_233_0.cloverRec.S[19770]++;set=valeurs.keySet();
		__CLOVER_233_0.cloverRec.S[19771]++;iter=set.iterator();
		__CLOVER_233_0.cloverRec.S[19772]++;((Donnee_Boolean)res).valeur=true;
		__CLOVER_233_0.cloverRec.S[19773]++;while((((iter.hasNext()) && (++__CLOVER_233_0.cloverRec.CT[5662]!=0|true)) || (++__CLOVER_233_0.cloverRec.CF[5662]==0&false)))
		{{
			__CLOVER_233_0.cloverRec.S[19774]++;nom=(String)iter.next();
			__CLOVER_233_0.cloverRec.S[19775]++;d1=(Donnee)valeurs.get(nom);
			__CLOVER_233_0.cloverRec.S[19776]++;if((((d.valeurs.containsKey(nom)) && (++__CLOVER_233_0.cloverRec.CT[5663]!=0|true)) || (++__CLOVER_233_0.cloverRec.CF[5663]==0&false)))
			{{
				__CLOVER_233_0.cloverRec.S[19777]++;d2=(Donnee)d.valeurs.get(nom);
				__CLOVER_233_0.cloverRec.S[19778]++;if((((d2!=d1) && (++__CLOVER_233_0.cloverRec.CT[5664]!=0|true)) || (++__CLOVER_233_0.cloverRec.CF[5664]==0&false)))
					{__CLOVER_233_0.cloverRec.S[19779]++;return new Donnee_Boolean();
			}}
		}}
		}__CLOVER_233_0.cloverRec.S[19780]++;return res;
	}

	public Donnee fonction_externe(NomFeature nf,Donnee param[])
	{__CLOVER_233_0.cloverRec.M[1362]++;
		__CLOVER_233_0.cloverRec.S[19781]++;if((((nf.nom.equalsIgnoreCase("is_equal")||
			nf.nom.equalsIgnoreCase("standard_is_equal")) && (++__CLOVER_233_0.cloverRec.CT[5665]!=0|true)) || (++__CLOVER_233_0.cloverRec.CF[5665]==0&false)))
		{{
			assert((((param!=null)) && (++__CLOVER_233_0.cloverRec.CT[5666]!=0|true)) || (++__CLOVER_233_0.cloverRec.CF[5666]==0&false));
			assert((((param.length==1)) && (++__CLOVER_233_0.cloverRec.CT[5667]!=0|true)) || (++__CLOVER_233_0.cloverRec.CF[5667]==0&false));
			__CLOVER_233_0.cloverRec.S[19782]++;return fun_is_equal(param[1]);
		}
		}else {__CLOVER_233_0.cloverRec.S[19783]++;if((((nf.nom.equalsIgnoreCase("copy")||
			nf.nom.equalsIgnoreCase("standard_copy")) && (++__CLOVER_233_0.cloverRec.CT[5668]!=0|true)) || (++__CLOVER_233_0.cloverRec.CF[5668]==0&false)))
		{{
			assert((((false)) && (++__CLOVER_233_0.cloverRec.CT[5669]!=0|true)) || (++__CLOVER_233_0.cloverRec.CF[5669]==0&false));
		}
		}else {__CLOVER_233_0.cloverRec.S[19784]++;if((((nf.nom.equalsIgnoreCase("twin")||
			nf.nom.equalsIgnoreCase("standard_twin")) && (++__CLOVER_233_0.cloverRec.CT[5670]!=0|true)) || (++__CLOVER_233_0.cloverRec.CF[5670]==0&false)))
		{{
			assert((((false)) && (++__CLOVER_233_0.cloverRec.CT[5671]!=0|true)) || (++__CLOVER_233_0.cloverRec.CF[5671]==0&false));
		}
		}else {__CLOVER_233_0.cloverRec.S[19785]++;if((((nf.nom.equalsIgnoreCase("clone")||
			nf.nom.equalsIgnoreCase("standard_clone")) && (++__CLOVER_233_0.cloverRec.CT[5672]!=0|true)) || (++__CLOVER_233_0.cloverRec.CF[5672]==0&false)))
		{{
			assert((((false)) && (++__CLOVER_233_0.cloverRec.CT[5673]!=0|true)) || (++__CLOVER_233_0.cloverRec.CF[5673]==0&false));
		}
		}}}}assert((((false)) && (++__CLOVER_233_0.cloverRec.CT[5674]!=0|true)) || (++__CLOVER_233_0.cloverRec.CF[5674]==0&false));
		__CLOVER_233_0.cloverRec.S[19786]++;return null;
	}

	public String nom_classe;
	public Map valeurs;
	public boolean type_special;
	public boolean est_expanded;

}
