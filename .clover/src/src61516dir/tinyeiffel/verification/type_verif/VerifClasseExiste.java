/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ *//*
 * Created on 23 avr. 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package tinyeiffel.verification.type_verif;

import java.io.*;

import tinyeiffel.ast.*;

/**
 * @author Barret
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class VerifClasseExiste extends Verif {static class __CLOVER_268_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}

	public String classe;
	public Position pos;
	
	public VerifClasseExiste(String classe, Position pos)
	{
		super();__CLOVER_268_0.cloverRec.S[22894]++;__CLOVER_268_0.cloverRec.M[1620]++;
		__CLOVER_268_0.cloverRec.S[22895]++;this.classe=classe;
		__CLOVER_268_0.cloverRec.S[22896]++;this.pos=pos;
	}
	
	public boolean equal(Object o)
	{__CLOVER_268_0.cloverRec.M[1621]++;
		__CLOVER_268_0.cloverRec.S[22897]++;if((((o==null||!(o instanceof VerifClasseExiste)) && (++__CLOVER_268_0.cloverRec.CT[6979]!=0|true)) || (++__CLOVER_268_0.cloverRec.CF[6979]==0&false)))
			{__CLOVER_268_0.cloverRec.S[22898]++;return false;
		}__CLOVER_268_0.cloverRec.S[22899]++;VerifClasseExiste v;
		__CLOVER_268_0.cloverRec.S[22900]++;v=(VerifClasseExiste)o;
		__CLOVER_268_0.cloverRec.S[22901]++;return v.classe.equalsIgnoreCase(classe);
	}
	
	public void toXML(PrintStream out)
	{__CLOVER_268_0.cloverRec.M[1622]++;
		assert((((out!=null)) && (++__CLOVER_268_0.cloverRec.CT[6980]!=0|true)) || (++__CLOVER_268_0.cloverRec.CF[6980]==0&false));
		__CLOVER_268_0.cloverRec.S[22902]++;out.println("<classe_existe nom=\""+classe+"\">");
		__CLOVER_268_0.cloverRec.S[22903]++;pos.toXML(out);
		__CLOVER_268_0.cloverRec.S[22904]++;out.println("</classe_existe>");
	}
}
