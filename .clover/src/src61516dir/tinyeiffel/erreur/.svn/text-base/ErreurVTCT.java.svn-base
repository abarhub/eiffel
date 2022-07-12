/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ *//*
 * Created on 23 nov. 2003
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
public class ErreurVTCT extends Erreur {static class __CLOVER_161_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}

	public ErreurVTCT(Type type,Classe classe)
	{__CLOVER_161_0.cloverRec.M[973]++;
		assert((((type!=null)) && (++__CLOVER_161_0.cloverRec.CT[3514]!=0|true)) || (++__CLOVER_161_0.cloverRec.CF[3514]==0&false));
		assert((((classe!=null)) && (++__CLOVER_161_0.cloverRec.CT[3515]!=0|true)) || (++__CLOVER_161_0.cloverRec.CF[3515]==0&false));
		__CLOVER_161_0.cloverRec.S[14906]++;this.type=type;
		__CLOVER_161_0.cloverRec.S[14907]++;this.classe=classe;
		__CLOVER_161_0.cloverRec.S[14908]++;simple=false;
	}

	Type type;
	Classe classe;
	boolean simple;
	String nom_classe_inexistante,nom_classe;
	Position pos;

	public ErreurVTCT(String classe,Position pos)
	{__CLOVER_161_0.cloverRec.M[974]++;
		assert((((pos!=null)) && (++__CLOVER_161_0.cloverRec.CT[3516]!=0|true)) || (++__CLOVER_161_0.cloverRec.CF[3516]==0&false));
		assert((((classe!=null)) && (++__CLOVER_161_0.cloverRec.CT[3517]!=0|true)) || (++__CLOVER_161_0.cloverRec.CF[3517]==0&false));
		__CLOVER_161_0.cloverRec.S[14909]++;this.pos=pos;
		__CLOVER_161_0.cloverRec.S[14910]++;this.nom_classe_inexistante=classe;
		__CLOVER_161_0.cloverRec.S[14911]++;nom_classe=pos.NomClasse();
		__CLOVER_161_0.cloverRec.S[14912]++;simple=true;
	}
	
	/* (non-Javadoc)
	 * @see erreur.Erreur#toMsg()
	 */
	public String toMsg() {__CLOVER_161_0.cloverRec.M[975]++;
		__CLOVER_161_0.cloverRec.S[14913]++;if((((simple) && (++__CLOVER_161_0.cloverRec.CT[3518]!=0|true)) || (++__CLOVER_161_0.cloverRec.CF[3518]==0&false)))
		{{
			__CLOVER_161_0.cloverRec.S[14914]++;return "Dans la classe "+pos.fichier+" le type "+
			nom_classe_inexistante+" n'existe pas a la ligne "+pos;
		}
		}else
		{{
			__CLOVER_161_0.cloverRec.S[14915]++;return "Dans la classe "+classe.nom+" le type "+type+
				" n'existe pas a la ligne "+type.debut();
		}
	}}

}
