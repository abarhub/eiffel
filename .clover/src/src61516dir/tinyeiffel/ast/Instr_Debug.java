/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ */package tinyeiffel.ast;

import java.io.PrintStream;
import java.util.*;

public class Instr_Debug extends Instr implements ToXML
{static class __CLOVER_35_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}
	public Instr_Debug(Vector chaine,Vector instr)
	{__CLOVER_35_0.cloverRec.M[201]++;
		__CLOVER_35_0.cloverRec.S[1023]++;if((((chaine!=null) && (++__CLOVER_35_0.cloverRec.CT[388]!=0|true)) || (++__CLOVER_35_0.cloverRec.CF[388]==0&false)))
		{{
			//System.out.println("chaine="+chaine);
			__CLOVER_35_0.cloverRec.S[1024]++;this.chaine=new Chaine[chaine.size()];
			__CLOVER_35_0.cloverRec.S[1025]++;chaine.copyInto(this.chaine);
		}
		}__CLOVER_35_0.cloverRec.S[1026]++;if((((instr!=null) && (++__CLOVER_35_0.cloverRec.CT[389]!=0|true)) || (++__CLOVER_35_0.cloverRec.CF[389]==0&false)))
		{{
			__CLOVER_35_0.cloverRec.S[1027]++;this.instr=new Instr[instr.size()];
			__CLOVER_35_0.cloverRec.S[1028]++;instr.copyInto(this.instr);
		}
	}}

        public Position debut()
        {__CLOVER_35_0.cloverRec.M[202]++;
          __CLOVER_35_0.cloverRec.S[1029]++;return tdebug.debut();
        }

	public Chaine chaine[];
	public Instr instr[];
        public Token tdebug,tend;
	/* (non-Javadoc)
	 * @see ast.Instr#check_egal(ast.Instr)
	 */
	public void check_egal(Instr instr) {__CLOVER_35_0.cloverRec.M[203]++;
		assert((((instr!=null)) && (++__CLOVER_35_0.cloverRec.CT[390]!=0|true)) || (++__CLOVER_35_0.cloverRec.CF[390]==0&false));
		assert((((instr instanceof Instr_Debug)) && (++__CLOVER_35_0.cloverRec.CT[391]!=0|true)) || (++__CLOVER_35_0.cloverRec.CF[391]==0&false));
		__CLOVER_35_0.cloverRec.S[1030]++;Instr_Debug ins=(Instr_Debug)instr;
		__CLOVER_35_0.cloverRec.S[1031]++;int i;
		assert((((chaine.length==ins.chaine.length)) && (++__CLOVER_35_0.cloverRec.CT[392]!=0|true)) || (++__CLOVER_35_0.cloverRec.CF[392]==0&false)):
				"Taille differente:"+chaine.length+"/="+
				ins.chaine.length;
		__CLOVER_35_0.cloverRec.S[1032]++;for(i=0;(((i<chaine.length) && (++__CLOVER_35_0.cloverRec.CT[393]!=0|true)) || (++__CLOVER_35_0.cloverRec.CF[393]==0&false));i++)
		{{
			__CLOVER_35_0.cloverRec.S[1033]++;chaine[i].check_egal(ins.chaine[i]);
		}
		}assert((((this.instr.length==ins.instr.length)) && (++__CLOVER_35_0.cloverRec.CT[394]!=0|true)) || (++__CLOVER_35_0.cloverRec.CF[394]==0&false));
		__CLOVER_35_0.cloverRec.S[1034]++;for(i=0;(((i<this.instr.length) && (++__CLOVER_35_0.cloverRec.CT[395]!=0|true)) || (++__CLOVER_35_0.cloverRec.CF[395]==0&false));i++)
		{{
			__CLOVER_35_0.cloverRec.S[1035]++;this.instr[i].check_egal(ins.instr[i]);
		}

	}}

	/* (non-Javadoc)
	 * @see ast.Instr#toXML(java.io.PrintStream)
	 */
	public void toXML(PrintStream out) {__CLOVER_35_0.cloverRec.M[204]++;
		assert((((out!=null)) && (++__CLOVER_35_0.cloverRec.CT[396]!=0|true)) || (++__CLOVER_35_0.cloverRec.CF[396]==0&false));
		__CLOVER_35_0.cloverRec.S[1036]++;out.println("<instruction>");
		__CLOVER_35_0.cloverRec.S[1037]++;out.println("<debug>");
		__CLOVER_35_0.cloverRec.S[1038]++;int i;
		__CLOVER_35_0.cloverRec.S[1039]++;if((((chaine!=null) && (++__CLOVER_35_0.cloverRec.CT[397]!=0|true)) || (++__CLOVER_35_0.cloverRec.CF[397]==0&false)))
		{{
			__CLOVER_35_0.cloverRec.S[1040]++;for(i=0;(((i<chaine.length) && (++__CLOVER_35_0.cloverRec.CT[398]!=0|true)) || (++__CLOVER_35_0.cloverRec.CF[398]==0&false));i++)
				{__CLOVER_35_0.cloverRec.S[1041]++;chaine[i].toXML(out);
		}}
		}__CLOVER_35_0.cloverRec.S[1042]++;if((((instr!=null) && (++__CLOVER_35_0.cloverRec.CT[399]!=0|true)) || (++__CLOVER_35_0.cloverRec.CF[399]==0&false)))
		{{
			__CLOVER_35_0.cloverRec.S[1043]++;for(i=0;(((i<instr.length) && (++__CLOVER_35_0.cloverRec.CT[400]!=0|true)) || (++__CLOVER_35_0.cloverRec.CF[400]==0&false));i++)
				{__CLOVER_35_0.cloverRec.S[1044]++;instr[i].toXML(out);
		}}
		}__CLOVER_35_0.cloverRec.S[1045]++;out.println("</debug>");
		__CLOVER_35_0.cloverRec.S[1046]++;out.println("</instruction>");
	}

}