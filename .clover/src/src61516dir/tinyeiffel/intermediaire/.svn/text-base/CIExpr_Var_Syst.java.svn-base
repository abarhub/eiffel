/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ *//*
 * Created on 28 mars 2004
 *
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
package tinyeiffel.intermediaire;

import java.io.PrintStream;

/**
 * @author BARRET
 *
 * To change the template for this generated type comment go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
public class CIExpr_Var_Syst extends CIExpr_Scalaire {static class __CLOVER_207_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}

	public CIExpr_Var_Syst(String nom,CIExpr_Scalaire param[],
			CISource source)
	{__CLOVER_207_0.cloverRec.M[1203]++;
		assert((((nom!=null)) && (++__CLOVER_207_0.cloverRec.CT[4436]!=0|true)) || (++__CLOVER_207_0.cloverRec.CF[4436]==0&false));
		__CLOVER_207_0.cloverRec.S[17510]++;this.nom=nom;
		__CLOVER_207_0.cloverRec.S[17511]++;this.param=param;
		__CLOVER_207_0.cloverRec.S[17512]++;this.source=source;
	}

	public String toString()
	{__CLOVER_207_0.cloverRec.M[1204]++;
		__CLOVER_207_0.cloverRec.S[17513]++;String res="$"+nom;
		__CLOVER_207_0.cloverRec.S[17514]++;if((((param!=null) && (++__CLOVER_207_0.cloverRec.CT[4437]!=0|true)) || (++__CLOVER_207_0.cloverRec.CF[4437]==0&false)))
		{{
			__CLOVER_207_0.cloverRec.S[17515]++;int i;
			__CLOVER_207_0.cloverRec.S[17516]++;res+="(";
			__CLOVER_207_0.cloverRec.S[17517]++;for(i=0;(((i<param.length) && (++__CLOVER_207_0.cloverRec.CT[4438]!=0|true)) || (++__CLOVER_207_0.cloverRec.CF[4438]==0&false));i++)
			{{
				__CLOVER_207_0.cloverRec.S[17518]++;if((((i>0) && (++__CLOVER_207_0.cloverRec.CT[4439]!=0|true)) || (++__CLOVER_207_0.cloverRec.CF[4439]==0&false)))
					{__CLOVER_207_0.cloverRec.S[17519]++;res+=",";
				}__CLOVER_207_0.cloverRec.S[17520]++;res+=param[i].toString();
			}
			}__CLOVER_207_0.cloverRec.S[17521]++;res+=")";
		}
		}__CLOVER_207_0.cloverRec.S[17522]++;return res;
	}

	/* (non-Javadoc)
	 * @see intermediaire.Expr#toXML(java.io.PrintStream)
	 */
	public void toXML(PrintStream out) {__CLOVER_207_0.cloverRec.M[1205]++;
		__CLOVER_207_0.cloverRec.S[17523]++;out.println("<expression_scalaire type=\"var_syst\" >");
		__CLOVER_207_0.cloverRec.S[17524]++;out.println("<expr_var_syst nom=\""+nom+"\">");
		__CLOVER_207_0.cloverRec.S[17525]++;if((((param!=null) && (++__CLOVER_207_0.cloverRec.CT[4440]!=0|true)) || (++__CLOVER_207_0.cloverRec.CF[4440]==0&false)))
		{{
			__CLOVER_207_0.cloverRec.S[17526]++;int i;
			__CLOVER_207_0.cloverRec.S[17527]++;for(i=0;(((i<param.length) && (++__CLOVER_207_0.cloverRec.CT[4441]!=0|true)) || (++__CLOVER_207_0.cloverRec.CF[4441]==0&false));i++)
			{{
				__CLOVER_207_0.cloverRec.S[17528]++;param[i].toXML(out);
			}
		}}
		}__CLOVER_207_0.cloverRec.S[17529]++;if((((source!=null) && (++__CLOVER_207_0.cloverRec.CT[4442]!=0|true)) || (++__CLOVER_207_0.cloverRec.CF[4442]==0&false)))
		{{
			__CLOVER_207_0.cloverRec.S[17530]++;source.toXML(out);
		}
		}__CLOVER_207_0.cloverRec.S[17531]++;out.println("</expr_var_syst>");
		__CLOVER_207_0.cloverRec.S[17532]++;out.println("</expression_scalaire>");
	}

	/* (non-Javadoc)
	 * @see intermediaire.Expr#check_egal(intermediaire.Expr)
	 */
	public void check_egal(CIExpr e) {__CLOVER_207_0.cloverRec.M[1206]++;
		assert((((e!=null)) && (++__CLOVER_207_0.cloverRec.CT[4443]!=0|true)) || (++__CLOVER_207_0.cloverRec.CF[4443]==0&false));
		assert((((e instanceof CIExpr_Var_Syst)) && (++__CLOVER_207_0.cloverRec.CT[4444]!=0|true)) || (++__CLOVER_207_0.cloverRec.CF[4444]==0&false));
		__CLOVER_207_0.cloverRec.S[17533]++;CIExpr_Var_Syst ev=(CIExpr_Var_Syst)e;
		assert((((nom!=null)) && (++__CLOVER_207_0.cloverRec.CT[4445]!=0|true)) || (++__CLOVER_207_0.cloverRec.CF[4445]==0&false));
		assert((((ev.nom!=null)) && (++__CLOVER_207_0.cloverRec.CT[4446]!=0|true)) || (++__CLOVER_207_0.cloverRec.CF[4446]==0&false));
		assert((((nom.equalsIgnoreCase(ev.nom))) && (++__CLOVER_207_0.cloverRec.CT[4447]!=0|true)) || (++__CLOVER_207_0.cloverRec.CF[4447]==0&false));
		__CLOVER_207_0.cloverRec.S[17534]++;if((((param==null||param.length==0) && (++__CLOVER_207_0.cloverRec.CT[4448]!=0|true)) || (++__CLOVER_207_0.cloverRec.CF[4448]==0&false)))
			{assert((((ev.param==null||ev.param.length==0)) && (++__CLOVER_207_0.cloverRec.CT[4449]!=0|true)) || (++__CLOVER_207_0.cloverRec.CF[4449]==0&false));
		}else
		{{
			__CLOVER_207_0.cloverRec.S[17535]++;int i;
			__CLOVER_207_0.cloverRec.S[17536]++;for(i=0;(((i<param.length) && (++__CLOVER_207_0.cloverRec.CT[4450]!=0|true)) || (++__CLOVER_207_0.cloverRec.CF[4450]==0&false));i++)
			{{
				assert((((param[i]!=null)) && (++__CLOVER_207_0.cloverRec.CT[4451]!=0|true)) || (++__CLOVER_207_0.cloverRec.CF[4451]==0&false));
				assert((((ev.param[i]!=null)) && (++__CLOVER_207_0.cloverRec.CT[4452]!=0|true)) || (++__CLOVER_207_0.cloverRec.CF[4452]==0&false));
				__CLOVER_207_0.cloverRec.S[17537]++;param[i].check_egal(ev.param[i]);
			}
		}}
		}__CLOVER_207_0.cloverRec.S[17538]++;if((((source!=null) && (++__CLOVER_207_0.cloverRec.CT[4453]!=0|true)) || (++__CLOVER_207_0.cloverRec.CF[4453]==0&false)))
		{{
			__CLOVER_207_0.cloverRec.S[17539]++;source.check_egal(((CIExpr_Var_Syst)e).source);
		}
		}else
		{{
			assert((((((CIExpr_Var_Syst)e).source==null)) && (++__CLOVER_207_0.cloverRec.CT[4454]!=0|true)) || (++__CLOVER_207_0.cloverRec.CF[4454]==0&false));
		}
	}}

	public String nom;
	public CIExpr_Scalaire param[];
	public CISource source;

}
