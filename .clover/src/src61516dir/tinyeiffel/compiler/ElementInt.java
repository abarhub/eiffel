/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ *//*
 * Created on 12 d\u00e9c. 2003
 *
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
package tinyeiffel.compiler;

import tinyeiffel.ast.*;
/**
 * @author BARRET
 *
 * To change the template for this generated type comment go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
public class ElementInt extends Elt implements Compare {static class __CLOVER_70_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}

	/**
		 * 
		 */
		public ElementInt(Expr nom,int v) {
			super();__CLOVER_70_0.cloverRec.S[11439]++;__CLOVER_70_0.cloverRec.M[603]++;
			__CLOVER_70_0.cloverRec.S[11440]++;this.nom=nom;
			__CLOVER_70_0.cloverRec.S[11441]++;this.valeur=v;
			__CLOVER_70_0.cloverRec.S[11442]++;est_unique=false;
		}
		
	public ElementInt(Expr nom,Classe classe,FeatureUnique feature) {
				super();__CLOVER_70_0.cloverRec.S[11443]++;__CLOVER_70_0.cloverRec.M[604]++;
				assert((((nom instanceof Expr_Var)) && (++__CLOVER_70_0.cloverRec.CT[2387]!=0|true)) || (++__CLOVER_70_0.cloverRec.CF[2387]==0&false));
				__CLOVER_70_0.cloverRec.S[11444]++;this.nom=nom;
				__CLOVER_70_0.cloverRec.S[11445]++;this.valeur=0;
				__CLOVER_70_0.cloverRec.S[11446]++;est_unique=true;
				__CLOVER_70_0.cloverRec.S[11447]++;this.classe=classe;
				__CLOVER_70_0.cloverRec.S[11448]++;this.feature=feature;
			}
	
	public boolean egal(Compare ec)
	{__CLOVER_70_0.cloverRec.M[605]++;
		assert((((ec!=null)) && (++__CLOVER_70_0.cloverRec.CT[2388]!=0|true)) || (++__CLOVER_70_0.cloverRec.CF[2388]==0&false));
		__CLOVER_70_0.cloverRec.S[11449]++;ElementInt e=(ElementInt)ec;
		__CLOVER_70_0.cloverRec.S[11450]++;if((((est_unique) && (++__CLOVER_70_0.cloverRec.CT[2389]!=0|true)) || (++__CLOVER_70_0.cloverRec.CF[2389]==0&false)))
		{{
			__CLOVER_70_0.cloverRec.S[11451]++;if((((!e.est_unique) && (++__CLOVER_70_0.cloverRec.CT[2390]!=0|true)) || (++__CLOVER_70_0.cloverRec.CF[2390]==0&false)))
				{__CLOVER_70_0.cloverRec.S[11452]++;return false;
			}assert((((e.nom instanceof Expr_Var)) && (++__CLOVER_70_0.cloverRec.CT[2391]!=0|true)) || (++__CLOVER_70_0.cloverRec.CF[2391]==0&false));
			__CLOVER_70_0.cloverRec.S[11453]++;String s1,s2;
			__CLOVER_70_0.cloverRec.S[11454]++;s1=((Expr_Var)nom).nom;
			__CLOVER_70_0.cloverRec.S[11455]++;s2=((Expr_Var)e.nom).nom;
			__CLOVER_70_0.cloverRec.S[11456]++;return s1.compareToIgnoreCase(s2)==0;
		}
		}else
		{{
			__CLOVER_70_0.cloverRec.S[11457]++;if((((e.est_unique) && (++__CLOVER_70_0.cloverRec.CT[2392]!=0|true)) || (++__CLOVER_70_0.cloverRec.CF[2392]==0&false)))
				{__CLOVER_70_0.cloverRec.S[11458]++;return false;
			}__CLOVER_70_0.cloverRec.S[11459]++;return valeur==e.valeur;
		}
	}}
	
	protected int position()
	{__CLOVER_70_0.cloverRec.M[606]++;
		assert((((est_unique)) && (++__CLOVER_70_0.cloverRec.CT[2393]!=0|true)) || (++__CLOVER_70_0.cloverRec.CF[2393]==0&false));
		__CLOVER_70_0.cloverRec.S[11460]++;int i;
		assert((((feature!=null)) && (++__CLOVER_70_0.cloverRec.CT[2394]!=0|true)) || (++__CLOVER_70_0.cloverRec.CF[2394]==0&false));
		__CLOVER_70_0.cloverRec.S[11461]++;NomFeature n,liste[];
		__CLOVER_70_0.cloverRec.S[11462]++;String n2;
		__CLOVER_70_0.cloverRec.S[11463]++;liste=feature.liste_nom;
		__CLOVER_70_0.cloverRec.S[11464]++;n2=((Expr_Var)nom).nom;
		//n=new No
		__CLOVER_70_0.cloverRec.S[11465]++;for(i=0;(((i<liste.length) && (++__CLOVER_70_0.cloverRec.CT[2395]!=0|true)) || (++__CLOVER_70_0.cloverRec.CF[2395]==0&false));i++)
		{{
			__CLOVER_70_0.cloverRec.S[11466]++;n=liste[i];
			__CLOVER_70_0.cloverRec.S[11467]++;if((((!n.infix&&!n.prefix&&n.nom.compareToIgnoreCase(n2)==0) && (++__CLOVER_70_0.cloverRec.CT[2396]!=0|true)) || (++__CLOVER_70_0.cloverRec.CF[2396]==0&false)))
				{__CLOVER_70_0.cloverRec.S[11468]++;return i;
		}}
		}assert((((false)) && (++__CLOVER_70_0.cloverRec.CT[2397]!=0|true)) || (++__CLOVER_70_0.cloverRec.CF[2397]==0&false));
		__CLOVER_70_0.cloverRec.S[11469]++;return -1;
	}
	
	public boolean entre(ElementInt e1,ElementInt e2)
	{__CLOVER_70_0.cloverRec.M[607]++;
		assert((((e1!=null)) && (++__CLOVER_70_0.cloverRec.CT[2398]!=0|true)) || (++__CLOVER_70_0.cloverRec.CF[2398]==0&false));
		assert((((e2!=null)) && (++__CLOVER_70_0.cloverRec.CT[2399]!=0|true)) || (++__CLOVER_70_0.cloverRec.CF[2399]==0&false));
		__CLOVER_70_0.cloverRec.S[11470]++;if((((est_unique) && (++__CLOVER_70_0.cloverRec.CT[2400]!=0|true)) || (++__CLOVER_70_0.cloverRec.CF[2400]==0&false)))
		{{
			__CLOVER_70_0.cloverRec.S[11471]++;if((((e1.est_unique&&e2.est_unique) && (++__CLOVER_70_0.cloverRec.CT[2401]!=0|true)) || (++__CLOVER_70_0.cloverRec.CF[2401]==0&false)))
			{{
				__CLOVER_70_0.cloverRec.S[11472]++;if((((e1.feature==e2.feature&&feature==e1.feature) && (++__CLOVER_70_0.cloverRec.CT[2402]!=0|true)) || (++__CLOVER_70_0.cloverRec.CF[2402]==0&false)))
				{{// TODO: a terminer
					__CLOVER_70_0.cloverRec.S[11473]++;int pos1,pos2,pos3;
					__CLOVER_70_0.cloverRec.S[11474]++;pos1=position();
					__CLOVER_70_0.cloverRec.S[11475]++;pos2=e1.position();
					__CLOVER_70_0.cloverRec.S[11476]++;pos3=e2.position();
					__CLOVER_70_0.cloverRec.S[11477]++;return pos1>=pos2&&pos1<=pos3;
				//assert(false);
				}
			}}
		}}
		}else
		{{
			__CLOVER_70_0.cloverRec.S[11478]++;if((((!e1.est_unique&&!e2.est_unique) && (++__CLOVER_70_0.cloverRec.CT[2403]!=0|true)) || (++__CLOVER_70_0.cloverRec.CF[2403]==0&false)))
			{{
				__CLOVER_70_0.cloverRec.S[11479]++;return valeur>=e1.valeur&&valeur<=e2.valeur;
			}
		}}
		}__CLOVER_70_0.cloverRec.S[11480]++;return false;
	}
	
	public boolean infStrict(Compare ec)
	{__CLOVER_70_0.cloverRec.M[608]++;
		assert((((ec!=null)) && (++__CLOVER_70_0.cloverRec.CT[2404]!=0|true)) || (++__CLOVER_70_0.cloverRec.CF[2404]==0&false));
		__CLOVER_70_0.cloverRec.S[11481]++;ElementInt e=(ElementInt)ec;
		__CLOVER_70_0.cloverRec.S[11482]++;if((((est_unique) && (++__CLOVER_70_0.cloverRec.CT[2405]!=0|true)) || (++__CLOVER_70_0.cloverRec.CF[2405]==0&false)))
		{{
			__CLOVER_70_0.cloverRec.S[11483]++;if((((feature==e.feature) && (++__CLOVER_70_0.cloverRec.CT[2406]!=0|true)) || (++__CLOVER_70_0.cloverRec.CF[2406]==0&false)))
			{{
				__CLOVER_70_0.cloverRec.S[11484]++;int pos1,pos2;
				__CLOVER_70_0.cloverRec.S[11485]++;pos1=position();
				__CLOVER_70_0.cloverRec.S[11486]++;pos2=e.position();
				__CLOVER_70_0.cloverRec.S[11487]++;return pos1<pos2;
				//assert(false);
			}
		}}
		}else
		{{
			__CLOVER_70_0.cloverRec.S[11488]++;if((((!e.est_unique) && (++__CLOVER_70_0.cloverRec.CT[2407]!=0|true)) || (++__CLOVER_70_0.cloverRec.CF[2407]==0&false)))
			{{
				__CLOVER_70_0.cloverRec.S[11489]++;return valeur<e.valeur;
			}
		}}
		}__CLOVER_70_0.cloverRec.S[11490]++;return false;
	}

	public boolean supStrict(Compare ec)
	{__CLOVER_70_0.cloverRec.M[609]++;
		assert((((ec!=null)) && (++__CLOVER_70_0.cloverRec.CT[2408]!=0|true)) || (++__CLOVER_70_0.cloverRec.CF[2408]==0&false));
		__CLOVER_70_0.cloverRec.S[11491]++;ElementInt e=(ElementInt)ec;
		__CLOVER_70_0.cloverRec.S[11492]++;if((((est_unique) && (++__CLOVER_70_0.cloverRec.CT[2409]!=0|true)) || (++__CLOVER_70_0.cloverRec.CF[2409]==0&false)))
		{{
			__CLOVER_70_0.cloverRec.S[11493]++;if((((feature==e.feature) && (++__CLOVER_70_0.cloverRec.CT[2410]!=0|true)) || (++__CLOVER_70_0.cloverRec.CF[2410]==0&false)))
			{{
				__CLOVER_70_0.cloverRec.S[11494]++;int pos1,pos2;
				__CLOVER_70_0.cloverRec.S[11495]++;pos1=position();
				__CLOVER_70_0.cloverRec.S[11496]++;pos2=e.position();
				__CLOVER_70_0.cloverRec.S[11497]++;return pos1>pos2;
				//assert(false);
			}
		}}
		}else
		{{
			__CLOVER_70_0.cloverRec.S[11498]++;if((((!e.est_unique) && (++__CLOVER_70_0.cloverRec.CT[2411]!=0|true)) || (++__CLOVER_70_0.cloverRec.CF[2411]==0&false)))
			{{
				__CLOVER_70_0.cloverRec.S[11499]++;return valeur>e.valeur;
			}
		}}
		}__CLOVER_70_0.cloverRec.S[11500]++;return false;
	}
	
	public boolean infEgal(Compare elt)
	{__CLOVER_70_0.cloverRec.M[610]++;
		assert((((elt!=null)) && (++__CLOVER_70_0.cloverRec.CT[2412]!=0|true)) || (++__CLOVER_70_0.cloverRec.CF[2412]==0&false));
		assert((((elt instanceof ElementInt)) && (++__CLOVER_70_0.cloverRec.CT[2413]!=0|true)) || (++__CLOVER_70_0.cloverRec.CF[2413]==0&false));
		__CLOVER_70_0.cloverRec.S[11501]++;ElementInt e=(ElementInt)elt;
		__CLOVER_70_0.cloverRec.S[11502]++;if((((est_unique) && (++__CLOVER_70_0.cloverRec.CT[2414]!=0|true)) || (++__CLOVER_70_0.cloverRec.CF[2414]==0&false)))
		{{
			__CLOVER_70_0.cloverRec.S[11503]++;if((((feature==e.feature) && (++__CLOVER_70_0.cloverRec.CT[2415]!=0|true)) || (++__CLOVER_70_0.cloverRec.CF[2415]==0&false)))
			{{
				__CLOVER_70_0.cloverRec.S[11504]++;int pos1,pos2;
				__CLOVER_70_0.cloverRec.S[11505]++;pos1=position();
				__CLOVER_70_0.cloverRec.S[11506]++;pos2=e.position();
				__CLOVER_70_0.cloverRec.S[11507]++;return pos1<=pos2;
				//assert(false);
			}
		}}
		}else
		{{
			__CLOVER_70_0.cloverRec.S[11508]++;if((((!e.est_unique) && (++__CLOVER_70_0.cloverRec.CT[2416]!=0|true)) || (++__CLOVER_70_0.cloverRec.CF[2416]==0&false)))
			{{
				__CLOVER_70_0.cloverRec.S[11509]++;return valeur<=e.valeur;
			}
		}}
		}__CLOVER_70_0.cloverRec.S[11510]++;return false;
	}

	public boolean supEgal(Compare elt)
	{__CLOVER_70_0.cloverRec.M[611]++;
		assert((((elt!=null)) && (++__CLOVER_70_0.cloverRec.CT[2417]!=0|true)) || (++__CLOVER_70_0.cloverRec.CF[2417]==0&false));
		assert((((elt instanceof ElementInt)) && (++__CLOVER_70_0.cloverRec.CT[2418]!=0|true)) || (++__CLOVER_70_0.cloverRec.CF[2418]==0&false));
		__CLOVER_70_0.cloverRec.S[11511]++;ElementInt e=(ElementInt)elt;
		__CLOVER_70_0.cloverRec.S[11512]++;if((((est_unique) && (++__CLOVER_70_0.cloverRec.CT[2419]!=0|true)) || (++__CLOVER_70_0.cloverRec.CF[2419]==0&false)))
		{{
			__CLOVER_70_0.cloverRec.S[11513]++;if((((feature==e.feature) && (++__CLOVER_70_0.cloverRec.CT[2420]!=0|true)) || (++__CLOVER_70_0.cloverRec.CF[2420]==0&false)))
			{{
				__CLOVER_70_0.cloverRec.S[11514]++;int pos1,pos2;
				__CLOVER_70_0.cloverRec.S[11515]++;pos1=position();
				__CLOVER_70_0.cloverRec.S[11516]++;pos2=e.position();
				__CLOVER_70_0.cloverRec.S[11517]++;return pos1>=pos2;
				//assert(false);
			}
		}}
		}else
		{{
			__CLOVER_70_0.cloverRec.S[11518]++;if((((!e.est_unique) && (++__CLOVER_70_0.cloverRec.CT[2421]!=0|true)) || (++__CLOVER_70_0.cloverRec.CF[2421]==0&false)))
			{{
				__CLOVER_70_0.cloverRec.S[11519]++;return valeur>=e.valeur;
			}
		}}
		}__CLOVER_70_0.cloverRec.S[11520]++;return false;
	}

	public boolean diff(Compare elt)
	{__CLOVER_70_0.cloverRec.M[612]++;
		assert((((elt!=null)) && (++__CLOVER_70_0.cloverRec.CT[2422]!=0|true)) || (++__CLOVER_70_0.cloverRec.CF[2422]==0&false));
		assert((((elt instanceof ElementInt)) && (++__CLOVER_70_0.cloverRec.CT[2423]!=0|true)) || (++__CLOVER_70_0.cloverRec.CF[2423]==0&false));
		__CLOVER_70_0.cloverRec.S[11521]++;ElementInt e=(ElementInt)elt;
		__CLOVER_70_0.cloverRec.S[11522]++;if((((est_unique) && (++__CLOVER_70_0.cloverRec.CT[2424]!=0|true)) || (++__CLOVER_70_0.cloverRec.CF[2424]==0&false)))
		{{
			__CLOVER_70_0.cloverRec.S[11523]++;if((((feature==e.feature) && (++__CLOVER_70_0.cloverRec.CT[2425]!=0|true)) || (++__CLOVER_70_0.cloverRec.CF[2425]==0&false)))
			{{
				__CLOVER_70_0.cloverRec.S[11524]++;int pos1,pos2;
				__CLOVER_70_0.cloverRec.S[11525]++;pos1=position();
				__CLOVER_70_0.cloverRec.S[11526]++;pos2=e.position();
				__CLOVER_70_0.cloverRec.S[11527]++;return pos1!=pos2;
				//assert(false);
			}
		}}
		}else
		{{
			__CLOVER_70_0.cloverRec.S[11528]++;if((((!e.est_unique) && (++__CLOVER_70_0.cloverRec.CT[2426]!=0|true)) || (++__CLOVER_70_0.cloverRec.CF[2426]==0&false)))
			{{
				__CLOVER_70_0.cloverRec.S[11529]++;return valeur!=e.valeur;
			}
		}}
		}__CLOVER_70_0.cloverRec.S[11530]++;return false;
	}
	
	int valeur;
	boolean est_unique;
	Classe classe;
	FeatureUnique feature;
}
