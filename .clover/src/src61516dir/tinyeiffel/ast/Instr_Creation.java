/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ */package tinyeiffel.ast;

import java.io.PrintStream;
import java.util.*;

public class Instr_Creation extends Instr implements ToXML
{static class __CLOVER_34_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}
	public Instr_Creation(Type type,String nom,String nom2,Vector param)
	{__CLOVER_34_0.cloverRec.M[197]++;
		__CLOVER_34_0.cloverRec.S[995]++;this.type=type;
		__CLOVER_34_0.cloverRec.S[996]++;this.nom=nom;
		__CLOVER_34_0.cloverRec.S[997]++;this.nom2=nom2;
		__CLOVER_34_0.cloverRec.S[998]++;this.parametre=new Expr[param.size()];
		__CLOVER_34_0.cloverRec.S[999]++;param.copyInto(parametre);
	}

        public Position debut()
        {__CLOVER_34_0.cloverRec.M[198]++;
          __CLOVER_34_0.cloverRec.S[1000]++;return texcl1.debut();
        }

	public Expr parametre[];
	public String nom;
	public String nom2;
	public Type type;
        public Token texcl1,texcl2,tid,tid2,tpoint;
	/* (non-Javadoc)
	 * @see ast.Instr#check_egal(ast.Instr)
	 */
	public void check_egal(Instr instr) {__CLOVER_34_0.cloverRec.M[199]++;
		assert((((instr!=null)) && (++__CLOVER_34_0.cloverRec.CT[373]!=0|true)) || (++__CLOVER_34_0.cloverRec.CF[373]==0&false));
		assert((((instr instanceof Instr_Creation)) && (++__CLOVER_34_0.cloverRec.CT[374]!=0|true)) || (++__CLOVER_34_0.cloverRec.CF[374]==0&false));
		__CLOVER_34_0.cloverRec.S[1001]++;Instr_Creation ins=(Instr_Creation)instr;
		__CLOVER_34_0.cloverRec.S[1002]++;int i;
		assert((((parametre.length==ins.parametre.length)) && (++__CLOVER_34_0.cloverRec.CT[375]!=0|true)) || (++__CLOVER_34_0.cloverRec.CF[375]==0&false));
		__CLOVER_34_0.cloverRec.S[1003]++;for(i=0;(((i<parametre.length) && (++__CLOVER_34_0.cloverRec.CT[376]!=0|true)) || (++__CLOVER_34_0.cloverRec.CF[376]==0&false));i++)
		{{
			__CLOVER_34_0.cloverRec.S[1004]++;parametre[i].check_egal(ins.parametre[i]);
		}
		}assert((((nom.equals(ins.nom))) && (++__CLOVER_34_0.cloverRec.CT[377]!=0|true)) || (++__CLOVER_34_0.cloverRec.CF[377]==0&false));
		__CLOVER_34_0.cloverRec.S[1005]++;if((((nom2==null) && (++__CLOVER_34_0.cloverRec.CT[378]!=0|true)) || (++__CLOVER_34_0.cloverRec.CF[378]==0&false)))
			{assert((((ins.nom2==null)) && (++__CLOVER_34_0.cloverRec.CT[379]!=0|true)) || (++__CLOVER_34_0.cloverRec.CF[379]==0&false));
		}else
			{assert((((nom2.equals(ins.nom2))) && (++__CLOVER_34_0.cloverRec.CT[380]!=0|true)) || (++__CLOVER_34_0.cloverRec.CF[380]==0&false));
		}__CLOVER_34_0.cloverRec.S[1006]++;if((((type==null) && (++__CLOVER_34_0.cloverRec.CT[381]!=0|true)) || (++__CLOVER_34_0.cloverRec.CF[381]==0&false)))
			{assert((((ins.type==null)) && (++__CLOVER_34_0.cloverRec.CT[382]!=0|true)) || (++__CLOVER_34_0.cloverRec.CF[382]==0&false));
		}else
			{__CLOVER_34_0.cloverRec.S[1007]++;type.check_egal(ins.type);
	}}

	/* (non-Javadoc)
	 * @see ast.Instr#toXML(java.io.PrintStream)
	 */
	public void toXML(PrintStream out) {__CLOVER_34_0.cloverRec.M[200]++;
		__CLOVER_34_0.cloverRec.S[1008]++;out.println("<instruction>");
		__CLOVER_34_0.cloverRec.S[1009]++;if((((nom2!=null) && (++__CLOVER_34_0.cloverRec.CT[383]!=0|true)) || (++__CLOVER_34_0.cloverRec.CF[383]==0&false)))
		{{
			__CLOVER_34_0.cloverRec.S[1010]++;out.println("<creation2 nom=\""+nom+"\">");
		}
		}else
		{{
			__CLOVER_34_0.cloverRec.S[1011]++;out.println("<creation2>");
		}
		}__CLOVER_34_0.cloverRec.S[1012]++;if((((type!=null) && (++__CLOVER_34_0.cloverRec.CT[384]!=0|true)) || (++__CLOVER_34_0.cloverRec.CF[384]==0&false)))
			{__CLOVER_34_0.cloverRec.S[1013]++;type.toXML(out);
		}__CLOVER_34_0.cloverRec.S[1014]++;out.println("<appel nom=\""+(((((nom2!=null)) && (++__CLOVER_34_0.cloverRec.CT[385]!=0|true)) || (++__CLOVER_34_0.cloverRec.CF[385]==0&false))?nom2:nom)+"\">");
		__CLOVER_34_0.cloverRec.S[1015]++;if((((parametre!=null) && (++__CLOVER_34_0.cloverRec.CT[386]!=0|true)) || (++__CLOVER_34_0.cloverRec.CF[386]==0&false)))
		{{
			__CLOVER_34_0.cloverRec.S[1016]++;for(int i=0;(((i<parametre.length) && (++__CLOVER_34_0.cloverRec.CT[387]!=0|true)) || (++__CLOVER_34_0.cloverRec.CF[387]==0&false));i++)
			{{
				__CLOVER_34_0.cloverRec.S[1017]++;out.println("<parametre_reel>");
				__CLOVER_34_0.cloverRec.S[1018]++;parametre[i].toXML(out);
				__CLOVER_34_0.cloverRec.S[1019]++;out.println("</parametre_reel>");
			}
		}}
		}__CLOVER_34_0.cloverRec.S[1020]++;out.println("</appel>");
		__CLOVER_34_0.cloverRec.S[1021]++;out.println("</creation2>");
		__CLOVER_34_0.cloverRec.S[1022]++;out.println("</instruction>");
	}

}