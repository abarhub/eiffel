/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ */package tinyeiffel.outils.compare_xml;

import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.FactoryConfigurationError;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;
//import org.apache.xerces.dom.*;

import org.w3c.dom.*;
//import ast.*;

//import org.w3c.dom.DOMImplementationRegistry;
/*import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.ls.DOMImplementationLS;
import org.w3c.dom.ls.DOMBuilder;*/

//import org.apache.xerces.parsers.DOMParser;

//import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
//import org.w3c.dom.*;

//import javax.xml.parsers.FactoryConfigurationError;
//import javax.xml.parsers.ParserConfigurationException;
//import javax.xml.parsers.DocumentBuilderFactory;
//import javax.xml.parsers.DocumentBuilder;

import java.util.*;


public class Compare_XML 
{static class __CLOVER_248_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}
	public static void main(String[] args) 
	{__CLOVER_248_0.cloverRec.M[1421]++;
		__CLOVER_248_0.cloverRec.S[20290]++;System.out.println("Hello World!");
		__CLOVER_248_0.cloverRec.S[20291]++;Compare_XML c;
		__CLOVER_248_0.cloverRec.S[20292]++;String nom1="test_unitaire\\test_class1.xml";
		__CLOVER_248_0.cloverRec.S[20293]++;String nom2="test\\test0.xml";
		__CLOVER_248_0.cloverRec.S[20294]++;c=new Compare_XML(nom1,nom2);
		__CLOVER_248_0.cloverRec.S[20295]++;if((((c.parse()) && (++__CLOVER_248_0.cloverRec.CT[5867]!=0|true)) || (++__CLOVER_248_0.cloverRec.CF[5867]==0&false)))
		{{
			__CLOVER_248_0.cloverRec.S[20296]++;System.out.println(nom1+"="+nom2);
		}
		}else
		{{
			__CLOVER_248_0.cloverRec.S[20297]++;System.out.println(nom1+"!="+nom2);
		}
		}__CLOVER_248_0.cloverRec.S[20298]++;System.out.println("Fin");
	}

	public String erreur()
	{__CLOVER_248_0.cloverRec.M[1422]++;
		__CLOVER_248_0.cloverRec.S[20299]++;return msgErreur;
	}

	private String msgErreur;

	public boolean parse()
	{__CLOVER_248_0.cloverRec.M[1423]++;
		//String xmlFile = "test_unitaire\\test_class1.xml";
		//if(nom_fichier!="")
		//	xmlFile=nom_fichier;
		//"file:///xerces-2_5_0/data/personal.xml";
		__CLOVER_248_0.cloverRec.S[20300]++;try {
			/* jasp */
			//R\u00e9cup\u00e8re une instance de la classe de fabrication
			__CLOVER_248_0.cloverRec.S[20301]++;DocumentBuilderFactory factory =
				DocumentBuilderFactory.newInstance();
			//R\u00e9cup\u00e9re une instance de la classe DocumentBuilder (sp\u00e9cifique vendeur)
			__CLOVER_248_0.cloverRec.S[20302]++;DocumentBuilder parser = factory.newDocumentBuilder();
			//effectue le parsing avec r\u00e9cup\u00e9ration du noeud DOM Document
			__CLOVER_248_0.cloverRec.S[20303]++;Document document = parser.parse(nom1);
			__CLOVER_248_0.cloverRec.S[20304]++;Document document2 = parser.parse(nom2);

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

			__CLOVER_248_0.cloverRec.S[20305]++;Element catalogue1=document.getDocumentElement();
			__CLOVER_248_0.cloverRec.S[20306]++;Element catalogue2=document2.getDocumentElement();

			__CLOVER_248_0.cloverRec.S[20307]++;msgErreur="Difference Inconnue";
			__CLOVER_248_0.cloverRec.S[20308]++;if((((compare(catalogue1,catalogue2)) && (++__CLOVER_248_0.cloverRec.CT[5868]!=0|true)) || (++__CLOVER_248_0.cloverRec.CF[5868]==0&false)))
			{{
				__CLOVER_248_0.cloverRec.S[20309]++;msgErreur="Pas de difference";
				__CLOVER_248_0.cloverRec.S[20310]++;return true;
			}
			}else
			{{
				__CLOVER_248_0.cloverRec.S[20311]++;return false;
			}			
			/*NodeList titres = catalogue.getElementsByTagName("class");
			System.out.println(
				"Nombre d'element dans la racine : " + titres.getLength());
			System.out.println("nom=" + catalogue.getNodeName());
			System.out.println("nom=" + catalogue.getFirstChild());
			System.out.println(
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
			System.out.println(
				"nom=" + catalogue.getFirstChild().getNodeType());
			//System.out.println("nom2="+titres.item(0).getFirstChild().getNodeValue());
			/*for (int i=0; i<titres.getLength(); i++) {
			 System.out.println(titres.item(i).getFirstChild().getNodeValue());
			}*/
			/*titres = catalogue.getElementsByTagName("nom_classe");
			System.out.println(
				"Nombre d'element dans la racine : " + titres.getLength());*/
			//Classe c = creer_classe(catalogue);
			//System.out.println("classe=" + c.toString());
			//return c;
		}} catch (FactoryConfigurationError e) {
			// unable to get a document builder factory
			__CLOVER_248_0.cloverRec.S[20312]++;e.printStackTrace();
			__CLOVER_248_0.cloverRec.S[20313]++;System.err.println("Erreur de configuration du factory");
			__CLOVER_248_0.cloverRec.S[20314]++;System.exit(1);
		} catch (ParserConfigurationException e) {
			// parser was unable to be configured
			__CLOVER_248_0.cloverRec.S[20315]++;e.printStackTrace();
			__CLOVER_248_0.cloverRec.S[20316]++;System.err.println("Erreur de configuration du parser");
			__CLOVER_248_0.cloverRec.S[20317]++;System.exit(1);
		} catch (SAXException e) {
			// parsing error
			__CLOVER_248_0.cloverRec.S[20318]++;e.printStackTrace();
			__CLOVER_248_0.cloverRec.S[20319]++;System.err.println("Exception Sax");
			__CLOVER_248_0.cloverRec.S[20320]++;System.exit(1);
		} catch (IOException e) {
			// i/o error
			__CLOVER_248_0.cloverRec.S[20321]++;e.printStackTrace();
			__CLOVER_248_0.cloverRec.S[20322]++;System.err.println("Erreur d'entree sortie");
			__CLOVER_248_0.cloverRec.S[20323]++;System.exit(1);
		}
		__CLOVER_248_0.cloverRec.S[20324]++;return false;
	}
	
	public int avance(Element element,int i)
	{__CLOVER_248_0.cloverRec.M[1424]++;
		assert((((element!=null)) && (++__CLOVER_248_0.cloverRec.CT[5869]!=0|true)) || (++__CLOVER_248_0.cloverRec.CF[5869]==0&false));
		assert((((i>=0)) && (++__CLOVER_248_0.cloverRec.CT[5870]!=0|true)) || (++__CLOVER_248_0.cloverRec.CF[5870]==0&false));
		__CLOVER_248_0.cloverRec.S[20325]++;int res=-1;
		__CLOVER_248_0.cloverRec.S[20326]++;NodeList fils = element.getChildNodes();
		__CLOVER_248_0.cloverRec.S[20327]++;if((((i>=fils.getLength()) && (++__CLOVER_248_0.cloverRec.CT[5871]!=0|true)) || (++__CLOVER_248_0.cloverRec.CF[5871]==0&false)))
		{{
			__CLOVER_248_0.cloverRec.S[20328]++;return i;
		}
		}__CLOVER_248_0.cloverRec.S[20329]++;while((((i<fils.getLength()) && (++__CLOVER_248_0.cloverRec.CT[5872]!=0|true)) || (++__CLOVER_248_0.cloverRec.CF[5872]==0&false)))
		{{
			__CLOVER_248_0.cloverRec.S[20330]++;Node n = fils.item(i);
			__CLOVER_248_0.cloverRec.S[20331]++;if ((((n instanceof Text) && (++__CLOVER_248_0.cloverRec.CT[5873]!=0|true)) || (++__CLOVER_248_0.cloverRec.CF[5873]==0&false))) {{
				__CLOVER_248_0.cloverRec.S[20332]++;String s = n.getNodeValue();
				assert((((s == "" || s.matches("[ \t\n]+"))) && (++__CLOVER_248_0.cloverRec.CT[5874]!=0|true)) || (++__CLOVER_248_0.cloverRec.CF[5874]==0&false));
			} }else {{
				__CLOVER_248_0.cloverRec.S[20333]++;res=i;
				__CLOVER_248_0.cloverRec.S[20334]++;break;
			}
			}__CLOVER_248_0.cloverRec.S[20335]++;i++;
		}
		}__CLOVER_248_0.cloverRec.S[20336]++;if((((res==-1) && (++__CLOVER_248_0.cloverRec.CT[5875]!=0|true)) || (++__CLOVER_248_0.cloverRec.CF[5875]==0&false)))
			{__CLOVER_248_0.cloverRec.S[20337]++;return i;
		}assert((((res>=i)) && (++__CLOVER_248_0.cloverRec.CT[5876]!=0|true)) || (++__CLOVER_248_0.cloverRec.CF[5876]==0&false));
		__CLOVER_248_0.cloverRec.S[20338]++;return res;
	}

	public Compare_XML(String nom1,String nom2)
	{__CLOVER_248_0.cloverRec.M[1425]++;
		__CLOVER_248_0.cloverRec.S[20339]++;this.nom1=nom1;
		__CLOVER_248_0.cloverRec.S[20340]++;this.nom2=nom2;
		__CLOVER_248_0.cloverRec.S[20341]++;ligne1=-1;__CLOVER_248_0.cloverRec.S[20342]++;colonne1=-1;
		__CLOVER_248_0.cloverRec.S[20343]++;ligne2=-1;__CLOVER_248_0.cloverRec.S[20344]++;colonne2=-1;
	}

	public void setError(Element element,Element element2)
	{__CLOVER_248_0.cloverRec.M[1426]++;
		assert((((element!=null)) && (++__CLOVER_248_0.cloverRec.CT[5877]!=0|true)) || (++__CLOVER_248_0.cloverRec.CF[5877]==0&false));
		assert((((element2!=null)) && (++__CLOVER_248_0.cloverRec.CT[5878]!=0|true)) || (++__CLOVER_248_0.cloverRec.CF[5878]==0&false));
		//ligne1=
	}

	public String nom1,nom2;
	public int ligne1=-1,colonne1=-1;
	public int ligne2=-1,colonne2=-1;

	public String diff(Element element,Element element2)
	{__CLOVER_248_0.cloverRec.M[1427]++;
		assert((((element!=null)) && (++__CLOVER_248_0.cloverRec.CT[5879]!=0|true)) || (++__CLOVER_248_0.cloverRec.CF[5879]==0&false));
		assert((((element2!=null)) && (++__CLOVER_248_0.cloverRec.CT[5880]!=0|true)) || (++__CLOVER_248_0.cloverRec.CF[5880]==0&false));
		__CLOVER_248_0.cloverRec.S[20345]++;return element.getNodeName()+" et "+
						element2.getNodeName();
	}

	public String diff(Element element)
	{__CLOVER_248_0.cloverRec.M[1428]++;
		assert((((element!=null)) && (++__CLOVER_248_0.cloverRec.CT[5881]!=0|true)) || (++__CLOVER_248_0.cloverRec.CF[5881]==0&false));// DeferredElementImpl
		//DeferredElementImpl d=(DeferredElementImpl)element;
		//d.
		__CLOVER_248_0.cloverRec.S[20346]++;return element.getNodeName();
	}


	public boolean compare(Element element,Element element2) {__CLOVER_248_0.cloverRec.M[1429]++;
		assert((((element != null)) && (++__CLOVER_248_0.cloverRec.CT[5882]!=0|true)) || (++__CLOVER_248_0.cloverRec.CF[5882]==0&false));
		assert((((element2!=null)) && (++__CLOVER_248_0.cloverRec.CT[5883]!=0|true)) || (++__CLOVER_248_0.cloverRec.CF[5883]==0&false));
		//assert(element.getNodeName() == "expression_unaire");

		__CLOVER_248_0.cloverRec.S[20347]++;if((((!element.getNodeName().equals(element2.getNodeName())) && (++__CLOVER_248_0.cloverRec.CT[5884]!=0|true)) || (++__CLOVER_248_0.cloverRec.CF[5884]==0&false)))
		{{
			__CLOVER_248_0.cloverRec.S[20348]++;setError(element,element2);
			__CLOVER_248_0.cloverRec.S[20349]++;msgErreur="Difference entre les nodes "+
				diff(element,element2);
			__CLOVER_248_0.cloverRec.S[20350]++;return false;
		}
		}__CLOVER_248_0.cloverRec.S[20351]++;NodeList fils = element.getChildNodes();
		__CLOVER_248_0.cloverRec.S[20352]++;NodeList fils2 = element2.getChildNodes();
		__CLOVER_248_0.cloverRec.S[20353]++;if((((fils.getLength()==0) && (++__CLOVER_248_0.cloverRec.CT[5885]!=0|true)) || (++__CLOVER_248_0.cloverRec.CF[5885]==0&false)))
		{{
			__CLOVER_248_0.cloverRec.S[20354]++;if((((fils2.getLength()>1) && (++__CLOVER_248_0.cloverRec.CT[5886]!=0|true)) || (++__CLOVER_248_0.cloverRec.CF[5886]==0&false)))
			{{
				__CLOVER_248_0.cloverRec.S[20355]++;setError(element,element2);
				__CLOVER_248_0.cloverRec.S[20356]++;msgErreur="Pas le meme nombre de fils pour "+
						diff(element,element2);
				__CLOVER_248_0.cloverRec.S[20357]++;return false;
			}
			}else {__CLOVER_248_0.cloverRec.S[20358]++;if((((fils2.getLength()==1) && (++__CLOVER_248_0.cloverRec.CT[5887]!=0|true)) || (++__CLOVER_248_0.cloverRec.CF[5887]==0&false)))
			{{
				__CLOVER_248_0.cloverRec.S[20359]++;if((((!(fils2.item(0) instanceof Text)) && (++__CLOVER_248_0.cloverRec.CT[5888]!=0|true)) || (++__CLOVER_248_0.cloverRec.CF[5888]==0&false)))
				{{
					__CLOVER_248_0.cloverRec.S[20360]++;setError(element,element2);
					__CLOVER_248_0.cloverRec.S[20361]++;msgErreur="Pas le meme nombre de fils pour "+
							diff(element,element2);
					__CLOVER_248_0.cloverRec.S[20362]++;return false;
				}
				}else
				{{
					__CLOVER_248_0.cloverRec.S[20363]++;String s=fils2.item(0).getNodeValue();
					__CLOVER_248_0.cloverRec.S[20364]++;if((((s == "" || s.matches("[ \t\n]+")) && (++__CLOVER_248_0.cloverRec.CT[5889]!=0|true)) || (++__CLOVER_248_0.cloverRec.CF[5889]==0&false)))
					{{
						__CLOVER_248_0.cloverRec.S[20365]++;setError(element,element2);
						__CLOVER_248_0.cloverRec.S[20366]++;msgErreur="Pas le meme nombre de fils pour "+
								diff(element,element2);
						__CLOVER_248_0.cloverRec.S[20367]++;return false;
					}
				}}
			}}
		}}}
		}else {__CLOVER_248_0.cloverRec.S[20368]++;if((((fils.getLength()==1&&fils.item(0) instanceof Text) && (++__CLOVER_248_0.cloverRec.CT[5890]!=0|true)) || (++__CLOVER_248_0.cloverRec.CF[5890]==0&false)))
		{{
			__CLOVER_248_0.cloverRec.S[20369]++;if((((fils2.getLength()>1) && (++__CLOVER_248_0.cloverRec.CT[5891]!=0|true)) || (++__CLOVER_248_0.cloverRec.CF[5891]==0&false)))
			{{
				__CLOVER_248_0.cloverRec.S[20370]++;setError(element,element2);
				__CLOVER_248_0.cloverRec.S[20371]++;msgErreur="Pas le meme nombre de fils pour "+
						diff(element,element2);
				__CLOVER_248_0.cloverRec.S[20372]++;return false;
			}
			}else {__CLOVER_248_0.cloverRec.S[20373]++;if((((fils2.getLength()==0) && (++__CLOVER_248_0.cloverRec.CT[5892]!=0|true)) || (++__CLOVER_248_0.cloverRec.CF[5892]==0&false)))
			{{
				__CLOVER_248_0.cloverRec.S[20374]++;String s=fils.item(0).getNodeValue();
				__CLOVER_248_0.cloverRec.S[20375]++;if((((s != "" && !s.matches("[ \t\n]+")) && (++__CLOVER_248_0.cloverRec.CT[5893]!=0|true)) || (++__CLOVER_248_0.cloverRec.CF[5893]==0&false)))
				{{
					__CLOVER_248_0.cloverRec.S[20376]++;setError(element,element2);
					__CLOVER_248_0.cloverRec.S[20377]++;msgErreur="Pas le meme nombre de fils pour "+
							diff(element,element2);
					__CLOVER_248_0.cloverRec.S[20378]++;return false;
				}
			}}
			}else
			{{
				__CLOVER_248_0.cloverRec.S[20379]++;if((((!(fils2.item(0) instanceof Text)) && (++__CLOVER_248_0.cloverRec.CT[5894]!=0|true)) || (++__CLOVER_248_0.cloverRec.CF[5894]==0&false)))
				{{
					__CLOVER_248_0.cloverRec.S[20380]++;setError(element,element2);
					__CLOVER_248_0.cloverRec.S[20381]++;msgErreur="L'element fils de "+diff(element2)+
						" n'est pas un text";
					__CLOVER_248_0.cloverRec.S[20382]++;return false;
				}
				}__CLOVER_248_0.cloverRec.S[20383]++;String s1,s2;
				__CLOVER_248_0.cloverRec.S[20384]++;s1=fils.item(0).getNodeValue();
				__CLOVER_248_0.cloverRec.S[20385]++;s2=fils2.item(0).getNodeValue();
				__CLOVER_248_0.cloverRec.S[20386]++;if((((!s1.equals(s2)) && (++__CLOVER_248_0.cloverRec.CT[5895]!=0|true)) || (++__CLOVER_248_0.cloverRec.CF[5895]==0&false)))
				{{
					__CLOVER_248_0.cloverRec.S[20387]++;if((((!((s1==""||s1.matches("[ \t\n]+"))&&
						(s2==""||s2.matches("[ \t\n]+")))) && (++__CLOVER_248_0.cloverRec.CT[5896]!=0|true)) || (++__CLOVER_248_0.cloverRec.CF[5896]==0&false)))
					{{
						__CLOVER_248_0.cloverRec.S[20388]++;setError(element,element2);
						__CLOVER_248_0.cloverRec.S[20389]++;msgErreur="Les textes ne sont pas les meme pour "+
							diff(element,element2)+"("+s1+"!="+s2+")";
						__CLOVER_248_0.cloverRec.S[20390]++;return false;
					}
				}}
			}}
		}}}
		}else
		{{
			__CLOVER_248_0.cloverRec.S[20391]++;int i=0,j=0,k;
			__CLOVER_248_0.cloverRec.S[20392]++;while((((i<fils.getLength()&&j<fils2.getLength()) && (++__CLOVER_248_0.cloverRec.CT[5897]!=0|true)) || (++__CLOVER_248_0.cloverRec.CF[5897]==0&false))) {{
				__CLOVER_248_0.cloverRec.S[20393]++;i=avance(element,i);
				__CLOVER_248_0.cloverRec.S[20394]++;j=avance(element2,j);
				__CLOVER_248_0.cloverRec.S[20395]++;Node n = fils.item(i);
				__CLOVER_248_0.cloverRec.S[20396]++;Node n2 = fils2.item(j);
				//System.out.println("element=" + n.getNodeName());
				__CLOVER_248_0.cloverRec.S[20397]++;if ((((n instanceof Element) && (++__CLOVER_248_0.cloverRec.CT[5898]!=0|true)) || (++__CLOVER_248_0.cloverRec.CF[5898]==0&false))) {{
					__CLOVER_248_0.cloverRec.S[20398]++;if((((!(n2 instanceof Element)) && (++__CLOVER_248_0.cloverRec.CT[5899]!=0|true)) || (++__CLOVER_248_0.cloverRec.CF[5899]==0&false)))
					{{
						__CLOVER_248_0.cloverRec.S[20399]++;setError(element,element2);
						__CLOVER_248_0.cloverRec.S[20400]++;msgErreur=diff(element2)+" n'est pas un element";
						__CLOVER_248_0.cloverRec.S[20401]++;return false;
					}
					}__CLOVER_248_0.cloverRec.S[20402]++;boolean r=compare((Element)n,(Element)n2);
					__CLOVER_248_0.cloverRec.S[20403]++;if((((!r) && (++__CLOVER_248_0.cloverRec.CT[5900]!=0|true)) || (++__CLOVER_248_0.cloverRec.CF[5900]==0&false)))
					{{
						//setError(element,element2);
						__CLOVER_248_0.cloverRec.S[20404]++;return false;
					}
				}} }else {{
					assert((((false)) && (++__CLOVER_248_0.cloverRec.CT[5901]!=0|true)) || (++__CLOVER_248_0.cloverRec.CF[5901]==0&false));
				}
				}__CLOVER_248_0.cloverRec.S[20405]++;i=avance(element,i+1);
				__CLOVER_248_0.cloverRec.S[20406]++;j=avance(element2,j+1);
			}
			}__CLOVER_248_0.cloverRec.S[20407]++;if((((i<fils.getLength()||j<fils2.getLength()) && (++__CLOVER_248_0.cloverRec.CT[5902]!=0|true)) || (++__CLOVER_248_0.cloverRec.CF[5902]==0&false)))
			{{
				__CLOVER_248_0.cloverRec.S[20408]++;setError(element,element2);
				__CLOVER_248_0.cloverRec.S[20409]++;msgErreur="Pas le meme nombre de fils pour "+
						diff(element,element2);
				__CLOVER_248_0.cloverRec.S[20410]++;return false;
			}
		}}
		}}__CLOVER_248_0.cloverRec.S[20411]++;int i;
		//assert(exp1 != null);
		__CLOVER_248_0.cloverRec.S[20412]++;NamedNodeMap attributs = element.getAttributes();
		__CLOVER_248_0.cloverRec.S[20413]++;HashMap table=new HashMap();
		//String valeur = null;
		__CLOVER_248_0.cloverRec.S[20414]++;for (i = 0; (((i < attributs.getLength()) && (++__CLOVER_248_0.cloverRec.CT[5903]!=0|true)) || (++__CLOVER_248_0.cloverRec.CF[5903]==0&false)); i++) {{
			__CLOVER_248_0.cloverRec.S[20415]++;Node num\u00e9ro = attributs.item(i);
			__CLOVER_248_0.cloverRec.S[20416]++;String nomAttribut = num\u00e9ro.getNodeName();
			__CLOVER_248_0.cloverRec.S[20417]++;String valeurAttribut = num\u00e9ro.getNodeValue();
			//System.out.println(nomAttribut + " =\"" + valeurAttribut + "\"");
			/*if (nomAttribut == "op")
				valeur = valeurAttribut;
			else
				assert(false);*/
			assert((((!table.containsKey(nomAttribut))) && (++__CLOVER_248_0.cloverRec.CT[5904]!=0|true)) || (++__CLOVER_248_0.cloverRec.CF[5904]==0&false));
			__CLOVER_248_0.cloverRec.S[20418]++;table.put(nomAttribut,valeurAttribut);
		}
		}__CLOVER_248_0.cloverRec.S[20419]++;int nb=i;
		__CLOVER_248_0.cloverRec.S[20420]++;NamedNodeMap attributs2 = element2.getAttributes();
		__CLOVER_248_0.cloverRec.S[20421]++;for (i = 0; (((i < attributs2.getLength()) && (++__CLOVER_248_0.cloverRec.CT[5905]!=0|true)) || (++__CLOVER_248_0.cloverRec.CF[5905]==0&false)); i++) {{
			__CLOVER_248_0.cloverRec.S[20422]++;Node num\u00e9ro = attributs2.item(i);
			__CLOVER_248_0.cloverRec.S[20423]++;String nomAttribut = num\u00e9ro.getNodeName();
			__CLOVER_248_0.cloverRec.S[20424]++;String valeurAttribut = num\u00e9ro.getNodeValue();
			//System.out.println(nomAttribut + " =\"" + valeurAttribut + "\"");
			/*if (nomAttribut == "op")
				valeur = valeurAttribut;
			else
				assert(false);*/
			__CLOVER_248_0.cloverRec.S[20425]++;if((((!table.containsKey(nomAttribut)) && (++__CLOVER_248_0.cloverRec.CT[5906]!=0|true)) || (++__CLOVER_248_0.cloverRec.CF[5906]==0&false)))
			{{
				__CLOVER_248_0.cloverRec.S[20426]++;setError(element,element2);
				__CLOVER_248_0.cloverRec.S[20427]++;msgErreur="La clef "+nomAttribut+" de "+diff(element)+
						" n'est pas dans "+diff(element2);
				__CLOVER_248_0.cloverRec.S[20428]++;return false;
			}
			}__CLOVER_248_0.cloverRec.S[20429]++;if((((!table.get(nomAttribut).equals(valeurAttribut)) && (++__CLOVER_248_0.cloverRec.CT[5907]!=0|true)) || (++__CLOVER_248_0.cloverRec.CF[5907]==0&false)))
			{{
				__CLOVER_248_0.cloverRec.S[20430]++;setError(element,element2);
				__CLOVER_248_0.cloverRec.S[20431]++;msgErreur="Pas le meme contenu pour la clef "+nomAttribut+" pour "+
						diff(element,element2)+" ("+
						table.get(nomAttribut)+"!="+valeurAttribut+")";
				__CLOVER_248_0.cloverRec.S[20432]++;return false;
			}
		}}
		}__CLOVER_248_0.cloverRec.S[20433]++;if((((i!=nb) && (++__CLOVER_248_0.cloverRec.CT[5908]!=0|true)) || (++__CLOVER_248_0.cloverRec.CF[5908]==0&false)))
		{{
			__CLOVER_248_0.cloverRec.S[20434]++;setError(element,element2);
			__CLOVER_248_0.cloverRec.S[20435]++;msgErreur="Pas le meme nombre de clef pour "+
					diff(element,element2)+"("+nb+"!="+i+")";
			__CLOVER_248_0.cloverRec.S[20436]++;return false;
		}
		//assert(valeur != null);

		}__CLOVER_248_0.cloverRec.S[20437]++;return true;
	}

