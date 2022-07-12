/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ */package tinyeiffel.test_unitaire;

import java.io.IOException;
import javax.xml.parsers.FactoryConfigurationError;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.Locator;
import org.xml.sax.Attributes;

//import javax.xml.parsers.SAXParser;
import org.xml.sax.ErrorHandler;
//import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

public class ParserXML {static class __CLOVER_255_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}

	public static void main(String args[]) {__CLOVER_255_0.cloverRec.M[1502]++;
		__CLOVER_255_0.cloverRec.S[21773]++;ParserXML p = new ParserXML();
		__CLOVER_255_0.cloverRec.S[21774]++;Fichier_test[] res = p.parse("test_unitaire\\test.xml");
		__CLOVER_255_0.cloverRec.S[21775]++;if ((((res == null) && (++__CLOVER_255_0.cloverRec.CT[6675]!=0|true)) || (++__CLOVER_255_0.cloverRec.CF[6675]==0&false))) {{
			__CLOVER_255_0.cloverRec.S[21776]++;System.out.println("Rien de trouve");
		} }else {{
			__CLOVER_255_0.cloverRec.S[21777]++;System.out.println("R\u00e9ussi");
		}
	}}

	public Fichier_test[] parse(String xmlFile) {__CLOVER_255_0.cloverRec.M[1503]++;
		//String xmlFile = "file:///xerces-2_5_0/data/personal.xml"; 
		__CLOVER_255_0.cloverRec.S[21778]++;try {
			__CLOVER_255_0.cloverRec.S[21779]++;SAXParserFactory factory = SAXParserFactory.newInstance();
			__CLOVER_255_0.cloverRec.S[21780]++;SAXParser parser = factory.newSAXParser();
			__CLOVER_255_0.cloverRec.S[21781]++;DefaultHandler handler = new TDefaultHandler();

			__CLOVER_255_0.cloverRec.S[21782]++;ErrorHandler error_handler = new TErrorHandler();

			__CLOVER_255_0.cloverRec.S[21783]++;parser.getXMLReader().setErrorHandler(error_handler);
			//parser.setFeature("http://xml.org/sax/features/validation",false);
			//parser.setFeature("http://xml.org/sax/features/namespaces",false);
			__CLOVER_255_0.cloverRec.S[21784]++;System.out.println("Parsing...");
			__CLOVER_255_0.cloverRec.S[21785]++;parser.parse(xmlFile, handler);
			__CLOVER_255_0.cloverRec.S[21786]++;System.out.println("Termin\u00e9");
			__CLOVER_255_0.cloverRec.S[21787]++;Fichier_test f[] = ((TDefaultHandler) handler).resultat;
			__CLOVER_255_0.cloverRec.S[21788]++;if ((((f == null) && (++__CLOVER_255_0.cloverRec.CT[6676]!=0|true)) || (++__CLOVER_255_0.cloverRec.CF[6676]==0&false)))
				{__CLOVER_255_0.cloverRec.S[21789]++;System.out.println("null");
			}else
				{__CLOVER_255_0.cloverRec.S[21790]++;System.out.println("length:" + f.length);
			}__CLOVER_255_0.cloverRec.S[21791]++;return f;
		} catch (FactoryConfigurationError e) {
			// unable to get a document builder factory
			__CLOVER_255_0.cloverRec.S[21792]++;System.out.println(
				"Erreur: pb avec le document builder factory("
					+ e.getMessage()
					+ ")");
		} catch (ParserConfigurationException e) {
			// parser was unable to be configured
			__CLOVER_255_0.cloverRec.S[21793]++;System.out.println(
				"Erreur: pb avec la configuration(" + e.getMessage() + ")");
		} catch (SAXException e) {
			// parsing error
			__CLOVER_255_0.cloverRec.S[21794]++;System.out.println(
				"Erreur: erreur de parsing(" + e.getMessage() + ")");
		} catch (IOException e) {
			// i/o error
			__CLOVER_255_0.cloverRec.S[21795]++;System.out.println(
				"Erreur: erreur d'entr\u00e9e sortie(" + e.getMessage() + ")");
		}
		__CLOVER_255_0.cloverRec.S[21796]++;return null;
	}

}

