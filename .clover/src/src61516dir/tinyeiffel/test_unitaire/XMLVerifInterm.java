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

public class XMLVerifInterm {static class __CLOVER_264_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}

	public static void main(String args[]) {__CLOVER_264_0.cloverRec.M[1594]++;
		__CLOVER_264_0.cloverRec.S[22791]++;XMLVerifInterm p = new XMLVerifInterm();
		__CLOVER_264_0.cloverRec.S[22792]++;FichierVerifInterm[] res = p.parse("test\\verif_interm\\test.xml");
		__CLOVER_264_0.cloverRec.S[22793]++;if ((((res == null) && (++__CLOVER_264_0.cloverRec.CT[6955]!=0|true)) || (++__CLOVER_264_0.cloverRec.CF[6955]==0&false))) {{
			__CLOVER_264_0.cloverRec.S[22794]++;System.out.println("Rien de trouve");
		} }else {{
			__CLOVER_264_0.cloverRec.S[22795]++;System.out.println("R\u00e9ussi");
		}
	}}

	public FichierVerifInterm[] parse(String xmlFile) {__CLOVER_264_0.cloverRec.M[1595]++;
		//String xmlFile = "file:///xerces-2_5_0/data/personal.xml"; 
		__CLOVER_264_0.cloverRec.S[22796]++;try {
			__CLOVER_264_0.cloverRec.S[22797]++;SAXParserFactory factory = SAXParserFactory.newInstance();
			__CLOVER_264_0.cloverRec.S[22798]++;SAXParser parser = factory.newSAXParser();
			__CLOVER_264_0.cloverRec.S[22799]++;DefaultHandler handler = new TDefaultHandler2();

			__CLOVER_264_0.cloverRec.S[22800]++;ErrorHandler error_handler = new TErrorHandler2();

			__CLOVER_264_0.cloverRec.S[22801]++;parser.getXMLReader().setErrorHandler(error_handler);
			//parser.setFeature("http://xml.org/sax/features/validation",false);
			//parser.setFeature("http://xml.org/sax/features/namespaces",false);
			__CLOVER_264_0.cloverRec.S[22802]++;System.out.println("Parsing...");
			__CLOVER_264_0.cloverRec.S[22803]++;parser.parse(xmlFile, handler);
			__CLOVER_264_0.cloverRec.S[22804]++;System.out.println("Termin\u00e9");
			__CLOVER_264_0.cloverRec.S[22805]++;FichierVerifInterm f[] = ((TDefaultHandler2) handler).resultat;
			__CLOVER_264_0.cloverRec.S[22806]++;if ((((f == null) && (++__CLOVER_264_0.cloverRec.CT[6956]!=0|true)) || (++__CLOVER_264_0.cloverRec.CF[6956]==0&false)))
				{__CLOVER_264_0.cloverRec.S[22807]++;System.out.println("null");
			}else
				{__CLOVER_264_0.cloverRec.S[22808]++;System.out.println("length:" + f.length);
			}__CLOVER_264_0.cloverRec.S[22809]++;return f;
		} catch (FactoryConfigurationError e) {
			// unable to get a document builder factory
			__CLOVER_264_0.cloverRec.S[22810]++;System.out.println(
				"Erreur: pb avec le document builder factory("
					+ e.getMessage()
					+ ")");
		} catch (ParserConfigurationException e) {
			// parser was unable to be configured
			__CLOVER_264_0.cloverRec.S[22811]++;System.out.println(
				"Erreur: pb avec la configuration(" + e.getMessage() + ")");
		} catch (SAXException e) {
			// parsing error
			__CLOVER_264_0.cloverRec.S[22812]++;System.out.println(
				"Erreur: erreur de parsing(" + e.getMessage() + ")");
		} catch (IOException e) {
			// i/o error
			__CLOVER_264_0.cloverRec.S[22813]++;System.out.println(
				"Erreur: erreur d'entr\u00e9e sortie(" + e.getMessage() + ")");
		}
		__CLOVER_264_0.cloverRec.S[22814]++;return null;
	}

}

