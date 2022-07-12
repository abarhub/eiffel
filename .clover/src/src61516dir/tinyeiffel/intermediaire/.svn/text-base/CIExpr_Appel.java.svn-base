/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ *//*
 * Created on 8 f\u00e9vr. 2004
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
public class CIExpr_Appel extends CIExpr {static class __CLOVER_195_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}

	/**
	 * 
	 */
	public CIExpr_Appel(CIExpr_Var cible,CINom_Attribut nom,
			CIExpr_Scalaire param[],CISource source) {__CLOVER_195_0.cloverRec.M[1152]++;
		assert((((nom!=null)) && (++__CLOVER_195_0.cloverRec.CT[4297]!=0|true)) || (++__CLOVER_195_0.cloverRec.CF[4297]==0&false));
		__CLOVER_195_0.cloverRec.S[17171]++;this.nom=nom;
		__CLOVER_195_0.cloverRec.S[17172]++;this.cible=cible;
		__CLOVER_195_0.cloverRec.S[17173]++;this.parametre=param;
		__CLOVER_195_0.cloverRec.S[17174]++;this.source=source;
	}

	public String toString()
	{__CLOVER_195_0.cloverRec.M[1153]++;
		__CLOVER_195_0.cloverRec.S[17175]++;String res="Call ";
		__CLOVER_195_0.cloverRec.S[17176]++;if((((cible!=null) && (++__CLOVER_195_0.cloverRec.CT[4298]!=0|true)) || (++__CLOVER_195_0.cloverRec.CF[4298]==0&false)))
			{__CLOVER_195_0.cloverRec.S[17177]++;res+=cible+".";
		}__CLOVER_195_0.cloverRec.S[17178]++;res+=nom+"(";
		__CLOVER_195_0.cloverRec.S[17179]++;if((((parametre!=null) && (++__CLOVER_195_0.cloverRec.CT[4299]!=0|true)) || (++__CLOVER_195_0.cloverRec.CF[4299]==0&false)))
		{{
			__CLOVER_195_0.cloverRec.S[17180]++;for(int i=0;(((i<parametre.length) && (++__CLOVER_195_0.cloverRec.CT[4300]!=0|true)) || (++__CLOVER_195_0.cloverRec.CF[4300]==0&false));i++)
			{{
				__CLOVER_195_0.cloverRec.S[17181]++;if((((i>0) && (++__CLOVER_195_0.cloverRec.CT[4301]!=0|true)) || (++__CLOVER_195_0.cloverRec.CF[4301]==0&false)))
					{__CLOVER_195_0.cloverRec.S[17182]++;res+=",";
				}__CLOVER_195_0.cloverRec.S[17183]++;res+=parametre[i];
			}
		}}
		}__CLOVER_195_0.cloverRec.S[17184]++;res+=")";
		__CLOVER_195_0.cloverRec.S[17185]++;return res;
	}
	
	public void toXML(PrintStream out)
	{__CLOVER_195_0.cloverRec.M[1154]++;
		assert((((out!=null)) && (++__CLOVER_195_0.cloverRec.CT[4302]!=0|true)) || (++__CLOVER_195_0.cloverRec.CF[4302]==0&false));
		__CLOVER_195_0.cloverRec.S[17186]++;out.println("<expr_appel>");
		__CLOVER_195_0.cloverRec.S[17187]++;if((((cible!=null) && (++__CLOVER_195_0.cloverRec.CT[4303]!=0|true)) || (++__CLOVER_195_0.cloverRec.CF[4303]==0&false)))
			{__CLOVER_195_0.cloverRec.S[17188]++;cible.toXML(out);
		}__CLOVER_195_0.cloverRec.S[17189]++;nom.toXML(out);
		__CLOVER_195_0.cloverRec.S[17190]++;if((((parametre!=null) && (++__CLOVER_195_0.cloverRec.CT[4304]!=0|true)) || (++__CLOVER_195_0.cloverRec.CF[4304]==0&false)))
		{{
			__CLOVER_195_0.cloverRec.S[17191]++;for(int i=0;(((i<parametre.length) && (++__CLOVER_195_0.cloverRec.CT[4305]!=0|true)) || (++__CLOVER_195_0.cloverRec.CF[4305]==0&false));i++)
			{{
				__CLOVER_195_0.cloverRec.S[17192]++;parametre[i].toXML(out);
			}
		}}
		}__CLOVER_195_0.cloverRec.S[17193]++;if((((source!=null) && (++__CLOVER_195_0.cloverRec.CT[4306]!=0|true)) || (++__CLOVER_195_0.cloverRec.CF[4306]==0&false)))
		{{
			__CLOVER_195_0.cloverRec.S[17194]++;source.toXML(out);
		}
		}__CLOVER_195_0.cloverRec.S[17195]++;out.println("</expr_appel>");
	}
	
	public void check_egal(CIExpr e)
	{__CLOVER_195_0.cloverRec.M[1155]++;
		assert((((e!=null)) && (++__CLOVER_195_0.cloverRec.CT[4307]!=0|true)) || (++__CLOVER_195_0.cloverRec.CF[4307]==0&false));
		assert((((e instanceof CIExpr_Appel)) && (++__CLOVER_195_0.cloverRec.CT[4308]!=0|true)) || (++__CLOVER_195_0.cloverRec.CF[4308]==0&false));
		__CLOVER_195_0.cloverRec.S[17196]++;CIExpr_Appel e2=(CIExpr_Appel)e;
		assert((((nom!=null)) && (++__CLOVER_195_0.cloverRec.CT[4309]!=0|true)) || (++__CLOVER_195_0.cloverRec.CF[4309]==0&false));
		assert((((e2.nom!=null)) && (++__CLOVER_195_0.cloverRec.CT[4310]!=0|true)) || (++__CLOVER_195_0.cloverRec.CF[4310]==0&false));
		__CLOVER_195_0.cloverRec.S[17197]++;nom.check_egal(e2.nom);
		__CLOVER_195_0.cloverRec.S[17198]++;if((((parametre==null||parametre.length==0) && (++__CLOVER_195_0.cloverRec.CT[4311]!=0|true)) || (++__CLOVER_195_0.cloverRec.CF[4311]==0&false)))
			{assert((((e2.parametre==null||e2.parametre.length==0)) && (++__CLOVER_195_0.cloverRec.CT[4312]!=0|true)) || (++__CLOVER_195_0.cloverRec.CF[4312]==0&false));
		}else
		{{
			assert((((e2.parametre!=null)) && (++__CLOVER_195_0.cloverRec.CT[4313]!=0|true)) || (++__CLOVER_195_0.cloverRec.CF[4313]==0&false));
			assert((((e2.parametre.length==parametre.length)) && (++__CLOVER_195_0.cloverRec.CT[4314]!=0|true)) || (++__CLOVER_195_0.cloverRec.CF[4314]==0&false));
			__CLOVER_195_0.cloverRec.S[17199]++;for(int i=0;(((i<parametre.length) && (++__CLOVER_195_0.cloverRec.CT[4315]!=0|true)) || (++__CLOVER_195_0.cloverRec.CF[4315]==0&false));i++)
			{{
				__CLOVER_195_0.cloverRec.S[17200]++;parametre[i].check_egal(e2.parametre[i]);
			}
		}}
		}__CLOVER_195_0.cloverRec.S[17201]++;if((((cible==null) && (++__CLOVER_195_0.cloverRec.CT[4316]!=0|true)) || (++__CLOVER_195_0.cloverRec.CF[4316]==0&false)))
			{assert((((e2.cible==null)) && (++__CLOVER_195_0.cloverRec.CT[4317]!=0|true)) || (++__CLOVER_195_0.cloverRec.CF[4317]==0&false));
		}else
		{{
			assert((((e2.cible!=null)) && (++__CLOVER_195_0.cloverRec.CT[4318]!=0|true)) || (++__CLOVER_195_0.cloverRec.CF[4318]==0&false));
			__CLOVER_195_0.cloverRec.S[17202]++;cible.check_egal(e2.cible);
		}
		}__CLOVER_195_0.cloverRec.S[17203]++;if((((source!=null) && (++__CLOVER_195_0.cloverRec.CT[4319]!=0|true)) || (++__CLOVER_195_0.cloverRec.CF[4319]==0&false)))
		{{
			__CLOVER_195_0.cloverRec.S[17204]++;source.check_egal(e2.source);
		}
		}else
		{{
			assert((((e2.source==null)) && (++__CLOVER_195_0.cloverRec.CT[4320]!=0|true)) || (++__CLOVER_195_0.cloverRec.CF[4320]==0&false));
		}
	}}
	
	public final CIExpr_Var cible;
	public final CIExpr_Scalaire parametre[];
	public final CINom_Attribut nom;
	public CISource source;

}