class TErrorHandler implements ErrorHandler {static class __CLOVER_255_1{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}
	public void warning(SAXParseException e) throws SAXException {__CLOVER_255_1.cloverRec.M[1504]++;
		__CLOVER_255_1.cloverRec.S[21797]++;System.err.println(
			"[warning] \n"
				+ " Ligne   : "
				+ e.getLineNumber()
				+ "\n"
				+ " URI     : "
				+ e.getSystemId()
				+ "\n"
				+ " Message : "
				+ e.getMessage());
		__CLOVER_255_1.cloverRec.S[21798]++;throw new SAXException("un avertissement a eu lieu");
	}

	public void error(SAXParseException e) throws SAXException {__CLOVER_255_1.cloverRec.M[1505]++;
		__CLOVER_255_1.cloverRec.S[21799]++;System.err.println(
			"[error] \n"
				+ " Ligne   : "
				+ e.getLineNumber()
				+ "\n"
				+ " URI     : "
				+ e.getSystemId()
				+ "\n"
				+ " Message : "
				+ e.getMessage());
		__CLOVER_255_1.cloverRec.S[21800]++;throw new SAXException("une erreur a eu lieu");
	}

	public void fatalError(SAXParseException e) throws SAXException {__CLOVER_255_1.cloverRec.M[1506]++;
		__CLOVER_255_1.cloverRec.S[21801]++;System.err.println(
			"[fatal error] \n"
				+ " Ligne   : "
				+ e.getLineNumber()
				+ "\n"
				+ " URI     : "
				+ e.getSystemId()
				+ "\n"
				+ " Message : "
				+ e.getMessage());
		__CLOVER_255_1.cloverRec.S[21802]++;throw new SAXException("une erreur fatale a eu lieu");
	}
}

class TDefaultHandler extends DefaultHandler {static class __CLOVER_255_2{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}
	private Locator locator;

	public Fichier_test[] resultat;

	public void setDocumentLocator(Locator locator) {__CLOVER_255_2.cloverRec.M[1507]++;
		__CLOVER_255_2.cloverRec.S[21803]++;this.locator = locator;
	}

	/** Start document. */
	public void startDocument() throws SAXException {__CLOVER_255_2.cloverRec.M[1508]++;
		__CLOVER_255_2.cloverRec.S[21804]++;System.out.println("Debut du document");
	}

	/** Processing instruction. */
	public void processingInstruction(String target, String data)
		throws SAXException {__CLOVER_255_2.cloverRec.M[1509]++;

	}

	/** End document. */
	public void endDocument() throws SAXException {__CLOVER_255_2.cloverRec.M[1510]++;
		__CLOVER_255_2.cloverRec.S[21805]++;System.out.println("Fin du document");
	}

	/** Start prefix mapping. */
	public void startPrefixMapping(String prefix, String uri)
		throws SAXException {__CLOVER_255_2.cloverRec.M[1511]++;

	}

	/** End prefix mapping. */
	public void endPrefixMapping(String prefix) throws SAXException {__CLOVER_255_2.cloverRec.M[1512]++;

	}

	public int convertie(String str) {__CLOVER_255_2.cloverRec.M[1513]++;
		__CLOVER_255_2.cloverRec.S[21806]++;try {
			__CLOVER_255_2.cloverRec.S[21807]++;int i = Integer.parseInt(str, 10);
			__CLOVER_255_2.cloverRec.S[21808]++;return i;
		} catch (NumberFormatException e) {

		}
		__CLOVER_255_2.cloverRec.S[21809]++;return -1;
	}

