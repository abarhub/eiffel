/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ *//*
 * Created on 5 f\u00e9vr. 2004
 *
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
package tinyeiffel.intermediaire;

import java.io.*;
/**
 * @author BARRET
 *
 * To change the template for this generated type comment go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
public class CIInstruction_Label extends CIInstruction {static class __CLOVER_214_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}

	/**
	 * 
	 */
	public CIInstruction_Label(String nom,CISource source) {__CLOVER_214_0.cloverRec.M[1262]++;
		assert((((nom!=null)) && (++__CLOVER_214_0.cloverRec.CT[5192]!=0|true)) || (++__CLOVER_214_0.cloverRec.CF[5192]==0&false));
		__CLOVER_214_0.cloverRec.S[18811]++;this.nom=nom;
		__CLOVER_214_0.cloverRec.S[18812]++;this.source=source;
	}

	public void affiche(PrintStream out)
	{__CLOVER_214_0.cloverRec.M[1263]++;
		__CLOVER_214_0.cloverRec.S[18813]++;out.println("Label "+nom);
	}

	public void toXML(PrintStream out)
	{__CLOVER_214_0.cloverRec.M[1264]++;
		__CLOVER_214_0.cloverRec.S[18814]++;out.print("<instr_label label=\""+nom+"\" ");
		__CLOVER_214_0.cloverRec.S[18815]++;if((((source!=null) && (++__CLOVER_214_0.cloverRec.CT[5193]!=0|true)) || (++__CLOVER_214_0.cloverRec.CF[5193]==0&false)))
		{{
			__CLOVER_214_0.cloverRec.S[18816]++;out.println(">");
			__CLOVER_214_0.cloverRec.S[18817]++;source.toXML(out);
			__CLOVER_214_0.cloverRec.S[18818]++;out.println("</instr_label>");
		}
		}else
		{{
			__CLOVER_214_0.cloverRec.S[18819]++;out.println(" />");
		}
	}}

	public void check_egal(CIInstruction instr)
	{__CLOVER_214_0.cloverRec.M[1265]++;
		assert((((instr!=null)) && (++__CLOVER_214_0.cloverRec.CT[5194]!=0|true)) || (++__CLOVER_214_0.cloverRec.CF[5194]==0&false));
		assert((((instr instanceof CIInstruction_Label)) && (++__CLOVER_214_0.cloverRec.CT[5195]!=0|true)) || (++__CLOVER_214_0.cloverRec.CF[5195]==0&false));
		__CLOVER_214_0.cloverRec.S[18820]++;CIInstruction_Label ins=(CIInstruction_Label)instr;
		assert((((nom!=null)) && (++__CLOVER_214_0.cloverRec.CT[5196]!=0|true)) || (++__CLOVER_214_0.cloverRec.CF[5196]==0&false));
		assert((((ins.nom!=null)) && (++__CLOVER_214_0.cloverRec.CT[5197]!=0|true)) || (++__CLOVER_214_0.cloverRec.CF[5197]==0&false));
		assert((((nom.equalsIgnoreCase(ins.nom))) && (++__CLOVER_214_0.cloverRec.CT[5198]!=0|true)) || (++__CLOVER_214_0.cloverRec.CF[5198]==0&false));
		__CLOVER_214_0.cloverRec.S[18821]++;if((((source!=null) && (++__CLOVER_214_0.cloverRec.CT[5199]!=0|true)) || (++__CLOVER_214_0.cloverRec.CF[5199]==0&false)))
		{{
			__CLOVER_214_0.cloverRec.S[18822]++;source.check_egal(ins.source);
		}
		}else
		{{
			assert((((ins.source==null)) && (++__CLOVER_214_0.cloverRec.CT[5200]!=0|true)) || (++__CLOVER_214_0.cloverRec.CF[5200]==0&false));
		}
	}}
	
	public String nom;
	public CISource source;

}
