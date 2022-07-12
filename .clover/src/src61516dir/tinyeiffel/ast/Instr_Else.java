/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ */package tinyeiffel.ast;

import java.io.PrintStream;
import java.util.*;

public class Instr_Else extends Instr implements Suite, ToXML
{static class __CLOVER_36_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}
	public Instr_Else(Vector instr)
	{__CLOVER_36_0.cloverRec.M[205]++;
		__CLOVER_36_0.cloverRec.S[1047]++;liste_instr=new Instr[instr.size()];
		__CLOVER_36_0.cloverRec.S[1048]++;instr.copyInto(liste_instr);
	}

        public Position debut()
        {__CLOVER_36_0.cloverRec.M[206]++;
          __CLOVER_36_0.cloverRec.S[1049]++;return telse.debut();
        }

	public Instr liste_instr[];
        public Token telse;
        private Instr suivant;
        
	/* (non-Javadoc)
	 * @see ast.Instr#check_egal(ast.Instr)
	 */
	public void check_egal(Instr instr) {__CLOVER_36_0.cloverRec.M[207]++;
		assert((((instr!=null)) && (++__CLOVER_36_0.cloverRec.CT[401]!=0|true)) || (++__CLOVER_36_0.cloverRec.CF[401]==0&false));
		assert((((instr instanceof Instr_Else)) && (++__CLOVER_36_0.cloverRec.CT[402]!=0|true)) || (++__CLOVER_36_0.cloverRec.CF[402]==0&false));
		__CLOVER_36_0.cloverRec.S[1050]++;Instr_Else ins=(Instr_Else)instr;
		__CLOVER_36_0.cloverRec.S[1051]++;int i;
		assert((((liste_instr.length==ins.liste_instr.length)) && (++__CLOVER_36_0.cloverRec.CT[403]!=0|true)) || (++__CLOVER_36_0.cloverRec.CF[403]==0&false));
		__CLOVER_36_0.cloverRec.S[1052]++;for(i=0;(((i<liste_instr.length) && (++__CLOVER_36_0.cloverRec.CT[404]!=0|true)) || (++__CLOVER_36_0.cloverRec.CF[404]==0&false));i++)
		{{
			__CLOVER_36_0.cloverRec.S[1053]++;liste_instr[i].check_egal(ins.liste_instr[i]);
		}
	}}

	/* (non-Javadoc)
	 * @see ast.Instr#toXML(java.io.PrintStream)
	 */
	public void toXML(PrintStream out) {__CLOVER_36_0.cloverRec.M[208]++;
		assert((((out!=null)) && (++__CLOVER_36_0.cloverRec.CT[405]!=0|true)) || (++__CLOVER_36_0.cloverRec.CF[405]==0&false));
		__CLOVER_36_0.cloverRec.S[1054]++;out.println("<else>");
		__CLOVER_36_0.cloverRec.S[1055]++;int i;
		__CLOVER_36_0.cloverRec.S[1056]++;if((((liste_instr!=null) && (++__CLOVER_36_0.cloverRec.CT[406]!=0|true)) || (++__CLOVER_36_0.cloverRec.CF[406]==0&false)))
		{{
			__CLOVER_36_0.cloverRec.S[1057]++;for(i=0;(((i<liste_instr.length) && (++__CLOVER_36_0.cloverRec.CT[407]!=0|true)) || (++__CLOVER_36_0.cloverRec.CF[407]==0&false));i++)
			{{
				__CLOVER_36_0.cloverRec.S[1058]++;liste_instr[i].toXML(out);
			}
		}}
		}__CLOVER_36_0.cloverRec.S[1059]++;out.println("</else>");
	}

	/* (non-Javadoc)
	 * @see ast.Suite#getSuivant()
	 */
	public Instr getSuivant() {__CLOVER_36_0.cloverRec.M[209]++;
		__CLOVER_36_0.cloverRec.S[1060]++;return suivant;
	}

	/* (non-Javadoc)
	 * @see ast.Suite#setSuivant(ast.Instr)
	 */
	public void setSuivant(Instr instr) {__CLOVER_36_0.cloverRec.M[210]++;
		assert((((instr!=null)) && (++__CLOVER_36_0.cloverRec.CT[408]!=0|true)) || (++__CLOVER_36_0.cloverRec.CF[408]==0&false));
		__CLOVER_36_0.cloverRec.S[1061]++;suivant=instr;
	}

}