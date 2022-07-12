/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ *//*
 * Created on 9 oct. 2003
 *
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
package tinyeiffel.test_unitaire;

/**
 * @author BARRET
 *
 * To change the template for this generated type comment go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */


/**
 * <p>Title: </p>
 * <p>Description: Les testes de eiffel</p>
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>Company: </p>
 * @author not attributable
 * @version 1.0
 */

//import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.FactoryConfigurationError;
import javax.xml.parsers.ParserConfigurationException;
//import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import org.w3c.dom.*;
//import ast.*;
import tinyeiffel.compiler.*;
import tinyeiffel.erreur.*;

//import org.w3c.dom.Document;
//import org.w3c.dom.Element;
//import org.w3c.dom.NodeList;

//import javax.xml.parsers.FactoryConfigurationError;
//import javax.xml.parsers.ParserConfigurationException;
//import javax.xml.parsers.DocumentBuilderFactory;
//import javax.xml.parsers.DocumentBuilder;

import java.util.*;
import junit.framework.*;
import java.io.*;

public class VerifieContextErreur extends TestCase {static class __CLOVER_263_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}


	protected void setUp()
	{__CLOVER_263_0.cloverRec.M[1575]++;
		//System.out.println("coucou-1");
		
	}

	public static Test suite()
	{__CLOVER_263_0.cloverRec.M[1576]++;
//		TestSuite t=new TestSuite();
		//t.addTest(new TestXmlSimple("test_unitaire\\test_class1.xml"));
//		t.addTest(new Test_unitaire1());
//		return t;//new TestSuite(Test_unitaire1.class);
		//System.out.println("coucou1");
		__CLOVER_263_0.cloverRec.S[22624]++;return new TestSuite(VerifieContextErreur.class);
	}
	
	public void test1()
	{__CLOVER_263_0.cloverRec.M[1577]++;
		__CLOVER_263_0.cloverRec.S[22625]++;assertTrue(true);
	}
	
	public int no_seul=-1;
	
	public void test2() throws FileNotFoundException
	{__CLOVER_263_0.cloverRec.M[1578]++;
		__CLOVER_263_0.cloverRec.S[22626]++;Classe_Erreur[] liste;
		__CLOVER_263_0.cloverRec.S[22627]++;FileOutputStream file;
		__CLOVER_263_0.cloverRec.S[22628]++;Compiler_Eiffel compiler;
		__CLOVER_263_0.cloverRec.S[22629]++;Classe_Erreur cl;
		__CLOVER_263_0.cloverRec.S[22630]++;Logging log;
		__CLOVER_263_0.cloverRec.S[22631]++;Erreur erreur;
		__CLOVER_263_0.cloverRec.S[22632]++;liste=parse("test\\context\\test_context.xml");
		assert((((liste!=null)) && (++__CLOVER_263_0.cloverRec.CT[6869]!=0|true)) || (++__CLOVER_263_0.cloverRec.CF[6869]==0&false));
		__CLOVER_263_0.cloverRec.S[22633]++;file=new FileOutputStream("test\\context\\test999.xml");
				
		__CLOVER_263_0.cloverRec.S[22634]++;toXML(liste,new PrintStream(file));
		__CLOVER_263_0.cloverRec.S[22635]++;int i=0,j,i_old=-1;
		__CLOVER_263_0.cloverRec.S[22636]++;if((((no_seul!=-1) && (++__CLOVER_263_0.cloverRec.CT[6870]!=0|true)) || (++__CLOVER_263_0.cloverRec.CF[6870]==0&false)))
		{{
			__CLOVER_263_0.cloverRec.S[22637]++;i=no_seul;
			__CLOVER_263_0.cloverRec.S[22638]++;i_old=i-1;
		}
		}__CLOVER_263_0.cloverRec.S[22639]++;for(;((((i<liste.length&&no_seul==-1)||
				(i<no_seul+1&&no_seul!=-1)) && (++__CLOVER_263_0.cloverRec.CT[6871]!=0|true)) || (++__CLOVER_263_0.cloverRec.CF[6871]==0&false));i++,i_old++)
		{{
			assert((((i_old+1==i)) && (++__CLOVER_263_0.cloverRec.CT[6872]!=0|true)) || (++__CLOVER_263_0.cloverRec.CF[6872]==0&false));
			__CLOVER_263_0.cloverRec.S[22640]++;cl=liste[i];
			__CLOVER_263_0.cloverRec.S[22641]++;compiler=new Compiler_Eiffel();
			__CLOVER_263_0.cloverRec.S[22642]++;compiler.logging=new Logging();
			__CLOVER_263_0.cloverRec.S[22643]++;compiler.compile(cl.nom);
			__CLOVER_263_0.cloverRec.S[22644]++;log=compiler.logging;
			__CLOVER_263_0.cloverRec.S[22645]++;Erreur lerreur[]=log.getListe_erreur();
			__CLOVER_263_0.cloverRec.S[22646]++;for(j=0;(((j<lerreur.length) && (++__CLOVER_263_0.cloverRec.CT[6873]!=0|true)) || (++__CLOVER_263_0.cloverRec.CF[6873]==0&false));j++)
			{{
				__CLOVER_263_0.cloverRec.S[22647]++;erreur=lerreur[j];
				__CLOVER_263_0.cloverRec.S[22648]++;System.out.println("!"+erreur.toMsg()+"!"/*+"=="
						+((cl.liste_erreur!=null)?cl.liste_erreur[j].text:"null")*/);
				// verification que chaque erreur (erreur) du fichier xml 
				// est trouve par le compilo (cl.liste_erreur)  
				assert((((contient(erreur,cl.liste_erreur))) && (++__CLOVER_263_0.cloverRec.CT[6874]!=0|true)) || (++__CLOVER_263_0.cloverRec.CF[6874]==0&false)):
						i+"Erreur non pr\u00e9sente pour "+cl.nom+" (chez compilo):"+erreur.toMsg()+
						"!="+(((((cl.liste_erreur!=null&&cl.liste_erreur.length>j)) && (++__CLOVER_263_0.cloverRec.CT[6875]!=0|true)) || (++__CLOVER_263_0.cloverRec.CF[6875]==0&false))?""+cl.liste_erreur[j].text:"null");
			}
			}__CLOVER_263_0.cloverRec.S[22649]++;if((((cl.liste_erreur==null) && (++__CLOVER_263_0.cloverRec.CT[6876]!=0|true)) || (++__CLOVER_263_0.cloverRec.CF[6876]==0&false)))
				{assert((((lerreur.length==0)) && (++__CLOVER_263_0.cloverRec.CT[6877]!=0|true)) || (++__CLOVER_263_0.cloverRec.CF[6877]==0&false));
			}else
			{{
				__CLOVER_263_0.cloverRec.S[22650]++;if((((lerreur.length!=cl.liste_erreur.length) && (++__CLOVER_263_0.cloverRec.CT[6878]!=0|true)) || (++__CLOVER_263_0.cloverRec.CF[6878]==0&false)))
				{{
					__CLOVER_263_0.cloverRec.S[22651]++;for(int k=0;(((k<cl.liste_erreur.length) && (++__CLOVER_263_0.cloverRec.CT[6879]!=0|true)) || (++__CLOVER_263_0.cloverRec.CF[6879]==0&false));k++)
					{{// recherche s'il y a des erreurs dans le compilo (e)
						// qui ne sont pas de le fichier xml (lerreur)
						__CLOVER_263_0.cloverRec.S[22652]++;Err e=cl.liste_erreur[k];
						__CLOVER_263_0.cloverRec.S[22653]++;if((((!contient(e,lerreur)) && (++__CLOVER_263_0.cloverRec.CT[6880]!=0|true)) || (++__CLOVER_263_0.cloverRec.CF[6880]==0&false)))
						{{
							__CLOVER_263_0.cloverRec.S[22654]++;System.out.println("Erreur non pr\u00e9sente (chez XML):"+e.text);
						}
					}}
				}}
				}assert((((lerreur.length==cl.liste_erreur.length)) && (++__CLOVER_263_0.cloverRec.CT[6881]!=0|true)) || (++__CLOVER_263_0.cloverRec.CF[6881]==0&false)):
						"Erreur en trop:"+cl.nom+"("+
						lerreur.length+"!="+
						cl.liste_erreur.length+")"+
						"{"+cl.liste_erreur+"}";
			}
			}assert((((lerreur.length==log.nb_erreur())) && (++__CLOVER_263_0.cloverRec.CT[6882]!=0|true)) || (++__CLOVER_263_0.cloverRec.CF[6882]==0&false));
		}
		}assert((((i==liste.length)) && (++__CLOVER_263_0.cloverRec.CT[6883]!=0|true)) || (++__CLOVER_263_0.cloverRec.CF[6883]==0&false));
		__CLOVER_263_0.cloverRec.S[22655]++;for(i=0;(((i<liste.length) && (++__CLOVER_263_0.cloverRec.CT[6884]!=0|true)) || (++__CLOVER_263_0.cloverRec.CF[6884]==0&false));i++)
		{{
			__CLOVER_263_0.cloverRec.S[22656]++;if((((no_seul==-1||no_seul==i) && (++__CLOVER_263_0.cloverRec.CT[6885]!=0|true)) || (++__CLOVER_263_0.cloverRec.CF[6885]==0&false)))
				{__CLOVER_263_0.cloverRec.S[22657]++;System.out.println("Test de "+liste[i].nom);
		}}
	}}
	
	//public String valeur(Classe_Erreur[])
	
	// retourne true ssi liste contient e
	public boolean contient(Erreur e,Err liste[])
	{__CLOVER_263_0.cloverRec.M[1579]++;
		__CLOVER_263_0.cloverRec.S[22658]++;int i;
		__CLOVER_263_0.cloverRec.S[22659]++;if((((liste!=null) && (++__CLOVER_263_0.cloverRec.CT[6886]!=0|true)) || (++__CLOVER_263_0.cloverRec.CF[6886]==0&false)))
		{{
			__CLOVER_263_0.cloverRec.S[22660]++;for(i=0;(((i<liste.length) && (++__CLOVER_263_0.cloverRec.CT[6887]!=0|true)) || (++__CLOVER_263_0.cloverRec.CF[6887]==0&false));i++)
			{{
				__CLOVER_263_0.cloverRec.S[22661]++;if((((liste[i].same_as(e)) && (++__CLOVER_263_0.cloverRec.CT[6888]!=0|true)) || (++__CLOVER_263_0.cloverRec.CF[6888]==0&false)))
					{__CLOVER_263_0.cloverRec.S[22662]++;return true;
			}}
		}}
		}__CLOVER_263_0.cloverRec.S[22663]++;return false;
	}

	public boolean contient(Err e,Erreur liste[])
	{__CLOVER_263_0.cloverRec.M[1580]++;
		__CLOVER_263_0.cloverRec.S[22664]++;int i;
		__CLOVER_263_0.cloverRec.S[22665]++;if((((liste!=null) && (++__CLOVER_263_0.cloverRec.CT[6889]!=0|true)) || (++__CLOVER_263_0.cloverRec.CF[6889]==0&false)))
		{{
			__CLOVER_263_0.cloverRec.S[22666]++;for(i=0;(((i<liste.length) && (++__CLOVER_263_0.cloverRec.CT[6890]!=0|true)) || (++__CLOVER_263_0.cloverRec.CF[6890]==0&false));i++)
			{{
				__CLOVER_263_0.cloverRec.S[22667]++;if((((e.same_as(liste[i])) && (++__CLOVER_263_0.cloverRec.CT[6891]!=0|true)) || (++__CLOVER_263_0.cloverRec.CF[6891]==0&false)))
					{__CLOVER_263_0.cloverRec.S[22668]++;return true;
			}}
		}}
		}__CLOVER_263_0.cloverRec.S[22669]++;return false;
	}
	
	public static void main(String arg[])
	{__CLOVER_263_0.cloverRec.M[1581]++;
		//assert(junit.textui.TestRunner!=null);
		//System.out.println("coucou0");
		//if(arg.length>1)
		//	junit.awtui.TestRunner.run(suite());
		//else
		__CLOVER_263_0.cloverRec.S[22670]++;VerifieContextErreur v=new VerifieContextErreur();
		__CLOVER_263_0.cloverRec.S[22671]++;v.no_seul=15;
		__CLOVER_263_0.cloverRec.S[22672]++;try{
			__CLOVER_263_0.cloverRec.S[22673]++;v.test2();
		}
		catch(FileNotFoundException e)
		{
			__CLOVER_263_0.cloverRec.S[22674]++;e.printStackTrace();
			assert((((false)) && (++__CLOVER_263_0.cloverRec.CT[6892]!=0|true)) || (++__CLOVER_263_0.cloverRec.CF[6892]==0&false));
		}
//			junit.textui.TestRunner.run(suite());
		//System.out.println("coucou3");
		//TestResult result= 
		//suite().run(null);
		//TestSuite suite=(TestSuite)suite();
		//TestResult result= suite.run(suite);
				/*AstXML ast=new AstXML();
				Classe c=ast.parse("");
				c.check_egal(c);*/
				//System.out.println("Fin des tests");
	}
	
	public void toXML(Classe_Erreur[] liste,PrintStream out)
	{__CLOVER_263_0.cloverRec.M[1582]++;
		assert((((liste!=null)) && (++__CLOVER_263_0.cloverRec.CT[6893]!=0|true)) || (++__CLOVER_263_0.cloverRec.CF[6893]==0&false));
		assert((((out!=null)) && (++__CLOVER_263_0.cloverRec.CT[6894]!=0|true)) || (++__CLOVER_263_0.cloverRec.CF[6894]==0&false));
		__CLOVER_263_0.cloverRec.S[22675]++;out.println("<?xml version=\"1.0\" encoding=\"ISO-8859-1\" ?>");
		__CLOVER_263_0.cloverRec.S[22676]++;out.println("<!DOCTYPE liste_classe SYSTEM \"..\\..\\test_unitaire\\context.dtd\">");
		__CLOVER_263_0.cloverRec.S[22677]++;out.println("<liste_classe>");
		__CLOVER_263_0.cloverRec.S[22678]++;for(int i=0;(((i<liste.length) && (++__CLOVER_263_0.cloverRec.CT[6895]!=0|true)) || (++__CLOVER_263_0.cloverRec.CF[6895]==0&false));i++)
		{{
			__CLOVER_263_0.cloverRec.S[22679]++;liste[i].toXML(out);
		}
		}__CLOVER_263_0.cloverRec.S[22680]++;out.println("</liste_classe>");
	}

	public Classe_Erreur[] parse(String nom_fichier) {__CLOVER_263_0.cloverRec.M[1583]++;
		assert((((nom_fichier!=null)) && (++__CLOVER_263_0.cloverRec.CT[6896]!=0|true)) || (++__CLOVER_263_0.cloverRec.CF[6896]==0&false));
		
		__CLOVER_263_0.cloverRec.S[22681]++;String xmlFile = "test\\context\test8.xml";
			__CLOVER_263_0.cloverRec.S[22682]++;xmlFile=nom_fichier;
		__CLOVER_263_0.cloverRec.S[22683]++;try {
			__CLOVER_263_0.cloverRec.S[22684]++;DocumentBuilderFactory factory =
				DocumentBuilderFactory.newInstance();
			__CLOVER_263_0.cloverRec.S[22685]++;DocumentBuilder parser = factory.newDocumentBuilder();
			//parser.setFeature("http://xml.org/sax/features/validation", true);
			__CLOVER_263_0.cloverRec.S[22686]++;Document document = parser.parse(xmlFile);


			__CLOVER_263_0.cloverRec.S[22687]++;Element catalogue = document.getDocumentElement();

			/*System.out.println(
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
					+ ",");*/
			__CLOVER_263_0.cloverRec.S[22688]++;Classe_Erreur c[] = creer_liste_erreur(catalogue);
			//System.out.println("classe=" + c.toString());
			__CLOVER_263_0.cloverRec.S[22689]++;return c;
		} catch (FactoryConfigurationError e) {
			// unable to get a document builder factory
			__CLOVER_263_0.cloverRec.S[22690]++;e.printStackTrace();
			__CLOVER_263_0.cloverRec.S[22691]++;System.err.println("Erreur de configuration du factory");
			__CLOVER_263_0.cloverRec.S[22692]++;System.exit(1);
		} catch (ParserConfigurationException e) {
			// parser was unable to be configured
			__CLOVER_263_0.cloverRec.S[22693]++;e.printStackTrace();
			__CLOVER_263_0.cloverRec.S[22694]++;System.err.println("Erreur de configuration du parser");
			__CLOVER_263_0.cloverRec.S[22695]++;System.exit(1);
		} catch (SAXException e) {
			// parsing error
			__CLOVER_263_0.cloverRec.S[22696]++;e.printStackTrace();
			__CLOVER_263_0.cloverRec.S[22697]++;System.err.println("Exception Sax:"+e.getMessage());
			__CLOVER_263_0.cloverRec.S[22698]++;System.exit(1);
		} catch (IOException e) {
			// i/o error
			__CLOVER_263_0.cloverRec.S[22699]++;e.printStackTrace();
			__CLOVER_263_0.cloverRec.S[22700]++;System.err.println("Erreur d'entree sortie"+e.getMessage());
			__CLOVER_263_0.cloverRec.S[22701]++;System.exit(1);
		}
		__CLOVER_263_0.cloverRec.S[22702]++;return null;
	}

	public Classe_Erreur[] ajoute_classe(Classe_Erreur[] liste,Classe_Erreur cl)
	{__CLOVER_263_0.cloverRec.M[1584]++;
		assert((((cl!=null)) && (++__CLOVER_263_0.cloverRec.CT[6897]!=0|true)) || (++__CLOVER_263_0.cloverRec.CF[6897]==0&false));
		__CLOVER_263_0.cloverRec.S[22703]++;if((((liste==null) && (++__CLOVER_263_0.cloverRec.CT[6898]!=0|true)) || (++__CLOVER_263_0.cloverRec.CF[6898]==0&false)))
		{{
			__CLOVER_263_0.cloverRec.S[22704]++;liste=new Classe_Erreur[1];
			__CLOVER_263_0.cloverRec.S[22705]++;liste[0]=cl;
		}
		}else
		{{
			__CLOVER_263_0.cloverRec.S[22706]++;int i,len=liste.length;
			__CLOVER_263_0.cloverRec.S[22707]++;Classe_Erreur tmp[]=new Classe_Erreur[len+1];
			__CLOVER_263_0.cloverRec.S[22708]++;for(i=0;(((i<len) && (++__CLOVER_263_0.cloverRec.CT[6899]!=0|true)) || (++__CLOVER_263_0.cloverRec.CF[6899]==0&false));i++)
			{{
				__CLOVER_263_0.cloverRec.S[22709]++;tmp[i]=liste[i];
			}
			}__CLOVER_263_0.cloverRec.S[22710]++;tmp[i]=cl;
			__CLOVER_263_0.cloverRec.S[22711]++;liste=tmp;
		}
		}assert((((liste!=null)) && (++__CLOVER_263_0.cloverRec.CT[6900]!=0|true)) || (++__CLOVER_263_0.cloverRec.CF[6900]==0&false));
		__CLOVER_263_0.cloverRec.S[22712]++;return liste;
	}

	public Classe_Erreur[] creer_liste_erreur(Element element) {__CLOVER_263_0.cloverRec.M[1585]++;
		assert((((element != null)) && (++__CLOVER_263_0.cloverRec.CT[6901]!=0|true)) || (++__CLOVER_263_0.cloverRec.CF[6901]==0&false));
		assert((((element.getNodeName() == "liste_classe")) && (++__CLOVER_263_0.cloverRec.CT[6902]!=0|true)) || (++__CLOVER_263_0.cloverRec.CF[6902]==0&false));
		__CLOVER_263_0.cloverRec.S[22713]++;NamedNodeMap attributs = element.getAttributes();
		__CLOVER_263_0.cloverRec.S[22714]++;Classe_Erreur liste[]=null,cl;

		assert((((attributs.getLength()==0)) && (++__CLOVER_263_0.cloverRec.CT[6903]!=0|true)) || (++__CLOVER_263_0.cloverRec.CF[6903]==0&false));
		//System.out.println("methode 1:");
		__CLOVER_263_0.cloverRec.S[22715]++;NodeList fils = element.getChildNodes();
		__CLOVER_263_0.cloverRec.S[22716]++;int i;
		__CLOVER_263_0.cloverRec.S[22717]++;for (i = 0; (((i < fils.getLength()) && (++__CLOVER_263_0.cloverRec.CT[6904]!=0|true)) || (++__CLOVER_263_0.cloverRec.CF[6904]==0&false)); i++) {{
			__CLOVER_263_0.cloverRec.S[22718]++;Node n = fils.item(i);
			//System.out.println("element=" + n.getNodeName());
			__CLOVER_263_0.cloverRec.S[22719]++;if ((((n instanceof Element) && (++__CLOVER_263_0.cloverRec.CT[6905]!=0|true)) || (++__CLOVER_263_0.cloverRec.CF[6905]==0&false))) {{
				__CLOVER_263_0.cloverRec.S[22720]++;if ((((n.getNodeName() == "classe") && (++__CLOVER_263_0.cloverRec.CT[6906]!=0|true)) || (++__CLOVER_263_0.cloverRec.CF[6906]==0&false))) {{
					//System.out.println("heritage");
					__CLOVER_263_0.cloverRec.S[22721]++;cl = new Classe_Erreur((Element) n);
					__CLOVER_263_0.cloverRec.S[22722]++;liste=ajoute_classe(liste,cl);
				} }else {{
					assert((((false)) && (++__CLOVER_263_0.cloverRec.CT[6907]!=0|true)) || (++__CLOVER_263_0.cloverRec.CF[6907]==0&false));
				}
			}} }else {__CLOVER_263_0.cloverRec.S[22723]++;if ((((n instanceof Text) && (++__CLOVER_263_0.cloverRec.CT[6908]!=0|true)) || (++__CLOVER_263_0.cloverRec.CF[6908]==0&false))) {{
				__CLOVER_263_0.cloverRec.S[22724]++;String s = n.getNodeValue();
				assert((((s == "" || s.matches("[ \t\n]+"))) && (++__CLOVER_263_0.cloverRec.CT[6909]!=0|true)) || (++__CLOVER_263_0.cloverRec.CF[6909]==0&false));
			} }else {__CLOVER_263_0.cloverRec.S[22725]++;if((((n instanceof Comment) && (++__CLOVER_263_0.cloverRec.CT[6910]!=0|true)) || (++__CLOVER_263_0.cloverRec.CF[6910]==0&false))) {{
				// commentaire
			} }else {{
				assert((((false)) && (++__CLOVER_263_0.cloverRec.CT[6911]!=0|true)) || (++__CLOVER_263_0.cloverRec.CF[6911]==0&false));
			}
		}}}}

		}assert((((liste!=null)) && (++__CLOVER_263_0.cloverRec.CT[6912]!=0|true)) || (++__CLOVER_263_0.cloverRec.CF[6912]==0&false));

		__CLOVER_263_0.cloverRec.S[22726]++;return liste;
	}

}
class Classe_Erreur
{static class __CLOVER_263_1{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}
	public Classe_Erreur(Element element)
	{__CLOVER_263_1.cloverRec.M[1586]++;
		assert((((element!=null)) && (++__CLOVER_263_1.cloverRec.CT[6913]!=0|true)) || (++__CLOVER_263_1.cloverRec.CF[6913]==0&false));
		__CLOVER_263_1.cloverRec.S[22727]++;creer_classe(element);
	}

