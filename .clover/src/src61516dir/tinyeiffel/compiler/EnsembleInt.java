/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ *//*
 * Created on 12 d\u00e9c. 2003
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
public class EnsembleInt implements Ensemble {static class __CLOVER_74_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}

	
	/* (non-Javadoc)
	 * @see compiler.Ensemble#contient(compiler.Elt)
	 */
	/*public int contient(Elt e) {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see compiler.Ensemble#contient(compiler.Elt, compiler.Elt)
	 */
	/*public int contient(Elt e1, Elt e2) {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see compiler.Ensemble#ajoute(compiler.Elt)
	 */
	/*public void ajoute(Elt e) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see compiler.Ensemble#ajoute(compiler.Elt, compiler.Elt)
	 */
	/*public void ajoute(Elt e1, Elt e2) {
		// TODO Auto-generated method stub

	}

	/**
	 * 
	 */
	public EnsembleInt(Context context,Classe classe,
						Instr_Inspect instr) {
		super();__CLOVER_74_0.cloverRec.S[11632]++;__CLOVER_74_0.cloverRec.M[621]++;
		assert((((context!=null)) && (++__CLOVER_74_0.cloverRec.CT[2469]!=0|true)) || (++__CLOVER_74_0.cloverRec.CF[2469]==0&false));
		assert((((classe!=null)) && (++__CLOVER_74_0.cloverRec.CT[2470]!=0|true)) || (++__CLOVER_74_0.cloverRec.CF[2470]==0&false));
		assert((((instr!=null)) && (++__CLOVER_74_0.cloverRec.CT[2471]!=0|true)) || (++__CLOVER_74_0.cloverRec.CF[2471]==0&false));
		__CLOVER_74_0.cloverRec.S[11633]++;this.context=context;
		__CLOVER_74_0.cloverRec.S[11634]++;this.classe=classe;
		__CLOVER_74_0.cloverRec.S[11635]++;this.instr=instr;
	}
	
	protected int dans_tab(ElementInt tab[],ElementInt e)
	{__CLOVER_74_0.cloverRec.M[622]++;
		assert((((e!=null)) && (++__CLOVER_74_0.cloverRec.CT[2472]!=0|true)) || (++__CLOVER_74_0.cloverRec.CF[2472]==0&false));
		__CLOVER_74_0.cloverRec.S[11636]++;if((((tab!=null) && (++__CLOVER_74_0.cloverRec.CT[2473]!=0|true)) || (++__CLOVER_74_0.cloverRec.CF[2473]==0&false)))
		{{
			__CLOVER_74_0.cloverRec.S[11637]++;for(int i=0;(((i<liste_elt.length) && (++__CLOVER_74_0.cloverRec.CT[2474]!=0|true)) || (++__CLOVER_74_0.cloverRec.CF[2474]==0&false));i++)
			{{
				__CLOVER_74_0.cloverRec.S[11638]++;if((((e.egal(liste_elt[i])) && (++__CLOVER_74_0.cloverRec.CT[2475]!=0|true)) || (++__CLOVER_74_0.cloverRec.CF[2475]==0&false)))
				{{
					__CLOVER_74_0.cloverRec.S[11639]++;return i;
				}
			}}
		}}
		}__CLOVER_74_0.cloverRec.S[11640]++;return -1;
	}
	
	protected int dans_tab(ElementInt tab[][],ElementInt e)
	{__CLOVER_74_0.cloverRec.M[623]++;
		assert((((e!=null)) && (++__CLOVER_74_0.cloverRec.CT[2476]!=0|true)) || (++__CLOVER_74_0.cloverRec.CF[2476]==0&false));
		__CLOVER_74_0.cloverRec.S[11641]++;if((((tab!=null) && (++__CLOVER_74_0.cloverRec.CT[2477]!=0|true)) || (++__CLOVER_74_0.cloverRec.CF[2477]==0&false)))
		{{
			__CLOVER_74_0.cloverRec.S[11642]++;for(int i=0;(((i<tab.length) && (++__CLOVER_74_0.cloverRec.CT[2478]!=0|true)) || (++__CLOVER_74_0.cloverRec.CF[2478]==0&false));i++)
			{{
				assert((((tab[i].length==2)) && (++__CLOVER_74_0.cloverRec.CT[2479]!=0|true)) || (++__CLOVER_74_0.cloverRec.CF[2479]==0&false));
				__CLOVER_74_0.cloverRec.S[11643]++;if((((e.entre(tab[i][0],tab[i][1])) && (++__CLOVER_74_0.cloverRec.CT[2480]!=0|true)) || (++__CLOVER_74_0.cloverRec.CF[2480]==0&false)))
				{{
					__CLOVER_74_0.cloverRec.S[11644]++;return i;
				}
			}}
		}}
		}__CLOVER_74_0.cloverRec.S[11645]++;return -1;
	}
	
	ElementInt elt,inter[];
	
	public int contient(Elt e)
	{__CLOVER_74_0.cloverRec.M[624]++;
		assert((((e!=null)) && (++__CLOVER_74_0.cloverRec.CT[2481]!=0|true)) || (++__CLOVER_74_0.cloverRec.CF[2481]==0&false));
		assert((((e instanceof ElementInt)) && (++__CLOVER_74_0.cloverRec.CT[2482]!=0|true)) || (++__CLOVER_74_0.cloverRec.CF[2482]==0&false));
		__CLOVER_74_0.cloverRec.S[11646]++;ElementInt e2=(ElementInt)e,e3;
		//if(e2.est_unique)
		{
			
		}
		//else
		{
			__CLOVER_74_0.cloverRec.S[11647]++;int c,c1,c2,res;
			//c=e2.valeur;
			/*if(liste_elt!=null)
			{
				for(int i=0;i<liste_elt.length;i++)
				{
					c1=liste_elt[i].valeur;
					if(c1==c)
					{
						elt=liste_elt[i];
						inter=null;
						return dans_elt;
					}
				}
			}*/
			__CLOVER_74_0.cloverRec.S[11648]++;res=dans_tab(liste_elt,e2);
			__CLOVER_74_0.cloverRec.S[11649]++;if((((res!=-1) && (++__CLOVER_74_0.cloverRec.CT[2483]!=0|true)) || (++__CLOVER_74_0.cloverRec.CF[2483]==0&false)))
			{{
				__CLOVER_74_0.cloverRec.S[11650]++;elt=liste_elt[res];
				__CLOVER_74_0.cloverRec.S[11651]++;inter=null;
				__CLOVER_74_0.cloverRec.S[11652]++;return dans_elt;
			}
			/*if(liste_couple!=null)
			{
				for(int i=0;i<liste_couple.length;i++)
				{
					assert(liste_couple[i].length==2);
					c1=liste_couple[i][0].valeur;
					c2=liste_couple[i][1].valeur;
					if(c>=c1&&c<=c2)
					{
						elt=null;
						inter=liste_couple[i];
						return dans_inter;
					}
				}
			}*/
			}__CLOVER_74_0.cloverRec.S[11653]++;res=dans_tab(liste_couple,e2);
			__CLOVER_74_0.cloverRec.S[11654]++;System.out.println((((((liste_couple==null)) && (++__CLOVER_74_0.cloverRec.CT[2484]!=0|true)) || (++__CLOVER_74_0.cloverRec.CF[2484]==0&false))?"null":liste_couple[0][0].nom.toString()));
			__CLOVER_74_0.cloverRec.S[11655]++;System.out.println("coucou:"+res+":"+e2.nom+";"+
								e2.nom.debut()+"*******************");
			__CLOVER_74_0.cloverRec.S[11656]++;if((((res!=-1) && (++__CLOVER_74_0.cloverRec.CT[2485]!=0|true)) || (++__CLOVER_74_0.cloverRec.CF[2485]==0&false)))
			{{
				__CLOVER_74_0.cloverRec.S[11657]++;elt=null;
				__CLOVER_74_0.cloverRec.S[11658]++;inter=liste_couple[res];
				__CLOVER_74_0.cloverRec.S[11659]++;return dans_inter;
			}
		}}
		__CLOVER_74_0.cloverRec.S[11660]++;return dans_rien;
	}

	protected boolean intersection(ElementInt a1,ElementInt a2,
									ElementInt b1, ElementInt b2)
	{__CLOVER_74_0.cloverRec.M[625]++;
		assert((((a1!=null)) && (++__CLOVER_74_0.cloverRec.CT[2486]!=0|true)) || (++__CLOVER_74_0.cloverRec.CF[2486]==0&false));
		assert((((a2!=null)) && (++__CLOVER_74_0.cloverRec.CT[2487]!=0|true)) || (++__CLOVER_74_0.cloverRec.CF[2487]==0&false));
		assert((((b1!=null)) && (++__CLOVER_74_0.cloverRec.CT[2488]!=0|true)) || (++__CLOVER_74_0.cloverRec.CF[2488]==0&false));
		assert((((b2!=null)) && (++__CLOVER_74_0.cloverRec.CT[2489]!=0|true)) || (++__CLOVER_74_0.cloverRec.CF[2489]==0&false));
		__CLOVER_74_0.cloverRec.S[11661]++;if((((a1.supStrict(a2)||b1.supStrict(b2)) && (++__CLOVER_74_0.cloverRec.CT[2490]!=0|true)) || (++__CLOVER_74_0.cloverRec.CF[2490]==0&false)))
			{__CLOVER_74_0.cloverRec.S[11662]++;return false;
		}__CLOVER_74_0.cloverRec.S[11663]++;if((((a1.entre(b1,b2)||a2.entre(b1,b2)||
			b1.entre(a1,a2)||b2.entre(a1,a2)) && (++__CLOVER_74_0.cloverRec.CT[2491]!=0|true)) || (++__CLOVER_74_0.cloverRec.CF[2491]==0&false)))
			{__CLOVER_74_0.cloverRec.S[11664]++;return true;
		}__CLOVER_74_0.cloverRec.S[11665]++;return false;
	}

	protected int dans_tab(ElementInt tab[],ElementInt e1,ElementInt e2)
	{__CLOVER_74_0.cloverRec.M[626]++;
		assert((((e1!=null)) && (++__CLOVER_74_0.cloverRec.CT[2492]!=0|true)) || (++__CLOVER_74_0.cloverRec.CF[2492]==0&false));
		assert((((e2!=null)) && (++__CLOVER_74_0.cloverRec.CT[2493]!=0|true)) || (++__CLOVER_74_0.cloverRec.CF[2493]==0&false));
		__CLOVER_74_0.cloverRec.S[11666]++;if((((e1.supStrict(e2)) && (++__CLOVER_74_0.cloverRec.CT[2494]!=0|true)) || (++__CLOVER_74_0.cloverRec.CF[2494]==0&false)))
			{__CLOVER_74_0.cloverRec.S[11667]++;return -1;
		}__CLOVER_74_0.cloverRec.S[11668]++;if((((tab!=null) && (++__CLOVER_74_0.cloverRec.CT[2495]!=0|true)) || (++__CLOVER_74_0.cloverRec.CF[2495]==0&false)))
		{{
			__CLOVER_74_0.cloverRec.S[11669]++;for(int i=0;(((i<tab.length) && (++__CLOVER_74_0.cloverRec.CT[2496]!=0|true)) || (++__CLOVER_74_0.cloverRec.CF[2496]==0&false));i++)
			{{
				__CLOVER_74_0.cloverRec.S[11670]++;if((((tab[i].entre(e1,e2)) && (++__CLOVER_74_0.cloverRec.CT[2497]!=0|true)) || (++__CLOVER_74_0.cloverRec.CF[2497]==0&false)))
				{{
					__CLOVER_74_0.cloverRec.S[11671]++;return i;
				}
			}}
		}}
		}__CLOVER_74_0.cloverRec.S[11672]++;return -1;
	}
	
	protected int dans_tab(ElementInt tab[][],
							ElementInt e1,ElementInt e2)
	{__CLOVER_74_0.cloverRec.M[627]++;
		assert((((e1!=null)) && (++__CLOVER_74_0.cloverRec.CT[2498]!=0|true)) || (++__CLOVER_74_0.cloverRec.CF[2498]==0&false));
		assert((((e2!=null)) && (++__CLOVER_74_0.cloverRec.CT[2499]!=0|true)) || (++__CLOVER_74_0.cloverRec.CF[2499]==0&false));
		__CLOVER_74_0.cloverRec.S[11673]++;if((((e1.supStrict(e2)) && (++__CLOVER_74_0.cloverRec.CT[2500]!=0|true)) || (++__CLOVER_74_0.cloverRec.CF[2500]==0&false)))
			{__CLOVER_74_0.cloverRec.S[11674]++;return -1;
		}__CLOVER_74_0.cloverRec.S[11675]++;if((((tab!=null) && (++__CLOVER_74_0.cloverRec.CT[2501]!=0|true)) || (++__CLOVER_74_0.cloverRec.CF[2501]==0&false)))
		{{
			__CLOVER_74_0.cloverRec.S[11676]++;for(int i=0;(((i<tab.length) && (++__CLOVER_74_0.cloverRec.CT[2502]!=0|true)) || (++__CLOVER_74_0.cloverRec.CF[2502]==0&false));i++)
			{{
				assert((((tab[i].length==2)) && (++__CLOVER_74_0.cloverRec.CT[2503]!=0|true)) || (++__CLOVER_74_0.cloverRec.CF[2503]==0&false));
				//c2=tab[i][0].valeur;
				//c3=tab[i][1].valeur;
				//if(e2.infStrict(tab[i][0])||e1.supStrict(tab[i][1]))//(c1<c2||c0>c3)
				{
					
				}
				//else
				__CLOVER_74_0.cloverRec.S[11677]++;if((((intersection(e1,e2,tab[i][0],tab[i][1])) && (++__CLOVER_74_0.cloverRec.CT[2504]!=0|true)) || (++__CLOVER_74_0.cloverRec.CF[2504]==0&false)))
				{{
					__CLOVER_74_0.cloverRec.S[11678]++;return i;
				}
			}}
		}}
		}__CLOVER_74_0.cloverRec.S[11679]++;return -1;
	}

	public int contient(Elt e1,Elt e2)
	{__CLOVER_74_0.cloverRec.M[628]++;
		assert((((e1!=null)) && (++__CLOVER_74_0.cloverRec.CT[2505]!=0|true)) || (++__CLOVER_74_0.cloverRec.CF[2505]==0&false));
		assert((((e1 instanceof ElementInt)) && (++__CLOVER_74_0.cloverRec.CT[2506]!=0|true)) || (++__CLOVER_74_0.cloverRec.CF[2506]==0&false));
		assert((((e2!=null)) && (++__CLOVER_74_0.cloverRec.CT[2507]!=0|true)) || (++__CLOVER_74_0.cloverRec.CF[2507]==0&false));
		assert((((e2 instanceof ElementInt)) && (++__CLOVER_74_0.cloverRec.CT[2508]!=0|true)) || (++__CLOVER_74_0.cloverRec.CF[2508]==0&false));
		__CLOVER_74_0.cloverRec.S[11680]++;ElementInt e=(ElementInt)e1;
		__CLOVER_74_0.cloverRec.S[11681]++;ElementInt e4=(ElementInt)e2;
		__CLOVER_74_0.cloverRec.S[11682]++;int c0,c1,c2,c3,res;
		//c0=e.valeur;
		//c1=e4.valeur;
		assert((((e.infEgal(e4))) && (++__CLOVER_74_0.cloverRec.CT[2509]!=0|true)) || (++__CLOVER_74_0.cloverRec.CF[2509]==0&false)):">:"+e.supStrict(e4)+":"+e.infEgal(e4);
		//assert(c0<=c1);
		/*if(liste_elt!=null)
		{
			for(int i=0;i<liste_elt.length;i++)
			{
				c2=liste_elt[i].valeur;
				if(c2>=c0&&c2<=c1)
				{
					elt=liste_elt[i];
					inter=null;
					return dans_elt;
				}
			}
		}*/
		__CLOVER_74_0.cloverRec.S[11683]++;res=dans_tab(liste_elt,e,e4);
		__CLOVER_74_0.cloverRec.S[11684]++;if((((res!=-1) && (++__CLOVER_74_0.cloverRec.CT[2510]!=0|true)) || (++__CLOVER_74_0.cloverRec.CF[2510]==0&false)))
		{{
			__CLOVER_74_0.cloverRec.S[11685]++;elt=liste_elt[res];
			__CLOVER_74_0.cloverRec.S[11686]++;inter=null;
			__CLOVER_74_0.cloverRec.S[11687]++;return dans_elt;
		}
		/*if(liste_couple!=null)
		{
			for(int i=0;i<liste_couple.length;i++)
			{
				assert(liste_couple[i].length==2);
				c2=liste_couple[i][0].valeur;
				c3=liste_couple[i][1].valeur;
				if(c1<c2||c0>c3)
				{
					
				}
				else
				{
					inter=liste_couple[i];
					elt=null;
					return dans_inter;
				}
			}
		}*/
		}__CLOVER_74_0.cloverRec.S[11688]++;res=dans_tab(liste_couple,e,e4);
		__CLOVER_74_0.cloverRec.S[11689]++;if((((res!=-1) && (++__CLOVER_74_0.cloverRec.CT[2511]!=0|true)) || (++__CLOVER_74_0.cloverRec.CF[2511]==0&false)))
		{{
			__CLOVER_74_0.cloverRec.S[11690]++;inter=liste_couple[res];
			__CLOVER_74_0.cloverRec.S[11691]++;elt=null;
			__CLOVER_74_0.cloverRec.S[11692]++;return dans_inter;
		}
		}__CLOVER_74_0.cloverRec.S[11693]++;return dans_rien;
	}
	
	protected Vector vecteur_inter(ElementInt inter[])
	{__CLOVER_74_0.cloverRec.M[629]++;
		assert((((inter!=null)) && (++__CLOVER_74_0.cloverRec.CT[2512]!=0|true)) || (++__CLOVER_74_0.cloverRec.CF[2512]==0&false));
		assert((((inter.length==2)) && (++__CLOVER_74_0.cloverRec.CT[2513]!=0|true)) || (++__CLOVER_74_0.cloverRec.CF[2513]==0&false));
		__CLOVER_74_0.cloverRec.S[11694]++;Vector v=new Vector();
		__CLOVER_74_0.cloverRec.S[11695]++;v.addElement(inter[0].nom);
		__CLOVER_74_0.cloverRec.S[11696]++;v.addElement(inter[1].nom);
		__CLOVER_74_0.cloverRec.S[11697]++;return v;
	}
	
	protected void erreur(ElementInt e)
	{__CLOVER_74_0.cloverRec.M[630]++;
		__CLOVER_74_0.cloverRec.S[11698]++;boolean __CLOVER_bool0=false;switch(contient(e))
		{
			case dans_elt:if (!__CLOVER_bool0) {__CLOVER_74_0.cloverRec.S[11699]++;__CLOVER_bool0=true;}
				__CLOVER_74_0.cloverRec.S[11700]++;if((((e.est_unique) && (++__CLOVER_74_0.cloverRec.CT[2514]!=0|true)) || (++__CLOVER_74_0.cloverRec.CF[2514]==0&false)))
					{__CLOVER_74_0.cloverRec.S[11701]++;context.erreur(new ErreurVOMB4(classe,instr,
											e.nom,elt.nom));
				}else
					{__CLOVER_74_0.cloverRec.S[11702]++;context.erreur(new ErreurVOMB3(classe,instr,
								e.nom,elt.nom));
				}__CLOVER_74_0.cloverRec.S[11703]++;break;
			case dans_inter:if (!__CLOVER_bool0) {__CLOVER_74_0.cloverRec.S[11704]++;__CLOVER_bool0=true;}
				__CLOVER_74_0.cloverRec.S[11705]++;if((((e.est_unique) && (++__CLOVER_74_0.cloverRec.CT[2515]!=0|true)) || (++__CLOVER_74_0.cloverRec.CF[2515]==0&false)))
					{__CLOVER_74_0.cloverRec.S[11706]++;context.erreur(new ErreurVOMB4(classe,instr,
									e.nom,vecteur_inter(inter)));
				}else
					{__CLOVER_74_0.cloverRec.S[11707]++;context.erreur(new ErreurVOMB3(classe,instr,
									e.nom,vecteur_inter(inter)));
				}__CLOVER_74_0.cloverRec.S[11708]++;break;
			default:if (!__CLOVER_bool0) {__CLOVER_74_0.cloverRec.S[11709]++;__CLOVER_bool0=true;}
				assert((((false)) && (++__CLOVER_74_0.cloverRec.CT[2516]!=0|true)) || (++__CLOVER_74_0.cloverRec.CF[2516]==0&false));
		}
	}

	protected void erreur(ElementInt e1,ElementInt e2)
	{__CLOVER_74_0.cloverRec.M[631]++;
		__CLOVER_74_0.cloverRec.S[11710]++;Vector v=new Vector();
		__CLOVER_74_0.cloverRec.S[11711]++;v.addElement(e1.nom);
		__CLOVER_74_0.cloverRec.S[11712]++;v.addElement(e2.nom);
		__CLOVER_74_0.cloverRec.S[11713]++;boolean __CLOVER_bool1=false;switch(contient(e1,e2))
		{
			case dans_elt:if (!__CLOVER_bool1) {__CLOVER_74_0.cloverRec.S[11714]++;__CLOVER_bool1=true;}
				__CLOVER_74_0.cloverRec.S[11715]++;if((((e1.est_unique||e2.est_unique) && (++__CLOVER_74_0.cloverRec.CT[2517]!=0|true)) || (++__CLOVER_74_0.cloverRec.CF[2517]==0&false)))
					{__CLOVER_74_0.cloverRec.S[11716]++;context.erreur(new ErreurVOMB4(classe,
							instr,elt.nom,v));
				}else
					{__CLOVER_74_0.cloverRec.S[11717]++;context.erreur(new ErreurVOMB3(classe,
							instr,elt.nom,v));
				}__CLOVER_74_0.cloverRec.S[11718]++;break;
			case dans_inter:if (!__CLOVER_bool1) {__CLOVER_74_0.cloverRec.S[11719]++;__CLOVER_bool1=true;}
				__CLOVER_74_0.cloverRec.S[11720]++;if((((e1.est_unique||e2.est_unique) && (++__CLOVER_74_0.cloverRec.CT[2518]!=0|true)) || (++__CLOVER_74_0.cloverRec.CF[2518]==0&false)))
					{__CLOVER_74_0.cloverRec.S[11721]++;context.erreur(new ErreurVOMB4(classe,instr,v,
										vecteur_inter(inter)));
				}else
					{__CLOVER_74_0.cloverRec.S[11722]++;context.erreur(new ErreurVOMB3(classe,instr,v,
								vecteur_inter(inter)));
				}__CLOVER_74_0.cloverRec.S[11723]++;break;
			default:if (!__CLOVER_bool1) {__CLOVER_74_0.cloverRec.S[11724]++;__CLOVER_bool1=true;}
				assert((((false)) && (++__CLOVER_74_0.cloverRec.CT[2519]!=0|true)) || (++__CLOVER_74_0.cloverRec.CF[2519]==0&false));
		}
	}
	
	protected ElementInt[] add(ElementInt tab[],ElementInt e)
	{__CLOVER_74_0.cloverRec.M[632]++;
		assert((((e!=null)) && (++__CLOVER_74_0.cloverRec.CT[2520]!=0|true)) || (++__CLOVER_74_0.cloverRec.CF[2520]==0&false));
		__CLOVER_74_0.cloverRec.S[11725]++;if((((tab==null) && (++__CLOVER_74_0.cloverRec.CT[2521]!=0|true)) || (++__CLOVER_74_0.cloverRec.CF[2521]==0&false)))
		{{
			__CLOVER_74_0.cloverRec.S[11726]++;tab=new ElementInt[1];
			__CLOVER_74_0.cloverRec.S[11727]++;tab[0]=e;
		}
		}else
		{{
			__CLOVER_74_0.cloverRec.S[11728]++;ElementInt tmp[];
			__CLOVER_74_0.cloverRec.S[11729]++;int i;
			__CLOVER_74_0.cloverRec.S[11730]++;tmp=new ElementInt[tab.length+1];
			__CLOVER_74_0.cloverRec.S[11731]++;for(i=0;(((i<tab.length) && (++__CLOVER_74_0.cloverRec.CT[2522]!=0|true)) || (++__CLOVER_74_0.cloverRec.CF[2522]==0&false));i++)
				{__CLOVER_74_0.cloverRec.S[11732]++;tmp[i]=tab[i];
			}__CLOVER_74_0.cloverRec.S[11733]++;tmp[i]=e;
			__CLOVER_74_0.cloverRec.S[11734]++;tab=tmp;
		}
		}__CLOVER_74_0.cloverRec.S[11735]++;return tab;
	}
	
	public void ajoute(Elt e)
	{__CLOVER_74_0.cloverRec.M[633]++;
		assert((((e!=null)) && (++__CLOVER_74_0.cloverRec.CT[2523]!=0|true)) || (++__CLOVER_74_0.cloverRec.CF[2523]==0&false));
		assert((((e instanceof ElementInt)) && (++__CLOVER_74_0.cloverRec.CT[2524]!=0|true)) || (++__CLOVER_74_0.cloverRec.CF[2524]==0&false));
		//assert(contient(e)!=dans_rien);
		__CLOVER_74_0.cloverRec.S[11736]++;if((((contient(e)!=dans_rien) && (++__CLOVER_74_0.cloverRec.CT[2525]!=0|true)) || (++__CLOVER_74_0.cloverRec.CF[2525]==0&false)))
		{{
			__CLOVER_74_0.cloverRec.S[11737]++;erreur((ElementInt)e);
			__CLOVER_74_0.cloverRec.S[11738]++;return;
		}
		}__CLOVER_74_0.cloverRec.S[11739]++;ElementInt e1=(ElementInt)e;
		__CLOVER_74_0.cloverRec.S[11740]++;verifie_unique(e1);
		//if(e1.est_unique)
		{
			
		}
		//else
		{
			__CLOVER_74_0.cloverRec.S[11741]++;liste_elt=add(liste_elt,e1);
		}
		/*if(liste_elt==null)
		{
			liste_elt=new ElementInt[1];
			liste_elt[0]=e1;
		}
		else
		{
			ElementInt tmp[];
			int i;
			tmp=new ElementInt[liste_elt.length+1];
			for(i=0;i<liste_elt.length;i++)
				tmp[i]=liste_elt[i];
			tmp[i]=e1;
			liste_elt=tmp;
		}*/
	}

	protected ElementInt[][] add(ElementInt tab[][],
							ElementInt e1,ElementInt e2)
	{__CLOVER_74_0.cloverRec.M[634]++;
		assert((((e1!=null)) && (++__CLOVER_74_0.cloverRec.CT[2526]!=0|true)) || (++__CLOVER_74_0.cloverRec.CF[2526]==0&false));
		assert((((e2!=null)) && (++__CLOVER_74_0.cloverRec.CT[2527]!=0|true)) || (++__CLOVER_74_0.cloverRec.CF[2527]==0&false));
		__CLOVER_74_0.cloverRec.S[11742]++;if((((tab==null) && (++__CLOVER_74_0.cloverRec.CT[2528]!=0|true)) || (++__CLOVER_74_0.cloverRec.CF[2528]==0&false)))
		{{
			__CLOVER_74_0.cloverRec.S[11743]++;tab=new ElementInt[1][];
			__CLOVER_74_0.cloverRec.S[11744]++;tab[0]=new ElementInt[2];
			__CLOVER_74_0.cloverRec.S[11745]++;tab[0][0]=e1;
			__CLOVER_74_0.cloverRec.S[11746]++;tab[0][1]=e2;
		}
		}else
		{{
			__CLOVER_74_0.cloverRec.S[11747]++;ElementInt tmp[][];
			__CLOVER_74_0.cloverRec.S[11748]++;int i;
			__CLOVER_74_0.cloverRec.S[11749]++;tmp=new ElementInt[tab.length+1][];
			__CLOVER_74_0.cloverRec.S[11750]++;for(i=0;(((i<tab.length) && (++__CLOVER_74_0.cloverRec.CT[2529]!=0|true)) || (++__CLOVER_74_0.cloverRec.CF[2529]==0&false));i++)
				{__CLOVER_74_0.cloverRec.S[11751]++;tmp[i]=tab[i];
			}__CLOVER_74_0.cloverRec.S[11752]++;tmp[i]=new ElementInt[2];
			__CLOVER_74_0.cloverRec.S[11753]++;tmp[i][0]=e1;
			__CLOVER_74_0.cloverRec.S[11754]++;tmp[i][1]=e2;
			__CLOVER_74_0.cloverRec.S[11755]++;tab=tmp;
		}
		}__CLOVER_74_0.cloverRec.S[11756]++;return tab;
	}

	public void ajoute(Elt e1,Elt e2)
	{__CLOVER_74_0.cloverRec.M[635]++;
		assert((((e1!=null)) && (++__CLOVER_74_0.cloverRec.CT[2530]!=0|true)) || (++__CLOVER_74_0.cloverRec.CF[2530]==0&false));
		assert((((e2!=null)) && (++__CLOVER_74_0.cloverRec.CT[2531]!=0|true)) || (++__CLOVER_74_0.cloverRec.CF[2531]==0&false));
		assert((((e1 instanceof ElementInt)) && (++__CLOVER_74_0.cloverRec.CT[2532]!=0|true)) || (++__CLOVER_74_0.cloverRec.CF[2532]==0&false));
		assert((((e2 instanceof ElementInt)) && (++__CLOVER_74_0.cloverRec.CT[2533]!=0|true)) || (++__CLOVER_74_0.cloverRec.CF[2533]==0&false));
		//assert(contient(e1,e2)!=dans_rien);
		__CLOVER_74_0.cloverRec.S[11757]++;ElementInt e3=(ElementInt)e1;
		__CLOVER_74_0.cloverRec.S[11758]++;ElementInt e4=(ElementInt)e2;
		__CLOVER_74_0.cloverRec.S[11759]++;verifie_unique(e3);
		__CLOVER_74_0.cloverRec.S[11760]++;verifie_unique(e4);
		//if(e3.est_unique)
		{
			
		}
		//else
		{
			__CLOVER_74_0.cloverRec.S[11761]++;if((((e3.supStrict(e4)) && (++__CLOVER_74_0.cloverRec.CT[2534]!=0|true)) || (++__CLOVER_74_0.cloverRec.CF[2534]==0&false)))//(e3.valeur>e4.valeur)
				{__CLOVER_74_0.cloverRec.S[11762]++;return;
			}__CLOVER_74_0.cloverRec.S[11763]++;if((((contient(e1,e2)!=dans_rien) && (++__CLOVER_74_0.cloverRec.CT[2535]!=0|true)) || (++__CLOVER_74_0.cloverRec.CF[2535]==0&false)))
			{{
				__CLOVER_74_0.cloverRec.S[11764]++;erreur(e3,e4);
			}
			}assert((((e3.infEgal(e4))) && (++__CLOVER_74_0.cloverRec.CT[2536]!=0|true)) || (++__CLOVER_74_0.cloverRec.CF[2536]==0&false));//(e3.valeur<=e4.valeur);
			__CLOVER_74_0.cloverRec.S[11765]++;liste_couple=add(liste_couple,e3,e4);
		}
		
		/*if(liste_couple==null)
		{
			liste_couple=new ElementInt[1][];
			liste_couple[0]=new ElementInt[2];
			liste_couple[0][0]=e3;
			liste_couple[0][1]=e4;
		}
		else
		{
			ElementInt tmp[][];
			int i;
			tmp=new ElementInt[liste_couple.length+1][];
			for(i=0;i<liste_couple.length;i++)
				tmp[i]=liste_couple[i];
			tmp[i]=new ElementInt[2];
			tmp[i][0]=e3;
			tmp[i][1]=e4;
			liste_couple=tmp;
		}*/
	}
	
	protected void verifie_unique(ElementInt e)
	{__CLOVER_74_0.cloverRec.M[636]++;
		assert((((e!=null)) && (++__CLOVER_74_0.cloverRec.CT[2537]!=0|true)) || (++__CLOVER_74_0.cloverRec.CF[2537]==0&false));
		__CLOVER_74_0.cloverRec.S[11766]++;if((((e.est_unique) && (++__CLOVER_74_0.cloverRec.CT[2538]!=0|true)) || (++__CLOVER_74_0.cloverRec.CF[2538]==0&false)))
		{{
			__CLOVER_74_0.cloverRec.S[11767]++;if((((this.entier_positif) && (++__CLOVER_74_0.cloverRec.CT[2539]!=0|true)) || (++__CLOVER_74_0.cloverRec.CF[2539]==0&false)))
			{{
				__CLOVER_74_0.cloverRec.S[11768]++;context.erreur(new ErreurVOMB5(classe,instr,
												entier.nom));
			}
			}else
			{{
				__CLOVER_74_0.cloverRec.S[11769]++;entier_unique=true;
			}
		}}
		}else
		{{
			__CLOVER_74_0.cloverRec.S[11770]++;if((((e.valeur>0) && (++__CLOVER_74_0.cloverRec.CT[2540]!=0|true)) || (++__CLOVER_74_0.cloverRec.CF[2540]==0&false)))
			{{
				__CLOVER_74_0.cloverRec.S[11771]++;if((((this.entier_unique) && (++__CLOVER_74_0.cloverRec.CT[2541]!=0|true)) || (++__CLOVER_74_0.cloverRec.CF[2541]==0&false)))
				{{
					__CLOVER_74_0.cloverRec.S[11772]++;context.erreur(new ErreurVOMB5(classe,instr,
													e.nom));
				}
				}else
				{{
					__CLOVER_74_0.cloverRec.S[11773]++;entier_positif=true;
					__CLOVER_74_0.cloverRec.S[11774]++;entier=e;
				}
			}}
		}}
	}}
	
	protected ElementInt liste_elt[],liste_couple[][];
	//protected ElementInt liste_elt_unique[],liste_couple_unique[][];
	protected Context context;
	protected Classe classe;
	protected Instr_Inspect instr;
	protected boolean entier_positif,entier_unique;
	protected ElementInt entier;
	

}