class TErrorHandler2 implements ErrorHandler {static class __CLOVER_264_1{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}
	public void warning(SAXParseException e) throws SAXException {__CLOVER_264_1.cloverRec.M[1596]++;
		__CLOVER_264_1.cloverRec.S[22815]++;System.err.println(
			"[warning] \n"
				+ " Ligne   : "
				+ e.getLineNumber()
				+ "\n"
				+ " URI     : "
				+ e.getSystemId()
				+ "\n"
				+ " Message : "
				+ e.getMessage());
		__CLOVER_264_1.cloverRec.S[22816]++;throw new SAXException("un avertissement a eu lieu");
	}

	public void error(SAXParseException e) throws SAXException {__CLOVER_264_1.cloverRec.M[1597]++;
		__CLOVER_264_1.cloverRec.S[22817]++;System.err.println(
			"[error] \n"
				+ " Ligne   : "
				+ e.getLineNumber()
				+ "\n"
				+ " URI     : "
				+ e.getSystemId()
				+ "\n"
				+ " Message : "
				+ e.getMessage());
		__CLOVER_264_1.cloverRec.S[22818]++;throw new SAXException("une erreur a eu lieu");
	}

	public void fatalError(SAXParseException e) throws SAXException {__CLOVER_264_1.cloverRec.M[1598]++;
		__CLOVER_264_1.cloverRec.S[22819]++;System.err.println(
			"[fatal error] \n"
				+ " Ligne   : "
				+ e.getLineNumber()
				+ "\n"
				+ " URI     : "
				+ e.getSystemId()
				+ "\n"
				+ " Message : "
				+ e.getMessage());
		__CLOVER_264_1.cloverRec.S[22820]++;throw new SAXException("une erreur fatale a eu lieu");
	}
}

class TDefaultHandler2 extends DefaultHandler {static class __CLOVER_264_2{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}
	private Locator locator;
	protected boolean dans_erreur=false;

	public FichierVerifInterm[] resultat;

	public void setDocumentLocator(Locator locator) {__CLOVER_264_2.cloverRec.M[1599]++;
		__CLOVER_264_2.cloverRec.S[22821]++;this.locator = locator;
	}

	/** Start document. */
	public void startDocument() throws SAXException {__CLOVER_264_2.cloverRec.M[1600]++;
		__CLOVER_264_2.cloverRec.S[22822]++;System.out.println("Debut du document");
		__CLOVER_264_2.cloverRec.S[22823]++;dans_erreur=false;
	}

	/** Processing instruction. */
	public void processingInstruction(String target, String data)
		throws SAXException {__CLOVER_264_2.cloverRec.M[1601]++;

	}

	/** End document. */
	public void endDocument() throws SAXException {__CLOVER_264_2.cloverRec.M[1602]++;
		__CLOVER_264_2.cloverRec.S[22824]++;System.out.println("Fin du document");
	}

	/** Start prefix mapping. */
	public void startPrefixMapping(String prefix, String uri)
		throws SAXException {__CLOVER_264_2.cloverRec.M[1603]++;

	}

	/** End prefix mapping. */
	public void endPrefixMapping(String prefix) throws SAXException {__CLOVER_264_2.cloverRec.M[1604]++;

	}

	public int convertie(String str) {__CLOVER_264_2.cloverRec.M[1605]++;
		__CLOVER_264_2.cloverRec.S[22825]++;try {
			__CLOVER_264_2.cloverRec.S[22826]++;int i = Integer.parseInt(str, 10);
			__CLOVER_264_2.cloverRec.S[22827]++;return i;
		} catch (NumberFormatException e) {

		}
		__CLOVER_264_2.cloverRec.S[22828]++;return -1;
	}

