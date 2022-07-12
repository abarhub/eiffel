/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ *//*
 * Created on 11 juin 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package tinyeiffel.test_unitaire;

/**
 * @author barret
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class FichierVerifInterm {static class __CLOVER_250_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}

	/**
	 * 
	 */
	public FichierVerifInterm(String nom) {__CLOVER_250_0.cloverRec.M[1485]++;
		assert((((nom!=null)) && (++__CLOVER_250_0.cloverRec.CT[6633]!=0|true)) || (++__CLOVER_250_0.cloverRec.CF[6633]==0&false));
		__CLOVER_250_0.cloverRec.S[21596]++;this.nom=nom;
		__CLOVER_250_0.cloverRec.S[21597]++;this.MsgErreur=null;
	}

	public FichierVerifInterm(String nom,String erreur[]) {__CLOVER_250_0.cloverRec.M[1486]++;
		assert((((nom!=null)) && (++__CLOVER_250_0.cloverRec.CT[6634]!=0|true)) || (++__CLOVER_250_0.cloverRec.CF[6634]==0&false));
		assert((((erreur!=null)) && (++__CLOVER_250_0.cloverRec.CT[6635]!=0|true)) || (++__CLOVER_250_0.cloverRec.CF[6635]==0&false));
		__CLOVER_250_0.cloverRec.S[21598]++;this.nom=nom;
		__CLOVER_250_0.cloverRec.S[21599]++;this.MsgErreur=erreur;
	}
	
	public String nom;
	public String MsgErreur[];
	public String typeErreur;
	/**
	 * @return
	 */
	public boolean erreur() {__CLOVER_250_0.cloverRec.M[1487]++;
		__CLOVER_250_0.cloverRec.S[21600]++;return MsgErreur!=null;
	}

	public boolean equivalent(String liste_Msg[],String type_parametre)
	{__CLOVER_250_0.cloverRec.M[1488]++;
		assert((((type_parametre!=null)) && (++__CLOVER_250_0.cloverRec.CT[6636]!=0|true)) || (++__CLOVER_250_0.cloverRec.CF[6636]==0&false));
		__CLOVER_250_0.cloverRec.S[21601]++;if((((MsgErreur==null||MsgErreur.length==0) && (++__CLOVER_250_0.cloverRec.CT[6637]!=0|true)) || (++__CLOVER_250_0.cloverRec.CF[6637]==0&false)))
		{{
			__CLOVER_250_0.cloverRec.S[21602]++;if((((liste_Msg!=null&&liste_Msg.length>0) && (++__CLOVER_250_0.cloverRec.CT[6638]!=0|true)) || (++__CLOVER_250_0.cloverRec.CF[6638]==0&false)))
			{{
				__CLOVER_250_0.cloverRec.S[21603]++;typeErreur="Erreurs dans "+type_parametre+" (no 0) en trop :"+liste_Msg[0];
				__CLOVER_250_0.cloverRec.S[21604]++;return false;
			}
			}else
			{{
				__CLOVER_250_0.cloverRec.S[21605]++;return true;
			}
		}}
		}else
		{{
			__CLOVER_250_0.cloverRec.S[21606]++;if((((liste_Msg==null||liste_Msg.length==0) && (++__CLOVER_250_0.cloverRec.CT[6639]!=0|true)) || (++__CLOVER_250_0.cloverRec.CF[6639]==0&false)))
			{{
				__CLOVER_250_0.cloverRec.S[21607]++;typeErreur="Erreurs dans fichier (no 0) en trop :"+MsgErreur[0];
				__CLOVER_250_0.cloverRec.S[21608]++;return false;
			}
			}else
			{{
				__CLOVER_250_0.cloverRec.S[21609]++;boolean tab[],trouve;
				__CLOVER_250_0.cloverRec.S[21610]++;int i,j;
				__CLOVER_250_0.cloverRec.S[21611]++;tab=new boolean[liste_Msg.length];
				__CLOVER_250_0.cloverRec.S[21612]++;for(i=0;(((i<MsgErreur.length) && (++__CLOVER_250_0.cloverRec.CT[6640]!=0|true)) || (++__CLOVER_250_0.cloverRec.CF[6640]==0&false));i++)
				{{
					__CLOVER_250_0.cloverRec.S[21613]++;trouve=false;
					__CLOVER_250_0.cloverRec.S[21614]++;for(j=0;(((j<liste_Msg.length) && (++__CLOVER_250_0.cloverRec.CT[6641]!=0|true)) || (++__CLOVER_250_0.cloverRec.CF[6641]==0&false));j++)
					{{
						__CLOVER_250_0.cloverRec.S[21615]++;if((((!tab[j]) && (++__CLOVER_250_0.cloverRec.CT[6642]!=0|true)) || (++__CLOVER_250_0.cloverRec.CF[6642]==0&false)))
						{{
							__CLOVER_250_0.cloverRec.S[21616]++;if((((MsgErreur[i].equals(liste_Msg[j])) && (++__CLOVER_250_0.cloverRec.CT[6643]!=0|true)) || (++__CLOVER_250_0.cloverRec.CF[6643]==0&false)))
							{{
								__CLOVER_250_0.cloverRec.S[21617]++;tab[j]=true;
								__CLOVER_250_0.cloverRec.S[21618]++;trouve=true;
							}
						}}
					}}
					}__CLOVER_250_0.cloverRec.S[21619]++;if((((!trouve) && (++__CLOVER_250_0.cloverRec.CT[6644]!=0|true)) || (++__CLOVER_250_0.cloverRec.CF[6644]==0&false)))
					{{
						__CLOVER_250_0.cloverRec.S[21620]++;typeErreur="Erreurs dans fichier (no "+i+") en trop :"+MsgErreur[i];
						__CLOVER_250_0.cloverRec.S[21621]++;return false;
					}
				}}
				}__CLOVER_250_0.cloverRec.S[21622]++;for(i=0;(((i<tab.length) && (++__CLOVER_250_0.cloverRec.CT[6645]!=0|true)) || (++__CLOVER_250_0.cloverRec.CF[6645]==0&false));i++)
				{{
					__CLOVER_250_0.cloverRec.S[21623]++;if((((!tab[i]) && (++__CLOVER_250_0.cloverRec.CT[6646]!=0|true)) || (++__CLOVER_250_0.cloverRec.CF[6646]==0&false)))
					{{
						__CLOVER_250_0.cloverRec.S[21624]++;typeErreur="Erreurs dans "+type_parametre+"(no "+i+") en trop :"+MsgErreur[i];
						__CLOVER_250_0.cloverRec.S[21625]++;return false;
					}
				}}
				}__CLOVER_250_0.cloverRec.S[21626]++;return true;
			}
		}}
	}}
}
