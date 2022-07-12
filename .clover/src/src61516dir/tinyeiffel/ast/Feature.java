/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ */package tinyeiffel.ast;

import java.util.*;
import java.io.*;

public abstract class Feature implements ToXML,Traite
{static class __CLOVER_21_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}
	public NomFeature cherche_nom(NomFeature nom)
	{__CLOVER_21_0.cloverRec.M[123]++;
		__CLOVER_21_0.cloverRec.S[651]++;if((((nom==null) && (++__CLOVER_21_0.cloverRec.CT[208]!=0|true)) || (++__CLOVER_21_0.cloverRec.CF[208]==0&false)))
			{__CLOVER_21_0.cloverRec.S[652]++;return null;
		}__CLOVER_21_0.cloverRec.S[653]++;for(int i=0;(((i<liste_nom.length) && (++__CLOVER_21_0.cloverRec.CT[209]!=0|true)) || (++__CLOVER_21_0.cloverRec.CF[209]==0&false));i++)
		{{
			__CLOVER_21_0.cloverRec.S[654]++;if((((nom.equals(liste_nom[i])) && (++__CLOVER_21_0.cloverRec.CT[210]!=0|true)) || (++__CLOVER_21_0.cloverRec.CF[210]==0&false)))
			{{
				__CLOVER_21_0.cloverRec.S[655]++;return liste_nom[i];
			}
		}}
		}__CLOVER_21_0.cloverRec.S[656]++;return null;
	}

	public void set_require_ensure(Vector require,Vector ensure,
		Vector rescue,Chaine obsolete,Vector commentaire,
		Vector commentaire2)
	{__CLOVER_21_0.cloverRec.M[124]++;
		__CLOVER_21_0.cloverRec.S[657]++;this.require=new Assert[require.size()];
		__CLOVER_21_0.cloverRec.S[658]++;require.copyInto(this.require);
		__CLOVER_21_0.cloverRec.S[659]++;this.ensure=new Assert[ensure.size()];
		__CLOVER_21_0.cloverRec.S[660]++;ensure.copyInto(this.ensure);
		__CLOVER_21_0.cloverRec.S[661]++;this.rescue=new Instr[rescue.size()];
		__CLOVER_21_0.cloverRec.S[662]++;rescue.copyInto(this.rescue);
		__CLOVER_21_0.cloverRec.S[663]++;this.obsolete=obsolete;
		__CLOVER_21_0.cloverRec.S[664]++;if((((commentaire!=null) && (++__CLOVER_21_0.cloverRec.CT[211]!=0|true)) || (++__CLOVER_21_0.cloverRec.CF[211]==0&false)))
		{{
			__CLOVER_21_0.cloverRec.S[665]++;this.commentaire=new Commentaire[commentaire.size()];
			__CLOVER_21_0.cloverRec.S[666]++;commentaire.copyInto(this.commentaire);
		}
		}__CLOVER_21_0.cloverRec.S[667]++;if((((commentaire2!=null) && (++__CLOVER_21_0.cloverRec.CT[212]!=0|true)) || (++__CLOVER_21_0.cloverRec.CF[212]==0&false)))
		{{
			__CLOVER_21_0.cloverRec.S[668]++;this.commentaire2=new Commentaire[commentaire2.size()];
			__CLOVER_21_0.cloverRec.S[669]++;commentaire2.copyInto(this.commentaire2);
		}
	}}

	public void set_nom_param(Vector nom,Vector param,Vector export,Vector comment)
	{__CLOVER_21_0.cloverRec.M[125]++;
		__CLOVER_21_0.cloverRec.S[670]++;this.liste_nom=new NomFeature[nom.size()];
		__CLOVER_21_0.cloverRec.S[671]++;nom.copyInto(this.liste_nom);
		__CLOVER_21_0.cloverRec.S[672]++;if((((param!=null) && (++__CLOVER_21_0.cloverRec.CT[213]!=0|true)) || (++__CLOVER_21_0.cloverRec.CF[213]==0&false)))
		{{
			__CLOVER_21_0.cloverRec.S[673]++;this.param=new DeclareVar[param.size()];
			__CLOVER_21_0.cloverRec.S[674]++;param.copyInto(this.param);
		}
		}__CLOVER_21_0.cloverRec.S[675]++;if((((export!=null) && (++__CLOVER_21_0.cloverRec.CT[214]!=0|true)) || (++__CLOVER_21_0.cloverRec.CF[214]==0&false)))
		{{
			__CLOVER_21_0.cloverRec.S[676]++;this.export=new Type[export.size()];
			__CLOVER_21_0.cloverRec.S[677]++;export.copyInto(this.export);
		}
		}__CLOVER_21_0.cloverRec.S[678]++;if((((comment!=null) && (++__CLOVER_21_0.cloverRec.CT[215]!=0|true)) || (++__CLOVER_21_0.cloverRec.CF[215]==0&false)))
		{{
			__CLOVER_21_0.cloverRec.S[679]++;this.commentaire3=new Commentaire[comment.size()];
			__CLOVER_21_0.cloverRec.S[680]++;comment.copyInto(this.commentaire3);
		}
	}}

        public void set_token(Token tobsolete,Token trequire,
                              Token tensure,Token trescue)
        {__CLOVER_21_0.cloverRec.M[126]++;
          __CLOVER_21_0.cloverRec.S[681]++;this.tobsolete=tobsolete;
          __CLOVER_21_0.cloverRec.S[682]++;this.trequire=trequire;
          __CLOVER_21_0.cloverRec.S[683]++;this.tensure=tensure;
          __CLOVER_21_0.cloverRec.S[684]++;this.trescue=trescue;
        }

        public void set_token(Token tunique)
        {__CLOVER_21_0.cloverRec.M[127]++;
          __CLOVER_21_0.cloverRec.S[685]++;this.tunique=tunique;
        }

        public Position debut()
        {__CLOVER_21_0.cloverRec.M[128]++;
          //if(tfeature!=null)
            //return tfeature.debut();
          __CLOVER_21_0.cloverRec.S[686]++;if((((liste_nom!=null) && (++__CLOVER_21_0.cloverRec.CT[216]!=0|true)) || (++__CLOVER_21_0.cloverRec.CF[216]==0&false)))
            {__CLOVER_21_0.cloverRec.S[687]++;return liste_nom[0].debut();
          }__CLOVER_21_0.cloverRec.S[688]++;return null;
        }

	public boolean is_deferred()
	{__CLOVER_21_0.cloverRec.M[129]++;
		__CLOVER_21_0.cloverRec.S[689]++;return false;
	}

	public boolean est_routine()
	{__CLOVER_21_0.cloverRec.M[130]++;// est routine, ou external, ou deferred
		__CLOVER_21_0.cloverRec.S[690]++;return false;
	}

	public boolean est_constant()
	{__CLOVER_21_0.cloverRec.M[131]++;
		__CLOVER_21_0.cloverRec.S[691]++;return false;
	}

	public boolean est_variable()
	{__CLOVER_21_0.cloverRec.M[132]++;
		__CLOVER_21_0.cloverRec.S[692]++;return false;
	}

	public boolean est_external()
	{__CLOVER_21_0.cloverRec.M[133]++;
		__CLOVER_21_0.cloverRec.S[693]++;return false;
	}

	public void check_egal(Feature f)
	{__CLOVER_21_0.cloverRec.M[134]++;
		assert((((f!=null)) && (++__CLOVER_21_0.cloverRec.CT[217]!=0|true)) || (++__CLOVER_21_0.cloverRec.CF[217]==0&false));
		__CLOVER_21_0.cloverRec.S[694]++;int i;
		/********/
		__CLOVER_21_0.cloverRec.S[695]++;if((((liste_nom==null) && (++__CLOVER_21_0.cloverRec.CT[218]!=0|true)) || (++__CLOVER_21_0.cloverRec.CF[218]==0&false)))
			{assert((((f.liste_nom==null)) && (++__CLOVER_21_0.cloverRec.CT[219]!=0|true)) || (++__CLOVER_21_0.cloverRec.CF[219]==0&false));
		}else
		{{
			assert((((f.liste_nom!=null)) && (++__CLOVER_21_0.cloverRec.CT[220]!=0|true)) || (++__CLOVER_21_0.cloverRec.CF[220]==0&false));
			assert((((liste_nom.length==f.liste_nom.length)) && (++__CLOVER_21_0.cloverRec.CT[221]!=0|true)) || (++__CLOVER_21_0.cloverRec.CF[221]==0&false));
			__CLOVER_21_0.cloverRec.S[696]++;for(i=0;(((i<liste_nom.length) && (++__CLOVER_21_0.cloverRec.CT[222]!=0|true)) || (++__CLOVER_21_0.cloverRec.CF[222]==0&false));i++)
			{{
				__CLOVER_21_0.cloverRec.S[697]++;liste_nom[i].check_egal(f.liste_nom[i]);		
			}
		}}
		/********/
		}__CLOVER_21_0.cloverRec.S[698]++;if((((param==null) && (++__CLOVER_21_0.cloverRec.CT[223]!=0|true)) || (++__CLOVER_21_0.cloverRec.CF[223]==0&false)))
			{assert((((f.param==null)) && (++__CLOVER_21_0.cloverRec.CT[224]!=0|true)) || (++__CLOVER_21_0.cloverRec.CF[224]==0&false));
		}else
		{{
			assert((((f.param!=null)) && (++__CLOVER_21_0.cloverRec.CT[225]!=0|true)) || (++__CLOVER_21_0.cloverRec.CF[225]==0&false));
			__CLOVER_21_0.cloverRec.S[699]++;if((((param.length!=f.param.length) && (++__CLOVER_21_0.cloverRec.CT[226]!=0|true)) || (++__CLOVER_21_0.cloverRec.CF[226]==0&false)))
			{{
				__CLOVER_21_0.cloverRec.S[700]++;System.out.println("Diff:");
				__CLOVER_21_0.cloverRec.S[701]++;for(i=0;(((i<param.length) && (++__CLOVER_21_0.cloverRec.CT[227]!=0|true)) || (++__CLOVER_21_0.cloverRec.CF[227]==0&false));i++)
				{{
					__CLOVER_21_0.cloverRec.S[702]++;System.out.println(i+")"+param[i].toString2());
				}
				}__CLOVER_21_0.cloverRec.S[703]++;System.out.println("/=");
				__CLOVER_21_0.cloverRec.S[704]++;for(i=0;(((i<f.param.length) && (++__CLOVER_21_0.cloverRec.CT[228]!=0|true)) || (++__CLOVER_21_0.cloverRec.CF[228]==0&false));i++)
				{{
					__CLOVER_21_0.cloverRec.S[705]++;System.out.println(i+")"+f.param[i].toString2());
				}
			}}
			}assert((((param.length==f.param.length)) && (++__CLOVER_21_0.cloverRec.CT[229]!=0|true)) || (++__CLOVER_21_0.cloverRec.CF[229]==0&false)):
						"difference:"+param.length+"!="+
										f.param.length;
			__CLOVER_21_0.cloverRec.S[706]++;for(i=0;(((i<param.length) && (++__CLOVER_21_0.cloverRec.CT[230]!=0|true)) || (++__CLOVER_21_0.cloverRec.CF[230]==0&false));i++)
			{{
				__CLOVER_21_0.cloverRec.S[707]++;param[i].check_egal(f.param[i]);		
			}
		}}
		/********/
		}__CLOVER_21_0.cloverRec.S[708]++;if((((require==null||require.length==0) && (++__CLOVER_21_0.cloverRec.CT[231]!=0|true)) || (++__CLOVER_21_0.cloverRec.CF[231]==0&false)))
			{assert((((f.require==null||f.require.length==0)) && (++__CLOVER_21_0.cloverRec.CT[232]!=0|true)) || (++__CLOVER_21_0.cloverRec.CF[232]==0&false));
		}else
		{{
			assert((((f.require!=null)) && (++__CLOVER_21_0.cloverRec.CT[233]!=0|true)) || (++__CLOVER_21_0.cloverRec.CF[233]==0&false));
			assert((((require.length==f.require.length)) && (++__CLOVER_21_0.cloverRec.CT[234]!=0|true)) || (++__CLOVER_21_0.cloverRec.CF[234]==0&false));
			__CLOVER_21_0.cloverRec.S[709]++;for(i=0;(((i<require.length) && (++__CLOVER_21_0.cloverRec.CT[235]!=0|true)) || (++__CLOVER_21_0.cloverRec.CF[235]==0&false));i++)
			{{
				__CLOVER_21_0.cloverRec.S[710]++;require[i].check_egal(f.require[i]);		
			}
		}}
		/********/
		}__CLOVER_21_0.cloverRec.S[711]++;if((((ensure==null||ensure.length==0) && (++__CLOVER_21_0.cloverRec.CT[236]!=0|true)) || (++__CLOVER_21_0.cloverRec.CF[236]==0&false)))
			{assert((((f.ensure==null||f.ensure.length==0)) && (++__CLOVER_21_0.cloverRec.CT[237]!=0|true)) || (++__CLOVER_21_0.cloverRec.CF[237]==0&false));
		}else
		{{
			assert((((f.ensure!=null)) && (++__CLOVER_21_0.cloverRec.CT[238]!=0|true)) || (++__CLOVER_21_0.cloverRec.CF[238]==0&false));
			assert((((ensure.length==f.ensure.length)) && (++__CLOVER_21_0.cloverRec.CT[239]!=0|true)) || (++__CLOVER_21_0.cloverRec.CF[239]==0&false));
			__CLOVER_21_0.cloverRec.S[712]++;for(i=0;(((i<ensure.length) && (++__CLOVER_21_0.cloverRec.CT[240]!=0|true)) || (++__CLOVER_21_0.cloverRec.CF[240]==0&false));i++)
			{{
				__CLOVER_21_0.cloverRec.S[713]++;ensure[i].check_egal(f.ensure[i]);		
			}
		}}
		/********/
		}__CLOVER_21_0.cloverRec.S[714]++;if((((rescue==null||rescue.length==0) && (++__CLOVER_21_0.cloverRec.CT[241]!=0|true)) || (++__CLOVER_21_0.cloverRec.CF[241]==0&false)))
			{assert((((f.rescue==null||f.rescue.length==0)) && (++__CLOVER_21_0.cloverRec.CT[242]!=0|true)) || (++__CLOVER_21_0.cloverRec.CF[242]==0&false));
		}else
		{{
			assert((((f.rescue!=null)) && (++__CLOVER_21_0.cloverRec.CT[243]!=0|true)) || (++__CLOVER_21_0.cloverRec.CF[243]==0&false));
			assert((((rescue.length==f.rescue.length)) && (++__CLOVER_21_0.cloverRec.CT[244]!=0|true)) || (++__CLOVER_21_0.cloverRec.CF[244]==0&false));
			__CLOVER_21_0.cloverRec.S[715]++;for(i=0;(((i<rescue.length) && (++__CLOVER_21_0.cloverRec.CT[245]!=0|true)) || (++__CLOVER_21_0.cloverRec.CF[245]==0&false));i++)
			{{
				__CLOVER_21_0.cloverRec.S[716]++;rescue[i].check_egal(f.rescue[i]);		
			}
		}}
		/********/
		}__CLOVER_21_0.cloverRec.S[717]++;if((((export==null||export.length==0) && (++__CLOVER_21_0.cloverRec.CT[246]!=0|true)) || (++__CLOVER_21_0.cloverRec.CF[246]==0&false)))
			{assert((((f.export==null||f.export.length==0)) && (++__CLOVER_21_0.cloverRec.CT[247]!=0|true)) || (++__CLOVER_21_0.cloverRec.CF[247]==0&false));
		}else
		{{
			assert((((f.export!=null)) && (++__CLOVER_21_0.cloverRec.CT[248]!=0|true)) || (++__CLOVER_21_0.cloverRec.CF[248]==0&false));
			assert((((export.length==f.export.length)) && (++__CLOVER_21_0.cloverRec.CT[249]!=0|true)) || (++__CLOVER_21_0.cloverRec.CF[249]==0&false)):
				"Difference:"+export.length+"!="+f.export.length;
			__CLOVER_21_0.cloverRec.S[718]++;for(i=0;(((i<export.length) && (++__CLOVER_21_0.cloverRec.CT[250]!=0|true)) || (++__CLOVER_21_0.cloverRec.CF[250]==0&false));i++)
			{{
				__CLOVER_21_0.cloverRec.S[719]++;export[i].check_egal(f.export[i]);		
			}
		}}
		/********/
		}__CLOVER_21_0.cloverRec.S[720]++;if((((commentaire==null||commentaire.length==0) && (++__CLOVER_21_0.cloverRec.CT[251]!=0|true)) || (++__CLOVER_21_0.cloverRec.CF[251]==0&false)))
			{assert((((f.commentaire==null||f.commentaire.length==0)) && (++__CLOVER_21_0.cloverRec.CT[252]!=0|true)) || (++__CLOVER_21_0.cloverRec.CF[252]==0&false)):"nb_com="+f.commentaire.length;
		}else
		{{
			assert((((f.commentaire!=null)) && (++__CLOVER_21_0.cloverRec.CT[253]!=0|true)) || (++__CLOVER_21_0.cloverRec.CF[253]==0&false));
			assert((((commentaire.length==f.commentaire.length)) && (++__CLOVER_21_0.cloverRec.CT[254]!=0|true)) || (++__CLOVER_21_0.cloverRec.CF[254]==0&false));
			__CLOVER_21_0.cloverRec.S[721]++;for(i=0;(((i<commentaire.length) && (++__CLOVER_21_0.cloverRec.CT[255]!=0|true)) || (++__CLOVER_21_0.cloverRec.CF[255]==0&false));i++)
			{{
				assert((((commentaire[i]==f.commentaire[i])) && (++__CLOVER_21_0.cloverRec.CT[256]!=0|true)) || (++__CLOVER_21_0.cloverRec.CF[256]==0&false));		
			}
		}}
		}__CLOVER_21_0.cloverRec.S[722]++;if((((type_retour==null) && (++__CLOVER_21_0.cloverRec.CT[257]!=0|true)) || (++__CLOVER_21_0.cloverRec.CF[257]==0&false)))
			{assert((((f.type_retour==null)) && (++__CLOVER_21_0.cloverRec.CT[258]!=0|true)) || (++__CLOVER_21_0.cloverRec.CF[258]==0&false));
		}else
			{__CLOVER_21_0.cloverRec.S[723]++;type_retour.check_egal(f.type_retour);
		}__CLOVER_21_0.cloverRec.S[724]++;if((((obsolete==null) && (++__CLOVER_21_0.cloverRec.CT[259]!=0|true)) || (++__CLOVER_21_0.cloverRec.CF[259]==0&false)))
			{assert((((f.obsolete==null)) && (++__CLOVER_21_0.cloverRec.CT[260]!=0|true)) || (++__CLOVER_21_0.cloverRec.CF[260]==0&false));
		}else
			{__CLOVER_21_0.cloverRec.S[725]++;obsolete.check_egal(f.obsolete);
	}}

	public abstract void toXML(PrintStream out);

	public void toXMLDebut(PrintStream out)
	{__CLOVER_21_0.cloverRec.M[135]++;
		assert((((out!=null)) && (++__CLOVER_21_0.cloverRec.CT[261]!=0|true)) || (++__CLOVER_21_0.cloverRec.CF[261]==0&false));
		__CLOVER_21_0.cloverRec.S[726]++;out.println("<feature>");
		__CLOVER_21_0.cloverRec.S[727]++;int i;
		__CLOVER_21_0.cloverRec.S[728]++;if((((export!=null/*&&export.length>0*/) && (++__CLOVER_21_0.cloverRec.CT[262]!=0|true)) || (++__CLOVER_21_0.cloverRec.CF[262]==0&false)))
		{{
			__CLOVER_21_0.cloverRec.S[729]++;out.println("<liste_export>");
			__CLOVER_21_0.cloverRec.S[730]++;for(i=0;(((i<export.length) && (++__CLOVER_21_0.cloverRec.CT[263]!=0|true)) || (++__CLOVER_21_0.cloverRec.CF[263]==0&false));i++)
				{__CLOVER_21_0.cloverRec.S[731]++;export[i].toXML(out);
			}__CLOVER_21_0.cloverRec.S[732]++;out.println("</liste_export>");
		}
		}__CLOVER_21_0.cloverRec.S[733]++;if((((liste_nom!=null&&liste_nom.length>0) && (++__CLOVER_21_0.cloverRec.CT[264]!=0|true)) || (++__CLOVER_21_0.cloverRec.CF[264]==0&false)))
		{{
			__CLOVER_21_0.cloverRec.S[734]++;for(i=0;(((i<liste_nom.length) && (++__CLOVER_21_0.cloverRec.CT[265]!=0|true)) || (++__CLOVER_21_0.cloverRec.CF[265]==0&false));i++)
			{{
				__CLOVER_21_0.cloverRec.S[735]++;liste_nom[i].toXML(out);
			}
		}}
		}__CLOVER_21_0.cloverRec.S[736]++;if((((param!=null&&param.length>0) && (++__CLOVER_21_0.cloverRec.CT[266]!=0|true)) || (++__CLOVER_21_0.cloverRec.CF[266]==0&false)))
		{{
			__CLOVER_21_0.cloverRec.S[737]++;for(i=0;(((i<param.length) && (++__CLOVER_21_0.cloverRec.CT[267]!=0|true)) || (++__CLOVER_21_0.cloverRec.CF[267]==0&false));i++)
			{{
				__CLOVER_21_0.cloverRec.S[738]++;DeclareVar v=param[i];
				__CLOVER_21_0.cloverRec.S[739]++;out.println("<parametre_formel nom=\""+v.nom+"\">");
				__CLOVER_21_0.cloverRec.S[740]++;v.type.toXML(out);
				__CLOVER_21_0.cloverRec.S[741]++;out.println("</parametre_formel>");
			}
		}}
		}__CLOVER_21_0.cloverRec.S[742]++;if((((type_retour!=null) && (++__CLOVER_21_0.cloverRec.CT[268]!=0|true)) || (++__CLOVER_21_0.cloverRec.CF[268]==0&false)))
		{{
			__CLOVER_21_0.cloverRec.S[743]++;type_retour.toXML(out);
		}
	}}

	public void toXMLCorpsDebut(PrintStream out)
	{__CLOVER_21_0.cloverRec.M[136]++;
		assert((((out!=null)) && (++__CLOVER_21_0.cloverRec.CT[269]!=0|true)) || (++__CLOVER_21_0.cloverRec.CF[269]==0&false));
		__CLOVER_21_0.cloverRec.S[744]++;int i;
		__CLOVER_21_0.cloverRec.S[745]++;toXMLDebut(out);
		__CLOVER_21_0.cloverRec.S[746]++;out.println("<corps>");
		__CLOVER_21_0.cloverRec.S[747]++;if((((obsolete!=null) && (++__CLOVER_21_0.cloverRec.CT[270]!=0|true)) || (++__CLOVER_21_0.cloverRec.CF[270]==0&false)))
		{{
			__CLOVER_21_0.cloverRec.S[748]++;out.println("<obsolete>");
			__CLOVER_21_0.cloverRec.S[749]++;obsolete.toXML(out);
			__CLOVER_21_0.cloverRec.S[750]++;out.println("</obsolete>");
		}
		}__CLOVER_21_0.cloverRec.S[751]++;if((((require!=null&&require.length>0) && (++__CLOVER_21_0.cloverRec.CT[271]!=0|true)) || (++__CLOVER_21_0.cloverRec.CF[271]==0&false)))
		{{
			__CLOVER_21_0.cloverRec.S[752]++;out.println("<require>");
			__CLOVER_21_0.cloverRec.S[753]++;for(i=0;(((i<require.length) && (++__CLOVER_21_0.cloverRec.CT[272]!=0|true)) || (++__CLOVER_21_0.cloverRec.CF[272]==0&false));i++)
			{{
				__CLOVER_21_0.cloverRec.S[754]++;require[i].toXML(out);
			}
			}__CLOVER_21_0.cloverRec.S[755]++;out.println("</require>");
		}
		}__CLOVER_21_0.cloverRec.S[756]++;out.println("<corps2>");
	}
	
	public void toXMLFin(PrintStream out)
	{__CLOVER_21_0.cloverRec.M[137]++;
		assert((((out!=null)) && (++__CLOVER_21_0.cloverRec.CT[273]!=0|true)) || (++__CLOVER_21_0.cloverRec.CF[273]==0&false));
		__CLOVER_21_0.cloverRec.S[757]++;out.println("</feature>");
	}

	public void toXMLCorpsFin(PrintStream out)
	{__CLOVER_21_0.cloverRec.M[138]++;
		assert((((out!=null)) && (++__CLOVER_21_0.cloverRec.CT[274]!=0|true)) || (++__CLOVER_21_0.cloverRec.CF[274]==0&false));
		__CLOVER_21_0.cloverRec.S[758]++;int i;
		__CLOVER_21_0.cloverRec.S[759]++;out.println("</corps2>");
		__CLOVER_21_0.cloverRec.S[760]++;if((((ensure!=null&&ensure.length>0) && (++__CLOVER_21_0.cloverRec.CT[275]!=0|true)) || (++__CLOVER_21_0.cloverRec.CF[275]==0&false)))
		{{
			__CLOVER_21_0.cloverRec.S[761]++;out.println("<ensure>");
			__CLOVER_21_0.cloverRec.S[762]++;for(i=0;(((i<ensure.length) && (++__CLOVER_21_0.cloverRec.CT[276]!=0|true)) || (++__CLOVER_21_0.cloverRec.CF[276]==0&false));i++)
			{{
				__CLOVER_21_0.cloverRec.S[763]++;ensure[i].toXML(out);
			}
			}__CLOVER_21_0.cloverRec.S[764]++;out.println("</ensure>");
		}
		}__CLOVER_21_0.cloverRec.S[765]++;if((((rescue!=null&&rescue.length>0) && (++__CLOVER_21_0.cloverRec.CT[277]!=0|true)) || (++__CLOVER_21_0.cloverRec.CF[277]==0&false)))
		{{
			__CLOVER_21_0.cloverRec.S[766]++;out.println("<rescue>");
			__CLOVER_21_0.cloverRec.S[767]++;for(i=0;(((i<rescue.length) && (++__CLOVER_21_0.cloverRec.CT[278]!=0|true)) || (++__CLOVER_21_0.cloverRec.CF[278]==0&false));i++)
			{{
				__CLOVER_21_0.cloverRec.S[768]++;rescue[i].toXML(out);
			}
			}__CLOVER_21_0.cloverRec.S[769]++;out.println("</rescue>");
		}
		}__CLOVER_21_0.cloverRec.S[770]++;out.println("</corps>");
		__CLOVER_21_0.cloverRec.S[771]++;toXMLFin(out);
	}
	
	public void set_traite(boolean traite0)
	{__CLOVER_21_0.cloverRec.M[139]++;
		__CLOVER_21_0.cloverRec.S[772]++;this.traite=traite0;
	}

	public boolean get_traite()
	{__CLOVER_21_0.cloverRec.M[140]++;
		__CLOVER_21_0.cloverRec.S[773]++;return traite;
	}

	public String toString()
	{__CLOVER_21_0.cloverRec.M[141]++;
		__CLOVER_21_0.cloverRec.S[774]++;int i;
		__CLOVER_21_0.cloverRec.S[775]++;String s="";
		__CLOVER_21_0.cloverRec.S[776]++;for(i=0;(((i<liste_nom.length) && (++__CLOVER_21_0.cloverRec.CT[279]!=0|true)) || (++__CLOVER_21_0.cloverRec.CF[279]==0&false));i++)
		{{
			__CLOVER_21_0.cloverRec.S[777]++;if((((i>0) && (++__CLOVER_21_0.cloverRec.CT[280]!=0|true)) || (++__CLOVER_21_0.cloverRec.CF[280]==0&false)))
				{__CLOVER_21_0.cloverRec.S[778]++;s+=",";
			}__CLOVER_21_0.cloverRec.S[779]++;s+=liste_nom[i].toString();
		}
		}__CLOVER_21_0.cloverRec.S[780]++;return s;
	}
	
	protected boolean traite=false;

	public NomFeature liste_nom[];
	public DeclareVar param[];
	public Assert[] require,ensure;
	public Type type_retour;
	public Instr rescue[];
	public Type export[];
	public Commentaire commentaire[],commentaire2[],commentaire3[];
	public Chaine obsolete;
	public Classe classe;
        public Token tfeature,tobsolete,trequire,tensure,
            trescue,tunique,tdeferred,texternal,talias,tdo;
}