	/** Start element. */
	public void startElement(
		String uri,
		String localName,
		String qname,
		Attributes attributes)
		throws SAXException {__CLOVER_264_2.cloverRec.M[1606]++;
		//System.out.println("Element:"+localName+"!"+qname);
		__CLOVER_264_2.cloverRec.S[22829]++;if ((((qname.equals("root")) && (++__CLOVER_264_2.cloverRec.CT[6957]!=0|true)) || (++__CLOVER_264_2.cloverRec.CF[6957]==0&false))) {{
			//System.out.println("root");
		} }else {__CLOVER_264_2.cloverRec.S[22830]++;if ((((qname.equals("test")) && (++__CLOVER_264_2.cloverRec.CT[6958]!=0|true)) || (++__CLOVER_264_2.cloverRec.CF[6958]==0&false))) {{
			__CLOVER_264_2.cloverRec.S[22831]++;int nb_erreur = 0, i;
			__CLOVER_264_2.cloverRec.S[22832]++;String nom = "";
			//dans_erreur=true;
			__CLOVER_264_2.cloverRec.S[22833]++;for (i = 0; (((i < attributes.getLength()) && (++__CLOVER_264_2.cloverRec.CT[6959]!=0|true)) || (++__CLOVER_264_2.cloverRec.CF[6959]==0&false)); i++) {{
				__CLOVER_264_2.cloverRec.S[22834]++;if ((((attributes.getQName(i).equals("nom")) && (++__CLOVER_264_2.cloverRec.CT[6960]!=0|true)) || (++__CLOVER_264_2.cloverRec.CF[6960]==0&false))) {{
					__CLOVER_264_2.cloverRec.S[22835]++;nom = attributes.getValue(i);
					assert((((nom != "")) && (++__CLOVER_264_2.cloverRec.CT[6961]!=0|true)) || (++__CLOVER_264_2.cloverRec.CF[6961]==0&false));
				} }else {__CLOVER_264_2.cloverRec.S[22836]++;if ((((attributes.getQName(i).equals("nb_erreur")) && (++__CLOVER_264_2.cloverRec.CT[6962]!=0|true)) || (++__CLOVER_264_2.cloverRec.CF[6962]==0&false))) {{
					__CLOVER_264_2.cloverRec.S[22837]++;nb_erreur = convertie(attributes.getValue(i));
					assert((((nb_erreur >= 0)) && (++__CLOVER_264_2.cloverRec.CT[6963]!=0|true)) || (++__CLOVER_264_2.cloverRec.CF[6963]==0&false));
					//if(nb_e)
				}
				}else
				{{
					assert((((false)) && (++__CLOVER_264_2.cloverRec.CT[6964]!=0|true)) || (++__CLOVER_264_2.cloverRec.CF[6964]==0&false)):"attribut inconnue:"+attributes.getValue(i);
				}
			}}}
			}__CLOVER_264_2.cloverRec.S[22838]++;FichierVerifInterm f, res[];

			/*System.out.println("pos("+locator.getLineNumber()+
				","+locator.getColumnNumber()+")="+nom+","+nb_erreur+","+
				attributes.getLength());*/
			//echo 
			assert((((nb_erreur >= 0)) && (++__CLOVER_264_2.cloverRec.CT[6965]!=0|true)) || (++__CLOVER_264_2.cloverRec.CF[6965]==0&false));
			assert((((nom != "")) && (++__CLOVER_264_2.cloverRec.CT[6966]!=0|true)) || (++__CLOVER_264_2.cloverRec.CF[6966]==0&false));
			__CLOVER_264_2.cloverRec.S[22839]++;f = new FichierVerifInterm(nom);
			__CLOVER_264_2.cloverRec.S[22840]++;if ((((resultat == null) && (++__CLOVER_264_2.cloverRec.CT[6967]!=0|true)) || (++__CLOVER_264_2.cloverRec.CF[6967]==0&false))) {{
				__CLOVER_264_2.cloverRec.S[22841]++;res = new FichierVerifInterm[1];
			} }else {{
				__CLOVER_264_2.cloverRec.S[22842]++;res = new FichierVerifInterm[resultat.length + 1];
				__CLOVER_264_2.cloverRec.S[22843]++;for (i = 0; (((i < resultat.length) && (++__CLOVER_264_2.cloverRec.CT[6968]!=0|true)) || (++__CLOVER_264_2.cloverRec.CF[6968]==0&false)); i++)
					{__CLOVER_264_2.cloverRec.S[22844]++;res[i] = resultat[i];
			}}
			}__CLOVER_264_2.cloverRec.S[22845]++;res[res.length - 1] = f;
			__CLOVER_264_2.cloverRec.S[22846]++;resultat = res;
			//System.out.println("Ajouter");
		} }else {__CLOVER_264_2.cloverRec.S[22847]++;if ((((qname.equals("erreur")) && (++__CLOVER_264_2.cloverRec.CT[6969]!=0|true)) || (++__CLOVER_264_2.cloverRec.CF[6969]==0&false))) {{
			__CLOVER_264_2.cloverRec.S[22848]++;dans_erreur=true;
			assert((((attributes.getLength()==0)) && (++__CLOVER_264_2.cloverRec.CT[6970]!=0|true)) || (++__CLOVER_264_2.cloverRec.CF[6970]==0&false));
		} }else {{

		}
	}}}}

