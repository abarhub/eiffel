/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ *//*
 * Created on 1 f\u00e9vr. 2004
 *
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
package tinyeiffel.compiler;

import tinyeiffel.ast.*;
import tinyeiffel.intermediaire.*;

import java.util.*;

/**
 * @author BARRET
 *
 * To change the template for this generated type comment go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
public class Convertie_Interm {static class __CLOVER_62_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}

	/**
	 * 
	 */
	public Convertie_Interm(Compiler_Eiffel compiler) {__CLOVER_62_0.cloverRec.M[430]++;
		assert((((compiler!=null)) && (++__CLOVER_62_0.cloverRec.CT[1534]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1534]==0&false));
		assert((((compiler.context!=null)) && (++__CLOVER_62_0.cloverRec.CT[1535]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1535]==0&false));
		__CLOVER_62_0.cloverRec.S[4252]++;this.compiler=compiler;
		__CLOVER_62_0.cloverRec.S[4253]++;this.context=compiler.context;
	}

	public CIProgramme convertie()
	{__CLOVER_62_0.cloverRec.M[431]++;
		__CLOVER_62_0.cloverRec.S[4254]++;CIProgramme p;
		__CLOVER_62_0.cloverRec.S[4255]++;boolean heritage_directe[][],heritage[][];
		__CLOVER_62_0.cloverRec.S[4256]++;int len,i,j;
		__CLOVER_62_0.cloverRec.S[4257]++;CIClasse liste_classe[];
		
		__CLOVER_62_0.cloverRec.S[4258]++;p=new CIProgramme();
		__CLOVER_62_0.cloverRec.S[4259]++;p.init();
		__CLOVER_62_0.cloverRec.S[4260]++;len=compiler.liste_classe.size();
		// convertion des relations d'heritage
		__CLOVER_62_0.cloverRec.S[4261]++;heritage_directe=new boolean[len][len];
		__CLOVER_62_0.cloverRec.S[4262]++;heritage=new boolean[len][len];
		__CLOVER_62_0.cloverRec.S[4263]++;for(i=0;(((i<len) && (++__CLOVER_62_0.cloverRec.CT[1536]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1536]==0&false));i++)
		{{
			__CLOVER_62_0.cloverRec.S[4264]++;tinyeiffel.ast.Classe cl;
			__CLOVER_62_0.cloverRec.S[4265]++;boolean trouve=false;
			__CLOVER_62_0.cloverRec.S[4266]++;if((((((tinyeiffel.ast.Classe)compiler.liste_classe.elementAt(i)).nom.equalsIgnoreCase("any")) && (++__CLOVER_62_0.cloverRec.CT[1537]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1537]==0&false)))
			{{
				__CLOVER_62_0.cloverRec.S[4267]++;cl=(tinyeiffel.ast.Classe)compiler.liste_classe.elementAt(i);
				assert((((!context.table_heritage_directe[i][i])) && (++__CLOVER_62_0.cloverRec.CT[1538]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1538]==0&false)):"type="+cl.nom;
			}
			}__CLOVER_62_0.cloverRec.S[4268]++;for(j=0;(((j<len) && (++__CLOVER_62_0.cloverRec.CT[1539]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1539]==0&false));j++)
			{{
				__CLOVER_62_0.cloverRec.S[4269]++;heritage[i][j]=context.table_heritage[i][j];
				__CLOVER_62_0.cloverRec.S[4270]++;heritage_directe[i][j]=context.table_heritage_directe[i][j];
				__CLOVER_62_0.cloverRec.S[4271]++;trouve=trouve||heritage_directe[i][j];
			}
			}__CLOVER_62_0.cloverRec.S[4272]++;if((((!trouve) && (++__CLOVER_62_0.cloverRec.CT[1540]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1540]==0&false)))
			{{// pas d'ancetre
				__CLOVER_62_0.cloverRec.S[4273]++;cl=(tinyeiffel.ast.Classe)compiler.liste_classe.elementAt(i);
				__CLOVER_62_0.cloverRec.S[4274]++;if((((cl.nom.equalsIgnoreCase("any")||
					cl.nom.equalsIgnoreCase("general")) && (++__CLOVER_62_0.cloverRec.CT[1541]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1541]==0&false)))
				{{
					
				}
				}else
				{{
					__CLOVER_62_0.cloverRec.S[4275]++;for(j=0;(((j<len) && (++__CLOVER_62_0.cloverRec.CT[1542]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1542]==0&false));j++)
					{{
						__CLOVER_62_0.cloverRec.S[4276]++;cl=(tinyeiffel.ast.Classe)compiler.liste_classe.elementAt(j);
						__CLOVER_62_0.cloverRec.S[4277]++;if((((cl.nom.equalsIgnoreCase("any")) && (++__CLOVER_62_0.cloverRec.CT[1543]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1543]==0&false)))
						{{
							__CLOVER_62_0.cloverRec.S[4278]++;heritage_directe[i][j]=true;
							__CLOVER_62_0.cloverRec.S[4279]++;heritage[i][j]=true;
							__CLOVER_62_0.cloverRec.S[4280]++;break;
						}
					}}
					}assert((((j<len)) && (++__CLOVER_62_0.cloverRec.CT[1544]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1544]==0&false)):"classe ANY non presente";
					//context..no_classe()
				}
			}}
		}}
		}__CLOVER_62_0.cloverRec.S[4281]++;p.heritage_directe=heritage_directe;
		__CLOVER_62_0.cloverRec.S[4282]++;p.heritage=CIInputXML.calcul_heritage(heritage_directe);
		// convertions des attributs de chaque classe
		__CLOVER_62_0.cloverRec.S[4283]++;liste_classe=new CIClasse[len];
		__CLOVER_62_0.cloverRec.S[4284]++;for(i=0;(((i<len) && (++__CLOVER_62_0.cloverRec.CT[1545]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1545]==0&false));i++)
		{{
			__CLOVER_62_0.cloverRec.S[4285]++;liste_classe[i]=convertie_classe((tinyeiffel.ast.Classe)compiler.liste_classe.elementAt(i),p);
		}
		}__CLOVER_62_0.cloverRec.S[4286]++;p.liste_classe=liste_classe;
		__CLOVER_62_0.cloverRec.S[4287]++;termine_convertion(p);
		
		__CLOVER_62_0.cloverRec.S[4288]++;return p;
	}

	protected void termine_convertion(CIProgramme p)
	{__CLOVER_62_0.cloverRec.M[432]++;
		__CLOVER_62_0.cloverRec.S[4289]++;CIClasse classe;
		__CLOVER_62_0.cloverRec.S[4290]++;tinyeiffel.ast.Classe cl;
		__CLOVER_62_0.cloverRec.S[4291]++;int i,j,no;
		__CLOVER_62_0.cloverRec.S[4292]++;CIAttribut attr,attr2;
		__CLOVER_62_0.cloverRec.S[4293]++;Table_Symbol table;
		__CLOVER_62_0.cloverRec.S[4294]++;Attribut_Complet ac;
		__CLOVER_62_0.cloverRec.S[4295]++;Attribut_Heritage ah;
		__CLOVER_62_0.cloverRec.S[4296]++;CIAttribut_Ascendant asc;
		assert((((p!=null)) && (++__CLOVER_62_0.cloverRec.CT[1546]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1546]==0&false));
		__CLOVER_62_0.cloverRec.S[4297]++;for(i=0;(((i<p.liste_classe.length) && (++__CLOVER_62_0.cloverRec.CT[1547]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1547]==0&false));i++)
		{{
			__CLOVER_62_0.cloverRec.S[4298]++;classe=p.liste_classe[i];
			__CLOVER_62_0.cloverRec.S[4299]++;cl=(tinyeiffel.ast.Classe)compiler.liste_classe.elementAt(i);
			__CLOVER_62_0.cloverRec.S[4300]++;table=context.donne_table_symbol(cl);
			__CLOVER_62_0.cloverRec.S[4301]++;if((((classe.liste_attribut!=null) && (++__CLOVER_62_0.cloverRec.CT[1548]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1548]==0&false)))
			{{
				__CLOVER_62_0.cloverRec.S[4302]++;for(j=0;(((j<classe.liste_attribut.length
						&&table.liste_attribut!=null
						&&j<table.liste_attribut.length // TODO:pour eviter de traiter les attributs speciaux. A enlever
						) && (++__CLOVER_62_0.cloverRec.CT[1549]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1549]==0&false));j++)
				{{
					__CLOVER_62_0.cloverRec.S[4303]++;attr=classe.liste_attribut[j];
					__CLOVER_62_0.cloverRec.S[4304]++;no=p.no_classe(attr.type);
					assert((((i==no||p.heritage_directe[i][no])) && (++__CLOVER_62_0.cloverRec.CT[1550]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1550]==0&false)):"classe:"+classe.nom.nom;
					__CLOVER_62_0.cloverRec.S[4305]++;ac=table.liste_attribut[j];
					__CLOVER_62_0.cloverRec.S[4306]++;if((((ac.attribut_ancetre!=null) && (++__CLOVER_62_0.cloverRec.CT[1551]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1551]==0&false)))
					{{
						__CLOVER_62_0.cloverRec.S[4307]++;for(int k=0;(((k<ac.attribut_ancetre.length) && (++__CLOVER_62_0.cloverRec.CT[1552]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1552]==0&false));k++)
						{{
							__CLOVER_62_0.cloverRec.S[4308]++;int l,no1=-1,m;
							__CLOVER_62_0.cloverRec.S[4309]++;tinyeiffel.ast.Heritage h;
							__CLOVER_62_0.cloverRec.S[4310]++;CINom_Attribut n1=null;
							__CLOVER_62_0.cloverRec.S[4311]++;ah=ac.attribut_ancetre[k];
							__CLOVER_62_0.cloverRec.S[4312]++;attr2=donne_attribut(p,ah);
							__CLOVER_62_0.cloverRec.S[4313]++;if((((!attr2.type.nom.equalsIgnoreCase(classe.nom.nom)) && (++__CLOVER_62_0.cloverRec.CT[1553]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1553]==0&false)))
							{{// c'est pas le meme attribut
								__CLOVER_62_0.cloverRec.S[4314]++;CIAttribut_Descendant ad;
								//assert(classe.nom.nom.equalsIgnoreCase("a")&&
								//		attr.nom.nom.equalsIgnoreCase("toto")):
								//	"cl:"+classe.nom+";attr2:"+attr2.nom+";attr="+attr.nom;
								__CLOVER_62_0.cloverRec.S[4315]++;ad=new CIAttribut_Descendant(attr.nom,classe.nom,convertie_source((Token)null));
								__CLOVER_62_0.cloverRec.S[4316]++;attr2.ajoute_descendant(ad);
								//if(!attr.type.nom.equalsIgnoreCase(attr2.type.nom))
								{
								__CLOVER_62_0.cloverRec.S[4317]++;if((((cl.heritage!=null) && (++__CLOVER_62_0.cloverRec.CT[1554]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1554]==0&false)))
								{{
								__CLOVER_62_0.cloverRec.S[4318]++;for(m=0;(((m<cl.heritage.length) && (++__CLOVER_62_0.cloverRec.CT[1555]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1555]==0&false));m++)
								{{
									__CLOVER_62_0.cloverRec.S[4319]++;if((((ah.heritage==cl.heritage[m]) && (++__CLOVER_62_0.cloverRec.CT[1556]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1556]==0&false)))
									{{
										__CLOVER_62_0.cloverRec.S[4320]++;no1=m;
										__CLOVER_62_0.cloverRec.S[4321]++;break;
									}
								}}
								}}
								}else
								{{// heritage implicite vers ANY
									__CLOVER_62_0.cloverRec.S[4322]++;no1=0;
								}
								}assert((((no1!=-1)) && (++__CLOVER_62_0.cloverRec.CT[1557]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1557]==0&false));
								__CLOVER_62_0.cloverRec.S[4323]++;h=ah.heritage;
								__CLOVER_62_0.cloverRec.S[4324]++;if((((h.rename!=null) && (++__CLOVER_62_0.cloverRec.CT[1558]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1558]==0&false)))
								{{
									__CLOVER_62_0.cloverRec.S[4325]++;for(m=0;(((m<h.rename.length) && (++__CLOVER_62_0.cloverRec.CT[1559]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1559]==0&false));m++)
									{{
										__CLOVER_62_0.cloverRec.S[4326]++;if((((!h.rename[m].nom_dest.meme_nom(ac.nom)) && (++__CLOVER_62_0.cloverRec.CT[1560]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1560]==0&false)))
										{{
											__CLOVER_62_0.cloverRec.S[4327]++;n1=convertie_nom_feature(h.rename[m].nom_src);
											__CLOVER_62_0.cloverRec.S[4328]++;break;
										}
									}}
								}}
								}__CLOVER_62_0.cloverRec.S[4329]++;asc=new CIAttribut_Ascendant(no1,n1,convertie_source((Token)null));
								__CLOVER_62_0.cloverRec.S[4330]++;attr.ajoute_ascendant(asc);
								/*}
								else
								{
									assert(false):"attr="+attr.nom+";k="+k+
													";ah="+ah.heritage.type+";classe="+classe.nom;
								}*/
								}
							}
						}}
					}}
				}}
			}}
		}}
	}}

	/**
	 * @param object
	 * @return
	 */
	protected CISource convertie_source(Token pos) {__CLOVER_62_0.cloverRec.M[433]++;
		// TODO Auto-generated method stub
		__CLOVER_62_0.cloverRec.S[4331]++;return null;
	}


	protected CISource convertie_source(Position pos) {__CLOVER_62_0.cloverRec.M[434]++;
		// TODO Auto-generated method stub
		__CLOVER_62_0.cloverRec.S[4332]++;return null;
	}
	
	protected CIAttribut donne_attribut(CIProgramme p,Attribut_Heritage ah)
	{__CLOVER_62_0.cloverRec.M[435]++;
		__CLOVER_62_0.cloverRec.S[4333]++;CIType type;
		__CLOVER_62_0.cloverRec.S[4334]++;String nom;
		__CLOVER_62_0.cloverRec.S[4335]++;CIClasse cl;
		__CLOVER_62_0.cloverRec.S[4336]++;CIAttribut attr;
		__CLOVER_62_0.cloverRec.S[4337]++;CINom_Attribut n;
		assert((((p!=null)) && (++__CLOVER_62_0.cloverRec.CT[1561]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1561]==0&false));
		assert((((ah!=null)) && (++__CLOVER_62_0.cloverRec.CT[1562]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1562]==0&false));
		__CLOVER_62_0.cloverRec.S[4338]++;type=convertie_type(ah.heritage.type);
		__CLOVER_62_0.cloverRec.S[4339]++;cl=p.donne_classe(type);
		__CLOVER_62_0.cloverRec.S[4340]++;n=convertie_nom_feature(ah.nom);
		__CLOVER_62_0.cloverRec.S[4341]++;return cl.donne_attribut(n);
	}

	protected CIClasse convertie_classe(tinyeiffel.ast.Classe classe,CIProgramme p)
	{__CLOVER_62_0.cloverRec.M[436]++;
		__CLOVER_62_0.cloverRec.S[4342]++;CIClasse cl=null;
		__CLOVER_62_0.cloverRec.S[4343]++;CIAttribut attr;
		__CLOVER_62_0.cloverRec.S[4344]++;Table_Symbol table;
		__CLOVER_62_0.cloverRec.S[4345]++;Attribut_Complet ac;
		__CLOVER_62_0.cloverRec.S[4346]++;tinyeiffel.ast.Attribut attr1;
		__CLOVER_62_0.cloverRec.S[4347]++;CIAttribut attr2,liste_attr[]=null;
		__CLOVER_62_0.cloverRec.S[4348]++;int no;
		__CLOVER_62_0.cloverRec.S[4349]++;CITypeSimple heritage[];
		__CLOVER_62_0.cloverRec.S[4350]++;CICreation liste_creation[]=null;
		__CLOVER_62_0.cloverRec.S[4351]++;CIAssertion inv=null;
		
		assert((((p!=null)) && (++__CLOVER_62_0.cloverRec.CT[1563]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1563]==0&false));
		assert((((classe!=null)) && (++__CLOVER_62_0.cloverRec.CT[1564]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1564]==0&false));
		__CLOVER_62_0.cloverRec.S[4352]++;if((((classe.heritage!=null) && (++__CLOVER_62_0.cloverRec.CT[1565]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1565]==0&false)))
		{{
			__CLOVER_62_0.cloverRec.S[4353]++;heritage=new CITypeSimple[classe.heritage.length];
			__CLOVER_62_0.cloverRec.S[4354]++;for(int i=0;(((i<classe.heritage.length) && (++__CLOVER_62_0.cloverRec.CT[1566]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1566]==0&false));i++)
			{{
				__CLOVER_62_0.cloverRec.S[4355]++;heritage[i]=(CITypeSimple)convertie_type(classe.heritage[i].type);
			}
		}}
		}else
		{{
			__CLOVER_62_0.cloverRec.S[4356]++;if((((classe.nom.equalsIgnoreCase("general")||
				classe.nom.equalsIgnoreCase("any")) && (++__CLOVER_62_0.cloverRec.CT[1567]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1567]==0&false)))
			{{
				__CLOVER_62_0.cloverRec.S[4357]++;heritage=null;
			}
			}else {__CLOVER_62_0.cloverRec.S[4358]++;if((((classe.nom.equalsIgnoreCase("none")) && (++__CLOVER_62_0.cloverRec.CT[1568]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1568]==0&false)))
			{{
				__CLOVER_62_0.cloverRec.S[4359]++;int i,len,j;
				__CLOVER_62_0.cloverRec.S[4360]++;tinyeiffel.ast.Classe cl0;
				__CLOVER_62_0.cloverRec.S[4361]++;len=compiler.liste_classe.size()-1;
				__CLOVER_62_0.cloverRec.S[4362]++;heritage=new CITypeSimple[len];
				__CLOVER_62_0.cloverRec.S[4363]++;j=0;
				__CLOVER_62_0.cloverRec.S[4364]++;for(i=0;(((i<len+1) && (++__CLOVER_62_0.cloverRec.CT[1569]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1569]==0&false));i++)
				{{
					__CLOVER_62_0.cloverRec.S[4365]++;cl0=(tinyeiffel.ast.Classe)compiler.liste_classe.elementAt(i);
					__CLOVER_62_0.cloverRec.S[4366]++;if((((!cl0.nom.equalsIgnoreCase("none")) && (++__CLOVER_62_0.cloverRec.CT[1570]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1570]==0&false)))
					{{
						assert((((j>=0)) && (++__CLOVER_62_0.cloverRec.CT[1571]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1571]==0&false));
						assert((((j<len)) && (++__CLOVER_62_0.cloverRec.CT[1572]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1572]==0&false));
						__CLOVER_62_0.cloverRec.S[4367]++;heritage[j]=(CITypeSimple)convertie_type(cl0.type);
						__CLOVER_62_0.cloverRec.S[4368]++;j++;
					}
				}}
				}assert((((j==len)) && (++__CLOVER_62_0.cloverRec.CT[1573]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1573]==0&false));
			}
			}else
			{{
				__CLOVER_62_0.cloverRec.S[4369]++;heritage=new CITypeSimple[1];
				__CLOVER_62_0.cloverRec.S[4370]++;heritage[0]=(CITypeSimple)convertie_type(new tinyeiffel.ast.TypeSimple(false,"any",new Vector()));
			}
		}}}
		}__CLOVER_62_0.cloverRec.S[4371]++;cl=new CIClasse((CITypeSimple)convertie_type(classe.type),p,heritage,
				convertie_source(classe.tclass));
		__CLOVER_62_0.cloverRec.S[4372]++;if((((classe.expanded) && (++__CLOVER_62_0.cloverRec.CT[1574]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1574]==0&false)))
			{__CLOVER_62_0.cloverRec.S[4373]++;cl.nom.expanded=true;
		}__CLOVER_62_0.cloverRec.S[4374]++;table=context.donne_table_symbol(classe);
		assert((((table!=null)) && (++__CLOVER_62_0.cloverRec.CT[1575]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1575]==0&false)):"classe="+classe.nom;
		__CLOVER_62_0.cloverRec.S[4375]++;compiler.env.entre_classe(classe,table);
		__CLOVER_62_0.cloverRec.S[4376]++;if((((table.liste_attribut!=null) && (++__CLOVER_62_0.cloverRec.CT[1576]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1576]==0&false)))
		{{
			__CLOVER_62_0.cloverRec.S[4377]++;int len_plus=0,i=0;
			__CLOVER_62_0.cloverRec.S[4378]++;Vector liste;
			__CLOVER_62_0.cloverRec.S[4379]++;liste=new Vector();
			//liste_attr=new Attribut[table.liste_attribut.length+len_plus];
			__CLOVER_62_0.cloverRec.S[4380]++;for(i=0;(((i<table.liste_attribut.length) && (++__CLOVER_62_0.cloverRec.CT[1577]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1577]==0&false));i++)
			{{
				__CLOVER_62_0.cloverRec.S[4381]++;ac=table.liste_attribut[i];
				assert((((ac!=null)) && (++__CLOVER_62_0.cloverRec.CT[1578]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1578]==0&false));
				__CLOVER_62_0.cloverRec.S[4382]++;attr2=convertie_attribut(ac,false,cl,liste);
				//liste_attr[i]=attr2;
				__CLOVER_62_0.cloverRec.S[4383]++;liste.addElement(attr2);
			}
			}__CLOVER_62_0.cloverRec.S[4384]++;ajout_attr_speciaux(classe,liste);
			__CLOVER_62_0.cloverRec.S[4385]++;liste_attr=new CIAttribut[liste.size()];
			__CLOVER_62_0.cloverRec.S[4386]++;liste.copyInto(liste_attr);
		}
		}else
		{{
			__CLOVER_62_0.cloverRec.S[4387]++;Vector liste;
			__CLOVER_62_0.cloverRec.S[4388]++;liste=new Vector();
			//liste_attr=new Attribut[table.liste_attribut.length+len_plus];
			__CLOVER_62_0.cloverRec.S[4389]++;ajout_attr_speciaux(classe,liste);
			__CLOVER_62_0.cloverRec.S[4390]++;if((((liste.size()>0) && (++__CLOVER_62_0.cloverRec.CT[1579]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1579]==0&false)))
			{{
				__CLOVER_62_0.cloverRec.S[4391]++;liste_attr=new CIAttribut[liste.size()];
				__CLOVER_62_0.cloverRec.S[4392]++;liste.copyInto(liste_attr);
			}
		}}
		}__CLOVER_62_0.cloverRec.S[4393]++;if((((classe.creation!=null) && (++__CLOVER_62_0.cloverRec.CT[1580]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1580]==0&false)))
		{{
			__CLOVER_62_0.cloverRec.S[4394]++;int i;
			__CLOVER_62_0.cloverRec.S[4395]++;liste_creation=new CICreation[classe.creation.length];
			__CLOVER_62_0.cloverRec.S[4396]++;for(i=0;(((i<classe.creation.length) && (++__CLOVER_62_0.cloverRec.CT[1581]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1581]==0&false));i++)
			{{
				__CLOVER_62_0.cloverRec.S[4397]++;liste_creation[i]=convertie_creation(classe.creation[i]);
			}
		}}
		}__CLOVER_62_0.cloverRec.S[4398]++;if((((classe.invariant!=null) && (++__CLOVER_62_0.cloverRec.CT[1582]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1582]==0&false)))
			{__CLOVER_62_0.cloverRec.S[4399]++;inv=convertie_assert(cl,classe.invariant);
		}__CLOVER_62_0.cloverRec.S[4400]++;cl.invariant=inv;
		__CLOVER_62_0.cloverRec.S[4401]++;cl.liste_attribut=liste_attr;
		__CLOVER_62_0.cloverRec.S[4402]++;cl.creation=liste_creation;
		__CLOVER_62_0.cloverRec.S[4403]++;compiler.env.sort_classe();
		__CLOVER_62_0.cloverRec.S[4404]++;return cl;
	}

	/**
	 * ajoute des attributs sp\u00e9ciaux suivant la classe
	 */	
	protected void ajout_attr_speciaux(tinyeiffel.ast.Classe classe,Vector liste)
	{__CLOVER_62_0.cloverRec.M[437]++;
		__CLOVER_62_0.cloverRec.S[4405]++;CIAttribut attr2;
		__CLOVER_62_0.cloverRec.S[4406]++;if((((classe.nom.equalsIgnoreCase("integer")) && (++__CLOVER_62_0.cloverRec.CT[1583]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1583]==0&false)))
		{{
			__CLOVER_62_0.cloverRec.S[4407]++;attr2=new CIAttribut(new CINom_Attribut("$val_int",null),null);
			__CLOVER_62_0.cloverRec.S[4408]++;attr2.retour=new CITypeSimple(false,"$integer",null,null);
			__CLOVER_62_0.cloverRec.S[4409]++;attr2.type=new CITypeSimple(false,"integer",null,null);
			//liste_attr[i]=attr2;
			__CLOVER_62_0.cloverRec.S[4410]++;liste.addElement(attr2);
		}
		}else {__CLOVER_62_0.cloverRec.S[4411]++;if((((classe.nom.equalsIgnoreCase("boolean")) && (++__CLOVER_62_0.cloverRec.CT[1584]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1584]==0&false)))
		{{
			__CLOVER_62_0.cloverRec.S[4412]++;attr2=new CIAttribut(new CINom_Attribut("$val_bool",null),null);
			__CLOVER_62_0.cloverRec.S[4413]++;attr2.retour=new CITypeSimple(false,"$boolean",null,null);
			__CLOVER_62_0.cloverRec.S[4414]++;attr2.type=new CITypeSimple(false,"boolean",null,null);
			//liste_attr[i]=attr2;
			__CLOVER_62_0.cloverRec.S[4415]++;liste.addElement(attr2);
		}
		}else {__CLOVER_62_0.cloverRec.S[4416]++;if((((classe.nom.equalsIgnoreCase("real")) && (++__CLOVER_62_0.cloverRec.CT[1585]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1585]==0&false)))
		{{
			__CLOVER_62_0.cloverRec.S[4417]++;attr2=new CIAttribut(new CINom_Attribut("$val_real",null),null);
			__CLOVER_62_0.cloverRec.S[4418]++;attr2.retour=new CITypeSimple(false,"$real",null,null);
			__CLOVER_62_0.cloverRec.S[4419]++;attr2.type=new CITypeSimple(false,"real",null,null);
			//liste_attr[i]=attr2;
			__CLOVER_62_0.cloverRec.S[4420]++;liste.addElement(attr2);
		}
		}else {__CLOVER_62_0.cloverRec.S[4421]++;if((((classe.nom.equalsIgnoreCase("double")) && (++__CLOVER_62_0.cloverRec.CT[1586]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1586]==0&false)))
		{{
			__CLOVER_62_0.cloverRec.S[4422]++;attr2=new CIAttribut(new CINom_Attribut("$val_double",null),null);
			__CLOVER_62_0.cloverRec.S[4423]++;attr2.retour=new CITypeSimple(false,"$double",null,null);
			__CLOVER_62_0.cloverRec.S[4424]++;attr2.type=new CITypeSimple(false,"double",null,null);
			//liste_attr[i]=attr2;
			__CLOVER_62_0.cloverRec.S[4425]++;liste.addElement(attr2);
		}
		}else {__CLOVER_62_0.cloverRec.S[4426]++;if((((classe.nom.equalsIgnoreCase("character")) && (++__CLOVER_62_0.cloverRec.CT[1587]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1587]==0&false)))
		{{
			__CLOVER_62_0.cloverRec.S[4427]++;attr2=new CIAttribut(new CINom_Attribut("$val_char",null),null);
			__CLOVER_62_0.cloverRec.S[4428]++;attr2.retour=new CITypeSimple(false,"$character",null,null);
			__CLOVER_62_0.cloverRec.S[4429]++;attr2.type=new CITypeSimple(false,"character",null,null);
			//liste_attr[i]=attr2;
			__CLOVER_62_0.cloverRec.S[4430]++;liste.addElement(attr2);
		}
		}else {__CLOVER_62_0.cloverRec.S[4431]++;if((((classe.nom.equalsIgnoreCase("array")) && (++__CLOVER_62_0.cloverRec.CT[1588]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1588]==0&false)))
		{{
			__CLOVER_62_0.cloverRec.S[4432]++;CIType liste2[];
			__CLOVER_62_0.cloverRec.S[4433]++;int i;
			//assert(false):"Array !";
			__CLOVER_62_0.cloverRec.S[4434]++;attr2=new CIAttribut(new CINom_Attribut("$tab",null),null);
			assert((((classe.type.generique!=null)) && (++__CLOVER_62_0.cloverRec.CT[1589]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1589]==0&false));
			assert((((classe.type.generique.length>0)) && (++__CLOVER_62_0.cloverRec.CT[1590]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1590]==0&false));
			__CLOVER_62_0.cloverRec.S[4435]++;liste2=new CIType[classe.type.generique.length];
			__CLOVER_62_0.cloverRec.S[4436]++;for(i=0;(((i<classe.type.generique.length) && (++__CLOVER_62_0.cloverRec.CT[1591]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1591]==0&false));i++)
			{{
				__CLOVER_62_0.cloverRec.S[4437]++;liste2[i]=convertie_type(classe.type.generique[i]);
			}
			}__CLOVER_62_0.cloverRec.S[4438]++;attr2.retour=new CITypeSimple(false,"$array",liste2,null);
			__CLOVER_62_0.cloverRec.S[4439]++;attr2.type=new CITypeSimple(false,"array",null,null);
			//liste_attr[i]=attr2;
			__CLOVER_62_0.cloverRec.S[4440]++;liste.addElement(attr2);
		}
		}else {__CLOVER_62_0.cloverRec.S[4441]++;if((((classe.nom.equalsIgnoreCase("string")) && (++__CLOVER_62_0.cloverRec.CT[1592]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1592]==0&false)))
		{{
			__CLOVER_62_0.cloverRec.S[4442]++;attr2=new CIAttribut(new CINom_Attribut("$val_string",null),null);
			__CLOVER_62_0.cloverRec.S[4443]++;attr2.retour=new CITypeSimple(false,"$string",null,null);
			__CLOVER_62_0.cloverRec.S[4444]++;attr2.type=new CITypeSimple(false,"string",null,null);
			//liste_attr[i]=attr2;
			__CLOVER_62_0.cloverRec.S[4445]++;liste.addElement(attr2);
		}
	}}}}}}}}
	
	protected CICreation convertie_creation(tinyeiffel.ast.Creation create)
	{__CLOVER_62_0.cloverRec.M[438]++;
		__CLOVER_62_0.cloverRec.S[4446]++;CICreation t=null;
		__CLOVER_62_0.cloverRec.S[4447]++;CINom_Attribut attr[]=null;
		__CLOVER_62_0.cloverRec.S[4448]++;CIType type[]=null;
		__CLOVER_62_0.cloverRec.S[4449]++;int i;
		assert((((create!=null)) && (++__CLOVER_62_0.cloverRec.CT[1593]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1593]==0&false));
		__CLOVER_62_0.cloverRec.S[4450]++;attr=new CINom_Attribut[create.nom_fonction.length];
		__CLOVER_62_0.cloverRec.S[4451]++;for(i=0;(((i<create.nom_fonction.length) && (++__CLOVER_62_0.cloverRec.CT[1594]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1594]==0&false));i++)
		{{
			__CLOVER_62_0.cloverRec.S[4452]++;attr[i]=convertie_nom_feature(create.nom_fonction[i]);
		}
		}__CLOVER_62_0.cloverRec.S[4453]++;if((((create.liste_type!=null) && (++__CLOVER_62_0.cloverRec.CT[1595]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1595]==0&false)))
		{{
			__CLOVER_62_0.cloverRec.S[4454]++;type=new CIType[create.liste_type.length];
			__CLOVER_62_0.cloverRec.S[4455]++;for(i=0;(((i<create.liste_type.length) && (++__CLOVER_62_0.cloverRec.CT[1596]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1596]==0&false));i++)
			{{
				__CLOVER_62_0.cloverRec.S[4456]++;type[i]=convertie_type(create.liste_type[i]);
			}
		}}
		//create.nom_fonction
		}__CLOVER_62_0.cloverRec.S[4457]++;t=new CICreation(type,attr,convertie_source(create.tcreation));
		__CLOVER_62_0.cloverRec.S[4458]++;return t;
		/*if(type.is_like)
		{
			t=new Type(((tinyeiffel.ast.Expr_Var)type.like).nom);
		}
		else
		{
			if(type.generique!=null)
			{
				t2=new Type[type.generique.length];
				for(i=0;i<t2.length;i++)
				{
					t2[i]=convertie_type(type.generique[i]);
				}
			}
			t=new Type(type.expanded,type.nom,t2);
		}
		return t;*/
	}

	protected CIType convertie_type(tinyeiffel.ast.Type type)
	{__CLOVER_62_0.cloverRec.M[439]++;
		__CLOVER_62_0.cloverRec.S[4459]++;CIType t=null;
		__CLOVER_62_0.cloverRec.S[4460]++;CIType t2[]=null;
		__CLOVER_62_0.cloverRec.S[4461]++;int i;
		assert((((type!=null)) && (++__CLOVER_62_0.cloverRec.CT[1597]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1597]==0&false));
		__CLOVER_62_0.cloverRec.S[4462]++;if((((type.is_like) && (++__CLOVER_62_0.cloverRec.CT[1598]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1598]==0&false)))
		{{
			__CLOVER_62_0.cloverRec.S[4463]++;t=new CITypeAncre(((tinyeiffel.ast.Expr_Var)type.like).nom,
					convertie_source(type.tlike));
		}
		}else
		{{
			__CLOVER_62_0.cloverRec.S[4464]++;if((((type.generique!=null) && (++__CLOVER_62_0.cloverRec.CT[1599]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1599]==0&false)))
			{{
				__CLOVER_62_0.cloverRec.S[4465]++;t2=new CIType[type.generique.length];
				__CLOVER_62_0.cloverRec.S[4466]++;for(i=0;(((i<t2.length) && (++__CLOVER_62_0.cloverRec.CT[1600]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1600]==0&false));i++)
				{{
					__CLOVER_62_0.cloverRec.S[4467]++;t2[i]=convertie_type(type.generique[i]);
				}
			}}
			}__CLOVER_62_0.cloverRec.S[4468]++;t=new CITypeSimple(type.expanded,type.nom,t2,convertie_source(type.tnom));
		}
		}__CLOVER_62_0.cloverRec.S[4469]++;return t;
	}

	protected CIAttribut convertie_attribut(Attribut_Complet attr,boolean renomage,
														CIClasse cl, 
														Vector liste)
	{__CLOVER_62_0.cloverRec.M[440]++;
		__CLOVER_62_0.cloverRec.S[4470]++;CIAttribut t=null;
		__CLOVER_62_0.cloverRec.S[4471]++;CINom_Attribut n;
		assert((((attr!=null)) && (++__CLOVER_62_0.cloverRec.CT[1601]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1601]==0&false));
		assert((((cl!=null)) && (++__CLOVER_62_0.cloverRec.CT[1602]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1602]==0&false));
		__CLOVER_62_0.cloverRec.S[4472]++;n=convertie_nom_feature(attr.getAttribut().nom);
		__CLOVER_62_0.cloverRec.S[4473]++;t=new CIAttribut(n,n.source);
		// affectation du type au resultat
		__CLOVER_62_0.cloverRec.S[4474]++;if((((attr.no_attribut_reel==-1) && (++__CLOVER_62_0.cloverRec.CT[1603]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1603]==0&false)))
		{{// c'est un attribut directe
			__CLOVER_62_0.cloverRec.S[4475]++;t.type=(CITypeSimple)convertie_type(attr.getAttribut().classe.type);
			__CLOVER_62_0.cloverRec.S[4476]++;CIRoutine routine;
			__CLOVER_62_0.cloverRec.S[4477]++;Feature f=attr.getFeature();
			__CLOVER_62_0.cloverRec.S[4478]++;if((((f instanceof FeatureRoutine||
				f instanceof FeatureExternal||
				f instanceof FeatureDeferred) && (++__CLOVER_62_0.cloverRec.CT[1604]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1604]==0&false)))
			{{
				__CLOVER_62_0.cloverRec.S[4479]++;compiler.env.entre_feature(f);
				__CLOVER_62_0.cloverRec.S[4480]++;compiler.env.entre_do();
				__CLOVER_62_0.cloverRec.S[4481]++;routine=convertie_feature(cl,f);
				__CLOVER_62_0.cloverRec.S[4482]++;t.routine=routine;
				__CLOVER_62_0.cloverRec.S[4483]++;if((((routine.retour!=null) && (++__CLOVER_62_0.cloverRec.CT[1605]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1605]==0&false)))
					{__CLOVER_62_0.cloverRec.S[4484]++;t.retour=routine.retour.type;
				}__CLOVER_62_0.cloverRec.S[4485]++;compiler.env.sort_do();
				__CLOVER_62_0.cloverRec.S[4486]++;compiler.env.sort_feature();
				__CLOVER_62_0.cloverRec.S[4487]++;if((((f instanceof FeatureRoutine&&((FeatureRoutine)f).once) && (++__CLOVER_62_0.cloverRec.CT[1606]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1606]==0&false)))
				{{// routine once
					__CLOVER_62_0.cloverRec.S[4488]++;CIAttribut attr2;
					__CLOVER_62_0.cloverRec.S[4489]++;attr2=new CIAttribut(new CINom_Attribut(
							this.nom_once_traite(cl,f.liste_nom[0]),null),null);
					__CLOVER_62_0.cloverRec.S[4490]++;attr2.retour=new CITypeSimple(false,"$boolean",null,null);
					__CLOVER_62_0.cloverRec.S[4491]++;attr2.type=new CITypeSimple(false,cl.nom.nom,null,null);
					__CLOVER_62_0.cloverRec.S[4492]++;attr2.var_static=true;
					__CLOVER_62_0.cloverRec.S[4493]++;liste.addElement(attr2);
					__CLOVER_62_0.cloverRec.S[4494]++;if((((routine.retour!=null) && (++__CLOVER_62_0.cloverRec.CT[1607]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1607]==0&false)))
					{{
						__CLOVER_62_0.cloverRec.S[4495]++;attr2=new CIAttribut(
								new CINom_Attribut(nom_once_result(cl,f.liste_nom[0]),null),null);
						// TODO: a voir que faire pour un type ancre
						__CLOVER_62_0.cloverRec.S[4496]++;attr2.retour=new CITypeSimple(false,((CITypeSimple)routine.retour.type).nom,null,null);
						__CLOVER_62_0.cloverRec.S[4497]++;attr2.type=new CITypeSimple(false,cl.nom.nom,null,null);
						__CLOVER_62_0.cloverRec.S[4498]++;attr2.var_static=true;
						__CLOVER_62_0.cloverRec.S[4499]++;liste.addElement(attr2);
					}
				}}
			}}
			}else {__CLOVER_62_0.cloverRec.S[4500]++;if((((f instanceof FeatureExpr) && (++__CLOVER_62_0.cloverRec.CT[1608]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1608]==0&false)))
			{{
				__CLOVER_62_0.cloverRec.S[4501]++;FeatureExpr f2=(FeatureExpr)f;
				__CLOVER_62_0.cloverRec.S[4502]++;if((((f2.type_retour!=null) && (++__CLOVER_62_0.cloverRec.CT[1609]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1609]==0&false)))
					{__CLOVER_62_0.cloverRec.S[4503]++;t.retour=convertie_type(f2.type_retour);
				}__CLOVER_62_0.cloverRec.S[4504]++;t.cst=convertie_expr_simple(f2.expr);
			}
			}else {__CLOVER_62_0.cloverRec.S[4505]++;if((((f instanceof FeatureUnique) && (++__CLOVER_62_0.cloverRec.CT[1610]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1610]==0&false)))
			{{// TODO : prendre en compte le numero
				__CLOVER_62_0.cloverRec.S[4506]++;if((((f.type_retour!=null) && (++__CLOVER_62_0.cloverRec.CT[1611]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1611]==0&false)))
					{__CLOVER_62_0.cloverRec.S[4507]++;t.retour=convertie_type(f.type_retour);
			}}
			}else {__CLOVER_62_0.cloverRec.S[4508]++;if((((f instanceof FeatureAttr) && (++__CLOVER_62_0.cloverRec.CT[1612]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1612]==0&false)))
			{{
				__CLOVER_62_0.cloverRec.S[4509]++;if((((f.type_retour!=null) && (++__CLOVER_62_0.cloverRec.CT[1613]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1613]==0&false)))
					{__CLOVER_62_0.cloverRec.S[4510]++;t.retour=convertie_type(f.type_retour);
			}}
		}}}}}
		}else
		{{// c'est un attribut qui vient d'un ancetre
			__CLOVER_62_0.cloverRec.S[4511]++;Feature f=attr.getFeature();
			__CLOVER_62_0.cloverRec.S[4512]++;t.type=(CITypeSimple)convertie_type(attr.attribut_ancetre[attr.no_attribut_reel].heritage.type);
			__CLOVER_62_0.cloverRec.S[4513]++;if((((f.type_retour!=null) && (++__CLOVER_62_0.cloverRec.CT[1614]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1614]==0&false)))
				{__CLOVER_62_0.cloverRec.S[4514]++;t.retour=convertie_type(f.type_retour);
		}}
		}__CLOVER_62_0.cloverRec.S[4515]++;return t;
	}

	protected CIRoutine convertie_feature(CIClasse cl,Feature f)
	{__CLOVER_62_0.cloverRec.M[441]++;
		__CLOVER_62_0.cloverRec.S[4516]++;CIRoutine r;
		__CLOVER_62_0.cloverRec.S[4517]++;Signature sig;
		__CLOVER_62_0.cloverRec.S[4518]++;DeclareVar d;
		__CLOVER_62_0.cloverRec.S[4519]++;CIDeclare_Var d2,type_retour=null;
		__CLOVER_62_0.cloverRec.S[4520]++;CIListe_Var param=null;
		__CLOVER_62_0.cloverRec.S[4521]++;int i,j;
		__CLOVER_62_0.cloverRec.S[4522]++;CIAssertion pre=null,post=null;
		assert((((cl!=null)) && (++__CLOVER_62_0.cloverRec.CT[1615]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1615]==0&false));
		assert((((f!=null)) && (++__CLOVER_62_0.cloverRec.CT[1616]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1616]==0&false));
		assert((((f instanceof FeatureRoutine||
				f instanceof FeatureExternal||
				f instanceof FeatureDeferred)) && (++__CLOVER_62_0.cloverRec.CT[1617]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1617]==0&false));
		__CLOVER_62_0.cloverRec.S[4523]++;no_temp0=0;
		__CLOVER_62_0.cloverRec.S[4524]++;if((((f.param!=null) && (++__CLOVER_62_0.cloverRec.CT[1618]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1618]==0&false)))
		{{
			//param=new Declare_Var[f.param.length];
			__CLOVER_62_0.cloverRec.S[4525]++;param=new CIListe_Var();
			__CLOVER_62_0.cloverRec.S[4526]++;for(i=0;(((i<f.param.length) && (++__CLOVER_62_0.cloverRec.CT[1619]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1619]==0&false));i++)
			{{
				__CLOVER_62_0.cloverRec.S[4527]++;d=f.param[i];
				__CLOVER_62_0.cloverRec.S[4528]++;d2=new CIDeclare_Var(d.nom,convertie_type(d.type),
						convertie_source(d.tnom));
				//param[i]=d2;
				__CLOVER_62_0.cloverRec.S[4529]++;param.ajoute(d2);
			}
		}}
		}__CLOVER_62_0.cloverRec.S[4530]++;if((((f.type_retour!=null) && (++__CLOVER_62_0.cloverRec.CT[1620]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1620]==0&false)))
		{{
			__CLOVER_62_0.cloverRec.S[4531]++;d2=new CIDeclare_Var("Result",convertie_type(f.type_retour),null);
			__CLOVER_62_0.cloverRec.S[4532]++;type_retour=d2;
		}
		}__CLOVER_62_0.cloverRec.S[4533]++;if((((f.require!=null) && (++__CLOVER_62_0.cloverRec.CT[1621]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1621]==0&false)))
			{__CLOVER_62_0.cloverRec.S[4534]++;pre=convertie_assert(cl,f.require);
		}__CLOVER_62_0.cloverRec.S[4535]++;if((((f instanceof FeatureRoutine) && (++__CLOVER_62_0.cloverRec.CT[1622]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1622]==0&false)))
		{{
			__CLOVER_62_0.cloverRec.S[4536]++;FeatureRoutine f2=(FeatureRoutine)f;
			__CLOVER_62_0.cloverRec.S[4537]++;CIListe_Var local=null;
			__CLOVER_62_0.cloverRec.S[4538]++;CIInstruction instr[]=null,rescue[]=null;
			__CLOVER_62_0.cloverRec.S[4539]++;int len,pos;
			__CLOVER_62_0.cloverRec.S[4540]++;CIListe_Instr ins;
			__CLOVER_62_0.cloverRec.S[4541]++;CIExpr val;
			__CLOVER_62_0.cloverRec.S[4542]++;r=new CIRoutine(cl,convertie_source(f.debut()));
			__CLOVER_62_0.cloverRec.S[4543]++;if((((f2.local!=null) && (++__CLOVER_62_0.cloverRec.CT[1623]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1623]==0&false)))
			{{
				//local=new Declare_Var[f2.local.length];
				__CLOVER_62_0.cloverRec.S[4544]++;local=new CIListe_Var();
				__CLOVER_62_0.cloverRec.S[4545]++;for(i=0;(((i<f2.local.length) && (++__CLOVER_62_0.cloverRec.CT[1624]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1624]==0&false));i++)
				{{
					__CLOVER_62_0.cloverRec.S[4546]++;d=f2.local[i];
					__CLOVER_62_0.cloverRec.S[4547]++;d2=new CIDeclare_Var(d.nom,convertie_type(d.type),
							convertie_source(d.tnom));
					//local[i]=d2;
					__CLOVER_62_0.cloverRec.S[4548]++;local.ajoute(d2);
				}
			}}
			}__CLOVER_62_0.cloverRec.S[4549]++;r.local=local;
			__CLOVER_62_0.cloverRec.S[4550]++;r.parametre=param;
			__CLOVER_62_0.cloverRec.S[4551]++;r.retour=type_retour;
			__CLOVER_62_0.cloverRec.S[4552]++;if((((f2.liste_instr!=null) && (++__CLOVER_62_0.cloverRec.CT[1625]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1625]==0&false)))
				{__CLOVER_62_0.cloverRec.S[4553]++;instr=convertie_instr(cl,r,f2.liste_instr);
			}__CLOVER_62_0.cloverRec.S[4554]++;if((((f2.rescue!=null) && (++__CLOVER_62_0.cloverRec.CT[1626]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1626]==0&false)))
				{__CLOVER_62_0.cloverRec.S[4555]++;rescue=convertie_instr(cl,r,f2.rescue);
			}__CLOVER_62_0.cloverRec.S[4556]++;len=0;
			__CLOVER_62_0.cloverRec.S[4557]++;if((((r.local!=null) && (++__CLOVER_62_0.cloverRec.CT[1627]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1627]==0&false)))
				{__CLOVER_62_0.cloverRec.S[4558]++;len+=r.local.size();
			}__CLOVER_62_0.cloverRec.S[4559]++;if((((instr!=null) && (++__CLOVER_62_0.cloverRec.CT[1628]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1628]==0&false)))
				{__CLOVER_62_0.cloverRec.S[4560]++;len+=instr.length;
			}__CLOVER_62_0.cloverRec.S[4561]++;if((((rescue!=null) && (++__CLOVER_62_0.cloverRec.CT[1629]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1629]==0&false)))
				{__CLOVER_62_0.cloverRec.S[4562]++;len+=rescue.length;
			//if(f2.once)
			//	len+=1;
			//ins=new Instruction[len+4];
			}__CLOVER_62_0.cloverRec.S[4563]++;ins=new CIListe_Instr();
			__CLOVER_62_0.cloverRec.S[4564]++;pos=0;
			__CLOVER_62_0.cloverRec.S[4565]++;if((((f.type_retour!=null) && (++__CLOVER_62_0.cloverRec.CT[1630]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1630]==0&false)))
			{{
				__CLOVER_62_0.cloverRec.S[4566]++;d2=type_retour;
				__CLOVER_62_0.cloverRec.S[4567]++;val=valeur_defaut(d2.type);
				__CLOVER_62_0.cloverRec.S[4568]++;ins.ajoute(new CIInstruction_Affect(new CIExpr_Var(d2.nom,d2.source),
						val,null));
			}
			}__CLOVER_62_0.cloverRec.S[4569]++;if((((r.local!=null) && (++__CLOVER_62_0.cloverRec.CT[1631]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1631]==0&false)))
			{{// initialisation des variables
				__CLOVER_62_0.cloverRec.S[4570]++;for(i=0;(((i<r.local.size()) && (++__CLOVER_62_0.cloverRec.CT[1632]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1632]==0&false));i++)
				{{
					__CLOVER_62_0.cloverRec.S[4571]++;d2=r.local.elt(i);
					__CLOVER_62_0.cloverRec.S[4572]++;val=valeur_defaut(d2.type);
					//ins[i+pos]=new Instruction_Affect(new Expr_Var(d2.nom),val);
					__CLOVER_62_0.cloverRec.S[4573]++;ins.ajoute(new CIInstruction_Affect(new CIExpr_Var(d2.nom,d2.source),
							val,null));
				}
				}__CLOVER_62_0.cloverRec.S[4574]++;pos+=i;
			}
			//ins[pos]=new Instruction_Label("debut_routine");
			}__CLOVER_62_0.cloverRec.S[4575]++;ins.ajoute(new CIInstruction_Label("debut_routine",convertie_source(f.debut())));
			__CLOVER_62_0.cloverRec.S[4576]++;pos+=1;
			__CLOVER_62_0.cloverRec.S[4577]++;if((((f2.once) && (++__CLOVER_62_0.cloverRec.CT[1633]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1633]==0&false)))
			{{// TODO: prendre en compte les routines once avec plusieurs noms
				__CLOVER_62_0.cloverRec.S[4578]++;String nom_var_test,label_suite;
				__CLOVER_62_0.cloverRec.S[4579]++;CIDeclare_Var decl;
				__CLOVER_62_0.cloverRec.S[4580]++;CIExpr_Binaire expb;
				__CLOVER_62_0.cloverRec.S[4581]++;CIExpr_Scalaire exp1,exp2;
				__CLOVER_62_0.cloverRec.S[4582]++;CIExpr_Var expr_var;
				__CLOVER_62_0.cloverRec.S[4583]++;String once_traite=nom_once_traite(cl,f.liste_nom[0]);
				__CLOVER_62_0.cloverRec.S[4584]++;String once_result=nom_once_result(cl,f.liste_nom[0]);
				__CLOVER_62_0.cloverRec.S[4585]++;label_suite=temp("label_once");
				__CLOVER_62_0.cloverRec.S[4586]++;exp1=new CIExpr_Var(once_traite,null);
				__CLOVER_62_0.cloverRec.S[4587]++;ins.ajoute(new CIInstruction_Si_Non(exp1,label_suite,null));
				__CLOVER_62_0.cloverRec.S[4588]++;if((((f.type_retour!=null) && (++__CLOVER_62_0.cloverRec.CT[1634]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1634]==0&false)))
				{{
					__CLOVER_62_0.cloverRec.S[4589]++;expr_var=new CIExpr_Var("result",null);
					__CLOVER_62_0.cloverRec.S[4590]++;exp1=new CIExpr_Var(once_result,null);
					__CLOVER_62_0.cloverRec.S[4591]++;ins.ajoute(new CIInstruction_Affect(expr_var,exp1,null));
				}
				}__CLOVER_62_0.cloverRec.S[4592]++;ins.ajoute(new CIInstruction_Return(null));
				__CLOVER_62_0.cloverRec.S[4593]++;ins.ajoute(new CIInstruction_Label(label_suite,null));
				__CLOVER_62_0.cloverRec.S[4594]++;expr_var=new CIExpr_Var(once_traite,null);
				__CLOVER_62_0.cloverRec.S[4595]++;exp1=new CIExpr_Bool(true,null);
				__CLOVER_62_0.cloverRec.S[4596]++;ins.ajoute(new CIInstruction_Affect(expr_var,exp1,null));
			}
			}__CLOVER_62_0.cloverRec.S[4597]++;if((((instr!=null) && (++__CLOVER_62_0.cloverRec.CT[1635]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1635]==0&false)))
			{{
				__CLOVER_62_0.cloverRec.S[4598]++;for(j=0;(((j<instr.length) && (++__CLOVER_62_0.cloverRec.CT[1636]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1636]==0&false));j++)
				{{
					//ins[pos+j]=instr[j];
					__CLOVER_62_0.cloverRec.S[4599]++;ins.ajoute(instr[j]);
				}
				}__CLOVER_62_0.cloverRec.S[4600]++;pos+=j;
			}
			}__CLOVER_62_0.cloverRec.S[4601]++;if((((f2.once&&f.type_retour!=null) && (++__CLOVER_62_0.cloverRec.CT[1637]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1637]==0&false)))
			{{
				__CLOVER_62_0.cloverRec.S[4602]++;CIExpr_Var expr_var;
				__CLOVER_62_0.cloverRec.S[4603]++;CIExpr_Scalaire exp1;
				__CLOVER_62_0.cloverRec.S[4604]++;String once_result=nom_once_result(cl,f.liste_nom[0]);
				__CLOVER_62_0.cloverRec.S[4605]++;expr_var=new CIExpr_Var(once_result,null);
				__CLOVER_62_0.cloverRec.S[4606]++;exp1=new CIExpr_Var("result",null);
				__CLOVER_62_0.cloverRec.S[4607]++;ins.ajoute(new CIInstruction_Affect(expr_var,exp1,null));
			}
			//ins[pos]=new Instruction_Return();
			}__CLOVER_62_0.cloverRec.S[4608]++;ins.ajoute(new CIInstruction_Return(null));
			//ins[pos+1]=new Instruction_Label("debut_rescue");
			__CLOVER_62_0.cloverRec.S[4609]++;ins.ajoute(new CIInstruction_Label("debut_rescue",null));
			__CLOVER_62_0.cloverRec.S[4610]++;pos+=2;
			__CLOVER_62_0.cloverRec.S[4611]++;if((((rescue!=null) && (++__CLOVER_62_0.cloverRec.CT[1638]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1638]==0&false)))
			{{
				__CLOVER_62_0.cloverRec.S[4612]++;for(j=0;(((j<rescue.length) && (++__CLOVER_62_0.cloverRec.CT[1639]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1639]==0&false));j++)
				{{
					//ins[pos+j]=rescue[j];
					__CLOVER_62_0.cloverRec.S[4613]++;ins.ajoute(rescue[j]);
				}
				}__CLOVER_62_0.cloverRec.S[4614]++;pos+=j;
			}
			//ins[pos]=new Instruction_Raise(new Expr_Entier(4));
			}__CLOVER_62_0.cloverRec.S[4615]++;ins.ajoute(new CIInstruction_Raise(new CIExpr_Entier(4,null),null));
			__CLOVER_62_0.cloverRec.S[4616]++;pos+=1;
			//assert(pos==ins.length):"pos="+pos+";len="+ins.length;
			//instr=ins;
			//r.liste_instruction=instr;
			__CLOVER_62_0.cloverRec.S[4617]++;r.liste_instruction=ins;
		}
		}else {__CLOVER_62_0.cloverRec.S[4618]++;if((((f instanceof FeatureExternal) && (++__CLOVER_62_0.cloverRec.CT[1640]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1640]==0&false)))
		{{
			__CLOVER_62_0.cloverRec.S[4619]++;FeatureExternal fe=(FeatureExternal)f;
			__CLOVER_62_0.cloverRec.S[4620]++;String s;
			__CLOVER_62_0.cloverRec.S[4621]++;CIListe_Instr ins;
			__CLOVER_62_0.cloverRec.S[4622]++;s=fe.str.chaine_unique();
			__CLOVER_62_0.cloverRec.S[4623]++;ins=new CIListe_Instr();
			__CLOVER_62_0.cloverRec.S[4624]++;ins.ajoute(new CIInstruction_Label("debut_routine",convertie_source(f.debut())));
			__CLOVER_62_0.cloverRec.S[4625]++;if((((s.equalsIgnoreCase("\"tinyeiffel\"")) && (++__CLOVER_62_0.cloverRec.CT[1641]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1641]==0&false)))
			{{
				__CLOVER_62_0.cloverRec.S[4626]++;CIExpr_Var ev,ev2,ev3;
				__CLOVER_62_0.cloverRec.S[4627]++;CIExpr e;
				__CLOVER_62_0.cloverRec.S[4628]++;int type=0;
				__CLOVER_62_0.cloverRec.S[4629]++;r=new CIRoutine(cl,convertie_source(f.debut()));
				__CLOVER_62_0.cloverRec.S[4630]++;r.parametre=param;
				__CLOVER_62_0.cloverRec.S[4631]++;r.retour=type_retour;
				__CLOVER_62_0.cloverRec.S[4632]++;type=conv_type_op(cl.nom.nom,fe);
				assert((((type>0)) && (++__CLOVER_62_0.cloverRec.CT[1642]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1642]==0&false));
				__CLOVER_62_0.cloverRec.S[4633]++;instr_extern(ins,type,r);
			}
			}else
			{{
				__CLOVER_62_0.cloverRec.S[4634]++;r=new CIRoutine(cl,convertie_source(f.debut()));
				__CLOVER_62_0.cloverRec.S[4635]++;r.parametre=param;
				__CLOVER_62_0.cloverRec.S[4636]++;r.retour=type_retour;
				assert((((false)) && (++__CLOVER_62_0.cloverRec.CT[1643]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1643]==0&false)):"s="+s;
			}
			}__CLOVER_62_0.cloverRec.S[4637]++;ins.ajoute(new CIInstruction_Label("debut_rescue",null));
			__CLOVER_62_0.cloverRec.S[4638]++;ins.ajoute(new CIInstruction_Raise(new CIExpr_Entier(4,null),null));
			__CLOVER_62_0.cloverRec.S[4639]++;r.liste_instruction=ins;
		}
		}else
		{{
			__CLOVER_62_0.cloverRec.S[4640]++;r=new CIRoutine(cl,convertie_source(f.debut()));
			__CLOVER_62_0.cloverRec.S[4641]++;r.parametre=param;
			__CLOVER_62_0.cloverRec.S[4642]++;r.retour=type_retour;
		}
		}}__CLOVER_62_0.cloverRec.S[4643]++;if((((f.ensure!=null) && (++__CLOVER_62_0.cloverRec.CT[1644]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1644]==0&false)))
			{__CLOVER_62_0.cloverRec.S[4644]++;post=convertie_assert(cl,f.ensure);
		}__CLOVER_62_0.cloverRec.S[4645]++;r.precondition=pre;
		__CLOVER_62_0.cloverRec.S[4646]++;r.postcondition=post;
		__CLOVER_62_0.cloverRec.S[4647]++;return r;
	}

	protected HashMap liste_operation=null;
	
	protected Map liste_op()
	{__CLOVER_62_0.cloverRec.M[442]++;
		__CLOVER_62_0.cloverRec.S[4648]++;if((((liste_operation==null) && (++__CLOVER_62_0.cloverRec.CT[1645]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1645]==0&false)))
		{{
			__CLOVER_62_0.cloverRec.S[4649]++;liste_operation=new HashMap();
			// integer
			__CLOVER_62_0.cloverRec.S[4650]++;liste_operation.put("integer \"+\" 1",new Integer(extern_plus_int));
			__CLOVER_62_0.cloverRec.S[4651]++;liste_operation.put("integer \"-\" 1",new Integer(extern_moins_int));
			__CLOVER_62_0.cloverRec.S[4652]++;liste_operation.put("integer \"*\" 1",new Integer(extern_fois_int));
			__CLOVER_62_0.cloverRec.S[4653]++;liste_operation.put("integer \"/\" 1",new Integer(extern_divr_int));
			__CLOVER_62_0.cloverRec.S[4654]++;liste_operation.put("integer \"//\" 1",new Integer(extern_dive_int));
			__CLOVER_62_0.cloverRec.S[4655]++;liste_operation.put("integer \"^\" 1",new Integer(extern_puiss_int));
			__CLOVER_62_0.cloverRec.S[4656]++;liste_operation.put("integer \"\\\\\" 1",new Integer(extern_mod_int));
			__CLOVER_62_0.cloverRec.S[4657]++;liste_operation.put("integer \">=\" 1",new Integer(extern_sup_int));
			__CLOVER_62_0.cloverRec.S[4658]++;liste_operation.put("integer \">\" 1",new Integer(extern_sups_int));
			__CLOVER_62_0.cloverRec.S[4659]++;liste_operation.put("integer \"<\" 1",new Integer(extern_infs_int));
			__CLOVER_62_0.cloverRec.S[4660]++;liste_operation.put("integer \"<=\" 1",new Integer(extern_inf_int));
			__CLOVER_62_0.cloverRec.S[4661]++;liste_operation.put("integer \"+\" 0",new Integer(extern_plusu_int));
			__CLOVER_62_0.cloverRec.S[4662]++;liste_operation.put("integer \"-\" 0",new Integer(extern_moinsu_int));
			// real
			__CLOVER_62_0.cloverRec.S[4663]++;liste_operation.put("real \"+\" 1",new Integer(extern_plus_real));
			__CLOVER_62_0.cloverRec.S[4664]++;liste_operation.put("real \"-\" 1",new Integer(extern_moins_real));
			__CLOVER_62_0.cloverRec.S[4665]++;liste_operation.put("real \"*\" 1",new Integer(extern_fois_real));
			__CLOVER_62_0.cloverRec.S[4666]++;liste_operation.put("real \"/\" 1",new Integer(extern_divr_real));
			__CLOVER_62_0.cloverRec.S[4667]++;liste_operation.put("real \"^\" 1",new Integer(extern_puiss_real));
			__CLOVER_62_0.cloverRec.S[4668]++;liste_operation.put("real \">=\" 1",new Integer(extern_sup_real));
			__CLOVER_62_0.cloverRec.S[4669]++;liste_operation.put("real \">\" 1",new Integer(extern_sups_real));
			__CLOVER_62_0.cloverRec.S[4670]++;liste_operation.put("real \"<\" 1",new Integer(extern_infs_real));
			__CLOVER_62_0.cloverRec.S[4671]++;liste_operation.put("real \"<=\" 1",new Integer(extern_inf_real));
			__CLOVER_62_0.cloverRec.S[4672]++;liste_operation.put("real \"+\" 0",new Integer(extern_plusu_real));
			__CLOVER_62_0.cloverRec.S[4673]++;liste_operation.put("real \"-\" 0",new Integer(extern_moinsu_real));
			// double
			__CLOVER_62_0.cloverRec.S[4674]++;liste_operation.put("double \"+\" 1",new Integer(extern_plus_double));
			__CLOVER_62_0.cloverRec.S[4675]++;liste_operation.put("double \"-\" 1",new Integer(extern_moins_double));
			__CLOVER_62_0.cloverRec.S[4676]++;liste_operation.put("double \"*\" 1",new Integer(extern_fois_double));
			__CLOVER_62_0.cloverRec.S[4677]++;liste_operation.put("double \"/\" 1",new Integer(extern_divr_double));
			__CLOVER_62_0.cloverRec.S[4678]++;liste_operation.put("double \"^\" 1",new Integer(extern_puiss_double));
			__CLOVER_62_0.cloverRec.S[4679]++;liste_operation.put("double \">=\" 1",new Integer(extern_sup_double));
			__CLOVER_62_0.cloverRec.S[4680]++;liste_operation.put("double \">\" 1",new Integer(extern_sups_double));
			__CLOVER_62_0.cloverRec.S[4681]++;liste_operation.put("double \"<\" 1",new Integer(extern_infs_double));
			__CLOVER_62_0.cloverRec.S[4682]++;liste_operation.put("double \"<=\" 1",new Integer(extern_inf_double));
			__CLOVER_62_0.cloverRec.S[4683]++;liste_operation.put("double \"+\" 0",new Integer(extern_plusu_double));
			__CLOVER_62_0.cloverRec.S[4684]++;liste_operation.put("double \"-\" 0",new Integer(extern_moinsu_double));
			// boolean
			__CLOVER_62_0.cloverRec.S[4685]++;liste_operation.put("boolean \"and\" 1",new Integer(extern_and_bool));
			__CLOVER_62_0.cloverRec.S[4686]++;liste_operation.put("boolean \"or\" 1",new Integer(extern_or_bool));
			__CLOVER_62_0.cloverRec.S[4687]++;liste_operation.put("boolean \"xor\" 1",new Integer(extern_xor_bool));
			__CLOVER_62_0.cloverRec.S[4688]++;liste_operation.put("boolean \"implies\" 1",new Integer(extern_implies_bool));
			__CLOVER_62_0.cloverRec.S[4689]++;liste_operation.put("boolean \"not\" 0",new Integer(extern_not_bool));
			// array
			__CLOVER_62_0.cloverRec.S[4690]++;liste_operation.put("array put_ 2",new Integer(extern_put_array));
			__CLOVER_62_0.cloverRec.S[4691]++;liste_operation.put("array item_ 1",new Integer(extern_item_array));
			__CLOVER_62_0.cloverRec.S[4692]++;liste_operation.put("array resize_ 1",new Integer(extern_resize_array));
			__CLOVER_62_0.cloverRec.S[4693]++;liste_operation.put("array build_ 1",new Integer(extern_build_array));
			// string
			__CLOVER_62_0.cloverRec.S[4694]++;liste_operation.put("string \"+\" 1",new Integer(extern_plus_string));
			__CLOVER_62_0.cloverRec.S[4695]++;liste_operation.put("string put_ 2",new Integer(extern_put_string));
			__CLOVER_62_0.cloverRec.S[4696]++;liste_operation.put("string item_ 1",new Integer(extern_item_string));
			__CLOVER_62_0.cloverRec.S[4697]++;liste_operation.put("string resize_ 1",new Integer(extern_resize_string));
			__CLOVER_62_0.cloverRec.S[4698]++;liste_operation.put("string build_ 1",new Integer(extern_build_string));
			__CLOVER_62_0.cloverRec.S[4699]++;liste_operation.put("string count_ 0",new Integer(extern_count_string));
			// character
			__CLOVER_62_0.cloverRec.S[4700]++;liste_operation.put("character \">=\" 1",new Integer(extern_sup_character));
			__CLOVER_62_0.cloverRec.S[4701]++;liste_operation.put("character \">\" 1",new Integer(extern_sups_character));
			__CLOVER_62_0.cloverRec.S[4702]++;liste_operation.put("character \"<\" 1",new Integer(extern_infs_character));
			__CLOVER_62_0.cloverRec.S[4703]++;liste_operation.put("character \"<=\" 1",new Integer(extern_inf_character));
		}
		}assert((((liste_operation!=null)) && (++__CLOVER_62_0.cloverRec.CT[1646]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1646]==0&false));
		__CLOVER_62_0.cloverRec.S[4704]++;return liste_operation;
	}
	
	protected int conv_type_op(String nom_classe,FeatureExternal f)
	{__CLOVER_62_0.cloverRec.M[443]++;
		assert((((nom_classe!=null)) && (++__CLOVER_62_0.cloverRec.CT[1647]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1647]==0&false));
		assert((((f!=null)) && (++__CLOVER_62_0.cloverRec.CT[1648]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1648]==0&false));
		__CLOVER_62_0.cloverRec.S[4705]++;Map m;
		__CLOVER_62_0.cloverRec.S[4706]++;NomFeature n;
		__CLOVER_62_0.cloverRec.S[4707]++;String s;
		__CLOVER_62_0.cloverRec.S[4708]++;int i,nb_param;
		
		__CLOVER_62_0.cloverRec.S[4709]++;m=liste_op();
		__CLOVER_62_0.cloverRec.S[4710]++;if((((f.param==null) && (++__CLOVER_62_0.cloverRec.CT[1649]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1649]==0&false)))
			{__CLOVER_62_0.cloverRec.S[4711]++;nb_param=0;
		}else
			{__CLOVER_62_0.cloverRec.S[4712]++;nb_param=f.param.length;
		}__CLOVER_62_0.cloverRec.S[4713]++;for(i=0;(((i<f.liste_nom.length) && (++__CLOVER_62_0.cloverRec.CT[1650]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1650]==0&false));i++)
		{{
			__CLOVER_62_0.cloverRec.S[4714]++;n=f.liste_nom[i];
			__CLOVER_62_0.cloverRec.S[4715]++;if((((n.infix||n.prefix) && (++__CLOVER_62_0.cloverRec.CT[1651]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1651]==0&false)))
			{{
				__CLOVER_62_0.cloverRec.S[4716]++;s=nom_classe.toLowerCase()+" "+n.nom2.chaine_unique()+" "+nb_param;
				__CLOVER_62_0.cloverRec.S[4717]++;if((((m.containsKey(s)) && (++__CLOVER_62_0.cloverRec.CT[1652]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1652]==0&false)))
				{{
					__CLOVER_62_0.cloverRec.S[4718]++;Integer j;
					__CLOVER_62_0.cloverRec.S[4719]++;j=(Integer)m.get(s);
					__CLOVER_62_0.cloverRec.S[4720]++;return j.intValue();
				}
			}}
			}else
			{{
				__CLOVER_62_0.cloverRec.S[4721]++;s=nom_classe.toLowerCase()+" "+n.nom+" "+nb_param;
				__CLOVER_62_0.cloverRec.S[4722]++;if((((m.containsKey(s)) && (++__CLOVER_62_0.cloverRec.CT[1653]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1653]==0&false)))
				{{
					__CLOVER_62_0.cloverRec.S[4723]++;Integer j;
					__CLOVER_62_0.cloverRec.S[4724]++;j=(Integer)m.get(s);
					__CLOVER_62_0.cloverRec.S[4725]++;return j.intValue();
				}
			}}
		}}
		}assert((((false)) && (++__CLOVER_62_0.cloverRec.CT[1654]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1654]==0&false)):"classe="+nom_classe+",feature="+f.toString();
		__CLOVER_62_0.cloverRec.S[4726]++;return 0;
	}
		
	protected static final int debut=100;
	protected static final int type_int=1,type_real=2,type_double=3,
		type_char=4,type_bool=5,type_array=6,type_string=7;
	
	protected static final int put_=1,resize_=put_+1,item_=put_+2,
		build_=put_+3,count_=put_+4;
	
	protected static final int 
		extern_plus_int=debut*type_int+CIExpr_Binaire.Plus,
		extern_moins_int=debut*type_int+CIExpr_Binaire.Moins,
		extern_fois_int=debut*type_int+CIExpr_Binaire.Fois,
		extern_divr_int=debut*type_int+CIExpr_Binaire.Div_reel,
		extern_dive_int=debut*type_int+CIExpr_Binaire.Div_entier,
		extern_puiss_int=debut*type_int+CIExpr_Binaire.Puiss,
		extern_mod_int=debut*type_int+CIExpr_Binaire.Mod,
		extern_sup_int=debut*type_int+CIExpr_Binaire.Sup,
		extern_sups_int=debut*type_int+CIExpr_Binaire.SupS,
		//extern_egal_int=debut*type_int+Expr_Binaire.Egal,
		//extern_diff_int=debut*type_int+Expr_Binaire.Diff,
		extern_inf_int=debut*type_int+CIExpr_Binaire.Inf,
		extern_infs_int=debut*type_int+CIExpr_Binaire.InfS,
		extern_plusu_int=debut*type_int+CIExpr_Unaire.Plus,
		extern_moinsu_int=debut*type_int+CIExpr_Unaire.Moins;
	
	protected static final int 
		extern_plus_real=debut*type_real+CIExpr_Binaire.Plus,
		extern_moins_real=debut*type_real+CIExpr_Binaire.Moins,
		extern_fois_real=debut*type_real+CIExpr_Binaire.Fois,
		extern_divr_real=debut*type_real+CIExpr_Binaire.Div_reel,
		//extern_dive_real=debut*type_real+Expr_Binaire.Div_entier,
		extern_puiss_real=debut*type_real+CIExpr_Binaire.Puiss,
		//extern_mod_real=debut*type_real+Expr_Binaire.Mod,
		extern_sup_real=debut*type_real+CIExpr_Binaire.Sup,
		extern_sups_real=debut*type_real+CIExpr_Binaire.SupS,
		//extern_egal_int=debut*type_real+Expr_Binaire.Egal,
		//extern_diff_int=debut*type_real+Expr_Binaire.Diff,
		extern_inf_real=debut*type_real+CIExpr_Binaire.Inf,
		extern_infs_real=debut*type_real+CIExpr_Binaire.InfS,
		extern_plusu_real=debut*type_real+CIExpr_Unaire.Plus,
		extern_moinsu_real=debut*type_real+CIExpr_Unaire.Moins;
	
	protected static final int 
		extern_plus_double=debut*type_double+CIExpr_Binaire.Plus,
		extern_moins_double=debut*type_double+CIExpr_Binaire.Moins,
		extern_fois_double=debut*type_double+CIExpr_Binaire.Fois,
		extern_divr_double=debut*type_double+CIExpr_Binaire.Div_reel,
		//extern_dive_double=debut*type_double+Expr_Binaire.Div_entier,
		extern_puiss_double=debut*type_double+CIExpr_Binaire.Puiss,
		//extern_mod_double=debut*type_double+Expr_Binaire.Mod,
		extern_sup_double=debut*type_double+CIExpr_Binaire.Sup,
		extern_sups_double=debut*type_double+CIExpr_Binaire.SupS,
		//extern_egal_double=debut*type_double+Expr_Binaire.Egal,
		//extern_diff_double=debut*type_double+Expr_Binaire.Diff,
		extern_inf_double=debut*type_double+CIExpr_Binaire.Inf,
		extern_infs_double=debut*type_double+CIExpr_Binaire.InfS,
		extern_plusu_double=debut*type_double+CIExpr_Unaire.Plus,
		extern_moinsu_double=debut*type_double+CIExpr_Unaire.Moins;
	
	protected static final int 
		extern_and_bool=debut*type_bool+CIExpr_Binaire.And,
		extern_or_bool=debut*type_bool+CIExpr_Binaire.Or,
		extern_xor_bool=debut*type_bool+CIExpr_Binaire.Xor,
		extern_implies_bool=debut*type_bool+CIExpr_Binaire.Implies,
		extern_not_bool=debut*type_bool+CIExpr_Unaire.Not;

	protected static final int 
		extern_put_array=debut*type_array+put_,
		extern_resize_array=debut*type_array+resize_,
		extern_item_array=debut*type_array+item_,
		extern_build_array=debut*type_array+build_;

	protected static final int 
		extern_plus_string=debut*type_string+CIExpr_Binaire.Plus,
		extern_put_string=debut*type_string+put_+1,
		extern_resize_string=debut*type_string+resize_+1,
		extern_item_string=debut*type_string+item_+1,
		extern_build_string=debut*type_string+build_+1,
		extern_count_string=debut*type_string+count_+1;

	protected static final int 
		extern_sup_character=debut*type_char+CIExpr_Binaire.Sup,
		extern_sups_character=debut*type_char+CIExpr_Binaire.SupS,
		//extern_egal_double=debut*type_double+Expr_Binaire.Egal,
		//extern_diff_double=debut*type_double+Expr_Binaire.Diff,
		extern_inf_character=debut*type_char+CIExpr_Binaire.Inf,
		extern_infs_character=debut*type_char+CIExpr_Binaire.InfS;
	
	protected void instr_extern(CIListe_Instr instr,int type,CIRoutine routine)
	{__CLOVER_62_0.cloverRec.M[444]++;// TODO:prendre en compte le nombre de parametres
		// TODO:prendre en compte les operateurs semi-stricts et sp\u00e9ciaux (olds,$,etc...) 
		__CLOVER_62_0.cloverRec.S[4727]++;CIExpr_Var ev,ev2,ev3;
		__CLOVER_62_0.cloverRec.S[4728]++;CIExpr e;
		__CLOVER_62_0.cloverRec.S[4729]++;CIExpr_Scalaire es,es2,param[];
		__CLOVER_62_0.cloverRec.S[4730]++;String valp1,valp2,valr=null;
		__CLOVER_62_0.cloverRec.S[4731]++;CIType t1,t2;
		__CLOVER_62_0.cloverRec.S[4732]++;CIListe_Var local;
		__CLOVER_62_0.cloverRec.S[4733]++;CIDeclare_Var d,d2;
		__CLOVER_62_0.cloverRec.S[4734]++;CINom_Attribut nom;		
		assert((((instr!=null)) && (++__CLOVER_62_0.cloverRec.CT[1655]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1655]==0&false));
		assert((((type>0)) && (++__CLOVER_62_0.cloverRec.CT[1656]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1656]==0&false));
		assert((((type>=extern_plus_int)) && (++__CLOVER_62_0.cloverRec.CT[1657]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1657]==0&false));
		assert((((type<=extern_count_string)) && (++__CLOVER_62_0.cloverRec.CT[1658]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1658]==0&false));
		assert((((routine!=null)) && (++__CLOVER_62_0.cloverRec.CT[1659]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1659]==0&false));
		__CLOVER_62_0.cloverRec.S[4735]++;boolean __CLOVER_bool0=false;switch(type)
		{
		case extern_plus_int:if (!__CLOVER_bool0) {__CLOVER_62_0.cloverRec.S[4736]++;__CLOVER_bool0=true;}
		case extern_moins_int:if (!__CLOVER_bool0) {__CLOVER_62_0.cloverRec.S[4737]++;__CLOVER_bool0=true;}
		case extern_fois_int:if (!__CLOVER_bool0) {__CLOVER_62_0.cloverRec.S[4738]++;__CLOVER_bool0=true;}
		case extern_divr_int:if (!__CLOVER_bool0) {__CLOVER_62_0.cloverRec.S[4739]++;__CLOVER_bool0=true;}
		case extern_dive_int:if (!__CLOVER_bool0) {__CLOVER_62_0.cloverRec.S[4740]++;__CLOVER_bool0=true;}
		case extern_puiss_int:if (!__CLOVER_bool0) {__CLOVER_62_0.cloverRec.S[4741]++;__CLOVER_bool0=true;}
		case extern_mod_int:if (!__CLOVER_bool0) {__CLOVER_62_0.cloverRec.S[4742]++;__CLOVER_bool0=true;}
		case extern_sup_int:if (!__CLOVER_bool0) {__CLOVER_62_0.cloverRec.S[4743]++;__CLOVER_bool0=true;}
		case extern_sups_int:if (!__CLOVER_bool0) {__CLOVER_62_0.cloverRec.S[4744]++;__CLOVER_bool0=true;}
		case extern_inf_int:if (!__CLOVER_bool0) {__CLOVER_62_0.cloverRec.S[4745]++;__CLOVER_bool0=true;}
		case extern_infs_int:if (!__CLOVER_bool0) {__CLOVER_62_0.cloverRec.S[4746]++;__CLOVER_bool0=true;}
		case extern_plus_real:if (!__CLOVER_bool0) {__CLOVER_62_0.cloverRec.S[4747]++;__CLOVER_bool0=true;}
		case extern_moins_real:if (!__CLOVER_bool0) {__CLOVER_62_0.cloverRec.S[4748]++;__CLOVER_bool0=true;}
		case extern_fois_real:if (!__CLOVER_bool0) {__CLOVER_62_0.cloverRec.S[4749]++;__CLOVER_bool0=true;}
		case extern_divr_real:if (!__CLOVER_bool0) {__CLOVER_62_0.cloverRec.S[4750]++;__CLOVER_bool0=true;}
		//case extern_dive_real:
		case extern_puiss_real:if (!__CLOVER_bool0) {__CLOVER_62_0.cloverRec.S[4751]++;__CLOVER_bool0=true;}
		//case extern_mod_real:
		case extern_sup_real:if (!__CLOVER_bool0) {__CLOVER_62_0.cloverRec.S[4752]++;__CLOVER_bool0=true;}
		case extern_sups_real:if (!__CLOVER_bool0) {__CLOVER_62_0.cloverRec.S[4753]++;__CLOVER_bool0=true;}
		case extern_inf_real:if (!__CLOVER_bool0) {__CLOVER_62_0.cloverRec.S[4754]++;__CLOVER_bool0=true;}
		case extern_infs_real:if (!__CLOVER_bool0) {__CLOVER_62_0.cloverRec.S[4755]++;__CLOVER_bool0=true;}
		case extern_plus_double:if (!__CLOVER_bool0) {__CLOVER_62_0.cloverRec.S[4756]++;__CLOVER_bool0=true;}
		case extern_moins_double:if (!__CLOVER_bool0) {__CLOVER_62_0.cloverRec.S[4757]++;__CLOVER_bool0=true;}
		case extern_fois_double:if (!__CLOVER_bool0) {__CLOVER_62_0.cloverRec.S[4758]++;__CLOVER_bool0=true;}
		case extern_divr_double:if (!__CLOVER_bool0) {__CLOVER_62_0.cloverRec.S[4759]++;__CLOVER_bool0=true;}
		//case extern_dive_double:
		case extern_puiss_double:if (!__CLOVER_bool0) {__CLOVER_62_0.cloverRec.S[4760]++;__CLOVER_bool0=true;}
		//case extern_mod_double:
		case extern_sup_double:if (!__CLOVER_bool0) {__CLOVER_62_0.cloverRec.S[4761]++;__CLOVER_bool0=true;}
		case extern_sups_double:if (!__CLOVER_bool0) {__CLOVER_62_0.cloverRec.S[4762]++;__CLOVER_bool0=true;}
		case extern_inf_double:if (!__CLOVER_bool0) {__CLOVER_62_0.cloverRec.S[4763]++;__CLOVER_bool0=true;}
		case extern_infs_double:if (!__CLOVER_bool0) {__CLOVER_62_0.cloverRec.S[4764]++;__CLOVER_bool0=true;}
		case extern_and_bool:if (!__CLOVER_bool0) {__CLOVER_62_0.cloverRec.S[4765]++;__CLOVER_bool0=true;}
		case extern_or_bool:if (!__CLOVER_bool0) {__CLOVER_62_0.cloverRec.S[4766]++;__CLOVER_bool0=true;}
		case extern_xor_bool:if (!__CLOVER_bool0) {__CLOVER_62_0.cloverRec.S[4767]++;__CLOVER_bool0=true;}
		case extern_implies_bool:if (!__CLOVER_bool0) {__CLOVER_62_0.cloverRec.S[4768]++;__CLOVER_bool0=true;}
		case extern_sup_character:if (!__CLOVER_bool0) {__CLOVER_62_0.cloverRec.S[4769]++;__CLOVER_bool0=true;}
		case extern_sups_character:if (!__CLOVER_bool0) {__CLOVER_62_0.cloverRec.S[4770]++;__CLOVER_bool0=true;}
		case extern_inf_character:if (!__CLOVER_bool0) {__CLOVER_62_0.cloverRec.S[4771]++;__CLOVER_bool0=true;}
		case extern_infs_character:if (!__CLOVER_bool0) {__CLOVER_62_0.cloverRec.S[4772]++;__CLOVER_bool0=true;}
			assert((((routine.parametre!=null)) && (++__CLOVER_62_0.cloverRec.CT[1660]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1660]==0&false));
			assert((((routine.parametre.size()==1)) && (++__CLOVER_62_0.cloverRec.CT[1661]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1661]==0&false));
			//instr.ajoute(new Instruction_Label("ajout"));
			__CLOVER_62_0.cloverRec.S[4773]++;valp1=attr_interne(type/debut);
			// TODO: voir pour type ancr\u00e9
			__CLOVER_62_0.cloverRec.S[4774]++;valp2=attr_interne(((CITypeSimple)routine.parametre.elt(0).type).nom);
			__CLOVER_62_0.cloverRec.S[4775]++;valr=attr_interne(((CITypeSimple)routine.retour.type).nom);
			__CLOVER_62_0.cloverRec.S[4776]++;ev=new CIExpr_Var(valr,null);
			__CLOVER_62_0.cloverRec.S[4777]++;ev.set_src("Result");
			__CLOVER_62_0.cloverRec.S[4778]++;ev2=new CIExpr_Var(valp1,null);
			__CLOVER_62_0.cloverRec.S[4779]++;ev3=new CIExpr_Var(valp2,null);
			__CLOVER_62_0.cloverRec.S[4780]++;ev3.set_src(routine.parametre.elt(0).nom);
			__CLOVER_62_0.cloverRec.S[4781]++;e=new CIExpr_Binaire(type%debut,ev2,ev3,null);
			__CLOVER_62_0.cloverRec.S[4782]++;instr.ajoute(new CIInstruction_Affect(ev,e,null));
			__CLOVER_62_0.cloverRec.S[4783]++;break;
		case extern_plusu_int:if (!__CLOVER_bool0) {__CLOVER_62_0.cloverRec.S[4784]++;__CLOVER_bool0=true;}
		case extern_moinsu_int:if (!__CLOVER_bool0) {__CLOVER_62_0.cloverRec.S[4785]++;__CLOVER_bool0=true;}
		case extern_plusu_real:if (!__CLOVER_bool0) {__CLOVER_62_0.cloverRec.S[4786]++;__CLOVER_bool0=true;}
		case extern_moinsu_real:if (!__CLOVER_bool0) {__CLOVER_62_0.cloverRec.S[4787]++;__CLOVER_bool0=true;}
		case extern_plusu_double:if (!__CLOVER_bool0) {__CLOVER_62_0.cloverRec.S[4788]++;__CLOVER_bool0=true;}
		case extern_moinsu_double:if (!__CLOVER_bool0) {__CLOVER_62_0.cloverRec.S[4789]++;__CLOVER_bool0=true;}
		case extern_not_bool:if (!__CLOVER_bool0) {__CLOVER_62_0.cloverRec.S[4790]++;__CLOVER_bool0=true;}
			assert((((routine.parametre==null||routine.parametre.size()==0)) && (++__CLOVER_62_0.cloverRec.CT[1662]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1662]==0&false));
			__CLOVER_62_0.cloverRec.S[4791]++;valp1=attr_interne(type/debut);
			// TODO: voir pour type ancr\u00e9
			__CLOVER_62_0.cloverRec.S[4792]++;valr=attr_interne(((CITypeSimple)routine.retour.type).nom);
			__CLOVER_62_0.cloverRec.S[4793]++;ev=new CIExpr_Var(valr,null);
			__CLOVER_62_0.cloverRec.S[4794]++;ev.set_src("Result");
			__CLOVER_62_0.cloverRec.S[4795]++;ev2=new CIExpr_Var(valp1,null);
			__CLOVER_62_0.cloverRec.S[4796]++;e=new CIExpr_Unaire(type%debut,ev2,null);
			__CLOVER_62_0.cloverRec.S[4797]++;instr.ajoute(new CIInstruction_Affect(ev,e,null));
			__CLOVER_62_0.cloverRec.S[4798]++;break;
		case extern_put_array:if (!__CLOVER_bool0) {__CLOVER_62_0.cloverRec.S[4799]++;__CLOVER_bool0=true;}
			assert((((routine.parametre!=null||routine.parametre.size()==2)) && (++__CLOVER_62_0.cloverRec.CT[1663]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1663]==0&false));
			// $tab[i]:=v
			__CLOVER_62_0.cloverRec.S[4800]++;ev2=new CIExpr_Var("i",null);
			__CLOVER_62_0.cloverRec.S[4801]++;ev3=new CIExpr_Var("v",null);
			__CLOVER_62_0.cloverRec.S[4802]++;ev=new CIExpr_Var("$tab",ev2,null);
			__CLOVER_62_0.cloverRec.S[4803]++;instr.ajoute(new CIInstruction_Affect(ev,ev3,null));
			__CLOVER_62_0.cloverRec.S[4804]++;break;
		case extern_item_array:if (!__CLOVER_bool0) {__CLOVER_62_0.cloverRec.S[4805]++;__CLOVER_bool0=true;}
			assert((((routine.parametre!=null||routine.parametre.size()==1)) && (++__CLOVER_62_0.cloverRec.CT[1664]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1664]==0&false));
			// Result:=$tab[i]
			__CLOVER_62_0.cloverRec.S[4806]++;ev2=new CIExpr_Var("i",null);
			__CLOVER_62_0.cloverRec.S[4807]++;ev=new CIExpr_Var("$tab",ev2,null);
			__CLOVER_62_0.cloverRec.S[4808]++;ev3=new CIExpr_Var("Result",null);
			__CLOVER_62_0.cloverRec.S[4809]++;instr.ajoute(new CIInstruction_Affect(ev3,ev,null));
			__CLOVER_62_0.cloverRec.S[4810]++;break;
		case extern_build_array:if (!__CLOVER_bool0) {__CLOVER_62_0.cloverRec.S[4811]++;__CLOVER_bool0=true;}
			assert((((routine.parametre!=null||routine.parametre.size()==1)) && (++__CLOVER_62_0.cloverRec.CT[1665]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1665]==0&false));
			// $tab:=new E[i]
			__CLOVER_62_0.cloverRec.S[4812]++;ev2=new CIExpr_Var("i",null);
			__CLOVER_62_0.cloverRec.S[4813]++;t1=new CITypeSimple(false,"E",null,null);
			__CLOVER_62_0.cloverRec.S[4814]++;e=new CIExpr_Creation(t1,ev2,null);
			__CLOVER_62_0.cloverRec.S[4815]++;ev=new CIExpr_Var("$tab",null);
			__CLOVER_62_0.cloverRec.S[4816]++;instr.ajoute(new CIInstruction_Affect(ev,e,null));
			__CLOVER_62_0.cloverRec.S[4817]++;break;
		case extern_resize_array:if (!__CLOVER_bool0) {__CLOVER_62_0.cloverRec.S[4818]++;__CLOVER_bool0=true;}
			assert((((routine.parametre!=null||routine.parametre.size()==1)) && (++__CLOVER_62_0.cloverRec.CT[1666]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1666]==0&false));
			// TODO: a faire
			// $tab_local:=new E[i]
			// copie de $tab vers $tab_local
			// $tab=$tab_local
			{
				__CLOVER_62_0.cloverRec.S[4819]++;CIType t3[]={new CITypeSimple(false,"E",null,null)};
				__CLOVER_62_0.cloverRec.S[4820]++;local=new CIListe_Var();
				__CLOVER_62_0.cloverRec.S[4821]++;routine.local=local;
				__CLOVER_62_0.cloverRec.S[4822]++;t2=new CITypeSimple(false,"$array",t3,null);
				__CLOVER_62_0.cloverRec.S[4823]++;d=new CIDeclare_Var("$tab_local",t2,null);
				__CLOVER_62_0.cloverRec.S[4824]++;local.ajoute(d);
				__CLOVER_62_0.cloverRec.S[4825]++;t2=new CITypeSimple(false,"$integer",null,null);
				__CLOVER_62_0.cloverRec.S[4826]++;d=new CIDeclare_Var("$i",t2,null);
				__CLOVER_62_0.cloverRec.S[4827]++;local.ajoute(d);
				__CLOVER_62_0.cloverRec.S[4828]++;ev2=new CIExpr_Var("i",null);
				__CLOVER_62_0.cloverRec.S[4829]++;t1=new CITypeSimple(false,"E",null,null);
				__CLOVER_62_0.cloverRec.S[4830]++;e=new CIExpr_Creation(t1,ev2,null);
				__CLOVER_62_0.cloverRec.S[4831]++;ev=new CIExpr_Var("$tab_local",null);
				__CLOVER_62_0.cloverRec.S[4832]++;instr.ajoute(new CIInstruction_Affect(ev,e,null));
				__CLOVER_62_0.cloverRec.S[4833]++;ev=new CIExpr_Var("$i",null);
				__CLOVER_62_0.cloverRec.S[4834]++;e=new CIExpr_Entier(0,null);
				__CLOVER_62_0.cloverRec.S[4835]++;instr.ajoute(new CIInstruction_Affect(ev,e,null));
				
				//Instr_Loop instr=(Instr_Loop)inst;
				__CLOVER_62_0.cloverRec.S[4836]++;CIInstruction instruction;
				__CLOVER_62_0.cloverRec.S[4837]++;String l1,l2,l3;
				__CLOVER_62_0.cloverRec.S[4838]++;l1=temp("test");
				__CLOVER_62_0.cloverRec.S[4839]++;l2=temp("fin");
				__CLOVER_62_0.cloverRec.S[4840]++;l3=temp("debut_boucle");
				__CLOVER_62_0.cloverRec.S[4841]++;instruction=new CIInstruction_Goto(l1,null);
				__CLOVER_62_0.cloverRec.S[4842]++;instr.ajoute(instruction);
				__CLOVER_62_0.cloverRec.S[4843]++;instruction=new CIInstruction_Label(l3,null);
				__CLOVER_62_0.cloverRec.S[4844]++;instr.ajoute(instruction);
				
				//ajoute_instr(v,cl,r,instr.loop);
				__CLOVER_62_0.cloverRec.S[4845]++;ev2=new CIExpr_Var("$i",null);
				__CLOVER_62_0.cloverRec.S[4846]++;ev3=new CIExpr_Var("$tab",ev2,null);
				__CLOVER_62_0.cloverRec.S[4847]++;ev2=new CIExpr_Var("$i",null);
				__CLOVER_62_0.cloverRec.S[4848]++;ev=new CIExpr_Var("$tab_local",ev2,null);
				__CLOVER_62_0.cloverRec.S[4849]++;instr.ajoute(new CIInstruction_Affect(ev,ev3,null));
				
				__CLOVER_62_0.cloverRec.S[4850]++;ev2=new CIExpr_Var("$i",null);
				__CLOVER_62_0.cloverRec.S[4851]++;es2=new CIExpr_Entier(1,null);
				__CLOVER_62_0.cloverRec.S[4852]++;e=new CIExpr_Binaire(CIExpr_Binaire.Plus,ev2,es2,null);
				__CLOVER_62_0.cloverRec.S[4853]++;ev=new CIExpr_Var("$i",null);
				__CLOVER_62_0.cloverRec.S[4854]++;instr.ajoute(new CIInstruction_Affect(ev,e,null));
				
				__CLOVER_62_0.cloverRec.S[4855]++;instruction=new CIInstruction_Label(l1,null);
				__CLOVER_62_0.cloverRec.S[4856]++;instr.ajoute(instruction);
				
				__CLOVER_62_0.cloverRec.S[4857]++;ev2=new CIExpr_Var("$i",null);
				__CLOVER_62_0.cloverRec.S[4858]++;ev3=new CIExpr_Var("i",null);
				__CLOVER_62_0.cloverRec.S[4859]++;e=new CIExpr_Binaire(CIExpr_Binaire.InfS,ev2,ev3,null);
				__CLOVER_62_0.cloverRec.S[4860]++;instruction=new CIInstruction_Si_Non(e,l2,null);
				__CLOVER_62_0.cloverRec.S[4861]++;instr.ajoute(instruction);
				
				__CLOVER_62_0.cloverRec.S[4862]++;ev2=new CIExpr_Var("$i",null);
				__CLOVER_62_0.cloverRec.S[4863]++;ev3=new CIExpr_Var("count",null);
				__CLOVER_62_0.cloverRec.S[4864]++;e=new CIExpr_Binaire(CIExpr_Binaire.InfS,ev2,ev3,null);
				__CLOVER_62_0.cloverRec.S[4865]++;instruction=new CIInstruction_Si(e,l3,null);
				__CLOVER_62_0.cloverRec.S[4866]++;instr.ajoute(instruction);
				
				__CLOVER_62_0.cloverRec.S[4867]++;instruction=new CIInstruction_Label(l2,null);
				__CLOVER_62_0.cloverRec.S[4868]++;instr.ajoute(instruction);
				
				__CLOVER_62_0.cloverRec.S[4869]++;ev2=new CIExpr_Var("$tab_local",null);
				__CLOVER_62_0.cloverRec.S[4870]++;ev=new CIExpr_Var("$tab",null);
				__CLOVER_62_0.cloverRec.S[4871]++;instr.ajoute(new CIInstruction_Affect(ev,ev2,null));
			}
			__CLOVER_62_0.cloverRec.S[4872]++;break;
		case extern_plus_string:if (!__CLOVER_bool0) {__CLOVER_62_0.cloverRec.S[4873]++;__CLOVER_bool0=true;}
			assert((((routine.parametre!=null||routine.parametre.size()==1)) && (++__CLOVER_62_0.cloverRec.CT[1667]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1667]==0&false));
			// Result:=$add_string($val_string,other.$val_string)
			__CLOVER_62_0.cloverRec.S[4874]++;nom=new CINom_Attribut("$add_string",null);
			__CLOVER_62_0.cloverRec.S[4875]++;param=new CIExpr_Scalaire[2];
			__CLOVER_62_0.cloverRec.S[4876]++;param[0]=new CIExpr_Var("$val_string",null);
			__CLOVER_62_0.cloverRec.S[4877]++;ev2=new CIExpr_Var("$val_string",null);
			__CLOVER_62_0.cloverRec.S[4878]++;ev2.set_src("other");
			__CLOVER_62_0.cloverRec.S[4879]++;param[1]=ev2;
			__CLOVER_62_0.cloverRec.S[4880]++;e=new CIExpr_Appel(null,nom,param,null);
			__CLOVER_62_0.cloverRec.S[4881]++;ev=new CIExpr_Var("Result",null);
			__CLOVER_62_0.cloverRec.S[4882]++;instr.ajoute(new CIInstruction_Affect(ev,e,null));
			__CLOVER_62_0.cloverRec.S[4883]++;break;
		case extern_put_string:if (!__CLOVER_bool0) {__CLOVER_62_0.cloverRec.S[4884]++;__CLOVER_bool0=true;}
			assert((((routine.parametre!=null||routine.parametre.size()==2)) && (++__CLOVER_62_0.cloverRec.CT[1668]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1668]==0&false));
			// $put_string($val_string,c,i)
			__CLOVER_62_0.cloverRec.S[4885]++;nom=new CINom_Attribut("$put_string",null);
			__CLOVER_62_0.cloverRec.S[4886]++;param=new CIExpr_Scalaire[3];
			__CLOVER_62_0.cloverRec.S[4887]++;param[0]=new CIExpr_Var("$val_string",null);
			__CLOVER_62_0.cloverRec.S[4888]++;param[1]=new CIExpr_Var("c",null);
			__CLOVER_62_0.cloverRec.S[4889]++;param[2]=new CIExpr_Var("i",null);
			__CLOVER_62_0.cloverRec.S[4890]++;instr.ajoute(new CIInstruction_Appel(null,nom,param,null));
			__CLOVER_62_0.cloverRec.S[4891]++;break;
		case extern_item_string:if (!__CLOVER_bool0) {__CLOVER_62_0.cloverRec.S[4892]++;__CLOVER_bool0=true;}
			assert((((routine.parametre!=null||routine.parametre.size()==1)) && (++__CLOVER_62_0.cloverRec.CT[1669]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1669]==0&false));
			// Result:=$item_string($val_string,i)
			__CLOVER_62_0.cloverRec.S[4893]++;nom=new CINom_Attribut("$item_string",null);
			__CLOVER_62_0.cloverRec.S[4894]++;param=new CIExpr_Scalaire[1];
			__CLOVER_62_0.cloverRec.S[4895]++;param[0]=new CIExpr_Var("i",null);
			__CLOVER_62_0.cloverRec.S[4896]++;e=new CIExpr_Appel(null,nom,param,null);
			__CLOVER_62_0.cloverRec.S[4897]++;ev=new CIExpr_Var("Result",null);
			__CLOVER_62_0.cloverRec.S[4898]++;instr.ajoute(new CIInstruction_Affect(ev,e,null));
			__CLOVER_62_0.cloverRec.S[4899]++;break;
		case extern_resize_string:if (!__CLOVER_bool0) {__CLOVER_62_0.cloverRec.S[4900]++;__CLOVER_bool0=true;}
			assert((((routine.parametre!=null||routine.parametre.size()==1)) && (++__CLOVER_62_0.cloverRec.CT[1670]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1670]==0&false));
			// $val_string:=$resize_string($val_string,i)
			__CLOVER_62_0.cloverRec.S[4901]++;nom=new CINom_Attribut("$resize_string",null);
			__CLOVER_62_0.cloverRec.S[4902]++;param=new CIExpr_Scalaire[2];
			__CLOVER_62_0.cloverRec.S[4903]++;param[0]=new CIExpr_Var("$val_string",null);
			__CLOVER_62_0.cloverRec.S[4904]++;param[1]=new CIExpr_Var("i",null);
			__CLOVER_62_0.cloverRec.S[4905]++;ev=new CIExpr_Var("$val_string",null);
			__CLOVER_62_0.cloverRec.S[4906]++;e=new CIExpr_Appel(null,nom,param,null);
			__CLOVER_62_0.cloverRec.S[4907]++;instr.ajoute(new CIInstruction_Affect(ev,e,null));
			__CLOVER_62_0.cloverRec.S[4908]++;break;
		case extern_build_string:if (!__CLOVER_bool0) {__CLOVER_62_0.cloverRec.S[4909]++;__CLOVER_bool0=true;}
			assert((((routine.parametre!=null||routine.parametre.size()==1)) && (++__CLOVER_62_0.cloverRec.CT[1671]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1671]==0&false));
			// $val_string:=$build_string(i)
			__CLOVER_62_0.cloverRec.S[4910]++;nom=new CINom_Attribut("$build_string",null);
			__CLOVER_62_0.cloverRec.S[4911]++;param=new CIExpr_Scalaire[1];
			__CLOVER_62_0.cloverRec.S[4912]++;param[0]=new CIExpr_Var("$i",null);
			__CLOVER_62_0.cloverRec.S[4913]++;ev=new CIExpr_Var("$val_string",null);
			__CLOVER_62_0.cloverRec.S[4914]++;e=new CIExpr_Appel(null,nom,param,null);
			__CLOVER_62_0.cloverRec.S[4915]++;instr.ajoute(new CIInstruction_Affect(ev,e,null));
			__CLOVER_62_0.cloverRec.S[4916]++;break;
		case extern_count_string:if (!__CLOVER_bool0) {__CLOVER_62_0.cloverRec.S[4917]++;__CLOVER_bool0=true;}
			assert((((routine.parametre==null||routine.parametre.size()==0)) && (++__CLOVER_62_0.cloverRec.CT[1672]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1672]==0&false));
			// Result:=$count_string($val_string)
			__CLOVER_62_0.cloverRec.S[4918]++;nom=new CINom_Attribut("$count_string",null);
			__CLOVER_62_0.cloverRec.S[4919]++;param=new CIExpr_Scalaire[1];
			__CLOVER_62_0.cloverRec.S[4920]++;param[0]=new CIExpr_Var("$val_string",null);
			__CLOVER_62_0.cloverRec.S[4921]++;e=new CIExpr_Appel(null,nom,param,null);
			__CLOVER_62_0.cloverRec.S[4922]++;ev=new CIExpr_Var("Result",null);
			__CLOVER_62_0.cloverRec.S[4923]++;instr.ajoute(new CIInstruction_Affect(ev,e,null));
			__CLOVER_62_0.cloverRec.S[4924]++;break;
		default:if (!__CLOVER_bool0) {__CLOVER_62_0.cloverRec.S[4925]++;__CLOVER_bool0=true;}
			assert((((false)) && (++__CLOVER_62_0.cloverRec.CT[1673]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1673]==0&false)):"type="+type;
		}
	}
	
	protected String attr_interne(String classe)
	{__CLOVER_62_0.cloverRec.M[445]++;
		__CLOVER_62_0.cloverRec.S[4926]++;String valt=null;
		__CLOVER_62_0.cloverRec.S[4927]++;if((((classe.equalsIgnoreCase("integer")) && (++__CLOVER_62_0.cloverRec.CT[1674]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1674]==0&false)))
		{{
			__CLOVER_62_0.cloverRec.S[4928]++;valt="$val_int";
		}
		}else {__CLOVER_62_0.cloverRec.S[4929]++;if((((classe.equalsIgnoreCase("boolean")) && (++__CLOVER_62_0.cloverRec.CT[1675]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1675]==0&false)))
		{{
			__CLOVER_62_0.cloverRec.S[4930]++;valt="$val_bool";
		}
		}else {__CLOVER_62_0.cloverRec.S[4931]++;if((((classe.equalsIgnoreCase("real")) && (++__CLOVER_62_0.cloverRec.CT[1676]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1676]==0&false)))
		{{
			__CLOVER_62_0.cloverRec.S[4932]++;valt="$val_real";
		}
		}else {__CLOVER_62_0.cloverRec.S[4933]++;if((((classe.equalsIgnoreCase("double")) && (++__CLOVER_62_0.cloverRec.CT[1677]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1677]==0&false)))
		{{
			__CLOVER_62_0.cloverRec.S[4934]++;valt="$val_double";
		}
		}else {__CLOVER_62_0.cloverRec.S[4935]++;if((((classe.equalsIgnoreCase("character")) && (++__CLOVER_62_0.cloverRec.CT[1678]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1678]==0&false)))
		{{
			__CLOVER_62_0.cloverRec.S[4936]++;valt="$val_char";
		}
		}}}}}assert((((valt!=null)) && (++__CLOVER_62_0.cloverRec.CT[1679]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1679]==0&false));
		__CLOVER_62_0.cloverRec.S[4937]++;return valt;
	}
	
	protected String attr_interne(int no_classe_kernel)
	{__CLOVER_62_0.cloverRec.M[446]++;
		__CLOVER_62_0.cloverRec.S[4938]++;String valt=null;
		__CLOVER_62_0.cloverRec.S[4939]++;boolean __CLOVER_bool1=false;switch(no_classe_kernel)
		{
			case type_int:if (!__CLOVER_bool1) {__CLOVER_62_0.cloverRec.S[4940]++;__CLOVER_bool1=true;}
				__CLOVER_62_0.cloverRec.S[4941]++;valt="$val_int";
				__CLOVER_62_0.cloverRec.S[4942]++;break;
			case type_real:if (!__CLOVER_bool1) {__CLOVER_62_0.cloverRec.S[4943]++;__CLOVER_bool1=true;}
				__CLOVER_62_0.cloverRec.S[4944]++;valt="$val_real";
				__CLOVER_62_0.cloverRec.S[4945]++;break;
			case type_double:if (!__CLOVER_bool1) {__CLOVER_62_0.cloverRec.S[4946]++;__CLOVER_bool1=true;}
				__CLOVER_62_0.cloverRec.S[4947]++;valt="$val_double";
				__CLOVER_62_0.cloverRec.S[4948]++;break;
			case type_bool:if (!__CLOVER_bool1) {__CLOVER_62_0.cloverRec.S[4949]++;__CLOVER_bool1=true;}
				__CLOVER_62_0.cloverRec.S[4950]++;valt="$val_bool";
				__CLOVER_62_0.cloverRec.S[4951]++;break;
			case type_char:if (!__CLOVER_bool1) {__CLOVER_62_0.cloverRec.S[4952]++;__CLOVER_bool1=true;}
				__CLOVER_62_0.cloverRec.S[4953]++;valt="$val_char";
				__CLOVER_62_0.cloverRec.S[4954]++;break;
			default:if (!__CLOVER_bool1) {__CLOVER_62_0.cloverRec.S[4955]++;__CLOVER_bool1=true;}
				assert((((false)) && (++__CLOVER_62_0.cloverRec.CT[1680]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1680]==0&false));
				__CLOVER_62_0.cloverRec.S[4956]++;break;
		}
		__CLOVER_62_0.cloverRec.S[4957]++;return valt;
	}
	
	protected CIExpr valeur_defaut(CIType type)
	{__CLOVER_62_0.cloverRec.M[447]++;
		__CLOVER_62_0.cloverRec.S[4958]++;CIExpr val=null;
		assert((((type!=null)) && (++__CLOVER_62_0.cloverRec.CT[1681]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1681]==0&false));
		__CLOVER_62_0.cloverRec.S[4959]++;if((((type instanceof CITypeSimple) && (++__CLOVER_62_0.cloverRec.CT[1682]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1682]==0&false)))
		{{
			__CLOVER_62_0.cloverRec.S[4960]++;CITypeSimple type2=(CITypeSimple)type;
			__CLOVER_62_0.cloverRec.S[4961]++;if((((type2.nom.equalsIgnoreCase("INTEGER")) && (++__CLOVER_62_0.cloverRec.CT[1683]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1683]==0&false)))
				{__CLOVER_62_0.cloverRec.S[4962]++;val=new CIExpr_Entier(0,null);
			}else {__CLOVER_62_0.cloverRec.S[4963]++;if((((type2.nom.equalsIgnoreCase("BOOLEAN")) && (++__CLOVER_62_0.cloverRec.CT[1684]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1684]==0&false)))
				{__CLOVER_62_0.cloverRec.S[4964]++;val=new CIExpr_Bool(false,null);
			}else {__CLOVER_62_0.cloverRec.S[4965]++;if((((type2.nom.equalsIgnoreCase("CHARACTER")) && (++__CLOVER_62_0.cloverRec.CT[1685]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1685]==0&false)))
				{__CLOVER_62_0.cloverRec.S[4966]++;val=new CIExpr_Char('\0',null);
			}else {__CLOVER_62_0.cloverRec.S[4967]++;if((((type2.nom.equalsIgnoreCase("REAL")) && (++__CLOVER_62_0.cloverRec.CT[1686]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1686]==0&false)))
				{__CLOVER_62_0.cloverRec.S[4968]++;val=new CIExpr_Real(0.0,null);
			}else {__CLOVER_62_0.cloverRec.S[4969]++;if((((type2.nom.equalsIgnoreCase("DOUBLE")) && (++__CLOVER_62_0.cloverRec.CT[1687]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1687]==0&false)))
				{__CLOVER_62_0.cloverRec.S[4970]++;val=new CIExpr_Real(0.0,null);
			}else
				{__CLOVER_62_0.cloverRec.S[4971]++;val=new CIExpr_Void(null);
		}}}}}}
		}else
		{{// TODO: a voir pour type ancr\u00e9
			assert((((false)) && (++__CLOVER_62_0.cloverRec.CT[1688]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1688]==0&false));
		}
		}assert((((val!=null)) && (++__CLOVER_62_0.cloverRec.CT[1689]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1689]==0&false));
		__CLOVER_62_0.cloverRec.S[4972]++;return val;
	}
	
	protected String nom_once_traite(CIClasse cl,NomFeature n)
	{__CLOVER_62_0.cloverRec.M[448]++;
		assert((((cl!=null)) && (++__CLOVER_62_0.cloverRec.CT[1690]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1690]==0&false));
		assert((((n!=null)) && (++__CLOVER_62_0.cloverRec.CT[1691]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1691]==0&false));
		__CLOVER_62_0.cloverRec.S[4973]++;return "$once_traite_"+cl.nom+"$"+n.nom;
	}

	protected String nom_once_result(CIClasse cl,NomFeature n)
	{__CLOVER_62_0.cloverRec.M[449]++;
		assert((((cl!=null)) && (++__CLOVER_62_0.cloverRec.CT[1692]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1692]==0&false));
		assert((((n!=null)) && (++__CLOVER_62_0.cloverRec.CT[1693]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1693]==0&false));
		__CLOVER_62_0.cloverRec.S[4974]++;return "$once_result_"+cl.nom+"$"+n.nom;
	}
	
	protected boolean contient_nom_feature(String nom,
											boolean infix,
											boolean prefix,
											NomFeature liste_nom[])
	{__CLOVER_62_0.cloverRec.M[450]++;
		assert((((nom!=null)) && (++__CLOVER_62_0.cloverRec.CT[1694]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1694]==0&false));
		assert((((liste_nom!=null)) && (++__CLOVER_62_0.cloverRec.CT[1695]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1695]==0&false));
		assert((((liste_nom.length>0)) && (++__CLOVER_62_0.cloverRec.CT[1696]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1696]==0&false));
		__CLOVER_62_0.cloverRec.S[4975]++;for(int k=0;(((k<liste_nom.length) && (++__CLOVER_62_0.cloverRec.CT[1697]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1697]==0&false));k++)
		{{
			__CLOVER_62_0.cloverRec.S[4976]++;NomFeature n=liste_nom[k];
			__CLOVER_62_0.cloverRec.S[4977]++;if((((infix&&n.infix&&nom.equalsIgnoreCase(n.nom2.chaine_unique())) && (++__CLOVER_62_0.cloverRec.CT[1698]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1698]==0&false)))
				{__CLOVER_62_0.cloverRec.S[4978]++;return true;
			}else {__CLOVER_62_0.cloverRec.S[4979]++;if((((prefix&&n.prefix&&nom.equalsIgnoreCase(n.nom2.chaine_unique())) && (++__CLOVER_62_0.cloverRec.CT[1699]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1699]==0&false)))
				{__CLOVER_62_0.cloverRec.S[4980]++;return true;
			}else {__CLOVER_62_0.cloverRec.S[4981]++;if((((!prefix&&!n.prefix&&!infix&&!n.infix&&
					nom.equalsIgnoreCase(n.nom)) && (++__CLOVER_62_0.cloverRec.CT[1700]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1700]==0&false)))
				{__CLOVER_62_0.cloverRec.S[4982]++;return true;
		}}}}
		}__CLOVER_62_0.cloverRec.S[4983]++;return false;
	}

	protected CIInstruction[] convertie_instr(CIClasse cl,
											CIRoutine r,Instr liste[])
	{__CLOVER_62_0.cloverRec.M[451]++;
		__CLOVER_62_0.cloverRec.S[4984]++;CIInstruction linstr[]=null,instruction,linstr2[];
		__CLOVER_62_0.cloverRec.S[4985]++;Vector v=new Vector();
		__CLOVER_62_0.cloverRec.S[4986]++;Instr inst;
		__CLOVER_62_0.cloverRec.S[4987]++;int i,j;
		__CLOVER_62_0.cloverRec.S[4988]++;CIResult_Expr res,r1,r2,r3;
		assert((((cl!=null)) && (++__CLOVER_62_0.cloverRec.CT[1701]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1701]==0&false));
		assert((((r!=null)) && (++__CLOVER_62_0.cloverRec.CT[1702]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1702]==0&false));
		assert((((liste!=null)) && (++__CLOVER_62_0.cloverRec.CT[1703]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1703]==0&false));
		__CLOVER_62_0.cloverRec.S[4989]++;for(i=0;(((i<liste.length) && (++__CLOVER_62_0.cloverRec.CT[1704]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1704]==0&false));i++)
		{{
			__CLOVER_62_0.cloverRec.S[4990]++;inst=liste[i];
			__CLOVER_62_0.cloverRec.S[4991]++;if((((inst instanceof Instr_Affect) && (++__CLOVER_62_0.cloverRec.CT[1705]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1705]==0&false)))
			{{
				__CLOVER_62_0.cloverRec.S[4992]++;Instr_Affect instr=(Instr_Affect)inst;
				__CLOVER_62_0.cloverRec.S[4993]++;CIExpr_Var nom;
				__CLOVER_62_0.cloverRec.S[4994]++;res=convertie_expr(r.local,instr.expr);
				__CLOVER_62_0.cloverRec.S[4995]++;if((((res!=null) && (++__CLOVER_62_0.cloverRec.CT[1706]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1706]==0&false)))
				{{
				__CLOVER_62_0.cloverRec.S[4996]++;if((((res.a_instr()) && (++__CLOVER_62_0.cloverRec.CT[1707]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1707]==0&false)))
					{__CLOVER_62_0.cloverRec.S[4997]++;v.addAll(res.instr);
				}__CLOVER_62_0.cloverRec.S[4998]++;nom=new CIExpr_Var(instr.nom,convertie_source(instr.tid));
				__CLOVER_62_0.cloverRec.S[4999]++;v.addElement(new CIInstruction_Affect(nom,res.expr,
						convertie_source(instr.debut())));
				}
			}}
			}else {__CLOVER_62_0.cloverRec.S[5000]++;if((((inst instanceof Instr_If) && (++__CLOVER_62_0.cloverRec.CT[1708]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1708]==0&false)))
			{{
				__CLOVER_62_0.cloverRec.S[5001]++;Instr_If instr=(Instr_If)inst;
				__CLOVER_62_0.cloverRec.S[5002]++;Instr ins,lins[];
				__CLOVER_62_0.cloverRec.S[5003]++;String nom;
				__CLOVER_62_0.cloverRec.S[5004]++;CIDeclare_Var v1,v2;
				__CLOVER_62_0.cloverRec.S[5005]++;String l1,l2,l3;
				__CLOVER_62_0.cloverRec.S[5006]++;CIExpr e;
				__CLOVER_62_0.cloverRec.S[5007]++;CIExpr_Scalaire es;
				__CLOVER_62_0.cloverRec.S[5008]++;Instr_ElseIf ei;
				__CLOVER_62_0.cloverRec.S[5009]++;Instr_Else els;
				__CLOVER_62_0.cloverRec.S[5010]++;l1=temp("label");
				__CLOVER_62_0.cloverRec.S[5011]++;l2=temp("fin");
				__CLOVER_62_0.cloverRec.S[5012]++;ajoute_if(r,instr.expr,instr.liste_instr,l1,l2,v);
				__CLOVER_62_0.cloverRec.S[5013]++;instruction=new CIInstruction_Label(l1,null);
				__CLOVER_62_0.cloverRec.S[5014]++;v.addElement(instruction);
				__CLOVER_62_0.cloverRec.S[5015]++;ins=instr.getSuivant();
				__CLOVER_62_0.cloverRec.S[5016]++;while((((ins!=null&&ins instanceof Instr_ElseIf) && (++__CLOVER_62_0.cloverRec.CT[1709]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1709]==0&false)))
				{{
					__CLOVER_62_0.cloverRec.S[5017]++;ei=(Instr_ElseIf)ins;
					__CLOVER_62_0.cloverRec.S[5018]++;l1=temp("label");
					__CLOVER_62_0.cloverRec.S[5019]++;ajoute_if(r,ei.expr,ei.liste_instr,l1,l2,v);
					__CLOVER_62_0.cloverRec.S[5020]++;instruction=new CIInstruction_Label(l1,null);
					__CLOVER_62_0.cloverRec.S[5021]++;v.addElement(instruction);
					__CLOVER_62_0.cloverRec.S[5022]++;ins=ei.getSuivant();
				}
				}__CLOVER_62_0.cloverRec.S[5023]++;if((((ins!=null) && (++__CLOVER_62_0.cloverRec.CT[1710]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1710]==0&false)))
				{{// else
					assert((((ins instanceof Instr_Else)) && (++__CLOVER_62_0.cloverRec.CT[1711]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1711]==0&false));
					__CLOVER_62_0.cloverRec.S[5024]++;els=(Instr_Else)ins;
					__CLOVER_62_0.cloverRec.S[5025]++;ajoute_instr(v,r.classe,r,els.liste_instr);
				}
				//ajoute_instr(v,cl,t,instr.liste_instr);
				// fin
				}__CLOVER_62_0.cloverRec.S[5026]++;instruction=new CIInstruction_Label(l2,null);
				__CLOVER_62_0.cloverRec.S[5027]++;v.addElement(instruction);
				//}
			}
			}else {__CLOVER_62_0.cloverRec.S[5028]++;if((((inst instanceof Instr_Loop) && (++__CLOVER_62_0.cloverRec.CT[1712]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1712]==0&false)))
			{{
				__CLOVER_62_0.cloverRec.S[5029]++;Instr_Loop instr=(Instr_Loop)inst;
				__CLOVER_62_0.cloverRec.S[5030]++;Instr ins,lins[];
				__CLOVER_62_0.cloverRec.S[5031]++;String l1,l2,l3;
				__CLOVER_62_0.cloverRec.S[5032]++;ajoute_instr(v,cl,r,instr.from);
				__CLOVER_62_0.cloverRec.S[5033]++;l1=temp("test");
				__CLOVER_62_0.cloverRec.S[5034]++;l2=temp("fin");
				__CLOVER_62_0.cloverRec.S[5035]++;l3=temp("debut_boucle");
				__CLOVER_62_0.cloverRec.S[5036]++;instruction=new CIInstruction_Goto(l1,null);
				__CLOVER_62_0.cloverRec.S[5037]++;v.addElement(instruction);
				__CLOVER_62_0.cloverRec.S[5038]++;instruction=new CIInstruction_Label(l3,
						convertie_source(instr.tloop));
				__CLOVER_62_0.cloverRec.S[5039]++;v.addElement(instruction);
				__CLOVER_62_0.cloverRec.S[5040]++;ajoute_instr(v,cl,r,instr.loop);
				__CLOVER_62_0.cloverRec.S[5041]++;instruction=new CIInstruction_Label(l1,
						convertie_source(instr.tuntil));
				__CLOVER_62_0.cloverRec.S[5042]++;v.addElement(instruction);
				__CLOVER_62_0.cloverRec.S[5043]++;ajoute_test(r.local,l3,v,instr.expr,false);
				__CLOVER_62_0.cloverRec.S[5044]++;instruction=new CIInstruction_Label(l2,
						convertie_source(instr.tend));
				__CLOVER_62_0.cloverRec.S[5045]++;v.addElement(instruction);
			}
			}else {__CLOVER_62_0.cloverRec.S[5046]++;if((((inst instanceof Instr_Appel) && (++__CLOVER_62_0.cloverRec.CT[1713]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1713]==0&false)))
			{{// TODO : a terminer
				__CLOVER_62_0.cloverRec.S[5047]++;Instr_Appel instr=(Instr_Appel)inst,ins;
				__CLOVER_62_0.cloverRec.S[5048]++;Instr ins2,lins[];
				__CLOVER_62_0.cloverRec.S[5049]++;CIAttribut attr;
				__CLOVER_62_0.cloverRec.S[5050]++;CIDeclare_Var var,var2,var3;//&\u00e9"'(-\u00e8
				__CLOVER_62_0.cloverRec.S[5051]++;Feature f;
				__CLOVER_62_0.cloverRec.S[5052]++;Attribut_Complet ac;
				__CLOVER_62_0.cloverRec.S[5053]++;CIType type;
				__CLOVER_62_0.cloverRec.S[5054]++;NomFeature nf;
				__CLOVER_62_0.cloverRec.S[5055]++;tinyeiffel.ast.Classe cl3;
				__CLOVER_62_0.cloverRec.S[5056]++;tinyeiffel.ast.Type type3;
				//assert(false):"liste="+liste.length;
				//f=compiler.env.feature;
				//ac=compiler.env.table.donne_attribut(new NomFeature(instr.nom));//cl.donne_attribut(instr.nom);
				__CLOVER_62_0.cloverRec.S[5057]++;type=convertie_type(compiler.env.classe.type);
				__CLOVER_62_0.cloverRec.S[5058]++;nf=new NomFeature(instr.nom);
				__CLOVER_62_0.cloverRec.S[5059]++;var2=donne_attr(nf,type/*ac.getType().nom*/);
				//if(ac!=null&&ac.getFeature().est_routine())
				assert((((var2!=null)) && (++__CLOVER_62_0.cloverRec.CT[1714]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1714]==0&false)):"nom="+instr.nom+";type="+type;
				__CLOVER_62_0.cloverRec.S[5060]++;if((((var2!=null&&est_routine(nf,type)) && (++__CLOVER_62_0.cloverRec.CT[1715]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1715]==0&false)))
				{{
					__CLOVER_62_0.cloverRec.S[5061]++;var=ajoute_routine(r.local,
							new CINom_Attribut(var2.nom,var2.source),
							var2.type,v,null,instr.parametre);
					//assert(var!=null);
				}
				}else
				{{
					__CLOVER_62_0.cloverRec.S[5062]++;if((((var2==null) && (++__CLOVER_62_0.cloverRec.CT[1716]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1716]==0&false)))
						{__CLOVER_62_0.cloverRec.S[5063]++;var=r.cherche_var_routine(instr.nom);
					}else
					{{
						__CLOVER_62_0.cloverRec.S[5064]++;var=new CIDeclare_Var(var2.nom,var2.type,
								var2.source);
					}
					}assert((((var!=null)) && (++__CLOVER_62_0.cloverRec.CT[1717]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1717]==0&false)):"nom="+instr.nom+";"+var2;
				}
				//cl3=compiler.context.cherche_classe(new tinyeiffel.ast.Type(false,var.type.nom,new Vector()));
				//assert(cl3!=null);
				}__CLOVER_62_0.cloverRec.S[5065]++;ins=(Instr_Appel)instr.getSuivant();
				//i=0;
				__CLOVER_62_0.cloverRec.S[5066]++;while((((ins!=null) && (++__CLOVER_62_0.cloverRec.CT[1718]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1718]==0&false)))
				{{
					__CLOVER_62_0.cloverRec.S[5067]++;CIClasse cl2;
					__CLOVER_62_0.cloverRec.S[5068]++;Table_Symbol table;
					assert((((var!=null)) && (++__CLOVER_62_0.cloverRec.CT[1719]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1719]==0&false));
					//cl2=cl.programme.donne_classe(var.type);
					//attr=cl2.donne_attribut(instr.nom);
					/*table=context.donne_table_symbol(new tinyeiffel.ast.Type(false,var.type.nom,new Vector()));
					assert(table!=null);
					ac=table.donne_attribut(new NomFeature(ins.nom));
					assert(ac!=null);*/
					__CLOVER_62_0.cloverRec.S[5069]++;nf=new NomFeature(ins.nom);
					__CLOVER_62_0.cloverRec.S[5070]++;var2=donne_attr(nf,var.type);
					//assert(i<0):"var2="+var2+";i="+i+";param="+ins.parametre.length+
					//		";"+est_routine(ins.nom,var.type.nom);
					//if(ac.getFeature().est_routine())
					assert((((var2!=null)) && (++__CLOVER_62_0.cloverRec.CT[1720]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1720]==0&false)):"nf="+nf+";type="+var.type;
					__CLOVER_62_0.cloverRec.S[5071]++;if((((var2!=null&&est_routine(nf,var.type)) && (++__CLOVER_62_0.cloverRec.CT[1721]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1721]==0&false)))
					{{
						__CLOVER_62_0.cloverRec.S[5072]++;var=ajoute_routine(r.local,
								new CINom_Attribut(var2.nom,var2.source),
								var2.type,v,
								new CIExpr_Var(var.nom,var.source),
								ins.parametre);
					}
					}else
					{{
						//var=r.cherche_var(ins.nom);
						__CLOVER_62_0.cloverRec.S[5073]++;CIExpr_Appel expr;
						__CLOVER_62_0.cloverRec.S[5074]++;CIDeclare_Var v1,v2;
						__CLOVER_62_0.cloverRec.S[5075]++;CIInstruction ins3;
						/*if(var2==null)
						{// il faut chercher dans la classe du resultat precedant au lieu de la routine
							Type type2;
							Declare_entite entite;
							//var2=r.cherche_var_routine(ins.nom); //&"'(\u00e8-"
							entite=compiler.env.donne_entite(ins.nom);
							assert(entite!=null):"nom="+ins.nom;
							type2=convertie_type(entite.getType());
							//if(var2==null)
							{
								var2=new Declare_Var(ins.nom,type2);
							}
							assert(var2!=null):"var2="+ins.nom+";pos="+ins.debut();
						}*/
						/*else
						{
							var2=new Declare_Var(var2.nom,var2.type);
						}*/
						assert((((var!=null)) && (++__CLOVER_62_0.cloverRec.CT[1722]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1722]==0&false));
						assert((((var2!=null)) && (++__CLOVER_62_0.cloverRec.CT[1723]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1723]==0&false));
						__CLOVER_62_0.cloverRec.S[5076]++;expr=new CIExpr_Appel(
								new CIExpr_Var(var.nom,var.source),
								new CINom_Attribut(ins.nom,convertie_source(ins.tid)),
								null,convertie_source(ins.debut()));
						__CLOVER_62_0.cloverRec.S[5077]++;v1=r.ajoute_var_local(temp("tmp"),var2.type);
						__CLOVER_62_0.cloverRec.S[5078]++;ins3=new CIInstruction_Affect(
								new CIExpr_Var(v1.nom,v1.source),expr,null);
						__CLOVER_62_0.cloverRec.S[5079]++;v.addElement(ins3);
						__CLOVER_62_0.cloverRec.S[5080]++;var=v1;
						assert((((var!=null)) && (++__CLOVER_62_0.cloverRec.CT[1724]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1724]==0&false));
					}
					}__CLOVER_62_0.cloverRec.S[5081]++;ins=(Instr_Appel)ins.getSuivant();
					//i++;
				}
			}}
			}else {__CLOVER_62_0.cloverRec.S[5082]++;if((((inst instanceof Instr_Creation) && (++__CLOVER_62_0.cloverRec.CT[1725]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1725]==0&false)))
			{{// TODO : a terminer
				__CLOVER_62_0.cloverRec.S[5083]++;Instr_Creation ins=(Instr_Creation)inst;
				__CLOVER_62_0.cloverRec.S[5084]++;CIAttribut attr;
				__CLOVER_62_0.cloverRec.S[5085]++;CIDeclare_Var var,var2,var3,nom;//&\u00e9"'(-\u00e8
				__CLOVER_62_0.cloverRec.S[5086]++;Feature f;
				__CLOVER_62_0.cloverRec.S[5087]++;Attribut_Complet ac;
				__CLOVER_62_0.cloverRec.S[5088]++;CIType type;
				__CLOVER_62_0.cloverRec.S[5089]++;NomFeature nf;
				__CLOVER_62_0.cloverRec.S[5090]++;CIInstruction_Affect instr;
				__CLOVER_62_0.cloverRec.S[5091]++;CIExpr e,e2;
				__CLOVER_62_0.cloverRec.S[5092]++;CIExpr_Appel ea;
				__CLOVER_62_0.cloverRec.S[5093]++;CIExpr_Scalaire p[];
				__CLOVER_62_0.cloverRec.S[5094]++;CIResult_Expr r01,r02;
				__CLOVER_62_0.cloverRec.S[5095]++;if((((ins.type!=null) && (++__CLOVER_62_0.cloverRec.CT[1726]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1726]==0&false)))
					{__CLOVER_62_0.cloverRec.S[5096]++;type=convertie_type(ins.type);
				}else
				{{
					__CLOVER_62_0.cloverRec.S[5097]++;Declare_entite entite;
					__CLOVER_62_0.cloverRec.S[5098]++;entite=compiler.env.donne_entite(ins.nom);
					assert((((entite!=null)) && (++__CLOVER_62_0.cloverRec.CT[1727]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1727]==0&false));
					__CLOVER_62_0.cloverRec.S[5099]++;type=convertie_type(entite.getType());
				}
				}assert((((type!=null)) && (++__CLOVER_62_0.cloverRec.CT[1728]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1728]==0&false));
				__CLOVER_62_0.cloverRec.S[5100]++;nom=r.ajoute_var_local(temp("var"),type);
				__CLOVER_62_0.cloverRec.S[5101]++;p=null;
				__CLOVER_62_0.cloverRec.S[5102]++;if((((ins.parametre!=null) && (++__CLOVER_62_0.cloverRec.CT[1729]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1729]==0&false)))
				{{
					__CLOVER_62_0.cloverRec.S[5103]++;CIExpr_Scalaire es;
					__CLOVER_62_0.cloverRec.S[5104]++;p=new CIExpr_Scalaire[ins.parametre.length];
					__CLOVER_62_0.cloverRec.S[5105]++;for(int k=0;(((k<ins.parametre.length) && (++__CLOVER_62_0.cloverRec.CT[1730]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1730]==0&false));k++)
					{{
						__CLOVER_62_0.cloverRec.S[5106]++;r01=this.convertie_expr(r.local,ins.parametre[k]);
						__CLOVER_62_0.cloverRec.S[5107]++;if((((r01!=null) && (++__CLOVER_62_0.cloverRec.CT[1731]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1731]==0&false)))
						{{
							__CLOVER_62_0.cloverRec.S[5108]++;if((((r01.a_instr()) && (++__CLOVER_62_0.cloverRec.CT[1732]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1732]==0&false)))
								{__CLOVER_62_0.cloverRec.S[5109]++;v.addAll(r01.instr);
							}__CLOVER_62_0.cloverRec.S[5110]++;r02=this.convertie_scalaire(r.local,r01.expr);
							__CLOVER_62_0.cloverRec.S[5111]++;if((((r02.a_instr()) && (++__CLOVER_62_0.cloverRec.CT[1733]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1733]==0&false)))
								{__CLOVER_62_0.cloverRec.S[5112]++;v.addAll(r02.instr);
							}__CLOVER_62_0.cloverRec.S[5113]++;p[k]=(CIExpr_Scalaire)r02.expr;
						}
					}}
				}}
				}__CLOVER_62_0.cloverRec.S[5114]++;ea=new CIExpr_Appel(null,
						new CINom_Attribut(ins.nom,convertie_source(ins.tid2)),
						p,convertie_source(ins.debut()));
				__CLOVER_62_0.cloverRec.S[5115]++;e=new CIExpr_Creation(type,ea,convertie_source(ins.debut()));
				__CLOVER_62_0.cloverRec.S[5116]++;instr=new CIInstruction_Affect(
						new CIExpr_Var(nom.nom,nom.source),e,null);
				__CLOVER_62_0.cloverRec.S[5117]++;v.addElement(instr);
			}
			}else {__CLOVER_62_0.cloverRec.S[5118]++;if((((inst instanceof Instr_TentAffect) && (++__CLOVER_62_0.cloverRec.CT[1734]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1734]==0&false)))
			{{// TODO : a terminer
				__CLOVER_62_0.cloverRec.S[5119]++;Instr_TentAffect instr=(Instr_TentAffect)inst;
				__CLOVER_62_0.cloverRec.S[5120]++;Instr ins,lins[];
				__CLOVER_62_0.cloverRec.S[5121]++;String nom;
				__CLOVER_62_0.cloverRec.S[5122]++;CIDeclare_Var v1,v2;
				__CLOVER_62_0.cloverRec.S[5123]++;String l1,fin;
				__CLOVER_62_0.cloverRec.S[5124]++;CIExpr e,e2,e3;
				__CLOVER_62_0.cloverRec.S[5125]++;CIExpr_Scalaire es;
				__CLOVER_62_0.cloverRec.S[5126]++;CIExpr_Var ev;
				__CLOVER_62_0.cloverRec.S[5127]++;CIResult_Expr r01,r02;
				__CLOVER_62_0.cloverRec.S[5128]++;CIType type;
				__CLOVER_62_0.cloverRec.S[5129]++;l1=temp("label");
				__CLOVER_62_0.cloverRec.S[5130]++;fin=temp("fin");
				__CLOVER_62_0.cloverRec.S[5131]++;res=convertie_expr(r.local,instr.expr);
				__CLOVER_62_0.cloverRec.S[5132]++;if((((res!=null) && (++__CLOVER_62_0.cloverRec.CT[1735]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1735]==0&false)))
				{{
				__CLOVER_62_0.cloverRec.S[5133]++;if((((res.a_instr()) && (++__CLOVER_62_0.cloverRec.CT[1736]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1736]==0&false)))
				{{
					__CLOVER_62_0.cloverRec.S[5134]++;v.addAll(res.instr);
				}
				}__CLOVER_62_0.cloverRec.S[5135]++;type=res.expr.type;
				__CLOVER_62_0.cloverRec.S[5136]++;ev=new CIExpr_Var(instr.nom,convertie_source(instr.tid));
				__CLOVER_62_0.cloverRec.S[5137]++;e=new CIExpr_Type(ev,type,
						convertie_source((Token)null/*TODO: instr.expr.debut() ?*/));
				__CLOVER_62_0.cloverRec.S[5138]++;instruction=new CIInstruction_Si(e,l1,
						convertie_source(instr.debut()));
				__CLOVER_62_0.cloverRec.S[5139]++;v.addElement(instruction);
				__CLOVER_62_0.cloverRec.S[5140]++;instruction=new CIInstruction_Affect(ev,new CIExpr_Void(null),null);
				__CLOVER_62_0.cloverRec.S[5141]++;v.addElement(instruction);
				__CLOVER_62_0.cloverRec.S[5142]++;instruction=new CIInstruction_Goto(fin,null);
				__CLOVER_62_0.cloverRec.S[5143]++;v.addElement(instruction);
				__CLOVER_62_0.cloverRec.S[5144]++;instruction=new CIInstruction_Label(l1,null);
				__CLOVER_62_0.cloverRec.S[5145]++;v.addElement(instruction);
				__CLOVER_62_0.cloverRec.S[5146]++;instruction=new CIInstruction_Affect(ev,res.expr,null);
				__CLOVER_62_0.cloverRec.S[5147]++;v.addElement(instruction);
				__CLOVER_62_0.cloverRec.S[5148]++;instruction=new CIInstruction_Label(fin,null);
				__CLOVER_62_0.cloverRec.S[5149]++;v.addElement(instruction);
				}
			}}
			}else {__CLOVER_62_0.cloverRec.S[5150]++;if((((inst instanceof Instr_Inspect) && (++__CLOVER_62_0.cloverRec.CT[1737]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1737]==0&false)))
			{{// TODO : a terminer
				__CLOVER_62_0.cloverRec.S[5151]++;Instr_Inspect instr=(Instr_Inspect)inst;
				__CLOVER_62_0.cloverRec.S[5152]++;Instr ins,lins[];
				__CLOVER_62_0.cloverRec.S[5153]++;String nom,var_test;
				__CLOVER_62_0.cloverRec.S[5154]++;CIDeclare_Var v1,v2;
				__CLOVER_62_0.cloverRec.S[5155]++;String l1,fin,suite,suite_else=null;
				__CLOVER_62_0.cloverRec.S[5156]++;CIExpr e,e2,e3;
				__CLOVER_62_0.cloverRec.S[5157]++;CIExpr_Scalaire es;
				__CLOVER_62_0.cloverRec.S[5158]++;CIExpr_Var ev;
				__CLOVER_62_0.cloverRec.S[5159]++;CIResult_Expr r01,r02;
				__CLOVER_62_0.cloverRec.S[5160]++;CIType type;
				__CLOVER_62_0.cloverRec.S[5161]++;Vector v3,v4;
				__CLOVER_62_0.cloverRec.S[5162]++;boolean else_trouve=false;
				__CLOVER_62_0.cloverRec.S[5163]++;Token token=new Token(-1,-1,"","");
				__CLOVER_62_0.cloverRec.S[5164]++;tinyeiffel.ast.Expr_Var ev2;
				__CLOVER_62_0.cloverRec.S[5165]++;r01=this.convertie_expr(r.local,instr.expr);
				__CLOVER_62_0.cloverRec.S[5166]++;if((((r01.a_instr()) && (++__CLOVER_62_0.cloverRec.CT[1738]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1738]==0&false)))
					{__CLOVER_62_0.cloverRec.S[5167]++;v.addAll(r01.instr);
				}__CLOVER_62_0.cloverRec.S[5168]++;e=r01.expr;
				__CLOVER_62_0.cloverRec.S[5169]++;r01=this.convertie_scalaire(r.local,e);
				__CLOVER_62_0.cloverRec.S[5170]++;if((((r01.a_instr()) && (++__CLOVER_62_0.cloverRec.CT[1739]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1739]==0&false)))
					{__CLOVER_62_0.cloverRec.S[5171]++;v.addAll(r01.instr);
				}__CLOVER_62_0.cloverRec.S[5172]++;es=(CIExpr_Scalaire)r01.expr;
				__CLOVER_62_0.cloverRec.S[5173]++;fin=temp("label");
				__CLOVER_62_0.cloverRec.S[5174]++;var_test=temp("var_test");
				__CLOVER_62_0.cloverRec.S[5175]++;r.ajoute_var_local(var_test,es.type);
				__CLOVER_62_0.cloverRec.S[5176]++;instruction=new CIInstruction_Affect(
						new CIExpr_Var(var_test,null),
						es,null);
				__CLOVER_62_0.cloverRec.S[5177]++;v.addElement(instruction);
				__CLOVER_62_0.cloverRec.S[5178]++;ev2=new tinyeiffel.ast.Expr_Var(var_test,token);
				__CLOVER_62_0.cloverRec.S[5179]++;l1=null;
				__CLOVER_62_0.cloverRec.S[5180]++;while((((instr!=null) && (++__CLOVER_62_0.cloverRec.CT[1740]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1740]==0&false)))
				{{
					__CLOVER_62_0.cloverRec.S[5181]++;l1=temp("label");
					__CLOVER_62_0.cloverRec.S[5182]++;if((((instr.when!=null&&instr.when.size()>0) && (++__CLOVER_62_0.cloverRec.CT[1741]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1741]==0&false)))
					{{// les testes
						__CLOVER_62_0.cloverRec.S[5183]++;tinyeiffel.ast.Expr e1,e4;
						__CLOVER_62_0.cloverRec.S[5184]++;int k;
						__CLOVER_62_0.cloverRec.S[5185]++;v4=instr.when;
						__CLOVER_62_0.cloverRec.S[5186]++;if((((v4.size()>0) && (++__CLOVER_62_0.cloverRec.CT[1742]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1742]==0&false)))
						{{
							__CLOVER_62_0.cloverRec.S[5187]++;suite=temp("suite");
							__CLOVER_62_0.cloverRec.S[5188]++;for(k=0;(((k<v4.size()) && (++__CLOVER_62_0.cloverRec.CT[1743]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1743]==0&false));k++)
							{{
								__CLOVER_62_0.cloverRec.S[5189]++;tinyeiffel.ast.Expr_Binaire exp_test;
								__CLOVER_62_0.cloverRec.S[5190]++;v3=(Vector)v4.elementAt(k);
								__CLOVER_62_0.cloverRec.S[5191]++;if((((v3.size()==2) && (++__CLOVER_62_0.cloverRec.CT[1744]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1744]==0&false)))
								{{
									__CLOVER_62_0.cloverRec.S[5192]++;String suite2,suite3;
									__CLOVER_62_0.cloverRec.S[5193]++;CIExpr_Scalaire es1,es2;
									__CLOVER_62_0.cloverRec.S[5194]++;CIExpr_Binaire eb;
									__CLOVER_62_0.cloverRec.S[5195]++;suite2=temp("test_intervalle");
									__CLOVER_62_0.cloverRec.S[5196]++;suite3=temp("fin_test_intervalle");
									__CLOVER_62_0.cloverRec.S[5197]++;e1=(tinyeiffel.ast.Expr)v3.elementAt(0);
									__CLOVER_62_0.cloverRec.S[5198]++;r01=convertie_expr(r.local,e1);
									__CLOVER_62_0.cloverRec.S[5199]++;if((((r01.a_instr()) && (++__CLOVER_62_0.cloverRec.CT[1745]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1745]==0&false)))
										{__CLOVER_62_0.cloverRec.S[5200]++;v.addAll(r01.instr);
									}__CLOVER_62_0.cloverRec.S[5201]++;r01=convertie_scalaire(r.local,r01.expr);
									__CLOVER_62_0.cloverRec.S[5202]++;if((((r01.a_instr()) && (++__CLOVER_62_0.cloverRec.CT[1746]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1746]==0&false)))
										{__CLOVER_62_0.cloverRec.S[5203]++;v.addAll(r01.instr);
									}__CLOVER_62_0.cloverRec.S[5204]++;es1=(CIExpr_Scalaire)r01.expr;
									__CLOVER_62_0.cloverRec.S[5205]++;eb=new CIExpr_Binaire(CIExpr_Binaire.Sup,es,es1,
											convertie_source(((tinyeiffel.ast.Expr)v3.elementAt(0)).debut()));
									//exp_test=new tinyeiffel.ast.Expr_Binaire(tinyeiffel.ast.Expr.Sup,ev2,e1,token);
									__CLOVER_62_0.cloverRec.S[5206]++;ajoute_test(r.local,suite2,v,/*exp_test*/eb,false);
									__CLOVER_62_0.cloverRec.S[5207]++;instruction=new CIInstruction_Goto(suite3,null);
									__CLOVER_62_0.cloverRec.S[5208]++;v.addElement(instruction);
									__CLOVER_62_0.cloverRec.S[5209]++;instruction=new CIInstruction_Label(suite2,null);
									__CLOVER_62_0.cloverRec.S[5210]++;v.addElement(instruction);
									__CLOVER_62_0.cloverRec.S[5211]++;e4=(tinyeiffel.ast.Expr)v3.elementAt(1);
									__CLOVER_62_0.cloverRec.S[5212]++;r01=convertie_expr(r.local,e4);
									__CLOVER_62_0.cloverRec.S[5213]++;if((((r01.a_instr()) && (++__CLOVER_62_0.cloverRec.CT[1747]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1747]==0&false)))
										{__CLOVER_62_0.cloverRec.S[5214]++;v.addAll(r01.instr);
									}__CLOVER_62_0.cloverRec.S[5215]++;r01=convertie_scalaire(r.local,r01.expr);
									__CLOVER_62_0.cloverRec.S[5216]++;if((((r01.a_instr()) && (++__CLOVER_62_0.cloverRec.CT[1748]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1748]==0&false)))
										{__CLOVER_62_0.cloverRec.S[5217]++;v.addAll(r01.instr);
									}__CLOVER_62_0.cloverRec.S[5218]++;es1=(CIExpr_Scalaire)r01.expr;
									__CLOVER_62_0.cloverRec.S[5219]++;eb=new CIExpr_Binaire(CIExpr_Binaire.Inf,es,es1,null);
									//exp_test=new tinyeiffel.ast.Expr_Binaire(tinyeiffel.ast.Expr.Inf,ev2,e4,token);
									__CLOVER_62_0.cloverRec.S[5220]++;ajoute_test(r.local,suite,v,/*exp_test*/eb,false);
									__CLOVER_62_0.cloverRec.S[5221]++;instruction=new CIInstruction_Label(suite3,null);
									__CLOVER_62_0.cloverRec.S[5222]++;v.addElement(instruction);
								}
								}else
								{{
									assert((((v3.size()==1)) && (++__CLOVER_62_0.cloverRec.CT[1749]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1749]==0&false));
									__CLOVER_62_0.cloverRec.S[5223]++;e1=(tinyeiffel.ast.Expr)v3.elementAt(0);
									__CLOVER_62_0.cloverRec.S[5224]++;exp_test=new tinyeiffel.ast.Expr_Binaire(tinyeiffel.ast.Expr.Egal,ev2,e1,new Token(-1,-1,"",""));
									__CLOVER_62_0.cloverRec.S[5225]++;ajoute_test(r.local,suite,v,exp_test,false);
								}
							}}
							}__CLOVER_62_0.cloverRec.S[5226]++;instruction=new CIInstruction_Goto(l1,null);
							__CLOVER_62_0.cloverRec.S[5227]++;v.addElement(instruction);
							__CLOVER_62_0.cloverRec.S[5228]++;instruction=new CIInstruction_Label(suite,null);
							__CLOVER_62_0.cloverRec.S[5229]++;v.addElement(instruction);
						}
					}}
					}else
					{{
						__CLOVER_62_0.cloverRec.S[5230]++;suite_else=temp("label_else");
						__CLOVER_62_0.cloverRec.S[5231]++;instruction=new CIInstruction_Goto(l1,null);
						__CLOVER_62_0.cloverRec.S[5232]++;v.addElement(instruction);
						__CLOVER_62_0.cloverRec.S[5233]++;instruction=new CIInstruction_Label(suite_else,null);
						__CLOVER_62_0.cloverRec.S[5234]++;v.addElement(instruction);
					}
					//r01=convertie_instr(cl,r,instr.liste_instr);
					}__CLOVER_62_0.cloverRec.S[5235]++;ajoute_instr(v,cl,r,instr.liste_instr);
					__CLOVER_62_0.cloverRec.S[5236]++;instruction=new CIInstruction_Goto(fin,null);
					__CLOVER_62_0.cloverRec.S[5237]++;v.addElement(instruction);
					__CLOVER_62_0.cloverRec.S[5238]++;instruction=new CIInstruction_Label(l1,null);
					__CLOVER_62_0.cloverRec.S[5239]++;v.addElement(instruction);
					__CLOVER_62_0.cloverRec.S[5240]++;instr=(Instr_Inspect)instr.getSuivant();
				}
				// instruction si aucun choix
				}__CLOVER_62_0.cloverRec.S[5241]++;instruction=new CIInstruction_Raise(new CIExpr_Entier(7,null),null);
				__CLOVER_62_0.cloverRec.S[5242]++;v.addElement(instruction);
				__CLOVER_62_0.cloverRec.S[5243]++;if((((suite_else!=null) && (++__CLOVER_62_0.cloverRec.CT[1750]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1750]==0&false)))
				{{
					__CLOVER_62_0.cloverRec.S[5244]++;instruction=new CIInstruction_Goto(suite_else,null);
					__CLOVER_62_0.cloverRec.S[5245]++;v.addElement(instruction);
				}
				// fin de l'inspect
				}__CLOVER_62_0.cloverRec.S[5246]++;instruction=new CIInstruction_Label(fin,null);
				__CLOVER_62_0.cloverRec.S[5247]++;v.addElement(instruction);
			}
			}else {__CLOVER_62_0.cloverRec.S[5248]++;if((((inst instanceof Instr_Retry) && (++__CLOVER_62_0.cloverRec.CT[1751]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1751]==0&false)))
			{{
				__CLOVER_62_0.cloverRec.S[5249]++;Instr_Retry instr=(Instr_Retry)inst;
				__CLOVER_62_0.cloverRec.S[5250]++;Instr ins,lins[];
				__CLOVER_62_0.cloverRec.S[5251]++;String nom,var_test;
				__CLOVER_62_0.cloverRec.S[5252]++;instruction=new CIInstruction_Goto("debut_routine",
						convertie_source(instr.debut()));
				__CLOVER_62_0.cloverRec.S[5253]++;v.addElement(instruction);
			}
			}else {__CLOVER_62_0.cloverRec.S[5254]++;if((((inst instanceof Instr_Check) && (++__CLOVER_62_0.cloverRec.CT[1752]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1752]==0&false)))
			{{
				__CLOVER_62_0.cloverRec.S[5255]++;Instr_Check instr=(Instr_Check)inst;
				__CLOVER_62_0.cloverRec.S[5256]++;Instr ins,lins[];
				__CLOVER_62_0.cloverRec.S[5257]++;String nom,var_test,suite,suite2;
				__CLOVER_62_0.cloverRec.S[5258]++;CIAssertion as;
				__CLOVER_62_0.cloverRec.S[5259]++;CIDeclare_Var var;
				__CLOVER_62_0.cloverRec.S[5260]++;CIExpr_Var_Syst ev;
				__CLOVER_62_0.cloverRec.S[5261]++;CIExpr_Entier ee;
				__CLOVER_62_0.cloverRec.S[5262]++;CIExpr_Scalaire tab[];
				//Instruction instr0;
				__CLOVER_62_0.cloverRec.S[5263]++;suite=temp("suite_check");
				//suite2=temp("debut_check");
				// TODO: verifier pour le code d'exception
				__CLOVER_62_0.cloverRec.S[5264]++;as=convertie_assert(cl,instr.liste_expr,
						new CIExpr_Entier(4,null));
				//instruction=new Instruction_Goto("debut_routine");
				//v.addElement(instruction);
				//TODO: trouver la valeur pour les niveaus de verif
				__CLOVER_62_0.cloverRec.S[5265]++;ee=new CIExpr_Entier(-1,null);
				__CLOVER_62_0.cloverRec.S[5266]++;tab=new CIExpr_Scalaire[1];
				__CLOVER_62_0.cloverRec.S[5267]++;tab[0]=ee;
				__CLOVER_62_0.cloverRec.S[5268]++;ev=new CIExpr_Var_Syst("$niveau_verif",tab,null);
				//e=new Expr_Type(ev,type);
				// TODO: a optimiser (ajouter l'instruction Si_Non)
				__CLOVER_62_0.cloverRec.S[5269]++;instruction=new CIInstruction_Si_Non(ev,suite,
						convertie_source(instr.debut()));
				__CLOVER_62_0.cloverRec.S[5270]++;v.addElement(instruction);
				/*instruction=new Instruction_Goto(suite);
				v.addElement(instruction);
				instruction=new Instruction_Label(suite2);
				v.addElement(instruction);*/
				__CLOVER_62_0.cloverRec.S[5271]++;for(i=0;(((i<as.liste.size()) && (++__CLOVER_62_0.cloverRec.CT[1753]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1753]==0&false));i++)
				{{
					__CLOVER_62_0.cloverRec.S[5272]++;var=as.liste.elt(i);
					__CLOVER_62_0.cloverRec.S[5273]++;r.local.ajoute(var.nom,var.type);
				}
				}__CLOVER_62_0.cloverRec.S[5274]++;for(i=0;(((i<as.liste_instr.size()) && (++__CLOVER_62_0.cloverRec.CT[1754]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1754]==0&false));i++)
				{{
					__CLOVER_62_0.cloverRec.S[5275]++;instruction=as.liste_instr.elt(i);
					//r.local.ajoute(var.nom,var.type);
					__CLOVER_62_0.cloverRec.S[5276]++;v.addElement(instruction);
				}
				}__CLOVER_62_0.cloverRec.S[5277]++;instruction=new CIInstruction_Label(suite,null);
				__CLOVER_62_0.cloverRec.S[5278]++;v.addElement(instruction);
			}
			}else {__CLOVER_62_0.cloverRec.S[5279]++;if((((inst instanceof Instr_Debug) && (++__CLOVER_62_0.cloverRec.CT[1755]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1755]==0&false)))
			{{
				__CLOVER_62_0.cloverRec.S[5280]++;Instr_Debug instr=(Instr_Debug)inst;
				__CLOVER_62_0.cloverRec.S[5281]++;Instr ins,lins[];
				__CLOVER_62_0.cloverRec.S[5282]++;String nom,var_test,suite,suite2;
				__CLOVER_62_0.cloverRec.S[5283]++;CIAssertion as;
				__CLOVER_62_0.cloverRec.S[5284]++;CIDeclare_Var var;
				__CLOVER_62_0.cloverRec.S[5285]++;CIExpr_Var_Syst ev;
				__CLOVER_62_0.cloverRec.S[5286]++;CIExpr_String es;
				__CLOVER_62_0.cloverRec.S[5287]++;CIExpr_Scalaire tab[];
				//Instruction instr0;
				__CLOVER_62_0.cloverRec.S[5288]++;suite=temp("suite_debug");
				//suite2=temp("debut_check");
				// TODO: verifier pour le code d'exception
				//as=convertie_assert(cl,instr.liste_expr,new Expr_Entier(4));
				//instruction=new Instruction_Goto("debut_routine");
				//v.addElement(instruction);
				//TODO: trouver la valeur pour les niveaus de verif
				//ee=new Expr_Entier(-1);
				__CLOVER_62_0.cloverRec.S[5289]++;tab=new CIExpr_Scalaire[instr.chaine.length];
				__CLOVER_62_0.cloverRec.S[5290]++;for(i=0;(((i<tab.length) && (++__CLOVER_62_0.cloverRec.CT[1756]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1756]==0&false));i++)
				{{
					__CLOVER_62_0.cloverRec.S[5291]++;String str,str2;
					__CLOVER_62_0.cloverRec.S[5292]++;str=instr.chaine[i].chaine_unique();
					__CLOVER_62_0.cloverRec.S[5293]++;if((((str.startsWith("\"")&&str.endsWith("\"")) && (++__CLOVER_62_0.cloverRec.CT[1757]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1757]==0&false)))
					{{
						__CLOVER_62_0.cloverRec.S[5294]++;str2=str.substring(1,str.length()-1);
					}
					}else
					{{
						__CLOVER_62_0.cloverRec.S[5295]++;str2=str;
					}
					
					}__CLOVER_62_0.cloverRec.S[5296]++;es=new CIExpr_String(str2,null);
					__CLOVER_62_0.cloverRec.S[5297]++;tab[i]=es;
				}
				}__CLOVER_62_0.cloverRec.S[5298]++;ev=new CIExpr_Var_Syst("$niveau_verif_debug",tab,null);
				//e=new Expr_Type(ev,type);
				// TODO: a optimiser (ajouter l'instruction Si_Non)
				__CLOVER_62_0.cloverRec.S[5299]++;instruction=new CIInstruction_Si_Non(ev,suite,null);
				__CLOVER_62_0.cloverRec.S[5300]++;v.addElement(instruction);
				/*instruction=new Instruction_Goto(suite);
				v.addElement(instruction);
				instruction=new Instruction_Label(suite2);
				v.addElement(instruction);*/
				__CLOVER_62_0.cloverRec.S[5301]++;ajoute_instr(v,cl,r,instr.instr);
				/*for(i=0;i<as.liste.size();i++)
				{
					var=as.liste.elt(i);
					r.local.ajoute(var.nom,var.type);
				}
				for(i=0;i<as.liste_instr.size();i++)
				{
					instruction=as.liste_instr.elt(i);
					//r.local.ajoute(var.nom,var.type);
					v.addElement(instruction);
				}*/
				__CLOVER_62_0.cloverRec.S[5302]++;instruction=new CIInstruction_Label(suite,null);
				__CLOVER_62_0.cloverRec.S[5303]++;v.addElement(instruction);
			}
		}}}}}}}}}}}
		}__CLOVER_62_0.cloverRec.S[5304]++;linstr=new CIInstruction[v.size()];
		__CLOVER_62_0.cloverRec.S[5305]++;v.copyInto(linstr);
		__CLOVER_62_0.cloverRec.S[5306]++;return linstr;
	}


	protected CIAssertion convertie_assert(CIClasse cl,
											Assert liste[])
	{__CLOVER_62_0.cloverRec.M[452]++;
		__CLOVER_62_0.cloverRec.S[5307]++;return convertie_assert(cl,liste,new CIExpr_Entier(4,null));
	}

	protected CIAssertion convertie_assert(CIClasse cl,
											Assert liste[],
											CIExpr_Scalaire except)
	{__CLOVER_62_0.cloverRec.M[453]++;// TODO: mettre en parametre l'exception lev\u00e9e
		__CLOVER_62_0.cloverRec.S[5308]++;Vector v=new Vector();
		__CLOVER_62_0.cloverRec.S[5309]++;Assert ass,liste_assert[];
		__CLOVER_62_0.cloverRec.S[5310]++;int i,j;
		__CLOVER_62_0.cloverRec.S[5311]++;CIResult_Expr res,r1,r2,r3;
		__CLOVER_62_0.cloverRec.S[5312]++;CIListe_Var liste_var;
		__CLOVER_62_0.cloverRec.S[5313]++;CIAssertion assert2;
		__CLOVER_62_0.cloverRec.S[5314]++;CIInstruction instr;
		__CLOVER_62_0.cloverRec.S[5315]++;CIListe_Instr liste_instr;
		__CLOVER_62_0.cloverRec.S[5316]++;String label;
		assert((((cl!=null)) && (++__CLOVER_62_0.cloverRec.CT[1758]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1758]==0&false));
		assert((((liste!=null)) && (++__CLOVER_62_0.cloverRec.CT[1759]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1759]==0&false));
		assert((((except!=null)) && (++__CLOVER_62_0.cloverRec.CT[1760]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1760]==0&false));
		__CLOVER_62_0.cloverRec.S[5317]++;assert2=new CIAssertion(null);
		__CLOVER_62_0.cloverRec.S[5318]++;for(i=0;(((i<liste.length) && (++__CLOVER_62_0.cloverRec.CT[1761]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1761]==0&false));i++)
		{{
			__CLOVER_62_0.cloverRec.S[5319]++;ass=liste[i];
			__CLOVER_62_0.cloverRec.S[5320]++;if((((ass.expr!=null) && (++__CLOVER_62_0.cloverRec.CT[1762]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1762]==0&false)))
			{{
				__CLOVER_62_0.cloverRec.S[5321]++;label=temp("assert");
				__CLOVER_62_0.cloverRec.S[5322]++;ajoute_test(assert2.liste,label,v,ass.expr,false);
				__CLOVER_62_0.cloverRec.S[5323]++;instr=new CIInstruction_Raise(except,null);
				__CLOVER_62_0.cloverRec.S[5324]++;v.addElement(instr);
				__CLOVER_62_0.cloverRec.S[5325]++;instr=new CIInstruction_Label(label,null);
				__CLOVER_62_0.cloverRec.S[5326]++;v.addElement(instr);
			}
		}}
		}__CLOVER_62_0.cloverRec.S[5327]++;if((((v.size()>0) && (++__CLOVER_62_0.cloverRec.CT[1763]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1763]==0&false)))
		{{
			__CLOVER_62_0.cloverRec.S[5328]++;liste_instr=new CIListe_Instr();
			//v.copyInto(liste_instr);
			__CLOVER_62_0.cloverRec.S[5329]++;liste_instr.ajoute(v);
			__CLOVER_62_0.cloverRec.S[5330]++;assert2.liste_instr=liste_instr;
			__CLOVER_62_0.cloverRec.S[5331]++;return assert2;
		}
		}else
		{{
			__CLOVER_62_0.cloverRec.S[5332]++;return null;
		}
	}}

	protected CIDeclare_Var ajoute_routine(CIListe_Var liste,CINom_Attribut nom,CIType type,/*Attribut_Complet ac,//Attribut attr,
									/*Instr_Appel instr,*/Vector v,CIExpr_Var cible,
									tinyeiffel.ast.Expr parametre[])
	{__CLOVER_62_0.cloverRec.M[454]++;
		__CLOVER_62_0.cloverRec.S[5333]++;CIResult_Expr res1,res2;
		__CLOVER_62_0.cloverRec.S[5334]++;tinyeiffel.ast.Expr e;
		__CLOVER_62_0.cloverRec.S[5335]++;CIExpr_Scalaire param[]=null,e1,e2;
		__CLOVER_62_0.cloverRec.S[5336]++;int i,j;
		__CLOVER_62_0.cloverRec.S[5337]++;CIInstruction ins;
		__CLOVER_62_0.cloverRec.S[5338]++;CIDeclare_Var res;
		//Expr_Var ev;
		assert((((liste!=null)) && (++__CLOVER_62_0.cloverRec.CT[1764]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1764]==0&false));
		assert((((nom!=null)) && (++__CLOVER_62_0.cloverRec.CT[1765]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1765]==0&false));
		//assert(type!=null);
		//assert(instr!=null);
		assert((((v!=null)) && (++__CLOVER_62_0.cloverRec.CT[1766]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1766]==0&false));
		//assert(!var.nom.equalsIgnoreCase("f3")):"var="+var;
		__CLOVER_62_0.cloverRec.S[5339]++;if((((parametre!=null) && (++__CLOVER_62_0.cloverRec.CT[1767]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1767]==0&false)))
		{{
			__CLOVER_62_0.cloverRec.S[5340]++;param=new CIExpr_Scalaire[parametre.length];
			__CLOVER_62_0.cloverRec.S[5341]++;for(i=0;(((i<parametre.length) && (++__CLOVER_62_0.cloverRec.CT[1768]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1768]==0&false));i++)
			{{
				__CLOVER_62_0.cloverRec.S[5342]++;e=parametre[i];
				__CLOVER_62_0.cloverRec.S[5343]++;res1=convertie_expr(liste,e);
				__CLOVER_62_0.cloverRec.S[5344]++;if((((res1!=null) && (++__CLOVER_62_0.cloverRec.CT[1769]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1769]==0&false)))
				{{
				__CLOVER_62_0.cloverRec.S[5345]++;if((((res1.instr!=null) && (++__CLOVER_62_0.cloverRec.CT[1770]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1770]==0&false)))
					{__CLOVER_62_0.cloverRec.S[5346]++;v.addAll(res1.instr);
				}__CLOVER_62_0.cloverRec.S[5347]++;res2=convertie_scalaire(liste,res1.expr);
				__CLOVER_62_0.cloverRec.S[5348]++;if((((res2.instr!=null) && (++__CLOVER_62_0.cloverRec.CT[1771]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1771]==0&false)))
					{__CLOVER_62_0.cloverRec.S[5349]++;v.addAll(res2.instr);
				}__CLOVER_62_0.cloverRec.S[5350]++;param[i]=(CIExpr_Scalaire)res2.expr;
				}
			}}
		}}
		// TODO: a continuer
		/*if(cible!=null)
			ev=new Expr_Var(cible);
		else
			ev=null;*/
		/*if(var.nom.compareToIgnoreCase("f1")==0)
		{
			assert(var.nom.compareToIgnoreCase("f1")==0);
			assert(var.nom.compareToIgnoreCase("f3")!=0);
			//assert(var.nom.compareToIgnoreCase("f1")!=0):"var="+var;
			//assert(false):"var="+var;
		}*/
		//assert(var.nom.compareToIgnoreCase("f3")!=0):"f3="+var+";"+param+"#"+cible+";p="+parametre;
		}__CLOVER_62_0.cloverRec.S[5351]++;if((((type!=null) && (++__CLOVER_62_0.cloverRec.CT[1772]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1772]==0&false)))
		{{
			__CLOVER_62_0.cloverRec.S[5352]++;CIExpr_Appel expr;
			__CLOVER_62_0.cloverRec.S[5353]++;CIDeclare_Var v1,v2;
			__CLOVER_62_0.cloverRec.S[5354]++;if((((cible!=null) && (++__CLOVER_62_0.cloverRec.CT[1773]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1773]==0&false)))
			{{
				__CLOVER_62_0.cloverRec.S[5355]++;CIExpr_Binaire exp;
				__CLOVER_62_0.cloverRec.S[5356]++;String label;
				__CLOVER_62_0.cloverRec.S[5357]++;label=temp("tmp");
				__CLOVER_62_0.cloverRec.S[5358]++;exp=new CIExpr_Binaire(CIExpr_Binaire.Diff,new CIExpr_Void(null),cible,null);
				__CLOVER_62_0.cloverRec.S[5359]++;ins=new CIInstruction_Si(exp,label,null);
				__CLOVER_62_0.cloverRec.S[5360]++;v.addElement(ins);
				__CLOVER_62_0.cloverRec.S[5361]++;ins=new CIInstruction_Raise(new CIExpr_Entier(6,null),null);
				__CLOVER_62_0.cloverRec.S[5362]++;v.addElement(ins);
				__CLOVER_62_0.cloverRec.S[5363]++;ins=new CIInstruction_Label(label,null);
				__CLOVER_62_0.cloverRec.S[5364]++;v.addElement(ins);
			}
			}__CLOVER_62_0.cloverRec.S[5365]++;expr=new CIExpr_Appel(cible,nom,param,null);
			//v1=r.ajoute_var_local(temp("tmp"),type);
			__CLOVER_62_0.cloverRec.S[5366]++;v1=liste.ajoute(temp("tmp"),type);
			__CLOVER_62_0.cloverRec.S[5367]++;ins=new CIInstruction_Affect(new CIExpr_Var(v1.nom,null),expr,null);
			__CLOVER_62_0.cloverRec.S[5368]++;v.addElement(ins);
			__CLOVER_62_0.cloverRec.S[5369]++;return v1;
		}
		}else
		{{
			__CLOVER_62_0.cloverRec.S[5370]++;if((((cible!=null) && (++__CLOVER_62_0.cloverRec.CT[1774]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1774]==0&false)))
			{{
				__CLOVER_62_0.cloverRec.S[5371]++;CIExpr_Binaire exp;
				__CLOVER_62_0.cloverRec.S[5372]++;String label;
				__CLOVER_62_0.cloverRec.S[5373]++;label=temp("tmp");
				__CLOVER_62_0.cloverRec.S[5374]++;exp=new CIExpr_Binaire(CIExpr_Binaire.Diff,new CIExpr_Void(null),cible,null);
				__CLOVER_62_0.cloverRec.S[5375]++;ins=new CIInstruction_Si(exp,label,null);
				__CLOVER_62_0.cloverRec.S[5376]++;v.addElement(ins);
				__CLOVER_62_0.cloverRec.S[5377]++;ins=new CIInstruction_Raise(new CIExpr_Entier(6,null),null);
				__CLOVER_62_0.cloverRec.S[5378]++;v.addElement(ins);
				__CLOVER_62_0.cloverRec.S[5379]++;ins=new CIInstruction_Label(label,null);
				__CLOVER_62_0.cloverRec.S[5380]++;v.addElement(ins);
			}
			}__CLOVER_62_0.cloverRec.S[5381]++;ins=new CIInstruction_Appel(cible,nom,param,null);
			__CLOVER_62_0.cloverRec.S[5382]++;v.addElement(ins);
			__CLOVER_62_0.cloverRec.S[5383]++;return null;
		}
	}}

	/*protected Type trouve_vrai_type(Routine r,Type type)
	{
		Declare_Var v;
		assert(type!=null);
		if(type.is_like)
		{
			if(r!=null)
			{
				v=r.cherche_var(type.nom);
				assert(v!=null);
			}
		}
		else
			return type;
	}*/

	protected Attribut_Complet donne_attribut(NomFeature nom,CIType type)
	{__CLOVER_62_0.cloverRec.M[455]++;
		__CLOVER_62_0.cloverRec.S[5384]++;Table_Symbol table;
		__CLOVER_62_0.cloverRec.S[5385]++;Attribut_Complet ac;
		__CLOVER_62_0.cloverRec.S[5386]++;tinyeiffel.ast.Type t,t3;
		__CLOVER_62_0.cloverRec.S[5387]++;CIType t2;
		assert((((nom!=null)) && (++__CLOVER_62_0.cloverRec.CT[1775]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1775]==0&false));
		assert((((type!=null)) && (++__CLOVER_62_0.cloverRec.CT[1776]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1776]==0&false));
		//t2=trouve_vrai_type(type);
		//assert(t2!=null);
		__CLOVER_62_0.cloverRec.S[5388]++;t=convertie_type2(type);
		assert((((t!=null)) && (++__CLOVER_62_0.cloverRec.CT[1777]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1777]==0&false));
		__CLOVER_62_0.cloverRec.S[5389]++;t3=compiler.env.table.trouve_vrai_type(t);
		assert((((t3!=null)) && (++__CLOVER_62_0.cloverRec.CT[1778]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1778]==0&false));
		assert((((!t3.is_like)) && (++__CLOVER_62_0.cloverRec.CT[1779]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1779]==0&false));
		__CLOVER_62_0.cloverRec.S[5390]++;table=context.donne_table_symbol(t3);
		assert((((table!=null)) && (++__CLOVER_62_0.cloverRec.CT[1780]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1780]==0&false));
		__CLOVER_62_0.cloverRec.S[5391]++;ac=table.donne_attribut(nom);
		__CLOVER_62_0.cloverRec.S[5392]++;return ac;
	}

	protected tinyeiffel.ast.Type convertie_type2(CIType type)
	{__CLOVER_62_0.cloverRec.M[456]++;
		__CLOVER_62_0.cloverRec.S[5393]++;Vector gen=new Vector();
		__CLOVER_62_0.cloverRec.S[5394]++;int i;
		__CLOVER_62_0.cloverRec.S[5395]++;tinyeiffel.ast.Type res;
		assert((((type!=null)) && (++__CLOVER_62_0.cloverRec.CT[1781]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1781]==0&false));
		__CLOVER_62_0.cloverRec.S[5396]++;if((((type.is_like) && (++__CLOVER_62_0.cloverRec.CT[1782]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1782]==0&false)))
		{{
			__CLOVER_62_0.cloverRec.S[5397]++;res=new tinyeiffel.ast.TypeAncre(
					new tinyeiffel.ast.Expr_Var(((CITypeAncre)type).nom,
							new Token(-1,-1,"","")));
		}
		}else
		{{
			__CLOVER_62_0.cloverRec.S[5398]++;CITypeSimple type2=(CITypeSimple)type;
			__CLOVER_62_0.cloverRec.S[5399]++;if((((type2.generique!=null) && (++__CLOVER_62_0.cloverRec.CT[1783]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1783]==0&false)))
			{{
				__CLOVER_62_0.cloverRec.S[5400]++;for(i=0;(((i<type2.generique.length) && (++__CLOVER_62_0.cloverRec.CT[1784]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1784]==0&false));i++)
				{{
					__CLOVER_62_0.cloverRec.S[5401]++;gen.addElement(convertie_type2(type2.generique[i]));
				}
			}}
			}__CLOVER_62_0.cloverRec.S[5402]++;res=new tinyeiffel.ast.TypeSimple(type2.expanded,type2.nom,gen);
		}
		}__CLOVER_62_0.cloverRec.S[5403]++;return res;
	}

	protected boolean est_routine(NomFeature nom,CIType type)
	{__CLOVER_62_0.cloverRec.M[457]++;
		__CLOVER_62_0.cloverRec.S[5404]++;Table_Symbol table;
		__CLOVER_62_0.cloverRec.S[5405]++;Attribut_Complet ac;
		__CLOVER_62_0.cloverRec.S[5406]++;boolean res=false;
		assert((((nom!=null)) && (++__CLOVER_62_0.cloverRec.CT[1785]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1785]==0&false));
		assert((((type!=null)) && (++__CLOVER_62_0.cloverRec.CT[1786]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1786]==0&false));
		//assert(!nom.equalsIgnoreCase("f3"));
		__CLOVER_62_0.cloverRec.S[5407]++;ac=donne_attribut(nom,type);
		//assert(!nom.equalsIgnoreCase("f3"));
		__CLOVER_62_0.cloverRec.S[5408]++;if((((ac==null) && (++__CLOVER_62_0.cloverRec.CT[1787]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1787]==0&false)))
			{__CLOVER_62_0.cloverRec.S[5409]++;res=false;
		//assert(!nom.equalsIgnoreCase("f3"));
		}__CLOVER_62_0.cloverRec.S[5410]++;if((((res!=true&&ac!=null) && (++__CLOVER_62_0.cloverRec.CT[1788]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1788]==0&false)))
		{{
			__CLOVER_62_0.cloverRec.S[5411]++;res=ac.getFeature().est_routine();
			//assert(!nom.equalsIgnoreCase("f3")):"f3="+nom+";"+res+
			//		";ac="+ac+";type="+
			//		(ac.getFeature() instanceof FeatureRoutine);
		}
		//assert(!nom.equalsIgnoreCase("f3")):"f3="+nom+";"+res+";ac="+ac;
		}__CLOVER_62_0.cloverRec.S[5412]++;return res;
	}

	protected CIDeclare_Var donne_attr(NomFeature nom,CIType type)
	{__CLOVER_62_0.cloverRec.M[458]++;// TODO: mettre le num\u00e9ro de ligne pour la variable
		__CLOVER_62_0.cloverRec.S[5413]++;Table_Symbol table;
		__CLOVER_62_0.cloverRec.S[5414]++;Attribut_Complet ac;
		assert((((nom!=null)) && (++__CLOVER_62_0.cloverRec.CT[1789]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1789]==0&false));
		assert((((type!=null)) && (++__CLOVER_62_0.cloverRec.CT[1790]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1790]==0&false));
		__CLOVER_62_0.cloverRec.S[5415]++;ac=donne_attribut(nom,type);
		__CLOVER_62_0.cloverRec.S[5416]++;if((((ac==null) && (++__CLOVER_62_0.cloverRec.CT[1791]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1791]==0&false)))
		{{
			// TODO: voir pour un type ancr\u00e9
			__CLOVER_62_0.cloverRec.S[5417]++;table=context.donne_table_symbol(new tinyeiffel.ast.TypeSimple(false,((CITypeSimple)type).nom,new Vector()));
			assert((((table!=null)) && (++__CLOVER_62_0.cloverRec.CT[1792]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1792]==0&false));
			__CLOVER_62_0.cloverRec.S[5418]++;ac=table.donne_attribut(nom);
			__CLOVER_62_0.cloverRec.S[5419]++;if((((ac==null) && (++__CLOVER_62_0.cloverRec.CT[1793]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1793]==0&false)))
			{{
				__CLOVER_62_0.cloverRec.S[5420]++;Declare_entite entite;
				__CLOVER_62_0.cloverRec.S[5421]++;entite=compiler.env.donne_entite(nom.nom);
				__CLOVER_62_0.cloverRec.S[5422]++;if((((entite!=null) && (++__CLOVER_62_0.cloverRec.CT[1794]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1794]==0&false)))
					{__CLOVER_62_0.cloverRec.S[5423]++;return new CIDeclare_Var(entite.getNom(),
							convertie_type(entite.getType()),null);
				}else
					{__CLOVER_62_0.cloverRec.S[5424]++;return null;
			}}
		}}
		}__CLOVER_62_0.cloverRec.S[5425]++;if((((ac.getType()!=null) && (++__CLOVER_62_0.cloverRec.CT[1795]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1795]==0&false)))
			{__CLOVER_62_0.cloverRec.S[5426]++;return new CIDeclare_Var(ac.nom.nom,convertie_type(ac.getType()),null);
		}else
			{__CLOVER_62_0.cloverRec.S[5427]++;return new CIDeclare_Var(ac.nom.nom,null,null);
	}}

	protected void ajoute_test(CIListe_Var liste,String suite,
								Vector v,tinyeiffel.ast.Expr expr,boolean inv)
	{__CLOVER_62_0.cloverRec.M[459]++;
		__CLOVER_62_0.cloverRec.S[5428]++;CIResult_Expr res,r1;
		__CLOVER_62_0.cloverRec.S[5429]++;CIDeclare_Var v1,v2;
		__CLOVER_62_0.cloverRec.S[5430]++;CIExpr_Scalaire es;
		__CLOVER_62_0.cloverRec.S[5431]++;CIExpr e,e2;
		__CLOVER_62_0.cloverRec.S[5432]++;CIInstruction instruction;
		assert((((liste!=null)) && (++__CLOVER_62_0.cloverRec.CT[1796]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1796]==0&false));
		assert((((expr!=null)) && (++__CLOVER_62_0.cloverRec.CT[1797]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1797]==0&false));
		assert((((suite!=null)) && (++__CLOVER_62_0.cloverRec.CT[1798]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1798]==0&false));
		assert((((v!=null)) && (++__CLOVER_62_0.cloverRec.CT[1799]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1799]==0&false));
		__CLOVER_62_0.cloverRec.S[5433]++;res=convertie_expr(liste,expr);
		__CLOVER_62_0.cloverRec.S[5434]++;if((((res!=null) && (++__CLOVER_62_0.cloverRec.CT[1800]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1800]==0&false)))
		{{
		__CLOVER_62_0.cloverRec.S[5435]++;if((((res.a_instr()) && (++__CLOVER_62_0.cloverRec.CT[1801]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1801]==0&false)))
		{{
			__CLOVER_62_0.cloverRec.S[5436]++;v.addAll(res.instr);
		}
		}__CLOVER_62_0.cloverRec.S[5437]++;if((((inv) && (++__CLOVER_62_0.cloverRec.CT[1802]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1802]==0&false)))
		{{
			//v1=r.ajoute_var_local(temp("tmp"),res.expr.type);
			__CLOVER_62_0.cloverRec.S[5438]++;v1=liste.ajoute(temp("tmp"),res.expr.type);
			// simplifier res en es
			__CLOVER_62_0.cloverRec.S[5439]++;r1=convertie_scalaire(liste,res.expr);
			__CLOVER_62_0.cloverRec.S[5440]++;es=(CIExpr_Scalaire)r1.expr;
			__CLOVER_62_0.cloverRec.S[5441]++;v.addAll(r1.instr);
			__CLOVER_62_0.cloverRec.S[5442]++;e=new CIExpr_Unaire(CIExpr_Unaire.Not,es,null);
			__CLOVER_62_0.cloverRec.S[5443]++;instruction=new CIInstruction_Affect(convertie_expr(v1),e,null);
			__CLOVER_62_0.cloverRec.S[5444]++;v.addElement(instruction);
			__CLOVER_62_0.cloverRec.S[5445]++;e2=convertie_expr(v1);
		}
		}else
		{{
			__CLOVER_62_0.cloverRec.S[5446]++;e2=res.expr;
		}
		//l1=temp("label");
		}__CLOVER_62_0.cloverRec.S[5447]++;instruction=new CIInstruction_Si(e2,suite,null);
		__CLOVER_62_0.cloverRec.S[5448]++;v.addElement(instruction);
		// if
		//ajoute_instr(v,r.classe,r,liste);
		//l2=temp("fin");
		//instruction=new Instruction_Goto(fin);
		//v.addElement(instruction);
		//instruction=new Instruction_Label(l1);
		//v.addElement(instruction);
		//ins=ei.getSuivant();
		}
		}else
		{{
			//ins=null;
		}
	}}

	protected void ajoute_test(CIListe_Var liste,String suite,
								Vector v,CIExpr expr,boolean inv)
	{__CLOVER_62_0.cloverRec.M[460]++;
		__CLOVER_62_0.cloverRec.S[5449]++;CIResult_Expr res,r1;
		__CLOVER_62_0.cloverRec.S[5450]++;CIDeclare_Var v1,v2;
		__CLOVER_62_0.cloverRec.S[5451]++;CIExpr_Scalaire es;
		__CLOVER_62_0.cloverRec.S[5452]++;CIExpr e,e2;
		__CLOVER_62_0.cloverRec.S[5453]++;CIInstruction instruction;
		assert((((liste!=null)) && (++__CLOVER_62_0.cloverRec.CT[1803]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1803]==0&false));
		assert((((expr!=null)) && (++__CLOVER_62_0.cloverRec.CT[1804]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1804]==0&false));
		assert((((suite!=null)) && (++__CLOVER_62_0.cloverRec.CT[1805]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1805]==0&false));
		assert((((v!=null)) && (++__CLOVER_62_0.cloverRec.CT[1806]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1806]==0&false));
		__CLOVER_62_0.cloverRec.S[5454]++;if((((inv) && (++__CLOVER_62_0.cloverRec.CT[1807]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1807]==0&false)))
		{{
			//v1=r.ajoute_var_local(temp("tmp"),expr.type);
			__CLOVER_62_0.cloverRec.S[5455]++;v1=liste.ajoute(temp("tmp"),expr.type);
			// simplifier res en es
			__CLOVER_62_0.cloverRec.S[5456]++;r1=convertie_scalaire(liste,expr);
			__CLOVER_62_0.cloverRec.S[5457]++;es=(CIExpr_Scalaire)r1.expr;
			__CLOVER_62_0.cloverRec.S[5458]++;v.addAll(r1.instr);
			__CLOVER_62_0.cloverRec.S[5459]++;e=new CIExpr_Unaire(CIExpr_Unaire.Not,es,null);
			__CLOVER_62_0.cloverRec.S[5460]++;instruction=new CIInstruction_Affect(convertie_expr(v1),e,null);
			__CLOVER_62_0.cloverRec.S[5461]++;v.addElement(instruction);
			__CLOVER_62_0.cloverRec.S[5462]++;e2=convertie_expr(v1);
		}
		}else
		{{
			__CLOVER_62_0.cloverRec.S[5463]++;e2=expr;
		}
		//l1=temp("label");
		}__CLOVER_62_0.cloverRec.S[5464]++;instruction=new CIInstruction_Si(e2,suite,null);
		__CLOVER_62_0.cloverRec.S[5465]++;v.addElement(instruction);
	}

	protected void ajoute_if(CIRoutine r,tinyeiffel.ast.Expr expr,
								Instr liste[],String suite,
								String fin,Vector v)
	{__CLOVER_62_0.cloverRec.M[461]++;// a effacer en remplacant par ajoute_test
		__CLOVER_62_0.cloverRec.S[5466]++;CIResult_Expr res,r1;
		__CLOVER_62_0.cloverRec.S[5467]++;CIDeclare_Var v1,v2;
		__CLOVER_62_0.cloverRec.S[5468]++;CIExpr_Scalaire es;
		__CLOVER_62_0.cloverRec.S[5469]++;CIExpr e;
		__CLOVER_62_0.cloverRec.S[5470]++;CIInstruction instruction;
		assert((((r!=null)) && (++__CLOVER_62_0.cloverRec.CT[1808]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1808]==0&false));
		assert((((expr!=null)) && (++__CLOVER_62_0.cloverRec.CT[1809]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1809]==0&false));
		assert((((liste!=null)) && (++__CLOVER_62_0.cloverRec.CT[1810]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1810]==0&false));
		assert((((suite!=null)) && (++__CLOVER_62_0.cloverRec.CT[1811]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1811]==0&false));
		assert((((fin!=null)) && (++__CLOVER_62_0.cloverRec.CT[1812]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1812]==0&false));
		assert((((v!=null)) && (++__CLOVER_62_0.cloverRec.CT[1813]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1813]==0&false));
		__CLOVER_62_0.cloverRec.S[5471]++;res=convertie_expr(r.local,expr);
		__CLOVER_62_0.cloverRec.S[5472]++;if((((res!=null) && (++__CLOVER_62_0.cloverRec.CT[1814]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1814]==0&false)))
		{{
		__CLOVER_62_0.cloverRec.S[5473]++;if((((res.a_instr()) && (++__CLOVER_62_0.cloverRec.CT[1815]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1815]==0&false)))
		{{
			__CLOVER_62_0.cloverRec.S[5474]++;v.addAll(res.instr);
		}
		}__CLOVER_62_0.cloverRec.S[5475]++;v1=r.ajoute_var_local(temp("tmp"),res.expr.type);
		// simplifier res en es
		__CLOVER_62_0.cloverRec.S[5476]++;r1=convertie_scalaire(r.local,res.expr);
		__CLOVER_62_0.cloverRec.S[5477]++;es=(CIExpr_Scalaire)r1.expr;
		__CLOVER_62_0.cloverRec.S[5478]++;v.addAll(r1.instr);
		__CLOVER_62_0.cloverRec.S[5479]++;e=new CIExpr_Unaire(CIExpr_Unaire.Not,es,null);
		__CLOVER_62_0.cloverRec.S[5480]++;instruction=new CIInstruction_Affect(convertie_expr(v1),e,null);
		__CLOVER_62_0.cloverRec.S[5481]++;v.addElement(instruction);
		//l1=temp("label");
		__CLOVER_62_0.cloverRec.S[5482]++;instruction=new CIInstruction_Si(convertie_expr(v1),suite,null);
		__CLOVER_62_0.cloverRec.S[5483]++;v.addElement(instruction);
		// if
		__CLOVER_62_0.cloverRec.S[5484]++;ajoute_instr(v,r.classe,r,liste);
		//l2=temp("fin");
		__CLOVER_62_0.cloverRec.S[5485]++;instruction=new CIInstruction_Goto(fin,null);
		__CLOVER_62_0.cloverRec.S[5486]++;v.addElement(instruction);
		//instruction=new Instruction_Label(l1);
		//v.addElement(instruction);
		//ins=ei.getSuivant();
		}
		}else
		{{
			//ins=null;
		}
	}}

	protected void ajoute_instr(Vector v,CIClasse cl,
								CIRoutine r,Instr liste[])
	{__CLOVER_62_0.cloverRec.M[462]++;
		__CLOVER_62_0.cloverRec.S[5487]++;CIInstruction linstr2[];
		__CLOVER_62_0.cloverRec.S[5488]++;int j;
		assert((((v!=null)) && (++__CLOVER_62_0.cloverRec.CT[1816]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1816]==0&false));
		assert((((cl!=null)) && (++__CLOVER_62_0.cloverRec.CT[1817]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1817]==0&false));
		assert((((r!=null)) && (++__CLOVER_62_0.cloverRec.CT[1818]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1818]==0&false));
		assert((((liste!=null)) && (++__CLOVER_62_0.cloverRec.CT[1819]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1819]==0&false));
		__CLOVER_62_0.cloverRec.S[5489]++;linstr2=convertie_instr(cl,r,liste);
		__CLOVER_62_0.cloverRec.S[5490]++;if((((linstr2!=null) && (++__CLOVER_62_0.cloverRec.CT[1820]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1820]==0&false)))
		{{
			__CLOVER_62_0.cloverRec.S[5491]++;for(j=0;(((j<linstr2.length) && (++__CLOVER_62_0.cloverRec.CT[1821]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1821]==0&false));j++)
			{{
				__CLOVER_62_0.cloverRec.S[5492]++;v.addElement(linstr2[j]);
			}
		}}
	}}

	protected CIResult_Expr convertie_scalaire(CIListe_Var liste,CIExpr expr)
	{__CLOVER_62_0.cloverRec.M[463]++;
		__CLOVER_62_0.cloverRec.S[5493]++;CIResult_Expr res;
		__CLOVER_62_0.cloverRec.S[5494]++;Vector v=new Vector();
		__CLOVER_62_0.cloverRec.S[5495]++;CIExpr_Scalaire es;
		__CLOVER_62_0.cloverRec.S[5496]++;CIDeclare_Var v2;
		__CLOVER_62_0.cloverRec.S[5497]++;CIInstruction instruction;
		assert((((expr!=null)) && (++__CLOVER_62_0.cloverRec.CT[1822]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1822]==0&false));
		assert((((liste!=null)) && (++__CLOVER_62_0.cloverRec.CT[1823]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1823]==0&false));
		__CLOVER_62_0.cloverRec.S[5498]++;if((((expr instanceof CIExpr_Scalaire) && (++__CLOVER_62_0.cloverRec.CT[1824]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1824]==0&false)))
		{{
			__CLOVER_62_0.cloverRec.S[5499]++;es=(CIExpr_Scalaire)expr;
		}
		}else
		{{
			//v2=r.ajoute_var_local(temp("tmp"),expr.type);
			__CLOVER_62_0.cloverRec.S[5500]++;v2=liste.ajoute(temp("tmp"),expr.type);
			__CLOVER_62_0.cloverRec.S[5501]++;es=convertie_expr(v2);
			__CLOVER_62_0.cloverRec.S[5502]++;instruction=new CIInstruction_Affect((CIExpr_Var)es,expr,null);
			__CLOVER_62_0.cloverRec.S[5503]++;v.addElement(instruction);
		}
		}__CLOVER_62_0.cloverRec.S[5504]++;res=new CIResult_Expr(v,es);
		__CLOVER_62_0.cloverRec.S[5505]++;return res;
	}

	protected CIExpr_Var convertie_expr(CIDeclare_Var v)
	{__CLOVER_62_0.cloverRec.M[464]++;
		__CLOVER_62_0.cloverRec.S[5506]++;CIExpr_Var res;
		assert((((v!=null)) && (++__CLOVER_62_0.cloverRec.CT[1825]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1825]==0&false));
		__CLOVER_62_0.cloverRec.S[5507]++;res=new CIExpr_Var(v.nom,v.source);
		__CLOVER_62_0.cloverRec.S[5508]++;res.type=v.type;
		__CLOVER_62_0.cloverRec.S[5509]++;return res;
	}

	protected String temp(String nom)
	{__CLOVER_62_0.cloverRec.M[465]++;
		__CLOVER_62_0.cloverRec.S[5510]++;String res;
		__CLOVER_62_0.cloverRec.S[5511]++;if((((nom==null) && (++__CLOVER_62_0.cloverRec.CT[1826]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1826]==0&false)))
			{__CLOVER_62_0.cloverRec.S[5512]++;nom="temp";
		}__CLOVER_62_0.cloverRec.S[5513]++;res=nom+no_temp0;
		__CLOVER_62_0.cloverRec.S[5514]++;no_temp0++;
		__CLOVER_62_0.cloverRec.S[5515]++;return res;
	}
	
	protected int no_temp0;

	protected String temp_global(String nom)
	{__CLOVER_62_0.cloverRec.M[466]++;
		__CLOVER_62_0.cloverRec.S[5516]++;String res;
		__CLOVER_62_0.cloverRec.S[5517]++;if((((nom==null) && (++__CLOVER_62_0.cloverRec.CT[1827]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1827]==0&false)))
			{__CLOVER_62_0.cloverRec.S[5518]++;nom="_global_temp";
		}__CLOVER_62_0.cloverRec.S[5519]++;res=nom+no_temp0;
		__CLOVER_62_0.cloverRec.S[5520]++;no_temp_global0++;
		__CLOVER_62_0.cloverRec.S[5521]++;return res;
	}
	
	protected int no_temp_global0;

	protected CIResult_Expr convertie_expr(CIListe_Var liste,tinyeiffel.ast.Expr e)
	{__CLOVER_62_0.cloverRec.M[467]++;
		__CLOVER_62_0.cloverRec.S[5522]++;CIResult_Expr res=null;
		__CLOVER_62_0.cloverRec.S[5523]++;CIExpr exp;
		assert((((liste!=null)) && (++__CLOVER_62_0.cloverRec.CT[1828]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1828]==0&false));
		assert((((e!=null)) && (++__CLOVER_62_0.cloverRec.CT[1829]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1829]==0&false));
		__CLOVER_62_0.cloverRec.S[5524]++;if((((e instanceof tinyeiffel.ast.Expr_Var) && (++__CLOVER_62_0.cloverRec.CT[1830]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1830]==0&false)))
		{{
			__CLOVER_62_0.cloverRec.S[5525]++;tinyeiffel.ast.Expr_Var ex=(tinyeiffel.ast.Expr_Var)e;
			__CLOVER_62_0.cloverRec.S[5526]++;tinyeiffel.ast.Type type;
			__CLOVER_62_0.cloverRec.S[5527]++;CIDeclare_Var v;
			__CLOVER_62_0.cloverRec.S[5528]++;Declare_entite entite;
			__CLOVER_62_0.cloverRec.S[5529]++;exp=new CIExpr_Var(ex.nom,convertie_source(ex.debut())); 
			__CLOVER_62_0.cloverRec.S[5530]++;res=new CIResult_Expr(new Vector(),exp);
			//v=r.cherche_var(ex.nom);
			//assert(v!=null):"nom="+ex.nom;
			//exp.type=v.type;
			__CLOVER_62_0.cloverRec.S[5531]++;entite=compiler.env.donne_entite(ex.nom);
			//assert(entite!=null):"nom="+ex.nom;
			__CLOVER_62_0.cloverRec.S[5532]++;if((((entite!=null) && (++__CLOVER_62_0.cloverRec.CT[1831]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1831]==0&false)))
			{{
				__CLOVER_62_0.cloverRec.S[5533]++;exp.type=convertie_type(entite.getType());
			}
			}else
			{{
				//v=r.cherche_var(ex.nom);
				__CLOVER_62_0.cloverRec.S[5534]++;v=liste.donne_var(ex.nom);
				assert((((v!=null)) && (++__CLOVER_62_0.cloverRec.CT[1832]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1832]==0&false)):"nom="+ex.nom;
				__CLOVER_62_0.cloverRec.S[5535]++;exp.type=v.type;
			}
		}}
		}else {__CLOVER_62_0.cloverRec.S[5536]++;if((((e instanceof tinyeiffel.ast.Expr_Vrai||
				e instanceof tinyeiffel.ast.Expr_Faux||
				e instanceof tinyeiffel.ast.Expr_Entier||
				e instanceof tinyeiffel.ast.Expr_Chaine||
				e instanceof tinyeiffel.ast.Expr_Reel||
				e instanceof tinyeiffel.ast.Expr_Car) && (++__CLOVER_62_0.cloverRec.CT[1833]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1833]==0&false)))
		{{
			__CLOVER_62_0.cloverRec.S[5537]++;exp=convertie_expr_simple(e);
			__CLOVER_62_0.cloverRec.S[5538]++;res=new CIResult_Expr(new Vector(),exp);
		}
		}else {__CLOVER_62_0.cloverRec.S[5539]++;if((((e instanceof tinyeiffel.ast.Expr_Appel) && (++__CLOVER_62_0.cloverRec.CT[1834]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1834]==0&false)))
		{{
			__CLOVER_62_0.cloverRec.S[5540]++;CIAttribut attr;
			__CLOVER_62_0.cloverRec.S[5541]++;CIDeclare_Var var,var2,var3;//&\u00e9"'(-\u00e8
			__CLOVER_62_0.cloverRec.S[5542]++;Feature f;
			__CLOVER_62_0.cloverRec.S[5543]++;Attribut_Complet ac;
			__CLOVER_62_0.cloverRec.S[5544]++;CIType type;
			__CLOVER_62_0.cloverRec.S[5545]++;NomFeature nf;
			__CLOVER_62_0.cloverRec.S[5546]++;tinyeiffel.ast.Expr_Appel ex=(tinyeiffel.ast.Expr_Appel)e;
			__CLOVER_62_0.cloverRec.S[5547]++;Vector v=new Vector();
			__CLOVER_62_0.cloverRec.S[5548]++;type=convertie_type(compiler.env.classe.type);
			__CLOVER_62_0.cloverRec.S[5549]++;nf=new NomFeature(ex.nom);
			__CLOVER_62_0.cloverRec.S[5550]++;var2=donne_attr(nf,type/*ac.getType().nom*/);
			//if(ac!=null&&ac.getFeature().est_routine())
			__CLOVER_62_0.cloverRec.S[5551]++;if((((var2!=null&&est_routine(nf,type)) && (++__CLOVER_62_0.cloverRec.CT[1835]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1835]==0&false)))
			{{
				__CLOVER_62_0.cloverRec.S[5552]++;tinyeiffel.ast.Expr param[];
				__CLOVER_62_0.cloverRec.S[5553]++;if((((ex.parametre==null) && (++__CLOVER_62_0.cloverRec.CT[1836]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1836]==0&false)))
					{__CLOVER_62_0.cloverRec.S[5554]++;param=null;
				}else
				{{
					__CLOVER_62_0.cloverRec.S[5555]++;param=new tinyeiffel.ast.Expr[ex.parametre.size()];
					__CLOVER_62_0.cloverRec.S[5556]++;ex.parametre.copyInto(param);
				}
				}__CLOVER_62_0.cloverRec.S[5557]++;var=ajoute_routine(liste,new CINom_Attribut(var2.nom,var2.source),
						var2.type,v,null,param);
				assert((((var!=null)) && (++__CLOVER_62_0.cloverRec.CT[1837]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1837]==0&false));
			}
			}else
			{{
				__CLOVER_62_0.cloverRec.S[5558]++;if((((var2==null) && (++__CLOVER_62_0.cloverRec.CT[1838]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1838]==0&false)))
					//var=r.cherche_var_routine(ex.nom);
					{__CLOVER_62_0.cloverRec.S[5559]++;var=liste.donne_var(ex.nom);
				}else
				{{
					__CLOVER_62_0.cloverRec.S[5560]++;var=new CIDeclare_Var(var2.nom,var2.type,var2.source);
				}
				}assert((((var!=null)) && (++__CLOVER_62_0.cloverRec.CT[1839]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1839]==0&false)):"e="+e;
			}
			}__CLOVER_62_0.cloverRec.S[5561]++;exp=new CIExpr_Var(var.nom,var.source);
			__CLOVER_62_0.cloverRec.S[5562]++;exp.type=var.type;
			__CLOVER_62_0.cloverRec.S[5563]++;res=new CIResult_Expr(v,exp);
		}
		}else {__CLOVER_62_0.cloverRec.S[5564]++;if((((e instanceof tinyeiffel.ast.Expr_Binaire) && (++__CLOVER_62_0.cloverRec.CT[1840]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1840]==0&false)))
		{{
			__CLOVER_62_0.cloverRec.S[5565]++;CIAttribut attr;
			__CLOVER_62_0.cloverRec.S[5566]++;CIDeclare_Var var,var2,var3;//&\u00e9"'(-\u00e8
			__CLOVER_62_0.cloverRec.S[5567]++;Feature f;
			__CLOVER_62_0.cloverRec.S[5568]++;Attribut_Complet ac;
			__CLOVER_62_0.cloverRec.S[5569]++;CIType type;
			__CLOVER_62_0.cloverRec.S[5570]++;NomFeature nf;
			__CLOVER_62_0.cloverRec.S[5571]++;tinyeiffel.ast.Expr_Binaire ex=(tinyeiffel.ast.Expr_Binaire)e;
			__CLOVER_62_0.cloverRec.S[5572]++;Vector v=new Vector();
			__CLOVER_62_0.cloverRec.S[5573]++;CIExpr_Var cible;
			__CLOVER_62_0.cloverRec.S[5574]++;CIResult_Expr res2,res3,res4;
			__CLOVER_62_0.cloverRec.S[5575]++;if((((ex.op==tinyeiffel.ast.Expr.Egal||ex.op==tinyeiffel.ast.Expr.Diff) && (++__CLOVER_62_0.cloverRec.CT[1841]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1841]==0&false)))
			{{// operation = et /=
				__CLOVER_62_0.cloverRec.S[5576]++;int op;
				__CLOVER_62_0.cloverRec.S[5577]++;op=((((ex.op==tinyeiffel.ast.Expr.Egal)) && (++__CLOVER_62_0.cloverRec.CT[1842]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1842]==0&false))?CIExpr_Binaire.Egal:CIExpr_Binaire.Diff;
				__CLOVER_62_0.cloverRec.S[5578]++;res2=convertie_expr(liste,ex.expr1);
				//assert(res2!=null);
				__CLOVER_62_0.cloverRec.S[5579]++;if((((res2!=null) && (++__CLOVER_62_0.cloverRec.CT[1843]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1843]==0&false)))
				{{
				__CLOVER_62_0.cloverRec.S[5580]++;if((((res2.a_instr()) && (++__CLOVER_62_0.cloverRec.CT[1844]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1844]==0&false)))
					{__CLOVER_62_0.cloverRec.S[5581]++;v.addAll(res2.instr);
				}__CLOVER_62_0.cloverRec.S[5582]++;res3=convertie_expr(liste,ex.expr2);
				__CLOVER_62_0.cloverRec.S[5583]++;if((((res3!=null) && (++__CLOVER_62_0.cloverRec.CT[1845]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1845]==0&false)))
				{{
				__CLOVER_62_0.cloverRec.S[5584]++;if((((res3.a_instr()) && (++__CLOVER_62_0.cloverRec.CT[1846]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1846]==0&false)))
					{__CLOVER_62_0.cloverRec.S[5585]++;v.addAll(res3.instr);
				}__CLOVER_62_0.cloverRec.S[5586]++;res2=convertie_scalaire(liste,res2.expr);
				__CLOVER_62_0.cloverRec.S[5587]++;if((((res2.a_instr()) && (++__CLOVER_62_0.cloverRec.CT[1847]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1847]==0&false)))
					{__CLOVER_62_0.cloverRec.S[5588]++;v.addAll(res2.instr);
				}__CLOVER_62_0.cloverRec.S[5589]++;res3=convertie_scalaire(liste,res3.expr);
				__CLOVER_62_0.cloverRec.S[5590]++;if((((res3.a_instr()) && (++__CLOVER_62_0.cloverRec.CT[1848]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1848]==0&false)))
					{__CLOVER_62_0.cloverRec.S[5591]++;v.addAll(res3.instr);
				}__CLOVER_62_0.cloverRec.S[5592]++;exp=new CIExpr_Binaire(op,(CIExpr_Scalaire)res2.expr,
						(CIExpr_Scalaire)res3.expr,
						convertie_source(ex.debut()));
				__CLOVER_62_0.cloverRec.S[5593]++;exp.type=new CITypeSimple(false,"BOOLEAN",null,null);
				__CLOVER_62_0.cloverRec.S[5594]++;res=new CIResult_Expr(v,exp);
				}
				}}
			}}
			}else {__CLOVER_62_0.cloverRec.S[5595]++;if((((ex.op==tinyeiffel.ast.Expr.And_Then||ex.op==tinyeiffel.ast.Expr.Or_Else) && (++__CLOVER_62_0.cloverRec.CT[1849]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1849]==0&false)))
			{{// operation and then et or else
				__CLOVER_62_0.cloverRec.S[5596]++;int op;
				__CLOVER_62_0.cloverRec.S[5597]++;boolean type_op;
				__CLOVER_62_0.cloverRec.S[5598]++;String suite1,fin;
				__CLOVER_62_0.cloverRec.S[5599]++;CIExpr exp2;
				__CLOVER_62_0.cloverRec.S[5600]++;CIExpr_Var v1,v2;
				__CLOVER_62_0.cloverRec.S[5601]++;type_op=ex.op==tinyeiffel.ast.Expr.And_Then;
				__CLOVER_62_0.cloverRec.S[5602]++;op=((((type_op)) && (++__CLOVER_62_0.cloverRec.CT[1850]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1850]==0&false))?CIExpr_Binaire.And:CIExpr_Binaire.Or;
				__CLOVER_62_0.cloverRec.S[5603]++;suite1=temp("label");
				__CLOVER_62_0.cloverRec.S[5604]++;fin=temp("label");
				//var2=r.ajoute_var_local(temp("var"),new Type(false,"BOOLEAN",null));
				__CLOVER_62_0.cloverRec.S[5605]++;var2=liste.ajoute(temp("var"),new CITypeSimple(false,"BOOLEAN",null,null));
				__CLOVER_62_0.cloverRec.S[5606]++;ajoute_test(liste,suite1,v,ex.expr1,type_op);
				__CLOVER_62_0.cloverRec.S[5607]++;exp=null;
				__CLOVER_62_0.cloverRec.S[5608]++;res3=convertie_expr(liste,ex.expr2);
				__CLOVER_62_0.cloverRec.S[5609]++;if((((res3!=null) && (++__CLOVER_62_0.cloverRec.CT[1851]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1851]==0&false)))
				{{
				__CLOVER_62_0.cloverRec.S[5610]++;if((((res3.a_instr()) && (++__CLOVER_62_0.cloverRec.CT[1852]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1852]==0&false)))
					{__CLOVER_62_0.cloverRec.S[5611]++;v.addAll(res3.instr);
				}__CLOVER_62_0.cloverRec.S[5612]++;res3=convertie_scalaire(liste,res3.expr);
				__CLOVER_62_0.cloverRec.S[5613]++;if((((res3.a_instr()) && (++__CLOVER_62_0.cloverRec.CT[1853]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1853]==0&false)))
					{__CLOVER_62_0.cloverRec.S[5614]++;v.addAll(res3.instr);
				}__CLOVER_62_0.cloverRec.S[5615]++;exp2=new CIExpr_Binaire(op,
						(CIExpr_Scalaire)new CIExpr_Var(var2.nom,var2.source),
						(CIExpr_Scalaire)res3.expr,
						null);
				__CLOVER_62_0.cloverRec.S[5616]++;exp2.type=new CITypeSimple(false,"BOOLEAN",null,null);
				__CLOVER_62_0.cloverRec.S[5617]++;v1=new CIExpr_Var(var2.nom,null);
				__CLOVER_62_0.cloverRec.S[5618]++;v.addElement(new CIInstruction_Affect(v1,exp2,null));
				// TODO : c'est pas plutot une instruction si
				__CLOVER_62_0.cloverRec.S[5619]++;v.addElement(new CIInstruction_Goto(fin,null));
				}
				}__CLOVER_62_0.cloverRec.S[5620]++;v.addElement(new CIInstruction_Label(suite1,null));
				__CLOVER_62_0.cloverRec.S[5621]++;exp2=new CIExpr_Bool(!type_op,null);
				__CLOVER_62_0.cloverRec.S[5622]++;exp2.type=new CITypeSimple(false,"BOOLEAN",null,null);
				__CLOVER_62_0.cloverRec.S[5623]++;v1=new CIExpr_Var(var2.nom,null);
				__CLOVER_62_0.cloverRec.S[5624]++;v.addElement(new CIInstruction_Affect(v1,exp2,null));
				__CLOVER_62_0.cloverRec.S[5625]++;v.addElement(new CIInstruction_Label(fin,null));
				__CLOVER_62_0.cloverRec.S[5626]++;exp=new CIExpr_Var(var2.nom,null);
				__CLOVER_62_0.cloverRec.S[5627]++;exp.type=new CITypeSimple(false,"BOOLEAN",null,null);
				__CLOVER_62_0.cloverRec.S[5628]++;res=new CIResult_Expr(v,exp);
				//}
			}
			}else {__CLOVER_62_0.cloverRec.S[5629]++;if((((ex.op==tinyeiffel.ast.Expr.Point) && (++__CLOVER_62_0.cloverRec.CT[1854]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1854]==0&false)))
			{{// operation point
				__CLOVER_62_0.cloverRec.S[5630]++;tinyeiffel.ast.Expr param[];
				__CLOVER_62_0.cloverRec.S[5631]++;res2=convertie_expr(liste,ex.expr1);
				__CLOVER_62_0.cloverRec.S[5632]++;if((((res2!=null) && (++__CLOVER_62_0.cloverRec.CT[1855]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1855]==0&false)))
				{{
				__CLOVER_62_0.cloverRec.S[5633]++;if((((res2.a_instr()) && (++__CLOVER_62_0.cloverRec.CT[1856]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1856]==0&false)))
					{__CLOVER_62_0.cloverRec.S[5634]++;v.addAll(res2.instr);
				}__CLOVER_62_0.cloverRec.S[5635]++;type=res2.expr.type;
				assert((((type!=null)) && (++__CLOVER_62_0.cloverRec.CT[1857]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1857]==0&false));
				__CLOVER_62_0.cloverRec.S[5636]++;if((((res2.expr instanceof CIExpr_Var) && (++__CLOVER_62_0.cloverRec.CT[1858]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1858]==0&false)))
				{{
					__CLOVER_62_0.cloverRec.S[5637]++;cible=(CIExpr_Var)res2.expr;
				}
				}else
				{{
					__CLOVER_62_0.cloverRec.S[5638]++;CIDeclare_Var v2;
					__CLOVER_62_0.cloverRec.S[5639]++;CIExpr_Var es;
					__CLOVER_62_0.cloverRec.S[5640]++;CIInstruction instruction;
					//v2=r.ajoute_var_local(temp("tmp"),res2.expr.type);
					__CLOVER_62_0.cloverRec.S[5641]++;v2=liste.ajoute(temp("tmp"),res2.expr.type);
					__CLOVER_62_0.cloverRec.S[5642]++;es=convertie_expr(v2);
					__CLOVER_62_0.cloverRec.S[5643]++;instruction=new CIInstruction_Affect((CIExpr_Var)es,
							res2.expr,null);
					__CLOVER_62_0.cloverRec.S[5644]++;v.addElement(instruction);
					__CLOVER_62_0.cloverRec.S[5645]++;cible=es;
				}
				}assert((((ex.expr2 instanceof tinyeiffel.ast.Expr_Var||
						ex.expr2 instanceof tinyeiffel.ast.Expr_Appel)) && (++__CLOVER_62_0.cloverRec.CT[1859]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1859]==0&false));
				__CLOVER_62_0.cloverRec.S[5646]++;if((((ex.expr2 instanceof tinyeiffel.ast.Expr_Appel) && (++__CLOVER_62_0.cloverRec.CT[1860]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1860]==0&false)))
				{{
					
					__CLOVER_62_0.cloverRec.S[5647]++;tinyeiffel.ast.Expr_Appel ea=(tinyeiffel.ast.Expr_Appel)ex.expr2;
					__CLOVER_62_0.cloverRec.S[5648]++;nf=new NomFeature(ea.nom);
					__CLOVER_62_0.cloverRec.S[5649]++;var2=donne_attr(nf,type);
					__CLOVER_62_0.cloverRec.S[5650]++;if((((ea.parametre==null) && (++__CLOVER_62_0.cloverRec.CT[1861]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1861]==0&false)))
						{__CLOVER_62_0.cloverRec.S[5651]++;param=null;
					}else
					{{
						__CLOVER_62_0.cloverRec.S[5652]++;param=new tinyeiffel.ast.Expr[ea.parametre.size()];
						__CLOVER_62_0.cloverRec.S[5653]++;ea.parametre.copyInto(param);
					}
				}}
				}else
				{{
					__CLOVER_62_0.cloverRec.S[5654]++;tinyeiffel.ast.Expr_Var ev=(tinyeiffel.ast.Expr_Var)ex.expr2;
					__CLOVER_62_0.cloverRec.S[5655]++;param=null;
					__CLOVER_62_0.cloverRec.S[5656]++;nf=new NomFeature(ev.nom);
					__CLOVER_62_0.cloverRec.S[5657]++;var2=donne_attr(nf,type);
				}
				}__CLOVER_62_0.cloverRec.S[5658]++;var=ajoute_routine(liste,new CINom_Attribut(var2.nom,var2.source),
						var2.type,v,cible,param);
				assert((((var!=null)) && (++__CLOVER_62_0.cloverRec.CT[1862]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1862]==0&false));
				__CLOVER_62_0.cloverRec.S[5659]++;exp=new CIExpr_Var(var.nom,var.source);
				__CLOVER_62_0.cloverRec.S[5660]++;exp.type=var.type;
				__CLOVER_62_0.cloverRec.S[5661]++;res=new CIResult_Expr(v,exp);
				}
			}}
			}else
			{{// les autres operations
				//assert(false);
				__CLOVER_62_0.cloverRec.S[5662]++;res2=convertie_expr(liste,ex.expr1);
				//assert(res2!=null);
				__CLOVER_62_0.cloverRec.S[5663]++;if((((res2!=null) && (++__CLOVER_62_0.cloverRec.CT[1863]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1863]==0&false)))
				{{
				__CLOVER_62_0.cloverRec.S[5664]++;if((((res2.a_instr()) && (++__CLOVER_62_0.cloverRec.CT[1864]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1864]==0&false)))
					{__CLOVER_62_0.cloverRec.S[5665]++;v.addAll(res2.instr);
				}__CLOVER_62_0.cloverRec.S[5666]++;type=res2.expr.type;
				__CLOVER_62_0.cloverRec.S[5667]++;nf=ex.donne_nom_feature();
				__CLOVER_62_0.cloverRec.S[5668]++;var2=donne_attr(nf,type/*ac.getType().nom*/);
				//if(ac!=null&&ac.getFeature().est_routine())
				assert((((var2!=null)) && (++__CLOVER_62_0.cloverRec.CT[1865]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1865]==0&false)):"nf="+nf+";type="+type;
				assert((((est_routine(nf,type))) && (++__CLOVER_62_0.cloverRec.CT[1866]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1866]==0&false));
				__CLOVER_62_0.cloverRec.S[5669]++;tinyeiffel.ast.Expr param[];
				//cible=(Expr_Var)convertie_scalaire(r,res2.expr);
				__CLOVER_62_0.cloverRec.S[5670]++;if((((res2.expr instanceof CIExpr_Var) && (++__CLOVER_62_0.cloverRec.CT[1867]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1867]==0&false)))
				{{
					__CLOVER_62_0.cloverRec.S[5671]++;cible=(CIExpr_Var)res2.expr;
				}
				}else
				{{
					__CLOVER_62_0.cloverRec.S[5672]++;CIDeclare_Var v2;
					__CLOVER_62_0.cloverRec.S[5673]++;CIExpr_Var es;
					__CLOVER_62_0.cloverRec.S[5674]++;CIInstruction instruction;
					//v2=r.ajoute_var_local(temp("tmp"),res2.expr.type);
					__CLOVER_62_0.cloverRec.S[5675]++;v2=liste.ajoute(temp("tmp"),res2.expr.type);
					__CLOVER_62_0.cloverRec.S[5676]++;es=convertie_expr(v2);
					__CLOVER_62_0.cloverRec.S[5677]++;instruction=new CIInstruction_Affect((CIExpr_Var)es,
							res2.expr,null);
					__CLOVER_62_0.cloverRec.S[5678]++;v.addElement(instruction);
					__CLOVER_62_0.cloverRec.S[5679]++;cible=es;
				}
				}__CLOVER_62_0.cloverRec.S[5680]++;param=new tinyeiffel.ast.Expr[1];
				__CLOVER_62_0.cloverRec.S[5681]++;param[0]=ex.expr2;
				__CLOVER_62_0.cloverRec.S[5682]++;var=ajoute_routine(liste,convertie_nom_feature(nf),var2.type,v,cible,param);
				assert((((var!=null)) && (++__CLOVER_62_0.cloverRec.CT[1868]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1868]==0&false));
				__CLOVER_62_0.cloverRec.S[5683]++;exp=new CIExpr_Var(var.nom,var.source);
				__CLOVER_62_0.cloverRec.S[5684]++;exp.type=var.type;
				__CLOVER_62_0.cloverRec.S[5685]++;res=new CIResult_Expr(v,exp);
				}
			}}
		}}}}
		}else {__CLOVER_62_0.cloverRec.S[5686]++;if((((e instanceof tinyeiffel.ast.Expr_Unaire) && (++__CLOVER_62_0.cloverRec.CT[1869]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1869]==0&false)))
		{{
			__CLOVER_62_0.cloverRec.S[5687]++;CIAttribut attr;
			__CLOVER_62_0.cloverRec.S[5688]++;CIDeclare_Var var,var2,var3;//&\u00e9"'(-\u00e8
			__CLOVER_62_0.cloverRec.S[5689]++;Feature f;
			__CLOVER_62_0.cloverRec.S[5690]++;Attribut_Complet ac;
			__CLOVER_62_0.cloverRec.S[5691]++;CIType type;
			__CLOVER_62_0.cloverRec.S[5692]++;NomFeature nf;
			__CLOVER_62_0.cloverRec.S[5693]++;tinyeiffel.ast.Expr_Unaire ex=(tinyeiffel.ast.Expr_Unaire)e;
			__CLOVER_62_0.cloverRec.S[5694]++;Vector v=new Vector();
			__CLOVER_62_0.cloverRec.S[5695]++;CIExpr_Var cible;
			__CLOVER_62_0.cloverRec.S[5696]++;CIResult_Expr res2;
			__CLOVER_62_0.cloverRec.S[5697]++;if((((ex.op!=tinyeiffel.ast.Expr.Old) && (++__CLOVER_62_0.cloverRec.CT[1870]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1870]==0&false)))
			{{
				__CLOVER_62_0.cloverRec.S[5698]++;res2=convertie_expr(liste,ex.expr1);
				//assert(res2!=null);
				__CLOVER_62_0.cloverRec.S[5699]++;if((((res2!=null) && (++__CLOVER_62_0.cloverRec.CT[1871]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1871]==0&false)))
				{{
				__CLOVER_62_0.cloverRec.S[5700]++;if((((res2.a_instr()) && (++__CLOVER_62_0.cloverRec.CT[1872]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1872]==0&false)))
					{__CLOVER_62_0.cloverRec.S[5701]++;v.addAll(res2.instr);
				}__CLOVER_62_0.cloverRec.S[5702]++;type=res2.expr.type;
				__CLOVER_62_0.cloverRec.S[5703]++;nf=ex.donne_nom_feature();
				__CLOVER_62_0.cloverRec.S[5704]++;var2=donne_attr(nf,type/*ac.getType().nom*/);
				//if(ac!=null&&ac.getFeature().est_routine())
				assert((((var2!=null)) && (++__CLOVER_62_0.cloverRec.CT[1873]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1873]==0&false)):"nf="+nf+";type="+type;
				assert((((est_routine(nf,type))) && (++__CLOVER_62_0.cloverRec.CT[1874]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1874]==0&false));
				__CLOVER_62_0.cloverRec.S[5705]++;tinyeiffel.ast.Expr param[];
				__CLOVER_62_0.cloverRec.S[5706]++;param=null;
				//cible=(Expr_Var)convertie_scalaire(r,res2.expr);
				__CLOVER_62_0.cloverRec.S[5707]++;if((((res2.expr instanceof CIExpr_Var) && (++__CLOVER_62_0.cloverRec.CT[1875]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1875]==0&false)))
				{{
					__CLOVER_62_0.cloverRec.S[5708]++;cible=(CIExpr_Var)res2.expr;
				}
				}else
				{{
					__CLOVER_62_0.cloverRec.S[5709]++;CIDeclare_Var v2;
					__CLOVER_62_0.cloverRec.S[5710]++;CIExpr_Var es;
					__CLOVER_62_0.cloverRec.S[5711]++;CIInstruction instruction;
					//v2=r.ajoute_var_local(temp("tmp"),res2.expr.type);
					__CLOVER_62_0.cloverRec.S[5712]++;v2=liste.ajoute(temp("tmp"),res2.expr.type);
					__CLOVER_62_0.cloverRec.S[5713]++;es=convertie_expr(v2);
					__CLOVER_62_0.cloverRec.S[5714]++;instruction=new CIInstruction_Affect((CIExpr_Var)es,
							res2.expr,null);
					__CLOVER_62_0.cloverRec.S[5715]++;v.addElement(instruction);
					__CLOVER_62_0.cloverRec.S[5716]++;cible=es;
				}
				}__CLOVER_62_0.cloverRec.S[5717]++;var=ajoute_routine(liste,convertie_nom_feature(nf),var2.type,v,cible,param);
				assert((((var!=null)) && (++__CLOVER_62_0.cloverRec.CT[1876]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1876]==0&false));
				__CLOVER_62_0.cloverRec.S[5718]++;exp=new CIExpr_Var(var.nom,var.source);
				__CLOVER_62_0.cloverRec.S[5719]++;exp.type=var.type;
				__CLOVER_62_0.cloverRec.S[5720]++;res=new CIResult_Expr(v,exp);
				}
			}}
			}else
			{{// operation old
				
			}
		}}
		}else {__CLOVER_62_0.cloverRec.S[5721]++;if((((e instanceof tinyeiffel.ast.Expr_Tableau) && (++__CLOVER_62_0.cloverRec.CT[1877]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1877]==0&false)))
		{{// TODO : a faire
			
		}
		}}}}}}__CLOVER_62_0.cloverRec.S[5722]++;return res;
	}

	protected CIExpr convertie_expr_simple(tinyeiffel.ast.Expr expr)
	{__CLOVER_62_0.cloverRec.M[468]++;
		__CLOVER_62_0.cloverRec.S[5723]++;CIExpr res=null;
		assert((((expr!=null)) && (++__CLOVER_62_0.cloverRec.CT[1878]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1878]==0&false));
		__CLOVER_62_0.cloverRec.S[5724]++;if((((expr instanceof tinyeiffel.ast.Expr_Car) && (++__CLOVER_62_0.cloverRec.CT[1879]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1879]==0&false)))
		{{
			__CLOVER_62_0.cloverRec.S[5725]++;tinyeiffel.ast.Expr_Car car=(tinyeiffel.ast.Expr_Car)expr;
			__CLOVER_62_0.cloverRec.S[5726]++;char c;
			__CLOVER_62_0.cloverRec.S[5727]++;if((((car.car.length()==3) && (++__CLOVER_62_0.cloverRec.CT[1880]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1880]==0&false)))
			{{
				__CLOVER_62_0.cloverRec.S[5728]++;c=car.car.charAt(1);
			}
			}else
			{{
				__CLOVER_62_0.cloverRec.S[5729]++;c=' ';
				assert((((false)) && (++__CLOVER_62_0.cloverRec.CT[1881]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1881]==0&false));
			}
			}__CLOVER_62_0.cloverRec.S[5730]++;res=new CIExpr_Char(c,convertie_source(car.debut()));
			__CLOVER_62_0.cloverRec.S[5731]++;res.type=new CITypeSimple(false,"CHARACTER",null,null);
		}
		}else {__CLOVER_62_0.cloverRec.S[5732]++;if((((expr instanceof tinyeiffel.ast.Expr_Chaine) && (++__CLOVER_62_0.cloverRec.CT[1882]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1882]==0&false)))
		{{
			__CLOVER_62_0.cloverRec.S[5733]++;tinyeiffel.ast.Expr_Chaine ch=(tinyeiffel.ast.Expr_Chaine)expr;
			__CLOVER_62_0.cloverRec.S[5734]++;String s;
			__CLOVER_62_0.cloverRec.S[5735]++;s=ch.toString();
			__CLOVER_62_0.cloverRec.S[5736]++;res=new CIExpr_String(s,convertie_source(ch.debut()));
			__CLOVER_62_0.cloverRec.S[5737]++;res.type=new CITypeSimple(false,"STRING",null,null);
		}
		}else {__CLOVER_62_0.cloverRec.S[5738]++;if((((expr instanceof tinyeiffel.ast.Expr_Entier) && (++__CLOVER_62_0.cloverRec.CT[1883]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1883]==0&false)))
		{{
			__CLOVER_62_0.cloverRec.S[5739]++;tinyeiffel.ast.Expr_Entier e=(tinyeiffel.ast.Expr_Entier)expr;
			__CLOVER_62_0.cloverRec.S[5740]++;int i;
			__CLOVER_62_0.cloverRec.S[5741]++;try {
				__CLOVER_62_0.cloverRec.S[5742]++;i=Integer.parseInt(e.str);
			}
			catch(NumberFormatException ex)
			{
				__CLOVER_62_0.cloverRec.S[5743]++;ex.printStackTrace();
				__CLOVER_62_0.cloverRec.S[5744]++;i=0;
				assert((((false)) && (++__CLOVER_62_0.cloverRec.CT[1884]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1884]==0&false));
			}
			__CLOVER_62_0.cloverRec.S[5745]++;res=new CIExpr_Entier(i,convertie_source(e.debut()));
			__CLOVER_62_0.cloverRec.S[5746]++;res.type=new CITypeSimple(false,"INTEGER",null,null);
		}
		}else {__CLOVER_62_0.cloverRec.S[5747]++;if((((expr instanceof tinyeiffel.ast.Expr_Faux) && (++__CLOVER_62_0.cloverRec.CT[1885]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1885]==0&false)))
		{{
			__CLOVER_62_0.cloverRec.S[5748]++;res=new CIExpr_Bool(false,convertie_source(expr.debut()));
			__CLOVER_62_0.cloverRec.S[5749]++;res.type=new CITypeSimple(false,"BOOLEAN",null,null);
		}
		}else {__CLOVER_62_0.cloverRec.S[5750]++;if((((expr instanceof tinyeiffel.ast.Expr_Vrai) && (++__CLOVER_62_0.cloverRec.CT[1886]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1886]==0&false)))
		{{
			__CLOVER_62_0.cloverRec.S[5751]++;res=new CIExpr_Bool(true,convertie_source(expr.debut()));
			__CLOVER_62_0.cloverRec.S[5752]++;res.type=new CITypeSimple(false,"BOOLEAN",null,null);
		}
		}else {__CLOVER_62_0.cloverRec.S[5753]++;if((((expr instanceof tinyeiffel.ast.Expr_Reel) && (++__CLOVER_62_0.cloverRec.CT[1887]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1887]==0&false)))
		{{
			__CLOVER_62_0.cloverRec.S[5754]++;tinyeiffel.ast.Expr_Reel car=(tinyeiffel.ast.Expr_Reel)expr;
			__CLOVER_62_0.cloverRec.S[5755]++;double d;
			__CLOVER_62_0.cloverRec.S[5756]++;try {
				__CLOVER_62_0.cloverRec.S[5757]++;d=Double.parseDouble(car.str);
			}
			catch(NumberFormatException ex)
			{
				__CLOVER_62_0.cloverRec.S[5758]++;ex.printStackTrace();
				__CLOVER_62_0.cloverRec.S[5759]++;d=0.0;
				assert((((false)) && (++__CLOVER_62_0.cloverRec.CT[1888]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1888]==0&false));
			}
			__CLOVER_62_0.cloverRec.S[5760]++;res=new CIExpr_Real(d,convertie_source(expr.debut()));
			// TODO : prendre en compte le type double
			__CLOVER_62_0.cloverRec.S[5761]++;res.type=new CITypeSimple(false,"REAL",null,null);
		}
		}else
		{{
			assert((((false)) && (++__CLOVER_62_0.cloverRec.CT[1889]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1889]==0&false));
		}
		}}}}}}__CLOVER_62_0.cloverRec.S[5762]++;return res;
	}

	protected CINom_Attribut convertie_nom_feature(NomFeature nom)
	{__CLOVER_62_0.cloverRec.M[469]++;
		__CLOVER_62_0.cloverRec.S[5763]++;CINom_Attribut t=null;
		__CLOVER_62_0.cloverRec.S[5764]++;int i;
		__CLOVER_62_0.cloverRec.S[5765]++;String n;
		assert((((nom!=null)) && (++__CLOVER_62_0.cloverRec.CT[1890]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1890]==0&false));
		__CLOVER_62_0.cloverRec.S[5766]++;if((((nom.infix) && (++__CLOVER_62_0.cloverRec.CT[1891]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1891]==0&false)))
		{{
			__CLOVER_62_0.cloverRec.S[5767]++;if((((nom.nom2!=null) && (++__CLOVER_62_0.cloverRec.CT[1892]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1892]==0&false)))
				{__CLOVER_62_0.cloverRec.S[5768]++;n=nom.nom2.chaine_unique();
			}else
				{__CLOVER_62_0.cloverRec.S[5769]++;n=nom.nom;
			}__CLOVER_62_0.cloverRec.S[5770]++;t=new CINom_Attribut(n,true,null);
		}	
		}else {__CLOVER_62_0.cloverRec.S[5771]++;if((((nom.prefix) && (++__CLOVER_62_0.cloverRec.CT[1893]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1893]==0&false)))
		{{
			//assert(nom.nom!=null):"nom="+nom;
			//assert(nom.nom2!=null):"nom="+nom;
			__CLOVER_62_0.cloverRec.S[5772]++;if((((nom.nom2!=null) && (++__CLOVER_62_0.cloverRec.CT[1894]!=0|true)) || (++__CLOVER_62_0.cloverRec.CF[1894]==0&false)))
				{__CLOVER_62_0.cloverRec.S[5773]++;n=nom.nom2.chaine_unique();
			}else
				{__CLOVER_62_0.cloverRec.S[5774]++;n=nom.nom;
			}__CLOVER_62_0.cloverRec.S[5775]++;t=new CINom_Attribut(n,false,convertie_source(nom.debut));
		}
		}else
			{__CLOVER_62_0.cloverRec.S[5776]++;t=new CINom_Attribut(nom.nom,convertie_source(nom.debut));
		}}__CLOVER_62_0.cloverRec.S[5777]++;return t;
	}

	Compiler_Eiffel compiler;
	Context context;

}
