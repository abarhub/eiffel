/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ *//*
 * Created on 11 juin 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package tinyeiffel.test_unitaire;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import tinyeiffel.intermediaire.*;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * @author barret
 *
 * Test la verification de coherence du code intermediaire
 * 
 */
public class TestVerifInterm extends TestCase {static class __CLOVER_260_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}

	public static void main(String[] args) {__CLOVER_260_0.cloverRec.M[1549]++;
		__CLOVER_260_0.cloverRec.S[22334]++;junit.swingui.TestRunner.run(TestVerifInterm.class);
	}

	/*
	 * @see TestCase#setUp()
	 */
	protected void setUp() throws Exception {__CLOVER_260_0.cloverRec.M[1550]++;
		__CLOVER_260_0.cloverRec.S[22335]++;super.setUp();
		__CLOVER_260_0.cloverRec.S[22336]++;if((((logger==null||true) && (++__CLOVER_260_0.cloverRec.CT[6820]!=0|true)) || (++__CLOVER_260_0.cloverRec.CF[6820]==0&false)))
		{{
			__CLOVER_260_0.cloverRec.S[22337]++;logger=Logger.getLogger("tinyeiffel.test.test_verif_interm");
			__CLOVER_260_0.cloverRec.S[22338]++;if((((fh==null) && (++__CLOVER_260_0.cloverRec.CT[6821]!=0|true)) || (++__CLOVER_260_0.cloverRec.CF[6821]==0&false)))
			{{
				__CLOVER_260_0.cloverRec.S[22339]++;try {
					__CLOVER_260_0.cloverRec.S[22340]++;fh = new FileHandler("test_verif_interm.log",true);
					__CLOVER_260_0.cloverRec.S[22341]++;fh.setFormatter(new SimpleFormatter());
					__CLOVER_260_0.cloverRec.S[22342]++;logger.addHandler(fh);
				}
				catch(IOException e)
				{
					__CLOVER_260_0.cloverRec.S[22343]++;System.err.println(e);
					__CLOVER_260_0.cloverRec.S[22344]++;e.printStackTrace();
					assert((((false)) && (++__CLOVER_260_0.cloverRec.CT[6822]!=0|true)) || (++__CLOVER_260_0.cloverRec.CF[6822]==0&false));
				}
			}
			// Request that every detail gets logged.
			}__CLOVER_260_0.cloverRec.S[22345]++;logger.setLevel(Level.ALL);
		}
        // Log a simple INFO message.
        }__CLOVER_260_0.cloverRec.S[22346]++;logger.info("Demarrage du log");
	}

	/*
	 * @see TestCase#tearDown()
	 */
	protected void tearDown() throws Exception {__CLOVER_260_0.cloverRec.M[1551]++;
		__CLOVER_260_0.cloverRec.S[22347]++;super.tearDown();
		__CLOVER_260_0.cloverRec.S[22348]++;logger.info("Tests Finis");
		__CLOVER_260_0.cloverRec.S[22349]++;if((((fh!=null) && (++__CLOVER_260_0.cloverRec.CT[6823]!=0|true)) || (++__CLOVER_260_0.cloverRec.CF[6823]==0&false)))
		{{
			__CLOVER_260_0.cloverRec.S[22350]++;logger.removeHandler(fh);
			__CLOVER_260_0.cloverRec.S[22351]++;fh.close();
			__CLOVER_260_0.cloverRec.S[22352]++;logger=null;
			__CLOVER_260_0.cloverRec.S[22353]++;fh=null;
		}
	}}

	/**
	 * Constructor for TestVerifInterm.
	 * @param arg0
	 */
	public TestVerifInterm(String arg0) {
		super(arg0);__CLOVER_260_0.cloverRec.S[22354]++;__CLOVER_260_0.cloverRec.M[1552]++;
	}

	public static Test suite()
	{__CLOVER_260_0.cloverRec.M[1553]++;
		__CLOVER_260_0.cloverRec.S[22355]++;return new TestSuite(TestVerifInterm.class);
	}

	public void test_assert()
	{__CLOVER_260_0.cloverRec.M[1554]++;
		__CLOVER_260_0.cloverRec.S[22356]++;logger.info("V\u00e9rification assert ...");
		__CLOVER_260_0.cloverRec.S[22357]++;boolean test=false;
		assert((((test=true))));
		__CLOVER_260_0.cloverRec.S[22358]++;assertTrue(test);
		__CLOVER_260_0.cloverRec.S[22359]++;logger.info("V\u00e9rification assert faite");
	}
	
	public void testCIVerification() {__CLOVER_260_0.cloverRec.M[1555]++;
		__CLOVER_260_0.cloverRec.S[22360]++;FichierVerifInterm liste_fichiers[],f;
		__CLOVER_260_0.cloverRec.S[22361]++;CIInputXML inp;
		__CLOVER_260_0.cloverRec.S[22362]++;CIProgramme programme;
		__CLOVER_260_0.cloverRec.S[22363]++;CIVerification verif;
		__CLOVER_260_0.cloverRec.S[22364]++;logger.info("Debut Verification...");
		__CLOVER_260_0.cloverRec.S[22365]++;liste_fichiers=lecture_fichier("test/verif_interm/test.xml");
		assert((((liste_fichiers!=null)) && (++__CLOVER_260_0.cloverRec.CT[6825]!=0|true)) || (++__CLOVER_260_0.cloverRec.CF[6825]==0&false));
		assert((((liste_fichiers.length>0)) && (++__CLOVER_260_0.cloverRec.CT[6826]!=0|true)) || (++__CLOVER_260_0.cloverRec.CF[6826]==0&false));
		__CLOVER_260_0.cloverRec.S[22366]++;int i;
		__CLOVER_260_0.cloverRec.S[22367]++;for(i=0;(((i<liste_fichiers.length) && (++__CLOVER_260_0.cloverRec.CT[6827]!=0|true)) || (++__CLOVER_260_0.cloverRec.CF[6827]==0&false));i++)
		{{
			__CLOVER_260_0.cloverRec.S[22368]++;f=liste_fichiers[i];
			assert((((f!=null)) && (++__CLOVER_260_0.cloverRec.CT[6828]!=0|true)) || (++__CLOVER_260_0.cloverRec.CF[6828]==0&false));
			assert((((f.nom!=null)) && (++__CLOVER_260_0.cloverRec.CT[6829]!=0|true)) || (++__CLOVER_260_0.cloverRec.CF[6829]==0&false));
			__CLOVER_260_0.cloverRec.S[22369]++;inp=new CIInputXML(f.nom);
			__CLOVER_260_0.cloverRec.S[22370]++;programme=inp.programme;
			__CLOVER_260_0.cloverRec.S[22371]++;assertTrue(programme!=null);
			__CLOVER_260_0.cloverRec.S[22372]++;verif=new CIVerification(programme);
			__CLOVER_260_0.cloverRec.S[22373]++;if((((verif.verification()) && (++__CLOVER_260_0.cloverRec.CT[6830]!=0|true)) || (++__CLOVER_260_0.cloverRec.CF[6830]==0&false)))
			{{// Il n' a pas d'erreur
				assert((((!f.erreur())) && (++__CLOVER_260_0.cloverRec.CT[6831]!=0|true)) || (++__CLOVER_260_0.cloverRec.CF[6831]==0&false)):"Il y a des erreurs :"+f.MsgErreur;
			}
			}else
			{{// Il y a des erreurs
				__CLOVER_260_0.cloverRec.S[22374]++;if((((i==11) && (++__CLOVER_260_0.cloverRec.CT[6832]!=0|true)) || (++__CLOVER_260_0.cloverRec.CF[6832]==0&false)))
				{{
					__CLOVER_260_0.cloverRec.S[22375]++;System.out.println("coucou");
				}
				}assert((((f.erreur())) && (++__CLOVER_260_0.cloverRec.CT[6833]!=0|true)) || (++__CLOVER_260_0.cloverRec.CF[6833]==0&false)):"Il n'y a pas d'erreur ("+
					verif.message_erreur()[0]+":"+f.nom+")";
				assert((((f.equivalent(verif.message_erreur(),"Verification"))) && (++__CLOVER_260_0.cloverRec.CT[6834]!=0|true)) || (++__CLOVER_260_0.cloverRec.CF[6834]==0&false)):
					f.typeErreur+":"+f.nom;
			}
		}}
		}__CLOVER_260_0.cloverRec.S[22376]++;logger.info("Il y a eu "+liste_fichiers.length+
				" verifications");
		__CLOVER_260_0.cloverRec.S[22377]++;System.out.println("Il y a eu "+liste_fichiers.length+
				" verifications");
	}
	
	public FichierVerifInterm[] lecture_fichier(String nom)
	{__CLOVER_260_0.cloverRec.M[1556]++;
		assert((((nom!=null)) && (++__CLOVER_260_0.cloverRec.CT[6835]!=0|true)) || (++__CLOVER_260_0.cloverRec.CF[6835]==0&false));
		__CLOVER_260_0.cloverRec.S[22378]++;FichierVerifInterm[] res=null;
		__CLOVER_260_0.cloverRec.S[22379]++;XMLVerifInterm xml;
		__CLOVER_260_0.cloverRec.S[22380]++;xml=new XMLVerifInterm();
		__CLOVER_260_0.cloverRec.S[22381]++;res=xml.parse(nom);
		__CLOVER_260_0.cloverRec.S[22382]++;return res;
	}
	
	//public static FichierVerifInterm liste_fichier[];
	protected Logger logger;
	protected FileHandler fh;
}
