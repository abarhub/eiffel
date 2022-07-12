/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ */package tinyeiffel.ast;

import java.util.*;
import java.io.*;

public class Heritage implements ToXML,Traite
{static class __CLOVER_28_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}
	public Heritage(Type type,Vector rename,Vector export,
		Vector undefine,Vector redefine,Vector select)
	{__CLOVER_28_0.cloverRec.M[168]++;
		__CLOVER_28_0.cloverRec.S[852]++;this.type=type;
		__CLOVER_28_0.cloverRec.S[853]++;this.rename=new Rename[rename.size()];
		__CLOVER_28_0.cloverRec.S[854]++;rename.copyInto(this.rename);
		__CLOVER_28_0.cloverRec.S[855]++;this.export=new Export[export.size()];
		__CLOVER_28_0.cloverRec.S[856]++;export.copyInto(this.export);
		__CLOVER_28_0.cloverRec.S[857]++;this.undefine=new NomFeature[undefine.size()];
		__CLOVER_28_0.cloverRec.S[858]++;undefine.copyInto(this.undefine);
		__CLOVER_28_0.cloverRec.S[859]++;this.redefine=new NomFeature[redefine.size()];
		__CLOVER_28_0.cloverRec.S[860]++;redefine.copyInto(this.redefine);
		__CLOVER_28_0.cloverRec.S[861]++;this.select=new NomFeature[select.size()];
		__CLOVER_28_0.cloverRec.S[862]++;select.copyInto(this.select);
	}
        public void set_token(Token therit,Token trename,
                                     Token texport,Token tundefine,
                                     Token tredefine,Token tselect,
                                     Token tend)
        {__CLOVER_28_0.cloverRec.M[169]++;
          __CLOVER_28_0.cloverRec.S[863]++;this.therit=therit;
          __CLOVER_28_0.cloverRec.S[864]++;this.trename=trename;
          __CLOVER_28_0.cloverRec.S[865]++;this.texport=texport;
          __CLOVER_28_0.cloverRec.S[866]++;this.tundefine=tundefine;
          __CLOVER_28_0.cloverRec.S[867]++;this.tredefine=tredefine;
          __CLOVER_28_0.cloverRec.S[868]++;this.tselect=tselect;
          __CLOVER_28_0.cloverRec.S[869]++;this.tend=tend;
        }

        public Position debut()
        {__CLOVER_28_0.cloverRec.M[170]++;
          __CLOVER_28_0.cloverRec.S[870]++;if((((therit!=null) && (++__CLOVER_28_0.cloverRec.CT[308]!=0|true)) || (++__CLOVER_28_0.cloverRec.CF[308]==0&false)))
            {__CLOVER_28_0.cloverRec.S[871]++;return therit.debut();
          }__CLOVER_28_0.cloverRec.S[872]++;return null;
        }

	public void check_egal(Heritage h)
	{__CLOVER_28_0.cloverRec.M[171]++;
		assert((((h!=null)) && (++__CLOVER_28_0.cloverRec.CT[309]!=0|true)) || (++__CLOVER_28_0.cloverRec.CF[309]==0&false));
		__CLOVER_28_0.cloverRec.S[873]++;type.check_egal(h.type);
		__CLOVER_28_0.cloverRec.S[874]++;int i;
		/****/
		assert((((rename.length==h.rename.length)) && (++__CLOVER_28_0.cloverRec.CT[310]!=0|true)) || (++__CLOVER_28_0.cloverRec.CF[310]==0&false));
		__CLOVER_28_0.cloverRec.S[875]++;for(i=0;(((i<rename.length) && (++__CLOVER_28_0.cloverRec.CT[311]!=0|true)) || (++__CLOVER_28_0.cloverRec.CF[311]==0&false));i++)
		{{
			__CLOVER_28_0.cloverRec.S[876]++;rename[i].check_egal(h.rename[i]);
		}
		/****/
		}assert((((export.length==h.export.length)) && (++__CLOVER_28_0.cloverRec.CT[312]!=0|true)) || (++__CLOVER_28_0.cloverRec.CF[312]==0&false));
		__CLOVER_28_0.cloverRec.S[877]++;for(i=0;(((i<export.length) && (++__CLOVER_28_0.cloverRec.CT[313]!=0|true)) || (++__CLOVER_28_0.cloverRec.CF[313]==0&false));i++)
		{{
			__CLOVER_28_0.cloverRec.S[878]++;export[i].check_egal(h.export[i]);
		}
		/****/
		}assert((((undefine.length==h.undefine.length)) && (++__CLOVER_28_0.cloverRec.CT[314]!=0|true)) || (++__CLOVER_28_0.cloverRec.CF[314]==0&false));
		__CLOVER_28_0.cloverRec.S[879]++;for(i=0;(((i<undefine.length) && (++__CLOVER_28_0.cloverRec.CT[315]!=0|true)) || (++__CLOVER_28_0.cloverRec.CF[315]==0&false));i++)
		{{
			__CLOVER_28_0.cloverRec.S[880]++;undefine[i].check_egal(h.undefine[i]);
		}
		/****/
		}assert((((redefine.length==h.redefine.length)) && (++__CLOVER_28_0.cloverRec.CT[316]!=0|true)) || (++__CLOVER_28_0.cloverRec.CF[316]==0&false));
		__CLOVER_28_0.cloverRec.S[881]++;for(i=0;(((i<redefine.length) && (++__CLOVER_28_0.cloverRec.CT[317]!=0|true)) || (++__CLOVER_28_0.cloverRec.CF[317]==0&false));i++)
		{{
			__CLOVER_28_0.cloverRec.S[882]++;redefine[i].check_egal(h.redefine[i]);
		}
		/****/
		}assert((((select.length==h.select.length)) && (++__CLOVER_28_0.cloverRec.CT[318]!=0|true)) || (++__CLOVER_28_0.cloverRec.CF[318]==0&false));
		__CLOVER_28_0.cloverRec.S[883]++;for(i=0;(((i<select.length) && (++__CLOVER_28_0.cloverRec.CT[319]!=0|true)) || (++__CLOVER_28_0.cloverRec.CF[319]==0&false));i++)
		{{
			__CLOVER_28_0.cloverRec.S[884]++;select[i].check_egal(h.select[i]);
		}
	}}

	public void toXML(PrintStream out)
	{__CLOVER_28_0.cloverRec.M[172]++;
		assert((((out!=null)) && (++__CLOVER_28_0.cloverRec.CT[320]!=0|true)) || (++__CLOVER_28_0.cloverRec.CF[320]==0&false));
		__CLOVER_28_0.cloverRec.S[885]++;out.println("<heritage>");
		__CLOVER_28_0.cloverRec.S[886]++;type.toXML(out);
		__CLOVER_28_0.cloverRec.S[887]++;int i;
		__CLOVER_28_0.cloverRec.S[888]++;if((((rename!=null) && (++__CLOVER_28_0.cloverRec.CT[321]!=0|true)) || (++__CLOVER_28_0.cloverRec.CF[321]==0&false)))
		{{
			__CLOVER_28_0.cloverRec.S[889]++;for(i=0;(((i<rename.length) && (++__CLOVER_28_0.cloverRec.CT[322]!=0|true)) || (++__CLOVER_28_0.cloverRec.CF[322]==0&false));i++)
				{__CLOVER_28_0.cloverRec.S[890]++;rename[i].toXML(out);
		}}
		}__CLOVER_28_0.cloverRec.S[891]++;if((((export!=null&&export.length>0) && (++__CLOVER_28_0.cloverRec.CT[323]!=0|true)) || (++__CLOVER_28_0.cloverRec.CF[323]==0&false)))
		{{
			__CLOVER_28_0.cloverRec.S[892]++;for(i=0;(((i<export.length) && (++__CLOVER_28_0.cloverRec.CT[324]!=0|true)) || (++__CLOVER_28_0.cloverRec.CF[324]==0&false));i++)
				{__CLOVER_28_0.cloverRec.S[893]++;export[i].toXML(out);
		}}
		}__CLOVER_28_0.cloverRec.S[894]++;if((((undefine!=null&&undefine.length>0) && (++__CLOVER_28_0.cloverRec.CT[325]!=0|true)) || (++__CLOVER_28_0.cloverRec.CF[325]==0&false)))
		{{
			__CLOVER_28_0.cloverRec.S[895]++;out.println("<undefine>");
			__CLOVER_28_0.cloverRec.S[896]++;for(i=0;(((i<undefine.length) && (++__CLOVER_28_0.cloverRec.CT[326]!=0|true)) || (++__CLOVER_28_0.cloverRec.CF[326]==0&false));i++)
			{{
				__CLOVER_28_0.cloverRec.S[897]++;undefine[i].toXML(out);
			}
			}__CLOVER_28_0.cloverRec.S[898]++;out.println("</undefine>");
		}
		}__CLOVER_28_0.cloverRec.S[899]++;if((((redefine!=null&&redefine.length>0) && (++__CLOVER_28_0.cloverRec.CT[327]!=0|true)) || (++__CLOVER_28_0.cloverRec.CF[327]==0&false)))
		{{
			__CLOVER_28_0.cloverRec.S[900]++;out.println("<redefine>");
			__CLOVER_28_0.cloverRec.S[901]++;for(i=0;(((i<redefine.length) && (++__CLOVER_28_0.cloverRec.CT[328]!=0|true)) || (++__CLOVER_28_0.cloverRec.CF[328]==0&false));i++)
				{__CLOVER_28_0.cloverRec.S[902]++;redefine[i].toXML(out);
			}__CLOVER_28_0.cloverRec.S[903]++;out.println("</redefine>");
		}
		}__CLOVER_28_0.cloverRec.S[904]++;if((((select!=null&&select.length>0) && (++__CLOVER_28_0.cloverRec.CT[329]!=0|true)) || (++__CLOVER_28_0.cloverRec.CF[329]==0&false)))
		{{
			__CLOVER_28_0.cloverRec.S[905]++;out.println("<select>");
			__CLOVER_28_0.cloverRec.S[906]++;for(i=0;(((i<select.length) && (++__CLOVER_28_0.cloverRec.CT[330]!=0|true)) || (++__CLOVER_28_0.cloverRec.CF[330]==0&false));i++)
				{__CLOVER_28_0.cloverRec.S[907]++;select[i].toXML(out);
			}__CLOVER_28_0.cloverRec.S[908]++;out.println("</select>");
		}
		}__CLOVER_28_0.cloverRec.S[909]++;out.println("</heritage>");
	}

	public void set_traite(boolean traite0)
	{__CLOVER_28_0.cloverRec.M[173]++;
		__CLOVER_28_0.cloverRec.S[910]++;this.traite=traite0;
	}

	public boolean get_traite()
	{__CLOVER_28_0.cloverRec.M[174]++;
		__CLOVER_28_0.cloverRec.S[911]++;return traite;
	}

	protected boolean traite=false;

	public Type type;
	public Rename rename[];
	public Export export[];
	public NomFeature undefine[],redefine[],select[];
        public Position debut,fin;
	public Token therit,trename,texport,tundefine,tredefine,
            tselect,tend;
}