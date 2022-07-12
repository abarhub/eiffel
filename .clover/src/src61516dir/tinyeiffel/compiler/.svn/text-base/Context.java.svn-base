/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ */package tinyeiffel.compiler;

import tinyeiffel.ast.*;
import java.util.*;
import tinyeiffel.erreur.*;

public class Context
{static class __CLOVER_60_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}
	public Context(Logging log,Compiler_Eiffel comp)
	{__CLOVER_60_0.cloverRec.M[375]++;
		assert((((log!=null)) && (++__CLOVER_60_0.cloverRec.CT[1140]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1140]==0&false));
		assert((((comp!=null)) && (++__CLOVER_60_0.cloverRec.CT[1141]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1141]==0&false));
		__CLOVER_60_0.cloverRec.S[3321]++;logging=log;
		__CLOVER_60_0.cloverRec.S[3322]++;compiler=comp;
	}

	public void construit_classes(Vector liste_classe,Vector liste_type)
	{__CLOVER_60_0.cloverRec.M[376]++;
		__CLOVER_60_0.cloverRec.S[3323]++;int i,classes_traite;
		__CLOVER_60_0.cloverRec.S[3324]++;Type t;
		__CLOVER_60_0.cloverRec.S[3325]++;Classe c;

		__CLOVER_60_0.cloverRec.S[3326]++;this.liste_type=liste_type;
		__CLOVER_60_0.cloverRec.S[3327]++;this.liste_classe=liste_classe;
		/*for(i=0;i<liste_type.size();i++)
		{
			t=(Type)liste_type.elementAt(i);
			if(t.nom.compareToIgnoreCase("any")!=0&&
				t.nom.compareToIgnoreCase("none")!=0)
			{
				c=parse_file(t.nom+".e");
				if(c!=null)
				{
					liste_classe.addElement(c);
					ajoute_type(c.liste_classe);
				}
			}
		}
		System.out.println("Classes chargees:");
		affiche_classe();*/
		__CLOVER_60_0.cloverRec.S[3328]++;table_heritage_directe=new boolean[liste_classe.size()][liste_classe.size()];

		__CLOVER_60_0.cloverRec.S[3329]++;for(i=0;(((i<liste_classe.size()) && (++__CLOVER_60_0.cloverRec.CT[1142]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1142]==0&false));i++)
		{{
			__CLOVER_60_0.cloverRec.S[3330]++;HashSet set=new HashSet();
			__CLOVER_60_0.cloverRec.S[3331]++;Classe cl=((Classe)liste_classe.elementAt(i));
			__CLOVER_60_0.cloverRec.S[3332]++;if((((cl.nom.compareToIgnoreCase("none")==0) && (++__CLOVER_60_0.cloverRec.CT[1143]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1143]==0&false)))
			{{
				__CLOVER_60_0.cloverRec.S[3333]++;int j;
				__CLOVER_60_0.cloverRec.S[3334]++;Table_Symbol table;
				__CLOVER_60_0.cloverRec.S[3335]++;for(j=0;(((j<table_heritage_directe.length) && (++__CLOVER_60_0.cloverRec.CT[1144]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1144]==0&false));j++)
				{{
					__CLOVER_60_0.cloverRec.S[3336]++;if((((j!=i) && (++__CLOVER_60_0.cloverRec.CT[1145]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1145]==0&false)))
						{__CLOVER_60_0.cloverRec.S[3337]++;table_heritage_directe[i][j]=true;
				}}
				}__CLOVER_60_0.cloverRec.S[3338]++;table=new Table_Symbol(cl,this);
				__CLOVER_60_0.cloverRec.S[3339]++;ajoute_table(table);
				//cl.attributs=new Vector();
				//cl.attributs_ancetre=new Vector();
				__CLOVER_60_0.cloverRec.S[3340]++;cl.attributs_traite=true;
			}
			}else
			{{
				__CLOVER_60_0.cloverRec.S[3341]++;System.out.println("calcul de :"+
						((Classe)liste_classe.elementAt(i)).nom+"("+i+")"+
						((Classe)liste_classe.elementAt(0)).nom);
				__CLOVER_60_0.cloverRec.S[3342]++;calcul_attributs((Classe)liste_classe.elementAt(i),set);
			}
			}__CLOVER_60_0.cloverRec.S[3343]++;classes_traite=i;
		}
		}__CLOVER_60_0.cloverRec.S[3344]++;table_heritage=calcul_heritage(table_heritage_directe);
		__CLOVER_60_0.cloverRec.S[3345]++;for(i=0;(((i<table_symbol.length) && (++__CLOVER_60_0.cloverRec.CT[1146]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1146]==0&false));i++)
		{{// verifier suivant l'ordre hierarchique
			//&\u00e9"'(
			__CLOVER_60_0.cloverRec.S[3346]++;compiler.env.entre_classe(table_symbol[i].classe,table_symbol[i]);
			__CLOVER_60_0.cloverRec.S[3347]++;table_symbol[i].termine_verification();
			__CLOVER_60_0.cloverRec.S[3348]++;compiler.env.sort_classe();
		}
	}}

	public void affiche_classe()
	{__CLOVER_60_0.cloverRec.M[377]++;
		__CLOVER_60_0.cloverRec.S[3349]++;int i;
		__CLOVER_60_0.cloverRec.S[3350]++;Classe cl;
		__CLOVER_60_0.cloverRec.S[3351]++;for(i=0;(((i<liste_classe.size()) && (++__CLOVER_60_0.cloverRec.CT[1147]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1147]==0&false));i++)
		{{
			__CLOVER_60_0.cloverRec.S[3352]++;cl=(Classe)liste_classe.elementAt(i);
			__CLOVER_60_0.cloverRec.S[3353]++;System.out.println(i+":"+cl.nom);
		}
	}}

	public void ajoute_table(Table_Symbol table)
	{__CLOVER_60_0.cloverRec.M[378]++;
		assert((((table!=null)) && (++__CLOVER_60_0.cloverRec.CT[1148]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1148]==0&false));
		assert((((no_table_symbol(table.classe)==-1)) && (++__CLOVER_60_0.cloverRec.CT[1149]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1149]==0&false)):
				"ajout *2 de "+table.classe.nom;
		__CLOVER_60_0.cloverRec.S[3354]++;if((((table_symbol==null) && (++__CLOVER_60_0.cloverRec.CT[1150]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1150]==0&false)))
		{{
			__CLOVER_60_0.cloverRec.S[3355]++;table_symbol=new Table_Symbol[1];
			__CLOVER_60_0.cloverRec.S[3356]++;table_symbol[0]=table;
		}
		}else
		{{
			__CLOVER_60_0.cloverRec.S[3357]++;int i,len;
			__CLOVER_60_0.cloverRec.S[3358]++;Table_Symbol t[];
			__CLOVER_60_0.cloverRec.S[3359]++;len=table_symbol.length;
			__CLOVER_60_0.cloverRec.S[3360]++;t=new Table_Symbol[len+1];
			__CLOVER_60_0.cloverRec.S[3361]++;for(i=0;(((i<table_symbol.length) && (++__CLOVER_60_0.cloverRec.CT[1151]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1151]==0&false));i++)
				{__CLOVER_60_0.cloverRec.S[3362]++;t[i]=table_symbol[i];
			}__CLOVER_60_0.cloverRec.S[3363]++;t[i]=table;
			__CLOVER_60_0.cloverRec.S[3364]++;table_symbol=t;
		}
	}}

	public int no_table_symbol(Classe c)
	{__CLOVER_60_0.cloverRec.M[379]++;
		assert((((c!=null)) && (++__CLOVER_60_0.cloverRec.CT[1152]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1152]==0&false));
		__CLOVER_60_0.cloverRec.S[3365]++;if((((table_symbol==null) && (++__CLOVER_60_0.cloverRec.CT[1153]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1153]==0&false)))
			{__CLOVER_60_0.cloverRec.S[3366]++;return -1;
		}__CLOVER_60_0.cloverRec.S[3367]++;for(int i=0;(((i<table_symbol.length) && (++__CLOVER_60_0.cloverRec.CT[1154]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1154]==0&false));i++)
		{{
			__CLOVER_60_0.cloverRec.S[3368]++;Classe c2=table_symbol[i].classe;
			assert((((c2!=null)) && (++__CLOVER_60_0.cloverRec.CT[1155]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1155]==0&false));
			__CLOVER_60_0.cloverRec.S[3369]++;if((((c2.nom.compareToIgnoreCase(c.nom)==0) && (++__CLOVER_60_0.cloverRec.CT[1156]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1156]==0&false)))
				{__CLOVER_60_0.cloverRec.S[3370]++;return i;
		}}
		}__CLOVER_60_0.cloverRec.S[3371]++;return -1;
	}

	public Table_Symbol donne_table_symbol(Classe c)
	{__CLOVER_60_0.cloverRec.M[380]++;
		assert((((c!=null)) && (++__CLOVER_60_0.cloverRec.CT[1157]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1157]==0&false));
		__CLOVER_60_0.cloverRec.S[3372]++;int no=no_table_symbol(c);
		assert((((no!=-1)) && (++__CLOVER_60_0.cloverRec.CT[1158]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1158]==0&false));
		__CLOVER_60_0.cloverRec.S[3373]++;return table_symbol[no];
	}

	public Table_Symbol donne_table_symbol(Type t)
	{__CLOVER_60_0.cloverRec.M[381]++;
		assert((((t!=null)) && (++__CLOVER_60_0.cloverRec.CT[1159]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1159]==0&false));
		__CLOVER_60_0.cloverRec.S[3374]++;Classe c=this.cherche_classe(t);
		assert((((c!=null)) && (++__CLOVER_60_0.cloverRec.CT[1160]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1160]==0&false)):"t="+t.toString2();
		__CLOVER_60_0.cloverRec.S[3375]++;int no=no_table_symbol(c);
		assert((((no!=-1)) && (++__CLOVER_60_0.cloverRec.CT[1161]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1161]==0&false)):"type="+t;
		__CLOVER_60_0.cloverRec.S[3376]++;Table_Symbol table=table_symbol[no];
		assert((((table!=null)) && (++__CLOVER_60_0.cloverRec.CT[1162]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1162]==0&false));
		assert((((table.classe.nom.compareToIgnoreCase(t.nom)==0)) && (++__CLOVER_60_0.cloverRec.CT[1163]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1163]==0&false));
		__CLOVER_60_0.cloverRec.S[3377]++;return table;
	}

	public Table_Symbol table_symbol[];

	public void ajoute_heritage(Classe classe,Heritage herit,
			HashSet classe_descendante,Table_Symbol table)
	{__CLOVER_60_0.cloverRec.M[382]++;
		//int k,j;
		__CLOVER_60_0.cloverRec.S[3378]++;Type t=herit.type;
		__CLOVER_60_0.cloverRec.S[3379]++;Classe cl=cherche_classe(t);
		assert((((cl!=null)) && (++__CLOVER_60_0.cloverRec.CT[1164]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1164]==0&false));
		__CLOVER_60_0.cloverRec.S[3380]++;System.out.println("herite de "+cl.nom);
		assert((((!classe_descendante.contains(cl))) && (++__CLOVER_60_0.cloverRec.CT[1165]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1165]==0&false));
		__CLOVER_60_0.cloverRec.S[3381]++;HashSet set=new HashSet();
		__CLOVER_60_0.cloverRec.S[3382]++;set.addAll(classe_descendante);
		__CLOVER_60_0.cloverRec.S[3383]++;set.add(classe);
		__CLOVER_60_0.cloverRec.S[3384]++;calcul_attributs(cl,set);
		//Rename rename[]=herit.rename;
		__CLOVER_60_0.cloverRec.S[3385]++;int no_table,i,j;
		__CLOVER_60_0.cloverRec.S[3386]++;no_table=no_table_symbol(cl);
		assert((((no_table!=-1)) && (++__CLOVER_60_0.cloverRec.CT[1166]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1166]==0&false));
		__CLOVER_60_0.cloverRec.S[3387]++;Table_Symbol tbl=table_symbol[no_table];
		__CLOVER_60_0.cloverRec.S[3388]++;if((((herit.redefine!=null) && (++__CLOVER_60_0.cloverRec.CT[1167]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1167]==0&false)))
		{{
			__CLOVER_60_0.cloverRec.S[3389]++;NomFeature nom1,nom2;
			__CLOVER_60_0.cloverRec.S[3390]++;for(i=0;(((i<herit.redefine.length) && (++__CLOVER_60_0.cloverRec.CT[1168]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1168]==0&false));i++)
			{{
				__CLOVER_60_0.cloverRec.S[3391]++;nom1=herit.redefine[i];
				__CLOVER_60_0.cloverRec.S[3392]++;if((((tbl.donne_attribut(nom1)==null) && (++__CLOVER_60_0.cloverRec.CT[1169]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1169]==0&false)))
				{{// attribut non present dans l'ancetre
					__CLOVER_60_0.cloverRec.S[3393]++;erreur(new ErreurVDRS1(classe,herit,nom1));
				}
				}__CLOVER_60_0.cloverRec.S[3394]++;for(j=0;(((j<i) && (++__CLOVER_60_0.cloverRec.CT[1170]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1170]==0&false));j++)
				{{
					__CLOVER_60_0.cloverRec.S[3395]++;nom2=herit.redefine[j];
					__CLOVER_60_0.cloverRec.S[3396]++;if((((nom1.equals(nom2)) && (++__CLOVER_60_0.cloverRec.CT[1171]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1171]==0&false)))
					{{// Erreur VDRS3 : plusieurs fois l'attr 
						// dans une liste de redefine
						__CLOVER_60_0.cloverRec.S[3397]++;erreur(new ErreurVDRS3(classe,herit,
										nom1,nom2));
					}
				}}
			}}
		}}
		}__CLOVER_60_0.cloverRec.S[3398]++;if((((herit.undefine!=null) && (++__CLOVER_60_0.cloverRec.CT[1172]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1172]==0&false)))
		{{
			__CLOVER_60_0.cloverRec.S[3399]++;NomFeature nom1,nom2;
			__CLOVER_60_0.cloverRec.S[3400]++;for(i=0;(((i<herit.undefine.length) && (++__CLOVER_60_0.cloverRec.CT[1173]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1173]==0&false));i++)
			{{
				__CLOVER_60_0.cloverRec.S[3401]++;nom1=herit.undefine[i];
				__CLOVER_60_0.cloverRec.S[3402]++;if((((tbl.donne_attribut(nom1)==null) && (++__CLOVER_60_0.cloverRec.CT[1174]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1174]==0&false)))
				{{// attribut non present dans l'ancetre
					__CLOVER_60_0.cloverRec.S[3403]++;erreur(new ErreurVDUS1(classe,herit,nom1));
				}
				}__CLOVER_60_0.cloverRec.S[3404]++;for(j=0;(((j<i) && (++__CLOVER_60_0.cloverRec.CT[1175]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1175]==0&false));j++)
				{{
					__CLOVER_60_0.cloverRec.S[3405]++;nom2=herit.undefine[j];
					__CLOVER_60_0.cloverRec.S[3406]++;if((((nom1.equals(nom2)) && (++__CLOVER_60_0.cloverRec.CT[1176]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1176]==0&false)))
					{{// Erreur VDUS4 : plusieurs fois l'attr 
						// dans une liste de undefine
						__CLOVER_60_0.cloverRec.S[3407]++;erreur(new ErreurVDUS4(classe,herit,
										nom1,nom2));
					}
				}}
			}}
		}}
		
		}__CLOVER_60_0.cloverRec.S[3408]++;table.ajoute_heritage(herit,tbl);
	}

	/**
	 * retourne true ssi le type utilis\u00e9 dans la classe
	 * table est correcte par rapport a son type de base
	 * @param table
	 * @param type
	 * @return
	 */
	public boolean type_valide(Table_Symbol table,Type type)
	{__CLOVER_60_0.cloverRec.M[383]++;
		assert((((table!=null)) && (++__CLOVER_60_0.cloverRec.CT[1177]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1177]==0&false));
		assert((((type!=null)) && (++__CLOVER_60_0.cloverRec.CT[1178]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1178]==0&false));
		__CLOVER_60_0.cloverRec.S[3409]++;Classe classe_courante,classe_base;
		__CLOVER_60_0.cloverRec.S[3410]++;classe_courante=table.classe;
		__CLOVER_60_0.cloverRec.S[3411]++;if((((type.is_like) && (++__CLOVER_60_0.cloverRec.CT[1179]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1179]==0&false)))
		{{// type ancr\u00e9
			//System.out.println("like--"+type.debut());
			//type.classe_env=classe_courante;
			__CLOVER_60_0.cloverRec.S[3412]++;if((((type.like==null||!(type.like instanceof Expr_Var)) && (++__CLOVER_60_0.cloverRec.CT[1180]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1180]==0&false)))
			{{// Erreur VTAT1
				//assert(false);
				//System.out.println("VTAT1-4");
				__CLOVER_60_0.cloverRec.S[3413]++;Erreur e;
				__CLOVER_60_0.cloverRec.S[3414]++;if((((compiler.env.dans_feature()/*feature_courante!=null*/) && (++__CLOVER_60_0.cloverRec.CT[1181]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1181]==0&false)))
					{__CLOVER_60_0.cloverRec.S[3415]++;e=new ErreurVTAT2(table.classe,type);
				}else
					{__CLOVER_60_0.cloverRec.S[3416]++;e=new ErreurVTAT1(table.classe,type);
				}__CLOVER_60_0.cloverRec.S[3417]++;erreur(e);
				__CLOVER_60_0.cloverRec.S[3418]++;return false;
			}
			}else
			{{
				__CLOVER_60_0.cloverRec.S[3419]++;Expr_Var var=(Expr_Var)type.like;
				__CLOVER_60_0.cloverRec.S[3420]++;Type t1=null;
				__CLOVER_60_0.cloverRec.S[3421]++;boolean regle2=false,regle3=false;
				__CLOVER_60_0.cloverRec.S[3422]++;if((((var.nom.compareToIgnoreCase("current")==0) && (++__CLOVER_60_0.cloverRec.CT[1182]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1182]==0&false)))
				{{
					__CLOVER_60_0.cloverRec.S[3423]++;return true;
				}
				}else {__CLOVER_60_0.cloverRec.S[3424]++;if((((compiler.env.dans_feature()) && (++__CLOVER_60_0.cloverRec.CT[1183]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1183]==0&false)))
				{{
					/*DeclareVar d=cherche_var(var.nom,
									feature_courante.param);*/
					__CLOVER_60_0.cloverRec.S[3425]++;Declare_entite d;
					__CLOVER_60_0.cloverRec.S[3426]++;d=compiler.env.donne_entite_locale(var.nom);
					__CLOVER_60_0.cloverRec.S[3427]++;if((((d==null) && (++__CLOVER_60_0.cloverRec.CT[1184]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1184]==0&false)))
					{{// //Erreur VTAT2 : attribut non present
						//erreur(new ErreurVTAT2(table.classe,type));
						//return false;
					}
					}else
					{{// la variable est trouve
						__CLOVER_60_0.cloverRec.S[3428]++;regle2=true;
						__CLOVER_60_0.cloverRec.S[3429]++;if((((d.getType()==null) && (++__CLOVER_60_0.cloverRec.CT[1185]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1185]==0&false)))
						{{// Erreur VTAT2
							__CLOVER_60_0.cloverRec.S[3430]++;erreur(new ErreurVTAT2(table.classe,type));
							__CLOVER_60_0.cloverRec.S[3431]++;return false;
						}
						}else
						{{
							__CLOVER_60_0.cloverRec.S[3432]++;t1=d.getType();
						}
					}}
				}}
				}}__CLOVER_60_0.cloverRec.S[3433]++;if((((t1==null) && (++__CLOVER_60_0.cloverRec.CT[1186]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1186]==0&false)))
				{{// pas dans les attributs local
					__CLOVER_60_0.cloverRec.S[3434]++;Attribut_Complet ac=table.trouve_attribut(var.nom);
					__CLOVER_60_0.cloverRec.S[3435]++;if((((ac!=null) && (++__CLOVER_60_0.cloverRec.CT[1187]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1187]==0&false)))
					{{
//						System.out.println("VTAT1-2");
						__CLOVER_60_0.cloverRec.S[3436]++;t1=ac.donne_type_retour(this);
					}
					}else
					{{// Erreur VTAT1 : attribut non present
						//System.out.println("VTAT1-1");
						__CLOVER_60_0.cloverRec.S[3437]++;erreur(new ErreurVTAT1(table.classe,type));
						__CLOVER_60_0.cloverRec.S[3438]++;return false;
					}
				}}
				}__CLOVER_60_0.cloverRec.S[3439]++;if((((t1==null) && (++__CLOVER_60_0.cloverRec.CT[1188]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1188]==0&false)))
				{{
					__CLOVER_60_0.cloverRec.S[3440]++;Erreur e;
					//System.out.println("VTAT1-3");
					__CLOVER_60_0.cloverRec.S[3441]++;if((((regle2) && (++__CLOVER_60_0.cloverRec.CT[1189]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1189]==0&false)))
						{__CLOVER_60_0.cloverRec.S[3442]++;e=new ErreurVTAT2(table.classe,type);
					}else
						{__CLOVER_60_0.cloverRec.S[3443]++;e=new ErreurVTAT1(table.classe,type);
					}__CLOVER_60_0.cloverRec.S[3444]++;erreur(e);
					__CLOVER_60_0.cloverRec.S[3445]++;return false;
				}
				}else
				{{
					__CLOVER_60_0.cloverRec.S[3446]++;if((((t1.expanded) && (++__CLOVER_60_0.cloverRec.CT[1190]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1190]==0&false)))
					{{// Erreur VTAT
						__CLOVER_60_0.cloverRec.S[3447]++;Erreur e;
						__CLOVER_60_0.cloverRec.S[3448]++;if((((regle2) && (++__CLOVER_60_0.cloverRec.CT[1191]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1191]==0&false)))
							{__CLOVER_60_0.cloverRec.S[3449]++;e=new ErreurVTAT2(table.classe,type,
										t1,ErreurVTAT1.Type_expanse);
						}else
							{__CLOVER_60_0.cloverRec.S[3450]++;e=new ErreurVTAT1(table.classe,type,
									t1,ErreurVTAT1.Type_expanse);
						}__CLOVER_60_0.cloverRec.S[3451]++;erreur(e);
						__CLOVER_60_0.cloverRec.S[3452]++;return false;
					}
					}else {__CLOVER_60_0.cloverRec.S[3453]++;if((((table.type_generique(t1)) && (++__CLOVER_60_0.cloverRec.CT[1192]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1192]==0&false)))
					{{// Erreur VTAT
						__CLOVER_60_0.cloverRec.S[3454]++;Erreur e;
						__CLOVER_60_0.cloverRec.S[3455]++;if((((regle2) && (++__CLOVER_60_0.cloverRec.CT[1193]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1193]==0&false)))
							{__CLOVER_60_0.cloverRec.S[3456]++;e=new ErreurVTAT2(table.classe,type,
									t1,ErreurVTAT1.Type_generique);
						}else
							{__CLOVER_60_0.cloverRec.S[3457]++;e=new ErreurVTAT1(table.classe,type,
									t1,ErreurVTAT1.Type_generique);
						}__CLOVER_60_0.cloverRec.S[3458]++;erreur(e);
						__CLOVER_60_0.cloverRec.S[3459]++;return false;
					}
					}else {__CLOVER_60_0.cloverRec.S[3460]++;if((((t1.is_like) && (++__CLOVER_60_0.cloverRec.CT[1194]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1194]==0&false)))
					{{// Erreur VTAT
						__CLOVER_60_0.cloverRec.S[3461]++;Erreur e;
						__CLOVER_60_0.cloverRec.S[3462]++;if((((regle2) && (++__CLOVER_60_0.cloverRec.CT[1195]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1195]==0&false)))
							{__CLOVER_60_0.cloverRec.S[3463]++;e=new ErreurVTAT2(table.classe,type,
									t1,ErreurVTAT1.Type_ancre);
						}else
							{__CLOVER_60_0.cloverRec.S[3464]++;e=new ErreurVTAT1(table.classe,type,
									t1,ErreurVTAT1.Type_ancre);
						}__CLOVER_60_0.cloverRec.S[3465]++;erreur(e);
						__CLOVER_60_0.cloverRec.S[3466]++;return false;
					}
					}else
					{{// Ok
						__CLOVER_60_0.cloverRec.S[3467]++;return true;
					}
				}}}}
			}}
		}}
		}else
		{{
			__CLOVER_60_0.cloverRec.S[3468]++;Type type_reel=table.trouve_vrai_type(type);
			__CLOVER_60_0.cloverRec.S[3469]++;if((((type_reel==null) && (++__CLOVER_60_0.cloverRec.CT[1196]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1196]==0&false)))
			{{
				__CLOVER_60_0.cloverRec.S[3470]++;return false;
			}
			}__CLOVER_60_0.cloverRec.S[3471]++;if((((table.type_generique(type_reel)) && (++__CLOVER_60_0.cloverRec.CT[1197]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1197]==0&false)))
			{{
				__CLOVER_60_0.cloverRec.S[3472]++;Type contrainte=table.contrainte(type_reel);
				__CLOVER_60_0.cloverRec.S[3473]++;if((((contrainte!=null) && (++__CLOVER_60_0.cloverRec.CT[1198]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1198]==0&false)))
				{{
					__CLOVER_60_0.cloverRec.S[3474]++;classe_base=cherche_classe(contrainte);
					__CLOVER_60_0.cloverRec.S[3475]++;if((((classe_base==null) && (++__CLOVER_60_0.cloverRec.CT[1199]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1199]==0&false)))
					{{//	la classe n'existe pas
						__CLOVER_60_0.cloverRec.S[3476]++;System.out.println("Salut-----"+type+"="+
											type_reel+"->"+contrainte
											+":"+classe_courante.nom);
						__CLOVER_60_0.cloverRec.S[3477]++;erreur(new ErreurVTCT(type_reel,classe_courante));
						__CLOVER_60_0.cloverRec.S[3478]++;return false;
					}
				}}
				}else
				{{
					__CLOVER_60_0.cloverRec.S[3479]++;classe_base=null;
				}
			}}
			}else
			{{
				__CLOVER_60_0.cloverRec.S[3480]++;classe_base=cherche_classe(type_reel);
			}
			}assert((((classe_courante!=null)) && (++__CLOVER_60_0.cloverRec.CT[1200]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1200]==0&false));
			__CLOVER_60_0.cloverRec.S[3481]++;if((((classe_base==null) && (++__CLOVER_60_0.cloverRec.CT[1201]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1201]==0&false)))
			{{// la classe n'existe pas
				__CLOVER_60_0.cloverRec.S[3482]++;if((((!table.type_generique(type_reel)) && (++__CLOVER_60_0.cloverRec.CT[1202]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1202]==0&false)))
				{{
					__CLOVER_60_0.cloverRec.S[3483]++;System.out.println("Coucou-----");
					__CLOVER_60_0.cloverRec.S[3484]++;erreur(new ErreurVTCT(type_reel,classe_courante));
					__CLOVER_60_0.cloverRec.S[3485]++;return false;
				}
				}else
				{{// c'est un type generique sans pb
					__CLOVER_60_0.cloverRec.S[3486]++;return true;
				}
			}}
			}__CLOVER_60_0.cloverRec.S[3487]++;Type t=classe_base.type;
			__CLOVER_60_0.cloverRec.S[3488]++;Table_Symbol table2=donne_table_symbol(t);
			assert((((table2!=null)) && (++__CLOVER_60_0.cloverRec.CT[1203]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1203]==0&false));
			__CLOVER_60_0.cloverRec.S[3489]++;if((((type_reel.expanded) && (++__CLOVER_60_0.cloverRec.CT[1204]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1204]==0&false)))
			{{
				__CLOVER_60_0.cloverRec.S[3490]++;if((((classe_base.deferred) && (++__CLOVER_60_0.cloverRec.CT[1205]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1205]==0&false)))
				{{// Erreur VTEC1
					__CLOVER_60_0.cloverRec.S[3491]++;erreur(new ErreurVTEC1(classe_courante,
								type_reel,classe_base));
				}
				}__CLOVER_60_0.cloverRec.S[3492]++;if((((classe_base.creation!=null) && (++__CLOVER_60_0.cloverRec.CT[1206]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1206]==0&false)))
				{{
					__CLOVER_60_0.cloverRec.S[3493]++;Creation c;
					__CLOVER_60_0.cloverRec.S[3494]++;int i;
					__CLOVER_60_0.cloverRec.S[3495]++;if((((classe_base.creation.length>1||
						(classe_base.creation.length==1&&
						classe_base.creation[0].nom_fonction.length>1)) && (++__CLOVER_60_0.cloverRec.CT[1207]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1207]==0&false)))
					{{// Erreur VTEC2 : plusieurs procedures de creation
						__CLOVER_60_0.cloverRec.S[3496]++;erreur(new ErreurVTEC2(classe_courante,type_reel,
												classe_base));
					}
					}else {__CLOVER_60_0.cloverRec.S[3497]++;if((((classe_base.creation.length==1) && (++__CLOVER_60_0.cloverRec.CT[1208]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1208]==0&false)))
					{{
						__CLOVER_60_0.cloverRec.S[3498]++;c=classe_base.creation[0];
						__CLOVER_60_0.cloverRec.S[3499]++;Attribut_Complet ac;
						__CLOVER_60_0.cloverRec.S[3500]++;ac=table2.donne_attribut(c.nom_fonction[0]);
						__CLOVER_60_0.cloverRec.S[3501]++;if((((ac.signature.parametre!=null&&
							ac.signature.parametre.length>0) && (++__CLOVER_60_0.cloverRec.CT[1209]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1209]==0&false)))
						{{// Erreur VTEC2 : plusieurs parametres
							__CLOVER_60_0.cloverRec.S[3502]++;erreur(new ErreurVTEC2(classe_courante,
													type_reel,classe_base,c));
						}
					}}
				}}}
			}}
			}__CLOVER_60_0.cloverRec.S[3503]++;if((((t.generique==null||t.generique.length==0) && (++__CLOVER_60_0.cloverRec.CT[1210]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1210]==0&false)))
			{{
				__CLOVER_60_0.cloverRec.S[3504]++;if((((type_reel.generique!=null&&
					type_reel.generique.length>0) && (++__CLOVER_60_0.cloverRec.CT[1211]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1211]==0&false)))
				{{// Erreur: pas le meme nombre de parametre
					__CLOVER_60_0.cloverRec.S[3505]++;erreur(new ErreurVTUG1(type_reel,t));
					__CLOVER_60_0.cloverRec.S[3506]++;return false;
				}
			}}
			}else
			{{
				__CLOVER_60_0.cloverRec.S[3507]++;Type t1,t2;
				__CLOVER_60_0.cloverRec.S[3508]++;if((((type_reel.generique==null||
					type_reel.generique.length!=t.generique.length) && (++__CLOVER_60_0.cloverRec.CT[1212]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1212]==0&false)))
				{{// Erreur: pas le meme nombre de parametre
					__CLOVER_60_0.cloverRec.S[3509]++;erreur(new ErreurVTUG2(type_reel,t));
					__CLOVER_60_0.cloverRec.S[3510]++;return false;
				}
				}__CLOVER_60_0.cloverRec.S[3511]++;for(int i=0;(((i<t.generique.length) && (++__CLOVER_60_0.cloverRec.CT[1213]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1213]==0&false));i++)
				{{
					__CLOVER_60_0.cloverRec.S[3512]++;Type contrainte=null,t3,t4;
					__CLOVER_60_0.cloverRec.S[3513]++;t3=t.generique[i];
					__CLOVER_60_0.cloverRec.S[3514]++;t4=type_reel.generique[i];
					assert((((table2.type_generique(t3))) && (++__CLOVER_60_0.cloverRec.CT[1214]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1214]==0&false)):"classe:"+t+
							";param="+t3;
					__CLOVER_60_0.cloverRec.S[3515]++;if((((table2.type_generique(t3)) && (++__CLOVER_60_0.cloverRec.CT[1215]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1215]==0&false)))
						{__CLOVER_60_0.cloverRec.S[3516]++;contrainte=table2.contrainte(t3);
					//System.out.println("coucou:");
					}__CLOVER_60_0.cloverRec.S[3517]++;if((((contrainte!=null&&!type_compatible(t4,table,
							contrainte,table2)) && (++__CLOVER_60_0.cloverRec.CT[1216]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1216]==0&false)))
					{{// Erreur pas compatible
						//System.out.println("Erreur,assert");
						//assert(false):"diff:"+t4+"!="+contrainte;
						__CLOVER_60_0.cloverRec.S[3518]++;erreur(new ErreurVTCG3(t4,contrainte));
						__CLOVER_60_0.cloverRec.S[3519]++;return false;
					}
					}__CLOVER_60_0.cloverRec.S[3520]++;if((((!type_valide(table,t4)) && (++__CLOVER_60_0.cloverRec.CT[1217]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1217]==0&false)))
					{{
						__CLOVER_60_0.cloverRec.S[3521]++;return false;
					}
				}}
			}}
		}}
		}__CLOVER_60_0.cloverRec.S[3522]++;return true;
	}

	public void affiche_table_symbol()
	{__CLOVER_60_0.cloverRec.M[384]++;
		__CLOVER_60_0.cloverRec.S[3523]++;int i;
		__CLOVER_60_0.cloverRec.S[3524]++;System.out.println("Les tables des symboles");
		__CLOVER_60_0.cloverRec.S[3525]++;for(i=0;(((i<table_symbol.length) && (++__CLOVER_60_0.cloverRec.CT[1218]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1218]==0&false));i++)
		{{
			__CLOVER_60_0.cloverRec.S[3526]++;System.out.println(table_symbol[i]);
		}
		}__CLOVER_60_0.cloverRec.S[3527]++;System.out.println("Fin des tables des symboles");
	}

	public boolean type_existe(Type type)
	{__CLOVER_60_0.cloverRec.M[385]++;
		assert((((type!=null)) && (++__CLOVER_60_0.cloverRec.CT[1219]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1219]==0&false));
		assert((((!type.is_like)) && (++__CLOVER_60_0.cloverRec.CT[1220]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1220]==0&false));
		__CLOVER_60_0.cloverRec.S[3528]++;return compiler.classe_existe(type.nom);
	}

	public void calcul_attributs(Classe classe,HashSet classe_descendante)
	{__CLOVER_60_0.cloverRec.M[386]++;// TODO : Terminer d'utiliser les Table_Symbol
		__CLOVER_60_0.cloverRec.S[3529]++;Heritage herit;
		__CLOVER_60_0.cloverRec.S[3530]++;Type t;
		__CLOVER_60_0.cloverRec.S[3531]++;int i,j,k;
		__CLOVER_60_0.cloverRec.S[3532]++;Classe cl;
		__CLOVER_60_0.cloverRec.S[3533]++;Vector attr_ancetre=new Vector();
		__CLOVER_60_0.cloverRec.S[3534]++;Table_Symbol table;

		__CLOVER_60_0.cloverRec.S[3535]++;System.out.println("attributs0 de la classe "+classe.nom);
		__CLOVER_60_0.cloverRec.S[3536]++;j=no_classe(classe);
		__CLOVER_60_0.cloverRec.S[3537]++;if((((!classe.attributs_traite) && (++__CLOVER_60_0.cloverRec.CT[1221]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1221]==0&false)))
		{{// classe non encore traite
			// TODO : eviter la recursivite pour TEST8
			assert((((!classe_descendante.contains(classe))) && (++__CLOVER_60_0.cloverRec.CT[1222]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1222]==0&false));
			assert((((no_table_symbol(classe)==-1)) && (++__CLOVER_60_0.cloverRec.CT[1223]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1223]==0&false)):"Erreur:"+classe.nom;
			__CLOVER_60_0.cloverRec.S[3538]++;table=new Table_Symbol(classe,this);
			__CLOVER_60_0.cloverRec.S[3539]++;ajoute_table(table);
			//compiler.env.entre_classe(classe,table);
			__CLOVER_60_0.cloverRec.S[3540]++;if((((classe.type.generique!=null&&
				classe.type.generique.length>0) && (++__CLOVER_60_0.cloverRec.CT[1224]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1224]==0&false)))
			{{
				__CLOVER_60_0.cloverRec.S[3541]++;Type t1,t2;
				__CLOVER_60_0.cloverRec.S[3542]++;Vector liste=new Vector();
				__CLOVER_60_0.cloverRec.S[3543]++;for(i=0;(((i<classe.type.generique.length) && (++__CLOVER_60_0.cloverRec.CT[1225]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1225]==0&false));i++)
				{{
					__CLOVER_60_0.cloverRec.S[3544]++;t1=classe.type.generique[i];
					assert((((t1!=null)) && (++__CLOVER_60_0.cloverRec.CT[1226]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1226]==0&false));
					__CLOVER_60_0.cloverRec.S[3545]++;if((((type_existe(t1)) && (++__CLOVER_60_0.cloverRec.CT[1227]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1227]==0&false)))
					{{// Le type existe dans l'univers
						//assert()
						__CLOVER_60_0.cloverRec.S[3546]++;erreur(new ErreurVCFG1(classe,t1));
					}
					}else
					{{
						__CLOVER_60_0.cloverRec.S[3547]++;for(int k1=0;(((k1<liste.size()) && (++__CLOVER_60_0.cloverRec.CT[1228]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1228]==0&false));k1++)
						{{
							__CLOVER_60_0.cloverRec.S[3548]++;t2=(Type)liste.elementAt(k1);
							assert((((t2!=null)) && (++__CLOVER_60_0.cloverRec.CT[1229]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1229]==0&false));
							__CLOVER_60_0.cloverRec.S[3549]++;if((((t1.egaux(t2)) && (++__CLOVER_60_0.cloverRec.CT[1230]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1230]==0&false)))
							{{// le type est deja declare dans la liste de
								// genericite
								//assert(false):"j="+j+";"+t1+"="+t2;
								__CLOVER_60_0.cloverRec.S[3550]++;erreur(new ErreurVCFG2(classe,t1,t2));
							}
						}}
					}}
					}__CLOVER_60_0.cloverRec.S[3551]++;liste.addElement(t1);
				}
			}}
			}__CLOVER_60_0.cloverRec.S[3552]++;if((((classe.heritage!=null) && (++__CLOVER_60_0.cloverRec.CT[1231]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1231]==0&false)))
			{{// plusieurs heritage
				__CLOVER_60_0.cloverRec.S[3553]++;for(i=0;(((i<classe.heritage.length) && (++__CLOVER_60_0.cloverRec.CT[1232]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1232]==0&false));i++)
				{{
					__CLOVER_60_0.cloverRec.S[3554]++;herit=classe.heritage[i];
					__CLOVER_60_0.cloverRec.S[3555]++;t=herit.type;
					__CLOVER_60_0.cloverRec.S[3556]++;cl=cherche_classe(t);
					assert((((cl!=null)) && (++__CLOVER_60_0.cloverRec.CT[1233]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1233]==0&false));
					assert((((j==no_classe(classe))) && (++__CLOVER_60_0.cloverRec.CT[1234]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1234]==0&false));
					__CLOVER_60_0.cloverRec.S[3557]++;k=no_classe(cl);
					__CLOVER_60_0.cloverRec.S[3558]++;table_heritage_directe[j][k]=true;
					__CLOVER_60_0.cloverRec.S[3559]++;System.out.println("herit("+j+","+k+")");
					__CLOVER_60_0.cloverRec.S[3560]++;if((((classe_descendante.contains(cl)) && (++__CLOVER_60_0.cloverRec.CT[1235]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1235]==0&false)))
					{{
						//erreur("Erreur: il y a un cycle d'heritage ("+
						//	cl.nom+"->...->"+classe.nom+"->"+cl.nom+")");
						__CLOVER_60_0.cloverRec.S[3561]++;erreur(new ErreurVHPR(cl,classe));
					}
					}else
					{{
						__CLOVER_60_0.cloverRec.S[3562]++;ajoute_heritage(classe,herit,classe_descendante,table);
					}
				}}
			}}
			}else {__CLOVER_60_0.cloverRec.S[3563]++;if(((((classe.heritage==null||classe.heritage.length==0)&&
					(classe.nom.compareToIgnoreCase("general")==0||
					classe.nom.compareToIgnoreCase("any")==0||
					classe.nom.compareToIgnoreCase("plateform")==0)) && (++__CLOVER_60_0.cloverRec.CT[1236]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1236]==0&false)))
			{{// classe general ou any ou plateform sans ancetre

			}
			}else
			{{// pas d'heritage => herite de ANY
				__CLOVER_60_0.cloverRec.S[3564]++;k=1;
				__CLOVER_60_0.cloverRec.S[3565]++;cl=(Classe)liste_classe.elementAt(k);
				assert((((cl.nom.compareToIgnoreCase("any")==0)) && (++__CLOVER_60_0.cloverRec.CT[1237]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1237]==0&false));
				//System.out.println("("+j+","+k+")");
				assert((((j==no_classe(classe))) && (++__CLOVER_60_0.cloverRec.CT[1238]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1238]==0&false));
				__CLOVER_60_0.cloverRec.S[3566]++;table_heritage_directe[j][k]=true;
				__CLOVER_60_0.cloverRec.S[3567]++;if((((classe_descendante.contains(cl)) && (++__CLOVER_60_0.cloverRec.CT[1239]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1239]==0&false)))
				{{
					//erreur("Il y a un cycle d'heritage ("+
					//	cl.nom+"->...->"+classe.nom+"->"+cl.nom+")");
					__CLOVER_60_0.cloverRec.S[3568]++;erreur(new ErreurVHPR(cl,classe));
				}
				}else
				{{
					__CLOVER_60_0.cloverRec.S[3569]++;herit=new Heritage(new TypeSimple(false,"any",null),
							new Vector(),new Vector(),new Vector(),
							new Vector(),new Vector());
					__CLOVER_60_0.cloverRec.S[3570]++;ajoute_heritage(classe,herit,
									classe_descendante,table);
				}
			}}
			// ajout dans la table de symbol de tous les attributs
			// directes de la classe
			}}__CLOVER_60_0.cloverRec.S[3571]++;if((((classe.feature!=null&&classe.feature.length>0) && (++__CLOVER_60_0.cloverRec.CT[1240]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1240]==0&false)))
			{{
				__CLOVER_60_0.cloverRec.S[3572]++;for(i=0;(((i<classe.feature.length) && (++__CLOVER_60_0.cloverRec.CT[1241]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1241]==0&false));i++)
				{{
					__CLOVER_60_0.cloverRec.S[3573]++;System.out.println("i="+i);
					//compiler.env.entre_feature(classe.feature[i]);
					__CLOVER_60_0.cloverRec.S[3574]++;table.ajoute_feature(classe.feature[i]);
					//compiler.env.sort_feature();
				}
			}}
			}__CLOVER_60_0.cloverRec.S[3575]++;table.verifie_valide();
			__CLOVER_60_0.cloverRec.S[3576]++;classe.attributs_traite=true;
			//compiler.env.sort_classe();
		}
		}__CLOVER_60_0.cloverRec.S[3577]++;System.out.println("Fin des attributs de la classe "+classe.nom);
	}

	public Vector conflit_nom(Vector liste1,Vector liste2)
	{__CLOVER_60_0.cloverRec.M[387]++;
		assert((((liste1!=null)) && (++__CLOVER_60_0.cloverRec.CT[1242]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1242]==0&false));
		assert((((liste2!=null)) && (++__CLOVER_60_0.cloverRec.CT[1243]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1243]==0&false));
		__CLOVER_60_0.cloverRec.S[3578]++;Vector tmp=intersection(liste1,liste2);
		
		__CLOVER_60_0.cloverRec.S[3579]++;Vector tmp2;
		__CLOVER_60_0.cloverRec.S[3580]++;for(int i=0;(((i<tmp.size()) && (++__CLOVER_60_0.cloverRec.CT[1244]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1244]==0&false));i++)
		{{
			__CLOVER_60_0.cloverRec.S[3581]++;Attribut a0=(Attribut)tmp.elementAt(i);
			__CLOVER_60_0.cloverRec.S[3582]++;int j=liste2.indexOf(a0);
			assert((((j!=-1)) && (++__CLOVER_60_0.cloverRec.CT[1245]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1245]==0&false));
			__CLOVER_60_0.cloverRec.S[3583]++;Attribut a2=(Attribut)liste2.elementAt(i);
			__CLOVER_60_0.cloverRec.S[3584]++;if((((dans_meme_classe(a0.feature,a2.feature)) && (++__CLOVER_60_0.cloverRec.CT[1246]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1246]==0&false)))
			{{// c'est la meme feature 
				__CLOVER_60_0.cloverRec.S[3585]++;tmp.remove(i);
				__CLOVER_60_0.cloverRec.S[3586]++;i--;
			}
			}__CLOVER_60_0.cloverRec.S[3587]++;if((((a0.feature.is_deferred()||a2.feature.is_deferred()) && (++__CLOVER_60_0.cloverRec.CT[1247]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1247]==0&false)))
			{{
				__CLOVER_60_0.cloverRec.S[3588]++;tmp.remove(i);
				__CLOVER_60_0.cloverRec.S[3589]++;i--;
			}
		}}
		}__CLOVER_60_0.cloverRec.S[3590]++;return tmp;
	}

	public boolean dans_meme_classe(Feature f1,Feature f2)
	{__CLOVER_60_0.cloverRec.M[388]++;
		assert((((f1!=null)) && (++__CLOVER_60_0.cloverRec.CT[1248]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1248]==0&false));
		assert((((f2!=null)) && (++__CLOVER_60_0.cloverRec.CT[1249]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1249]==0&false));
		__CLOVER_60_0.cloverRec.S[3591]++;return f1.classe.nom.equals(f2.classe.nom);
	}

	public boolean[][] calcul_heritage(boolean heritage_directe[][])
	{__CLOVER_60_0.cloverRec.M[389]++;
		__CLOVER_60_0.cloverRec.S[3592]++;boolean heritage[][],modifier=true;
		__CLOVER_60_0.cloverRec.S[3593]++;int taille,i,j,no,k;

		__CLOVER_60_0.cloverRec.S[3594]++;taille=heritage_directe.length;
		__CLOVER_60_0.cloverRec.S[3595]++;heritage=new boolean[taille][taille];

		__CLOVER_60_0.cloverRec.S[3596]++;for(i=0;(((i<taille) && (++__CLOVER_60_0.cloverRec.CT[1250]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1250]==0&false));i++)
			{__CLOVER_60_0.cloverRec.S[3597]++;for(j=0;(((j<taille) && (++__CLOVER_60_0.cloverRec.CT[1251]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1251]==0&false));j++)
				{__CLOVER_60_0.cloverRec.S[3598]++;heritage[i][j]=heritage_directe[i][j];

		}}__CLOVER_60_0.cloverRec.S[3599]++;for(k=0;(((k<taille*taille&&modifier) && (++__CLOVER_60_0.cloverRec.CT[1252]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1252]==0&false));k++)
		{{
			__CLOVER_60_0.cloverRec.S[3600]++;modifier=false;
			__CLOVER_60_0.cloverRec.S[3601]++;for(i=0;(((i<taille) && (++__CLOVER_60_0.cloverRec.CT[1253]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1253]==0&false));i++)
			{{
				__CLOVER_60_0.cloverRec.S[3602]++;for(j=0;(((j<taille) && (++__CLOVER_60_0.cloverRec.CT[1254]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1254]==0&false));j++)
				{{
					__CLOVER_60_0.cloverRec.S[3603]++;if((((heritage[j][i]==true) && (++__CLOVER_60_0.cloverRec.CT[1255]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1255]==0&false)))
					{{
						__CLOVER_60_0.cloverRec.S[3604]++;for(k=0;(((k<taille) && (++__CLOVER_60_0.cloverRec.CT[1256]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1256]==0&false));k++)
						{{
							__CLOVER_60_0.cloverRec.S[3605]++;if((((heritage[k][j]&&!heritage[k][i]) && (++__CLOVER_60_0.cloverRec.CT[1257]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1257]==0&false)))
							{{
								__CLOVER_60_0.cloverRec.S[3606]++;modifier=true;
								__CLOVER_60_0.cloverRec.S[3607]++;heritage[k][i]=true;
							}
						}}
					}}
				}}
			}}
		}}

		}__CLOVER_60_0.cloverRec.S[3608]++;return heritage;
	}

	public Vector intersection(Vector v1,Vector v2)
	{__CLOVER_60_0.cloverRec.M[390]++;
		__CLOVER_60_0.cloverRec.S[3609]++;int i,j;
		__CLOVER_60_0.cloverRec.S[3610]++;Attribut n1,n2;
		__CLOVER_60_0.cloverRec.S[3611]++;Vector res=new Vector();

		__CLOVER_60_0.cloverRec.S[3612]++;if((((v1==null||v2==null) && (++__CLOVER_60_0.cloverRec.CT[1258]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1258]==0&false)))
			{__CLOVER_60_0.cloverRec.S[3613]++;return res;
		}__CLOVER_60_0.cloverRec.S[3614]++;for(i=0;(((i<v1.size()) && (++__CLOVER_60_0.cloverRec.CT[1259]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1259]==0&false));i++)
		{{
			__CLOVER_60_0.cloverRec.S[3615]++;n1=(Attribut)v1.elementAt(i);
			__CLOVER_60_0.cloverRec.S[3616]++;for(j=0;(((j<v2.size()) && (++__CLOVER_60_0.cloverRec.CT[1260]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1260]==0&false));j++)
			{{
				__CLOVER_60_0.cloverRec.S[3617]++;n2=(Attribut)v2.elementAt(j);
				__CLOVER_60_0.cloverRec.S[3618]++;if((((n1.equals(n2)) && (++__CLOVER_60_0.cloverRec.CT[1261]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1261]==0&false)))
				{{
					__CLOVER_60_0.cloverRec.S[3619]++;res.addElement(n1);
				}
			}}
		}}
		}__CLOVER_60_0.cloverRec.S[3620]++;return res;
	}

	// retourne le plus petit type qui est conforme a t1 et t2 
	public Vector super_type(Type t1,Type t2)
	{__CLOVER_60_0.cloverRec.M[391]++;
		assert((((t1!=null)) && (++__CLOVER_60_0.cloverRec.CT[1262]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1262]==0&false));
		assert((((t2!=null)) && (++__CLOVER_60_0.cloverRec.CT[1263]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1263]==0&false));
		__CLOVER_60_0.cloverRec.S[3621]++;if((((t1==null) && (++__CLOVER_60_0.cloverRec.CT[1264]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1264]==0&false)))
			{__CLOVER_60_0.cloverRec.S[3622]++;return null;
		}__CLOVER_60_0.cloverRec.S[3623]++;if((((t2==null) && (++__CLOVER_60_0.cloverRec.CT[1265]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1265]==0&false)))
			{__CLOVER_60_0.cloverRec.S[3624]++;return null;
		}__CLOVER_60_0.cloverRec.S[3625]++;Classe c1,c2;
		__CLOVER_60_0.cloverRec.S[3626]++;int no1,no2,i,len,res=-1,j;
		__CLOVER_60_0.cloverRec.S[3627]++;boolean table[];
		__CLOVER_60_0.cloverRec.S[3628]++;Type t;
		__CLOVER_60_0.cloverRec.S[3629]++;Vector liste;
		__CLOVER_60_0.cloverRec.S[3630]++;c1=cherche_classe(t1);
		__CLOVER_60_0.cloverRec.S[3631]++;no1=no_classe(c1);
		__CLOVER_60_0.cloverRec.S[3632]++;c2=cherche_classe(t2);
		__CLOVER_60_0.cloverRec.S[3633]++;no2=no_classe(c2);
		__CLOVER_60_0.cloverRec.S[3634]++;len=table_heritage.length;
		__CLOVER_60_0.cloverRec.S[3635]++;table=new boolean[len];
		__CLOVER_60_0.cloverRec.S[3636]++;System.out.println("super1");
		__CLOVER_60_0.cloverRec.S[3637]++;for(i=0;(((i<len) && (++__CLOVER_60_0.cloverRec.CT[1266]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1266]==0&false));i++)
		{{
			__CLOVER_60_0.cloverRec.S[3638]++;table[i]=table_heritage[no1][i] 
						&& table_heritage[no2][i];
		}
		}__CLOVER_60_0.cloverRec.S[3639]++;table[no1]=true;
		__CLOVER_60_0.cloverRec.S[3640]++;table[no2]=true;
		__CLOVER_60_0.cloverRec.S[3641]++;System.out.println("super2");
		__CLOVER_60_0.cloverRec.S[3642]++;for(i=0;(((i<len) && (++__CLOVER_60_0.cloverRec.CT[1267]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1267]==0&false));i++)
		{{
			__CLOVER_60_0.cloverRec.S[3643]++;int nb_descendant=0,nb_total=0;
			__CLOVER_60_0.cloverRec.S[3644]++;if((((table[i]) && (++__CLOVER_60_0.cloverRec.CT[1268]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1268]==0&false)))
			{{// un des ancetres
				__CLOVER_60_0.cloverRec.S[3645]++;System.out.println("super5:"+i);
				__CLOVER_60_0.cloverRec.S[3646]++;for(j=0;(((j<len) && (++__CLOVER_60_0.cloverRec.CT[1269]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1269]==0&false));j++)
				{{
					__CLOVER_60_0.cloverRec.S[3647]++;if((((j!=i&&table[j]) && (++__CLOVER_60_0.cloverRec.CT[1270]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1270]==0&false)))
					{{//un autre des ancetres
						__CLOVER_60_0.cloverRec.S[3648]++;nb_total++;
						__CLOVER_60_0.cloverRec.S[3649]++;if((((table_heritage[j][i]) && (++__CLOVER_60_0.cloverRec.CT[1271]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1271]==0&false)))
						{{
							__CLOVER_60_0.cloverRec.S[3650]++;nb_descendant++;
						}
					}}
				}}
				}__CLOVER_60_0.cloverRec.S[3651]++;System.out.println("super6:"+i);
				__CLOVER_60_0.cloverRec.S[3652]++;if((((nb_total>0&&nb_total==nb_descendant) && (++__CLOVER_60_0.cloverRec.CT[1272]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1272]==0&false)))
				{{// la classe i est l'ancetre de toutes les classes
					__CLOVER_60_0.cloverRec.S[3653]++;table[i]=false;
					__CLOVER_60_0.cloverRec.S[3654]++;i=0;
				}
				}__CLOVER_60_0.cloverRec.S[3655]++;System.out.println("super7:"+i);
			}
		}}
		}__CLOVER_60_0.cloverRec.S[3656]++;System.out.println("super3");
		__CLOVER_60_0.cloverRec.S[3657]++;liste=new Vector();
		__CLOVER_60_0.cloverRec.S[3658]++;for(i=0;(((i<len) && (++__CLOVER_60_0.cloverRec.CT[1273]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1273]==0&false));i++)
		{{
			__CLOVER_60_0.cloverRec.S[3659]++;if((((table[i]) && (++__CLOVER_60_0.cloverRec.CT[1274]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1274]==0&false)))
			{{
				__CLOVER_60_0.cloverRec.S[3660]++;Classe c=(Classe)liste_classe.elementAt(i);
				__CLOVER_60_0.cloverRec.S[3661]++;liste.addElement(c.type);
				//assert(res==-1):"t="+res+"+"+i;// plusieurs type de retour non compris
				__CLOVER_60_0.cloverRec.S[3662]++;res=i;
			}
		}}
		}assert((((res!=-1)) && (++__CLOVER_60_0.cloverRec.CT[1275]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1275]==0&false));
		__CLOVER_60_0.cloverRec.S[3663]++;System.out.println("super4");
		__CLOVER_60_0.cloverRec.S[3664]++;t=((Classe)liste_classe.elementAt(res)).type;
		__CLOVER_60_0.cloverRec.S[3665]++;return liste;
	}

	// retourne le plus petit type qui est conforme a liste et t2
	// TODO: a refaire 
	public Vector super_type(Vector liste,Type t2)
	{__CLOVER_60_0.cloverRec.M[392]++;// TODO: a optimise (desfois plusieurs fois le meme type)
		// ex: <<1,2,3>> et ARRAY[INTEGER]
		__CLOVER_60_0.cloverRec.S[3666]++;Type t1;
		__CLOVER_60_0.cloverRec.S[3667]++;Vector res,l;
		assert((((liste!=null)) && (++__CLOVER_60_0.cloverRec.CT[1276]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1276]==0&false));
		assert((((t2!=null)) && (++__CLOVER_60_0.cloverRec.CT[1277]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1277]==0&false));
		__CLOVER_60_0.cloverRec.S[3668]++;res=new Vector();
		__CLOVER_60_0.cloverRec.S[3669]++;for(int i=0;(((i<liste.size()) && (++__CLOVER_60_0.cloverRec.CT[1278]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1278]==0&false));i++)
		{{
			__CLOVER_60_0.cloverRec.S[3670]++;t1=(Type)liste.elementAt(i);
			__CLOVER_60_0.cloverRec.S[3671]++;l=super_type(t1,t2);
			__CLOVER_60_0.cloverRec.S[3672]++;for(int j=0;(((j<l.size()) && (++__CLOVER_60_0.cloverRec.CT[1279]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1279]==0&false));j++)
			{{
				__CLOVER_60_0.cloverRec.S[3673]++;Type t3,t4;
				__CLOVER_60_0.cloverRec.S[3674]++;boolean deja_dedans=false;
				__CLOVER_60_0.cloverRec.S[3675]++;t3=(Type)l.elementAt(j);
				__CLOVER_60_0.cloverRec.S[3676]++;for(int k=0;(((!deja_dedans&&k<liste.size()) && (++__CLOVER_60_0.cloverRec.CT[1280]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1280]==0&false));k++)
				{{// recherche si deja present
					__CLOVER_60_0.cloverRec.S[3677]++;t4=(Type)liste.elementAt(k);
					__CLOVER_60_0.cloverRec.S[3678]++;if((((t3.egaux(t4)) && (++__CLOVER_60_0.cloverRec.CT[1281]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1281]==0&false)))
					{{
						__CLOVER_60_0.cloverRec.S[3679]++;deja_dedans=true;
					}
				}}
				}__CLOVER_60_0.cloverRec.S[3680]++;if((((!deja_dedans) && (++__CLOVER_60_0.cloverRec.CT[1282]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1282]==0&false)))
				{{
					__CLOVER_60_0.cloverRec.S[3681]++;res.addElement(t3);
				}
			}}
			//res.addAll(l);
		}}
		}__CLOVER_60_0.cloverRec.S[3682]++;return res;
	}

	public boolean type_compatible(Expr de,Table_Symbol t1,
									Declare_entite ancetre,Table_Symbol t2)
	{__CLOVER_60_0.cloverRec.M[393]++;
		assert((((ancetre!=null)) && (++__CLOVER_60_0.cloverRec.CT[1283]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1283]==0&false));
		assert((((de!=null)) && (++__CLOVER_60_0.cloverRec.CT[1284]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1284]==0&false));
		__CLOVER_60_0.cloverRec.S[3683]++;Type type1,type2;
		__CLOVER_60_0.cloverRec.S[3684]++;type1=de.type;
		__CLOVER_60_0.cloverRec.S[3685]++;type2=ancetre.getType();
		__CLOVER_60_0.cloverRec.S[3686]++;if((((type1==null||type2==null) && (++__CLOVER_60_0.cloverRec.CT[1285]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1285]==0&false)))
			{__CLOVER_60_0.cloverRec.S[3687]++;return false;
		}__CLOVER_60_0.cloverRec.S[3688]++;if((((de.op==Expr.Tableau) && (++__CLOVER_60_0.cloverRec.CT[1286]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1286]==0&false)))
		{{
			__CLOVER_60_0.cloverRec.S[3689]++;Expr_Tableau expr_tab=(Expr_Tableau)de;
			__CLOVER_60_0.cloverRec.S[3690]++;Vector v=expr_tab.tableau,v2,liste;
			__CLOVER_60_0.cloverRec.S[3691]++;Type t3,t4=null;
			__CLOVER_60_0.cloverRec.S[3692]++;System.out.println("debut:");
			__CLOVER_60_0.cloverRec.S[3693]++;liste=new Vector();
			__CLOVER_60_0.cloverRec.S[3694]++;for(int i=0;(((i<v.size()) && (++__CLOVER_60_0.cloverRec.CT[1287]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1287]==0&false));i++)
			{{
				__CLOVER_60_0.cloverRec.S[3695]++;t3=((Expr)v.elementAt(i)).type;
				__CLOVER_60_0.cloverRec.S[3696]++;System.out.println("type("+i+")="+t3+":"+t4);
				// TODO: a calculer le type
				//t4=super_type(t3,t4);
				//liste.addElement(t3);
				__CLOVER_60_0.cloverRec.S[3697]++;if((((i>0) && (++__CLOVER_60_0.cloverRec.CT[1288]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1288]==0&false)))
					{__CLOVER_60_0.cloverRec.S[3698]++;liste=super_type(liste,t3);
				}else
					{__CLOVER_60_0.cloverRec.S[3699]++;liste.addElement(t3);
			}}
			}__CLOVER_60_0.cloverRec.S[3700]++;System.out.println("fin type="+liste);
			__CLOVER_60_0.cloverRec.S[3701]++;for(int i=0;(((i<liste.size()) && (++__CLOVER_60_0.cloverRec.CT[1289]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1289]==0&false));i++)
			{{// TODO: a optimiser le nombre d'objet creer
				__CLOVER_60_0.cloverRec.S[3702]++;t3=(Type)liste.elementAt(i);
				__CLOVER_60_0.cloverRec.S[3703]++;v=new Vector();
				__CLOVER_60_0.cloverRec.S[3704]++;v.addElement(t3);
				__CLOVER_60_0.cloverRec.S[3705]++;t3=new TypeSimple(false,"ARRAY",v);
				__CLOVER_60_0.cloverRec.S[3706]++;if((((type_compatible(t3,t1,type2,t2)) && (++__CLOVER_60_0.cloverRec.CT[1290]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1290]==0&false)))
					{__CLOVER_60_0.cloverRec.S[3707]++;return true;
			}}
			}__CLOVER_60_0.cloverRec.S[3708]++;return false;
		}
		}else {__CLOVER_60_0.cloverRec.S[3709]++;if((((!de.type.is_like&&ancetre.getType().is_like) && (++__CLOVER_60_0.cloverRec.CT[1291]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1291]==0&false)))
		{{
			__CLOVER_60_0.cloverRec.S[3710]++;if((((de instanceof Expr_Var&&
				!((Expr_Var)de).nom.equalsIgnoreCase("current")) && (++__CLOVER_60_0.cloverRec.CT[1292]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1292]==0&false)))
			{{
				__CLOVER_60_0.cloverRec.S[3711]++;Expr_Var e1,e2;
				__CLOVER_60_0.cloverRec.S[3712]++;e1=(Expr_Var)de;
				__CLOVER_60_0.cloverRec.S[3713]++;e2=(Expr_Var)ancetre.getType().like;
				assert((((e1!=null)) && (++__CLOVER_60_0.cloverRec.CT[1293]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1293]==0&false));
				assert((((e2!=null)) && (++__CLOVER_60_0.cloverRec.CT[1294]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1294]==0&false));
				__CLOVER_60_0.cloverRec.S[3714]++;return meme_entite(e1.nom,t1,e2.nom,t2);
			}
		}}
		}}__CLOVER_60_0.cloverRec.S[3715]++;return type_compatible(type1,t1,type2,t2);
	}

	public boolean type_compatible(Vector de,Table_Symbol t1,
								Signature ancetre,Table_Symbol t2)
	{__CLOVER_60_0.cloverRec.M[394]++;// "de" dans la classe t1 est un sous type de 
		// "ancetre" de la classe t2
		// donc "de" est conforme a "ancetre"
		assert((((de!=null)) && (++__CLOVER_60_0.cloverRec.CT[1295]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1295]==0&false));
		assert((((ancetre!=null)) && (++__CLOVER_60_0.cloverRec.CT[1296]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1296]==0&false));
		__CLOVER_60_0.cloverRec.S[3716]++;if((((ancetre.nb_parametre()!=de.size()) && (++__CLOVER_60_0.cloverRec.CT[1297]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1297]==0&false)))
		{{
			__CLOVER_60_0.cloverRec.S[3717]++;return false;
		}
		}__CLOVER_60_0.cloverRec.S[3718]++;for(int i=0;(((i<ancetre.nb_parametre()) && (++__CLOVER_60_0.cloverRec.CT[1298]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1298]==0&false));i++)
		{{
			__CLOVER_60_0.cloverRec.S[3719]++;Type type1,type2;
			__CLOVER_60_0.cloverRec.S[3720]++;type1=((Expr)de.elementAt(i)).type;
			__CLOVER_60_0.cloverRec.S[3721]++;type2=ancetre.getParametre(i);
			__CLOVER_60_0.cloverRec.S[3722]++;if((((!type_compatible(type1,t1,type2,t2)) && (++__CLOVER_60_0.cloverRec.CT[1299]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1299]==0&false)))
			{{
				__CLOVER_60_0.cloverRec.S[3723]++;return false;
			}
		}}
		}__CLOVER_60_0.cloverRec.S[3724]++;return true;
	}

	/*public boolean type_compatible(Type de,Type a)
	{// TODO : a effacer
		if(de==null||a==null)
			return false;
		if(de==a)
			return true;
		if(de.equals(a))
			return true;
		int i,j;
		i=no_classe(cherche_classe(de));
		j=no_classe(cherche_classe(a));
		if(i==-1||j==-1)
			return false;
		return table_heritage[i][j];
	}*/

	/*
	 * determine si les types t1 et t2 venant des classes
	 * table1 et table2 sont egaux, sans prendre en compte
	 * s'ils sont expanded.
	 * seul le nom et les parametres generiques sont pris 
	 * en consideration
	 */
	public boolean type_egaux(Type t1,Table_Symbol table1,
								Type t2,Table_Symbol table2)
	{__CLOVER_60_0.cloverRec.M[395]++;
		assert((((t1!=null)) && (++__CLOVER_60_0.cloverRec.CT[1300]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1300]==0&false));
		assert((((t2!=null)) && (++__CLOVER_60_0.cloverRec.CT[1301]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1301]==0&false));
		assert((((table1!=null)) && (++__CLOVER_60_0.cloverRec.CT[1302]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1302]==0&false));
		assert((((table2!=null)) && (++__CLOVER_60_0.cloverRec.CT[1303]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1303]==0&false));
		__CLOVER_60_0.cloverRec.S[3725]++;if((((t1==t2) && (++__CLOVER_60_0.cloverRec.CT[1304]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1304]==0&false)))
			{__CLOVER_60_0.cloverRec.S[3726]++;return true;
		//if(t1.is_like)
		}__CLOVER_60_0.cloverRec.S[3727]++;if((((t1.nom.compareToIgnoreCase(t2.nom)!=0) && (++__CLOVER_60_0.cloverRec.CT[1305]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1305]==0&false)))
			{__CLOVER_60_0.cloverRec.S[3728]++;return false;
		/*if((t1.generique==null||t1.generique.length==0)&&
				(t2.generique!=null&&t2.generique.length>0))
			return false;
		if((t1.generique!=null&&t1.generique.length>0)&&
				(t2.generique==null||t2.generique.length>0))
			return false;*/
		}__CLOVER_60_0.cloverRec.S[3729]++;if((((!parametre_compatible(t1,table1,t2,table2)) && (++__CLOVER_60_0.cloverRec.CT[1306]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1306]==0&false)))
			{__CLOVER_60_0.cloverRec.S[3730]++;return false;
		}__CLOVER_60_0.cloverRec.S[3731]++;if((((table1.type_generique(t1)&&table2.type_generique(t2)&&
				table1!=table2) && (++__CLOVER_60_0.cloverRec.CT[1307]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1307]==0&false)))
		{{
			__CLOVER_60_0.cloverRec.S[3732]++;t1=table1.contrainte(t1);
			__CLOVER_60_0.cloverRec.S[3733]++;if((((t1==null) && (++__CLOVER_60_0.cloverRec.CT[1308]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1308]==0&false)))
				{__CLOVER_60_0.cloverRec.S[3734]++;t1=new TypeSimple(false,"ANY",new Vector());
			}__CLOVER_60_0.cloverRec.S[3735]++;t2=table1.contrainte(t2);
			__CLOVER_60_0.cloverRec.S[3736]++;if((((t2==null) && (++__CLOVER_60_0.cloverRec.CT[1309]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1309]==0&false)))
				{__CLOVER_60_0.cloverRec.S[3737]++;t2=new TypeSimple(false,"ANY",new Vector());
				
			}__CLOVER_60_0.cloverRec.S[3738]++;return type_egaux(t1,table1,t2,table2);
		}
		}__CLOVER_60_0.cloverRec.S[3739]++;return true;
	}

	// retourne true ssi de est un descendandt de ancetre,
	// sans prendre en compte la genericite, expanded et like
	public boolean type_ancetre(Type de,Table_Symbol t1,
								Type ancetre,Table_Symbol t2)
	{__CLOVER_60_0.cloverRec.M[396]++;
		assert((((de!=null)) && (++__CLOVER_60_0.cloverRec.CT[1310]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1310]==0&false));
		assert((((t1!=null)) && (++__CLOVER_60_0.cloverRec.CT[1311]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1311]==0&false));
		assert((((ancetre!=null)) && (++__CLOVER_60_0.cloverRec.CT[1312]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1312]==0&false));
		assert((((t2!=null)) && (++__CLOVER_60_0.cloverRec.CT[1313]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1313]==0&false));
		__CLOVER_60_0.cloverRec.S[3740]++;int i,j;
		__CLOVER_60_0.cloverRec.S[3741]++;i=no_classe(cherche_classe(de));
		__CLOVER_60_0.cloverRec.S[3742]++;j=no_classe(cherche_classe(ancetre));
		__CLOVER_60_0.cloverRec.S[3743]++;if((((i==-1||j==-1) && (++__CLOVER_60_0.cloverRec.CT[1314]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1314]==0&false)))
			{__CLOVER_60_0.cloverRec.S[3744]++;return false;
		}__CLOVER_60_0.cloverRec.S[3745]++;return table_heritage[i][j];
	}

	// retourne true ssi nom1 et nom2 sont la meme entite
	public boolean meme_entite(String nom1,Table_Symbol t1,
								String nom2,Table_Symbol t2)
	{__CLOVER_60_0.cloverRec.M[397]++;// TODO: prendre en compte le renomage d'entite
		assert((((nom1!=null)) && (++__CLOVER_60_0.cloverRec.CT[1315]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1315]==0&false));
		assert((((t1!=null)) && (++__CLOVER_60_0.cloverRec.CT[1316]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1316]==0&false));
		assert((((nom2!=null)) && (++__CLOVER_60_0.cloverRec.CT[1317]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1317]==0&false));
		assert((((t2!=null)) && (++__CLOVER_60_0.cloverRec.CT[1318]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1318]==0&false));
		__CLOVER_60_0.cloverRec.S[3746]++;return t1==t2&&nom1.equalsIgnoreCase(nom2);
	}
	
	// retourne true ssi les parametres de de sont compatible 
	// avec les parametres de ancetre
	public boolean parametre_compatible(Type de,Table_Symbol t1,
										Type ancetre,Table_Symbol t2)
	{__CLOVER_60_0.cloverRec.M[398]++;
		assert((((de!=null)) && (++__CLOVER_60_0.cloverRec.CT[1319]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1319]==0&false));
		assert((((t1!=null)) && (++__CLOVER_60_0.cloverRec.CT[1320]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1320]==0&false));
		assert((((ancetre!=null)) && (++__CLOVER_60_0.cloverRec.CT[1321]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1321]==0&false));
		assert((((t2!=null)) && (++__CLOVER_60_0.cloverRec.CT[1322]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1322]==0&false));
		//assert(type_ancetre(de,t1,ancetre,t2)||
		//		type_egaux(de,t1,ancetre,t2));
		__CLOVER_60_0.cloverRec.S[3747]++;boolean res=false;
		__CLOVER_60_0.cloverRec.S[3748]++;Type de_param[],ancetre_param[];
		__CLOVER_60_0.cloverRec.S[3749]++;System.out.println("Parametre type:"+
							donne_type(de)+"->"+
							donne_type(ancetre));
		__CLOVER_60_0.cloverRec.S[3750]++;de_param=de.generique;
		__CLOVER_60_0.cloverRec.S[3751]++;ancetre_param=ancetre.generique;
		__CLOVER_60_0.cloverRec.S[3752]++;if(((((de_param==null||de_param.length==0)
			&&(ancetre_param==null||ancetre_param.length==0)) && (++__CLOVER_60_0.cloverRec.CT[1323]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1323]==0&false)))
		{{// aucun n'a de parametre
			__CLOVER_60_0.cloverRec.S[3753]++;res=true;
		}
		}else {__CLOVER_60_0.cloverRec.S[3754]++;if(((((de_param==null||de_param.length==0)||
				(ancetre_param==null||ancetre_param.length==0)) && (++__CLOVER_60_0.cloverRec.CT[1324]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1324]==0&false)))
		{{
			__CLOVER_60_0.cloverRec.S[3755]++;res=false;
		}
		}else
		{{
			__CLOVER_60_0.cloverRec.S[3756]++;boolean tab[];
			__CLOVER_60_0.cloverRec.S[3757]++;int i,j,len,no1,no2;
			__CLOVER_60_0.cloverRec.S[3758]++;Vector liste,liste_tete,liste2,v,v2;
			__CLOVER_60_0.cloverRec.S[3759]++;Classe classe_de,classe_ancetre;
			__CLOVER_60_0.cloverRec.S[3760]++;Heritage liste_heritage[],heritage;
			// determination des classes pour le chemin
			// entre de et ancetre
			__CLOVER_60_0.cloverRec.S[3761]++;len=table_heritage.length;
			__CLOVER_60_0.cloverRec.S[3762]++;classe_de=cherche_classe(de);
			__CLOVER_60_0.cloverRec.S[3763]++;classe_ancetre=cherche_classe(ancetre);
			assert((((classe_de!=null)) && (++__CLOVER_60_0.cloverRec.CT[1325]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1325]==0&false));
			assert((((classe_ancetre!=null)) && (++__CLOVER_60_0.cloverRec.CT[1326]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1326]==0&false));
			__CLOVER_60_0.cloverRec.S[3764]++;tab=new boolean[len];
			__CLOVER_60_0.cloverRec.S[3765]++;no1=no_classe(classe_de);
			__CLOVER_60_0.cloverRec.S[3766]++;no2=no_classe(classe_ancetre);
			assert((((no1!=-1)) && (++__CLOVER_60_0.cloverRec.CT[1327]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1327]==0&false));
			assert((((no2!=-1)) && (++__CLOVER_60_0.cloverRec.CT[1328]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1328]==0&false));
			__CLOVER_60_0.cloverRec.S[3767]++;for(i=0;(((i<tab.length) && (++__CLOVER_60_0.cloverRec.CT[1329]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1329]==0&false));i++)
			{{
				__CLOVER_60_0.cloverRec.S[3768]++;tab[i]=table_heritage[no1][i]&&
						table_heritage[i][no2];
			}
			}__CLOVER_60_0.cloverRec.S[3769]++;tab[no2]=true;
			__CLOVER_60_0.cloverRec.S[3770]++;liste=chemins_ancetre(no2,no1,tab);
			__CLOVER_60_0.cloverRec.S[3771]++;System.out.println("de="+donne_type(de)+";ancetre="+donne_type(ancetre));
			assert((((liste.size()>0)) && (++__CLOVER_60_0.cloverRec.CT[1330]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1330]==0&false)):"no1="+no1+";no2="+no2+";"+tab[5];
			__CLOVER_60_0.cloverRec.S[3772]++;for(i=0;(((i<liste.size()) && (++__CLOVER_60_0.cloverRec.CT[1331]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1331]==0&false));i++)
			{{
				__CLOVER_60_0.cloverRec.S[3773]++;Couple c;
				__CLOVER_60_0.cloverRec.S[3774]++;v=(Vector)liste.elementAt(i);
				__CLOVER_60_0.cloverRec.S[3775]++;System.out.print(i+"={");
				__CLOVER_60_0.cloverRec.S[3776]++;for(j=0;(((j<v.size()) && (++__CLOVER_60_0.cloverRec.CT[1332]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1332]==0&false));j++)
				{{
					__CLOVER_60_0.cloverRec.S[3777]++;c=(Couple)v.elementAt(j);
					__CLOVER_60_0.cloverRec.S[3778]++;if((((j>0) && (++__CLOVER_60_0.cloverRec.CT[1333]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1333]==0&false)))
						{__CLOVER_60_0.cloverRec.S[3779]++;System.out.print(",");
					}__CLOVER_60_0.cloverRec.S[3780]++;System.out.print(c.classe.type+"(");
					__CLOVER_60_0.cloverRec.S[3781]++;System.out.print((((((c.conversion!=null)) && (++__CLOVER_60_0.cloverRec.CT[1334]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1334]==0&false))?(c.conversion.toString()+"-"+c.classe.type):"null")+",");
					assert((((c.classe!=null)) && (++__CLOVER_60_0.cloverRec.CT[1335]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1335]==0&false));
					//assert(c.classe.heritage!=null);
					//assert(c.classe.heritage[c.no].type!=null);
					__CLOVER_60_0.cloverRec.S[3782]++;System.out.print((((((c.no!=-1&&c.classe.heritage!=null)) && (++__CLOVER_60_0.cloverRec.CT[1336]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1336]==0&false))?c.classe.heritage[c.no].type.toString():"null")+")");
				}
				}__CLOVER_60_0.cloverRec.S[3783]++;System.out.println("}");
			}
			// construction des conversions en fonction des chemins
			}__CLOVER_60_0.cloverRec.S[3784]++;liste2=new Vector();
			__CLOVER_60_0.cloverRec.S[3785]++;for(i=0;(((i<liste.size()) && (++__CLOVER_60_0.cloverRec.CT[1337]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1337]==0&false));i++)
			{{
				__CLOVER_60_0.cloverRec.S[3786]++;Type t=null;
				__CLOVER_60_0.cloverRec.S[3787]++;Couple c;
				__CLOVER_60_0.cloverRec.S[3788]++;Conversion conv;
				__CLOVER_60_0.cloverRec.S[3789]++;v=(Vector)liste.elementAt(i);
				assert((((v.size()>=1)) && (++__CLOVER_60_0.cloverRec.CT[1338]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1338]==0&false)):"taille="+v.size()+";"+i;
				__CLOVER_60_0.cloverRec.S[3790]++;c=(Couple)v.elementAt(0);
				__CLOVER_60_0.cloverRec.S[3791]++;t=c.classe.type;
				__CLOVER_60_0.cloverRec.S[3792]++;t=de;
				//conv=new Conversion(de,t);//&\u00e9"'(-\u00e8
				__CLOVER_60_0.cloverRec.S[3793]++;System.out.println("conversion de "+donne_type(t));
				__CLOVER_60_0.cloverRec.S[3794]++;for(j=1;(((j<v.size()) && (++__CLOVER_60_0.cloverRec.CT[1339]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1339]==0&false));j++)
				{{// TODO: utiliser la concatenation de conversion
					__CLOVER_60_0.cloverRec.S[3795]++;c=(Couple)v.elementAt(j);
					__CLOVER_60_0.cloverRec.S[3796]++;System.out.println("j="+j);
					//if(t==null)
					//	t=c.classe.type;
					//else
						//t=c.conversion.convertie_inv(t);
					__CLOVER_60_0.cloverRec.S[3797]++;t=c.conversion.convertie2(t);
					__CLOVER_60_0.cloverRec.S[3798]++;System.out.println("->"+donne_type(t)+
										"("+c.conversion+")");
				}
				}assert((((t!=null)) && (++__CLOVER_60_0.cloverRec.CT[1340]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1340]==0&false));
				__CLOVER_60_0.cloverRec.S[3799]++;liste2.addElement(t);
			}
			}__CLOVER_60_0.cloverRec.S[3800]++;System.out.println("resultat=");
			__CLOVER_60_0.cloverRec.S[3801]++;for(i=0;(((i<liste2.size()) && (++__CLOVER_60_0.cloverRec.CT[1341]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1341]==0&false));i++)
			{{
				__CLOVER_60_0.cloverRec.S[3802]++;Type t;
				__CLOVER_60_0.cloverRec.S[3803]++;t=(Type)liste2.elementAt(i);
				__CLOVER_60_0.cloverRec.S[3804]++;System.out.println(i+"={"+donne_type(t)+"}");
			}
			// verification si une des conversion donne ancetre
			}__CLOVER_60_0.cloverRec.S[3805]++;if((((liste2.size()==0) && (++__CLOVER_60_0.cloverRec.CT[1342]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1342]==0&false)))
				{__CLOVER_60_0.cloverRec.S[3806]++;res=false;
			}else
			{{
				__CLOVER_60_0.cloverRec.S[3807]++;Type type1,type2,type3;
				__CLOVER_60_0.cloverRec.S[3808]++;boolean type_compatible=false;
				__CLOVER_60_0.cloverRec.S[3809]++;for(i=0;(((!type_compatible&&i<liste2.size()) && (++__CLOVER_60_0.cloverRec.CT[1343]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1343]==0&false));i++)
				{{
					__CLOVER_60_0.cloverRec.S[3810]++;type1=(Type)liste2.elementAt(i);
					__CLOVER_60_0.cloverRec.S[3811]++;if((((type1.generique!=null&&
							type1.generique.length==ancetre.generique.length) && (++__CLOVER_60_0.cloverRec.CT[1344]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1344]==0&false)))
					{{
						__CLOVER_60_0.cloverRec.S[3812]++;boolean pb=false;
						__CLOVER_60_0.cloverRec.S[3813]++;for(j=0;(((!pb&&j<type1.generique.length) && (++__CLOVER_60_0.cloverRec.CT[1345]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1345]==0&false));j++)
						{{
							__CLOVER_60_0.cloverRec.S[3814]++;type2=type1.generique[j];
							__CLOVER_60_0.cloverRec.S[3815]++;type3=ancetre.generique[j];
							__CLOVER_60_0.cloverRec.S[3816]++;if((((!type_compatible(type2,t2,type3,t2)) && (++__CLOVER_60_0.cloverRec.CT[1346]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1346]==0&false)))
							{{
								__CLOVER_60_0.cloverRec.S[3817]++;pb=true;
							}
						}}
						}__CLOVER_60_0.cloverRec.S[3818]++;if((((!pb) && (++__CLOVER_60_0.cloverRec.CT[1347]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1347]==0&false)))
							{__CLOVER_60_0.cloverRec.S[3819]++;type_compatible=true;
					}}
				}}
				}__CLOVER_60_0.cloverRec.S[3820]++;System.out.println("Type parametre:"+res+":"+type_compatible);
				__CLOVER_60_0.cloverRec.S[3821]++;res=type_compatible;
			}
		}}
		}}__CLOVER_60_0.cloverRec.S[3822]++;System.out.println("Fin parametre type:"+
							donne_type(de)+"->"+
							donne_type(ancetre)+":"+res);
		__CLOVER_60_0.cloverRec.S[3823]++;return res;
	}
	
	public String donne_type(Type t)
	{__CLOVER_60_0.cloverRec.M[399]++;
		assert((((t!=null)) && (++__CLOVER_60_0.cloverRec.CT[1348]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1348]==0&false));
		__CLOVER_60_0.cloverRec.S[3824]++;String res;
		__CLOVER_60_0.cloverRec.S[3825]++;if((((t.is_like) && (++__CLOVER_60_0.cloverRec.CT[1349]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1349]==0&false)))
		{{
			__CLOVER_60_0.cloverRec.S[3826]++;res=t.toString();
		}
		}else
		{{
			__CLOVER_60_0.cloverRec.S[3827]++;res=t.nom;
			__CLOVER_60_0.cloverRec.S[3828]++;if((((t.generique!=null&&t.generique.length>0) && (++__CLOVER_60_0.cloverRec.CT[1350]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1350]==0&false)))
			{{
				__CLOVER_60_0.cloverRec.S[3829]++;res+="[";
				__CLOVER_60_0.cloverRec.S[3830]++;for(int i=0;(((i<t.generique.length) && (++__CLOVER_60_0.cloverRec.CT[1351]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1351]==0&false));i++)
				{{
					__CLOVER_60_0.cloverRec.S[3831]++;if((((i>0) && (++__CLOVER_60_0.cloverRec.CT[1352]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1352]==0&false)))
						{__CLOVER_60_0.cloverRec.S[3832]++;res+=",";
					}__CLOVER_60_0.cloverRec.S[3833]++;res+=donne_type(t.generique[i]);
				}
				}__CLOVER_60_0.cloverRec.S[3834]++;res+="]";
			}
		}}
		}__CLOVER_60_0.cloverRec.S[3835]++;return res;
	}
	
	//	construction du chemin de de vers ancetre
	public Vector chemins_ancetre(int no2,int no1,
									boolean tab[])
	{__CLOVER_60_0.cloverRec.M[400]++;
		__CLOVER_60_0.cloverRec.S[3836]++;Vector v,liste,liste_tete,liste2;
		__CLOVER_60_0.cloverRec.S[3837]++;int i,j,m=0;
		__CLOVER_60_0.cloverRec.S[3838]++;Classe classe_de;
		assert((((no2>=0)) && (++__CLOVER_60_0.cloverRec.CT[1353]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1353]==0&false));
		assert((((no1>=0)) && (++__CLOVER_60_0.cloverRec.CT[1354]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1354]==0&false));
		assert((((tab!=null)) && (++__CLOVER_60_0.cloverRec.CT[1355]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1355]==0&false));
		__CLOVER_60_0.cloverRec.S[3839]++;v=new Vector();
		__CLOVER_60_0.cloverRec.S[3840]++;classe_de=(Classe)liste_classe.elementAt(no1);
		// table_symbol[no1].table_conversion[0]
		__CLOVER_60_0.cloverRec.S[3841]++;v.addElement(new Couple(classe_de,0,null));
		__CLOVER_60_0.cloverRec.S[3842]++;liste=new Vector();
		__CLOVER_60_0.cloverRec.S[3843]++;liste.addElement(v);
		__CLOVER_60_0.cloverRec.S[3844]++;liste_tete=liste_ancetre(classe_de,tab);
		__CLOVER_60_0.cloverRec.S[3845]++;while(true)
		{{// tant que pas fini
			__CLOVER_60_0.cloverRec.S[3846]++;Classe cl;
			__CLOVER_60_0.cloverRec.S[3847]++;Vector l;
			__CLOVER_60_0.cloverRec.S[3848]++;int k;
			__CLOVER_60_0.cloverRec.S[3849]++;Couple couple;
			__CLOVER_60_0.cloverRec.S[3850]++;System.out.println("iteration "+m);
			__CLOVER_60_0.cloverRec.S[3851]++;for(int m0=0;(((m0<liste.size()) && (++__CLOVER_60_0.cloverRec.CT[1356]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1356]==0&false));m0++)
			{{
				__CLOVER_60_0.cloverRec.S[3852]++;v=(Vector)liste.elementAt(m0);
				assert((((v.size()>0)) && (++__CLOVER_60_0.cloverRec.CT[1357]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1357]==0&false));
				__CLOVER_60_0.cloverRec.S[3853]++;for(int m1=0;(((m1<v.size()) && (++__CLOVER_60_0.cloverRec.CT[1358]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1358]==0&false));m1++)
				{{
					__CLOVER_60_0.cloverRec.S[3854]++;if((((m1>0) && (++__CLOVER_60_0.cloverRec.CT[1359]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1359]==0&false)))
						{__CLOVER_60_0.cloverRec.S[3855]++;System.out.println("->");
					}__CLOVER_60_0.cloverRec.S[3856]++;couple=(Couple)v.elementAt(m1);
					__CLOVER_60_0.cloverRec.S[3857]++;System.out.print(couple.classe.type);
				}
				}__CLOVER_60_0.cloverRec.S[3858]++;System.out.println("");
			}
			}__CLOVER_60_0.cloverRec.S[3859]++;System.out.println("--------------------");
			__CLOVER_60_0.cloverRec.S[3860]++;liste2=new Vector();
			// construction de la portion suivante
			// des chemins
			__CLOVER_60_0.cloverRec.S[3861]++;for(i=0;(((i<liste.size()) && (++__CLOVER_60_0.cloverRec.CT[1360]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1360]==0&false));i++)
			{{
				__CLOVER_60_0.cloverRec.S[3862]++;l=((Vector)liste.elementAt(i));
				__CLOVER_60_0.cloverRec.S[3863]++;cl=((Couple)l.lastElement()).classe;
				__CLOVER_60_0.cloverRec.S[3864]++;if((((no_classe(cl)!=no2) && (++__CLOVER_60_0.cloverRec.CT[1361]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1361]==0&false)))
				{{// le chemin n'est pas fini
					__CLOVER_60_0.cloverRec.S[3865]++;liste_tete=liste_ancetre(cl,tab);
					__CLOVER_60_0.cloverRec.S[3866]++;System.out.println(":::::"+liste_tete.size());
					// ajout dans liste2 des nouveaux chemins
					__CLOVER_60_0.cloverRec.S[3867]++;for(j=0;(((j<liste_tete.size()) && (++__CLOVER_60_0.cloverRec.CT[1362]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1362]==0&false));j++)
					{{
						// copie du vecteur l
						__CLOVER_60_0.cloverRec.S[3868]++;v=new Vector();
						__CLOVER_60_0.cloverRec.S[3869]++;for(k=0;(((k<l.size()) && (++__CLOVER_60_0.cloverRec.CT[1363]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1363]==0&false));k++)
						{{
							__CLOVER_60_0.cloverRec.S[3870]++;v.addElement(l.elementAt(k));
						}
						}__CLOVER_60_0.cloverRec.S[3871]++;v.addElement(liste_tete.elementAt(j));
						__CLOVER_60_0.cloverRec.S[3872]++;liste2.addElement(v);
					}
				}}
				}else
				{{// le chemin n'est pas fini
					__CLOVER_60_0.cloverRec.S[3873]++;liste2.addElement(l);
				}
			}}
			}__CLOVER_60_0.cloverRec.S[3874]++;liste=liste2;
			__CLOVER_60_0.cloverRec.S[3875]++;System.out.println("##################");
			__CLOVER_60_0.cloverRec.S[3876]++;if((((liste.size()==0) && (++__CLOVER_60_0.cloverRec.CT[1364]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1364]==0&false)))
			{{// plus de chemin
				__CLOVER_60_0.cloverRec.S[3877]++;break;
			}
			}__CLOVER_60_0.cloverRec.S[3878]++;System.out.println("!!!!!!!!!!!!!!!!");
			// recherche si tous les chemins sont termin\u00e9 
			__CLOVER_60_0.cloverRec.S[3879]++;for(i=0;(((i<liste.size()) && (++__CLOVER_60_0.cloverRec.CT[1365]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1365]==0&false));i++)
			{{
				__CLOVER_60_0.cloverRec.S[3880]++;v=(Vector)liste.elementAt(i);
				__CLOVER_60_0.cloverRec.S[3881]++;couple=(Couple)v.lastElement();
				__CLOVER_60_0.cloverRec.S[3882]++;if((((no_classe(couple.classe)!=no2) && (++__CLOVER_60_0.cloverRec.CT[1366]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1366]==0&false)))
					{__CLOVER_60_0.cloverRec.S[3883]++;break;
			}}
			}__CLOVER_60_0.cloverRec.S[3884]++;System.out.println("**************");
			__CLOVER_60_0.cloverRec.S[3885]++;if((((i>=liste.size()) && (++__CLOVER_60_0.cloverRec.CT[1367]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1367]==0&false)))
				{__CLOVER_60_0.cloverRec.S[3886]++;break;
			}__CLOVER_60_0.cloverRec.S[3887]++;System.out.println("++++++++++++");
		}
		}__CLOVER_60_0.cloverRec.S[3888]++;return liste;
	}
	
	public Vector liste_ancetre(Classe classe,boolean tab[])
	{__CLOVER_60_0.cloverRec.M[401]++;
		assert((((classe!=null)) && (++__CLOVER_60_0.cloverRec.CT[1368]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1368]==0&false));
		__CLOVER_60_0.cloverRec.S[3889]++;Vector liste_tete;
		__CLOVER_60_0.cloverRec.S[3890]++;Heritage liste_heritage[],heritage;
		__CLOVER_60_0.cloverRec.S[3891]++;int i,j;
		__CLOVER_60_0.cloverRec.S[3892]++;Classe cl;
		__CLOVER_60_0.cloverRec.S[3893]++;Table_Symbol table;
		__CLOVER_60_0.cloverRec.S[3894]++;Conversion conv;
		assert((((classe!=null)) && (++__CLOVER_60_0.cloverRec.CT[1369]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1369]==0&false));
		assert((((tab!=null)) && (++__CLOVER_60_0.cloverRec.CT[1370]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1370]==0&false));
		__CLOVER_60_0.cloverRec.S[3895]++;liste_tete=new Vector();
		__CLOVER_60_0.cloverRec.S[3896]++;liste_heritage=classe.heritage;
		__CLOVER_60_0.cloverRec.S[3897]++;if((((liste_heritage!=null) && (++__CLOVER_60_0.cloverRec.CT[1371]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1371]==0&false)))
		{{
			__CLOVER_60_0.cloverRec.S[3898]++;for(i=0;(((i<liste_heritage.length) && (++__CLOVER_60_0.cloverRec.CT[1372]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1372]==0&false));i++)
			{{
				__CLOVER_60_0.cloverRec.S[3899]++;heritage=liste_heritage[i];
				assert((((heritage!=null)) && (++__CLOVER_60_0.cloverRec.CT[1373]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1373]==0&false));
				__CLOVER_60_0.cloverRec.S[3900]++;cl=cherche_classe(heritage.type);
				assert((((cl!=null)) && (++__CLOVER_60_0.cloverRec.CT[1374]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1374]==0&false));
				__CLOVER_60_0.cloverRec.S[3901]++;j=no_classe(cl);
				__CLOVER_60_0.cloverRec.S[3902]++;if((((tab[j]) && (++__CLOVER_60_0.cloverRec.CT[1375]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1375]==0&false)))
				{{
					__CLOVER_60_0.cloverRec.S[3903]++;table=this.donne_table_symbol(classe);
					//conv=table.table_conversion[i];
					__CLOVER_60_0.cloverRec.S[3904]++;conv=new Conversion(heritage,classe.type);
					__CLOVER_60_0.cloverRec.S[3905]++;liste_tete.addElement(new Couple(cl,i,conv));
				}
			}}
		}}
		}__CLOVER_60_0.cloverRec.S[3906]++;return liste_tete;
	}
	
	public boolean type_compatible(Type de,Table_Symbol t1,
									Type ancetre,Table_Symbol t2)
	{__CLOVER_60_0.cloverRec.M[402]++;// "de" dans la classe t1 est un sous type de 
		// "ancetre" de la classe t2
		// donc "de" est conforme a "ancetre"
		assert((((t1!=null)) && (++__CLOVER_60_0.cloverRec.CT[1376]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1376]==0&false));
		assert((((t2!=null)) && (++__CLOVER_60_0.cloverRec.CT[1377]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1377]==0&false));
		assert((((table_heritage!=null)) && (++__CLOVER_60_0.cloverRec.CT[1378]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1378]==0&false));
		__CLOVER_60_0.cloverRec.S[3907]++;System.out.println("conformite de:"+de.toString2()+
							" , ancetre:"+ancetre.toString2());
		__CLOVER_60_0.cloverRec.S[3908]++;if((((de==null||ancetre==null) && (++__CLOVER_60_0.cloverRec.CT[1379]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1379]==0&false)))
			{__CLOVER_60_0.cloverRec.S[3909]++;return false;
		}__CLOVER_60_0.cloverRec.S[3910]++;if((((de==ancetre) && (++__CLOVER_60_0.cloverRec.CT[1380]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1380]==0&false)))
			{__CLOVER_60_0.cloverRec.S[3911]++;return true;
		/*if(de.equals(a))
			return true;*/
		}__CLOVER_60_0.cloverRec.S[3912]++;int i,j;
		__CLOVER_60_0.cloverRec.S[3913]++;boolean res;
		/*de=t1.trouve_vrai_type(de);
		ancetre=t2.trouve_vrai_type(ancetre);
		assert(!de.is_like);
		assert(!ancetre.is_like);*/
		__CLOVER_60_0.cloverRec.S[3914]++;if((((!type_expanded(ancetre,t2)&&!de.is_like&&de.nom.equalsIgnoreCase("none")) && (++__CLOVER_60_0.cloverRec.CT[1381]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1381]==0&false)))
		{{// NONE est conforme a un type reference
			__CLOVER_60_0.cloverRec.S[3915]++;return true;
		}
		}else {__CLOVER_60_0.cloverRec.S[3916]++;if((((ancetre.is_like) && (++__CLOVER_60_0.cloverRec.CT[1382]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1382]==0&false)))
		{{
			__CLOVER_60_0.cloverRec.S[3917]++;System.out.println("like");
			__CLOVER_60_0.cloverRec.S[3918]++;if((((!de.is_like) && (++__CLOVER_60_0.cloverRec.CT[1383]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1383]==0&false)))
			{{
				__CLOVER_60_0.cloverRec.S[3919]++;if((((((Expr_Var)ancetre.like).nom.compareToIgnoreCase("current")==0) && (++__CLOVER_60_0.cloverRec.CT[1384]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1384]==0&false)))
				{{
					__CLOVER_60_0.cloverRec.S[3920]++;return type_compatible(de,t1,t2.classe.type,t2);
				}
				}else
				{{// TODO : verifier que c'est correcte dans tous les cas
					__CLOVER_60_0.cloverRec.S[3921]++;Type t;
					__CLOVER_60_0.cloverRec.S[3922]++;t=t2.trouve_vrai_type(ancetre);
					__CLOVER_60_0.cloverRec.S[3923]++;if((((t.is_like) && (++__CLOVER_60_0.cloverRec.CT[1385]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1385]==0&false)))
					{{// impossible de trouver le type reel
						__CLOVER_60_0.cloverRec.S[3924]++;return false;
					}
					}else
					{{
						__CLOVER_60_0.cloverRec.S[3925]++;return type_compatible(de,t1,t,t2);
					}
					//return false;
				}}
			}}
			}else
			{{
				__CLOVER_60_0.cloverRec.S[3926]++;if((((ancetre.like ==null||
					!(ancetre.like instanceof Expr_Var)||
					de.like==null||
					!(de.like instanceof Expr_Var)) && (++__CLOVER_60_0.cloverRec.CT[1386]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1386]==0&false)))
				{{
					__CLOVER_60_0.cloverRec.S[3927]++;return false;
				}
				}else
				{{
					__CLOVER_60_0.cloverRec.S[3928]++;Expr_Var v1,v2;
					__CLOVER_60_0.cloverRec.S[3929]++;v1=(Expr_Var)ancetre.like;
					__CLOVER_60_0.cloverRec.S[3930]++;v2=(Expr_Var)de.like;
					__CLOVER_60_0.cloverRec.S[3931]++;return meme_entite(v1.nom,t1,v2.nom,t2);
				}
			}}
		}}
		}else {__CLOVER_60_0.cloverRec.S[3932]++;if((((type_expanded(ancetre,t2)) && (++__CLOVER_60_0.cloverRec.CT[1387]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1387]==0&false)))//||type_expanded(de,t1)
		{{// la cible est expanded
			__CLOVER_60_0.cloverRec.S[3933]++;System.out.println("expanded");
			__CLOVER_60_0.cloverRec.S[3934]++;if((((de.is_like) && (++__CLOVER_60_0.cloverRec.CT[1388]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1388]==0&false)))
			{{
				__CLOVER_60_0.cloverRec.S[3935]++;de=t1.trouve_vrai_type(de);
				__CLOVER_60_0.cloverRec.S[3936]++;System.out.println("vrai type="+de+"("+t1.classe.nom+")");
			}
			}__CLOVER_60_0.cloverRec.S[3937]++;if((((t1.type_generique(de)) && (++__CLOVER_60_0.cloverRec.CT[1389]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1389]==0&false)))
			{{
				__CLOVER_60_0.cloverRec.S[3938]++;de=t1.contrainte(de);
				__CLOVER_60_0.cloverRec.S[3939]++;if((((de==null) && (++__CLOVER_60_0.cloverRec.CT[1390]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1390]==0&false)))
					{__CLOVER_60_0.cloverRec.S[3940]++;de=new TypeSimple(false,"ANY",new Vector());
			}}
			}__CLOVER_60_0.cloverRec.S[3941]++;if((((type_expanded(de,t1)) && (++__CLOVER_60_0.cloverRec.CT[1391]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1391]==0&false)))
			{{
				__CLOVER_60_0.cloverRec.S[3942]++;if((((ancetre.nom.compareToIgnoreCase("real")==0&&
					de.nom.compareToIgnoreCase("integer")==0) && (++__CLOVER_60_0.cloverRec.CT[1392]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1392]==0&false)))
					{__CLOVER_60_0.cloverRec.S[3943]++;return true;
				}__CLOVER_60_0.cloverRec.S[3944]++;if((((ancetre.nom.compareToIgnoreCase("double")==0&&
					(de.nom.compareToIgnoreCase("real")==0||
					de.nom.compareToIgnoreCase("integer")==0)) && (++__CLOVER_60_0.cloverRec.CT[1393]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1393]==0&false)))
					{__CLOVER_60_0.cloverRec.S[3945]++;return true;
				}__CLOVER_60_0.cloverRec.S[3946]++;res=type_egaux(de,t1,ancetre,t2);
				__CLOVER_60_0.cloverRec.S[3947]++;System.out.println("Exp:=Exp : "+res);
				__CLOVER_60_0.cloverRec.S[3948]++;return res;
			}
			}else
			{{
				__CLOVER_60_0.cloverRec.S[3949]++;res=type_egaux(de,t1,ancetre,t2);
				__CLOVER_60_0.cloverRec.S[3950]++;System.out.println("Exp:=Ref : "+res);
				__CLOVER_60_0.cloverRec.S[3951]++;return res;
			}
		}}
		}else {__CLOVER_60_0.cloverRec.S[3952]++;if((((!t2.type_generique(ancetre)) && (++__CLOVER_60_0.cloverRec.CT[1394]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1394]==0&false)))
		{{// la cible est une reference
			__CLOVER_60_0.cloverRec.S[3953]++;System.out.println("ref");
			__CLOVER_60_0.cloverRec.S[3954]++;if((((de.is_like) && (++__CLOVER_60_0.cloverRec.CT[1395]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1395]==0&false)))
			{{
				__CLOVER_60_0.cloverRec.S[3955]++;de=t1.trouve_vrai_type(de);
				assert((((de!=null)) && (++__CLOVER_60_0.cloverRec.CT[1396]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1396]==0&false)):"nom="+t1.classe.nom;
			}
			}__CLOVER_60_0.cloverRec.S[3956]++;res=type_egaux(de,t1,ancetre,t2);
			__CLOVER_60_0.cloverRec.S[3957]++;if((((!res) && (++__CLOVER_60_0.cloverRec.CT[1397]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1397]==0&false)))
			{{
				__CLOVER_60_0.cloverRec.S[3958]++;System.out.println("type de="+de.toString2());
				__CLOVER_60_0.cloverRec.S[3959]++;if((((t1.type_generique(de)) && (++__CLOVER_60_0.cloverRec.CT[1398]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1398]==0&false)))
				{{// de est un generique
					__CLOVER_60_0.cloverRec.S[3960]++;Type contrainte_de;
					__CLOVER_60_0.cloverRec.S[3961]++;de=t1.contrainte(de);
					__CLOVER_60_0.cloverRec.S[3962]++;if((((de==null) && (++__CLOVER_60_0.cloverRec.CT[1399]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1399]==0&false)))
						{__CLOVER_60_0.cloverRec.S[3963]++;de=new TypeSimple(false,"any",new Vector());
					}__CLOVER_60_0.cloverRec.S[3964]++;res=type_egaux(de,t1,ancetre,t2);
				}
				}__CLOVER_60_0.cloverRec.S[3965]++;if((((!res) && (++__CLOVER_60_0.cloverRec.CT[1400]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1400]==0&false)))
				{{
					__CLOVER_60_0.cloverRec.S[3966]++;res=type_ancetre(de,t1,ancetre,t2);//no_classe(cherche_classe(de))
					__CLOVER_60_0.cloverRec.S[3967]++;System.out.println("coucou2="+de.toString2()+"?="+ancetre.toString2()+"!" +
							no_classe(cherche_classe(de))+":"+
							no_classe(cherche_classe(ancetre)));
					__CLOVER_60_0.cloverRec.S[3968]++;if((((res) && (++__CLOVER_60_0.cloverRec.CT[1401]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1401]==0&false)))
					{{
						__CLOVER_60_0.cloverRec.S[3969]++;System.out.println("coucou");
						__CLOVER_60_0.cloverRec.S[3970]++;res=parametre_compatible(de,t1,ancetre,t2);
						__CLOVER_60_0.cloverRec.S[3971]++;System.out.println("res="+res);
					}
				}}
			}}
			}__CLOVER_60_0.cloverRec.S[3972]++;System.out.println("Ref:=* : "+res);
			__CLOVER_60_0.cloverRec.S[3973]++;return res;
		}
		}else {__CLOVER_60_0.cloverRec.S[3974]++;if((((t2.type_generique(ancetre)) && (++__CLOVER_60_0.cloverRec.CT[1402]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1402]==0&false)))
		{{// cible generique 
			// TODO: prendre en compte la contrainte ? 
			__CLOVER_60_0.cloverRec.S[3975]++;System.out.println("generique");
			assert((((de.nom!=null)) && (++__CLOVER_60_0.cloverRec.CT[1403]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1403]==0&false)):"pos="+de.debut();
			__CLOVER_60_0.cloverRec.S[3976]++;if((((de.nom.compareToIgnoreCase(ancetre.nom)==0&&
				t1==t2) && (++__CLOVER_60_0.cloverRec.CT[1404]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1404]==0&false)))
			{{// c'est le meme generique
				__CLOVER_60_0.cloverRec.S[3977]++;return true;
			}
			}else
			{{
				__CLOVER_60_0.cloverRec.S[3978]++;return false;
			}
		}}
		}}}}}assert((((false)) && (++__CLOVER_60_0.cloverRec.CT[1405]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1405]==0&false));
		__CLOVER_60_0.cloverRec.S[3979]++;return false;
	}

	public Classe cherche_classe(Type t)
	{__CLOVER_60_0.cloverRec.M[403]++;
		__CLOVER_60_0.cloverRec.S[3980]++;int i;
		__CLOVER_60_0.cloverRec.S[3981]++;Classe c;

		__CLOVER_60_0.cloverRec.S[3982]++;for(i=0;(((i<liste_classe.size()) && (++__CLOVER_60_0.cloverRec.CT[1406]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1406]==0&false));i++)
		{{
			__CLOVER_60_0.cloverRec.S[3983]++;c=(Classe)liste_classe.elementAt(i);
			__CLOVER_60_0.cloverRec.S[3984]++;if((((c.deType(t)) && (++__CLOVER_60_0.cloverRec.CT[1407]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1407]==0&false)))
				{__CLOVER_60_0.cloverRec.S[3985]++;return c;
		}}
		}__CLOVER_60_0.cloverRec.S[3986]++;return null;
	}

	public Type cherche_type(Classe c)
	{__CLOVER_60_0.cloverRec.M[404]++;
	  __CLOVER_60_0.cloverRec.S[3987]++;int i;
	  __CLOVER_60_0.cloverRec.S[3988]++;Type t;

	  __CLOVER_60_0.cloverRec.S[3989]++;for(i=0;(((i<liste_type.size()) && (++__CLOVER_60_0.cloverRec.CT[1408]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1408]==0&false));i++)
	  {{
	    __CLOVER_60_0.cloverRec.S[3990]++;t=(Type)liste_type.elementAt(i);
	    __CLOVER_60_0.cloverRec.S[3991]++;if((((c.deType(t)) && (++__CLOVER_60_0.cloverRec.CT[1409]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1409]==0&false)))
	      {__CLOVER_60_0.cloverRec.S[3992]++;return t;
	  }}
	  }__CLOVER_60_0.cloverRec.S[3993]++;return null;
	}

  	public int no_classe(Classe c)
	{__CLOVER_60_0.cloverRec.M[405]++;
		__CLOVER_60_0.cloverRec.S[3994]++;int i;

		__CLOVER_60_0.cloverRec.S[3995]++;for(i=0;(((i<liste_classe.size()) && (++__CLOVER_60_0.cloverRec.CT[1410]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1410]==0&false));i++)
		{{
			__CLOVER_60_0.cloverRec.S[3996]++;if((((liste_classe.elementAt(i).equals(c)) && (++__CLOVER_60_0.cloverRec.CT[1411]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1411]==0&false)))
				{__CLOVER_60_0.cloverRec.S[3997]++;return i;
		}}

		}__CLOVER_60_0.cloverRec.S[3998]++;return -1;
	}

	public Attribut donne_attribut(String nom)
	{__CLOVER_60_0.cloverRec.M[406]++;
		__CLOVER_60_0.cloverRec.S[3999]++;int i,j;
		__CLOVER_60_0.cloverRec.S[4000]++;Attribut a1,a2;
		//Classe c=classe_courante;

		assert((((false)) && (++__CLOVER_60_0.cloverRec.CT[1412]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1412]==0&false));

		__CLOVER_60_0.cloverRec.S[4001]++;return null;
	}

	/*public Attribut_Complet donne_attribut(String nom,ast.Classe c)
	{
		assert(nom!=null);
		assert(c!=null);
		return donne_attribut(new NomFeature(nom),c);
	}*/
	
	public Attribut_Complet donne_attribut(NomFeature nom,/*ast.*/Classe c)
	{__CLOVER_60_0.cloverRec.M[407]++;
		__CLOVER_60_0.cloverRec.S[4002]++;int i,j;
		__CLOVER_60_0.cloverRec.S[4003]++;Attribut a1,a2;
		//Classe c=classe_courante;
		assert((((c!=null)) && (++__CLOVER_60_0.cloverRec.CT[1413]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1413]==0&false));
		assert((((nom!=null)) && (++__CLOVER_60_0.cloverRec.CT[1414]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1414]==0&false));
		//assert(false);
        //if(c==null)
		//	return null;
		__CLOVER_60_0.cloverRec.S[4004]++;Table_Symbol table=donne_table_symbol(c);
		__CLOVER_60_0.cloverRec.S[4005]++;i=table.no_attribut(nom);
		__CLOVER_60_0.cloverRec.S[4006]++;if((((i==-1) && (++__CLOVER_60_0.cloverRec.CT[1415]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1415]==0&false)))
			{__CLOVER_60_0.cloverRec.S[4007]++;return null;
		}assert((((i>=0&&i<table.liste_attribut.length)) && (++__CLOVER_60_0.cloverRec.CT[1416]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1416]==0&false)):"i="+i+
					",len="+table.liste_attribut.length;
		assert((((table.liste_attribut!=null)) && (++__CLOVER_60_0.cloverRec.CT[1417]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1417]==0&false));
		assert((((i>=0&&i<table.liste_attribut.length)) && (++__CLOVER_60_0.cloverRec.CT[1418]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1418]==0&false)):"i="+i;
		__CLOVER_60_0.cloverRec.S[4008]++;return table.liste_attribut[i];
	}

	public DeclareVar cherche_var(String nom,DeclareVar liste[])
	{__CLOVER_60_0.cloverRec.M[408]++;
		__CLOVER_60_0.cloverRec.S[4009]++;int i;

		__CLOVER_60_0.cloverRec.S[4010]++;if((((liste==null) && (++__CLOVER_60_0.cloverRec.CT[1419]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1419]==0&false)))
			{__CLOVER_60_0.cloverRec.S[4011]++;return null;

		}__CLOVER_60_0.cloverRec.S[4012]++;for(i=0;(((i<liste.length) && (++__CLOVER_60_0.cloverRec.CT[1420]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1420]==0&false));i++)
		{{
			__CLOVER_60_0.cloverRec.S[4013]++;if((((liste[i].nom.compareToIgnoreCase(nom)==0) && (++__CLOVER_60_0.cloverRec.CT[1421]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1421]==0&false)))
				{__CLOVER_60_0.cloverRec.S[4014]++;return liste[i];
		}}

		}__CLOVER_60_0.cloverRec.S[4015]++;return null;
	}

	public boolean est_constant(Table_Symbol table,Expr expr)
	{__CLOVER_60_0.cloverRec.M[409]++;
		assert((((table!=null)) && (++__CLOVER_60_0.cloverRec.CT[1422]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1422]==0&false));
		assert((((expr!=null)) && (++__CLOVER_60_0.cloverRec.CT[1423]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1423]==0&false));
		__CLOVER_60_0.cloverRec.S[4016]++;if(((((expr.op==Expr.MoinsU||expr.op==Expr.PlusU)&&
			((Expr_Unaire)expr).expr1!=null) && (++__CLOVER_60_0.cloverRec.CT[1424]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1424]==0&false)))
		{{
			__CLOVER_60_0.cloverRec.S[4017]++;Expr e=((Expr_Unaire)expr).expr1;
			__CLOVER_60_0.cloverRec.S[4018]++;if((((e instanceof Expr_Entier||e instanceof Expr_Reel) && (++__CLOVER_60_0.cloverRec.CT[1425]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1425]==0&false)))
				{__CLOVER_60_0.cloverRec.S[4019]++;return true;
		}}
		}__CLOVER_60_0.cloverRec.S[4020]++;if((((expr instanceof Expr_Entier||expr instanceof Expr_Car||
			expr instanceof Expr_Vrai||expr instanceof Expr_Faux||
			expr instanceof Expr_Chaine||expr instanceof Expr_Reel||
			expr instanceof Expr_Tableau) && (++__CLOVER_60_0.cloverRec.CT[1426]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1426]==0&false)))
			{__CLOVER_60_0.cloverRec.S[4021]++;return true;
		}__CLOVER_60_0.cloverRec.S[4022]++;if((((expr instanceof Expr_Var) && (++__CLOVER_60_0.cloverRec.CT[1427]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1427]==0&false)))
		{{
			__CLOVER_60_0.cloverRec.S[4023]++;Attribut_Complet ac;
			__CLOVER_60_0.cloverRec.S[4024]++;Expr_Var e=(Expr_Var)expr;
			__CLOVER_60_0.cloverRec.S[4025]++;ac=table.trouve_attribut(e.nom);
			__CLOVER_60_0.cloverRec.S[4026]++;if((((ac==null) && (++__CLOVER_60_0.cloverRec.CT[1428]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1428]==0&false)))
				{__CLOVER_60_0.cloverRec.S[4027]++;return false;
			}__CLOVER_60_0.cloverRec.S[4028]++;return ac.getFeature().est_constant();
			
		}
		}__CLOVER_60_0.cloverRec.S[4029]++;return false;
	}

	public boolean type_expanded(Type type,Table_Symbol table)
	{__CLOVER_60_0.cloverRec.M[410]++;
		assert((((type!=null)) && (++__CLOVER_60_0.cloverRec.CT[1429]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1429]==0&false));
		assert((((table!=null)) && (++__CLOVER_60_0.cloverRec.CT[1430]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1430]==0&false));
		__CLOVER_60_0.cloverRec.S[4030]++;type=table.trouve_vrai_type(type);
		__CLOVER_60_0.cloverRec.S[4031]++;if((((type.expanded) && (++__CLOVER_60_0.cloverRec.CT[1431]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1431]==0&false)))
			{__CLOVER_60_0.cloverRec.S[4032]++;return true;
		}__CLOVER_60_0.cloverRec.S[4033]++;Classe c=cherche_classe(type);
		__CLOVER_60_0.cloverRec.S[4034]++;if((((c==null) && (++__CLOVER_60_0.cloverRec.CT[1432]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1432]==0&false)))
		{{
			__CLOVER_60_0.cloverRec.S[4035]++;return false;
		}
		}__CLOVER_60_0.cloverRec.S[4036]++;if((((c.expanded) && (++__CLOVER_60_0.cloverRec.CT[1433]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1433]==0&false)))
			{__CLOVER_60_0.cloverRec.S[4037]++;return true;
		}else
			{__CLOVER_60_0.cloverRec.S[4038]++;return false;
	}}
	
	// retourne true ssi e est une variable assignable
	public boolean variable_assignable(String nom,Position pos)
	{__CLOVER_60_0.cloverRec.M[411]++;
		__CLOVER_60_0.cloverRec.S[4039]++;DeclareVar d[],d2;
		assert((((nom!=null)) && (++__CLOVER_60_0.cloverRec.CT[1434]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1434]==0&false));
		assert((((pos!=null)) && (++__CLOVER_60_0.cloverRec.CT[1435]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1435]==0&false));
		__CLOVER_60_0.cloverRec.S[4040]++;if((((nom.compareToIgnoreCase("current")==0) && (++__CLOVER_60_0.cloverRec.CT[1436]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1436]==0&false)))
			{__CLOVER_60_0.cloverRec.S[4041]++;return false;
		}__CLOVER_60_0.cloverRec.S[4042]++;if((((nom.compareToIgnoreCase("result")==0) && (++__CLOVER_60_0.cloverRec.CT[1437]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1437]==0&false)))
		{{
			__CLOVER_60_0.cloverRec.S[4043]++;if(/*feature_courante==null*/(((!compiler.env.dans_feature()||
				(//feature_courante!=null&&
				compiler.env.feature.type_retour/*feature_courante.type_retour*/==null)) && (++__CLOVER_60_0.cloverRec.CT[1438]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1438]==0&false)))
			{{
				__CLOVER_60_0.cloverRec.S[4044]++;erreur(new ErreurVEEN(compiler.env.classe/*classe_courante*/,nom,pos));
				__CLOVER_60_0.cloverRec.S[4045]++;return false;
			}
			}__CLOVER_60_0.cloverRec.S[4046]++;return true;
		}
		}__CLOVER_60_0.cloverRec.S[4047]++;if((((compiler.env.feature/*feature_courante*/ instanceof FeatureRoutine) && (++__CLOVER_60_0.cloverRec.CT[1439]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1439]==0&false)))
		{{
			__CLOVER_60_0.cloverRec.S[4048]++;FeatureRoutine f;
			__CLOVER_60_0.cloverRec.S[4049]++;f=((FeatureRoutine)/*feature_courante*/compiler.env.feature);
			__CLOVER_60_0.cloverRec.S[4050]++;d2=cherche_var(nom,f.local);
			__CLOVER_60_0.cloverRec.S[4051]++;if((((d2!=null) && (++__CLOVER_60_0.cloverRec.CT[1440]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1440]==0&false)))
				{__CLOVER_60_0.cloverRec.S[4052]++;return true;
		}}
		//d2=cherche_var(nom,feature_courante.param);
		//if(d2!=null)
		//	return true;
		}__CLOVER_60_0.cloverRec.S[4053]++;Attribut_Complet a=donne_attribut(new NomFeature(nom),compiler.env.classe/*classe_courante*/);
		//assert(a!=null);
		__CLOVER_60_0.cloverRec.S[4054]++;if((((a!=null) && (++__CLOVER_60_0.cloverRec.CT[1441]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1441]==0&false)))
		{{
			__CLOVER_60_0.cloverRec.S[4055]++;if((((a.getFeature() instanceof FeatureAttr) && (++__CLOVER_60_0.cloverRec.CT[1442]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1442]==0&false)))
				{__CLOVER_60_0.cloverRec.S[4056]++;return true;
			}else
				{__CLOVER_60_0.cloverRec.S[4057]++;return false;
		}}
		}__CLOVER_60_0.cloverRec.S[4058]++;return false;
	}

	public boolean var_existe(String nom)
	{__CLOVER_60_0.cloverRec.M[412]++;
		__CLOVER_60_0.cloverRec.S[4059]++;DeclareVar d[],d2;
		__CLOVER_60_0.cloverRec.S[4060]++;Classe c=compiler.env.classe;//classe_courante;
		__CLOVER_60_0.cloverRec.S[4061]++;Feature f=compiler.env.feature;//feature_courante;

		assert((((nom!=null)) && (++__CLOVER_60_0.cloverRec.CT[1443]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1443]==0&false));
		__CLOVER_60_0.cloverRec.S[4062]++;if((((nom.compareToIgnoreCase("result")==0) && (++__CLOVER_60_0.cloverRec.CT[1444]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1444]==0&false)))
		{{// le mot result
			//assert(false);
			__CLOVER_60_0.cloverRec.S[4063]++;if((((f.type_retour==null) && (++__CLOVER_60_0.cloverRec.CT[1445]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1445]==0&false)))
			{{
				//erreur("Result dans une feature sans type de retour");
				//erreur(new ErreurVEEN(c,nom,pos));
				__CLOVER_60_0.cloverRec.S[4064]++;return false;
			}
			}__CLOVER_60_0.cloverRec.S[4065]++;return true;
		}
		}else {__CLOVER_60_0.cloverRec.S[4066]++;if((((nom.compareToIgnoreCase("current")==0) && (++__CLOVER_60_0.cloverRec.CT[1446]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1446]==0&false)))
		{{// le mot current
		  __CLOVER_60_0.cloverRec.S[4067]++;return true;
		}
		}else {__CLOVER_60_0.cloverRec.S[4068]++;if((((f!=null&&
				(f instanceof FeatureRoutine||
				f instanceof FeatureDeferred||
				f instanceof FeatureExternal)) && (++__CLOVER_60_0.cloverRec.CT[1447]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1447]==0&false)))
		{{
			__CLOVER_60_0.cloverRec.S[4069]++;if((((f instanceof FeatureRoutine) && (++__CLOVER_60_0.cloverRec.CT[1448]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1448]==0&false)))
			{{// recherche parmis les variables locales
				__CLOVER_60_0.cloverRec.S[4070]++;d=((FeatureRoutine)f).local;
				__CLOVER_60_0.cloverRec.S[4071]++;d2=cherche_var(nom,d);
				__CLOVER_60_0.cloverRec.S[4072]++;if((((d2!=null) && (++__CLOVER_60_0.cloverRec.CT[1449]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1449]==0&false)))
					{__CLOVER_60_0.cloverRec.S[4073]++;return true;
			}}
			// recherche parmis les parametres
			}__CLOVER_60_0.cloverRec.S[4074]++;d=f.param;
			__CLOVER_60_0.cloverRec.S[4075]++;d2=cherche_var(nom,d);
			__CLOVER_60_0.cloverRec.S[4076]++;if((((d2!=null) && (++__CLOVER_60_0.cloverRec.CT[1450]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1450]==0&false)))
				{__CLOVER_60_0.cloverRec.S[4077]++;return true;
			
			// recherche parmis les attributs de la classe
			}__CLOVER_60_0.cloverRec.S[4078]++;Attribut_Complet a=donne_attribut(new NomFeature(nom),c);
			//assert(a!=null);
			__CLOVER_60_0.cloverRec.S[4079]++;if((((a!=null) && (++__CLOVER_60_0.cloverRec.CT[1451]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1451]==0&false)))
			{{
				__CLOVER_60_0.cloverRec.S[4080]++;return true;
			} 
		}}
		//assert(false);
		//erreur(new ErreurVEEN(c,nom,pos));
		}}}__CLOVER_60_0.cloverRec.S[4081]++;return false;
	}

	// =true ssi il a un type de retour
	public boolean est_variable(String nom)
	{__CLOVER_60_0.cloverRec.M[413]++;
		__CLOVER_60_0.cloverRec.S[4082]++;DeclareVar d[],d2;
		__CLOVER_60_0.cloverRec.S[4083]++;Classe c=compiler.env.classe;//classe_courante;
		__CLOVER_60_0.cloverRec.S[4084]++;Feature f=compiler.env.feature;//feature_courante;

		assert((((nom!=null)) && (++__CLOVER_60_0.cloverRec.CT[1452]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1452]==0&false));
		__CLOVER_60_0.cloverRec.S[4085]++;if((((!var_existe(nom)) && (++__CLOVER_60_0.cloverRec.CT[1453]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1453]==0&false)))
			{__CLOVER_60_0.cloverRec.S[4086]++;return false;
		}__CLOVER_60_0.cloverRec.S[4087]++;if((((nom.compareToIgnoreCase("result")==0) && (++__CLOVER_60_0.cloverRec.CT[1454]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1454]==0&false)))
		{{// le mot result
			//assert(false);
			__CLOVER_60_0.cloverRec.S[4088]++;if((((f.type_retour==null) && (++__CLOVER_60_0.cloverRec.CT[1455]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1455]==0&false)))
			{{
				//erreur("Result dans une feature sans type de retour");
				//erreur(new ErreurVEEN(c,nom,pos));
				__CLOVER_60_0.cloverRec.S[4089]++;return false;
			}
			}__CLOVER_60_0.cloverRec.S[4090]++;return true;
		}
		}else {__CLOVER_60_0.cloverRec.S[4091]++;if((((nom.compareToIgnoreCase("current")==0) && (++__CLOVER_60_0.cloverRec.CT[1456]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1456]==0&false)))
		{{// le mot current
		  __CLOVER_60_0.cloverRec.S[4092]++;return true;
		}
		}else {__CLOVER_60_0.cloverRec.S[4093]++;if((((f!=null&&
				(f instanceof FeatureRoutine||
				f instanceof FeatureDeferred||
				f instanceof FeatureExternal)) && (++__CLOVER_60_0.cloverRec.CT[1457]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1457]==0&false)))
		{{
			__CLOVER_60_0.cloverRec.S[4094]++;if((((f instanceof FeatureRoutine) && (++__CLOVER_60_0.cloverRec.CT[1458]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1458]==0&false)))
			{{// recherche parmis les variables locales
				__CLOVER_60_0.cloverRec.S[4095]++;d=((FeatureRoutine)f).local;
				__CLOVER_60_0.cloverRec.S[4096]++;d2=cherche_var(nom,d);
				__CLOVER_60_0.cloverRec.S[4097]++;if((((d2!=null) && (++__CLOVER_60_0.cloverRec.CT[1459]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1459]==0&false)))
					{__CLOVER_60_0.cloverRec.S[4098]++;return true;
			}}
			// recherche parmis les parametres
			}__CLOVER_60_0.cloverRec.S[4099]++;d=f.param;
			__CLOVER_60_0.cloverRec.S[4100]++;d2=cherche_var(nom,d);
			__CLOVER_60_0.cloverRec.S[4101]++;if((((d2!=null) && (++__CLOVER_60_0.cloverRec.CT[1460]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1460]==0&false)))
				{__CLOVER_60_0.cloverRec.S[4102]++;return true;
			
			// recherche parmis les attributs de la classe
			}__CLOVER_60_0.cloverRec.S[4103]++;Attribut_Complet a=donne_attribut(new NomFeature(nom),c);
			//assert(a!=null);
			__CLOVER_60_0.cloverRec.S[4104]++;if((((a!=null) && (++__CLOVER_60_0.cloverRec.CT[1461]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1461]==0&false)))
			{{
				__CLOVER_60_0.cloverRec.S[4105]++;if((((a.donne_type_retour(this)!=null) && (++__CLOVER_60_0.cloverRec.CT[1462]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1462]==0&false)))
					{__CLOVER_60_0.cloverRec.S[4106]++;return true;
			}} 
		}}
		//assert(false);
		//erreur(new ErreurVEEN(c,nom,pos));
		}}}__CLOVER_60_0.cloverRec.S[4107]++;return false;
	}

	public Declare_entite donne_entite(String nom,Position pos)
	{__CLOVER_60_0.cloverRec.M[414]++;
		__CLOVER_60_0.cloverRec.S[4108]++;DeclareVar d[],d2;
		__CLOVER_60_0.cloverRec.S[4109]++;Classe c=compiler.env.classe;//classe_courante;
		__CLOVER_60_0.cloverRec.S[4110]++;Feature f=compiler.env.feature;//feature_courante;
		__CLOVER_60_0.cloverRec.S[4111]++;Declare_entite entite;

		assert((((nom!=null)) && (++__CLOVER_60_0.cloverRec.CT[1463]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1463]==0&false));
		assert((((pos!=null)) && (++__CLOVER_60_0.cloverRec.CT[1464]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1464]==0&false));
		assert((((var_existe(nom))) && (++__CLOVER_60_0.cloverRec.CT[1465]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1465]==0&false));
	
		__CLOVER_60_0.cloverRec.S[4112]++;if((((nom.compareToIgnoreCase("result")==0) && (++__CLOVER_60_0.cloverRec.CT[1466]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1466]==0&false)))
		{{// le mot result
			//assert(false);
			__CLOVER_60_0.cloverRec.S[4113]++;if((((f.type_retour==null) && (++__CLOVER_60_0.cloverRec.CT[1467]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1467]==0&false)))
			{{
				//erreur("Result dans une feature sans type de retour");
				__CLOVER_60_0.cloverRec.S[4114]++;erreur(new ErreurVEEN(c,nom,pos));
				__CLOVER_60_0.cloverRec.S[4115]++;return null;
			}
			}__CLOVER_60_0.cloverRec.S[4116]++;entite=new DeclareVar(nom,f.type_retour);
			__CLOVER_60_0.cloverRec.S[4117]++;return entite;
		}
		}else {__CLOVER_60_0.cloverRec.S[4118]++;if((((nom.compareToIgnoreCase("current")==0) && (++__CLOVER_60_0.cloverRec.CT[1468]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1468]==0&false)))
		{{// le mot current
			__CLOVER_60_0.cloverRec.S[4119]++;entite=new DeclareVar(nom,cherche_type(c/*classe_courante*/));
			__CLOVER_60_0.cloverRec.S[4120]++;return entite;
		}
		}else {__CLOVER_60_0.cloverRec.S[4121]++;if((((f!=null&&
				(f instanceof FeatureRoutine||
				f instanceof FeatureDeferred||
				f instanceof FeatureExternal)) && (++__CLOVER_60_0.cloverRec.CT[1469]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1469]==0&false)))
		{{
			__CLOVER_60_0.cloverRec.S[4122]++;if((((f instanceof FeatureRoutine) && (++__CLOVER_60_0.cloverRec.CT[1470]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1470]==0&false)))
			{{// recherche parmis les variables locales
				__CLOVER_60_0.cloverRec.S[4123]++;d=((FeatureRoutine)f).local;
				__CLOVER_60_0.cloverRec.S[4124]++;d2=cherche_var(nom,d);
				__CLOVER_60_0.cloverRec.S[4125]++;if((((d2!=null) && (++__CLOVER_60_0.cloverRec.CT[1471]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1471]==0&false)))
					{__CLOVER_60_0.cloverRec.S[4126]++;return d2;
			}}
			// recherche parmis les parametres
			}__CLOVER_60_0.cloverRec.S[4127]++;d=f.param;
			__CLOVER_60_0.cloverRec.S[4128]++;d2=cherche_var(nom,d);
			__CLOVER_60_0.cloverRec.S[4129]++;if((((d2!=null) && (++__CLOVER_60_0.cloverRec.CT[1472]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1472]==0&false)))
				{__CLOVER_60_0.cloverRec.S[4130]++;return d2;
		
			// recherche parmis les attributs de la classe
			}__CLOVER_60_0.cloverRec.S[4131]++;Attribut_Complet a=donne_attribut(new NomFeature(nom),c);
			//assert(a!=null);
			__CLOVER_60_0.cloverRec.S[4132]++;if((((a!=null) && (++__CLOVER_60_0.cloverRec.CT[1473]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1473]==0&false)))
			{{
				__CLOVER_60_0.cloverRec.S[4133]++;return a;
				//Type t=a.donne_type_retour(this);
				//assert(t!=null);
				//return t;
			} 
		}}
		//assert(false);
		}}}__CLOVER_60_0.cloverRec.S[4134]++;erreur(new ErreurVEEN(c,nom,pos));
		__CLOVER_60_0.cloverRec.S[4135]++;return null;
	}

	public Type donne_type_var(String nom,Position pos)
	{__CLOVER_60_0.cloverRec.M[415]++;
		__CLOVER_60_0.cloverRec.S[4136]++;DeclareVar d[],d2;
		__CLOVER_60_0.cloverRec.S[4137]++;Classe c=compiler.env.classe;//classe_courante;
		__CLOVER_60_0.cloverRec.S[4138]++;Feature f=compiler.env.feature;//feature_courante;

		assert((((nom!=null)) && (++__CLOVER_60_0.cloverRec.CT[1474]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1474]==0&false));
		assert((((pos!=null)) && (++__CLOVER_60_0.cloverRec.CT[1475]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1475]==0&false));
		assert((((var_existe(nom))) && (++__CLOVER_60_0.cloverRec.CT[1476]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1476]==0&false));
		
		__CLOVER_60_0.cloverRec.S[4139]++;if((((nom.compareToIgnoreCase("result")==0) && (++__CLOVER_60_0.cloverRec.CT[1477]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1477]==0&false)))
		{{// le mot result
			//assert(false);
			__CLOVER_60_0.cloverRec.S[4140]++;if((((f.type_retour==null) && (++__CLOVER_60_0.cloverRec.CT[1478]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1478]==0&false)))
			{{
				//erreur("Result dans une feature sans type de retour");
				__CLOVER_60_0.cloverRec.S[4141]++;erreur(new ErreurVEEN(c,nom,pos));
				__CLOVER_60_0.cloverRec.S[4142]++;return null;
			}
			}__CLOVER_60_0.cloverRec.S[4143]++;return f.type_retour;
		}
		}else {__CLOVER_60_0.cloverRec.S[4144]++;if((((nom.compareToIgnoreCase("current")==0) && (++__CLOVER_60_0.cloverRec.CT[1479]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1479]==0&false)))
		{{// le mot current
		  __CLOVER_60_0.cloverRec.S[4145]++;return cherche_type(/*classe_courante*/c);
        }
		}else {__CLOVER_60_0.cloverRec.S[4146]++;if((((f!=null&&
				(f instanceof FeatureRoutine||
				f instanceof FeatureDeferred||
				f instanceof FeatureExternal)) && (++__CLOVER_60_0.cloverRec.CT[1480]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1480]==0&false)))
		{{
			__CLOVER_60_0.cloverRec.S[4147]++;if((((f instanceof FeatureRoutine) && (++__CLOVER_60_0.cloverRec.CT[1481]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1481]==0&false)))
			{{// recherche parmis les variables locales
				__CLOVER_60_0.cloverRec.S[4148]++;d=((FeatureRoutine)f).local;
				__CLOVER_60_0.cloverRec.S[4149]++;d2=cherche_var(nom,d);
				__CLOVER_60_0.cloverRec.S[4150]++;if((((d2!=null) && (++__CLOVER_60_0.cloverRec.CT[1482]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1482]==0&false)))
					{__CLOVER_60_0.cloverRec.S[4151]++;return d2.type;
			}}
			// recherche parmis les parametres
			}__CLOVER_60_0.cloverRec.S[4152]++;d=f.param;
			__CLOVER_60_0.cloverRec.S[4153]++;d2=cherche_var(nom,d);
			__CLOVER_60_0.cloverRec.S[4154]++;if((((d2!=null) && (++__CLOVER_60_0.cloverRec.CT[1483]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1483]==0&false)))
				{__CLOVER_60_0.cloverRec.S[4155]++;return d2.type;
			
			// recherche parmis les attributs de la classe
			}__CLOVER_60_0.cloverRec.S[4156]++;Attribut_Complet a=donne_attribut(new NomFeature(nom),c);
			//assert(a!=null);
			__CLOVER_60_0.cloverRec.S[4157]++;if((((a!=null) && (++__CLOVER_60_0.cloverRec.CT[1484]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1484]==0&false)))
			{{
				__CLOVER_60_0.cloverRec.S[4158]++;Type t=a.donne_type_retour(this);
				assert((((t!=null)) && (++__CLOVER_60_0.cloverRec.CT[1485]!=0|true)) || (++__CLOVER_60_0.cloverRec.CF[1485]==0&false));
				__CLOVER_60_0.cloverRec.S[4159]++;return t;
			} 
		}}
		//assert(false);
		}}}__CLOVER_60_0.cloverRec.S[4160]++;erreur(new ErreurVEEN(c,nom,pos));
		__CLOVER_60_0.cloverRec.S[4161]++;return null;
	}

	public void erreur(String t)
	{__CLOVER_60_0.cloverRec.M[416]++;
		__CLOVER_60_0.cloverRec.S[4162]++;logging.erreurMsg(t);
	}

	public void erreur(Erreur t)
	{__CLOVER_60_0.cloverRec.M[417]++;
		__CLOVER_60_0.cloverRec.S[4163]++;logging.erreur(t);
	}

	public void warning(String t)
	{__CLOVER_60_0.cloverRec.M[418]++;
		__CLOVER_60_0.cloverRec.S[4164]++;logging.warningMsg(t);
	}

	public void info(String t)
	{__CLOVER_60_0.cloverRec.M[419]++;
		__CLOVER_60_0.cloverRec.S[4165]++;logging.infoMsg(t);
	}

	public void fatal(String t)
	{__CLOVER_60_0.cloverRec.M[420]++;
		__CLOVER_60_0.cloverRec.S[4166]++;logging.fatalMsg(t);
	}

	//public Classe classe_courante;
	//public Feature feature_courante;

	public Vector liste_classe=new Vector();
	public Vector liste_type;
	public boolean table_heritage_directe[][],table_heritage[][];
	public static Logging logging;
	public Compiler_Eiffel compiler;
	public boolean dans_rescue,dans_ensure;

}