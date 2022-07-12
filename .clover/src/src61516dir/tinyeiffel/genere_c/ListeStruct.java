/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ */package tinyeiffel.genere_c;

import java.util.*;
import tinyeiffel.ast.*;

public class ListeStruct
{static class __CLOVER_183_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}
	public ListeStruct(String nom,boolean tableau,String type)
	{__CLOVER_183_0.cloverRec.M[1063]++;
		assert((((nom!=null)) && (++__CLOVER_183_0.cloverRec.CT[4030]!=0|true)) || (++__CLOVER_183_0.cloverRec.CF[4030]==0&false));
		__CLOVER_183_0.cloverRec.S[16706]++;this.nom=nom;
		__CLOVER_183_0.cloverRec.S[16707]++;liste=new Vector();
		__CLOVER_183_0.cloverRec.S[16708]++;liste_str=new Vector();
		__CLOVER_183_0.cloverRec.S[16709]++;this.tableau=tableau;
		__CLOVER_183_0.cloverRec.S[16710]++;this.type=type;
	}

	public Traite elementAt(int i)
	{__CLOVER_183_0.cloverRec.M[1064]++;
		assert((((i>=0)) && (++__CLOVER_183_0.cloverRec.CT[4031]!=0|true)) || (++__CLOVER_183_0.cloverRec.CF[4031]==0&false));
		assert((((i<liste.size())) && (++__CLOVER_183_0.cloverRec.CT[4032]!=0|true)) || (++__CLOVER_183_0.cloverRec.CF[4032]==0&false));
		__CLOVER_183_0.cloverRec.S[16711]++;return (Traite)liste.elementAt(i);
	}

	public int ajoute(Traite o)
	{__CLOVER_183_0.cloverRec.M[1065]++;
		assert((((o!=null)) && (++__CLOVER_183_0.cloverRec.CT[4033]!=0|true)) || (++__CLOVER_183_0.cloverRec.CF[4033]==0&false));
		assert((((liste.size()==liste_str.size())) && (++__CLOVER_183_0.cloverRec.CT[4034]!=0|true)) || (++__CLOVER_183_0.cloverRec.CF[4034]==0&false));
		__CLOVER_183_0.cloverRec.S[16712]++;int res;
		__CLOVER_183_0.cloverRec.S[16713]++;res=liste.size();
		__CLOVER_183_0.cloverRec.S[16714]++;liste.addElement(o);
		__CLOVER_183_0.cloverRec.S[16715]++;o.set_traite(true);
		__CLOVER_183_0.cloverRec.S[16716]++;liste_str.addElement("");
		__CLOVER_183_0.cloverRec.S[16717]++;return res;
	}

	public int associe(Traite o,String text)
	{__CLOVER_183_0.cloverRec.M[1066]++;
		assert((((o!=null)) && (++__CLOVER_183_0.cloverRec.CT[4035]!=0|true)) || (++__CLOVER_183_0.cloverRec.CF[4035]==0&false));
		assert((((liste.size()==liste_str.size())) && (++__CLOVER_183_0.cloverRec.CT[4036]!=0|true)) || (++__CLOVER_183_0.cloverRec.CF[4036]==0&false));
		__CLOVER_183_0.cloverRec.S[16718]++;int res;
		__CLOVER_183_0.cloverRec.S[16719]++;res=no_objet(o);
		assert((((res>=0)) && (++__CLOVER_183_0.cloverRec.CT[4037]!=0|true)) || (++__CLOVER_183_0.cloverRec.CF[4037]==0&false));
		assert((((res<size())) && (++__CLOVER_183_0.cloverRec.CT[4038]!=0|true)) || (++__CLOVER_183_0.cloverRec.CF[4038]==0&false));
		//liste.addElement(o);
		__CLOVER_183_0.cloverRec.S[16720]++;liste_str.setElementAt(text,res);
		__CLOVER_183_0.cloverRec.S[16721]++;return res;
	}

	public int addElement(Object o,String text)
	{__CLOVER_183_0.cloverRec.M[1067]++;
		assert((((o!=null)) && (++__CLOVER_183_0.cloverRec.CT[4039]!=0|true)) || (++__CLOVER_183_0.cloverRec.CF[4039]==0&false));
		assert((((liste.size()==liste_str.size())) && (++__CLOVER_183_0.cloverRec.CT[4040]!=0|true)) || (++__CLOVER_183_0.cloverRec.CF[4040]==0&false));
		__CLOVER_183_0.cloverRec.S[16722]++;int res;
		__CLOVER_183_0.cloverRec.S[16723]++;res=liste.size();
		__CLOVER_183_0.cloverRec.S[16724]++;liste.addElement(o);
		__CLOVER_183_0.cloverRec.S[16725]++;if((((o instanceof Traite) && (++__CLOVER_183_0.cloverRec.CT[4041]!=0|true)) || (++__CLOVER_183_0.cloverRec.CF[4041]==0&false)))
		{{
			__CLOVER_183_0.cloverRec.S[16726]++;Traite t=(Traite)o;
			__CLOVER_183_0.cloverRec.S[16727]++;t.set_traite(true);
		}
		}__CLOVER_183_0.cloverRec.S[16728]++;liste_str.addElement(text);
		__CLOVER_183_0.cloverRec.S[16729]++;return res;
	}

	public String toString1()
	{__CLOVER_183_0.cloverRec.M[1068]++;
		__CLOVER_183_0.cloverRec.S[16730]++;int i;
		__CLOVER_183_0.cloverRec.S[16731]++;StringBuffer res;
		__CLOVER_183_0.cloverRec.S[16732]++;if((((liste_str.size()==0) && (++__CLOVER_183_0.cloverRec.CT[4042]!=0|true)) || (++__CLOVER_183_0.cloverRec.CF[4042]==0&false)))
			{__CLOVER_183_0.cloverRec.S[16733]++;return "";
		}__CLOVER_183_0.cloverRec.S[16734]++;res=new StringBuffer(type);
		__CLOVER_183_0.cloverRec.S[16735]++;res.append(" ");
		__CLOVER_183_0.cloverRec.S[16736]++;res.append(nom);
		__CLOVER_183_0.cloverRec.S[16737]++;res.append("[");
		__CLOVER_183_0.cloverRec.S[16738]++;res.append(liste_str.size());
		__CLOVER_183_0.cloverRec.S[16739]++;res.append("]={");
		__CLOVER_183_0.cloverRec.S[16740]++;res.append(retour_ligne());
		__CLOVER_183_0.cloverRec.S[16741]++;for(i=0;(((i<liste_str.size()) && (++__CLOVER_183_0.cloverRec.CT[4043]!=0|true)) || (++__CLOVER_183_0.cloverRec.CF[4043]==0&false));i++)
		{{
			__CLOVER_183_0.cloverRec.S[16742]++;if((((i>0) && (++__CLOVER_183_0.cloverRec.CT[4044]!=0|true)) || (++__CLOVER_183_0.cloverRec.CF[4044]==0&false)))
			{{
				__CLOVER_183_0.cloverRec.S[16743]++;res.append(",");
				__CLOVER_183_0.cloverRec.S[16744]++;res.append(retour_ligne());
			}
			}__CLOVER_183_0.cloverRec.S[16745]++;res.append("{");
			__CLOVER_183_0.cloverRec.S[16746]++;res.append(liste_str.elementAt(i));
			__CLOVER_183_0.cloverRec.S[16747]++;res.append("}");
		}
		}__CLOVER_183_0.cloverRec.S[16748]++;res.append("};");
		__CLOVER_183_0.cloverRec.S[16749]++;return res.toString();
	}

	public String toString2()
	{__CLOVER_183_0.cloverRec.M[1069]++;
		__CLOVER_183_0.cloverRec.S[16750]++;int i;
		__CLOVER_183_0.cloverRec.S[16751]++;StringBuffer res=new StringBuffer("");
		__CLOVER_183_0.cloverRec.S[16752]++;String n;
		__CLOVER_183_0.cloverRec.S[16753]++;if((((liste_str.size()==0) && (++__CLOVER_183_0.cloverRec.CT[4045]!=0|true)) || (++__CLOVER_183_0.cloverRec.CF[4045]==0&false)))
			{__CLOVER_183_0.cloverRec.S[16754]++;return "";
		}__CLOVER_183_0.cloverRec.S[16755]++;for(i=0;(((i<liste_str.size()) && (++__CLOVER_183_0.cloverRec.CT[4046]!=0|true)) || (++__CLOVER_183_0.cloverRec.CF[4046]==0&false));i++)
		{{
			//if(i>0)
			//	res+=",";
			__CLOVER_183_0.cloverRec.S[16756]++;n=nom;
			__CLOVER_183_0.cloverRec.S[16757]++;res.append(type);
			__CLOVER_183_0.cloverRec.S[16758]++;res.append(" *");
			__CLOVER_183_0.cloverRec.S[16759]++;res.append(n);
			__CLOVER_183_0.cloverRec.S[16760]++;res.append((i));
			__CLOVER_183_0.cloverRec.S[16761]++;res.append("[");
			__CLOVER_183_0.cloverRec.S[16762]++;res.append(/*liste_str.size()+*/"]={");
			__CLOVER_183_0.cloverRec.S[16763]++;res.append(liste_str.elementAt(i));
			__CLOVER_183_0.cloverRec.S[16764]++;res.append("};");
			__CLOVER_183_0.cloverRec.S[16765]++;res.append(retour_ligne());
		}
		//res+="}";
		}__CLOVER_183_0.cloverRec.S[16766]++;return res.toString();
	}

	public String toString3()
	{__CLOVER_183_0.cloverRec.M[1070]++;
		__CLOVER_183_0.cloverRec.S[16767]++;int i;
		__CLOVER_183_0.cloverRec.S[16768]++;String res="extern "+type+" "+nom+"["+liste_str.size()+"];"+retour_ligne();
		__CLOVER_183_0.cloverRec.S[16769]++;return res;
	}

	public String getNom()
	{__CLOVER_183_0.cloverRec.M[1071]++;
		__CLOVER_183_0.cloverRec.S[16770]++;return nom;
	}

	public boolean est_tableau()
	{__CLOVER_183_0.cloverRec.M[1072]++;
		__CLOVER_183_0.cloverRec.S[16771]++;return tableau;
	}

	protected String retour_ligne()
	{__CLOVER_183_0.cloverRec.M[1073]++;
		__CLOVER_183_0.cloverRec.S[16772]++;return "\r\n";
	}

	public int size()
	{__CLOVER_183_0.cloverRec.M[1074]++;
		__CLOVER_183_0.cloverRec.S[16773]++;return liste.size();
	}

	public int no_objet(Traite o)
	{__CLOVER_183_0.cloverRec.M[1075]++;
		assert((((o!=null)) && (++__CLOVER_183_0.cloverRec.CT[4047]!=0|true)) || (++__CLOVER_183_0.cloverRec.CF[4047]==0&false));
		/*if(o instanceof Classe)
		{// a enlever
			Classe cl,cl2;
			cl=(Classe)o;
			for(int i=0;i<liste.size();i++)
			{
				cl2=(Classe)liste.elementAt(i);
				if(cl==cl2||cl.nom.compareToIgnoreCase(cl2.nom)==0)
					return i;
			}
		}
		else*/
		__CLOVER_183_0.cloverRec.S[16774]++;if((((o.get_traite()) && (++__CLOVER_183_0.cloverRec.CT[4048]!=0|true)) || (++__CLOVER_183_0.cloverRec.CF[4048]==0&false)))
		{{// il est deja referenc\u00e9 
			__CLOVER_183_0.cloverRec.S[16775]++;Date d1,d2;
			__CLOVER_183_0.cloverRec.S[16776]++;boolean trouve;
			__CLOVER_183_0.cloverRec.S[16777]++;long t;
			__CLOVER_183_0.cloverRec.S[16778]++;int i;
			__CLOVER_183_0.cloverRec.S[16779]++;trouve=false;
			__CLOVER_183_0.cloverRec.S[16780]++;d1=new Date();
			__CLOVER_183_0.cloverRec.S[16781]++;for(i=0;(((i<liste.size()) && (++__CLOVER_183_0.cloverRec.CT[4049]!=0|true)) || (++__CLOVER_183_0.cloverRec.CF[4049]==0&false));i++)
			{{
				__CLOVER_183_0.cloverRec.S[16782]++;if((((liste.elementAt(i)==o) && (++__CLOVER_183_0.cloverRec.CT[4050]!=0|true)) || (++__CLOVER_183_0.cloverRec.CF[4050]==0&false)))
				{{
					__CLOVER_183_0.cloverRec.S[16783]++;trouve=true;
					__CLOVER_183_0.cloverRec.S[16784]++;break;
				}
			}}
			}__CLOVER_183_0.cloverRec.S[16785]++;d2=new Date();
			__CLOVER_183_0.cloverRec.S[16786]++;t=d2.getTime()-d1.getTime();
			__CLOVER_183_0.cloverRec.S[16787]++;temp_total+=t;
			__CLOVER_183_0.cloverRec.S[16788]++;if((((trouve) && (++__CLOVER_183_0.cloverRec.CT[4051]!=0|true)) || (++__CLOVER_183_0.cloverRec.CF[4051]==0&false)))
				{__CLOVER_183_0.cloverRec.S[16789]++;return i;
		}}
		}__CLOVER_183_0.cloverRec.S[16790]++;return -1;
	}

	public void affiche_temp_total()
	{__CLOVER_183_0.cloverRec.M[1076]++;
		__CLOVER_183_0.cloverRec.S[16791]++;System.out.println("Temp total recherche="+temp_total+" ms");
	}

	protected static int temp_total=0;
	protected Vector liste;
	protected Vector liste_str;
	protected String nom,type;
	protected boolean tableau;
}
