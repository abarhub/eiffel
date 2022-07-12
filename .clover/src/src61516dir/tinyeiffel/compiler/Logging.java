/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ */package tinyeiffel.compiler;

import java.util.*;
import tinyeiffel.erreur.*;

public class Logging
{static class __CLOVER_79_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}
	public Logging()
	{__CLOVER_79_0.cloverRec.M[685]++;
		__CLOVER_79_0.cloverRec.S[12367]++;liste=new Vector();
		__CLOVER_79_0.cloverRec.S[12368]++;liste_erreur=new Vector();
	}

	public void erreurMsg(String text)
	{__CLOVER_79_0.cloverRec.M[686]++;
		__CLOVER_79_0.cloverRec.S[12369]++;liste.addElement(new Log(erreur,text));
	}
	
	public void erreur(Erreur e)
	{__CLOVER_79_0.cloverRec.M[687]++;
		__CLOVER_79_0.cloverRec.S[12370]++;liste_erreur.addElement(e);
	}
	
	public void warningMsg(String text)
	{__CLOVER_79_0.cloverRec.M[688]++;
		__CLOVER_79_0.cloverRec.S[12371]++;liste.addElement(new Log(warning,text));
	}
	
	public void infoMsg(String text)
	{__CLOVER_79_0.cloverRec.M[689]++;
		__CLOVER_79_0.cloverRec.S[12372]++;liste.addElement(new Log(info,text));
	}
	
	public void fatalMsg(String text)
	{__CLOVER_79_0.cloverRec.M[690]++;
		__CLOVER_79_0.cloverRec.S[12373]++;try
		{
			__CLOVER_79_0.cloverRec.S[12374]++;throw new Exception("fatal");
		}
		catch (Exception e)
		{
			__CLOVER_79_0.cloverRec.S[12375]++;int i;
			__CLOVER_79_0.cloverRec.S[12376]++;StackTraceElement[] s=e.getStackTrace();
			__CLOVER_79_0.cloverRec.S[12377]++;text+="\r\nbacktrace:\r\n";
			__CLOVER_79_0.cloverRec.S[12378]++;for(i=0;(((i<s.length) && (++__CLOVER_79_0.cloverRec.CT[2704]!=0|true)) || (++__CLOVER_79_0.cloverRec.CF[2704]==0&false));i++)
			{{
				__CLOVER_79_0.cloverRec.S[12379]++;text+=s[i]+"\r\n";
			}
		}}
		__CLOVER_79_0.cloverRec.S[12380]++;liste.addElement(new Log(fatal,text));
	}
	
	public void affiche()
	{__CLOVER_79_0.cloverRec.M[691]++;
		__CLOVER_79_0.cloverRec.S[12381]++;int i;
		__CLOVER_79_0.cloverRec.S[12382]++;Log log;
		__CLOVER_79_0.cloverRec.S[12383]++;Erreur erreur;
		__CLOVER_79_0.cloverRec.S[12384]++;String nom;

		__CLOVER_79_0.cloverRec.S[12385]++;System.out.println("Liste de tous les messages:");
		__CLOVER_79_0.cloverRec.S[12386]++;for(i=0;(((i<liste.size()) && (++__CLOVER_79_0.cloverRec.CT[2705]!=0|true)) || (++__CLOVER_79_0.cloverRec.CF[2705]==0&false));i++)
		{{
			__CLOVER_79_0.cloverRec.S[12387]++;System.out.print(i+" ");
			__CLOVER_79_0.cloverRec.S[12388]++;log=(Log)liste.elementAt(i);
			__CLOVER_79_0.cloverRec.S[12389]++;System.out.println(noToString(log.no)+":"+log.text);
		}
		}__CLOVER_79_0.cloverRec.S[12390]++;for(i=0;(((i<liste_erreur.size()) && (++__CLOVER_79_0.cloverRec.CT[2706]!=0|true)) || (++__CLOVER_79_0.cloverRec.CF[2706]==0&false));i++)
		{{
			__CLOVER_79_0.cloverRec.S[12391]++;System.out.print(i+":");
			__CLOVER_79_0.cloverRec.S[12392]++;erreur=(Erreur)liste_erreur.elementAt(i);
			__CLOVER_79_0.cloverRec.S[12393]++;nom=erreur.getClass().getName();
			__CLOVER_79_0.cloverRec.S[12394]++;nom=nom.substring(6+1+6);
			__CLOVER_79_0.cloverRec.S[12395]++;System.out.println(nom+":"+erreur.toMsg());
		}
		}__CLOVER_79_0.cloverRec.S[12396]++;System.out.println("Fin de la liste");
	}

	public void affiche(int no)
	{__CLOVER_79_0.cloverRec.M[692]++;
		__CLOVER_79_0.cloverRec.S[12397]++;int i,j;
		__CLOVER_79_0.cloverRec.S[12398]++;Log log;

		__CLOVER_79_0.cloverRec.S[12399]++;System.out.println("Liste des messages "+noToString(no)+" :");
		__CLOVER_79_0.cloverRec.S[12400]++;j=0;
		__CLOVER_79_0.cloverRec.S[12401]++;for(i=0;(((i<liste.size()) && (++__CLOVER_79_0.cloverRec.CT[2707]!=0|true)) || (++__CLOVER_79_0.cloverRec.CF[2707]==0&false));i++)
		{{
			__CLOVER_79_0.cloverRec.S[12402]++;log=(Log)liste.elementAt(i);
			__CLOVER_79_0.cloverRec.S[12403]++;if((((log.no==no) && (++__CLOVER_79_0.cloverRec.CT[2708]!=0|true)) || (++__CLOVER_79_0.cloverRec.CF[2708]==0&false)))
			{{
				__CLOVER_79_0.cloverRec.S[12404]++;System.out.print(j+" ");
				__CLOVER_79_0.cloverRec.S[12405]++;System.out.println(noToString(log.no)+":"+log.text);
				__CLOVER_79_0.cloverRec.S[12406]++;j++;
			}
		}}
		}__CLOVER_79_0.cloverRec.S[12407]++;System.out.println("Fin de la liste");
	}

	String noToString(int no)
	{__CLOVER_79_0.cloverRec.M[693]++;
		__CLOVER_79_0.cloverRec.S[12408]++;boolean __CLOVER_bool0=false;switch(no)
		{
			case erreur:if (!__CLOVER_bool0) {__CLOVER_79_0.cloverRec.S[12409]++;__CLOVER_bool0=true;}
				__CLOVER_79_0.cloverRec.S[12410]++;return "Erreur";
			case warning:if (!__CLOVER_bool0) {__CLOVER_79_0.cloverRec.S[12411]++;__CLOVER_bool0=true;}
				__CLOVER_79_0.cloverRec.S[12412]++;return "Warning";
			case info:if (!__CLOVER_bool0) {__CLOVER_79_0.cloverRec.S[12413]++;__CLOVER_bool0=true;}
				__CLOVER_79_0.cloverRec.S[12414]++;return "Info";
			case fatal:if (!__CLOVER_bool0) {__CLOVER_79_0.cloverRec.S[12415]++;__CLOVER_bool0=true;}
				__CLOVER_79_0.cloverRec.S[12416]++;return "Fatal";
			default:if (!__CLOVER_bool0) {__CLOVER_79_0.cloverRec.S[12417]++;__CLOVER_bool0=true;}
				__CLOVER_79_0.cloverRec.S[12418]++;return "Inconnue";
		}
	}

	public int nb_erreur()
	{__CLOVER_79_0.cloverRec.M[694]++;
		__CLOVER_79_0.cloverRec.S[12419]++;int i,nb=0;
		__CLOVER_79_0.cloverRec.S[12420]++;if((((liste!=null) && (++__CLOVER_79_0.cloverRec.CT[2709]!=0|true)) || (++__CLOVER_79_0.cloverRec.CF[2709]==0&false)))
		{{
			__CLOVER_79_0.cloverRec.S[12421]++;for(i=0;(((i<liste.size()) && (++__CLOVER_79_0.cloverRec.CT[2710]!=0|true)) || (++__CLOVER_79_0.cloverRec.CF[2710]==0&false));i++)
			{{
				__CLOVER_79_0.cloverRec.S[12422]++;Log l=(Log)liste.elementAt(i);
				__CLOVER_79_0.cloverRec.S[12423]++;if((((l.no==erreur) && (++__CLOVER_79_0.cloverRec.CT[2711]!=0|true)) || (++__CLOVER_79_0.cloverRec.CF[2711]==0&false)))
					{__CLOVER_79_0.cloverRec.S[12424]++;nb++;
			}}
		}}
		}__CLOVER_79_0.cloverRec.S[12425]++;return nb+liste_erreur.size();
	}

	public Erreur[] getListe_erreur()
	{__CLOVER_79_0.cloverRec.M[695]++;
		__CLOVER_79_0.cloverRec.S[12426]++;int i;
		__CLOVER_79_0.cloverRec.S[12427]++;Erreur err,liste[];
		__CLOVER_79_0.cloverRec.S[12428]++;liste=new Erreur[liste_erreur.size()];
		__CLOVER_79_0.cloverRec.S[12429]++;for(i=0;(((i<liste.length) && (++__CLOVER_79_0.cloverRec.CT[2712]!=0|true)) || (++__CLOVER_79_0.cloverRec.CF[2712]==0&false));i++)
		{{
			__CLOVER_79_0.cloverRec.S[12430]++;liste[i]=(Erreur)liste_erreur.elementAt(i);
		}
		}__CLOVER_79_0.cloverRec.S[12431]++;return liste;
	}

	public String toString()
	{__CLOVER_79_0.cloverRec.M[696]++;
		__CLOVER_79_0.cloverRec.S[12432]++;int i,j;
		__CLOVER_79_0.cloverRec.S[12433]++;Log log;
		__CLOVER_79_0.cloverRec.S[12434]++;String res="",nom;
		__CLOVER_79_0.cloverRec.S[12435]++;Erreur erreur;

		__CLOVER_79_0.cloverRec.S[12436]++;for(i=0;(((i<liste.size()) && (++__CLOVER_79_0.cloverRec.CT[2713]!=0|true)) || (++__CLOVER_79_0.cloverRec.CF[2713]==0&false));i++)
		{{
			__CLOVER_79_0.cloverRec.S[12437]++;res+=i+" ";
			__CLOVER_79_0.cloverRec.S[12438]++;log=(Log)liste.elementAt(i);
			__CLOVER_79_0.cloverRec.S[12439]++;res+=noToString(log.no)+":"+log.text+"\n";
		}
		}__CLOVER_79_0.cloverRec.S[12440]++;for(i=0;(((i<liste_erreur.size()) && (++__CLOVER_79_0.cloverRec.CT[2714]!=0|true)) || (++__CLOVER_79_0.cloverRec.CF[2714]==0&false));i++)
		{{
			__CLOVER_79_0.cloverRec.S[12441]++;System.out.print(i+":");
			__CLOVER_79_0.cloverRec.S[12442]++;erreur=(Erreur)liste_erreur.elementAt(i);
			__CLOVER_79_0.cloverRec.S[12443]++;nom=erreur.getClass().getName();
			__CLOVER_79_0.cloverRec.S[12444]++;nom=nom.substring(6+1+6);
			__CLOVER_79_0.cloverRec.S[12445]++;res+=nom+":"+erreur.toMsg()+"\n";
		}
		}__CLOVER_79_0.cloverRec.S[12446]++;return res;
	}
	
	private Vector liste,liste_erreur;

	public final int erreur=1,warning=2,info=3,fatal=4;

}