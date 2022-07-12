/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ */package tinyeiffel.ast;

import java.io.*;

public abstract class Instr implements ToXML,Traite //extends ASTEiffel
{static class __CLOVER_30_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}
	/*public Instr(int op)
	{
		this.op=op;
	}

	public Expr expr,expr2;
	public int op;
	public static final int Affect=1,Tent_Affect=2,Loop=3,If=4,Creation=5,
		Retry=6,Inspect=7,Check=8,Appel=9,Else=10,ElseIf=11;
	/*public String str;
	public int entier;
	public double reel;
	public String caracter;*/
	/*public Vector parametre;
	public String nom;
	//public Vector tableau;
	public Vector liste_expr;
	public Vector when;
	public Vector liste_instr;
	public Instr suivant;
	public Vector from;
	public Vector loop;
	public String nom2;
	public Type type;*/
	
	public abstract void check_egal(Instr instr);
	public abstract void toXML(PrintStream out);
	
	public void set_traite(boolean traite0)
	{__CLOVER_30_0.cloverRec.M[179]++;
		__CLOVER_30_0.cloverRec.S[919]++;this.traite=traite0;
	}

	public boolean get_traite()
	{__CLOVER_30_0.cloverRec.M[180]++;
		__CLOVER_30_0.cloverRec.S[920]++;return traite;
	}

	protected boolean traite=false;

        public abstract Position debut();
        //public abstract Position fin();
	//public Instr suivant;
}