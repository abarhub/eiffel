/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ */package tinyeiffel.ast;

import java.io.PrintStream;
import java.util.*;

public class FeatureRoutine extends Feature implements ToXML
{static class __CLOVER_26_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}
	public FeatureRoutine(boolean once,Vector liste_instr,Vector local)
	{__CLOVER_26_0.cloverRec.M[160]++;
		__CLOVER_26_0.cloverRec.S[816]++;this.once=once;
		__CLOVER_26_0.cloverRec.S[817]++;if((((liste_instr!=null) && (++__CLOVER_26_0.cloverRec.CT[292]!=0|true)) || (++__CLOVER_26_0.cloverRec.CF[292]==0&false)))
		{{
			__CLOVER_26_0.cloverRec.S[818]++;this.liste_instr=new Instr[liste_instr.size()];
			__CLOVER_26_0.cloverRec.S[819]++;liste_instr.copyInto(this.liste_instr);
		}
		}__CLOVER_26_0.cloverRec.S[820]++;if((((local!=null) && (++__CLOVER_26_0.cloverRec.CT[293]!=0|true)) || (++__CLOVER_26_0.cloverRec.CF[293]==0&false)))
		{{
			__CLOVER_26_0.cloverRec.S[821]++;this.local=new DeclareVar[local.size()];
			__CLOVER_26_0.cloverRec.S[822]++;local.copyInto(this.local);
		}
	}}
	
	public boolean est_routine()
	{__CLOVER_26_0.cloverRec.M[161]++;
		__CLOVER_26_0.cloverRec.S[823]++;return true;
	}

	public boolean once;
	public Instr liste_instr[];
	public DeclareVar local[];
	/* (non-Javadoc)
	 * @see ast.Feature#check_egal(ast.Feature)
	 */
	public void check_egal(Feature f) {__CLOVER_26_0.cloverRec.M[162]++;
		__CLOVER_26_0.cloverRec.S[824]++;super.check_egal(f);
		assert((((f instanceof FeatureRoutine)) && (++__CLOVER_26_0.cloverRec.CT[294]!=0|true)) || (++__CLOVER_26_0.cloverRec.CF[294]==0&false));
		__CLOVER_26_0.cloverRec.S[825]++;FeatureRoutine f2=(FeatureRoutine)f;
		assert((((once==f2.once)) && (++__CLOVER_26_0.cloverRec.CT[295]!=0|true)) || (++__CLOVER_26_0.cloverRec.CF[295]==0&false)):once+"!="+f2.once;
		__CLOVER_26_0.cloverRec.S[826]++;int i;
		/*****/
		assert((((liste_instr.length==f2.liste_instr.length)) && (++__CLOVER_26_0.cloverRec.CT[296]!=0|true)) || (++__CLOVER_26_0.cloverRec.CF[296]==0&false)):
				"difference:"+liste_instr.length+"!="+
				f2.liste_instr.length;
		__CLOVER_26_0.cloverRec.S[827]++;for(i=0;(((i<liste_instr.length) && (++__CLOVER_26_0.cloverRec.CT[297]!=0|true)) || (++__CLOVER_26_0.cloverRec.CF[297]==0&false));i++)
		{{
			__CLOVER_26_0.cloverRec.S[828]++;liste_instr[i].check_egal(f2.liste_instr[i]);		
		}
		/*****/
		}assert((((local.length==f2.local.length)) && (++__CLOVER_26_0.cloverRec.CT[298]!=0|true)) || (++__CLOVER_26_0.cloverRec.CF[298]==0&false));
		__CLOVER_26_0.cloverRec.S[829]++;for(i=0;(((i<local.length) && (++__CLOVER_26_0.cloverRec.CT[299]!=0|true)) || (++__CLOVER_26_0.cloverRec.CF[299]==0&false));i++)
		{{
			__CLOVER_26_0.cloverRec.S[830]++;local[i].check_egal(f2.local[i]);		
		}
	}}

	/* (non-Javadoc)
	 * @see ast.Feature#toXML(java.io.PrintStream)
	 */
	public void toXML(PrintStream out) {__CLOVER_26_0.cloverRec.M[163]++;
		assert((((out!=null)) && (++__CLOVER_26_0.cloverRec.CT[300]!=0|true)) || (++__CLOVER_26_0.cloverRec.CF[300]==0&false));
		__CLOVER_26_0.cloverRec.S[831]++;toXMLCorpsDebut(out);
		__CLOVER_26_0.cloverRec.S[832]++;out.println("<code"+(((((once)) && (++__CLOVER_26_0.cloverRec.CT[301]!=0|true)) || (++__CLOVER_26_0.cloverRec.CF[301]==0&false))?" once=\"yes\"":"")+">");
		__CLOVER_26_0.cloverRec.S[833]++;int i;
		__CLOVER_26_0.cloverRec.S[834]++;if((((local!=null) && (++__CLOVER_26_0.cloverRec.CT[302]!=0|true)) || (++__CLOVER_26_0.cloverRec.CF[302]==0&false)))
		{{
			__CLOVER_26_0.cloverRec.S[835]++;for(i=0;(((i<local.length) && (++__CLOVER_26_0.cloverRec.CT[303]!=0|true)) || (++__CLOVER_26_0.cloverRec.CF[303]==0&false));i++)
			{{
				__CLOVER_26_0.cloverRec.S[836]++;DeclareVar d=local[i];
				__CLOVER_26_0.cloverRec.S[837]++;out.println("<local nom=\""+d.nom+"\">");
				__CLOVER_26_0.cloverRec.S[838]++;d.type.toXML(out);
				__CLOVER_26_0.cloverRec.S[839]++;out.println("</local>");
			}
		}}
		}__CLOVER_26_0.cloverRec.S[840]++;if((((liste_instr!=null) && (++__CLOVER_26_0.cloverRec.CT[304]!=0|true)) || (++__CLOVER_26_0.cloverRec.CF[304]==0&false)))
		{{
			__CLOVER_26_0.cloverRec.S[841]++;for(i=0;(((i<liste_instr.length) && (++__CLOVER_26_0.cloverRec.CT[305]!=0|true)) || (++__CLOVER_26_0.cloverRec.CF[305]==0&false));i++)
			{{
				__CLOVER_26_0.cloverRec.S[842]++;liste_instr[i].toXML(out);
			}
		}}
		}__CLOVER_26_0.cloverRec.S[843]++;out.println("</code>");
		__CLOVER_26_0.cloverRec.S[844]++;toXMLCorpsFin(out);
	}

}