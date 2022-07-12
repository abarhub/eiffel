/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ */package tinyeiffel.ast;

import java.io.*;

public class Assert implements ToXML,Traite //extends ASTEiffel
{static class __CLOVER_0_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}
	public Assert(String nom,Expr expr)
	{__CLOVER_0_0.cloverRec.M[0]++;
		__CLOVER_0_0.cloverRec.S[0]++;this.nom=nom;
		__CLOVER_0_0.cloverRec.S[1]++;this.expr=expr;
	}

	public Assert(Expr expr)
	{__CLOVER_0_0.cloverRec.M[1]++;
		__CLOVER_0_0.cloverRec.S[2]++;this.nom="";
		__CLOVER_0_0.cloverRec.S[3]++;this.expr=expr;
	}

	public void check_egal(Assert a)
	{__CLOVER_0_0.cloverRec.M[2]++;
		assert((((a!=null)) && (++__CLOVER_0_0.cloverRec.CT[0]!=0|true)) || (++__CLOVER_0_0.cloverRec.CF[0]==0&false));
		assert((((a instanceof Assert)) && (++__CLOVER_0_0.cloverRec.CT[1]!=0|true)) || (++__CLOVER_0_0.cloverRec.CF[1]==0&false));
		assert((((nom.equals(a.nom))) && (++__CLOVER_0_0.cloverRec.CT[2]!=0|true)) || (++__CLOVER_0_0.cloverRec.CF[2]==0&false)):nom+"!="+a.nom;
		__CLOVER_0_0.cloverRec.S[4]++;expr.check_egal(a.expr);	
	}

	public void toXML(PrintStream out)
	{__CLOVER_0_0.cloverRec.M[3]++;
		assert((((out!=null)) && (++__CLOVER_0_0.cloverRec.CT[3]!=0|true)) || (++__CLOVER_0_0.cloverRec.CF[3]==0&false));
		__CLOVER_0_0.cloverRec.S[5]++;if((((nom==null||nom.equals("")) && (++__CLOVER_0_0.cloverRec.CT[4]!=0|true)) || (++__CLOVER_0_0.cloverRec.CF[4]==0&false)))
			{__CLOVER_0_0.cloverRec.S[6]++;out.println("<assert>");
		}else
			{__CLOVER_0_0.cloverRec.S[7]++;out.println("<assert tag=\""+nom+"\">");
		}__CLOVER_0_0.cloverRec.S[8]++;expr.toXML(out);
		__CLOVER_0_0.cloverRec.S[9]++;out.println("</assert>");
	}

	public void set_traite(boolean traite0)
	{__CLOVER_0_0.cloverRec.M[4]++;
		__CLOVER_0_0.cloverRec.S[10]++;this.traite=traite0;
	}

	public boolean get_traite()
	{__CLOVER_0_0.cloverRec.M[5]++;
		__CLOVER_0_0.cloverRec.S[11]++;return traite;
	}

	protected boolean traite=false;

	public String nom;
	public Expr expr;
}