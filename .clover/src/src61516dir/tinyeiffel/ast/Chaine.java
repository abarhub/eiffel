/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ */package tinyeiffel.ast;

import java.util.*;
import java.io.*;

public class Chaine implements ToXML,Traite
{static class __CLOVER_2_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}
	public Chaine(Vector liste,Token oper)
	{__CLOVER_2_0.cloverRec.M[15]++;
          assert((((oper!=null)) && (++__CLOVER_2_0.cloverRec.CT[8]!=0|true)) || (++__CLOVER_2_0.cloverRec.CF[8]==0&false));
		__CLOVER_2_0.cloverRec.S[41]++;this.liste_chaine=new String[liste.size()];
		__CLOVER_2_0.cloverRec.S[42]++;liste.copyInto(this.liste_chaine);
                __CLOVER_2_0.cloverRec.S[43]++;this.oper=oper;
	}

	public boolean equals(Object o)
	{__CLOVER_2_0.cloverRec.M[16]++;
		__CLOVER_2_0.cloverRec.S[44]++;if((((o instanceof Chaine) && (++__CLOVER_2_0.cloverRec.CT[9]!=0|true)) || (++__CLOVER_2_0.cloverRec.CF[9]==0&false)))
		{{
			__CLOVER_2_0.cloverRec.S[45]++;return chaine_unique()==((Chaine)o).chaine_unique();
		}
		}__CLOVER_2_0.cloverRec.S[46]++;return false;
	}

	public String chaine_unique()
	{__CLOVER_2_0.cloverRec.M[17]++;
		__CLOVER_2_0.cloverRec.S[47]++;String res="";

		__CLOVER_2_0.cloverRec.S[48]++;if((((liste_chaine.length>0) && (++__CLOVER_2_0.cloverRec.CT[10]!=0|true)) || (++__CLOVER_2_0.cloverRec.CF[10]==0&false)))
		{{
			__CLOVER_2_0.cloverRec.S[49]++;int i;
			__CLOVER_2_0.cloverRec.S[50]++;res=liste_chaine[0];
			__CLOVER_2_0.cloverRec.S[51]++;for(i=1;(((i<liste_chaine.length) && (++__CLOVER_2_0.cloverRec.CT[11]!=0|true)) || (++__CLOVER_2_0.cloverRec.CF[11]==0&false));i++)
			{{
				__CLOVER_2_0.cloverRec.S[52]++;res=res.substring(1,res.length()-1);
				__CLOVER_2_0.cloverRec.S[53]++;res+=liste_chaine[i].substring(2);
			}
		}}

		}__CLOVER_2_0.cloverRec.S[54]++;return res;
	}

	public String toString()
	{__CLOVER_2_0.cloverRec.M[18]++;
		__CLOVER_2_0.cloverRec.S[55]++;return chaine_unique();
	}

	public void check_egal(Chaine c)
	{__CLOVER_2_0.cloverRec.M[19]++;
		assert((((c!=null)) && (++__CLOVER_2_0.cloverRec.CT[12]!=0|true)) || (++__CLOVER_2_0.cloverRec.CF[12]==0&false));
		__CLOVER_2_0.cloverRec.S[56]++;for(int i=0;(((i<liste_chaine.length) && (++__CLOVER_2_0.cloverRec.CT[13]!=0|true)) || (++__CLOVER_2_0.cloverRec.CF[13]==0&false));i++)
		{{
			assert((((liste_chaine[i].equals(c.liste_chaine[i]))) && (++__CLOVER_2_0.cloverRec.CT[14]!=0|true)) || (++__CLOVER_2_0.cloverRec.CF[14]==0&false)):
				"Difference "+i+" : \""+liste_chaine[i]+"\"!=\""+
			c.liste_chaine[i]+"\"";		
		}
	}}

	public void toXML(PrintStream out)
	{__CLOVER_2_0.cloverRec.M[20]++;
		assert((((out!=null)) && (++__CLOVER_2_0.cloverRec.CT[15]!=0|true)) || (++__CLOVER_2_0.cloverRec.CF[15]==0&false));
		__CLOVER_2_0.cloverRec.S[57]++;out.println("<chaine>");
		__CLOVER_2_0.cloverRec.S[58]++;for(int i=0;(((i<liste_chaine.length) && (++__CLOVER_2_0.cloverRec.CT[16]!=0|true)) || (++__CLOVER_2_0.cloverRec.CF[16]==0&false));i++)
		{{
			__CLOVER_2_0.cloverRec.S[59]++;out.print("<chaine1>");
			__CLOVER_2_0.cloverRec.S[60]++;out.print(liste_chaine[i]);			
			__CLOVER_2_0.cloverRec.S[61]++;out.println("</chaine1>");
		}
		}__CLOVER_2_0.cloverRec.S[62]++;out.println("</chaine>");
	}

	public void set_traite(boolean traite0)
	{__CLOVER_2_0.cloverRec.M[21]++;
		__CLOVER_2_0.cloverRec.S[63]++;this.traite=traite0;
	}

	public boolean get_traite()
	{__CLOVER_2_0.cloverRec.M[22]++;
		__CLOVER_2_0.cloverRec.S[64]++;return traite;
	}

	protected boolean traite=false;

	public String liste_chaine[];
        public final Token oper;
}