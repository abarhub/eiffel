/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ *//*
 * Created on 6 d\u00e9c. 2003
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
public class ErreurVWBE extends Erreur {static class __CLOVER_171_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}

	public ErreurVWBE(Classe classe,Expr e,int type)
	{__CLOVER_171_0.cloverRec.M[997]++;
		assert((((classe!=null)) && (++__CLOVER_171_0.cloverRec.CT[3583]!=0|true)) || (++__CLOVER_171_0.cloverRec.CF[3583]==0&false));
		assert((((e!=null)) && (++__CLOVER_171_0.cloverRec.CT[3584]!=0|true)) || (++__CLOVER_171_0.cloverRec.CF[3584]==0&false));
		assert((((type>=type_if&&type<=type_loop)) && (++__CLOVER_171_0.cloverRec.CT[3585]!=0|true)) || (++__CLOVER_171_0.cloverRec.CF[3585]==0&false));
		__CLOVER_171_0.cloverRec.S[14987]++;this.classe=classe;
		__CLOVER_171_0.cloverRec.S[14988]++;this.expr=e;
		__CLOVER_171_0.cloverRec.S[14989]++;this.type=type;
	}

	Classe classe;
	Expr expr;
	int type;

	public static final int type_if=1;
	public static final int type_elseif=2;
	public static final int type_check=3;
	public static final int type_invariant=4;
	public static final int type_require=5;
	public static final int type_ensure=6;
	public static final int type_loop_inv=7;
	public static final int type_loop=8;

	/* (non-Javadoc)
	 * @see erreur.Erreur#toMsg()
	 */
	public String toMsg() {__CLOVER_171_0.cloverRec.M[998]++;
		__CLOVER_171_0.cloverRec.S[14990]++;boolean __CLOVER_bool0=false;switch(type)
		{
			case type_if:if (!__CLOVER_bool0) {__CLOVER_171_0.cloverRec.S[14991]++;__CLOVER_bool0=true;}
				__CLOVER_171_0.cloverRec.S[14992]++;return "Dans la classe "+classe.nom+
						", l'expression a la ligne "+
						expr.debut()+" doit etre de type "+
						"BOOLEAN pour le if";
			case type_elseif:if (!__CLOVER_bool0) {__CLOVER_171_0.cloverRec.S[14993]++;__CLOVER_bool0=true;}
				__CLOVER_171_0.cloverRec.S[14994]++;return "Dans la classe "+classe.nom+
						", l'expression a la ligne "+
						expr.debut()+" doit etre de type "+
						"BOOLEAN pour le elseif";
			case type_check:if (!__CLOVER_bool0) {__CLOVER_171_0.cloverRec.S[14995]++;__CLOVER_bool0=true;}
				__CLOVER_171_0.cloverRec.S[14996]++;return "Dans la classe "+classe.nom+
						", l'expression a la ligne "+
						expr.debut()+" doit etre de type "+
						"BOOLEAN pour le check";
			case type_invariant:if (!__CLOVER_bool0) {__CLOVER_171_0.cloverRec.S[14997]++;__CLOVER_bool0=true;}
				__CLOVER_171_0.cloverRec.S[14998]++;return "Dans la classe "+classe.nom+
						", l'expression a la ligne "+
						expr.debut()+" doit etre de type "+
						"BOOLEAN pour l'invariant";
			case type_require:if (!__CLOVER_bool0) {__CLOVER_171_0.cloverRec.S[14999]++;__CLOVER_bool0=true;}
				__CLOVER_171_0.cloverRec.S[15000]++;return "Dans la classe "+classe.nom+
						", l'expression a la ligne "+
						expr.debut()+" doit etre de type "+
						"BOOLEAN pour la pr\u00e9condition";
			case type_ensure:if (!__CLOVER_bool0) {__CLOVER_171_0.cloverRec.S[15001]++;__CLOVER_bool0=true;}
				__CLOVER_171_0.cloverRec.S[15002]++;return "Dans la classe "+classe.nom+
						", l'expression a la ligne "+
						expr.debut()+" doit etre de type "+
						"BOOLEAN pour la postcondition";
			case type_loop_inv:if (!__CLOVER_bool0) {__CLOVER_171_0.cloverRec.S[15003]++;__CLOVER_bool0=true;}
				__CLOVER_171_0.cloverRec.S[15004]++;return "Dans la classe "+classe.nom+
						", l'expression a la ligne "+
						expr.debut()+" doit etre de type "+
						"BOOLEAN pour l'invariant de boucle";
			case type_loop:if (!__CLOVER_bool0) {__CLOVER_171_0.cloverRec.S[15005]++;__CLOVER_bool0=true;}
				__CLOVER_171_0.cloverRec.S[15006]++;return "Dans la classe "+classe.nom+
						", l'expression a la ligne "+
						expr.debut()+" doit etre de type "+
						"BOOLEAN pour la boucle";
			default:if (!__CLOVER_bool0) {__CLOVER_171_0.cloverRec.S[15007]++;__CLOVER_bool0=true;}
				assert((((false)) && (++__CLOVER_171_0.cloverRec.CT[3586]!=0|true)) || (++__CLOVER_171_0.cloverRec.CF[3586]==0&false));
				__CLOVER_171_0.cloverRec.S[15008]++;return null;
		}
		
	}

}
