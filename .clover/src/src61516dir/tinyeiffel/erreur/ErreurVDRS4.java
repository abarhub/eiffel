/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ *//*
 * Created on 2 nov. 2003
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
public class ErreurVDRS4 extends Erreur {static class __CLOVER_106_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}

	
	public ErreurVDRS4(Classe classe,NomFeature nom,
						Heritage heritage)
	{__CLOVER_106_0.cloverRec.M[845]++;
		assert((((classe!=null)) && (++__CLOVER_106_0.cloverRec.CT[3227]!=0|true)) || (++__CLOVER_106_0.cloverRec.CF[3227]==0&false));
		assert((((nom!=null)) && (++__CLOVER_106_0.cloverRec.CT[3228]!=0|true)) || (++__CLOVER_106_0.cloverRec.CF[3228]==0&false));
		assert((((heritage!=null)) && (++__CLOVER_106_0.cloverRec.CT[3229]!=0|true)) || (++__CLOVER_106_0.cloverRec.CF[3229]==0&false));
		__CLOVER_106_0.cloverRec.S[14535]++;this.classe=classe;
		__CLOVER_106_0.cloverRec.S[14536]++;this.nom=nom;
		__CLOVER_106_0.cloverRec.S[14537]++;this.heritage=heritage;
	}


	public ErreurVDRS4(Classe classe,NomFeature nom,
						Heritage heritage,Feature feature_directe)
	{__CLOVER_106_0.cloverRec.M[846]++;
		assert((((classe!=null)) && (++__CLOVER_106_0.cloverRec.CT[3230]!=0|true)) || (++__CLOVER_106_0.cloverRec.CF[3230]==0&false));
		assert((((nom!=null)) && (++__CLOVER_106_0.cloverRec.CT[3231]!=0|true)) || (++__CLOVER_106_0.cloverRec.CF[3231]==0&false));
		assert((((heritage!=null)) && (++__CLOVER_106_0.cloverRec.CT[3232]!=0|true)) || (++__CLOVER_106_0.cloverRec.CF[3232]==0&false));
		assert((((feature_directe!=null)) && (++__CLOVER_106_0.cloverRec.CT[3233]!=0|true)) || (++__CLOVER_106_0.cloverRec.CF[3233]==0&false));
		__CLOVER_106_0.cloverRec.S[14538]++;this.classe=classe;
		__CLOVER_106_0.cloverRec.S[14539]++;this.nom=nom;
		__CLOVER_106_0.cloverRec.S[14540]++;this.heritage=heritage;
		__CLOVER_106_0.cloverRec.S[14541]++;this.feature_directe=feature_directe;
	}

	Classe classe;
	NomFeature nom;
	Heritage heritage;
	Feature feature_directe;

	/* (non-Javadoc)
	 * @see erreur.Erreur#toMsg()
	 */
	public String toMsg() {__CLOVER_106_0.cloverRec.M[847]++;
		__CLOVER_106_0.cloverRec.S[14542]++;if((((feature_directe!=null) && (++__CLOVER_106_0.cloverRec.CT[3234]!=0|true)) || (++__CLOVER_106_0.cloverRec.CF[3234]==0&false)))
		{{
			__CLOVER_106_0.cloverRec.S[14543]++;if((((feature_directe.is_deferred()) && (++__CLOVER_106_0.cloverRec.CT[3235]!=0|true)) || (++__CLOVER_106_0.cloverRec.CF[3235]==0&false)))
			{{
				__CLOVER_106_0.cloverRec.S[14544]++;return "Dans la classe "+classe.nom+" "+
					"l'attribut "+nom+" h\u00e9rit\u00e9 de "+heritage.type.nom+
					" n'est pas red\u00e9clar\u00e9 \u00e0 la ligne "+heritage.debut();
			}
			}else
			{{
				__CLOVER_106_0.cloverRec.S[14545]++;return "Dans la classe "+classe.nom+" "+
					"l'attribut "+nom+" h\u00e9rit\u00e9 de "+heritage.type.nom+
					" est d\u00e9clar\u00e9 redefini \u00e0 la ligne "+heritage.debut()+
					" alors que c'est une concr\u00e9tisation";
			}
		}}
		}else
		{{
			__CLOVER_106_0.cloverRec.S[14546]++;return "Dans la classe "+classe.nom+" "+
				"l'attribut "+nom+" h\u00e9rit\u00e9 de "+heritage.type.nom+
				" est d\u00e9clar\u00e9 red\u00e9finie \u00e0 la ligne "+heritage.debut()+
				" mais ne l'est pas effectivement";
		}
	}}

}
