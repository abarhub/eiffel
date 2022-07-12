/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ *//*
 * Created on 24 avr. 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package tinyeiffel.verification;

import java.util.*;
import tinyeiffel.verification.type_verif.*;
import tinyeiffel.compiler.Logging;
import tinyeiffel.erreur.*;
import tinyeiffel.ast.*;

/**
 * @author Barret
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 * 
 */
public class VerificationsGlobales {static class __CLOVER_276_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}

	Map liste_verifications;
	Vector liste_classe_existe;
	Vector liste_attribut_existe;
	Vector liste_attribut_conflit;
	Vector liste_methode;
	Vector liste_methode_creation;
	Vector liste_type_conforme;
	Vector liste_inspect;
	Logging logging;
	
	public VerificationsGlobales(Logging logging)
	{__CLOVER_276_0.cloverRec.M[1675]++;
		assert((((logging!=null)) && (++__CLOVER_276_0.cloverRec.CT[7160]!=0|true)) || (++__CLOVER_276_0.cloverRec.CF[7160]==0&false));
		__CLOVER_276_0.cloverRec.S[23467]++;liste_verifications=new HashMap();
		__CLOVER_276_0.cloverRec.S[23468]++;liste_classe_existe=new Vector();
		__CLOVER_276_0.cloverRec.S[23469]++;liste_attribut_existe=new Vector();
		__CLOVER_276_0.cloverRec.S[23470]++;liste_attribut_conflit=new Vector();
		__CLOVER_276_0.cloverRec.S[23471]++;liste_methode=new Vector();
		__CLOVER_276_0.cloverRec.S[23472]++;liste_methode_creation=new Vector();
		__CLOVER_276_0.cloverRec.S[23473]++;liste_type_conforme=new Vector();
		__CLOVER_276_0.cloverRec.S[23474]++;liste_inspect=new Vector();
		__CLOVER_276_0.cloverRec.S[23475]++;this.logging=logging;
	}
	
	public void ajoute(Verifications v)
	{__CLOVER_276_0.cloverRec.M[1676]++;
		__CLOVER_276_0.cloverRec.S[23476]++;int i;
		__CLOVER_276_0.cloverRec.S[23477]++;Verif verif;
		__CLOVER_276_0.cloverRec.S[23478]++;Vector liste;
		assert((((v!=null)) && (++__CLOVER_276_0.cloverRec.CT[7161]!=0|true)) || (++__CLOVER_276_0.cloverRec.CF[7161]==0&false));
		__CLOVER_276_0.cloverRec.S[23479]++;liste=v.liste_verifications;
		__CLOVER_276_0.cloverRec.S[23480]++;liste_verifications.put(v.nom_classe.nom.toUpperCase(),v);
		__CLOVER_276_0.cloverRec.S[23481]++;for(i=0;(((i<liste.size()) && (++__CLOVER_276_0.cloverRec.CT[7162]!=0|true)) || (++__CLOVER_276_0.cloverRec.CF[7162]==0&false));i++)
		{{
			__CLOVER_276_0.cloverRec.S[23482]++;verif=(Verif)liste.elementAt(i);
			__CLOVER_276_0.cloverRec.S[23483]++;if((((verif instanceof VerifClasseExiste) && (++__CLOVER_276_0.cloverRec.CT[7163]!=0|true)) || (++__CLOVER_276_0.cloverRec.CF[7163]==0&false)))
			{{
				__CLOVER_276_0.cloverRec.S[23484]++;if((((!liste_classe_existe.contains(verif)) && (++__CLOVER_276_0.cloverRec.CT[7164]!=0|true)) || (++__CLOVER_276_0.cloverRec.CF[7164]==0&false)))
					{__CLOVER_276_0.cloverRec.S[23485]++;liste_classe_existe.addElement(verif);
			}}
			}else {__CLOVER_276_0.cloverRec.S[23486]++;if((((verif instanceof VerifAttributExiste) && (++__CLOVER_276_0.cloverRec.CT[7165]!=0|true)) || (++__CLOVER_276_0.cloverRec.CF[7165]==0&false)))
			{{
				__CLOVER_276_0.cloverRec.S[23487]++;if((((!liste_attribut_existe.contains(verif)) && (++__CLOVER_276_0.cloverRec.CT[7166]!=0|true)) || (++__CLOVER_276_0.cloverRec.CF[7166]==0&false)))
					{__CLOVER_276_0.cloverRec.S[23488]++;liste_attribut_existe.addElement(verif);
			}}
			}else {__CLOVER_276_0.cloverRec.S[23489]++;if((((verif instanceof VerifAttributConflit) && (++__CLOVER_276_0.cloverRec.CT[7167]!=0|true)) || (++__CLOVER_276_0.cloverRec.CF[7167]==0&false)))
			{{
				__CLOVER_276_0.cloverRec.S[23490]++;if((((!liste_attribut_conflit.contains(verif)) && (++__CLOVER_276_0.cloverRec.CT[7168]!=0|true)) || (++__CLOVER_276_0.cloverRec.CF[7168]==0&false)))
					{__CLOVER_276_0.cloverRec.S[23491]++;liste_attribut_conflit.addElement(verif);
			}}
			}else {__CLOVER_276_0.cloverRec.S[23492]++;if((((verif instanceof VerifMethode) && (++__CLOVER_276_0.cloverRec.CT[7169]!=0|true)) || (++__CLOVER_276_0.cloverRec.CF[7169]==0&false)))
			{{
				__CLOVER_276_0.cloverRec.S[23493]++;if((((!liste_methode.contains(verif)) && (++__CLOVER_276_0.cloverRec.CT[7170]!=0|true)) || (++__CLOVER_276_0.cloverRec.CF[7170]==0&false)))
					{__CLOVER_276_0.cloverRec.S[23494]++;liste_methode.addElement(verif);
			}}
			}else {__CLOVER_276_0.cloverRec.S[23495]++;if((((verif instanceof VerifTypeConforme) && (++__CLOVER_276_0.cloverRec.CT[7171]!=0|true)) || (++__CLOVER_276_0.cloverRec.CF[7171]==0&false)))
			{{
				__CLOVER_276_0.cloverRec.S[23496]++;if((((!liste_type_conforme.contains(verif)) && (++__CLOVER_276_0.cloverRec.CT[7172]!=0|true)) || (++__CLOVER_276_0.cloverRec.CF[7172]==0&false)))
					{__CLOVER_276_0.cloverRec.S[23497]++;liste_type_conforme.addElement(verif);
			}}
			}else {__CLOVER_276_0.cloverRec.S[23498]++;if((((verif instanceof VerifMethodeCreation) && (++__CLOVER_276_0.cloverRec.CT[7173]!=0|true)) || (++__CLOVER_276_0.cloverRec.CF[7173]==0&false)))
			{{
				__CLOVER_276_0.cloverRec.S[23499]++;if((((!liste_methode_creation.contains(verif)) && (++__CLOVER_276_0.cloverRec.CT[7174]!=0|true)) || (++__CLOVER_276_0.cloverRec.CF[7174]==0&false)))
					{__CLOVER_276_0.cloverRec.S[23500]++;liste_methode_creation.addElement(verif);
			}}
			}else {__CLOVER_276_0.cloverRec.S[23501]++;if((((verif instanceof VerifInspect) && (++__CLOVER_276_0.cloverRec.CT[7175]!=0|true)) || (++__CLOVER_276_0.cloverRec.CF[7175]==0&false)))
			{{
				__CLOVER_276_0.cloverRec.S[23502]++;if((((!liste_inspect.contains(verif)) && (++__CLOVER_276_0.cloverRec.CT[7176]!=0|true)) || (++__CLOVER_276_0.cloverRec.CF[7176]==0&false)))
					{__CLOVER_276_0.cloverRec.S[23503]++;liste_inspect.addElement(verif);
			}}
			}else
			{{
				assert((((false)) && (++__CLOVER_276_0.cloverRec.CT[7177]!=0|true)) || (++__CLOVER_276_0.cloverRec.CF[7177]==0&false));
			}
		}}}}}}}}
	}}
	
	public boolean traitement()
	{__CLOVER_276_0.cloverRec.M[1677]++;
		__CLOVER_276_0.cloverRec.S[23504]++;int i;
		__CLOVER_276_0.cloverRec.S[23505]++;Verif v;
		__CLOVER_276_0.cloverRec.S[23506]++;Verifications verif;
		__CLOVER_276_0.cloverRec.S[23507]++;VerifClasseExiste v1;
		__CLOVER_276_0.cloverRec.S[23508]++;VerifAttributExiste v2;
		__CLOVER_276_0.cloverRec.S[23509]++;VerifAttributConflit v3;
		__CLOVER_276_0.cloverRec.S[23510]++;boolean res=true;
		assert((((liste_verifications!=null)) && (++__CLOVER_276_0.cloverRec.CT[7178]!=0|true)) || (++__CLOVER_276_0.cloverRec.CF[7178]==0&false));
		__CLOVER_276_0.cloverRec.S[23511]++;for(i=0;(((i<liste_classe_existe.size()) && (++__CLOVER_276_0.cloverRec.CT[7179]!=0|true)) || (++__CLOVER_276_0.cloverRec.CF[7179]==0&false));i++)
		{{
			__CLOVER_276_0.cloverRec.S[23512]++;v1=(VerifClasseExiste)liste_classe_existe.elementAt(i);
			__CLOVER_276_0.cloverRec.S[23513]++;verif=cherche_classe(v1.classe);
			__CLOVER_276_0.cloverRec.S[23514]++;if((((verif==null) && (++__CLOVER_276_0.cloverRec.CT[7180]!=0|true)) || (++__CLOVER_276_0.cloverRec.CF[7180]==0&false)))
			{{
				__CLOVER_276_0.cloverRec.S[23515]++;logging.erreur(new ErreurVTCT(v1.classe,v1.pos));
				__CLOVER_276_0.cloverRec.S[23516]++;res=false;
				// TODO:donc on supprime les erreurs associ\u00e9s a la classe v1.classe
			}
			}else
			{{
				__CLOVER_276_0.cloverRec.S[23517]++;v1.set_ok();
			}
		}}
		}__CLOVER_276_0.cloverRec.S[23518]++;for(i=0;(((i<liste_attribut_existe.size()) && (++__CLOVER_276_0.cloverRec.CT[7181]!=0|true)) || (++__CLOVER_276_0.cloverRec.CF[7181]==0&false));i++)
		{{
			__CLOVER_276_0.cloverRec.S[23519]++;v2=(VerifAttributExiste)liste_attribut_existe.elementAt(i);
			__CLOVER_276_0.cloverRec.S[23520]++;verif=cherche_classe(v2.classe);
			assert((((verif!=null)) && (++__CLOVER_276_0.cloverRec.CT[7182]!=0|true)) || (++__CLOVER_276_0.cloverRec.CF[7182]==0&false));
			__CLOVER_276_0.cloverRec.S[23521]++;if((((!verif.liste_attribut.containsKey(v2.nom_attribut)) && (++__CLOVER_276_0.cloverRec.CT[7183]!=0|true)) || (++__CLOVER_276_0.cloverRec.CF[7183]==0&false)))
			{{
				__CLOVER_276_0.cloverRec.S[23522]++;logging.erreur(new ErreurVEEN(v2.classe,v2.nom_attribut,v2.pos));
				__CLOVER_276_0.cloverRec.S[23523]++;res=false;
			}
			}else
			{{
				__CLOVER_276_0.cloverRec.S[23524]++;v2.set_ok();
			}
		}}
		}__CLOVER_276_0.cloverRec.S[23525]++;for(i=0;(((i<liste_attribut_conflit.size()) && (++__CLOVER_276_0.cloverRec.CT[7184]!=0|true)) || (++__CLOVER_276_0.cloverRec.CF[7184]==0&false));i++)
		{{
			__CLOVER_276_0.cloverRec.S[23526]++;v3=(VerifAttributConflit)liste_attribut_conflit.elementAt(i);
			__CLOVER_276_0.cloverRec.S[23527]++;verif=cherche_classe(v3.classe);
			assert((((verif!=null)) && (++__CLOVER_276_0.cloverRec.CT[7185]!=0|true)) || (++__CLOVER_276_0.cloverRec.CF[7185]==0&false));
			__CLOVER_276_0.cloverRec.S[23528]++;if((((verif.liste_attribut.containsKey(v3.nom_attribut.toString())) && (++__CLOVER_276_0.cloverRec.CT[7186]!=0|true)) || (++__CLOVER_276_0.cloverRec.CF[7186]==0&false)))
			{{
				__CLOVER_276_0.cloverRec.S[23529]++;VerifAttribut v0=(VerifAttribut)verif.liste_attribut.get(v3.nom_attribut.toString());
				__CLOVER_276_0.cloverRec.S[23530]++;logging.erreur(new ErreurVFFD2(v3.classe,v3.nom_attribut,
						v0.debut(),v3.pos));
				__CLOVER_276_0.cloverRec.S[23531]++;res=false;
			}
			}else
			{{
				__CLOVER_276_0.cloverRec.S[23532]++;v3.set_ok();
			}
		}}
		}__CLOVER_276_0.cloverRec.S[23533]++;if((((res) && (++__CLOVER_276_0.cloverRec.CT[7187]!=0|true)) || (++__CLOVER_276_0.cloverRec.CF[7187]==0&false)))
		{{
			__CLOVER_276_0.cloverRec.S[23534]++;boolean b;
			__CLOVER_276_0.cloverRec.S[23535]++;b=verification_methodes();
			__CLOVER_276_0.cloverRec.S[23536]++;if((((!b) && (++__CLOVER_276_0.cloverRec.CT[7188]!=0|true)) || (++__CLOVER_276_0.cloverRec.CF[7188]==0&false)))
				{__CLOVER_276_0.cloverRec.S[23537]++;res=false;
		}}
		}__CLOVER_276_0.cloverRec.S[23538]++;return res;
	}
	
	public boolean verification_methodes()
	{__CLOVER_276_0.cloverRec.M[1678]++;
		__CLOVER_276_0.cloverRec.S[23539]++;int i,j;
		__CLOVER_276_0.cloverRec.S[23540]++;VerifMethode vm;
		__CLOVER_276_0.cloverRec.S[23541]++;Verifications verif;
		__CLOVER_276_0.cloverRec.S[23542]++;VerifAttribut va;
		__CLOVER_276_0.cloverRec.S[23543]++;VerifTypeConforme vtc1,vtc2;
		__CLOVER_276_0.cloverRec.S[23544]++;VerifType vt1,vt2;
		__CLOVER_276_0.cloverRec.S[23545]++;for(i=0;(((i<liste_methode.size()) && (++__CLOVER_276_0.cloverRec.CT[7189]!=0|true)) || (++__CLOVER_276_0.cloverRec.CF[7189]==0&false));i++)
		{{
			__CLOVER_276_0.cloverRec.S[23546]++;vm=(VerifMethode)liste_methode.elementAt(i);
			assert((((vm.nom_classe!=null)) && (++__CLOVER_276_0.cloverRec.CT[7190]!=0|true)) || (++__CLOVER_276_0.cloverRec.CF[7190]==0&false));
			__CLOVER_276_0.cloverRec.S[23547]++;if((((vm.nom_classe.a_type_reel()&&!vm.get_ok()) && (++__CLOVER_276_0.cloverRec.CT[7191]!=0|true)) || (++__CLOVER_276_0.cloverRec.CF[7191]==0&false)))
			{{
				__CLOVER_276_0.cloverRec.S[23548]++;verif=cherche_classe(vm.nom_classe.get_type_reel().nom);
				assert((((verif!=null)) && (++__CLOVER_276_0.cloverRec.CT[7192]!=0|true)) || (++__CLOVER_276_0.cloverRec.CF[7192]==0&false));
				__CLOVER_276_0.cloverRec.S[23549]++;va=cherche_attribut(verif,vm.nom);
				__CLOVER_276_0.cloverRec.S[23550]++;if((((va!=null) && (++__CLOVER_276_0.cloverRec.CT[7193]!=0|true)) || (++__CLOVER_276_0.cloverRec.CF[7193]==0&false)))
				{{// TODO: a terminer
					__CLOVER_276_0.cloverRec.S[23551]++;boolean erreur=false;
					__CLOVER_276_0.cloverRec.S[23552]++;if((((vm.param==null||vm.param.length==0) && (++__CLOVER_276_0.cloverRec.CT[7194]!=0|true)) || (++__CLOVER_276_0.cloverRec.CF[7194]==0&false)))
					{{
						__CLOVER_276_0.cloverRec.S[23553]++;if((((va.param==null||va.param.length==0) && (++__CLOVER_276_0.cloverRec.CT[7195]!=0|true)) || (++__CLOVER_276_0.cloverRec.CF[7195]==0&false)))
						{{
							
						}
						}else
						{{// Erreur
							__CLOVER_276_0.cloverRec.S[23554]++;erreur=true;
							__CLOVER_276_0.cloverRec.S[23555]++;logging.erreur(new ErreurVUAR1(vm.nom,
									verif.nom_classe(),va.param.length,va.debut(),
									vm.nom_classe.get_type_reel().nom,0,vm.pos));
						}
					}}
					}else
					{{
						__CLOVER_276_0.cloverRec.S[23556]++;if((((va.param==null||va.param.length!=vm.param.length) && (++__CLOVER_276_0.cloverRec.CT[7196]!=0|true)) || (++__CLOVER_276_0.cloverRec.CF[7196]==0&false)))
						{{// Erreur
							__CLOVER_276_0.cloverRec.S[23557]++;erreur=true;
							__CLOVER_276_0.cloverRec.S[23558]++;logging.erreur(new ErreurVUAR1(vm.nom,
									verif.nom_classe(),0,va.debut(),
									vm.nom_classe.get_type_reel().nom,vm.param.length,vm.pos));
						}
						}else
						{{
							__CLOVER_276_0.cloverRec.S[23559]++;for(j=0;(((j<vm.param.length) && (++__CLOVER_276_0.cloverRec.CT[7197]!=0|true)) || (++__CLOVER_276_0.cloverRec.CF[7197]==0&false));j++)
							{{
								__CLOVER_276_0.cloverRec.S[23560]++;vm.param[j].set_type_reel(va.param[j].getType());
							}
						}}
					}}
					}__CLOVER_276_0.cloverRec.S[23561]++;if((((!erreur) && (++__CLOVER_276_0.cloverRec.CT[7198]!=0|true)) || (++__CLOVER_276_0.cloverRec.CF[7198]==0&false)))
					{{
						__CLOVER_276_0.cloverRec.S[23562]++;if((((vm.type_retour==null) && (++__CLOVER_276_0.cloverRec.CT[7199]!=0|true)) || (++__CLOVER_276_0.cloverRec.CF[7199]==0&false)))
						{{
							__CLOVER_276_0.cloverRec.S[23563]++;if((((va.type_retour==null) && (++__CLOVER_276_0.cloverRec.CT[7200]!=0|true)) || (++__CLOVER_276_0.cloverRec.CF[7200]==0&false)))
							{{
								
							}
							}else
							{{// Erreur
								__CLOVER_276_0.cloverRec.S[23564]++;logging.erreur(new ErreurVUAR1(vm.nom,
										verif.nom_classe(),-1,va.debut(),
										vm.nom_classe.get_type_reel().nom,0,vm.pos));
							}
						}}
						}else
						{{
							__CLOVER_276_0.cloverRec.S[23565]++;if((((va.type_retour==null) && (++__CLOVER_276_0.cloverRec.CT[7201]!=0|true)) || (++__CLOVER_276_0.cloverRec.CF[7201]==0&false)))
							{{// Erreur
								__CLOVER_276_0.cloverRec.S[23566]++;logging.erreur(new ErreurVUAR1(vm.nom,
										verif.nom_classe(),0,va.debut(),
										vm.nom_classe.get_type_reel().nom,-1,vm.pos));
							}
							}else
							{{
								//types_compatibles(va.type_retour,vm.type_retour.get_type_reel());
								__CLOVER_276_0.cloverRec.S[23567]++;vm.type_retour.set_type_reel(va.type_retour);
							}
						}}
					}}
				}}
				}else
				{{
					assert((((false)) && (++__CLOVER_276_0.cloverRec.CT[7202]!=0|true)) || (++__CLOVER_276_0.cloverRec.CF[7202]==0&false)):"classe:"+verif.nom_classe()+",methode="+vm.nom+" non trouv\u00e9e";
				}
				}__CLOVER_276_0.cloverRec.S[23568]++;vm.set_ok();
			}
		}}
		}__CLOVER_276_0.cloverRec.S[23569]++;for(i=0;(((i<liste_type_conforme.size()) && (++__CLOVER_276_0.cloverRec.CT[7203]!=0|true)) || (++__CLOVER_276_0.cloverRec.CF[7203]==0&false));i++)
		{{
			__CLOVER_276_0.cloverRec.S[23570]++;vtc1=(VerifTypeConforme)liste_type_conforme.elementAt(i);
			__CLOVER_276_0.cloverRec.S[23571]++;vt1=vtc1.type_ancetre;
			__CLOVER_276_0.cloverRec.S[23572]++;vt2=vtc1.type_descendant;
			__CLOVER_276_0.cloverRec.S[23573]++;if((((vt1!=null) && (++__CLOVER_276_0.cloverRec.CT[7204]!=0|true)) || (++__CLOVER_276_0.cloverRec.CF[7204]==0&false)))
			{{// V\u00e9rifie que vt1 est un ancetre de vt2
				
			}
			}else
			{{// V\u00e9rifie que vt2 n'a pas de type
				
			}
		}}
		}__CLOVER_276_0.cloverRec.S[23574]++;return true;
	}
	
	boolean heritage[][]=null;
	String liste_type[]=null;
	
	public boolean type_compatible(Type t1,Type t2)
	{__CLOVER_276_0.cloverRec.M[1679]++;
		__CLOVER_276_0.cloverRec.S[23575]++;boolean res;
		assert((((t1!=null)) && (++__CLOVER_276_0.cloverRec.CT[7205]!=0|true)) || (++__CLOVER_276_0.cloverRec.CF[7205]==0&false));
		assert((((t2!=null)) && (++__CLOVER_276_0.cloverRec.CT[7206]!=0|true)) || (++__CLOVER_276_0.cloverRec.CF[7206]==0&false));
		__CLOVER_276_0.cloverRec.S[23576]++;if((((heritage==null) && (++__CLOVER_276_0.cloverRec.CT[7207]!=0|true)) || (++__CLOVER_276_0.cloverRec.CF[7207]==0&false)))
		{{
			__CLOVER_276_0.cloverRec.S[23577]++;int len_type,i,j;
			__CLOVER_276_0.cloverRec.S[23578]++;Verifications v,v2;
			__CLOVER_276_0.cloverRec.S[23579]++;Set ens_type;
			__CLOVER_276_0.cloverRec.S[23580]++;String s1,s2;
			__CLOVER_276_0.cloverRec.S[23581]++;len_type=liste_verifications.size();
			__CLOVER_276_0.cloverRec.S[23582]++;ens_type=liste_verifications.keySet();
			__CLOVER_276_0.cloverRec.S[23583]++;liste_type=new String[len_type];
			__CLOVER_276_0.cloverRec.S[23584]++;heritage=new boolean[len_type][len_type];
			__CLOVER_276_0.cloverRec.S[23585]++;liste_type=(String[])ens_type.toArray();
			__CLOVER_276_0.cloverRec.S[23586]++;for(i=0;(((i<len_type) && (++__CLOVER_276_0.cloverRec.CT[7208]!=0|true)) || (++__CLOVER_276_0.cloverRec.CF[7208]==0&false));i++)
			{{
				__CLOVER_276_0.cloverRec.S[23587]++;s1=liste_type[i];
				
				__CLOVER_276_0.cloverRec.S[23588]++;for(j=0;(((j<len_type) && (++__CLOVER_276_0.cloverRec.CT[7209]!=0|true)) || (++__CLOVER_276_0.cloverRec.CF[7209]==0&false));j++)
				{{
					
				}
			}}
		}}
		}__CLOVER_276_0.cloverRec.S[23589]++;res=true;
		__CLOVER_276_0.cloverRec.S[23590]++;return res;
	}

	int indice(String liste[],String elt)
	{__CLOVER_276_0.cloverRec.M[1680]++;
		__CLOVER_276_0.cloverRec.S[23591]++;int i;
		assert((((liste!=null)) && (++__CLOVER_276_0.cloverRec.CT[7210]!=0|true)) || (++__CLOVER_276_0.cloverRec.CF[7210]==0&false));
		assert((((elt!=null)) && (++__CLOVER_276_0.cloverRec.CT[7211]!=0|true)) || (++__CLOVER_276_0.cloverRec.CF[7211]==0&false));
		__CLOVER_276_0.cloverRec.S[23592]++;for(i=0;(((i<liste.length) && (++__CLOVER_276_0.cloverRec.CT[7212]!=0|true)) || (++__CLOVER_276_0.cloverRec.CF[7212]==0&false));i++)
		{{
			__CLOVER_276_0.cloverRec.S[23593]++;if((((elt.equalsIgnoreCase(liste[i])) && (++__CLOVER_276_0.cloverRec.CT[7213]!=0|true)) || (++__CLOVER_276_0.cloverRec.CF[7213]==0&false)))
				{__CLOVER_276_0.cloverRec.S[23594]++;return i;
		}}
		}__CLOVER_276_0.cloverRec.S[23595]++;return -1;
	}
	
	public VerifAttribut cherche_attribut(Verifications classe,NomFeature nom)
	{__CLOVER_276_0.cloverRec.M[1681]++;
		__CLOVER_276_0.cloverRec.S[23596]++;VerifAttribut res,tmp;
		
		assert((((classe!=null)) && (++__CLOVER_276_0.cloverRec.CT[7214]!=0|true)) || (++__CLOVER_276_0.cloverRec.CF[7214]==0&false));
		assert((((nom!=null)) && (++__CLOVER_276_0.cloverRec.CT[7215]!=0|true)) || (++__CLOVER_276_0.cloverRec.CF[7215]==0&false));
		__CLOVER_276_0.cloverRec.S[23597]++;if((((classe.liste_attribut.containsKey(nom.toString())) && (++__CLOVER_276_0.cloverRec.CT[7216]!=0|true)) || (++__CLOVER_276_0.cloverRec.CF[7216]==0&false)))
		{{
			__CLOVER_276_0.cloverRec.S[23598]++;res=(VerifAttribut)classe.liste_attribut.get(nom.toString());
		}
		}else
		{{
			// recherche dans les ancetres
			__CLOVER_276_0.cloverRec.S[23599]++;if((((classe.liste_heritage!=null&&
				classe.liste_heritage.length>0) && (++__CLOVER_276_0.cloverRec.CT[7217]!=0|true)) || (++__CLOVER_276_0.cloverRec.CF[7217]==0&false)))
			{{
				__CLOVER_276_0.cloverRec.S[23600]++;int i;
				__CLOVER_276_0.cloverRec.S[23601]++;Verifications cl;
				__CLOVER_276_0.cloverRec.S[23602]++;Heritage h;
				__CLOVER_276_0.cloverRec.S[23603]++;NomFeature n;
				__CLOVER_276_0.cloverRec.S[23604]++;res=null;
				__CLOVER_276_0.cloverRec.S[23605]++;for(i=0;(((i<classe.liste_heritage.length) && (++__CLOVER_276_0.cloverRec.CT[7218]!=0|true)) || (++__CLOVER_276_0.cloverRec.CF[7218]==0&false));i++)
				{{
					__CLOVER_276_0.cloverRec.S[23606]++;h=classe.liste_heritage[i];
					__CLOVER_276_0.cloverRec.S[23607]++;n=nom;
					__CLOVER_276_0.cloverRec.S[23608]++;cl=cherche_classe(h.type.nom);
					assert((((cl!=null)) && (++__CLOVER_276_0.cloverRec.CT[7219]!=0|true)) || (++__CLOVER_276_0.cloverRec.CF[7219]==0&false));
					__CLOVER_276_0.cloverRec.S[23609]++;if((((h.rename!=null&&h.rename.length>0) && (++__CLOVER_276_0.cloverRec.CT[7220]!=0|true)) || (++__CLOVER_276_0.cloverRec.CF[7220]==0&false)))
					{{// TODO: prendre en compte le renomage
						__CLOVER_276_0.cloverRec.S[23610]++;int j;
						__CLOVER_276_0.cloverRec.S[23611]++;for(j=0;(((j<h.rename.length) && (++__CLOVER_276_0.cloverRec.CT[7221]!=0|true)) || (++__CLOVER_276_0.cloverRec.CF[7221]==0&false));j++)
						{{
							__CLOVER_276_0.cloverRec.S[23612]++;if((((h.rename[j].nom_dest.equals(n)) && (++__CLOVER_276_0.cloverRec.CT[7222]!=0|true)) || (++__CLOVER_276_0.cloverRec.CF[7222]==0&false)))
							{{
								__CLOVER_276_0.cloverRec.S[23613]++;n=h.rename[j].nom_src;
								__CLOVER_276_0.cloverRec.S[23614]++;break;
							}
						}}
					}}
					}__CLOVER_276_0.cloverRec.S[23615]++;tmp=cherche_attribut(cl,n);
					__CLOVER_276_0.cloverRec.S[23616]++;if((((tmp!=null) && (++__CLOVER_276_0.cloverRec.CT[7223]!=0|true)) || (++__CLOVER_276_0.cloverRec.CF[7223]==0&false)))
					{{
						__CLOVER_276_0.cloverRec.S[23617]++;res=tmp;
						__CLOVER_276_0.cloverRec.S[23618]++;break;
					}
				}}
			}}
			}else
			{{
				__CLOVER_276_0.cloverRec.S[23619]++;if((((classe.nom_classe.nom.equalsIgnoreCase("any")||
					classe.nom_classe.nom.equalsIgnoreCase("general")||
					classe.nom_classe.nom.equalsIgnoreCase("plateform")) && (++__CLOVER_276_0.cloverRec.CT[7224]!=0|true)) || (++__CLOVER_276_0.cloverRec.CF[7224]==0&false)))
				{{// pour eviter une recherche circulaire
					__CLOVER_276_0.cloverRec.S[23620]++;res=null;
				}
				}else
				{{
					__CLOVER_276_0.cloverRec.S[23621]++;Verifications any;
					__CLOVER_276_0.cloverRec.S[23622]++;any=cherche_classe("any");
					assert((((any!=null)) && (++__CLOVER_276_0.cloverRec.CT[7225]!=0|true)) || (++__CLOVER_276_0.cloverRec.CF[7225]==0&false));
					__CLOVER_276_0.cloverRec.S[23623]++;if((((any.liste_attribut.containsKey(nom.toString())) && (++__CLOVER_276_0.cloverRec.CT[7226]!=0|true)) || (++__CLOVER_276_0.cloverRec.CF[7226]==0&false)))
					{{
						__CLOVER_276_0.cloverRec.S[23624]++;res=(VerifAttribut)any.liste_attribut.get(nom.toString());
					}
					}else
					{{
						__CLOVER_276_0.cloverRec.S[23625]++;res=null;
					}
				}}
			}}
		}}
		}__CLOVER_276_0.cloverRec.S[23626]++;return res;
	}
	
	public Verifications cherche_classe(String nom)
	{__CLOVER_276_0.cloverRec.M[1682]++;
		assert((((liste_verifications!=null)) && (++__CLOVER_276_0.cloverRec.CT[7227]!=0|true)) || (++__CLOVER_276_0.cloverRec.CF[7227]==0&false));
		assert((((nom!=null)) && (++__CLOVER_276_0.cloverRec.CT[7228]!=0|true)) || (++__CLOVER_276_0.cloverRec.CF[7228]==0&false));
		__CLOVER_276_0.cloverRec.S[23627]++;String s=nom.toUpperCase();
		__CLOVER_276_0.cloverRec.S[23628]++;if((((liste_verifications.containsKey(s)) && (++__CLOVER_276_0.cloverRec.CT[7229]!=0|true)) || (++__CLOVER_276_0.cloverRec.CF[7229]==0&false)))
			{__CLOVER_276_0.cloverRec.S[23629]++;return (Verifications)liste_verifications.get(s);
		}else
			{__CLOVER_276_0.cloverRec.S[23630]++;return null;
	}}
	
}
