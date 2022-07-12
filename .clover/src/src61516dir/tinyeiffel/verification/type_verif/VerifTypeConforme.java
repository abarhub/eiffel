/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ *//*
 * Created on 5 mai 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package tinyeiffel.verification.type_verif;

import java.io.PrintStream;

import tinyeiffel.ast.*;

/**
 * @author Barret
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class VerifTypeConforme extends Verif {static class __CLOVER_273_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}

	// v\u00e9rifie que type_ancetre est un descendant de type_descendant
	public VerifTypeConforme(VerifType type_ancetre,
			VerifType type_descendant,Type nom_classe)
	{__CLOVER_273_0.cloverRec.M[1637]++;
		assert((((type_ancetre!=null)) && (++__CLOVER_273_0.cloverRec.CT[7006]!=0|true)) || (++__CLOVER_273_0.cloverRec.CF[7006]==0&false));
		assert((((type_descendant!=null)) && (++__CLOVER_273_0.cloverRec.CT[7007]!=0|true)) || (++__CLOVER_273_0.cloverRec.CF[7007]==0&false));
		assert((((nom_classe!=null)) && (++__CLOVER_273_0.cloverRec.CT[7008]!=0|true)) || (++__CLOVER_273_0.cloverRec.CF[7008]==0&false));
		__CLOVER_273_0.cloverRec.S[22960]++;this.type_ancetre=type_ancetre;
		__CLOVER_273_0.cloverRec.S[22961]++;this.type_descendant=type_descendant;
		__CLOVER_273_0.cloverRec.S[22962]++;this.nom_classe=nom_classe;
	}
	
	// verifie que type_descendant n'a pas de type
	public VerifTypeConforme(VerifType type_descendant,Type nom_classe)
	{__CLOVER_273_0.cloverRec.M[1638]++;
		assert((((type_descendant!=null)) && (++__CLOVER_273_0.cloverRec.CT[7009]!=0|true)) || (++__CLOVER_273_0.cloverRec.CF[7009]==0&false));
		assert((((nom_classe!=null)) && (++__CLOVER_273_0.cloverRec.CT[7010]!=0|true)) || (++__CLOVER_273_0.cloverRec.CF[7010]==0&false));
		__CLOVER_273_0.cloverRec.S[22963]++;this.type_ancetre=null;
		__CLOVER_273_0.cloverRec.S[22964]++;this.type_descendant=type_descendant;
		__CLOVER_273_0.cloverRec.S[22965]++;this.nom_classe=nom_classe;
	}
	
	public boolean pret_test()
	{__CLOVER_273_0.cloverRec.M[1639]++;
		__CLOVER_273_0.cloverRec.S[22966]++;return type_ancetre.a_type_reel()&&type_descendant.a_type_reel();
	}
	
	public boolean est_conforme()
	{__CLOVER_273_0.cloverRec.M[1640]++;// TODO: a terminer
		assert((((pret_test())) && (++__CLOVER_273_0.cloverRec.CT[7011]!=0|true)) || (++__CLOVER_273_0.cloverRec.CF[7011]==0&false));
		assert((((false)) && (++__CLOVER_273_0.cloverRec.CT[7012]!=0|true)) || (++__CLOVER_273_0.cloverRec.CF[7012]==0&false));
		__CLOVER_273_0.cloverRec.S[22967]++;return true;
	}

	public void toXML(PrintStream out)
	{__CLOVER_273_0.cloverRec.M[1641]++;
		assert((((out!=null)) && (++__CLOVER_273_0.cloverRec.CT[7013]!=0|true)) || (++__CLOVER_273_0.cloverRec.CF[7013]==0&false));
		__CLOVER_273_0.cloverRec.S[22968]++;out.println("<type_conforme>");
		__CLOVER_273_0.cloverRec.S[22969]++;if((((type_ancetre!=null) && (++__CLOVER_273_0.cloverRec.CT[7014]!=0|true)) || (++__CLOVER_273_0.cloverRec.CF[7014]==0&false)))
		{{
			__CLOVER_273_0.cloverRec.S[22970]++;type_ancetre.toXML(out);
		}
		}__CLOVER_273_0.cloverRec.S[22971]++;type_descendant.toXML(out);
		__CLOVER_273_0.cloverRec.S[22972]++;nom_classe.toXML(out);
		__CLOVER_273_0.cloverRec.S[22973]++;out.println("</type_conforme>");
	}
	
	public VerifType type_ancetre;
	public VerifType type_descendant;
	protected Type nom_classe;
	
}
