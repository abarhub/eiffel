/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ *//*
 * Created on 20 juin 2004
 *
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
package tinyeiffel.interpreteur;

import tinyeiffel.compiler.*;
import tinyeiffel.ast.*;
import java.util.*;

/**
 * @author BARRET
 *
 * To change the template for this generated type comment go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
public class Interpreteur {static class __CLOVER_239_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}

	/**
	 * 
	 */
	public Interpreteur(Compiler_Eiffel comp) {__CLOVER_239_0.cloverRec.M[1383]++;
		assert((((comp!=null)) && (++__CLOVER_239_0.cloverRec.CT[5710]!=0|true)) || (++__CLOVER_239_0.cloverRec.CF[5710]==0&false));
		//super();
		// TODO Auto-generated constructor stub
		__CLOVER_239_0.cloverRec.S[19854]++;compiler=comp;
		__CLOVER_239_0.cloverRec.S[19855]++;nom_classe_racine=compiler.get_configuration().classe_racine();
		__CLOVER_239_0.cloverRec.S[19856]++;nom_routine_racine=compiler.get_configuration().routine_racine();
		__CLOVER_239_0.cloverRec.S[19857]++;if((((nom_routine_racine==null) && (++__CLOVER_239_0.cloverRec.CT[5711]!=0|true)) || (++__CLOVER_239_0.cloverRec.CF[5711]==0&false)))
			{__CLOVER_239_0.cloverRec.S[19858]++;nom_routine_racine="make";
		}__CLOVER_239_0.cloverRec.S[19859]++;System.out.println("Interpretation:"+nom_classe_racine+"("+nom_routine_racine+")");
		__CLOVER_239_0.cloverRec.S[19860]++;classe_racine=cherche_classe(nom_classe_racine);
		assert((((classe_racine!=null)) && (++__CLOVER_239_0.cloverRec.CT[5712]!=0|true)) || (++__CLOVER_239_0.cloverRec.CF[5712]==0&false));
		__CLOVER_239_0.cloverRec.S[19861]++;System.out.println("classe="+classe_racine.nom);
		__CLOVER_239_0.cloverRec.S[19862]++;routine_racine=cherche_feature(classe_racine,new NomFeature(nom_routine_racine));
		assert((((routine_racine!=null)) && (++__CLOVER_239_0.cloverRec.CT[5713]!=0|true)) || (++__CLOVER_239_0.cloverRec.CF[5713]==0&false));
		__CLOVER_239_0.cloverRec.S[19863]++;System.out.println("routine="+routine_racine);
		__CLOVER_239_0.cloverRec.S[19864]++;objet_racine=creer_var(classe_racine.type);
		__CLOVER_239_0.cloverRec.S[19865]++;lance_routine(objet_racine,routine_racine,new NomFeature(nom_routine_racine),null);
	}

	public Donnee lance_routine(Donnee objet,Feature f,NomFeature nf,Donnee param[])
	{__CLOVER_239_0.cloverRec.M[1384]++;
		assert((((objet!=null)) && (++__CLOVER_239_0.cloverRec.CT[5714]!=0|true)) || (++__CLOVER_239_0.cloverRec.CF[5714]==0&false));
		assert((((f!=null)) && (++__CLOVER_239_0.cloverRec.CT[5715]!=0|true)) || (++__CLOVER_239_0.cloverRec.CF[5715]==0&false));
		assert((((nf!=null)) && (++__CLOVER_239_0.cloverRec.CT[5716]!=0|true)) || (++__CLOVER_239_0.cloverRec.CF[5716]==0&false));
		__CLOVER_239_0.cloverRec.S[19866]++;Donnee d,result=null;
		__CLOVER_239_0.cloverRec.S[19867]++;Map local,param2;
		__CLOVER_239_0.cloverRec.S[19868]++;int i;
		__CLOVER_239_0.cloverRec.S[19869]++;DeclareVar dv;
		__CLOVER_239_0.cloverRec.S[19870]++;Instr instr,tab_instr[];
		__CLOVER_239_0.cloverRec.S[19871]++;if((((param==null||param.length==0) && (++__CLOVER_239_0.cloverRec.CT[5717]!=0|true)) || (++__CLOVER_239_0.cloverRec.CF[5717]==0&false)))
		{{
			__CLOVER_239_0.cloverRec.S[19872]++;param2=null;
			assert((((f.param==null||f.param.length==0)) && (++__CLOVER_239_0.cloverRec.CT[5718]!=0|true)) || (++__CLOVER_239_0.cloverRec.CF[5718]==0&false));
		}
		}else
		{{
			assert((((f.param!=null)) && (++__CLOVER_239_0.cloverRec.CT[5719]!=0|true)) || (++__CLOVER_239_0.cloverRec.CF[5719]==0&false));
			assert((((f.param.length==param.length)) && (++__CLOVER_239_0.cloverRec.CT[5720]!=0|true)) || (++__CLOVER_239_0.cloverRec.CF[5720]==0&false));
			__CLOVER_239_0.cloverRec.S[19873]++;param2=new HashMap();
			__CLOVER_239_0.cloverRec.S[19874]++;for(i=0;(((i<param.length) && (++__CLOVER_239_0.cloverRec.CT[5721]!=0|true)) || (++__CLOVER_239_0.cloverRec.CF[5721]==0&false));i++)
			{{
				__CLOVER_239_0.cloverRec.S[19875]++;dv=f.param[i];
				__CLOVER_239_0.cloverRec.S[19876]++;param2.put(dv.nom,param[i]);
			}
		}}
		}__CLOVER_239_0.cloverRec.S[19877]++;derniere_frame=new Frame(objet.nom_classe,nf,
			this,derniere_frame,param2,objet);
		__CLOVER_239_0.cloverRec.S[19878]++;if((((f instanceof FeatureRoutine) && (++__CLOVER_239_0.cloverRec.CT[5722]!=0|true)) || (++__CLOVER_239_0.cloverRec.CF[5722]==0&false)))
		{{
			__CLOVER_239_0.cloverRec.S[19879]++;FeatureRoutine f2=(FeatureRoutine)f;
			__CLOVER_239_0.cloverRec.S[19880]++;Couple c;
			__CLOVER_239_0.cloverRec.S[19881]++;derniere_frame.set_local(f2);
			__CLOVER_239_0.cloverRec.S[19882]++;tab_instr=f2.liste_instr;
			__CLOVER_239_0.cloverRec.S[19883]++;if((((tab_instr!=null) && (++__CLOVER_239_0.cloverRec.CT[5723]!=0|true)) || (++__CLOVER_239_0.cloverRec.CF[5723]==0&false)))
			{{
				__CLOVER_239_0.cloverRec.S[19884]++;for(i=0;(((i<tab_instr.length) && (++__CLOVER_239_0.cloverRec.CT[5724]!=0|true)) || (++__CLOVER_239_0.cloverRec.CF[5724]==0&false));i++)
				{{
					__CLOVER_239_0.cloverRec.S[19885]++;instr=tab_instr[i];
					__CLOVER_239_0.cloverRec.S[19886]++;if((((instr instanceof Instr_Affect) && (++__CLOVER_239_0.cloverRec.CT[5725]!=0|true)) || (++__CLOVER_239_0.cloverRec.CF[5725]==0&false)))
					{{
						__CLOVER_239_0.cloverRec.S[19887]++;Instr_Affect instr2=(Instr_Affect)instr;
			
						__CLOVER_239_0.cloverRec.S[19888]++;c=evalue(instr2.expr);
						assert((((c!=null)) && (++__CLOVER_239_0.cloverRec.CT[5726]!=0|true)) || (++__CLOVER_239_0.cloverRec.CF[5726]==0&false));
						__CLOVER_239_0.cloverRec.S[19889]++;d=c.donnee;
						//if(d!=null)
						__CLOVER_239_0.cloverRec.S[19890]++;derniere_frame.set_var(instr2.nom,d);
						__CLOVER_239_0.cloverRec.S[19891]++;System.out.println("affect:"+instr2.nom+":="+d);
					}
					}else {__CLOVER_239_0.cloverRec.S[19892]++;if((((instr instanceof Instr_Appel) && (++__CLOVER_239_0.cloverRec.CT[5727]!=0|true)) || (++__CLOVER_239_0.cloverRec.CF[5727]==0&false)))
					{{
						__CLOVER_239_0.cloverRec.S[19893]++;Instr_Appel instr2=(Instr_Appel)instr;
						__CLOVER_239_0.cloverRec.S[19894]++;Donnee resultat=derniere_frame.objet_courant;
						__CLOVER_239_0.cloverRec.S[19895]++;while((((instr2!=null) && (++__CLOVER_239_0.cloverRec.CT[5728]!=0|true)) || (++__CLOVER_239_0.cloverRec.CF[5728]==0&false)))
						{{
							__CLOVER_239_0.cloverRec.S[19896]++;if((((instr2.nom!=null) && (++__CLOVER_239_0.cloverRec.CT[5729]!=0|true)) || (++__CLOVER_239_0.cloverRec.CF[5729]==0&false)))
							{{
								__CLOVER_239_0.cloverRec.S[19897]++;NomFeature nf2;
								__CLOVER_239_0.cloverRec.S[19898]++;Feature f3;
								__CLOVER_239_0.cloverRec.S[19899]++;nf2=new NomFeature(instr2.nom);
								__CLOVER_239_0.cloverRec.S[19900]++;Classe cl=cherche_classe(resultat.nom_classe);
								__CLOVER_239_0.cloverRec.S[19901]++;f3=cherche_feature(cl,nf2);
								__CLOVER_239_0.cloverRec.S[19902]++;if((((f3==null||(f3 instanceof FeatureAttr||
									f3 instanceof FeatureExpr||
									f3 instanceof FeatureUnique)) && (++__CLOVER_239_0.cloverRec.CT[5730]!=0|true)) || (++__CLOVER_239_0.cloverRec.CF[5730]==0&false)))
								{{
									__CLOVER_239_0.cloverRec.S[19903]++;resultat=derniere_frame.get_var(instr2.nom);
								}
								}else {__CLOVER_239_0.cloverRec.S[19904]++;if((((f3 instanceof FeatureRoutine||
										f3 instanceof FeatureExternal) && (++__CLOVER_239_0.cloverRec.CT[5731]!=0|true)) || (++__CLOVER_239_0.cloverRec.CF[5731]==0&false)))
								{{
									__CLOVER_239_0.cloverRec.S[19905]++;resultat=appel_routine(resultat,f3,nf2,instr2.parametre);
								}
								}else
								{{
									assert((((false)) && (++__CLOVER_239_0.cloverRec.CT[5732]!=0|true)) || (++__CLOVER_239_0.cloverRec.CF[5732]==0&false));
								}
							}}}
							}else
							{{
								assert((((instr2.expr!=null)) && (++__CLOVER_239_0.cloverRec.CT[5733]!=0|true)) || (++__CLOVER_239_0.cloverRec.CF[5733]==0&false));
								__CLOVER_239_0.cloverRec.S[19906]++;c=evalue(instr2.expr);
								assert((((c!=null)) && (++__CLOVER_239_0.cloverRec.CT[5734]!=0|true)) || (++__CLOVER_239_0.cloverRec.CF[5734]==0&false));
								__CLOVER_239_0.cloverRec.S[19907]++;resultat=c.donnee;
							}
							}__CLOVER_239_0.cloverRec.S[19908]++;instr2=(Instr_Appel)instr2.getSuivant();
						}
					}}
					}else {__CLOVER_239_0.cloverRec.S[19909]++;if((((instr instanceof Instr_Creation) && (++__CLOVER_239_0.cloverRec.CT[5735]!=0|true)) || (++__CLOVER_239_0.cloverRec.CF[5735]==0&false)))
					{{
						__CLOVER_239_0.cloverRec.S[19910]++;Instr_Creation instr2=(Instr_Creation)instr;
						__CLOVER_239_0.cloverRec.S[19911]++;Type t;
						
						__CLOVER_239_0.cloverRec.S[19912]++;t=instr2.type;
						assert((((t!=null)) && (++__CLOVER_239_0.cloverRec.CT[5736]!=0|true)) || (++__CLOVER_239_0.cloverRec.CF[5736]==0&false));
						__CLOVER_239_0.cloverRec.S[19913]++;d=creer_var(t);
						//if(d!=null)
						__CLOVER_239_0.cloverRec.S[19914]++;derniere_frame.set_var(instr2.nom,d);
						__CLOVER_239_0.cloverRec.S[19915]++;System.out.println("creation:!"+t+"!"+instr2.nom);
						__CLOVER_239_0.cloverRec.S[19916]++;if((((instr2.nom2!=null) && (++__CLOVER_239_0.cloverRec.CT[5737]!=0|true)) || (++__CLOVER_239_0.cloverRec.CF[5737]==0&false)))
						{{
							__CLOVER_239_0.cloverRec.S[19917]++;NomFeature nf2;
							__CLOVER_239_0.cloverRec.S[19918]++;Feature f3;
							__CLOVER_239_0.cloverRec.S[19919]++;System.out.println("nom2="+instr2.nom2);
							__CLOVER_239_0.cloverRec.S[19920]++;nf2=new NomFeature(instr2.nom2);
							__CLOVER_239_0.cloverRec.S[19921]++;Classe cl=cherche_classe(d.nom_classe);
							__CLOVER_239_0.cloverRec.S[19922]++;f3=cherche_feature(cl,nf2);
							__CLOVER_239_0.cloverRec.S[19923]++;appel_routine(d,f3,nf2,instr2.parametre);
							__CLOVER_239_0.cloverRec.S[19924]++;System.out.println("Appel "+instr2.nom2);
						}
					}}
					}else
					{{
			
					}
				}}}}
			}}
		}}
		}else {__CLOVER_239_0.cloverRec.S[19925]++;if((((f instanceof FeatureExternal) && (++__CLOVER_239_0.cloverRec.CT[5738]!=0|true)) || (++__CLOVER_239_0.cloverRec.CF[5738]==0&false)))
		{{
			__CLOVER_239_0.cloverRec.S[19926]++;FeatureExternal f2=(FeatureExternal)f;
			__CLOVER_239_0.cloverRec.S[19927]++;if((((f2.str.chaine_unique().equalsIgnoreCase("\"tinyeiffel\"")) && (++__CLOVER_239_0.cloverRec.CT[5739]!=0|true)) || (++__CLOVER_239_0.cloverRec.CF[5739]==0&false)))
			{{
				//if(objet.nom_classe.equalsIgnoreCase("integer"))
				{
					//if(nf.infix&&nf.nom2.chaine_unique().equalsIgnoreCase("\"+\""))
					//d2=evalue(expr2.expr2);
					//res=((Donnee_Int)d1).ajoute((Donnee_Int)d2);
					__CLOVER_239_0.cloverRec.S[19928]++;result=objet.fonction_externe(nf,param);
				}
			}
			}else
			{{
				assert((((false)) && (++__CLOVER_239_0.cloverRec.CT[5740]!=0|true)) || (++__CLOVER_239_0.cloverRec.CF[5740]==0&false)):"extr:"+f2.str.chaine_unique();
			}
		}}
		}else
		{{
			assert((((false)) && (++__CLOVER_239_0.cloverRec.CT[5741]!=0|true)) || (++__CLOVER_239_0.cloverRec.CF[5741]==0&false));
		}
		}}__CLOVER_239_0.cloverRec.S[19929]++;derniere_frame=derniere_frame.precedant;
		__CLOVER_239_0.cloverRec.S[19930]++;return result;
	}

	public Donnee appel_routine(Donnee objet,Feature f,NomFeature nf,Expr param[])
	{__CLOVER_239_0.cloverRec.M[1385]++;
		assert((((f!=null)) && (++__CLOVER_239_0.cloverRec.CT[5742]!=0|true)) || (++__CLOVER_239_0.cloverRec.CF[5742]==0&false));
		assert((((f instanceof FeatureRoutine||
				f instanceof FeatureExternal)) && (++__CLOVER_239_0.cloverRec.CT[5743]!=0|true)) || (++__CLOVER_239_0.cloverRec.CF[5743]==0&false));
		__CLOVER_239_0.cloverRec.S[19931]++;Donnee param3[],resultat;
		__CLOVER_239_0.cloverRec.S[19932]++;Couple c;
		__CLOVER_239_0.cloverRec.S[19933]++;if((((param==null||param.length==0) && (++__CLOVER_239_0.cloverRec.CT[5744]!=0|true)) || (++__CLOVER_239_0.cloverRec.CF[5744]==0&false)))
		{{
			__CLOVER_239_0.cloverRec.S[19934]++;param3=null;
		}
		}else
		{{
			__CLOVER_239_0.cloverRec.S[19935]++;param3=new Donnee[param.length];
			__CLOVER_239_0.cloverRec.S[19936]++;for(int j=0;(((j<param.length) && (++__CLOVER_239_0.cloverRec.CT[5745]!=0|true)) || (++__CLOVER_239_0.cloverRec.CF[5745]==0&false));j++)
			{{
				__CLOVER_239_0.cloverRec.S[19937]++;c=evalue(param[j]);
				assert((((c!=null)) && (++__CLOVER_239_0.cloverRec.CT[5746]!=0|true)) || (++__CLOVER_239_0.cloverRec.CF[5746]==0&false));
				__CLOVER_239_0.cloverRec.S[19938]++;param3[j]=c.donnee;
			}
		}}
		}__CLOVER_239_0.cloverRec.S[19939]++;resultat=lance_routine(objet,f,nf,param3);
		__CLOVER_239_0.cloverRec.S[19940]++;return resultat;
	}

	public Couple evalue(Expr expr)
	{__CLOVER_239_0.cloverRec.M[1386]++;
		assert((((expr!=null)) && (++__CLOVER_239_0.cloverRec.CT[5747]!=0|true)) || (++__CLOVER_239_0.cloverRec.CF[5747]==0&false));
		__CLOVER_239_0.cloverRec.S[19941]++;Donnee d;
		__CLOVER_239_0.cloverRec.S[19942]++;Couple res=null;
		__CLOVER_239_0.cloverRec.S[19943]++;if((((expr instanceof Expr_Entier) && (++__CLOVER_239_0.cloverRec.CT[5748]!=0|true)) || (++__CLOVER_239_0.cloverRec.CF[5748]==0&false)))
		{{
			__CLOVER_239_0.cloverRec.S[19944]++;Expr_Entier expr2=(Expr_Entier)expr;
			__CLOVER_239_0.cloverRec.S[19945]++;int n=0;
			__CLOVER_239_0.cloverRec.S[19946]++;try{
				__CLOVER_239_0.cloverRec.S[19947]++;n=Integer.parseInt(expr2.str);
			}
			catch(NumberFormatException e)
			{
				__CLOVER_239_0.cloverRec.S[19948]++;System.out.println("Erreur de format entier:"+e);
				//e.printStackTrace();
				assert((((false)) && (++__CLOVER_239_0.cloverRec.CT[5749]!=0|true)) || (++__CLOVER_239_0.cloverRec.CF[5749]==0&false));
			}
			__CLOVER_239_0.cloverRec.S[19949]++;d=new Donnee_Int();
			__CLOVER_239_0.cloverRec.S[19950]++;((Donnee_Int)d).valeur=n;
			__CLOVER_239_0.cloverRec.S[19951]++;res=new Couple(d,new TypeSimple(false,"integer",null));
		}
		}else {__CLOVER_239_0.cloverRec.S[19952]++;if((((expr instanceof Expr_Var) && (++__CLOVER_239_0.cloverRec.CT[5750]!=0|true)) || (++__CLOVER_239_0.cloverRec.CF[5750]==0&false)))
		{{
			__CLOVER_239_0.cloverRec.S[19953]++;Expr_Var expr2=(Expr_Var)expr;
			__CLOVER_239_0.cloverRec.S[19954]++;Donnee d2=derniere_frame.get_var(expr2.nom);
			assert((((d2!=null)) && (++__CLOVER_239_0.cloverRec.CT[5751]!=0|true)) || (++__CLOVER_239_0.cloverRec.CF[5751]==0&false)):"var="+expr2.nom+"("+expr2.debut()+")";
			__CLOVER_239_0.cloverRec.S[19955]++;res=new Couple(d2,new TypeSimple(false,"Any",null));
			assert((((res!=null)) && (++__CLOVER_239_0.cloverRec.CT[5752]!=0|true)) || (++__CLOVER_239_0.cloverRec.CF[5752]==0&false));
		}
		}else {__CLOVER_239_0.cloverRec.S[19956]++;if((((expr instanceof Expr_Vrai) && (++__CLOVER_239_0.cloverRec.CT[5753]!=0|true)) || (++__CLOVER_239_0.cloverRec.CF[5753]==0&false)))
		{{
			__CLOVER_239_0.cloverRec.S[19957]++;Donnee_Boolean e=new Donnee_Boolean();
			__CLOVER_239_0.cloverRec.S[19958]++;e.valeur=true;
			__CLOVER_239_0.cloverRec.S[19959]++;res=new Couple(e,new TypeSimple(false,"BOOLEAN",null));
			assert((((res!=null)) && (++__CLOVER_239_0.cloverRec.CT[5754]!=0|true)) || (++__CLOVER_239_0.cloverRec.CF[5754]==0&false));
		}
		}else {__CLOVER_239_0.cloverRec.S[19960]++;if((((expr instanceof Expr_Faux) && (++__CLOVER_239_0.cloverRec.CT[5755]!=0|true)) || (++__CLOVER_239_0.cloverRec.CF[5755]==0&false)))
		{{
			__CLOVER_239_0.cloverRec.S[19961]++;Donnee_Boolean e=new Donnee_Boolean();
			__CLOVER_239_0.cloverRec.S[19962]++;res=new Couple(e,new TypeSimple(false,"BOOLEAN",null));
			assert((((res!=null)) && (++__CLOVER_239_0.cloverRec.CT[5756]!=0|true)) || (++__CLOVER_239_0.cloverRec.CF[5756]==0&false));
		}
		}else {__CLOVER_239_0.cloverRec.S[19963]++;if((((expr instanceof Expr_Binaire) && (++__CLOVER_239_0.cloverRec.CT[5757]!=0|true)) || (++__CLOVER_239_0.cloverRec.CF[5757]==0&false)))
		{{
			__CLOVER_239_0.cloverRec.S[19964]++;Expr_Binaire expr2=(Expr_Binaire)expr;
			__CLOVER_239_0.cloverRec.S[19965]++;Donnee d1,d2;
			__CLOVER_239_0.cloverRec.S[19966]++;Couple c1,c2;
			__CLOVER_239_0.cloverRec.S[19967]++;boolean __CLOVER_bool0=false;switch(expr2.op)
			{
				case Expr.Plus:if (!__CLOVER_bool0) {__CLOVER_239_0.cloverRec.S[19968]++;__CLOVER_bool0=true;}
					__CLOVER_239_0.cloverRec.S[19969]++;c1=evalue(expr2.expr1);
					__CLOVER_239_0.cloverRec.S[19970]++;d1=c1.donnee;
					__CLOVER_239_0.cloverRec.S[19971]++;c2=evalue(expr2.expr2);
					__CLOVER_239_0.cloverRec.S[19972]++;d2=c2.donnee;
					{
						__CLOVER_239_0.cloverRec.S[19973]++;Feature f;
						__CLOVER_239_0.cloverRec.S[19974]++;Donnee p[]={d2};
						__CLOVER_239_0.cloverRec.S[19975]++;NomFeature nf;
						__CLOVER_239_0.cloverRec.S[19976]++;Classe cl;
						__CLOVER_239_0.cloverRec.S[19977]++;nf=expr2.donne_nom_feature();
						__CLOVER_239_0.cloverRec.S[19978]++;nf=trouve_nom_feature(c1.type,c2.type,nf);
						__CLOVER_239_0.cloverRec.S[19979]++;cl=cherche_classe(d1.nom_classe);
						__CLOVER_239_0.cloverRec.S[19980]++;f=cherche_feature(cl,nf);
						//res=((Donnee_Int)d1).ajoute((Donnee_Int)d2);
						__CLOVER_239_0.cloverRec.S[19981]++;d1=this.lance_routine(d1,f,nf,p);
						__CLOVER_239_0.cloverRec.S[19982]++;res=new Couple(d1,f.type_retour);
					}
					__CLOVER_239_0.cloverRec.S[19983]++;break;
				default:if (!__CLOVER_bool0) {__CLOVER_239_0.cloverRec.S[19984]++;__CLOVER_bool0=true;}
					assert((((false)) && (++__CLOVER_239_0.cloverRec.CT[5758]!=0|true)) || (++__CLOVER_239_0.cloverRec.CF[5758]==0&false));
			}
			assert((((res!=null)) && (++__CLOVER_239_0.cloverRec.CT[5759]!=0|true)) || (++__CLOVER_239_0.cloverRec.CF[5759]==0&false));
		}
		}else
		{{
			
		}
		}}}}}__CLOVER_239_0.cloverRec.S[19985]++;return res;
	}

	public NomFeature trouve_nom_feature(Type t1,Type t2,NomFeature nf)
	{__CLOVER_239_0.cloverRec.M[1387]++;
		assert((((t1!=null)) && (++__CLOVER_239_0.cloverRec.CT[5760]!=0|true)) || (++__CLOVER_239_0.cloverRec.CF[5760]==0&false));
		assert((((t2!=null)) && (++__CLOVER_239_0.cloverRec.CT[5761]!=0|true)) || (++__CLOVER_239_0.cloverRec.CF[5761]==0&false));
		assert((((nf!=null)) && (++__CLOVER_239_0.cloverRec.CT[5762]!=0|true)) || (++__CLOVER_239_0.cloverRec.CF[5762]==0&false));
		__CLOVER_239_0.cloverRec.S[19986]++;Table_Symbol table,table2;
		//Attribut_Complet ac;
		__CLOVER_239_0.cloverRec.S[19987]++;NomFeature res=null,n2;
		__CLOVER_239_0.cloverRec.S[19988]++;boolean h1[],h2[];
		__CLOVER_239_0.cloverRec.S[19989]++;int i,j,no1,no2,n;
		__CLOVER_239_0.cloverRec.S[19990]++;Classe cl,cl2;
		__CLOVER_239_0.cloverRec.S[19991]++;Heritage h;
		
		__CLOVER_239_0.cloverRec.S[19992]++;table=compiler.context.donne_table_symbol(t1);
		assert((((table!=null)) && (++__CLOVER_239_0.cloverRec.CT[5763]!=0|true)) || (++__CLOVER_239_0.cloverRec.CF[5763]==0&false));
		//ac=table.donne_attribut(nf);
		//assert(ac!=null):"nf="+nf;
		__CLOVER_239_0.cloverRec.S[19993]++;h1=new boolean[compiler.liste_classe.size()];
		__CLOVER_239_0.cloverRec.S[19994]++;h2=new boolean[compiler.liste_classe.size()];
		__CLOVER_239_0.cloverRec.S[19995]++;no1=compiler.context.no_classe(compiler.context.cherche_classe(t1));
		__CLOVER_239_0.cloverRec.S[19996]++;no2=compiler.context.no_classe(compiler.context.cherche_classe(t2));
		__CLOVER_239_0.cloverRec.S[19997]++;for(i=0;(((i<compiler.liste_classe.size()) && (++__CLOVER_239_0.cloverRec.CT[5764]!=0|true)) || (++__CLOVER_239_0.cloverRec.CF[5764]==0&false));i++)
		{{
			__CLOVER_239_0.cloverRec.S[19998]++;if((((compiler.context.table_heritage[i][no1]&&compiler.context.table_heritage[no2][i]) && (++__CLOVER_239_0.cloverRec.CT[5765]!=0|true)) || (++__CLOVER_239_0.cloverRec.CF[5765]==0&false)))
				{__CLOVER_239_0.cloverRec.S[19999]++;h1[i]=true;
			}else
				{__CLOVER_239_0.cloverRec.S[20000]++;h1[i]=false;
		}}
		}__CLOVER_239_0.cloverRec.S[20001]++;n=no1;
		__CLOVER_239_0.cloverRec.S[20002]++;res=nf;
		__CLOVER_239_0.cloverRec.S[20003]++;for(i=0;(((i<compiler.liste_classe.size()) && (++__CLOVER_239_0.cloverRec.CT[5766]!=0|true)) || (++__CLOVER_239_0.cloverRec.CF[5766]==0&false));i++)
		{{
			__CLOVER_239_0.cloverRec.S[20004]++;cl2=(Classe)compiler.liste_classe.elementAt(i);
			__CLOVER_239_0.cloverRec.S[20005]++;for(j=0;(((j<compiler.liste_classe.size()) && (++__CLOVER_239_0.cloverRec.CT[5767]!=0|true)) || (++__CLOVER_239_0.cloverRec.CF[5767]==0&false));j++)
			{{
				__CLOVER_239_0.cloverRec.S[20006]++;if((((compiler.context.table_heritage[n][j]) && (++__CLOVER_239_0.cloverRec.CT[5768]!=0|true)) || (++__CLOVER_239_0.cloverRec.CF[5768]==0&false)))
					{__CLOVER_239_0.cloverRec.S[20007]++;break;
			}}
			}__CLOVER_239_0.cloverRec.S[20008]++;if((((j>=compiler.liste_classe.size()) && (++__CLOVER_239_0.cloverRec.CT[5769]!=0|true)) || (++__CLOVER_239_0.cloverRec.CF[5769]==0&false)))
			// trouve
				{__CLOVER_239_0.cloverRec.S[20009]++;break;
			}__CLOVER_239_0.cloverRec.S[20010]++;cl=(Classe)compiler.liste_classe.elementAt(j);
			// la classe d'indice j est descendante directe de n
			__CLOVER_239_0.cloverRec.S[20011]++;table2=compiler.context.donne_table_symbol(cl);
			assert((((table2!=null)) && (++__CLOVER_239_0.cloverRec.CT[5770]!=0|true)) || (++__CLOVER_239_0.cloverRec.CF[5770]==0&false));
			// TODO: faire un renomage suivant l'heritage
			__CLOVER_239_0.cloverRec.S[20012]++;if((((cl.heritage!=null&&cl.heritage.length>0) && (++__CLOVER_239_0.cloverRec.CT[5771]!=0|true)) || (++__CLOVER_239_0.cloverRec.CF[5771]==0&false)))
			{{
				__CLOVER_239_0.cloverRec.S[20013]++;h=null;
				__CLOVER_239_0.cloverRec.S[20014]++;for(int k=0;(((k<cl.heritage.length) && (++__CLOVER_239_0.cloverRec.CT[5772]!=0|true)) || (++__CLOVER_239_0.cloverRec.CF[5772]==0&false));k++)
				{{
					__CLOVER_239_0.cloverRec.S[20015]++;h=cl.heritage[k];
					__CLOVER_239_0.cloverRec.S[20016]++;if((((h.type.nom!=null&&
						h.type.nom.equalsIgnoreCase(cl.nom)) && (++__CLOVER_239_0.cloverRec.CT[5773]!=0|true)) || (++__CLOVER_239_0.cloverRec.CF[5773]==0&false)))
					{{
						__CLOVER_239_0.cloverRec.S[20017]++;break;
					}
					}__CLOVER_239_0.cloverRec.S[20018]++;h=null;
				}
				}__CLOVER_239_0.cloverRec.S[20019]++;if((((h!=null) && (++__CLOVER_239_0.cloverRec.CT[5774]!=0|true)) || (++__CLOVER_239_0.cloverRec.CF[5774]==0&false)))
				{{
					__CLOVER_239_0.cloverRec.S[20020]++;if((((h.rename!=null&&h.rename.length>0) && (++__CLOVER_239_0.cloverRec.CT[5775]!=0|true)) || (++__CLOVER_239_0.cloverRec.CF[5775]==0&false)))
					{{
						__CLOVER_239_0.cloverRec.S[20021]++;for(int k=0;(((k<h.rename.length) && (++__CLOVER_239_0.cloverRec.CT[5776]!=0|true)) || (++__CLOVER_239_0.cloverRec.CF[5776]==0&false));k++)
						{{
							__CLOVER_239_0.cloverRec.S[20022]++;if((((h.rename[k].nom_src.meme_nom(res)) && (++__CLOVER_239_0.cloverRec.CT[5777]!=0|true)) || (++__CLOVER_239_0.cloverRec.CF[5777]==0&false)))
							{{
								__CLOVER_239_0.cloverRec.S[20023]++;res=h.rename[k].nom_dest;
								__CLOVER_239_0.cloverRec.S[20024]++;break;
							}
						}}
					}}
				}}
			}}
			//ac=table.donne_attribut(res);
			//res=ac.
			}__CLOVER_239_0.cloverRec.S[20025]++;n=j;
		}
		}__CLOVER_239_0.cloverRec.S[20026]++;return res;
	}

	public Donnee defaut_var(Type t)
	{__CLOVER_239_0.cloverRec.M[1388]++;
		assert((((t!=null)) && (++__CLOVER_239_0.cloverRec.CT[5778]!=0|true)) || (++__CLOVER_239_0.cloverRec.CF[5778]==0&false));
		__CLOVER_239_0.cloverRec.S[20027]++;if((((t.nom.equalsIgnoreCase("integer")) && (++__CLOVER_239_0.cloverRec.CT[5779]!=0|true)) || (++__CLOVER_239_0.cloverRec.CF[5779]==0&false)))
		{{
			__CLOVER_239_0.cloverRec.S[20028]++;Donnee_Int d=new Donnee_Int();
			__CLOVER_239_0.cloverRec.S[20029]++;d.set(0);
			__CLOVER_239_0.cloverRec.S[20030]++;return d;
		}
		}else {__CLOVER_239_0.cloverRec.S[20031]++;if((((t.nom.equalsIgnoreCase("boolean")) && (++__CLOVER_239_0.cloverRec.CT[5780]!=0|true)) || (++__CLOVER_239_0.cloverRec.CF[5780]==0&false)))
		{{
			__CLOVER_239_0.cloverRec.S[20032]++;Donnee_Boolean d=new Donnee_Boolean();
			__CLOVER_239_0.cloverRec.S[20033]++;d.valeur=false;
			__CLOVER_239_0.cloverRec.S[20034]++;return d;
		}
		}else
		{{
			__CLOVER_239_0.cloverRec.S[20035]++;return null;
		}
		
	}}}

	public Donnee creer_var(Type t)
	{__CLOVER_239_0.cloverRec.M[1389]++;
		assert((((t!=null)) && (++__CLOVER_239_0.cloverRec.CT[5781]!=0|true)) || (++__CLOVER_239_0.cloverRec.CF[5781]==0&false));
		__CLOVER_239_0.cloverRec.S[20036]++;Donnee d;
		__CLOVER_239_0.cloverRec.S[20037]++;if((((t.nom.equalsIgnoreCase("integer")) && (++__CLOVER_239_0.cloverRec.CT[5782]!=0|true)) || (++__CLOVER_239_0.cloverRec.CF[5782]==0&false)))
			{__CLOVER_239_0.cloverRec.S[20038]++;d=new Donnee_Int();
		}else {__CLOVER_239_0.cloverRec.S[20039]++;if((((t.nom.equalsIgnoreCase("boolean")) && (++__CLOVER_239_0.cloverRec.CT[5783]!=0|true)) || (++__CLOVER_239_0.cloverRec.CF[5783]==0&false)))
			{__CLOVER_239_0.cloverRec.S[20040]++;d=new Donnee_Boolean();
		}else
		{{
			__CLOVER_239_0.cloverRec.S[20041]++;Table_Symbol table;
			__CLOVER_239_0.cloverRec.S[20042]++;Attribut_Complet ac;
			__CLOVER_239_0.cloverRec.S[20043]++;table=compiler.context.donne_table_symbol(t);
			assert((((table!=null)) && (++__CLOVER_239_0.cloverRec.CT[5784]!=0|true)) || (++__CLOVER_239_0.cloverRec.CF[5784]==0&false));
			__CLOVER_239_0.cloverRec.S[20044]++;d=new Donnee_Std(t.nom,est_expanded(t));
			__CLOVER_239_0.cloverRec.S[20045]++;for(int i=0;(((i<table.liste_attribut.length) && (++__CLOVER_239_0.cloverRec.CT[5785]!=0|true)) || (++__CLOVER_239_0.cloverRec.CF[5785]==0&false));i++)
			{{
				__CLOVER_239_0.cloverRec.S[20046]++;ac=table.liste_attribut[i];
				__CLOVER_239_0.cloverRec.S[20047]++;if((((!ac.est_deferred()) && (++__CLOVER_239_0.cloverRec.CT[5786]!=0|true)) || (++__CLOVER_239_0.cloverRec.CF[5786]==0&false)))
				{{
					__CLOVER_239_0.cloverRec.S[20048]++;Feature f=ac.getFeature();
					__CLOVER_239_0.cloverRec.S[20049]++;if((((f!=null&&(f instanceof FeatureAttr)) && (++__CLOVER_239_0.cloverRec.CT[5787]!=0|true)) || (++__CLOVER_239_0.cloverRec.CF[5787]==0&false)))
					{{
						__CLOVER_239_0.cloverRec.S[20050]++;String nom=ac.nom.nom;
						__CLOVER_239_0.cloverRec.S[20051]++;Donnee d3=defaut_var(f.type_retour);
						__CLOVER_239_0.cloverRec.S[20052]++;d.add(nom,d3);
					}
				}}
			}}
		}}
		}}__CLOVER_239_0.cloverRec.S[20053]++;return d;
	}

	public Classe cherche_classe(String nom)
	{__CLOVER_239_0.cloverRec.M[1390]++;
		assert((((nom!=null)) && (++__CLOVER_239_0.cloverRec.CT[5788]!=0|true)) || (++__CLOVER_239_0.cloverRec.CF[5788]==0&false));
		__CLOVER_239_0.cloverRec.S[20054]++;String nom_classe,tmp;
		__CLOVER_239_0.cloverRec.S[20055]++;Vector v;
		__CLOVER_239_0.cloverRec.S[20056]++;Classe cl;
		__CLOVER_239_0.cloverRec.S[20057]++;int i;
		__CLOVER_239_0.cloverRec.S[20058]++;v=compiler.liste_classe;
		__CLOVER_239_0.cloverRec.S[20059]++;if((((v!=null) && (++__CLOVER_239_0.cloverRec.CT[5789]!=0|true)) || (++__CLOVER_239_0.cloverRec.CF[5789]==0&false)))
		{{
			__CLOVER_239_0.cloverRec.S[20060]++;for(i=0;(((i<v.size()) && (++__CLOVER_239_0.cloverRec.CT[5790]!=0|true)) || (++__CLOVER_239_0.cloverRec.CF[5790]==0&false));i++)
			{{
				__CLOVER_239_0.cloverRec.S[20061]++;cl=((Classe)v.elementAt(i));
				__CLOVER_239_0.cloverRec.S[20062]++;if((((nom.equalsIgnoreCase(cl.nom)) && (++__CLOVER_239_0.cloverRec.CT[5791]!=0|true)) || (++__CLOVER_239_0.cloverRec.CF[5791]==0&false)))
				{{
					__CLOVER_239_0.cloverRec.S[20063]++;return cl;
				}
			}}
		}}
		}__CLOVER_239_0.cloverRec.S[20064]++;return null;
	}

	public Feature cherche_feature(Classe cl,NomFeature nom)
	{__CLOVER_239_0.cloverRec.M[1391]++;
		assert((((cl!=null)) && (++__CLOVER_239_0.cloverRec.CT[5792]!=0|true)) || (++__CLOVER_239_0.cloverRec.CF[5792]==0&false));
		assert((((nom!=null)) && (++__CLOVER_239_0.cloverRec.CT[5793]!=0|true)) || (++__CLOVER_239_0.cloverRec.CF[5793]==0&false));
		__CLOVER_239_0.cloverRec.S[20065]++;int i;
		__CLOVER_239_0.cloverRec.S[20066]++;Table_Symbol table;
		__CLOVER_239_0.cloverRec.S[20067]++;Attribut_Complet ac;
		__CLOVER_239_0.cloverRec.S[20068]++;Feature f;
		__CLOVER_239_0.cloverRec.S[20069]++;table=compiler.context.donne_table_symbol(cl);
		assert((((table!=null)) && (++__CLOVER_239_0.cloverRec.CT[5794]!=0|true)) || (++__CLOVER_239_0.cloverRec.CF[5794]==0&false));
		__CLOVER_239_0.cloverRec.S[20070]++;ac=table.donne_attribut(nom);
		__CLOVER_239_0.cloverRec.S[20071]++;if((((ac==null) && (++__CLOVER_239_0.cloverRec.CT[5795]!=0|true)) || (++__CLOVER_239_0.cloverRec.CF[5795]==0&false)))
			{__CLOVER_239_0.cloverRec.S[20072]++;return null;
		}assert((((ac!=null)) && (++__CLOVER_239_0.cloverRec.CT[5796]!=0|true)) || (++__CLOVER_239_0.cloverRec.CF[5796]==0&false)):"nom="+nom+";classe="+cl.nom;
		__CLOVER_239_0.cloverRec.S[20073]++;f=ac.getFeature();
		assert((((f!=null)) && (++__CLOVER_239_0.cloverRec.CT[5797]!=0|true)) || (++__CLOVER_239_0.cloverRec.CF[5797]==0&false));
		__CLOVER_239_0.cloverRec.S[20074]++;return f;
	}

	public boolean est_expanded(Type t)
	{__CLOVER_239_0.cloverRec.M[1392]++;
		assert((((t!=null)) && (++__CLOVER_239_0.cloverRec.CT[5798]!=0|true)) || (++__CLOVER_239_0.cloverRec.CF[5798]==0&false));
		__CLOVER_239_0.cloverRec.S[20075]++;Classe cl;
		
		__CLOVER_239_0.cloverRec.S[20076]++;if((((t.expanded) && (++__CLOVER_239_0.cloverRec.CT[5799]!=0|true)) || (++__CLOVER_239_0.cloverRec.CF[5799]==0&false)))
			{__CLOVER_239_0.cloverRec.S[20077]++;return true;
		}__CLOVER_239_0.cloverRec.S[20078]++;cl=cherche_classe(t.nom);
		__CLOVER_239_0.cloverRec.S[20079]++;if((((cl!=null) && (++__CLOVER_239_0.cloverRec.CT[5800]!=0|true)) || (++__CLOVER_239_0.cloverRec.CF[5800]==0&false)))
		{{
			__CLOVER_239_0.cloverRec.S[20080]++;if((((cl.type.expanded) && (++__CLOVER_239_0.cloverRec.CT[5801]!=0|true)) || (++__CLOVER_239_0.cloverRec.CF[5801]==0&false)))
				{__CLOVER_239_0.cloverRec.S[20081]++;return true;
		}}
		}__CLOVER_239_0.cloverRec.S[20082]++;return false;
	}

	public String nom_classe_racine,nom_routine_racine;
	public Compiler_Eiffel compiler;
	public Classe classe_racine;
	public Feature routine_racine;
	public Frame derniere_frame;
	public Donnee objet_racine;
}
