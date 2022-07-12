/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ */package tinyeiffel.ast;

public class Attribut implements Cloneable,Traite
{static class __CLOVER_1_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}
	public Attribut(NomFeature nom)
	{__CLOVER_1_0.cloverRec.M[6]++;
		__CLOVER_1_0.cloverRec.S[12]++;this.nom=nom;
	}

	public Attribut(NomFeature nom,Classe classe,Feature feature)
	{__CLOVER_1_0.cloverRec.M[7]++;
		__CLOVER_1_0.cloverRec.S[13]++;this.nom=nom;
		__CLOVER_1_0.cloverRec.S[14]++;this.classe=classe;
		__CLOVER_1_0.cloverRec.S[15]++;this.feature=feature;
	}

	public Attribut(Attribut attr,Heritage heritage)
	{__CLOVER_1_0.cloverRec.M[8]++;
		__CLOVER_1_0.cloverRec.S[16]++;this.nom=attr.nom;
		__CLOVER_1_0.cloverRec.S[17]++;this.heritage=heritage;
		__CLOVER_1_0.cloverRec.S[18]++;this.classe=attr.classe;
		__CLOVER_1_0.cloverRec.S[19]++;this.feature=attr.feature;
	}

	public void renome(NomFeature nom)
	{__CLOVER_1_0.cloverRec.M[9]++;
		__CLOVER_1_0.cloverRec.S[20]++;nom_de=this.nom;
		__CLOVER_1_0.cloverRec.S[21]++;this.nom=nom;
	}

	public boolean equals(Object o)
	{__CLOVER_1_0.cloverRec.M[10]++;
		//System.out.println("test equals attribut");
		__CLOVER_1_0.cloverRec.S[22]++;if((((o instanceof Attribut) && (++__CLOVER_1_0.cloverRec.CT[5]!=0|true)) || (++__CLOVER_1_0.cloverRec.CF[5]==0&false)))
		{{
			__CLOVER_1_0.cloverRec.S[23]++;Attribut a=(Attribut)o;
			__CLOVER_1_0.cloverRec.S[24]++;return nom.equals(a.nom);
		}
		}else {__CLOVER_1_0.cloverRec.S[25]++;if((((o instanceof NomFeature) && (++__CLOVER_1_0.cloverRec.CT[6]!=0|true)) || (++__CLOVER_1_0.cloverRec.CF[6]==0&false)))
		{{
			__CLOVER_1_0.cloverRec.S[26]++;NomFeature a=(NomFeature)o;
			__CLOVER_1_0.cloverRec.S[27]++;return nom.equals(a);
		}
		}else {__CLOVER_1_0.cloverRec.S[28]++;if((((o instanceof String) && (++__CLOVER_1_0.cloverRec.CT[7]!=0|true)) || (++__CLOVER_1_0.cloverRec.CF[7]==0&false)))
		{{
			__CLOVER_1_0.cloverRec.S[29]++;String a=(String)o;
			__CLOVER_1_0.cloverRec.S[30]++;return nom.equals(a);
		}

		}}}__CLOVER_1_0.cloverRec.S[31]++;return false;
	}

	public String toString()
	{__CLOVER_1_0.cloverRec.M[11]++;
		__CLOVER_1_0.cloverRec.S[32]++;return nom.toString();
	}

	public Object clone()
	{__CLOVER_1_0.cloverRec.M[12]++;
		__CLOVER_1_0.cloverRec.S[33]++;Attribut a=new Attribut(nom);
		__CLOVER_1_0.cloverRec.S[34]++;a.nom_de=nom_de;
		__CLOVER_1_0.cloverRec.S[35]++;a.heritage=heritage;
		__CLOVER_1_0.cloverRec.S[36]++;a.classe=classe;
		__CLOVER_1_0.cloverRec.S[37]++;a.feature=feature;
		__CLOVER_1_0.cloverRec.S[38]++;return a;
	}

	/*public boolean meme_attribut(Attribut a)
	{
		
	}*/

	public void set_traite(boolean traite0)
	{__CLOVER_1_0.cloverRec.M[13]++;
		__CLOVER_1_0.cloverRec.S[39]++;this.traite=traite0;
	}

	public boolean get_traite()
	{__CLOVER_1_0.cloverRec.M[14]++;
		__CLOVER_1_0.cloverRec.S[40]++;return traite;
	}

	protected boolean traite=false;

	public NomFeature nom,nom_de;
	public Heritage heritage;
	public Classe classe;
	public Feature feature;
}