	public void creer_classe(Element element) {__CLOVER_263_1.cloverRec.M[1587]++;
		assert((((element != null)) && (++__CLOVER_263_1.cloverRec.CT[6914]!=0|true)) || (++__CLOVER_263_1.cloverRec.CF[6914]==0&false));
		assert((((element.getNodeName() == "classe")) && (++__CLOVER_263_1.cloverRec.CT[6915]!=0|true)) || (++__CLOVER_263_1.cloverRec.CF[6915]==0&false));
		__CLOVER_263_1.cloverRec.S[22728]++;NamedNodeMap attributs = element.getAttributes();
		__CLOVER_263_1.cloverRec.S[22729]++;Vector v = new Vector();
		__CLOVER_263_1.cloverRec.S[22730]++;Err err;

		assert((((attributs.getLength()==1)) && (++__CLOVER_263_1.cloverRec.CT[6916]!=0|true)) || (++__CLOVER_263_1.cloverRec.CF[6916]==0&false));
		__CLOVER_263_1.cloverRec.S[22731]++;for (int i = 0; (((i < attributs.getLength()) && (++__CLOVER_263_1.cloverRec.CT[6917]!=0|true)) || (++__CLOVER_263_1.cloverRec.CF[6917]==0&false)); i++) {{
			__CLOVER_263_1.cloverRec.S[22732]++;Node num\u00e9ro = attributs.item(i);
			__CLOVER_263_1.cloverRec.S[22733]++;String nomAttribut = num\u00e9ro.getNodeName();
			__CLOVER_263_1.cloverRec.S[22734]++;String valeurAttribut = num\u00e9ro.getNodeValue();
			__CLOVER_263_1.cloverRec.S[22735]++;System.out.println(nomAttribut + " =\"" + valeurAttribut + "\"");
			__CLOVER_263_1.cloverRec.S[22736]++;if ((((nomAttribut == "nom") && (++__CLOVER_263_1.cloverRec.CT[6918]!=0|true)) || (++__CLOVER_263_1.cloverRec.CF[6918]==0&false)))
				{__CLOVER_263_1.cloverRec.S[22737]++;this.nom=valeurAttribut;
			}else
				{assert((((false)) && (++__CLOVER_263_1.cloverRec.CT[6919]!=0|true)) || (++__CLOVER_263_1.cloverRec.CF[6919]==0&false));
		}}
		}assert((((!nom.equals(""))) && (++__CLOVER_263_1.cloverRec.CT[6920]!=0|true)) || (++__CLOVER_263_1.cloverRec.CF[6920]==0&false));
		//System.out.println("methode 1:");
		__CLOVER_263_1.cloverRec.S[22738]++;NodeList fils = element.getChildNodes();
		__CLOVER_263_1.cloverRec.S[22739]++;int i;
		__CLOVER_263_1.cloverRec.S[22740]++;for (i = 0; (((i < fils.getLength()) && (++__CLOVER_263_1.cloverRec.CT[6921]!=0|true)) || (++__CLOVER_263_1.cloverRec.CF[6921]==0&false)); i++) {{
			__CLOVER_263_1.cloverRec.S[22741]++;Node n = fils.item(i);
			//System.out.println("element=" + n.getNodeName());
			__CLOVER_263_1.cloverRec.S[22742]++;if ((((n instanceof Element) && (++__CLOVER_263_1.cloverRec.CT[6922]!=0|true)) || (++__CLOVER_263_1.cloverRec.CF[6922]==0&false))) {{
				__CLOVER_263_1.cloverRec.S[22743]++;if ((((n.getNodeName() == "erreur") && (++__CLOVER_263_1.cloverRec.CT[6923]!=0|true)) || (++__CLOVER_263_1.cloverRec.CF[6923]==0&false))) {{
					//System.out.println("heritage");
					__CLOVER_263_1.cloverRec.S[22744]++;err = new Err((Element) n);
					__CLOVER_263_1.cloverRec.S[22745]++;ajoute_erreur(err);
				} }else {{
					assert((((false)) && (++__CLOVER_263_1.cloverRec.CT[6924]!=0|true)) || (++__CLOVER_263_1.cloverRec.CF[6924]==0&false));
				}
			}} }else {__CLOVER_263_1.cloverRec.S[22746]++;if ((((n instanceof Text) && (++__CLOVER_263_1.cloverRec.CT[6925]!=0|true)) || (++__CLOVER_263_1.cloverRec.CF[6925]==0&false))) {{
				__CLOVER_263_1.cloverRec.S[22747]++;String s = n.getNodeValue();
				assert((((s == "" || s.matches("[ \t\n]+"))) && (++__CLOVER_263_1.cloverRec.CT[6926]!=0|true)) || (++__CLOVER_263_1.cloverRec.CF[6926]==0&false));
			} }else {__CLOVER_263_1.cloverRec.S[22748]++;if ((((n instanceof Comment) && (++__CLOVER_263_1.cloverRec.CT[6927]!=0|true)) || (++__CLOVER_263_1.cloverRec.CF[6927]==0&false))) {{
				// commentaire
			} }else {{
				assert((((false)) && (++__CLOVER_263_1.cloverRec.CT[6928]!=0|true)) || (++__CLOVER_263_1.cloverRec.CF[6928]==0&false));
			}
		}}}}
		}assert((((nom!=null)) && (++__CLOVER_263_1.cloverRec.CT[6929]!=0|true)) || (++__CLOVER_263_1.cloverRec.CF[6929]==0&false));
	}
	
