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

public class Expr_Unaire extends Expr implements ToXML {static class __CLOVER_18_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}
  public Expr_Unaire(int op,Expr e1,Token oper) {__CLOVER_18_0.cloverRec.M[105]++;
    __CLOVER_18_0.cloverRec.S[571]++;this.op=op;
    assert((((oper!=null)) && (++__CLOVER_18_0.cloverRec.CT[178]!=0|true)) || (++__CLOVER_18_0.cloverRec.CF[178]==0&false));
    assert((((valide_op(op))) && (++__CLOVER_18_0.cloverRec.CT[179]!=0|true)) || (++__CLOVER_18_0.cloverRec.CF[179]==0&false));
    assert((((e1!=null)) && (++__CLOVER_18_0.cloverRec.CT[180]!=0|true)) || (++__CLOVER_18_0.cloverRec.CF[180]==0&false));
    __CLOVER_18_0.cloverRec.S[572]++;this.op=op;
    __CLOVER_18_0.cloverRec.S[573]++;this.expr1=e1;
    __CLOVER_18_0.cloverRec.S[574]++;this.oper=oper;
    __CLOVER_18_0.cloverRec.S[575]++;free_op=null;
  }

  public Expr_Unaire(String op,Expr e1,Token oper) {__CLOVER_18_0.cloverRec.M[106]++;
	  __CLOVER_18_0.cloverRec.S[576]++;this.op=Free_OpU;
	  assert((((op!=null)) && (++__CLOVER_18_0.cloverRec.CT[181]!=0|true)) || (++__CLOVER_18_0.cloverRec.CF[181]==0&false));
	  assert((((oper!=null)) && (++__CLOVER_18_0.cloverRec.CT[182]!=0|true)) || (++__CLOVER_18_0.cloverRec.CF[182]==0&false));
	  assert((((valide_op(this.op))) && (++__CLOVER_18_0.cloverRec.CT[183]!=0|true)) || (++__CLOVER_18_0.cloverRec.CF[183]==0&false));
	  assert((((e1!=null)) && (++__CLOVER_18_0.cloverRec.CT[184]!=0|true)) || (++__CLOVER_18_0.cloverRec.CF[184]==0&false)):"op="+op+";token="+oper.debut();
	  __CLOVER_18_0.cloverRec.S[577]++;this.expr1=e1;
	  __CLOVER_18_0.cloverRec.S[578]++;this.oper=oper;
	  __CLOVER_18_0.cloverRec.S[579]++;this.free_op=op;
	}
	
	public NomFeature donne_nom_feature()
	{__CLOVER_18_0.cloverRec.M[107]++;// TODO: pas beau
		__CLOVER_18_0.cloverRec.S[580]++;NomFeature n;
		__CLOVER_18_0.cloverRec.S[581]++;if((((op==Free_OpU) && (++__CLOVER_18_0.cloverRec.CT[185]!=0|true)) || (++__CLOVER_18_0.cloverRec.CF[185]==0&false)))
		{{
			__CLOVER_18_0.cloverRec.S[582]++;n=new NomFeature(free_op);
			__CLOVER_18_0.cloverRec.S[583]++;n.prefix=true;
		}
		}else
			{__CLOVER_18_0.cloverRec.S[584]++;n=super.donne_nom_feature();
		}__CLOVER_18_0.cloverRec.S[585]++;return n;
	}
	
    public Position debut()
    {__CLOVER_18_0.cloverRec.M[108]++;
      assert((((oper!=null)) && (++__CLOVER_18_0.cloverRec.CT[186]!=0|true)) || (++__CLOVER_18_0.cloverRec.CF[186]==0&false));
      __CLOVER_18_0.cloverRec.S[586]++;Position t=oper.debut();
      assert((((t!=null)) && (++__CLOVER_18_0.cloverRec.CT[187]!=0|true)) || (++__CLOVER_18_0.cloverRec.CF[187]==0&false));
      __CLOVER_18_0.cloverRec.S[587]++;return t;
    }

    public boolean valide_op(int op)
    {__CLOVER_18_0.cloverRec.M[109]++;
      __CLOVER_18_0.cloverRec.S[588]++;boolean __CLOVER_bool0=false;switch(op)
      {
        case Old:if (!__CLOVER_bool0) {__CLOVER_18_0.cloverRec.S[589]++;__CLOVER_bool0=true;}
        case Not:if (!__CLOVER_bool0) {__CLOVER_18_0.cloverRec.S[590]++;__CLOVER_bool0=true;}
        case PlusU:if (!__CLOVER_bool0) {__CLOVER_18_0.cloverRec.S[591]++;__CLOVER_bool0=true;}
        case MoinsU:if (!__CLOVER_bool0) {__CLOVER_18_0.cloverRec.S[592]++;__CLOVER_bool0=true;}
		case Free_OpU:if (!__CLOVER_bool0) {__CLOVER_18_0.cloverRec.S[593]++;__CLOVER_bool0=true;}
		case Dollard:if (!__CLOVER_bool0) {__CLOVER_18_0.cloverRec.S[594]++;__CLOVER_bool0=true;}
          __CLOVER_18_0.cloverRec.S[595]++;return true;
        default:if (!__CLOVER_bool0) {__CLOVER_18_0.cloverRec.S[596]++;__CLOVER_bool0=true;}
          __CLOVER_18_0.cloverRec.S[597]++;return false;
      }
    }

    public final Token oper;
    public final Expr expr1;
    public final String free_op;
	/* (non-Javadoc)
	 * @see ast.Expr#check_egal(ast.Expr)
	 */
	public void check_egal(Expr e) {__CLOVER_18_0.cloverRec.M[110]++;
		assert((((e!=null)) && (++__CLOVER_18_0.cloverRec.CT[188]!=0|true)) || (++__CLOVER_18_0.cloverRec.CF[188]==0&false));
		assert((((e instanceof Expr_Unaire)) && (++__CLOVER_18_0.cloverRec.CT[189]!=0|true)) || (++__CLOVER_18_0.cloverRec.CF[189]==0&false));
		__CLOVER_18_0.cloverRec.S[598]++;Expr_Unaire e2=(Expr_Unaire)e;
		assert((((op==e2.op)) && (++__CLOVER_18_0.cloverRec.CT[190]!=0|true)) || (++__CLOVER_18_0.cloverRec.CF[190]==0&false)):"Difference:"+op+"!="+e2.op;
		__CLOVER_18_0.cloverRec.S[599]++;expr1.check_egal(e2.expr1);
	}

	/* (non-Javadoc)
	 * @see ast.Expr#toXML(java.io.PrintStream)
	 */
	public void toXML(PrintStream out) {__CLOVER_18_0.cloverRec.M[111]++;
		assert((((out!=null)) && (++__CLOVER_18_0.cloverRec.CT[191]!=0|true)) || (++__CLOVER_18_0.cloverRec.CF[191]==0&false));
		__CLOVER_18_0.cloverRec.S[600]++;out.println("<expression>");
		__CLOVER_18_0.cloverRec.S[601]++;String ope=null,autre="";
		__CLOVER_18_0.cloverRec.S[602]++;boolean __CLOVER_bool1=false;switch(op)
		{
			case PlusU:if (!__CLOVER_bool1) {__CLOVER_18_0.cloverRec.S[603]++;__CLOVER_bool1=true;}
				__CLOVER_18_0.cloverRec.S[604]++;ope="plus";
				__CLOVER_18_0.cloverRec.S[605]++;break;
			case MoinsU:if (!__CLOVER_bool1) {__CLOVER_18_0.cloverRec.S[606]++;__CLOVER_bool1=true;}
				__CLOVER_18_0.cloverRec.S[607]++;ope="moins";
				__CLOVER_18_0.cloverRec.S[608]++;break;
			case Old:if (!__CLOVER_bool1) {__CLOVER_18_0.cloverRec.S[609]++;__CLOVER_bool1=true;}
				__CLOVER_18_0.cloverRec.S[610]++;ope="old";
				__CLOVER_18_0.cloverRec.S[611]++;break;
			case Not:if (!__CLOVER_bool1) {__CLOVER_18_0.cloverRec.S[612]++;__CLOVER_bool1=true;}
				__CLOVER_18_0.cloverRec.S[613]++;ope="not";
				__CLOVER_18_0.cloverRec.S[614]++;break;
			case Dollard:if (!__CLOVER_bool1) {__CLOVER_18_0.cloverRec.S[615]++;__CLOVER_bool1=true;}
				__CLOVER_18_0.cloverRec.S[616]++;ope="addr";
				__CLOVER_18_0.cloverRec.S[617]++;break;
			case Free_OpU:if (!__CLOVER_bool1) {__CLOVER_18_0.cloverRec.S[618]++;__CLOVER_bool1=true;}
				//ope=free_op;
				__CLOVER_18_0.cloverRec.S[619]++;ope="free_op";
				//autre=" nom=\""+free_op+"\"";
				__CLOVER_18_0.cloverRec.S[620]++;if((((free_op.startsWith("&")) && (++__CLOVER_18_0.cloverRec.CT[192]!=0|true)) || (++__CLOVER_18_0.cloverRec.CF[192]==0&false)))
				{{
					__CLOVER_18_0.cloverRec.S[621]++;autre=" nom=\""+"&amp;"+free_op.substring(1,free_op.length())+"\"";
				}
				}else
				{{
					__CLOVER_18_0.cloverRec.S[622]++;autre=" nom=\""+free_op+"\"";
				}
				}__CLOVER_18_0.cloverRec.S[623]++;break;
			default:if (!__CLOVER_bool1) {__CLOVER_18_0.cloverRec.S[624]++;__CLOVER_bool1=true;}
				assert((((false)) && (++__CLOVER_18_0.cloverRec.CT[193]!=0|true)) || (++__CLOVER_18_0.cloverRec.CF[193]==0&false));
		}
		__CLOVER_18_0.cloverRec.S[625]++;out.println("<expression_unaire op=\""+ope+"\""+autre+">");
		__CLOVER_18_0.cloverRec.S[626]++;expr1.toXML(out);
		__CLOVER_18_0.cloverRec.S[627]++;out.println("</expression_unaire>");
		__CLOVER_18_0.cloverRec.S[628]++;out.println("</expression>");
	}

	public String toString()
	{__CLOVER_18_0.cloverRec.M[112]++;
		__CLOVER_18_0.cloverRec.S[629]++;String nom_op;
		__CLOVER_18_0.cloverRec.S[630]++;nom_op=donne_nom_feature().nom;
		__CLOVER_18_0.cloverRec.S[631]++;return nom_op+" "+expr1.toString(); 
	}

}