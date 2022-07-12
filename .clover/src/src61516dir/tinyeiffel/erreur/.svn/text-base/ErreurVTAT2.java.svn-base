/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ *//*
 * Created on 5 d\u00e9c. 2003
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
public class ErreurVTAT2 extends Erreur {static class __CLOVER_159_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}

	public ErreurVTAT2(Classe classe,Type type1,
						Type type2,int err)
	{__CLOVER_159_0.cloverRec.M[968]++;
		assert((((classe!=null)) && (++__CLOVER_159_0.cloverRec.CT[3504]!=0|true)) || (++__CLOVER_159_0.cloverRec.CF[3504]==0&false));
		assert((((type1!=null)) && (++__CLOVER_159_0.cloverRec.CT[3505]!=0|true)) || (++__CLOVER_159_0.cloverRec.CF[3505]==0&false));
		assert((((type2!=null)) && (++__CLOVER_159_0.cloverRec.CT[3506]!=0|true)) || (++__CLOVER_159_0.cloverRec.CF[3506]==0&false));
		assert((((err>=Type_expanse&&err<=Type_ancre)) && (++__CLOVER_159_0.cloverRec.CT[3507]!=0|true)) || (++__CLOVER_159_0.cloverRec.CF[3507]==0&false));
		__CLOVER_159_0.cloverRec.S[14884]++;this.classe=classe;
		__CLOVER_159_0.cloverRec.S[14885]++;this.type1=type1;
		__CLOVER_159_0.cloverRec.S[14886]++;this.type2=type2;
		__CLOVER_159_0.cloverRec.S[14887]++;no_erreur=err;
	}

	public ErreurVTAT2(Classe classe,Type type1)
	{__CLOVER_159_0.cloverRec.M[969]++;
		assert((((classe!=null)) && (++__CLOVER_159_0.cloverRec.CT[3508]!=0|true)) || (++__CLOVER_159_0.cloverRec.CF[3508]==0&false));
		assert((((type1!=null)) && (++__CLOVER_159_0.cloverRec.CT[3509]!=0|true)) || (++__CLOVER_159_0.cloverRec.CF[3509]==0&false));
		__CLOVER_159_0.cloverRec.S[14888]++;this.classe=classe;
		__CLOVER_159_0.cloverRec.S[14889]++;this.type1=type1;
		__CLOVER_159_0.cloverRec.S[14890]++;this.type2=null;
		__CLOVER_159_0.cloverRec.S[14891]++;no_erreur=Type_inconnue;
	}

	Classe classe;
	Type type1,type2;
	int no_erreur;

	public static final int Type_expanse=1;
	public static final int Type_generique=2;
	public static final int Type_ancre=3;
	public static final int Type_inconnue=4; 

	/* (non-Javadoc)
	 * @see erreur.Erreur#toMsg()
	 */
	public String toMsg() {__CLOVER_159_0.cloverRec.M[970]++;
		__CLOVER_159_0.cloverRec.S[14892]++;boolean __CLOVER_bool0=false;switch(no_erreur)
		{
			case Type_expanse:if (!__CLOVER_bool0) {__CLOVER_159_0.cloverRec.S[14893]++;__CLOVER_bool0=true;}
				__CLOVER_159_0.cloverRec.S[14894]++;return "Dans la classe "+classe.nom+", le type "+
						"ancr\u00e9 "+type1+" a la ligne "+
						type1.debut()+" pointe vers le type "+
						"expanse "+type2+" a la ligne "+
						type2.debut();
			case Type_generique:if (!__CLOVER_bool0) {__CLOVER_159_0.cloverRec.S[14895]++;__CLOVER_bool0=true;}
				__CLOVER_159_0.cloverRec.S[14896]++;return "Dans la classe "+classe.nom+", le type "+
						"ancr\u00e9 "+type1+" a la ligne "+
						type1.debut()+" pointe vers le type "+
						"g\u00e9n\u00e9rique "+type2+" a la ligne "+
						type2.debut();
			case Type_ancre:if (!__CLOVER_bool0) {__CLOVER_159_0.cloverRec.S[14897]++;__CLOVER_bool0=true;}
				__CLOVER_159_0.cloverRec.S[14898]++;return "Dans la classe "+classe.nom+", le type "+
						"ancr\u00e9 "+type1+" a la ligne "+
						type1.debut()+" pointe vers le type "+
						"ancr\u00e9 "+type2+" a la ligne "+
						type2.debut();
			case Type_inconnue:if (!__CLOVER_bool0) {__CLOVER_159_0.cloverRec.S[14899]++;__CLOVER_bool0=true;}
				__CLOVER_159_0.cloverRec.S[14900]++;return "Dans la classe "+classe.nom+", le type "+
						"ancr\u00e9 "+type1+" a la ligne "+
						type1.debut()+" pointe vers rien";
			default:if (!__CLOVER_bool0) {__CLOVER_159_0.cloverRec.S[14901]++;__CLOVER_bool0=true;}
				assert((((false)) && (++__CLOVER_159_0.cloverRec.CT[3510]!=0|true)) || (++__CLOVER_159_0.cloverRec.CF[3510]==0&false));
		}
		assert((((false)) && (++__CLOVER_159_0.cloverRec.CT[3511]!=0|true)) || (++__CLOVER_159_0.cloverRec.CF[3511]==0&false));
		__CLOVER_159_0.cloverRec.S[14902]++;return null;
	}


}
