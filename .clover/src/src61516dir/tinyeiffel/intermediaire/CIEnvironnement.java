/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ *//*
 * Created on 10 avr. 2004
 *
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
package tinyeiffel.intermediaire;

import java.util.Vector;

/**
 * @author BARRET
 *
 * To change the template for this generated type comment go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
public class CIEnvironnement {static class __CLOVER_193_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}

	public CIEnvironnement(CIClasse cl,CIProgramme p)
	{__CLOVER_193_0.cloverRec.M[1143]++;
		assert((((cl!=null)) && (++__CLOVER_193_0.cloverRec.CT[4264]!=0|true)) || (++__CLOVER_193_0.cloverRec.CF[4264]==0&false));
		__CLOVER_193_0.cloverRec.S[17110]++;classe=cl;
		__CLOVER_193_0.cloverRec.S[17111]++;liste_attr=new Vector();
		__CLOVER_193_0.cloverRec.S[17112]++;no_instr=-1;
		__CLOVER_193_0.cloverRec.S[17113]++;programme=p;
	}
	
	public void entre_attribut(CINom_Attribut nom)
	{__CLOVER_193_0.cloverRec.M[1144]++;
		assert((((nom!=null)) && (++__CLOVER_193_0.cloverRec.CT[4265]!=0|true)) || (++__CLOVER_193_0.cloverRec.CF[4265]==0&false));
		assert((((nom_attr==null)) && (++__CLOVER_193_0.cloverRec.CT[4266]!=0|true)) || (++__CLOVER_193_0.cloverRec.CF[4266]==0&false));
		assert((((no_instr==-1)) && (++__CLOVER_193_0.cloverRec.CT[4267]!=0|true)) || (++__CLOVER_193_0.cloverRec.CF[4267]==0&false));
		__CLOVER_193_0.cloverRec.S[17114]++;nom_attr=nom;
		__CLOVER_193_0.cloverRec.S[17115]++;liste_var_local=new Vector();
	}
	
	public void sort_attribut()
	{__CLOVER_193_0.cloverRec.M[1145]++;
		assert((((nom_attr!=null)) && (++__CLOVER_193_0.cloverRec.CT[4268]!=0|true)) || (++__CLOVER_193_0.cloverRec.CF[4268]==0&false));
		__CLOVER_193_0.cloverRec.S[17116]++;nom_attr=null;
		__CLOVER_193_0.cloverRec.S[17117]++;liste_var_local=null;
		__CLOVER_193_0.cloverRec.S[17118]++;no_instr=-1;
	}
	
	public void entre_instr()
	{__CLOVER_193_0.cloverRec.M[1146]++;
		assert((((nom_attr!=null)) && (++__CLOVER_193_0.cloverRec.CT[4269]!=0|true)) || (++__CLOVER_193_0.cloverRec.CF[4269]==0&false));
		__CLOVER_193_0.cloverRec.S[17119]++;if((((no_instr<=0) && (++__CLOVER_193_0.cloverRec.CT[4270]!=0|true)) || (++__CLOVER_193_0.cloverRec.CF[4270]==0&false)))
			{__CLOVER_193_0.cloverRec.S[17120]++;no_instr=1;
		}else
			{__CLOVER_193_0.cloverRec.S[17121]++;no_instr++;
	}}

	public void sort_instr()
	{__CLOVER_193_0.cloverRec.M[1147]++;
		assert((((nom_attr!=null)) && (++__CLOVER_193_0.cloverRec.CT[4271]!=0|true)) || (++__CLOVER_193_0.cloverRec.CF[4271]==0&false));
	}
	
	public void ajoute_var_local(CIDeclare_Var v)
	{__CLOVER_193_0.cloverRec.M[1148]++;
		assert((((v!=null)) && (++__CLOVER_193_0.cloverRec.CT[4272]!=0|true)) || (++__CLOVER_193_0.cloverRec.CF[4272]==0&false));
		__CLOVER_193_0.cloverRec.S[17122]++;liste_var_local.add(v);
	}
	
	public boolean var_existe(String nom)
	{__CLOVER_193_0.cloverRec.M[1149]++;
		assert((((nom!=null)) && (++__CLOVER_193_0.cloverRec.CT[4273]!=0|true)) || (++__CLOVER_193_0.cloverRec.CF[4273]==0&false));
		__CLOVER_193_0.cloverRec.S[17123]++;int i;
		__CLOVER_193_0.cloverRec.S[17124]++;String s;
		__CLOVER_193_0.cloverRec.S[17125]++;CINom_Attribut attr;
		__CLOVER_193_0.cloverRec.S[17126]++;if((((liste_var_local!=null) && (++__CLOVER_193_0.cloverRec.CT[4274]!=0|true)) || (++__CLOVER_193_0.cloverRec.CF[4274]==0&false)))
		{{
			__CLOVER_193_0.cloverRec.S[17127]++;for(i=0;(((i<liste_var_local.size()) && (++__CLOVER_193_0.cloverRec.CT[4275]!=0|true)) || (++__CLOVER_193_0.cloverRec.CF[4275]==0&false));i++)
			{{
				__CLOVER_193_0.cloverRec.S[17128]++;s=((CIDeclare_Var)liste_var_local.elementAt(i)).nom;
				__CLOVER_193_0.cloverRec.S[17129]++;if((((s.equalsIgnoreCase(nom)) && (++__CLOVER_193_0.cloverRec.CT[4276]!=0|true)) || (++__CLOVER_193_0.cloverRec.CF[4276]==0&false)))
					{__CLOVER_193_0.cloverRec.S[17130]++;return true;
			}}
		}}
		}__CLOVER_193_0.cloverRec.S[17131]++;if((((classe.liste_attribut!=null&&classe.liste_attribut.length>0) && (++__CLOVER_193_0.cloverRec.CT[4277]!=0|true)) || (++__CLOVER_193_0.cloverRec.CF[4277]==0&false)))
		{{
			__CLOVER_193_0.cloverRec.S[17132]++;for(i=0;(((i<classe.liste_attribut.length) && (++__CLOVER_193_0.cloverRec.CT[4278]!=0|true)) || (++__CLOVER_193_0.cloverRec.CF[4278]==0&false));i++)
			{{
				__CLOVER_193_0.cloverRec.S[17133]++;attr=classe.liste_attribut[i].nom;
				__CLOVER_193_0.cloverRec.S[17134]++;if((((!attr.infix&&!attr.prefix) && (++__CLOVER_193_0.cloverRec.CT[4279]!=0|true)) || (++__CLOVER_193_0.cloverRec.CF[4279]==0&false)))
				{{
					__CLOVER_193_0.cloverRec.S[17135]++;if((((attr.nom.equalsIgnoreCase(nom)) && (++__CLOVER_193_0.cloverRec.CT[4280]!=0|true)) || (++__CLOVER_193_0.cloverRec.CF[4280]==0&false)))
						{__CLOVER_193_0.cloverRec.S[17136]++;return true;
				}}
			}}
		}}
		}__CLOVER_193_0.cloverRec.S[17137]++;return false;
	}
	
	public CIType var_type(String nom)
	{__CLOVER_193_0.cloverRec.M[1150]++;
		assert((((nom!=null)) && (++__CLOVER_193_0.cloverRec.CT[4281]!=0|true)) || (++__CLOVER_193_0.cloverRec.CF[4281]==0&false));
		__CLOVER_193_0.cloverRec.S[17138]++;int i;
		__CLOVER_193_0.cloverRec.S[17139]++;String s;
		__CLOVER_193_0.cloverRec.S[17140]++;CIDeclare_Var d;
		__CLOVER_193_0.cloverRec.S[17141]++;CINom_Attribut attr;
		__CLOVER_193_0.cloverRec.S[17142]++;if((((liste_var_local!=null) && (++__CLOVER_193_0.cloverRec.CT[4282]!=0|true)) || (++__CLOVER_193_0.cloverRec.CF[4282]==0&false)))
		{{
			__CLOVER_193_0.cloverRec.S[17143]++;for(i=0;(((i<liste_var_local.size()) && (++__CLOVER_193_0.cloverRec.CT[4283]!=0|true)) || (++__CLOVER_193_0.cloverRec.CF[4283]==0&false));i++)
			{{
				__CLOVER_193_0.cloverRec.S[17144]++;d=(CIDeclare_Var)liste_var_local.elementAt(i);
				__CLOVER_193_0.cloverRec.S[17145]++;s=d.nom;
				__CLOVER_193_0.cloverRec.S[17146]++;if((((s.equalsIgnoreCase(nom)) && (++__CLOVER_193_0.cloverRec.CT[4284]!=0|true)) || (++__CLOVER_193_0.cloverRec.CF[4284]==0&false)))
					{__CLOVER_193_0.cloverRec.S[17147]++;return d.type;
			}}
		}}
		}__CLOVER_193_0.cloverRec.S[17148]++;if((((classe.liste_attribut!=null&&classe.liste_attribut.length>0) && (++__CLOVER_193_0.cloverRec.CT[4285]!=0|true)) || (++__CLOVER_193_0.cloverRec.CF[4285]==0&false)))
		{{
			__CLOVER_193_0.cloverRec.S[17149]++;for(i=0;(((i<classe.liste_attribut.length) && (++__CLOVER_193_0.cloverRec.CT[4286]!=0|true)) || (++__CLOVER_193_0.cloverRec.CF[4286]==0&false));i++)
			{{
				__CLOVER_193_0.cloverRec.S[17150]++;attr=classe.liste_attribut[i].nom;
				__CLOVER_193_0.cloverRec.S[17151]++;if((((!attr.infix&&!attr.prefix) && (++__CLOVER_193_0.cloverRec.CT[4287]!=0|true)) || (++__CLOVER_193_0.cloverRec.CF[4287]==0&false)))
				{{
					__CLOVER_193_0.cloverRec.S[17152]++;if((((attr.nom.equalsIgnoreCase(nom)) && (++__CLOVER_193_0.cloverRec.CT[4288]!=0|true)) || (++__CLOVER_193_0.cloverRec.CF[4288]==0&false)))
					{{
						__CLOVER_193_0.cloverRec.S[17153]++;if((((classe.liste_attribut[i].est_descendant()) && (++__CLOVER_193_0.cloverRec.CT[4289]!=0|true)) || (++__CLOVER_193_0.cloverRec.CF[4289]==0&false)))
						{{
							__CLOVER_193_0.cloverRec.S[17154]++;CIAttribut_Ascendant a1;
							__CLOVER_193_0.cloverRec.S[17155]++;CIAttribut a2;
							__CLOVER_193_0.cloverRec.S[17156]++;int no;
							assert((((classe.liste_attribut[i].attribut_ascendant!=null)) && (++__CLOVER_193_0.cloverRec.CT[4290]!=0|true)) || (++__CLOVER_193_0.cloverRec.CF[4290]==0&false));
							assert((((classe.liste_attribut[i].attribut_ascendant.length==1)) && (++__CLOVER_193_0.cloverRec.CT[4291]!=0|true)) || (++__CLOVER_193_0.cloverRec.CF[4291]==0&false));
							__CLOVER_193_0.cloverRec.S[17157]++;a1=classe.liste_attribut[i].attribut_ascendant[0];
							__CLOVER_193_0.cloverRec.S[17158]++;a2=a1.donne_attribut(attr,classe,programme);
							assert((((a2!=null)) && (++__CLOVER_193_0.cloverRec.CT[4292]!=0|true)) || (++__CLOVER_193_0.cloverRec.CF[4292]==0&false));
							assert((((a2.retour!=null)) && (++__CLOVER_193_0.cloverRec.CT[4293]!=0|true)) || (++__CLOVER_193_0.cloverRec.CF[4293]==0&false));
							__CLOVER_193_0.cloverRec.S[17159]++;return a2.retour;
						}
						}else
						{{
							__CLOVER_193_0.cloverRec.S[17160]++;return classe.liste_attribut[i].type_retour();
						}
					}}
				}}
			}}
		}}
		}__CLOVER_193_0.cloverRec.S[17161]++;return null;
	}
	
	public String toString()
	{__CLOVER_193_0.cloverRec.M[1151]++;
		__CLOVER_193_0.cloverRec.S[17162]++;String res;
		__CLOVER_193_0.cloverRec.S[17163]++;if((((classe==null) && (++__CLOVER_193_0.cloverRec.CT[4294]!=0|true)) || (++__CLOVER_193_0.cloverRec.CF[4294]==0&false)))
			{__CLOVER_193_0.cloverRec.S[17164]++;res="Aucune classe";
		}else
		{{
			__CLOVER_193_0.cloverRec.S[17165]++;res=classe.nom.nom.toUpperCase();
			__CLOVER_193_0.cloverRec.S[17166]++;if((((nom_attr!=null) && (++__CLOVER_193_0.cloverRec.CT[4295]!=0|true)) || (++__CLOVER_193_0.cloverRec.CF[4295]==0&false)))
			{{
				__CLOVER_193_0.cloverRec.S[17167]++;res+="."+nom_attr.toString().toLowerCase();
				__CLOVER_193_0.cloverRec.S[17168]++;if((((no_instr>0) && (++__CLOVER_193_0.cloverRec.CT[4296]!=0|true)) || (++__CLOVER_193_0.cloverRec.CF[4296]==0&false)))
					{__CLOVER_193_0.cloverRec.S[17169]++;res+=" instruction no "+no_instr;
			}}
		}}
		}__CLOVER_193_0.cloverRec.S[17170]++;return res;
	}
	
	public CIClasse classe;
	public CINom_Attribut nom_attr;
	public Vector liste_attr,liste_var_local;
	public int no_instr;
	public CIProgramme programme;

}
