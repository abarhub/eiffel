/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ */package tinyeiffel.ast;

public class DeclareVar extends Declare_entite implements Traite
{static class __CLOVER_6_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}
	public DeclareVar(String nom,Type type)
	{__CLOVER_6_0.cloverRec.M[43]++;
		__CLOVER_6_0.cloverRec.S[189]++;this.nom=nom;
		__CLOVER_6_0.cloverRec.S[190]++;this.type=type;
	}

        public void set_token(Token tnom)
        {__CLOVER_6_0.cloverRec.M[44]++;
          __CLOVER_6_0.cloverRec.S[191]++;this.tnom=tnom;
        }

        public Position debut()
        {__CLOVER_6_0.cloverRec.M[45]++;
          __CLOVER_6_0.cloverRec.S[192]++;return tnom.debut();
        }

	public void check_egal(DeclareVar d)
	{__CLOVER_6_0.cloverRec.M[46]++;
		assert((((d!=null)) && (++__CLOVER_6_0.cloverRec.CT[83]!=0|true)) || (++__CLOVER_6_0.cloverRec.CF[83]==0&false));
		assert((((d instanceof DeclareVar)) && (++__CLOVER_6_0.cloverRec.CT[84]!=0|true)) || (++__CLOVER_6_0.cloverRec.CF[84]==0&false));
		assert((((nom.equals(d.nom))) && (++__CLOVER_6_0.cloverRec.CT[85]!=0|true)) || (++__CLOVER_6_0.cloverRec.CF[85]==0&false));
		__CLOVER_6_0.cloverRec.S[193]++;type.check_egal(d.type);
	}

	public String getNom()
	{__CLOVER_6_0.cloverRec.M[47]++;
		__CLOVER_6_0.cloverRec.S[194]++;return nom;
	}
	
	public Type getType()
	{__CLOVER_6_0.cloverRec.M[48]++;
		__CLOVER_6_0.cloverRec.S[195]++;return type;
	}

	public void set_traite(boolean traite0)
	{__CLOVER_6_0.cloverRec.M[49]++;
		__CLOVER_6_0.cloverRec.S[196]++;this.traite=traite0;
	}

	public boolean get_traite()
	{__CLOVER_6_0.cloverRec.M[50]++;
		__CLOVER_6_0.cloverRec.S[197]++;return traite;
	}

	public String toString2()
	{__CLOVER_6_0.cloverRec.M[51]++;
		__CLOVER_6_0.cloverRec.S[198]++;return nom+":"+type.toString2();
	}

	public boolean equals(Object o)
	{__CLOVER_6_0.cloverRec.M[52]++;
		__CLOVER_6_0.cloverRec.S[199]++;if((((o==null||!(o instanceof DeclareVar)) && (++__CLOVER_6_0.cloverRec.CT[86]!=0|true)) || (++__CLOVER_6_0.cloverRec.CF[86]==0&false)))
		{{
			__CLOVER_6_0.cloverRec.S[200]++;return false;
		}
		}else
		{{
			__CLOVER_6_0.cloverRec.S[201]++;DeclareVar d;
			__CLOVER_6_0.cloverRec.S[202]++;d=(DeclareVar)o;
			__CLOVER_6_0.cloverRec.S[203]++;return nom.equalsIgnoreCase(d.nom);
		}
	}}
	
	protected boolean traite=false;

	public String nom;
	public Type type;

    public Token tnom;
}