/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ *//*
 * Created on 6 f\u00e9vr. 2004
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
public class CIExpr_Unaire extends CIExpr {static class __CLOVER_205_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}

	/**
	 * 
	 */
	public CIExpr_Unaire(int op,CIExpr_Scalaire expr,CISource source) {__CLOVER_205_0.cloverRec.M[1190]++;
		assert((((expr!=null)) && (++__CLOVER_205_0.cloverRec.CT[4400]!=0|true)) || (++__CLOVER_205_0.cloverRec.CF[4400]==0&false));
		__CLOVER_205_0.cloverRec.S[17420]++;this.op=op;
		__CLOVER_205_0.cloverRec.S[17421]++;this.expr=expr;
		__CLOVER_205_0.cloverRec.S[17422]++;this.source=source;
	}

	public String toString()
	{__CLOVER_205_0.cloverRec.M[1191]++;
		__CLOVER_205_0.cloverRec.S[17423]++;return nom_op()+" "+expr.toString();
	}

	public void toXML(PrintStream out)
	{__CLOVER_205_0.cloverRec.M[1192]++;
		__CLOVER_205_0.cloverRec.S[17424]++;out.print("<expression_un type=\"");
		__CLOVER_205_0.cloverRec.S[17425]++;boolean __CLOVER_bool0=false;switch(op)
		{
			case Plus:if (!__CLOVER_bool0) {__CLOVER_205_0.cloverRec.S[17426]++;__CLOVER_bool0=true;} __CLOVER_205_0.cloverRec.S[17427]++;out.print("plus");__CLOVER_205_0.cloverRec.S[17428]++;break;
			case Moins:if (!__CLOVER_bool0) {__CLOVER_205_0.cloverRec.S[17429]++;__CLOVER_bool0=true;} __CLOVER_205_0.cloverRec.S[17430]++;out.print("moins");__CLOVER_205_0.cloverRec.S[17431]++;break;
			case Conv_E2R:if (!__CLOVER_bool0) {__CLOVER_205_0.cloverRec.S[17432]++;__CLOVER_bool0=true;} __CLOVER_205_0.cloverRec.S[17433]++;out.print("conv_e2r");__CLOVER_205_0.cloverRec.S[17434]++;break;
			case Conv_E2D:if (!__CLOVER_bool0) {__CLOVER_205_0.cloverRec.S[17435]++;__CLOVER_bool0=true;} __CLOVER_205_0.cloverRec.S[17436]++;out.print("conv_e2d");__CLOVER_205_0.cloverRec.S[17437]++;break;
			case Conv_R2D:if (!__CLOVER_bool0) {__CLOVER_205_0.cloverRec.S[17438]++;__CLOVER_bool0=true;} __CLOVER_205_0.cloverRec.S[17439]++;out.print("conv_r2d");__CLOVER_205_0.cloverRec.S[17440]++;break;
			case Not:if (!__CLOVER_bool0) {__CLOVER_205_0.cloverRec.S[17441]++;__CLOVER_bool0=true;} __CLOVER_205_0.cloverRec.S[17442]++;out.print("not");__CLOVER_205_0.cloverRec.S[17443]++;break;
			case Old:if (!__CLOVER_bool0) {__CLOVER_205_0.cloverRec.S[17444]++;__CLOVER_bool0=true;} __CLOVER_205_0.cloverRec.S[17445]++;out.print("old");__CLOVER_205_0.cloverRec.S[17446]++;break;
			case Dollard:if (!__CLOVER_bool0) {__CLOVER_205_0.cloverRec.S[17447]++;__CLOVER_bool0=true;} __CLOVER_205_0.cloverRec.S[17448]++;out.print("addr");__CLOVER_205_0.cloverRec.S[17449]++;break;
			default:if (!__CLOVER_bool0) {__CLOVER_205_0.cloverRec.S[17450]++;__CLOVER_bool0=true;}assert((((false)) && (++__CLOVER_205_0.cloverRec.CT[4401]!=0|true)) || (++__CLOVER_205_0.cloverRec.CF[4401]==0&false)):"op="+op;
		}
		__CLOVER_205_0.cloverRec.S[17451]++;out.println("\">");
		__CLOVER_205_0.cloverRec.S[17452]++;expr.toXML(out);
		__CLOVER_205_0.cloverRec.S[17453]++;if((((source!=null) && (++__CLOVER_205_0.cloverRec.CT[4402]!=0|true)) || (++__CLOVER_205_0.cloverRec.CF[4402]==0&false)))
		{{
			__CLOVER_205_0.cloverRec.S[17454]++;source.toXML(out);
		}
		}__CLOVER_205_0.cloverRec.S[17455]++;out.println("</expression_un>");
	}

	public String nom_op()
	{__CLOVER_205_0.cloverRec.M[1193]++;
		__CLOVER_205_0.cloverRec.S[17456]++;boolean __CLOVER_bool1=false;switch(op)
		{
			case Plus:if (!__CLOVER_bool1) {__CLOVER_205_0.cloverRec.S[17457]++;__CLOVER_bool1=true;} __CLOVER_205_0.cloverRec.S[17458]++;return "+";
			case Moins:if (!__CLOVER_bool1) {__CLOVER_205_0.cloverRec.S[17459]++;__CLOVER_bool1=true;} __CLOVER_205_0.cloverRec.S[17460]++;return "-";
			case Conv_E2R:if (!__CLOVER_bool1) {__CLOVER_205_0.cloverRec.S[17461]++;__CLOVER_bool1=true;} __CLOVER_205_0.cloverRec.S[17462]++;return "conv_e2r";
			case Conv_E2D:if (!__CLOVER_bool1) {__CLOVER_205_0.cloverRec.S[17463]++;__CLOVER_bool1=true;} __CLOVER_205_0.cloverRec.S[17464]++;return "conv_e2d";
			case Conv_R2D:if (!__CLOVER_bool1) {__CLOVER_205_0.cloverRec.S[17465]++;__CLOVER_bool1=true;} __CLOVER_205_0.cloverRec.S[17466]++;return "conv_r2d";
			case Old:if (!__CLOVER_bool1) {__CLOVER_205_0.cloverRec.S[17467]++;__CLOVER_bool1=true;} __CLOVER_205_0.cloverRec.S[17468]++;return "old";
			case Not:if (!__CLOVER_bool1) {__CLOVER_205_0.cloverRec.S[17469]++;__CLOVER_bool1=true;} __CLOVER_205_0.cloverRec.S[17470]++;return "not";
			case Dollard:if (!__CLOVER_bool1) {__CLOVER_205_0.cloverRec.S[17471]++;__CLOVER_bool1=true;} __CLOVER_205_0.cloverRec.S[17472]++;return "addr";
		}
		assert((((false)) && (++__CLOVER_205_0.cloverRec.CT[4403]!=0|true)) || (++__CLOVER_205_0.cloverRec.CF[4403]==0&false));
		__CLOVER_205_0.cloverRec.S[17473]++;return null;
	}

	public void check_egal(CIExpr e)
	{__CLOVER_205_0.cloverRec.M[1194]++;
		assert((((e!=null)) && (++__CLOVER_205_0.cloverRec.CT[4404]!=0|true)) || (++__CLOVER_205_0.cloverRec.CF[4404]==0&false));
		assert((((e instanceof CIExpr_Unaire)) && (++__CLOVER_205_0.cloverRec.CT[4405]!=0|true)) || (++__CLOVER_205_0.cloverRec.CF[4405]==0&false));
		__CLOVER_205_0.cloverRec.S[17474]++;CIExpr_Unaire e2=(CIExpr_Unaire)e;
		assert((((expr!=null)) && (++__CLOVER_205_0.cloverRec.CT[4406]!=0|true)) || (++__CLOVER_205_0.cloverRec.CF[4406]==0&false));
		assert((((e2.expr!=null)) && (++__CLOVER_205_0.cloverRec.CT[4407]!=0|true)) || (++__CLOVER_205_0.cloverRec.CF[4407]==0&false));
		assert((((op>=1)) && (++__CLOVER_205_0.cloverRec.CT[4408]!=0|true)) || (++__CLOVER_205_0.cloverRec.CF[4408]==0&false));
		assert((((op==e2.op)) && (++__CLOVER_205_0.cloverRec.CT[4409]!=0|true)) || (++__CLOVER_205_0.cloverRec.CF[4409]==0&false));
		__CLOVER_205_0.cloverRec.S[17475]++;expr.check_egal(e2.expr);
		__CLOVER_205_0.cloverRec.S[17476]++;if((((source!=null) && (++__CLOVER_205_0.cloverRec.CT[4410]!=0|true)) || (++__CLOVER_205_0.cloverRec.CF[4410]==0&false)))
		{{
			__CLOVER_205_0.cloverRec.S[17477]++;source.check_egal(e2.source);
		}
		}else
		{{
			assert((((e2.source==null)) && (++__CLOVER_205_0.cloverRec.CT[4411]!=0|true)) || (++__CLOVER_205_0.cloverRec.CF[4411]==0&false));
		}
	}}
	

	public static final int Plus=31,Moins=32,Conv_E2R=33,Conv_E2D=34,
							Conv_R2D=35,Not=36,Old=37,Dollard=38,
							Conv_D2R=39,Conv_D2E=40,Conv_R2E=41,
							Conv_E2C=42,Conv_C2E=43;

	public CIExpr_Scalaire expr;
	public int op;
	public CISource source;

}
