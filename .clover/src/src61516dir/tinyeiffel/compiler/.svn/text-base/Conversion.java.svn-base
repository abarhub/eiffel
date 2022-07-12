/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ *//*
 * Created on 27 nov. 2003
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
public class Conversion {static class __CLOVER_61_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}

	/**
	 * 
	 */
	public Conversion(Heritage heritage,Type type) {__CLOVER_61_0.cloverRec.M[421]++;
		assert((((heritage!=null)) && (++__CLOVER_61_0.cloverRec.CT[1486]!=0|true)) || (++__CLOVER_61_0.cloverRec.CF[1486]==0&false));
		assert((((type!=null)) && (++__CLOVER_61_0.cloverRec.CT[1487]!=0|true)) || (++__CLOVER_61_0.cloverRec.CF[1487]==0&false));
		__CLOVER_61_0.cloverRec.S[4167]++;this.heritage=heritage;
		__CLOVER_61_0.cloverRec.S[4168]++;this.type=type;
		__CLOVER_61_0.cloverRec.S[4169]++;construit_table(type,heritage.type);
	}

	public Conversion(Type de,Type vers)
	{__CLOVER_61_0.cloverRec.M[422]++;
		assert((((de!=null)) && (++__CLOVER_61_0.cloverRec.CT[1488]!=0|true)) || (++__CLOVER_61_0.cloverRec.CF[1488]==0&false));
		assert((((vers!=null)) && (++__CLOVER_61_0.cloverRec.CT[1489]!=0|true)) || (++__CLOVER_61_0.cloverRec.CF[1489]==0&false));
		assert((((!de.is_like)) && (++__CLOVER_61_0.cloverRec.CT[1490]!=0|true)) || (++__CLOVER_61_0.cloverRec.CF[1490]==0&false));
		assert((((!vers.is_like)) && (++__CLOVER_61_0.cloverRec.CT[1491]!=0|true)) || (++__CLOVER_61_0.cloverRec.CF[1491]==0&false));
		assert((((de.nom.compareToIgnoreCase(vers.nom)==0)) && (++__CLOVER_61_0.cloverRec.CT[1492]!=0|true)) || (++__CLOVER_61_0.cloverRec.CF[1492]==0&false));
		__CLOVER_61_0.cloverRec.S[4170]++;construit_table(de,vers);
	}

	public Conversion(Conversion conv)
	{__CLOVER_61_0.cloverRec.M[423]++;// fait la concatenation des conversions
		//TODO
	}

	protected void construit_table(Type de,Type vers)
	{__CLOVER_61_0.cloverRec.M[424]++;
		__CLOVER_61_0.cloverRec.S[4171]++;if((((de.generique!=null&&de.generique.length>0&&
			vers.generique!=null&&
			vers.generique.length>0&&
			de.generique.length==vers.generique.length) && (++__CLOVER_61_0.cloverRec.CT[1493]!=0|true)) || (++__CLOVER_61_0.cloverRec.CF[1493]==0&false)))
		{{
			__CLOVER_61_0.cloverRec.S[4172]++;int i;
			assert((((de.generique.length==vers.generique.length)) && (++__CLOVER_61_0.cloverRec.CT[1494]!=0|true)) || (++__CLOVER_61_0.cloverRec.CF[1494]==0&false));
			__CLOVER_61_0.cloverRec.S[4173]++;table=new Type[de.generique.length][2];
			__CLOVER_61_0.cloverRec.S[4174]++;for(i=0;(((i<de.generique.length) && (++__CLOVER_61_0.cloverRec.CT[1495]!=0|true)) || (++__CLOVER_61_0.cloverRec.CF[1495]==0&false));i++)
			{{
				__CLOVER_61_0.cloverRec.S[4175]++;table[i][0]=de.generique[i];
				__CLOVER_61_0.cloverRec.S[4176]++;table[i][1]=vers.generique[i];
			}
		}}
	}}

	/**
	 * convertie le type reel t suivant l'heritage, en
	 * convertissant suivant le type formel de t
	 * @param t le type reel de 
	 * @return
	 */
	public Type convertie2(Type t)
	{__CLOVER_61_0.cloverRec.M[425]++;
		assert((((t!=null)) && (++__CLOVER_61_0.cloverRec.CT[1496]!=0|true)) || (++__CLOVER_61_0.cloverRec.CF[1496]==0&false));
		__CLOVER_61_0.cloverRec.S[4177]++;Type res=null;
		assert((((t.nom.compareToIgnoreCase(type.nom)==0)) && (++__CLOVER_61_0.cloverRec.CT[1497]!=0|true)) || (++__CLOVER_61_0.cloverRec.CF[1497]==0&false)):t.nom+"!="+type.nom;
		__CLOVER_61_0.cloverRec.S[4178]++;res=Type.copieType(heritage.type);
		__CLOVER_61_0.cloverRec.S[4179]++;if((((t.generique!=null&&t.generique.length>0) && (++__CLOVER_61_0.cloverRec.CT[1498]!=0|true)) || (++__CLOVER_61_0.cloverRec.CF[1498]==0&false)))
		{{
			assert((((type.generique!=null)) && (++__CLOVER_61_0.cloverRec.CT[1499]!=0|true)) || (++__CLOVER_61_0.cloverRec.CF[1499]==0&false));
			assert((((type.generique.length==t.generique.length)) && (++__CLOVER_61_0.cloverRec.CT[1500]!=0|true)) || (++__CLOVER_61_0.cloverRec.CF[1500]==0&false)):
					"t="+t.toString2()+";type="+type.toString2();
			__CLOVER_61_0.cloverRec.S[4180]++;int i;
			__CLOVER_61_0.cloverRec.S[4181]++;Type tableau[][],t2;
			__CLOVER_61_0.cloverRec.S[4182]++;tableau=new Type[t.generique.length][2];
			__CLOVER_61_0.cloverRec.S[4183]++;for(i=0;(((i<t.generique.length) && (++__CLOVER_61_0.cloverRec.CT[1501]!=0|true)) || (++__CLOVER_61_0.cloverRec.CF[1501]==0&false));i++)
			{{
				__CLOVER_61_0.cloverRec.S[4184]++;tableau[i][0]=type.generique[i];
				__CLOVER_61_0.cloverRec.S[4185]++;tableau[i][1]=t.generique[i];
			}
			}__CLOVER_61_0.cloverRec.S[4186]++;System.out.println("res avant conv parametres="+res.toString2());
			__CLOVER_61_0.cloverRec.S[4187]++;for(i=0;(((i<res.generique.length) && (++__CLOVER_61_0.cloverRec.CT[1502]!=0|true)) || (++__CLOVER_61_0.cloverRec.CF[1502]==0&false));i++)
			{{
				__CLOVER_61_0.cloverRec.S[4188]++;t2=conv(res.generique[i],tableau);
				__CLOVER_61_0.cloverRec.S[4189]++;System.out.println(i+")"+res.generique[i]+"->"+t2);
				__CLOVER_61_0.cloverRec.S[4190]++;res.generique[i]=t2;
			}
			}__CLOVER_61_0.cloverRec.S[4191]++;System.out.println("res apres conv parametres="+res.toString2());
		}
		}__CLOVER_61_0.cloverRec.S[4192]++;return res;
	}

	protected Type conv(Type t,Type tab[][])
	{__CLOVER_61_0.cloverRec.M[426]++;
		assert((((t!=null)) && (++__CLOVER_61_0.cloverRec.CT[1503]!=0|true)) || (++__CLOVER_61_0.cloverRec.CF[1503]==0&false));
		assert((((tab!=null)) && (++__CLOVER_61_0.cloverRec.CT[1504]!=0|true)) || (++__CLOVER_61_0.cloverRec.CF[1504]==0&false));
		__CLOVER_61_0.cloverRec.S[4193]++;Type t1,t2,res=Type.copieType(t);
		__CLOVER_61_0.cloverRec.S[4194]++;int i,j;
		__CLOVER_61_0.cloverRec.S[4195]++;boolean modifie=false;
		__CLOVER_61_0.cloverRec.S[4196]++;if((((t.is_like) && (++__CLOVER_61_0.cloverRec.CT[1505]!=0|true)) || (++__CLOVER_61_0.cloverRec.CF[1505]==0&false)))
			{__CLOVER_61_0.cloverRec.S[4197]++;return Type.copieType(t);
		}__CLOVER_61_0.cloverRec.S[4198]++;if((((tab!=null) && (++__CLOVER_61_0.cloverRec.CT[1506]!=0|true)) || (++__CLOVER_61_0.cloverRec.CF[1506]==0&false)))
		{{
			__CLOVER_61_0.cloverRec.S[4199]++;for(i=0;(((i<tab.length) && (++__CLOVER_61_0.cloverRec.CT[1507]!=0|true)) || (++__CLOVER_61_0.cloverRec.CF[1507]==0&false));i++)
			{{
				__CLOVER_61_0.cloverRec.S[4200]++;t1=tab[i][0];
				__CLOVER_61_0.cloverRec.S[4201]++;t2=tab[i][1];
				__CLOVER_61_0.cloverRec.S[4202]++;if((((t.nom.compareToIgnoreCase(t1.nom)==0) && (++__CLOVER_61_0.cloverRec.CT[1508]!=0|true)) || (++__CLOVER_61_0.cloverRec.CF[1508]==0&false)))
				{{
					__CLOVER_61_0.cloverRec.S[4203]++;res=Type.copieType(t2);
					assert((((!modifie)) && (++__CLOVER_61_0.cloverRec.CT[1509]!=0|true)) || (++__CLOVER_61_0.cloverRec.CF[1509]==0&false));
					__CLOVER_61_0.cloverRec.S[4204]++;modifie=true;
					assert((((t.generique==null||
							t.generique.length==0)) && (++__CLOVER_61_0.cloverRec.CT[1510]!=0|true)) || (++__CLOVER_61_0.cloverRec.CF[1510]==0&false));
					__CLOVER_61_0.cloverRec.S[4205]++;break;
				}
			}}
			}__CLOVER_61_0.cloverRec.S[4206]++;if((((t.generique!=null&&!modifie) && (++__CLOVER_61_0.cloverRec.CT[1511]!=0|true)) || (++__CLOVER_61_0.cloverRec.CF[1511]==0&false)))
			{{
				//assert(res!=type);
				//assert(!modifie);
				__CLOVER_61_0.cloverRec.S[4207]++;for(i=0;(((i<t.generique.length) && (++__CLOVER_61_0.cloverRec.CT[1512]!=0|true)) || (++__CLOVER_61_0.cloverRec.CF[1512]==0&false));i++)
				{{
					__CLOVER_61_0.cloverRec.S[4208]++;res.generique[i]=conv(res.generique[i],tab);
				}
			}}
		}}
		}__CLOVER_61_0.cloverRec.S[4209]++;return res;
	}

	public Type convertie(Type type)
	{__CLOVER_61_0.cloverRec.M[427]++;
		assert((((type!=null)) && (++__CLOVER_61_0.cloverRec.CT[1513]!=0|true)) || (++__CLOVER_61_0.cloverRec.CF[1513]==0&false));
		__CLOVER_61_0.cloverRec.S[4210]++;Type t1,t2,res=Type.copieType(type);
		__CLOVER_61_0.cloverRec.S[4211]++;int i,j;
		__CLOVER_61_0.cloverRec.S[4212]++;boolean modifie=false;
		__CLOVER_61_0.cloverRec.S[4213]++;if((((type.is_like) && (++__CLOVER_61_0.cloverRec.CT[1514]!=0|true)) || (++__CLOVER_61_0.cloverRec.CF[1514]==0&false)))
			{__CLOVER_61_0.cloverRec.S[4214]++;return Type.copieType(type);
		}__CLOVER_61_0.cloverRec.S[4215]++;if((((table!=null) && (++__CLOVER_61_0.cloverRec.CT[1515]!=0|true)) || (++__CLOVER_61_0.cloverRec.CF[1515]==0&false)))
		{{
			__CLOVER_61_0.cloverRec.S[4216]++;for(i=0;(((i<table.length) && (++__CLOVER_61_0.cloverRec.CT[1516]!=0|true)) || (++__CLOVER_61_0.cloverRec.CF[1516]==0&false));i++)
			{{
				__CLOVER_61_0.cloverRec.S[4217]++;t1=table[i][0];
				__CLOVER_61_0.cloverRec.S[4218]++;t2=table[i][1];
				__CLOVER_61_0.cloverRec.S[4219]++;if((((type.nom.compareToIgnoreCase(t1.nom)==0) && (++__CLOVER_61_0.cloverRec.CT[1517]!=0|true)) || (++__CLOVER_61_0.cloverRec.CF[1517]==0&false)))
				{{// TODO: prendre en compte les param\u00e8tres
					__CLOVER_61_0.cloverRec.S[4220]++;res=Type.copieType(t2);
					assert((((!modifie)) && (++__CLOVER_61_0.cloverRec.CT[1518]!=0|true)) || (++__CLOVER_61_0.cloverRec.CF[1518]==0&false));
					__CLOVER_61_0.cloverRec.S[4221]++;modifie=true;
					//assert(type.generique==null||
					//		type.generique.length==0);
					__CLOVER_61_0.cloverRec.S[4222]++;break;
				}
			}}
			}__CLOVER_61_0.cloverRec.S[4223]++;if((((type.generique!=null) && (++__CLOVER_61_0.cloverRec.CT[1519]!=0|true)) || (++__CLOVER_61_0.cloverRec.CF[1519]==0&false)))
			{{
				//assert(res!=type);
				assert((((type.generique.length==0||!modifie)) && (++__CLOVER_61_0.cloverRec.CT[1520]!=0|true)) || (++__CLOVER_61_0.cloverRec.CF[1520]==0&false));
				__CLOVER_61_0.cloverRec.S[4224]++;for(i=0;(((i<type.generique.length) && (++__CLOVER_61_0.cloverRec.CT[1521]!=0|true)) || (++__CLOVER_61_0.cloverRec.CF[1521]==0&false));i++)
				{{
					__CLOVER_61_0.cloverRec.S[4225]++;res.generique[i]=convertie(res.generique[i]);
				}
			}}
		}}
		}__CLOVER_61_0.cloverRec.S[4226]++;return res;
	}

	public Type convertie_inv(Type type)
	{__CLOVER_61_0.cloverRec.M[428]++;
		assert((((type!=null)) && (++__CLOVER_61_0.cloverRec.CT[1522]!=0|true)) || (++__CLOVER_61_0.cloverRec.CF[1522]==0&false));
		__CLOVER_61_0.cloverRec.S[4227]++;Type t1,t2,res=Type.copieType(type);
		__CLOVER_61_0.cloverRec.S[4228]++;int i,j;
		__CLOVER_61_0.cloverRec.S[4229]++;boolean modifie=false;
		__CLOVER_61_0.cloverRec.S[4230]++;if((((type.is_like) && (++__CLOVER_61_0.cloverRec.CT[1523]!=0|true)) || (++__CLOVER_61_0.cloverRec.CF[1523]==0&false)))
			{__CLOVER_61_0.cloverRec.S[4231]++;return Type.copieType(type);
		}__CLOVER_61_0.cloverRec.S[4232]++;if((((table!=null) && (++__CLOVER_61_0.cloverRec.CT[1524]!=0|true)) || (++__CLOVER_61_0.cloverRec.CF[1524]==0&false)))
		{{
			__CLOVER_61_0.cloverRec.S[4233]++;for(i=0;(((i<table.length) && (++__CLOVER_61_0.cloverRec.CT[1525]!=0|true)) || (++__CLOVER_61_0.cloverRec.CF[1525]==0&false));i++)
			{{
				__CLOVER_61_0.cloverRec.S[4234]++;t1=table[i][1];
				__CLOVER_61_0.cloverRec.S[4235]++;t2=table[i][0];
				__CLOVER_61_0.cloverRec.S[4236]++;if((((type.nom.compareToIgnoreCase(t1.nom)==0) && (++__CLOVER_61_0.cloverRec.CT[1526]!=0|true)) || (++__CLOVER_61_0.cloverRec.CF[1526]==0&false)))
				{{
					__CLOVER_61_0.cloverRec.S[4237]++;res=Type.copieType(t2);
					assert((((!modifie)) && (++__CLOVER_61_0.cloverRec.CT[1527]!=0|true)) || (++__CLOVER_61_0.cloverRec.CF[1527]==0&false));
					__CLOVER_61_0.cloverRec.S[4238]++;modifie=true;
					//assert(type.generique==null||
					//		type.generique.length==0);
					__CLOVER_61_0.cloverRec.S[4239]++;break;
				}
			}}
			}__CLOVER_61_0.cloverRec.S[4240]++;if((((type.generique!=null&&!modifie) && (++__CLOVER_61_0.cloverRec.CT[1528]!=0|true)) || (++__CLOVER_61_0.cloverRec.CF[1528]==0&false)))
			{{
				//assert(res!=type);
				assert((((!modifie)) && (++__CLOVER_61_0.cloverRec.CT[1529]!=0|true)) || (++__CLOVER_61_0.cloverRec.CF[1529]==0&false));
				__CLOVER_61_0.cloverRec.S[4241]++;for(i=0;(((i<type.generique.length) && (++__CLOVER_61_0.cloverRec.CT[1530]!=0|true)) || (++__CLOVER_61_0.cloverRec.CF[1530]==0&false));i++)
				{{
					__CLOVER_61_0.cloverRec.S[4242]++;res.generique[i]=convertie_inv(res.generique[i]);
				}
			}}
		}}
		}__CLOVER_61_0.cloverRec.S[4243]++;return res;
	}

	public String toString()
	{__CLOVER_61_0.cloverRec.M[429]++;
		__CLOVER_61_0.cloverRec.S[4244]++;String res="{";
		__CLOVER_61_0.cloverRec.S[4245]++;if((((table!=null) && (++__CLOVER_61_0.cloverRec.CT[1531]!=0|true)) || (++__CLOVER_61_0.cloverRec.CF[1531]==0&false)))
		{{
			__CLOVER_61_0.cloverRec.S[4246]++;for(int i=0;(((i<table.length) && (++__CLOVER_61_0.cloverRec.CT[1532]!=0|true)) || (++__CLOVER_61_0.cloverRec.CF[1532]==0&false));i++)
			{{
				__CLOVER_61_0.cloverRec.S[4247]++;if((((i>0) && (++__CLOVER_61_0.cloverRec.CT[1533]!=0|true)) || (++__CLOVER_61_0.cloverRec.CF[1533]==0&false)))
					{__CLOVER_61_0.cloverRec.S[4248]++;res+="+";
				}__CLOVER_61_0.cloverRec.S[4249]++;res+=table[i][0]+"->"+table[i][1];
			}
		}}
		}__CLOVER_61_0.cloverRec.S[4250]++;res+="}";
		__CLOVER_61_0.cloverRec.S[4251]++;return res;
	}

	Heritage heritage;
	Type type,table[][];
}
