/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ */package tinyeiffel.ast;

import java.io.*;

public class Position implements Traite
{static class __CLOVER_44_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}
	public Position(int x,int y)
	{__CLOVER_44_0.cloverRec.M[255]++;
		__CLOVER_44_0.cloverRec.S[1295]++;this.x=x;
		__CLOVER_44_0.cloverRec.S[1296]++;this.y=y;
	}

        public Position(String fichier,int x,int y)
        {__CLOVER_44_0.cloverRec.M[256]++;
                 __CLOVER_44_0.cloverRec.S[1297]++;this.x=x;
                 __CLOVER_44_0.cloverRec.S[1298]++;this.y=y;
                 __CLOVER_44_0.cloverRec.S[1299]++;this.fichier=fichier;
        }

        public String toString()
        {__CLOVER_44_0.cloverRec.M[257]++;
          __CLOVER_44_0.cloverRec.S[1300]++;return "("+x+","+y+","+fichier+")";
        }

	public boolean avant(Position p)
	{__CLOVER_44_0.cloverRec.M[258]++;
		assert((((p!=null)) && (++__CLOVER_44_0.cloverRec.CT[530]!=0|true)) || (++__CLOVER_44_0.cloverRec.CF[530]==0&false));
		__CLOVER_44_0.cloverRec.S[1301]++;return ((x<p.x)||((x==p.x)&&(y<p.y)));
	}

	public void set_traite(boolean traite0)
	{__CLOVER_44_0.cloverRec.M[259]++;
		__CLOVER_44_0.cloverRec.S[1302]++;this.traite=traite0;
	}

	public boolean get_traite()
	{__CLOVER_44_0.cloverRec.M[260]++;
		__CLOVER_44_0.cloverRec.S[1303]++;return traite;
	}

	protected boolean traite=false;

	public String NomClasse()
	{__CLOVER_44_0.cloverRec.M[261]++;
		__CLOVER_44_0.cloverRec.S[1304]++;int debut,fin;
		__CLOVER_44_0.cloverRec.S[1305]++;debut=fichier.lastIndexOf('\\');
		__CLOVER_44_0.cloverRec.S[1306]++;fin=fichier.lastIndexOf('.');
		__CLOVER_44_0.cloverRec.S[1307]++;if((((debut!=-1&&fin!=-1&&debut<fin) && (++__CLOVER_44_0.cloverRec.CT[531]!=0|true)) || (++__CLOVER_44_0.cloverRec.CF[531]==0&false)))
		{{
			__CLOVER_44_0.cloverRec.S[1308]++;return fichier.substring(debut+1,fin);
		}
		}else
		{{
			__CLOVER_44_0.cloverRec.S[1309]++;return fichier;
		}
	}}
	
	public void toXML(PrintStream out)
	{__CLOVER_44_0.cloverRec.M[262]++;
		assert((((out!=null)) && (++__CLOVER_44_0.cloverRec.CT[532]!=0|true)) || (++__CLOVER_44_0.cloverRec.CF[532]==0&false));
		__CLOVER_44_0.cloverRec.S[1310]++;out.println("<position nom_fichier=\""+fichier+
				"\" x=\""+x+"\" y=\""+y+"\" />");
	}
	
	public String fichier,texte;
	/**
	 * x est la ligne (>=1)
	 * y est la colonne (>=1)
	 */
	public int x,y;

}