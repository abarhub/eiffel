/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ *//*
 * Created on 30 sept. 2003
 *
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
package tinyeiffel.compiler;

import tinyeiffel.ast.*;
import tinyeiffel.erreur.*;
import java.util.*;


/**
 * @author BARRET
 *
 * To change the template for this generated type comment go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
public class Attribut_Complet extends Declare_entite {static class __CLOVER_56_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}

	public Attribut_Complet(NomFeature nom,Table_Symbol table)
	{__CLOVER_56_0.cloverRec.M[303]++;
		assert((((nom!=null)) && (++__CLOVER_56_0.cloverRec.CT[593]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[593]==0&false));
		assert((((table!=null)) && (++__CLOVER_56_0.cloverRec.CT[594]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[594]==0&false));
		__CLOVER_56_0.cloverRec.S[1499]++;this.table_symbol=table;
		__CLOVER_56_0.cloverRec.S[1500]++;this.log=table.log;
		__CLOVER_56_0.cloverRec.S[1501]++;this.nom=nom;
		__CLOVER_56_0.cloverRec.S[1502]++;this.classe=table.classe;
		//this.nb_param=-1;
	}

	public boolean meme_attribut(Attribut a)
	{__CLOVER_56_0.cloverRec.M[304]++;
		assert((((a!=null)) && (++__CLOVER_56_0.cloverRec.CT[595]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[595]==0&false));
		assert((((nom!=null)) && (++__CLOVER_56_0.cloverRec.CT[596]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[596]==0&false));
		__CLOVER_56_0.cloverRec.S[1503]++;return a.nom.meme_nom(nom);
	}

	public Type donne_type_retour(Context context)
	{__CLOVER_56_0.cloverRec.M[305]++;// TODO : a terminer
		assert((((context!=null)) && (++__CLOVER_56_0.cloverRec.CT[597]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[597]==0&false));
		/*if(attribut_reel!=null)
			return attribut_reel.feature.type_retour;
		if(attribut_deferred!=null)
			return attribut_deferred[0].feature.type_retour;*/
		//if()
		//\u00e8\u00e7\u00e0\u00e84521-((-
		__CLOVER_56_0.cloverRec.S[1504]++;return signature.getTypeRetour();
