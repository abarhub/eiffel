/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ */package tinyeiffel.ast;

import java.util.*;
import java.io.*;

public abstract class Expr implements ToXML,Traite//extends ASTEiffel
{static class __CLOVER_9_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}
	/*public Expr(int op)
	{
		if(op==0)
		{
			System.out.println("Erreur1");
			System.exit(1);
		}
		this.op=op;
	}

	/*public Expr(int op,Expr e1,Expr e2)
	{
		if(op==0)
		{
			System.out.println("Erreur2");
			System.exit(1);
		}
		this.op=op;
		this.expr1=e1;
		this.expr2=e2;
	}*/

	/*public Expr(int op,Expr e1)
	{
		if(op==0)
		{
			System.out.println("Erreur3");
			try
			{
				throw new Exception("fatal");
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
			//Compiler_Eiffel.logging.fatalMsg("Erreur3");
			System.exit(1);
		}
		this.op=op;
		this.expr1=e1;
	}

	public Expr(String nom,Vector param)
	{
		this.op=Appel;
		this.parametre=param;
		this.nom=nom;
	}

	public Expr(String nom)
	{
		this.op=Var;
		this.nom=nom;
	}

	public Expr(Chaine str)
	{
	  //assert(false);
		op=Chaine;
		this.str2=str;
                assert(str.oper!=null);
                this.oper=str.oper;
		assert(this.oper!=null);
	}

        public Expr(int i,Token t)
        {
          this.op=Expr.Entier;
          this.oper=t;
          this.entier=i;
        }*/

	/*public String donne_pos()
	{
		if(oper==null)
			return "()";
		else
			return "("+oper.x+","+oper.y+")";
	}*/

	public abstract void check_egal(Expr e);

	public NomFeature donne_nom_feature()
	{__CLOVER_9_0.cloverRec.M[59]++;
		__CLOVER_9_0.cloverRec.S[226]++;NomFeature n=null;
		__CLOVER_9_0.cloverRec.S[227]++;Vector v;

		__CLOVER_9_0.cloverRec.S[228]++;boolean __CLOVER_bool0=false;switch(op)
		{
			case Expr.Plus:if (!__CLOVER_bool0) {__CLOVER_9_0.cloverRec.S[229]++;__CLOVER_bool0=true;}
				__CLOVER_9_0.cloverRec.S[230]++;n=new NomFeature("\"+\"");
				__CLOVER_9_0.cloverRec.S[231]++;n.infix=true;
				__CLOVER_9_0.cloverRec.S[232]++;break;
			case Expr.Moins:if (!__CLOVER_bool0) {__CLOVER_9_0.cloverRec.S[233]++;__CLOVER_bool0=true;}
				__CLOVER_9_0.cloverRec.S[234]++;n=new NomFeature("\"-\"");
				__CLOVER_9_0.cloverRec.S[235]++;n.infix=true;
				__CLOVER_9_0.cloverRec.S[236]++;break;
			case Expr.Fois:if (!__CLOVER_bool0) {__CLOVER_9_0.cloverRec.S[237]++;__CLOVER_bool0=true;}
				__CLOVER_9_0.cloverRec.S[238]++;n=new NomFeature("\"*\"");
				__CLOVER_9_0.cloverRec.S[239]++;n.infix=true;
				__CLOVER_9_0.cloverRec.S[240]++;break;
			case Expr.Div:if (!__CLOVER_bool0) {__CLOVER_9_0.cloverRec.S[241]++;__CLOVER_bool0=true;}
				__CLOVER_9_0.cloverRec.S[242]++;n=new NomFeature("\"/\"");
				__CLOVER_9_0.cloverRec.S[243]++;n.infix=true;
				__CLOVER_9_0.cloverRec.S[244]++;break;
			case Expr.Mod:if (!__CLOVER_bool0) {__CLOVER_9_0.cloverRec.S[245]++;__CLOVER_bool0=true;}
				__CLOVER_9_0.cloverRec.S[246]++;n=new NomFeature("\"\\\\\"");
				__CLOVER_9_0.cloverRec.S[247]++;n.infix=true;
				__CLOVER_9_0.cloverRec.S[248]++;break;
			case Expr.Not:if (!__CLOVER_bool0) {__CLOVER_9_0.cloverRec.S[249]++;__CLOVER_bool0=true;}
				__CLOVER_9_0.cloverRec.S[250]++;n=new NomFeature("\"not\"");
				__CLOVER_9_0.cloverRec.S[251]++;n.prefix=true;
				__CLOVER_9_0.cloverRec.S[252]++;break;
			case Expr.PlusU:if (!__CLOVER_bool0) {__CLOVER_9_0.cloverRec.S[253]++;__CLOVER_bool0=true;}
				__CLOVER_9_0.cloverRec.S[254]++;n=new NomFeature("\"+\"");
				__CLOVER_9_0.cloverRec.S[255]++;n.prefix=true;
				__CLOVER_9_0.cloverRec.S[256]++;break;
			case Expr.MoinsU:if (!__CLOVER_bool0) {__CLOVER_9_0.cloverRec.S[257]++;__CLOVER_bool0=true;}
				__CLOVER_9_0.cloverRec.S[258]++;n=new NomFeature("\"-\"");
				__CLOVER_9_0.cloverRec.S[259]++;n.prefix=true;
				__CLOVER_9_0.cloverRec.S[260]++;break;
			case Expr.Puiss:if (!__CLOVER_bool0) {__CLOVER_9_0.cloverRec.S[261]++;__CLOVER_bool0=true;}
				__CLOVER_9_0.cloverRec.S[262]++;n=new NomFeature("\"^\"");
				__CLOVER_9_0.cloverRec.S[263]++;n.infix=true;
				__CLOVER_9_0.cloverRec.S[264]++;break;
			case Expr.Xor:if (!__CLOVER_bool0) {__CLOVER_9_0.cloverRec.S[265]++;__CLOVER_bool0=true;}
				__CLOVER_9_0.cloverRec.S[266]++;n=new NomFeature("\"xor\"");
				__CLOVER_9_0.cloverRec.S[267]++;n.infix=true;
				__CLOVER_9_0.cloverRec.S[268]++;break;
			case Expr.Or:if (!__CLOVER_bool0) {__CLOVER_9_0.cloverRec.S[269]++;__CLOVER_bool0=true;}
				__CLOVER_9_0.cloverRec.S[270]++;n=new NomFeature("\"or\"");
				__CLOVER_9_0.cloverRec.S[271]++;n.infix=true;
				__CLOVER_9_0.cloverRec.S[272]++;break;
			case Expr.And:if (!__CLOVER_bool0) {__CLOVER_9_0.cloverRec.S[273]++;__CLOVER_bool0=true;}
				__CLOVER_9_0.cloverRec.S[274]++;n=new NomFeature("\"and\"");
				__CLOVER_9_0.cloverRec.S[275]++;n.infix=true;
				__CLOVER_9_0.cloverRec.S[276]++;break;
			case Expr.And_Then:if (!__CLOVER_bool0) {__CLOVER_9_0.cloverRec.S[277]++;__CLOVER_bool0=true;}
				__CLOVER_9_0.cloverRec.S[278]++;n=new NomFeature("\"and then\"");
				__CLOVER_9_0.cloverRec.S[279]++;n.infix=true;
				__CLOVER_9_0.cloverRec.S[280]++;break;
			case Expr.Or_Else:if (!__CLOVER_bool0) {__CLOVER_9_0.cloverRec.S[281]++;__CLOVER_bool0=true;}
				__CLOVER_9_0.cloverRec.S[282]++;n=new NomFeature("\"or else\"");
				__CLOVER_9_0.cloverRec.S[283]++;n.infix=true;
				__CLOVER_9_0.cloverRec.S[284]++;break;
			case Expr.Implies:if (!__CLOVER_bool0) {__CLOVER_9_0.cloverRec.S[285]++;__CLOVER_bool0=true;}
				__CLOVER_9_0.cloverRec.S[286]++;n=new NomFeature("\"implies\"");
				__CLOVER_9_0.cloverRec.S[287]++;n.infix=true;
				__CLOVER_9_0.cloverRec.S[288]++;break;
			case Expr.Egal:if (!__CLOVER_bool0) {__CLOVER_9_0.cloverRec.S[289]++;__CLOVER_bool0=true;}
				__CLOVER_9_0.cloverRec.S[290]++;n=new NomFeature("\"=\"");
				__CLOVER_9_0.cloverRec.S[291]++;n.infix=true;
				__CLOVER_9_0.cloverRec.S[292]++;break;
			case Expr.Diff:if (!__CLOVER_bool0) {__CLOVER_9_0.cloverRec.S[293]++;__CLOVER_bool0=true;}
				__CLOVER_9_0.cloverRec.S[294]++;n=new NomFeature("\"/=\"");
				__CLOVER_9_0.cloverRec.S[295]++;n.infix=true;
				__CLOVER_9_0.cloverRec.S[296]++;break;
			case Expr.Infs:if (!__CLOVER_bool0) {__CLOVER_9_0.cloverRec.S[297]++;__CLOVER_bool0=true;}
				__CLOVER_9_0.cloverRec.S[298]++;n=new NomFeature("\"<\"");
				__CLOVER_9_0.cloverRec.S[299]++;n.infix=true;
				__CLOVER_9_0.cloverRec.S[300]++;break;
			case Expr.Inf:if (!__CLOVER_bool0) {__CLOVER_9_0.cloverRec.S[301]++;__CLOVER_bool0=true;}
				__CLOVER_9_0.cloverRec.S[302]++;n=new NomFeature("\"<=\"");
				__CLOVER_9_0.cloverRec.S[303]++;n.infix=true;
				__CLOVER_9_0.cloverRec.S[304]++;break;
			case Expr.Sup:if (!__CLOVER_bool0) {__CLOVER_9_0.cloverRec.S[305]++;__CLOVER_bool0=true;}
				__CLOVER_9_0.cloverRec.S[306]++;n=new NomFeature("\">=\"");
				__CLOVER_9_0.cloverRec.S[307]++;n.infix=true;
				__CLOVER_9_0.cloverRec.S[308]++;break;
			case Expr.Sups:if (!__CLOVER_bool0) {__CLOVER_9_0.cloverRec.S[309]++;__CLOVER_bool0=true;}
				__CLOVER_9_0.cloverRec.S[310]++;n=new NomFeature("\">\"");
				__CLOVER_9_0.cloverRec.S[311]++;n.infix=true;
				__CLOVER_9_0.cloverRec.S[312]++;break;
			case Expr.Div_entier:if (!__CLOVER_bool0) {__CLOVER_9_0.cloverRec.S[313]++;__CLOVER_bool0=true;}
				__CLOVER_9_0.cloverRec.S[314]++;n=new NomFeature("\"//\"");
				__CLOVER_9_0.cloverRec.S[315]++;n.infix=true;
				__CLOVER_9_0.cloverRec.S[316]++;break;
			case Expr.Point:if (!__CLOVER_bool0) {__CLOVER_9_0.cloverRec.S[317]++;__CLOVER_bool0=true;}
				__CLOVER_9_0.cloverRec.S[318]++;n=new NomFeature("\".\"");
				__CLOVER_9_0.cloverRec.S[319]++;n.infix=true;
				__CLOVER_9_0.cloverRec.S[320]++;break;
			case Expr.Old:if (!__CLOVER_bool0) {__CLOVER_9_0.cloverRec.S[321]++;__CLOVER_bool0=true;}
				__CLOVER_9_0.cloverRec.S[322]++;n=new NomFeature("old");
				__CLOVER_9_0.cloverRec.S[323]++;n.prefix=true;
				__CLOVER_9_0.cloverRec.S[324]++;break;
			case Expr.Dollard:if (!__CLOVER_bool0) {__CLOVER_9_0.cloverRec.S[325]++;__CLOVER_bool0=true;}
				__CLOVER_9_0.cloverRec.S[326]++;n=new NomFeature("$");
				__CLOVER_9_0.cloverRec.S[327]++;n.prefix=true;
				__CLOVER_9_0.cloverRec.S[328]++;break;
			default:if (!__CLOVER_bool0) {__CLOVER_9_0.cloverRec.S[329]++;__CLOVER_bool0=true;}
				assert((((false)) && (++__CLOVER_9_0.cloverRec.CT[99]!=0|true)) || (++__CLOVER_9_0.cloverRec.CF[99]==0&false)):"op="+op;
		}
		__CLOVER_9_0.cloverRec.S[330]++;return n;
	}

        public abstract Position debut();
        /*{
	  //if(oper==null)
	    //return null;
          //assert(oper!=null);
          switch(op)
          {
            case Plus:case Moins:
            case Fois:case Div:case Div_entier:case Mod:
            case Point:case Puiss:case Xor:case Or:case And:case And_Then:case Or_Else:case Implies:
            case Egal:case Diff:case Infs:case Inf:case Sup:case Sups:
	      if(expr1==null)
		return null;//new Position(-1,-1);
	      assert(expr1!=null);
              return expr1.debut();
            /**/
