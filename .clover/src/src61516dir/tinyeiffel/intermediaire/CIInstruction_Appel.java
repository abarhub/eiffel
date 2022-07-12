/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ *//*
 * Created on 5 f\u00e9vr. 2004
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
public class CIInstruction_Appel extends CIInstruction {static class __CLOVER_212_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}

	/**
	 * 
	 */
	public CIInstruction_Appel(CIExpr_Var cible,CINom_Attribut nom,
			CIExpr_Scalaire param[],CISource source) {__CLOVER_212_0.cloverRec.M[1254]++;
		assert((((nom!=null)) && (++__CLOVER_212_0.cloverRec.CT[5157]!=0|true)) || (++__CLOVER_212_0.cloverRec.CF[5157]==0&false));
		__CLOVER_212_0.cloverRec.S[18764]++;this.cible=cible;
		__CLOVER_212_0.cloverRec.S[18765]++;this.nom=nom;
		__CLOVER_212_0.cloverRec.S[18766]++;this.param=param;
		__CLOVER_212_0.cloverRec.S[18767]++;this.source=source;
	}

	public void affiche(PrintStream out)
	{__CLOVER_212_0.cloverRec.M[1255]++;
		__CLOVER_212_0.cloverRec.S[18768]++;out.print("Call ");
		__CLOVER_212_0.cloverRec.S[18769]++;if((((cible!=null) && (++__CLOVER_212_0.cloverRec.CT[5158]!=0|true)) || (++__CLOVER_212_0.cloverRec.CF[5158]==0&false)))
			{__CLOVER_212_0.cloverRec.S[18770]++;out.print(cible+".");
		}__CLOVER_212_0.cloverRec.S[18771]++;out.print(nom+"(");
		__CLOVER_212_0.cloverRec.S[18772]++;if((((param!=null) && (++__CLOVER_212_0.cloverRec.CT[5159]!=0|true)) || (++__CLOVER_212_0.cloverRec.CF[5159]==0&false)))
		{{
			__CLOVER_212_0.cloverRec.S[18773]++;for(int i=0;(((i<param.length) && (++__CLOVER_212_0.cloverRec.CT[5160]!=0|true)) || (++__CLOVER_212_0.cloverRec.CF[5160]==0&false));i++)
			{{
				__CLOVER_212_0.cloverRec.S[18774]++;if((((i>0) && (++__CLOVER_212_0.cloverRec.CT[5161]!=0|true)) || (++__CLOVER_212_0.cloverRec.CF[5161]==0&false)))
					{__CLOVER_212_0.cloverRec.S[18775]++;out.print(",");
				}__CLOVER_212_0.cloverRec.S[18776]++;out.print(param[i]);
			}
		}}
		}__CLOVER_212_0.cloverRec.S[18777]++;out.println(")");
	}
	
	public void toXML(PrintStream out)
	{__CLOVER_212_0.cloverRec.M[1256]++;
		assert((((out!=null)) && (++__CLOVER_212_0.cloverRec.CT[5162]!=0|true)) || (++__CLOVER_212_0.cloverRec.CF[5162]==0&false));
		__CLOVER_212_0.cloverRec.S[18778]++;out.println("<instr_appel>");
		__CLOVER_212_0.cloverRec.S[18779]++;if((((cible!=null) && (++__CLOVER_212_0.cloverRec.CT[5163]!=0|true)) || (++__CLOVER_212_0.cloverRec.CF[5163]==0&false)))
			{__CLOVER_212_0.cloverRec.S[18780]++;cible.toXML(out);
		}__CLOVER_212_0.cloverRec.S[18781]++;nom.toXML(out);
		__CLOVER_212_0.cloverRec.S[18782]++;if((((param!=null) && (++__CLOVER_212_0.cloverRec.CT[5164]!=0|true)) || (++__CLOVER_212_0.cloverRec.CF[5164]==0&false)))
		{{
			__CLOVER_212_0.cloverRec.S[18783]++;for(int i=0;(((i<param.length) && (++__CLOVER_212_0.cloverRec.CT[5165]!=0|true)) || (++__CLOVER_212_0.cloverRec.CF[5165]==0&false));i++)
			{{
				__CLOVER_212_0.cloverRec.S[18784]++;param[i].toXML(out);
			}
		}}
		}__CLOVER_212_0.cloverRec.S[18785]++;if((((source!=null) && (++__CLOVER_212_0.cloverRec.CT[5166]!=0|true)) || (++__CLOVER_212_0.cloverRec.CF[5166]==0&false)))
		{{
			__CLOVER_212_0.cloverRec.S[18786]++;source.toXML(out);
		}
		}__CLOVER_212_0.cloverRec.S[18787]++;out.println("</instr_appel>");
	}
	
	public void check_egal(CIInstruction instr)
	{__CLOVER_212_0.cloverRec.M[1257]++;
		assert((((instr!=null)) && (++__CLOVER_212_0.cloverRec.CT[5167]!=0|true)) || (++__CLOVER_212_0.cloverRec.CF[5167]==0&false));
		assert((((instr instanceof CIInstruction_Appel)) && (++__CLOVER_212_0.cloverRec.CT[5168]!=0|true)) || (++__CLOVER_212_0.cloverRec.CF[5168]==0&false));
		__CLOVER_212_0.cloverRec.S[18788]++;CIInstruction_Appel ins=(CIInstruction_Appel)instr;
		assert((((nom!=null)) && (++__CLOVER_212_0.cloverRec.CT[5169]!=0|true)) || (++__CLOVER_212_0.cloverRec.CF[5169]==0&false));
		assert((((ins.nom!=null)) && (++__CLOVER_212_0.cloverRec.CT[5170]!=0|true)) || (++__CLOVER_212_0.cloverRec.CF[5170]==0&false));
		__CLOVER_212_0.cloverRec.S[18789]++;nom.check_egal(ins.nom);
		__CLOVER_212_0.cloverRec.S[18790]++;if((((param==null||param.length==0) && (++__CLOVER_212_0.cloverRec.CT[5171]!=0|true)) || (++__CLOVER_212_0.cloverRec.CF[5171]==0&false)))
			{assert((((ins.param==null||ins.param.length==0)) && (++__CLOVER_212_0.cloverRec.CT[5172]!=0|true)) || (++__CLOVER_212_0.cloverRec.CF[5172]==0&false));
		}else
		{{
			assert((((ins.param!=null)) && (++__CLOVER_212_0.cloverRec.CT[5173]!=0|true)) || (++__CLOVER_212_0.cloverRec.CF[5173]==0&false));
			assert((((ins.param.length==param.length)) && (++__CLOVER_212_0.cloverRec.CT[5174]!=0|true)) || (++__CLOVER_212_0.cloverRec.CF[5174]==0&false)):"len("+ins.param.length+")!=len("+param.length+")"+
					";nom="+ins.nom+";";
			__CLOVER_212_0.cloverRec.S[18791]++;for(int i=0;(((i<param.length) && (++__CLOVER_212_0.cloverRec.CT[5175]!=0|true)) || (++__CLOVER_212_0.cloverRec.CF[5175]==0&false));i++)
				{__CLOVER_212_0.cloverRec.S[18792]++;param[i].check_egal(ins.param[i]);
		}}
		}__CLOVER_212_0.cloverRec.S[18793]++;if((((cible==null) && (++__CLOVER_212_0.cloverRec.CT[5176]!=0|true)) || (++__CLOVER_212_0.cloverRec.CF[5176]==0&false)))
			{assert((((ins.cible==null)) && (++__CLOVER_212_0.cloverRec.CT[5177]!=0|true)) || (++__CLOVER_212_0.cloverRec.CF[5177]==0&false));
		}else
		{{
			assert((((ins.cible!=null)) && (++__CLOVER_212_0.cloverRec.CT[5178]!=0|true)) || (++__CLOVER_212_0.cloverRec.CF[5178]==0&false));
			__CLOVER_212_0.cloverRec.S[18794]++;cible.check_egal(ins.cible);
		}
		}__CLOVER_212_0.cloverRec.S[18795]++;if((((source!=null) && (++__CLOVER_212_0.cloverRec.CT[5179]!=0|true)) || (++__CLOVER_212_0.cloverRec.CF[5179]==0&false)))
		{{
			__CLOVER_212_0.cloverRec.S[18796]++;source.check_egal(ins.source);
		}
		}else
		{{
			assert((((ins.source==null)) && (++__CLOVER_212_0.cloverRec.CT[5180]!=0|true)) || (++__CLOVER_212_0.cloverRec.CF[5180]==0&false));
		}
	}}
	
	public CIExpr_Var cible;
	public CIExpr_Scalaire param[];
	public CINom_Attribut nom;
	public CISource source;

}
