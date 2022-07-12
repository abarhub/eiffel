/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ */package tinyeiffel.ast;

import java.util.*;
import java.io.*;

public class Export implements ToXML,Traite //extends Instr
{static class __CLOVER_8_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}
	public Export(Vector feature,Vector type)
	{__CLOVER_8_0.cloverRec.M[53]++;
		__CLOVER_8_0.cloverRec.S[204]++;liste_nom=new NomFeature[feature.size()];
		__CLOVER_8_0.cloverRec.S[205]++;feature.copyInto(liste_nom);
		__CLOVER_8_0.cloverRec.S[206]++;if((((type!=null) && (++__CLOVER_8_0.cloverRec.CT[87]!=0|true)) || (++__CLOVER_8_0.cloverRec.CF[87]==0&false)))
		{{
			__CLOVER_8_0.cloverRec.S[207]++;liste_type=new Type[type.size()];
			__CLOVER_8_0.cloverRec.S[208]++;type.copyInto(liste_type);
		}
	}}

        public Position debut()
        {__CLOVER_8_0.cloverRec.M[54]++;
          assert((((false)) && (++__CLOVER_8_0.cloverRec.CT[88]!=0|true)) || (++__CLOVER_8_0.cloverRec.CF[88]==0&false));
          __CLOVER_8_0.cloverRec.S[209]++;return null;
        }

	public void check_egal(Export e)
	{__CLOVER_8_0.cloverRec.M[55]++;
		assert((((e!=null)) && (++__CLOVER_8_0.cloverRec.CT[89]!=0|true)) || (++__CLOVER_8_0.cloverRec.CF[89]==0&false));
		__CLOVER_8_0.cloverRec.S[210]++;int i;
		assert((((liste_nom.length==e.liste_nom.length)) && (++__CLOVER_8_0.cloverRec.CT[90]!=0|true)) || (++__CLOVER_8_0.cloverRec.CF[90]==0&false));
		__CLOVER_8_0.cloverRec.S[211]++;for(i=0;(((i<liste_nom.length) && (++__CLOVER_8_0.cloverRec.CT[91]!=0|true)) || (++__CLOVER_8_0.cloverRec.CF[91]==0&false));i++)
		{{
			__CLOVER_8_0.cloverRec.S[212]++;liste_nom[i].check_egal(e.liste_nom[i]);
		}
		/*****/
		}assert((((liste_type.length==e.liste_type.length)) && (++__CLOVER_8_0.cloverRec.CT[92]!=0|true)) || (++__CLOVER_8_0.cloverRec.CF[92]==0&false));
		__CLOVER_8_0.cloverRec.S[213]++;for(i=0;(((i<liste_type.length) && (++__CLOVER_8_0.cloverRec.CT[93]!=0|true)) || (++__CLOVER_8_0.cloverRec.CF[93]==0&false));i++)
		{{
			__CLOVER_8_0.cloverRec.S[214]++;liste_type[i].check_egal(e.liste_type[i]);
		}
	}}

	public void toXML(PrintStream out)
	{__CLOVER_8_0.cloverRec.M[56]++;
		assert((((out!=null)) && (++__CLOVER_8_0.cloverRec.CT[94]!=0|true)) || (++__CLOVER_8_0.cloverRec.CF[94]==0&false));
		__CLOVER_8_0.cloverRec.S[215]++;out.println("<export>");
		__CLOVER_8_0.cloverRec.S[216]++;int i;
		__CLOVER_8_0.cloverRec.S[217]++;if((((liste_nom!=null) && (++__CLOVER_8_0.cloverRec.CT[95]!=0|true)) || (++__CLOVER_8_0.cloverRec.CF[95]==0&false)))
		{{
			__CLOVER_8_0.cloverRec.S[218]++;for(i=0;(((i<liste_nom.length) && (++__CLOVER_8_0.cloverRec.CT[96]!=0|true)) || (++__CLOVER_8_0.cloverRec.CF[96]==0&false));i++)
			{{
				__CLOVER_8_0.cloverRec.S[219]++;liste_nom[i].toXML(out);
			}
		}}
		}__CLOVER_8_0.cloverRec.S[220]++;if((((liste_type!=null) && (++__CLOVER_8_0.cloverRec.CT[97]!=0|true)) || (++__CLOVER_8_0.cloverRec.CF[97]==0&false)))
		{{
			__CLOVER_8_0.cloverRec.S[221]++;for(i=0;(((i<liste_type.length) && (++__CLOVER_8_0.cloverRec.CT[98]!=0|true)) || (++__CLOVER_8_0.cloverRec.CF[98]==0&false));i++)
			{{
				__CLOVER_8_0.cloverRec.S[222]++;liste_type[i].toXML(out);
			}
		}}
		}__CLOVER_8_0.cloverRec.S[223]++;out.println("</export>");
	}
	
	public void set_traite(boolean traite0)
	{__CLOVER_8_0.cloverRec.M[57]++;
		__CLOVER_8_0.cloverRec.S[224]++;this.traite=traite0;
	}

	public boolean get_traite()
	{__CLOVER_8_0.cloverRec.M[58]++;
		__CLOVER_8_0.cloverRec.S[225]++;return traite;
	}

	protected boolean traite=false;

	public NomFeature liste_nom[];
	public Type liste_type[];
}