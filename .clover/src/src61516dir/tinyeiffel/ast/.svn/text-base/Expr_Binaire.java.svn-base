/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ */package tinyeiffel.ast;

import java.io.PrintStream;

/**
 * <p>Title: l'ast d'eiffel</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>Company: </p>
 * @author Barret Alain
 * @version 1.0
 */

public class Expr_Binaire extends Expr implements ToXML {static class __CLOVER_11_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}
  public Expr_Binaire(int op,Expr e1,Expr e2,Token oper) {__CLOVER_11_0.cloverRec.M[67]++;
    __CLOVER_11_0.cloverRec.S[362]++;this.op=op;
    assert((((e1!=null)) && (++__CLOVER_11_0.cloverRec.CT[113]!=0|true)) || (++__CLOVER_11_0.cloverRec.CF[113]==0&false));
    assert((((e2!=null)) && (++__CLOVER_11_0.cloverRec.CT[114]!=0|true)) || (++__CLOVER_11_0.cloverRec.CF[114]==0&false));
    assert((((oper!=null)) && (++__CLOVER_11_0.cloverRec.CT[115]!=0|true)) || (++__CLOVER_11_0.cloverRec.CF[115]==0&false));
    assert((((valide_op(op))) && (++__CLOVER_11_0.cloverRec.CT[116]!=0|true)) || (++__CLOVER_11_0.cloverRec.CF[116]==0&false));
    __CLOVER_11_0.cloverRec.S[363]++;this.op=op;
    __CLOVER_11_0.cloverRec.S[364]++;this.expr1=e1;
    __CLOVER_11_0.cloverRec.S[365]++;this.expr2=e2;
    __CLOVER_11_0.cloverRec.S[366]++;this.oper=oper;
    __CLOVER_11_0.cloverRec.S[367]++;free_op=null;
  }
  
	public Expr_Binaire(String op,Expr e1,Expr e2,Token oper)
	{__CLOVER_11_0.cloverRec.M[68]++;
		assert((((op!=null)) && (++__CLOVER_11_0.cloverRec.CT[117]!=0|true)) || (++__CLOVER_11_0.cloverRec.CF[117]==0&false));
		__CLOVER_11_0.cloverRec.S[368]++;this.op=Free_Op;
  		assert((((e1!=null)) && (++__CLOVER_11_0.cloverRec.CT[118]!=0|true)) || (++__CLOVER_11_0.cloverRec.CF[118]==0&false));
		assert((((e2!=null)) && (++__CLOVER_11_0.cloverRec.CT[119]!=0|true)) || (++__CLOVER_11_0.cloverRec.CF[119]==0&false));
		assert((((oper!=null)) && (++__CLOVER_11_0.cloverRec.CT[120]!=0|true)) || (++__CLOVER_11_0.cloverRec.CF[120]==0&false));
		assert((((valide_op(this.op))) && (++__CLOVER_11_0.cloverRec.CT[121]!=0|true)) || (++__CLOVER_11_0.cloverRec.CF[121]==0&false));
		__CLOVER_11_0.cloverRec.S[369]++;this.expr1=e1;
		__CLOVER_11_0.cloverRec.S[370]++;this.expr2=e2;
		__CLOVER_11_0.cloverRec.S[371]++;this.oper=oper;
		__CLOVER_11_0.cloverRec.S[372]++;this.free_op=op;
	}
	
	public NomFeature donne_nom_feature()
	{__CLOVER_11_0.cloverRec.M[69]++;// TODO: pas beau
		__CLOVER_11_0.cloverRec.S[373]++;NomFeature n;
		__CLOVER_11_0.cloverRec.S[374]++;if((((op==Free_Op) && (++__CLOVER_11_0.cloverRec.CT[122]!=0|true)) || (++__CLOVER_11_0.cloverRec.CF[122]==0&false)))
		{{
			__CLOVER_11_0.cloverRec.S[375]++;n=new NomFeature(free_op);
			__CLOVER_11_0.cloverRec.S[376]++;n.infix=true;
		}
		}else
			{__CLOVER_11_0.cloverRec.S[377]++;n=super.donne_nom_feature();
		}__CLOVER_11_0.cloverRec.S[378]++;return n;
	}
	
  public Position debut()
  {__CLOVER_11_0.cloverRec.M[70]++;
    assert((((expr1!=null)) && (++__CLOVER_11_0.cloverRec.CT[123]!=0|true)) || (++__CLOVER_11_0.cloverRec.CF[123]==0&false));
    __CLOVER_11_0.cloverRec.S[379]++;if((((expr1==null) && (++__CLOVER_11_0.cloverRec.CT[124]!=0|true)) || (++__CLOVER_11_0.cloverRec.CF[124]==0&false)))
      {__CLOVER_11_0.cloverRec.S[380]++;return null;//new Position(-1,-1);
    }assert((((expr1!=null)) && (++__CLOVER_11_0.cloverRec.CT[125]!=0|true)) || (++__CLOVER_11_0.cloverRec.CF[125]==0&false));
    __CLOVER_11_0.cloverRec.S[381]++;return expr1.debut();
  }

  public boolean valide_op(int op)
  {__CLOVER_11_0.cloverRec.M[71]++;
    __CLOVER_11_0.cloverRec.S[382]++;boolean __CLOVER_bool0=false;switch(op)
    {
      case Plus:if (!__CLOVER_bool0) {__CLOVER_11_0.cloverRec.S[383]++;__CLOVER_bool0=true;}case Moins:if (!__CLOVER_bool0) {__CLOVER_11_0.cloverRec.S[384]++;__CLOVER_bool0=true;}
      case Fois:if (!__CLOVER_bool0) {__CLOVER_11_0.cloverRec.S[385]++;__CLOVER_bool0=true;}case Div:if (!__CLOVER_bool0) {__CLOVER_11_0.cloverRec.S[386]++;__CLOVER_bool0=true;}case Div_entier:if (!__CLOVER_bool0) {__CLOVER_11_0.cloverRec.S[387]++;__CLOVER_bool0=true;}case Mod:if (!__CLOVER_bool0) {__CLOVER_11_0.cloverRec.S[388]++;__CLOVER_bool0=true;}
      case Point:if (!__CLOVER_bool0) {__CLOVER_11_0.cloverRec.S[389]++;__CLOVER_bool0=true;}case Puiss:if (!__CLOVER_bool0) {__CLOVER_11_0.cloverRec.S[390]++;__CLOVER_bool0=true;}case Xor:if (!__CLOVER_bool0) {__CLOVER_11_0.cloverRec.S[391]++;__CLOVER_bool0=true;}case Or:if (!__CLOVER_bool0) {__CLOVER_11_0.cloverRec.S[392]++;__CLOVER_bool0=true;}case And:if (!__CLOVER_bool0) {__CLOVER_11_0.cloverRec.S[393]++;__CLOVER_bool0=true;}case And_Then:if (!__CLOVER_bool0) {__CLOVER_11_0.cloverRec.S[394]++;__CLOVER_bool0=true;}case Or_Else:if (!__CLOVER_bool0) {__CLOVER_11_0.cloverRec.S[395]++;__CLOVER_bool0=true;}case Implies:if (!__CLOVER_bool0) {__CLOVER_11_0.cloverRec.S[396]++;__CLOVER_bool0=true;}
      case Egal:if (!__CLOVER_bool0) {__CLOVER_11_0.cloverRec.S[397]++;__CLOVER_bool0=true;}case Diff:if (!__CLOVER_bool0) {__CLOVER_11_0.cloverRec.S[398]++;__CLOVER_bool0=true;}case Infs:if (!__CLOVER_bool0) {__CLOVER_11_0.cloverRec.S[399]++;__CLOVER_bool0=true;}case Inf:if (!__CLOVER_bool0) {__CLOVER_11_0.cloverRec.S[400]++;__CLOVER_bool0=true;}case Sup:if (!__CLOVER_bool0) {__CLOVER_11_0.cloverRec.S[401]++;__CLOVER_bool0=true;}case Sups:if (!__CLOVER_bool0) {__CLOVER_11_0.cloverRec.S[402]++;__CLOVER_bool0=true;}
	  case Free_Op:if (!__CLOVER_bool0) {__CLOVER_11_0.cloverRec.S[403]++;__CLOVER_bool0=true;}
        __CLOVER_11_0.cloverRec.S[404]++;return true;
      default:if (!__CLOVER_bool0) {__CLOVER_11_0.cloverRec.S[405]++;__CLOVER_bool0=true;}
        __CLOVER_11_0.cloverRec.S[406]++;return false;
    }
  }

  public final Token oper;
  public final Expr expr1,expr2;
  public final String free_op;
	/* (non-Javadoc)
	 * @see ast.Expr#check_egal(ast.Expr)
	 */
	public void check_egal(Expr e) {__CLOVER_11_0.cloverRec.M[72]++;
		assert((((e!=null)) && (++__CLOVER_11_0.cloverRec.CT[126]!=0|true)) || (++__CLOVER_11_0.cloverRec.CF[126]==0&false));
		assert((((e instanceof Expr_Binaire)) && (++__CLOVER_11_0.cloverRec.CT[127]!=0|true)) || (++__CLOVER_11_0.cloverRec.CF[127]==0&false));
		assert((((op==e.op)) && (++__CLOVER_11_0.cloverRec.CT[128]!=0|true)) || (++__CLOVER_11_0.cloverRec.CF[128]==0&false)):"Difference:"+op+"!="+e.op;
		__CLOVER_11_0.cloverRec.S[407]++;Expr_Binaire e2=(Expr_Binaire)e;
		__CLOVER_11_0.cloverRec.S[408]++;expr1.check_egal(e2.expr1);
		__CLOVER_11_0.cloverRec.S[409]++;expr2.check_egal(e2.expr2);
	}

	/* (non-Javadoc)
	 * @see ast.Expr#toXML(java.io.PrintStream)
	 */
	public void toXML(PrintStream out) {__CLOVER_11_0.cloverRec.M[73]++;
		assert((((out!=null)) && (++__CLOVER_11_0.cloverRec.CT[129]!=0|true)) || (++__CLOVER_11_0.cloverRec.CF[129]==0&false));
		__CLOVER_11_0.cloverRec.S[410]++;out.println("<expression>");
		__CLOVER_11_0.cloverRec.S[411]++;String ope=null,autre="";
		__CLOVER_11_0.cloverRec.S[412]++;boolean __CLOVER_bool1=false;switch(op)
		{
			case Plus:if (!__CLOVER_bool1) {__CLOVER_11_0.cloverRec.S[413]++;__CLOVER_bool1=true;}
				__CLOVER_11_0.cloverRec.S[414]++;ope="plus";
				__CLOVER_11_0.cloverRec.S[415]++;break;
			case Moins:if (!__CLOVER_bool1) {__CLOVER_11_0.cloverRec.S[416]++;__CLOVER_bool1=true;}
				__CLOVER_11_0.cloverRec.S[417]++;ope="moins";
				__CLOVER_11_0.cloverRec.S[418]++;break;
			case Fois:if (!__CLOVER_bool1) {__CLOVER_11_0.cloverRec.S[419]++;__CLOVER_bool1=true;}
				__CLOVER_11_0.cloverRec.S[420]++;ope="fois";
				__CLOVER_11_0.cloverRec.S[421]++;break;
			case Div:if (!__CLOVER_bool1) {__CLOVER_11_0.cloverRec.S[422]++;__CLOVER_bool1=true;}
				__CLOVER_11_0.cloverRec.S[423]++;ope="div";
				__CLOVER_11_0.cloverRec.S[424]++;break;
			case Div_entier:if (!__CLOVER_bool1) {__CLOVER_11_0.cloverRec.S[425]++;__CLOVER_bool1=true;}
				__CLOVER_11_0.cloverRec.S[426]++;ope="div_entier";
				__CLOVER_11_0.cloverRec.S[427]++;break;
			case Mod:if (!__CLOVER_bool1) {__CLOVER_11_0.cloverRec.S[428]++;__CLOVER_bool1=true;}
				__CLOVER_11_0.cloverRec.S[429]++;ope="mod";
				__CLOVER_11_0.cloverRec.S[430]++;break;
			case Point:if (!__CLOVER_bool1) {__CLOVER_11_0.cloverRec.S[431]++;__CLOVER_bool1=true;}
				__CLOVER_11_0.cloverRec.S[432]++;ope="point";
				__CLOVER_11_0.cloverRec.S[433]++;break;
			case Or_Else:if (!__CLOVER_bool1) {__CLOVER_11_0.cloverRec.S[434]++;__CLOVER_bool1=true;}
				__CLOVER_11_0.cloverRec.S[435]++;ope="or_else";
				__CLOVER_11_0.cloverRec.S[436]++;break;
			case And_Then:if (!__CLOVER_bool1) {__CLOVER_11_0.cloverRec.S[437]++;__CLOVER_bool1=true;}
				__CLOVER_11_0.cloverRec.S[438]++;ope="and_then";
				__CLOVER_11_0.cloverRec.S[439]++;break;
			case Puiss:if (!__CLOVER_bool1) {__CLOVER_11_0.cloverRec.S[440]++;__CLOVER_bool1=true;}
				__CLOVER_11_0.cloverRec.S[441]++;ope="puiss";
				__CLOVER_11_0.cloverRec.S[442]++;break;
			case Implies:if (!__CLOVER_bool1) {__CLOVER_11_0.cloverRec.S[443]++;__CLOVER_bool1=true;}
				__CLOVER_11_0.cloverRec.S[444]++;ope="implies";
				__CLOVER_11_0.cloverRec.S[445]++;break;
			case Or:if (!__CLOVER_bool1) {__CLOVER_11_0.cloverRec.S[446]++;__CLOVER_bool1=true;}
				__CLOVER_11_0.cloverRec.S[447]++;ope="or";
				__CLOVER_11_0.cloverRec.S[448]++;break;
			case And:if (!__CLOVER_bool1) {__CLOVER_11_0.cloverRec.S[449]++;__CLOVER_bool1=true;}
				__CLOVER_11_0.cloverRec.S[450]++;ope="and";
				__CLOVER_11_0.cloverRec.S[451]++;break;
			case Xor:if (!__CLOVER_bool1) {__CLOVER_11_0.cloverRec.S[452]++;__CLOVER_bool1=true;}
				__CLOVER_11_0.cloverRec.S[453]++;ope="xor";
				__CLOVER_11_0.cloverRec.S[454]++;break;
			case Sup:if (!__CLOVER_bool1) {__CLOVER_11_0.cloverRec.S[455]++;__CLOVER_bool1=true;}
				__CLOVER_11_0.cloverRec.S[456]++;ope="sup";
				__CLOVER_11_0.cloverRec.S[457]++;break;
			case Sups:if (!__CLOVER_bool1) {__CLOVER_11_0.cloverRec.S[458]++;__CLOVER_bool1=true;}
				__CLOVER_11_0.cloverRec.S[459]++;ope="sups";
				__CLOVER_11_0.cloverRec.S[460]++;break;
			case Inf:if (!__CLOVER_bool1) {__CLOVER_11_0.cloverRec.S[461]++;__CLOVER_bool1=true;}
				__CLOVER_11_0.cloverRec.S[462]++;ope="inf";
				__CLOVER_11_0.cloverRec.S[463]++;break;
			case Infs:if (!__CLOVER_bool1) {__CLOVER_11_0.cloverRec.S[464]++;__CLOVER_bool1=true;}
				__CLOVER_11_0.cloverRec.S[465]++;ope="infs";
				__CLOVER_11_0.cloverRec.S[466]++;break;
			case Egal:if (!__CLOVER_bool1) {__CLOVER_11_0.cloverRec.S[467]++;__CLOVER_bool1=true;}
				__CLOVER_11_0.cloverRec.S[468]++;ope="egal";
				__CLOVER_11_0.cloverRec.S[469]++;break;
			case Diff:if (!__CLOVER_bool1) {__CLOVER_11_0.cloverRec.S[470]++;__CLOVER_bool1=true;}
				__CLOVER_11_0.cloverRec.S[471]++;ope="diff";
				__CLOVER_11_0.cloverRec.S[472]++;break;
			case Free_Op:if (!__CLOVER_bool1) {__CLOVER_11_0.cloverRec.S[473]++;__CLOVER_bool1=true;}
				__CLOVER_11_0.cloverRec.S[474]++;ope="free_op";
				__CLOVER_11_0.cloverRec.S[475]++;if((((free_op.startsWith("&")) && (++__CLOVER_11_0.cloverRec.CT[130]!=0|true)) || (++__CLOVER_11_0.cloverRec.CF[130]==0&false)))
				{{
					__CLOVER_11_0.cloverRec.S[476]++;autre=" nom=\""+"&amp;"+free_op.substring(1,free_op.length())+"\"";
				}
				}else
				{{
					__CLOVER_11_0.cloverRec.S[477]++;autre=" nom=\""+free_op+"\"";
				}
				}__CLOVER_11_0.cloverRec.S[478]++;break;
			default:if (!__CLOVER_bool1) {__CLOVER_11_0.cloverRec.S[479]++;__CLOVER_bool1=true;}
				assert((((false)) && (++__CLOVER_11_0.cloverRec.CT[131]!=0|true)) || (++__CLOVER_11_0.cloverRec.CF[131]==0&false));
		}
		assert((((ope!=null)) && (++__CLOVER_11_0.cloverRec.CT[132]!=0|true)) || (++__CLOVER_11_0.cloverRec.CF[132]==0&false));
		__CLOVER_11_0.cloverRec.S[480]++;out.println("<expression_binaire op=\""+ope+"\""+autre+">");
		__CLOVER_11_0.cloverRec.S[481]++;expr1.toXML(out);
		__CLOVER_11_0.cloverRec.S[482]++;expr2.toXML(out);
		__CLOVER_11_0.cloverRec.S[483]++;out.println("</expression_binaire>");
		__CLOVER_11_0.cloverRec.S[484]++;out.println("</expression>");
	}

	public String toString()
	{__CLOVER_11_0.cloverRec.M[74]++;
		__CLOVER_11_0.cloverRec.S[485]++;String nom_op;
		__CLOVER_11_0.cloverRec.S[486]++;nom_op=donne_nom_feature().nom;
		__CLOVER_11_0.cloverRec.S[487]++;return expr1.toString()+" "+nom_op+" "+expr2.toString(); 
	}

}