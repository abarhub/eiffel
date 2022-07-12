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
public class ErreurVTAT1 extends Erreur {static class __CLOVER_158_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}

	public ErreurVTAT1(Classe classe,Type type1,
						Type type2,int err)
	{__CLOVER_158_0.cloverRec.M[965]++;
		assert((((classe!=null)) && (++__CLOVER_158_0.cloverRec.CT[3496]!=0|true)) || (++__CLOVER_158_0.cloverRec.CF[3496]==0&false));
		assert((((type1!=null)) && (++__CLOVER_158_0.cloverRec.CT[3497]!=0|true)) || (++__CLOVER_158_0.cloverRec.CF[3497]==0&false));
		assert((((type2!=null)) && (++__CLOVER_158_0.cloverRec.CT[3498]!=0|true)) || (++__CLOVER_158_0.cloverRec.CF[3498]==0&false));
		assert((((err>=Type_expanse&&err<=Type_ancre)) && (++__CLOVER_158_0.cloverRec.CT[3499]!=0|true)) || (++__CLOVER_158_0.cloverRec.CF[3499]==0&false));
		__CLOVER_158_0.cloverRec.S[14865]++;this.classe=classe;
		__CLOVER_158_0.cloverRec.S[14866]++;this.type1=type1;
		__CLOVER_158_0.cloverRec.S[14867]++;this.type2=type2;
		__CLOVER_158_0.cloverRec.S[14868]++;no_erreur=err;
	}

	public ErreurVTAT1(Classe classe,Type type1)
	{__CLOVER_158_0.cloverRec.M[966]++;
		assert((((classe!=null)) && (++__CLOVER_158_0.cloverRec.CT[3500]!=0|true)) || (++__CLOVER_158_0.cloverRec.CF[3500]==0&false));
		assert((((type1!=null)) && (++__CLOVER_158_0.cloverRec.CT[3501]!=0|true)) || (++__CLOVER_158_0.cloverRec.CF[3501]==0&false));
		__CLOVER_158_0.cloverRec.S[14869]++;this.classe=classe;
		__CLOVER_158_0.cloverRec.S[14870]++;this.type1=type1;
		__CLOVER_158_0.cloverRec.S[14871]++;this.type2=null;
		__CLOVER_158_0.cloverRec.S[14872]++;no_erreur=Type_inconnue;
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
	public String toMsg() {__CLOVER_158_0.cloverRec.M[967]++;
		__CLOVER_158_0.cloverRec.S[14873]++;boolean __CLOVER_bool0=false;switch(no_erreur)
		{
			case Type_expanse:if (!__CLOVER_bool0) {__CLOVER_158_0.cloverRec.S[14874]++;__CLOVER_bool0=true;}
				__CLOVER_158_0.cloverRec.S[14875]++;return "Dans la classe "+classe.nom+", le type "+
						"ancr\u00e9 "+type1+" a la ligne "+
						type1.debut()+" pointe vers le type "+
						"expanse "+type2+" a la ligne "+
						type2.debut();
			case Type_generique:if (!__CLOVER_bool0) {__CLOVER_158_0.cloverRec.S[14876]++;__CLOVER_bool0=true;}
				__CLOVER_158_0.cloverRec.S[14877]++;return "Dans la classe "+classe.nom+", le type "+
						"ancr\u00e9 "+type1+" a la ligne "+
						type1.debut()+" pointe vers le type "+
						"g\u00e9n\u00e9rique "+type2+" a la ligne "+
						type2.debut();
			case Type_ancre:if (!__CLOVER_bool0) {__CLOVER_158_0.cloverRec.S[14878]++;__CLOVER_bool0=true;}
				__CLOVER_158_0.cloverRec.S[14879]++;return "Dans la classe "+classe.nom+", le type "+
						"ancr\u00e9 "+type1+" a la ligne "+
						type1.debut()+" pointe vers le type "+
						"ancr\u00e9 "+type2+" a la ligne "+
						type2.debut();
			case Type_inconnue:if (!__CLOVER_bool0) {__CLOVER_158_0.cloverRec.S[14880]++;__CLOVER_bool0=true;}
				__CLOVER_158_0.cloverRec.S[14881]++;return "Dans la classe "+classe.nom+", le type "+
						"ancr\u00e9 "+type1+" a la ligne "+
						type1.debut()+" pointe vers rien";
			default:if (!__CLOVER_bool0) {__CLOVER_158_0.cloverRec.S[14882]++;__CLOVER_bool0=true;}
				assert((((false)) && (++__CLOVER_158_0.cloverRec.CT[3502]!=0|true)) || (++__CLOVER_158_0.cloverRec.CF[3502]==0&false));
		}
		assert((((false)) && (++__CLOVER_158_0.cloverRec.CT[3503]!=0|true)) || (++__CLOVER_158_0.cloverRec.CF[3503]==0&false));
		__CLOVER_158_0.cloverRec.S[14883]++;return null;
	}

}
