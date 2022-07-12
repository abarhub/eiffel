/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ *//*
 * Created on 10 janv. 2004
 *
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
package tinyeiffel.lace;

import tinyeiffel.ast.*;
import java.util.*;
/**
 * @author BARRET
 *
 * To change the template for this generated type comment go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
public class Ace {static class __CLOVER_240_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}

	/**
	 * Constructeur
	 */
	public Ace(NomSysteme nom,Type nom_classe,
				NomGrappe grappe_racine,
				NomFeature procedure_racine,
				Vector liste_grappe) {__CLOVER_240_0.cloverRec.M[1393]++;
		assert((((nom!=null)) && (++__CLOVER_240_0.cloverRec.CT[5802]!=0|true)) || (++__CLOVER_240_0.cloverRec.CF[5802]==0&false));
		assert((((nom_classe!=null)) && (++__CLOVER_240_0.cloverRec.CT[5803]!=0|true)) || (++__CLOVER_240_0.cloverRec.CF[5803]==0&false));
		__CLOVER_240_0.cloverRec.S[20083]++;this.nom=nom;
		__CLOVER_240_0.cloverRec.S[20084]++;this.nom_classe=nom_classe;
		__CLOVER_240_0.cloverRec.S[20085]++;this.grappe_racine=grappe_racine;
		__CLOVER_240_0.cloverRec.S[20086]++;this.procedure_racine=procedure_racine;
		__CLOVER_240_0.cloverRec.S[20087]++;if((((liste_grappe!=null) && (++__CLOVER_240_0.cloverRec.CT[5804]!=0|true)) || (++__CLOVER_240_0.cloverRec.CF[5804]==0&false)))
		{{
			__CLOVER_240_0.cloverRec.S[20088]++;this.liste_grappe=new Grappe[liste_grappe.size()];
			__CLOVER_240_0.cloverRec.S[20089]++;liste_grappe.copyInto(this.liste_grappe);
		}
	}}

	public Grappe donne_grappe(NomGrappe nom)
	{__CLOVER_240_0.cloverRec.M[1394]++;
		__CLOVER_240_0.cloverRec.S[20090]++;int i;
		__CLOVER_240_0.cloverRec.S[20091]++;NomGrappe n;
		assert((((nom!=null)) && (++__CLOVER_240_0.cloverRec.CT[5805]!=0|true)) || (++__CLOVER_240_0.cloverRec.CF[5805]==0&false));
		__CLOVER_240_0.cloverRec.S[20092]++;if((((liste_grappe!=null) && (++__CLOVER_240_0.cloverRec.CT[5806]!=0|true)) || (++__CLOVER_240_0.cloverRec.CF[5806]==0&false)))
		{{
			__CLOVER_240_0.cloverRec.S[20093]++;for(i=0;(((i<liste_grappe.length) && (++__CLOVER_240_0.cloverRec.CT[5807]!=0|true)) || (++__CLOVER_240_0.cloverRec.CF[5807]==0&false));i++)
			{{
				__CLOVER_240_0.cloverRec.S[20094]++;n=liste_grappe[i].nom;
				__CLOVER_240_0.cloverRec.S[20095]++;if((((n!=null&&n.equals(nom)) && (++__CLOVER_240_0.cloverRec.CT[5808]!=0|true)) || (++__CLOVER_240_0.cloverRec.CF[5808]==0&false)))
					{__CLOVER_240_0.cloverRec.S[20096]++;return liste_grappe[i];
			}}
		}}
		}__CLOVER_240_0.cloverRec.S[20097]++;return null;
	}

	public Grappe donne_grappe_racine()
	{__CLOVER_240_0.cloverRec.M[1395]++;
		__CLOVER_240_0.cloverRec.S[20098]++;Grappe g=null;
		__CLOVER_240_0.cloverRec.S[20099]++;if((((grappe_racine!=null) && (++__CLOVER_240_0.cloverRec.CT[5809]!=0|true)) || (++__CLOVER_240_0.cloverRec.CF[5809]==0&false)))
			{__CLOVER_240_0.cloverRec.S[20100]++;g=donne_grappe(grappe_racine);
		}__CLOVER_240_0.cloverRec.S[20101]++;if((((g==null) && (++__CLOVER_240_0.cloverRec.CT[5810]!=0|true)) || (++__CLOVER_240_0.cloverRec.CF[5810]==0&false)))
		{{
			assert((((liste_grappe!=null)) && (++__CLOVER_240_0.cloverRec.CT[5811]!=0|true)) || (++__CLOVER_240_0.cloverRec.CF[5811]==0&false));
			assert((((liste_grappe.length>0)) && (++__CLOVER_240_0.cloverRec.CT[5812]!=0|true)) || (++__CLOVER_240_0.cloverRec.CF[5812]==0&false));
			__CLOVER_240_0.cloverRec.S[20102]++;g=liste_grappe[0];
		}
		}assert((((g!=null)) && (++__CLOVER_240_0.cloverRec.CT[5813]!=0|true)) || (++__CLOVER_240_0.cloverRec.CF[5813]==0&false));
		__CLOVER_240_0.cloverRec.S[20103]++;return g;
	}

	public String classe_racine()
	{__CLOVER_240_0.cloverRec.M[1396]++;
		__CLOVER_240_0.cloverRec.S[20104]++;return nom_classe.nom;
	}

	public String routine_racine()
	{__CLOVER_240_0.cloverRec.M[1397]++;
		__CLOVER_240_0.cloverRec.S[20105]++;if((((procedure_racine==null) && (++__CLOVER_240_0.cloverRec.CT[5814]!=0|true)) || (++__CLOVER_240_0.cloverRec.CF[5814]==0&false)))
			{__CLOVER_240_0.cloverRec.S[20106]++;return null;
		}else
			{__CLOVER_240_0.cloverRec.S[20107]++;return procedure_racine.nom;
	}}

	public NomSysteme nom;
	public Type nom_classe;
	public NomGrappe grappe_racine;
	public NomFeature procedure_racine;
	public Grappe liste_grappe[];
}
