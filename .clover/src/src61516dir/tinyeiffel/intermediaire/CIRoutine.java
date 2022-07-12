/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ *//*
 * Created on 1 f\u00e9vr. 2004
 *
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
package tinyeiffel.intermediaire;

import java.io.*;

/**
 * @author BARRET
 *
 * To change the template for this generated type comment go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
public class CIRoutine {static class __CLOVER_226_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}

	/**
	 * 
	 */
	public CIRoutine(CIClasse classe,CISource source) {__CLOVER_226_0.cloverRec.M[1325]++;
		assert((((classe!=null)) && (++__CLOVER_226_0.cloverRec.CT[5370]!=0|true)) || (++__CLOVER_226_0.cloverRec.CF[5370]==0&false));
		__CLOVER_226_0.cloverRec.S[19072]++;this.classe=classe;
		__CLOVER_226_0.cloverRec.S[19073]++;this.source=source;
	}

	public CIDeclare_Var ajoute_var_local(String nom,CIType type)
	{__CLOVER_226_0.cloverRec.M[1326]++;
		__CLOVER_226_0.cloverRec.S[19074]++;CIDeclare_Var res,tmp[];
		__CLOVER_226_0.cloverRec.S[19075]++;int i,j;
		assert((((nom!=null)) && (++__CLOVER_226_0.cloverRec.CT[5371]!=0|true)) || (++__CLOVER_226_0.cloverRec.CF[5371]==0&false));
		assert((((type!=null)) && (++__CLOVER_226_0.cloverRec.CT[5372]!=0|true)) || (++__CLOVER_226_0.cloverRec.CF[5372]==0&false));
		__CLOVER_226_0.cloverRec.S[19076]++;res=new CIDeclare_Var(nom,type,null);
		__CLOVER_226_0.cloverRec.S[19077]++;if((((local==null) && (++__CLOVER_226_0.cloverRec.CT[5373]!=0|true)) || (++__CLOVER_226_0.cloverRec.CF[5373]==0&false)))
		{{
			//local=new Declare_Var[1];
			//local[0]=res;
			__CLOVER_226_0.cloverRec.S[19078]++;local=new CIListe_Var();
		}
		/*else
		{
			tmp=new Declare_Var[local.length+1];
			for(i=0;i<local.length;i++)
			{
				tmp[i]=local[i];
			}
			tmp[i]=res;
			local=tmp;
		}*/
		}__CLOVER_226_0.cloverRec.S[19079]++;local.ajoute(res);
		__CLOVER_226_0.cloverRec.S[19080]++;return res;
	}

	public CIDeclare_Var cherche_var(String nom)
	{__CLOVER_226_0.cloverRec.M[1327]++;
		__CLOVER_226_0.cloverRec.S[19081]++;CIDeclare_Var res;
		__CLOVER_226_0.cloverRec.S[19082]++;CIAttribut attr;
		__CLOVER_226_0.cloverRec.S[19083]++;CINom_Attribut n;
		assert((((nom!=null)) && (++__CLOVER_226_0.cloverRec.CT[5374]!=0|true)) || (++__CLOVER_226_0.cloverRec.CF[5374]==0&false));
		__CLOVER_226_0.cloverRec.S[19084]++;res=cherche_var_routine(nom);
		__CLOVER_226_0.cloverRec.S[19085]++;if((((res!=null) && (++__CLOVER_226_0.cloverRec.CT[5375]!=0|true)) || (++__CLOVER_226_0.cloverRec.CF[5375]==0&false)))
			{__CLOVER_226_0.cloverRec.S[19086]++;return res;
		}__CLOVER_226_0.cloverRec.S[19087]++;attr=classe.donne_attribut(nom);
		__CLOVER_226_0.cloverRec.S[19088]++;if((((nom.equalsIgnoreCase("void")) && (++__CLOVER_226_0.cloverRec.CT[5376]!=0|true)) || (++__CLOVER_226_0.cloverRec.CF[5376]==0&false)))
			{assert((((attr!=null)) && (++__CLOVER_226_0.cloverRec.CT[5377]!=0|true)) || (++__CLOVER_226_0.cloverRec.CF[5377]==0&false)):"classe="+classe.nom+";"+classe.liste_attribut;
		}__CLOVER_226_0.cloverRec.S[19089]++;if((((attr!=null) && (++__CLOVER_226_0.cloverRec.CT[5378]!=0|true)) || (++__CLOVER_226_0.cloverRec.CF[5378]==0&false)))
		{{
			__CLOVER_226_0.cloverRec.S[19090]++;res=new CIDeclare_Var(attr.nom.nom,attr.retour,null);
			__CLOVER_226_0.cloverRec.S[19091]++;return res;
		}
		}__CLOVER_226_0.cloverRec.S[19092]++;if((((nom.compareToIgnoreCase("current")==0) && (++__CLOVER_226_0.cloverRec.CT[5379]!=0|true)) || (++__CLOVER_226_0.cloverRec.CF[5379]==0&false)))
		{{
			__CLOVER_226_0.cloverRec.S[19093]++;res=new CIDeclare_Var("Current",classe.nom,null);
			__CLOVER_226_0.cloverRec.S[19094]++;return res;
		}
		}__CLOVER_226_0.cloverRec.S[19095]++;res=classe.programme.liste_var_global.donne_var(nom);
		__CLOVER_226_0.cloverRec.S[19096]++;return res;
	}

	public CIDeclare_Var cherche_var_routine(String nom)
	{__CLOVER_226_0.cloverRec.M[1328]++;
		__CLOVER_226_0.cloverRec.S[19097]++;int i,j;
		__CLOVER_226_0.cloverRec.S[19098]++;CIDeclare_Var v;
		assert((((nom!=null)) && (++__CLOVER_226_0.cloverRec.CT[5380]!=0|true)) || (++__CLOVER_226_0.cloverRec.CF[5380]==0&false));
		__CLOVER_226_0.cloverRec.S[19099]++;if((((local!=null) && (++__CLOVER_226_0.cloverRec.CT[5381]!=0|true)) || (++__CLOVER_226_0.cloverRec.CF[5381]==0&false)))
		{{
			__CLOVER_226_0.cloverRec.S[19100]++;for(i=0;(((i<local.size()) && (++__CLOVER_226_0.cloverRec.CT[5382]!=0|true)) || (++__CLOVER_226_0.cloverRec.CF[5382]==0&false));i++)
			{{
				__CLOVER_226_0.cloverRec.S[19101]++;v=local.elt(i);
				__CLOVER_226_0.cloverRec.S[19102]++;if((((v.nom.compareToIgnoreCase(nom)==0) && (++__CLOVER_226_0.cloverRec.CT[5383]!=0|true)) || (++__CLOVER_226_0.cloverRec.CF[5383]==0&false)))
					{__CLOVER_226_0.cloverRec.S[19103]++;return v;
			}}
		}}
		}__CLOVER_226_0.cloverRec.S[19104]++;if((((parametre!=null) && (++__CLOVER_226_0.cloverRec.CT[5384]!=0|true)) || (++__CLOVER_226_0.cloverRec.CF[5384]==0&false)))
		{{
			__CLOVER_226_0.cloverRec.S[19105]++;for(i=0;(((i<parametre.size()) && (++__CLOVER_226_0.cloverRec.CT[5385]!=0|true)) || (++__CLOVER_226_0.cloverRec.CF[5385]==0&false));i++)
			{{
				__CLOVER_226_0.cloverRec.S[19106]++;v=parametre.elt(i);
				__CLOVER_226_0.cloverRec.S[19107]++;if((((v.nom.compareToIgnoreCase(nom)==0) && (++__CLOVER_226_0.cloverRec.CT[5386]!=0|true)) || (++__CLOVER_226_0.cloverRec.CF[5386]==0&false)))
					{__CLOVER_226_0.cloverRec.S[19108]++;return v;
			}}
		}}
		}__CLOVER_226_0.cloverRec.S[19109]++;if((((retour!=null) && (++__CLOVER_226_0.cloverRec.CT[5387]!=0|true)) || (++__CLOVER_226_0.cloverRec.CF[5387]==0&false)))
		{{
			__CLOVER_226_0.cloverRec.S[19110]++;if((((retour.nom.compareToIgnoreCase(nom)==0) && (++__CLOVER_226_0.cloverRec.CT[5388]!=0|true)) || (++__CLOVER_226_0.cloverRec.CF[5388]==0&false)))
				{__CLOVER_226_0.cloverRec.S[19111]++;return retour;
		}}
		}__CLOVER_226_0.cloverRec.S[19112]++;return null;
	}

	public void affiche(PrintStream out)
	{__CLOVER_226_0.cloverRec.M[1329]++;
		__CLOVER_226_0.cloverRec.S[19113]++;int i;
		assert((((out!=null)) && (++__CLOVER_226_0.cloverRec.CT[5389]!=0|true)) || (++__CLOVER_226_0.cloverRec.CF[5389]==0&false));
		__CLOVER_226_0.cloverRec.S[19114]++;if((((parametre!=null) && (++__CLOVER_226_0.cloverRec.CT[5390]!=0|true)) || (++__CLOVER_226_0.cloverRec.CF[5390]==0&false)))
		{{
			__CLOVER_226_0.cloverRec.S[19115]++;out.print("(");
			__CLOVER_226_0.cloverRec.S[19116]++;for(i=0;(((i<parametre.size()) && (++__CLOVER_226_0.cloverRec.CT[5391]!=0|true)) || (++__CLOVER_226_0.cloverRec.CF[5391]==0&false));i++)
			{{
				__CLOVER_226_0.cloverRec.S[19117]++;if((((i>0) && (++__CLOVER_226_0.cloverRec.CT[5392]!=0|true)) || (++__CLOVER_226_0.cloverRec.CF[5392]==0&false)))
					{__CLOVER_226_0.cloverRec.S[19118]++;out.print(",");
				}__CLOVER_226_0.cloverRec.S[19119]++;out.print(parametre.elt(i));
			}
			}__CLOVER_226_0.cloverRec.S[19120]++;out.print(")");
		}
		}__CLOVER_226_0.cloverRec.S[19121]++;if((((retour!=null) && (++__CLOVER_226_0.cloverRec.CT[5393]!=0|true)) || (++__CLOVER_226_0.cloverRec.CF[5393]==0&false)))
		{{
			__CLOVER_226_0.cloverRec.S[19122]++;out.println(":"+retour);
		}
		}else
			{__CLOVER_226_0.cloverRec.S[19123]++;out.println();
		}__CLOVER_226_0.cloverRec.S[19124]++;out.println("local");
		__CLOVER_226_0.cloverRec.S[19125]++;if((((local!=null) && (++__CLOVER_226_0.cloverRec.CT[5394]!=0|true)) || (++__CLOVER_226_0.cloverRec.CF[5394]==0&false)))
		{{
			__CLOVER_226_0.cloverRec.S[19126]++;for(i=0;(((i<local.size()) && (++__CLOVER_226_0.cloverRec.CT[5395]!=0|true)) || (++__CLOVER_226_0.cloverRec.CF[5395]==0&false));i++)
			{{
				__CLOVER_226_0.cloverRec.S[19127]++;out.println(local.elt(i));
			}
		}}
		}__CLOVER_226_0.cloverRec.S[19128]++;out.println("do");
		__CLOVER_226_0.cloverRec.S[19129]++;if((((liste_instruction!=null) && (++__CLOVER_226_0.cloverRec.CT[5396]!=0|true)) || (++__CLOVER_226_0.cloverRec.CF[5396]==0&false)))
		{{
			__CLOVER_226_0.cloverRec.S[19130]++;for(i=0;(((i<liste_instruction.size()) && (++__CLOVER_226_0.cloverRec.CT[5397]!=0|true)) || (++__CLOVER_226_0.cloverRec.CF[5397]==0&false));i++)
			{{
				__CLOVER_226_0.cloverRec.S[19131]++;liste_instruction.elt(i).affiche(out);
			}
		}}
		}__CLOVER_226_0.cloverRec.S[19132]++;out.println("end");
	}

	public void toXML(PrintStream out)
	{__CLOVER_226_0.cloverRec.M[1330]++;
		__CLOVER_226_0.cloverRec.S[19133]++;int i,j;
		assert((((out!=null)) && (++__CLOVER_226_0.cloverRec.CT[5398]!=0|true)) || (++__CLOVER_226_0.cloverRec.CF[5398]==0&false));
		__CLOVER_226_0.cloverRec.S[19134]++;out.println("<routine>");
		__CLOVER_226_0.cloverRec.S[19135]++;out.println("<signature>");
		__CLOVER_226_0.cloverRec.S[19136]++;if((((parametre!=null) && (++__CLOVER_226_0.cloverRec.CT[5399]!=0|true)) || (++__CLOVER_226_0.cloverRec.CF[5399]==0&false)))
		{{
			/*for(i=0;i<parametre.size();i++)
			{
				parametre.elt(i).toXML(out);
			}*/
			__CLOVER_226_0.cloverRec.S[19137]++;parametre.toXML(out);
		}
		}__CLOVER_226_0.cloverRec.S[19138]++;if((((retour!=null) && (++__CLOVER_226_0.cloverRec.CT[5400]!=0|true)) || (++__CLOVER_226_0.cloverRec.CF[5400]==0&false)))
			{__CLOVER_226_0.cloverRec.S[19139]++;retour.toXML(out);
		}__CLOVER_226_0.cloverRec.S[19140]++;out.println("</signature>");
		__CLOVER_226_0.cloverRec.S[19141]++;if((((precondition!=null) && (++__CLOVER_226_0.cloverRec.CT[5401]!=0|true)) || (++__CLOVER_226_0.cloverRec.CF[5401]==0&false)))
		{{
			__CLOVER_226_0.cloverRec.S[19142]++;precondition.toXML(out,"precondition");
		}
		}__CLOVER_226_0.cloverRec.S[19143]++;if((((local!=null) && (++__CLOVER_226_0.cloverRec.CT[5402]!=0|true)) || (++__CLOVER_226_0.cloverRec.CF[5402]==0&false)))
		{{
			/*for(i=0;i<local.size();i++)
			{
				local.elt(i).toXML(out);
			}*/
			__CLOVER_226_0.cloverRec.S[19144]++;local.toXML(out);
		}
		}__CLOVER_226_0.cloverRec.S[19145]++;out.println("<instruction>");
		__CLOVER_226_0.cloverRec.S[19146]++;if((((liste_instruction!=null) && (++__CLOVER_226_0.cloverRec.CT[5403]!=0|true)) || (++__CLOVER_226_0.cloverRec.CF[5403]==0&false)))
		{{
			/*for(i=0;i<liste_instruction.size();i++)
			{
				liste_instruction.elt(i).toXML(out);
			}*/
			__CLOVER_226_0.cloverRec.S[19147]++;liste_instruction.toXML(out);
		}
		}__CLOVER_226_0.cloverRec.S[19148]++;out.println("</instruction>");
		__CLOVER_226_0.cloverRec.S[19149]++;if((((postcondition!=null) && (++__CLOVER_226_0.cloverRec.CT[5404]!=0|true)) || (++__CLOVER_226_0.cloverRec.CF[5404]==0&false)))
		{{
			__CLOVER_226_0.cloverRec.S[19150]++;postcondition.toXML(out,"postcondition");
		}
		}__CLOVER_226_0.cloverRec.S[19151]++;if((((source!=null) && (++__CLOVER_226_0.cloverRec.CT[5405]!=0|true)) || (++__CLOVER_226_0.cloverRec.CF[5405]==0&false)))
		{{
			__CLOVER_226_0.cloverRec.S[19152]++;source.toXML(out);
		}
		}__CLOVER_226_0.cloverRec.S[19153]++;out.println("</routine>");
	}

	public void check_egal(CIRoutine r)
	{__CLOVER_226_0.cloverRec.M[1331]++;
		__CLOVER_226_0.cloverRec.S[19154]++;int i;
		assert((((r!=null)) && (++__CLOVER_226_0.cloverRec.CT[5406]!=0|true)) || (++__CLOVER_226_0.cloverRec.CF[5406]==0&false));
		__CLOVER_226_0.cloverRec.S[19155]++;if((((liste_instruction==null||liste_instruction.size()==0) && (++__CLOVER_226_0.cloverRec.CT[5407]!=0|true)) || (++__CLOVER_226_0.cloverRec.CF[5407]==0&false)))
			{assert((((r.liste_instruction==null||r.liste_instruction.size()==0)) && (++__CLOVER_226_0.cloverRec.CT[5408]!=0|true)) || (++__CLOVER_226_0.cloverRec.CF[5408]==0&false));
		}else
		{{
			/*assert(r.liste_instruction!=null);
			assert(r.liste_instruction.length==liste_instruction.length);
			for(i=0;i<liste_instruction.length;i++)
			{
				liste_instruction[i].check_egal(r.liste_instruction[i]);
			}*/
			__CLOVER_226_0.cloverRec.S[19156]++;liste_instruction.check_egal(r.liste_instruction);
		}
		}__CLOVER_226_0.cloverRec.S[19157]++;if((((local==null||local.size()==0) && (++__CLOVER_226_0.cloverRec.CT[5409]!=0|true)) || (++__CLOVER_226_0.cloverRec.CF[5409]==0&false)))
			{assert((((r.local==null||r.local.size()==0)) && (++__CLOVER_226_0.cloverRec.CT[5410]!=0|true)) || (++__CLOVER_226_0.cloverRec.CF[5410]==0&false));
		}else
			{__CLOVER_226_0.cloverRec.S[19158]++;local.check_egal(r.local);
		}__CLOVER_226_0.cloverRec.S[19159]++;if((((parametre==null||parametre.size()==0) && (++__CLOVER_226_0.cloverRec.CT[5411]!=0|true)) || (++__CLOVER_226_0.cloverRec.CF[5411]==0&false)))
			{assert((((r.parametre==null||r.parametre.size()==0)) && (++__CLOVER_226_0.cloverRec.CT[5412]!=0|true)) || (++__CLOVER_226_0.cloverRec.CF[5412]==0&false));
		}else
			{__CLOVER_226_0.cloverRec.S[19160]++;parametre.check_egal(r.parametre);
		}__CLOVER_226_0.cloverRec.S[19161]++;if((((retour==null) && (++__CLOVER_226_0.cloverRec.CT[5413]!=0|true)) || (++__CLOVER_226_0.cloverRec.CF[5413]==0&false)))
			{assert((((r.retour==null)) && (++__CLOVER_226_0.cloverRec.CT[5414]!=0|true)) || (++__CLOVER_226_0.cloverRec.CF[5414]==0&false));
		}else
		{{
			assert((((r.retour!=null)) && (++__CLOVER_226_0.cloverRec.CT[5415]!=0|true)) || (++__CLOVER_226_0.cloverRec.CF[5415]==0&false));
			__CLOVER_226_0.cloverRec.S[19162]++;retour.check_egal(r.retour);
		}
		}__CLOVER_226_0.cloverRec.S[19163]++;if((((precondition==null) && (++__CLOVER_226_0.cloverRec.CT[5416]!=0|true)) || (++__CLOVER_226_0.cloverRec.CF[5416]==0&false)))
			{assert((((r.precondition==null)) && (++__CLOVER_226_0.cloverRec.CT[5417]!=0|true)) || (++__CLOVER_226_0.cloverRec.CF[5417]==0&false)):"r="+r.precondition.liste_instr.size();
		}else
			{__CLOVER_226_0.cloverRec.S[19164]++;precondition.check_egal(r.precondition);
		}__CLOVER_226_0.cloverRec.S[19165]++;if((((postcondition==null) && (++__CLOVER_226_0.cloverRec.CT[5418]!=0|true)) || (++__CLOVER_226_0.cloverRec.CF[5418]==0&false)))
			{assert((((r.postcondition==null)) && (++__CLOVER_226_0.cloverRec.CT[5419]!=0|true)) || (++__CLOVER_226_0.cloverRec.CF[5419]==0&false));
		}else
			{__CLOVER_226_0.cloverRec.S[19166]++;postcondition.check_egal(r.postcondition);
		}__CLOVER_226_0.cloverRec.S[19167]++;if((((source!=null) && (++__CLOVER_226_0.cloverRec.CT[5420]!=0|true)) || (++__CLOVER_226_0.cloverRec.CF[5420]==0&false)))
		{{
			__CLOVER_226_0.cloverRec.S[19168]++;source.check_egal(r.source);
		}
		}else
		{{
			assert((((r.source==null)) && (++__CLOVER_226_0.cloverRec.CT[5421]!=0|true)) || (++__CLOVER_226_0.cloverRec.CF[5421]==0&false));
		}
	}}
	
	public CIClasse classe;
	//public Instruction liste_instruction[];
	public CIListe_Instr liste_instruction;
	public CIDeclare_Var retour;//local[],parametre[],
	public CIListe_Var local,parametre;
	public CIAssertion precondition,postcondition;
	public CISource source;

}
