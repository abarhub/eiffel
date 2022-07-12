/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ *//*
 * Created on 19 nov. 2003
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
public class ErreurVNCS2 extends Erreur {static class __CLOVER_139_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}

	public ErreurVNCS2(NomFeature nom,Classe classe,
						NomFeature nom_ancetre,Classe classe_ancetre,
						int no_param,Type type,Type type_ancetre)
	{__CLOVER_139_0.cloverRec.M[919]++;
		assert((((nom!=null)) && (++__CLOVER_139_0.cloverRec.CT[3371]!=0|true)) || (++__CLOVER_139_0.cloverRec.CF[3371]==0&false));
		assert((((classe!=null)) && (++__CLOVER_139_0.cloverRec.CT[3372]!=0|true)) || (++__CLOVER_139_0.cloverRec.CF[3372]==0&false));
		assert((((nom_ancetre!=null)) && (++__CLOVER_139_0.cloverRec.CT[3373]!=0|true)) || (++__CLOVER_139_0.cloverRec.CF[3373]==0&false));
		assert((((classe_ancetre!=null)) && (++__CLOVER_139_0.cloverRec.CT[3374]!=0|true)) || (++__CLOVER_139_0.cloverRec.CF[3374]==0&false));
		assert((((no_param>=-1)) && (++__CLOVER_139_0.cloverRec.CT[3375]!=0|true)) || (++__CLOVER_139_0.cloverRec.CF[3375]==0&false));
		//assert(type!=null);
		//assert(type_ancetre!=null);
		__CLOVER_139_0.cloverRec.S[14727]++;this.nom=nom;
		__CLOVER_139_0.cloverRec.S[14728]++;this.classe=classe;
		__CLOVER_139_0.cloverRec.S[14729]++;this.nom_ancetre=nom_ancetre;
		__CLOVER_139_0.cloverRec.S[14730]++;this.classe_ancetre=classe_ancetre;
		__CLOVER_139_0.cloverRec.S[14731]++;this.no_param=no_param;
		__CLOVER_139_0.cloverRec.S[14732]++;this.type=type;
		__CLOVER_139_0.cloverRec.S[14733]++;this.type_ancetre=type_ancetre;
	}

	NomFeature nom,nom_ancetre;
	Classe classe,classe_ancetre;
	int no_param;
	Type type,type_ancetre;

	/* (non-Javadoc)
	 * @see erreur.Erreur#toMsg()
	 */
	public String toMsg() {__CLOVER_139_0.cloverRec.M[920]++;
		__CLOVER_139_0.cloverRec.S[14734]++;if((((no_param==-1) && (++__CLOVER_139_0.cloverRec.CT[3376]!=0|true)) || (++__CLOVER_139_0.cloverRec.CF[3376]==0&false)))
			{__CLOVER_139_0.cloverRec.S[14735]++;return "Le type de retour de l'attribut "+nom+" dans la classe "+
						classe.nom+" de type "+type+
						" n'est pas conforme a "+type_ancetre+" de l'ancetre "+
						classe_ancetre.nom+" aux lignes "+nom.debut()+" et "+
						nom_ancetre.debut();
		}else
			{__CLOVER_139_0.cloverRec.S[14736]++;return "Le parametre numero "+(no_param+1)+" de l'attribut "+nom+" dans la classe "+
				classe.nom+" de type "+type+
				" n'est pas conforme a "+type_ancetre+" de l'ancetre "+
				classe_ancetre.nom+" aux lignes "+nom.debut()+" et "+
				nom_ancetre.debut();
	}}

}
