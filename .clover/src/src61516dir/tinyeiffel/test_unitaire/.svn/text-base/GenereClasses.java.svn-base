/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ *//*
 * Created on 9 avr. 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package tinyeiffel.test_unitaire;

import java.io.*;
import java.util.*;

/**
 * @author Barret
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class GenereClasses {static class __CLOVER_253_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}

	String chemin, nom_ace;
	int nb_classe, nb_feature, nb_instr, nb_local;
	File racine;
	Vector liste_classes;
	
	public GenereClasses(String chemin,String nom_ace,
			int nb_classe,int nb_feature,int nb_instr,int nb_local)
	{__CLOVER_253_0.cloverRec.M[1492]++;
		assert((((chemin!=null&&!chemin.equals(""))) && (++__CLOVER_253_0.cloverRec.CT[6650]!=0|true)) || (++__CLOVER_253_0.cloverRec.CF[6650]==0&false));
		assert((((nom_ace!=null&&!nom_ace.equals(""))) && (++__CLOVER_253_0.cloverRec.CT[6651]!=0|true)) || (++__CLOVER_253_0.cloverRec.CF[6651]==0&false));
		assert((((nb_classe>=1)) && (++__CLOVER_253_0.cloverRec.CT[6652]!=0|true)) || (++__CLOVER_253_0.cloverRec.CF[6652]==0&false));
		assert((((nb_feature>=0)) && (++__CLOVER_253_0.cloverRec.CT[6653]!=0|true)) || (++__CLOVER_253_0.cloverRec.CF[6653]==0&false));
		assert((((nb_instr>=0)) && (++__CLOVER_253_0.cloverRec.CT[6654]!=0|true)) || (++__CLOVER_253_0.cloverRec.CF[6654]==0&false));
		assert((((nb_local>=0)) && (++__CLOVER_253_0.cloverRec.CT[6655]!=0|true)) || (++__CLOVER_253_0.cloverRec.CF[6655]==0&false));
		__CLOVER_253_0.cloverRec.S[21635]++;this.chemin=chemin;
		__CLOVER_253_0.cloverRec.S[21636]++;this.nom_ace=nom_ace;
		__CLOVER_253_0.cloverRec.S[21637]++;this.nb_classe=nb_classe;
		__CLOVER_253_0.cloverRec.S[21638]++;this.nb_feature=nb_feature;
		__CLOVER_253_0.cloverRec.S[21639]++;this.nb_instr=nb_instr;
		__CLOVER_253_0.cloverRec.S[21640]++;this.nb_local=nb_local;
		__CLOVER_253_0.cloverRec.S[21641]++;supprime(chemin);
		__CLOVER_253_0.cloverRec.S[21642]++;racine=new File(chemin);
		__CLOVER_253_0.cloverRec.S[21643]++;racine.mkdirs();
		assert((((racine.exists())) && (++__CLOVER_253_0.cloverRec.CT[6656]!=0|true)) || (++__CLOVER_253_0.cloverRec.CF[6656]==0&false));
		__CLOVER_253_0.cloverRec.S[21644]++;liste_classes=new Vector();
	}
	
	public void traitement()
	{__CLOVER_253_0.cloverRec.M[1493]++;
		__CLOVER_253_0.cloverRec.S[21645]++;init_classes();
		__CLOVER_253_0.cloverRec.S[21646]++;genere();
	}
	
	protected void init_classes()
	{__CLOVER_253_0.cloverRec.M[1494]++;
		__CLOVER_253_0.cloverRec.S[21647]++;int i,j,n,n2,k;
		__CLOVER_253_0.cloverRec.S[21648]++;ClasseTest cl;
		__CLOVER_253_0.cloverRec.S[21649]++;String nom;
		__CLOVER_253_0.cloverRec.S[21650]++;Random r=new Random();
		__CLOVER_253_0.cloverRec.S[21651]++;AttributTest attr,lattr[];
		__CLOVER_253_0.cloverRec.S[21652]++;cl=new ClasseTest();
		__CLOVER_253_0.cloverRec.S[21653]++;cl.nom="ANY";
		__CLOVER_253_0.cloverRec.S[21654]++;liste_classes.add(cl);
		__CLOVER_253_0.cloverRec.S[21655]++;for(i=0;(((i<nb_classe) && (++__CLOVER_253_0.cloverRec.CT[6657]!=0|true)) || (++__CLOVER_253_0.cloverRec.CF[6657]==0&false));i++)
		{{
			__CLOVER_253_0.cloverRec.S[21656]++;cl=new ClasseTest();
			__CLOVER_253_0.cloverRec.S[21657]++;cl.nom="A"+i;
			__CLOVER_253_0.cloverRec.S[21658]++;n=r.nextInt(this.nb_feature)+1;
			assert((((n>0)) && (++__CLOVER_253_0.cloverRec.CT[6658]!=0|true)) || (++__CLOVER_253_0.cloverRec.CF[6658]==0&false));
			__CLOVER_253_0.cloverRec.S[21659]++;lattr=new AttributTest[n];
			__CLOVER_253_0.cloverRec.S[21660]++;for(j=0;(((j<n) && (++__CLOVER_253_0.cloverRec.CT[6659]!=0|true)) || (++__CLOVER_253_0.cloverRec.CF[6659]==0&false));j++)
			{{
				__CLOVER_253_0.cloverRec.S[21661]++;attr=new AttributTest();
				__CLOVER_253_0.cloverRec.S[21662]++;attr.nom=cl.nom+"_"+j;
				__CLOVER_253_0.cloverRec.S[21663]++;n2=r.nextInt(5);
				__CLOVER_253_0.cloverRec.S[21664]++;if((((n2>1) && (++__CLOVER_253_0.cloverRec.CT[6660]!=0|true)) || (++__CLOVER_253_0.cloverRec.CF[6660]==0&false)))
				{{
					__CLOVER_253_0.cloverRec.S[21665]++;attr.type=new String[n2-1];
					__CLOVER_253_0.cloverRec.S[21666]++;for(k=0;(((k<n2-1) && (++__CLOVER_253_0.cloverRec.CT[6661]!=0|true)) || (++__CLOVER_253_0.cloverRec.CF[6661]==0&false));k++)
					{{
						__CLOVER_253_0.cloverRec.S[21667]++;attr.type[k]="ANY";
					}
				}}
				}__CLOVER_253_0.cloverRec.S[21668]++;lattr[j]=attr;
			}
			}__CLOVER_253_0.cloverRec.S[21669]++;cl.liste_attribut=lattr;
			__CLOVER_253_0.cloverRec.S[21670]++;liste_classes.add(cl);
		}
	}}

	protected void genere()
	{__CLOVER_253_0.cloverRec.M[1495]++;
		__CLOVER_253_0.cloverRec.S[21671]++;int i,j,k;
		__CLOVER_253_0.cloverRec.S[21672]++;ClasseTest cl;
		__CLOVER_253_0.cloverRec.S[21673]++;String nom;
		__CLOVER_253_0.cloverRec.S[21674]++;Random r=new Random();
		__CLOVER_253_0.cloverRec.S[21675]++;AttributTest attr,lattr[];
		__CLOVER_253_0.cloverRec.S[21676]++;FileOutputStream fo;
		__CLOVER_253_0.cloverRec.S[21677]++;PrintWriter out;
		__CLOVER_253_0.cloverRec.S[21678]++;File f;
		__CLOVER_253_0.cloverRec.S[21679]++;for(i=0;(((i<liste_classes.size()) && (++__CLOVER_253_0.cloverRec.CT[6662]!=0|true)) || (++__CLOVER_253_0.cloverRec.CF[6662]==0&false));i++)
		{{
			__CLOVER_253_0.cloverRec.S[21680]++;cl=(ClasseTest)liste_classes.elementAt(i);
			__CLOVER_253_0.cloverRec.S[21681]++;try {
				__CLOVER_253_0.cloverRec.S[21682]++;f=new File(racine,cl.nom.toLowerCase()+".e");
				__CLOVER_253_0.cloverRec.S[21683]++;fo=new FileOutputStream(f);
				__CLOVER_253_0.cloverRec.S[21684]++;out=new PrintWriter(fo);
				__CLOVER_253_0.cloverRec.S[21685]++;out.println("class "+cl.nom.toUpperCase());
				__CLOVER_253_0.cloverRec.S[21686]++;out.println();
				__CLOVER_253_0.cloverRec.S[21687]++;out.println("feature");
				__CLOVER_253_0.cloverRec.S[21688]++;out.println();
				__CLOVER_253_0.cloverRec.S[21689]++;lattr=cl.liste_attribut;
				__CLOVER_253_0.cloverRec.S[21690]++;System.out.println("coucou="+lattr);
				__CLOVER_253_0.cloverRec.S[21691]++;if((((lattr!=null&&lattr.length>0) && (++__CLOVER_253_0.cloverRec.CT[6663]!=0|true)) || (++__CLOVER_253_0.cloverRec.CF[6663]==0&false)))
				{{
					__CLOVER_253_0.cloverRec.S[21692]++;for(j=0;(((j<lattr.length) && (++__CLOVER_253_0.cloverRec.CT[6664]!=0|true)) || (++__CLOVER_253_0.cloverRec.CF[6664]==0&false));j++)
					{{
						__CLOVER_253_0.cloverRec.S[21693]++;System.out.println("coucou");
						__CLOVER_253_0.cloverRec.S[21694]++;attr=lattr[j];
						__CLOVER_253_0.cloverRec.S[21695]++;out.print("\t"+attr.nom);
						__CLOVER_253_0.cloverRec.S[21696]++;if((((attr.type!=null&&attr.type.length>0) && (++__CLOVER_253_0.cloverRec.CT[6665]!=0|true)) || (++__CLOVER_253_0.cloverRec.CF[6665]==0&false)))
						{{
							__CLOVER_253_0.cloverRec.S[21697]++;out.print("(");
							__CLOVER_253_0.cloverRec.S[21698]++;for(k=0;(((k<attr.type.length) && (++__CLOVER_253_0.cloverRec.CT[6666]!=0|true)) || (++__CLOVER_253_0.cloverRec.CF[6666]==0&false));k++)
							{{
								__CLOVER_253_0.cloverRec.S[21699]++;if((((k>0) && (++__CLOVER_253_0.cloverRec.CT[6667]!=0|true)) || (++__CLOVER_253_0.cloverRec.CF[6667]==0&false)))
								{{
									__CLOVER_253_0.cloverRec.S[21700]++;out.print(";");
								}
								}__CLOVER_253_0.cloverRec.S[21701]++;out.print("p"+(k+1)+":"+attr.type[k]);
							}
							}__CLOVER_253_0.cloverRec.S[21702]++;out.print(")");
						}
						}__CLOVER_253_0.cloverRec.S[21703]++;if((((attr.type_retour!=null) && (++__CLOVER_253_0.cloverRec.CT[6668]!=0|true)) || (++__CLOVER_253_0.cloverRec.CF[6668]==0&false)))
						{{
							__CLOVER_253_0.cloverRec.S[21704]++;out.print(":"+attr.type_retour);
						}
						}__CLOVER_253_0.cloverRec.S[21705]++;if((((attr.type!=null&&attr.type.length>0) && (++__CLOVER_253_0.cloverRec.CT[6669]!=0|true)) || (++__CLOVER_253_0.cloverRec.CF[6669]==0&false)))
						{{
							__CLOVER_253_0.cloverRec.S[21706]++;out.println(" is");
							__CLOVER_253_0.cloverRec.S[21707]++;out.println("\tdo");
							__CLOVER_253_0.cloverRec.S[21708]++;out.println("\tend;");
						}
						}else
						{{
							__CLOVER_253_0.cloverRec.S[21709]++;out.println(";");
						}
						}__CLOVER_253_0.cloverRec.S[21710]++;out.println();
					}
				}}
				}__CLOVER_253_0.cloverRec.S[21711]++;out.println("end");
				__CLOVER_253_0.cloverRec.S[21712]++;out.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				__CLOVER_253_0.cloverRec.S[21713]++;System.err.println(e);
				__CLOVER_253_0.cloverRec.S[21714]++;e.printStackTrace();
			}
		}
		}__CLOVER_253_0.cloverRec.S[21715]++;try {
			__CLOVER_253_0.cloverRec.S[21716]++;f=new File(racine,"test1.e");
			__CLOVER_253_0.cloverRec.S[21717]++;fo=new FileOutputStream(f);
			__CLOVER_253_0.cloverRec.S[21718]++;out=new PrintWriter(fo);
			__CLOVER_253_0.cloverRec.S[21719]++;out.println("class TEST1");
			__CLOVER_253_0.cloverRec.S[21720]++;out.println();
			__CLOVER_253_0.cloverRec.S[21721]++;out.println("feature");
			__CLOVER_253_0.cloverRec.S[21722]++;out.println();
			__CLOVER_253_0.cloverRec.S[21723]++;for(i=0;(((i<liste_classes.size()) && (++__CLOVER_253_0.cloverRec.CT[6670]!=0|true)) || (++__CLOVER_253_0.cloverRec.CF[6670]==0&false));i++)
			{{
				__CLOVER_253_0.cloverRec.S[21724]++;cl=(ClasseTest)liste_classes.elementAt(i);
				__CLOVER_253_0.cloverRec.S[21725]++;out.println("\tattr"+i+":"+cl.nom+";");
			}
			}__CLOVER_253_0.cloverRec.S[21726]++;out.println();
			__CLOVER_253_0.cloverRec.S[21727]++;out.println("end");
			__CLOVER_253_0.cloverRec.S[21728]++;out.close();
			__CLOVER_253_0.cloverRec.S[21729]++;f=new File(racine,nom_ace);
			__CLOVER_253_0.cloverRec.S[21730]++;fo=new FileOutputStream(f);
			__CLOVER_253_0.cloverRec.S[21731]++;out=new PrintWriter(fo);
			__CLOVER_253_0.cloverRec.S[21732]++;out.println("system test1");
			__CLOVER_253_0.cloverRec.S[21733]++;out.println();
			__CLOVER_253_0.cloverRec.S[21734]++;out.println("root test1");
			__CLOVER_253_0.cloverRec.S[21735]++;out.println();
			__CLOVER_253_0.cloverRec.S[21736]++;out.println("cluster");
			__CLOVER_253_0.cloverRec.S[21737]++;out.println();
			__CLOVER_253_0.cloverRec.S[21738]++;out.println("\t\""+racine+"\\\";");
			__CLOVER_253_0.cloverRec.S[21739]++;out.println("\t\".\\\";");
			__CLOVER_253_0.cloverRec.S[21740]++;out.println();
			__CLOVER_253_0.cloverRec.S[21741]++;out.println("end");
			__CLOVER_253_0.cloverRec.S[21742]++;out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			__CLOVER_253_0.cloverRec.S[21743]++;e.printStackTrace();
		}
	}
	
	/**
	 * supprime le fichier chemin ou le repertoire chemin et son contenu
	 * si chemin="toto\tata\titi", le repertoire titi sera supprim\u00e9, 
	 * mais pas toto, ni tata
	 * @param chemin
	 */
	public static void supprime(String chemin)
	{__CLOVER_253_0.cloverRec.M[1496]++;
		__CLOVER_253_0.cloverRec.S[21744]++;File f=new File(chemin);
		__CLOVER_253_0.cloverRec.S[21745]++;supprime(f);
	}
	
	public static void supprime(File f)
	{__CLOVER_253_0.cloverRec.M[1497]++;
		__CLOVER_253_0.cloverRec.S[21746]++;if((((f.exists()) && (++__CLOVER_253_0.cloverRec.CT[6671]!=0|true)) || (++__CLOVER_253_0.cloverRec.CF[6671]==0&false)))
		{{
			__CLOVER_253_0.cloverRec.S[21747]++;if((((f.isDirectory()) && (++__CLOVER_253_0.cloverRec.CT[6672]!=0|true)) || (++__CLOVER_253_0.cloverRec.CF[6672]==0&false)))
			{{
				__CLOVER_253_0.cloverRec.S[21748]++;File liste[];
				__CLOVER_253_0.cloverRec.S[21749]++;int i;
				__CLOVER_253_0.cloverRec.S[21750]++;liste=f.listFiles();
				__CLOVER_253_0.cloverRec.S[21751]++;for(i=0;(((i<liste.length) && (++__CLOVER_253_0.cloverRec.CT[6673]!=0|true)) || (++__CLOVER_253_0.cloverRec.CF[6673]==0&false));i++)
				{{
					__CLOVER_253_0.cloverRec.S[21752]++;supprime(liste[i]);
				}
				}__CLOVER_253_0.cloverRec.S[21753]++;f.delete();
			}
			}else
			{{
				__CLOVER_253_0.cloverRec.S[21754]++;f.delete();
			}
		}}
	}}
	
	public static void main(String[] args) {__CLOVER_253_0.cloverRec.M[1498]++;
		__CLOVER_253_0.cloverRec.S[21755]++;GenereClasses c=new GenereClasses("test\\genere_classe\\test1",
				"test.ace",2,20,3,2);
		__CLOVER_253_0.cloverRec.S[21756]++;c.traitement();
		//supprime("test\\genere_classe\\test1");
	}
}

class ClasseTest
{static class __CLOVER_253_1{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}
	String nom;
	AttributTest liste_attribut[];
}
class AttributTest
{static class __CLOVER_253_2{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}
	String nom;
	String type[];
	String type_retour; 
}