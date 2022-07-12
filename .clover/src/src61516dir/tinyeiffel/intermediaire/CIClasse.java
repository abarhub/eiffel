/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ *//*
 * Created on 1 f\u00e9vr. 2004
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
public class CIClasse {static class __CLOVER_190_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}

	/**
	 * 
	 */
	public CIClasse(CITypeSimple nom,CIProgramme p,CITypeSimple heritage[],CISource source) {__CLOVER_190_0.cloverRec.M[1128]++;
		assert((((nom!=null)) && (++__CLOVER_190_0.cloverRec.CT[4181]!=0|true)) || (++__CLOVER_190_0.cloverRec.CF[4181]==0&false));
		assert((((p!=null)) && (++__CLOVER_190_0.cloverRec.CT[4182]!=0|true)) || (++__CLOVER_190_0.cloverRec.CF[4182]==0&false));
		assert((((nom.nom.equalsIgnoreCase("general")||
				nom.nom.equalsIgnoreCase("any")||heritage!=null)) && (++__CLOVER_190_0.cloverRec.CT[4183]!=0|true)) || (++__CLOVER_190_0.cloverRec.CF[4183]==0&false)):nom.nom;
		__CLOVER_190_0.cloverRec.S[17012]++;this.nom=nom;
		__CLOVER_190_0.cloverRec.S[17013]++;this.programme=p;
		__CLOVER_190_0.cloverRec.S[17014]++;this.heritage=heritage;
		__CLOVER_190_0.cloverRec.S[17015]++;this.source=source;
	}

	public CIClasse()
	{__CLOVER_190_0.cloverRec.M[1129]++;
		
	}

	public void affiche(PrintStream out)
	{__CLOVER_190_0.cloverRec.M[1130]++;
		assert((((out!=null)) && (++__CLOVER_190_0.cloverRec.CT[4184]!=0|true)) || (++__CLOVER_190_0.cloverRec.CF[4184]==0&false));
		__CLOVER_190_0.cloverRec.S[17016]++;out.println(" * Classe "+nom+" :");
		__CLOVER_190_0.cloverRec.S[17017]++;if((((liste_attribut!=null) && (++__CLOVER_190_0.cloverRec.CT[4185]!=0|true)) || (++__CLOVER_190_0.cloverRec.CF[4185]==0&false)))
		{{
			__CLOVER_190_0.cloverRec.S[17018]++;for(int i=0;(((i<liste_attribut.length) && (++__CLOVER_190_0.cloverRec.CT[4186]!=0|true)) || (++__CLOVER_190_0.cloverRec.CF[4186]==0&false));i++)
			{{
				//out.println(liste_attribut[i].toString2());
				__CLOVER_190_0.cloverRec.S[17019]++;liste_attribut[i].affiche(out);
			}
		}}
	}}

	public void toXML(PrintStream out,boolean heritage0[])
	{__CLOVER_190_0.cloverRec.M[1131]++;
		assert((((out!=null)) && (++__CLOVER_190_0.cloverRec.CT[4187]!=0|true)) || (++__CLOVER_190_0.cloverRec.CF[4187]==0&false));
		__CLOVER_190_0.cloverRec.S[17020]++;out.println("<classe>");
		__CLOVER_190_0.cloverRec.S[17021]++;nom.toXML(out);
		__CLOVER_190_0.cloverRec.S[17022]++;out.println("<hierarchie>");
		__CLOVER_190_0.cloverRec.S[17023]++;if((((heritage!=null) && (++__CLOVER_190_0.cloverRec.CT[4188]!=0|true)) || (++__CLOVER_190_0.cloverRec.CF[4188]==0&false)))
		{{
			__CLOVER_190_0.cloverRec.S[17024]++;for(int i=0;(((i<heritage.length) && (++__CLOVER_190_0.cloverRec.CT[4189]!=0|true)) || (++__CLOVER_190_0.cloverRec.CF[4189]==0&false));i++)
			{{
				__CLOVER_190_0.cloverRec.S[17025]++;heritage[i].toXML(out);
			}
		}}
		}__CLOVER_190_0.cloverRec.S[17026]++;out.println("</hierarchie>");
		__CLOVER_190_0.cloverRec.S[17027]++;if((((creation!=null) && (++__CLOVER_190_0.cloverRec.CT[4190]!=0|true)) || (++__CLOVER_190_0.cloverRec.CF[4190]==0&false)))
		{{
			__CLOVER_190_0.cloverRec.S[17028]++;for(int i=0;(((i<creation.length) && (++__CLOVER_190_0.cloverRec.CT[4191]!=0|true)) || (++__CLOVER_190_0.cloverRec.CF[4191]==0&false));i++)
			{{
				__CLOVER_190_0.cloverRec.S[17029]++;creation[i].toXML(out);
			}
		}}
		}__CLOVER_190_0.cloverRec.S[17030]++;if((((liste_attribut!=null) && (++__CLOVER_190_0.cloverRec.CT[4192]!=0|true)) || (++__CLOVER_190_0.cloverRec.CF[4192]==0&false)))
		{{
			__CLOVER_190_0.cloverRec.S[17031]++;for(int i=0;(((i<liste_attribut.length) && (++__CLOVER_190_0.cloverRec.CT[4193]!=0|true)) || (++__CLOVER_190_0.cloverRec.CF[4193]==0&false));i++)
			{{
				//out.println(liste_attribut[i].toString2());
				__CLOVER_190_0.cloverRec.S[17032]++;liste_attribut[i].toXML(out);
			}
		}}
		}__CLOVER_190_0.cloverRec.S[17033]++;if((((invariant!=null) && (++__CLOVER_190_0.cloverRec.CT[4194]!=0|true)) || (++__CLOVER_190_0.cloverRec.CF[4194]==0&false)))
		{{
			__CLOVER_190_0.cloverRec.S[17034]++;invariant.toXML(out,"invariant");
		}
		}__CLOVER_190_0.cloverRec.S[17035]++;if((((source!=null) && (++__CLOVER_190_0.cloverRec.CT[4195]!=0|true)) || (++__CLOVER_190_0.cloverRec.CF[4195]==0&false)))
		{{
			__CLOVER_190_0.cloverRec.S[17036]++;source.toXML(out);
		}
		}__CLOVER_190_0.cloverRec.S[17037]++;out.println("</classe>");
	}

	public CIAttribut donne_attribut(CINom_Attribut attr)
	{__CLOVER_190_0.cloverRec.M[1132]++;
		assert((((attr!=null)) && (++__CLOVER_190_0.cloverRec.CT[4196]!=0|true)) || (++__CLOVER_190_0.cloverRec.CF[4196]==0&false));
		__CLOVER_190_0.cloverRec.S[17038]++;if((((liste_attribut!=null) && (++__CLOVER_190_0.cloverRec.CT[4197]!=0|true)) || (++__CLOVER_190_0.cloverRec.CF[4197]==0&false)))
		{{
			__CLOVER_190_0.cloverRec.S[17039]++;CIAttribut a;
			__CLOVER_190_0.cloverRec.S[17040]++;for(int i=0;(((i<liste_attribut.length) && (++__CLOVER_190_0.cloverRec.CT[4198]!=0|true)) || (++__CLOVER_190_0.cloverRec.CF[4198]==0&false));i++)
			{{
				__CLOVER_190_0.cloverRec.S[17041]++;a=liste_attribut[i];
				__CLOVER_190_0.cloverRec.S[17042]++;if((((attr.nom.compareToIgnoreCase(a.nom.nom)==0&&
					attr.infix==a.nom.infix&&attr.prefix==a.nom.prefix) && (++__CLOVER_190_0.cloverRec.CT[4199]!=0|true)) || (++__CLOVER_190_0.cloverRec.CF[4199]==0&false)))
				{{
					__CLOVER_190_0.cloverRec.S[17043]++;return a;
				}
			}}
		}}
		}__CLOVER_190_0.cloverRec.S[17044]++;return null;
	}

	public CIAttribut donne_attribut(String nom)
	{__CLOVER_190_0.cloverRec.M[1133]++;
		assert((((nom!=null)) && (++__CLOVER_190_0.cloverRec.CT[4200]!=0|true)) || (++__CLOVER_190_0.cloverRec.CF[4200]==0&false));
		//assert(liste_attribut!=null):"classe"+this.nom+"("+nom+")";
		__CLOVER_190_0.cloverRec.S[17045]++;if((((liste_attribut!=null) && (++__CLOVER_190_0.cloverRec.CT[4201]!=0|true)) || (++__CLOVER_190_0.cloverRec.CF[4201]==0&false)))
		{{
			__CLOVER_190_0.cloverRec.S[17046]++;CIAttribut a;
			__CLOVER_190_0.cloverRec.S[17047]++;for(int i=0;(((i<liste_attribut.length) && (++__CLOVER_190_0.cloverRec.CT[4202]!=0|true)) || (++__CLOVER_190_0.cloverRec.CF[4202]==0&false));i++)
			{{
				__CLOVER_190_0.cloverRec.S[17048]++;a=liste_attribut[i];
				assert((((a.nom.nom.compareToIgnoreCase("f1")==0)) && (++__CLOVER_190_0.cloverRec.CT[4203]!=0|true)) || (++__CLOVER_190_0.cloverRec.CF[4203]==0&false)):"a="+a.nom;
				__CLOVER_190_0.cloverRec.S[17049]++;if((((nom.compareToIgnoreCase(a.nom.nom)==0&&
					false==a.nom.infix&&false==a.nom.prefix) && (++__CLOVER_190_0.cloverRec.CT[4204]!=0|true)) || (++__CLOVER_190_0.cloverRec.CF[4204]==0&false)))
				{{
					__CLOVER_190_0.cloverRec.S[17050]++;return a;
				}
			}}
		}}
		}__CLOVER_190_0.cloverRec.S[17051]++;return null;
	}

	public void check_egal(CIClasse c)
	{__CLOVER_190_0.cloverRec.M[1134]++;
		__CLOVER_190_0.cloverRec.S[17052]++;int i;
		assert((((c!=null)) && (++__CLOVER_190_0.cloverRec.CT[4205]!=0|true)) || (++__CLOVER_190_0.cloverRec.CF[4205]==0&false));
		assert((((nom!=null)) && (++__CLOVER_190_0.cloverRec.CT[4206]!=0|true)) || (++__CLOVER_190_0.cloverRec.CF[4206]==0&false));
		assert((((c.nom!=null)) && (++__CLOVER_190_0.cloverRec.CT[4207]!=0|true)) || (++__CLOVER_190_0.cloverRec.CF[4207]==0&false));
		__CLOVER_190_0.cloverRec.S[17053]++;nom.check_egal(c.nom);
		__CLOVER_190_0.cloverRec.S[17054]++;if((((heritage==null||heritage.length==0) && (++__CLOVER_190_0.cloverRec.CT[4208]!=0|true)) || (++__CLOVER_190_0.cloverRec.CF[4208]==0&false)))
			{assert((((c.heritage==null||c.heritage.length==0)) && (++__CLOVER_190_0.cloverRec.CT[4209]!=0|true)) || (++__CLOVER_190_0.cloverRec.CF[4209]==0&false));
		}else
		{{
			assert((((c.heritage!=null)) && (++__CLOVER_190_0.cloverRec.CT[4210]!=0|true)) || (++__CLOVER_190_0.cloverRec.CF[4210]==0&false));
			assert((((c.heritage.length==heritage.length)) && (++__CLOVER_190_0.cloverRec.CT[4211]!=0|true)) || (++__CLOVER_190_0.cloverRec.CF[4211]==0&false));
			__CLOVER_190_0.cloverRec.S[17055]++;for(i=0;(((i<heritage.length) && (++__CLOVER_190_0.cloverRec.CT[4212]!=0|true)) || (++__CLOVER_190_0.cloverRec.CF[4212]==0&false));i++)
			{{
				__CLOVER_190_0.cloverRec.S[17056]++;heritage[i].check_egal(c.heritage[i]);
			}
		}}
		}__CLOVER_190_0.cloverRec.S[17057]++;if((((creation==null||creation.length==0) && (++__CLOVER_190_0.cloverRec.CT[4213]!=0|true)) || (++__CLOVER_190_0.cloverRec.CF[4213]==0&false)))
			{assert((((c.creation==null||c.creation.length==0)) && (++__CLOVER_190_0.cloverRec.CT[4214]!=0|true)) || (++__CLOVER_190_0.cloverRec.CF[4214]==0&false));
		}else
		{{
			assert((((c.creation!=null)) && (++__CLOVER_190_0.cloverRec.CT[4215]!=0|true)) || (++__CLOVER_190_0.cloverRec.CF[4215]==0&false));
			assert((((c.creation.length==creation.length)) && (++__CLOVER_190_0.cloverRec.CT[4216]!=0|true)) || (++__CLOVER_190_0.cloverRec.CF[4216]==0&false));
			__CLOVER_190_0.cloverRec.S[17058]++;for(i=0;(((i<creation.length) && (++__CLOVER_190_0.cloverRec.CT[4217]!=0|true)) || (++__CLOVER_190_0.cloverRec.CF[4217]==0&false));i++)
			{{
				__CLOVER_190_0.cloverRec.S[17059]++;creation[i].check_egal(c.creation[i]);
			}
		}}
		}__CLOVER_190_0.cloverRec.S[17060]++;if((((liste_attribut==null||liste_attribut.length==0) && (++__CLOVER_190_0.cloverRec.CT[4218]!=0|true)) || (++__CLOVER_190_0.cloverRec.CF[4218]==0&false)))
			{assert((((c.liste_attribut==null||c.liste_attribut.length==0)) && (++__CLOVER_190_0.cloverRec.CT[4219]!=0|true)) || (++__CLOVER_190_0.cloverRec.CF[4219]==0&false));
		}else
		{{
			assert((((c.liste_attribut!=null)) && (++__CLOVER_190_0.cloverRec.CT[4220]!=0|true)) || (++__CLOVER_190_0.cloverRec.CF[4220]==0&false));
			assert((((c.liste_attribut.length==liste_attribut.length)) && (++__CLOVER_190_0.cloverRec.CT[4221]!=0|true)) || (++__CLOVER_190_0.cloverRec.CF[4221]==0&false));
			__CLOVER_190_0.cloverRec.S[17061]++;for(i=0;(((i<liste_attribut.length) && (++__CLOVER_190_0.cloverRec.CT[4222]!=0|true)) || (++__CLOVER_190_0.cloverRec.CF[4222]==0&false));i++)
			{{
				__CLOVER_190_0.cloverRec.S[17062]++;liste_attribut[i].check_egal(c.liste_attribut[i]);
			}
		}}
		}__CLOVER_190_0.cloverRec.S[17063]++;if((((invariant!=null) && (++__CLOVER_190_0.cloverRec.CT[4223]!=0|true)) || (++__CLOVER_190_0.cloverRec.CF[4223]==0&false)))
		{{
			assert((((c.invariant!=null)) && (++__CLOVER_190_0.cloverRec.CT[4224]!=0|true)) || (++__CLOVER_190_0.cloverRec.CF[4224]==0&false));
			__CLOVER_190_0.cloverRec.S[17064]++;invariant.check_egal(c.invariant);
		}
		}else
		{{
			assert((((c.invariant==null)) && (++__CLOVER_190_0.cloverRec.CT[4225]!=0|true)) || (++__CLOVER_190_0.cloverRec.CF[4225]==0&false));
		}
		}__CLOVER_190_0.cloverRec.S[17065]++;if((((source!=null) && (++__CLOVER_190_0.cloverRec.CT[4226]!=0|true)) || (++__CLOVER_190_0.cloverRec.CF[4226]==0&false)))
		{{
			__CLOVER_190_0.cloverRec.S[17066]++;source.check_egal(c.source);
		}
		}else
		{{
			assert((((c.source==null)) && (++__CLOVER_190_0.cloverRec.CT[4227]!=0|true)) || (++__CLOVER_190_0.cloverRec.CF[4227]==0&false));
		}
	}}

	public CITypeSimple nom;
	//public Routine liste_routine[];
	public CIAttribut liste_attribut[];
	//public Attribut creation[];
	public CIProgramme programme;
	public CITypeSimple heritage[];
	public CICreation creation[];
	public CIAssertion invariant;
	public CISource source;

}
