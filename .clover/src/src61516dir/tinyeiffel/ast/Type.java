/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ */package tinyeiffel.ast;

//import java.util.*;
import java.io.*;

public abstract class Type implements ToXML,Traite
{static class __CLOVER_50_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}
	/*public Type(boolean expanded,String nom,Vector t)
	{
		this.nom=nom;
		this.expanded=expanded;
		if(t!=null)
		{
			generique=new Type[t.size()];
			t.copyInto(generique);
		}
	}*/

	/*public Type(Expr e)
	{
		is_like=true;
		like=e;
	}*/

	public static Type copieType(Type type)
	{__CLOVER_50_0.cloverRec.M[276]++;
		__CLOVER_50_0.cloverRec.S[1332]++;Type t;
		__CLOVER_50_0.cloverRec.S[1333]++;if((((type instanceof TypeSimple) && (++__CLOVER_50_0.cloverRec.CT[536]!=0|true)) || (++__CLOVER_50_0.cloverRec.CF[536]==0&false)))
		{{
			__CLOVER_50_0.cloverRec.S[1334]++;t=new TypeSimple(type.expanded,type.nom,null);
		}
		}else
		{{
			__CLOVER_50_0.cloverRec.S[1335]++;t=new TypeAncre(type.like);
		}
		}__CLOVER_50_0.cloverRec.S[1336]++;t.nom=type.nom;
		__CLOVER_50_0.cloverRec.S[1337]++;t.is_like=type.is_like;
		__CLOVER_50_0.cloverRec.S[1338]++;t.like=type.like;
		__CLOVER_50_0.cloverRec.S[1339]++;if((((type.generique!=null) && (++__CLOVER_50_0.cloverRec.CT[537]!=0|true)) || (++__CLOVER_50_0.cloverRec.CF[537]==0&false)))
		{{
			__CLOVER_50_0.cloverRec.S[1340]++;t.generique=new Type[type.generique.length];
			__CLOVER_50_0.cloverRec.S[1341]++;for(int i=0;(((i<type.generique.length) && (++__CLOVER_50_0.cloverRec.CT[538]!=0|true)) || (++__CLOVER_50_0.cloverRec.CF[538]==0&false));i++)
			{{
				__CLOVER_50_0.cloverRec.S[1342]++;t.generique[i]=copieType(type.generique[i]);
			}
		}}
		}__CLOVER_50_0.cloverRec.S[1343]++;t.is_from=type.is_from;
		__CLOVER_50_0.cloverRec.S[1344]++;t.expanded=type.expanded;
		//classe_env=type.classe_env;
		
		__CLOVER_50_0.cloverRec.S[1345]++;t.debut_=type.debut_;
		__CLOVER_50_0.cloverRec.S[1346]++;t.fin=type.fin;
		__CLOVER_50_0.cloverRec.S[1347]++;t.tnom=type.tnom;
		__CLOVER_50_0.cloverRec.S[1348]++;t.tcrochet_ouvr=type.tcrochet_ouvr;
		__CLOVER_50_0.cloverRec.S[1349]++;t.tcrochet_ferm=type.tcrochet_ferm;
		__CLOVER_50_0.cloverRec.S[1350]++;t.tlike=type.tlike;
		__CLOVER_50_0.cloverRec.S[1351]++;t.tfleche=type.tfleche;
		__CLOVER_50_0.cloverRec.S[1352]++;return t;
	}

	public boolean egaux(Type t)
	{__CLOVER_50_0.cloverRec.M[277]++;
		__CLOVER_50_0.cloverRec.S[1353]++;if((((nom==null) && (++__CLOVER_50_0.cloverRec.CT[539]!=0|true)) || (++__CLOVER_50_0.cloverRec.CF[539]==0&false)))
			{__CLOVER_50_0.cloverRec.S[1354]++;return false;

		}__CLOVER_50_0.cloverRec.S[1355]++;if((((t!=null&&t.nom!=null) && (++__CLOVER_50_0.cloverRec.CT[540]!=0|true)) || (++__CLOVER_50_0.cloverRec.CF[540]==0&false)))
			{__CLOVER_50_0.cloverRec.S[1356]++;return nom.compareToIgnoreCase(t.nom)==0;
		}__CLOVER_50_0.cloverRec.S[1357]++;return false;
	}

	public boolean equals(Object o)
	{__CLOVER_50_0.cloverRec.M[278]++;
		__CLOVER_50_0.cloverRec.S[1358]++;if((((o instanceof Type) && (++__CLOVER_50_0.cloverRec.CT[541]!=0|true)) || (++__CLOVER_50_0.cloverRec.CF[541]==0&false)))
		{{
			__CLOVER_50_0.cloverRec.S[1359]++;Type t=(Type)o;
			__CLOVER_50_0.cloverRec.S[1360]++;if((((is_like==t.is_like) && (++__CLOVER_50_0.cloverRec.CT[542]!=0|true)) || (++__CLOVER_50_0.cloverRec.CF[542]==0&false)))
			{{// TODO:a completer
				__CLOVER_50_0.cloverRec.S[1361]++;return true;
			}
			}else
			{{
				__CLOVER_50_0.cloverRec.S[1362]++;if((((t.is_like) && (++__CLOVER_50_0.cloverRec.CT[543]!=0|true)) || (++__CLOVER_50_0.cloverRec.CF[543]==0&false)))
					{__CLOVER_50_0.cloverRec.S[1363]++;return false;
				}__CLOVER_50_0.cloverRec.S[1364]++;return nom==t.nom;
			}
		}}
		}__CLOVER_50_0.cloverRec.S[1365]++;return false;
	}

	public String toString()
	{__CLOVER_50_0.cloverRec.M[279]++;
		__CLOVER_50_0.cloverRec.S[1366]++;if((((is_like) && (++__CLOVER_50_0.cloverRec.CT[544]!=0|true)) || (++__CLOVER_50_0.cloverRec.CF[544]==0&false)))
		{{
			__CLOVER_50_0.cloverRec.S[1367]++;if((((like instanceof Expr_Var) && (++__CLOVER_50_0.cloverRec.CT[545]!=0|true)) || (++__CLOVER_50_0.cloverRec.CF[545]==0&false)))
				{__CLOVER_50_0.cloverRec.S[1368]++;return "like "+((Expr_Var)like).nom;
			}else
				{__CLOVER_50_0.cloverRec.S[1369]++;return "like "+like.toString();
		}}
		}assert((((nom!=null)) && (++__CLOVER_50_0.cloverRec.CT[546]!=0|true)) || (++__CLOVER_50_0.cloverRec.CF[546]==0&false));
		__CLOVER_50_0.cloverRec.S[1370]++;return (((((expanded)) && (++__CLOVER_50_0.cloverRec.CT[547]!=0|true)) || (++__CLOVER_50_0.cloverRec.CF[547]==0&false))?"expanded ":"")+nom;
	}

        public void set_token(Token tnom,Token tcrochet_ouvr,
                              Token tcrochet_ferm)
        {__CLOVER_50_0.cloverRec.M[280]++;
          __CLOVER_50_0.cloverRec.S[1371]++;this.tnom=tnom;
          __CLOVER_50_0.cloverRec.S[1372]++;this.tcrochet_ouvr=tcrochet_ouvr;
          __CLOVER_50_0.cloverRec.S[1373]++;this.tcrochet_ferm=tcrochet_ferm;
          //debut=tnom.debut();
        }

        public void set_token(Token tlike)
        {__CLOVER_50_0.cloverRec.M[281]++;
          __CLOVER_50_0.cloverRec.S[1374]++;this.tlike=tlike;
          //debut=tlike.debut();
        }

        public void set_token(Token tnom,Token tfleche)
        {__CLOVER_50_0.cloverRec.M[282]++;
          __CLOVER_50_0.cloverRec.S[1375]++;this.tnom=tnom;
          __CLOVER_50_0.cloverRec.S[1376]++;this.tfleche=tfleche;
          //debut=tnom.debut();
        }

	public Position debut()
	{__CLOVER_50_0.cloverRec.M[283]++;
		__CLOVER_50_0.cloverRec.S[1377]++;if((((tnom!=null) && (++__CLOVER_50_0.cloverRec.CT[548]!=0|true)) || (++__CLOVER_50_0.cloverRec.CF[548]==0&false)))
			{__CLOVER_50_0.cloverRec.S[1378]++;return tnom.debut();
		}else
			{__CLOVER_50_0.cloverRec.S[1379]++;return tlike.debut();
	}}

	public void check_egal(Type t)
	{__CLOVER_50_0.cloverRec.M[284]++;
		assert((((t!=null)) && (++__CLOVER_50_0.cloverRec.CT[549]!=0|true)) || (++__CLOVER_50_0.cloverRec.CF[549]==0&false));
		__CLOVER_50_0.cloverRec.S[1380]++;if((((nom==null) && (++__CLOVER_50_0.cloverRec.CT[550]!=0|true)) || (++__CLOVER_50_0.cloverRec.CF[550]==0&false)))
			{assert((((t.nom==null)) && (++__CLOVER_50_0.cloverRec.CT[551]!=0|true)) || (++__CLOVER_50_0.cloverRec.CF[551]==0&false));
		}else
			{assert((((nom.equals(t.nom))) && (++__CLOVER_50_0.cloverRec.CT[552]!=0|true)) || (++__CLOVER_50_0.cloverRec.CF[552]==0&false)):
				"type non egaux:"+nom+" et "+t.nom;
		}__CLOVER_50_0.cloverRec.S[1381]++;if((((like==null) && (++__CLOVER_50_0.cloverRec.CT[553]!=0|true)) || (++__CLOVER_50_0.cloverRec.CF[553]==0&false)))
			{assert((((t.like==null)) && (++__CLOVER_50_0.cloverRec.CT[554]!=0|true)) || (++__CLOVER_50_0.cloverRec.CF[554]==0&false));
		}else
			{__CLOVER_50_0.cloverRec.S[1382]++;like.check_egal(t.like);	
	}}

	public void toXML(PrintStream out)
	{__CLOVER_50_0.cloverRec.M[285]++;
		assert((((out!=null)) && (++__CLOVER_50_0.cloverRec.CT[555]!=0|true)) || (++__CLOVER_50_0.cloverRec.CF[555]==0&false));
		__CLOVER_50_0.cloverRec.S[1383]++;if((((is_like) && (++__CLOVER_50_0.cloverRec.CT[556]!=0|true)) || (++__CLOVER_50_0.cloverRec.CF[556]==0&false)))
		{{
			__CLOVER_50_0.cloverRec.S[1384]++;out.println("<nom_classe>");
			assert((((like!=null)) && (++__CLOVER_50_0.cloverRec.CT[557]!=0|true)) || (++__CLOVER_50_0.cloverRec.CF[557]==0&false));
			__CLOVER_50_0.cloverRec.S[1385]++;out.println("<like>");
			__CLOVER_50_0.cloverRec.S[1386]++;like.toXML(out);
			__CLOVER_50_0.cloverRec.S[1387]++;out.println("</like>");
			__CLOVER_50_0.cloverRec.S[1388]++;out.println("</nom_classe>");
		}
		}else
		{{
			__CLOVER_50_0.cloverRec.S[1389]++;out.println("<nom_classe nom=\""+nom+"\" "+
					(((((expanded)) && (++__CLOVER_50_0.cloverRec.CT[558]!=0|true)) || (++__CLOVER_50_0.cloverRec.CF[558]==0&false))?"expanded=\"yes\"":"")+">");
			//out.println("coucou_debut");
			__CLOVER_50_0.cloverRec.S[1390]++;if((((generique!=null) && (++__CLOVER_50_0.cloverRec.CT[559]!=0|true)) || (++__CLOVER_50_0.cloverRec.CF[559]==0&false)))
			{{
				__CLOVER_50_0.cloverRec.S[1391]++;for(int i=0;(((i<generique.length) && (++__CLOVER_50_0.cloverRec.CT[560]!=0|true)) || (++__CLOVER_50_0.cloverRec.CF[560]==0&false));i++)
				{{
					__CLOVER_50_0.cloverRec.S[1392]++;generique[i].toXML(out);
				}				
			}}
			//out.println("coucou_fin");
			}__CLOVER_50_0.cloverRec.S[1393]++;out.println("</nom_classe>");
		}
	}}

	public String toString2()
	{__CLOVER_50_0.cloverRec.M[286]++;
		__CLOVER_50_0.cloverRec.S[1394]++;String res;
		__CLOVER_50_0.cloverRec.S[1395]++;if((((is_like) && (++__CLOVER_50_0.cloverRec.CT[561]!=0|true)) || (++__CLOVER_50_0.cloverRec.CF[561]==0&false)))
		{{
			__CLOVER_50_0.cloverRec.S[1396]++;res=toString();
		}
		}else
		{{
			__CLOVER_50_0.cloverRec.S[1397]++;res=nom;
			__CLOVER_50_0.cloverRec.S[1398]++;if((((generique!=null&&generique.length>0) && (++__CLOVER_50_0.cloverRec.CT[562]!=0|true)) || (++__CLOVER_50_0.cloverRec.CF[562]==0&false)))
			{{
				__CLOVER_50_0.cloverRec.S[1399]++;res+="[";
				__CLOVER_50_0.cloverRec.S[1400]++;for(int i=0;(((i<generique.length) && (++__CLOVER_50_0.cloverRec.CT[563]!=0|true)) || (++__CLOVER_50_0.cloverRec.CF[563]==0&false));i++)
				{{
					__CLOVER_50_0.cloverRec.S[1401]++;if((((i>0) && (++__CLOVER_50_0.cloverRec.CT[564]!=0|true)) || (++__CLOVER_50_0.cloverRec.CF[564]==0&false)))
						{__CLOVER_50_0.cloverRec.S[1402]++;res+=",";
					}__CLOVER_50_0.cloverRec.S[1403]++;res+=generique[i].toString2();
				}
				}__CLOVER_50_0.cloverRec.S[1404]++;res+="]";
			}
		}}
		}__CLOVER_50_0.cloverRec.S[1405]++;return res;
	}

	public void set_traite(boolean traite0)
	{__CLOVER_50_0.cloverRec.M[287]++;
		__CLOVER_50_0.cloverRec.S[1406]++;this.traite=traite0;
	}

	public boolean get_traite()
	{__CLOVER_50_0.cloverRec.M[288]++;
		__CLOVER_50_0.cloverRec.S[1407]++;return traite;
	}

	protected boolean traite=false;

	public String nom;
	public boolean is_like;
	public Expr like;
	public Type generique[];
	public boolean is_from;
	public boolean expanded;
	//public Classe classe_env;

        public Position debut_,fin;
        public Token tnom,tcrochet_ouvr,tcrochet_ferm,
            tlike,tfleche;

}