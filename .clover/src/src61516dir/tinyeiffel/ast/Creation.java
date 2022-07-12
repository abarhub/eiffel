/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ */package tinyeiffel.ast;

import java.util.*;
import java.io.*;

public class Creation implements ToXML,Traite
{static class __CLOVER_5_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}
  public Creation(Vector type, Vector nom_fonction) {__CLOVER_5_0.cloverRec.M[36]++;
    __CLOVER_5_0.cloverRec.S[163]++;if ((((type != null) && (++__CLOVER_5_0.cloverRec.CT[68]!=0|true)) || (++__CLOVER_5_0.cloverRec.CF[68]==0&false))) {{
      __CLOVER_5_0.cloverRec.S[164]++;liste_type = new Type[type.size()];
      __CLOVER_5_0.cloverRec.S[165]++;type.copyInto(liste_type);
    }
    }__CLOVER_5_0.cloverRec.S[166]++;this.nom_fonction = new NomFeature[nom_fonction.size()];
    __CLOVER_5_0.cloverRec.S[167]++;nom_fonction.copyInto(this.nom_fonction);
  }
        public void set_token(Token tcreation)
        {__CLOVER_5_0.cloverRec.M[37]++;
             __CLOVER_5_0.cloverRec.S[168]++;this.tcreation=tcreation;
        }

        public Position debut()
        {__CLOVER_5_0.cloverRec.M[38]++;
          __CLOVER_5_0.cloverRec.S[169]++;return tcreation.debut();
        }

	public void check_egal(Creation c)
	{__CLOVER_5_0.cloverRec.M[39]++;
		assert((((c!=null)) && (++__CLOVER_5_0.cloverRec.CT[69]!=0|true)) || (++__CLOVER_5_0.cloverRec.CF[69]==0&false));
		assert((((c instanceof Creation)) && (++__CLOVER_5_0.cloverRec.CT[70]!=0|true)) || (++__CLOVER_5_0.cloverRec.CF[70]==0&false));
		__CLOVER_5_0.cloverRec.S[170]++;int	i;
		/*********/
		__CLOVER_5_0.cloverRec.S[171]++;if((((liste_type==null) && (++__CLOVER_5_0.cloverRec.CT[71]!=0|true)) || (++__CLOVER_5_0.cloverRec.CF[71]==0&false)))
		{{
			assert((((c.liste_type==null)) && (++__CLOVER_5_0.cloverRec.CT[72]!=0|true)) || (++__CLOVER_5_0.cloverRec.CF[72]==0&false));
		}
		}else
		{{
			assert((((liste_type.length==c.liste_type.length)) && (++__CLOVER_5_0.cloverRec.CT[73]!=0|true)) || (++__CLOVER_5_0.cloverRec.CF[73]==0&false));
			__CLOVER_5_0.cloverRec.S[172]++;for(i=0;(((i<liste_type.length) && (++__CLOVER_5_0.cloverRec.CT[74]!=0|true)) || (++__CLOVER_5_0.cloverRec.CF[74]==0&false));i++)
			{{
				__CLOVER_5_0.cloverRec.S[173]++;liste_type[i].check_egal(c.liste_type[i]);		
			}
		}}
		/*********/
		}assert((((nom_fonction.length==c.nom_fonction.length)) && (++__CLOVER_5_0.cloverRec.CT[75]!=0|true)) || (++__CLOVER_5_0.cloverRec.CF[75]==0&false));
		__CLOVER_5_0.cloverRec.S[174]++;for(i=0;(((i<nom_fonction.length) && (++__CLOVER_5_0.cloverRec.CT[76]!=0|true)) || (++__CLOVER_5_0.cloverRec.CF[76]==0&false));i++)
		{{
			__CLOVER_5_0.cloverRec.S[175]++;nom_fonction[i].check_egal(c.nom_fonction[i]);		
		}
	}}

	public void toXML(PrintStream out)
	{__CLOVER_5_0.cloverRec.M[40]++;
		assert((((out!=null)) && (++__CLOVER_5_0.cloverRec.CT[77]!=0|true)) || (++__CLOVER_5_0.cloverRec.CF[77]==0&false));
		__CLOVER_5_0.cloverRec.S[176]++;if((((liste_type!=null&&liste_type.length==0) && (++__CLOVER_5_0.cloverRec.CT[78]!=0|true)) || (++__CLOVER_5_0.cloverRec.CF[78]==0&false)))
		{{
			__CLOVER_5_0.cloverRec.S[177]++;out.println("<creation export_none=\"true\">");
		}
		}else
		{{
			__CLOVER_5_0.cloverRec.S[178]++;out.println("<creation>");
		}
		}__CLOVER_5_0.cloverRec.S[179]++;int i;
		__CLOVER_5_0.cloverRec.S[180]++;if((((liste_type!=null) && (++__CLOVER_5_0.cloverRec.CT[79]!=0|true)) || (++__CLOVER_5_0.cloverRec.CF[79]==0&false)))
		{{
			__CLOVER_5_0.cloverRec.S[181]++;for(i=0;(((i<liste_type.length) && (++__CLOVER_5_0.cloverRec.CT[80]!=0|true)) || (++__CLOVER_5_0.cloverRec.CF[80]==0&false));i++)
				{__CLOVER_5_0.cloverRec.S[182]++;liste_type[i].toXML(out);
		}}
		}__CLOVER_5_0.cloverRec.S[183]++;if((((nom_fonction!=null) && (++__CLOVER_5_0.cloverRec.CT[81]!=0|true)) || (++__CLOVER_5_0.cloverRec.CF[81]==0&false)))
		{{
			__CLOVER_5_0.cloverRec.S[184]++;for(i=0;(((i<nom_fonction.length) && (++__CLOVER_5_0.cloverRec.CT[82]!=0|true)) || (++__CLOVER_5_0.cloverRec.CF[82]==0&false));i++)
				{__CLOVER_5_0.cloverRec.S[185]++;nom_fonction[i].toXML(out);
		}}
		}__CLOVER_5_0.cloverRec.S[186]++;out.println("</creation>");
	}

	public void set_traite(boolean traite0)
	{__CLOVER_5_0.cloverRec.M[41]++;
		__CLOVER_5_0.cloverRec.S[187]++;this.traite=traite0;
	}

	public boolean get_traite()
	{__CLOVER_5_0.cloverRec.M[42]++;
		__CLOVER_5_0.cloverRec.S[188]++;return traite;
	}

	protected boolean traite=false;

	public Type liste_type[];
        public NomFeature nom_fonction[];
	public Position debut,fin;
        public Token tcreation;
}