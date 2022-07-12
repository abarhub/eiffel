/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ */package tinyeiffel.test_unitaire;

import junit.framework.*;
import java.io.*;
import tinyeiffel.compiler.*;
//import ast.*;
import java.util.logging.*;


public class Test_unitaire1 extends TestCase
{static class __CLOVER_262_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}
	
	private String liste_fichier[];
	private Fichier_test liste_fichier2[];
	
	protected Logger logger;
	protected FileHandler fh;
	
	protected void setUp()
	{__CLOVER_262_0.cloverRec.M[1569]++;
		__CLOVER_262_0.cloverRec.S[22576]++;File f=new File("test");
		__CLOVER_262_0.cloverRec.S[22577]++;ParserXML p=new ParserXML();
		__CLOVER_262_0.cloverRec.S[22578]++;Fichier_test f2[]=p.parse("test_unitaire\\test.xml");
		__CLOVER_262_0.cloverRec.S[22579]++;assertTrue(f2!=null);
		__CLOVER_262_0.cloverRec.S[22580]++;assertTrue(f.exists());
		__CLOVER_262_0.cloverRec.S[22581]++;assertTrue(f.isDirectory());
		/*liste_fichier=f.list(new FiltreFileName(".e"));
		System.out.println("nb="+liste_fichier.length);*/
		__CLOVER_262_0.cloverRec.S[22582]++;liste_fichier2=f2;
		
		__CLOVER_262_0.cloverRec.S[22583]++;if((((logger==null||true) && (++__CLOVER_262_0.cloverRec.CT[6863]!=0|true)) || (++__CLOVER_262_0.cloverRec.CF[6863]==0&false)))
		{{
			__CLOVER_262_0.cloverRec.S[22584]++;logger=Logger.getLogger("tinyeiffel.test.test_unitaire");
			__CLOVER_262_0.cloverRec.S[22585]++;if((((fh==null) && (++__CLOVER_262_0.cloverRec.CT[6864]!=0|true)) || (++__CLOVER_262_0.cloverRec.CF[6864]==0&false)))
			{{
				__CLOVER_262_0.cloverRec.S[22586]++;try {
					__CLOVER_262_0.cloverRec.S[22587]++;fh = new FileHandler("test_unitaire.log",true);
					__CLOVER_262_0.cloverRec.S[22588]++;fh.setFormatter(new SimpleFormatter());
					__CLOVER_262_0.cloverRec.S[22589]++;logger.addHandler(fh);
				}
				catch(IOException e)
				{
					__CLOVER_262_0.cloverRec.S[22590]++;System.err.println(e);
					__CLOVER_262_0.cloverRec.S[22591]++;e.printStackTrace();
					assert((((false)) && (++__CLOVER_262_0.cloverRec.CT[6865]!=0|true)) || (++__CLOVER_262_0.cloverRec.CF[6865]==0&false));
				}
			}
			// Request that every detail gets logged.
			}__CLOVER_262_0.cloverRec.S[22592]++;logger.setLevel(Level.ALL);
		}
        // Log a simple INFO message.
        }__CLOVER_262_0.cloverRec.S[22593]++;logger.info("Demarrage du log");
	}

	protected void tearDown() throws Exception {__CLOVER_262_0.cloverRec.M[1570]++;
		__CLOVER_262_0.cloverRec.S[22594]++;super.tearDown();
		__CLOVER_262_0.cloverRec.S[22595]++;logger.info("Tests Finis");
		__CLOVER_262_0.cloverRec.S[22596]++;if((((fh!=null) && (++__CLOVER_262_0.cloverRec.CT[6866]!=0|true)) || (++__CLOVER_262_0.cloverRec.CF[6866]==0&false)))
		{{
			__CLOVER_262_0.cloverRec.S[22597]++;logger.removeHandler(fh);
			__CLOVER_262_0.cloverRec.S[22598]++;fh.close();
		}
	}}
	
	public static Test suite()
	{__CLOVER_262_0.cloverRec.M[1571]++;
//		TestSuite t=new TestSuite();
		//t.addTest(new TestXmlSimple("test_unitaire\\test_class1.xml"));
//		t.addTest(new Test_unitaire1());
//		return t;//new TestSuite(Test_unitaire1.class);
		__CLOVER_262_0.cloverRec.S[22599]++;return new TestSuite(Test_unitaire1.class);
	}

	public void testEgal()
	{__CLOVER_262_0.cloverRec.M[1572]++;
		__CLOVER_262_0.cloverRec.S[22600]++;logger.info("12==12");
		__CLOVER_262_0.cloverRec.S[22601]++;assertEquals(12,12);
	}

	public void testParser()
	{__CLOVER_262_0.cloverRec.M[1573]++;
		__CLOVER_262_0.cloverRec.S[22602]++;int i;
		__CLOVER_262_0.cloverRec.S[22603]++;Fichier_test fichier;
		__CLOVER_262_0.cloverRec.S[22604]++;Compiler_Eiffel c;
		__CLOVER_262_0.cloverRec.S[22605]++;String nom;
		__CLOVER_262_0.cloverRec.S[22606]++;logger.info("Debut Parser...");
		__CLOVER_262_0.cloverRec.S[22607]++;for(i=0;(((i<liste_fichier2.length) && (++__CLOVER_262_0.cloverRec.CT[6867]!=0|true)) || (++__CLOVER_262_0.cloverRec.CF[6867]==0&false));i++)
		{{
			__CLOVER_262_0.cloverRec.S[22608]++;fichier=liste_fichier2[i];
			__CLOVER_262_0.cloverRec.S[22609]++;assertTrue(fichier!=null);
			__CLOVER_262_0.cloverRec.S[22610]++;assertTrue(fichier.nom!=null);
			__CLOVER_262_0.cloverRec.S[22611]++;assertTrue(fichier.nom!="");
			__CLOVER_262_0.cloverRec.S[22612]++;nom="test\\"+fichier.nom;
			__CLOVER_262_0.cloverRec.S[22613]++;File f=new File(nom);
			__CLOVER_262_0.cloverRec.S[22614]++;assertTrue(f.exists());
			__CLOVER_262_0.cloverRec.S[22615]++;assertTrue(!f.isDirectory());
			//assert(Compiler_Eiffel.nb_erreur()==0);
			__CLOVER_262_0.cloverRec.S[22616]++;logger.info("parse de "+nom);
			__CLOVER_262_0.cloverRec.S[22617]++;c=new Compiler_Eiffel(nom);
			__CLOVER_262_0.cloverRec.S[22618]++;if((((c.nb_erreur()!=fichier.no_erreur) && (++__CLOVER_262_0.cloverRec.CT[6868]!=0|true)) || (++__CLOVER_262_0.cloverRec.CF[6868]==0&false)))
			{{
				__CLOVER_262_0.cloverRec.S[22619]++;logger.severe("Difference nb erreurs "+nom+":"+
				c.nb_erreur()+"!="+
				fichier.no_erreur);
			}
			/*assert(c.nb_erreur()==fichier.no_erreur):
					"Difference nb erreurs "+nom+":"+
					c.nb_erreur()+"!="+
					fichier.no_erreur;*/
			}__CLOVER_262_0.cloverRec.S[22620]++;assertTrue(c.nb_erreur()==fichier.no_erreur);
            //Compiler_Eiffel.logging=new Logging();
		}
		}__CLOVER_262_0.cloverRec.S[22621]++;logger.info("Test Parser Ok");
	}

	public static void main(String arg[])
	{__CLOVER_262_0.cloverRec.M[1574]++;
		//assert(junit.textui.TestRunner!=null);
		//if(arg.length>1)
		//	junit.awtui.TestRunner.run(suite());
		//else
			__CLOVER_262_0.cloverRec.S[22622]++;junit.textui.TestRunner.run(suite());
		//TestResult result= 
		//suite().run(null);
		//TestSuite suite=(TestSuite)suite();
		//TestResult result= suite.run(suite);
                /*AstXML ast=new AstXML();
                Classe c=ast.parse("");
                c.check_egal(c);*/
                __CLOVER_262_0.cloverRec.S[22623]++;System.out.println("Fin des tests");
	}
};

