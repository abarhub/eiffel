/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ *//*
 * Created on 1 f\u00e9vr. 2004
 *
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
package tinyeiffel.intermediaire;

import java.io.*;
import java.util.*;
/**
 * @author BARRET
 *
 * To change the template for this generated type comment go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
public class CIProgramme {static class __CLOVER_223_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}

	/**
	 * 
	 */
	public CIProgramme() {__CLOVER_223_0.cloverRec.M[1313]++;
		__CLOVER_223_0.cloverRec.S[18990]++;liste_var_global=new CIListe_Global();
	}

	public void init()
	{__CLOVER_223_0.cloverRec.M[1314]++;
		__CLOVER_223_0.cloverRec.S[18991]++;CIType type;
		__CLOVER_223_0.cloverRec.S[18992]++;type=new CITypeSimple(false,"INTEGER",null,null);
		/*1 - loop_invariant
	 * 2 - loop_variant
	 * 3 - no_more_memory
	 * 4 - routine_failure
	 * 5 - Void_assigned_to_expanded
	 * 6 - Void_call_target
	 * 7 - incorrect_inspect_value*/
		/*liste_var_global.ajoute(new Declare_Var("code_exception_loop_invariant",type,new Expr_Entier(1)));
		liste_var_global.ajoute(new Declare_Var("code_exception_loop_variant",type,new Expr_Entier(2)));
		liste_var_global.ajoute(new Declare_Var("code_exception_no_more_memory",type,new Expr_Entier(3)));
		liste_var_global.ajoute(new Declare_Var("code_exception_routine_failure",type,new Expr_Entier(4)));
		liste_var_global.ajoute(new Declare_Var("code_exception_Void_assigned_to_expanded",type,new Expr_Entier(5)));
		liste_var_global.ajoute(new Declare_Var("code_exception_Void_call_target",type,new Expr_Entier(6)));
		liste_var_global.ajoute(new Declare_Var("code_exception_incorrect_inspect_value",type,new Expr_Entier(7)));*/
	}

	public int no_classe(CITypeSimple t)
	{__CLOVER_223_0.cloverRec.M[1315]++;
		__CLOVER_223_0.cloverRec.S[18993]++;int i;
		__CLOVER_223_0.cloverRec.S[18994]++;CITypeSimple t2;
		assert((((t!=null)) && (++__CLOVER_223_0.cloverRec.CT[5321]!=0|true)) || (++__CLOVER_223_0.cloverRec.CF[5321]==0&false));
		__CLOVER_223_0.cloverRec.S[18995]++;for(i=0;(((i<liste_classe.length) && (++__CLOVER_223_0.cloverRec.CT[5322]!=0|true)) || (++__CLOVER_223_0.cloverRec.CF[5322]==0&false));i++)
		{{
			__CLOVER_223_0.cloverRec.S[18996]++;t2=liste_classe[i].nom;
			__CLOVER_223_0.cloverRec.S[18997]++;if((((t2.nom.compareToIgnoreCase(t.nom)==0) && (++__CLOVER_223_0.cloverRec.CT[5323]!=0|true)) || (++__CLOVER_223_0.cloverRec.CF[5323]==0&false)))
				{__CLOVER_223_0.cloverRec.S[18998]++;return i;
		}}
		}assert((((false)) && (++__CLOVER_223_0.cloverRec.CT[5324]!=0|true)) || (++__CLOVER_223_0.cloverRec.CF[5324]==0&false)):"type="+t;
		__CLOVER_223_0.cloverRec.S[18999]++;return -1;
	}

	public CIClasse donne_classe(CIType t)
	{__CLOVER_223_0.cloverRec.M[1316]++;
		__CLOVER_223_0.cloverRec.S[19000]++;int i;
		assert((((t!=null)) && (++__CLOVER_223_0.cloverRec.CT[5325]!=0|true)) || (++__CLOVER_223_0.cloverRec.CF[5325]==0&false));
		__CLOVER_223_0.cloverRec.S[19001]++;i=no_classe((CITypeSimple)t);
		__CLOVER_223_0.cloverRec.S[19002]++;if((((i>-1) && (++__CLOVER_223_0.cloverRec.CT[5326]!=0|true)) || (++__CLOVER_223_0.cloverRec.CF[5326]==0&false)))
			{__CLOVER_223_0.cloverRec.S[19003]++;return liste_classe[i];
		}else
			{__CLOVER_223_0.cloverRec.S[19004]++;return null;
	}}

	public boolean run(String nom_classe,String routine)
	{__CLOVER_223_0.cloverRec.M[1317]++;
		assert((((nom_classe!=null)) && (++__CLOVER_223_0.cloverRec.CT[5327]!=0|true)) || (++__CLOVER_223_0.cloverRec.CF[5327]==0&false));
		assert((((routine!=null)) && (++__CLOVER_223_0.cloverRec.CT[5328]!=0|true)) || (++__CLOVER_223_0.cloverRec.CF[5328]==0&false));
		__CLOVER_223_0.cloverRec.S[19005]++;CIEnvironnement env;
		__CLOVER_223_0.cloverRec.S[19006]++;int no;
		__CLOVER_223_0.cloverRec.S[19007]++;CIClasse classe_racine;
		//env=new CIEnvironnement();
		__CLOVER_223_0.cloverRec.S[19008]++;classe_racine=donne_classe(new CITypeSimple(false,nom_classe,null,null));
		__CLOVER_223_0.cloverRec.S[19009]++;if((((classe_racine==null) && (++__CLOVER_223_0.cloverRec.CT[5329]!=0|true)) || (++__CLOVER_223_0.cloverRec.CF[5329]==0&false)))
			{__CLOVER_223_0.cloverRec.S[19010]++;return false;
		
		}__CLOVER_223_0.cloverRec.S[19011]++;return true;
	}

	public void affiche(PrintStream out)
	{__CLOVER_223_0.cloverRec.M[1318]++;
		__CLOVER_223_0.cloverRec.S[19012]++;int i;
		assert((((out!=null)) && (++__CLOVER_223_0.cloverRec.CT[5330]!=0|true)) || (++__CLOVER_223_0.cloverRec.CF[5330]==0&false));
		__CLOVER_223_0.cloverRec.S[19013]++;out.println("Programme:");
		__CLOVER_223_0.cloverRec.S[19014]++;out.println("Liste des classes:");
		__CLOVER_223_0.cloverRec.S[19015]++;for(i=0;(((i<liste_classe.length) && (++__CLOVER_223_0.cloverRec.CT[5331]!=0|true)) || (++__CLOVER_223_0.cloverRec.CF[5331]==0&false));i++)
		{{
			__CLOVER_223_0.cloverRec.S[19016]++;out.println(i+")"+liste_classe[i].nom);
		}
		}__CLOVER_223_0.cloverRec.S[19017]++;out.println("Heritage directe:");
		__CLOVER_223_0.cloverRec.S[19018]++;affiche(out,heritage_directe);
		__CLOVER_223_0.cloverRec.S[19019]++;out.println("Heritage:");
		__CLOVER_223_0.cloverRec.S[19020]++;affiche(out,heritage);
		__CLOVER_223_0.cloverRec.S[19021]++;out.println("Liste detaill\u00e9 des classes:");
		__CLOVER_223_0.cloverRec.S[19022]++;for(i=0;(((i<liste_classe.length) && (++__CLOVER_223_0.cloverRec.CT[5332]!=0|true)) || (++__CLOVER_223_0.cloverRec.CF[5332]==0&false));i++)
		{{
			__CLOVER_223_0.cloverRec.S[19023]++;liste_classe[i].affiche(out);
		}
		}__CLOVER_223_0.cloverRec.S[19024]++;out.println("Fin du programme");
	}

	public void affiche(PrintStream out,boolean heritage[][])
	{__CLOVER_223_0.cloverRec.M[1319]++;
		__CLOVER_223_0.cloverRec.S[19025]++;int i,j,nb;
		assert((((out!=null)) && (++__CLOVER_223_0.cloverRec.CT[5333]!=0|true)) || (++__CLOVER_223_0.cloverRec.CF[5333]==0&false));
		assert((((heritage!=null)) && (++__CLOVER_223_0.cloverRec.CT[5334]!=0|true)) || (++__CLOVER_223_0.cloverRec.CF[5334]==0&false));
		__CLOVER_223_0.cloverRec.S[19026]++;for(i=0;(((i<heritage.length) && (++__CLOVER_223_0.cloverRec.CT[5335]!=0|true)) || (++__CLOVER_223_0.cloverRec.CF[5335]==0&false));i++)
		{{
			__CLOVER_223_0.cloverRec.S[19027]++;out.print(liste_classe[i].nom+"->");
			__CLOVER_223_0.cloverRec.S[19028]++;nb=0;
			__CLOVER_223_0.cloverRec.S[19029]++;for(j=0;(((j<heritage[i].length) && (++__CLOVER_223_0.cloverRec.CT[5336]!=0|true)) || (++__CLOVER_223_0.cloverRec.CF[5336]==0&false));j++)
			{{
				__CLOVER_223_0.cloverRec.S[19030]++;if((((heritage[i][j]) && (++__CLOVER_223_0.cloverRec.CT[5337]!=0|true)) || (++__CLOVER_223_0.cloverRec.CF[5337]==0&false)))
				{{
					__CLOVER_223_0.cloverRec.S[19031]++;if((((nb>0) && (++__CLOVER_223_0.cloverRec.CT[5338]!=0|true)) || (++__CLOVER_223_0.cloverRec.CF[5338]==0&false)))
						{__CLOVER_223_0.cloverRec.S[19032]++;out.print(",");
					}__CLOVER_223_0.cloverRec.S[19033]++;out.print(liste_classe[j].nom);
					__CLOVER_223_0.cloverRec.S[19034]++;nb++;
				}
			}}
			}__CLOVER_223_0.cloverRec.S[19035]++;out.println();
		}
	}}

	public void toXML(PrintStream out)
	{__CLOVER_223_0.cloverRec.M[1320]++;
		__CLOVER_223_0.cloverRec.S[19036]++;int i;
		__CLOVER_223_0.cloverRec.S[19037]++;String date;
		assert((((out!=null)) && (++__CLOVER_223_0.cloverRec.CT[5339]!=0|true)) || (++__CLOVER_223_0.cloverRec.CF[5339]==0&false));
		__CLOVER_223_0.cloverRec.S[19038]++;out.println("<?xml version=\"1.0\" encoding=\"ISO-8859-1\" ?>");
		__CLOVER_223_0.cloverRec.S[19039]++;out.println("<?xml-stylesheet type=\"text/xsl\" href=\"..\\..\\..\\test_unitaire\\programme.xsl\"?>");
		__CLOVER_223_0.cloverRec.S[19040]++;out.println("<!DOCTYPE programme SYSTEM \"..\\..\\..\\test_unitaire\\programme.dtd\">");
		{
			__CLOVER_223_0.cloverRec.S[19041]++;Calendar calendrier;
			__CLOVER_223_0.cloverRec.S[19042]++;int jour,mois,annee;
			__CLOVER_223_0.cloverRec.S[19043]++;int heure,minute,seconde;
			__CLOVER_223_0.cloverRec.S[19044]++;calendrier=Calendar.getInstance();
			__CLOVER_223_0.cloverRec.S[19045]++;jour=calendrier.get(Calendar.DAY_OF_MONTH);
			__CLOVER_223_0.cloverRec.S[19046]++;mois=calendrier.get(Calendar.MONTH);
			__CLOVER_223_0.cloverRec.S[19047]++;annee=calendrier.get(Calendar.YEAR);
			__CLOVER_223_0.cloverRec.S[19048]++;heure=calendrier.get(Calendar.HOUR);
			__CLOVER_223_0.cloverRec.S[19049]++;minute=calendrier.get(Calendar.MINUTE);
			__CLOVER_223_0.cloverRec.S[19050]++;seconde=calendrier.get(Calendar.SECOND);
			__CLOVER_223_0.cloverRec.S[19051]++;date=annee+"-"+mois+"-"+jour+"T"+heure+":"+minute+":"+seconde;
		}
		//out.print("<programme date=\""+date+"\" >");
		__CLOVER_223_0.cloverRec.S[19052]++;out.print("<programme >");
		/*out.println("Liste des classes:");
		for(i=0;i<liste_classe.length;i++)
		{
			out.println(i+")"+liste_classe[i].nom);
		}
		out.println("Heritage directe:");
		affiche(out,heritage_directe);
		out.println("Heritage:");
		affiche(out,heritage);
		out.println("Liste detaill\u00e9 des classes:");*/
		__CLOVER_223_0.cloverRec.S[19053]++;liste_var_global.toXML(out);
		__CLOVER_223_0.cloverRec.S[19054]++;for(i=0;(((i<liste_classe.length) && (++__CLOVER_223_0.cloverRec.CT[5340]!=0|true)) || (++__CLOVER_223_0.cloverRec.CF[5340]==0&false));i++)
		{{
			assert((((liste_classe[i]!=null)) && (++__CLOVER_223_0.cloverRec.CT[5341]!=0|true)) || (++__CLOVER_223_0.cloverRec.CF[5341]==0&false));
			__CLOVER_223_0.cloverRec.S[19055]++;liste_classe[i].toXML(out,heritage_directe[i]);
		}
		}__CLOVER_223_0.cloverRec.S[19056]++;out.println("</programme>");
	}

	public void check_egal(CIProgramme p)
	{__CLOVER_223_0.cloverRec.M[1321]++;
		__CLOVER_223_0.cloverRec.S[19057]++;int i,j;
		assert((((p!=null)) && (++__CLOVER_223_0.cloverRec.CT[5342]!=0|true)) || (++__CLOVER_223_0.cloverRec.CF[5342]==0&false));
		assert((((p.heritage!=null)) && (++__CLOVER_223_0.cloverRec.CT[5343]!=0|true)) || (++__CLOVER_223_0.cloverRec.CF[5343]==0&false));
		assert((((p.heritage_directe!=null)) && (++__CLOVER_223_0.cloverRec.CT[5344]!=0|true)) || (++__CLOVER_223_0.cloverRec.CF[5344]==0&false));
		assert((((p.heritage.length==heritage.length)) && (++__CLOVER_223_0.cloverRec.CT[5345]!=0|true)) || (++__CLOVER_223_0.cloverRec.CF[5345]==0&false));
		assert((((p.heritage_directe.length==heritage_directe.length)) && (++__CLOVER_223_0.cloverRec.CT[5346]!=0|true)) || (++__CLOVER_223_0.cloverRec.CF[5346]==0&false));
		assert((((heritage_directe.length==heritage.length)) && (++__CLOVER_223_0.cloverRec.CT[5347]!=0|true)) || (++__CLOVER_223_0.cloverRec.CF[5347]==0&false));
		__CLOVER_223_0.cloverRec.S[19058]++;for(i=0;(((i<heritage.length) && (++__CLOVER_223_0.cloverRec.CT[5348]!=0|true)) || (++__CLOVER_223_0.cloverRec.CF[5348]==0&false));i++)
		{{
			assert((((heritage[i].length==p.heritage.length)) && (++__CLOVER_223_0.cloverRec.CT[5349]!=0|true)) || (++__CLOVER_223_0.cloverRec.CF[5349]==0&false));
			assert((((heritage_directe[i].length==p.heritage_directe.length)) && (++__CLOVER_223_0.cloverRec.CT[5350]!=0|true)) || (++__CLOVER_223_0.cloverRec.CF[5350]==0&false));
			assert((((heritage_directe[i].length==heritage[i].length)) && (++__CLOVER_223_0.cloverRec.CT[5351]!=0|true)) || (++__CLOVER_223_0.cloverRec.CF[5351]==0&false));
			__CLOVER_223_0.cloverRec.S[19059]++;for(j=0;(((j<heritage[i].length) && (++__CLOVER_223_0.cloverRec.CT[5352]!=0|true)) || (++__CLOVER_223_0.cloverRec.CF[5352]==0&false));j++)
			{{
				assert((((heritage_directe[i][j]==p.heritage_directe[i][j])) && (++__CLOVER_223_0.cloverRec.CT[5353]!=0|true)) || (++__CLOVER_223_0.cloverRec.CF[5353]==0&false)):"("+i+","+j+"):"+
						heritage[i][j]+"!="+p.heritage[i][j]+";"+
						liste_classe[i].nom+","+liste_classe[j].nom;
				assert((((heritage[i][j]==p.heritage[i][j])) && (++__CLOVER_223_0.cloverRec.CT[5354]!=0|true)) || (++__CLOVER_223_0.cloverRec.CF[5354]==0&false)):"("+i+","+j+"):"+
						heritage[i][j]+"!="+p.heritage[i][j]+";"+
						liste_classe[i].nom+","+liste_classe[j].nom;
			}
			}assert((((!heritage_directe[i][i])) && (++__CLOVER_223_0.cloverRec.CT[5355]!=0|true)) || (++__CLOVER_223_0.cloverRec.CF[5355]==0&false)):"type="+liste_classe[i].nom;
		}
		}__CLOVER_223_0.cloverRec.S[19060]++;if((((liste_classe!=null) && (++__CLOVER_223_0.cloverRec.CT[5356]!=0|true)) || (++__CLOVER_223_0.cloverRec.CF[5356]==0&false)))
		{{
			assert((((p.liste_classe!=null)) && (++__CLOVER_223_0.cloverRec.CT[5357]!=0|true)) || (++__CLOVER_223_0.cloverRec.CF[5357]==0&false));
			assert((((p.liste_classe.length==liste_classe.length)) && (++__CLOVER_223_0.cloverRec.CT[5358]!=0|true)) || (++__CLOVER_223_0.cloverRec.CF[5358]==0&false));
			__CLOVER_223_0.cloverRec.S[19061]++;for(i=0;(((i<liste_classe.length) && (++__CLOVER_223_0.cloverRec.CT[5359]!=0|true)) || (++__CLOVER_223_0.cloverRec.CF[5359]==0&false));i++)
			{{
				__CLOVER_223_0.cloverRec.S[19062]++;liste_classe[i].check_egal(p.liste_classe[i]);
			}
		}}
		}else
		{{
			assert((((p.liste_classe==null)) && (++__CLOVER_223_0.cloverRec.CT[5360]!=0|true)) || (++__CLOVER_223_0.cloverRec.CF[5360]==0&false));
		}
		}__CLOVER_223_0.cloverRec.S[19063]++;if((((nom==null) && (++__CLOVER_223_0.cloverRec.CT[5361]!=0|true)) || (++__CLOVER_223_0.cloverRec.CF[5361]==0&false)))
			{assert((((p.nom==null)) && (++__CLOVER_223_0.cloverRec.CT[5362]!=0|true)) || (++__CLOVER_223_0.cloverRec.CF[5362]==0&false));
		}else
			{assert((((nom.equalsIgnoreCase(p.nom))) && (++__CLOVER_223_0.cloverRec.CT[5363]!=0|true)) || (++__CLOVER_223_0.cloverRec.CF[5363]==0&false));

		}__CLOVER_223_0.cloverRec.S[19064]++;if((((liste_var_global==null||liste_var_global.size()==0) && (++__CLOVER_223_0.cloverRec.CT[5364]!=0|true)) || (++__CLOVER_223_0.cloverRec.CF[5364]==0&false)))
			{assert((((p.liste_var_global==null||p.liste_var_global.size()==0)) && (++__CLOVER_223_0.cloverRec.CT[5365]!=0|true)) || (++__CLOVER_223_0.cloverRec.CF[5365]==0&false));
		}else
			{__CLOVER_223_0.cloverRec.S[19065]++;liste_var_global.check_egal(p.liste_var_global);
	}}

	public CIClasse liste_classe[];
	public boolean heritage_directe[][],heritage[][];
	public String nom;
	public CIListe_Global liste_var_global;
	//public 

}
