/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ *//*
 * Created on 3 d\u00e9c. 2003
 *
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
package tinyeiffel.erreur;

import tinyeiffel.ast.*;

/**
 * @author BARRET
 *
 * To change the template for this generated type comment go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
public class ErreurVQMC extends Erreur {static class __CLOVER_145_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}

	public ErreurVQMC(Classe classe,Feature feature)
	{__CLOVER_145_0.cloverRec.M[938]++;
		assert((((classe!=null)) && (++__CLOVER_145_0.cloverRec.CT[3448]!=0|true)) || (++__CLOVER_145_0.cloverRec.CF[3448]==0&false));
		assert((((feature!=null)) && (++__CLOVER_145_0.cloverRec.CT[3449]!=0|true)) || (++__CLOVER_145_0.cloverRec.CF[3449]==0&false));
		assert((((feature instanceof FeatureExpr)) && (++__CLOVER_145_0.cloverRec.CT[3450]!=0|true)) || (++__CLOVER_145_0.cloverRec.CF[3450]==0&false));
		__CLOVER_145_0.cloverRec.S[14809]++;this.classe=classe;
		__CLOVER_145_0.cloverRec.S[14810]++;this.feature=(FeatureExpr)feature;
		__CLOVER_145_0.cloverRec.S[14811]++;simple=false;
	}

	public ErreurVQMC(Type type_classe,Feature feature)
	{__CLOVER_145_0.cloverRec.M[939]++;
		assert((((type_classe!=null)) && (++__CLOVER_145_0.cloverRec.CT[3451]!=0|true)) || (++__CLOVER_145_0.cloverRec.CF[3451]==0&false));
		assert((((feature!=null)) && (++__CLOVER_145_0.cloverRec.CT[3452]!=0|true)) || (++__CLOVER_145_0.cloverRec.CF[3452]==0&false));
		assert((((feature instanceof FeatureExpr)) && (++__CLOVER_145_0.cloverRec.CT[3453]!=0|true)) || (++__CLOVER_145_0.cloverRec.CF[3453]==0&false));
		__CLOVER_145_0.cloverRec.S[14812]++;this.type_classe=type_classe;
		__CLOVER_145_0.cloverRec.S[14813]++;this.feature=(FeatureExpr)feature;
		__CLOVER_145_0.cloverRec.S[14814]++;simple=true;
	}
	
	Classe classe;
	FeatureExpr feature;
	Type type_classe;
	boolean simple;

	/* (non-Javadoc)
	 * @see erreur.Erreur#toMsg()
	 */
	public String toMsg() {__CLOVER_145_0.cloverRec.M[940]++;
		__CLOVER_145_0.cloverRec.S[14815]++;if((((simple) && (++__CLOVER_145_0.cloverRec.CT[3454]!=0|true)) || (++__CLOVER_145_0.cloverRec.CF[3454]==0&false)))
		{{
			__CLOVER_145_0.cloverRec.S[14816]++;return "Dans la classe "+type_classe.nom+", l'attribut constant"+
			" n'est pas une constante "+
			"a la ligne "+feature.debut();
		}
		}else
		{{
			__CLOVER_145_0.cloverRec.S[14817]++;return "Dans la classe "+classe.nom+", l'attribut constant"+
				" n'est pas une constante "+
				"a la ligne "+feature.debut();
		}
	}}

}