/*		if(est_deferred())
		{
			Vector liste=new Vector();
			int i,j;
			Type t,t2;
			boolean trouve;
			if(feature_directe!=null)
				liste.addElement(feature_directe.type_retour);
			if(attribut_ancetre!=null)
			{
				for(i=0;i<attribut_ancetre.length;i++)
				{
					t=attribut_ancetre[i].attribut.donne_type_retour(context);
					assert(t!=null);
					trouve=false;
					for(j=0;j<liste.size();j++)
					{
						t2=(Type)liste.elementAt(j);
						if(t2.egaux(t))
						{// le type t est deja inclus
							trouve=true;
							break;
						}
						else if(context.type_compatible(t2,table_symbol,t,table_symbol))
						{// il y a deja un sous type de t
							trouve=true;
							break;
						}
						else if(context.type_compatible(t,table_symbol,t2,table_symbol))
						{// il y a un sur type de t
							//trouve=true;
							//liste.setElementAt(t,j);
							//break;
							liste.remove(j);
							j--;
						}
					}
					if(!trouve)
					{
						liste.addElement(t);
					}
				}
			}
			
			assert(liste.size()>0);
			assert(liste.size()==1):"Il y a plusieurs types pour "+
						nom+"("+classe.nom+"):"+liste;
			t=(Type)liste.elementAt(0);
			assert(t!=null);
			return t;
		}
		else
		{
			if(no_attribut_reel==-1)
				return feature_directe.type_retour;
			else
			{
				Type t=attribut_ancetre[no_attribut_reel].attribut.donne_type_retour(context);
				assert(t!=null);
				return t;
			}
		}
*/		//return null;
	}

	public String toString(Attribut a)
	{__CLOVER_56_0.cloverRec.M[306]++;
		assert((((a!=null)) && (++__CLOVER_56_0.cloverRec.CT[598]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[598]==0&false));
		__CLOVER_56_0.cloverRec.S[1505]++;String res;
		__CLOVER_56_0.cloverRec.S[1506]++;res=a.toString()+"<"+a.classe.nom+">:"+a.feature.type_retour;
		__CLOVER_56_0.cloverRec.S[1507]++;return res;
	}

	public String toString(Attribut_Heritage a)
	{__CLOVER_56_0.cloverRec.M[307]++;
		assert((((a!=null)) && (++__CLOVER_56_0.cloverRec.CT[599]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[599]==0&false));
		__CLOVER_56_0.cloverRec.S[1508]++;String res;
		__CLOVER_56_0.cloverRec.S[1509]++;res="("+a.attribut.nom+"<"+a.classe.nom+">:"+
				a.signature.retour+")";
		__CLOVER_56_0.cloverRec.S[1510]++;return res;
	}

	public String toString()
	{__CLOVER_56_0.cloverRec.M[308]++;
		__CLOVER_56_0.cloverRec.S[1511]++;String res="Attribut_Complet "+nom+":{directe=";
		__CLOVER_56_0.cloverRec.S[1512]++;if((((attribut_directe!=null) && (++__CLOVER_56_0.cloverRec.CT[600]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[600]==0&false)))
			{__CLOVER_56_0.cloverRec.S[1513]++;res+=toString(attribut_directe);
		}else
			{__CLOVER_56_0.cloverRec.S[1514]++;res+="Aucun";
		}__CLOVER_56_0.cloverRec.S[1515]++;res+=",no_reel="+no_attribut_reel;
		__CLOVER_56_0.cloverRec.S[1516]++;res+=",deferred=";
		__CLOVER_56_0.cloverRec.S[1517]++;if((((attribut_ancetre!=null) && (++__CLOVER_56_0.cloverRec.CT[601]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[601]==0&false)))
		{{
			__CLOVER_56_0.cloverRec.S[1518]++;for(int i=0;(((i<attribut_ancetre.length) && (++__CLOVER_56_0.cloverRec.CT[602]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[602]==0&false));i++)
			{{
				__CLOVER_56_0.cloverRec.S[1519]++;if((((i>0) && (++__CLOVER_56_0.cloverRec.CT[603]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[603]==0&false)))
					{__CLOVER_56_0.cloverRec.S[1520]++;res+=",";
				}__CLOVER_56_0.cloverRec.S[1521]++;res+=toString(attribut_ancetre[i]);
			}
		}}
		}else
		{{
			__CLOVER_56_0.cloverRec.S[1522]++;res+="null";
		}
		}__CLOVER_56_0.cloverRec.S[1523]++;res+="}";
		__CLOVER_56_0.cloverRec.S[1524]++;return res;
	}

	/**
	 * Ajoute un attribut complet venant d'un anctre \u00e0 
	 * l'attribut courant 
	 * @param ac	l'attribut a ajouter
	 * @param nom	le nom de cet attribut apres renomage
	 * @param undefine	=true ssi il est undefine
	 * @param redefine	=true ssi il est redefine
	 * @param herit		le lien d'heritage
	 */
	public void ajoute_ancetre(Attribut_Complet ac,NomFeature nom,
					boolean undefine,boolean redefine,Heritage herit,
					Conversion conversion)
	{__CLOVER_56_0.cloverRec.M[309]++;
		__CLOVER_56_0.cloverRec.S[1525]++;Attribut_Heritage ah;
		
		assert((((ac!=null)) && (++__CLOVER_56_0.cloverRec.CT[604]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[604]==0&false));
		assert((((herit!=null)) && (++__CLOVER_56_0.cloverRec.CT[605]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[605]==0&false));
		__CLOVER_56_0.cloverRec.S[1526]++;if((((nom.equals("a")&&classe.nom.equalsIgnoreCase("test2")) && (++__CLOVER_56_0.cloverRec.CT[606]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[606]==0&false)))
			{__CLOVER_56_0.cloverRec.S[1527]++;System.out.println("coucou");
		}__CLOVER_56_0.cloverRec.S[1528]++;ah=new Attribut_Heritage(table_symbol,nom,undefine,
									redefine,herit,ac,
									conversion);
		//ah.
		__CLOVER_56_0.cloverRec.S[1529]++;if((((attribut_ancetre==null) && (++__CLOVER_56_0.cloverRec.CT[607]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[607]==0&false)))
		{{
			__CLOVER_56_0.cloverRec.S[1530]++;attribut_ancetre=new Attribut_Heritage[1];
			__CLOVER_56_0.cloverRec.S[1531]++;attribut_ancetre[0]=ah;
		}
		}else
		{{
			__CLOVER_56_0.cloverRec.S[1532]++;int i;
			__CLOVER_56_0.cloverRec.S[1533]++;Attribut_Heritage at[];
			__CLOVER_56_0.cloverRec.S[1534]++;at=new Attribut_Heritage[attribut_ancetre.length+1];
			__CLOVER_56_0.cloverRec.S[1535]++;for(i=0;(((i<attribut_ancetre.length) && (++__CLOVER_56_0.cloverRec.CT[608]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[608]==0&false));i++)
			{{
				__CLOVER_56_0.cloverRec.S[1536]++;at[i]=attribut_ancetre[i];
			}
			}__CLOVER_56_0.cloverRec.S[1537]++;at[i]=ah;
			__CLOVER_56_0.cloverRec.S[1538]++;attribut_ancetre=at;
		}
	}}

	/**
	 * definit un attribut directe de la classe
	 * @param a		l'attribut a ajouter
	 * @param feature	la feature a ajouter
	 */
	public void ajoute_attribut_directe(Attribut a,Feature feature)
	{__CLOVER_56_0.cloverRec.M[310]++;
		assert((((feature!=null)) && (++__CLOVER_56_0.cloverRec.CT[609]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[609]==0&false));
		assert((((a!=null)) && (++__CLOVER_56_0.cloverRec.CT[610]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[610]==0&false));
		__CLOVER_56_0.cloverRec.S[1539]++;if((((feature_directe!=null) && (++__CLOVER_56_0.cloverRec.CT[611]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[611]==0&false)))
		{{
			__CLOVER_56_0.cloverRec.S[1540]++;table_symbol.log.erreur(new ErreurVFFD2(attribut_directe,a));
		}
		}else
		{{
			__CLOVER_56_0.cloverRec.S[1541]++;feature_directe=feature;
			__CLOVER_56_0.cloverRec.S[1542]++;attribut_directe=a;
			__CLOVER_56_0.cloverRec.S[1543]++;if((((a.nom.prefix) && (++__CLOVER_56_0.cloverRec.CT[612]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[612]==0&false)))
			{{
				__CLOVER_56_0.cloverRec.S[1544]++;if((((feature.param!=null&&feature.param.length>0) && (++__CLOVER_56_0.cloverRec.CT[613]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[613]==0&false)))
				{{// Erreur VFFD5 : pas bon parametre
					__CLOVER_56_0.cloverRec.S[1545]++;table_symbol.context.erreur(new ErreurVFFD5(classe,a.nom,feature));
				}
				}__CLOVER_56_0.cloverRec.S[1546]++;if((((feature.type_retour==null) && (++__CLOVER_56_0.cloverRec.CT[614]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[614]==0&false)))
				{{// Erreur VFFD5 : pas bon type retour
					__CLOVER_56_0.cloverRec.S[1547]++;table_symbol.context.erreur(new ErreurVFFD5(classe,a.nom,feature));
				}
			}}
			}__CLOVER_56_0.cloverRec.S[1548]++;if((((a.nom.infix) && (++__CLOVER_56_0.cloverRec.CT[615]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[615]==0&false)))
			{{
				__CLOVER_56_0.cloverRec.S[1549]++;if((((feature.param==null||feature.param.length!=1) && (++__CLOVER_56_0.cloverRec.CT[616]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[616]==0&false)))
				{{// Erreur VFFD6 : pas bon parametre
					__CLOVER_56_0.cloverRec.S[1550]++;table_symbol.context.erreur(new ErreurVFFD6(classe,a.nom,feature));
				}
				}__CLOVER_56_0.cloverRec.S[1551]++;if((((feature.type_retour==null) && (++__CLOVER_56_0.cloverRec.CT[617]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[617]==0&false)))
				{{// Erreur VFFD6 : pas bon type retour
					__CLOVER_56_0.cloverRec.S[1552]++;table_symbol.context.erreur(new ErreurVFFD6(classe,a.nom,feature));
				}
			}}
			}__CLOVER_56_0.cloverRec.S[1553]++;if((((feature instanceof FeatureRoutine&&
				((FeatureRoutine)feature).once&&
				feature.type_retour!=null) && (++__CLOVER_56_0.cloverRec.CT[618]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[618]==0&false)))
			{{
				__CLOVER_56_0.cloverRec.S[1554]++;if((((feature.type_retour.is_like||
					table_symbol.type_generique(feature.type_retour)) && (++__CLOVER_56_0.cloverRec.CT[619]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[619]==0&false)))
				{{
					__CLOVER_56_0.cloverRec.S[1555]++;table_symbol.context.erreur(new ErreurVFFD7(classe,a.nom,feature));
				}
			}}
		}}
	}}

	/**
	 * verifie que l'attribut est valide.
	 * @param context
	 */
	public void verifie_valide(Context context) {__CLOVER_56_0.cloverRec.M[311]++;
		assert((((feature_directe!=null||attribut_ancetre!=null)) && (++__CLOVER_56_0.cloverRec.CT[620]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[620]==0&false));
		__CLOVER_56_0.cloverRec.S[1556]++;Attribut_Complet ac;
		__CLOVER_56_0.cloverRec.S[1557]++;Attribut a,attr=null;
		__CLOVER_56_0.cloverRec.S[1558]++;Attribut_Heritage ah,ah2;
		__CLOVER_56_0.cloverRec.S[1559]++;int i,j;
		__CLOVER_56_0.cloverRec.S[1560]++;boolean redefine=false;
		__CLOVER_56_0.cloverRec.S[1561]++;Feature f1,f2;
		__CLOVER_56_0.cloverRec.S[1562]++;Vector liste_deferred,liste_effectif,
				liste_deferred_redefine,liste_effectif_redefine;
		__CLOVER_56_0.cloverRec.S[1563]++;liste_deferred=new Vector();
		__CLOVER_56_0.cloverRec.S[1564]++;liste_effectif=new Vector();
		__CLOVER_56_0.cloverRec.S[1565]++;liste_deferred_redefine=new Vector();
		__CLOVER_56_0.cloverRec.S[1566]++;liste_effectif_redefine=new Vector();
		/*
		 * TODO : comparer les attributs entre les ancetres
		 * et la feature directe  
		 */
		assert((((!verifie)) && (++__CLOVER_56_0.cloverRec.CT[621]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[621]==0&false));//&&&\u00e9"'(-\u00e8_\u00e7\u00e0
		__CLOVER_56_0.cloverRec.S[1567]++;if((((attribut_ancetre!=null) && (++__CLOVER_56_0.cloverRec.CT[622]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[622]==0&false)))
		{{// il y a des attributs ancetres
			__CLOVER_56_0.cloverRec.S[1568]++;for(i=0;(((i<attribut_ancetre.length) && (++__CLOVER_56_0.cloverRec.CT[623]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[623]==0&false));i++)
			{{
				__CLOVER_56_0.cloverRec.S[1569]++;ah=attribut_ancetre[i];
				assert((((ah!=null)) && (++__CLOVER_56_0.cloverRec.CT[624]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[624]==0&false));
				__CLOVER_56_0.cloverRec.S[1570]++;redefine=redefine||ah.redefine;
				__CLOVER_56_0.cloverRec.S[1571]++;if((((ah.est_deferred()) && (++__CLOVER_56_0.cloverRec.CT[625]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[625]==0&false)))
				{{
					__CLOVER_56_0.cloverRec.S[1572]++;if((((ah.undefine) && (++__CLOVER_56_0.cloverRec.CT[626]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[626]==0&false)))
					{{
						__CLOVER_56_0.cloverRec.S[1573]++;context.erreur(
								new ErreurVDUS3(classe,
										ah.attribut.getAttribut(),
										ah.heritage));
					}
					}__CLOVER_56_0.cloverRec.S[1574]++;if((((ah.redefine) && (++__CLOVER_56_0.cloverRec.CT[627]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[627]==0&false)))
					{{
						__CLOVER_56_0.cloverRec.S[1575]++;liste_deferred_redefine.addElement(ah);
					}
					}else
					{{
						__CLOVER_56_0.cloverRec.S[1576]++;liste_deferred.addElement(ah);
					}
				}}
				}else
				{{
					__CLOVER_56_0.cloverRec.S[1577]++;if((((ah.undefine&&(ah.frozen()||ah.getFeature().est_variable())) && (++__CLOVER_56_0.cloverRec.CT[628]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[628]==0&false)))
					{{
						__CLOVER_56_0.cloverRec.S[1578]++;context.erreur(new ErreurVDUS2(classe,ah.nom,
														ah.heritage,
														ah.getFeature()));
					}
					}__CLOVER_56_0.cloverRec.S[1579]++;if((((ah.redefine) && (++__CLOVER_56_0.cloverRec.CT[629]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[629]==0&false)))
					{{
						__CLOVER_56_0.cloverRec.S[1580]++;if((((ah.frozen()||ah.getFeature().est_constant()) && (++__CLOVER_56_0.cloverRec.CT[630]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[630]==0&false)))
						{{//	Erreur de redefinition d'attribut frozen
							// VDRS2
							//assert(false);
							__CLOVER_56_0.cloverRec.S[1581]++;context.erreur(
										 new ErreurVDRS2(classe,ah.nom,
														 ah.heritage,
														 ah.getFeature()));
						}
						}__CLOVER_56_0.cloverRec.S[1582]++;if((((ah.undefine) && (++__CLOVER_56_0.cloverRec.CT[631]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[631]==0&false)))
							{__CLOVER_56_0.cloverRec.S[1583]++;liste_deferred_redefine.addElement(ah);
						}else
							{__CLOVER_56_0.cloverRec.S[1584]++;liste_effectif_redefine.addElement(ah);
					}}
					}else
					{{
						__CLOVER_56_0.cloverRec.S[1585]++;if((((ah.undefine) && (++__CLOVER_56_0.cloverRec.CT[632]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[632]==0&false)))
							{__CLOVER_56_0.cloverRec.S[1586]++;liste_deferred.addElement(ah);
						}else
							{__CLOVER_56_0.cloverRec.S[1587]++;liste_effectif.addElement(ah);
					}}
				}}
			}}
			}__CLOVER_56_0.cloverRec.S[1588]++;if((((liste_effectif.size()+liste_effectif_redefine.size()>0) && (++__CLOVER_56_0.cloverRec.CT[633]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[633]==0&false)))
			{{
				__CLOVER_56_0.cloverRec.S[1589]++;if((((liste_effectif.size()>0) && (++__CLOVER_56_0.cloverRec.CT[634]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[634]==0&false)))
				{{
					__CLOVER_56_0.cloverRec.S[1590]++;if((((feature_directe!=null) && (++__CLOVER_56_0.cloverRec.CT[635]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[635]==0&false)))
					{{
						//if(feature_directe.is_deferred())
						{// Erreur : effectif+directe deferred
						//	assert(false);
						}
						//else
						{// Erreur entre ancetre et directe (VMCN2)
							__CLOVER_56_0.cloverRec.S[1591]++;ah=(Attribut_Heritage)liste_effectif.elementAt(0);
							__CLOVER_56_0.cloverRec.S[1592]++;context.erreur(
									new ErreurVMCN2(classe,ah.heritage,
													feature_directe,nom));
						}
						__CLOVER_56_0.cloverRec.S[1593]++;no_attribut_reel=-1;
					}
					}else
					{{// pas de feature directe
						__CLOVER_56_0.cloverRec.S[1594]++;boolean trouve=false;
						__CLOVER_56_0.cloverRec.S[1595]++;for(i=0;(((i<attribut_ancetre.length) && (++__CLOVER_56_0.cloverRec.CT[636]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[636]==0&false));i++)
						{{
							__CLOVER_56_0.cloverRec.S[1596]++;if((((attribut_ancetre[i]==(Attribut_Heritage)liste_effectif.elementAt(0)) && (++__CLOVER_56_0.cloverRec.CT[637]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[637]==0&false)))
							{{
								__CLOVER_56_0.cloverRec.S[1597]++;no_attribut_reel=i;
								__CLOVER_56_0.cloverRec.S[1598]++;feature_reel=attribut_ancetre[i].getFeature();
								__CLOVER_56_0.cloverRec.S[1599]++;trouve=true;
							}
						}}
						}assert((((trouve)) && (++__CLOVER_56_0.cloverRec.CT[638]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[638]==0&false));
					}
					}__CLOVER_56_0.cloverRec.S[1600]++;if((((liste_effectif.size()>1) && (++__CLOVER_56_0.cloverRec.CT[639]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[639]==0&false)))
					{{// Erreur entre ancetres
						//System.out.println("***************************************************************************************");
						//System.out.println(nom+":"+classe.nom+";"+liste_effectif);
						__CLOVER_56_0.cloverRec.S[1601]++;for(int k=0;(((k<liste_effectif.size()-1) && (++__CLOVER_56_0.cloverRec.CT[640]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[640]==0&false));k++)
						{{
							assert((((k+1<liste_effectif.size())) && (++__CLOVER_56_0.cloverRec.CT[641]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[641]==0&false));
							__CLOVER_56_0.cloverRec.S[1602]++;ah=(Attribut_Heritage)liste_effectif.elementAt(k);
							__CLOVER_56_0.cloverRec.S[1603]++;ah2=(Attribut_Heritage)liste_effectif.elementAt(k+1);
							__CLOVER_56_0.cloverRec.S[1604]++;f1=ah2.getFeature();
							__CLOVER_56_0.cloverRec.S[1605]++;f2=ah.getFeature();
							__CLOVER_56_0.cloverRec.S[1606]++;if((((f1!=f2) && (++__CLOVER_56_0.cloverRec.CT[642]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[642]==0&false)))
							{{// pas les memes feature => erreur
									__CLOVER_56_0.cloverRec.S[1607]++;context.erreur(
											new ErreurVMCN3(classe,
															ah2.heritage,
															ah.heritage,
															nom));
							}
						}}
					}}
				}}
				}else
				{{// liste_effectif.size==0
					assert((((liste_effectif_redefine.size()>0)) && (++__CLOVER_56_0.cloverRec.CT[643]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[643]==0&false));
					__CLOVER_56_0.cloverRec.S[1608]++;if((((feature_directe!=null) && (++__CLOVER_56_0.cloverRec.CT[644]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[644]==0&false)))
					{{
						__CLOVER_56_0.cloverRec.S[1609]++;if((((feature_directe.is_deferred()) && (++__CLOVER_56_0.cloverRec.CT[645]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[645]==0&false)))
						{{// Erreur VDRD5 : redefine d'effectif vers deferred
							__CLOVER_56_0.cloverRec.S[1610]++;for(int k=0;(((k<liste_effectif_redefine.size()) && (++__CLOVER_56_0.cloverRec.CT[646]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[646]==0&false));k++)
							{{
								__CLOVER_56_0.cloverRec.S[1611]++;Attribut_Heritage ah3;
								__CLOVER_56_0.cloverRec.S[1612]++;ah3=(Attribut_Heritage)liste_effectif_redefine.elementAt(k);
								__CLOVER_56_0.cloverRec.S[1613]++;context.erreur(
									new ErreurVDRD5(
											classe,feature_directe,
											ah3.heritage,nom));
							}
						}}
						}__CLOVER_56_0.cloverRec.S[1614]++;no_attribut_reel=-1;
					}
					}else
					{{// Erreur: liste_effectif_redefine>0 et
						// feature_directe==0 et liste_effectif=0
						__CLOVER_56_0.cloverRec.S[1615]++;for(j=0;(((j<attribut_ancetre.length) && (++__CLOVER_56_0.cloverRec.CT[647]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[647]==0&false));j++)
						{{
							__CLOVER_56_0.cloverRec.S[1616]++;ah=attribut_ancetre[j];
							__CLOVER_56_0.cloverRec.S[1617]++;for(int k=0;(((k<liste_effectif_redefine.size()) && (++__CLOVER_56_0.cloverRec.CT[648]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[648]==0&false));k++)
							{{
								__CLOVER_56_0.cloverRec.S[1618]++;if((((ah==(Attribut_Heritage)liste_effectif_redefine.elementAt(k)) && (++__CLOVER_56_0.cloverRec.CT[649]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[649]==0&false)))
								{{
									__CLOVER_56_0.cloverRec.S[1619]++;context.erreur(
												new ErreurVDRS4(classe,ah.nom,
																ah.heritage));
								}
								}__CLOVER_56_0.cloverRec.S[1620]++;if((((feature_reel==null) && (++__CLOVER_56_0.cloverRec.CT[650]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[650]==0&false)))
								{{
									__CLOVER_56_0.cloverRec.S[1621]++;feature_reel=ah.getFeature();
									__CLOVER_56_0.cloverRec.S[1622]++;no_attribut_reel=k;
								}
							}}
						}}
						//assert(false):"feature:"+nom+",directe="+
						//		feature_directe+",classe="+
						//		classe.nom;
					}}
				}}
				}__CLOVER_56_0.cloverRec.S[1623]++;if((((liste_deferred_redefine.size()>0) && (++__CLOVER_56_0.cloverRec.CT[651]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[651]==0&false)))
				{{// Erreur: redefine de deferred et effectif
					__CLOVER_56_0.cloverRec.S[1624]++;Feature f;
					__CLOVER_56_0.cloverRec.S[1625]++;if((((no_attribut_reel==-1) && (++__CLOVER_56_0.cloverRec.CT[652]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[652]==0&false)))
						{__CLOVER_56_0.cloverRec.S[1626]++;f=feature_directe;
					}else
						{__CLOVER_56_0.cloverRec.S[1627]++;f=attribut_ancetre[no_attribut_reel].getFeature();
					}__CLOVER_56_0.cloverRec.S[1628]++;Attribut_Heritage ah3=(Attribut_Heritage)liste_deferred_redefine.elementAt(0);
					__CLOVER_56_0.cloverRec.S[1629]++;context.erreur(new ErreurVDRS4(classe,nom,ah3.heritage,f));
				}
			}}
			}else
			{{// pas de liste_effectif
				__CLOVER_56_0.cloverRec.S[1630]++;if((((feature_directe!=null) && (++__CLOVER_56_0.cloverRec.CT[653]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[653]==0&false)))
				{{//
					__CLOVER_56_0.cloverRec.S[1631]++;if((((liste_deferred.size()==0) && (++__CLOVER_56_0.cloverRec.CT[654]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[654]==0&false)))
					{{
						__CLOVER_56_0.cloverRec.S[1632]++;if((((liste_deferred_redefine.size()>0) && (++__CLOVER_56_0.cloverRec.CT[655]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[655]==0&false)))
						{{
							__CLOVER_56_0.cloverRec.S[1633]++;if((((!feature_directe.is_deferred()) && (++__CLOVER_56_0.cloverRec.CT[656]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[656]==0&false)))
							{{// Erreur: redefine deferred et
								// directe pas deferred
								__CLOVER_56_0.cloverRec.S[1634]++;context.erreur(
										new ErreurVDRS4(classe,
														nom,
								((Attribut_Heritage)liste_deferred_redefine.elementAt(0)).heritage,
														feature_directe));
								//assert(false);
							}
						}}
					}}
					}else {__CLOVER_56_0.cloverRec.S[1635]++;if((((liste_deferred.size()>1) && (++__CLOVER_56_0.cloverRec.CT[657]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[657]==0&false)))
					{{// Erreur: plus de 1 deferred
						__CLOVER_56_0.cloverRec.S[1636]++;if((((feature_directe.is_deferred()) && (++__CLOVER_56_0.cloverRec.CT[658]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[658]==0&false)))
						{{// conflit entre deferred ancetre et deferred directe
							__CLOVER_56_0.cloverRec.S[1637]++;Attribut_Heritage ah3=(Attribut_Heritage)liste_deferred.elementAt(0);
							__CLOVER_56_0.cloverRec.S[1638]++;context.erreur(new ErreurVDRS4(classe,nom,ah3.heritage,feature_directe));
						}
					}}
					}else
					{{// liste_deferred=1
						__CLOVER_56_0.cloverRec.S[1639]++;if((((feature_directe.is_deferred()) && (++__CLOVER_56_0.cloverRec.CT[659]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[659]==0&false)))
						{{// Erreur: ancetre deferred et
							// directe deferred (oublit de redefine)
							__CLOVER_56_0.cloverRec.S[1640]++;Attribut_Heritage ah3=(Attribut_Heritage)liste_deferred.elementAt(0);
							__CLOVER_56_0.cloverRec.S[1641]++;context.erreur(new ErreurVDRS4(classe,nom,ah3.heritage,feature_directe));
							//assert(false);
						}
					}}
					}}__CLOVER_56_0.cloverRec.S[1642]++;no_attribut_reel=-1;
				}
				}else
				{{// pas de feature_directe
					__CLOVER_56_0.cloverRec.S[1643]++;if((((liste_deferred.size()==0) && (++__CLOVER_56_0.cloverRec.CT[660]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[660]==0&false)))
					{{
						__CLOVER_56_0.cloverRec.S[1644]++;if((((liste_deferred_redefine.size()>0) && (++__CLOVER_56_0.cloverRec.CT[661]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[661]==0&false)))
						{{// Erreur: redefine sans effectif
							//assert(false);
							__CLOVER_56_0.cloverRec.S[1645]++;for(int k=0;(((k<liste_deferred_redefine.size()) && (++__CLOVER_56_0.cloverRec.CT[662]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[662]==0&false));k++)
							{{
								__CLOVER_56_0.cloverRec.S[1646]++;Attribut_Heritage ah3;
								__CLOVER_56_0.cloverRec.S[1647]++;ah3=(Attribut_Heritage)liste_deferred_redefine.elementAt(k);
								__CLOVER_56_0.cloverRec.S[1648]++;context.erreur(new ErreurVDRS4(classe,nom,ah3.heritage));
							}
						}}
					}}
					}else {__CLOVER_56_0.cloverRec.S[1649]++;if((((liste_deferred.size()>1) && (++__CLOVER_56_0.cloverRec.CT[663]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[663]==0&false)))
					{{// Erreur : plus de 1 deferred
						__CLOVER_56_0.cloverRec.S[1650]++;for(int k=1;(((k<liste_deferred.size()) && (++__CLOVER_56_0.cloverRec.CT[664]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[664]==0&false));k++)
						{{
							__CLOVER_56_0.cloverRec.S[1651]++;Attribut_Heritage ah3,ah4=null;
							__CLOVER_56_0.cloverRec.S[1652]++;boolean trouve=false;
							__CLOVER_56_0.cloverRec.S[1653]++;ah3=(Attribut_Heritage)liste_deferred.elementAt(k);
							__CLOVER_56_0.cloverRec.S[1654]++;for(int m=0;(((m<k) && (++__CLOVER_56_0.cloverRec.CT[665]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[665]==0&false));m++)
							{{
								__CLOVER_56_0.cloverRec.S[1655]++;ah4=(Attribut_Heritage)liste_deferred.elementAt(m);
								__CLOVER_56_0.cloverRec.S[1656]++;if((((ah3.getFeature()!=ah4.getFeature()) && (++__CLOVER_56_0.cloverRec.CT[666]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[666]==0&false)))
								{{
									__CLOVER_56_0.cloverRec.S[1657]++;trouve=true;
									__CLOVER_56_0.cloverRec.S[1658]++;break;
								}
							}}
							}__CLOVER_56_0.cloverRec.S[1659]++;if((((trouve) && (++__CLOVER_56_0.cloverRec.CT[667]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[667]==0&false)))
							{{
								assert((((ah4!=null)) && (++__CLOVER_56_0.cloverRec.CT[668]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[668]==0&false));
								__CLOVER_56_0.cloverRec.S[1660]++;context.erreur(new ErreurVMCN1(classe,
																ah3.heritage,
																ah4.heritage,nom));
							}
						}}
						//assert(false);
					}}
					//assert(liste_deferred.size()>0);
					}}__CLOVER_56_0.cloverRec.S[1661]++;boolean trouve=false;
					__CLOVER_56_0.cloverRec.S[1662]++;Attribut_Heritage ah3;
					__CLOVER_56_0.cloverRec.S[1663]++;if((((liste_deferred.size()>0) && (++__CLOVER_56_0.cloverRec.CT[669]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[669]==0&false)))
						{__CLOVER_56_0.cloverRec.S[1664]++;ah3=(Attribut_Heritage)liste_deferred.elementAt(0);
					}else
					{{
						assert((((liste_deferred_redefine.size()>0)) && (++__CLOVER_56_0.cloverRec.CT[670]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[670]==0&false));
						__CLOVER_56_0.cloverRec.S[1665]++;ah3=(Attribut_Heritage)liste_deferred_redefine.elementAt(0);
					}
					}assert((((ah3!=null)) && (++__CLOVER_56_0.cloverRec.CT[671]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[671]==0&false));
					__CLOVER_56_0.cloverRec.S[1666]++;for(i=0;(((i<attribut_ancetre.length) && (++__CLOVER_56_0.cloverRec.CT[672]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[672]==0&false));i++)
					{{
						__CLOVER_56_0.cloverRec.S[1667]++;if((((attribut_ancetre[i]==ah3) && (++__CLOVER_56_0.cloverRec.CT[673]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[673]==0&false)))
						{{
							__CLOVER_56_0.cloverRec.S[1668]++;no_attribut_reel=i;
							__CLOVER_56_0.cloverRec.S[1669]++;feature_reel=attribut_ancetre[i].getFeature();
							__CLOVER_56_0.cloverRec.S[1670]++;trouve=true;
						}
					}}
					}assert((((trouve)) && (++__CLOVER_56_0.cloverRec.CT[674]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[674]==0&false));
				}
			}}
			}assert(((((no_attribut_reel==-1&&feature_directe!=null)
					||(no_attribut_reel>=0&&feature_reel!=null))) && (++__CLOVER_56_0.cloverRec.CT[675]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[675]==0&false));
			__CLOVER_56_0.cloverRec.S[1671]++;if((((feature_directe!=null) && (++__CLOVER_56_0.cloverRec.CT[676]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[676]==0&false)))
			{{
				__CLOVER_56_0.cloverRec.S[1672]++;if((((feature_reel!=null) && (++__CLOVER_56_0.cloverRec.CT[677]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[677]==0&false)))
				{{// Erreur entre ancetre et directe (VMCN2)
					//assert(false);
					__CLOVER_56_0.cloverRec.S[1673]++;ah=attribut_ancetre[no_attribut_reel];
					__CLOVER_56_0.cloverRec.S[1674]++;context.erreur(
						new ErreurVMCN2(classe,ah.heritage,
								feature_directe,nom));
				}
				}else
				{{
					__CLOVER_56_0.cloverRec.S[1675]++;no_attribut_reel=-1;
				}
			}}
			}__CLOVER_56_0.cloverRec.S[1676]++;if((((redefine&&feature_reel==null&&feature_directe==null) && (++__CLOVER_56_0.cloverRec.CT[678]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[678]==0&false)))
			{{// redefine sans feature effective VDRS4
				//assert(false);
				__CLOVER_56_0.cloverRec.S[1677]++;for(j=0;(((j<attribut_ancetre.length) && (++__CLOVER_56_0.cloverRec.CT[679]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[679]==0&false));j++)
				{{
					__CLOVER_56_0.cloverRec.S[1678]++;ah=attribut_ancetre[j];
					__CLOVER_56_0.cloverRec.S[1679]++;if((((ah.redefine) && (++__CLOVER_56_0.cloverRec.CT[680]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[680]==0&false)))
					{{
						__CLOVER_56_0.cloverRec.S[1680]++;context.erreur(
									new ErreurVDRS4(classe,ah.nom,
												ah.heritage));
					}
				}}
			}}
			
		}}
		}else
		{{// pas d'attribut herit\u00e9
			__CLOVER_56_0.cloverRec.S[1681]++;if((((feature_directe!=null) && (++__CLOVER_56_0.cloverRec.CT[681]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[681]==0&false)))
				{__CLOVER_56_0.cloverRec.S[1682]++;no_attribut_reel=-1;
		}}
		}__CLOVER_56_0.cloverRec.S[1683]++;attr=getAttribut();
		//if(attribut_directe!=null)
		//	attr=attribut_directe;
		//else
			//attr=
		assert((((attr!=null)) && (++__CLOVER_56_0.cloverRec.CT[682]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[682]==0&false));
		__CLOVER_56_0.cloverRec.S[1684]++;if((((frozen()&&est_deferred()&&attr.classe==classe) && (++__CLOVER_56_0.cloverRec.CT[683]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[683]==0&false)))
		{{
			__CLOVER_56_0.cloverRec.S[1685]++;context.erreur(new ErreurVFFD4(attr));
		}
		}assert((((nom!=null)) && (++__CLOVER_56_0.cloverRec.CT[684]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[684]==0&false));
		__CLOVER_56_0.cloverRec.S[1686]++;if((((feature_directe!=null) && (++__CLOVER_56_0.cloverRec.CT[685]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[685]==0&false)))
		{{
			__CLOVER_56_0.cloverRec.S[1687]++;NomFeature nom2;
			__CLOVER_56_0.cloverRec.S[1688]++;nom2=feature_directe.cherche_nom(nom);
			assert((((nom2!=null)) && (++__CLOVER_56_0.cloverRec.CT[686]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[686]==0&false)):"nom="+nom+";pos="+nom.debut()+
					";classe="+classe.nom;
			__CLOVER_56_0.cloverRec.S[1689]++;nom=nom2;
		}
		}else
		{{
			assert((((feature_reel!=null)) && (++__CLOVER_56_0.cloverRec.CT[687]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[687]==0&false));
			__CLOVER_56_0.cloverRec.S[1690]++;NomFeature nom2;
			__CLOVER_56_0.cloverRec.S[1691]++;nom2=feature_reel.cherche_nom(nom);
			// TODO: a remettre (pose probl\u00e8me si rename)
			//assert(nom2!=null):"nom="+nom+","+classe.nom+";";
			__CLOVER_56_0.cloverRec.S[1692]++;nom=nom2;
			
		}
		// construction de la signature de l'attribut
		}__CLOVER_56_0.cloverRec.S[1693]++;construit_signature(context);
		//assert()
		assert((((feature_directe!=null||feature_reel!=null||
				est_deferred())) && (++__CLOVER_56_0.cloverRec.CT[688]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[688]==0&false)):
			"directe="+feature_directe+";reel="+feature_reel+
			"attr="+nom+"("+classe.nom+")";
		__CLOVER_56_0.cloverRec.S[1694]++;verifie=true;
	}

	public void verifie_signature(Context context)
	{__CLOVER_56_0.cloverRec.M[312]++;
		__CLOVER_56_0.cloverRec.S[1695]++;Type t1,t2;
		__CLOVER_56_0.cloverRec.S[1696]++;if((((signature.getTypeRetour()!=null) && (++__CLOVER_56_0.cloverRec.CT[689]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[689]==0&false)))
			{__CLOVER_56_0.cloverRec.S[1697]++;context.type_valide(table_symbol,signature.getTypeRetour());
		//if(parametre!=null)
		}{
			__CLOVER_56_0.cloverRec.S[1698]++;for(int j=0;(((j<signature.nb_parametre()/*parametre.length*/) && (++__CLOVER_56_0.cloverRec.CT[690]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[690]==0&false));j++)
				{__CLOVER_56_0.cloverRec.S[1699]++;context.type_valide(table_symbol,signature.getParametre(j));
		}}
		// verification des signatures par rapport 
		// a la feature "principale"
		__CLOVER_56_0.cloverRec.S[1700]++;if((((attribut_ancetre!=null) && (++__CLOVER_56_0.cloverRec.CT[691]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[691]==0&false)))
		{{
			__CLOVER_56_0.cloverRec.S[1701]++;for(int i=0;(((i<attribut_ancetre.length) && (++__CLOVER_56_0.cloverRec.CT[692]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[692]==0&false));i++)
			{{
				__CLOVER_56_0.cloverRec.S[1702]++;int no,no2;
				__CLOVER_56_0.cloverRec.S[1703]++;Attribut_Complet ac;
				__CLOVER_56_0.cloverRec.S[1704]++;Attribut_Heritage ah;
				__CLOVER_56_0.cloverRec.S[1705]++;ah=attribut_ancetre[i];
				__CLOVER_56_0.cloverRec.S[1706]++;ac=ah.attribut;
				//no2=verifie_signature(parametre,type_retour,attribut_ancetre[i],context);
				__CLOVER_56_0.cloverRec.S[1707]++;no=ah.signature.verifie_signature(signature,context,table_symbol);
				//assert(no2==no):"diff:no="+no+"!="+no2;
				__CLOVER_56_0.cloverRec.S[1708]++;boolean __CLOVER_bool0=false;switch(no)
				{
					case -2:if (!__CLOVER_bool0) {__CLOVER_56_0.cloverRec.S[1709]++;__CLOVER_bool0=true;}// pas le bon nombre de parametre
							assert((((no_attribut_reel==-1)) && (++__CLOVER_56_0.cloverRec.CT[693]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[693]==0&false));
							//assert(false):"nom="+nom.debut()+";directe="+
							//		feature_directe.liste_nom[0].debut();
							__CLOVER_56_0.cloverRec.S[1710]++;context.erreur(new ErreurVNCS1(nom,classe,
										ac.nom,
										ac.classe));
							/*assert(false):"Erreur de nombre de parametre:"+
										"principal="+nb_param+"!="+
										attribut_ancetre[i].attribut.nb_param+
										"("+i+")";*/
							__CLOVER_56_0.cloverRec.S[1711]++;break;
					case -1:if (!__CLOVER_bool0) {__CLOVER_56_0.cloverRec.S[1712]++;__CLOVER_bool0=true;}// pas de pb
							__CLOVER_56_0.cloverRec.S[1713]++;if((((!ac.getFeature().is_deferred()&&
								getFeature().est_external()!=
								ac.getFeature().est_external()) && (++__CLOVER_56_0.cloverRec.CT[694]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[694]==0&false)))
							{{// Erreur: est_external() pas identique
								// TODO: a remetre ?
								// TODO: ne pas mettre d'erreur si l'external est tinyeiffel
								__CLOVER_56_0.cloverRec.S[1714]++;if((((getFeature().est_external()) && (++__CLOVER_56_0.cloverRec.CT[695]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[695]==0&false)))
								{{
									__CLOVER_56_0.cloverRec.S[1715]++;FeatureExternal fe=(FeatureExternal)getFeature();
									__CLOVER_56_0.cloverRec.S[1716]++;if((((!fe.str.chaine_unique().equalsIgnoreCase("\"tinyeiffel\"")) && (++__CLOVER_56_0.cloverRec.CT[696]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[696]==0&false)))
									{{// erreur VDRD7
										__CLOVER_56_0.cloverRec.S[1717]++;context.erreur(new ErreurVDRD7(classe,getFeature(),
																						attribut_ancetre[i].heritage,nom));
									}
								}}
								}else
								{{

									__CLOVER_56_0.cloverRec.S[1718]++;FeatureExternal fe=(FeatureExternal)ac.getFeature();
									__CLOVER_56_0.cloverRec.S[1719]++;if((((!fe.str.chaine_unique().equalsIgnoreCase("\"tinyeiffel\"")) && (++__CLOVER_56_0.cloverRec.CT[697]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[697]==0&false)))
									{{// Erreur VDRD7
										__CLOVER_56_0.cloverRec.S[1720]++;context.erreur(new ErreurVDRD7(classe,getFeature(),
																						attribut_ancetre[i].heritage,nom));
									}
								}}
								/*context.erreur(new ErreurVDRD7(classe,getFeature(),
												attribut_ancetre[i].heritage,nom));*/
							}}
							}__CLOVER_56_0.cloverRec.S[1721]++;if((((ac.getFeature().est_variable()&&
										!getFeature().est_variable()) && (++__CLOVER_56_0.cloverRec.CT[698]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[698]==0&false)))
							{{
								__CLOVER_56_0.cloverRec.S[1722]++;context.erreur(new ErreurVDRD6(classe,getFeature(),attribut_ancetre[i].heritage,
												nom,true,!ac.getFeature().est_variable()));
							}
							}else {__CLOVER_56_0.cloverRec.S[1723]++;if((((ac.getFeature().est_variable()==
									getFeature().est_variable()) && (++__CLOVER_56_0.cloverRec.CT[699]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[699]==0&false)))
							{{
								//assert(false):"coucou";
								__CLOVER_56_0.cloverRec.S[1724]++;if((((getFeature().type_retour!=null&&
									ac.getFeature().type_retour!=null) && (++__CLOVER_56_0.cloverRec.CT[700]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[700]==0&false)))
								{{
									__CLOVER_56_0.cloverRec.S[1725]++;t1=getFeature().type_retour;
									__CLOVER_56_0.cloverRec.S[1726]++;t2=ac.getFeature().type_retour;
									__CLOVER_56_0.cloverRec.S[1727]++;if((((t1.expanded!=t2.expanded) && (++__CLOVER_56_0.cloverRec.CT[701]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[701]==0&false)))
									{{// TODO: A ameliorer le teste
										__CLOVER_56_0.cloverRec.S[1728]++;context.erreur(new ErreurVDRD6(classe,getFeature(),attribut_ancetre[i].heritage,
													nom,false,!t2.expanded));
									}
								}}
								//else
									//assert(false);
							}}
							}}__CLOVER_56_0.cloverRec.S[1729]++;break;
					case -3:if (!__CLOVER_bool0) {__CLOVER_56_0.cloverRec.S[1730]++;__CLOVER_bool0=true;}// pas le bon type de retour
							__CLOVER_56_0.cloverRec.S[1731]++;t1=signature.getTypeRetour();
							__CLOVER_56_0.cloverRec.S[1732]++;t2=ah.signature.getTypeRetour();
							__CLOVER_56_0.cloverRec.S[1733]++;context.erreur(new ErreurVNCS2(nom,classe,ac.nom,
											ac.classe,-1,t1,t2));
							__CLOVER_56_0.cloverRec.S[1734]++;break;
					default:if (!__CLOVER_bool0) {__CLOVER_56_0.cloverRec.S[1735]++;__CLOVER_bool0=true;}// Erreur avec le no parametre
							__CLOVER_56_0.cloverRec.S[1736]++;t1=signature.getParametre(no);
							__CLOVER_56_0.cloverRec.S[1737]++;t2=ah.signature.getParametre(no);//ac.parametre[no][0];
							__CLOVER_56_0.cloverRec.S[1738]++;context.erreur(new ErreurVNCS2(nom,classe,ac.nom,
												ac.classe,no,t1,t2));
							//assert(false):"Erreur avec parametre no "+no+
							//		" pour "+nom+" dans "+classe.nom+
							//		parametre[no][0]+" non conforme avec "+
							//		attribut_ancetre[i].attribut.parametre[no][0];
							__CLOVER_56_0.cloverRec.S[1739]++;break;
				}
			}
		}}
	}}

	/**
	 * construit la signature
	 * @param context
	 */
	protected void construit_signature(Context context)
	{__CLOVER_56_0.cloverRec.M[313]++;// TODO : a terminer
		assert((((context!=null)) && (++__CLOVER_56_0.cloverRec.CT[702]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[702]==0&false));
		__CLOVER_56_0.cloverRec.S[1740]++;DeclareVar liste[];
		//Feature feature;
		//return;
		//&\u00e9"'(-
		// recherche de la feature "principale"
		__CLOVER_56_0.cloverRec.S[1741]++;if((((no_attribut_reel==-1) && (++__CLOVER_56_0.cloverRec.CT[703]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[703]==0&false)))
		{{// l'attribut est directe
			//feature=feature_directe;
			assert((((feature_directe!=null)) && (++__CLOVER_56_0.cloverRec.CT[704]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[704]==0&false));
			// construction de la signature
			__CLOVER_56_0.cloverRec.S[1742]++;Type p[];
			__CLOVER_56_0.cloverRec.S[1743]++;if((((feature_directe.param==null||
			feature_directe.param.length==0) && (++__CLOVER_56_0.cloverRec.CT[705]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[705]==0&false)))
			{{
//				nb_param=0;
				//p=null;
				__CLOVER_56_0.cloverRec.S[1744]++;liste=null;
			}
			}else
			{{
				__CLOVER_56_0.cloverRec.S[1745]++;int nb_param=feature_directe.param.length;
				__CLOVER_56_0.cloverRec.S[1746]++;liste=feature_directe.param;
//				parametre=new Type[nb_param][];
				/*p=new Type[nb_param];
				for(int i=0;i<nb_param;i++)
				{
//					parametre[i]=new Type[1];
//					parametre[i][0]=feature.param[i].type;
					p[i]=feature_directe.param[i].type;
				}*/
			}
//			type_retour=feature.type_retour;
			//if(type_retour)
			}__CLOVER_56_0.cloverRec.S[1747]++;signature=new Signature(liste,feature_directe.type_retour);
		}
		}else
		{{
			//feature=feature_reel;
			__CLOVER_56_0.cloverRec.S[1748]++;signature=attribut_ancetre[no_attribut_reel].signature;
		}
	}}

	/**
	 * Ajoute le type type dans le tableau liste 
	 * et retourne ce tableau 
	 * @param liste
	 * @param type
	 * @return
	 */
	protected Type[] ajoute_type(Type liste[],Type type)
	{__CLOVER_56_0.cloverRec.M[314]++;
		__CLOVER_56_0.cloverRec.S[1749]++;int i;
		__CLOVER_56_0.cloverRec.S[1750]++;Type liste2[],t1,t2;
		assert((((liste!=null)) && (++__CLOVER_56_0.cloverRec.CT[706]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[706]==0&false));
		assert((((type!=null)) && (++__CLOVER_56_0.cloverRec.CT[707]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[707]==0&false));
		__CLOVER_56_0.cloverRec.S[1751]++;for(i=0;(((i<liste.length) && (++__CLOVER_56_0.cloverRec.CT[708]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[708]==0&false));i++)
		{{
			__CLOVER_56_0.cloverRec.S[1752]++;t1=liste[i];
			assert((((t1!=null)) && (++__CLOVER_56_0.cloverRec.CT[709]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[709]==0&false));
			__CLOVER_56_0.cloverRec.S[1753]++;if((((t1.equals(type)) && (++__CLOVER_56_0.cloverRec.CT[710]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[710]==0&false)))
				{__CLOVER_56_0.cloverRec.S[1754]++;return liste;
		}}
		}__CLOVER_56_0.cloverRec.S[1755]++;liste2=new Type[liste.length+1];
		__CLOVER_56_0.cloverRec.S[1756]++;for(i=0;(((i<liste.length) && (++__CLOVER_56_0.cloverRec.CT[711]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[711]==0&false));i++)
		{{
			__CLOVER_56_0.cloverRec.S[1757]++;liste2[i]=liste[i];
		}
		}__CLOVER_56_0.cloverRec.S[1758]++;liste2[i]=type;
		__CLOVER_56_0.cloverRec.S[1759]++;liste=liste2;
		assert((((liste!=null)) && (++__CLOVER_56_0.cloverRec.CT[712]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[712]==0&false));
		assert((((liste.length>0)) && (++__CLOVER_56_0.cloverRec.CT[713]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[713]==0&false));
		__CLOVER_56_0.cloverRec.S[1760]++;return liste;
	}

	/**
	 * Ne pas utiliser si elle est deferred
	 * @return la feature effective
	 */
	public Feature getFeature()
	{__CLOVER_56_0.cloverRec.M[315]++;
		assert((((verifie)) && (++__CLOVER_56_0.cloverRec.CT[714]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[714]==0&false));
		assert((((feature_directe!=null||feature_reel!=null)) && (++__CLOVER_56_0.cloverRec.CT[715]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[715]==0&false)):
				"directe="+feature_directe+";reel="+feature_reel+
				"attr="+nom+"("+classe.nom+")";
		/*if(feature_directe==null&&feature_reel==null)
		{
			assert(attribut_ancetre!=null);
			for(int i=0;i<attribut_ancetre.length;i++)
			{
				
			}
			assert(false);
			return null;
		}
		else*/ __CLOVER_56_0.cloverRec.S[1761]++;if((((feature_directe!=null) && (++__CLOVER_56_0.cloverRec.CT[716]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[716]==0&false)))
			{__CLOVER_56_0.cloverRec.S[1762]++;return feature_directe;
		}else
			{__CLOVER_56_0.cloverRec.S[1763]++;return feature_reel;
	}}

	public Attribut getAttribut()
	{__CLOVER_56_0.cloverRec.M[316]++;
		__CLOVER_56_0.cloverRec.S[1764]++;if((((attribut_directe!=null) && (++__CLOVER_56_0.cloverRec.CT[717]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[717]==0&false)))
			{__CLOVER_56_0.cloverRec.S[1765]++;return attribut_directe;
		}assert((((attribut_ancetre!=null)) && (++__CLOVER_56_0.cloverRec.CT[718]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[718]==0&false));
		assert((((attribut_ancetre.length>0)) && (++__CLOVER_56_0.cloverRec.CT[719]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[719]==0&false));
		__CLOVER_56_0.cloverRec.S[1766]++;int no=0;
		__CLOVER_56_0.cloverRec.S[1767]++;if((((no_attribut_reel>-1) && (++__CLOVER_56_0.cloverRec.CT[720]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[720]==0&false)))
			{__CLOVER_56_0.cloverRec.S[1768]++;no=no_attribut_reel;
		}assert((((no<attribut_ancetre.length)) && (++__CLOVER_56_0.cloverRec.CT[721]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[721]==0&false));
		assert((((attribut_ancetre[no]!=null)) && (++__CLOVER_56_0.cloverRec.CT[722]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[722]==0&false));
		assert((((attribut_ancetre[no].attribut!=null)) && (++__CLOVER_56_0.cloverRec.CT[723]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[723]==0&false));
		__CLOVER_56_0.cloverRec.S[1769]++;return attribut_ancetre[no].attribut.getAttribut();
	}

	/**
	 * Est vrai ssi tous les attributs sont deferred
	 * @return =true ssi tous les attributs sont deferred
	 */
	public boolean est_deferred()
	{__CLOVER_56_0.cloverRec.M[317]++;
		assert((((feature_directe!=null||feature_reel!=null)) && (++__CLOVER_56_0.cloverRec.CT[724]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[724]==0&false));
		__CLOVER_56_0.cloverRec.S[1770]++;if((((feature_directe!=null) && (++__CLOVER_56_0.cloverRec.CT[725]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[725]==0&false)))
		{{
			__CLOVER_56_0.cloverRec.S[1771]++;return feature_directe.is_deferred();
		}
		}else
		{{
			__CLOVER_56_0.cloverRec.S[1772]++;return feature_reel.is_deferred();
			/*if(feature_reel!=null)
			{
				assert(!feature_reel.is_deferred());
				return false;
			}
			else
			{
				return true;
				//int i;
				//for(i=0;i<)
			}*/
		}
	}}

	public boolean frozen()
	{__CLOVER_56_0.cloverRec.M[318]++;
		__CLOVER_56_0.cloverRec.S[1773]++;boolean res=false;
		__CLOVER_56_0.cloverRec.S[1774]++;if((((attribut_directe!=null) && (++__CLOVER_56_0.cloverRec.CT[726]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[726]==0&false)))
		{{
			__CLOVER_56_0.cloverRec.S[1775]++;res=attribut_directe.nom.frozen;
		}
		}__CLOVER_56_0.cloverRec.S[1776]++;if((((!res&&attribut_ancetre!=null) && (++__CLOVER_56_0.cloverRec.CT[727]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[727]==0&false)))
		{{
			__CLOVER_56_0.cloverRec.S[1777]++;int i;
			__CLOVER_56_0.cloverRec.S[1778]++;for(i=0;(((!res&&i<attribut_ancetre.length) && (++__CLOVER_56_0.cloverRec.CT[728]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[728]==0&false));i++)
			{{
				__CLOVER_56_0.cloverRec.S[1779]++;if((((attribut_ancetre[i].frozen()) && (++__CLOVER_56_0.cloverRec.CT[729]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[729]==0&false)))
				{{
					__CLOVER_56_0.cloverRec.S[1780]++;res=true;
				}
			}}
		}}
		}__CLOVER_56_0.cloverRec.S[1781]++;return res;
	}

	public String getNom()
	{__CLOVER_56_0.cloverRec.M[319]++;
		assert((((!nom.infix&&!nom.prefix)) && (++__CLOVER_56_0.cloverRec.CT[730]!=0|true)) || (++__CLOVER_56_0.cloverRec.CF[730]==0&false));
		__CLOVER_56_0.cloverRec.S[1782]++;return nom.nom;
	}
	
	public Type getType()
	{__CLOVER_56_0.cloverRec.M[320]++;// TODO: enlever le table_symbol.context
		__CLOVER_56_0.cloverRec.S[1783]++;return this.donne_type_retour(table_symbol.context);
	}

	//public Attribut attribut_reel;
	//public Attribut[] attribut_deferred;
	public Logging log;
	//public boolean undefine,redefine;
	public Table_Symbol table_symbol;
	
	// utilise
	//public int nb_param;
	//public Type parametre[][];
	//public Type type_retour;
	public NomFeature nom;
	public Classe classe;
	public Attribut attribut_directe;
	public Feature feature_directe,feature_reel;
	public Attribut_Heritage attribut_ancetre[];
	public int no_attribut_reel;
	protected boolean verifie;
	public Signature signature;
	
}
