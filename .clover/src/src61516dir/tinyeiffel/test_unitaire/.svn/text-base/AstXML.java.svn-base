/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ */package tinyeiffel.test_unitaire;

/**
 * <p>Title: </p>
 * <p>Description: Les testes de eiffel</p>
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>Company: </p>
 * @author not attributable
 * @version 1.0
 */

import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.FactoryConfigurationError;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import org.w3c.dom.*;
import tinyeiffel.ast.*;

//import org.w3c.dom.DOMImplementationRegistry;
/*import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.ls.DOMImplementationLS;
import org.w3c.dom.ls.DOMBuilder;*/

//import org.apache.xerces.parsers.DOMParser;

//import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

//import javax.xml.parsers.FactoryConfigurationError;
//import javax.xml.parsers.ParserConfigurationException;
//import javax.xml.parsers.DocumentBuilderFactory;
//import javax.xml.parsers.DocumentBuilder;

import java.util.*;

public class AstXML {static class __CLOVER_249_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}
	public Classe parse(String nom_fichier) {__CLOVER_249_0.cloverRec.M[1430]++;
		__CLOVER_249_0.cloverRec.S[20438]++;String xmlFile = "test_unitaire\\test_class1.xml";
		__CLOVER_249_0.cloverRec.S[20439]++;if((((nom_fichier!="") && (++__CLOVER_249_0.cloverRec.CT[5909]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[5909]==0&false)))
			{__CLOVER_249_0.cloverRec.S[20440]++;xmlFile=nom_fichier;
		//"file:///xerces-2_5_0/data/personal.xml";
		}__CLOVER_249_0.cloverRec.S[20441]++;try {
			/* jasp */
			//R\u00e9cup\u00e8re une instance de la classe de fabrication
			__CLOVER_249_0.cloverRec.S[20442]++;DocumentBuilderFactory factory =
				DocumentBuilderFactory.newInstance();
			//R\u00e9cup\u00e9re une instance de la classe DocumentBuilder (sp\u00e9cifique vendeur)
			__CLOVER_249_0.cloverRec.S[20443]++;DocumentBuilder parser = factory.newDocumentBuilder();
			//effectue le parsing avec r\u00e9cup\u00e9ration du noeud DOM Document
			__CLOVER_249_0.cloverRec.S[20444]++;Document document = parser.parse(xmlFile);

			/*DOMParser parser = new DOMParser();
			parser.parse(xmlFile);
			Document document = parser.getDocument();*/

			/* Jaxt */
			//"org.apache.xerces.dom.CoreDocumentImpl";
			/*DocumentBuilderFactory factory =
			    DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			factory.
			Document document = builder.parse(xmlFile);*/

			/* DOM 3 */
			/*System.setProperty(DOMImplementation.PROPERTY,
			                   "org.apache.xerces.dom.DOMImplementationSourceImpl");
			DOMImplementationRegistry registry =
			    DOMImplementationRegistry.newInstance();
			
			DOMImplementationLS impl =
			    (DOMImplementationLS) registry.getDOMImplementation("LS-Load");
			
			DOMBuilder builder = impl.createDOMBuilder(
			    DOMImplementationLS.MODE_SYNCHRONOUS, null);
			
			Document document = builder.parseURI(xmlFile);*/

			__CLOVER_249_0.cloverRec.S[20445]++;Element catalogue = document.getDocumentElement();

			__CLOVER_249_0.cloverRec.S[20446]++;NodeList titres = catalogue.getElementsByTagName("class");
			__CLOVER_249_0.cloverRec.S[20447]++;System.out.println(
				"Nombre d'element dans la racine : " + titres.getLength());
			__CLOVER_249_0.cloverRec.S[20448]++;System.out.println("nom=" + catalogue.getNodeName());
			__CLOVER_249_0.cloverRec.S[20449]++;System.out.println("nom=" + catalogue.getFirstChild());
			__CLOVER_249_0.cloverRec.S[20450]++;System.out.println(
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
			//assert(org.w3c.dom.Node.ELEMENT_NODE==3);
			__CLOVER_249_0.cloverRec.S[20451]++;System.out.println(
				"nom=" + catalogue.getFirstChild().getNodeType());
			//System.out.println("nom2="+titres.item(0).getFirstChild().getNodeValue());
			/*for (int i=0; i<titres.getLength(); i++) {
			 System.out.println(titres.item(i).getFirstChild().getNodeValue());
			}*/
			__CLOVER_249_0.cloverRec.S[20452]++;titres = catalogue.getElementsByTagName("nom_classe");
			__CLOVER_249_0.cloverRec.S[20453]++;System.out.println(
				"Nombre d'element dans la racine : " + titres.getLength());
			__CLOVER_249_0.cloverRec.S[20454]++;Classe c = creer_classe(catalogue);
			__CLOVER_249_0.cloverRec.S[20455]++;System.out.println("classe=" + c.toString());
			__CLOVER_249_0.cloverRec.S[20456]++;return c;
		} catch (FactoryConfigurationError e) {
			// unable to get a document builder factory
			__CLOVER_249_0.cloverRec.S[20457]++;e.printStackTrace();
			__CLOVER_249_0.cloverRec.S[20458]++;System.err.println("Erreur de configuration du factory");
			__CLOVER_249_0.cloverRec.S[20459]++;System.exit(1);
		} catch (ParserConfigurationException e) {
			// parser was unable to be configured
			__CLOVER_249_0.cloverRec.S[20460]++;e.printStackTrace();
			__CLOVER_249_0.cloverRec.S[20461]++;System.err.println("Erreur de configuration du parser");
			__CLOVER_249_0.cloverRec.S[20462]++;System.exit(1);
		} catch (SAXException e) {
			// parsing error
			__CLOVER_249_0.cloverRec.S[20463]++;e.printStackTrace();
			__CLOVER_249_0.cloverRec.S[20464]++;System.err.println("Exception Sax");
			__CLOVER_249_0.cloverRec.S[20465]++;System.exit(1);
		} catch (IOException e) {
			// i/o error
			__CLOVER_249_0.cloverRec.S[20466]++;e.printStackTrace();
			__CLOVER_249_0.cloverRec.S[20467]++;System.err.println("Erreur d'entree sortie");
			__CLOVER_249_0.cloverRec.S[20468]++;System.exit(1);
		}
		__CLOVER_249_0.cloverRec.S[20469]++;return null;
	}

	public Classe creer_classe(Element element) {__CLOVER_249_0.cloverRec.M[1431]++;
		assert((((element != null)) && (++__CLOVER_249_0.cloverRec.CT[5910]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[5910]==0&false));
		assert((((element.getNodeName() == "class")) && (++__CLOVER_249_0.cloverRec.CT[5911]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[5911]==0&false));
		__CLOVER_249_0.cloverRec.S[20470]++;NamedNodeMap attributs = element.getAttributes();
		__CLOVER_249_0.cloverRec.S[20471]++;String type="";
		__CLOVER_249_0.cloverRec.S[20472]++;Type nom_classe = null;
		__CLOVER_249_0.cloverRec.S[20473]++;Heritage h;
		__CLOVER_249_0.cloverRec.S[20474]++;Vector v = new Vector(), creation = new Vector();
		__CLOVER_249_0.cloverRec.S[20475]++;Vector invariant = null, v2 = new Vector();
		__CLOVER_249_0.cloverRec.S[20476]++;Chaine obsolete = null;

		__CLOVER_249_0.cloverRec.S[20477]++;for (int i = 0; (((i < attributs.getLength()) && (++__CLOVER_249_0.cloverRec.CT[5912]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[5912]==0&false)); i++) {{
			__CLOVER_249_0.cloverRec.S[20478]++;Node num\u00e9ro = attributs.item(i);
			__CLOVER_249_0.cloverRec.S[20479]++;String nomAttribut = num\u00e9ro.getNodeName();
			__CLOVER_249_0.cloverRec.S[20480]++;String valeurAttribut = num\u00e9ro.getNodeValue();
			__CLOVER_249_0.cloverRec.S[20481]++;System.out.println(nomAttribut + " =\"" + valeurAttribut + "\"");
			__CLOVER_249_0.cloverRec.S[20482]++;if ((((nomAttribut == "type") && (++__CLOVER_249_0.cloverRec.CT[5913]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[5913]==0&false)))
				{__CLOVER_249_0.cloverRec.S[20483]++;type = valeurAttribut;
			}else
				{assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[5914]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[5914]==0&false));
		}}
		}assert((((type.equals("")||type.equals("expanded")||
				type.equals("deferred"))) && (++__CLOVER_249_0.cloverRec.CT[5915]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[5915]==0&false));
		//System.out.println("methode 1:");
		__CLOVER_249_0.cloverRec.S[20484]++;NodeList fils = element.getChildNodes();
		__CLOVER_249_0.cloverRec.S[20485]++;int i;
		__CLOVER_249_0.cloverRec.S[20486]++;for (i = 0; (((i < fils.getLength()) && (++__CLOVER_249_0.cloverRec.CT[5916]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[5916]==0&false)); i++) {{
			__CLOVER_249_0.cloverRec.S[20487]++;Node n = fils.item(i);
			//System.out.println("element=" + n.getNodeName());
			__CLOVER_249_0.cloverRec.S[20488]++;if ((((n instanceof Element) && (++__CLOVER_249_0.cloverRec.CT[5917]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[5917]==0&false))) {{
				__CLOVER_249_0.cloverRec.S[20489]++;if ((((n.getNodeName() == "heritage") && (++__CLOVER_249_0.cloverRec.CT[5918]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[5918]==0&false))) {{
					//System.out.println("heritage");
					__CLOVER_249_0.cloverRec.S[20490]++;h = creer_heritage((Element) n);
					__CLOVER_249_0.cloverRec.S[20491]++;v.addElement(h);
				} }else {__CLOVER_249_0.cloverRec.S[20492]++;if ((((n.getNodeName() == "nom_classe") && (++__CLOVER_249_0.cloverRec.CT[5919]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[5919]==0&false))) {{
					//System.out.println("nom_classe");
					__CLOVER_249_0.cloverRec.S[20493]++;nom_classe = creer_nom_classe((Element) n);
				} }else {__CLOVER_249_0.cloverRec.S[20494]++;if ((((n.getNodeName() == "creation") && (++__CLOVER_249_0.cloverRec.CT[5920]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[5920]==0&false))) {{
					//System.out.println("creation");
					__CLOVER_249_0.cloverRec.S[20495]++;Creation c = creer_creation((Element) n);
					__CLOVER_249_0.cloverRec.S[20496]++;creation.addElement(c);
				} }else {__CLOVER_249_0.cloverRec.S[20497]++;if ((((n.getNodeName() == "obsolete") && (++__CLOVER_249_0.cloverRec.CT[5921]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[5921]==0&false))) {{
					//System.out.println("obsolete");
					__CLOVER_249_0.cloverRec.S[20498]++;obsolete = creer_obsolete((Element) n);
				} }else {__CLOVER_249_0.cloverRec.S[20499]++;if ((((n.getNodeName() == "invariant") && (++__CLOVER_249_0.cloverRec.CT[5922]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[5922]==0&false))) {{
					//System.out.println("invariant");
					__CLOVER_249_0.cloverRec.S[20500]++;invariant = creer_invariant((Element) n);
				} }else {__CLOVER_249_0.cloverRec.S[20501]++;if ((((n.getNodeName() == "feature") && (++__CLOVER_249_0.cloverRec.CT[5923]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[5923]==0&false))) {{
					//System.out.println("feature");
					__CLOVER_249_0.cloverRec.S[20502]++;Feature f = creer_feature((Element) n);
					__CLOVER_249_0.cloverRec.S[20503]++;v2.addElement(f);
				} }else {{
					assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[5924]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[5924]==0&false));
				}
			}}}}}}} }else {__CLOVER_249_0.cloverRec.S[20504]++;if ((((n instanceof Text) && (++__CLOVER_249_0.cloverRec.CT[5925]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[5925]==0&false))) {{
				__CLOVER_249_0.cloverRec.S[20505]++;String s = n.getNodeValue();
				assert((((s == "" || s.matches("[ \t\n]+"))) && (++__CLOVER_249_0.cloverRec.CT[5926]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[5926]==0&false));
			} }else {{
				assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[5927]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[5927]==0&false));
			}
		}}}

		/*System.out.println("methode 2:");
		Node node=element.getFirstChild();
		while(node!=null)
		{
		  Node n=node;
		  System.out.println("element="+n.getNodeName());
		  node=node.getNextSibling();
		}*/
		}assert((((nom_classe != null)) && (++__CLOVER_249_0.cloverRec.CT[5928]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[5928]==0&false));

		__CLOVER_249_0.cloverRec.S[20506]++;return new Classe(type.equals("deferred"),type.equals("expanded"),
			nom_classe,
			v2,
			((((v.size()==0)) && (++__CLOVER_249_0.cloverRec.CT[5929]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[5929]==0&false))?null:v,
			invariant,
			creation,
			obsolete,
			new Vector(),
			new Vector());
	}

	public Chaine creer_obsolete(Element element) {__CLOVER_249_0.cloverRec.M[1432]++;
		assert((((element != null)) && (++__CLOVER_249_0.cloverRec.CT[5930]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[5930]==0&false));
		assert((((element.getNodeName() == "obsolete")) && (++__CLOVER_249_0.cloverRec.CT[5931]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[5931]==0&false));
		__CLOVER_249_0.cloverRec.S[20507]++;NamedNodeMap attributs = element.getAttributes();
		__CLOVER_249_0.cloverRec.S[20508]++;Chaine res = null;

		__CLOVER_249_0.cloverRec.S[20509]++;NodeList fils = element.getChildNodes();
		__CLOVER_249_0.cloverRec.S[20510]++;int i;
		__CLOVER_249_0.cloverRec.S[20511]++;for (i = 0; (((i < fils.getLength()) && (++__CLOVER_249_0.cloverRec.CT[5932]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[5932]==0&false)); i++) {{
			__CLOVER_249_0.cloverRec.S[20512]++;Node n = fils.item(i);
			//System.out.println("element=" + n.getNodeName());
			__CLOVER_249_0.cloverRec.S[20513]++;if ((((n instanceof Element) && (++__CLOVER_249_0.cloverRec.CT[5933]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[5933]==0&false))) {{
				__CLOVER_249_0.cloverRec.S[20514]++;if ((((n.getNodeName() == "chaine") && (++__CLOVER_249_0.cloverRec.CT[5934]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[5934]==0&false))) {{
					//System.out.println("chaine");
					assert((((res == null)) && (++__CLOVER_249_0.cloverRec.CT[5935]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[5935]==0&false));
					__CLOVER_249_0.cloverRec.S[20515]++;res = creer_chaine((Element) n);
				} }else {{
					assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[5936]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[5936]==0&false));
				}
			}} }else {__CLOVER_249_0.cloverRec.S[20516]++;if ((((n instanceof Text) && (++__CLOVER_249_0.cloverRec.CT[5937]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[5937]==0&false))) {{
				__CLOVER_249_0.cloverRec.S[20517]++;String s = n.getNodeValue();
				assert((((s == "" || s.matches("[ \t\n]+"))) && (++__CLOVER_249_0.cloverRec.CT[5938]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[5938]==0&false));
			} }else {{
				assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[5939]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[5939]==0&false));
			}
		}}}
		}assert((((res != null)) && (++__CLOVER_249_0.cloverRec.CT[5940]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[5940]==0&false));

		__CLOVER_249_0.cloverRec.S[20518]++;return res;
	}

	public Vector creer_invariant(Element element) {__CLOVER_249_0.cloverRec.M[1433]++;
		assert((((element != null)) && (++__CLOVER_249_0.cloverRec.CT[5941]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[5941]==0&false));
		assert((((element.getNodeName() == "invariant")) && (++__CLOVER_249_0.cloverRec.CT[5942]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[5942]==0&false));
		__CLOVER_249_0.cloverRec.S[20519]++;NamedNodeMap attributs = element.getAttributes();
		__CLOVER_249_0.cloverRec.S[20520]++;Vector res = new Vector();

		__CLOVER_249_0.cloverRec.S[20521]++;NodeList fils = element.getChildNodes();
		__CLOVER_249_0.cloverRec.S[20522]++;int i;
		__CLOVER_249_0.cloverRec.S[20523]++;for (i = 0; (((i < fils.getLength()) && (++__CLOVER_249_0.cloverRec.CT[5943]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[5943]==0&false)); i++) {{
			__CLOVER_249_0.cloverRec.S[20524]++;Node n = fils.item(i);
			//System.out.println("element=" + n.getNodeName());
			__CLOVER_249_0.cloverRec.S[20525]++;if ((((n instanceof Element) && (++__CLOVER_249_0.cloverRec.CT[5944]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[5944]==0&false))) {{
				__CLOVER_249_0.cloverRec.S[20526]++;if ((((n.getNodeName() == "assert") && (++__CLOVER_249_0.cloverRec.CT[5945]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[5945]==0&false))) {{
					//System.out.println("assert");
					__CLOVER_249_0.cloverRec.S[20527]++;Assert e = creer_assert((Element) n);
					__CLOVER_249_0.cloverRec.S[20528]++;res.addElement(e);
				} }else {{
					assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[5946]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[5946]==0&false));
				}
			}} }else {__CLOVER_249_0.cloverRec.S[20529]++;if ((((n instanceof Text) && (++__CLOVER_249_0.cloverRec.CT[5947]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[5947]==0&false))) {{
				__CLOVER_249_0.cloverRec.S[20530]++;String s = n.getNodeValue();
				assert((((s == "" || s.matches("[ \t\n]+"))) && (++__CLOVER_249_0.cloverRec.CT[5948]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[5948]==0&false));
			} }else {{
				assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[5949]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[5949]==0&false));
			}
		}}}
		}assert((((res != null)) && (++__CLOVER_249_0.cloverRec.CT[5950]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[5950]==0&false));

		__CLOVER_249_0.cloverRec.S[20531]++;return res;
	}

	public Vector creer_require(Element element) {__CLOVER_249_0.cloverRec.M[1434]++;
		assert((((element != null)) && (++__CLOVER_249_0.cloverRec.CT[5951]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[5951]==0&false));
		assert((((element.getNodeName() == "require")) && (++__CLOVER_249_0.cloverRec.CT[5952]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[5952]==0&false));
		__CLOVER_249_0.cloverRec.S[20532]++;NamedNodeMap attributs = element.getAttributes();
		__CLOVER_249_0.cloverRec.S[20533]++;Vector res = new Vector();

		__CLOVER_249_0.cloverRec.S[20534]++;NodeList fils = element.getChildNodes();
		__CLOVER_249_0.cloverRec.S[20535]++;int i;
		__CLOVER_249_0.cloverRec.S[20536]++;for (i = 0; (((i < fils.getLength()) && (++__CLOVER_249_0.cloverRec.CT[5953]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[5953]==0&false)); i++) {{
			__CLOVER_249_0.cloverRec.S[20537]++;Node n = fils.item(i);
			//System.out.println("element=" + n.getNodeName());
			__CLOVER_249_0.cloverRec.S[20538]++;if ((((n instanceof Element) && (++__CLOVER_249_0.cloverRec.CT[5954]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[5954]==0&false))) {{
				__CLOVER_249_0.cloverRec.S[20539]++;if ((((n.getNodeName() == "assert") && (++__CLOVER_249_0.cloverRec.CT[5955]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[5955]==0&false))) {{
					//System.out.println("assert");
					__CLOVER_249_0.cloverRec.S[20540]++;Assert e = creer_assert((Element) n);
					__CLOVER_249_0.cloverRec.S[20541]++;res.addElement(e);
				} }else {{
					assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[5956]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[5956]==0&false));
				}
			}} }else {__CLOVER_249_0.cloverRec.S[20542]++;if ((((n instanceof Text) && (++__CLOVER_249_0.cloverRec.CT[5957]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[5957]==0&false))) {{
				__CLOVER_249_0.cloverRec.S[20543]++;String s = n.getNodeValue();
				assert((((s == "" || s.matches("[ \t\n]+"))) && (++__CLOVER_249_0.cloverRec.CT[5958]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[5958]==0&false));
			} }else {{
				assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[5959]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[5959]==0&false));
			}
		}}}
		}assert((((res != null)) && (++__CLOVER_249_0.cloverRec.CT[5960]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[5960]==0&false));

		__CLOVER_249_0.cloverRec.S[20544]++;return res;
	}
	public Vector creer_ensure(Element element) {__CLOVER_249_0.cloverRec.M[1435]++;
		assert((((element != null)) && (++__CLOVER_249_0.cloverRec.CT[5961]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[5961]==0&false));
		assert((((element.getNodeName() == "ensure")) && (++__CLOVER_249_0.cloverRec.CT[5962]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[5962]==0&false));
		__CLOVER_249_0.cloverRec.S[20545]++;NamedNodeMap attributs = element.getAttributes();
		__CLOVER_249_0.cloverRec.S[20546]++;Vector res = new Vector();

		__CLOVER_249_0.cloverRec.S[20547]++;NodeList fils = element.getChildNodes();
		__CLOVER_249_0.cloverRec.S[20548]++;int i;
		__CLOVER_249_0.cloverRec.S[20549]++;for (i = 0; (((i < fils.getLength()) && (++__CLOVER_249_0.cloverRec.CT[5963]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[5963]==0&false)); i++) {{
			__CLOVER_249_0.cloverRec.S[20550]++;Node n = fils.item(i);
			//System.out.println("element=" + n.getNodeName());
			__CLOVER_249_0.cloverRec.S[20551]++;if ((((n instanceof Element) && (++__CLOVER_249_0.cloverRec.CT[5964]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[5964]==0&false))) {{
				__CLOVER_249_0.cloverRec.S[20552]++;if ((((n.getNodeName() == "assert") && (++__CLOVER_249_0.cloverRec.CT[5965]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[5965]==0&false))) {{
					//System.out.println("assert");
					__CLOVER_249_0.cloverRec.S[20553]++;Assert e = creer_assert((Element) n);
					__CLOVER_249_0.cloverRec.S[20554]++;res.addElement(e);
				} }else {{
					assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[5966]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[5966]==0&false));
				}
			}} }else {__CLOVER_249_0.cloverRec.S[20555]++;if ((((n instanceof Text) && (++__CLOVER_249_0.cloverRec.CT[5967]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[5967]==0&false))) {{
				__CLOVER_249_0.cloverRec.S[20556]++;String s = n.getNodeValue();
				assert((((s == "" || s.matches("[ \t\n]+"))) && (++__CLOVER_249_0.cloverRec.CT[5968]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[5968]==0&false));
			} }else {{
				assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[5969]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[5969]==0&false));
			}
		}}}
		}assert((((res != null)) && (++__CLOVER_249_0.cloverRec.CT[5970]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[5970]==0&false));

		__CLOVER_249_0.cloverRec.S[20557]++;return res;
	}

	public Assert creer_assert(Element element) {__CLOVER_249_0.cloverRec.M[1436]++;
		assert((((element != null)) && (++__CLOVER_249_0.cloverRec.CT[5971]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[5971]==0&false));
		assert((((element.getNodeName() == "assert")) && (++__CLOVER_249_0.cloverRec.CT[5972]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[5972]==0&false));
		__CLOVER_249_0.cloverRec.S[20558]++;NamedNodeMap attributs = element.getAttributes();
		__CLOVER_249_0.cloverRec.S[20559]++;Assert res;
		__CLOVER_249_0.cloverRec.S[20560]++;String tag=null;

		__CLOVER_249_0.cloverRec.S[20561]++;for (int i = 0; (((i < attributs.getLength()) && (++__CLOVER_249_0.cloverRec.CT[5973]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[5973]==0&false)); i++) {{
			__CLOVER_249_0.cloverRec.S[20562]++;Node num\u00e9ro = attributs.item(i);
			__CLOVER_249_0.cloverRec.S[20563]++;String nomAttribut = num\u00e9ro.getNodeName();
			__CLOVER_249_0.cloverRec.S[20564]++;String valeurAttribut = num\u00e9ro.getNodeValue();
			__CLOVER_249_0.cloverRec.S[20565]++;System.out.println(nomAttribut + " =\"" + valeurAttribut + "\"");
			__CLOVER_249_0.cloverRec.S[20566]++;if ((((nomAttribut == "tag") && (++__CLOVER_249_0.cloverRec.CT[5974]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[5974]==0&false)))
				{__CLOVER_249_0.cloverRec.S[20567]++;tag = valeurAttribut;
			}else
				{assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[5975]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[5975]==0&false));
		}}
		}assert((((tag==null||!tag.equals(""))) && (++__CLOVER_249_0.cloverRec.CT[5976]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[5976]==0&false));

		__CLOVER_249_0.cloverRec.S[20568]++;NodeList fils = element.getChildNodes();
		__CLOVER_249_0.cloverRec.S[20569]++;int i;
		__CLOVER_249_0.cloverRec.S[20570]++;Expr expr = null;
		__CLOVER_249_0.cloverRec.S[20571]++;for (i = 0; (((i < fils.getLength()) && (++__CLOVER_249_0.cloverRec.CT[5977]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[5977]==0&false)); i++) {{
			__CLOVER_249_0.cloverRec.S[20572]++;Node n = fils.item(i);
			//System.out.println("element=" + n.getNodeName());
			__CLOVER_249_0.cloverRec.S[20573]++;if ((((n instanceof Element) && (++__CLOVER_249_0.cloverRec.CT[5978]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[5978]==0&false))) {{
				__CLOVER_249_0.cloverRec.S[20574]++;if ((((n.getNodeName() == "expression") && (++__CLOVER_249_0.cloverRec.CT[5979]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[5979]==0&false))) {{
					//System.out.println("expression");
					__CLOVER_249_0.cloverRec.S[20575]++;expr = creer_expression((Element) n);
				} }else {{
					assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[5980]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[5980]==0&false));
				}
			}} }else {__CLOVER_249_0.cloverRec.S[20576]++;if ((((n instanceof Text) && (++__CLOVER_249_0.cloverRec.CT[5981]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[5981]==0&false))) {{
				__CLOVER_249_0.cloverRec.S[20577]++;String s = n.getNodeValue();
				assert((((s == "" || s.matches("[ \t\n]+"))) && (++__CLOVER_249_0.cloverRec.CT[5982]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[5982]==0&false));
			} }else {{
				assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[5983]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[5983]==0&false));
			}
		}}}
		}__CLOVER_249_0.cloverRec.S[20578]++;if((((tag==null) && (++__CLOVER_249_0.cloverRec.CT[5984]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[5984]==0&false)))
			{__CLOVER_249_0.cloverRec.S[20579]++;res = new Assert(expr);
		}else
			{__CLOVER_249_0.cloverRec.S[20580]++;res=new Assert(tag,expr);

		}__CLOVER_249_0.cloverRec.S[20581]++;return res;
	}

	public Feature creer_feature(Element element) {__CLOVER_249_0.cloverRec.M[1437]++;
		assert((((element != null)) && (++__CLOVER_249_0.cloverRec.CT[5985]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[5985]==0&false));
		assert((((element.getNodeName() == "feature")) && (++__CLOVER_249_0.cloverRec.CT[5986]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[5986]==0&false));
		__CLOVER_249_0.cloverRec.S[20582]++;NamedNodeMap attributs = element.getAttributes();
		__CLOVER_249_0.cloverRec.S[20583]++;Feature res = null;
		__CLOVER_249_0.cloverRec.S[20584]++;Vector liste_export = null, liste_nom = new Vector();
		__CLOVER_249_0.cloverRec.S[20585]++;Type nom_classe = null;
		__CLOVER_249_0.cloverRec.S[20586]++;Vector param = null;

		__CLOVER_249_0.cloverRec.S[20587]++;NodeList fils = element.getChildNodes();
		__CLOVER_249_0.cloverRec.S[20588]++;int i;
		__CLOVER_249_0.cloverRec.S[20589]++;for (i = 0; (((i < fils.getLength()) && (++__CLOVER_249_0.cloverRec.CT[5987]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[5987]==0&false)); i++) {{
			__CLOVER_249_0.cloverRec.S[20590]++;Node n = fils.item(i);
			//System.out.println("element=" + n.getNodeName());
			__CLOVER_249_0.cloverRec.S[20591]++;if ((((n instanceof Element) && (++__CLOVER_249_0.cloverRec.CT[5988]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[5988]==0&false))) {{
				__CLOVER_249_0.cloverRec.S[20592]++;if ((((n.getNodeName() == "liste_export") && (++__CLOVER_249_0.cloverRec.CT[5989]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[5989]==0&false))) {{
					//System.out.println("liste_export");
					__CLOVER_249_0.cloverRec.S[20593]++;liste_export = creer_liste_export((Element) n);
				} }else {__CLOVER_249_0.cloverRec.S[20594]++;if ((((n.getNodeName() == "nom_feature") && (++__CLOVER_249_0.cloverRec.CT[5990]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[5990]==0&false))) {{
					//System.out.println("nom_feature");
					__CLOVER_249_0.cloverRec.S[20595]++;NomFeature f = creer_nom_feature((Element) n);
					__CLOVER_249_0.cloverRec.S[20596]++;liste_nom.addElement(f);
				} }else {__CLOVER_249_0.cloverRec.S[20597]++;if ((((n.getNodeName() == "nom_classe") && (++__CLOVER_249_0.cloverRec.CT[5991]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[5991]==0&false))) {{
					//System.out.println("nom_classe");
					__CLOVER_249_0.cloverRec.S[20598]++;nom_classe = creer_nom_classe((Element) n);
				} // creer_parametre_formel
				}else {__CLOVER_249_0.cloverRec.S[20599]++;if ((((n.getNodeName() == "corps") && (++__CLOVER_249_0.cloverRec.CT[5992]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[5992]==0&false))) {{
					//System.out.println("corps");
					__CLOVER_249_0.cloverRec.S[20600]++;res = creer_corps((Element) n);
				} }else {__CLOVER_249_0.cloverRec.S[20601]++;if ((((n.getNodeName() == "parametre_formel") && (++__CLOVER_249_0.cloverRec.CT[5993]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[5993]==0&false))) {{
					//System.out.println("parametre_formel");
					__CLOVER_249_0.cloverRec.S[20602]++;DeclareVar d = creer_parametre_formel((Element) n);
					__CLOVER_249_0.cloverRec.S[20603]++;if((((param==null) && (++__CLOVER_249_0.cloverRec.CT[5994]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[5994]==0&false)))
						{__CLOVER_249_0.cloverRec.S[20604]++;param=new Vector();
					}__CLOVER_249_0.cloverRec.S[20605]++;param.addElement(d);
				} }else {{
					assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[5995]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[5995]==0&false));
				}
			}}}}}} }else {__CLOVER_249_0.cloverRec.S[20606]++;if ((((n instanceof Text) && (++__CLOVER_249_0.cloverRec.CT[5996]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[5996]==0&false))) {{
				__CLOVER_249_0.cloverRec.S[20607]++;String s = n.getNodeValue();
				assert((((s == "" || s.matches("[ \t\n]+"))) && (++__CLOVER_249_0.cloverRec.CT[5997]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[5997]==0&false));
			} }else {{
				assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[5998]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[5998]==0&false));
			}
		}}}
		}__CLOVER_249_0.cloverRec.S[20608]++;if ((((res == null) && (++__CLOVER_249_0.cloverRec.CT[5999]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[5999]==0&false))) {{
			__CLOVER_249_0.cloverRec.S[20609]++;res = new FeatureAttr();
			__CLOVER_249_0.cloverRec.S[20610]++;res.set_nom_param(liste_nom, param, liste_export,new Vector());
			__CLOVER_249_0.cloverRec.S[20611]++;res.type_retour = nom_classe;
		} }else {{
			__CLOVER_249_0.cloverRec.S[20612]++;res.set_nom_param(liste_nom, param, liste_export,new Vector());
			__CLOVER_249_0.cloverRec.S[20613]++;res.type_retour = nom_classe;
		}

		}__CLOVER_249_0.cloverRec.S[20614]++;return res;
	}

	public Vector creer_liste_export(Element element) {__CLOVER_249_0.cloverRec.M[1438]++;
		assert((((element != null)) && (++__CLOVER_249_0.cloverRec.CT[6000]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6000]==0&false));
		assert((((element.getNodeName() == "liste_export")) && (++__CLOVER_249_0.cloverRec.CT[6001]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6001]==0&false));
		__CLOVER_249_0.cloverRec.S[20615]++;NamedNodeMap attributs = element.getAttributes();
		__CLOVER_249_0.cloverRec.S[20616]++;Vector res = new Vector();
		__CLOVER_249_0.cloverRec.S[20617]++;Type nom;

		__CLOVER_249_0.cloverRec.S[20618]++;NodeList fils = element.getChildNodes();
		__CLOVER_249_0.cloverRec.S[20619]++;int i;
		__CLOVER_249_0.cloverRec.S[20620]++;for (i = 0; (((i < fils.getLength()) && (++__CLOVER_249_0.cloverRec.CT[6002]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6002]==0&false)); i++) {{
			__CLOVER_249_0.cloverRec.S[20621]++;Node n = fils.item(i);
			//System.out.println("element=" + n.getNodeName());
			__CLOVER_249_0.cloverRec.S[20622]++;if ((((n instanceof Element) && (++__CLOVER_249_0.cloverRec.CT[6003]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6003]==0&false))) {{
				__CLOVER_249_0.cloverRec.S[20623]++;if ((((n.getNodeName() == "nom_classe") && (++__CLOVER_249_0.cloverRec.CT[6004]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6004]==0&false))) {{
					//System.out.println("nom_classe");
					__CLOVER_249_0.cloverRec.S[20624]++;nom = creer_nom_classe((Element) n);
					__CLOVER_249_0.cloverRec.S[20625]++;res.addElement(nom);
				} }else {{
					assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6005]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6005]==0&false));
				}
			}} }else {__CLOVER_249_0.cloverRec.S[20626]++;if ((((n instanceof Text) && (++__CLOVER_249_0.cloverRec.CT[6006]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6006]==0&false))) {{
				__CLOVER_249_0.cloverRec.S[20627]++;String s = n.getNodeValue();
				assert((((s == "" || s.matches("[ \t\n]+"))) && (++__CLOVER_249_0.cloverRec.CT[6007]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6007]==0&false));
			} }else {{
				assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6008]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6008]==0&false));
			}
		}}}
		}assert((((res != null)) && (++__CLOVER_249_0.cloverRec.CT[6009]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6009]==0&false));

		__CLOVER_249_0.cloverRec.S[20628]++;return res;
	}

	public DeclareVar creer_parametre_formel(Element element) {__CLOVER_249_0.cloverRec.M[1439]++;
		assert((((element != null)) && (++__CLOVER_249_0.cloverRec.CT[6010]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6010]==0&false));
		assert((((element.getNodeName() == "parametre_formel")) && (++__CLOVER_249_0.cloverRec.CT[6011]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6011]==0&false));
		__CLOVER_249_0.cloverRec.S[20629]++;DeclareVar res = null;

		__CLOVER_249_0.cloverRec.S[20630]++;int i;
		__CLOVER_249_0.cloverRec.S[20631]++;NamedNodeMap attributs = element.getAttributes();
		__CLOVER_249_0.cloverRec.S[20632]++;String nom = null;
		__CLOVER_249_0.cloverRec.S[20633]++;Type nom_classe = null;
		__CLOVER_249_0.cloverRec.S[20634]++;boolean frozen = false;
		__CLOVER_249_0.cloverRec.S[20635]++;for (i = 0; (((i < attributs.getLength()) && (++__CLOVER_249_0.cloverRec.CT[6012]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6012]==0&false)); i++) {{
			__CLOVER_249_0.cloverRec.S[20636]++;Node num\u00e9ro = attributs.item(i);
			__CLOVER_249_0.cloverRec.S[20637]++;String nomAttribut = num\u00e9ro.getNodeName();
			__CLOVER_249_0.cloverRec.S[20638]++;String valeurAttribut = num\u00e9ro.getNodeValue();
			//System.out.println(nomAttribut + " =\"" + valeurAttribut + "\"");
			__CLOVER_249_0.cloverRec.S[20639]++;if ((((nomAttribut == "nom") && (++__CLOVER_249_0.cloverRec.CT[6013]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6013]==0&false)))
				{__CLOVER_249_0.cloverRec.S[20640]++;nom = valeurAttribut;
			}else
				{assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6014]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6014]==0&false));
		}}
		}__CLOVER_249_0.cloverRec.S[20641]++;NodeList fils = element.getChildNodes();
		//assert(fils.getLength() == 0);
		__CLOVER_249_0.cloverRec.S[20642]++;for (i = 0; (((i < fils.getLength()) && (++__CLOVER_249_0.cloverRec.CT[6015]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6015]==0&false)); i++) {{
			__CLOVER_249_0.cloverRec.S[20643]++;Node n = fils.item(i);
			//System.out.println("element=" + n.getNodeName());
			__CLOVER_249_0.cloverRec.S[20644]++;if ((((n instanceof Element) && (++__CLOVER_249_0.cloverRec.CT[6016]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6016]==0&false))) {{
				__CLOVER_249_0.cloverRec.S[20645]++;if ((((n.getNodeName() == "nom_classe") && (++__CLOVER_249_0.cloverRec.CT[6017]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6017]==0&false))) {{
					//System.out.println("nom_classe");
					assert((((nom_classe == null)) && (++__CLOVER_249_0.cloverRec.CT[6018]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6018]==0&false));
					__CLOVER_249_0.cloverRec.S[20646]++;nom_classe = creer_nom_classe((Element) n);
				} }else {{
					assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6019]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6019]==0&false));
				}
			}} }else {__CLOVER_249_0.cloverRec.S[20647]++;if ((((n instanceof Text) && (++__CLOVER_249_0.cloverRec.CT[6020]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6020]==0&false))) {{
				__CLOVER_249_0.cloverRec.S[20648]++;String s = n.getNodeValue();
				assert((((s == "" || s.matches("[ \t\n]+"))) && (++__CLOVER_249_0.cloverRec.CT[6021]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6021]==0&false));
			} }else {{
				assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6022]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6022]==0&false));
			}
		}}}
		}assert((((nom != null)) && (++__CLOVER_249_0.cloverRec.CT[6023]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6023]==0&false));
		assert((((nom_classe != null)) && (++__CLOVER_249_0.cloverRec.CT[6024]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6024]==0&false));
		__CLOVER_249_0.cloverRec.S[20649]++;res = new DeclareVar(nom, nom_classe);
		assert((((res != null)) && (++__CLOVER_249_0.cloverRec.CT[6025]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6025]==0&false));

		__CLOVER_249_0.cloverRec.S[20650]++;return res;
	}

	public DeclareVar creer_local(Element element) {__CLOVER_249_0.cloverRec.M[1440]++;
		assert((((element != null)) && (++__CLOVER_249_0.cloverRec.CT[6026]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6026]==0&false));
		assert((((element.getNodeName() == "local")) && (++__CLOVER_249_0.cloverRec.CT[6027]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6027]==0&false));
		__CLOVER_249_0.cloverRec.S[20651]++;DeclareVar res = null;

		__CLOVER_249_0.cloverRec.S[20652]++;int i;
		__CLOVER_249_0.cloverRec.S[20653]++;NamedNodeMap attributs = element.getAttributes();
		__CLOVER_249_0.cloverRec.S[20654]++;String nom = null;
		__CLOVER_249_0.cloverRec.S[20655]++;Type nom_classe = null;
		__CLOVER_249_0.cloverRec.S[20656]++;boolean frozen = false;
		__CLOVER_249_0.cloverRec.S[20657]++;for (i = 0; (((i < attributs.getLength()) && (++__CLOVER_249_0.cloverRec.CT[6028]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6028]==0&false)); i++) {{
			__CLOVER_249_0.cloverRec.S[20658]++;Node num\u00e9ro = attributs.item(i);
			__CLOVER_249_0.cloverRec.S[20659]++;String nomAttribut = num\u00e9ro.getNodeName();
			__CLOVER_249_0.cloverRec.S[20660]++;String valeurAttribut = num\u00e9ro.getNodeValue();
			//System.out.println(nomAttribut + " =\"" + valeurAttribut + "\"");
			__CLOVER_249_0.cloverRec.S[20661]++;if ((((nomAttribut == "nom") && (++__CLOVER_249_0.cloverRec.CT[6029]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6029]==0&false)))
				{__CLOVER_249_0.cloverRec.S[20662]++;nom = valeurAttribut;
			}else
				{assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6030]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6030]==0&false));
		}}
		}__CLOVER_249_0.cloverRec.S[20663]++;NodeList fils = element.getChildNodes();
		//assert(fils.getLength() == 0);
		__CLOVER_249_0.cloverRec.S[20664]++;for (i = 0; (((i < fils.getLength()) && (++__CLOVER_249_0.cloverRec.CT[6031]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6031]==0&false)); i++) {{
			__CLOVER_249_0.cloverRec.S[20665]++;Node n = fils.item(i);
			//System.out.println("element=" + n.getNodeName());
			__CLOVER_249_0.cloverRec.S[20666]++;if ((((n instanceof Element) && (++__CLOVER_249_0.cloverRec.CT[6032]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6032]==0&false))) {{
				__CLOVER_249_0.cloverRec.S[20667]++;if ((((n.getNodeName() == "nom_classe") && (++__CLOVER_249_0.cloverRec.CT[6033]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6033]==0&false))) {{
					//System.out.println("nom_classe");
					assert((((nom_classe == null)) && (++__CLOVER_249_0.cloverRec.CT[6034]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6034]==0&false));
					__CLOVER_249_0.cloverRec.S[20668]++;nom_classe = creer_nom_classe((Element) n);
				} }else {{
					assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6035]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6035]==0&false));
				}
			}} }else {__CLOVER_249_0.cloverRec.S[20669]++;if ((((n instanceof Text) && (++__CLOVER_249_0.cloverRec.CT[6036]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6036]==0&false))) {{
				__CLOVER_249_0.cloverRec.S[20670]++;String s = n.getNodeValue();
				assert((((s == "" || s.matches("[ \t\n]+"))) && (++__CLOVER_249_0.cloverRec.CT[6037]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6037]==0&false));
			} }else {{
				assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6038]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6038]==0&false));
			}
		}}}
		}assert((((nom != null)) && (++__CLOVER_249_0.cloverRec.CT[6039]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6039]==0&false));
		assert((((nom_classe != null)) && (++__CLOVER_249_0.cloverRec.CT[6040]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6040]==0&false));
		__CLOVER_249_0.cloverRec.S[20671]++;res = new DeclareVar(nom, nom_classe);
		assert((((res != null)) && (++__CLOVER_249_0.cloverRec.CT[6041]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6041]==0&false));

		__CLOVER_249_0.cloverRec.S[20672]++;return res;
	}

	public Feature creer_corps(Element element) {__CLOVER_249_0.cloverRec.M[1441]++;
		assert((((element != null)) && (++__CLOVER_249_0.cloverRec.CT[6042]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6042]==0&false));
		assert((((element.getNodeName() == "corps")) && (++__CLOVER_249_0.cloverRec.CT[6043]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6043]==0&false));
		__CLOVER_249_0.cloverRec.S[20673]++;NamedNodeMap attributs = element.getAttributes();
		__CLOVER_249_0.cloverRec.S[20674]++;Feature res = null;
		__CLOVER_249_0.cloverRec.S[20675]++;Vector require = new Vector(),
			ensure = new Vector(),
			rescue = new Vector();
		__CLOVER_249_0.cloverRec.S[20676]++;Chaine obsolete = null;
		__CLOVER_249_0.cloverRec.S[20677]++;Expr e = null;

		__CLOVER_249_0.cloverRec.S[20678]++;NodeList fils = element.getChildNodes();
		__CLOVER_249_0.cloverRec.S[20679]++;int i;
		__CLOVER_249_0.cloverRec.S[20680]++;for (i = 0; (((i < fils.getLength()) && (++__CLOVER_249_0.cloverRec.CT[6044]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6044]==0&false)); i++) {{
			__CLOVER_249_0.cloverRec.S[20681]++;Node n = fils.item(i);
			//System.out.println("element=" + n.getNodeName());
			__CLOVER_249_0.cloverRec.S[20682]++;if ((((n instanceof Element) && (++__CLOVER_249_0.cloverRec.CT[6045]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6045]==0&false))) {{
				__CLOVER_249_0.cloverRec.S[20683]++;if ((((n.getNodeName() == "require") && (++__CLOVER_249_0.cloverRec.CT[6046]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6046]==0&false))) {{
					//System.out.println("require");
					assert((((res == null)) && (++__CLOVER_249_0.cloverRec.CT[6047]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6047]==0&false));
					__CLOVER_249_0.cloverRec.S[20684]++;require = creer_require((Element) n);
				} }else {__CLOVER_249_0.cloverRec.S[20685]++;if ((((n.getNodeName() == "ensure") && (++__CLOVER_249_0.cloverRec.CT[6048]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6048]==0&false))) {{
					//System.out.println("ensure");
					__CLOVER_249_0.cloverRec.S[20686]++;ensure = creer_ensure((Element) n);
				} }else {__CLOVER_249_0.cloverRec.S[20687]++;if ((((n.getNodeName() == "rescue") && (++__CLOVER_249_0.cloverRec.CT[6049]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6049]==0&false))) {{
					//System.out.println("rescue");
					__CLOVER_249_0.cloverRec.S[20688]++;rescue = creer_rescue((Element) n);
				} }else {__CLOVER_249_0.cloverRec.S[20689]++;if ((((n.getNodeName() == "corps2") && (++__CLOVER_249_0.cloverRec.CT[6050]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6050]==0&false))) {{
					//System.out.println("corps2");
					assert((((res == null)) && (++__CLOVER_249_0.cloverRec.CT[6051]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6051]==0&false));
					__CLOVER_249_0.cloverRec.S[20690]++;res = creer_corps2((Element) n);
					assert((((res!=null)) && (++__CLOVER_249_0.cloverRec.CT[6052]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6052]==0&false));
				} }else {__CLOVER_249_0.cloverRec.S[20691]++;if ((((n.getNodeName() == "obsolete") && (++__CLOVER_249_0.cloverRec.CT[6053]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6053]==0&false))) {{
					//System.out.println("obsolete");
					assert((((res == null)) && (++__CLOVER_249_0.cloverRec.CT[6054]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6054]==0&false));
					__CLOVER_249_0.cloverRec.S[20692]++;obsolete = creer_obsolete((Element) n);
				} }else {__CLOVER_249_0.cloverRec.S[20693]++;if ((((n.getNodeName() == "expression") && (++__CLOVER_249_0.cloverRec.CT[6055]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6055]==0&false))) {{
					//System.out.println("expression");
					assert((((res == null)) && (++__CLOVER_249_0.cloverRec.CT[6056]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6056]==0&false));
					__CLOVER_249_0.cloverRec.S[20694]++;e = creer_expression((Element) n);
					assert((((e!=null)) && (++__CLOVER_249_0.cloverRec.CT[6057]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6057]==0&false));
				} }else {__CLOVER_249_0.cloverRec.S[20695]++;if ((((n.getNodeName() == "unique") && (++__CLOVER_249_0.cloverRec.CT[6058]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6058]==0&false))) {{
					//System.out.println("unique");
					assert((((res == null)) && (++__CLOVER_249_0.cloverRec.CT[6059]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6059]==0&false));
				} }else {{
					assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6060]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6060]==0&false)):
						"element inconnue:"+n.getNodeName();
				}
			}}}}}}}} }else {__CLOVER_249_0.cloverRec.S[20696]++;if ((((n instanceof Text) && (++__CLOVER_249_0.cloverRec.CT[6061]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6061]==0&false))) {{
				__CLOVER_249_0.cloverRec.S[20697]++;String s = n.getNodeValue();
				assert((((s == "" || s.matches("[ \t\n]+"))) && (++__CLOVER_249_0.cloverRec.CT[6062]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6062]==0&false));
			} }else {{
				assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6063]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6063]==0&false));
			}
		}}}
		}__CLOVER_249_0.cloverRec.S[20698]++;if ((((res != null) && (++__CLOVER_249_0.cloverRec.CT[6064]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6064]==0&false)))
			{__CLOVER_249_0.cloverRec.S[20699]++;res.set_require_ensure(require, ensure, rescue, obsolete, new Vector(),new Vector());
		}else {__CLOVER_249_0.cloverRec.S[20700]++;if ((((e != null) && (++__CLOVER_249_0.cloverRec.CT[6065]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6065]==0&false))) {{
			__CLOVER_249_0.cloverRec.S[20701]++;res = new FeatureExpr();
			__CLOVER_249_0.cloverRec.S[20702]++;((FeatureExpr) res).expr = e;
		} }else {{
			__CLOVER_249_0.cloverRec.S[20703]++;res = new FeatureUnique();
		}

		}}__CLOVER_249_0.cloverRec.S[20704]++;return res;
	}

	public Vector creer_rescue(Element element) {__CLOVER_249_0.cloverRec.M[1442]++;
		assert((((element != null)) && (++__CLOVER_249_0.cloverRec.CT[6066]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6066]==0&false));
		assert((((element.getNodeName() == "rescue")) && (++__CLOVER_249_0.cloverRec.CT[6067]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6067]==0&false));
		__CLOVER_249_0.cloverRec.S[20705]++;NamedNodeMap attributs = element.getAttributes();
		__CLOVER_249_0.cloverRec.S[20706]++;Vector res = new Vector();

		__CLOVER_249_0.cloverRec.S[20707]++;NodeList fils = element.getChildNodes();
		__CLOVER_249_0.cloverRec.S[20708]++;int i;
		__CLOVER_249_0.cloverRec.S[20709]++;for (i = 0; (((i < fils.getLength()) && (++__CLOVER_249_0.cloverRec.CT[6068]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6068]==0&false)); i++) {{
			__CLOVER_249_0.cloverRec.S[20710]++;Node n = fils.item(i);
			//System.out.println("element=" + n.getNodeName());
			__CLOVER_249_0.cloverRec.S[20711]++;if ((((n instanceof Element) && (++__CLOVER_249_0.cloverRec.CT[6069]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6069]==0&false))) {{
				__CLOVER_249_0.cloverRec.S[20712]++;if ((((n.getNodeName() == "instruction") && (++__CLOVER_249_0.cloverRec.CT[6070]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6070]==0&false))) {{
					//System.out.println("instruction");
					__CLOVER_249_0.cloverRec.S[20713]++;Instr ins = creer_instruction((Element) n);
					__CLOVER_249_0.cloverRec.S[20714]++;res.addElement(ins);
				} }else {{
					assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6071]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6071]==0&false));
				}
			}} }else {__CLOVER_249_0.cloverRec.S[20715]++;if ((((n instanceof Text) && (++__CLOVER_249_0.cloverRec.CT[6072]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6072]==0&false))) {{
				__CLOVER_249_0.cloverRec.S[20716]++;String s = n.getNodeValue();
				assert((((s == "" || s.matches("[ \t\n]+"))) && (++__CLOVER_249_0.cloverRec.CT[6073]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6073]==0&false));
			} }else {{
				assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6074]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6074]==0&false));
			}
		}}}
		}assert((((res != null)) && (++__CLOVER_249_0.cloverRec.CT[6075]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6075]==0&false));

		__CLOVER_249_0.cloverRec.S[20717]++;return res;
	}

	public Feature creer_corps2(Element element) {__CLOVER_249_0.cloverRec.M[1443]++;
		assert((((element != null)) && (++__CLOVER_249_0.cloverRec.CT[6076]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6076]==0&false));
		assert((((element.getNodeName() == "corps2")) && (++__CLOVER_249_0.cloverRec.CT[6077]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6077]==0&false));
		__CLOVER_249_0.cloverRec.S[20718]++;NamedNodeMap attributs = element.getAttributes();
		__CLOVER_249_0.cloverRec.S[20719]++;Feature res = null;

		__CLOVER_249_0.cloverRec.S[20720]++;NodeList fils = element.getChildNodes();
		__CLOVER_249_0.cloverRec.S[20721]++;int i;
		__CLOVER_249_0.cloverRec.S[20722]++;for (i = 0; (((i < fils.getLength()) && (++__CLOVER_249_0.cloverRec.CT[6078]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6078]==0&false)); i++) {{
			__CLOVER_249_0.cloverRec.S[20723]++;Node n = fils.item(i);
			//System.out.println("element=" + n.getNodeName());
			__CLOVER_249_0.cloverRec.S[20724]++;if ((((n instanceof Element) && (++__CLOVER_249_0.cloverRec.CT[6079]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6079]==0&false))) {{
				__CLOVER_249_0.cloverRec.S[20725]++;if ((((n.getNodeName() == "code") && (++__CLOVER_249_0.cloverRec.CT[6080]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6080]==0&false))) {{
					//System.out.println("code");
					assert((((res == null)) && (++__CLOVER_249_0.cloverRec.CT[6081]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6081]==0&false));
					__CLOVER_249_0.cloverRec.S[20726]++;res = creer_code((Element) n);
				} }else {__CLOVER_249_0.cloverRec.S[20727]++;if ((((n.getNodeName() == "external") && (++__CLOVER_249_0.cloverRec.CT[6082]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6082]==0&false))) {{
					//System.out.println("external");
					assert((((res == null)) && (++__CLOVER_249_0.cloverRec.CT[6083]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6083]==0&false));
					__CLOVER_249_0.cloverRec.S[20728]++;res = creer_external((Element) n);
				} }else {__CLOVER_249_0.cloverRec.S[20729]++;if ((((n.getNodeName() == "deferred") && (++__CLOVER_249_0.cloverRec.CT[6084]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6084]==0&false))) {{
					//System.out.println("deferred");
					assert((((res == null)) && (++__CLOVER_249_0.cloverRec.CT[6085]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6085]==0&false));
					__CLOVER_249_0.cloverRec.S[20730]++;res = new FeatureDeferred();
				} }else {{
					assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6086]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6086]==0&false));
				}
			}}}} }else {__CLOVER_249_0.cloverRec.S[20731]++;if ((((n instanceof Text) && (++__CLOVER_249_0.cloverRec.CT[6087]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6087]==0&false))) {{
				__CLOVER_249_0.cloverRec.S[20732]++;String s = n.getNodeValue();
				assert((((s == "" || s.matches("[ \t\n]+"))) && (++__CLOVER_249_0.cloverRec.CT[6088]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6088]==0&false));
			} }else {{
				assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6089]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6089]==0&false));
			}
		}}}
		}assert((((res != null)) && (++__CLOVER_249_0.cloverRec.CT[6090]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6090]==0&false));

		__CLOVER_249_0.cloverRec.S[20733]++;return res;
	}

	public FeatureExternal creer_external(Element element) {__CLOVER_249_0.cloverRec.M[1444]++;
		assert((((element != null)) && (++__CLOVER_249_0.cloverRec.CT[6091]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6091]==0&false));
		assert((((element.getNodeName() == "external")) && (++__CLOVER_249_0.cloverRec.CT[6092]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6092]==0&false));
		__CLOVER_249_0.cloverRec.S[20734]++;NamedNodeMap attributs = element.getAttributes();
		__CLOVER_249_0.cloverRec.S[20735]++;FeatureExternal res = null;
		__CLOVER_249_0.cloverRec.S[20736]++;Chaine ch1 = null, ch2 = null;

		__CLOVER_249_0.cloverRec.S[20737]++;NodeList fils = element.getChildNodes();
		__CLOVER_249_0.cloverRec.S[20738]++;int i;
		__CLOVER_249_0.cloverRec.S[20739]++;for (i = 0; (((i < fils.getLength()) && (++__CLOVER_249_0.cloverRec.CT[6093]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6093]==0&false)); i++) {{
			__CLOVER_249_0.cloverRec.S[20740]++;Node n = fils.item(i);
			//System.out.println("element=" + n.getNodeName());
			__CLOVER_249_0.cloverRec.S[20741]++;if ((((n instanceof Element) && (++__CLOVER_249_0.cloverRec.CT[6094]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6094]==0&false))) {{
				__CLOVER_249_0.cloverRec.S[20742]++;if ((((n.getNodeName() == "chaine") && (++__CLOVER_249_0.cloverRec.CT[6095]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6095]==0&false))) {{
					//System.out.println("code");
					__CLOVER_249_0.cloverRec.S[20743]++;if ((((ch1 == null) && (++__CLOVER_249_0.cloverRec.CT[6096]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6096]==0&false)))
						{__CLOVER_249_0.cloverRec.S[20744]++;ch1 = creer_chaine((Element) n);
					}else
						{__CLOVER_249_0.cloverRec.S[20745]++;ch2 = creer_chaine((Element) n);
				}} }else {{
					assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6097]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6097]==0&false));
				}
			}} }else {__CLOVER_249_0.cloverRec.S[20746]++;if ((((n instanceof Text) && (++__CLOVER_249_0.cloverRec.CT[6098]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6098]==0&false))) {{
				__CLOVER_249_0.cloverRec.S[20747]++;String s = n.getNodeValue();
				assert((((s == "" || s.matches("[ \t\n]+"))) && (++__CLOVER_249_0.cloverRec.CT[6099]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6099]==0&false));
			} }else {{
				assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6100]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6100]==0&false));
			}
		}}}
		}__CLOVER_249_0.cloverRec.S[20748]++;res = new FeatureExternal(ch1, ch2);

		__CLOVER_249_0.cloverRec.S[20749]++;return res;
	}

	public FeatureRoutine creer_code(Element element) {__CLOVER_249_0.cloverRec.M[1445]++;
		assert((((element != null)) && (++__CLOVER_249_0.cloverRec.CT[6101]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6101]==0&false));
		assert((((element.getNodeName() == "code")) && (++__CLOVER_249_0.cloverRec.CT[6102]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6102]==0&false));
		__CLOVER_249_0.cloverRec.S[20750]++;FeatureRoutine res = null;
		__CLOVER_249_0.cloverRec.S[20751]++;Vector local = new Vector(), instr = new Vector();

		__CLOVER_249_0.cloverRec.S[20752]++;NodeList fils = element.getChildNodes();
		__CLOVER_249_0.cloverRec.S[20753]++;int i;
		__CLOVER_249_0.cloverRec.S[20754]++;for (i = 0; (((i < fils.getLength()) && (++__CLOVER_249_0.cloverRec.CT[6103]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6103]==0&false)); i++) {{
			__CLOVER_249_0.cloverRec.S[20755]++;Node n = fils.item(i);
			//System.out.println("element=" + n.getNodeName());
			__CLOVER_249_0.cloverRec.S[20756]++;if ((((n instanceof Element) && (++__CLOVER_249_0.cloverRec.CT[6104]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6104]==0&false))) {{
				__CLOVER_249_0.cloverRec.S[20757]++;if ((((n.getNodeName() == "local") && (++__CLOVER_249_0.cloverRec.CT[6105]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6105]==0&false))) {{
					//System.out.println("local");
					__CLOVER_249_0.cloverRec.S[20758]++;DeclareVar l = creer_local((Element) n);
					__CLOVER_249_0.cloverRec.S[20759]++;local.addElement(l);
				} }else {__CLOVER_249_0.cloverRec.S[20760]++;if ((((n.getNodeName() == "instruction") && (++__CLOVER_249_0.cloverRec.CT[6106]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6106]==0&false))) {{
					//System.out.println("instruction");
					__CLOVER_249_0.cloverRec.S[20761]++;Instr l = creer_instruction((Element) n);
					__CLOVER_249_0.cloverRec.S[20762]++;instr.addElement(l);
				} }else {{
					assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6107]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6107]==0&false));
				}
			}}} }else {__CLOVER_249_0.cloverRec.S[20763]++;if ((((n instanceof Text) && (++__CLOVER_249_0.cloverRec.CT[6108]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6108]==0&false))) {{
				__CLOVER_249_0.cloverRec.S[20764]++;String s = n.getNodeValue();
				assert((((s == "" || s.matches("[ \t\n]+"))) && (++__CLOVER_249_0.cloverRec.CT[6109]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6109]==0&false));
			} }else {{
				assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6110]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6110]==0&false));
			}
		}}}
		}__CLOVER_249_0.cloverRec.S[20765]++;NamedNodeMap attributs = element.getAttributes();
		__CLOVER_249_0.cloverRec.S[20766]++;boolean once = false;
		__CLOVER_249_0.cloverRec.S[20767]++;for (i = 0; (((i < attributs.getLength()) && (++__CLOVER_249_0.cloverRec.CT[6111]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6111]==0&false)); i++) {{
			__CLOVER_249_0.cloverRec.S[20768]++;Node num\u00e9ro = attributs.item(i);
			__CLOVER_249_0.cloverRec.S[20769]++;String nomAttribut = num\u00e9ro.getNodeName();
			__CLOVER_249_0.cloverRec.S[20770]++;String valeurAttribut = num\u00e9ro.getNodeValue();
			//System.out.println(nomAttribut + " =\"" + valeurAttribut + "\"");
			__CLOVER_249_0.cloverRec.S[20771]++;if ((((nomAttribut == "once") && (++__CLOVER_249_0.cloverRec.CT[6112]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6112]==0&false)))
				{__CLOVER_249_0.cloverRec.S[20772]++;once = true;
			}else
				{assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6113]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6113]==0&false));
		}}

		}__CLOVER_249_0.cloverRec.S[20773]++;res = new FeatureRoutine(once, instr, local);

		__CLOVER_249_0.cloverRec.S[20774]++;return res;
	}

	public Instr creer_instruction(Element element) {__CLOVER_249_0.cloverRec.M[1446]++;
		assert((((element != null)) && (++__CLOVER_249_0.cloverRec.CT[6114]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6114]==0&false));
		assert((((element.getNodeName() == "instruction")) && (++__CLOVER_249_0.cloverRec.CT[6115]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6115]==0&false));
		__CLOVER_249_0.cloverRec.S[20775]++;NamedNodeMap attributs = element.getAttributes();
		__CLOVER_249_0.cloverRec.S[20776]++;Instr res = null;

		__CLOVER_249_0.cloverRec.S[20777]++;NodeList fils = element.getChildNodes();
		__CLOVER_249_0.cloverRec.S[20778]++;int i;
		__CLOVER_249_0.cloverRec.S[20779]++;for (i = 0; (((i < fils.getLength()) && (++__CLOVER_249_0.cloverRec.CT[6116]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6116]==0&false)); i++) {{
			__CLOVER_249_0.cloverRec.S[20780]++;Node n = fils.item(i);
			//System.out.println("element=" + n.getNodeName());
			__CLOVER_249_0.cloverRec.S[20781]++;if ((((n instanceof Element) && (++__CLOVER_249_0.cloverRec.CT[6117]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6117]==0&false))) {{
				__CLOVER_249_0.cloverRec.S[20782]++;if ((((n.getNodeName() == "if") && (++__CLOVER_249_0.cloverRec.CT[6118]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6118]==0&false))) {{
					//System.out.println("if");
					assert((((res == null)) && (++__CLOVER_249_0.cloverRec.CT[6119]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6119]==0&false));
					__CLOVER_249_0.cloverRec.S[20783]++;res = creer_if((Element) n);
				} }else {__CLOVER_249_0.cloverRec.S[20784]++;if ((((n.getNodeName() == "inspect") && (++__CLOVER_249_0.cloverRec.CT[6120]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6120]==0&false))) {{
					//System.out.println("inspect");
					assert((((res == null)) && (++__CLOVER_249_0.cloverRec.CT[6121]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6121]==0&false));
					__CLOVER_249_0.cloverRec.S[20785]++;res = creer_inspect((Element) n);
				} }else {__CLOVER_249_0.cloverRec.S[20786]++;if ((((n.getNodeName() == "debug") && (++__CLOVER_249_0.cloverRec.CT[6122]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6122]==0&false))) {{
					//System.out.println("debug");
					assert((((res == null)) && (++__CLOVER_249_0.cloverRec.CT[6123]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6123]==0&false));
					__CLOVER_249_0.cloverRec.S[20787]++;res = creer_debug((Element) n);
				} }else {__CLOVER_249_0.cloverRec.S[20788]++;if ((((n.getNodeName() == "creation2") && (++__CLOVER_249_0.cloverRec.CT[6124]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6124]==0&false))) {{
					//System.out.println("creation2");
					assert((((res == null)) && (++__CLOVER_249_0.cloverRec.CT[6125]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6125]==0&false));
					__CLOVER_249_0.cloverRec.S[20789]++;res = creer_creation2((Element) n);
				} }else {__CLOVER_249_0.cloverRec.S[20790]++;if ((((n.getNodeName() == "affect") && (++__CLOVER_249_0.cloverRec.CT[6126]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6126]==0&false))) {{
					//System.out.println("affect");
					assert((((res == null)) && (++__CLOVER_249_0.cloverRec.CT[6127]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6127]==0&false));
					__CLOVER_249_0.cloverRec.S[20791]++;res = creer_affect((Element) n);
				} }else {__CLOVER_249_0.cloverRec.S[20792]++;if ((((n.getNodeName() == "tentative_affect") && (++__CLOVER_249_0.cloverRec.CT[6128]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6128]==0&false))) {{
					//System.out.println("tentative_affect");
					assert((((res == null)) && (++__CLOVER_249_0.cloverRec.CT[6129]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6129]==0&false));
					__CLOVER_249_0.cloverRec.S[20793]++;res = creer_tentative_affect((Element) n);
				} }else {__CLOVER_249_0.cloverRec.S[20794]++;if ((((n.getNodeName() == "loop") && (++__CLOVER_249_0.cloverRec.CT[6130]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6130]==0&false))) {{
					//System.out.println("loop");
					assert((((res == null)) && (++__CLOVER_249_0.cloverRec.CT[6131]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6131]==0&false));
					__CLOVER_249_0.cloverRec.S[20795]++;res = creer_loop((Element) n);
				} }else {__CLOVER_249_0.cloverRec.S[20796]++;if ((((n.getNodeName() == "check") && (++__CLOVER_249_0.cloverRec.CT[6132]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6132]==0&false))) {{
					//System.out.println("check");
					assert((((res == null)) && (++__CLOVER_249_0.cloverRec.CT[6133]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6133]==0&false));
					__CLOVER_249_0.cloverRec.S[20797]++;res = creer_check((Element) n);
				} }else {__CLOVER_249_0.cloverRec.S[20798]++;if ((((n.getNodeName() == "appel") && (++__CLOVER_249_0.cloverRec.CT[6134]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6134]==0&false))) {{
					//System.out.println("appel");
					assert((((res == null)) && (++__CLOVER_249_0.cloverRec.CT[6135]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6135]==0&false));
					__CLOVER_249_0.cloverRec.S[20799]++;res = creer_appel2((Element) n);
				} }else {__CLOVER_249_0.cloverRec.S[20800]++;if ((((n.getNodeName() == "retry") && (++__CLOVER_249_0.cloverRec.CT[6136]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6136]==0&false))) {{
					//System.out.println("check");
					assert((((res == null)) && (++__CLOVER_249_0.cloverRec.CT[6137]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6137]==0&false));
					__CLOVER_249_0.cloverRec.S[20801]++;res = creer_retry((Element) n);
				} }else {{
					assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6138]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6138]==0&false));
				}
			}}}}}}}}}}} }else {__CLOVER_249_0.cloverRec.S[20802]++;if ((((n instanceof Text) && (++__CLOVER_249_0.cloverRec.CT[6139]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6139]==0&false))) {{
				__CLOVER_249_0.cloverRec.S[20803]++;String s = n.getNodeValue();
				assert((((s == "" || s.matches("[ \t\n]+"))) && (++__CLOVER_249_0.cloverRec.CT[6140]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6140]==0&false));
			} }else {{
				assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6141]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6141]==0&false));
			}
		}}}
		}assert((((res != null)) && (++__CLOVER_249_0.cloverRec.CT[6142]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6142]==0&false));

		__CLOVER_249_0.cloverRec.S[20804]++;return res;
	}

	public Instr_If creer_if(Element element) {__CLOVER_249_0.cloverRec.M[1447]++;
		assert((((element != null)) && (++__CLOVER_249_0.cloverRec.CT[6143]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6143]==0&false));
		assert((((element.getNodeName() == "if")) && (++__CLOVER_249_0.cloverRec.CT[6144]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6144]==0&false));
		__CLOVER_249_0.cloverRec.S[20805]++;NamedNodeMap attributs = element.getAttributes();
		__CLOVER_249_0.cloverRec.S[20806]++;Instr_If res = null;

		__CLOVER_249_0.cloverRec.S[20807]++;NodeList fils = element.getChildNodes();
		__CLOVER_249_0.cloverRec.S[20808]++;int i;
		__CLOVER_249_0.cloverRec.S[20809]++;Expr e = null;
		__CLOVER_249_0.cloverRec.S[20810]++;Vector v = new Vector();
		__CLOVER_249_0.cloverRec.S[20811]++;Instr_ElseIf elseif_d = null, elseif_f = null;
		__CLOVER_249_0.cloverRec.S[20812]++;Instr_Else else_d = null, else_f = null;
		__CLOVER_249_0.cloverRec.S[20813]++;for (i = 0; (((i < fils.getLength()) && (++__CLOVER_249_0.cloverRec.CT[6145]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6145]==0&false)); i++) {{
			__CLOVER_249_0.cloverRec.S[20814]++;Node n = fils.item(i);
			//System.out.println("element=" + n.getNodeName());
			__CLOVER_249_0.cloverRec.S[20815]++;if ((((n instanceof Element) && (++__CLOVER_249_0.cloverRec.CT[6146]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6146]==0&false))) {{
				__CLOVER_249_0.cloverRec.S[20816]++;if ((((n.getNodeName() == "expression") && (++__CLOVER_249_0.cloverRec.CT[6147]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6147]==0&false))) {{
					//System.out.println("expression");
					__CLOVER_249_0.cloverRec.S[20817]++;e = creer_expression((Element) n);
				} }else {__CLOVER_249_0.cloverRec.S[20818]++;if ((((n.getNodeName() == "instruction") && (++__CLOVER_249_0.cloverRec.CT[6148]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6148]==0&false))) {{
					//System.out.println("instruction");
					__CLOVER_249_0.cloverRec.S[20819]++;Instr ins = creer_instruction((Element) n);
					__CLOVER_249_0.cloverRec.S[20820]++;v.addElement(ins);
				} }else {__CLOVER_249_0.cloverRec.S[20821]++;if ((((n.getNodeName() == "elseif") && (++__CLOVER_249_0.cloverRec.CT[6149]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6149]==0&false))) {{
					//System.out.println("elseif");
					assert((((res == null)) && (++__CLOVER_249_0.cloverRec.CT[6150]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6150]==0&false));
					__CLOVER_249_0.cloverRec.S[20822]++;Instr_ElseIf elseif = creer_elseif((Element) n);
					__CLOVER_249_0.cloverRec.S[20823]++;if ((((elseif_d == null) && (++__CLOVER_249_0.cloverRec.CT[6151]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6151]==0&false)))
						{__CLOVER_249_0.cloverRec.S[20824]++;elseif_d = elseif_f = elseif;
					}else {{
						__CLOVER_249_0.cloverRec.S[20825]++;elseif_f.setSuivant(elseif);
						__CLOVER_249_0.cloverRec.S[20826]++;elseif_f = elseif;
					}
				}} }else {__CLOVER_249_0.cloverRec.S[20827]++;if ((((n.getNodeName() == "else") && (++__CLOVER_249_0.cloverRec.CT[6152]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6152]==0&false))) {{
					//System.out.println("else");
					__CLOVER_249_0.cloverRec.S[20828]++;Instr_Else e3 = creer_else((Element) n);
					assert((((else_d==null)) && (++__CLOVER_249_0.cloverRec.CT[6153]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6153]==0&false));
					__CLOVER_249_0.cloverRec.S[20829]++;if ((((else_d == null) && (++__CLOVER_249_0.cloverRec.CT[6154]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6154]==0&false)))
						{__CLOVER_249_0.cloverRec.S[20830]++;else_d = else_f = e3;
					}__CLOVER_249_0.cloverRec.S[20831]++;if((((elseif_f!=null) && (++__CLOVER_249_0.cloverRec.CT[6155]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6155]==0&false)))
						{__CLOVER_249_0.cloverRec.S[20832]++;elseif_f.setSuivant(else_d);
					/*else {
						//else_f.suivant = e3;
						else_f = e3;
					}*/
				}} }else {{
					assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6156]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6156]==0&false)):"type="+n.getNodeName();
				}
			}}}}} }else {__CLOVER_249_0.cloverRec.S[20833]++;if ((((n instanceof Text) && (++__CLOVER_249_0.cloverRec.CT[6157]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6157]==0&false))) {{
				__CLOVER_249_0.cloverRec.S[20834]++;String s = n.getNodeValue();
				assert((((s == "" || s.matches("[ \t\n]+"))) && (++__CLOVER_249_0.cloverRec.CT[6158]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6158]==0&false));
			} }else {{
				assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6159]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6159]==0&false));
			}
		}}}
		}__CLOVER_249_0.cloverRec.S[20835]++;res = new Instr_If(e, v);
		__CLOVER_249_0.cloverRec.S[20836]++;if((((elseif_d!=null) && (++__CLOVER_249_0.cloverRec.CT[6160]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6160]==0&false)))
			{__CLOVER_249_0.cloverRec.S[20837]++;res.setSuivant(elseif_d);
		}else {__CLOVER_249_0.cloverRec.S[20838]++;if ((((else_d != null) && (++__CLOVER_249_0.cloverRec.CT[6161]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6161]==0&false)))
			{__CLOVER_249_0.cloverRec.S[20839]++;res.setSuivant(else_d);

		}}__CLOVER_249_0.cloverRec.S[20840]++;return res;
	}

	public Instr_ElseIf creer_elseif(Element element) {__CLOVER_249_0.cloverRec.M[1448]++;
		assert((((element != null)) && (++__CLOVER_249_0.cloverRec.CT[6162]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6162]==0&false));
		assert((((element.getNodeName() == "elseif")) && (++__CLOVER_249_0.cloverRec.CT[6163]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6163]==0&false));
		__CLOVER_249_0.cloverRec.S[20841]++;NamedNodeMap attributs = element.getAttributes();
		__CLOVER_249_0.cloverRec.S[20842]++;Instr_ElseIf res = null;

		__CLOVER_249_0.cloverRec.S[20843]++;NodeList fils = element.getChildNodes();
		__CLOVER_249_0.cloverRec.S[20844]++;int i;
		__CLOVER_249_0.cloverRec.S[20845]++;Expr e = null;
		__CLOVER_249_0.cloverRec.S[20846]++;Vector v = new Vector();
		__CLOVER_249_0.cloverRec.S[20847]++;for (i = 0; (((i < fils.getLength()) && (++__CLOVER_249_0.cloverRec.CT[6164]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6164]==0&false)); i++) {{
			__CLOVER_249_0.cloverRec.S[20848]++;Node n = fils.item(i);
			//System.out.println("element=" + n.getNodeName());
			__CLOVER_249_0.cloverRec.S[20849]++;if ((((n instanceof Element) && (++__CLOVER_249_0.cloverRec.CT[6165]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6165]==0&false))) {{
				__CLOVER_249_0.cloverRec.S[20850]++;if ((((n.getNodeName() == "expression") && (++__CLOVER_249_0.cloverRec.CT[6166]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6166]==0&false))) {{
					//System.out.println("expression");
					__CLOVER_249_0.cloverRec.S[20851]++;e = creer_expression((Element) n);
				} }else {__CLOVER_249_0.cloverRec.S[20852]++;if ((((n.getNodeName() == "instruction") && (++__CLOVER_249_0.cloverRec.CT[6167]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6167]==0&false))) {{
					__CLOVER_249_0.cloverRec.S[20853]++;System.out.println("instruction");
					__CLOVER_249_0.cloverRec.S[20854]++;Instr ins = creer_instruction((Element) n);
					__CLOVER_249_0.cloverRec.S[20855]++;v.addElement(ins);
				} }else {{
					assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6168]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6168]==0&false));
				}
			}}} }else {__CLOVER_249_0.cloverRec.S[20856]++;if ((((n instanceof Text) && (++__CLOVER_249_0.cloverRec.CT[6169]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6169]==0&false))) {{
				__CLOVER_249_0.cloverRec.S[20857]++;String s = n.getNodeValue();
				assert((((s == "" || s.matches("[ \t\n]+"))) && (++__CLOVER_249_0.cloverRec.CT[6170]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6170]==0&false));
			} }else {{
				assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6171]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6171]==0&false));
			}
		}}}
		}__CLOVER_249_0.cloverRec.S[20858]++;res = new Instr_ElseIf(e, v);

		__CLOVER_249_0.cloverRec.S[20859]++;return res;
	}

	public Instr_Else creer_else(Element element) {__CLOVER_249_0.cloverRec.M[1449]++;
		assert((((element != null)) && (++__CLOVER_249_0.cloverRec.CT[6172]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6172]==0&false));
		assert((((element.getNodeName() == "else")) && (++__CLOVER_249_0.cloverRec.CT[6173]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6173]==0&false));
		__CLOVER_249_0.cloverRec.S[20860]++;NamedNodeMap attributs = element.getAttributes();
		__CLOVER_249_0.cloverRec.S[20861]++;Instr_Else res = null;

		__CLOVER_249_0.cloverRec.S[20862]++;NodeList fils = element.getChildNodes();
		__CLOVER_249_0.cloverRec.S[20863]++;int i;
		__CLOVER_249_0.cloverRec.S[20864]++;Vector v = new Vector();
		__CLOVER_249_0.cloverRec.S[20865]++;for (i = 0; (((i < fils.getLength()) && (++__CLOVER_249_0.cloverRec.CT[6174]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6174]==0&false)); i++) {{
			__CLOVER_249_0.cloverRec.S[20866]++;Node n = fils.item(i);
			//System.out.println("element=" + n.getNodeName());
			__CLOVER_249_0.cloverRec.S[20867]++;if ((((n instanceof Element) && (++__CLOVER_249_0.cloverRec.CT[6175]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6175]==0&false))) {{
				__CLOVER_249_0.cloverRec.S[20868]++;if ((((n.getNodeName() == "instruction") && (++__CLOVER_249_0.cloverRec.CT[6176]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6176]==0&false))) {{
					//System.out.println("instruction");
					__CLOVER_249_0.cloverRec.S[20869]++;Instr ins = creer_instruction((Element) n);
					__CLOVER_249_0.cloverRec.S[20870]++;v.addElement(ins);
				} }else {{
					assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6177]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6177]==0&false));
				}
			}} }else {__CLOVER_249_0.cloverRec.S[20871]++;if ((((n instanceof Text) && (++__CLOVER_249_0.cloverRec.CT[6178]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6178]==0&false))) {{
				__CLOVER_249_0.cloverRec.S[20872]++;String s = n.getNodeValue();
				assert((((s == "" || s.matches("[ \t\n]+"))) && (++__CLOVER_249_0.cloverRec.CT[6179]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6179]==0&false));
			} }else {{
				assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6180]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6180]==0&false));
			}
		}}}
		}__CLOVER_249_0.cloverRec.S[20873]++;res = new Instr_Else(v);

		__CLOVER_249_0.cloverRec.S[20874]++;return res;
	}

	public Instr_Inspect creer_inspect(Element element) {__CLOVER_249_0.cloverRec.M[1450]++;
		assert((((element != null)) && (++__CLOVER_249_0.cloverRec.CT[6181]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6181]==0&false));
		assert((((element.getNodeName() == "inspect")) && (++__CLOVER_249_0.cloverRec.CT[6182]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6182]==0&false));
		__CLOVER_249_0.cloverRec.S[20875]++;NamedNodeMap attributs = element.getAttributes();
		__CLOVER_249_0.cloverRec.S[20876]++;Instr_Inspect res = null;
		__CLOVER_249_0.cloverRec.S[20877]++;Instr_Inspect last=null;

		__CLOVER_249_0.cloverRec.S[20878]++;NodeList fils = element.getChildNodes();
		__CLOVER_249_0.cloverRec.S[20879]++;int i;
		__CLOVER_249_0.cloverRec.S[20880]++;Expr expr=null;
		__CLOVER_249_0.cloverRec.S[20881]++;for (i = 0; (((i < fils.getLength()) && (++__CLOVER_249_0.cloverRec.CT[6183]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6183]==0&false)); i++) {{
			__CLOVER_249_0.cloverRec.S[20882]++;Node n = fils.item(i);
			//System.out.println("element=" + n.getNodeName());
			__CLOVER_249_0.cloverRec.S[20883]++;if ((((n instanceof Element) && (++__CLOVER_249_0.cloverRec.CT[6184]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6184]==0&false))) {{
				__CLOVER_249_0.cloverRec.S[20884]++;if ((((n.getNodeName() == "expression") && (++__CLOVER_249_0.cloverRec.CT[6185]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6185]==0&false))) {{
					//System.out.println("expression");
					assert((((expr==null)) && (++__CLOVER_249_0.cloverRec.CT[6186]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6186]==0&false));
					__CLOVER_249_0.cloverRec.S[20885]++;expr = creer_expression((Element) n);
				} }else {__CLOVER_249_0.cloverRec.S[20886]++;if ((((n.getNodeName() == "when_then") && (++__CLOVER_249_0.cloverRec.CT[6187]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6187]==0&false))) {{
					//System.out.println("when_then");
					assert((((expr!=null)) && (++__CLOVER_249_0.cloverRec.CT[6188]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6188]==0&false));
					__CLOVER_249_0.cloverRec.S[20887]++;Vector v = creer_when_then((Element) n);
					assert((((v!=null)) && (++__CLOVER_249_0.cloverRec.CT[6189]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6189]==0&false));
					assert((((v.elementAt(0) instanceof Vector)) && (++__CLOVER_249_0.cloverRec.CT[6190]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6190]==0&false));
					assert((((v.elementAt(1) instanceof Vector)) && (++__CLOVER_249_0.cloverRec.CT[6191]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6191]==0&false));
					__CLOVER_249_0.cloverRec.S[20888]++;Vector ins=(Vector)v.elementAt(1);
					__CLOVER_249_0.cloverRec.S[20889]++;Vector when=(Vector)v.elementAt(0);
					__CLOVER_249_0.cloverRec.S[20890]++;Instr_Inspect instr=new Instr_Inspect(expr,when,ins);
					__CLOVER_249_0.cloverRec.S[20891]++;if((((res==null) && (++__CLOVER_249_0.cloverRec.CT[6192]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6192]==0&false)))
						{__CLOVER_249_0.cloverRec.S[20892]++;res=last=instr;
					}else
					{{
						__CLOVER_249_0.cloverRec.S[20893]++;last.setSuivant(instr);
						__CLOVER_249_0.cloverRec.S[20894]++;last=instr;
					}
				}} }else {{
					assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6193]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6193]==0&false)):"type inconnue:"+n.getNodeName();
				}
			}}} }else {__CLOVER_249_0.cloverRec.S[20895]++;if ((((n instanceof Text) && (++__CLOVER_249_0.cloverRec.CT[6194]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6194]==0&false))) {{
				__CLOVER_249_0.cloverRec.S[20896]++;String s = n.getNodeValue();
				assert((((s == "" || s.matches("[ \t\n]+"))) && (++__CLOVER_249_0.cloverRec.CT[6195]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6195]==0&false));
			} }else {{
				assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6196]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6196]==0&false));
			}
		}}}
		}assert((((res != null)) && (++__CLOVER_249_0.cloverRec.CT[6197]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6197]==0&false));

		__CLOVER_249_0.cloverRec.S[20897]++;return res;
	}

	public Vector creer_when_then(Element element) {__CLOVER_249_0.cloverRec.M[1451]++;
		assert((((element != null)) && (++__CLOVER_249_0.cloverRec.CT[6198]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6198]==0&false));
		assert((((element.getNodeName() == "when_then")) && (++__CLOVER_249_0.cloverRec.CT[6199]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6199]==0&false));
		__CLOVER_249_0.cloverRec.S[20898]++;NamedNodeMap attributs = element.getAttributes();
		__CLOVER_249_0.cloverRec.S[20899]++;Vector res = null;

		__CLOVER_249_0.cloverRec.S[20900]++;NodeList fils = element.getChildNodes();
		__CLOVER_249_0.cloverRec.S[20901]++;int i;
		__CLOVER_249_0.cloverRec.S[20902]++;Vector when=new Vector();
		__CLOVER_249_0.cloverRec.S[20903]++;Vector instr=new Vector();
		__CLOVER_249_0.cloverRec.S[20904]++;for (i = 0; (((i < fils.getLength()) && (++__CLOVER_249_0.cloverRec.CT[6200]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6200]==0&false)); i++) {{
			__CLOVER_249_0.cloverRec.S[20905]++;Node n = fils.item(i);
			//System.out.println("element=" + n.getNodeName());
			__CLOVER_249_0.cloverRec.S[20906]++;if ((((n instanceof Element) && (++__CLOVER_249_0.cloverRec.CT[6201]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6201]==0&false))) {{
				__CLOVER_249_0.cloverRec.S[20907]++;if ((((n.getNodeName() == "expression_when") && (++__CLOVER_249_0.cloverRec.CT[6202]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6202]==0&false))) {{
					//System.out.println("expression_when");
					__CLOVER_249_0.cloverRec.S[20908]++;Vector v = creer_expression_when((Element) n);
					__CLOVER_249_0.cloverRec.S[20909]++;when.addElement(v);
				} }else {__CLOVER_249_0.cloverRec.S[20910]++;if ((((n.getNodeName() == "instruction") && (++__CLOVER_249_0.cloverRec.CT[6203]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6203]==0&false))) {{
					//System.out.println("instruction");
					__CLOVER_249_0.cloverRec.S[20911]++;Instr ins = creer_instruction((Element) n);
					assert((((ins!=null)) && (++__CLOVER_249_0.cloverRec.CT[6204]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6204]==0&false));
					__CLOVER_249_0.cloverRec.S[20912]++;instr.addElement(ins);
				} }else {{
					assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6205]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6205]==0&false));
				}
			}}} }else {__CLOVER_249_0.cloverRec.S[20913]++;if ((((n instanceof Text) && (++__CLOVER_249_0.cloverRec.CT[6206]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6206]==0&false))) {{
				__CLOVER_249_0.cloverRec.S[20914]++;String s = n.getNodeValue();
				assert((((s == "" || s.matches("[ \t\n]+"))) && (++__CLOVER_249_0.cloverRec.CT[6207]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6207]==0&false));
			} }else {{
				assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6208]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6208]==0&false));
			}
		}}}
		}__CLOVER_249_0.cloverRec.S[20915]++;res=new Vector();
		__CLOVER_249_0.cloverRec.S[20916]++;res.addElement(when);
		__CLOVER_249_0.cloverRec.S[20917]++;res.addElement(instr);

		__CLOVER_249_0.cloverRec.S[20918]++;return res;
	}

	public Vector creer_expression_when(Element element) {__CLOVER_249_0.cloverRec.M[1452]++;
		assert((((element != null)) && (++__CLOVER_249_0.cloverRec.CT[6209]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6209]==0&false));
		assert((((element.getNodeName() == "expression_when")) && (++__CLOVER_249_0.cloverRec.CT[6210]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6210]==0&false));
		__CLOVER_249_0.cloverRec.S[20919]++;NamedNodeMap attributs = element.getAttributes();
		__CLOVER_249_0.cloverRec.S[20920]++;Vector res = new Vector();

		__CLOVER_249_0.cloverRec.S[20921]++;NodeList fils = element.getChildNodes();
		__CLOVER_249_0.cloverRec.S[20922]++;int i;
		__CLOVER_249_0.cloverRec.S[20923]++;for (i = 0; (((i < fils.getLength()) && (++__CLOVER_249_0.cloverRec.CT[6211]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6211]==0&false)); i++) {{
			__CLOVER_249_0.cloverRec.S[20924]++;Node n = fils.item(i);
			//System.out.println("element=" + n.getNodeName());
			__CLOVER_249_0.cloverRec.S[20925]++;if ((((n instanceof Element) && (++__CLOVER_249_0.cloverRec.CT[6212]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6212]==0&false))) {{
				__CLOVER_249_0.cloverRec.S[20926]++;if ((((n.getNodeName() == "expression") && (++__CLOVER_249_0.cloverRec.CT[6213]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6213]==0&false))) {{
					//System.out.println("expression");
					__CLOVER_249_0.cloverRec.S[20927]++;Expr e = creer_expression((Element) n);
					__CLOVER_249_0.cloverRec.S[20928]++;res.addElement(e);
				} }else {{
					assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6214]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6214]==0&false));
				}
			}} }else {__CLOVER_249_0.cloverRec.S[20929]++;if ((((n instanceof Text) && (++__CLOVER_249_0.cloverRec.CT[6215]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6215]==0&false))) {{
				__CLOVER_249_0.cloverRec.S[20930]++;String s = n.getNodeValue();
				assert((((s == "" || s.matches("[ \t\n]+"))) && (++__CLOVER_249_0.cloverRec.CT[6216]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6216]==0&false));
			} }else {{
				assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6217]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6217]==0&false));
			}
		}}}
		}assert((((res.size()>0&&res.size()<3)) && (++__CLOVER_249_0.cloverRec.CT[6218]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6218]==0&false));

		__CLOVER_249_0.cloverRec.S[20931]++;return res;
	}
	
	public Instr creer_debug(Element element) {__CLOVER_249_0.cloverRec.M[1453]++;
		assert((((element != null)) && (++__CLOVER_249_0.cloverRec.CT[6219]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6219]==0&false));
		assert((((element.getNodeName() == "debug")) && (++__CLOVER_249_0.cloverRec.CT[6220]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6220]==0&false));
		__CLOVER_249_0.cloverRec.S[20932]++;NamedNodeMap attributs = element.getAttributes();
		__CLOVER_249_0.cloverRec.S[20933]++;Instr res = null;

		__CLOVER_249_0.cloverRec.S[20934]++;NodeList fils = element.getChildNodes();
		__CLOVER_249_0.cloverRec.S[20935]++;int i;
		__CLOVER_249_0.cloverRec.S[20936]++;Vector v = new Vector(), v2 = new Vector();
		__CLOVER_249_0.cloverRec.S[20937]++;for (i = 0; (((i < fils.getLength()) && (++__CLOVER_249_0.cloverRec.CT[6221]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6221]==0&false)); i++) {{
			__CLOVER_249_0.cloverRec.S[20938]++;Node n = fils.item(i);
			//System.out.println("element=" + n.getNodeName());
			__CLOVER_249_0.cloverRec.S[20939]++;if ((((n instanceof Element) && (++__CLOVER_249_0.cloverRec.CT[6222]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6222]==0&false))) {{
				__CLOVER_249_0.cloverRec.S[20940]++;if ((((n.getNodeName() == "chaine") && (++__CLOVER_249_0.cloverRec.CT[6223]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6223]==0&false))) {{
					//System.out.println("chaine");
					assert((((res == null)) && (++__CLOVER_249_0.cloverRec.CT[6224]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6224]==0&false));
					__CLOVER_249_0.cloverRec.S[20941]++;Chaine c = creer_chaine((Element) n);
					__CLOVER_249_0.cloverRec.S[20942]++;v.addElement(c);
				} }else {__CLOVER_249_0.cloverRec.S[20943]++;if ((((n.getNodeName() == "instruction") && (++__CLOVER_249_0.cloverRec.CT[6225]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6225]==0&false))) {{
					//System.out.println("instruction");
					assert((((res == null)) && (++__CLOVER_249_0.cloverRec.CT[6226]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6226]==0&false));
					__CLOVER_249_0.cloverRec.S[20944]++;Instr c = creer_instruction((Element) n);
					__CLOVER_249_0.cloverRec.S[20945]++;v2.addElement(c);
				} }else {{
					assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6227]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6227]==0&false));
				}
			}}} }else {__CLOVER_249_0.cloverRec.S[20946]++;if ((((n instanceof Text) && (++__CLOVER_249_0.cloverRec.CT[6228]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6228]==0&false))) {{
				__CLOVER_249_0.cloverRec.S[20947]++;String s = n.getNodeValue();
				assert((((s == "" || s.matches("[ \t\n]+"))) && (++__CLOVER_249_0.cloverRec.CT[6229]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6229]==0&false));
			} }else {{
				assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6230]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6230]==0&false));
			}
		}}}
		}__CLOVER_249_0.cloverRec.S[20948]++;res = new Instr_Debug(v, v2);

		__CLOVER_249_0.cloverRec.S[20949]++;return res;
	}

	public Instr creer_creation2(Element element) {__CLOVER_249_0.cloverRec.M[1454]++;
		assert((((element != null)) && (++__CLOVER_249_0.cloverRec.CT[6231]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6231]==0&false));
		assert((((element.getNodeName() == "creation2")) && (++__CLOVER_249_0.cloverRec.CT[6232]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6232]==0&false));
		__CLOVER_249_0.cloverRec.S[20950]++;NamedNodeMap attributs = element.getAttributes();
		__CLOVER_249_0.cloverRec.S[20951]++;Instr res = null;
		
		__CLOVER_249_0.cloverRec.S[20952]++;String nom_init = null;
		__CLOVER_249_0.cloverRec.S[20953]++;for (int i = 0; (((i < attributs.getLength()) && (++__CLOVER_249_0.cloverRec.CT[6233]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6233]==0&false)); i++) {{
			__CLOVER_249_0.cloverRec.S[20954]++;Node num\u00e9ro = attributs.item(i);
			__CLOVER_249_0.cloverRec.S[20955]++;String nomAttribut = num\u00e9ro.getNodeName();
			__CLOVER_249_0.cloverRec.S[20956]++;String valeurAttribut = num\u00e9ro.getNodeValue();
			//System.out.println(nomAttribut + " =\"" + valeurAttribut + "\"");
			__CLOVER_249_0.cloverRec.S[20957]++;if ((((nomAttribut == "nom") && (++__CLOVER_249_0.cloverRec.CT[6234]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6234]==0&false)))
				{__CLOVER_249_0.cloverRec.S[20958]++;nom_init=valeurAttribut;
			}else
				{assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6235]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6235]==0&false));
		}}
		
		}__CLOVER_249_0.cloverRec.S[20959]++;NodeList fils = element.getChildNodes();
		__CLOVER_249_0.cloverRec.S[20960]++;int i;
		__CLOVER_249_0.cloverRec.S[20961]++;Type nom_classe = null;
		__CLOVER_249_0.cloverRec.S[20962]++;Expr_Appel var  = null;
		__CLOVER_249_0.cloverRec.S[20963]++;for (i = 0; (((i < fils.getLength()) && (++__CLOVER_249_0.cloverRec.CT[6236]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6236]==0&false)); i++) {{
			__CLOVER_249_0.cloverRec.S[20964]++;Node n = fils.item(i);
			//System.out.println("element=" + n.getNodeName());
			__CLOVER_249_0.cloverRec.S[20965]++;if ((((n instanceof Element) && (++__CLOVER_249_0.cloverRec.CT[6237]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6237]==0&false))) {{
				__CLOVER_249_0.cloverRec.S[20966]++;if ((((n.getNodeName() == "nom_classe") && (++__CLOVER_249_0.cloverRec.CT[6238]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6238]==0&false))) {{
					//System.out.println("nom_classe");
					__CLOVER_249_0.cloverRec.S[20967]++;nom_classe = creer_nom_classe((Element) n);
				} }else {__CLOVER_249_0.cloverRec.S[20968]++;if ((((n.getNodeName() == "appel") && (++__CLOVER_249_0.cloverRec.CT[6239]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6239]==0&false))) {{
					//System.out.println("appel");
						__CLOVER_249_0.cloverRec.S[20969]++;var = creer_appel((Element) n);
				} }else {{
					assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6240]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6240]==0&false)):"type incorrecte:"+n.getNodeName();
				}
			}}} }else {__CLOVER_249_0.cloverRec.S[20970]++;if ((((n instanceof Text) && (++__CLOVER_249_0.cloverRec.CT[6241]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6241]==0&false))) {{
				__CLOVER_249_0.cloverRec.S[20971]++;String s = n.getNodeValue();
				assert((((s == "" || s.matches("[ \t\n]+"))) && (++__CLOVER_249_0.cloverRec.CT[6242]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6242]==0&false));
			} }else {{
				assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6243]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6243]==0&false));
			}
		}}}
		}__CLOVER_249_0.cloverRec.S[20972]++;String nom,nom2=null;
		__CLOVER_249_0.cloverRec.S[20973]++;Vector param=new Vector();
		__CLOVER_249_0.cloverRec.S[20974]++;nom=var.nom;
		__CLOVER_249_0.cloverRec.S[20975]++;if((((var.parametre!=null) && (++__CLOVER_249_0.cloverRec.CT[6244]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6244]==0&false)))
			{__CLOVER_249_0.cloverRec.S[20976]++;param=var.parametre;
		}__CLOVER_249_0.cloverRec.S[20977]++;if((((nom_init!=null) && (++__CLOVER_249_0.cloverRec.CT[6245]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6245]==0&false)))
		{{
			__CLOVER_249_0.cloverRec.S[20978]++;nom2=nom;
			__CLOVER_249_0.cloverRec.S[20979]++;nom=nom_init;
		}
		}__CLOVER_249_0.cloverRec.S[20980]++;res=new Instr_Creation(nom_classe,nom,nom2,param);

		__CLOVER_249_0.cloverRec.S[20981]++;return res;
	}

	public Instr creer_affect(Element element) {__CLOVER_249_0.cloverRec.M[1455]++;
		assert((((element != null)) && (++__CLOVER_249_0.cloverRec.CT[6246]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6246]==0&false));
		assert((((element.getNodeName() == "affect")) && (++__CLOVER_249_0.cloverRec.CT[6247]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6247]==0&false));
		__CLOVER_249_0.cloverRec.S[20982]++;NamedNodeMap attributs = element.getAttributes();
		__CLOVER_249_0.cloverRec.S[20983]++;Instr res = null;

		__CLOVER_249_0.cloverRec.S[20984]++;String nom_current = null;
		__CLOVER_249_0.cloverRec.S[20985]++;for (int i = 0; (((i < attributs.getLength()) && (++__CLOVER_249_0.cloverRec.CT[6248]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6248]==0&false)); i++) {{
			__CLOVER_249_0.cloverRec.S[20986]++;Node num\u00e9ro = attributs.item(i);
			__CLOVER_249_0.cloverRec.S[20987]++;String nomAttribut = num\u00e9ro.getNodeName();
			__CLOVER_249_0.cloverRec.S[20988]++;String valeurAttribut = num\u00e9ro.getNodeValue();
			//System.out.println(nomAttribut + " =\"" + valeurAttribut + "\"");
			__CLOVER_249_0.cloverRec.S[20989]++;if ((((nomAttribut == "current") && (++__CLOVER_249_0.cloverRec.CT[6249]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6249]==0&false)))
				{__CLOVER_249_0.cloverRec.S[20990]++;nom_current=valeurAttribut;
			}else
				{assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6250]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6250]==0&false));
		}}
		
		}__CLOVER_249_0.cloverRec.S[20991]++;NodeList fils = element.getChildNodes();
		__CLOVER_249_0.cloverRec.S[20992]++;int i;
		__CLOVER_249_0.cloverRec.S[20993]++;Expr expr=null;
		__CLOVER_249_0.cloverRec.S[20994]++;String nom=null;
		__CLOVER_249_0.cloverRec.S[20995]++;for (i = 0; (((i < fils.getLength()) && (++__CLOVER_249_0.cloverRec.CT[6251]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6251]==0&false)); i++) {{
			__CLOVER_249_0.cloverRec.S[20996]++;Node n = fils.item(i);
			//System.out.println("element=" + n.getNodeName());
			__CLOVER_249_0.cloverRec.S[20997]++;if ((((n instanceof Element) && (++__CLOVER_249_0.cloverRec.CT[6252]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6252]==0&false))) {{
				__CLOVER_249_0.cloverRec.S[20998]++;if ((((n.getNodeName() == "variable") && (++__CLOVER_249_0.cloverRec.CT[6253]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6253]==0&false))) {{
					//System.out.println("variable");
					assert((((nom == null)) && (++__CLOVER_249_0.cloverRec.CT[6254]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6254]==0&false));
					__CLOVER_249_0.cloverRec.S[20999]++;Expr_Var v=creer_variable((Element) n);
					__CLOVER_249_0.cloverRec.S[21000]++;nom=v.nom;
				} 
				}else {__CLOVER_249_0.cloverRec.S[21001]++;if ((((n.getNodeName() == "expression") && (++__CLOVER_249_0.cloverRec.CT[6255]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6255]==0&false))) {{
					//System.out.println("expression");
					assert((((expr==null)) && (++__CLOVER_249_0.cloverRec.CT[6256]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6256]==0&false));
					__CLOVER_249_0.cloverRec.S[21002]++;expr = creer_expression((Element) n);
				}
				}else {{
					assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6257]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6257]==0&false));
				}
			}}} }else {__CLOVER_249_0.cloverRec.S[21003]++;if ((((n instanceof Text) && (++__CLOVER_249_0.cloverRec.CT[6258]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6258]==0&false))) {{
				__CLOVER_249_0.cloverRec.S[21004]++;String s = n.getNodeValue();
				assert((((s == "" || s.matches("[ \t\n]+"))) && (++__CLOVER_249_0.cloverRec.CT[6259]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6259]==0&false));
			} }else {{
				assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6260]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6260]==0&false));
			}
		}}}
		}__CLOVER_249_0.cloverRec.S[21005]++;res=new Instr_Affect(nom,expr);
		__CLOVER_249_0.cloverRec.S[21006]++;((Instr_Affect)res).var_current=nom_current;

		__CLOVER_249_0.cloverRec.S[21007]++;return res;
	}

	public Instr creer_tentative_affect(Element element) {__CLOVER_249_0.cloverRec.M[1456]++;
		assert((((element != null)) && (++__CLOVER_249_0.cloverRec.CT[6261]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6261]==0&false));
		assert((((element.getNodeName() == "tentative_affect")) && (++__CLOVER_249_0.cloverRec.CT[6262]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6262]==0&false));
		__CLOVER_249_0.cloverRec.S[21008]++;NamedNodeMap attributs = element.getAttributes();
		__CLOVER_249_0.cloverRec.S[21009]++;Instr res = null;

		__CLOVER_249_0.cloverRec.S[21010]++;String nom_current = null;
		__CLOVER_249_0.cloverRec.S[21011]++;for (int i = 0; (((i < attributs.getLength()) && (++__CLOVER_249_0.cloverRec.CT[6263]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6263]==0&false)); i++) {{
			__CLOVER_249_0.cloverRec.S[21012]++;Node num\u00e9ro = attributs.item(i);
			__CLOVER_249_0.cloverRec.S[21013]++;String nomAttribut = num\u00e9ro.getNodeName();
			__CLOVER_249_0.cloverRec.S[21014]++;String valeurAttribut = num\u00e9ro.getNodeValue();
			//System.out.println(nomAttribut + " =\"" + valeurAttribut + "\"");
			__CLOVER_249_0.cloverRec.S[21015]++;if ((((nomAttribut == "current") && (++__CLOVER_249_0.cloverRec.CT[6264]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6264]==0&false)))
				{__CLOVER_249_0.cloverRec.S[21016]++;nom_current=valeurAttribut;
			}else
				{assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6265]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6265]==0&false));
		}}
		
		}__CLOVER_249_0.cloverRec.S[21017]++;NodeList fils = element.getChildNodes();
		__CLOVER_249_0.cloverRec.S[21018]++;int i;
		__CLOVER_249_0.cloverRec.S[21019]++;Expr expr=null;
		__CLOVER_249_0.cloverRec.S[21020]++;String nom=null;
		__CLOVER_249_0.cloverRec.S[21021]++;for (i = 0; (((i < fils.getLength()) && (++__CLOVER_249_0.cloverRec.CT[6266]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6266]==0&false)); i++) {{
			__CLOVER_249_0.cloverRec.S[21022]++;Node n = fils.item(i);
			//System.out.println("element=" + n.getNodeName());
			__CLOVER_249_0.cloverRec.S[21023]++;if ((((n instanceof Element) && (++__CLOVER_249_0.cloverRec.CT[6267]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6267]==0&false))) {{
				__CLOVER_249_0.cloverRec.S[21024]++;if ((((n.getNodeName() == "variable") && (++__CLOVER_249_0.cloverRec.CT[6268]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6268]==0&false))) {{
					//System.out.println("variable");
					assert((((nom == null)) && (++__CLOVER_249_0.cloverRec.CT[6269]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6269]==0&false));
					__CLOVER_249_0.cloverRec.S[21025]++;Expr_Var v=creer_variable((Element) n);
					__CLOVER_249_0.cloverRec.S[21026]++;nom=v.nom;
				} 
				}else {__CLOVER_249_0.cloverRec.S[21027]++;if ((((n.getNodeName() == "expression") && (++__CLOVER_249_0.cloverRec.CT[6270]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6270]==0&false))) {{
					//System.out.println("expression");
					assert((((expr==null)) && (++__CLOVER_249_0.cloverRec.CT[6271]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6271]==0&false));
					__CLOVER_249_0.cloverRec.S[21028]++;expr = creer_expression((Element) n);
				} }else {{
					assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6272]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6272]==0&false));
				}
			}}} }else {__CLOVER_249_0.cloverRec.S[21029]++;if ((((n instanceof Text) && (++__CLOVER_249_0.cloverRec.CT[6273]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6273]==0&false))) {{
				__CLOVER_249_0.cloverRec.S[21030]++;String s = n.getNodeValue();
				assert((((s == "" || s.matches("[ \t\n]+"))) && (++__CLOVER_249_0.cloverRec.CT[6274]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6274]==0&false));
			} }else {{
				assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6275]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6275]==0&false));
			}
		}}}
		}__CLOVER_249_0.cloverRec.S[21031]++;res=new Instr_TentAffect(nom,expr);
		__CLOVER_249_0.cloverRec.S[21032]++;((Instr_TentAffect)res).var_current=nom_current;

		__CLOVER_249_0.cloverRec.S[21033]++;return res;
	}

	public Instr creer_loop(Element element) {__CLOVER_249_0.cloverRec.M[1457]++;
		assert((((element != null)) && (++__CLOVER_249_0.cloverRec.CT[6276]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6276]==0&false));
		assert((((element.getNodeName() == "loop")) && (++__CLOVER_249_0.cloverRec.CT[6277]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6277]==0&false));
		__CLOVER_249_0.cloverRec.S[21034]++;NamedNodeMap attributs = element.getAttributes();
		__CLOVER_249_0.cloverRec.S[21035]++;Instr res = null;

		__CLOVER_249_0.cloverRec.S[21036]++;NodeList fils = element.getChildNodes();
		__CLOVER_249_0.cloverRec.S[21037]++;int i;
		__CLOVER_249_0.cloverRec.S[21038]++;Vector instr1=new Vector(),instr2=new Vector();
		__CLOVER_249_0.cloverRec.S[21039]++;Vector invariant=null;
		__CLOVER_249_0.cloverRec.S[21040]++;Expr expr=null,expr2=null;
		__CLOVER_249_0.cloverRec.S[21041]++;for (i = 0; (((i < fils.getLength()) && (++__CLOVER_249_0.cloverRec.CT[6278]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6278]==0&false)); i++) {{
			__CLOVER_249_0.cloverRec.S[21042]++;Node n = fils.item(i);
			//System.out.println("element=" + n.getNodeName());
			__CLOVER_249_0.cloverRec.S[21043]++;if ((((n instanceof Element) && (++__CLOVER_249_0.cloverRec.CT[6279]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6279]==0&false))) {{
				__CLOVER_249_0.cloverRec.S[21044]++;if ((((n.getNodeName() == "instruction") && (++__CLOVER_249_0.cloverRec.CT[6280]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6280]==0&false))) {{
					//System.out.println("instruction");
					__CLOVER_249_0.cloverRec.S[21045]++;Instr ins= creer_instruction((Element) n);
					__CLOVER_249_0.cloverRec.S[21046]++;if((((expr==null) && (++__CLOVER_249_0.cloverRec.CT[6281]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6281]==0&false)))
						{__CLOVER_249_0.cloverRec.S[21047]++;instr1.addElement(ins);
					}else
						{__CLOVER_249_0.cloverRec.S[21048]++;instr2.addElement(ins);
				}} }else {__CLOVER_249_0.cloverRec.S[21049]++;if ((((n.getNodeName() == "expression") && (++__CLOVER_249_0.cloverRec.CT[6282]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6282]==0&false))) {{
					//System.out.println("expression");
					__CLOVER_249_0.cloverRec.S[21050]++;expr= creer_expression((Element) n);
				} }else {__CLOVER_249_0.cloverRec.S[21051]++;if ((((n.getNodeName() == "invariant") && (++__CLOVER_249_0.cloverRec.CT[6283]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6283]==0&false))) {{
					//System.out.println("invariant");
					__CLOVER_249_0.cloverRec.S[21052]++;invariant= creer_invariant((Element) n);
				} }else {__CLOVER_249_0.cloverRec.S[21053]++;if ((((n.getNodeName() == "variant") && (++__CLOVER_249_0.cloverRec.CT[6284]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6284]==0&false))) {{
					//System.out.println("variant");
					__CLOVER_249_0.cloverRec.S[21054]++;expr2= creer_variant((Element) n);
				} }else {{
					assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6285]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6285]==0&false));
				}
			}}}}} }else {__CLOVER_249_0.cloverRec.S[21055]++;if ((((n instanceof Text) && (++__CLOVER_249_0.cloverRec.CT[6286]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6286]==0&false))) {{
				__CLOVER_249_0.cloverRec.S[21056]++;String s = n.getNodeValue();
				assert((((s == "" || s.matches("[ \t\n]+"))) && (++__CLOVER_249_0.cloverRec.CT[6287]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6287]==0&false));
			} }else {{
				assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6288]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6288]==0&false));
			}
		}}}
		}assert((((expr != null)) && (++__CLOVER_249_0.cloverRec.CT[6289]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6289]==0&false));
		__CLOVER_249_0.cloverRec.S[21057]++;res=new Instr_Loop(expr,instr1,instr2,
				((((invariant==null)) && (++__CLOVER_249_0.cloverRec.CT[6290]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6290]==0&false))?new Vector():invariant,expr2);

		__CLOVER_249_0.cloverRec.S[21058]++;return res;
	}

	public Expr creer_variant(Element element) {__CLOVER_249_0.cloverRec.M[1458]++;
		assert((((element != null)) && (++__CLOVER_249_0.cloverRec.CT[6291]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6291]==0&false));
		assert((((element.getNodeName() == "variant")) && (++__CLOVER_249_0.cloverRec.CT[6292]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6292]==0&false));
		__CLOVER_249_0.cloverRec.S[21059]++;NamedNodeMap attributs = element.getAttributes();
		__CLOVER_249_0.cloverRec.S[21060]++;Expr res = null;

		__CLOVER_249_0.cloverRec.S[21061]++;NodeList fils = element.getChildNodes();
		__CLOVER_249_0.cloverRec.S[21062]++;int i;
		__CLOVER_249_0.cloverRec.S[21063]++;for (i = 0; (((i < fils.getLength()) && (++__CLOVER_249_0.cloverRec.CT[6293]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6293]==0&false)); i++) {{
			__CLOVER_249_0.cloverRec.S[21064]++;Node n = fils.item(i);
			//System.out.println("element=" + n.getNodeName());
			__CLOVER_249_0.cloverRec.S[21065]++;if ((((n instanceof Element) && (++__CLOVER_249_0.cloverRec.CT[6294]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6294]==0&false))) {{
				__CLOVER_249_0.cloverRec.S[21066]++;if ((((n.getNodeName() == "expression") && (++__CLOVER_249_0.cloverRec.CT[6295]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6295]==0&false))) {{
					//System.out.println("expression");
					__CLOVER_249_0.cloverRec.S[21067]++;res= creer_expression((Element) n);
				} }else {{
					assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6296]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6296]==0&false));
				}
			}} }else {__CLOVER_249_0.cloverRec.S[21068]++;if ((((n instanceof Text) && (++__CLOVER_249_0.cloverRec.CT[6297]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6297]==0&false))) {{
				__CLOVER_249_0.cloverRec.S[21069]++;String s = n.getNodeValue();
				assert((((s == "" || s.matches("[ \t\n]+"))) && (++__CLOVER_249_0.cloverRec.CT[6298]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6298]==0&false));
			} }else {{
				assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6299]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6299]==0&false));
			}
		}}}
		}assert((((res != null)) && (++__CLOVER_249_0.cloverRec.CT[6300]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6300]==0&false));

		__CLOVER_249_0.cloverRec.S[21070]++;return res;
	}

	public Instr creer_check(Element element) {__CLOVER_249_0.cloverRec.M[1459]++;
		assert((((element != null)) && (++__CLOVER_249_0.cloverRec.CT[6301]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6301]==0&false));
		assert((((element.getNodeName() == "check")) && (++__CLOVER_249_0.cloverRec.CT[6302]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6302]==0&false));
		__CLOVER_249_0.cloverRec.S[21071]++;NamedNodeMap attributs = element.getAttributes();
		__CLOVER_249_0.cloverRec.S[21072]++;Instr res = null;

		__CLOVER_249_0.cloverRec.S[21073]++;NodeList fils = element.getChildNodes();
		__CLOVER_249_0.cloverRec.S[21074]++;int i;
		__CLOVER_249_0.cloverRec.S[21075]++;Vector v = new Vector();
		__CLOVER_249_0.cloverRec.S[21076]++;for (i = 0; (((i < fils.getLength()) && (++__CLOVER_249_0.cloverRec.CT[6303]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6303]==0&false)); i++) {{
			__CLOVER_249_0.cloverRec.S[21077]++;Node n = fils.item(i);
			//System.out.println("element=" + n.getNodeName());
			__CLOVER_249_0.cloverRec.S[21078]++;if ((((n instanceof Element) && (++__CLOVER_249_0.cloverRec.CT[6304]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6304]==0&false))) {{
				__CLOVER_249_0.cloverRec.S[21079]++;if ((((n.getNodeName() == "assert") && (++__CLOVER_249_0.cloverRec.CT[6305]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6305]==0&false))) {{
					//System.out.println("assert");
					__CLOVER_249_0.cloverRec.S[21080]++;Assert a = creer_assert((Element) n);
					__CLOVER_249_0.cloverRec.S[21081]++;v.addElement(a);
				} }else {{
					assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6306]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6306]==0&false));
				}
			}} }else {__CLOVER_249_0.cloverRec.S[21082]++;if ((((n instanceof Text) && (++__CLOVER_249_0.cloverRec.CT[6307]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6307]==0&false))) {{
				__CLOVER_249_0.cloverRec.S[21083]++;String s = n.getNodeValue();
				assert((((s == "" || s.matches("[ \t\n]+"))) && (++__CLOVER_249_0.cloverRec.CT[6308]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6308]==0&false));
			} }else {{
				assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6309]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6309]==0&false));
			}
		}}}
		}__CLOVER_249_0.cloverRec.S[21084]++;res = new Instr_Check(v);

		__CLOVER_249_0.cloverRec.S[21085]++;return res;
	}

	public Instr creer_appel2(Element element) {__CLOVER_249_0.cloverRec.M[1460]++;
		assert((((element != null)) && (++__CLOVER_249_0.cloverRec.CT[6310]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6310]==0&false));
		assert((((element.getNodeName() == "appel2"
				||element.getNodeName() == "appel")) && (++__CLOVER_249_0.cloverRec.CT[6311]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6311]==0&false));
		__CLOVER_249_0.cloverRec.S[21086]++;Instr_Appel res = null,last=null;

		__CLOVER_249_0.cloverRec.S[21087]++;NodeList fils = element.getChildNodes();
		__CLOVER_249_0.cloverRec.S[21088]++;Vector v1 = new Vector();
		__CLOVER_249_0.cloverRec.S[21089]++;int i;
		__CLOVER_249_0.cloverRec.S[21090]++;NamedNodeMap attributs = element.getAttributes();
		__CLOVER_249_0.cloverRec.S[21091]++;boolean frozen = false;
		__CLOVER_249_0.cloverRec.S[21092]++;String nom = null;
		__CLOVER_249_0.cloverRec.S[21093]++;Instr appel=null;
		__CLOVER_249_0.cloverRec.S[21094]++;Expr expr=null;
		__CLOVER_249_0.cloverRec.S[21095]++;for (i = 0; (((i < attributs.getLength()) && (++__CLOVER_249_0.cloverRec.CT[6312]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6312]==0&false)); i++) {{
			__CLOVER_249_0.cloverRec.S[21096]++;Node num\u00e9ro = attributs.item(i);
			__CLOVER_249_0.cloverRec.S[21097]++;String nomAttribut = num\u00e9ro.getNodeName();
			__CLOVER_249_0.cloverRec.S[21098]++;String valeurAttribut = num\u00e9ro.getNodeValue();
			//System.out.println(nomAttribut + " =\"" + valeurAttribut + "\"");
			__CLOVER_249_0.cloverRec.S[21099]++;if ((((nomAttribut == "nom") && (++__CLOVER_249_0.cloverRec.CT[6313]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6313]==0&false)))
				{__CLOVER_249_0.cloverRec.S[21100]++;nom = valeurAttribut;
			}else
				{assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6314]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6314]==0&false));
		}}
		//assert(nom != null);

		}__CLOVER_249_0.cloverRec.S[21101]++;for (i = 0; (((i < fils.getLength()) && (++__CLOVER_249_0.cloverRec.CT[6315]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6315]==0&false)); i++) {{
			__CLOVER_249_0.cloverRec.S[21102]++;Node n = fils.item(i);
			//System.out.println("element=" + n.getNodeName());
			__CLOVER_249_0.cloverRec.S[21103]++;if ((((n instanceof Element) && (++__CLOVER_249_0.cloverRec.CT[6316]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6316]==0&false))) {{
				__CLOVER_249_0.cloverRec.S[21104]++;if ((((n.getNodeName() == "parametre_reel") && (++__CLOVER_249_0.cloverRec.CT[6317]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6317]==0&false))) {{
					//System.out.println("parametre_reel");
					__CLOVER_249_0.cloverRec.S[21105]++;Expr nom1 = creer_parametre_reel((Element) n);
					__CLOVER_249_0.cloverRec.S[21106]++;v1.addElement(nom1);
				} }else {__CLOVER_249_0.cloverRec.S[21107]++;if ((((n.getNodeName() == "appel") && (++__CLOVER_249_0.cloverRec.CT[6318]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6318]==0&false))) {{
					//System.out.println("appel");
					__CLOVER_249_0.cloverRec.S[21108]++;appel = creer_appel2((Element) n);
				} }else {__CLOVER_249_0.cloverRec.S[21109]++;if ((((n.getNodeName() == "expression") && (++__CLOVER_249_0.cloverRec.CT[6319]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6319]==0&false))) {{
					//System.out.println("expression");
					__CLOVER_249_0.cloverRec.S[21110]++;expr = creer_expression((Element) n);
				} }else {{
					assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6320]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6320]==0&false));
				}
			}}}} }else {__CLOVER_249_0.cloverRec.S[21111]++;if ((((n instanceof Text) && (++__CLOVER_249_0.cloverRec.CT[6321]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6321]==0&false))) {{
				__CLOVER_249_0.cloverRec.S[21112]++;String s = n.getNodeValue();
				assert((((s == "" || s.matches("[ \t\n]+"))) && (++__CLOVER_249_0.cloverRec.CT[6322]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6322]==0&false));
			} }else {{
				assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6323]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6323]==0&false));
			}
		}}}
		}__CLOVER_249_0.cloverRec.S[21113]++;if((((expr!=null) && (++__CLOVER_249_0.cloverRec.CT[6324]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6324]==0&false)))
			{__CLOVER_249_0.cloverRec.S[21114]++;res=new Instr_Appel(expr);
		}else
			{__CLOVER_249_0.cloverRec.S[21115]++;res=new Instr_Appel(nom, v1);
		}assert((((res != null)) && (++__CLOVER_249_0.cloverRec.CT[6325]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6325]==0&false));
		__CLOVER_249_0.cloverRec.S[21116]++;if((((appel!=null) && (++__CLOVER_249_0.cloverRec.CT[6326]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6326]==0&false)))
			{__CLOVER_249_0.cloverRec.S[21117]++;res.setSuivant(appel);

		}__CLOVER_249_0.cloverRec.S[21118]++;return res;
	}

	public Heritage creer_heritage(Element element) {__CLOVER_249_0.cloverRec.M[1461]++;
		assert((((element != null)) && (++__CLOVER_249_0.cloverRec.CT[6327]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6327]==0&false));
		assert((((element.getNodeName() == "heritage")) && (++__CLOVER_249_0.cloverRec.CT[6328]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6328]==0&false));
		__CLOVER_249_0.cloverRec.S[21119]++;NamedNodeMap attributs = element.getAttributes();
		__CLOVER_249_0.cloverRec.S[21120]++;Type nom = null;
		__CLOVER_249_0.cloverRec.S[21121]++;Vector rename = new Vector(),
			export = new Vector(),
			undefine = new Vector(),
			redefine = new Vector(),
			select = new Vector();

		__CLOVER_249_0.cloverRec.S[21122]++;NodeList fils = element.getChildNodes();
		__CLOVER_249_0.cloverRec.S[21123]++;int i;
		__CLOVER_249_0.cloverRec.S[21124]++;for (i = 0; (((i < fils.getLength()) && (++__CLOVER_249_0.cloverRec.CT[6329]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6329]==0&false)); i++) {{
			__CLOVER_249_0.cloverRec.S[21125]++;Node n = fils.item(i);
			//System.out.println("element=" + n.getNodeName());
			__CLOVER_249_0.cloverRec.S[21126]++;if ((((n instanceof Element) && (++__CLOVER_249_0.cloverRec.CT[6330]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6330]==0&false))) {{
				__CLOVER_249_0.cloverRec.S[21127]++;if ((((n.getNodeName() == "nom_classe") && (++__CLOVER_249_0.cloverRec.CT[6331]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6331]==0&false))) {{
					//System.out.println("nom_classe");
					__CLOVER_249_0.cloverRec.S[21128]++;nom = creer_nom_classe((Element) n);
				} }else {__CLOVER_249_0.cloverRec.S[21129]++;if ((((n.getNodeName() == "rename") && (++__CLOVER_249_0.cloverRec.CT[6332]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6332]==0&false))) {{
					__CLOVER_249_0.cloverRec.S[21130]++;Rename r;
					//System.out.println("nom_classe");
					__CLOVER_249_0.cloverRec.S[21131]++;r = creer_rename((Element) n);
					__CLOVER_249_0.cloverRec.S[21132]++;rename.addElement(r);
				} }else {__CLOVER_249_0.cloverRec.S[21133]++;if ((((n.getNodeName() == "export") && (++__CLOVER_249_0.cloverRec.CT[6333]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6333]==0&false))) {{
					__CLOVER_249_0.cloverRec.S[21134]++;Export r;
					//System.out.println("nom_classe");
					__CLOVER_249_0.cloverRec.S[21135]++;r = creer_export((Element) n);
					__CLOVER_249_0.cloverRec.S[21136]++;export.addElement(r);
				} }else {__CLOVER_249_0.cloverRec.S[21137]++;if ((((n.getNodeName() == "undefine") && (++__CLOVER_249_0.cloverRec.CT[6334]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6334]==0&false))) {{
					//Export r;
					//System.out.println("nom_classe");
					__CLOVER_249_0.cloverRec.S[21138]++;undefine = creer_undefine((Element) n);
					//undefine.addElement(r);
				} }else {__CLOVER_249_0.cloverRec.S[21139]++;if ((((n.getNodeName() == "redefine") && (++__CLOVER_249_0.cloverRec.CT[6335]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6335]==0&false))) {{
					//Export r;
					//System.out.println("nom_classe");
					__CLOVER_249_0.cloverRec.S[21140]++;redefine = creer_redefine((Element) n);
					//undefine.addElement(r);
				} }else {__CLOVER_249_0.cloverRec.S[21141]++;if ((((n.getNodeName() == "select") && (++__CLOVER_249_0.cloverRec.CT[6336]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6336]==0&false))) {{
					//Export r;
					//System.out.println("nom_classe");
					__CLOVER_249_0.cloverRec.S[21142]++;select = creer_select((Element) n);
					//undefine.addElement(r);
				} }else {{
					assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6337]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6337]==0&false));
				}
			}}}}}}} }else {__CLOVER_249_0.cloverRec.S[21143]++;if ((((n instanceof Text) && (++__CLOVER_249_0.cloverRec.CT[6338]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6338]==0&false))) {{
				__CLOVER_249_0.cloverRec.S[21144]++;String s = n.getNodeValue();
				assert((((s == "" || s.matches("[ \t\n]+"))) && (++__CLOVER_249_0.cloverRec.CT[6339]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6339]==0&false));
			} }else {{
				assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6340]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6340]==0&false));
			}
		}}}

		}__CLOVER_249_0.cloverRec.S[21145]++;return new Heritage(nom, rename, export, undefine, redefine, select);
	}

	public Rename creer_rename(Element element) {__CLOVER_249_0.cloverRec.M[1462]++;
		assert((((element != null)) && (++__CLOVER_249_0.cloverRec.CT[6341]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6341]==0&false));
		assert((((element.getNodeName() == "rename")) && (++__CLOVER_249_0.cloverRec.CT[6342]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6342]==0&false));

		__CLOVER_249_0.cloverRec.S[21146]++;NodeList fils = element.getChildNodes();
		__CLOVER_249_0.cloverRec.S[21147]++;NomFeature nom1 = null, nom2 = null;
		__CLOVER_249_0.cloverRec.S[21148]++;int i;
		__CLOVER_249_0.cloverRec.S[21149]++;for (i = 0; (((i < fils.getLength()) && (++__CLOVER_249_0.cloverRec.CT[6343]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6343]==0&false)); i++) {{
			__CLOVER_249_0.cloverRec.S[21150]++;Node n = fils.item(i);
			//System.out.println("element=" + n.getNodeName());
			__CLOVER_249_0.cloverRec.S[21151]++;if ((((n instanceof Element) && (++__CLOVER_249_0.cloverRec.CT[6344]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6344]==0&false))) {{
				__CLOVER_249_0.cloverRec.S[21152]++;if ((((n.getNodeName() == "nom_feature") && (++__CLOVER_249_0.cloverRec.CT[6345]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6345]==0&false))) {{
					//System.out.println("nom_feature");
					__CLOVER_249_0.cloverRec.S[21153]++;if ((((nom1 == null) && (++__CLOVER_249_0.cloverRec.CT[6346]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6346]==0&false)))
						{__CLOVER_249_0.cloverRec.S[21154]++;nom1 = creer_nom_feature((Element) n);
					}else
						{__CLOVER_249_0.cloverRec.S[21155]++;nom2 = creer_nom_feature((Element) n);
				}} }else {{
					assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6347]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6347]==0&false));
				}
			}} }else {__CLOVER_249_0.cloverRec.S[21156]++;if ((((n instanceof Text) && (++__CLOVER_249_0.cloverRec.CT[6348]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6348]==0&false))) {{
				__CLOVER_249_0.cloverRec.S[21157]++;String s = n.getNodeValue();
				assert((((s == "" || s.matches("[ \t\n]+"))) && (++__CLOVER_249_0.cloverRec.CT[6349]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6349]==0&false));
			} }else {{
				assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6350]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6350]==0&false));
			}
		}}}
		}__CLOVER_249_0.cloverRec.S[21158]++;return new Rename(nom1, nom2);
	}

	public Export creer_export(Element element) {__CLOVER_249_0.cloverRec.M[1463]++;
		assert((((element != null)) && (++__CLOVER_249_0.cloverRec.CT[6351]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6351]==0&false));
		assert((((element.getNodeName() == "export")) && (++__CLOVER_249_0.cloverRec.CT[6352]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6352]==0&false));

		__CLOVER_249_0.cloverRec.S[21159]++;NodeList fils = element.getChildNodes();
		__CLOVER_249_0.cloverRec.S[21160]++;NomFeature nom1 = null;
		__CLOVER_249_0.cloverRec.S[21161]++;Type nom2 = null;
		__CLOVER_249_0.cloverRec.S[21162]++;Vector v1 = new Vector(), v2 = new Vector();
		__CLOVER_249_0.cloverRec.S[21163]++;int i;
		__CLOVER_249_0.cloverRec.S[21164]++;for (i = 0; (((i < fils.getLength()) && (++__CLOVER_249_0.cloverRec.CT[6353]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6353]==0&false)); i++) {{
			__CLOVER_249_0.cloverRec.S[21165]++;Node n = fils.item(i);
			//System.out.println("element=" + n.getNodeName());
			__CLOVER_249_0.cloverRec.S[21166]++;if ((((n instanceof Element) && (++__CLOVER_249_0.cloverRec.CT[6354]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6354]==0&false))) {{
				__CLOVER_249_0.cloverRec.S[21167]++;if ((((n.getNodeName() == "nom_feature") && (++__CLOVER_249_0.cloverRec.CT[6355]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6355]==0&false))) {{
					//System.out.println("nom_feature");
					__CLOVER_249_0.cloverRec.S[21168]++;nom1 = creer_nom_feature((Element) n);
					__CLOVER_249_0.cloverRec.S[21169]++;v1.addElement(nom1);
				} }else {__CLOVER_249_0.cloverRec.S[21170]++;if ((((n.getNodeName() == "nom_classe") && (++__CLOVER_249_0.cloverRec.CT[6356]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6356]==0&false))) {{
					//System.out.println("nom_classe");
					__CLOVER_249_0.cloverRec.S[21171]++;nom2 = creer_nom_classe((Element) n);
					__CLOVER_249_0.cloverRec.S[21172]++;v2.addElement(nom2);
				} }else {{
					assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6357]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6357]==0&false));
				}
			}}} }else {__CLOVER_249_0.cloverRec.S[21173]++;if ((((n instanceof Text) && (++__CLOVER_249_0.cloverRec.CT[6358]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6358]==0&false))) {{
				__CLOVER_249_0.cloverRec.S[21174]++;String s = n.getNodeValue();
				assert((((s == "" || s.matches("[ \t\n]+"))) && (++__CLOVER_249_0.cloverRec.CT[6359]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6359]==0&false));
			} }else {{
				assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6360]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6360]==0&false));
			}
		}}}
		}__CLOVER_249_0.cloverRec.S[21175]++;if((((v2!=null&&v2.size()>0) && (++__CLOVER_249_0.cloverRec.CT[6361]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6361]==0&false)))
			{assert((((v2.elementAt(0) instanceof Type)) && (++__CLOVER_249_0.cloverRec.CT[6362]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6362]==0&false));
		}__CLOVER_249_0.cloverRec.S[21176]++;return new Export(v1, v2);
	}

	public Vector creer_undefine(Element element) {__CLOVER_249_0.cloverRec.M[1464]++;
		assert((((element != null)) && (++__CLOVER_249_0.cloverRec.CT[6363]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6363]==0&false));
		assert((((element.getNodeName() == "undefine")) && (++__CLOVER_249_0.cloverRec.CT[6364]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6364]==0&false));

		__CLOVER_249_0.cloverRec.S[21177]++;NodeList fils = element.getChildNodes();
		__CLOVER_249_0.cloverRec.S[21178]++;NomFeature nom1 = null;
		__CLOVER_249_0.cloverRec.S[21179]++;Vector v = new Vector();
		__CLOVER_249_0.cloverRec.S[21180]++;int i;
		__CLOVER_249_0.cloverRec.S[21181]++;for (i = 0; (((i < fils.getLength()) && (++__CLOVER_249_0.cloverRec.CT[6365]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6365]==0&false)); i++) {{
			__CLOVER_249_0.cloverRec.S[21182]++;Node n = fils.item(i);
			//System.out.println("element=" + n.getNodeName());
			__CLOVER_249_0.cloverRec.S[21183]++;if ((((n instanceof Element) && (++__CLOVER_249_0.cloverRec.CT[6366]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6366]==0&false))) {{
				__CLOVER_249_0.cloverRec.S[21184]++;if ((((n.getNodeName() == "nom_feature") && (++__CLOVER_249_0.cloverRec.CT[6367]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6367]==0&false))) {{
					//System.out.println("nom_feature");
					__CLOVER_249_0.cloverRec.S[21185]++;nom1 = creer_nom_feature((Element) n);
					__CLOVER_249_0.cloverRec.S[21186]++;v.addElement(nom1);
				} }else {{
					assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6368]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6368]==0&false));
				}
			}} }else {__CLOVER_249_0.cloverRec.S[21187]++;if ((((n instanceof Text) && (++__CLOVER_249_0.cloverRec.CT[6369]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6369]==0&false))) {{
				__CLOVER_249_0.cloverRec.S[21188]++;String s = n.getNodeValue();
				assert((((s == "" || s.matches("[ \t\n]+"))) && (++__CLOVER_249_0.cloverRec.CT[6370]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6370]==0&false));
			} }else {{
				assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6371]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6371]==0&false));
			}
		}}}
		}__CLOVER_249_0.cloverRec.S[21189]++;return v;
	}

	public Vector creer_redefine(Element element) {__CLOVER_249_0.cloverRec.M[1465]++;
		assert((((element != null)) && (++__CLOVER_249_0.cloverRec.CT[6372]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6372]==0&false));
		assert((((element.getNodeName() == "redefine")) && (++__CLOVER_249_0.cloverRec.CT[6373]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6373]==0&false));

		__CLOVER_249_0.cloverRec.S[21190]++;NodeList fils = element.getChildNodes();
		__CLOVER_249_0.cloverRec.S[21191]++;NomFeature nom1 = null;
		__CLOVER_249_0.cloverRec.S[21192]++;Vector v = new Vector();
		__CLOVER_249_0.cloverRec.S[21193]++;int i;
		__CLOVER_249_0.cloverRec.S[21194]++;for (i = 0; (((i < fils.getLength()) && (++__CLOVER_249_0.cloverRec.CT[6374]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6374]==0&false)); i++) {{
			__CLOVER_249_0.cloverRec.S[21195]++;Node n = fils.item(i);
			//System.out.println("element=" + n.getNodeName());
			__CLOVER_249_0.cloverRec.S[21196]++;if ((((n instanceof Element) && (++__CLOVER_249_0.cloverRec.CT[6375]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6375]==0&false))) {{
				__CLOVER_249_0.cloverRec.S[21197]++;if ((((n.getNodeName() == "nom_feature") && (++__CLOVER_249_0.cloverRec.CT[6376]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6376]==0&false))) {{
					//System.out.println("nom_feature");
					__CLOVER_249_0.cloverRec.S[21198]++;nom1 = creer_nom_feature((Element) n);
					__CLOVER_249_0.cloverRec.S[21199]++;v.addElement(nom1);
				} }else {{
					assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6377]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6377]==0&false));
				}
			}} }else {__CLOVER_249_0.cloverRec.S[21200]++;if ((((n instanceof Text) && (++__CLOVER_249_0.cloverRec.CT[6378]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6378]==0&false))) {{
				__CLOVER_249_0.cloverRec.S[21201]++;String s = n.getNodeValue();
				assert((((s == "" || s.matches("[ \t\n]+"))) && (++__CLOVER_249_0.cloverRec.CT[6379]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6379]==0&false));
			} }else {{
				assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6380]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6380]==0&false));
			}
		}}}
		}__CLOVER_249_0.cloverRec.S[21202]++;return v;
	}

	public Vector creer_select(Element element) {__CLOVER_249_0.cloverRec.M[1466]++;
		assert((((element != null)) && (++__CLOVER_249_0.cloverRec.CT[6381]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6381]==0&false));
		assert((((element.getNodeName() == "select")) && (++__CLOVER_249_0.cloverRec.CT[6382]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6382]==0&false));

		__CLOVER_249_0.cloverRec.S[21203]++;NodeList fils = element.getChildNodes();
		__CLOVER_249_0.cloverRec.S[21204]++;NomFeature nom1 = null;
		__CLOVER_249_0.cloverRec.S[21205]++;Vector v = new Vector();
		__CLOVER_249_0.cloverRec.S[21206]++;int i;
		__CLOVER_249_0.cloverRec.S[21207]++;for (i = 0; (((i < fils.getLength()) && (++__CLOVER_249_0.cloverRec.CT[6383]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6383]==0&false)); i++) {{
			__CLOVER_249_0.cloverRec.S[21208]++;Node n = fils.item(i);
			//System.out.println("element=" + n.getNodeName());
			__CLOVER_249_0.cloverRec.S[21209]++;if ((((n instanceof Element) && (++__CLOVER_249_0.cloverRec.CT[6384]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6384]==0&false))) {{
				__CLOVER_249_0.cloverRec.S[21210]++;if ((((n.getNodeName() == "nom_feature") && (++__CLOVER_249_0.cloverRec.CT[6385]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6385]==0&false))) {{
					//System.out.println("nom_feature");
					__CLOVER_249_0.cloverRec.S[21211]++;nom1 = creer_nom_feature((Element) n);
					__CLOVER_249_0.cloverRec.S[21212]++;v.addElement(nom1);
				} }else {{
					assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6386]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6386]==0&false));
				}
			}} }else {__CLOVER_249_0.cloverRec.S[21213]++;if ((((n instanceof Text) && (++__CLOVER_249_0.cloverRec.CT[6387]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6387]==0&false))) {{
				__CLOVER_249_0.cloverRec.S[21214]++;String s = n.getNodeValue();
				assert((((s == "" || s.matches("[ \t\n]+"))) && (++__CLOVER_249_0.cloverRec.CT[6388]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6388]==0&false));
			} }else {{
				assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6389]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6389]==0&false));
			}
		}}}
		}__CLOVER_249_0.cloverRec.S[21215]++;return v;
	}

	public Creation creer_creation(Element element) {__CLOVER_249_0.cloverRec.M[1467]++;
		assert((((element != null)) && (++__CLOVER_249_0.cloverRec.CT[6390]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6390]==0&false));
		assert((((element.getNodeName() == "creation")) && (++__CLOVER_249_0.cloverRec.CT[6391]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6391]==0&false));

		__CLOVER_249_0.cloverRec.S[21216]++;Creation res=null;
		__CLOVER_249_0.cloverRec.S[21217]++;NodeList fils = element.getChildNodes();
		__CLOVER_249_0.cloverRec.S[21218]++;NamedNodeMap attributs = element.getAttributes();
		__CLOVER_249_0.cloverRec.S[21219]++;boolean export_none = false;
		//NomFeature nom1 = null, nom2 = null;
		__CLOVER_249_0.cloverRec.S[21220]++;Vector v1 = new Vector(), v2 = new Vector();
		__CLOVER_249_0.cloverRec.S[21221]++;int i;
		__CLOVER_249_0.cloverRec.S[21222]++;for (i = 0; (((i < attributs.getLength()) && (++__CLOVER_249_0.cloverRec.CT[6392]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6392]==0&false)); i++) {{
			__CLOVER_249_0.cloverRec.S[21223]++;Node num\u00e9ro = attributs.item(i);
			__CLOVER_249_0.cloverRec.S[21224]++;String nomAttribut = num\u00e9ro.getNodeName();
			__CLOVER_249_0.cloverRec.S[21225]++;String valeurAttribut = num\u00e9ro.getNodeValue();
			//System.out.println(nomAttribut + " =\"" + valeurAttribut + "\"");
			__CLOVER_249_0.cloverRec.S[21226]++;if ((((nomAttribut.equalsIgnoreCase("export_none")) && (++__CLOVER_249_0.cloverRec.CT[6393]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6393]==0&false)))
				{__CLOVER_249_0.cloverRec.S[21227]++;export_none=valeurAttribut.equalsIgnoreCase("true");
			}else
				{assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6394]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6394]==0&false));
		}}
		}__CLOVER_249_0.cloverRec.S[21228]++;for (i = 0; (((i < fils.getLength()) && (++__CLOVER_249_0.cloverRec.CT[6395]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6395]==0&false)); i++) {{
			__CLOVER_249_0.cloverRec.S[21229]++;Node n = fils.item(i);
			//System.out.println("element=" + n.getNodeName());
			__CLOVER_249_0.cloverRec.S[21230]++;if ((((n instanceof Element) && (++__CLOVER_249_0.cloverRec.CT[6396]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6396]==0&false))) {{
				__CLOVER_249_0.cloverRec.S[21231]++;if ((((n.getNodeName() == "nom_feature") && (++__CLOVER_249_0.cloverRec.CT[6397]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6397]==0&false))) {{
					//System.out.println("nom_feature");
					__CLOVER_249_0.cloverRec.S[21232]++;NomFeature nom1 = creer_nom_feature((Element) n);
					__CLOVER_249_0.cloverRec.S[21233]++;v1.addElement(nom1);
				} }else {__CLOVER_249_0.cloverRec.S[21234]++;if ((((n.getNodeName() == "nom_classe") && (++__CLOVER_249_0.cloverRec.CT[6398]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6398]==0&false))) {{
					//System.out.println("nom_classe");
					__CLOVER_249_0.cloverRec.S[21235]++;Type nom2 = creer_nom_classe((Element) n);
					__CLOVER_249_0.cloverRec.S[21236]++;v2.addElement(nom2);
				} }else {{
					assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6399]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6399]==0&false));
				}
			}}} }else {__CLOVER_249_0.cloverRec.S[21237]++;if ((((n instanceof Text) && (++__CLOVER_249_0.cloverRec.CT[6400]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6400]==0&false))) {{
				__CLOVER_249_0.cloverRec.S[21238]++;String s = n.getNodeValue();
				assert((((s == "" || s.matches("[ \t\n]+"))) && (++__CLOVER_249_0.cloverRec.CT[6401]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6401]==0&false));
			} }else {{
				assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6402]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6402]==0&false));
			}
		}}}
		}__CLOVER_249_0.cloverRec.S[21239]++;if((((export_none) && (++__CLOVER_249_0.cloverRec.CT[6403]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6403]==0&false)))
		{{
			assert((((v2.size()==0)) && (++__CLOVER_249_0.cloverRec.CT[6404]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6404]==0&false));
			__CLOVER_249_0.cloverRec.S[21240]++;res=new Creation(v2, v1);
		}
		}else {__CLOVER_249_0.cloverRec.S[21241]++;if((((v2.size()==0) && (++__CLOVER_249_0.cloverRec.CT[6405]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6405]==0&false)))
		{{
			__CLOVER_249_0.cloverRec.S[21242]++;res=new Creation(null, v1);
		}
		}else
		{{
			__CLOVER_249_0.cloverRec.S[21243]++;res=new Creation(v2, v1);
		}
		}}assert((((res!=null)) && (++__CLOVER_249_0.cloverRec.CT[6406]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6406]==0&false));
		__CLOVER_249_0.cloverRec.S[21244]++;return res;
	}

	public Expr creer_expression(Element element) {__CLOVER_249_0.cloverRec.M[1468]++;
		assert((((element != null)) && (++__CLOVER_249_0.cloverRec.CT[6407]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6407]==0&false));
		assert((((element.getNodeName() == "expression")) && (++__CLOVER_249_0.cloverRec.CT[6408]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6408]==0&false));

		__CLOVER_249_0.cloverRec.S[21245]++;NodeList fils = element.getChildNodes();
		//NomFeature nom1 = null, nom2 = null;
		__CLOVER_249_0.cloverRec.S[21246]++;Vector v1 = new Vector(), v2 = new Vector();
		__CLOVER_249_0.cloverRec.S[21247]++;Expr res = null;
		__CLOVER_249_0.cloverRec.S[21248]++;int i;
		__CLOVER_249_0.cloverRec.S[21249]++;for (i = 0; (((i < fils.getLength()) && (++__CLOVER_249_0.cloverRec.CT[6409]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6409]==0&false)); i++) {{
			__CLOVER_249_0.cloverRec.S[21250]++;Node n = fils.item(i);
			//System.out.println("element=" + n.getNodeName());
			__CLOVER_249_0.cloverRec.S[21251]++;if ((((n instanceof Element) && (++__CLOVER_249_0.cloverRec.CT[6410]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6410]==0&false))) {{
				__CLOVER_249_0.cloverRec.S[21252]++;if ((((n.getNodeName() == "entier") && (++__CLOVER_249_0.cloverRec.CT[6411]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6411]==0&false))) {{
					//System.out.println("entier");
					__CLOVER_249_0.cloverRec.S[21253]++;res = creer_entier((Element) n);
				} }else {__CLOVER_249_0.cloverRec.S[21254]++;if ((((n.getNodeName() == "variable") && (++__CLOVER_249_0.cloverRec.CT[6412]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6412]==0&false))) {{
					//System.out.println("variable");
					__CLOVER_249_0.cloverRec.S[21255]++;res = creer_variable((Element) n);
				} }else {__CLOVER_249_0.cloverRec.S[21256]++;if ((((n.getNodeName() == "reel") && (++__CLOVER_249_0.cloverRec.CT[6413]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6413]==0&false))) {{
					//System.out.println("reel");
					__CLOVER_249_0.cloverRec.S[21257]++;res = creer_reel((Element) n);
				} }else {__CLOVER_249_0.cloverRec.S[21258]++;if ((((n.getNodeName() == "chaine") && (++__CLOVER_249_0.cloverRec.CT[6414]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6414]==0&false))) {{
					//System.out.println("chaine");
					__CLOVER_249_0.cloverRec.S[21259]++;res = new Expr_Chaine(creer_chaine((Element) n));
				} }else {__CLOVER_249_0.cloverRec.S[21260]++;if ((((n.getNodeName() == "appel") && (++__CLOVER_249_0.cloverRec.CT[6415]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6415]==0&false))) {{
					//System.out.println("appel");
					__CLOVER_249_0.cloverRec.S[21261]++;res = creer_appel((Element) n);
				} }else {__CLOVER_249_0.cloverRec.S[21262]++;if ((((n.getNodeName() == "tableau") && (++__CLOVER_249_0.cloverRec.CT[6416]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6416]==0&false))) {{
					//System.out.println("tableau");
					__CLOVER_249_0.cloverRec.S[21263]++;res = creer_tableau((Element) n);
				} }else {__CLOVER_249_0.cloverRec.S[21264]++;if ((((n.getNodeName() == "expression_binaire") && (++__CLOVER_249_0.cloverRec.CT[6417]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6417]==0&false))) {{
					//System.out.println("expression_binaire");
					__CLOVER_249_0.cloverRec.S[21265]++;res = creer_expression_binaire((Element) n);
				} }else {__CLOVER_249_0.cloverRec.S[21266]++;if ((((n.getNodeName() == "expression_unaire") && (++__CLOVER_249_0.cloverRec.CT[6418]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6418]==0&false))) {{
					//System.out.println("expression_unaire");
					__CLOVER_249_0.cloverRec.S[21267]++;res = creer_expression_unaire((Element) n);
				} }else {__CLOVER_249_0.cloverRec.S[21268]++;if ((((n.getNodeName() == "car") && (++__CLOVER_249_0.cloverRec.CT[6419]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6419]==0&false))) {{
					//System.out.println("car");
					__CLOVER_249_0.cloverRec.S[21269]++;res = creer_car((Element) n);
				} }else {__CLOVER_249_0.cloverRec.S[21270]++;if ((((n.getNodeName() == "vrai") && (++__CLOVER_249_0.cloverRec.CT[6420]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6420]==0&false))) {{
					//System.out.println("vrai");
					__CLOVER_249_0.cloverRec.S[21271]++;res = creer_vrai((Element) n);
				} }else {__CLOVER_249_0.cloverRec.S[21272]++;if ((((n.getNodeName() == "faux") && (++__CLOVER_249_0.cloverRec.CT[6421]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6421]==0&false))) {{
					//System.out.println("faux");
					__CLOVER_249_0.cloverRec.S[21273]++;res = creer_faux((Element) n);
				} }else {{
					assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6422]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6422]==0&false)):"expr op="+n.getNodeName();
				}
			}}}}}}}}}}}} }else {__CLOVER_249_0.cloverRec.S[21274]++;if ((((n instanceof Text) && (++__CLOVER_249_0.cloverRec.CT[6423]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6423]==0&false))) {{
				__CLOVER_249_0.cloverRec.S[21275]++;String s = n.getNodeValue();
				assert((((s == "" || s.matches("[ \t\n]+"))) && (++__CLOVER_249_0.cloverRec.CT[6424]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6424]==0&false));
			} }else {{
				assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6425]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6425]==0&false));
			}
		}}}
		}__CLOVER_249_0.cloverRec.S[21276]++;return res;
	}

	public Expr_Var creer_variable(Element element) {__CLOVER_249_0.cloverRec.M[1469]++;
		assert((((element != null)) && (++__CLOVER_249_0.cloverRec.CT[6426]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6426]==0&false));
		assert((((element.getNodeName() == "variable")) && (++__CLOVER_249_0.cloverRec.CT[6427]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6427]==0&false));

		__CLOVER_249_0.cloverRec.S[21277]++;NamedNodeMap attributs = element.getAttributes();
		__CLOVER_249_0.cloverRec.S[21278]++;String nom = null;
		__CLOVER_249_0.cloverRec.S[21279]++;boolean frozen = false;
		__CLOVER_249_0.cloverRec.S[21280]++;for (int i = 0; (((i < attributs.getLength()) && (++__CLOVER_249_0.cloverRec.CT[6428]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6428]==0&false)); i++) {{
			__CLOVER_249_0.cloverRec.S[21281]++;Node num\u00e9ro = attributs.item(i);
			__CLOVER_249_0.cloverRec.S[21282]++;String nomAttribut = num\u00e9ro.getNodeName();
			__CLOVER_249_0.cloverRec.S[21283]++;String valeurAttribut = num\u00e9ro.getNodeValue();
			//System.out.println(nomAttribut + " =\"" + valeurAttribut + "\"");
			__CLOVER_249_0.cloverRec.S[21284]++;if ((((nomAttribut == "nom") && (++__CLOVER_249_0.cloverRec.CT[6429]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6429]==0&false)))
				{__CLOVER_249_0.cloverRec.S[21285]++;nom = valeurAttribut;
			}else
				{assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6430]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6430]==0&false));
		}}
		}assert((((nom != null)) && (++__CLOVER_249_0.cloverRec.CT[6431]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6431]==0&false));

		/*NodeList fils = element.getChildNodes();
		//NomFeature nom1 = null, nom2 = null;
		Vector v1=new Vector(),v2=new Vector();
		int i;
		for (i = 0; i < fils.getLength(); i++) {
		  Node n = fils.item(i);
		  System.out.println("element=" + n.getNodeName());
		  if (n instanceof Element) {
		    if (n.getNodeName() == "nom_feature") {
		      System.out.println("nom_feature");
		      NomFeature nom1 = creer_nom_feature( (Element) n);
		      v1.addElement(nom1);
		    }
		    else if (n.getNodeName() == "nom_classe") {
		      System.out.println("nom_classe");
		      Type nom2 = creer_nom_classe( (Element) n);
		      v2.addElement(nom2);
		    }
		    else {
		      assert (false);
		    }
		  }
		  else if (n instanceof Text) {
		    String s = n.getNodeValue();
		    assert (s == "" || s.matches("[ \t\n]+"));
		  }
		  else {
		    assert (false);
		  }
		}*/
		__CLOVER_249_0.cloverRec.S[21286]++;return new Expr_Var(nom, new Token(-1,-1,"",""));
	}

	public Expr_Appel creer_appel(Element element) {__CLOVER_249_0.cloverRec.M[1470]++;
		assert((((element != null)) && (++__CLOVER_249_0.cloverRec.CT[6432]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6432]==0&false));
		assert((((element.getNodeName() == "appel")) && (++__CLOVER_249_0.cloverRec.CT[6433]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6433]==0&false));

		__CLOVER_249_0.cloverRec.S[21287]++;NodeList fils = element.getChildNodes();
		__CLOVER_249_0.cloverRec.S[21288]++;Vector v1 = new Vector();
		__CLOVER_249_0.cloverRec.S[21289]++;int i;
		__CLOVER_249_0.cloverRec.S[21290]++;NamedNodeMap attributs = element.getAttributes();
		__CLOVER_249_0.cloverRec.S[21291]++;boolean frozen = false;
		__CLOVER_249_0.cloverRec.S[21292]++;String nom = null;
		__CLOVER_249_0.cloverRec.S[21293]++;for (i = 0; (((i < attributs.getLength()) && (++__CLOVER_249_0.cloverRec.CT[6434]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6434]==0&false)); i++) {{
			__CLOVER_249_0.cloverRec.S[21294]++;Node num\u00e9ro = attributs.item(i);
			__CLOVER_249_0.cloverRec.S[21295]++;String nomAttribut = num\u00e9ro.getNodeName();
			__CLOVER_249_0.cloverRec.S[21296]++;String valeurAttribut = num\u00e9ro.getNodeValue();
			//System.out.println(nomAttribut + " =\"" + valeurAttribut + "\"");
			__CLOVER_249_0.cloverRec.S[21297]++;if ((((nomAttribut == "nom") && (++__CLOVER_249_0.cloverRec.CT[6435]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6435]==0&false)))
				{__CLOVER_249_0.cloverRec.S[21298]++;nom = valeurAttribut;
			}else
				{assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6436]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6436]==0&false));
		}}
		}assert((((nom != null)) && (++__CLOVER_249_0.cloverRec.CT[6437]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6437]==0&false));

		__CLOVER_249_0.cloverRec.S[21299]++;for (i = 0; (((i < fils.getLength()) && (++__CLOVER_249_0.cloverRec.CT[6438]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6438]==0&false)); i++) {{
			__CLOVER_249_0.cloverRec.S[21300]++;Node n = fils.item(i);
			//System.out.println("element=" + n.getNodeName());
			__CLOVER_249_0.cloverRec.S[21301]++;if ((((n instanceof Element) && (++__CLOVER_249_0.cloverRec.CT[6439]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6439]==0&false))) {{
				__CLOVER_249_0.cloverRec.S[21302]++;if ((((n.getNodeName() == "parametre_reel") && (++__CLOVER_249_0.cloverRec.CT[6440]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6440]==0&false))) {{
					//System.out.println("parametre_reel");
					__CLOVER_249_0.cloverRec.S[21303]++;Expr nom1 = creer_parametre_reel((Element) n);
					__CLOVER_249_0.cloverRec.S[21304]++;v1.addElement(nom1);
				} }else {__CLOVER_249_0.cloverRec.S[21305]++;if ((((n.getNodeName() == "appel") && (++__CLOVER_249_0.cloverRec.CT[6441]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6441]==0&false))) {{
					//System.out.println("appel");
					__CLOVER_249_0.cloverRec.S[21306]++;Expr appel = creer_appel((Element) n);
				} }else {{
					assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6442]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6442]==0&false));
				}
			}}} }else {__CLOVER_249_0.cloverRec.S[21307]++;if ((((n instanceof Text) && (++__CLOVER_249_0.cloverRec.CT[6443]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6443]==0&false))) {{
				__CLOVER_249_0.cloverRec.S[21308]++;String s = n.getNodeValue();
				assert((((s == "" || s.matches("[ \t\n]+"))) && (++__CLOVER_249_0.cloverRec.CT[6444]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6444]==0&false));
			} }else {{
				assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6445]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6445]==0&false));
			}
		}}}
		}__CLOVER_249_0.cloverRec.S[21309]++;return new Expr_Appel(nom, v1, null);
	}

	public Expr_Tableau creer_tableau(Element element) {__CLOVER_249_0.cloverRec.M[1471]++;
		assert((((element != null)) && (++__CLOVER_249_0.cloverRec.CT[6446]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6446]==0&false));
		assert((((element.getNodeName() == "tableau")) && (++__CLOVER_249_0.cloverRec.CT[6447]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6447]==0&false));

		__CLOVER_249_0.cloverRec.S[21310]++;NodeList fils = element.getChildNodes();
		__CLOVER_249_0.cloverRec.S[21311]++;Vector v1 = new Vector();
		__CLOVER_249_0.cloverRec.S[21312]++;int i;
		__CLOVER_249_0.cloverRec.S[21313]++;NamedNodeMap attributs = element.getAttributes();
		assert((((attributs.getLength()==0)) && (++__CLOVER_249_0.cloverRec.CT[6448]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6448]==0&false));

		__CLOVER_249_0.cloverRec.S[21314]++;for (i = 0; (((i < fils.getLength()) && (++__CLOVER_249_0.cloverRec.CT[6449]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6449]==0&false)); i++) {{
			__CLOVER_249_0.cloverRec.S[21315]++;Node n = fils.item(i);
			//System.out.println("element=" + n.getNodeName());
			__CLOVER_249_0.cloverRec.S[21316]++;if ((((n instanceof Element) && (++__CLOVER_249_0.cloverRec.CT[6450]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6450]==0&false))) {{
				__CLOVER_249_0.cloverRec.S[21317]++;if ((((n.getNodeName() == "expression") && (++__CLOVER_249_0.cloverRec.CT[6451]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6451]==0&false))) {{
					//System.out.println("expression");
					__CLOVER_249_0.cloverRec.S[21318]++;Expr expr = creer_expression((Element) n);
					__CLOVER_249_0.cloverRec.S[21319]++;v1.addElement(expr);
				} }else {{
					assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6452]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6452]==0&false));
				}
			}} }else {__CLOVER_249_0.cloverRec.S[21320]++;if ((((n instanceof Text) && (++__CLOVER_249_0.cloverRec.CT[6453]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6453]==0&false))) {{
				__CLOVER_249_0.cloverRec.S[21321]++;String s = n.getNodeValue();
				assert((((s == "" || s.matches("[ \t\n]+"))) && (++__CLOVER_249_0.cloverRec.CT[6454]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6454]==0&false));
			} }else {{
				assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6455]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6455]==0&false));
			}
		}}}
		}__CLOVER_249_0.cloverRec.S[21322]++;return new Expr_Tableau(v1, new Token(-1,-1,"",""));
	}

	public Expr creer_parametre_reel(Element element) {__CLOVER_249_0.cloverRec.M[1472]++;
		assert((((element != null)) && (++__CLOVER_249_0.cloverRec.CT[6456]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6456]==0&false));
		assert((((element.getNodeName() == "parametre_reel")) && (++__CLOVER_249_0.cloverRec.CT[6457]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6457]==0&false));

		__CLOVER_249_0.cloverRec.S[21323]++;NodeList fils = element.getChildNodes();
		__CLOVER_249_0.cloverRec.S[21324]++;Expr res = null;
		__CLOVER_249_0.cloverRec.S[21325]++;int i;
		__CLOVER_249_0.cloverRec.S[21326]++;for (i = 0; (((i < fils.getLength()) && (++__CLOVER_249_0.cloverRec.CT[6458]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6458]==0&false)); i++) {{
			__CLOVER_249_0.cloverRec.S[21327]++;Node n = fils.item(i);
			//System.out.println("element=" + n.getNodeName());
			__CLOVER_249_0.cloverRec.S[21328]++;if ((((n instanceof Element) && (++__CLOVER_249_0.cloverRec.CT[6459]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6459]==0&false))) {{
				__CLOVER_249_0.cloverRec.S[21329]++;if ((((n.getNodeName() == "expression") && (++__CLOVER_249_0.cloverRec.CT[6460]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6460]==0&false))) {{
					//System.out.println("expression");
					assert((((res == null)) && (++__CLOVER_249_0.cloverRec.CT[6461]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6461]==0&false));
					__CLOVER_249_0.cloverRec.S[21330]++;res = creer_expression((Element) n);
				} }else {{
					assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6462]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6462]==0&false));
				}
			}} }else {__CLOVER_249_0.cloverRec.S[21331]++;if ((((n instanceof Text) && (++__CLOVER_249_0.cloverRec.CT[6463]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6463]==0&false))) {{
				__CLOVER_249_0.cloverRec.S[21332]++;String s = n.getNodeValue();
				assert((((s == "" || s.matches("[ \t\n]+"))) && (++__CLOVER_249_0.cloverRec.CT[6464]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6464]==0&false));
			} }else {{
				assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6465]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6465]==0&false));
			}
		}}}
		}assert((((res != null)) && (++__CLOVER_249_0.cloverRec.CT[6466]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6466]==0&false));
		__CLOVER_249_0.cloverRec.S[21333]++;return res;
	}

	public Expr creer_car(Element element) {__CLOVER_249_0.cloverRec.M[1473]++;
		assert((((element != null)) && (++__CLOVER_249_0.cloverRec.CT[6467]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6467]==0&false));
		assert((((element.getNodeName() == "car")) && (++__CLOVER_249_0.cloverRec.CT[6468]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6468]==0&false));

		__CLOVER_249_0.cloverRec.S[21334]++;NodeList fils = element.getChildNodes();
		__CLOVER_249_0.cloverRec.S[21335]++;Expr res = null;
		__CLOVER_249_0.cloverRec.S[21336]++;String text=null;
		__CLOVER_249_0.cloverRec.S[21337]++;int i;
		__CLOVER_249_0.cloverRec.S[21338]++;for (i = 0; (((i < fils.getLength()) && (++__CLOVER_249_0.cloverRec.CT[6469]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6469]==0&false)); i++) {{
			__CLOVER_249_0.cloverRec.S[21339]++;Node n = fils.item(i);
			//System.out.println("element=" + n.getNodeName());
			__CLOVER_249_0.cloverRec.S[21340]++;if ((((n instanceof Text) && (++__CLOVER_249_0.cloverRec.CT[6470]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6470]==0&false))) {{
				assert((((text==null)) && (++__CLOVER_249_0.cloverRec.CT[6471]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6471]==0&false));
				__CLOVER_249_0.cloverRec.S[21341]++;String s = n.getNodeValue();
				assert((((s != "")) && (++__CLOVER_249_0.cloverRec.CT[6472]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6472]==0&false));
				__CLOVER_249_0.cloverRec.S[21342]++;text=s;
			} }else {{
				assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6473]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6473]==0&false));
			}
		}}
		}assert((((text!=null)) && (++__CLOVER_249_0.cloverRec.CT[6474]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6474]==0&false));
		__CLOVER_249_0.cloverRec.S[21343]++;res=new Expr_Car(text,new Token(-1,-1,"",""));
		__CLOVER_249_0.cloverRec.S[21344]++;return res;
	}

	public Instr creer_retry(Element element) {__CLOVER_249_0.cloverRec.M[1474]++;
		assert((((element != null)) && (++__CLOVER_249_0.cloverRec.CT[6475]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6475]==0&false));
		assert((((element.getNodeName() == "retry")) && (++__CLOVER_249_0.cloverRec.CT[6476]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6476]==0&false));

		__CLOVER_249_0.cloverRec.S[21345]++;NodeList fils = element.getChildNodes();
		__CLOVER_249_0.cloverRec.S[21346]++;Instr res = null;
		__CLOVER_249_0.cloverRec.S[21347]++;String text=null;
		__CLOVER_249_0.cloverRec.S[21348]++;int i;
		/*for (i = 0; i < fils.getLength(); i++) {
			Node n = fils.item(i);
			//System.out.println("element=" + n.getNodeName());
			if (n instanceof Text) {
				assert(text==null);
				String s = n.getNodeValue();
				assert(s != "");
				text=s;
			} else {
				assert(false);
			}
		}
		assert(text!=null);
		res=new Expr_Car(text,new Token(-1,-1,"",""));*/
		__CLOVER_249_0.cloverRec.S[21349]++;res=new Instr_Retry();
		__CLOVER_249_0.cloverRec.S[21350]++;return res;
	}
	
	public Expr_Vrai creer_vrai(Element element) {__CLOVER_249_0.cloverRec.M[1475]++;
		assert((((element != null)) && (++__CLOVER_249_0.cloverRec.CT[6477]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6477]==0&false));
		assert((((element.getNodeName() == "vrai")) && (++__CLOVER_249_0.cloverRec.CT[6478]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6478]==0&false));

		__CLOVER_249_0.cloverRec.S[21351]++;NodeList fils = element.getChildNodes();
		__CLOVER_249_0.cloverRec.S[21352]++;Vector v1 = new Vector();
		__CLOVER_249_0.cloverRec.S[21353]++;int i;
		__CLOVER_249_0.cloverRec.S[21354]++;NamedNodeMap attributs = element.getAttributes();
		__CLOVER_249_0.cloverRec.S[21355]++;boolean frozen = false;
		assert((((attributs.getLength()==0)) && (++__CLOVER_249_0.cloverRec.CT[6479]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6479]==0&false));
		assert((((fils.getLength() == 0)) && (++__CLOVER_249_0.cloverRec.CT[6480]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6480]==0&false));

		__CLOVER_249_0.cloverRec.S[21356]++;return new Expr_Vrai(new Token(-1,-1,"",""));
	}
	
	public Expr_Faux creer_faux(Element element) {__CLOVER_249_0.cloverRec.M[1476]++;
		assert((((element != null)) && (++__CLOVER_249_0.cloverRec.CT[6481]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6481]==0&false));
		assert((((element.getNodeName().equals("faux"))) && (++__CLOVER_249_0.cloverRec.CT[6482]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6482]==0&false));

		__CLOVER_249_0.cloverRec.S[21357]++;NodeList fils = element.getChildNodes();
		__CLOVER_249_0.cloverRec.S[21358]++;Vector v1 = new Vector();
		__CLOVER_249_0.cloverRec.S[21359]++;int i;
		__CLOVER_249_0.cloverRec.S[21360]++;NamedNodeMap attributs = element.getAttributes();
		__CLOVER_249_0.cloverRec.S[21361]++;boolean frozen = false;
		assert((((attributs.getLength()==0)) && (++__CLOVER_249_0.cloverRec.CT[6483]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6483]==0&false));
		assert((((fils.getLength() == 0)) && (++__CLOVER_249_0.cloverRec.CT[6484]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6484]==0&false));

		__CLOVER_249_0.cloverRec.S[21362]++;return new Expr_Faux(new Token(-1,-1,"",""));
	}

	public Expr_Entier creer_entier(Element element) {__CLOVER_249_0.cloverRec.M[1477]++;
		assert((((element != null)) && (++__CLOVER_249_0.cloverRec.CT[6485]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6485]==0&false));
		assert((((element.getNodeName() == "entier")) && (++__CLOVER_249_0.cloverRec.CT[6486]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6486]==0&false));

		__CLOVER_249_0.cloverRec.S[21363]++;NodeList fils = element.getChildNodes();
		__CLOVER_249_0.cloverRec.S[21364]++;Vector v1 = new Vector();
		__CLOVER_249_0.cloverRec.S[21365]++;int i;
		__CLOVER_249_0.cloverRec.S[21366]++;NamedNodeMap attributs = element.getAttributes();
		__CLOVER_249_0.cloverRec.S[21367]++;boolean frozen = false;
		__CLOVER_249_0.cloverRec.S[21368]++;String valeur = null;
		__CLOVER_249_0.cloverRec.S[21369]++;for (i = 0; (((i < attributs.getLength()) && (++__CLOVER_249_0.cloverRec.CT[6487]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6487]==0&false)); i++) {{
			__CLOVER_249_0.cloverRec.S[21370]++;Node num\u00e9ro = attributs.item(i);
			__CLOVER_249_0.cloverRec.S[21371]++;String nomAttribut = num\u00e9ro.getNodeName();
			__CLOVER_249_0.cloverRec.S[21372]++;String valeurAttribut = num\u00e9ro.getNodeValue();
			//System.out.println(nomAttribut + " =\"" + valeurAttribut + "\"");
			__CLOVER_249_0.cloverRec.S[21373]++;if ((((nomAttribut == "valeur") && (++__CLOVER_249_0.cloverRec.CT[6488]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6488]==0&false)))
				{__CLOVER_249_0.cloverRec.S[21374]++;valeur = valeurAttribut;
			}else
				{assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6489]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6489]==0&false));
		}}
		}assert((((valeur != null)) && (++__CLOVER_249_0.cloverRec.CT[6490]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6490]==0&false));
		assert((((fils.getLength() == 0)) && (++__CLOVER_249_0.cloverRec.CT[6491]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6491]==0&false));

		__CLOVER_249_0.cloverRec.S[21375]++;return new Expr_Entier(valeur, null);
	}

	public Expr_Reel creer_reel(Element element) {__CLOVER_249_0.cloverRec.M[1478]++;
		assert((((element != null)) && (++__CLOVER_249_0.cloverRec.CT[6492]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6492]==0&false));
		assert((((element.getNodeName() == "reel")) && (++__CLOVER_249_0.cloverRec.CT[6493]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6493]==0&false));

		__CLOVER_249_0.cloverRec.S[21376]++;NodeList fils = element.getChildNodes();
		__CLOVER_249_0.cloverRec.S[21377]++;Vector v1 = new Vector();
		__CLOVER_249_0.cloverRec.S[21378]++;int i;
		__CLOVER_249_0.cloverRec.S[21379]++;NamedNodeMap attributs = element.getAttributes();
		//assert(attributs.getLength()==0);
		//boolean frozen = false;
		__CLOVER_249_0.cloverRec.S[21380]++;String valeur = null;
		__CLOVER_249_0.cloverRec.S[21381]++;for (i = 0; (((i < attributs.getLength()) && (++__CLOVER_249_0.cloverRec.CT[6494]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6494]==0&false)); i++) {{
			__CLOVER_249_0.cloverRec.S[21382]++;Node num\u00e9ro = attributs.item(i);
			__CLOVER_249_0.cloverRec.S[21383]++;String nomAttribut = num\u00e9ro.getNodeName();
			__CLOVER_249_0.cloverRec.S[21384]++;String valeurAttribut = num\u00e9ro.getNodeValue();
			//System.out.println(nomAttribut + " =\"" + valeurAttribut + "\"");
			__CLOVER_249_0.cloverRec.S[21385]++;if ((((nomAttribut == "valeur") && (++__CLOVER_249_0.cloverRec.CT[6495]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6495]==0&false)))
				{__CLOVER_249_0.cloverRec.S[21386]++;valeur = valeurAttribut;
			}else
				{assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6496]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6496]==0&false));
		}}
		}assert((((valeur != null)) && (++__CLOVER_249_0.cloverRec.CT[6497]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6497]==0&false));
		assert((((fils.getLength() == 0)) && (++__CLOVER_249_0.cloverRec.CT[6498]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6498]==0&false));
		/*assert(fils.getLength() == 1);
		Node n = fils.item(0);
		assert(n instanceof Text);
		String valeur = n.getNodeValue();*/

		__CLOVER_249_0.cloverRec.S[21387]++;return new Expr_Reel(valeur, null);
	}

	public Expr_Binaire creer_expression_binaire(Element element) {__CLOVER_249_0.cloverRec.M[1479]++;
		assert((((element != null)) && (++__CLOVER_249_0.cloverRec.CT[6499]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6499]==0&false));
		assert((((element.getNodeName() == "expression_binaire")) && (++__CLOVER_249_0.cloverRec.CT[6500]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6500]==0&false));

		__CLOVER_249_0.cloverRec.S[21388]++;NodeList fils = element.getChildNodes();
		__CLOVER_249_0.cloverRec.S[21389]++;Expr exp1 = null, exp2 = null;
		__CLOVER_249_0.cloverRec.S[21390]++;int i;
		__CLOVER_249_0.cloverRec.S[21391]++;for (i = 0; (((i < fils.getLength()) && (++__CLOVER_249_0.cloverRec.CT[6501]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6501]==0&false)); i++) {{
			__CLOVER_249_0.cloverRec.S[21392]++;Node n = fils.item(i);
			//System.out.println("element=" + n.getNodeName());
			__CLOVER_249_0.cloverRec.S[21393]++;if ((((n instanceof Element) && (++__CLOVER_249_0.cloverRec.CT[6502]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6502]==0&false))) {{
				__CLOVER_249_0.cloverRec.S[21394]++;if ((((n.getNodeName() == "expression") && (++__CLOVER_249_0.cloverRec.CT[6503]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6503]==0&false))) {{
					//System.out.println("expression");
					assert((((exp1 == null || exp2 == null)) && (++__CLOVER_249_0.cloverRec.CT[6504]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6504]==0&false));
					__CLOVER_249_0.cloverRec.S[21395]++;if ((((exp1 == null) && (++__CLOVER_249_0.cloverRec.CT[6505]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6505]==0&false)))
						{__CLOVER_249_0.cloverRec.S[21396]++;exp1 = creer_expression((Element) n);
					}else
						{__CLOVER_249_0.cloverRec.S[21397]++;exp2 = creer_expression((Element) n);
				}} }else {{
					assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6506]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6506]==0&false));
				}
			}} }else {__CLOVER_249_0.cloverRec.S[21398]++;if ((((n instanceof Text) && (++__CLOVER_249_0.cloverRec.CT[6507]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6507]==0&false))) {{
				__CLOVER_249_0.cloverRec.S[21399]++;String s = n.getNodeValue();
				assert((((s == "" || s.matches("[ \t\n]+"))) && (++__CLOVER_249_0.cloverRec.CT[6508]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6508]==0&false));
			} }else {{
				assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6509]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6509]==0&false));
			}
		}}}
		}assert((((exp1 != null)) && (++__CLOVER_249_0.cloverRec.CT[6510]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6510]==0&false));
		assert((((exp2 != null)) && (++__CLOVER_249_0.cloverRec.CT[6511]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6511]==0&false));
		__CLOVER_249_0.cloverRec.S[21400]++;NamedNodeMap attributs = element.getAttributes();
		__CLOVER_249_0.cloverRec.S[21401]++;String valeur = null,nom_free_op=null;
		__CLOVER_249_0.cloverRec.S[21402]++;for (i = 0; (((i < attributs.getLength()) && (++__CLOVER_249_0.cloverRec.CT[6512]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6512]==0&false)); i++) {{
			__CLOVER_249_0.cloverRec.S[21403]++;Node num\u00e9ro = attributs.item(i);
			__CLOVER_249_0.cloverRec.S[21404]++;String nomAttribut = num\u00e9ro.getNodeName();
			__CLOVER_249_0.cloverRec.S[21405]++;String valeurAttribut = num\u00e9ro.getNodeValue();
			//System.out.println(nomAttribut + " =\"" + valeurAttribut + "\"");
			__CLOVER_249_0.cloverRec.S[21406]++;if ((((nomAttribut == "op") && (++__CLOVER_249_0.cloverRec.CT[6513]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6513]==0&false)))
				{__CLOVER_249_0.cloverRec.S[21407]++;valeur = valeurAttribut;
			}else {__CLOVER_249_0.cloverRec.S[21408]++;if ((((nomAttribut == "nom") && (++__CLOVER_249_0.cloverRec.CT[6514]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6514]==0&false)))
				{__CLOVER_249_0.cloverRec.S[21409]++;nom_free_op = valeurAttribut;
			}else
				{assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6515]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6515]==0&false));
		}}}
		}assert((((valeur != null)) && (++__CLOVER_249_0.cloverRec.CT[6516]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6516]==0&false));

		__CLOVER_249_0.cloverRec.S[21410]++;Expr_Binaire res = null;
		__CLOVER_249_0.cloverRec.S[21411]++;if ((((valeur.equals("plus")) && (++__CLOVER_249_0.cloverRec.CT[6517]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6517]==0&false)))
			{__CLOVER_249_0.cloverRec.S[21412]++;res = new Expr_Binaire(Expr.Plus, exp1, exp2, new Token(-1,-1,"",""));
		}else {__CLOVER_249_0.cloverRec.S[21413]++;if ((((valeur.equals("moins")) && (++__CLOVER_249_0.cloverRec.CT[6518]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6518]==0&false)))
			{__CLOVER_249_0.cloverRec.S[21414]++;res = new Expr_Binaire(Expr.Moins, exp1, exp2, new Token(-1,-1,"",""));
		}else {__CLOVER_249_0.cloverRec.S[21415]++;if ((((valeur.equals("fois")) && (++__CLOVER_249_0.cloverRec.CT[6519]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6519]==0&false)))
			{__CLOVER_249_0.cloverRec.S[21416]++;res = new Expr_Binaire(Expr.Fois, exp1, exp2, new Token(-1,-1,"",""));
		}else {__CLOVER_249_0.cloverRec.S[21417]++;if ((((valeur.equals("div")) && (++__CLOVER_249_0.cloverRec.CT[6520]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6520]==0&false)))
			{__CLOVER_249_0.cloverRec.S[21418]++;res = new Expr_Binaire(Expr.Div, exp1, exp2, new Token(-1,-1,"",""));
		}else {__CLOVER_249_0.cloverRec.S[21419]++;if ((((valeur.equals("div_entier")) && (++__CLOVER_249_0.cloverRec.CT[6521]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6521]==0&false)))
			{__CLOVER_249_0.cloverRec.S[21420]++;res = new Expr_Binaire(Expr.Div_entier, exp1, exp2, new Token(-1,-1,"",""));
		}else {__CLOVER_249_0.cloverRec.S[21421]++;if ((((valeur.equals("mod")) && (++__CLOVER_249_0.cloverRec.CT[6522]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6522]==0&false)))
			{__CLOVER_249_0.cloverRec.S[21422]++;res = new Expr_Binaire(Expr.Mod, exp1, exp2, new Token(-1,-1,"",""));
		}else {__CLOVER_249_0.cloverRec.S[21423]++;if ((((valeur.equals("point")) && (++__CLOVER_249_0.cloverRec.CT[6523]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6523]==0&false)))
			{__CLOVER_249_0.cloverRec.S[21424]++;res = new Expr_Binaire(Expr.Point, exp1, exp2, new Token(-1,-1,"",""));
		}else {__CLOVER_249_0.cloverRec.S[21425]++;if ((((valeur.equals("puiss")) && (++__CLOVER_249_0.cloverRec.CT[6524]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6524]==0&false)))
			{__CLOVER_249_0.cloverRec.S[21426]++;res = new Expr_Binaire(Expr.Puiss, exp1, exp2, new Token(-1,-1,"",""));
		}else {__CLOVER_249_0.cloverRec.S[21427]++;if ((((valeur.equals("xor")) && (++__CLOVER_249_0.cloverRec.CT[6525]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6525]==0&false)))
			{__CLOVER_249_0.cloverRec.S[21428]++;res = new Expr_Binaire(Expr.Xor, exp1, exp2, new Token(-1,-1,"",""));
		}else {__CLOVER_249_0.cloverRec.S[21429]++;if ((((valeur.equals("or")) && (++__CLOVER_249_0.cloverRec.CT[6526]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6526]==0&false)))
			{__CLOVER_249_0.cloverRec.S[21430]++;res = new Expr_Binaire(Expr.Or, exp1, exp2, new Token(-1,-1,"",""));
		}else {__CLOVER_249_0.cloverRec.S[21431]++;if ((((valeur.equals("and")) && (++__CLOVER_249_0.cloverRec.CT[6527]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6527]==0&false)))
			{__CLOVER_249_0.cloverRec.S[21432]++;res = new Expr_Binaire(Expr.And, exp1, exp2, new Token(-1,-1,"",""));
		}else {__CLOVER_249_0.cloverRec.S[21433]++;if ((((valeur.equals("and_then")) && (++__CLOVER_249_0.cloverRec.CT[6528]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6528]==0&false)))
			{__CLOVER_249_0.cloverRec.S[21434]++;res = new Expr_Binaire(Expr.And_Then, exp1, exp2, new Token(-1,-1,"",""));
		}else {__CLOVER_249_0.cloverRec.S[21435]++;if ((((valeur.equals("or_else")) && (++__CLOVER_249_0.cloverRec.CT[6529]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6529]==0&false)))
			{__CLOVER_249_0.cloverRec.S[21436]++;res = new Expr_Binaire(Expr.Or_Else, exp1, exp2, new Token(-1,-1,"",""));
		}else {__CLOVER_249_0.cloverRec.S[21437]++;if ((((valeur.equals("implies")) && (++__CLOVER_249_0.cloverRec.CT[6530]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6530]==0&false)))
			{__CLOVER_249_0.cloverRec.S[21438]++;res = new Expr_Binaire(Expr.Implies, exp1, exp2, new Token(-1,-1,"",""));
		}else {__CLOVER_249_0.cloverRec.S[21439]++;if ((((valeur.equals("egal")) && (++__CLOVER_249_0.cloverRec.CT[6531]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6531]==0&false)))
			{__CLOVER_249_0.cloverRec.S[21440]++;res = new Expr_Binaire(Expr.Egal, exp1, exp2, new Token(-1,-1,"",""));
		}else {__CLOVER_249_0.cloverRec.S[21441]++;if ((((valeur.equals("diff")) && (++__CLOVER_249_0.cloverRec.CT[6532]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6532]==0&false)))
			{__CLOVER_249_0.cloverRec.S[21442]++;res = new Expr_Binaire(Expr.Diff, exp1, exp2, new Token(-1,-1,"",""));
		}else {__CLOVER_249_0.cloverRec.S[21443]++;if ((((valeur.equals("infs")) && (++__CLOVER_249_0.cloverRec.CT[6533]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6533]==0&false)))
			{__CLOVER_249_0.cloverRec.S[21444]++;res = new Expr_Binaire(Expr.Infs, exp1, exp2, new Token(-1,-1,"",""));
		}else {__CLOVER_249_0.cloverRec.S[21445]++;if ((((valeur.equals("inf")) && (++__CLOVER_249_0.cloverRec.CT[6534]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6534]==0&false)))
			{__CLOVER_249_0.cloverRec.S[21446]++;res = new Expr_Binaire(Expr.Inf, exp1, exp2, new Token(-1,-1,"",""));
		}else {__CLOVER_249_0.cloverRec.S[21447]++;if ((((valeur.equals("sup")) && (++__CLOVER_249_0.cloverRec.CT[6535]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6535]==0&false)))
			{__CLOVER_249_0.cloverRec.S[21448]++;res = new Expr_Binaire(Expr.Sup, exp1, exp2, new Token(-1,-1,"",""));
		}else {__CLOVER_249_0.cloverRec.S[21449]++;if ((((valeur.equals("sups")) && (++__CLOVER_249_0.cloverRec.CT[6536]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6536]==0&false)))
			{__CLOVER_249_0.cloverRec.S[21450]++;res = new Expr_Binaire(Expr.Sups, exp1, exp2, new Token(-1,-1,"",""));
		}else {__CLOVER_249_0.cloverRec.S[21451]++;if ((((valeur.equals("free_op")) && (++__CLOVER_249_0.cloverRec.CT[6537]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6537]==0&false)))
			{__CLOVER_249_0.cloverRec.S[21452]++;res = new Expr_Binaire(nom_free_op, exp1, exp2, new Token(-1,-1,"",""));
		}else
		{{
			assert((((valeur.equals("plus"))) && (++__CLOVER_249_0.cloverRec.CT[6538]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6538]==0&false)):"valeur="+valeur+";";
			assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6539]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6539]==0&false)):"valeur="+valeur+";";
		}

		}}}}}}}}}}}}}}}}}}}}}__CLOVER_249_0.cloverRec.S[21453]++;return res;
	}

	public Expr_Unaire creer_expression_unaire(Element element) {__CLOVER_249_0.cloverRec.M[1480]++;
		assert((((element != null)) && (++__CLOVER_249_0.cloverRec.CT[6540]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6540]==0&false));
		assert((((element.getNodeName() == "expression_unaire")) && (++__CLOVER_249_0.cloverRec.CT[6541]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6541]==0&false));

		__CLOVER_249_0.cloverRec.S[21454]++;NodeList fils = element.getChildNodes();
		__CLOVER_249_0.cloverRec.S[21455]++;Expr exp1 = null;
		__CLOVER_249_0.cloverRec.S[21456]++;int i;
		__CLOVER_249_0.cloverRec.S[21457]++;for (i = 0; (((i < fils.getLength()) && (++__CLOVER_249_0.cloverRec.CT[6542]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6542]==0&false)); i++) {{
			__CLOVER_249_0.cloverRec.S[21458]++;Node n = fils.item(i);
			//System.out.println("element=" + n.getNodeName());
			__CLOVER_249_0.cloverRec.S[21459]++;if ((((n instanceof Element) && (++__CLOVER_249_0.cloverRec.CT[6543]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6543]==0&false))) {{
				__CLOVER_249_0.cloverRec.S[21460]++;if ((((n.getNodeName() == "expression") && (++__CLOVER_249_0.cloverRec.CT[6544]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6544]==0&false))) {{
					//System.out.println("expression");
					assert((((exp1 == null)) && (++__CLOVER_249_0.cloverRec.CT[6545]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6545]==0&false));
					__CLOVER_249_0.cloverRec.S[21461]++;exp1 = creer_expression((Element) n);
				} }else {{
					assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6546]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6546]==0&false));
				}
			}} }else {__CLOVER_249_0.cloverRec.S[21462]++;if ((((n instanceof Text) && (++__CLOVER_249_0.cloverRec.CT[6547]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6547]==0&false))) {{
				__CLOVER_249_0.cloverRec.S[21463]++;String s = n.getNodeValue();
				assert((((s == "" || s.matches("[ \t\n]+"))) && (++__CLOVER_249_0.cloverRec.CT[6548]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6548]==0&false));
			} }else {{
				assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6549]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6549]==0&false));
			}
		}}}
		}assert((((exp1 != null)) && (++__CLOVER_249_0.cloverRec.CT[6550]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6550]==0&false));
		__CLOVER_249_0.cloverRec.S[21464]++;NamedNodeMap attributs = element.getAttributes();
		__CLOVER_249_0.cloverRec.S[21465]++;String valeur = null,nom_free_op=null;
		__CLOVER_249_0.cloverRec.S[21466]++;for (i = 0; (((i < attributs.getLength()) && (++__CLOVER_249_0.cloverRec.CT[6551]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6551]==0&false)); i++) {{
			__CLOVER_249_0.cloverRec.S[21467]++;Node num\u00e9ro = attributs.item(i);
			__CLOVER_249_0.cloverRec.S[21468]++;String nomAttribut = num\u00e9ro.getNodeName();
			__CLOVER_249_0.cloverRec.S[21469]++;String valeurAttribut = num\u00e9ro.getNodeValue();
			//System.out.println(nomAttribut + " =\"" + valeurAttribut + "\"");
			__CLOVER_249_0.cloverRec.S[21470]++;if ((((nomAttribut == "op") && (++__CLOVER_249_0.cloverRec.CT[6552]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6552]==0&false)))
				{__CLOVER_249_0.cloverRec.S[21471]++;valeur = valeurAttribut;
			}else {__CLOVER_249_0.cloverRec.S[21472]++;if ((((nomAttribut == "nom") && (++__CLOVER_249_0.cloverRec.CT[6553]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6553]==0&false)))
				{__CLOVER_249_0.cloverRec.S[21473]++;nom_free_op = valeurAttribut;
			}else
				{assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6554]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6554]==0&false));
		}}}
		}assert((((valeur != null)) && (++__CLOVER_249_0.cloverRec.CT[6555]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6555]==0&false));

		__CLOVER_249_0.cloverRec.S[21474]++;Expr_Unaire res = null;
		__CLOVER_249_0.cloverRec.S[21475]++;if ((((valeur.equals("plus")) && (++__CLOVER_249_0.cloverRec.CT[6556]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6556]==0&false)))
			{__CLOVER_249_0.cloverRec.S[21476]++;res = new Expr_Unaire(Expr.PlusU, exp1, new Token(-1,-1,"",""));
		}else {__CLOVER_249_0.cloverRec.S[21477]++;if ((((valeur.equals("moins")) && (++__CLOVER_249_0.cloverRec.CT[6557]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6557]==0&false)))
			{__CLOVER_249_0.cloverRec.S[21478]++;res = new Expr_Unaire(Expr.MoinsU, exp1, new Token(-1,-1,"",""));
		}else {__CLOVER_249_0.cloverRec.S[21479]++;if ((((valeur.equals("old")) && (++__CLOVER_249_0.cloverRec.CT[6558]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6558]==0&false)))
			{__CLOVER_249_0.cloverRec.S[21480]++;res = new Expr_Unaire(Expr.Old, exp1, new Token(-1,-1,"",""));
		}else {__CLOVER_249_0.cloverRec.S[21481]++;if ((((valeur.equals("not")) && (++__CLOVER_249_0.cloverRec.CT[6559]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6559]==0&false)))
			{__CLOVER_249_0.cloverRec.S[21482]++;res = new Expr_Unaire(Expr.Not, exp1, new Token(-1,-1,"",""));
		}else {__CLOVER_249_0.cloverRec.S[21483]++;if ((((valeur.equals("free_op")) && (++__CLOVER_249_0.cloverRec.CT[6560]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6560]==0&false)))
			{__CLOVER_249_0.cloverRec.S[21484]++;res = new Expr_Unaire(nom_free_op, exp1, new Token(-1,-1,"",""));
		}else {__CLOVER_249_0.cloverRec.S[21485]++;if ((((valeur.equals("addr")) && (++__CLOVER_249_0.cloverRec.CT[6561]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6561]==0&false)))
			{__CLOVER_249_0.cloverRec.S[21486]++;res = new Expr_Unaire(Expr.Dollard, exp1, new Token(-1,-1,"",""));
		}else
			{assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6562]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6562]==0&false)):"code inconnue:"+valeur;

		}}}}}}__CLOVER_249_0.cloverRec.S[21487]++;return res;
	}

	public Chaine creer_chaine(Element element) {__CLOVER_249_0.cloverRec.M[1481]++;
		assert((((element != null)) && (++__CLOVER_249_0.cloverRec.CT[6563]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6563]==0&false));
		assert((((element.getNodeName() == "chaine")) && (++__CLOVER_249_0.cloverRec.CT[6564]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6564]==0&false));

		__CLOVER_249_0.cloverRec.S[21488]++;NodeList fils = element.getChildNodes();
		__CLOVER_249_0.cloverRec.S[21489]++;int i;

		__CLOVER_249_0.cloverRec.S[21490]++;Vector v = new Vector();
		__CLOVER_249_0.cloverRec.S[21491]++;for (i = 0; (((i < fils.getLength()) && (++__CLOVER_249_0.cloverRec.CT[6565]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6565]==0&false)); i++) {{
			__CLOVER_249_0.cloverRec.S[21492]++;Node n = fils.item(i);
			//System.out.println("element=" + n.getNodeName());
			__CLOVER_249_0.cloverRec.S[21493]++;if((((n instanceof Element) && (++__CLOVER_249_0.cloverRec.CT[6566]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6566]==0&false)))
			{{
				__CLOVER_249_0.cloverRec.S[21494]++;if ((((n.getNodeName() == "chaine1") && (++__CLOVER_249_0.cloverRec.CT[6567]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6567]==0&false))) {{
					//System.out.println("chaine1");
					__CLOVER_249_0.cloverRec.S[21495]++;String s = creer_chaine1((Element) n);
					__CLOVER_249_0.cloverRec.S[21496]++;v.addElement(s);
				} }else {{
					assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6568]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6568]==0&false));
				}
			}}
			}else {__CLOVER_249_0.cloverRec.S[21497]++;if ((((n instanceof Text) && (++__CLOVER_249_0.cloverRec.CT[6569]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6569]==0&false))) {{
				__CLOVER_249_0.cloverRec.S[21498]++;String s = n.getNodeValue();
				assert((((s == "" || s.matches("[ \t\n]+"))) && (++__CLOVER_249_0.cloverRec.CT[6570]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6570]==0&false));
			} }else {{
				assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6571]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6571]==0&false));
			}
		}}}

		}__CLOVER_249_0.cloverRec.S[21499]++;return new Chaine(v, new Token(-1,-1,"",""));
	}

	public String creer_chaine1(Element element) {__CLOVER_249_0.cloverRec.M[1482]++;
		assert((((element != null)) && (++__CLOVER_249_0.cloverRec.CT[6572]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6572]==0&false));
		assert((((element.getNodeName() == "chaine1")) && (++__CLOVER_249_0.cloverRec.CT[6573]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6573]==0&false));

		__CLOVER_249_0.cloverRec.S[21500]++;NodeList fils = element.getChildNodes();
		__CLOVER_249_0.cloverRec.S[21501]++;int i;
		__CLOVER_249_0.cloverRec.S[21502]++;String text = null;

		__CLOVER_249_0.cloverRec.S[21503]++;for (i = 0; (((i < fils.getLength()) && (++__CLOVER_249_0.cloverRec.CT[6574]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6574]==0&false)); i++) {{
			__CLOVER_249_0.cloverRec.S[21504]++;Node n = fils.item(i);
			//System.out.println("element=" + n.getNodeName());
			__CLOVER_249_0.cloverRec.S[21505]++;if ((((n instanceof Text) && (++__CLOVER_249_0.cloverRec.CT[6575]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6575]==0&false))) {{
				assert((((text==null)) && (++__CLOVER_249_0.cloverRec.CT[6576]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6576]==0&false));
				__CLOVER_249_0.cloverRec.S[21506]++;text = n.getNodeValue();
			} }else {{
				assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6577]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6577]==0&false));
			}
		}}
		}assert((((text != null)) && (++__CLOVER_249_0.cloverRec.CT[6578]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6578]==0&false));

		__CLOVER_249_0.cloverRec.S[21507]++;return text;
	}

	public NomFeature creer_nom_feature(Element element) {__CLOVER_249_0.cloverRec.M[1483]++;
		assert((((element != null)) && (++__CLOVER_249_0.cloverRec.CT[6579]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6579]==0&false));
		assert((((element.getNodeName() == "nom_feature")) && (++__CLOVER_249_0.cloverRec.CT[6580]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6580]==0&false));

		__CLOVER_249_0.cloverRec.S[21508]++;NodeList fils = element.getChildNodes();
		__CLOVER_249_0.cloverRec.S[21509]++;NomFeature nom1 = null, nom2 = null;
		assert((((fils.getLength() == 0)) && (++__CLOVER_249_0.cloverRec.CT[6581]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6581]==0&false));
		__CLOVER_249_0.cloverRec.S[21510]++;int i;
		__CLOVER_249_0.cloverRec.S[21511]++;String nom = null, type = null;

		__CLOVER_249_0.cloverRec.S[21512]++;NamedNodeMap attributs = element.getAttributes();
		__CLOVER_249_0.cloverRec.S[21513]++;boolean frozen = false;
		__CLOVER_249_0.cloverRec.S[21514]++;for (i = 0; (((i < attributs.getLength()) && (++__CLOVER_249_0.cloverRec.CT[6582]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6582]==0&false)); i++) {{
			__CLOVER_249_0.cloverRec.S[21515]++;Node num\u00e9ro = attributs.item(i);
			__CLOVER_249_0.cloverRec.S[21516]++;String nomAttribut = num\u00e9ro.getNodeName();
			__CLOVER_249_0.cloverRec.S[21517]++;String valeurAttribut = num\u00e9ro.getNodeValue();
			//System.out.println(nomAttribut + " =\"" + valeurAttribut + "\"");
			__CLOVER_249_0.cloverRec.S[21518]++;if ((((nomAttribut == "type") && (++__CLOVER_249_0.cloverRec.CT[6583]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6583]==0&false)))
				{__CLOVER_249_0.cloverRec.S[21519]++;type = valeurAttribut;
			}else {__CLOVER_249_0.cloverRec.S[21520]++;if ((((nomAttribut == "frozen") && (++__CLOVER_249_0.cloverRec.CT[6584]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6584]==0&false)))
				{__CLOVER_249_0.cloverRec.S[21521]++;frozen = true;
			}else {__CLOVER_249_0.cloverRec.S[21522]++;if ((((nomAttribut == "nom") && (++__CLOVER_249_0.cloverRec.CT[6585]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6585]==0&false)))
				{__CLOVER_249_0.cloverRec.S[21523]++;nom = valeurAttribut;
			}else
				{assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6586]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6586]==0&false));
		}}}}
		}assert((((nom != null)) && (++__CLOVER_249_0.cloverRec.CT[6587]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6587]==0&false));

		__CLOVER_249_0.cloverRec.S[21524]++;NomFeature nomf = null;
		__CLOVER_249_0.cloverRec.S[21525]++;Vector v;
		__CLOVER_249_0.cloverRec.S[21526]++;if ((((type == null) && (++__CLOVER_249_0.cloverRec.CT[6588]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6588]==0&false)))
			{__CLOVER_249_0.cloverRec.S[21527]++;nomf = new NomFeature(nom);
		}else {__CLOVER_249_0.cloverRec.S[21528]++;if ((((type.equals("infix")) && (++__CLOVER_249_0.cloverRec.CT[6589]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6589]==0&false))) {{
			__CLOVER_249_0.cloverRec.S[21529]++;v = new Vector();
			__CLOVER_249_0.cloverRec.S[21530]++;v.addElement("\""+nom+"\"");
			__CLOVER_249_0.cloverRec.S[21531]++;nomf = new NomFeature(new Chaine(v, new Token(-1,-1,"","")));
			__CLOVER_249_0.cloverRec.S[21532]++;nomf.infix = true;
		} }else {__CLOVER_249_0.cloverRec.S[21533]++;if ((((type.equals("prefix")) && (++__CLOVER_249_0.cloverRec.CT[6590]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6590]==0&false))) {{
			__CLOVER_249_0.cloverRec.S[21534]++;v = new Vector();
			__CLOVER_249_0.cloverRec.S[21535]++;v.addElement("\""+nom+"\"");
			__CLOVER_249_0.cloverRec.S[21536]++;nomf = new NomFeature(new Chaine(v, new Token(-1,-1,"","")));
			__CLOVER_249_0.cloverRec.S[21537]++;nomf.prefix = true;
		} }else
			{assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6591]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6591]==0&false)):"type="+type;

		}}}__CLOVER_249_0.cloverRec.S[21538]++;nomf.frozen = frozen;

		__CLOVER_249_0.cloverRec.S[21539]++;return nomf;
	}

	public Type creer_nom_classe(Element element) {__CLOVER_249_0.cloverRec.M[1484]++;
		assert((((element != null)) && (++__CLOVER_249_0.cloverRec.CT[6592]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6592]==0&false));
		assert((((element.getNodeName() == "nom_classe")) && (++__CLOVER_249_0.cloverRec.CT[6593]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6593]==0&false));
		__CLOVER_249_0.cloverRec.S[21540]++;NamedNodeMap attributs = element.getAttributes();
		__CLOVER_249_0.cloverRec.S[21541]++;String nom = "";
		__CLOVER_249_0.cloverRec.S[21542]++;Type res = null;
		__CLOVER_249_0.cloverRec.S[21543]++;boolean expanded=true;

		//assert(attributs.getLength() <= 2);
		__CLOVER_249_0.cloverRec.S[21544]++;for(int i=0;(((i<attributs.getLength()) && (++__CLOVER_249_0.cloverRec.CT[6594]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6594]==0&false));i++)
		{{
			__CLOVER_249_0.cloverRec.S[21545]++;Node num\u00e9ro = attributs.item(i);
			__CLOVER_249_0.cloverRec.S[21546]++;String nomAttribut = num\u00e9ro.getNodeName();
			__CLOVER_249_0.cloverRec.S[21547]++;String valeurAttribut = num\u00e9ro.getNodeValue();
			//System.out.println(nomAttribut + " =\"" + valeurAttribut + "\"");
			__CLOVER_249_0.cloverRec.S[21548]++;if ((((nomAttribut == "nom") && (++__CLOVER_249_0.cloverRec.CT[6595]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6595]==0&false)))
				{__CLOVER_249_0.cloverRec.S[21549]++;nom = valeurAttribut;
			}else {__CLOVER_249_0.cloverRec.S[21550]++;if((((nomAttribut=="expanded") && (++__CLOVER_249_0.cloverRec.CT[6596]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6596]==0&false)))
				{__CLOVER_249_0.cloverRec.S[21551]++;expanded=true;
			}else
				{assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6597]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6597]==0&false));
		}}}
		
		//assert(nom!="");
		}__CLOVER_249_0.cloverRec.S[21552]++;NodeList fils = element.getChildNodes();
		__CLOVER_249_0.cloverRec.S[21553]++;if ((((fils.getLength() == 0) && (++__CLOVER_249_0.cloverRec.CT[6598]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6598]==0&false))) {{
			assert((((!nom.equals(""))) && (++__CLOVER_249_0.cloverRec.CT[6599]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6599]==0&false));
			__CLOVER_249_0.cloverRec.S[21554]++;res = new TypeSimple(expanded,nom, new Vector());
		} }else {__CLOVER_249_0.cloverRec.S[21555]++;if ((((nom==""/*&& fils.item(0).getNodeName() == "like"*/) && (++__CLOVER_249_0.cloverRec.CT[6600]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6600]==0&false))) {{
			__CLOVER_249_0.cloverRec.S[21556]++;int i;
			__CLOVER_249_0.cloverRec.S[21557]++;Expr exp=null;
			__CLOVER_249_0.cloverRec.S[21558]++;for (i = 0; (((i < fils.getLength()) && (++__CLOVER_249_0.cloverRec.CT[6601]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6601]==0&false)); i++) {{
				__CLOVER_249_0.cloverRec.S[21559]++;Node n = fils.item(i);
				//System.out.println("element=" + n.getNodeName());
				__CLOVER_249_0.cloverRec.S[21560]++;if ((((n instanceof Element) && (++__CLOVER_249_0.cloverRec.CT[6602]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6602]==0&false))) {{
					__CLOVER_249_0.cloverRec.S[21561]++;if ((((n.getNodeName() == "like") && (++__CLOVER_249_0.cloverRec.CT[6603]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6603]==0&false))) {{
						//System.out.println("like");
						__CLOVER_249_0.cloverRec.S[21562]++;NodeList fils2 = n.getChildNodes();
						__CLOVER_249_0.cloverRec.S[21563]++;int j;
						__CLOVER_249_0.cloverRec.S[21564]++;for (j = 0; (((j < fils2.getLength()) && (++__CLOVER_249_0.cloverRec.CT[6604]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6604]==0&false)); j++) {{
							__CLOVER_249_0.cloverRec.S[21565]++;Node n2=fils2.item(j);
							__CLOVER_249_0.cloverRec.S[21566]++;if((((n2 instanceof Element) && (++__CLOVER_249_0.cloverRec.CT[6605]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6605]==0&false)))
							{{
								__CLOVER_249_0.cloverRec.S[21567]++;if((((n2.getNodeName()=="expression") && (++__CLOVER_249_0.cloverRec.CT[6606]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6606]==0&false)))
								{{
									assert((((exp==null)) && (++__CLOVER_249_0.cloverRec.CT[6607]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6607]==0&false));
									__CLOVER_249_0.cloverRec.S[21568]++;exp = creer_expression((Element) n2);
								}
								}else
									{assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6608]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6608]==0&false));
							}}
							}else {__CLOVER_249_0.cloverRec.S[21569]++;if((((n2 instanceof Text) && (++__CLOVER_249_0.cloverRec.CT[6609]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6609]==0&false))) {{
								__CLOVER_249_0.cloverRec.S[21570]++;String s = n2.getNodeValue();
								assert((((s == "" || s.matches("[ \t\n]+"))) && (++__CLOVER_249_0.cloverRec.CT[6610]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6610]==0&false));
							} }else {{
								assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6611]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6611]==0&false));
							}
						}}}
					}} }else {__CLOVER_249_0.cloverRec.S[21571]++;if ((((n instanceof Text) && (++__CLOVER_249_0.cloverRec.CT[6612]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6612]==0&false))) {{
						__CLOVER_249_0.cloverRec.S[21572]++;String s = n.getNodeValue();
						assert((((s == "" || s.matches("[ \t\n]+"))) && (++__CLOVER_249_0.cloverRec.CT[6613]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6613]==0&false));
					} }else {{
						assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6614]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6614]==0&false));
					}
				}}}
			}}
			//Element elt = (Element) fils.item(0).getFirstChild();
			//Expr e = creer_expression(elt);
			}assert((((exp!=null)) && (++__CLOVER_249_0.cloverRec.CT[6615]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6615]==0&false));
			__CLOVER_249_0.cloverRec.S[21573]++;res = new TypeAncre(exp);
		} }else {{
			__CLOVER_249_0.cloverRec.S[21574]++;int i;
			assert((((!nom.equals(""))) && (++__CLOVER_249_0.cloverRec.CT[6616]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6616]==0&false));
			__CLOVER_249_0.cloverRec.S[21575]++;for (i = 0; (((i < fils.getLength()) && (++__CLOVER_249_0.cloverRec.CT[6617]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6617]==0&false)); i++) {{
				__CLOVER_249_0.cloverRec.S[21576]++;Node n = fils.item(i);
				//System.out.println("element=" + n.getNodeName());
				__CLOVER_249_0.cloverRec.S[21577]++;if ((((n instanceof Element) && (++__CLOVER_249_0.cloverRec.CT[6618]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6618]==0&false))) {{
					__CLOVER_249_0.cloverRec.S[21578]++;if ((((n.getNodeName() == "nom_classe") && (++__CLOVER_249_0.cloverRec.CT[6619]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6619]==0&false))) {{
						//System.out.println("nom_classe");
						//nom = creer_nom_classe( (Element) n);
						__CLOVER_249_0.cloverRec.S[21579]++;Vector v = new Vector();
						__CLOVER_249_0.cloverRec.S[21580]++;NodeList fils2 = n.getChildNodes();
						__CLOVER_249_0.cloverRec.S[21581]++;int j;
						__CLOVER_249_0.cloverRec.S[21582]++;for (j = 0; (((j < fils2.getLength()) && (++__CLOVER_249_0.cloverRec.CT[6620]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6620]==0&false)); j++) {{
							__CLOVER_249_0.cloverRec.S[21583]++;Node n2=fils2.item(j);
							__CLOVER_249_0.cloverRec.S[21584]++;if((((n2 instanceof Element) && (++__CLOVER_249_0.cloverRec.CT[6621]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6621]==0&false)))
							{{
								__CLOVER_249_0.cloverRec.S[21585]++;if((((n2.getNodeName()=="nom_classe") && (++__CLOVER_249_0.cloverRec.CT[6622]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6622]==0&false)))
								{{
									__CLOVER_249_0.cloverRec.S[21586]++;Type t = creer_nom_classe((Element) n2);
									__CLOVER_249_0.cloverRec.S[21587]++;v.addElement(t);
								}
								}else
									{assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6623]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6623]==0&false));
							}}
							}else {__CLOVER_249_0.cloverRec.S[21588]++;if((((n2 instanceof Text) && (++__CLOVER_249_0.cloverRec.CT[6624]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6624]==0&false))) {{
								__CLOVER_249_0.cloverRec.S[21589]++;String s = n2.getNodeValue();
								assert((((s == "" || s.matches("[ \t\n]+"))) && (++__CLOVER_249_0.cloverRec.CT[6625]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6625]==0&false));
							} }else {{
								assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6626]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6626]==0&false));
							}
						}}}
						}__CLOVER_249_0.cloverRec.S[21590]++;res = new TypeSimple(expanded,nom, v);
					} }else {{
						assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6627]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6627]==0&false));
					}
				}} }else {__CLOVER_249_0.cloverRec.S[21591]++;if ((((n instanceof Text) && (++__CLOVER_249_0.cloverRec.CT[6628]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6628]==0&false))) {{
					__CLOVER_249_0.cloverRec.S[21592]++;String s = n.getNodeValue();
					assert((((s == "" || s.matches("[ \t\n]+"))) && (++__CLOVER_249_0.cloverRec.CT[6629]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6629]==0&false));
				} }else {{
					assert((((false)) && (++__CLOVER_249_0.cloverRec.CT[6630]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6630]==0&false));
				}
			}}}
			}__CLOVER_249_0.cloverRec.S[21593]++;if((((res==null) && (++__CLOVER_249_0.cloverRec.CT[6631]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6631]==0&false)))
				{__CLOVER_249_0.cloverRec.S[21594]++;res=new TypeSimple(expanded,nom,new Vector());
		}}
		//res=new Type(nom,v);
		}}assert((((res != null)) && (++__CLOVER_249_0.cloverRec.CT[6632]!=0|true)) || (++__CLOVER_249_0.cloverRec.CF[6632]==0&false));

		__CLOVER_249_0.cloverRec.S[21595]++;return res;
	}

	/*public Expr creer_expression(Element element)
	{
	  return null;
	}*/
}