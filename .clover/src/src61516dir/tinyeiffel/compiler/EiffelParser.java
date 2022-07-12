/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ */// $ANTLR 2.7.3: "eiffel.g" -> "EiffelParser.java"$

package tinyeiffel.compiler;

import java.io.*;
import java.util.*;
import tinyeiffel.ast.*;
import tinyeiffel.erreur.*;
import antlr.*;
//41231231

import antlr.TokenBuffer;
import antlr.TokenStreamException;
import antlr.TokenStreamIOException;
import antlr.ANTLRException;
import antlr.LLkParser;
import antlr.Token;
import antlr.TokenStream;
import antlr.RecognitionException;
import antlr.NoViableAltException;
import antlr.MismatchedTokenException;
import antlr.SemanticException;
import antlr.ParserSharedInputState;
import antlr.collections.impl.BitSet;
import antlr.collections.AST;
import java.util.Hashtable;
import antlr.ASTFactory;
import antlr.ASTPair;
import antlr.collections.impl.ASTArray;

public class EiffelParser extends antlr.LLkParser       implements EiffelTokenTypes
 {static class __CLOVER_66_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}

	public EiffelLexer lexer=null;
	public int last_feature1=-1,last_feature2=-1;

	public Vector type_utilisee=new Vector();
	public Logging  logging;

	public int dernier_commentaire()
	{__CLOVER_66_0.cloverRec.M[531]++;
		__CLOVER_66_0.cloverRec.S[7341]++;return lexer.liste_commentaire.size()-1;
	}

	public void ajoute_type(Type t)
	{__CLOVER_66_0.cloverRec.M[532]++;
		__CLOVER_66_0.cloverRec.S[7342]++;int j;

		__CLOVER_66_0.cloverRec.S[7343]++;if((((t!=null&&!((Type)t).is_like) && (++__CLOVER_66_0.cloverRec.CT[1979]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[1979]==0&false)))
		{{
			__CLOVER_66_0.cloverRec.S[7344]++;for(j=0;(((j<type_utilisee.size()) && (++__CLOVER_66_0.cloverRec.CT[1980]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[1980]==0&false));j++)
			{{
				__CLOVER_66_0.cloverRec.S[7345]++;if((((((Type)type_utilisee.elementAt(j)).egaux(t)) && (++__CLOVER_66_0.cloverRec.CT[1981]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[1981]==0&false)))
				{{
					__CLOVER_66_0.cloverRec.S[7346]++;return;
				}
			}}
			}__CLOVER_66_0.cloverRec.S[7347]++;type_utilisee.addElement(t);
		}
	}}
	public void ajoute_type(Vector t)
	{__CLOVER_66_0.cloverRec.M[533]++;
		__CLOVER_66_0.cloverRec.S[7348]++;int i,j;
		__CLOVER_66_0.cloverRec.S[7349]++;boolean trouve;

		__CLOVER_66_0.cloverRec.S[7350]++;if((((t!=null) && (++__CLOVER_66_0.cloverRec.CT[1982]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[1982]==0&false)))
		{{
			__CLOVER_66_0.cloverRec.S[7351]++;for(i=0;(((i<t.size()) && (++__CLOVER_66_0.cloverRec.CT[1983]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[1983]==0&false));i++)
			{{
				__CLOVER_66_0.cloverRec.S[7352]++;if((((!((Type)t.elementAt(i)).is_like) && (++__CLOVER_66_0.cloverRec.CT[1984]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[1984]==0&false)))
				{{
					__CLOVER_66_0.cloverRec.S[7353]++;trouve=false;
					__CLOVER_66_0.cloverRec.S[7354]++;for(j=0;(((!trouve&&j<type_utilisee.size()) && (++__CLOVER_66_0.cloverRec.CT[1985]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[1985]==0&false));j++)
					{{
						__CLOVER_66_0.cloverRec.S[7355]++;if((((((Type)type_utilisee.elementAt(j)).egaux(
							((Type)t.elementAt(i)))) && (++__CLOVER_66_0.cloverRec.CT[1986]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[1986]==0&false)))
						{{
								__CLOVER_66_0.cloverRec.S[7356]++;trouve=true;
						}
					}}
					}__CLOVER_66_0.cloverRec.S[7357]++;if((((!trouve) && (++__CLOVER_66_0.cloverRec.CT[1987]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[1987]==0&false)))
					{{
						__CLOVER_66_0.cloverRec.S[7358]++;ajoute_type((Type)t.elementAt(i));
					}
				}}
			}}
		}}
	}}

        //public String nom_fichier;

	public tinyeiffel.ast.Token remplitToken(Token n)
	{__CLOVER_66_0.cloverRec.M[534]++;
                //assert(n!=null);
		__CLOVER_66_0.cloverRec.S[7359]++;if((((n==null) && (++__CLOVER_66_0.cloverRec.CT[1988]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[1988]==0&false)))
			{__CLOVER_66_0.cloverRec.S[7360]++;return null;
		}__CLOVER_66_0.cloverRec.S[7361]++;return new tinyeiffel.ast.Token(n.getLine(),n.getColumn(),n.getText(),getFilename());
	}


protected EiffelParser(TokenBuffer tokenBuf, int k) {
  super(tokenBuf,k);__CLOVER_66_0.cloverRec.S[7362]++;__CLOVER_66_0.cloverRec.M[535]++;
  __CLOVER_66_0.cloverRec.S[7363]++;tokenNames = _tokenNames;
  __CLOVER_66_0.cloverRec.S[7364]++;buildTokenTypeASTClassMap();
  __CLOVER_66_0.cloverRec.S[7365]++;astFactory = new ASTFactory(getTokenTypeToASTClassMap());
}

public EiffelParser(TokenBuffer tokenBuf) {
  this(tokenBuf,4);__CLOVER_66_0.cloverRec.S[7366]++;__CLOVER_66_0.cloverRec.M[536]++;
}

protected EiffelParser(TokenStream lexer, int k) {
  super(lexer,k);__CLOVER_66_0.cloverRec.S[7367]++;__CLOVER_66_0.cloverRec.M[537]++;
  __CLOVER_66_0.cloverRec.S[7368]++;tokenNames = _tokenNames;
  __CLOVER_66_0.cloverRec.S[7369]++;buildTokenTypeASTClassMap();
  __CLOVER_66_0.cloverRec.S[7370]++;astFactory = new ASTFactory(getTokenTypeToASTClassMap());
}

public EiffelParser(TokenStream lexer) {
  this(lexer,4);__CLOVER_66_0.cloverRec.S[7371]++;__CLOVER_66_0.cloverRec.M[538]++;
}

public EiffelParser(ParserSharedInputState state) {
  super(state,4);__CLOVER_66_0.cloverRec.S[7372]++;__CLOVER_66_0.cloverRec.M[539]++;
  __CLOVER_66_0.cloverRec.S[7373]++;tokenNames = _tokenNames;
  __CLOVER_66_0.cloverRec.S[7374]++;buildTokenTypeASTClassMap();
  __CLOVER_66_0.cloverRec.S[7375]++;astFactory = new ASTFactory(getTokenTypeToASTClassMap());
}

	public final Classe  classe() throws RecognitionException, TokenStreamException {__CLOVER_66_0.cloverRec.M[540]++;
		__CLOVER_66_0.cloverRec.S[7376]++;Classe res=null;
		
		__CLOVER_66_0.cloverRec.S[7377]++;returnAST = null;
		__CLOVER_66_0.cloverRec.S[7378]++;ASTPair currentAST = new ASTPair();
		__CLOVER_66_0.cloverRec.S[7379]++;tinyeiffel.compiler.ASTDefaut classe_AST = null;
		__CLOVER_66_0.cloverRec.S[7380]++;Token  exp = null;
		__CLOVER_66_0.cloverRec.S[7381]++;tinyeiffel.compiler.ASTDefaut exp_AST = null;
		__CLOVER_66_0.cloverRec.S[7382]++;Token  def = null;
		__CLOVER_66_0.cloverRec.S[7383]++;tinyeiffel.compiler.ASTDefaut def_AST = null;
		__CLOVER_66_0.cloverRec.S[7384]++;Token  c = null;
		__CLOVER_66_0.cloverRec.S[7385]++;tinyeiffel.compiler.ASTDefaut c_AST = null;
		__CLOVER_66_0.cloverRec.S[7386]++;Token  tobs = null;
		__CLOVER_66_0.cloverRec.S[7387]++;tinyeiffel.compiler.ASTDefaut tobs_AST = null;
		__CLOVER_66_0.cloverRec.S[7388]++;Token  f0 = null;
		__CLOVER_66_0.cloverRec.S[7389]++;tinyeiffel.compiler.ASTDefaut f0_AST = null;
		__CLOVER_66_0.cloverRec.S[7390]++;Token  inv = null;
		__CLOVER_66_0.cloverRec.S[7391]++;tinyeiffel.compiler.ASTDefaut inv_AST = null;
		__CLOVER_66_0.cloverRec.S[7392]++;Token  e = null;
		__CLOVER_66_0.cloverRec.S[7393]++;tinyeiffel.compiler.ASTDefaut e_AST = null;
		
		__CLOVER_66_0.cloverRec.S[7394]++;Type n;
		__CLOVER_66_0.cloverRec.S[7395]++;Vector f=new Vector(),h=null,invariant=null,creation=null;
		__CLOVER_66_0.cloverRec.S[7396]++;Feature f1=null;
		__CLOVER_66_0.cloverRec.S[7397]++;NomFeature nom=null;
		__CLOVER_66_0.cloverRec.S[7398]++;Chaine obsolete=null;
		__CLOVER_66_0.cloverRec.S[7399]++;Vector index=null,commentaire=null,export=null;
		__CLOVER_66_0.cloverRec.S[7400]++;boolean expanded=false,deferred=false;
		__CLOVER_66_0.cloverRec.S[7401]++;Type type_exp;
		__CLOVER_66_0.cloverRec.S[7402]++;Token fea=null;
		
		
		__CLOVER_66_0.cloverRec.S[7403]++;try {      // for error handling
			{
			__CLOVER_66_0.cloverRec.S[7404]++;boolean __CLOVER_bool0=false;switch ( LA(1)) {
			case INDEXING:if (!__CLOVER_bool0) {__CLOVER_66_0.cloverRec.S[7405]++;__CLOVER_bool0=true;}
			{
				__CLOVER_66_0.cloverRec.S[7406]++;index=indexing();
				__CLOVER_66_0.cloverRec.S[7407]++;astFactory.addASTChild(currentAST, returnAST);
				__CLOVER_66_0.cloverRec.S[7408]++;break;
			}
			case EXPANDED:if (!__CLOVER_bool0) {__CLOVER_66_0.cloverRec.S[7409]++;__CLOVER_bool0=true;}
			case DEFERRED:if (!__CLOVER_bool0) {__CLOVER_66_0.cloverRec.S[7410]++;__CLOVER_bool0=true;}
			case CLASS:if (!__CLOVER_bool0) {__CLOVER_66_0.cloverRec.S[7411]++;__CLOVER_bool0=true;}
			{
				__CLOVER_66_0.cloverRec.S[7412]++;break;
			}
			default:if (!__CLOVER_bool0) {__CLOVER_66_0.cloverRec.S[7413]++;__CLOVER_bool0=true;}
			{
				__CLOVER_66_0.cloverRec.S[7414]++;throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			{
			__CLOVER_66_0.cloverRec.S[7415]++;boolean __CLOVER_bool1=false;switch ( LA(1)) {
			case EXPANDED:if (!__CLOVER_bool1) {__CLOVER_66_0.cloverRec.S[7416]++;__CLOVER_bool1=true;}
			{
				__CLOVER_66_0.cloverRec.S[7417]++;exp = LT(1);
				__CLOVER_66_0.cloverRec.S[7418]++;exp_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(exp);
				__CLOVER_66_0.cloverRec.S[7419]++;astFactory.addASTChild(currentAST, exp_AST);
				__CLOVER_66_0.cloverRec.S[7420]++;match(EXPANDED);
				__CLOVER_66_0.cloverRec.S[7421]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[1989]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[1989]==0&false))) {{
					__CLOVER_66_0.cloverRec.S[7422]++;expanded=true;
				}
				}__CLOVER_66_0.cloverRec.S[7423]++;break;
			}
			case DEFERRED:if (!__CLOVER_bool1) {__CLOVER_66_0.cloverRec.S[7424]++;__CLOVER_bool1=true;}
			{
				__CLOVER_66_0.cloverRec.S[7425]++;def = LT(1);
				__CLOVER_66_0.cloverRec.S[7426]++;def_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(def);
				__CLOVER_66_0.cloverRec.S[7427]++;astFactory.addASTChild(currentAST, def_AST);
				__CLOVER_66_0.cloverRec.S[7428]++;match(DEFERRED);
				__CLOVER_66_0.cloverRec.S[7429]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[1990]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[1990]==0&false))) {{
					__CLOVER_66_0.cloverRec.S[7430]++;deferred=true;
				}
				}__CLOVER_66_0.cloverRec.S[7431]++;break;
			}
			case CLASS:if (!__CLOVER_bool1) {__CLOVER_66_0.cloverRec.S[7432]++;__CLOVER_bool1=true;}
			{
				__CLOVER_66_0.cloverRec.S[7433]++;break;
			}
			default:if (!__CLOVER_bool1) {__CLOVER_66_0.cloverRec.S[7434]++;__CLOVER_bool1=true;}
			{
				__CLOVER_66_0.cloverRec.S[7435]++;throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			__CLOVER_66_0.cloverRec.S[7436]++;c = LT(1);
			__CLOVER_66_0.cloverRec.S[7437]++;c_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(c);
			__CLOVER_66_0.cloverRec.S[7438]++;astFactory.makeASTRoot(currentAST, c_AST);
			__CLOVER_66_0.cloverRec.S[7439]++;match(CLASS);
			__CLOVER_66_0.cloverRec.S[7440]++;n=nom_class();
			__CLOVER_66_0.cloverRec.S[7441]++;astFactory.addASTChild(currentAST, returnAST);
			{
			__CLOVER_66_0.cloverRec.S[7442]++;boolean __CLOVER_bool2=false;switch ( LA(1)) {
			case OBSOLETE:if (!__CLOVER_bool2) {__CLOVER_66_0.cloverRec.S[7443]++;__CLOVER_bool2=true;}
			{
				__CLOVER_66_0.cloverRec.S[7444]++;tobs = LT(1);
				__CLOVER_66_0.cloverRec.S[7445]++;tobs_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(tobs);
				__CLOVER_66_0.cloverRec.S[7446]++;astFactory.addASTChild(currentAST, tobs_AST);
				__CLOVER_66_0.cloverRec.S[7447]++;match(OBSOLETE);
				__CLOVER_66_0.cloverRec.S[7448]++;obsolete=string();
				__CLOVER_66_0.cloverRec.S[7449]++;astFactory.addASTChild(currentAST, returnAST);
				__CLOVER_66_0.cloverRec.S[7450]++;break;
			}
			case FEATURE:if (!__CLOVER_bool2) {__CLOVER_66_0.cloverRec.S[7451]++;__CLOVER_bool2=true;}
			case INHERIT:if (!__CLOVER_bool2) {__CLOVER_66_0.cloverRec.S[7452]++;__CLOVER_bool2=true;}
			case CREATION:if (!__CLOVER_bool2) {__CLOVER_66_0.cloverRec.S[7453]++;__CLOVER_bool2=true;}
			{
				__CLOVER_66_0.cloverRec.S[7454]++;break;
			}
			default:if (!__CLOVER_bool2) {__CLOVER_66_0.cloverRec.S[7455]++;__CLOVER_bool2=true;}
			{
				__CLOVER_66_0.cloverRec.S[7456]++;throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			{
			__CLOVER_66_0.cloverRec.S[7457]++;boolean __CLOVER_bool3=false;switch ( LA(1)) {
			case INHERIT:if (!__CLOVER_bool3) {__CLOVER_66_0.cloverRec.S[7458]++;__CLOVER_bool3=true;}
			{
				__CLOVER_66_0.cloverRec.S[7459]++;h=heritage();
				__CLOVER_66_0.cloverRec.S[7460]++;astFactory.addASTChild(currentAST, returnAST);
				__CLOVER_66_0.cloverRec.S[7461]++;break;
			}
			case FEATURE:if (!__CLOVER_bool3) {__CLOVER_66_0.cloverRec.S[7462]++;__CLOVER_bool3=true;}
			case CREATION:if (!__CLOVER_bool3) {__CLOVER_66_0.cloverRec.S[7463]++;__CLOVER_bool3=true;}
			{
				__CLOVER_66_0.cloverRec.S[7464]++;break;
			}
			default:if (!__CLOVER_bool3) {__CLOVER_66_0.cloverRec.S[7465]++;__CLOVER_bool3=true;}
			{
				__CLOVER_66_0.cloverRec.S[7466]++;throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			{
			__CLOVER_66_0.cloverRec.S[7467]++;boolean __CLOVER_bool4=false;switch ( LA(1)) {
			case CREATION:if (!__CLOVER_bool4) {__CLOVER_66_0.cloverRec.S[7468]++;__CLOVER_bool4=true;}
			{
				__CLOVER_66_0.cloverRec.S[7469]++;creation=creation();
				__CLOVER_66_0.cloverRec.S[7470]++;astFactory.addASTChild(currentAST, returnAST);
				__CLOVER_66_0.cloverRec.S[7471]++;break;
			}
			case FEATURE:if (!__CLOVER_bool4) {__CLOVER_66_0.cloverRec.S[7472]++;__CLOVER_bool4=true;}
			{
				__CLOVER_66_0.cloverRec.S[7473]++;break;
			}
			default:if (!__CLOVER_bool4) {__CLOVER_66_0.cloverRec.S[7474]++;__CLOVER_bool4=true;}
			{
				__CLOVER_66_0.cloverRec.S[7475]++;throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			{
			__CLOVER_66_0.cloverRec.S[7476]++;int _cnt18=0;
			__CLOVER_66_0.cloverRec.S[7477]++;_loop18:
			do {{
				__CLOVER_66_0.cloverRec.S[7478]++;if (((((LA(1)==FEATURE)) && (++__CLOVER_66_0.cloverRec.CT[1991]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[1991]==0&false))) {{
					__CLOVER_66_0.cloverRec.S[7479]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[1992]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[1992]==0&false))) {{
						__CLOVER_66_0.cloverRec.S[7480]++;fea=null;
					}
					}{
					__CLOVER_66_0.cloverRec.S[7481]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[1993]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[1993]==0&false))) {{
						__CLOVER_66_0.cloverRec.S[7482]++;export=null;
					}
					}__CLOVER_66_0.cloverRec.S[7483]++;f0 = LT(1);
					__CLOVER_66_0.cloverRec.S[7484]++;f0_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(f0);
					__CLOVER_66_0.cloverRec.S[7485]++;astFactory.addASTChild(currentAST, f0_AST);
					__CLOVER_66_0.cloverRec.S[7486]++;match(FEATURE);
					__CLOVER_66_0.cloverRec.S[7487]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[1994]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[1994]==0&false))) {{
						__CLOVER_66_0.cloverRec.S[7488]++;fea=f0;
					}
					}{
					__CLOVER_66_0.cloverRec.S[7489]++;boolean __CLOVER_bool5=false;switch ( LA(1)) {
					case ACOLADEO:if (!__CLOVER_bool5) {__CLOVER_66_0.cloverRec.S[7490]++;__CLOVER_bool5=true;}
					{
						__CLOVER_66_0.cloverRec.S[7491]++;tinyeiffel.compiler.ASTDefaut tmp9_AST = null;
						__CLOVER_66_0.cloverRec.S[7492]++;tmp9_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(LT(1));
						__CLOVER_66_0.cloverRec.S[7493]++;astFactory.addASTChild(currentAST, tmp9_AST);
						__CLOVER_66_0.cloverRec.S[7494]++;match(ACOLADEO);
						__CLOVER_66_0.cloverRec.S[7495]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[1995]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[1995]==0&false))) {{
							__CLOVER_66_0.cloverRec.S[7496]++;export=new Vector();
						}
						}{
						__CLOVER_66_0.cloverRec.S[7497]++;boolean __CLOVER_bool6=false;switch ( LA(1)) {
						case EXPANDED:if (!__CLOVER_bool6) {__CLOVER_66_0.cloverRec.S[7498]++;__CLOVER_bool6=true;}
						case ID:if (!__CLOVER_bool6) {__CLOVER_66_0.cloverRec.S[7499]++;__CLOVER_bool6=true;}
						case LIKE:if (!__CLOVER_bool6) {__CLOVER_66_0.cloverRec.S[7500]++;__CLOVER_bool6=true;}
						{
							__CLOVER_66_0.cloverRec.S[7501]++;type_exp=type();
							__CLOVER_66_0.cloverRec.S[7502]++;astFactory.addASTChild(currentAST, returnAST);
							__CLOVER_66_0.cloverRec.S[7503]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[1996]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[1996]==0&false))) {{
								__CLOVER_66_0.cloverRec.S[7504]++;export.addElement(type_exp);
							}
							}{
							__CLOVER_66_0.cloverRec.S[7505]++;_loop12:
							do {{
								__CLOVER_66_0.cloverRec.S[7506]++;if (((((LA(1)==VIRGULE)) && (++__CLOVER_66_0.cloverRec.CT[1997]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[1997]==0&false))) {{
									__CLOVER_66_0.cloverRec.S[7507]++;tinyeiffel.compiler.ASTDefaut tmp10_AST = null;
									__CLOVER_66_0.cloverRec.S[7508]++;tmp10_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(LT(1));
									__CLOVER_66_0.cloverRec.S[7509]++;astFactory.addASTChild(currentAST, tmp10_AST);
									__CLOVER_66_0.cloverRec.S[7510]++;match(VIRGULE);
									__CLOVER_66_0.cloverRec.S[7511]++;type_exp=type();
									__CLOVER_66_0.cloverRec.S[7512]++;astFactory.addASTChild(currentAST, returnAST);
									__CLOVER_66_0.cloverRec.S[7513]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[1998]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[1998]==0&false))) {{
										__CLOVER_66_0.cloverRec.S[7514]++;export.addElement(type_exp);
									}
								}}
								}else {{
									__CLOVER_66_0.cloverRec.S[7515]++;break _loop12;
								}
								
							}} }while (true);
							}
							__CLOVER_66_0.cloverRec.S[7516]++;break;
						}
						case ACOLADEF:if (!__CLOVER_bool6) {__CLOVER_66_0.cloverRec.S[7517]++;__CLOVER_bool6=true;}
						{
							__CLOVER_66_0.cloverRec.S[7518]++;break;
						}
						default:if (!__CLOVER_bool6) {__CLOVER_66_0.cloverRec.S[7519]++;__CLOVER_bool6=true;}
						{
							__CLOVER_66_0.cloverRec.S[7520]++;throw new NoViableAltException(LT(1), getFilename());
						}
						}
						}
						__CLOVER_66_0.cloverRec.S[7521]++;tinyeiffel.compiler.ASTDefaut tmp11_AST = null;
						__CLOVER_66_0.cloverRec.S[7522]++;tmp11_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(LT(1));
						__CLOVER_66_0.cloverRec.S[7523]++;astFactory.addASTChild(currentAST, tmp11_AST);
						__CLOVER_66_0.cloverRec.S[7524]++;match(ACOLADEF);
						__CLOVER_66_0.cloverRec.S[7525]++;break;
					}
					case FEATURE:if (!__CLOVER_bool5) {__CLOVER_66_0.cloverRec.S[7526]++;__CLOVER_bool5=true;}
					case SEMI:if (!__CLOVER_bool5) {__CLOVER_66_0.cloverRec.S[7527]++;__CLOVER_bool5=true;}
					case INVARIANT:if (!__CLOVER_bool5) {__CLOVER_66_0.cloverRec.S[7528]++;__CLOVER_bool5=true;}
					case END:if (!__CLOVER_bool5) {__CLOVER_66_0.cloverRec.S[7529]++;__CLOVER_bool5=true;}
					case ID:if (!__CLOVER_bool5) {__CLOVER_66_0.cloverRec.S[7530]++;__CLOVER_bool5=true;}
					case INFIX:if (!__CLOVER_bool5) {__CLOVER_66_0.cloverRec.S[7531]++;__CLOVER_bool5=true;}
					case PREFIX:if (!__CLOVER_bool5) {__CLOVER_66_0.cloverRec.S[7532]++;__CLOVER_bool5=true;}
					case FROZEN:if (!__CLOVER_bool5) {__CLOVER_66_0.cloverRec.S[7533]++;__CLOVER_bool5=true;}
					{
						__CLOVER_66_0.cloverRec.S[7534]++;break;
					}
					default:if (!__CLOVER_bool5) {__CLOVER_66_0.cloverRec.S[7535]++;__CLOVER_bool5=true;}
					{
						__CLOVER_66_0.cloverRec.S[7536]++;throw new NoViableAltException(LT(1), getFilename());
					}
					}
					}
					}
					{
					__CLOVER_66_0.cloverRec.S[7537]++;boolean __CLOVER_bool7=false;switch ( LA(1)) {
					case FEATURE:if (!__CLOVER_bool7) {__CLOVER_66_0.cloverRec.S[7538]++;__CLOVER_bool7=true;}
					case INVARIANT:if (!__CLOVER_bool7) {__CLOVER_66_0.cloverRec.S[7539]++;__CLOVER_bool7=true;}
					case END:if (!__CLOVER_bool7) {__CLOVER_66_0.cloverRec.S[7540]++;__CLOVER_bool7=true;}
					case ID:if (!__CLOVER_bool7) {__CLOVER_66_0.cloverRec.S[7541]++;__CLOVER_bool7=true;}
					case INFIX:if (!__CLOVER_bool7) {__CLOVER_66_0.cloverRec.S[7542]++;__CLOVER_bool7=true;}
					case PREFIX:if (!__CLOVER_bool7) {__CLOVER_66_0.cloverRec.S[7543]++;__CLOVER_bool7=true;}
					case FROZEN:if (!__CLOVER_bool7) {__CLOVER_66_0.cloverRec.S[7544]++;__CLOVER_bool7=true;}
					{
						{
						__CLOVER_66_0.cloverRec.S[7545]++;_loop15:
						do {{
							__CLOVER_66_0.cloverRec.S[7546]++;if (((((_tokenSet_0.member(LA(1)))) && (++__CLOVER_66_0.cloverRec.CT[1999]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[1999]==0&false))) {{
								__CLOVER_66_0.cloverRec.S[7547]++;f1=feature(export,fea);
								__CLOVER_66_0.cloverRec.S[7548]++;astFactory.addASTChild(currentAST, returnAST);
								__CLOVER_66_0.cloverRec.S[7549]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2000]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2000]==0&false))) {{
									__CLOVER_66_0.cloverRec.S[7550]++;f.addElement(f1);__CLOVER_66_0.cloverRec.S[7551]++;export=null;__CLOVER_66_0.cloverRec.S[7552]++;fea=null;/*System.out.println("Suite4");*/
								}
							}}
							}else {{
								__CLOVER_66_0.cloverRec.S[7553]++;break _loop15;
							}
							
						}} }while (true);
						}
						__CLOVER_66_0.cloverRec.S[7554]++;break;
					}
					case SEMI:if (!__CLOVER_bool7) {__CLOVER_66_0.cloverRec.S[7555]++;__CLOVER_bool7=true;}
					{
						{
						__CLOVER_66_0.cloverRec.S[7556]++;int _cnt17=0;
						__CLOVER_66_0.cloverRec.S[7557]++;_loop17:
						do {{
							__CLOVER_66_0.cloverRec.S[7558]++;if (((((LA(1)==SEMI)) && (++__CLOVER_66_0.cloverRec.CT[2001]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2001]==0&false))) {{
								__CLOVER_66_0.cloverRec.S[7559]++;tinyeiffel.compiler.ASTDefaut tmp12_AST = null;
								__CLOVER_66_0.cloverRec.S[7560]++;tmp12_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(LT(1));
								__CLOVER_66_0.cloverRec.S[7561]++;astFactory.addASTChild(currentAST, tmp12_AST);
								__CLOVER_66_0.cloverRec.S[7562]++;match(SEMI);
							}
							}else {{
								__CLOVER_66_0.cloverRec.S[7563]++;if ( (((_cnt17>=1 ) && (++__CLOVER_66_0.cloverRec.CT[2002]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2002]==0&false))) {{ __CLOVER_66_0.cloverRec.S[7564]++;break _loop17; } }else {{__CLOVER_66_0.cloverRec.S[7565]++;throw new NoViableAltException(LT(1), getFilename());}
							}}
							
							}__CLOVER_66_0.cloverRec.S[7566]++;_cnt17++;
						} }while (true);
						}
						__CLOVER_66_0.cloverRec.S[7567]++;break;
					}
					default:if (!__CLOVER_bool7) {__CLOVER_66_0.cloverRec.S[7568]++;__CLOVER_bool7=true;}
					{
						__CLOVER_66_0.cloverRec.S[7569]++;throw new NoViableAltException(LT(1), getFilename());
					}
					}
					}
				}
				}else {{
					__CLOVER_66_0.cloverRec.S[7570]++;if ( (((_cnt18>=1 ) && (++__CLOVER_66_0.cloverRec.CT[2003]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2003]==0&false))) {{ __CLOVER_66_0.cloverRec.S[7571]++;break _loop18; } }else {{__CLOVER_66_0.cloverRec.S[7572]++;throw new NoViableAltException(LT(1), getFilename());}
				}}
				
				}__CLOVER_66_0.cloverRec.S[7573]++;_cnt18++;
			} }while (true);
			}
			{
			__CLOVER_66_0.cloverRec.S[7574]++;boolean __CLOVER_bool8=false;switch ( LA(1)) {
			case INVARIANT:if (!__CLOVER_bool8) {__CLOVER_66_0.cloverRec.S[7575]++;__CLOVER_bool8=true;}
			{
				__CLOVER_66_0.cloverRec.S[7576]++;inv = LT(1);
				__CLOVER_66_0.cloverRec.S[7577]++;inv_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(inv);
				__CLOVER_66_0.cloverRec.S[7578]++;astFactory.addASTChild(currentAST, inv_AST);
				__CLOVER_66_0.cloverRec.S[7579]++;match(INVARIANT);
				__CLOVER_66_0.cloverRec.S[7580]++;invariant=liste_assert();
				__CLOVER_66_0.cloverRec.S[7581]++;astFactory.addASTChild(currentAST, returnAST);
				__CLOVER_66_0.cloverRec.S[7582]++;break;
			}
			case END:if (!__CLOVER_bool8) {__CLOVER_66_0.cloverRec.S[7583]++;__CLOVER_bool8=true;}
			{
				__CLOVER_66_0.cloverRec.S[7584]++;break;
			}
			default:if (!__CLOVER_bool8) {__CLOVER_66_0.cloverRec.S[7585]++;__CLOVER_bool8=true;}
			{
				__CLOVER_66_0.cloverRec.S[7586]++;throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			__CLOVER_66_0.cloverRec.S[7587]++;e = LT(1);
			__CLOVER_66_0.cloverRec.S[7588]++;e_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(e);
			__CLOVER_66_0.cloverRec.S[7589]++;astFactory.addASTChild(currentAST, e_AST);
			__CLOVER_66_0.cloverRec.S[7590]++;match(END);
			__CLOVER_66_0.cloverRec.S[7591]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2004]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2004]==0&false))) {{
				
						//System.out.println("classe:"+n.nom);
						//if(c instanceof antlr.CommonToken)
						//	System.out.println("Ok");
						//else
						//	System.out.println("Bad");
						//System.out.println("line="+c.getLine());
						__CLOVER_66_0.cloverRec.S[7592]++;commentaire=lexer.liste_commentaire;
						__CLOVER_66_0.cloverRec.S[7593]++;res=new Classe(deferred,expanded,n,f,h,invariant,creation,
								obsolete,index,commentaire);
						//res.feature=f;
						//res.heritage=h;
						__CLOVER_66_0.cloverRec.S[7594]++;ajoute_type(n);
						__CLOVER_66_0.cloverRec.S[7595]++;tinyeiffel.ast.Token tclasse,texp_defer,tobsolete=null,tinvariant=null,tend;
						__CLOVER_66_0.cloverRec.S[7596]++;tclasse=remplitToken(c);
						__CLOVER_66_0.cloverRec.S[7597]++;if((((exp!=null) && (++__CLOVER_66_0.cloverRec.CT[2005]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2005]==0&false)))
							{__CLOVER_66_0.cloverRec.S[7598]++;texp_defer=remplitToken(exp);
						}else {__CLOVER_66_0.cloverRec.S[7599]++;if((((def!=null) && (++__CLOVER_66_0.cloverRec.CT[2006]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2006]==0&false)))
							{__CLOVER_66_0.cloverRec.S[7600]++;texp_defer=remplitToken(def);
						}else
							{__CLOVER_66_0.cloverRec.S[7601]++;texp_defer=null;
						}}__CLOVER_66_0.cloverRec.S[7602]++;tobsolete=remplitToken(tobs);
						__CLOVER_66_0.cloverRec.S[7603]++;tinvariant=remplitToken(inv);
						__CLOVER_66_0.cloverRec.S[7604]++;tend=remplitToken(e);
						__CLOVER_66_0.cloverRec.S[7605]++;res.set_token(tclasse,texp_defer,tobsolete,tinvariant,tend);
					
			}
			}__CLOVER_66_0.cloverRec.S[7606]++;classe_AST = (tinyeiffel.compiler.ASTDefaut)currentAST.root;
		}
		catch (RecognitionException ex) {
			__CLOVER_66_0.cloverRec.S[7607]++;if ((((inputState.guessing==0) && (++__CLOVER_66_0.cloverRec.CT[2007]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2007]==0&false))) {{
				
						__CLOVER_66_0.cloverRec.S[7608]++;logging.erreur(new ErreurSource("Erreur dans la classe",ex.getLine(),
									ex.getColumn(),ex.getFilename()));
					
			} }else {{
				__CLOVER_66_0.cloverRec.S[7609]++;throw ex;
			}
		}}
		__CLOVER_66_0.cloverRec.S[7610]++;returnAST = classe_AST;
		__CLOVER_66_0.cloverRec.S[7611]++;return res;
	}
	
	public final Vector  indexing() throws RecognitionException, TokenStreamException {__CLOVER_66_0.cloverRec.M[541]++;
		__CLOVER_66_0.cloverRec.S[7612]++;Vector res=new Vector();
		
		__CLOVER_66_0.cloverRec.S[7613]++;returnAST = null;
		__CLOVER_66_0.cloverRec.S[7614]++;ASTPair currentAST = new ASTPair();
		__CLOVER_66_0.cloverRec.S[7615]++;tinyeiffel.compiler.ASTDefaut indexing_AST = null;
		__CLOVER_66_0.cloverRec.S[7616]++;Token  n = null;
		__CLOVER_66_0.cloverRec.S[7617]++;tinyeiffel.compiler.ASTDefaut n_AST = null;
		__CLOVER_66_0.cloverRec.S[7618]++;Token  n1 = null;
		__CLOVER_66_0.cloverRec.S[7619]++;tinyeiffel.compiler.ASTDefaut n1_AST = null;
		__CLOVER_66_0.cloverRec.S[7620]++;Token  s1 = null;
		__CLOVER_66_0.cloverRec.S[7621]++;tinyeiffel.compiler.ASTDefaut s1_AST = null;
		__CLOVER_66_0.cloverRec.S[7622]++;Token  n2 = null;
		__CLOVER_66_0.cloverRec.S[7623]++;tinyeiffel.compiler.ASTDefaut n2_AST = null;
		__CLOVER_66_0.cloverRec.S[7624]++;Token  s2 = null;
		__CLOVER_66_0.cloverRec.S[7625]++;tinyeiffel.compiler.ASTDefaut s2_AST = null;
		
		__CLOVER_66_0.cloverRec.S[7626]++;String tmp1="",tmp2="";
		__CLOVER_66_0.cloverRec.S[7627]++;Vector liste=new Vector();
		__CLOVER_66_0.cloverRec.S[7628]++;Indexing index=null;
		
		
		__CLOVER_66_0.cloverRec.S[7629]++;try {      // for error handling
			__CLOVER_66_0.cloverRec.S[7630]++;tinyeiffel.compiler.ASTDefaut tmp13_AST = null;
			__CLOVER_66_0.cloverRec.S[7631]++;tmp13_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(LT(1));
			__CLOVER_66_0.cloverRec.S[7632]++;astFactory.makeASTRoot(currentAST, tmp13_AST);
			__CLOVER_66_0.cloverRec.S[7633]++;match(INDEXING);
			{
			__CLOVER_66_0.cloverRec.S[7634]++;int _cnt28=0;
			__CLOVER_66_0.cloverRec.S[7635]++;_loop28:
			do {{
				__CLOVER_66_0.cloverRec.S[7636]++;if (((((LA(1)==ID)) && (++__CLOVER_66_0.cloverRec.CT[2008]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2008]==0&false))) {{
					__CLOVER_66_0.cloverRec.S[7637]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2009]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2009]==0&false))) {{
						__CLOVER_66_0.cloverRec.S[7638]++;liste=new Vector();
					}
					}__CLOVER_66_0.cloverRec.S[7639]++;n = LT(1);
					__CLOVER_66_0.cloverRec.S[7640]++;n_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(n);
					__CLOVER_66_0.cloverRec.S[7641]++;astFactory.addASTChild(currentAST, n_AST);
					__CLOVER_66_0.cloverRec.S[7642]++;match(ID);
					__CLOVER_66_0.cloverRec.S[7643]++;tinyeiffel.compiler.ASTDefaut tmp14_AST = null;
					__CLOVER_66_0.cloverRec.S[7644]++;tmp14_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(LT(1));
					__CLOVER_66_0.cloverRec.S[7645]++;astFactory.addASTChild(currentAST, tmp14_AST);
					__CLOVER_66_0.cloverRec.S[7646]++;match(DOUBLE_POINT);
					{
					__CLOVER_66_0.cloverRec.S[7647]++;boolean __CLOVER_bool9=false;switch ( LA(1)) {
					case ID:if (!__CLOVER_bool9) {__CLOVER_66_0.cloverRec.S[7648]++;__CLOVER_bool9=true;}
					{
						__CLOVER_66_0.cloverRec.S[7649]++;n1 = LT(1);
						__CLOVER_66_0.cloverRec.S[7650]++;n1_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(n1);
						__CLOVER_66_0.cloverRec.S[7651]++;astFactory.addASTChild(currentAST, n1_AST);
						__CLOVER_66_0.cloverRec.S[7652]++;match(ID);
						__CLOVER_66_0.cloverRec.S[7653]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2010]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2010]==0&false))) {{
							__CLOVER_66_0.cloverRec.S[7654]++;tmp1=n1.getText();
						}
						}__CLOVER_66_0.cloverRec.S[7655]++;break;
					}
					case STRING:if (!__CLOVER_bool9) {__CLOVER_66_0.cloverRec.S[7656]++;__CLOVER_bool9=true;}
					{
						__CLOVER_66_0.cloverRec.S[7657]++;s1 = LT(1);
						__CLOVER_66_0.cloverRec.S[7658]++;s1_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(s1);
						__CLOVER_66_0.cloverRec.S[7659]++;astFactory.addASTChild(currentAST, s1_AST);
						__CLOVER_66_0.cloverRec.S[7660]++;match(STRING);
						__CLOVER_66_0.cloverRec.S[7661]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2011]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2011]==0&false))) {{
							__CLOVER_66_0.cloverRec.S[7662]++;tmp1=s1.getText();
						}
						}__CLOVER_66_0.cloverRec.S[7663]++;break;
					}
					default:if (!__CLOVER_bool9) {__CLOVER_66_0.cloverRec.S[7664]++;__CLOVER_bool9=true;}
					{
						__CLOVER_66_0.cloverRec.S[7665]++;throw new NoViableAltException(LT(1), getFilename());
					}
					}
					}
					__CLOVER_66_0.cloverRec.S[7666]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2012]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2012]==0&false))) {{
						__CLOVER_66_0.cloverRec.S[7667]++;liste.addElement(tmp1);
					}
					}{
					__CLOVER_66_0.cloverRec.S[7668]++;_loop25:
					do {{
						__CLOVER_66_0.cloverRec.S[7669]++;if (((((LA(1)==VIRGULE)) && (++__CLOVER_66_0.cloverRec.CT[2013]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2013]==0&false))) {{
							__CLOVER_66_0.cloverRec.S[7670]++;match(VIRGULE);
							{
							__CLOVER_66_0.cloverRec.S[7671]++;boolean __CLOVER_bool10=false;switch ( LA(1)) {
							case ID:if (!__CLOVER_bool10) {__CLOVER_66_0.cloverRec.S[7672]++;__CLOVER_bool10=true;}
							{
								__CLOVER_66_0.cloverRec.S[7673]++;n2 = LT(1);
								__CLOVER_66_0.cloverRec.S[7674]++;n2_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(n2);
								__CLOVER_66_0.cloverRec.S[7675]++;astFactory.addASTChild(currentAST, n2_AST);
								__CLOVER_66_0.cloverRec.S[7676]++;match(ID);
								__CLOVER_66_0.cloverRec.S[7677]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2014]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2014]==0&false))) {{
									__CLOVER_66_0.cloverRec.S[7678]++;tmp1=n2.getText();
								}
								}__CLOVER_66_0.cloverRec.S[7679]++;break;
							}
							case STRING:if (!__CLOVER_bool10) {__CLOVER_66_0.cloverRec.S[7680]++;__CLOVER_bool10=true;}
							{
								__CLOVER_66_0.cloverRec.S[7681]++;s2 = LT(1);
								__CLOVER_66_0.cloverRec.S[7682]++;s2_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(s2);
								__CLOVER_66_0.cloverRec.S[7683]++;astFactory.addASTChild(currentAST, s2_AST);
								__CLOVER_66_0.cloverRec.S[7684]++;match(STRING);
								__CLOVER_66_0.cloverRec.S[7685]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2015]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2015]==0&false))) {{
									__CLOVER_66_0.cloverRec.S[7686]++;tmp1=s2.getText();
								}
								}__CLOVER_66_0.cloverRec.S[7687]++;break;
							}
							default:if (!__CLOVER_bool10) {__CLOVER_66_0.cloverRec.S[7688]++;__CLOVER_bool10=true;}
							{
								__CLOVER_66_0.cloverRec.S[7689]++;throw new NoViableAltException(LT(1), getFilename());
							}
							}
							}
							__CLOVER_66_0.cloverRec.S[7690]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2016]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2016]==0&false))) {{
								__CLOVER_66_0.cloverRec.S[7691]++;liste.addElement(tmp1);
							}
						}}
						}else {{
							__CLOVER_66_0.cloverRec.S[7692]++;break _loop25;
						}
						
					}} }while (true);
					}
					{
					__CLOVER_66_0.cloverRec.S[7693]++;int _cnt27=0;
					__CLOVER_66_0.cloverRec.S[7694]++;_loop27:
					do {{
						__CLOVER_66_0.cloverRec.S[7695]++;if (((((LA(1)==SEMI)) && (++__CLOVER_66_0.cloverRec.CT[2017]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2017]==0&false))) {{
							__CLOVER_66_0.cloverRec.S[7696]++;tinyeiffel.compiler.ASTDefaut tmp16_AST = null;
							__CLOVER_66_0.cloverRec.S[7697]++;tmp16_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(LT(1));
							__CLOVER_66_0.cloverRec.S[7698]++;astFactory.addASTChild(currentAST, tmp16_AST);
							__CLOVER_66_0.cloverRec.S[7699]++;match(SEMI);
						}
						}else {{
							__CLOVER_66_0.cloverRec.S[7700]++;if ( (((_cnt27>=1 ) && (++__CLOVER_66_0.cloverRec.CT[2018]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2018]==0&false))) {{ __CLOVER_66_0.cloverRec.S[7701]++;break _loop27; } }else {{__CLOVER_66_0.cloverRec.S[7702]++;throw new NoViableAltException(LT(1), getFilename());}
						}}
						
						}__CLOVER_66_0.cloverRec.S[7703]++;_cnt27++;
					} }while (true);
					}
					__CLOVER_66_0.cloverRec.S[7704]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2019]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2019]==0&false))) {{
						
													__CLOVER_66_0.cloverRec.S[7705]++;index=new Indexing(n.getText(),liste);
													__CLOVER_66_0.cloverRec.S[7706]++;res.addElement(index);
												
					}
				}}
				}else {{
					__CLOVER_66_0.cloverRec.S[7707]++;if ( (((_cnt28>=1 ) && (++__CLOVER_66_0.cloverRec.CT[2020]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2020]==0&false))) {{ __CLOVER_66_0.cloverRec.S[7708]++;break _loop28; } }else {{__CLOVER_66_0.cloverRec.S[7709]++;throw new NoViableAltException(LT(1), getFilename());}
				}}
				
				}__CLOVER_66_0.cloverRec.S[7710]++;_cnt28++;
			} }while (true);
			}
			__CLOVER_66_0.cloverRec.S[7711]++;indexing_AST = (tinyeiffel.compiler.ASTDefaut)currentAST.root;
		}
		catch (RecognitionException ex) {
			__CLOVER_66_0.cloverRec.S[7712]++;if ((((inputState.guessing==0) && (++__CLOVER_66_0.cloverRec.CT[2021]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2021]==0&false))) {{
				
						__CLOVER_66_0.cloverRec.S[7713]++;logging.erreur(new ErreurSource("Erreur dans l'index",ex.getLine(),
									ex.getColumn(),ex.getFilename()));
					
			} }else {{
				__CLOVER_66_0.cloverRec.S[7714]++;throw ex;
			}
		}}
		__CLOVER_66_0.cloverRec.S[7715]++;returnAST = indexing_AST;
		__CLOVER_66_0.cloverRec.S[7716]++;return res;
	}
	
	public final Type  nom_class() throws RecognitionException, TokenStreamException {__CLOVER_66_0.cloverRec.M[542]++;
		__CLOVER_66_0.cloverRec.S[7717]++;Type res=null;
		
		__CLOVER_66_0.cloverRec.S[7718]++;returnAST = null;
		__CLOVER_66_0.cloverRec.S[7719]++;ASTPair currentAST = new ASTPair();
		__CLOVER_66_0.cloverRec.S[7720]++;tinyeiffel.compiler.ASTDefaut nom_class_AST = null;
		
		__CLOVER_66_0.cloverRec.S[7721]++;Type d=null;
		
		
		__CLOVER_66_0.cloverRec.S[7722]++;try {      // for error handling
			__CLOVER_66_0.cloverRec.S[7723]++;d=decl_type();
			__CLOVER_66_0.cloverRec.S[7724]++;astFactory.addASTChild(currentAST, returnAST);
			__CLOVER_66_0.cloverRec.S[7725]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2022]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2022]==0&false))) {{
				__CLOVER_66_0.cloverRec.S[7726]++;res=d;
			}
			}__CLOVER_66_0.cloverRec.S[7727]++;nom_class_AST = (tinyeiffel.compiler.ASTDefaut)currentAST.root;
		}
		catch (RecognitionException ex) {
			__CLOVER_66_0.cloverRec.S[7728]++;if ((((inputState.guessing==0) && (++__CLOVER_66_0.cloverRec.CT[2023]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2023]==0&false))) {{
				
						__CLOVER_66_0.cloverRec.S[7729]++;logging.erreur(new ErreurSource("Erreur dans le nom de la classe",ex.getLine(),
									ex.getColumn(),ex.getFilename()));
					
			} }else {{
				__CLOVER_66_0.cloverRec.S[7730]++;throw ex;
			}
		}}
		__CLOVER_66_0.cloverRec.S[7731]++;returnAST = nom_class_AST;
		__CLOVER_66_0.cloverRec.S[7732]++;return res;
	}
	
	public final Chaine  string() throws RecognitionException, TokenStreamException {__CLOVER_66_0.cloverRec.M[543]++;
		__CLOVER_66_0.cloverRec.S[7733]++;Chaine res=null;
		
		__CLOVER_66_0.cloverRec.S[7734]++;returnAST = null;
		__CLOVER_66_0.cloverRec.S[7735]++;ASTPair currentAST = new ASTPair();
		__CLOVER_66_0.cloverRec.S[7736]++;tinyeiffel.compiler.ASTDefaut string_AST = null;
		__CLOVER_66_0.cloverRec.S[7737]++;Token  s = null;
		__CLOVER_66_0.cloverRec.S[7738]++;tinyeiffel.compiler.ASTDefaut s_AST = null;
		__CLOVER_66_0.cloverRec.S[7739]++;Token  s1 = null;
		__CLOVER_66_0.cloverRec.S[7740]++;tinyeiffel.compiler.ASTDefaut s1_AST = null;
		__CLOVER_66_0.cloverRec.S[7741]++;Token  s2 = null;
		__CLOVER_66_0.cloverRec.S[7742]++;tinyeiffel.compiler.ASTDefaut s2_AST = null;
		__CLOVER_66_0.cloverRec.S[7743]++;Token  s3 = null;
		__CLOVER_66_0.cloverRec.S[7744]++;tinyeiffel.compiler.ASTDefaut s3_AST = null;
		
		__CLOVER_66_0.cloverRec.S[7745]++;Vector tmp=new Vector();
		__CLOVER_66_0.cloverRec.S[7746]++;boolean suite=false;
		__CLOVER_66_0.cloverRec.S[7747]++;String str="";
		__CLOVER_66_0.cloverRec.S[7748]++;tinyeiffel.ast.Token opera=null;
		
		
		__CLOVER_66_0.cloverRec.S[7749]++;try {      // for error handling
			__CLOVER_66_0.cloverRec.S[7750]++;boolean __CLOVER_bool11=false;switch ( LA(1)) {
			case STRING:if (!__CLOVER_bool11) {__CLOVER_66_0.cloverRec.S[7751]++;__CLOVER_bool11=true;}
			{
				__CLOVER_66_0.cloverRec.S[7752]++;s = LT(1);
				__CLOVER_66_0.cloverRec.S[7753]++;s_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(s);
				__CLOVER_66_0.cloverRec.S[7754]++;astFactory.addASTChild(currentAST, s_AST);
				__CLOVER_66_0.cloverRec.S[7755]++;match(STRING);
				__CLOVER_66_0.cloverRec.S[7756]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2024]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2024]==0&false))) {{
					
					__CLOVER_66_0.cloverRec.S[7757]++;tmp.addElement(s.getText());
					__CLOVER_66_0.cloverRec.S[7758]++;opera=remplitToken(s);
							__CLOVER_66_0.cloverRec.S[7759]++;res=new Chaine(tmp,opera);
						
				}
				}__CLOVER_66_0.cloverRec.S[7760]++;string_AST = (tinyeiffel.compiler.ASTDefaut)currentAST.root;
				__CLOVER_66_0.cloverRec.S[7761]++;break;
			}
			case STRING2:if (!__CLOVER_bool11) {__CLOVER_66_0.cloverRec.S[7762]++;__CLOVER_bool11=true;}
			{
				__CLOVER_66_0.cloverRec.S[7763]++;s1 = LT(1);
				__CLOVER_66_0.cloverRec.S[7764]++;s1_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(s1);
				__CLOVER_66_0.cloverRec.S[7765]++;astFactory.addASTChild(currentAST, s1_AST);
				__CLOVER_66_0.cloverRec.S[7766]++;match(STRING2);
				__CLOVER_66_0.cloverRec.S[7767]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2025]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2025]==0&false))) {{
					__CLOVER_66_0.cloverRec.S[7768]++;tmp.addElement(s1.getText());__CLOVER_66_0.cloverRec.S[7769]++;opera=remplitToken(s1);
				}
				}{
				__CLOVER_66_0.cloverRec.S[7770]++;_loop273:
				do {{
					__CLOVER_66_0.cloverRec.S[7771]++;if (((((LA(1)==STRING3)) && (++__CLOVER_66_0.cloverRec.CT[2026]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2026]==0&false))) {{
						__CLOVER_66_0.cloverRec.S[7772]++;s2 = LT(1);
						__CLOVER_66_0.cloverRec.S[7773]++;s2_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(s2);
						__CLOVER_66_0.cloverRec.S[7774]++;astFactory.addASTChild(currentAST, s2_AST);
						__CLOVER_66_0.cloverRec.S[7775]++;match(STRING3);
						__CLOVER_66_0.cloverRec.S[7776]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2027]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2027]==0&false))) {{
							
											__CLOVER_66_0.cloverRec.S[7777]++;str=s2.getText();
											__CLOVER_66_0.cloverRec.S[7778]++;tmp.addElement(str);
										
						}
					}}
					}else {{
						__CLOVER_66_0.cloverRec.S[7779]++;break _loop273;
					}
					
				}} }while (true);
				}
				__CLOVER_66_0.cloverRec.S[7780]++;s3 = LT(1);
				__CLOVER_66_0.cloverRec.S[7781]++;s3_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(s3);
				__CLOVER_66_0.cloverRec.S[7782]++;astFactory.addASTChild(currentAST, s3_AST);
				__CLOVER_66_0.cloverRec.S[7783]++;match(STRING4);
				__CLOVER_66_0.cloverRec.S[7784]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2028]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2028]==0&false))) {{
					__CLOVER_66_0.cloverRec.S[7785]++;tmp.addElement(s3.getText());
				}
				}__CLOVER_66_0.cloverRec.S[7786]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2029]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2029]==0&false))) {{
					
							__CLOVER_66_0.cloverRec.S[7787]++;res=new Chaine(tmp,opera);
						
				}
				}__CLOVER_66_0.cloverRec.S[7788]++;string_AST = (tinyeiffel.compiler.ASTDefaut)currentAST.root;
				__CLOVER_66_0.cloverRec.S[7789]++;break;
			}
			default:if (!__CLOVER_bool11) {__CLOVER_66_0.cloverRec.S[7790]++;__CLOVER_bool11=true;}
			{
				__CLOVER_66_0.cloverRec.S[7791]++;throw new NoViableAltException(LT(1), getFilename());
			}
			}
		}
		catch (RecognitionException ex) {
			__CLOVER_66_0.cloverRec.S[7792]++;if ((((inputState.guessing==0) && (++__CLOVER_66_0.cloverRec.CT[2030]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2030]==0&false))) {{
				
						__CLOVER_66_0.cloverRec.S[7793]++;logging.erreur(new ErreurSource("Erreur dans la chaine",ex.getLine(),
									ex.getColumn(),ex.getFilename()));
					
			} }else {{
				__CLOVER_66_0.cloverRec.S[7794]++;throw ex;
			}
		}}
		__CLOVER_66_0.cloverRec.S[7795]++;returnAST = string_AST;
		__CLOVER_66_0.cloverRec.S[7796]++;return res;
	}
	
	public final Vector  heritage() throws RecognitionException, TokenStreamException {__CLOVER_66_0.cloverRec.M[544]++;
		__CLOVER_66_0.cloverRec.S[7797]++;Vector res=new Vector();
		
		__CLOVER_66_0.cloverRec.S[7798]++;returnAST = null;
		__CLOVER_66_0.cloverRec.S[7799]++;ASTPair currentAST = new ASTPair();
		__CLOVER_66_0.cloverRec.S[7800]++;tinyeiffel.compiler.ASTDefaut heritage_AST = null;
		__CLOVER_66_0.cloverRec.S[7801]++;Token  in = null;
		__CLOVER_66_0.cloverRec.S[7802]++;tinyeiffel.compiler.ASTDefaut in_AST = null;
		__CLOVER_66_0.cloverRec.S[7803]++;Token  ren = null;
		__CLOVER_66_0.cloverRec.S[7804]++;tinyeiffel.compiler.ASTDefaut ren_AST = null;
		__CLOVER_66_0.cloverRec.S[7805]++;Token  exp2 = null;
		__CLOVER_66_0.cloverRec.S[7806]++;tinyeiffel.compiler.ASTDefaut exp2_AST = null;
		__CLOVER_66_0.cloverRec.S[7807]++;Token  und = null;
		__CLOVER_66_0.cloverRec.S[7808]++;tinyeiffel.compiler.ASTDefaut und_AST = null;
		__CLOVER_66_0.cloverRec.S[7809]++;Token  red = null;
		__CLOVER_66_0.cloverRec.S[7810]++;tinyeiffel.compiler.ASTDefaut red_AST = null;
		__CLOVER_66_0.cloverRec.S[7811]++;Token  sel = null;
		__CLOVER_66_0.cloverRec.S[7812]++;tinyeiffel.compiler.ASTDefaut sel_AST = null;
		__CLOVER_66_0.cloverRec.S[7813]++;Token  end = null;
		__CLOVER_66_0.cloverRec.S[7814]++;tinyeiffel.compiler.ASTDefaut end_AST = null;
		
		__CLOVER_66_0.cloverRec.S[7815]++;Heritage h;
		__CLOVER_66_0.cloverRec.S[7816]++;Type t,t2;
		__CLOVER_66_0.cloverRec.S[7817]++;Vector rename=new Vector(),export=new Vector(),undefine=new Vector(),
			redefine=new Vector(),select=new Vector();
		__CLOVER_66_0.cloverRec.S[7818]++;Rename tmp1=null;
		__CLOVER_66_0.cloverRec.S[7819]++;Export exp=null;
		__CLOVER_66_0.cloverRec.S[7820]++;NomFeature n1,n2;
		__CLOVER_66_0.cloverRec.S[7821]++;Vector liste1=null,liste2=null;
		
		
		__CLOVER_66_0.cloverRec.S[7822]++;try {      // for error handling
			__CLOVER_66_0.cloverRec.S[7823]++;in = LT(1);
			__CLOVER_66_0.cloverRec.S[7824]++;in_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(in);
			__CLOVER_66_0.cloverRec.S[7825]++;astFactory.addASTChild(currentAST, in_AST);
			__CLOVER_66_0.cloverRec.S[7826]++;match(INHERIT);
			{
			__CLOVER_66_0.cloverRec.S[7827]++;int _cnt69=0;
			__CLOVER_66_0.cloverRec.S[7828]++;_loop69:
			do {{
				__CLOVER_66_0.cloverRec.S[7829]++;if (((((LA(1)==EXPANDED||LA(1)==ID||LA(1)==LIKE)) && (++__CLOVER_66_0.cloverRec.CT[2031]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2031]==0&false))) {{
					__CLOVER_66_0.cloverRec.S[7830]++;t=type();
					__CLOVER_66_0.cloverRec.S[7831]++;astFactory.addASTChild(currentAST, returnAST);
					__CLOVER_66_0.cloverRec.S[7832]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2032]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2032]==0&false))) {{
						
										__CLOVER_66_0.cloverRec.S[7833]++;rename=new Vector();__CLOVER_66_0.cloverRec.S[7834]++;export=new Vector();__CLOVER_66_0.cloverRec.S[7835]++;undefine=new Vector();
										__CLOVER_66_0.cloverRec.S[7836]++;redefine=new Vector();__CLOVER_66_0.cloverRec.S[7837]++;select=new Vector();
										__CLOVER_66_0.cloverRec.S[7838]++;liste1=new Vector();__CLOVER_66_0.cloverRec.S[7839]++;liste2=new Vector();
										__CLOVER_66_0.cloverRec.S[7840]++;ajoute_type(t);
									
					}
					}{
					__CLOVER_66_0.cloverRec.S[7841]++;boolean __CLOVER_bool12=false;switch ( LA(1)) {
					case END:if (!__CLOVER_bool12) {__CLOVER_66_0.cloverRec.S[7842]++;__CLOVER_bool12=true;}
					case RENAME:if (!__CLOVER_bool12) {__CLOVER_66_0.cloverRec.S[7843]++;__CLOVER_bool12=true;}
					case EXPORT:if (!__CLOVER_bool12) {__CLOVER_66_0.cloverRec.S[7844]++;__CLOVER_bool12=true;}
					case UNDEFINE:if (!__CLOVER_bool12) {__CLOVER_66_0.cloverRec.S[7845]++;__CLOVER_bool12=true;}
					case REDEFINE:if (!__CLOVER_bool12) {__CLOVER_66_0.cloverRec.S[7846]++;__CLOVER_bool12=true;}
					case SELECT:if (!__CLOVER_bool12) {__CLOVER_66_0.cloverRec.S[7847]++;__CLOVER_bool12=true;}
					{
						{
						__CLOVER_66_0.cloverRec.S[7848]++;boolean __CLOVER_bool13=false;switch ( LA(1)) {
						case RENAME:if (!__CLOVER_bool13) {__CLOVER_66_0.cloverRec.S[7849]++;__CLOVER_bool13=true;}
						{
							__CLOVER_66_0.cloverRec.S[7850]++;ren = LT(1);
							__CLOVER_66_0.cloverRec.S[7851]++;ren_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(ren);
							__CLOVER_66_0.cloverRec.S[7852]++;astFactory.addASTChild(currentAST, ren_AST);
							__CLOVER_66_0.cloverRec.S[7853]++;match(RENAME);
							{
							__CLOVER_66_0.cloverRec.S[7854]++;boolean __CLOVER_bool14=false;switch ( LA(1)) {
							case ID:if (!__CLOVER_bool14) {__CLOVER_66_0.cloverRec.S[7855]++;__CLOVER_bool14=true;}
							case INFIX:if (!__CLOVER_bool14) {__CLOVER_66_0.cloverRec.S[7856]++;__CLOVER_bool14=true;}
							case PREFIX:if (!__CLOVER_bool14) {__CLOVER_66_0.cloverRec.S[7857]++;__CLOVER_bool14=true;}
							{
								__CLOVER_66_0.cloverRec.S[7858]++;n1=nom_feature();
								__CLOVER_66_0.cloverRec.S[7859]++;astFactory.addASTChild(currentAST, returnAST);
								__CLOVER_66_0.cloverRec.S[7860]++;tinyeiffel.compiler.ASTDefaut tmp17_AST = null;
								__CLOVER_66_0.cloverRec.S[7861]++;tmp17_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(LT(1));
								__CLOVER_66_0.cloverRec.S[7862]++;astFactory.addASTChild(currentAST, tmp17_AST);
								__CLOVER_66_0.cloverRec.S[7863]++;match(AS);
								__CLOVER_66_0.cloverRec.S[7864]++;n2=nom_feature();
								__CLOVER_66_0.cloverRec.S[7865]++;astFactory.addASTChild(currentAST, returnAST);
								__CLOVER_66_0.cloverRec.S[7866]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2033]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2033]==0&false))) {{
									__CLOVER_66_0.cloverRec.S[7867]++;tmp1=new Rename(n1,n2);__CLOVER_66_0.cloverRec.S[7868]++;rename.addElement(tmp1);
								}
								}{
								__CLOVER_66_0.cloverRec.S[7869]++;_loop35:
								do {{
									__CLOVER_66_0.cloverRec.S[7870]++;if (((((LA(1)==VIRGULE)) && (++__CLOVER_66_0.cloverRec.CT[2034]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2034]==0&false))) {{
										__CLOVER_66_0.cloverRec.S[7871]++;tinyeiffel.compiler.ASTDefaut tmp18_AST = null;
										__CLOVER_66_0.cloverRec.S[7872]++;tmp18_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(LT(1));
										__CLOVER_66_0.cloverRec.S[7873]++;astFactory.addASTChild(currentAST, tmp18_AST);
										__CLOVER_66_0.cloverRec.S[7874]++;match(VIRGULE);
										__CLOVER_66_0.cloverRec.S[7875]++;n1=nom_feature();
										__CLOVER_66_0.cloverRec.S[7876]++;astFactory.addASTChild(currentAST, returnAST);
										__CLOVER_66_0.cloverRec.S[7877]++;tinyeiffel.compiler.ASTDefaut tmp19_AST = null;
										__CLOVER_66_0.cloverRec.S[7878]++;tmp19_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(LT(1));
										__CLOVER_66_0.cloverRec.S[7879]++;astFactory.addASTChild(currentAST, tmp19_AST);
										__CLOVER_66_0.cloverRec.S[7880]++;match(AS);
										__CLOVER_66_0.cloverRec.S[7881]++;n2=nom_feature();
										__CLOVER_66_0.cloverRec.S[7882]++;astFactory.addASTChild(currentAST, returnAST);
										__CLOVER_66_0.cloverRec.S[7883]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2035]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2035]==0&false))) {{
											__CLOVER_66_0.cloverRec.S[7884]++;tmp1=new Rename(n1,n2);__CLOVER_66_0.cloverRec.S[7885]++;rename.addElement(tmp1);
										}
									}}
									}else {{
										__CLOVER_66_0.cloverRec.S[7886]++;break _loop35;
									}
									
								}} }while (true);
								}
								__CLOVER_66_0.cloverRec.S[7887]++;break;
							}
							case SEMI:if (!__CLOVER_bool14) {__CLOVER_66_0.cloverRec.S[7888]++;__CLOVER_bool14=true;}
							case END:if (!__CLOVER_bool14) {__CLOVER_66_0.cloverRec.S[7889]++;__CLOVER_bool14=true;}
							case EXPORT:if (!__CLOVER_bool14) {__CLOVER_66_0.cloverRec.S[7890]++;__CLOVER_bool14=true;}
							case UNDEFINE:if (!__CLOVER_bool14) {__CLOVER_66_0.cloverRec.S[7891]++;__CLOVER_bool14=true;}
							case REDEFINE:if (!__CLOVER_bool14) {__CLOVER_66_0.cloverRec.S[7892]++;__CLOVER_bool14=true;}
							case SELECT:if (!__CLOVER_bool14) {__CLOVER_66_0.cloverRec.S[7893]++;__CLOVER_bool14=true;}
							{
								__CLOVER_66_0.cloverRec.S[7894]++;break;
							}
							default:if (!__CLOVER_bool14) {__CLOVER_66_0.cloverRec.S[7895]++;__CLOVER_bool14=true;}
							{
								__CLOVER_66_0.cloverRec.S[7896]++;throw new NoViableAltException(LT(1), getFilename());
							}
							}
							}
							{
							__CLOVER_66_0.cloverRec.S[7897]++;_loop37:
							do {{
								__CLOVER_66_0.cloverRec.S[7898]++;if (((((LA(1)==SEMI)) && (++__CLOVER_66_0.cloverRec.CT[2036]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2036]==0&false))) {{
									__CLOVER_66_0.cloverRec.S[7899]++;tinyeiffel.compiler.ASTDefaut tmp20_AST = null;
									__CLOVER_66_0.cloverRec.S[7900]++;tmp20_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(LT(1));
									__CLOVER_66_0.cloverRec.S[7901]++;astFactory.addASTChild(currentAST, tmp20_AST);
									__CLOVER_66_0.cloverRec.S[7902]++;match(SEMI);
								}
								}else {{
									__CLOVER_66_0.cloverRec.S[7903]++;break _loop37;
								}
								
							}} }while (true);
							}
							__CLOVER_66_0.cloverRec.S[7904]++;break;
						}
						case END:if (!__CLOVER_bool13) {__CLOVER_66_0.cloverRec.S[7905]++;__CLOVER_bool13=true;}
						case EXPORT:if (!__CLOVER_bool13) {__CLOVER_66_0.cloverRec.S[7906]++;__CLOVER_bool13=true;}
						case UNDEFINE:if (!__CLOVER_bool13) {__CLOVER_66_0.cloverRec.S[7907]++;__CLOVER_bool13=true;}
						case REDEFINE:if (!__CLOVER_bool13) {__CLOVER_66_0.cloverRec.S[7908]++;__CLOVER_bool13=true;}
						case SELECT:if (!__CLOVER_bool13) {__CLOVER_66_0.cloverRec.S[7909]++;__CLOVER_bool13=true;}
						{
							__CLOVER_66_0.cloverRec.S[7910]++;break;
						}
						default:if (!__CLOVER_bool13) {__CLOVER_66_0.cloverRec.S[7911]++;__CLOVER_bool13=true;}
						{
							__CLOVER_66_0.cloverRec.S[7912]++;throw new NoViableAltException(LT(1), getFilename());
						}
						}
						}
						{
						__CLOVER_66_0.cloverRec.S[7913]++;boolean __CLOVER_bool15=false;switch ( LA(1)) {
						case EXPORT:if (!__CLOVER_bool15) {__CLOVER_66_0.cloverRec.S[7914]++;__CLOVER_bool15=true;}
						{
							__CLOVER_66_0.cloverRec.S[7915]++;exp2 = LT(1);
							__CLOVER_66_0.cloverRec.S[7916]++;exp2_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(exp2);
							__CLOVER_66_0.cloverRec.S[7917]++;astFactory.addASTChild(currentAST, exp2_AST);
							__CLOVER_66_0.cloverRec.S[7918]++;match(EXPORT);
							{
							__CLOVER_66_0.cloverRec.S[7919]++;int _cnt50=0;
							__CLOVER_66_0.cloverRec.S[7920]++;_loop50:
							do {{
								__CLOVER_66_0.cloverRec.S[7921]++;if (((((LA(1)==ACOLADEO)) && (++__CLOVER_66_0.cloverRec.CT[2037]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2037]==0&false))) {{
									{
									__CLOVER_66_0.cloverRec.S[7922]++;tinyeiffel.compiler.ASTDefaut tmp21_AST = null;
									__CLOVER_66_0.cloverRec.S[7923]++;tmp21_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(LT(1));
									__CLOVER_66_0.cloverRec.S[7924]++;astFactory.addASTChild(currentAST, tmp21_AST);
									__CLOVER_66_0.cloverRec.S[7925]++;match(ACOLADEO);
									__CLOVER_66_0.cloverRec.S[7926]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2038]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2038]==0&false))) {{
										__CLOVER_66_0.cloverRec.S[7927]++;liste2=new Vector();
									}
									}{
									__CLOVER_66_0.cloverRec.S[7928]++;boolean __CLOVER_bool16=false;switch ( LA(1)) {
									case EXPANDED:if (!__CLOVER_bool16) {__CLOVER_66_0.cloverRec.S[7929]++;__CLOVER_bool16=true;}
									case ID:if (!__CLOVER_bool16) {__CLOVER_66_0.cloverRec.S[7930]++;__CLOVER_bool16=true;}
									case LIKE:if (!__CLOVER_bool16) {__CLOVER_66_0.cloverRec.S[7931]++;__CLOVER_bool16=true;}
									{
										__CLOVER_66_0.cloverRec.S[7932]++;t2=type();
										__CLOVER_66_0.cloverRec.S[7933]++;astFactory.addASTChild(currentAST, returnAST);
										__CLOVER_66_0.cloverRec.S[7934]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2039]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2039]==0&false))) {{
											__CLOVER_66_0.cloverRec.S[7935]++;liste2.addElement(t2);
										}
										}{
										__CLOVER_66_0.cloverRec.S[7936]++;_loop43:
										do {{
											__CLOVER_66_0.cloverRec.S[7937]++;if (((((LA(1)==VIRGULE)) && (++__CLOVER_66_0.cloverRec.CT[2040]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2040]==0&false))) {{
												__CLOVER_66_0.cloverRec.S[7938]++;tinyeiffel.compiler.ASTDefaut tmp22_AST = null;
												__CLOVER_66_0.cloverRec.S[7939]++;tmp22_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(LT(1));
												__CLOVER_66_0.cloverRec.S[7940]++;astFactory.addASTChild(currentAST, tmp22_AST);
												__CLOVER_66_0.cloverRec.S[7941]++;match(VIRGULE);
												__CLOVER_66_0.cloverRec.S[7942]++;t2=type();
												__CLOVER_66_0.cloverRec.S[7943]++;astFactory.addASTChild(currentAST, returnAST);
												__CLOVER_66_0.cloverRec.S[7944]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2041]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2041]==0&false))) {{
													__CLOVER_66_0.cloverRec.S[7945]++;liste2.addElement(t2);
												}
											}}
											}else {{
												__CLOVER_66_0.cloverRec.S[7946]++;break _loop43;
											}
											
										}} }while (true);
										}
										__CLOVER_66_0.cloverRec.S[7947]++;break;
									}
									case ACOLADEF:if (!__CLOVER_bool16) {__CLOVER_66_0.cloverRec.S[7948]++;__CLOVER_bool16=true;}
									{
										__CLOVER_66_0.cloverRec.S[7949]++;break;
									}
									default:if (!__CLOVER_bool16) {__CLOVER_66_0.cloverRec.S[7950]++;__CLOVER_bool16=true;}
									{
										__CLOVER_66_0.cloverRec.S[7951]++;throw new NoViableAltException(LT(1), getFilename());
									}
									}
									}
									__CLOVER_66_0.cloverRec.S[7952]++;tinyeiffel.compiler.ASTDefaut tmp23_AST = null;
									__CLOVER_66_0.cloverRec.S[7953]++;tmp23_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(LT(1));
									__CLOVER_66_0.cloverRec.S[7954]++;astFactory.addASTChild(currentAST, tmp23_AST);
									__CLOVER_66_0.cloverRec.S[7955]++;match(ACOLADEF);
									}
									{
									__CLOVER_66_0.cloverRec.S[7956]++;boolean __CLOVER_bool17=false;switch ( LA(1)) {
									case ID:if (!__CLOVER_bool17) {__CLOVER_66_0.cloverRec.S[7957]++;__CLOVER_bool17=true;}
									case INFIX:if (!__CLOVER_bool17) {__CLOVER_66_0.cloverRec.S[7958]++;__CLOVER_bool17=true;}
									case PREFIX:if (!__CLOVER_bool17) {__CLOVER_66_0.cloverRec.S[7959]++;__CLOVER_bool17=true;}
									{
										{
										__CLOVER_66_0.cloverRec.S[7960]++;n1=nom_feature();
										__CLOVER_66_0.cloverRec.S[7961]++;astFactory.addASTChild(currentAST, returnAST);
										__CLOVER_66_0.cloverRec.S[7962]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2042]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2042]==0&false))) {{
											__CLOVER_66_0.cloverRec.S[7963]++;liste1=new Vector();__CLOVER_66_0.cloverRec.S[7964]++;liste1.addElement(n1);
										}
										}{
										__CLOVER_66_0.cloverRec.S[7965]++;_loop47:
										do {{
											__CLOVER_66_0.cloverRec.S[7966]++;if (((((LA(1)==VIRGULE)) && (++__CLOVER_66_0.cloverRec.CT[2043]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2043]==0&false))) {{
												__CLOVER_66_0.cloverRec.S[7967]++;tinyeiffel.compiler.ASTDefaut tmp24_AST = null;
												__CLOVER_66_0.cloverRec.S[7968]++;tmp24_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(LT(1));
												__CLOVER_66_0.cloverRec.S[7969]++;astFactory.addASTChild(currentAST, tmp24_AST);
												__CLOVER_66_0.cloverRec.S[7970]++;match(VIRGULE);
												__CLOVER_66_0.cloverRec.S[7971]++;n1=nom_feature();
												__CLOVER_66_0.cloverRec.S[7972]++;astFactory.addASTChild(currentAST, returnAST);
												__CLOVER_66_0.cloverRec.S[7973]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2044]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2044]==0&false))) {{
													__CLOVER_66_0.cloverRec.S[7974]++;liste1.addElement(n1);
												}
											}}
											}else {{
												__CLOVER_66_0.cloverRec.S[7975]++;break _loop47;
											}
											
										}} }while (true);
										}
										}
										__CLOVER_66_0.cloverRec.S[7976]++;break;
									}
									case ALL:if (!__CLOVER_bool17) {__CLOVER_66_0.cloverRec.S[7977]++;__CLOVER_bool17=true;}
									{
										__CLOVER_66_0.cloverRec.S[7978]++;tinyeiffel.compiler.ASTDefaut tmp25_AST = null;
										__CLOVER_66_0.cloverRec.S[7979]++;tmp25_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(LT(1));
										__CLOVER_66_0.cloverRec.S[7980]++;astFactory.addASTChild(currentAST, tmp25_AST);
										__CLOVER_66_0.cloverRec.S[7981]++;match(ALL);
										__CLOVER_66_0.cloverRec.S[7982]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2045]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2045]==0&false))) {{
											__CLOVER_66_0.cloverRec.S[7983]++;liste1=new Vector();
										}
										}__CLOVER_66_0.cloverRec.S[7984]++;break;
									}
									default:if (!__CLOVER_bool17) {__CLOVER_66_0.cloverRec.S[7985]++;__CLOVER_bool17=true;}
									{
										__CLOVER_66_0.cloverRec.S[7986]++;throw new NoViableAltException(LT(1), getFilename());
									}
									}
									}
									__CLOVER_66_0.cloverRec.S[7987]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2046]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2046]==0&false))) {{
										
																__CLOVER_66_0.cloverRec.S[7988]++;exp=new Export(liste1,liste2);
																__CLOVER_66_0.cloverRec.S[7989]++;export.addElement(exp);
																__CLOVER_66_0.cloverRec.S[7990]++;ajoute_type(liste2);
															
									}
									}{
									__CLOVER_66_0.cloverRec.S[7991]++;_loop49:
									do {{
										__CLOVER_66_0.cloverRec.S[7992]++;if (((((LA(1)==SEMI)) && (++__CLOVER_66_0.cloverRec.CT[2047]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2047]==0&false))) {{
											__CLOVER_66_0.cloverRec.S[7993]++;tinyeiffel.compiler.ASTDefaut tmp26_AST = null;
											__CLOVER_66_0.cloverRec.S[7994]++;tmp26_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(LT(1));
											__CLOVER_66_0.cloverRec.S[7995]++;astFactory.addASTChild(currentAST, tmp26_AST);
											__CLOVER_66_0.cloverRec.S[7996]++;match(SEMI);
										}
										}else {{
											__CLOVER_66_0.cloverRec.S[7997]++;break _loop49;
										}
										
									}} }while (true);
									}
								}
								}else {{
									__CLOVER_66_0.cloverRec.S[7998]++;if ( (((_cnt50>=1 ) && (++__CLOVER_66_0.cloverRec.CT[2048]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2048]==0&false))) {{ __CLOVER_66_0.cloverRec.S[7999]++;break _loop50; } }else {{__CLOVER_66_0.cloverRec.S[8000]++;throw new NoViableAltException(LT(1), getFilename());}
								}}
								
								}__CLOVER_66_0.cloverRec.S[8001]++;_cnt50++;
							} }while (true);
							}
							__CLOVER_66_0.cloverRec.S[8002]++;break;
						}
						case END:if (!__CLOVER_bool15) {__CLOVER_66_0.cloverRec.S[8003]++;__CLOVER_bool15=true;}
						case UNDEFINE:if (!__CLOVER_bool15) {__CLOVER_66_0.cloverRec.S[8004]++;__CLOVER_bool15=true;}
						case REDEFINE:if (!__CLOVER_bool15) {__CLOVER_66_0.cloverRec.S[8005]++;__CLOVER_bool15=true;}
						case SELECT:if (!__CLOVER_bool15) {__CLOVER_66_0.cloverRec.S[8006]++;__CLOVER_bool15=true;}
						{
							__CLOVER_66_0.cloverRec.S[8007]++;break;
						}
						default:if (!__CLOVER_bool15) {__CLOVER_66_0.cloverRec.S[8008]++;__CLOVER_bool15=true;}
						{
							__CLOVER_66_0.cloverRec.S[8009]++;throw new NoViableAltException(LT(1), getFilename());
						}
						}
						}
						{
						__CLOVER_66_0.cloverRec.S[8010]++;boolean __CLOVER_bool18=false;switch ( LA(1)) {
						case UNDEFINE:if (!__CLOVER_bool18) {__CLOVER_66_0.cloverRec.S[8011]++;__CLOVER_bool18=true;}
						{
							__CLOVER_66_0.cloverRec.S[8012]++;und = LT(1);
							__CLOVER_66_0.cloverRec.S[8013]++;und_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(und);
							__CLOVER_66_0.cloverRec.S[8014]++;astFactory.addASTChild(currentAST, und_AST);
							__CLOVER_66_0.cloverRec.S[8015]++;match(UNDEFINE);
							__CLOVER_66_0.cloverRec.S[8016]++;n1=nom_feature();
							__CLOVER_66_0.cloverRec.S[8017]++;astFactory.addASTChild(currentAST, returnAST);
							__CLOVER_66_0.cloverRec.S[8018]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2049]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2049]==0&false))) {{
								__CLOVER_66_0.cloverRec.S[8019]++;undefine.addElement(n1);
							}
							}{
							__CLOVER_66_0.cloverRec.S[8020]++;_loop53:
							do {{
								__CLOVER_66_0.cloverRec.S[8021]++;if (((((LA(1)==VIRGULE)) && (++__CLOVER_66_0.cloverRec.CT[2050]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2050]==0&false))) {{
									__CLOVER_66_0.cloverRec.S[8022]++;tinyeiffel.compiler.ASTDefaut tmp27_AST = null;
									__CLOVER_66_0.cloverRec.S[8023]++;tmp27_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(LT(1));
									__CLOVER_66_0.cloverRec.S[8024]++;astFactory.addASTChild(currentAST, tmp27_AST);
									__CLOVER_66_0.cloverRec.S[8025]++;match(VIRGULE);
									__CLOVER_66_0.cloverRec.S[8026]++;n1=nom_feature();
									__CLOVER_66_0.cloverRec.S[8027]++;astFactory.addASTChild(currentAST, returnAST);
									__CLOVER_66_0.cloverRec.S[8028]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2051]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2051]==0&false))) {{
										__CLOVER_66_0.cloverRec.S[8029]++;undefine.addElement(n1);
									}
								}}
								}else {{
									__CLOVER_66_0.cloverRec.S[8030]++;break _loop53;
								}
								
							}} }while (true);
							}
							{
							__CLOVER_66_0.cloverRec.S[8031]++;_loop55:
							do {{
								__CLOVER_66_0.cloverRec.S[8032]++;if (((((LA(1)==SEMI)) && (++__CLOVER_66_0.cloverRec.CT[2052]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2052]==0&false))) {{
									__CLOVER_66_0.cloverRec.S[8033]++;tinyeiffel.compiler.ASTDefaut tmp28_AST = null;
									__CLOVER_66_0.cloverRec.S[8034]++;tmp28_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(LT(1));
									__CLOVER_66_0.cloverRec.S[8035]++;astFactory.addASTChild(currentAST, tmp28_AST);
									__CLOVER_66_0.cloverRec.S[8036]++;match(SEMI);
								}
								}else {{
									__CLOVER_66_0.cloverRec.S[8037]++;break _loop55;
								}
								
							}} }while (true);
							}
							__CLOVER_66_0.cloverRec.S[8038]++;break;
						}
						case END:if (!__CLOVER_bool18) {__CLOVER_66_0.cloverRec.S[8039]++;__CLOVER_bool18=true;}
						case REDEFINE:if (!__CLOVER_bool18) {__CLOVER_66_0.cloverRec.S[8040]++;__CLOVER_bool18=true;}
						case SELECT:if (!__CLOVER_bool18) {__CLOVER_66_0.cloverRec.S[8041]++;__CLOVER_bool18=true;}
						{
							__CLOVER_66_0.cloverRec.S[8042]++;break;
						}
						default:if (!__CLOVER_bool18) {__CLOVER_66_0.cloverRec.S[8043]++;__CLOVER_bool18=true;}
						{
							__CLOVER_66_0.cloverRec.S[8044]++;throw new NoViableAltException(LT(1), getFilename());
						}
						}
						}
						{
						__CLOVER_66_0.cloverRec.S[8045]++;boolean __CLOVER_bool19=false;switch ( LA(1)) {
						case REDEFINE:if (!__CLOVER_bool19) {__CLOVER_66_0.cloverRec.S[8046]++;__CLOVER_bool19=true;}
						{
							__CLOVER_66_0.cloverRec.S[8047]++;red = LT(1);
							__CLOVER_66_0.cloverRec.S[8048]++;red_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(red);
							__CLOVER_66_0.cloverRec.S[8049]++;astFactory.addASTChild(currentAST, red_AST);
							__CLOVER_66_0.cloverRec.S[8050]++;match(REDEFINE);
							__CLOVER_66_0.cloverRec.S[8051]++;n1=nom_feature();
							__CLOVER_66_0.cloverRec.S[8052]++;astFactory.addASTChild(currentAST, returnAST);
							__CLOVER_66_0.cloverRec.S[8053]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2053]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2053]==0&false))) {{
								__CLOVER_66_0.cloverRec.S[8054]++;redefine.addElement(n1);
							}
							}{
							__CLOVER_66_0.cloverRec.S[8055]++;_loop58:
							do {{
								__CLOVER_66_0.cloverRec.S[8056]++;if (((((LA(1)==VIRGULE)) && (++__CLOVER_66_0.cloverRec.CT[2054]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2054]==0&false))) {{
									__CLOVER_66_0.cloverRec.S[8057]++;tinyeiffel.compiler.ASTDefaut tmp29_AST = null;
									__CLOVER_66_0.cloverRec.S[8058]++;tmp29_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(LT(1));
									__CLOVER_66_0.cloverRec.S[8059]++;astFactory.addASTChild(currentAST, tmp29_AST);
									__CLOVER_66_0.cloverRec.S[8060]++;match(VIRGULE);
									__CLOVER_66_0.cloverRec.S[8061]++;n1=nom_feature();
									__CLOVER_66_0.cloverRec.S[8062]++;astFactory.addASTChild(currentAST, returnAST);
									__CLOVER_66_0.cloverRec.S[8063]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2055]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2055]==0&false))) {{
										__CLOVER_66_0.cloverRec.S[8064]++;redefine.addElement(n1);
									}
								}}
								}else {{
									__CLOVER_66_0.cloverRec.S[8065]++;break _loop58;
								}
								
							}} }while (true);
							}
							{
							__CLOVER_66_0.cloverRec.S[8066]++;_loop60:
							do {{
								__CLOVER_66_0.cloverRec.S[8067]++;if (((((LA(1)==SEMI)) && (++__CLOVER_66_0.cloverRec.CT[2056]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2056]==0&false))) {{
									__CLOVER_66_0.cloverRec.S[8068]++;tinyeiffel.compiler.ASTDefaut tmp30_AST = null;
									__CLOVER_66_0.cloverRec.S[8069]++;tmp30_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(LT(1));
									__CLOVER_66_0.cloverRec.S[8070]++;astFactory.addASTChild(currentAST, tmp30_AST);
									__CLOVER_66_0.cloverRec.S[8071]++;match(SEMI);
								}
								}else {{
									__CLOVER_66_0.cloverRec.S[8072]++;break _loop60;
								}
								
							}} }while (true);
							}
							__CLOVER_66_0.cloverRec.S[8073]++;break;
						}
						case END:if (!__CLOVER_bool19) {__CLOVER_66_0.cloverRec.S[8074]++;__CLOVER_bool19=true;}
						case SELECT:if (!__CLOVER_bool19) {__CLOVER_66_0.cloverRec.S[8075]++;__CLOVER_bool19=true;}
						{
							__CLOVER_66_0.cloverRec.S[8076]++;break;
						}
						default:if (!__CLOVER_bool19) {__CLOVER_66_0.cloverRec.S[8077]++;__CLOVER_bool19=true;}
						{
							__CLOVER_66_0.cloverRec.S[8078]++;throw new NoViableAltException(LT(1), getFilename());
						}
						}
						}
						{
						__CLOVER_66_0.cloverRec.S[8079]++;boolean __CLOVER_bool20=false;switch ( LA(1)) {
						case SELECT:if (!__CLOVER_bool20) {__CLOVER_66_0.cloverRec.S[8080]++;__CLOVER_bool20=true;}
						{
							__CLOVER_66_0.cloverRec.S[8081]++;sel = LT(1);
							__CLOVER_66_0.cloverRec.S[8082]++;sel_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(sel);
							__CLOVER_66_0.cloverRec.S[8083]++;astFactory.addASTChild(currentAST, sel_AST);
							__CLOVER_66_0.cloverRec.S[8084]++;match(SELECT);
							__CLOVER_66_0.cloverRec.S[8085]++;n1=nom_feature();
							__CLOVER_66_0.cloverRec.S[8086]++;astFactory.addASTChild(currentAST, returnAST);
							__CLOVER_66_0.cloverRec.S[8087]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2057]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2057]==0&false))) {{
								__CLOVER_66_0.cloverRec.S[8088]++;select.addElement(n1);
							}
							}{
							__CLOVER_66_0.cloverRec.S[8089]++;_loop63:
							do {{
								__CLOVER_66_0.cloverRec.S[8090]++;if (((((LA(1)==VIRGULE)) && (++__CLOVER_66_0.cloverRec.CT[2058]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2058]==0&false))) {{
									__CLOVER_66_0.cloverRec.S[8091]++;tinyeiffel.compiler.ASTDefaut tmp31_AST = null;
									__CLOVER_66_0.cloverRec.S[8092]++;tmp31_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(LT(1));
									__CLOVER_66_0.cloverRec.S[8093]++;astFactory.addASTChild(currentAST, tmp31_AST);
									__CLOVER_66_0.cloverRec.S[8094]++;match(VIRGULE);
									__CLOVER_66_0.cloverRec.S[8095]++;n1=nom_feature();
									__CLOVER_66_0.cloverRec.S[8096]++;astFactory.addASTChild(currentAST, returnAST);
									__CLOVER_66_0.cloverRec.S[8097]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2059]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2059]==0&false))) {{
										__CLOVER_66_0.cloverRec.S[8098]++;select.addElement(n1);
									}
								}}
								}else {{
									__CLOVER_66_0.cloverRec.S[8099]++;break _loop63;
								}
								
							}} }while (true);
							}
							{
							__CLOVER_66_0.cloverRec.S[8100]++;_loop65:
							do {{
								__CLOVER_66_0.cloverRec.S[8101]++;if (((((LA(1)==SEMI)) && (++__CLOVER_66_0.cloverRec.CT[2060]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2060]==0&false))) {{
									__CLOVER_66_0.cloverRec.S[8102]++;tinyeiffel.compiler.ASTDefaut tmp32_AST = null;
									__CLOVER_66_0.cloverRec.S[8103]++;tmp32_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(LT(1));
									__CLOVER_66_0.cloverRec.S[8104]++;astFactory.addASTChild(currentAST, tmp32_AST);
									__CLOVER_66_0.cloverRec.S[8105]++;match(SEMI);
								}
								}else {{
									__CLOVER_66_0.cloverRec.S[8106]++;break _loop65;
								}
								
							}} }while (true);
							}
							__CLOVER_66_0.cloverRec.S[8107]++;break;
						}
						case END:if (!__CLOVER_bool20) {__CLOVER_66_0.cloverRec.S[8108]++;__CLOVER_bool20=true;}
						{
							__CLOVER_66_0.cloverRec.S[8109]++;break;
						}
						default:if (!__CLOVER_bool20) {__CLOVER_66_0.cloverRec.S[8110]++;__CLOVER_bool20=true;}
						{
							__CLOVER_66_0.cloverRec.S[8111]++;throw new NoViableAltException(LT(1), getFilename());
						}
						}
						}
						{
						__CLOVER_66_0.cloverRec.S[8112]++;end = LT(1);
						__CLOVER_66_0.cloverRec.S[8113]++;end_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(end);
						__CLOVER_66_0.cloverRec.S[8114]++;astFactory.addASTChild(currentAST, end_AST);
						__CLOVER_66_0.cloverRec.S[8115]++;match(END);
						}
						__CLOVER_66_0.cloverRec.S[8116]++;break;
					}
					case EXPANDED:if (!__CLOVER_bool12) {__CLOVER_66_0.cloverRec.S[8117]++;__CLOVER_bool12=true;}
					case FEATURE:if (!__CLOVER_bool12) {__CLOVER_66_0.cloverRec.S[8118]++;__CLOVER_bool12=true;}
					case SEMI:if (!__CLOVER_bool12) {__CLOVER_66_0.cloverRec.S[8119]++;__CLOVER_bool12=true;}
					case ID:if (!__CLOVER_bool12) {__CLOVER_66_0.cloverRec.S[8120]++;__CLOVER_bool12=true;}
					case CREATION:if (!__CLOVER_bool12) {__CLOVER_66_0.cloverRec.S[8121]++;__CLOVER_bool12=true;}
					case LIKE:if (!__CLOVER_bool12) {__CLOVER_66_0.cloverRec.S[8122]++;__CLOVER_bool12=true;}
					{
						__CLOVER_66_0.cloverRec.S[8123]++;break;
					}
					default:if (!__CLOVER_bool12) {__CLOVER_66_0.cloverRec.S[8124]++;__CLOVER_bool12=true;}
					{
						__CLOVER_66_0.cloverRec.S[8125]++;throw new NoViableAltException(LT(1), getFilename());
					}
					}
					}
					__CLOVER_66_0.cloverRec.S[8126]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2061]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2061]==0&false))) {{
						
											__CLOVER_66_0.cloverRec.S[8127]++;h=new Heritage(t,rename,export,undefine,redefine,select);
											__CLOVER_66_0.cloverRec.S[8128]++;tinyeiffel.ast.Token therit,trename,texport,tundefine,tredefine,tselect,
						tend;
											__CLOVER_66_0.cloverRec.S[8129]++;therit=remplitToken(in);
											__CLOVER_66_0.cloverRec.S[8130]++;trename=remplitToken(ren);
											__CLOVER_66_0.cloverRec.S[8131]++;texport=remplitToken(exp2);
											__CLOVER_66_0.cloverRec.S[8132]++;tundefine=remplitToken(und);
											__CLOVER_66_0.cloverRec.S[8133]++;tredefine=remplitToken(red);
											__CLOVER_66_0.cloverRec.S[8134]++;tselect=remplitToken(sel);
											__CLOVER_66_0.cloverRec.S[8135]++;tend=remplitToken(end);
											__CLOVER_66_0.cloverRec.S[8136]++;h.set_token(therit,trename,texport,tundefine,tredefine,
												tselect,tend);
											__CLOVER_66_0.cloverRec.S[8137]++;res.addElement(h);
										
					}
					}{
					__CLOVER_66_0.cloverRec.S[8138]++;_loop68:
					do {{
						__CLOVER_66_0.cloverRec.S[8139]++;if (((((LA(1)==SEMI)) && (++__CLOVER_66_0.cloverRec.CT[2062]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2062]==0&false))) {{
							__CLOVER_66_0.cloverRec.S[8140]++;tinyeiffel.compiler.ASTDefaut tmp33_AST = null;
							__CLOVER_66_0.cloverRec.S[8141]++;tmp33_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(LT(1));
							__CLOVER_66_0.cloverRec.S[8142]++;astFactory.addASTChild(currentAST, tmp33_AST);
							__CLOVER_66_0.cloverRec.S[8143]++;match(SEMI);
						}
						}else {{
							__CLOVER_66_0.cloverRec.S[8144]++;break _loop68;
						}
						
					}} }while (true);
					}
				}
				}else {{
					__CLOVER_66_0.cloverRec.S[8145]++;if ( (((_cnt69>=1 ) && (++__CLOVER_66_0.cloverRec.CT[2063]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2063]==0&false))) {{ __CLOVER_66_0.cloverRec.S[8146]++;break _loop69; } }else {{__CLOVER_66_0.cloverRec.S[8147]++;throw new NoViableAltException(LT(1), getFilename());}
				}}
				
				}__CLOVER_66_0.cloverRec.S[8148]++;_cnt69++;
			} }while (true);
			}
			__CLOVER_66_0.cloverRec.S[8149]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2064]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2064]==0&false))) {{
				
						//res=new Heritage();
					
			}
			}__CLOVER_66_0.cloverRec.S[8150]++;heritage_AST = (tinyeiffel.compiler.ASTDefaut)currentAST.root;
		}
		catch (RecognitionException ex) {
			__CLOVER_66_0.cloverRec.S[8151]++;if ((((inputState.guessing==0) && (++__CLOVER_66_0.cloverRec.CT[2065]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2065]==0&false))) {{
				
						__CLOVER_66_0.cloverRec.S[8152]++;logging.erreur(new ErreurSource("Erreur dans l'heritage",ex.getLine(),
									ex.getColumn(),ex.getFilename()));
					
			} }else {{
				__CLOVER_66_0.cloverRec.S[8153]++;throw ex;
			}
		}}
		__CLOVER_66_0.cloverRec.S[8154]++;returnAST = heritage_AST;
		__CLOVER_66_0.cloverRec.S[8155]++;return res;
	}
	
	public final Vector  creation() throws RecognitionException, TokenStreamException {__CLOVER_66_0.cloverRec.M[545]++;
		__CLOVER_66_0.cloverRec.S[8156]++;Vector res=new Vector();
		
		__CLOVER_66_0.cloverRec.S[8157]++;returnAST = null;
		__CLOVER_66_0.cloverRec.S[8158]++;ASTPair currentAST = new ASTPair();
		__CLOVER_66_0.cloverRec.S[8159]++;tinyeiffel.compiler.ASTDefaut creation_AST = null;
		__CLOVER_66_0.cloverRec.S[8160]++;Token  cre = null;
		__CLOVER_66_0.cloverRec.S[8161]++;tinyeiffel.compiler.ASTDefaut cre_AST = null;
		
		__CLOVER_66_0.cloverRec.S[8162]++;Creation c1;
		__CLOVER_66_0.cloverRec.S[8163]++;NomFeature nom=null;
		__CLOVER_66_0.cloverRec.S[8164]++;Vector creation=new Vector(),type=new Vector();
		__CLOVER_66_0.cloverRec.S[8165]++;Type t;
		__CLOVER_66_0.cloverRec.S[8166]++;boolean pas_export=false;
		
		
		__CLOVER_66_0.cloverRec.S[8167]++;try {      // for error handling
			{
			__CLOVER_66_0.cloverRec.S[8168]++;int _cnt78=0;
			__CLOVER_66_0.cloverRec.S[8169]++;_loop78:
			do {{
				__CLOVER_66_0.cloverRec.S[8170]++;if (((((LA(1)==CREATION)) && (++__CLOVER_66_0.cloverRec.CT[2066]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2066]==0&false))) {{
					__CLOVER_66_0.cloverRec.S[8171]++;cre = LT(1);
					__CLOVER_66_0.cloverRec.S[8172]++;cre_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(cre);
					__CLOVER_66_0.cloverRec.S[8173]++;astFactory.addASTChild(currentAST, cre_AST);
					__CLOVER_66_0.cloverRec.S[8174]++;match(CREATION);
					__CLOVER_66_0.cloverRec.S[8175]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2067]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2067]==0&false))) {{
						__CLOVER_66_0.cloverRec.S[8176]++;creation=new Vector();__CLOVER_66_0.cloverRec.S[8177]++;type=new Vector();__CLOVER_66_0.cloverRec.S[8178]++;pas_export=false;
					}
					}{
					__CLOVER_66_0.cloverRec.S[8179]++;boolean __CLOVER_bool21=false;switch ( LA(1)) {
					case ACOLADEO:if (!__CLOVER_bool21) {__CLOVER_66_0.cloverRec.S[8180]++;__CLOVER_bool21=true;}
					{
						__CLOVER_66_0.cloverRec.S[8181]++;tinyeiffel.compiler.ASTDefaut tmp34_AST = null;
						__CLOVER_66_0.cloverRec.S[8182]++;tmp34_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(LT(1));
						__CLOVER_66_0.cloverRec.S[8183]++;astFactory.addASTChild(currentAST, tmp34_AST);
						__CLOVER_66_0.cloverRec.S[8184]++;match(ACOLADEO);
						__CLOVER_66_0.cloverRec.S[8185]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2068]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2068]==0&false))) {{
							__CLOVER_66_0.cloverRec.S[8186]++;pas_export=true;
						}
						}{
						__CLOVER_66_0.cloverRec.S[8187]++;boolean __CLOVER_bool22=false;switch ( LA(1)) {
						case EXPANDED:if (!__CLOVER_bool22) {__CLOVER_66_0.cloverRec.S[8188]++;__CLOVER_bool22=true;}
						case ID:if (!__CLOVER_bool22) {__CLOVER_66_0.cloverRec.S[8189]++;__CLOVER_bool22=true;}
						case LIKE:if (!__CLOVER_bool22) {__CLOVER_66_0.cloverRec.S[8190]++;__CLOVER_bool22=true;}
						{
							__CLOVER_66_0.cloverRec.S[8191]++;t=type();
							__CLOVER_66_0.cloverRec.S[8192]++;astFactory.addASTChild(currentAST, returnAST);
							__CLOVER_66_0.cloverRec.S[8193]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2069]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2069]==0&false))) {{
								__CLOVER_66_0.cloverRec.S[8194]++;type.addElement(t);
							}
							}{
							__CLOVER_66_0.cloverRec.S[8195]++;_loop75:
							do {{
								__CLOVER_66_0.cloverRec.S[8196]++;if (((((LA(1)==VIRGULE)) && (++__CLOVER_66_0.cloverRec.CT[2070]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2070]==0&false))) {{
									__CLOVER_66_0.cloverRec.S[8197]++;tinyeiffel.compiler.ASTDefaut tmp35_AST = null;
									__CLOVER_66_0.cloverRec.S[8198]++;tmp35_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(LT(1));
									__CLOVER_66_0.cloverRec.S[8199]++;astFactory.addASTChild(currentAST, tmp35_AST);
									__CLOVER_66_0.cloverRec.S[8200]++;match(VIRGULE);
									__CLOVER_66_0.cloverRec.S[8201]++;t=type();
									__CLOVER_66_0.cloverRec.S[8202]++;astFactory.addASTChild(currentAST, returnAST);
									__CLOVER_66_0.cloverRec.S[8203]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2071]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2071]==0&false))) {{
										__CLOVER_66_0.cloverRec.S[8204]++;type.addElement(t);
									}
								}}
								}else {{
									__CLOVER_66_0.cloverRec.S[8205]++;break _loop75;
								}
								
							}} }while (true);
							}
							__CLOVER_66_0.cloverRec.S[8206]++;break;
						}
						case ACOLADEF:if (!__CLOVER_bool22) {__CLOVER_66_0.cloverRec.S[8207]++;__CLOVER_bool22=true;}
						{
							__CLOVER_66_0.cloverRec.S[8208]++;break;
						}
						default:if (!__CLOVER_bool22) {__CLOVER_66_0.cloverRec.S[8209]++;__CLOVER_bool22=true;}
						{
							__CLOVER_66_0.cloverRec.S[8210]++;throw new NoViableAltException(LT(1), getFilename());
						}
						}
						}
						__CLOVER_66_0.cloverRec.S[8211]++;tinyeiffel.compiler.ASTDefaut tmp36_AST = null;
						__CLOVER_66_0.cloverRec.S[8212]++;tmp36_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(LT(1));
						__CLOVER_66_0.cloverRec.S[8213]++;astFactory.addASTChild(currentAST, tmp36_AST);
						__CLOVER_66_0.cloverRec.S[8214]++;match(ACOLADEF);
						__CLOVER_66_0.cloverRec.S[8215]++;break;
					}
					case ID:if (!__CLOVER_bool21) {__CLOVER_66_0.cloverRec.S[8216]++;__CLOVER_bool21=true;}
					case INFIX:if (!__CLOVER_bool21) {__CLOVER_66_0.cloverRec.S[8217]++;__CLOVER_bool21=true;}
					case PREFIX:if (!__CLOVER_bool21) {__CLOVER_66_0.cloverRec.S[8218]++;__CLOVER_bool21=true;}
					{
						__CLOVER_66_0.cloverRec.S[8219]++;break;
					}
					default:if (!__CLOVER_bool21) {__CLOVER_66_0.cloverRec.S[8220]++;__CLOVER_bool21=true;}
					{
						__CLOVER_66_0.cloverRec.S[8221]++;throw new NoViableAltException(LT(1), getFilename());
					}
					}
					}
					__CLOVER_66_0.cloverRec.S[8222]++;nom=nom_feature();
					__CLOVER_66_0.cloverRec.S[8223]++;astFactory.addASTChild(currentAST, returnAST);
					__CLOVER_66_0.cloverRec.S[8224]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2072]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2072]==0&false))) {{
						__CLOVER_66_0.cloverRec.S[8225]++;creation.addElement(nom);
					}
					}{
					__CLOVER_66_0.cloverRec.S[8226]++;_loop77:
					do {{
						__CLOVER_66_0.cloverRec.S[8227]++;if (((((LA(1)==VIRGULE)) && (++__CLOVER_66_0.cloverRec.CT[2073]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2073]==0&false))) {{
							__CLOVER_66_0.cloverRec.S[8228]++;tinyeiffel.compiler.ASTDefaut tmp37_AST = null;
							__CLOVER_66_0.cloverRec.S[8229]++;tmp37_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(LT(1));
							__CLOVER_66_0.cloverRec.S[8230]++;astFactory.addASTChild(currentAST, tmp37_AST);
							__CLOVER_66_0.cloverRec.S[8231]++;match(VIRGULE);
							__CLOVER_66_0.cloverRec.S[8232]++;nom=nom_feature();
							__CLOVER_66_0.cloverRec.S[8233]++;astFactory.addASTChild(currentAST, returnAST);
							__CLOVER_66_0.cloverRec.S[8234]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2074]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2074]==0&false))) {{
								__CLOVER_66_0.cloverRec.S[8235]++;creation.addElement(nom);
							}
						}}
						}else {{
							__CLOVER_66_0.cloverRec.S[8236]++;break _loop77;
						}
						
					}} }while (true);
					}
					__CLOVER_66_0.cloverRec.S[8237]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2075]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2075]==0&false))) {{
						
								__CLOVER_66_0.cloverRec.S[8238]++;if((((!pas_export&&type.size()==0) && (++__CLOVER_66_0.cloverRec.CT[2076]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2076]==0&false)))
									{__CLOVER_66_0.cloverRec.S[8239]++;type=null;
								}__CLOVER_66_0.cloverRec.S[8240]++;c1=new Creation(type,creation);
								__CLOVER_66_0.cloverRec.S[8241]++;tinyeiffel.ast.Token tcreation;
								__CLOVER_66_0.cloverRec.S[8242]++;tcreation=remplitToken(cre);
								__CLOVER_66_0.cloverRec.S[8243]++;c1.set_token(tcreation);
								__CLOVER_66_0.cloverRec.S[8244]++;res.addElement(c1);
								__CLOVER_66_0.cloverRec.S[8245]++;if((((type!=null) && (++__CLOVER_66_0.cloverRec.CT[2077]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2077]==0&false)))
									{__CLOVER_66_0.cloverRec.S[8246]++;ajoute_type(type);
							
					}}
				}}
				}else {{
					__CLOVER_66_0.cloverRec.S[8247]++;if ( (((_cnt78>=1 ) && (++__CLOVER_66_0.cloverRec.CT[2078]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2078]==0&false))) {{ __CLOVER_66_0.cloverRec.S[8248]++;break _loop78; } }else {{__CLOVER_66_0.cloverRec.S[8249]++;throw new NoViableAltException(LT(1), getFilename());}
				}}
				
				}__CLOVER_66_0.cloverRec.S[8250]++;_cnt78++;
			} }while (true);
			}
			__CLOVER_66_0.cloverRec.S[8251]++;creation_AST = (tinyeiffel.compiler.ASTDefaut)currentAST.root;
		}
		catch (RecognitionException ex) {
			__CLOVER_66_0.cloverRec.S[8252]++;if ((((inputState.guessing==0) && (++__CLOVER_66_0.cloverRec.CT[2079]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2079]==0&false))) {{
				
						__CLOVER_66_0.cloverRec.S[8253]++;logging.erreur(new ErreurSource("Erreur dans la creation",ex.getLine(),
									ex.getColumn(),ex.getFilename()));
					
			} }else {{
				__CLOVER_66_0.cloverRec.S[8254]++;throw ex;
			}
		}}
		__CLOVER_66_0.cloverRec.S[8255]++;returnAST = creation_AST;
		__CLOVER_66_0.cloverRec.S[8256]++;return res;
	}
	
	public final Type  type() throws RecognitionException, TokenStreamException {__CLOVER_66_0.cloverRec.M[546]++;
		__CLOVER_66_0.cloverRec.S[8257]++;Type res=null;
		
		__CLOVER_66_0.cloverRec.S[8258]++;returnAST = null;
		__CLOVER_66_0.cloverRec.S[8259]++;ASTPair currentAST = new ASTPair();
		__CLOVER_66_0.cloverRec.S[8260]++;tinyeiffel.compiler.ASTDefaut type_AST = null;
		__CLOVER_66_0.cloverRec.S[8261]++;Token  id1 = null;
		__CLOVER_66_0.cloverRec.S[8262]++;tinyeiffel.compiler.ASTDefaut id1_AST = null;
		__CLOVER_66_0.cloverRec.S[8263]++;Token  co = null;
		__CLOVER_66_0.cloverRec.S[8264]++;tinyeiffel.compiler.ASTDefaut co_AST = null;
		__CLOVER_66_0.cloverRec.S[8265]++;Token  cf = null;
		__CLOVER_66_0.cloverRec.S[8266]++;tinyeiffel.compiler.ASTDefaut cf_AST = null;
		__CLOVER_66_0.cloverRec.S[8267]++;Token  like = null;
		__CLOVER_66_0.cloverRec.S[8268]++;tinyeiffel.compiler.ASTDefaut like_AST = null;
		
		__CLOVER_66_0.cloverRec.S[8269]++;Expr e=null;
		__CLOVER_66_0.cloverRec.S[8270]++;Vector t=new Vector();
		__CLOVER_66_0.cloverRec.S[8271]++;Type t2;
		__CLOVER_66_0.cloverRec.S[8272]++;boolean expanded=false;
		
		
		__CLOVER_66_0.cloverRec.S[8273]++;try {      // for error handling
			__CLOVER_66_0.cloverRec.S[8274]++;boolean __CLOVER_bool23=false;switch ( LA(1)) {
			case EXPANDED:if (!__CLOVER_bool23) {__CLOVER_66_0.cloverRec.S[8275]++;__CLOVER_bool23=true;}
			case ID:if (!__CLOVER_bool23) {__CLOVER_66_0.cloverRec.S[8276]++;__CLOVER_bool23=true;}
			{
				{
				__CLOVER_66_0.cloverRec.S[8277]++;boolean __CLOVER_bool24=false;switch ( LA(1)) {
				case EXPANDED:if (!__CLOVER_bool24) {__CLOVER_66_0.cloverRec.S[8278]++;__CLOVER_bool24=true;}
				{
					__CLOVER_66_0.cloverRec.S[8279]++;tinyeiffel.compiler.ASTDefaut tmp38_AST = null;
					__CLOVER_66_0.cloverRec.S[8280]++;tmp38_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(LT(1));
					__CLOVER_66_0.cloverRec.S[8281]++;astFactory.addASTChild(currentAST, tmp38_AST);
					__CLOVER_66_0.cloverRec.S[8282]++;match(EXPANDED);
					__CLOVER_66_0.cloverRec.S[8283]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2080]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2080]==0&false))) {{
						__CLOVER_66_0.cloverRec.S[8284]++;expanded=true;
					}
					}__CLOVER_66_0.cloverRec.S[8285]++;break;
				}
				case ID:if (!__CLOVER_bool24) {__CLOVER_66_0.cloverRec.S[8286]++;__CLOVER_bool24=true;}
				{
					__CLOVER_66_0.cloverRec.S[8287]++;break;
				}
				default:if (!__CLOVER_bool24) {__CLOVER_66_0.cloverRec.S[8288]++;__CLOVER_bool24=true;}
				{
					__CLOVER_66_0.cloverRec.S[8289]++;throw new NoViableAltException(LT(1), getFilename());
				}
				}
				}
				__CLOVER_66_0.cloverRec.S[8290]++;id1 = LT(1);
				__CLOVER_66_0.cloverRec.S[8291]++;id1_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(id1);
				__CLOVER_66_0.cloverRec.S[8292]++;astFactory.addASTChild(currentAST, id1_AST);
				__CLOVER_66_0.cloverRec.S[8293]++;match(ID);
				{
				__CLOVER_66_0.cloverRec.S[8294]++;boolean __CLOVER_bool25=false;switch ( LA(1)) {
				case CROCHETO:if (!__CLOVER_bool25) {__CLOVER_66_0.cloverRec.S[8295]++;__CLOVER_bool25=true;}
				{
					__CLOVER_66_0.cloverRec.S[8296]++;co = LT(1);
					__CLOVER_66_0.cloverRec.S[8297]++;co_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(co);
					__CLOVER_66_0.cloverRec.S[8298]++;astFactory.addASTChild(currentAST, co_AST);
					__CLOVER_66_0.cloverRec.S[8299]++;match(CROCHETO);
					{
					__CLOVER_66_0.cloverRec.S[8300]++;boolean __CLOVER_bool26=false;switch ( LA(1)) {
					case EXPANDED:if (!__CLOVER_bool26) {__CLOVER_66_0.cloverRec.S[8301]++;__CLOVER_bool26=true;}
					case ID:if (!__CLOVER_bool26) {__CLOVER_66_0.cloverRec.S[8302]++;__CLOVER_bool26=true;}
					case LIKE:if (!__CLOVER_bool26) {__CLOVER_66_0.cloverRec.S[8303]++;__CLOVER_bool26=true;}
					{
						__CLOVER_66_0.cloverRec.S[8304]++;t2=type();
						__CLOVER_66_0.cloverRec.S[8305]++;astFactory.addASTChild(currentAST, returnAST);
						__CLOVER_66_0.cloverRec.S[8306]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2081]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2081]==0&false))) {{
							__CLOVER_66_0.cloverRec.S[8307]++;t.addElement(t2);
						}
						}{
						__CLOVER_66_0.cloverRec.S[8308]++;_loop96:
						do {{
							__CLOVER_66_0.cloverRec.S[8309]++;if (((((LA(1)==VIRGULE)) && (++__CLOVER_66_0.cloverRec.CT[2082]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2082]==0&false))) {{
								__CLOVER_66_0.cloverRec.S[8310]++;tinyeiffel.compiler.ASTDefaut tmp39_AST = null;
								__CLOVER_66_0.cloverRec.S[8311]++;tmp39_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(LT(1));
								__CLOVER_66_0.cloverRec.S[8312]++;astFactory.addASTChild(currentAST, tmp39_AST);
								__CLOVER_66_0.cloverRec.S[8313]++;match(VIRGULE);
								__CLOVER_66_0.cloverRec.S[8314]++;t2=type();
								__CLOVER_66_0.cloverRec.S[8315]++;astFactory.addASTChild(currentAST, returnAST);
								__CLOVER_66_0.cloverRec.S[8316]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2083]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2083]==0&false))) {{
									__CLOVER_66_0.cloverRec.S[8317]++;t.addElement(t2);
								}
							}}
							}else {{
								__CLOVER_66_0.cloverRec.S[8318]++;break _loop96;
							}
							
						}} }while (true);
						}
						__CLOVER_66_0.cloverRec.S[8319]++;break;
					}
					case CROCHETF:if (!__CLOVER_bool26) {__CLOVER_66_0.cloverRec.S[8320]++;__CLOVER_bool26=true;}
					{
						__CLOVER_66_0.cloverRec.S[8321]++;break;
					}
					default:if (!__CLOVER_bool26) {__CLOVER_66_0.cloverRec.S[8322]++;__CLOVER_bool26=true;}
					{
						__CLOVER_66_0.cloverRec.S[8323]++;throw new NoViableAltException(LT(1), getFilename());
					}
					}
					}
					__CLOVER_66_0.cloverRec.S[8324]++;cf = LT(1);
					__CLOVER_66_0.cloverRec.S[8325]++;cf_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(cf);
					__CLOVER_66_0.cloverRec.S[8326]++;astFactory.addASTChild(currentAST, cf_AST);
					__CLOVER_66_0.cloverRec.S[8327]++;match(CROCHETF);
					__CLOVER_66_0.cloverRec.S[8328]++;break;
				}
				case EXPANDED:if (!__CLOVER_bool25) {__CLOVER_66_0.cloverRec.S[8329]++;__CLOVER_bool25=true;}
				case FEATURE:if (!__CLOVER_bool25) {__CLOVER_66_0.cloverRec.S[8330]++;__CLOVER_bool25=true;}
				case VIRGULE:if (!__CLOVER_bool25) {__CLOVER_66_0.cloverRec.S[8331]++;__CLOVER_bool25=true;}
				case ACOLADEF:if (!__CLOVER_bool25) {__CLOVER_66_0.cloverRec.S[8332]++;__CLOVER_bool25=true;}
				case SEMI:if (!__CLOVER_bool25) {__CLOVER_66_0.cloverRec.S[8333]++;__CLOVER_bool25=true;}
				case INVARIANT:if (!__CLOVER_bool25) {__CLOVER_66_0.cloverRec.S[8334]++;__CLOVER_bool25=true;}
				case END:if (!__CLOVER_bool25) {__CLOVER_66_0.cloverRec.S[8335]++;__CLOVER_bool25=true;}
				case ID:if (!__CLOVER_bool25) {__CLOVER_66_0.cloverRec.S[8336]++;__CLOVER_bool25=true;}
				case RENAME:if (!__CLOVER_bool25) {__CLOVER_66_0.cloverRec.S[8337]++;__CLOVER_bool25=true;}
				case EXPORT:if (!__CLOVER_bool25) {__CLOVER_66_0.cloverRec.S[8338]++;__CLOVER_bool25=true;}
				case UNDEFINE:if (!__CLOVER_bool25) {__CLOVER_66_0.cloverRec.S[8339]++;__CLOVER_bool25=true;}
				case REDEFINE:if (!__CLOVER_bool25) {__CLOVER_66_0.cloverRec.S[8340]++;__CLOVER_bool25=true;}
				case SELECT:if (!__CLOVER_bool25) {__CLOVER_66_0.cloverRec.S[8341]++;__CLOVER_bool25=true;}
				case CREATION:if (!__CLOVER_bool25) {__CLOVER_66_0.cloverRec.S[8342]++;__CLOVER_bool25=true;}
				case INFIX:if (!__CLOVER_bool25) {__CLOVER_66_0.cloverRec.S[8343]++;__CLOVER_bool25=true;}
				case PREFIX:if (!__CLOVER_bool25) {__CLOVER_66_0.cloverRec.S[8344]++;__CLOVER_bool25=true;}
				case RPAREN:if (!__CLOVER_bool25) {__CLOVER_66_0.cloverRec.S[8345]++;__CLOVER_bool25=true;}
				case CROCHETF:if (!__CLOVER_bool25) {__CLOVER_66_0.cloverRec.S[8346]++;__CLOVER_bool25=true;}
				case LIKE:if (!__CLOVER_bool25) {__CLOVER_66_0.cloverRec.S[8347]++;__CLOVER_bool25=true;}
				case FROZEN:if (!__CLOVER_bool25) {__CLOVER_66_0.cloverRec.S[8348]++;__CLOVER_bool25=true;}
				case IS:if (!__CLOVER_bool25) {__CLOVER_66_0.cloverRec.S[8349]++;__CLOVER_bool25=true;}
				case DO:if (!__CLOVER_bool25) {__CLOVER_66_0.cloverRec.S[8350]++;__CLOVER_bool25=true;}
				case ONCE:if (!__CLOVER_bool25) {__CLOVER_66_0.cloverRec.S[8351]++;__CLOVER_bool25=true;}
				case EXCLAMATION:if (!__CLOVER_bool25) {__CLOVER_66_0.cloverRec.S[8352]++;__CLOVER_bool25=true;}
				{
					__CLOVER_66_0.cloverRec.S[8353]++;break;
				}
				default:if (!__CLOVER_bool25) {__CLOVER_66_0.cloverRec.S[8354]++;__CLOVER_bool25=true;}
				{
					__CLOVER_66_0.cloverRec.S[8355]++;throw new NoViableAltException(LT(1), getFilename());
				}
				}
				}
				__CLOVER_66_0.cloverRec.S[8356]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2084]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2084]==0&false))) {{
					
								__CLOVER_66_0.cloverRec.S[8357]++;res=new TypeSimple(expanded,id1.getText(),t);__CLOVER_66_0.cloverRec.S[8358]++;ajoute_type(res);
								__CLOVER_66_0.cloverRec.S[8359]++;res.set_token(remplitToken(id1),remplitToken(co),remplitToken(cf));
							
				}
				}__CLOVER_66_0.cloverRec.S[8360]++;type_AST = (tinyeiffel.compiler.ASTDefaut)currentAST.root;
				__CLOVER_66_0.cloverRec.S[8361]++;break;
			}
			case LIKE:if (!__CLOVER_bool23) {__CLOVER_66_0.cloverRec.S[8362]++;__CLOVER_bool23=true;}
			{
				__CLOVER_66_0.cloverRec.S[8363]++;like = LT(1);
				__CLOVER_66_0.cloverRec.S[8364]++;like_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(like);
				__CLOVER_66_0.cloverRec.S[8365]++;astFactory.addASTChild(currentAST, like_AST);
				__CLOVER_66_0.cloverRec.S[8366]++;match(LIKE);
				__CLOVER_66_0.cloverRec.S[8367]++;e=expr();
				__CLOVER_66_0.cloverRec.S[8368]++;astFactory.addASTChild(currentAST, returnAST);
				__CLOVER_66_0.cloverRec.S[8369]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2085]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2085]==0&false))) {{
					
								__CLOVER_66_0.cloverRec.S[8370]++;res=new TypeAncre(e);
								__CLOVER_66_0.cloverRec.S[8371]++;res.set_token(remplitToken(like));
							
				}
				}__CLOVER_66_0.cloverRec.S[8372]++;type_AST = (tinyeiffel.compiler.ASTDefaut)currentAST.root;
				__CLOVER_66_0.cloverRec.S[8373]++;break;
			}
			default:if (!__CLOVER_bool23) {__CLOVER_66_0.cloverRec.S[8374]++;__CLOVER_bool23=true;}
			{
				__CLOVER_66_0.cloverRec.S[8375]++;throw new NoViableAltException(LT(1), getFilename());
			}
			}
		}
		catch (RecognitionException ex) {
			__CLOVER_66_0.cloverRec.S[8376]++;if ((((inputState.guessing==0) && (++__CLOVER_66_0.cloverRec.CT[2086]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2086]==0&false))) {{
				
						__CLOVER_66_0.cloverRec.S[8377]++;logging.erreur(new ErreurSource("Erreur dans le type"+ex,ex.getLine(),
									ex.getColumn(),ex.getFilename()));
					
			} }else {{
				__CLOVER_66_0.cloverRec.S[8378]++;throw ex;
			}
		}}
		__CLOVER_66_0.cloverRec.S[8379]++;returnAST = type_AST;
		__CLOVER_66_0.cloverRec.S[8380]++;return res;
	}
	
	public final Feature  feature(
		Vector export_debut,Token fea
	) throws RecognitionException, TokenStreamException {__CLOVER_66_0.cloverRec.M[547]++;
		__CLOVER_66_0.cloverRec.S[8381]++;Feature res=null;
		
		__CLOVER_66_0.cloverRec.S[8382]++;returnAST = null;
		__CLOVER_66_0.cloverRec.S[8383]++;ASTPair currentAST = new ASTPair();
		__CLOVER_66_0.cloverRec.S[8384]++;tinyeiffel.compiler.ASTDefaut feature_AST = null;
		__CLOVER_66_0.cloverRec.S[8385]++;Token  fro1 = null;
		__CLOVER_66_0.cloverRec.S[8386]++;tinyeiffel.compiler.ASTDefaut fro1_AST = null;
		__CLOVER_66_0.cloverRec.S[8387]++;Token  fro2 = null;
		__CLOVER_66_0.cloverRec.S[8388]++;tinyeiffel.compiler.ASTDefaut fro2_AST = null;
		
		__CLOVER_66_0.cloverRec.S[8389]++;Vector decl=null,comment=null;
		__CLOVER_66_0.cloverRec.S[8390]++;NomFeature n;
		__CLOVER_66_0.cloverRec.S[8391]++;boolean frozen=false,export_vide=false,premier=true;
		__CLOVER_66_0.cloverRec.S[8392]++;Vector nom=new Vector(),export=new Vector();
		__CLOVER_66_0.cloverRec.S[8393]++;Type t=null,t2=null;
		__CLOVER_66_0.cloverRec.S[8394]++;int debut_commentaire=dernier_commentaire(),fin_commentaire=-1;
		__CLOVER_66_0.cloverRec.S[8395]++;export=export_debut;
		__CLOVER_66_0.cloverRec.S[8396]++;export_vide=true;
		
		
		__CLOVER_66_0.cloverRec.S[8397]++;try {      // for error handling
			__CLOVER_66_0.cloverRec.S[8398]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2087]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2087]==0&false))) {{
				__CLOVER_66_0.cloverRec.S[8399]++;frozen=false;
			}
			}{
			__CLOVER_66_0.cloverRec.S[8400]++;boolean __CLOVER_bool27=false;switch ( LA(1)) {
			case FROZEN:if (!__CLOVER_bool27) {__CLOVER_66_0.cloverRec.S[8401]++;__CLOVER_bool27=true;}
			{
				__CLOVER_66_0.cloverRec.S[8402]++;fro1 = LT(1);
				__CLOVER_66_0.cloverRec.S[8403]++;fro1_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(fro1);
				__CLOVER_66_0.cloverRec.S[8404]++;astFactory.addASTChild(currentAST, fro1_AST);
				__CLOVER_66_0.cloverRec.S[8405]++;match(FROZEN);
				__CLOVER_66_0.cloverRec.S[8406]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2088]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2088]==0&false))) {{
					__CLOVER_66_0.cloverRec.S[8407]++;frozen=true;
				}
				}__CLOVER_66_0.cloverRec.S[8408]++;break;
			}
			case ID:if (!__CLOVER_bool27) {__CLOVER_66_0.cloverRec.S[8409]++;__CLOVER_bool27=true;}
			case INFIX:if (!__CLOVER_bool27) {__CLOVER_66_0.cloverRec.S[8410]++;__CLOVER_bool27=true;}
			case PREFIX:if (!__CLOVER_bool27) {__CLOVER_66_0.cloverRec.S[8411]++;__CLOVER_bool27=true;}
			{
				__CLOVER_66_0.cloverRec.S[8412]++;break;
			}
			default:if (!__CLOVER_bool27) {__CLOVER_66_0.cloverRec.S[8413]++;__CLOVER_bool27=true;}
			{
				__CLOVER_66_0.cloverRec.S[8414]++;throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			__CLOVER_66_0.cloverRec.S[8415]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2089]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2089]==0&false))) {{
				__CLOVER_66_0.cloverRec.S[8416]++;fin_commentaire=dernier_commentaire();
			}
			}__CLOVER_66_0.cloverRec.S[8417]++;n=nom_feature();
			__CLOVER_66_0.cloverRec.S[8418]++;astFactory.addASTChild(currentAST, returnAST);
			__CLOVER_66_0.cloverRec.S[8419]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2090]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2090]==0&false))) {{
				
										__CLOVER_66_0.cloverRec.S[8420]++;n.frozen=frozen;
										__CLOVER_66_0.cloverRec.S[8421]++;nom.addElement(n);
										__CLOVER_66_0.cloverRec.S[8422]++;n.tfrozen=remplitToken(fro1);
									
			}
			}{
			__CLOVER_66_0.cloverRec.S[8423]++;_loop102:
			do {{
				__CLOVER_66_0.cloverRec.S[8424]++;if (((((LA(1)==VIRGULE)) && (++__CLOVER_66_0.cloverRec.CT[2091]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2091]==0&false))) {{
					__CLOVER_66_0.cloverRec.S[8425]++;tinyeiffel.compiler.ASTDefaut tmp40_AST = null;
					__CLOVER_66_0.cloverRec.S[8426]++;tmp40_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(LT(1));
					__CLOVER_66_0.cloverRec.S[8427]++;astFactory.addASTChild(currentAST, tmp40_AST);
					__CLOVER_66_0.cloverRec.S[8428]++;match(VIRGULE);
					__CLOVER_66_0.cloverRec.S[8429]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2092]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2092]==0&false))) {{
						__CLOVER_66_0.cloverRec.S[8430]++;frozen=false;
					}
					}{
					__CLOVER_66_0.cloverRec.S[8431]++;boolean __CLOVER_bool28=false;switch ( LA(1)) {
					case FROZEN:if (!__CLOVER_bool28) {__CLOVER_66_0.cloverRec.S[8432]++;__CLOVER_bool28=true;}
					{
						__CLOVER_66_0.cloverRec.S[8433]++;fro2 = LT(1);
						__CLOVER_66_0.cloverRec.S[8434]++;fro2_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(fro2);
						__CLOVER_66_0.cloverRec.S[8435]++;astFactory.addASTChild(currentAST, fro2_AST);
						__CLOVER_66_0.cloverRec.S[8436]++;match(FROZEN);
						__CLOVER_66_0.cloverRec.S[8437]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2093]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2093]==0&false))) {{
							__CLOVER_66_0.cloverRec.S[8438]++;frozen=true;
						}
						}__CLOVER_66_0.cloverRec.S[8439]++;break;
					}
					case ID:if (!__CLOVER_bool28) {__CLOVER_66_0.cloverRec.S[8440]++;__CLOVER_bool28=true;}
					case INFIX:if (!__CLOVER_bool28) {__CLOVER_66_0.cloverRec.S[8441]++;__CLOVER_bool28=true;}
					case PREFIX:if (!__CLOVER_bool28) {__CLOVER_66_0.cloverRec.S[8442]++;__CLOVER_bool28=true;}
					{
						__CLOVER_66_0.cloverRec.S[8443]++;break;
					}
					default:if (!__CLOVER_bool28) {__CLOVER_66_0.cloverRec.S[8444]++;__CLOVER_bool28=true;}
					{
						__CLOVER_66_0.cloverRec.S[8445]++;throw new NoViableAltException(LT(1), getFilename());
					}
					}
					}
					__CLOVER_66_0.cloverRec.S[8446]++;n=nom_feature();
					__CLOVER_66_0.cloverRec.S[8447]++;astFactory.addASTChild(currentAST, returnAST);
					__CLOVER_66_0.cloverRec.S[8448]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2094]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2094]==0&false))) {{
						
												__CLOVER_66_0.cloverRec.S[8449]++;n.frozen=frozen;
												__CLOVER_66_0.cloverRec.S[8450]++;nom.addElement(n);
												__CLOVER_66_0.cloverRec.S[8451]++;n.tfrozen=remplitToken(fro2);
											
					}
				}}
				}else {{
					__CLOVER_66_0.cloverRec.S[8452]++;break _loop102;
				}
				
			}} }while (true);
			}
			{
			{
			{
			__CLOVER_66_0.cloverRec.S[8453]++;boolean __CLOVER_bool29=false;switch ( LA(1)) {
			case LPAREN:if (!__CLOVER_bool29) {__CLOVER_66_0.cloverRec.S[8454]++;__CLOVER_bool29=true;}
			{
				__CLOVER_66_0.cloverRec.S[8455]++;decl=decl_param();
				__CLOVER_66_0.cloverRec.S[8456]++;astFactory.addASTChild(currentAST, returnAST);
				__CLOVER_66_0.cloverRec.S[8457]++;break;
			}
			case FEATURE:if (!__CLOVER_bool29) {__CLOVER_66_0.cloverRec.S[8458]++;__CLOVER_bool29=true;}
			case SEMI:if (!__CLOVER_bool29) {__CLOVER_66_0.cloverRec.S[8459]++;__CLOVER_bool29=true;}
			case INVARIANT:if (!__CLOVER_bool29) {__CLOVER_66_0.cloverRec.S[8460]++;__CLOVER_bool29=true;}
			case END:if (!__CLOVER_bool29) {__CLOVER_66_0.cloverRec.S[8461]++;__CLOVER_bool29=true;}
			case ID:if (!__CLOVER_bool29) {__CLOVER_66_0.cloverRec.S[8462]++;__CLOVER_bool29=true;}
			case DOUBLE_POINT:if (!__CLOVER_bool29) {__CLOVER_66_0.cloverRec.S[8463]++;__CLOVER_bool29=true;}
			case INFIX:if (!__CLOVER_bool29) {__CLOVER_66_0.cloverRec.S[8464]++;__CLOVER_bool29=true;}
			case PREFIX:if (!__CLOVER_bool29) {__CLOVER_66_0.cloverRec.S[8465]++;__CLOVER_bool29=true;}
			case FROZEN:if (!__CLOVER_bool29) {__CLOVER_66_0.cloverRec.S[8466]++;__CLOVER_bool29=true;}
			case IS:if (!__CLOVER_bool29) {__CLOVER_66_0.cloverRec.S[8467]++;__CLOVER_bool29=true;}
			{
				__CLOVER_66_0.cloverRec.S[8468]++;break;
			}
			default:if (!__CLOVER_bool29) {__CLOVER_66_0.cloverRec.S[8469]++;__CLOVER_bool29=true;}
			{
				__CLOVER_66_0.cloverRec.S[8470]++;throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			{
			__CLOVER_66_0.cloverRec.S[8471]++;boolean __CLOVER_bool30=false;switch ( LA(1)) {
			case DOUBLE_POINT:if (!__CLOVER_bool30) {__CLOVER_66_0.cloverRec.S[8472]++;__CLOVER_bool30=true;}
			{
				__CLOVER_66_0.cloverRec.S[8473]++;tinyeiffel.compiler.ASTDefaut tmp41_AST = null;
				__CLOVER_66_0.cloverRec.S[8474]++;tmp41_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(LT(1));
				__CLOVER_66_0.cloverRec.S[8475]++;astFactory.addASTChild(currentAST, tmp41_AST);
				__CLOVER_66_0.cloverRec.S[8476]++;match(DOUBLE_POINT);
				__CLOVER_66_0.cloverRec.S[8477]++;t=type();
				__CLOVER_66_0.cloverRec.S[8478]++;astFactory.addASTChild(currentAST, returnAST);
				__CLOVER_66_0.cloverRec.S[8479]++;break;
			}
			case FEATURE:if (!__CLOVER_bool30) {__CLOVER_66_0.cloverRec.S[8480]++;__CLOVER_bool30=true;}
			case SEMI:if (!__CLOVER_bool30) {__CLOVER_66_0.cloverRec.S[8481]++;__CLOVER_bool30=true;}
			case INVARIANT:if (!__CLOVER_bool30) {__CLOVER_66_0.cloverRec.S[8482]++;__CLOVER_bool30=true;}
			case END:if (!__CLOVER_bool30) {__CLOVER_66_0.cloverRec.S[8483]++;__CLOVER_bool30=true;}
			case ID:if (!__CLOVER_bool30) {__CLOVER_66_0.cloverRec.S[8484]++;__CLOVER_bool30=true;}
			case INFIX:if (!__CLOVER_bool30) {__CLOVER_66_0.cloverRec.S[8485]++;__CLOVER_bool30=true;}
			case PREFIX:if (!__CLOVER_bool30) {__CLOVER_66_0.cloverRec.S[8486]++;__CLOVER_bool30=true;}
			case FROZEN:if (!__CLOVER_bool30) {__CLOVER_66_0.cloverRec.S[8487]++;__CLOVER_bool30=true;}
			case IS:if (!__CLOVER_bool30) {__CLOVER_66_0.cloverRec.S[8488]++;__CLOVER_bool30=true;}
			{
				__CLOVER_66_0.cloverRec.S[8489]++;break;
			}
			default:if (!__CLOVER_bool30) {__CLOVER_66_0.cloverRec.S[8490]++;__CLOVER_bool30=true;}
			{
				__CLOVER_66_0.cloverRec.S[8491]++;throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			{
			__CLOVER_66_0.cloverRec.S[8492]++;boolean __CLOVER_bool31=false;switch ( LA(1)) {
			case IS:if (!__CLOVER_bool31) {__CLOVER_66_0.cloverRec.S[8493]++;__CLOVER_bool31=true;}
			{
				__CLOVER_66_0.cloverRec.S[8494]++;tinyeiffel.compiler.ASTDefaut tmp42_AST = null;
				__CLOVER_66_0.cloverRec.S[8495]++;tmp42_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(LT(1));
				__CLOVER_66_0.cloverRec.S[8496]++;astFactory.addASTChild(currentAST, tmp42_AST);
				__CLOVER_66_0.cloverRec.S[8497]++;match(IS);
				__CLOVER_66_0.cloverRec.S[8498]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2095]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2095]==0&false))) {{
					__CLOVER_66_0.cloverRec.S[8499]++;last_feature1=lexer.donne_dernier();
				}
				}__CLOVER_66_0.cloverRec.S[8500]++;res=corps();
				__CLOVER_66_0.cloverRec.S[8501]++;astFactory.addASTChild(currentAST, returnAST);
				__CLOVER_66_0.cloverRec.S[8502]++;break;
			}
			case FEATURE:if (!__CLOVER_bool31) {__CLOVER_66_0.cloverRec.S[8503]++;__CLOVER_bool31=true;}
			case SEMI:if (!__CLOVER_bool31) {__CLOVER_66_0.cloverRec.S[8504]++;__CLOVER_bool31=true;}
			case INVARIANT:if (!__CLOVER_bool31) {__CLOVER_66_0.cloverRec.S[8505]++;__CLOVER_bool31=true;}
			case END:if (!__CLOVER_bool31) {__CLOVER_66_0.cloverRec.S[8506]++;__CLOVER_bool31=true;}
			case ID:if (!__CLOVER_bool31) {__CLOVER_66_0.cloverRec.S[8507]++;__CLOVER_bool31=true;}
			case INFIX:if (!__CLOVER_bool31) {__CLOVER_66_0.cloverRec.S[8508]++;__CLOVER_bool31=true;}
			case PREFIX:if (!__CLOVER_bool31) {__CLOVER_66_0.cloverRec.S[8509]++;__CLOVER_bool31=true;}
			case FROZEN:if (!__CLOVER_bool31) {__CLOVER_66_0.cloverRec.S[8510]++;__CLOVER_bool31=true;}
			{
				__CLOVER_66_0.cloverRec.S[8511]++;break;
			}
			default:if (!__CLOVER_bool31) {__CLOVER_66_0.cloverRec.S[8512]++;__CLOVER_bool31=true;}
			{
				__CLOVER_66_0.cloverRec.S[8513]++;throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			{
			__CLOVER_66_0.cloverRec.S[8514]++;_loop109:
			do {{
				__CLOVER_66_0.cloverRec.S[8515]++;if (((((LA(1)==SEMI)) && (++__CLOVER_66_0.cloverRec.CT[2096]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2096]==0&false))) {{
					__CLOVER_66_0.cloverRec.S[8516]++;match(SEMI);
				}
				}else {{
					__CLOVER_66_0.cloverRec.S[8517]++;break _loop109;
				}
				
			}} }while (true);
			}
			__CLOVER_66_0.cloverRec.S[8518]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2097]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2097]==0&false))) {{
				
						__CLOVER_66_0.cloverRec.S[8519]++;comment=null;
						//System.out.println("suite2");
						__CLOVER_66_0.cloverRec.S[8520]++;if((((res!=null) && (++__CLOVER_66_0.cloverRec.CT[2098]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2098]==0&false)))
						{{
							//res=new Feature();
							__CLOVER_66_0.cloverRec.S[8521]++;if((((fin_commentaire>debut_commentaire) && (++__CLOVER_66_0.cloverRec.CT[2099]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2099]==0&false)))
							{{
								//System.out.println("comment feature:"+debut_commentaire+"<"+fin_commentaire);
								__CLOVER_66_0.cloverRec.S[8522]++;comment=new Vector();
								__CLOVER_66_0.cloverRec.S[8523]++;for(int i=debut_commentaire+1;(((i<=fin_commentaire) && (++__CLOVER_66_0.cloverRec.CT[2100]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2100]==0&false));i++)
								{{
									//System.out.println(i+")"+((Commentaire)lexer.liste_commentaire.elementAt(i)).str+"!");
									__CLOVER_66_0.cloverRec.S[8524]++;comment.addElement(lexer.liste_commentaire.elementAt(i));
								}
								//System.out.println("fin0");
							}}
							}__CLOVER_66_0.cloverRec.S[8525]++;res.set_nom_param(nom,decl,export,comment);
							__CLOVER_66_0.cloverRec.S[8526]++;res.type_retour=t;
							__CLOVER_66_0.cloverRec.S[8527]++;if((((fea!=null) && (++__CLOVER_66_0.cloverRec.CT[2101]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2101]==0&false)))
								{__CLOVER_66_0.cloverRec.S[8528]++;res.tfeature=remplitToken(fea);
							}else
								{__CLOVER_66_0.cloverRec.S[8529]++;res.tfeature=null;
						}}
						}else
						{{
							__CLOVER_66_0.cloverRec.S[8530]++;if((((fin_commentaire>debut_commentaire) && (++__CLOVER_66_0.cloverRec.CT[2102]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2102]==0&false)))
							{{
								//System.out.println("comment feature:"+debut_commentaire+"<"+fin_commentaire);
								__CLOVER_66_0.cloverRec.S[8531]++;comment=new Vector();
								__CLOVER_66_0.cloverRec.S[8532]++;for(int i=debut_commentaire+1;(((i<=fin_commentaire) && (++__CLOVER_66_0.cloverRec.CT[2103]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2103]==0&false));i++)
								{{
									//System.out.println(i+")"+((Commentaire)lexer.liste_commentaire.elementAt(i)).str+"!");
									__CLOVER_66_0.cloverRec.S[8533]++;comment.addElement(lexer.liste_commentaire.elementAt(i));
								}
								//System.out.println("fin2");
							}}
							}__CLOVER_66_0.cloverRec.S[8534]++;res=new FeatureAttr();
							__CLOVER_66_0.cloverRec.S[8535]++;res.set_nom_param(nom,decl,export,comment);
							__CLOVER_66_0.cloverRec.S[8536]++;res.type_retour=t;
						}
						}__CLOVER_66_0.cloverRec.S[8537]++;ajoute_type(export);
						__CLOVER_66_0.cloverRec.S[8538]++;ajoute_type(t);
						__CLOVER_66_0.cloverRec.S[8539]++;last_feature1=-1;__CLOVER_66_0.cloverRec.S[8540]++;last_feature2=-1;
						//System.out.println("suite3");
					
			}
			}}
			}
			__CLOVER_66_0.cloverRec.S[8541]++;feature_AST = (tinyeiffel.compiler.ASTDefaut)currentAST.root;
		}
		catch (RecognitionException ex) {
			__CLOVER_66_0.cloverRec.S[8542]++;if ((((inputState.guessing==0) && (++__CLOVER_66_0.cloverRec.CT[2104]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2104]==0&false))) {{
				
						__CLOVER_66_0.cloverRec.S[8543]++;logging.erreur(new ErreurSource("Erreur dans l'attribut",ex.getLine(),
									ex.getColumn(),ex.getFilename()));
					
			} }else {{
				__CLOVER_66_0.cloverRec.S[8544]++;throw ex;
			}
		}}
		__CLOVER_66_0.cloverRec.S[8545]++;returnAST = feature_AST;
		__CLOVER_66_0.cloverRec.S[8546]++;return res;
	}
	
	public final Vector  liste_assert() throws RecognitionException, TokenStreamException {__CLOVER_66_0.cloverRec.M[548]++;
		__CLOVER_66_0.cloverRec.S[8547]++;Vector res=new Vector();
		
		__CLOVER_66_0.cloverRec.S[8548]++;returnAST = null;
		__CLOVER_66_0.cloverRec.S[8549]++;ASTPair currentAST = new ASTPair();
		__CLOVER_66_0.cloverRec.S[8550]++;tinyeiffel.compiler.ASTDefaut liste_assert_AST = null;
		__CLOVER_66_0.cloverRec.S[8551]++;Token  i = null;
		__CLOVER_66_0.cloverRec.S[8552]++;tinyeiffel.compiler.ASTDefaut i_AST = null;
		
		__CLOVER_66_0.cloverRec.S[8553]++;Expr e=null;
		__CLOVER_66_0.cloverRec.S[8554]++;Assert a=null;
		__CLOVER_66_0.cloverRec.S[8555]++;boolean trouve=false;
		
		
		__CLOVER_66_0.cloverRec.S[8556]++;try {      // for error handling
			{
			__CLOVER_66_0.cloverRec.S[8557]++;_loop288:
			do {{
				__CLOVER_66_0.cloverRec.S[8558]++;if (((((_tokenSet_1.member(LA(1)))) && (++__CLOVER_66_0.cloverRec.CT[2105]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2105]==0&false))) {{
					__CLOVER_66_0.cloverRec.S[8559]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2106]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2106]==0&false))) {{
						__CLOVER_66_0.cloverRec.S[8560]++;trouve=false;
					}
					}{
					__CLOVER_66_0.cloverRec.S[8561]++;boolean synPredMatched282 = false;
					__CLOVER_66_0.cloverRec.S[8562]++;if ((((((LA(1)==ID) && (LA(2)==DOUBLE_POINT))) && (++__CLOVER_66_0.cloverRec.CT[2107]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2107]==0&false))) {{
						__CLOVER_66_0.cloverRec.S[8563]++;int _m282 = mark();
						__CLOVER_66_0.cloverRec.S[8564]++;synPredMatched282 = true;
						__CLOVER_66_0.cloverRec.S[8565]++;inputState.guessing++;
						__CLOVER_66_0.cloverRec.S[8566]++;try {
							{
							__CLOVER_66_0.cloverRec.S[8567]++;match(ID);
							__CLOVER_66_0.cloverRec.S[8568]++;match(DOUBLE_POINT);
							}
						}
						catch (RecognitionException pe) {
							__CLOVER_66_0.cloverRec.S[8569]++;synPredMatched282 = false;
						}
						__CLOVER_66_0.cloverRec.S[8570]++;rewind(_m282);
						__CLOVER_66_0.cloverRec.S[8571]++;inputState.guessing--;
					}
					}__CLOVER_66_0.cloverRec.S[8572]++;if ( (((synPredMatched282 ) && (++__CLOVER_66_0.cloverRec.CT[2108]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2108]==0&false))) {{
						__CLOVER_66_0.cloverRec.S[8573]++;i = LT(1);
						__CLOVER_66_0.cloverRec.S[8574]++;i_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(i);
						__CLOVER_66_0.cloverRec.S[8575]++;astFactory.addASTChild(currentAST, i_AST);
						__CLOVER_66_0.cloverRec.S[8576]++;match(ID);
						__CLOVER_66_0.cloverRec.S[8577]++;tinyeiffel.compiler.ASTDefaut tmp44_AST = null;
						__CLOVER_66_0.cloverRec.S[8578]++;tmp44_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(LT(1));
						__CLOVER_66_0.cloverRec.S[8579]++;astFactory.addASTChild(currentAST, tmp44_AST);
						__CLOVER_66_0.cloverRec.S[8580]++;match(DOUBLE_POINT);
						__CLOVER_66_0.cloverRec.S[8581]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2109]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2109]==0&false))) {{
							__CLOVER_66_0.cloverRec.S[8582]++;trouve=true;
						}
						}{
						__CLOVER_66_0.cloverRec.S[8583]++;boolean synPredMatched285 = false;
						__CLOVER_66_0.cloverRec.S[8584]++;if ((((((_tokenSet_1.member(LA(1))) && (_tokenSet_2.member(LA(2))) && (_tokenSet_3.member(LA(3))) && (_tokenSet_4.member(LA(4))))) && (++__CLOVER_66_0.cloverRec.CT[2110]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2110]==0&false))) {{
							__CLOVER_66_0.cloverRec.S[8585]++;int _m285 = mark();
							__CLOVER_66_0.cloverRec.S[8586]++;synPredMatched285 = true;
							__CLOVER_66_0.cloverRec.S[8587]++;inputState.guessing++;
							__CLOVER_66_0.cloverRec.S[8588]++;try {
								{
								__CLOVER_66_0.cloverRec.S[8589]++;boolean __CLOVER_bool32=false;switch ( LA(1)) {
								case ID:if (!__CLOVER_bool32) {__CLOVER_66_0.cloverRec.S[8590]++;__CLOVER_bool32=true;}
								{
									__CLOVER_66_0.cloverRec.S[8591]++;match(ID);
									__CLOVER_66_0.cloverRec.S[8592]++;break;
								}
								case STRING:if (!__CLOVER_bool32) {__CLOVER_66_0.cloverRec.S[8593]++;__CLOVER_bool32=true;}
								{
									__CLOVER_66_0.cloverRec.S[8594]++;match(STRING);
									__CLOVER_66_0.cloverRec.S[8595]++;break;
								}
								case LPAREN:if (!__CLOVER_bool32) {__CLOVER_66_0.cloverRec.S[8596]++;__CLOVER_bool32=true;}
								{
									__CLOVER_66_0.cloverRec.S[8597]++;match(LPAREN);
									__CLOVER_66_0.cloverRec.S[8598]++;break;
								}
								case INT:if (!__CLOVER_bool32) {__CLOVER_66_0.cloverRec.S[8599]++;__CLOVER_bool32=true;}
								{
									__CLOVER_66_0.cloverRec.S[8600]++;match(INT);
									__CLOVER_66_0.cloverRec.S[8601]++;break;
								}
								case REAL:if (!__CLOVER_bool32) {__CLOVER_66_0.cloverRec.S[8602]++;__CLOVER_bool32=true;}
								{
									__CLOVER_66_0.cloverRec.S[8603]++;match(REAL);
									__CLOVER_66_0.cloverRec.S[8604]++;break;
								}
								case CHAR:if (!__CLOVER_bool32) {__CLOVER_66_0.cloverRec.S[8605]++;__CLOVER_bool32=true;}
								{
									__CLOVER_66_0.cloverRec.S[8606]++;match(CHAR);
									__CLOVER_66_0.cloverRec.S[8607]++;break;
								}
								case PLUS:if (!__CLOVER_bool32) {__CLOVER_66_0.cloverRec.S[8608]++;__CLOVER_bool32=true;}
								{
									__CLOVER_66_0.cloverRec.S[8609]++;match(PLUS);
									__CLOVER_66_0.cloverRec.S[8610]++;break;
								}
								case MOINS:if (!__CLOVER_bool32) {__CLOVER_66_0.cloverRec.S[8611]++;__CLOVER_bool32=true;}
								{
									__CLOVER_66_0.cloverRec.S[8612]++;match(MOINS);
									__CLOVER_66_0.cloverRec.S[8613]++;break;
								}
								case FREEOP:if (!__CLOVER_bool32) {__CLOVER_66_0.cloverRec.S[8614]++;__CLOVER_bool32=true;}
								{
									__CLOVER_66_0.cloverRec.S[8615]++;match(FREEOP);
									__CLOVER_66_0.cloverRec.S[8616]++;break;
								}
								case OLD:if (!__CLOVER_bool32) {__CLOVER_66_0.cloverRec.S[8617]++;__CLOVER_bool32=true;}
								{
									__CLOVER_66_0.cloverRec.S[8618]++;match(OLD);
									__CLOVER_66_0.cloverRec.S[8619]++;break;
								}
								case NOT:if (!__CLOVER_bool32) {__CLOVER_66_0.cloverRec.S[8620]++;__CLOVER_bool32=true;}
								{
									__CLOVER_66_0.cloverRec.S[8621]++;match(NOT);
									__CLOVER_66_0.cloverRec.S[8622]++;break;
								}
								case DEBUT_ARRAY:if (!__CLOVER_bool32) {__CLOVER_66_0.cloverRec.S[8623]++;__CLOVER_bool32=true;}
								{
									__CLOVER_66_0.cloverRec.S[8624]++;match(DEBUT_ARRAY);
									__CLOVER_66_0.cloverRec.S[8625]++;break;
								}
								case TRUE:if (!__CLOVER_bool32) {__CLOVER_66_0.cloverRec.S[8626]++;__CLOVER_bool32=true;}
								{
									__CLOVER_66_0.cloverRec.S[8627]++;match(TRUE);
									__CLOVER_66_0.cloverRec.S[8628]++;break;
								}
								case FALSE:if (!__CLOVER_bool32) {__CLOVER_66_0.cloverRec.S[8629]++;__CLOVER_bool32=true;}
								{
									__CLOVER_66_0.cloverRec.S[8630]++;match(FALSE);
									__CLOVER_66_0.cloverRec.S[8631]++;break;
								}
								case STRING2:if (!__CLOVER_bool32) {__CLOVER_66_0.cloverRec.S[8632]++;__CLOVER_bool32=true;}
								{
									__CLOVER_66_0.cloverRec.S[8633]++;match(STRING2);
									__CLOVER_66_0.cloverRec.S[8634]++;break;
								}
								default:if (!__CLOVER_bool32) {__CLOVER_66_0.cloverRec.S[8635]++;__CLOVER_bool32=true;}
								{
									__CLOVER_66_0.cloverRec.S[8636]++;throw new NoViableAltException(LT(1), getFilename());
								}
								}
								}
							}
							catch (RecognitionException pe) {
								__CLOVER_66_0.cloverRec.S[8637]++;synPredMatched285 = false;
							}
							__CLOVER_66_0.cloverRec.S[8638]++;rewind(_m285);
							__CLOVER_66_0.cloverRec.S[8639]++;inputState.guessing--;
						}
						}__CLOVER_66_0.cloverRec.S[8640]++;if ( (((synPredMatched285 ) && (++__CLOVER_66_0.cloverRec.CT[2111]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2111]==0&false))) {{
							__CLOVER_66_0.cloverRec.S[8641]++;e=expr();
							__CLOVER_66_0.cloverRec.S[8642]++;astFactory.addASTChild(currentAST, returnAST);
						}
						}else {__CLOVER_66_0.cloverRec.S[8643]++;if (((((_tokenSet_5.member(LA(1))) && (_tokenSet_6.member(LA(2))) && (_tokenSet_4.member(LA(3))) && (_tokenSet_7.member(LA(4)))) && (++__CLOVER_66_0.cloverRec.CT[2112]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2112]==0&false))) {{
						}
						}else {{
							__CLOVER_66_0.cloverRec.S[8644]++;throw new NoViableAltException(LT(1), getFilename());
						}
						
						}}}
					}
					}else {__CLOVER_66_0.cloverRec.S[8645]++;if (((((_tokenSet_1.member(LA(1))) && (_tokenSet_2.member(LA(2)))) && (++__CLOVER_66_0.cloverRec.CT[2113]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2113]==0&false))) {{
						__CLOVER_66_0.cloverRec.S[8646]++;e=expr();
						__CLOVER_66_0.cloverRec.S[8647]++;astFactory.addASTChild(currentAST, returnAST);
					}
					}else {{
						__CLOVER_66_0.cloverRec.S[8648]++;throw new NoViableAltException(LT(1), getFilename());
					}
					
					}}}
					{
					__CLOVER_66_0.cloverRec.S[8649]++;_loop287:
					do {{
						__CLOVER_66_0.cloverRec.S[8650]++;if (((((LA(1)==SEMI)) && (++__CLOVER_66_0.cloverRec.CT[2114]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2114]==0&false))) {{
							__CLOVER_66_0.cloverRec.S[8651]++;tinyeiffel.compiler.ASTDefaut tmp45_AST = null;
							__CLOVER_66_0.cloverRec.S[8652]++;tmp45_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(LT(1));
							__CLOVER_66_0.cloverRec.S[8653]++;astFactory.addASTChild(currentAST, tmp45_AST);
							__CLOVER_66_0.cloverRec.S[8654]++;match(SEMI);
						}
						}else {{
							__CLOVER_66_0.cloverRec.S[8655]++;break _loop287;
						}
						
					}} }while (true);
					}
					__CLOVER_66_0.cloverRec.S[8656]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2115]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2115]==0&false))) {{
						
									__CLOVER_66_0.cloverRec.S[8657]++;if((((trouve) && (++__CLOVER_66_0.cloverRec.CT[2116]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2116]==0&false)))
										{__CLOVER_66_0.cloverRec.S[8658]++;a=new Assert(i.getText(),e);
									}else
										{__CLOVER_66_0.cloverRec.S[8659]++;a=new Assert(e);
									}__CLOVER_66_0.cloverRec.S[8660]++;res.addElement(a);
								
					}
				}}
				}else {{
					__CLOVER_66_0.cloverRec.S[8661]++;break _loop288;
				}
				
			}} }while (true);
			}
			__CLOVER_66_0.cloverRec.S[8662]++;liste_assert_AST = (tinyeiffel.compiler.ASTDefaut)currentAST.root;
		}
		catch (RecognitionException ex) {
			__CLOVER_66_0.cloverRec.S[8663]++;if ((((inputState.guessing==0) && (++__CLOVER_66_0.cloverRec.CT[2117]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2117]==0&false))) {{
				
						__CLOVER_66_0.cloverRec.S[8664]++;logging.erreur(new ErreurSource("Erreur dans la liste d'assertion",ex.getLine(),
									ex.getColumn(),ex.getFilename()));
					
			} }else {{
				__CLOVER_66_0.cloverRec.S[8665]++;throw ex;
			}
		}}
		__CLOVER_66_0.cloverRec.S[8666]++;returnAST = liste_assert_AST;
		__CLOVER_66_0.cloverRec.S[8667]++;return res;
	}
	
	public final NomFeature  nom_feature() throws RecognitionException, TokenStreamException {__CLOVER_66_0.cloverRec.M[549]++;
		__CLOVER_66_0.cloverRec.S[8668]++;NomFeature res=null;
		
		__CLOVER_66_0.cloverRec.S[8669]++;returnAST = null;
		__CLOVER_66_0.cloverRec.S[8670]++;ASTPair currentAST = new ASTPair();
		__CLOVER_66_0.cloverRec.S[8671]++;tinyeiffel.compiler.ASTDefaut nom_feature_AST = null;
		__CLOVER_66_0.cloverRec.S[8672]++;Token  id = null;
		__CLOVER_66_0.cloverRec.S[8673]++;tinyeiffel.compiler.ASTDefaut id_AST = null;
		__CLOVER_66_0.cloverRec.S[8674]++;Token  in = null;
		__CLOVER_66_0.cloverRec.S[8675]++;tinyeiffel.compiler.ASTDefaut in_AST = null;
		__CLOVER_66_0.cloverRec.S[8676]++;Token  pre = null;
		__CLOVER_66_0.cloverRec.S[8677]++;tinyeiffel.compiler.ASTDefaut pre_AST = null;
		
		__CLOVER_66_0.cloverRec.S[8678]++;Chaine s1;
		
		
		__CLOVER_66_0.cloverRec.S[8679]++;try {      // for error handling
			__CLOVER_66_0.cloverRec.S[8680]++;boolean __CLOVER_bool33=false;switch ( LA(1)) {
			case ID:if (!__CLOVER_bool33) {__CLOVER_66_0.cloverRec.S[8681]++;__CLOVER_bool33=true;}
			{
				__CLOVER_66_0.cloverRec.S[8682]++;id = LT(1);
				__CLOVER_66_0.cloverRec.S[8683]++;id_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(id);
				__CLOVER_66_0.cloverRec.S[8684]++;astFactory.addASTChild(currentAST, id_AST);
				__CLOVER_66_0.cloverRec.S[8685]++;match(ID);
				__CLOVER_66_0.cloverRec.S[8686]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2118]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2118]==0&false))) {{
					
													__CLOVER_66_0.cloverRec.S[8687]++;res=new NomFeature(id.getText());
													__CLOVER_66_0.cloverRec.S[8688]++;res.set_token(remplitToken(id),null);
												
				}
				}__CLOVER_66_0.cloverRec.S[8689]++;nom_feature_AST = (tinyeiffel.compiler.ASTDefaut)currentAST.root;
				__CLOVER_66_0.cloverRec.S[8690]++;break;
			}
			case INFIX:if (!__CLOVER_bool33) {__CLOVER_66_0.cloverRec.S[8691]++;__CLOVER_bool33=true;}
			{
				__CLOVER_66_0.cloverRec.S[8692]++;in = LT(1);
				__CLOVER_66_0.cloverRec.S[8693]++;in_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(in);
				__CLOVER_66_0.cloverRec.S[8694]++;astFactory.addASTChild(currentAST, in_AST);
				__CLOVER_66_0.cloverRec.S[8695]++;match(INFIX);
				__CLOVER_66_0.cloverRec.S[8696]++;s1=string();
				__CLOVER_66_0.cloverRec.S[8697]++;astFactory.addASTChild(currentAST, returnAST);
				__CLOVER_66_0.cloverRec.S[8698]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2119]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2119]==0&false))) {{
					
													__CLOVER_66_0.cloverRec.S[8699]++;res=new NomFeature(s1);__CLOVER_66_0.cloverRec.S[8700]++;res.infix=true;
													__CLOVER_66_0.cloverRec.S[8701]++;res.set_token(null,remplitToken(in));
												
				}
				}__CLOVER_66_0.cloverRec.S[8702]++;nom_feature_AST = (tinyeiffel.compiler.ASTDefaut)currentAST.root;
				__CLOVER_66_0.cloverRec.S[8703]++;break;
			}
			case PREFIX:if (!__CLOVER_bool33) {__CLOVER_66_0.cloverRec.S[8704]++;__CLOVER_bool33=true;}
			{
				__CLOVER_66_0.cloverRec.S[8705]++;pre = LT(1);
				__CLOVER_66_0.cloverRec.S[8706]++;pre_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(pre);
				__CLOVER_66_0.cloverRec.S[8707]++;astFactory.addASTChild(currentAST, pre_AST);
				__CLOVER_66_0.cloverRec.S[8708]++;match(PREFIX);
				__CLOVER_66_0.cloverRec.S[8709]++;s1=string();
				__CLOVER_66_0.cloverRec.S[8710]++;astFactory.addASTChild(currentAST, returnAST);
				__CLOVER_66_0.cloverRec.S[8711]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2120]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2120]==0&false))) {{
					
													__CLOVER_66_0.cloverRec.S[8712]++;res=new NomFeature(s1);__CLOVER_66_0.cloverRec.S[8713]++;res.prefix=true;
													__CLOVER_66_0.cloverRec.S[8714]++;res.set_token(null,remplitToken(pre));
												
				}
				}__CLOVER_66_0.cloverRec.S[8715]++;nom_feature_AST = (tinyeiffel.compiler.ASTDefaut)currentAST.root;
				__CLOVER_66_0.cloverRec.S[8716]++;break;
			}
			default:if (!__CLOVER_bool33) {__CLOVER_66_0.cloverRec.S[8717]++;__CLOVER_bool33=true;}
			{
				__CLOVER_66_0.cloverRec.S[8718]++;throw new NoViableAltException(LT(1), getFilename());
			}
			}
		}
		catch (RecognitionException ex) {
			__CLOVER_66_0.cloverRec.S[8719]++;if ((((inputState.guessing==0) && (++__CLOVER_66_0.cloverRec.CT[2121]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2121]==0&false))) {{
				
						__CLOVER_66_0.cloverRec.S[8720]++;logging.erreur(new ErreurSource("Erreur dans le nom d'attribut",ex.getLine(),
									ex.getColumn(),ex.getFilename()));
					
			} }else {{
				__CLOVER_66_0.cloverRec.S[8721]++;throw ex;
			}
		}}
		__CLOVER_66_0.cloverRec.S[8722]++;returnAST = nom_feature_AST;
		__CLOVER_66_0.cloverRec.S[8723]++;return res;
	}
	
	public final Type  decl_type() throws RecognitionException, TokenStreamException {__CLOVER_66_0.cloverRec.M[550]++;
		__CLOVER_66_0.cloverRec.S[8724]++;Type res=null;
		
		__CLOVER_66_0.cloverRec.S[8725]++;returnAST = null;
		__CLOVER_66_0.cloverRec.S[8726]++;ASTPair currentAST = new ASTPair();
		__CLOVER_66_0.cloverRec.S[8727]++;tinyeiffel.compiler.ASTDefaut decl_type_AST = null;
		__CLOVER_66_0.cloverRec.S[8728]++;Token  id = null;
		__CLOVER_66_0.cloverRec.S[8729]++;tinyeiffel.compiler.ASTDefaut id_AST = null;
		__CLOVER_66_0.cloverRec.S[8730]++;Token  co = null;
		__CLOVER_66_0.cloverRec.S[8731]++;tinyeiffel.compiler.ASTDefaut co_AST = null;
		__CLOVER_66_0.cloverRec.S[8732]++;Token  cf = null;
		__CLOVER_66_0.cloverRec.S[8733]++;tinyeiffel.compiler.ASTDefaut cf_AST = null;
		
		__CLOVER_66_0.cloverRec.S[8734]++;Vector t=new Vector();
		__CLOVER_66_0.cloverRec.S[8735]++;Type t2;
		__CLOVER_66_0.cloverRec.S[8736]++;boolean expanded=false;
		
		
		__CLOVER_66_0.cloverRec.S[8737]++;try {      // for error handling
			{
			__CLOVER_66_0.cloverRec.S[8738]++;boolean __CLOVER_bool34=false;switch ( LA(1)) {
			case EXPANDED:if (!__CLOVER_bool34) {__CLOVER_66_0.cloverRec.S[8739]++;__CLOVER_bool34=true;}
			{
				__CLOVER_66_0.cloverRec.S[8740]++;tinyeiffel.compiler.ASTDefaut tmp46_AST = null;
				__CLOVER_66_0.cloverRec.S[8741]++;tmp46_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(LT(1));
				__CLOVER_66_0.cloverRec.S[8742]++;astFactory.addASTChild(currentAST, tmp46_AST);
				__CLOVER_66_0.cloverRec.S[8743]++;match(EXPANDED);
				__CLOVER_66_0.cloverRec.S[8744]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2122]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2122]==0&false))) {{
					__CLOVER_66_0.cloverRec.S[8745]++;expanded=true;
				}
				}__CLOVER_66_0.cloverRec.S[8746]++;break;
			}
			case ID:if (!__CLOVER_bool34) {__CLOVER_66_0.cloverRec.S[8747]++;__CLOVER_bool34=true;}
			{
				__CLOVER_66_0.cloverRec.S[8748]++;break;
			}
			default:if (!__CLOVER_bool34) {__CLOVER_66_0.cloverRec.S[8749]++;__CLOVER_bool34=true;}
			{
				__CLOVER_66_0.cloverRec.S[8750]++;throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			__CLOVER_66_0.cloverRec.S[8751]++;id = LT(1);
			__CLOVER_66_0.cloverRec.S[8752]++;id_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(id);
			__CLOVER_66_0.cloverRec.S[8753]++;astFactory.addASTChild(currentAST, id_AST);
			__CLOVER_66_0.cloverRec.S[8754]++;match(ID);
			{
			__CLOVER_66_0.cloverRec.S[8755]++;boolean __CLOVER_bool35=false;switch ( LA(1)) {
			case CROCHETO:if (!__CLOVER_bool35) {__CLOVER_66_0.cloverRec.S[8756]++;__CLOVER_bool35=true;}
			{
				__CLOVER_66_0.cloverRec.S[8757]++;co = LT(1);
				__CLOVER_66_0.cloverRec.S[8758]++;co_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(co);
				__CLOVER_66_0.cloverRec.S[8759]++;astFactory.addASTChild(currentAST, co_AST);
				__CLOVER_66_0.cloverRec.S[8760]++;match(CROCHETO);
				{
				__CLOVER_66_0.cloverRec.S[8761]++;boolean __CLOVER_bool36=false;switch ( LA(1)) {
				case EXPANDED:if (!__CLOVER_bool36) {__CLOVER_66_0.cloverRec.S[8762]++;__CLOVER_bool36=true;}
				case ID:if (!__CLOVER_bool36) {__CLOVER_66_0.cloverRec.S[8763]++;__CLOVER_bool36=true;}
				{
					__CLOVER_66_0.cloverRec.S[8764]++;t2=type2();
					__CLOVER_66_0.cloverRec.S[8765]++;astFactory.addASTChild(currentAST, returnAST);
					__CLOVER_66_0.cloverRec.S[8766]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2123]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2123]==0&false))) {{
						__CLOVER_66_0.cloverRec.S[8767]++;t.addElement(t2);
					}
					}{
					__CLOVER_66_0.cloverRec.S[8768]++;_loop87:
					do {{
						__CLOVER_66_0.cloverRec.S[8769]++;if (((((LA(1)==VIRGULE)) && (++__CLOVER_66_0.cloverRec.CT[2124]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2124]==0&false))) {{
							__CLOVER_66_0.cloverRec.S[8770]++;tinyeiffel.compiler.ASTDefaut tmp47_AST = null;
							__CLOVER_66_0.cloverRec.S[8771]++;tmp47_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(LT(1));
							__CLOVER_66_0.cloverRec.S[8772]++;astFactory.addASTChild(currentAST, tmp47_AST);
							__CLOVER_66_0.cloverRec.S[8773]++;match(VIRGULE);
							__CLOVER_66_0.cloverRec.S[8774]++;t2=type2();
							__CLOVER_66_0.cloverRec.S[8775]++;astFactory.addASTChild(currentAST, returnAST);
							__CLOVER_66_0.cloverRec.S[8776]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2125]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2125]==0&false))) {{
								__CLOVER_66_0.cloverRec.S[8777]++;t.addElement(t2);
							}
						}}
						}else {{
							__CLOVER_66_0.cloverRec.S[8778]++;break _loop87;
						}
						
					}} }while (true);
					}
					__CLOVER_66_0.cloverRec.S[8779]++;break;
				}
				case CROCHETF:if (!__CLOVER_bool36) {__CLOVER_66_0.cloverRec.S[8780]++;__CLOVER_bool36=true;}
				{
					__CLOVER_66_0.cloverRec.S[8781]++;break;
				}
				default:if (!__CLOVER_bool36) {__CLOVER_66_0.cloverRec.S[8782]++;__CLOVER_bool36=true;}
				{
					__CLOVER_66_0.cloverRec.S[8783]++;throw new NoViableAltException(LT(1), getFilename());
				}
				}
				}
				__CLOVER_66_0.cloverRec.S[8784]++;cf = LT(1);
				__CLOVER_66_0.cloverRec.S[8785]++;cf_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(cf);
				__CLOVER_66_0.cloverRec.S[8786]++;astFactory.addASTChild(currentAST, cf_AST);
				__CLOVER_66_0.cloverRec.S[8787]++;match(CROCHETF);
				__CLOVER_66_0.cloverRec.S[8788]++;break;
			}
			case OBSOLETE:if (!__CLOVER_bool35) {__CLOVER_66_0.cloverRec.S[8789]++;__CLOVER_bool35=true;}
			case FEATURE:if (!__CLOVER_bool35) {__CLOVER_66_0.cloverRec.S[8790]++;__CLOVER_bool35=true;}
			case VIRGULE:if (!__CLOVER_bool35) {__CLOVER_66_0.cloverRec.S[8791]++;__CLOVER_bool35=true;}
			case INHERIT:if (!__CLOVER_bool35) {__CLOVER_66_0.cloverRec.S[8792]++;__CLOVER_bool35=true;}
			case CREATION:if (!__CLOVER_bool35) {__CLOVER_66_0.cloverRec.S[8793]++;__CLOVER_bool35=true;}
			case CROCHETF:if (!__CLOVER_bool35) {__CLOVER_66_0.cloverRec.S[8794]++;__CLOVER_bool35=true;}
			{
				__CLOVER_66_0.cloverRec.S[8795]++;break;
			}
			default:if (!__CLOVER_bool35) {__CLOVER_66_0.cloverRec.S[8796]++;__CLOVER_bool35=true;}
			{
				__CLOVER_66_0.cloverRec.S[8797]++;throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			__CLOVER_66_0.cloverRec.S[8798]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2126]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2126]==0&false))) {{
				
							__CLOVER_66_0.cloverRec.S[8799]++;res=new TypeSimple(expanded,id.getText(),t);
							__CLOVER_66_0.cloverRec.S[8800]++;res.set_token(remplitToken(id),remplitToken(co),remplitToken(cf));
						
			}
			}__CLOVER_66_0.cloverRec.S[8801]++;decl_type_AST = (tinyeiffel.compiler.ASTDefaut)currentAST.root;
		}
		catch (RecognitionException ex) {
			__CLOVER_66_0.cloverRec.S[8802]++;if ((((inputState.guessing==0) && (++__CLOVER_66_0.cloverRec.CT[2127]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2127]==0&false))) {{
				
						__CLOVER_66_0.cloverRec.S[8803]++;logging.erreur(new ErreurSource("Erreur dans le type declare",ex.getLine(),
									ex.getColumn(),ex.getFilename()));
					
			} }else {{
				__CLOVER_66_0.cloverRec.S[8804]++;throw ex;
			}
		}}
		__CLOVER_66_0.cloverRec.S[8805]++;returnAST = decl_type_AST;
		__CLOVER_66_0.cloverRec.S[8806]++;return res;
	}
	
	public final NomFeature  nom_feature0() throws RecognitionException, TokenStreamException {__CLOVER_66_0.cloverRec.M[551]++;
		__CLOVER_66_0.cloverRec.S[8807]++;NomFeature res=null;
		
		__CLOVER_66_0.cloverRec.S[8808]++;returnAST = null;
		__CLOVER_66_0.cloverRec.S[8809]++;ASTPair currentAST = new ASTPair();
		__CLOVER_66_0.cloverRec.S[8810]++;tinyeiffel.compiler.ASTDefaut nom_feature0_AST = null;
		
		__CLOVER_66_0.cloverRec.S[8811]++;try {      // for error handling
			__CLOVER_66_0.cloverRec.S[8812]++;tinyeiffel.compiler.ASTDefaut tmp48_AST = null;
			__CLOVER_66_0.cloverRec.S[8813]++;tmp48_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(LT(1));
			__CLOVER_66_0.cloverRec.S[8814]++;astFactory.addASTChild(currentAST, tmp48_AST);
			__CLOVER_66_0.cloverRec.S[8815]++;match(LPAREN);
			__CLOVER_66_0.cloverRec.S[8816]++;res=nom_feature();
			__CLOVER_66_0.cloverRec.S[8817]++;astFactory.addASTChild(currentAST, returnAST);
			__CLOVER_66_0.cloverRec.S[8818]++;tinyeiffel.compiler.ASTDefaut tmp49_AST = null;
			__CLOVER_66_0.cloverRec.S[8819]++;tmp49_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(LT(1));
			__CLOVER_66_0.cloverRec.S[8820]++;astFactory.addASTChild(currentAST, tmp49_AST);
			__CLOVER_66_0.cloverRec.S[8821]++;match(RPAREN);
			__CLOVER_66_0.cloverRec.S[8822]++;nom_feature0_AST = (tinyeiffel.compiler.ASTDefaut)currentAST.root;
		}
		catch (RecognitionException ex) {
			__CLOVER_66_0.cloverRec.S[8823]++;if ((((inputState.guessing==0) && (++__CLOVER_66_0.cloverRec.CT[2128]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2128]==0&false))) {{
				__CLOVER_66_0.cloverRec.S[8824]++;reportError(ex);
				__CLOVER_66_0.cloverRec.S[8825]++;consume();
				__CLOVER_66_0.cloverRec.S[8826]++;consumeUntil(_tokenSet_8);
			} }else {{
			  __CLOVER_66_0.cloverRec.S[8827]++;throw ex;
			}
		}}
		__CLOVER_66_0.cloverRec.S[8828]++;returnAST = nom_feature0_AST;
		__CLOVER_66_0.cloverRec.S[8829]++;return res;
	}
	
	public final Type  type2() throws RecognitionException, TokenStreamException {__CLOVER_66_0.cloverRec.M[552]++;
		__CLOVER_66_0.cloverRec.S[8830]++;Type res=null;
		
		__CLOVER_66_0.cloverRec.S[8831]++;returnAST = null;
		__CLOVER_66_0.cloverRec.S[8832]++;ASTPair currentAST = new ASTPair();
		__CLOVER_66_0.cloverRec.S[8833]++;tinyeiffel.compiler.ASTDefaut type2_AST = null;
		__CLOVER_66_0.cloverRec.S[8834]++;Token  id = null;
		__CLOVER_66_0.cloverRec.S[8835]++;tinyeiffel.compiler.ASTDefaut id_AST = null;
		__CLOVER_66_0.cloverRec.S[8836]++;Token  f = null;
		__CLOVER_66_0.cloverRec.S[8837]++;tinyeiffel.compiler.ASTDefaut f_AST = null;
		
		__CLOVER_66_0.cloverRec.S[8838]++;Vector t=new Vector();
		__CLOVER_66_0.cloverRec.S[8839]++;Type t2;
		__CLOVER_66_0.cloverRec.S[8840]++;boolean expanded=false;
		
		
		__CLOVER_66_0.cloverRec.S[8841]++;try {      // for error handling
			{
			__CLOVER_66_0.cloverRec.S[8842]++;boolean __CLOVER_bool37=false;switch ( LA(1)) {
			case EXPANDED:if (!__CLOVER_bool37) {__CLOVER_66_0.cloverRec.S[8843]++;__CLOVER_bool37=true;}
			{
				__CLOVER_66_0.cloverRec.S[8844]++;tinyeiffel.compiler.ASTDefaut tmp50_AST = null;
				__CLOVER_66_0.cloverRec.S[8845]++;tmp50_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(LT(1));
				__CLOVER_66_0.cloverRec.S[8846]++;astFactory.addASTChild(currentAST, tmp50_AST);
				__CLOVER_66_0.cloverRec.S[8847]++;match(EXPANDED);
				__CLOVER_66_0.cloverRec.S[8848]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2129]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2129]==0&false))) {{
					__CLOVER_66_0.cloverRec.S[8849]++;expanded=true;
				}
				}__CLOVER_66_0.cloverRec.S[8850]++;break;
			}
			case ID:if (!__CLOVER_bool37) {__CLOVER_66_0.cloverRec.S[8851]++;__CLOVER_bool37=true;}
			{
				__CLOVER_66_0.cloverRec.S[8852]++;break;
			}
			default:if (!__CLOVER_bool37) {__CLOVER_66_0.cloverRec.S[8853]++;__CLOVER_bool37=true;}
			{
				__CLOVER_66_0.cloverRec.S[8854]++;throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			__CLOVER_66_0.cloverRec.S[8855]++;id = LT(1);
			__CLOVER_66_0.cloverRec.S[8856]++;id_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(id);
			__CLOVER_66_0.cloverRec.S[8857]++;astFactory.addASTChild(currentAST, id_AST);
			__CLOVER_66_0.cloverRec.S[8858]++;match(ID);
			{
			__CLOVER_66_0.cloverRec.S[8859]++;boolean __CLOVER_bool38=false;switch ( LA(1)) {
			case FLECHED:if (!__CLOVER_bool38) {__CLOVER_66_0.cloverRec.S[8860]++;__CLOVER_bool38=true;}
			{
				__CLOVER_66_0.cloverRec.S[8861]++;f = LT(1);
				__CLOVER_66_0.cloverRec.S[8862]++;f_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(f);
				__CLOVER_66_0.cloverRec.S[8863]++;astFactory.addASTChild(currentAST, f_AST);
				__CLOVER_66_0.cloverRec.S[8864]++;match(FLECHED);
				__CLOVER_66_0.cloverRec.S[8865]++;t2=decl_type();
				__CLOVER_66_0.cloverRec.S[8866]++;astFactory.addASTChild(currentAST, returnAST);
				__CLOVER_66_0.cloverRec.S[8867]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2130]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2130]==0&false))) {{
					__CLOVER_66_0.cloverRec.S[8868]++;t.addElement(t2);
				}
				}__CLOVER_66_0.cloverRec.S[8869]++;break;
			}
			case VIRGULE:if (!__CLOVER_bool38) {__CLOVER_66_0.cloverRec.S[8870]++;__CLOVER_bool38=true;}
			case CROCHETF:if (!__CLOVER_bool38) {__CLOVER_66_0.cloverRec.S[8871]++;__CLOVER_bool38=true;}
			{
				__CLOVER_66_0.cloverRec.S[8872]++;break;
			}
			default:if (!__CLOVER_bool38) {__CLOVER_66_0.cloverRec.S[8873]++;__CLOVER_bool38=true;}
			{
				__CLOVER_66_0.cloverRec.S[8874]++;throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			__CLOVER_66_0.cloverRec.S[8875]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2131]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2131]==0&false))) {{
				
							__CLOVER_66_0.cloverRec.S[8876]++;res=new TypeSimple(expanded,id.getText(),t);__CLOVER_66_0.cloverRec.S[8877]++;res.is_from=true;
							__CLOVER_66_0.cloverRec.S[8878]++;res.set_token(remplitToken(id),remplitToken(f));
						
			}
			}__CLOVER_66_0.cloverRec.S[8879]++;type2_AST = (tinyeiffel.compiler.ASTDefaut)currentAST.root;
		}
		catch (RecognitionException ex) {
			__CLOVER_66_0.cloverRec.S[8880]++;if ((((inputState.guessing==0) && (++__CLOVER_66_0.cloverRec.CT[2132]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2132]==0&false))) {{
				
						__CLOVER_66_0.cloverRec.S[8881]++;logging.erreur(new ErreurSource("Erreur dans le type",ex.getLine(),
									ex.getColumn(),ex.getFilename()));
					
			} }else {{
				__CLOVER_66_0.cloverRec.S[8882]++;throw ex;
			}
		}}
		__CLOVER_66_0.cloverRec.S[8883]++;returnAST = type2_AST;
		__CLOVER_66_0.cloverRec.S[8884]++;return res;
	}
	
	public final Expr  expr() throws RecognitionException, TokenStreamException {__CLOVER_66_0.cloverRec.M[553]++;
		__CLOVER_66_0.cloverRec.S[8885]++;Expr e=null;
		
		__CLOVER_66_0.cloverRec.S[8886]++;returnAST = null;
		__CLOVER_66_0.cloverRec.S[8887]++;ASTPair currentAST = new ASTPair();
		__CLOVER_66_0.cloverRec.S[8888]++;tinyeiffel.compiler.ASTDefaut expr_AST = null;
		
		__CLOVER_66_0.cloverRec.S[8889]++;Expr e1=null;
		
		
		__CLOVER_66_0.cloverRec.S[8890]++;try {      // for error handling
			__CLOVER_66_0.cloverRec.S[8891]++;e1=expr17();
			__CLOVER_66_0.cloverRec.S[8892]++;astFactory.addASTChild(currentAST, returnAST);
			__CLOVER_66_0.cloverRec.S[8893]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2133]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2133]==0&false))) {{
				__CLOVER_66_0.cloverRec.S[8894]++;e=e1;
			}
			}__CLOVER_66_0.cloverRec.S[8895]++;expr_AST = (tinyeiffel.compiler.ASTDefaut)currentAST.root;
		}
		catch (RecognitionException ex) {
			__CLOVER_66_0.cloverRec.S[8896]++;if ((((inputState.guessing==0) && (++__CLOVER_66_0.cloverRec.CT[2134]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2134]==0&false))) {{
				
						__CLOVER_66_0.cloverRec.S[8897]++;logging.erreur(new ErreurSource("Erreur dans l'expression",ex.getLine(),
									ex.getColumn(),ex.getFilename()));
					
			} }else {{
				__CLOVER_66_0.cloverRec.S[8898]++;throw ex;
			}
		}}
		__CLOVER_66_0.cloverRec.S[8899]++;returnAST = expr_AST;
		__CLOVER_66_0.cloverRec.S[8900]++;return e;
	}
	
	public final Type  type0() throws RecognitionException, TokenStreamException {__CLOVER_66_0.cloverRec.M[554]++;
		__CLOVER_66_0.cloverRec.S[8901]++;Type res=null;
		
		__CLOVER_66_0.cloverRec.S[8902]++;returnAST = null;
		__CLOVER_66_0.cloverRec.S[8903]++;ASTPair currentAST = new ASTPair();
		__CLOVER_66_0.cloverRec.S[8904]++;tinyeiffel.compiler.ASTDefaut type0_AST = null;
		
		__CLOVER_66_0.cloverRec.S[8905]++;try {      // for error handling
			__CLOVER_66_0.cloverRec.S[8906]++;tinyeiffel.compiler.ASTDefaut tmp51_AST = null;
			__CLOVER_66_0.cloverRec.S[8907]++;tmp51_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(LT(1));
			__CLOVER_66_0.cloverRec.S[8908]++;astFactory.addASTChild(currentAST, tmp51_AST);
			__CLOVER_66_0.cloverRec.S[8909]++;match(LPAREN);
			__CLOVER_66_0.cloverRec.S[8910]++;res=type();
			__CLOVER_66_0.cloverRec.S[8911]++;astFactory.addASTChild(currentAST, returnAST);
			__CLOVER_66_0.cloverRec.S[8912]++;tinyeiffel.compiler.ASTDefaut tmp52_AST = null;
			__CLOVER_66_0.cloverRec.S[8913]++;tmp52_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(LT(1));
			__CLOVER_66_0.cloverRec.S[8914]++;astFactory.addASTChild(currentAST, tmp52_AST);
			__CLOVER_66_0.cloverRec.S[8915]++;match(RPAREN);
			__CLOVER_66_0.cloverRec.S[8916]++;type0_AST = (tinyeiffel.compiler.ASTDefaut)currentAST.root;
		}
		catch (RecognitionException ex) {
			__CLOVER_66_0.cloverRec.S[8917]++;if ((((inputState.guessing==0) && (++__CLOVER_66_0.cloverRec.CT[2135]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2135]==0&false))) {{
				__CLOVER_66_0.cloverRec.S[8918]++;reportError(ex);
				__CLOVER_66_0.cloverRec.S[8919]++;consume();
				__CLOVER_66_0.cloverRec.S[8920]++;consumeUntil(_tokenSet_8);
			} }else {{
			  __CLOVER_66_0.cloverRec.S[8921]++;throw ex;
			}
		}}
		__CLOVER_66_0.cloverRec.S[8922]++;returnAST = type0_AST;
		__CLOVER_66_0.cloverRec.S[8923]++;return res;
	}
	
	public final Vector  decl_param() throws RecognitionException, TokenStreamException {__CLOVER_66_0.cloverRec.M[555]++;
		__CLOVER_66_0.cloverRec.S[8924]++;Vector res=new Vector();
		
		__CLOVER_66_0.cloverRec.S[8925]++;returnAST = null;
		__CLOVER_66_0.cloverRec.S[8926]++;ASTPair currentAST = new ASTPair();
		__CLOVER_66_0.cloverRec.S[8927]++;tinyeiffel.compiler.ASTDefaut decl_param_AST = null;
		__CLOVER_66_0.cloverRec.S[8928]++;Token  i = null;
		__CLOVER_66_0.cloverRec.S[8929]++;tinyeiffel.compiler.ASTDefaut i_AST = null;
		__CLOVER_66_0.cloverRec.S[8930]++;Token  j = null;
		__CLOVER_66_0.cloverRec.S[8931]++;tinyeiffel.compiler.ASTDefaut j_AST = null;
		
		__CLOVER_66_0.cloverRec.S[8932]++;DeclareVar p;
		__CLOVER_66_0.cloverRec.S[8933]++;Vector v=new Vector();
		__CLOVER_66_0.cloverRec.S[8934]++;int i0;
		__CLOVER_66_0.cloverRec.S[8935]++;Type t;
		
		
		__CLOVER_66_0.cloverRec.S[8936]++;try {      // for error handling
			__CLOVER_66_0.cloverRec.S[8937]++;tinyeiffel.compiler.ASTDefaut tmp53_AST = null;
			__CLOVER_66_0.cloverRec.S[8938]++;tmp53_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(LT(1));
			__CLOVER_66_0.cloverRec.S[8939]++;astFactory.makeASTRoot(currentAST, tmp53_AST);
			__CLOVER_66_0.cloverRec.S[8940]++;match(LPAREN);
			{
			__CLOVER_66_0.cloverRec.S[8941]++;boolean __CLOVER_bool39=false;switch ( LA(1)) {
			case ID:if (!__CLOVER_bool39) {__CLOVER_66_0.cloverRec.S[8942]++;__CLOVER_bool39=true;}
			{
				{
				__CLOVER_66_0.cloverRec.S[8943]++;int _cnt116=0;
				__CLOVER_66_0.cloverRec.S[8944]++;_loop116:
				do {{
					__CLOVER_66_0.cloverRec.S[8945]++;if (((((LA(1)==ID)) && (++__CLOVER_66_0.cloverRec.CT[2136]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2136]==0&false))) {{
						__CLOVER_66_0.cloverRec.S[8946]++;i = LT(1);
						__CLOVER_66_0.cloverRec.S[8947]++;i_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(i);
						__CLOVER_66_0.cloverRec.S[8948]++;astFactory.addASTChild(currentAST, i_AST);
						__CLOVER_66_0.cloverRec.S[8949]++;match(ID);
						__CLOVER_66_0.cloverRec.S[8950]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2137]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2137]==0&false))) {{
							__CLOVER_66_0.cloverRec.S[8951]++;v=new Vector();__CLOVER_66_0.cloverRec.S[8952]++;v.addElement(i);
						}
						}{
						__CLOVER_66_0.cloverRec.S[8953]++;_loop114:
						do {{
							__CLOVER_66_0.cloverRec.S[8954]++;if (((((LA(1)==VIRGULE)) && (++__CLOVER_66_0.cloverRec.CT[2138]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2138]==0&false))) {{
								__CLOVER_66_0.cloverRec.S[8955]++;match(VIRGULE);
								__CLOVER_66_0.cloverRec.S[8956]++;j = LT(1);
								__CLOVER_66_0.cloverRec.S[8957]++;j_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(j);
								__CLOVER_66_0.cloverRec.S[8958]++;astFactory.addASTChild(currentAST, j_AST);
								__CLOVER_66_0.cloverRec.S[8959]++;match(ID);
								__CLOVER_66_0.cloverRec.S[8960]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2139]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2139]==0&false))) {{
									__CLOVER_66_0.cloverRec.S[8961]++;v.addElement(j);
								}
							}}
							}else {{
								__CLOVER_66_0.cloverRec.S[8962]++;break _loop114;
							}
							
						}} }while (true);
						}
						__CLOVER_66_0.cloverRec.S[8963]++;tinyeiffel.compiler.ASTDefaut tmp55_AST = null;
						__CLOVER_66_0.cloverRec.S[8964]++;tmp55_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(LT(1));
						__CLOVER_66_0.cloverRec.S[8965]++;astFactory.addASTChild(currentAST, tmp55_AST);
						__CLOVER_66_0.cloverRec.S[8966]++;match(DOUBLE_POINT);
						__CLOVER_66_0.cloverRec.S[8967]++;t=type();
						__CLOVER_66_0.cloverRec.S[8968]++;astFactory.addASTChild(currentAST, returnAST);
						__CLOVER_66_0.cloverRec.S[8969]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2140]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2140]==0&false))) {{
							
												__CLOVER_66_0.cloverRec.S[8970]++;for(i0=0;(((i0<v.size()) && (++__CLOVER_66_0.cloverRec.CT[2141]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2141]==0&false));i0++)
												{{
													__CLOVER_66_0.cloverRec.S[8971]++;p=new DeclareVar(((Token)v.elementAt(i0)).getText(),t);
													__CLOVER_66_0.cloverRec.S[8972]++;p.set_token(remplitToken((Token)v.elementAt(i0)));
													__CLOVER_66_0.cloverRec.S[8973]++;res.addElement(p);
												}
												}__CLOVER_66_0.cloverRec.S[8974]++;ajoute_type(t);
											
						}
						}{
						__CLOVER_66_0.cloverRec.S[8975]++;boolean __CLOVER_bool40=false;switch ( LA(1)) {
						case SEMI:if (!__CLOVER_bool40) {__CLOVER_66_0.cloverRec.S[8976]++;__CLOVER_bool40=true;}
						{
							__CLOVER_66_0.cloverRec.S[8977]++;tinyeiffel.compiler.ASTDefaut tmp56_AST = null;
							__CLOVER_66_0.cloverRec.S[8978]++;tmp56_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(LT(1));
							__CLOVER_66_0.cloverRec.S[8979]++;astFactory.addASTChild(currentAST, tmp56_AST);
							__CLOVER_66_0.cloverRec.S[8980]++;match(SEMI);
							__CLOVER_66_0.cloverRec.S[8981]++;break;
						}
						case ID:if (!__CLOVER_bool40) {__CLOVER_66_0.cloverRec.S[8982]++;__CLOVER_bool40=true;}
						case RPAREN:if (!__CLOVER_bool40) {__CLOVER_66_0.cloverRec.S[8983]++;__CLOVER_bool40=true;}
						{
							__CLOVER_66_0.cloverRec.S[8984]++;break;
						}
						default:if (!__CLOVER_bool40) {__CLOVER_66_0.cloverRec.S[8985]++;__CLOVER_bool40=true;}
						{
							__CLOVER_66_0.cloverRec.S[8986]++;throw new NoViableAltException(LT(1), getFilename());
						}
						}
						}
					}
					}else {{
						__CLOVER_66_0.cloverRec.S[8987]++;if ( (((_cnt116>=1 ) && (++__CLOVER_66_0.cloverRec.CT[2142]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2142]==0&false))) {{ __CLOVER_66_0.cloverRec.S[8988]++;break _loop116; } }else {{__CLOVER_66_0.cloverRec.S[8989]++;throw new NoViableAltException(LT(1), getFilename());}
					}}
					
					}__CLOVER_66_0.cloverRec.S[8990]++;_cnt116++;
				} }while (true);
				}
				__CLOVER_66_0.cloverRec.S[8991]++;break;
			}
			case RPAREN:if (!__CLOVER_bool39) {__CLOVER_66_0.cloverRec.S[8992]++;__CLOVER_bool39=true;}
			{
				__CLOVER_66_0.cloverRec.S[8993]++;break;
			}
			default:if (!__CLOVER_bool39) {__CLOVER_66_0.cloverRec.S[8994]++;__CLOVER_bool39=true;}
			{
				__CLOVER_66_0.cloverRec.S[8995]++;throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			__CLOVER_66_0.cloverRec.S[8996]++;tinyeiffel.compiler.ASTDefaut tmp57_AST = null;
			__CLOVER_66_0.cloverRec.S[8997]++;tmp57_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(LT(1));
			__CLOVER_66_0.cloverRec.S[8998]++;astFactory.addASTChild(currentAST, tmp57_AST);
			__CLOVER_66_0.cloverRec.S[8999]++;match(RPAREN);
			__CLOVER_66_0.cloverRec.S[9000]++;decl_param_AST = (tinyeiffel.compiler.ASTDefaut)currentAST.root;
		}
		catch (RecognitionException ex) {
			__CLOVER_66_0.cloverRec.S[9001]++;if ((((inputState.guessing==0) && (++__CLOVER_66_0.cloverRec.CT[2143]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2143]==0&false))) {{
				
						__CLOVER_66_0.cloverRec.S[9002]++;logging.erreur(new ErreurSource("Erreur dans la declaration des parametres",ex.getLine(),
									ex.getColumn(),ex.getFilename()));
					
			} }else {{
				__CLOVER_66_0.cloverRec.S[9003]++;throw ex;
			}
		}}
		__CLOVER_66_0.cloverRec.S[9004]++;returnAST = decl_param_AST;
		__CLOVER_66_0.cloverRec.S[9005]++;return res;
	}
	
	public final Feature  corps() throws RecognitionException, TokenStreamException {__CLOVER_66_0.cloverRec.M[556]++;
		__CLOVER_66_0.cloverRec.S[9006]++;Feature res=null;
		
		__CLOVER_66_0.cloverRec.S[9007]++;returnAST = null;
		__CLOVER_66_0.cloverRec.S[9008]++;ASTPair currentAST = new ASTPair();
		__CLOVER_66_0.cloverRec.S[9009]++;tinyeiffel.compiler.ASTDefaut corps_AST = null;
		__CLOVER_66_0.cloverRec.S[9010]++;Token  obs = null;
		__CLOVER_66_0.cloverRec.S[9011]++;tinyeiffel.compiler.ASTDefaut obs_AST = null;
		__CLOVER_66_0.cloverRec.S[9012]++;Token  req = null;
		__CLOVER_66_0.cloverRec.S[9013]++;tinyeiffel.compiler.ASTDefaut req_AST = null;
		__CLOVER_66_0.cloverRec.S[9014]++;Token  ens = null;
		__CLOVER_66_0.cloverRec.S[9015]++;tinyeiffel.compiler.ASTDefaut ens_AST = null;
		__CLOVER_66_0.cloverRec.S[9016]++;Token  resc = null;
		__CLOVER_66_0.cloverRec.S[9017]++;tinyeiffel.compiler.ASTDefaut resc_AST = null;
		__CLOVER_66_0.cloverRec.S[9018]++;Token  uni = null;
		__CLOVER_66_0.cloverRec.S[9019]++;tinyeiffel.compiler.ASTDefaut uni_AST = null;
		
		__CLOVER_66_0.cloverRec.S[9020]++;Feature c=null;
		__CLOVER_66_0.cloverRec.S[9021]++;Expr e;
		__CLOVER_66_0.cloverRec.S[9022]++;Vector l1=new Vector(),l2=new Vector(),l3=new Vector(),l4=new Vector();
		__CLOVER_66_0.cloverRec.S[9023]++;Instr inst=null;
		__CLOVER_66_0.cloverRec.S[9024]++;Chaine obsolete=null;
		__CLOVER_66_0.cloverRec.S[9025]++;int i,debut_commentaire=dernier_commentaire(),fin_commentaire=-1;
		
		
		__CLOVER_66_0.cloverRec.S[9026]++;try {      // for error handling
			__CLOVER_66_0.cloverRec.S[9027]++;boolean __CLOVER_bool41=false;switch ( LA(1)) {
			case DEFERRED:if (!__CLOVER_bool41) {__CLOVER_66_0.cloverRec.S[9028]++;__CLOVER_bool41=true;}
			case OBSOLETE:if (!__CLOVER_bool41) {__CLOVER_66_0.cloverRec.S[9029]++;__CLOVER_bool41=true;}
			case REQUIRE:if (!__CLOVER_bool41) {__CLOVER_66_0.cloverRec.S[9030]++;__CLOVER_bool41=true;}
			case LOCAL:if (!__CLOVER_bool41) {__CLOVER_66_0.cloverRec.S[9031]++;__CLOVER_bool41=true;}
			case DO:if (!__CLOVER_bool41) {__CLOVER_66_0.cloverRec.S[9032]++;__CLOVER_bool41=true;}
			case ONCE:if (!__CLOVER_bool41) {__CLOVER_66_0.cloverRec.S[9033]++;__CLOVER_bool41=true;}
			case EXTERNAL:if (!__CLOVER_bool41) {__CLOVER_66_0.cloverRec.S[9034]++;__CLOVER_bool41=true;}
			{
				{
				__CLOVER_66_0.cloverRec.S[9035]++;boolean __CLOVER_bool42=false;switch ( LA(1)) {
				case OBSOLETE:if (!__CLOVER_bool42) {__CLOVER_66_0.cloverRec.S[9036]++;__CLOVER_bool42=true;}
				{
					__CLOVER_66_0.cloverRec.S[9037]++;obs = LT(1);
					__CLOVER_66_0.cloverRec.S[9038]++;obs_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(obs);
					__CLOVER_66_0.cloverRec.S[9039]++;astFactory.addASTChild(currentAST, obs_AST);
					__CLOVER_66_0.cloverRec.S[9040]++;match(OBSOLETE);
					__CLOVER_66_0.cloverRec.S[9041]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2144]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2144]==0&false))) {{
						
									__CLOVER_66_0.cloverRec.S[9042]++;if((((last_feature2==-1) && (++__CLOVER_66_0.cloverRec.CT[2145]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2145]==0&false))) {__CLOVER_66_0.cloverRec.S[9043]++;last_feature2=lexer.donne_dernier();
									}__CLOVER_66_0.cloverRec.S[9044]++;debut_commentaire=dernier_commentaire();
									
					}
					}__CLOVER_66_0.cloverRec.S[9045]++;obsolete=string();
					__CLOVER_66_0.cloverRec.S[9046]++;astFactory.addASTChild(currentAST, returnAST);
					__CLOVER_66_0.cloverRec.S[9047]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2146]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2146]==0&false))) {{
					}
					}__CLOVER_66_0.cloverRec.S[9048]++;break;
				}
				case DEFERRED:if (!__CLOVER_bool42) {__CLOVER_66_0.cloverRec.S[9049]++;__CLOVER_bool42=true;}
				case REQUIRE:if (!__CLOVER_bool42) {__CLOVER_66_0.cloverRec.S[9050]++;__CLOVER_bool42=true;}
				case LOCAL:if (!__CLOVER_bool42) {__CLOVER_66_0.cloverRec.S[9051]++;__CLOVER_bool42=true;}
				case DO:if (!__CLOVER_bool42) {__CLOVER_66_0.cloverRec.S[9052]++;__CLOVER_bool42=true;}
				case ONCE:if (!__CLOVER_bool42) {__CLOVER_66_0.cloverRec.S[9053]++;__CLOVER_bool42=true;}
				case EXTERNAL:if (!__CLOVER_bool42) {__CLOVER_66_0.cloverRec.S[9054]++;__CLOVER_bool42=true;}
				{
					__CLOVER_66_0.cloverRec.S[9055]++;break;
				}
				default:if (!__CLOVER_bool42) {__CLOVER_66_0.cloverRec.S[9056]++;__CLOVER_bool42=true;}
				{
					__CLOVER_66_0.cloverRec.S[9057]++;throw new NoViableAltException(LT(1), getFilename());
				}
				}
				}
				{
				__CLOVER_66_0.cloverRec.S[9058]++;boolean __CLOVER_bool43=false;switch ( LA(1)) {
				case REQUIRE:if (!__CLOVER_bool43) {__CLOVER_66_0.cloverRec.S[9059]++;__CLOVER_bool43=true;}
				{
					__CLOVER_66_0.cloverRec.S[9060]++;req = LT(1);
					__CLOVER_66_0.cloverRec.S[9061]++;req_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(req);
					__CLOVER_66_0.cloverRec.S[9062]++;astFactory.addASTChild(currentAST, req_AST);
					__CLOVER_66_0.cloverRec.S[9063]++;match(REQUIRE);
					{
					__CLOVER_66_0.cloverRec.S[9064]++;boolean __CLOVER_bool44=false;switch ( LA(1)) {
					case ELSE:if (!__CLOVER_bool44) {__CLOVER_66_0.cloverRec.S[9065]++;__CLOVER_bool44=true;}
					{
						__CLOVER_66_0.cloverRec.S[9066]++;tinyeiffel.compiler.ASTDefaut tmp58_AST = null;
						__CLOVER_66_0.cloverRec.S[9067]++;tmp58_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(LT(1));
						__CLOVER_66_0.cloverRec.S[9068]++;astFactory.addASTChild(currentAST, tmp58_AST);
						__CLOVER_66_0.cloverRec.S[9069]++;match(ELSE);
						__CLOVER_66_0.cloverRec.S[9070]++;break;
					}
					case DEFERRED:if (!__CLOVER_bool44) {__CLOVER_66_0.cloverRec.S[9071]++;__CLOVER_bool44=true;}
					case ID:if (!__CLOVER_bool44) {__CLOVER_66_0.cloverRec.S[9072]++;__CLOVER_bool44=true;}
					case STRING:if (!__CLOVER_bool44) {__CLOVER_66_0.cloverRec.S[9073]++;__CLOVER_bool44=true;}
					case LPAREN:if (!__CLOVER_bool44) {__CLOVER_66_0.cloverRec.S[9074]++;__CLOVER_bool44=true;}
					case LOCAL:if (!__CLOVER_bool44) {__CLOVER_66_0.cloverRec.S[9075]++;__CLOVER_bool44=true;}
					case DO:if (!__CLOVER_bool44) {__CLOVER_66_0.cloverRec.S[9076]++;__CLOVER_bool44=true;}
					case ONCE:if (!__CLOVER_bool44) {__CLOVER_66_0.cloverRec.S[9077]++;__CLOVER_bool44=true;}
					case EXTERNAL:if (!__CLOVER_bool44) {__CLOVER_66_0.cloverRec.S[9078]++;__CLOVER_bool44=true;}
					case INT:if (!__CLOVER_bool44) {__CLOVER_66_0.cloverRec.S[9079]++;__CLOVER_bool44=true;}
					case REAL:if (!__CLOVER_bool44) {__CLOVER_66_0.cloverRec.S[9080]++;__CLOVER_bool44=true;}
					case CHAR:if (!__CLOVER_bool44) {__CLOVER_66_0.cloverRec.S[9081]++;__CLOVER_bool44=true;}
					case PLUS:if (!__CLOVER_bool44) {__CLOVER_66_0.cloverRec.S[9082]++;__CLOVER_bool44=true;}
					case MOINS:if (!__CLOVER_bool44) {__CLOVER_66_0.cloverRec.S[9083]++;__CLOVER_bool44=true;}
					case FREEOP:if (!__CLOVER_bool44) {__CLOVER_66_0.cloverRec.S[9084]++;__CLOVER_bool44=true;}
					case OLD:if (!__CLOVER_bool44) {__CLOVER_66_0.cloverRec.S[9085]++;__CLOVER_bool44=true;}
					case NOT:if (!__CLOVER_bool44) {__CLOVER_66_0.cloverRec.S[9086]++;__CLOVER_bool44=true;}
					case DOLLARD:if (!__CLOVER_bool44) {__CLOVER_66_0.cloverRec.S[9087]++;__CLOVER_bool44=true;}
					case DEBUT_ARRAY:if (!__CLOVER_bool44) {__CLOVER_66_0.cloverRec.S[9088]++;__CLOVER_bool44=true;}
					case TRUE:if (!__CLOVER_bool44) {__CLOVER_66_0.cloverRec.S[9089]++;__CLOVER_bool44=true;}
					case FALSE:if (!__CLOVER_bool44) {__CLOVER_66_0.cloverRec.S[9090]++;__CLOVER_bool44=true;}
					case STRING2:if (!__CLOVER_bool44) {__CLOVER_66_0.cloverRec.S[9091]++;__CLOVER_bool44=true;}
					{
						__CLOVER_66_0.cloverRec.S[9092]++;break;
					}
					default:if (!__CLOVER_bool44) {__CLOVER_66_0.cloverRec.S[9093]++;__CLOVER_bool44=true;}
					{
						__CLOVER_66_0.cloverRec.S[9094]++;throw new NoViableAltException(LT(1), getFilename());
					}
					}
					}
					__CLOVER_66_0.cloverRec.S[9095]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2147]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2147]==0&false))) {{
						
									__CLOVER_66_0.cloverRec.S[9096]++;if((((last_feature2==-1) && (++__CLOVER_66_0.cloverRec.CT[2148]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2148]==0&false))) {__CLOVER_66_0.cloverRec.S[9097]++;last_feature2=lexer.donne_dernier();
									}__CLOVER_66_0.cloverRec.S[9098]++;if((((fin_commentaire==-1) && (++__CLOVER_66_0.cloverRec.CT[2149]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2149]==0&false))) {__CLOVER_66_0.cloverRec.S[9099]++;fin_commentaire=dernier_commentaire();
									
					}}
					}__CLOVER_66_0.cloverRec.S[9100]++;l1=liste_assert();
					__CLOVER_66_0.cloverRec.S[9101]++;astFactory.addASTChild(currentAST, returnAST);
					__CLOVER_66_0.cloverRec.S[9102]++;break;
				}
				case DEFERRED:if (!__CLOVER_bool43) {__CLOVER_66_0.cloverRec.S[9103]++;__CLOVER_bool43=true;}
				case LOCAL:if (!__CLOVER_bool43) {__CLOVER_66_0.cloverRec.S[9104]++;__CLOVER_bool43=true;}
				case DO:if (!__CLOVER_bool43) {__CLOVER_66_0.cloverRec.S[9105]++;__CLOVER_bool43=true;}
				case ONCE:if (!__CLOVER_bool43) {__CLOVER_66_0.cloverRec.S[9106]++;__CLOVER_bool43=true;}
				case EXTERNAL:if (!__CLOVER_bool43) {__CLOVER_66_0.cloverRec.S[9107]++;__CLOVER_bool43=true;}
				{
					__CLOVER_66_0.cloverRec.S[9108]++;break;
				}
				default:if (!__CLOVER_bool43) {__CLOVER_66_0.cloverRec.S[9109]++;__CLOVER_bool43=true;}
				{
					__CLOVER_66_0.cloverRec.S[9110]++;throw new NoViableAltException(LT(1), getFilename());
				}
				}
				}
				__CLOVER_66_0.cloverRec.S[9111]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2150]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2150]==0&false))) {{
					
								__CLOVER_66_0.cloverRec.S[9112]++;if((((last_feature2==-1) && (++__CLOVER_66_0.cloverRec.CT[2151]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2151]==0&false))) {__CLOVER_66_0.cloverRec.S[9113]++;last_feature2=lexer.donne_dernier();
								}__CLOVER_66_0.cloverRec.S[9114]++;if((((fin_commentaire==-1) && (++__CLOVER_66_0.cloverRec.CT[2152]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2152]==0&false))) {__CLOVER_66_0.cloverRec.S[9115]++;fin_commentaire=dernier_commentaire();
								
				}}
				}__CLOVER_66_0.cloverRec.S[9116]++;c=corps2();
				__CLOVER_66_0.cloverRec.S[9117]++;astFactory.addASTChild(currentAST, returnAST);
				{
				__CLOVER_66_0.cloverRec.S[9118]++;boolean __CLOVER_bool45=false;switch ( LA(1)) {
				case ENSURE:if (!__CLOVER_bool45) {__CLOVER_66_0.cloverRec.S[9119]++;__CLOVER_bool45=true;}
				{
					__CLOVER_66_0.cloverRec.S[9120]++;ens = LT(1);
					__CLOVER_66_0.cloverRec.S[9121]++;ens_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(ens);
					__CLOVER_66_0.cloverRec.S[9122]++;astFactory.addASTChild(currentAST, ens_AST);
					__CLOVER_66_0.cloverRec.S[9123]++;match(ENSURE);
					{
					__CLOVER_66_0.cloverRec.S[9124]++;boolean __CLOVER_bool46=false;switch ( LA(1)) {
					case THEN:if (!__CLOVER_bool46) {__CLOVER_66_0.cloverRec.S[9125]++;__CLOVER_bool46=true;}
					{
						__CLOVER_66_0.cloverRec.S[9126]++;tinyeiffel.compiler.ASTDefaut tmp59_AST = null;
						__CLOVER_66_0.cloverRec.S[9127]++;tmp59_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(LT(1));
						__CLOVER_66_0.cloverRec.S[9128]++;astFactory.addASTChild(currentAST, tmp59_AST);
						__CLOVER_66_0.cloverRec.S[9129]++;match(THEN);
						__CLOVER_66_0.cloverRec.S[9130]++;break;
					}
					case END:if (!__CLOVER_bool46) {__CLOVER_66_0.cloverRec.S[9131]++;__CLOVER_bool46=true;}
					case ID:if (!__CLOVER_bool46) {__CLOVER_66_0.cloverRec.S[9132]++;__CLOVER_bool46=true;}
					case STRING:if (!__CLOVER_bool46) {__CLOVER_66_0.cloverRec.S[9133]++;__CLOVER_bool46=true;}
					case LPAREN:if (!__CLOVER_bool46) {__CLOVER_66_0.cloverRec.S[9134]++;__CLOVER_bool46=true;}
					case RESCUE:if (!__CLOVER_bool46) {__CLOVER_66_0.cloverRec.S[9135]++;__CLOVER_bool46=true;}
					case INT:if (!__CLOVER_bool46) {__CLOVER_66_0.cloverRec.S[9136]++;__CLOVER_bool46=true;}
					case REAL:if (!__CLOVER_bool46) {__CLOVER_66_0.cloverRec.S[9137]++;__CLOVER_bool46=true;}
					case CHAR:if (!__CLOVER_bool46) {__CLOVER_66_0.cloverRec.S[9138]++;__CLOVER_bool46=true;}
					case PLUS:if (!__CLOVER_bool46) {__CLOVER_66_0.cloverRec.S[9139]++;__CLOVER_bool46=true;}
					case MOINS:if (!__CLOVER_bool46) {__CLOVER_66_0.cloverRec.S[9140]++;__CLOVER_bool46=true;}
					case FREEOP:if (!__CLOVER_bool46) {__CLOVER_66_0.cloverRec.S[9141]++;__CLOVER_bool46=true;}
					case OLD:if (!__CLOVER_bool46) {__CLOVER_66_0.cloverRec.S[9142]++;__CLOVER_bool46=true;}
					case NOT:if (!__CLOVER_bool46) {__CLOVER_66_0.cloverRec.S[9143]++;__CLOVER_bool46=true;}
					case DOLLARD:if (!__CLOVER_bool46) {__CLOVER_66_0.cloverRec.S[9144]++;__CLOVER_bool46=true;}
					case DEBUT_ARRAY:if (!__CLOVER_bool46) {__CLOVER_66_0.cloverRec.S[9145]++;__CLOVER_bool46=true;}
					case TRUE:if (!__CLOVER_bool46) {__CLOVER_66_0.cloverRec.S[9146]++;__CLOVER_bool46=true;}
					case FALSE:if (!__CLOVER_bool46) {__CLOVER_66_0.cloverRec.S[9147]++;__CLOVER_bool46=true;}
					case STRING2:if (!__CLOVER_bool46) {__CLOVER_66_0.cloverRec.S[9148]++;__CLOVER_bool46=true;}
					{
						__CLOVER_66_0.cloverRec.S[9149]++;break;
					}
					default:if (!__CLOVER_bool46) {__CLOVER_66_0.cloverRec.S[9150]++;__CLOVER_bool46=true;}
					{
						__CLOVER_66_0.cloverRec.S[9151]++;throw new NoViableAltException(LT(1), getFilename());
					}
					}
					}
					__CLOVER_66_0.cloverRec.S[9152]++;l2=liste_assert();
					__CLOVER_66_0.cloverRec.S[9153]++;astFactory.addASTChild(currentAST, returnAST);
					__CLOVER_66_0.cloverRec.S[9154]++;break;
				}
				case END:if (!__CLOVER_bool45) {__CLOVER_66_0.cloverRec.S[9155]++;__CLOVER_bool45=true;}
				case RESCUE:if (!__CLOVER_bool45) {__CLOVER_66_0.cloverRec.S[9156]++;__CLOVER_bool45=true;}
				{
					__CLOVER_66_0.cloverRec.S[9157]++;break;
				}
				default:if (!__CLOVER_bool45) {__CLOVER_66_0.cloverRec.S[9158]++;__CLOVER_bool45=true;}
				{
					__CLOVER_66_0.cloverRec.S[9159]++;throw new NoViableAltException(LT(1), getFilename());
				}
				}
				}
				{
				__CLOVER_66_0.cloverRec.S[9160]++;boolean __CLOVER_bool47=false;switch ( LA(1)) {
				case RESCUE:if (!__CLOVER_bool47) {__CLOVER_66_0.cloverRec.S[9161]++;__CLOVER_bool47=true;}
				{
					__CLOVER_66_0.cloverRec.S[9162]++;resc = LT(1);
					__CLOVER_66_0.cloverRec.S[9163]++;resc_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(resc);
					__CLOVER_66_0.cloverRec.S[9164]++;astFactory.addASTChild(currentAST, resc_AST);
					__CLOVER_66_0.cloverRec.S[9165]++;match(RESCUE);
					{
					__CLOVER_66_0.cloverRec.S[9166]++;_loop127:
					do {{
						__CLOVER_66_0.cloverRec.S[9167]++;if (((((_tokenSet_9.member(LA(1)))) && (++__CLOVER_66_0.cloverRec.CT[2153]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2153]==0&false))) {{
							__CLOVER_66_0.cloverRec.S[9168]++;inst=instr();
							__CLOVER_66_0.cloverRec.S[9169]++;astFactory.addASTChild(currentAST, returnAST);
							__CLOVER_66_0.cloverRec.S[9170]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2154]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2154]==0&false))) {{
								__CLOVER_66_0.cloverRec.S[9171]++;l3.addElement(inst);
							}
							}{
							__CLOVER_66_0.cloverRec.S[9172]++;_loop126:
							do {{
								__CLOVER_66_0.cloverRec.S[9173]++;if (((((LA(1)==SEMI)) && (++__CLOVER_66_0.cloverRec.CT[2155]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2155]==0&false))) {{
									__CLOVER_66_0.cloverRec.S[9174]++;match(SEMI);
								}
								}else {{
									__CLOVER_66_0.cloverRec.S[9175]++;break _loop126;
								}
								
							}} }while (true);
							}
						}
						}else {{
							__CLOVER_66_0.cloverRec.S[9176]++;break _loop127;
						}
						
					}} }while (true);
					}
					__CLOVER_66_0.cloverRec.S[9177]++;break;
				}
				case END:if (!__CLOVER_bool47) {__CLOVER_66_0.cloverRec.S[9178]++;__CLOVER_bool47=true;}
				{
					__CLOVER_66_0.cloverRec.S[9179]++;break;
				}
				default:if (!__CLOVER_bool47) {__CLOVER_66_0.cloverRec.S[9180]++;__CLOVER_bool47=true;}
				{
					__CLOVER_66_0.cloverRec.S[9181]++;throw new NoViableAltException(LT(1), getFilename());
				}
				}
				}
				__CLOVER_66_0.cloverRec.S[9182]++;tinyeiffel.compiler.ASTDefaut tmp61_AST = null;
				__CLOVER_66_0.cloverRec.S[9183]++;tmp61_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(LT(1));
				__CLOVER_66_0.cloverRec.S[9184]++;astFactory.addASTChild(currentAST, tmp61_AST);
				__CLOVER_66_0.cloverRec.S[9185]++;match(END);
				__CLOVER_66_0.cloverRec.S[9186]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2156]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2156]==0&false))) {{
					
							__CLOVER_66_0.cloverRec.S[9187]++;res=c;
							__CLOVER_66_0.cloverRec.S[9188]++;for(i=last_feature1+1;(((i<=last_feature2) && (++__CLOVER_66_0.cloverRec.CT[2157]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2157]==0&false));i++)
							{{
								//System.out.println((i-last_feature1-1)+":"+lexer.liste_commentaire.elementAt(i));
								__CLOVER_66_0.cloverRec.S[9189]++;l4.addElement(lexer.liste_commentaire.elementAt(i));
							}
							}__CLOVER_66_0.cloverRec.S[9190]++;Vector l5=null;
							__CLOVER_66_0.cloverRec.S[9191]++;if((((fin_commentaire>debut_commentaire) && (++__CLOVER_66_0.cloverRec.CT[2158]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2158]==0&false)))
							{{
								//System.out.println("comment:"+debut_commentaire+"<"+fin_commentaire);
								__CLOVER_66_0.cloverRec.S[9192]++;l5=new Vector();
								__CLOVER_66_0.cloverRec.S[9193]++;for(i=debut_commentaire+1;(((i<=fin_commentaire) && (++__CLOVER_66_0.cloverRec.CT[2159]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2159]==0&false));i++)
								{{
									//System.out.println(i+")"+((Commentaire)lexer.liste_commentaire.elementAt(i)).str+"!");
									__CLOVER_66_0.cloverRec.S[9194]++;l5.addElement(lexer.liste_commentaire.elementAt(i));
								}
								//System.out.println("fin3");
							}}
							}__CLOVER_66_0.cloverRec.S[9195]++;if((((res!=null) && (++__CLOVER_66_0.cloverRec.CT[2160]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2160]==0&false)))
							{{
							__CLOVER_66_0.cloverRec.S[9196]++;res.set_require_ensure(l1,l2,l3,obsolete,l4,l5);
							__CLOVER_66_0.cloverRec.S[9197]++;res.set_token(remplitToken(obs),remplitToken(req),
								remplitToken(ens),remplitToken(resc));
							}
							//System.out.println("suite");
						
				}}
				}__CLOVER_66_0.cloverRec.S[9198]++;corps_AST = (tinyeiffel.compiler.ASTDefaut)currentAST.root;
				__CLOVER_66_0.cloverRec.S[9199]++;break;
			}
			case UNIQUE:if (!__CLOVER_bool41) {__CLOVER_66_0.cloverRec.S[9200]++;__CLOVER_bool41=true;}
			{
				__CLOVER_66_0.cloverRec.S[9201]++;uni = LT(1);
				__CLOVER_66_0.cloverRec.S[9202]++;uni_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(uni);
				__CLOVER_66_0.cloverRec.S[9203]++;astFactory.addASTChild(currentAST, uni_AST);
				__CLOVER_66_0.cloverRec.S[9204]++;match(UNIQUE);
				__CLOVER_66_0.cloverRec.S[9205]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2161]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2161]==0&false))) {{
					
							__CLOVER_66_0.cloverRec.S[9206]++;res=new FeatureUnique();
							__CLOVER_66_0.cloverRec.S[9207]++;res.set_token(remplitToken(uni));
						
				}
				}__CLOVER_66_0.cloverRec.S[9208]++;corps_AST = (tinyeiffel.compiler.ASTDefaut)currentAST.root;
				__CLOVER_66_0.cloverRec.S[9209]++;break;
			}
			case ID:if (!__CLOVER_bool41) {__CLOVER_66_0.cloverRec.S[9210]++;__CLOVER_bool41=true;}
			case STRING:if (!__CLOVER_bool41) {__CLOVER_66_0.cloverRec.S[9211]++;__CLOVER_bool41=true;}
			case LPAREN:if (!__CLOVER_bool41) {__CLOVER_66_0.cloverRec.S[9212]++;__CLOVER_bool41=true;}
			case INT:if (!__CLOVER_bool41) {__CLOVER_66_0.cloverRec.S[9213]++;__CLOVER_bool41=true;}
			case REAL:if (!__CLOVER_bool41) {__CLOVER_66_0.cloverRec.S[9214]++;__CLOVER_bool41=true;}
			case CHAR:if (!__CLOVER_bool41) {__CLOVER_66_0.cloverRec.S[9215]++;__CLOVER_bool41=true;}
			case PLUS:if (!__CLOVER_bool41) {__CLOVER_66_0.cloverRec.S[9216]++;__CLOVER_bool41=true;}
			case MOINS:if (!__CLOVER_bool41) {__CLOVER_66_0.cloverRec.S[9217]++;__CLOVER_bool41=true;}
			case FREEOP:if (!__CLOVER_bool41) {__CLOVER_66_0.cloverRec.S[9218]++;__CLOVER_bool41=true;}
			case OLD:if (!__CLOVER_bool41) {__CLOVER_66_0.cloverRec.S[9219]++;__CLOVER_bool41=true;}
			case NOT:if (!__CLOVER_bool41) {__CLOVER_66_0.cloverRec.S[9220]++;__CLOVER_bool41=true;}
			case DOLLARD:if (!__CLOVER_bool41) {__CLOVER_66_0.cloverRec.S[9221]++;__CLOVER_bool41=true;}
			case DEBUT_ARRAY:if (!__CLOVER_bool41) {__CLOVER_66_0.cloverRec.S[9222]++;__CLOVER_bool41=true;}
			case TRUE:if (!__CLOVER_bool41) {__CLOVER_66_0.cloverRec.S[9223]++;__CLOVER_bool41=true;}
			case FALSE:if (!__CLOVER_bool41) {__CLOVER_66_0.cloverRec.S[9224]++;__CLOVER_bool41=true;}
			case STRING2:if (!__CLOVER_bool41) {__CLOVER_66_0.cloverRec.S[9225]++;__CLOVER_bool41=true;}
			{
				__CLOVER_66_0.cloverRec.S[9226]++;e=expr();
				__CLOVER_66_0.cloverRec.S[9227]++;astFactory.addASTChild(currentAST, returnAST);
				__CLOVER_66_0.cloverRec.S[9228]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2162]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2162]==0&false))) {{
					
							__CLOVER_66_0.cloverRec.S[9229]++;res=new FeatureExpr();
							__CLOVER_66_0.cloverRec.S[9230]++;((FeatureExpr)res).expr=e;
						
				}
				}__CLOVER_66_0.cloverRec.S[9231]++;corps_AST = (tinyeiffel.compiler.ASTDefaut)currentAST.root;
				__CLOVER_66_0.cloverRec.S[9232]++;break;
			}
			default:if (!__CLOVER_bool41) {__CLOVER_66_0.cloverRec.S[9233]++;__CLOVER_bool41=true;}
			{
				__CLOVER_66_0.cloverRec.S[9234]++;throw new NoViableAltException(LT(1), getFilename());
			}
			}
		}
		catch (RecognitionException ex) {
			__CLOVER_66_0.cloverRec.S[9235]++;if ((((inputState.guessing==0) && (++__CLOVER_66_0.cloverRec.CT[2163]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2163]==0&false))) {{
				
						__CLOVER_66_0.cloverRec.S[9236]++;logging.erreur(new ErreurSource("Erreur dans l'attribut",ex.getLine(),
									ex.getColumn(),ex.getFilename()));
					
			} }else {{
				__CLOVER_66_0.cloverRec.S[9237]++;throw ex;
			}
		}}
		__CLOVER_66_0.cloverRec.S[9238]++;returnAST = corps_AST;
		__CLOVER_66_0.cloverRec.S[9239]++;return res;
	}
	
	public final Feature  corps2() throws RecognitionException, TokenStreamException {__CLOVER_66_0.cloverRec.M[557]++;
		__CLOVER_66_0.cloverRec.S[9240]++;Feature res=null;
		
		__CLOVER_66_0.cloverRec.S[9241]++;returnAST = null;
		__CLOVER_66_0.cloverRec.S[9242]++;ASTPair currentAST = new ASTPair();
		__CLOVER_66_0.cloverRec.S[9243]++;tinyeiffel.compiler.ASTDefaut corps2_AST = null;
		__CLOVER_66_0.cloverRec.S[9244]++;Token  i1 = null;
		__CLOVER_66_0.cloverRec.S[9245]++;tinyeiffel.compiler.ASTDefaut i1_AST = null;
		__CLOVER_66_0.cloverRec.S[9246]++;Token  i2 = null;
		__CLOVER_66_0.cloverRec.S[9247]++;tinyeiffel.compiler.ASTDefaut i2_AST = null;
		__CLOVER_66_0.cloverRec.S[9248]++;Token  once2 = null;
		__CLOVER_66_0.cloverRec.S[9249]++;tinyeiffel.compiler.ASTDefaut once2_AST = null;
		__CLOVER_66_0.cloverRec.S[9250]++;Token  once1 = null;
		__CLOVER_66_0.cloverRec.S[9251]++;tinyeiffel.compiler.ASTDefaut once1_AST = null;
		__CLOVER_66_0.cloverRec.S[9252]++;Token  def = null;
		__CLOVER_66_0.cloverRec.S[9253]++;tinyeiffel.compiler.ASTDefaut def_AST = null;
		__CLOVER_66_0.cloverRec.S[9254]++;Token  ext = null;
		__CLOVER_66_0.cloverRec.S[9255]++;tinyeiffel.compiler.ASTDefaut ext_AST = null;
		__CLOVER_66_0.cloverRec.S[9256]++;Token  alias = null;
		__CLOVER_66_0.cloverRec.S[9257]++;tinyeiffel.compiler.ASTDefaut alias_AST = null;
		
		__CLOVER_66_0.cloverRec.S[9258]++;boolean once=false;
		__CLOVER_66_0.cloverRec.S[9259]++;Vector v1,v2,v3,liste_instr;
		__CLOVER_66_0.cloverRec.S[9260]++;DeclareVar p;
		__CLOVER_66_0.cloverRec.S[9261]++;Type t;
		__CLOVER_66_0.cloverRec.S[9262]++;int j;
		__CLOVER_66_0.cloverRec.S[9263]++;v2=new Vector();
		__CLOVER_66_0.cloverRec.S[9264]++;v1=new Vector();
		__CLOVER_66_0.cloverRec.S[9265]++;Instr inst;
		__CLOVER_66_0.cloverRec.S[9266]++;liste_instr=new Vector();
		__CLOVER_66_0.cloverRec.S[9267]++;Chaine c1=null,c2=null;
		
		
		__CLOVER_66_0.cloverRec.S[9268]++;try {      // for error handling
			__CLOVER_66_0.cloverRec.S[9269]++;boolean __CLOVER_bool48=false;switch ( LA(1)) {
			case LOCAL:if (!__CLOVER_bool48) {__CLOVER_66_0.cloverRec.S[9270]++;__CLOVER_bool48=true;}
			case DO:if (!__CLOVER_bool48) {__CLOVER_66_0.cloverRec.S[9271]++;__CLOVER_bool48=true;}
			case ONCE:if (!__CLOVER_bool48) {__CLOVER_66_0.cloverRec.S[9272]++;__CLOVER_bool48=true;}
			{
				{
				__CLOVER_66_0.cloverRec.S[9273]++;boolean __CLOVER_bool49=false;switch ( LA(1)) {
				case LOCAL:if (!__CLOVER_bool49) {__CLOVER_66_0.cloverRec.S[9274]++;__CLOVER_bool49=true;}
				{
					__CLOVER_66_0.cloverRec.S[9275]++;tinyeiffel.compiler.ASTDefaut tmp62_AST = null;
					__CLOVER_66_0.cloverRec.S[9276]++;tmp62_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(LT(1));
					__CLOVER_66_0.cloverRec.S[9277]++;astFactory.addASTChild(currentAST, tmp62_AST);
					__CLOVER_66_0.cloverRec.S[9278]++;match(LOCAL);
					{
					__CLOVER_66_0.cloverRec.S[9279]++;_loop136:
					do {{
						__CLOVER_66_0.cloverRec.S[9280]++;if (((((LA(1)==ID)) && (++__CLOVER_66_0.cloverRec.CT[2164]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2164]==0&false))) {{
							__CLOVER_66_0.cloverRec.S[9281]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2165]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2165]==0&false))) {{
								__CLOVER_66_0.cloverRec.S[9282]++;v1=new Vector();
							}
							}{
							__CLOVER_66_0.cloverRec.S[9283]++;i1 = LT(1);
							__CLOVER_66_0.cloverRec.S[9284]++;i1_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(i1);
							__CLOVER_66_0.cloverRec.S[9285]++;astFactory.addASTChild(currentAST, i1_AST);
							__CLOVER_66_0.cloverRec.S[9286]++;match(ID);
							__CLOVER_66_0.cloverRec.S[9287]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2166]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2166]==0&false))) {{
								__CLOVER_66_0.cloverRec.S[9288]++;v1.addElement(i1);
							}
							}{
							__CLOVER_66_0.cloverRec.S[9289]++;_loop133:
							do {{
								__CLOVER_66_0.cloverRec.S[9290]++;if (((((LA(1)==VIRGULE)) && (++__CLOVER_66_0.cloverRec.CT[2167]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2167]==0&false))) {{
									__CLOVER_66_0.cloverRec.S[9291]++;tinyeiffel.compiler.ASTDefaut tmp63_AST = null;
									__CLOVER_66_0.cloverRec.S[9292]++;tmp63_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(LT(1));
									__CLOVER_66_0.cloverRec.S[9293]++;astFactory.addASTChild(currentAST, tmp63_AST);
									__CLOVER_66_0.cloverRec.S[9294]++;match(VIRGULE);
									__CLOVER_66_0.cloverRec.S[9295]++;i2 = LT(1);
									__CLOVER_66_0.cloverRec.S[9296]++;i2_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(i2);
									__CLOVER_66_0.cloverRec.S[9297]++;astFactory.addASTChild(currentAST, i2_AST);
									__CLOVER_66_0.cloverRec.S[9298]++;match(ID);
									__CLOVER_66_0.cloverRec.S[9299]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2168]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2168]==0&false))) {{
										__CLOVER_66_0.cloverRec.S[9300]++;v1.addElement(i2);
									}
								}}
								}else {{
									__CLOVER_66_0.cloverRec.S[9301]++;break _loop133;
								}
								
							}} }while (true);
							}
							}
							__CLOVER_66_0.cloverRec.S[9302]++;tinyeiffel.compiler.ASTDefaut tmp64_AST = null;
							__CLOVER_66_0.cloverRec.S[9303]++;tmp64_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(LT(1));
							__CLOVER_66_0.cloverRec.S[9304]++;astFactory.addASTChild(currentAST, tmp64_AST);
							__CLOVER_66_0.cloverRec.S[9305]++;match(DOUBLE_POINT);
							__CLOVER_66_0.cloverRec.S[9306]++;t=type();
							__CLOVER_66_0.cloverRec.S[9307]++;astFactory.addASTChild(currentAST, returnAST);
							__CLOVER_66_0.cloverRec.S[9308]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2169]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2169]==0&false))) {{
								
													__CLOVER_66_0.cloverRec.S[9309]++;for(j=0;(((j<v1.size()) && (++__CLOVER_66_0.cloverRec.CT[2170]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2170]==0&false));j++)
													{{
														__CLOVER_66_0.cloverRec.S[9310]++;p=new DeclareVar(((Token)v1.elementAt(j)).getText(),t);
														__CLOVER_66_0.cloverRec.S[9311]++;p.set_token(remplitToken((Token)v1.elementAt(j)));
														__CLOVER_66_0.cloverRec.S[9312]++;v2.addElement(p);
														//System.out.println("Suite17");
													}
													}__CLOVER_66_0.cloverRec.S[9313]++;ajoute_type(t);
													//{System.out.println("Suite18");}
												
							}
							}{
							__CLOVER_66_0.cloverRec.S[9314]++;_loop135:
							do {{
								__CLOVER_66_0.cloverRec.S[9315]++;if (((((LA(1)==SEMI)) && (++__CLOVER_66_0.cloverRec.CT[2171]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2171]==0&false))) {{
									__CLOVER_66_0.cloverRec.S[9316]++;match(SEMI);
								}
								}else {{
									__CLOVER_66_0.cloverRec.S[9317]++;break _loop135;
								}
								
							}} }while (true);
							}
						}
						}else {{
							__CLOVER_66_0.cloverRec.S[9318]++;break _loop136;
						}
						
					}} }while (true);
					}
					__CLOVER_66_0.cloverRec.S[9319]++;break;
				}
				case DO:if (!__CLOVER_bool49) {__CLOVER_66_0.cloverRec.S[9320]++;__CLOVER_bool49=true;}
				case ONCE:if (!__CLOVER_bool49) {__CLOVER_66_0.cloverRec.S[9321]++;__CLOVER_bool49=true;}
				{
					__CLOVER_66_0.cloverRec.S[9322]++;break;
				}
				default:if (!__CLOVER_bool49) {__CLOVER_66_0.cloverRec.S[9323]++;__CLOVER_bool49=true;}
				{
					__CLOVER_66_0.cloverRec.S[9324]++;throw new NoViableAltException(LT(1), getFilename());
				}
				}
				}
				{
				__CLOVER_66_0.cloverRec.S[9325]++;boolean __CLOVER_bool50=false;switch ( LA(1)) {
				case DO:if (!__CLOVER_bool50) {__CLOVER_66_0.cloverRec.S[9326]++;__CLOVER_bool50=true;}
				{
					__CLOVER_66_0.cloverRec.S[9327]++;once2 = LT(1);
					__CLOVER_66_0.cloverRec.S[9328]++;once2_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(once2);
					__CLOVER_66_0.cloverRec.S[9329]++;astFactory.addASTChild(currentAST, once2_AST);
					__CLOVER_66_0.cloverRec.S[9330]++;match(DO);
					__CLOVER_66_0.cloverRec.S[9331]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2172]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2172]==0&false))) {{
						__CLOVER_66_0.cloverRec.S[9332]++;once=false;
					}
					}__CLOVER_66_0.cloverRec.S[9333]++;break;
				}
				case ONCE:if (!__CLOVER_bool50) {__CLOVER_66_0.cloverRec.S[9334]++;__CLOVER_bool50=true;}
				{
					__CLOVER_66_0.cloverRec.S[9335]++;once1 = LT(1);
					__CLOVER_66_0.cloverRec.S[9336]++;once1_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(once1);
					__CLOVER_66_0.cloverRec.S[9337]++;astFactory.addASTChild(currentAST, once1_AST);
					__CLOVER_66_0.cloverRec.S[9338]++;match(ONCE);
					__CLOVER_66_0.cloverRec.S[9339]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2173]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2173]==0&false))) {{
						__CLOVER_66_0.cloverRec.S[9340]++;once=true;
					}
					}__CLOVER_66_0.cloverRec.S[9341]++;break;
				}
				default:if (!__CLOVER_bool50) {__CLOVER_66_0.cloverRec.S[9342]++;__CLOVER_bool50=true;}
				{
					__CLOVER_66_0.cloverRec.S[9343]++;throw new NoViableAltException(LT(1), getFilename());
				}
				}
				}
				{
				__CLOVER_66_0.cloverRec.S[9344]++;_loop141:
				do {{
					__CLOVER_66_0.cloverRec.S[9345]++;if (((((_tokenSet_9.member(LA(1)))) && (++__CLOVER_66_0.cloverRec.CT[2174]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2174]==0&false))) {{
						__CLOVER_66_0.cloverRec.S[9346]++;inst=instr();
						__CLOVER_66_0.cloverRec.S[9347]++;astFactory.addASTChild(currentAST, returnAST);
						__CLOVER_66_0.cloverRec.S[9348]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2175]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2175]==0&false))) {{
							__CLOVER_66_0.cloverRec.S[9349]++;liste_instr.addElement(inst);
						}
						}{
						__CLOVER_66_0.cloverRec.S[9350]++;_loop140:
						do {{
							__CLOVER_66_0.cloverRec.S[9351]++;if (((((LA(1)==SEMI)) && (++__CLOVER_66_0.cloverRec.CT[2176]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2176]==0&false))) {{
								__CLOVER_66_0.cloverRec.S[9352]++;match(SEMI);
							}
							}else {{
								__CLOVER_66_0.cloverRec.S[9353]++;break _loop140;
							}
							
						}} }while (true);
						}
					}
					}else {{
						__CLOVER_66_0.cloverRec.S[9354]++;break _loop141;
					}
					
				}} }while (true);
				}
				__CLOVER_66_0.cloverRec.S[9355]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2177]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2177]==0&false))) {{
					
							__CLOVER_66_0.cloverRec.S[9356]++;res=new FeatureRoutine(once,liste_instr,v2);
							__CLOVER_66_0.cloverRec.S[9357]++;res.tdo=((((once1==null)) && (++__CLOVER_66_0.cloverRec.CT[2178]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2178]==0&false))?remplitToken(once2):remplitToken(once1);
							//((FeatureRoutine)res).once=once;
							//((FeatureRoutine)res).liste_instr=liste_instr;
							//res=new FeatureDeferred();
						
				}
				}__CLOVER_66_0.cloverRec.S[9358]++;corps2_AST = (tinyeiffel.compiler.ASTDefaut)currentAST.root;
				__CLOVER_66_0.cloverRec.S[9359]++;break;
			}
			case DEFERRED:if (!__CLOVER_bool48) {__CLOVER_66_0.cloverRec.S[9360]++;__CLOVER_bool48=true;}
			{
				__CLOVER_66_0.cloverRec.S[9361]++;def = LT(1);
				__CLOVER_66_0.cloverRec.S[9362]++;def_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(def);
				__CLOVER_66_0.cloverRec.S[9363]++;astFactory.addASTChild(currentAST, def_AST);
				__CLOVER_66_0.cloverRec.S[9364]++;match(DEFERRED);
				__CLOVER_66_0.cloverRec.S[9365]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2179]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2179]==0&false))) {{
					__CLOVER_66_0.cloverRec.S[9366]++;res=new FeatureDeferred();__CLOVER_66_0.cloverRec.S[9367]++;res.tdeferred=remplitToken(def);
				}
				}__CLOVER_66_0.cloverRec.S[9368]++;corps2_AST = (tinyeiffel.compiler.ASTDefaut)currentAST.root;
				__CLOVER_66_0.cloverRec.S[9369]++;break;
			}
			case EXTERNAL:if (!__CLOVER_bool48) {__CLOVER_66_0.cloverRec.S[9370]++;__CLOVER_bool48=true;}
			{
				__CLOVER_66_0.cloverRec.S[9371]++;ext = LT(1);
				__CLOVER_66_0.cloverRec.S[9372]++;ext_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(ext);
				__CLOVER_66_0.cloverRec.S[9373]++;astFactory.addASTChild(currentAST, ext_AST);
				__CLOVER_66_0.cloverRec.S[9374]++;match(EXTERNAL);
				__CLOVER_66_0.cloverRec.S[9375]++;c1=string();
				__CLOVER_66_0.cloverRec.S[9376]++;astFactory.addASTChild(currentAST, returnAST);
				{
				__CLOVER_66_0.cloverRec.S[9377]++;boolean __CLOVER_bool51=false;switch ( LA(1)) {
				case ALIAS:if (!__CLOVER_bool51) {__CLOVER_66_0.cloverRec.S[9378]++;__CLOVER_bool51=true;}
				{
					__CLOVER_66_0.cloverRec.S[9379]++;alias = LT(1);
					__CLOVER_66_0.cloverRec.S[9380]++;alias_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(alias);
					__CLOVER_66_0.cloverRec.S[9381]++;astFactory.addASTChild(currentAST, alias_AST);
					__CLOVER_66_0.cloverRec.S[9382]++;match(ALIAS);
					__CLOVER_66_0.cloverRec.S[9383]++;c2=string();
					__CLOVER_66_0.cloverRec.S[9384]++;astFactory.addASTChild(currentAST, returnAST);
					__CLOVER_66_0.cloverRec.S[9385]++;break;
				}
				case END:if (!__CLOVER_bool51) {__CLOVER_66_0.cloverRec.S[9386]++;__CLOVER_bool51=true;}
				case ENSURE:if (!__CLOVER_bool51) {__CLOVER_66_0.cloverRec.S[9387]++;__CLOVER_bool51=true;}
				case RESCUE:if (!__CLOVER_bool51) {__CLOVER_66_0.cloverRec.S[9388]++;__CLOVER_bool51=true;}
				{
					__CLOVER_66_0.cloverRec.S[9389]++;break;
				}
				default:if (!__CLOVER_bool51) {__CLOVER_66_0.cloverRec.S[9390]++;__CLOVER_bool51=true;}
				{
					__CLOVER_66_0.cloverRec.S[9391]++;throw new NoViableAltException(LT(1), getFilename());
				}
				}
				}
				__CLOVER_66_0.cloverRec.S[9392]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2180]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2180]==0&false))) {{
					
									__CLOVER_66_0.cloverRec.S[9393]++;res=new FeatureExternal(c1,c2);
									__CLOVER_66_0.cloverRec.S[9394]++;res.texternal=remplitToken(ext);
									__CLOVER_66_0.cloverRec.S[9395]++;res.talias=remplitToken(alias);
								
				}
				}__CLOVER_66_0.cloverRec.S[9396]++;corps2_AST = (tinyeiffel.compiler.ASTDefaut)currentAST.root;
				__CLOVER_66_0.cloverRec.S[9397]++;break;
			}
			default:if (!__CLOVER_bool48) {__CLOVER_66_0.cloverRec.S[9398]++;__CLOVER_bool48=true;}
			{
				__CLOVER_66_0.cloverRec.S[9399]++;throw new NoViableAltException(LT(1), getFilename());
			}
			}
		}
		catch (RecognitionException ex) {
			__CLOVER_66_0.cloverRec.S[9400]++;if ((((inputState.guessing==0) && (++__CLOVER_66_0.cloverRec.CT[2181]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2181]==0&false))) {{
				
						__CLOVER_66_0.cloverRec.S[9401]++;logging.erreur(new ErreurSource("Erreur dans le corps de l'attribut",ex.getLine(),
									ex.getColumn(),ex.getFilename()));
					
			} }else {{
				__CLOVER_66_0.cloverRec.S[9402]++;throw ex;
			}
		}}
		__CLOVER_66_0.cloverRec.S[9403]++;returnAST = corps2_AST;
		__CLOVER_66_0.cloverRec.S[9404]++;return res;
	}
	
	public final Instr  instr() throws RecognitionException, TokenStreamException {__CLOVER_66_0.cloverRec.M[558]++;
		__CLOVER_66_0.cloverRec.S[9405]++;Instr res=null;
		
		__CLOVER_66_0.cloverRec.S[9406]++;returnAST = null;
		__CLOVER_66_0.cloverRec.S[9407]++;ASTPair currentAST = new ASTPair();
		__CLOVER_66_0.cloverRec.S[9408]++;tinyeiffel.compiler.ASTDefaut instr_AST = null;
		__CLOVER_66_0.cloverRec.S[9409]++;Token  cur1 = null;
		__CLOVER_66_0.cloverRec.S[9410]++;tinyeiffel.compiler.ASTDefaut cur1_AST = null;
		__CLOVER_66_0.cloverRec.S[9411]++;Token  i = null;
		__CLOVER_66_0.cloverRec.S[9412]++;tinyeiffel.compiler.ASTDefaut i_AST = null;
		__CLOVER_66_0.cloverRec.S[9413]++;Token  aff = null;
		__CLOVER_66_0.cloverRec.S[9414]++;tinyeiffel.compiler.ASTDefaut aff_AST = null;
		__CLOVER_66_0.cloverRec.S[9415]++;Token  cur2 = null;
		__CLOVER_66_0.cloverRec.S[9416]++;tinyeiffel.compiler.ASTDefaut cur2_AST = null;
		__CLOVER_66_0.cloverRec.S[9417]++;Token  j = null;
		__CLOVER_66_0.cloverRec.S[9418]++;tinyeiffel.compiler.ASTDefaut j_AST = null;
		__CLOVER_66_0.cloverRec.S[9419]++;Token  taff = null;
		__CLOVER_66_0.cloverRec.S[9420]++;tinyeiffel.compiler.ASTDefaut taff_AST = null;
		__CLOVER_66_0.cloverRec.S[9421]++;Token  k = null;
		__CLOVER_66_0.cloverRec.S[9422]++;tinyeiffel.compiler.ASTDefaut k_AST = null;
		__CLOVER_66_0.cloverRec.S[9423]++;Token  in = null;
		__CLOVER_66_0.cloverRec.S[9424]++;tinyeiffel.compiler.ASTDefaut in_AST = null;
		__CLOVER_66_0.cloverRec.S[9425]++;Token  r = null;
		__CLOVER_66_0.cloverRec.S[9426]++;tinyeiffel.compiler.ASTDefaut r_AST = null;
		__CLOVER_66_0.cloverRec.S[9427]++;Token  c = null;
		__CLOVER_66_0.cloverRec.S[9428]++;tinyeiffel.compiler.ASTDefaut c_AST = null;
		__CLOVER_66_0.cloverRec.S[9429]++;Token  p = null;
		__CLOVER_66_0.cloverRec.S[9430]++;tinyeiffel.compiler.ASTDefaut p_AST = null;
		__CLOVER_66_0.cloverRec.S[9431]++;Token  l = null;
		__CLOVER_66_0.cloverRec.S[9432]++;tinyeiffel.compiler.ASTDefaut l_AST = null;
		__CLOVER_66_0.cloverRec.S[9433]++;Token  fro = null;
		__CLOVER_66_0.cloverRec.S[9434]++;tinyeiffel.compiler.ASTDefaut fro_AST = null;
		__CLOVER_66_0.cloverRec.S[9435]++;Token  inv = null;
		__CLOVER_66_0.cloverRec.S[9436]++;tinyeiffel.compiler.ASTDefaut inv_AST = null;
		__CLOVER_66_0.cloverRec.S[9437]++;Token  var = null;
		__CLOVER_66_0.cloverRec.S[9438]++;tinyeiffel.compiler.ASTDefaut var_AST = null;
		__CLOVER_66_0.cloverRec.S[9439]++;Token  unt = null;
		__CLOVER_66_0.cloverRec.S[9440]++;tinyeiffel.compiler.ASTDefaut unt_AST = null;
		__CLOVER_66_0.cloverRec.S[9441]++;Token  loop = null;
		__CLOVER_66_0.cloverRec.S[9442]++;tinyeiffel.compiler.ASTDefaut loop_AST = null;
		__CLOVER_66_0.cloverRec.S[9443]++;Token  en3 = null;
		__CLOVER_66_0.cloverRec.S[9444]++;tinyeiffel.compiler.ASTDefaut en3_AST = null;
		__CLOVER_66_0.cloverRec.S[9445]++;Token  if2 = null;
		__CLOVER_66_0.cloverRec.S[9446]++;tinyeiffel.compiler.ASTDefaut if2_AST = null;
		__CLOVER_66_0.cloverRec.S[9447]++;Token  then1 = null;
		__CLOVER_66_0.cloverRec.S[9448]++;tinyeiffel.compiler.ASTDefaut then1_AST = null;
		__CLOVER_66_0.cloverRec.S[9449]++;Token  eif = null;
		__CLOVER_66_0.cloverRec.S[9450]++;tinyeiffel.compiler.ASTDefaut eif_AST = null;
		__CLOVER_66_0.cloverRec.S[9451]++;Token  then2 = null;
		__CLOVER_66_0.cloverRec.S[9452]++;tinyeiffel.compiler.ASTDefaut then2_AST = null;
		__CLOVER_66_0.cloverRec.S[9453]++;Token  else0 = null;
		__CLOVER_66_0.cloverRec.S[9454]++;tinyeiffel.compiler.ASTDefaut else0_AST = null;
		__CLOVER_66_0.cloverRec.S[9455]++;Token  excl = null;
		__CLOVER_66_0.cloverRec.S[9456]++;tinyeiffel.compiler.ASTDefaut excl_AST = null;
		__CLOVER_66_0.cloverRec.S[9457]++;Token  excl2 = null;
		__CLOVER_66_0.cloverRec.S[9458]++;tinyeiffel.compiler.ASTDefaut excl2_AST = null;
		__CLOVER_66_0.cloverRec.S[9459]++;Token  m = null;
		__CLOVER_66_0.cloverRec.S[9460]++;tinyeiffel.compiler.ASTDefaut m_AST = null;
		__CLOVER_66_0.cloverRec.S[9461]++;Token  p2 = null;
		__CLOVER_66_0.cloverRec.S[9462]++;tinyeiffel.compiler.ASTDefaut p2_AST = null;
		__CLOVER_66_0.cloverRec.S[9463]++;Token  n = null;
		__CLOVER_66_0.cloverRec.S[9464]++;tinyeiffel.compiler.ASTDefaut n_AST = null;
		__CLOVER_66_0.cloverRec.S[9465]++;Token  r2 = null;
		__CLOVER_66_0.cloverRec.S[9466]++;tinyeiffel.compiler.ASTDefaut r2_AST = null;
		__CLOVER_66_0.cloverRec.S[9467]++;Token  insp = null;
		__CLOVER_66_0.cloverRec.S[9468]++;tinyeiffel.compiler.ASTDefaut insp_AST = null;
		__CLOVER_66_0.cloverRec.S[9469]++;Token  when = null;
		__CLOVER_66_0.cloverRec.S[9470]++;tinyeiffel.compiler.ASTDefaut when_AST = null;
		__CLOVER_66_0.cloverRec.S[9471]++;Token  then = null;
		__CLOVER_66_0.cloverRec.S[9472]++;tinyeiffel.compiler.ASTDefaut then_AST = null;
		__CLOVER_66_0.cloverRec.S[9473]++;Token  else2 = null;
		__CLOVER_66_0.cloverRec.S[9474]++;tinyeiffel.compiler.ASTDefaut else2_AST = null;
		__CLOVER_66_0.cloverRec.S[9475]++;Token  ch = null;
		__CLOVER_66_0.cloverRec.S[9476]++;tinyeiffel.compiler.ASTDefaut ch_AST = null;
		__CLOVER_66_0.cloverRec.S[9477]++;Token  en2 = null;
		__CLOVER_66_0.cloverRec.S[9478]++;tinyeiffel.compiler.ASTDefaut en2_AST = null;
		__CLOVER_66_0.cloverRec.S[9479]++;Token  d = null;
		__CLOVER_66_0.cloverRec.S[9480]++;tinyeiffel.compiler.ASTDefaut d_AST = null;
		__CLOVER_66_0.cloverRec.S[9481]++;Token  en = null;
		__CLOVER_66_0.cloverRec.S[9482]++;tinyeiffel.compiler.ASTDefaut en_AST = null;
		
		__CLOVER_66_0.cloverRec.S[9483]++;Expr e=null,e2=null;
		__CLOVER_66_0.cloverRec.S[9484]++;Vector liste=new Vector(),liste2=new Vector(),liste3=new Vector();
		__CLOVER_66_0.cloverRec.S[9485]++;Instr inst=null,derniere_instr=null;
		__CLOVER_66_0.cloverRec.S[9486]++;Type t=null;
		//Instr_Appel der_appel=null
		__CLOVER_66_0.cloverRec.S[9487]++;Chaine s1,s2;
		__CLOVER_66_0.cloverRec.S[9488]++;boolean current_present=false;
		//{System.out.println("Suite40");}
		
		
		__CLOVER_66_0.cloverRec.S[9489]++;try {      // for error handling
			__CLOVER_66_0.cloverRec.S[9490]++;boolean __CLOVER_bool52=false;switch ( LA(1)) {
			case FROM:if (!__CLOVER_bool52) {__CLOVER_66_0.cloverRec.S[9491]++;__CLOVER_bool52=true;}
			{
				__CLOVER_66_0.cloverRec.S[9492]++;fro = LT(1);
				__CLOVER_66_0.cloverRec.S[9493]++;fro_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(fro);
				__CLOVER_66_0.cloverRec.S[9494]++;astFactory.addASTChild(currentAST, fro_AST);
				__CLOVER_66_0.cloverRec.S[9495]++;match(FROM);
				{
				__CLOVER_66_0.cloverRec.S[9496]++;_loop167:
				do {{
					__CLOVER_66_0.cloverRec.S[9497]++;if (((((_tokenSet_9.member(LA(1)))) && (++__CLOVER_66_0.cloverRec.CT[2182]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2182]==0&false))) {{
						__CLOVER_66_0.cloverRec.S[9498]++;inst=instr();
						__CLOVER_66_0.cloverRec.S[9499]++;astFactory.addASTChild(currentAST, returnAST);
						__CLOVER_66_0.cloverRec.S[9500]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2183]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2183]==0&false))) {{
							__CLOVER_66_0.cloverRec.S[9501]++;liste.addElement(inst);
						}
						}{
						__CLOVER_66_0.cloverRec.S[9502]++;_loop166:
						do {{
							__CLOVER_66_0.cloverRec.S[9503]++;if (((((LA(1)==SEMI)) && (++__CLOVER_66_0.cloverRec.CT[2184]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2184]==0&false))) {{
								__CLOVER_66_0.cloverRec.S[9504]++;match(SEMI);
							}
							}else {{
								__CLOVER_66_0.cloverRec.S[9505]++;break _loop166;
							}
							
						}} }while (true);
						}
					}
					}else {{
						__CLOVER_66_0.cloverRec.S[9506]++;break _loop167;
					}
					
				}} }while (true);
				}
				{
				__CLOVER_66_0.cloverRec.S[9507]++;boolean __CLOVER_bool53=false;switch ( LA(1)) {
				case INVARIANT:if (!__CLOVER_bool53) {__CLOVER_66_0.cloverRec.S[9508]++;__CLOVER_bool53=true;}
				{
					__CLOVER_66_0.cloverRec.S[9509]++;inv = LT(1);
					__CLOVER_66_0.cloverRec.S[9510]++;inv_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(inv);
					__CLOVER_66_0.cloverRec.S[9511]++;astFactory.addASTChild(currentAST, inv_AST);
					__CLOVER_66_0.cloverRec.S[9512]++;match(INVARIANT);
					__CLOVER_66_0.cloverRec.S[9513]++;liste3=liste_assert();
					__CLOVER_66_0.cloverRec.S[9514]++;astFactory.addASTChild(currentAST, returnAST);
					__CLOVER_66_0.cloverRec.S[9515]++;break;
				}
				case VARIANT:if (!__CLOVER_bool53) {__CLOVER_66_0.cloverRec.S[9516]++;__CLOVER_bool53=true;}
				case UNTIL:if (!__CLOVER_bool53) {__CLOVER_66_0.cloverRec.S[9517]++;__CLOVER_bool53=true;}
				{
					__CLOVER_66_0.cloverRec.S[9518]++;break;
				}
				default:if (!__CLOVER_bool53) {__CLOVER_66_0.cloverRec.S[9519]++;__CLOVER_bool53=true;}
				{
					__CLOVER_66_0.cloverRec.S[9520]++;throw new NoViableAltException(LT(1), getFilename());
				}
				}
				}
				{
				__CLOVER_66_0.cloverRec.S[9521]++;boolean __CLOVER_bool54=false;switch ( LA(1)) {
				case VARIANT:if (!__CLOVER_bool54) {__CLOVER_66_0.cloverRec.S[9522]++;__CLOVER_bool54=true;}
				{
					__CLOVER_66_0.cloverRec.S[9523]++;var = LT(1);
					__CLOVER_66_0.cloverRec.S[9524]++;var_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(var);
					__CLOVER_66_0.cloverRec.S[9525]++;astFactory.addASTChild(currentAST, var_AST);
					__CLOVER_66_0.cloverRec.S[9526]++;match(VARIANT);
					__CLOVER_66_0.cloverRec.S[9527]++;e2=expr();
					__CLOVER_66_0.cloverRec.S[9528]++;astFactory.addASTChild(currentAST, returnAST);
					__CLOVER_66_0.cloverRec.S[9529]++;break;
				}
				case UNTIL:if (!__CLOVER_bool54) {__CLOVER_66_0.cloverRec.S[9530]++;__CLOVER_bool54=true;}
				{
					__CLOVER_66_0.cloverRec.S[9531]++;break;
				}
				default:if (!__CLOVER_bool54) {__CLOVER_66_0.cloverRec.S[9532]++;__CLOVER_bool54=true;}
				{
					__CLOVER_66_0.cloverRec.S[9533]++;throw new NoViableAltException(LT(1), getFilename());
				}
				}
				}
				__CLOVER_66_0.cloverRec.S[9534]++;unt = LT(1);
				__CLOVER_66_0.cloverRec.S[9535]++;unt_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(unt);
				__CLOVER_66_0.cloverRec.S[9536]++;astFactory.addASTChild(currentAST, unt_AST);
				__CLOVER_66_0.cloverRec.S[9537]++;match(UNTIL);
				__CLOVER_66_0.cloverRec.S[9538]++;e=expr();
				__CLOVER_66_0.cloverRec.S[9539]++;astFactory.addASTChild(currentAST, returnAST);
				__CLOVER_66_0.cloverRec.S[9540]++;loop = LT(1);
				__CLOVER_66_0.cloverRec.S[9541]++;loop_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(loop);
				__CLOVER_66_0.cloverRec.S[9542]++;astFactory.addASTChild(currentAST, loop_AST);
				__CLOVER_66_0.cloverRec.S[9543]++;match(LOOP);
				{
				__CLOVER_66_0.cloverRec.S[9544]++;_loop173:
				do {{
					__CLOVER_66_0.cloverRec.S[9545]++;if (((((_tokenSet_9.member(LA(1)))) && (++__CLOVER_66_0.cloverRec.CT[2185]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2185]==0&false))) {{
						__CLOVER_66_0.cloverRec.S[9546]++;inst=instr();
						__CLOVER_66_0.cloverRec.S[9547]++;astFactory.addASTChild(currentAST, returnAST);
						__CLOVER_66_0.cloverRec.S[9548]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2186]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2186]==0&false))) {{
							__CLOVER_66_0.cloverRec.S[9549]++;liste2.addElement(inst);
						}
						}{
						__CLOVER_66_0.cloverRec.S[9550]++;_loop172:
						do {{
							__CLOVER_66_0.cloverRec.S[9551]++;if (((((LA(1)==SEMI)) && (++__CLOVER_66_0.cloverRec.CT[2187]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2187]==0&false))) {{
								__CLOVER_66_0.cloverRec.S[9552]++;match(SEMI);
							}
							}else {{
								__CLOVER_66_0.cloverRec.S[9553]++;break _loop172;
							}
							
						}} }while (true);
						}
					}
					}else {{
						__CLOVER_66_0.cloverRec.S[9554]++;break _loop173;
					}
					
				}} }while (true);
				}
				__CLOVER_66_0.cloverRec.S[9555]++;en3 = LT(1);
				__CLOVER_66_0.cloverRec.S[9556]++;en3_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(en3);
				__CLOVER_66_0.cloverRec.S[9557]++;astFactory.addASTChild(currentAST, en3_AST);
				__CLOVER_66_0.cloverRec.S[9558]++;match(END);
				__CLOVER_66_0.cloverRec.S[9559]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2188]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2188]==0&false))) {{
					
								//{System.out.println("Suite23");}
								__CLOVER_66_0.cloverRec.S[9560]++;res=new Instr_Loop(e,liste,liste2,liste3,e2);
								__CLOVER_66_0.cloverRec.S[9561]++;((Instr_Loop)res).set_token(remplitToken(fro),remplitToken(unt),
									remplitToken(inv),remplitToken(var),remplitToken(loop),
									remplitToken(en3));
							
				}
				}__CLOVER_66_0.cloverRec.S[9562]++;instr_AST = (tinyeiffel.compiler.ASTDefaut)currentAST.root;
				__CLOVER_66_0.cloverRec.S[9563]++;break;
			}
			case IF:if (!__CLOVER_bool52) {__CLOVER_66_0.cloverRec.S[9564]++;__CLOVER_bool52=true;}
			{
				__CLOVER_66_0.cloverRec.S[9565]++;if2 = LT(1);
				__CLOVER_66_0.cloverRec.S[9566]++;if2_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(if2);
				__CLOVER_66_0.cloverRec.S[9567]++;astFactory.addASTChild(currentAST, if2_AST);
				__CLOVER_66_0.cloverRec.S[9568]++;match(IF);
				__CLOVER_66_0.cloverRec.S[9569]++;e=expr();
				__CLOVER_66_0.cloverRec.S[9570]++;astFactory.addASTChild(currentAST, returnAST);
				__CLOVER_66_0.cloverRec.S[9571]++;then1 = LT(1);
				__CLOVER_66_0.cloverRec.S[9572]++;then1_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(then1);
				__CLOVER_66_0.cloverRec.S[9573]++;astFactory.addASTChild(currentAST, then1_AST);
				__CLOVER_66_0.cloverRec.S[9574]++;match(THEN);
				{
				__CLOVER_66_0.cloverRec.S[9575]++;_loop177:
				do {{
					__CLOVER_66_0.cloverRec.S[9576]++;if (((((_tokenSet_9.member(LA(1)))) && (++__CLOVER_66_0.cloverRec.CT[2189]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2189]==0&false))) {{
						__CLOVER_66_0.cloverRec.S[9577]++;inst=instr();
						__CLOVER_66_0.cloverRec.S[9578]++;astFactory.addASTChild(currentAST, returnAST);
						__CLOVER_66_0.cloverRec.S[9579]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2190]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2190]==0&false))) {{
							__CLOVER_66_0.cloverRec.S[9580]++;liste.addElement(inst);
						}
						}{
						__CLOVER_66_0.cloverRec.S[9581]++;_loop176:
						do {{
							__CLOVER_66_0.cloverRec.S[9582]++;if (((((LA(1)==SEMI)) && (++__CLOVER_66_0.cloverRec.CT[2191]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2191]==0&false))) {{
								__CLOVER_66_0.cloverRec.S[9583]++;match(SEMI);
							}
							}else {{
								__CLOVER_66_0.cloverRec.S[9584]++;break _loop176;
							}
							
						}} }while (true);
						}
					}
					}else {{
						__CLOVER_66_0.cloverRec.S[9585]++;break _loop177;
					}
					
				}} }while (true);
				}
				__CLOVER_66_0.cloverRec.S[9586]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2192]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2192]==0&false))) {{
					
								//{System.out.println("Suite25");}
								__CLOVER_66_0.cloverRec.S[9587]++;res=new Instr_If(e,liste);
								__CLOVER_66_0.cloverRec.S[9588]++;((Instr_If)res).tif=remplitToken(if2);
								__CLOVER_66_0.cloverRec.S[9589]++;((Instr_If)res).tthen=remplitToken(then1);
								__CLOVER_66_0.cloverRec.S[9590]++;derniere_instr=res;
							
				}
				}{
				__CLOVER_66_0.cloverRec.S[9591]++;_loop183:
				do {{
					__CLOVER_66_0.cloverRec.S[9592]++;if (((((LA(1)==ELSEIF)) && (++__CLOVER_66_0.cloverRec.CT[2193]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2193]==0&false))) {{
						__CLOVER_66_0.cloverRec.S[9593]++;eif = LT(1);
						__CLOVER_66_0.cloverRec.S[9594]++;eif_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(eif);
						__CLOVER_66_0.cloverRec.S[9595]++;astFactory.addASTChild(currentAST, eif_AST);
						__CLOVER_66_0.cloverRec.S[9596]++;match(ELSEIF);
						__CLOVER_66_0.cloverRec.S[9597]++;e2=expr();
						__CLOVER_66_0.cloverRec.S[9598]++;astFactory.addASTChild(currentAST, returnAST);
						__CLOVER_66_0.cloverRec.S[9599]++;then2 = LT(1);
						__CLOVER_66_0.cloverRec.S[9600]++;then2_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(then2);
						__CLOVER_66_0.cloverRec.S[9601]++;astFactory.addASTChild(currentAST, then2_AST);
						__CLOVER_66_0.cloverRec.S[9602]++;match(THEN);
						__CLOVER_66_0.cloverRec.S[9603]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2194]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2194]==0&false))) {{
							__CLOVER_66_0.cloverRec.S[9604]++;liste=new Vector();
						}
						}{
						__CLOVER_66_0.cloverRec.S[9605]++;_loop182:
						do {{
							__CLOVER_66_0.cloverRec.S[9606]++;if (((((_tokenSet_9.member(LA(1)))) && (++__CLOVER_66_0.cloverRec.CT[2195]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2195]==0&false))) {{
								__CLOVER_66_0.cloverRec.S[9607]++;inst=instr();
								__CLOVER_66_0.cloverRec.S[9608]++;astFactory.addASTChild(currentAST, returnAST);
								__CLOVER_66_0.cloverRec.S[9609]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2196]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2196]==0&false))) {{
									__CLOVER_66_0.cloverRec.S[9610]++;liste.addElement(inst);
								}
								}{
								__CLOVER_66_0.cloverRec.S[9611]++;_loop181:
								do {{
									__CLOVER_66_0.cloverRec.S[9612]++;if (((((LA(1)==SEMI)) && (++__CLOVER_66_0.cloverRec.CT[2197]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2197]==0&false))) {{
										__CLOVER_66_0.cloverRec.S[9613]++;match(SEMI);
									}
									}else {{
										__CLOVER_66_0.cloverRec.S[9614]++;break _loop181;
									}
									
								}} }while (true);
								}
							}
							}else {{
								__CLOVER_66_0.cloverRec.S[9615]++;break _loop182;
							}
							
						}} }while (true);
						}
						__CLOVER_66_0.cloverRec.S[9616]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2198]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2198]==0&false))) {{
							
										__CLOVER_66_0.cloverRec.S[9617]++;inst=new Instr_ElseIf(e2,liste);
										__CLOVER_66_0.cloverRec.S[9618]++;((Instr_ElseIf)inst).telseif=remplitToken(eif);
										__CLOVER_66_0.cloverRec.S[9619]++;((Instr_ElseIf)inst).tthen=remplitToken(then2);
										__CLOVER_66_0.cloverRec.S[9620]++;((Suite)derniere_instr).setSuivant(inst);
										__CLOVER_66_0.cloverRec.S[9621]++;derniere_instr=inst;
									
						}
					}}
					}else {{
						__CLOVER_66_0.cloverRec.S[9622]++;break _loop183;
					}
					
				}} }while (true);
				}
				{
				__CLOVER_66_0.cloverRec.S[9623]++;boolean __CLOVER_bool55=false;switch ( LA(1)) {
				case ELSE:if (!__CLOVER_bool55) {__CLOVER_66_0.cloverRec.S[9624]++;__CLOVER_bool55=true;}
				{
					__CLOVER_66_0.cloverRec.S[9625]++;else0 = LT(1);
					__CLOVER_66_0.cloverRec.S[9626]++;else0_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(else0);
					__CLOVER_66_0.cloverRec.S[9627]++;astFactory.addASTChild(currentAST, else0_AST);
					__CLOVER_66_0.cloverRec.S[9628]++;match(ELSE);
					__CLOVER_66_0.cloverRec.S[9629]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2199]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2199]==0&false))) {{
						__CLOVER_66_0.cloverRec.S[9630]++;liste=new Vector();
					}
					}{
					__CLOVER_66_0.cloverRec.S[9631]++;_loop188:
					do {{
						__CLOVER_66_0.cloverRec.S[9632]++;if (((((_tokenSet_9.member(LA(1)))) && (++__CLOVER_66_0.cloverRec.CT[2200]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2200]==0&false))) {{
							__CLOVER_66_0.cloverRec.S[9633]++;inst=instr();
							__CLOVER_66_0.cloverRec.S[9634]++;astFactory.addASTChild(currentAST, returnAST);
							__CLOVER_66_0.cloverRec.S[9635]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2201]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2201]==0&false))) {{
								__CLOVER_66_0.cloverRec.S[9636]++;liste.addElement(inst);
							}
							}{
							__CLOVER_66_0.cloverRec.S[9637]++;_loop187:
							do {{
								__CLOVER_66_0.cloverRec.S[9638]++;if (((((LA(1)==SEMI)) && (++__CLOVER_66_0.cloverRec.CT[2202]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2202]==0&false))) {{
									__CLOVER_66_0.cloverRec.S[9639]++;match(SEMI);
								}
								}else {{
									__CLOVER_66_0.cloverRec.S[9640]++;break _loop187;
								}
								
							}} }while (true);
							}
						}
						}else {{
							__CLOVER_66_0.cloverRec.S[9641]++;break _loop188;
						}
						
					}} }while (true);
					}
					__CLOVER_66_0.cloverRec.S[9642]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2203]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2203]==0&false))) {{
						
									__CLOVER_66_0.cloverRec.S[9643]++;inst=new Instr_Else(liste);
									__CLOVER_66_0.cloverRec.S[9644]++;((Instr_Else)inst).telse=remplitToken(else0);
									__CLOVER_66_0.cloverRec.S[9645]++;((Suite)derniere_instr).setSuivant(inst);
									__CLOVER_66_0.cloverRec.S[9646]++;derniere_instr=inst;
								
					}
					}__CLOVER_66_0.cloverRec.S[9647]++;break;
				}
				case END:if (!__CLOVER_bool55) {__CLOVER_66_0.cloverRec.S[9648]++;__CLOVER_bool55=true;}
				{
					__CLOVER_66_0.cloverRec.S[9649]++;break;
				}
				default:if (!__CLOVER_bool55) {__CLOVER_66_0.cloverRec.S[9650]++;__CLOVER_bool55=true;}
				{
					__CLOVER_66_0.cloverRec.S[9651]++;throw new NoViableAltException(LT(1), getFilename());
				}
				}
				}
				__CLOVER_66_0.cloverRec.S[9652]++;tinyeiffel.compiler.ASTDefaut tmp72_AST = null;
				__CLOVER_66_0.cloverRec.S[9653]++;tmp72_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(LT(1));
				__CLOVER_66_0.cloverRec.S[9654]++;astFactory.addASTChild(currentAST, tmp72_AST);
				__CLOVER_66_0.cloverRec.S[9655]++;match(END);
				__CLOVER_66_0.cloverRec.S[9656]++;instr_AST = (tinyeiffel.compiler.ASTDefaut)currentAST.root;
				__CLOVER_66_0.cloverRec.S[9657]++;break;
			}
			case EXCLAMATION:if (!__CLOVER_bool52) {__CLOVER_66_0.cloverRec.S[9658]++;__CLOVER_bool52=true;}
			{
				__CLOVER_66_0.cloverRec.S[9659]++;excl = LT(1);
				__CLOVER_66_0.cloverRec.S[9660]++;excl_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(excl);
				__CLOVER_66_0.cloverRec.S[9661]++;astFactory.addASTChild(currentAST, excl_AST);
				__CLOVER_66_0.cloverRec.S[9662]++;match(EXCLAMATION);
				{
				__CLOVER_66_0.cloverRec.S[9663]++;boolean __CLOVER_bool56=false;switch ( LA(1)) {
				case EXPANDED:if (!__CLOVER_bool56) {__CLOVER_66_0.cloverRec.S[9664]++;__CLOVER_bool56=true;}
				case ID:if (!__CLOVER_bool56) {__CLOVER_66_0.cloverRec.S[9665]++;__CLOVER_bool56=true;}
				case LIKE:if (!__CLOVER_bool56) {__CLOVER_66_0.cloverRec.S[9666]++;__CLOVER_bool56=true;}
				{
					__CLOVER_66_0.cloverRec.S[9667]++;t=type();
					__CLOVER_66_0.cloverRec.S[9668]++;astFactory.addASTChild(currentAST, returnAST);
					__CLOVER_66_0.cloverRec.S[9669]++;break;
				}
				case EXCLAMATION:if (!__CLOVER_bool56) {__CLOVER_66_0.cloverRec.S[9670]++;__CLOVER_bool56=true;}
				{
					__CLOVER_66_0.cloverRec.S[9671]++;break;
				}
				default:if (!__CLOVER_bool56) {__CLOVER_66_0.cloverRec.S[9672]++;__CLOVER_bool56=true;}
				{
					__CLOVER_66_0.cloverRec.S[9673]++;throw new NoViableAltException(LT(1), getFilename());
				}
				}
				}
				__CLOVER_66_0.cloverRec.S[9674]++;excl2 = LT(1);
				__CLOVER_66_0.cloverRec.S[9675]++;excl2_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(excl2);
				__CLOVER_66_0.cloverRec.S[9676]++;astFactory.addASTChild(currentAST, excl2_AST);
				__CLOVER_66_0.cloverRec.S[9677]++;match(EXCLAMATION);
				__CLOVER_66_0.cloverRec.S[9678]++;m = LT(1);
				__CLOVER_66_0.cloverRec.S[9679]++;m_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(m);
				__CLOVER_66_0.cloverRec.S[9680]++;astFactory.addASTChild(currentAST, m_AST);
				__CLOVER_66_0.cloverRec.S[9681]++;match(ID);
				{
				__CLOVER_66_0.cloverRec.S[9682]++;boolean __CLOVER_bool57=false;switch ( LA(1)) {
				case POINT:if (!__CLOVER_bool57) {__CLOVER_66_0.cloverRec.S[9683]++;__CLOVER_bool57=true;}
				{
					__CLOVER_66_0.cloverRec.S[9684]++;p2 = LT(1);
					__CLOVER_66_0.cloverRec.S[9685]++;p2_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(p2);
					__CLOVER_66_0.cloverRec.S[9686]++;astFactory.addASTChild(currentAST, p2_AST);
					__CLOVER_66_0.cloverRec.S[9687]++;match(POINT);
					__CLOVER_66_0.cloverRec.S[9688]++;n = LT(1);
					__CLOVER_66_0.cloverRec.S[9689]++;n_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(n);
					__CLOVER_66_0.cloverRec.S[9690]++;astFactory.addASTChild(currentAST, n_AST);
					__CLOVER_66_0.cloverRec.S[9691]++;match(ID);
					{
					__CLOVER_66_0.cloverRec.S[9692]++;boolean __CLOVER_bool58=false;switch ( LA(1)) {
					case LPAREN:if (!__CLOVER_bool58) {__CLOVER_66_0.cloverRec.S[9693]++;__CLOVER_bool58=true;}
					{
						__CLOVER_66_0.cloverRec.S[9694]++;liste=exec_param();
						__CLOVER_66_0.cloverRec.S[9695]++;astFactory.addASTChild(currentAST, returnAST);
						__CLOVER_66_0.cloverRec.S[9696]++;break;
					}
					case SEMI:if (!__CLOVER_bool58) {__CLOVER_66_0.cloverRec.S[9697]++;__CLOVER_bool58=true;}
					case INVARIANT:if (!__CLOVER_bool58) {__CLOVER_66_0.cloverRec.S[9698]++;__CLOVER_bool58=true;}
					case END:if (!__CLOVER_bool58) {__CLOVER_66_0.cloverRec.S[9699]++;__CLOVER_bool58=true;}
					case ID:if (!__CLOVER_bool58) {__CLOVER_66_0.cloverRec.S[9700]++;__CLOVER_bool58=true;}
					case STRING:if (!__CLOVER_bool58) {__CLOVER_66_0.cloverRec.S[9701]++;__CLOVER_bool58=true;}
					case ELSE:if (!__CLOVER_bool58) {__CLOVER_66_0.cloverRec.S[9702]++;__CLOVER_bool58=true;}
					case ENSURE:if (!__CLOVER_bool58) {__CLOVER_66_0.cloverRec.S[9703]++;__CLOVER_bool58=true;}
					case RESCUE:if (!__CLOVER_bool58) {__CLOVER_66_0.cloverRec.S[9704]++;__CLOVER_bool58=true;}
					case LPARENT:if (!__CLOVER_bool58) {__CLOVER_66_0.cloverRec.S[9705]++;__CLOVER_bool58=true;}
					case INT:if (!__CLOVER_bool58) {__CLOVER_66_0.cloverRec.S[9706]++;__CLOVER_bool58=true;}
					case REAL:if (!__CLOVER_bool58) {__CLOVER_66_0.cloverRec.S[9707]++;__CLOVER_bool58=true;}
					case CHAR:if (!__CLOVER_bool58) {__CLOVER_66_0.cloverRec.S[9708]++;__CLOVER_bool58=true;}
					case FROM:if (!__CLOVER_bool58) {__CLOVER_66_0.cloverRec.S[9709]++;__CLOVER_bool58=true;}
					case VARIANT:if (!__CLOVER_bool58) {__CLOVER_66_0.cloverRec.S[9710]++;__CLOVER_bool58=true;}
					case UNTIL:if (!__CLOVER_bool58) {__CLOVER_66_0.cloverRec.S[9711]++;__CLOVER_bool58=true;}
					case IF:if (!__CLOVER_bool58) {__CLOVER_66_0.cloverRec.S[9712]++;__CLOVER_bool58=true;}
					case ELSEIF:if (!__CLOVER_bool58) {__CLOVER_66_0.cloverRec.S[9713]++;__CLOVER_bool58=true;}
					case EXCLAMATION:if (!__CLOVER_bool58) {__CLOVER_66_0.cloverRec.S[9714]++;__CLOVER_bool58=true;}
					case RETRY:if (!__CLOVER_bool58) {__CLOVER_66_0.cloverRec.S[9715]++;__CLOVER_bool58=true;}
					case INSPECT:if (!__CLOVER_bool58) {__CLOVER_66_0.cloverRec.S[9716]++;__CLOVER_bool58=true;}
					case WHEN:if (!__CLOVER_bool58) {__CLOVER_66_0.cloverRec.S[9717]++;__CLOVER_bool58=true;}
					case CHECK:if (!__CLOVER_bool58) {__CLOVER_66_0.cloverRec.S[9718]++;__CLOVER_bool58=true;}
					case DEBUG:if (!__CLOVER_bool58) {__CLOVER_66_0.cloverRec.S[9719]++;__CLOVER_bool58=true;}
					case STRING2:if (!__CLOVER_bool58) {__CLOVER_66_0.cloverRec.S[9720]++;__CLOVER_bool58=true;}
					{
						__CLOVER_66_0.cloverRec.S[9721]++;break;
					}
					default:if (!__CLOVER_bool58) {__CLOVER_66_0.cloverRec.S[9722]++;__CLOVER_bool58=true;}
					{
						__CLOVER_66_0.cloverRec.S[9723]++;throw new NoViableAltException(LT(1), getFilename());
					}
					}
					}
					__CLOVER_66_0.cloverRec.S[9724]++;break;
				}
				case SEMI:if (!__CLOVER_bool57) {__CLOVER_66_0.cloverRec.S[9725]++;__CLOVER_bool57=true;}
				case INVARIANT:if (!__CLOVER_bool57) {__CLOVER_66_0.cloverRec.S[9726]++;__CLOVER_bool57=true;}
				case END:if (!__CLOVER_bool57) {__CLOVER_66_0.cloverRec.S[9727]++;__CLOVER_bool57=true;}
				case ID:if (!__CLOVER_bool57) {__CLOVER_66_0.cloverRec.S[9728]++;__CLOVER_bool57=true;}
				case STRING:if (!__CLOVER_bool57) {__CLOVER_66_0.cloverRec.S[9729]++;__CLOVER_bool57=true;}
				case ELSE:if (!__CLOVER_bool57) {__CLOVER_66_0.cloverRec.S[9730]++;__CLOVER_bool57=true;}
				case ENSURE:if (!__CLOVER_bool57) {__CLOVER_66_0.cloverRec.S[9731]++;__CLOVER_bool57=true;}
				case RESCUE:if (!__CLOVER_bool57) {__CLOVER_66_0.cloverRec.S[9732]++;__CLOVER_bool57=true;}
				case LPARENT:if (!__CLOVER_bool57) {__CLOVER_66_0.cloverRec.S[9733]++;__CLOVER_bool57=true;}
				case INT:if (!__CLOVER_bool57) {__CLOVER_66_0.cloverRec.S[9734]++;__CLOVER_bool57=true;}
				case REAL:if (!__CLOVER_bool57) {__CLOVER_66_0.cloverRec.S[9735]++;__CLOVER_bool57=true;}
				case CHAR:if (!__CLOVER_bool57) {__CLOVER_66_0.cloverRec.S[9736]++;__CLOVER_bool57=true;}
				case FROM:if (!__CLOVER_bool57) {__CLOVER_66_0.cloverRec.S[9737]++;__CLOVER_bool57=true;}
				case VARIANT:if (!__CLOVER_bool57) {__CLOVER_66_0.cloverRec.S[9738]++;__CLOVER_bool57=true;}
				case UNTIL:if (!__CLOVER_bool57) {__CLOVER_66_0.cloverRec.S[9739]++;__CLOVER_bool57=true;}
				case IF:if (!__CLOVER_bool57) {__CLOVER_66_0.cloverRec.S[9740]++;__CLOVER_bool57=true;}
				case ELSEIF:if (!__CLOVER_bool57) {__CLOVER_66_0.cloverRec.S[9741]++;__CLOVER_bool57=true;}
				case EXCLAMATION:if (!__CLOVER_bool57) {__CLOVER_66_0.cloverRec.S[9742]++;__CLOVER_bool57=true;}
				case RETRY:if (!__CLOVER_bool57) {__CLOVER_66_0.cloverRec.S[9743]++;__CLOVER_bool57=true;}
				case INSPECT:if (!__CLOVER_bool57) {__CLOVER_66_0.cloverRec.S[9744]++;__CLOVER_bool57=true;}
				case WHEN:if (!__CLOVER_bool57) {__CLOVER_66_0.cloverRec.S[9745]++;__CLOVER_bool57=true;}
				case CHECK:if (!__CLOVER_bool57) {__CLOVER_66_0.cloverRec.S[9746]++;__CLOVER_bool57=true;}
				case DEBUG:if (!__CLOVER_bool57) {__CLOVER_66_0.cloverRec.S[9747]++;__CLOVER_bool57=true;}
				case STRING2:if (!__CLOVER_bool57) {__CLOVER_66_0.cloverRec.S[9748]++;__CLOVER_bool57=true;}
				{
					__CLOVER_66_0.cloverRec.S[9749]++;break;
				}
				default:if (!__CLOVER_bool57) {__CLOVER_66_0.cloverRec.S[9750]++;__CLOVER_bool57=true;}
				{
					__CLOVER_66_0.cloverRec.S[9751]++;throw new NoViableAltException(LT(1), getFilename());
				}
				}
				}
				__CLOVER_66_0.cloverRec.S[9752]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2204]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2204]==0&false))) {{
					
								__CLOVER_66_0.cloverRec.S[9753]++;if((((n!=null) && (++__CLOVER_66_0.cloverRec.CT[2205]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2205]==0&false)))
									{__CLOVER_66_0.cloverRec.S[9754]++;res=new Instr_Creation(t,m.getText(),n.getText(),liste);
								}else
									{__CLOVER_66_0.cloverRec.S[9755]++;res=new Instr_Creation(t,m.getText(),null,liste);
								}__CLOVER_66_0.cloverRec.S[9756]++;ajoute_type(t);
								__CLOVER_66_0.cloverRec.S[9757]++;((Instr_Creation)res).texcl1=remplitToken(excl);
								__CLOVER_66_0.cloverRec.S[9758]++;((Instr_Creation)res).texcl2=remplitToken(excl2);
								__CLOVER_66_0.cloverRec.S[9759]++;((Instr_Creation)res).tid=remplitToken(m);
								__CLOVER_66_0.cloverRec.S[9760]++;((Instr_Creation)res).tid2=remplitToken(n);
								__CLOVER_66_0.cloverRec.S[9761]++;((Instr_Creation)res).tpoint=remplitToken(p2);
							
				}
				}__CLOVER_66_0.cloverRec.S[9762]++;instr_AST = (tinyeiffel.compiler.ASTDefaut)currentAST.root;
				__CLOVER_66_0.cloverRec.S[9763]++;break;
			}
			case RETRY:if (!__CLOVER_bool52) {__CLOVER_66_0.cloverRec.S[9764]++;__CLOVER_bool52=true;}
			{
				__CLOVER_66_0.cloverRec.S[9765]++;r2 = LT(1);
				__CLOVER_66_0.cloverRec.S[9766]++;r2_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(r2);
				__CLOVER_66_0.cloverRec.S[9767]++;astFactory.addASTChild(currentAST, r2_AST);
				__CLOVER_66_0.cloverRec.S[9768]++;match(RETRY);
				__CLOVER_66_0.cloverRec.S[9769]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2206]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2206]==0&false))) {{
					
								__CLOVER_66_0.cloverRec.S[9770]++;res=new Instr_Retry();
								__CLOVER_66_0.cloverRec.S[9771]++;((Instr_Retry)res).tretry=remplitToken(r2);
							
				}
				}__CLOVER_66_0.cloverRec.S[9772]++;instr_AST = (tinyeiffel.compiler.ASTDefaut)currentAST.root;
				__CLOVER_66_0.cloverRec.S[9773]++;break;
			}
			case INSPECT:if (!__CLOVER_bool52) {__CLOVER_66_0.cloverRec.S[9774]++;__CLOVER_bool52=true;}
			{
				__CLOVER_66_0.cloverRec.S[9775]++;insp = LT(1);
				__CLOVER_66_0.cloverRec.S[9776]++;insp_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(insp);
				__CLOVER_66_0.cloverRec.S[9777]++;astFactory.addASTChild(currentAST, insp_AST);
				__CLOVER_66_0.cloverRec.S[9778]++;match(INSPECT);
				__CLOVER_66_0.cloverRec.S[9779]++;e=expr();
				__CLOVER_66_0.cloverRec.S[9780]++;astFactory.addASTChild(currentAST, returnAST);
				{
				__CLOVER_66_0.cloverRec.S[9781]++;int _cnt199=0;
				__CLOVER_66_0.cloverRec.S[9782]++;_loop199:
				do {{
					__CLOVER_66_0.cloverRec.S[9783]++;if (((((LA(1)==WHEN)) && (++__CLOVER_66_0.cloverRec.CT[2207]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2207]==0&false))) {{
						__CLOVER_66_0.cloverRec.S[9784]++;when = LT(1);
						__CLOVER_66_0.cloverRec.S[9785]++;when_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(when);
						__CLOVER_66_0.cloverRec.S[9786]++;astFactory.addASTChild(currentAST, when_AST);
						__CLOVER_66_0.cloverRec.S[9787]++;match(WHEN);
						__CLOVER_66_0.cloverRec.S[9788]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2208]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2208]==0&false))) {{
							__CLOVER_66_0.cloverRec.S[9789]++;liste=new Vector();__CLOVER_66_0.cloverRec.S[9790]++;liste3=new Vector();
						}
						}__CLOVER_66_0.cloverRec.S[9791]++;liste2=expr_when();
						__CLOVER_66_0.cloverRec.S[9792]++;astFactory.addASTChild(currentAST, returnAST);
						__CLOVER_66_0.cloverRec.S[9793]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2209]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2209]==0&false))) {{
							__CLOVER_66_0.cloverRec.S[9794]++;liste.addElement(liste2);
						}
						}{
						__CLOVER_66_0.cloverRec.S[9795]++;_loop194:
						do {{
							__CLOVER_66_0.cloverRec.S[9796]++;if (((((LA(1)==VIRGULE)) && (++__CLOVER_66_0.cloverRec.CT[2210]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2210]==0&false))) {{
								__CLOVER_66_0.cloverRec.S[9797]++;tinyeiffel.compiler.ASTDefaut tmp73_AST = null;
								__CLOVER_66_0.cloverRec.S[9798]++;tmp73_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(LT(1));
								__CLOVER_66_0.cloverRec.S[9799]++;astFactory.addASTChild(currentAST, tmp73_AST);
								__CLOVER_66_0.cloverRec.S[9800]++;match(VIRGULE);
								__CLOVER_66_0.cloverRec.S[9801]++;liste2=expr_when();
								__CLOVER_66_0.cloverRec.S[9802]++;astFactory.addASTChild(currentAST, returnAST);
								__CLOVER_66_0.cloverRec.S[9803]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2211]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2211]==0&false))) {{
									__CLOVER_66_0.cloverRec.S[9804]++;liste.addElement(liste2);
								}
							}}
							}else {{
								__CLOVER_66_0.cloverRec.S[9805]++;break _loop194;
							}
							
						}} }while (true);
						}
						__CLOVER_66_0.cloverRec.S[9806]++;then = LT(1);
						__CLOVER_66_0.cloverRec.S[9807]++;then_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(then);
						__CLOVER_66_0.cloverRec.S[9808]++;astFactory.addASTChild(currentAST, then_AST);
						__CLOVER_66_0.cloverRec.S[9809]++;match(THEN);
						{
						__CLOVER_66_0.cloverRec.S[9810]++;_loop198:
						do {{
							__CLOVER_66_0.cloverRec.S[9811]++;if (((((_tokenSet_9.member(LA(1)))) && (++__CLOVER_66_0.cloverRec.CT[2212]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2212]==0&false))) {{
								__CLOVER_66_0.cloverRec.S[9812]++;inst=instr();
								__CLOVER_66_0.cloverRec.S[9813]++;astFactory.addASTChild(currentAST, returnAST);
								__CLOVER_66_0.cloverRec.S[9814]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2213]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2213]==0&false))) {{
									__CLOVER_66_0.cloverRec.S[9815]++;liste3.addElement(inst);
								}
								}{
								__CLOVER_66_0.cloverRec.S[9816]++;_loop197:
								do {{
									__CLOVER_66_0.cloverRec.S[9817]++;if (((((LA(1)==SEMI)) && (++__CLOVER_66_0.cloverRec.CT[2214]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2214]==0&false))) {{
										__CLOVER_66_0.cloverRec.S[9818]++;match(SEMI);
									}
									}else {{
										__CLOVER_66_0.cloverRec.S[9819]++;break _loop197;
									}
									
								}} }while (true);
								}
							}
							}else {{
								__CLOVER_66_0.cloverRec.S[9820]++;break _loop198;
							}
							
						}} }while (true);
						}
						__CLOVER_66_0.cloverRec.S[9821]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2215]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2215]==0&false))) {{
							
										__CLOVER_66_0.cloverRec.S[9822]++;inst=new Instr_Inspect(e,liste,liste3);
										__CLOVER_66_0.cloverRec.S[9823]++;((Instr_Inspect)inst).tinspect=remplitToken(insp);
										__CLOVER_66_0.cloverRec.S[9824]++;((Instr_Inspect)inst).twhen=remplitToken(when);
										__CLOVER_66_0.cloverRec.S[9825]++;((Instr_Inspect)inst).tthen=remplitToken(then);
										__CLOVER_66_0.cloverRec.S[9826]++;if((((derniere_instr==null) && (++__CLOVER_66_0.cloverRec.CT[2216]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2216]==0&false)))
										{{
											__CLOVER_66_0.cloverRec.S[9827]++;derniere_instr=res=inst;
										}
										}else
										{{
											__CLOVER_66_0.cloverRec.S[9828]++;((Suite)derniere_instr).setSuivant(inst);
											__CLOVER_66_0.cloverRec.S[9829]++;derniere_instr=inst;
										}
									
						}}
					}}
					}else {{
						__CLOVER_66_0.cloverRec.S[9830]++;if ( (((_cnt199>=1 ) && (++__CLOVER_66_0.cloverRec.CT[2217]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2217]==0&false))) {{ __CLOVER_66_0.cloverRec.S[9831]++;break _loop199; } }else {{__CLOVER_66_0.cloverRec.S[9832]++;throw new NoViableAltException(LT(1), getFilename());}
					}}
					
					}__CLOVER_66_0.cloverRec.S[9833]++;_cnt199++;
				} }while (true);
				}
				{
				__CLOVER_66_0.cloverRec.S[9834]++;boolean __CLOVER_bool59=false;switch ( LA(1)) {
				case ELSE:if (!__CLOVER_bool59) {__CLOVER_66_0.cloverRec.S[9835]++;__CLOVER_bool59=true;}
				{
					__CLOVER_66_0.cloverRec.S[9836]++;else2 = LT(1);
					__CLOVER_66_0.cloverRec.S[9837]++;else2_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(else2);
					__CLOVER_66_0.cloverRec.S[9838]++;astFactory.addASTChild(currentAST, else2_AST);
					__CLOVER_66_0.cloverRec.S[9839]++;match(ELSE);
					__CLOVER_66_0.cloverRec.S[9840]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2218]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2218]==0&false))) {{
						__CLOVER_66_0.cloverRec.S[9841]++;liste=new Vector();__CLOVER_66_0.cloverRec.S[9842]++;liste3=new Vector();
					}
					}{
					__CLOVER_66_0.cloverRec.S[9843]++;_loop204:
					do {{
						__CLOVER_66_0.cloverRec.S[9844]++;if (((((_tokenSet_9.member(LA(1)))) && (++__CLOVER_66_0.cloverRec.CT[2219]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2219]==0&false))) {{
							__CLOVER_66_0.cloverRec.S[9845]++;inst=instr();
							__CLOVER_66_0.cloverRec.S[9846]++;astFactory.addASTChild(currentAST, returnAST);
							__CLOVER_66_0.cloverRec.S[9847]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2220]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2220]==0&false))) {{
								__CLOVER_66_0.cloverRec.S[9848]++;liste3.addElement(inst);
							}
							}{
							__CLOVER_66_0.cloverRec.S[9849]++;_loop203:
							do {{
								__CLOVER_66_0.cloverRec.S[9850]++;if (((((LA(1)==SEMI)) && (++__CLOVER_66_0.cloverRec.CT[2221]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2221]==0&false))) {{
									__CLOVER_66_0.cloverRec.S[9851]++;match(SEMI);
								}
								}else {{
									__CLOVER_66_0.cloverRec.S[9852]++;break _loop203;
								}
								
							}} }while (true);
							}
						}
						}else {{
							__CLOVER_66_0.cloverRec.S[9853]++;break _loop204;
						}
						
					}} }while (true);
					}
					__CLOVER_66_0.cloverRec.S[9854]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2222]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2222]==0&false))) {{
						
									__CLOVER_66_0.cloverRec.S[9855]++;inst=new Instr_Inspect(e,liste,liste3);
									__CLOVER_66_0.cloverRec.S[9856]++;((Instr_Inspect)inst).tinspect=remplitToken(insp);
									__CLOVER_66_0.cloverRec.S[9857]++;((Instr_Inspect)inst).twhen=remplitToken(else2);
									//assert(derniere_instr!=null)
									__CLOVER_66_0.cloverRec.S[9858]++;((Suite)derniere_instr).setSuivant(inst);
									__CLOVER_66_0.cloverRec.S[9859]++;derniere_instr=inst;
								
					}
					}__CLOVER_66_0.cloverRec.S[9860]++;break;
				}
				case END:if (!__CLOVER_bool59) {__CLOVER_66_0.cloverRec.S[9861]++;__CLOVER_bool59=true;}
				{
					__CLOVER_66_0.cloverRec.S[9862]++;break;
				}
				default:if (!__CLOVER_bool59) {__CLOVER_66_0.cloverRec.S[9863]++;__CLOVER_bool59=true;}
				{
					__CLOVER_66_0.cloverRec.S[9864]++;throw new NoViableAltException(LT(1), getFilename());
				}
				}
				}
				__CLOVER_66_0.cloverRec.S[9865]++;tinyeiffel.compiler.ASTDefaut tmp76_AST = null;
				__CLOVER_66_0.cloverRec.S[9866]++;tmp76_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(LT(1));
				__CLOVER_66_0.cloverRec.S[9867]++;astFactory.addASTChild(currentAST, tmp76_AST);
				__CLOVER_66_0.cloverRec.S[9868]++;match(END);
				__CLOVER_66_0.cloverRec.S[9869]++;instr_AST = (tinyeiffel.compiler.ASTDefaut)currentAST.root;
				__CLOVER_66_0.cloverRec.S[9870]++;break;
			}
			case CHECK:if (!__CLOVER_bool52) {__CLOVER_66_0.cloverRec.S[9871]++;__CLOVER_bool52=true;}
			{
				__CLOVER_66_0.cloverRec.S[9872]++;ch = LT(1);
				__CLOVER_66_0.cloverRec.S[9873]++;ch_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(ch);
				__CLOVER_66_0.cloverRec.S[9874]++;astFactory.addASTChild(currentAST, ch_AST);
				__CLOVER_66_0.cloverRec.S[9875]++;match(CHECK);
				__CLOVER_66_0.cloverRec.S[9876]++;liste=liste_assert();
				__CLOVER_66_0.cloverRec.S[9877]++;astFactory.addASTChild(currentAST, returnAST);
				__CLOVER_66_0.cloverRec.S[9878]++;en2 = LT(1);
				__CLOVER_66_0.cloverRec.S[9879]++;en2_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(en2);
				__CLOVER_66_0.cloverRec.S[9880]++;astFactory.addASTChild(currentAST, en2_AST);
				__CLOVER_66_0.cloverRec.S[9881]++;match(END);
				__CLOVER_66_0.cloverRec.S[9882]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2223]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2223]==0&false))) {{
					
								__CLOVER_66_0.cloverRec.S[9883]++;res=new Instr_Check(liste);
								__CLOVER_66_0.cloverRec.S[9884]++;((Instr_Check)res).tcheck=remplitToken(ch);
								__CLOVER_66_0.cloverRec.S[9885]++;((Instr_Check)res).tend=remplitToken(en2);
							
				}
				}__CLOVER_66_0.cloverRec.S[9886]++;instr_AST = (tinyeiffel.compiler.ASTDefaut)currentAST.root;
				__CLOVER_66_0.cloverRec.S[9887]++;break;
			}
			case DEBUG:if (!__CLOVER_bool52) {__CLOVER_66_0.cloverRec.S[9888]++;__CLOVER_bool52=true;}
			{
				__CLOVER_66_0.cloverRec.S[9889]++;d = LT(1);
				__CLOVER_66_0.cloverRec.S[9890]++;d_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(d);
				__CLOVER_66_0.cloverRec.S[9891]++;astFactory.addASTChild(currentAST, d_AST);
				__CLOVER_66_0.cloverRec.S[9892]++;match(DEBUG);
				{
				__CLOVER_66_0.cloverRec.S[9893]++;boolean __CLOVER_bool60=false;switch ( LA(1)) {
				case LPAREN:if (!__CLOVER_bool60) {__CLOVER_66_0.cloverRec.S[9894]++;__CLOVER_bool60=true;}
				{
					__CLOVER_66_0.cloverRec.S[9895]++;tinyeiffel.compiler.ASTDefaut tmp77_AST = null;
					__CLOVER_66_0.cloverRec.S[9896]++;tmp77_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(LT(1));
					__CLOVER_66_0.cloverRec.S[9897]++;astFactory.addASTChild(currentAST, tmp77_AST);
					__CLOVER_66_0.cloverRec.S[9898]++;match(LPAREN);
					__CLOVER_66_0.cloverRec.S[9899]++;s1=string();
					__CLOVER_66_0.cloverRec.S[9900]++;astFactory.addASTChild(currentAST, returnAST);
					__CLOVER_66_0.cloverRec.S[9901]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2224]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2224]==0&false))) {{
						__CLOVER_66_0.cloverRec.S[9902]++;liste2.addElement(s1);
					}
					}{
					__CLOVER_66_0.cloverRec.S[9903]++;_loop207:
					do {{
						__CLOVER_66_0.cloverRec.S[9904]++;if (((((LA(1)==VIRGULE)) && (++__CLOVER_66_0.cloverRec.CT[2225]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2225]==0&false))) {{
							__CLOVER_66_0.cloverRec.S[9905]++;tinyeiffel.compiler.ASTDefaut tmp78_AST = null;
							__CLOVER_66_0.cloverRec.S[9906]++;tmp78_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(LT(1));
							__CLOVER_66_0.cloverRec.S[9907]++;astFactory.addASTChild(currentAST, tmp78_AST);
							__CLOVER_66_0.cloverRec.S[9908]++;match(VIRGULE);
							__CLOVER_66_0.cloverRec.S[9909]++;s2=string();
							__CLOVER_66_0.cloverRec.S[9910]++;astFactory.addASTChild(currentAST, returnAST);
							__CLOVER_66_0.cloverRec.S[9911]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2226]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2226]==0&false))) {{
								__CLOVER_66_0.cloverRec.S[9912]++;liste2.addElement(s2);
							}
						}}
						}else {{
							__CLOVER_66_0.cloverRec.S[9913]++;break _loop207;
						}
						
					}} }while (true);
					}
					__CLOVER_66_0.cloverRec.S[9914]++;tinyeiffel.compiler.ASTDefaut tmp79_AST = null;
					__CLOVER_66_0.cloverRec.S[9915]++;tmp79_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(LT(1));
					__CLOVER_66_0.cloverRec.S[9916]++;astFactory.addASTChild(currentAST, tmp79_AST);
					__CLOVER_66_0.cloverRec.S[9917]++;match(RPAREN);
					__CLOVER_66_0.cloverRec.S[9918]++;break;
				}
				case END:if (!__CLOVER_bool60) {__CLOVER_66_0.cloverRec.S[9919]++;__CLOVER_bool60=true;}
				case ID:if (!__CLOVER_bool60) {__CLOVER_66_0.cloverRec.S[9920]++;__CLOVER_bool60=true;}
				case STRING:if (!__CLOVER_bool60) {__CLOVER_66_0.cloverRec.S[9921]++;__CLOVER_bool60=true;}
				case LPARENT:if (!__CLOVER_bool60) {__CLOVER_66_0.cloverRec.S[9922]++;__CLOVER_bool60=true;}
				case INT:if (!__CLOVER_bool60) {__CLOVER_66_0.cloverRec.S[9923]++;__CLOVER_bool60=true;}
				case REAL:if (!__CLOVER_bool60) {__CLOVER_66_0.cloverRec.S[9924]++;__CLOVER_bool60=true;}
				case CHAR:if (!__CLOVER_bool60) {__CLOVER_66_0.cloverRec.S[9925]++;__CLOVER_bool60=true;}
				case FROM:if (!__CLOVER_bool60) {__CLOVER_66_0.cloverRec.S[9926]++;__CLOVER_bool60=true;}
				case IF:if (!__CLOVER_bool60) {__CLOVER_66_0.cloverRec.S[9927]++;__CLOVER_bool60=true;}
				case EXCLAMATION:if (!__CLOVER_bool60) {__CLOVER_66_0.cloverRec.S[9928]++;__CLOVER_bool60=true;}
				case RETRY:if (!__CLOVER_bool60) {__CLOVER_66_0.cloverRec.S[9929]++;__CLOVER_bool60=true;}
				case INSPECT:if (!__CLOVER_bool60) {__CLOVER_66_0.cloverRec.S[9930]++;__CLOVER_bool60=true;}
				case CHECK:if (!__CLOVER_bool60) {__CLOVER_66_0.cloverRec.S[9931]++;__CLOVER_bool60=true;}
				case DEBUG:if (!__CLOVER_bool60) {__CLOVER_66_0.cloverRec.S[9932]++;__CLOVER_bool60=true;}
				case STRING2:if (!__CLOVER_bool60) {__CLOVER_66_0.cloverRec.S[9933]++;__CLOVER_bool60=true;}
				{
					__CLOVER_66_0.cloverRec.S[9934]++;break;
				}
				default:if (!__CLOVER_bool60) {__CLOVER_66_0.cloverRec.S[9935]++;__CLOVER_bool60=true;}
				{
					__CLOVER_66_0.cloverRec.S[9936]++;throw new NoViableAltException(LT(1), getFilename());
				}
				}
				}
				{
				__CLOVER_66_0.cloverRec.S[9937]++;_loop211:
				do {{
					__CLOVER_66_0.cloverRec.S[9938]++;if (((((_tokenSet_9.member(LA(1)))) && (++__CLOVER_66_0.cloverRec.CT[2227]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2227]==0&false))) {{
						__CLOVER_66_0.cloverRec.S[9939]++;inst=instr();
						__CLOVER_66_0.cloverRec.S[9940]++;astFactory.addASTChild(currentAST, returnAST);
						__CLOVER_66_0.cloverRec.S[9941]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2228]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2228]==0&false))) {{
							__CLOVER_66_0.cloverRec.S[9942]++;liste.addElement(inst);
						}
						}{
						__CLOVER_66_0.cloverRec.S[9943]++;_loop210:
						do {{
							__CLOVER_66_0.cloverRec.S[9944]++;if (((((LA(1)==SEMI)) && (++__CLOVER_66_0.cloverRec.CT[2229]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2229]==0&false))) {{
								__CLOVER_66_0.cloverRec.S[9945]++;match(SEMI);
							}
							}else {{
								__CLOVER_66_0.cloverRec.S[9946]++;break _loop210;
							}
							
						}} }while (true);
						}
					}
					}else {{
						__CLOVER_66_0.cloverRec.S[9947]++;break _loop211;
					}
					
				}} }while (true);
				}
				__CLOVER_66_0.cloverRec.S[9948]++;en = LT(1);
				__CLOVER_66_0.cloverRec.S[9949]++;en_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(en);
				__CLOVER_66_0.cloverRec.S[9950]++;astFactory.addASTChild(currentAST, en_AST);
				__CLOVER_66_0.cloverRec.S[9951]++;match(END);
				__CLOVER_66_0.cloverRec.S[9952]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2230]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2230]==0&false))) {{
					
								__CLOVER_66_0.cloverRec.S[9953]++;res=new Instr_Debug(liste2,liste);
								__CLOVER_66_0.cloverRec.S[9954]++;((Instr_Debug)res).tdebug=remplitToken(d);
								__CLOVER_66_0.cloverRec.S[9955]++;((Instr_Debug)res).tend=remplitToken(en);
							
				}
				}__CLOVER_66_0.cloverRec.S[9956]++;instr_AST = (tinyeiffel.compiler.ASTDefaut)currentAST.root;
				__CLOVER_66_0.cloverRec.S[9957]++;break;
			}
			default:if (!__CLOVER_bool52) {__CLOVER_66_0.cloverRec.S[9958]++;__CLOVER_bool52=true;}
				__CLOVER_66_0.cloverRec.S[9959]++;boolean synPredMatched153 = false;
				__CLOVER_66_0.cloverRec.S[9960]++;if ((((((LA(1)==ID) && (LA(2)==POINT||LA(2)==AFFECT) && (_tokenSet_1.member(LA(3))) && (_tokenSet_10.member(LA(4))))) && (++__CLOVER_66_0.cloverRec.CT[2231]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2231]==0&false))) {{
					__CLOVER_66_0.cloverRec.S[9961]++;int _m153 = mark();
					__CLOVER_66_0.cloverRec.S[9962]++;synPredMatched153 = true;
					__CLOVER_66_0.cloverRec.S[9963]++;inputState.guessing++;
					__CLOVER_66_0.cloverRec.S[9964]++;try {
						{
						{
						__CLOVER_66_0.cloverRec.S[9965]++;if (((((LA(1)==ID) && (LA(2)==POINT)) && (++__CLOVER_66_0.cloverRec.CT[2232]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2232]==0&false))) {{
							__CLOVER_66_0.cloverRec.S[9966]++;match(ID);
							__CLOVER_66_0.cloverRec.S[9967]++;match(POINT);
						}
						}else {__CLOVER_66_0.cloverRec.S[9968]++;if (((((LA(1)==ID) && (LA(2)==AFFECT)) && (++__CLOVER_66_0.cloverRec.CT[2233]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2233]==0&false))) {{
						}
						}else {{
							__CLOVER_66_0.cloverRec.S[9969]++;throw new NoViableAltException(LT(1), getFilename());
						}
						
						}}}
						__CLOVER_66_0.cloverRec.S[9970]++;match(ID);
						__CLOVER_66_0.cloverRec.S[9971]++;match(AFFECT);
						}
					}
					catch (RecognitionException pe) {
						__CLOVER_66_0.cloverRec.S[9972]++;synPredMatched153 = false;
					}
					__CLOVER_66_0.cloverRec.S[9973]++;rewind(_m153);
					__CLOVER_66_0.cloverRec.S[9974]++;inputState.guessing--;
				}
				}__CLOVER_66_0.cloverRec.S[9975]++;if ( (((synPredMatched153 ) && (++__CLOVER_66_0.cloverRec.CT[2234]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2234]==0&false))) {{
					__CLOVER_66_0.cloverRec.S[9976]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2235]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2235]==0&false))) {{
						__CLOVER_66_0.cloverRec.S[9977]++;current_present=false;
					}
					}{
					__CLOVER_66_0.cloverRec.S[9978]++;if (((((LA(1)==ID) && (LA(2)==POINT)) && (++__CLOVER_66_0.cloverRec.CT[2236]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2236]==0&false))) {{
						__CLOVER_66_0.cloverRec.S[9979]++;cur1 = LT(1);
						__CLOVER_66_0.cloverRec.S[9980]++;cur1_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(cur1);
						__CLOVER_66_0.cloverRec.S[9981]++;astFactory.addASTChild(currentAST, cur1_AST);
						__CLOVER_66_0.cloverRec.S[9982]++;match(ID);
						__CLOVER_66_0.cloverRec.S[9983]++;tinyeiffel.compiler.ASTDefaut tmp81_AST = null;
						__CLOVER_66_0.cloverRec.S[9984]++;tmp81_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(LT(1));
						__CLOVER_66_0.cloverRec.S[9985]++;astFactory.addASTChild(currentAST, tmp81_AST);
						__CLOVER_66_0.cloverRec.S[9986]++;match(POINT);
						__CLOVER_66_0.cloverRec.S[9987]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2237]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2237]==0&false))) {{
							__CLOVER_66_0.cloverRec.S[9988]++;current_present=true;
						}
					}}
					}else {__CLOVER_66_0.cloverRec.S[9989]++;if (((((LA(1)==ID) && (LA(2)==AFFECT)) && (++__CLOVER_66_0.cloverRec.CT[2238]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2238]==0&false))) {{
					}
					}else {{
						__CLOVER_66_0.cloverRec.S[9990]++;throw new NoViableAltException(LT(1), getFilename());
					}
					
					}}}
					__CLOVER_66_0.cloverRec.S[9991]++;i = LT(1);
					__CLOVER_66_0.cloverRec.S[9992]++;i_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(i);
					__CLOVER_66_0.cloverRec.S[9993]++;astFactory.addASTChild(currentAST, i_AST);
					__CLOVER_66_0.cloverRec.S[9994]++;match(ID);
					__CLOVER_66_0.cloverRec.S[9995]++;aff = LT(1);
					__CLOVER_66_0.cloverRec.S[9996]++;aff_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(aff);
					__CLOVER_66_0.cloverRec.S[9997]++;astFactory.makeASTRoot(currentAST, aff_AST);
					__CLOVER_66_0.cloverRec.S[9998]++;match(AFFECT);
					__CLOVER_66_0.cloverRec.S[9999]++;e=expr();
					__CLOVER_66_0.cloverRec.S[10000]++;astFactory.addASTChild(currentAST, returnAST);
					__CLOVER_66_0.cloverRec.S[10001]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2239]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2239]==0&false))) {{
						
										//{System.out.println("Suite22");}
										__CLOVER_66_0.cloverRec.S[10002]++;res=new Instr_Affect(i.getText(),e);
										__CLOVER_66_0.cloverRec.S[10003]++;((Instr_Affect)res).set_token(remplitToken(i),remplitToken(aff));
										__CLOVER_66_0.cloverRec.S[10004]++;if((((current_present) && (++__CLOVER_66_0.cloverRec.CT[2240]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2240]==0&false)))
										{{
											__CLOVER_66_0.cloverRec.S[10005]++;( (Instr_Affect)res).tcurrent=remplitToken(cur1);
											__CLOVER_66_0.cloverRec.S[10006]++;((Instr_Affect)res).var_current=cur1.getText();
										}
									
					}}
					}__CLOVER_66_0.cloverRec.S[10007]++;instr_AST = (tinyeiffel.compiler.ASTDefaut)currentAST.root;
				}
				}else {{
					__CLOVER_66_0.cloverRec.S[10008]++;boolean synPredMatched157 = false;
					__CLOVER_66_0.cloverRec.S[10009]++;if ((((((LA(1)==ID) && (LA(2)==POINT||LA(2)==TENTATIVE_AFFECT) && (_tokenSet_1.member(LA(3))) && (_tokenSet_11.member(LA(4))))) && (++__CLOVER_66_0.cloverRec.CT[2241]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2241]==0&false))) {{
						__CLOVER_66_0.cloverRec.S[10010]++;int _m157 = mark();
						__CLOVER_66_0.cloverRec.S[10011]++;synPredMatched157 = true;
						__CLOVER_66_0.cloverRec.S[10012]++;inputState.guessing++;
						__CLOVER_66_0.cloverRec.S[10013]++;try {
							{
							{
							__CLOVER_66_0.cloverRec.S[10014]++;if (((((LA(1)==ID) && (LA(2)==POINT)) && (++__CLOVER_66_0.cloverRec.CT[2242]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2242]==0&false))) {{
								__CLOVER_66_0.cloverRec.S[10015]++;match(ID);
								__CLOVER_66_0.cloverRec.S[10016]++;match(POINT);
							}
							}else {__CLOVER_66_0.cloverRec.S[10017]++;if (((((LA(1)==ID) && (LA(2)==TENTATIVE_AFFECT)) && (++__CLOVER_66_0.cloverRec.CT[2243]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2243]==0&false))) {{
							}
							}else {{
								__CLOVER_66_0.cloverRec.S[10018]++;throw new NoViableAltException(LT(1), getFilename());
							}
							
							}}}
							__CLOVER_66_0.cloverRec.S[10019]++;match(ID);
							__CLOVER_66_0.cloverRec.S[10020]++;match(TENTATIVE_AFFECT);
							}
						}
						catch (RecognitionException pe) {
							__CLOVER_66_0.cloverRec.S[10021]++;synPredMatched157 = false;
						}
						__CLOVER_66_0.cloverRec.S[10022]++;rewind(_m157);
						__CLOVER_66_0.cloverRec.S[10023]++;inputState.guessing--;
					}
					}__CLOVER_66_0.cloverRec.S[10024]++;if ( (((synPredMatched157 ) && (++__CLOVER_66_0.cloverRec.CT[2244]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2244]==0&false))) {{
						__CLOVER_66_0.cloverRec.S[10025]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2245]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2245]==0&false))) {{
							__CLOVER_66_0.cloverRec.S[10026]++;current_present=false;
						}
						}{
						__CLOVER_66_0.cloverRec.S[10027]++;if (((((LA(1)==ID) && (LA(2)==POINT)) && (++__CLOVER_66_0.cloverRec.CT[2246]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2246]==0&false))) {{
							__CLOVER_66_0.cloverRec.S[10028]++;cur2 = LT(1);
							__CLOVER_66_0.cloverRec.S[10029]++;cur2_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(cur2);
							__CLOVER_66_0.cloverRec.S[10030]++;astFactory.addASTChild(currentAST, cur2_AST);
							__CLOVER_66_0.cloverRec.S[10031]++;match(ID);
							__CLOVER_66_0.cloverRec.S[10032]++;tinyeiffel.compiler.ASTDefaut tmp82_AST = null;
							__CLOVER_66_0.cloverRec.S[10033]++;tmp82_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(LT(1));
							__CLOVER_66_0.cloverRec.S[10034]++;astFactory.addASTChild(currentAST, tmp82_AST);
							__CLOVER_66_0.cloverRec.S[10035]++;match(POINT);
							__CLOVER_66_0.cloverRec.S[10036]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2247]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2247]==0&false))) {{
								__CLOVER_66_0.cloverRec.S[10037]++;current_present=true;
							}
						}}
						}else {__CLOVER_66_0.cloverRec.S[10038]++;if (((((LA(1)==ID) && (LA(2)==TENTATIVE_AFFECT)) && (++__CLOVER_66_0.cloverRec.CT[2248]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2248]==0&false))) {{
						}
						}else {{
							__CLOVER_66_0.cloverRec.S[10039]++;throw new NoViableAltException(LT(1), getFilename());
						}
						
						}}}
						__CLOVER_66_0.cloverRec.S[10040]++;j = LT(1);
						__CLOVER_66_0.cloverRec.S[10041]++;j_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(j);
						__CLOVER_66_0.cloverRec.S[10042]++;astFactory.addASTChild(currentAST, j_AST);
						__CLOVER_66_0.cloverRec.S[10043]++;match(ID);
						__CLOVER_66_0.cloverRec.S[10044]++;taff = LT(1);
						__CLOVER_66_0.cloverRec.S[10045]++;taff_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(taff);
						__CLOVER_66_0.cloverRec.S[10046]++;astFactory.addASTChild(currentAST, taff_AST);
						__CLOVER_66_0.cloverRec.S[10047]++;match(TENTATIVE_AFFECT);
						__CLOVER_66_0.cloverRec.S[10048]++;e2=expr();
						__CLOVER_66_0.cloverRec.S[10049]++;astFactory.addASTChild(currentAST, returnAST);
						__CLOVER_66_0.cloverRec.S[10050]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2249]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2249]==0&false))) {{
							
											__CLOVER_66_0.cloverRec.S[10051]++;res=new Instr_TentAffect(j.getText(),e2);
											__CLOVER_66_0.cloverRec.S[10052]++;((Instr_TentAffect)res).set_token(remplitToken(j),remplitToken(taff));
											__CLOVER_66_0.cloverRec.S[10053]++;if((((current_present) && (++__CLOVER_66_0.cloverRec.CT[2250]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2250]==0&false)))
											{{
												__CLOVER_66_0.cloverRec.S[10054]++;((Instr_TentAffect)res).tcurrent=remplitToken(cur2);
												__CLOVER_66_0.cloverRec.S[10055]++;((Instr_TentAffect)res).var_current=cur2.getText();
											}
										
						}}
						}__CLOVER_66_0.cloverRec.S[10056]++;instr_AST = (tinyeiffel.compiler.ASTDefaut)currentAST.root;
					}
					}else {__CLOVER_66_0.cloverRec.S[10057]++;if (((((_tokenSet_12.member(LA(1))) && (_tokenSet_13.member(LA(2))) && (_tokenSet_14.member(LA(3))) && (_tokenSet_15.member(LA(4)))) && (++__CLOVER_66_0.cloverRec.CT[2251]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2251]==0&false))) {{
						{
						__CLOVER_66_0.cloverRec.S[10058]++;boolean __CLOVER_bool61=false;switch ( LA(1)) {
						case ID:if (!__CLOVER_bool61) {__CLOVER_66_0.cloverRec.S[10059]++;__CLOVER_bool61=true;}
						{
							__CLOVER_66_0.cloverRec.S[10060]++;k = LT(1);
							__CLOVER_66_0.cloverRec.S[10061]++;k_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(k);
							__CLOVER_66_0.cloverRec.S[10062]++;astFactory.addASTChild(currentAST, k_AST);
							__CLOVER_66_0.cloverRec.S[10063]++;match(ID);
							__CLOVER_66_0.cloverRec.S[10064]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2252]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2252]==0&false))) {{
								__CLOVER_66_0.cloverRec.S[10065]++;liste=new Vector();
							}
							}{
							__CLOVER_66_0.cloverRec.S[10066]++;boolean __CLOVER_bool62=false;switch ( LA(1)) {
							case LPAREN:if (!__CLOVER_bool62) {__CLOVER_66_0.cloverRec.S[10067]++;__CLOVER_bool62=true;}
							{
								__CLOVER_66_0.cloverRec.S[10068]++;liste=exec_param();
								__CLOVER_66_0.cloverRec.S[10069]++;astFactory.addASTChild(currentAST, returnAST);
								__CLOVER_66_0.cloverRec.S[10070]++;break;
							}
							case SEMI:if (!__CLOVER_bool62) {__CLOVER_66_0.cloverRec.S[10071]++;__CLOVER_bool62=true;}
							case INVARIANT:if (!__CLOVER_bool62) {__CLOVER_66_0.cloverRec.S[10072]++;__CLOVER_bool62=true;}
							case END:if (!__CLOVER_bool62) {__CLOVER_66_0.cloverRec.S[10073]++;__CLOVER_bool62=true;}
							case ID:if (!__CLOVER_bool62) {__CLOVER_66_0.cloverRec.S[10074]++;__CLOVER_bool62=true;}
							case STRING:if (!__CLOVER_bool62) {__CLOVER_66_0.cloverRec.S[10075]++;__CLOVER_bool62=true;}
							case ELSE:if (!__CLOVER_bool62) {__CLOVER_66_0.cloverRec.S[10076]++;__CLOVER_bool62=true;}
							case ENSURE:if (!__CLOVER_bool62) {__CLOVER_66_0.cloverRec.S[10077]++;__CLOVER_bool62=true;}
							case RESCUE:if (!__CLOVER_bool62) {__CLOVER_66_0.cloverRec.S[10078]++;__CLOVER_bool62=true;}
							case POINT:if (!__CLOVER_bool62) {__CLOVER_66_0.cloverRec.S[10079]++;__CLOVER_bool62=true;}
							case LPARENT:if (!__CLOVER_bool62) {__CLOVER_66_0.cloverRec.S[10080]++;__CLOVER_bool62=true;}
							case INT:if (!__CLOVER_bool62) {__CLOVER_66_0.cloverRec.S[10081]++;__CLOVER_bool62=true;}
							case REAL:if (!__CLOVER_bool62) {__CLOVER_66_0.cloverRec.S[10082]++;__CLOVER_bool62=true;}
							case CHAR:if (!__CLOVER_bool62) {__CLOVER_66_0.cloverRec.S[10083]++;__CLOVER_bool62=true;}
							case FROM:if (!__CLOVER_bool62) {__CLOVER_66_0.cloverRec.S[10084]++;__CLOVER_bool62=true;}
							case VARIANT:if (!__CLOVER_bool62) {__CLOVER_66_0.cloverRec.S[10085]++;__CLOVER_bool62=true;}
							case UNTIL:if (!__CLOVER_bool62) {__CLOVER_66_0.cloverRec.S[10086]++;__CLOVER_bool62=true;}
							case IF:if (!__CLOVER_bool62) {__CLOVER_66_0.cloverRec.S[10087]++;__CLOVER_bool62=true;}
							case ELSEIF:if (!__CLOVER_bool62) {__CLOVER_66_0.cloverRec.S[10088]++;__CLOVER_bool62=true;}
							case EXCLAMATION:if (!__CLOVER_bool62) {__CLOVER_66_0.cloverRec.S[10089]++;__CLOVER_bool62=true;}
							case RETRY:if (!__CLOVER_bool62) {__CLOVER_66_0.cloverRec.S[10090]++;__CLOVER_bool62=true;}
							case INSPECT:if (!__CLOVER_bool62) {__CLOVER_66_0.cloverRec.S[10091]++;__CLOVER_bool62=true;}
							case WHEN:if (!__CLOVER_bool62) {__CLOVER_66_0.cloverRec.S[10092]++;__CLOVER_bool62=true;}
							case CHECK:if (!__CLOVER_bool62) {__CLOVER_66_0.cloverRec.S[10093]++;__CLOVER_bool62=true;}
							case DEBUG:if (!__CLOVER_bool62) {__CLOVER_66_0.cloverRec.S[10094]++;__CLOVER_bool62=true;}
							case STRING2:if (!__CLOVER_bool62) {__CLOVER_66_0.cloverRec.S[10095]++;__CLOVER_bool62=true;}
							{
								__CLOVER_66_0.cloverRec.S[10096]++;break;
							}
							default:if (!__CLOVER_bool62) {__CLOVER_66_0.cloverRec.S[10097]++;__CLOVER_bool62=true;}
							{
								__CLOVER_66_0.cloverRec.S[10098]++;throw new NoViableAltException(LT(1), getFilename());
							}
							}
							}
							__CLOVER_66_0.cloverRec.S[10099]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2253]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2253]==0&false))) {{
								
											__CLOVER_66_0.cloverRec.S[10100]++;res=new Instr_Appel(k.getText(),liste);
											__CLOVER_66_0.cloverRec.S[10101]++;((Instr_Appel)res).tid=remplitToken(k);
											__CLOVER_66_0.cloverRec.S[10102]++;derniere_instr=res;
										
							}
							}__CLOVER_66_0.cloverRec.S[10103]++;break;
						}
						case LPARENT:if (!__CLOVER_bool61) {__CLOVER_66_0.cloverRec.S[10104]++;__CLOVER_bool61=true;}
						{
							__CLOVER_66_0.cloverRec.S[10105]++;tinyeiffel.compiler.ASTDefaut tmp83_AST = null;
							__CLOVER_66_0.cloverRec.S[10106]++;tmp83_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(LT(1));
							__CLOVER_66_0.cloverRec.S[10107]++;astFactory.addASTChild(currentAST, tmp83_AST);
							__CLOVER_66_0.cloverRec.S[10108]++;match(LPARENT);
							__CLOVER_66_0.cloverRec.S[10109]++;e=expr();
							__CLOVER_66_0.cloverRec.S[10110]++;astFactory.addASTChild(currentAST, returnAST);
							__CLOVER_66_0.cloverRec.S[10111]++;tinyeiffel.compiler.ASTDefaut tmp84_AST = null;
							__CLOVER_66_0.cloverRec.S[10112]++;tmp84_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(LT(1));
							__CLOVER_66_0.cloverRec.S[10113]++;astFactory.addASTChild(currentAST, tmp84_AST);
							__CLOVER_66_0.cloverRec.S[10114]++;match(RPARENT);
							__CLOVER_66_0.cloverRec.S[10115]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2254]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2254]==0&false))) {{
								
											__CLOVER_66_0.cloverRec.S[10116]++;res=new Instr_Appel(e);
											__CLOVER_66_0.cloverRec.S[10117]++;derniere_instr=res;
										
							}
							}__CLOVER_66_0.cloverRec.S[10118]++;break;
						}
						case INT:if (!__CLOVER_bool61) {__CLOVER_66_0.cloverRec.S[10119]++;__CLOVER_bool61=true;}
						{
							__CLOVER_66_0.cloverRec.S[10120]++;in = LT(1);
							__CLOVER_66_0.cloverRec.S[10121]++;in_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(in);
							__CLOVER_66_0.cloverRec.S[10122]++;astFactory.addASTChild(currentAST, in_AST);
							__CLOVER_66_0.cloverRec.S[10123]++;match(INT);
							__CLOVER_66_0.cloverRec.S[10124]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2255]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2255]==0&false))) {{
								
											__CLOVER_66_0.cloverRec.S[10125]++;e=new Expr_Entier(in.getText(),remplitToken(in));
											__CLOVER_66_0.cloverRec.S[10126]++;res=new Instr_Appel(e);
											__CLOVER_66_0.cloverRec.S[10127]++;derniere_instr=res;
										
							}
							}__CLOVER_66_0.cloverRec.S[10128]++;break;
						}
						case STRING:if (!__CLOVER_bool61) {__CLOVER_66_0.cloverRec.S[10129]++;__CLOVER_bool61=true;}
						case STRING2:if (!__CLOVER_bool61) {__CLOVER_66_0.cloverRec.S[10130]++;__CLOVER_bool61=true;}
						{
							__CLOVER_66_0.cloverRec.S[10131]++;s1=string();
							__CLOVER_66_0.cloverRec.S[10132]++;astFactory.addASTChild(currentAST, returnAST);
							__CLOVER_66_0.cloverRec.S[10133]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2256]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2256]==0&false))) {{
								
											__CLOVER_66_0.cloverRec.S[10134]++;e=new Expr_Chaine(s1);
											__CLOVER_66_0.cloverRec.S[10135]++;res=new Instr_Appel(e);
											__CLOVER_66_0.cloverRec.S[10136]++;derniere_instr=res;
										
							}
							}__CLOVER_66_0.cloverRec.S[10137]++;break;
						}
						case REAL:if (!__CLOVER_bool61) {__CLOVER_66_0.cloverRec.S[10138]++;__CLOVER_bool61=true;}
						{
							__CLOVER_66_0.cloverRec.S[10139]++;r = LT(1);
							__CLOVER_66_0.cloverRec.S[10140]++;r_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(r);
							__CLOVER_66_0.cloverRec.S[10141]++;astFactory.addASTChild(currentAST, r_AST);
							__CLOVER_66_0.cloverRec.S[10142]++;match(REAL);
							__CLOVER_66_0.cloverRec.S[10143]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2257]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2257]==0&false))) {{
								
											__CLOVER_66_0.cloverRec.S[10144]++;e=new Expr_Reel(r.getText(),remplitToken(r));
											__CLOVER_66_0.cloverRec.S[10145]++;res=new Instr_Appel(e);
											__CLOVER_66_0.cloverRec.S[10146]++;derniere_instr=res;
										
							}
							}__CLOVER_66_0.cloverRec.S[10147]++;break;
						}
						case CHAR:if (!__CLOVER_bool61) {__CLOVER_66_0.cloverRec.S[10148]++;__CLOVER_bool61=true;}
						{
							__CLOVER_66_0.cloverRec.S[10149]++;c = LT(1);
							__CLOVER_66_0.cloverRec.S[10150]++;c_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(c);
							__CLOVER_66_0.cloverRec.S[10151]++;astFactory.addASTChild(currentAST, c_AST);
							__CLOVER_66_0.cloverRec.S[10152]++;match(CHAR);
							__CLOVER_66_0.cloverRec.S[10153]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2258]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2258]==0&false))) {{
								
											__CLOVER_66_0.cloverRec.S[10154]++;e=new Expr_Car(c.getText(),remplitToken(c));
											__CLOVER_66_0.cloverRec.S[10155]++;res=new Instr_Appel(e);
											__CLOVER_66_0.cloverRec.S[10156]++;derniere_instr=res;
										
							}
							}__CLOVER_66_0.cloverRec.S[10157]++;break;
						}
						default:if (!__CLOVER_bool61) {__CLOVER_66_0.cloverRec.S[10158]++;__CLOVER_bool61=true;}
						{
							__CLOVER_66_0.cloverRec.S[10159]++;throw new NoViableAltException(LT(1), getFilename());
						}
						}
						}
						{
						__CLOVER_66_0.cloverRec.S[10160]++;_loop163:
						do {{
							__CLOVER_66_0.cloverRec.S[10161]++;if (((((LA(1)==POINT)) && (++__CLOVER_66_0.cloverRec.CT[2259]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2259]==0&false))) {{
								__CLOVER_66_0.cloverRec.S[10162]++;p = LT(1);
								__CLOVER_66_0.cloverRec.S[10163]++;p_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(p);
								__CLOVER_66_0.cloverRec.S[10164]++;astFactory.addASTChild(currentAST, p_AST);
								__CLOVER_66_0.cloverRec.S[10165]++;match(POINT);
								__CLOVER_66_0.cloverRec.S[10166]++;l = LT(1);
								__CLOVER_66_0.cloverRec.S[10167]++;l_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(l);
								__CLOVER_66_0.cloverRec.S[10168]++;astFactory.addASTChild(currentAST, l_AST);
								__CLOVER_66_0.cloverRec.S[10169]++;match(ID);
								__CLOVER_66_0.cloverRec.S[10170]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2260]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2260]==0&false))) {{
									__CLOVER_66_0.cloverRec.S[10171]++;liste=new Vector();
								}
								}{
								__CLOVER_66_0.cloverRec.S[10172]++;boolean __CLOVER_bool63=false;switch ( LA(1)) {
								case LPAREN:if (!__CLOVER_bool63) {__CLOVER_66_0.cloverRec.S[10173]++;__CLOVER_bool63=true;}
								{
									__CLOVER_66_0.cloverRec.S[10174]++;liste=exec_param();
									__CLOVER_66_0.cloverRec.S[10175]++;astFactory.addASTChild(currentAST, returnAST);
									__CLOVER_66_0.cloverRec.S[10176]++;break;
								}
								case SEMI:if (!__CLOVER_bool63) {__CLOVER_66_0.cloverRec.S[10177]++;__CLOVER_bool63=true;}
								case INVARIANT:if (!__CLOVER_bool63) {__CLOVER_66_0.cloverRec.S[10178]++;__CLOVER_bool63=true;}
								case END:if (!__CLOVER_bool63) {__CLOVER_66_0.cloverRec.S[10179]++;__CLOVER_bool63=true;}
								case ID:if (!__CLOVER_bool63) {__CLOVER_66_0.cloverRec.S[10180]++;__CLOVER_bool63=true;}
								case STRING:if (!__CLOVER_bool63) {__CLOVER_66_0.cloverRec.S[10181]++;__CLOVER_bool63=true;}
								case ELSE:if (!__CLOVER_bool63) {__CLOVER_66_0.cloverRec.S[10182]++;__CLOVER_bool63=true;}
								case ENSURE:if (!__CLOVER_bool63) {__CLOVER_66_0.cloverRec.S[10183]++;__CLOVER_bool63=true;}
								case RESCUE:if (!__CLOVER_bool63) {__CLOVER_66_0.cloverRec.S[10184]++;__CLOVER_bool63=true;}
								case POINT:if (!__CLOVER_bool63) {__CLOVER_66_0.cloverRec.S[10185]++;__CLOVER_bool63=true;}
								case LPARENT:if (!__CLOVER_bool63) {__CLOVER_66_0.cloverRec.S[10186]++;__CLOVER_bool63=true;}
								case INT:if (!__CLOVER_bool63) {__CLOVER_66_0.cloverRec.S[10187]++;__CLOVER_bool63=true;}
								case REAL:if (!__CLOVER_bool63) {__CLOVER_66_0.cloverRec.S[10188]++;__CLOVER_bool63=true;}
								case CHAR:if (!__CLOVER_bool63) {__CLOVER_66_0.cloverRec.S[10189]++;__CLOVER_bool63=true;}
								case FROM:if (!__CLOVER_bool63) {__CLOVER_66_0.cloverRec.S[10190]++;__CLOVER_bool63=true;}
								case VARIANT:if (!__CLOVER_bool63) {__CLOVER_66_0.cloverRec.S[10191]++;__CLOVER_bool63=true;}
								case UNTIL:if (!__CLOVER_bool63) {__CLOVER_66_0.cloverRec.S[10192]++;__CLOVER_bool63=true;}
								case IF:if (!__CLOVER_bool63) {__CLOVER_66_0.cloverRec.S[10193]++;__CLOVER_bool63=true;}
								case ELSEIF:if (!__CLOVER_bool63) {__CLOVER_66_0.cloverRec.S[10194]++;__CLOVER_bool63=true;}
								case EXCLAMATION:if (!__CLOVER_bool63) {__CLOVER_66_0.cloverRec.S[10195]++;__CLOVER_bool63=true;}
								case RETRY:if (!__CLOVER_bool63) {__CLOVER_66_0.cloverRec.S[10196]++;__CLOVER_bool63=true;}
								case INSPECT:if (!__CLOVER_bool63) {__CLOVER_66_0.cloverRec.S[10197]++;__CLOVER_bool63=true;}
								case WHEN:if (!__CLOVER_bool63) {__CLOVER_66_0.cloverRec.S[10198]++;__CLOVER_bool63=true;}
								case CHECK:if (!__CLOVER_bool63) {__CLOVER_66_0.cloverRec.S[10199]++;__CLOVER_bool63=true;}
								case DEBUG:if (!__CLOVER_bool63) {__CLOVER_66_0.cloverRec.S[10200]++;__CLOVER_bool63=true;}
								case STRING2:if (!__CLOVER_bool63) {__CLOVER_66_0.cloverRec.S[10201]++;__CLOVER_bool63=true;}
								{
									__CLOVER_66_0.cloverRec.S[10202]++;break;
								}
								default:if (!__CLOVER_bool63) {__CLOVER_66_0.cloverRec.S[10203]++;__CLOVER_bool63=true;}
								{
									__CLOVER_66_0.cloverRec.S[10204]++;throw new NoViableAltException(LT(1), getFilename());
								}
								}
								}
								__CLOVER_66_0.cloverRec.S[10205]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2261]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2261]==0&false))) {{
									
													__CLOVER_66_0.cloverRec.S[10206]++;inst=new Instr_Appel(l.getText(),liste);
													__CLOVER_66_0.cloverRec.S[10207]++;((Instr_Appel)inst).tid=remplitToken(l);
													__CLOVER_66_0.cloverRec.S[10208]++;((Instr_Appel)inst).tpoint=remplitToken(p);
													__CLOVER_66_0.cloverRec.S[10209]++;((Suite)derniere_instr).setSuivant(inst);
													__CLOVER_66_0.cloverRec.S[10210]++;derniere_instr=inst;
												
								}
							}}
							}else {{
								__CLOVER_66_0.cloverRec.S[10211]++;break _loop163;
							}
							
						}} }while (true);
						}
						__CLOVER_66_0.cloverRec.S[10212]++;instr_AST = (tinyeiffel.compiler.ASTDefaut)currentAST.root;
					}
				}else {{
					__CLOVER_66_0.cloverRec.S[10213]++;throw new NoViableAltException(LT(1), getFilename());
				}
				}}}}}
			}
			catch (RecognitionException ex) {
				__CLOVER_66_0.cloverRec.S[10214]++;if ((((inputState.guessing==0) && (++__CLOVER_66_0.cloverRec.CT[2262]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2262]==0&false))) {{
					
							__CLOVER_66_0.cloverRec.S[10215]++;logging.erreur(new ErreurSource("Erreur dans l'instruction"/*+ex*/,ex.getLine(),
										ex.getColumn(),ex.getFilename()));
						
				} }else {{
					__CLOVER_66_0.cloverRec.S[10216]++;throw ex;
				}
			}}
			__CLOVER_66_0.cloverRec.S[10217]++;returnAST = instr_AST;
			__CLOVER_66_0.cloverRec.S[10218]++;return res;
		}
		
	public final Vector  liste_expr() throws RecognitionException, TokenStreamException {__CLOVER_66_0.cloverRec.M[559]++;
		__CLOVER_66_0.cloverRec.S[10219]++;Vector res=new Vector();
		
		__CLOVER_66_0.cloverRec.S[10220]++;returnAST = null;
		__CLOVER_66_0.cloverRec.S[10221]++;ASTPair currentAST = new ASTPair();
		__CLOVER_66_0.cloverRec.S[10222]++;tinyeiffel.compiler.ASTDefaut liste_expr_AST = null;
		
		__CLOVER_66_0.cloverRec.S[10223]++;Expr e1,e2;
		
		
		__CLOVER_66_0.cloverRec.S[10224]++;try {      // for error handling
			__CLOVER_66_0.cloverRec.S[10225]++;e1=expr();
			__CLOVER_66_0.cloverRec.S[10226]++;astFactory.addASTChild(currentAST, returnAST);
			__CLOVER_66_0.cloverRec.S[10227]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2263]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2263]==0&false))) {{
				__CLOVER_66_0.cloverRec.S[10228]++;res.addElement(e1);
			}
			}{
			__CLOVER_66_0.cloverRec.S[10229]++;int _cnt145=0;
			__CLOVER_66_0.cloverRec.S[10230]++;_loop145:
			do {{
				__CLOVER_66_0.cloverRec.S[10231]++;if (((((LA(1)==SEMI)) && (++__CLOVER_66_0.cloverRec.CT[2264]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2264]==0&false))) {{
					__CLOVER_66_0.cloverRec.S[10232]++;match(SEMI);
				}
				}else {{
					__CLOVER_66_0.cloverRec.S[10233]++;if ( (((_cnt145>=1 ) && (++__CLOVER_66_0.cloverRec.CT[2265]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2265]==0&false))) {{ __CLOVER_66_0.cloverRec.S[10234]++;break _loop145; } }else {{__CLOVER_66_0.cloverRec.S[10235]++;throw new NoViableAltException(LT(1), getFilename());}
				}}
				
				}__CLOVER_66_0.cloverRec.S[10236]++;_cnt145++;
			} }while (true);
			}
			{
			__CLOVER_66_0.cloverRec.S[10237]++;_loop149:
			do {{
				__CLOVER_66_0.cloverRec.S[10238]++;if (((((_tokenSet_1.member(LA(1)))) && (++__CLOVER_66_0.cloverRec.CT[2266]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2266]==0&false))) {{
					__CLOVER_66_0.cloverRec.S[10239]++;e2=expr();
					__CLOVER_66_0.cloverRec.S[10240]++;astFactory.addASTChild(currentAST, returnAST);
					__CLOVER_66_0.cloverRec.S[10241]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2267]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2267]==0&false))) {{
						__CLOVER_66_0.cloverRec.S[10242]++;res.addElement(e2);
					}
					}{
					__CLOVER_66_0.cloverRec.S[10243]++;int _cnt148=0;
					__CLOVER_66_0.cloverRec.S[10244]++;_loop148:
					do {{
						__CLOVER_66_0.cloverRec.S[10245]++;if (((((LA(1)==SEMI)) && (++__CLOVER_66_0.cloverRec.CT[2268]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2268]==0&false))) {{
							__CLOVER_66_0.cloverRec.S[10246]++;match(SEMI);
						}
						}else {{
							__CLOVER_66_0.cloverRec.S[10247]++;if ( (((_cnt148>=1 ) && (++__CLOVER_66_0.cloverRec.CT[2269]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2269]==0&false))) {{ __CLOVER_66_0.cloverRec.S[10248]++;break _loop148; } }else {{__CLOVER_66_0.cloverRec.S[10249]++;throw new NoViableAltException(LT(1), getFilename());}
						}}
						
						}__CLOVER_66_0.cloverRec.S[10250]++;_cnt148++;
					} }while (true);
					}
				}
				}else {{
					__CLOVER_66_0.cloverRec.S[10251]++;break _loop149;
				}
				
			}} }while (true);
			}
			__CLOVER_66_0.cloverRec.S[10252]++;liste_expr_AST = (tinyeiffel.compiler.ASTDefaut)currentAST.root;
		}
		catch (RecognitionException ex) {
			__CLOVER_66_0.cloverRec.S[10253]++;if ((((inputState.guessing==0) && (++__CLOVER_66_0.cloverRec.CT[2270]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2270]==0&false))) {{
				
						__CLOVER_66_0.cloverRec.S[10254]++;logging.erreur(new ErreurSource("Erreur dans la liste d'expression",ex.getLine(),
									ex.getColumn(),ex.getFilename()));
					
			} }else {{
				__CLOVER_66_0.cloverRec.S[10255]++;throw ex;
			}
		}}
		__CLOVER_66_0.cloverRec.S[10256]++;returnAST = liste_expr_AST;
		__CLOVER_66_0.cloverRec.S[10257]++;return res;
	}
	
	public final Vector  exec_param() throws RecognitionException, TokenStreamException {__CLOVER_66_0.cloverRec.M[560]++;
		__CLOVER_66_0.cloverRec.S[10258]++;Vector res=new Vector();
		
		__CLOVER_66_0.cloverRec.S[10259]++;returnAST = null;
		__CLOVER_66_0.cloverRec.S[10260]++;ASTPair currentAST = new ASTPair();
		__CLOVER_66_0.cloverRec.S[10261]++;tinyeiffel.compiler.ASTDefaut exec_param_AST = null;
		
		__CLOVER_66_0.cloverRec.S[10262]++;Expr e1=null,e2=null;
		
		
		__CLOVER_66_0.cloverRec.S[10263]++;try {      // for error handling
			__CLOVER_66_0.cloverRec.S[10264]++;tinyeiffel.compiler.ASTDefaut tmp87_AST = null;
			__CLOVER_66_0.cloverRec.S[10265]++;tmp87_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(LT(1));
			__CLOVER_66_0.cloverRec.S[10266]++;astFactory.addASTChild(currentAST, tmp87_AST);
			__CLOVER_66_0.cloverRec.S[10267]++;match(LPAREN);
			{
			__CLOVER_66_0.cloverRec.S[10268]++;boolean __CLOVER_bool64=false;switch ( LA(1)) {
			case ID:if (!__CLOVER_bool64) {__CLOVER_66_0.cloverRec.S[10269]++;__CLOVER_bool64=true;}
			case STRING:if (!__CLOVER_bool64) {__CLOVER_66_0.cloverRec.S[10270]++;__CLOVER_bool64=true;}
			case LPAREN:if (!__CLOVER_bool64) {__CLOVER_66_0.cloverRec.S[10271]++;__CLOVER_bool64=true;}
			case INT:if (!__CLOVER_bool64) {__CLOVER_66_0.cloverRec.S[10272]++;__CLOVER_bool64=true;}
			case REAL:if (!__CLOVER_bool64) {__CLOVER_66_0.cloverRec.S[10273]++;__CLOVER_bool64=true;}
			case CHAR:if (!__CLOVER_bool64) {__CLOVER_66_0.cloverRec.S[10274]++;__CLOVER_bool64=true;}
			case PLUS:if (!__CLOVER_bool64) {__CLOVER_66_0.cloverRec.S[10275]++;__CLOVER_bool64=true;}
			case MOINS:if (!__CLOVER_bool64) {__CLOVER_66_0.cloverRec.S[10276]++;__CLOVER_bool64=true;}
			case FREEOP:if (!__CLOVER_bool64) {__CLOVER_66_0.cloverRec.S[10277]++;__CLOVER_bool64=true;}
			case OLD:if (!__CLOVER_bool64) {__CLOVER_66_0.cloverRec.S[10278]++;__CLOVER_bool64=true;}
			case NOT:if (!__CLOVER_bool64) {__CLOVER_66_0.cloverRec.S[10279]++;__CLOVER_bool64=true;}
			case DOLLARD:if (!__CLOVER_bool64) {__CLOVER_66_0.cloverRec.S[10280]++;__CLOVER_bool64=true;}
			case DEBUT_ARRAY:if (!__CLOVER_bool64) {__CLOVER_66_0.cloverRec.S[10281]++;__CLOVER_bool64=true;}
			case TRUE:if (!__CLOVER_bool64) {__CLOVER_66_0.cloverRec.S[10282]++;__CLOVER_bool64=true;}
			case FALSE:if (!__CLOVER_bool64) {__CLOVER_66_0.cloverRec.S[10283]++;__CLOVER_bool64=true;}
			case STRING2:if (!__CLOVER_bool64) {__CLOVER_66_0.cloverRec.S[10284]++;__CLOVER_bool64=true;}
			{
				__CLOVER_66_0.cloverRec.S[10285]++;e1=expr();
				__CLOVER_66_0.cloverRec.S[10286]++;astFactory.addASTChild(currentAST, returnAST);
				__CLOVER_66_0.cloverRec.S[10287]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2271]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2271]==0&false))) {{
					__CLOVER_66_0.cloverRec.S[10288]++;res.addElement(e1);
				}
				}{
				__CLOVER_66_0.cloverRec.S[10289]++;_loop277:
				do {{
					__CLOVER_66_0.cloverRec.S[10290]++;if (((((LA(1)==VIRGULE)) && (++__CLOVER_66_0.cloverRec.CT[2272]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2272]==0&false))) {{
						__CLOVER_66_0.cloverRec.S[10291]++;tinyeiffel.compiler.ASTDefaut tmp88_AST = null;
						__CLOVER_66_0.cloverRec.S[10292]++;tmp88_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(LT(1));
						__CLOVER_66_0.cloverRec.S[10293]++;astFactory.addASTChild(currentAST, tmp88_AST);
						__CLOVER_66_0.cloverRec.S[10294]++;match(VIRGULE);
						__CLOVER_66_0.cloverRec.S[10295]++;e2=expr();
						__CLOVER_66_0.cloverRec.S[10296]++;astFactory.addASTChild(currentAST, returnAST);
						__CLOVER_66_0.cloverRec.S[10297]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2273]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2273]==0&false))) {{
							__CLOVER_66_0.cloverRec.S[10298]++;res.addElement(e2);
						}
					}}
					}else {{
						__CLOVER_66_0.cloverRec.S[10299]++;break _loop277;
					}
					
				}} }while (true);
				}
				__CLOVER_66_0.cloverRec.S[10300]++;break;
			}
			case RPAREN:if (!__CLOVER_bool64) {__CLOVER_66_0.cloverRec.S[10301]++;__CLOVER_bool64=true;}
			{
				__CLOVER_66_0.cloverRec.S[10302]++;break;
			}
			default:if (!__CLOVER_bool64) {__CLOVER_66_0.cloverRec.S[10303]++;__CLOVER_bool64=true;}
			{
				__CLOVER_66_0.cloverRec.S[10304]++;throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			__CLOVER_66_0.cloverRec.S[10305]++;tinyeiffel.compiler.ASTDefaut tmp89_AST = null;
			__CLOVER_66_0.cloverRec.S[10306]++;tmp89_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(LT(1));
			__CLOVER_66_0.cloverRec.S[10307]++;astFactory.addASTChild(currentAST, tmp89_AST);
			__CLOVER_66_0.cloverRec.S[10308]++;match(RPAREN);
			__CLOVER_66_0.cloverRec.S[10309]++;exec_param_AST = (tinyeiffel.compiler.ASTDefaut)currentAST.root;
		}
		catch (RecognitionException ex) {
			__CLOVER_66_0.cloverRec.S[10310]++;if ((((inputState.guessing==0) && (++__CLOVER_66_0.cloverRec.CT[2274]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2274]==0&false))) {{
				
						__CLOVER_66_0.cloverRec.S[10311]++;logging.erreur(new ErreurSource("Erreur dans les parametres",ex.getLine(),
									ex.getColumn(),ex.getFilename()));
					
			} }else {{
				__CLOVER_66_0.cloverRec.S[10312]++;throw ex;
			}
		}}
		__CLOVER_66_0.cloverRec.S[10313]++;returnAST = exec_param_AST;
		__CLOVER_66_0.cloverRec.S[10314]++;return res;
	}
	
	public final Vector  expr_when() throws RecognitionException, TokenStreamException {__CLOVER_66_0.cloverRec.M[561]++;
		__CLOVER_66_0.cloverRec.S[10315]++;Vector res=new Vector();
		
		__CLOVER_66_0.cloverRec.S[10316]++;returnAST = null;
		__CLOVER_66_0.cloverRec.S[10317]++;ASTPair currentAST = new ASTPair();
		__CLOVER_66_0.cloverRec.S[10318]++;tinyeiffel.compiler.ASTDefaut expr_when_AST = null;
		__CLOVER_66_0.cloverRec.S[10319]++;Token  d = null;
		__CLOVER_66_0.cloverRec.S[10320]++;tinyeiffel.compiler.ASTDefaut d_AST = null;
		
		__CLOVER_66_0.cloverRec.S[10321]++;Expr e1=null,e2=null;
		__CLOVER_66_0.cloverRec.S[10322]++;tinyeiffel.ast.Token opera=null;
		
		
		__CLOVER_66_0.cloverRec.S[10323]++;try {      // for error handling
			__CLOVER_66_0.cloverRec.S[10324]++;e1=expr();
			__CLOVER_66_0.cloverRec.S[10325]++;astFactory.addASTChild(currentAST, returnAST);
			__CLOVER_66_0.cloverRec.S[10326]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2275]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2275]==0&false))) {{
				__CLOVER_66_0.cloverRec.S[10327]++;res.addElement(e1);
			}
			}{
			__CLOVER_66_0.cloverRec.S[10328]++;boolean __CLOVER_bool65=false;switch ( LA(1)) {
			case DEUX_POINT:if (!__CLOVER_bool65) {__CLOVER_66_0.cloverRec.S[10329]++;__CLOVER_bool65=true;}
			{
				__CLOVER_66_0.cloverRec.S[10330]++;d = LT(1);
				__CLOVER_66_0.cloverRec.S[10331]++;d_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(d);
				__CLOVER_66_0.cloverRec.S[10332]++;astFactory.addASTChild(currentAST, d_AST);
				__CLOVER_66_0.cloverRec.S[10333]++;match(DEUX_POINT);
				__CLOVER_66_0.cloverRec.S[10334]++;e2=expr();
				__CLOVER_66_0.cloverRec.S[10335]++;astFactory.addASTChild(currentAST, returnAST);
				__CLOVER_66_0.cloverRec.S[10336]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2276]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2276]==0&false))) {{
					
									__CLOVER_66_0.cloverRec.S[10337]++;res.addElement(e2);
									__CLOVER_66_0.cloverRec.S[10338]++;opera=remplitToken(d);
									//res.oper=opera;
								
				}
				}__CLOVER_66_0.cloverRec.S[10339]++;break;
			}
			case VIRGULE:if (!__CLOVER_bool65) {__CLOVER_66_0.cloverRec.S[10340]++;__CLOVER_bool65=true;}
			case THEN:if (!__CLOVER_bool65) {__CLOVER_66_0.cloverRec.S[10341]++;__CLOVER_bool65=true;}
			{
				__CLOVER_66_0.cloverRec.S[10342]++;break;
			}
			default:if (!__CLOVER_bool65) {__CLOVER_66_0.cloverRec.S[10343]++;__CLOVER_bool65=true;}
			{
				__CLOVER_66_0.cloverRec.S[10344]++;throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			__CLOVER_66_0.cloverRec.S[10345]++;expr_when_AST = (tinyeiffel.compiler.ASTDefaut)currentAST.root;
		}
		catch (RecognitionException ex) {
			__CLOVER_66_0.cloverRec.S[10346]++;if ((((inputState.guessing==0) && (++__CLOVER_66_0.cloverRec.CT[2277]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2277]==0&false))) {{
				
						__CLOVER_66_0.cloverRec.S[10347]++;logging.erreur(new ErreurSource("Erreur dans l'expression",ex.getLine(),
									ex.getColumn(),ex.getFilename()));
					
			} }else {{
				__CLOVER_66_0.cloverRec.S[10348]++;throw ex;
			}
		}}
		__CLOVER_66_0.cloverRec.S[10349]++;returnAST = expr_when_AST;
		__CLOVER_66_0.cloverRec.S[10350]++;return res;
	}
	
	public final Expr  expr0() throws RecognitionException, TokenStreamException {__CLOVER_66_0.cloverRec.M[562]++;
		__CLOVER_66_0.cloverRec.S[10351]++;Expr res=null;
		
		__CLOVER_66_0.cloverRec.S[10352]++;returnAST = null;
		__CLOVER_66_0.cloverRec.S[10353]++;ASTPair currentAST = new ASTPair();
		__CLOVER_66_0.cloverRec.S[10354]++;tinyeiffel.compiler.ASTDefaut expr0_AST = null;
		
		__CLOVER_66_0.cloverRec.S[10355]++;try {      // for error handling
			__CLOVER_66_0.cloverRec.S[10356]++;tinyeiffel.compiler.ASTDefaut tmp90_AST = null;
			__CLOVER_66_0.cloverRec.S[10357]++;tmp90_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(LT(1));
			__CLOVER_66_0.cloverRec.S[10358]++;astFactory.addASTChild(currentAST, tmp90_AST);
			__CLOVER_66_0.cloverRec.S[10359]++;match(LPAREN);
			__CLOVER_66_0.cloverRec.S[10360]++;res=expr();
			__CLOVER_66_0.cloverRec.S[10361]++;astFactory.addASTChild(currentAST, returnAST);
			__CLOVER_66_0.cloverRec.S[10362]++;tinyeiffel.compiler.ASTDefaut tmp91_AST = null;
			__CLOVER_66_0.cloverRec.S[10363]++;tmp91_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(LT(1));
			__CLOVER_66_0.cloverRec.S[10364]++;astFactory.addASTChild(currentAST, tmp91_AST);
			__CLOVER_66_0.cloverRec.S[10365]++;match(RPAREN);
			__CLOVER_66_0.cloverRec.S[10366]++;expr0_AST = (tinyeiffel.compiler.ASTDefaut)currentAST.root;
		}
		catch (RecognitionException ex) {
			__CLOVER_66_0.cloverRec.S[10367]++;if ((((inputState.guessing==0) && (++__CLOVER_66_0.cloverRec.CT[2278]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2278]==0&false))) {{
				__CLOVER_66_0.cloverRec.S[10368]++;reportError(ex);
				__CLOVER_66_0.cloverRec.S[10369]++;consume();
				__CLOVER_66_0.cloverRec.S[10370]++;consumeUntil(_tokenSet_8);
			} }else {{
			  __CLOVER_66_0.cloverRec.S[10371]++;throw ex;
			}
		}}
		__CLOVER_66_0.cloverRec.S[10372]++;returnAST = expr0_AST;
		__CLOVER_66_0.cloverRec.S[10373]++;return res;
	}
	
	public final Expr  expr17() throws RecognitionException, TokenStreamException {__CLOVER_66_0.cloverRec.M[563]++;
		__CLOVER_66_0.cloverRec.S[10374]++;Expr e=null;
		
		__CLOVER_66_0.cloverRec.S[10375]++;returnAST = null;
		__CLOVER_66_0.cloverRec.S[10376]++;ASTPair currentAST = new ASTPair();
		__CLOVER_66_0.cloverRec.S[10377]++;tinyeiffel.compiler.ASTDefaut expr17_AST = null;
		__CLOVER_66_0.cloverRec.S[10378]++;Token  x = null;
		__CLOVER_66_0.cloverRec.S[10379]++;tinyeiffel.compiler.ASTDefaut x_AST = null;
		__CLOVER_66_0.cloverRec.S[10380]++;Token  i = null;
		__CLOVER_66_0.cloverRec.S[10381]++;tinyeiffel.compiler.ASTDefaut i_AST = null;
		
		__CLOVER_66_0.cloverRec.S[10382]++;int op=0;
		__CLOVER_66_0.cloverRec.S[10383]++;Expr e1=null,e2=null;
		__CLOVER_66_0.cloverRec.S[10384]++;tinyeiffel.ast.Token opera=null;
		
		
		__CLOVER_66_0.cloverRec.S[10385]++;try {      // for error handling
			__CLOVER_66_0.cloverRec.S[10386]++;e1=expr18();
			__CLOVER_66_0.cloverRec.S[10387]++;astFactory.addASTChild(currentAST, returnAST);
			__CLOVER_66_0.cloverRec.S[10388]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2279]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2279]==0&false))) {{
				__CLOVER_66_0.cloverRec.S[10389]++;e=e1;/* System.out.println("Regle Xor");*/
			}
			}{
			__CLOVER_66_0.cloverRec.S[10390]++;_loop219:
			do {{
				__CLOVER_66_0.cloverRec.S[10391]++;if (((((LA(1)==XOR||LA(1)==IMPLIES)) && (++__CLOVER_66_0.cloverRec.CT[2280]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2280]==0&false))) {{
					{
					__CLOVER_66_0.cloverRec.S[10392]++;boolean __CLOVER_bool66=false;switch ( LA(1)) {
					case XOR:if (!__CLOVER_bool66) {__CLOVER_66_0.cloverRec.S[10393]++;__CLOVER_bool66=true;}
					{
						__CLOVER_66_0.cloverRec.S[10394]++;x = LT(1);
						__CLOVER_66_0.cloverRec.S[10395]++;x_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(x);
						__CLOVER_66_0.cloverRec.S[10396]++;astFactory.makeASTRoot(currentAST, x_AST);
						__CLOVER_66_0.cloverRec.S[10397]++;match(XOR);
						__CLOVER_66_0.cloverRec.S[10398]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2281]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2281]==0&false))) {{
							__CLOVER_66_0.cloverRec.S[10399]++;op=Expr.Xor;__CLOVER_66_0.cloverRec.S[10400]++;opera=remplitToken(x);
						}
						}__CLOVER_66_0.cloverRec.S[10401]++;break;
					}
					case IMPLIES:if (!__CLOVER_bool66) {__CLOVER_66_0.cloverRec.S[10402]++;__CLOVER_bool66=true;}
					{
						__CLOVER_66_0.cloverRec.S[10403]++;i = LT(1);
						__CLOVER_66_0.cloverRec.S[10404]++;i_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(i);
						__CLOVER_66_0.cloverRec.S[10405]++;astFactory.makeASTRoot(currentAST, i_AST);
						__CLOVER_66_0.cloverRec.S[10406]++;match(IMPLIES);
						__CLOVER_66_0.cloverRec.S[10407]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2282]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2282]==0&false))) {{
							__CLOVER_66_0.cloverRec.S[10408]++;op=Expr.Implies;__CLOVER_66_0.cloverRec.S[10409]++;opera=remplitToken(i);
						}
						}__CLOVER_66_0.cloverRec.S[10410]++;break;
					}
					default:if (!__CLOVER_bool66) {__CLOVER_66_0.cloverRec.S[10411]++;__CLOVER_bool66=true;}
					{
						__CLOVER_66_0.cloverRec.S[10412]++;throw new NoViableAltException(LT(1), getFilename());
					}
					}
					}
					__CLOVER_66_0.cloverRec.S[10413]++;e2=expr18();
					__CLOVER_66_0.cloverRec.S[10414]++;astFactory.addASTChild(currentAST, returnAST);
					__CLOVER_66_0.cloverRec.S[10415]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2283]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2283]==0&false))) {{
						/*e=new Expr(op,e,e2);
											e.oper=opera;*/
						__CLOVER_66_0.cloverRec.S[10416]++;e=new Expr_Binaire(op,e,e2,opera);
					}
				}}
				}else {{
					__CLOVER_66_0.cloverRec.S[10417]++;break _loop219;
				}
				
			}} }while (true);
			}
			__CLOVER_66_0.cloverRec.S[10418]++;expr17_AST = (tinyeiffel.compiler.ASTDefaut)currentAST.root;
		}
		catch (RecognitionException ex) {
			__CLOVER_66_0.cloverRec.S[10419]++;if ((((inputState.guessing==0) && (++__CLOVER_66_0.cloverRec.CT[2284]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2284]==0&false))) {{
				
						__CLOVER_66_0.cloverRec.S[10420]++;logging.erreur(new ErreurSource("Erreur dans l'expression",ex.getLine(),
									ex.getColumn(),ex.getFilename()));
					
			} }else {{
				__CLOVER_66_0.cloverRec.S[10421]++;throw ex;
			}
		}}
		__CLOVER_66_0.cloverRec.S[10422]++;returnAST = expr17_AST;
		__CLOVER_66_0.cloverRec.S[10423]++;return e;
	}
	
	public final Expr  expr18() throws RecognitionException, TokenStreamException {__CLOVER_66_0.cloverRec.M[564]++;
		__CLOVER_66_0.cloverRec.S[10424]++;Expr e=null;
		
		__CLOVER_66_0.cloverRec.S[10425]++;returnAST = null;
		__CLOVER_66_0.cloverRec.S[10426]++;ASTPair currentAST = new ASTPair();
		__CLOVER_66_0.cloverRec.S[10427]++;tinyeiffel.compiler.ASTDefaut expr18_AST = null;
		__CLOVER_66_0.cloverRec.S[10428]++;Token  o = null;
		__CLOVER_66_0.cloverRec.S[10429]++;tinyeiffel.compiler.ASTDefaut o_AST = null;
		__CLOVER_66_0.cloverRec.S[10430]++;Token  e3 = null;
		__CLOVER_66_0.cloverRec.S[10431]++;tinyeiffel.compiler.ASTDefaut e3_AST = null;
		
		__CLOVER_66_0.cloverRec.S[10432]++;int op=0;
		__CLOVER_66_0.cloverRec.S[10433]++;Expr e1=null,e2=null;
		__CLOVER_66_0.cloverRec.S[10434]++;tinyeiffel.ast.Token opera=null;
		
		
		__CLOVER_66_0.cloverRec.S[10435]++;try {      // for error handling
			__CLOVER_66_0.cloverRec.S[10436]++;e1=expr19();
			__CLOVER_66_0.cloverRec.S[10437]++;astFactory.addASTChild(currentAST, returnAST);
			__CLOVER_66_0.cloverRec.S[10438]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2285]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2285]==0&false))) {{
				__CLOVER_66_0.cloverRec.S[10439]++;e=e1;/*System.out.println("regle Ou");*/
			}
			}{
			__CLOVER_66_0.cloverRec.S[10440]++;_loop223:
			do {{
				__CLOVER_66_0.cloverRec.S[10441]++;if (((((LA(1)==OR)) && (++__CLOVER_66_0.cloverRec.CT[2286]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2286]==0&false))) {{
					__CLOVER_66_0.cloverRec.S[10442]++;o = LT(1);
					__CLOVER_66_0.cloverRec.S[10443]++;o_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(o);
					__CLOVER_66_0.cloverRec.S[10444]++;astFactory.makeASTRoot(currentAST, o_AST);
					__CLOVER_66_0.cloverRec.S[10445]++;match(OR);
					__CLOVER_66_0.cloverRec.S[10446]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2287]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2287]==0&false))) {{
						__CLOVER_66_0.cloverRec.S[10447]++;op=Expr.Or;__CLOVER_66_0.cloverRec.S[10448]++;opera=remplitToken(o);
					}
					}{
					__CLOVER_66_0.cloverRec.S[10449]++;boolean __CLOVER_bool67=false;switch ( LA(1)) {
					case ELSE:if (!__CLOVER_bool67) {__CLOVER_66_0.cloverRec.S[10450]++;__CLOVER_bool67=true;}
					{
						__CLOVER_66_0.cloverRec.S[10451]++;e3 = LT(1);
						__CLOVER_66_0.cloverRec.S[10452]++;e3_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(e3);
						__CLOVER_66_0.cloverRec.S[10453]++;astFactory.addASTChild(currentAST, e3_AST);
						__CLOVER_66_0.cloverRec.S[10454]++;match(ELSE);
						__CLOVER_66_0.cloverRec.S[10455]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2288]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2288]==0&false))) {{
							__CLOVER_66_0.cloverRec.S[10456]++;op=Expr.Or_Else;__CLOVER_66_0.cloverRec.S[10457]++;opera=remplitToken(e3);
						}
						}__CLOVER_66_0.cloverRec.S[10458]++;break;
					}
					case ID:if (!__CLOVER_bool67) {__CLOVER_66_0.cloverRec.S[10459]++;__CLOVER_bool67=true;}
					case STRING:if (!__CLOVER_bool67) {__CLOVER_66_0.cloverRec.S[10460]++;__CLOVER_bool67=true;}
					case LPAREN:if (!__CLOVER_bool67) {__CLOVER_66_0.cloverRec.S[10461]++;__CLOVER_bool67=true;}
					case INT:if (!__CLOVER_bool67) {__CLOVER_66_0.cloverRec.S[10462]++;__CLOVER_bool67=true;}
					case REAL:if (!__CLOVER_bool67) {__CLOVER_66_0.cloverRec.S[10463]++;__CLOVER_bool67=true;}
					case CHAR:if (!__CLOVER_bool67) {__CLOVER_66_0.cloverRec.S[10464]++;__CLOVER_bool67=true;}
					case PLUS:if (!__CLOVER_bool67) {__CLOVER_66_0.cloverRec.S[10465]++;__CLOVER_bool67=true;}
					case MOINS:if (!__CLOVER_bool67) {__CLOVER_66_0.cloverRec.S[10466]++;__CLOVER_bool67=true;}
					case FREEOP:if (!__CLOVER_bool67) {__CLOVER_66_0.cloverRec.S[10467]++;__CLOVER_bool67=true;}
					case OLD:if (!__CLOVER_bool67) {__CLOVER_66_0.cloverRec.S[10468]++;__CLOVER_bool67=true;}
					case NOT:if (!__CLOVER_bool67) {__CLOVER_66_0.cloverRec.S[10469]++;__CLOVER_bool67=true;}
					case DOLLARD:if (!__CLOVER_bool67) {__CLOVER_66_0.cloverRec.S[10470]++;__CLOVER_bool67=true;}
					case DEBUT_ARRAY:if (!__CLOVER_bool67) {__CLOVER_66_0.cloverRec.S[10471]++;__CLOVER_bool67=true;}
					case TRUE:if (!__CLOVER_bool67) {__CLOVER_66_0.cloverRec.S[10472]++;__CLOVER_bool67=true;}
					case FALSE:if (!__CLOVER_bool67) {__CLOVER_66_0.cloverRec.S[10473]++;__CLOVER_bool67=true;}
					case STRING2:if (!__CLOVER_bool67) {__CLOVER_66_0.cloverRec.S[10474]++;__CLOVER_bool67=true;}
					{
						__CLOVER_66_0.cloverRec.S[10475]++;break;
					}
					default:if (!__CLOVER_bool67) {__CLOVER_66_0.cloverRec.S[10476]++;__CLOVER_bool67=true;}
					{
						__CLOVER_66_0.cloverRec.S[10477]++;throw new NoViableAltException(LT(1), getFilename());
					}
					}
					}
					__CLOVER_66_0.cloverRec.S[10478]++;e2=expr19();
					__CLOVER_66_0.cloverRec.S[10479]++;astFactory.addASTChild(currentAST, returnAST);
					__CLOVER_66_0.cloverRec.S[10480]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2289]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2289]==0&false))) {{
						/*e=new Expr(op,e,e2);e.oper=opera;*/
						__CLOVER_66_0.cloverRec.S[10481]++;e=new Expr_Binaire(op,e,e2,opera);
					}
				}}
				}else {{
					__CLOVER_66_0.cloverRec.S[10482]++;break _loop223;
				}
				
			}} }while (true);
			}
			__CLOVER_66_0.cloverRec.S[10483]++;expr18_AST = (tinyeiffel.compiler.ASTDefaut)currentAST.root;
		}
		catch (RecognitionException ex) {
			__CLOVER_66_0.cloverRec.S[10484]++;if ((((inputState.guessing==0) && (++__CLOVER_66_0.cloverRec.CT[2290]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2290]==0&false))) {{
				
						__CLOVER_66_0.cloverRec.S[10485]++;logging.erreur(new ErreurSource("Erreur dans l'expression",ex.getLine(),
									ex.getColumn(),ex.getFilename()));
					
			} }else {{
				__CLOVER_66_0.cloverRec.S[10486]++;throw ex;
			}
		}}
		__CLOVER_66_0.cloverRec.S[10487]++;returnAST = expr18_AST;
		__CLOVER_66_0.cloverRec.S[10488]++;return e;
	}
	
	public final Expr  expr19() throws RecognitionException, TokenStreamException {__CLOVER_66_0.cloverRec.M[565]++;
		__CLOVER_66_0.cloverRec.S[10489]++;Expr e=null;
		
		__CLOVER_66_0.cloverRec.S[10490]++;returnAST = null;
		__CLOVER_66_0.cloverRec.S[10491]++;ASTPair currentAST = new ASTPair();
		__CLOVER_66_0.cloverRec.S[10492]++;tinyeiffel.compiler.ASTDefaut expr19_AST = null;
		__CLOVER_66_0.cloverRec.S[10493]++;Token  a = null;
		__CLOVER_66_0.cloverRec.S[10494]++;tinyeiffel.compiler.ASTDefaut a_AST = null;
		__CLOVER_66_0.cloverRec.S[10495]++;Token  a2 = null;
		__CLOVER_66_0.cloverRec.S[10496]++;tinyeiffel.compiler.ASTDefaut a2_AST = null;
		
		__CLOVER_66_0.cloverRec.S[10497]++;int op=0;
		__CLOVER_66_0.cloverRec.S[10498]++;Expr e1=null,e2=null;
		__CLOVER_66_0.cloverRec.S[10499]++;tinyeiffel.ast.Token opera=null;
		
		
		__CLOVER_66_0.cloverRec.S[10500]++;try {      // for error handling
			__CLOVER_66_0.cloverRec.S[10501]++;e1=expr20();
			__CLOVER_66_0.cloverRec.S[10502]++;astFactory.addASTChild(currentAST, returnAST);
			__CLOVER_66_0.cloverRec.S[10503]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2291]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2291]==0&false))) {{
				__CLOVER_66_0.cloverRec.S[10504]++;e=e1;/*System.out.println("Regle et");*/
			}
			}{
			__CLOVER_66_0.cloverRec.S[10505]++;_loop229:
			do {{
				__CLOVER_66_0.cloverRec.S[10506]++;if (((((LA(1)==AND)) && (++__CLOVER_66_0.cloverRec.CT[2292]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2292]==0&false))) {{
					{
					__CLOVER_66_0.cloverRec.S[10507]++;boolean synPredMatched228 = false;
					__CLOVER_66_0.cloverRec.S[10508]++;if ((((((LA(1)==AND) && (LA(2)==THEN))) && (++__CLOVER_66_0.cloverRec.CT[2293]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2293]==0&false))) {{
						__CLOVER_66_0.cloverRec.S[10509]++;int _m228 = mark();
						__CLOVER_66_0.cloverRec.S[10510]++;synPredMatched228 = true;
						__CLOVER_66_0.cloverRec.S[10511]++;inputState.guessing++;
						__CLOVER_66_0.cloverRec.S[10512]++;try {
							{
							__CLOVER_66_0.cloverRec.S[10513]++;match(AND);
							__CLOVER_66_0.cloverRec.S[10514]++;match(THEN);
							}
						}
						catch (RecognitionException pe) {
							__CLOVER_66_0.cloverRec.S[10515]++;synPredMatched228 = false;
						}
						__CLOVER_66_0.cloverRec.S[10516]++;rewind(_m228);
						__CLOVER_66_0.cloverRec.S[10517]++;inputState.guessing--;
					}
					}__CLOVER_66_0.cloverRec.S[10518]++;if ( (((synPredMatched228 ) && (++__CLOVER_66_0.cloverRec.CT[2294]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2294]==0&false))) {{
						__CLOVER_66_0.cloverRec.S[10519]++;a = LT(1);
						__CLOVER_66_0.cloverRec.S[10520]++;a_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(a);
						__CLOVER_66_0.cloverRec.S[10521]++;astFactory.addASTChild(currentAST, a_AST);
						__CLOVER_66_0.cloverRec.S[10522]++;match(AND);
						__CLOVER_66_0.cloverRec.S[10523]++;tinyeiffel.compiler.ASTDefaut tmp92_AST = null;
						__CLOVER_66_0.cloverRec.S[10524]++;tmp92_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(LT(1));
						__CLOVER_66_0.cloverRec.S[10525]++;astFactory.makeASTRoot(currentAST, tmp92_AST);
						__CLOVER_66_0.cloverRec.S[10526]++;match(THEN);
						__CLOVER_66_0.cloverRec.S[10527]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2295]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2295]==0&false))) {{
							__CLOVER_66_0.cloverRec.S[10528]++;op=Expr.And_Then;__CLOVER_66_0.cloverRec.S[10529]++;opera=remplitToken(a);
						}
					}}
					}else {__CLOVER_66_0.cloverRec.S[10530]++;if (((((LA(1)==AND) && (_tokenSet_1.member(LA(2)))) && (++__CLOVER_66_0.cloverRec.CT[2296]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2296]==0&false))) {{
						__CLOVER_66_0.cloverRec.S[10531]++;a2 = LT(1);
						__CLOVER_66_0.cloverRec.S[10532]++;a2_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(a2);
						__CLOVER_66_0.cloverRec.S[10533]++;astFactory.makeASTRoot(currentAST, a2_AST);
						__CLOVER_66_0.cloverRec.S[10534]++;match(AND);
						__CLOVER_66_0.cloverRec.S[10535]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2297]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2297]==0&false))) {{
							__CLOVER_66_0.cloverRec.S[10536]++;op=Expr.And;__CLOVER_66_0.cloverRec.S[10537]++;opera=remplitToken(a2);
						}
					}}
					}else {{
						__CLOVER_66_0.cloverRec.S[10538]++;throw new NoViableAltException(LT(1), getFilename());
					}
					
					}}}
					__CLOVER_66_0.cloverRec.S[10539]++;e2=expr20();
					__CLOVER_66_0.cloverRec.S[10540]++;astFactory.addASTChild(currentAST, returnAST);
					__CLOVER_66_0.cloverRec.S[10541]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2298]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2298]==0&false))) {{
						/*e=new Expr(op,e,e2);e.oper=opera;*/
						__CLOVER_66_0.cloverRec.S[10542]++;e=new Expr_Binaire(op,e,e2,opera);
					}
				}}
				}else {{
					__CLOVER_66_0.cloverRec.S[10543]++;break _loop229;
				}
				
			}} }while (true);
			}
			__CLOVER_66_0.cloverRec.S[10544]++;expr19_AST = (tinyeiffel.compiler.ASTDefaut)currentAST.root;
		}
		catch (RecognitionException ex) {
			__CLOVER_66_0.cloverRec.S[10545]++;if ((((inputState.guessing==0) && (++__CLOVER_66_0.cloverRec.CT[2299]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2299]==0&false))) {{
				
						__CLOVER_66_0.cloverRec.S[10546]++;logging.erreur(new ErreurSource("Erreur dans l'expression",ex.getLine(),
									ex.getColumn(),ex.getFilename()));
					
			} }else {{
				__CLOVER_66_0.cloverRec.S[10547]++;throw ex;
			}
		}}
		__CLOVER_66_0.cloverRec.S[10548]++;returnAST = expr19_AST;
		__CLOVER_66_0.cloverRec.S[10549]++;return e;
	}
	
	public final Expr  expr20() throws RecognitionException, TokenStreamException {__CLOVER_66_0.cloverRec.M[566]++;
		__CLOVER_66_0.cloverRec.S[10550]++;Expr e=null;
		
		__CLOVER_66_0.cloverRec.S[10551]++;returnAST = null;
		__CLOVER_66_0.cloverRec.S[10552]++;ASTPair currentAST = new ASTPair();
		__CLOVER_66_0.cloverRec.S[10553]++;tinyeiffel.compiler.ASTDefaut expr20_AST = null;
		__CLOVER_66_0.cloverRec.S[10554]++;Token  e3 = null;
		__CLOVER_66_0.cloverRec.S[10555]++;tinyeiffel.compiler.ASTDefaut e3_AST = null;
		__CLOVER_66_0.cloverRec.S[10556]++;Token  d = null;
		__CLOVER_66_0.cloverRec.S[10557]++;tinyeiffel.compiler.ASTDefaut d_AST = null;
		__CLOVER_66_0.cloverRec.S[10558]++;Token  i = null;
		__CLOVER_66_0.cloverRec.S[10559]++;tinyeiffel.compiler.ASTDefaut i_AST = null;
		__CLOVER_66_0.cloverRec.S[10560]++;Token  i2 = null;
		__CLOVER_66_0.cloverRec.S[10561]++;tinyeiffel.compiler.ASTDefaut i2_AST = null;
		__CLOVER_66_0.cloverRec.S[10562]++;Token  s = null;
		__CLOVER_66_0.cloverRec.S[10563]++;tinyeiffel.compiler.ASTDefaut s_AST = null;
		__CLOVER_66_0.cloverRec.S[10564]++;Token  s2 = null;
		__CLOVER_66_0.cloverRec.S[10565]++;tinyeiffel.compiler.ASTDefaut s2_AST = null;
		
		__CLOVER_66_0.cloverRec.S[10566]++;int op=0;
		__CLOVER_66_0.cloverRec.S[10567]++;Expr e1=null,e2=null;
		__CLOVER_66_0.cloverRec.S[10568]++;tinyeiffel.ast.Token opera=null;
		
		
		__CLOVER_66_0.cloverRec.S[10569]++;try {      // for error handling
			__CLOVER_66_0.cloverRec.S[10570]++;e1=expr21();
			__CLOVER_66_0.cloverRec.S[10571]++;astFactory.addASTChild(currentAST, returnAST);
			__CLOVER_66_0.cloverRec.S[10572]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2300]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2300]==0&false))) {{
				__CLOVER_66_0.cloverRec.S[10573]++;e=e1;
			}
			}{
			__CLOVER_66_0.cloverRec.S[10574]++;_loop233:
			do {{
				__CLOVER_66_0.cloverRec.S[10575]++;if ((((((LA(1) >= EGAL && LA(1) <= SUP))) && (++__CLOVER_66_0.cloverRec.CT[2301]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2301]==0&false))) {{
					{
					__CLOVER_66_0.cloverRec.S[10576]++;boolean __CLOVER_bool68=false;switch ( LA(1)) {
					case EGAL:if (!__CLOVER_bool68) {__CLOVER_66_0.cloverRec.S[10577]++;__CLOVER_bool68=true;}
					{
						__CLOVER_66_0.cloverRec.S[10578]++;e3 = LT(1);
						__CLOVER_66_0.cloverRec.S[10579]++;e3_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(e3);
						__CLOVER_66_0.cloverRec.S[10580]++;astFactory.makeASTRoot(currentAST, e3_AST);
						__CLOVER_66_0.cloverRec.S[10581]++;match(EGAL);
						__CLOVER_66_0.cloverRec.S[10582]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2302]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2302]==0&false))) {{
							__CLOVER_66_0.cloverRec.S[10583]++;op=Expr.Egal;__CLOVER_66_0.cloverRec.S[10584]++;opera=remplitToken(e3);
						}
						}__CLOVER_66_0.cloverRec.S[10585]++;break;
					}
					case DIFF:if (!__CLOVER_bool68) {__CLOVER_66_0.cloverRec.S[10586]++;__CLOVER_bool68=true;}
					{
						__CLOVER_66_0.cloverRec.S[10587]++;d = LT(1);
						__CLOVER_66_0.cloverRec.S[10588]++;d_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(d);
						__CLOVER_66_0.cloverRec.S[10589]++;astFactory.makeASTRoot(currentAST, d_AST);
						__CLOVER_66_0.cloverRec.S[10590]++;match(DIFF);
						__CLOVER_66_0.cloverRec.S[10591]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2303]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2303]==0&false))) {{
							__CLOVER_66_0.cloverRec.S[10592]++;op=Expr.Diff;__CLOVER_66_0.cloverRec.S[10593]++;opera=remplitToken(d);
						}
						}__CLOVER_66_0.cloverRec.S[10594]++;break;
					}
					case INFS:if (!__CLOVER_bool68) {__CLOVER_66_0.cloverRec.S[10595]++;__CLOVER_bool68=true;}
					{
						__CLOVER_66_0.cloverRec.S[10596]++;i = LT(1);
						__CLOVER_66_0.cloverRec.S[10597]++;i_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(i);
						__CLOVER_66_0.cloverRec.S[10598]++;astFactory.makeASTRoot(currentAST, i_AST);
						__CLOVER_66_0.cloverRec.S[10599]++;match(INFS);
						__CLOVER_66_0.cloverRec.S[10600]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2304]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2304]==0&false))) {{
							__CLOVER_66_0.cloverRec.S[10601]++;op=Expr.Infs;__CLOVER_66_0.cloverRec.S[10602]++;opera=remplitToken(i);
						}
						}__CLOVER_66_0.cloverRec.S[10603]++;break;
					}
					case INF:if (!__CLOVER_bool68) {__CLOVER_66_0.cloverRec.S[10604]++;__CLOVER_bool68=true;}
					{
						__CLOVER_66_0.cloverRec.S[10605]++;i2 = LT(1);
						__CLOVER_66_0.cloverRec.S[10606]++;i2_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(i2);
						__CLOVER_66_0.cloverRec.S[10607]++;astFactory.makeASTRoot(currentAST, i2_AST);
						__CLOVER_66_0.cloverRec.S[10608]++;match(INF);
						__CLOVER_66_0.cloverRec.S[10609]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2305]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2305]==0&false))) {{
							__CLOVER_66_0.cloverRec.S[10610]++;op=Expr.Inf;__CLOVER_66_0.cloverRec.S[10611]++;opera=remplitToken(i2);
						}
						}__CLOVER_66_0.cloverRec.S[10612]++;break;
					}
					case SUPS:if (!__CLOVER_bool68) {__CLOVER_66_0.cloverRec.S[10613]++;__CLOVER_bool68=true;}
					{
						__CLOVER_66_0.cloverRec.S[10614]++;s = LT(1);
						__CLOVER_66_0.cloverRec.S[10615]++;s_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(s);
						__CLOVER_66_0.cloverRec.S[10616]++;astFactory.makeASTRoot(currentAST, s_AST);
						__CLOVER_66_0.cloverRec.S[10617]++;match(SUPS);
						__CLOVER_66_0.cloverRec.S[10618]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2306]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2306]==0&false))) {{
							__CLOVER_66_0.cloverRec.S[10619]++;op=Expr.Sups;__CLOVER_66_0.cloverRec.S[10620]++;opera=remplitToken(s);
						}
						}__CLOVER_66_0.cloverRec.S[10621]++;break;
					}
					case SUP:if (!__CLOVER_bool68) {__CLOVER_66_0.cloverRec.S[10622]++;__CLOVER_bool68=true;}
					{
						__CLOVER_66_0.cloverRec.S[10623]++;s2 = LT(1);
						__CLOVER_66_0.cloverRec.S[10624]++;s2_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(s2);
						__CLOVER_66_0.cloverRec.S[10625]++;astFactory.makeASTRoot(currentAST, s2_AST);
						__CLOVER_66_0.cloverRec.S[10626]++;match(SUP);
						__CLOVER_66_0.cloverRec.S[10627]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2307]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2307]==0&false))) {{
							__CLOVER_66_0.cloverRec.S[10628]++;op=Expr.Sup;__CLOVER_66_0.cloverRec.S[10629]++;opera=remplitToken(s2);
						}
						}__CLOVER_66_0.cloverRec.S[10630]++;break;
					}
					default:if (!__CLOVER_bool68) {__CLOVER_66_0.cloverRec.S[10631]++;__CLOVER_bool68=true;}
					{
						__CLOVER_66_0.cloverRec.S[10632]++;throw new NoViableAltException(LT(1), getFilename());
					}
					}
					}
					__CLOVER_66_0.cloverRec.S[10633]++;e2=expr21();
					__CLOVER_66_0.cloverRec.S[10634]++;astFactory.addASTChild(currentAST, returnAST);
					__CLOVER_66_0.cloverRec.S[10635]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2308]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2308]==0&false))) {{
						/*e=new Expr(op,e,e2);e.oper=opera;*/
						__CLOVER_66_0.cloverRec.S[10636]++;e=new Expr_Binaire(op,e,e2,opera);
					}
				}}
				}else {{
					__CLOVER_66_0.cloverRec.S[10637]++;break _loop233;
				}
				
			}} }while (true);
			}
			__CLOVER_66_0.cloverRec.S[10638]++;expr20_AST = (tinyeiffel.compiler.ASTDefaut)currentAST.root;
		}
		catch (RecognitionException ex) {
			__CLOVER_66_0.cloverRec.S[10639]++;if ((((inputState.guessing==0) && (++__CLOVER_66_0.cloverRec.CT[2309]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2309]==0&false))) {{
				
						__CLOVER_66_0.cloverRec.S[10640]++;logging.erreur(new ErreurSource("Erreur dans l'expression",ex.getLine(),
									ex.getColumn(),ex.getFilename()));
					
			} }else {{
				__CLOVER_66_0.cloverRec.S[10641]++;throw ex;
			}
		}}
		__CLOVER_66_0.cloverRec.S[10642]++;returnAST = expr20_AST;
		__CLOVER_66_0.cloverRec.S[10643]++;return e;
	}
	
	public final Expr  expr21() throws RecognitionException, TokenStreamException {__CLOVER_66_0.cloverRec.M[567]++;
		__CLOVER_66_0.cloverRec.S[10644]++;Expr e=null;
		
		__CLOVER_66_0.cloverRec.S[10645]++;returnAST = null;
		__CLOVER_66_0.cloverRec.S[10646]++;ASTPair currentAST = new ASTPair();
		__CLOVER_66_0.cloverRec.S[10647]++;tinyeiffel.compiler.ASTDefaut expr21_AST = null;
		__CLOVER_66_0.cloverRec.S[10648]++;Token  p = null;
		__CLOVER_66_0.cloverRec.S[10649]++;tinyeiffel.compiler.ASTDefaut p_AST = null;
		__CLOVER_66_0.cloverRec.S[10650]++;Token  m = null;
		__CLOVER_66_0.cloverRec.S[10651]++;tinyeiffel.compiler.ASTDefaut m_AST = null;
		
		__CLOVER_66_0.cloverRec.S[10652]++;int op=0;
		__CLOVER_66_0.cloverRec.S[10653]++;Expr e1=null,e2=null;
		__CLOVER_66_0.cloverRec.S[10654]++;tinyeiffel.ast.Token opera=null;
		
		
		__CLOVER_66_0.cloverRec.S[10655]++;try {      // for error handling
			__CLOVER_66_0.cloverRec.S[10656]++;e1=expr22();
			__CLOVER_66_0.cloverRec.S[10657]++;astFactory.addASTChild(currentAST, returnAST);
			__CLOVER_66_0.cloverRec.S[10658]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2310]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2310]==0&false))) {{
				__CLOVER_66_0.cloverRec.S[10659]++;e=e1;
			}
			}{
			__CLOVER_66_0.cloverRec.S[10660]++;_loop237:
			do {{
				__CLOVER_66_0.cloverRec.S[10661]++;if (((((LA(1)==PLUS||LA(1)==MOINS) && (_tokenSet_1.member(LA(2))) && (_tokenSet_16.member(LA(3))) && (_tokenSet_17.member(LA(4)))) && (++__CLOVER_66_0.cloverRec.CT[2311]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2311]==0&false))) {{
					{
					__CLOVER_66_0.cloverRec.S[10662]++;boolean __CLOVER_bool69=false;switch ( LA(1)) {
					case PLUS:if (!__CLOVER_bool69) {__CLOVER_66_0.cloverRec.S[10663]++;__CLOVER_bool69=true;}
					{
						__CLOVER_66_0.cloverRec.S[10664]++;p = LT(1);
						__CLOVER_66_0.cloverRec.S[10665]++;p_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(p);
						__CLOVER_66_0.cloverRec.S[10666]++;astFactory.makeASTRoot(currentAST, p_AST);
						__CLOVER_66_0.cloverRec.S[10667]++;match(PLUS);
						__CLOVER_66_0.cloverRec.S[10668]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2312]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2312]==0&false))) {{
							__CLOVER_66_0.cloverRec.S[10669]++;op=Expr.Plus;__CLOVER_66_0.cloverRec.S[10670]++;opera=remplitToken(p);
						}
						}__CLOVER_66_0.cloverRec.S[10671]++;break;
					}
					case MOINS:if (!__CLOVER_bool69) {__CLOVER_66_0.cloverRec.S[10672]++;__CLOVER_bool69=true;}
					{
						__CLOVER_66_0.cloverRec.S[10673]++;m = LT(1);
						__CLOVER_66_0.cloverRec.S[10674]++;m_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(m);
						__CLOVER_66_0.cloverRec.S[10675]++;astFactory.makeASTRoot(currentAST, m_AST);
						__CLOVER_66_0.cloverRec.S[10676]++;match(MOINS);
						__CLOVER_66_0.cloverRec.S[10677]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2313]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2313]==0&false))) {{
							__CLOVER_66_0.cloverRec.S[10678]++;op=Expr.Moins;__CLOVER_66_0.cloverRec.S[10679]++;opera=remplitToken(m);
						}
						}__CLOVER_66_0.cloverRec.S[10680]++;break;
					}
					default:if (!__CLOVER_bool69) {__CLOVER_66_0.cloverRec.S[10681]++;__CLOVER_bool69=true;}
					{
						__CLOVER_66_0.cloverRec.S[10682]++;throw new NoViableAltException(LT(1), getFilename());
					}
					}
					}
					__CLOVER_66_0.cloverRec.S[10683]++;e2=expr22();
					__CLOVER_66_0.cloverRec.S[10684]++;astFactory.addASTChild(currentAST, returnAST);
					__CLOVER_66_0.cloverRec.S[10685]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2314]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2314]==0&false))) {{
						/*e=new Expr(op,e,e2);e.oper=opera;*/
						__CLOVER_66_0.cloverRec.S[10686]++;e=new Expr_Binaire(op,e,e2,opera);
					}
				}}
				}else {{
					__CLOVER_66_0.cloverRec.S[10687]++;break _loop237;
				}
				
			}} }while (true);
			}
			__CLOVER_66_0.cloverRec.S[10688]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2315]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2315]==0&false))) {{
				
						//if(e2!=null)
					
			}
			}__CLOVER_66_0.cloverRec.S[10689]++;expr21_AST = (tinyeiffel.compiler.ASTDefaut)currentAST.root;
		}
		catch (RecognitionException ex) {
			__CLOVER_66_0.cloverRec.S[10690]++;if ((((inputState.guessing==0) && (++__CLOVER_66_0.cloverRec.CT[2316]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2316]==0&false))) {{
				
						__CLOVER_66_0.cloverRec.S[10691]++;logging.erreur(new ErreurSource("Erreur dans l'expression",ex.getLine(),
									ex.getColumn(),ex.getFilename()));
					
			} }else {{
				__CLOVER_66_0.cloverRec.S[10692]++;throw ex;
			}
		}}
		__CLOVER_66_0.cloverRec.S[10693]++;returnAST = expr21_AST;
		__CLOVER_66_0.cloverRec.S[10694]++;return e;
	}
	
	public final Expr  expr22() throws RecognitionException, TokenStreamException {__CLOVER_66_0.cloverRec.M[568]++;
		__CLOVER_66_0.cloverRec.S[10695]++;Expr e=null;
		
		__CLOVER_66_0.cloverRec.S[10696]++;returnAST = null;
		__CLOVER_66_0.cloverRec.S[10697]++;ASTPair currentAST = new ASTPair();
		__CLOVER_66_0.cloverRec.S[10698]++;tinyeiffel.compiler.ASTDefaut expr22_AST = null;
		__CLOVER_66_0.cloverRec.S[10699]++;Token  f = null;
		__CLOVER_66_0.cloverRec.S[10700]++;tinyeiffel.compiler.ASTDefaut f_AST = null;
		__CLOVER_66_0.cloverRec.S[10701]++;Token  d1 = null;
		__CLOVER_66_0.cloverRec.S[10702]++;tinyeiffel.compiler.ASTDefaut d1_AST = null;
		__CLOVER_66_0.cloverRec.S[10703]++;Token  d2 = null;
		__CLOVER_66_0.cloverRec.S[10704]++;tinyeiffel.compiler.ASTDefaut d2_AST = null;
		__CLOVER_66_0.cloverRec.S[10705]++;Token  m = null;
		__CLOVER_66_0.cloverRec.S[10706]++;tinyeiffel.compiler.ASTDefaut m_AST = null;
		
		__CLOVER_66_0.cloverRec.S[10707]++;int op=0;
		__CLOVER_66_0.cloverRec.S[10708]++;Expr e1=null,e2=null;
		__CLOVER_66_0.cloverRec.S[10709]++;tinyeiffel.ast.Token opera=null;
		
		
		__CLOVER_66_0.cloverRec.S[10710]++;try {      // for error handling
			__CLOVER_66_0.cloverRec.S[10711]++;e1=expr23();
			__CLOVER_66_0.cloverRec.S[10712]++;astFactory.addASTChild(currentAST, returnAST);
			__CLOVER_66_0.cloverRec.S[10713]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2317]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2317]==0&false))) {{
				__CLOVER_66_0.cloverRec.S[10714]++;e=e1;
			}
			}{
			__CLOVER_66_0.cloverRec.S[10715]++;_loop246:
			do {{
				__CLOVER_66_0.cloverRec.S[10716]++;if ((((((LA(1) >= FOIS && LA(1) <= MOD))) && (++__CLOVER_66_0.cloverRec.CT[2318]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2318]==0&false))) {{
					{
					__CLOVER_66_0.cloverRec.S[10717]++;boolean __CLOVER_bool70=false;switch ( LA(1)) {
					case FOIS:if (!__CLOVER_bool70) {__CLOVER_66_0.cloverRec.S[10718]++;__CLOVER_bool70=true;}
					{
						__CLOVER_66_0.cloverRec.S[10719]++;f = LT(1);
						__CLOVER_66_0.cloverRec.S[10720]++;f_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(f);
						__CLOVER_66_0.cloverRec.S[10721]++;astFactory.makeASTRoot(currentAST, f_AST);
						__CLOVER_66_0.cloverRec.S[10722]++;match(FOIS);
						__CLOVER_66_0.cloverRec.S[10723]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2319]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2319]==0&false))) {{
							__CLOVER_66_0.cloverRec.S[10724]++;op=Expr.Fois;__CLOVER_66_0.cloverRec.S[10725]++;opera=remplitToken(f);
						}
						}__CLOVER_66_0.cloverRec.S[10726]++;break;
					}
					case DIV:if (!__CLOVER_bool70) {__CLOVER_66_0.cloverRec.S[10727]++;__CLOVER_bool70=true;}
					{
						__CLOVER_66_0.cloverRec.S[10728]++;d1 = LT(1);
						__CLOVER_66_0.cloverRec.S[10729]++;d1_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(d1);
						__CLOVER_66_0.cloverRec.S[10730]++;astFactory.makeASTRoot(currentAST, d1_AST);
						__CLOVER_66_0.cloverRec.S[10731]++;match(DIV);
						__CLOVER_66_0.cloverRec.S[10732]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2320]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2320]==0&false))) {{
							__CLOVER_66_0.cloverRec.S[10733]++;op=Expr.Div;__CLOVER_66_0.cloverRec.S[10734]++;opera=remplitToken(d1);
						}
						}__CLOVER_66_0.cloverRec.S[10735]++;break;
					}
					case DIV_ENTIER:if (!__CLOVER_bool70) {__CLOVER_66_0.cloverRec.S[10736]++;__CLOVER_bool70=true;}
					{
						__CLOVER_66_0.cloverRec.S[10737]++;d2 = LT(1);
						__CLOVER_66_0.cloverRec.S[10738]++;d2_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(d2);
						__CLOVER_66_0.cloverRec.S[10739]++;astFactory.makeASTRoot(currentAST, d2_AST);
						__CLOVER_66_0.cloverRec.S[10740]++;match(DIV_ENTIER);
						__CLOVER_66_0.cloverRec.S[10741]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2321]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2321]==0&false))) {{
							__CLOVER_66_0.cloverRec.S[10742]++;op=Expr.Div_entier;__CLOVER_66_0.cloverRec.S[10743]++;opera=remplitToken(d2);
						}
						}__CLOVER_66_0.cloverRec.S[10744]++;break;
					}
					case MOD:if (!__CLOVER_bool70) {__CLOVER_66_0.cloverRec.S[10745]++;__CLOVER_bool70=true;}
					{
						__CLOVER_66_0.cloverRec.S[10746]++;m = LT(1);
						__CLOVER_66_0.cloverRec.S[10747]++;m_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(m);
						__CLOVER_66_0.cloverRec.S[10748]++;astFactory.makeASTRoot(currentAST, m_AST);
						__CLOVER_66_0.cloverRec.S[10749]++;match(MOD);
						__CLOVER_66_0.cloverRec.S[10750]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2322]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2322]==0&false))) {{
							__CLOVER_66_0.cloverRec.S[10751]++;op=Expr.Mod;__CLOVER_66_0.cloverRec.S[10752]++;opera=remplitToken(m);
						}
						}__CLOVER_66_0.cloverRec.S[10753]++;break;
					}
					default:if (!__CLOVER_bool70) {__CLOVER_66_0.cloverRec.S[10754]++;__CLOVER_bool70=true;}
					{
						__CLOVER_66_0.cloverRec.S[10755]++;throw new NoViableAltException(LT(1), getFilename());
					}
					}
					}
					__CLOVER_66_0.cloverRec.S[10756]++;e2=expr23();
					__CLOVER_66_0.cloverRec.S[10757]++;astFactory.addASTChild(currentAST, returnAST);
					__CLOVER_66_0.cloverRec.S[10758]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2323]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2323]==0&false))) {{
						/*e=new Expr(op,e,e2);e.oper=opera;*/
						__CLOVER_66_0.cloverRec.S[10759]++;e=new Expr_Binaire(op,e,e2,opera);
					}
				}}
				}else {{
					__CLOVER_66_0.cloverRec.S[10760]++;break _loop246;
				}
				
			}} }while (true);
			}
			__CLOVER_66_0.cloverRec.S[10761]++;expr22_AST = (tinyeiffel.compiler.ASTDefaut)currentAST.root;
		}
		catch (RecognitionException ex) {
			__CLOVER_66_0.cloverRec.S[10762]++;if ((((inputState.guessing==0) && (++__CLOVER_66_0.cloverRec.CT[2324]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2324]==0&false))) {{
				
						__CLOVER_66_0.cloverRec.S[10763]++;logging.erreur(new ErreurSource("Erreur dans l'expression",ex.getLine(),
									ex.getColumn(),ex.getFilename()));
					
			} }else {{
				__CLOVER_66_0.cloverRec.S[10764]++;throw ex;
			}
		}}
		__CLOVER_66_0.cloverRec.S[10765]++;returnAST = expr22_AST;
		__CLOVER_66_0.cloverRec.S[10766]++;return e;
	}
	
	public final Expr  expr21_b(
		Expr entree
	) throws RecognitionException, TokenStreamException {__CLOVER_66_0.cloverRec.M[569]++;
		__CLOVER_66_0.cloverRec.S[10767]++;Expr e=null;
		
		__CLOVER_66_0.cloverRec.S[10768]++;returnAST = null;
		__CLOVER_66_0.cloverRec.S[10769]++;ASTPair currentAST = new ASTPair();
		__CLOVER_66_0.cloverRec.S[10770]++;tinyeiffel.compiler.ASTDefaut expr21_b_AST = null;
		__CLOVER_66_0.cloverRec.S[10771]++;Token  p = null;
		__CLOVER_66_0.cloverRec.S[10772]++;tinyeiffel.compiler.ASTDefaut p_AST = null;
		__CLOVER_66_0.cloverRec.S[10773]++;Token  m = null;
		__CLOVER_66_0.cloverRec.S[10774]++;tinyeiffel.compiler.ASTDefaut m_AST = null;
		
		__CLOVER_66_0.cloverRec.S[10775]++;int op=0;
		__CLOVER_66_0.cloverRec.S[10776]++;Expr e1=entree,e2=null;
		__CLOVER_66_0.cloverRec.S[10777]++;tinyeiffel.ast.Token opera=null;
		__CLOVER_66_0.cloverRec.S[10778]++;e=entree;
		
		
		__CLOVER_66_0.cloverRec.S[10779]++;try {      // for error handling
			__CLOVER_66_0.cloverRec.S[10780]++;boolean __CLOVER_bool71=false;switch ( LA(1)) {
			case PLUS:if (!__CLOVER_bool71) {__CLOVER_66_0.cloverRec.S[10781]++;__CLOVER_bool71=true;}
			case MOINS:if (!__CLOVER_bool71) {__CLOVER_66_0.cloverRec.S[10782]++;__CLOVER_bool71=true;}
			{
				{
				__CLOVER_66_0.cloverRec.S[10783]++;boolean __CLOVER_bool72=false;switch ( LA(1)) {
				case PLUS:if (!__CLOVER_bool72) {__CLOVER_66_0.cloverRec.S[10784]++;__CLOVER_bool72=true;}
				{
					__CLOVER_66_0.cloverRec.S[10785]++;p = LT(1);
					__CLOVER_66_0.cloverRec.S[10786]++;p_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(p);
					__CLOVER_66_0.cloverRec.S[10787]++;astFactory.makeASTRoot(currentAST, p_AST);
					__CLOVER_66_0.cloverRec.S[10788]++;match(PLUS);
					__CLOVER_66_0.cloverRec.S[10789]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2325]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2325]==0&false))) {{
						__CLOVER_66_0.cloverRec.S[10790]++;op=Expr.Plus;__CLOVER_66_0.cloverRec.S[10791]++;opera=remplitToken(p);
					}
					}__CLOVER_66_0.cloverRec.S[10792]++;break;
				}
				case MOINS:if (!__CLOVER_bool72) {__CLOVER_66_0.cloverRec.S[10793]++;__CLOVER_bool72=true;}
				{
					__CLOVER_66_0.cloverRec.S[10794]++;m = LT(1);
					__CLOVER_66_0.cloverRec.S[10795]++;m_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(m);
					__CLOVER_66_0.cloverRec.S[10796]++;astFactory.makeASTRoot(currentAST, m_AST);
					__CLOVER_66_0.cloverRec.S[10797]++;match(MOINS);
					__CLOVER_66_0.cloverRec.S[10798]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2326]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2326]==0&false))) {{
						__CLOVER_66_0.cloverRec.S[10799]++;op=Expr.Moins;__CLOVER_66_0.cloverRec.S[10800]++;opera=remplitToken(m);
					}
					}__CLOVER_66_0.cloverRec.S[10801]++;break;
				}
				default:if (!__CLOVER_bool72) {__CLOVER_66_0.cloverRec.S[10802]++;__CLOVER_bool72=true;}
				{
					__CLOVER_66_0.cloverRec.S[10803]++;throw new NoViableAltException(LT(1), getFilename());
				}
				}
				}
				__CLOVER_66_0.cloverRec.S[10804]++;e2=expr22();
				__CLOVER_66_0.cloverRec.S[10805]++;astFactory.addASTChild(currentAST, returnAST);
				__CLOVER_66_0.cloverRec.S[10806]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2327]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2327]==0&false))) {{
					
									__CLOVER_66_0.cloverRec.S[10807]++;e=new Expr_Binaire(op,e1,e2,opera);
									__CLOVER_66_0.cloverRec.S[10808]++;e1=e;
								
				}
				}__CLOVER_66_0.cloverRec.S[10809]++;e=expr21_b(e1);
				__CLOVER_66_0.cloverRec.S[10810]++;astFactory.addASTChild(currentAST, returnAST);
				__CLOVER_66_0.cloverRec.S[10811]++;expr21_b_AST = (tinyeiffel.compiler.ASTDefaut)currentAST.root;
				__CLOVER_66_0.cloverRec.S[10812]++;break;
			}
			case EOF:if (!__CLOVER_bool71) {__CLOVER_66_0.cloverRec.S[10813]++;__CLOVER_bool71=true;}
			{
				__CLOVER_66_0.cloverRec.S[10814]++;expr21_b_AST = (tinyeiffel.compiler.ASTDefaut)currentAST.root;
				__CLOVER_66_0.cloverRec.S[10815]++;break;
			}
			default:if (!__CLOVER_bool71) {__CLOVER_66_0.cloverRec.S[10816]++;__CLOVER_bool71=true;}
			{
				__CLOVER_66_0.cloverRec.S[10817]++;throw new NoViableAltException(LT(1), getFilename());
			}
			}
		}
		catch (RecognitionException ex) {
			__CLOVER_66_0.cloverRec.S[10818]++;if ((((inputState.guessing==0) && (++__CLOVER_66_0.cloverRec.CT[2328]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2328]==0&false))) {{
				__CLOVER_66_0.cloverRec.S[10819]++;reportError(ex);
				__CLOVER_66_0.cloverRec.S[10820]++;consume();
				__CLOVER_66_0.cloverRec.S[10821]++;consumeUntil(_tokenSet_8);
			} }else {{
			  __CLOVER_66_0.cloverRec.S[10822]++;throw ex;
			}
		}}
		__CLOVER_66_0.cloverRec.S[10823]++;returnAST = expr21_b_AST;
		__CLOVER_66_0.cloverRec.S[10824]++;return e;
	}
	
	public final Expr  expr23() throws RecognitionException, TokenStreamException {__CLOVER_66_0.cloverRec.M[570]++;
		__CLOVER_66_0.cloverRec.S[10825]++;Expr e=null;
		
		__CLOVER_66_0.cloverRec.S[10826]++;returnAST = null;
		__CLOVER_66_0.cloverRec.S[10827]++;ASTPair currentAST = new ASTPair();
		__CLOVER_66_0.cloverRec.S[10828]++;tinyeiffel.compiler.ASTDefaut expr23_AST = null;
		__CLOVER_66_0.cloverRec.S[10829]++;Token  p = null;
		__CLOVER_66_0.cloverRec.S[10830]++;tinyeiffel.compiler.ASTDefaut p_AST = null;
		
		__CLOVER_66_0.cloverRec.S[10831]++;int op=0;
		__CLOVER_66_0.cloverRec.S[10832]++;Expr e1=null,e2=null;
		__CLOVER_66_0.cloverRec.S[10833]++;tinyeiffel.ast.Token opera=null;
		
		
		__CLOVER_66_0.cloverRec.S[10834]++;try {      // for error handling
			__CLOVER_66_0.cloverRec.S[10835]++;e1=expr24();
			__CLOVER_66_0.cloverRec.S[10836]++;astFactory.addASTChild(currentAST, returnAST);
			__CLOVER_66_0.cloverRec.S[10837]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2329]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2329]==0&false))) {{
				__CLOVER_66_0.cloverRec.S[10838]++;e=e1;
			}
			}{
			__CLOVER_66_0.cloverRec.S[10839]++;boolean __CLOVER_bool73=false;switch ( LA(1)) {
			case PUISS:if (!__CLOVER_bool73) {__CLOVER_66_0.cloverRec.S[10840]++;__CLOVER_bool73=true;}
			{
				__CLOVER_66_0.cloverRec.S[10841]++;p = LT(1);
				__CLOVER_66_0.cloverRec.S[10842]++;p_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(p);
				__CLOVER_66_0.cloverRec.S[10843]++;astFactory.makeASTRoot(currentAST, p_AST);
				__CLOVER_66_0.cloverRec.S[10844]++;match(PUISS);
				__CLOVER_66_0.cloverRec.S[10845]++;e2=expr23();
				__CLOVER_66_0.cloverRec.S[10846]++;astFactory.addASTChild(currentAST, returnAST);
				__CLOVER_66_0.cloverRec.S[10847]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2330]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2330]==0&false))) {{
					
									/*e=new Expr(Expr.Puiss,e,e2);
									opera=remplitToken(p);
									e.oper=opera;*/
					__CLOVER_66_0.cloverRec.S[10848]++;e=new Expr_Binaire(Expr.Puiss,e,e2,remplitToken(p));
								
				}
				}__CLOVER_66_0.cloverRec.S[10849]++;break;
			}
			case EOF:if (!__CLOVER_bool73) {__CLOVER_66_0.cloverRec.S[10850]++;__CLOVER_bool73=true;}
			case EXPANDED:if (!__CLOVER_bool73) {__CLOVER_66_0.cloverRec.S[10851]++;__CLOVER_bool73=true;}
			case DEFERRED:if (!__CLOVER_bool73) {__CLOVER_66_0.cloverRec.S[10852]++;__CLOVER_bool73=true;}
			case FEATURE:if (!__CLOVER_bool73) {__CLOVER_66_0.cloverRec.S[10853]++;__CLOVER_bool73=true;}
			case VIRGULE:if (!__CLOVER_bool73) {__CLOVER_66_0.cloverRec.S[10854]++;__CLOVER_bool73=true;}
			case ACOLADEF:if (!__CLOVER_bool73) {__CLOVER_66_0.cloverRec.S[10855]++;__CLOVER_bool73=true;}
			case SEMI:if (!__CLOVER_bool73) {__CLOVER_66_0.cloverRec.S[10856]++;__CLOVER_bool73=true;}
			case INVARIANT:if (!__CLOVER_bool73) {__CLOVER_66_0.cloverRec.S[10857]++;__CLOVER_bool73=true;}
			case END:if (!__CLOVER_bool73) {__CLOVER_66_0.cloverRec.S[10858]++;__CLOVER_bool73=true;}
			case ID:if (!__CLOVER_bool73) {__CLOVER_66_0.cloverRec.S[10859]++;__CLOVER_bool73=true;}
			case STRING:if (!__CLOVER_bool73) {__CLOVER_66_0.cloverRec.S[10860]++;__CLOVER_bool73=true;}
			case RENAME:if (!__CLOVER_bool73) {__CLOVER_66_0.cloverRec.S[10861]++;__CLOVER_bool73=true;}
			case EXPORT:if (!__CLOVER_bool73) {__CLOVER_66_0.cloverRec.S[10862]++;__CLOVER_bool73=true;}
			case UNDEFINE:if (!__CLOVER_bool73) {__CLOVER_66_0.cloverRec.S[10863]++;__CLOVER_bool73=true;}
			case REDEFINE:if (!__CLOVER_bool73) {__CLOVER_66_0.cloverRec.S[10864]++;__CLOVER_bool73=true;}
			case SELECT:if (!__CLOVER_bool73) {__CLOVER_66_0.cloverRec.S[10865]++;__CLOVER_bool73=true;}
			case CREATION:if (!__CLOVER_bool73) {__CLOVER_66_0.cloverRec.S[10866]++;__CLOVER_bool73=true;}
			case INFIX:if (!__CLOVER_bool73) {__CLOVER_66_0.cloverRec.S[10867]++;__CLOVER_bool73=true;}
			case PREFIX:if (!__CLOVER_bool73) {__CLOVER_66_0.cloverRec.S[10868]++;__CLOVER_bool73=true;}
			case LPAREN:if (!__CLOVER_bool73) {__CLOVER_66_0.cloverRec.S[10869]++;__CLOVER_bool73=true;}
			case RPAREN:if (!__CLOVER_bool73) {__CLOVER_66_0.cloverRec.S[10870]++;__CLOVER_bool73=true;}
			case CROCHETF:if (!__CLOVER_bool73) {__CLOVER_66_0.cloverRec.S[10871]++;__CLOVER_bool73=true;}
			case LIKE:if (!__CLOVER_bool73) {__CLOVER_66_0.cloverRec.S[10872]++;__CLOVER_bool73=true;}
			case FROZEN:if (!__CLOVER_bool73) {__CLOVER_66_0.cloverRec.S[10873]++;__CLOVER_bool73=true;}
			case IS:if (!__CLOVER_bool73) {__CLOVER_66_0.cloverRec.S[10874]++;__CLOVER_bool73=true;}
			case ELSE:if (!__CLOVER_bool73) {__CLOVER_66_0.cloverRec.S[10875]++;__CLOVER_bool73=true;}
			case ENSURE:if (!__CLOVER_bool73) {__CLOVER_66_0.cloverRec.S[10876]++;__CLOVER_bool73=true;}
			case THEN:if (!__CLOVER_bool73) {__CLOVER_66_0.cloverRec.S[10877]++;__CLOVER_bool73=true;}
			case RESCUE:if (!__CLOVER_bool73) {__CLOVER_66_0.cloverRec.S[10878]++;__CLOVER_bool73=true;}
			case LOCAL:if (!__CLOVER_bool73) {__CLOVER_66_0.cloverRec.S[10879]++;__CLOVER_bool73=true;}
			case DO:if (!__CLOVER_bool73) {__CLOVER_66_0.cloverRec.S[10880]++;__CLOVER_bool73=true;}
			case ONCE:if (!__CLOVER_bool73) {__CLOVER_66_0.cloverRec.S[10881]++;__CLOVER_bool73=true;}
			case EXTERNAL:if (!__CLOVER_bool73) {__CLOVER_66_0.cloverRec.S[10882]++;__CLOVER_bool73=true;}
			case LPARENT:if (!__CLOVER_bool73) {__CLOVER_66_0.cloverRec.S[10883]++;__CLOVER_bool73=true;}
			case RPARENT:if (!__CLOVER_bool73) {__CLOVER_66_0.cloverRec.S[10884]++;__CLOVER_bool73=true;}
			case INT:if (!__CLOVER_bool73) {__CLOVER_66_0.cloverRec.S[10885]++;__CLOVER_bool73=true;}
			case REAL:if (!__CLOVER_bool73) {__CLOVER_66_0.cloverRec.S[10886]++;__CLOVER_bool73=true;}
			case CHAR:if (!__CLOVER_bool73) {__CLOVER_66_0.cloverRec.S[10887]++;__CLOVER_bool73=true;}
			case FROM:if (!__CLOVER_bool73) {__CLOVER_66_0.cloverRec.S[10888]++;__CLOVER_bool73=true;}
			case VARIANT:if (!__CLOVER_bool73) {__CLOVER_66_0.cloverRec.S[10889]++;__CLOVER_bool73=true;}
			case UNTIL:if (!__CLOVER_bool73) {__CLOVER_66_0.cloverRec.S[10890]++;__CLOVER_bool73=true;}
			case LOOP:if (!__CLOVER_bool73) {__CLOVER_66_0.cloverRec.S[10891]++;__CLOVER_bool73=true;}
			case IF:if (!__CLOVER_bool73) {__CLOVER_66_0.cloverRec.S[10892]++;__CLOVER_bool73=true;}
			case ELSEIF:if (!__CLOVER_bool73) {__CLOVER_66_0.cloverRec.S[10893]++;__CLOVER_bool73=true;}
			case EXCLAMATION:if (!__CLOVER_bool73) {__CLOVER_66_0.cloverRec.S[10894]++;__CLOVER_bool73=true;}
			case RETRY:if (!__CLOVER_bool73) {__CLOVER_66_0.cloverRec.S[10895]++;__CLOVER_bool73=true;}
			case INSPECT:if (!__CLOVER_bool73) {__CLOVER_66_0.cloverRec.S[10896]++;__CLOVER_bool73=true;}
			case WHEN:if (!__CLOVER_bool73) {__CLOVER_66_0.cloverRec.S[10897]++;__CLOVER_bool73=true;}
			case CHECK:if (!__CLOVER_bool73) {__CLOVER_66_0.cloverRec.S[10898]++;__CLOVER_bool73=true;}
			case DEBUG:if (!__CLOVER_bool73) {__CLOVER_66_0.cloverRec.S[10899]++;__CLOVER_bool73=true;}
			case DEUX_POINT:if (!__CLOVER_bool73) {__CLOVER_66_0.cloverRec.S[10900]++;__CLOVER_bool73=true;}
			case XOR:if (!__CLOVER_bool73) {__CLOVER_66_0.cloverRec.S[10901]++;__CLOVER_bool73=true;}
			case IMPLIES:if (!__CLOVER_bool73) {__CLOVER_66_0.cloverRec.S[10902]++;__CLOVER_bool73=true;}
			case OR:if (!__CLOVER_bool73) {__CLOVER_66_0.cloverRec.S[10903]++;__CLOVER_bool73=true;}
			case AND:if (!__CLOVER_bool73) {__CLOVER_66_0.cloverRec.S[10904]++;__CLOVER_bool73=true;}
			case EGAL:if (!__CLOVER_bool73) {__CLOVER_66_0.cloverRec.S[10905]++;__CLOVER_bool73=true;}
			case DIFF:if (!__CLOVER_bool73) {__CLOVER_66_0.cloverRec.S[10906]++;__CLOVER_bool73=true;}
			case INFS:if (!__CLOVER_bool73) {__CLOVER_66_0.cloverRec.S[10907]++;__CLOVER_bool73=true;}
			case INF:if (!__CLOVER_bool73) {__CLOVER_66_0.cloverRec.S[10908]++;__CLOVER_bool73=true;}
			case SUPS:if (!__CLOVER_bool73) {__CLOVER_66_0.cloverRec.S[10909]++;__CLOVER_bool73=true;}
			case SUP:if (!__CLOVER_bool73) {__CLOVER_66_0.cloverRec.S[10910]++;__CLOVER_bool73=true;}
			case PLUS:if (!__CLOVER_bool73) {__CLOVER_66_0.cloverRec.S[10911]++;__CLOVER_bool73=true;}
			case MOINS:if (!__CLOVER_bool73) {__CLOVER_66_0.cloverRec.S[10912]++;__CLOVER_bool73=true;}
			case FOIS:if (!__CLOVER_bool73) {__CLOVER_66_0.cloverRec.S[10913]++;__CLOVER_bool73=true;}
			case DIV:if (!__CLOVER_bool73) {__CLOVER_66_0.cloverRec.S[10914]++;__CLOVER_bool73=true;}
			case DIV_ENTIER:if (!__CLOVER_bool73) {__CLOVER_66_0.cloverRec.S[10915]++;__CLOVER_bool73=true;}
			case MOD:if (!__CLOVER_bool73) {__CLOVER_66_0.cloverRec.S[10916]++;__CLOVER_bool73=true;}
			case FREEOP:if (!__CLOVER_bool73) {__CLOVER_66_0.cloverRec.S[10917]++;__CLOVER_bool73=true;}
			case OLD:if (!__CLOVER_bool73) {__CLOVER_66_0.cloverRec.S[10918]++;__CLOVER_bool73=true;}
			case NOT:if (!__CLOVER_bool73) {__CLOVER_66_0.cloverRec.S[10919]++;__CLOVER_bool73=true;}
			case DOLLARD:if (!__CLOVER_bool73) {__CLOVER_66_0.cloverRec.S[10920]++;__CLOVER_bool73=true;}
			case DEBUT_ARRAY:if (!__CLOVER_bool73) {__CLOVER_66_0.cloverRec.S[10921]++;__CLOVER_bool73=true;}
			case FIN_ARRAY:if (!__CLOVER_bool73) {__CLOVER_66_0.cloverRec.S[10922]++;__CLOVER_bool73=true;}
			case TRUE:if (!__CLOVER_bool73) {__CLOVER_66_0.cloverRec.S[10923]++;__CLOVER_bool73=true;}
			case FALSE:if (!__CLOVER_bool73) {__CLOVER_66_0.cloverRec.S[10924]++;__CLOVER_bool73=true;}
			case STRING2:if (!__CLOVER_bool73) {__CLOVER_66_0.cloverRec.S[10925]++;__CLOVER_bool73=true;}
			{
				__CLOVER_66_0.cloverRec.S[10926]++;break;
			}
			default:if (!__CLOVER_bool73) {__CLOVER_66_0.cloverRec.S[10927]++;__CLOVER_bool73=true;}
			{
				__CLOVER_66_0.cloverRec.S[10928]++;throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			__CLOVER_66_0.cloverRec.S[10929]++;expr23_AST = (tinyeiffel.compiler.ASTDefaut)currentAST.root;
		}
		catch (RecognitionException ex) {
			__CLOVER_66_0.cloverRec.S[10930]++;if ((((inputState.guessing==0) && (++__CLOVER_66_0.cloverRec.CT[2331]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2331]==0&false))) {{
				
						__CLOVER_66_0.cloverRec.S[10931]++;logging.erreur(new ErreurSource("Erreur dans l'expression",ex.getLine(),
									ex.getColumn(),ex.getFilename()));
					
			} }else {{
				__CLOVER_66_0.cloverRec.S[10932]++;throw ex;
			}
		}}
		__CLOVER_66_0.cloverRec.S[10933]++;returnAST = expr23_AST;
		__CLOVER_66_0.cloverRec.S[10934]++;return e;
	}
	
	public final Expr  expr24() throws RecognitionException, TokenStreamException {__CLOVER_66_0.cloverRec.M[571]++;
		__CLOVER_66_0.cloverRec.S[10935]++;Expr e=null;
		
		__CLOVER_66_0.cloverRec.S[10936]++;returnAST = null;
		__CLOVER_66_0.cloverRec.S[10937]++;ASTPair currentAST = new ASTPair();
		__CLOVER_66_0.cloverRec.S[10938]++;tinyeiffel.compiler.ASTDefaut expr24_AST = null;
		__CLOVER_66_0.cloverRec.S[10939]++;Token  f = null;
		__CLOVER_66_0.cloverRec.S[10940]++;tinyeiffel.compiler.ASTDefaut f_AST = null;
		
		__CLOVER_66_0.cloverRec.S[10941]++;int op=0;
		__CLOVER_66_0.cloverRec.S[10942]++;Expr e1=null,e2=null;
		
		
		__CLOVER_66_0.cloverRec.S[10943]++;try {      // for error handling
			__CLOVER_66_0.cloverRec.S[10944]++;e1=expr24_2();
			__CLOVER_66_0.cloverRec.S[10945]++;astFactory.addASTChild(currentAST, returnAST);
			__CLOVER_66_0.cloverRec.S[10946]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2332]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2332]==0&false))) {{
				__CLOVER_66_0.cloverRec.S[10947]++;e=e1;
			}
			}{
			__CLOVER_66_0.cloverRec.S[10948]++;_loop253:
			do {{
				__CLOVER_66_0.cloverRec.S[10949]++;boolean synPredMatched252 = false;
				__CLOVER_66_0.cloverRec.S[10950]++;if ((((((LA(1)==FREEOP) && (_tokenSet_1.member(LA(2))) && (_tokenSet_18.member(LA(3))) && (_tokenSet_17.member(LA(4))))) && (++__CLOVER_66_0.cloverRec.CT[2333]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2333]==0&false))) {{
					__CLOVER_66_0.cloverRec.S[10951]++;int _m252 = mark();
					__CLOVER_66_0.cloverRec.S[10952]++;synPredMatched252 = true;
					__CLOVER_66_0.cloverRec.S[10953]++;inputState.guessing++;
					__CLOVER_66_0.cloverRec.S[10954]++;try {
						{
						__CLOVER_66_0.cloverRec.S[10955]++;match(FREEOP);
						__CLOVER_66_0.cloverRec.S[10956]++;expr24_2();
						}
					}
					catch (RecognitionException pe) {
						__CLOVER_66_0.cloverRec.S[10957]++;synPredMatched252 = false;
					}
					__CLOVER_66_0.cloverRec.S[10958]++;rewind(_m252);
					__CLOVER_66_0.cloverRec.S[10959]++;inputState.guessing--;
				}
				}__CLOVER_66_0.cloverRec.S[10960]++;if ( (((synPredMatched252 ) && (++__CLOVER_66_0.cloverRec.CT[2334]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2334]==0&false))) {{
					__CLOVER_66_0.cloverRec.S[10961]++;f = LT(1);
					__CLOVER_66_0.cloverRec.S[10962]++;f_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(f);
					__CLOVER_66_0.cloverRec.S[10963]++;astFactory.addASTChild(currentAST, f_AST);
					__CLOVER_66_0.cloverRec.S[10964]++;match(FREEOP);
					__CLOVER_66_0.cloverRec.S[10965]++;e2=expr24_2();
					__CLOVER_66_0.cloverRec.S[10966]++;astFactory.addASTChild(currentAST, returnAST);
					__CLOVER_66_0.cloverRec.S[10967]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2335]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2335]==0&false))) {{
						__CLOVER_66_0.cloverRec.S[10968]++;e=new Expr_Binaire(f.getText(),e,e2,remplitToken(f));
					}
				}}
				}else {{
					__CLOVER_66_0.cloverRec.S[10969]++;break _loop253;
				}
				
			}} }while (true);
			}
			__CLOVER_66_0.cloverRec.S[10970]++;expr24_AST = (tinyeiffel.compiler.ASTDefaut)currentAST.root;
		}
		catch (RecognitionException ex) {
			__CLOVER_66_0.cloverRec.S[10971]++;if ((((inputState.guessing==0) && (++__CLOVER_66_0.cloverRec.CT[2336]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2336]==0&false))) {{
				
						__CLOVER_66_0.cloverRec.S[10972]++;logging.erreur(new ErreurSource("Erreur dans l'expression",ex.getLine(),
									ex.getColumn(),ex.getFilename()));
					
			} }else {{
				__CLOVER_66_0.cloverRec.S[10973]++;throw ex;
			}
		}}
		__CLOVER_66_0.cloverRec.S[10974]++;returnAST = expr24_AST;
		__CLOVER_66_0.cloverRec.S[10975]++;return e;
	}
	
	public final Expr  expr24_2() throws RecognitionException, TokenStreamException {__CLOVER_66_0.cloverRec.M[572]++;
		__CLOVER_66_0.cloverRec.S[10976]++;Expr e=null;
		
		__CLOVER_66_0.cloverRec.S[10977]++;returnAST = null;
		__CLOVER_66_0.cloverRec.S[10978]++;ASTPair currentAST = new ASTPair();
		__CLOVER_66_0.cloverRec.S[10979]++;tinyeiffel.compiler.ASTDefaut expr24_2_AST = null;
		__CLOVER_66_0.cloverRec.S[10980]++;Token  f = null;
		__CLOVER_66_0.cloverRec.S[10981]++;tinyeiffel.compiler.ASTDefaut f_AST = null;
		
		__CLOVER_66_0.cloverRec.S[10982]++;int op=0,i;
		__CLOVER_66_0.cloverRec.S[10983]++;boolean operation=false;
		__CLOVER_66_0.cloverRec.S[10984]++;Expr e1=null;
		__CLOVER_66_0.cloverRec.S[10985]++;tinyeiffel.ast.Token opera=null;
		__CLOVER_66_0.cloverRec.S[10986]++;Vector v1=new Vector();
		
		
		__CLOVER_66_0.cloverRec.S[10987]++;try {      // for error handling
			{
			__CLOVER_66_0.cloverRec.S[10988]++;_loop256:
			do {{
				__CLOVER_66_0.cloverRec.S[10989]++;if (((((LA(1)==FREEOP)) && (++__CLOVER_66_0.cloverRec.CT[2337]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2337]==0&false))) {{
					__CLOVER_66_0.cloverRec.S[10990]++;f = LT(1);
					__CLOVER_66_0.cloverRec.S[10991]++;f_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(f);
					__CLOVER_66_0.cloverRec.S[10992]++;astFactory.addASTChild(currentAST, f_AST);
					__CLOVER_66_0.cloverRec.S[10993]++;match(FREEOP);
					__CLOVER_66_0.cloverRec.S[10994]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2338]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2338]==0&false))) {{
						__CLOVER_66_0.cloverRec.S[10995]++;operation=true;__CLOVER_66_0.cloverRec.S[10996]++;opera=remplitToken(f);__CLOVER_66_0.cloverRec.S[10997]++;v1.addElement(opera);
					}
				}}
				}else {{
					__CLOVER_66_0.cloverRec.S[10998]++;break _loop256;
				}
				
			}} }while (true);
			}
			__CLOVER_66_0.cloverRec.S[10999]++;e1=expr25();
			__CLOVER_66_0.cloverRec.S[11000]++;astFactory.addASTChild(currentAST, returnAST);
			__CLOVER_66_0.cloverRec.S[11001]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2339]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2339]==0&false))) {{
				// TODO: Erreur si plusieurs fois free_op (ex: @ @ @ a -> @ a)
							__CLOVER_66_0.cloverRec.S[11002]++;if((((operation) && (++__CLOVER_66_0.cloverRec.CT[2340]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2340]==0&false)))
							{{
								__CLOVER_66_0.cloverRec.S[11003]++;e=e1;
								__CLOVER_66_0.cloverRec.S[11004]++;for(i=v1.size()-1;(((i>=0) && (++__CLOVER_66_0.cloverRec.CT[2341]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2341]==0&false));i--)
								{{
									__CLOVER_66_0.cloverRec.S[11005]++;opera=(tinyeiffel.ast.Token)v1.elementAt(i);
									__CLOVER_66_0.cloverRec.S[11006]++;e=new Expr_Unaire(/*f.getText()*/opera.text,e,opera);
								}
							}}
							}else
							{{
								__CLOVER_66_0.cloverRec.S[11007]++;e=e1;
							}
						
			}}
			}__CLOVER_66_0.cloverRec.S[11008]++;expr24_2_AST = (tinyeiffel.compiler.ASTDefaut)currentAST.root;
		}
		catch (RecognitionException ex) {
			__CLOVER_66_0.cloverRec.S[11009]++;if ((((inputState.guessing==0) && (++__CLOVER_66_0.cloverRec.CT[2342]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2342]==0&false))) {{
				
						__CLOVER_66_0.cloverRec.S[11010]++;logging.erreur(new ErreurSource("Erreur dans l'expression",ex.getLine(),
									ex.getColumn(),ex.getFilename()));
					
			} }else {{
				__CLOVER_66_0.cloverRec.S[11011]++;throw ex;
			}
		}}
		__CLOVER_66_0.cloverRec.S[11012]++;returnAST = expr24_2_AST;
		__CLOVER_66_0.cloverRec.S[11013]++;return e;
	}
	
	public final Expr  expr25() throws RecognitionException, TokenStreamException {__CLOVER_66_0.cloverRec.M[573]++;
		__CLOVER_66_0.cloverRec.S[11014]++;Expr e=null;
		
		__CLOVER_66_0.cloverRec.S[11015]++;returnAST = null;
		__CLOVER_66_0.cloverRec.S[11016]++;ASTPair currentAST = new ASTPair();
		__CLOVER_66_0.cloverRec.S[11017]++;tinyeiffel.compiler.ASTDefaut expr25_AST = null;
		__CLOVER_66_0.cloverRec.S[11018]++;Token  o = null;
		__CLOVER_66_0.cloverRec.S[11019]++;tinyeiffel.compiler.ASTDefaut o_AST = null;
		__CLOVER_66_0.cloverRec.S[11020]++;Token  n = null;
		__CLOVER_66_0.cloverRec.S[11021]++;tinyeiffel.compiler.ASTDefaut n_AST = null;
		__CLOVER_66_0.cloverRec.S[11022]++;Token  p = null;
		__CLOVER_66_0.cloverRec.S[11023]++;tinyeiffel.compiler.ASTDefaut p_AST = null;
		__CLOVER_66_0.cloverRec.S[11024]++;Token  m = null;
		__CLOVER_66_0.cloverRec.S[11025]++;tinyeiffel.compiler.ASTDefaut m_AST = null;
		__CLOVER_66_0.cloverRec.S[11026]++;Token  d = null;
		__CLOVER_66_0.cloverRec.S[11027]++;tinyeiffel.compiler.ASTDefaut d_AST = null;
		
		__CLOVER_66_0.cloverRec.S[11028]++;int op=0,i;
		__CLOVER_66_0.cloverRec.S[11029]++;Expr e1=null;
		__CLOVER_66_0.cloverRec.S[11030]++;tinyeiffel.ast.Token opera=null;
		__CLOVER_66_0.cloverRec.S[11031]++;Vector v1=new Vector(),v2=new Vector();
		// TODO: Erreur si plusieurs fois operation (ex: not - + a -> + a)
		
		
		__CLOVER_66_0.cloverRec.S[11032]++;try {      // for error handling
			{
			__CLOVER_66_0.cloverRec.S[11033]++;_loop259:
			do {{
				__CLOVER_66_0.cloverRec.S[11034]++;boolean __CLOVER_bool74=false;switch ( LA(1)) {
				case OLD:if (!__CLOVER_bool74) {__CLOVER_66_0.cloverRec.S[11035]++;__CLOVER_bool74=true;}
				{
					__CLOVER_66_0.cloverRec.S[11036]++;o = LT(1);
					__CLOVER_66_0.cloverRec.S[11037]++;o_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(o);
					__CLOVER_66_0.cloverRec.S[11038]++;astFactory.makeASTRoot(currentAST, o_AST);
					__CLOVER_66_0.cloverRec.S[11039]++;match(OLD);
					__CLOVER_66_0.cloverRec.S[11040]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2343]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2343]==0&false))) {{
						__CLOVER_66_0.cloverRec.S[11041]++;op=Expr.Old;__CLOVER_66_0.cloverRec.S[11042]++;opera=remplitToken(o);
								__CLOVER_66_0.cloverRec.S[11043]++;v1.addElement(new Integer(op));__CLOVER_66_0.cloverRec.S[11044]++;v2.addElement(opera);
					}
					}__CLOVER_66_0.cloverRec.S[11045]++;break;
				}
				case NOT:if (!__CLOVER_bool74) {__CLOVER_66_0.cloverRec.S[11046]++;__CLOVER_bool74=true;}
				{
					__CLOVER_66_0.cloverRec.S[11047]++;n = LT(1);
					__CLOVER_66_0.cloverRec.S[11048]++;n_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(n);
					__CLOVER_66_0.cloverRec.S[11049]++;astFactory.makeASTRoot(currentAST, n_AST);
					__CLOVER_66_0.cloverRec.S[11050]++;match(NOT);
					__CLOVER_66_0.cloverRec.S[11051]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2344]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2344]==0&false))) {{
						__CLOVER_66_0.cloverRec.S[11052]++;op=Expr.Not;__CLOVER_66_0.cloverRec.S[11053]++;opera=remplitToken(n);
								__CLOVER_66_0.cloverRec.S[11054]++;v1.addElement(new Integer(op));__CLOVER_66_0.cloverRec.S[11055]++;v2.addElement(opera);
					}
					}__CLOVER_66_0.cloverRec.S[11056]++;break;
				}
				case PLUS:if (!__CLOVER_bool74) {__CLOVER_66_0.cloverRec.S[11057]++;__CLOVER_bool74=true;}
				{
					__CLOVER_66_0.cloverRec.S[11058]++;p = LT(1);
					__CLOVER_66_0.cloverRec.S[11059]++;p_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(p);
					__CLOVER_66_0.cloverRec.S[11060]++;astFactory.makeASTRoot(currentAST, p_AST);
					__CLOVER_66_0.cloverRec.S[11061]++;match(PLUS);
					__CLOVER_66_0.cloverRec.S[11062]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2345]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2345]==0&false))) {{
						__CLOVER_66_0.cloverRec.S[11063]++;op=Expr.PlusU;__CLOVER_66_0.cloverRec.S[11064]++;opera=remplitToken(p);
								__CLOVER_66_0.cloverRec.S[11065]++;v1.addElement(new Integer(op));__CLOVER_66_0.cloverRec.S[11066]++;v2.addElement(opera);
					}
					}__CLOVER_66_0.cloverRec.S[11067]++;break;
				}
				case MOINS:if (!__CLOVER_bool74) {__CLOVER_66_0.cloverRec.S[11068]++;__CLOVER_bool74=true;}
				{
					__CLOVER_66_0.cloverRec.S[11069]++;m = LT(1);
					__CLOVER_66_0.cloverRec.S[11070]++;m_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(m);
					__CLOVER_66_0.cloverRec.S[11071]++;astFactory.makeASTRoot(currentAST, m_AST);
					__CLOVER_66_0.cloverRec.S[11072]++;match(MOINS);
					__CLOVER_66_0.cloverRec.S[11073]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2346]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2346]==0&false))) {{
						__CLOVER_66_0.cloverRec.S[11074]++;op=Expr.MoinsU;__CLOVER_66_0.cloverRec.S[11075]++;opera=remplitToken(m);
								__CLOVER_66_0.cloverRec.S[11076]++;v1.addElement(new Integer(op));__CLOVER_66_0.cloverRec.S[11077]++;v2.addElement(opera);
					}
					}__CLOVER_66_0.cloverRec.S[11078]++;break;
				}
				case DOLLARD:if (!__CLOVER_bool74) {__CLOVER_66_0.cloverRec.S[11079]++;__CLOVER_bool74=true;}
				{
					__CLOVER_66_0.cloverRec.S[11080]++;d = LT(1);
					__CLOVER_66_0.cloverRec.S[11081]++;d_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(d);
					__CLOVER_66_0.cloverRec.S[11082]++;astFactory.makeASTRoot(currentAST, d_AST);
					__CLOVER_66_0.cloverRec.S[11083]++;match(DOLLARD);
					__CLOVER_66_0.cloverRec.S[11084]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2347]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2347]==0&false))) {{
						__CLOVER_66_0.cloverRec.S[11085]++;op=Expr.Dollard;__CLOVER_66_0.cloverRec.S[11086]++;opera=remplitToken(d);
								__CLOVER_66_0.cloverRec.S[11087]++;v1.addElement(new Integer(op));__CLOVER_66_0.cloverRec.S[11088]++;v2.addElement(opera);
								__CLOVER_66_0.cloverRec.S[11089]++;ajoute_type(new TypeSimple(false,"POINTER",new Vector()));
					}
					}__CLOVER_66_0.cloverRec.S[11090]++;break;
				}
				default:if (!__CLOVER_bool74) {__CLOVER_66_0.cloverRec.S[11091]++;__CLOVER_bool74=true;}
				{
					__CLOVER_66_0.cloverRec.S[11092]++;break _loop259;
				}
				}
			} }while (true);
			}
			__CLOVER_66_0.cloverRec.S[11093]++;e1=expr26();
			__CLOVER_66_0.cloverRec.S[11094]++;astFactory.addASTChild(currentAST, returnAST);
			__CLOVER_66_0.cloverRec.S[11095]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2348]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2348]==0&false))) {{
				
						  assert((((v1.size()==v2.size())) && (++__CLOVER_66_0.cloverRec.CT[2349]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2349]==0&false));
				__CLOVER_66_0.cloverRec.S[11096]++;if((((op==0) && (++__CLOVER_66_0.cloverRec.CT[2350]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2350]==0&false)))
				{{
						      assert((((v1.size()==0)) && (++__CLOVER_66_0.cloverRec.CT[2351]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2351]==0&false));
				__CLOVER_66_0.cloverRec.S[11097]++;e=e1;//e.oper=opera;
				}
				}else
				{{
						      __CLOVER_66_0.cloverRec.S[11098]++;e=e1;
						      assert((((v1.size()>0)) && (++__CLOVER_66_0.cloverRec.CT[2352]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2352]==0&false));
						      assert((((e!=null)) && (++__CLOVER_66_0.cloverRec.CT[2353]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2353]==0&false)):"opera="+opera.text+";"+opera.x+","+opera.y+";"+opera.file;
						      __CLOVER_66_0.cloverRec.S[11099]++;for(i=v1.size()-1;(((i>=0) && (++__CLOVER_66_0.cloverRec.CT[2354]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2354]==0&false));i--)
						      {{
						         __CLOVER_66_0.cloverRec.S[11100]++;Integer integ;
							 __CLOVER_66_0.cloverRec.S[11101]++;integ=(Integer)v1.elementAt(i);
							 __CLOVER_66_0.cloverRec.S[11102]++;opera=(tinyeiffel.ast.Token)v2.elementAt(i);
				__CLOVER_66_0.cloverRec.S[11103]++;e=new Expr_Unaire(integ.intValue(),e,opera);
						      }
				}}
				
			}}
			}__CLOVER_66_0.cloverRec.S[11104]++;expr25_AST = (tinyeiffel.compiler.ASTDefaut)currentAST.root;
		}
		catch (RecognitionException ex) {
			__CLOVER_66_0.cloverRec.S[11105]++;if ((((inputState.guessing==0) && (++__CLOVER_66_0.cloverRec.CT[2355]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2355]==0&false))) {{
				
						__CLOVER_66_0.cloverRec.S[11106]++;logging.erreur(new ErreurSource("Erreur dans l'expression",ex.getLine(),
									ex.getColumn(),ex.getFilename()));
					
			} }else {{
				__CLOVER_66_0.cloverRec.S[11107]++;throw ex;
			}
		}}
		__CLOVER_66_0.cloverRec.S[11108]++;returnAST = expr25_AST;
		__CLOVER_66_0.cloverRec.S[11109]++;return e;
	}
	
	public final Expr  expr26() throws RecognitionException, TokenStreamException {__CLOVER_66_0.cloverRec.M[574]++;
		__CLOVER_66_0.cloverRec.S[11110]++;Expr e=null;
		
		__CLOVER_66_0.cloverRec.S[11111]++;returnAST = null;
		__CLOVER_66_0.cloverRec.S[11112]++;ASTPair currentAST = new ASTPair();
		__CLOVER_66_0.cloverRec.S[11113]++;tinyeiffel.compiler.ASTDefaut expr26_AST = null;
		__CLOVER_66_0.cloverRec.S[11114]++;Token  p = null;
		__CLOVER_66_0.cloverRec.S[11115]++;tinyeiffel.compiler.ASTDefaut p_AST = null;
		
		__CLOVER_66_0.cloverRec.S[11116]++;int op=0;
		__CLOVER_66_0.cloverRec.S[11117]++;Expr e1=null,e2=null;
		__CLOVER_66_0.cloverRec.S[11118]++;tinyeiffel.ast.Token opera=null;
		
		
		__CLOVER_66_0.cloverRec.S[11119]++;try {      // for error handling
			__CLOVER_66_0.cloverRec.S[11120]++;e1=expr27();
			__CLOVER_66_0.cloverRec.S[11121]++;astFactory.addASTChild(currentAST, returnAST);
			__CLOVER_66_0.cloverRec.S[11122]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2356]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2356]==0&false))) {{
				__CLOVER_66_0.cloverRec.S[11123]++;e=e1;
			}
			}{
			__CLOVER_66_0.cloverRec.S[11124]++;_loop262:
			do {{
				__CLOVER_66_0.cloverRec.S[11125]++;if (((((LA(1)==POINT)) && (++__CLOVER_66_0.cloverRec.CT[2357]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2357]==0&false))) {{
					__CLOVER_66_0.cloverRec.S[11126]++;p = LT(1);
					__CLOVER_66_0.cloverRec.S[11127]++;p_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(p);
					__CLOVER_66_0.cloverRec.S[11128]++;astFactory.makeASTRoot(currentAST, p_AST);
					__CLOVER_66_0.cloverRec.S[11129]++;match(POINT);
					__CLOVER_66_0.cloverRec.S[11130]++;e2=expr27();
					__CLOVER_66_0.cloverRec.S[11131]++;astFactory.addASTChild(currentAST, returnAST);
					__CLOVER_66_0.cloverRec.S[11132]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2358]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2358]==0&false))) {{
						
										/*e=new Expr(Expr.Point,e,e2);
										opera=remplitToken(p);
										e.oper=opera;*/
						__CLOVER_66_0.cloverRec.S[11133]++;e=new Expr_Binaire(Expr.Point,e,e2,remplitToken(p));
									
					}
				}}
				}else {{
					__CLOVER_66_0.cloverRec.S[11134]++;break _loop262;
				}
				
			}} }while (true);
			}
			__CLOVER_66_0.cloverRec.S[11135]++;expr26_AST = (tinyeiffel.compiler.ASTDefaut)currentAST.root;
		}
		catch (RecognitionException ex) {
			__CLOVER_66_0.cloverRec.S[11136]++;if ((((inputState.guessing==0) && (++__CLOVER_66_0.cloverRec.CT[2359]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2359]==0&false))) {{
				
						__CLOVER_66_0.cloverRec.S[11137]++;logging.erreur(new ErreurSource("Erreur dans l'expression",ex.getLine(),
									ex.getColumn(),ex.getFilename()));
					
			} }else {{
				__CLOVER_66_0.cloverRec.S[11138]++;throw ex;
			}
		}}
		__CLOVER_66_0.cloverRec.S[11139]++;returnAST = expr26_AST;
		__CLOVER_66_0.cloverRec.S[11140]++;return e;
	}
	
	public final Expr  expr27() throws RecognitionException, TokenStreamException {__CLOVER_66_0.cloverRec.M[575]++;
		__CLOVER_66_0.cloverRec.S[11141]++;Expr res=null;
		
		__CLOVER_66_0.cloverRec.S[11142]++;returnAST = null;
		__CLOVER_66_0.cloverRec.S[11143]++;ASTPair currentAST = new ASTPair();
		__CLOVER_66_0.cloverRec.S[11144]++;tinyeiffel.compiler.ASTDefaut expr27_AST = null;
		__CLOVER_66_0.cloverRec.S[11145]++;Token  n = null;
		__CLOVER_66_0.cloverRec.S[11146]++;tinyeiffel.compiler.ASTDefaut n_AST = null;
		__CLOVER_66_0.cloverRec.S[11147]++;Token  i = null;
		__CLOVER_66_0.cloverRec.S[11148]++;tinyeiffel.compiler.ASTDefaut i_AST = null;
		__CLOVER_66_0.cloverRec.S[11149]++;Token  r = null;
		__CLOVER_66_0.cloverRec.S[11150]++;tinyeiffel.compiler.ASTDefaut r_AST = null;
		__CLOVER_66_0.cloverRec.S[11151]++;Token  c = null;
		__CLOVER_66_0.cloverRec.S[11152]++;tinyeiffel.compiler.ASTDefaut c_AST = null;
		__CLOVER_66_0.cloverRec.S[11153]++;Token  d = null;
		__CLOVER_66_0.cloverRec.S[11154]++;tinyeiffel.compiler.ASTDefaut d_AST = null;
		__CLOVER_66_0.cloverRec.S[11155]++;Token  t = null;
		__CLOVER_66_0.cloverRec.S[11156]++;tinyeiffel.compiler.ASTDefaut t_AST = null;
		__CLOVER_66_0.cloverRec.S[11157]++;Token  f = null;
		__CLOVER_66_0.cloverRec.S[11158]++;tinyeiffel.compiler.ASTDefaut f_AST = null;
		
		__CLOVER_66_0.cloverRec.S[11159]++;Expr e=null,e1=null,e2=null;
		__CLOVER_66_0.cloverRec.S[11160]++;Vector param=null;
		__CLOVER_66_0.cloverRec.S[11161]++;Chaine str=null;
		__CLOVER_66_0.cloverRec.S[11162]++;tinyeiffel.ast.Token opera=null;
		
		
		__CLOVER_66_0.cloverRec.S[11163]++;try {      // for error handling
			__CLOVER_66_0.cloverRec.S[11164]++;boolean __CLOVER_bool75=false;switch ( LA(1)) {
			case ID:if (!__CLOVER_bool75) {__CLOVER_66_0.cloverRec.S[11165]++;__CLOVER_bool75=true;}
			{
				__CLOVER_66_0.cloverRec.S[11166]++;n = LT(1);
				__CLOVER_66_0.cloverRec.S[11167]++;n_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(n);
				__CLOVER_66_0.cloverRec.S[11168]++;astFactory.addASTChild(currentAST, n_AST);
				__CLOVER_66_0.cloverRec.S[11169]++;match(ID);
				{
				__CLOVER_66_0.cloverRec.S[11170]++;if (((((LA(1)==LPAREN) && (_tokenSet_19.member(LA(2))) && (_tokenSet_18.member(LA(3))) && (_tokenSet_17.member(LA(4)))) && (++__CLOVER_66_0.cloverRec.CT[2360]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2360]==0&false))) {{
					__CLOVER_66_0.cloverRec.S[11171]++;param=exec_param();
					__CLOVER_66_0.cloverRec.S[11172]++;astFactory.addASTChild(currentAST, returnAST);
				}
				}else {__CLOVER_66_0.cloverRec.S[11173]++;if (((((_tokenSet_20.member(LA(1))) && (_tokenSet_17.member(LA(2))) && (_tokenSet_21.member(LA(3))) && (_tokenSet_21.member(LA(4)))) && (++__CLOVER_66_0.cloverRec.CT[2361]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2361]==0&false))) {{
				}
				}else {{
					__CLOVER_66_0.cloverRec.S[11174]++;throw new NoViableAltException(LT(1), getFilename());
				}
				
				}}}
				__CLOVER_66_0.cloverRec.S[11175]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2362]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2362]==0&false))) {{
					
								__CLOVER_66_0.cloverRec.S[11176]++;if((((param!=null) && (++__CLOVER_66_0.cloverRec.CT[2363]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2363]==0&false)))
					{{// /*(LPARENT) =>*/
									//res=new Expr(n.getText(),param);
					__CLOVER_66_0.cloverRec.S[11177]++;res=new Expr_Appel(n.getText(),param,remplitToken(n));
					}
								}else
					{{
									//res=new Expr(n.getText());
					__CLOVER_66_0.cloverRec.S[11178]++;res=new Expr_Var(n.getText(),remplitToken(n));
					}
								//res.oper=remplitToken(n);
							
				}}
				}__CLOVER_66_0.cloverRec.S[11179]++;expr27_AST = (tinyeiffel.compiler.ASTDefaut)currentAST.root;
				__CLOVER_66_0.cloverRec.S[11180]++;break;
			}
			case INT:if (!__CLOVER_bool75) {__CLOVER_66_0.cloverRec.S[11181]++;__CLOVER_bool75=true;}
			{
				__CLOVER_66_0.cloverRec.S[11182]++;i = LT(1);
				__CLOVER_66_0.cloverRec.S[11183]++;i_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(i);
				__CLOVER_66_0.cloverRec.S[11184]++;astFactory.addASTChild(currentAST, i_AST);
				__CLOVER_66_0.cloverRec.S[11185]++;match(INT);
				__CLOVER_66_0.cloverRec.S[11186]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2364]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2364]==0&false))) {{
					
											/*res=new Expr(Expr.Entier);
											res.str=i.getText();
											res.oper=remplitToken(i);*/
					__CLOVER_66_0.cloverRec.S[11187]++;res=new Expr_Entier(i.getText(),remplitToken(i));
										
				}
				}__CLOVER_66_0.cloverRec.S[11188]++;expr27_AST = (tinyeiffel.compiler.ASTDefaut)currentAST.root;
				__CLOVER_66_0.cloverRec.S[11189]++;break;
			}
			case STRING:if (!__CLOVER_bool75) {__CLOVER_66_0.cloverRec.S[11190]++;__CLOVER_bool75=true;}
			case STRING2:if (!__CLOVER_bool75) {__CLOVER_66_0.cloverRec.S[11191]++;__CLOVER_bool75=true;}
			{
				__CLOVER_66_0.cloverRec.S[11192]++;str=string();
				__CLOVER_66_0.cloverRec.S[11193]++;astFactory.addASTChild(currentAST, returnAST);
				__CLOVER_66_0.cloverRec.S[11194]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2365]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2365]==0&false))) {{
					__CLOVER_66_0.cloverRec.S[11195]++;res=new Expr_Chaine(str);
				}
				}__CLOVER_66_0.cloverRec.S[11196]++;expr27_AST = (tinyeiffel.compiler.ASTDefaut)currentAST.root;
				__CLOVER_66_0.cloverRec.S[11197]++;break;
			}
			case REAL:if (!__CLOVER_bool75) {__CLOVER_66_0.cloverRec.S[11198]++;__CLOVER_bool75=true;}
			{
				__CLOVER_66_0.cloverRec.S[11199]++;r = LT(1);
				__CLOVER_66_0.cloverRec.S[11200]++;r_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(r);
				__CLOVER_66_0.cloverRec.S[11201]++;astFactory.addASTChild(currentAST, r_AST);
				__CLOVER_66_0.cloverRec.S[11202]++;match(REAL);
				__CLOVER_66_0.cloverRec.S[11203]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2366]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2366]==0&false))) {{
					
											/*res=new Expr(Expr.Reel);
											res.str=r.getText();
											res.oper=remplitToken(r);*/
					__CLOVER_66_0.cloverRec.S[11204]++;res=new Expr_Reel(r.getText(),remplitToken(r));
										
				}
				}__CLOVER_66_0.cloverRec.S[11205]++;expr27_AST = (tinyeiffel.compiler.ASTDefaut)currentAST.root;
				__CLOVER_66_0.cloverRec.S[11206]++;break;
			}
			case CHAR:if (!__CLOVER_bool75) {__CLOVER_66_0.cloverRec.S[11207]++;__CLOVER_bool75=true;}
			{
				__CLOVER_66_0.cloverRec.S[11208]++;c = LT(1);
				__CLOVER_66_0.cloverRec.S[11209]++;c_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(c);
				__CLOVER_66_0.cloverRec.S[11210]++;astFactory.addASTChild(currentAST, c_AST);
				__CLOVER_66_0.cloverRec.S[11211]++;match(CHAR);
				__CLOVER_66_0.cloverRec.S[11212]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2367]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2367]==0&false))) {{
					
											__CLOVER_66_0.cloverRec.S[11213]++;res=new Expr_Car(c.getText(),remplitToken(c));
											//res.str=c.getText();
											//res.oper=remplitToken(c);
					//assert(res.oper!=null);
										
				}
				}__CLOVER_66_0.cloverRec.S[11214]++;expr27_AST = (tinyeiffel.compiler.ASTDefaut)currentAST.root;
				__CLOVER_66_0.cloverRec.S[11215]++;break;
			}
			case LPAREN:if (!__CLOVER_bool75) {__CLOVER_66_0.cloverRec.S[11216]++;__CLOVER_bool75=true;}
			{
				__CLOVER_66_0.cloverRec.S[11217]++;tinyeiffel.compiler.ASTDefaut tmp93_AST = null;
				__CLOVER_66_0.cloverRec.S[11218]++;tmp93_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(LT(1));
				__CLOVER_66_0.cloverRec.S[11219]++;astFactory.addASTChild(currentAST, tmp93_AST);
				__CLOVER_66_0.cloverRec.S[11220]++;match(LPAREN);
				__CLOVER_66_0.cloverRec.S[11221]++;e=expr();
				__CLOVER_66_0.cloverRec.S[11222]++;astFactory.addASTChild(currentAST, returnAST);
				__CLOVER_66_0.cloverRec.S[11223]++;tinyeiffel.compiler.ASTDefaut tmp94_AST = null;
				__CLOVER_66_0.cloverRec.S[11224]++;tmp94_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(LT(1));
				__CLOVER_66_0.cloverRec.S[11225]++;astFactory.addASTChild(currentAST, tmp94_AST);
				__CLOVER_66_0.cloverRec.S[11226]++;match(RPAREN);
				__CLOVER_66_0.cloverRec.S[11227]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2368]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2368]==0&false))) {{
					__CLOVER_66_0.cloverRec.S[11228]++;res=e;
				}
				}__CLOVER_66_0.cloverRec.S[11229]++;expr27_AST = (tinyeiffel.compiler.ASTDefaut)currentAST.root;
				__CLOVER_66_0.cloverRec.S[11230]++;break;
			}
			case DEBUT_ARRAY:if (!__CLOVER_bool75) {__CLOVER_66_0.cloverRec.S[11231]++;__CLOVER_bool75=true;}
			{
				__CLOVER_66_0.cloverRec.S[11232]++;d = LT(1);
				__CLOVER_66_0.cloverRec.S[11233]++;d_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(d);
				__CLOVER_66_0.cloverRec.S[11234]++;astFactory.addASTChild(currentAST, d_AST);
				__CLOVER_66_0.cloverRec.S[11235]++;match(DEBUT_ARRAY);
				__CLOVER_66_0.cloverRec.S[11236]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2369]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2369]==0&false))) {{
					__CLOVER_66_0.cloverRec.S[11237]++;param=new Vector();
				}
				}{
				__CLOVER_66_0.cloverRec.S[11238]++;boolean __CLOVER_bool76=false;switch ( LA(1)) {
				case ID:if (!__CLOVER_bool76) {__CLOVER_66_0.cloverRec.S[11239]++;__CLOVER_bool76=true;}
				case STRING:if (!__CLOVER_bool76) {__CLOVER_66_0.cloverRec.S[11240]++;__CLOVER_bool76=true;}
				case LPAREN:if (!__CLOVER_bool76) {__CLOVER_66_0.cloverRec.S[11241]++;__CLOVER_bool76=true;}
				case INT:if (!__CLOVER_bool76) {__CLOVER_66_0.cloverRec.S[11242]++;__CLOVER_bool76=true;}
				case REAL:if (!__CLOVER_bool76) {__CLOVER_66_0.cloverRec.S[11243]++;__CLOVER_bool76=true;}
				case CHAR:if (!__CLOVER_bool76) {__CLOVER_66_0.cloverRec.S[11244]++;__CLOVER_bool76=true;}
				case PLUS:if (!__CLOVER_bool76) {__CLOVER_66_0.cloverRec.S[11245]++;__CLOVER_bool76=true;}
				case MOINS:if (!__CLOVER_bool76) {__CLOVER_66_0.cloverRec.S[11246]++;__CLOVER_bool76=true;}
				case FREEOP:if (!__CLOVER_bool76) {__CLOVER_66_0.cloverRec.S[11247]++;__CLOVER_bool76=true;}
				case OLD:if (!__CLOVER_bool76) {__CLOVER_66_0.cloverRec.S[11248]++;__CLOVER_bool76=true;}
				case NOT:if (!__CLOVER_bool76) {__CLOVER_66_0.cloverRec.S[11249]++;__CLOVER_bool76=true;}
				case DOLLARD:if (!__CLOVER_bool76) {__CLOVER_66_0.cloverRec.S[11250]++;__CLOVER_bool76=true;}
				case DEBUT_ARRAY:if (!__CLOVER_bool76) {__CLOVER_66_0.cloverRec.S[11251]++;__CLOVER_bool76=true;}
				case TRUE:if (!__CLOVER_bool76) {__CLOVER_66_0.cloverRec.S[11252]++;__CLOVER_bool76=true;}
				case FALSE:if (!__CLOVER_bool76) {__CLOVER_66_0.cloverRec.S[11253]++;__CLOVER_bool76=true;}
				case STRING2:if (!__CLOVER_bool76) {__CLOVER_66_0.cloverRec.S[11254]++;__CLOVER_bool76=true;}
				{
					__CLOVER_66_0.cloverRec.S[11255]++;e1=expr();
					__CLOVER_66_0.cloverRec.S[11256]++;astFactory.addASTChild(currentAST, returnAST);
					__CLOVER_66_0.cloverRec.S[11257]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2370]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2370]==0&false))) {{
						__CLOVER_66_0.cloverRec.S[11258]++;param.addElement(e1);
					}
					}{
					__CLOVER_66_0.cloverRec.S[11259]++;_loop270:
					do {{
						__CLOVER_66_0.cloverRec.S[11260]++;if (((((LA(1)==VIRGULE)) && (++__CLOVER_66_0.cloverRec.CT[2371]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2371]==0&false))) {{
							__CLOVER_66_0.cloverRec.S[11261]++;tinyeiffel.compiler.ASTDefaut tmp95_AST = null;
							__CLOVER_66_0.cloverRec.S[11262]++;tmp95_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(LT(1));
							__CLOVER_66_0.cloverRec.S[11263]++;astFactory.addASTChild(currentAST, tmp95_AST);
							__CLOVER_66_0.cloverRec.S[11264]++;match(VIRGULE);
							__CLOVER_66_0.cloverRec.S[11265]++;e2=expr();
							__CLOVER_66_0.cloverRec.S[11266]++;astFactory.addASTChild(currentAST, returnAST);
							__CLOVER_66_0.cloverRec.S[11267]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2372]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2372]==0&false))) {{
								__CLOVER_66_0.cloverRec.S[11268]++;param.addElement(e2);
							}
						}}
						}else {{
							__CLOVER_66_0.cloverRec.S[11269]++;break _loop270;
						}
						
					}} }while (true);
					}
					__CLOVER_66_0.cloverRec.S[11270]++;break;
				}
				case FIN_ARRAY:if (!__CLOVER_bool76) {__CLOVER_66_0.cloverRec.S[11271]++;__CLOVER_bool76=true;}
				{
					__CLOVER_66_0.cloverRec.S[11272]++;break;
				}
				default:if (!__CLOVER_bool76) {__CLOVER_66_0.cloverRec.S[11273]++;__CLOVER_bool76=true;}
				{
					__CLOVER_66_0.cloverRec.S[11274]++;throw new NoViableAltException(LT(1), getFilename());
				}
				}
				}
				__CLOVER_66_0.cloverRec.S[11275]++;tinyeiffel.compiler.ASTDefaut tmp96_AST = null;
				__CLOVER_66_0.cloverRec.S[11276]++;tmp96_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(LT(1));
				__CLOVER_66_0.cloverRec.S[11277]++;astFactory.addASTChild(currentAST, tmp96_AST);
				__CLOVER_66_0.cloverRec.S[11278]++;match(FIN_ARRAY);
				__CLOVER_66_0.cloverRec.S[11279]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2373]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2373]==0&false))) {{
					/*res=new Expr(Expr.Tableau);res.tableau=param;*/__CLOVER_66_0.cloverRec.S[11280]++;res=new Expr_Tableau(param,remplitToken(d));
				}
				}__CLOVER_66_0.cloverRec.S[11281]++;expr27_AST = (tinyeiffel.compiler.ASTDefaut)currentAST.root;
				__CLOVER_66_0.cloverRec.S[11282]++;break;
			}
			case TRUE:if (!__CLOVER_bool75) {__CLOVER_66_0.cloverRec.S[11283]++;__CLOVER_bool75=true;}
			{
				__CLOVER_66_0.cloverRec.S[11284]++;t = LT(1);
				__CLOVER_66_0.cloverRec.S[11285]++;t_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(t);
				__CLOVER_66_0.cloverRec.S[11286]++;astFactory.addASTChild(currentAST, t_AST);
				__CLOVER_66_0.cloverRec.S[11287]++;match(TRUE);
				__CLOVER_66_0.cloverRec.S[11288]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2374]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2374]==0&false))) {{
					/*res=new Expr(Expr.Vrai);res.oper=remplitToken(t);*/__CLOVER_66_0.cloverRec.S[11289]++;res=new Expr_Vrai(remplitToken(t));
				}
				}__CLOVER_66_0.cloverRec.S[11290]++;expr27_AST = (tinyeiffel.compiler.ASTDefaut)currentAST.root;
				__CLOVER_66_0.cloverRec.S[11291]++;break;
			}
			case FALSE:if (!__CLOVER_bool75) {__CLOVER_66_0.cloverRec.S[11292]++;__CLOVER_bool75=true;}
			{
				__CLOVER_66_0.cloverRec.S[11293]++;f = LT(1);
				__CLOVER_66_0.cloverRec.S[11294]++;f_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(f);
				__CLOVER_66_0.cloverRec.S[11295]++;astFactory.addASTChild(currentAST, f_AST);
				__CLOVER_66_0.cloverRec.S[11296]++;match(FALSE);
				__CLOVER_66_0.cloverRec.S[11297]++;if ( (((inputState.guessing==0 ) && (++__CLOVER_66_0.cloverRec.CT[2375]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2375]==0&false))) {{
					/*res=new Expr(Expr.Faux);res.oper=remplitToken(f);*/__CLOVER_66_0.cloverRec.S[11298]++;res=new Expr_Faux(remplitToken(f));
				}
				}__CLOVER_66_0.cloverRec.S[11299]++;expr27_AST = (tinyeiffel.compiler.ASTDefaut)currentAST.root;
				__CLOVER_66_0.cloverRec.S[11300]++;break;
			}
			default:if (!__CLOVER_bool75) {__CLOVER_66_0.cloverRec.S[11301]++;__CLOVER_bool75=true;}
			{
				__CLOVER_66_0.cloverRec.S[11302]++;throw new NoViableAltException(LT(1), getFilename());
			}
			}
		}
		catch (RecognitionException ex) {
			__CLOVER_66_0.cloverRec.S[11303]++;if ((((inputState.guessing==0) && (++__CLOVER_66_0.cloverRec.CT[2376]!=0|true)) || (++__CLOVER_66_0.cloverRec.CF[2376]==0&false))) {{
				
						__CLOVER_66_0.cloverRec.S[11304]++;logging.erreur(new ErreurSource("Erreur dans l'expression",ex.getLine(),
									ex.getColumn(),ex.getFilename()));
					
			} }else {{
				__CLOVER_66_0.cloverRec.S[11305]++;throw ex;
			}
		}}
		__CLOVER_66_0.cloverRec.S[11306]++;returnAST = expr27_AST;
		__CLOVER_66_0.cloverRec.S[11307]++;return res;
	}
	
	
	public static final String[] _tokenNames = {
		"<0>",
		"EOF",
		"<2>",
		"NULL_TREE_LOOKAHEAD",
		"\"expanded\"",
		"\"deferred\"",
		"\"class\"",
		"\"obsolete\"",
		"\"feature\"",
		"ACOLADEO",
		"VIRGULE",
		"ACOLADEF",
		"SEMI",
		"\"invariant\"",
		"\"end\"",
		"\"indexing\"",
		"ID",
		"DOUBLE_POINT",
		"STRING",
		"\"inherit\"",
		"\"rename\"",
		"\"as\"",
		"\"export\"",
		"\"all\"",
		"\"undefine\"",
		"\"redefine\"",
		"\"select\"",
		"\"creation\"",
		"\"infix\"",
		"\"prefix\"",
		"LPAREN",
		"RPAREN",
		"CROCHETO",
		"CROCHETF",
		"FLECHED",
		"\"like\"",
		"\"frozen\"",
		"\"is\"",
		"\"require\"",
		"\"else\"",
		"\"ensure\"",
		"\"then\"",
		"\"rescue\"",
		"\"unique\"",
		"\"local\"",
		"\"do\"",
		"\"once\"",
		"\"external\"",
		"\"alias\"",
		"POINT",
		"AFFECT",
		"TENTATIVE_AFFECT",
		"LPARENT",
		"RPARENT",
		"INT",
		"REAL",
		"CHAR",
		"\"from\"",
		"\"variant\"",
		"\"until\"",
		"\"loop\"",
		"\"if\"",
		"\"elseif\"",
		"EXCLAMATION",
		"\"retry\"",
		"\"inspect\"",
		"\"when\"",
		"\"check\"",
		"\"debug\"",
		"DEUX_POINT",
		"\"xor\"",
		"\"implies\"",
		"\"or\"",
		"\"and\"",
		"EGAL",
		"DIFF",
		"INFS",
		"INF",
		"SUPS",
		"SUP",
		"PLUS",
		"MOINS",
		"FOIS",
		"DIV",
		"DIV_ENTIER",
		"MOD",
		"PUISS",
		"FREEOP",
		"\"old\"",
		"\"not\"",
		"DOLLARD",
		"DEBUT_ARRAY",
		"FIN_ARRAY",
		"\"true\"",
		"\"false\"",
		"STRING2",
		"STRING3",
		"STRING4",
		"\"separate\"",
		"\"strip\"",
		"WS",
		"COMMENTAIRE",
		"DIGIT",
		"EXPOSANT"
	};
	
	protected void buildTokenTypeASTClassMap() {__CLOVER_66_0.cloverRec.M[576]++;
		__CLOVER_66_0.cloverRec.S[11308]++;tokenTypeToASTClassMap=null;
	};
	
	private static final long[] mk_tokenSet_0() {__CLOVER_66_0.cloverRec.M[577]++;
		__CLOVER_66_0.cloverRec.S[11309]++;long[] data = { 69524848640L, 0L};
		__CLOVER_66_0.cloverRec.S[11310]++;return data;
	}
	public static final BitSet _tokenSet_0 = new BitSet(mk_tokenSet_0());
	private static final long[] mk_tokenSet_1() {__CLOVER_66_0.cloverRec.M[578]++;
		__CLOVER_66_0.cloverRec.S[11311]++;long[] data = { 126100790640443392L, 4018339840L, 0L, 0L};
		__CLOVER_66_0.cloverRec.S[11312]++;return data;
	}
	public static final BitSet _tokenSet_1 = new BitSet(mk_tokenSet_1());
	private static final long[] mk_tokenSet_2() {__CLOVER_66_0.cloverRec.M[579]++;
		__CLOVER_66_0.cloverRec.S[11313]++;long[] data = { 991623149886197792L, 17179869120L, 0L, 0L};
		__CLOVER_66_0.cloverRec.S[11314]++;return data;
	}
	public static final BitSet _tokenSet_2 = new BitSet(mk_tokenSet_2());
	private static final long[] mk_tokenSet_3() {__CLOVER_66_0.cloverRec.M[580]++;
		__CLOVER_66_0.cloverRec.S[11315]++;long[] data = { -1165597151661165278L, 17179869151L, 0L, 0L};
		__CLOVER_66_0.cloverRec.S[11316]++;return data;
	}
	public static final BitSet _tokenSet_3 = new BitSet(mk_tokenSet_3());
	private static final long[] mk_tokenSet_4() {__CLOVER_66_0.cloverRec.M[581]++;
		__CLOVER_66_0.cloverRec.S[11317]++;long[] data = { -9016300558387406L, 17179869151L, 0L, 0L};
		__CLOVER_66_0.cloverRec.S[11318]++;return data;
	}
	public static final BitSet _tokenSet_4 = new BitSet(mk_tokenSet_4());
	private static final long[] mk_tokenSet_5() {__CLOVER_66_0.cloverRec.M[582]++;
		__CLOVER_66_0.cloverRec.S[11319]++;long[] data = { 991060199932776480L, 4018339840L, 0L, 0L};
		__CLOVER_66_0.cloverRec.S[11320]++;return data;
	}
	public static final BitSet _tokenSet_5 = new BitSet(mk_tokenSet_5());
	private static final long[] mk_tokenSet_6() {__CLOVER_66_0.cloverRec.M[583]++;
		__CLOVER_66_0.cloverRec.S[11321]++;long[] data = { -1165599352831905502L, 17179869151L, 0L, 0L};
		__CLOVER_66_0.cloverRec.S[11322]++;return data;
	}
	public static final BitSet _tokenSet_6 = new BitSet(mk_tokenSet_6());
	private static final long[] mk_tokenSet_7() {__CLOVER_66_0.cloverRec.M[584]++;
		__CLOVER_66_0.cloverRec.S[11323]++;long[] data = { -26037747790L, 17179869183L, 0L, 0L};
		__CLOVER_66_0.cloverRec.S[11324]++;return data;
	}
	public static final BitSet _tokenSet_7 = new BitSet(mk_tokenSet_7());
	private static final long[] mk_tokenSet_8() {__CLOVER_66_0.cloverRec.M[585]++;
		__CLOVER_66_0.cloverRec.S[11325]++;long[] data = { 2L, 0L};
		__CLOVER_66_0.cloverRec.S[11326]++;return data;
	}
	public static final BitSet _tokenSet_8 = new BitSet(mk_tokenSet_8());
	private static final long[] mk_tokenSet_9() {__CLOVER_66_0.cloverRec.M[586]++;
		__CLOVER_66_0.cloverRec.S[11327]++;long[] data = { -6642809450371153920L, 2147483675L, 0L, 0L};
		__CLOVER_66_0.cloverRec.S[11328]++;return data;
	}
	public static final BitSet _tokenSet_9 = new BitSet(mk_tokenSet_9());
	private static final long[] mk_tokenSet_10() {__CLOVER_66_0.cloverRec.M[587]++;
		__CLOVER_66_0.cloverRec.S[11329]++;long[] data = { -1164737405240643584L, 17179869151L, 0L, 0L};
		__CLOVER_66_0.cloverRec.S[11330]++;return data;
	}
	public static final BitSet _tokenSet_10 = new BitSet(mk_tokenSet_10());
	private static final long[] mk_tokenSet_11() {__CLOVER_66_0.cloverRec.M[588]++;
		__CLOVER_66_0.cloverRec.S[11331]++;long[] data = { -1163611505333800960L, 17179869151L, 0L, 0L};
		__CLOVER_66_0.cloverRec.S[11332]++;return data;
	}
	public static final BitSet _tokenSet_11 = new BitSet(mk_tokenSet_11());
	private static final long[] mk_tokenSet_12() {__CLOVER_66_0.cloverRec.M[589]++;
		__CLOVER_66_0.cloverRec.S[11333]++;long[] data = { 130604389194072064L, 2147483648L, 0L, 0L};
		__CLOVER_66_0.cloverRec.S[11334]++;return data;
	}
	public static final BitSet _tokenSet_12 = new BitSet(mk_tokenSet_12());
	private static final long[] mk_tokenSet_13() {__CLOVER_66_0.cloverRec.M[590]++;
		__CLOVER_66_0.cloverRec.S[11335]++;long[] data = { -1165863305147486208L, 16903241759L, 0L, 0L};
		__CLOVER_66_0.cloverRec.S[11336]++;return data;
	}
	public static final BitSet _tokenSet_13 = new BitSet(mk_tokenSet_13());
	private static final long[] mk_tokenSet_14() {__CLOVER_66_0.cloverRec.M[591]++;
		__CLOVER_66_0.cloverRec.S[11337]++;long[] data = { -1153476101116956400L, 17179869151L, 0L, 0L};
		__CLOVER_66_0.cloverRec.S[11338]++;return data;
	}
	public static final BitSet _tokenSet_14 = new BitSet(mk_tokenSet_14());
	private static final long[] mk_tokenSet_15() {__CLOVER_66_0.cloverRec.M[592]++;
		__CLOVER_66_0.cloverRec.S[11339]++;long[] data = { -554454776056046L, 17179869183L, 0L, 0L};
		__CLOVER_66_0.cloverRec.S[11340]++;return data;
	}
	public static final BitSet _tokenSet_15 = new BitSet(mk_tokenSet_15());
	private static final long[] mk_tokenSet_16() {__CLOVER_66_0.cloverRec.M[593]++;
		__CLOVER_66_0.cloverRec.S[11341]++;long[] data = { -3668267154178768L, 17179869183L, 0L, 0L};
		__CLOVER_66_0.cloverRec.S[11342]++;return data;
	}
	public static final BitSet _tokenSet_16 = new BitSet(mk_tokenSet_16());
	private static final long[] mk_tokenSet_17() {__CLOVER_66_0.cloverRec.M[594]++;
		__CLOVER_66_0.cloverRec.S[11343]++;long[] data = { -281492159234126L, 17179869183L, 0L, 0L};
		__CLOVER_66_0.cloverRec.S[11344]++;return data;
	}
	public static final BitSet _tokenSet_17 = new BitSet(mk_tokenSet_17());
	private static final long[] mk_tokenSet_18() {__CLOVER_66_0.cloverRec.M[595]++;
		__CLOVER_66_0.cloverRec.S[11345]++;long[] data = { -3668267154178766L, 17179869183L, 0L, 0L};
		__CLOVER_66_0.cloverRec.S[11346]++;return data;
	}
	public static final BitSet _tokenSet_18 = new BitSet(mk_tokenSet_18());
	private static final long[] mk_tokenSet_19() {__CLOVER_66_0.cloverRec.M[596]++;
		__CLOVER_66_0.cloverRec.S[11347]++;long[] data = { 126100792787927040L, 4018339840L, 0L, 0L};
		__CLOVER_66_0.cloverRec.S[11348]++;return data;
	}
	public static final BitSet _tokenSet_19 = new BitSet(mk_tokenSet_19());
	private static final long[] mk_tokenSet_20() {__CLOVER_66_0.cloverRec.M[597]++;
		__CLOVER_66_0.cloverRec.S[11349]++;long[] data = { -3668267154178766L, 4294967295L, 0L, 0L};
		__CLOVER_66_0.cloverRec.S[11350]++;return data;
	}
	public static final BitSet _tokenSet_20 = new BitSet(mk_tokenSet_20());
	private static final long[] mk_tokenSet_21() {__CLOVER_66_0.cloverRec.M[598]++;
		__CLOVER_66_0.cloverRec.S[11351]++;long[] data = { -17180426318L, 17179869183L, 0L, 0L};
		__CLOVER_66_0.cloverRec.S[11352]++;return data;
	}
	public static final BitSet _tokenSet_21 = new BitSet(mk_tokenSet_21());
	
	}
