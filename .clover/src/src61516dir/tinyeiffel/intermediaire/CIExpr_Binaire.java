/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ *//*
 * Created on 5 f\u00e9vr. 2004
 *
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
package tinyeiffel.intermediaire;

import java.io.*;
/**
 * @author BARRET
 *
 * To change the template for this generated type comment go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
public class CIExpr_Binaire extends CIExpr {static class __CLOVER_196_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}

	/**
	 * 
	 */
	public CIExpr_Binaire(int op,CIExpr_Scalaire expr1,
			CIExpr_Scalaire expr2,CISource source) {__CLOVER_196_0.cloverRec.M[1156]++;
		assert((((expr1!=null)) && (++__CLOVER_196_0.cloverRec.CT[4321]!=0|true)) || (++__CLOVER_196_0.cloverRec.CF[4321]==0&false));
		assert((((expr2!=null)) && (++__CLOVER_196_0.cloverRec.CT[4322]!=0|true)) || (++__CLOVER_196_0.cloverRec.CF[4322]==0&false));
		__CLOVER_196_0.cloverRec.S[17205]++;this.op=op;
		__CLOVER_196_0.cloverRec.S[17206]++;this.expr1=expr1;
		__CLOVER_196_0.cloverRec.S[17207]++;this.expr2=expr2;
		__CLOVER_196_0.cloverRec.S[17208]++;this.source=source;
	}

	public String toString()
	{__CLOVER_196_0.cloverRec.M[1157]++;
		__CLOVER_196_0.cloverRec.S[17209]++;return expr1.toString()+" "+nom_op()+" "+expr2.toString();
	}

	public String nom_op()
	{__CLOVER_196_0.cloverRec.M[1158]++;
		__CLOVER_196_0.cloverRec.S[17210]++;boolean __CLOVER_bool0=false;switch(op)
		{
			case Plus:if (!__CLOVER_bool0) {__CLOVER_196_0.cloverRec.S[17211]++;__CLOVER_bool0=true;} __CLOVER_196_0.cloverRec.S[17212]++;return "+";
			case Div_entier:if (!__CLOVER_bool0) {__CLOVER_196_0.cloverRec.S[17213]++;__CLOVER_bool0=true;} __CLOVER_196_0.cloverRec.S[17214]++;return "//";
			case Moins:if (!__CLOVER_bool0) {__CLOVER_196_0.cloverRec.S[17215]++;__CLOVER_bool0=true;} __CLOVER_196_0.cloverRec.S[17216]++;return "-";
			case Fois:if (!__CLOVER_bool0) {__CLOVER_196_0.cloverRec.S[17217]++;__CLOVER_bool0=true;} __CLOVER_196_0.cloverRec.S[17218]++;return "*";
			case Div_reel:if (!__CLOVER_bool0) {__CLOVER_196_0.cloverRec.S[17219]++;__CLOVER_bool0=true;} __CLOVER_196_0.cloverRec.S[17220]++;return "/";
			case Puiss:if (!__CLOVER_bool0) {__CLOVER_196_0.cloverRec.S[17221]++;__CLOVER_bool0=true;} __CLOVER_196_0.cloverRec.S[17222]++;return "^";
			case Mod:if (!__CLOVER_bool0) {__CLOVER_196_0.cloverRec.S[17223]++;__CLOVER_bool0=true;} __CLOVER_196_0.cloverRec.S[17224]++;return "mod";
			case Sup:if (!__CLOVER_bool0) {__CLOVER_196_0.cloverRec.S[17225]++;__CLOVER_bool0=true;} __CLOVER_196_0.cloverRec.S[17226]++;return ">=";
			case SupS:if (!__CLOVER_bool0) {__CLOVER_196_0.cloverRec.S[17227]++;__CLOVER_bool0=true;} __CLOVER_196_0.cloverRec.S[17228]++;return ">";
			case Egal:if (!__CLOVER_bool0) {__CLOVER_196_0.cloverRec.S[17229]++;__CLOVER_bool0=true;} __CLOVER_196_0.cloverRec.S[17230]++;return "=";
			case Inf:if (!__CLOVER_bool0) {__CLOVER_196_0.cloverRec.S[17231]++;__CLOVER_bool0=true;} __CLOVER_196_0.cloverRec.S[17232]++;return "<=";
			case InfS:if (!__CLOVER_bool0) {__CLOVER_196_0.cloverRec.S[17233]++;__CLOVER_bool0=true;} __CLOVER_196_0.cloverRec.S[17234]++;return "<";
			case Diff:if (!__CLOVER_bool0) {__CLOVER_196_0.cloverRec.S[17235]++;__CLOVER_bool0=true;} __CLOVER_196_0.cloverRec.S[17236]++;return "/=";
			case And:if (!__CLOVER_bool0) {__CLOVER_196_0.cloverRec.S[17237]++;__CLOVER_bool0=true;} __CLOVER_196_0.cloverRec.S[17238]++;return "and";
			case Or:if (!__CLOVER_bool0) {__CLOVER_196_0.cloverRec.S[17239]++;__CLOVER_bool0=true;} __CLOVER_196_0.cloverRec.S[17240]++;return "or";
			case Xor:if (!__CLOVER_bool0) {__CLOVER_196_0.cloverRec.S[17241]++;__CLOVER_bool0=true;} __CLOVER_196_0.cloverRec.S[17242]++;return "xor";
			case Implies:if (!__CLOVER_bool0) {__CLOVER_196_0.cloverRec.S[17243]++;__CLOVER_bool0=true;} __CLOVER_196_0.cloverRec.S[17244]++;return "implies";
			case And_Then:if (!__CLOVER_bool0) {__CLOVER_196_0.cloverRec.S[17245]++;__CLOVER_bool0=true;} __CLOVER_196_0.cloverRec.S[17246]++;return "and then";
			case Or_Else:if (!__CLOVER_bool0) {__CLOVER_196_0.cloverRec.S[17247]++;__CLOVER_bool0=true;} __CLOVER_196_0.cloverRec.S[17248]++;return "or else";
		}
		assert((((false)) && (++__CLOVER_196_0.cloverRec.CT[4323]!=0|true)) || (++__CLOVER_196_0.cloverRec.CF[4323]==0&false));
		__CLOVER_196_0.cloverRec.S[17249]++;return null;
	}
	
	public void toXML(PrintStream out)
	{__CLOVER_196_0.cloverRec.M[1159]++;
		__CLOVER_196_0.cloverRec.S[17250]++;out.print("<expression_bin type=\"");
		__CLOVER_196_0.cloverRec.S[17251]++;boolean __CLOVER_bool1=false;switch(op)
		{
			case Plus:if (!__CLOVER_bool1) {__CLOVER_196_0.cloverRec.S[17252]++;__CLOVER_bool1=true;} __CLOVER_196_0.cloverRec.S[17253]++;out.print("plus");__CLOVER_196_0.cloverRec.S[17254]++;break;
			case Div_entier:if (!__CLOVER_bool1) {__CLOVER_196_0.cloverRec.S[17255]++;__CLOVER_bool1=true;} __CLOVER_196_0.cloverRec.S[17256]++;out.print("div_entier");__CLOVER_196_0.cloverRec.S[17257]++;break;
			case Moins:if (!__CLOVER_bool1) {__CLOVER_196_0.cloverRec.S[17258]++;__CLOVER_bool1=true;} __CLOVER_196_0.cloverRec.S[17259]++;out.print("moins");__CLOVER_196_0.cloverRec.S[17260]++;break;
			case Fois:if (!__CLOVER_bool1) {__CLOVER_196_0.cloverRec.S[17261]++;__CLOVER_bool1=true;} __CLOVER_196_0.cloverRec.S[17262]++;out.print("fois");__CLOVER_196_0.cloverRec.S[17263]++;break;
			case Div_reel:if (!__CLOVER_bool1) {__CLOVER_196_0.cloverRec.S[17264]++;__CLOVER_bool1=true;} __CLOVER_196_0.cloverRec.S[17265]++;out.print("div_reel");__CLOVER_196_0.cloverRec.S[17266]++;break;
			case Puiss:if (!__CLOVER_bool1) {__CLOVER_196_0.cloverRec.S[17267]++;__CLOVER_bool1=true;} __CLOVER_196_0.cloverRec.S[17268]++;out.print("puiss");__CLOVER_196_0.cloverRec.S[17269]++;break;
			case Mod:if (!__CLOVER_bool1) {__CLOVER_196_0.cloverRec.S[17270]++;__CLOVER_bool1=true;} __CLOVER_196_0.cloverRec.S[17271]++;out.print("mod");__CLOVER_196_0.cloverRec.S[17272]++;break;
			case Sup:if (!__CLOVER_bool1) {__CLOVER_196_0.cloverRec.S[17273]++;__CLOVER_bool1=true;} __CLOVER_196_0.cloverRec.S[17274]++;out.print("sup");__CLOVER_196_0.cloverRec.S[17275]++;break;
			case SupS:if (!__CLOVER_bool1) {__CLOVER_196_0.cloverRec.S[17276]++;__CLOVER_bool1=true;} __CLOVER_196_0.cloverRec.S[17277]++;out.print("sups");__CLOVER_196_0.cloverRec.S[17278]++;break;
			case Egal:if (!__CLOVER_bool1) {__CLOVER_196_0.cloverRec.S[17279]++;__CLOVER_bool1=true;} __CLOVER_196_0.cloverRec.S[17280]++;out.print("egal");__CLOVER_196_0.cloverRec.S[17281]++;break;
			case Inf:if (!__CLOVER_bool1) {__CLOVER_196_0.cloverRec.S[17282]++;__CLOVER_bool1=true;} __CLOVER_196_0.cloverRec.S[17283]++;out.print("inf");__CLOVER_196_0.cloverRec.S[17284]++;break;
			case InfS:if (!__CLOVER_bool1) {__CLOVER_196_0.cloverRec.S[17285]++;__CLOVER_bool1=true;} __CLOVER_196_0.cloverRec.S[17286]++;out.print("infs");__CLOVER_196_0.cloverRec.S[17287]++;break;
			case Diff:if (!__CLOVER_bool1) {__CLOVER_196_0.cloverRec.S[17288]++;__CLOVER_bool1=true;} __CLOVER_196_0.cloverRec.S[17289]++;out.print("diff");__CLOVER_196_0.cloverRec.S[17290]++;break;
			case And:if (!__CLOVER_bool1) {__CLOVER_196_0.cloverRec.S[17291]++;__CLOVER_bool1=true;} __CLOVER_196_0.cloverRec.S[17292]++;out.print("and");__CLOVER_196_0.cloverRec.S[17293]++;break;
			case Or:if (!__CLOVER_bool1) {__CLOVER_196_0.cloverRec.S[17294]++;__CLOVER_bool1=true;} __CLOVER_196_0.cloverRec.S[17295]++;out.print("or");__CLOVER_196_0.cloverRec.S[17296]++;break;
			case Xor:if (!__CLOVER_bool1) {__CLOVER_196_0.cloverRec.S[17297]++;__CLOVER_bool1=true;} __CLOVER_196_0.cloverRec.S[17298]++;out.print("xor");__CLOVER_196_0.cloverRec.S[17299]++;break;
			case Implies:if (!__CLOVER_bool1) {__CLOVER_196_0.cloverRec.S[17300]++;__CLOVER_bool1=true;} __CLOVER_196_0.cloverRec.S[17301]++;out.print("implies");__CLOVER_196_0.cloverRec.S[17302]++;break;
			case And_Then:if (!__CLOVER_bool1) {__CLOVER_196_0.cloverRec.S[17303]++;__CLOVER_bool1=true;} __CLOVER_196_0.cloverRec.S[17304]++;out.print("and_then");__CLOVER_196_0.cloverRec.S[17305]++;break;
			case Or_Else:if (!__CLOVER_bool1) {__CLOVER_196_0.cloverRec.S[17306]++;__CLOVER_bool1=true;} __CLOVER_196_0.cloverRec.S[17307]++;out.print("or_else");__CLOVER_196_0.cloverRec.S[17308]++;break;
			default:if (!__CLOVER_bool1) {__CLOVER_196_0.cloverRec.S[17309]++;__CLOVER_bool1=true;}assert((((false)) && (++__CLOVER_196_0.cloverRec.CT[4324]!=0|true)) || (++__CLOVER_196_0.cloverRec.CF[4324]==0&false)):"op="+op;
		}
		__CLOVER_196_0.cloverRec.S[17310]++;out.println("\">");
		__CLOVER_196_0.cloverRec.S[17311]++;expr1.toXML(out);
		__CLOVER_196_0.cloverRec.S[17312]++;expr2.toXML(out);
		__CLOVER_196_0.cloverRec.S[17313]++;if((((source!=null) && (++__CLOVER_196_0.cloverRec.CT[4325]!=0|true)) || (++__CLOVER_196_0.cloverRec.CF[4325]==0&false)))
		{{
			__CLOVER_196_0.cloverRec.S[17314]++;source.toXML(out);
		}
		}__CLOVER_196_0.cloverRec.S[17315]++;out.println("</expression_bin>");
	}
	

	public void check_egal(CIExpr e)
	{__CLOVER_196_0.cloverRec.M[1160]++;
		assert((((e!=null)) && (++__CLOVER_196_0.cloverRec.CT[4326]!=0|true)) || (++__CLOVER_196_0.cloverRec.CF[4326]==0&false));
		assert((((e instanceof CIExpr_Binaire)) && (++__CLOVER_196_0.cloverRec.CT[4327]!=0|true)) || (++__CLOVER_196_0.cloverRec.CF[4327]==0&false));
		__CLOVER_196_0.cloverRec.S[17316]++;CIExpr_Binaire e2=(CIExpr_Binaire)e;
		assert((((expr1!=null)) && (++__CLOVER_196_0.cloverRec.CT[4328]!=0|true)) || (++__CLOVER_196_0.cloverRec.CF[4328]==0&false));
		assert((((expr2!=null)) && (++__CLOVER_196_0.cloverRec.CT[4329]!=0|true)) || (++__CLOVER_196_0.cloverRec.CF[4329]==0&false));
		assert((((e2.expr1!=null)) && (++__CLOVER_196_0.cloverRec.CT[4330]!=0|true)) || (++__CLOVER_196_0.cloverRec.CF[4330]==0&false));
		assert((((e2.expr2!=null)) && (++__CLOVER_196_0.cloverRec.CT[4331]!=0|true)) || (++__CLOVER_196_0.cloverRec.CF[4331]==0&false));
		assert((((op>=1)) && (++__CLOVER_196_0.cloverRec.CT[4332]!=0|true)) || (++__CLOVER_196_0.cloverRec.CF[4332]==0&false));
		assert((((op==e2.op)) && (++__CLOVER_196_0.cloverRec.CT[4333]!=0|true)) || (++__CLOVER_196_0.cloverRec.CF[4333]==0&false));
		__CLOVER_196_0.cloverRec.S[17317]++;expr1.check_egal(e2.expr1);
		__CLOVER_196_0.cloverRec.S[17318]++;expr2.check_egal(e2.expr2);
		__CLOVER_196_0.cloverRec.S[17319]++;if((((source!=null) && (++__CLOVER_196_0.cloverRec.CT[4334]!=0|true)) || (++__CLOVER_196_0.cloverRec.CF[4334]==0&false)))
		{{
			__CLOVER_196_0.cloverRec.S[17320]++;source.check_egal(e2.source);
		}
		}else
		{{
			assert((((e2.source==null)) && (++__CLOVER_196_0.cloverRec.CT[4335]!=0|true)) || (++__CLOVER_196_0.cloverRec.CF[4335]==0&false));
		}
	}}
	
	public static final int Plus=1,Moins=2,Fois=3,Div_entier=4,
							Div_reel=5,Puiss=6,Mod=7,Sup=8,SupS=9,
							Egal=10,Inf=11,InfS=12,Diff=13,And=14,
							Or=15,Xor=16,Implies=17,And_Then=18,
							Or_Else=19;

	public CIExpr_Scalaire expr1,expr2;
	public int op;
	public CISource source;

}