	public void ajoute_erreur(Err err)
	{__CLOVER_263_1.cloverRec.M[1588]++;
		assert((((err!=null)) && (++__CLOVER_263_1.cloverRec.CT[6930]!=0|true)) || (++__CLOVER_263_1.cloverRec.CF[6930]==0&false));
		__CLOVER_263_1.cloverRec.S[22749]++;if((((liste_erreur==null) && (++__CLOVER_263_1.cloverRec.CT[6931]!=0|true)) || (++__CLOVER_263_1.cloverRec.CF[6931]==0&false)))
		{{
			__CLOVER_263_1.cloverRec.S[22750]++;liste_erreur=new Err[1];
			__CLOVER_263_1.cloverRec.S[22751]++;liste_erreur[0]=err;
		}
		}else
		{{
			__CLOVER_263_1.cloverRec.S[22752]++;int i,len=liste_erreur.length;
			__CLOVER_263_1.cloverRec.S[22753]++;Err tmp[]=new Err[len+1];
			__CLOVER_263_1.cloverRec.S[22754]++;for(i=0;(((i<len) && (++__CLOVER_263_1.cloverRec.CT[6932]!=0|true)) || (++__CLOVER_263_1.cloverRec.CF[6932]==0&false));i++)
			{{
				__CLOVER_263_1.cloverRec.S[22755]++;tmp[i]=liste_erreur[i];
			}
			}__CLOVER_263_1.cloverRec.S[22756]++;tmp[i]=err;
			__CLOVER_263_1.cloverRec.S[22757]++;liste_erreur=tmp;
		}
		}assert((((liste_erreur!=null)) && (++__CLOVER_263_1.cloverRec.CT[6933]!=0|true)) || (++__CLOVER_263_1.cloverRec.CF[6933]==0&false));
	}