	/** Start element. */
	public void startElement(
		String uri,
		String localName,
		String qname,
		Attributes attributes)
		throws SAXException {__CLOVER_255_2.cloverRec.M[1514]++;
		//System.out.println("Element:"+localName+"!"+qname);
		__CLOVER_255_2.cloverRec.S[21810]++;if ((((qname.equals("toto:root")) && (++__CLOVER_255_2.cloverRec.CT[6677]!=0|true)) || (++__CLOVER_255_2.cloverRec.CF[6677]==0&false))) {{
			//System.out.println("root");
		} }else {__CLOVER_255_2.cloverRec.S[21811]++;if ((((qname.equals("toto:file")) && (++__CLOVER_255_2.cloverRec.CT[6678]!=0|true)) || (++__CLOVER_255_2.cloverRec.CF[6678]==0&false))) {{
			__CLOVER_255_2.cloverRec.S[21812]++;int nb_erreur = -1, i;
			__CLOVER_255_2.cloverRec.S[21813]++;String nom = "";
			__CLOVER_255_2.cloverRec.S[21814]++;for (i = 0; (((i < attributes.getLength()) && (++__CLOVER_255_2.cloverRec.CT[6679]!=0|true)) || (++__CLOVER_255_2.cloverRec.CF[6679]==0&false)); i++) {{
				__CLOVER_255_2.cloverRec.S[21815]++;if ((((attributes.getQName(i).equals("nom")) && (++__CLOVER_255_2.cloverRec.CT[6680]!=0|true)) || (++__CLOVER_255_2.cloverRec.CF[6680]==0&false))) {{
					__CLOVER_255_2.cloverRec.S[21816]++;nom = attributes.getValue(i);
					assert((((nom != "")) && (++__CLOVER_255_2.cloverRec.CT[6681]!=0|true)) || (++__CLOVER_255_2.cloverRec.CF[6681]==0&false));
				} }else {__CLOVER_255_2.cloverRec.S[21817]++;if ((((attributes.getQName(i).equals("nb_erreur")) && (++__CLOVER_255_2.cloverRec.CT[6682]!=0|true)) || (++__CLOVER_255_2.cloverRec.CF[6682]==0&false))) {{
					__CLOVER_255_2.cloverRec.S[21818]++;nb_erreur = convertie(attributes.getValue(i));
					assert((((nb_erreur >= 0)) && (++__CLOVER_255_2.cloverRec.CT[6683]!=0|true)) || (++__CLOVER_255_2.cloverRec.CF[6683]==0&false));
					//if(nb_e)
				}
			}}}
			}__CLOVER_255_2.cloverRec.S[21819]++;Fichier_test f, res[];

			/*System.out.println("pos("+locator.getLineNumber()+
				","+locator.getColumnNumber()+")="+nom+","+nb_erreur+","+
				attributes.getLength());*/
			//echo 
			assert((((nb_erreur >= 0)) && (++__CLOVER_255_2.cloverRec.CT[6684]!=0|true)) || (++__CLOVER_255_2.cloverRec.CF[6684]==0&false));
			assert((((nom != "")) && (++__CLOVER_255_2.cloverRec.CT[6685]!=0|true)) || (++__CLOVER_255_2.cloverRec.CF[6685]==0&false));
			__CLOVER_255_2.cloverRec.S[21820]++;f = new Fichier_test(nom, nb_erreur);
			__CLOVER_255_2.cloverRec.S[21821]++;if ((((resultat == null) && (++__CLOVER_255_2.cloverRec.CT[6686]!=0|true)) || (++__CLOVER_255_2.cloverRec.CF[6686]==0&false))) {{
				__CLOVER_255_2.cloverRec.S[21822]++;res = new Fichier_test[1];
			} }else {{
				__CLOVER_255_2.cloverRec.S[21823]++;res = new Fichier_test[resultat.length + 1];
				__CLOVER_255_2.cloverRec.S[21824]++;for (i = 0; (((i < resultat.length) && (++__CLOVER_255_2.cloverRec.CT[6687]!=0|true)) || (++__CLOVER_255_2.cloverRec.CF[6687]==0&false)); i++)
					{__CLOVER_255_2.cloverRec.S[21825]++;res[i] = resultat[i];
			}}
			}__CLOVER_255_2.cloverRec.S[21826]++;res[res.length - 1] = f;
			__CLOVER_255_2.cloverRec.S[21827]++;resultat = res;
			//System.out.println("Ajouter");
		} }else {{

		}
	}}}

	/** End element. */
	public void endElement(String uri, String localName, String qname)
		throws SAXException {__CLOVER_255_2.cloverRec.M[1515]++;

	}

	/** Skipped entity. */
	public void skippedEntity(String name) throws SAXException {__CLOVER_255_2.cloverRec.M[1516]++;

	}

	/** Ignorable whitespace. */
	public void ignorableWhitespace(char[] ch, int offset, int length)
		throws SAXException {__CLOVER_255_2.cloverRec.M[1517]++;

	}

	/** Characters. */
	public void characters(char[] ch, int offset, int length)
		throws SAXException {__CLOVER_255_2.cloverRec.M[1518]++;

	}

}