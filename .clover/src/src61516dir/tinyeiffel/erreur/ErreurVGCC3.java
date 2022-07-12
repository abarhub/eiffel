/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ *//*
 * Created on 28 d\u00e9c. 2003
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
public class ErreurVGCC3 extends Erreur {static class __CLOVER_120_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}

	public ErreurVGCC3(Classe classe,Instr_Creation instr,
						Type type)
	{__CLOVER_120_0.cloverRec.M[878]++;
		assert((((classe!=null)) && (++__CLOVER_120_0.cloverRec.CT[3299]!=0|true)) || (++__CLOVER_120_0.cloverRec.CF[3299]==0&false));
		assert((((instr!=null)) && (++__CLOVER_120_0.cloverRec.CT[3300]!=0|true)) || (++__CLOVER_120_0.cloverRec.CF[3300]==0&false));
		assert((((type!=null)) && (++__CLOVER_120_0.cloverRec.CT[3301]!=0|true)) || (++__CLOVER_120_0.cloverRec.CF[3301]==0&false));
		__CLOVER_120_0.cloverRec.S[14630]++;this.classe=classe;
		__CLOVER_120_0.cloverRec.S[14631]++;this.instr=instr;
		__CLOVER_120_0.cloverRec.S[14632]++;this.type=type;
		__CLOVER_120_0.cloverRec.S[14633]++;type_erreur=non_reference;
	}

	public ErreurVGCC3(Classe classe,Instr_Creation instr,
						Type type,Type type2)
	{__CLOVER_120_0.cloverRec.M[879]++;
		assert((((classe!=null)) && (++__CLOVER_120_0.cloverRec.CT[3302]!=0|true)) || (++__CLOVER_120_0.cloverRec.CF[3302]==0&false));
		assert((((instr!=null)) && (++__CLOVER_120_0.cloverRec.CT[3303]!=0|true)) || (++__CLOVER_120_0.cloverRec.CF[3303]==0&false));
		assert((((type!=null)) && (++__CLOVER_120_0.cloverRec.CT[3304]!=0|true)) || (++__CLOVER_120_0.cloverRec.CF[3304]==0&false));
		assert((((type2!=null)) && (++__CLOVER_120_0.cloverRec.CT[3305]!=0|true)) || (++__CLOVER_120_0.cloverRec.CF[3305]==0&false));
		__CLOVER_120_0.cloverRec.S[14634]++;this.classe=classe;
		__CLOVER_120_0.cloverRec.S[14635]++;this.instr=instr;
		__CLOVER_120_0.cloverRec.S[14636]++;this.type=type;
		__CLOVER_120_0.cloverRec.S[14637]++;this.type2=type2;
		__CLOVER_120_0.cloverRec.S[14638]++;type_erreur=non_conforme;
	}

	Classe classe;
	Instr_Creation instr;
	Type type,type2;
	int type_erreur;
	
	final int non_reference=1;
	final int non_conforme=2;

	/* (non-Javadoc)
	 * @see erreur.Erreur#toMsg()
	 */
	public String toMsg() {__CLOVER_120_0.cloverRec.M[880]++;
		__CLOVER_120_0.cloverRec.S[14639]++;if((((type_erreur==non_reference) && (++__CLOVER_120_0.cloverRec.CT[3306]!=0|true)) || (++__CLOVER_120_0.cloverRec.CF[3306]==0&false)))
			{__CLOVER_120_0.cloverRec.S[14640]++;return "Dans la classe "+classe.nom+", l'instruction de "+
				"cr\u00e9ation utilise le type expended "+type
				+" a la ligne "+instr.debut();
		}else
			{__CLOVER_120_0.cloverRec.S[14641]++;return "Dans la classe "+classe.nom+", l'instruction de "+
						"cr\u00e9ation utilise le type "+type
						+" qui n'est pas conforme a "+type2+
						" a la ligne "+instr.debut();
	}}


}
