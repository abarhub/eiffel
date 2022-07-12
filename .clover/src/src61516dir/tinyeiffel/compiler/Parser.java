/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ */package tinyeiffel.compiler;

import java.io.*;
import tinyeiffel.ast.*;
import java.util.*;
import tinyeiffel.erreur.*;

public class Parser extends AbstractParser //Lexer_Constantes
{static class __CLOVER_80_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}
	public static void main(String[] args) 
	{__CLOVER_80_0.cloverRec.M[697]++;
		__CLOVER_80_0.cloverRec.S[12447]++;System.out.println("Hello World!");
		__CLOVER_80_0.cloverRec.S[12448]++;if((((args!=null&&args.length==1) && (++__CLOVER_80_0.cloverRec.CT[2715]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2715]==0&false)))
		{{
			__CLOVER_80_0.cloverRec.S[12449]++;try{
			__CLOVER_80_0.cloverRec.S[12450]++;Parser p=new Parser(args[0]);
			__CLOVER_80_0.cloverRec.S[12451]++;if((((p.etatOk()) && (++__CLOVER_80_0.cloverRec.CT[2716]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2716]==0&false)))
			{{
				__CLOVER_80_0.cloverRec.S[12452]++;System.out.println("Contenu={"+p.lexer.contenu+"}");
				__CLOVER_80_0.cloverRec.S[12453]++;p.parse();
			}
			}} catch(FileNotFoundException e)
			{
				__CLOVER_80_0.cloverRec.S[12454]++;System.out.println("Erreur:Impossible d'ouvir le fichier "+args[0]);
				assert((((false)) && (++__CLOVER_80_0.cloverRec.CT[2717]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2717]==0&false));
			}
		}
	}}

	public Parser(Lexer l)
	{__CLOVER_80_0.cloverRec.M[698]++;
		assert((((l!=null)) && (++__CLOVER_80_0.cloverRec.CT[2718]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2718]==0&false));
		__CLOVER_80_0.cloverRec.S[12455]++;type_utilisee=new Vector();
		__CLOVER_80_0.cloverRec.S[12456]++;lexer=l;
	}
	
	public Parser(String nom) throws FileNotFoundException
	{__CLOVER_80_0.cloverRec.M[699]++;
		__CLOVER_80_0.cloverRec.S[12457]++;type_utilisee=new Vector();
		__CLOVER_80_0.cloverRec.S[12458]++;lexer=new Lexer();
		__CLOVER_80_0.cloverRec.S[12459]++;lexer.ouvre(nom);
	}
	
	public void parse()
	{__CLOVER_80_0.cloverRec.M[700]++;
		assert((((etatOk())) && (++__CLOVER_80_0.cloverRec.CT[2719]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2719]==0&false));
		//lexer.parcourt();
		__CLOVER_80_0.cloverRec.S[12460]++;parse_classe();
	}

	Classe parse_classe()
	{__CLOVER_80_0.cloverRec.M[701]++;
		__CLOVER_80_0.cloverRec.S[12461]++;Token t_classe,t_expanded,t_deferred,t_indexing;
		__CLOVER_80_0.cloverRec.S[12462]++;Token texp_defer=null,t_invariant=null,t_end=null;
		__CLOVER_80_0.cloverRec.S[12463]++;Type type;
		__CLOVER_80_0.cloverRec.S[12464]++;Classe cl=null;
		__CLOVER_80_0.cloverRec.S[12465]++;boolean erreur=false,est_expanded=false,est_deferred=false;
		__CLOVER_80_0.cloverRec.S[12466]++;t_indexing=lexer.lit(TK_INDEXING);
		__CLOVER_80_0.cloverRec.S[12467]++;if((((t_indexing!=null) && (++__CLOVER_80_0.cloverRec.CT[2720]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2720]==0&false)))
		{{// parcour des indexing (TODO:les mettre dans un vector)
			__CLOVER_80_0.cloverRec.S[12468]++;Token t_id,t_pointv;
			__CLOVER_80_0.cloverRec.S[12469]++;int tab[]={ID,PointVirgule,STRING,REAL,INT,DoublePoint,Virgule},n;
			__CLOVER_80_0.cloverRec.S[12470]++;boolean fin=false;
			__CLOVER_80_0.cloverRec.S[12471]++;while((((!fin) && (++__CLOVER_80_0.cloverRec.CT[2721]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2721]==0&false)))
			{{
				__CLOVER_80_0.cloverRec.S[12472]++;n=lexer.test_prochain3(tab);
				__CLOVER_80_0.cloverRec.S[12473]++;if((((n>=0&&n<tab.length) && (++__CLOVER_80_0.cloverRec.CT[2722]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2722]==0&false)))
				{{
					__CLOVER_80_0.cloverRec.S[12474]++;lexer.lit(tab[n]);
				}
				}else
				{{
					__CLOVER_80_0.cloverRec.S[12475]++;fin=true;
				}
			}}
			}__CLOVER_80_0.cloverRec.S[12476]++;if((((erreur||!etatParserOk()||!etatOk()) && (++__CLOVER_80_0.cloverRec.CT[2723]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2723]==0&false)))
			{{
				__CLOVER_80_0.cloverRec.S[12477]++;erreur_parse2("Erreur dans l'index");
			}
		}}
		}__CLOVER_80_0.cloverRec.S[12478]++;t_expanded=lexer.lit(TK_EXPANDED);
		__CLOVER_80_0.cloverRec.S[12479]++;if((((t_expanded!=null) && (++__CLOVER_80_0.cloverRec.CT[2724]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2724]==0&false)))
		{{
			__CLOVER_80_0.cloverRec.S[12480]++;est_expanded=true;
			__CLOVER_80_0.cloverRec.S[12481]++;texp_defer=t_expanded;
		}
		}__CLOVER_80_0.cloverRec.S[12482]++;t_deferred=lexer.lit(TK_DEFERRED);
		__CLOVER_80_0.cloverRec.S[12483]++;if((((t_deferred!=null) && (++__CLOVER_80_0.cloverRec.CT[2725]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2725]==0&false)))
		{{
			__CLOVER_80_0.cloverRec.S[12484]++;est_deferred=true;
			__CLOVER_80_0.cloverRec.S[12485]++;texp_defer=t_deferred;
		}
		}__CLOVER_80_0.cloverRec.S[12486]++;t_classe=lexer.lit2();
		__CLOVER_80_0.cloverRec.S[12487]++;if((((t_classe==null||t_classe.get_type_token()!=TK_CLASS) && (++__CLOVER_80_0.cloverRec.CT[2726]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2726]==0&false)))
		{{
			__CLOVER_80_0.cloverRec.S[12488]++;erreur_parse("Il faut une classe");
			__CLOVER_80_0.cloverRec.S[12489]++;erreur=true;
			assert((((false)) && (++__CLOVER_80_0.cloverRec.CT[2727]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2727]==0&false));
		}
		}else
		{{
			__CLOVER_80_0.cloverRec.S[12490]++;type=parse_type(true);
			__CLOVER_80_0.cloverRec.S[12491]++;if((((type==null) && (++__CLOVER_80_0.cloverRec.CT[2728]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2728]==0&false)))
			{{
				__CLOVER_80_0.cloverRec.S[12492]++;erreur_parse("Il faut un type pour cette classe");
				__CLOVER_80_0.cloverRec.S[12493]++;erreur=true;
			}
			}else
			{{
				__CLOVER_80_0.cloverRec.S[12494]++;Vector heritage=null,liste_feature=null,creation=null,invariant=null;
				__CLOVER_80_0.cloverRec.S[12495]++;Token t_obsolete=null,t_feature,t_accoladeO,t_accoladeF;
				__CLOVER_80_0.cloverRec.S[12496]++;Chaine obsolete=null;
				__CLOVER_80_0.cloverRec.S[12497]++;Feature feature;
				__CLOVER_80_0.cloverRec.S[12498]++;Vector export=null;
				
				__CLOVER_80_0.cloverRec.S[12499]++;t_obsolete=lexer.lit(TK_OBSOLETE);
				__CLOVER_80_0.cloverRec.S[12500]++;if((((t_obsolete!=null) && (++__CLOVER_80_0.cloverRec.CT[2729]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2729]==0&false)))
				{{
					__CLOVER_80_0.cloverRec.S[12501]++;obsolete=parse_chaine();
				}
				}__CLOVER_80_0.cloverRec.S[12502]++;heritage=parse_heritage();
				__CLOVER_80_0.cloverRec.S[12503]++;creation=parse_creation();
				__CLOVER_80_0.cloverRec.S[12504]++;t_feature=lexer.lit(TK_FEATURE);
				__CLOVER_80_0.cloverRec.S[12505]++;if((((t_feature!=null) && (++__CLOVER_80_0.cloverRec.CT[2730]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2730]==0&false)))
				{{
					__CLOVER_80_0.cloverRec.S[12506]++;Type t1;
					__CLOVER_80_0.cloverRec.S[12507]++;Token t_virgule;
					__CLOVER_80_0.cloverRec.S[12508]++;t_accoladeO=lexer.lit(AcoladeO);
					__CLOVER_80_0.cloverRec.S[12509]++;if((((t_accoladeO!=null) && (++__CLOVER_80_0.cloverRec.CT[2731]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2731]==0&false)))
					{{
						__CLOVER_80_0.cloverRec.S[12510]++;export=new Vector();
						__CLOVER_80_0.cloverRec.S[12511]++;if((((lexer.test_prochain(debut_type)) && (++__CLOVER_80_0.cloverRec.CT[2732]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2732]==0&false)))
						{{
							__CLOVER_80_0.cloverRec.S[12512]++;t1=parse_type(false);
							__CLOVER_80_0.cloverRec.S[12513]++;while((((t1!=null) && (++__CLOVER_80_0.cloverRec.CT[2733]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2733]==0&false)))
							{{
								__CLOVER_80_0.cloverRec.S[12514]++;export.addElement(t1);
								__CLOVER_80_0.cloverRec.S[12515]++;t_virgule=lexer.lit(Virgule);
								__CLOVER_80_0.cloverRec.S[12516]++;if((((t_virgule!=null) && (++__CLOVER_80_0.cloverRec.CT[2734]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2734]==0&false)))
								{{
									__CLOVER_80_0.cloverRec.S[12517]++;t1=parse_type(false);
								}
								}else
								{{
									__CLOVER_80_0.cloverRec.S[12518]++;t_accoladeF=lexer.lit(AcoladeF);
									__CLOVER_80_0.cloverRec.S[12519]++;if((((t_accoladeF==null) && (++__CLOVER_80_0.cloverRec.CT[2735]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2735]==0&false)))
									{{
										__CLOVER_80_0.cloverRec.S[12520]++;erreur_parse("Il faut une accolade fermante");
										__CLOVER_80_0.cloverRec.S[12521]++;erreur=true;
									}
									}__CLOVER_80_0.cloverRec.S[12522]++;t1=null;
								}
							}}
						}}
						}else
						{{
							__CLOVER_80_0.cloverRec.S[12523]++;t_accoladeF=lexer.lit(AcoladeF);
							__CLOVER_80_0.cloverRec.S[12524]++;if((((t_accoladeF==null) && (++__CLOVER_80_0.cloverRec.CT[2736]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2736]==0&false)))
							{{
								__CLOVER_80_0.cloverRec.S[12525]++;erreur_parse("Il faut une accolade fermante");
								__CLOVER_80_0.cloverRec.S[12526]++;erreur=true;
							}
						}}
					}}
					}__CLOVER_80_0.cloverRec.S[12527]++;int i=0;
					__CLOVER_80_0.cloverRec.S[12528]++;liste_feature=new Vector();
					__CLOVER_80_0.cloverRec.S[12529]++;feature=parse_feature(t_feature,export);
					__CLOVER_80_0.cloverRec.S[12530]++;export=null;
					__CLOVER_80_0.cloverRec.S[12531]++;while((((feature!=null) && (++__CLOVER_80_0.cloverRec.CT[2737]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2737]==0&false)))
					{{
						__CLOVER_80_0.cloverRec.S[12532]++;liste_feature.addElement(feature);
						__CLOVER_80_0.cloverRec.S[12533]++;parse_point_virgule();
						__CLOVER_80_0.cloverRec.S[12534]++;feature=parse_feature(t_feature,export);
						__CLOVER_80_0.cloverRec.S[12535]++;i++;
					}
					//assert(liste_feature.size()==7):liste_feature.size()+"("+i+")";
				}}
				}__CLOVER_80_0.cloverRec.S[12536]++;t_invariant=lexer.lit(TK_INVARIANT);
				__CLOVER_80_0.cloverRec.S[12537]++;if((((t_invariant!=null) && (++__CLOVER_80_0.cloverRec.CT[2738]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2738]==0&false)))
				{{
					__CLOVER_80_0.cloverRec.S[12538]++;invariant=parse_assert();
				}
				}__CLOVER_80_0.cloverRec.S[12539]++;parse_point_virgule();
				__CLOVER_80_0.cloverRec.S[12540]++;t_end=lexer.lit(TK_END);
				__CLOVER_80_0.cloverRec.S[12541]++;if((((t_end==null) && (++__CLOVER_80_0.cloverRec.CT[2739]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2739]==0&false)))
				{{
					__CLOVER_80_0.cloverRec.S[12542]++;erreur_parse("Il faut un end");
					__CLOVER_80_0.cloverRec.S[12543]++;erreur=true;
				}
				}__CLOVER_80_0.cloverRec.S[12544]++;if((((!erreur) && (++__CLOVER_80_0.cloverRec.CT[2740]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2740]==0&false)))
				{{
					__CLOVER_80_0.cloverRec.S[12545]++;System.out.println("Ok");
				}
				}else
				{{
					__CLOVER_80_0.cloverRec.S[12546]++;System.out.println("Il y a des erreurs");
				}
				}__CLOVER_80_0.cloverRec.S[12547]++;if((((!erreur&&etatParserOk()&&etatOk()) && (++__CLOVER_80_0.cloverRec.CT[2741]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2741]==0&false)))
				{{
					__CLOVER_80_0.cloverRec.S[12548]++;cl=new Classe(est_deferred,est_expanded,type,liste_feature,
						heritage,invariant,creation,obsolete,null,null);
					__CLOVER_80_0.cloverRec.S[12549]++;ajoute_type(type);
					// TODO: a remettre apres affecter le t_end
					__CLOVER_80_0.cloverRec.S[12550]++;cl.set_token(t_classe,texp_defer,t_obsolete,t_invariant,t_end);
				}
				}else
				{{
					__CLOVER_80_0.cloverRec.S[12551]++;erreur=true;
				}
			}}
		}}
		}assert(((((cl!=null)!=erreur)) && (++__CLOVER_80_0.cloverRec.CT[2742]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2742]==0&false));
		__CLOVER_80_0.cloverRec.S[12552]++;if((((erreur||!etatParserOk()||!etatOk()) && (++__CLOVER_80_0.cloverRec.CT[2743]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2743]==0&false)))
		{{
			__CLOVER_80_0.cloverRec.S[12553]++;erreur_parse2("Erreur dans la classe");
		}
		}__CLOVER_80_0.cloverRec.S[12554]++;return cl;
	}

	Feature parse_feature(Token t_feature_init,Vector liste_export_init)
	{__CLOVER_80_0.cloverRec.M[702]++;
		__CLOVER_80_0.cloverRec.S[12555]++;Feature res=null;
		__CLOVER_80_0.cloverRec.S[12556]++;Expr exp;
		__CLOVER_80_0.cloverRec.S[12557]++;Token t_feature,t_virgule,t_frozen,t_accoladeO,t_accoladeF;
		__CLOVER_80_0.cloverRec.S[12558]++;Vector liste_export=liste_export_init,liste_nom;
		__CLOVER_80_0.cloverRec.S[12559]++;NomFeature n;
		__CLOVER_80_0.cloverRec.S[12560]++;boolean debut=true,passage_feature=false;
		__CLOVER_80_0.cloverRec.S[12561]++;boolean erreur=false;
		__CLOVER_80_0.cloverRec.S[12562]++;t_feature=lexer.lit(TK_FEATURE);
		__CLOVER_80_0.cloverRec.S[12563]++;while((((t_feature!=null) && (++__CLOVER_80_0.cloverRec.CT[2744]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2744]==0&false)))
		{{
			__CLOVER_80_0.cloverRec.S[12564]++;Type t1;
			__CLOVER_80_0.cloverRec.S[12565]++;passage_feature=true;
			__CLOVER_80_0.cloverRec.S[12566]++;t_accoladeO=lexer.lit(AcoladeO);
			__CLOVER_80_0.cloverRec.S[12567]++;if((((t_accoladeO!=null) && (++__CLOVER_80_0.cloverRec.CT[2745]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2745]==0&false)))
			{{
				__CLOVER_80_0.cloverRec.S[12568]++;liste_export=new Vector();
				__CLOVER_80_0.cloverRec.S[12569]++;if((((lexer.test_prochain(debut_type)) && (++__CLOVER_80_0.cloverRec.CT[2746]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2746]==0&false)))
				{{
					__CLOVER_80_0.cloverRec.S[12570]++;t1=parse_type(false);
					__CLOVER_80_0.cloverRec.S[12571]++;while((((t1!=null) && (++__CLOVER_80_0.cloverRec.CT[2747]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2747]==0&false)))
					{{
						__CLOVER_80_0.cloverRec.S[12572]++;liste_export.addElement(t1);
						__CLOVER_80_0.cloverRec.S[12573]++;t_virgule=lexer.lit(Virgule);
						__CLOVER_80_0.cloverRec.S[12574]++;if((((t_virgule!=null) && (++__CLOVER_80_0.cloverRec.CT[2748]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2748]==0&false)))
						{{
							__CLOVER_80_0.cloverRec.S[12575]++;t1=parse_type(false);
						}
						}else
						{{
							__CLOVER_80_0.cloverRec.S[12576]++;t_accoladeF=lexer.lit(AcoladeF);
							__CLOVER_80_0.cloverRec.S[12577]++;if((((t_accoladeF==null) && (++__CLOVER_80_0.cloverRec.CT[2749]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2749]==0&false)))
							{{
								__CLOVER_80_0.cloverRec.S[12578]++;erreur_parse("Il faut une accolade fermante");
								__CLOVER_80_0.cloverRec.S[12579]++;erreur=true;
							}
							}__CLOVER_80_0.cloverRec.S[12580]++;t1=null;
						}
					}}
				}}
				}else
				{{
					__CLOVER_80_0.cloverRec.S[12581]++;t_accoladeF=lexer.lit(AcoladeF);
					__CLOVER_80_0.cloverRec.S[12582]++;if((((t_accoladeF==null) && (++__CLOVER_80_0.cloverRec.CT[2750]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2750]==0&false)))
					{{
						__CLOVER_80_0.cloverRec.S[12583]++;erreur_parse("Il faut une accolade fermante");
						__CLOVER_80_0.cloverRec.S[12584]++;erreur=true;
					}
				}}
			}}
			}__CLOVER_80_0.cloverRec.S[12585]++;t_feature=lexer.lit(TK_FEATURE);
			__CLOVER_80_0.cloverRec.S[12586]++;if((((t_feature!=null) && (++__CLOVER_80_0.cloverRec.CT[2751]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2751]==0&false)))
			{{
				__CLOVER_80_0.cloverRec.S[12587]++;liste_export=null;
			}
		}}
		}__CLOVER_80_0.cloverRec.S[12588]++;if((((debut&&!passage_feature) && (++__CLOVER_80_0.cloverRec.CT[2752]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2752]==0&false)))
		{{
			__CLOVER_80_0.cloverRec.S[12589]++;t_feature=t_feature_init;
			__CLOVER_80_0.cloverRec.S[12590]++;liste_export=liste_export_init;
		}
		}__CLOVER_80_0.cloverRec.S[12591]++;debut=false;
		__CLOVER_80_0.cloverRec.S[12592]++;liste_nom=new Vector();
		__CLOVER_80_0.cloverRec.S[12593]++;n=parse_nom_feature();
		__CLOVER_80_0.cloverRec.S[12594]++;while((((n!=null) && (++__CLOVER_80_0.cloverRec.CT[2753]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2753]==0&false)))
		{{
			__CLOVER_80_0.cloverRec.S[12595]++;liste_nom.addElement(n);
			__CLOVER_80_0.cloverRec.S[12596]++;t_virgule=lexer.lit(Virgule);
			__CLOVER_80_0.cloverRec.S[12597]++;if((((t_virgule!=null) && (++__CLOVER_80_0.cloverRec.CT[2754]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2754]==0&false)))
			{{
				__CLOVER_80_0.cloverRec.S[12598]++;n=parse_nom_feature();
			}
			}else
			{{
				__CLOVER_80_0.cloverRec.S[12599]++;n=null;
			}
		}}
		//System.out.println("nb="+liste_nom.size());
		}__CLOVER_80_0.cloverRec.S[12600]++;if((((liste_nom.size()>0) && (++__CLOVER_80_0.cloverRec.CT[2755]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2755]==0&false)))
		{{
			__CLOVER_80_0.cloverRec.S[12601]++;Token t_parentheseO,t_parentheseF,t_double_point,t_is;
			__CLOVER_80_0.cloverRec.S[12602]++;DeclareVar declare;
			__CLOVER_80_0.cloverRec.S[12603]++;Vector liste_param=null;
			__CLOVER_80_0.cloverRec.S[12604]++;Type type_retour=null;

			__CLOVER_80_0.cloverRec.S[12605]++;t_parentheseO=lexer.lit(ParentO);
			__CLOVER_80_0.cloverRec.S[12606]++;if((((t_parentheseO!=null) && (++__CLOVER_80_0.cloverRec.CT[2756]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2756]==0&false)))
			{{
				__CLOVER_80_0.cloverRec.S[12607]++;liste_param=parse_declare_var();
				__CLOVER_80_0.cloverRec.S[12608]++;t_parentheseF=lexer.lit(ParentF);
				__CLOVER_80_0.cloverRec.S[12609]++;if((((t_parentheseF==null) && (++__CLOVER_80_0.cloverRec.CT[2757]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2757]==0&false)))
				{{
					__CLOVER_80_0.cloverRec.S[12610]++;erreur_parse("Il faut une accolade fermante");
					__CLOVER_80_0.cloverRec.S[12611]++;erreur=true;
				}
			}}
			}__CLOVER_80_0.cloverRec.S[12612]++;t_double_point=lexer.lit(DoublePoint);
			__CLOVER_80_0.cloverRec.S[12613]++;if((((t_double_point!=null) && (++__CLOVER_80_0.cloverRec.CT[2758]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2758]==0&false)))
			{{
				__CLOVER_80_0.cloverRec.S[12614]++;type_retour=parse_type(false);
				__CLOVER_80_0.cloverRec.S[12615]++;if((((type_retour==null) && (++__CLOVER_80_0.cloverRec.CT[2759]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2759]==0&false)))
				{{
					__CLOVER_80_0.cloverRec.S[12616]++;erreur_parse("Il faut un type de retour");
					__CLOVER_80_0.cloverRec.S[12617]++;erreur=true;
				}
			}}
			}__CLOVER_80_0.cloverRec.S[12618]++;t_is=lexer.lit(TK_IS);
			__CLOVER_80_0.cloverRec.S[12619]++;if((((t_is==null) && (++__CLOVER_80_0.cloverRec.CT[2760]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2760]==0&false)))
			{{
				__CLOVER_80_0.cloverRec.S[12620]++;res=new FeatureAttr();
			}
			}else
			{{
				__CLOVER_80_0.cloverRec.S[12621]++;res=parse_corps();
			}
			}__CLOVER_80_0.cloverRec.S[12622]++;if((((res!=null) && (++__CLOVER_80_0.cloverRec.CT[2761]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2761]==0&false)))
			{{
				__CLOVER_80_0.cloverRec.S[12623]++;res.set_nom_param(liste_nom,liste_param,liste_export,null);
				__CLOVER_80_0.cloverRec.S[12624]++;res.type_retour=type_retour;
			}
			}__CLOVER_80_0.cloverRec.S[12625]++;ajoute_type(liste_export);
			__CLOVER_80_0.cloverRec.S[12626]++;ajoute_type(type_retour);
		}
		}else
		{{
			//erreur_parse("Test nb");
			__CLOVER_80_0.cloverRec.S[12627]++;res=null;
		}
		}__CLOVER_80_0.cloverRec.S[12628]++;if((((erreur||!etatParserOk()||!etatOk()) && (++__CLOVER_80_0.cloverRec.CT[2762]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2762]==0&false)))
		{{
			__CLOVER_80_0.cloverRec.S[12629]++;erreur_parse2("Erreur dans l'attribut");
		}
		}__CLOVER_80_0.cloverRec.S[12630]++;return res;
	}

	Feature parse_corps()
	{__CLOVER_80_0.cloverRec.M[703]++;
		__CLOVER_80_0.cloverRec.S[12631]++;Vector require=new Vector(),ensure=new Vector(),rescue=new Vector();
		__CLOVER_80_0.cloverRec.S[12632]++;Token t_obsolete,t_require,t_ensure,t_end,t_rescue,t_unique;
		__CLOVER_80_0.cloverRec.S[12633]++;Chaine obsolete;
		__CLOVER_80_0.cloverRec.S[12634]++;boolean erreur=false;
		__CLOVER_80_0.cloverRec.S[12635]++;Feature res=null;
		__CLOVER_80_0.cloverRec.S[12636]++;Expr expr;
		__CLOVER_80_0.cloverRec.S[12637]++;t_unique=lexer.lit(TK_UNIQUE);
		__CLOVER_80_0.cloverRec.S[12638]++;if((((t_unique!=null) && (++__CLOVER_80_0.cloverRec.CT[2763]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2763]==0&false)))
		{{
			__CLOVER_80_0.cloverRec.S[12639]++;res=new FeatureUnique();
			__CLOVER_80_0.cloverRec.S[12640]++;res.set_token(t_unique); 
		}
		}else
		{{
			__CLOVER_80_0.cloverRec.S[12641]++;int tab[]={TK_OBSOLETE,TK_REQUIRE,TK_DO,TK_ONCE,
				TK_LOCAL,TK_DEFERRED,TK_EXTERNAL,TK_UNIQUE};
			__CLOVER_80_0.cloverRec.S[12642]++;if((((!lexer.test_prochain(tab)) && (++__CLOVER_80_0.cloverRec.CT[2764]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2764]==0&false)))
			{{
				//assert(false);
				__CLOVER_80_0.cloverRec.S[12643]++;expr=parse_expr();
				__CLOVER_80_0.cloverRec.S[12644]++;if((((expr!=null) && (++__CLOVER_80_0.cloverRec.CT[2765]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2765]==0&false)))
				{{
					__CLOVER_80_0.cloverRec.S[12645]++;int tab2[]={INT};
					assert((((!lexer.test_prochain(tab2))) && (++__CLOVER_80_0.cloverRec.CT[2766]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2766]==0&false));
					__CLOVER_80_0.cloverRec.S[12646]++;res=new FeatureExpr();
					__CLOVER_80_0.cloverRec.S[12647]++;((FeatureExpr)res).expr=expr;
				}
				}else
				{{
					__CLOVER_80_0.cloverRec.S[12648]++;erreur_parse("Il faut une expression");
					__CLOVER_80_0.cloverRec.S[12649]++;erreur=true;
				}
			}}
			}else
			{{
				__CLOVER_80_0.cloverRec.S[12650]++;obsolete=null;
				__CLOVER_80_0.cloverRec.S[12651]++;t_obsolete=lexer.lit(TK_OBSOLETE);
				__CLOVER_80_0.cloverRec.S[12652]++;if((((t_obsolete!=null) && (++__CLOVER_80_0.cloverRec.CT[2767]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2767]==0&false)))
				{{
					__CLOVER_80_0.cloverRec.S[12653]++;obsolete=parse_chaine();
					__CLOVER_80_0.cloverRec.S[12654]++;if((((obsolete==null) && (++__CLOVER_80_0.cloverRec.CT[2768]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2768]==0&false)))
					{{
						__CLOVER_80_0.cloverRec.S[12655]++;erreur_parse("Il faut une chaine de caract\u00e8re");
						__CLOVER_80_0.cloverRec.S[12656]++;erreur=true;
					}
				}}
				}__CLOVER_80_0.cloverRec.S[12657]++;t_require=lexer.lit(TK_REQUIRE);
				__CLOVER_80_0.cloverRec.S[12658]++;if((((t_require!=null) && (++__CLOVER_80_0.cloverRec.CT[2769]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2769]==0&false)))
				{{
					__CLOVER_80_0.cloverRec.S[12659]++;Token t_else;
					__CLOVER_80_0.cloverRec.S[12660]++;t_else=lexer.lit(TK_ELSE);
					__CLOVER_80_0.cloverRec.S[12661]++;require=parse_assert();
				}
				}__CLOVER_80_0.cloverRec.S[12662]++;res=parse_corps2();
				__CLOVER_80_0.cloverRec.S[12663]++;t_ensure=lexer.lit(TK_ENSURE);
				__CLOVER_80_0.cloverRec.S[12664]++;if((((t_ensure!=null) && (++__CLOVER_80_0.cloverRec.CT[2770]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2770]==0&false)))
				{{
					__CLOVER_80_0.cloverRec.S[12665]++;Token t_then;
					__CLOVER_80_0.cloverRec.S[12666]++;t_then=lexer.lit(TK_THEN);
					__CLOVER_80_0.cloverRec.S[12667]++;ensure=parse_assert();
				}
				}__CLOVER_80_0.cloverRec.S[12668]++;t_rescue=lexer.lit(TK_RESCUE);
				__CLOVER_80_0.cloverRec.S[12669]++;if((((t_rescue!=null) && (++__CLOVER_80_0.cloverRec.CT[2771]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2771]==0&false)))
				{{
					__CLOVER_80_0.cloverRec.S[12670]++;rescue=parse_instr();
				}
				}__CLOVER_80_0.cloverRec.S[12671]++;t_end=lexer.lit(TK_END);
				__CLOVER_80_0.cloverRec.S[12672]++;if((((t_end==null) && (++__CLOVER_80_0.cloverRec.CT[2772]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2772]==0&false)))
				{{
					__CLOVER_80_0.cloverRec.S[12673]++;erreur_parse("Il faut end");
					__CLOVER_80_0.cloverRec.S[12674]++;erreur=true;
				}
				}__CLOVER_80_0.cloverRec.S[12675]++;if((((!erreur&&res!=null) && (++__CLOVER_80_0.cloverRec.CT[2773]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2773]==0&false)))
				{{// todo: prendre en compte les commentaires
					__CLOVER_80_0.cloverRec.S[12676]++;res.set_require_ensure(require,ensure,rescue,
						obsolete,new Vector(),null);
					__CLOVER_80_0.cloverRec.S[12677]++;res.set_token(t_obsolete,t_require,
						t_ensure,t_rescue);
				}
				/*exp=parse_expr();
				while(exp!=null)
				{
					res.addElement(exp);
					parse_point_virgule();
						exp=parse_expr();
				}*/
			}}
		}}
		}__CLOVER_80_0.cloverRec.S[12678]++;if((((erreur||!etatParserOk()||!etatOk()) && (++__CLOVER_80_0.cloverRec.CT[2774]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2774]==0&false)))
		{{
			__CLOVER_80_0.cloverRec.S[12679]++;erreur_parse2("Erreur dans l'attribut");
		}
		}__CLOVER_80_0.cloverRec.S[12680]++;return res;
	}

	Vector parse_declare_var()
	{__CLOVER_80_0.cloverRec.M[704]++;
		__CLOVER_80_0.cloverRec.S[12681]++;Vector res=new Vector(),liste_nom;
		__CLOVER_80_0.cloverRec.S[12682]++;Type type;
		__CLOVER_80_0.cloverRec.S[12683]++;Token t_nom,t_double_point,t_virgule,t_pvirgule;
		__CLOVER_80_0.cloverRec.S[12684]++;boolean fin=false,erreur=false;
		__CLOVER_80_0.cloverRec.S[12685]++;int i;
		__CLOVER_80_0.cloverRec.S[12686]++;DeclareVar declare;
		__CLOVER_80_0.cloverRec.S[12687]++;t_nom=lexer.lit(ID);
		__CLOVER_80_0.cloverRec.S[12688]++;while((((t_nom!=null&&!fin) && (++__CLOVER_80_0.cloverRec.CT[2775]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2775]==0&false)))
		{{
			__CLOVER_80_0.cloverRec.S[12689]++;liste_nom=new Vector();
			__CLOVER_80_0.cloverRec.S[12690]++;while((((t_nom!=null) && (++__CLOVER_80_0.cloverRec.CT[2776]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2776]==0&false)))
			{{
				__CLOVER_80_0.cloverRec.S[12691]++;liste_nom.addElement(t_nom);
				__CLOVER_80_0.cloverRec.S[12692]++;t_virgule=lexer.lit(Virgule);
				__CLOVER_80_0.cloverRec.S[12693]++;if((((t_virgule!=null) && (++__CLOVER_80_0.cloverRec.CT[2777]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2777]==0&false)))
				{{
					__CLOVER_80_0.cloverRec.S[12694]++;t_nom=lexer.lit(ID);
				}
				}else
				{{
					__CLOVER_80_0.cloverRec.S[12695]++;t_nom=null;
				}
			}}
			}__CLOVER_80_0.cloverRec.S[12696]++;t_double_point=lexer.lit(DoublePoint);
			__CLOVER_80_0.cloverRec.S[12697]++;if((((t_double_point==null) && (++__CLOVER_80_0.cloverRec.CT[2778]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2778]==0&false)))
			{{
				__CLOVER_80_0.cloverRec.S[12698]++;erreur_parse("Il faut un double point");
				__CLOVER_80_0.cloverRec.S[12699]++;erreur=true;
				__CLOVER_80_0.cloverRec.S[12700]++;fin=true;
			}
			}else
			{{
				__CLOVER_80_0.cloverRec.S[12701]++;type=parse_type(false);
				__CLOVER_80_0.cloverRec.S[12702]++;for(i=0;(((i<liste_nom.size()) && (++__CLOVER_80_0.cloverRec.CT[2779]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2779]==0&false));i++)
				{{
					__CLOVER_80_0.cloverRec.S[12703]++;t_nom=(Token)liste_nom.elementAt(i);
					__CLOVER_80_0.cloverRec.S[12704]++;declare=new DeclareVar(t_nom.text,type);
					__CLOVER_80_0.cloverRec.S[12705]++;declare.set_token(t_nom);
					__CLOVER_80_0.cloverRec.S[12706]++;res.addElement(declare);
				}
				}__CLOVER_80_0.cloverRec.S[12707]++;t_pvirgule=lexer.lit(PointVirgule);
				__CLOVER_80_0.cloverRec.S[12708]++;if((((t_pvirgule!=null) && (++__CLOVER_80_0.cloverRec.CT[2780]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2780]==0&false)))
				{{
					__CLOVER_80_0.cloverRec.S[12709]++;while((((t_pvirgule!=null) && (++__CLOVER_80_0.cloverRec.CT[2781]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2781]==0&false)))
					{{
						__CLOVER_80_0.cloverRec.S[12710]++;t_pvirgule=lexer.lit(PointVirgule);
					}
					}__CLOVER_80_0.cloverRec.S[12711]++;t_nom=lexer.lit(ID);
				}
				}else
				{{
					//fin=true;
					__CLOVER_80_0.cloverRec.S[12712]++;t_nom=lexer.lit(ID);
				}
			}}
		}}
		}__CLOVER_80_0.cloverRec.S[12713]++;if((((erreur||!etatParserOk()||!etatOk()) && (++__CLOVER_80_0.cloverRec.CT[2782]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2782]==0&false)))
		{{
			__CLOVER_80_0.cloverRec.S[12714]++;erreur_parse2("Erreur dans la declaration des parametres");
		}
		}__CLOVER_80_0.cloverRec.S[12715]++;return res;
	}

	Feature parse_corps2()
	{__CLOVER_80_0.cloverRec.M[705]++;// TODO: prendre en compte : 
	// test_important: a>0
		__CLOVER_80_0.cloverRec.S[12716]++;Feature res=null;
		__CLOVER_80_0.cloverRec.S[12717]++;Expr exp;
		__CLOVER_80_0.cloverRec.S[12718]++;boolean erreur=false,est_once;
		__CLOVER_80_0.cloverRec.S[12719]++;Token t_local,t_do,t_external,t_once=null,t_deferred,t_alias=null;
		__CLOVER_80_0.cloverRec.S[12720]++;Vector var_local=new Vector(),liste_instr=new Vector();
		__CLOVER_80_0.cloverRec.S[12721]++;t_deferred=lexer.lit(TK_DEFERRED);
		__CLOVER_80_0.cloverRec.S[12722]++;if((((t_deferred!=null) && (++__CLOVER_80_0.cloverRec.CT[2783]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2783]==0&false)))
		{{// deferred
			__CLOVER_80_0.cloverRec.S[12723]++;res=new FeatureDeferred();__CLOVER_80_0.cloverRec.S[12724]++;res.tdeferred=t_deferred;
		}
		}else
		{{
			__CLOVER_80_0.cloverRec.S[12725]++;t_external=lexer.lit(TK_EXTERNAL);
			__CLOVER_80_0.cloverRec.S[12726]++;if((((t_external!=null) && (++__CLOVER_80_0.cloverRec.CT[2784]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2784]==0&false)))
			{{// external
				__CLOVER_80_0.cloverRec.S[12727]++;Chaine ch,ch2=null;
				__CLOVER_80_0.cloverRec.S[12728]++;ch=parse_chaine();
				__CLOVER_80_0.cloverRec.S[12729]++;if((((ch==null) && (++__CLOVER_80_0.cloverRec.CT[2785]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2785]==0&false)))
				{{
					__CLOVER_80_0.cloverRec.S[12730]++;erreur_parse("Il faut une chaine de caract\u00e8re");
					__CLOVER_80_0.cloverRec.S[12731]++;erreur=true;
				}
				}else
				{{
					__CLOVER_80_0.cloverRec.S[12732]++;t_alias=lexer.lit(TK_ALIAS);
					__CLOVER_80_0.cloverRec.S[12733]++;if((((t_alias!=null) && (++__CLOVER_80_0.cloverRec.CT[2786]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2786]==0&false)))
					{{
						__CLOVER_80_0.cloverRec.S[12734]++;ch2=parse_chaine();
						__CLOVER_80_0.cloverRec.S[12735]++;if((((ch2==null) && (++__CLOVER_80_0.cloverRec.CT[2787]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2787]==0&false)))
						{{
							__CLOVER_80_0.cloverRec.S[12736]++;erreur_parse("Il faut une chaine de caract\u00e8re");
							__CLOVER_80_0.cloverRec.S[12737]++;erreur=true;
						}
					}}
				}}
				}__CLOVER_80_0.cloverRec.S[12738]++;if((((!erreur) && (++__CLOVER_80_0.cloverRec.CT[2788]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2788]==0&false)))
				{{
					__CLOVER_80_0.cloverRec.S[12739]++;res=new FeatureExternal(ch,ch2);
					__CLOVER_80_0.cloverRec.S[12740]++;res.texternal=t_external;
					__CLOVER_80_0.cloverRec.S[12741]++;res.talias=t_alias;
				}
			}}
			}else
			{{// do ou once
				__CLOVER_80_0.cloverRec.S[12742]++;t_local=lexer.lit(TK_LOCAL);
				__CLOVER_80_0.cloverRec.S[12743]++;if((((t_local!=null) && (++__CLOVER_80_0.cloverRec.CT[2789]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2789]==0&false)))
				{{
					__CLOVER_80_0.cloverRec.S[12744]++;var_local=parse_declare_var();
				}
				}__CLOVER_80_0.cloverRec.S[12745]++;est_once=false;
				__CLOVER_80_0.cloverRec.S[12746]++;t_do=lexer.lit(TK_DO);
				__CLOVER_80_0.cloverRec.S[12747]++;if((((t_do==null) && (++__CLOVER_80_0.cloverRec.CT[2790]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2790]==0&false)))
				{{
					__CLOVER_80_0.cloverRec.S[12748]++;est_once=true;
					__CLOVER_80_0.cloverRec.S[12749]++;t_once=lexer.lit(TK_ONCE);
					__CLOVER_80_0.cloverRec.S[12750]++;if((((t_once==null) && (++__CLOVER_80_0.cloverRec.CT[2791]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2791]==0&false)))
					{{
						__CLOVER_80_0.cloverRec.S[12751]++;erreur_parse("Il faut soit do, soit once");
						__CLOVER_80_0.cloverRec.S[12752]++;erreur=true;
					}
				}}
				}__CLOVER_80_0.cloverRec.S[12753]++;liste_instr=parse_instr();
				__CLOVER_80_0.cloverRec.S[12754]++;if((((!erreur) && (++__CLOVER_80_0.cloverRec.CT[2792]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2792]==0&false)))
				{{
					__CLOVER_80_0.cloverRec.S[12755]++;res=new FeatureRoutine(est_once,liste_instr,var_local);
					__CLOVER_80_0.cloverRec.S[12756]++;if((((est_once) && (++__CLOVER_80_0.cloverRec.CT[2793]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2793]==0&false)))
					{{
						__CLOVER_80_0.cloverRec.S[12757]++;res.tdo=t_do;
					}
					}else
					{{
						__CLOVER_80_0.cloverRec.S[12758]++;res.tdo=t_once;
					}
				}}
			}}
		}}
		}__CLOVER_80_0.cloverRec.S[12759]++;if((((erreur||!etatParserOk()||!etatOk()) && (++__CLOVER_80_0.cloverRec.CT[2794]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2794]==0&false)))
		{{
			__CLOVER_80_0.cloverRec.S[12760]++;erreur_parse2("Erreur dans le corps de l'attribut");
		}
		}__CLOVER_80_0.cloverRec.S[12761]++;return res;
	}

	Vector parse_instr()
	{__CLOVER_80_0.cloverRec.M[706]++;// TODO: prendre en compte : 
	// test_important: a>0
		__CLOVER_80_0.cloverRec.S[12762]++;Vector res=new Vector();
		__CLOVER_80_0.cloverRec.S[12763]++;Expr exp;
		__CLOVER_80_0.cloverRec.S[12764]++;boolean erreur=false,fin=false;
		__CLOVER_80_0.cloverRec.S[12765]++;int tab1[]={ID},tab2[]={Affect},tab3[]={ParentO,Point,PointVirgule};
		__CLOVER_80_0.cloverRec.S[12766]++;Token t_from,t_if,t_debug,t_check,t_retry,t_excl,t_id,t_inspect;
		__CLOVER_80_0.cloverRec.S[12767]++;int tab_debut[]={TK_FROM,TK_IF,TK_RETRY,TK_DEBUG,TK_CHECK,TK_INSPECT,
			Exclamation,ID,ParentO,INT,REAL,STRING,CHAR};
		__CLOVER_80_0.cloverRec.S[12768]++;Instr_Appel instr_appel=null;
		__CLOVER_80_0.cloverRec.S[12769]++;do
		{{
			__CLOVER_80_0.cloverRec.S[12770]++;boolean __CLOVER_bool0=false;switch(lexer.test_prochain3(tab_debut))
			{
			case 0:if (!__CLOVER_bool0) {__CLOVER_80_0.cloverRec.S[12771]++;__CLOVER_bool0=true;}
				{// from
				__CLOVER_80_0.cloverRec.S[12772]++;t_from=lexer.lit(TK_FROM);
				assert((((t_from!=null)) && (++__CLOVER_80_0.cloverRec.CT[2795]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2795]==0&false));
				__CLOVER_80_0.cloverRec.S[12773]++;Vector liste_instr1,liste_instr2;
				__CLOVER_80_0.cloverRec.S[12774]++;Vector liste_assert=new Vector();
				__CLOVER_80_0.cloverRec.S[12775]++;Expr expr,expr_variant=null;
				__CLOVER_80_0.cloverRec.S[12776]++;Token t_until,t_loop,t_end,t_variant,t_invariant;
				__CLOVER_80_0.cloverRec.S[12777]++;Instr_Loop instr;
				__CLOVER_80_0.cloverRec.S[12778]++;liste_instr1=parse_instr();
				__CLOVER_80_0.cloverRec.S[12779]++;t_invariant=lexer.lit(TK_INVARIANT);
				__CLOVER_80_0.cloverRec.S[12780]++;if((((t_invariant!=null) && (++__CLOVER_80_0.cloverRec.CT[2796]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2796]==0&false)))
				{{// invariant
					__CLOVER_80_0.cloverRec.S[12781]++;liste_assert=parse_assert();
				}
				}__CLOVER_80_0.cloverRec.S[12782]++;t_variant=lexer.lit(TK_VARIANT);
				__CLOVER_80_0.cloverRec.S[12783]++;if((((t_variant!=null) && (++__CLOVER_80_0.cloverRec.CT[2797]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2797]==0&false)))
				{{// variant
					__CLOVER_80_0.cloverRec.S[12784]++;expr_variant=parse_expr();
				}
				}__CLOVER_80_0.cloverRec.S[12785]++;t_until=lexer.lit(TK_UNTIL);
				__CLOVER_80_0.cloverRec.S[12786]++;if((((t_until==null) && (++__CLOVER_80_0.cloverRec.CT[2798]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2798]==0&false)))
				{{
					__CLOVER_80_0.cloverRec.S[12787]++;erreur_parse("Il faut until");
					__CLOVER_80_0.cloverRec.S[12788]++;erreur=true;
				}
				}else
				{{// until
					__CLOVER_80_0.cloverRec.S[12789]++;expr=parse_expr();
					__CLOVER_80_0.cloverRec.S[12790]++;if((((expr==null) && (++__CLOVER_80_0.cloverRec.CT[2799]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2799]==0&false)))
					{{
						__CLOVER_80_0.cloverRec.S[12791]++;erreur_parse("Il faut une expression");
						__CLOVER_80_0.cloverRec.S[12792]++;erreur=true;
					}
					}else
					{{
						__CLOVER_80_0.cloverRec.S[12793]++;t_loop=lexer.lit(TK_LOOP);
						__CLOVER_80_0.cloverRec.S[12794]++;if((((t_loop==null) && (++__CLOVER_80_0.cloverRec.CT[2800]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2800]==0&false)))
						{{
							__CLOVER_80_0.cloverRec.S[12795]++;erreur_parse("Il faut loop");
							__CLOVER_80_0.cloverRec.S[12796]++;erreur=true;
						}
						}else
						{{// loop
							__CLOVER_80_0.cloverRec.S[12797]++;liste_instr2=parse_instr();
							__CLOVER_80_0.cloverRec.S[12798]++;t_end=lexer.lit(TK_END);
							__CLOVER_80_0.cloverRec.S[12799]++;if((((t_end==null) && (++__CLOVER_80_0.cloverRec.CT[2801]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2801]==0&false)))
							{{
								__CLOVER_80_0.cloverRec.S[12800]++;erreur_parse("Il faut end");
								__CLOVER_80_0.cloverRec.S[12801]++;erreur=true;
							}
							}__CLOVER_80_0.cloverRec.S[12802]++;instr=new Instr_Loop(expr,liste_instr1,liste_instr2,
							liste_assert,expr_variant);
							__CLOVER_80_0.cloverRec.S[12803]++;instr.set_token(t_from,t_until,t_invariant,t_variant,
								t_loop,t_end);
							__CLOVER_80_0.cloverRec.S[12804]++;res.addElement(instr);
						}
					}}
				}}
				}}
				__CLOVER_80_0.cloverRec.S[12805]++;break;
			case 1:if (!__CLOVER_bool0) {__CLOVER_80_0.cloverRec.S[12806]++;__CLOVER_bool0=true;}
				{// if
				__CLOVER_80_0.cloverRec.S[12807]++;t_if=lexer.lit(TK_IF);
				assert((((t_if!=null)) && (++__CLOVER_80_0.cloverRec.CT[2802]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2802]==0&false));
				__CLOVER_80_0.cloverRec.S[12808]++;Vector liste_instr;
				__CLOVER_80_0.cloverRec.S[12809]++;Expr expr;
				__CLOVER_80_0.cloverRec.S[12810]++;Token t_then,t_elseif,t_end,t_else;
				__CLOVER_80_0.cloverRec.S[12811]++;Instr_If instr_if=null;
				__CLOVER_80_0.cloverRec.S[12812]++;Instr_ElseIf instr_elseif=null;
				__CLOVER_80_0.cloverRec.S[12813]++;Instr_Else instr_else=null;
				__CLOVER_80_0.cloverRec.S[12814]++;Instr derniere_instr;
				__CLOVER_80_0.cloverRec.S[12815]++;expr=parse_expr();
				__CLOVER_80_0.cloverRec.S[12816]++;if((((expr==null) && (++__CLOVER_80_0.cloverRec.CT[2803]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2803]==0&false)))
				{{
					__CLOVER_80_0.cloverRec.S[12817]++;erreur_parse("Il faut une expression");
					__CLOVER_80_0.cloverRec.S[12818]++;erreur=true;
				}
				}else
				{{
					__CLOVER_80_0.cloverRec.S[12819]++;t_then=lexer.lit(TK_THEN);
					__CLOVER_80_0.cloverRec.S[12820]++;if((((t_then==null) && (++__CLOVER_80_0.cloverRec.CT[2804]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2804]==0&false)))
					{{
						__CLOVER_80_0.cloverRec.S[12821]++;erreur_parse("Il faut then");
						__CLOVER_80_0.cloverRec.S[12822]++;erreur=true;
					}
					}else
					{{
						__CLOVER_80_0.cloverRec.S[12823]++;liste_instr=parse_instr();
						__CLOVER_80_0.cloverRec.S[12824]++;instr_if=new Instr_If(expr,liste_instr);
						__CLOVER_80_0.cloverRec.S[12825]++;instr_if.tif=t_if;
						__CLOVER_80_0.cloverRec.S[12826]++;instr_if.tthen=t_then;
						__CLOVER_80_0.cloverRec.S[12827]++;res.addElement(instr_if);
					}
				}}
				}__CLOVER_80_0.cloverRec.S[12828]++;if((((!erreur) && (++__CLOVER_80_0.cloverRec.CT[2805]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2805]==0&false)))
				{{
					//boolean terminer;
					assert((((instr_if!=null)) && (++__CLOVER_80_0.cloverRec.CT[2806]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2806]==0&false));
					__CLOVER_80_0.cloverRec.S[12829]++;derniere_instr=instr_if;
					__CLOVER_80_0.cloverRec.S[12830]++;t_elseif=lexer.lit(TK_ELSEIF);
					__CLOVER_80_0.cloverRec.S[12831]++;while((((t_elseif!=null&&!erreur) && (++__CLOVER_80_0.cloverRec.CT[2807]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2807]==0&false)))
					{{
						__CLOVER_80_0.cloverRec.S[12832]++;expr=parse_expr();
						__CLOVER_80_0.cloverRec.S[12833]++;if((((expr==null) && (++__CLOVER_80_0.cloverRec.CT[2808]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2808]==0&false)))
						{{
							__CLOVER_80_0.cloverRec.S[12834]++;erreur_parse("Il faut une expression");
							__CLOVER_80_0.cloverRec.S[12835]++;erreur=true;
						}
						}else
						{{
							__CLOVER_80_0.cloverRec.S[12836]++;t_then=lexer.lit(TK_THEN);
							__CLOVER_80_0.cloverRec.S[12837]++;if((((t_then==null) && (++__CLOVER_80_0.cloverRec.CT[2809]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2809]==0&false)))
							{{
								__CLOVER_80_0.cloverRec.S[12838]++;erreur_parse("Il faut then");
								__CLOVER_80_0.cloverRec.S[12839]++;erreur=true;
							}
							}else
							{{
								__CLOVER_80_0.cloverRec.S[12840]++;liste_instr=parse_instr();
								__CLOVER_80_0.cloverRec.S[12841]++;instr_elseif=new Instr_ElseIf(expr,liste_instr);
								__CLOVER_80_0.cloverRec.S[12842]++;instr_elseif.telseif=t_elseif;
								__CLOVER_80_0.cloverRec.S[12843]++;instr_elseif.tthen=t_then;
								__CLOVER_80_0.cloverRec.S[12844]++;((Suite)derniere_instr).setSuivant(instr_elseif);
								__CLOVER_80_0.cloverRec.S[12845]++;derniere_instr=instr_elseif;
							}
						}}
						}__CLOVER_80_0.cloverRec.S[12846]++;t_elseif=lexer.lit(TK_ELSEIF);
					}
					}assert((((derniere_instr!=null)) && (++__CLOVER_80_0.cloverRec.CT[2810]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2810]==0&false));
					__CLOVER_80_0.cloverRec.S[12847]++;t_else=lexer.lit(TK_ELSE);
					__CLOVER_80_0.cloverRec.S[12848]++;if((((t_else!=null&&!erreur) && (++__CLOVER_80_0.cloverRec.CT[2811]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2811]==0&false)))
					{{
						__CLOVER_80_0.cloverRec.S[12849]++;liste_instr=parse_instr();
						__CLOVER_80_0.cloverRec.S[12850]++;instr_else=new Instr_Else(liste_instr);
						__CLOVER_80_0.cloverRec.S[12851]++;instr_else.telse=t_else;
						__CLOVER_80_0.cloverRec.S[12852]++;((Suite)derniere_instr).setSuivant(instr_else);
						__CLOVER_80_0.cloverRec.S[12853]++;derniere_instr=instr_elseif;
					}
				}}
				}__CLOVER_80_0.cloverRec.S[12854]++;t_end=lexer.lit(TK_END);
				__CLOVER_80_0.cloverRec.S[12855]++;if((((t_end==null) && (++__CLOVER_80_0.cloverRec.CT[2812]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2812]==0&false)))
				{{
					__CLOVER_80_0.cloverRec.S[12856]++;erreur_parse("Il faut end");
					__CLOVER_80_0.cloverRec.S[12857]++;erreur=true;
				}
				}else
				{{// end
					
				}
				}}
				__CLOVER_80_0.cloverRec.S[12858]++;break;
			case 2:if (!__CLOVER_bool0) {__CLOVER_80_0.cloverRec.S[12859]++;__CLOVER_bool0=true;} // TK_RETRY
				{// retry
				__CLOVER_80_0.cloverRec.S[12860]++;t_retry=lexer.lit(TK_RETRY);
				assert((((t_retry!=null)) && (++__CLOVER_80_0.cloverRec.CT[2813]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2813]==0&false));
				__CLOVER_80_0.cloverRec.S[12861]++;Instr_Retry instr_retry;
				__CLOVER_80_0.cloverRec.S[12862]++;instr_retry=new Instr_Retry();
				__CLOVER_80_0.cloverRec.S[12863]++;instr_retry.tretry=t_retry;
				__CLOVER_80_0.cloverRec.S[12864]++;res.addElement(instr_retry);
				}
				__CLOVER_80_0.cloverRec.S[12865]++;break;
			case 3:if (!__CLOVER_bool0) {__CLOVER_80_0.cloverRec.S[12866]++;__CLOVER_bool0=true;} // TK_DEBUG
				{// debug
				__CLOVER_80_0.cloverRec.S[12867]++;t_debug=lexer.lit(TK_DEBUG);
				assert((((t_debug!=null)) && (++__CLOVER_80_0.cloverRec.CT[2814]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2814]==0&false));
				__CLOVER_80_0.cloverRec.S[12868]++;Vector liste_instr,liste_chaine;
				__CLOVER_80_0.cloverRec.S[12869]++;Token t_end,t_virgule,t_parentO,t_parentF;
				__CLOVER_80_0.cloverRec.S[12870]++;Instr_Debug instr_debug;
				__CLOVER_80_0.cloverRec.S[12871]++;Chaine chaine;
				__CLOVER_80_0.cloverRec.S[12872]++;liste_chaine=new Vector();
				__CLOVER_80_0.cloverRec.S[12873]++;t_parentO=lexer.lit(ParentO);
				__CLOVER_80_0.cloverRec.S[12874]++;if((((t_parentO!=null) && (++__CLOVER_80_0.cloverRec.CT[2815]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2815]==0&false)))
				{{
					__CLOVER_80_0.cloverRec.S[12875]++;chaine=parse_chaine();
					__CLOVER_80_0.cloverRec.S[12876]++;while((((chaine!=null&&!erreur) && (++__CLOVER_80_0.cloverRec.CT[2816]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2816]==0&false)))
					{{
						__CLOVER_80_0.cloverRec.S[12877]++;liste_chaine.addElement(chaine);
						__CLOVER_80_0.cloverRec.S[12878]++;t_virgule=lexer.lit(Virgule);
						__CLOVER_80_0.cloverRec.S[12879]++;if((((t_virgule!=null) && (++__CLOVER_80_0.cloverRec.CT[2817]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2817]==0&false)))
						{{
							__CLOVER_80_0.cloverRec.S[12880]++;chaine=parse_chaine();
							__CLOVER_80_0.cloverRec.S[12881]++;if((((chaine==null) && (++__CLOVER_80_0.cloverRec.CT[2818]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2818]==0&false)))
							{{
								__CLOVER_80_0.cloverRec.S[12882]++;erreur_parse("Il faut une chaine");
								__CLOVER_80_0.cloverRec.S[12883]++;erreur=true;
							}
						}}
						}else
						{{
							__CLOVER_80_0.cloverRec.S[12884]++;chaine=null;
						}
					}}
					}__CLOVER_80_0.cloverRec.S[12885]++;t_parentF=lexer.lit(ParentF);
					__CLOVER_80_0.cloverRec.S[12886]++;if((((t_parentF==null) && (++__CLOVER_80_0.cloverRec.CT[2819]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2819]==0&false)))
					{{
						__CLOVER_80_0.cloverRec.S[12887]++;erreur_parse("Il faut une parenthese fermante");
						__CLOVER_80_0.cloverRec.S[12888]++;erreur=true;
					}
				}}
				}__CLOVER_80_0.cloverRec.S[12889]++;if((((!erreur) && (++__CLOVER_80_0.cloverRec.CT[2820]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2820]==0&false)))
				{{
					__CLOVER_80_0.cloverRec.S[12890]++;liste_instr=parse_instr();
					__CLOVER_80_0.cloverRec.S[12891]++;t_end=lexer.lit(TK_END);
					__CLOVER_80_0.cloverRec.S[12892]++;if((((t_end==null) && (++__CLOVER_80_0.cloverRec.CT[2821]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2821]==0&false)))
					{{
						__CLOVER_80_0.cloverRec.S[12893]++;erreur_parse("Il faut end");
						__CLOVER_80_0.cloverRec.S[12894]++;erreur=true;
					}
					}__CLOVER_80_0.cloverRec.S[12895]++;instr_debug=new Instr_Debug(liste_chaine,liste_instr);
					__CLOVER_80_0.cloverRec.S[12896]++;instr_debug.tdebug=t_debug;
					__CLOVER_80_0.cloverRec.S[12897]++;instr_debug.tend=t_end;
					__CLOVER_80_0.cloverRec.S[12898]++;res.addElement(instr_debug);
				}
				}}
				__CLOVER_80_0.cloverRec.S[12899]++;break;
			case 4:if (!__CLOVER_bool0) {__CLOVER_80_0.cloverRec.S[12900]++;__CLOVER_bool0=true;} // TK_CHECK
				{// check
				__CLOVER_80_0.cloverRec.S[12901]++;t_check=lexer.lit(TK_CHECK);
				assert((((t_check!=null)) && (++__CLOVER_80_0.cloverRec.CT[2822]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2822]==0&false));
				__CLOVER_80_0.cloverRec.S[12902]++;Vector liste_assert,liste_chaine;
				__CLOVER_80_0.cloverRec.S[12903]++;Token t_end,t_virgule,t_parentO,t_parentF;
				__CLOVER_80_0.cloverRec.S[12904]++;Instr_Check instr_check;
				__CLOVER_80_0.cloverRec.S[12905]++;Chaine chaine;
				//System.out.println("AAA");
				__CLOVER_80_0.cloverRec.S[12906]++;liste_assert=parse_assert();
				//System.out.println("BBB");
				__CLOVER_80_0.cloverRec.S[12907]++;t_end=lexer.lit(TK_END);
				__CLOVER_80_0.cloverRec.S[12908]++;if((((t_end==null) && (++__CLOVER_80_0.cloverRec.CT[2823]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2823]==0&false)))
				{{
					__CLOVER_80_0.cloverRec.S[12909]++;erreur_parse("Il faut end");
					__CLOVER_80_0.cloverRec.S[12910]++;erreur=true;
				}
				}__CLOVER_80_0.cloverRec.S[12911]++;instr_check=new Instr_Check(liste_assert);
				__CLOVER_80_0.cloverRec.S[12912]++;instr_check.tcheck=t_check;
				__CLOVER_80_0.cloverRec.S[12913]++;instr_check.tend=t_end;
				__CLOVER_80_0.cloverRec.S[12914]++;res.addElement(instr_check);
				}
				__CLOVER_80_0.cloverRec.S[12915]++;break;
			case 5:if (!__CLOVER_bool0) {__CLOVER_80_0.cloverRec.S[12916]++;__CLOVER_bool0=true;} // TK_INSPECT
				{// inspect
				__CLOVER_80_0.cloverRec.S[12917]++;t_inspect=lexer.lit(TK_INSPECT);
				assert((((t_inspect!=null)) && (++__CLOVER_80_0.cloverRec.CT[2824]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2824]==0&false));
				__CLOVER_80_0.cloverRec.S[12918]++;Vector liste_expr,liste_expr2,liste_instr;
				__CLOVER_80_0.cloverRec.S[12919]++;Token t_end,t_virgule,t_when,t_then=null,t_double_point,t_else;
				__CLOVER_80_0.cloverRec.S[12920]++;Instr_Inspect instr_inspect;
				__CLOVER_80_0.cloverRec.S[12921]++;Instr derniere_instr=null;
				__CLOVER_80_0.cloverRec.S[12922]++;Chaine chaine;
				__CLOVER_80_0.cloverRec.S[12923]++;Expr expr,expr2,expr3;
				// TODO: a faire
				//assert(false);
				__CLOVER_80_0.cloverRec.S[12924]++;expr=parse_expr();
				__CLOVER_80_0.cloverRec.S[12925]++;if((((expr==null) && (++__CLOVER_80_0.cloverRec.CT[2825]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2825]==0&false)))
				{{
					__CLOVER_80_0.cloverRec.S[12926]++;erreur_parse("Il faut une expression");
					__CLOVER_80_0.cloverRec.S[12927]++;erreur=true;
				}
				}else
				{{
					__CLOVER_80_0.cloverRec.S[12928]++;t_when=lexer.lit(TK_WHEN);
					__CLOVER_80_0.cloverRec.S[12929]++;while((((t_when!=null&&!erreur) && (++__CLOVER_80_0.cloverRec.CT[2826]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2826]==0&false)))
					{{
						__CLOVER_80_0.cloverRec.S[12930]++;liste_expr=new Vector();
						__CLOVER_80_0.cloverRec.S[12931]++;expr2=parse_expr();
						__CLOVER_80_0.cloverRec.S[12932]++;while((((expr2!=null&&!erreur) && (++__CLOVER_80_0.cloverRec.CT[2827]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2827]==0&false)))
						{{
							__CLOVER_80_0.cloverRec.S[12933]++;liste_expr2=new Vector();
							__CLOVER_80_0.cloverRec.S[12934]++;liste_expr2.addElement(expr2);
							__CLOVER_80_0.cloverRec.S[12935]++;t_double_point=lexer.lit(DeuxPoint);
							__CLOVER_80_0.cloverRec.S[12936]++;if((((t_double_point!=null) && (++__CLOVER_80_0.cloverRec.CT[2828]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2828]==0&false)))
							{{
								__CLOVER_80_0.cloverRec.S[12937]++;expr3=parse_expr();
								__CLOVER_80_0.cloverRec.S[12938]++;if((((expr3!=null) && (++__CLOVER_80_0.cloverRec.CT[2829]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2829]==0&false)))
								{{
									__CLOVER_80_0.cloverRec.S[12939]++;liste_expr2.addElement(expr3);
								}
								}else
								{{
									__CLOVER_80_0.cloverRec.S[12940]++;erreur_parse("Il faut une expression");
									__CLOVER_80_0.cloverRec.S[12941]++;erreur=true;
								}
							}}
							}__CLOVER_80_0.cloverRec.S[12942]++;liste_expr.addElement(liste_expr2);
							__CLOVER_80_0.cloverRec.S[12943]++;t_virgule=lexer.lit(Virgule);
							__CLOVER_80_0.cloverRec.S[12944]++;if((((t_virgule!=null) && (++__CLOVER_80_0.cloverRec.CT[2830]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2830]==0&false)))
							{{
								__CLOVER_80_0.cloverRec.S[12945]++;expr2=parse_expr();
							}
							}else
							{{
								__CLOVER_80_0.cloverRec.S[12946]++;expr2=null;
							}
						}}
						}__CLOVER_80_0.cloverRec.S[12947]++;t_then=lexer.lit(TK_THEN);
						__CLOVER_80_0.cloverRec.S[12948]++;if((((t_then==null) && (++__CLOVER_80_0.cloverRec.CT[2831]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2831]==0&false)))
						{{
							__CLOVER_80_0.cloverRec.S[12949]++;erreur_parse("Il faut then");
							__CLOVER_80_0.cloverRec.S[12950]++;erreur=true;
						}
						}__CLOVER_80_0.cloverRec.S[12951]++;liste_instr=parse_instr();
						__CLOVER_80_0.cloverRec.S[12952]++;instr_inspect=new Instr_Inspect(expr,liste_expr,liste_instr);
						__CLOVER_80_0.cloverRec.S[12953]++;instr_inspect.tinspect=t_inspect;
						__CLOVER_80_0.cloverRec.S[12954]++;instr_inspect.twhen=t_when;
						__CLOVER_80_0.cloverRec.S[12955]++;instr_inspect.tthen=t_then;
						__CLOVER_80_0.cloverRec.S[12956]++;if((((derniere_instr==null) && (++__CLOVER_80_0.cloverRec.CT[2832]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2832]==0&false)))
						{{
							__CLOVER_80_0.cloverRec.S[12957]++;derniere_instr=instr_inspect;
							__CLOVER_80_0.cloverRec.S[12958]++;res.addElement(instr_inspect);
						}
						}else
						{{
							__CLOVER_80_0.cloverRec.S[12959]++;((Suite)derniere_instr).setSuivant(instr_inspect);
							__CLOVER_80_0.cloverRec.S[12960]++;derniere_instr=instr_inspect;
						}
						}__CLOVER_80_0.cloverRec.S[12961]++;t_when=lexer.lit(TK_WHEN);
					}
					}__CLOVER_80_0.cloverRec.S[12962]++;t_else=lexer.lit(TK_ELSE);
					__CLOVER_80_0.cloverRec.S[12963]++;if((((t_else!=null) && (++__CLOVER_80_0.cloverRec.CT[2833]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2833]==0&false)))
					{{
						__CLOVER_80_0.cloverRec.S[12964]++;liste_instr=parse_instr();
						__CLOVER_80_0.cloverRec.S[12965]++;instr_inspect=new Instr_Inspect(expr,new Vector(),liste_instr);
						__CLOVER_80_0.cloverRec.S[12966]++;instr_inspect.tinspect=t_inspect;
						__CLOVER_80_0.cloverRec.S[12967]++;instr_inspect.twhen=t_when;
						__CLOVER_80_0.cloverRec.S[12968]++;instr_inspect.tthen=t_then;
						__CLOVER_80_0.cloverRec.S[12969]++;if((((derniere_instr==null) && (++__CLOVER_80_0.cloverRec.CT[2834]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2834]==0&false)))
						{{
							__CLOVER_80_0.cloverRec.S[12970]++;derniere_instr=instr_inspect;
							__CLOVER_80_0.cloverRec.S[12971]++;res.addElement(instr_inspect);
						}
						}else
						{{
							__CLOVER_80_0.cloverRec.S[12972]++;((Suite)derniere_instr).setSuivant(instr_inspect);
							__CLOVER_80_0.cloverRec.S[12973]++;derniere_instr=instr_inspect;
						}
					}}
					}__CLOVER_80_0.cloverRec.S[12974]++;t_end=lexer.lit(TK_END);
					__CLOVER_80_0.cloverRec.S[12975]++;if((((t_end==null) && (++__CLOVER_80_0.cloverRec.CT[2835]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2835]==0&false)))
					{{
						__CLOVER_80_0.cloverRec.S[12976]++;erreur_parse("Il faut end");
						__CLOVER_80_0.cloverRec.S[12977]++;erreur=true;
					}
				}}
				}}
				__CLOVER_80_0.cloverRec.S[12978]++;break;
			case 6:if (!__CLOVER_bool0) {__CLOVER_80_0.cloverRec.S[12979]++;__CLOVER_bool0=true;} //Exclamation
				{// creation
				__CLOVER_80_0.cloverRec.S[12980]++;t_excl=lexer.lit(Exclamation);
				assert((((t_excl!=null)) && (++__CLOVER_80_0.cloverRec.CT[2836]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2836]==0&false));
				__CLOVER_80_0.cloverRec.S[12981]++;Vector liste_param=null;
				__CLOVER_80_0.cloverRec.S[12982]++;Token t_excl2,t_point,t_id2=null;
				__CLOVER_80_0.cloverRec.S[12983]++;Instr_Creation instr_creation;
				__CLOVER_80_0.cloverRec.S[12984]++;Type type;
				__CLOVER_80_0.cloverRec.S[12985]++;if((((lexer.test_prochain(debut_type)) && (++__CLOVER_80_0.cloverRec.CT[2837]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2837]==0&false)))
				{{
					__CLOVER_80_0.cloverRec.S[12986]++;type=parse_type(false);
				}
				}else
				{{
					__CLOVER_80_0.cloverRec.S[12987]++;type=null;
				}
				}__CLOVER_80_0.cloverRec.S[12988]++;t_excl2=lexer.lit(Exclamation);
				__CLOVER_80_0.cloverRec.S[12989]++;if((((t_excl2==null) && (++__CLOVER_80_0.cloverRec.CT[2838]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2838]==0&false)))
				{{
					__CLOVER_80_0.cloverRec.S[12990]++;erreur_parse("Il faut !");
					__CLOVER_80_0.cloverRec.S[12991]++;erreur=true;
				}
				}else
				{{
					__CLOVER_80_0.cloverRec.S[12992]++;t_id=lexer.lit(ID);
					__CLOVER_80_0.cloverRec.S[12993]++;if((((t_id==null) && (++__CLOVER_80_0.cloverRec.CT[2839]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2839]==0&false)))
					{{
						__CLOVER_80_0.cloverRec.S[12994]++;erreur_parse("Il faut un id");
						__CLOVER_80_0.cloverRec.S[12995]++;erreur=true;
					}
					}else
					{{
						__CLOVER_80_0.cloverRec.S[12996]++;t_point=lexer.lit(Point);
						__CLOVER_80_0.cloverRec.S[12997]++;liste_param=new Vector();
						__CLOVER_80_0.cloverRec.S[12998]++;if((((t_point!=null) && (++__CLOVER_80_0.cloverRec.CT[2840]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2840]==0&false)))
						{{
							__CLOVER_80_0.cloverRec.S[12999]++;t_id2=lexer.lit(ID);
							__CLOVER_80_0.cloverRec.S[13000]++;if((((t_id2==null) && (++__CLOVER_80_0.cloverRec.CT[2841]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2841]==0&false)))
							{{
								__CLOVER_80_0.cloverRec.S[13001]++;erreur_parse("Il faut un id");
								__CLOVER_80_0.cloverRec.S[13002]++;erreur=true;
							}
							}else
							{{
								__CLOVER_80_0.cloverRec.S[13003]++;liste_param=parse_param();
							}
						}}
						}__CLOVER_80_0.cloverRec.S[13004]++;if((((t_id2!=null) && (++__CLOVER_80_0.cloverRec.CT[2842]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2842]==0&false)))
							{__CLOVER_80_0.cloverRec.S[13005]++;instr_creation=new Instr_Creation(type,t_id.text,t_id2.text,liste_param);
						}else
							{__CLOVER_80_0.cloverRec.S[13006]++;instr_creation=new Instr_Creation(type,t_id.text,null,liste_param);
						}__CLOVER_80_0.cloverRec.S[13007]++;ajoute_type(type);
						__CLOVER_80_0.cloverRec.S[13008]++;instr_creation.texcl1=t_excl;
						__CLOVER_80_0.cloverRec.S[13009]++;instr_creation.texcl2=t_excl2;
						__CLOVER_80_0.cloverRec.S[13010]++;instr_creation.tid=t_id;
						__CLOVER_80_0.cloverRec.S[13011]++;instr_creation.tid2=t_id2;
						__CLOVER_80_0.cloverRec.S[13012]++;instr_creation.tpoint=t_point;
						__CLOVER_80_0.cloverRec.S[13013]++;res.addElement(instr_creation);
					}
				}}
				}}
				__CLOVER_80_0.cloverRec.S[13014]++;break;
			case 7:if (!__CLOVER_bool0) {__CLOVER_80_0.cloverRec.S[13015]++;__CLOVER_bool0=true;}// ID
				{
					__CLOVER_80_0.cloverRec.S[13016]++;int n,tab[][]={{ID,Point,ID,Affect},
								{ID,Affect},
								{ID,Point,ID,TentativeAffect},
								{ID,TentativeAffect}};
					__CLOVER_80_0.cloverRec.S[13017]++;n=lexer.test_prochain4(tab);
					__CLOVER_80_0.cloverRec.S[13018]++;if((((n!=-1) && (++__CLOVER_80_0.cloverRec.CT[2843]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2843]==0&false)))
					{{// c'est un affect
						__CLOVER_80_0.cloverRec.S[13019]++;Token t_id2,t_point,t_affect;
						__CLOVER_80_0.cloverRec.S[13020]++;Expr expr;
						__CLOVER_80_0.cloverRec.S[13021]++;Instr_Affect instr_affect;
						__CLOVER_80_0.cloverRec.S[13022]++;Instr_TentAffect instr_tent_affect;
						__CLOVER_80_0.cloverRec.S[13023]++;boolean __CLOVER_bool1=false;switch(n)
						{
							case 0:if (!__CLOVER_bool1) {__CLOVER_80_0.cloverRec.S[13024]++;__CLOVER_bool1=true;}
								__CLOVER_80_0.cloverRec.S[13025]++;t_id=lexer.lit(ID);
								assert((((t_id!=null)) && (++__CLOVER_80_0.cloverRec.CT[2844]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2844]==0&false));
								__CLOVER_80_0.cloverRec.S[13026]++;t_point=lexer.lit(Point);
								assert((((t_point!=null)) && (++__CLOVER_80_0.cloverRec.CT[2845]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2845]==0&false));
								__CLOVER_80_0.cloverRec.S[13027]++;t_id2=lexer.lit(ID);
								assert((((t_id2!=null)) && (++__CLOVER_80_0.cloverRec.CT[2846]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2846]==0&false));
								__CLOVER_80_0.cloverRec.S[13028]++;t_affect=lexer.lit(Affect);
								assert((((t_affect!=null)) && (++__CLOVER_80_0.cloverRec.CT[2847]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2847]==0&false));
								__CLOVER_80_0.cloverRec.S[13029]++;expr=parse_expr();
								__CLOVER_80_0.cloverRec.S[13030]++;instr_affect=new Instr_Affect(t_id2.text,expr);
								__CLOVER_80_0.cloverRec.S[13031]++;instr_affect.set_token(t_id2,t_affect);
								__CLOVER_80_0.cloverRec.S[13032]++;instr_affect.tcurrent=t_id;
								__CLOVER_80_0.cloverRec.S[13033]++;instr_affect.var_current=t_id.text;
								__CLOVER_80_0.cloverRec.S[13034]++;res.addElement(instr_affect);
								__CLOVER_80_0.cloverRec.S[13035]++;break;
							case 1:if (!__CLOVER_bool1) {__CLOVER_80_0.cloverRec.S[13036]++;__CLOVER_bool1=true;}
								__CLOVER_80_0.cloverRec.S[13037]++;t_id2=lexer.lit(ID);
								assert((((t_id2!=null)) && (++__CLOVER_80_0.cloverRec.CT[2848]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2848]==0&false));
								__CLOVER_80_0.cloverRec.S[13038]++;t_affect=lexer.lit(Affect);
								assert((((t_affect!=null)) && (++__CLOVER_80_0.cloverRec.CT[2849]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2849]==0&false));
								__CLOVER_80_0.cloverRec.S[13039]++;expr=parse_expr();
								__CLOVER_80_0.cloverRec.S[13040]++;instr_affect=new Instr_Affect(t_id2.text,expr);
								__CLOVER_80_0.cloverRec.S[13041]++;instr_affect.set_token(t_id2,t_affect);
								__CLOVER_80_0.cloverRec.S[13042]++;res.addElement(instr_affect);
								__CLOVER_80_0.cloverRec.S[13043]++;break;
							case 2:if (!__CLOVER_bool1) {__CLOVER_80_0.cloverRec.S[13044]++;__CLOVER_bool1=true;}
								__CLOVER_80_0.cloverRec.S[13045]++;t_id=lexer.lit(ID);
								assert((((t_id!=null)) && (++__CLOVER_80_0.cloverRec.CT[2850]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2850]==0&false));
								__CLOVER_80_0.cloverRec.S[13046]++;t_point=lexer.lit(Point);
								assert((((t_point!=null)) && (++__CLOVER_80_0.cloverRec.CT[2851]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2851]==0&false));
								__CLOVER_80_0.cloverRec.S[13047]++;t_id2=lexer.lit(ID);
								assert((((t_id2!=null)) && (++__CLOVER_80_0.cloverRec.CT[2852]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2852]==0&false));
								__CLOVER_80_0.cloverRec.S[13048]++;t_affect=lexer.lit(TentativeAffect);
								assert((((t_affect!=null)) && (++__CLOVER_80_0.cloverRec.CT[2853]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2853]==0&false));
								__CLOVER_80_0.cloverRec.S[13049]++;expr=parse_expr();
								__CLOVER_80_0.cloverRec.S[13050]++;instr_tent_affect=new Instr_TentAffect(t_id2.text,expr);
								__CLOVER_80_0.cloverRec.S[13051]++;instr_tent_affect.set_token(t_id2,t_affect);
								__CLOVER_80_0.cloverRec.S[13052]++;instr_tent_affect.tcurrent=t_id;
								__CLOVER_80_0.cloverRec.S[13053]++;instr_tent_affect.var_current=t_id.text;
								__CLOVER_80_0.cloverRec.S[13054]++;res.addElement(instr_tent_affect);
								__CLOVER_80_0.cloverRec.S[13055]++;break;
							case 3:if (!__CLOVER_bool1) {__CLOVER_80_0.cloverRec.S[13056]++;__CLOVER_bool1=true;}
								__CLOVER_80_0.cloverRec.S[13057]++;t_id2=lexer.lit(ID);
								assert((((t_id2!=null)) && (++__CLOVER_80_0.cloverRec.CT[2854]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2854]==0&false));
								__CLOVER_80_0.cloverRec.S[13058]++;t_affect=lexer.lit(TentativeAffect);
								assert((((t_affect!=null)) && (++__CLOVER_80_0.cloverRec.CT[2855]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2855]==0&false));
								__CLOVER_80_0.cloverRec.S[13059]++;expr=parse_expr();
								__CLOVER_80_0.cloverRec.S[13060]++;instr_tent_affect=new Instr_TentAffect(t_id2.text,expr);
								__CLOVER_80_0.cloverRec.S[13061]++;instr_tent_affect.set_token(t_id2,t_affect);
								__CLOVER_80_0.cloverRec.S[13062]++;res.addElement(instr_tent_affect);
								__CLOVER_80_0.cloverRec.S[13063]++;break;
							default:if (!__CLOVER_bool1) {__CLOVER_80_0.cloverRec.S[13064]++;__CLOVER_bool1=true;}
								assert((((false)) && (++__CLOVER_80_0.cloverRec.CT[2856]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2856]==0&false));
						}
						__CLOVER_80_0.cloverRec.S[13065]++;break;
					}
					}else
					{{// on continue
						__CLOVER_80_0.cloverRec.S[13066]++;Vector liste_param;
						__CLOVER_80_0.cloverRec.S[13067]++;t_id=lexer.lit(ID);
						assert((((t_id!=null)) && (++__CLOVER_80_0.cloverRec.CT[2857]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2857]==0&false));
						__CLOVER_80_0.cloverRec.S[13068]++;liste_param=parse_param();
						__CLOVER_80_0.cloverRec.S[13069]++;instr_appel=new Instr_Appel(t_id.text,liste_param);
						__CLOVER_80_0.cloverRec.S[13070]++;instr_appel.tid=t_id;
						__CLOVER_80_0.cloverRec.S[13071]++;res.addElement(instr_appel);
					}
				}}
			case 8:if (!__CLOVER_bool0) {__CLOVER_80_0.cloverRec.S[13072]++;__CLOVER_bool0=true;}// ParentO
				__CLOVER_80_0.cloverRec.S[13073]++;if((((instr_appel==null) && (++__CLOVER_80_0.cloverRec.CT[2858]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2858]==0&false)))
				{{
					__CLOVER_80_0.cloverRec.S[13074]++;Token t_parentO,t_parentF;
					__CLOVER_80_0.cloverRec.S[13075]++;Expr expr;
					__CLOVER_80_0.cloverRec.S[13076]++;t_parentO=lexer.lit(ParentO);
					assert((((t_parentO!=null)) && (++__CLOVER_80_0.cloverRec.CT[2859]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2859]==0&false));
					__CLOVER_80_0.cloverRec.S[13077]++;expr=parse_expr();
					__CLOVER_80_0.cloverRec.S[13078]++;if((((expr==null) && (++__CLOVER_80_0.cloverRec.CT[2860]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2860]==0&false)))
					{{
						__CLOVER_80_0.cloverRec.S[13079]++;erreur_parse("Il faut une expression");
						__CLOVER_80_0.cloverRec.S[13080]++;erreur=true;
					}
					}else
					{{
						__CLOVER_80_0.cloverRec.S[13081]++;t_parentF=lexer.lit(ParentF);
						__CLOVER_80_0.cloverRec.S[13082]++;if((((t_parentF==null) && (++__CLOVER_80_0.cloverRec.CT[2861]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2861]==0&false)))
						{{
							__CLOVER_80_0.cloverRec.S[13083]++;erreur_parse("Il faut )");
							__CLOVER_80_0.cloverRec.S[13084]++;erreur=true;
						}
						}__CLOVER_80_0.cloverRec.S[13085]++;instr_appel=new Instr_Appel(expr);
						__CLOVER_80_0.cloverRec.S[13086]++;res.addElement(instr_appel);
					}
				}}
			}case 9:if (!__CLOVER_bool0) {__CLOVER_80_0.cloverRec.S[13087]++;__CLOVER_bool0=true;}// INT
				__CLOVER_80_0.cloverRec.S[13088]++;if((((instr_appel==null) && (++__CLOVER_80_0.cloverRec.CT[2862]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2862]==0&false)))
				{{
					__CLOVER_80_0.cloverRec.S[13089]++;Token t_int;
					__CLOVER_80_0.cloverRec.S[13090]++;Expr expr;
					__CLOVER_80_0.cloverRec.S[13091]++;t_int=lexer.lit(INT);
					assert((((t_int!=null)) && (++__CLOVER_80_0.cloverRec.CT[2863]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2863]==0&false));
					__CLOVER_80_0.cloverRec.S[13092]++;expr=new Expr_Entier(t_int.text,t_int);
					__CLOVER_80_0.cloverRec.S[13093]++;instr_appel=new Instr_Appel(expr);
					__CLOVER_80_0.cloverRec.S[13094]++;res.addElement(instr_appel);
				}
			}case 10:if (!__CLOVER_bool0) {__CLOVER_80_0.cloverRec.S[13095]++;__CLOVER_bool0=true;}// REAL
				__CLOVER_80_0.cloverRec.S[13096]++;if((((instr_appel==null) && (++__CLOVER_80_0.cloverRec.CT[2864]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2864]==0&false)))
				{{
					__CLOVER_80_0.cloverRec.S[13097]++;Token t_real;
					__CLOVER_80_0.cloverRec.S[13098]++;Expr expr;
					__CLOVER_80_0.cloverRec.S[13099]++;t_real=lexer.lit(REAL);
					assert((((t_real!=null)) && (++__CLOVER_80_0.cloverRec.CT[2865]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2865]==0&false));
					__CLOVER_80_0.cloverRec.S[13100]++;expr=new Expr_Reel(t_real.text,t_real);
					__CLOVER_80_0.cloverRec.S[13101]++;instr_appel=new Instr_Appel(expr);
					__CLOVER_80_0.cloverRec.S[13102]++;res.addElement(instr_appel);
				}
			}case 11:if (!__CLOVER_bool0) {__CLOVER_80_0.cloverRec.S[13103]++;__CLOVER_bool0=true;}// STRING
				__CLOVER_80_0.cloverRec.S[13104]++;if((((instr_appel==null) && (++__CLOVER_80_0.cloverRec.CT[2866]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2866]==0&false)))
				{{
					__CLOVER_80_0.cloverRec.S[13105]++;Chaine chaine;
					__CLOVER_80_0.cloverRec.S[13106]++;Expr expr;
					__CLOVER_80_0.cloverRec.S[13107]++;chaine=parse_chaine();
					assert((((chaine!=null)) && (++__CLOVER_80_0.cloverRec.CT[2867]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2867]==0&false));
					__CLOVER_80_0.cloverRec.S[13108]++;expr=new Expr_Chaine(chaine);
					__CLOVER_80_0.cloverRec.S[13109]++;instr_appel=new Instr_Appel(expr);
					__CLOVER_80_0.cloverRec.S[13110]++;res.addElement(instr_appel);
				}
			}case 12:if (!__CLOVER_bool0) {__CLOVER_80_0.cloverRec.S[13111]++;__CLOVER_bool0=true;}// CHAR
				__CLOVER_80_0.cloverRec.S[13112]++;if((((instr_appel==null) && (++__CLOVER_80_0.cloverRec.CT[2868]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2868]==0&false)))
				{{
					__CLOVER_80_0.cloverRec.S[13113]++;Token t_char;
					__CLOVER_80_0.cloverRec.S[13114]++;Expr expr;
					__CLOVER_80_0.cloverRec.S[13115]++;t_char=lexer.lit(CHAR);
					assert((((t_char!=null)) && (++__CLOVER_80_0.cloverRec.CT[2869]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2869]==0&false));
					__CLOVER_80_0.cloverRec.S[13116]++;expr=new Expr_Car(t_char.text,t_char);
					__CLOVER_80_0.cloverRec.S[13117]++;instr_appel=new Instr_Appel(expr);
					__CLOVER_80_0.cloverRec.S[13118]++;res.addElement(instr_appel);
				}
				}{
				__CLOVER_80_0.cloverRec.S[13119]++;Instr derniere_instr;
				__CLOVER_80_0.cloverRec.S[13120]++;Token t_point;
				__CLOVER_80_0.cloverRec.S[13121]++;Vector liste_param;
				assert((((instr_appel!=null)) && (++__CLOVER_80_0.cloverRec.CT[2870]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2870]==0&false));
				__CLOVER_80_0.cloverRec.S[13122]++;derniere_instr=instr_appel;
				__CLOVER_80_0.cloverRec.S[13123]++;t_point=lexer.lit(Point);
				__CLOVER_80_0.cloverRec.S[13124]++;while((((t_point!=null&&!erreur) && (++__CLOVER_80_0.cloverRec.CT[2871]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2871]==0&false)))
				{{
					__CLOVER_80_0.cloverRec.S[13125]++;t_id=lexer.lit(ID);
					__CLOVER_80_0.cloverRec.S[13126]++;if((((t_id==null) && (++__CLOVER_80_0.cloverRec.CT[2872]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2872]==0&false)))
					{{
						__CLOVER_80_0.cloverRec.S[13127]++;erreur_parse("Il faut un id");
						__CLOVER_80_0.cloverRec.S[13128]++;erreur=true;
					}
					}else
					{{
						__CLOVER_80_0.cloverRec.S[13129]++;liste_param=parse_param();
						__CLOVER_80_0.cloverRec.S[13130]++;instr_appel=new Instr_Appel(t_id.text,liste_param);
						__CLOVER_80_0.cloverRec.S[13131]++;instr_appel.tid=t_id;
						__CLOVER_80_0.cloverRec.S[13132]++;instr_appel.tpoint=t_point;
						__CLOVER_80_0.cloverRec.S[13133]++;((Suite)derniere_instr).setSuivant(instr_appel);
						__CLOVER_80_0.cloverRec.S[13134]++;derniere_instr=instr_appel;
					}
					}__CLOVER_80_0.cloverRec.S[13135]++;t_point=lexer.lit(Point);
				}
				}__CLOVER_80_0.cloverRec.S[13136]++;instr_appel=null;
				}
				__CLOVER_80_0.cloverRec.S[13137]++;break;
			default:if (!__CLOVER_bool0) {__CLOVER_80_0.cloverRec.S[13138]++;__CLOVER_bool0=true;}
				{
				//erreur_parse("Default");
				__CLOVER_80_0.cloverRec.S[13139]++;int tab[]={PointVirgule};
				__CLOVER_80_0.cloverRec.S[13140]++;if((((!lexer.test_prochain(tab)) && (++__CLOVER_80_0.cloverRec.CT[2873]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2873]==0&false)))
					{__CLOVER_80_0.cloverRec.S[13141]++;fin=true;
				}}
				__CLOVER_80_0.cloverRec.S[13142]++;break;
			}
			__CLOVER_80_0.cloverRec.S[13143]++;parse_point_virgule();
		} }while((((!fin&&!erreur) && (++__CLOVER_80_0.cloverRec.CT[2874]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2874]==0&false)));
		__CLOVER_80_0.cloverRec.S[13144]++;if((((erreur||!etatParserOk()||!etatOk()) && (++__CLOVER_80_0.cloverRec.CT[2875]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2875]==0&false)))
		{{
			__CLOVER_80_0.cloverRec.S[13145]++;erreur_parse2("Erreur dans l'instruction");
		}
		}__CLOVER_80_0.cloverRec.S[13146]++;return res;
	}

	Vector parse_param()
	{__CLOVER_80_0.cloverRec.M[707]++;
		__CLOVER_80_0.cloverRec.S[13147]++;Vector res=new Vector();
		__CLOVER_80_0.cloverRec.S[13148]++;Expr exp;
		__CLOVER_80_0.cloverRec.S[13149]++;boolean erreur=false;
		__CLOVER_80_0.cloverRec.S[13150]++;Token t_virgule,t_parentO,t_parentF;
		__CLOVER_80_0.cloverRec.S[13151]++;t_parentO=lexer.lit(ParentO);
		__CLOVER_80_0.cloverRec.S[13152]++;if((((t_parentO!=null) && (++__CLOVER_80_0.cloverRec.CT[2876]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2876]==0&false)))
		{{
			__CLOVER_80_0.cloverRec.S[13153]++;exp=parse_expr();
			__CLOVER_80_0.cloverRec.S[13154]++;while((((exp!=null) && (++__CLOVER_80_0.cloverRec.CT[2877]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2877]==0&false)))
			{{
				__CLOVER_80_0.cloverRec.S[13155]++;res.addElement(exp);
				__CLOVER_80_0.cloverRec.S[13156]++;t_virgule=lexer.lit(Virgule);
				__CLOVER_80_0.cloverRec.S[13157]++;if((((t_virgule!=null) && (++__CLOVER_80_0.cloverRec.CT[2878]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2878]==0&false)))
				{{
					__CLOVER_80_0.cloverRec.S[13158]++;exp=parse_expr();
				}
				}else
				{{
					__CLOVER_80_0.cloverRec.S[13159]++;exp=null;
				}
			}}
			}__CLOVER_80_0.cloverRec.S[13160]++;t_parentF=lexer.lit(ParentF);
			__CLOVER_80_0.cloverRec.S[13161]++;if((((t_parentF==null) && (++__CLOVER_80_0.cloverRec.CT[2879]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2879]==0&false)))
			{{
				__CLOVER_80_0.cloverRec.S[13162]++;erreur_parse("Il faut )");
				__CLOVER_80_0.cloverRec.S[13163]++;erreur=true;
			}
		}}
		}__CLOVER_80_0.cloverRec.S[13164]++;return res;
	}

	Vector parse_assert()
	{__CLOVER_80_0.cloverRec.M[708]++;// TODO: prendre en compte : 
	// test_important: a>0
		__CLOVER_80_0.cloverRec.S[13165]++;Vector res=new Vector();
		__CLOVER_80_0.cloverRec.S[13166]++;Expr exp;
		__CLOVER_80_0.cloverRec.S[13167]++;Assert as;
		__CLOVER_80_0.cloverRec.S[13168]++;String nom=null;
		__CLOVER_80_0.cloverRec.S[13169]++;boolean erreur=false;
		__CLOVER_80_0.cloverRec.S[13170]++;int tab1[]={ID},tab2[]={DoublePoint},i;
		//System.out.println("Deb");
		__CLOVER_80_0.cloverRec.S[13171]++;if((((lexer.test_prochain2(tab1,tab2)) && (++__CLOVER_80_0.cloverRec.CT[2880]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2880]==0&false)))
		{{
			__CLOVER_80_0.cloverRec.S[13172]++;Token t_nom,t_dpoint;
			//assert(false);
			__CLOVER_80_0.cloverRec.S[13173]++;t_nom=lexer.lit(ID);
			assert((((t_nom!=null)) && (++__CLOVER_80_0.cloverRec.CT[2881]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2881]==0&false));
			__CLOVER_80_0.cloverRec.S[13174]++;t_dpoint=lexer.lit(DoublePoint);
			assert((((t_dpoint!=null)) && (++__CLOVER_80_0.cloverRec.CT[2882]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2882]==0&false));
			__CLOVER_80_0.cloverRec.S[13175]++;nom=t_nom.text;
		}
		}else
		{{
			__CLOVER_80_0.cloverRec.S[13176]++;nom=null;
		}
		//System.out.println("Deb2");
		//assert(false);
		//System.out.println("Deb2");
		}__CLOVER_80_0.cloverRec.S[13177]++;exp=parse_expr();
		//System.out.println("Deb3");
		__CLOVER_80_0.cloverRec.S[13178]++;if((((exp!=null) && (++__CLOVER_80_0.cloverRec.CT[2883]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2883]==0&false)))
		{{
			__CLOVER_80_0.cloverRec.S[13179]++;if((((nom==null) && (++__CLOVER_80_0.cloverRec.CT[2884]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2884]==0&false)))
			{{
				__CLOVER_80_0.cloverRec.S[13180]++;as=new Assert(exp);
			}
			}else
			{{
				__CLOVER_80_0.cloverRec.S[13181]++;as=new Assert(nom,exp);
			}
		}}
		}else
		{{
			__CLOVER_80_0.cloverRec.S[13182]++;as=null;
		}
		//i=0;
		//System.out.println("Mil");
		}__CLOVER_80_0.cloverRec.S[13183]++;while((((as!=null) && (++__CLOVER_80_0.cloverRec.CT[2885]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2885]==0&false)))
		{{
			//System.out.println(i);i++;
			__CLOVER_80_0.cloverRec.S[13184]++;res.addElement(as);
			__CLOVER_80_0.cloverRec.S[13185]++;parse_point_virgule();
			__CLOVER_80_0.cloverRec.S[13186]++;if((((lexer.test_prochain2(tab1,tab2)) && (++__CLOVER_80_0.cloverRec.CT[2886]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2886]==0&false)))
			{{
				__CLOVER_80_0.cloverRec.S[13187]++;Token t_nom=lexer.lit(ID),t_dpoint;
				assert((((t_nom!=null)) && (++__CLOVER_80_0.cloverRec.CT[2887]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2887]==0&false));
				__CLOVER_80_0.cloverRec.S[13188]++;t_dpoint=lexer.lit(DoublePoint);
				assert((((t_dpoint!=null)) && (++__CLOVER_80_0.cloverRec.CT[2888]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2888]==0&false));
				__CLOVER_80_0.cloverRec.S[13189]++;nom=t_nom.text;
			}
			}else
			{{
				__CLOVER_80_0.cloverRec.S[13190]++;nom=null;
			}
			}__CLOVER_80_0.cloverRec.S[13191]++;exp=parse_expr();
			__CLOVER_80_0.cloverRec.S[13192]++;if((((exp!=null) && (++__CLOVER_80_0.cloverRec.CT[2889]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2889]==0&false)))
			{{
				__CLOVER_80_0.cloverRec.S[13193]++;if((((nom==null) && (++__CLOVER_80_0.cloverRec.CT[2890]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2890]==0&false)))
				{{
					__CLOVER_80_0.cloverRec.S[13194]++;as=new Assert(exp);
				}
				}else
				{{
					__CLOVER_80_0.cloverRec.S[13195]++;as=new Assert(nom,exp);
				}
			}}
			}else
			{{
				__CLOVER_80_0.cloverRec.S[13196]++;as=null;
			}
		}}
		}__CLOVER_80_0.cloverRec.S[13197]++;if((((!etatParserOk()||!etatOk()) && (++__CLOVER_80_0.cloverRec.CT[2891]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2891]==0&false)))
		{{
			__CLOVER_80_0.cloverRec.S[13198]++;erreur_parse2("Erreur dans la liste d'assertion");
		}
		//System.out.println("End");
		}__CLOVER_80_0.cloverRec.S[13199]++;return res;
	}

	Vector parse_heritage()
	{__CLOVER_80_0.cloverRec.M[709]++;
		__CLOVER_80_0.cloverRec.S[13200]++;Token t_herit,t_expanded,t_deferred;
		__CLOVER_80_0.cloverRec.S[13201]++;Type type;
		__CLOVER_80_0.cloverRec.S[13202]++;Heritage h=null;
		__CLOVER_80_0.cloverRec.S[13203]++;boolean erreur=false,est_expanded=false,est_deferred=false;
		__CLOVER_80_0.cloverRec.S[13204]++;Vector liste_heritage=null;
		__CLOVER_80_0.cloverRec.S[13205]++;t_herit=lexer.lit(TK_INHERIT);
		__CLOVER_80_0.cloverRec.S[13206]++;if((((t_herit!=null) && (++__CLOVER_80_0.cloverRec.CT[2892]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2892]==0&false)))
		{{
			__CLOVER_80_0.cloverRec.S[13207]++;liste_heritage=new Vector();
			__CLOVER_80_0.cloverRec.S[13208]++;type=parse_type(false);
			__CLOVER_80_0.cloverRec.S[13209]++;while((((type!=null) && (++__CLOVER_80_0.cloverRec.CT[2893]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2893]==0&false)))
			{{
				__CLOVER_80_0.cloverRec.S[13210]++;Vector rename=new Vector(),export=new Vector(),
					undefine=new Vector(),redefine=new Vector(),
					select=new Vector();
				__CLOVER_80_0.cloverRec.S[13211]++;Token therit=null,t_rename=null,t_export=null,
					t_undefine=null,t_redefine=null,t_select=null,t_end=null;
				__CLOVER_80_0.cloverRec.S[13212]++;NomFeature n1,n2;
				// rename
				__CLOVER_80_0.cloverRec.S[13213]++;t_rename=lexer.lit(TK_RENAME);
				__CLOVER_80_0.cloverRec.S[13214]++;if((((t_rename!=null) && (++__CLOVER_80_0.cloverRec.CT[2894]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2894]==0&false)))
				{{
					__CLOVER_80_0.cloverRec.S[13215]++;Token t_id,t_id2,t_as,t_virgule;
					__CLOVER_80_0.cloverRec.S[13216]++;boolean fin=false;
					__CLOVER_80_0.cloverRec.S[13217]++;Rename ren;
					__CLOVER_80_0.cloverRec.S[13218]++;do
					{{
						__CLOVER_80_0.cloverRec.S[13219]++;n1=parse_nom_feature();
						__CLOVER_80_0.cloverRec.S[13220]++;if((((n1!=null) && (++__CLOVER_80_0.cloverRec.CT[2895]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2895]==0&false)))
						{{
							__CLOVER_80_0.cloverRec.S[13221]++;t_as=lexer.lit(TK_AS);
							__CLOVER_80_0.cloverRec.S[13222]++;if((((t_as==null) && (++__CLOVER_80_0.cloverRec.CT[2896]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2896]==0&false)))
							{{
								__CLOVER_80_0.cloverRec.S[13223]++;erreur_parse("Il faut as");
								__CLOVER_80_0.cloverRec.S[13224]++;erreur=true;
								__CLOVER_80_0.cloverRec.S[13225]++;fin=true;
							}
							}else
							{{
								__CLOVER_80_0.cloverRec.S[13226]++;n2=parse_nom_feature();
								__CLOVER_80_0.cloverRec.S[13227]++;if((((n2!=null) && (++__CLOVER_80_0.cloverRec.CT[2897]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2897]==0&false)))
								{{
									__CLOVER_80_0.cloverRec.S[13228]++;ren=new Rename(n1,n2);
									__CLOVER_80_0.cloverRec.S[13229]++;rename.addElement(ren);
									__CLOVER_80_0.cloverRec.S[13230]++;t_virgule=lexer.lit(Virgule);
									__CLOVER_80_0.cloverRec.S[13231]++;if((((t_virgule==null) && (++__CLOVER_80_0.cloverRec.CT[2898]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2898]==0&false)))
									{{
										__CLOVER_80_0.cloverRec.S[13232]++;fin=true;
									}
								}}
								}else
								{{
									__CLOVER_80_0.cloverRec.S[13233]++;erreur_parse("Il faut un nom de feature");
									__CLOVER_80_0.cloverRec.S[13234]++;erreur=true;
									__CLOVER_80_0.cloverRec.S[13235]++;fin=true;
								}
							}}
						}}
						}else
						{{
							__CLOVER_80_0.cloverRec.S[13236]++;fin=true;
						}
						
					}} }while((((!fin) && (++__CLOVER_80_0.cloverRec.CT[2899]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2899]==0&false)));
				}
				}__CLOVER_80_0.cloverRec.S[13237]++;parse_point_virgule();
				// export
				__CLOVER_80_0.cloverRec.S[13238]++;t_export=lexer.lit(TK_EXPORT);
				__CLOVER_80_0.cloverRec.S[13239]++;if((((t_export!=null) && (++__CLOVER_80_0.cloverRec.CT[2900]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2900]==0&false)))
				{{
					__CLOVER_80_0.cloverRec.S[13240]++;Token t_accolO,t_accolF,t_as,t_virgule,t_all;
					__CLOVER_80_0.cloverRec.S[13241]++;boolean fin=false;
					__CLOVER_80_0.cloverRec.S[13242]++;Export exp;
					__CLOVER_80_0.cloverRec.S[13243]++;Type t1,t2;
					__CLOVER_80_0.cloverRec.S[13244]++;Vector liste_type=null,liste_nom_feature;
					__CLOVER_80_0.cloverRec.S[13245]++;do
					{{
						__CLOVER_80_0.cloverRec.S[13246]++;liste_type=null;
						__CLOVER_80_0.cloverRec.S[13247]++;liste_nom_feature=new Vector();
						__CLOVER_80_0.cloverRec.S[13248]++;t_accolO=lexer.lit(AcoladeO);
						__CLOVER_80_0.cloverRec.S[13249]++;if((((t_accolO!=null) && (++__CLOVER_80_0.cloverRec.CT[2901]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2901]==0&false)))
						{{
							__CLOVER_80_0.cloverRec.S[13250]++;liste_type=new Vector();
							__CLOVER_80_0.cloverRec.S[13251]++;if((((lexer.test_prochain(debut_type)) && (++__CLOVER_80_0.cloverRec.CT[2902]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2902]==0&false)))
							{{
								__CLOVER_80_0.cloverRec.S[13252]++;t1=parse_type(false);
								__CLOVER_80_0.cloverRec.S[13253]++;while((((t1!=null) && (++__CLOVER_80_0.cloverRec.CT[2903]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2903]==0&false)))
								{{
									__CLOVER_80_0.cloverRec.S[13254]++;liste_type.addElement(t1);
									__CLOVER_80_0.cloverRec.S[13255]++;t_virgule=lexer.lit(Virgule);
									__CLOVER_80_0.cloverRec.S[13256]++;if((((t_virgule==null) && (++__CLOVER_80_0.cloverRec.CT[2904]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2904]==0&false)))
									{{
										__CLOVER_80_0.cloverRec.S[13257]++;t1=null;
									}
									}else
									{{
										__CLOVER_80_0.cloverRec.S[13258]++;t1=parse_type(false);
									}
								}}
							}}
							}__CLOVER_80_0.cloverRec.S[13259]++;t_accolF=lexer.lit(AcoladeF);
							__CLOVER_80_0.cloverRec.S[13260]++;if((((t_accolF==null) && (++__CLOVER_80_0.cloverRec.CT[2905]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2905]==0&false)))
							{{
								__CLOVER_80_0.cloverRec.S[13261]++;erreur_parse("Il faut une accolade fermante");
								__CLOVER_80_0.cloverRec.S[13262]++;erreur=true;
								__CLOVER_80_0.cloverRec.S[13263]++;fin=true;
							}
							}__CLOVER_80_0.cloverRec.S[13264]++;t_all=lexer.lit(TK_ALL);
							__CLOVER_80_0.cloverRec.S[13265]++;if((((t_all!=null) && (++__CLOVER_80_0.cloverRec.CT[2906]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2906]==0&false)))
							{{
	
							}
							}else
							{{
								__CLOVER_80_0.cloverRec.S[13266]++;n1=parse_nom_feature();
								__CLOVER_80_0.cloverRec.S[13267]++;while((((n1!=null) && (++__CLOVER_80_0.cloverRec.CT[2907]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2907]==0&false)))
								{{
									__CLOVER_80_0.cloverRec.S[13268]++;liste_nom_feature.addElement(n1);
									__CLOVER_80_0.cloverRec.S[13269]++;t_virgule=lexer.lit(Virgule);
									__CLOVER_80_0.cloverRec.S[13270]++;if((((t_virgule==null) && (++__CLOVER_80_0.cloverRec.CT[2908]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2908]==0&false)))
									{{
										__CLOVER_80_0.cloverRec.S[13271]++;n1=null;
									}
									}else
									{{
										__CLOVER_80_0.cloverRec.S[13272]++;n1=parse_nom_feature();
									}
								}}
							}}
							}__CLOVER_80_0.cloverRec.S[13273]++;exp=new Export(liste_nom_feature,liste_type);
							__CLOVER_80_0.cloverRec.S[13274]++;export.addElement(exp);
							__CLOVER_80_0.cloverRec.S[13275]++;parse_point_virgule();
						}
						}else
						{{
							__CLOVER_80_0.cloverRec.S[13276]++;fin=true;
						}
					}} }while((((!fin) && (++__CLOVER_80_0.cloverRec.CT[2909]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2909]==0&false)));
				}
				}__CLOVER_80_0.cloverRec.S[13277]++;parse_point_virgule();
				// undefine
				__CLOVER_80_0.cloverRec.S[13278]++;t_undefine=lexer.lit(TK_UNDEFINE);
				__CLOVER_80_0.cloverRec.S[13279]++;if((((t_undefine!=null) && (++__CLOVER_80_0.cloverRec.CT[2910]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2910]==0&false)))
				{{
					__CLOVER_80_0.cloverRec.S[13280]++;Token t_virgule;
					__CLOVER_80_0.cloverRec.S[13281]++;n1=parse_nom_feature();
					__CLOVER_80_0.cloverRec.S[13282]++;while((((n1!=null) && (++__CLOVER_80_0.cloverRec.CT[2911]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2911]==0&false)))
					{{
						__CLOVER_80_0.cloverRec.S[13283]++;undefine.addElement(n1);
						__CLOVER_80_0.cloverRec.S[13284]++;t_virgule=lexer.lit(Virgule);
						__CLOVER_80_0.cloverRec.S[13285]++;if((((t_virgule==null) && (++__CLOVER_80_0.cloverRec.CT[2912]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2912]==0&false)))
						{{
							__CLOVER_80_0.cloverRec.S[13286]++;n1=null;
						}
						}else
						{{
							__CLOVER_80_0.cloverRec.S[13287]++;n1=parse_nom_feature();
						}
					}}
				}}
				}__CLOVER_80_0.cloverRec.S[13288]++;parse_point_virgule();
				// redefine
				__CLOVER_80_0.cloverRec.S[13289]++;t_redefine=lexer.lit(TK_REDEFINE);
				__CLOVER_80_0.cloverRec.S[13290]++;if((((t_redefine!=null) && (++__CLOVER_80_0.cloverRec.CT[2913]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2913]==0&false)))
				{{
					__CLOVER_80_0.cloverRec.S[13291]++;Token t_virgule;
					__CLOVER_80_0.cloverRec.S[13292]++;n1=parse_nom_feature();
					__CLOVER_80_0.cloverRec.S[13293]++;while((((n1!=null) && (++__CLOVER_80_0.cloverRec.CT[2914]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2914]==0&false)))
					{{
						__CLOVER_80_0.cloverRec.S[13294]++;redefine.addElement(n1);
						__CLOVER_80_0.cloverRec.S[13295]++;t_virgule=lexer.lit(Virgule);
						__CLOVER_80_0.cloverRec.S[13296]++;if((((t_virgule==null) && (++__CLOVER_80_0.cloverRec.CT[2915]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2915]==0&false)))
						{{
							__CLOVER_80_0.cloverRec.S[13297]++;n1=null;
						}
						}else
						{{
							__CLOVER_80_0.cloverRec.S[13298]++;n1=parse_nom_feature();
						}
					}}
				}}
				}__CLOVER_80_0.cloverRec.S[13299]++;parse_point_virgule();
				// select
				__CLOVER_80_0.cloverRec.S[13300]++;t_select=lexer.lit(TK_SELECT);
				__CLOVER_80_0.cloverRec.S[13301]++;if((((t_select!=null) && (++__CLOVER_80_0.cloverRec.CT[2916]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2916]==0&false)))
				{{
					__CLOVER_80_0.cloverRec.S[13302]++;Token t_virgule;
					__CLOVER_80_0.cloverRec.S[13303]++;n1=parse_nom_feature();
					__CLOVER_80_0.cloverRec.S[13304]++;while((((n1!=null) && (++__CLOVER_80_0.cloverRec.CT[2917]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2917]==0&false)))
					{{
						__CLOVER_80_0.cloverRec.S[13305]++;select.addElement(n1);
						__CLOVER_80_0.cloverRec.S[13306]++;t_virgule=lexer.lit(Virgule);
						__CLOVER_80_0.cloverRec.S[13307]++;if((((t_virgule==null) && (++__CLOVER_80_0.cloverRec.CT[2918]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2918]==0&false)))
						{{
							__CLOVER_80_0.cloverRec.S[13308]++;n1=null;
						}
						}else
						{{
							__CLOVER_80_0.cloverRec.S[13309]++;n1=parse_nom_feature();
						}
					}}
				}}
				}__CLOVER_80_0.cloverRec.S[13310]++;parse_point_virgule();
				__CLOVER_80_0.cloverRec.S[13311]++;t_end=lexer.lit(TK_END);
				__CLOVER_80_0.cloverRec.S[13312]++;parse_point_virgule();
				__CLOVER_80_0.cloverRec.S[13313]++;h=new Heritage(type,rename,export,undefine,redefine,select);
				__CLOVER_80_0.cloverRec.S[13314]++;h.set_token(t_herit,t_rename,t_export,t_undefine,t_redefine,
						t_select,t_end);
				__CLOVER_80_0.cloverRec.S[13315]++;liste_heritage.addElement(h);
				__CLOVER_80_0.cloverRec.S[13316]++;parse_point_virgule();
				__CLOVER_80_0.cloverRec.S[13317]++;if((((lexer.test_prochain(debut_type)) && (++__CLOVER_80_0.cloverRec.CT[2919]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2919]==0&false)))
				{{
					__CLOVER_80_0.cloverRec.S[13318]++;type=parse_type(false);
				}
				}else
				{{
					__CLOVER_80_0.cloverRec.S[13319]++;type=null;
				}
			}}
		}}
		//assert((cl!=null)!=erreur);
		}__CLOVER_80_0.cloverRec.S[13320]++;if((((erreur||!etatParserOk()||!etatOk()) && (++__CLOVER_80_0.cloverRec.CT[2920]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2920]==0&false)))
		{{
			__CLOVER_80_0.cloverRec.S[13321]++;erreur_parse2("Erreur dans l'heritage");
		}
		}__CLOVER_80_0.cloverRec.S[13322]++;return liste_heritage;
	}

	int debut_type[]={TK_EXPANDED,ID,TK_LIKE};

	void parse_point_virgule()
	{__CLOVER_80_0.cloverRec.M[710]++;
		__CLOVER_80_0.cloverRec.S[13323]++;Token t_virgule;
		__CLOVER_80_0.cloverRec.S[13324]++;t_virgule=lexer.lit(PointVirgule);
		__CLOVER_80_0.cloverRec.S[13325]++;while((((t_virgule!=null) && (++__CLOVER_80_0.cloverRec.CT[2921]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2921]==0&false)))
		{{
			__CLOVER_80_0.cloverRec.S[13326]++;t_virgule=lexer.lit(PointVirgule);
		}
	}}

	Vector parse_creation()
	{__CLOVER_80_0.cloverRec.M[711]++;
		__CLOVER_80_0.cloverRec.S[13327]++;Token t_creation,t_accoladeO,t_accoladeF,t_id,t_virgule;
		__CLOVER_80_0.cloverRec.S[13328]++;Type type;
		__CLOVER_80_0.cloverRec.S[13329]++;Creation c=null;
		__CLOVER_80_0.cloverRec.S[13330]++;boolean erreur=false,est_expanded=false,est_deferred=false;
		__CLOVER_80_0.cloverRec.S[13331]++;Vector liste_creation=new Vector(),liste_nom_feature,liste_type;
		__CLOVER_80_0.cloverRec.S[13332]++;NomFeature n;
		__CLOVER_80_0.cloverRec.S[13333]++;t_creation=lexer.lit(TK_CREATION);
		__CLOVER_80_0.cloverRec.S[13334]++;while((((t_creation!=null) && (++__CLOVER_80_0.cloverRec.CT[2922]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2922]==0&false)))
		{{
			__CLOVER_80_0.cloverRec.S[13335]++;liste_nom_feature=new Vector();
			__CLOVER_80_0.cloverRec.S[13336]++;t_accoladeO=lexer.lit(AcoladeO);
			__CLOVER_80_0.cloverRec.S[13337]++;if((((t_accoladeO!=null) && (++__CLOVER_80_0.cloverRec.CT[2923]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2923]==0&false)))
			{{
				__CLOVER_80_0.cloverRec.S[13338]++;liste_type=new Vector();
				__CLOVER_80_0.cloverRec.S[13339]++;if((((lexer.test_prochain(debut_type)) && (++__CLOVER_80_0.cloverRec.CT[2924]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2924]==0&false)))
				{{
					__CLOVER_80_0.cloverRec.S[13340]++;type=parse_type(false);
					__CLOVER_80_0.cloverRec.S[13341]++;while((((type!=null) && (++__CLOVER_80_0.cloverRec.CT[2925]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2925]==0&false)))
					{{
						__CLOVER_80_0.cloverRec.S[13342]++;liste_type.addElement(type);
						__CLOVER_80_0.cloverRec.S[13343]++;t_virgule=lexer.lit(Virgule);
						__CLOVER_80_0.cloverRec.S[13344]++;if((((t_virgule!=null) && (++__CLOVER_80_0.cloverRec.CT[2926]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2926]==0&false)))
						{{
							__CLOVER_80_0.cloverRec.S[13345]++;type=parse_type(false);
						}
						}else
						{{
							__CLOVER_80_0.cloverRec.S[13346]++;type=null;
						}
					}}
				}}
				}__CLOVER_80_0.cloverRec.S[13347]++;t_accoladeF=lexer.lit(AcoladeF);
				__CLOVER_80_0.cloverRec.S[13348]++;if((((t_accoladeF==null) && (++__CLOVER_80_0.cloverRec.CT[2927]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2927]==0&false)))
				{{
					__CLOVER_80_0.cloverRec.S[13349]++;erreur_parse("Il manque une accolade fermante");
				}
			}}
			}else
			{{
				__CLOVER_80_0.cloverRec.S[13350]++;liste_type=null;
			}
			}__CLOVER_80_0.cloverRec.S[13351]++;n=parse_nom_feature();
			__CLOVER_80_0.cloverRec.S[13352]++;while((((n!=null) && (++__CLOVER_80_0.cloverRec.CT[2928]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2928]==0&false)))
			{{
				__CLOVER_80_0.cloverRec.S[13353]++;liste_nom_feature.addElement(n);
				__CLOVER_80_0.cloverRec.S[13354]++;t_virgule=lexer.lit(Virgule);
				__CLOVER_80_0.cloverRec.S[13355]++;if((((t_virgule!=null) && (++__CLOVER_80_0.cloverRec.CT[2929]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2929]==0&false)))
				{{
					__CLOVER_80_0.cloverRec.S[13356]++;n=parse_nom_feature();
				}
				}else
				{{
					__CLOVER_80_0.cloverRec.S[13357]++;n=null;
				}
			}}
			}__CLOVER_80_0.cloverRec.S[13358]++;c=new Creation(liste_type,liste_nom_feature);
			__CLOVER_80_0.cloverRec.S[13359]++;c.set_token(t_creation);
			__CLOVER_80_0.cloverRec.S[13360]++;liste_creation.addElement(c);
			__CLOVER_80_0.cloverRec.S[13361]++;t_creation=lexer.lit(TK_CREATION);
		}
		//assert((cl!=null)!=erreur);
		}__CLOVER_80_0.cloverRec.S[13362]++;if((((erreur||!etatParserOk()||!etatOk()) && (++__CLOVER_80_0.cloverRec.CT[2930]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2930]==0&false)))
		{{
			__CLOVER_80_0.cloverRec.S[13363]++;erreur_parse2("Erreur dans la creation");
		}
		}__CLOVER_80_0.cloverRec.S[13364]++;return liste_creation;
	}

	// parse un type
	Type parse_type(boolean type_classe)
	{__CLOVER_80_0.cloverRec.M[712]++;
		__CLOVER_80_0.cloverRec.S[13365]++;Token t_type,t_expand,t_like;
		__CLOVER_80_0.cloverRec.S[13366]++;Type type=null,type2,type3;
		__CLOVER_80_0.cloverRec.S[13367]++;boolean erreur=false,expand=false;
		__CLOVER_80_0.cloverRec.S[13368]++;Token crochetO=null,crochetF=null,vers;
		__CLOVER_80_0.cloverRec.S[13369]++;t_expand=lexer.lit(TK_EXPANDED);
		__CLOVER_80_0.cloverRec.S[13370]++;if((((t_expand!=null) && (++__CLOVER_80_0.cloverRec.CT[2931]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2931]==0&false)))
		{{
			__CLOVER_80_0.cloverRec.S[13371]++;expand=true;
		}
		}__CLOVER_80_0.cloverRec.S[13372]++;t_type=lexer.lit(ID);
		__CLOVER_80_0.cloverRec.S[13373]++;if((((t_type==null) && (++__CLOVER_80_0.cloverRec.CT[2932]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2932]==0&false)))
		{{
			__CLOVER_80_0.cloverRec.S[13374]++;t_like=lexer.lit(TK_LIKE);
			__CLOVER_80_0.cloverRec.S[13375]++;if((((t_like==null) && (++__CLOVER_80_0.cloverRec.CT[2933]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2933]==0&false)))
			{{
				__CLOVER_80_0.cloverRec.S[13376]++;erreur_parse("Il faut un type");
				__CLOVER_80_0.cloverRec.S[13377]++;erreur=true;
			}
			}else
			{{
				__CLOVER_80_0.cloverRec.S[13378]++;Expr expr;
				__CLOVER_80_0.cloverRec.S[13379]++;expr=parse_expr();
				__CLOVER_80_0.cloverRec.S[13380]++;if((((expr!=null) && (++__CLOVER_80_0.cloverRec.CT[2934]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2934]==0&false)))
				{{
					__CLOVER_80_0.cloverRec.S[13381]++;type=new TypeAncre(expr);
					__CLOVER_80_0.cloverRec.S[13382]++;type.set_token(t_like);
				}
				}else
				{{
					__CLOVER_80_0.cloverRec.S[13383]++;erreur_parse("Il faut une expression");
					__CLOVER_80_0.cloverRec.S[13384]++;erreur=true;
				}
			}}
		}}
		}else
		{{
			__CLOVER_80_0.cloverRec.S[13385]++;Token virgule;
			__CLOVER_80_0.cloverRec.S[13386]++;Vector param=new Vector();
			__CLOVER_80_0.cloverRec.S[13387]++;boolean fin=false;
			__CLOVER_80_0.cloverRec.S[13388]++;crochetO=lexer.lit(CrochetO);
			__CLOVER_80_0.cloverRec.S[13389]++;if((((crochetO!=null) && (++__CLOVER_80_0.cloverRec.CT[2935]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2935]==0&false)))
			{{
				__CLOVER_80_0.cloverRec.S[13390]++;crochetF=lexer.lit(CrochetF);
				__CLOVER_80_0.cloverRec.S[13391]++;if((((crochetF==null) && (++__CLOVER_80_0.cloverRec.CT[2936]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2936]==0&false)))
				{{
					__CLOVER_80_0.cloverRec.S[13392]++;int i=0;
					__CLOVER_80_0.cloverRec.S[13393]++;while((((!fin) && (++__CLOVER_80_0.cloverRec.CT[2937]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2937]==0&false)))
					{{
						//erreur_parse("no="+i);
						__CLOVER_80_0.cloverRec.S[13394]++;if((((type_classe) && (++__CLOVER_80_0.cloverRec.CT[2938]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2938]==0&false)))
						{{
							__CLOVER_80_0.cloverRec.S[13395]++;type2=parse_type2();
						}
						}else
						{{
							__CLOVER_80_0.cloverRec.S[13396]++;type2=parse_type(type_classe);
						}
						}__CLOVER_80_0.cloverRec.S[13397]++;if((((type2!=null) && (++__CLOVER_80_0.cloverRec.CT[2939]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2939]==0&false)))
						{{
							__CLOVER_80_0.cloverRec.S[13398]++;param.addElement(type2);
							__CLOVER_80_0.cloverRec.S[13399]++;virgule=lexer.lit(Virgule);
							__CLOVER_80_0.cloverRec.S[13400]++;if((((virgule==null) && (++__CLOVER_80_0.cloverRec.CT[2940]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2940]==0&false)))
							{{
								__CLOVER_80_0.cloverRec.S[13401]++;fin=true;
							}
							}else
							{{
	
							}
						}}
						}else
						{{
							__CLOVER_80_0.cloverRec.S[13402]++;fin=true;
						}
						}__CLOVER_80_0.cloverRec.S[13403]++;i++;
					}
					}__CLOVER_80_0.cloverRec.S[13404]++;crochetF=lexer.lit(CrochetF);
					__CLOVER_80_0.cloverRec.S[13405]++;if((((crochetF==null) && (++__CLOVER_80_0.cloverRec.CT[2941]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2941]==0&false)))
					{{
						__CLOVER_80_0.cloverRec.S[13406]++;erreur_parse("Il faut ]");
						__CLOVER_80_0.cloverRec.S[13407]++;erreur=true;
					}
				}}
			}}
			}__CLOVER_80_0.cloverRec.S[13408]++;type=new TypeSimple(expand,t_type.text,param);
			__CLOVER_80_0.cloverRec.S[13409]++;type.set_token(t_type,crochetO,crochetF);
			__CLOVER_80_0.cloverRec.S[13410]++;ajoute_type(type);
		}
		}assert(((((type!=null)!=erreur)) && (++__CLOVER_80_0.cloverRec.CT[2942]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2942]==0&false));
		__CLOVER_80_0.cloverRec.S[13411]++;if((((erreur||!etatParserOk()||!etatOk()) && (++__CLOVER_80_0.cloverRec.CT[2943]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2943]==0&false)))
		{{
			__CLOVER_80_0.cloverRec.S[13412]++;erreur_parse2("Erreur dans le type");
		}
		}__CLOVER_80_0.cloverRec.S[13413]++;return type;
	}

	
	// parse un type
	Type parse_type2()
	{__CLOVER_80_0.cloverRec.M[713]++;
		__CLOVER_80_0.cloverRec.S[13414]++;Token t_type,t_expand,t_like;
		__CLOVER_80_0.cloverRec.S[13415]++;Type type=null,type2,type3;
		__CLOVER_80_0.cloverRec.S[13416]++;boolean erreur=false,expand=false;
		__CLOVER_80_0.cloverRec.S[13417]++;Token crochetO=null,crochetF=null,vers;
		__CLOVER_80_0.cloverRec.S[13418]++;t_expand=lexer.lit(TK_EXPANDED);
		__CLOVER_80_0.cloverRec.S[13419]++;if((((t_expand!=null) && (++__CLOVER_80_0.cloverRec.CT[2944]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2944]==0&false)))
		{{
			__CLOVER_80_0.cloverRec.S[13420]++;expand=true;
		}
		}__CLOVER_80_0.cloverRec.S[13421]++;t_type=lexer.lit(ID);
		__CLOVER_80_0.cloverRec.S[13422]++;if((((t_type==null) && (++__CLOVER_80_0.cloverRec.CT[2945]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2945]==0&false)))
		{{
			__CLOVER_80_0.cloverRec.S[13423]++;erreur_parse("Il faut un type");
			__CLOVER_80_0.cloverRec.S[13424]++;erreur=true;
		}
		}else
		{{
			__CLOVER_80_0.cloverRec.S[13425]++;Token virgule;
			__CLOVER_80_0.cloverRec.S[13426]++;Vector param=new Vector();
			__CLOVER_80_0.cloverRec.S[13427]++;boolean fin=false;
			__CLOVER_80_0.cloverRec.S[13428]++;vers=lexer.lit(Fleche);
			__CLOVER_80_0.cloverRec.S[13429]++;if((((vers!=null) && (++__CLOVER_80_0.cloverRec.CT[2946]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2946]==0&false)))
			{{
				__CLOVER_80_0.cloverRec.S[13430]++;type3=parse_type(true);
				__CLOVER_80_0.cloverRec.S[13431]++;param.addElement(type3);
			}
			}__CLOVER_80_0.cloverRec.S[13432]++;type=new TypeSimple(expand,t_type.text,param);
			__CLOVER_80_0.cloverRec.S[13433]++;type.is_from=true;
			__CLOVER_80_0.cloverRec.S[13434]++;type.set_token(t_type,vers);
			__CLOVER_80_0.cloverRec.S[13435]++;ajoute_type(type);
		}
		}assert(((((type!=null)!=erreur)) && (++__CLOVER_80_0.cloverRec.CT[2947]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2947]==0&false));
		__CLOVER_80_0.cloverRec.S[13436]++;if((((erreur||!etatParserOk()||!etatOk()) && (++__CLOVER_80_0.cloverRec.CT[2948]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2948]==0&false)))
		{{
			__CLOVER_80_0.cloverRec.S[13437]++;erreur_parse2("Erreur dans le type");
		}
		}__CLOVER_80_0.cloverRec.S[13438]++;return type;
	}


	Expr parse_expr()
	{__CLOVER_80_0.cloverRec.M[714]++;
		__CLOVER_80_0.cloverRec.S[13439]++;Expr e=parse_expr17();		
		__CLOVER_80_0.cloverRec.S[13440]++;if((((!etatParserOk()||!etatOk()) && (++__CLOVER_80_0.cloverRec.CT[2949]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2949]==0&false)))
		{{
			__CLOVER_80_0.cloverRec.S[13441]++;erreur_parse2("Erreur dans l'expression");
		}
		}__CLOVER_80_0.cloverRec.S[13442]++;return e;
	}

	// les operateurs binaires xor,implies
	Expr parse_expr17()
	{__CLOVER_80_0.cloverRec.M[715]++;
		__CLOVER_80_0.cloverRec.S[13443]++;Token t_exp,t_debut_tab,t_id;
		__CLOVER_80_0.cloverRec.S[13444]++;Expr expr1,expr2,res=null;
		__CLOVER_80_0.cloverRec.S[13445]++;Vector param;
		__CLOVER_80_0.cloverRec.S[13446]++;int tab[]={TK_XOR,TK_IMPLIES},n;
		__CLOVER_80_0.cloverRec.S[13447]++;boolean erreur=false;
		__CLOVER_80_0.cloverRec.S[13448]++;expr1=parse_expr18();
		__CLOVER_80_0.cloverRec.S[13449]++;res=expr1;
		__CLOVER_80_0.cloverRec.S[13450]++;n=lexer.test_prochain3(tab);
		__CLOVER_80_0.cloverRec.S[13451]++;while((((n!=-1&&!erreur) && (++__CLOVER_80_0.cloverRec.CT[2950]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2950]==0&false)))
		{{
			__CLOVER_80_0.cloverRec.S[13452]++;t_exp=lexer.lit2();
			assert((((t_exp!=null)) && (++__CLOVER_80_0.cloverRec.CT[2951]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2951]==0&false));
			__CLOVER_80_0.cloverRec.S[13453]++;expr2=parse_expr18();
			__CLOVER_80_0.cloverRec.S[13454]++;if((((expr2==null) && (++__CLOVER_80_0.cloverRec.CT[2952]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2952]==0&false)))
			{{
				__CLOVER_80_0.cloverRec.S[13455]++;erreur_parse("Il faut une expression");
				__CLOVER_80_0.cloverRec.S[13456]++;erreur=true;
			}
			}else
			{{
				__CLOVER_80_0.cloverRec.S[13457]++;boolean __CLOVER_bool2=false;switch(t_exp.get_type_token())
				{
					case TK_XOR:if (!__CLOVER_bool2) {__CLOVER_80_0.cloverRec.S[13458]++;__CLOVER_bool2=true;}
						__CLOVER_80_0.cloverRec.S[13459]++;n=Expr.Xor;
						__CLOVER_80_0.cloverRec.S[13460]++;break;
					case TK_IMPLIES:if (!__CLOVER_bool2) {__CLOVER_80_0.cloverRec.S[13461]++;__CLOVER_bool2=true;}
						__CLOVER_80_0.cloverRec.S[13462]++;n=Expr.Implies;
						__CLOVER_80_0.cloverRec.S[13463]++;break;
					default:if (!__CLOVER_bool2) {__CLOVER_80_0.cloverRec.S[13464]++;__CLOVER_bool2=true;}
						assert((((false)) && (++__CLOVER_80_0.cloverRec.CT[2953]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2953]==0&false));
				}
				__CLOVER_80_0.cloverRec.S[13465]++;res=new Expr_Binaire(n,res,expr2,t_exp);
				__CLOVER_80_0.cloverRec.S[13466]++;n=lexer.test_prochain3(tab);
			}
		}}
		}__CLOVER_80_0.cloverRec.S[13467]++;if((((erreur||!etatParserOk()||!etatOk()) && (++__CLOVER_80_0.cloverRec.CT[2954]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2954]==0&false)))
		{{
			__CLOVER_80_0.cloverRec.S[13468]++;erreur_parse2("Erreur dans l'expression");
		}
		}__CLOVER_80_0.cloverRec.S[13469]++;return res;
	}

	// les operateurs binaires or, or else
	Expr parse_expr18()
	{__CLOVER_80_0.cloverRec.M[716]++;
		__CLOVER_80_0.cloverRec.S[13470]++;Token t_exp,t_exp2,t_id;
		__CLOVER_80_0.cloverRec.S[13471]++;Expr expr1,expr2,res=null;
		__CLOVER_80_0.cloverRec.S[13472]++;Vector param;
		__CLOVER_80_0.cloverRec.S[13473]++;int n;
		__CLOVER_80_0.cloverRec.S[13474]++;boolean erreur=false;
		__CLOVER_80_0.cloverRec.S[13475]++;expr1=parse_expr19();
		__CLOVER_80_0.cloverRec.S[13476]++;res=expr1;
		__CLOVER_80_0.cloverRec.S[13477]++;t_exp=lexer.lit(TK_OR);
		//System.out.println("AAAA"+t_exp);
		__CLOVER_80_0.cloverRec.S[13478]++;while((((t_exp!=null&&!erreur) && (++__CLOVER_80_0.cloverRec.CT[2955]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2955]==0&false)))
		{{
			//System.out.println("AAAA3");
			__CLOVER_80_0.cloverRec.S[13479]++;t_exp2=lexer.lit(TK_ELSE);
			__CLOVER_80_0.cloverRec.S[13480]++;expr2=parse_expr19();
			//System.out.println("AAAA4");
			assert((((expr2!=null)) && (++__CLOVER_80_0.cloverRec.CT[2956]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2956]==0&false));
			//System.out.println("AAAA5");
			__CLOVER_80_0.cloverRec.S[13481]++;if((((expr2==null) && (++__CLOVER_80_0.cloverRec.CT[2957]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2957]==0&false)))
			{{
				__CLOVER_80_0.cloverRec.S[13482]++;erreur_parse("Il faut une expression");
				__CLOVER_80_0.cloverRec.S[13483]++;erreur=true;
			}
			}else
			{{
				__CLOVER_80_0.cloverRec.S[13484]++;if((((t_exp2!=null) && (++__CLOVER_80_0.cloverRec.CT[2958]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2958]==0&false)))
					{__CLOVER_80_0.cloverRec.S[13485]++;n=Expr.Or_Else;
				}else
					{__CLOVER_80_0.cloverRec.S[13486]++;n=Expr.Or;
				}__CLOVER_80_0.cloverRec.S[13487]++;res=new Expr_Binaire(n,res,expr2,t_exp);
				__CLOVER_80_0.cloverRec.S[13488]++;t_exp=lexer.lit(TK_OR);
			}
		}}	
		}__CLOVER_80_0.cloverRec.S[13489]++;if((((!etatParserOk()||!etatOk()) && (++__CLOVER_80_0.cloverRec.CT[2959]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2959]==0&false)))
		{{
			__CLOVER_80_0.cloverRec.S[13490]++;erreur_parse2("Erreur dans l'expression");
		}
		//System.out.println("AAAA2");
		}__CLOVER_80_0.cloverRec.S[13491]++;return res;
	}

	// les operateurs binaires and, and then
	Expr parse_expr19()
	{__CLOVER_80_0.cloverRec.M[717]++;
		__CLOVER_80_0.cloverRec.S[13492]++;Token t_exp,t_exp2,t_id;
		__CLOVER_80_0.cloverRec.S[13493]++;Expr expr1,expr2,res=null;
		__CLOVER_80_0.cloverRec.S[13494]++;Vector param;
		__CLOVER_80_0.cloverRec.S[13495]++;boolean erreur=false;
		__CLOVER_80_0.cloverRec.S[13496]++;int n;
		__CLOVER_80_0.cloverRec.S[13497]++;expr1=parse_expr20();
		__CLOVER_80_0.cloverRec.S[13498]++;res=expr1;
		__CLOVER_80_0.cloverRec.S[13499]++;t_exp=lexer.lit(TK_AND);
		__CLOVER_80_0.cloverRec.S[13500]++;while((((t_exp!=null&&!erreur) && (++__CLOVER_80_0.cloverRec.CT[2960]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2960]==0&false)))
		{{
			__CLOVER_80_0.cloverRec.S[13501]++;t_exp2=lexer.lit(TK_THEN);
			__CLOVER_80_0.cloverRec.S[13502]++;expr2=parse_expr20();
			__CLOVER_80_0.cloverRec.S[13503]++;if((((expr2==null) && (++__CLOVER_80_0.cloverRec.CT[2961]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2961]==0&false)))
			{{
				__CLOVER_80_0.cloverRec.S[13504]++;erreur_parse("Il faut une expression");
				__CLOVER_80_0.cloverRec.S[13505]++;erreur=true;
			}
			}else
			{{
				__CLOVER_80_0.cloverRec.S[13506]++;if((((t_exp2!=null) && (++__CLOVER_80_0.cloverRec.CT[2962]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2962]==0&false)))
					{__CLOVER_80_0.cloverRec.S[13507]++;n=Expr.And_Then;
				}else
					{__CLOVER_80_0.cloverRec.S[13508]++;n=Expr.And;
				}__CLOVER_80_0.cloverRec.S[13509]++;res=new Expr_Binaire(n,res,expr2,t_exp);
				__CLOVER_80_0.cloverRec.S[13510]++;t_exp=lexer.lit(TK_AND);
			}
		}}	
		}__CLOVER_80_0.cloverRec.S[13511]++;if((((!etatParserOk()||!etatOk()) && (++__CLOVER_80_0.cloverRec.CT[2963]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2963]==0&false)))
		{{
			__CLOVER_80_0.cloverRec.S[13512]++;erreur_parse2("Erreur dans l'expression");
		}
		}__CLOVER_80_0.cloverRec.S[13513]++;return res;
	}

	// les operateurs binaires =,/=,<,<=,>,>=
	Expr parse_expr20()
	{__CLOVER_80_0.cloverRec.M[718]++;
		__CLOVER_80_0.cloverRec.S[13514]++;Token t_exp,t_debut_tab,t_id;
		__CLOVER_80_0.cloverRec.S[13515]++;Expr expr1,expr2,res=null;
		__CLOVER_80_0.cloverRec.S[13516]++;Vector param;
		__CLOVER_80_0.cloverRec.S[13517]++;int tab[]={Egal,Diff,InfS,Inf,SupS,Sup},n;
		__CLOVER_80_0.cloverRec.S[13518]++;boolean erreur=false;
		__CLOVER_80_0.cloverRec.S[13519]++;expr1=parse_expr21();
		__CLOVER_80_0.cloverRec.S[13520]++;res=expr1;
		__CLOVER_80_0.cloverRec.S[13521]++;n=lexer.test_prochain3(tab);
		__CLOVER_80_0.cloverRec.S[13522]++;while((((n!=-1&&!erreur) && (++__CLOVER_80_0.cloverRec.CT[2964]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2964]==0&false)))
		{{
			//System.out.println("OOO");
			__CLOVER_80_0.cloverRec.S[13523]++;t_exp=lexer.lit2();
			assert((((t_exp!=null)) && (++__CLOVER_80_0.cloverRec.CT[2965]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2965]==0&false));
			__CLOVER_80_0.cloverRec.S[13524]++;expr2=parse_expr21();
			__CLOVER_80_0.cloverRec.S[13525]++;if((((expr2==null) && (++__CLOVER_80_0.cloverRec.CT[2966]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2966]==0&false)))
			{{
				__CLOVER_80_0.cloverRec.S[13526]++;erreur_parse("Il faut une expression");
				__CLOVER_80_0.cloverRec.S[13527]++;erreur=true;
			}
			}else
			{{
				__CLOVER_80_0.cloverRec.S[13528]++;boolean __CLOVER_bool3=false;switch(t_exp.get_type_token())
				{
					case Egal:if (!__CLOVER_bool3) {__CLOVER_80_0.cloverRec.S[13529]++;__CLOVER_bool3=true;}
						__CLOVER_80_0.cloverRec.S[13530]++;n=Expr.Egal;
						__CLOVER_80_0.cloverRec.S[13531]++;break;
					case Diff:if (!__CLOVER_bool3) {__CLOVER_80_0.cloverRec.S[13532]++;__CLOVER_bool3=true;}
						__CLOVER_80_0.cloverRec.S[13533]++;n=Expr.Diff;
						__CLOVER_80_0.cloverRec.S[13534]++;break;
					case InfS:if (!__CLOVER_bool3) {__CLOVER_80_0.cloverRec.S[13535]++;__CLOVER_bool3=true;}
						__CLOVER_80_0.cloverRec.S[13536]++;n=Expr.Infs;
						__CLOVER_80_0.cloverRec.S[13537]++;break;
					case Inf:if (!__CLOVER_bool3) {__CLOVER_80_0.cloverRec.S[13538]++;__CLOVER_bool3=true;}
						__CLOVER_80_0.cloverRec.S[13539]++;n=Expr.Inf;
						__CLOVER_80_0.cloverRec.S[13540]++;break;
					case SupS:if (!__CLOVER_bool3) {__CLOVER_80_0.cloverRec.S[13541]++;__CLOVER_bool3=true;}
						__CLOVER_80_0.cloverRec.S[13542]++;n=Expr.Sups;
						__CLOVER_80_0.cloverRec.S[13543]++;break;
					case Sup:if (!__CLOVER_bool3) {__CLOVER_80_0.cloverRec.S[13544]++;__CLOVER_bool3=true;}
						__CLOVER_80_0.cloverRec.S[13545]++;n=Expr.Sup;
						__CLOVER_80_0.cloverRec.S[13546]++;break;
					default:if (!__CLOVER_bool3) {__CLOVER_80_0.cloverRec.S[13547]++;__CLOVER_bool3=true;}
						assert((((false)) && (++__CLOVER_80_0.cloverRec.CT[2967]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2967]==0&false));
				}
				__CLOVER_80_0.cloverRec.S[13548]++;res=new Expr_Binaire(n,res,expr2,t_exp);
				__CLOVER_80_0.cloverRec.S[13549]++;n=lexer.test_prochain3(tab);
			}
		}}	
		}__CLOVER_80_0.cloverRec.S[13550]++;if((((!etatParserOk()||!etatOk()) && (++__CLOVER_80_0.cloverRec.CT[2968]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2968]==0&false)))
		{{
			__CLOVER_80_0.cloverRec.S[13551]++;erreur_parse2("Erreur dans l'expression");
		}
		}__CLOVER_80_0.cloverRec.S[13552]++;return res;
	}

	// les operateurs binaires +,-
	Expr parse_expr21()
	{__CLOVER_80_0.cloverRec.M[719]++;
		__CLOVER_80_0.cloverRec.S[13553]++;Token t_exp,t_debut_tab,t_id;
		__CLOVER_80_0.cloverRec.S[13554]++;Expr expr1,expr2,res=null;
		__CLOVER_80_0.cloverRec.S[13555]++;Vector param;
		__CLOVER_80_0.cloverRec.S[13556]++;int tab[]={Plus,Moins},n;
		__CLOVER_80_0.cloverRec.S[13557]++;boolean erreur=false;
		__CLOVER_80_0.cloverRec.S[13558]++;expr1=parse_expr22();
		__CLOVER_80_0.cloverRec.S[13559]++;res=expr1;
		__CLOVER_80_0.cloverRec.S[13560]++;n=lexer.test_prochain3(tab);
		__CLOVER_80_0.cloverRec.S[13561]++;while((((n!=-1&&!erreur) && (++__CLOVER_80_0.cloverRec.CT[2969]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2969]==0&false)))
		{{
			__CLOVER_80_0.cloverRec.S[13562]++;t_exp=lexer.lit2();
			assert((((t_exp!=null)) && (++__CLOVER_80_0.cloverRec.CT[2970]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2970]==0&false));
			__CLOVER_80_0.cloverRec.S[13563]++;expr2=parse_expr22();
			__CLOVER_80_0.cloverRec.S[13564]++;if((((expr2==null) && (++__CLOVER_80_0.cloverRec.CT[2971]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2971]==0&false)))
			{{
				__CLOVER_80_0.cloverRec.S[13565]++;erreur_parse("Il faut une expression");
				__CLOVER_80_0.cloverRec.S[13566]++;erreur=true;
			}
			}else
			{{
				__CLOVER_80_0.cloverRec.S[13567]++;boolean __CLOVER_bool4=false;switch(t_exp.get_type_token())
				{
					case Plus:if (!__CLOVER_bool4) {__CLOVER_80_0.cloverRec.S[13568]++;__CLOVER_bool4=true;}
						__CLOVER_80_0.cloverRec.S[13569]++;n=Expr.Plus;
						__CLOVER_80_0.cloverRec.S[13570]++;break;
					case Moins:if (!__CLOVER_bool4) {__CLOVER_80_0.cloverRec.S[13571]++;__CLOVER_bool4=true;}
						__CLOVER_80_0.cloverRec.S[13572]++;n=Expr.Moins;
						__CLOVER_80_0.cloverRec.S[13573]++;break;
					default:if (!__CLOVER_bool4) {__CLOVER_80_0.cloverRec.S[13574]++;__CLOVER_bool4=true;}
						assert((((false)) && (++__CLOVER_80_0.cloverRec.CT[2972]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2972]==0&false));
				}
				__CLOVER_80_0.cloverRec.S[13575]++;res=new Expr_Binaire(n,res,expr2,t_exp);
				__CLOVER_80_0.cloverRec.S[13576]++;n=lexer.test_prochain3(tab);
				/*if(n==-1)
				{
					erreur_parse("Test plus");
				}*/
			}
		}}	
		}__CLOVER_80_0.cloverRec.S[13577]++;if((((!etatParserOk()||!etatOk()) && (++__CLOVER_80_0.cloverRec.CT[2973]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2973]==0&false)))
		{{
			__CLOVER_80_0.cloverRec.S[13578]++;erreur_parse2("Erreur dans l'expression");
		}
		}__CLOVER_80_0.cloverRec.S[13579]++;return res;
	}

	// les operateurs binaires *,/,//,\\
	Expr parse_expr22()
	{__CLOVER_80_0.cloverRec.M[720]++;
		__CLOVER_80_0.cloverRec.S[13580]++;Token t_exp,t_debut_tab,t_id;
		__CLOVER_80_0.cloverRec.S[13581]++;Expr expr1,expr2,res=null;
		__CLOVER_80_0.cloverRec.S[13582]++;Vector param;
		__CLOVER_80_0.cloverRec.S[13583]++;int tab[]={Fois,Div,DivEntier,Mod},n;
		__CLOVER_80_0.cloverRec.S[13584]++;boolean erreur=false;
		__CLOVER_80_0.cloverRec.S[13585]++;expr1=parse_expr23();
		__CLOVER_80_0.cloverRec.S[13586]++;res=expr1;
		__CLOVER_80_0.cloverRec.S[13587]++;n=lexer.test_prochain3(tab);
		__CLOVER_80_0.cloverRec.S[13588]++;while((((n!=-1&&!erreur) && (++__CLOVER_80_0.cloverRec.CT[2974]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2974]==0&false)))
		{{
			__CLOVER_80_0.cloverRec.S[13589]++;t_exp=lexer.lit2();
			assert((((t_exp!=null)) && (++__CLOVER_80_0.cloverRec.CT[2975]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2975]==0&false));
			__CLOVER_80_0.cloverRec.S[13590]++;expr2=parse_expr23();
			__CLOVER_80_0.cloverRec.S[13591]++;if((((expr2==null) && (++__CLOVER_80_0.cloverRec.CT[2976]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2976]==0&false)))
			{{
				__CLOVER_80_0.cloverRec.S[13592]++;erreur_parse("Il faut une expression");
				__CLOVER_80_0.cloverRec.S[13593]++;erreur=true;
			}
			}else
			{{
				__CLOVER_80_0.cloverRec.S[13594]++;boolean __CLOVER_bool5=false;switch(t_exp.get_type_token())
				{
					case Fois:if (!__CLOVER_bool5) {__CLOVER_80_0.cloverRec.S[13595]++;__CLOVER_bool5=true;}
						__CLOVER_80_0.cloverRec.S[13596]++;n=Expr.Fois;
						__CLOVER_80_0.cloverRec.S[13597]++;break;
					case Div:if (!__CLOVER_bool5) {__CLOVER_80_0.cloverRec.S[13598]++;__CLOVER_bool5=true;}
						__CLOVER_80_0.cloverRec.S[13599]++;n=Expr.Div;
						__CLOVER_80_0.cloverRec.S[13600]++;break;
					case DivEntier:if (!__CLOVER_bool5) {__CLOVER_80_0.cloverRec.S[13601]++;__CLOVER_bool5=true;}
						__CLOVER_80_0.cloverRec.S[13602]++;n=Expr.Div_entier;
						__CLOVER_80_0.cloverRec.S[13603]++;break;
					case Mod:if (!__CLOVER_bool5) {__CLOVER_80_0.cloverRec.S[13604]++;__CLOVER_bool5=true;}
						__CLOVER_80_0.cloverRec.S[13605]++;n=Expr.Mod;
						__CLOVER_80_0.cloverRec.S[13606]++;break;
					default:if (!__CLOVER_bool5) {__CLOVER_80_0.cloverRec.S[13607]++;__CLOVER_bool5=true;}
						assert((((false)) && (++__CLOVER_80_0.cloverRec.CT[2977]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2977]==0&false));
				}
				__CLOVER_80_0.cloverRec.S[13608]++;res=new Expr_Binaire(n,res,expr2,t_exp);
				__CLOVER_80_0.cloverRec.S[13609]++;n=lexer.test_prochain3(tab);
			}
		}}	
		}__CLOVER_80_0.cloverRec.S[13610]++;if((((!etatParserOk()||!etatOk()) && (++__CLOVER_80_0.cloverRec.CT[2978]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2978]==0&false)))
		{{
			__CLOVER_80_0.cloverRec.S[13611]++;erreur_parse2("Erreur dans l'expression");
		}
		}__CLOVER_80_0.cloverRec.S[13612]++;return res;
	}

	// l'operateur puissance
	Expr parse_expr23()
	{__CLOVER_80_0.cloverRec.M[721]++;
		__CLOVER_80_0.cloverRec.S[13613]++;Token t_exp,t_debut_tab,t_id;
		__CLOVER_80_0.cloverRec.S[13614]++;Expr expr1,expr2,res=null;
		__CLOVER_80_0.cloverRec.S[13615]++;Vector param;
		__CLOVER_80_0.cloverRec.S[13616]++;boolean erreur=false;
		__CLOVER_80_0.cloverRec.S[13617]++;expr1=parse_expr24();
		__CLOVER_80_0.cloverRec.S[13618]++;res=expr1;
		__CLOVER_80_0.cloverRec.S[13619]++;t_exp=lexer.lit(Puiss);
		__CLOVER_80_0.cloverRec.S[13620]++;if((((t_exp!=null&&!erreur) && (++__CLOVER_80_0.cloverRec.CT[2979]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2979]==0&false)))
		{{
			__CLOVER_80_0.cloverRec.S[13621]++;expr2=parse_expr23();
			__CLOVER_80_0.cloverRec.S[13622]++;if((((expr2==null) && (++__CLOVER_80_0.cloverRec.CT[2980]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2980]==0&false)))
			{{
				__CLOVER_80_0.cloverRec.S[13623]++;erreur_parse("Il faut une expression");
				__CLOVER_80_0.cloverRec.S[13624]++;erreur=true;
			}
			}else
			{{
				__CLOVER_80_0.cloverRec.S[13625]++;res=new Expr_Binaire(Expr.Puiss,res,expr2,t_exp);
			}
		}}	
		}__CLOVER_80_0.cloverRec.S[13626]++;if((((!etatParserOk()||!etatOk()) && (++__CLOVER_80_0.cloverRec.CT[2981]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2981]==0&false)))
		{{
			__CLOVER_80_0.cloverRec.S[13627]++;erreur_parse2("Erreur dans l'expression");
		}
		}__CLOVER_80_0.cloverRec.S[13628]++;return res;
	}

	// les operateurs binaires libres
	Expr parse_expr24()
	{__CLOVER_80_0.cloverRec.M[722]++;
		__CLOVER_80_0.cloverRec.S[13629]++;Token t_exp,t_debut_tab,t_id;
		__CLOVER_80_0.cloverRec.S[13630]++;Expr expr1,expr2,res=null;
		__CLOVER_80_0.cloverRec.S[13631]++;Vector param;
		__CLOVER_80_0.cloverRec.S[13632]++;boolean erreur=false;
		__CLOVER_80_0.cloverRec.S[13633]++;expr1=parse_expr24_2();
		__CLOVER_80_0.cloverRec.S[13634]++;res=expr1;
		__CLOVER_80_0.cloverRec.S[13635]++;t_exp=lexer.lit(FreeOp);
		__CLOVER_80_0.cloverRec.S[13636]++;while((((t_exp!=null&&!erreur) && (++__CLOVER_80_0.cloverRec.CT[2982]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2982]==0&false)))
		{{
			__CLOVER_80_0.cloverRec.S[13637]++;expr2=parse_expr24_2();
			__CLOVER_80_0.cloverRec.S[13638]++;if((((expr2==null) && (++__CLOVER_80_0.cloverRec.CT[2983]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2983]==0&false)))
			{{
				__CLOVER_80_0.cloverRec.S[13639]++;erreur_parse("Il faut une expression");
				__CLOVER_80_0.cloverRec.S[13640]++;erreur=true;
			}
			}else
			{{
				__CLOVER_80_0.cloverRec.S[13641]++;res=new Expr_Binaire(t_exp.text,res,expr2,t_exp);
				__CLOVER_80_0.cloverRec.S[13642]++;t_exp=lexer.lit(FreeOp);
			}
		}}	
		}__CLOVER_80_0.cloverRec.S[13643]++;if((((!etatParserOk()||!etatOk()) && (++__CLOVER_80_0.cloverRec.CT[2984]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2984]==0&false)))
		{{
			__CLOVER_80_0.cloverRec.S[13644]++;erreur_parse2("Erreur dans l'expression");
		}
		}__CLOVER_80_0.cloverRec.S[13645]++;return res;
	}

	// les operateurs unaires libres
	Expr parse_expr24_2()
	{__CLOVER_80_0.cloverRec.M[723]++;
		__CLOVER_80_0.cloverRec.S[13646]++;Token t_exp,t_op,t_id;
		__CLOVER_80_0.cloverRec.S[13647]++;Expr expr1,expr2,res=null;
		__CLOVER_80_0.cloverRec.S[13648]++;Vector liste_op;
		__CLOVER_80_0.cloverRec.S[13649]++;boolean erreur=false;
		__CLOVER_80_0.cloverRec.S[13650]++;int n,i;
		__CLOVER_80_0.cloverRec.S[13651]++;liste_op=new Vector();
		__CLOVER_80_0.cloverRec.S[13652]++;t_op=lexer.lit(FreeOp);
		__CLOVER_80_0.cloverRec.S[13653]++;while((((t_op!=null) && (++__CLOVER_80_0.cloverRec.CT[2985]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2985]==0&false)))
		{{
			__CLOVER_80_0.cloverRec.S[13654]++;liste_op.addElement(t_op);
			__CLOVER_80_0.cloverRec.S[13655]++;t_op=lexer.lit(FreeOp);
		}
		}__CLOVER_80_0.cloverRec.S[13656]++;expr1=parse_expr25();
		__CLOVER_80_0.cloverRec.S[13657]++;if((((expr1!=null) && (++__CLOVER_80_0.cloverRec.CT[2986]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2986]==0&false)))
		{{
			__CLOVER_80_0.cloverRec.S[13658]++;for(i=liste_op.size()-1;(((i>=0) && (++__CLOVER_80_0.cloverRec.CT[2987]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2987]==0&false));i--)
			{{
				__CLOVER_80_0.cloverRec.S[13659]++;t_op=(Token)liste_op.elementAt(i);
				__CLOVER_80_0.cloverRec.S[13660]++;expr1=new Expr_Unaire(t_op.text,expr1,t_op);
			}
			}__CLOVER_80_0.cloverRec.S[13661]++;res=expr1;
		}
		}else
		{{
			__CLOVER_80_0.cloverRec.S[13662]++;if((((liste_op.size()>0) && (++__CLOVER_80_0.cloverRec.CT[2988]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2988]==0&false)))
			{{
				__CLOVER_80_0.cloverRec.S[13663]++;erreur_parse("Il faut une expression");
				__CLOVER_80_0.cloverRec.S[13664]++;erreur=true;
			}
		}}	
		}__CLOVER_80_0.cloverRec.S[13665]++;if((((!etatParserOk()||!etatOk()) && (++__CLOVER_80_0.cloverRec.CT[2989]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2989]==0&false)))
		{{
			__CLOVER_80_0.cloverRec.S[13666]++;erreur_parse2("Erreur dans l'expression");
		}
		}__CLOVER_80_0.cloverRec.S[13667]++;return res;
	}

	// les operateurs unaires old,not,+,-,$
	Expr parse_expr25()
	{__CLOVER_80_0.cloverRec.M[724]++;
		__CLOVER_80_0.cloverRec.S[13668]++;Token t_exp,t_op,t_id;
		__CLOVER_80_0.cloverRec.S[13669]++;Expr expr1,expr2,res=null;
		__CLOVER_80_0.cloverRec.S[13670]++;Vector liste_op;
		__CLOVER_80_0.cloverRec.S[13671]++;boolean erreur=false;
		__CLOVER_80_0.cloverRec.S[13672]++;int tab[]={TK_OLD,TK_NOT,Plus,Moins,Dollard},n,i;
		__CLOVER_80_0.cloverRec.S[13673]++;liste_op=new Vector();
		__CLOVER_80_0.cloverRec.S[13674]++;n=lexer.test_prochain3(tab);
		__CLOVER_80_0.cloverRec.S[13675]++;while((((n!=-1&&!erreur) && (++__CLOVER_80_0.cloverRec.CT[2990]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2990]==0&false)))
		{{
			__CLOVER_80_0.cloverRec.S[13676]++;t_op=lexer.lit2();
			__CLOVER_80_0.cloverRec.S[13677]++;liste_op.addElement(t_op);
			__CLOVER_80_0.cloverRec.S[13678]++;n=lexer.test_prochain3(tab);
		}
		}__CLOVER_80_0.cloverRec.S[13679]++;expr1=parse_expr26();
		__CLOVER_80_0.cloverRec.S[13680]++;if((((expr1!=null&&!erreur) && (++__CLOVER_80_0.cloverRec.CT[2991]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2991]==0&false)))
		{{
			__CLOVER_80_0.cloverRec.S[13681]++;for(i=liste_op.size()-1;(((i>=0) && (++__CLOVER_80_0.cloverRec.CT[2992]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2992]==0&false));i--)
			{{
				__CLOVER_80_0.cloverRec.S[13682]++;t_op=(Token)liste_op.elementAt(i);
				__CLOVER_80_0.cloverRec.S[13683]++;boolean __CLOVER_bool6=false;switch(t_op.get_type_token())
				{
					case TK_OLD:if (!__CLOVER_bool6) {__CLOVER_80_0.cloverRec.S[13684]++;__CLOVER_bool6=true;}
						__CLOVER_80_0.cloverRec.S[13685]++;n=Expr.Old;__CLOVER_80_0.cloverRec.S[13686]++;break;
					case TK_NOT:if (!__CLOVER_bool6) {__CLOVER_80_0.cloverRec.S[13687]++;__CLOVER_bool6=true;}
						__CLOVER_80_0.cloverRec.S[13688]++;n=Expr.Not;__CLOVER_80_0.cloverRec.S[13689]++;break;
					case Plus:if (!__CLOVER_bool6) {__CLOVER_80_0.cloverRec.S[13690]++;__CLOVER_bool6=true;}
						__CLOVER_80_0.cloverRec.S[13691]++;n=Expr.PlusU;__CLOVER_80_0.cloverRec.S[13692]++;break;
					case Moins:if (!__CLOVER_bool6) {__CLOVER_80_0.cloverRec.S[13693]++;__CLOVER_bool6=true;}
						__CLOVER_80_0.cloverRec.S[13694]++;n=Expr.MoinsU;__CLOVER_80_0.cloverRec.S[13695]++;break;
					case Dollard:if (!__CLOVER_bool6) {__CLOVER_80_0.cloverRec.S[13696]++;__CLOVER_bool6=true;}
						__CLOVER_80_0.cloverRec.S[13697]++;n=Expr.Dollard;
						__CLOVER_80_0.cloverRec.S[13698]++;ajoute_type(new TypeSimple(false,"POINTER",new Vector()));
						__CLOVER_80_0.cloverRec.S[13699]++;break;
					default:if (!__CLOVER_bool6) {__CLOVER_80_0.cloverRec.S[13700]++;__CLOVER_bool6=true;}
						assert((((false)) && (++__CLOVER_80_0.cloverRec.CT[2993]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2993]==0&false));
				}
				__CLOVER_80_0.cloverRec.S[13701]++;expr1=new Expr_Unaire(n,expr1,t_op);
			}
			}__CLOVER_80_0.cloverRec.S[13702]++;res=expr1;
		}
		}else
		{{
			__CLOVER_80_0.cloverRec.S[13703]++;if((((liste_op.size()>0) && (++__CLOVER_80_0.cloverRec.CT[2994]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2994]==0&false)))
			{{
				__CLOVER_80_0.cloverRec.S[13704]++;erreur_parse("Il faut une expression");
				__CLOVER_80_0.cloverRec.S[13705]++;erreur=true;
			}
		}}	
		}__CLOVER_80_0.cloverRec.S[13706]++;if((((!etatParserOk()||!etatOk()) && (++__CLOVER_80_0.cloverRec.CT[2995]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2995]==0&false)))
		{{
			__CLOVER_80_0.cloverRec.S[13707]++;erreur_parse2("Erreur dans l'expression");
		}
		}__CLOVER_80_0.cloverRec.S[13708]++;return res;
	}

	// le .
	Expr parse_expr26()
	{__CLOVER_80_0.cloverRec.M[725]++;
		__CLOVER_80_0.cloverRec.S[13709]++;Token t_exp,t_debut_tab,t_id;
		__CLOVER_80_0.cloverRec.S[13710]++;Expr expr1,expr2,res=null;
		__CLOVER_80_0.cloverRec.S[13711]++;Vector param;
		__CLOVER_80_0.cloverRec.S[13712]++;boolean erreur=false;
		__CLOVER_80_0.cloverRec.S[13713]++;expr1=parse_expr27();
		__CLOVER_80_0.cloverRec.S[13714]++;res=expr1;
		__CLOVER_80_0.cloverRec.S[13715]++;if((((res!=null) && (++__CLOVER_80_0.cloverRec.CT[2996]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2996]==0&false)))
		{{
			__CLOVER_80_0.cloverRec.S[13716]++;t_exp=lexer.lit(Point);
			__CLOVER_80_0.cloverRec.S[13717]++;while((((t_exp!=null&&!erreur) && (++__CLOVER_80_0.cloverRec.CT[2997]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2997]==0&false)))
			{{
				__CLOVER_80_0.cloverRec.S[13718]++;expr2=parse_expr27();
				__CLOVER_80_0.cloverRec.S[13719]++;if((((expr2==null) && (++__CLOVER_80_0.cloverRec.CT[2998]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2998]==0&false)))
				{{
					__CLOVER_80_0.cloverRec.S[13720]++;erreur_parse("Il faut une expression");
					__CLOVER_80_0.cloverRec.S[13721]++;erreur=true;
				}
				}else
				{{
					__CLOVER_80_0.cloverRec.S[13722]++;res=new Expr_Binaire(Expr.Point,res,expr2,t_exp);
					__CLOVER_80_0.cloverRec.S[13723]++;t_exp=lexer.lit(Point);
				}
			}}
		}}	
		}__CLOVER_80_0.cloverRec.S[13724]++;if((((!etatParserOk()||!etatOk()) && (++__CLOVER_80_0.cloverRec.CT[2999]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[2999]==0&false)))
		{{
			__CLOVER_80_0.cloverRec.S[13725]++;erreur_parse2("Erreur dans l'expression");
		}
		}__CLOVER_80_0.cloverRec.S[13726]++;return res;
	}

	// les feuilles de l'expression (entier,chaine,variable,tableau,...)
	Expr parse_expr27()
	{__CLOVER_80_0.cloverRec.M[726]++;
		__CLOVER_80_0.cloverRec.S[13727]++;Token t_exp,t_debut_tab,t_id;
		__CLOVER_80_0.cloverRec.S[13728]++;Expr expr1,expr2,res=null;
		__CLOVER_80_0.cloverRec.S[13729]++;Vector param;
		__CLOVER_80_0.cloverRec.S[13730]++;boolean erreur=false;
		__CLOVER_80_0.cloverRec.S[13731]++;int tab[][]={{ID,DoublePoint},{ID,Affect},{ID,TentativeAffect}};
		__CLOVER_80_0.cloverRec.S[13732]++;if((((lexer.test_prochain4(tab)!=-1) && (++__CLOVER_80_0.cloverRec.CT[3000]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[3000]==0&false)))
		{{
			__CLOVER_80_0.cloverRec.S[13733]++;int tab2[]={ID};
			assert((((lexer.test_prochain(tab2))) && (++__CLOVER_80_0.cloverRec.CT[3001]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[3001]==0&false));
		}
		}else
		{{
			__CLOVER_80_0.cloverRec.S[13734]++;t_exp=lexer.lit2();
			__CLOVER_80_0.cloverRec.S[13735]++;if((((t_exp==null) && (++__CLOVER_80_0.cloverRec.CT[3002]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[3002]==0&false)))
			{{
				
			}
			}else
			{{
				__CLOVER_80_0.cloverRec.S[13736]++;boolean __CLOVER_bool7=false;switch(t_exp.get_type_token())
				{
					case ID:if (!__CLOVER_bool7) {__CLOVER_80_0.cloverRec.S[13737]++;__CLOVER_bool7=true;}
						//assert(false);
						__CLOVER_80_0.cloverRec.S[13738]++;t_id=t_exp;
						__CLOVER_80_0.cloverRec.S[13739]++;param=parse_param();
						__CLOVER_80_0.cloverRec.S[13740]++;if((((param==null||param.size()==0) && (++__CLOVER_80_0.cloverRec.CT[3003]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[3003]==0&false)))
							{__CLOVER_80_0.cloverRec.S[13741]++;res=new Expr_Var(t_id.text,t_id);
						}else
							{__CLOVER_80_0.cloverRec.S[13742]++;res=new Expr_Appel(t_id.text,param,t_id);
						}__CLOVER_80_0.cloverRec.S[13743]++;break;
					case INT:if (!__CLOVER_bool7) {__CLOVER_80_0.cloverRec.S[13744]++;__CLOVER_bool7=true;}
						__CLOVER_80_0.cloverRec.S[13745]++;res=new Expr_Entier(t_exp.text,t_exp);
						__CLOVER_80_0.cloverRec.S[13746]++;break;
					case REAL:if (!__CLOVER_bool7) {__CLOVER_80_0.cloverRec.S[13747]++;__CLOVER_bool7=true;}
						__CLOVER_80_0.cloverRec.S[13748]++;res=new Expr_Reel(t_exp.text,t_exp);
						__CLOVER_80_0.cloverRec.S[13749]++;break;
					case STRING:if (!__CLOVER_bool7) {__CLOVER_80_0.cloverRec.S[13750]++;__CLOVER_bool7=true;}
						__CLOVER_80_0.cloverRec.S[13751]++;lexer.undo();
						__CLOVER_80_0.cloverRec.S[13752]++;Chaine chaine=parse_chaine();
						//erreur_parse("chaine");
						assert((((chaine!=null)) && (++__CLOVER_80_0.cloverRec.CT[3004]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[3004]==0&false));
						__CLOVER_80_0.cloverRec.S[13753]++;res=new Expr_Chaine(chaine);
						__CLOVER_80_0.cloverRec.S[13754]++;break;
					case CHAR:if (!__CLOVER_bool7) {__CLOVER_80_0.cloverRec.S[13755]++;__CLOVER_bool7=true;}
						__CLOVER_80_0.cloverRec.S[13756]++;res=new Expr_Car(t_exp.text,t_exp);
						__CLOVER_80_0.cloverRec.S[13757]++;break;
					case TK_TRUE:if (!__CLOVER_bool7) {__CLOVER_80_0.cloverRec.S[13758]++;__CLOVER_bool7=true;}
						__CLOVER_80_0.cloverRec.S[13759]++;res=new Expr_Vrai(t_exp);
						__CLOVER_80_0.cloverRec.S[13760]++;break;
					case TK_FALSE:if (!__CLOVER_bool7) {__CLOVER_80_0.cloverRec.S[13761]++;__CLOVER_bool7=true;}
						__CLOVER_80_0.cloverRec.S[13762]++;res=new Expr_Faux(t_exp);
						__CLOVER_80_0.cloverRec.S[13763]++;break;
					case ParentO:if (!__CLOVER_bool7) {__CLOVER_80_0.cloverRec.S[13764]++;__CLOVER_bool7=true;}
						__CLOVER_80_0.cloverRec.S[13765]++;expr1=parse_expr();
						__CLOVER_80_0.cloverRec.S[13766]++;if((((expr1==null) && (++__CLOVER_80_0.cloverRec.CT[3005]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[3005]==0&false)))
						{{
							__CLOVER_80_0.cloverRec.S[13767]++;erreur_parse("Il faut une expression");
							__CLOVER_80_0.cloverRec.S[13768]++;erreur=true;
						}
						}else
						{{
							__CLOVER_80_0.cloverRec.S[13769]++;t_exp=lexer.lit(ParentF);
							__CLOVER_80_0.cloverRec.S[13770]++;if((((t_exp==null) && (++__CLOVER_80_0.cloverRec.CT[3006]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[3006]==0&false)))
							{{
								__CLOVER_80_0.cloverRec.S[13771]++;erreur_parse("Il faut )");
								__CLOVER_80_0.cloverRec.S[13772]++;erreur=true;
							}
							}__CLOVER_80_0.cloverRec.S[13773]++;res=expr1;
						}
						}__CLOVER_80_0.cloverRec.S[13774]++;break;
					case ArrayO:if (!__CLOVER_bool7) {__CLOVER_80_0.cloverRec.S[13775]++;__CLOVER_bool7=true;}
						__CLOVER_80_0.cloverRec.S[13776]++;param=new Vector();
						__CLOVER_80_0.cloverRec.S[13777]++;t_debut_tab=t_exp;
						__CLOVER_80_0.cloverRec.S[13778]++;expr1=parse_expr();
						__CLOVER_80_0.cloverRec.S[13779]++;while((((expr1!=null&&!erreur) && (++__CLOVER_80_0.cloverRec.CT[3007]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[3007]==0&false)))
						{{
							__CLOVER_80_0.cloverRec.S[13780]++;param.addElement(expr1);
							__CLOVER_80_0.cloverRec.S[13781]++;t_exp=lexer.lit(Virgule);
							__CLOVER_80_0.cloverRec.S[13782]++;if((((t_exp==null) && (++__CLOVER_80_0.cloverRec.CT[3008]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[3008]==0&false)))
							{{
								__CLOVER_80_0.cloverRec.S[13783]++;expr1=null;
							}
							}else
							{{
								__CLOVER_80_0.cloverRec.S[13784]++;expr1=parse_expr();
							}
						}}
						}__CLOVER_80_0.cloverRec.S[13785]++;t_exp=lexer.lit(ArrayF);
						__CLOVER_80_0.cloverRec.S[13786]++;if((((t_exp==null) && (++__CLOVER_80_0.cloverRec.CT[3009]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[3009]==0&false)))
						{{
							__CLOVER_80_0.cloverRec.S[13787]++;erreur_parse("Il faut >>");
							__CLOVER_80_0.cloverRec.S[13788]++;erreur=true;
						}
						}__CLOVER_80_0.cloverRec.S[13789]++;res=new Expr_Tableau(param,t_debut_tab);
						__CLOVER_80_0.cloverRec.S[13790]++;break;
					default:if (!__CLOVER_bool7) {__CLOVER_80_0.cloverRec.S[13791]++;__CLOVER_bool7=true;}
						//assert(false):"text="+t_exp.text+"("+t_exp.get_type_token()+")";
						__CLOVER_80_0.cloverRec.S[13792]++;lexer.undo();
				}
			}
		}}	
		}__CLOVER_80_0.cloverRec.S[13793]++;if((((!etatParserOk()||!etatOk()) && (++__CLOVER_80_0.cloverRec.CT[3010]!=0|true)) || (++__CLOVER_80_0.cloverRec.CF[3010]==0&false)))
		{{
			__CLOVER_80_0.cloverRec.S[13794]++;erreur_parse2("Erreur dans l'expression");
		}
		}__CLOVER_80_0.cloverRec.S[13795]++;return res;
	}


}
