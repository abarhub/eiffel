/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ */package tinyeiffel.genere_c;

import java.io.*;
import java.util.*;
import tinyeiffel.compiler.*;
import tinyeiffel.ast.*;

public class GenC
{static class __CLOVER_182_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}
	public GenC(Compiler_Eiffel compiler)
	{__CLOVER_182_0.cloverRec.M[1025]++;
		assert((((compiler!=null)) && (++__CLOVER_182_0.cloverRec.CT[3695]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3695]==0&false));
		//PrintStreamTest p;
		__CLOVER_182_0.cloverRec.S[15249]++;PrintStream p;
		__CLOVER_182_0.cloverRec.S[15250]++;String nom="genere_c\\programme.c",nom2="genere_c\\programme.h";
		__CLOVER_182_0.cloverRec.S[15251]++;this.compiler=compiler;
		__CLOVER_182_0.cloverRec.S[15252]++;nom_classe_racine=compiler.get_configuration().classe_racine();
		__CLOVER_182_0.cloverRec.S[15253]++;nom_routine_racine=compiler.get_configuration().routine_racine();
		__CLOVER_182_0.cloverRec.S[15254]++;if((((nom_routine_racine==null) && (++__CLOVER_182_0.cloverRec.CT[3696]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3696]==0&false)))
			{__CLOVER_182_0.cloverRec.S[15255]++;nom_routine_racine="make";
		}__CLOVER_182_0.cloverRec.S[15256]++;System.out.println("Generation du C :"+nom_classe_racine+"("+nom_routine_racine+")");
		__CLOVER_182_0.cloverRec.S[15257]++;classe_racine=cherche_classe(nom_classe_racine);
		assert((((classe_racine!=null)) && (++__CLOVER_182_0.cloverRec.CT[3697]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3697]==0&false));
		__CLOVER_182_0.cloverRec.S[15258]++;System.out.println("classe="+classe_racine.nom);
		__CLOVER_182_0.cloverRec.S[15259]++;reference_struct();
		__CLOVER_182_0.cloverRec.S[15260]++;EClasse.affiche_temp_total();
		__CLOVER_182_0.cloverRec.S[15261]++;try
		{
			__CLOVER_182_0.cloverRec.S[15262]++;Date d1,d2;
			__CLOVER_182_0.cloverRec.S[15263]++;d1=new Date();
			__CLOVER_182_0.cloverRec.S[15264]++;long t;
			__CLOVER_182_0.cloverRec.S[15265]++;boolean genere1=true,genere2=true;
			__CLOVER_182_0.cloverRec.S[15266]++;if((((genere1) && (++__CLOVER_182_0.cloverRec.CT[3698]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3698]==0&false)))
			{{
			__CLOVER_182_0.cloverRec.S[15267]++;p=new PrintStream(new FileOutputStream(nom));
			//p=new PrintStreamTest(nom);
			//p.println("#ifndef _PROGRAMME_");
			//p.println("#define _PROGRAMME_");
			__CLOVER_182_0.cloverRec.S[15268]++;p.println("#include\"memoire.h\"");
			__CLOVER_182_0.cloverRec.S[15269]++;p.println("#include<stdio.h>");
			__CLOVER_182_0.cloverRec.S[15270]++;p.println("#include \"type_eiffel.h\"");
			__CLOVER_182_0.cloverRec.S[15271]++;p.println("#include \"programme.h\"");
			__CLOVER_182_0.cloverRec.S[15272]++;p.println("#include \"extern_fun.h\"");
			__CLOVER_182_0.cloverRec.S[15273]++;p.println();
			__CLOVER_182_0.cloverRec.S[15274]++;genere_struct(EToken,p);
			__CLOVER_182_0.cloverRec.S[15275]++;genere_struct(EPosition,p);
			__CLOVER_182_0.cloverRec.S[15276]++;genere_struct(ECharT,p);
			__CLOVER_182_0.cloverRec.S[15277]++;genere_struct(EType,p);
			__CLOVER_182_0.cloverRec.S[15278]++;genere_struct(ETypeT,p);
			__CLOVER_182_0.cloverRec.S[15279]++;genere_struct(EChaine,p);
			__CLOVER_182_0.cloverRec.S[15280]++;genere_struct(EChaineT,p);
			__CLOVER_182_0.cloverRec.S[15281]++;genere_struct(EIndexing,p);
			__CLOVER_182_0.cloverRec.S[15282]++;genere_struct(EIndexingT,p);
			__CLOVER_182_0.cloverRec.S[15283]++;genere_struct(EExpr,p);
			__CLOVER_182_0.cloverRec.S[15284]++;genere_struct(EExprT,p);
			__CLOVER_182_0.cloverRec.S[15285]++;genere_struct(EAssert,p);
			__CLOVER_182_0.cloverRec.S[15286]++;genere_struct(EAssertT,p);
			__CLOVER_182_0.cloverRec.S[15287]++;genere_struct(EInstr,p);
			__CLOVER_182_0.cloverRec.S[15288]++;genere_struct(EInstrT,p);
			__CLOVER_182_0.cloverRec.S[15289]++;genere_struct(ENomFeature,p);
			__CLOVER_182_0.cloverRec.S[15290]++;genere_struct(ENomFeatureT,p);
			__CLOVER_182_0.cloverRec.S[15291]++;genere_struct(EDeclareVar,p);
			__CLOVER_182_0.cloverRec.S[15292]++;genere_struct(EDeclareVarT,p);
			__CLOVER_182_0.cloverRec.S[15293]++;genere_struct(ECommentaire,p);
			__CLOVER_182_0.cloverRec.S[15294]++;genere_struct(ECommentaireT,p);
			__CLOVER_182_0.cloverRec.S[15295]++;genere_struct(EFeature,p);
			__CLOVER_182_0.cloverRec.S[15296]++;genere_struct(EFeatureT,p);
			__CLOVER_182_0.cloverRec.S[15297]++;genere_struct(EHeritage,p); // dernier test
			__CLOVER_182_0.cloverRec.S[15298]++;genere_struct(EHeritageT,p);
			__CLOVER_182_0.cloverRec.S[15299]++;genere_struct(ECreation,p);
			__CLOVER_182_0.cloverRec.S[15300]++;genere_struct(ECreationT,p);
			__CLOVER_182_0.cloverRec.S[15301]++;genere_struct(EAttrAncetre,p); // dernier
			__CLOVER_182_0.cloverRec.S[15302]++;genere_struct(EAttrAncetreT,p);
			__CLOVER_182_0.cloverRec.S[15303]++;genere_struct(EAttribut,p);
			__CLOVER_182_0.cloverRec.S[15304]++;genere_struct(EAttributT,p);
			__CLOVER_182_0.cloverRec.S[15305]++;genere_struct(EClasse,p);
			__CLOVER_182_0.cloverRec.S[15306]++;p.println();
			__CLOVER_182_0.cloverRec.S[15307]++;genere_heritage(p);
			__CLOVER_182_0.cloverRec.S[15308]++;p.println();
			__CLOVER_182_0.cloverRec.S[15309]++;p.println("const int nb_classe="+EClasse.size()+";");
			__CLOVER_182_0.cloverRec.S[15310]++;p.println("const char *nom_classe_racine=\""+nom_classe_racine+"\";");
			__CLOVER_182_0.cloverRec.S[15311]++;p.println("const char *nom_routine_racine=\""+nom_routine_racine+"\";");
			///	ETypeT,EChaineT/*,EIndexT*/,EExprT,
			// EAssertT,EInstrT,ENomFeatureT,
			// EDeclareVarT,ECommentaireT,EFeatureT,
			// EHeritageT,ECreationT,EIndexingT,ECharT
			//genere_struct(EType,p);
			__CLOVER_182_0.cloverRec.S[15312]++;p.println();
			/*p.println("struct TEIF_Classe programme[]={");
			genere_classe(classe_racine,p);
			p.println("}");*/
			__CLOVER_182_0.cloverRec.S[15313]++;genere_init(EInit,p);
			__CLOVER_182_0.cloverRec.S[15314]++;p.println();
			/*p.println("/*void main()");
			p.println("{");
			p.println("\tprintf(\"Hello world!\\n\");");
			p.println("}* /");
			p.println();*/
			//p.println("#endif");
			__CLOVER_182_0.cloverRec.S[15315]++;p.close();
			}
			}__CLOVER_182_0.cloverRec.S[15316]++;if((((genere2) && (++__CLOVER_182_0.cloverRec.CT[3699]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3699]==0&false)))
			{{
			__CLOVER_182_0.cloverRec.S[15317]++;p=new PrintStream(new FileOutputStream(nom2));
			//p=new PrintStreamTest(nom2);
			__CLOVER_182_0.cloverRec.S[15318]++;p.println("#ifndef _PROGRAMME_");
			__CLOVER_182_0.cloverRec.S[15319]++;p.println("#define _PROGRAMME_");
			__CLOVER_182_0.cloverRec.S[15320]++;p.println("#include<stdio.h>");
			__CLOVER_182_0.cloverRec.S[15321]++;p.println("#include \"type_eiffel.h\"");
			__CLOVER_182_0.cloverRec.S[15322]++;p.println();
			__CLOVER_182_0.cloverRec.S[15323]++;p.println(EClasse.toString3());
			//p.println("#ifndef _NB_CLASSE_");
			//p.println("#ifndef _NB_CLASSE_");
			__CLOVER_182_0.cloverRec.S[15324]++;p.println("extern const int nb_classe;");
			__CLOVER_182_0.cloverRec.S[15325]++;p.println("extern const char *nom_classe_racine;");
			__CLOVER_182_0.cloverRec.S[15326]++;p.println("extern const char *nom_routine_racine;");
			__CLOVER_182_0.cloverRec.S[15327]++;genere_heritageh(p);
			__CLOVER_182_0.cloverRec.S[15328]++;p.println("void initialisation(void);");
			__CLOVER_182_0.cloverRec.S[15329]++;p.println();
			__CLOVER_182_0.cloverRec.S[15330]++;p.println("#endif");
			__CLOVER_182_0.cloverRec.S[15331]++;p.close();
			}
			}__CLOVER_182_0.cloverRec.S[15332]++;d2=new Date();
			__CLOVER_182_0.cloverRec.S[15333]++;t=d2.getTime()-d1.getTime();
			__CLOVER_182_0.cloverRec.S[15334]++;System.out.println("Temp total genere c="+t+" ms");
		}
		catch (FileNotFoundException e)
		{
			__CLOVER_182_0.cloverRec.S[15335]++;System.out.println("Impossible de trouver le fichier "+nom+":\n"+e);
			__CLOVER_182_0.cloverRec.S[15336]++;e.printStackTrace();
			assert((((false)) && (++__CLOVER_182_0.cloverRec.CT[3700]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3700]==0&false));
		}
		catch (SecurityException e)
		{
			__CLOVER_182_0.cloverRec.S[15337]++;System.out.println("Probl\u00e8me de s\u00e9curit\u00e9 :\n"+e);
			__CLOVER_182_0.cloverRec.S[15338]++;e.printStackTrace();
			assert((((false)) && (++__CLOVER_182_0.cloverRec.CT[3701]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3701]==0&false));
		}
		
	}

	public void reference_struct()
	{__CLOVER_182_0.cloverRec.M[1026]++;
		__CLOVER_182_0.cloverRec.S[15339]++;int i;
		__CLOVER_182_0.cloverRec.S[15340]++;EToken=new ListeStruct("global_token",false,"struct TEIF_Token");
		__CLOVER_182_0.cloverRec.S[15341]++;EPosition=new ListeStruct("global_position",false,"struct TEIF_Position");
		__CLOVER_182_0.cloverRec.S[15342]++;EType=new ListeStruct("global_type",false,"struct TEIF_Type");
		__CLOVER_182_0.cloverRec.S[15343]++;EChaine=new ListeStruct("global_chaine",false,"struct TEIF_Chaine");
		//EIndex=new ListeStruct("global_inde",false);
		__CLOVER_182_0.cloverRec.S[15344]++;EExpr=new ListeStruct("global_expr",false,"struct TEIF_Expr");
		__CLOVER_182_0.cloverRec.S[15345]++;EAssert=new ListeStruct("global_assert",false,"struct TEIF_Assert");
		__CLOVER_182_0.cloverRec.S[15346]++;EInstr=new ListeStruct("global_instr",false,"struct TEIF_Instr");
		__CLOVER_182_0.cloverRec.S[15347]++;ENomFeature=new ListeStruct("global_nomfeature",false,"struct TEIF_NomFeature");
		__CLOVER_182_0.cloverRec.S[15348]++;EDeclareVar=new ListeStruct("global_declarevar",false,"struct TEIF_DeclareVar");
		__CLOVER_182_0.cloverRec.S[15349]++;ECommentaire=new ListeStruct("global_commentaire",false,"struct TEIF_Commentaire");
		__CLOVER_182_0.cloverRec.S[15350]++;EFeature=new ListeStruct("global_feature",false,"struct TEIF_Feature");
		__CLOVER_182_0.cloverRec.S[15351]++;EHeritage=new ListeStruct("global_heritage",false,"struct TEIF_Heritage");
		__CLOVER_182_0.cloverRec.S[15352]++;ECreation=new ListeStruct("global_creation",false,"struct TEIF_Creation");
		__CLOVER_182_0.cloverRec.S[15353]++;EClasse=new ListeStruct("global_classe",false,"struct TEIF_Classe");
		__CLOVER_182_0.cloverRec.S[15354]++;EIndexing=new ListeStruct("global_indexing",false,"struct TEIF_Indexing");
		__CLOVER_182_0.cloverRec.S[15355]++;EAttribut=new ListeStruct("global_attribut",false,"struct TEIF_Attribut");
		__CLOVER_182_0.cloverRec.S[15356]++;EAttrAncetre=new ListeStruct("global_attrancetre",false,"struct TEIF_AttrAncetre");
		__CLOVER_182_0.cloverRec.S[15357]++;ETypeT=new ListeStruct("global_type_tab",true,"struct TEIF_Type");
		__CLOVER_182_0.cloverRec.S[15358]++;EChaineT=new ListeStruct("global_chaine_tab",true,"struct TEIF_Chaine");
		//EIndexT=new ListeStruct("global_");
		__CLOVER_182_0.cloverRec.S[15359]++;EExprT=new ListeStruct("global_expr_tab",true,"struct TEIF_Expr");
		__CLOVER_182_0.cloverRec.S[15360]++;EAssertT=new ListeStruct("global_assert_tab",true,"struct TEIF_Assert");
		__CLOVER_182_0.cloverRec.S[15361]++;EInstrT=new ListeStruct("global_instr_tab",true,"struct TEIF_Instr");
		__CLOVER_182_0.cloverRec.S[15362]++;ENomFeatureT=new ListeStruct("global_nomfeature_tab",true,"struct TEIF_NomFeature");
		__CLOVER_182_0.cloverRec.S[15363]++;EDeclareVarT=new ListeStruct("global_declarevar_tab",true,"struct TEIF_DeclareVar");
		__CLOVER_182_0.cloverRec.S[15364]++;ECommentaireT=new ListeStruct("global_commentaire_tab",true,"struct TEIF_Commentaire");
		__CLOVER_182_0.cloverRec.S[15365]++;EFeatureT=new ListeStruct("global_feature_tab",true,"struct TEIF_Feature");
		__CLOVER_182_0.cloverRec.S[15366]++;EHeritageT=new ListeStruct("global_heritage_tab",true,"struct TEIF_Heritage");
		__CLOVER_182_0.cloverRec.S[15367]++;ECreationT=new ListeStruct("global_creation_tab",true,"struct TEIF_Creation");
		__CLOVER_182_0.cloverRec.S[15368]++;EIndexingT=new ListeStruct("global_indexing_tab",true,"struct TEIF_Indexing");
		__CLOVER_182_0.cloverRec.S[15369]++;ECharT=new ListeStruct("global_char_tab",true,"char");
		__CLOVER_182_0.cloverRec.S[15370]++;EAttributT=new ListeStruct("global_attribut_tab",true,"struct TEIF_Attribut");
		__CLOVER_182_0.cloverRec.S[15371]++;EAttrAncetreT=new ListeStruct("global_attrancetre_tab",true,"struct TEIF_AttrAncetre");
		__CLOVER_182_0.cloverRec.S[15372]++;EInit=new Vector();
		__CLOVER_182_0.cloverRec.S[15373]++;liste_table=new Vector();
		
		__CLOVER_182_0.cloverRec.S[15374]++;construit_table_attr();
		__CLOVER_182_0.cloverRec.S[15375]++;reference_objet(classe_racine);
		__CLOVER_182_0.cloverRec.S[15376]++;for(i=0;(((i<compiler.liste_classe.size()) && (++__CLOVER_182_0.cloverRec.CT[3702]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3702]==0&false));i++)
		{{
			__CLOVER_182_0.cloverRec.S[15377]++;Classe cl;
			__CLOVER_182_0.cloverRec.S[15378]++;cl=(Classe)compiler.liste_classe.elementAt(i);
			__CLOVER_182_0.cloverRec.S[15379]++;if((((cl!=classe_racine) && (++__CLOVER_182_0.cloverRec.CT[3703]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3703]==0&false)))
			{{
				__CLOVER_182_0.cloverRec.S[15380]++;reference_objet(cl);
			}
		}}
	}}

	public void construit_table_attr()
	{__CLOVER_182_0.cloverRec.M[1027]++;
		__CLOVER_182_0.cloverRec.S[15381]++;Classe classe;
		__CLOVER_182_0.cloverRec.S[15382]++;Table_Symbol table;
		__CLOVER_182_0.cloverRec.S[15383]++;Table tbl;
		__CLOVER_182_0.cloverRec.S[15384]++;int i,j;
		__CLOVER_182_0.cloverRec.S[15385]++;Attribut attr,attr2;
		__CLOVER_182_0.cloverRec.S[15386]++;Attribut_Complet ac;
		__CLOVER_182_0.cloverRec.S[15387]++;Attribut_Heritage ah;
		__CLOVER_182_0.cloverRec.S[15388]++;for(i=0;(((i<compiler.liste_classe.size()) && (++__CLOVER_182_0.cloverRec.CT[3704]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3704]==0&false));i++)
		{{
			__CLOVER_182_0.cloverRec.S[15389]++;classe=(tinyeiffel.ast.Classe)compiler.liste_classe.elementAt(i);
			__CLOVER_182_0.cloverRec.S[15390]++;table=compiler.context.donne_table_symbol(classe);
			__CLOVER_182_0.cloverRec.S[15391]++;tbl=new Table(classe.nom);
			__CLOVER_182_0.cloverRec.S[15392]++;liste_table.addElement(tbl);
			__CLOVER_182_0.cloverRec.S[15393]++;if((((table.liste_attribut!=null&&table.liste_attribut.length>0) && (++__CLOVER_182_0.cloverRec.CT[3705]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3705]==0&false)))
			{{
				__CLOVER_182_0.cloverRec.S[15394]++;tbl.liste_attribut=new Attribut[table.liste_attribut.length];
				__CLOVER_182_0.cloverRec.S[15395]++;for(j=0;(((j<table.liste_attribut.length) && (++__CLOVER_182_0.cloverRec.CT[3706]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3706]==0&false));j++)
				{{
					__CLOVER_182_0.cloverRec.S[15396]++;ac=table.liste_attribut[j];
					__CLOVER_182_0.cloverRec.S[15397]++;attr=new Attribut(ac.nom,classe.type);
					__CLOVER_182_0.cloverRec.S[15398]++;attr.feature_directe=ac.feature_directe;
					__CLOVER_182_0.cloverRec.S[15399]++;attr.feature_reel=ac.feature_reel;
					__CLOVER_182_0.cloverRec.S[15400]++;tbl.liste_attribut[j]=attr;
				}
			}}
			}else
			{{
				//assert(false):"classe:"+classe.nom;
			}
		}}
		}__CLOVER_182_0.cloverRec.S[15401]++;for(i=0;(((i<liste_table.size()) && (++__CLOVER_182_0.cloverRec.CT[3707]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3707]==0&false));i++)
		{{
			__CLOVER_182_0.cloverRec.S[15402]++;classe=(tinyeiffel.ast.Classe)compiler.liste_classe.elementAt(i);
			__CLOVER_182_0.cloverRec.S[15403]++;table=compiler.context.donne_table_symbol(classe);
			__CLOVER_182_0.cloverRec.S[15404]++;tbl=(Table)liste_table.elementAt(i);
			assert((((tbl!=null)) && (++__CLOVER_182_0.cloverRec.CT[3708]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3708]==0&false));
			assert((((tbl.nom_classe.equalsIgnoreCase(classe.nom))) && (++__CLOVER_182_0.cloverRec.CT[3709]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3709]==0&false));
			__CLOVER_182_0.cloverRec.S[15405]++;if((((tbl.liste_attribut!=null&&tbl.liste_attribut.length>0) && (++__CLOVER_182_0.cloverRec.CT[3710]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3710]==0&false)))
			{{
				__CLOVER_182_0.cloverRec.S[15406]++;for(j=0;(((j<tbl.liste_attribut.length) && (++__CLOVER_182_0.cloverRec.CT[3711]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3711]==0&false));j++)
				{{
					__CLOVER_182_0.cloverRec.S[15407]++;ac=table.liste_attribut[j];
					__CLOVER_182_0.cloverRec.S[15408]++;attr=tbl.liste_attribut[j];
					__CLOVER_182_0.cloverRec.S[15409]++;if((((ac.attribut_ancetre!=null) && (++__CLOVER_182_0.cloverRec.CT[3712]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3712]==0&false)))
					{{
						__CLOVER_182_0.cloverRec.S[15410]++;for(int k=0;(((k<ac.attribut_ancetre.length) && (++__CLOVER_182_0.cloverRec.CT[3713]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3713]==0&false));k++)
						{{
							__CLOVER_182_0.cloverRec.S[15411]++;ah=ac.attribut_ancetre[k];
							__CLOVER_182_0.cloverRec.S[15412]++;attr2=donne_attribut(ah);
							__CLOVER_182_0.cloverRec.S[15413]++;if((((!attr2.type.nom.equalsIgnoreCase(classe.nom)) && (++__CLOVER_182_0.cloverRec.CT[3714]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3714]==0&false)))
							{{// c'est pas le meme attribut
								__CLOVER_182_0.cloverRec.S[15414]++;AttrAncetre a1,a2;
								__CLOVER_182_0.cloverRec.S[15415]++;int no1=-1,m;
								__CLOVER_182_0.cloverRec.S[15416]++;if((((classe.heritage!=null) && (++__CLOVER_182_0.cloverRec.CT[3715]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3715]==0&false)))
								{{
									__CLOVER_182_0.cloverRec.S[15417]++;for(m=0;(((m<classe.heritage.length) && (++__CLOVER_182_0.cloverRec.CT[3716]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3716]==0&false));m++)
									{{
										__CLOVER_182_0.cloverRec.S[15418]++;if((((ah.heritage==classe.heritage[m]) && (++__CLOVER_182_0.cloverRec.CT[3717]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3717]==0&false)))
										{{
											__CLOVER_182_0.cloverRec.S[15419]++;no1=m;
											__CLOVER_182_0.cloverRec.S[15420]++;break;
										}
									}}
									}assert((((no1!=-1)) && (++__CLOVER_182_0.cloverRec.CT[3718]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3718]==0&false));
								}
								}else
								{{// heritage implicite vers ANY
									__CLOVER_182_0.cloverRec.S[15421]++;no1=0;
								}
								//a1=new AttrAncetre(attr.nom,classe.type,no1);
								}__CLOVER_182_0.cloverRec.S[15422]++;attr2.ajoute_descendant(attr.nom,classe.type,no1);
								//a2=new AttrAncetre(attr2.nom,ah.heritage.type,no1);
								__CLOVER_182_0.cloverRec.S[15423]++;attr.ajoute_ancetre(attr2.nom,ah.heritage.type,no1);
							}
						}}
					}}
				}}
			}}
		}}
	}}

	public String convertie_chaine(String s)
	{__CLOVER_182_0.cloverRec.M[1028]++;// todo: convertir les \t en \\t, \n en \\n, etc...
		__CLOVER_182_0.cloverRec.S[15424]++;if((((s==null) && (++__CLOVER_182_0.cloverRec.CT[3719]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3719]==0&false)))
		{{
			__CLOVER_182_0.cloverRec.S[15425]++;return null;
		}
		}else
		{{
			__CLOVER_182_0.cloverRec.S[15426]++;StringBuffer s2=new StringBuffer();
			__CLOVER_182_0.cloverRec.S[15427]++;int i;
			__CLOVER_182_0.cloverRec.S[15428]++;char c;
			__CLOVER_182_0.cloverRec.S[15429]++;for(i=0;(((i<s.length()) && (++__CLOVER_182_0.cloverRec.CT[3720]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3720]==0&false));i++)
			{{
				__CLOVER_182_0.cloverRec.S[15430]++;c=s.charAt(i);
				__CLOVER_182_0.cloverRec.S[15431]++;if((((c=='\\') && (++__CLOVER_182_0.cloverRec.CT[3721]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3721]==0&false)))
					{__CLOVER_182_0.cloverRec.S[15432]++;s2.append("\\\\");
				}else
					{__CLOVER_182_0.cloverRec.S[15433]++;s2.append(c);
			}}
			}__CLOVER_182_0.cloverRec.S[15434]++;return s2.toString();
		}
	}}

	public Attribut donne_attribut(Attribut_Heritage ah)
	{__CLOVER_182_0.cloverRec.M[1029]++;
		assert((((ah!=null)) && (++__CLOVER_182_0.cloverRec.CT[3722]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3722]==0&false));
		__CLOVER_182_0.cloverRec.S[15435]++;Table table;
		__CLOVER_182_0.cloverRec.S[15436]++;Attribut liste[];
		__CLOVER_182_0.cloverRec.S[15437]++;liste=trouve_attribut(ah.heritage.type.nom);
		__CLOVER_182_0.cloverRec.S[15438]++;if((((liste==null) && (++__CLOVER_182_0.cloverRec.CT[3723]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3723]==0&false)))
			{__CLOVER_182_0.cloverRec.S[15439]++;return null;
		}__CLOVER_182_0.cloverRec.S[15440]++;for(int i=0;(((i<liste.length) && (++__CLOVER_182_0.cloverRec.CT[3724]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3724]==0&false));i++)
		{{
			__CLOVER_182_0.cloverRec.S[15441]++;if((((liste[i].nom.meme_nom(ah.nom)) && (++__CLOVER_182_0.cloverRec.CT[3725]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3725]==0&false)))
				{__CLOVER_182_0.cloverRec.S[15442]++;return liste[i];
		}}
		}__CLOVER_182_0.cloverRec.S[15443]++;return null;
	}

	public int reference_objet(Object objet)
	{__CLOVER_182_0.cloverRec.M[1030]++;
		assert((((objet!=null)) && (++__CLOVER_182_0.cloverRec.CT[3726]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3726]==0&false));
		__CLOVER_182_0.cloverRec.S[15444]++;int i,j,res,no,no2,no3,no4;
		__CLOVER_182_0.cloverRec.S[15445]++;String text;
		__CLOVER_182_0.cloverRec.S[15446]++;if((((objet instanceof Classe) && (++__CLOVER_182_0.cloverRec.CT[3727]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3727]==0&false)))
		{{
			__CLOVER_182_0.cloverRec.S[15447]++;Classe classe=(Classe)objet;
			__CLOVER_182_0.cloverRec.S[15448]++;Attribut attr[];
			__CLOVER_182_0.cloverRec.S[15449]++;Table table;
			__CLOVER_182_0.cloverRec.S[15450]++;res=EClasse.no_objet(classe);
			__CLOVER_182_0.cloverRec.S[15451]++;if((((res==-1) && (++__CLOVER_182_0.cloverRec.CT[3728]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3728]==0&false)))
			{{
				__CLOVER_182_0.cloverRec.S[15452]++;EClasse.ajoute(classe);
				__CLOVER_182_0.cloverRec.S[15453]++;text="";
				/*if(EClasse.size()>0)
				{
					Object o=EClasse.elementAt(0);
					text="/* 0)"+o+","+(o==classe)+","+
						EClasse.no_objet(o)+","+EClasse.no_objet(classe)+" *//* ";
				}*/
				__CLOVER_182_0.cloverRec.S[15454]++;if((((classe.deferred) && (++__CLOVER_182_0.cloverRec.CT[3729]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3729]==0&false)))
					{__CLOVER_182_0.cloverRec.S[15455]++;text+="1,";
				}else
					{__CLOVER_182_0.cloverRec.S[15456]++;text+="0,";
				}__CLOVER_182_0.cloverRec.S[15457]++;if((((classe.expanded) && (++__CLOVER_182_0.cloverRec.CT[3730]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3730]==0&false)))
					{__CLOVER_182_0.cloverRec.S[15458]++;text+="1,";
				}else
					{__CLOVER_182_0.cloverRec.S[15459]++;text+="0,";
				}__CLOVER_182_0.cloverRec.S[15460]++;if ((((classe.type!=null) && (++__CLOVER_182_0.cloverRec.CT[3731]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3731]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[15461]++;no=reference_objet(classe.type);
					__CLOVER_182_0.cloverRec.S[15462]++;text+="&(global_type["+no+"]),";
				}
				}else
					{__CLOVER_182_0.cloverRec.S[15463]++;text+="NULL,";
				}__CLOVER_182_0.cloverRec.S[15464]++;text+=ajoute_feature(classe.feature)+",";
				__CLOVER_182_0.cloverRec.S[15465]++;text+=ajoute_heritage(classe.heritage)+",";
				__CLOVER_182_0.cloverRec.S[15466]++;text+=ajoute_assert(classe.invariant)+",";
				__CLOVER_182_0.cloverRec.S[15467]++;text+=ajoute_creation(classe.creation)+",";
				__CLOVER_182_0.cloverRec.S[15468]++;if((((classe.obsolete!=null) && (++__CLOVER_182_0.cloverRec.CT[3732]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3732]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[15469]++;no=reference_objet(classe.obsolete);
					__CLOVER_182_0.cloverRec.S[15470]++;text+="&(global_chaine["+no+"]),";
				}
				}else
					{__CLOVER_182_0.cloverRec.S[15471]++;text+="NULL,";
				}__CLOVER_182_0.cloverRec.S[15472]++;text+=ajoute_indexing(classe.index)+",";
				__CLOVER_182_0.cloverRec.S[15473]++;text+="NULL,";
				__CLOVER_182_0.cloverRec.S[15474]++;attr=trouve_attribut(classe.nom);
				//assert(attr!=null):"classe="+classe.nom;
				//assert(attr.length>0);
				__CLOVER_182_0.cloverRec.S[15475]++;text+=ajoute_attribut(attr)+",";
				__CLOVER_182_0.cloverRec.S[15476]++;text+=taille(classe.feature)+","+taille(classe.heritage)+
					","+taille(classe.invariant)+","+taille(classe.creation)+
					","+taille(classe.index)+",0";
				__CLOVER_182_0.cloverRec.S[15477]++;text+=","+taille(attr)+",";
				__CLOVER_182_0.cloverRec.S[15478]++;if((((classe.tclass!=null) && (++__CLOVER_182_0.cloverRec.CT[3733]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3733]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[15479]++;no=reference_objet(classe.tclass);
					__CLOVER_182_0.cloverRec.S[15480]++;text+="&(global_token["+no+"]),";
				}
				}else
					{__CLOVER_182_0.cloverRec.S[15481]++;text+="NULL,";
				}__CLOVER_182_0.cloverRec.S[15482]++;if((((classe.texp_defer!=null) && (++__CLOVER_182_0.cloverRec.CT[3734]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3734]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[15483]++;no=reference_objet(classe.texp_defer);
					__CLOVER_182_0.cloverRec.S[15484]++;text+="&(global_token["+no+"]),";
				}
				}else
					{__CLOVER_182_0.cloverRec.S[15485]++;text+="NULL,";
				}__CLOVER_182_0.cloverRec.S[15486]++;if((((classe.tobsolete!=null) && (++__CLOVER_182_0.cloverRec.CT[3735]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3735]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[15487]++;no=reference_objet(classe.tobsolete);
					__CLOVER_182_0.cloverRec.S[15488]++;text+="&(global_token["+no+"]),";
				}
				}else
					{__CLOVER_182_0.cloverRec.S[15489]++;text+="NULL,";
				}__CLOVER_182_0.cloverRec.S[15490]++;if((((classe.tinvariant!=null) && (++__CLOVER_182_0.cloverRec.CT[3736]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3736]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[15491]++;no=reference_objet(classe.tinvariant);
					__CLOVER_182_0.cloverRec.S[15492]++;text+="&(global_token["+no+"]),";
				}
				}else
					{__CLOVER_182_0.cloverRec.S[15493]++;text+="NULL,";
				}__CLOVER_182_0.cloverRec.S[15494]++;if((((classe.tend!=null) && (++__CLOVER_182_0.cloverRec.CT[3737]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3737]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[15495]++;no=reference_objet(classe.tend);
					__CLOVER_182_0.cloverRec.S[15496]++;text+="&(global_token["+no+"])";
				}
				}else
					{__CLOVER_182_0.cloverRec.S[15497]++;text+="NULL";
				/*if(EClasse.size()>0)
				{
					Object o=EClasse.elementAt(0);
					text="/* 1)"+o+","+(o==classe)+","+
						EClasse.no_objet(o)+","+EClasse.no_objet(classe)+" *//* "+text;
				}
				text=" /*("+classe.nom+","+classe+")*/// "+text;
				}__CLOVER_182_0.cloverRec.S[15498]++;res=EClasse.associe(classe,text);
			}
		}}
		}else {__CLOVER_182_0.cloverRec.S[15499]++;if((((objet instanceof Creation) && (++__CLOVER_182_0.cloverRec.CT[3738]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3738]==0&false)))
		{{
			__CLOVER_182_0.cloverRec.S[15500]++;Creation creation=(Creation)objet;
			__CLOVER_182_0.cloverRec.S[15501]++;res=ECreation.no_objet(creation);
			__CLOVER_182_0.cloverRec.S[15502]++;if((((res==-1) && (++__CLOVER_182_0.cloverRec.CT[3739]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3739]==0&false)))
			{{
				__CLOVER_182_0.cloverRec.S[15503]++;text=ajoute_type(creation.liste_type)+",";
				__CLOVER_182_0.cloverRec.S[15504]++;text+=ajoute_nomfeature(creation.nom_fonction)+",";
				__CLOVER_182_0.cloverRec.S[15505]++;text+=taille(creation.liste_type)+","+taille(creation.nom_fonction)+",";
				__CLOVER_182_0.cloverRec.S[15506]++;if((((creation.tcreation!=null) && (++__CLOVER_182_0.cloverRec.CT[3740]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3740]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[15507]++;no=reference_objet(creation.tcreation);
					__CLOVER_182_0.cloverRec.S[15508]++;text+="&(global_token["+no+"]),";
				}
				}else
					{__CLOVER_182_0.cloverRec.S[15509]++;text+="NULL,";
				}__CLOVER_182_0.cloverRec.S[15510]++;if((((creation.debut!=null) && (++__CLOVER_182_0.cloverRec.CT[3741]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3741]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[15511]++;no=reference_objet(creation.debut);
					__CLOVER_182_0.cloverRec.S[15512]++;text+="&(global_position["+no+"]),";
				}
				}else
					{__CLOVER_182_0.cloverRec.S[15513]++;text+="NULL,";
				}__CLOVER_182_0.cloverRec.S[15514]++;if((((creation.fin!=null) && (++__CLOVER_182_0.cloverRec.CT[3742]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3742]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[15515]++;no=reference_objet(creation.fin);
					__CLOVER_182_0.cloverRec.S[15516]++;text+="&(global_position["+no+"])";
				}
				}else
					{__CLOVER_182_0.cloverRec.S[15517]++;text+="NULL";
				}__CLOVER_182_0.cloverRec.S[15518]++;res=ECreation.addElement(creation,text);
			}
		}}
		}else {__CLOVER_182_0.cloverRec.S[15519]++;if((((objet instanceof Heritage) && (++__CLOVER_182_0.cloverRec.CT[3743]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3743]==0&false)))
		{{
			__CLOVER_182_0.cloverRec.S[15520]++;Heritage heritage=(Heritage)objet;
			__CLOVER_182_0.cloverRec.S[15521]++;res=EHeritage.no_objet(heritage);
			__CLOVER_182_0.cloverRec.S[15522]++;if((((res==-1) && (++__CLOVER_182_0.cloverRec.CT[3744]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3744]==0&false)))
			{{
				__CLOVER_182_0.cloverRec.S[15523]++;if((((heritage.type!=null) && (++__CLOVER_182_0.cloverRec.CT[3745]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3745]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[15524]++;no=reference_objet(heritage.type);
					__CLOVER_182_0.cloverRec.S[15525]++;text="&(global_type["+no+"]),";
				}
				}else
					{__CLOVER_182_0.cloverRec.S[15526]++;text="NULL,";
				}__CLOVER_182_0.cloverRec.S[15527]++;if((((heritage.export!=null&&heritage.export.length>0) && (++__CLOVER_182_0.cloverRec.CT[3746]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3746]==0&false)))
				{{// TODO: a revoir
					//ENomFeatureT.
					__CLOVER_182_0.cloverRec.S[15528]++;text+="NULL,";
				}
				}else
					{__CLOVER_182_0.cloverRec.S[15529]++;text+="NULL,";
				}__CLOVER_182_0.cloverRec.S[15530]++;if((((heritage.rename!=null&&heritage.rename.length>0) && (++__CLOVER_182_0.cloverRec.CT[3747]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3747]==0&false)))
				{{// TODO: a revoir
					//ENomFeatureT.
					__CLOVER_182_0.cloverRec.S[15531]++;text+="NULL,";
				}
				}else
					{__CLOVER_182_0.cloverRec.S[15532]++;text+="NULL,";
				}__CLOVER_182_0.cloverRec.S[15533]++;text+=ajoute_nomfeature(heritage.undefine)+",";
				__CLOVER_182_0.cloverRec.S[15534]++;text+=ajoute_nomfeature(heritage.redefine)+",";
				__CLOVER_182_0.cloverRec.S[15535]++;text+=ajoute_nomfeature(heritage.select)+",";
				__CLOVER_182_0.cloverRec.S[15536]++;text+=taille(heritage.export)+","+taille(heritage.rename)+
					","+taille(heritage.undefine)+","+taille(heritage.redefine)+
					","+taille(heritage.select)+",";
				__CLOVER_182_0.cloverRec.S[15537]++;if((((heritage.therit!=null) && (++__CLOVER_182_0.cloverRec.CT[3748]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3748]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[15538]++;no=reference_objet(heritage.therit);
					__CLOVER_182_0.cloverRec.S[15539]++;text+="&(global_token["+no+"]),";
				}
				}else
					{__CLOVER_182_0.cloverRec.S[15540]++;text+="NULL,";
				}__CLOVER_182_0.cloverRec.S[15541]++;if((((heritage.trename!=null) && (++__CLOVER_182_0.cloverRec.CT[3749]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3749]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[15542]++;no=reference_objet(heritage.trename);
					__CLOVER_182_0.cloverRec.S[15543]++;text+="&(global_token["+no+"]),";
				}
				}else
					{__CLOVER_182_0.cloverRec.S[15544]++;text+="NULL,";
				}__CLOVER_182_0.cloverRec.S[15545]++;if((((heritage.texport!=null) && (++__CLOVER_182_0.cloverRec.CT[3750]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3750]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[15546]++;no=reference_objet(heritage.texport);
					__CLOVER_182_0.cloverRec.S[15547]++;text+="&(global_token["+no+"]),";
				}
				}else
					{__CLOVER_182_0.cloverRec.S[15548]++;text+="NULL,";
				}__CLOVER_182_0.cloverRec.S[15549]++;if((((heritage.tundefine!=null) && (++__CLOVER_182_0.cloverRec.CT[3751]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3751]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[15550]++;no=reference_objet(heritage.tundefine);
					__CLOVER_182_0.cloverRec.S[15551]++;text+="&(global_token["+no+"]),";
				}
				}else
					{__CLOVER_182_0.cloverRec.S[15552]++;text+="NULL,";
				}__CLOVER_182_0.cloverRec.S[15553]++;if((((heritage.tredefine!=null) && (++__CLOVER_182_0.cloverRec.CT[3752]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3752]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[15554]++;no=reference_objet(heritage.tredefine);
					__CLOVER_182_0.cloverRec.S[15555]++;text+="&(global_token["+no+"]),";
				}
				}else
					{__CLOVER_182_0.cloverRec.S[15556]++;text+="NULL,";
				}__CLOVER_182_0.cloverRec.S[15557]++;if((((heritage.tselect!=null) && (++__CLOVER_182_0.cloverRec.CT[3753]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3753]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[15558]++;no=reference_objet(heritage.tselect);
					__CLOVER_182_0.cloverRec.S[15559]++;text+="&(global_token["+no+"]),";
				}
				}else
					{__CLOVER_182_0.cloverRec.S[15560]++;text+="NULL,";
				}__CLOVER_182_0.cloverRec.S[15561]++;if((((heritage.tend!=null) && (++__CLOVER_182_0.cloverRec.CT[3754]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3754]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[15562]++;no=reference_objet(heritage.tend);
					__CLOVER_182_0.cloverRec.S[15563]++;text+="&(global_token["+no+"]),";
				}
				}else
					{__CLOVER_182_0.cloverRec.S[15564]++;text+="NULL,";
				}__CLOVER_182_0.cloverRec.S[15565]++;if((((heritage.debut!=null) && (++__CLOVER_182_0.cloverRec.CT[3755]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3755]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[15566]++;no=reference_objet(heritage.debut);
					__CLOVER_182_0.cloverRec.S[15567]++;text+="&(global_position["+no+"]),";
				}
				}else
					{__CLOVER_182_0.cloverRec.S[15568]++;text+="NULL,";
				}__CLOVER_182_0.cloverRec.S[15569]++;if((((heritage.fin!=null) && (++__CLOVER_182_0.cloverRec.CT[3756]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3756]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[15570]++;no=reference_objet(heritage.fin);
					__CLOVER_182_0.cloverRec.S[15571]++;text+="&(global_position["+no+"]),";
				}
				}else
					{__CLOVER_182_0.cloverRec.S[15572]++;text+="NULL";
				}__CLOVER_182_0.cloverRec.S[15573]++;res=EHeritage.addElement(heritage,text);
			}
		}}
		}else {__CLOVER_182_0.cloverRec.S[15574]++;if((((objet instanceof Feature) && (++__CLOVER_182_0.cloverRec.CT[3757]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3757]==0&false)))
		{{
			__CLOVER_182_0.cloverRec.S[15575]++;Feature feature=(Feature)objet;
			__CLOVER_182_0.cloverRec.S[15576]++;res=EFeature.no_objet(feature);
			__CLOVER_182_0.cloverRec.S[15577]++;if((((res==-1) && (++__CLOVER_182_0.cloverRec.CT[3758]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3758]==0&false)))
			{{
				__CLOVER_182_0.cloverRec.S[15578]++;if((((feature instanceof FeatureAttr) && (++__CLOVER_182_0.cloverRec.CT[3759]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3759]==0&false)))
					{__CLOVER_182_0.cloverRec.S[15579]++;text="TEIF_FeatureAttr,";
				}else {__CLOVER_182_0.cloverRec.S[15580]++;if((((feature instanceof FeatureDeferred) && (++__CLOVER_182_0.cloverRec.CT[3760]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3760]==0&false)))
					{__CLOVER_182_0.cloverRec.S[15581]++;text="TEIF_FeatureDeferred,";
				}else {__CLOVER_182_0.cloverRec.S[15582]++;if((((feature instanceof FeatureExpr) && (++__CLOVER_182_0.cloverRec.CT[3761]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3761]==0&false)))
					{__CLOVER_182_0.cloverRec.S[15583]++;text="TEIF_FeatureExpr,";
				}else {__CLOVER_182_0.cloverRec.S[15584]++;if((((feature instanceof FeatureExternal) && (++__CLOVER_182_0.cloverRec.CT[3762]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3762]==0&false)))
					{__CLOVER_182_0.cloverRec.S[15585]++;text="TEIF_FeatureExternal,";
				}else {__CLOVER_182_0.cloverRec.S[15586]++;if((((feature instanceof FeatureRoutine) && (++__CLOVER_182_0.cloverRec.CT[3763]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3763]==0&false)))
					{__CLOVER_182_0.cloverRec.S[15587]++;text="TEIF_FeatureRoutine,";
				}else {__CLOVER_182_0.cloverRec.S[15588]++;if((((feature instanceof FeatureUnique) && (++__CLOVER_182_0.cloverRec.CT[3764]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3764]==0&false)))
					{__CLOVER_182_0.cloverRec.S[15589]++;text="TEIF_FeatureUnique,";
				}else
				{{
					__CLOVER_182_0.cloverRec.S[15590]++;text="";
					assert((((false)) && (++__CLOVER_182_0.cloverRec.CT[3765]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3765]==0&false));
				}
				}}}}}}__CLOVER_182_0.cloverRec.S[15591]++;text+=ajoute_nomfeature(feature.liste_nom)+",";
				__CLOVER_182_0.cloverRec.S[15592]++;text+=ajoute_declarevar(feature.param)+",";
				__CLOVER_182_0.cloverRec.S[15593]++;if((((feature instanceof FeatureRoutine&&
					((FeatureRoutine)feature).local!=null) && (++__CLOVER_182_0.cloverRec.CT[3766]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3766]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[15594]++;text+=ajoute_declarevar(((FeatureRoutine)feature).local)+",";
				}
				}else
				{{
					__CLOVER_182_0.cloverRec.S[15595]++;text+="NULL,";
				}
				}__CLOVER_182_0.cloverRec.S[15596]++;text+=ajoute_assert(feature.require)+",";
				__CLOVER_182_0.cloverRec.S[15597]++;text+=ajoute_assert(feature.ensure)+",";
				__CLOVER_182_0.cloverRec.S[15598]++;if((((feature.type_retour!=null) && (++__CLOVER_182_0.cloverRec.CT[3767]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3767]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[15599]++;no=reference_objet(feature.type_retour);
					__CLOVER_182_0.cloverRec.S[15600]++;text+="&(global_type["+no+"]),";
				}
				}else
					{__CLOVER_182_0.cloverRec.S[15601]++;text+="NULL,";
				}__CLOVER_182_0.cloverRec.S[15602]++;text+=ajoute_type(feature.export)+",";
				__CLOVER_182_0.cloverRec.S[15603]++;text+=ajoute_instr(feature.rescue)+",";
				__CLOVER_182_0.cloverRec.S[15604]++;if((((feature instanceof FeatureRoutine&&
					((FeatureRoutine)feature).local!=null) && (++__CLOVER_182_0.cloverRec.CT[3768]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3768]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[15605]++;text+=ajoute_instr(((FeatureRoutine)feature).liste_instr)+",";
				}
				}else
				{{
					__CLOVER_182_0.cloverRec.S[15606]++;text+="NULL,";
				}
				}__CLOVER_182_0.cloverRec.S[15607]++;text+=ajoute_commentaire(feature.commentaire)+",";
				__CLOVER_182_0.cloverRec.S[15608]++;text+=ajoute_commentaire(feature.commentaire2)+",";
				__CLOVER_182_0.cloverRec.S[15609]++;text+=ajoute_commentaire(feature.commentaire3)+",";
				__CLOVER_182_0.cloverRec.S[15610]++;if((((feature.obsolete!=null) && (++__CLOVER_182_0.cloverRec.CT[3769]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3769]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[15611]++;no=reference_objet(feature.obsolete);
					__CLOVER_182_0.cloverRec.S[15612]++;text+="(global_chaine["+no+"]),";
				}
				}else
					{__CLOVER_182_0.cloverRec.S[15613]++;text+="NULL,";
				}__CLOVER_182_0.cloverRec.S[15614]++;if((((feature instanceof FeatureExpr) && (++__CLOVER_182_0.cloverRec.CT[3770]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3770]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[15615]++;FeatureExpr f=(FeatureExpr)feature;
					__CLOVER_182_0.cloverRec.S[15616]++;text+="NULL,NULL,NULL,";
					__CLOVER_182_0.cloverRec.S[15617]++;if((((f.expr!=null) && (++__CLOVER_182_0.cloverRec.CT[3771]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3771]==0&false)))
					{{
						__CLOVER_182_0.cloverRec.S[15618]++;no=reference_objet(f.expr);
						__CLOVER_182_0.cloverRec.S[15619]++;text+="&(global_expr["+no+"]),";
					}
					}else
						{__CLOVER_182_0.cloverRec.S[15620]++;text+="NULL,";
					}__CLOVER_182_0.cloverRec.S[15621]++;text+="0,NULL,";
				}
				}else {__CLOVER_182_0.cloverRec.S[15622]++;if((((feature instanceof FeatureExternal) && (++__CLOVER_182_0.cloverRec.CT[3772]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3772]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[15623]++;FeatureExternal f=(FeatureExternal)feature;
					__CLOVER_182_0.cloverRec.S[15624]++;if((((f.str!=null) && (++__CLOVER_182_0.cloverRec.CT[3773]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3773]==0&false)))
					{{
						__CLOVER_182_0.cloverRec.S[15625]++;no=reference_objet(f.str);
						__CLOVER_182_0.cloverRec.S[15626]++;text+="&(global_chaine["+no+"]),";
					}
					}else
						{__CLOVER_182_0.cloverRec.S[15627]++;text+="NULL,";
					}__CLOVER_182_0.cloverRec.S[15628]++;if((((f.alias!=null) && (++__CLOVER_182_0.cloverRec.CT[3774]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3774]==0&false)))
					{{
						__CLOVER_182_0.cloverRec.S[15629]++;no=reference_objet(f.alias);
						__CLOVER_182_0.cloverRec.S[15630]++;text+="&(global_chaine["+no+"]),";
					}
					}else
						{__CLOVER_182_0.cloverRec.S[15631]++;text+="NULL,";
					}__CLOVER_182_0.cloverRec.S[15632]++;text+="NULL,NULL,0,";
					__CLOVER_182_0.cloverRec.S[15633]++;if((((f.classe!=null&&f.classe.nom!=null) && (++__CLOVER_182_0.cloverRec.CT[3775]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3775]==0&false)))
					{{
						__CLOVER_182_0.cloverRec.S[15634]++;if((((f.classe.nom.equalsIgnoreCase("integer")) && (++__CLOVER_182_0.cloverRec.CT[3776]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3776]==0&false)))
						{{
							__CLOVER_182_0.cloverRec.S[15635]++;text+="fun_extern_int,";
						}
						}else {__CLOVER_182_0.cloverRec.S[15636]++;if((((f.classe.nom.equalsIgnoreCase("boolean")) && (++__CLOVER_182_0.cloverRec.CT[3777]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3777]==0&false)))
						{{
							__CLOVER_182_0.cloverRec.S[15637]++;text+="fun_extern_bool,";
						}
						}else {__CLOVER_182_0.cloverRec.S[15638]++;if((((f.classe.nom.equalsIgnoreCase("character")) && (++__CLOVER_182_0.cloverRec.CT[3778]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3778]==0&false)))
						{{
							__CLOVER_182_0.cloverRec.S[15639]++;text+="fun_extern_char,";
						}
						}else {__CLOVER_182_0.cloverRec.S[15640]++;if((((f.classe.nom.equalsIgnoreCase("real")) && (++__CLOVER_182_0.cloverRec.CT[3779]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3779]==0&false)))
						{{
							__CLOVER_182_0.cloverRec.S[15641]++;text+="fun_extern_real,";
						}
						}else {__CLOVER_182_0.cloverRec.S[15642]++;if((((f.classe.nom.equalsIgnoreCase("double")) && (++__CLOVER_182_0.cloverRec.CT[3780]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3780]==0&false)))
						{{
							__CLOVER_182_0.cloverRec.S[15643]++;text+="fun_extern_double,";
						}
						}else {__CLOVER_182_0.cloverRec.S[15644]++;if((((f.classe.nom.equalsIgnoreCase("general")) && (++__CLOVER_182_0.cloverRec.CT[3781]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3781]==0&false)))
						{{
							__CLOVER_182_0.cloverRec.S[15645]++;text+="fun_extern_general,";
						}
						}else
						{{
							__CLOVER_182_0.cloverRec.S[15646]++;text+="NULL/*extern*/,";
						}
					}}}}}}}
					}else
					{{// todo: prendre en compte les extern qui ne sont pas tinyeiffel
						__CLOVER_182_0.cloverRec.S[15647]++;text+="NULL/*extern*/,";
					}
				}}
				}else {__CLOVER_182_0.cloverRec.S[15648]++;if((((feature instanceof FeatureRoutine) && (++__CLOVER_182_0.cloverRec.CT[3782]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3782]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[15649]++;FeatureRoutine f=(FeatureRoutine)feature;
					__CLOVER_182_0.cloverRec.S[15650]++;text+="NULL,NULL,NULL,NULL,";
					__CLOVER_182_0.cloverRec.S[15651]++;if((((f.once) && (++__CLOVER_182_0.cloverRec.CT[3783]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3783]==0&false)))
						{__CLOVER_182_0.cloverRec.S[15652]++;text+="1,NULL,";
					}else
						{__CLOVER_182_0.cloverRec.S[15653]++;text+="0,NULL,";
				}}
				}else //if(feature instanceof FeatureAttr)
				{{
					//FeatureAttr f=(FeatureAttr)feature;
					__CLOVER_182_0.cloverRec.S[15654]++;text+="NULL,NULL,NULL,NULL,0,NULL,";
				}
				}}}__CLOVER_182_0.cloverRec.S[15655]++;text+=taille(feature.liste_nom)+",";
				/*if(feature instanceof FeatureRoutine&&
					((FeatureRoutine)feature).local!=null)
				{
					
				}*/
				__CLOVER_182_0.cloverRec.S[15656]++;text+=taille(feature.param)+",";
				__CLOVER_182_0.cloverRec.S[15657]++;if((((feature instanceof FeatureRoutine&&
					((FeatureRoutine)feature).local!=null) && (++__CLOVER_182_0.cloverRec.CT[3784]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3784]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[15658]++;text+=taille(((FeatureRoutine)feature).local)+",";
				}
				}else
				{{
					__CLOVER_182_0.cloverRec.S[15659]++;text+="0,";
				}
				}__CLOVER_182_0.cloverRec.S[15660]++;text+=taille(feature.require)+",";
				__CLOVER_182_0.cloverRec.S[15661]++;text+=taille(feature.ensure)+",";
				__CLOVER_182_0.cloverRec.S[15662]++;text+=taille(feature.rescue)+",";
				__CLOVER_182_0.cloverRec.S[15663]++;if((((feature instanceof FeatureRoutine&&
					((FeatureRoutine)feature).local!=null) && (++__CLOVER_182_0.cloverRec.CT[3785]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3785]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[15664]++;text+=taille(((FeatureRoutine)feature).liste_instr)+",";
				}
				}else
				{{
					__CLOVER_182_0.cloverRec.S[15665]++;text+="0,";
				}
				}__CLOVER_182_0.cloverRec.S[15666]++;text+=taille(feature.commentaire)+",";
				__CLOVER_182_0.cloverRec.S[15667]++;text+=taille(feature.commentaire2)+",";
				__CLOVER_182_0.cloverRec.S[15668]++;text+=taille(feature.commentaire3)+",";
				__CLOVER_182_0.cloverRec.S[15669]++;if((((feature.tfeature!=null) && (++__CLOVER_182_0.cloverRec.CT[3786]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3786]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[15670]++;no=reference_objet(feature.tfeature);
					__CLOVER_182_0.cloverRec.S[15671]++;text+="&(global_token["+no+"]),";
				}
				}else
					{__CLOVER_182_0.cloverRec.S[15672]++;text+="NULL,";
				}__CLOVER_182_0.cloverRec.S[15673]++;if((((feature.tobsolete!=null) && (++__CLOVER_182_0.cloverRec.CT[3787]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3787]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[15674]++;no=reference_objet(feature.tobsolete);
					__CLOVER_182_0.cloverRec.S[15675]++;text+="&(global_token["+no+"]),";
				}
				}else
					{__CLOVER_182_0.cloverRec.S[15676]++;text+="NULL,";
				}__CLOVER_182_0.cloverRec.S[15677]++;if((((feature.trequire!=null) && (++__CLOVER_182_0.cloverRec.CT[3788]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3788]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[15678]++;no=reference_objet(feature.trequire);
					__CLOVER_182_0.cloverRec.S[15679]++;text+="&(global_token["+no+"]),";
				}
				}else
					{__CLOVER_182_0.cloverRec.S[15680]++;text+="NULL,";
				}__CLOVER_182_0.cloverRec.S[15681]++;if((((feature.tensure!=null) && (++__CLOVER_182_0.cloverRec.CT[3789]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3789]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[15682]++;no=reference_objet(feature.tensure);
					__CLOVER_182_0.cloverRec.S[15683]++;text+="&(global_token["+no+"]),";
				}
				}else
					{__CLOVER_182_0.cloverRec.S[15684]++;text+="NULL,";
				}__CLOVER_182_0.cloverRec.S[15685]++;if((((feature.trescue!=null) && (++__CLOVER_182_0.cloverRec.CT[3790]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3790]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[15686]++;no=reference_objet(feature.trescue);
					__CLOVER_182_0.cloverRec.S[15687]++;text+="&(global_token["+no+"]),";
				}
				}else
					{__CLOVER_182_0.cloverRec.S[15688]++;text+="NULL,";
				}__CLOVER_182_0.cloverRec.S[15689]++;if((((feature.tunique!=null) && (++__CLOVER_182_0.cloverRec.CT[3791]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3791]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[15690]++;no=reference_objet(feature.tunique);
					__CLOVER_182_0.cloverRec.S[15691]++;text+="&(global_token["+no+"]),";
				}
				}else
					{__CLOVER_182_0.cloverRec.S[15692]++;text+="NULL,";
				}__CLOVER_182_0.cloverRec.S[15693]++;if((((feature.tdeferred!=null) && (++__CLOVER_182_0.cloverRec.CT[3792]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3792]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[15694]++;no=reference_objet(feature.tdeferred);
					__CLOVER_182_0.cloverRec.S[15695]++;text+="&(global_token["+no+"]),";
				}
				}else
					{__CLOVER_182_0.cloverRec.S[15696]++;text+="NULL,";
				}__CLOVER_182_0.cloverRec.S[15697]++;if((((feature.texternal!=null) && (++__CLOVER_182_0.cloverRec.CT[3793]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3793]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[15698]++;no=reference_objet(feature.texternal);
					__CLOVER_182_0.cloverRec.S[15699]++;text+="&(global_token["+no+"]),";
				}
				}else
					{__CLOVER_182_0.cloverRec.S[15700]++;text+="NULL,";
				}__CLOVER_182_0.cloverRec.S[15701]++;if((((feature.talias!=null) && (++__CLOVER_182_0.cloverRec.CT[3794]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3794]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[15702]++;no=reference_objet(feature.talias);
					__CLOVER_182_0.cloverRec.S[15703]++;text+="&(global_token["+no+"]),";
				}
				}else
					{__CLOVER_182_0.cloverRec.S[15704]++;text+="NULL,";
				}__CLOVER_182_0.cloverRec.S[15705]++;if((((feature.tdo!=null) && (++__CLOVER_182_0.cloverRec.CT[3795]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3795]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[15706]++;no=reference_objet(feature.tdo);
					__CLOVER_182_0.cloverRec.S[15707]++;text+="&(global_token["+no+"])";
				}
				}else
					{__CLOVER_182_0.cloverRec.S[15708]++;text+="NULL";
				}__CLOVER_182_0.cloverRec.S[15709]++;res=EFeature.addElement(feature,text);
				__CLOVER_182_0.cloverRec.S[15710]++;if((((feature.classe!=null) && (++__CLOVER_182_0.cloverRec.CT[3796]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3796]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[15711]++;no=reference_objet(feature.classe);
					//text+="&(global_expr";
					//no2=EType.size();
					__CLOVER_182_0.cloverRec.S[15712]++;EInit.addElement("global_feature["+res+"].classe=&(global_classe["+no+"]);");
				}
			}}
		}}
		}else {__CLOVER_182_0.cloverRec.S[15713]++;if((((objet instanceof Commentaire) && (++__CLOVER_182_0.cloverRec.CT[3797]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3797]==0&false)))
		{{
			__CLOVER_182_0.cloverRec.S[15714]++;Commentaire commentaire=(Commentaire)objet;
			__CLOVER_182_0.cloverRec.S[15715]++;res=ECommentaire.no_objet(commentaire);
			__CLOVER_182_0.cloverRec.S[15716]++;if((((res==-1) && (++__CLOVER_182_0.cloverRec.CT[3798]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3798]==0&false)))
			{{
				__CLOVER_182_0.cloverRec.S[15717]++;text="\""+commentaire.str+"\",";
				__CLOVER_182_0.cloverRec.S[15718]++;if((((commentaire.debut!=null) && (++__CLOVER_182_0.cloverRec.CT[3799]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3799]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[15719]++;no=reference_objet(commentaire.debut);
					__CLOVER_182_0.cloverRec.S[15720]++;text+="&(global_token["+no+"])";
				}
				}else
					{__CLOVER_182_0.cloverRec.S[15721]++;text+="NULL";
				}__CLOVER_182_0.cloverRec.S[15722]++;res=ECommentaire.addElement(commentaire,text);
			}
		}}
		}else {__CLOVER_182_0.cloverRec.S[15723]++;if((((objet instanceof DeclareVar) && (++__CLOVER_182_0.cloverRec.CT[3800]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3800]==0&false)))
		{{
			__CLOVER_182_0.cloverRec.S[15724]++;DeclareVar declare_var=(DeclareVar)objet;
			__CLOVER_182_0.cloverRec.S[15725]++;res=EDeclareVar.no_objet(declare_var);
			__CLOVER_182_0.cloverRec.S[15726]++;if((((res==-1) && (++__CLOVER_182_0.cloverRec.CT[3801]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3801]==0&false)))
			{{
				__CLOVER_182_0.cloverRec.S[15727]++;text="\""+declare_var.nom+"\",";
				__CLOVER_182_0.cloverRec.S[15728]++;if((((declare_var.type!=null) && (++__CLOVER_182_0.cloverRec.CT[3802]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3802]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[15729]++;no=reference_objet(declare_var.type);
					__CLOVER_182_0.cloverRec.S[15730]++;text+="&(global_type["+no+"]),";
				}
				}else
					{__CLOVER_182_0.cloverRec.S[15731]++;text+="NULL,";
				}__CLOVER_182_0.cloverRec.S[15732]++;if((((declare_var.tnom!=null) && (++__CLOVER_182_0.cloverRec.CT[3803]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3803]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[15733]++;no=reference_objet(declare_var.tnom);
					__CLOVER_182_0.cloverRec.S[15734]++;text+="&(global_token["+no+"])";
				}
				}else
					{__CLOVER_182_0.cloverRec.S[15735]++;text+="NULL";
				}__CLOVER_182_0.cloverRec.S[15736]++;res=EDeclareVar.addElement(declare_var,text);
			}
		}}
		}else {__CLOVER_182_0.cloverRec.S[15737]++;if((((objet instanceof NomFeature) && (++__CLOVER_182_0.cloverRec.CT[3804]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3804]==0&false)))
		{{
			__CLOVER_182_0.cloverRec.S[15738]++;NomFeature nom_feature=(NomFeature)objet;
			__CLOVER_182_0.cloverRec.S[15739]++;res=ENomFeature.no_objet(nom_feature);
			__CLOVER_182_0.cloverRec.S[15740]++;if((((res==-1) && (++__CLOVER_182_0.cloverRec.CT[3805]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3805]==0&false)))
			{{
				__CLOVER_182_0.cloverRec.S[15741]++;if((((nom_feature.nom!=null) && (++__CLOVER_182_0.cloverRec.CT[3806]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3806]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[15742]++;text="TEIF_Nom_Normal,0,0,";
					__CLOVER_182_0.cloverRec.S[15743]++;if((((nom_feature.frozen) && (++__CLOVER_182_0.cloverRec.CT[3807]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3807]==0&false)))
						{__CLOVER_182_0.cloverRec.S[15744]++;text+="1,";
					}else
						{__CLOVER_182_0.cloverRec.S[15745]++;text+="0,";
					}__CLOVER_182_0.cloverRec.S[15746]++;text+="\""+nom_feature.nom+"\",NULL,";
				}
				}else
				{{
					__CLOVER_182_0.cloverRec.S[15747]++;text="TEIF_Nom_Operateur,";
					__CLOVER_182_0.cloverRec.S[15748]++;if((((nom_feature.prefix) && (++__CLOVER_182_0.cloverRec.CT[3808]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3808]==0&false)))
						{__CLOVER_182_0.cloverRec.S[15749]++;text+="1,";
					}else
						{__CLOVER_182_0.cloverRec.S[15750]++;text+="0,";
					}__CLOVER_182_0.cloverRec.S[15751]++;if((((nom_feature.infix) && (++__CLOVER_182_0.cloverRec.CT[3809]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3809]==0&false)))
						{__CLOVER_182_0.cloverRec.S[15752]++;text+="1,";
					}else
						{__CLOVER_182_0.cloverRec.S[15753]++;text+="0,";
					}__CLOVER_182_0.cloverRec.S[15754]++;if((((nom_feature.frozen) && (++__CLOVER_182_0.cloverRec.CT[3810]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3810]==0&false)))
						{__CLOVER_182_0.cloverRec.S[15755]++;text+="1,";
					}else
						{__CLOVER_182_0.cloverRec.S[15756]++;text+="0,";
					}__CLOVER_182_0.cloverRec.S[15757]++;text+="NULL,";
					__CLOVER_182_0.cloverRec.S[15758]++;no=reference_objet(nom_feature.nom2);
					__CLOVER_182_0.cloverRec.S[15759]++;text+="&(global_chaine["+no+"]),";
				}
				}__CLOVER_182_0.cloverRec.S[15760]++;if((((nom_feature.tnom!=null) && (++__CLOVER_182_0.cloverRec.CT[3811]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3811]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[15761]++;no=reference_objet(nom_feature.tnom);
					__CLOVER_182_0.cloverRec.S[15762]++;text+="&(global_token["+no+"]),";
				}
				}else
					{__CLOVER_182_0.cloverRec.S[15763]++;text+="NULL,";
				}__CLOVER_182_0.cloverRec.S[15764]++;if((((nom_feature.tpre_in!=null) && (++__CLOVER_182_0.cloverRec.CT[3812]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3812]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[15765]++;no=reference_objet(nom_feature.tpre_in);
					__CLOVER_182_0.cloverRec.S[15766]++;text+="&(global_token["+no+"]),";
				}
				}else
					{__CLOVER_182_0.cloverRec.S[15767]++;text+="NULL,";
				}__CLOVER_182_0.cloverRec.S[15768]++;if((((nom_feature.tfrozen!=null) && (++__CLOVER_182_0.cloverRec.CT[3813]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3813]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[15769]++;no=reference_objet(nom_feature.tfrozen);
					__CLOVER_182_0.cloverRec.S[15770]++;text+="&(global_token["+no+"]),";
				}
				}else
					{__CLOVER_182_0.cloverRec.S[15771]++;text+="NULL,";
				}__CLOVER_182_0.cloverRec.S[15772]++;if((((nom_feature.debut!=null) && (++__CLOVER_182_0.cloverRec.CT[3814]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3814]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[15773]++;no=reference_objet(nom_feature.debut);
					__CLOVER_182_0.cloverRec.S[15774]++;text+="&(global_position["+no+"]),";
				}
				}else
					{__CLOVER_182_0.cloverRec.S[15775]++;text+="NULL,";
				}__CLOVER_182_0.cloverRec.S[15776]++;if((((nom_feature.fin!=null) && (++__CLOVER_182_0.cloverRec.CT[3815]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3815]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[15777]++;no=reference_objet(nom_feature.fin);
					__CLOVER_182_0.cloverRec.S[15778]++;text+="&(global_position["+no+"])";
				}
				}else
					{__CLOVER_182_0.cloverRec.S[15779]++;text+="NULL";
				}__CLOVER_182_0.cloverRec.S[15780]++;res=ENomFeature.addElement(nom_feature,text);
			}
		}}
		}else {__CLOVER_182_0.cloverRec.S[15781]++;if((((objet instanceof Instr) && (++__CLOVER_182_0.cloverRec.CT[3816]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3816]==0&false)))
		{{
			__CLOVER_182_0.cloverRec.S[15782]++;Instr instr=(Instr)objet;
			__CLOVER_182_0.cloverRec.S[15783]++;res=EInstr.no_objet(instr);
			__CLOVER_182_0.cloverRec.S[15784]++;if((((res==-1) && (++__CLOVER_182_0.cloverRec.CT[3817]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3817]==0&false)))
			{{
				__CLOVER_182_0.cloverRec.S[15785]++;if((((instr instanceof Instr_Affect) && (++__CLOVER_182_0.cloverRec.CT[3818]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3818]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[15786]++;Instr_Affect ins=(Instr_Affect)instr;
					__CLOVER_182_0.cloverRec.S[15787]++;text="TEIF_Affect,";
					__CLOVER_182_0.cloverRec.S[15788]++;if((((ins.expr!=null) && (++__CLOVER_182_0.cloverRec.CT[3819]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3819]==0&false)))
					{{
						__CLOVER_182_0.cloverRec.S[15789]++;no=reference_objet(ins.expr);
						__CLOVER_182_0.cloverRec.S[15790]++;text+="&(global_expr["+no+"]),";
					}
					}else
						{__CLOVER_182_0.cloverRec.S[15791]++;text+="NULL,";
					}__CLOVER_182_0.cloverRec.S[15792]++;text+="NULL,NULL,NULL,";
					__CLOVER_182_0.cloverRec.S[15793]++;text+="\""+ins.nom+"\",";
					__CLOVER_182_0.cloverRec.S[15794]++;text+="\""+ins.var_current+"\",";
					__CLOVER_182_0.cloverRec.S[15795]++;text+="NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,";
					__CLOVER_182_0.cloverRec.S[15796]++;text+="0,0,0,0,0,0,0,0,0,";
					__CLOVER_182_0.cloverRec.S[15797]++;if((((ins.tid!=null) && (++__CLOVER_182_0.cloverRec.CT[3820]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3820]==0&false)))
					{{
						__CLOVER_182_0.cloverRec.S[15798]++;no=reference_objet(ins.tid);
						__CLOVER_182_0.cloverRec.S[15799]++;text+="&(global_token["+no+"]),";
					}
					}else
						{__CLOVER_182_0.cloverRec.S[15800]++;text+="NULL,";
					}__CLOVER_182_0.cloverRec.S[15801]++;if((((ins.tegal!=null) && (++__CLOVER_182_0.cloverRec.CT[3821]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3821]==0&false)))
					{{
						__CLOVER_182_0.cloverRec.S[15802]++;no=reference_objet(ins.tegal);
						__CLOVER_182_0.cloverRec.S[15803]++;text+="&(global_token["+no+"]),";
					}
					}else
						{__CLOVER_182_0.cloverRec.S[15804]++;text+="NULL,";
					}__CLOVER_182_0.cloverRec.S[15805]++;if((((ins.tcurrent!=null) && (++__CLOVER_182_0.cloverRec.CT[3822]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3822]==0&false)))
					{{
						__CLOVER_182_0.cloverRec.S[15806]++;no=reference_objet(ins.tcurrent);
						__CLOVER_182_0.cloverRec.S[15807]++;text+="&(global_token["+no+"]),";
					}
					}else
						{__CLOVER_182_0.cloverRec.S[15808]++;text+="NULL,";
					}__CLOVER_182_0.cloverRec.S[15809]++;text+="NULL,NULL,NULL";
				}
				}else {__CLOVER_182_0.cloverRec.S[15810]++;if((((instr instanceof Instr_Appel) && (++__CLOVER_182_0.cloverRec.CT[3823]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3823]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[15811]++;Instr_Appel ins=(Instr_Appel)instr;
					__CLOVER_182_0.cloverRec.S[15812]++;text="TEIF_Appel,";
					__CLOVER_182_0.cloverRec.S[15813]++;if((((ins.expr!=null) && (++__CLOVER_182_0.cloverRec.CT[3824]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3824]==0&false)))
					{{
						__CLOVER_182_0.cloverRec.S[15814]++;no=reference_objet(ins.expr);
						__CLOVER_182_0.cloverRec.S[15815]++;text+="&(global_expr["+no+"]),";
					}
					}else
						{__CLOVER_182_0.cloverRec.S[15816]++;text+="NULL,";
					}__CLOVER_182_0.cloverRec.S[15817]++;text+=ajoute_expr(ins.parametre)+",";
					__CLOVER_182_0.cloverRec.S[15818]++;text+="NULL,NULL,";
					__CLOVER_182_0.cloverRec.S[15819]++;text+="\""+ins.nom+"\",";
					__CLOVER_182_0.cloverRec.S[15820]++;text+="NULL,NULL,";
					__CLOVER_182_0.cloverRec.S[15821]++;if((((ins.getSuivant()!=null) && (++__CLOVER_182_0.cloverRec.CT[3825]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3825]==0&false)))
					{{
						__CLOVER_182_0.cloverRec.S[15822]++;no=reference_objet(ins.getSuivant());
						__CLOVER_182_0.cloverRec.S[15823]++;text+="&(global_instr["+no+"]),";
					}
					}else
						{__CLOVER_182_0.cloverRec.S[15824]++;text+="NULL,";
					}__CLOVER_182_0.cloverRec.S[15825]++;text+="NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,";
					__CLOVER_182_0.cloverRec.S[15826]++;text+=taille(ins.parametre);
					__CLOVER_182_0.cloverRec.S[15827]++;text+=",0,0,0,0,0,0,0,0,";
					__CLOVER_182_0.cloverRec.S[15828]++;if((((ins.tid!=null) && (++__CLOVER_182_0.cloverRec.CT[3826]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3826]==0&false)))
					{{
						__CLOVER_182_0.cloverRec.S[15829]++;no=reference_objet(ins.tid);
						__CLOVER_182_0.cloverRec.S[15830]++;text+="&(global_token["+no+"]),";
					}
					}else
						{__CLOVER_182_0.cloverRec.S[15831]++;text+="NULL,";
					}__CLOVER_182_0.cloverRec.S[15832]++;if((((ins.tpoint!=null) && (++__CLOVER_182_0.cloverRec.CT[3827]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3827]==0&false)))
					{{
						__CLOVER_182_0.cloverRec.S[15833]++;no=reference_objet(ins.tpoint);
						__CLOVER_182_0.cloverRec.S[15834]++;text+="&(global_token["+no+"]),";
					}
					}else
						{__CLOVER_182_0.cloverRec.S[15835]++;text+="NULL,";
					}__CLOVER_182_0.cloverRec.S[15836]++;text+="NULL,NULL,NULL,NULL";
				}
				}else {__CLOVER_182_0.cloverRec.S[15837]++;if((((instr instanceof Instr_Check) && (++__CLOVER_182_0.cloverRec.CT[3828]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3828]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[15838]++;Instr_Check ins=(Instr_Check)instr;
					__CLOVER_182_0.cloverRec.S[15839]++;text="TEIF_Check,";
					__CLOVER_182_0.cloverRec.S[15840]++;text+="NULL,NULL,NULL,NULL,NULL,NULL,"+
						"NULL,NULL,NULL,NULL,NULL,NULL,";
					__CLOVER_182_0.cloverRec.S[15841]++;text+=ajoute_assert(ins.liste_expr)+",";
					__CLOVER_182_0.cloverRec.S[15842]++;text+="NULL,NULL,NULL,";
					__CLOVER_182_0.cloverRec.S[15843]++;text+="0,0,0,0,0,0,";
					__CLOVER_182_0.cloverRec.S[15844]++;text+=taille(ins.liste_expr)+",0,0";
					__CLOVER_182_0.cloverRec.S[15845]++;if((((ins.tcheck!=null) && (++__CLOVER_182_0.cloverRec.CT[3829]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3829]==0&false)))
					{{
						__CLOVER_182_0.cloverRec.S[15846]++;no=reference_objet(ins.tcheck);
						__CLOVER_182_0.cloverRec.S[15847]++;text+="&(global_token["+no+"]),";
					}
					}else
						{__CLOVER_182_0.cloverRec.S[15848]++;text+="NULL,";
					}__CLOVER_182_0.cloverRec.S[15849]++;if((((ins.tend!=null) && (++__CLOVER_182_0.cloverRec.CT[3830]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3830]==0&false)))
					{{
						__CLOVER_182_0.cloverRec.S[15850]++;no=reference_objet(ins.tend);
						__CLOVER_182_0.cloverRec.S[15851]++;text+="&(global_token["+no+"]),";
					}
					}else
						{__CLOVER_182_0.cloverRec.S[15852]++;text+="NULL,";
					}__CLOVER_182_0.cloverRec.S[15853]++;text+="NULL,NULL,NULL,NULL";
				}
				}else {__CLOVER_182_0.cloverRec.S[15854]++;if((((instr instanceof Instr_Creation) && (++__CLOVER_182_0.cloverRec.CT[3831]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3831]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[15855]++;Instr_Creation ins=(Instr_Creation)instr;
					//if(ins.type!=null)
					//	reference_objet(ins.type);
					//ajoute(EExprT,ins.parametre);
					__CLOVER_182_0.cloverRec.S[15856]++;text="TEIF_Creation,";
					__CLOVER_182_0.cloverRec.S[15857]++;text+="NULL,";
					__CLOVER_182_0.cloverRec.S[15858]++;text+=ajoute_expr(ins.parametre)+",";
					__CLOVER_182_0.cloverRec.S[15859]++;text+="NULL,NULL,";
					__CLOVER_182_0.cloverRec.S[15860]++;text+="\""+ins.nom+"\",";
					__CLOVER_182_0.cloverRec.S[15861]++;text+="NULL,";
					__CLOVER_182_0.cloverRec.S[15862]++;if((((ins.nom2!=null) && (++__CLOVER_182_0.cloverRec.CT[3832]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3832]==0&false)))
					{{
						//System.io.println("nom2="+ins.nom2);
						__CLOVER_182_0.cloverRec.S[15863]++;text+="\""+ins.nom2+"\",";
					}
					}else
					{{
						//System.io.println("nom2=null");
						__CLOVER_182_0.cloverRec.S[15864]++;text+="NULL,";
					}
					/*if(ins.getSuivant()!=null)
					{
						no=reference_objet(ins.getSuivant());
						text+="&(global_instr["+no+"])";
					}
					else*/
						}__CLOVER_182_0.cloverRec.S[15865]++;text+="NULL,";
					__CLOVER_182_0.cloverRec.S[15866]++;text+="NULL,NULL,NULL,NULL,NULL,NULL,";
					__CLOVER_182_0.cloverRec.S[15867]++;if((((ins.type!=null) && (++__CLOVER_182_0.cloverRec.CT[3833]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3833]==0&false)))
					{{
						__CLOVER_182_0.cloverRec.S[15868]++;no=reference_objet(ins.type);
						__CLOVER_182_0.cloverRec.S[15869]++;text+="&(global_type["+no+"]),";
					}
					}else
						{__CLOVER_182_0.cloverRec.S[15870]++;text+="NULL,";
					}__CLOVER_182_0.cloverRec.S[15871]++;text+="NULL,";
					__CLOVER_182_0.cloverRec.S[15872]++;text+=taille(ins.parametre);
					__CLOVER_182_0.cloverRec.S[15873]++;text+=",0,0,0,0,0,0,0,0,";
					__CLOVER_182_0.cloverRec.S[15874]++;if((((ins.texcl1!=null) && (++__CLOVER_182_0.cloverRec.CT[3834]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3834]==0&false)))
					{{
						__CLOVER_182_0.cloverRec.S[15875]++;no=reference_objet(ins.texcl1);
						__CLOVER_182_0.cloverRec.S[15876]++;text+="&(global_token["+no+"]),";
					}
					}else
						{__CLOVER_182_0.cloverRec.S[15877]++;text+="NULL,";
					}__CLOVER_182_0.cloverRec.S[15878]++;if((((ins.texcl2!=null) && (++__CLOVER_182_0.cloverRec.CT[3835]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3835]==0&false)))
					{{
						__CLOVER_182_0.cloverRec.S[15879]++;no=reference_objet(ins.texcl2);
						__CLOVER_182_0.cloverRec.S[15880]++;text+="&(global_token["+no+"]),";
					}
					}else
						{__CLOVER_182_0.cloverRec.S[15881]++;text+="NULL,";
					}__CLOVER_182_0.cloverRec.S[15882]++;if((((ins.tid!=null) && (++__CLOVER_182_0.cloverRec.CT[3836]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3836]==0&false)))
					{{
						__CLOVER_182_0.cloverRec.S[15883]++;no=reference_objet(ins.tid);
						__CLOVER_182_0.cloverRec.S[15884]++;text+="&(global_token["+no+"]),";
					}
					}else
						{__CLOVER_182_0.cloverRec.S[15885]++;text+="NULL,";
					}__CLOVER_182_0.cloverRec.S[15886]++;if((((ins.tid2!=null) && (++__CLOVER_182_0.cloverRec.CT[3837]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3837]==0&false)))
					{{
						__CLOVER_182_0.cloverRec.S[15887]++;no=reference_objet(ins.tid2);
						__CLOVER_182_0.cloverRec.S[15888]++;text+="&(global_token["+no+"]),";
					}
					}else
						{__CLOVER_182_0.cloverRec.S[15889]++;text+="NULL,";
					}__CLOVER_182_0.cloverRec.S[15890]++;if((((ins.tpoint!=null) && (++__CLOVER_182_0.cloverRec.CT[3838]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3838]==0&false)))
					{{
						__CLOVER_182_0.cloverRec.S[15891]++;no=reference_objet(ins.tpoint);
						__CLOVER_182_0.cloverRec.S[15892]++;text+="&(global_token["+no+"]),";
					}
					}else
						{__CLOVER_182_0.cloverRec.S[15893]++;text+="NULL,";
					}__CLOVER_182_0.cloverRec.S[15894]++;text+="NULL";
				}
				}else {__CLOVER_182_0.cloverRec.S[15895]++;if((((instr instanceof Instr_Debug) && (++__CLOVER_182_0.cloverRec.CT[3839]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3839]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[15896]++;Instr_Debug ins=(Instr_Debug)instr;
					__CLOVER_182_0.cloverRec.S[15897]++;text="TEIF_Debug,";
					__CLOVER_182_0.cloverRec.S[15898]++;text+="NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,";
					//text+=ajoute_instr(ins.instr)+",";
					__CLOVER_182_0.cloverRec.S[15899]++;text+="NULL,";
					__CLOVER_182_0.cloverRec.S[15900]++;text+="NULL,NULL,NULL,NULL,NULL,NULL,";
					__CLOVER_182_0.cloverRec.S[15901]++;text+=ajoute_chaine(ins.chaine)+",";
					__CLOVER_182_0.cloverRec.S[15902]++;text+="0,0,"+taille(ins.instr)+",0,0,0,0,0,"+taille(ins.chaine)+",";
					__CLOVER_182_0.cloverRec.S[15903]++;if((((ins.tdebug!=null) && (++__CLOVER_182_0.cloverRec.CT[3840]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3840]==0&false)))
					{{
						__CLOVER_182_0.cloverRec.S[15904]++;no=reference_objet(ins.tdebug);
						__CLOVER_182_0.cloverRec.S[15905]++;text+="&(global_token["+no+"]),";
					}
					}else
						{__CLOVER_182_0.cloverRec.S[15906]++;text+="NULL,";
					}__CLOVER_182_0.cloverRec.S[15907]++;if((((ins.tend!=null) && (++__CLOVER_182_0.cloverRec.CT[3841]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3841]==0&false)))
					{{
						__CLOVER_182_0.cloverRec.S[15908]++;no=reference_objet(ins.tend);
						__CLOVER_182_0.cloverRec.S[15909]++;text+="&(global_token["+no+"]),";
					}
					}else
						{__CLOVER_182_0.cloverRec.S[15910]++;text+="NULL,";
					}__CLOVER_182_0.cloverRec.S[15911]++;text+="NULL,NULL,NULL,NULL";
				}
				}else {__CLOVER_182_0.cloverRec.S[15912]++;if((((instr instanceof Instr_Else) && (++__CLOVER_182_0.cloverRec.CT[3842]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3842]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[15913]++;Instr_Else ins=(Instr_Else)instr;
					__CLOVER_182_0.cloverRec.S[15914]++;text="TEIF_Else,";
					__CLOVER_182_0.cloverRec.S[15915]++;text+="NULL,NULL,NULL,NULL,NULL,NULL,NULL,";
					__CLOVER_182_0.cloverRec.S[15916]++;if((((ins.getSuivant()!=null) && (++__CLOVER_182_0.cloverRec.CT[3843]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3843]==0&false)))
					{{
						__CLOVER_182_0.cloverRec.S[15917]++;no=reference_objet(ins.getSuivant());
						__CLOVER_182_0.cloverRec.S[15918]++;text+="&(global_instr["+no+"]),";
					}
					}else
						{__CLOVER_182_0.cloverRec.S[15919]++;text+="NULL,";
					}__CLOVER_182_0.cloverRec.S[15920]++;text+="NULL,";
					//text+=ajoute_instr(ins.liste_instr)+",";
					__CLOVER_182_0.cloverRec.S[15921]++;text+="NULL,";
					__CLOVER_182_0.cloverRec.S[15922]++;text+="NULL,NULL,NULL,NULL,NULL,NULL,";
					__CLOVER_182_0.cloverRec.S[15923]++;text+="0,0,0,"+taille(ins.liste_instr)+",0,0,0,0,0,";
					__CLOVER_182_0.cloverRec.S[15924]++;if((((ins.telse!=null) && (++__CLOVER_182_0.cloverRec.CT[3844]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3844]==0&false)))
					{{
						__CLOVER_182_0.cloverRec.S[15925]++;no=reference_objet(ins.telse);
						__CLOVER_182_0.cloverRec.S[15926]++;text+="&(global_token["+no+"]),";
					}
					}else
						{__CLOVER_182_0.cloverRec.S[15927]++;text+="NULL,";
					}__CLOVER_182_0.cloverRec.S[15928]++;text+="NULL,NULL,NULL,NULL,NULL";
				}
				}else {__CLOVER_182_0.cloverRec.S[15929]++;if((((instr instanceof Instr_ElseIf) && (++__CLOVER_182_0.cloverRec.CT[3845]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3845]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[15930]++;Instr_ElseIf ins=(Instr_ElseIf)instr;
					__CLOVER_182_0.cloverRec.S[15931]++;text="TEIF_ElseIf,";
					__CLOVER_182_0.cloverRec.S[15932]++;if((((ins.expr!=null) && (++__CLOVER_182_0.cloverRec.CT[3846]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3846]==0&false)))
					{{
						__CLOVER_182_0.cloverRec.S[15933]++;no=reference_objet(ins.expr);
						__CLOVER_182_0.cloverRec.S[15934]++;text+="&(global_expr["+no+"]),";
					}
					}else
						{__CLOVER_182_0.cloverRec.S[15935]++;text+="NULL,";
					}__CLOVER_182_0.cloverRec.S[15936]++;text+="NULL,NULL,NULL,NULL,NULL,NULL,";
					__CLOVER_182_0.cloverRec.S[15937]++;if((((ins.getSuivant()!=null) && (++__CLOVER_182_0.cloverRec.CT[3847]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3847]==0&false)))
					{{
						__CLOVER_182_0.cloverRec.S[15938]++;no=reference_objet(ins.getSuivant());
						__CLOVER_182_0.cloverRec.S[15939]++;text+="&(global_instr["+no+"]),";
					}
					}else
						{__CLOVER_182_0.cloverRec.S[15940]++;text+="NULL,";
					}__CLOVER_182_0.cloverRec.S[15941]++;text+="NULL,NULL,";
					//text+=ajoute_instr(ins.liste_instr)+",";
					//text+="NULL,";
					__CLOVER_182_0.cloverRec.S[15942]++;text+="NULL,NULL,NULL,NULL,NULL,NULL,";
					__CLOVER_182_0.cloverRec.S[15943]++;text+="0,0,0,"+taille(ins.liste_instr)+",0,0,0,0,0,";
					__CLOVER_182_0.cloverRec.S[15944]++;if((((ins.telseif!=null) && (++__CLOVER_182_0.cloverRec.CT[3848]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3848]==0&false)))
					{{
						__CLOVER_182_0.cloverRec.S[15945]++;no=reference_objet(ins.telseif);
						__CLOVER_182_0.cloverRec.S[15946]++;text+="&(global_token["+no+"]),";
					}
					}else
						{__CLOVER_182_0.cloverRec.S[15947]++;text+="NULL,";
					}__CLOVER_182_0.cloverRec.S[15948]++;if((((ins.tthen!=null) && (++__CLOVER_182_0.cloverRec.CT[3849]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3849]==0&false)))
					{{
						__CLOVER_182_0.cloverRec.S[15949]++;no=reference_objet(ins.tthen);
						__CLOVER_182_0.cloverRec.S[15950]++;text+="&(global_token["+no+"]),";
					}
					}else
						{__CLOVER_182_0.cloverRec.S[15951]++;text+="NULL,";
					}__CLOVER_182_0.cloverRec.S[15952]++;text+="NULL,NULL,NULL,NULL";
				}
				}else {__CLOVER_182_0.cloverRec.S[15953]++;if((((instr instanceof Instr_If) && (++__CLOVER_182_0.cloverRec.CT[3850]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3850]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[15954]++;Instr_If ins=(Instr_If)instr;
					__CLOVER_182_0.cloverRec.S[15955]++;text="TEIF_If,";
					__CLOVER_182_0.cloverRec.S[15956]++;if((((ins.expr!=null) && (++__CLOVER_182_0.cloverRec.CT[3851]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3851]==0&false)))
					{{
						__CLOVER_182_0.cloverRec.S[15957]++;no=reference_objet(ins.expr);
						__CLOVER_182_0.cloverRec.S[15958]++;text+="&(global_expr["+no+"]),";
					}
					}else
						{__CLOVER_182_0.cloverRec.S[15959]++;text+="NULL,";
					}__CLOVER_182_0.cloverRec.S[15960]++;text+="NULL,NULL,NULL,NULL,NULL,NULL,";
					__CLOVER_182_0.cloverRec.S[15961]++;if((((ins.getSuivant()!=null) && (++__CLOVER_182_0.cloverRec.CT[3852]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3852]==0&false)))
					{{
						__CLOVER_182_0.cloverRec.S[15962]++;no=reference_objet(ins.getSuivant());
						__CLOVER_182_0.cloverRec.S[15963]++;text+="&(global_instr["+no+"]),";
					}
					}else
						{__CLOVER_182_0.cloverRec.S[15964]++;text+="NULL,";
					}__CLOVER_182_0.cloverRec.S[15965]++;text+="NULL,NULL,";
					//text+=ajoute_instr(ins.liste_instr)+",";
					//text+="NULL,";
					__CLOVER_182_0.cloverRec.S[15966]++;text+="NULL,NULL,NULL,NULL,NULL,NULL,";
					__CLOVER_182_0.cloverRec.S[15967]++;text+="0,0,0,"+taille(ins.liste_instr)+",0,0,0,0,0,";
					__CLOVER_182_0.cloverRec.S[15968]++;if((((ins.tif!=null) && (++__CLOVER_182_0.cloverRec.CT[3853]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3853]==0&false)))
					{{
						__CLOVER_182_0.cloverRec.S[15969]++;no=reference_objet(ins.tif);
						__CLOVER_182_0.cloverRec.S[15970]++;text+="&(global_token["+no+"]),";
					}
					}else
						{__CLOVER_182_0.cloverRec.S[15971]++;text+="NULL,";
					}__CLOVER_182_0.cloverRec.S[15972]++;if((((ins.tthen!=null) && (++__CLOVER_182_0.cloverRec.CT[3854]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3854]==0&false)))
					{{
						__CLOVER_182_0.cloverRec.S[15973]++;no=reference_objet(ins.tthen);
						__CLOVER_182_0.cloverRec.S[15974]++;text+="&(global_token["+no+"]),";
					}
					}else
						{__CLOVER_182_0.cloverRec.S[15975]++;text+="NULL,";
					}__CLOVER_182_0.cloverRec.S[15976]++;text+="NULL,NULL,NULL,NULL";
				}
				}else {__CLOVER_182_0.cloverRec.S[15977]++;if((((instr instanceof Instr_Inspect) && (++__CLOVER_182_0.cloverRec.CT[3855]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3855]==0&false)))
				{{// TODO: penser au when
					__CLOVER_182_0.cloverRec.S[15978]++;Instr_Inspect ins=(Instr_Inspect)instr;
					__CLOVER_182_0.cloverRec.S[15979]++;text="TEIF_Inspect,";
					__CLOVER_182_0.cloverRec.S[15980]++;if((((ins.expr!=null) && (++__CLOVER_182_0.cloverRec.CT[3856]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3856]==0&false)))
					{{
						__CLOVER_182_0.cloverRec.S[15981]++;no=reference_objet(ins.expr);
						__CLOVER_182_0.cloverRec.S[15982]++;text+="&(global_expr["+no+"]),";
					}
					}else
						{__CLOVER_182_0.cloverRec.S[15983]++;text+="NULL,";
					}__CLOVER_182_0.cloverRec.S[15984]++;text+="NULL,NULL,NULL,NULL,NULL,NULL,NULL,";
					__CLOVER_182_0.cloverRec.S[15985]++;if((((ins.getSuivant()!=null) && (++__CLOVER_182_0.cloverRec.CT[3857]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3857]==0&false)))
					{{
						__CLOVER_182_0.cloverRec.S[15986]++;no=reference_objet(ins.getSuivant());
						__CLOVER_182_0.cloverRec.S[15987]++;text+="&(global_instr["+no+"]),";
					}
					}else
						{__CLOVER_182_0.cloverRec.S[15988]++;text+="NULL,";
					}__CLOVER_182_0.cloverRec.S[15989]++;text+="NULL,";
					//text+=ajoute_instr(ins.liste_instr)+",";
					__CLOVER_182_0.cloverRec.S[15990]++;text+="NULL,";
					__CLOVER_182_0.cloverRec.S[15991]++;text+="NULL,NULL,NULL,NULL,NULL,NULL,";
					__CLOVER_182_0.cloverRec.S[15992]++;text+="0,0,0,"+taille(ins.liste_instr)+",0,0,0,0,0,";
					__CLOVER_182_0.cloverRec.S[15993]++;if((((ins.tinspect!=null) && (++__CLOVER_182_0.cloverRec.CT[3858]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3858]==0&false)))
					{{
						__CLOVER_182_0.cloverRec.S[15994]++;no=reference_objet(ins.tinspect);
						__CLOVER_182_0.cloverRec.S[15995]++;text+="&(global_token["+no+"]),";
					}
					}else
						{__CLOVER_182_0.cloverRec.S[15996]++;text+="NULL,";
					}__CLOVER_182_0.cloverRec.S[15997]++;if((((ins.twhen!=null) && (++__CLOVER_182_0.cloverRec.CT[3859]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3859]==0&false)))
					{{
						__CLOVER_182_0.cloverRec.S[15998]++;no=reference_objet(ins.twhen);
						__CLOVER_182_0.cloverRec.S[15999]++;text+="&(global_token["+no+"]),";
					}
					}else
						{__CLOVER_182_0.cloverRec.S[16000]++;text+="NULL,";
					}__CLOVER_182_0.cloverRec.S[16001]++;if((((ins.tthen!=null) && (++__CLOVER_182_0.cloverRec.CT[3860]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3860]==0&false)))
					{{
						__CLOVER_182_0.cloverRec.S[16002]++;no=reference_objet(ins.tthen);
						__CLOVER_182_0.cloverRec.S[16003]++;text+="&(global_token["+no+"]),";
					}
					}else
						{__CLOVER_182_0.cloverRec.S[16004]++;text+="NULL,";
					}__CLOVER_182_0.cloverRec.S[16005]++;text+="NULL,NULL,NULL";
				}
				}else {__CLOVER_182_0.cloverRec.S[16006]++;if((((instr instanceof Instr_Loop) && (++__CLOVER_182_0.cloverRec.CT[3861]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3861]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[16007]++;Instr_Loop ins=(Instr_Loop)instr;
					__CLOVER_182_0.cloverRec.S[16008]++;text="TEIF_Loop,";
					__CLOVER_182_0.cloverRec.S[16009]++;if((((ins.expr!=null) && (++__CLOVER_182_0.cloverRec.CT[3862]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3862]==0&false)))
					{{
						__CLOVER_182_0.cloverRec.S[16010]++;no=reference_objet(ins.expr);
						__CLOVER_182_0.cloverRec.S[16011]++;text+="&(global_expr["+no+"]),";
					}
					}else
						{__CLOVER_182_0.cloverRec.S[16012]++;text+="NULL,";
					}__CLOVER_182_0.cloverRec.S[16013]++;text+="NULL,";
					__CLOVER_182_0.cloverRec.S[16014]++;if((((ins.variant!=null) && (++__CLOVER_182_0.cloverRec.CT[3863]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3863]==0&false)))
					{{
						__CLOVER_182_0.cloverRec.S[16015]++;no=reference_objet(ins.variant);
						__CLOVER_182_0.cloverRec.S[16016]++;text+="&(global_expr["+no+"]),";
					}
					}else
						{__CLOVER_182_0.cloverRec.S[16017]++;text+="NULL,";
					}__CLOVER_182_0.cloverRec.S[16018]++;text+="NULL,NULL,NULL,NULL,NULL,NULL,NULL,";
					//text+=ajoute_instr(ins.from)+",";
					//text+=ajoute_instr(ins.loop)+",";
					__CLOVER_182_0.cloverRec.S[16019]++;text+="NULL,";
					__CLOVER_182_0.cloverRec.S[16020]++;text+="NULL,";
					__CLOVER_182_0.cloverRec.S[16021]++;text+="NULL,";
					__CLOVER_182_0.cloverRec.S[16022]++;text+=ajoute_assert(ins.invariant)+",";
					__CLOVER_182_0.cloverRec.S[16023]++;text+="NULL,NULL,";
					__CLOVER_182_0.cloverRec.S[16024]++;text+="0,0,0,0,"+taille(ins.from)+","+
						taille(ins.loop)+",0,"+taille(ins.invariant)+",0,";
					__CLOVER_182_0.cloverRec.S[16025]++;if((((ins.tfrom!=null) && (++__CLOVER_182_0.cloverRec.CT[3864]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3864]==0&false)))
					{{
						__CLOVER_182_0.cloverRec.S[16026]++;no=reference_objet(ins.tfrom);
						__CLOVER_182_0.cloverRec.S[16027]++;text+="&(global_token["+no+"]),";
					}
					}else
						{__CLOVER_182_0.cloverRec.S[16028]++;text+="NULL,";
					}__CLOVER_182_0.cloverRec.S[16029]++;if((((ins.tuntil!=null) && (++__CLOVER_182_0.cloverRec.CT[3865]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3865]==0&false)))
					{{
						__CLOVER_182_0.cloverRec.S[16030]++;no=reference_objet(ins.tuntil);
						__CLOVER_182_0.cloverRec.S[16031]++;text+="&(global_token["+no+"]),";
					}
					}else
						{__CLOVER_182_0.cloverRec.S[16032]++;text+="NULL,";
					}__CLOVER_182_0.cloverRec.S[16033]++;if((((ins.tinvariant!=null) && (++__CLOVER_182_0.cloverRec.CT[3866]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3866]==0&false)))
					{{
						__CLOVER_182_0.cloverRec.S[16034]++;no=reference_objet(ins.tinvariant);
						__CLOVER_182_0.cloverRec.S[16035]++;text+="&(global_token["+no+"]),";
					}
					}else
						{__CLOVER_182_0.cloverRec.S[16036]++;text+="NULL,";
					}__CLOVER_182_0.cloverRec.S[16037]++;if((((ins.tvariant!=null) && (++__CLOVER_182_0.cloverRec.CT[3867]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3867]==0&false)))
					{{
						__CLOVER_182_0.cloverRec.S[16038]++;no=reference_objet(ins.tvariant);
						__CLOVER_182_0.cloverRec.S[16039]++;text+="&(global_token["+no+"]),";
					}
					}else
						{__CLOVER_182_0.cloverRec.S[16040]++;text+="NULL,";
					}__CLOVER_182_0.cloverRec.S[16041]++;if((((ins.tloop!=null) && (++__CLOVER_182_0.cloverRec.CT[3868]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3868]==0&false)))
					{{
						__CLOVER_182_0.cloverRec.S[16042]++;no=reference_objet(ins.tloop);
						__CLOVER_182_0.cloverRec.S[16043]++;text+="&(global_token["+no+"]),";
					}
					}else
						{__CLOVER_182_0.cloverRec.S[16044]++;text+="NULL,";
					}__CLOVER_182_0.cloverRec.S[16045]++;if((((ins.tend!=null) && (++__CLOVER_182_0.cloverRec.CT[3869]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3869]==0&false)))
					{{
						__CLOVER_182_0.cloverRec.S[16046]++;no=reference_objet(ins.tend);
						__CLOVER_182_0.cloverRec.S[16047]++;text+="&(global_token["+no+"])";
					}
					}else
						{__CLOVER_182_0.cloverRec.S[16048]++;text+="NULL";
				}}
				}else {__CLOVER_182_0.cloverRec.S[16049]++;if((((instr instanceof Instr_TentAffect) && (++__CLOVER_182_0.cloverRec.CT[3870]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3870]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[16050]++;Instr_TentAffect ins=(Instr_TentAffect)instr;
					__CLOVER_182_0.cloverRec.S[16051]++;text="TEIF_TentAffect,";
					__CLOVER_182_0.cloverRec.S[16052]++;if((((ins.expr!=null) && (++__CLOVER_182_0.cloverRec.CT[3871]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3871]==0&false)))
					{{
						__CLOVER_182_0.cloverRec.S[16053]++;no=reference_objet(ins.expr);
						__CLOVER_182_0.cloverRec.S[16054]++;text+="&(global_expr["+no+"]),";
					}
					}else
						{__CLOVER_182_0.cloverRec.S[16055]++;text+="NULL,";
					}__CLOVER_182_0.cloverRec.S[16056]++;text+="NULL,NULL,NULL,";
					__CLOVER_182_0.cloverRec.S[16057]++;text+="\""+ins.nom+"\",";
					__CLOVER_182_0.cloverRec.S[16058]++;text+="\""+ins.var_current+"\",";
					__CLOVER_182_0.cloverRec.S[16059]++;text+="NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,";
					__CLOVER_182_0.cloverRec.S[16060]++;text+="0,0,0,0,0,0,0,0,0,";
					__CLOVER_182_0.cloverRec.S[16061]++;if((((ins.tid!=null) && (++__CLOVER_182_0.cloverRec.CT[3872]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3872]==0&false)))
					{{
						__CLOVER_182_0.cloverRec.S[16062]++;no=reference_objet(ins.tid);
						__CLOVER_182_0.cloverRec.S[16063]++;text+="&(global_token["+no+"])";
					}
					}else
						{__CLOVER_182_0.cloverRec.S[16064]++;text+="NULL";
					}__CLOVER_182_0.cloverRec.S[16065]++;if((((ins.tegal!=null) && (++__CLOVER_182_0.cloverRec.CT[3873]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3873]==0&false)))
					{{
						__CLOVER_182_0.cloverRec.S[16066]++;no=reference_objet(ins.tegal);
						__CLOVER_182_0.cloverRec.S[16067]++;text+="&(global_token["+no+"])";
					}
					}else
						{__CLOVER_182_0.cloverRec.S[16068]++;text+="NULL";
					}__CLOVER_182_0.cloverRec.S[16069]++;if((((ins.tcurrent!=null) && (++__CLOVER_182_0.cloverRec.CT[3874]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3874]==0&false)))
					{{
						__CLOVER_182_0.cloverRec.S[16070]++;no=reference_objet(ins.tcurrent);
						__CLOVER_182_0.cloverRec.S[16071]++;text+="&(global_token["+no+"])";
					}
					}else
						{__CLOVER_182_0.cloverRec.S[16072]++;text+="NULL";
					}__CLOVER_182_0.cloverRec.S[16073]++;text+="NULL,NULL,NULL";
				}
				}else {__CLOVER_182_0.cloverRec.S[16074]++;if((((instr instanceof Instr_Retry) && (++__CLOVER_182_0.cloverRec.CT[3875]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3875]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[16075]++;Instr_Retry ins=(Instr_Retry)instr;
					__CLOVER_182_0.cloverRec.S[16076]++;text="TEIF_Retry,";
					__CLOVER_182_0.cloverRec.S[16077]++;text+="NULL,";
					__CLOVER_182_0.cloverRec.S[16078]++;text+="NULL,NULL,NULL,";
					__CLOVER_182_0.cloverRec.S[16079]++;text+="NULL,";
					__CLOVER_182_0.cloverRec.S[16080]++;text+="NULL,";
					__CLOVER_182_0.cloverRec.S[16081]++;text+="NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,";
					__CLOVER_182_0.cloverRec.S[16082]++;text+="0,0,0,0,0,0,0,0,0,";
					__CLOVER_182_0.cloverRec.S[16083]++;if((((ins.tretry!=null) && (++__CLOVER_182_0.cloverRec.CT[3876]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3876]==0&false)))
					{{
						__CLOVER_182_0.cloverRec.S[16084]++;no=reference_objet(ins.tretry);
						__CLOVER_182_0.cloverRec.S[16085]++;text+="&(global_token["+no+"]),";
					}
					}else
						{__CLOVER_182_0.cloverRec.S[16086]++;text+="NULL,";
					}__CLOVER_182_0.cloverRec.S[16087]++;text+="NULL,NULL,NULL,NULL,NULL";
				}
				}else
				{{
					__CLOVER_182_0.cloverRec.S[16088]++;text="";
					assert((((false)) && (++__CLOVER_182_0.cloverRec.CT[3877]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3877]==0&false));
				}
				}}}}}}}}}}}}__CLOVER_182_0.cloverRec.S[16089]++;res=EInstr.addElement(instr,text);
				__CLOVER_182_0.cloverRec.S[16090]++;if((((instr instanceof Instr_Debug&&
					((Instr_Debug)instr).instr!=null&&
					((Instr_Debug)instr).instr.length>0) && (++__CLOVER_182_0.cloverRec.CT[3878]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3878]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[16091]++;Instr_Debug ins=(Instr_Debug)instr;
					//no=reference_objet(expr.parametre);
					//text+="&(global_expr";
					//no2=EType.size();
					__CLOVER_182_0.cloverRec.S[16092]++;EInit.addElement("global_instr["+res+"].instr="+ajoute_instr(ins.instr)+";");
					//EInit.addElement("global_expr["+res+"].taille_tableau="+exp.parametre.size()+";");
				}
				}else {__CLOVER_182_0.cloverRec.S[16093]++;if((((instr instanceof Instr_Else&&
					((Instr_Else)instr).liste_instr!=null&&
					((Instr_Else)instr).liste_instr.length>0) && (++__CLOVER_182_0.cloverRec.CT[3879]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3879]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[16094]++;Instr_Else ins=(Instr_Else)instr;
					//no=reference_objet(expr.parametre);
					//text+="&(global_expr";
					//no2=EType.size();
					__CLOVER_182_0.cloverRec.S[16095]++;EInit.addElement("global_instr["+res+"].liste_instr="+ajoute_instr(ins.liste_instr)+";");
					//EInit.addElement("global_expr["+res+"].taille_tableau="+exp.parametre.size()+";");
				}
				}else {__CLOVER_182_0.cloverRec.S[16096]++;if((((instr instanceof Instr_ElseIf&&
					((Instr_ElseIf)instr).liste_instr!=null&&
					((Instr_ElseIf)instr).liste_instr.length>0) && (++__CLOVER_182_0.cloverRec.CT[3880]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3880]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[16097]++;Instr_ElseIf ins=(Instr_ElseIf)instr;
					//no=reference_objet(expr.parametre);
					//text+="&(global_expr";
					//no2=EType.size();
					__CLOVER_182_0.cloverRec.S[16098]++;EInit.addElement("global_instr["+res+"].liste_instr="+ajoute_instr(ins.liste_instr)+";");
					//EInit.addElement("global_expr["+res+"].taille_tableau="+exp.parametre.size()+";");
				}
				}else {__CLOVER_182_0.cloverRec.S[16099]++;if((((instr instanceof Instr_If&&
					((Instr_If)instr).liste_instr!=null&&
					((Instr_If)instr).liste_instr.length>0) && (++__CLOVER_182_0.cloverRec.CT[3881]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3881]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[16100]++;Instr_If ins=(Instr_If)instr;
					//no=reference_objet(expr.parametre);
					//text+="&(global_expr";
					//no2=EType.size();
					__CLOVER_182_0.cloverRec.S[16101]++;EInit.addElement("global_instr["+res+"].liste_instr="+ajoute_instr(ins.liste_instr)+";");
					//EInit.addElement("global_expr["+res+"].taille_tableau="+exp.parametre.size()+";");
				}
				}else {__CLOVER_182_0.cloverRec.S[16102]++;if((((instr instanceof Instr_Inspect&&
					((Instr_Inspect)instr).liste_instr!=null&&
					((Instr_Inspect)instr).liste_instr.length>0) && (++__CLOVER_182_0.cloverRec.CT[3882]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3882]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[16103]++;Instr_Inspect ins=(Instr_Inspect)instr;
					//no=reference_objet(expr.parametre);
					//text+="&(global_expr";
					//no2=EType.size();
					__CLOVER_182_0.cloverRec.S[16104]++;EInit.addElement("global_instr["+res+"].liste_instr="+ajoute_instr(ins.liste_instr)+";");
					//EInit.addElement("global_expr["+res+"].taille_tableau="+exp.parametre.size()+";");
				}
				}else {__CLOVER_182_0.cloverRec.S[16105]++;if((((instr instanceof Instr_Loop) && (++__CLOVER_182_0.cloverRec.CT[3883]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3883]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[16106]++;if((((((Instr_Loop)instr).from!=null&&
					((Instr_Loop)instr).from.length>0) && (++__CLOVER_182_0.cloverRec.CT[3884]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3884]==0&false)))
					{{
						__CLOVER_182_0.cloverRec.S[16107]++;Instr_Loop ins=(Instr_Loop)instr;
						__CLOVER_182_0.cloverRec.S[16108]++;EInit.addElement("global_instr["+res+"].from="+ajoute_instr(ins.from)+";");
					}
					}__CLOVER_182_0.cloverRec.S[16109]++;if((((((Instr_Loop)instr).loop!=null&&
					((Instr_Loop)instr).loop.length>0) && (++__CLOVER_182_0.cloverRec.CT[3885]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3885]==0&false)))
					{{
						__CLOVER_182_0.cloverRec.S[16110]++;Instr_Loop ins=(Instr_Loop)instr;
						__CLOVER_182_0.cloverRec.S[16111]++;EInit.addElement("global_instr["+res+"].loop="+ajoute_instr(ins.loop)+";");
					}
				}}
				/*else if(instr instanceof Instr_Creation)
				{
					if(((Instr_Creation)instr).getSuivant!=null)
					{
						Instr_Creation ins=(Instr_Creation)instr;
						//EInit.addElement("global_instr["+res+"].suivant="+ajoute_instr(ins.getSuivant())+";");
					}
					/*if(ins.getSuivant()!=null)
					{
						no=reference_objet(ins.getSuivant());
						text+="&(global_instr["+no+"])";
					}
					else* /
					//	text+="NULL,";
				}*/
			}}}}}}}
		}}
		}else {__CLOVER_182_0.cloverRec.S[16112]++;if((((objet instanceof Assert) && (++__CLOVER_182_0.cloverRec.CT[3886]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3886]==0&false)))
		{{
			__CLOVER_182_0.cloverRec.S[16113]++;Assert assertion=(Assert)objet;
			__CLOVER_182_0.cloverRec.S[16114]++;res=EAssert.no_objet(assertion);
			__CLOVER_182_0.cloverRec.S[16115]++;if((((res==-1) && (++__CLOVER_182_0.cloverRec.CT[3887]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3887]==0&false)))
			{{
				__CLOVER_182_0.cloverRec.S[16116]++;if((((assertion.nom!=null) && (++__CLOVER_182_0.cloverRec.CT[3888]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3888]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[16117]++;text="\""+assertion.nom+"\",";
				}
				}else
					{__CLOVER_182_0.cloverRec.S[16118]++;text="NULL,";
				}__CLOVER_182_0.cloverRec.S[16119]++;if((((assertion.expr!=null) && (++__CLOVER_182_0.cloverRec.CT[3889]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3889]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[16120]++;no=reference_objet(assertion.expr);
					__CLOVER_182_0.cloverRec.S[16121]++;text+="&(global_expr["+no+"])";
				}
				}else
					{__CLOVER_182_0.cloverRec.S[16122]++;text+="NULL,";
				}__CLOVER_182_0.cloverRec.S[16123]++;res=EAssert.addElement(assertion,text);
			}
		}}
		}else {__CLOVER_182_0.cloverRec.S[16124]++;if((((objet instanceof Expr) && (++__CLOVER_182_0.cloverRec.CT[3890]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3890]==0&false)))
		{{
			__CLOVER_182_0.cloverRec.S[16125]++;Expr expr=(Expr)objet;
			__CLOVER_182_0.cloverRec.S[16126]++;res=EExpr.no_objet(expr);
			__CLOVER_182_0.cloverRec.S[16127]++;if((((res==-1) && (++__CLOVER_182_0.cloverRec.CT[3891]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3891]==0&false)))
			{{
				__CLOVER_182_0.cloverRec.S[16128]++;if((((expr instanceof Expr_Appel) && (++__CLOVER_182_0.cloverRec.CT[3892]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3892]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[16129]++;Expr_Appel exp=(Expr_Appel)expr;
					__CLOVER_182_0.cloverRec.S[16130]++;text="Appel,";
					__CLOVER_182_0.cloverRec.S[16131]++;if((((exp.type!=null) && (++__CLOVER_182_0.cloverRec.CT[3893]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3893]==0&false)))
					{{
						__CLOVER_182_0.cloverRec.S[16132]++;no=reference_objet(exp.type);
						__CLOVER_182_0.cloverRec.S[16133]++;text+="&(global_type["+no+"]),";
					}
					}else
						{__CLOVER_182_0.cloverRec.S[16134]++;text+="NULL,";
					}__CLOVER_182_0.cloverRec.S[16135]++;text+="0,NULL,";
					__CLOVER_182_0.cloverRec.S[16136]++;text+="\""+exp.nom+"\",";
					__CLOVER_182_0.cloverRec.S[16137]++;text+="NULL,NULL,";
					/*if(expr.parametre!=null&&expr.parametre.length>0)
					{
						no=reference_objet(expr.parametre);
						//text+="&(global_expr";
						//no2=EType.size();
						EInit.addElement("global_expr["+res+"].tableau="+ajoute_expr(exp.parametre)+";");
						EInit.addElement("global_expr["+res+"].taille_tableau="+expr.parametre.length+";");
					}*/
					__CLOVER_182_0.cloverRec.S[16138]++;text+="NULL,";
					//text+=ajoute_expr(exp.parametre)+",";
					//EInit.addElement("global_expr["+res+"].parametre="+ajoute_expr(exp.parametre)+";");
					__CLOVER_182_0.cloverRec.S[16139]++;text+="NULL,NULL,NULL,";
					__CLOVER_182_0.cloverRec.S[16140]++;text+=taille(exp.parametre)+",0,";
					__CLOVER_182_0.cloverRec.S[16141]++;text+="NULL,";
					__CLOVER_182_0.cloverRec.S[16142]++;if((((exp.oper!=null) && (++__CLOVER_182_0.cloverRec.CT[3894]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3894]==0&false)))
					{{
						__CLOVER_182_0.cloverRec.S[16143]++;no=reference_objet(exp.oper);
						__CLOVER_182_0.cloverRec.S[16144]++;text+="&(global_token["+no+"])";
					}
					}else
						{__CLOVER_182_0.cloverRec.S[16145]++;text+="NULL";
				}}
				}else {__CLOVER_182_0.cloverRec.S[16146]++;if((((expr instanceof Expr_Binaire) && (++__CLOVER_182_0.cloverRec.CT[3895]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3895]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[16147]++;Expr_Binaire exp=(Expr_Binaire)expr;
					__CLOVER_182_0.cloverRec.S[16148]++;boolean __CLOVER_bool0=false;switch(exp.op)
					{// TODO: a continuer
						case Expr.Plus:if (!__CLOVER_bool0) {__CLOVER_182_0.cloverRec.S[16149]++;__CLOVER_bool0=true;}
							__CLOVER_182_0.cloverRec.S[16150]++;text="Plus,";
							__CLOVER_182_0.cloverRec.S[16151]++;break;
						case Expr.Moins:if (!__CLOVER_bool0) {__CLOVER_182_0.cloverRec.S[16152]++;__CLOVER_bool0=true;}
							__CLOVER_182_0.cloverRec.S[16153]++;text="Moins,";
							__CLOVER_182_0.cloverRec.S[16154]++;break;
						case Expr.Fois:if (!__CLOVER_bool0) {__CLOVER_182_0.cloverRec.S[16155]++;__CLOVER_bool0=true;}
							__CLOVER_182_0.cloverRec.S[16156]++;text="Fois,";
							__CLOVER_182_0.cloverRec.S[16157]++;break;
						case Expr.Div:if (!__CLOVER_bool0) {__CLOVER_182_0.cloverRec.S[16158]++;__CLOVER_bool0=true;}
							__CLOVER_182_0.cloverRec.S[16159]++;text="Div,";
							__CLOVER_182_0.cloverRec.S[16160]++;break;
						case Expr.Div_entier:if (!__CLOVER_bool0) {__CLOVER_182_0.cloverRec.S[16161]++;__CLOVER_bool0=true;}
							__CLOVER_182_0.cloverRec.S[16162]++;text="Div_entier,";
							__CLOVER_182_0.cloverRec.S[16163]++;break;
						case Expr.Mod:if (!__CLOVER_bool0) {__CLOVER_182_0.cloverRec.S[16164]++;__CLOVER_bool0=true;}
							__CLOVER_182_0.cloverRec.S[16165]++;text="Mod,";
							__CLOVER_182_0.cloverRec.S[16166]++;break;
						case Expr.Point:if (!__CLOVER_bool0) {__CLOVER_182_0.cloverRec.S[16167]++;__CLOVER_bool0=true;}
							__CLOVER_182_0.cloverRec.S[16168]++;text="Point,";
							__CLOVER_182_0.cloverRec.S[16169]++;break;
						case Expr.Puiss:if (!__CLOVER_bool0) {__CLOVER_182_0.cloverRec.S[16170]++;__CLOVER_bool0=true;}
							__CLOVER_182_0.cloverRec.S[16171]++;text="Puiss,";
							__CLOVER_182_0.cloverRec.S[16172]++;break;
						case Expr.Xor:if (!__CLOVER_bool0) {__CLOVER_182_0.cloverRec.S[16173]++;__CLOVER_bool0=true;}
							__CLOVER_182_0.cloverRec.S[16174]++;text="Xor,";
							__CLOVER_182_0.cloverRec.S[16175]++;break;
						case Expr.Or:if (!__CLOVER_bool0) {__CLOVER_182_0.cloverRec.S[16176]++;__CLOVER_bool0=true;}
							__CLOVER_182_0.cloverRec.S[16177]++;text="Or,";
							__CLOVER_182_0.cloverRec.S[16178]++;break;
						case Expr.And:if (!__CLOVER_bool0) {__CLOVER_182_0.cloverRec.S[16179]++;__CLOVER_bool0=true;}
							__CLOVER_182_0.cloverRec.S[16180]++;text="And,";
							__CLOVER_182_0.cloverRec.S[16181]++;break;
						case Expr.And_Then:if (!__CLOVER_bool0) {__CLOVER_182_0.cloverRec.S[16182]++;__CLOVER_bool0=true;}
							__CLOVER_182_0.cloverRec.S[16183]++;text="And_Then,";
							__CLOVER_182_0.cloverRec.S[16184]++;break;
						case Expr.Or_Else:if (!__CLOVER_bool0) {__CLOVER_182_0.cloverRec.S[16185]++;__CLOVER_bool0=true;}
							__CLOVER_182_0.cloverRec.S[16186]++;text="Or_Else,";
							__CLOVER_182_0.cloverRec.S[16187]++;break;
						case Expr.Implies:if (!__CLOVER_bool0) {__CLOVER_182_0.cloverRec.S[16188]++;__CLOVER_bool0=true;}
							__CLOVER_182_0.cloverRec.S[16189]++;text="Implies,";
							__CLOVER_182_0.cloverRec.S[16190]++;break;
						case Expr.Egal:if (!__CLOVER_bool0) {__CLOVER_182_0.cloverRec.S[16191]++;__CLOVER_bool0=true;}
							__CLOVER_182_0.cloverRec.S[16192]++;text="Egal,";
							__CLOVER_182_0.cloverRec.S[16193]++;break;
						case Expr.Diff:if (!__CLOVER_bool0) {__CLOVER_182_0.cloverRec.S[16194]++;__CLOVER_bool0=true;}
							__CLOVER_182_0.cloverRec.S[16195]++;text="Diff,";
							__CLOVER_182_0.cloverRec.S[16196]++;break;
						case Expr.Infs:if (!__CLOVER_bool0) {__CLOVER_182_0.cloverRec.S[16197]++;__CLOVER_bool0=true;}
							__CLOVER_182_0.cloverRec.S[16198]++;text="Infs,";
							__CLOVER_182_0.cloverRec.S[16199]++;break;
						case Expr.Inf:if (!__CLOVER_bool0) {__CLOVER_182_0.cloverRec.S[16200]++;__CLOVER_bool0=true;}
							__CLOVER_182_0.cloverRec.S[16201]++;text="Inf,";
							__CLOVER_182_0.cloverRec.S[16202]++;break;
						case Expr.Sup:if (!__CLOVER_bool0) {__CLOVER_182_0.cloverRec.S[16203]++;__CLOVER_bool0=true;}
							__CLOVER_182_0.cloverRec.S[16204]++;text="Sup,";
							__CLOVER_182_0.cloverRec.S[16205]++;break;
						case Expr.Sups:if (!__CLOVER_bool0) {__CLOVER_182_0.cloverRec.S[16206]++;__CLOVER_bool0=true;}
							__CLOVER_182_0.cloverRec.S[16207]++;text="Sups,";
							__CLOVER_182_0.cloverRec.S[16208]++;break;
						case Expr.Free_Op:if (!__CLOVER_bool0) {__CLOVER_182_0.cloverRec.S[16209]++;__CLOVER_bool0=true;}
							__CLOVER_182_0.cloverRec.S[16210]++;text="Free_Op,";
							__CLOVER_182_0.cloverRec.S[16211]++;break;
						default:if (!__CLOVER_bool0) {__CLOVER_182_0.cloverRec.S[16212]++;__CLOVER_bool0=true;}
							__CLOVER_182_0.cloverRec.S[16213]++;text="";
							assert((((false)) && (++__CLOVER_182_0.cloverRec.CT[3896]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3896]==0&false));
					}
					__CLOVER_182_0.cloverRec.S[16214]++;if((((exp.type!=null) && (++__CLOVER_182_0.cloverRec.CT[3897]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3897]==0&false)))
					{{
						__CLOVER_182_0.cloverRec.S[16215]++;no=reference_objet(exp.type);
						__CLOVER_182_0.cloverRec.S[16216]++;text+="&(global_type["+no+"]),";
					}
					}else
						{__CLOVER_182_0.cloverRec.S[16217]++;text+="NULL,";
					}__CLOVER_182_0.cloverRec.S[16218]++;text+="0,NULL,";
					__CLOVER_182_0.cloverRec.S[16219]++;text+="NULL,";
					__CLOVER_182_0.cloverRec.S[16220]++;text+="\""+exp.free_op+"\",";
					__CLOVER_182_0.cloverRec.S[16221]++;text+="NULL,NULL,";
					__CLOVER_182_0.cloverRec.S[16222]++;if((((exp.expr1!=null) && (++__CLOVER_182_0.cloverRec.CT[3898]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3898]==0&false)))
					{{
						__CLOVER_182_0.cloverRec.S[16223]++;no=reference_objet(exp.expr1);
						__CLOVER_182_0.cloverRec.S[16224]++;text+="&(global_expr["+no+"]),";
					}
					}else
						{__CLOVER_182_0.cloverRec.S[16225]++;text+="NULL,";
					}__CLOVER_182_0.cloverRec.S[16226]++;if((((exp.expr2!=null) && (++__CLOVER_182_0.cloverRec.CT[3899]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3899]==0&false)))
					{{
						__CLOVER_182_0.cloverRec.S[16227]++;no=reference_objet(exp.expr2);
						__CLOVER_182_0.cloverRec.S[16228]++;text+="&(global_expr["+no+"]),";
					}
					}else
						{__CLOVER_182_0.cloverRec.S[16229]++;text+="NULL,";
					}__CLOVER_182_0.cloverRec.S[16230]++;text+="NULL,";
					__CLOVER_182_0.cloverRec.S[16231]++;text+="0,0,";
					__CLOVER_182_0.cloverRec.S[16232]++;text+="NULL,";
					__CLOVER_182_0.cloverRec.S[16233]++;if((((exp.oper!=null) && (++__CLOVER_182_0.cloverRec.CT[3900]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3900]==0&false)))
					{{
						__CLOVER_182_0.cloverRec.S[16234]++;no=reference_objet(exp.oper);
						__CLOVER_182_0.cloverRec.S[16235]++;text+="&(global_token["+no+"])";
					}
					}else
						{__CLOVER_182_0.cloverRec.S[16236]++;text+="NULL";
				}}
				}else {__CLOVER_182_0.cloverRec.S[16237]++;if((((expr instanceof Expr_Car) && (++__CLOVER_182_0.cloverRec.CT[3901]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3901]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[16238]++;Expr_Car exp=(Expr_Car)expr;
					__CLOVER_182_0.cloverRec.S[16239]++;text="Char,";
					__CLOVER_182_0.cloverRec.S[16240]++;if((((exp.type!=null) && (++__CLOVER_182_0.cloverRec.CT[3902]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3902]==0&false)))
					{{
						__CLOVER_182_0.cloverRec.S[16241]++;no=reference_objet(exp.type);
						__CLOVER_182_0.cloverRec.S[16242]++;text+="&(global_type["+no+"]),";
					}
					}else
						{__CLOVER_182_0.cloverRec.S[16243]++;text+="NULL,";
					}__CLOVER_182_0.cloverRec.S[16244]++;text+="0,NULL,";
					__CLOVER_182_0.cloverRec.S[16245]++;text+="NULL,NULL,";
					__CLOVER_182_0.cloverRec.S[16246]++;text+="\""+exp.car+"\",";
					__CLOVER_182_0.cloverRec.S[16247]++;text+="NULL,NULL,NULL,NULL,";
					__CLOVER_182_0.cloverRec.S[16248]++;text+="0,0,";
					__CLOVER_182_0.cloverRec.S[16249]++;text+="NULL,";
					__CLOVER_182_0.cloverRec.S[16250]++;if((((exp.oper!=null) && (++__CLOVER_182_0.cloverRec.CT[3903]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3903]==0&false)))
					{{
						__CLOVER_182_0.cloverRec.S[16251]++;no=reference_objet(exp.oper);
						__CLOVER_182_0.cloverRec.S[16252]++;text+="&(global_token["+no+"])";
					}
					}else
						{__CLOVER_182_0.cloverRec.S[16253]++;text+="NULL";
				}}
				}else {__CLOVER_182_0.cloverRec.S[16254]++;if((((expr instanceof Expr_Chaine) && (++__CLOVER_182_0.cloverRec.CT[3904]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3904]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[16255]++;Expr_Chaine exp=(Expr_Chaine)expr;
					
					__CLOVER_182_0.cloverRec.S[16256]++;text="Chaine,";
					__CLOVER_182_0.cloverRec.S[16257]++;if((((exp.type!=null) && (++__CLOVER_182_0.cloverRec.CT[3905]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3905]==0&false)))
					{{
						__CLOVER_182_0.cloverRec.S[16258]++;no=reference_objet(exp.type);
						__CLOVER_182_0.cloverRec.S[16259]++;text+="&(global_type["+no+"]),";
					}
					}else
						{__CLOVER_182_0.cloverRec.S[16260]++;text+="NULL,";
					}__CLOVER_182_0.cloverRec.S[16261]++;text+="0,NULL,";
					__CLOVER_182_0.cloverRec.S[16262]++;text+="NULL,NULL,";
					__CLOVER_182_0.cloverRec.S[16263]++;text+="NULL,";
					__CLOVER_182_0.cloverRec.S[16264]++;text+="NULL,NULL,NULL,NULL,";
					__CLOVER_182_0.cloverRec.S[16265]++;text+="0,0,";
					__CLOVER_182_0.cloverRec.S[16266]++;if((((exp.str2!=null) && (++__CLOVER_182_0.cloverRec.CT[3906]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3906]==0&false)))
					{{
						__CLOVER_182_0.cloverRec.S[16267]++;no=reference_objet(exp.str2);
						__CLOVER_182_0.cloverRec.S[16268]++;text+="&(global_chaine["+no+"]),";
					}
					}else
						{__CLOVER_182_0.cloverRec.S[16269]++;text+="NULL,";
					}__CLOVER_182_0.cloverRec.S[16270]++;if((((exp.oper!=null) && (++__CLOVER_182_0.cloverRec.CT[3907]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3907]==0&false)))
					{{
						__CLOVER_182_0.cloverRec.S[16271]++;no=reference_objet(exp.oper);
						__CLOVER_182_0.cloverRec.S[16272]++;text+="&(global_token["+no+"])";
					}
					}else
						{__CLOVER_182_0.cloverRec.S[16273]++;text+="NULL";
				}}
				}else {__CLOVER_182_0.cloverRec.S[16274]++;if((((expr instanceof Expr_Entier) && (++__CLOVER_182_0.cloverRec.CT[3908]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3908]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[16275]++;Expr_Entier exp=(Expr_Entier)expr;
					__CLOVER_182_0.cloverRec.S[16276]++;text="Entier,";
					__CLOVER_182_0.cloverRec.S[16277]++;if((((exp.type!=null) && (++__CLOVER_182_0.cloverRec.CT[3909]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3909]==0&false)))
					{{
						__CLOVER_182_0.cloverRec.S[16278]++;no=reference_objet(exp.type);
						__CLOVER_182_0.cloverRec.S[16279]++;text+="&(global_type["+no+"]),";
					}
					}else
						{__CLOVER_182_0.cloverRec.S[16280]++;text+="NULL,";
					}__CLOVER_182_0.cloverRec.S[16281]++;text+="0,NULL,";
					__CLOVER_182_0.cloverRec.S[16282]++;text+="NULL,NULL,";
					__CLOVER_182_0.cloverRec.S[16283]++;text+="\""+exp.str+"\",";
					__CLOVER_182_0.cloverRec.S[16284]++;text+="NULL,NULL,NULL,NULL,";
					__CLOVER_182_0.cloverRec.S[16285]++;text+="0,0,";
					__CLOVER_182_0.cloverRec.S[16286]++;text+="NULL,";
					__CLOVER_182_0.cloverRec.S[16287]++;if((((exp.oper!=null) && (++__CLOVER_182_0.cloverRec.CT[3910]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3910]==0&false)))
					{{
						__CLOVER_182_0.cloverRec.S[16288]++;no=reference_objet(exp.oper);
						__CLOVER_182_0.cloverRec.S[16289]++;text+="&(global_token["+no+"])";
					}
					}else
						{__CLOVER_182_0.cloverRec.S[16290]++;text+="NULL";
				}}
				}else {__CLOVER_182_0.cloverRec.S[16291]++;if((((expr instanceof Expr_Faux) && (++__CLOVER_182_0.cloverRec.CT[3911]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3911]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[16292]++;Expr_Faux exp=(Expr_Faux)expr;
					__CLOVER_182_0.cloverRec.S[16293]++;text="Faux,";
					__CLOVER_182_0.cloverRec.S[16294]++;if((((exp.type!=null) && (++__CLOVER_182_0.cloverRec.CT[3912]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3912]==0&false)))
					{{
						__CLOVER_182_0.cloverRec.S[16295]++;no=reference_objet(exp.type);
						__CLOVER_182_0.cloverRec.S[16296]++;text+="&(global_type["+no+"]),";
					}
					}else
						{__CLOVER_182_0.cloverRec.S[16297]++;text+="NULL,";
					}__CLOVER_182_0.cloverRec.S[16298]++;text+="0,NULL,";
					__CLOVER_182_0.cloverRec.S[16299]++;text+="NULL,NULL,";
					__CLOVER_182_0.cloverRec.S[16300]++;text+="NULL,";
					__CLOVER_182_0.cloverRec.S[16301]++;text+="NULL,NULL,NULL,NULL,";
					__CLOVER_182_0.cloverRec.S[16302]++;text+="0,0,";
					__CLOVER_182_0.cloverRec.S[16303]++;text+="NULL,";
					__CLOVER_182_0.cloverRec.S[16304]++;if((((exp.oper!=null) && (++__CLOVER_182_0.cloverRec.CT[3913]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3913]==0&false)))
					{{
						__CLOVER_182_0.cloverRec.S[16305]++;no=reference_objet(exp.oper);
						__CLOVER_182_0.cloverRec.S[16306]++;text+="&(global_token["+no+"])";
					}
					}else
						{__CLOVER_182_0.cloverRec.S[16307]++;text+="NULL";
				}}
				}else {__CLOVER_182_0.cloverRec.S[16308]++;if((((expr instanceof Expr_Reel) && (++__CLOVER_182_0.cloverRec.CT[3914]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3914]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[16309]++;Expr_Reel exp=(Expr_Reel)expr;
					__CLOVER_182_0.cloverRec.S[16310]++;text="Reel,";
					__CLOVER_182_0.cloverRec.S[16311]++;if((((exp.type!=null) && (++__CLOVER_182_0.cloverRec.CT[3915]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3915]==0&false)))
					{{
						__CLOVER_182_0.cloverRec.S[16312]++;no=reference_objet(exp.type);
						__CLOVER_182_0.cloverRec.S[16313]++;text+="&(global_type["+no+"]),";
					}
					}else
						{__CLOVER_182_0.cloverRec.S[16314]++;text+="NULL,";
					}__CLOVER_182_0.cloverRec.S[16315]++;text+="0,NULL,";
					__CLOVER_182_0.cloverRec.S[16316]++;text+="NULL,NULL,";
					__CLOVER_182_0.cloverRec.S[16317]++;text+="\""+exp.str+"\",";
					__CLOVER_182_0.cloverRec.S[16318]++;text+="NULL,NULL,NULL,NULL,";
					__CLOVER_182_0.cloverRec.S[16319]++;text+="0,0,";
					__CLOVER_182_0.cloverRec.S[16320]++;text+="NULL,";
					__CLOVER_182_0.cloverRec.S[16321]++;if((((exp.oper!=null) && (++__CLOVER_182_0.cloverRec.CT[3916]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3916]==0&false)))
					{{
						__CLOVER_182_0.cloverRec.S[16322]++;no=reference_objet(exp.oper);
						__CLOVER_182_0.cloverRec.S[16323]++;text+="&(global_token["+no+"])";
					}
					}else
						{__CLOVER_182_0.cloverRec.S[16324]++;text+="NULL";
				}}
				}else {__CLOVER_182_0.cloverRec.S[16325]++;if((((expr instanceof Expr_Tableau) && (++__CLOVER_182_0.cloverRec.CT[3917]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3917]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[16326]++;Expr_Tableau exp=(Expr_Tableau)expr;
					__CLOVER_182_0.cloverRec.S[16327]++;text="Tableau,";
					__CLOVER_182_0.cloverRec.S[16328]++;if((((exp.type!=null) && (++__CLOVER_182_0.cloverRec.CT[3918]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3918]==0&false)))
					{{
						__CLOVER_182_0.cloverRec.S[16329]++;no=reference_objet(exp.type);
						__CLOVER_182_0.cloverRec.S[16330]++;text+="&(global_type["+no+"]),";
					}
					}else
						{__CLOVER_182_0.cloverRec.S[16331]++;text+="NULL,";
					}__CLOVER_182_0.cloverRec.S[16332]++;text+="0,NULL,";
					__CLOVER_182_0.cloverRec.S[16333]++;text+="NULL,NULL,";
					__CLOVER_182_0.cloverRec.S[16334]++;text+="NULL,";
					__CLOVER_182_0.cloverRec.S[16335]++;text+="NULL,NULL,NULL,";
					__CLOVER_182_0.cloverRec.S[16336]++;text+=ajoute_expr(exp.tableau)+",";
					__CLOVER_182_0.cloverRec.S[16337]++;text+="0,"+taille(exp.tableau)+",";
					__CLOVER_182_0.cloverRec.S[16338]++;text+="NULL,";
					__CLOVER_182_0.cloverRec.S[16339]++;if((((exp.oper!=null) && (++__CLOVER_182_0.cloverRec.CT[3919]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3919]==0&false)))
					{{
						__CLOVER_182_0.cloverRec.S[16340]++;no=reference_objet(exp.oper);
						__CLOVER_182_0.cloverRec.S[16341]++;text+="&(global_token["+no+"])";
					}
					}else
						{__CLOVER_182_0.cloverRec.S[16342]++;text+="NULL";
				}}
				}else {__CLOVER_182_0.cloverRec.S[16343]++;if((((expr instanceof Expr_Unaire) && (++__CLOVER_182_0.cloverRec.CT[3920]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3920]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[16344]++;Expr_Unaire exp=(Expr_Unaire)expr;
					__CLOVER_182_0.cloverRec.S[16345]++;boolean __CLOVER_bool1=false;switch(exp.op)
					{// TODO: a continuer
						case Expr.Old:if (!__CLOVER_bool1) {__CLOVER_182_0.cloverRec.S[16346]++;__CLOVER_bool1=true;}
							__CLOVER_182_0.cloverRec.S[16347]++;text="Old,";
							__CLOVER_182_0.cloverRec.S[16348]++;break;
						case Expr.Not:if (!__CLOVER_bool1) {__CLOVER_182_0.cloverRec.S[16349]++;__CLOVER_bool1=true;}
							__CLOVER_182_0.cloverRec.S[16350]++;text="Not,";
							__CLOVER_182_0.cloverRec.S[16351]++;break;
						case Expr.PlusU:if (!__CLOVER_bool1) {__CLOVER_182_0.cloverRec.S[16352]++;__CLOVER_bool1=true;}
							__CLOVER_182_0.cloverRec.S[16353]++;text="PlusU,";
							__CLOVER_182_0.cloverRec.S[16354]++;break;
						case Expr.MoinsU:if (!__CLOVER_bool1) {__CLOVER_182_0.cloverRec.S[16355]++;__CLOVER_bool1=true;}
							__CLOVER_182_0.cloverRec.S[16356]++;text="MoinsU,";
							__CLOVER_182_0.cloverRec.S[16357]++;break;
						case Expr.Free_OpU:if (!__CLOVER_bool1) {__CLOVER_182_0.cloverRec.S[16358]++;__CLOVER_bool1=true;}
							__CLOVER_182_0.cloverRec.S[16359]++;text="Free_OpU,";
							__CLOVER_182_0.cloverRec.S[16360]++;break;
						case Expr.Dollard:if (!__CLOVER_bool1) {__CLOVER_182_0.cloverRec.S[16361]++;__CLOVER_bool1=true;}
							__CLOVER_182_0.cloverRec.S[16362]++;text="Dollard,";
							__CLOVER_182_0.cloverRec.S[16363]++;break;
						default:if (!__CLOVER_bool1) {__CLOVER_182_0.cloverRec.S[16364]++;__CLOVER_bool1=true;}
							__CLOVER_182_0.cloverRec.S[16365]++;text="";
							assert((((false)) && (++__CLOVER_182_0.cloverRec.CT[3921]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3921]==0&false));
					}
					__CLOVER_182_0.cloverRec.S[16366]++;if((((exp.type!=null) && (++__CLOVER_182_0.cloverRec.CT[3922]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3922]==0&false)))
					{{
						__CLOVER_182_0.cloverRec.S[16367]++;no=reference_objet(exp.type);
						__CLOVER_182_0.cloverRec.S[16368]++;text+="&(global_type["+no+"]),";
					}
					}else
						{__CLOVER_182_0.cloverRec.S[16369]++;text+="NULL,";
					}__CLOVER_182_0.cloverRec.S[16370]++;text+="0,NULL,";
					__CLOVER_182_0.cloverRec.S[16371]++;text+="NULL,";
					__CLOVER_182_0.cloverRec.S[16372]++;text+="\""+exp.free_op+"\",";
					__CLOVER_182_0.cloverRec.S[16373]++;text+="NULL,NULL,";
					__CLOVER_182_0.cloverRec.S[16374]++;if((((exp.expr1!=null) && (++__CLOVER_182_0.cloverRec.CT[3923]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3923]==0&false)))
					{{
						__CLOVER_182_0.cloverRec.S[16375]++;no=reference_objet(exp.expr1);
						__CLOVER_182_0.cloverRec.S[16376]++;text+="&(global_expr["+no+"]),";
					}
					}else
						{__CLOVER_182_0.cloverRec.S[16377]++;text+="NULL,";
					}__CLOVER_182_0.cloverRec.S[16378]++;text+="NULL,NULL,";
					__CLOVER_182_0.cloverRec.S[16379]++;text+="0,0,";
					__CLOVER_182_0.cloverRec.S[16380]++;text+="NULL,";
					__CLOVER_182_0.cloverRec.S[16381]++;if((((exp.oper!=null) && (++__CLOVER_182_0.cloverRec.CT[3924]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3924]==0&false)))
					{{
						__CLOVER_182_0.cloverRec.S[16382]++;no=reference_objet(exp.oper);
						__CLOVER_182_0.cloverRec.S[16383]++;text+="&(global_token["+no+"])";
					}
					}else
						{__CLOVER_182_0.cloverRec.S[16384]++;text+="NULL";
				}}
				}else {__CLOVER_182_0.cloverRec.S[16385]++;if((((expr instanceof Expr_Vrai) && (++__CLOVER_182_0.cloverRec.CT[3925]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3925]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[16386]++;Expr_Vrai exp=(Expr_Vrai)expr;
					__CLOVER_182_0.cloverRec.S[16387]++;text="Vrai,";
					__CLOVER_182_0.cloverRec.S[16388]++;if((((exp.type!=null) && (++__CLOVER_182_0.cloverRec.CT[3926]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3926]==0&false)))
					{{
						__CLOVER_182_0.cloverRec.S[16389]++;no=reference_objet(exp.type);
						__CLOVER_182_0.cloverRec.S[16390]++;text+="&(global_type["+no+"]),";
					}
					}else
						{__CLOVER_182_0.cloverRec.S[16391]++;text+="NULL,";
					}__CLOVER_182_0.cloverRec.S[16392]++;text+="0,NULL,";
					__CLOVER_182_0.cloverRec.S[16393]++;text+="NULL,NULL,";
					__CLOVER_182_0.cloverRec.S[16394]++;text+="NULL,";
					__CLOVER_182_0.cloverRec.S[16395]++;text+="NULL,NULL,NULL,NULL,";
					__CLOVER_182_0.cloverRec.S[16396]++;text+="0,0,";
					__CLOVER_182_0.cloverRec.S[16397]++;text+="NULL,";
					__CLOVER_182_0.cloverRec.S[16398]++;if((((exp.oper!=null) && (++__CLOVER_182_0.cloverRec.CT[3927]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3927]==0&false)))
					{{
						__CLOVER_182_0.cloverRec.S[16399]++;no=reference_objet(exp.oper);
						__CLOVER_182_0.cloverRec.S[16400]++;text+="&(global_token["+no+"])";
					}
					}else
						{__CLOVER_182_0.cloverRec.S[16401]++;text+="NULL";
				}}
				}else {__CLOVER_182_0.cloverRec.S[16402]++;if((((expr instanceof Expr_Var) && (++__CLOVER_182_0.cloverRec.CT[3928]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3928]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[16403]++;Expr_Var exp=(Expr_Var)expr;
					__CLOVER_182_0.cloverRec.S[16404]++;text="Var,";
					__CLOVER_182_0.cloverRec.S[16405]++;if((((exp.type!=null) && (++__CLOVER_182_0.cloverRec.CT[3929]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3929]==0&false)))
					{{
						__CLOVER_182_0.cloverRec.S[16406]++;no=reference_objet(exp.type);
						__CLOVER_182_0.cloverRec.S[16407]++;text+="&(global_type["+no+"]),";
					}
					}else
						{__CLOVER_182_0.cloverRec.S[16408]++;text+="NULL,";
					}__CLOVER_182_0.cloverRec.S[16409]++;text+="0,NULL,";
					__CLOVER_182_0.cloverRec.S[16410]++;if((((exp.classe!=null) && (++__CLOVER_182_0.cloverRec.CT[3930]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3930]==0&false)))
					{{// TODO: a revoir
						
					}
					}__CLOVER_182_0.cloverRec.S[16411]++;text+="\""+exp.nom+"\",";
					__CLOVER_182_0.cloverRec.S[16412]++;text+="NULL,NULL,NULL,NULL,NULL,NULL,";
					__CLOVER_182_0.cloverRec.S[16413]++;text+="0,0,";
					__CLOVER_182_0.cloverRec.S[16414]++;text+="NULL,";
					__CLOVER_182_0.cloverRec.S[16415]++;if((((exp.oper!=null) && (++__CLOVER_182_0.cloverRec.CT[3931]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3931]==0&false)))
					{{
						__CLOVER_182_0.cloverRec.S[16416]++;no=reference_objet(exp.oper);
						__CLOVER_182_0.cloverRec.S[16417]++;text+="&(global_token["+no+"])";
					}
					}else
						{__CLOVER_182_0.cloverRec.S[16418]++;text+="NULL";
				}}
				}else
				{{
					__CLOVER_182_0.cloverRec.S[16419]++;text="";
					assert((((false)) && (++__CLOVER_182_0.cloverRec.CT[3932]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3932]==0&false));
				}
				}}}}}}}}}}}__CLOVER_182_0.cloverRec.S[16420]++;res=EExpr.addElement(expr,text);
				__CLOVER_182_0.cloverRec.S[16421]++;if((((expr.classe!=null) && (++__CLOVER_182_0.cloverRec.CT[3933]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3933]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[16422]++;no=reference_objet(expr.classe);
					//text+="&(global_expr";
					//no2=EType.size();
					__CLOVER_182_0.cloverRec.S[16423]++;EInit.addElement("global_expr["+res+"].classe=&(global_classe["+no+"]);");
				}
				}__CLOVER_182_0.cloverRec.S[16424]++;if((((expr instanceof Expr_Appel&&
					((Expr_Appel)expr).parametre!=null&&
					((Expr_Appel)expr).parametre.size()>0) && (++__CLOVER_182_0.cloverRec.CT[3934]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3934]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[16425]++;Expr_Appel exp=(Expr_Appel)expr;
					//no=reference_objet(expr.parametre);
					//text+="&(global_expr";
					//no2=EType.size();
					__CLOVER_182_0.cloverRec.S[16426]++;EInit.addElement("global_expr["+res+"].parametre="+ajoute_expr(exp.parametre)+";");
					__CLOVER_182_0.cloverRec.S[16427]++;EInit.addElement("global_expr["+res+"].taille_tableau="+exp.parametre.size()+";");
				}
			}}
		}}
		}else {__CLOVER_182_0.cloverRec.S[16428]++;if((((objet instanceof Indexing) && (++__CLOVER_182_0.cloverRec.CT[3935]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3935]==0&false)))
		{{// TODO: a revoir
			__CLOVER_182_0.cloverRec.S[16429]++;Indexing index=(Indexing)objet;
			__CLOVER_182_0.cloverRec.S[16430]++;res=EIndexing.no_objet(index);
			__CLOVER_182_0.cloverRec.S[16431]++;if((((res==-1) && (++__CLOVER_182_0.cloverRec.CT[3936]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3936]==0&false)))
			{{
				__CLOVER_182_0.cloverRec.S[16432]++;if((((index.nom!=null) && (++__CLOVER_182_0.cloverRec.CT[3937]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3937]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[16433]++;text="\""+index.nom+"\",";
				}
				}else
					{__CLOVER_182_0.cloverRec.S[16434]++;text="NULL,";
				}__CLOVER_182_0.cloverRec.S[16435]++;text+=ajoute_char(index.liste)+",";
				__CLOVER_182_0.cloverRec.S[16436]++;text+=taille(index.liste);
				__CLOVER_182_0.cloverRec.S[16437]++;res=EIndexing.addElement(index,text);
			}
		}}
		}else {__CLOVER_182_0.cloverRec.S[16438]++;if((((objet instanceof Chaine) && (++__CLOVER_182_0.cloverRec.CT[3938]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3938]==0&false)))
		{{// TODO: a revoir
			__CLOVER_182_0.cloverRec.S[16439]++;Chaine chaine=(Chaine)objet;
			__CLOVER_182_0.cloverRec.S[16440]++;res=EChaine.no_objet(chaine);
			__CLOVER_182_0.cloverRec.S[16441]++;if((((res==-1) && (++__CLOVER_182_0.cloverRec.CT[3939]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3939]==0&false)))
			{{
				__CLOVER_182_0.cloverRec.S[16442]++;text=ajoute_char(chaine.liste_chaine);
				__CLOVER_182_0.cloverRec.S[16443]++;text+=","+taille(chaine.liste_chaine)+",";
				__CLOVER_182_0.cloverRec.S[16444]++;if((((chaine.oper!=null) && (++__CLOVER_182_0.cloverRec.CT[3940]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3940]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[16445]++;no=reference_objet(chaine.oper);
					__CLOVER_182_0.cloverRec.S[16446]++;text+="&(global_token["+no+"])";
				}
				}else
					{__CLOVER_182_0.cloverRec.S[16447]++;text+="NULL";
				}__CLOVER_182_0.cloverRec.S[16448]++;res=EChaine.addElement(chaine,text);
			}
		}}
		}else {__CLOVER_182_0.cloverRec.S[16449]++;if((((objet instanceof Type) && (++__CLOVER_182_0.cloverRec.CT[3941]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3941]==0&false)))
		{{
			__CLOVER_182_0.cloverRec.S[16450]++;Type type=(Type)objet;
			__CLOVER_182_0.cloverRec.S[16451]++;res=EType.no_objet(type);
			__CLOVER_182_0.cloverRec.S[16452]++;if((((res==-1) && (++__CLOVER_182_0.cloverRec.CT[3942]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3942]==0&false)))
			{{
				__CLOVER_182_0.cloverRec.S[16453]++;if((((type.nom!=null) && (++__CLOVER_182_0.cloverRec.CT[3943]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3943]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[16454]++;text="\""+type.nom+"\",";
				}
				}else
					{__CLOVER_182_0.cloverRec.S[16455]++;text="NULL,";
				}__CLOVER_182_0.cloverRec.S[16456]++;if((((type.is_like) && (++__CLOVER_182_0.cloverRec.CT[3944]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3944]==0&false)))
					{__CLOVER_182_0.cloverRec.S[16457]++;text+="1,";
				}else
					{__CLOVER_182_0.cloverRec.S[16458]++;text+="0,";
				}__CLOVER_182_0.cloverRec.S[16459]++;if((((type.is_from) && (++__CLOVER_182_0.cloverRec.CT[3945]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3945]==0&false)))
					{__CLOVER_182_0.cloverRec.S[16460]++;text+="1,";
				}else
					{__CLOVER_182_0.cloverRec.S[16461]++;text+="0,";
				}__CLOVER_182_0.cloverRec.S[16462]++;if((((type.expanded) && (++__CLOVER_182_0.cloverRec.CT[3946]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3946]==0&false)))
					{__CLOVER_182_0.cloverRec.S[16463]++;text+="1,";
				}else
					{__CLOVER_182_0.cloverRec.S[16464]++;text+="0,";
				}__CLOVER_182_0.cloverRec.S[16465]++;text+=ajoute_type(type.generique)+",";
				__CLOVER_182_0.cloverRec.S[16466]++;text+=taille(type.generique)+",";
				__CLOVER_182_0.cloverRec.S[16467]++;if((((type.like!=null) && (++__CLOVER_182_0.cloverRec.CT[3947]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3947]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[16468]++;no=reference_objet(type.like);
					//text+="&(global_expr";
					__CLOVER_182_0.cloverRec.S[16469]++;no2=EType.size();
					__CLOVER_182_0.cloverRec.S[16470]++;EInit.addElement("global_type["+no2+"].like=&(global_expr["+no+"]);");
				}
				//else
				}__CLOVER_182_0.cloverRec.S[16471]++;text+="NULL,";
				__CLOVER_182_0.cloverRec.S[16472]++;if((((type.tnom!=null) && (++__CLOVER_182_0.cloverRec.CT[3948]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3948]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[16473]++;no=reference_objet(type.tnom);
					__CLOVER_182_0.cloverRec.S[16474]++;text+="&(global_token["+no+"]),";
				}
				}else
					{__CLOVER_182_0.cloverRec.S[16475]++;text+="NULL,";
				}__CLOVER_182_0.cloverRec.S[16476]++;if((((type.tcrochet_ouvr!=null) && (++__CLOVER_182_0.cloverRec.CT[3949]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3949]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[16477]++;no=reference_objet(type.tcrochet_ouvr);
					__CLOVER_182_0.cloverRec.S[16478]++;text+="&(global_token["+no+"]),";
				}
				}else
					{__CLOVER_182_0.cloverRec.S[16479]++;text+="NULL,";
				}__CLOVER_182_0.cloverRec.S[16480]++;if((((type.tcrochet_ferm!=null) && (++__CLOVER_182_0.cloverRec.CT[3950]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3950]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[16481]++;no=reference_objet(type.tcrochet_ferm);
					__CLOVER_182_0.cloverRec.S[16482]++;text+="&(global_token["+no+"]),";
				}
				}else
					{__CLOVER_182_0.cloverRec.S[16483]++;text+="NULL,";
				}__CLOVER_182_0.cloverRec.S[16484]++;if((((type.tlike!=null) && (++__CLOVER_182_0.cloverRec.CT[3951]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3951]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[16485]++;no=reference_objet(type.tlike);
					__CLOVER_182_0.cloverRec.S[16486]++;text+="&(global_token["+no+"]),";
				}
				}else
					{__CLOVER_182_0.cloverRec.S[16487]++;text+="NULL,";
				}__CLOVER_182_0.cloverRec.S[16488]++;if((((type.tfleche!=null) && (++__CLOVER_182_0.cloverRec.CT[3952]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3952]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[16489]++;no=reference_objet(type.tfleche);
					__CLOVER_182_0.cloverRec.S[16490]++;text+="&(global_token["+no+"]),";
				}
				}else
					{__CLOVER_182_0.cloverRec.S[16491]++;text+="NULL,";
				}__CLOVER_182_0.cloverRec.S[16492]++;if((((type.debut_!=null) && (++__CLOVER_182_0.cloverRec.CT[3953]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3953]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[16493]++;no=reference_objet(type.debut_);
					__CLOVER_182_0.cloverRec.S[16494]++;text+="&(global_position["+no+"]),";
				}
				}else
					{__CLOVER_182_0.cloverRec.S[16495]++;text+="NULL,";
				}__CLOVER_182_0.cloverRec.S[16496]++;if((((type.fin!=null) && (++__CLOVER_182_0.cloverRec.CT[3954]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3954]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[16497]++;no=reference_objet(type.fin);
					__CLOVER_182_0.cloverRec.S[16498]++;text+="&(global_token["+no+"])";
				}
				}else
					{__CLOVER_182_0.cloverRec.S[16499]++;text+="NULL";
				}__CLOVER_182_0.cloverRec.S[16500]++;res=EType.addElement(type,text);
			}
			}else
			{{

			}
		}}
		}else {__CLOVER_182_0.cloverRec.S[16501]++;if((((objet instanceof AttrAncetre) && (++__CLOVER_182_0.cloverRec.CT[3955]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3955]==0&false)))
		{{
			__CLOVER_182_0.cloverRec.S[16502]++;AttrAncetre attr=(AttrAncetre)objet;
			__CLOVER_182_0.cloverRec.S[16503]++;res=EAttrAncetre.no_objet(attr);
			__CLOVER_182_0.cloverRec.S[16504]++;if((((res==-1) && (++__CLOVER_182_0.cloverRec.CT[3956]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3956]==0&false)))
			{{
				__CLOVER_182_0.cloverRec.S[16505]++;if((((attr.type!=null) && (++__CLOVER_182_0.cloverRec.CT[3957]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3957]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[16506]++;no=reference_objet(attr.type);
					__CLOVER_182_0.cloverRec.S[16507]++;text="&(global_type["+no+"]),";
				}
				}else
					{__CLOVER_182_0.cloverRec.S[16508]++;text="NULL,";
				}__CLOVER_182_0.cloverRec.S[16509]++;if((((attr.nom!=null) && (++__CLOVER_182_0.cloverRec.CT[3958]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3958]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[16510]++;no=reference_objet(attr.nom);
					__CLOVER_182_0.cloverRec.S[16511]++;text+="&(global_nomfeature["+no+"]),";
				}
				}else
					{__CLOVER_182_0.cloverRec.S[16512]++;text+="NULL,";
				}__CLOVER_182_0.cloverRec.S[16513]++;text+=""+attr.no;
				__CLOVER_182_0.cloverRec.S[16514]++;res=EAttrAncetre.addElement(attr,text);
			}
		}}
		}else {__CLOVER_182_0.cloverRec.S[16515]++;if((((objet instanceof Attribut) && (++__CLOVER_182_0.cloverRec.CT[3959]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3959]==0&false)))
		{{
			__CLOVER_182_0.cloverRec.S[16516]++;Attribut attr=(Attribut)objet;
			__CLOVER_182_0.cloverRec.S[16517]++;res=EAttribut.no_objet(attr);
			__CLOVER_182_0.cloverRec.S[16518]++;if((((res==-1) && (++__CLOVER_182_0.cloverRec.CT[3960]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3960]==0&false)))
			{{
				__CLOVER_182_0.cloverRec.S[16519]++;if((((attr.nom!=null) && (++__CLOVER_182_0.cloverRec.CT[3961]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3961]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[16520]++;no=reference_objet(attr.nom);
					__CLOVER_182_0.cloverRec.S[16521]++;text="&(global_nomfeature["+no+"]),";
				}
				}else
					{__CLOVER_182_0.cloverRec.S[16522]++;text="NULL,";
				}__CLOVER_182_0.cloverRec.S[16523]++;if((((attr.type!=null) && (++__CLOVER_182_0.cloverRec.CT[3962]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3962]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[16524]++;no=reference_objet(attr.type);
					__CLOVER_182_0.cloverRec.S[16525]++;text+="&(global_type["+no+"]),";
				}
				}else
					{__CLOVER_182_0.cloverRec.S[16526]++;text+="NULL,";
				}__CLOVER_182_0.cloverRec.S[16527]++;if((((attr.feature_directe!=null) && (++__CLOVER_182_0.cloverRec.CT[3963]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3963]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[16528]++;no=reference_objet(attr.feature_directe);
					__CLOVER_182_0.cloverRec.S[16529]++;text+="&(global_feature["+no+"]),";
				}
				}else
					{__CLOVER_182_0.cloverRec.S[16530]++;text+="NULL,";
				}__CLOVER_182_0.cloverRec.S[16531]++;if((((attr.feature_reel!=null) && (++__CLOVER_182_0.cloverRec.CT[3964]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3964]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[16532]++;no=reference_objet(attr.feature_reel);
					__CLOVER_182_0.cloverRec.S[16533]++;text+="&(global_feature["+no+"]),";
				}
				}else
					{__CLOVER_182_0.cloverRec.S[16534]++;text+="NULL,";
				}__CLOVER_182_0.cloverRec.S[16535]++;text+=ajoute_attrancetre(attr.ancetre)+",";
				__CLOVER_182_0.cloverRec.S[16536]++;text+=ajoute_attrancetre(attr.descendant);
				__CLOVER_182_0.cloverRec.S[16537]++;text+=","+taille(attr.ancetre)+","+taille(attr.descendant);
				__CLOVER_182_0.cloverRec.S[16538]++;res=EAttribut.addElement(attr,text);
			}
		}}
		}else {__CLOVER_182_0.cloverRec.S[16539]++;if((((objet instanceof Token) && (++__CLOVER_182_0.cloverRec.CT[3965]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3965]==0&false)))
		{{
			__CLOVER_182_0.cloverRec.S[16540]++;Token token=(Token)objet;
			__CLOVER_182_0.cloverRec.S[16541]++;res=EToken.no_objet(token);
			__CLOVER_182_0.cloverRec.S[16542]++;if((((res==-1) && (++__CLOVER_182_0.cloverRec.CT[3966]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3966]==0&false)))
			{{
				__CLOVER_182_0.cloverRec.S[16543]++;text=token.x+","+token.y+",";
				__CLOVER_182_0.cloverRec.S[16544]++;if((((token.text!=null) && (++__CLOVER_182_0.cloverRec.CT[3967]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3967]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[16545]++;if((((token.text.charAt(0)=='\"') && (++__CLOVER_182_0.cloverRec.CT[3968]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3968]==0&false)))
						{__CLOVER_182_0.cloverRec.S[16546]++;text+=convertie_chaine(token.text);
					}else
						{__CLOVER_182_0.cloverRec.S[16547]++;text+="\""+convertie_chaine(token.text)+"\"";
				}}
				}__CLOVER_182_0.cloverRec.S[16548]++;text+=",\""+convertie_chaine(token.file)+"\"";
				__CLOVER_182_0.cloverRec.S[16549]++;res=EToken.addElement(token,text);
			}
		}}
		}else {__CLOVER_182_0.cloverRec.S[16550]++;if((((objet instanceof Position) && (++__CLOVER_182_0.cloverRec.CT[3969]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3969]==0&false)))
		{{
			__CLOVER_182_0.cloverRec.S[16551]++;Position pos=(Position)objet;
			__CLOVER_182_0.cloverRec.S[16552]++;res=EPosition.no_objet(pos);
			__CLOVER_182_0.cloverRec.S[16553]++;if((((res==-1) && (++__CLOVER_182_0.cloverRec.CT[3970]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3970]==0&false)))
			{{
				__CLOVER_182_0.cloverRec.S[16554]++;text=pos.x+","+pos.y;
				__CLOVER_182_0.cloverRec.S[16555]++;res=EPosition.addElement(pos,text);
			}
		}}
		/*else if(objet instanceof String)
		{// TODO: a revoir
			Chaine chaine=(Chaine)objet;
			res=EChaine.no_objet(chaine);
			if(res==-1)
			{
				text=ajoute_char(chaine.liste_chaine);
				res=EChaine.addElement(chaine,text);
			}
		}*/
		}else
		{{
			__CLOVER_182_0.cloverRec.S[16556]++;res=-1;
			assert((((false)) && (++__CLOVER_182_0.cloverRec.CT[3971]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3971]==0&false)):"objet="+objet;
		}
		}}}}}}}}}}}}}}}}}assert((((res!=-1)) && (++__CLOVER_182_0.cloverRec.CT[3972]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3972]==0&false));
		__CLOVER_182_0.cloverRec.S[16557]++;return res;
	}

	/*public int trouve_objet(ListeStruct liste,Objet o)
	{
		assert(liste!=null);
		assert(o!=null);
		return liste.
	}*/

	public Attribut[] trouve_attribut(String nom)
	{__CLOVER_182_0.cloverRec.M[1031]++;
		assert((((nom!=null)) && (++__CLOVER_182_0.cloverRec.CT[3973]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3973]==0&false));
		__CLOVER_182_0.cloverRec.S[16558]++;int i;
		__CLOVER_182_0.cloverRec.S[16559]++;for(i=0;(((i<liste_table.size()) && (++__CLOVER_182_0.cloverRec.CT[3974]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3974]==0&false));i++)
		{{
			__CLOVER_182_0.cloverRec.S[16560]++;Table table=(Table)liste_table.elementAt(i);
			__CLOVER_182_0.cloverRec.S[16561]++;if((((table.nom_classe.equalsIgnoreCase(nom)) && (++__CLOVER_182_0.cloverRec.CT[3975]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3975]==0&false)))
			{{
				//assert(table.liste_attribut!=null):table.nom_classe+"="+nom;
				__CLOVER_182_0.cloverRec.S[16562]++;return table.liste_attribut;
			}
		}}
		}assert((((false)) && (++__CLOVER_182_0.cloverRec.CT[3976]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3976]==0&false)):"nom="+nom;
		__CLOVER_182_0.cloverRec.S[16563]++;return null;
	}

	public int taille(Object o[])
	{__CLOVER_182_0.cloverRec.M[1032]++;
		__CLOVER_182_0.cloverRec.S[16564]++;if((((o==null) && (++__CLOVER_182_0.cloverRec.CT[3977]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3977]==0&false)))
			{__CLOVER_182_0.cloverRec.S[16565]++;return 0;
		}else
			{__CLOVER_182_0.cloverRec.S[16566]++;return o.length;
	}}

	public int taille(Vector o)
	{__CLOVER_182_0.cloverRec.M[1033]++;
		__CLOVER_182_0.cloverRec.S[16567]++;if((((o==null) && (++__CLOVER_182_0.cloverRec.CT[3978]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3978]==0&false)))
			{__CLOVER_182_0.cloverRec.S[16568]++;return 0;
		}else
			{__CLOVER_182_0.cloverRec.S[16569]++;return o.size();
	}}

	public String ajoute_type(Type tableau[])
	{__CLOVER_182_0.cloverRec.M[1034]++;
		__CLOVER_182_0.cloverRec.S[16570]++;return ajoute(ETypeT,tableau,"global_type");
	}

	public String ajoute_expr(Expr tableau[])
	{__CLOVER_182_0.cloverRec.M[1035]++;
		__CLOVER_182_0.cloverRec.S[16571]++;return ajoute(EExprT,tableau,"global_expr");
	}

	public String ajoute_expr(Vector tableau)
	{__CLOVER_182_0.cloverRec.M[1036]++;
		__CLOVER_182_0.cloverRec.S[16572]++;return ajoute(EExprT,tableau,"global_expr");
	}

	public String ajoute_assert(Assert tableau[])
	{__CLOVER_182_0.cloverRec.M[1037]++;
		__CLOVER_182_0.cloverRec.S[16573]++;return ajoute(EAssertT,tableau,"global_assert");
	}

	public String ajoute_chaine(Chaine tableau[])
	{__CLOVER_182_0.cloverRec.M[1038]++;
		__CLOVER_182_0.cloverRec.S[16574]++;return ajoute(EChaineT,tableau,"global_chaine");
	}

	public String ajoute_instr(Instr tableau[])
	{__CLOVER_182_0.cloverRec.M[1039]++;
		__CLOVER_182_0.cloverRec.S[16575]++;return ajoute(EInstrT,tableau,"global_instr");
	}

	public String ajoute_nomfeature(NomFeature tableau[])
	{__CLOVER_182_0.cloverRec.M[1040]++;
		__CLOVER_182_0.cloverRec.S[16576]++;return ajoute(ENomFeatureT,tableau,"global_nomfeature");
	}

	public String ajoute_declarevar(DeclareVar tableau[])
	{__CLOVER_182_0.cloverRec.M[1041]++;
		__CLOVER_182_0.cloverRec.S[16577]++;return ajoute(EDeclareVarT,tableau,"global_declarevar");
	}

	public String ajoute_commentaire(Commentaire tableau[])
	{__CLOVER_182_0.cloverRec.M[1042]++;
		__CLOVER_182_0.cloverRec.S[16578]++;return ajoute(ECommentaireT,tableau,"global_commentaire");
	}

	public String ajoute_feature(Feature tableau[])
	{__CLOVER_182_0.cloverRec.M[1043]++;
		__CLOVER_182_0.cloverRec.S[16579]++;return ajoute(EFeatureT,tableau,"global_feature");
	}

	public String ajoute_heritage(Heritage tableau[])
	{__CLOVER_182_0.cloverRec.M[1044]++;
		__CLOVER_182_0.cloverRec.S[16580]++;return ajoute(EHeritageT,tableau,"global_heritage");
	}

	public String ajoute_creation(Creation tableau[])
	{__CLOVER_182_0.cloverRec.M[1045]++;
		__CLOVER_182_0.cloverRec.S[16581]++;return ajoute(ECreationT,tableau,"global_creation");
	}

	public String ajoute_indexing(Indexing tableau[])
	{__CLOVER_182_0.cloverRec.M[1046]++;
		__CLOVER_182_0.cloverRec.S[16582]++;return ajoute(EIndexingT,tableau,"global_indexing");
	}

	public String ajoute_attribut(Attribut tableau[])
	{__CLOVER_182_0.cloverRec.M[1047]++;
		__CLOVER_182_0.cloverRec.S[16583]++;return ajoute(EAttributT,tableau,"global_attribut");
	}

	public String ajoute_attrancetre(AttrAncetre tableau[])
	{__CLOVER_182_0.cloverRec.M[1048]++;
		__CLOVER_182_0.cloverRec.S[16584]++;return ajoute(EAttrAncetreT,tableau,"global_attrancetre");
	}

	public String ajoute_char(String tableau[])
	{__CLOVER_182_0.cloverRec.M[1049]++;
		__CLOVER_182_0.cloverRec.S[16585]++;return ajoute(ECharT,tableau,"global_char");
	}

	public String ajoute(ListeStruct liste,Vector tableau,String nom)
	{__CLOVER_182_0.cloverRec.M[1050]++;
		assert((((liste!=null)) && (++__CLOVER_182_0.cloverRec.CT[3979]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3979]==0&false));
		__CLOVER_182_0.cloverRec.S[16586]++;if((((tableau!=null&&tableau.size()>0) && (++__CLOVER_182_0.cloverRec.CT[3980]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3980]==0&false)))
		{{
			__CLOVER_182_0.cloverRec.S[16587]++;Expr tab[];
			__CLOVER_182_0.cloverRec.S[16588]++;tab=new Expr[tableau.size()];
			__CLOVER_182_0.cloverRec.S[16589]++;tableau.copyInto(tab);
			__CLOVER_182_0.cloverRec.S[16590]++;return ajoute(liste,tab,nom);
		}
		}else
			{__CLOVER_182_0.cloverRec.S[16591]++;return "NULL";
	}}

	public String ajoute(ListeStruct liste,Object tableau[],String nom)
	{__CLOVER_182_0.cloverRec.M[1051]++;
		assert((((liste!=null)) && (++__CLOVER_182_0.cloverRec.CT[3981]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3981]==0&false));
		__CLOVER_182_0.cloverRec.S[16592]++;String res;
		__CLOVER_182_0.cloverRec.S[16593]++;if((((tableau!=null&&tableau.length>0) && (++__CLOVER_182_0.cloverRec.CT[3982]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3982]==0&false)))
		{{
			__CLOVER_182_0.cloverRec.S[16594]++;int i,no;
			__CLOVER_182_0.cloverRec.S[16595]++;res="";
			__CLOVER_182_0.cloverRec.S[16596]++;for(i=0;(((i<tableau.length) && (++__CLOVER_182_0.cloverRec.CT[3983]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3983]==0&false));i++)
			{{
				__CLOVER_182_0.cloverRec.S[16597]++;if((((i>0) && (++__CLOVER_182_0.cloverRec.CT[3984]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3984]==0&false)))
					{__CLOVER_182_0.cloverRec.S[16598]++;res+=",";
				}__CLOVER_182_0.cloverRec.S[16599]++;if((((tableau[i] instanceof String) && (++__CLOVER_182_0.cloverRec.CT[3985]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3985]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[16600]++;res+=tableau[i];
				}
				}else
				{{
					__CLOVER_182_0.cloverRec.S[16601]++;no=reference_objet(tableau[i]);
					__CLOVER_182_0.cloverRec.S[16602]++;res+="&("+nom+"["+no+"])";
				}
			}}
			}__CLOVER_182_0.cloverRec.S[16603]++;no=liste.addElement(tableau,res);
			__CLOVER_182_0.cloverRec.S[16604]++;return "&("+nom+"_tab"+no+")";
		}
		}else
			{__CLOVER_182_0.cloverRec.S[16605]++;return "NULL";
	}}

	public Compiler_Eiffel compiler;
	public String nom_classe_racine,nom_routine_racine;
	public Classe classe_racine;
	public ListeStruct EType,EChaine,//EIndex,
		EExpr,EAssert,EInstr,ENomFeature,
		EDeclareVar,ECommentaire,EFeature,
		EHeritage,ECreation,EClasse,EIndexing,
		EAttribut,EAttrAncetre,EToken,EPosition;
	public ListeStruct ETypeT,EChaineT/*,EIndexT*/,EExprT,
		EAssertT,EInstrT,ENomFeatureT,
		EDeclareVarT,ECommentaireT,EFeatureT,
		EHeritageT,ECreationT,EIndexingT,ECharT,
		EAttributT,EAttrAncetreT;
	public Vector EInit;
	public Vector liste_table;

	public void genere_classe(Classe cl,PrintStream out)
	{__CLOVER_182_0.cloverRec.M[1052]++;
		assert((((cl!=null)) && (++__CLOVER_182_0.cloverRec.CT[3986]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3986]==0&false));
		assert((((out!=null)) && (++__CLOVER_182_0.cloverRec.CT[3987]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3987]==0&false));
		__CLOVER_182_0.cloverRec.S[16606]++;Type type;
		__CLOVER_182_0.cloverRec.S[16607]++;out.print("{");
		__CLOVER_182_0.cloverRec.S[16608]++;out.println("//Classe:"+cl.nom);
		__CLOVER_182_0.cloverRec.S[16609]++;type=cl.type;
		__CLOVER_182_0.cloverRec.S[16610]++;if((((cl.deferred) && (++__CLOVER_182_0.cloverRec.CT[3988]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3988]==0&false)))
			{__CLOVER_182_0.cloverRec.S[16611]++;out.print("1,");
		}else
			{__CLOVER_182_0.cloverRec.S[16612]++;out.print("0,");
		}__CLOVER_182_0.cloverRec.S[16613]++;if((((cl.expanded) && (++__CLOVER_182_0.cloverRec.CT[3989]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3989]==0&false)))
			{__CLOVER_182_0.cloverRec.S[16614]++;out.print("1,");
		}else
			{__CLOVER_182_0.cloverRec.S[16615]++;out.print("0,");
		}__CLOVER_182_0.cloverRec.S[16616]++;genere_type(cl.type,out);
		__CLOVER_182_0.cloverRec.S[16617]++;out.print(",");
		__CLOVER_182_0.cloverRec.S[16618]++;out.print("NULL,NULL,NULL,NULL,NULL,NULL,NULL,0,0,0,0,0,0");
		__CLOVER_182_0.cloverRec.S[16619]++;out.println("}");
	}

	public void genere_type(Type type,PrintStream out)
	{__CLOVER_182_0.cloverRec.M[1053]++;
		assert((((type!=null)) && (++__CLOVER_182_0.cloverRec.CT[3990]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3990]==0&false));
		assert((((out!=null)) && (++__CLOVER_182_0.cloverRec.CT[3991]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3991]==0&false));
		__CLOVER_182_0.cloverRec.S[16620]++;out.print("{");
		__CLOVER_182_0.cloverRec.S[16621]++;if((((type.is_like) && (++__CLOVER_182_0.cloverRec.CT[3992]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3992]==0&false)))
		{{
			__CLOVER_182_0.cloverRec.S[16622]++;out.print("NULL,1,1,0,NULL,0,");
			__CLOVER_182_0.cloverRec.S[16623]++;genere_expr(type.like,out);
		}
		}else
		{{
			__CLOVER_182_0.cloverRec.S[16624]++;genere_str(type.nom,out);
			__CLOVER_182_0.cloverRec.S[16625]++;out.print(",0,0,");
			__CLOVER_182_0.cloverRec.S[16626]++;if((((type.expanded) && (++__CLOVER_182_0.cloverRec.CT[3993]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3993]==0&false)))
				{__CLOVER_182_0.cloverRec.S[16627]++;out.print("1,");
			}else
				{__CLOVER_182_0.cloverRec.S[16628]++;out.print("0,");
			}__CLOVER_182_0.cloverRec.S[16629]++;if((((type.generique!=null&&type.generique.length>0) && (++__CLOVER_182_0.cloverRec.CT[3994]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3994]==0&false)))
			{{
				__CLOVER_182_0.cloverRec.S[16630]++;out.print("{");
				__CLOVER_182_0.cloverRec.S[16631]++;for(int i=0;(((i<type.generique.length) && (++__CLOVER_182_0.cloverRec.CT[3995]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3995]==0&false));i++)
				{{
					__CLOVER_182_0.cloverRec.S[16632]++;if((((i>0) && (++__CLOVER_182_0.cloverRec.CT[3996]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3996]==0&false)))
						{__CLOVER_182_0.cloverRec.S[16633]++;out.print(",");
					}__CLOVER_182_0.cloverRec.S[16634]++;genere_type(type.generique[i],out);
				}
				}__CLOVER_182_0.cloverRec.S[16635]++;out.print("},"+type.generique.length);
			}
			}else
			{{
				__CLOVER_182_0.cloverRec.S[16636]++;out.print("NULL,0");
			}
			}__CLOVER_182_0.cloverRec.S[16637]++;out.print(",NULL");
		}
		}__CLOVER_182_0.cloverRec.S[16638]++;out.print("}");
	}
	
	public void genere_str(String str,PrintStream out)
	{__CLOVER_182_0.cloverRec.M[1054]++;
		assert((((str!=null)) && (++__CLOVER_182_0.cloverRec.CT[3997]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3997]==0&false));
		assert((((out!=null)) && (++__CLOVER_182_0.cloverRec.CT[3998]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3998]==0&false));
		__CLOVER_182_0.cloverRec.S[16639]++;out.print("\""+str+"\"");
	}

	public void genere_expr(Expr expr,PrintStream out)
	{__CLOVER_182_0.cloverRec.M[1055]++;
		assert((((expr!=null)) && (++__CLOVER_182_0.cloverRec.CT[3999]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[3999]==0&false));
		assert((((out!=null)) && (++__CLOVER_182_0.cloverRec.CT[4000]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[4000]==0&false));
		__CLOVER_182_0.cloverRec.S[16640]++;out.println("NULL");
	}

	public void genere_init(Vector init,PrintStream out)
	{__CLOVER_182_0.cloverRec.M[1056]++;
		assert((((init!=null)) && (++__CLOVER_182_0.cloverRec.CT[4001]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[4001]==0&false));
		assert((((out!=null)) && (++__CLOVER_182_0.cloverRec.CT[4002]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[4002]==0&false));
		__CLOVER_182_0.cloverRec.S[16641]++;int i;
		__CLOVER_182_0.cloverRec.S[16642]++;String s;
		__CLOVER_182_0.cloverRec.S[16643]++;if((((init.size()>0) && (++__CLOVER_182_0.cloverRec.CT[4003]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[4003]==0&false)))
		{{
			__CLOVER_182_0.cloverRec.S[16644]++;out.println("void initialisation()");
			__CLOVER_182_0.cloverRec.S[16645]++;out.println("{");
			__CLOVER_182_0.cloverRec.S[16646]++;for(i=0;(((i<init.size()) && (++__CLOVER_182_0.cloverRec.CT[4004]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[4004]==0&false));i++)
			{{
				__CLOVER_182_0.cloverRec.S[16647]++;s=(String)init.elementAt(i);
				__CLOVER_182_0.cloverRec.S[16648]++;out.println("\t"+s);
			}
			}__CLOVER_182_0.cloverRec.S[16649]++;out.println("}");
		}
	}}

	public void genere_struct(ListeStruct liste,PrintStream out)
	{__CLOVER_182_0.cloverRec.M[1057]++;
		assert((((out!=null)) && (++__CLOVER_182_0.cloverRec.CT[4005]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[4005]==0&false));
		assert((((liste!=null)) && (++__CLOVER_182_0.cloverRec.CT[4006]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[4006]==0&false));
		__CLOVER_182_0.cloverRec.S[16650]++;String s;
		__CLOVER_182_0.cloverRec.S[16651]++;if((((!liste.est_tableau()) && (++__CLOVER_182_0.cloverRec.CT[4007]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[4007]==0&false)))
			{__CLOVER_182_0.cloverRec.S[16652]++;s=liste.toString1();
		}else
			{__CLOVER_182_0.cloverRec.S[16653]++;s=liste.toString2();
		}__CLOVER_182_0.cloverRec.S[16654]++;if((((!s.equals("")) && (++__CLOVER_182_0.cloverRec.CT[4008]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[4008]==0&false)))
		{{
			//out.println();
			__CLOVER_182_0.cloverRec.S[16655]++;out.println(s);
			__CLOVER_182_0.cloverRec.S[16656]++;out.println();
		}
	}}

	public void genere_heritageh(PrintStream out)
	{__CLOVER_182_0.cloverRec.M[1058]++;
		assert((((out!=null)) && (++__CLOVER_182_0.cloverRec.CT[4009]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[4009]==0&false));
		__CLOVER_182_0.cloverRec.S[16657]++;boolean heritage_directe[][],heritage[][];
		__CLOVER_182_0.cloverRec.S[16658]++;int len;
		__CLOVER_182_0.cloverRec.S[16659]++;heritage_directe=compiler.table_heritage_directe;
		__CLOVER_182_0.cloverRec.S[16660]++;heritage=compiler.table_heritage;
		__CLOVER_182_0.cloverRec.S[16661]++;len=heritage.length;
		__CLOVER_182_0.cloverRec.S[16662]++;out.println("extern TEIF_Bool heritage_directe["+len+"]["+len+"];");
		__CLOVER_182_0.cloverRec.S[16663]++;out.println("extern TEIF_Bool heritage["+len+"]["+len+"];");
	}

	public void genere_heritage(PrintStream out)
	{__CLOVER_182_0.cloverRec.M[1059]++;
		assert((((out!=null)) && (++__CLOVER_182_0.cloverRec.CT[4010]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[4010]==0&false));
		__CLOVER_182_0.cloverRec.S[16664]++;boolean heritage_directe[][],heritage[][];
		__CLOVER_182_0.cloverRec.S[16665]++;heritage_directe=compiler.table_heritage_directe;
		__CLOVER_182_0.cloverRec.S[16666]++;heritage=compiler.table_heritage;
		__CLOVER_182_0.cloverRec.S[16667]++;genere_matrice(out,"TEIF_Bool","heritage_directe",heritage_directe);
		__CLOVER_182_0.cloverRec.S[16668]++;genere_matrice(out,"TEIF_Bool","heritage",heritage);
	}

	public void genere_matrice(PrintStream out,
		String type,String nom,boolean m[][])
	{__CLOVER_182_0.cloverRec.M[1060]++;
		assert((((out!=null)) && (++__CLOVER_182_0.cloverRec.CT[4011]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[4011]==0&false));
		assert((((type!=null)) && (++__CLOVER_182_0.cloverRec.CT[4012]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[4012]==0&false));
		assert((((nom!=null)) && (++__CLOVER_182_0.cloverRec.CT[4013]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[4013]==0&false));
		assert((((m!=null)) && (++__CLOVER_182_0.cloverRec.CT[4014]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[4014]==0&false));
		__CLOVER_182_0.cloverRec.S[16669]++;int i,j,len;
		__CLOVER_182_0.cloverRec.S[16670]++;len=m.length;
		__CLOVER_182_0.cloverRec.S[16671]++;out.println(type+" "+nom+"["+len+"]["+len+"]={");
		__CLOVER_182_0.cloverRec.S[16672]++;for(i=0;(((i<len) && (++__CLOVER_182_0.cloverRec.CT[4015]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[4015]==0&false));i++)
		{{
			__CLOVER_182_0.cloverRec.S[16673]++;if((((i>0) && (++__CLOVER_182_0.cloverRec.CT[4016]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[4016]==0&false)))
				{__CLOVER_182_0.cloverRec.S[16674]++;out.println(",");
			}__CLOVER_182_0.cloverRec.S[16675]++;out.print("{");
			__CLOVER_182_0.cloverRec.S[16676]++;for(j=0;(((j<len) && (++__CLOVER_182_0.cloverRec.CT[4017]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[4017]==0&false));j++)
			{{
				__CLOVER_182_0.cloverRec.S[16677]++;if((((j>0) && (++__CLOVER_182_0.cloverRec.CT[4018]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[4018]==0&false)))
					{__CLOVER_182_0.cloverRec.S[16678]++;out.print(",");
				}__CLOVER_182_0.cloverRec.S[16679]++;if((((m[i][j]) && (++__CLOVER_182_0.cloverRec.CT[4019]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[4019]==0&false)))
					{__CLOVER_182_0.cloverRec.S[16680]++;out.print("1");
				}else
					{__CLOVER_182_0.cloverRec.S[16681]++;out.print("0");
			}}
			}__CLOVER_182_0.cloverRec.S[16682]++;out.print("}");
		}
		}__CLOVER_182_0.cloverRec.S[16683]++;out.println("};");
		__CLOVER_182_0.cloverRec.S[16684]++;out.println();
	}

	public Classe cherche_classe(String nom)
	{__CLOVER_182_0.cloverRec.M[1061]++;
		assert((((nom!=null)) && (++__CLOVER_182_0.cloverRec.CT[4020]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[4020]==0&false));
		__CLOVER_182_0.cloverRec.S[16685]++;String nom_classe,tmp;
		__CLOVER_182_0.cloverRec.S[16686]++;Vector v;
		__CLOVER_182_0.cloverRec.S[16687]++;Classe cl;
		__CLOVER_182_0.cloverRec.S[16688]++;int i;
		__CLOVER_182_0.cloverRec.S[16689]++;v=compiler.liste_classe;
		__CLOVER_182_0.cloverRec.S[16690]++;if((((v!=null) && (++__CLOVER_182_0.cloverRec.CT[4021]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[4021]==0&false)))
		{{
			__CLOVER_182_0.cloverRec.S[16691]++;for(i=0;(((i<v.size()) && (++__CLOVER_182_0.cloverRec.CT[4022]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[4022]==0&false));i++)
			{{
				__CLOVER_182_0.cloverRec.S[16692]++;cl=((tinyeiffel.ast.Classe)v.elementAt(i));
				__CLOVER_182_0.cloverRec.S[16693]++;if((((nom.equalsIgnoreCase(cl.nom)) && (++__CLOVER_182_0.cloverRec.CT[4023]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[4023]==0&false)))
				{{
					__CLOVER_182_0.cloverRec.S[16694]++;return cl;
				}
			}}
		}}
		}__CLOVER_182_0.cloverRec.S[16695]++;return null;
	}

	public Feature cherche_feature(Classe cl,NomFeature nom)
	{__CLOVER_182_0.cloverRec.M[1062]++;
		assert((((cl!=null)) && (++__CLOVER_182_0.cloverRec.CT[4024]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[4024]==0&false));
		assert((((nom!=null)) && (++__CLOVER_182_0.cloverRec.CT[4025]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[4025]==0&false));
		__CLOVER_182_0.cloverRec.S[16696]++;int i;
		__CLOVER_182_0.cloverRec.S[16697]++;Table_Symbol table;
		__CLOVER_182_0.cloverRec.S[16698]++;Attribut_Complet ac;
		__CLOVER_182_0.cloverRec.S[16699]++;Feature f;
		__CLOVER_182_0.cloverRec.S[16700]++;table=compiler.context.donne_table_symbol(cl);
		assert((((table!=null)) && (++__CLOVER_182_0.cloverRec.CT[4026]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[4026]==0&false));
		__CLOVER_182_0.cloverRec.S[16701]++;ac=table.donne_attribut(nom);
		__CLOVER_182_0.cloverRec.S[16702]++;if((((ac==null) && (++__CLOVER_182_0.cloverRec.CT[4027]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[4027]==0&false)))
			{__CLOVER_182_0.cloverRec.S[16703]++;return null;
		}assert((((ac!=null)) && (++__CLOVER_182_0.cloverRec.CT[4028]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[4028]==0&false)):"nom="+nom+";classe="+cl.nom;
		__CLOVER_182_0.cloverRec.S[16704]++;f=ac.getFeature();
		assert((((f!=null)) && (++__CLOVER_182_0.cloverRec.CT[4029]!=0|true)) || (++__CLOVER_182_0.cloverRec.CF[4029]==0&false));
		__CLOVER_182_0.cloverRec.S[16705]++;return f;
	}


}