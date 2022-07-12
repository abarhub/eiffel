/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ *//*
 * Created on 23 janv. 2004
 *
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 * TODO : ne plus utiliser antlr
 */
package tinyeiffel.test_unitaire;

import junit.framework.*;
import tinyeiffel.compiler.*;
import tinyeiffel.ast.*;
import java.util.*;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import java.io.*;
//import antlr.CommonAST;
//import antlr.collections.AST;
//import antlr.DumpASTVisitor;
import antlr.RecognitionException;
import antlr.TokenStreamException;
import antlr.TokenStreamRecognitionException;
import tinyeiffel.erreur.*;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.FactoryConfigurationError;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import org.w3c.dom.*;

//import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

//import javax.xml.parsers.FactoryConfigurationError;
//import javax.xml.parsers.ParserConfigurationException;
//import javax.xml.parsers.DocumentBuilderFactory;
//import javax.xml.parsers.DocumentBuilder;


/**
 * @author BARRET
 *
 * To change the template for this generated type comment go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
public class TestType extends TestCase {static class __CLOVER_259_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}

	/**
	 * Constructor for TestType.
	 * @param arg0
	 */
	public TestType(String arg0) {
		super(arg0);__CLOVER_259_0.cloverRec.S[22007]++;__CLOVER_259_0.cloverRec.M[1535]++;
	}

	public static void main(String[] args) {__CLOVER_259_0.cloverRec.M[1536]++;
		__CLOVER_259_0.cloverRec.S[22008]++;junit.textui.TestRunner.run(TestType.class);
	}

	protected Logger logger;
	protected FileHandler fh;
	
	protected void setUp()
	{__CLOVER_259_0.cloverRec.M[1537]++;
		__CLOVER_259_0.cloverRec.S[22009]++;logger=Logger.getLogger("tinyeiffel.test.testType");
		__CLOVER_259_0.cloverRec.S[22010]++;if((((fh==null) && (++__CLOVER_259_0.cloverRec.CT[6726]!=0|true)) || (++__CLOVER_259_0.cloverRec.CF[6726]==0&false)))
		{{
			__CLOVER_259_0.cloverRec.S[22011]++;try {
				__CLOVER_259_0.cloverRec.S[22012]++;fh = new FileHandler("test_type.log");
				__CLOVER_259_0.cloverRec.S[22013]++;fh.setFormatter(new SimpleFormatter());
				__CLOVER_259_0.cloverRec.S[22014]++;logger.addHandler(fh);
			}
			catch(IOException e)
			{
				__CLOVER_259_0.cloverRec.S[22015]++;System.err.println(e);
				__CLOVER_259_0.cloverRec.S[22016]++;e.printStackTrace();
				assert((((false)) && (++__CLOVER_259_0.cloverRec.CT[6727]!=0|true)) || (++__CLOVER_259_0.cloverRec.CF[6727]==0&false));
			}
		}
		// Request that every detail gets logged.
		}__CLOVER_259_0.cloverRec.S[22017]++;logger.setLevel(Level.ALL);
        // Log a simple INFO message.
        __CLOVER_259_0.cloverRec.S[22018]++;logger.info("Demarrage du log");
	}

	protected void tearDown() throws Exception {__CLOVER_259_0.cloverRec.M[1538]++;
		__CLOVER_259_0.cloverRec.S[22019]++;super.tearDown();
		__CLOVER_259_0.cloverRec.S[22020]++;logger.info("Tests Finis");
		__CLOVER_259_0.cloverRec.S[22021]++;if((((fh!=null) && (++__CLOVER_259_0.cloverRec.CT[6728]!=0|true)) || (++__CLOVER_259_0.cloverRec.CF[6728]==0&false)))
		{{
			__CLOVER_259_0.cloverRec.S[22022]++;logger.removeHandler(fh);
			__CLOVER_259_0.cloverRec.S[22023]++;fh.close();
		}
	}}

	/*public void testType()
	{
		Compiler_Eiffel compiler;
		Table_Symbol t1;
		Type de,ancetre;
		int no;
		//assert(false);
		System.out.println("Test des types");
		compiler=new Compiler_Eiffel(Compiler_Eiffel.apres_context);
		//de=new Type(false,"TEST1",new Vector());
		de=parse_type("(TEST1)",compiler);
		ancetre=new Type(false,"TEST1",new Vector());
		no=compiler.compile("test\\context\\conformite\\generique\\test1.ace");
		assert(no==0):"no="+no;
		t1=compiler.context.donne_table_symbol(de);
		assert(compiler.context.type_compatible(de,t1,ancetre,t1));
		System.out.println("Fin de test des types");
	}*/
	
	protected boolean verifie(String nom,Compiler_Eiffel compiler,
						String de,String ancetre,boolean conforme,
						String classe)
	{__CLOVER_259_0.cloverRec.M[1539]++;
		//Compiler_Eiffel compiler;
		__CLOVER_259_0.cloverRec.S[22024]++;Table_Symbol t1;
		__CLOVER_259_0.cloverRec.S[22025]++;Type type_de,type_ancetre,type_lieu;
		__CLOVER_259_0.cloverRec.S[22026]++;int no;
		__CLOVER_259_0.cloverRec.S[22027]++;Classe cl;
		__CLOVER_259_0.cloverRec.S[22028]++;boolean res;
		assert((((nom!=null)) && (++__CLOVER_259_0.cloverRec.CT[6729]!=0|true)) || (++__CLOVER_259_0.cloverRec.CF[6729]==0&false));
		assert((((compiler!=null)) && (++__CLOVER_259_0.cloverRec.CT[6730]!=0|true)) || (++__CLOVER_259_0.cloverRec.CF[6730]==0&false));
		assert((((de!=null)) && (++__CLOVER_259_0.cloverRec.CT[6731]!=0|true)) || (++__CLOVER_259_0.cloverRec.CF[6731]==0&false));
		assert((((ancetre!=null)) && (++__CLOVER_259_0.cloverRec.CT[6732]!=0|true)) || (++__CLOVER_259_0.cloverRec.CF[6732]==0&false));
		//assert(classe!=null);
		__CLOVER_259_0.cloverRec.S[22029]++;System.out.println("Verif:"+de+"->"+ancetre+"="+conforme+" ("+nom+")");
		//compiler=new Compiler_Eiffel(Compiler_Eiffel.apres_context);
		//de=new Type(false,"TEST1",new Vector());
		__CLOVER_259_0.cloverRec.S[22030]++;if((((classe==null) && (++__CLOVER_259_0.cloverRec.CT[6733]!=0|true)) || (++__CLOVER_259_0.cloverRec.CF[6733]==0&false)))
			{__CLOVER_259_0.cloverRec.S[22031]++;classe=de;
		}__CLOVER_259_0.cloverRec.S[22032]++;type_de=parse_type("("+de+")",compiler);
		__CLOVER_259_0.cloverRec.S[22033]++;System.out.println("type_de1="+type_de.toString2());
		__CLOVER_259_0.cloverRec.S[22034]++;type_ancetre=parse_type("("+ancetre+")",compiler);
		__CLOVER_259_0.cloverRec.S[22035]++;type_lieu=parse_type("("+classe+")",compiler);
		//no=compiler.compile("test\\context\\conformite\\generique\\test1.ace");
		//assert(no==0):"no="+no;
		__CLOVER_259_0.cloverRec.S[22036]++;t1=compiler.context.donne_table_symbol(type_lieu);
		__CLOVER_259_0.cloverRec.S[22037]++;System.out.println("type_de2="+type_de.toString2());
		__CLOVER_259_0.cloverRec.S[22038]++;cl=compiler.context.cherche_classe(type_lieu);
		__CLOVER_259_0.cloverRec.S[22039]++;compiler.env.entre_classe(cl,t1);
		__CLOVER_259_0.cloverRec.S[22040]++;res=compiler.context.type_compatible(type_de,t1,type_ancetre,t1);
		__CLOVER_259_0.cloverRec.S[22041]++;compiler.env.sort_classe();
		__CLOVER_259_0.cloverRec.S[22042]++;System.out.println("Fin Verif types ("+res+")");
		__CLOVER_259_0.cloverRec.S[22043]++;return res;
	}
	
	protected boolean verifie_expr(String nom,Compiler_Eiffel compiler,
							String de,String ancetre,boolean conforme,
							String classe,String nom_feature,boolean dans_corps)
	{__CLOVER_259_0.cloverRec.M[1540]++;
		//Compiler_Eiffel compiler;
		__CLOVER_259_0.cloverRec.S[22044]++;Table_Symbol t1;
		__CLOVER_259_0.cloverRec.S[22045]++;Type /*type_de,type_ancetre,*/type_lieu;
		__CLOVER_259_0.cloverRec.S[22046]++;int no;
		__CLOVER_259_0.cloverRec.S[22047]++;boolean res;
		__CLOVER_259_0.cloverRec.S[22048]++;NomFeature nfeature=null;
		__CLOVER_259_0.cloverRec.S[22049]++;Expr expr=null;
		__CLOVER_259_0.cloverRec.S[22050]++;Feature f=null;
		__CLOVER_259_0.cloverRec.S[22051]++;Classe cl=null;
		__CLOVER_259_0.cloverRec.S[22052]++;DeclareVar cible;
		assert((((nom!=null)) && (++__CLOVER_259_0.cloverRec.CT[6734]!=0|true)) || (++__CLOVER_259_0.cloverRec.CF[6734]==0&false));
		assert((((compiler!=null)) && (++__CLOVER_259_0.cloverRec.CT[6735]!=0|true)) || (++__CLOVER_259_0.cloverRec.CF[6735]==0&false));
		assert((((de!=null)) && (++__CLOVER_259_0.cloverRec.CT[6736]!=0|true)) || (++__CLOVER_259_0.cloverRec.CF[6736]==0&false));
		assert((((ancetre!=null)) && (++__CLOVER_259_0.cloverRec.CT[6737]!=0|true)) || (++__CLOVER_259_0.cloverRec.CF[6737]==0&false));
		//assert(classe!=null);
		__CLOVER_259_0.cloverRec.S[22053]++;System.out.println("Verif:"+de+"->"+ancetre+"="+conforme+" ("+nom+")");
		//compiler=new Compiler_Eiffel(Compiler_Eiffel.apres_context);
		//de=new Type(false,"TEST1",new Vector());
		__CLOVER_259_0.cloverRec.S[22054]++;if((((classe==null) && (++__CLOVER_259_0.cloverRec.CT[6738]!=0|true)) || (++__CLOVER_259_0.cloverRec.CF[6738]==0&false)))
			{__CLOVER_259_0.cloverRec.S[22055]++;classe=de;
		//type_de=parse_type("("+de+")",compiler);
		}__CLOVER_259_0.cloverRec.S[22056]++;expr=parse_expr("("+de+")",compiler);
		assert((((expr!=null)) && (++__CLOVER_259_0.cloverRec.CT[6739]!=0|true)) || (++__CLOVER_259_0.cloverRec.CF[6739]==0&false)):"expr="+expr;
		__CLOVER_259_0.cloverRec.S[22057]++;System.out.println("type_de1="+expr.toString());
		__CLOVER_259_0.cloverRec.S[22058]++;cible=parse_declare_var(ancetre,compiler);
		assert((((cible!=null)) && (++__CLOVER_259_0.cloverRec.CT[6740]!=0|true)) || (++__CLOVER_259_0.cloverRec.CF[6740]==0&false)):"ancetre="+ancetre;
		__CLOVER_259_0.cloverRec.S[22059]++;type_lieu=parse_type("("+classe+")",compiler);
		__CLOVER_259_0.cloverRec.S[22060]++;if((((nom_feature!=null) && (++__CLOVER_259_0.cloverRec.CT[6741]!=0|true)) || (++__CLOVER_259_0.cloverRec.CF[6741]==0&false)))
			{__CLOVER_259_0.cloverRec.S[22061]++;nfeature=parse_nom_feature("("+nom_feature+")",compiler);
		}__CLOVER_259_0.cloverRec.S[22062]++;expr=parse_expr("("+de+")",compiler);
		//no=compiler.compile("test\\context\\conformite\\generique\\test1.ace");
		//assert(no==0):"no="+no;
		__CLOVER_259_0.cloverRec.S[22063]++;t1=compiler.context.donne_table_symbol(type_lieu);
		__CLOVER_259_0.cloverRec.S[22064]++;cl=compiler.context.cherche_classe(type_lieu);
		__CLOVER_259_0.cloverRec.S[22065]++;if((((nfeature!=null) && (++__CLOVER_259_0.cloverRec.CT[6742]!=0|true)) || (++__CLOVER_259_0.cloverRec.CF[6742]==0&false)))
			{__CLOVER_259_0.cloverRec.S[22066]++;f=t1.donne_attribut(nfeature).getFeature();
		}__CLOVER_259_0.cloverRec.S[22067]++;System.out.println("type_de2="+expr.toString());
		__CLOVER_259_0.cloverRec.S[22068]++;compiler.env.entre_classe(cl,t1);
		__CLOVER_259_0.cloverRec.S[22069]++;if((((f!=null) && (++__CLOVER_259_0.cloverRec.CT[6743]!=0|true)) || (++__CLOVER_259_0.cloverRec.CF[6743]==0&false)))
			{__CLOVER_259_0.cloverRec.S[22070]++;compiler.env.entre_feature(f);
		}__CLOVER_259_0.cloverRec.S[22071]++;compiler.verifie_expr(compiler.context,expr,true);
		__CLOVER_259_0.cloverRec.S[22072]++;res=compiler.context.type_compatible(expr,t1,cible,t1);
		__CLOVER_259_0.cloverRec.S[22073]++;if((((f!=null) && (++__CLOVER_259_0.cloverRec.CT[6744]!=0|true)) || (++__CLOVER_259_0.cloverRec.CF[6744]==0&false)))
			{__CLOVER_259_0.cloverRec.S[22074]++;compiler.env.sort_feature();
		}__CLOVER_259_0.cloverRec.S[22075]++;compiler.env.sort_classe();
		__CLOVER_259_0.cloverRec.S[22076]++;System.out.println("Fin Verif types ("+res+")");
		__CLOVER_259_0.cloverRec.S[22077]++;return res;
	}
	
	public void testType2()
	{__CLOVER_259_0.cloverRec.M[1541]++;
		/*Compiler_Eiffel compiler;
		Table_Symbol t1;
		Type de,ancetre;
		int no;*/
		__CLOVER_259_0.cloverRec.S[22078]++;logger.info("Test type 2");
		__CLOVER_259_0.cloverRec.S[22079]++;Element elt=donne_liste_conformite("test_unitaire\\conforme.xml");
		assert((((elt!=null)) && (++__CLOVER_259_0.cloverRec.CT[6745]!=0|true)) || (++__CLOVER_259_0.cloverRec.CF[6745]==0&false));
		assert((((elt.getNodeName() == "liste_testes")) && (++__CLOVER_259_0.cloverRec.CT[6746]!=0|true)) || (++__CLOVER_259_0.cloverRec.CF[6746]==0&false));
		__CLOVER_259_0.cloverRec.S[22080]++;NodeList liste_conformite = elt.getChildNodes();
		__CLOVER_259_0.cloverRec.S[22081]++;Compiler_Eiffel compiler;
		__CLOVER_259_0.cloverRec.S[22082]++;int i,i0;
		__CLOVER_259_0.cloverRec.S[22083]++;for (i0 = 0; (((i0 < liste_conformite.getLength()) && (++__CLOVER_259_0.cloverRec.CT[6747]!=0|true)) || (++__CLOVER_259_0.cloverRec.CF[6747]==0&false)); i0++) {{
			__CLOVER_259_0.cloverRec.S[22084]++;Node n0 = liste_conformite.item(i0);
			__CLOVER_259_0.cloverRec.S[22085]++;System.out.println("element=" + n0.getNodeName()+"======================================================");
			__CLOVER_259_0.cloverRec.S[22086]++;if ((((n0 instanceof Element) && (++__CLOVER_259_0.cloverRec.CT[6748]!=0|true)) || (++__CLOVER_259_0.cloverRec.CF[6748]==0&false))) {{
				__CLOVER_259_0.cloverRec.S[22087]++;if ((((n0.getNodeName() == "conformite") && (++__CLOVER_259_0.cloverRec.CT[6749]!=0|true)) || (++__CLOVER_259_0.cloverRec.CF[6749]==0&false))) {{
					//System.out.println("heritage");
					//h = creer_heritage((Element) n);
					__CLOVER_259_0.cloverRec.S[22088]++;NamedNodeMap attributs = n0.getAttributes();
					__CLOVER_259_0.cloverRec.S[22089]++;String nom = null;
					__CLOVER_259_0.cloverRec.S[22090]++;int nb_erreur=0;
					__CLOVER_259_0.cloverRec.S[22091]++;for (i = 0; (((i < attributs.getLength()) && (++__CLOVER_259_0.cloverRec.CT[6750]!=0|true)) || (++__CLOVER_259_0.cloverRec.CF[6750]==0&false)); i++) {{
						__CLOVER_259_0.cloverRec.S[22092]++;Node num\u00e9ro = attributs.item(i);
						__CLOVER_259_0.cloverRec.S[22093]++;String nomAttribut = num\u00e9ro.getNodeName();
						__CLOVER_259_0.cloverRec.S[22094]++;String valeurAttribut = num\u00e9ro.getNodeValue();
						//System.out.println(nomAttribut + " =\"" + valeurAttribut + "\"");
						__CLOVER_259_0.cloverRec.S[22095]++;if ((((nomAttribut == "nom") && (++__CLOVER_259_0.cloverRec.CT[6751]!=0|true)) || (++__CLOVER_259_0.cloverRec.CF[6751]==0&false)))
							{__CLOVER_259_0.cloverRec.S[22096]++;nom = valeurAttribut;
						}else {__CLOVER_259_0.cloverRec.S[22097]++;if ((((nomAttribut == "nb_erreur") && (++__CLOVER_259_0.cloverRec.CT[6752]!=0|true)) || (++__CLOVER_259_0.cloverRec.CF[6752]==0&false)))
						{{
							__CLOVER_259_0.cloverRec.S[22098]++;try{
								__CLOVER_259_0.cloverRec.S[22099]++;nb_erreur = Integer.parseInt(valeurAttribut);
							}
							catch(NumberFormatException e)
							{
								assert((((false)) && (++__CLOVER_259_0.cloverRec.CT[6753]!=0|true)) || (++__CLOVER_259_0.cloverRec.CF[6753]==0&false)):"e="+e;
							}
						}
						}else
							{assert((((false)) && (++__CLOVER_259_0.cloverRec.CT[6754]!=0|true)) || (++__CLOVER_259_0.cloverRec.CF[6754]==0&false)):nomAttribut+"="+valeurAttribut;
					}}}
					}__CLOVER_259_0.cloverRec.S[22100]++;compiler=new Compiler_Eiffel(Compiler_Eiffel.apres_context);
					__CLOVER_259_0.cloverRec.S[22101]++;int no=compiler.compile(nom);
					__CLOVER_259_0.cloverRec.S[22102]++;if((((no!=nb_erreur) && (++__CLOVER_259_0.cloverRec.CT[6755]!=0|true)) || (++__CLOVER_259_0.cloverRec.CF[6755]==0&false)))
					{{
						__CLOVER_259_0.cloverRec.S[22103]++;compiler.logging.affiche();
						__CLOVER_259_0.cloverRec.S[22104]++;if((((no!=nb_erreur) && (++__CLOVER_259_0.cloverRec.CT[6756]!=0|true)) || (++__CLOVER_259_0.cloverRec.CF[6756]==0&false)))
						{{
							__CLOVER_259_0.cloverRec.S[22105]++;logger.severe("no="+no+"!="+nb_erreur+
										"("+compiler.logging+")");
							__CLOVER_259_0.cloverRec.S[22106]++;assertTrue(no==nb_erreur);
						}
						//assert(no==nb_erreur):"no="+no+"!="+nb_erreur+
						//				"("+compiler.logging+")";
					}}
					}__CLOVER_259_0.cloverRec.S[22107]++;NodeList liste_test=n0.getChildNodes();
					__CLOVER_259_0.cloverRec.S[22108]++;for(int j=0;(((j<liste_test.getLength()) && (++__CLOVER_259_0.cloverRec.CT[6757]!=0|true)) || (++__CLOVER_259_0.cloverRec.CF[6757]==0&false));j++)
					{{
						__CLOVER_259_0.cloverRec.S[22109]++;Node n=liste_test.item(j);
						__CLOVER_259_0.cloverRec.S[22110]++;if ((((n instanceof Element) && (++__CLOVER_259_0.cloverRec.CT[6758]!=0|true)) || (++__CLOVER_259_0.cloverRec.CF[6758]==0&false))) {{
							__CLOVER_259_0.cloverRec.S[22111]++;if ((((n.getNodeName() == "test") && (++__CLOVER_259_0.cloverRec.CT[6759]!=0|true)) || (++__CLOVER_259_0.cloverRec.CF[6759]==0&false))) {{
								//System.out.println("heritage");
								//h = creer_heritage((Element) n);
								__CLOVER_259_0.cloverRec.S[22112]++;NamedNodeMap attr = n.getAttributes();
								__CLOVER_259_0.cloverRec.S[22113]++;String de = null,ancetre=null,classe=null;
								__CLOVER_259_0.cloverRec.S[22114]++;Type nom_classe = null;
								__CLOVER_259_0.cloverRec.S[22115]++;boolean conforme = false,res;
								__CLOVER_259_0.cloverRec.S[22116]++;for (i = 0; (((i < attr.getLength()) && (++__CLOVER_259_0.cloverRec.CT[6760]!=0|true)) || (++__CLOVER_259_0.cloverRec.CF[6760]==0&false)); i++) {{
									__CLOVER_259_0.cloverRec.S[22117]++;Node num\u00e9ro = attr.item(i);
									__CLOVER_259_0.cloverRec.S[22118]++;String nomAttribut = num\u00e9ro.getNodeName();
									__CLOVER_259_0.cloverRec.S[22119]++;String valeurAttribut = num\u00e9ro.getNodeValue();
									//System.out.println(nomAttribut + " =\"" + valeurAttribut + "\"");
									__CLOVER_259_0.cloverRec.S[22120]++;if ((((nomAttribut == "de") && (++__CLOVER_259_0.cloverRec.CT[6761]!=0|true)) || (++__CLOVER_259_0.cloverRec.CF[6761]==0&false)))
										{__CLOVER_259_0.cloverRec.S[22121]++;de = valeurAttribut;
									}else {__CLOVER_259_0.cloverRec.S[22122]++;if ((((nomAttribut == "ancetre") && (++__CLOVER_259_0.cloverRec.CT[6762]!=0|true)) || (++__CLOVER_259_0.cloverRec.CF[6762]==0&false)))
										{__CLOVER_259_0.cloverRec.S[22123]++;ancetre = valeurAttribut;
									}else {__CLOVER_259_0.cloverRec.S[22124]++;if ((((nomAttribut == "conforme") && (++__CLOVER_259_0.cloverRec.CT[6763]!=0|true)) || (++__CLOVER_259_0.cloverRec.CF[6763]==0&false)))
										{__CLOVER_259_0.cloverRec.S[22125]++;conforme = (((valeurAttribut.compareToIgnoreCase("oui")==0) && (++__CLOVER_259_0.cloverRec.CT[6764]!=0|true)) || (++__CLOVER_259_0.cloverRec.CF[6764]==0&false))?true:false;
									}else {__CLOVER_259_0.cloverRec.S[22126]++;if ((((nomAttribut == "lieux") && (++__CLOVER_259_0.cloverRec.CT[6765]!=0|true)) || (++__CLOVER_259_0.cloverRec.CF[6765]==0&false)))
										{__CLOVER_259_0.cloverRec.S[22127]++;classe = valeurAttribut;
									}else
										{assert((((false)) && (++__CLOVER_259_0.cloverRec.CT[6766]!=0|true)) || (++__CLOVER_259_0.cloverRec.CF[6766]==0&false)):nomAttribut+"="+valeurAttribut;
								}}}}}
								}__CLOVER_259_0.cloverRec.S[22128]++;res=verifie(nom,compiler,de,ancetre,conforme,classe);
								__CLOVER_259_0.cloverRec.S[22129]++;if((((res!=conforme) && (++__CLOVER_259_0.cloverRec.CT[6767]!=0|true)) || (++__CLOVER_259_0.cloverRec.CF[6767]==0&false)))
								{{
									__CLOVER_259_0.cloverRec.S[22130]++;logger.severe("Type "+de+" "+(((((conforme)) && (++__CLOVER_259_0.cloverRec.CT[6768]!=0|true)) || (++__CLOVER_259_0.cloverRec.CF[6768]==0&false))?"pas":"")+
										" conforme a "+ancetre+" dans "+nom+
										"("+res+")");
									__CLOVER_259_0.cloverRec.S[22131]++;assertTrue(res==conforme);
								}
								/*assert(res==conforme):
										"Type "+de+" "+((conforme)?"pas":"")+
										" conforme a "+ancetre+" dans "+nom+
										"("+res+")";*/
							}}
							}else {__CLOVER_259_0.cloverRec.S[22132]++;if ((((n.getNodeName() == "test_expr") && (++__CLOVER_259_0.cloverRec.CT[6769]!=0|true)) || (++__CLOVER_259_0.cloverRec.CF[6769]==0&false))) {{
								//System.out.println("heritage");
								//h = creer_heritage((Element) n);
								__CLOVER_259_0.cloverRec.S[22133]++;NamedNodeMap attr = n.getAttributes();
								__CLOVER_259_0.cloverRec.S[22134]++;String de = null,ancetre=null,classe=null;
								__CLOVER_259_0.cloverRec.S[22135]++;String nom_feature=null;
								__CLOVER_259_0.cloverRec.S[22136]++;Type nom_classe = null;
								__CLOVER_259_0.cloverRec.S[22137]++;boolean conforme = false,res,dans_corps=false;
								__CLOVER_259_0.cloverRec.S[22138]++;for (i = 0; (((i < attr.getLength()) && (++__CLOVER_259_0.cloverRec.CT[6770]!=0|true)) || (++__CLOVER_259_0.cloverRec.CF[6770]==0&false)); i++) {{
									__CLOVER_259_0.cloverRec.S[22139]++;Node num\u00e9ro = attr.item(i);
									__CLOVER_259_0.cloverRec.S[22140]++;String nomAttribut = num\u00e9ro.getNodeName();
									__CLOVER_259_0.cloverRec.S[22141]++;String valeurAttribut = num\u00e9ro.getNodeValue();
									//System.out.println(nomAttribut + " =\"" + valeurAttribut + "\"");
									__CLOVER_259_0.cloverRec.S[22142]++;if ((((nomAttribut == "de") && (++__CLOVER_259_0.cloverRec.CT[6771]!=0|true)) || (++__CLOVER_259_0.cloverRec.CF[6771]==0&false)))
										{__CLOVER_259_0.cloverRec.S[22143]++;de = valeurAttribut;
									}else {__CLOVER_259_0.cloverRec.S[22144]++;if ((((nomAttribut == "ancetre") && (++__CLOVER_259_0.cloverRec.CT[6772]!=0|true)) || (++__CLOVER_259_0.cloverRec.CF[6772]==0&false)))
										{__CLOVER_259_0.cloverRec.S[22145]++;ancetre = valeurAttribut;
									}else {__CLOVER_259_0.cloverRec.S[22146]++;if ((((nomAttribut == "conforme") && (++__CLOVER_259_0.cloverRec.CT[6773]!=0|true)) || (++__CLOVER_259_0.cloverRec.CF[6773]==0&false)))
										{__CLOVER_259_0.cloverRec.S[22147]++;conforme = (((valeurAttribut.compareToIgnoreCase("oui")==0) && (++__CLOVER_259_0.cloverRec.CT[6774]!=0|true)) || (++__CLOVER_259_0.cloverRec.CF[6774]==0&false))?true:false;
									}else {__CLOVER_259_0.cloverRec.S[22148]++;if ((((nomAttribut == "lieux") && (++__CLOVER_259_0.cloverRec.CT[6775]!=0|true)) || (++__CLOVER_259_0.cloverRec.CF[6775]==0&false)))
										{__CLOVER_259_0.cloverRec.S[22149]++;classe = valeurAttribut;
									}else {__CLOVER_259_0.cloverRec.S[22150]++;if ((((nomAttribut == "nom_feature") && (++__CLOVER_259_0.cloverRec.CT[6776]!=0|true)) || (++__CLOVER_259_0.cloverRec.CF[6776]==0&false)))
										{__CLOVER_259_0.cloverRec.S[22151]++;nom_feature = valeurAttribut;
									}else {__CLOVER_259_0.cloverRec.S[22152]++;if ((((nomAttribut == "dans_corps") && (++__CLOVER_259_0.cloverRec.CT[6777]!=0|true)) || (++__CLOVER_259_0.cloverRec.CF[6777]==0&false)))
										{__CLOVER_259_0.cloverRec.S[22153]++;dans_corps = (((valeurAttribut.compareToIgnoreCase("oui")==0) && (++__CLOVER_259_0.cloverRec.CT[6778]!=0|true)) || (++__CLOVER_259_0.cloverRec.CF[6778]==0&false))?true:false;
									}else
										{assert((((false)) && (++__CLOVER_259_0.cloverRec.CT[6779]!=0|true)) || (++__CLOVER_259_0.cloverRec.CF[6779]==0&false)):nomAttribut+"="+valeurAttribut;
								}}}}}}}
								}__CLOVER_259_0.cloverRec.S[22154]++;res=verifie_expr(nom,compiler,de,ancetre,conforme,classe,nom_feature,dans_corps);
								__CLOVER_259_0.cloverRec.S[22155]++;if((((res!=conforme) && (++__CLOVER_259_0.cloverRec.CT[6780]!=0|true)) || (++__CLOVER_259_0.cloverRec.CF[6780]==0&false)))
								{{
									__CLOVER_259_0.cloverRec.S[22156]++;logger.severe("Type "+de+" "+(((((conforme)) && (++__CLOVER_259_0.cloverRec.CT[6781]!=0|true)) || (++__CLOVER_259_0.cloverRec.CF[6781]==0&false))?"pas":"")+
											" conforme a "+ancetre+" dans "+nom+
											"("+res+")");
									__CLOVER_259_0.cloverRec.S[22157]++;assertTrue(res==conforme);
								}
								/*assert(res==conforme):
										"Type "+de+" "+((conforme)?"pas":"")+
										" conforme a "+ancetre+" dans "+nom+
										"("+res+")";*/
							}}
							}else
								{assert((((false)) && (++__CLOVER_259_0.cloverRec.CT[6782]!=0|true)) || (++__CLOVER_259_0.cloverRec.CF[6782]==0&false));
						}}} }else {__CLOVER_259_0.cloverRec.S[22158]++;if ((((n instanceof Text) && (++__CLOVER_259_0.cloverRec.CT[6783]!=0|true)) || (++__CLOVER_259_0.cloverRec.CF[6783]==0&false))) {{
							__CLOVER_259_0.cloverRec.S[22159]++;String s = n.getNodeValue();
							assert((((s == "" || s.matches("[ \t\n]+"))) && (++__CLOVER_259_0.cloverRec.CT[6784]!=0|true)) || (++__CLOVER_259_0.cloverRec.CF[6784]==0&false));
						} }else {__CLOVER_259_0.cloverRec.S[22160]++;if ((((n instanceof Comment) && (++__CLOVER_259_0.cloverRec.CT[6785]!=0|true)) || (++__CLOVER_259_0.cloverRec.CF[6785]==0&false))) {{
							
						}
						}else
							{assert((((false)) && (++__CLOVER_259_0.cloverRec.CT[6786]!=0|true)) || (++__CLOVER_259_0.cloverRec.CF[6786]==0&false)):"n="+n;
					}}}}
				}}
				}else
					{assert((((false)) && (++__CLOVER_259_0.cloverRec.CT[6787]!=0|true)) || (++__CLOVER_259_0.cloverRec.CF[6787]==0&false));
			}} }else {__CLOVER_259_0.cloverRec.S[22161]++;if ((((n0 instanceof Text) && (++__CLOVER_259_0.cloverRec.CT[6788]!=0|true)) || (++__CLOVER_259_0.cloverRec.CF[6788]==0&false))) {{
						__CLOVER_259_0.cloverRec.S[22162]++;String s = n0.getNodeValue();
						assert((((s == "" || s.matches("[ \t\n]+"))) && (++__CLOVER_259_0.cloverRec.CT[6789]!=0|true)) || (++__CLOVER_259_0.cloverRec.CF[6789]==0&false));
			} }else {__CLOVER_259_0.cloverRec.S[22163]++;if ((((n0 instanceof Comment) && (++__CLOVER_259_0.cloverRec.CT[6790]!=0|true)) || (++__CLOVER_259_0.cloverRec.CF[6790]==0&false))) {{
				
			}
			}else
				{assert((((false)) && (++__CLOVER_259_0.cloverRec.CT[6791]!=0|true)) || (++__CLOVER_259_0.cloverRec.CF[6791]==0&false)):"n="+n0;
		}}}}
		}__CLOVER_259_0.cloverRec.S[22164]++;logger.info("Fin des Tests type 2");
	}
		
	public Element donne_liste_conformite(String nom)
	{__CLOVER_259_0.cloverRec.M[1542]++;
		__CLOVER_259_0.cloverRec.S[22165]++;try {
			//R\u00e9cup\u00e8re une instance de la classe de fabrication
			__CLOVER_259_0.cloverRec.S[22166]++;DocumentBuilderFactory factory =
			DocumentBuilderFactory.newInstance();
			//R\u00e9cup\u00e9re une instance de la classe DocumentBuilder (sp\u00e9cifique vendeur)
			__CLOVER_259_0.cloverRec.S[22167]++;DocumentBuilder parser = factory.newDocumentBuilder();
			//effectue le parsing avec r\u00e9cup\u00e9ration du noeud DOM Document
			__CLOVER_259_0.cloverRec.S[22168]++;Document document = parser.parse(nom);
			__CLOVER_259_0.cloverRec.S[22169]++;Element catalogue = document.getDocumentElement();
			__CLOVER_259_0.cloverRec.S[22170]++;return catalogue;
		} catch (FactoryConfigurationError e) {
			// unable to get a document builder factory
			__CLOVER_259_0.cloverRec.S[22171]++;e.printStackTrace();
			__CLOVER_259_0.cloverRec.S[22172]++;System.err.println("Erreur de configuration du factory");
			__CLOVER_259_0.cloverRec.S[22173]++;System.exit(1);
		} catch (ParserConfigurationException e) {
			// parser was unable to be configured
			__CLOVER_259_0.cloverRec.S[22174]++;e.printStackTrace();
			__CLOVER_259_0.cloverRec.S[22175]++;System.err.println("Erreur de configuration du parser");
			__CLOVER_259_0.cloverRec.S[22176]++;System.exit(1);
		} catch (SAXException e) {
			// parsing error
			__CLOVER_259_0.cloverRec.S[22177]++;e.printStackTrace();
			__CLOVER_259_0.cloverRec.S[22178]++;System.err.println("Exception Sax");
			__CLOVER_259_0.cloverRec.S[22179]++;System.exit(1);
		} catch (IOException e) {
			// i/o error
			__CLOVER_259_0.cloverRec.S[22180]++;e.printStackTrace();
			__CLOVER_259_0.cloverRec.S[22181]++;System.err.println("Erreur d'entree sortie");
			__CLOVER_259_0.cloverRec.S[22182]++;System.exit(1);
		}
		__CLOVER_259_0.cloverRec.S[22183]++;return null;
	}
	
	public Type parse_type(String nom_type,Compiler_Eiffel compiler) 
	{__CLOVER_259_0.cloverRec.M[1543]++;
		__CLOVER_259_0.cloverRec.S[22184]++;Type t;
		assert((((nom_type!=null)) && (++__CLOVER_259_0.cloverRec.CT[6792]!=0|true)) || (++__CLOVER_259_0.cloverRec.CF[6792]==0&false));
		assert((((compiler!=null)) && (++__CLOVER_259_0.cloverRec.CT[6793]!=0|true)) || (++__CLOVER_259_0.cloverRec.CF[6793]==0&false));
		//String nom_reel=null;
		//nom_reel = donne_nom(nom_fichier);
		__CLOVER_259_0.cloverRec.S[22185]++;if ((((nom_type == "") && (++__CLOVER_259_0.cloverRec.CT[6794]!=0|true)) || (++__CLOVER_259_0.cloverRec.CF[6794]==0&false))) {{
			__CLOVER_259_0.cloverRec.S[22186]++;compiler.logging.erreur(new ErreurIO("Fichier " + nom_type + " non trouve",nom_type));
			__CLOVER_259_0.cloverRec.S[22187]++;return null;
		}
		}__CLOVER_259_0.cloverRec.S[22188]++;try {
			__CLOVER_259_0.cloverRec.S[22189]++;EiffelLexer lexer =
				//new EiffelLexer(new FileInputStream(nom_reel));
				new EiffelLexer(new StringReader(nom_type));
			__CLOVER_259_0.cloverRec.S[22190]++;lexer.setFilename(nom_type);
			__CLOVER_259_0.cloverRec.S[22191]++;EiffelParser parser = new EiffelParser(lexer);
			__CLOVER_259_0.cloverRec.S[22192]++;parser.setASTNodeClass("tinyeiffel.compiler.ASTDefaut");
			__CLOVER_259_0.cloverRec.S[22193]++;parser.setFilename(nom_type);
			__CLOVER_259_0.cloverRec.S[22194]++;parser.lexer = lexer;
			__CLOVER_259_0.cloverRec.S[22195]++;parser.logging=compiler.logging;
			//parser.logging=logging;
			// Parse the input expression
			__CLOVER_259_0.cloverRec.S[22196]++;t = parser.type0();
			__CLOVER_259_0.cloverRec.S[22197]++;Vector liste_classe = parser.type_utilisee;
			__CLOVER_259_0.cloverRec.S[22198]++;System.out.println("classe:" + liste_classe);
			__CLOVER_259_0.cloverRec.S[22199]++;if ((((t == null) && (++__CLOVER_259_0.cloverRec.CT[6795]!=0|true)) || (++__CLOVER_259_0.cloverRec.CF[6795]==0&false))) {{
				__CLOVER_259_0.cloverRec.S[22200]++;return null;
			}
			//compiler.set_liste_classe(liste_classe);
		}} catch (TokenStreamException e) {
			//erreur("exception: " + e);
			__CLOVER_259_0.cloverRec.S[22201]++;int x,y;
			__CLOVER_259_0.cloverRec.S[22202]++;x=-1;
			__CLOVER_259_0.cloverRec.S[22203]++;y=-1;
			__CLOVER_259_0.cloverRec.S[22204]++;if((((e instanceof TokenStreamRecognitionException) && (++__CLOVER_259_0.cloverRec.CT[6796]!=0|true)) || (++__CLOVER_259_0.cloverRec.CF[6796]==0&false)))
			{{
				//x=((TokenStreamRecognitionException)e).;
				//y=((TokenStreamRecognitionException)e);
			}
			}__CLOVER_259_0.cloverRec.S[22205]++;compiler.logging.erreur(new ErreurSource("Erreur lexicale:"+
							e.getMessage(),x,y,nom_type));
			__CLOVER_259_0.cloverRec.S[22206]++;return null;
		} catch (RecognitionException e) {
			//erreur("exception: " + e);
			__CLOVER_259_0.cloverRec.S[22207]++;compiler.logging.erreur(new ErreurSource("Erreur de parsing:"+
							e.getMessage(),e.getLine(),e.getColumn(),
							e.getFilename()));
			__CLOVER_259_0.cloverRec.S[22208]++;return null;
		} /*catch (FileNotFoundException e) {
			//erreur("Erreur1: fichier " + nom_fichier + " non trouve");
			//erreur("exception: " + e);
			//assert(false);
			compiler.logging.erreur(new ErreurIO("Fichier "+nom_type+" non trouve",nom_type));
			return null;
		}*/ catch (SecurityException e) {
			__CLOVER_259_0.cloverRec.S[22209]++;compiler.logging.erreur(new ErreurSource("Erreur: erreur de securite",-1,-1,nom_type));
			__CLOVER_259_0.cloverRec.S[22210]++;return null;
		}
		__CLOVER_259_0.cloverRec.S[22211]++;return t;
	}
	
	public DeclareVar parse_declare_var(String nom_type,Compiler_Eiffel compiler) 
	{__CLOVER_259_0.cloverRec.M[1544]++;
		__CLOVER_259_0.cloverRec.S[22212]++;DeclareVar t;
		__CLOVER_259_0.cloverRec.S[22213]++;String n,n2;
		__CLOVER_259_0.cloverRec.S[22214]++;Type t2;
		__CLOVER_259_0.cloverRec.S[22215]++;int i;
		assert((((nom_type!=null)) && (++__CLOVER_259_0.cloverRec.CT[6797]!=0|true)) || (++__CLOVER_259_0.cloverRec.CF[6797]==0&false));
		assert((((compiler!=null)) && (++__CLOVER_259_0.cloverRec.CT[6798]!=0|true)) || (++__CLOVER_259_0.cloverRec.CF[6798]==0&false));
		//String nom_reel=null;
		//nom_reel = donne_nom(nom_fichier);
		__CLOVER_259_0.cloverRec.S[22216]++;if ((((nom_type == "") && (++__CLOVER_259_0.cloverRec.CT[6799]!=0|true)) || (++__CLOVER_259_0.cloverRec.CF[6799]==0&false))) {{
			__CLOVER_259_0.cloverRec.S[22217]++;compiler.logging.erreur(new ErreurIO("Fichier " + nom_type + " non trouve",nom_type));
			__CLOVER_259_0.cloverRec.S[22218]++;return null;
		}
		}__CLOVER_259_0.cloverRec.S[22219]++;try {
			__CLOVER_259_0.cloverRec.S[22220]++;i=nom_type.indexOf(':');
			assert((((i>-1)) && (++__CLOVER_259_0.cloverRec.CT[6800]!=0|true)) || (++__CLOVER_259_0.cloverRec.CF[6800]==0&false));
			__CLOVER_259_0.cloverRec.S[22221]++;n=nom_type.substring(0,i-1);
			__CLOVER_259_0.cloverRec.S[22222]++;n2=nom_type.substring(i+1);
			__CLOVER_259_0.cloverRec.S[22223]++;EiffelLexer lexer =
				//new EiffelLexer(new FileInputStream(nom_reel));
				new EiffelLexer(new StringReader("("+n2+")"));
			__CLOVER_259_0.cloverRec.S[22224]++;lexer.setFilename(nom_type);
			__CLOVER_259_0.cloverRec.S[22225]++;EiffelParser parser = new EiffelParser(lexer);
			__CLOVER_259_0.cloverRec.S[22226]++;parser.setASTNodeClass("tinyeiffel.compiler.ASTDefaut");
			__CLOVER_259_0.cloverRec.S[22227]++;parser.setFilename(nom_type);
			__CLOVER_259_0.cloverRec.S[22228]++;parser.lexer = lexer;
			__CLOVER_259_0.cloverRec.S[22229]++;parser.logging=compiler.logging;
			//parser.logging=logging;
			// Parse the input expression
			__CLOVER_259_0.cloverRec.S[22230]++;t2 = parser.type0();
			__CLOVER_259_0.cloverRec.S[22231]++;Vector liste_classe = parser.type_utilisee;
			__CLOVER_259_0.cloverRec.S[22232]++;System.out.println("classe:" + liste_classe);
			__CLOVER_259_0.cloverRec.S[22233]++;if ((((t2 == null) && (++__CLOVER_259_0.cloverRec.CT[6801]!=0|true)) || (++__CLOVER_259_0.cloverRec.CF[6801]==0&false))) {{
				__CLOVER_259_0.cloverRec.S[22234]++;return null;
			}
			}__CLOVER_259_0.cloverRec.S[22235]++;t=new DeclareVar(n,t2);
			//compiler.set_liste_classe(liste_classe);
		} catch (TokenStreamException e) {
			//erreur("exception: " + e);
			__CLOVER_259_0.cloverRec.S[22236]++;int x,y;
			__CLOVER_259_0.cloverRec.S[22237]++;x=-1;
			__CLOVER_259_0.cloverRec.S[22238]++;y=-1;
			__CLOVER_259_0.cloverRec.S[22239]++;if((((e instanceof TokenStreamRecognitionException) && (++__CLOVER_259_0.cloverRec.CT[6802]!=0|true)) || (++__CLOVER_259_0.cloverRec.CF[6802]==0&false)))
			{{
				//x=((TokenStreamRecognitionException)e).;
				//y=((TokenStreamRecognitionException)e);
			}
			}__CLOVER_259_0.cloverRec.S[22240]++;compiler.logging.erreur(new ErreurSource("Erreur lexicale:"+
							e.getMessage(),x,y,nom_type));
			__CLOVER_259_0.cloverRec.S[22241]++;return null;
		} catch (RecognitionException e) {
			//erreur("exception: " + e);
			__CLOVER_259_0.cloverRec.S[22242]++;compiler.logging.erreur(new ErreurSource("Erreur de parsing:"+
							e.getMessage(),e.getLine(),e.getColumn(),
							e.getFilename()));
			__CLOVER_259_0.cloverRec.S[22243]++;return null;
		} /*catch (FileNotFoundException e) {
			//erreur("Erreur1: fichier " + nom_fichier + " non trouve");
			//erreur("exception: " + e);
			//assert(false);
			compiler.logging.erreur(new ErreurIO("Fichier "+nom_type+" non trouve",nom_type));
			return null;
		}*/ catch (SecurityException e) {
			__CLOVER_259_0.cloverRec.S[22244]++;compiler.logging.erreur(new ErreurSource("Erreur: erreur de securite",-1,-1,nom_type));
			__CLOVER_259_0.cloverRec.S[22245]++;return null;
		}
		__CLOVER_259_0.cloverRec.S[22246]++;return t;
	}	
	public NomFeature parse_nom_feature(String nom_feature,Compiler_Eiffel compiler) 
	{__CLOVER_259_0.cloverRec.M[1545]++;
		__CLOVER_259_0.cloverRec.S[22247]++;NomFeature t;
		assert((((nom_feature!=null)) && (++__CLOVER_259_0.cloverRec.CT[6803]!=0|true)) || (++__CLOVER_259_0.cloverRec.CF[6803]==0&false));
		assert((((compiler!=null)) && (++__CLOVER_259_0.cloverRec.CT[6804]!=0|true)) || (++__CLOVER_259_0.cloverRec.CF[6804]==0&false));
		//String nom_reel=null;
		//nom_reel = donne_nom(nom_fichier);
		__CLOVER_259_0.cloverRec.S[22248]++;if ((((nom_feature == "") && (++__CLOVER_259_0.cloverRec.CT[6805]!=0|true)) || (++__CLOVER_259_0.cloverRec.CF[6805]==0&false))) {{
			__CLOVER_259_0.cloverRec.S[22249]++;compiler.logging.erreur(new ErreurIO("Fichier " + nom_feature + " non trouve",nom_feature));
			__CLOVER_259_0.cloverRec.S[22250]++;return null;
		}
		}__CLOVER_259_0.cloverRec.S[22251]++;try {
			__CLOVER_259_0.cloverRec.S[22252]++;EiffelLexer lexer =
				//new EiffelLexer(new FileInputStream(nom_reel));
				new EiffelLexer(new StringReader(nom_feature));
			__CLOVER_259_0.cloverRec.S[22253]++;lexer.setFilename(nom_feature);
			__CLOVER_259_0.cloverRec.S[22254]++;EiffelParser parser = new EiffelParser(lexer);
			__CLOVER_259_0.cloverRec.S[22255]++;parser.setASTNodeClass("tinyeiffel.compiler.ASTDefaut");
			__CLOVER_259_0.cloverRec.S[22256]++;parser.setFilename(nom_feature);
			__CLOVER_259_0.cloverRec.S[22257]++;parser.lexer = lexer;
			__CLOVER_259_0.cloverRec.S[22258]++;parser.logging=compiler.logging;
			//parser.logging=logging;
			// Parse the input expression
			__CLOVER_259_0.cloverRec.S[22259]++;t = parser.nom_feature0();
			__CLOVER_259_0.cloverRec.S[22260]++;Vector liste_classe = parser.type_utilisee;
			__CLOVER_259_0.cloverRec.S[22261]++;System.out.println("classe:" + liste_classe);
			__CLOVER_259_0.cloverRec.S[22262]++;if ((((t == null) && (++__CLOVER_259_0.cloverRec.CT[6806]!=0|true)) || (++__CLOVER_259_0.cloverRec.CF[6806]==0&false))) {{
				__CLOVER_259_0.cloverRec.S[22263]++;return null;
			}
			//compiler.set_liste_classe(liste_classe);
		}} catch (TokenStreamException e) {
			//erreur("exception: " + e);
			__CLOVER_259_0.cloverRec.S[22264]++;int x,y;
			__CLOVER_259_0.cloverRec.S[22265]++;x=-1;
			__CLOVER_259_0.cloverRec.S[22266]++;y=-1;
			__CLOVER_259_0.cloverRec.S[22267]++;if((((e instanceof TokenStreamRecognitionException) && (++__CLOVER_259_0.cloverRec.CT[6807]!=0|true)) || (++__CLOVER_259_0.cloverRec.CF[6807]==0&false)))
			{{
				//x=((TokenStreamRecognitionException)e).;
				//y=((TokenStreamRecognitionException)e);
			}
			}__CLOVER_259_0.cloverRec.S[22268]++;compiler.logging.erreur(new ErreurSource("Erreur lexicale:"+
							e.getMessage(),x,y,nom_feature));
			__CLOVER_259_0.cloverRec.S[22269]++;return null;
		} catch (RecognitionException e) {
			//erreur("exception: " + e);
			__CLOVER_259_0.cloverRec.S[22270]++;compiler.logging.erreur(new ErreurSource("Erreur de parsing:"+
							e.getMessage(),e.getLine(),e.getColumn(),
							e.getFilename()));
			__CLOVER_259_0.cloverRec.S[22271]++;return null;
		} /*catch (FileNotFoundException e) {
			//erreur("Erreur1: fichier " + nom_fichier + " non trouve");
			//erreur("exception: " + e);
			//assert(false);
			compiler.logging.erreur(new ErreurIO("Fichier "+nom_type+" non trouve",nom_type));
			return null;
		}*/ catch (SecurityException e) {
			__CLOVER_259_0.cloverRec.S[22272]++;compiler.logging.erreur(new ErreurSource("Erreur: erreur de securite",-1,-1,nom_feature));
			__CLOVER_259_0.cloverRec.S[22273]++;return null;
		}
		__CLOVER_259_0.cloverRec.S[22274]++;return t;
	}
	
	public Expr parse_expr(String expr,Compiler_Eiffel compiler) 
	{__CLOVER_259_0.cloverRec.M[1546]++;
		__CLOVER_259_0.cloverRec.S[22275]++;Expr t;
		assert((((expr!=null)) && (++__CLOVER_259_0.cloverRec.CT[6808]!=0|true)) || (++__CLOVER_259_0.cloverRec.CF[6808]==0&false));
		assert((((compiler!=null)) && (++__CLOVER_259_0.cloverRec.CT[6809]!=0|true)) || (++__CLOVER_259_0.cloverRec.CF[6809]==0&false));
		//String nom_reel=null;
		//nom_reel = donne_nom(nom_fichier);
		__CLOVER_259_0.cloverRec.S[22276]++;if ((((expr == "") && (++__CLOVER_259_0.cloverRec.CT[6810]!=0|true)) || (++__CLOVER_259_0.cloverRec.CF[6810]==0&false))) {{
			__CLOVER_259_0.cloverRec.S[22277]++;compiler.logging.erreur(new ErreurIO("Fichier " + expr + " non trouve",expr));
			__CLOVER_259_0.cloverRec.S[22278]++;return null;
		}
		}__CLOVER_259_0.cloverRec.S[22279]++;try {
			__CLOVER_259_0.cloverRec.S[22280]++;EiffelLexer lexer =
				//new EiffelLexer(new FileInputStream(nom_reel));
				new EiffelLexer(new StringReader(expr));
			__CLOVER_259_0.cloverRec.S[22281]++;lexer.setFilename(expr);
			__CLOVER_259_0.cloverRec.S[22282]++;EiffelParser parser = new EiffelParser(lexer);
			__CLOVER_259_0.cloverRec.S[22283]++;parser.setASTNodeClass("tinyeiffel.compiler.ASTDefaut");
			__CLOVER_259_0.cloverRec.S[22284]++;parser.setFilename(expr);
			__CLOVER_259_0.cloverRec.S[22285]++;parser.lexer = lexer;
			__CLOVER_259_0.cloverRec.S[22286]++;parser.logging=compiler.logging;
			//parser.logging=logging;
			// Parse the input expression
			__CLOVER_259_0.cloverRec.S[22287]++;t = parser.expr0();
			__CLOVER_259_0.cloverRec.S[22288]++;Vector liste_classe = parser.type_utilisee;
			__CLOVER_259_0.cloverRec.S[22289]++;System.out.println("classe:" + liste_classe);
			__CLOVER_259_0.cloverRec.S[22290]++;if ((((t == null) && (++__CLOVER_259_0.cloverRec.CT[6811]!=0|true)) || (++__CLOVER_259_0.cloverRec.CF[6811]==0&false))) {{
				__CLOVER_259_0.cloverRec.S[22291]++;return null;
			}
			//compiler.set_liste_classe(liste_classe);
		}} catch (TokenStreamException e) {
			//erreur("exception: " + e);
			__CLOVER_259_0.cloverRec.S[22292]++;int x,y;
			__CLOVER_259_0.cloverRec.S[22293]++;x=-1;
			__CLOVER_259_0.cloverRec.S[22294]++;y=-1;
			__CLOVER_259_0.cloverRec.S[22295]++;if((((e instanceof TokenStreamRecognitionException) && (++__CLOVER_259_0.cloverRec.CT[6812]!=0|true)) || (++__CLOVER_259_0.cloverRec.CF[6812]==0&false)))
			{{
				//x=((TokenStreamRecognitionException)e).;
				//y=((TokenStreamRecognitionException)e);
			}
			}__CLOVER_259_0.cloverRec.S[22296]++;compiler.logging.erreur(new ErreurSource("Erreur lexicale:"+
							e.getMessage(),x,y,expr));
			__CLOVER_259_0.cloverRec.S[22297]++;return null;
		} catch (RecognitionException e) {
			//erreur("exception: " + e);
			__CLOVER_259_0.cloverRec.S[22298]++;compiler.logging.erreur(new ErreurSource("Erreur de parsing:"+
							e.getMessage(),e.getLine(),e.getColumn(),
							e.getFilename()));
			__CLOVER_259_0.cloverRec.S[22299]++;return null;
		} /*catch (FileNotFoundException e) {
			//erreur("Erreur1: fichier " + nom_fichier + " non trouve");
			//erreur("exception: " + e);
			//assert(false);
			compiler.logging.erreur(new ErreurIO("Fichier "+nom_type+" non trouve",nom_type));
			return null;
		}*/ catch (SecurityException e) {
			__CLOVER_259_0.cloverRec.S[22300]++;compiler.logging.erreur(new ErreurSource("Erreur: erreur de securite",-1,-1,expr));
			__CLOVER_259_0.cloverRec.S[22301]++;return null;
		}
		__CLOVER_259_0.cloverRec.S[22302]++;return t;
	}
	
	public void testConversion()
	{__CLOVER_259_0.cloverRec.M[1547]++;
		__CLOVER_259_0.cloverRec.S[22303]++;System.out.println("Test des conversions");
		__CLOVER_259_0.cloverRec.S[22304]++;Compiler_Eiffel compiler;
		__CLOVER_259_0.cloverRec.S[22305]++;String nom,s;
		__CLOVER_259_0.cloverRec.S[22306]++;int no,i,j;
		__CLOVER_259_0.cloverRec.S[22307]++;Classe c,c1=null,b1=null;
		__CLOVER_259_0.cloverRec.S[22308]++;Heritage h;
		__CLOVER_259_0.cloverRec.S[22309]++;Conversion conv;
		__CLOVER_259_0.cloverRec.S[22310]++;Type t,base;
		__CLOVER_259_0.cloverRec.S[22311]++;logger.info("Test de convertion");
		__CLOVER_259_0.cloverRec.S[22312]++;nom="test\\context\\conformite\\generique\\test1.ace"; 
		__CLOVER_259_0.cloverRec.S[22313]++;compiler=new Compiler_Eiffel(Compiler_Eiffel.apres_context);
		__CLOVER_259_0.cloverRec.S[22314]++;no=compiler.compile(nom);
		__CLOVER_259_0.cloverRec.S[22315]++;if((((no!=0) && (++__CLOVER_259_0.cloverRec.CT[6813]!=0|true)) || (++__CLOVER_259_0.cloverRec.CF[6813]==0&false)))
		{{
			__CLOVER_259_0.cloverRec.S[22316]++;compiler.logging.affiche();
			__CLOVER_259_0.cloverRec.S[22317]++;if((((no!=0) && (++__CLOVER_259_0.cloverRec.CT[6814]!=0|true)) || (++__CLOVER_259_0.cloverRec.CF[6814]==0&false)))
			{{
				__CLOVER_259_0.cloverRec.S[22318]++;logger.severe("no="+no+"("+compiler.logging+")");
				__CLOVER_259_0.cloverRec.S[22319]++;assertTrue(no==0);
			}
			//assert(no==0):"no="+no+"("+compiler.logging+")";
		}}
		}__CLOVER_259_0.cloverRec.S[22320]++;for(i=0;(((i<compiler.liste_classe.size()) && (++__CLOVER_259_0.cloverRec.CT[6815]!=0|true)) || (++__CLOVER_259_0.cloverRec.CF[6815]==0&false));i++)
		{{
			__CLOVER_259_0.cloverRec.S[22321]++;c=(Classe)compiler.liste_classe.elementAt(i);
			__CLOVER_259_0.cloverRec.S[22322]++;if((((c.nom.compareToIgnoreCase("C1")==0) && (++__CLOVER_259_0.cloverRec.CT[6816]!=0|true)) || (++__CLOVER_259_0.cloverRec.CF[6816]==0&false)))
			{{
				__CLOVER_259_0.cloverRec.S[22323]++;c1=c;
			}
			}else {__CLOVER_259_0.cloverRec.S[22324]++;if((((c.nom.compareToIgnoreCase("B1")==0) && (++__CLOVER_259_0.cloverRec.CT[6817]!=0|true)) || (++__CLOVER_259_0.cloverRec.CF[6817]==0&false)))
			{{
				__CLOVER_259_0.cloverRec.S[22325]++;b1=c;
			}
		}}}
		}assert((((c1!=null)) && (++__CLOVER_259_0.cloverRec.CT[6818]!=0|true)) || (++__CLOVER_259_0.cloverRec.CF[6818]==0&false));
		assert((((b1!=null)) && (++__CLOVER_259_0.cloverRec.CT[6819]!=0|true)) || (++__CLOVER_259_0.cloverRec.CF[6819]==0&false));
		__CLOVER_259_0.cloverRec.S[22326]++;conv=new Conversion(c1.heritage[0],c1.type);
		__CLOVER_259_0.cloverRec.S[22327]++;s="C1[TL,TN]";
		__CLOVER_259_0.cloverRec.S[22328]++;base=parse_type("("+s+")",compiler);
		__CLOVER_259_0.cloverRec.S[22329]++;t=conv.convertie2(base);
		__CLOVER_259_0.cloverRec.S[22330]++;System.out.println("type "+base.toString2()+"->"+t.toString2());
		__CLOVER_259_0.cloverRec.S[22331]++;assertTrue(t.toString2().compareToIgnoreCase("B1[TK,TL,TM]")==0);
		//compiler.liste_classe
		__CLOVER_259_0.cloverRec.S[22332]++;logger.info("Fin de test des conversions");
	}
	public static Test suite()
	{__CLOVER_259_0.cloverRec.M[1548]++;
		__CLOVER_259_0.cloverRec.S[22333]++;return new TestSuite(TestType.class);
	}

}
