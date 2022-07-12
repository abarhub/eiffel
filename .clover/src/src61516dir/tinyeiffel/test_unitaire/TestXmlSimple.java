/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ *//*
 * Created on 18 sept. 2003
 *
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
package tinyeiffel.test_unitaire;

import junit.framework.*;
import tinyeiffel.ast.*;
import tinyeiffel.compiler.*;
import java.io.*;

import tinyeiffel.outils.compare_xml.*;
import java.util.logging.*;

import java.util.*;
import antlr.*;

/**
 * @author BARRET
 *
 * To change the template for this generated type comment go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
public class TestXmlSimple extends TestCase {static class __CLOVER_261_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}

	/**
	 * 
	 */
	/*public TestXmlSimple(String nom) {
		nom_fichier=nom;
	}*/

	protected void setUp()
	{__CLOVER_261_0.cloverRec.M[1557]++;
		//System.out.println("coucou-1");
		
	}

	public static String[] nom=
		{"test_unitaire\\test_class1.xml","std_classe\\any.e",
		"test\\test1.xml","test\\test1-2.e",
		"test\\test2.xml","test\\test1-3.e",
		"test\\test3.xml","test\\test1-4.e",
		"test\\test4.xml","test\\test1-5.e",
		"test\\test5.xml","test\\test1-6.e",
		"test\\test7.xml","test\\test7.e",
		"test\\parser\\test1\\test1.xml","test\\parser\\test1\\test1.e", // 7
		"test\\parser\\test_classe1\\test1.xml","test\\parser\\test_classe1\\test1.e" // 8
		,"test\\parser\\test_classe1\\test2.xml","test\\parser\\test_classe1\\test2.e"
		,"test\\parser\\test_classe1\\test3.xml","test\\parser\\test_classe1\\test3.e" // 10
		,"test\\parser\\test_classe1\\test4.xml","test\\parser\\test_classe1\\test4.e"
		,"test\\parser\\test_classe1\\test5.xml","test\\parser\\test_classe1\\test5.e"
		,"test\\parser\\test_classe1\\test6.xml","test\\parser\\test_classe1\\test6.e"
		,"test\\parser\\test_classe1\\test7.xml","test\\parser\\test_classe1\\test7.e" // 14
		,"test\\parser\\test_heritage\\test1.xml","test\\parser\\test_heritage\\test1.e"
		,"test\\parser\\test_heritage\\test2.xml","test\\parser\\test_heritage\\test2.e"
		,"test\\parser\\test_heritage\\test3.xml","test\\parser\\test_heritage\\test3.e"
		,"test\\parser\\test_heritage\\test4.xml","test\\parser\\test_heritage\\test4.e"
		,"test\\parser\\test_heritage\\test5.xml","test\\parser\\test_heritage\\test5.e"
		,"test\\parser\\test_heritage\\test6.xml","test\\parser\\test_heritage\\test6.e" // 20
		,"test\\parser\\test_heritage\\test7.xml","test\\parser\\test_heritage\\test7.e"
		,"test\\parser\\test_heritage\\test8.xml","test\\parser\\test_heritage\\test8.e"
		,"test\\parser\\test_heritage\\test9.xml","test\\parser\\test_heritage\\test9.e"
		,"test\\parser\\test_heritage\\test10.xml","test\\parser\\test_heritage\\test10.e"
		,"test\\parser\\test_heritage\\test11.xml","test\\parser\\test_heritage\\test11.e" // 25
		,"test\\parser\\test_heritage\\test12.xml","test\\parser\\test_heritage\\test12.e"
		,"test\\parser\\test_heritage\\test13.xml","test\\parser\\test_heritage\\test13.e"
		,"test\\parser\\test_classe1\\test9.xml","test\\parser\\test_classe1\\test9.e"
		,"test\\parser\\test_classe1\\test10.xml","test\\parser\\test_classe1\\test10.e" // 29
		,"test\\parser\\test_classe1\\test11.xml","test\\parser\\test_classe1\\test11.e" // 30
		,"test\\parser\\test_classe1\\test12.xml","test\\parser\\test_classe1\\test12.e"
		,"test\\parser\\test_classe1\\test13.xml","test\\parser\\test_classe1\\test13.e"
		,"test\\parser\\test_heritage\\test14.xml","test\\parser\\test_heritage\\test14.e"
		,"test\\parser\\test_heritage\\test15.xml","test\\parser\\test_heritage\\test15.e"
		,"test\\parser\\test_attr\\test1.xml","test\\parser\\test_attr\\test1.e"
		,"test\\parser\\test_attr\\test2.xml","test\\parser\\test_attr\\test2.e" // 36
		,"test\\parser\\test_attr\\test3.xml","test\\parser\\test_attr\\test3.e"
		,"test\\parser\\test_attr\\test4.xml","test\\parser\\test_attr\\test4.e"
		,"test\\parser\\test_attr\\test5.xml","test\\parser\\test_attr\\test5.e"
		,"test\\parser\\test_attr\\test6.xml","test\\parser\\test_attr\\test6.e" // 40
		,"test\\parser\\test_instr\\test1.xml","test\\parser\\test_instr\\test1.e"
		,"test\\parser\\test_instr\\test2.xml","test\\parser\\test_instr\\test2.e"
		,"test\\parser\\test_instr\\test4.xml","test\\parser\\test_instr\\test4.e"
		,"test\\parser\\test_instr\\test5.xml","test\\parser\\test_instr\\test5.e"
		,"test\\parser\\test_instr\\test6.xml","test\\parser\\test_instr\\test6.e" // 45
		,"test\\parser\\test_instr\\test7.xml","test\\parser\\test_instr\\test7.e"
		,"test\\parser\\test_instr\\test8.xml","test\\parser\\test_instr\\test8.e"
		,"test\\parser\\test_instr\\test10.xml","test\\parser\\test_instr\\test10.e"
		,"test\\parser\\test_instr\\test11.xml","test\\parser\\test_instr\\test11.e"
		,"test\\parser\\test_instr\\test13.xml","test\\parser\\test_instr\\test13.e" // 50
		,"test\\parser\\test_type\\test1.xml","test\\parser\\test_type\\test1.e"
		,"test\\parser\\test_type\\test2.xml","test\\parser\\test_type\\test2.e"
		,"test\\parser\\test_type\\test3.xml","test\\parser\\test_type\\test3.e"
		,"test\\parser\\test_expr\\test1.xml","test\\parser\\test_expr\\test1.e"
		,"test\\parser\\test_expr\\test2.xml","test\\parser\\test_expr\\test2.e" // 55
		,"test\\parser\\test_expr\\test3.xml","test\\parser\\test_expr\\test3.e"
		,"test\\parser\\test_expr\\test4.xml","test\\parser\\test_expr\\test4.e"
		,"test\\parser\\test_expr\\test6.xml","test\\parser\\test_expr\\test6.e"
		,"test\\parser\\test_expr\\test5.xml","test\\parser\\test_expr\\test5.e"
		,"test\\parser\\test_expr\\test7.xml","test\\parser\\test_expr\\test7.e" // 60
		,"test\\parser\\test_expr\\test8.xml","test\\parser\\test_expr\\test8.e"
		,"test\\parser\\test_classe1\\test8.xml","test\\parser\\test_classe1\\test8.e"
		,"test\\parser\\test_classe1\\test14.xml","test\\parser\\test_classe1\\test14.e"
		,"test\\parser\\test_classe1\\test15.xml","test\\parser\\test_classe1\\test15.e"
		,"test\\parser\\test_classe1\\test16.xml","test\\parser\\test_classe1\\test16.e" // 65
		,"test\\parser\\test_expr\\test9.xml","test\\parser\\test_expr\\test9.e"
		,"test\\parser\\test_instr\\test12.xml","test\\parser\\test_instr\\test12.e"
		,"test\\parser\\test_type\\test5.xml","test\\parser\\test_type\\test5.e"
		,"test\\parser\\test_type\\test4.xml","test\\parser\\test_type\\test4.e"
		,"test\\parser\\test_instr\\test3.xml","test\\parser\\test_instr\\test3.e" // 70
		,"test\\parser\\test_expr\\test10.xml","test\\parser\\test_expr\\test10.e"
		,"test\\parser\\test_expr\\test11.xml","test\\parser\\test_expr\\test11.e"
		,"test\\parser\\test_expr\\test12.xml","test\\parser\\test_expr\\test12.e"
		,"test\\parser\\test_expr\\test13.xml","test\\parser\\test_expr\\test13.e" // 74
		//,"test\\parser\\test1\\test1.xml","test\\parser\\test1\\test1.e"*/
		};

	public static final int no_test=74; // le no de ligne en commencant a 0

	/*********************************************
	 * fichier eiffel avec des pb:
	 * ,"test\\parser\\test_attr\\test7.xml","test\\parser\\test_attr\\test7.e" : les commentaire de feature ne sont pas mis dans le fichier xml
	 * ,"test\\parser\\test_expr\\test10.xml","test\\parser\\test_expr\\test10.e" : expressions dans assert sans ; de s\u00e9paration
	 * correcte de trait\u00e9 "9.r()" comme "9.;r();" ? (9.46.t est 9.46.t;) (cf test_expr\test12.e)
	 */

	public void test_parser()
	{__CLOVER_261_0.cloverRec.M[1558]++;
		__CLOVER_261_0.cloverRec.S[22383]++;for(int i=0;(((i<nom.length) && (++__CLOVER_261_0.cloverRec.CT[6836]!=0|true)) || (++__CLOVER_261_0.cloverRec.CF[6836]==0&false));i+=2)
		{{
			__CLOVER_261_0.cloverRec.S[22384]++;Compiler_Eiffel compiler=new Compiler_Eiffel();
			__CLOVER_261_0.cloverRec.S[22385]++;compiler.configure(nom[i+1]);
			__CLOVER_261_0.cloverRec.S[22386]++;Classe c=compiler.parse_file(nom[i+1]);
			assert((((c!=null)) && (++__CLOVER_261_0.cloverRec.CT[6837]!=0|true)) || (++__CLOVER_261_0.cloverRec.CF[6837]==0&false)):"nom="+nom[i];
			assert((((compiler.nb_erreur()==0)) && (++__CLOVER_261_0.cloverRec.CT[6838]!=0|true)) || (++__CLOVER_261_0.cloverRec.CF[6838]==0&false)):"nom="+nom[i];
			__CLOVER_261_0.cloverRec.S[22387]++;assertTrue(compiler.nb_erreur()==0);
			__CLOVER_261_0.cloverRec.S[22388]++;compiler.termine();
		}
	}}

	/**
	 * verifie que le fichier parse est equivalent 
	 * au fichier XML de referrence
	 *
	 */
	public void test_correcte()
	{__CLOVER_261_0.cloverRec.M[1559]++;
		//System.out.println("coucou6");
		__CLOVER_261_0.cloverRec.S[22389]++;assertTrue(nom!=null);
		__CLOVER_261_0.cloverRec.S[22390]++;assertTrue(nom.length%2==0);
		//assertEquals(1,1);
		__CLOVER_261_0.cloverRec.S[22391]++;for(int i=0;(((i<nom.length) && (++__CLOVER_261_0.cloverRec.CT[6839]!=0|true)) || (++__CLOVER_261_0.cloverRec.CF[6839]==0&false));i+=2)
		{{
			__CLOVER_261_0.cloverRec.S[22392]++;AstXML ast=new AstXML();
			__CLOVER_261_0.cloverRec.S[22393]++;Classe c=ast.parse(nom[i]);
			__CLOVER_261_0.cloverRec.S[22394]++;c.check_egal(c);
			__CLOVER_261_0.cloverRec.S[22395]++;assertTrue(true);
			__CLOVER_261_0.cloverRec.S[22396]++;Compiler_Eiffel compiler=new Compiler_Eiffel();
			__CLOVER_261_0.cloverRec.S[22397]++;compiler.configure(nom[i+1]);
			__CLOVER_261_0.cloverRec.S[22398]++;Classe c2=compiler.parse_file(nom[i+1]);
			__CLOVER_261_0.cloverRec.S[22399]++;assertTrue(c2!=null);
			__CLOVER_261_0.cloverRec.S[22400]++;c2.check_egal(c2);
			__CLOVER_261_0.cloverRec.S[22401]++;assertTrue(true);
			__CLOVER_261_0.cloverRec.S[22402]++;System.out.println("i="+i+";"+nom[i]+";"+nom[i+1]);
			//if(i/2==5)
			//	System.exit(0);
			__CLOVER_261_0.cloverRec.S[22403]++;c.check_egal(c2);
			__CLOVER_261_0.cloverRec.S[22404]++;assertTrue(true);
			__CLOVER_261_0.cloverRec.S[22405]++;c2.check_egal(c);
			__CLOVER_261_0.cloverRec.S[22406]++;assertTrue(true);
			__CLOVER_261_0.cloverRec.S[22407]++;compiler.termine();
		}
		
		//assertTrue(true);
		//System.out.println("coucou2");
	}}
	
	/**
	 * verifie que le fichier XML genere est
	 * equivalent a l'original
	 *
	 */
	public void test_correcte2() throws IOException
	{__CLOVER_261_0.cloverRec.M[1560]++;
		__CLOVER_261_0.cloverRec.S[22408]++;String nom_fichier="test\\test0-2.xml";
		//System.out.println("coucou6");
		__CLOVER_261_0.cloverRec.S[22409]++;assertTrue(nom!=null);
		__CLOVER_261_0.cloverRec.S[22410]++;assertTrue(nom.length%2==0);
		//assertEquals(1,1);
		__CLOVER_261_0.cloverRec.S[22411]++;for(int i=0;(((i<nom.length) && (++__CLOVER_261_0.cloverRec.CT[6840]!=0|true)) || (++__CLOVER_261_0.cloverRec.CF[6840]==0&false));i+=2)
		{{
			__CLOVER_261_0.cloverRec.S[22412]++;Compiler_Eiffel compiler=new Compiler_Eiffel();
			__CLOVER_261_0.cloverRec.S[22413]++;compiler.configure(nom[i+1]);
			__CLOVER_261_0.cloverRec.S[22414]++;Classe c=compiler.parse_file(nom[i+1]);
			__CLOVER_261_0.cloverRec.S[22415]++;c.check_egal(c);
			__CLOVER_261_0.cloverRec.S[22416]++;assertTrue(true);
			__CLOVER_261_0.cloverRec.S[22417]++;try {
				__CLOVER_261_0.cloverRec.S[22418]++;File f=new File(nom_fichier);
				__CLOVER_261_0.cloverRec.S[22419]++;f.delete();
				__CLOVER_261_0.cloverRec.S[22420]++;OutputStream out=new FileOutputStream(nom_fichier);
				__CLOVER_261_0.cloverRec.S[22421]++;c.toXML(new PrintStream(out));
				__CLOVER_261_0.cloverRec.S[22422]++;out.close();
			} catch (FileNotFoundException e) {
				__CLOVER_261_0.cloverRec.S[22423]++;e.printStackTrace();
				__CLOVER_261_0.cloverRec.S[22424]++;assertTrue(false);
			} catch (IOException e) {
				__CLOVER_261_0.cloverRec.S[22425]++;System.out.println("Erreur:"+e);
				__CLOVER_261_0.cloverRec.S[22426]++;e.printStackTrace();
			}
			__CLOVER_261_0.cloverRec.S[22427]++;AstXML ast=new AstXML();
			__CLOVER_261_0.cloverRec.S[22428]++;Classe c2=ast.parse(nom_fichier);
			__CLOVER_261_0.cloverRec.S[22429]++;assertTrue(c2!=null);
			__CLOVER_261_0.cloverRec.S[22430]++;c2.check_egal(c2);
			__CLOVER_261_0.cloverRec.S[22431]++;assertTrue(true);
			__CLOVER_261_0.cloverRec.S[22432]++;c.check_egal(c2);
			__CLOVER_261_0.cloverRec.S[22433]++;assertTrue(true);
			__CLOVER_261_0.cloverRec.S[22434]++;c2.check_egal(c);
			__CLOVER_261_0.cloverRec.S[22435]++;assertTrue(true);
			__CLOVER_261_0.cloverRec.S[22436]++;Compare_XML comp=new Compare_XML(nom_fichier,nom[i]);
			assert((((comp.parse())) && (++__CLOVER_261_0.cloverRec.CT[6841]!=0|true)) || (++__CLOVER_261_0.cloverRec.CF[6841]==0&false)):nom_fichier+"!="+nom[i]+
                "("+nom[i+1]+"):"+comp.erreur();
			__CLOVER_261_0.cloverRec.S[22437]++;compiler.termine();
		}
		
		//assertTrue(true);
		//System.out.println("coucou2");
	}}
	
	public void testAssertion()
	{__CLOVER_261_0.cloverRec.M[1561]++;
		//System.out.println("coucou5");
		__CLOVER_261_0.cloverRec.S[22438]++;assertEquals(12,12);
		__CLOVER_261_0.cloverRec.S[22439]++;boolean assertion=false;
		assert((((assertion=true))));
		__CLOVER_261_0.cloverRec.S[22440]++;if((((!assertion) && (++__CLOVER_261_0.cloverRec.CT[6843]!=0|true)) || (++__CLOVER_261_0.cloverRec.CF[6843]==0&false)))
		{{
			__CLOVER_261_0.cloverRec.S[22441]++;assertTrue(false);
		}
		//System.out.println("coucou4");
	}}
	
	private static Logger logger;
	public void t_estLog(){__CLOVER_261_0.cloverRec.M[1562]++;
		__CLOVER_261_0.cloverRec.S[22442]++;try {
			__CLOVER_261_0.cloverRec.S[22443]++;logger = Logger.getLogger("com.wombat.nose");
			__CLOVER_261_0.cloverRec.S[22444]++;FileHandler fh = new FileHandler("test_log.txt");
			__CLOVER_261_0.cloverRec.S[22445]++;logger.addHandler(fh);
			// Log a FINE tracing message
			__CLOVER_261_0.cloverRec.S[22446]++;logger.fine("doing stuff");
			__CLOVER_261_0.cloverRec.S[22447]++;try{
				__CLOVER_261_0.cloverRec.S[22448]++;int i=0;
				//i=7/i;
			} catch (ArithmeticException ex){
				// Log the error
				__CLOVER_261_0.cloverRec.S[22449]++;logger.log(Level.WARNING,"Erreur d'arithmetique"/*,ex*/);
			} catch (Error ex){
				// Log the error
				__CLOVER_261_0.cloverRec.S[22450]++;logger.log(Level.WARNING,"trouble sneezing",ex);
			}
			__CLOVER_261_0.cloverRec.S[22451]++;logger.fine("done");
		} catch (SecurityException e) {
			__CLOVER_261_0.cloverRec.S[22452]++;e.printStackTrace();
		} catch (IOException e) {
			__CLOVER_261_0.cloverRec.S[22453]++;e.printStackTrace();
		}
	}

	
	public static Test suite()
	{__CLOVER_261_0.cloverRec.M[1563]++;
//		TestSuite t=new TestSuite();
		//t.addTest(new TestXmlSimple("test_unitaire\\test_class1.xml"));
//		t.addTest(new Test_unitaire1());
//		return t;//new TestSuite(Test_unitaire1.class);
		//System.out.println("coucou1");
		__CLOVER_261_0.cloverRec.S[22454]++;return new TestSuite(TestXmlSimple.class);
	}
	
	public static void main(String arg[])
	{__CLOVER_261_0.cloverRec.M[1564]++;
		__CLOVER_261_0.cloverRec.S[22455]++;junit.textui.TestRunner.run(suite());
		//genere_xml();
		//vitesse();
	}
	
	public static void genere_xml()
	{__CLOVER_261_0.cloverRec.M[1565]++;
		__CLOVER_261_0.cloverRec.S[22456]++;int i,no;
		__CLOVER_261_0.cloverRec.S[22457]++;String nom_fichier="test\\parser\\test_tmp.xml";
		__CLOVER_261_0.cloverRec.S[22458]++;Compiler_Eiffel compiler=new Compiler_Eiffel();
		__CLOVER_261_0.cloverRec.S[22459]++;no=(no_test)*2;
		__CLOVER_261_0.cloverRec.S[22460]++;compiler.configure(nom[no+1]);
		__CLOVER_261_0.cloverRec.S[22461]++;Classe c=compiler.parse_file(nom[no+1]);
		//assert(c!=null):"nom="+nom[no];
		__CLOVER_261_0.cloverRec.S[22462]++;if((((compiler.nb_erreur()!=0) && (++__CLOVER_261_0.cloverRec.CT[6844]!=0|true)) || (++__CLOVER_261_0.cloverRec.CF[6844]==0&false)))
		{{
			__CLOVER_261_0.cloverRec.S[22463]++;compiler.affiche_erreur();
			assert((((false)) && (++__CLOVER_261_0.cloverRec.CT[6845]!=0|true)) || (++__CLOVER_261_0.cloverRec.CF[6845]==0&false));
		}
		}else
			{__CLOVER_261_0.cloverRec.S[22464]++;assertTrue(compiler.nb_erreur()==0);
		}__CLOVER_261_0.cloverRec.S[22465]++;try {
			__CLOVER_261_0.cloverRec.S[22466]++;File f=new File(nom_fichier);
			__CLOVER_261_0.cloverRec.S[22467]++;f.delete();
			__CLOVER_261_0.cloverRec.S[22468]++;OutputStream out=new FileOutputStream(nom_fichier);
			__CLOVER_261_0.cloverRec.S[22469]++;c.toXML(new PrintStream(out));
			__CLOVER_261_0.cloverRec.S[22470]++;out.close();
		} catch (FileNotFoundException e) {
			__CLOVER_261_0.cloverRec.S[22471]++;e.printStackTrace();
			__CLOVER_261_0.cloverRec.S[22472]++;assertTrue(false);
		} catch (IOException e) {
			__CLOVER_261_0.cloverRec.S[22473]++;System.out.println("Erreur:"+e);
			__CLOVER_261_0.cloverRec.S[22474]++;e.printStackTrace();
		}
		__CLOVER_261_0.cloverRec.S[22475]++;compiler.termine();
		__CLOVER_261_0.cloverRec.S[22476]++;System.out.println("Terminer");
		//assert(junit.textui.TestRunner!=null);
		//System.out.println("coucou0");
		//if(arg.length>1)
		//	junit.awtui.TestRunner.run(suite());
		//else
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

	public static void vitesse()
	{__CLOVER_261_0.cloverRec.M[1566]++;
		__CLOVER_261_0.cloverRec.S[22477]++;int i,no,nb_annalyse=100;
		__CLOVER_261_0.cloverRec.S[22478]++;Date date1=new Date(),date2;
		__CLOVER_261_0.cloverRec.S[22479]++;String nom_fichier/*="test\\parser\\test_tmp.xml"*/;
		__CLOVER_261_0.cloverRec.S[22480]++;Compiler_Eiffel compiler=new Compiler_Eiffel();
		__CLOVER_261_0.cloverRec.S[22481]++;boolean test_lexer=false;
		__CLOVER_261_0.cloverRec.S[22482]++;no=1;
		__CLOVER_261_0.cloverRec.S[22483]++;test_lexer=true;
		__CLOVER_261_0.cloverRec.S[22484]++;System.out.println("Test de vitesse");
		//nom_fichier="test\\parser\\test_tmp.xml";
		__CLOVER_261_0.cloverRec.S[22485]++;nom_fichier="E:\\SmallEiffel0\\tutorial\\fibonacci.e";
		//nom_fichier="E:\\SmallEiffel0\\lib\\kernel\\general.e";
		__CLOVER_261_0.cloverRec.S[22486]++;nom_fichier="E:\\SmallEiffel0\\lib\\kernel\\string.e";
		//nom_fichier="E:\\projet\\eiffel\\test\\parser\\test_exemple\\test2.e";
		__CLOVER_261_0.cloverRec.S[22487]++;System.out.println("Fichier:"+nom_fichier+" ("+nb_annalyse+" analyses)");
		__CLOVER_261_0.cloverRec.S[22488]++;compiler.configure(nom_fichier);
		//System.out.println("T1");
		__CLOVER_261_0.cloverRec.S[22489]++;if((((test_lexer) && (++__CLOVER_261_0.cloverRec.CT[6846]!=0|true)) || (++__CLOVER_261_0.cloverRec.CF[6846]==0&false)))
			{__CLOVER_261_0.cloverRec.S[22490]++;System.out.println("Lexer");
		}else
			{__CLOVER_261_0.cloverRec.S[22491]++;System.out.println("Lexer+Parsing");
		}__CLOVER_261_0.cloverRec.S[22492]++;for(i=0;(((i<nb_annalyse) && (++__CLOVER_261_0.cloverRec.CT[6847]!=0|true)) || (++__CLOVER_261_0.cloverRec.CF[6847]==0&false));i++)
		{{
			__CLOVER_261_0.cloverRec.S[22493]++;if((((test_lexer) && (++__CLOVER_261_0.cloverRec.CT[6848]!=0|true)) || (++__CLOVER_261_0.cloverRec.CF[6848]==0&false)))
			{{
				__CLOVER_261_0.cloverRec.S[22494]++;parcourt_lexer(compiler,nom_fichier);
			}
			}else
			{{
				__CLOVER_261_0.cloverRec.S[22495]++;Classe c=compiler.parse_file(nom_fichier);
				//System.out.println("T2");
				//assert(c!=null):"nom="+nom_fichier;
				__CLOVER_261_0.cloverRec.S[22496]++;if((((compiler.nb_erreur()!=0) && (++__CLOVER_261_0.cloverRec.CT[6849]!=0|true)) || (++__CLOVER_261_0.cloverRec.CF[6849]==0&false)))
				{{
					__CLOVER_261_0.cloverRec.S[22497]++;compiler.affiche_erreur();
					assert((((false)) && (++__CLOVER_261_0.cloverRec.CT[6850]!=0|true)) || (++__CLOVER_261_0.cloverRec.CF[6850]==0&false));
				}
				}else
				{{
					assert((((c!=null)) && (++__CLOVER_261_0.cloverRec.CT[6851]!=0|true)) || (++__CLOVER_261_0.cloverRec.CF[6851]==0&false)):"nom="+nom_fichier;
					__CLOVER_261_0.cloverRec.S[22498]++;assertTrue(compiler.nb_erreur()==0);
					//System.out.println("Pas d'erreur");
				}
			}}
			
		}}
		/*try {
			File f=new File(nom_fichier);
			f.delete();
			OutputStream out=new FileOutputStream(nom_fichier);
			c.toXML(new PrintStream(out));
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			assertTrue(false);
		} catch (IOException e) {
			System.out.println("Erreur:"+e);
			e.printStackTrace();
		}*/
		}__CLOVER_261_0.cloverRec.S[22499]++;date2=new Date();
		__CLOVER_261_0.cloverRec.S[22500]++;long max_mem1,total_mem1,free_mem1;
		__CLOVER_261_0.cloverRec.S[22501]++;long max_mem2,total_mem2,free_mem2,libere2;
		__CLOVER_261_0.cloverRec.S[22502]++;long max_mem3,total_mem3,free_mem3,libere3;
		__CLOVER_261_0.cloverRec.S[22503]++;Runtime runtime;
		__CLOVER_261_0.cloverRec.S[22504]++;runtime=Runtime.getRuntime();
		// avant le GC
		__CLOVER_261_0.cloverRec.S[22505]++;max_mem1=runtime.maxMemory();
		__CLOVER_261_0.cloverRec.S[22506]++;total_mem1=runtime.totalMemory();
		__CLOVER_261_0.cloverRec.S[22507]++;free_mem1=runtime.freeMemory();
		__CLOVER_261_0.cloverRec.S[22508]++;System.out.println("Avant GC:");
		__CLOVER_261_0.cloverRec.S[22509]++;System.out.println("total mem:"+total_mem1+", max mem="+max_mem1+", free mem="+free_mem1);
		// GC
		__CLOVER_261_0.cloverRec.S[22510]++;runtime.gc();
		// apres le GC
		__CLOVER_261_0.cloverRec.S[22511]++;max_mem2=runtime.maxMemory();
		__CLOVER_261_0.cloverRec.S[22512]++;total_mem2=runtime.totalMemory();
		__CLOVER_261_0.cloverRec.S[22513]++;free_mem2=runtime.freeMemory();
		__CLOVER_261_0.cloverRec.S[22514]++;libere2=(total_mem1-free_mem1)-(total_mem2-free_mem2);
		__CLOVER_261_0.cloverRec.S[22515]++;System.out.println("Apres GC:");
		__CLOVER_261_0.cloverRec.S[22516]++;System.out.println("total mem:"+total_mem2+", max mem="+max_mem2+", free mem="+free_mem2+", libere="+(libere2));
		// GC2
		__CLOVER_261_0.cloverRec.S[22517]++;if((((compiler!=null) && (++__CLOVER_261_0.cloverRec.CT[6852]!=0|true)) || (++__CLOVER_261_0.cloverRec.CF[6852]==0&false)))
		{{
			__CLOVER_261_0.cloverRec.S[22518]++;compiler=null;
		}
		}__CLOVER_261_0.cloverRec.S[22519]++;compiler=null;
		__CLOVER_261_0.cloverRec.S[22520]++;runtime.gc();
		// apres le GC2
		__CLOVER_261_0.cloverRec.S[22521]++;max_mem3=runtime.maxMemory();
		__CLOVER_261_0.cloverRec.S[22522]++;total_mem3=runtime.totalMemory();
		__CLOVER_261_0.cloverRec.S[22523]++;free_mem3=runtime.freeMemory();
		__CLOVER_261_0.cloverRec.S[22524]++;libere3=(total_mem2-free_mem2)-(total_mem3-free_mem3);
		__CLOVER_261_0.cloverRec.S[22525]++;System.out.println("Apres GC2:");
		__CLOVER_261_0.cloverRec.S[22526]++;System.out.println("total mem:"+total_mem3+", max mem="+max_mem3+", free mem="+free_mem3+", libere="+(libere3));
		// Duree
		__CLOVER_261_0.cloverRec.S[22527]++;System.out.println("Dur\u00e9e:");
		__CLOVER_261_0.cloverRec.S[22528]++;System.out.println(date1.toString()+"->"+date2.toString()+"("+nb_annalyse+" analyses)");
		__CLOVER_261_0.cloverRec.S[22529]++;System.out.println("Terminer");
		__CLOVER_261_0.cloverRec.S[22530]++;compiler.termine();
		//assert(junit.textui.TestRunner!=null);
		//System.out.println("coucou0");
		//if(arg.length>1)
		//	junit.awtui.TestRunner.run(suite());
		//else
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
	
	public static void parcourt_lexer(Compiler_Eiffel compiler,String nom_fichier)
	{__CLOVER_261_0.cloverRec.M[1567]++;
		assert((((compiler!=null)) && (++__CLOVER_261_0.cloverRec.CT[6853]!=0|true)) || (++__CLOVER_261_0.cloverRec.CF[6853]==0&false));
		assert((((nom!=null)) && (++__CLOVER_261_0.cloverRec.CT[6854]!=0|true)) || (++__CLOVER_261_0.cloverRec.CF[6854]==0&false));
		__CLOVER_261_0.cloverRec.S[22531]++;Classe c;
		__CLOVER_261_0.cloverRec.S[22532]++;String nom_reel=null;
		__CLOVER_261_0.cloverRec.S[22533]++;EiffelParser parser_tmp=null;
		__CLOVER_261_0.cloverRec.S[22534]++;nom_reel = compiler.donne_nom(nom_fichier);
		__CLOVER_261_0.cloverRec.S[22535]++;if ((((nom_reel == "") && (++__CLOVER_261_0.cloverRec.CT[6855]!=0|true)) || (++__CLOVER_261_0.cloverRec.CF[6855]==0&false))) {{
			//logging.erreur(new ErreurIO("Fichier " + nom_fichier + " non trouve",nom_fichier));
			__CLOVER_261_0.cloverRec.S[22536]++;System.out.println("Fichier " + nom_fichier + " non trouve");
			assert((((false)) && (++__CLOVER_261_0.cloverRec.CT[6856]!=0|true)) || (++__CLOVER_261_0.cloverRec.CF[6856]==0&false));
			__CLOVER_261_0.cloverRec.S[22537]++;return ;
		}
		}__CLOVER_261_0.cloverRec.S[22538]++;try {
			__CLOVER_261_0.cloverRec.S[22539]++;int i=0;
			__CLOVER_261_0.cloverRec.S[22540]++;EiffelLexer lexer;
			__CLOVER_261_0.cloverRec.S[22541]++;lexer=new EiffelLexer(new FileInputStream(nom_reel));
			//lexer=lecture_fichier(nom_reel);
			__CLOVER_261_0.cloverRec.S[22542]++;lexer.setFilename(nom_reel);
			__CLOVER_261_0.cloverRec.S[22543]++;antlr.Token token;
			__CLOVER_261_0.cloverRec.S[22544]++;token=lexer.nextToken();
			assert((((token!=null)) && (++__CLOVER_261_0.cloverRec.CT[6857]!=0|true)) || (++__CLOVER_261_0.cloverRec.CF[6857]==0&false));
			__CLOVER_261_0.cloverRec.S[22545]++;while((((token!=null&&token.getType()!=antlr.Token.EOF_TYPE) && (++__CLOVER_261_0.cloverRec.CT[6858]!=0|true)) || (++__CLOVER_261_0.cloverRec.CF[6858]==0&false)))
			{{
				__CLOVER_261_0.cloverRec.S[22546]++;token=lexer.nextToken();
				__CLOVER_261_0.cloverRec.S[22547]++;i++;
			}
			//System.out.println("nb token="+i);
			
			//EiffelParser parser = new EiffelParser(lexer);
			//parser.setASTNodeClass("compiler.ASTDefaut");
			//parser.setFilename(nom_reel);
			//parser.lexer = lexer;
			//parser.logging=logging;
			//parser_tmp=parser;
			//parser.logging=logging;
			// Parse the input expression
			//System.out.println("A1");
			//c = parser.classe();
			//System.out.println("A2");
			/*Vector liste_classe = parser.type_utilisee;
			//System.out.println("classe:" + liste_classe);
			if (c == null) {
				return ;
			}
			if(c.type!=null&&
				c.type.generique!=null&&
				c.type.generique.length>0)
			{// elimination dans liste_classe 
				// des parametres generiques
				for(int i=0;i<c.type.generique.length;i++)
				{
					Type t1,t2;
					t1=c.type.generique[i];
					for(int j=0;j<liste_classe.size();j++)
					{
						t2=(Type)liste_classe.elementAt(j);
						if(t1.egaux(t2))
						{
							liste_classe.remove(j);
							j--;
						}
					}
				}
			}*/
			//c.set_liste_classe(liste_classe);
		}} catch (TokenStreamException e) {
			//erreur("exception: " + e);
			__CLOVER_261_0.cloverRec.S[22548]++;int x,y;
	
			__CLOVER_261_0.cloverRec.S[22549]++;x=parser_tmp.lexer.getColumn();
			__CLOVER_261_0.cloverRec.S[22550]++;y=parser_tmp.lexer.getLine();
			//parser_tmp.lexer.getFilename();
			__CLOVER_261_0.cloverRec.S[22551]++;if((((e instanceof TokenStreamRecognitionException) && (++__CLOVER_261_0.cloverRec.CT[6859]!=0|true)) || (++__CLOVER_261_0.cloverRec.CF[6859]==0&false)))
			{{
				//x=((TokenStreamRecognitionException)e).;
				//y=((TokenStreamRecognitionException)e);
			}
			}__CLOVER_261_0.cloverRec.S[22552]++;System.out.println("Erreur lexicale:"+
							e.getMessage());
			__CLOVER_261_0.cloverRec.S[22553]++;return;
		} /*catch (RecognitionException e) {
			//erreur("exception: " + e);
			System.out.println("Erreur de parsing:"+
							e.getMessage());
			return;
		}*/ catch (FileNotFoundException e) {
			//erreur("Erreur1: fichier " + nom_fichier + " non trouve");
			//erreur("exception: " + e);
			//assert(false);
			__CLOVER_261_0.cloverRec.S[22554]++;System.out.println("Fichier "+nom_fichier+" non trouve");
			__CLOVER_261_0.cloverRec.S[22555]++;return;
		} catch (SecurityException e) {
			__CLOVER_261_0.cloverRec.S[22556]++;System.out.println("Erreur: erreur de securite:"+e);
			__CLOVER_261_0.cloverRec.S[22557]++;return;
		}
	}
	
	public static EiffelLexer lecture_fichier(String nom_fichier) throws IOException
	{__CLOVER_261_0.cloverRec.M[1568]++;// lecture du fichier puis cr\u00e9ation du lexer
		__CLOVER_261_0.cloverRec.S[22558]++;EiffelLexer lexer;
		__CLOVER_261_0.cloverRec.S[22559]++;String str="",s;
		__CLOVER_261_0.cloverRec.S[22560]++;FileInputStream file;
		__CLOVER_261_0.cloverRec.S[22561]++;byte buf[];
		__CLOVER_261_0.cloverRec.S[22562]++;int nb,nb_car=0,j,len,nb2=0;
		__CLOVER_261_0.cloverRec.S[22563]++;StringBuffer s2,s3;
		__CLOVER_261_0.cloverRec.S[22564]++;file=new FileInputStream(nom_fichier);
		__CLOVER_261_0.cloverRec.S[22565]++;buf=new byte[10000];
		__CLOVER_261_0.cloverRec.S[22566]++;s2=new StringBuffer();
		//assert(nb_car==s2.length()):"err:"+s2.length()+"!="+nb_car;
		__CLOVER_261_0.cloverRec.S[22567]++;do
		{{
			__CLOVER_261_0.cloverRec.S[22568]++;nb=file.read(buf);
			__CLOVER_261_0.cloverRec.S[22569]++;if((((nb!=-1) && (++__CLOVER_261_0.cloverRec.CT[6860]!=0|true)) || (++__CLOVER_261_0.cloverRec.CF[6860]==0&false)))
			{{
				//s=new String(buf);
				//s3=new StringBuffer(buf,0,nb);
				//s2=new StringBuffer();
				//s2.append(s.substring(0,nb));
				//s2.append(s3);
				__CLOVER_261_0.cloverRec.S[22570]++;for(j=0;(((j<nb) && (++__CLOVER_261_0.cloverRec.CT[6861]!=0|true)) || (++__CLOVER_261_0.cloverRec.CF[6861]==0&false));j++)
				{{
					//char c0=;
					__CLOVER_261_0.cloverRec.S[22571]++;s2.append((char)buf[j]);
				}
				//s2.append((char[])buf,0,nb);
				//str+=s.substring(0,nb);
				}__CLOVER_261_0.cloverRec.S[22572]++;nb_car=nb_car+nb;
				//assert(nb_car==nb2*buf.length+nb):"nb_car:"+nb_car+"!="+(nb2*buf.length+nb)+"("+nb2+","+nb+")";
				//assert(s2.length()==nb2*buf.length+nb):"s2:"+s2.length()+"!="+(nb2*buf.length+nb)+"("+nb2+","+nb+")";
			}
			//assert(nb_car==s2.length()):"err:"+s2.length()+"!="+nb_car+"("+nb2+","+nb+")";
			}__CLOVER_261_0.cloverRec.S[22573]++;nb2++;
		} }while((((nb!=-1) && (++__CLOVER_261_0.cloverRec.CT[6862]!=0|true)) || (++__CLOVER_261_0.cloverRec.CF[6862]==0&false)));
		//System.out.println("nombre de caract\u00e8res:"+nb_car);
		//assert(s2.length()==nb_car):"err:"+s2.length()+"!="+nb_car;
		__CLOVER_261_0.cloverRec.S[22574]++;lexer=new EiffelLexer(new StringReader(s2.toString()));
		__CLOVER_261_0.cloverRec.S[22575]++;return lexer;
	}
	
	public String nom_fichier;

}
