/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ *//*
 * Created on 18 f\u00e9vr. 2004
 *
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
package tinyeiffel.intermediaire;

import java.io.*;
import java.util.*;

import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.*;

import tinyeiffel.compiler.Compiler_Eiffel;

/**
 * @author BARRET
 *
 * To change the template for this generated type comment go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
public class CIInputXML {static class __CLOVER_209_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}

	/**
	 * 
	 */
	public CIInputXML(String nom) {__CLOVER_209_0.cloverRec.M[1211]++;
		assert((((nom!=null)) && (++__CLOVER_209_0.cloverRec.CT[4460]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4460]==0&false));
		__CLOVER_209_0.cloverRec.S[17550]++;this.nom=nom;
		__CLOVER_209_0.cloverRec.S[17551]++;parse_XML(nom);
	}

	public void parse_XML(String nom)
	{__CLOVER_209_0.cloverRec.M[1212]++;
		__CLOVER_209_0.cloverRec.S[17552]++;CIProgramme res=null;
		__CLOVER_209_0.cloverRec.S[17553]++;File f;
		__CLOVER_209_0.cloverRec.S[17554]++;int no;
		assert((((nom!=null)) && (++__CLOVER_209_0.cloverRec.CT[4461]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4461]==0&false));
		__CLOVER_209_0.cloverRec.S[17555]++;try {
			/* jasp */
			//R\u00e9cup\u00e8re une instance de la classe de fabrication
			__CLOVER_209_0.cloverRec.S[17556]++;DocumentBuilderFactory factory =
				DocumentBuilderFactory.newInstance();
			//R\u00e9cup\u00e9re une instance de la classe DocumentBuilder (sp\u00e9cifique vendeur)
			__CLOVER_209_0.cloverRec.S[17557]++;DocumentBuilder parser = factory.newDocumentBuilder();
			//effectue le parsing avec r\u00e9cup\u00e9ration du noeud DOM Document
			__CLOVER_209_0.cloverRec.S[17558]++;System.out.println("Parsing de "+nom+"...");
			__CLOVER_209_0.cloverRec.S[17559]++;Document document = parser.parse(nom);
			__CLOVER_209_0.cloverRec.S[17560]++;System.out.println("Parsing de "+nom+" fait !"+Compiler_Eiffel.info_mem());
			__CLOVER_209_0.cloverRec.S[17561]++;System.gc();
			__CLOVER_209_0.cloverRec.S[17562]++;System.out.println("Apres GC :"+Compiler_Eiffel.info_mem());
			__CLOVER_209_0.cloverRec.S[17563]++;Element catalogue = document.getDocumentElement();

			__CLOVER_209_0.cloverRec.S[17564]++;NodeList titres = catalogue.getElementsByTagName("test");
			__CLOVER_209_0.cloverRec.S[17565]++;System.out.println(
				"Nombre d'element dans la racine : " + titres.getLength());
			__CLOVER_209_0.cloverRec.S[17566]++;System.out.println("nom=" + catalogue.getNodeName());
			__CLOVER_209_0.cloverRec.S[17567]++;System.out.println("nom=" + catalogue.getFirstChild());
			__CLOVER_209_0.cloverRec.S[17568]++;System.out.println(
				"code="
					+ org.w3c.dom.Node.ELEMENT_NODE
					+ ","
					+ org.w3c.dom.Node.ATTRIBUTE_NODE
					+ ","
					+ org.w3c.dom.Node.CDATA_SECTION_NODE
					+ ","
					+ org.w3c.dom.Node.COMMENT_NODE
					+ ","
					+ org.w3c.dom.Node.DOCUMENT_FRAGMENT_NODE
					+ ","
					+ org.w3c.dom.Node.DOCUMENT_NODE
					+ ","
					+ org.w3c.dom.Node.DOCUMENT_TYPE_NODE
					+ ","
					+ org.w3c.dom.Node.ENTITY_NODE
					+ ","
					+ org.w3c.dom.Node.ENTITY_REFERENCE_NODE
					+ ","
					+ org.w3c.dom.Node.NOTATION_NODE
					+ ","
					+ org.w3c.dom.Node.PROCESSING_INSTRUCTION_NODE
					+ ","
					+ org.w3c.dom.Node.TEXT_NODE
					+ ",");
			__CLOVER_209_0.cloverRec.S[17569]++;titres=null;
			__CLOVER_209_0.cloverRec.S[17570]++;System.gc();
			__CLOVER_209_0.cloverRec.S[17571]++;System.out.println("Apres GC2 :"+Compiler_Eiffel.info_mem());
			__CLOVER_209_0.cloverRec.S[17572]++;res=creer_programme(catalogue);
			assert((((res!=null)) && (++__CLOVER_209_0.cloverRec.CT[4462]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4462]==0&false));
		} catch (FactoryConfigurationError e) {
			// unable to get a document builder factory
			__CLOVER_209_0.cloverRec.S[17573]++;e.printStackTrace();
			__CLOVER_209_0.cloverRec.S[17574]++;System.err.println("Erreur de configuration du factory");
			__CLOVER_209_0.cloverRec.S[17575]++;System.exit(1);
		} catch (ParserConfigurationException e) {
			// parser was unable to be configured
			__CLOVER_209_0.cloverRec.S[17576]++;e.printStackTrace();
			__CLOVER_209_0.cloverRec.S[17577]++;System.err.println("Erreur de configuration du parser");
			__CLOVER_209_0.cloverRec.S[17578]++;System.exit(1);
		} catch (SAXException e) {
			// parsing error
			__CLOVER_209_0.cloverRec.S[17579]++;System.err.println("Exception Sax:"+e+"("+nom+")");
			__CLOVER_209_0.cloverRec.S[17580]++;e.printStackTrace();
			__CLOVER_209_0.cloverRec.S[17581]++;System.exit(1);
		} catch (IOException e) {
			// i/o error
			__CLOVER_209_0.cloverRec.S[17582]++;e.printStackTrace();
			__CLOVER_209_0.cloverRec.S[17583]++;System.err.println("Erreur d'entree sortie");
			__CLOVER_209_0.cloverRec.S[17584]++;System.exit(1);
		}
		__CLOVER_209_0.cloverRec.S[17585]++;programme=res;
	}

	public CIProgramme creer_programme(Element element)
	{__CLOVER_209_0.cloverRec.M[1213]++;
		__CLOVER_209_0.cloverRec.S[17586]++;int no,i,len,j;
		__CLOVER_209_0.cloverRec.S[17587]++;CIProgramme res;
		__CLOVER_209_0.cloverRec.S[17588]++;CIClasse cl,liste_classe[];
		__CLOVER_209_0.cloverRec.S[17589]++;Vector v;
		__CLOVER_209_0.cloverRec.S[17590]++;boolean heritage[][],heritage_directe[][];
		__CLOVER_209_0.cloverRec.S[17591]++;CIDeclare_Var dv;
		assert((((element!=null)) && (++__CLOVER_209_0.cloverRec.CT[4463]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4463]==0&false));
		assert((((element.getNodeName().equalsIgnoreCase("programme"))) && (++__CLOVER_209_0.cloverRec.CT[4464]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4464]==0&false));
		__CLOVER_209_0.cloverRec.S[17592]++;NodeList fils = element.getChildNodes();
		//assert(fils.getLength()>0);
		__CLOVER_209_0.cloverRec.S[17593]++;no=0;
		__CLOVER_209_0.cloverRec.S[17594]++;res=new CIProgramme();
		__CLOVER_209_0.cloverRec.S[17595]++;v=new Vector();
		__CLOVER_209_0.cloverRec.S[17596]++;for(i=0;(((i<fils.getLength()) && (++__CLOVER_209_0.cloverRec.CT[4465]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4465]==0&false));i++)
		{{
			__CLOVER_209_0.cloverRec.S[17597]++;Node n = fils.item(i);
			//System.out.println("element=" + n.getNodeName());
			__CLOVER_209_0.cloverRec.S[17598]++;if ((((n instanceof Element) && (++__CLOVER_209_0.cloverRec.CT[4466]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4466]==0&false))) {{
				__CLOVER_209_0.cloverRec.S[17599]++;if ((((n.getNodeName() == "classe") && (++__CLOVER_209_0.cloverRec.CT[4467]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4467]==0&false))) {{
					//System.out.println("heritage");
					__CLOVER_209_0.cloverRec.S[17600]++;cl = creer_classe((Element) n,res);
					__CLOVER_209_0.cloverRec.S[17601]++;v.addElement(cl);
				}
				}else {__CLOVER_209_0.cloverRec.S[17602]++;if ((((n.getNodeName() == "system") && (++__CLOVER_209_0.cloverRec.CT[4468]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4468]==0&false))) {{
					//System.out.println("heritage");
					__CLOVER_209_0.cloverRec.S[17603]++;ajouter_global((Element) n,res.liste_var_global);
					//dv = creer_declare_var((Element) n);
					//res.liste_var_global.ajoute(dv);
					//v.addElement(cl);
				}
				/*else if (n.getNodeName() == "declare_var") {
					//System.out.println("heritage");
					dv = creer_declare_var((Element) n);
					res.liste_var_global.ajoute(dv);
					//v.addElement(cl);
				}*/
				}else
					{assert((((false)) && (++__CLOVER_209_0.cloverRec.CT[4469]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4469]==0&false));
			}}}
			}else {__CLOVER_209_0.cloverRec.S[17604]++;if ((((n instanceof Comment) && (++__CLOVER_209_0.cloverRec.CT[4470]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4470]==0&false))) {{
				
			}
			}else {__CLOVER_209_0.cloverRec.S[17605]++;if ((((n instanceof Text) && (++__CLOVER_209_0.cloverRec.CT[4471]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4471]==0&false))) {{
				__CLOVER_209_0.cloverRec.S[17606]++;String s = n.getNodeValue();
				assert((((s == "" || s.matches("[ \t\n]+"))) && (++__CLOVER_209_0.cloverRec.CT[4472]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4472]==0&false));
			}
			}else
				{assert((((false)) && (++__CLOVER_209_0.cloverRec.CT[4473]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4473]==0&false));
		}}}}
		}__CLOVER_209_0.cloverRec.S[17607]++;liste_classe=new CIClasse[v.size()];
		__CLOVER_209_0.cloverRec.S[17608]++;v.copyInto(liste_classe);
		__CLOVER_209_0.cloverRec.S[17609]++;res.liste_classe=liste_classe;
		__CLOVER_209_0.cloverRec.S[17610]++;len=liste_classe.length;
		__CLOVER_209_0.cloverRec.S[17611]++;heritage=new boolean[len][len];
		__CLOVER_209_0.cloverRec.S[17612]++;heritage_directe=new boolean[len][len];
		__CLOVER_209_0.cloverRec.S[17613]++;for(i=0;(((i<len) && (++__CLOVER_209_0.cloverRec.CT[4474]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4474]==0&false));i++)
		{{
			__CLOVER_209_0.cloverRec.S[17614]++;CITypeSimple t1,t2;
			__CLOVER_209_0.cloverRec.S[17615]++;cl=liste_classe[i];
			__CLOVER_209_0.cloverRec.S[17616]++;t1=cl.nom;
			__CLOVER_209_0.cloverRec.S[17617]++;if((((cl.heritage!=null) && (++__CLOVER_209_0.cloverRec.CT[4475]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4475]==0&false)))
			{{
				__CLOVER_209_0.cloverRec.S[17618]++;for(j=0;(((j<cl.heritage.length) && (++__CLOVER_209_0.cloverRec.CT[4476]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4476]==0&false));j++)
				{{
					__CLOVER_209_0.cloverRec.S[17619]++;t2=cl.heritage[j];
					__CLOVER_209_0.cloverRec.S[17620]++;no=res.no_classe(t2);
					assert((((no>=0)) && (++__CLOVER_209_0.cloverRec.CT[4477]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4477]==0&false));
					__CLOVER_209_0.cloverRec.S[17621]++;heritage_directe[i][no]=true;
				}
			}}
		}}
		}__CLOVER_209_0.cloverRec.S[17622]++;res.heritage=calcul_heritage(heritage_directe);
		__CLOVER_209_0.cloverRec.S[17623]++;res.heritage_directe=heritage_directe;
		__CLOVER_209_0.cloverRec.S[17624]++;return res;
	}

	public void ajouter_global(Element element,CIListe_Global liste)
	{__CLOVER_209_0.cloverRec.M[1214]++;
		assert((((element!=null)) && (++__CLOVER_209_0.cloverRec.CT[4478]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4478]==0&false));
		assert((((liste!=null)) && (++__CLOVER_209_0.cloverRec.CT[4479]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4479]==0&false));
		assert((((element.getNodeName().equalsIgnoreCase("system"))) && (++__CLOVER_209_0.cloverRec.CT[4480]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4480]==0&false));
		__CLOVER_209_0.cloverRec.S[17625]++;CIDeclare_Var dv;
		__CLOVER_209_0.cloverRec.S[17626]++;NodeList fils = element.getChildNodes();
		__CLOVER_209_0.cloverRec.S[17627]++;int no = 0,i;
		__CLOVER_209_0.cloverRec.S[17628]++;Vector v;
		__CLOVER_209_0.cloverRec.S[17629]++;v = new Vector();
		__CLOVER_209_0.cloverRec.S[17630]++;for(i = 0;(((i<fils.getLength()) && (++__CLOVER_209_0.cloverRec.CT[4481]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4481]==0&false));i++)
		{{
			__CLOVER_209_0.cloverRec.S[17631]++;Node n = fils.item(i);
			//System.out.println("element=" + n.getNodeName());
			__CLOVER_209_0.cloverRec.S[17632]++;if ((((n instanceof Element) && (++__CLOVER_209_0.cloverRec.CT[4482]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4482]==0&false))) {{
				__CLOVER_209_0.cloverRec.S[17633]++;if ((((n.getNodeName() == "declare_var") && (++__CLOVER_209_0.cloverRec.CT[4483]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4483]==0&false))) {{
					//System.out.println("heritage");
					__CLOVER_209_0.cloverRec.S[17634]++;dv = creer_declare_var((Element) n);
					__CLOVER_209_0.cloverRec.S[17635]++;liste.ajoute(dv);
					//v.addElement(cl);
				}
				}else
					{assert((((false)) && (++__CLOVER_209_0.cloverRec.CT[4484]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4484]==0&false));
			}}
			}else {__CLOVER_209_0.cloverRec.S[17636]++;if ((((n instanceof Comment) && (++__CLOVER_209_0.cloverRec.CT[4485]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4485]==0&false))) {{
				
			}
			}else {__CLOVER_209_0.cloverRec.S[17637]++;if ((((n instanceof Text) && (++__CLOVER_209_0.cloverRec.CT[4486]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4486]==0&false))) {{
				__CLOVER_209_0.cloverRec.S[17638]++;String s = n.getNodeValue();
				assert((((s == "" || s.matches("[ \t\n]+"))) && (++__CLOVER_209_0.cloverRec.CT[4487]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4487]==0&false));
			}
			}else
				{assert((((false)) && (++__CLOVER_209_0.cloverRec.CT[4488]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4488]==0&false));
		}}}}
	}}
	
	public static boolean[][] calcul_heritage(boolean heritage_directe[][])
	{__CLOVER_209_0.cloverRec.M[1215]++;
		__CLOVER_209_0.cloverRec.S[17639]++;boolean heritage[][],modifier=true;
		__CLOVER_209_0.cloverRec.S[17640]++;int taille,i,j,no,k;

		__CLOVER_209_0.cloverRec.S[17641]++;taille=heritage_directe.length;
		__CLOVER_209_0.cloverRec.S[17642]++;heritage=new boolean[taille][taille];

		__CLOVER_209_0.cloverRec.S[17643]++;for(i=0;(((i<taille) && (++__CLOVER_209_0.cloverRec.CT[4489]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4489]==0&false));i++)
			{__CLOVER_209_0.cloverRec.S[17644]++;for(j=0;(((j<taille) && (++__CLOVER_209_0.cloverRec.CT[4490]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4490]==0&false));j++)
				{__CLOVER_209_0.cloverRec.S[17645]++;heritage[i][j]=heritage_directe[i][j];

		}}__CLOVER_209_0.cloverRec.S[17646]++;for(k=0;(((k<taille*taille&&modifier) && (++__CLOVER_209_0.cloverRec.CT[4491]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4491]==0&false));k++)
		{{
			__CLOVER_209_0.cloverRec.S[17647]++;modifier=false;
			__CLOVER_209_0.cloverRec.S[17648]++;for(i=0;(((i<taille) && (++__CLOVER_209_0.cloverRec.CT[4492]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4492]==0&false));i++)
			{{
				__CLOVER_209_0.cloverRec.S[17649]++;for(j=0;(((j<taille) && (++__CLOVER_209_0.cloverRec.CT[4493]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4493]==0&false));j++)
				{{
					__CLOVER_209_0.cloverRec.S[17650]++;if((((heritage[j][i]==true) && (++__CLOVER_209_0.cloverRec.CT[4494]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4494]==0&false)))
					{{
						__CLOVER_209_0.cloverRec.S[17651]++;for(k=0;(((k<taille) && (++__CLOVER_209_0.cloverRec.CT[4495]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4495]==0&false));k++)
						{{
							__CLOVER_209_0.cloverRec.S[17652]++;if((((heritage[k][j]&&!heritage[k][i]) && (++__CLOVER_209_0.cloverRec.CT[4496]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4496]==0&false)))
							{{
								__CLOVER_209_0.cloverRec.S[17653]++;modifier=true;
								__CLOVER_209_0.cloverRec.S[17654]++;heritage[k][i]=true;
							}
						}}
					}}
				}}
			}}
		}}

		}__CLOVER_209_0.cloverRec.S[17655]++;return heritage;
	}

	public CIClasse creer_classe(Element element,CIProgramme p)
	{__CLOVER_209_0.cloverRec.M[1216]++;
		__CLOVER_209_0.cloverRec.S[17656]++;int no,i;
		__CLOVER_209_0.cloverRec.S[17657]++;CIClasse res;
		__CLOVER_209_0.cloverRec.S[17658]++;CIClasse cl,liste_classe[];
		__CLOVER_209_0.cloverRec.S[17659]++;Vector v=null,v2,v3;
		__CLOVER_209_0.cloverRec.S[17660]++;CIType type=null,type2;
		__CLOVER_209_0.cloverRec.S[17661]++;CITypeSimple liste_heritage[]=null;
		assert((((element!=null)) && (++__CLOVER_209_0.cloverRec.CT[4497]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4497]==0&false));
		assert((((element.getNodeName().equalsIgnoreCase("classe"))) && (++__CLOVER_209_0.cloverRec.CT[4498]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4498]==0&false));
		assert((((p!=null)) && (++__CLOVER_209_0.cloverRec.CT[4499]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4499]==0&false));
		__CLOVER_209_0.cloverRec.S[17662]++;NodeList fils = element.getChildNodes();
		__CLOVER_209_0.cloverRec.S[17663]++;CIAttribut attr,liste[];
		__CLOVER_209_0.cloverRec.S[17664]++;CICreation creation,liste_creation[]=null;
		__CLOVER_209_0.cloverRec.S[17665]++;CIAssertion invariant=null;
		__CLOVER_209_0.cloverRec.S[17666]++;CISource source=null;
		assert((((fils.getLength()>0)) && (++__CLOVER_209_0.cloverRec.CT[4500]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4500]==0&false));
		__CLOVER_209_0.cloverRec.S[17667]++;no=0;
		//res=new Programme();
		__CLOVER_209_0.cloverRec.S[17668]++;v2=new Vector();
		__CLOVER_209_0.cloverRec.S[17669]++;res=new CIClasse();
		__CLOVER_209_0.cloverRec.S[17670]++;v3=new Vector();
		__CLOVER_209_0.cloverRec.S[17671]++;for(i=0;(((i<fils.getLength()) && (++__CLOVER_209_0.cloverRec.CT[4501]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4501]==0&false));i++)
		{{
			__CLOVER_209_0.cloverRec.S[17672]++;Node n = fils.item(i);
			//System.out.println("element=" + n.getNodeName());
			__CLOVER_209_0.cloverRec.S[17673]++;if ((((n instanceof Element) && (++__CLOVER_209_0.cloverRec.CT[4502]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4502]==0&false))) {{
				__CLOVER_209_0.cloverRec.S[17674]++;if ((((n.getNodeName() == "hierarchie") && (++__CLOVER_209_0.cloverRec.CT[4503]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4503]==0&false))) {{
					assert((((v==null)) && (++__CLOVER_209_0.cloverRec.CT[4504]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4504]==0&false));
					__CLOVER_209_0.cloverRec.S[17675]++;liste_heritage=creer_hierarchie((Element) n);
				}
				}else {__CLOVER_209_0.cloverRec.S[17676]++;if ((((n.getNodeName() == "type") && (++__CLOVER_209_0.cloverRec.CT[4505]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4505]==0&false))) {{
					//System.out.println("heritage");
					__CLOVER_209_0.cloverRec.S[17677]++;type = creer_type((Element) n);
				}
				}else {__CLOVER_209_0.cloverRec.S[17678]++;if ((((n.getNodeName() == "creation") && (++__CLOVER_209_0.cloverRec.CT[4506]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4506]==0&false))) {{
					//System.out.println("heritage");
					__CLOVER_209_0.cloverRec.S[17679]++;creation=creer_creation((Element) n);
					__CLOVER_209_0.cloverRec.S[17680]++;v3.addElement(creation);
					/*if(liste_creation==null)
					{
						liste_creation=new Creation[1];
						liste_creation[1]=creation;
					}
					else
					{
						Creation liste2[];
						liste2=liste_creation;
						liste_creation=new Creation[liste2.length+1];
						for(i=0;i<liste2.length;i++)
							liste_creation[i]=liste2[i];
						liste_creation[i]=creation;
					}*/
				}
				}else {__CLOVER_209_0.cloverRec.S[17681]++;if ((((n.getNodeName() == "attribut") && (++__CLOVER_209_0.cloverRec.CT[4507]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4507]==0&false))) {{
					//System.out.println("heritage");
					__CLOVER_209_0.cloverRec.S[17682]++;attr = creer_attribut((Element) n,res);
					__CLOVER_209_0.cloverRec.S[17683]++;v2.addElement(attr);
				}
				}else {__CLOVER_209_0.cloverRec.S[17684]++;if ((((n.getNodeName() == "invariant") && (++__CLOVER_209_0.cloverRec.CT[4508]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4508]==0&false))) {{
					//System.out.println("heritage");
					__CLOVER_209_0.cloverRec.S[17685]++;invariant = creer_assert((Element) n);
					//v2.addElement(attr);
				}
				}else {__CLOVER_209_0.cloverRec.S[17686]++;if ((((n.getNodeName() == "source") && (++__CLOVER_209_0.cloverRec.CT[4509]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4509]==0&false))) {{
					//System.out.println("heritage");
					__CLOVER_209_0.cloverRec.S[17687]++;source = creer_source((Element) n);
					//v2.addElement(attr);
				}
				}else
					{assert((((false)) && (++__CLOVER_209_0.cloverRec.CT[4510]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4510]==0&false));
			}}}}}}}
			}else {__CLOVER_209_0.cloverRec.S[17688]++;if ((((n instanceof Comment) && (++__CLOVER_209_0.cloverRec.CT[4511]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4511]==0&false))) {{
				
			}
			}else {__CLOVER_209_0.cloverRec.S[17689]++;if ((((n instanceof Text) && (++__CLOVER_209_0.cloverRec.CT[4512]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4512]==0&false))) {{
				__CLOVER_209_0.cloverRec.S[17690]++;String s = n.getNodeValue();
				assert((((s == "" || s.matches("[ \t\n]+"))) && (++__CLOVER_209_0.cloverRec.CT[4513]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4513]==0&false));
			}
			}else
				{assert((((false)) && (++__CLOVER_209_0.cloverRec.CT[4514]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4514]==0&false));
		}}}}
		}__CLOVER_209_0.cloverRec.S[17691]++;res.nom=(CITypeSimple)type;
		__CLOVER_209_0.cloverRec.S[17692]++;res.programme=p;
		__CLOVER_209_0.cloverRec.S[17693]++;res.heritage=liste_heritage;
		__CLOVER_209_0.cloverRec.S[17694]++;if((((v2.size()>0) && (++__CLOVER_209_0.cloverRec.CT[4515]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4515]==0&false)))
		{{
			__CLOVER_209_0.cloverRec.S[17695]++;liste=new CIAttribut[v2.size()];
			__CLOVER_209_0.cloverRec.S[17696]++;v2.copyInto(liste);
			__CLOVER_209_0.cloverRec.S[17697]++;res.liste_attribut=liste;
		}
		}__CLOVER_209_0.cloverRec.S[17698]++;if((((v3.size()>0) && (++__CLOVER_209_0.cloverRec.CT[4516]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4516]==0&false)))
		{{
			__CLOVER_209_0.cloverRec.S[17699]++;liste_creation=new CICreation[v3.size()];
			__CLOVER_209_0.cloverRec.S[17700]++;v3.copyInto(liste_creation);
			__CLOVER_209_0.cloverRec.S[17701]++;res.creation=liste_creation;
		}
		}__CLOVER_209_0.cloverRec.S[17702]++;res.invariant=invariant;
		__CLOVER_209_0.cloverRec.S[17703]++;res.source=source;
		__CLOVER_209_0.cloverRec.S[17704]++;return res;
	}

	public CITypeSimple[] creer_hierarchie(Element element)
	{__CLOVER_209_0.cloverRec.M[1217]++;
		__CLOVER_209_0.cloverRec.S[17705]++;int no,i;
		__CLOVER_209_0.cloverRec.S[17706]++;CITypeSimple res[]=null;
		__CLOVER_209_0.cloverRec.S[17707]++;Vector v=null;
		__CLOVER_209_0.cloverRec.S[17708]++;CIType type=null;
		__CLOVER_209_0.cloverRec.S[17709]++;CITypeSimple liste_heritage[]=null;
		assert((((element!=null)) && (++__CLOVER_209_0.cloverRec.CT[4517]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4517]==0&false));
		assert((((element.getNodeName().equalsIgnoreCase("hierarchie"))) && (++__CLOVER_209_0.cloverRec.CT[4518]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4518]==0&false));
		__CLOVER_209_0.cloverRec.S[17710]++;NodeList fils = element.getChildNodes();
		__CLOVER_209_0.cloverRec.S[17711]++;CISource source=null;
		//assert(fils.getLength()>0);
		__CLOVER_209_0.cloverRec.S[17712]++;v=new Vector();
		__CLOVER_209_0.cloverRec.S[17713]++;for(i=0;(((i<fils.getLength()) && (++__CLOVER_209_0.cloverRec.CT[4519]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4519]==0&false));i++)
		{{
			__CLOVER_209_0.cloverRec.S[17714]++;Node n = fils.item(i);
			//System.out.println("element=" + n.getNodeName());
			__CLOVER_209_0.cloverRec.S[17715]++;if ((((n instanceof Element) && (++__CLOVER_209_0.cloverRec.CT[4520]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4520]==0&false))) {{
				__CLOVER_209_0.cloverRec.S[17716]++;if ((((n.getNodeName() == "type") && (++__CLOVER_209_0.cloverRec.CT[4521]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4521]==0&false))) {{
					//System.out.println("heritage");
					__CLOVER_209_0.cloverRec.S[17717]++;type = creer_type((Element) n);
					assert((((type instanceof CITypeSimple)) && (++__CLOVER_209_0.cloverRec.CT[4522]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4522]==0&false));
					__CLOVER_209_0.cloverRec.S[17718]++;v.addElement(type);
				}
				}else
					{assert((((false)) && (++__CLOVER_209_0.cloverRec.CT[4523]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4523]==0&false));
			}}
			}else {__CLOVER_209_0.cloverRec.S[17719]++;if ((((n instanceof Comment) && (++__CLOVER_209_0.cloverRec.CT[4524]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4524]==0&false))) {{
				
			}
			}else {__CLOVER_209_0.cloverRec.S[17720]++;if ((((n instanceof Text) && (++__CLOVER_209_0.cloverRec.CT[4525]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4525]==0&false))) {{
				__CLOVER_209_0.cloverRec.S[17721]++;String s = n.getNodeValue();
				assert((((s == "" || s.matches("[ \t\n]+"))) && (++__CLOVER_209_0.cloverRec.CT[4526]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4526]==0&false));
			}
			}else
				{assert((((false)) && (++__CLOVER_209_0.cloverRec.CT[4527]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4527]==0&false));
		}}}}
		}__CLOVER_209_0.cloverRec.S[17722]++;if((((v!=null) && (++__CLOVER_209_0.cloverRec.CT[4528]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4528]==0&false)))
		{{
			__CLOVER_209_0.cloverRec.S[17723]++;res=new CITypeSimple[v.size()];
			__CLOVER_209_0.cloverRec.S[17724]++;v.copyInto(res);
		}
		}__CLOVER_209_0.cloverRec.S[17725]++;return res;
	}

	public CICreation creer_creation(Element element)
	{__CLOVER_209_0.cloverRec.M[1218]++;
		__CLOVER_209_0.cloverRec.S[17726]++;int no,i;
		__CLOVER_209_0.cloverRec.S[17727]++;CICreation res=null;
		__CLOVER_209_0.cloverRec.S[17728]++;Vector v=null,v2=null;
		__CLOVER_209_0.cloverRec.S[17729]++;CIType type=null,liste_type[]=null;
		__CLOVER_209_0.cloverRec.S[17730]++;CINom_Attribut nom,liste_nom[]=null;
		assert((((element!=null)) && (++__CLOVER_209_0.cloverRec.CT[4529]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4529]==0&false));
		assert((((element.getNodeName().equalsIgnoreCase("creation"))) && (++__CLOVER_209_0.cloverRec.CT[4530]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4530]==0&false));
		__CLOVER_209_0.cloverRec.S[17731]++;NodeList fils = element.getChildNodes();
		__CLOVER_209_0.cloverRec.S[17732]++;CISource source=null;
		//assert(fils.getLength()>0);
		__CLOVER_209_0.cloverRec.S[17733]++;v=new Vector();
		__CLOVER_209_0.cloverRec.S[17734]++;v2=new Vector();
		__CLOVER_209_0.cloverRec.S[17735]++;for(i=0;(((i<fils.getLength()) && (++__CLOVER_209_0.cloverRec.CT[4531]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4531]==0&false));i++)
		{{
			__CLOVER_209_0.cloverRec.S[17736]++;Node n = fils.item(i);
			//System.out.println("element=" + n.getNodeName());
			__CLOVER_209_0.cloverRec.S[17737]++;if ((((n instanceof Element) && (++__CLOVER_209_0.cloverRec.CT[4532]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4532]==0&false))) {{
				__CLOVER_209_0.cloverRec.S[17738]++;if ((((n.getNodeName() == "type") && (++__CLOVER_209_0.cloverRec.CT[4533]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4533]==0&false))) {{
					//System.out.println("heritage");
					__CLOVER_209_0.cloverRec.S[17739]++;type = creer_type((Element) n);
					__CLOVER_209_0.cloverRec.S[17740]++;v2.addElement(type);
				}
				}else {__CLOVER_209_0.cloverRec.S[17741]++;if ((((n.getNodeName() == "nom_attribut") && (++__CLOVER_209_0.cloverRec.CT[4534]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4534]==0&false))) {{
					//System.out.println("heritage");
					__CLOVER_209_0.cloverRec.S[17742]++;nom = creer_nom_attribut((Element) n);
					__CLOVER_209_0.cloverRec.S[17743]++;v.addElement(nom);
				}
				}else {__CLOVER_209_0.cloverRec.S[17744]++;if ((((n.getNodeName() == "source") && (++__CLOVER_209_0.cloverRec.CT[4535]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4535]==0&false))) {{
					//System.out.println("heritage");
					__CLOVER_209_0.cloverRec.S[17745]++;source = creer_source((Element) n);
					//v2.addElement(attr);
				}
				}else {__CLOVER_209_0.cloverRec.S[17746]++;if ((((n.getNodeName() == "source") && (++__CLOVER_209_0.cloverRec.CT[4536]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4536]==0&false))) {{
					//System.out.println("source");
					__CLOVER_209_0.cloverRec.S[17747]++;source = creer_source((Element) n);
				}
				}else
					{assert((((false)) && (++__CLOVER_209_0.cloverRec.CT[4537]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4537]==0&false));
			}}}}}
			}else {__CLOVER_209_0.cloverRec.S[17748]++;if ((((n instanceof Comment) && (++__CLOVER_209_0.cloverRec.CT[4538]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4538]==0&false))) {{
				
			}
			}else {__CLOVER_209_0.cloverRec.S[17749]++;if ((((n instanceof Text) && (++__CLOVER_209_0.cloverRec.CT[4539]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4539]==0&false))) {{
				__CLOVER_209_0.cloverRec.S[17750]++;String s = n.getNodeValue();
				assert((((s == "" || s.matches("[ \t\n]+"))) && (++__CLOVER_209_0.cloverRec.CT[4540]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4540]==0&false));
			}
			}else
				{assert((((false)) && (++__CLOVER_209_0.cloverRec.CT[4541]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4541]==0&false));
		}}}}
		}__CLOVER_209_0.cloverRec.S[17751]++;if((((v!=null&&v.size()>0) && (++__CLOVER_209_0.cloverRec.CT[4542]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4542]==0&false)))
		{{
			__CLOVER_209_0.cloverRec.S[17752]++;liste_nom=new CINom_Attribut[v.size()];
			__CLOVER_209_0.cloverRec.S[17753]++;v.copyInto(liste_nom);
		}
		}__CLOVER_209_0.cloverRec.S[17754]++;if((((v2!=null&&v2.size()>0) && (++__CLOVER_209_0.cloverRec.CT[4543]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4543]==0&false)))
		{{
			__CLOVER_209_0.cloverRec.S[17755]++;liste_type=new CIType[v2.size()];
			__CLOVER_209_0.cloverRec.S[17756]++;v2.copyInto(liste_type);
		}
		}assert((((liste_nom!=null)) && (++__CLOVER_209_0.cloverRec.CT[4544]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4544]==0&false));
		__CLOVER_209_0.cloverRec.S[17757]++;res=new CICreation(liste_type,liste_nom,source);
		__CLOVER_209_0.cloverRec.S[17758]++;return res;
	}
	
	public CISource creer_source(Element element)
	{__CLOVER_209_0.cloverRec.M[1219]++;
		__CLOVER_209_0.cloverRec.S[17759]++;int no,i,ligne=-1,colonne=-1;
		__CLOVER_209_0.cloverRec.S[17760]++;CISource res=null;
		__CLOVER_209_0.cloverRec.S[17761]++;Vector v=null;
		__CLOVER_209_0.cloverRec.S[17762]++;CIType type=null,liste_heritage[]=null;
		assert((((element!=null)) && (++__CLOVER_209_0.cloverRec.CT[4545]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4545]==0&false));
		assert((((element.getNodeName().equalsIgnoreCase("source"))) && (++__CLOVER_209_0.cloverRec.CT[4546]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4546]==0&false));
		__CLOVER_209_0.cloverRec.S[17763]++;NodeList fils = element.getChildNodes();
		//assert(fils.getLength()>0);
		__CLOVER_209_0.cloverRec.S[17764]++;NamedNodeMap attributs = element.getAttributes();
		__CLOVER_209_0.cloverRec.S[17765]++;String nom="",fichier=null;//'"('"\u00e9('"-('\u00e8-"(')
		__CLOVER_209_0.cloverRec.S[17766]++;boolean est_like=false,expended=false;

		__CLOVER_209_0.cloverRec.S[17767]++;for (i = 0; (((i < attributs.getLength()) && (++__CLOVER_209_0.cloverRec.CT[4547]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4547]==0&false)); i++) {{
			__CLOVER_209_0.cloverRec.S[17768]++;Node num\u00e9ro = attributs.item(i);
			__CLOVER_209_0.cloverRec.S[17769]++;String nomAttribut = num\u00e9ro.getNodeName();
			__CLOVER_209_0.cloverRec.S[17770]++;String valeurAttribut = num\u00e9ro.getNodeValue();
			__CLOVER_209_0.cloverRec.S[17771]++;System.out.println(nomAttribut + " =\"" + valeurAttribut + "\"");
			__CLOVER_209_0.cloverRec.S[17772]++;if ((((nomAttribut == "ligne") && (++__CLOVER_209_0.cloverRec.CT[4548]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4548]==0&false)))
				{__CLOVER_209_0.cloverRec.S[17773]++;ligne = Integer.parseInt(nomAttribut);
			}else {__CLOVER_209_0.cloverRec.S[17774]++;if ((((nomAttribut.equals("colonne")) && (++__CLOVER_209_0.cloverRec.CT[4549]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4549]==0&false)))
				{__CLOVER_209_0.cloverRec.S[17775]++;colonne = Integer.parseInt(nomAttribut);
			}else {__CLOVER_209_0.cloverRec.S[17776]++;if ((((nomAttribut.equals("fichier")) && (++__CLOVER_209_0.cloverRec.CT[4550]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4550]==0&false)))
				{__CLOVER_209_0.cloverRec.S[17777]++;fichier = nomAttribut;
			}else
				{assert((((false)) && (++__CLOVER_209_0.cloverRec.CT[4551]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4551]==0&false));
		}}}}
		}assert((((ligne>=0)) && (++__CLOVER_209_0.cloverRec.CT[4552]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4552]==0&false));
		assert((((colonne>=0)) && (++__CLOVER_209_0.cloverRec.CT[4553]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4553]==0&false));
		assert((((fils.getLength()==0)) && (++__CLOVER_209_0.cloverRec.CT[4554]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4554]==0&false));
		/*v=new Vector();
		for(i=0;i<fils.getLength();i++)
		{
			Node n = fils.item(i);
			//System.out.println("element=" + n.getNodeName());
			if (n instanceof Element) {
				if (n.getNodeName() == "type") {
					//System.out.println("heritage");
					type = creer_type((Element) n);
					v.addElement(type);
				}
				else
					assert(false);
			}
			else if (n instanceof Comment) {
				
			}
			else if (n instanceof Text) {
				String s = n.getNodeValue();
				assert(s == "" || s.matches("[ \t\n]+"));
			}
			else
				assert(false);
		}
		if(v!=null)
		{
			liste_heritage=new CIType[v.size()];
			v.copyInto(liste_heritage);
		}
		if(est_like)
			res=new CIType(nom);
		else
			res=new CIType(expended,nom,liste_heritage);*/
		__CLOVER_209_0.cloverRec.S[17778]++;res=new CISource(ligne,colonne,fichier);
		__CLOVER_209_0.cloverRec.S[17779]++;return res;
	}
	
	public CIType creer_type(Element element)
	{__CLOVER_209_0.cloverRec.M[1220]++;
		__CLOVER_209_0.cloverRec.S[17780]++;int no,i;
		__CLOVER_209_0.cloverRec.S[17781]++;CIType res=null;
		__CLOVER_209_0.cloverRec.S[17782]++;Vector v=null;
		__CLOVER_209_0.cloverRec.S[17783]++;CIType type=null,liste_heritage[]=null;
		assert((((element!=null)) && (++__CLOVER_209_0.cloverRec.CT[4555]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4555]==0&false));
		assert((((element.getNodeName().equalsIgnoreCase("type"))) && (++__CLOVER_209_0.cloverRec.CT[4556]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4556]==0&false));
		__CLOVER_209_0.cloverRec.S[17784]++;NodeList fils = element.getChildNodes();
		//assert(fils.getLength()>0);
		__CLOVER_209_0.cloverRec.S[17785]++;NamedNodeMap attributs = element.getAttributes();
		__CLOVER_209_0.cloverRec.S[17786]++;String nom="";
		__CLOVER_209_0.cloverRec.S[17787]++;boolean est_like=false,expended=false;
		__CLOVER_209_0.cloverRec.S[17788]++;CISource source=null;

		__CLOVER_209_0.cloverRec.S[17789]++;for (i = 0; (((i < attributs.getLength()) && (++__CLOVER_209_0.cloverRec.CT[4557]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4557]==0&false)); i++) {{
			__CLOVER_209_0.cloverRec.S[17790]++;Node num\u00e9ro = attributs.item(i);
			__CLOVER_209_0.cloverRec.S[17791]++;String nomAttribut = num\u00e9ro.getNodeName();
			__CLOVER_209_0.cloverRec.S[17792]++;String valeurAttribut = num\u00e9ro.getNodeValue();
			__CLOVER_209_0.cloverRec.S[17793]++;System.out.println(nomAttribut + " =\"" + valeurAttribut + "\"");
			__CLOVER_209_0.cloverRec.S[17794]++;if ((((nomAttribut == "nom") && (++__CLOVER_209_0.cloverRec.CT[4558]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4558]==0&false)))
				{__CLOVER_209_0.cloverRec.S[17795]++;nom = valeurAttribut;
			}else {__CLOVER_209_0.cloverRec.S[17796]++;if ((((nomAttribut.equals("est_like")) && (++__CLOVER_209_0.cloverRec.CT[4559]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4559]==0&false)))
				{__CLOVER_209_0.cloverRec.S[17797]++;est_like=valeurAttribut.equalsIgnoreCase("oui");
			}else {__CLOVER_209_0.cloverRec.S[17798]++;if ((((nomAttribut.equals("expanded")) && (++__CLOVER_209_0.cloverRec.CT[4560]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4560]==0&false)))
				{__CLOVER_209_0.cloverRec.S[17799]++;expended=valeurAttribut.equalsIgnoreCase("oui");
			}else
				{assert((((false)) && (++__CLOVER_209_0.cloverRec.CT[4561]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4561]==0&false));
		}}}}
		}assert((((nom!=null)) && (++__CLOVER_209_0.cloverRec.CT[4562]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4562]==0&false));
		__CLOVER_209_0.cloverRec.S[17800]++;v=new Vector();
		__CLOVER_209_0.cloverRec.S[17801]++;for(i=0;(((i<fils.getLength()) && (++__CLOVER_209_0.cloverRec.CT[4563]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4563]==0&false));i++)
		{{
			__CLOVER_209_0.cloverRec.S[17802]++;Node n = fils.item(i);
			//System.out.println("element=" + n.getNodeName());
			__CLOVER_209_0.cloverRec.S[17803]++;if ((((n instanceof Element) && (++__CLOVER_209_0.cloverRec.CT[4564]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4564]==0&false))) {{
				__CLOVER_209_0.cloverRec.S[17804]++;if ((((n.getNodeName() == "type") && (++__CLOVER_209_0.cloverRec.CT[4565]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4565]==0&false))) {{
					//System.out.println("heritage");
					__CLOVER_209_0.cloverRec.S[17805]++;type = creer_type((Element) n);
					__CLOVER_209_0.cloverRec.S[17806]++;v.addElement(type);
				}
				}else {__CLOVER_209_0.cloverRec.S[17807]++;if ((((n.getNodeName() == "source") && (++__CLOVER_209_0.cloverRec.CT[4566]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4566]==0&false))) {{
					//System.out.println("source");
					__CLOVER_209_0.cloverRec.S[17808]++;source = creer_source((Element) n);
				}
				}else
					{assert((((false)) && (++__CLOVER_209_0.cloverRec.CT[4567]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4567]==0&false));
			}}}
			}else {__CLOVER_209_0.cloverRec.S[17809]++;if ((((n instanceof Comment) && (++__CLOVER_209_0.cloverRec.CT[4568]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4568]==0&false))) {{
				
			}
			}else {__CLOVER_209_0.cloverRec.S[17810]++;if ((((n instanceof Text) && (++__CLOVER_209_0.cloverRec.CT[4569]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4569]==0&false))) {{
				__CLOVER_209_0.cloverRec.S[17811]++;String s = n.getNodeValue();
				assert((((s == "" || s.matches("[ \t\n]+"))) && (++__CLOVER_209_0.cloverRec.CT[4570]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4570]==0&false));
			}
			}else
				{assert((((false)) && (++__CLOVER_209_0.cloverRec.CT[4571]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4571]==0&false));
		}}}}
		}__CLOVER_209_0.cloverRec.S[17812]++;if((((v!=null) && (++__CLOVER_209_0.cloverRec.CT[4572]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4572]==0&false)))
		{{
			__CLOVER_209_0.cloverRec.S[17813]++;liste_heritage=new CIType[v.size()];
			__CLOVER_209_0.cloverRec.S[17814]++;v.copyInto(liste_heritage);
		}
		}__CLOVER_209_0.cloverRec.S[17815]++;if((((est_like) && (++__CLOVER_209_0.cloverRec.CT[4573]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4573]==0&false)))
			{__CLOVER_209_0.cloverRec.S[17816]++;res=new CITypeAncre(nom,source);
		}else
			{__CLOVER_209_0.cloverRec.S[17817]++;res=new CITypeSimple(expended,nom,liste_heritage,source);
		}__CLOVER_209_0.cloverRec.S[17818]++;return res;
	}

	public CIAttribut creer_attribut(Element element,CIClasse classe)
	{__CLOVER_209_0.cloverRec.M[1221]++;
		__CLOVER_209_0.cloverRec.S[17819]++;int no,i;
		__CLOVER_209_0.cloverRec.S[17820]++;CIAttribut res=null;
		__CLOVER_209_0.cloverRec.S[17821]++;Vector v=null,ascendant,descendant;
		__CLOVER_209_0.cloverRec.S[17822]++;CIType type=null,type_retour=null,liste_heritage[]=null;
		assert((((element!=null)) && (++__CLOVER_209_0.cloverRec.CT[4574]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4574]==0&false));
		assert((((element.getNodeName().equalsIgnoreCase("attribut"))) && (++__CLOVER_209_0.cloverRec.CT[4575]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4575]==0&false));
		__CLOVER_209_0.cloverRec.S[17823]++;NodeList fils = element.getChildNodes();
		assert((((fils.getLength()>0)) && (++__CLOVER_209_0.cloverRec.CT[4576]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4576]==0&false));
		assert((((classe!=null)) && (++__CLOVER_209_0.cloverRec.CT[4577]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4577]==0&false));
		__CLOVER_209_0.cloverRec.S[17824]++;NamedNodeMap attributs = element.getAttributes();
		__CLOVER_209_0.cloverRec.S[17825]++;CINom_Attribut nom=null;
		__CLOVER_209_0.cloverRec.S[17826]++;CIAttribut_Ascendant attr_asc,liste_asc[];
		__CLOVER_209_0.cloverRec.S[17827]++;CIAttribut_Descendant attr_desc,liste_desc[];
		__CLOVER_209_0.cloverRec.S[17828]++;CIRoutine routine=null;
		__CLOVER_209_0.cloverRec.S[17829]++;CIExpr expr=null;
		__CLOVER_209_0.cloverRec.S[17830]++;boolean est_static=false;
		__CLOVER_209_0.cloverRec.S[17831]++;CISource source=null;

		__CLOVER_209_0.cloverRec.S[17832]++;for (i = 0; (((i < attributs.getLength()) && (++__CLOVER_209_0.cloverRec.CT[4578]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4578]==0&false)); i++) {{
			__CLOVER_209_0.cloverRec.S[17833]++;Node num\u00e9ro = attributs.item(i);
			__CLOVER_209_0.cloverRec.S[17834]++;String nomAttribut = num\u00e9ro.getNodeName();
			__CLOVER_209_0.cloverRec.S[17835]++;String valeurAttribut = num\u00e9ro.getNodeValue();
			__CLOVER_209_0.cloverRec.S[17836]++;System.out.println(nomAttribut + " =\"" + valeurAttribut + "\"");
			__CLOVER_209_0.cloverRec.S[17837]++;if ((((nomAttribut.equals("est_static")) && (++__CLOVER_209_0.cloverRec.CT[4579]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4579]==0&false)))
				{__CLOVER_209_0.cloverRec.S[17838]++;est_static=valeurAttribut.equalsIgnoreCase("oui");
			}else
				{assert((((false)) && (++__CLOVER_209_0.cloverRec.CT[4580]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4580]==0&false));
		}}
		
		}__CLOVER_209_0.cloverRec.S[17839]++;v=new Vector();
		__CLOVER_209_0.cloverRec.S[17840]++;ascendant=new Vector();
		__CLOVER_209_0.cloverRec.S[17841]++;descendant=new Vector();
		__CLOVER_209_0.cloverRec.S[17842]++;for(i=0;(((i<fils.getLength()) && (++__CLOVER_209_0.cloverRec.CT[4581]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4581]==0&false));i++)
		{{
			__CLOVER_209_0.cloverRec.S[17843]++;Node n = fils.item(i);
			//System.out.println("element=" + n.getNodeName());
			__CLOVER_209_0.cloverRec.S[17844]++;if ((((n instanceof Element) && (++__CLOVER_209_0.cloverRec.CT[4582]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4582]==0&false))) {{
				__CLOVER_209_0.cloverRec.S[17845]++;if ((((n.getNodeName() == "type") && (++__CLOVER_209_0.cloverRec.CT[4583]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4583]==0&false))) {{
					//System.out.println("heritage");
					__CLOVER_209_0.cloverRec.S[17846]++;if((((type==null) && (++__CLOVER_209_0.cloverRec.CT[4584]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4584]==0&false)))
					{{
						__CLOVER_209_0.cloverRec.S[17847]++;type = creer_type((Element) n);
						assert((((type!=null)) && (++__CLOVER_209_0.cloverRec.CT[4585]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4585]==0&false));
					}
					}else
					{{
						__CLOVER_209_0.cloverRec.S[17848]++;type_retour = creer_type((Element) n);
						assert((((type_retour!=null)) && (++__CLOVER_209_0.cloverRec.CT[4586]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4586]==0&false));
					}
				}}
				}else {__CLOVER_209_0.cloverRec.S[17849]++;if ((((n.getNodeName() == "nom_attribut") && (++__CLOVER_209_0.cloverRec.CT[4587]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4587]==0&false))) {{
					//System.out.println("heritage");
					__CLOVER_209_0.cloverRec.S[17850]++;nom = creer_nom_attribut((Element) n);
					assert((((nom!=null)) && (++__CLOVER_209_0.cloverRec.CT[4588]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4588]==0&false));
				}
				}else {__CLOVER_209_0.cloverRec.S[17851]++;if ((((n.getNodeName() == "routine") && (++__CLOVER_209_0.cloverRec.CT[4589]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4589]==0&false))) {{
					//System.out.println("heritage");
					__CLOVER_209_0.cloverRec.S[17852]++;routine=creer_routine((Element) n,classe);
				}
				}else {__CLOVER_209_0.cloverRec.S[17853]++;if ((((n.getNodeName() == "expression") && (++__CLOVER_209_0.cloverRec.CT[4590]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4590]==0&false))) {{
					//System.out.println("heritage");
					__CLOVER_209_0.cloverRec.S[17854]++;expr=creer_expr((Element) n);
				}
				}else {__CLOVER_209_0.cloverRec.S[17855]++;if ((((n.getNodeName() == "ascendant") && (++__CLOVER_209_0.cloverRec.CT[4591]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4591]==0&false))) {{
					//System.out.println("heritage");
					__CLOVER_209_0.cloverRec.S[17856]++;attr_asc=creer_ascendant((Element) n);
					assert((((attr_asc!=null)) && (++__CLOVER_209_0.cloverRec.CT[4592]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4592]==0&false));
					__CLOVER_209_0.cloverRec.S[17857]++;ascendant.addElement(attr_asc);
				}
				}else {__CLOVER_209_0.cloverRec.S[17858]++;if ((((n.getNodeName() == "descendant") && (++__CLOVER_209_0.cloverRec.CT[4593]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4593]==0&false))) {{
					//System.out.println("heritage");
					__CLOVER_209_0.cloverRec.S[17859]++;attr_desc=creer_descendant((Element) n);
					assert((((attr_desc!=null)) && (++__CLOVER_209_0.cloverRec.CT[4594]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4594]==0&false));
					__CLOVER_209_0.cloverRec.S[17860]++;descendant.addElement(attr_desc);
				}
				}else {__CLOVER_209_0.cloverRec.S[17861]++;if ((((n.getNodeName() == "source") && (++__CLOVER_209_0.cloverRec.CT[4595]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4595]==0&false))) {{
					//System.out.println("source");
					__CLOVER_209_0.cloverRec.S[17862]++;source = creer_source((Element) n);
				}
				}else
					{assert((((false)) && (++__CLOVER_209_0.cloverRec.CT[4596]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4596]==0&false));
			}}}}}}}}
			}else {__CLOVER_209_0.cloverRec.S[17863]++;if ((((n instanceof Comment) && (++__CLOVER_209_0.cloverRec.CT[4597]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4597]==0&false))) {{
				
			}
			}else {__CLOVER_209_0.cloverRec.S[17864]++;if ((((n instanceof Text) && (++__CLOVER_209_0.cloverRec.CT[4598]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4598]==0&false))) {{
				__CLOVER_209_0.cloverRec.S[17865]++;String s = n.getNodeValue();
				assert((((s == "" || s.matches("[ \t\n]+"))) && (++__CLOVER_209_0.cloverRec.CT[4599]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4599]==0&false));
			}
			}else
				{assert((((false)) && (++__CLOVER_209_0.cloverRec.CT[4600]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4600]==0&false));
		}}}}
		}assert((((nom!=null)) && (++__CLOVER_209_0.cloverRec.CT[4601]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4601]==0&false));
		__CLOVER_209_0.cloverRec.S[17866]++;res=new CIAttribut(nom,est_static,source);
		__CLOVER_209_0.cloverRec.S[17867]++;res.type=(CITypeSimple)type;
		__CLOVER_209_0.cloverRec.S[17868]++;res.retour=type_retour;
		__CLOVER_209_0.cloverRec.S[17869]++;if((((ascendant.size()>0) && (++__CLOVER_209_0.cloverRec.CT[4602]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4602]==0&false)))
		{{
			__CLOVER_209_0.cloverRec.S[17870]++;liste_asc=new CIAttribut_Ascendant[ascendant.size()];
			__CLOVER_209_0.cloverRec.S[17871]++;ascendant.copyInto(liste_asc);
			__CLOVER_209_0.cloverRec.S[17872]++;res.attribut_ascendant=liste_asc;
		}
		}__CLOVER_209_0.cloverRec.S[17873]++;if((((descendant.size()>0) && (++__CLOVER_209_0.cloverRec.CT[4603]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4603]==0&false)))
		{{
			__CLOVER_209_0.cloverRec.S[17874]++;liste_desc=new CIAttribut_Descendant[descendant.size()];
			__CLOVER_209_0.cloverRec.S[17875]++;descendant.copyInto(liste_desc);
			__CLOVER_209_0.cloverRec.S[17876]++;res.attribut_descendant=liste_desc;
		}
		}__CLOVER_209_0.cloverRec.S[17877]++;if((((routine!=null) && (++__CLOVER_209_0.cloverRec.CT[4604]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4604]==0&false)))
		{{
			__CLOVER_209_0.cloverRec.S[17878]++;res.routine=routine;
		}
		}else {__CLOVER_209_0.cloverRec.S[17879]++;if((((expr!=null) && (++__CLOVER_209_0.cloverRec.CT[4605]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4605]==0&false)))
		{{
			__CLOVER_209_0.cloverRec.S[17880]++;res.cst=expr;
		}
		}}__CLOVER_209_0.cloverRec.S[17881]++;return res;
	}

	public CINom_Attribut creer_nom_attribut(Element element)
	{__CLOVER_209_0.cloverRec.M[1222]++;
		__CLOVER_209_0.cloverRec.S[17882]++;int no,i;
		__CLOVER_209_0.cloverRec.S[17883]++;CINom_Attribut res=null;
		assert((((element!=null)) && (++__CLOVER_209_0.cloverRec.CT[4606]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4606]==0&false));
		assert((((element.getNodeName().equalsIgnoreCase("nom_attribut"))) && (++__CLOVER_209_0.cloverRec.CT[4607]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4607]==0&false));
		__CLOVER_209_0.cloverRec.S[17884]++;NodeList fils = element.getChildNodes();
		assert((((fils.getLength()==0)) && (++__CLOVER_209_0.cloverRec.CT[4608]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4608]==0&false));
		__CLOVER_209_0.cloverRec.S[17885]++;NamedNodeMap attributs = element.getAttributes();
		__CLOVER_209_0.cloverRec.S[17886]++;String nom="";
		__CLOVER_209_0.cloverRec.S[17887]++;boolean infix=false,rien=true;
		__CLOVER_209_0.cloverRec.S[17888]++;CISource source=null;

		__CLOVER_209_0.cloverRec.S[17889]++;for (i = 0; (((i < attributs.getLength()) && (++__CLOVER_209_0.cloverRec.CT[4609]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4609]==0&false)); i++) {{
			__CLOVER_209_0.cloverRec.S[17890]++;Node num\u00e9ro = attributs.item(i);
			__CLOVER_209_0.cloverRec.S[17891]++;String nomAttribut = num\u00e9ro.getNodeName();
			__CLOVER_209_0.cloverRec.S[17892]++;String valeurAttribut = num\u00e9ro.getNodeValue();
			__CLOVER_209_0.cloverRec.S[17893]++;System.out.println(nomAttribut + " =\"" + valeurAttribut + "\"");
			__CLOVER_209_0.cloverRec.S[17894]++;if ((((nomAttribut == "nom") && (++__CLOVER_209_0.cloverRec.CT[4610]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4610]==0&false)))
				{__CLOVER_209_0.cloverRec.S[17895]++;nom = valeurAttribut;
			}else {__CLOVER_209_0.cloverRec.S[17896]++;if ((((nomAttribut == "type") && (++__CLOVER_209_0.cloverRec.CT[4611]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4611]==0&false)))
			{{
				__CLOVER_209_0.cloverRec.S[17897]++;if((((valeurAttribut.equalsIgnoreCase("rien")) && (++__CLOVER_209_0.cloverRec.CT[4612]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4612]==0&false)))
				{{
					__CLOVER_209_0.cloverRec.S[17898]++;rien=true;
				}
				}else {__CLOVER_209_0.cloverRec.S[17899]++;if((((valeurAttribut.equalsIgnoreCase("infix")) && (++__CLOVER_209_0.cloverRec.CT[4613]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4613]==0&false)))
				{{
					__CLOVER_209_0.cloverRec.S[17900]++;rien=false;
					__CLOVER_209_0.cloverRec.S[17901]++;infix=true;
				}
				}else {__CLOVER_209_0.cloverRec.S[17902]++;if((((valeurAttribut.equalsIgnoreCase("prefix")) && (++__CLOVER_209_0.cloverRec.CT[4614]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4614]==0&false)))
				{{
					__CLOVER_209_0.cloverRec.S[17903]++;rien=false;
					__CLOVER_209_0.cloverRec.S[17904]++;infix=false;
				}
				}else
					{assert((((false)) && (++__CLOVER_209_0.cloverRec.CT[4615]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4615]==0&false));
			}}}}
			}else
				{assert((((false)) && (++__CLOVER_209_0.cloverRec.CT[4616]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4616]==0&false));
		}}}
		}assert((((nom!=null)) && (++__CLOVER_209_0.cloverRec.CT[4617]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4617]==0&false));
		__CLOVER_209_0.cloverRec.S[17905]++;for(i=0;(((i<fils.getLength()) && (++__CLOVER_209_0.cloverRec.CT[4618]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4618]==0&false));i++)
		{{
			__CLOVER_209_0.cloverRec.S[17906]++;Node n = fils.item(i);
			//System.out.println("element=" + n.getNodeName());
			__CLOVER_209_0.cloverRec.S[17907]++;if ((((n instanceof Element) && (++__CLOVER_209_0.cloverRec.CT[4619]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4619]==0&false))) {{
				__CLOVER_209_0.cloverRec.S[17908]++;if ((((n.getNodeName() == "source") && (++__CLOVER_209_0.cloverRec.CT[4620]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4620]==0&false))) {{
					//System.out.println("source");
					__CLOVER_209_0.cloverRec.S[17909]++;source = creer_source((Element) n);
				}
				}else
					{assert((((false)) && (++__CLOVER_209_0.cloverRec.CT[4621]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4621]==0&false));
			}}
			}else {__CLOVER_209_0.cloverRec.S[17910]++;if ((((n instanceof Comment) && (++__CLOVER_209_0.cloverRec.CT[4622]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4622]==0&false))) {{
				
			}
			}else {__CLOVER_209_0.cloverRec.S[17911]++;if ((((n instanceof Text) && (++__CLOVER_209_0.cloverRec.CT[4623]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4623]==0&false))) {{
				__CLOVER_209_0.cloverRec.S[17912]++;String s = n.getNodeValue();
				assert((((s == "" || s.matches("[ \t\n]+"))) && (++__CLOVER_209_0.cloverRec.CT[4624]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4624]==0&false));
			}
			}else
				{assert((((false)) && (++__CLOVER_209_0.cloverRec.CT[4625]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4625]==0&false));
		}}}}
		}__CLOVER_209_0.cloverRec.S[17913]++;if((((rien) && (++__CLOVER_209_0.cloverRec.CT[4626]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4626]==0&false)))
			{__CLOVER_209_0.cloverRec.S[17914]++;res=new CINom_Attribut(nom,source);
		}else
			{__CLOVER_209_0.cloverRec.S[17915]++;res=new CINom_Attribut("\""+nom+"\"",infix,source);
		}__CLOVER_209_0.cloverRec.S[17916]++;return res;
	}

	public CIAttribut_Ascendant creer_ascendant(Element element)
	{__CLOVER_209_0.cloverRec.M[1223]++;
		__CLOVER_209_0.cloverRec.S[17917]++;int no=-1,i;
		__CLOVER_209_0.cloverRec.S[17918]++;CIAttribut_Ascendant res=null;
		__CLOVER_209_0.cloverRec.S[17919]++;CIType type=null,liste_heritage[]=null;
		assert((((element!=null)) && (++__CLOVER_209_0.cloverRec.CT[4627]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4627]==0&false));
		assert((((element.getNodeName().equalsIgnoreCase("ascendant"))) && (++__CLOVER_209_0.cloverRec.CT[4628]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4628]==0&false));
		__CLOVER_209_0.cloverRec.S[17920]++;NodeList fils = element.getChildNodes();
		//assert(fils.getLength()>0);
		__CLOVER_209_0.cloverRec.S[17921]++;NamedNodeMap attributs = element.getAttributes();
		__CLOVER_209_0.cloverRec.S[17922]++;CINom_Attribut nom=null;
		__CLOVER_209_0.cloverRec.S[17923]++;CISource source=null;

		__CLOVER_209_0.cloverRec.S[17924]++;for (i = 0; (((i < attributs.getLength()) && (++__CLOVER_209_0.cloverRec.CT[4629]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4629]==0&false)); i++) {{
			__CLOVER_209_0.cloverRec.S[17925]++;Node num\u00e9ro = attributs.item(i);
			__CLOVER_209_0.cloverRec.S[17926]++;String nomAttribut = num\u00e9ro.getNodeName();
			__CLOVER_209_0.cloverRec.S[17927]++;String valeurAttribut = num\u00e9ro.getNodeValue();
			__CLOVER_209_0.cloverRec.S[17928]++;System.out.println(nomAttribut + " =\"" + valeurAttribut + "\"");
			__CLOVER_209_0.cloverRec.S[17929]++;if ((((nomAttribut == "no") && (++__CLOVER_209_0.cloverRec.CT[4630]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4630]==0&false)))
			{{
				__CLOVER_209_0.cloverRec.S[17930]++;try {
					__CLOVER_209_0.cloverRec.S[17931]++;no = Integer.parseInt(valeurAttribut);
				}
				catch(NumberFormatException e)
				{
					__CLOVER_209_0.cloverRec.S[17932]++;e.printStackTrace();
					assert((((false)) && (++__CLOVER_209_0.cloverRec.CT[4631]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4631]==0&false));
				}
			}
			}else
				{assert((((false)) && (++__CLOVER_209_0.cloverRec.CT[4632]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4632]==0&false));
		}}
		}assert((((no>=0)) && (++__CLOVER_209_0.cloverRec.CT[4633]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4633]==0&false));
		__CLOVER_209_0.cloverRec.S[17933]++;for(i=0;(((i<fils.getLength()) && (++__CLOVER_209_0.cloverRec.CT[4634]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4634]==0&false));i++)
		{{
			__CLOVER_209_0.cloverRec.S[17934]++;Node n = fils.item(i);
			//System.out.println("element=" + n.getNodeName());
			__CLOVER_209_0.cloverRec.S[17935]++;if ((((n instanceof Element) && (++__CLOVER_209_0.cloverRec.CT[4635]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4635]==0&false))) {{
				__CLOVER_209_0.cloverRec.S[17936]++;if ((((n.getNodeName() == "nom_attribut") && (++__CLOVER_209_0.cloverRec.CT[4636]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4636]==0&false))) {{
					//System.out.println("heritage");
					__CLOVER_209_0.cloverRec.S[17937]++;nom = creer_nom_attribut((Element) n);
				}
				}else {__CLOVER_209_0.cloverRec.S[17938]++;if ((((n.getNodeName() == "source") && (++__CLOVER_209_0.cloverRec.CT[4637]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4637]==0&false))) {{
					//System.out.println("source");
					__CLOVER_209_0.cloverRec.S[17939]++;source = creer_source((Element) n);
				}
				}else
					{assert((((false)) && (++__CLOVER_209_0.cloverRec.CT[4638]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4638]==0&false));
			}}}
			}else {__CLOVER_209_0.cloverRec.S[17940]++;if ((((n instanceof Comment) && (++__CLOVER_209_0.cloverRec.CT[4639]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4639]==0&false))) {{
				
			}
			}else {__CLOVER_209_0.cloverRec.S[17941]++;if ((((n instanceof Text) && (++__CLOVER_209_0.cloverRec.CT[4640]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4640]==0&false))) {{
				__CLOVER_209_0.cloverRec.S[17942]++;String s = n.getNodeValue();
				assert((((s == "" || s.matches("[ \t\n]+"))) && (++__CLOVER_209_0.cloverRec.CT[4641]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4641]==0&false));
			}
			}else
				{assert((((false)) && (++__CLOVER_209_0.cloverRec.CT[4642]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4642]==0&false));
		}}}}
		}__CLOVER_209_0.cloverRec.S[17943]++;res=new CIAttribut_Ascendant(no,nom,source);
		__CLOVER_209_0.cloverRec.S[17944]++;return res;
	}

	public CIAttribut_Descendant creer_descendant(Element element)
	{__CLOVER_209_0.cloverRec.M[1224]++;
		__CLOVER_209_0.cloverRec.S[17945]++;int no,i;
		__CLOVER_209_0.cloverRec.S[17946]++;CIAttribut_Descendant res=null;
		__CLOVER_209_0.cloverRec.S[17947]++;CIType type=null;
		assert((((element!=null)) && (++__CLOVER_209_0.cloverRec.CT[4643]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4643]==0&false));
		assert((((element.getNodeName().equalsIgnoreCase("descendant"))) && (++__CLOVER_209_0.cloverRec.CT[4644]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4644]==0&false));
		__CLOVER_209_0.cloverRec.S[17948]++;NodeList fils = element.getChildNodes();
		assert((((fils.getLength()>0)) && (++__CLOVER_209_0.cloverRec.CT[4645]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4645]==0&false));
		__CLOVER_209_0.cloverRec.S[17949]++;NamedNodeMap attributs = element.getAttributes();
		__CLOVER_209_0.cloverRec.S[17950]++;CINom_Attribut nom=null;
		__CLOVER_209_0.cloverRec.S[17951]++;CISource source=null;
		
		__CLOVER_209_0.cloverRec.S[17952]++;for(i=0;(((i<fils.getLength()) && (++__CLOVER_209_0.cloverRec.CT[4646]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4646]==0&false));i++)
		{{
			__CLOVER_209_0.cloverRec.S[17953]++;Node n = fils.item(i);
			//System.out.println("element=" + n.getNodeName());
			__CLOVER_209_0.cloverRec.S[17954]++;if ((((n instanceof Element) && (++__CLOVER_209_0.cloverRec.CT[4647]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4647]==0&false))) {{
				__CLOVER_209_0.cloverRec.S[17955]++;if ((((n.getNodeName() == "type") && (++__CLOVER_209_0.cloverRec.CT[4648]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4648]==0&false))) {{
					//System.out.println("heritage");
					__CLOVER_209_0.cloverRec.S[17956]++;type = creer_type((Element) n);
					assert((((type!=null)) && (++__CLOVER_209_0.cloverRec.CT[4649]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4649]==0&false));
				}
				}else {__CLOVER_209_0.cloverRec.S[17957]++;if ((((n.getNodeName() == "nom_attribut") && (++__CLOVER_209_0.cloverRec.CT[4650]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4650]==0&false))) {{
					//System.out.println("heritage");
					__CLOVER_209_0.cloverRec.S[17958]++;nom = creer_nom_attribut((Element) n);
					assert((((nom!=null)) && (++__CLOVER_209_0.cloverRec.CT[4651]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4651]==0&false));
				}
				}else {__CLOVER_209_0.cloverRec.S[17959]++;if ((((n.getNodeName() == "source") && (++__CLOVER_209_0.cloverRec.CT[4652]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4652]==0&false))) {{
					//System.out.println("source");
					__CLOVER_209_0.cloverRec.S[17960]++;source = creer_source((Element) n);
				}
				}else
					{assert((((false)) && (++__CLOVER_209_0.cloverRec.CT[4653]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4653]==0&false));
			}}}}
			}else {__CLOVER_209_0.cloverRec.S[17961]++;if ((((n instanceof Comment) && (++__CLOVER_209_0.cloverRec.CT[4654]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4654]==0&false))) {{
				
			}
			}else {__CLOVER_209_0.cloverRec.S[17962]++;if ((((n instanceof Text) && (++__CLOVER_209_0.cloverRec.CT[4655]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4655]==0&false))) {{
				__CLOVER_209_0.cloverRec.S[17963]++;String s = n.getNodeValue();
				assert((((s == "" || s.matches("[ \t\n]+"))) && (++__CLOVER_209_0.cloverRec.CT[4656]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4656]==0&false));
			}
			}else
				{assert((((false)) && (++__CLOVER_209_0.cloverRec.CT[4657]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4657]==0&false));
		}}}}
		}assert((((nom!=null)) && (++__CLOVER_209_0.cloverRec.CT[4658]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4658]==0&false));
		assert((((type!=null)) && (++__CLOVER_209_0.cloverRec.CT[4659]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4659]==0&false));
		__CLOVER_209_0.cloverRec.S[17964]++;res=new CIAttribut_Descendant(nom,type,source);
		__CLOVER_209_0.cloverRec.S[17965]++;return res;
	}

	public CIDeclare_Var creer_declare_var(Element element)
	{__CLOVER_209_0.cloverRec.M[1225]++;
		__CLOVER_209_0.cloverRec.S[17966]++;int no,i;
		__CLOVER_209_0.cloverRec.S[17967]++;CIDeclare_Var res=null;
		__CLOVER_209_0.cloverRec.S[17968]++;CIType type=null;
		assert((((element!=null)) && (++__CLOVER_209_0.cloverRec.CT[4660]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4660]==0&false));
		assert((((element.getNodeName().equalsIgnoreCase("declare_var"))) && (++__CLOVER_209_0.cloverRec.CT[4661]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4661]==0&false));
		__CLOVER_209_0.cloverRec.S[17969]++;NodeList fils = element.getChildNodes();
		assert((((fils.getLength()>0)) && (++__CLOVER_209_0.cloverRec.CT[4662]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4662]==0&false));
		__CLOVER_209_0.cloverRec.S[17970]++;NamedNodeMap attributs = element.getAttributes();
		__CLOVER_209_0.cloverRec.S[17971]++;String nom="";
		__CLOVER_209_0.cloverRec.S[17972]++;CIExpr_Scalaire es=null;
		__CLOVER_209_0.cloverRec.S[17973]++;CISource source=null;

		__CLOVER_209_0.cloverRec.S[17974]++;for (i = 0; (((i < attributs.getLength()) && (++__CLOVER_209_0.cloverRec.CT[4663]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4663]==0&false)); i++) {{
			__CLOVER_209_0.cloverRec.S[17975]++;Node num\u00e9ro = attributs.item(i);
			__CLOVER_209_0.cloverRec.S[17976]++;String nomAttribut = num\u00e9ro.getNodeName();
			__CLOVER_209_0.cloverRec.S[17977]++;String valeurAttribut = num\u00e9ro.getNodeValue();
			__CLOVER_209_0.cloverRec.S[17978]++;System.out.println(nomAttribut + " =\"" + valeurAttribut + "\"");
			__CLOVER_209_0.cloverRec.S[17979]++;if ((((nomAttribut == "nom") && (++__CLOVER_209_0.cloverRec.CT[4664]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4664]==0&false)))
				{__CLOVER_209_0.cloverRec.S[17980]++;nom = valeurAttribut;
			}else
				{assert((((false)) && (++__CLOVER_209_0.cloverRec.CT[4665]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4665]==0&false));
		}}
		}assert((((nom!=null)) && (++__CLOVER_209_0.cloverRec.CT[4666]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4666]==0&false));
		__CLOVER_209_0.cloverRec.S[17981]++;for(i=0;(((i<fils.getLength()) && (++__CLOVER_209_0.cloverRec.CT[4667]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4667]==0&false));i++)
		{{
			__CLOVER_209_0.cloverRec.S[17982]++;Node n = fils.item(i);
			//System.out.println("element=" + n.getNodeName());
			__CLOVER_209_0.cloverRec.S[17983]++;if ((((n instanceof Element) && (++__CLOVER_209_0.cloverRec.CT[4668]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4668]==0&false))) {{
				__CLOVER_209_0.cloverRec.S[17984]++;if ((((n.getNodeName() == "type") && (++__CLOVER_209_0.cloverRec.CT[4669]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4669]==0&false))) {{
					//System.out.println("heritage");
					__CLOVER_209_0.cloverRec.S[17985]++;type = creer_type((Element) n);
				}
				}else {__CLOVER_209_0.cloverRec.S[17986]++;if ((((n.getNodeName() == "expression_scalaire") && (++__CLOVER_209_0.cloverRec.CT[4670]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4670]==0&false))) {{
					//System.out.println("heritage");
					__CLOVER_209_0.cloverRec.S[17987]++;es = creer_expr_scalaire((Element) n);
				}
				}else {__CLOVER_209_0.cloverRec.S[17988]++;if ((((n.getNodeName() == "source") && (++__CLOVER_209_0.cloverRec.CT[4671]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4671]==0&false))) {{
					//System.out.println("source");
					__CLOVER_209_0.cloverRec.S[17989]++;source = creer_source((Element) n);
				}
				}else
					{assert((((false)) && (++__CLOVER_209_0.cloverRec.CT[4672]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4672]==0&false));
			}}}}
			}else {__CLOVER_209_0.cloverRec.S[17990]++;if ((((n instanceof Comment) && (++__CLOVER_209_0.cloverRec.CT[4673]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4673]==0&false))) {{
				
			}
			}else {__CLOVER_209_0.cloverRec.S[17991]++;if ((((n instanceof Text) && (++__CLOVER_209_0.cloverRec.CT[4674]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4674]==0&false))) {{
				__CLOVER_209_0.cloverRec.S[17992]++;String s = n.getNodeValue();
				assert((((s == "" || s.matches("[ \t\n]+"))) && (++__CLOVER_209_0.cloverRec.CT[4675]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4675]==0&false));
			}
			}else
				{assert((((false)) && (++__CLOVER_209_0.cloverRec.CT[4676]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4676]==0&false));
		}}}}
		}__CLOVER_209_0.cloverRec.S[17993]++;if((((es!=null) && (++__CLOVER_209_0.cloverRec.CT[4677]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4677]==0&false)))
			{__CLOVER_209_0.cloverRec.S[17994]++;res=res=new CIDeclare_Var(nom,type,es,source);
		}else
			{__CLOVER_209_0.cloverRec.S[17995]++;res=new CIDeclare_Var(nom,type,source);
		}__CLOVER_209_0.cloverRec.S[17996]++;return res;
	}

	public CIDeclare_Var[] creer_signature(Element element)
	{__CLOVER_209_0.cloverRec.M[1226]++;
		__CLOVER_209_0.cloverRec.S[17997]++;int no,i;
		__CLOVER_209_0.cloverRec.S[17998]++;CIDeclare_Var res=null,liste[]=null;
		__CLOVER_209_0.cloverRec.S[17999]++;CIType type=null;
		__CLOVER_209_0.cloverRec.S[18000]++;Vector v;
		assert((((element!=null)) && (++__CLOVER_209_0.cloverRec.CT[4678]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4678]==0&false));
		assert((((element.getNodeName().equalsIgnoreCase("signature"))) && (++__CLOVER_209_0.cloverRec.CT[4679]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4679]==0&false));
		__CLOVER_209_0.cloverRec.S[18001]++;NodeList fils = element.getChildNodes();
		//assert(fils.getLength()>0);
		__CLOVER_209_0.cloverRec.S[18002]++;NamedNodeMap attributs = element.getAttributes();
		__CLOVER_209_0.cloverRec.S[18003]++;String nom="";

		__CLOVER_209_0.cloverRec.S[18004]++;v=new Vector();
		__CLOVER_209_0.cloverRec.S[18005]++;for(i=0;(((i<fils.getLength()) && (++__CLOVER_209_0.cloverRec.CT[4680]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4680]==0&false));i++)
		{{
			__CLOVER_209_0.cloverRec.S[18006]++;Node n = fils.item(i);
			//System.out.println("element=" + n.getNodeName());
			__CLOVER_209_0.cloverRec.S[18007]++;if ((((n instanceof Element) && (++__CLOVER_209_0.cloverRec.CT[4681]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4681]==0&false))) {{
				__CLOVER_209_0.cloverRec.S[18008]++;if ((((n.getNodeName() == "declare_var") && (++__CLOVER_209_0.cloverRec.CT[4682]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4682]==0&false))) {{
					//System.out.println("heritage");
					__CLOVER_209_0.cloverRec.S[18009]++;res = creer_declare_var((Element) n);
					__CLOVER_209_0.cloverRec.S[18010]++;v.addElement(res);
				}
				}else
					{assert((((false)) && (++__CLOVER_209_0.cloverRec.CT[4683]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4683]==0&false));
			}}
			}else {__CLOVER_209_0.cloverRec.S[18011]++;if ((((n instanceof Comment) && (++__CLOVER_209_0.cloverRec.CT[4684]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4684]==0&false))) {{
				
			}
			}else {__CLOVER_209_0.cloverRec.S[18012]++;if ((((n instanceof Text) && (++__CLOVER_209_0.cloverRec.CT[4685]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4685]==0&false))) {{
				__CLOVER_209_0.cloverRec.S[18013]++;String s = n.getNodeValue();
				assert((((s == "" || s.matches("[ \t\n]+"))) && (++__CLOVER_209_0.cloverRec.CT[4686]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4686]==0&false));
			}
			}else
				{assert((((false)) && (++__CLOVER_209_0.cloverRec.CT[4687]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4687]==0&false));
		}}}}
		}__CLOVER_209_0.cloverRec.S[18014]++;if((((v.size()>0) && (++__CLOVER_209_0.cloverRec.CT[4688]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4688]==0&false)))
		{{
			__CLOVER_209_0.cloverRec.S[18015]++;liste=new CIDeclare_Var[v.size()];
			__CLOVER_209_0.cloverRec.S[18016]++;v.copyInto(liste);
		}
		}__CLOVER_209_0.cloverRec.S[18017]++;return liste;
	}

	public CIRoutine creer_routine(Element element,CIClasse classe)
	{__CLOVER_209_0.cloverRec.M[1227]++;
		__CLOVER_209_0.cloverRec.S[18018]++;int no,i;
		__CLOVER_209_0.cloverRec.S[18019]++;CIRoutine res=null;
		__CLOVER_209_0.cloverRec.S[18020]++;CIType type=null;
		__CLOVER_209_0.cloverRec.S[18021]++;Vector v, v_local;
		assert((((element!=null)) && (++__CLOVER_209_0.cloverRec.CT[4689]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4689]==0&false));
		assert((((element.getNodeName().equalsIgnoreCase("routine"))) && (++__CLOVER_209_0.cloverRec.CT[4690]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4690]==0&false));
		__CLOVER_209_0.cloverRec.S[18022]++;NodeList fils = element.getChildNodes();
		assert((((fils.getLength()>0)) && (++__CLOVER_209_0.cloverRec.CT[4691]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4691]==0&false));
		assert((((classe!=null)) && (++__CLOVER_209_0.cloverRec.CT[4692]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4692]==0&false));
		__CLOVER_209_0.cloverRec.S[18023]++;NamedNodeMap attributs = element.getAttributes();
		__CLOVER_209_0.cloverRec.S[18024]++;String nom="";
		__CLOVER_209_0.cloverRec.S[18025]++;CIDeclare_Var signature[]=null,decl;
		__CLOVER_209_0.cloverRec.S[18026]++;CIListe_Instr instr=null;
		__CLOVER_209_0.cloverRec.S[18027]++;CIListe_Var local=null;
		__CLOVER_209_0.cloverRec.S[18028]++;CIAssertion precondition=null,postcondition=null;
		__CLOVER_209_0.cloverRec.S[18029]++;CISource source=null;

		__CLOVER_209_0.cloverRec.S[18030]++;v=new Vector();
		__CLOVER_209_0.cloverRec.S[18031]++;v_local=new Vector();
		__CLOVER_209_0.cloverRec.S[18032]++;for(i=0;(((i<fils.getLength()) && (++__CLOVER_209_0.cloverRec.CT[4693]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4693]==0&false));i++)
		{{
			__CLOVER_209_0.cloverRec.S[18033]++;Node n = fils.item(i);
			//System.out.println("element=" + n.getNodeName());
			__CLOVER_209_0.cloverRec.S[18034]++;if ((((n instanceof Element) && (++__CLOVER_209_0.cloverRec.CT[4694]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4694]==0&false))) {{
				__CLOVER_209_0.cloverRec.S[18035]++;if ((((n.getNodeName() == "signature") && (++__CLOVER_209_0.cloverRec.CT[4695]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4695]==0&false))) {{
					//System.out.println("heritage");
					__CLOVER_209_0.cloverRec.S[18036]++;signature=creer_signature((Element) n);
				}
				}else {__CLOVER_209_0.cloverRec.S[18037]++;if ((((n.getNodeName() == "declare_var") && (++__CLOVER_209_0.cloverRec.CT[4696]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4696]==0&false))) {{
					//System.out.println("heritage");
					__CLOVER_209_0.cloverRec.S[18038]++;decl = creer_declare_var((Element) n);
					__CLOVER_209_0.cloverRec.S[18039]++;v_local.addElement(decl);
				}
				}else {__CLOVER_209_0.cloverRec.S[18040]++;if ((((n.getNodeName() == "instruction") && (++__CLOVER_209_0.cloverRec.CT[4697]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4697]==0&false))) {{
					//System.out.println("heritage");
					__CLOVER_209_0.cloverRec.S[18041]++;instr = creer_instruction((Element) n);
					//v.addElement(res);
				}
				}else {__CLOVER_209_0.cloverRec.S[18042]++;if ((((n.getNodeName() == "precondition") && (++__CLOVER_209_0.cloverRec.CT[4698]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4698]==0&false))) {{
					//System.out.println("heritage");
					__CLOVER_209_0.cloverRec.S[18043]++;precondition = creer_assert((Element) n);
					//v.addElement(res);
				}
				}else {__CLOVER_209_0.cloverRec.S[18044]++;if ((((n.getNodeName() == "postcondition") && (++__CLOVER_209_0.cloverRec.CT[4699]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4699]==0&false))) {{
					//System.out.println("heritage");
					__CLOVER_209_0.cloverRec.S[18045]++;postcondition = creer_assert((Element) n);
					//v.addElement(res);
				}
				}else {__CLOVER_209_0.cloverRec.S[18046]++;if ((((n.getNodeName() == "source") && (++__CLOVER_209_0.cloverRec.CT[4700]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4700]==0&false))) {{
					//System.out.println("source");
					__CLOVER_209_0.cloverRec.S[18047]++;source = creer_source((Element) n);
				}
				}else
					{assert((((false)) && (++__CLOVER_209_0.cloverRec.CT[4701]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4701]==0&false));
			}}}}}}}
			}else {__CLOVER_209_0.cloverRec.S[18048]++;if ((((n instanceof Comment) && (++__CLOVER_209_0.cloverRec.CT[4702]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4702]==0&false))) {{
				
			}
			}else {__CLOVER_209_0.cloverRec.S[18049]++;if ((((n instanceof Text) && (++__CLOVER_209_0.cloverRec.CT[4703]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4703]==0&false))) {{
				__CLOVER_209_0.cloverRec.S[18050]++;String s = n.getNodeValue();
				assert((((s == "" || s.matches("[ \t\n]+"))) && (++__CLOVER_209_0.cloverRec.CT[4704]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4704]==0&false));
			}
			}else
				{assert((((false)) && (++__CLOVER_209_0.cloverRec.CT[4705]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4705]==0&false));
		}}}}
		}__CLOVER_209_0.cloverRec.S[18051]++;if((((v_local.size()>0) && (++__CLOVER_209_0.cloverRec.CT[4706]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4706]==0&false)))
		{{
			//local=new Declare_Var[v_local.size()];
			//v_local.copyInto(local);
			__CLOVER_209_0.cloverRec.S[18052]++;local=new CIListe_Var();
			__CLOVER_209_0.cloverRec.S[18053]++;local.ajoute(v_local);
		}
		}__CLOVER_209_0.cloverRec.S[18054]++;res=new CIRoutine(classe,source);
		__CLOVER_209_0.cloverRec.S[18055]++;res.local=local;
		__CLOVER_209_0.cloverRec.S[18056]++;res.parametre=donne_parametre(signature);
		__CLOVER_209_0.cloverRec.S[18057]++;res.retour=donne_type_retour(signature);
		__CLOVER_209_0.cloverRec.S[18058]++;res.liste_instruction=instr;
		__CLOVER_209_0.cloverRec.S[18059]++;res.precondition=precondition;
		__CLOVER_209_0.cloverRec.S[18060]++;res.postcondition=postcondition;
		__CLOVER_209_0.cloverRec.S[18061]++;return res;
	}

	public CIAssertion creer_assert(Element element)
	{__CLOVER_209_0.cloverRec.M[1228]++;
		__CLOVER_209_0.cloverRec.S[18062]++;int no,i;
		__CLOVER_209_0.cloverRec.S[18063]++;CIAssertion res=null,ass;
		__CLOVER_209_0.cloverRec.S[18064]++;CIType type=null;
		__CLOVER_209_0.cloverRec.S[18065]++;Vector v,v_local;
		assert((((element!=null)) && (++__CLOVER_209_0.cloverRec.CT[4707]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4707]==0&false));
		assert((((element.getNodeName().equalsIgnoreCase("precondition")||
				element.getNodeName().equalsIgnoreCase("postcondition")||
				element.getNodeName().equalsIgnoreCase("invariant"))) && (++__CLOVER_209_0.cloverRec.CT[4708]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4708]==0&false));
		__CLOVER_209_0.cloverRec.S[18066]++;NodeList fils = element.getChildNodes();
		//assert(fils.getLength()>0);
		__CLOVER_209_0.cloverRec.S[18067]++;NamedNodeMap attributs = element.getAttributes();
		__CLOVER_209_0.cloverRec.S[18068]++;String nom="";
		__CLOVER_209_0.cloverRec.S[18069]++;CIDeclare_Var signature[]=null,local[]=null,decl;
		__CLOVER_209_0.cloverRec.S[18070]++;CIListe_Instr liste_instr=null;
		__CLOVER_209_0.cloverRec.S[18071]++;CISource source=null;

		__CLOVER_209_0.cloverRec.S[18072]++;v=new Vector();
		__CLOVER_209_0.cloverRec.S[18073]++;ass=new CIAssertion(null);
		__CLOVER_209_0.cloverRec.S[18074]++;for(i=0;(((i<fils.getLength()) && (++__CLOVER_209_0.cloverRec.CT[4709]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4709]==0&false));i++)
		{{
			__CLOVER_209_0.cloverRec.S[18075]++;Node n = fils.item(i);
			//System.out.println("element=" + n.getNodeName());
			__CLOVER_209_0.cloverRec.S[18076]++;if ((((n instanceof Element) && (++__CLOVER_209_0.cloverRec.CT[4710]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4710]==0&false))) {{
				__CLOVER_209_0.cloverRec.S[18077]++;if ((((n.getNodeName() == "declare_var") && (++__CLOVER_209_0.cloverRec.CT[4711]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4711]==0&false))) {{
					//System.out.println("heritage");
					__CLOVER_209_0.cloverRec.S[18078]++;decl=creer_declare_var((Element) n);
					assert((((decl!=null)) && (++__CLOVER_209_0.cloverRec.CT[4712]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4712]==0&false));
					__CLOVER_209_0.cloverRec.S[18079]++;ass.liste.ajoute(decl);
				}
				}else {__CLOVER_209_0.cloverRec.S[18080]++;if ((((n.getNodeName() == "instruction") && (++__CLOVER_209_0.cloverRec.CT[4713]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4713]==0&false))) {{
					assert((((liste_instr==null)) && (++__CLOVER_209_0.cloverRec.CT[4714]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4714]==0&false));
					__CLOVER_209_0.cloverRec.S[18081]++;liste_instr = creer_instruction((Element) n);
					//assert(liste_instr!=null);
				}
				}else {__CLOVER_209_0.cloverRec.S[18082]++;if ((((n.getNodeName() == "source") && (++__CLOVER_209_0.cloverRec.CT[4715]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4715]==0&false))) {{
					//System.out.println("source");
					__CLOVER_209_0.cloverRec.S[18083]++;source = creer_source((Element) n);
				}
				}else
					{assert((((false)) && (++__CLOVER_209_0.cloverRec.CT[4716]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4716]==0&false)):"n="+n.getNodeName();
			}}}}
			}else {__CLOVER_209_0.cloverRec.S[18084]++;if ((((n instanceof Comment) && (++__CLOVER_209_0.cloverRec.CT[4717]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4717]==0&false))) {{
				
			}
			}else {__CLOVER_209_0.cloverRec.S[18085]++;if ((((n instanceof Text) && (++__CLOVER_209_0.cloverRec.CT[4718]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4718]==0&false))) {{
				__CLOVER_209_0.cloverRec.S[18086]++;String s = n.getNodeValue();
				assert((((s == "" || s.matches("[ \t\n]+"))) && (++__CLOVER_209_0.cloverRec.CT[4719]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4719]==0&false));
			}
			}else
				{assert((((false)) && (++__CLOVER_209_0.cloverRec.CT[4720]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4720]==0&false));
		}}}}
		}__CLOVER_209_0.cloverRec.S[18087]++;ass.liste_instr=liste_instr;
		__CLOVER_209_0.cloverRec.S[18088]++;if((((ass.liste.size()!=0||ass.liste_instr!=null) && (++__CLOVER_209_0.cloverRec.CT[4721]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4721]==0&false)))
			{__CLOVER_209_0.cloverRec.S[18089]++;res=ass;
		}__CLOVER_209_0.cloverRec.S[18090]++;res.source=source;
		assert((((res!=null)) && (++__CLOVER_209_0.cloverRec.CT[4722]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4722]==0&false));
		__CLOVER_209_0.cloverRec.S[18091]++;return res;
	}
	
	public CIListe_Var donne_parametre(CIDeclare_Var sig[])
	{__CLOVER_209_0.cloverRec.M[1229]++;
		__CLOVER_209_0.cloverRec.S[18092]++;int i;
		__CLOVER_209_0.cloverRec.S[18093]++;CIDeclare_Var decl,liste[];
		__CLOVER_209_0.cloverRec.S[18094]++;Vector v;
		__CLOVER_209_0.cloverRec.S[18095]++;if((((sig==null) && (++__CLOVER_209_0.cloverRec.CT[4723]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4723]==0&false)))
			{__CLOVER_209_0.cloverRec.S[18096]++;return null;
		}__CLOVER_209_0.cloverRec.S[18097]++;v=new Vector();
		__CLOVER_209_0.cloverRec.S[18098]++;for(i=0;(((i<sig.length) && (++__CLOVER_209_0.cloverRec.CT[4724]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4724]==0&false));i++)
		{{
			__CLOVER_209_0.cloverRec.S[18099]++;if((((!sig[i].nom.equalsIgnoreCase("result")) && (++__CLOVER_209_0.cloverRec.CT[4725]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4725]==0&false)))
				{__CLOVER_209_0.cloverRec.S[18100]++;v.addElement(sig[i]);
		}}
		}__CLOVER_209_0.cloverRec.S[18101]++;if((((v.size()>0) && (++__CLOVER_209_0.cloverRec.CT[4726]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4726]==0&false)))
		{{
			__CLOVER_209_0.cloverRec.S[18102]++;CIListe_Var liste2;
			//liste=new Declare_Var[v.size()];
			//v.copyInto(liste);
			//return liste;
			__CLOVER_209_0.cloverRec.S[18103]++;liste2=new CIListe_Var();
			__CLOVER_209_0.cloverRec.S[18104]++;liste2.ajoute(v);
			__CLOVER_209_0.cloverRec.S[18105]++;return liste2;
		}
		}else
		{{
			__CLOVER_209_0.cloverRec.S[18106]++;return null;
		}
	}}

	public CIDeclare_Var donne_type_retour(CIDeclare_Var sig[])
	{__CLOVER_209_0.cloverRec.M[1230]++;
		__CLOVER_209_0.cloverRec.S[18107]++;int i;
		__CLOVER_209_0.cloverRec.S[18108]++;CIDeclare_Var decl,liste[];
		__CLOVER_209_0.cloverRec.S[18109]++;Vector v;
		__CLOVER_209_0.cloverRec.S[18110]++;if((((sig==null) && (++__CLOVER_209_0.cloverRec.CT[4727]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4727]==0&false)))
			{__CLOVER_209_0.cloverRec.S[18111]++;return null;
		}__CLOVER_209_0.cloverRec.S[18112]++;v=new Vector();
		__CLOVER_209_0.cloverRec.S[18113]++;for(i=0;(((i<sig.length) && (++__CLOVER_209_0.cloverRec.CT[4728]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4728]==0&false));i++)
		{{
			__CLOVER_209_0.cloverRec.S[18114]++;if((((sig[i].nom.equalsIgnoreCase("result")) && (++__CLOVER_209_0.cloverRec.CT[4729]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4729]==0&false)))
				{__CLOVER_209_0.cloverRec.S[18115]++;return sig[i];
		}}
		}__CLOVER_209_0.cloverRec.S[18116]++;return null;
	}

	public CIExpr creer_expr(Element element)
	{__CLOVER_209_0.cloverRec.M[1231]++;
		__CLOVER_209_0.cloverRec.S[18117]++;int no,i;
		__CLOVER_209_0.cloverRec.S[18118]++;CIExpr res=null;
		__CLOVER_209_0.cloverRec.S[18119]++;CIType type=null;
		__CLOVER_209_0.cloverRec.S[18120]++;Vector v,v_local;
		assert((((element!=null)) && (++__CLOVER_209_0.cloverRec.CT[4730]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4730]==0&false));
		assert((((element.getNodeName().equalsIgnoreCase("expression"))) && (++__CLOVER_209_0.cloverRec.CT[4731]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4731]==0&false));
		__CLOVER_209_0.cloverRec.S[18121]++;NodeList fils = element.getChildNodes();
		assert((((fils.getLength()>0)) && (++__CLOVER_209_0.cloverRec.CT[4732]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4732]==0&false));
		__CLOVER_209_0.cloverRec.S[18122]++;NamedNodeMap attributs = element.getAttributes();
		__CLOVER_209_0.cloverRec.S[18123]++;String nom="";
		__CLOVER_209_0.cloverRec.S[18124]++;CIDeclare_Var signature[]=null,local[]=null,decl;
		__CLOVER_209_0.cloverRec.S[18125]++;CISource source=null;

		__CLOVER_209_0.cloverRec.S[18126]++;v=new Vector();
		__CLOVER_209_0.cloverRec.S[18127]++;v_local=new Vector();
		__CLOVER_209_0.cloverRec.S[18128]++;for(i=0;(((i<fils.getLength()) && (++__CLOVER_209_0.cloverRec.CT[4733]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4733]==0&false));i++)
		{{
			__CLOVER_209_0.cloverRec.S[18129]++;Node n = fils.item(i);
			//System.out.println("element=" + n.getNodeName());
			__CLOVER_209_0.cloverRec.S[18130]++;if ((((n instanceof Element) && (++__CLOVER_209_0.cloverRec.CT[4734]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4734]==0&false))) {{
				__CLOVER_209_0.cloverRec.S[18131]++;if ((((n.getNodeName() == "expression_bin") && (++__CLOVER_209_0.cloverRec.CT[4735]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4735]==0&false))) {{
					//System.out.println("heritage");
					assert((((res==null)) && (++__CLOVER_209_0.cloverRec.CT[4736]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4736]==0&false));
					__CLOVER_209_0.cloverRec.S[18132]++;res=creer_expr_bin((Element) n);
					assert((((res!=null)) && (++__CLOVER_209_0.cloverRec.CT[4737]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4737]==0&false));
				}
				}else {__CLOVER_209_0.cloverRec.S[18133]++;if ((((n.getNodeName() == "expression_un") && (++__CLOVER_209_0.cloverRec.CT[4738]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4738]==0&false))) {{
					//System.out.println("heritage");
					assert((((res==null)) && (++__CLOVER_209_0.cloverRec.CT[4739]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4739]==0&false));
					__CLOVER_209_0.cloverRec.S[18134]++;res = creer_expr_un((Element) n);
					assert((((res!=null)) && (++__CLOVER_209_0.cloverRec.CT[4740]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4740]==0&false));
				}
				}else {__CLOVER_209_0.cloverRec.S[18135]++;if ((((n.getNodeName() == "expression_scalaire") && (++__CLOVER_209_0.cloverRec.CT[4741]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4741]==0&false))) {{
					//System.out.println("heritage");
					assert((((res==null)) && (++__CLOVER_209_0.cloverRec.CT[4742]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4742]==0&false));
					__CLOVER_209_0.cloverRec.S[18136]++;res = creer_expr_scalaire((Element) n);
					assert((((res!=null)) && (++__CLOVER_209_0.cloverRec.CT[4743]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4743]==0&false));
				}
				}else {__CLOVER_209_0.cloverRec.S[18137]++;if ((((n.getNodeName() == "var") && (++__CLOVER_209_0.cloverRec.CT[4744]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4744]==0&false))) {{
					//System.out.println("heritage");
					assert((((res==null)) && (++__CLOVER_209_0.cloverRec.CT[4745]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4745]==0&false));
					__CLOVER_209_0.cloverRec.S[18138]++;res = creer_expr_var((Element) n);
					assert((((res!=null)) && (++__CLOVER_209_0.cloverRec.CT[4746]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4746]==0&false));
				}
				}else {__CLOVER_209_0.cloverRec.S[18139]++;if ((((n.getNodeName() == "expr_appel") && (++__CLOVER_209_0.cloverRec.CT[4747]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4747]==0&false))) {{
					//System.out.println("heritage");
					assert((((res==null)) && (++__CLOVER_209_0.cloverRec.CT[4748]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4748]==0&false));
					__CLOVER_209_0.cloverRec.S[18140]++;res = creer_expr_appel((Element) n);
					assert((((res!=null)) && (++__CLOVER_209_0.cloverRec.CT[4749]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4749]==0&false));
				}
				}else {__CLOVER_209_0.cloverRec.S[18141]++;if ((((n.getNodeName() == "expression_type") && (++__CLOVER_209_0.cloverRec.CT[4750]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4750]==0&false))) {{
					//System.out.println("heritage");
					assert((((res==null)) && (++__CLOVER_209_0.cloverRec.CT[4751]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4751]==0&false));
					__CLOVER_209_0.cloverRec.S[18142]++;res = creer_expr_type((Element) n);
					assert((((res!=null)) && (++__CLOVER_209_0.cloverRec.CT[4752]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4752]==0&false));
				}
				}else {__CLOVER_209_0.cloverRec.S[18143]++;if ((((n.getNodeName() == "expression_creation") && (++__CLOVER_209_0.cloverRec.CT[4753]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4753]==0&false))) {{
					//System.out.println("heritage");
					assert((((res==null)) && (++__CLOVER_209_0.cloverRec.CT[4754]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4754]==0&false));
					__CLOVER_209_0.cloverRec.S[18144]++;res = creer_expr_creat((Element) n);
					assert((((res!=null)) && (++__CLOVER_209_0.cloverRec.CT[4755]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4755]==0&false));
				}
				}else
					{assert((((false)) && (++__CLOVER_209_0.cloverRec.CT[4756]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4756]==0&false)):"n="+n.getNodeName();
			}}}}}}}}
			}else {__CLOVER_209_0.cloverRec.S[18145]++;if ((((n instanceof Comment) && (++__CLOVER_209_0.cloverRec.CT[4757]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4757]==0&false))) {{
				
			}
			}else {__CLOVER_209_0.cloverRec.S[18146]++;if ((((n instanceof Text) && (++__CLOVER_209_0.cloverRec.CT[4758]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4758]==0&false))) {{
				__CLOVER_209_0.cloverRec.S[18147]++;String s = n.getNodeValue();
				assert((((s == "" || s.matches("[ \t\n]+"))) && (++__CLOVER_209_0.cloverRec.CT[4759]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4759]==0&false));
			}
			}else
				{assert((((false)) && (++__CLOVER_209_0.cloverRec.CT[4760]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4760]==0&false));
		}}}}
		}__CLOVER_209_0.cloverRec.S[18148]++;return res;
	}

	public CIExpr_Binaire creer_expr_bin(Element element)
	{__CLOVER_209_0.cloverRec.M[1232]++;
		__CLOVER_209_0.cloverRec.S[18149]++;int no,i,op=-1;
		__CLOVER_209_0.cloverRec.S[18150]++;CIExpr_Binaire res=null;
		__CLOVER_209_0.cloverRec.S[18151]++;CIType type=null;
		assert((((element!=null)) && (++__CLOVER_209_0.cloverRec.CT[4761]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4761]==0&false));
		assert((((element.getNodeName().equalsIgnoreCase("expression_bin"))) && (++__CLOVER_209_0.cloverRec.CT[4762]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4762]==0&false));
		__CLOVER_209_0.cloverRec.S[18152]++;NodeList fils = element.getChildNodes();
		assert((((fils.getLength()>0)) && (++__CLOVER_209_0.cloverRec.CT[4763]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4763]==0&false));
		__CLOVER_209_0.cloverRec.S[18153]++;NamedNodeMap attributs = element.getAttributes();
		__CLOVER_209_0.cloverRec.S[18154]++;String nom="";
		__CLOVER_209_0.cloverRec.S[18155]++;CIExpr_Scalaire expr1=null,expr2=null,e;
		__CLOVER_209_0.cloverRec.S[18156]++;CISource source=null;

		__CLOVER_209_0.cloverRec.S[18157]++;for (i = 0; (((i < attributs.getLength()) && (++__CLOVER_209_0.cloverRec.CT[4764]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4764]==0&false)); i++) {{
			__CLOVER_209_0.cloverRec.S[18158]++;Node num\u00e9ro = attributs.item(i);
			__CLOVER_209_0.cloverRec.S[18159]++;String nomAttribut = num\u00e9ro.getNodeName();
			__CLOVER_209_0.cloverRec.S[18160]++;String valeurAttribut = num\u00e9ro.getNodeValue();
			__CLOVER_209_0.cloverRec.S[18161]++;System.out.println(nomAttribut + " =\"" + valeurAttribut + "\"");
			__CLOVER_209_0.cloverRec.S[18162]++;if ((((nomAttribut == "type") && (++__CLOVER_209_0.cloverRec.CT[4765]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4765]==0&false)))
			{{
				__CLOVER_209_0.cloverRec.S[18163]++;if((((valeurAttribut.equalsIgnoreCase("plus")) && (++__CLOVER_209_0.cloverRec.CT[4766]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4766]==0&false)))
					{__CLOVER_209_0.cloverRec.S[18164]++;op=CIExpr_Binaire.Plus;
				}else {__CLOVER_209_0.cloverRec.S[18165]++;if((((valeurAttribut.equalsIgnoreCase("moins")) && (++__CLOVER_209_0.cloverRec.CT[4767]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4767]==0&false)))
					{__CLOVER_209_0.cloverRec.S[18166]++;op=CIExpr_Binaire.Moins;
				}else {__CLOVER_209_0.cloverRec.S[18167]++;if((((valeurAttribut.equalsIgnoreCase("fois")) && (++__CLOVER_209_0.cloverRec.CT[4768]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4768]==0&false)))
					{__CLOVER_209_0.cloverRec.S[18168]++;op=CIExpr_Binaire.Fois;
				}else {__CLOVER_209_0.cloverRec.S[18169]++;if((((valeurAttribut.equalsIgnoreCase("div_entier")) && (++__CLOVER_209_0.cloverRec.CT[4769]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4769]==0&false)))
					{__CLOVER_209_0.cloverRec.S[18170]++;op=CIExpr_Binaire.Div_entier;
				}else {__CLOVER_209_0.cloverRec.S[18171]++;if((((valeurAttribut.equalsIgnoreCase("div_reel")) && (++__CLOVER_209_0.cloverRec.CT[4770]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4770]==0&false)))
					{__CLOVER_209_0.cloverRec.S[18172]++;op=CIExpr_Binaire.Div_reel;
				}else {__CLOVER_209_0.cloverRec.S[18173]++;if((((valeurAttribut.equalsIgnoreCase("mod")) && (++__CLOVER_209_0.cloverRec.CT[4771]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4771]==0&false)))
					{__CLOVER_209_0.cloverRec.S[18174]++;op=CIExpr_Binaire.Mod;
				}else {__CLOVER_209_0.cloverRec.S[18175]++;if((((valeurAttribut.equalsIgnoreCase("and")) && (++__CLOVER_209_0.cloverRec.CT[4772]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4772]==0&false)))
					{__CLOVER_209_0.cloverRec.S[18176]++;op=CIExpr_Binaire.And;
				}else {__CLOVER_209_0.cloverRec.S[18177]++;if((((valeurAttribut.equalsIgnoreCase("or")) && (++__CLOVER_209_0.cloverRec.CT[4773]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4773]==0&false)))
					{__CLOVER_209_0.cloverRec.S[18178]++;op=CIExpr_Binaire.Or;
				}else {__CLOVER_209_0.cloverRec.S[18179]++;if((((valeurAttribut.equalsIgnoreCase("puiss")) && (++__CLOVER_209_0.cloverRec.CT[4774]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4774]==0&false)))
					{__CLOVER_209_0.cloverRec.S[18180]++;op=CIExpr_Binaire.Puiss;
				}else {__CLOVER_209_0.cloverRec.S[18181]++;if((((valeurAttribut.equalsIgnoreCase("sups")) && (++__CLOVER_209_0.cloverRec.CT[4775]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4775]==0&false)))
					{__CLOVER_209_0.cloverRec.S[18182]++;op=CIExpr_Binaire.SupS;
				}else {__CLOVER_209_0.cloverRec.S[18183]++;if((((valeurAttribut.equalsIgnoreCase("sup")) && (++__CLOVER_209_0.cloverRec.CT[4776]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4776]==0&false)))
					{__CLOVER_209_0.cloverRec.S[18184]++;op=CIExpr_Binaire.Sup;
				}else {__CLOVER_209_0.cloverRec.S[18185]++;if((((valeurAttribut.equalsIgnoreCase("infs")) && (++__CLOVER_209_0.cloverRec.CT[4777]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4777]==0&false)))
					{__CLOVER_209_0.cloverRec.S[18186]++;op=CIExpr_Binaire.InfS;
				}else {__CLOVER_209_0.cloverRec.S[18187]++;if((((valeurAttribut.equalsIgnoreCase("inf")) && (++__CLOVER_209_0.cloverRec.CT[4778]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4778]==0&false)))
					{__CLOVER_209_0.cloverRec.S[18188]++;op=CIExpr_Binaire.Inf;
				}else {__CLOVER_209_0.cloverRec.S[18189]++;if((((valeurAttribut.equalsIgnoreCase("egal")) && (++__CLOVER_209_0.cloverRec.CT[4779]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4779]==0&false)))
					{__CLOVER_209_0.cloverRec.S[18190]++;op=CIExpr_Binaire.Egal;
				}else {__CLOVER_209_0.cloverRec.S[18191]++;if((((valeurAttribut.equalsIgnoreCase("diff")) && (++__CLOVER_209_0.cloverRec.CT[4780]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4780]==0&false)))
					{__CLOVER_209_0.cloverRec.S[18192]++;op=CIExpr_Binaire.Diff;
				}else {__CLOVER_209_0.cloverRec.S[18193]++;if((((valeurAttribut.equalsIgnoreCase("and_then")) && (++__CLOVER_209_0.cloverRec.CT[4781]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4781]==0&false)))
					{__CLOVER_209_0.cloverRec.S[18194]++;op=CIExpr_Binaire.And_Then;
				}else {__CLOVER_209_0.cloverRec.S[18195]++;if((((valeurAttribut.equalsIgnoreCase("or_else")) && (++__CLOVER_209_0.cloverRec.CT[4782]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4782]==0&false)))
					{__CLOVER_209_0.cloverRec.S[18196]++;op=CIExpr_Binaire.Or_Else;
				}else {__CLOVER_209_0.cloverRec.S[18197]++;if((((valeurAttribut.equalsIgnoreCase("xor")) && (++__CLOVER_209_0.cloverRec.CT[4783]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4783]==0&false)))
					{__CLOVER_209_0.cloverRec.S[18198]++;op=CIExpr_Binaire.Xor;
				}else {__CLOVER_209_0.cloverRec.S[18199]++;if((((valeurAttribut.equalsIgnoreCase("implies")) && (++__CLOVER_209_0.cloverRec.CT[4784]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4784]==0&false)))
					{__CLOVER_209_0.cloverRec.S[18200]++;op=CIExpr_Binaire.Implies;
				}else
					{assert((((false)) && (++__CLOVER_209_0.cloverRec.CT[4785]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4785]==0&false));
			}}}}}}}}}}}}}}}}}}}}
			}else
				{assert((((false)) && (++__CLOVER_209_0.cloverRec.CT[4786]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4786]==0&false));
		}}
		}assert((((nom!=null)) && (++__CLOVER_209_0.cloverRec.CT[4787]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4787]==0&false));
		__CLOVER_209_0.cloverRec.S[18201]++;for(i=0;(((i<fils.getLength()) && (++__CLOVER_209_0.cloverRec.CT[4788]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4788]==0&false));i++)
		{{
			__CLOVER_209_0.cloverRec.S[18202]++;Node n = fils.item(i);
			//System.out.println("element=" + n.getNodeName());
			__CLOVER_209_0.cloverRec.S[18203]++;if ((((n instanceof Element) && (++__CLOVER_209_0.cloverRec.CT[4789]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4789]==0&false))) {{
				__CLOVER_209_0.cloverRec.S[18204]++;if ((((n.getNodeName() == "expression_scalaire") && (++__CLOVER_209_0.cloverRec.CT[4790]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4790]==0&false))) {{
					//System.out.println("heritage");
					__CLOVER_209_0.cloverRec.S[18205]++;e=creer_expr_scalaire((Element) n);
					__CLOVER_209_0.cloverRec.S[18206]++;if((((expr1==null) && (++__CLOVER_209_0.cloverRec.CT[4791]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4791]==0&false)))
						{__CLOVER_209_0.cloverRec.S[18207]++;expr1=e;
					}else
						{__CLOVER_209_0.cloverRec.S[18208]++;expr2=e;
				}}
				}else {__CLOVER_209_0.cloverRec.S[18209]++;if ((((n.getNodeName() == "source") && (++__CLOVER_209_0.cloverRec.CT[4792]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4792]==0&false))) {{
					//System.out.println("source");
					__CLOVER_209_0.cloverRec.S[18210]++;source = creer_source((Element) n);
				}
				}else
					{assert((((false)) && (++__CLOVER_209_0.cloverRec.CT[4793]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4793]==0&false));
			}}}
			}else {__CLOVER_209_0.cloverRec.S[18211]++;if ((((n instanceof Comment) && (++__CLOVER_209_0.cloverRec.CT[4794]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4794]==0&false))) {{
				
			}
			}else {__CLOVER_209_0.cloverRec.S[18212]++;if ((((n instanceof Text) && (++__CLOVER_209_0.cloverRec.CT[4795]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4795]==0&false))) {{
				__CLOVER_209_0.cloverRec.S[18213]++;String s = n.getNodeValue();
				assert((((s == "" || s.matches("[ \t\n]+"))) && (++__CLOVER_209_0.cloverRec.CT[4796]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4796]==0&false));
			}
			}else
				{assert((((false)) && (++__CLOVER_209_0.cloverRec.CT[4797]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4797]==0&false));
		}}}}
		}assert((((expr1!=null)) && (++__CLOVER_209_0.cloverRec.CT[4798]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4798]==0&false));
		assert((((expr2!=null)) && (++__CLOVER_209_0.cloverRec.CT[4799]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4799]==0&false));
		assert((((op!=-1)) && (++__CLOVER_209_0.cloverRec.CT[4800]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4800]==0&false));
		__CLOVER_209_0.cloverRec.S[18214]++;res=new CIExpr_Binaire(op,expr1,expr2,source);
		__CLOVER_209_0.cloverRec.S[18215]++;return res;
	}

	public CIExpr_Unaire creer_expr_un(Element element)
	{__CLOVER_209_0.cloverRec.M[1233]++;
		__CLOVER_209_0.cloverRec.S[18216]++;int no,i,op=-1;
		__CLOVER_209_0.cloverRec.S[18217]++;CIExpr_Unaire res=null;
		__CLOVER_209_0.cloverRec.S[18218]++;CIType type=null;
		assert((((element!=null)) && (++__CLOVER_209_0.cloverRec.CT[4801]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4801]==0&false));
		assert((((element.getNodeName().equalsIgnoreCase("expression_un"))) && (++__CLOVER_209_0.cloverRec.CT[4802]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4802]==0&false));
		__CLOVER_209_0.cloverRec.S[18219]++;NodeList fils = element.getChildNodes();
		assert((((fils.getLength()>0)) && (++__CLOVER_209_0.cloverRec.CT[4803]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4803]==0&false));
		__CLOVER_209_0.cloverRec.S[18220]++;NamedNodeMap attributs = element.getAttributes();
		__CLOVER_209_0.cloverRec.S[18221]++;String nom="";
		__CLOVER_209_0.cloverRec.S[18222]++;CIExpr_Scalaire expr1=null;
		__CLOVER_209_0.cloverRec.S[18223]++;CISource source=null;

		__CLOVER_209_0.cloverRec.S[18224]++;for (i = 0; (((i < attributs.getLength()) && (++__CLOVER_209_0.cloverRec.CT[4804]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4804]==0&false)); i++) {{
			__CLOVER_209_0.cloverRec.S[18225]++;Node num\u00e9ro = attributs.item(i);
			__CLOVER_209_0.cloverRec.S[18226]++;String nomAttribut = num\u00e9ro.getNodeName();
			__CLOVER_209_0.cloverRec.S[18227]++;String valeurAttribut = num\u00e9ro.getNodeValue();
			__CLOVER_209_0.cloverRec.S[18228]++;System.out.println(nomAttribut + " =\"" + valeurAttribut + "\"");
			__CLOVER_209_0.cloverRec.S[18229]++;if ((((nomAttribut == "type") && (++__CLOVER_209_0.cloverRec.CT[4805]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4805]==0&false)))
			{{
				__CLOVER_209_0.cloverRec.S[18230]++;if((((valeurAttribut.equalsIgnoreCase("plus")) && (++__CLOVER_209_0.cloverRec.CT[4806]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4806]==0&false)))
					{__CLOVER_209_0.cloverRec.S[18231]++;op=CIExpr_Unaire.Plus;
				}else {__CLOVER_209_0.cloverRec.S[18232]++;if((((valeurAttribut.equalsIgnoreCase("moins")) && (++__CLOVER_209_0.cloverRec.CT[4807]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4807]==0&false)))
					{__CLOVER_209_0.cloverRec.S[18233]++;op=CIExpr_Unaire.Moins;
				}else {__CLOVER_209_0.cloverRec.S[18234]++;if((((valeurAttribut.equalsIgnoreCase("not")) && (++__CLOVER_209_0.cloverRec.CT[4808]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4808]==0&false)))
					{__CLOVER_209_0.cloverRec.S[18235]++;op=CIExpr_Unaire.Not;
				}else {__CLOVER_209_0.cloverRec.S[18236]++;if((((valeurAttribut.equalsIgnoreCase("old")) && (++__CLOVER_209_0.cloverRec.CT[4809]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4809]==0&false)))
					{__CLOVER_209_0.cloverRec.S[18237]++;op=CIExpr_Unaire.Old;
				}else {__CLOVER_209_0.cloverRec.S[18238]++;if((((valeurAttribut.equalsIgnoreCase("conv_e2d")) && (++__CLOVER_209_0.cloverRec.CT[4810]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4810]==0&false)))
					{__CLOVER_209_0.cloverRec.S[18239]++;op=CIExpr_Unaire.Conv_E2D;
				}else {__CLOVER_209_0.cloverRec.S[18240]++;if((((valeurAttribut.equalsIgnoreCase("conv_e2r")) && (++__CLOVER_209_0.cloverRec.CT[4811]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4811]==0&false)))
					{__CLOVER_209_0.cloverRec.S[18241]++;op=CIExpr_Unaire.Conv_E2R;
				}else {__CLOVER_209_0.cloverRec.S[18242]++;if((((valeurAttribut.equalsIgnoreCase("conv_r2d")) && (++__CLOVER_209_0.cloverRec.CT[4812]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4812]==0&false)))
					{__CLOVER_209_0.cloverRec.S[18243]++;op=CIExpr_Unaire.Conv_R2D;
				}else
					{assert((((false)) && (++__CLOVER_209_0.cloverRec.CT[4813]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4813]==0&false));
			}}}}}}}}
			}else
				{assert((((false)) && (++__CLOVER_209_0.cloverRec.CT[4814]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4814]==0&false));
		}}
		}assert((((nom!=null)) && (++__CLOVER_209_0.cloverRec.CT[4815]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4815]==0&false));
		__CLOVER_209_0.cloverRec.S[18244]++;for(i=0;(((i<fils.getLength()) && (++__CLOVER_209_0.cloverRec.CT[4816]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4816]==0&false));i++)
		{{
			__CLOVER_209_0.cloverRec.S[18245]++;Node n = fils.item(i);
			//System.out.println("element=" + n.getNodeName());
			__CLOVER_209_0.cloverRec.S[18246]++;if ((((n instanceof Element) && (++__CLOVER_209_0.cloverRec.CT[4817]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4817]==0&false))) {{
				__CLOVER_209_0.cloverRec.S[18247]++;if ((((n.getNodeName() == "expression_scalaire") && (++__CLOVER_209_0.cloverRec.CT[4818]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4818]==0&false))) {{
					//System.out.println("heritage");
					assert((((expr1==null)) && (++__CLOVER_209_0.cloverRec.CT[4819]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4819]==0&false));
					__CLOVER_209_0.cloverRec.S[18248]++;expr1=creer_expr_scalaire((Element) n);
				}
				}else {__CLOVER_209_0.cloverRec.S[18249]++;if ((((n.getNodeName() == "source") && (++__CLOVER_209_0.cloverRec.CT[4820]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4820]==0&false))) {{
					//System.out.println("source");
					__CLOVER_209_0.cloverRec.S[18250]++;source = creer_source((Element) n);
				}
				}else
					{assert((((false)) && (++__CLOVER_209_0.cloverRec.CT[4821]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4821]==0&false));
			}}}
			}else {__CLOVER_209_0.cloverRec.S[18251]++;if ((((n instanceof Comment) && (++__CLOVER_209_0.cloverRec.CT[4822]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4822]==0&false))) {{
				
			}
			}else {__CLOVER_209_0.cloverRec.S[18252]++;if ((((n instanceof Text) && (++__CLOVER_209_0.cloverRec.CT[4823]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4823]==0&false))) {{
				__CLOVER_209_0.cloverRec.S[18253]++;String s = n.getNodeValue();
				assert((((s == "" || s.matches("[ \t\n]+"))) && (++__CLOVER_209_0.cloverRec.CT[4824]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4824]==0&false));
			}
			}else
				{assert((((false)) && (++__CLOVER_209_0.cloverRec.CT[4825]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4825]==0&false));
		}}}}
		}assert((((expr1!=null)) && (++__CLOVER_209_0.cloverRec.CT[4826]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4826]==0&false));
		assert((((op!=-1)) && (++__CLOVER_209_0.cloverRec.CT[4827]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4827]==0&false));
		__CLOVER_209_0.cloverRec.S[18254]++;res=new CIExpr_Unaire(op,expr1,source);
		__CLOVER_209_0.cloverRec.S[18255]++;return res;
	}

	public CIExpr_Var creer_expr_var(Element element)
	{__CLOVER_209_0.cloverRec.M[1234]++;
		__CLOVER_209_0.cloverRec.S[18256]++;int no,i,op;
		__CLOVER_209_0.cloverRec.S[18257]++;CIExpr_Var res=null;
		__CLOVER_209_0.cloverRec.S[18258]++;CIType type=null;
		assert((((element!=null)) && (++__CLOVER_209_0.cloverRec.CT[4828]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4828]==0&false));
		assert((((element.getNodeName().equalsIgnoreCase("var"))) && (++__CLOVER_209_0.cloverRec.CT[4829]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4829]==0&false));
		__CLOVER_209_0.cloverRec.S[18259]++;NodeList fils = element.getChildNodes();
		//assert(fils.getLength()>0);
		__CLOVER_209_0.cloverRec.S[18260]++;NamedNodeMap attributs = element.getAttributes();
		__CLOVER_209_0.cloverRec.S[18261]++;String nom="",src=null;
		__CLOVER_209_0.cloverRec.S[18262]++;CIExpr_Scalaire expr1=null;
		__CLOVER_209_0.cloverRec.S[18263]++;CISource source=null;

		__CLOVER_209_0.cloverRec.S[18264]++;for (i = 0; (((i < attributs.getLength()) && (++__CLOVER_209_0.cloverRec.CT[4830]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4830]==0&false)); i++) {{
			__CLOVER_209_0.cloverRec.S[18265]++;Node num\u00e9ro = attributs.item(i);
			__CLOVER_209_0.cloverRec.S[18266]++;String nomAttribut = num\u00e9ro.getNodeName();
			__CLOVER_209_0.cloverRec.S[18267]++;String valeurAttribut = num\u00e9ro.getNodeValue();
			__CLOVER_209_0.cloverRec.S[18268]++;System.out.println(nomAttribut + " =\"" + valeurAttribut + "\"");
			__CLOVER_209_0.cloverRec.S[18269]++;if ((((nomAttribut == "nom") && (++__CLOVER_209_0.cloverRec.CT[4831]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4831]==0&false)))
				{__CLOVER_209_0.cloverRec.S[18270]++;nom=valeurAttribut;
			}else {__CLOVER_209_0.cloverRec.S[18271]++;if ((((nomAttribut == "src") && (++__CLOVER_209_0.cloverRec.CT[4832]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4832]==0&false)))
				{__CLOVER_209_0.cloverRec.S[18272]++;src=valeurAttribut;
			}else
				{assert((((false)) && (++__CLOVER_209_0.cloverRec.CT[4833]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4833]==0&false));
		}}}
		}assert((((nom!=null)) && (++__CLOVER_209_0.cloverRec.CT[4834]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4834]==0&false));
		__CLOVER_209_0.cloverRec.S[18273]++;for(i=0;(((i<fils.getLength()) && (++__CLOVER_209_0.cloverRec.CT[4835]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4835]==0&false));i++)
		{{
			__CLOVER_209_0.cloverRec.S[18274]++;Node n = fils.item(i);
			//System.out.println("element=" + n.getNodeName());
			__CLOVER_209_0.cloverRec.S[18275]++;if ((((n instanceof Element) && (++__CLOVER_209_0.cloverRec.CT[4836]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4836]==0&false))) {{
				__CLOVER_209_0.cloverRec.S[18276]++;if ((((n.getNodeName() == "expression_scalaire") && (++__CLOVER_209_0.cloverRec.CT[4837]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4837]==0&false))) {{
					//System.out.println("heritage");
					assert((((expr1==null)) && (++__CLOVER_209_0.cloverRec.CT[4838]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4838]==0&false));
					__CLOVER_209_0.cloverRec.S[18277]++;expr1=creer_expr_scalaire((Element) n);
				}
				}else {__CLOVER_209_0.cloverRec.S[18278]++;if ((((n.getNodeName() == "source") && (++__CLOVER_209_0.cloverRec.CT[4839]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4839]==0&false))) {{
					//System.out.println("source");
					__CLOVER_209_0.cloverRec.S[18279]++;source = creer_source((Element) n);
				}
				}else
					{assert((((false)) && (++__CLOVER_209_0.cloverRec.CT[4840]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4840]==0&false));
			}}}
			}else {__CLOVER_209_0.cloverRec.S[18280]++;if ((((n instanceof Comment) && (++__CLOVER_209_0.cloverRec.CT[4841]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4841]==0&false))) {{
				
			}
			}else {__CLOVER_209_0.cloverRec.S[18281]++;if ((((n instanceof Text) && (++__CLOVER_209_0.cloverRec.CT[4842]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4842]==0&false))) {{
				__CLOVER_209_0.cloverRec.S[18282]++;String s = n.getNodeValue();
				assert((((s == "" || s.matches("[ \t\n]+"))) && (++__CLOVER_209_0.cloverRec.CT[4843]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4843]==0&false));
			}
			}else
				{assert((((false)) && (++__CLOVER_209_0.cloverRec.CT[4844]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4844]==0&false));
		}}}}
		}__CLOVER_209_0.cloverRec.S[18283]++;if((((expr1!=null) && (++__CLOVER_209_0.cloverRec.CT[4845]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4845]==0&false)))
			{__CLOVER_209_0.cloverRec.S[18284]++;res=new CIExpr_Var(nom,expr1,source);
		}else
			{__CLOVER_209_0.cloverRec.S[18285]++;res=new CIExpr_Var(nom,source);
		}__CLOVER_209_0.cloverRec.S[18286]++;if((((src!=null) && (++__CLOVER_209_0.cloverRec.CT[4846]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4846]==0&false)))
			{__CLOVER_209_0.cloverRec.S[18287]++;res.set_src(src);
		}__CLOVER_209_0.cloverRec.S[18288]++;return res;
	}

	public CIExpr_Var_Syst creer_expr_var_syst(Element element)
	{__CLOVER_209_0.cloverRec.M[1235]++;//&\u00e9"'(-\u00e8_
		__CLOVER_209_0.cloverRec.S[18289]++;int no,i,op;
		__CLOVER_209_0.cloverRec.S[18290]++;CIExpr_Var_Syst res=null;
		__CLOVER_209_0.cloverRec.S[18291]++;CIType type=null;
		assert((((element!=null)) && (++__CLOVER_209_0.cloverRec.CT[4847]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4847]==0&false));
		assert((((element.getNodeName().equalsIgnoreCase("expr_var_syst"))) && (++__CLOVER_209_0.cloverRec.CT[4848]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4848]==0&false));
		__CLOVER_209_0.cloverRec.S[18292]++;NodeList fils = element.getChildNodes();
		//assert(fils.getLength()>0);
		__CLOVER_209_0.cloverRec.S[18293]++;NamedNodeMap attributs = element.getAttributes();
		__CLOVER_209_0.cloverRec.S[18294]++;String nom="";
		__CLOVER_209_0.cloverRec.S[18295]++;CIExpr_Scalaire expr1=null,param[];
		__CLOVER_209_0.cloverRec.S[18296]++;Vector liste_param=new Vector();
		__CLOVER_209_0.cloverRec.S[18297]++;CISource source=null;

		__CLOVER_209_0.cloverRec.S[18298]++;for (i = 0; (((i < attributs.getLength()) && (++__CLOVER_209_0.cloverRec.CT[4849]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4849]==0&false)); i++) {{
			__CLOVER_209_0.cloverRec.S[18299]++;Node num\u00e9ro = attributs.item(i);
			__CLOVER_209_0.cloverRec.S[18300]++;String nomAttribut = num\u00e9ro.getNodeName();
			__CLOVER_209_0.cloverRec.S[18301]++;String valeurAttribut = num\u00e9ro.getNodeValue();
			__CLOVER_209_0.cloverRec.S[18302]++;System.out.println(nomAttribut + " =\"" + valeurAttribut + "\"");
			__CLOVER_209_0.cloverRec.S[18303]++;if ((((nomAttribut == "nom") && (++__CLOVER_209_0.cloverRec.CT[4850]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4850]==0&false)))
				{__CLOVER_209_0.cloverRec.S[18304]++;nom=valeurAttribut;
			}else
				{assert((((false)) && (++__CLOVER_209_0.cloverRec.CT[4851]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4851]==0&false));
		}}
		}assert((((nom!=null)) && (++__CLOVER_209_0.cloverRec.CT[4852]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4852]==0&false));
		assert((((nom.compareTo("")!=0)) && (++__CLOVER_209_0.cloverRec.CT[4853]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4853]==0&false));
		__CLOVER_209_0.cloverRec.S[18305]++;for(i=0;(((i<fils.getLength()) && (++__CLOVER_209_0.cloverRec.CT[4854]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4854]==0&false));i++)
		{{
			__CLOVER_209_0.cloverRec.S[18306]++;Node n = fils.item(i);
			//System.out.println("element=" + n.getNodeName());
			__CLOVER_209_0.cloverRec.S[18307]++;if ((((n instanceof Element) && (++__CLOVER_209_0.cloverRec.CT[4855]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4855]==0&false))) {{
				__CLOVER_209_0.cloverRec.S[18308]++;if ((((n.getNodeName() == "expression_scalaire") && (++__CLOVER_209_0.cloverRec.CT[4856]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4856]==0&false))) {{
					//System.out.println("heritage");
					//assert(expr1==null);
					__CLOVER_209_0.cloverRec.S[18309]++;expr1=creer_expr_scalaire((Element) n);
					__CLOVER_209_0.cloverRec.S[18310]++;liste_param.addElement(expr1);
				}
				}else {__CLOVER_209_0.cloverRec.S[18311]++;if ((((n.getNodeName() == "source") && (++__CLOVER_209_0.cloverRec.CT[4857]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4857]==0&false))) {{
					//System.out.println("source");
					__CLOVER_209_0.cloverRec.S[18312]++;source = creer_source((Element) n);
				}
				}else
					{assert((((false)) && (++__CLOVER_209_0.cloverRec.CT[4858]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4858]==0&false));
			}}}
			}else {__CLOVER_209_0.cloverRec.S[18313]++;if ((((n instanceof Comment) && (++__CLOVER_209_0.cloverRec.CT[4859]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4859]==0&false))) {{
				
			}
			}else {__CLOVER_209_0.cloverRec.S[18314]++;if ((((n instanceof Text) && (++__CLOVER_209_0.cloverRec.CT[4860]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4860]==0&false))) {{
				__CLOVER_209_0.cloverRec.S[18315]++;String s = n.getNodeValue();
				assert((((s == "" || s.matches("[ \t\n]+"))) && (++__CLOVER_209_0.cloverRec.CT[4861]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4861]==0&false));
			}
			}else
				{assert((((false)) && (++__CLOVER_209_0.cloverRec.CT[4862]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4862]==0&false));
		}}}}
		/*if(expr1!=null)
			res=new Expr_Var(nom,expr1);
		else
			res=new Expr_Var(nom);*/
		}__CLOVER_209_0.cloverRec.S[18316]++;if((((liste_param==null||liste_param.size()==0) && (++__CLOVER_209_0.cloverRec.CT[4863]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4863]==0&false)))
		{{
			__CLOVER_209_0.cloverRec.S[18317]++;param=null;
		}
		}else
		{{
			__CLOVER_209_0.cloverRec.S[18318]++;param=new CIExpr_Scalaire[liste_param.size()];
			__CLOVER_209_0.cloverRec.S[18319]++;liste_param.copyInto(param);
		}
		}__CLOVER_209_0.cloverRec.S[18320]++;res=new CIExpr_Var_Syst(nom,param,source);
		__CLOVER_209_0.cloverRec.S[18321]++;return res;
	}

	public CIExpr_Type creer_expr_type(Element element)
	{__CLOVER_209_0.cloverRec.M[1236]++;
		__CLOVER_209_0.cloverRec.S[18322]++;int no,i,op;
		__CLOVER_209_0.cloverRec.S[18323]++;CIExpr_Type res=null;
		__CLOVER_209_0.cloverRec.S[18324]++;CIType type=null;
		assert((((element!=null)) && (++__CLOVER_209_0.cloverRec.CT[4864]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4864]==0&false));
		assert((((element.getNodeName().equalsIgnoreCase("expression_type"))) && (++__CLOVER_209_0.cloverRec.CT[4865]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4865]==0&false));
		__CLOVER_209_0.cloverRec.S[18325]++;NodeList fils = element.getChildNodes();
		assert((((fils.getLength()>0)) && (++__CLOVER_209_0.cloverRec.CT[4866]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4866]==0&false));
		__CLOVER_209_0.cloverRec.S[18326]++;NamedNodeMap attributs = element.getAttributes();
		__CLOVER_209_0.cloverRec.S[18327]++;String nom="";
		__CLOVER_209_0.cloverRec.S[18328]++;CIExpr_Var var=null;
		__CLOVER_209_0.cloverRec.S[18329]++;CISource source=null;

		assert((((nom!=null)) && (++__CLOVER_209_0.cloverRec.CT[4867]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4867]==0&false));
		__CLOVER_209_0.cloverRec.S[18330]++;for(i=0;(((i<fils.getLength()) && (++__CLOVER_209_0.cloverRec.CT[4868]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4868]==0&false));i++)
		{{
			__CLOVER_209_0.cloverRec.S[18331]++;Node n = fils.item(i);
			//System.out.println("element=" + n.getNodeName());
			__CLOVER_209_0.cloverRec.S[18332]++;if ((((n instanceof Element) && (++__CLOVER_209_0.cloverRec.CT[4869]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4869]==0&false))) {{
				__CLOVER_209_0.cloverRec.S[18333]++;if ((((n.getNodeName() == "var") && (++__CLOVER_209_0.cloverRec.CT[4870]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4870]==0&false))) {{
					//System.out.println("heritage");
					assert((((var==null)) && (++__CLOVER_209_0.cloverRec.CT[4871]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4871]==0&false));
					__CLOVER_209_0.cloverRec.S[18334]++;var=creer_expr_var((Element) n);
					assert((((var!=null)) && (++__CLOVER_209_0.cloverRec.CT[4872]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4872]==0&false));
				}
				}else {__CLOVER_209_0.cloverRec.S[18335]++;if ((((n.getNodeName() == "type") && (++__CLOVER_209_0.cloverRec.CT[4873]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4873]==0&false))) {{
					//System.out.println("heritage");
					assert((((type==null)) && (++__CLOVER_209_0.cloverRec.CT[4874]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4874]==0&false));
					__CLOVER_209_0.cloverRec.S[18336]++;type=creer_type((Element) n);
					assert((((type!=null)) && (++__CLOVER_209_0.cloverRec.CT[4875]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4875]==0&false));
				}
				}else {__CLOVER_209_0.cloverRec.S[18337]++;if ((((n.getNodeName() == "expression_scalaire") && (++__CLOVER_209_0.cloverRec.CT[4876]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4876]==0&false))) {{
					//System.out.println("heritage");
					assert((((var==null)) && (++__CLOVER_209_0.cloverRec.CT[4877]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4877]==0&false));
					__CLOVER_209_0.cloverRec.S[18338]++;CIExpr_Scalaire es;
					__CLOVER_209_0.cloverRec.S[18339]++;es=creer_expr_scalaire((Element) n);
					assert((((es!=null)) && (++__CLOVER_209_0.cloverRec.CT[4878]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4878]==0&false));
					assert((((es instanceof CIExpr_Var)) && (++__CLOVER_209_0.cloverRec.CT[4879]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4879]==0&false));
					__CLOVER_209_0.cloverRec.S[18340]++;var=(CIExpr_Var)es;
				}
				}else {__CLOVER_209_0.cloverRec.S[18341]++;if ((((n.getNodeName() == "source") && (++__CLOVER_209_0.cloverRec.CT[4880]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4880]==0&false))) {{
					//System.out.println("source");
					__CLOVER_209_0.cloverRec.S[18342]++;source = creer_source((Element) n);
				}
				}else
					{assert((((false)) && (++__CLOVER_209_0.cloverRec.CT[4881]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4881]==0&false)):"n="+n.getNodeName();
			}}}}}
			}else {__CLOVER_209_0.cloverRec.S[18343]++;if ((((n instanceof Comment) && (++__CLOVER_209_0.cloverRec.CT[4882]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4882]==0&false))) {{
				
			}
			}else {__CLOVER_209_0.cloverRec.S[18344]++;if ((((n instanceof Text) && (++__CLOVER_209_0.cloverRec.CT[4883]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4883]==0&false))) {{
				__CLOVER_209_0.cloverRec.S[18345]++;String s = n.getNodeValue();
				assert((((s == "" || s.matches("[ \t\n]+"))) && (++__CLOVER_209_0.cloverRec.CT[4884]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4884]==0&false));
			}
			}else
				{assert((((false)) && (++__CLOVER_209_0.cloverRec.CT[4885]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4885]==0&false));
		}}}}
		}assert((((type!=null)) && (++__CLOVER_209_0.cloverRec.CT[4886]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4886]==0&false));
		assert((((nom!=null)) && (++__CLOVER_209_0.cloverRec.CT[4887]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4887]==0&false));
		__CLOVER_209_0.cloverRec.S[18346]++;res=new CIExpr_Type(var,type,source);
		__CLOVER_209_0.cloverRec.S[18347]++;return res;
	}

	public CIExpr_Appel creer_expr_appel(Element element)
	{__CLOVER_209_0.cloverRec.M[1237]++;
		__CLOVER_209_0.cloverRec.S[18348]++;int no,i,op;
		__CLOVER_209_0.cloverRec.S[18349]++;CIExpr_Appel res=null;
		__CLOVER_209_0.cloverRec.S[18350]++;CIType type=null;
		assert((((element!=null)) && (++__CLOVER_209_0.cloverRec.CT[4888]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4888]==0&false));
		assert((((element.getNodeName().equalsIgnoreCase("expr_appel"))) && (++__CLOVER_209_0.cloverRec.CT[4889]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4889]==0&false));
		__CLOVER_209_0.cloverRec.S[18351]++;NodeList fils = element.getChildNodes();
		assert((((fils.getLength()>0)) && (++__CLOVER_209_0.cloverRec.CT[4890]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4890]==0&false));
		__CLOVER_209_0.cloverRec.S[18352]++;NamedNodeMap attributs = element.getAttributes();
		__CLOVER_209_0.cloverRec.S[18353]++;CINom_Attribut nom=null;
		__CLOVER_209_0.cloverRec.S[18354]++;CIExpr_Var var=null;
		__CLOVER_209_0.cloverRec.S[18355]++;CIExpr_Scalaire expr,param[];
		__CLOVER_209_0.cloverRec.S[18356]++;Vector v;
		__CLOVER_209_0.cloverRec.S[18357]++;CISource source=null;

		__CLOVER_209_0.cloverRec.S[18358]++;v=new Vector();
		__CLOVER_209_0.cloverRec.S[18359]++;for(i=0;(((i<fils.getLength()) && (++__CLOVER_209_0.cloverRec.CT[4891]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4891]==0&false));i++)
		{{
			__CLOVER_209_0.cloverRec.S[18360]++;Node n = fils.item(i);
			//System.out.println("element=" + n.getNodeName());
			__CLOVER_209_0.cloverRec.S[18361]++;if ((((n instanceof Element) && (++__CLOVER_209_0.cloverRec.CT[4892]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4892]==0&false))) {{
				__CLOVER_209_0.cloverRec.S[18362]++;if ((((n.getNodeName() == "var") && (++__CLOVER_209_0.cloverRec.CT[4893]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4893]==0&false))) {{
					//System.out.println("heritage");
					assert((((var==null)) && (++__CLOVER_209_0.cloverRec.CT[4894]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4894]==0&false));
					__CLOVER_209_0.cloverRec.S[18363]++;var=creer_expr_var((Element) n);
					assert((((var!=null)) && (++__CLOVER_209_0.cloverRec.CT[4895]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4895]==0&false));
				}
				}else {__CLOVER_209_0.cloverRec.S[18364]++;if ((((n.getNodeName() == "nom_attribut") && (++__CLOVER_209_0.cloverRec.CT[4896]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4896]==0&false))) {{
					//System.out.println("heritage");
					assert((((nom==null)) && (++__CLOVER_209_0.cloverRec.CT[4897]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4897]==0&false));
					__CLOVER_209_0.cloverRec.S[18365]++;nom=creer_nom_attribut((Element) n);
					assert((((nom!=null)) && (++__CLOVER_209_0.cloverRec.CT[4898]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4898]==0&false));
				}
				}else {__CLOVER_209_0.cloverRec.S[18366]++;if ((((n.getNodeName() == "expression_scalaire") && (++__CLOVER_209_0.cloverRec.CT[4899]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4899]==0&false))) {{
					//System.out.println("heritage");
					__CLOVER_209_0.cloverRec.S[18367]++;expr=creer_expr_scalaire((Element) n);
					assert((((expr!=null)) && (++__CLOVER_209_0.cloverRec.CT[4900]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4900]==0&false));
					//v.addElement(expr);
					__CLOVER_209_0.cloverRec.S[18368]++;if((((nom!=null) && (++__CLOVER_209_0.cloverRec.CT[4901]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4901]==0&false)))
					{{
						__CLOVER_209_0.cloverRec.S[18369]++;v.addElement(expr);
					}
					}else
					{{
						assert((((expr instanceof CIExpr_Var)) && (++__CLOVER_209_0.cloverRec.CT[4902]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4902]==0&false));
						__CLOVER_209_0.cloverRec.S[18370]++;var=(CIExpr_Var)expr;
					}
				}}
				}else {__CLOVER_209_0.cloverRec.S[18371]++;if ((((n.getNodeName() == "source") && (++__CLOVER_209_0.cloverRec.CT[4903]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4903]==0&false))) {{
					//System.out.println("source");
					__CLOVER_209_0.cloverRec.S[18372]++;source = creer_source((Element) n);
				}
				}else
					{assert((((false)) && (++__CLOVER_209_0.cloverRec.CT[4904]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4904]==0&false));
			}}}}}
			}else {__CLOVER_209_0.cloverRec.S[18373]++;if ((((n instanceof Comment) && (++__CLOVER_209_0.cloverRec.CT[4905]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4905]==0&false))) {{
				
			}
			}else {__CLOVER_209_0.cloverRec.S[18374]++;if ((((n instanceof Text) && (++__CLOVER_209_0.cloverRec.CT[4906]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4906]==0&false))) {{
				__CLOVER_209_0.cloverRec.S[18375]++;String s = n.getNodeValue();
				assert((((s == "" || s.matches("[ \t\n]+"))) && (++__CLOVER_209_0.cloverRec.CT[4907]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4907]==0&false));
			}
			}else
				{assert((((false)) && (++__CLOVER_209_0.cloverRec.CT[4908]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4908]==0&false));
		}}}}
		//assert(var!=null);
		}assert((((nom!=null)) && (++__CLOVER_209_0.cloverRec.CT[4909]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4909]==0&false));
		__CLOVER_209_0.cloverRec.S[18376]++;if((((v.size()>0) && (++__CLOVER_209_0.cloverRec.CT[4910]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4910]==0&false)))
		{{
			__CLOVER_209_0.cloverRec.S[18377]++;param=new CIExpr_Scalaire[v.size()];
			__CLOVER_209_0.cloverRec.S[18378]++;v.copyInto(param);
		}
		}else
		{{
			__CLOVER_209_0.cloverRec.S[18379]++;param=null;
		}
		}__CLOVER_209_0.cloverRec.S[18380]++;res=new CIExpr_Appel(var,nom,param,source);
		__CLOVER_209_0.cloverRec.S[18381]++;return res;
	}

	public CIExpr_Creation creer_expr_creat(Element element)
	{__CLOVER_209_0.cloverRec.M[1238]++;
		__CLOVER_209_0.cloverRec.S[18382]++;int no,i,op;
		__CLOVER_209_0.cloverRec.S[18383]++;CIExpr_Creation res=null;
		__CLOVER_209_0.cloverRec.S[18384]++;CIType type=null;
		assert((((element!=null)) && (++__CLOVER_209_0.cloverRec.CT[4911]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4911]==0&false));
		assert((((element.getNodeName().equalsIgnoreCase("expression_creation"))) && (++__CLOVER_209_0.cloverRec.CT[4912]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4912]==0&false));
		__CLOVER_209_0.cloverRec.S[18385]++;NodeList fils = element.getChildNodes();
		assert((((fils.getLength()>0)) && (++__CLOVER_209_0.cloverRec.CT[4913]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4913]==0&false));
		__CLOVER_209_0.cloverRec.S[18386]++;NamedNodeMap attributs = element.getAttributes();
		__CLOVER_209_0.cloverRec.S[18387]++;CINom_Attribut nom=null;
		__CLOVER_209_0.cloverRec.S[18388]++;CIExpr_Var var=null;
		__CLOVER_209_0.cloverRec.S[18389]++;CIExpr_Scalaire expr,param[],es=null;
		__CLOVER_209_0.cloverRec.S[18390]++;Vector v;
		__CLOVER_209_0.cloverRec.S[18391]++;CIExpr_Appel ea=null;
		__CLOVER_209_0.cloverRec.S[18392]++;CISource source=null;

		__CLOVER_209_0.cloverRec.S[18393]++;v=new Vector();
		__CLOVER_209_0.cloverRec.S[18394]++;for(i=0;(((i<fils.getLength()) && (++__CLOVER_209_0.cloverRec.CT[4914]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4914]==0&false));i++)
		{{
			__CLOVER_209_0.cloverRec.S[18395]++;Node n = fils.item(i);
			//System.out.println("element=" + n.getNodeName());
			__CLOVER_209_0.cloverRec.S[18396]++;if ((((n instanceof Element) && (++__CLOVER_209_0.cloverRec.CT[4915]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4915]==0&false))) {{
				__CLOVER_209_0.cloverRec.S[18397]++;if ((((n.getNodeName() == "type") && (++__CLOVER_209_0.cloverRec.CT[4916]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4916]==0&false))) {{
					//System.out.println("heritage");
					assert((((type==null)) && (++__CLOVER_209_0.cloverRec.CT[4917]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4917]==0&false));
					__CLOVER_209_0.cloverRec.S[18398]++;type=creer_type((Element) n);
					assert((((type!=null)) && (++__CLOVER_209_0.cloverRec.CT[4918]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4918]==0&false));
				}
				}else {__CLOVER_209_0.cloverRec.S[18399]++;if ((((n.getNodeName() == "expr_appel") && (++__CLOVER_209_0.cloverRec.CT[4919]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4919]==0&false))) {{
					//System.out.println("heritage");
					assert((((ea==null)) && (++__CLOVER_209_0.cloverRec.CT[4920]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4920]==0&false));
					__CLOVER_209_0.cloverRec.S[18400]++;ea=creer_expr_appel((Element) n);
					assert((((ea!=null)) && (++__CLOVER_209_0.cloverRec.CT[4921]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4921]==0&false));
				}
				}else {__CLOVER_209_0.cloverRec.S[18401]++;if ((((n.getNodeName() == "expression_scalaire") && (++__CLOVER_209_0.cloverRec.CT[4922]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4922]==0&false))) {{
					//System.out.println("heritage");
					assert((((es==null)) && (++__CLOVER_209_0.cloverRec.CT[4923]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4923]==0&false));
					__CLOVER_209_0.cloverRec.S[18402]++;es=creer_expr_scalaire((Element) n);
					assert((((es!=null)) && (++__CLOVER_209_0.cloverRec.CT[4924]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4924]==0&false));
				}
				}else {__CLOVER_209_0.cloverRec.S[18403]++;if ((((n.getNodeName() == "source") && (++__CLOVER_209_0.cloverRec.CT[4925]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4925]==0&false))) {{
					//System.out.println("source");
					__CLOVER_209_0.cloverRec.S[18404]++;source = creer_source((Element) n);
				}
				}else
					{assert((((false)) && (++__CLOVER_209_0.cloverRec.CT[4926]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4926]==0&false));
			}}}}}
			}else {__CLOVER_209_0.cloverRec.S[18405]++;if ((((n instanceof Comment) && (++__CLOVER_209_0.cloverRec.CT[4927]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4927]==0&false))) {{
				
			}
			}else {__CLOVER_209_0.cloverRec.S[18406]++;if ((((n instanceof Text) && (++__CLOVER_209_0.cloverRec.CT[4928]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4928]==0&false))) {{
				__CLOVER_209_0.cloverRec.S[18407]++;String s = n.getNodeValue();
				assert((((s == "" || s.matches("[ \t\n]+"))) && (++__CLOVER_209_0.cloverRec.CT[4929]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4929]==0&false));
			}
			}else
				{assert((((false)) && (++__CLOVER_209_0.cloverRec.CT[4930]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4930]==0&false));
		}}}}
		}assert((((type!=null)) && (++__CLOVER_209_0.cloverRec.CT[4931]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4931]==0&false));
		__CLOVER_209_0.cloverRec.S[18408]++;if((((ea!=null) && (++__CLOVER_209_0.cloverRec.CT[4932]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4932]==0&false)))
		{{
			assert((((es==null)) && (++__CLOVER_209_0.cloverRec.CT[4933]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4933]==0&false));
			__CLOVER_209_0.cloverRec.S[18409]++;res=new CIExpr_Creation(type,ea,source);
		}
		}else
		{{
			assert((((es!=null)) && (++__CLOVER_209_0.cloverRec.CT[4934]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4934]==0&false));
			__CLOVER_209_0.cloverRec.S[18410]++;res=new CIExpr_Creation(type,es,source);
		}
		}__CLOVER_209_0.cloverRec.S[18411]++;return res;
	}

	public CIExpr_Scalaire creer_expr_scalaire(Element element)
	{__CLOVER_209_0.cloverRec.M[1239]++;
		__CLOVER_209_0.cloverRec.S[18412]++;int no,i,op;
		__CLOVER_209_0.cloverRec.S[18413]++;CIExpr_Scalaire res=null;
		__CLOVER_209_0.cloverRec.S[18414]++;CIType type=null;
		assert((((element!=null)) && (++__CLOVER_209_0.cloverRec.CT[4935]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4935]==0&false));
		assert((((element.getNodeName().equalsIgnoreCase("expression_scalaire"))) && (++__CLOVER_209_0.cloverRec.CT[4936]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4936]==0&false));
		__CLOVER_209_0.cloverRec.S[18415]++;NodeList fils = element.getChildNodes();
		//assert(fils.getLength()>0);
		__CLOVER_209_0.cloverRec.S[18416]++;NamedNodeMap attributs = element.getAttributes();
		__CLOVER_209_0.cloverRec.S[18417]++;String nom="",text="",oper="";
		__CLOVER_209_0.cloverRec.S[18418]++;CIExpr_Scalaire expr1;
		__CLOVER_209_0.cloverRec.S[18419]++;CIExpr_Var var=null;
		__CLOVER_209_0.cloverRec.S[18420]++;CIExpr_Var_Syst vars=null;
		__CLOVER_209_0.cloverRec.S[18421]++;CISource source=null;

		__CLOVER_209_0.cloverRec.S[18422]++;for(i=0;(((i<fils.getLength()) && (++__CLOVER_209_0.cloverRec.CT[4937]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4937]==0&false));i++)
		{{
			__CLOVER_209_0.cloverRec.S[18423]++;Node n = fils.item(i);
			//System.out.println("element=" + n.getNodeName());
			__CLOVER_209_0.cloverRec.S[18424]++;if ((((n instanceof Element) && (++__CLOVER_209_0.cloverRec.CT[4938]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4938]==0&false))) {{
				__CLOVER_209_0.cloverRec.S[18425]++;if ((((n.getNodeName() == "var") && (++__CLOVER_209_0.cloverRec.CT[4939]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4939]==0&false))) {{
					//System.out.println("heritage");
					assert((((var==null)) && (++__CLOVER_209_0.cloverRec.CT[4940]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4940]==0&false));
					assert((((vars==null)) && (++__CLOVER_209_0.cloverRec.CT[4941]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4941]==0&false));
					__CLOVER_209_0.cloverRec.S[18426]++;var=creer_expr_var((Element) n);
					assert((((var!=null)) && (++__CLOVER_209_0.cloverRec.CT[4942]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4942]==0&false));
				}
				}else {__CLOVER_209_0.cloverRec.S[18427]++;if ((((n.getNodeName() == "expr_var_syst") && (++__CLOVER_209_0.cloverRec.CT[4943]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4943]==0&false))) {{
					//System.out.println("heritage");
					assert((((vars==null)) && (++__CLOVER_209_0.cloverRec.CT[4944]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4944]==0&false));
					assert((((var==null)) && (++__CLOVER_209_0.cloverRec.CT[4945]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4945]==0&false));
					__CLOVER_209_0.cloverRec.S[18428]++;vars=creer_expr_var_syst((Element) n);
					assert((((vars!=null)) && (++__CLOVER_209_0.cloverRec.CT[4946]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4946]==0&false));
				}
				}else {__CLOVER_209_0.cloverRec.S[18429]++;if ((((n.getNodeName() == "source") && (++__CLOVER_209_0.cloverRec.CT[4947]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4947]==0&false))) {{
					//System.out.println("source");
					__CLOVER_209_0.cloverRec.S[18430]++;source = creer_source((Element) n);
				}
				}else
					{assert((((false)) && (++__CLOVER_209_0.cloverRec.CT[4948]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4948]==0&false)):"nom="+n.getNodeName();
			}}}}
			}else {__CLOVER_209_0.cloverRec.S[18431]++;if ((((n instanceof Comment) && (++__CLOVER_209_0.cloverRec.CT[4949]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4949]==0&false))) {{
				
			}
			}else {__CLOVER_209_0.cloverRec.S[18432]++;if ((((n instanceof Text) && (++__CLOVER_209_0.cloverRec.CT[4950]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4950]==0&false))) {{
				__CLOVER_209_0.cloverRec.S[18433]++;String s = n.getNodeValue();
				assert((((s == "" || s.matches("[ \t\n]+"))) && (++__CLOVER_209_0.cloverRec.CT[4951]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4951]==0&false));
			}
			}else
				{assert((((false)) && (++__CLOVER_209_0.cloverRec.CT[4952]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4952]==0&false));
		}}}}
		}__CLOVER_209_0.cloverRec.S[18434]++;for (i = 0; (((i < attributs.getLength()) && (++__CLOVER_209_0.cloverRec.CT[4953]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4953]==0&false)); i++) {{
			__CLOVER_209_0.cloverRec.S[18435]++;Node num\u00e9ro = attributs.item(i);
			__CLOVER_209_0.cloverRec.S[18436]++;String nomAttribut = num\u00e9ro.getNodeName();
			__CLOVER_209_0.cloverRec.S[18437]++;String valeurAttribut = num\u00e9ro.getNodeValue();
			__CLOVER_209_0.cloverRec.S[18438]++;System.out.println(nomAttribut + " =\"" + valeurAttribut + "\"");
			__CLOVER_209_0.cloverRec.S[18439]++;if((((nomAttribut.equalsIgnoreCase("type")) && (++__CLOVER_209_0.cloverRec.CT[4954]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4954]==0&false)))
				{__CLOVER_209_0.cloverRec.S[18440]++;oper=valeurAttribut;
			}else {__CLOVER_209_0.cloverRec.S[18441]++;if((((nomAttribut.equalsIgnoreCase("text")) && (++__CLOVER_209_0.cloverRec.CT[4955]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4955]==0&false)))
				{__CLOVER_209_0.cloverRec.S[18442]++;text=valeurAttribut;
			}else
				{assert((((false)) && (++__CLOVER_209_0.cloverRec.CT[4956]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4956]==0&false)):"nom="+nomAttribut;
		}}}
		}assert((((oper!=null)) && (++__CLOVER_209_0.cloverRec.CT[4957]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4957]==0&false));
		__CLOVER_209_0.cloverRec.S[18443]++;if((((oper.equalsIgnoreCase("entier")) && (++__CLOVER_209_0.cloverRec.CT[4958]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4958]==0&false)))
		{{
			__CLOVER_209_0.cloverRec.S[18444]++;try{
				__CLOVER_209_0.cloverRec.S[18445]++;res=new CIExpr_Entier(Integer.parseInt(text),source);
			}
			catch(NumberFormatException e)
			{
				__CLOVER_209_0.cloverRec.S[18446]++;e.printStackTrace();
				assert((((false)) && (++__CLOVER_209_0.cloverRec.CT[4959]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4959]==0&false));
			}
		}
		}else {__CLOVER_209_0.cloverRec.S[18447]++;if((((oper.equalsIgnoreCase("reel")) && (++__CLOVER_209_0.cloverRec.CT[4960]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4960]==0&false)))
		{{
			__CLOVER_209_0.cloverRec.S[18448]++;try{
				__CLOVER_209_0.cloverRec.S[18449]++;res=new CIExpr_Real(Double.parseDouble(text),source);
			}
			catch(NumberFormatException e)
			{
				__CLOVER_209_0.cloverRec.S[18450]++;e.printStackTrace();
				assert((((false)) && (++__CLOVER_209_0.cloverRec.CT[4961]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4961]==0&false));
			}
		}
		}else {__CLOVER_209_0.cloverRec.S[18451]++;if((((oper.equalsIgnoreCase("chaine")) && (++__CLOVER_209_0.cloverRec.CT[4962]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4962]==0&false)))
		{{
			__CLOVER_209_0.cloverRec.S[18452]++;res=new CIExpr_String(text,source);
		}
		}else {__CLOVER_209_0.cloverRec.S[18453]++;if((((oper.equalsIgnoreCase("car")) && (++__CLOVER_209_0.cloverRec.CT[4963]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4963]==0&false)))
		{{
			assert((((text.length()==1)) && (++__CLOVER_209_0.cloverRec.CT[4964]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4964]==0&false));
			__CLOVER_209_0.cloverRec.S[18454]++;res=new CIExpr_Char(text.charAt(0),source);
		}
		}else {__CLOVER_209_0.cloverRec.S[18455]++;if((((oper.equalsIgnoreCase("booleen")) && (++__CLOVER_209_0.cloverRec.CT[4965]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4965]==0&false)))
		{{
			__CLOVER_209_0.cloverRec.S[18456]++;res=new CIExpr_Bool(text.equalsIgnoreCase("true"),source);
		}
		}else {__CLOVER_209_0.cloverRec.S[18457]++;if((((oper.equalsIgnoreCase("void")) && (++__CLOVER_209_0.cloverRec.CT[4966]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4966]==0&false)))
		{{
			__CLOVER_209_0.cloverRec.S[18458]++;res=new CIExpr_Void(source);
		}
		}else {__CLOVER_209_0.cloverRec.S[18459]++;if((((oper.equalsIgnoreCase("var")) && (++__CLOVER_209_0.cloverRec.CT[4967]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4967]==0&false)))
		{{
			assert((((var!=null)) && (++__CLOVER_209_0.cloverRec.CT[4968]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4968]==0&false));
			__CLOVER_209_0.cloverRec.S[18460]++;res=var;
		}
		}else {__CLOVER_209_0.cloverRec.S[18461]++;if((((oper.equalsIgnoreCase("var_syst")) && (++__CLOVER_209_0.cloverRec.CT[4969]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4969]==0&false)))
		{{
			assert((((vars!=null)) && (++__CLOVER_209_0.cloverRec.CT[4970]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4970]==0&false));
			__CLOVER_209_0.cloverRec.S[18462]++;res=vars;
		}
		}else
			{assert((((false)) && (++__CLOVER_209_0.cloverRec.CT[4971]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4971]==0&false));
		//res=new Expr_Unaire(op,expr1);
		}}}}}}}}__CLOVER_209_0.cloverRec.S[18463]++;return res;
	}

	public CIListe_Instr creer_instruction(Element element)
	{__CLOVER_209_0.cloverRec.M[1240]++;
		__CLOVER_209_0.cloverRec.S[18464]++;int no,i,op;
		__CLOVER_209_0.cloverRec.S[18465]++;CIListe_Instr res=null;
		__CLOVER_209_0.cloverRec.S[18466]++;CIType type=null;
		assert((((element!=null)) && (++__CLOVER_209_0.cloverRec.CT[4972]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4972]==0&false));
		assert((((element.getNodeName().equalsIgnoreCase("instruction"))) && (++__CLOVER_209_0.cloverRec.CT[4973]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4973]==0&false));
		__CLOVER_209_0.cloverRec.S[18467]++;NodeList fils = element.getChildNodes();
		//assert(fils.getLength()>0);
		__CLOVER_209_0.cloverRec.S[18468]++;NamedNodeMap attributs = element.getAttributes();
		__CLOVER_209_0.cloverRec.S[18469]++;CINom_Attribut nom=null;
		__CLOVER_209_0.cloverRec.S[18470]++;CIExpr_Var var=null;
		__CLOVER_209_0.cloverRec.S[18471]++;CIExpr_Scalaire expr,param[];
		__CLOVER_209_0.cloverRec.S[18472]++;Vector v;
		__CLOVER_209_0.cloverRec.S[18473]++;CIExpr_Appel ea=null;
		__CLOVER_209_0.cloverRec.S[18474]++;CIInstruction instr;
		__CLOVER_209_0.cloverRec.S[18475]++;CISource source=null;

		__CLOVER_209_0.cloverRec.S[18476]++;v=new Vector();
		__CLOVER_209_0.cloverRec.S[18477]++;for(i=0;(((i<fils.getLength()) && (++__CLOVER_209_0.cloverRec.CT[4974]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4974]==0&false));i++)
		{{
			__CLOVER_209_0.cloverRec.S[18478]++;Node n = fils.item(i);
			//System.out.println("element=" + n.getNodeName());
			__CLOVER_209_0.cloverRec.S[18479]++;if ((((n instanceof Element) && (++__CLOVER_209_0.cloverRec.CT[4975]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4975]==0&false))) {{
				__CLOVER_209_0.cloverRec.S[18480]++;if ((((n.getNodeName() == "instr_affect") && (++__CLOVER_209_0.cloverRec.CT[4976]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4976]==0&false))) {{
					//System.out.println("heritage");
					__CLOVER_209_0.cloverRec.S[18481]++;instr=creer_instruction_affect((Element) n);
					assert((((instr!=null)) && (++__CLOVER_209_0.cloverRec.CT[4977]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4977]==0&false));
					__CLOVER_209_0.cloverRec.S[18482]++;v.addElement(instr);
				}
				}else {__CLOVER_209_0.cloverRec.S[18483]++;if ((((n.getNodeName() == "instr_appel") && (++__CLOVER_209_0.cloverRec.CT[4978]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4978]==0&false))) {{
					//System.out.println("heritage");
					__CLOVER_209_0.cloverRec.S[18484]++;instr=creer_instruction_appel((Element) n);
					assert((((instr!=null)) && (++__CLOVER_209_0.cloverRec.CT[4979]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4979]==0&false));
					__CLOVER_209_0.cloverRec.S[18485]++;v.addElement(instr);
				}
				}else {__CLOVER_209_0.cloverRec.S[18486]++;if ((((n.getNodeName() == "instr_si") && (++__CLOVER_209_0.cloverRec.CT[4980]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4980]==0&false))) {{
					//System.out.println("heritage");
					__CLOVER_209_0.cloverRec.S[18487]++;instr=creer_instruction_si((Element) n);
					assert((((instr!=null)) && (++__CLOVER_209_0.cloverRec.CT[4981]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4981]==0&false));
					__CLOVER_209_0.cloverRec.S[18488]++;v.addElement(instr);
				}
				}else {__CLOVER_209_0.cloverRec.S[18489]++;if ((((n.getNodeName() == "instr_si_non") && (++__CLOVER_209_0.cloverRec.CT[4982]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4982]==0&false))) {{
					//System.out.println("heritage");
					__CLOVER_209_0.cloverRec.S[18490]++;instr=creer_instruction_si_non((Element) n);
					assert((((instr!=null)) && (++__CLOVER_209_0.cloverRec.CT[4983]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4983]==0&false));
					__CLOVER_209_0.cloverRec.S[18491]++;v.addElement(instr);
				}
				}else {__CLOVER_209_0.cloverRec.S[18492]++;if ((((n.getNodeName() == "instr_goto") && (++__CLOVER_209_0.cloverRec.CT[4984]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4984]==0&false))) {{
					//System.out.println("heritage");
					__CLOVER_209_0.cloverRec.S[18493]++;instr=creer_instruction_goto((Element) n);
					assert((((instr!=null)) && (++__CLOVER_209_0.cloverRec.CT[4985]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4985]==0&false));
					__CLOVER_209_0.cloverRec.S[18494]++;v.addElement(instr);
				}
				}else {__CLOVER_209_0.cloverRec.S[18495]++;if ((((n.getNodeName() == "instr_label") && (++__CLOVER_209_0.cloverRec.CT[4986]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4986]==0&false))) {{
					//System.out.println("heritage");
					__CLOVER_209_0.cloverRec.S[18496]++;instr=creer_instruction_label((Element) n);
					assert((((instr!=null)) && (++__CLOVER_209_0.cloverRec.CT[4987]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4987]==0&false));
					__CLOVER_209_0.cloverRec.S[18497]++;v.addElement(instr);
				}
				}else {__CLOVER_209_0.cloverRec.S[18498]++;if ((((n.getNodeName() == "instr_return") && (++__CLOVER_209_0.cloverRec.CT[4988]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4988]==0&false))) {{
					//System.out.println("heritage");
					__CLOVER_209_0.cloverRec.S[18499]++;instr=creer_instruction_return((Element) n);
					assert((((instr!=null)) && (++__CLOVER_209_0.cloverRec.CT[4989]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4989]==0&false));
					__CLOVER_209_0.cloverRec.S[18500]++;v.addElement(instr);
				}
				}else {__CLOVER_209_0.cloverRec.S[18501]++;if ((((n.getNodeName() == "instr_raise") && (++__CLOVER_209_0.cloverRec.CT[4990]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4990]==0&false))) {{
					//System.out.println("heritage");
					__CLOVER_209_0.cloverRec.S[18502]++;instr=creer_instruction_raise((Element) n);
					assert((((instr!=null)) && (++__CLOVER_209_0.cloverRec.CT[4991]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4991]==0&false));
					__CLOVER_209_0.cloverRec.S[18503]++;v.addElement(instr);
				}
				}else {__CLOVER_209_0.cloverRec.S[18504]++;if ((((n.getNodeName() == "source") && (++__CLOVER_209_0.cloverRec.CT[4992]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4992]==0&false))) {{
					//System.out.println("source");
					__CLOVER_209_0.cloverRec.S[18505]++;source = creer_source((Element) n);
				}
				}else
					{assert((((false)) && (++__CLOVER_209_0.cloverRec.CT[4993]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4993]==0&false));
			}}}}}}}}}}
			}else {__CLOVER_209_0.cloverRec.S[18506]++;if ((((n instanceof Comment) && (++__CLOVER_209_0.cloverRec.CT[4994]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4994]==0&false))) {{
				
			}
			}else {__CLOVER_209_0.cloverRec.S[18507]++;if ((((n instanceof Text) && (++__CLOVER_209_0.cloverRec.CT[4995]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4995]==0&false))) {{
				__CLOVER_209_0.cloverRec.S[18508]++;String s = n.getNodeValue();
				assert((((s == "" || s.matches("[ \t\n]+"))) && (++__CLOVER_209_0.cloverRec.CT[4996]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4996]==0&false));
			}
			}else
				{assert((((false)) && (++__CLOVER_209_0.cloverRec.CT[4997]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4997]==0&false));
		}}}}
		}__CLOVER_209_0.cloverRec.S[18509]++;if((((v.size()>0) && (++__CLOVER_209_0.cloverRec.CT[4998]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4998]==0&false)))
		{{
			__CLOVER_209_0.cloverRec.S[18510]++;res=new CIListe_Instr();
			__CLOVER_209_0.cloverRec.S[18511]++;res.ajoute(v);
		}
		}__CLOVER_209_0.cloverRec.S[18512]++;return res;
	}

	public CIInstruction_Appel creer_instruction_appel(Element element)
	{__CLOVER_209_0.cloverRec.M[1241]++;
		__CLOVER_209_0.cloverRec.S[18513]++;int no,i,op;
		__CLOVER_209_0.cloverRec.S[18514]++;CIInstruction_Appel res;
		__CLOVER_209_0.cloverRec.S[18515]++;CIType type=null;
		assert((((element!=null)) && (++__CLOVER_209_0.cloverRec.CT[4999]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[4999]==0&false));
		assert((((element.getNodeName().equalsIgnoreCase("instr_appel"))) && (++__CLOVER_209_0.cloverRec.CT[5000]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5000]==0&false));
		__CLOVER_209_0.cloverRec.S[18516]++;NodeList fils = element.getChildNodes();
		assert((((fils.getLength()>0)) && (++__CLOVER_209_0.cloverRec.CT[5001]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5001]==0&false));
		__CLOVER_209_0.cloverRec.S[18517]++;NamedNodeMap attributs = element.getAttributes();
		__CLOVER_209_0.cloverRec.S[18518]++;CINom_Attribut nom=null;
		__CLOVER_209_0.cloverRec.S[18519]++;CIExpr_Var var=null;
		__CLOVER_209_0.cloverRec.S[18520]++;CIExpr_Scalaire expr,param[]=null;
		__CLOVER_209_0.cloverRec.S[18521]++;Vector v;
		__CLOVER_209_0.cloverRec.S[18522]++;CIExpr_Appel ea=null;
		__CLOVER_209_0.cloverRec.S[18523]++;CIInstruction instr;
		__CLOVER_209_0.cloverRec.S[18524]++;CISource source=null;

		__CLOVER_209_0.cloverRec.S[18525]++;v=new Vector();
		__CLOVER_209_0.cloverRec.S[18526]++;for(i=0;(((i<fils.getLength()) && (++__CLOVER_209_0.cloverRec.CT[5002]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5002]==0&false));i++)
		{{
			__CLOVER_209_0.cloverRec.S[18527]++;Node n = fils.item(i);
			//System.out.println("element=" + n.getNodeName());
			__CLOVER_209_0.cloverRec.S[18528]++;if ((((n instanceof Element) && (++__CLOVER_209_0.cloverRec.CT[5003]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5003]==0&false))) {{
				__CLOVER_209_0.cloverRec.S[18529]++;if ((((n.getNodeName() == "var") && (++__CLOVER_209_0.cloverRec.CT[5004]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5004]==0&false))) {{
					//System.out.println("heritage");
					__CLOVER_209_0.cloverRec.S[18530]++;var=creer_expr_var((Element) n);
					assert((((var!=null)) && (++__CLOVER_209_0.cloverRec.CT[5005]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5005]==0&false));
				}
				}else {__CLOVER_209_0.cloverRec.S[18531]++;if ((((n.getNodeName() == "nom_attribut") && (++__CLOVER_209_0.cloverRec.CT[5006]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5006]==0&false))) {{
					//System.out.println("heritage");
					__CLOVER_209_0.cloverRec.S[18532]++;nom=creer_nom_attribut((Element) n);
					assert((((nom!=null)) && (++__CLOVER_209_0.cloverRec.CT[5007]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5007]==0&false));
				}
				}else {__CLOVER_209_0.cloverRec.S[18533]++;if ((((n.getNodeName() == "expression_scalaire") && (++__CLOVER_209_0.cloverRec.CT[5008]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5008]==0&false))) {{
					//System.out.println("heritage");
					__CLOVER_209_0.cloverRec.S[18534]++;expr=creer_expr_scalaire((Element) n);
					assert((((expr!=null)) && (++__CLOVER_209_0.cloverRec.CT[5009]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5009]==0&false));
					__CLOVER_209_0.cloverRec.S[18535]++;if((((nom!=null) && (++__CLOVER_209_0.cloverRec.CT[5010]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5010]==0&false)))
					{{
						__CLOVER_209_0.cloverRec.S[18536]++;v.addElement(expr);
					}
					}else
					{{
						assert((((expr instanceof CIExpr_Var)) && (++__CLOVER_209_0.cloverRec.CT[5011]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5011]==0&false));
						__CLOVER_209_0.cloverRec.S[18537]++;var=(CIExpr_Var)expr;
					}
				}}
				}else {__CLOVER_209_0.cloverRec.S[18538]++;if ((((n.getNodeName() == "source") && (++__CLOVER_209_0.cloverRec.CT[5012]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5012]==0&false))) {{
					//System.out.println("source");
					__CLOVER_209_0.cloverRec.S[18539]++;source = creer_source((Element) n);
				}
				}else
					{assert((((false)) && (++__CLOVER_209_0.cloverRec.CT[5013]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5013]==0&false));
			}}}}}
			}else {__CLOVER_209_0.cloverRec.S[18540]++;if ((((n instanceof Comment) && (++__CLOVER_209_0.cloverRec.CT[5014]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5014]==0&false))) {{
				
			}
			}else {__CLOVER_209_0.cloverRec.S[18541]++;if ((((n instanceof Text) && (++__CLOVER_209_0.cloverRec.CT[5015]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5015]==0&false))) {{
				__CLOVER_209_0.cloverRec.S[18542]++;String s = n.getNodeValue();
				assert((((s == "" || s.matches("[ \t\n]+"))) && (++__CLOVER_209_0.cloverRec.CT[5016]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5016]==0&false));
			}
			}else
				{assert((((false)) && (++__CLOVER_209_0.cloverRec.CT[5017]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5017]==0&false));
		}}}}
		//assert(!nom.nom.equalsIgnoreCase("toto")):"v="+v;
		}__CLOVER_209_0.cloverRec.S[18543]++;if((((v.size()>0) && (++__CLOVER_209_0.cloverRec.CT[5018]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5018]==0&false)))
		{{
			__CLOVER_209_0.cloverRec.S[18544]++;param=new CIExpr_Scalaire[v.size()];
			__CLOVER_209_0.cloverRec.S[18545]++;v.copyInto(param);
		}
		}__CLOVER_209_0.cloverRec.S[18546]++;res=new CIInstruction_Appel(var,nom,param,source);
		__CLOVER_209_0.cloverRec.S[18547]++;return res;
	}

	public CIInstruction_Affect creer_instruction_affect(Element element)
	{__CLOVER_209_0.cloverRec.M[1242]++;
		__CLOVER_209_0.cloverRec.S[18548]++;int no,i,op;
		__CLOVER_209_0.cloverRec.S[18549]++;CIInstruction_Affect res;
		__CLOVER_209_0.cloverRec.S[18550]++;CIType type=null;
		assert((((element!=null)) && (++__CLOVER_209_0.cloverRec.CT[5019]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5019]==0&false));
		assert((((element.getNodeName().equalsIgnoreCase("instr_affect"))) && (++__CLOVER_209_0.cloverRec.CT[5020]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5020]==0&false));
		__CLOVER_209_0.cloverRec.S[18551]++;NodeList fils = element.getChildNodes();
		assert((((fils.getLength()>0)) && (++__CLOVER_209_0.cloverRec.CT[5021]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5021]==0&false));
		__CLOVER_209_0.cloverRec.S[18552]++;NamedNodeMap attributs = element.getAttributes();
		__CLOVER_209_0.cloverRec.S[18553]++;CINom_Attribut nom=null;
		__CLOVER_209_0.cloverRec.S[18554]++;CIExpr_Var var=null;
		__CLOVER_209_0.cloverRec.S[18555]++;CIExpr_Scalaire expr,param[]=null;
		__CLOVER_209_0.cloverRec.S[18556]++;Vector v;
		__CLOVER_209_0.cloverRec.S[18557]++;CIExpr_Appel ea=null;
		__CLOVER_209_0.cloverRec.S[18558]++;CIInstruction instr;
		__CLOVER_209_0.cloverRec.S[18559]++;CIExpr e=null;
		__CLOVER_209_0.cloverRec.S[18560]++;CISource source=null;

		__CLOVER_209_0.cloverRec.S[18561]++;v=new Vector();
		__CLOVER_209_0.cloverRec.S[18562]++;for(i=0;(((i<fils.getLength()) && (++__CLOVER_209_0.cloverRec.CT[5022]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5022]==0&false));i++)
		{{
			__CLOVER_209_0.cloverRec.S[18563]++;Node n = fils.item(i);
			//System.out.println("element=" + n.getNodeName());
			__CLOVER_209_0.cloverRec.S[18564]++;if ((((n instanceof Element) && (++__CLOVER_209_0.cloverRec.CT[5023]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5023]==0&false))) {{
				__CLOVER_209_0.cloverRec.S[18565]++;if ((((n.getNodeName() == "expression") && (++__CLOVER_209_0.cloverRec.CT[5024]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5024]==0&false))) {{
					//System.out.println("heritage");
					__CLOVER_209_0.cloverRec.S[18566]++;e=creer_expr((Element) n);
					assert((((e!=null)) && (++__CLOVER_209_0.cloverRec.CT[5025]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5025]==0&false));
				}
				}else {__CLOVER_209_0.cloverRec.S[18567]++;if ((((n.getNodeName() == "expression_scalaire") && (++__CLOVER_209_0.cloverRec.CT[5026]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5026]==0&false))) {{
					//System.out.println("heritage");
					__CLOVER_209_0.cloverRec.S[18568]++;expr=creer_expr_scalaire((Element) n);
					assert((((expr!=null)) && (++__CLOVER_209_0.cloverRec.CT[5027]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5027]==0&false));
					assert((((expr instanceof CIExpr_Var)) && (++__CLOVER_209_0.cloverRec.CT[5028]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5028]==0&false));
					__CLOVER_209_0.cloverRec.S[18569]++;var=(CIExpr_Var)expr;
				}
				}else {__CLOVER_209_0.cloverRec.S[18570]++;if ((((n.getNodeName() == "source") && (++__CLOVER_209_0.cloverRec.CT[5029]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5029]==0&false))) {{
					//System.out.println("source");
					__CLOVER_209_0.cloverRec.S[18571]++;source = creer_source((Element) n);
				}
				}else
					{assert((((false)) && (++__CLOVER_209_0.cloverRec.CT[5030]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5030]==0&false));
			}}}}
			}else {__CLOVER_209_0.cloverRec.S[18572]++;if ((((n instanceof Comment) && (++__CLOVER_209_0.cloverRec.CT[5031]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5031]==0&false))) {{
				
			}
			}else {__CLOVER_209_0.cloverRec.S[18573]++;if ((((n instanceof Text) && (++__CLOVER_209_0.cloverRec.CT[5032]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5032]==0&false))) {{
				__CLOVER_209_0.cloverRec.S[18574]++;String s = n.getNodeValue();
				assert((((s == "" || s.matches("[ \t\n]+"))) && (++__CLOVER_209_0.cloverRec.CT[5033]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5033]==0&false));
			}
			}else
				{assert((((false)) && (++__CLOVER_209_0.cloverRec.CT[5034]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5034]==0&false));
		}}}}
		}assert((((var!=null)) && (++__CLOVER_209_0.cloverRec.CT[5035]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5035]==0&false));
		assert((((e!=null)) && (++__CLOVER_209_0.cloverRec.CT[5036]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5036]==0&false));
		__CLOVER_209_0.cloverRec.S[18575]++;res=new CIInstruction_Affect(var,e,source);
		__CLOVER_209_0.cloverRec.S[18576]++;return res;
	}

	public CIInstruction_Si creer_instruction_si(Element element)
	{__CLOVER_209_0.cloverRec.M[1243]++;
		__CLOVER_209_0.cloverRec.S[18577]++;int no,i,op;
		__CLOVER_209_0.cloverRec.S[18578]++;CIInstruction_Si res=null;
		__CLOVER_209_0.cloverRec.S[18579]++;CIType type=null;
		assert((((element!=null)) && (++__CLOVER_209_0.cloverRec.CT[5037]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5037]==0&false));
		assert((((element.getNodeName().equalsIgnoreCase("instr_si"))) && (++__CLOVER_209_0.cloverRec.CT[5038]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5038]==0&false));
		__CLOVER_209_0.cloverRec.S[18580]++;NodeList fils = element.getChildNodes();
		assert((((fils.getLength()>0)) && (++__CLOVER_209_0.cloverRec.CT[5039]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5039]==0&false));
		__CLOVER_209_0.cloverRec.S[18581]++;NamedNodeMap attributs = element.getAttributes();
		__CLOVER_209_0.cloverRec.S[18582]++;String nom="";
		__CLOVER_209_0.cloverRec.S[18583]++;CIExpr expr1=null;
		__CLOVER_209_0.cloverRec.S[18584]++;CISource source=null;

		__CLOVER_209_0.cloverRec.S[18585]++;for (i = 0; (((i < attributs.getLength()) && (++__CLOVER_209_0.cloverRec.CT[5040]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5040]==0&false)); i++) {{
			__CLOVER_209_0.cloverRec.S[18586]++;Node num\u00e9ro = attributs.item(i);
			__CLOVER_209_0.cloverRec.S[18587]++;String nomAttribut = num\u00e9ro.getNodeName();
			__CLOVER_209_0.cloverRec.S[18588]++;String valeurAttribut = num\u00e9ro.getNodeValue();
			__CLOVER_209_0.cloverRec.S[18589]++;System.out.println(nomAttribut + " =\"" + valeurAttribut + "\"");
			__CLOVER_209_0.cloverRec.S[18590]++;if ((((nomAttribut == "label") && (++__CLOVER_209_0.cloverRec.CT[5041]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5041]==0&false)))
				{__CLOVER_209_0.cloverRec.S[18591]++;nom=valeurAttribut;
			}else
				{assert((((false)) && (++__CLOVER_209_0.cloverRec.CT[5042]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5042]==0&false));
		}}
		}assert((((nom!=null)) && (++__CLOVER_209_0.cloverRec.CT[5043]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5043]==0&false));
		__CLOVER_209_0.cloverRec.S[18592]++;for(i=0;(((i<fils.getLength()) && (++__CLOVER_209_0.cloverRec.CT[5044]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5044]==0&false));i++)
		{{
			__CLOVER_209_0.cloverRec.S[18593]++;Node n = fils.item(i);
			//System.out.println("element=" + n.getNodeName());
			__CLOVER_209_0.cloverRec.S[18594]++;if ((((n instanceof Element) && (++__CLOVER_209_0.cloverRec.CT[5045]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5045]==0&false))) {{
				__CLOVER_209_0.cloverRec.S[18595]++;if ((((n.getNodeName() == "expression") && (++__CLOVER_209_0.cloverRec.CT[5046]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5046]==0&false))) {{
					//System.out.println("heritage");
					assert((((expr1==null)) && (++__CLOVER_209_0.cloverRec.CT[5047]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5047]==0&false));
					__CLOVER_209_0.cloverRec.S[18596]++;expr1=creer_expr((Element) n);
				}
				}else {__CLOVER_209_0.cloverRec.S[18597]++;if ((((n.getNodeName() == "source") && (++__CLOVER_209_0.cloverRec.CT[5048]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5048]==0&false))) {{
					//System.out.println("source");
					__CLOVER_209_0.cloverRec.S[18598]++;source = creer_source((Element) n);
				}
				}else
					{assert((((false)) && (++__CLOVER_209_0.cloverRec.CT[5049]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5049]==0&false)):"n="+n.getNodeName();
			}}}
			}else {__CLOVER_209_0.cloverRec.S[18599]++;if ((((n instanceof Comment) && (++__CLOVER_209_0.cloverRec.CT[5050]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5050]==0&false))) {{
				
			}
			}else {__CLOVER_209_0.cloverRec.S[18600]++;if ((((n instanceof Text) && (++__CLOVER_209_0.cloverRec.CT[5051]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5051]==0&false))) {{
				__CLOVER_209_0.cloverRec.S[18601]++;String s = n.getNodeValue();
				assert((((s == "" || s.matches("[ \t\n]+"))) && (++__CLOVER_209_0.cloverRec.CT[5052]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5052]==0&false));
			}
			}else
				{assert((((false)) && (++__CLOVER_209_0.cloverRec.CT[5053]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5053]==0&false));
		}}}}
		}assert((((expr1!=null)) && (++__CLOVER_209_0.cloverRec.CT[5054]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5054]==0&false));
		assert((((nom!=null)) && (++__CLOVER_209_0.cloverRec.CT[5055]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5055]==0&false));
		__CLOVER_209_0.cloverRec.S[18602]++;res=new CIInstruction_Si(expr1,nom,source);
		__CLOVER_209_0.cloverRec.S[18603]++;return res;
	}

	public CIInstruction_Si_Non creer_instruction_si_non(Element element)
	{__CLOVER_209_0.cloverRec.M[1244]++;
		__CLOVER_209_0.cloverRec.S[18604]++;int no,i,op;
		__CLOVER_209_0.cloverRec.S[18605]++;CIInstruction_Si_Non res=null;
		__CLOVER_209_0.cloverRec.S[18606]++;CIType type=null;
		assert((((element!=null)) && (++__CLOVER_209_0.cloverRec.CT[5056]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5056]==0&false));
		assert((((element.getNodeName().equalsIgnoreCase("instr_si_non"))) && (++__CLOVER_209_0.cloverRec.CT[5057]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5057]==0&false));
		__CLOVER_209_0.cloverRec.S[18607]++;NodeList fils = element.getChildNodes();
		assert((((fils.getLength()>0)) && (++__CLOVER_209_0.cloverRec.CT[5058]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5058]==0&false));
		__CLOVER_209_0.cloverRec.S[18608]++;NamedNodeMap attributs = element.getAttributes();
		__CLOVER_209_0.cloverRec.S[18609]++;String nom="";
		__CLOVER_209_0.cloverRec.S[18610]++;CIExpr expr1=null;
		__CLOVER_209_0.cloverRec.S[18611]++;CISource source=null;

		__CLOVER_209_0.cloverRec.S[18612]++;for (i = 0; (((i < attributs.getLength()) && (++__CLOVER_209_0.cloverRec.CT[5059]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5059]==0&false)); i++) {{
			__CLOVER_209_0.cloverRec.S[18613]++;Node num\u00e9ro = attributs.item(i);
			__CLOVER_209_0.cloverRec.S[18614]++;String nomAttribut = num\u00e9ro.getNodeName();
			__CLOVER_209_0.cloverRec.S[18615]++;String valeurAttribut = num\u00e9ro.getNodeValue();
			__CLOVER_209_0.cloverRec.S[18616]++;System.out.println(nomAttribut + " =\"" + valeurAttribut + "\"");
			__CLOVER_209_0.cloverRec.S[18617]++;if ((((nomAttribut == "label") && (++__CLOVER_209_0.cloverRec.CT[5060]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5060]==0&false)))
				{__CLOVER_209_0.cloverRec.S[18618]++;nom=valeurAttribut;
			}else
				{assert((((false)) && (++__CLOVER_209_0.cloverRec.CT[5061]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5061]==0&false));
		}}
		}assert((((nom!=null)) && (++__CLOVER_209_0.cloverRec.CT[5062]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5062]==0&false));
		__CLOVER_209_0.cloverRec.S[18619]++;for(i=0;(((i<fils.getLength()) && (++__CLOVER_209_0.cloverRec.CT[5063]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5063]==0&false));i++)
		{{
			__CLOVER_209_0.cloverRec.S[18620]++;Node n = fils.item(i);
			//System.out.println("element=" + n.getNodeName());
			__CLOVER_209_0.cloverRec.S[18621]++;if ((((n instanceof Element) && (++__CLOVER_209_0.cloverRec.CT[5064]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5064]==0&false))) {{
				__CLOVER_209_0.cloverRec.S[18622]++;if ((((n.getNodeName() == "expression") && (++__CLOVER_209_0.cloverRec.CT[5065]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5065]==0&false))) {{
					//System.out.println("heritage");
					assert((((expr1==null)) && (++__CLOVER_209_0.cloverRec.CT[5066]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5066]==0&false));
					__CLOVER_209_0.cloverRec.S[18623]++;expr1=creer_expr((Element) n);
				}
				}else {__CLOVER_209_0.cloverRec.S[18624]++;if ((((n.getNodeName() == "source") && (++__CLOVER_209_0.cloverRec.CT[5067]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5067]==0&false))) {{
					//System.out.println("source");
					__CLOVER_209_0.cloverRec.S[18625]++;source = creer_source((Element) n);
				}
				}else
					{assert((((false)) && (++__CLOVER_209_0.cloverRec.CT[5068]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5068]==0&false)):"n="+n.getNodeName();
			}}}
			}else {__CLOVER_209_0.cloverRec.S[18626]++;if ((((n instanceof Comment) && (++__CLOVER_209_0.cloverRec.CT[5069]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5069]==0&false))) {{
				
			}
			}else {__CLOVER_209_0.cloverRec.S[18627]++;if ((((n instanceof Text) && (++__CLOVER_209_0.cloverRec.CT[5070]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5070]==0&false))) {{
				__CLOVER_209_0.cloverRec.S[18628]++;String s = n.getNodeValue();
				assert((((s == "" || s.matches("[ \t\n]+"))) && (++__CLOVER_209_0.cloverRec.CT[5071]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5071]==0&false));
			}
			}else
				{assert((((false)) && (++__CLOVER_209_0.cloverRec.CT[5072]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5072]==0&false));
		}}}}
		}assert((((expr1!=null)) && (++__CLOVER_209_0.cloverRec.CT[5073]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5073]==0&false));
		assert((((nom!=null)) && (++__CLOVER_209_0.cloverRec.CT[5074]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5074]==0&false));
		__CLOVER_209_0.cloverRec.S[18629]++;res=new CIInstruction_Si_Non(expr1,nom,source);
		__CLOVER_209_0.cloverRec.S[18630]++;return res;
	}

	public CIInstruction_Goto creer_instruction_goto(Element element)
	{__CLOVER_209_0.cloverRec.M[1245]++;
		__CLOVER_209_0.cloverRec.S[18631]++;int no,i,op;
		__CLOVER_209_0.cloverRec.S[18632]++;CIInstruction_Goto res=null;
		__CLOVER_209_0.cloverRec.S[18633]++;CIType type=null;
		assert((((element!=null)) && (++__CLOVER_209_0.cloverRec.CT[5075]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5075]==0&false));
		assert((((element.getNodeName().equalsIgnoreCase("instr_goto"))) && (++__CLOVER_209_0.cloverRec.CT[5076]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5076]==0&false));
		__CLOVER_209_0.cloverRec.S[18634]++;NodeList fils = element.getChildNodes();
		//assert(fils.getLength()>0);
		__CLOVER_209_0.cloverRec.S[18635]++;NamedNodeMap attributs = element.getAttributes();
		__CLOVER_209_0.cloverRec.S[18636]++;String nom="";
		__CLOVER_209_0.cloverRec.S[18637]++;CIExpr expr1=null;
		__CLOVER_209_0.cloverRec.S[18638]++;CISource source=null;

		__CLOVER_209_0.cloverRec.S[18639]++;for (i = 0; (((i < attributs.getLength()) && (++__CLOVER_209_0.cloverRec.CT[5077]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5077]==0&false)); i++) {{
			__CLOVER_209_0.cloverRec.S[18640]++;Node num\u00e9ro = attributs.item(i);
			__CLOVER_209_0.cloverRec.S[18641]++;String nomAttribut = num\u00e9ro.getNodeName();
			__CLOVER_209_0.cloverRec.S[18642]++;String valeurAttribut = num\u00e9ro.getNodeValue();
			__CLOVER_209_0.cloverRec.S[18643]++;System.out.println(nomAttribut + " =\"" + valeurAttribut + "\"");
			__CLOVER_209_0.cloverRec.S[18644]++;if ((((nomAttribut == "label") && (++__CLOVER_209_0.cloverRec.CT[5078]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5078]==0&false)))
				{__CLOVER_209_0.cloverRec.S[18645]++;nom=valeurAttribut;
			}else
				{assert((((false)) && (++__CLOVER_209_0.cloverRec.CT[5079]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5079]==0&false));
		}}
		}assert((((nom!=null)) && (++__CLOVER_209_0.cloverRec.CT[5080]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5080]==0&false));
		//assert(fils.getLength()==0);
		__CLOVER_209_0.cloverRec.S[18646]++;for(i=0;(((i<fils.getLength()) && (++__CLOVER_209_0.cloverRec.CT[5081]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5081]==0&false));i++)
		{{
			__CLOVER_209_0.cloverRec.S[18647]++;Node n = fils.item(i);
			//System.out.println("element=" + n.getNodeName());
			__CLOVER_209_0.cloverRec.S[18648]++;if ((((n instanceof Element) && (++__CLOVER_209_0.cloverRec.CT[5082]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5082]==0&false))) {{
				__CLOVER_209_0.cloverRec.S[18649]++;if ((((n.getNodeName() == "source") && (++__CLOVER_209_0.cloverRec.CT[5083]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5083]==0&false))) {{
					//System.out.println("source");
					__CLOVER_209_0.cloverRec.S[18650]++;source = creer_source((Element) n);
				}
				}else
				{{
					assert((((false)) && (++__CLOVER_209_0.cloverRec.CT[5084]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5084]==0&false));
				}
			}}
			}else {__CLOVER_209_0.cloverRec.S[18651]++;if ((((n instanceof Comment) && (++__CLOVER_209_0.cloverRec.CT[5085]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5085]==0&false))) {{
				
			}
			}else {__CLOVER_209_0.cloverRec.S[18652]++;if ((((n instanceof Text) && (++__CLOVER_209_0.cloverRec.CT[5086]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5086]==0&false))) {{
				__CLOVER_209_0.cloverRec.S[18653]++;String s = n.getNodeValue();
				assert((((s == "" || s.matches("[ \t\n]+"))) && (++__CLOVER_209_0.cloverRec.CT[5087]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5087]==0&false));
			}
			}else
				{assert((((false)) && (++__CLOVER_209_0.cloverRec.CT[5088]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5088]==0&false));
		}}}}
		}assert((((nom!=null)) && (++__CLOVER_209_0.cloverRec.CT[5089]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5089]==0&false));
		__CLOVER_209_0.cloverRec.S[18654]++;res=new CIInstruction_Goto(nom,source);
		__CLOVER_209_0.cloverRec.S[18655]++;return res;
	}

	public CIInstruction_Label creer_instruction_label(Element element)
	{__CLOVER_209_0.cloverRec.M[1246]++;
		__CLOVER_209_0.cloverRec.S[18656]++;int no,i,op;
		__CLOVER_209_0.cloverRec.S[18657]++;CIInstruction_Label res=null;
		__CLOVER_209_0.cloverRec.S[18658]++;CIType type=null;
		assert((((element!=null)) && (++__CLOVER_209_0.cloverRec.CT[5090]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5090]==0&false));
		assert((((element.getNodeName().equalsIgnoreCase("instr_label"))) && (++__CLOVER_209_0.cloverRec.CT[5091]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5091]==0&false));
		__CLOVER_209_0.cloverRec.S[18659]++;NodeList fils = element.getChildNodes();
		//assert(fils.getLength()>0);
		__CLOVER_209_0.cloverRec.S[18660]++;NamedNodeMap attributs = element.getAttributes();
		__CLOVER_209_0.cloverRec.S[18661]++;String nom="";
		__CLOVER_209_0.cloverRec.S[18662]++;CIExpr expr1=null;
		__CLOVER_209_0.cloverRec.S[18663]++;CISource source=null;

		__CLOVER_209_0.cloverRec.S[18664]++;for (i = 0; (((i < attributs.getLength()) && (++__CLOVER_209_0.cloverRec.CT[5092]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5092]==0&false)); i++) {{
			__CLOVER_209_0.cloverRec.S[18665]++;Node num\u00e9ro = attributs.item(i);
			__CLOVER_209_0.cloverRec.S[18666]++;String nomAttribut = num\u00e9ro.getNodeName();
			__CLOVER_209_0.cloverRec.S[18667]++;String valeurAttribut = num\u00e9ro.getNodeValue();
			__CLOVER_209_0.cloverRec.S[18668]++;System.out.println(nomAttribut + " =\"" + valeurAttribut + "\"");
			__CLOVER_209_0.cloverRec.S[18669]++;if ((((nomAttribut == "label") && (++__CLOVER_209_0.cloverRec.CT[5093]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5093]==0&false)))
				{__CLOVER_209_0.cloverRec.S[18670]++;nom=valeurAttribut;
			}else
				{assert((((false)) && (++__CLOVER_209_0.cloverRec.CT[5094]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5094]==0&false));
		}}
		}assert((((nom!=null)) && (++__CLOVER_209_0.cloverRec.CT[5095]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5095]==0&false));
		__CLOVER_209_0.cloverRec.S[18671]++;for(i=0;(((i<fils.getLength()) && (++__CLOVER_209_0.cloverRec.CT[5096]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5096]==0&false));i++)
		{{
			__CLOVER_209_0.cloverRec.S[18672]++;Node n = fils.item(i);
			//System.out.println("element=" + n.getNodeName());
			__CLOVER_209_0.cloverRec.S[18673]++;if ((((n instanceof Element) && (++__CLOVER_209_0.cloverRec.CT[5097]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5097]==0&false))) {{
				__CLOVER_209_0.cloverRec.S[18674]++;if ((((n.getNodeName() == "source") && (++__CLOVER_209_0.cloverRec.CT[5098]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5098]==0&false))) {{
					//System.out.println("source");
					__CLOVER_209_0.cloverRec.S[18675]++;source = creer_source((Element) n);
				}
				}else
					{assert((((false)) && (++__CLOVER_209_0.cloverRec.CT[5099]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5099]==0&false));
			}}
			}else {__CLOVER_209_0.cloverRec.S[18676]++;if ((((n instanceof Comment) && (++__CLOVER_209_0.cloverRec.CT[5100]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5100]==0&false))) {{
				
			}
			}else {__CLOVER_209_0.cloverRec.S[18677]++;if ((((n instanceof Text) && (++__CLOVER_209_0.cloverRec.CT[5101]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5101]==0&false))) {{
				__CLOVER_209_0.cloverRec.S[18678]++;String s = n.getNodeValue();
				assert((((s == "" || s.matches("[ \t\n]+"))) && (++__CLOVER_209_0.cloverRec.CT[5102]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5102]==0&false));
			}
			}else
				{assert((((false)) && (++__CLOVER_209_0.cloverRec.CT[5103]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5103]==0&false));
		}}}}
		}assert((((nom!=null)) && (++__CLOVER_209_0.cloverRec.CT[5104]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5104]==0&false));
		__CLOVER_209_0.cloverRec.S[18679]++;res=new CIInstruction_Label(nom,source);
		__CLOVER_209_0.cloverRec.S[18680]++;return res;
	}

	public CIInstruction_Return creer_instruction_return(Element element)
	{__CLOVER_209_0.cloverRec.M[1247]++;
		__CLOVER_209_0.cloverRec.S[18681]++;int no,i,op;
		__CLOVER_209_0.cloverRec.S[18682]++;CIInstruction_Return res=null;
		__CLOVER_209_0.cloverRec.S[18683]++;CIType type=null;
		assert((((element!=null)) && (++__CLOVER_209_0.cloverRec.CT[5105]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5105]==0&false));
		assert((((element.getNodeName().equalsIgnoreCase("instr_return"))) && (++__CLOVER_209_0.cloverRec.CT[5106]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5106]==0&false));
		__CLOVER_209_0.cloverRec.S[18684]++;NodeList fils = element.getChildNodes();
		//assert(fils.getLength()>0);
		__CLOVER_209_0.cloverRec.S[18685]++;NamedNodeMap attributs = element.getAttributes();
		__CLOVER_209_0.cloverRec.S[18686]++;String nom="";
		__CLOVER_209_0.cloverRec.S[18687]++;CIExpr expr1=null;
		__CLOVER_209_0.cloverRec.S[18688]++;CISource source=null;

		assert((((attributs.getLength()==0)) && (++__CLOVER_209_0.cloverRec.CT[5107]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5107]==0&false));
		__CLOVER_209_0.cloverRec.S[18689]++;for(i=0;(((i<fils.getLength()) && (++__CLOVER_209_0.cloverRec.CT[5108]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5108]==0&false));i++)
		{{
			__CLOVER_209_0.cloverRec.S[18690]++;Node n = fils.item(i);
			//System.out.println("element=" + n.getNodeName());
			__CLOVER_209_0.cloverRec.S[18691]++;if ((((n instanceof Element) && (++__CLOVER_209_0.cloverRec.CT[5109]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5109]==0&false))) {{
				__CLOVER_209_0.cloverRec.S[18692]++;if ((((n.getNodeName() == "source") && (++__CLOVER_209_0.cloverRec.CT[5110]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5110]==0&false))) {{
					//System.out.println("source");
					__CLOVER_209_0.cloverRec.S[18693]++;source = creer_source((Element) n);
				}
				}else
					{assert((((false)) && (++__CLOVER_209_0.cloverRec.CT[5111]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5111]==0&false));
			}}
			}else {__CLOVER_209_0.cloverRec.S[18694]++;if ((((n instanceof Comment) && (++__CLOVER_209_0.cloverRec.CT[5112]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5112]==0&false))) {{
				
			}
			}else {__CLOVER_209_0.cloverRec.S[18695]++;if ((((n instanceof Text) && (++__CLOVER_209_0.cloverRec.CT[5113]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5113]==0&false))) {{
				__CLOVER_209_0.cloverRec.S[18696]++;String s = n.getNodeValue();
				assert((((s == "" || s.matches("[ \t\n]+"))) && (++__CLOVER_209_0.cloverRec.CT[5114]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5114]==0&false));
			}
			}else
				{assert((((false)) && (++__CLOVER_209_0.cloverRec.CT[5115]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5115]==0&false));
		}}}}
		}__CLOVER_209_0.cloverRec.S[18697]++;res=new CIInstruction_Return(source);
		__CLOVER_209_0.cloverRec.S[18698]++;return res;
	}

	public CIInstruction_Raise creer_instruction_raise(Element element)
	{__CLOVER_209_0.cloverRec.M[1248]++;
		__CLOVER_209_0.cloverRec.S[18699]++;int i,op;
		__CLOVER_209_0.cloverRec.S[18700]++;CIInstruction_Raise res=null;
		__CLOVER_209_0.cloverRec.S[18701]++;CIType type=null;
		assert((((element!=null)) && (++__CLOVER_209_0.cloverRec.CT[5116]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5116]==0&false));
		assert((((element.getNodeName().equalsIgnoreCase("instr_raise"))) && (++__CLOVER_209_0.cloverRec.CT[5117]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5117]==0&false));
		__CLOVER_209_0.cloverRec.S[18702]++;NodeList fils = element.getChildNodes();
		//assert(fils.getLength()>0);
		__CLOVER_209_0.cloverRec.S[18703]++;NamedNodeMap attributs = element.getAttributes();
		__CLOVER_209_0.cloverRec.S[18704]++;CIExpr no=null,nom=null,e;
		__CLOVER_209_0.cloverRec.S[18705]++;CISource source=null;

		__CLOVER_209_0.cloverRec.S[18706]++;for(i=0;(((i<fils.getLength()) && (++__CLOVER_209_0.cloverRec.CT[5118]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5118]==0&false));i++)
		{{
			__CLOVER_209_0.cloverRec.S[18707]++;Node n = fils.item(i);
			//System.out.println("element=" + n.getNodeName());
			__CLOVER_209_0.cloverRec.S[18708]++;if ((((n instanceof Element) && (++__CLOVER_209_0.cloverRec.CT[5119]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5119]==0&false))) {{
				__CLOVER_209_0.cloverRec.S[18709]++;if ((((n.getNodeName() == "expression") && (++__CLOVER_209_0.cloverRec.CT[5120]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5120]==0&false))) {{
					//System.out.println("heritage");
					__CLOVER_209_0.cloverRec.S[18710]++;e=creer_expr((Element) n);
					assert((((e!=null)) && (++__CLOVER_209_0.cloverRec.CT[5121]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5121]==0&false));
					__CLOVER_209_0.cloverRec.S[18711]++;if((((no==null) && (++__CLOVER_209_0.cloverRec.CT[5122]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5122]==0&false)))
						{__CLOVER_209_0.cloverRec.S[18712]++;no=e;
					}else
						{__CLOVER_209_0.cloverRec.S[18713]++;nom=e;
				}}
				}else {__CLOVER_209_0.cloverRec.S[18714]++;if ((((n.getNodeName() == "source") && (++__CLOVER_209_0.cloverRec.CT[5123]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5123]==0&false))) {{
					//System.out.println("source");
					__CLOVER_209_0.cloverRec.S[18715]++;source = creer_source((Element) n);
				}
				}else
					{assert((((false)) && (++__CLOVER_209_0.cloverRec.CT[5124]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5124]==0&false));
			}}}
			}else {__CLOVER_209_0.cloverRec.S[18716]++;if ((((n instanceof Comment) && (++__CLOVER_209_0.cloverRec.CT[5125]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5125]==0&false))) {{
				
			}
			}else {__CLOVER_209_0.cloverRec.S[18717]++;if ((((n instanceof Text) && (++__CLOVER_209_0.cloverRec.CT[5126]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5126]==0&false))) {{
				__CLOVER_209_0.cloverRec.S[18718]++;String s = n.getNodeValue();
				assert((((s == "" || s.matches("[ \t\n]+"))) && (++__CLOVER_209_0.cloverRec.CT[5127]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5127]==0&false));
			}
			}else
				{assert((((false)) && (++__CLOVER_209_0.cloverRec.CT[5128]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5128]==0&false));
		}}}}
		}assert((((no!=null)) && (++__CLOVER_209_0.cloverRec.CT[5129]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5129]==0&false));
		__CLOVER_209_0.cloverRec.S[18719]++;if((((nom==null) && (++__CLOVER_209_0.cloverRec.CT[5130]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5130]==0&false)))
			{__CLOVER_209_0.cloverRec.S[18720]++;res=new CIInstruction_Raise(no,source);
		}else
			{__CLOVER_209_0.cloverRec.S[18721]++;res=new CIInstruction_Raise(no,nom,source);
		}__CLOVER_209_0.cloverRec.S[18722]++;return res;
	}

	/*******************************/
	
	public String[] creer_test_elt(Element element)
	{__CLOVER_209_0.cloverRec.M[1249]++;
		assert((((element != null)) && (++__CLOVER_209_0.cloverRec.CT[5131]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5131]==0&false));
		assert((((element.getNodeName() == "test")) && (++__CLOVER_209_0.cloverRec.CT[5132]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5132]==0&false));
		__CLOVER_209_0.cloverRec.S[18723]++;NamedNodeMap attributs = element.getAttributes();
		__CLOVER_209_0.cloverRec.S[18724]++;String source="",ref="",src_xml="",res[];
		
		__CLOVER_209_0.cloverRec.S[18725]++;for (int i = 0; (((i < attributs.getLength()) && (++__CLOVER_209_0.cloverRec.CT[5133]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5133]==0&false)); i++) {{
			__CLOVER_209_0.cloverRec.S[18726]++;Node num\u00e9ro = attributs.item(i);
			__CLOVER_209_0.cloverRec.S[18727]++;String nomAttribut = num\u00e9ro.getNodeName();
			__CLOVER_209_0.cloverRec.S[18728]++;String valeurAttribut = num\u00e9ro.getNodeValue();
			__CLOVER_209_0.cloverRec.S[18729]++;System.out.println(nomAttribut + " =\"" + valeurAttribut + "\"");
			__CLOVER_209_0.cloverRec.S[18730]++;if ((((nomAttribut == "source") && (++__CLOVER_209_0.cloverRec.CT[5134]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5134]==0&false)))
				{__CLOVER_209_0.cloverRec.S[18731]++;source = valeurAttribut;
			}else {__CLOVER_209_0.cloverRec.S[18732]++;if ((((nomAttribut == "source") && (++__CLOVER_209_0.cloverRec.CT[5135]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5135]==0&false)))
				{__CLOVER_209_0.cloverRec.S[18733]++;src_xml = valeurAttribut;
			}else {__CLOVER_209_0.cloverRec.S[18734]++;if ((((nomAttribut == "reference") && (++__CLOVER_209_0.cloverRec.CT[5136]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5136]==0&false)))
				{__CLOVER_209_0.cloverRec.S[18735]++;ref = valeurAttribut;
			}else
				{assert((((false)) && (++__CLOVER_209_0.cloverRec.CT[5137]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5137]==0&false));
		}}}}
		}assert((((source!=null)) && (++__CLOVER_209_0.cloverRec.CT[5138]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5138]==0&false));
		assert((((ref!=null)) && (++__CLOVER_209_0.cloverRec.CT[5139]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5139]==0&false));
		//System.out.println("methode 1:");
		__CLOVER_209_0.cloverRec.S[18736]++;NodeList fils = element.getChildNodes();
		__CLOVER_209_0.cloverRec.S[18737]++;int i;
		__CLOVER_209_0.cloverRec.S[18738]++;for (i = 0; (((i < fils.getLength()) && (++__CLOVER_209_0.cloverRec.CT[5140]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5140]==0&false)); i++) {{
			__CLOVER_209_0.cloverRec.S[18739]++;Node n = fils.item(i);
			//System.out.println("element=" + n.getNodeName());
			 __CLOVER_209_0.cloverRec.S[18740]++;if ((((n instanceof Text) && (++__CLOVER_209_0.cloverRec.CT[5141]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5141]==0&false))) {{
				__CLOVER_209_0.cloverRec.S[18741]++;String s = n.getNodeValue();
				assert((((s == "" || s.matches("[ \t\n]+"))) && (++__CLOVER_209_0.cloverRec.CT[5142]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5142]==0&false));
			} }else {{
				assert((((false)) && (++__CLOVER_209_0.cloverRec.CT[5143]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5143]==0&false));
			}
		}}

		}__CLOVER_209_0.cloverRec.S[18742]++;res=new String[3];
		__CLOVER_209_0.cloverRec.S[18743]++;res[0]=source;
		__CLOVER_209_0.cloverRec.S[18744]++;res[1]=src_xml;
		__CLOVER_209_0.cloverRec.S[18745]++;res[2]=ref;
		/*System.out.println("methode 2:");
		Node node=element.getFirstChild();
		while(node!=null)
		{
		  Node n=node;
		  System.out.println("element="+n.getNodeName());
		  node=node.getNextSibling();
		}*/
		assert((((ref!=null)) && (++__CLOVER_209_0.cloverRec.CT[5144]!=0|true)) || (++__CLOVER_209_0.cloverRec.CF[5144]==0&false));

		__CLOVER_209_0.cloverRec.S[18746]++;return res;
	}

	public String nom;
	public CIProgramme programme;

}
