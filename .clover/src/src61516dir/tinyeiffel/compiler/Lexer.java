/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ */package tinyeiffel.compiler;

import java.io.*;
import tinyeiffel.ast.*;
import java.util.*;

public class Lexer extends Lexer_Constantes
{static class __CLOVER_76_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}
	public Lexer()
	{__CLOVER_76_0.cloverRec.M[661]++;
		__CLOVER_76_0.cloverRec.S[11825]++;etatOk=true;
	}

	/*public Lexer(FileInputStream f)
	{
		etatOk=true;
		contenu="";
		nom_fichier=nom;
		init_lexer();
		try{
			BufferedReader entree=new BufferedReader(new FileReader(nom));
			String line;
			do
			{
				line=entree.readLine();
				if(line!=null)
				{
					contenu+=line+"\n";
				}
			} while(line!=null);
			pos=0;
			pos_dernier=0;
			liste_dernier_token=new Token[10];
			nb_token_lu=0;
		} catch(IOException e)
		{
			etatOk=false;
			System.out.println("Exception IO:"+e);
			//System.
			System.exit(0);
		}
	}*/

		/********************* lexer **************************/

	public String str_debug()
	{__CLOVER_76_0.cloverRec.M[662]++;
		__CLOVER_76_0.cloverRec.S[11826]++;int i;
		__CLOVER_76_0.cloverRec.S[11827]++;String res="etatOk="+etatOk+"\n";
		__CLOVER_76_0.cloverRec.S[11828]++;res+="pos_dernier="+pos_dernier+",nb_token_lu="+nb_token_lu+"\n";
		__CLOVER_76_0.cloverRec.S[11829]++;if((((liste_dernier_token!=null) && (++__CLOVER_76_0.cloverRec.CT[2592]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2592]==0&false)))
		{{
			__CLOVER_76_0.cloverRec.S[11830]++;for(i=0;(((i<liste_dernier_token.length) && (++__CLOVER_76_0.cloverRec.CT[2593]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2593]==0&false));i++)
			{{
				__CLOVER_76_0.cloverRec.S[11831]++;res+="token["+i+"]="+toStringToken(liste_dernier_token[i])+"\n";
			}
		}}
		}__CLOVER_76_0.cloverRec.S[11832]++;return res;
	}

	public void ouvre(String nom) throws FileNotFoundException
	{__CLOVER_76_0.cloverRec.M[663]++;
		__CLOVER_76_0.cloverRec.S[11833]++;contenu="";
		__CLOVER_76_0.cloverRec.S[11834]++;nom_fichier=nom;
		__CLOVER_76_0.cloverRec.S[11835]++;init_lexer();
		//try{
		__CLOVER_76_0.cloverRec.S[11836]++;BufferedReader entree=new BufferedReader(new FileReader(nom));
		__CLOVER_76_0.cloverRec.S[11837]++;String line;
		__CLOVER_76_0.cloverRec.S[11838]++;try{
			__CLOVER_76_0.cloverRec.S[11839]++;do
			{{
				__CLOVER_76_0.cloverRec.S[11840]++;line=entree.readLine();
				__CLOVER_76_0.cloverRec.S[11841]++;if((((line!=null) && (++__CLOVER_76_0.cloverRec.CT[2594]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2594]==0&false)))
				{{
					__CLOVER_76_0.cloverRec.S[11842]++;contenu+=line+"\n";
				}
			}} }while((((line!=null) && (++__CLOVER_76_0.cloverRec.CT[2595]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2595]==0&false)));
			__CLOVER_76_0.cloverRec.S[11843]++;pos=0;
			__CLOVER_76_0.cloverRec.S[11844]++;pos_dernier=0;
			__CLOVER_76_0.cloverRec.S[11845]++;liste_dernier_token=new Token[10];
			__CLOVER_76_0.cloverRec.S[11846]++;nb_token_lu=0;
		} catch(IOException e)
		{
			__CLOVER_76_0.cloverRec.S[11847]++;etatOk=false;
			__CLOVER_76_0.cloverRec.S[11848]++;System.out.println("Exception IO:"+e);
			//System.
			__CLOVER_76_0.cloverRec.S[11849]++;System.exit(0);
		}
	}

	public boolean test_prochain(int tab[])
	{__CLOVER_76_0.cloverRec.M[664]++;
		__CLOVER_76_0.cloverRec.S[11850]++;int i;
		__CLOVER_76_0.cloverRec.S[11851]++;Token t=null;
		assert((((tab!=null)) && (++__CLOVER_76_0.cloverRec.CT[2596]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2596]==0&false));
		assert((((tab.length>0)) && (++__CLOVER_76_0.cloverRec.CT[2597]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2597]==0&false));
		__CLOVER_76_0.cloverRec.S[11852]++;if((((nb_token_lu>pos_dernier) && (++__CLOVER_76_0.cloverRec.CT[2598]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2598]==0&false)))
		{{// on a deja lu au moins un token
			__CLOVER_76_0.cloverRec.S[11853]++;t=liste_dernier_token[pos_dernier];
		}
		}else
		{{
			//suivant_deja_lu=true;
			//t=getToken();
			__CLOVER_76_0.cloverRec.S[11854]++;if((((prefreshNbToken(1)) && (++__CLOVER_76_0.cloverRec.CT[2599]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2599]==0&false)))
				{__CLOVER_76_0.cloverRec.S[11855]++;t=liste_dernier_token[pos_dernier];
		}}
		}__CLOVER_76_0.cloverRec.S[11856]++;if((((t!=null) && (++__CLOVER_76_0.cloverRec.CT[2600]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2600]==0&false)))
		{{
			__CLOVER_76_0.cloverRec.S[11857]++;for(i=0;(((i<tab.length) && (++__CLOVER_76_0.cloverRec.CT[2601]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2601]==0&false));i++)
			{{
				__CLOVER_76_0.cloverRec.S[11858]++;if((((tab[i]==t.get_type_token()) && (++__CLOVER_76_0.cloverRec.CT[2602]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2602]==0&false)))
				{{
					__CLOVER_76_0.cloverRec.S[11859]++;return true;
				}
			}}
		}}
		}__CLOVER_76_0.cloverRec.S[11860]++;return false;
	}

	public boolean test_prochain2(int tab[],int tab2[])
	{__CLOVER_76_0.cloverRec.M[665]++;
		__CLOVER_76_0.cloverRec.S[11861]++;int i,j;
		__CLOVER_76_0.cloverRec.S[11862]++;Token t=null,t2=null;
		assert((((tab!=null)) && (++__CLOVER_76_0.cloverRec.CT[2603]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2603]==0&false));
		assert((((tab.length>0)) && (++__CLOVER_76_0.cloverRec.CT[2604]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2604]==0&false));
		__CLOVER_76_0.cloverRec.S[11863]++;if((((nb_token_lu>pos_dernier+1) && (++__CLOVER_76_0.cloverRec.CT[2605]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2605]==0&false)))
		{{// on a deja lu au moins 2 tokens
			__CLOVER_76_0.cloverRec.S[11864]++;t=liste_dernier_token[pos_dernier];
			__CLOVER_76_0.cloverRec.S[11865]++;t2=liste_dernier_token[pos_dernier+1];
		}
		}else
		{{
			//suivant_deja_lu=true;
			//t=getToken();
			__CLOVER_76_0.cloverRec.S[11866]++;if((((prefreshNbToken(2)) && (++__CLOVER_76_0.cloverRec.CT[2606]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2606]==0&false)))
			{{
				__CLOVER_76_0.cloverRec.S[11867]++;t=liste_dernier_token[pos_dernier];
				__CLOVER_76_0.cloverRec.S[11868]++;t2=liste_dernier_token[pos_dernier+1];
			}
		}}
		}__CLOVER_76_0.cloverRec.S[11869]++;if((((t!=null&&t2!=null) && (++__CLOVER_76_0.cloverRec.CT[2607]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2607]==0&false)))
		{{
			__CLOVER_76_0.cloverRec.S[11870]++;int oldi=0,oldj;
			__CLOVER_76_0.cloverRec.S[11871]++;for(i=0;(((i<tab.length) && (++__CLOVER_76_0.cloverRec.CT[2608]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2608]==0&false));i++)
			{{
				//System.out.println("i="+i);
				assert((((i==0||oldi+1==i)) && (++__CLOVER_76_0.cloverRec.CT[2609]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2609]==0&false));
				__CLOVER_76_0.cloverRec.S[11872]++;if((((tab[i]==t.get_type_token()) && (++__CLOVER_76_0.cloverRec.CT[2610]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2610]==0&false)))
				{{
					__CLOVER_76_0.cloverRec.S[11873]++;oldj=0;
					__CLOVER_76_0.cloverRec.S[11874]++;for(j=0;(((j<tab2.length) && (++__CLOVER_76_0.cloverRec.CT[2611]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2611]==0&false));j++)
					{{
						//System.out.println("j="+j);
						assert((((j==0||oldj+1==j)) && (++__CLOVER_76_0.cloverRec.CT[2612]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2612]==0&false));
						__CLOVER_76_0.cloverRec.S[11875]++;if((((tab2[j]==t2.get_type_token()) && (++__CLOVER_76_0.cloverRec.CT[2613]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2613]==0&false)))
						{{
							__CLOVER_76_0.cloverRec.S[11876]++;return true;
						}
						}__CLOVER_76_0.cloverRec.S[11877]++;oldj=j;
					}
				}}
				}__CLOVER_76_0.cloverRec.S[11878]++;oldi=i;
			}
		}}
		}__CLOVER_76_0.cloverRec.S[11879]++;return false;
	}

	public int test_prochain3(int tab[])
	{__CLOVER_76_0.cloverRec.M[666]++;
		__CLOVER_76_0.cloverRec.S[11880]++;int i;
		__CLOVER_76_0.cloverRec.S[11881]++;Token t=null;
		assert((((tab!=null)) && (++__CLOVER_76_0.cloverRec.CT[2614]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2614]==0&false));
		assert((((tab.length>0)) && (++__CLOVER_76_0.cloverRec.CT[2615]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2615]==0&false));
		__CLOVER_76_0.cloverRec.S[11882]++;if((((nb_token_lu>pos_dernier) && (++__CLOVER_76_0.cloverRec.CT[2616]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2616]==0&false)))
		{{// on a deja lu au moins un token
			__CLOVER_76_0.cloverRec.S[11883]++;t=liste_dernier_token[pos_dernier];
		}
		}else
		{{
			//suivant_deja_lu=true;
			//t=getToken();
			__CLOVER_76_0.cloverRec.S[11884]++;if((((prefreshNbToken(1)) && (++__CLOVER_76_0.cloverRec.CT[2617]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2617]==0&false)))
				{__CLOVER_76_0.cloverRec.S[11885]++;t=liste_dernier_token[pos_dernier];
		}}
		}__CLOVER_76_0.cloverRec.S[11886]++;if((((t!=null) && (++__CLOVER_76_0.cloverRec.CT[2618]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2618]==0&false)))
		{{
			__CLOVER_76_0.cloverRec.S[11887]++;for(i=0;(((i<tab.length) && (++__CLOVER_76_0.cloverRec.CT[2619]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2619]==0&false));i++)
			{{
				__CLOVER_76_0.cloverRec.S[11888]++;if((((tab[i]==t.get_type_token()) && (++__CLOVER_76_0.cloverRec.CT[2620]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2620]==0&false)))
				{{
					__CLOVER_76_0.cloverRec.S[11889]++;return i;
				}
			}}
		}}
		}__CLOVER_76_0.cloverRec.S[11890]++;return -1;
	}

	public int test_prochain4(int tab[][])
	{__CLOVER_76_0.cloverRec.M[667]++;
		__CLOVER_76_0.cloverRec.S[11891]++;int i,nb,j;
		__CLOVER_76_0.cloverRec.S[11892]++;Token t=null;
		assert((((tab!=null)) && (++__CLOVER_76_0.cloverRec.CT[2621]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2621]==0&false));
		assert((((tab.length>0)) && (++__CLOVER_76_0.cloverRec.CT[2622]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2622]==0&false));
		// recherche du plus grand nombre de token a lire
		__CLOVER_76_0.cloverRec.S[11893]++;nb=0;
		__CLOVER_76_0.cloverRec.S[11894]++;for(i=0;(((i<tab.length) && (++__CLOVER_76_0.cloverRec.CT[2623]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2623]==0&false));i++)
		{{
			__CLOVER_76_0.cloverRec.S[11895]++;if((((tab[i].length>nb) && (++__CLOVER_76_0.cloverRec.CT[2624]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2624]==0&false)))
				{__CLOVER_76_0.cloverRec.S[11896]++;nb=tab[i].length;
		}}
		}__CLOVER_76_0.cloverRec.S[11897]++;if((((nb_token_lu>pos_dernier+nb) && (++__CLOVER_76_0.cloverRec.CT[2625]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2625]==0&false)))
		{{// on a deja lu au moins un token
			__CLOVER_76_0.cloverRec.S[11898]++;t=liste_dernier_token[pos_dernier];
		}
		}else
		{{
			//suivant_deja_lu=true;
			//t=getToken();
			__CLOVER_76_0.cloverRec.S[11899]++;if((((prefreshNbToken(nb)) && (++__CLOVER_76_0.cloverRec.CT[2626]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2626]==0&false)))
				{__CLOVER_76_0.cloverRec.S[11900]++;t=liste_dernier_token[pos_dernier];
		}}
		}__CLOVER_76_0.cloverRec.S[11901]++;if((((t!=null) && (++__CLOVER_76_0.cloverRec.CT[2627]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2627]==0&false)))
		{{
			__CLOVER_76_0.cloverRec.S[11902]++;for(i=0;(((i<tab.length) && (++__CLOVER_76_0.cloverRec.CT[2628]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2628]==0&false));i++)
			{{
				__CLOVER_76_0.cloverRec.S[11903]++;if((((tab[i][0]==t.get_type_token()) && (++__CLOVER_76_0.cloverRec.CT[2629]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2629]==0&false)))
				{{
					__CLOVER_76_0.cloverRec.S[11904]++;boolean ok=true;
					__CLOVER_76_0.cloverRec.S[11905]++;for(j=1;(((j<tab[i].length&&ok==true) && (++__CLOVER_76_0.cloverRec.CT[2630]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2630]==0&false));j++)
					{{
						__CLOVER_76_0.cloverRec.S[11906]++;if((((tab[i][j]!=liste_dernier_token[pos_dernier+j].get_type_token()) && (++__CLOVER_76_0.cloverRec.CT[2631]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2631]==0&false)))
						{{
							__CLOVER_76_0.cloverRec.S[11907]++;ok=false;
						}
					}}
					}__CLOVER_76_0.cloverRec.S[11908]++;if((((ok) && (++__CLOVER_76_0.cloverRec.CT[2632]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2632]==0&false)))
						{__CLOVER_76_0.cloverRec.S[11909]++;return i;
				}}
			}}
		}}
		}__CLOVER_76_0.cloverRec.S[11910]++;return -1;
	}

	void undo()
	{__CLOVER_76_0.cloverRec.M[668]++;
		assert((((nb_token_lu>0)) && (++__CLOVER_76_0.cloverRec.CT[2633]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2633]==0&false));
		assert((((pos_dernier>0)) && (++__CLOVER_76_0.cloverRec.CT[2634]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2634]==0&false));
		__CLOVER_76_0.cloverRec.S[11911]++;pos_dernier--;
	}

	public Token lit(int no)
	{__CLOVER_76_0.cloverRec.M[669]++;
		__CLOVER_76_0.cloverRec.S[11912]++;Token t;
		__CLOVER_76_0.cloverRec.S[11913]++;boolean lecture_suivant;
		assert((((no>0)) && (++__CLOVER_76_0.cloverRec.CT[2635]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2635]==0&false));
		__CLOVER_76_0.cloverRec.S[11914]++;if((((nb_token_lu>pos_dernier) && (++__CLOVER_76_0.cloverRec.CT[2636]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2636]==0&false)))
		{{// on a deja lu au moins un token
			__CLOVER_76_0.cloverRec.S[11915]++;t=liste_dernier_token[pos_dernier];
			__CLOVER_76_0.cloverRec.S[11916]++;lecture_suivant=false;
		}
		}else
		{{
			//suivant_deja_lu=true;
			__CLOVER_76_0.cloverRec.S[11917]++;prefreshNbToken(1);
			__CLOVER_76_0.cloverRec.S[11918]++;t=liste_dernier_token[pos_dernier];
			//lecture_suivant=true;
			/*t=getToken();
			assert(nb_token_lu==1);
			assert(pos_dernier==1):pos_dernier+":"+nb_token_lu;*/
		}
		//assert(nb_token_lu>pos_dernier);
		}__CLOVER_76_0.cloverRec.S[11919]++;if((((t!=null&&no==t.get_type_token()) && (++__CLOVER_76_0.cloverRec.CT[2637]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2637]==0&false)))
		{{
			//suivant_deja_lu=false;
			//dernier_token=null;
			__CLOVER_76_0.cloverRec.S[11920]++;pos_dernier++;
			__CLOVER_76_0.cloverRec.S[11921]++;return t;
		}
		}else
		{{
			//suivant_deja_lu=true;
			//dernier_token=t;
			/*if(t!=null&&lecture_suivant&&pos_dernier>0)
			{
				pos_dernier--;
			}*/
			__CLOVER_76_0.cloverRec.S[11922]++;return null;
		}
	}}

	public Token lit2()
	{__CLOVER_76_0.cloverRec.M[670]++;
		__CLOVER_76_0.cloverRec.S[11923]++;if((((nb_token_lu>pos_dernier) && (++__CLOVER_76_0.cloverRec.CT[2638]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2638]==0&false)))
		{{
			__CLOVER_76_0.cloverRec.S[11924]++;Token t;
			__CLOVER_76_0.cloverRec.S[11925]++;t=liste_dernier_token[pos_dernier];
			//suivant_deja_lu=false;
			//dernier_token=null;
			__CLOVER_76_0.cloverRec.S[11926]++;pos_dernier++;
			__CLOVER_76_0.cloverRec.S[11927]++;return t;
		}
		}else
		{{
			//suivant_deja_lu=true;
			/*Token t;
			prefreshNbToken(1);
			t=liste_dernier_token[pos_dernier];
			//suivant_deja_lu=false;
			//dernier_token=null;
			pos_dernier++;
			return t;*/
			__CLOVER_76_0.cloverRec.S[11928]++;return getToken();
		}
	}}

	void parcourt()
	{__CLOVER_76_0.cloverRec.M[671]++;
		__CLOVER_76_0.cloverRec.S[11929]++;Token r=null;
		__CLOVER_76_0.cloverRec.S[11930]++;int i=0;
		__CLOVER_76_0.cloverRec.S[11931]++;do
		{{
			__CLOVER_76_0.cloverRec.S[11932]++;if((((i%3==0) && (++__CLOVER_76_0.cloverRec.CT[2639]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2639]==0&false)))
				{__CLOVER_76_0.cloverRec.S[11933]++;prefreshNbToken(2);
			}__CLOVER_76_0.cloverRec.S[11934]++;r=getToken();
			__CLOVER_76_0.cloverRec.S[11935]++;if((((r!=null) && (++__CLOVER_76_0.cloverRec.CT[2640]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2640]==0&false)))
			{{
				__CLOVER_76_0.cloverRec.S[11936]++;System.out.println("token="+r.text+"{"+r.get_type_token()+"}"+r.debut());
			}
			}__CLOVER_76_0.cloverRec.S[11937]++;i++;
		}
		}while((((r!=null) && (++__CLOVER_76_0.cloverRec.CT[2641]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2641]==0&false)));
	}

	String toStringToken(Token r)
	{__CLOVER_76_0.cloverRec.M[672]++;
		__CLOVER_76_0.cloverRec.S[11938]++;if((((r==null) && (++__CLOVER_76_0.cloverRec.CT[2642]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2642]==0&false)))
			{__CLOVER_76_0.cloverRec.S[11939]++;return "(null)";
		}else
			{__CLOVER_76_0.cloverRec.S[11940]++;return "token="+r.text+"{"+r.get_type_token()+"}"+r.debut();
	}}

	Token getToken()
	{__CLOVER_76_0.cloverRec.M[673]++;
		__CLOVER_76_0.cloverRec.S[11941]++;Token res;
		__CLOVER_76_0.cloverRec.S[11942]++;if((((nb_token_lu>pos_dernier) && (++__CLOVER_76_0.cloverRec.CT[2643]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2643]==0&false)))
		{{// on a deja lu au moins un token
			__CLOVER_76_0.cloverRec.S[11943]++;res=liste_dernier_token[pos_dernier];
		}
		}else
		{{
			__CLOVER_76_0.cloverRec.S[11944]++;res=getNext();
			__CLOVER_76_0.cloverRec.S[11945]++;pos_dernier=0;
			__CLOVER_76_0.cloverRec.S[11946]++;nb_token_lu=1;
			__CLOVER_76_0.cloverRec.S[11947]++;liste_dernier_token[pos_dernier]=res;
		}
		}__CLOVER_76_0.cloverRec.S[11948]++;pos_dernier++;
		__CLOVER_76_0.cloverRec.S[11949]++;return res;
	}

	boolean prefreshNbToken(int nb)
	{__CLOVER_76_0.cloverRec.M[674]++;
		__CLOVER_76_0.cloverRec.S[11950]++;boolean res;
		__CLOVER_76_0.cloverRec.S[11951]++;if((((nb_token_lu>pos_dernier+nb) && (++__CLOVER_76_0.cloverRec.CT[2644]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2644]==0&false)))
		{{// on a deja lu au moins nb token => on fait rien
			__CLOVER_76_0.cloverRec.S[11952]++;res=true;
		}
		}else
		{{
			__CLOVER_76_0.cloverRec.S[11953]++;Token t;
			__CLOVER_76_0.cloverRec.S[11954]++;int i=0;
			__CLOVER_76_0.cloverRec.S[11955]++;res=true;
			__CLOVER_76_0.cloverRec.S[11956]++;if((((nb_token_lu==pos_dernier) && (++__CLOVER_76_0.cloverRec.CT[2645]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2645]==0&false)))
			{{// reinitialisation pour commencer au debut du tableau
				__CLOVER_76_0.cloverRec.S[11957]++;nb_token_lu=0;
				__CLOVER_76_0.cloverRec.S[11958]++;pos_dernier=0;
			}
			}__CLOVER_76_0.cloverRec.S[11959]++;do
			{{// TODO: prendre en compte si on depasse le tableau
				__CLOVER_76_0.cloverRec.S[11960]++;t=getNext();
				__CLOVER_76_0.cloverRec.S[11961]++;if((((t!=null) && (++__CLOVER_76_0.cloverRec.CT[2646]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2646]==0&false)))
				{{
					__CLOVER_76_0.cloverRec.S[11962]++;if((((nb_token_lu+i>=liste_dernier_token.length) && (++__CLOVER_76_0.cloverRec.CT[2647]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2647]==0&false)))
					{{// on augemnte la taille de la zone tampon
						__CLOVER_76_0.cloverRec.S[11963]++;Token tmp[];
						__CLOVER_76_0.cloverRec.S[11964]++;int j,nb2;
						__CLOVER_76_0.cloverRec.S[11965]++;nb2=liste_dernier_token.length;
						__CLOVER_76_0.cloverRec.S[11966]++;tmp=new Token[nb2*nb2];
						__CLOVER_76_0.cloverRec.S[11967]++;for(j=0;(((j<nb2) && (++__CLOVER_76_0.cloverRec.CT[2648]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2648]==0&false));j++)
						{{
							__CLOVER_76_0.cloverRec.S[11968]++;tmp[j]=liste_dernier_token[j];
						}
						}__CLOVER_76_0.cloverRec.S[11969]++;liste_dernier_token=tmp;
						assert((((nb_token_lu+i<liste_dernier_token.length)) && (++__CLOVER_76_0.cloverRec.CT[2649]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2649]==0&false));
					}
					}__CLOVER_76_0.cloverRec.S[11970]++;liste_dernier_token[nb_token_lu+i]=t;
					__CLOVER_76_0.cloverRec.S[11971]++;i++;
				}
				}else
				{{// impossible de precharger nb token
					__CLOVER_76_0.cloverRec.S[11972]++;res=false;
				}
			}}
			}while((((t!=null&&nb_token_lu+i<pos_dernier+nb) && (++__CLOVER_76_0.cloverRec.CT[2650]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2650]==0&false)));
			__CLOVER_76_0.cloverRec.S[11973]++;nb_token_lu+=i;
		}
		}__CLOVER_76_0.cloverRec.S[11974]++;return res;
	}

	protected Token getNext()
	{__CLOVER_76_0.cloverRec.M[675]++;
		__CLOVER_76_0.cloverRec.S[11975]++;int last=-1,i;
		__CLOVER_76_0.cloverRec.S[11976]++;char c;
		__CLOVER_76_0.cloverRec.S[11977]++;boolean trouve;
		__CLOVER_76_0.cloverRec.S[11978]++;String s,s2;
		__CLOVER_76_0.cloverRec.S[11979]++;Token res=null;
		assert((((contenu!=null)) && (++__CLOVER_76_0.cloverRec.CT[2651]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2651]==0&false));
		assert((((pos>=0)) && (++__CLOVER_76_0.cloverRec.CT[2652]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2652]==0&false));
		__CLOVER_76_0.cloverRec.S[11980]++;while((((res==null&&pos<contenu.length()) && (++__CLOVER_76_0.cloverRec.CT[2653]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2653]==0&false)))
		{{
			__CLOVER_76_0.cloverRec.S[11981]++;last=pos;
			__CLOVER_76_0.cloverRec.S[11982]++;c=contenu.charAt(pos);
			__CLOVER_76_0.cloverRec.S[11983]++;boolean __CLOVER_bool0=false;switch(c)
			{
				case ' ':if (!__CLOVER_bool0) {__CLOVER_76_0.cloverRec.S[11984]++;__CLOVER_bool0=true;}
				case '\t':if (!__CLOVER_bool0) {__CLOVER_76_0.cloverRec.S[11985]++;__CLOVER_bool0=true;}
					__CLOVER_76_0.cloverRec.S[11986]++;pos++;
					__CLOVER_76_0.cloverRec.S[11987]++;break;
				case '\n':if (!__CLOVER_bool0) {__CLOVER_76_0.cloverRec.S[11988]++;__CLOVER_bool0=true;}
					__CLOVER_76_0.cloverRec.S[11989]++;pos++;
					__CLOVER_76_0.cloverRec.S[11990]++;x=0;
					__CLOVER_76_0.cloverRec.S[11991]++;y++;
					__CLOVER_76_0.cloverRec.S[11992]++;break;
				case ';':if (!__CLOVER_bool0) {__CLOVER_76_0.cloverRec.S[11993]++;__CLOVER_bool0=true;}
					__CLOVER_76_0.cloverRec.S[11994]++;res=defaut_token(";",PointVirgule);
					__CLOVER_76_0.cloverRec.S[11995]++;pos++;
					__CLOVER_76_0.cloverRec.S[11996]++;break;
				case '.':if (!__CLOVER_bool0) {__CLOVER_76_0.cloverRec.S[11997]++;__CLOVER_bool0=true;}
					__CLOVER_76_0.cloverRec.S[11998]++;if((((pos+1<contenu.length()&&contenu.charAt(pos+1)=='.') && (++__CLOVER_76_0.cloverRec.CT[2654]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2654]==0&false)))
					{{
						__CLOVER_76_0.cloverRec.S[11999]++;res=defaut_token("..",DeuxPoint);
						__CLOVER_76_0.cloverRec.S[12000]++;pos++;
					}
					}else {__CLOVER_76_0.cloverRec.S[12001]++;if((((pos+1<contenu.length()&&
						(Character.isDigit(contenu.charAt(pos+1))||
						contenu.charAt(pos+1)=='_')) && (++__CLOVER_76_0.cloverRec.CT[2655]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2655]==0&false)))
					{{
						__CLOVER_76_0.cloverRec.S[12002]++;int deb=pos;
						__CLOVER_76_0.cloverRec.S[12003]++;c=contenu.charAt(deb);
						assert((((c=='.')) && (++__CLOVER_76_0.cloverRec.CT[2656]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2656]==0&false));
						__CLOVER_76_0.cloverRec.S[12004]++;deb++;
						__CLOVER_76_0.cloverRec.S[12005]++;for(;(((deb<contenu.length()) && (++__CLOVER_76_0.cloverRec.CT[2657]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2657]==0&false));deb++)
						{{
							__CLOVER_76_0.cloverRec.S[12006]++;c=contenu.charAt(deb);
							__CLOVER_76_0.cloverRec.S[12007]++;if((((!(Character.isDigit(c)||c=='_')) && (++__CLOVER_76_0.cloverRec.CT[2658]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2658]==0&false)))
							{{
								__CLOVER_76_0.cloverRec.S[12008]++;break;
							}
						}}
						}__CLOVER_76_0.cloverRec.S[12009]++;c=contenu.charAt(deb);
						__CLOVER_76_0.cloverRec.S[12010]++;if((((c=='e') && (++__CLOVER_76_0.cloverRec.CT[2659]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2659]==0&false)))
						{{// prendre en compte les + et -
							__CLOVER_76_0.cloverRec.S[12011]++;deb++;
							__CLOVER_76_0.cloverRec.S[12012]++;for(;(((deb<contenu.length()) && (++__CLOVER_76_0.cloverRec.CT[2660]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2660]==0&false));deb++)
							{{
								__CLOVER_76_0.cloverRec.S[12013]++;c=contenu.charAt(deb);
								__CLOVER_76_0.cloverRec.S[12014]++;if((((!(Character.isDigit(c)||c=='_')) && (++__CLOVER_76_0.cloverRec.CT[2661]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2661]==0&false)))
								{{
									__CLOVER_76_0.cloverRec.S[12015]++;break;
								}
							}}
						}}
						}__CLOVER_76_0.cloverRec.S[12016]++;s=contenu.substring(pos,deb);
						__CLOVER_76_0.cloverRec.S[12017]++;res=defaut_token(s,REAL);
						//System.out.println("t="+s);
						__CLOVER_76_0.cloverRec.S[12018]++;pos+=deb-pos;
					}
					}else
						{__CLOVER_76_0.cloverRec.S[12019]++;res=defaut_token(".",Point);
					}}__CLOVER_76_0.cloverRec.S[12020]++;pos++;
					__CLOVER_76_0.cloverRec.S[12021]++;break;
				case '(':if (!__CLOVER_bool0) {__CLOVER_76_0.cloverRec.S[12022]++;__CLOVER_bool0=true;}
					__CLOVER_76_0.cloverRec.S[12023]++;res=defaut_token("(",ParentO);
					__CLOVER_76_0.cloverRec.S[12024]++;pos++;
					__CLOVER_76_0.cloverRec.S[12025]++;break;
				case ')':if (!__CLOVER_bool0) {__CLOVER_76_0.cloverRec.S[12026]++;__CLOVER_bool0=true;}
					__CLOVER_76_0.cloverRec.S[12027]++;res=defaut_token(")",ParentF);
					__CLOVER_76_0.cloverRec.S[12028]++;pos++;
					__CLOVER_76_0.cloverRec.S[12029]++;break;
				case '[':if (!__CLOVER_bool0) {__CLOVER_76_0.cloverRec.S[12030]++;__CLOVER_bool0=true;}
					__CLOVER_76_0.cloverRec.S[12031]++;res=defaut_token("[",CrochetO);
					__CLOVER_76_0.cloverRec.S[12032]++;pos++;
					__CLOVER_76_0.cloverRec.S[12033]++;break;
				case ']':if (!__CLOVER_bool0) {__CLOVER_76_0.cloverRec.S[12034]++;__CLOVER_bool0=true;}
					__CLOVER_76_0.cloverRec.S[12035]++;res=defaut_token("]",CrochetF);
					__CLOVER_76_0.cloverRec.S[12036]++;pos++;
					__CLOVER_76_0.cloverRec.S[12037]++;break;
				case '+':if (!__CLOVER_bool0) {__CLOVER_76_0.cloverRec.S[12038]++;__CLOVER_bool0=true;}
					__CLOVER_76_0.cloverRec.S[12039]++;res=defaut_token("+",Plus);
					__CLOVER_76_0.cloverRec.S[12040]++;pos++;
					__CLOVER_76_0.cloverRec.S[12041]++;break;
				case '-':if (!__CLOVER_bool0) {__CLOVER_76_0.cloverRec.S[12042]++;__CLOVER_bool0=true;}
					//System.out.println("trouve");
					__CLOVER_76_0.cloverRec.S[12043]++;if((((pos+1<contenu.length()&&contenu.charAt(pos+1)=='>') && (++__CLOVER_76_0.cloverRec.CT[2662]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2662]==0&false)))
					{{
						__CLOVER_76_0.cloverRec.S[12044]++;res=defaut_token("->",Fleche);
						__CLOVER_76_0.cloverRec.S[12045]++;pos+=2;
						//System.out.println("trouve2");
					}
					}else {__CLOVER_76_0.cloverRec.S[12046]++;if((((pos+1<contenu.length()&&contenu.charAt(pos+1)=='-') && (++__CLOVER_76_0.cloverRec.CT[2663]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2663]==0&false)))
					{{
						__CLOVER_76_0.cloverRec.S[12047]++;i=1;
						__CLOVER_76_0.cloverRec.S[12048]++;while((((pos+i<contenu.length()&&contenu.charAt(pos+i)!='\n') && (++__CLOVER_76_0.cloverRec.CT[2664]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2664]==0&false)))
							{__CLOVER_76_0.cloverRec.S[12049]++;i++;
						//res=defaut_token("->",Fleche);
						}__CLOVER_76_0.cloverRec.S[12050]++;pos+=i;
					}
					}else
					{{
						__CLOVER_76_0.cloverRec.S[12051]++;res=defaut_token("-",Moins);
						__CLOVER_76_0.cloverRec.S[12052]++;pos++;
					}
					//System.out.println("trouve3");
					}}__CLOVER_76_0.cloverRec.S[12053]++;break;
				case '*':if (!__CLOVER_bool0) {__CLOVER_76_0.cloverRec.S[12054]++;__CLOVER_bool0=true;}
					__CLOVER_76_0.cloverRec.S[12055]++;res=defaut_token("*",Fois);
					__CLOVER_76_0.cloverRec.S[12056]++;pos++;
					__CLOVER_76_0.cloverRec.S[12057]++;break;
				case '/':if (!__CLOVER_bool0) {__CLOVER_76_0.cloverRec.S[12058]++;__CLOVER_bool0=true;}
					__CLOVER_76_0.cloverRec.S[12059]++;if((((pos+1<contenu.length()&&contenu.charAt(pos+1)=='/') && (++__CLOVER_76_0.cloverRec.CT[2665]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2665]==0&false)))
					{{
						__CLOVER_76_0.cloverRec.S[12060]++;res=defaut_token("//",DivEntier);
						__CLOVER_76_0.cloverRec.S[12061]++;pos++;
					}
					}else {__CLOVER_76_0.cloverRec.S[12062]++;if((((pos+1<contenu.length()&&contenu.charAt(pos+1)=='=') && (++__CLOVER_76_0.cloverRec.CT[2666]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2666]==0&false)))
					{{
						__CLOVER_76_0.cloverRec.S[12063]++;res=defaut_token("/=",Diff);
						__CLOVER_76_0.cloverRec.S[12064]++;pos++;
					}
					}else
						{__CLOVER_76_0.cloverRec.S[12065]++;res=defaut_token("/",Div);
					}}__CLOVER_76_0.cloverRec.S[12066]++;pos++;
					__CLOVER_76_0.cloverRec.S[12067]++;break;
				case '\\':if (!__CLOVER_bool0) {__CLOVER_76_0.cloverRec.S[12068]++;__CLOVER_bool0=true;}
					__CLOVER_76_0.cloverRec.S[12069]++;if((((pos+1<contenu.length()&&contenu.charAt(pos+1)=='\\') && (++__CLOVER_76_0.cloverRec.CT[2667]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2667]==0&false)))
					{{
						__CLOVER_76_0.cloverRec.S[12070]++;res=defaut_token("\\\\",Mod);
						__CLOVER_76_0.cloverRec.S[12071]++;pos+=2;
					}
					}else
					{{// todo: a traiter
						assert((((false)) && (++__CLOVER_76_0.cloverRec.CT[2668]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2668]==0&false));
						__CLOVER_76_0.cloverRec.S[12072]++;pos++;
					}
					}__CLOVER_76_0.cloverRec.S[12073]++;break;
				case '=':if (!__CLOVER_bool0) {__CLOVER_76_0.cloverRec.S[12074]++;__CLOVER_bool0=true;}
					//System.out.println("trouve4");
					__CLOVER_76_0.cloverRec.S[12075]++;res=defaut_token("=",Egal);
					__CLOVER_76_0.cloverRec.S[12076]++;pos++;
					__CLOVER_76_0.cloverRec.S[12077]++;break;
				case '<':if (!__CLOVER_bool0) {__CLOVER_76_0.cloverRec.S[12078]++;__CLOVER_bool0=true;}
					__CLOVER_76_0.cloverRec.S[12079]++;if((((pos+1<contenu.length()&&contenu.charAt(pos+1)=='<') && (++__CLOVER_76_0.cloverRec.CT[2669]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2669]==0&false)))
					{{
						__CLOVER_76_0.cloverRec.S[12080]++;res=defaut_token("<<",ArrayO);
						__CLOVER_76_0.cloverRec.S[12081]++;pos++;
					}
					}else {__CLOVER_76_0.cloverRec.S[12082]++;if((((pos+1<contenu.length()&&contenu.charAt(pos+1)=='=') && (++__CLOVER_76_0.cloverRec.CT[2670]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2670]==0&false)))
					{{
						__CLOVER_76_0.cloverRec.S[12083]++;res=defaut_token("<=",Inf);
						__CLOVER_76_0.cloverRec.S[12084]++;pos++;
					}
					}else
						{__CLOVER_76_0.cloverRec.S[12085]++;res=defaut_token("<",InfS);
					}}__CLOVER_76_0.cloverRec.S[12086]++;pos++;
					__CLOVER_76_0.cloverRec.S[12087]++;break;
				case '>':if (!__CLOVER_bool0) {__CLOVER_76_0.cloverRec.S[12088]++;__CLOVER_bool0=true;}
					__CLOVER_76_0.cloverRec.S[12089]++;if((((pos+1<contenu.length()&&contenu.charAt(pos+1)=='>') && (++__CLOVER_76_0.cloverRec.CT[2671]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2671]==0&false)))
					{{
						__CLOVER_76_0.cloverRec.S[12090]++;res=defaut_token(">>",ArrayF);
						__CLOVER_76_0.cloverRec.S[12091]++;pos++;
					}
					}else {__CLOVER_76_0.cloverRec.S[12092]++;if((((pos+1<contenu.length()&&contenu.charAt(pos+1)=='=') && (++__CLOVER_76_0.cloverRec.CT[2672]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2672]==0&false)))
					{{
						__CLOVER_76_0.cloverRec.S[12093]++;res=defaut_token(">=",Sup);
						__CLOVER_76_0.cloverRec.S[12094]++;pos++;
					}
					}else
						{__CLOVER_76_0.cloverRec.S[12095]++;res=defaut_token(">",SupS);
					}}__CLOVER_76_0.cloverRec.S[12096]++;pos++;
					__CLOVER_76_0.cloverRec.S[12097]++;break;
				case ',':if (!__CLOVER_bool0) {__CLOVER_76_0.cloverRec.S[12098]++;__CLOVER_bool0=true;}
					__CLOVER_76_0.cloverRec.S[12099]++;res=defaut_token(",",Virgule);
					__CLOVER_76_0.cloverRec.S[12100]++;pos++;
					__CLOVER_76_0.cloverRec.S[12101]++;break;
				case '?':if (!__CLOVER_bool0) {__CLOVER_76_0.cloverRec.S[12102]++;__CLOVER_bool0=true;}
					__CLOVER_76_0.cloverRec.S[12103]++;if((((pos+1<contenu.length()&&contenu.charAt(pos+1)=='=') && (++__CLOVER_76_0.cloverRec.CT[2673]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2673]==0&false)))
					{{
						__CLOVER_76_0.cloverRec.S[12104]++;res=defaut_token("?=",TentativeAffect);
						__CLOVER_76_0.cloverRec.S[12105]++;pos+=2;
					}
					}else
					{{// todo: a traiter
						assert((((false)) && (++__CLOVER_76_0.cloverRec.CT[2674]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2674]==0&false));
						__CLOVER_76_0.cloverRec.S[12106]++;pos++;
					}
					}__CLOVER_76_0.cloverRec.S[12107]++;break;
				case ':':if (!__CLOVER_bool0) {__CLOVER_76_0.cloverRec.S[12108]++;__CLOVER_bool0=true;}
					__CLOVER_76_0.cloverRec.S[12109]++;if((((pos+1<contenu.length()&&contenu.charAt(pos+1)=='=') && (++__CLOVER_76_0.cloverRec.CT[2675]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2675]==0&false)))
					{{
						__CLOVER_76_0.cloverRec.S[12110]++;res=defaut_token(":=",Affect);
						__CLOVER_76_0.cloverRec.S[12111]++;pos++;
					}
					}else
						{__CLOVER_76_0.cloverRec.S[12112]++;res=defaut_token(":",DoublePoint);
					}__CLOVER_76_0.cloverRec.S[12113]++;pos++;
					__CLOVER_76_0.cloverRec.S[12114]++;break;
				case '^':if (!__CLOVER_bool0) {__CLOVER_76_0.cloverRec.S[12115]++;__CLOVER_bool0=true;}
					__CLOVER_76_0.cloverRec.S[12116]++;res=defaut_token("^",Puiss);
					__CLOVER_76_0.cloverRec.S[12117]++;pos++;
					__CLOVER_76_0.cloverRec.S[12118]++;break;
				case '!':if (!__CLOVER_bool0) {__CLOVER_76_0.cloverRec.S[12119]++;__CLOVER_bool0=true;}
					__CLOVER_76_0.cloverRec.S[12120]++;res=defaut_token("!",Exclamation);
					__CLOVER_76_0.cloverRec.S[12121]++;pos++;
					__CLOVER_76_0.cloverRec.S[12122]++;break;
				case '{':if (!__CLOVER_bool0) {__CLOVER_76_0.cloverRec.S[12123]++;__CLOVER_bool0=true;}
					__CLOVER_76_0.cloverRec.S[12124]++;res=defaut_token("{",AcoladeO);
					__CLOVER_76_0.cloverRec.S[12125]++;pos++;
					__CLOVER_76_0.cloverRec.S[12126]++;break;
				case '}':if (!__CLOVER_bool0) {__CLOVER_76_0.cloverRec.S[12127]++;__CLOVER_bool0=true;}
					__CLOVER_76_0.cloverRec.S[12128]++;res=defaut_token("}",AcoladeF);
					__CLOVER_76_0.cloverRec.S[12129]++;pos++;
					__CLOVER_76_0.cloverRec.S[12130]++;break;
				case '$':if (!__CLOVER_bool0) {__CLOVER_76_0.cloverRec.S[12131]++;__CLOVER_bool0=true;}
					__CLOVER_76_0.cloverRec.S[12132]++;res=defaut_token("$",Dollard);
					__CLOVER_76_0.cloverRec.S[12133]++;pos++;
					__CLOVER_76_0.cloverRec.S[12134]++;break;
				case 'a':if (!__CLOVER_bool0) {__CLOVER_76_0.cloverRec.S[12135]++;__CLOVER_bool0=true;}case 'b':if (!__CLOVER_bool0) {__CLOVER_76_0.cloverRec.S[12136]++;__CLOVER_bool0=true;}case 'c':if (!__CLOVER_bool0) {__CLOVER_76_0.cloverRec.S[12137]++;__CLOVER_bool0=true;}case 'd':if (!__CLOVER_bool0) {__CLOVER_76_0.cloverRec.S[12138]++;__CLOVER_bool0=true;}case 'e':if (!__CLOVER_bool0) {__CLOVER_76_0.cloverRec.S[12139]++;__CLOVER_bool0=true;}case 'f':if (!__CLOVER_bool0) {__CLOVER_76_0.cloverRec.S[12140]++;__CLOVER_bool0=true;}case 'g':if (!__CLOVER_bool0) {__CLOVER_76_0.cloverRec.S[12141]++;__CLOVER_bool0=true;}
				case 'h':if (!__CLOVER_bool0) {__CLOVER_76_0.cloverRec.S[12142]++;__CLOVER_bool0=true;}case 'i':if (!__CLOVER_bool0) {__CLOVER_76_0.cloverRec.S[12143]++;__CLOVER_bool0=true;}case 'j':if (!__CLOVER_bool0) {__CLOVER_76_0.cloverRec.S[12144]++;__CLOVER_bool0=true;}case 'k':if (!__CLOVER_bool0) {__CLOVER_76_0.cloverRec.S[12145]++;__CLOVER_bool0=true;}case 'l':if (!__CLOVER_bool0) {__CLOVER_76_0.cloverRec.S[12146]++;__CLOVER_bool0=true;}case 'm':if (!__CLOVER_bool0) {__CLOVER_76_0.cloverRec.S[12147]++;__CLOVER_bool0=true;}case 'n':if (!__CLOVER_bool0) {__CLOVER_76_0.cloverRec.S[12148]++;__CLOVER_bool0=true;}
				case 'o':if (!__CLOVER_bool0) {__CLOVER_76_0.cloverRec.S[12149]++;__CLOVER_bool0=true;}case 'p':if (!__CLOVER_bool0) {__CLOVER_76_0.cloverRec.S[12150]++;__CLOVER_bool0=true;}case 'q':if (!__CLOVER_bool0) {__CLOVER_76_0.cloverRec.S[12151]++;__CLOVER_bool0=true;}case 'r':if (!__CLOVER_bool0) {__CLOVER_76_0.cloverRec.S[12152]++;__CLOVER_bool0=true;}case 's':if (!__CLOVER_bool0) {__CLOVER_76_0.cloverRec.S[12153]++;__CLOVER_bool0=true;}case 't':if (!__CLOVER_bool0) {__CLOVER_76_0.cloverRec.S[12154]++;__CLOVER_bool0=true;}case 'u':if (!__CLOVER_bool0) {__CLOVER_76_0.cloverRec.S[12155]++;__CLOVER_bool0=true;}
				case 'v':if (!__CLOVER_bool0) {__CLOVER_76_0.cloverRec.S[12156]++;__CLOVER_bool0=true;}case 'w':if (!__CLOVER_bool0) {__CLOVER_76_0.cloverRec.S[12157]++;__CLOVER_bool0=true;}case 'x':if (!__CLOVER_bool0) {__CLOVER_76_0.cloverRec.S[12158]++;__CLOVER_bool0=true;}case 'y':if (!__CLOVER_bool0) {__CLOVER_76_0.cloverRec.S[12159]++;__CLOVER_bool0=true;}case 'z':if (!__CLOVER_bool0) {__CLOVER_76_0.cloverRec.S[12160]++;__CLOVER_bool0=true;}
				case 'A':if (!__CLOVER_bool0) {__CLOVER_76_0.cloverRec.S[12161]++;__CLOVER_bool0=true;}case 'B':if (!__CLOVER_bool0) {__CLOVER_76_0.cloverRec.S[12162]++;__CLOVER_bool0=true;}case 'C':if (!__CLOVER_bool0) {__CLOVER_76_0.cloverRec.S[12163]++;__CLOVER_bool0=true;}case 'D':if (!__CLOVER_bool0) {__CLOVER_76_0.cloverRec.S[12164]++;__CLOVER_bool0=true;}case 'E':if (!__CLOVER_bool0) {__CLOVER_76_0.cloverRec.S[12165]++;__CLOVER_bool0=true;}case 'F':if (!__CLOVER_bool0) {__CLOVER_76_0.cloverRec.S[12166]++;__CLOVER_bool0=true;}case 'G':if (!__CLOVER_bool0) {__CLOVER_76_0.cloverRec.S[12167]++;__CLOVER_bool0=true;}
				case 'H':if (!__CLOVER_bool0) {__CLOVER_76_0.cloverRec.S[12168]++;__CLOVER_bool0=true;}case 'I':if (!__CLOVER_bool0) {__CLOVER_76_0.cloverRec.S[12169]++;__CLOVER_bool0=true;}case 'J':if (!__CLOVER_bool0) {__CLOVER_76_0.cloverRec.S[12170]++;__CLOVER_bool0=true;}case 'K':if (!__CLOVER_bool0) {__CLOVER_76_0.cloverRec.S[12171]++;__CLOVER_bool0=true;}case 'L':if (!__CLOVER_bool0) {__CLOVER_76_0.cloverRec.S[12172]++;__CLOVER_bool0=true;}case 'M':if (!__CLOVER_bool0) {__CLOVER_76_0.cloverRec.S[12173]++;__CLOVER_bool0=true;}case 'N':if (!__CLOVER_bool0) {__CLOVER_76_0.cloverRec.S[12174]++;__CLOVER_bool0=true;}
				case 'O':if (!__CLOVER_bool0) {__CLOVER_76_0.cloverRec.S[12175]++;__CLOVER_bool0=true;}case 'P':if (!__CLOVER_bool0) {__CLOVER_76_0.cloverRec.S[12176]++;__CLOVER_bool0=true;}case 'Q':if (!__CLOVER_bool0) {__CLOVER_76_0.cloverRec.S[12177]++;__CLOVER_bool0=true;}case 'R':if (!__CLOVER_bool0) {__CLOVER_76_0.cloverRec.S[12178]++;__CLOVER_bool0=true;}case 'S':if (!__CLOVER_bool0) {__CLOVER_76_0.cloverRec.S[12179]++;__CLOVER_bool0=true;}case 'T':if (!__CLOVER_bool0) {__CLOVER_76_0.cloverRec.S[12180]++;__CLOVER_bool0=true;}case 'U':if (!__CLOVER_bool0) {__CLOVER_76_0.cloverRec.S[12181]++;__CLOVER_bool0=true;}
				case 'V':if (!__CLOVER_bool0) {__CLOVER_76_0.cloverRec.S[12182]++;__CLOVER_bool0=true;}case 'W':if (!__CLOVER_bool0) {__CLOVER_76_0.cloverRec.S[12183]++;__CLOVER_bool0=true;}case 'X':if (!__CLOVER_bool0) {__CLOVER_76_0.cloverRec.S[12184]++;__CLOVER_bool0=true;}case 'Y':if (!__CLOVER_bool0) {__CLOVER_76_0.cloverRec.S[12185]++;__CLOVER_bool0=true;}case 'Z':if (!__CLOVER_bool0) {__CLOVER_76_0.cloverRec.S[12186]++;__CLOVER_bool0=true;}
					__CLOVER_76_0.cloverRec.S[12187]++;trouve=false;
					__CLOVER_76_0.cloverRec.S[12188]++;for(i=1;(((pos+i<contenu.length()) && (++__CLOVER_76_0.cloverRec.CT[2676]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2676]==0&false));i++)
					{{
						__CLOVER_76_0.cloverRec.S[12189]++;c=contenu.charAt(pos+i);
						__CLOVER_76_0.cloverRec.S[12190]++;if((((!(Character.isLetterOrDigit(c)||c=='_')) && (++__CLOVER_76_0.cloverRec.CT[2677]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2677]==0&false)))
						{{
							__CLOVER_76_0.cloverRec.S[12191]++;break;
						}
					}}
					}__CLOVER_76_0.cloverRec.S[12192]++;s=contenu.substring(pos,pos+i);
					__CLOVER_76_0.cloverRec.S[12193]++;Integer n=(Integer)liste_keyword.get(s.toLowerCase());
					__CLOVER_76_0.cloverRec.S[12194]++;if((((n!=null) && (++__CLOVER_76_0.cloverRec.CT[2678]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2678]==0&false)))
					{{
						__CLOVER_76_0.cloverRec.S[12195]++;res=defaut_token(s,n.intValue());
					}
					}else
					{{
						__CLOVER_76_0.cloverRec.S[12196]++;res=defaut_token(s,ID);
					}
					//System.out.println("t="+s);
					}__CLOVER_76_0.cloverRec.S[12197]++;pos+=i;
					__CLOVER_76_0.cloverRec.S[12198]++;break;
				case '\'':if (!__CLOVER_bool0) {__CLOVER_76_0.cloverRec.S[12199]++;__CLOVER_bool0=true;}
					__CLOVER_76_0.cloverRec.S[12200]++;for(i=1;(((pos+i<contenu.length()) && (++__CLOVER_76_0.cloverRec.CT[2679]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2679]==0&false));i++)
					{{
						__CLOVER_76_0.cloverRec.S[12201]++;c=contenu.charAt(pos+i);
						__CLOVER_76_0.cloverRec.S[12202]++;if((((c=='\'') && (++__CLOVER_76_0.cloverRec.CT[2680]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2680]==0&false)))
						{{
							__CLOVER_76_0.cloverRec.S[12203]++;break;
						}
						}else {__CLOVER_76_0.cloverRec.S[12204]++;if((((c=='%') && (++__CLOVER_76_0.cloverRec.CT[2681]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2681]==0&false)))
						{{
							__CLOVER_76_0.cloverRec.S[12205]++;if((((pos+i+1<contenu.length()) && (++__CLOVER_76_0.cloverRec.CT[2682]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2682]==0&false)))
							{{
								__CLOVER_76_0.cloverRec.S[12206]++;i++;
							}
						}}

					}}}
					}__CLOVER_76_0.cloverRec.S[12207]++;i++;
					__CLOVER_76_0.cloverRec.S[12208]++;s=contenu.substring(pos,pos+i);
					__CLOVER_76_0.cloverRec.S[12209]++;res=defaut_token(s,CHAR);
					//System.out.println("t="+s);
					__CLOVER_76_0.cloverRec.S[12210]++;pos+=i;
					__CLOVER_76_0.cloverRec.S[12211]++;break;
				case '\"':if (!__CLOVER_bool0) {__CLOVER_76_0.cloverRec.S[12212]++;__CLOVER_bool0=true;}case '%':if (!__CLOVER_bool0) {__CLOVER_76_0.cloverRec.S[12213]++;__CLOVER_bool0=true;}
					__CLOVER_76_0.cloverRec.S[12214]++;for(i=1;(((pos+i<contenu.length()) && (++__CLOVER_76_0.cloverRec.CT[2683]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2683]==0&false));i++)
					{{
						__CLOVER_76_0.cloverRec.S[12215]++;c=contenu.charAt(pos+i);
						__CLOVER_76_0.cloverRec.S[12216]++;if((((c=='\"') && (++__CLOVER_76_0.cloverRec.CT[2684]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2684]==0&false)))
						{{
							__CLOVER_76_0.cloverRec.S[12217]++;break;
						}
						}else {__CLOVER_76_0.cloverRec.S[12218]++;if((((c=='%') && (++__CLOVER_76_0.cloverRec.CT[2685]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2685]==0&false)))
						{{
							__CLOVER_76_0.cloverRec.S[12219]++;if((((pos+i+1<contenu.length()&&
								(contenu.charAt(pos+i+1)=='\n'||
								contenu.charAt(pos+i+1)=='\t'||
								contenu.charAt(pos+i+1)=='\r')) && (++__CLOVER_76_0.cloverRec.CT[2686]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2686]==0&false)))
							{{
								__CLOVER_76_0.cloverRec.S[12220]++;break;
							}
							}else {__CLOVER_76_0.cloverRec.S[12221]++;if((((pos+i+1<contenu.length()) && (++__CLOVER_76_0.cloverRec.CT[2687]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2687]==0&false)))
							{{
								__CLOVER_76_0.cloverRec.S[12222]++;i++;
							}
						}}}
					}}}
					}__CLOVER_76_0.cloverRec.S[12223]++;i++;
					__CLOVER_76_0.cloverRec.S[12224]++;s=contenu.substring(pos,pos+i);
					__CLOVER_76_0.cloverRec.S[12225]++;res=defaut_token(s,STRING);
					//System.out.println("t="+s);
					__CLOVER_76_0.cloverRec.S[12226]++;pos+=i;
					__CLOVER_76_0.cloverRec.S[12227]++;break;
				case '0':if (!__CLOVER_bool0) {__CLOVER_76_0.cloverRec.S[12228]++;__CLOVER_bool0=true;}case '1':if (!__CLOVER_bool0) {__CLOVER_76_0.cloverRec.S[12229]++;__CLOVER_bool0=true;}case '2':if (!__CLOVER_bool0) {__CLOVER_76_0.cloverRec.S[12230]++;__CLOVER_bool0=true;}case '3':if (!__CLOVER_bool0) {__CLOVER_76_0.cloverRec.S[12231]++;__CLOVER_bool0=true;}case '4':if (!__CLOVER_bool0) {__CLOVER_76_0.cloverRec.S[12232]++;__CLOVER_bool0=true;}case '5':if (!__CLOVER_bool0) {__CLOVER_76_0.cloverRec.S[12233]++;__CLOVER_bool0=true;}
				case '6':if (!__CLOVER_bool0) {__CLOVER_76_0.cloverRec.S[12234]++;__CLOVER_bool0=true;}case '7':if (!__CLOVER_bool0) {__CLOVER_76_0.cloverRec.S[12235]++;__CLOVER_bool0=true;}case '8':if (!__CLOVER_bool0) {__CLOVER_76_0.cloverRec.S[12236]++;__CLOVER_bool0=true;}case '9':if (!__CLOVER_bool0) {__CLOVER_76_0.cloverRec.S[12237]++;__CLOVER_bool0=true;}//case '.':
					// todo: prendre en compte le d\u00e9passement du buffer
					// todo:prendre en compte un debut avec . et + et -
					__CLOVER_76_0.cloverRec.S[12238]++;int deb=pos;
					__CLOVER_76_0.cloverRec.S[12239]++;boolean flottant=false;
					__CLOVER_76_0.cloverRec.S[12240]++;for(deb=pos;(((deb<contenu.length()) && (++__CLOVER_76_0.cloverRec.CT[2688]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2688]==0&false));deb++)
					{{
						__CLOVER_76_0.cloverRec.S[12241]++;c=contenu.charAt(deb);
						__CLOVER_76_0.cloverRec.S[12242]++;if((((!(Character.isDigit(c)||c=='_')) && (++__CLOVER_76_0.cloverRec.CT[2689]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2689]==0&false)))
						{{
							__CLOVER_76_0.cloverRec.S[12243]++;break;
						}
					}}
					}__CLOVER_76_0.cloverRec.S[12244]++;if((((deb<contenu.length()) && (++__CLOVER_76_0.cloverRec.CT[2690]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2690]==0&false)))
					{{
						__CLOVER_76_0.cloverRec.S[12245]++;c=contenu.charAt(deb);
						__CLOVER_76_0.cloverRec.S[12246]++;if((((c=='.'&&deb+1<contenu.length()&&
							contenu.charAt(deb+1)!='.') && (++__CLOVER_76_0.cloverRec.CT[2691]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2691]==0&false)))
						{{
							__CLOVER_76_0.cloverRec.S[12247]++;deb++;
							__CLOVER_76_0.cloverRec.S[12248]++;flottant=true;
							__CLOVER_76_0.cloverRec.S[12249]++;for(;(((deb<contenu.length()) && (++__CLOVER_76_0.cloverRec.CT[2692]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2692]==0&false));deb++)
							{{
								__CLOVER_76_0.cloverRec.S[12250]++;c=contenu.charAt(deb);
								__CLOVER_76_0.cloverRec.S[12251]++;if((((!(Character.isDigit(c)||c=='_')) && (++__CLOVER_76_0.cloverRec.CT[2693]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2693]==0&false)))
								{{
									__CLOVER_76_0.cloverRec.S[12252]++;break;
								}
							}}
							}__CLOVER_76_0.cloverRec.S[12253]++;c=contenu.charAt(deb);
							__CLOVER_76_0.cloverRec.S[12254]++;if((((c=='e') && (++__CLOVER_76_0.cloverRec.CT[2694]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2694]==0&false)))
							{{// prendre en compte les + et -
								__CLOVER_76_0.cloverRec.S[12255]++;deb++;
								__CLOVER_76_0.cloverRec.S[12256]++;for(;(((deb<contenu.length()) && (++__CLOVER_76_0.cloverRec.CT[2695]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2695]==0&false));deb++)
								{{
									__CLOVER_76_0.cloverRec.S[12257]++;c=contenu.charAt(deb);
									__CLOVER_76_0.cloverRec.S[12258]++;if((((!(Character.isDigit(c)||c=='_')) && (++__CLOVER_76_0.cloverRec.CT[2696]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2696]==0&false)))
									{{
										__CLOVER_76_0.cloverRec.S[12259]++;break;
									}
								}}
							}}
						}}
					}}
					}__CLOVER_76_0.cloverRec.S[12260]++;s=contenu.substring(pos,deb);
					__CLOVER_76_0.cloverRec.S[12261]++;if((((!flottant) && (++__CLOVER_76_0.cloverRec.CT[2697]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2697]==0&false)))
						{__CLOVER_76_0.cloverRec.S[12262]++;res=defaut_token(s,INT);
					}else
						{__CLOVER_76_0.cloverRec.S[12263]++;res=defaut_token(s,REAL);
					//System.out.println("t="+s);
					}__CLOVER_76_0.cloverRec.S[12264]++;pos+=deb-pos;
					__CLOVER_76_0.cloverRec.S[12265]++;break;
				case '@':if (!__CLOVER_bool0) {__CLOVER_76_0.cloverRec.S[12266]++;__CLOVER_bool0=true;}case '#':if (!__CLOVER_bool0) {__CLOVER_76_0.cloverRec.S[12267]++;__CLOVER_bool0=true;}case '|':if (!__CLOVER_bool0) {__CLOVER_76_0.cloverRec.S[12268]++;__CLOVER_bool0=true;}case '&':if (!__CLOVER_bool0) {__CLOVER_76_0.cloverRec.S[12269]++;__CLOVER_bool0=true;}
					__CLOVER_76_0.cloverRec.S[12270]++;for(i=1;(((pos+i<contenu.length()) && (++__CLOVER_76_0.cloverRec.CT[2698]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2698]==0&false));i++)
					{{
						__CLOVER_76_0.cloverRec.S[12271]++;c=contenu.charAt(pos+i);
						__CLOVER_76_0.cloverRec.S[12272]++;if((((!(Character.isLetterOrDigit(c)||c=='_'
							||c=='='||c=='<'||c=='>'||c=='/'||c=='@'
							||c=='#'||c=='|'||c=='&'||c=='\\'||c=='^'
							||c=='*')) && (++__CLOVER_76_0.cloverRec.CT[2699]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2699]==0&false)))
						{{
							__CLOVER_76_0.cloverRec.S[12273]++;break;
						}
					}}
					}__CLOVER_76_0.cloverRec.S[12274]++;s=contenu.substring(pos,pos+i);
					__CLOVER_76_0.cloverRec.S[12275]++;res=defaut_token(s,FreeOp);
					//System.out.println("t="+s);
					__CLOVER_76_0.cloverRec.S[12276]++;pos+=i;
					__CLOVER_76_0.cloverRec.S[12277]++;break;
				default:if (!__CLOVER_bool0) {__CLOVER_76_0.cloverRec.S[12278]++;__CLOVER_bool0=true;}
					__CLOVER_76_0.cloverRec.S[12279]++;if((((Character.isLetter(c)) && (++__CLOVER_76_0.cloverRec.CT[2700]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2700]==0&false)))
					{{
						
					}
					}__CLOVER_76_0.cloverRec.S[12280]++;res=defaut_token(""+c,Autre);
					__CLOVER_76_0.cloverRec.S[12281]++;pos++;
					__CLOVER_76_0.cloverRec.S[12282]++;break;
			}
			assert((((pos>last)) && (++__CLOVER_76_0.cloverRec.CT[2701]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2701]==0&false));
			__CLOVER_76_0.cloverRec.S[12283]++;lastx=x;
			__CLOVER_76_0.cloverRec.S[12284]++;if((((c=='\t') && (++__CLOVER_76_0.cloverRec.CT[2702]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2702]==0&false)))
				{__CLOVER_76_0.cloverRec.S[12285]++;x+=8;
			}else
				{__CLOVER_76_0.cloverRec.S[12286]++;x+=pos-last;
		}}
		}__CLOVER_76_0.cloverRec.S[12287]++;return res;
	}

	Token defaut_token(String s,int n)
	{__CLOVER_76_0.cloverRec.M[676]++;
		__CLOVER_76_0.cloverRec.S[12288]++;Token t=new Token(y,x,s,nom_fichier);
		__CLOVER_76_0.cloverRec.S[12289]++;t.set_type_token(n);
		__CLOVER_76_0.cloverRec.S[12290]++;return t;
	}

	void init_lexer()
	{__CLOVER_76_0.cloverRec.M[677]++;
		__CLOVER_76_0.cloverRec.S[12291]++;int i;
		__CLOVER_76_0.cloverRec.S[12292]++;this.x=1;
		__CLOVER_76_0.cloverRec.S[12293]++;this.y=1;
		__CLOVER_76_0.cloverRec.S[12294]++;lastx=x;
		__CLOVER_76_0.cloverRec.S[12295]++;suivant_deja_lu=false;
		__CLOVER_76_0.cloverRec.S[12296]++;dernier_token=null;
		__CLOVER_76_0.cloverRec.S[12297]++;if((((liste_keyword==null) && (++__CLOVER_76_0.cloverRec.CT[2703]!=0|true)) || (++__CLOVER_76_0.cloverRec.CF[2703]==0&false)))
		{{
			__CLOVER_76_0.cloverRec.S[12298]++;liste_keyword=new HashMap();
			__CLOVER_76_0.cloverRec.S[12299]++;liste_keyword.put("and",new Integer(TK_AND));
			__CLOVER_76_0.cloverRec.S[12300]++;liste_keyword.put("cluster",new Integer(TK_CLUSTER));
			__CLOVER_76_0.cloverRec.S[12301]++;liste_keyword.put("do",new Integer(TK_DO));
			__CLOVER_76_0.cloverRec.S[12302]++;liste_keyword.put("else",new Integer(TK_ELSE));
			__CLOVER_76_0.cloverRec.S[12303]++;liste_keyword.put("end",new Integer(TK_END));
			__CLOVER_76_0.cloverRec.S[12304]++;liste_keyword.put("external",new Integer(TK_EXTERNAL));
			__CLOVER_76_0.cloverRec.S[12305]++;liste_keyword.put("if",new Integer(TK_IF));
			__CLOVER_76_0.cloverRec.S[12306]++;liste_keyword.put("not",new Integer(TK_NOT));
			__CLOVER_76_0.cloverRec.S[12307]++;liste_keyword.put("or",new Integer(TK_OR));
			__CLOVER_76_0.cloverRec.S[12308]++;liste_keyword.put("then",new Integer(TK_THEN));
			__CLOVER_76_0.cloverRec.S[12309]++;liste_keyword.put("xor",new Integer(TK_XOR));
			__CLOVER_76_0.cloverRec.S[12310]++;liste_keyword.put("true",new Integer(TK_TRUE));
			__CLOVER_76_0.cloverRec.S[12311]++;liste_keyword.put("false",new Integer(TK_FALSE));
			__CLOVER_76_0.cloverRec.S[12312]++;liste_keyword.put("generate",new Integer(TK_GENERATE));
			__CLOVER_76_0.cloverRec.S[12313]++;liste_keyword.put("class",new Integer(TK_CLASS));
			__CLOVER_76_0.cloverRec.S[12314]++;liste_keyword.put("feature",new Integer(TK_FEATURE));
			__CLOVER_76_0.cloverRec.S[12315]++;liste_keyword.put("is",new Integer(TK_IS));
			__CLOVER_76_0.cloverRec.S[12316]++;liste_keyword.put("default",new Integer(TK_DEFAULT));
			__CLOVER_76_0.cloverRec.S[12317]++;liste_keyword.put("deferred",new Integer(TK_DEFERRED));
			__CLOVER_76_0.cloverRec.S[12318]++;liste_keyword.put("alias",new Integer(TK_ALIAS));
			__CLOVER_76_0.cloverRec.S[12319]++;liste_keyword.put("all",new Integer(TK_ALL));
			__CLOVER_76_0.cloverRec.S[12320]++;liste_keyword.put("as",new Integer(TK_AS));
			__CLOVER_76_0.cloverRec.S[12321]++;liste_keyword.put("check",new Integer(TK_CHECK));
			__CLOVER_76_0.cloverRec.S[12322]++;liste_keyword.put("creation",new Integer(TK_CREATION));
			__CLOVER_76_0.cloverRec.S[12323]++;liste_keyword.put("debug",new Integer(TK_DEBUG));
			__CLOVER_76_0.cloverRec.S[12324]++;liste_keyword.put("elseif",new Integer(TK_ELSEIF));
			__CLOVER_76_0.cloverRec.S[12325]++;liste_keyword.put("ensure",new Integer(TK_ENSURE));
			__CLOVER_76_0.cloverRec.S[12326]++;liste_keyword.put("expanded",new Integer(TK_EXPANDED));
			__CLOVER_76_0.cloverRec.S[12327]++;liste_keyword.put("export",new Integer(TK_EXPORT));
			__CLOVER_76_0.cloverRec.S[12328]++;liste_keyword.put("external",new Integer(TK_EXTERNAL));
			__CLOVER_76_0.cloverRec.S[12329]++;liste_keyword.put("from",new Integer(TK_FROM));
			__CLOVER_76_0.cloverRec.S[12330]++;liste_keyword.put("frozen",new Integer(TK_FROZEN));
			__CLOVER_76_0.cloverRec.S[12331]++;liste_keyword.put("implies",new Integer(TK_IMPLIES));
			__CLOVER_76_0.cloverRec.S[12332]++;liste_keyword.put("indexing",new Integer(TK_INDEXING));
			__CLOVER_76_0.cloverRec.S[12333]++;liste_keyword.put("infix",new Integer(TK_INFIX));
			__CLOVER_76_0.cloverRec.S[12334]++;liste_keyword.put("inherit",new Integer(TK_INHERIT));
			__CLOVER_76_0.cloverRec.S[12335]++;liste_keyword.put("inspect",new Integer(TK_INSPECT));
			__CLOVER_76_0.cloverRec.S[12336]++;liste_keyword.put("invariant",new Integer(TK_INVARIANT));
			__CLOVER_76_0.cloverRec.S[12337]++;liste_keyword.put("like",new Integer(TK_LIKE));
			__CLOVER_76_0.cloverRec.S[12338]++;liste_keyword.put("local",new Integer(TK_LOCAL));
			__CLOVER_76_0.cloverRec.S[12339]++;liste_keyword.put("loop",new Integer(TK_LOOP));
			__CLOVER_76_0.cloverRec.S[12340]++;liste_keyword.put("obsolete",new Integer(TK_OBSOLETE));
			__CLOVER_76_0.cloverRec.S[12341]++;liste_keyword.put("old",new Integer(TK_OLD));
			__CLOVER_76_0.cloverRec.S[12342]++;liste_keyword.put("once",new Integer(TK_ONCE));
			__CLOVER_76_0.cloverRec.S[12343]++;liste_keyword.put("prefix",new Integer(TK_PREFIX));
			__CLOVER_76_0.cloverRec.S[12344]++;liste_keyword.put("redefine",new Integer(TK_REDEFINE));
			__CLOVER_76_0.cloverRec.S[12345]++;liste_keyword.put("rename",new Integer(TK_RENAME));
			__CLOVER_76_0.cloverRec.S[12346]++;liste_keyword.put("require",new Integer(TK_REQUIRE));
			__CLOVER_76_0.cloverRec.S[12347]++;liste_keyword.put("rescue",new Integer(TK_RESCUE));
			__CLOVER_76_0.cloverRec.S[12348]++;liste_keyword.put("retry",new Integer(TK_RETRY));
			__CLOVER_76_0.cloverRec.S[12349]++;liste_keyword.put("select",new Integer(TK_SELECT));
			__CLOVER_76_0.cloverRec.S[12350]++;liste_keyword.put("separate",new Integer(TK_SEPARATE));
			__CLOVER_76_0.cloverRec.S[12351]++;liste_keyword.put("system",new Integer(TK_SYSTEM));
			__CLOVER_76_0.cloverRec.S[12352]++;liste_keyword.put("undefine",new Integer(TK_UNDEFINE));
			__CLOVER_76_0.cloverRec.S[12353]++;liste_keyword.put("until",new Integer(TK_UNTIL));
			__CLOVER_76_0.cloverRec.S[12354]++;liste_keyword.put("variant",new Integer(TK_VARIANT));
			__CLOVER_76_0.cloverRec.S[12355]++;liste_keyword.put("when",new Integer(TK_WHEN));
			__CLOVER_76_0.cloverRec.S[12356]++;liste_keyword.put("root",new Integer(TK_ROOT));
			__CLOVER_76_0.cloverRec.S[12357]++;liste_keyword.put("strip",new Integer(TK_STRIP));
			__CLOVER_76_0.cloverRec.S[12358]++;liste_keyword.put("unique",new Integer(TK_UNIQUE));
		}
	}}

	public int getColumn()
	{__CLOVER_76_0.cloverRec.M[678]++;
		//return x-(nb_token_lu-pos_dernier);
		//return x-(nb_token_lu-pos_dernier);
		//return lastx-(nb_token_lu-pos_dernier);
		__CLOVER_76_0.cloverRec.S[12359]++;return lastx-1;
	}

	public int getLine()
	{__CLOVER_76_0.cloverRec.M[679]++;
		__CLOVER_76_0.cloverRec.S[12360]++;return y;
	}

	public String getFilename()
	{__CLOVER_76_0.cloverRec.M[680]++;
		__CLOVER_76_0.cloverRec.S[12361]++;return nom_fichier;
	}

	public String getMessageErr()
	{__CLOVER_76_0.cloverRec.M[681]++;
		__CLOVER_76_0.cloverRec.S[12362]++;return msg_erreur;
	}

	public boolean est_Ok()
	{__CLOVER_76_0.cloverRec.M[682]++;
		__CLOVER_76_0.cloverRec.S[12363]++;return etatOk;
	}
	
	boolean etatOk,suivant_deja_lu;
	String contenu,nom_fichier,msg_erreur;
	int pos,x,y,lastx;
	Map liste_keyword;
	protected Token dernier_token;
	protected Token liste_dernier_token[];
	protected int pos_dernier,nb_token_lu;
	protected boolean seul_token;
}
