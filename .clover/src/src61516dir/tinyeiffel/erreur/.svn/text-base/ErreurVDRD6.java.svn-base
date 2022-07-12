/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ *//*
 * Created on 20 nov. 2003
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
public class ErreurVDRD6 extends Erreur {static class __CLOVER_101_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}


	public ErreurVDRD6(Classe classe,
							Feature feature_directe,
							Heritage heritage,
							NomFeature nom,
							boolean pb_variable,
							boolean pb_ancetre)
	{__CLOVER_101_0.cloverRec.M[835]++;
		assert((((classe!=null)) && (++__CLOVER_101_0.cloverRec.CT[3208]!=0|true)) || (++__CLOVER_101_0.cloverRec.CF[3208]==0&false));
		assert((((feature_directe!=null)) && (++__CLOVER_101_0.cloverRec.CT[3209]!=0|true)) || (++__CLOVER_101_0.cloverRec.CF[3209]==0&false));
		assert((((nom!=null)) && (++__CLOVER_101_0.cloverRec.CT[3210]!=0|true)) || (++__CLOVER_101_0.cloverRec.CF[3210]==0&false));
		//assert(ancetre_variable||ancetre_expanded);
		__CLOVER_101_0.cloverRec.S[14499]++;this.feature_directe=feature_directe;
		__CLOVER_101_0.cloverRec.S[14500]++;this.classe=classe;
		__CLOVER_101_0.cloverRec.S[14501]++;this.heritage=heritage;
		__CLOVER_101_0.cloverRec.S[14502]++;this.nom=nom;
		__CLOVER_101_0.cloverRec.S[14503]++;this.pb_variable=pb_variable;
		__CLOVER_101_0.cloverRec.S[14504]++;this.pb_ancetre=pb_ancetre;
	}

	Feature feature_directe;
	Classe classe;
	Heritage heritage;
	NomFeature nom;
	boolean pb_variable;
	boolean pb_ancetre;

	/* (non-Javadoc)
	 * @see erreur.Erreur#toMsg()
	 */
	public String toMsg() {__CLOVER_101_0.cloverRec.M[836]++;
		__CLOVER_101_0.cloverRec.S[14505]++;if((((pb_variable) && (++__CLOVER_101_0.cloverRec.CT[3211]!=0|true)) || (++__CLOVER_101_0.cloverRec.CF[3211]==0&false)))
		{{
			__CLOVER_101_0.cloverRec.S[14506]++;if((((pb_ancetre) && (++__CLOVER_101_0.cloverRec.CT[3212]!=0|true)) || (++__CLOVER_101_0.cloverRec.CF[3212]==0&false)))
			{{
				__CLOVER_101_0.cloverRec.S[14507]++;return "Impossible de redefinir l'attribut non variable "+
						nom+" a la ligne "+heritage.debut()+
						" en un attribut variable a la ligne "+
						feature_directe.debut();
			}
			}else
			{{
				__CLOVER_101_0.cloverRec.S[14508]++;return "Impossible de redefinir l'attribut variable "+
						nom+" a la ligne "+heritage.debut()+
						" en un attribut non variable a la ligne "+
						feature_directe.debut();
			}
		}}
		}else
		{{
			__CLOVER_101_0.cloverRec.S[14509]++;if((((pb_ancetre) && (++__CLOVER_101_0.cloverRec.CT[3213]!=0|true)) || (++__CLOVER_101_0.cloverRec.CF[3213]==0&false)))
			{{
				__CLOVER_101_0.cloverRec.S[14510]++;return "Impossible de redefinir l'attribut non expanded "+
						nom+" a la ligne "+heritage.debut()+
						" en un attribut expanded a la ligne "+
						feature_directe.debut();
			}
			}else
			{{
				__CLOVER_101_0.cloverRec.S[14511]++;return "Impossible de redefinir l'attribut de type expanded "+
						nom+" a la ligne "+heritage.debut()+
						" en un attribut non expanded a la ligne "+
						feature_directe.debut();
			}
		}}
			
	}}


}
