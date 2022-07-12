/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ *//*
 * Created on 23 avr. 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package tinyeiffel.verification;

import java.io.*;
import java.util.*;
import java.util.logging.*;

import tinyeiffel.ast.*;
import tinyeiffel.compiler.Compiler_Eiffel;
import tinyeiffel.compiler.Logging;
import tinyeiffel.erreur.*;
import tinyeiffel.verification.type_verif.*;

/**
 * @author Barret
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class Verifications {static class __CLOVER_275_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}

	public Type nom_classe,generique[];
	Heritage liste_heritage[];
	public Vector liste_verifications;
	Map liste_attribut;
	Logging logging;
	Logger profiler;
	protected int no_var_type;
	
	public Verifications(Type classe,Heritage heritage[],
			Logging logging)
	{__CLOVER_275_0.cloverRec.M[1644]++;
		assert((((classe!=null)) && (++__CLOVER_275_0.cloverRec.CT[7015]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7015]==0&false));
		__CLOVER_275_0.cloverRec.S[22979]++;this.nom_classe=classe;
		__CLOVER_275_0.cloverRec.S[22980]++;liste_verifications=new Vector();
		__CLOVER_275_0.cloverRec.S[22981]++;this.generique=classe.generique;
		__CLOVER_275_0.cloverRec.S[22982]++;this.liste_heritage=heritage;
		__CLOVER_275_0.cloverRec.S[22983]++;liste_attribut=new HashMap();
		__CLOVER_275_0.cloverRec.S[22984]++;this.logging=logging;
		//this.profiler=profiler;
		__CLOVER_275_0.cloverRec.S[22985]++;this.profiler=Logger.getLogger("tinyeiffel.profiler.verification");
		__CLOVER_275_0.cloverRec.S[22986]++;this.profiler.setLevel(Level.OFF);
		__CLOVER_275_0.cloverRec.S[22987]++;no_var_type=0;
	}

	public String nom_classe()
	{__CLOVER_275_0.cloverRec.M[1645]++;
		__CLOVER_275_0.cloverRec.S[22988]++;return nom_classe.nom;
	}
	
	public void ajoute_attribut(NomFeature nom,DeclareVar param[],
			Type type_retour,boolean est_once)
	{__CLOVER_275_0.cloverRec.M[1646]++;
		__CLOVER_275_0.cloverRec.S[22989]++;VerifAttribut attr;
		__CLOVER_275_0.cloverRec.S[22990]++;attr=new VerifAttribut(nom,param,type_retour,est_once);
		__CLOVER_275_0.cloverRec.S[22991]++;liste_attribut.put(nom.toString(),attr);
	}
	

	public void ajoute_attribut(Feature f)
	{__CLOVER_275_0.cloverRec.M[1647]++;
		__CLOVER_275_0.cloverRec.S[22992]++;VerifAttribut attr;
		__CLOVER_275_0.cloverRec.S[22993]++;NomFeature nom,nom2;
		__CLOVER_275_0.cloverRec.S[22994]++;DeclareVar param[];
		__CLOVER_275_0.cloverRec.S[22995]++;Type type_retour;
		__CLOVER_275_0.cloverRec.S[22996]++;boolean est_once;
		__CLOVER_275_0.cloverRec.S[22997]++;int i;
		assert((((f!=null)) && (++__CLOVER_275_0.cloverRec.CT[7016]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7016]==0&false));
		__CLOVER_275_0.cloverRec.S[22998]++;param=f.param;
		__CLOVER_275_0.cloverRec.S[22999]++;if((((f instanceof FeatureRoutine&&
				((FeatureRoutine)f).once) && (++__CLOVER_275_0.cloverRec.CT[7017]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7017]==0&false)))
		{{
			__CLOVER_275_0.cloverRec.S[23000]++;est_once=true;
		}
		}else
		{{
			__CLOVER_275_0.cloverRec.S[23001]++;est_once=false;
		}
		}__CLOVER_275_0.cloverRec.S[23002]++;type_retour=f.type_retour;
		// verification si les attriobuts existent et
		// on les ajoutent
		__CLOVER_275_0.cloverRec.S[23003]++;for(i=0;(((i<f.liste_nom.length) && (++__CLOVER_275_0.cloverRec.CT[7018]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7018]==0&false));i++)
		{{
			__CLOVER_275_0.cloverRec.S[23004]++;nom=f.liste_nom[i];
			__CLOVER_275_0.cloverRec.S[23005]++;attr=cherche_attribut(nom);
			__CLOVER_275_0.cloverRec.S[23006]++;if((((attr!=null) && (++__CLOVER_275_0.cloverRec.CT[7019]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7019]==0&false)))
			{{
				__CLOVER_275_0.cloverRec.S[23007]++;Attribut attr1,attr2;
				__CLOVER_275_0.cloverRec.S[23008]++;attr1=new Attribut(nom,f.classe,f);
				__CLOVER_275_0.cloverRec.S[23009]++;attr2=new Attribut(attr.nom,f.classe,f);
				__CLOVER_275_0.cloverRec.S[23010]++;logging.erreur(new ErreurVFFD2(attr1,attr2));
			}
			}else
			{{
				__CLOVER_275_0.cloverRec.S[23011]++;attr=new VerifAttribut(nom,param,type_retour,est_once);
				__CLOVER_275_0.cloverRec.S[23012]++;liste_attribut.put(nom.toString(),attr);
			}
		}}
		// verifications internes a la fetaure et
		// generation des tests hors de la feature
		}__CLOVER_275_0.cloverRec.S[23013]++;verif_attribut(f);
	}
	
	public void verif_attribut(Feature f)
	{__CLOVER_275_0.cloverRec.M[1648]++;
		__CLOVER_275_0.cloverRec.S[23014]++;NomFeature nom,nom2;
		__CLOVER_275_0.cloverRec.S[23015]++;int i,j;
		__CLOVER_275_0.cloverRec.S[23016]++;DeclareVar d,liste_var0[];
		__CLOVER_275_0.cloverRec.S[23017]++;Map liste_var;
		__CLOVER_275_0.cloverRec.S[23018]++;boolean est_infix=false,est_prefix=false,est_frozen=false;
		__CLOVER_275_0.cloverRec.S[23019]++;NomFeature nom_prefix=null,nom_infix=null,nom_frozen=null;
		assert((((f!=null)) && (++__CLOVER_275_0.cloverRec.CT[7020]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7020]==0&false));
		// v\u00e9rification que les noms de la feature sont diff\u00e9rents
		__CLOVER_275_0.cloverRec.S[23020]++;for(i=0;(((i<f.liste_nom.length) && (++__CLOVER_275_0.cloverRec.CT[7021]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7021]==0&false));i++)
		{{
			__CLOVER_275_0.cloverRec.S[23021]++;nom=f.liste_nom[i];
			__CLOVER_275_0.cloverRec.S[23022]++;for(j=0;(((j<i) && (++__CLOVER_275_0.cloverRec.CT[7022]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7022]==0&false));j++)
			{{
				__CLOVER_275_0.cloverRec.S[23023]++;nom2=f.liste_nom[j];
				__CLOVER_275_0.cloverRec.S[23024]++;if((((nom.equals(nom2)) && (++__CLOVER_275_0.cloverRec.CT[7023]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7023]==0&false)))
				{{
					__CLOVER_275_0.cloverRec.S[23025]++;Attribut attr1,attr2;
					__CLOVER_275_0.cloverRec.S[23026]++;attr1=new Attribut(nom,f.classe,f);
					__CLOVER_275_0.cloverRec.S[23027]++;attr2=new Attribut(nom2,f.classe,f);
					__CLOVER_275_0.cloverRec.S[23028]++;logging.erreur(new ErreurVFFD2(attr1,attr2));
				}
			}}
			}__CLOVER_275_0.cloverRec.S[23029]++;if((((!est_infix&&nom.infix) && (++__CLOVER_275_0.cloverRec.CT[7024]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7024]==0&false)))
			{{
				__CLOVER_275_0.cloverRec.S[23030]++;est_infix=true;
				__CLOVER_275_0.cloverRec.S[23031]++;nom_infix=nom;
			}
			}__CLOVER_275_0.cloverRec.S[23032]++;if((((!est_prefix&&nom.prefix) && (++__CLOVER_275_0.cloverRec.CT[7025]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7025]==0&false)))
			{{
				__CLOVER_275_0.cloverRec.S[23033]++;est_prefix=true;
				__CLOVER_275_0.cloverRec.S[23034]++;nom_prefix=nom;
			}
			}__CLOVER_275_0.cloverRec.S[23035]++;if((((!est_frozen&&nom.frozen) && (++__CLOVER_275_0.cloverRec.CT[7026]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7026]==0&false)))
			{{
				__CLOVER_275_0.cloverRec.S[23036]++;est_frozen=true;
				__CLOVER_275_0.cloverRec.S[23037]++;nom_frozen=nom;
			}
			//verif_attribut_existe_pas(nom_classe.nom,nom,nom.debut);
		}}
		}__CLOVER_275_0.cloverRec.S[23038]++;if(((((f instanceof FeatureDeferred)&&!f.classe.deferred) && (++__CLOVER_275_0.cloverRec.CT[7027]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7027]==0&false)))
		{{
			__CLOVER_275_0.cloverRec.S[23039]++;logging.erreur(new ErreurVCCH1(f.classe,f));
		}
		}__CLOVER_275_0.cloverRec.S[23040]++;if((((!(f instanceof FeatureDeferred)&&f.classe.deferred) && (++__CLOVER_275_0.cloverRec.CT[7028]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7028]==0&false)))
		{{
			__CLOVER_275_0.cloverRec.S[23041]++;logging.erreur(new ErreurVCCH2(f.classe));
		}
		}__CLOVER_275_0.cloverRec.S[23042]++;liste_var=new HashMap();
		__CLOVER_275_0.cloverRec.S[23043]++;if((((f.param!=null&&f.param.length>0) && (++__CLOVER_275_0.cloverRec.CT[7029]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7029]==0&false)))
		{{
			__CLOVER_275_0.cloverRec.S[23044]++;verifie_declare_var(f, f.param, liste_var,false);
		}
		}__CLOVER_275_0.cloverRec.S[23045]++;if((((est_frozen&&(f instanceof FeatureDeferred)) && (++__CLOVER_275_0.cloverRec.CT[7030]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7030]==0&false)))
		{{// erreur VFFD4
			__CLOVER_275_0.cloverRec.S[23046]++;Attribut attr;
			__CLOVER_275_0.cloverRec.S[23047]++;attr=new Attribut(nom_frozen,f.classe,f);
			__CLOVER_275_0.cloverRec.S[23048]++;logging.erreur(new ErreurVFFD4(attr));
		}
		}__CLOVER_275_0.cloverRec.S[23049]++;if((((est_prefix&&((f.param!=null&&f.param.length>0)||f.type_retour==null)) && (++__CLOVER_275_0.cloverRec.CT[7031]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7031]==0&false)))
		{{// Erreur VFFD5
			__CLOVER_275_0.cloverRec.S[23050]++;logging.erreur(new ErreurVFFD5(f.classe,nom_prefix,f));
		}
		}__CLOVER_275_0.cloverRec.S[23051]++;if((((est_infix&&(f.param==null||f.param.length!=1||f.type_retour==null)) && (++__CLOVER_275_0.cloverRec.CT[7032]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7032]==0&false)))
		{{// erreur VFFD6
			__CLOVER_275_0.cloverRec.S[23052]++;logging.erreur(new ErreurVFFD6(f.classe,nom_infix,f));
		}
		}__CLOVER_275_0.cloverRec.S[23053]++;if((((f.type_retour!=null) && (++__CLOVER_275_0.cloverRec.CT[7033]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7033]==0&false)))
		{{
			__CLOVER_275_0.cloverRec.S[23054]++;DeclareVar d2;
			__CLOVER_275_0.cloverRec.S[23055]++;if((((f.type_retour.is_like) && (++__CLOVER_275_0.cloverRec.CT[7034]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7034]==0&false)))
			{{
				__CLOVER_275_0.cloverRec.S[23056]++;if((((f instanceof FeatureRoutine&&((FeatureRoutine)f).once) && (++__CLOVER_275_0.cloverRec.CT[7035]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7035]==0&false)))
				{{
					__CLOVER_275_0.cloverRec.S[23057]++;logging.erreur(new ErreurVFFD7(f.classe,f.liste_nom[0],f));
				}
			}}
			}else
			{{
				__CLOVER_275_0.cloverRec.S[23058]++;verif_classe_existe(f.type_retour.nom,
					f.type_retour.debut());
			}
			}__CLOVER_275_0.cloverRec.S[23059]++;d2=new DeclareVar("Result",f.type_retour);
			__CLOVER_275_0.cloverRec.S[23060]++;if((((!liste_var.containsKey("Result")) && (++__CLOVER_275_0.cloverRec.CT[7036]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7036]==0&false)))
			{{
				__CLOVER_275_0.cloverRec.S[23061]++;liste_var.put("Result",d2);
			}
			}else
			{{// TODO: Conflit Result et les parametres
				assert((((false)) && (++__CLOVER_275_0.cloverRec.CT[7037]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7037]==0&false));
			}
		}}
		}__CLOVER_275_0.cloverRec.S[23062]++;if((((f instanceof FeatureRoutine) && (++__CLOVER_275_0.cloverRec.CT[7038]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7038]==0&false)))
		{{
			__CLOVER_275_0.cloverRec.S[23063]++;FeatureRoutine fr=(FeatureRoutine)f;
			__CLOVER_275_0.cloverRec.S[23064]++;if((((fr.local!=null) && (++__CLOVER_275_0.cloverRec.CT[7039]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7039]==0&false)))
			{{
				__CLOVER_275_0.cloverRec.S[23065]++;verifie_declare_var(f, fr.local, liste_var,true);
			}
			}__CLOVER_275_0.cloverRec.S[23066]++;verifie_liste_instruction(fr.liste_instr,liste_var);
		}
		}else {__CLOVER_275_0.cloverRec.S[23067]++;if((((f instanceof FeatureExpr) && (++__CLOVER_275_0.cloverRec.CT[7040]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7040]==0&false)))
		{{
			__CLOVER_275_0.cloverRec.S[23068]++;FeatureExpr fe=(FeatureExpr)f;
			__CLOVER_275_0.cloverRec.S[23069]++;VerifType type_expr,type;
			__CLOVER_275_0.cloverRec.S[23070]++;if((((fe.type_retour==null) && (++__CLOVER_275_0.cloverRec.CT[7041]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7041]==0&false)))
			{{
				__CLOVER_275_0.cloverRec.S[23071]++;logging.erreur(new ErreurVQMC(nom_classe,f));
			}
			}else
			{{
				__CLOVER_275_0.cloverRec.S[23072]++;type=new VerifType(donne_var_type(),fe.type_retour);
				__CLOVER_275_0.cloverRec.S[23073]++;type_expr=verifie_expr(type_courant(),fe.expr,new HashMap());
				__CLOVER_275_0.cloverRec.S[23074]++;verif_type_conforme(type,type_expr,nom_classe);
			}
		}}
		}else {__CLOVER_275_0.cloverRec.S[23075]++;if((((f instanceof FeatureUnique) && (++__CLOVER_275_0.cloverRec.CT[7042]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7042]==0&false)))
		{{
			
		}
	}}}}
	
	/**
	 * @param liste_instr
	 * @param liste_var
	 */
	private void verifie_liste_instruction(Instr liste_instr[], Map liste_var) {__CLOVER_275_0.cloverRec.M[1649]++;
		__CLOVER_275_0.cloverRec.S[23076]++;int i;
		__CLOVER_275_0.cloverRec.S[23077]++;if((((liste_instr!=null) && (++__CLOVER_275_0.cloverRec.CT[7043]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7043]==0&false)))
		{{
			__CLOVER_275_0.cloverRec.S[23078]++;profiler.info("Debut Verif Instruction ..."+mem_info());
			__CLOVER_275_0.cloverRec.S[23079]++;for(i=0;(((i<liste_instr.length) && (++__CLOVER_275_0.cloverRec.CT[7044]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7044]==0&false));i++)
			{{
				__CLOVER_275_0.cloverRec.S[23080]++;profiler.info("Verif Instruction "+i+":"+liste_instr[i].debut()+" ..."+mem_info());
				__CLOVER_275_0.cloverRec.S[23081]++;verifie_instruction(liste_instr[i], liste_var);
				__CLOVER_275_0.cloverRec.S[23082]++;profiler.info("Verif Instruction fait "+mem_info());
			}
			}__CLOVER_275_0.cloverRec.S[23083]++;profiler.info("Fin Verif Instruction "+mem_info());
		}
	}}

	/**
	 * @return
	 */
	private String mem_info() {__CLOVER_275_0.cloverRec.M[1650]++;
		// TODO Auto-generated method stub
		__CLOVER_275_0.cloverRec.S[23084]++;return Compiler_Eiffel.info_mem();
	}

	/**
	 * @param instr
	 * @param liste_var
	 */
	private void verifie_instruction(Instr instr, Map liste_var) {__CLOVER_275_0.cloverRec.M[1651]++;
		assert((((instr!=null)) && (++__CLOVER_275_0.cloverRec.CT[7045]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7045]==0&false));
		assert((((liste_var!=null)) && (++__CLOVER_275_0.cloverRec.CT[7046]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7046]==0&false));
		__CLOVER_275_0.cloverRec.S[23085]++;if((((instr instanceof Instr_Affect) && (++__CLOVER_275_0.cloverRec.CT[7047]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7047]==0&false)))
		{{// Affectation
			__CLOVER_275_0.cloverRec.S[23086]++;Instr_Affect ins=(Instr_Affect)instr;
			__CLOVER_275_0.cloverRec.S[23087]++;VerifAttribut va;
			__CLOVER_275_0.cloverRec.S[23088]++;NomFeature nom;
			__CLOVER_275_0.cloverRec.S[23089]++;Type type_cible;
			__CLOVER_275_0.cloverRec.S[23090]++;VerifType type,type_expr,type_courant;
			__CLOVER_275_0.cloverRec.S[23091]++;DeclareVar d;
			__CLOVER_275_0.cloverRec.S[23092]++;VerifTypeConforme vc;
			__CLOVER_275_0.cloverRec.S[23093]++;profiler.info("Verif Affect "+mem_info());
			/*nom=new NomFeature(ins.nom);
			va=cherche_attribut(nom);
			if(va!=null)*/
			__CLOVER_275_0.cloverRec.S[23094]++;if((((liste_var.containsKey(ins.nom)) && (++__CLOVER_275_0.cloverRec.CT[7048]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7048]==0&false)))
			{{
				//type_cible=
				__CLOVER_275_0.cloverRec.S[23095]++;d=(DeclareVar)liste_var.get(ins.nom);
				assert((((d!=null)) && (++__CLOVER_275_0.cloverRec.CT[7049]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7049]==0&false));
				__CLOVER_275_0.cloverRec.S[23096]++;type=new VerifType(donne_var_type(),d.type);
			}
			}else
			{{
				__CLOVER_275_0.cloverRec.S[23097]++;VerifMethode vm;
				__CLOVER_275_0.cloverRec.S[23098]++;VerifType classe;
				__CLOVER_275_0.cloverRec.S[23099]++;NomFeature nom_source;
				__CLOVER_275_0.cloverRec.S[23100]++;classe=new VerifType(donne_var_type(),nom_classe);
				__CLOVER_275_0.cloverRec.S[23101]++;nom_source=new NomFeature(ins.nom);
				__CLOVER_275_0.cloverRec.S[23102]++;type=new VerifType(donne_var_type());
				/*vm=new VerifMethode(classe,nom_source,
						null,type,ins.tid.debut());
				liste_verifications.addElement(vm);*/
				__CLOVER_275_0.cloverRec.S[23103]++;verif_methode(classe,nom_source,
						null,type,ins.tid.debut());
			}
			}__CLOVER_275_0.cloverRec.S[23104]++;type_expr=verifie_expr(type_courant(),ins.expr,liste_var);
			//vc=new VerifTypeConforme(type_courant(),type_expr,nom_classe);
			//liste_verifications.addElement(vc);
			__CLOVER_275_0.cloverRec.S[23105]++;verif_type_conforme(type,type_expr,nom_classe);
		}
		}else {__CLOVER_275_0.cloverRec.S[23106]++;if((((instr instanceof Instr_Appel) && (++__CLOVER_275_0.cloverRec.CT[7050]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7050]==0&false)))
		{{
			__CLOVER_275_0.cloverRec.S[23107]++;Instr_Appel ins=(Instr_Appel)instr;
			__CLOVER_275_0.cloverRec.S[23108]++;VerifType vt,vt2,param[],type_retour;
			__CLOVER_275_0.cloverRec.S[23109]++;VerifMethode vm;
			__CLOVER_275_0.cloverRec.S[23110]++;profiler.info("Verif Appel "+ins.debut()+":"+mem_info());
			__CLOVER_275_0.cloverRec.S[23111]++;vt=type_courant();
			__CLOVER_275_0.cloverRec.S[23112]++;type_retour=null;
			__CLOVER_275_0.cloverRec.S[23113]++;while((((ins!=null) && (++__CLOVER_275_0.cloverRec.CT[7051]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7051]==0&false)))
			{{
				__CLOVER_275_0.cloverRec.S[23114]++;if((((ins.expr!=null) && (++__CLOVER_275_0.cloverRec.CT[7052]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7052]==0&false)))
				{{
					__CLOVER_275_0.cloverRec.S[23115]++;type_retour=verifie_expr(type_courant(),ins.expr,liste_var);
					__CLOVER_275_0.cloverRec.S[23116]++;vt=type_retour;
				}
				}else
				{{
					__CLOVER_275_0.cloverRec.S[23117]++;if((((ins.parametre!=null&&ins.parametre.length>0) && (++__CLOVER_275_0.cloverRec.CT[7053]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7053]==0&false)))
					{{
						__CLOVER_275_0.cloverRec.S[23118]++;int j;
						__CLOVER_275_0.cloverRec.S[23119]++;param=new VerifType[ins.parametre.length];
						__CLOVER_275_0.cloverRec.S[23120]++;for(j=0;(((j<param.length) && (++__CLOVER_275_0.cloverRec.CT[7054]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7054]==0&false));j++)
						{{
							__CLOVER_275_0.cloverRec.S[23121]++;vt2=verifie_expr(type_courant(),ins.parametre[j],liste_var);
							__CLOVER_275_0.cloverRec.S[23122]++;param[j]=new VerifType(donne_var_type());
							__CLOVER_275_0.cloverRec.S[23123]++;verif_type_conforme(param[j],vt2,type_courant().get_type_reel());
						}
					}}
					}else
					{{
						__CLOVER_275_0.cloverRec.S[23124]++;param=null;
					}
					}__CLOVER_275_0.cloverRec.S[23125]++;type_retour=new VerifType(donne_var_type());
					__CLOVER_275_0.cloverRec.S[23126]++;verif_methode(vt,new NomFeature(ins.nom),
						param,type_retour,ins.debut());
					__CLOVER_275_0.cloverRec.S[23127]++;vt=type_retour;
				}
				}__CLOVER_275_0.cloverRec.S[23128]++;if((((ins.getSuivant()!=null) && (++__CLOVER_275_0.cloverRec.CT[7055]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7055]==0&false)))
				{{
					__CLOVER_275_0.cloverRec.S[23129]++;ins=(Instr_Appel)ins.getSuivant();
				}
				}else
				{{
					__CLOVER_275_0.cloverRec.S[23130]++;ins=null;
				}
			}}
			}__CLOVER_275_0.cloverRec.S[23131]++;verif_pas_type(type_retour,type_courant().get_type_reel());
		}
		}else {__CLOVER_275_0.cloverRec.S[23132]++;if((((instr instanceof Instr_Check) && (++__CLOVER_275_0.cloverRec.CT[7056]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7056]==0&false)))
		{{
			__CLOVER_275_0.cloverRec.S[23133]++;Instr_Check ins=(Instr_Check)instr;
			__CLOVER_275_0.cloverRec.S[23134]++;profiler.info("Verif Check "+mem_info());
			__CLOVER_275_0.cloverRec.S[23135]++;if((((ins.liste_expr!=null&&ins.liste_expr.length>0) && (++__CLOVER_275_0.cloverRec.CT[7057]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7057]==0&false)))
			{{
				__CLOVER_275_0.cloverRec.S[23136]++;int j;
				__CLOVER_275_0.cloverRec.S[23137]++;VerifType type_expr;
				__CLOVER_275_0.cloverRec.S[23138]++;Assert a;
				__CLOVER_275_0.cloverRec.S[23139]++;for(j=0;(((j<ins.liste_expr.length) && (++__CLOVER_275_0.cloverRec.CT[7058]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7058]==0&false));j++)
				{{
					__CLOVER_275_0.cloverRec.S[23140]++;a=ins.liste_expr[j];
					__CLOVER_275_0.cloverRec.S[23141]++;if((((a.expr!=null) && (++__CLOVER_275_0.cloverRec.CT[7059]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7059]==0&false)))
					{{
						__CLOVER_275_0.cloverRec.S[23142]++;type_expr=verifie_expr(type_courant(),a.expr,liste_var);
						__CLOVER_275_0.cloverRec.S[23143]++;verif_type_conforme(type_boolean(),type_expr,nom_classe);
					}
				}}
			}}
			
		}}
		}else {__CLOVER_275_0.cloverRec.S[23144]++;if((((instr instanceof Instr_Creation) && (++__CLOVER_275_0.cloverRec.CT[7060]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7060]==0&false)))
		{{// TODO: a terminer
			__CLOVER_275_0.cloverRec.S[23145]++;Instr_Creation ins=(Instr_Creation)instr;
			__CLOVER_275_0.cloverRec.S[23146]++;VerifAttribut va;
			__CLOVER_275_0.cloverRec.S[23147]++;NomFeature nom;
			__CLOVER_275_0.cloverRec.S[23148]++;Type type_cible;
			__CLOVER_275_0.cloverRec.S[23149]++;VerifType type,type_expr,type_courant,type_creation;
			__CLOVER_275_0.cloverRec.S[23150]++;DeclareVar d;
			__CLOVER_275_0.cloverRec.S[23151]++;VerifTypeConforme vc;
			__CLOVER_275_0.cloverRec.S[23152]++;profiler.info("Verif Creation "+mem_info());
			__CLOVER_275_0.cloverRec.S[23153]++;if((((liste_var.containsKey(ins.nom)) && (++__CLOVER_275_0.cloverRec.CT[7061]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7061]==0&false)))
			{{
				//type_cible=
				__CLOVER_275_0.cloverRec.S[23154]++;d=(DeclareVar)liste_var.get(ins.nom);
				assert((((d!=null)) && (++__CLOVER_275_0.cloverRec.CT[7062]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7062]==0&false));
				__CLOVER_275_0.cloverRec.S[23155]++;type=new VerifType(donne_var_type(),d.type);
			}
			}else
			{{
				__CLOVER_275_0.cloverRec.S[23156]++;VerifType classe;
				__CLOVER_275_0.cloverRec.S[23157]++;NomFeature nom_source;
				__CLOVER_275_0.cloverRec.S[23158]++;classe=new VerifType(donne_var_type(),nom_classe);
				__CLOVER_275_0.cloverRec.S[23159]++;nom_source=new NomFeature(ins.nom);
				__CLOVER_275_0.cloverRec.S[23160]++;type=new VerifType(donne_var_type());
				__CLOVER_275_0.cloverRec.S[23161]++;verif_methode(classe,nom_source,
						null,type,ins.tid.debut());
			}
			}__CLOVER_275_0.cloverRec.S[23162]++;if((((ins.type!=null) && (++__CLOVER_275_0.cloverRec.CT[7063]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7063]==0&false)))
			{{
				__CLOVER_275_0.cloverRec.S[23163]++;type_creation=new VerifType(donne_var_type(),ins.type);
				__CLOVER_275_0.cloverRec.S[23164]++;verif_type_conforme(type,type_creation,nom_classe);
			}
			}__CLOVER_275_0.cloverRec.S[23165]++;if((((ins.nom2!=null) && (++__CLOVER_275_0.cloverRec.CT[7064]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7064]==0&false)))
			{{
				__CLOVER_275_0.cloverRec.S[23166]++;VerifType param[],vt;
				__CLOVER_275_0.cloverRec.S[23167]++;if((((ins.parametre!=null&&ins.parametre.length>0) && (++__CLOVER_275_0.cloverRec.CT[7065]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7065]==0&false)))
				{{
					__CLOVER_275_0.cloverRec.S[23168]++;int j;
					__CLOVER_275_0.cloverRec.S[23169]++;param=new VerifType[ins.parametre.length];
					__CLOVER_275_0.cloverRec.S[23170]++;for(j=0;(((j<param.length) && (++__CLOVER_275_0.cloverRec.CT[7066]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7066]==0&false));j++)
					{{
						__CLOVER_275_0.cloverRec.S[23171]++;vt=verifie_expr(type,ins.parametre[j],liste_var);
						__CLOVER_275_0.cloverRec.S[23172]++;param[j]=new VerifType(donne_var_type());
						__CLOVER_275_0.cloverRec.S[23173]++;verif_type_conforme(param[j],vt,type_courant().get_type_reel());
					}
				}}
				}else
				{{
					__CLOVER_275_0.cloverRec.S[23174]++;param=null;
				}
				}__CLOVER_275_0.cloverRec.S[23175]++;verif_methode(type,new NomFeature(ins.nom),
					param,null,ins.debut());
				__CLOVER_275_0.cloverRec.S[23176]++;verif_methode_creation(type,new NomFeature(ins.nom),ins.debut());
			}
		}}
		}else {__CLOVER_275_0.cloverRec.S[23177]++;if((((instr instanceof Instr_Debug) && (++__CLOVER_275_0.cloverRec.CT[7067]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7067]==0&false)))
		{{
			__CLOVER_275_0.cloverRec.S[23178]++;Instr_Debug ins=(Instr_Debug)instr;
			__CLOVER_275_0.cloverRec.S[23179]++;profiler.info("Verif Debug "+mem_info());
			__CLOVER_275_0.cloverRec.S[23180]++;if((((ins.instr!=null&&ins.instr.length>0) && (++__CLOVER_275_0.cloverRec.CT[7068]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7068]==0&false)))
			{{
				__CLOVER_275_0.cloverRec.S[23181]++;verifie_liste_instruction(ins.instr,liste_var);
			}
		}}
		}else {__CLOVER_275_0.cloverRec.S[23182]++;if((((instr instanceof Instr_If) && (++__CLOVER_275_0.cloverRec.CT[7069]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7069]==0&false)))
		{{
			__CLOVER_275_0.cloverRec.S[23183]++;Instr_If ins=(Instr_If)instr;
			__CLOVER_275_0.cloverRec.S[23184]++;VerifType type_expr;
			__CLOVER_275_0.cloverRec.S[23185]++;Instr_ElseIf ins2;
			__CLOVER_275_0.cloverRec.S[23186]++;Instr_Else ins3;
			assert((((ins.expr!=null)) && (++__CLOVER_275_0.cloverRec.CT[7070]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7070]==0&false));
			__CLOVER_275_0.cloverRec.S[23187]++;profiler.info("Verif If "+mem_info());
			__CLOVER_275_0.cloverRec.S[23188]++;type_expr=verifie_expr(type_courant(),ins.expr,liste_var);
			__CLOVER_275_0.cloverRec.S[23189]++;verif_type_conforme(type_boolean(),type_expr,nom_classe);
			__CLOVER_275_0.cloverRec.S[23190]++;if((((ins.liste_instr!=null&&ins.liste_instr.length>0) && (++__CLOVER_275_0.cloverRec.CT[7071]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7071]==0&false)))
			{{
				__CLOVER_275_0.cloverRec.S[23191]++;verifie_liste_instruction(ins.liste_instr,liste_var);
			}
			}__CLOVER_275_0.cloverRec.S[23192]++;if((((ins.getSuivant()!=null) && (++__CLOVER_275_0.cloverRec.CT[7072]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7072]==0&false)))
			{{
				__CLOVER_275_0.cloverRec.S[23193]++;profiler.info("Verif If suivant "+mem_info());
				__CLOVER_275_0.cloverRec.S[23194]++;if((((ins.getSuivant() instanceof Instr_ElseIf) && (++__CLOVER_275_0.cloverRec.CT[7073]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7073]==0&false)))
				{{
					__CLOVER_275_0.cloverRec.S[23195]++;profiler.info("Verif ElseIf "+mem_info());
					__CLOVER_275_0.cloverRec.S[23196]++;ins2=(Instr_ElseIf)ins.getSuivant();
					__CLOVER_275_0.cloverRec.S[23197]++;ins3=null;
					__CLOVER_275_0.cloverRec.S[23198]++;while((((ins2!=null) && (++__CLOVER_275_0.cloverRec.CT[7074]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7074]==0&false)))
					{{
						__CLOVER_275_0.cloverRec.S[23199]++;profiler.info("Verif ElseIf boucle debut "+mem_info());
						assert((((ins2.expr!=null)) && (++__CLOVER_275_0.cloverRec.CT[7075]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7075]==0&false));
						__CLOVER_275_0.cloverRec.S[23200]++;type_expr=verifie_expr(type_courant(),ins2.expr,liste_var);
						__CLOVER_275_0.cloverRec.S[23201]++;verif_type_conforme(type_boolean(),type_expr,nom_classe);
						__CLOVER_275_0.cloverRec.S[23202]++;if((((ins2.liste_instr!=null&&ins2.liste_instr.length>0) && (++__CLOVER_275_0.cloverRec.CT[7076]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7076]==0&false)))
						{{
							__CLOVER_275_0.cloverRec.S[23203]++;verifie_liste_instruction(ins2.liste_instr,liste_var);
						}
						}__CLOVER_275_0.cloverRec.S[23204]++;if((((ins2.getSuivant()!=null) && (++__CLOVER_275_0.cloverRec.CT[7077]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7077]==0&false)))
						{{
							__CLOVER_275_0.cloverRec.S[23205]++;if((((ins2.getSuivant() instanceof Instr_ElseIf) && (++__CLOVER_275_0.cloverRec.CT[7078]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7078]==0&false)))
							{{
								__CLOVER_275_0.cloverRec.S[23206]++;ins2=(Instr_ElseIf)ins2.getSuivant();
							}
							}else
							{{
								__CLOVER_275_0.cloverRec.S[23207]++;ins3=(Instr_Else)ins2.getSuivant();
								__CLOVER_275_0.cloverRec.S[23208]++;ins2=null;
							}
						}}
						}else
						{{
							__CLOVER_275_0.cloverRec.S[23209]++;ins2=null;
							__CLOVER_275_0.cloverRec.S[23210]++;ins3=null;
						}
						}__CLOVER_275_0.cloverRec.S[23211]++;profiler.info("Verif ElseIf boucle fin "+mem_info());
					}
				}}
				}else
				{{
					__CLOVER_275_0.cloverRec.S[23212]++;ins3=(Instr_Else)ins.getSuivant();
				}
				}__CLOVER_275_0.cloverRec.S[23213]++;if((((ins3!=null) && (++__CLOVER_275_0.cloverRec.CT[7079]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7079]==0&false)))
				{{
					__CLOVER_275_0.cloverRec.S[23214]++;profiler.info("Verif Else "+mem_info());
					__CLOVER_275_0.cloverRec.S[23215]++;if((((ins3.liste_instr!=null&&ins3.liste_instr.length>0) && (++__CLOVER_275_0.cloverRec.CT[7080]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7080]==0&false)))
					{{
						__CLOVER_275_0.cloverRec.S[23216]++;verifie_liste_instruction(ins3.liste_instr,liste_var);
					}
				}}
			}}
			}__CLOVER_275_0.cloverRec.S[23217]++;profiler.info("Fin Verif If "+mem_info());
		}
		}else {__CLOVER_275_0.cloverRec.S[23218]++;if((((instr instanceof Instr_Inspect) && (++__CLOVER_275_0.cloverRec.CT[7081]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7081]==0&false)))
		{{// TODO: a terminer
			__CLOVER_275_0.cloverRec.S[23219]++;Instr_Inspect ins=(Instr_Inspect)instr;
			__CLOVER_275_0.cloverRec.S[23220]++;VerifType type_expr;
			__CLOVER_275_0.cloverRec.S[23221]++;Vector liste_cas;
			__CLOVER_275_0.cloverRec.S[23222]++;Position debut;
			__CLOVER_275_0.cloverRec.S[23223]++;profiler.info("Verif Inspect "+mem_info());
			__CLOVER_275_0.cloverRec.S[23224]++;debut=ins.debut();
			__CLOVER_275_0.cloverRec.S[23225]++;liste_cas=new Vector();
			__CLOVER_275_0.cloverRec.S[23226]++;type_expr=verifie_expr(type_courant(),ins.expr,liste_var);
			__CLOVER_275_0.cloverRec.S[23227]++;while((((ins!=null) && (++__CLOVER_275_0.cloverRec.CT[7082]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7082]==0&false)))
			{{
				// TODO: voir les cas
				__CLOVER_275_0.cloverRec.S[23228]++;if((((ins.when!=null) && (++__CLOVER_275_0.cloverRec.CT[7083]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7083]==0&false)))
				{{
					__CLOVER_275_0.cloverRec.S[23229]++;liste_cas.addAll(ins.when);
				}
				}__CLOVER_275_0.cloverRec.S[23230]++;verifie_liste_instruction(ins.liste_instr,liste_var);
				__CLOVER_275_0.cloverRec.S[23231]++;if((((ins.getSuivant()!=null) && (++__CLOVER_275_0.cloverRec.CT[7084]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7084]==0&false)))
				{{
					__CLOVER_275_0.cloverRec.S[23232]++;ins=(Instr_Inspect)ins.getSuivant();
				}
				}else
				{{
					__CLOVER_275_0.cloverRec.S[23233]++;ins=null;
				}
			}}
			// verifier conformit\u00e9 du type de la variable avec les cas
			}__CLOVER_275_0.cloverRec.S[23234]++;verif_inspect(type_expr,liste_cas,debut);
			//verif_type_conforme(type_integer(),type_expr,nom_classe);
			//verif_type_conforme(type_character(),type_expr,nom_classe);
		}
		}else {__CLOVER_275_0.cloverRec.S[23235]++;if((((instr instanceof Instr_Loop) && (++__CLOVER_275_0.cloverRec.CT[7085]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7085]==0&false)))
		{{
			__CLOVER_275_0.cloverRec.S[23236]++;Instr_Loop ins=(Instr_Loop)instr;
			__CLOVER_275_0.cloverRec.S[23237]++;VerifType type_expr;
			__CLOVER_275_0.cloverRec.S[23238]++;profiler.info("Verif Loop "+mem_info());
			__CLOVER_275_0.cloverRec.S[23239]++;if((((ins.from!=null&&ins.from.length>0) && (++__CLOVER_275_0.cloverRec.CT[7086]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7086]==0&false)))
			{{
				__CLOVER_275_0.cloverRec.S[23240]++;verifie_liste_instruction(ins.from,liste_var);
			}
			}assert((((ins.expr!=null)) && (++__CLOVER_275_0.cloverRec.CT[7087]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7087]==0&false));
			__CLOVER_275_0.cloverRec.S[23241]++;type_expr=verifie_expr(type_courant(),ins.expr,liste_var);
			__CLOVER_275_0.cloverRec.S[23242]++;verif_type_conforme(type_boolean(),type_expr,nom_classe);
			__CLOVER_275_0.cloverRec.S[23243]++;if((((ins.variant!=null) && (++__CLOVER_275_0.cloverRec.CT[7088]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7088]==0&false)))
			{{
				__CLOVER_275_0.cloverRec.S[23244]++;type_expr=verifie_expr(type_courant(),ins.variant,liste_var);
				__CLOVER_275_0.cloverRec.S[23245]++;verif_type_conforme(type_integer(),type_expr,nom_classe);
			}
			}__CLOVER_275_0.cloverRec.S[23246]++;if((((ins.invariant!=null&&ins.invariant.length>0) && (++__CLOVER_275_0.cloverRec.CT[7089]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7089]==0&false)))
			{{
				__CLOVER_275_0.cloverRec.S[23247]++;int j;
				__CLOVER_275_0.cloverRec.S[23248]++;Assert a;
				__CLOVER_275_0.cloverRec.S[23249]++;for(j=0;(((j<ins.invariant.length) && (++__CLOVER_275_0.cloverRec.CT[7090]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7090]==0&false));j++)
				{{
					__CLOVER_275_0.cloverRec.S[23250]++;a=ins.invariant[j];
					__CLOVER_275_0.cloverRec.S[23251]++;if((((a.expr!=null) && (++__CLOVER_275_0.cloverRec.CT[7091]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7091]==0&false)))
					{{
						__CLOVER_275_0.cloverRec.S[23252]++;type_expr=verifie_expr(type_courant(),a.expr,liste_var);
						__CLOVER_275_0.cloverRec.S[23253]++;verif_type_conforme(type_boolean(),type_expr,nom_classe);
					}
				}}
			}}
			}__CLOVER_275_0.cloverRec.S[23254]++;if((((ins.loop!=null&&ins.loop.length>0) && (++__CLOVER_275_0.cloverRec.CT[7092]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7092]==0&false)))
			{{
				__CLOVER_275_0.cloverRec.S[23255]++;verifie_liste_instruction(ins.loop,liste_var);
			}
		}}
		}else {__CLOVER_275_0.cloverRec.S[23256]++;if((((instr instanceof Instr_Retry) && (++__CLOVER_275_0.cloverRec.CT[7093]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7093]==0&false)))
		{{
			__CLOVER_275_0.cloverRec.S[23257]++;Instr_Retry ins=(Instr_Retry)instr;
			__CLOVER_275_0.cloverRec.S[23258]++;profiler.info("Verif Retry "+mem_info());
		}
		}else {__CLOVER_275_0.cloverRec.S[23259]++;if((((instr instanceof Instr_TentAffect) && (++__CLOVER_275_0.cloverRec.CT[7094]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7094]==0&false)))
		{{
			__CLOVER_275_0.cloverRec.S[23260]++;Instr_TentAffect ins=(Instr_TentAffect)instr;
			__CLOVER_275_0.cloverRec.S[23261]++;VerifAttribut va;
			__CLOVER_275_0.cloverRec.S[23262]++;NomFeature nom;
			__CLOVER_275_0.cloverRec.S[23263]++;Type type_cible;
			__CLOVER_275_0.cloverRec.S[23264]++;VerifType type,type_expr,type_courant;
			__CLOVER_275_0.cloverRec.S[23265]++;DeclareVar d;
			__CLOVER_275_0.cloverRec.S[23266]++;VerifTypeConforme vc;
			__CLOVER_275_0.cloverRec.S[23267]++;profiler.info("Verif Tentative affectation "+mem_info());
			__CLOVER_275_0.cloverRec.S[23268]++;if((((liste_var.containsKey(ins.nom)) && (++__CLOVER_275_0.cloverRec.CT[7095]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7095]==0&false)))
			{{
				__CLOVER_275_0.cloverRec.S[23269]++;profiler.info("Var existe "+mem_info());
				__CLOVER_275_0.cloverRec.S[23270]++;d=(DeclareVar)liste_var.get(ins.nom);
				assert((((d!=null)) && (++__CLOVER_275_0.cloverRec.CT[7096]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7096]==0&false));
				__CLOVER_275_0.cloverRec.S[23271]++;type=new VerifType(donne_var_type(),d.type);
			}
			}else
			{{
				__CLOVER_275_0.cloverRec.S[23272]++;VerifMethode vm;
				__CLOVER_275_0.cloverRec.S[23273]++;VerifType classe;
				__CLOVER_275_0.cloverRec.S[23274]++;NomFeature nom_source;
				__CLOVER_275_0.cloverRec.S[23275]++;profiler.info("Var n'existe pas "+mem_info());
				__CLOVER_275_0.cloverRec.S[23276]++;classe=new VerifType(donne_var_type(),nom_classe);
				__CLOVER_275_0.cloverRec.S[23277]++;nom_source=new NomFeature(ins.nom);
				__CLOVER_275_0.cloverRec.S[23278]++;type=new VerifType(donne_var_type());
				__CLOVER_275_0.cloverRec.S[23279]++;vm=new VerifMethode(classe,nom_source,
						null,type,ins.tid.debut());
				__CLOVER_275_0.cloverRec.S[23280]++;liste_verifications.addElement(vm);
			}
			}__CLOVER_275_0.cloverRec.S[23281]++;profiler.info("Verif expression "+mem_info());
			__CLOVER_275_0.cloverRec.S[23282]++;type_expr=verifie_expr(type_courant(),ins.expr,liste_var);
			__CLOVER_275_0.cloverRec.S[23283]++;profiler.info("Fin Verif Tentative affectation "+mem_info());
		}
		}else
		{{
			assert((((false)) && (++__CLOVER_275_0.cloverRec.CT[7097]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7097]==0&false));
		}
	}}}}}}}}}}}

	public VerifType type_courant()
	{__CLOVER_275_0.cloverRec.M[1652]++;
		__CLOVER_275_0.cloverRec.S[23284]++;return new VerifType(donne_var_type(),nom_classe);
	}

	public VerifType type_integer()
	{__CLOVER_275_0.cloverRec.M[1653]++;
		__CLOVER_275_0.cloverRec.S[23285]++;Type type=new TypeSimple(false,"INTEGER",null);
		__CLOVER_275_0.cloverRec.S[23286]++;return new VerifType(donne_var_type(),type);
	}

	public VerifType type_real()
	{__CLOVER_275_0.cloverRec.M[1654]++;
		__CLOVER_275_0.cloverRec.S[23287]++;Type type=new TypeSimple(false,"REAL",null);
		__CLOVER_275_0.cloverRec.S[23288]++;return new VerifType(donne_var_type(),type);
	}

	public VerifType type_character()
	{__CLOVER_275_0.cloverRec.M[1655]++;
		__CLOVER_275_0.cloverRec.S[23289]++;Type type=new TypeSimple(false,"CHARACTER",null);
		__CLOVER_275_0.cloverRec.S[23290]++;return new VerifType(donne_var_type(),type);
	}

	public VerifType type_boolean()
	{__CLOVER_275_0.cloverRec.M[1656]++;
		__CLOVER_275_0.cloverRec.S[23291]++;Type type=new TypeSimple(false,"BOOLEAN",null);
		__CLOVER_275_0.cloverRec.S[23292]++;return new VerifType(donne_var_type(),type);
	}

	public VerifType type_string()
	{__CLOVER_275_0.cloverRec.M[1657]++;
		__CLOVER_275_0.cloverRec.S[23293]++;Type type=new TypeSimple(false,"STRING",null);
		__CLOVER_275_0.cloverRec.S[23294]++;return new VerifType(donne_var_type(),type);
	}

	public VerifType type_double()
	{__CLOVER_275_0.cloverRec.M[1658]++;
		__CLOVER_275_0.cloverRec.S[23295]++;Type type=new TypeSimple(false,"DOUBLE",null);
		__CLOVER_275_0.cloverRec.S[23296]++;return new VerifType(donne_var_type(),type);
	}

	public VerifType type_any()
	{__CLOVER_275_0.cloverRec.M[1659]++;
		__CLOVER_275_0.cloverRec.S[23297]++;Type type=new TypeSimple(false,"ANY",null);
		__CLOVER_275_0.cloverRec.S[23298]++;return new VerifType(donne_var_type(),type);
	}
	
	public VerifType type_tab()
	{__CLOVER_275_0.cloverRec.M[1660]++;
		__CLOVER_275_0.cloverRec.S[23299]++;Type type,any;
		__CLOVER_275_0.cloverRec.S[23300]++;Vector v;
		__CLOVER_275_0.cloverRec.S[23301]++;any=type_any().get_type_reel();
		__CLOVER_275_0.cloverRec.S[23302]++;v=new Vector();
		__CLOVER_275_0.cloverRec.S[23303]++;v.addElement(any);
		__CLOVER_275_0.cloverRec.S[23304]++;type=new TypeSimple(false,"ARRAY",v);
		__CLOVER_275_0.cloverRec.S[23305]++;return new VerifType(donne_var_type(),type);
	}
	
	/**
	 * @param expr
	 * @param liste_var
	 * @return
	 */
	private VerifType verifie_expr(VerifType type_courant,
			Expr expr, Map liste_var) {__CLOVER_275_0.cloverRec.M[1661]++;
		__CLOVER_275_0.cloverRec.S[23306]++;VerifType res=null;
		assert((((expr!=null)) && (++__CLOVER_275_0.cloverRec.CT[7098]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7098]==0&false));
		assert((((liste_var!=null)) && (++__CLOVER_275_0.cloverRec.CT[7099]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7099]==0&false));
		//assert(type_courant.a_type_reel());
		__CLOVER_275_0.cloverRec.S[23307]++;if((((expr instanceof Expr_Appel) && (++__CLOVER_275_0.cloverRec.CT[7100]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7100]==0&false)))
		{{
			__CLOVER_275_0.cloverRec.S[23308]++;Expr_Appel exp=(Expr_Appel)expr;
			__CLOVER_275_0.cloverRec.S[23309]++;VerifType vt,vt2,param[],type_retour;
			__CLOVER_275_0.cloverRec.S[23310]++;VerifMethode vm;
			__CLOVER_275_0.cloverRec.S[23311]++;if((((exp.parametre.size()>0) && (++__CLOVER_275_0.cloverRec.CT[7101]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7101]==0&false)))
			{{
				__CLOVER_275_0.cloverRec.S[23312]++;int i;
				__CLOVER_275_0.cloverRec.S[23313]++;param=new VerifType[exp.parametre.size()];
				__CLOVER_275_0.cloverRec.S[23314]++;for(i=0;(((i<param.length) && (++__CLOVER_275_0.cloverRec.CT[7102]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7102]==0&false));i++)
				{{
					__CLOVER_275_0.cloverRec.S[23315]++;vt2=verifie_expr(type_courant,(Expr)exp.parametre.elementAt(i),liste_var);
					__CLOVER_275_0.cloverRec.S[23316]++;param[i]=new VerifType(donne_var_type());
					__CLOVER_275_0.cloverRec.S[23317]++;verif_type_conforme(param[i],vt2,type_courant.get_type_reel());
				}
			}}
			}else
			{{
				__CLOVER_275_0.cloverRec.S[23318]++;param=null;
			}
			}__CLOVER_275_0.cloverRec.S[23319]++;type_retour=new VerifType(donne_var_type());
			__CLOVER_275_0.cloverRec.S[23320]++;verif_methode(type_courant,new NomFeature(exp.nom),
					param,type_retour,exp.debut());
			__CLOVER_275_0.cloverRec.S[23321]++;res=type_retour;
		}
		}else {__CLOVER_275_0.cloverRec.S[23322]++;if((((expr instanceof Expr_Binaire) && (++__CLOVER_275_0.cloverRec.CT[7103]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7103]==0&false)))
		{{// TODO: prendre en compte les . et = et /=
			__CLOVER_275_0.cloverRec.S[23323]++;Expr_Binaire exp=(Expr_Binaire)expr;
			__CLOVER_275_0.cloverRec.S[23324]++;if((((exp.op==Expr.Point) && (++__CLOVER_275_0.cloverRec.CT[7104]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7104]==0&false)))
			{{
				__CLOVER_275_0.cloverRec.S[23325]++;VerifType vt,vt2;
				__CLOVER_275_0.cloverRec.S[23326]++;vt=verifie_expr(type_courant,exp.expr1,liste_var);
				__CLOVER_275_0.cloverRec.S[23327]++;vt2=verifie_expr(vt,exp.expr2,liste_var);
				__CLOVER_275_0.cloverRec.S[23328]++;res=vt2;
			}
			}else {__CLOVER_275_0.cloverRec.S[23329]++;if((((exp.op==Expr.Egal||exp.op==Expr.Diff) && (++__CLOVER_275_0.cloverRec.CT[7105]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7105]==0&false)))
			{{// TODO: verifier pour la conformit\u00e9 des 2 types
				__CLOVER_275_0.cloverRec.S[23330]++;VerifType vt,vt2;
				__CLOVER_275_0.cloverRec.S[23331]++;vt=verifie_expr(type_courant,exp.expr1,liste_var);
				__CLOVER_275_0.cloverRec.S[23332]++;vt2=verifie_expr(type_courant,exp.expr2,liste_var);
				__CLOVER_275_0.cloverRec.S[23333]++;verif_type_conforme(vt,vt2,type_courant.get_type_reel());
				__CLOVER_275_0.cloverRec.S[23334]++;res=type_boolean();
			}
			}else
			{{
				__CLOVER_275_0.cloverRec.S[23335]++;VerifType vt,vt2,param[],type_retour;
				__CLOVER_275_0.cloverRec.S[23336]++;VerifMethode vm;
				__CLOVER_275_0.cloverRec.S[23337]++;vt=verifie_expr(type_courant,exp.expr1,liste_var);
				__CLOVER_275_0.cloverRec.S[23338]++;vt2=verifie_expr(type_courant,exp.expr2,liste_var);
				__CLOVER_275_0.cloverRec.S[23339]++;param=new VerifType[1];
				__CLOVER_275_0.cloverRec.S[23340]++;param[0]=new VerifType(donne_var_type());
				__CLOVER_275_0.cloverRec.S[23341]++;type_retour=new VerifType(donne_var_type());
				__CLOVER_275_0.cloverRec.S[23342]++;verif_methode(vt,exp.donne_nom_feature(),param,type_retour,exp.debut());
				__CLOVER_275_0.cloverRec.S[23343]++;verif_type_conforme(param[0],vt2,type_courant.get_type_reel());
				__CLOVER_275_0.cloverRec.S[23344]++;res=type_retour;
			}
		}}}
		}else {__CLOVER_275_0.cloverRec.S[23345]++;if((((expr instanceof Expr_Car) && (++__CLOVER_275_0.cloverRec.CT[7106]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7106]==0&false)))
		{{
			__CLOVER_275_0.cloverRec.S[23346]++;Expr_Car exp=(Expr_Car)expr;
			__CLOVER_275_0.cloverRec.S[23347]++;res=new VerifType(donne_var_type(),type_character().get_type_reel());
		}
		}else {__CLOVER_275_0.cloverRec.S[23348]++;if((((expr instanceof Expr_Chaine) && (++__CLOVER_275_0.cloverRec.CT[7107]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7107]==0&false)))
		{{
			__CLOVER_275_0.cloverRec.S[23349]++;Expr_Chaine exp=(Expr_Chaine)expr;
			__CLOVER_275_0.cloverRec.S[23350]++;res=new VerifType(donne_var_type(),type_string().get_type_reel());
		}
		}else {__CLOVER_275_0.cloverRec.S[23351]++;if((((expr instanceof Expr_Entier) && (++__CLOVER_275_0.cloverRec.CT[7108]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7108]==0&false)))
		{{
			__CLOVER_275_0.cloverRec.S[23352]++;Expr_Entier exp=(Expr_Entier)expr;
			__CLOVER_275_0.cloverRec.S[23353]++;res=new VerifType(donne_var_type(),type_integer().get_type_reel());
		}
		}else {__CLOVER_275_0.cloverRec.S[23354]++;if((((expr instanceof Expr_Faux) && (++__CLOVER_275_0.cloverRec.CT[7109]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7109]==0&false)))
		{{
			__CLOVER_275_0.cloverRec.S[23355]++;Expr_Faux exp=(Expr_Faux)expr;
			__CLOVER_275_0.cloverRec.S[23356]++;res=new VerifType(donne_var_type(),type_boolean().get_type_reel());
		}
		}else {__CLOVER_275_0.cloverRec.S[23357]++;if((((expr instanceof Expr_Reel) && (++__CLOVER_275_0.cloverRec.CT[7110]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7110]==0&false)))
		{{
			__CLOVER_275_0.cloverRec.S[23358]++;Expr_Reel exp=(Expr_Reel)expr;
			__CLOVER_275_0.cloverRec.S[23359]++;res=new VerifType(donne_var_type(),type_real().get_type_reel());
		}
		}else {__CLOVER_275_0.cloverRec.S[23360]++;if((((expr instanceof Expr_Tableau) && (++__CLOVER_275_0.cloverRec.CT[7111]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7111]==0&false)))
		{{
			__CLOVER_275_0.cloverRec.S[23361]++;Expr_Tableau exp=(Expr_Tableau)expr;
			__CLOVER_275_0.cloverRec.S[23362]++;res=new VerifType(donne_var_type(),type_tab().get_type_reel());
		}
		}else {__CLOVER_275_0.cloverRec.S[23363]++;if((((expr instanceof Expr_Unaire) && (++__CLOVER_275_0.cloverRec.CT[7112]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7112]==0&false)))
		{{
			__CLOVER_275_0.cloverRec.S[23364]++;Expr_Unaire exp=(Expr_Unaire)expr;
			__CLOVER_275_0.cloverRec.S[23365]++;VerifType vt,type_retour;
			__CLOVER_275_0.cloverRec.S[23366]++;VerifMethode vm;
			__CLOVER_275_0.cloverRec.S[23367]++;vt=verifie_expr(type_courant,exp.expr1,liste_var);
			__CLOVER_275_0.cloverRec.S[23368]++;type_retour=new VerifType(donne_var_type());
			__CLOVER_275_0.cloverRec.S[23369]++;verif_methode(vt,exp.donne_nom_feature(),null,type_retour,exp.debut());
			__CLOVER_275_0.cloverRec.S[23370]++;res=type_retour;
		}
		}else {__CLOVER_275_0.cloverRec.S[23371]++;if((((expr instanceof Expr_Var) && (++__CLOVER_275_0.cloverRec.CT[7113]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7113]==0&false)))
		{{
			__CLOVER_275_0.cloverRec.S[23372]++;Expr_Var exp=(Expr_Var)expr;
			__CLOVER_275_0.cloverRec.S[23373]++;if((((liste_var.containsKey(exp.nom)) && (++__CLOVER_275_0.cloverRec.CT[7114]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7114]==0&false)))
			{{
				__CLOVER_275_0.cloverRec.S[23374]++;DeclareVar d;
				__CLOVER_275_0.cloverRec.S[23375]++;d=(DeclareVar)liste_var.get(exp.nom);
				assert((((d!=null)) && (++__CLOVER_275_0.cloverRec.CT[7115]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7115]==0&false));
				__CLOVER_275_0.cloverRec.S[23376]++;res=new VerifType(donne_var_type(),d.getType());
			}
			}else
			{{
				__CLOVER_275_0.cloverRec.S[23377]++;VerifType type_retour;
				__CLOVER_275_0.cloverRec.S[23378]++;type_retour=new VerifType(donne_var_type());
				__CLOVER_275_0.cloverRec.S[23379]++;verif_methode(type_courant,new NomFeature(exp.nom),null,
						type_retour,exp.debut());
				__CLOVER_275_0.cloverRec.S[23380]++;res=type_retour;
			}
		}}
		}else {__CLOVER_275_0.cloverRec.S[23381]++;if((((expr instanceof Expr_Vrai) && (++__CLOVER_275_0.cloverRec.CT[7116]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7116]==0&false)))
		{{
			__CLOVER_275_0.cloverRec.S[23382]++;Expr_Vrai exp=(Expr_Vrai)expr;
			__CLOVER_275_0.cloverRec.S[23383]++;res=new VerifType(donne_var_type(),type_boolean().get_type_reel());
		}
		}}}}}}}}}}}__CLOVER_275_0.cloverRec.S[23384]++;return res;
	}

	/**
	 * @return
	 */
	private String donne_var_type() {__CLOVER_275_0.cloverRec.M[1662]++;
		__CLOVER_275_0.cloverRec.S[23385]++;String res;
		__CLOVER_275_0.cloverRec.S[23386]++;res="$Var"+no_var_type;
		__CLOVER_275_0.cloverRec.S[23387]++;no_var_type++;
		__CLOVER_275_0.cloverRec.S[23388]++;return res;
	}

	/**
	 * @param f
	 * @param liste_var0
	 * @param liste_var
	 */
	private void verifie_declare_var(Feature f, DeclareVar[] liste_var0, 
			Map liste_var,boolean local) {__CLOVER_275_0.cloverRec.M[1663]++;
		__CLOVER_275_0.cloverRec.S[23389]++;NomFeature nom;
		__CLOVER_275_0.cloverRec.S[23390]++;int i;
		__CLOVER_275_0.cloverRec.S[23391]++;int j;
		__CLOVER_275_0.cloverRec.S[23392]++;DeclareVar d;
		__CLOVER_275_0.cloverRec.S[23393]++;for(i=0;(((i<liste_var0.length) && (++__CLOVER_275_0.cloverRec.CT[7117]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7117]==0&false));i++)
		{{
			__CLOVER_275_0.cloverRec.S[23394]++;if((((liste_var.containsKey(liste_var0[i].nom)) && (++__CLOVER_275_0.cloverRec.CT[7118]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7118]==0&false)))
			{{// la variable no i est deja pr\u00e9sente
				__CLOVER_275_0.cloverRec.S[23395]++;d=(DeclareVar)liste_var.get(liste_var0[i].nom);
				__CLOVER_275_0.cloverRec.S[23396]++;logging.erreur(new ErreurVREG(f.classe,f,
						d,liste_var0[i],local));
			}
			}else
			{{
				__CLOVER_275_0.cloverRec.S[23397]++;nom=new NomFeature(liste_var0[i].nom);
				__CLOVER_275_0.cloverRec.S[23398]++;nom.debut=liste_var0[i].debut();
				__CLOVER_275_0.cloverRec.S[23399]++;verif_attribut_existe_pas(nom_classe.nom,nom,nom.debut);
				__CLOVER_275_0.cloverRec.S[23400]++;liste_var.put(liste_var0[i].nom,liste_var0[i]);
			}
			}__CLOVER_275_0.cloverRec.S[23401]++;if((((!liste_var0[i].type.is_like) && (++__CLOVER_275_0.cloverRec.CT[7119]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7119]==0&false)))
			{{// v\u00e9rification si le type de la variable existe
				__CLOVER_275_0.cloverRec.S[23402]++;verif_classe_existe(liste_var0[i].type.nom,
						liste_var0[i].type.debut());
			}
		}}
	}}

	public VerifAttribut cherche_attribut(NomFeature nom)
	{__CLOVER_275_0.cloverRec.M[1664]++;
		assert((((nom!=null)) && (++__CLOVER_275_0.cloverRec.CT[7120]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7120]==0&false));
		//int i;
		//VerifAttribut attribut;
		__CLOVER_275_0.cloverRec.S[23403]++;if((((liste_attribut.containsKey(nom.toString())) && (++__CLOVER_275_0.cloverRec.CT[7121]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7121]==0&false)))
			{__CLOVER_275_0.cloverRec.S[23404]++;return (VerifAttribut)liste_attribut.get(nom);
		}else
			{__CLOVER_275_0.cloverRec.S[23405]++;return null;
		/*for(i=0;i<liste_attribut.size();i++)
		{
			attribut=(VerifAttribut)liste_attribut.elementAt(i);
			if(attribut.nom.equals(nom))
				return attribut;
		}
		return null;*/
	}}
	
	/* liste des v\u00e9rifications hors de la classe */
	
	public void verif_classe_existe(String classe, Position pos)
	{__CLOVER_275_0.cloverRec.M[1665]++;
		assert((((classe!=null)) && (++__CLOVER_275_0.cloverRec.CT[7122]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7122]==0&false));
		assert((((pos!=null)) && (++__CLOVER_275_0.cloverRec.CT[7123]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7123]==0&false));
		__CLOVER_275_0.cloverRec.S[23406]++;VerifClasseExiste v=new VerifClasseExiste(classe,pos);
		__CLOVER_275_0.cloverRec.S[23407]++;if((((!liste_verifications.contains(v)) && (++__CLOVER_275_0.cloverRec.CT[7124]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7124]==0&false)))
			{__CLOVER_275_0.cloverRec.S[23408]++;liste_verifications.addElement(v);
	}}
	
	public void verif_attribut_existe(String classe,NomFeature nom_attribut,
			Position pos)
	{__CLOVER_275_0.cloverRec.M[1666]++;
		assert((((classe!=null)) && (++__CLOVER_275_0.cloverRec.CT[7125]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7125]==0&false));
		assert((((nom_attribut!=null)) && (++__CLOVER_275_0.cloverRec.CT[7126]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7126]==0&false));
		assert((((pos!=null)) && (++__CLOVER_275_0.cloverRec.CT[7127]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7127]==0&false));
		__CLOVER_275_0.cloverRec.S[23409]++;VerifAttributExiste v=new VerifAttributExiste(classe,nom_attribut,pos);
		__CLOVER_275_0.cloverRec.S[23410]++;if((((!liste_verifications.contains(v)) && (++__CLOVER_275_0.cloverRec.CT[7128]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7128]==0&false)))
			{__CLOVER_275_0.cloverRec.S[23411]++;liste_verifications.addElement(v);
	}}

	public void verif_attribut_existe_pas(String classe,NomFeature nom_attribut,
			Position pos)
	{__CLOVER_275_0.cloverRec.M[1667]++;
		assert((((classe!=null)) && (++__CLOVER_275_0.cloverRec.CT[7129]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7129]==0&false));
		assert((((nom_attribut!=null)) && (++__CLOVER_275_0.cloverRec.CT[7130]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7130]==0&false));
		assert((((pos!=null)) && (++__CLOVER_275_0.cloverRec.CT[7131]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7131]==0&false));
		__CLOVER_275_0.cloverRec.S[23412]++;VerifAttributConflit v=new VerifAttributConflit(classe,nom_attribut,pos);
		__CLOVER_275_0.cloverRec.S[23413]++;if((((!liste_verifications.contains(v)) && (++__CLOVER_275_0.cloverRec.CT[7132]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7132]==0&false)))
			{__CLOVER_275_0.cloverRec.S[23414]++;liste_verifications.addElement(v);
	}}
	
	public void verif_methode(VerifType classe,NomFeature nom_attribut,
			VerifType param[],VerifType type_retour,Position pos)
	{__CLOVER_275_0.cloverRec.M[1668]++;
		assert((((classe!=null)) && (++__CLOVER_275_0.cloverRec.CT[7133]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7133]==0&false));
		assert((((nom_attribut!=null)) && (++__CLOVER_275_0.cloverRec.CT[7134]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7134]==0&false));
		assert((((pos!=null)) && (++__CLOVER_275_0.cloverRec.CT[7135]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7135]==0&false));
		__CLOVER_275_0.cloverRec.S[23415]++;VerifMethode v=new VerifMethode(classe,nom_attribut,param,type_retour,pos);
		//if(!liste_verifications.contains(v))
			__CLOVER_275_0.cloverRec.S[23416]++;liste_verifications.addElement(v);
	}

	public void verif_pas_type(VerifType type,Type classe)
	{__CLOVER_275_0.cloverRec.M[1669]++;
		assert((((classe!=null)) && (++__CLOVER_275_0.cloverRec.CT[7136]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7136]==0&false));
		assert((((type!=null)) && (++__CLOVER_275_0.cloverRec.CT[7137]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7137]==0&false));
		__CLOVER_275_0.cloverRec.S[23417]++;VerifTypeConforme v=new VerifTypeConforme(type,classe);
		//if(!liste_verifications.contains(v))
			__CLOVER_275_0.cloverRec.S[23418]++;liste_verifications.addElement(v);
	}
	
	public void verif_type_conforme(VerifType ancetre,VerifType descendant,Type classe)
	{__CLOVER_275_0.cloverRec.M[1670]++;
		assert((((classe!=null)) && (++__CLOVER_275_0.cloverRec.CT[7138]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7138]==0&false));
		assert((((ancetre!=null)) && (++__CLOVER_275_0.cloverRec.CT[7139]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7139]==0&false));
		assert((((descendant!=null)) && (++__CLOVER_275_0.cloverRec.CT[7140]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7140]==0&false));
		__CLOVER_275_0.cloverRec.S[23419]++;VerifTypeConforme v=new VerifTypeConforme(ancetre,descendant,classe);
		//if(!liste_verifications.contains(v))
			__CLOVER_275_0.cloverRec.S[23420]++;liste_verifications.addElement(v);
	}

	public void verif_methode_creation(VerifType nom_classe,
			NomFeature nom,Position pos)
	{__CLOVER_275_0.cloverRec.M[1671]++;
		assert((((nom_classe!=null)) && (++__CLOVER_275_0.cloverRec.CT[7141]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7141]==0&false));
		assert((((nom!=null)) && (++__CLOVER_275_0.cloverRec.CT[7142]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7142]==0&false));
		assert((((pos!=null)) && (++__CLOVER_275_0.cloverRec.CT[7143]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7143]==0&false));
		__CLOVER_275_0.cloverRec.S[23421]++;VerifMethodeCreation v=new VerifMethodeCreation(nom_classe,nom,pos);
		__CLOVER_275_0.cloverRec.S[23422]++;if((((!liste_verifications.contains(v)) && (++__CLOVER_275_0.cloverRec.CT[7144]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7144]==0&false)))
			{__CLOVER_275_0.cloverRec.S[23423]++;liste_verifications.addElement(v);
	}}
	
	public void verif_inspect(VerifType type_expr,
			Vector liste_cas,Position pos)
	{__CLOVER_275_0.cloverRec.M[1672]++;
		assert((((type_expr!=null)) && (++__CLOVER_275_0.cloverRec.CT[7145]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7145]==0&false));
		assert((((liste_cas!=null)) && (++__CLOVER_275_0.cloverRec.CT[7146]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7146]==0&false));
		assert((((pos!=null)) && (++__CLOVER_275_0.cloverRec.CT[7147]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7147]==0&false));
		__CLOVER_275_0.cloverRec.S[23424]++;VerifInspect v=new VerifInspect(type_expr,liste_cas,pos);
		//if(!liste_verifications.contains(v))
			__CLOVER_275_0.cloverRec.S[23425]++;liste_verifications.addElement(v);
	}
	
	public void toXML(PrintStream out)
	{__CLOVER_275_0.cloverRec.M[1673]++;
		__CLOVER_275_0.cloverRec.S[23426]++;int i;
		__CLOVER_275_0.cloverRec.S[23427]++;VerifClasseExiste v;
		__CLOVER_275_0.cloverRec.S[23428]++;VerifAttributExiste v2;
		__CLOVER_275_0.cloverRec.S[23429]++;VerifAttributConflit v3;
		__CLOVER_275_0.cloverRec.S[23430]++;VerifMethodeCreation v4;
		__CLOVER_275_0.cloverRec.S[23431]++;VerifTypeConforme v5;
		__CLOVER_275_0.cloverRec.S[23432]++;VerifMethode v6;
		assert((((out!=null)) && (++__CLOVER_275_0.cloverRec.CT[7148]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7148]==0&false));
		__CLOVER_275_0.cloverRec.S[23433]++;out.println("<!DOCTYPE classe SYSTEM \"..\\..\\..\\test_unitaire\\verif.dtd\">");
		__CLOVER_275_0.cloverRec.S[23434]++;out.println("<classe nom=\""+nom_classe+"\">");
		__CLOVER_275_0.cloverRec.S[23435]++;out.println("<liste_verification>");
		__CLOVER_275_0.cloverRec.S[23436]++;for(i=0;(((i<liste_verifications.size()) && (++__CLOVER_275_0.cloverRec.CT[7149]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7149]==0&false));i++)
		{{
			__CLOVER_275_0.cloverRec.S[23437]++;if((((liste_verifications.elementAt(i) instanceof VerifClasseExiste) && (++__CLOVER_275_0.cloverRec.CT[7150]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7150]==0&false)))
			{{
				__CLOVER_275_0.cloverRec.S[23438]++;v=(VerifClasseExiste)liste_verifications.elementAt(i);
				__CLOVER_275_0.cloverRec.S[23439]++;v.toXML(out);
			}
			}else {__CLOVER_275_0.cloverRec.S[23440]++;if((((liste_verifications.elementAt(i) instanceof VerifAttributExiste) && (++__CLOVER_275_0.cloverRec.CT[7151]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7151]==0&false)))
			{{
				__CLOVER_275_0.cloverRec.S[23441]++;v2=(VerifAttributExiste)liste_verifications.elementAt(i);
				__CLOVER_275_0.cloverRec.S[23442]++;v2.toXML(out);
			}
			}else {__CLOVER_275_0.cloverRec.S[23443]++;if((((liste_verifications.elementAt(i) instanceof VerifAttributConflit) && (++__CLOVER_275_0.cloverRec.CT[7152]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7152]==0&false)))
			{{
				__CLOVER_275_0.cloverRec.S[23444]++;v3=(VerifAttributConflit)liste_verifications.elementAt(i);
				__CLOVER_275_0.cloverRec.S[23445]++;v3.toXML(out);
			}
			}else {__CLOVER_275_0.cloverRec.S[23446]++;if((((liste_verifications.elementAt(i) instanceof VerifMethodeCreation) && (++__CLOVER_275_0.cloverRec.CT[7153]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7153]==0&false)))
			{{
				__CLOVER_275_0.cloverRec.S[23447]++;v4=(VerifMethodeCreation)liste_verifications.elementAt(i);
				__CLOVER_275_0.cloverRec.S[23448]++;v4.toXML(out);
			}
			}else {__CLOVER_275_0.cloverRec.S[23449]++;if((((liste_verifications.elementAt(i) instanceof VerifTypeConforme) && (++__CLOVER_275_0.cloverRec.CT[7154]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7154]==0&false)))
			{{
				__CLOVER_275_0.cloverRec.S[23450]++;v5=(VerifTypeConforme)liste_verifications.elementAt(i);
				__CLOVER_275_0.cloverRec.S[23451]++;v5.toXML(out);
			}
			}else {__CLOVER_275_0.cloverRec.S[23452]++;if((((liste_verifications.elementAt(i) instanceof VerifMethode) && (++__CLOVER_275_0.cloverRec.CT[7155]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7155]==0&false)))
			{{
				__CLOVER_275_0.cloverRec.S[23453]++;v6=(VerifMethode)liste_verifications.elementAt(i);
				__CLOVER_275_0.cloverRec.S[23454]++;v6.toXML(out);
			}
		}}}}}}}
		}__CLOVER_275_0.cloverRec.S[23455]++;out.println("</liste_verification>");
		__CLOVER_275_0.cloverRec.S[23456]++;out.println("</classe>");
	}

	/**
	 * @param chemin_fichier
	 */
	public void genere_xml(String chemin_fichier) {__CLOVER_275_0.cloverRec.M[1674]++;
		__CLOVER_275_0.cloverRec.S[23457]++;PrintStream out2;
		__CLOVER_275_0.cloverRec.S[23458]++;OutputStream out;
		__CLOVER_275_0.cloverRec.S[23459]++;String chemin_fichier2;
		assert((((chemin_fichier!=null)) && (++__CLOVER_275_0.cloverRec.CT[7156]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7156]==0&false));
		assert((((chemin_fichier.length()>0)) && (++__CLOVER_275_0.cloverRec.CT[7157]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7157]==0&false));
		__CLOVER_275_0.cloverRec.S[23460]++;try {
			__CLOVER_275_0.cloverRec.S[23461]++;chemin_fichier2=chemin_fichier.replaceAll("\\.e",".xml");
			assert((((!chemin_fichier.equals(chemin_fichier2))) && (++__CLOVER_275_0.cloverRec.CT[7158]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7158]==0&false)):chemin_fichier+"="+chemin_fichier2;
			__CLOVER_275_0.cloverRec.S[23462]++;out=new FileOutputStream(chemin_fichier2);
			__CLOVER_275_0.cloverRec.S[23463]++;out2=new PrintStream(out);
			__CLOVER_275_0.cloverRec.S[23464]++;toXML(out2);
			__CLOVER_275_0.cloverRec.S[23465]++;out2.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			__CLOVER_275_0.cloverRec.S[23466]++;e.printStackTrace();
			assert((((false)) && (++__CLOVER_275_0.cloverRec.CT[7159]!=0|true)) || (++__CLOVER_275_0.cloverRec.CF[7159]==0&false)):"Erreur:"+e;
		}
		
		
	}
	
}
