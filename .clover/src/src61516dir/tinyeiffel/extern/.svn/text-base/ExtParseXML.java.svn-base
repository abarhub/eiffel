/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ *//*
 * Created on 28 mars 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package tinyeiffel.extern;

import java.io.*;
import java.util.*;

import javax.xml.parsers.*;

import org.w3c.dom.*;
import org.xml.sax.*;

/**
 * @author Barret
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class ExtParseXML {static class __CLOVER_177_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}

	public ExtParseXML(String nom) {__CLOVER_177_0.cloverRec.M[1008]++;
		assert((((nom!=null)) && (++__CLOVER_177_0.cloverRec.CT[3600]!=0|true)) || (++__CLOVER_177_0.cloverRec.CF[3600]==0&false));
		__CLOVER_177_0.cloverRec.S[15024]++;this.nom=nom;
		__CLOVER_177_0.cloverRec.S[15025]++;parse_XML(nom);
	}
	
	public void parse_XML(String nom)
	{__CLOVER_177_0.cloverRec.M[1009]++;
		__CLOVER_177_0.cloverRec.S[15026]++;ExtModule res=null;
		__CLOVER_177_0.cloverRec.S[15027]++;File f;
		__CLOVER_177_0.cloverRec.S[15028]++;int no;
		assert((((nom!=null)) && (++__CLOVER_177_0.cloverRec.CT[3601]!=0|true)) || (++__CLOVER_177_0.cloverRec.CF[3601]==0&false));
		__CLOVER_177_0.cloverRec.S[15029]++;try {
			/* jasp */
			//R\u00e9cup\u00e8re une instance de la classe de fabrication
			__CLOVER_177_0.cloverRec.S[15030]++;DocumentBuilderFactory factory =
				DocumentBuilderFactory.newInstance();
			//R\u00e9cup\u00e9re une instance de la classe DocumentBuilder (sp\u00e9cifique vendeur)
			__CLOVER_177_0.cloverRec.S[15031]++;DocumentBuilder parser = factory.newDocumentBuilder();
			//effectue le parsing avec r\u00e9cup\u00e9ration du noeud DOM Document
			__CLOVER_177_0.cloverRec.S[15032]++;Document document = parser.parse(nom);

			__CLOVER_177_0.cloverRec.S[15033]++;Element catalogue = document.getDocumentElement();

			__CLOVER_177_0.cloverRec.S[15034]++;NodeList titres = catalogue.getElementsByTagName("test");
			__CLOVER_177_0.cloverRec.S[15035]++;System.out.println(
				"Nombre d'element dans la racine : " + titres.getLength());
			__CLOVER_177_0.cloverRec.S[15036]++;System.out.println("nom=" + catalogue.getNodeName());
			__CLOVER_177_0.cloverRec.S[15037]++;System.out.println("nom=" + catalogue.getFirstChild());
			__CLOVER_177_0.cloverRec.S[15038]++;System.out.println(
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
			__CLOVER_177_0.cloverRec.S[15039]++;res=creer_module(catalogue);
			assert((((res!=null)) && (++__CLOVER_177_0.cloverRec.CT[3602]!=0|true)) || (++__CLOVER_177_0.cloverRec.CF[3602]==0&false));
		} catch (FactoryConfigurationError e) {
			// unable to get a document builder factory
			__CLOVER_177_0.cloverRec.S[15040]++;e.printStackTrace();
			__CLOVER_177_0.cloverRec.S[15041]++;System.err.println("Erreur de configuration du factory");
			__CLOVER_177_0.cloverRec.S[15042]++;System.exit(1);
		} catch (ParserConfigurationException e) {
			// parser was unable to be configured
			__CLOVER_177_0.cloverRec.S[15043]++;e.printStackTrace();
			__CLOVER_177_0.cloverRec.S[15044]++;System.err.println("Erreur de configuration du parser");
			__CLOVER_177_0.cloverRec.S[15045]++;System.exit(1);
		} catch (SAXException e) {
			// parsing error
			__CLOVER_177_0.cloverRec.S[15046]++;System.err.println("Exception Sax:"+e+"("+nom+")");
			__CLOVER_177_0.cloverRec.S[15047]++;e.printStackTrace();
			__CLOVER_177_0.cloverRec.S[15048]++;System.exit(1);
		} catch (IOException e) {
			// i/o error
			__CLOVER_177_0.cloverRec.S[15049]++;e.printStackTrace();
			__CLOVER_177_0.cloverRec.S[15050]++;System.err.println("Erreur d'entree sortie");
			__CLOVER_177_0.cloverRec.S[15051]++;System.exit(1);
		}
		__CLOVER_177_0.cloverRec.S[15052]++;module=res;
	}

	public ExtModule creer_module(Element element)
	{__CLOVER_177_0.cloverRec.M[1010]++;
		__CLOVER_177_0.cloverRec.S[15053]++;int i;
		__CLOVER_177_0.cloverRec.S[15054]++;ExtModule res;
		__CLOVER_177_0.cloverRec.S[15055]++;ExtRoutine r;
		__CLOVER_177_0.cloverRec.S[15056]++;ExtClasse cl;
		__CLOVER_177_0.cloverRec.S[15057]++;Vector v;
		__CLOVER_177_0.cloverRec.S[15058]++;String nom=null;
		assert((((element!=null)) && (++__CLOVER_177_0.cloverRec.CT[3603]!=0|true)) || (++__CLOVER_177_0.cloverRec.CF[3603]==0&false));
		assert((((element.getNodeName().equalsIgnoreCase("module"))) && (++__CLOVER_177_0.cloverRec.CT[3604]!=0|true)) || (++__CLOVER_177_0.cloverRec.CF[3604]==0&false));
		__CLOVER_177_0.cloverRec.S[15059]++;NodeList fils = element.getChildNodes();
		__CLOVER_177_0.cloverRec.S[15060]++;NamedNodeMap attributs = element.getAttributes();

		__CLOVER_177_0.cloverRec.S[15061]++;for (i = 0; (((i < attributs.getLength()) && (++__CLOVER_177_0.cloverRec.CT[3605]!=0|true)) || (++__CLOVER_177_0.cloverRec.CF[3605]==0&false)); i++) {{
			__CLOVER_177_0.cloverRec.S[15062]++;Node num\u00e9ro = attributs.item(i);
			__CLOVER_177_0.cloverRec.S[15063]++;String nomAttribut = num\u00e9ro.getNodeName();
			__CLOVER_177_0.cloverRec.S[15064]++;String valeurAttribut = num\u00e9ro.getNodeValue();
			__CLOVER_177_0.cloverRec.S[15065]++;System.out.println(nomAttribut + " =\"" + valeurAttribut + "\"");
			__CLOVER_177_0.cloverRec.S[15066]++;if ((((nomAttribut == "nom") && (++__CLOVER_177_0.cloverRec.CT[3606]!=0|true)) || (++__CLOVER_177_0.cloverRec.CF[3606]==0&false)))
				{__CLOVER_177_0.cloverRec.S[15067]++;nom = nomAttribut;
			}else
				{assert((((false)) && (++__CLOVER_177_0.cloverRec.CT[3607]!=0|true)) || (++__CLOVER_177_0.cloverRec.CF[3607]==0&false));
		}}
		}assert((((nom!=null)) && (++__CLOVER_177_0.cloverRec.CT[3608]!=0|true)) || (++__CLOVER_177_0.cloverRec.CF[3608]==0&false));
		__CLOVER_177_0.cloverRec.S[15068]++;res=new ExtModule(nom);
		__CLOVER_177_0.cloverRec.S[15069]++;v=new Vector();
		__CLOVER_177_0.cloverRec.S[15070]++;for(i=0;(((i<fils.getLength()) && (++__CLOVER_177_0.cloverRec.CT[3609]!=0|true)) || (++__CLOVER_177_0.cloverRec.CF[3609]==0&false));i++)
		{{
			__CLOVER_177_0.cloverRec.S[15071]++;Node n = fils.item(i);
			//System.out.println("element=" + n.getNodeName());
			__CLOVER_177_0.cloverRec.S[15072]++;if ((((n instanceof Element) && (++__CLOVER_177_0.cloverRec.CT[3610]!=0|true)) || (++__CLOVER_177_0.cloverRec.CF[3610]==0&false))) {{
				__CLOVER_177_0.cloverRec.S[15073]++;if ((((n.getNodeName() == "routine") && (++__CLOVER_177_0.cloverRec.CT[3611]!=0|true)) || (++__CLOVER_177_0.cloverRec.CF[3611]==0&false))) {{
					//System.out.println("heritage");
					__CLOVER_177_0.cloverRec.S[15074]++;r = creer_routine((Element) n);
					__CLOVER_177_0.cloverRec.S[15075]++;res.ajoute_routine(r);
				}
				}else {__CLOVER_177_0.cloverRec.S[15076]++;if ((((n.getNodeName() == "classe") && (++__CLOVER_177_0.cloverRec.CT[3612]!=0|true)) || (++__CLOVER_177_0.cloverRec.CF[3612]==0&false))) {{
					//System.out.println("heritage");
					__CLOVER_177_0.cloverRec.S[15077]++;cl = creer_classe((Element) n);
					__CLOVER_177_0.cloverRec.S[15078]++;res.ajoute_classe(cl);
				}
				}else
					{assert((((false)) && (++__CLOVER_177_0.cloverRec.CT[3613]!=0|true)) || (++__CLOVER_177_0.cloverRec.CF[3613]==0&false));
			}}}
			}else {__CLOVER_177_0.cloverRec.S[15079]++;if ((((n instanceof Comment) && (++__CLOVER_177_0.cloverRec.CT[3614]!=0|true)) || (++__CLOVER_177_0.cloverRec.CF[3614]==0&false))) {{
				
			}
			}else {__CLOVER_177_0.cloverRec.S[15080]++;if ((((n instanceof Text) && (++__CLOVER_177_0.cloverRec.CT[3615]!=0|true)) || (++__CLOVER_177_0.cloverRec.CF[3615]==0&false))) {{
				__CLOVER_177_0.cloverRec.S[15081]++;String s = n.getNodeValue();
				assert((((s == "" || s.matches("[ \t\n]+"))) && (++__CLOVER_177_0.cloverRec.CT[3616]!=0|true)) || (++__CLOVER_177_0.cloverRec.CF[3616]==0&false));
			}
			}else
				{assert((((false)) && (++__CLOVER_177_0.cloverRec.CT[3617]!=0|true)) || (++__CLOVER_177_0.cloverRec.CF[3617]==0&false));
		}}}}
		}__CLOVER_177_0.cloverRec.S[15082]++;return res;
	}


	public ExtRoutine creer_routine(Element element)
	{__CLOVER_177_0.cloverRec.M[1011]++;
		__CLOVER_177_0.cloverRec.S[15083]++;int i;
		__CLOVER_177_0.cloverRec.S[15084]++;ExtRoutine res;
		__CLOVER_177_0.cloverRec.S[15085]++;Vector v;
		__CLOVER_177_0.cloverRec.S[15086]++;String nom=null;
		__CLOVER_177_0.cloverRec.S[15087]++;ExtType t,liste_type[];
		assert((((element!=null)) && (++__CLOVER_177_0.cloverRec.CT[3618]!=0|true)) || (++__CLOVER_177_0.cloverRec.CF[3618]==0&false));
		assert((((element.getNodeName().equalsIgnoreCase("routine"))) && (++__CLOVER_177_0.cloverRec.CT[3619]!=0|true)) || (++__CLOVER_177_0.cloverRec.CF[3619]==0&false));
		__CLOVER_177_0.cloverRec.S[15088]++;NodeList fils = element.getChildNodes();
		__CLOVER_177_0.cloverRec.S[15089]++;NamedNodeMap attributs = element.getAttributes();
		__CLOVER_177_0.cloverRec.S[15090]++;boolean fonction=false;

		__CLOVER_177_0.cloverRec.S[15091]++;for (i = 0; (((i < attributs.getLength()) && (++__CLOVER_177_0.cloverRec.CT[3620]!=0|true)) || (++__CLOVER_177_0.cloverRec.CF[3620]==0&false)); i++) {{
			__CLOVER_177_0.cloverRec.S[15092]++;Node num\u00e9ro = attributs.item(i);
			__CLOVER_177_0.cloverRec.S[15093]++;String nomAttribut = num\u00e9ro.getNodeName();
			__CLOVER_177_0.cloverRec.S[15094]++;String valeurAttribut = num\u00e9ro.getNodeValue();
			__CLOVER_177_0.cloverRec.S[15095]++;System.out.println(nomAttribut + " =\"" + valeurAttribut + "\"");
			__CLOVER_177_0.cloverRec.S[15096]++;if ((((nomAttribut == "nom") && (++__CLOVER_177_0.cloverRec.CT[3621]!=0|true)) || (++__CLOVER_177_0.cloverRec.CF[3621]==0&false)))
				{__CLOVER_177_0.cloverRec.S[15097]++;nom = nomAttribut;
			}__CLOVER_177_0.cloverRec.S[15098]++;if ((((nomAttribut == "fonction") && (++__CLOVER_177_0.cloverRec.CT[3622]!=0|true)) || (++__CLOVER_177_0.cloverRec.CF[3622]==0&false)))
				{__CLOVER_177_0.cloverRec.S[15099]++;fonction=nomAttribut.equalsIgnoreCase("oui");
			}else
				{assert((((false)) && (++__CLOVER_177_0.cloverRec.CT[3623]!=0|true)) || (++__CLOVER_177_0.cloverRec.CF[3623]==0&false));
		}}
		}assert((((nom!=null)) && (++__CLOVER_177_0.cloverRec.CT[3624]!=0|true)) || (++__CLOVER_177_0.cloverRec.CF[3624]==0&false));
		__CLOVER_177_0.cloverRec.S[15100]++;v=new Vector();
		__CLOVER_177_0.cloverRec.S[15101]++;for(i=0;(((i<fils.getLength()) && (++__CLOVER_177_0.cloverRec.CT[3625]!=0|true)) || (++__CLOVER_177_0.cloverRec.CF[3625]==0&false));i++)
		{{
			__CLOVER_177_0.cloverRec.S[15102]++;Node n = fils.item(i);
			//System.out.println("element=" + n.getNodeName());
			__CLOVER_177_0.cloverRec.S[15103]++;if ((((n instanceof Element) && (++__CLOVER_177_0.cloverRec.CT[3626]!=0|true)) || (++__CLOVER_177_0.cloverRec.CF[3626]==0&false))) {{
				__CLOVER_177_0.cloverRec.S[15104]++;if ((((n.getNodeName() == "type") && (++__CLOVER_177_0.cloverRec.CT[3627]!=0|true)) || (++__CLOVER_177_0.cloverRec.CF[3627]==0&false))) {{
					//System.out.println("heritage");
					__CLOVER_177_0.cloverRec.S[15105]++;t = creer_type((Element) n);
					__CLOVER_177_0.cloverRec.S[15106]++;v.addElement(t);
				}
				}else
					{assert((((false)) && (++__CLOVER_177_0.cloverRec.CT[3628]!=0|true)) || (++__CLOVER_177_0.cloverRec.CF[3628]==0&false));
			}}
			}else {__CLOVER_177_0.cloverRec.S[15107]++;if ((((n instanceof Comment) && (++__CLOVER_177_0.cloverRec.CT[3629]!=0|true)) || (++__CLOVER_177_0.cloverRec.CF[3629]==0&false))) {{
				
			}
			}else {__CLOVER_177_0.cloverRec.S[15108]++;if ((((n instanceof Text) && (++__CLOVER_177_0.cloverRec.CT[3630]!=0|true)) || (++__CLOVER_177_0.cloverRec.CF[3630]==0&false))) {{
				__CLOVER_177_0.cloverRec.S[15109]++;String s = n.getNodeValue();
				assert((((s == "" || s.matches("[ \t\n]+"))) && (++__CLOVER_177_0.cloverRec.CT[3631]!=0|true)) || (++__CLOVER_177_0.cloverRec.CF[3631]==0&false));
			}
			}else
				{assert((((false)) && (++__CLOVER_177_0.cloverRec.CT[3632]!=0|true)) || (++__CLOVER_177_0.cloverRec.CF[3632]==0&false));
		}}}}
		}__CLOVER_177_0.cloverRec.S[15110]++;if((((fonction) && (++__CLOVER_177_0.cloverRec.CT[3633]!=0|true)) || (++__CLOVER_177_0.cloverRec.CF[3633]==0&false)))
		{{
			assert((((v.size()>0)) && (++__CLOVER_177_0.cloverRec.CT[3634]!=0|true)) || (++__CLOVER_177_0.cloverRec.CF[3634]==0&false));
			__CLOVER_177_0.cloverRec.S[15111]++;i=v.size()-1;
			__CLOVER_177_0.cloverRec.S[15112]++;t=(ExtType)v.elementAt(i);
			__CLOVER_177_0.cloverRec.S[15113]++;v.removeElementAt(i);
		}
		}else
		{{
			__CLOVER_177_0.cloverRec.S[15114]++;t=null;
		}
		}__CLOVER_177_0.cloverRec.S[15115]++;if((((v.size()>0) && (++__CLOVER_177_0.cloverRec.CT[3635]!=0|true)) || (++__CLOVER_177_0.cloverRec.CF[3635]==0&false)))
		{{
			__CLOVER_177_0.cloverRec.S[15116]++;liste_type=new ExtType[v.size()];
			__CLOVER_177_0.cloverRec.S[15117]++;v.copyInto(liste_type);
		}
		}else
		{{
			__CLOVER_177_0.cloverRec.S[15118]++;liste_type=null;
		}
		}__CLOVER_177_0.cloverRec.S[15119]++;res=new ExtRoutine(nom,liste_type,t);
		__CLOVER_177_0.cloverRec.S[15120]++;return res;
	}

	public ExtType creer_type(Element element)
	{__CLOVER_177_0.cloverRec.M[1012]++;
		__CLOVER_177_0.cloverRec.S[15121]++;int no,i,len,j;
		__CLOVER_177_0.cloverRec.S[15122]++;ExtType res;
		__CLOVER_177_0.cloverRec.S[15123]++;Vector v;
		__CLOVER_177_0.cloverRec.S[15124]++;String nom=null;
		__CLOVER_177_0.cloverRec.S[15125]++;ExtType t,liste_type[];
		assert((((element!=null)) && (++__CLOVER_177_0.cloverRec.CT[3636]!=0|true)) || (++__CLOVER_177_0.cloverRec.CF[3636]==0&false));
		assert((((element.getNodeName().equalsIgnoreCase("type"))) && (++__CLOVER_177_0.cloverRec.CT[3637]!=0|true)) || (++__CLOVER_177_0.cloverRec.CF[3637]==0&false));
		__CLOVER_177_0.cloverRec.S[15126]++;NodeList fils = element.getChildNodes();
		//assert(fils.getLength()>0);
		__CLOVER_177_0.cloverRec.S[15127]++;NamedNodeMap attributs = element.getAttributes();
		//String nom="",fichier=null;//'"('"\u00e9('"-('\u00e8-"(')
		__CLOVER_177_0.cloverRec.S[15128]++;boolean fonction=false;
		__CLOVER_177_0.cloverRec.S[15129]++;no=0;

		__CLOVER_177_0.cloverRec.S[15130]++;for (i = 0; (((i < attributs.getLength()) && (++__CLOVER_177_0.cloverRec.CT[3638]!=0|true)) || (++__CLOVER_177_0.cloverRec.CF[3638]==0&false)); i++) {{
			__CLOVER_177_0.cloverRec.S[15131]++;Node num\u00e9ro = attributs.item(i);
			__CLOVER_177_0.cloverRec.S[15132]++;String nomAttribut = num\u00e9ro.getNodeName();
			__CLOVER_177_0.cloverRec.S[15133]++;String valeurAttribut = num\u00e9ro.getNodeValue();
			__CLOVER_177_0.cloverRec.S[15134]++;System.out.println(nomAttribut + " =\"" + valeurAttribut + "\"");
			__CLOVER_177_0.cloverRec.S[15135]++;if ((((nomAttribut == "nom") && (++__CLOVER_177_0.cloverRec.CT[3639]!=0|true)) || (++__CLOVER_177_0.cloverRec.CF[3639]==0&false)))
				{__CLOVER_177_0.cloverRec.S[15136]++;nom = nomAttribut;
			}__CLOVER_177_0.cloverRec.S[15137]++;if ((((nomAttribut == "fonction") && (++__CLOVER_177_0.cloverRec.CT[3640]!=0|true)) || (++__CLOVER_177_0.cloverRec.CF[3640]==0&false)))
				{__CLOVER_177_0.cloverRec.S[15138]++;fonction=nomAttribut.equalsIgnoreCase("oui");
			}else
				{assert((((false)) && (++__CLOVER_177_0.cloverRec.CT[3641]!=0|true)) || (++__CLOVER_177_0.cloverRec.CF[3641]==0&false));
		}}
		}assert((((nom!=null)) && (++__CLOVER_177_0.cloverRec.CT[3642]!=0|true)) || (++__CLOVER_177_0.cloverRec.CF[3642]==0&false));
		assert((((fils.getLength()==0)) && (++__CLOVER_177_0.cloverRec.CT[3643]!=0|true)) || (++__CLOVER_177_0.cloverRec.CF[3643]==0&false));
		__CLOVER_177_0.cloverRec.S[15139]++;res=new ExtType(nom);
		__CLOVER_177_0.cloverRec.S[15140]++;return res;
	}

	public ExtClasse creer_classe(Element element)
	{__CLOVER_177_0.cloverRec.M[1013]++;
		__CLOVER_177_0.cloverRec.S[15141]++;int no,i,len,j;
		__CLOVER_177_0.cloverRec.S[15142]++;ExtClasse res;
		__CLOVER_177_0.cloverRec.S[15143]++;Vector v;
		__CLOVER_177_0.cloverRec.S[15144]++;String nom=null;
		//boolean heritage[][],heritage_directe[][];
		__CLOVER_177_0.cloverRec.S[15145]++;ExtType t,liste_type[];
		assert((((element!=null)) && (++__CLOVER_177_0.cloverRec.CT[3644]!=0|true)) || (++__CLOVER_177_0.cloverRec.CF[3644]==0&false));
		assert((((element.getNodeName().equalsIgnoreCase("classe"))) && (++__CLOVER_177_0.cloverRec.CT[3645]!=0|true)) || (++__CLOVER_177_0.cloverRec.CF[3645]==0&false));
		__CLOVER_177_0.cloverRec.S[15146]++;NodeList fils = element.getChildNodes();
		//assert(fils.getLength()>0);
		__CLOVER_177_0.cloverRec.S[15147]++;NamedNodeMap attributs = element.getAttributes();
		//String nom="",fichier=null;//'"('"\u00e9('"-('\u00e8-"(')
		__CLOVER_177_0.cloverRec.S[15148]++;boolean fonction=false;
		__CLOVER_177_0.cloverRec.S[15149]++;ExtAttribut liste_attribut[], a;
		__CLOVER_177_0.cloverRec.S[15150]++;no=0;

		__CLOVER_177_0.cloverRec.S[15151]++;for (i = 0; (((i < attributs.getLength()) && (++__CLOVER_177_0.cloverRec.CT[3646]!=0|true)) || (++__CLOVER_177_0.cloverRec.CF[3646]==0&false)); i++) {{
			__CLOVER_177_0.cloverRec.S[15152]++;Node num\u00e9ro = attributs.item(i);
			__CLOVER_177_0.cloverRec.S[15153]++;String nomAttribut = num\u00e9ro.getNodeName();
			__CLOVER_177_0.cloverRec.S[15154]++;String valeurAttribut = num\u00e9ro.getNodeValue();
			__CLOVER_177_0.cloverRec.S[15155]++;System.out.println(nomAttribut + " =\"" + valeurAttribut + "\"");
			__CLOVER_177_0.cloverRec.S[15156]++;if ((((nomAttribut == "nom") && (++__CLOVER_177_0.cloverRec.CT[3647]!=0|true)) || (++__CLOVER_177_0.cloverRec.CF[3647]==0&false)))
				{__CLOVER_177_0.cloverRec.S[15157]++;nom = nomAttribut;
			}__CLOVER_177_0.cloverRec.S[15158]++;if ((((nomAttribut == "fonction") && (++__CLOVER_177_0.cloverRec.CT[3648]!=0|true)) || (++__CLOVER_177_0.cloverRec.CF[3648]==0&false)))
				{__CLOVER_177_0.cloverRec.S[15159]++;fonction=nomAttribut.equalsIgnoreCase("oui");
			}else
				{assert((((false)) && (++__CLOVER_177_0.cloverRec.CT[3649]!=0|true)) || (++__CLOVER_177_0.cloverRec.CF[3649]==0&false));
		}}
		}assert((((nom!=null)) && (++__CLOVER_177_0.cloverRec.CT[3650]!=0|true)) || (++__CLOVER_177_0.cloverRec.CF[3650]==0&false));
		__CLOVER_177_0.cloverRec.S[15160]++;v=new Vector();
		__CLOVER_177_0.cloverRec.S[15161]++;for(i=0;(((i<fils.getLength()) && (++__CLOVER_177_0.cloverRec.CT[3651]!=0|true)) || (++__CLOVER_177_0.cloverRec.CF[3651]==0&false));i++)
		{{
			__CLOVER_177_0.cloverRec.S[15162]++;Node n = fils.item(i);
			//System.out.println("element=" + n.getNodeName());
			__CLOVER_177_0.cloverRec.S[15163]++;if ((((n instanceof Element) && (++__CLOVER_177_0.cloverRec.CT[3652]!=0|true)) || (++__CLOVER_177_0.cloverRec.CF[3652]==0&false))) {{
				__CLOVER_177_0.cloverRec.S[15164]++;if ((((n.getNodeName() == "attribut") && (++__CLOVER_177_0.cloverRec.CT[3653]!=0|true)) || (++__CLOVER_177_0.cloverRec.CF[3653]==0&false))) {{
					//System.out.println("heritage");
					__CLOVER_177_0.cloverRec.S[15165]++;a = creer_attribut((Element) n);
					__CLOVER_177_0.cloverRec.S[15166]++;v.addElement(a);
				}
				}else
					{assert((((false)) && (++__CLOVER_177_0.cloverRec.CT[3654]!=0|true)) || (++__CLOVER_177_0.cloverRec.CF[3654]==0&false));
			}}
			}else {__CLOVER_177_0.cloverRec.S[15167]++;if ((((n instanceof Comment) && (++__CLOVER_177_0.cloverRec.CT[3655]!=0|true)) || (++__CLOVER_177_0.cloverRec.CF[3655]==0&false))) {{
				
			}
			}else {__CLOVER_177_0.cloverRec.S[15168]++;if ((((n instanceof Text) && (++__CLOVER_177_0.cloverRec.CT[3656]!=0|true)) || (++__CLOVER_177_0.cloverRec.CF[3656]==0&false))) {{
				__CLOVER_177_0.cloverRec.S[15169]++;String s = n.getNodeValue();
				assert((((s == "" || s.matches("[ \t\n]+"))) && (++__CLOVER_177_0.cloverRec.CT[3657]!=0|true)) || (++__CLOVER_177_0.cloverRec.CF[3657]==0&false));
			}
			}else
				{assert((((false)) && (++__CLOVER_177_0.cloverRec.CT[3658]!=0|true)) || (++__CLOVER_177_0.cloverRec.CF[3658]==0&false));
		}}}}
		}__CLOVER_177_0.cloverRec.S[15170]++;if((((v.size()>0) && (++__CLOVER_177_0.cloverRec.CT[3659]!=0|true)) || (++__CLOVER_177_0.cloverRec.CF[3659]==0&false)))
		{{
			__CLOVER_177_0.cloverRec.S[15171]++;liste_attribut=new ExtAttribut[v.size()];
			__CLOVER_177_0.cloverRec.S[15172]++;v.copyInto(liste_attribut);
		}
		}else
		{{
			__CLOVER_177_0.cloverRec.S[15173]++;liste_attribut=null;
		}
		}__CLOVER_177_0.cloverRec.S[15174]++;res=new ExtClasse(nom,liste_attribut);
		__CLOVER_177_0.cloverRec.S[15175]++;return res;
	}

	public ExtAttribut creer_attribut(Element element)
	{__CLOVER_177_0.cloverRec.M[1014]++;
		__CLOVER_177_0.cloverRec.S[15176]++;int i;
		__CLOVER_177_0.cloverRec.S[15177]++;ExtAttribut res;
		__CLOVER_177_0.cloverRec.S[15178]++;Vector v;
		__CLOVER_177_0.cloverRec.S[15179]++;String nom=null;
		__CLOVER_177_0.cloverRec.S[15180]++;ExtType t,liste_type[];
		assert((((element!=null)) && (++__CLOVER_177_0.cloverRec.CT[3660]!=0|true)) || (++__CLOVER_177_0.cloverRec.CF[3660]==0&false));
		assert((((element.getNodeName().equalsIgnoreCase("attribut"))) && (++__CLOVER_177_0.cloverRec.CT[3661]!=0|true)) || (++__CLOVER_177_0.cloverRec.CF[3661]==0&false));
		__CLOVER_177_0.cloverRec.S[15181]++;NodeList fils = element.getChildNodes();
		__CLOVER_177_0.cloverRec.S[15182]++;NamedNodeMap attributs = element.getAttributes();
		__CLOVER_177_0.cloverRec.S[15183]++;boolean fonction=false;

		__CLOVER_177_0.cloverRec.S[15184]++;for (i = 0; (((i < attributs.getLength()) && (++__CLOVER_177_0.cloverRec.CT[3662]!=0|true)) || (++__CLOVER_177_0.cloverRec.CF[3662]==0&false)); i++) {{
			__CLOVER_177_0.cloverRec.S[15185]++;Node num\u00e9ro = attributs.item(i);
			__CLOVER_177_0.cloverRec.S[15186]++;String nomAttribut = num\u00e9ro.getNodeName();
			__CLOVER_177_0.cloverRec.S[15187]++;String valeurAttribut = num\u00e9ro.getNodeValue();
			__CLOVER_177_0.cloverRec.S[15188]++;System.out.println(nomAttribut + " =\"" + valeurAttribut + "\"");
			__CLOVER_177_0.cloverRec.S[15189]++;if ((((nomAttribut == "nom") && (++__CLOVER_177_0.cloverRec.CT[3663]!=0|true)) || (++__CLOVER_177_0.cloverRec.CF[3663]==0&false)))
				{__CLOVER_177_0.cloverRec.S[15190]++;nom = nomAttribut;
			}__CLOVER_177_0.cloverRec.S[15191]++;if ((((nomAttribut == "fonction") && (++__CLOVER_177_0.cloverRec.CT[3664]!=0|true)) || (++__CLOVER_177_0.cloverRec.CF[3664]==0&false)))
				{__CLOVER_177_0.cloverRec.S[15192]++;fonction=nomAttribut.equalsIgnoreCase("oui");
			}else
				{assert((((false)) && (++__CLOVER_177_0.cloverRec.CT[3665]!=0|true)) || (++__CLOVER_177_0.cloverRec.CF[3665]==0&false));
		}}
		}assert((((nom!=null)) && (++__CLOVER_177_0.cloverRec.CT[3666]!=0|true)) || (++__CLOVER_177_0.cloverRec.CF[3666]==0&false));
		__CLOVER_177_0.cloverRec.S[15193]++;v=new Vector();
		__CLOVER_177_0.cloverRec.S[15194]++;for(i=0;(((i<fils.getLength()) && (++__CLOVER_177_0.cloverRec.CT[3667]!=0|true)) || (++__CLOVER_177_0.cloverRec.CF[3667]==0&false));i++)
		{{
			__CLOVER_177_0.cloverRec.S[15195]++;Node n = fils.item(i);
			//System.out.println("element=" + n.getNodeName());
			__CLOVER_177_0.cloverRec.S[15196]++;if ((((n instanceof Element) && (++__CLOVER_177_0.cloverRec.CT[3668]!=0|true)) || (++__CLOVER_177_0.cloverRec.CF[3668]==0&false))) {{
				__CLOVER_177_0.cloverRec.S[15197]++;if ((((n.getNodeName() == "type") && (++__CLOVER_177_0.cloverRec.CT[3669]!=0|true)) || (++__CLOVER_177_0.cloverRec.CF[3669]==0&false))) {{
					//System.out.println("heritage");
					__CLOVER_177_0.cloverRec.S[15198]++;t = creer_type((Element) n);
					__CLOVER_177_0.cloverRec.S[15199]++;v.addElement(t);
				}
				}else
					{assert((((false)) && (++__CLOVER_177_0.cloverRec.CT[3670]!=0|true)) || (++__CLOVER_177_0.cloverRec.CF[3670]==0&false));
			}}
			}else {__CLOVER_177_0.cloverRec.S[15200]++;if ((((n instanceof Comment) && (++__CLOVER_177_0.cloverRec.CT[3671]!=0|true)) || (++__CLOVER_177_0.cloverRec.CF[3671]==0&false))) {{
				
			}
			}else {__CLOVER_177_0.cloverRec.S[15201]++;if ((((n instanceof Text) && (++__CLOVER_177_0.cloverRec.CT[3672]!=0|true)) || (++__CLOVER_177_0.cloverRec.CF[3672]==0&false))) {{
				__CLOVER_177_0.cloverRec.S[15202]++;String s = n.getNodeValue();
				assert((((s == "" || s.matches("[ \t\n]+"))) && (++__CLOVER_177_0.cloverRec.CT[3673]!=0|true)) || (++__CLOVER_177_0.cloverRec.CF[3673]==0&false));
			}
			}else
				{assert((((false)) && (++__CLOVER_177_0.cloverRec.CT[3674]!=0|true)) || (++__CLOVER_177_0.cloverRec.CF[3674]==0&false));
		}}}}
		}__CLOVER_177_0.cloverRec.S[15203]++;if((((fonction) && (++__CLOVER_177_0.cloverRec.CT[3675]!=0|true)) || (++__CLOVER_177_0.cloverRec.CF[3675]==0&false)))
		{{
			//int i;
			assert((((v.size()>0)) && (++__CLOVER_177_0.cloverRec.CT[3676]!=0|true)) || (++__CLOVER_177_0.cloverRec.CF[3676]==0&false));
			__CLOVER_177_0.cloverRec.S[15204]++;i=v.size()-1;
			__CLOVER_177_0.cloverRec.S[15205]++;t=(ExtType)v.elementAt(i);
			__CLOVER_177_0.cloverRec.S[15206]++;v.removeElementAt(i);
		}
		}else
		{{
			__CLOVER_177_0.cloverRec.S[15207]++;t=null;
		}
		}__CLOVER_177_0.cloverRec.S[15208]++;if((((v.size()>0) && (++__CLOVER_177_0.cloverRec.CT[3677]!=0|true)) || (++__CLOVER_177_0.cloverRec.CF[3677]==0&false)))
		{{
			__CLOVER_177_0.cloverRec.S[15209]++;liste_type=new ExtType[v.size()];
			__CLOVER_177_0.cloverRec.S[15210]++;v.copyInto(liste_type);
		}
		}else
		{{
			__CLOVER_177_0.cloverRec.S[15211]++;liste_type=null;
		}
		}__CLOVER_177_0.cloverRec.S[15212]++;res=new ExtAttribut(nom,liste_type,t);
		__CLOVER_177_0.cloverRec.S[15213]++;return res;
	}

	
	String nom;
	public ExtModule module;
	
}