/*	public Expr_Unaire creer_expression_unaire(Element element) {
		assert(element != null);
		assert(element.getNodeName() == "expression_unaire");

		NodeList fils = element.getChildNodes();
		Expr exp1 = null;
		int i;
		for (i = 0; i < fils.getLength(); i++) {
			Node n = fils.item(i);
			System.out.println("element=" + n.getNodeName());
			if (n instanceof Element) {
				if (n.getNodeName() == "expression") {
					System.out.println("expression");
					assert(exp1 == null);
					exp1 = creer_expression((Element) n);
				} else {
					assert(false);
				}
			} else if (n instanceof Text) {
				String s = n.getNodeValue();
				assert(s == "" || s.matches("[ \t\n]+"));
			} else {
				assert(false);
			}
		}
		assert(exp1 != null);
		NamedNodeMap attributs = element.getAttributes();
		String valeur = null;
		for (i = 0; i < attributs.getLength(); i++) {
			Node num\u00e9ro = attributs.item(i);
			String nomAttribut = num\u00e9ro.getNodeName();
			String valeurAttribut = num\u00e9ro.getNodeValue();
			//System.out.println(nomAttribut + " =\"" + valeurAttribut + "\"");
			if (nomAttribut == "op")
				valeur = valeurAttribut;
			else
				assert(false);
		}
		assert(valeur != null);

		Expr_Unaire res = null;
		if (valeur.equals("plus"))
			res = new Expr_Unaire(Expr.PlusU, exp1, new Token(-1,-1,"",""));
		else if (valeur.equals("moins"))
			res = new Expr_Unaire(Expr.MoinsU, exp1, new Token(-1,-1,"",""));
		else if (valeur.equals("old"))
			res = new Expr_Unaire(Expr.Old, exp1, new Token(-1,-1,"",""));
		else if (valeur.equals("not"))
			res = new Expr_Unaire(Expr.Not, exp1, new Token(-1,-1,"",""));
		else
			assert(false):"code inconnue:"+valeur;

		return res;
	}
*/
}