	/** End element. */
	public void endElement(String uri, String localName, String qname)
		throws SAXException {__CLOVER_264_2.cloverRec.M[1607]++;
		__CLOVER_264_2.cloverRec.S[22849]++;if((((qname.equals("erreur")) && (++__CLOVER_264_2.cloverRec.CT[6971]!=0|true)) || (++__CLOVER_264_2.cloverRec.CF[6971]==0&false)))
		{{
			__CLOVER_264_2.cloverRec.S[22850]++;dans_erreur=false;
		}
	}}

	/** Skipped entity. */
	public void skippedEntity(String name) throws SAXException {__CLOVER_264_2.cloverRec.M[1608]++;

	}

	/** Ignorable whitespace. */
	public void ignorableWhitespace(char[] ch, int offset, int length)
		throws SAXException {__CLOVER_264_2.cloverRec.M[1609]++;

	}

	/** Characters. */
	public void characters(char[] ch, int offset, int length)
		throws SAXException {__CLOVER_264_2.cloverRec.M[1610]++;
		__CLOVER_264_2.cloverRec.S[22851]++;if((((dans_erreur) && (++__CLOVER_264_2.cloverRec.CT[6972]!=0|true)) || (++__CLOVER_264_2.cloverRec.CF[6972]==0&false)))
		{{
			__CLOVER_264_2.cloverRec.S[22852]++;String s=new String(ch,offset,length),tab[];
			__CLOVER_264_2.cloverRec.S[22853]++;FichierVerifInterm f;
			__CLOVER_264_2.cloverRec.S[22854]++;int i;
			__CLOVER_264_2.cloverRec.S[22855]++;f=resultat[resultat.length-1];
			__CLOVER_264_2.cloverRec.S[22856]++;if((((f.MsgErreur==null) && (++__CLOVER_264_2.cloverRec.CT[6973]!=0|true)) || (++__CLOVER_264_2.cloverRec.CF[6973]==0&false)))
			{{
				__CLOVER_264_2.cloverRec.S[22857]++;tab=new String[1];
				__CLOVER_264_2.cloverRec.S[22858]++;tab[0]=s;
				__CLOVER_264_2.cloverRec.S[22859]++;f.MsgErreur=tab;
			}
			}else
			{{
				__CLOVER_264_2.cloverRec.S[22860]++;tab=new String[f.MsgErreur.length+1];
				__CLOVER_264_2.cloverRec.S[22861]++;for(i=0;(((i<f.MsgErreur.length) && (++__CLOVER_264_2.cloverRec.CT[6974]!=0|true)) || (++__CLOVER_264_2.cloverRec.CF[6974]==0&false));i++)
				{{
					__CLOVER_264_2.cloverRec.S[22862]++;tab[i]=f.MsgErreur[i];
				}
				}__CLOVER_264_2.cloverRec.S[22863]++;tab[i]=s;
				__CLOVER_264_2.cloverRec.S[22864]++;f.MsgErreur=tab;
			}
			//f.MsgErreur=s;
		}}
	}}

}