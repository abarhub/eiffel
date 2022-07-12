/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ *//*
 * Created on 6 oct. 2003
 *
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
package tinyeiffel.erreur;

import tinyeiffel.ast.*;
//import compiler.*;

/**
 * @author BARRET
 *
 * Erreur VFFD no 2
 * Des attributs d'une meme classe ont des noms identiques
 */
public class ErreurVFFD2 extends Erreur {static class __CLOVER_112_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}

	public ErreurVFFD2(Attribut a1,Attribut a2)
	{__CLOVER_112_0.cloverRec.M[860]++;
		assert((((a1!=null)) && (++__CLOVER_112_0.cloverRec.CT[3263]!=0|true)) || (++__CLOVER_112_0.cloverRec.CF[3263]==0&false));
		assert((((a2!=null)) && (++__CLOVER_112_0.cloverRec.CT[3264]!=0|true)) || (++__CLOVER_112_0.cloverRec.CF[3264]==0&false));
		assert((((a1.nom.equals(a2.nom))) && (++__CLOVER_112_0.cloverRec.CT[3265]!=0|true)) || (++__CLOVER_112_0.cloverRec.CF[3265]==0&false));
		assert((((a1.classe.nom.compareToIgnoreCase(a2.classe.nom)==0)) && (++__CLOVER_112_0.cloverRec.CT[3266]!=0|true)) || (++__CLOVER_112_0.cloverRec.CF[3266]==0&false));
		//assert(a1.nom.debut().avant(a2.nom.debut()));
		__CLOVER_112_0.cloverRec.S[14582]++;attribut1=a1;
		__CLOVER_112_0.cloverRec.S[14583]++;attribut2=a2;
		__CLOVER_112_0.cloverRec.S[14584]++;simple=false;
	}

	public ErreurVFFD2(String nom_classe,NomFeature nom,
			Position pos1,Position pos2)
	{__CLOVER_112_0.cloverRec.M[861]++;
		assert((((nom_classe!=null)) && (++__CLOVER_112_0.cloverRec.CT[3267]!=0|true)) || (++__CLOVER_112_0.cloverRec.CF[3267]==0&false));
		assert((((nom!=null)) && (++__CLOVER_112_0.cloverRec.CT[3268]!=0|true)) || (++__CLOVER_112_0.cloverRec.CF[3268]==0&false));
		assert((((pos1!=null)) && (++__CLOVER_112_0.cloverRec.CT[3269]!=0|true)) || (++__CLOVER_112_0.cloverRec.CF[3269]==0&false));
		assert((((pos2!=null)) && (++__CLOVER_112_0.cloverRec.CT[3270]!=0|true)) || (++__CLOVER_112_0.cloverRec.CF[3270]==0&false));
		__CLOVER_112_0.cloverRec.S[14585]++;simple=true;
		__CLOVER_112_0.cloverRec.S[14586]++;this.nom_classe=nom_classe;
		__CLOVER_112_0.cloverRec.S[14587]++;this.nom=nom;
		__CLOVER_112_0.cloverRec.S[14588]++;this.pos1=pos1;
		__CLOVER_112_0.cloverRec.S[14589]++;this.pos2=pos2;
	}

	Attribut attribut1,attribut2;
	boolean simple;
	String nom_classe;
	NomFeature nom;
	Position pos1, pos2;

	public String toString()
	{__CLOVER_112_0.cloverRec.M[862]++;
		__CLOVER_112_0.cloverRec.S[14590]++;return toMsg();
	}

	/* (non-Javadoc)
	 * @see erreur.Erreur#toMsg()
	 */
	public String toMsg() {__CLOVER_112_0.cloverRec.M[863]++;
		__CLOVER_112_0.cloverRec.S[14591]++;String res;
		__CLOVER_112_0.cloverRec.S[14592]++;if((((simple) && (++__CLOVER_112_0.cloverRec.CT[3271]!=0|true)) || (++__CLOVER_112_0.cloverRec.CF[3271]==0&false)))
		{{
			__CLOVER_112_0.cloverRec.S[14593]++;res="Dans la classe "+nom_classe+", "+
				"l'attribut "+nom+" est defini plusieurs fois ("+
				pos1+" et "+pos2+")";
		}
		}else
		{{
			__CLOVER_112_0.cloverRec.S[14594]++;res="Dans la classe "+attribut1.classe.nom+", "+
				"l'attribut "+attribut1+" est defini plusieurs fois ("+
				attribut1.nom.debut()+" et "+attribut2.nom.debut()+")";
		}
		}__CLOVER_112_0.cloverRec.S[14595]++;return res;
	}

}