/*            case Chaine:
	      if(oper==null)
		return str2.oper.debut();
	      else
		return oper.debut();
	    /*case Char:
	      if(oper==null)
		return str2.oper.debut();
	      else
		return oper.debut();*/
/*	    case Entier:
            case Reel:case Char:case Vrai:case Faux:
	      if(oper==null)
	      {
                System.out.println("op="+op);
		//assert(false);
                return new Position(-1,-1);
	      }
              return oper.debut();
            /**/
/*            case Old:case Not:case PlusU:case MoinsU:
	      if(oper==null)
		new Position(-1,-1);
              return oper.debut();
            case Appel:
            case Var:
	      if(oper==null)
		return new Position(-1,-1);
              return oper.debut();
            case Tableau:
              assert(false);
              return null;
            default:
              return null;
          }
        }*/

//public Type verifie(Context context)

	public abstract void toXML(PrintStream out);

	public void set_traite(boolean traite0)
	{__CLOVER_9_0.cloverRec.M[60]++;
		__CLOVER_9_0.cloverRec.S[331]++;this.traite=traite0;
	}

	public boolean get_traite()
	{__CLOVER_9_0.cloverRec.M[61]++;
		__CLOVER_9_0.cloverRec.S[332]++;return traite;
	}

	protected boolean traite=false;

	//public Expr expr1/*,expr2*/;
	public int op;
	public static final int Plus=1,Moins=2,Fois=3,Div=4,Div_entier=5,Chaine=6,Entier=7,
		Reel=8,Char=9,Vrai=10,Faux=11,Mod=12,Old=13,Not=14,PlusU=15,MoinsU=16,
		Point=17,Puiss=18,Xor=19,Or=20,And=21,And_Then=22,Or_Else=23,Implies=24,
		Egal=25,Diff=26,Infs=27,Inf=28,Sup=29,Sups=30,Appel=31,Var=32,Tableau=33,
		Free_Op=34,Free_OpU=35,Dollard=36;
	public Type type;
	public boolean erreur;
	public Classe classe;
	/*public String str;
	public Chaine str2;
	public int entier;
	public double reel;
	public String caracter;
	public Vector parametre;
	public String nom;
	public Vector tableau;
	public Token oper;*/
}
