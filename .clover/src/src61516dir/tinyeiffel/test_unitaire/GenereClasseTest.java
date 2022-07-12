/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ *//*
 * Created on 10 avr. 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package tinyeiffel.test_unitaire;

import tinyeiffel.compiler.Compiler_Eiffel;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * @author Barret
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class GenereClasseTest extends TestCase {static class __CLOVER_254_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}

	public void testGenereClasses() {__CLOVER_254_0.cloverRec.M[1499]++;
		__CLOVER_254_0.cloverRec.S[21757]++;GenereClasses c;
		__CLOVER_254_0.cloverRec.S[21758]++;Compiler_Eiffel compiler;
		__CLOVER_254_0.cloverRec.S[21759]++;String chemin,fichier_ace;
		__CLOVER_254_0.cloverRec.S[21760]++;int nb_classe=300,nb_feature=100,
			nb_instr=3,nb_local=2;
		__CLOVER_254_0.cloverRec.S[21761]++;chemin="test\\genere_classe\\test2";
		__CLOVER_254_0.cloverRec.S[21762]++;fichier_ace="test.ace";
		__CLOVER_254_0.cloverRec.S[21763]++;c=new GenereClasses(chemin,
				fichier_ace,nb_classe,nb_feature,
				nb_instr,nb_local);
		__CLOVER_254_0.cloverRec.S[21764]++;c.traitement();
		__CLOVER_254_0.cloverRec.S[21765]++;c=null;
		__CLOVER_254_0.cloverRec.S[21766]++;System.gc();
		__CLOVER_254_0.cloverRec.S[21767]++;compiler=new Compiler_Eiffel(chemin+"\\"+fichier_ace,
				Compiler_Eiffel.code_interm);
		__CLOVER_254_0.cloverRec.S[21768]++;assertTrue(compiler.nb_erreur()==0);
	}

	public static Test suite() 
	{__CLOVER_254_0.cloverRec.M[1500]++;
		__CLOVER_254_0.cloverRec.S[21769]++;TestSuite suite = new TestSuite();
		assert((((suite!=null)) && (++__CLOVER_254_0.cloverRec.CT[6674]!=0|true)) || (++__CLOVER_254_0.cloverRec.CF[6674]==0&false));
		//assert(TestAll.log!=null):"log null";

		__CLOVER_254_0.cloverRec.S[21770]++;suite.addTest(new TestSuite(GenereClasseTest.class));
		//log.info("nombre de suite de testes:"/*+suite.testCount()*/);
		
		__CLOVER_254_0.cloverRec.S[21771]++;return suite;
	}
	
	public static void main(String arg[])
	{__CLOVER_254_0.cloverRec.M[1501]++;
		__CLOVER_254_0.cloverRec.S[21772]++;junit.textui.TestRunner.run(suite());
	}
	
}
