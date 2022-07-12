/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ *//*
 * Created on 23 nov. 2003
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
public class Signature {static class __CLOVER_81_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}

	/**
	 * 
	 */
	public Signature(DeclareVar parametre[],Type retour) {__CLOVER_81_0.cloverRec.M[727]++;
		//assert(retour!=null);
		__CLOVER_81_0.cloverRec.S[13796]++;this.parametre=parametre;
		__CLOVER_81_0.cloverRec.S[13797]++;this.retour=retour;
	}

	public Signature(Signature signature,Conversion conversion)
	{__CLOVER_81_0.cloverRec.M[728]++;
		assert((((signature!=null)) && (++__CLOVER_81_0.cloverRec.CT[3011]!=0|true)) || (++__CLOVER_81_0.cloverRec.CF[3011]==0&false));
		assert((((conversion!=null)) && (++__CLOVER_81_0.cloverRec.CT[3012]!=0|true)) || (++__CLOVER_81_0.cloverRec.CF[3012]==0&false));
		__CLOVER_81_0.cloverRec.S[13798]++;int i,len;
		__CLOVER_81_0.cloverRec.S[13799]++;Type t;
		__CLOVER_81_0.cloverRec.S[13800]++;if((((signature.parametre!=null) && (++__CLOVER_81_0.cloverRec.CT[3013]!=0|true)) || (++__CLOVER_81_0.cloverRec.CF[3013]==0&false)))
		{{
			__CLOVER_81_0.cloverRec.S[13801]++;len=signature.parametre.length;
			__CLOVER_81_0.cloverRec.S[13802]++;parametre=new DeclareVar[len];
			__CLOVER_81_0.cloverRec.S[13803]++;for(i=0;(((i<len) && (++__CLOVER_81_0.cloverRec.CT[3014]!=0|true)) || (++__CLOVER_81_0.cloverRec.CF[3014]==0&false));i++)
			{{
				__CLOVER_81_0.cloverRec.S[13804]++;t=signature.parametre[i].type;
				__CLOVER_81_0.cloverRec.S[13805]++;parametre[i]=new DeclareVar(signature.parametre[i].nom,
										conversion.convertie(t));
			}
		}}
		}__CLOVER_81_0.cloverRec.S[13806]++;if((((signature.retour!=null) && (++__CLOVER_81_0.cloverRec.CT[3015]!=0|true)) || (++__CLOVER_81_0.cloverRec.CF[3015]==0&false)))
		{{
			__CLOVER_81_0.cloverRec.S[13807]++;retour=conversion.convertie(signature.retour);
		}
	}}

	public int verifie_signature(Signature signature,
								//Attribut_Heritage attribut,
								Context context,
								Table_Symbol table_symbol)
		{__CLOVER_81_0.cloverRec.M[729]++;
			assert((((signature!=null)) && (++__CLOVER_81_0.cloverRec.CT[3016]!=0|true)) || (++__CLOVER_81_0.cloverRec.CF[3016]==0&false));
			//assert(attribut!=null);
			assert((((context!=null)) && (++__CLOVER_81_0.cloverRec.CT[3017]!=0|true)) || (++__CLOVER_81_0.cloverRec.CF[3017]==0&false));
			assert((((table_symbol!=null)) && (++__CLOVER_81_0.cloverRec.CT[3018]!=0|true)) || (++__CLOVER_81_0.cloverRec.CF[3018]==0&false));
			//Type parametre[];
			//Type type_retour;
			//parametre=signature.parametre;
			//type_retour=signature.retour;
			//assert(false);
			__CLOVER_81_0.cloverRec.S[13808]++;if((((signature.parametre==null) && (++__CLOVER_81_0.cloverRec.CT[3019]!=0|true)) || (++__CLOVER_81_0.cloverRec.CF[3019]==0&false)))
			{{
				//assert(attribut.attribut.nb_param>=0);
				__CLOVER_81_0.cloverRec.S[13809]++;if((((nb_parametre()!=0) && (++__CLOVER_81_0.cloverRec.CT[3020]!=0|true)) || (++__CLOVER_81_0.cloverRec.CF[3020]==0&false)))
					{__CLOVER_81_0.cloverRec.S[13810]++;return -2;
			}}
			}else
			{{
				__CLOVER_81_0.cloverRec.S[13811]++;if((((nb_parametre()!=signature.parametre.length) && (++__CLOVER_81_0.cloverRec.CT[3021]!=0|true)) || (++__CLOVER_81_0.cloverRec.CF[3021]==0&false)))
								{__CLOVER_81_0.cloverRec.S[13812]++;return -2;
				}__CLOVER_81_0.cloverRec.S[13813]++;DeclareVar param[];
				__CLOVER_81_0.cloverRec.S[13814]++;param=this.parametre;
				__CLOVER_81_0.cloverRec.S[13815]++;for(int i=0;(((i<parametre.length) && (++__CLOVER_81_0.cloverRec.CT[3022]!=0|true)) || (++__CLOVER_81_0.cloverRec.CF[3022]==0&false));i++)
				{{
					//assert(param[i].length==1);
					//assert(parametre[i].length==1);
					__CLOVER_81_0.cloverRec.S[13816]++;if((((!context.type_compatible(signature.parametre[i].type,table_symbol,
												param[i].type,table_symbol)) && (++__CLOVER_81_0.cloverRec.CT[3023]!=0|true)) || (++__CLOVER_81_0.cloverRec.CF[3023]==0&false)))
					{{
						__CLOVER_81_0.cloverRec.S[13817]++;return i;
					}
				}}
			}}
			}__CLOVER_81_0.cloverRec.S[13818]++;if((((signature.retour==null) && (++__CLOVER_81_0.cloverRec.CT[3024]!=0|true)) || (++__CLOVER_81_0.cloverRec.CF[3024]==0&false)))
			{{
				__CLOVER_81_0.cloverRec.S[13819]++;if((((this.retour!=null) && (++__CLOVER_81_0.cloverRec.CT[3025]!=0|true)) || (++__CLOVER_81_0.cloverRec.CF[3025]==0&false)))
				{{
					__CLOVER_81_0.cloverRec.S[13820]++;return -3;
				}
			}}
			}else
			{{
				__CLOVER_81_0.cloverRec.S[13821]++;if((((this.retour==null) && (++__CLOVER_81_0.cloverRec.CT[3026]!=0|true)) || (++__CLOVER_81_0.cloverRec.CF[3026]==0&false)))
				{{
					__CLOVER_81_0.cloverRec.S[13822]++;return -3;
				}
				}else {__CLOVER_81_0.cloverRec.S[13823]++;if((((!context.type_compatible(signature.retour,
								table_symbol,
								this.retour,
								table_symbol)) && (++__CLOVER_81_0.cloverRec.CT[3027]!=0|true)) || (++__CLOVER_81_0.cloverRec.CF[3027]==0&false)))
				{{
					__CLOVER_81_0.cloverRec.S[13824]++;return -3;
				}
			}}}
			}__CLOVER_81_0.cloverRec.S[13825]++;return -1;
		}

	public int nb_parametre()
	{__CLOVER_81_0.cloverRec.M[730]++;
		__CLOVER_81_0.cloverRec.S[13826]++;if((((parametre==null) && (++__CLOVER_81_0.cloverRec.CT[3028]!=0|true)) || (++__CLOVER_81_0.cloverRec.CF[3028]==0&false)))
			{__CLOVER_81_0.cloverRec.S[13827]++;return 0;
		}else
			{__CLOVER_81_0.cloverRec.S[13828]++;return parametre.length;
	}}

	public Type getParametre(int no)
	{__CLOVER_81_0.cloverRec.M[731]++;
		assert((((no>=0)) && (++__CLOVER_81_0.cloverRec.CT[3029]!=0|true)) || (++__CLOVER_81_0.cloverRec.CF[3029]==0&false));
		assert((((no<nb_parametre())) && (++__CLOVER_81_0.cloverRec.CT[3030]!=0|true)) || (++__CLOVER_81_0.cloverRec.CF[3030]==0&false));
		__CLOVER_81_0.cloverRec.S[13829]++;return parametre[no].type;
	}

	public Type getTypeRetour()
	{__CLOVER_81_0.cloverRec.M[732]++;
		__CLOVER_81_0.cloverRec.S[13830]++;return retour;
	}

	public String getNom(int no)
	{__CLOVER_81_0.cloverRec.M[733]++;
		assert((((no>=0)) && (++__CLOVER_81_0.cloverRec.CT[3031]!=0|true)) || (++__CLOVER_81_0.cloverRec.CF[3031]==0&false));
		assert((((no<nb_parametre())) && (++__CLOVER_81_0.cloverRec.CT[3032]!=0|true)) || (++__CLOVER_81_0.cloverRec.CF[3032]==0&false));
		__CLOVER_81_0.cloverRec.S[13831]++;return parametre[no].nom;
	}

	protected DeclareVar parametre[];
	protected Type retour;
	//protected String nom[];

}
