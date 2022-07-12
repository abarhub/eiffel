/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ *//*
 * Created on 17 f\u00e9vr. 2004
 *
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
package tinyeiffel.test_unitaire;

import junit.framework.*;
import tinyeiffel.outils.compare_xml.*;
import java.io.*;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import tinyeiffel.compiler.*;
//import java.util.*;
import tinyeiffel.intermediaire.*;

import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.*;

/**
 * @author BARRET
 *
 * To change the template for this generated type comment go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
public class TestInterm extends TestCase {static class __CLOVER_258_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}

	protected Logger logger;
	protected FileHandler fh;
	
	protected void setUp()
	{__CLOVER_258_0.cloverRec.M[1525]++;
		__CLOVER_258_0.cloverRec.S[21847]++;logger=Logger.getLogger("tinyeiffel.test.testInterm");
		__CLOVER_258_0.cloverRec.S[21848]++;if((((fh==null) && (++__CLOVER_258_0.cloverRec.CT[6691]!=0|true)) || (++__CLOVER_258_0.cloverRec.CF[6691]==0&false)))
		{{
			__CLOVER_258_0.cloverRec.S[21849]++;try {
				__CLOVER_258_0.cloverRec.S[21850]++;fh = new FileHandler("test_interm.log",true);
				__CLOVER_258_0.cloverRec.S[21851]++;fh.setFormatter(new SimpleFormatter());
				__CLOVER_258_0.cloverRec.S[21852]++;logger.addHandler(fh);
			}
			catch(IOException e)
			{
				__CLOVER_258_0.cloverRec.S[21853]++;System.err.println(e);
				__CLOVER_258_0.cloverRec.S[21854]++;e.printStackTrace();
				assert((((false)) && (++__CLOVER_258_0.cloverRec.CT[6692]!=0|true)) || (++__CLOVER_258_0.cloverRec.CF[6692]==0&false));
			}
		}
		// Request that every detail gets logged.
		}__CLOVER_258_0.cloverRec.S[21855]++;logger.setLevel(Level.ALL);
        // Log a simple INFO message.
        __CLOVER_258_0.cloverRec.S[21856]++;logger.info("Demarrage du log");
	}

	protected void tearDown() throws Exception {__CLOVER_258_0.cloverRec.M[1526]++;
		__CLOVER_258_0.cloverRec.S[21857]++;super.tearDown();
		__CLOVER_258_0.cloverRec.S[21858]++;logger.info("Tests Finis");
		__CLOVER_258_0.cloverRec.S[21859]++;if((((fh!=null) && (++__CLOVER_258_0.cloverRec.CT[6693]!=0|true)) || (++__CLOVER_258_0.cloverRec.CF[6693]==0&false)))
		{{
			__CLOVER_258_0.cloverRec.S[21860]++;logger.removeHandler(fh);
			__CLOVER_258_0.cloverRec.S[21861]++;fh.close();
		}
	}}
	
	/**
	 * Constructor for TestInterm.
	 * @param arg0
	 */
	public TestInterm(String arg0) {
		super(arg0);__CLOVER_258_0.cloverRec.S[21862]++;__CLOVER_258_0.cloverRec.M[1527]++;
	}

	public void testAssert()
	{__CLOVER_258_0.cloverRec.M[1528]++;
		__CLOVER_258_0.cloverRec.S[21863]++;boolean trouve=false;
		assert((((trouve=true))));
		__CLOVER_258_0.cloverRec.S[21864]++;assertTrue(trouve);
		__CLOVER_258_0.cloverRec.S[21865]++;logger.info("Assertions activ\u00e9s");
	}
	
	public void testVerif()
	{__CLOVER_258_0.cloverRec.M[1529]++;
		__CLOVER_258_0.cloverRec.S[21866]++;Compare_XML c;
		__CLOVER_258_0.cloverRec.S[21867]++;Compiler_Eiffel comp;
		__CLOVER_258_0.cloverRec.S[21868]++;CIProgramme p,p2;
		__CLOVER_258_0.cloverRec.S[21869]++;CIInputXML inp;
		__CLOVER_258_0.cloverRec.S[21870]++;CIVerification verif;
		__CLOVER_258_0.cloverRec.S[21871]++;int i,nb=0;
		__CLOVER_258_0.cloverRec.S[21872]++;String tab[][],source,ref,src_xml;
		__CLOVER_258_0.cloverRec.S[21873]++;boolean res;
		__CLOVER_258_0.cloverRec.S[21874]++;logger.info("test verif");
		__CLOVER_258_0.cloverRec.S[21875]++;tab=parseXml("test\\interm\\test_all.xml");
		__CLOVER_258_0.cloverRec.S[21876]++;assertTrue(tab!=null);
		__CLOVER_258_0.cloverRec.S[21877]++;assertTrue(tab.length>0);
		__CLOVER_258_0.cloverRec.S[21878]++;for(i=0;(((i<tab.length) && (++__CLOVER_258_0.cloverRec.CT[6695]!=0|true)) || (++__CLOVER_258_0.cloverRec.CF[6695]==0&false));i++)
		{{
			__CLOVER_258_0.cloverRec.S[21879]++;source=tab[i][0];
			__CLOVER_258_0.cloverRec.S[21880]++;src_xml=tab[i][1];
			__CLOVER_258_0.cloverRec.S[21881]++;ref=tab[i][2];
			__CLOVER_258_0.cloverRec.S[21882]++;System.out.println("i="+i);
			__CLOVER_258_0.cloverRec.S[21883]++;inp=new CIInputXML(ref);
			__CLOVER_258_0.cloverRec.S[21884]++;p=inp.programme;
			__CLOVER_258_0.cloverRec.S[21885]++;verif=new CIVerification(p);
			__CLOVER_258_0.cloverRec.S[21886]++;res=verif.verification();
			__CLOVER_258_0.cloverRec.S[21887]++;if((((!res) && (++__CLOVER_258_0.cloverRec.CT[6696]!=0|true)) || (++__CLOVER_258_0.cloverRec.CF[6696]==0&false)))
			{{
				__CLOVER_258_0.cloverRec.S[21888]++;String s,tab2[];
				__CLOVER_258_0.cloverRec.S[21889]++;logger.severe("Il y a des erreur pour le fichier "+source);
				__CLOVER_258_0.cloverRec.S[21890]++;tab2=verif.message_erreur();
				__CLOVER_258_0.cloverRec.S[21891]++;s="";
				__CLOVER_258_0.cloverRec.S[21892]++;for(i=0;(((i<tab2.length) && (++__CLOVER_258_0.cloverRec.CT[6697]!=0|true)) || (++__CLOVER_258_0.cloverRec.CF[6697]==0&false));i++)
				{{
					__CLOVER_258_0.cloverRec.S[21893]++;if((((i>0) && (++__CLOVER_258_0.cloverRec.CT[6698]!=0|true)) || (++__CLOVER_258_0.cloverRec.CF[6698]==0&false)))
						{__CLOVER_258_0.cloverRec.S[21894]++;s+="\n";
					}__CLOVER_258_0.cloverRec.S[21895]++;s+=tab2[i];
				}
				}__CLOVER_258_0.cloverRec.S[21896]++;logger.severe("********\n"+s+"***************\n");
				__CLOVER_258_0.cloverRec.S[21897]++;assertTrue(s,res);
			}
			/*comp=new Compiler_Eiffel(source,Compiler_Eiffel.code_interm);
			if(comp.nb_erreur()!=0)
			{
				logger.severe("Il y a des erreur pour le fichier "+source);
				logger.severe(comp.logging.toString());
				assertTrue(comp.nb_erreur()==0);
			}
			c=new Compare_XML(src_xml,ref);
			if(!c.parse())
			{
				logger.severe("Erreur("+src_xml+"):"+c.erreur());
			}
			//assert(c.parse()):"Erreur("+src_xml+"):"+c.erreur();
			//assert(false);
			//&\u00e9"'_\u00e8('-((-
			p=comp.programme;
			assertTrue("Erreur("+src_xml+"):"+c.erreur(),p!=null);
			inp=new CIInputXML(src_xml);
			p2=inp.programme;
			System.out.println("Analyse 1 ...");
			p.check_egal(p);
			System.out.println("Analyse 2 ...");
			p2.check_egal(p2);
			System.out.println("Analyse 3 ...");
			p2.check_egal(p);
			System.out.println("Analyse 4 ...");
			p.check_egal(p2);*/
			}__CLOVER_258_0.cloverRec.S[21898]++;nb++;
		}
		}__CLOVER_258_0.cloverRec.S[21899]++;assertTrue(nb==tab.length);
		__CLOVER_258_0.cloverRec.S[21900]++;System.out.println("nb testes:"+nb);
		//assert(false);
		__CLOVER_258_0.cloverRec.S[21901]++;logger.info("test correcte Ok ("+nb+")");
	}
	
	public void testCorrect()
	{__CLOVER_258_0.cloverRec.M[1530]++;
		__CLOVER_258_0.cloverRec.S[21902]++;Compare_XML c;
		__CLOVER_258_0.cloverRec.S[21903]++;Compiler_Eiffel comp;
		__CLOVER_258_0.cloverRec.S[21904]++;CIProgramme p,p2;
		__CLOVER_258_0.cloverRec.S[21905]++;CIInputXML inp;
		__CLOVER_258_0.cloverRec.S[21906]++;int i,nb=0;
		__CLOVER_258_0.cloverRec.S[21907]++;String tab[][],source,ref,src_xml;
		__CLOVER_258_0.cloverRec.S[21908]++;logger.info("test correcte");
		__CLOVER_258_0.cloverRec.S[21909]++;tab=parseXml("test\\interm\\test_all.xml");
		__CLOVER_258_0.cloverRec.S[21910]++;assertTrue(tab!=null);
		__CLOVER_258_0.cloverRec.S[21911]++;assertTrue(tab.length>0);
		__CLOVER_258_0.cloverRec.S[21912]++;for(i=0;(((i<tab.length) && (++__CLOVER_258_0.cloverRec.CT[6699]!=0|true)) || (++__CLOVER_258_0.cloverRec.CF[6699]==0&false));i++)
		{{
			__CLOVER_258_0.cloverRec.S[21913]++;source=tab[i][0];
			__CLOVER_258_0.cloverRec.S[21914]++;src_xml=tab[i][1];
			__CLOVER_258_0.cloverRec.S[21915]++;ref=tab[i][2];
			__CLOVER_258_0.cloverRec.S[21916]++;comp=new Compiler_Eiffel(source,Compiler_Eiffel.code_interm);
			__CLOVER_258_0.cloverRec.S[21917]++;if((((comp.nb_erreur()!=0) && (++__CLOVER_258_0.cloverRec.CT[6700]!=0|true)) || (++__CLOVER_258_0.cloverRec.CF[6700]==0&false)))
			{{
				__CLOVER_258_0.cloverRec.S[21918]++;logger.severe("Il y a des erreur pour le fichier "+source);
				__CLOVER_258_0.cloverRec.S[21919]++;logger.severe(comp.logging.toString());
				__CLOVER_258_0.cloverRec.S[21920]++;assertTrue(comp.nb_erreur()==0);
			}
			}__CLOVER_258_0.cloverRec.S[21921]++;c=new Compare_XML(src_xml,ref);
			__CLOVER_258_0.cloverRec.S[21922]++;if((((!c.parse()) && (++__CLOVER_258_0.cloverRec.CT[6701]!=0|true)) || (++__CLOVER_258_0.cloverRec.CF[6701]==0&false)))
			{{
				__CLOVER_258_0.cloverRec.S[21923]++;logger.severe("Erreur("+src_xml+"):"+c.erreur());
			}
			//assert(c.parse()):"Erreur("+src_xml+"):"+c.erreur();
			//assert(false);
			//&\u00e9"'_\u00e8('-((-
			}__CLOVER_258_0.cloverRec.S[21924]++;p=comp.programme;
			__CLOVER_258_0.cloverRec.S[21925]++;assertTrue("Erreur("+src_xml+"):"+c.erreur(),p!=null);
			__CLOVER_258_0.cloverRec.S[21926]++;inp=new CIInputXML(src_xml);
			__CLOVER_258_0.cloverRec.S[21927]++;p2=inp.programme;
			__CLOVER_258_0.cloverRec.S[21928]++;System.out.println("Analyse 1 ...");
			__CLOVER_258_0.cloverRec.S[21929]++;p.check_egal(p);
			__CLOVER_258_0.cloverRec.S[21930]++;System.out.println("Analyse 2 ...");
			__CLOVER_258_0.cloverRec.S[21931]++;p2.check_egal(p2);
			__CLOVER_258_0.cloverRec.S[21932]++;System.out.println("Analyse 3 ...");
			__CLOVER_258_0.cloverRec.S[21933]++;p2.check_egal(p);
			__CLOVER_258_0.cloverRec.S[21934]++;System.out.println("Analyse 4 ...");
			__CLOVER_258_0.cloverRec.S[21935]++;p.check_egal(p2);
			__CLOVER_258_0.cloverRec.S[21936]++;nb++;
		}
		}__CLOVER_258_0.cloverRec.S[21937]++;assertTrue(nb==tab.length);
		__CLOVER_258_0.cloverRec.S[21938]++;System.out.println("nb testes:"+nb);
		//assert(false);
		__CLOVER_258_0.cloverRec.S[21939]++;logger.info("test correcte Ok ("+nb+")");
	}
	
	public String[][] parseXml(String nom)
	{__CLOVER_258_0.cloverRec.M[1531]++;
		__CLOVER_258_0.cloverRec.S[21940]++;String res[][]=null;
		__CLOVER_258_0.cloverRec.S[21941]++;File f;
		__CLOVER_258_0.cloverRec.S[21942]++;int no;
		assert((((nom!=null)) && (++__CLOVER_258_0.cloverRec.CT[6702]!=0|true)) || (++__CLOVER_258_0.cloverRec.CF[6702]==0&false));
		__CLOVER_258_0.cloverRec.S[21943]++;try {
			/* jasp */
			//R\u00e9cup\u00e8re une instance de la classe de fabrication
			__CLOVER_258_0.cloverRec.S[21944]++;DocumentBuilderFactory factory =
				DocumentBuilderFactory.newInstance();
			//R\u00e9cup\u00e9re une instance de la classe DocumentBuilder (sp\u00e9cifique vendeur)
			__CLOVER_258_0.cloverRec.S[21945]++;DocumentBuilder parser = factory.newDocumentBuilder();
			//effectue le parsing avec r\u00e9cup\u00e9ration du noeud DOM Document
			__CLOVER_258_0.cloverRec.S[21946]++;Document document = parser.parse(nom);

			__CLOVER_258_0.cloverRec.S[21947]++;Element catalogue = document.getDocumentElement();

			__CLOVER_258_0.cloverRec.S[21948]++;NodeList titres = catalogue.getElementsByTagName("test");
			__CLOVER_258_0.cloverRec.S[21949]++;System.out.println(
				"Nombre d'element dans la racine : " + titres.getLength());
			__CLOVER_258_0.cloverRec.S[21950]++;System.out.println("nom=" + catalogue.getNodeName());
			__CLOVER_258_0.cloverRec.S[21951]++;System.out.println("nom=" + catalogue.getFirstChild());
			__CLOVER_258_0.cloverRec.S[21952]++;System.out.println(
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
			__CLOVER_258_0.cloverRec.S[21953]++;res=new String[titres.getLength()][];
			__CLOVER_258_0.cloverRec.S[21954]++;NodeList fils = catalogue.getChildNodes();//titres/*.getChildNodes()*/;
			assert((((fils.getLength()>0)) && (++__CLOVER_258_0.cloverRec.CT[6703]!=0|true)) || (++__CLOVER_258_0.cloverRec.CF[6703]==0&false));
			__CLOVER_258_0.cloverRec.S[21955]++;no=0;
			__CLOVER_258_0.cloverRec.S[21956]++;for(int i=0;(((i<fils.getLength()) && (++__CLOVER_258_0.cloverRec.CT[6704]!=0|true)) || (++__CLOVER_258_0.cloverRec.CF[6704]==0&false));i++)
			{{
				__CLOVER_258_0.cloverRec.S[21957]++;Node n = fils.item(i);
				//System.out.println("element=" + n.getNodeName());
				__CLOVER_258_0.cloverRec.S[21958]++;if ((((n instanceof Element) && (++__CLOVER_258_0.cloverRec.CT[6705]!=0|true)) || (++__CLOVER_258_0.cloverRec.CF[6705]==0&false))) {{
					__CLOVER_258_0.cloverRec.S[21959]++;if ((((n.getNodeName() == "test") && (++__CLOVER_258_0.cloverRec.CT[6706]!=0|true)) || (++__CLOVER_258_0.cloverRec.CF[6706]==0&false))) {{
						//System.out.println("heritage");
						__CLOVER_258_0.cloverRec.S[21960]++;res[no] = creer_test_elt((Element) n);
						__CLOVER_258_0.cloverRec.S[21961]++;f=new File(res[no][0]);
						__CLOVER_258_0.cloverRec.S[21962]++;res[no][1]=f.getParent()+"\\resultat.xml";
						__CLOVER_258_0.cloverRec.S[21963]++;no++;
					}
					}else
						{assert((((false)) && (++__CLOVER_258_0.cloverRec.CT[6707]!=0|true)) || (++__CLOVER_258_0.cloverRec.CF[6707]==0&false));
				}}
				}else {__CLOVER_258_0.cloverRec.S[21964]++;if ((((n instanceof Text) && (++__CLOVER_258_0.cloverRec.CT[6708]!=0|true)) || (++__CLOVER_258_0.cloverRec.CF[6708]==0&false))) {{
					__CLOVER_258_0.cloverRec.S[21965]++;String s = n.getNodeValue();
					assert((((s == "" || s.matches("[ \t\n]+"))) && (++__CLOVER_258_0.cloverRec.CT[6709]!=0|true)) || (++__CLOVER_258_0.cloverRec.CF[6709]==0&false));
				}
				}else {__CLOVER_258_0.cloverRec.S[21966]++;if ((((n instanceof Comment) && (++__CLOVER_258_0.cloverRec.CT[6710]!=0|true)) || (++__CLOVER_258_0.cloverRec.CF[6710]==0&false))) {{
					//String s = n.getNodeValue();
					//assert(s == "" || s.matches("[ \t\n]+"));
				}
				}else
					{assert((((false)) && (++__CLOVER_258_0.cloverRec.CT[6711]!=0|true)) || (++__CLOVER_258_0.cloverRec.CF[6711]==0&false));
			}}}}
			}__CLOVER_258_0.cloverRec.S[21967]++;return res;
		} catch (FactoryConfigurationError e) {
			// unable to get a document builder factory
			__CLOVER_258_0.cloverRec.S[21968]++;e.printStackTrace();
			__CLOVER_258_0.cloverRec.S[21969]++;System.err.println("Erreur de configuration du factory");
			__CLOVER_258_0.cloverRec.S[21970]++;System.exit(1);
		} catch (ParserConfigurationException e) {
			// parser was unable to be configured
			__CLOVER_258_0.cloverRec.S[21971]++;e.printStackTrace();
			__CLOVER_258_0.cloverRec.S[21972]++;System.err.println("Erreur de configuration du parser");
			__CLOVER_258_0.cloverRec.S[21973]++;System.exit(1);
		} catch (SAXException e) {
			// parsing error
			__CLOVER_258_0.cloverRec.S[21974]++;e.printStackTrace();
			__CLOVER_258_0.cloverRec.S[21975]++;System.err.println("Exception Sax");
			__CLOVER_258_0.cloverRec.S[21976]++;System.exit(1);
		} catch (IOException e) {
			// i/o error
			__CLOVER_258_0.cloverRec.S[21977]++;e.printStackTrace();
			__CLOVER_258_0.cloverRec.S[21978]++;System.err.println("Erreur d'entree sortie");
			__CLOVER_258_0.cloverRec.S[21979]++;System.exit(1);
		}
		/*res=new String[1][3];
		res[0][0]="test\\interm\\test1\\test1.ace";
		//res[0][1]="test\\interm\\test1\\resultat.xml";
		res[0][2]="test\\interm\\test1\\valide.xml";
		f=new File(res[0][0]);
		res[0][1]=f.getParent()+"\\resultat.xml";*/
		__CLOVER_258_0.cloverRec.S[21980]++;return res;
	}

	public String[] creer_test_elt(Element element)
	{__CLOVER_258_0.cloverRec.M[1532]++;
		assert((((element != null)) && (++__CLOVER_258_0.cloverRec.CT[6712]!=0|true)) || (++__CLOVER_258_0.cloverRec.CF[6712]==0&false));
		assert((((element.getNodeName() == "test")) && (++__CLOVER_258_0.cloverRec.CT[6713]!=0|true)) || (++__CLOVER_258_0.cloverRec.CF[6713]==0&false));
		__CLOVER_258_0.cloverRec.S[21981]++;NamedNodeMap attributs = element.getAttributes();
		__CLOVER_258_0.cloverRec.S[21982]++;String source="",ref="",src_xml="",res[];
		
		__CLOVER_258_0.cloverRec.S[21983]++;for (int i = 0; (((i < attributs.getLength()) && (++__CLOVER_258_0.cloverRec.CT[6714]!=0|true)) || (++__CLOVER_258_0.cloverRec.CF[6714]==0&false)); i++) {{
			__CLOVER_258_0.cloverRec.S[21984]++;Node num\u00e9ro = attributs.item(i);
			__CLOVER_258_0.cloverRec.S[21985]++;String nomAttribut = num\u00e9ro.getNodeName();
			__CLOVER_258_0.cloverRec.S[21986]++;String valeurAttribut = num\u00e9ro.getNodeValue();
			__CLOVER_258_0.cloverRec.S[21987]++;System.out.println(nomAttribut + " =\"" + valeurAttribut + "\"");
			__CLOVER_258_0.cloverRec.S[21988]++;if ((((nomAttribut == "source") && (++__CLOVER_258_0.cloverRec.CT[6715]!=0|true)) || (++__CLOVER_258_0.cloverRec.CF[6715]==0&false)))
				{__CLOVER_258_0.cloverRec.S[21989]++;source = valeurAttribut;
			}else {__CLOVER_258_0.cloverRec.S[21990]++;if ((((nomAttribut == "source") && (++__CLOVER_258_0.cloverRec.CT[6716]!=0|true)) || (++__CLOVER_258_0.cloverRec.CF[6716]==0&false)))
				{__CLOVER_258_0.cloverRec.S[21991]++;src_xml = valeurAttribut;
			}else {__CLOVER_258_0.cloverRec.S[21992]++;if ((((nomAttribut == "reference") && (++__CLOVER_258_0.cloverRec.CT[6717]!=0|true)) || (++__CLOVER_258_0.cloverRec.CF[6717]==0&false)))
				{__CLOVER_258_0.cloverRec.S[21993]++;ref = valeurAttribut;
			}else
				{assert((((false)) && (++__CLOVER_258_0.cloverRec.CT[6718]!=0|true)) || (++__CLOVER_258_0.cloverRec.CF[6718]==0&false));
		}}}}
		}assert((((source!=null)) && (++__CLOVER_258_0.cloverRec.CT[6719]!=0|true)) || (++__CLOVER_258_0.cloverRec.CF[6719]==0&false));
		assert((((ref!=null)) && (++__CLOVER_258_0.cloverRec.CT[6720]!=0|true)) || (++__CLOVER_258_0.cloverRec.CF[6720]==0&false));
		//System.out.println("methode 1:");
		__CLOVER_258_0.cloverRec.S[21994]++;NodeList fils = element.getChildNodes();
		__CLOVER_258_0.cloverRec.S[21995]++;int i;
		__CLOVER_258_0.cloverRec.S[21996]++;for (i = 0; (((i < fils.getLength()) && (++__CLOVER_258_0.cloverRec.CT[6721]!=0|true)) || (++__CLOVER_258_0.cloverRec.CF[6721]==0&false)); i++) {{
			__CLOVER_258_0.cloverRec.S[21997]++;Node n = fils.item(i);
			//System.out.println("element=" + n.getNodeName());
			 __CLOVER_258_0.cloverRec.S[21998]++;if ((((n instanceof Text) && (++__CLOVER_258_0.cloverRec.CT[6722]!=0|true)) || (++__CLOVER_258_0.cloverRec.CF[6722]==0&false))) {{
				__CLOVER_258_0.cloverRec.S[21999]++;String s = n.getNodeValue();
				assert((((s == "" || s.matches("[ \t\n]+"))) && (++__CLOVER_258_0.cloverRec.CT[6723]!=0|true)) || (++__CLOVER_258_0.cloverRec.CF[6723]==0&false));
			} }else {{
				assert((((false)) && (++__CLOVER_258_0.cloverRec.CT[6724]!=0|true)) || (++__CLOVER_258_0.cloverRec.CF[6724]==0&false));
			}
		}}

		}__CLOVER_258_0.cloverRec.S[22000]++;res=new String[3];
		__CLOVER_258_0.cloverRec.S[22001]++;res[0]=source;
		__CLOVER_258_0.cloverRec.S[22002]++;res[1]=src_xml;
		__CLOVER_258_0.cloverRec.S[22003]++;res[2]=ref;
		/*System.out.println("methode 2:");
		Node node=element.getFirstChild();
		while(node!=null)
		{
		  Node n=node;
		  System.out.println("element="+n.getNodeName());
		  node=node.getNextSibling();
		}*/
		assert((((ref!=null)) && (++__CLOVER_258_0.cloverRec.CT[6725]!=0|true)) || (++__CLOVER_258_0.cloverRec.CF[6725]==0&false));

		__CLOVER_258_0.cloverRec.S[22004]++;return res;
	}

	public static Test suite()
	{__CLOVER_258_0.cloverRec.M[1533]++;
		__CLOVER_258_0.cloverRec.S[22005]++;return new TestSuite(TestInterm.class);
	}

	public static void main(String[] args) {__CLOVER_258_0.cloverRec.M[1534]++;
		__CLOVER_258_0.cloverRec.S[22006]++;junit.textui.TestRunner.run(TestInterm.class);
	}

}
