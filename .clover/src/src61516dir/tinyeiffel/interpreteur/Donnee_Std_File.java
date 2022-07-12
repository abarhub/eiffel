/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ *//*
 * Created on 27 juin 2004
 *
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
package tinyeiffel.interpreteur;

import tinyeiffel.ast.*;
import java.io.*;

/**
 * @author BARRET
 *
 * To change the template for this generated type comment go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
public class Donnee_Std_File extends Donnee {static class __CLOVER_237_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}

	/**
	 * @param nom_classe
	 * @param expanded
	 */
	public Donnee_Std_File() {
		super("STD_FILE", false);__CLOVER_237_0.cloverRec.S[19815]++;__CLOVER_237_0.cloverRec.M[1374]++;
		__CLOVER_237_0.cloverRec.S[19816]++;out=System.out;
	}
	
	public String toString()
	{__CLOVER_237_0.cloverRec.M[1375]++;
		__CLOVER_237_0.cloverRec.S[19817]++;return "STD_FILE";
	}
	
	public void affiche(Donnee_Int i)
	{__CLOVER_237_0.cloverRec.M[1376]++;
		__CLOVER_237_0.cloverRec.S[19818]++;out.println(i.get());
	}
	
	public Donnee fonction_externe(NomFeature nf,Donnee param[])
	{__CLOVER_237_0.cloverRec.M[1377]++;
		assert((((nf!=null)) && (++__CLOVER_237_0.cloverRec.CT[5689]!=0|true)) || (++__CLOVER_237_0.cloverRec.CF[5689]==0&false));
		//assert(nf.nom2!=null):"nom="+nf.nom;
		//assert(nf.nom2.chaine_unique()!=null);
		//if(nf.infix&&nf.nom2.chaine_unique().equalsIgnoreCase("\"+\""))
		__CLOVER_237_0.cloverRec.S[19819]++;if((((nf.nom.equalsIgnoreCase("put_integer")) && (++__CLOVER_237_0.cloverRec.CT[5690]!=0|true)) || (++__CLOVER_237_0.cloverRec.CF[5690]==0&false)))
		{{
			assert((((param!=null)) && (++__CLOVER_237_0.cloverRec.CT[5691]!=0|true)) || (++__CLOVER_237_0.cloverRec.CF[5691]==0&false));
			assert((((param.length==1)) && (++__CLOVER_237_0.cloverRec.CT[5692]!=0|true)) || (++__CLOVER_237_0.cloverRec.CF[5692]==0&false));
			assert((((param[0]!=null)) && (++__CLOVER_237_0.cloverRec.CT[5693]!=0|true)) || (++__CLOVER_237_0.cloverRec.CF[5693]==0&false));
			assert((((param[0]instanceof Donnee_Int)) && (++__CLOVER_237_0.cloverRec.CT[5694]!=0|true)) || (++__CLOVER_237_0.cloverRec.CF[5694]==0&false));
			__CLOVER_237_0.cloverRec.S[19820]++;affiche((Donnee_Int)param[0]);
			__CLOVER_237_0.cloverRec.S[19821]++;return null;
		}
		}else
		{{
			__CLOVER_237_0.cloverRec.S[19822]++;super.fonction_externe(nf,param);
		}
		}__CLOVER_237_0.cloverRec.S[19823]++;return null;
	}
	
	protected PrintStream out;
	
}
