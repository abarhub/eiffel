/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ *//*
 * Created on 5 juin 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package tinyeiffel.intermediaire;

import java.util.*;

/**
 * @author barret
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class CIVerification {static class __CLOVER_231_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}

	/**
	 * 
	 */
	public CIVerification(CIProgramme p) {__CLOVER_231_0.cloverRec.M[1344]++;
		assert((((p!=null)) && (++__CLOVER_231_0.cloverRec.CT[5469]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5469]==0&false));
		__CLOVER_231_0.cloverRec.S[19230]++;programme=p;
		__CLOVER_231_0.cloverRec.S[19231]++;erreur=false;
		__CLOVER_231_0.cloverRec.S[19232]++;msg_erreur=new Vector();
	}

	public boolean verification()
	{__CLOVER_231_0.cloverRec.M[1345]++;
		__CLOVER_231_0.cloverRec.S[19233]++;boolean res=true;
		__CLOVER_231_0.cloverRec.S[19234]++;int i;
		__CLOVER_231_0.cloverRec.S[19235]++;if((((programme.liste_classe!=null&&
				programme.liste_classe.length>0) && (++__CLOVER_231_0.cloverRec.CT[5470]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5470]==0&false)))
		{{
			__CLOVER_231_0.cloverRec.S[19236]++;for(i=0;(((i<programme.liste_classe.length) && (++__CLOVER_231_0.cloverRec.CT[5471]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5471]==0&false));i++)
			{{
				__CLOVER_231_0.cloverRec.S[19237]++;if((((!verif_classe(programme,i)) && (++__CLOVER_231_0.cloverRec.CT[5472]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5472]==0&false)))
				{{// probleme avec la classe no i
					__CLOVER_231_0.cloverRec.S[19238]++;res=false;
					__CLOVER_231_0.cloverRec.S[19239]++;break;
				}
				
			}}
		}}
		}assert((((res!=erreur)) && (++__CLOVER_231_0.cloverRec.CT[5473]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5473]==0&false));
		__CLOVER_231_0.cloverRec.S[19240]++;return res;
	}
	
	protected boolean verif_classe(CIProgramme programme,int no_classe)
	{__CLOVER_231_0.cloverRec.M[1346]++;
		assert((((programme!=null)) && (++__CLOVER_231_0.cloverRec.CT[5474]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5474]==0&false));
		__CLOVER_231_0.cloverRec.S[19241]++;boolean res=true;
		__CLOVER_231_0.cloverRec.S[19242]++;int i;
		__CLOVER_231_0.cloverRec.S[19243]++;String s,s2;
		__CLOVER_231_0.cloverRec.S[19244]++;Vector liste_attr;
		__CLOVER_231_0.cloverRec.S[19245]++;CIEnvironnement env=null;
		__CLOVER_231_0.cloverRec.S[19246]++;CIClasse cl;
		__CLOVER_231_0.cloverRec.S[19247]++;cl=programme.liste_classe[no_classe];
		assert((((cl!=null)) && (++__CLOVER_231_0.cloverRec.CT[5475]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5475]==0&false));
		__CLOVER_231_0.cloverRec.S[19248]++;if((((cl.nom==null) && (++__CLOVER_231_0.cloverRec.CT[5476]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5476]==0&false)))
		{{// pas de nom de classe
			__CLOVER_231_0.cloverRec.S[19249]++;res=false;
			__CLOVER_231_0.cloverRec.S[19250]++;ajoute_erreur(env,"la classe no "+no_classe+" n'a pas de nom");
		}
		}else
		{{
			__CLOVER_231_0.cloverRec.S[19251]++;s=cl.nom.nom;
			__CLOVER_231_0.cloverRec.S[19252]++;env=new CIEnvironnement(cl,programme);
			__CLOVER_231_0.cloverRec.S[19253]++;for(i=0;(((i<no_classe) && (++__CLOVER_231_0.cloverRec.CT[5477]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5477]==0&false));i++)
			{{
				__CLOVER_231_0.cloverRec.S[19254]++;if((((s.equalsIgnoreCase(programme.liste_classe[i].nom.nom)) && (++__CLOVER_231_0.cloverRec.CT[5478]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5478]==0&false)))
				{{// une classe avec le meme nom existe deja
					__CLOVER_231_0.cloverRec.S[19255]++;ajoute_erreur(env,"Les classes no "+no_classe+" et "+i+
							" ont le meme nom");
					__CLOVER_231_0.cloverRec.S[19256]++;return false;
				}
			}}
			}__CLOVER_231_0.cloverRec.S[19257]++;if((((cl.liste_attribut!=null&&cl.liste_attribut.length>0) && (++__CLOVER_231_0.cloverRec.CT[5479]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5479]==0&false)))
			{{
				__CLOVER_231_0.cloverRec.S[19258]++;liste_attr=new Vector();
				__CLOVER_231_0.cloverRec.S[19259]++;for(i=0;(((i<cl.liste_attribut.length) && (++__CLOVER_231_0.cloverRec.CT[5480]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5480]==0&false));i++)
				{{
					__CLOVER_231_0.cloverRec.S[19260]++;env.entre_attribut(cl.liste_attribut[i].nom);
					__CLOVER_231_0.cloverRec.S[19261]++;s2=cl.liste_attribut[i].nom.toString();
					__CLOVER_231_0.cloverRec.S[19262]++;if((((liste_attr.contains(s2)) && (++__CLOVER_231_0.cloverRec.CT[5481]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5481]==0&false)))
					{{// l'attribut est en double
						__CLOVER_231_0.cloverRec.S[19263]++;ajoute_erreur(env,"L'attribut "+s2+" est pr\u00e9sent plusieurs fois"+
							" dans la classe "+s);
						__CLOVER_231_0.cloverRec.S[19264]++;return false;
					}
					}else 
					{{
						__CLOVER_231_0.cloverRec.S[19265]++;liste_attr.add(s2);
					}
					}__CLOVER_231_0.cloverRec.S[19266]++;if((((!verif_attribut(cl.liste_attribut[i],env)) && (++__CLOVER_231_0.cloverRec.CT[5482]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5482]==0&false)))
					{{
						__CLOVER_231_0.cloverRec.S[19267]++;return false;
					}
					}__CLOVER_231_0.cloverRec.S[19268]++;env.sort_attribut();
				}
			}}
		}}
		}__CLOVER_231_0.cloverRec.S[19269]++;return res;
	}
	
	protected boolean verif_attribut(CIAttribut attr,CIEnvironnement env)
	{__CLOVER_231_0.cloverRec.M[1347]++;
		assert((((attr!=null)) && (++__CLOVER_231_0.cloverRec.CT[5483]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5483]==0&false));
		assert((((env!=null)) && (++__CLOVER_231_0.cloverRec.CT[5484]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5484]==0&false));
		__CLOVER_231_0.cloverRec.S[19270]++;if((((attr.est_static()) && (++__CLOVER_231_0.cloverRec.CT[5485]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5485]==0&false)))
		{{
			__CLOVER_231_0.cloverRec.S[19271]++;if((((attr.est_routine()) && (++__CLOVER_231_0.cloverRec.CT[5486]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5486]==0&false)))
			{{
				__CLOVER_231_0.cloverRec.S[19272]++;ajoute_erreur(env,"L'attribut static "+attr.nom+
						" ne peut pas \u00eatre une routine");
				__CLOVER_231_0.cloverRec.S[19273]++;return false;
			}
			}__CLOVER_231_0.cloverRec.S[19274]++;if((((attr.attribut_ascendant!=null) && (++__CLOVER_231_0.cloverRec.CT[5487]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5487]==0&false)))
			{{
				__CLOVER_231_0.cloverRec.S[19275]++;ajoute_erreur(env,"L'attribut static "+attr.nom+
					" ne peut pas \u00eatre une redefinition");
				__CLOVER_231_0.cloverRec.S[19276]++;return false;
			}
			}__CLOVER_231_0.cloverRec.S[19277]++;if((((attr.attribut_descendant!=null) && (++__CLOVER_231_0.cloverRec.CT[5488]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5488]==0&false)))
			{{
				__CLOVER_231_0.cloverRec.S[19278]++;ajoute_erreur(env,"L'attribut static "+attr.nom+
					" ne peut pas \u00eatre redefinie");
				__CLOVER_231_0.cloverRec.S[19279]++;return false;
			}
		}}
		}__CLOVER_231_0.cloverRec.S[19280]++;if((((attr.est_routine()) && (++__CLOVER_231_0.cloverRec.CT[5489]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5489]==0&false)))
		{{
			__CLOVER_231_0.cloverRec.S[19281]++;CIRoutine r;
			__CLOVER_231_0.cloverRec.S[19282]++;int i;
			__CLOVER_231_0.cloverRec.S[19283]++;CIDeclare_Var d;
			__CLOVER_231_0.cloverRec.S[19284]++;r=attr.routine;
			__CLOVER_231_0.cloverRec.S[19285]++;if((((r.parametre!=null&&r.parametre.size()>0) && (++__CLOVER_231_0.cloverRec.CT[5490]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5490]==0&false)))
			{{
				__CLOVER_231_0.cloverRec.S[19286]++;for(i=0;(((i<r.parametre.size()) && (++__CLOVER_231_0.cloverRec.CT[5491]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5491]==0&false));i++)
				{{
					__CLOVER_231_0.cloverRec.S[19287]++;d=r.parametre.elt(i);
					__CLOVER_231_0.cloverRec.S[19288]++;if((((!type_existe(d.type)) && (++__CLOVER_231_0.cloverRec.CT[5492]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5492]==0&false)))
					{{
						__CLOVER_231_0.cloverRec.S[19289]++;ajoute_erreur(env,"Le type "+d.type+" n'existe pas");
						__CLOVER_231_0.cloverRec.S[19290]++;return false;
					}
					}__CLOVER_231_0.cloverRec.S[19291]++;env.ajoute_var_local(d);
				}
			}}
			}__CLOVER_231_0.cloverRec.S[19292]++;if((((r.local!=null&&r.local.size()>0) && (++__CLOVER_231_0.cloverRec.CT[5493]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5493]==0&false)))
			{{
				__CLOVER_231_0.cloverRec.S[19293]++;for(i=0;(((i<r.local.size()) && (++__CLOVER_231_0.cloverRec.CT[5494]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5494]==0&false));i++)
				{{
					__CLOVER_231_0.cloverRec.S[19294]++;d=r.local.elt(i);
					__CLOVER_231_0.cloverRec.S[19295]++;if((((!type_existe(d.type)) && (++__CLOVER_231_0.cloverRec.CT[5495]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5495]==0&false)))
					{{
						__CLOVER_231_0.cloverRec.S[19296]++;ajoute_erreur(env,"Le type "+d.type+" n'existe pas");
						__CLOVER_231_0.cloverRec.S[19297]++;return false;
					}
					}__CLOVER_231_0.cloverRec.S[19298]++;env.ajoute_var_local(d);
				}
			}}
			}__CLOVER_231_0.cloverRec.S[19299]++;if((((r.retour!=null) && (++__CLOVER_231_0.cloverRec.CT[5496]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5496]==0&false)))
			{{
				__CLOVER_231_0.cloverRec.S[19300]++;if((((!type_existe(r.retour.type)) && (++__CLOVER_231_0.cloverRec.CT[5497]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5497]==0&false)))
				{{
					__CLOVER_231_0.cloverRec.S[19301]++;ajoute_erreur(env,"Le type "+r.retour.type+" n'existe pas");
					__CLOVER_231_0.cloverRec.S[19302]++;return false;
				}
				//d=new CIDeclare_Var("$Result",r.retour.type,null);
				}__CLOVER_231_0.cloverRec.S[19303]++;env.ajoute_var_local(r.retour);
			}
			}__CLOVER_231_0.cloverRec.S[19304]++;if((((r.liste_instruction!=null) && (++__CLOVER_231_0.cloverRec.CT[5498]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5498]==0&false)))
			{{
				__CLOVER_231_0.cloverRec.S[19305]++;if((((!verif_instr(r.liste_instruction,env)) && (++__CLOVER_231_0.cloverRec.CT[5499]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5499]==0&false)))
				{{
					__CLOVER_231_0.cloverRec.S[19306]++;return false;
				}
			}}
		}}
		}__CLOVER_231_0.cloverRec.S[19307]++;return true;
	}
	
	/**
	 * @param liste_instruction
	 * @param env
	 * @return
	 */
	private boolean verif_instr(CIListe_Instr liste_instruction, CIEnvironnement env) 
	{__CLOVER_231_0.cloverRec.M[1348]++;// TODO: a faire
		assert((((liste_instruction!=null)) && (++__CLOVER_231_0.cloverRec.CT[5500]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5500]==0&false));
		assert((((env!=null)) && (++__CLOVER_231_0.cloverRec.CT[5501]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5501]==0&false));
		__CLOVER_231_0.cloverRec.S[19308]++;int i;
		__CLOVER_231_0.cloverRec.S[19309]++;CIInstruction ins;
		__CLOVER_231_0.cloverRec.S[19310]++;Vector liste_label,liste_goto;
		__CLOVER_231_0.cloverRec.S[19311]++;String s;
		__CLOVER_231_0.cloverRec.S[19312]++;liste_label=new Vector();
		__CLOVER_231_0.cloverRec.S[19313]++;liste_goto=new Vector();
		__CLOVER_231_0.cloverRec.S[19314]++;for(i=0;(((i<liste_instruction.size()) && (++__CLOVER_231_0.cloverRec.CT[5502]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5502]==0&false));i++)
		{{
			__CLOVER_231_0.cloverRec.S[19315]++;ins=liste_instruction.elt(i);
			__CLOVER_231_0.cloverRec.S[19316]++;env.entre_instr();
			__CLOVER_231_0.cloverRec.S[19317]++;if((((ins instanceof CIInstruction_Label) && (++__CLOVER_231_0.cloverRec.CT[5503]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5503]==0&false)))
			{{
				__CLOVER_231_0.cloverRec.S[19318]++;CIInstruction_Label ins2=(CIInstruction_Label)ins;
				__CLOVER_231_0.cloverRec.S[19319]++;s=ins2.nom;
				__CLOVER_231_0.cloverRec.S[19320]++;if((((liste_label.contains(s)) && (++__CLOVER_231_0.cloverRec.CT[5504]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5504]==0&false)))
				{{
					__CLOVER_231_0.cloverRec.S[19321]++;ajoute_erreur(env,"Le label "+s+" est declar\u00e9 2 fois");
					__CLOVER_231_0.cloverRec.S[19322]++;return false;
				}
				}else
				{{
					__CLOVER_231_0.cloverRec.S[19323]++;liste_label.add(s);
				}
			}}
			}else {__CLOVER_231_0.cloverRec.S[19324]++;if((((ins instanceof CIInstruction_Return) && (++__CLOVER_231_0.cloverRec.CT[5505]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5505]==0&false)))
			{{
				__CLOVER_231_0.cloverRec.S[19325]++;CIInstruction_Return ins2=(CIInstruction_Return)ins;
			}
			}else {__CLOVER_231_0.cloverRec.S[19326]++;if((((ins instanceof CIInstruction_Affect) && (++__CLOVER_231_0.cloverRec.CT[5506]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5506]==0&false)))
			{{
				__CLOVER_231_0.cloverRec.S[19327]++;CIInstruction_Affect ins2=(CIInstruction_Affect)ins;
				__CLOVER_231_0.cloverRec.S[19328]++;CITypeSimple type,type2;
				__CLOVER_231_0.cloverRec.S[19329]++;if((((!var_existe(ins2.nom.nom,env)) && (++__CLOVER_231_0.cloverRec.CT[5507]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5507]==0&false)))
				{{
					__CLOVER_231_0.cloverRec.S[19330]++;ajoute_erreur(env,"La variable "+ins2.nom.nom+" n'existe pas");
					__CLOVER_231_0.cloverRec.S[19331]++;return false;
				}
				}__CLOVER_231_0.cloverRec.S[19332]++;type2=(CITypeSimple)env.var_type(ins2.nom.nom);
				__CLOVER_231_0.cloverRec.S[19333]++;if((((type2==null) && (++__CLOVER_231_0.cloverRec.CT[5508]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5508]==0&false)))
				{{
					__CLOVER_231_0.cloverRec.S[19334]++;ajoute_erreur(env,"La variable n'a pas de type");
					__CLOVER_231_0.cloverRec.S[19335]++;return false;
				}
				}__CLOVER_231_0.cloverRec.S[19336]++;type=verif_expr(ins2.expr,env);
				__CLOVER_231_0.cloverRec.S[19337]++;if((((type==null) && (++__CLOVER_231_0.cloverRec.CT[5509]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5509]==0&false)))
				{{
					__CLOVER_231_0.cloverRec.S[19338]++;ajoute_erreur(env,"L'expression n'a pas de type");
					__CLOVER_231_0.cloverRec.S[19339]++;return false;
				}
				}__CLOVER_231_0.cloverRec.S[19340]++;if((((!type_compatible(type2,type)) && (++__CLOVER_231_0.cloverRec.CT[5510]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5510]==0&false)))
				{{
					__CLOVER_231_0.cloverRec.S[19341]++;ajoute_erreur(env,"L'expression de type "+type+" n'est pas compatible avec la variable "+ins2.nom.nom+ " de type "+type2);
					__CLOVER_231_0.cloverRec.S[19342]++;return false;
				}
			}}
			}else {__CLOVER_231_0.cloverRec.S[19343]++;if((((ins instanceof CIInstruction_Appel) && (++__CLOVER_231_0.cloverRec.CT[5511]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5511]==0&false)))
			{{// TODO: a faire
				__CLOVER_231_0.cloverRec.S[19344]++;CIInstruction_Appel ins2=(CIInstruction_Appel)ins;
				__CLOVER_231_0.cloverRec.S[19345]++;CIType type,param[];
				__CLOVER_231_0.cloverRec.S[19346]++;CIClasse cl=null;
				__CLOVER_231_0.cloverRec.S[19347]++;int j;
				__CLOVER_231_0.cloverRec.S[19348]++;if((((ins2.cible!=null) && (++__CLOVER_231_0.cloverRec.CT[5512]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5512]==0&false)))
				{{
					__CLOVER_231_0.cloverRec.S[19349]++;type=verif_expr(ins2.cible,env);
					__CLOVER_231_0.cloverRec.S[19350]++;if((((type==null) && (++__CLOVER_231_0.cloverRec.CT[5513]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5513]==0&false)))
					{{
						__CLOVER_231_0.cloverRec.S[19351]++;ajoute_erreur(env,"Erreur dans la cible de la cr\u00e9ation");
						__CLOVER_231_0.cloverRec.S[19352]++;return false;
					}
					}else
					{{
						__CLOVER_231_0.cloverRec.S[19353]++;cl=env.programme.donne_classe(type);
						assert((((cl!=null)) && (++__CLOVER_231_0.cloverRec.CT[5514]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5514]==0&false));
					}
				}}
				}else
				{{
					__CLOVER_231_0.cloverRec.S[19354]++;cl=env.classe;
					assert((((cl!=null)) && (++__CLOVER_231_0.cloverRec.CT[5515]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5515]==0&false));
				}
				}__CLOVER_231_0.cloverRec.S[19355]++;if((((ins2.param!=null&&ins2.param.length>0) && (++__CLOVER_231_0.cloverRec.CT[5516]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5516]==0&false)))
				{{
					__CLOVER_231_0.cloverRec.S[19356]++;param=new CIType[ins2.param.length];
					__CLOVER_231_0.cloverRec.S[19357]++;for(j=0;(((j<param.length) && (++__CLOVER_231_0.cloverRec.CT[5517]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5517]==0&false));j++)
					{{
						__CLOVER_231_0.cloverRec.S[19358]++;param[j]=verif_expr(ins2.param[j],env);
					}
				}}
				}else
				{{
					__CLOVER_231_0.cloverRec.S[19359]++;param=null;
				}
				// TODO: trouver l'attribut et verifier les parametres
				}__CLOVER_231_0.cloverRec.S[19360]++;if((((cl!=null) && (++__CLOVER_231_0.cloverRec.CT[5518]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5518]==0&false)))
				{{
					__CLOVER_231_0.cloverRec.S[19361]++;CIAttribut attr;
					__CLOVER_231_0.cloverRec.S[19362]++;attr=cl.donne_attribut(ins2.nom);
					__CLOVER_231_0.cloverRec.S[19363]++;if((((attr==null) && (++__CLOVER_231_0.cloverRec.CT[5519]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5519]==0&false)))
					{{
						__CLOVER_231_0.cloverRec.S[19364]++;ajoute_erreur(env,"Impossible de trouver l'attribut "+attr+" dans la classe "+cl.nom.nom);
						__CLOVER_231_0.cloverRec.S[19365]++;return false;
					}
					}else
					{{
						__CLOVER_231_0.cloverRec.S[19366]++;if((((attr.routine!=null&&attr.routine.parametre!=null&&
								attr.routine.parametre.size()>0) && (++__CLOVER_231_0.cloverRec.CT[5520]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5520]==0&false)))
						{{
							__CLOVER_231_0.cloverRec.S[19367]++;if((((param==null||
									param.length!=attr.routine.parametre.size()) && (++__CLOVER_231_0.cloverRec.CT[5521]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5521]==0&false)))
							{{
								__CLOVER_231_0.cloverRec.S[19368]++;ajoute_erreur(env,"Le nombre de parametres ne correspond pas pour l'appel "+attr);
								__CLOVER_231_0.cloverRec.S[19369]++;return false;
							}
						}}
						}else
						{{
							__CLOVER_231_0.cloverRec.S[19370]++;if((((param!=null&&
									param.length>0) && (++__CLOVER_231_0.cloverRec.CT[5522]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5522]==0&false)))
							{{
								__CLOVER_231_0.cloverRec.S[19371]++;ajoute_erreur(env,"Le nombre de parametres ne correspond pas pour l'appel "+attr);
								__CLOVER_231_0.cloverRec.S[19372]++;return false;
							}
						}}
						}__CLOVER_231_0.cloverRec.S[19373]++;if((((!erreur) && (++__CLOVER_231_0.cloverRec.CT[5523]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5523]==0&false)))
						{{
							__CLOVER_231_0.cloverRec.S[19374]++;if((((attr.est_descendant()) && (++__CLOVER_231_0.cloverRec.CT[5524]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5524]==0&false)))
							{{
								__CLOVER_231_0.cloverRec.S[19375]++;CIAttribut attr2;
								assert((((attr.attribut_ascendant!=null)) && (++__CLOVER_231_0.cloverRec.CT[5525]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5525]==0&false));
								assert((((attr.attribut_ascendant.length==1)) && (++__CLOVER_231_0.cloverRec.CT[5526]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5526]==0&false));
								__CLOVER_231_0.cloverRec.S[19376]++;attr2=attr.attribut_ascendant[0].donne_attribut(ins2.nom,cl,programme);
								assert((((attr2!=null)) && (++__CLOVER_231_0.cloverRec.CT[5527]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5527]==0&false));
								__CLOVER_231_0.cloverRec.S[19377]++;if((((attr2.retour!=null) && (++__CLOVER_231_0.cloverRec.CT[5528]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5528]==0&false)))
								{{
									__CLOVER_231_0.cloverRec.S[19378]++;ajoute_erreur(env,"l'appel "+attr+" retourne quelque chose");
									__CLOVER_231_0.cloverRec.S[19379]++;return false;
								}
							}}
							}else
							{{
								__CLOVER_231_0.cloverRec.S[19380]++;if((((attr.retour!=null) && (++__CLOVER_231_0.cloverRec.CT[5529]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5529]==0&false)))
								{{
									__CLOVER_231_0.cloverRec.S[19381]++;ajoute_erreur(env,"l'appel "+attr+" retourne quelque chose");
									__CLOVER_231_0.cloverRec.S[19382]++;return false;
								}
							}}
							}__CLOVER_231_0.cloverRec.S[19383]++;if((((param!=null&&param.length>0) && (++__CLOVER_231_0.cloverRec.CT[5530]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5530]==0&false)))
							{{
								__CLOVER_231_0.cloverRec.S[19384]++;for(j=0;(((j<param.length&&!erreur) && (++__CLOVER_231_0.cloverRec.CT[5531]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5531]==0&false));j++)
								{{
									__CLOVER_231_0.cloverRec.S[19385]++;type=attr.routine.parametre.elt(j).type;
									assert((((type!=null)) && (++__CLOVER_231_0.cloverRec.CT[5532]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5532]==0&false));
									__CLOVER_231_0.cloverRec.S[19386]++;if((((!type_compatible(type,param[j])) && (++__CLOVER_231_0.cloverRec.CT[5533]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5533]==0&false)))
									{{
										__CLOVER_231_0.cloverRec.S[19387]++;ajoute_erreur(env,"type incompatible dans le parametre no "+j+" pour l'appel "+attr);
										__CLOVER_231_0.cloverRec.S[19388]++;return false;
									}
								}}
							}}
						}}
					}}
				}}
			}}
			}else {__CLOVER_231_0.cloverRec.S[19389]++;if((((ins instanceof CIInstruction_Goto) && (++__CLOVER_231_0.cloverRec.CT[5534]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5534]==0&false)))
			{{
				__CLOVER_231_0.cloverRec.S[19390]++;CIInstruction_Goto ins2=(CIInstruction_Goto)ins;
				__CLOVER_231_0.cloverRec.S[19391]++;s=ins2.nom;
				__CLOVER_231_0.cloverRec.S[19392]++;if((((!liste_label.contains(s)) && (++__CLOVER_231_0.cloverRec.CT[5535]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5535]==0&false)))
				{{// on ne sais pas si il existe => on testera a la fin
					__CLOVER_231_0.cloverRec.S[19393]++;liste_goto.add(s);
				}
			}}
			}else {__CLOVER_231_0.cloverRec.S[19394]++;if((((ins instanceof CIInstruction_Raise) && (++__CLOVER_231_0.cloverRec.CT[5536]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5536]==0&false)))
			{{
				__CLOVER_231_0.cloverRec.S[19395]++;CIInstruction_Raise ins2=(CIInstruction_Raise)ins;
				__CLOVER_231_0.cloverRec.S[19396]++;CITypeSimple type,type2;
				// Verifier que le type est correcte
				__CLOVER_231_0.cloverRec.S[19397]++;type=verif_expr(ins2.no,env);
				__CLOVER_231_0.cloverRec.S[19398]++;if((((type==null) && (++__CLOVER_231_0.cloverRec.CT[5537]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5537]==0&false)))
				{{
					__CLOVER_231_0.cloverRec.S[19399]++;return false;
				}
				}__CLOVER_231_0.cloverRec.S[19400]++;if((((ins2.nom!=null) && (++__CLOVER_231_0.cloverRec.CT[5538]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5538]==0&false)))
				{{
					__CLOVER_231_0.cloverRec.S[19401]++;type2=verif_expr(ins2.nom,env);
					__CLOVER_231_0.cloverRec.S[19402]++;if((((type2==null) && (++__CLOVER_231_0.cloverRec.CT[5539]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5539]==0&false)))
						{__CLOVER_231_0.cloverRec.S[19403]++;return false;
				}}
			}}
			}else {__CLOVER_231_0.cloverRec.S[19404]++;if((((ins instanceof CIInstruction_Si_Non) && (++__CLOVER_231_0.cloverRec.CT[5540]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5540]==0&false)))
			{{
				__CLOVER_231_0.cloverRec.S[19405]++;CIInstruction_Si_Non ins2=(CIInstruction_Si_Non)ins;
				__CLOVER_231_0.cloverRec.S[19406]++;CITypeSimple type;
				__CLOVER_231_0.cloverRec.S[19407]++;s=ins2.label;
				__CLOVER_231_0.cloverRec.S[19408]++;if((((!liste_label.contains(s)) && (++__CLOVER_231_0.cloverRec.CT[5541]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5541]==0&false)))
				{{// on ne sais pas si il existe => on testera a la fin
					__CLOVER_231_0.cloverRec.S[19409]++;liste_goto.add(s);
				}
				}__CLOVER_231_0.cloverRec.S[19410]++;type=verif_expr(ins2.expr,env);
				__CLOVER_231_0.cloverRec.S[19411]++;if((((type==null) && (++__CLOVER_231_0.cloverRec.CT[5542]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5542]==0&false)))
				{{
					__CLOVER_231_0.cloverRec.S[19412]++;return false;
				}
			}}
			}else {__CLOVER_231_0.cloverRec.S[19413]++;if((((ins instanceof CIInstruction_Si) && (++__CLOVER_231_0.cloverRec.CT[5543]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5543]==0&false)))
			{{
				__CLOVER_231_0.cloverRec.S[19414]++;CIInstruction_Si ins2=(CIInstruction_Si)ins;
				__CLOVER_231_0.cloverRec.S[19415]++;CITypeSimple type;
				__CLOVER_231_0.cloverRec.S[19416]++;s=ins2.label;
				__CLOVER_231_0.cloverRec.S[19417]++;if((((!liste_label.contains(s)) && (++__CLOVER_231_0.cloverRec.CT[5544]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5544]==0&false)))
				{{// on ne sais pas si il existe => on testera a la fin
					__CLOVER_231_0.cloverRec.S[19418]++;liste_goto.add(s);
				}
				}__CLOVER_231_0.cloverRec.S[19419]++;type=verif_expr(ins2.expr,env);
				__CLOVER_231_0.cloverRec.S[19420]++;if((((type==null) && (++__CLOVER_231_0.cloverRec.CT[5545]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5545]==0&false)))
				{{
					__CLOVER_231_0.cloverRec.S[19421]++;return false;
				}
			}}
			}else
			{{
				assert((((false)) && (++__CLOVER_231_0.cloverRec.CT[5546]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5546]==0&false));
			}
			}}}}}}}}__CLOVER_231_0.cloverRec.S[19422]++;env.sort_instr();
		}
		}__CLOVER_231_0.cloverRec.S[19423]++;if((((liste_goto.size()>0) && (++__CLOVER_231_0.cloverRec.CT[5547]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5547]==0&false)))
		{{
			__CLOVER_231_0.cloverRec.S[19424]++;for(i=0;(((i<liste_goto.size()) && (++__CLOVER_231_0.cloverRec.CT[5548]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5548]==0&false));i++)
			{{
				__CLOVER_231_0.cloverRec.S[19425]++;s=(String)liste_goto.elementAt(i);
				__CLOVER_231_0.cloverRec.S[19426]++;if((((!liste_label.contains(s)) && (++__CLOVER_231_0.cloverRec.CT[5549]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5549]==0&false)))
				{{
					__CLOVER_231_0.cloverRec.S[19427]++;ajoute_erreur(env,"Le label "+s+" n'existe pas");
					__CLOVER_231_0.cloverRec.S[19428]++;return false;
				}
			}}
		}}
		}__CLOVER_231_0.cloverRec.S[19429]++;return true;
	}

	public CITypeSimple verif_expr(CIExpr expr,CIEnvironnement env)
	{__CLOVER_231_0.cloverRec.M[1349]++;
		assert((((expr!=null)) && (++__CLOVER_231_0.cloverRec.CT[5550]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5550]==0&false));
		assert((((env!=null)) && (++__CLOVER_231_0.cloverRec.CT[5551]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5551]==0&false));
		__CLOVER_231_0.cloverRec.S[19430]++;CITypeSimple res=null;
		__CLOVER_231_0.cloverRec.S[19431]++;int passe=0;
		__CLOVER_231_0.cloverRec.S[19432]++;if((((expr instanceof CIExpr_Char) && (++__CLOVER_231_0.cloverRec.CT[5552]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5552]==0&false)))
		{{
			__CLOVER_231_0.cloverRec.S[19433]++;res=type_pcharacter;
		}
		}else {__CLOVER_231_0.cloverRec.S[19434]++;if((((expr instanceof CIExpr_Bool) && (++__CLOVER_231_0.cloverRec.CT[5553]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5553]==0&false)))
		{{
			__CLOVER_231_0.cloverRec.S[19435]++;res=type_pboolean;
		}
		}else {__CLOVER_231_0.cloverRec.S[19436]++;if((((expr instanceof CIExpr_Appel) && (++__CLOVER_231_0.cloverRec.CT[5554]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5554]==0&false)))
		{{
			__CLOVER_231_0.cloverRec.S[19437]++;CIExpr_Appel e=(CIExpr_Appel)expr;
			__CLOVER_231_0.cloverRec.S[19438]++;CIType type,param[];
			__CLOVER_231_0.cloverRec.S[19439]++;CIClasse cl=null;
			__CLOVER_231_0.cloverRec.S[19440]++;int i;
			__CLOVER_231_0.cloverRec.S[19441]++;if((((e.cible!=null) && (++__CLOVER_231_0.cloverRec.CT[5555]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5555]==0&false)))
			{{
				__CLOVER_231_0.cloverRec.S[19442]++;type=verif_expr(e.cible,env);
				__CLOVER_231_0.cloverRec.S[19443]++;if((((type==null) && (++__CLOVER_231_0.cloverRec.CT[5556]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5556]==0&false)))
				{{
					__CLOVER_231_0.cloverRec.S[19444]++;ajoute_erreur(env,"Erreur dans la cible de la cr\u00e9ation");
				}
				}else
				{{
					__CLOVER_231_0.cloverRec.S[19445]++;cl=env.programme.donne_classe(type);
					assert((((cl!=null)) && (++__CLOVER_231_0.cloverRec.CT[5557]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5557]==0&false));
				}
			}}
			}else
			{{
				__CLOVER_231_0.cloverRec.S[19446]++;cl=env.classe;
				assert((((cl!=null)) && (++__CLOVER_231_0.cloverRec.CT[5558]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5558]==0&false));
			}
			}__CLOVER_231_0.cloverRec.S[19447]++;if((((e.parametre!=null&&e.parametre.length>0) && (++__CLOVER_231_0.cloverRec.CT[5559]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5559]==0&false)))
			{{
				__CLOVER_231_0.cloverRec.S[19448]++;param=new CIType[e.parametre.length];
				__CLOVER_231_0.cloverRec.S[19449]++;for(i=0;(((i<param.length) && (++__CLOVER_231_0.cloverRec.CT[5560]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5560]==0&false));i++)
				{{
					__CLOVER_231_0.cloverRec.S[19450]++;param[i]=verif_expr(e.parametre[i],env);
				}
			}}
			}else
			{{
				__CLOVER_231_0.cloverRec.S[19451]++;param=null;
			}
			// TODO: trouver l'attribut et verifier les parametres
			}__CLOVER_231_0.cloverRec.S[19452]++;if((((cl!=null) && (++__CLOVER_231_0.cloverRec.CT[5561]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5561]==0&false)))
			{{
				__CLOVER_231_0.cloverRec.S[19453]++;CIAttribut attr;
				__CLOVER_231_0.cloverRec.S[19454]++;attr=cl.donne_attribut(e.nom);
				__CLOVER_231_0.cloverRec.S[19455]++;if((((attr==null) && (++__CLOVER_231_0.cloverRec.CT[5562]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5562]==0&false)))
				{{
					__CLOVER_231_0.cloverRec.S[19456]++;ajoute_erreur(env,"Impossible de trouver l'attribut "+attr+" dans la classe "+cl.nom.nom);
				}
				}else
				{{
					__CLOVER_231_0.cloverRec.S[19457]++;if((((attr.routine!=null&&attr.routine.parametre!=null&&
							attr.routine.parametre.size()>0) && (++__CLOVER_231_0.cloverRec.CT[5563]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5563]==0&false)))
					{{
						__CLOVER_231_0.cloverRec.S[19458]++;if((((param==null||
								param.length!=attr.routine.parametre.size()) && (++__CLOVER_231_0.cloverRec.CT[5564]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5564]==0&false)))
						{{
							__CLOVER_231_0.cloverRec.S[19459]++;ajoute_erreur(env,"Le nombre de parametres ne correspond pas pour l'appel "+attr);
						}
					}}
					}else
					{{
						__CLOVER_231_0.cloverRec.S[19460]++;if((((param!=null&&
								param.length>0) && (++__CLOVER_231_0.cloverRec.CT[5565]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5565]==0&false)))
						{{
							__CLOVER_231_0.cloverRec.S[19461]++;ajoute_erreur(env,"Le nombre de parametres ne correspond pas pour l'appel "+attr);
						}
					}}
					}__CLOVER_231_0.cloverRec.S[19462]++;if((((!erreur) && (++__CLOVER_231_0.cloverRec.CT[5566]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5566]==0&false)))
					{{
						__CLOVER_231_0.cloverRec.S[19463]++;if((((attr.est_descendant()) && (++__CLOVER_231_0.cloverRec.CT[5567]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5567]==0&false)))
						{{
							__CLOVER_231_0.cloverRec.S[19464]++;CIAttribut attr2;
							assert((((attr.attribut_ascendant!=null)) && (++__CLOVER_231_0.cloverRec.CT[5568]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5568]==0&false));
							assert((((attr.attribut_ascendant.length==1)) && (++__CLOVER_231_0.cloverRec.CT[5569]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5569]==0&false));
							__CLOVER_231_0.cloverRec.S[19465]++;attr2=attr.attribut_ascendant[0].donne_attribut(e.nom,cl,programme);
							assert((((attr2!=null)) && (++__CLOVER_231_0.cloverRec.CT[5570]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5570]==0&false));
							__CLOVER_231_0.cloverRec.S[19466]++;res=(CITypeSimple)attr2.retour;
						}
						}else
						{{
							__CLOVER_231_0.cloverRec.S[19467]++;res=(CITypeSimple)attr.retour;
						}
						}__CLOVER_231_0.cloverRec.S[19468]++;if((((param!=null&&param.length>0) && (++__CLOVER_231_0.cloverRec.CT[5571]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5571]==0&false)))
						{{
							__CLOVER_231_0.cloverRec.S[19469]++;for(i=0;(((i<param.length&&!erreur) && (++__CLOVER_231_0.cloverRec.CT[5572]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5572]==0&false));i++)
							{{
								__CLOVER_231_0.cloverRec.S[19470]++;type=attr.routine.parametre.elt(i).type;
								assert((((type!=null)) && (++__CLOVER_231_0.cloverRec.CT[5573]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5573]==0&false));
								__CLOVER_231_0.cloverRec.S[19471]++;if((((!type_compatible(type,param[i])) && (++__CLOVER_231_0.cloverRec.CT[5574]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5574]==0&false)))
								{{
									__CLOVER_231_0.cloverRec.S[19472]++;ajoute_erreur(env,"type incompatible dans le parametre no "+i+" pour l'appel "+attr);
									__CLOVER_231_0.cloverRec.S[19473]++;erreur=true;
								}
							}}
						}}
					}}
				}}
			}}
		}}
		}else {__CLOVER_231_0.cloverRec.S[19474]++;if((((expr instanceof CIExpr_Binaire) && (++__CLOVER_231_0.cloverRec.CT[5575]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5575]==0&false)))
		{{
			__CLOVER_231_0.cloverRec.S[19475]++;CIExpr_Binaire e=(CIExpr_Binaire)expr;
			__CLOVER_231_0.cloverRec.S[19476]++;CIType type1,type2;
			__CLOVER_231_0.cloverRec.S[19477]++;type1=verif_expr(e.expr1,env);
			__CLOVER_231_0.cloverRec.S[19478]++;if((((type1==null) && (++__CLOVER_231_0.cloverRec.CT[5576]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5576]==0&false)))
			{{
				__CLOVER_231_0.cloverRec.S[19479]++;ajoute_erreur(env,"operation binaire impossible");
			}
			}else
			{{
				__CLOVER_231_0.cloverRec.S[19480]++;type2=verif_expr(e.expr1,env);
				__CLOVER_231_0.cloverRec.S[19481]++;if((((type2==null) && (++__CLOVER_231_0.cloverRec.CT[5577]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5577]==0&false)))
				{{
					__CLOVER_231_0.cloverRec.S[19482]++;ajoute_erreur(env,"operation binaire impossible");
				}
				}else
				{{
					__CLOVER_231_0.cloverRec.S[19483]++;if((((type_compatible(type1,type_pinteger)&&
							type_compatible(type2,type_pinteger)) && (++__CLOVER_231_0.cloverRec.CT[5578]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5578]==0&false)))
					{{
						__CLOVER_231_0.cloverRec.S[19484]++;boolean __CLOVER_bool0=false;switch(e.op)
						{
							case CIExpr_Binaire.Plus:if (!__CLOVER_bool0) {__CLOVER_231_0.cloverRec.S[19485]++;__CLOVER_bool0=true;}
							case CIExpr_Binaire.Moins:if (!__CLOVER_bool0) {__CLOVER_231_0.cloverRec.S[19486]++;__CLOVER_bool0=true;}
							case CIExpr_Binaire.Fois:if (!__CLOVER_bool0) {__CLOVER_231_0.cloverRec.S[19487]++;__CLOVER_bool0=true;}
							case CIExpr_Binaire.Div_entier:if (!__CLOVER_bool0) {__CLOVER_231_0.cloverRec.S[19488]++;__CLOVER_bool0=true;}
							case CIExpr_Binaire.Mod:if (!__CLOVER_bool0) {__CLOVER_231_0.cloverRec.S[19489]++;__CLOVER_bool0=true;}
							case CIExpr_Binaire.Puiss:if (!__CLOVER_bool0) {__CLOVER_231_0.cloverRec.S[19490]++;__CLOVER_bool0=true;}
								__CLOVER_231_0.cloverRec.S[19491]++;res=type_pinteger;
								__CLOVER_231_0.cloverRec.S[19492]++;break;
							case CIExpr_Binaire.Div_reel:if (!__CLOVER_bool0) {__CLOVER_231_0.cloverRec.S[19493]++;__CLOVER_bool0=true;}
								__CLOVER_231_0.cloverRec.S[19494]++;res=type_pdouble;
								__CLOVER_231_0.cloverRec.S[19495]++;break;
							case CIExpr_Binaire.Diff:if (!__CLOVER_bool0) {__CLOVER_231_0.cloverRec.S[19496]++;__CLOVER_bool0=true;}
							case CIExpr_Binaire.Egal:if (!__CLOVER_bool0) {__CLOVER_231_0.cloverRec.S[19497]++;__CLOVER_bool0=true;}
							case CIExpr_Binaire.Inf:if (!__CLOVER_bool0) {__CLOVER_231_0.cloverRec.S[19498]++;__CLOVER_bool0=true;}
							case CIExpr_Binaire.InfS:if (!__CLOVER_bool0) {__CLOVER_231_0.cloverRec.S[19499]++;__CLOVER_bool0=true;}
							case CIExpr_Binaire.Sup:if (!__CLOVER_bool0) {__CLOVER_231_0.cloverRec.S[19500]++;__CLOVER_bool0=true;}
							case CIExpr_Binaire.SupS:if (!__CLOVER_bool0) {__CLOVER_231_0.cloverRec.S[19501]++;__CLOVER_bool0=true;}
								__CLOVER_231_0.cloverRec.S[19502]++;res=type_pboolean;
								__CLOVER_231_0.cloverRec.S[19503]++;break;
							default:if (!__CLOVER_bool0) {__CLOVER_231_0.cloverRec.S[19504]++;__CLOVER_bool0=true;}
								__CLOVER_231_0.cloverRec.S[19505]++;ajoute_erreur(env,"operation binaire impossible");
						}
					}
					}else {__CLOVER_231_0.cloverRec.S[19506]++;if((((type_compatible(type1,type_pboolean)&&
							type_compatible(type2,type_pboolean)) && (++__CLOVER_231_0.cloverRec.CT[5579]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5579]==0&false)))
					{{
						__CLOVER_231_0.cloverRec.S[19507]++;boolean __CLOVER_bool1=false;switch(e.op)
						{
							case CIExpr_Binaire.And:if (!__CLOVER_bool1) {__CLOVER_231_0.cloverRec.S[19508]++;__CLOVER_bool1=true;}
							case CIExpr_Binaire.And_Then:if (!__CLOVER_bool1) {__CLOVER_231_0.cloverRec.S[19509]++;__CLOVER_bool1=true;}
							case CIExpr_Binaire.Diff:if (!__CLOVER_bool1) {__CLOVER_231_0.cloverRec.S[19510]++;__CLOVER_bool1=true;}
							case CIExpr_Binaire.Egal:if (!__CLOVER_bool1) {__CLOVER_231_0.cloverRec.S[19511]++;__CLOVER_bool1=true;}
							case CIExpr_Binaire.Xor:if (!__CLOVER_bool1) {__CLOVER_231_0.cloverRec.S[19512]++;__CLOVER_bool1=true;}
								__CLOVER_231_0.cloverRec.S[19513]++;res=type_pboolean;
								__CLOVER_231_0.cloverRec.S[19514]++;break;
							default:if (!__CLOVER_bool1) {__CLOVER_231_0.cloverRec.S[19515]++;__CLOVER_bool1=true;}
								__CLOVER_231_0.cloverRec.S[19516]++;ajoute_erreur(env,"operation binaire impossible");
						}
					}
					}else {__CLOVER_231_0.cloverRec.S[19517]++;if((((type_compatible(type1,type_preal)&&
							type_compatible(type2,type_preal)) && (++__CLOVER_231_0.cloverRec.CT[5580]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5580]==0&false)))
					{{
						__CLOVER_231_0.cloverRec.S[19518]++;boolean __CLOVER_bool2=false;switch(e.op)
						{
							case CIExpr_Binaire.Plus:if (!__CLOVER_bool2) {__CLOVER_231_0.cloverRec.S[19519]++;__CLOVER_bool2=true;}
							case CIExpr_Binaire.Moins:if (!__CLOVER_bool2) {__CLOVER_231_0.cloverRec.S[19520]++;__CLOVER_bool2=true;}
							case CIExpr_Binaire.Fois:if (!__CLOVER_bool2) {__CLOVER_231_0.cloverRec.S[19521]++;__CLOVER_bool2=true;}
							case CIExpr_Binaire.Div_reel:if (!__CLOVER_bool2) {__CLOVER_231_0.cloverRec.S[19522]++;__CLOVER_bool2=true;}
								__CLOVER_231_0.cloverRec.S[19523]++;res=type_preal;
								__CLOVER_231_0.cloverRec.S[19524]++;break;
							case CIExpr_Binaire.Diff:if (!__CLOVER_bool2) {__CLOVER_231_0.cloverRec.S[19525]++;__CLOVER_bool2=true;}
							case CIExpr_Binaire.Egal:if (!__CLOVER_bool2) {__CLOVER_231_0.cloverRec.S[19526]++;__CLOVER_bool2=true;}
							case CIExpr_Binaire.Inf:if (!__CLOVER_bool2) {__CLOVER_231_0.cloverRec.S[19527]++;__CLOVER_bool2=true;}
							case CIExpr_Binaire.InfS:if (!__CLOVER_bool2) {__CLOVER_231_0.cloverRec.S[19528]++;__CLOVER_bool2=true;}
							case CIExpr_Binaire.Sup:if (!__CLOVER_bool2) {__CLOVER_231_0.cloverRec.S[19529]++;__CLOVER_bool2=true;}
							case CIExpr_Binaire.SupS:if (!__CLOVER_bool2) {__CLOVER_231_0.cloverRec.S[19530]++;__CLOVER_bool2=true;}
								__CLOVER_231_0.cloverRec.S[19531]++;res=type_pboolean;
								__CLOVER_231_0.cloverRec.S[19532]++;break;
								default:if (!__CLOVER_bool2) {__CLOVER_231_0.cloverRec.S[19533]++;__CLOVER_bool2=true;}
									__CLOVER_231_0.cloverRec.S[19534]++;ajoute_erreur(env,"operation binaire impossible");
						}
					}
					}else {__CLOVER_231_0.cloverRec.S[19535]++;if((((type_compatible(type1,type_pdouble)&&
							type_compatible(type2,type_pdouble)) && (++__CLOVER_231_0.cloverRec.CT[5581]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5581]==0&false)))
					{{
						__CLOVER_231_0.cloverRec.S[19536]++;boolean __CLOVER_bool3=false;switch(e.op)
						{
							case CIExpr_Binaire.Plus:if (!__CLOVER_bool3) {__CLOVER_231_0.cloverRec.S[19537]++;__CLOVER_bool3=true;}
							case CIExpr_Binaire.Moins:if (!__CLOVER_bool3) {__CLOVER_231_0.cloverRec.S[19538]++;__CLOVER_bool3=true;}
							case CIExpr_Binaire.Fois:if (!__CLOVER_bool3) {__CLOVER_231_0.cloverRec.S[19539]++;__CLOVER_bool3=true;}
							case CIExpr_Binaire.Div_reel:if (!__CLOVER_bool3) {__CLOVER_231_0.cloverRec.S[19540]++;__CLOVER_bool3=true;}
								__CLOVER_231_0.cloverRec.S[19541]++;res=type_pdouble;
								__CLOVER_231_0.cloverRec.S[19542]++;break;
							case CIExpr_Binaire.Diff:if (!__CLOVER_bool3) {__CLOVER_231_0.cloverRec.S[19543]++;__CLOVER_bool3=true;}
							case CIExpr_Binaire.Egal:if (!__CLOVER_bool3) {__CLOVER_231_0.cloverRec.S[19544]++;__CLOVER_bool3=true;}
							case CIExpr_Binaire.Inf:if (!__CLOVER_bool3) {__CLOVER_231_0.cloverRec.S[19545]++;__CLOVER_bool3=true;}
							case CIExpr_Binaire.InfS:if (!__CLOVER_bool3) {__CLOVER_231_0.cloverRec.S[19546]++;__CLOVER_bool3=true;}
							case CIExpr_Binaire.Sup:if (!__CLOVER_bool3) {__CLOVER_231_0.cloverRec.S[19547]++;__CLOVER_bool3=true;}
							case CIExpr_Binaire.SupS:if (!__CLOVER_bool3) {__CLOVER_231_0.cloverRec.S[19548]++;__CLOVER_bool3=true;}
								__CLOVER_231_0.cloverRec.S[19549]++;res=type_pboolean;
								__CLOVER_231_0.cloverRec.S[19550]++;break;
								default:if (!__CLOVER_bool3) {__CLOVER_231_0.cloverRec.S[19551]++;__CLOVER_bool3=true;}
									__CLOVER_231_0.cloverRec.S[19552]++;ajoute_erreur(env,"operation bnaire impossible");
						}
					}
					}else {__CLOVER_231_0.cloverRec.S[19553]++;if((((type_compatible(type1,type_pcharacter)&&
							type_compatible(type2,type_pcharacter)) && (++__CLOVER_231_0.cloverRec.CT[5582]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5582]==0&false)))
					{{
						__CLOVER_231_0.cloverRec.S[19554]++;boolean __CLOVER_bool4=false;switch(e.op)
						{
							case CIExpr_Binaire.Diff:if (!__CLOVER_bool4) {__CLOVER_231_0.cloverRec.S[19555]++;__CLOVER_bool4=true;}
							case CIExpr_Binaire.Egal:if (!__CLOVER_bool4) {__CLOVER_231_0.cloverRec.S[19556]++;__CLOVER_bool4=true;}
							case CIExpr_Binaire.Inf:if (!__CLOVER_bool4) {__CLOVER_231_0.cloverRec.S[19557]++;__CLOVER_bool4=true;}
							case CIExpr_Binaire.InfS:if (!__CLOVER_bool4) {__CLOVER_231_0.cloverRec.S[19558]++;__CLOVER_bool4=true;}
							case CIExpr_Binaire.Sup:if (!__CLOVER_bool4) {__CLOVER_231_0.cloverRec.S[19559]++;__CLOVER_bool4=true;}
							case CIExpr_Binaire.SupS:if (!__CLOVER_bool4) {__CLOVER_231_0.cloverRec.S[19560]++;__CLOVER_bool4=true;}
								__CLOVER_231_0.cloverRec.S[19561]++;res=type_pboolean;
								__CLOVER_231_0.cloverRec.S[19562]++;break;
							default:if (!__CLOVER_bool4) {__CLOVER_231_0.cloverRec.S[19563]++;__CLOVER_bool4=true;}
								__CLOVER_231_0.cloverRec.S[19564]++;ajoute_erreur(env,"operation binaire impossible");
						}
					}
					}else {__CLOVER_231_0.cloverRec.S[19565]++;if((((e.op==CIExpr_Binaire.Diff||e.op==CIExpr_Binaire.Egal) && (++__CLOVER_231_0.cloverRec.CT[5583]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5583]==0&false)))
					{{// Difference ou egalit\u00e9 toujours possible si meme type
						__CLOVER_231_0.cloverRec.S[19566]++;if((((type_compatible(type1,type2)&&
								type_compatible(type2,type1)) && (++__CLOVER_231_0.cloverRec.CT[5584]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5584]==0&false)))
						{{
							__CLOVER_231_0.cloverRec.S[19567]++;res=type_pboolean;
						}
						}else
						{{
							__CLOVER_231_0.cloverRec.S[19568]++;ajoute_erreur(env,"operation binaire "+type1+"("+e.op+")"+type2+" impossible avec types diff\u00e9rents");
						}
					}}
					}else
					{{
						__CLOVER_231_0.cloverRec.S[19569]++;ajoute_erreur(env,"operation binaire "+type1+"("+e.op+")"+type2+" impossible");
					}
				}}}}}}}
			}}
		}}
		}else {__CLOVER_231_0.cloverRec.S[19570]++;if((((expr instanceof CIExpr_Creation) && (++__CLOVER_231_0.cloverRec.CT[5585]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5585]==0&false)))
		{{
			__CLOVER_231_0.cloverRec.S[19571]++;CIExpr_Creation e=(CIExpr_Creation)expr;
			__CLOVER_231_0.cloverRec.S[19572]++;CIType type1,type2;
			//type=verif_expr(e.index,env);
			__CLOVER_231_0.cloverRec.S[19573]++;if((((e.index!=null) && (++__CLOVER_231_0.cloverRec.CT[5586]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5586]==0&false)))
			{{
				__CLOVER_231_0.cloverRec.S[19574]++;type1=verif_expr(e.index,env);
				__CLOVER_231_0.cloverRec.S[19575]++;if((((type1==null) && (++__CLOVER_231_0.cloverRec.CT[5587]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5587]==0&false)))
				{{
					__CLOVER_231_0.cloverRec.S[19576]++;ajoute_erreur(env,"index invalide");
				}
				}else {__CLOVER_231_0.cloverRec.S[19577]++;if((((!type_compatible(type1,type_pinteger)) && (++__CLOVER_231_0.cloverRec.CT[5588]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5588]==0&false)))
				{{
					__CLOVER_231_0.cloverRec.S[19578]++;ajoute_erreur(env,"index non entier");
				}
				}else
				{{
					__CLOVER_231_0.cloverRec.S[19579]++;if((((!type_existe(e.type)) && (++__CLOVER_231_0.cloverRec.CT[5589]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5589]==0&false)))
					{{
						__CLOVER_231_0.cloverRec.S[19580]++;ajoute_erreur(env,"type invalide");
					}
				}}
			}}}
			}else
			{{
				__CLOVER_231_0.cloverRec.S[19581]++;if((((!type_existe(e.type)) && (++__CLOVER_231_0.cloverRec.CT[5590]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5590]==0&false)))
				{{
					__CLOVER_231_0.cloverRec.S[19582]++;ajoute_erreur(env,"type invalide");
				}
				}else
				{{
					__CLOVER_231_0.cloverRec.S[19583]++;type1=verif_expr(e.appel,env);
					__CLOVER_231_0.cloverRec.S[19584]++;if((((type1==null) && (++__CLOVER_231_0.cloverRec.CT[5591]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5591]==0&false)))
					{{
						__CLOVER_231_0.cloverRec.S[19585]++;ajoute_erreur(env,"type invalide");
					}
					}else
					{{
						__CLOVER_231_0.cloverRec.S[19586]++;res=(CITypeSimple)e.type;
					}
				}}
			}}
		}}
		}else {__CLOVER_231_0.cloverRec.S[19587]++;if((((expr instanceof CIExpr_Entier) && (++__CLOVER_231_0.cloverRec.CT[5592]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5592]==0&false)))
		{{
			__CLOVER_231_0.cloverRec.S[19588]++;res=type_pinteger;
		}
		}else {__CLOVER_231_0.cloverRec.S[19589]++;if((((expr instanceof CIExpr_Real) && (++__CLOVER_231_0.cloverRec.CT[5593]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5593]==0&false)))
		{{
			__CLOVER_231_0.cloverRec.S[19590]++;res=type_preal;
		}
		}else {__CLOVER_231_0.cloverRec.S[19591]++;if((((expr instanceof CIExpr_String) && (++__CLOVER_231_0.cloverRec.CT[5594]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5594]==0&false)))
		{{
			__CLOVER_231_0.cloverRec.S[19592]++;res=type_pstring;
		}
		}else {__CLOVER_231_0.cloverRec.S[19593]++;if((((expr instanceof CIExpr_Type) && (++__CLOVER_231_0.cloverRec.CT[5595]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5595]==0&false)))
		{{
			__CLOVER_231_0.cloverRec.S[19594]++;CIExpr_Type e=(CIExpr_Type)expr;
			__CLOVER_231_0.cloverRec.S[19595]++;CIType type;
			__CLOVER_231_0.cloverRec.S[19596]++;type=verif_expr(e.var,env);
			__CLOVER_231_0.cloverRec.S[19597]++;if((((type==null) && (++__CLOVER_231_0.cloverRec.CT[5596]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5596]==0&false)))
			{{
				__CLOVER_231_0.cloverRec.S[19598]++;ajoute_erreur(env,e.var+" n'a pas de type");
			}
			}else
			{{
				__CLOVER_231_0.cloverRec.S[19599]++;if((((!type_existe(e.type)) && (++__CLOVER_231_0.cloverRec.CT[5597]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5597]==0&false)))
				{{
					__CLOVER_231_0.cloverRec.S[19600]++;ajoute_erreur(env,"type "+e.type+" invalide");
				}
				}else
				{{
					__CLOVER_231_0.cloverRec.S[19601]++;res=type_pboolean;
				}
			}}
		}}
		}else {__CLOVER_231_0.cloverRec.S[19602]++;if((((expr instanceof CIExpr_Unaire) && (++__CLOVER_231_0.cloverRec.CT[5598]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5598]==0&false)))
		{{
			__CLOVER_231_0.cloverRec.S[19603]++;CIExpr_Unaire e=(CIExpr_Unaire)expr;
			__CLOVER_231_0.cloverRec.S[19604]++;CIType type;
			__CLOVER_231_0.cloverRec.S[19605]++;type=verif_expr(e.expr,env);
			__CLOVER_231_0.cloverRec.S[19606]++;if((((e.op==CIExpr_Unaire.Dollard) && (++__CLOVER_231_0.cloverRec.CT[5599]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5599]==0&false)))
			{{
				__CLOVER_231_0.cloverRec.S[19607]++;res=type_none;
			}
			}else {__CLOVER_231_0.cloverRec.S[19608]++;if((((type==null) && (++__CLOVER_231_0.cloverRec.CT[5600]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5600]==0&false)))
			{{
				__CLOVER_231_0.cloverRec.S[19609]++;ajoute_erreur(env,"operation unaire impossible");
			}
			}else
			{{
				__CLOVER_231_0.cloverRec.S[19610]++;if((((type_compatible(type,type_pinteger)) && (++__CLOVER_231_0.cloverRec.CT[5601]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5601]==0&false)))
				{{
					__CLOVER_231_0.cloverRec.S[19611]++;boolean __CLOVER_bool5=false;switch(e.op)
					{
						case CIExpr_Unaire.Plus:if (!__CLOVER_bool5) {__CLOVER_231_0.cloverRec.S[19612]++;__CLOVER_bool5=true;}
						case CIExpr_Unaire.Moins:if (!__CLOVER_bool5) {__CLOVER_231_0.cloverRec.S[19613]++;__CLOVER_bool5=true;}
							__CLOVER_231_0.cloverRec.S[19614]++;res=type_pinteger;
							__CLOVER_231_0.cloverRec.S[19615]++;break;
						case CIExpr_Unaire.Conv_E2D:if (!__CLOVER_bool5) {__CLOVER_231_0.cloverRec.S[19616]++;__CLOVER_bool5=true;}
							__CLOVER_231_0.cloverRec.S[19617]++;res=type_pdouble;
							__CLOVER_231_0.cloverRec.S[19618]++;break;
						case CIExpr_Unaire.Conv_E2R:if (!__CLOVER_bool5) {__CLOVER_231_0.cloverRec.S[19619]++;__CLOVER_bool5=true;}
							__CLOVER_231_0.cloverRec.S[19620]++;res=type_preal;
							__CLOVER_231_0.cloverRec.S[19621]++;break;
						case CIExpr_Unaire.Conv_E2C:if (!__CLOVER_bool5) {__CLOVER_231_0.cloverRec.S[19622]++;__CLOVER_bool5=true;}
							__CLOVER_231_0.cloverRec.S[19623]++;res=type_pcharacter;
							__CLOVER_231_0.cloverRec.S[19624]++;break;
						default:if (!__CLOVER_bool5) {__CLOVER_231_0.cloverRec.S[19625]++;__CLOVER_bool5=true;}
							__CLOVER_231_0.cloverRec.S[19626]++;ajoute_erreur(env,"operation unaire impossible");
					}
				}
				}else {__CLOVER_231_0.cloverRec.S[19627]++;if((((type_compatible(type,type_pboolean)) && (++__CLOVER_231_0.cloverRec.CT[5602]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5602]==0&false)))
				{{
					__CLOVER_231_0.cloverRec.S[19628]++;boolean __CLOVER_bool6=false;switch(e.op)
					{
						case CIExpr_Unaire.Not:if (!__CLOVER_bool6) {__CLOVER_231_0.cloverRec.S[19629]++;__CLOVER_bool6=true;}
							__CLOVER_231_0.cloverRec.S[19630]++;res=type_pboolean;
							__CLOVER_231_0.cloverRec.S[19631]++;break;
						default:if (!__CLOVER_bool6) {__CLOVER_231_0.cloverRec.S[19632]++;__CLOVER_bool6=true;}
							__CLOVER_231_0.cloverRec.S[19633]++;ajoute_erreur(env,"operation unaire impossible");
					}
				}
				}else {__CLOVER_231_0.cloverRec.S[19634]++;if((((type_compatible(type,type_preal)) && (++__CLOVER_231_0.cloverRec.CT[5603]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5603]==0&false)))
				{{
					__CLOVER_231_0.cloverRec.S[19635]++;boolean __CLOVER_bool7=false;switch(e.op)
					{
						case CIExpr_Unaire.Conv_R2D:if (!__CLOVER_bool7) {__CLOVER_231_0.cloverRec.S[19636]++;__CLOVER_bool7=true;}
							__CLOVER_231_0.cloverRec.S[19637]++;res=type_pdouble;
							__CLOVER_231_0.cloverRec.S[19638]++;break;
						case CIExpr_Unaire.Conv_R2E:if (!__CLOVER_bool7) {__CLOVER_231_0.cloverRec.S[19639]++;__CLOVER_bool7=true;}
							__CLOVER_231_0.cloverRec.S[19640]++;res=type_pinteger;
							__CLOVER_231_0.cloverRec.S[19641]++;break;
						default:if (!__CLOVER_bool7) {__CLOVER_231_0.cloverRec.S[19642]++;__CLOVER_bool7=true;}
							__CLOVER_231_0.cloverRec.S[19643]++;ajoute_erreur(env,"operation unaire impossible");
					}
				}
				}else {__CLOVER_231_0.cloverRec.S[19644]++;if((((type_compatible(type,type_pdouble)) && (++__CLOVER_231_0.cloverRec.CT[5604]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5604]==0&false)))
				{{
					__CLOVER_231_0.cloverRec.S[19645]++;boolean __CLOVER_bool8=false;switch(e.op)
					{
						case CIExpr_Unaire.Conv_D2R:if (!__CLOVER_bool8) {__CLOVER_231_0.cloverRec.S[19646]++;__CLOVER_bool8=true;}
							__CLOVER_231_0.cloverRec.S[19647]++;res=type_preal;
							__CLOVER_231_0.cloverRec.S[19648]++;break;
						case CIExpr_Unaire.Conv_D2E:if (!__CLOVER_bool8) {__CLOVER_231_0.cloverRec.S[19649]++;__CLOVER_bool8=true;}
							__CLOVER_231_0.cloverRec.S[19650]++;res=type_pinteger;
							__CLOVER_231_0.cloverRec.S[19651]++;break;
						default:if (!__CLOVER_bool8) {__CLOVER_231_0.cloverRec.S[19652]++;__CLOVER_bool8=true;}
							__CLOVER_231_0.cloverRec.S[19653]++;ajoute_erreur(env,"operation unaire impossible");
					}
				}
				}else {__CLOVER_231_0.cloverRec.S[19654]++;if((((type_compatible(type,type_pcharacter)) && (++__CLOVER_231_0.cloverRec.CT[5605]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5605]==0&false)))
				{{
					__CLOVER_231_0.cloverRec.S[19655]++;boolean __CLOVER_bool9=false;switch(e.op)
					{
						case CIExpr_Unaire.Conv_C2E:if (!__CLOVER_bool9) {__CLOVER_231_0.cloverRec.S[19656]++;__CLOVER_bool9=true;}
							__CLOVER_231_0.cloverRec.S[19657]++;res=type_pinteger;
							__CLOVER_231_0.cloverRec.S[19658]++;break;
						default:if (!__CLOVER_bool9) {__CLOVER_231_0.cloverRec.S[19659]++;__CLOVER_bool9=true;}
							__CLOVER_231_0.cloverRec.S[19660]++;ajoute_erreur(env,"operation unaire impossible");
					}
				}
				}else
				{{
					assert((((false)) && (++__CLOVER_231_0.cloverRec.CT[5606]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5606]==0&false));
				}
			}}}}}}
		}}}
		}else {__CLOVER_231_0.cloverRec.S[19661]++;if((((expr instanceof CIExpr_Var) && (++__CLOVER_231_0.cloverRec.CT[5607]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5607]==0&false)))
		{{
			__CLOVER_231_0.cloverRec.S[19662]++;CIExpr_Var e=(CIExpr_Var)expr;
			__CLOVER_231_0.cloverRec.S[19663]++;CIType t1,t2,t3;
			__CLOVER_231_0.cloverRec.S[19664]++;passe=1;
			__CLOVER_231_0.cloverRec.S[19665]++;if((((e.a_src()) && (++__CLOVER_231_0.cloverRec.CT[5608]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5608]==0&false)))
			{{
				__CLOVER_231_0.cloverRec.S[19666]++;passe=2;
				__CLOVER_231_0.cloverRec.S[19667]++;if((((!env.var_existe(e.src)) && (++__CLOVER_231_0.cloverRec.CT[5609]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5609]==0&false)))
				{{// Erreur
					__CLOVER_231_0.cloverRec.S[19668]++;passe=3;
					__CLOVER_231_0.cloverRec.S[19669]++;ajoute_erreur(env,"la variable "+e.src+" n'existe pas");
				}
				}else
				{{
					__CLOVER_231_0.cloverRec.S[19670]++;passe=3;
					__CLOVER_231_0.cloverRec.S[19671]++;t1=env.var_type(e.src);
					__CLOVER_231_0.cloverRec.S[19672]++;if((((t1==null) && (++__CLOVER_231_0.cloverRec.CT[5610]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5610]==0&false)))
					{{// Erreur
						__CLOVER_231_0.cloverRec.S[19673]++;passe=4;
						__CLOVER_231_0.cloverRec.S[19674]++;res=null;
					}
					}else
					{{
						__CLOVER_231_0.cloverRec.S[19675]++;CIClasse cl;
						__CLOVER_231_0.cloverRec.S[19676]++;CIAttribut attr;
						__CLOVER_231_0.cloverRec.S[19677]++;passe=5;
						__CLOVER_231_0.cloverRec.S[19678]++;cl=programme.donne_classe(t1);
						__CLOVER_231_0.cloverRec.S[19679]++;attr=cl.donne_attribut(e.nom);
						__CLOVER_231_0.cloverRec.S[19680]++;if((((attr==null) && (++__CLOVER_231_0.cloverRec.CT[5611]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5611]==0&false)))
						{{// Erreur
							__CLOVER_231_0.cloverRec.S[19681]++;passe=6;
							__CLOVER_231_0.cloverRec.S[19682]++;ajoute_erreur(env,"la variable "+e.nom+" n'existe pas dans la classe "+cl.nom.nom);
						}
						}else
						{{
							__CLOVER_231_0.cloverRec.S[19683]++;passe=7;
							__CLOVER_231_0.cloverRec.S[19684]++;res=attr.type;
						}
					}}
				}}
			}}
			}else
			{{
				__CLOVER_231_0.cloverRec.S[19685]++;passe=8;
				__CLOVER_231_0.cloverRec.S[19686]++;if((((!env.var_existe(e.nom)) && (++__CLOVER_231_0.cloverRec.CT[5612]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5612]==0&false)))
				{{// Erreur
					assert((((false)) && (++__CLOVER_231_0.cloverRec.CT[5613]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5613]==0&false)):"nom="+e.nom;
					__CLOVER_231_0.cloverRec.S[19687]++;ajoute_erreur(env,"la variable "+e.nom+" n'existe pas");
				}
				}else
				{{
					__CLOVER_231_0.cloverRec.S[19688]++;passe=9;
					__CLOVER_231_0.cloverRec.S[19689]++;res=(CITypeSimple)env.var_type(e.nom);
					__CLOVER_231_0.cloverRec.S[19690]++;if((((res==null) && (++__CLOVER_231_0.cloverRec.CT[5614]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5614]==0&false)))
					{{
						__CLOVER_231_0.cloverRec.S[19691]++;res=(CITypeSimple)env.var_type(e.nom);
					}
					}assert((((res!=null)) && (++__CLOVER_231_0.cloverRec.CT[5615]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5615]==0&false)):e.nom+":"+env.toString();
				}
			}}
			}__CLOVER_231_0.cloverRec.S[19692]++;if((((e.a_indice()) && (++__CLOVER_231_0.cloverRec.CT[5616]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5616]==0&false)))
			{{
				__CLOVER_231_0.cloverRec.S[19693]++;passe=10;
				__CLOVER_231_0.cloverRec.S[19694]++;t3=verif_expr(e.indice,env);
				__CLOVER_231_0.cloverRec.S[19695]++;if((((t3==null) && (++__CLOVER_231_0.cloverRec.CT[5617]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5617]==0&false)))
				{{
					__CLOVER_231_0.cloverRec.S[19696]++;if((((!erreur) && (++__CLOVER_231_0.cloverRec.CT[5618]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5618]==0&false)))
					{{
						__CLOVER_231_0.cloverRec.S[19697]++;ajoute_erreur(env,"l'indice n'est pas correcte");
					}
					}__CLOVER_231_0.cloverRec.S[19698]++;return null;
				}
				}else
				{{
					__CLOVER_231_0.cloverRec.S[19699]++;if((((!type_compatible(t3,type_pinteger)) && (++__CLOVER_231_0.cloverRec.CT[5619]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5619]==0&false)))
					{{
						__CLOVER_231_0.cloverRec.S[19700]++;ajoute_erreur(env,"l'indice n'est pas du type $integer");
					}
				}}
			}}
		}}
		}else {__CLOVER_231_0.cloverRec.S[19701]++;if((((expr instanceof CIExpr_Void) && (++__CLOVER_231_0.cloverRec.CT[5620]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5620]==0&false)))
		{{
			__CLOVER_231_0.cloverRec.S[19702]++;res=type_none;
		}
		}else
		{{
			assert((((false)) && (++__CLOVER_231_0.cloverRec.CT[5621]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5621]==0&false)):env;
		}
		}}}}}}}}}}}}__CLOVER_231_0.cloverRec.S[19703]++;if((((res==null) && (++__CLOVER_231_0.cloverRec.CT[5622]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5622]==0&false)))
		{{
			//assert(erreur):env+":"+expr+(expr instanceof CIExpr_Var)+passe;
		}
		}__CLOVER_231_0.cloverRec.S[19704]++;return res;
	}
	
	public boolean type_compatible(CIType ancetre,CIType descendant)
	{__CLOVER_231_0.cloverRec.M[1350]++;
		assert((((ancetre!=null)) && (++__CLOVER_231_0.cloverRec.CT[5623]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5623]==0&false));
		assert((((descendant!=null)) && (++__CLOVER_231_0.cloverRec.CT[5624]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5624]==0&false));
		assert((((ancetre instanceof CITypeSimple)) && (++__CLOVER_231_0.cloverRec.CT[5625]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5625]==0&false));
		assert((((descendant instanceof CITypeSimple)) && (++__CLOVER_231_0.cloverRec.CT[5626]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5626]==0&false));
		__CLOVER_231_0.cloverRec.S[19705]++;CITypeSimple a,d;
		
		__CLOVER_231_0.cloverRec.S[19706]++;CIClasse cl1,cl2;
		__CLOVER_231_0.cloverRec.S[19707]++;int no1,no2,i;
		__CLOVER_231_0.cloverRec.S[19708]++;if((((!type_existe(ancetre)) && (++__CLOVER_231_0.cloverRec.CT[5627]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5627]==0&false)))
			{__CLOVER_231_0.cloverRec.S[19709]++;return false;
		}__CLOVER_231_0.cloverRec.S[19710]++;if((((!type_existe(descendant)) && (++__CLOVER_231_0.cloverRec.CT[5628]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5628]==0&false)))
			{__CLOVER_231_0.cloverRec.S[19711]++;return false;
		}__CLOVER_231_0.cloverRec.S[19712]++;a=(CITypeSimple)ancetre;
		__CLOVER_231_0.cloverRec.S[19713]++;d=(CITypeSimple)descendant;
		__CLOVER_231_0.cloverRec.S[19714]++;if((((a.nom.equalsIgnoreCase(d.nom)) && (++__CLOVER_231_0.cloverRec.CT[5629]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5629]==0&false)))
			{__CLOVER_231_0.cloverRec.S[19715]++;return true;
		}__CLOVER_231_0.cloverRec.S[19716]++;cl1=programme.donne_classe(a);
		assert((((cl1!=null)) && (++__CLOVER_231_0.cloverRec.CT[5630]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5630]==0&false));
		__CLOVER_231_0.cloverRec.S[19717]++;cl2=programme.donne_classe(d);
		assert((((cl2!=null)) && (++__CLOVER_231_0.cloverRec.CT[5631]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5631]==0&false));
		assert((((cl1!=cl2)) && (++__CLOVER_231_0.cloverRec.CT[5632]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5632]==0&false)):"2 classes ont le meme nom";
		__CLOVER_231_0.cloverRec.S[19718]++;if((((cl2.heritage==null||cl2.heritage.length==0) && (++__CLOVER_231_0.cloverRec.CT[5633]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5633]==0&false)))
		{{
			__CLOVER_231_0.cloverRec.S[19719]++;return false;
		}
		}else
		{{// 
			__CLOVER_231_0.cloverRec.S[19720]++;return lien_heritage(cl1,cl2);
		}
	}}
	
	// retourne true ssi ancetre est un ancetre de descendant
	protected boolean lien_heritage(CIClasse ancetre,CIClasse descendant)
	{__CLOVER_231_0.cloverRec.M[1351]++;
		__CLOVER_231_0.cloverRec.S[19721]++;CITypeSimple h,tabh[];
		__CLOVER_231_0.cloverRec.S[19722]++;int i;
		__CLOVER_231_0.cloverRec.S[19723]++;CIClasse cl;
		assert((((ancetre!=null)) && (++__CLOVER_231_0.cloverRec.CT[5634]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5634]==0&false));
		assert((((descendant!=null)) && (++__CLOVER_231_0.cloverRec.CT[5635]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5635]==0&false));
		assert((((ancetre!=descendant)) && (++__CLOVER_231_0.cloverRec.CT[5636]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5636]==0&false));
		__CLOVER_231_0.cloverRec.S[19724]++;if((((descendant.heritage==null||descendant.heritage.length==0) && (++__CLOVER_231_0.cloverRec.CT[5637]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5637]==0&false)))
		{{
			__CLOVER_231_0.cloverRec.S[19725]++;return false;
		}
		}else
		{{
			__CLOVER_231_0.cloverRec.S[19726]++;for(i=0;(((i<descendant.heritage.length) && (++__CLOVER_231_0.cloverRec.CT[5638]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5638]==0&false));i++)
			{{
				__CLOVER_231_0.cloverRec.S[19727]++;cl=programme.donne_classe(descendant.heritage[i]);
				__CLOVER_231_0.cloverRec.S[19728]++;if((((cl==ancetre) && (++__CLOVER_231_0.cloverRec.CT[5639]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5639]==0&false)))
				{{
					__CLOVER_231_0.cloverRec.S[19729]++;return true;
				}
				}else {__CLOVER_231_0.cloverRec.S[19730]++;if((((lien_heritage(ancetre,cl)) && (++__CLOVER_231_0.cloverRec.CT[5640]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5640]==0&false)))
				{{
					__CLOVER_231_0.cloverRec.S[19731]++;return true;
				}
			}}}
		}}
		}__CLOVER_231_0.cloverRec.S[19732]++;return false;
	}
	
	public boolean var_existe(String nom,CIEnvironnement env)
	{__CLOVER_231_0.cloverRec.M[1352]++;
		assert((((nom!=null)) && (++__CLOVER_231_0.cloverRec.CT[5641]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5641]==0&false));
		assert((((env!=null)) && (++__CLOVER_231_0.cloverRec.CT[5642]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5642]==0&false));
		__CLOVER_231_0.cloverRec.S[19733]++;return env.var_existe(nom);
	}
	
	public boolean type_existe(CIType type)
	{__CLOVER_231_0.cloverRec.M[1353]++;// TODO: a faire
		assert((((programme!=null)) && (++__CLOVER_231_0.cloverRec.CT[5643]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5643]==0&false));
		assert((((type instanceof CITypeSimple)) && (++__CLOVER_231_0.cloverRec.CT[5644]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5644]==0&false));
		__CLOVER_231_0.cloverRec.S[19734]++;int i;
		__CLOVER_231_0.cloverRec.S[19735]++;CIClasse cl;
		__CLOVER_231_0.cloverRec.S[19736]++;CITypeSimple type2=(CITypeSimple)type;
		__CLOVER_231_0.cloverRec.S[19737]++;for(i=0;(((i<programme.liste_classe.length) && (++__CLOVER_231_0.cloverRec.CT[5645]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5645]==0&false));i++)
		{{
			__CLOVER_231_0.cloverRec.S[19738]++;cl=programme.liste_classe[i];
			__CLOVER_231_0.cloverRec.S[19739]++;if((((cl.nom.nom.equalsIgnoreCase(type2.nom)) && (++__CLOVER_231_0.cloverRec.CT[5646]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5646]==0&false)))
			{{
				__CLOVER_231_0.cloverRec.S[19740]++;return true;
			}
		}}
		}__CLOVER_231_0.cloverRec.S[19741]++;return false;
	}
	
	public String[] message_erreur()
	{__CLOVER_231_0.cloverRec.M[1354]++;
		assert((((msg_erreur!=null)) && (++__CLOVER_231_0.cloverRec.CT[5647]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5647]==0&false));
		assert((((erreur)) && (++__CLOVER_231_0.cloverRec.CT[5648]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5648]==0&false));
		__CLOVER_231_0.cloverRec.S[19742]++;String s,tab[];
		__CLOVER_231_0.cloverRec.S[19743]++;int i;
		__CLOVER_231_0.cloverRec.S[19744]++;tab=new String[msg_erreur.size()];
		__CLOVER_231_0.cloverRec.S[19745]++;for(i=0;(((i<msg_erreur.size()) && (++__CLOVER_231_0.cloverRec.CT[5649]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5649]==0&false));i++)
		{{
			assert((((msg_erreur.elementAt(i) instanceof String)) && (++__CLOVER_231_0.cloverRec.CT[5650]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5650]==0&false)):msg_erreur.elementAt(i);
			__CLOVER_231_0.cloverRec.S[19746]++;tab[i]=(String)msg_erreur.elementAt(i);
		}
		}__CLOVER_231_0.cloverRec.S[19747]++;return tab;
		//return (String[])msg_erreur.toArray();
	}
	
	protected void ajoute_erreur(CIEnvironnement env,String msg)
	{__CLOVER_231_0.cloverRec.M[1355]++;
		assert((((msg!=null)) && (++__CLOVER_231_0.cloverRec.CT[5651]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5651]==0&false));
		__CLOVER_231_0.cloverRec.S[19748]++;erreur=true;
		__CLOVER_231_0.cloverRec.S[19749]++;String m;
		__CLOVER_231_0.cloverRec.S[19750]++;if((((env==null) && (++__CLOVER_231_0.cloverRec.CT[5652]!=0|true)) || (++__CLOVER_231_0.cloverRec.CF[5652]==0&false)))
		{{
			__CLOVER_231_0.cloverRec.S[19751]++;m="() ";
		}
		}else
		{{
			__CLOVER_231_0.cloverRec.S[19752]++;m="("+env.toString()+") ";
		}
		}__CLOVER_231_0.cloverRec.S[19753]++;msg_erreur.add(m+msg);
	}
	
	protected CIProgramme programme;
	protected Vector msg_erreur;
	protected boolean erreur;

	protected static final CITypeSimple type_pinteger=new CITypeSimple(false,"$integer",null,null),
		type_integer=new CITypeSimple(false,"integer",null,null),
		type_pboolean=new CITypeSimple(false,"$boolean",null,null),
		type_boolean=new CITypeSimple(false,"boolean",null,null),
		type_pcharacter=new CITypeSimple(false,"$character",null,null),
		type_character=new CITypeSimple(false,"character",null,null),
		type_preal=new CITypeSimple(false,"$real",null,null),
		type_real=new CITypeSimple(false,"real",null,null),
		type_pdouble=new CITypeSimple(false,"$double",null,null),
		type_double=new CITypeSimple(false,"double",null,null),
		type_pstring=new CITypeSimple(false,"$string",null,null),
		type_string=new CITypeSimple(false,"string",null,null),
		type_none=new CITypeSimple(false,"none",null,null);

	/**
	 * @return
	 */
	/*public String[] liste_erreur() {
		if()
		return null;
	}*/

}