	public void toXML(PrintStream out)
	{__CLOVER_263_1.cloverRec.M[1589]++;
		assert((((out!=null)) && (++__CLOVER_263_1.cloverRec.CT[6934]!=0|true)) || (++__CLOVER_263_1.cloverRec.CF[6934]==0&false));
		__CLOVER_263_1.cloverRec.S[22758]++;out.println("<classe nom=\""+nom+"\">");
		__CLOVER_263_1.cloverRec.S[22759]++;if((((liste_erreur!=null) && (++__CLOVER_263_1.cloverRec.CT[6935]!=0|true)) || (++__CLOVER_263_1.cloverRec.CF[6935]==0&false)))
		{{
			__CLOVER_263_1.cloverRec.S[22760]++;for(int i=0;(((i<liste_erreur.length) && (++__CLOVER_263_1.cloverRec.CT[6936]!=0|true)) || (++__CLOVER_263_1.cloverRec.CF[6936]==0&false));i++)
			{{
				__CLOVER_263_1.cloverRec.S[22761]++;liste_erreur[i].toXML(out);
			}
		}}
		}__CLOVER_263_1.cloverRec.S[22762]++;out.println("</classe>");
	}

	public Err liste_erreur[];
	public String nom;
}
class Err
{static class __CLOVER_263_2{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}
	public Err(Element element)
	{__CLOVER_263_2.cloverRec.M[1590]++;
		assert((((element!=null)) && (++__CLOVER_263_2.cloverRec.CT[6937]!=0|true)) || (++__CLOVER_263_2.cloverRec.CF[6937]==0&false));
		__CLOVER_263_2.cloverRec.S[22763]++;creer_erreur(element);
	}

