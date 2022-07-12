/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ *//*
 * Created on 11 d\u00e9c. 2003
 *
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
package tinyeiffel.erreur;

import tinyeiffel.ast.*;
import java.util.*;
/**
 * @author BARRET
 *
 * To change the template for this generated type comment go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
public class ErreurVOMB3 extends Erreur {static class __CLOVER_142_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}

	public ErreurVOMB3(Classe classe,Instr_Inspect instr,
					Expr valeur1,Expr valeur2)
	{__CLOVER_142_0.cloverRec.M[926]++;
		assert((((classe!=null)) && (++__CLOVER_142_0.cloverRec.CT[3387]!=0|true)) || (++__CLOVER_142_0.cloverRec.CF[3387]==0&false));
		assert((((instr!=null)) && (++__CLOVER_142_0.cloverRec.CT[3388]!=0|true)) || (++__CLOVER_142_0.cloverRec.CF[3388]==0&false));
		assert((((valeur1!=null)) && (++__CLOVER_142_0.cloverRec.CT[3389]!=0|true)) || (++__CLOVER_142_0.cloverRec.CF[3389]==0&false));
		assert((((valeur2!=null)) && (++__CLOVER_142_0.cloverRec.CT[3390]!=0|true)) || (++__CLOVER_142_0.cloverRec.CF[3390]==0&false));
		__CLOVER_142_0.cloverRec.S[14753]++;conflit=conflit_elt_elt;
		__CLOVER_142_0.cloverRec.S[14754]++;this.valeur1=valeur1;
		__CLOVER_142_0.cloverRec.S[14755]++;this.valeur2=valeur2;
		__CLOVER_142_0.cloverRec.S[14756]++;this.instr=instr;
		__CLOVER_142_0.cloverRec.S[14757]++;this.classe=classe;
	}

	public ErreurVOMB3(Classe classe,Instr_Inspect instr,
					Expr valeur1,Vector inter1)
	{__CLOVER_142_0.cloverRec.M[927]++;
		assert((((classe!=null)) && (++__CLOVER_142_0.cloverRec.CT[3391]!=0|true)) || (++__CLOVER_142_0.cloverRec.CF[3391]==0&false));
		assert((((instr!=null)) && (++__CLOVER_142_0.cloverRec.CT[3392]!=0|true)) || (++__CLOVER_142_0.cloverRec.CF[3392]==0&false));
		assert((((valeur1!=null)) && (++__CLOVER_142_0.cloverRec.CT[3393]!=0|true)) || (++__CLOVER_142_0.cloverRec.CF[3393]==0&false));
		assert((((inter1!=null)) && (++__CLOVER_142_0.cloverRec.CT[3394]!=0|true)) || (++__CLOVER_142_0.cloverRec.CF[3394]==0&false));
		assert((((inter1.size()==2)) && (++__CLOVER_142_0.cloverRec.CT[3395]!=0|true)) || (++__CLOVER_142_0.cloverRec.CF[3395]==0&false));
		assert((((inter1.elementAt(0) instanceof Expr)) && (++__CLOVER_142_0.cloverRec.CT[3396]!=0|true)) || (++__CLOVER_142_0.cloverRec.CF[3396]==0&false));
		assert((((inter1.elementAt(1) instanceof Expr)) && (++__CLOVER_142_0.cloverRec.CT[3397]!=0|true)) || (++__CLOVER_142_0.cloverRec.CF[3397]==0&false));
		__CLOVER_142_0.cloverRec.S[14758]++;conflit=conflit_elt_inter;
		__CLOVER_142_0.cloverRec.S[14759]++;this.valeur1=valeur1;
		__CLOVER_142_0.cloverRec.S[14760]++;this.inter1=inter1;
		__CLOVER_142_0.cloverRec.S[14761]++;this.instr=instr;
		__CLOVER_142_0.cloverRec.S[14762]++;this.classe=classe;
	}

	public ErreurVOMB3(Classe classe,Instr_Inspect instr,
					Vector inter1,Vector inter2)
	{__CLOVER_142_0.cloverRec.M[928]++;
		assert((((classe!=null)) && (++__CLOVER_142_0.cloverRec.CT[3398]!=0|true)) || (++__CLOVER_142_0.cloverRec.CF[3398]==0&false));
		assert((((instr!=null)) && (++__CLOVER_142_0.cloverRec.CT[3399]!=0|true)) || (++__CLOVER_142_0.cloverRec.CF[3399]==0&false));
		assert((((inter1!=null)) && (++__CLOVER_142_0.cloverRec.CT[3400]!=0|true)) || (++__CLOVER_142_0.cloverRec.CF[3400]==0&false));
		assert((((inter1.size()==2)) && (++__CLOVER_142_0.cloverRec.CT[3401]!=0|true)) || (++__CLOVER_142_0.cloverRec.CF[3401]==0&false));
		assert((((inter1.elementAt(0) instanceof Expr)) && (++__CLOVER_142_0.cloverRec.CT[3402]!=0|true)) || (++__CLOVER_142_0.cloverRec.CF[3402]==0&false));
		assert((((inter1.elementAt(1) instanceof Expr)) && (++__CLOVER_142_0.cloverRec.CT[3403]!=0|true)) || (++__CLOVER_142_0.cloverRec.CF[3403]==0&false));
		assert((((inter2!=null)) && (++__CLOVER_142_0.cloverRec.CT[3404]!=0|true)) || (++__CLOVER_142_0.cloverRec.CF[3404]==0&false));
		assert((((inter2.size()==2)) && (++__CLOVER_142_0.cloverRec.CT[3405]!=0|true)) || (++__CLOVER_142_0.cloverRec.CF[3405]==0&false));
		assert((((inter2.elementAt(0) instanceof Expr)) && (++__CLOVER_142_0.cloverRec.CT[3406]!=0|true)) || (++__CLOVER_142_0.cloverRec.CF[3406]==0&false));
		assert((((inter2.elementAt(1) instanceof Expr)) && (++__CLOVER_142_0.cloverRec.CT[3407]!=0|true)) || (++__CLOVER_142_0.cloverRec.CF[3407]==0&false));
		__CLOVER_142_0.cloverRec.S[14763]++;conflit=conflit_inter_inter;
		__CLOVER_142_0.cloverRec.S[14764]++;this.inter1=inter1;
		__CLOVER_142_0.cloverRec.S[14765]++;this.inter2=inter2;
		__CLOVER_142_0.cloverRec.S[14766]++;this.instr=instr;
		__CLOVER_142_0.cloverRec.S[14767]++;this.classe=classe;
	}
	
	Classe classe;
	Instr_Inspect instr;
	int conflit;
	Expr valeur1,valeur2;
	Vector inter1,inter2;

	public static final int conflit_elt_inter=1;
	public static final int conflit_elt_elt=2;
	public static final int conflit_inter_inter=3;
	

	protected String toString(Vector intervalle)
	{__CLOVER_142_0.cloverRec.M[929]++;
		assert((((intervalle!=null)) && (++__CLOVER_142_0.cloverRec.CT[3408]!=0|true)) || (++__CLOVER_142_0.cloverRec.CF[3408]==0&false));
		assert((((intervalle.size()==2)) && (++__CLOVER_142_0.cloverRec.CT[3409]!=0|true)) || (++__CLOVER_142_0.cloverRec.CF[3409]==0&false));
		assert((((intervalle.elementAt(0) instanceof Expr)) && (++__CLOVER_142_0.cloverRec.CT[3410]!=0|true)) || (++__CLOVER_142_0.cloverRec.CF[3410]==0&false));
		assert((((intervalle.elementAt(1) instanceof Expr)) && (++__CLOVER_142_0.cloverRec.CT[3411]!=0|true)) || (++__CLOVER_142_0.cloverRec.CF[3411]==0&false));
		__CLOVER_142_0.cloverRec.S[14768]++;Expr e1,e2;
		__CLOVER_142_0.cloverRec.S[14769]++;e1=(Expr)intervalle.elementAt(0);
		__CLOVER_142_0.cloverRec.S[14770]++;e2=(Expr)intervalle.elementAt(1);
		__CLOVER_142_0.cloverRec.S[14771]++;return e1+".."+e2;
	}

	/* (non-Javadoc)
	 * @see erreur.Erreur#toMsg()
	 */
	public String toMsg() {__CLOVER_142_0.cloverRec.M[930]++;
		__CLOVER_142_0.cloverRec.S[14772]++;if((((conflit==conflit_elt_elt) && (++__CLOVER_142_0.cloverRec.CT[3412]!=0|true)) || (++__CLOVER_142_0.cloverRec.CF[3412]==0&false)))
			{__CLOVER_142_0.cloverRec.S[14773]++;return "Dans la classe "+classe.nom+", il y a conflit"+
					" entre la valeur "+valeur1+" qui est pr\u00e9sente"+
					" a la ligne "+valeur1.debut()+" et a la ligne "+
					valeur2.debut();
		}else {__CLOVER_142_0.cloverRec.S[14774]++;if((((conflit==conflit_elt_inter) && (++__CLOVER_142_0.cloverRec.CT[3413]!=0|true)) || (++__CLOVER_142_0.cloverRec.CF[3413]==0&false)))
			{__CLOVER_142_0.cloverRec.S[14775]++;return "Dans la classe "+classe.nom+", il y a conflit"+
					" entre la valeur "+valeur1+" a la ligne "+
					valeur1.debut()+" et l'intervalle "+
					toString(inter1)+" a la ligne "+
					((Expr)inter1.elementAt(0)).debut();
		}else {__CLOVER_142_0.cloverRec.S[14776]++;if((((conflit==conflit_inter_inter) && (++__CLOVER_142_0.cloverRec.CT[3414]!=0|true)) || (++__CLOVER_142_0.cloverRec.CF[3414]==0&false)))
			{__CLOVER_142_0.cloverRec.S[14777]++;return "Dans la classe "+classe.nom+", il y a conflit"+
					" entre les intervalles "+toString(inter1)+
					" a la ligne "+((Expr)inter1.elementAt(0)).debut()+" et "+
					toString(inter2)+" a la ligne "+
					((Expr)inter2.elementAt(0)).debut();
		}}}assert((((false)) && (++__CLOVER_142_0.cloverRec.CT[3415]!=0|true)) || (++__CLOVER_142_0.cloverRec.CF[3415]==0&false));
		__CLOVER_142_0.cloverRec.S[14778]++;return null;
	}

}
