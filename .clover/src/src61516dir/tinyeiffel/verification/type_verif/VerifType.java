/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ *//*
 * Created on 5 mai 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package tinyeiffel.verification.type_verif;

import java.io.PrintStream;

import tinyeiffel.ast.*;

/**
 * @author Barret
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class VerifType {static class __CLOVER_272_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}

	public VerifType(String var_type,Type type_reel)
	{__CLOVER_272_0.cloverRec.M[1629]++;
		assert((((var_type!=null)) && (++__CLOVER_272_0.cloverRec.CT[6998]!=0|true)) || (++__CLOVER_272_0.cloverRec.CF[6998]==0&false));
		assert((((type_reel!=null)) && (++__CLOVER_272_0.cloverRec.CT[6999]!=0|true)) || (++__CLOVER_272_0.cloverRec.CF[6999]==0&false));
		__CLOVER_272_0.cloverRec.S[22944]++;this.type_reel=type_reel;
		__CLOVER_272_0.cloverRec.S[22945]++;this.var_type=var_type;
	}

	public VerifType(String var_type)
	{__CLOVER_272_0.cloverRec.M[1630]++;
		assert((((var_type!=null)) && (++__CLOVER_272_0.cloverRec.CT[7000]!=0|true)) || (++__CLOVER_272_0.cloverRec.CF[7000]==0&false));
		__CLOVER_272_0.cloverRec.S[22946]++;this.type_reel=null;
		__CLOVER_272_0.cloverRec.S[22947]++;this.var_type=var_type;
	}
	
	public boolean a_type_reel()
	{__CLOVER_272_0.cloverRec.M[1631]++;
		__CLOVER_272_0.cloverRec.S[22948]++;return type_reel!=null;
	}
	
	public String toString()
	{__CLOVER_272_0.cloverRec.M[1632]++;
		__CLOVER_272_0.cloverRec.S[22949]++;if((((type_reel==null) && (++__CLOVER_272_0.cloverRec.CT[7001]!=0|true)) || (++__CLOVER_272_0.cloverRec.CF[7001]==0&false)))
			{__CLOVER_272_0.cloverRec.S[22950]++;return var_type+"=()";
		}else
			{__CLOVER_272_0.cloverRec.S[22951]++;return var_type+"=("+type_reel+")";
	}}
	
	public Type get_type_reel()
	{__CLOVER_272_0.cloverRec.M[1633]++;
		__CLOVER_272_0.cloverRec.S[22952]++;return type_reel;
	}
	
	public void set_type_reel(Type t)
	{__CLOVER_272_0.cloverRec.M[1634]++;
		assert((((t!=null)) && (++__CLOVER_272_0.cloverRec.CT[7002]!=0|true)) || (++__CLOVER_272_0.cloverRec.CF[7002]==0&false));
		assert((((type_reel==null)) && (++__CLOVER_272_0.cloverRec.CT[7003]!=0|true)) || (++__CLOVER_272_0.cloverRec.CF[7003]==0&false));
		__CLOVER_272_0.cloverRec.S[22953]++;type_reel=t;
	}
	
	public String get_var_type()
	{__CLOVER_272_0.cloverRec.M[1635]++;
		__CLOVER_272_0.cloverRec.S[22954]++;return var_type;
	}
	
	public void toXML(PrintStream out)
	{__CLOVER_272_0.cloverRec.M[1636]++;
		assert((((out!=null)) && (++__CLOVER_272_0.cloverRec.CT[7004]!=0|true)) || (++__CLOVER_272_0.cloverRec.CF[7004]==0&false));
		
		__CLOVER_272_0.cloverRec.S[22955]++;if((((type_reel!=null) && (++__CLOVER_272_0.cloverRec.CT[7005]!=0|true)) || (++__CLOVER_272_0.cloverRec.CF[7005]==0&false)))
		{{
			__CLOVER_272_0.cloverRec.S[22956]++;out.println("<verif_type var_type=\""+var_type+"\">");
			__CLOVER_272_0.cloverRec.S[22957]++;type_reel.toXML(out);
			__CLOVER_272_0.cloverRec.S[22958]++;out.println("</verif_type>");
		}
		}else
		{{
			__CLOVER_272_0.cloverRec.S[22959]++;out.println("<verif_type var_type=\""+var_type+"\" />");
		}
	}}
	
	protected Type type_reel;
	protected String var_type;
	
}