	public void creer_erreur(Element element) {__CLOVER_263_2.cloverRec.M[1591]++;
		assert((((element != null)) && (++__CLOVER_263_2.cloverRec.CT[6938]!=0|true)) || (++__CLOVER_263_2.cloverRec.CF[6938]==0&false));
		assert((((element.getNodeName() == "erreur")) && (++__CLOVER_263_2.cloverRec.CT[6939]!=0|true)) || (++__CLOVER_263_2.cloverRec.CF[6939]==0&false));
		__CLOVER_263_2.cloverRec.S[22764]++;NamedNodeMap attributs = element.getAttributes();

		assert((((attributs.getLength()==1)) && (++__CLOVER_263_2.cloverRec.CT[6940]!=0|true)) || (++__CLOVER_263_2.cloverRec.CF[6940]==0&false));
		__CLOVER_263_2.cloverRec.S[22765]++;for (int i = 0; (((i < attributs.getLength()) && (++__CLOVER_263_2.cloverRec.CT[6941]!=0|true)) || (++__CLOVER_263_2.cloverRec.CF[6941]==0&false)); i++) {{
			__CLOVER_263_2.cloverRec.S[22766]++;Node num\u00e9ro = attributs.item(i);
			__CLOVER_263_2.cloverRec.S[22767]++;String nomAttribut = num\u00e9ro.getNodeName();
			__CLOVER_263_2.cloverRec.S[22768]++;String valeurAttribut = num\u00e9ro.getNodeValue();
			__CLOVER_263_2.cloverRec.S[22769]++;System.out.println(nomAttribut + " =\"" + valeurAttribut + "\"");
			__CLOVER_263_2.cloverRec.S[22770]++;if ((((nomAttribut == "nom") && (++__CLOVER_263_2.cloverRec.CT[6942]!=0|true)) || (++__CLOVER_263_2.cloverRec.CF[6942]==0&false)))
				{__CLOVER_263_2.cloverRec.S[22771]++;nom = valeurAttribut;
			}else
				{assert((((false)) && (++__CLOVER_263_2.cloverRec.CT[6943]!=0|true)) || (++__CLOVER_263_2.cloverRec.CF[6943]==0&false));
		}}
		}assert((((!nom.equals(""))) && (++__CLOVER_263_2.cloverRec.CT[6944]!=0|true)) || (++__CLOVER_263_2.cloverRec.CF[6944]==0&false));
		//System.out.println("methode 1:");
		__CLOVER_263_2.cloverRec.S[22772]++;NodeList fils = element.getChildNodes();
		__CLOVER_263_2.cloverRec.S[22773]++;int i;
		__CLOVER_263_2.cloverRec.S[22774]++;for (i = 0; (((i < fils.getLength()) && (++__CLOVER_263_2.cloverRec.CT[6945]!=0|true)) || (++__CLOVER_263_2.cloverRec.CF[6945]==0&false)); i++) {{
			__CLOVER_263_2.cloverRec.S[22775]++;Node n = fils.item(i);
			//System.out.println("element=" + n.getNodeName());
			__CLOVER_263_2.cloverRec.S[22776]++;if ((((n instanceof Text) && (++__CLOVER_263_2.cloverRec.CT[6946]!=0|true)) || (++__CLOVER_263_2.cloverRec.CF[6946]==0&false))) {{
				__CLOVER_263_2.cloverRec.S[22777]++;String s = n.getNodeValue();
				assert((((s != "")) && (++__CLOVER_263_2.cloverRec.CT[6947]!=0|true)) || (++__CLOVER_263_2.cloverRec.CF[6947]==0&false));
				__CLOVER_263_2.cloverRec.S[22778]++;text=s;
			} }else {{
				assert((((false)) && (++__CLOVER_263_2.cloverRec.CT[6948]!=0|true)) || (++__CLOVER_263_2.cloverRec.CF[6948]==0&false));
			}
		}}
	}}

