/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ *//*
 * Created on 31 oct. 2003
 *
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
package tinyeiffel.compiler;

import tinyeiffel.ast.*;

/**
 * @author BARRET
 *
 * To change the template for this generated type comment go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
public class Attribut_Heritage {static class __CLOVER_57_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}

	public Attribut_Heritage(Table_Symbol table, NomFeature nom,
							boolean undefine,boolean redefine,
							Heritage herit,Attribut_Complet ac,
							Conversion conversion)
	{__CLOVER_57_0.cloverRec.M[321]++;
		assert((((table!=null)) && (++__CLOVER_57_0.cloverRec.CT[731]!=0|true)) || (++__CLOVER_57_0.cloverRec.CF[731]==0&false));
		assert((((nom!=null)) && (++__CLOVER_57_0.cloverRec.CT[732]!=0|true)) || (++__CLOVER_57_0.cloverRec.CF[732]==0&false));
		assert((((herit!=null)) && (++__CLOVER_57_0.cloverRec.CT[733]!=0|true)) || (++__CLOVER_57_0.cloverRec.CF[733]==0&false)):"nom="+nom+";classe="+table.classe.nom;
		assert((((ac!=null)) && (++__CLOVER_57_0.cloverRec.CT[734]!=0|true)) || (++__CLOVER_57_0.cloverRec.CF[734]==0&false));
		assert((((conversion!=null)) && (++__CLOVER_57_0.cloverRec.CT[735]!=0|true)) || (++__CLOVER_57_0.cloverRec.CF[735]==0&false));
		__CLOVER_57_0.cloverRec.S[1784]++;this.table=table;
		__CLOVER_57_0.cloverRec.S[1785]++;this.classe=ac.classe;
		//this.feature=feature;
		__CLOVER_57_0.cloverRec.S[1786]++;this.nom=nom;
		__CLOVER_57_0.cloverRec.S[1787]++;attribut=ac;
		__CLOVER_57_0.cloverRec.S[1788]++;this.redefine=redefine;
		__CLOVER_57_0.cloverRec.S[1789]++;this.undefine=undefine;
		__CLOVER_57_0.cloverRec.S[1790]++;heritage=herit;
		__CLOVER_57_0.cloverRec.S[1791]++;this.conversion=conversion;
		__CLOVER_57_0.cloverRec.S[1792]++;signature=new Signature(ac.signature,conversion);
	}

	public boolean est_deferred()
	{__CLOVER_57_0.cloverRec.M[322]++;
		__CLOVER_57_0.cloverRec.S[1793]++;return attribut.est_deferred();
		/*Attribut_Complet ac;
		ac=attribut;
		if(ac.feature_directe!=null)
		{
			return ac.feature_directe.is_deferred();
		}
		else if(ac.attribut_reel==null)
		{
			return false;
		}
		else
		{
			return ac.feature_reel.is_deferred();
		}*/
	}

	public boolean frozen()
	{__CLOVER_57_0.cloverRec.M[323]++;// TODO : a terminer
		//attribut.
		//assert(false);
		//return false;
		__CLOVER_57_0.cloverRec.S[1794]++;return attribut.frozen();
		
		//return getFeature().;
	}

	public Feature getFeature()
	{__CLOVER_57_0.cloverRec.M[324]++;
		assert((((attribut!=null)) && (++__CLOVER_57_0.cloverRec.CT[736]!=0|true)) || (++__CLOVER_57_0.cloverRec.CF[736]==0&false));
		assert((((attribut.verifie)) && (++__CLOVER_57_0.cloverRec.CT[737]!=0|true)) || (++__CLOVER_57_0.cloverRec.CF[737]==0&false));
		//assert(!est_deferred());
		__CLOVER_57_0.cloverRec.S[1795]++;return attribut.getFeature();
	}

	public Table_Symbol table;
	public Classe classe;
	//public Feature feature;
	public NomFeature nom;
	public boolean redefine,undefine;
	public Heritage heritage;
	public Attribut_Complet attribut; 
	public Conversion conversion;
	public Signature signature;

}