/*class CIEnv
{
	public CIEnv(CIClasse cl)
	{
		assert(cl!=null);
		classe=cl;
		liste_attr=new Vector();
		no_instr=-1;
	}
	
	public void entre_attribut(CINom_Attribut nom)
	{
		assert(nom!=null);
		assert(nom_attr==null);
		assert(no_instr==-1);
		nom_attr=nom;
		liste_var_local=new Vector();
	}
	
	public void sort_attribut()
	{
		assert(nom_attr!=null);
		assert(no_instr==-1);
		nom_attr=null;
		liste_var_local=null;
	}
	
	public void entre_instr()
	{
		assert(nom_attr!=null);
		if(no_instr<=0)
			no_instr=1;
		else
			no_instr++;
	}

	public void sort_instr()
	{
		assert(nom_attr!=null);
	}
	
	public void ajoute_var_local(CIDeclare_Var v)
	{
		assert(v!=null);
		liste_var_local.add(v);
	}
	
	public boolean var_existe(String nom)
	{
		assert(nom!=null);
		int i;
		String s;
		CINom_Attribut attr;
		if(liste_var_local!=null)
		{
			for(i=0;i<liste_var_local.size();i++)
			{
				s=((CIDeclare_Var)liste_var_local.elementAt(i)).nom;
				if(s.equalsIgnoreCase(nom))
					return true;
			}
		}
		if(classe.liste_attribut!=null&&classe.liste_attribut.length>0)
		{
			for(i=0;i<classe.liste_attribut.length;i++)
			{
				attr=classe.liste_attribut[i].nom;
				if(!attr.infix&&!attr.prefix)
				{
					if(attr.nom.equalsIgnoreCase(nom))
						return true;
				}
			}
		}
		return false;
	}
	
	public CIType var_type(String nom)
	{
		assert(nom!=null);
		int i;
		String s;
		CIDeclare_Var d;
		CINom_Attribut attr;
		if(liste_var_local!=null)
		{
			for(i=0;i<liste_var_local.size();i++)
			{
				d=(CIDeclare_Var)liste_var_local.elementAt(i);
				s=d.nom;
				if(s.equalsIgnoreCase(nom))
					return d.type;
			}
		}
		if(classe.liste_attribut!=null&&classe.liste_attribut.length>0)
		{
			for(i=0;i<classe.liste_attribut.length;i++)
			{
				attr=classe.liste_attribut[i].nom;
				if(!attr.infix&&!attr.prefix)
				{
					if(attr.nom.equalsIgnoreCase(nom))
						return classe.liste_attribut[i].retour;
				}
			}
		}
		return null;
	}
	
	public String toString()
	{
		String res;
		if(classe==null)
			res="Aucune classe";
		else
		{
			res="classe "+classe.nom.nom;
			if(nom_attr!=null)
			{
				res+=" attribut "+nom_attr.toString();
				if(no_instr>0)
					res+=" instruction no "+no_instr;
			}
		}
		return res;
	}
	
	public CIClasse classe;
	public CINom_Attribut nom_attr;
	public Vector liste_attr,liste_var_local;
	public int no_instr;
}*/