	public boolean same_as(Erreur e)
	{__CLOVER_263_2.cloverRec.M[1592]++;
		assert((((e!=null)) && (++__CLOVER_263_2.cloverRec.CT[6949]!=0|true)) || (++__CLOVER_263_2.cloverRec.CF[6949]==0&false));
		__CLOVER_263_2.cloverRec.S[22779]++;String str=e.getClass().getName();
		__CLOVER_263_2.cloverRec.S[22780]++;if((((str.compareToIgnoreCase("tinyeiffel.erreur."+nom)!=0) && (++__CLOVER_263_2.cloverRec.CT[6950]!=0|true)) || (++__CLOVER_263_2.cloverRec.CF[6950]==0&false)))
			{__CLOVER_263_2.cloverRec.S[22781]++;return false;
		}__CLOVER_263_2.cloverRec.S[22782]++;String str2=e.toMsg();
		__CLOVER_263_2.cloverRec.S[22783]++;if((((text==null) && (++__CLOVER_263_2.cloverRec.CT[6951]!=0|true)) || (++__CLOVER_263_2.cloverRec.CF[6951]==0&false)))
		{{
			__CLOVER_263_2.cloverRec.S[22784]++;System.out.println("Hello");
		}
		}assert((((text!=null)) && (++__CLOVER_263_2.cloverRec.CT[6952]!=0|true)) || (++__CLOVER_263_2.cloverRec.CF[6952]==0&false));
		__CLOVER_263_2.cloverRec.S[22785]++;if((((text.compareToIgnoreCase(str2)!=0) && (++__CLOVER_263_2.cloverRec.CT[6953]!=0|true)) || (++__CLOVER_263_2.cloverRec.CF[6953]==0&false)))
			{__CLOVER_263_2.cloverRec.S[22786]++;return false;
		}__CLOVER_263_2.cloverRec.S[22787]++;return true;
	}

	public void toXML(PrintStream out)
	{__CLOVER_263_2.cloverRec.M[1593]++;
		assert((((out!=null)) && (++__CLOVER_263_2.cloverRec.CT[6954]!=0|true)) || (++__CLOVER_263_2.cloverRec.CF[6954]==0&false));
		__CLOVER_263_2.cloverRec.S[22788]++;out.print("<erreur nom=\""+nom+"\">");
		__CLOVER_263_2.cloverRec.S[22789]++;out.print(text);
		__CLOVER_263_2.cloverRec.S[22790]++;out.println("</erreur>");
	}
	
	public String nom,text;
}
