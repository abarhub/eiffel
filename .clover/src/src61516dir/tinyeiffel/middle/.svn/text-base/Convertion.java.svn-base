/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ *//*
 * Created on 2 janv. 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package tinyeiffel.middle;

import java.util.Vector;
import tinyeiffel.ast.*;
import tinyeiffel.compiler.*;

/**
 * @author Barret
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class Convertion {static class __CLOVER_246_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}

	Compiler_Eiffel compiler;
	
	public Convertion(Compiler_Eiffel compiler)
	{__CLOVER_246_0.cloverRec.M[1417]++;
		__CLOVER_246_0.cloverRec.S[20272]++;System.out.println("Coucou conv");
		__CLOVER_246_0.cloverRec.S[20273]++;this.compiler=compiler;
		__CLOVER_246_0.cloverRec.S[20274]++;initialise();
		__CLOVER_246_0.cloverRec.S[20275]++;traitement();
	}
	
	/**
	 * 
	 */
	public void initialise() {__CLOVER_246_0.cloverRec.M[1418]++;
		__CLOVER_246_0.cloverRec.S[20276]++;liste_classe=new Vector();
		__CLOVER_246_0.cloverRec.S[20277]++;table_symbol=new Table_Symbol_Interm();
	}

	public void traitement()
	{__CLOVER_246_0.cloverRec.M[1419]++;
		__CLOVER_246_0.cloverRec.S[20278]++;Vector liste;
		__CLOVER_246_0.cloverRec.S[20279]++;int i;
		__CLOVER_246_0.cloverRec.S[20280]++;Classe_Interm cl;
		__CLOVER_246_0.cloverRec.S[20281]++;Classe c;
		__CLOVER_246_0.cloverRec.S[20282]++;liste=compiler.liste_classe;
		__CLOVER_246_0.cloverRec.S[20283]++;for(i=0;(((i<liste.size()) && (++__CLOVER_246_0.cloverRec.CT[5865]!=0|true)) || (++__CLOVER_246_0.cloverRec.CF[5865]==0&false));i++)
		{{
			__CLOVER_246_0.cloverRec.S[20284]++;c=(Classe)liste.elementAt(i);
			__CLOVER_246_0.cloverRec.S[20285]++;cl=new Classe_Interm(c.nom);
			__CLOVER_246_0.cloverRec.S[20286]++;liste_classe.addElement(cl);
		}
		}__CLOVER_246_0.cloverRec.S[20287]++;for(i=0;(((i<liste_classe.size()) && (++__CLOVER_246_0.cloverRec.CT[5866]!=0|true)) || (++__CLOVER_246_0.cloverRec.CF[5866]==0&false));i++)
		{{
			__CLOVER_246_0.cloverRec.S[20288]++;cl=(Classe_Interm)liste_classe.elementAt(i);
			__CLOVER_246_0.cloverRec.S[20289]++;System.out.println(cl.nom);
		}
	}}

	public Vector liste_classe;
	public Table_Symbol_Interm table_symbol;
}
