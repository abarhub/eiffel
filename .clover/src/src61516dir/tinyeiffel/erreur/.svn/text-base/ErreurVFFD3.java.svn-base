/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ *//*
 * Created on 6 oct. 2003
 *
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
package tinyeiffel.erreur;

import tinyeiffel.ast.*;
//import compiler.*;

/**
 * @author BARRET
 *
 * Erreur VFFD no 3
 * Conflit entre un attribut de la classe et d'un des ancetres 
 */
public class ErreurVFFD3 extends Erreur {static class __CLOVER_113_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}

	public ErreurVFFD3(Attribut a1,Attribut a2,Classe c)
	{__CLOVER_113_0.cloverRec.M[864]++;
		assert((((false)) && (++__CLOVER_113_0.cloverRec.CT[3272]!=0|true)) || (++__CLOVER_113_0.cloverRec.CF[3272]==0&false));
		assert((((a1!=null)) && (++__CLOVER_113_0.cloverRec.CT[3273]!=0|true)) || (++__CLOVER_113_0.cloverRec.CF[3273]==0&false));
		assert((((a2!=null)) && (++__CLOVER_113_0.cloverRec.CT[3274]!=0|true)) || (++__CLOVER_113_0.cloverRec.CF[3274]==0&false));
		assert((((c!=null)) && (++__CLOVER_113_0.cloverRec.CT[3275]!=0|true)) || (++__CLOVER_113_0.cloverRec.CF[3275]==0&false));
		//assert(a1.classe.nom.compareToIgnoreCase(c.nom)==0);
		assert((((a2.classe.nom.compareToIgnoreCase(c.nom)!=0)) && (++__CLOVER_113_0.cloverRec.CT[3276]!=0|true)) || (++__CLOVER_113_0.cloverRec.CF[3276]==0&false));
		__CLOVER_113_0.cloverRec.S[14596]++;attribut1=a1;
		__CLOVER_113_0.cloverRec.S[14597]++;attribut2=a2;
		__CLOVER_113_0.cloverRec.S[14598]++;classe=c;
	}

	/* (non-Javadoc)
	 * @see erreur.Erreur#toMsg()
	 */
	public String toMsg() {__CLOVER_113_0.cloverRec.M[865]++;
		__CLOVER_113_0.cloverRec.S[14599]++;if((((attribut1.classe.nom.compareToIgnoreCase(classe.nom)!=0) && (++__CLOVER_113_0.cloverRec.CT[3277]!=0|true)) || (++__CLOVER_113_0.cloverRec.CF[3277]==0&false)))
			{__CLOVER_113_0.cloverRec.S[14600]++;return "Erreur dans la classe "+classe.nom+" : "+
				"L'attribut "+attribut1+" est declar\u00e9 "+
				"dans les classes ancetres "+attribut1.classe.nom+
				" et "+attribut2.classe.nom;
		}else
			{__CLOVER_113_0.cloverRec.S[14601]++;return "Erreur dans la classe "+classe.nom+" : "+
				"L'attribut "+attribut1+" est deja declar\u00e9 "+
				"dans la classe ancetre "+attribut2.classe.nom;
	}}

	public Attribut attribut1,attribut2;
	public Classe classe;

}
