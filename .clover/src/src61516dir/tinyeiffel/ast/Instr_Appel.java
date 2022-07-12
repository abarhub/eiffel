/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ */package tinyeiffel.ast;

import java.io.PrintStream;
import java.util.*;

public class Instr_Appel extends Instr implements Suite, ToXML
{static class __CLOVER_32_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}
	public Instr_Appel(String nom,Vector param)
	{__CLOVER_32_0.cloverRec.M[186]++;
		__CLOVER_32_0.cloverRec.S[939]++;this.nom=nom;
		/*if(param.elementAt(0) instanceof Expr)
			System.out.println("Reussi");
		else
			System.out.println("Loupe");
		if(param.toArray() instanceof Object[])
			System.out.println("Reussi2");
		else
			System.out.println("Loupe2");*/
		__CLOVER_32_0.cloverRec.S[940]++;this.parametre=new Expr[param.size()];
		__CLOVER_32_0.cloverRec.S[941]++;param.copyInto(parametre);
		//for(i=0;i<param.size();i++)
		//	parametre[i]=(Expr)param.elementAt(i);
	}

	public Instr_Appel(Expr expr)
	{__CLOVER_32_0.cloverRec.M[187]++;
		__CLOVER_32_0.cloverRec.S[942]++;this.expr=expr;
	}

        public Position debut()
        {__CLOVER_32_0.cloverRec.M[188]++;
          __CLOVER_32_0.cloverRec.S[943]++;if((((expr!=null) && (++__CLOVER_32_0.cloverRec.CT[345]!=0|true)) || (++__CLOVER_32_0.cloverRec.CF[345]==0&false)))
            {__CLOVER_32_0.cloverRec.S[944]++;return expr.debut();
          }__CLOVER_32_0.cloverRec.S[945]++;return tid.debut();
        }

	public Expr parametre[];
	public String nom;
	public Expr expr;
	private Instr suivant;
        public Token tid,tpoint;
	/* (non-Javadoc)
	 * @see ast.Instr#check_egal(ast.Instr)
	 */
	public void check_egal(Instr instr) {__CLOVER_32_0.cloverRec.M[189]++;
		assert((((instr!=null)) && (++__CLOVER_32_0.cloverRec.CT[346]!=0|true)) || (++__CLOVER_32_0.cloverRec.CF[346]==0&false));
		assert((((instr instanceof Instr_Appel)) && (++__CLOVER_32_0.cloverRec.CT[347]!=0|true)) || (++__CLOVER_32_0.cloverRec.CF[347]==0&false));
		__CLOVER_32_0.cloverRec.S[946]++;Instr_Appel ins=(Instr_Appel)instr;
		assert((((nom.equals(ins.nom))) && (++__CLOVER_32_0.cloverRec.CT[348]!=0|true)) || (++__CLOVER_32_0.cloverRec.CF[348]==0&false));
		__CLOVER_32_0.cloverRec.S[947]++;if((((expr==null) && (++__CLOVER_32_0.cloverRec.CT[349]!=0|true)) || (++__CLOVER_32_0.cloverRec.CF[349]==0&false)))
			{assert((((ins.expr==null)) && (++__CLOVER_32_0.cloverRec.CT[350]!=0|true)) || (++__CLOVER_32_0.cloverRec.CF[350]==0&false));
		}else
			{__CLOVER_32_0.cloverRec.S[948]++;expr.check_egal(ins.expr);
		}__CLOVER_32_0.cloverRec.S[949]++;int i;
		__CLOVER_32_0.cloverRec.S[950]++;if((((parametre==null) && (++__CLOVER_32_0.cloverRec.CT[351]!=0|true)) || (++__CLOVER_32_0.cloverRec.CF[351]==0&false)))
			{assert((((ins.parametre==null)) && (++__CLOVER_32_0.cloverRec.CT[352]!=0|true)) || (++__CLOVER_32_0.cloverRec.CF[352]==0&false));
		}else
		{{
			assert((((ins.parametre.length==parametre.length)) && (++__CLOVER_32_0.cloverRec.CT[353]!=0|true)) || (++__CLOVER_32_0.cloverRec.CF[353]==0&false));
			__CLOVER_32_0.cloverRec.S[951]++;for(i=0;(((i<parametre.length) && (++__CLOVER_32_0.cloverRec.CT[354]!=0|true)) || (++__CLOVER_32_0.cloverRec.CF[354]==0&false));i++)
			{{
				__CLOVER_32_0.cloverRec.S[952]++;parametre[i].check_egal(ins.parametre[i]);
			}
		}}
		}__CLOVER_32_0.cloverRec.S[953]++;if((((suivant==null) && (++__CLOVER_32_0.cloverRec.CT[355]!=0|true)) || (++__CLOVER_32_0.cloverRec.CF[355]==0&false)))
			{assert((((ins.suivant==null)) && (++__CLOVER_32_0.cloverRec.CT[356]!=0|true)) || (++__CLOVER_32_0.cloverRec.CF[356]==0&false));
		}else
			{__CLOVER_32_0.cloverRec.S[954]++;suivant.check_egal(ins.suivant);
	}}

	/* (non-Javadoc)
	 * @see ast.Instr#toXML(java.io.PrintStream)
	 */
	public void toXML(PrintStream out) {__CLOVER_32_0.cloverRec.M[190]++;
		assert((((out!=null)) && (++__CLOVER_32_0.cloverRec.CT[357]!=0|true)) || (++__CLOVER_32_0.cloverRec.CF[357]==0&false));
		__CLOVER_32_0.cloverRec.S[955]++;out.println("<instruction>");
		__CLOVER_32_0.cloverRec.S[956]++;out.println("<appel nom=\""+nom+"\">");
		__CLOVER_32_0.cloverRec.S[957]++;if((((parametre!=null) && (++__CLOVER_32_0.cloverRec.CT[358]!=0|true)) || (++__CLOVER_32_0.cloverRec.CF[358]==0&false)))
		{{
			__CLOVER_32_0.cloverRec.S[958]++;for(int i=0;(((i<parametre.length) && (++__CLOVER_32_0.cloverRec.CT[359]!=0|true)) || (++__CLOVER_32_0.cloverRec.CF[359]==0&false));i++)
			{{
				__CLOVER_32_0.cloverRec.S[959]++;out.println("<parametre_reel>");
				__CLOVER_32_0.cloverRec.S[960]++;parametre[i].toXML(out);
				__CLOVER_32_0.cloverRec.S[961]++;out.println("</parametre_reel>");
			}
		}}
		}__CLOVER_32_0.cloverRec.S[962]++;Instr ins=suivant;
		__CLOVER_32_0.cloverRec.S[963]++;while((((ins!=null) && (++__CLOVER_32_0.cloverRec.CT[360]!=0|true)) || (++__CLOVER_32_0.cloverRec.CF[360]==0&false)))
		{{
			assert((((ins instanceof Instr_Appel)) && (++__CLOVER_32_0.cloverRec.CT[361]!=0|true)) || (++__CLOVER_32_0.cloverRec.CF[361]==0&false));
			__CLOVER_32_0.cloverRec.S[964]++;Instr_Appel insa=(Instr_Appel)ins;
			__CLOVER_32_0.cloverRec.S[965]++;out.println("<appel nom=\""+insa.nom+"\">");
			__CLOVER_32_0.cloverRec.S[966]++;if((((insa.parametre!=null) && (++__CLOVER_32_0.cloverRec.CT[362]!=0|true)) || (++__CLOVER_32_0.cloverRec.CF[362]==0&false)))
			{{
				__CLOVER_32_0.cloverRec.S[967]++;for(int i=0;(((i<insa.parametre.length) && (++__CLOVER_32_0.cloverRec.CT[363]!=0|true)) || (++__CLOVER_32_0.cloverRec.CF[363]==0&false));i++)
				{{
					__CLOVER_32_0.cloverRec.S[968]++;out.println("<parametre_reel>");
					__CLOVER_32_0.cloverRec.S[969]++;insa.parametre[i].toXML(out);
					__CLOVER_32_0.cloverRec.S[970]++;out.println("</parametre_reel>");
				}
			}}
			}__CLOVER_32_0.cloverRec.S[971]++;ins=insa.suivant;
		}
		}__CLOVER_32_0.cloverRec.S[972]++;if((((suivant!=null) && (++__CLOVER_32_0.cloverRec.CT[364]!=0|true)) || (++__CLOVER_32_0.cloverRec.CF[364]==0&false)))
		{{
			__CLOVER_32_0.cloverRec.S[973]++;ins=suivant;
			__CLOVER_32_0.cloverRec.S[974]++;while((((ins!=null) && (++__CLOVER_32_0.cloverRec.CT[365]!=0|true)) || (++__CLOVER_32_0.cloverRec.CF[365]==0&false)))
			{{
				__CLOVER_32_0.cloverRec.S[975]++;out.println("</appel>");
				__CLOVER_32_0.cloverRec.S[976]++;ins=((Suite)ins).getSuivant();
			}
		}}
		}__CLOVER_32_0.cloverRec.S[977]++;out.println("</appel>");
		__CLOVER_32_0.cloverRec.S[978]++;out.println("</instruction>");
	}

	/* (non-Javadoc)
	 * @see ast.Suite#getSuivant()
	 */
	public Instr getSuivant() {__CLOVER_32_0.cloverRec.M[191]++;
		__CLOVER_32_0.cloverRec.S[979]++;return suivant;
	}

	/* (non-Javadoc)
	 * @see ast.Suite#setSuivant(ast.Instr)
	 */
	public void setSuivant(Instr instr) {__CLOVER_32_0.cloverRec.M[192]++;
		assert((((instr!=null)) && (++__CLOVER_32_0.cloverRec.CT[366]!=0|true)) || (++__CLOVER_32_0.cloverRec.CF[366]==0&false));
		__CLOVER_32_0.cloverRec.S[980]++;suivant=instr;
	}

}