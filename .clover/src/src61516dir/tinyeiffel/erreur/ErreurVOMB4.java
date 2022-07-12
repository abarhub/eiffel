/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ *//*
 * Created on 21 d\u00e9c. 2003
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
public class ErreurVOMB4 extends Erreur {static class __CLOVER_143_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}

		public ErreurVOMB4(Classe classe,Instr_Inspect instr,
					Expr valeur1,Expr valeur2)
	{__CLOVER_143_0.cloverRec.M[931]++;
		assert((((classe!=null)) && (++__CLOVER_143_0.cloverRec.CT[3416]!=0|true)) || (++__CLOVER_143_0.cloverRec.CF[3416]==0&false));
		assert((((instr!=null)) && (++__CLOVER_143_0.cloverRec.CT[3417]!=0|true)) || (++__CLOVER_143_0.cloverRec.CF[3417]==0&false));
		assert((((valeur1!=null)) && (++__CLOVER_143_0.cloverRec.CT[3418]!=0|true)) || (++__CLOVER_143_0.cloverRec.CF[3418]==0&false));
		assert((((valeur2!=null)) && (++__CLOVER_143_0.cloverRec.CT[3419]!=0|true)) || (++__CLOVER_143_0.cloverRec.CF[3419]==0&false));
		__CLOVER_143_0.cloverRec.S[14779]++;conflit=conflit_elt_elt;
		__CLOVER_143_0.cloverRec.S[14780]++;this.valeur1=valeur1;
		__CLOVER_143_0.cloverRec.S[14781]++;this.valeur2=valeur2;
		__CLOVER_143_0.cloverRec.S[14782]++;this.instr=instr;
		__CLOVER_143_0.cloverRec.S[14783]++;this.classe=classe;
	}

	public ErreurVOMB4(Classe classe,Instr_Inspect instr,
					Expr valeur1,Vector inter1)
	{__CLOVER_143_0.cloverRec.M[932]++;
		assert((((classe!=null)) && (++__CLOVER_143_0.cloverRec.CT[3420]!=0|true)) || (++__CLOVER_143_0.cloverRec.CF[3420]==0&false));
		assert((((instr!=null)) && (++__CLOVER_143_0.cloverRec.CT[3421]!=0|true)) || (++__CLOVER_143_0.cloverRec.CF[3421]==0&false));
		assert((((valeur1!=null)) && (++__CLOVER_143_0.cloverRec.CT[3422]!=0|true)) || (++__CLOVER_143_0.cloverRec.CF[3422]==0&false));
		assert((((inter1!=null)) && (++__CLOVER_143_0.cloverRec.CT[3423]!=0|true)) || (++__CLOVER_143_0.cloverRec.CF[3423]==0&false));
		assert((((inter1.size()==2)) && (++__CLOVER_143_0.cloverRec.CT[3424]!=0|true)) || (++__CLOVER_143_0.cloverRec.CF[3424]==0&false));
		assert((((inter1.elementAt(0) instanceof Expr)) && (++__CLOVER_143_0.cloverRec.CT[3425]!=0|true)) || (++__CLOVER_143_0.cloverRec.CF[3425]==0&false));
		assert((((inter1.elementAt(1) instanceof Expr)) && (++__CLOVER_143_0.cloverRec.CT[3426]!=0|true)) || (++__CLOVER_143_0.cloverRec.CF[3426]==0&false));
		__CLOVER_143_0.cloverRec.S[14784]++;conflit=conflit_elt_inter;
		__CLOVER_143_0.cloverRec.S[14785]++;this.valeur1=valeur1;
		__CLOVER_143_0.cloverRec.S[14786]++;this.inter1=inter1;
		__CLOVER_143_0.cloverRec.S[14787]++;this.instr=instr;
		__CLOVER_143_0.cloverRec.S[14788]++;this.classe=classe;
	}

	public ErreurVOMB4(Classe classe,Instr_Inspect instr,
					Vector inter1,Vector inter2)
	{__CLOVER_143_0.cloverRec.M[933]++;
		assert((((classe!=null)) && (++__CLOVER_143_0.cloverRec.CT[3427]!=0|true)) || (++__CLOVER_143_0.cloverRec.CF[3427]==0&false));
		assert((((instr!=null)) && (++__CLOVER_143_0.cloverRec.CT[3428]!=0|true)) || (++__CLOVER_143_0.cloverRec.CF[3428]==0&false));
		assert((((inter1!=null)) && (++__CLOVER_143_0.cloverRec.CT[3429]!=0|true)) || (++__CLOVER_143_0.cloverRec.CF[3429]==0&false));
		assert((((inter1.size()==2)) && (++__CLOVER_143_0.cloverRec.CT[3430]!=0|true)) || (++__CLOVER_143_0.cloverRec.CF[3430]==0&false));
		assert((((inter1.elementAt(0) instanceof Expr)) && (++__CLOVER_143_0.cloverRec.CT[3431]!=0|true)) || (++__CLOVER_143_0.cloverRec.CF[3431]==0&false));
		assert((((inter1.elementAt(1) instanceof Expr)) && (++__CLOVER_143_0.cloverRec.CT[3432]!=0|true)) || (++__CLOVER_143_0.cloverRec.CF[3432]==0&false));
		assert((((inter2!=null)) && (++__CLOVER_143_0.cloverRec.CT[3433]!=0|true)) || (++__CLOVER_143_0.cloverRec.CF[3433]==0&false));
		assert((((inter2.size()==2)) && (++__CLOVER_143_0.cloverRec.CT[3434]!=0|true)) || (++__CLOVER_143_0.cloverRec.CF[3434]==0&false));
		assert((((inter2.elementAt(0) instanceof Expr)) && (++__CLOVER_143_0.cloverRec.CT[3435]!=0|true)) || (++__CLOVER_143_0.cloverRec.CF[3435]==0&false));
		assert((((inter2.elementAt(1) instanceof Expr)) && (++__CLOVER_143_0.cloverRec.CT[3436]!=0|true)) || (++__CLOVER_143_0.cloverRec.CF[3436]==0&false));
		__CLOVER_143_0.cloverRec.S[14789]++;conflit=conflit_inter_inter;
		__CLOVER_143_0.cloverRec.S[14790]++;this.inter1=inter1;
		__CLOVER_143_0.cloverRec.S[14791]++;this.inter2=inter2;
		__CLOVER_143_0.cloverRec.S[14792]++;this.instr=instr;
		__CLOVER_143_0.cloverRec.S[14793]++;this.classe=classe;
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
	{__CLOVER_143_0.cloverRec.M[934]++;
		assert((((intervalle!=null)) && (++__CLOVER_143_0.cloverRec.CT[3437]!=0|true)) || (++__CLOVER_143_0.cloverRec.CF[3437]==0&false));
		assert((((intervalle.size()==2)) && (++__CLOVER_143_0.cloverRec.CT[3438]!=0|true)) || (++__CLOVER_143_0.cloverRec.CF[3438]==0&false));
		assert((((intervalle.elementAt(0) instanceof Expr)) && (++__CLOVER_143_0.cloverRec.CT[3439]!=0|true)) || (++__CLOVER_143_0.cloverRec.CF[3439]==0&false));
		assert((((intervalle.elementAt(1) instanceof Expr)) && (++__CLOVER_143_0.cloverRec.CT[3440]!=0|true)) || (++__CLOVER_143_0.cloverRec.CF[3440]==0&false));
		__CLOVER_143_0.cloverRec.S[14794]++;Expr e1,e2;
		__CLOVER_143_0.cloverRec.S[14795]++;e1=(Expr)intervalle.elementAt(0);
		__CLOVER_143_0.cloverRec.S[14796]++;e2=(Expr)intervalle.elementAt(1);
		__CLOVER_143_0.cloverRec.S[14797]++;return e1+".."+e2;
	}

	/* (non-Javadoc)
	 * @see erreur.Erreur#toMsg()
	 */
	public String toMsg() {__CLOVER_143_0.cloverRec.M[935]++;
		__CLOVER_143_0.cloverRec.S[14798]++;if((((conflit==conflit_elt_elt) && (++__CLOVER_143_0.cloverRec.CT[3441]!=0|true)) || (++__CLOVER_143_0.cloverRec.CF[3441]==0&false)))
			{__CLOVER_143_0.cloverRec.S[14799]++;return "Dans la classe "+classe.nom+", il y a conflit"+
					" entre la valeur "+valeur1+" qui est pr\u00e9sente"+
					" a la ligne "+valeur1.debut()+" et a la ligne "+
					valeur2.debut();
		}else {__CLOVER_143_0.cloverRec.S[14800]++;if((((conflit==conflit_elt_inter) && (++__CLOVER_143_0.cloverRec.CT[3442]!=0|true)) || (++__CLOVER_143_0.cloverRec.CF[3442]==0&false)))
			{__CLOVER_143_0.cloverRec.S[14801]++;return "Dans la classe "+classe.nom+", il y a conflit"+
					" entre la valeur "+valeur1+" a la ligne "+
					valeur1.debut()+" et l'intervalle "+
					toString(inter1)+" a la ligne "+
					((Expr)inter1.elementAt(0)).debut();
		}else {__CLOVER_143_0.cloverRec.S[14802]++;if((((conflit==conflit_inter_inter) && (++__CLOVER_143_0.cloverRec.CT[3443]!=0|true)) || (++__CLOVER_143_0.cloverRec.CF[3443]==0&false)))
			{__CLOVER_143_0.cloverRec.S[14803]++;return "Dans la classe "+classe.nom+", il y a conflit"+
					" entre les intervalles "+toString(inter1)+
					" a la ligne "+((Expr)inter1.elementAt(0)).debut()+" et "+
					toString(inter2)+" a la ligne "+
					((Expr)inter2.elementAt(0)).debut();
		}}}assert((((false)) && (++__CLOVER_143_0.cloverRec.CT[3444]!=0|true)) || (++__CLOVER_143_0.cloverRec.CF[3444]==0&false));
		__CLOVER_143_0.cloverRec.S[14804]++;return null;
	}


}
