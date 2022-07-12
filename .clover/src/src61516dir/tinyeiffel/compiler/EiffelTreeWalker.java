/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ */// $ANTLR 2.7.3: "eiffel.g" -> "EiffelTreeWalker.java"$

package tinyeiffel.compiler;

import java.io.*;
import java.util.*;
import tinyeiffel.ast.*;
import tinyeiffel.erreur.*;
import antlr.*;
//41231231

import antlr.TreeParser;
import antlr.Token;
import antlr.collections.AST;
import antlr.RecognitionException;
import antlr.ANTLRException;
import antlr.NoViableAltException;
import antlr.MismatchedTokenException;
import antlr.SemanticException;
import antlr.collections.impl.BitSet;
import antlr.ASTPair;
import antlr.collections.impl.ASTArray;


public class EiffelTreeWalker extends antlr.TreeParser       implements EiffelTokenTypes
 {static class __CLOVER_68_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}
public EiffelTreeWalker() {__CLOVER_68_0.cloverRec.M[599]++;
	__CLOVER_68_0.cloverRec.S[11353]++;tokenNames = _tokenNames;
}

	public final void programme(AST _t) throws RecognitionException {__CLOVER_68_0.cloverRec.M[600]++;
		
		__CLOVER_68_0.cloverRec.S[11354]++;ASTDefaut programme_AST_in = ((((_t == ASTNULL) ) && (++__CLOVER_68_0.cloverRec.CT[2377]!=0|true)) || (++__CLOVER_68_0.cloverRec.CF[2377]==0&false))? null : (ASTDefaut)_t;
		__CLOVER_68_0.cloverRec.S[11355]++;ASTDefaut n = null;
		
		__CLOVER_68_0.cloverRec.S[11356]++;try {      // for error handling
			__CLOVER_68_0.cloverRec.S[11357]++;AST __t364 = _t;
			__CLOVER_68_0.cloverRec.S[11358]++;ASTDefaut tmp1_AST_in = (ASTDefaut)_t;
			__CLOVER_68_0.cloverRec.S[11359]++;match(_t,CLASS);
			__CLOVER_68_0.cloverRec.S[11360]++;_t = _t.getFirstChild();
			{
			__CLOVER_68_0.cloverRec.S[11361]++;if ((((_t==null) && (++__CLOVER_68_0.cloverRec.CT[2378]!=0|true)) || (++__CLOVER_68_0.cloverRec.CF[2378]==0&false))) {__CLOVER_68_0.cloverRec.S[11362]++;_t=ASTNULL;
			}__CLOVER_68_0.cloverRec.S[11363]++;boolean __CLOVER_bool0=false;switch ( _t.getType()) {
			case INDEXING:if (!__CLOVER_bool0) {__CLOVER_68_0.cloverRec.S[11364]++;__CLOVER_bool0=true;}
			{
				__CLOVER_68_0.cloverRec.S[11365]++;index(_t);
				__CLOVER_68_0.cloverRec.S[11366]++;_t = _retTree;
				__CLOVER_68_0.cloverRec.S[11367]++;break;
			}
			case ID:if (!__CLOVER_bool0) {__CLOVER_68_0.cloverRec.S[11368]++;__CLOVER_bool0=true;}
			{
				__CLOVER_68_0.cloverRec.S[11369]++;break;
			}
			default:if (!__CLOVER_bool0) {__CLOVER_68_0.cloverRec.S[11370]++;__CLOVER_bool0=true;}
			{
				__CLOVER_68_0.cloverRec.S[11371]++;throw new NoViableAltException(_t);
			}
			}
			}
			__CLOVER_68_0.cloverRec.S[11372]++;n = (ASTDefaut)_t;
			__CLOVER_68_0.cloverRec.S[11373]++;match(_t,ID);
			__CLOVER_68_0.cloverRec.S[11374]++;_t = _t.getNextSibling();
			__CLOVER_68_0.cloverRec.S[11375]++;ASTDefaut tmp2_AST_in = (ASTDefaut)_t;
			__CLOVER_68_0.cloverRec.S[11376]++;match(_t,FEATURE);
			__CLOVER_68_0.cloverRec.S[11377]++;_t = _t.getNextSibling();
			__CLOVER_68_0.cloverRec.S[11378]++;_t = __t364;
			__CLOVER_68_0.cloverRec.S[11379]++;_t = _t.getNextSibling();
			
						__CLOVER_68_0.cloverRec.S[11380]++;System.out.println("Programme:");
						__CLOVER_68_0.cloverRec.S[11381]++;Classe c=new Classe(false,false,/*#n.getText()*/null,null,null,
									null,null,null,null,null);
						//#programme.ast=c;
					
		}
		catch (RecognitionException ex) {
			__CLOVER_68_0.cloverRec.S[11382]++;reportError(ex);
			__CLOVER_68_0.cloverRec.S[11383]++;if ((((_t!=null) && (++__CLOVER_68_0.cloverRec.CT[2379]!=0|true)) || (++__CLOVER_68_0.cloverRec.CF[2379]==0&false))) {{__CLOVER_68_0.cloverRec.S[11384]++;_t = _t.getNextSibling();}
		}}
		__CLOVER_68_0.cloverRec.S[11385]++;_retTree = _t;
	}
	
	public final void index(AST _t) throws RecognitionException {__CLOVER_68_0.cloverRec.M[601]++;
		
		__CLOVER_68_0.cloverRec.S[11386]++;ASTDefaut index_AST_in = ((((_t == ASTNULL) ) && (++__CLOVER_68_0.cloverRec.CT[2380]!=0|true)) || (++__CLOVER_68_0.cloverRec.CF[2380]==0&false))? null : (ASTDefaut)_t;
		
		__CLOVER_68_0.cloverRec.S[11387]++;try {      // for error handling
			__CLOVER_68_0.cloverRec.S[11388]++;AST __t367 = _t;
			__CLOVER_68_0.cloverRec.S[11389]++;ASTDefaut tmp3_AST_in = (ASTDefaut)_t;
			__CLOVER_68_0.cloverRec.S[11390]++;match(_t,INDEXING);
			__CLOVER_68_0.cloverRec.S[11391]++;_t = _t.getFirstChild();
			{
			__CLOVER_68_0.cloverRec.S[11392]++;int _cnt371=0;
			__CLOVER_68_0.cloverRec.S[11393]++;_loop371:
			do {{
				__CLOVER_68_0.cloverRec.S[11394]++;if ((((_t==null) && (++__CLOVER_68_0.cloverRec.CT[2381]!=0|true)) || (++__CLOVER_68_0.cloverRec.CF[2381]==0&false))) {__CLOVER_68_0.cloverRec.S[11395]++;_t=ASTNULL;
				}__CLOVER_68_0.cloverRec.S[11396]++;if (((((_t.getType()==ID)) && (++__CLOVER_68_0.cloverRec.CT[2382]!=0|true)) || (++__CLOVER_68_0.cloverRec.CF[2382]==0&false))) {{
					__CLOVER_68_0.cloverRec.S[11397]++;ASTDefaut tmp4_AST_in = (ASTDefaut)_t;
					__CLOVER_68_0.cloverRec.S[11398]++;match(_t,ID);
					__CLOVER_68_0.cloverRec.S[11399]++;_t = _t.getNextSibling();
					__CLOVER_68_0.cloverRec.S[11400]++;ASTDefaut tmp5_AST_in = (ASTDefaut)_t;
					__CLOVER_68_0.cloverRec.S[11401]++;match(_t,DOUBLE_POINT);
					__CLOVER_68_0.cloverRec.S[11402]++;_t = _t.getNextSibling();
					{
					__CLOVER_68_0.cloverRec.S[11403]++;int _cnt370=0;
					__CLOVER_68_0.cloverRec.S[11404]++;_loop370:
					do {{
						__CLOVER_68_0.cloverRec.S[11405]++;if ((((_t==null) && (++__CLOVER_68_0.cloverRec.CT[2383]!=0|true)) || (++__CLOVER_68_0.cloverRec.CF[2383]==0&false))) {__CLOVER_68_0.cloverRec.S[11406]++;_t=ASTNULL;
						}__CLOVER_68_0.cloverRec.S[11407]++;boolean __CLOVER_bool1=false;switch ( _t.getType()) {
						case ID:if (!__CLOVER_bool1) {__CLOVER_68_0.cloverRec.S[11408]++;__CLOVER_bool1=true;}
						{
							__CLOVER_68_0.cloverRec.S[11409]++;ASTDefaut tmp6_AST_in = (ASTDefaut)_t;
							__CLOVER_68_0.cloverRec.S[11410]++;match(_t,ID);
							__CLOVER_68_0.cloverRec.S[11411]++;_t = _t.getNextSibling();
							__CLOVER_68_0.cloverRec.S[11412]++;break;
						}
						case STRING:if (!__CLOVER_bool1) {__CLOVER_68_0.cloverRec.S[11413]++;__CLOVER_bool1=true;}
						{
							__CLOVER_68_0.cloverRec.S[11414]++;ASTDefaut tmp7_AST_in = (ASTDefaut)_t;
							__CLOVER_68_0.cloverRec.S[11415]++;match(_t,STRING);
							__CLOVER_68_0.cloverRec.S[11416]++;_t = _t.getNextSibling();
							__CLOVER_68_0.cloverRec.S[11417]++;break;
						}
						default:if (!__CLOVER_bool1) {__CLOVER_68_0.cloverRec.S[11418]++;__CLOVER_bool1=true;}
						{
							__CLOVER_68_0.cloverRec.S[11419]++;if ( (((_cnt370>=1 ) && (++__CLOVER_68_0.cloverRec.CT[2384]!=0|true)) || (++__CLOVER_68_0.cloverRec.CF[2384]==0&false))) {{ __CLOVER_68_0.cloverRec.S[11420]++;break _loop370; } }else {{__CLOVER_68_0.cloverRec.S[11421]++;throw new NoViableAltException(_t);}
						}}
						}
						__CLOVER_68_0.cloverRec.S[11422]++;_cnt370++;
					} }while (true);
					}
					__CLOVER_68_0.cloverRec.S[11423]++;ASTDefaut tmp8_AST_in = (ASTDefaut)_t;
					__CLOVER_68_0.cloverRec.S[11424]++;match(_t,SEMI);
					__CLOVER_68_0.cloverRec.S[11425]++;_t = _t.getNextSibling();
				}
				}else {{
					__CLOVER_68_0.cloverRec.S[11426]++;if ( (((_cnt371>=1 ) && (++__CLOVER_68_0.cloverRec.CT[2385]!=0|true)) || (++__CLOVER_68_0.cloverRec.CF[2385]==0&false))) {{ __CLOVER_68_0.cloverRec.S[11427]++;break _loop371; } }else {{__CLOVER_68_0.cloverRec.S[11428]++;throw new NoViableAltException(_t);}
				}}
				
				}__CLOVER_68_0.cloverRec.S[11429]++;_cnt371++;
			} }while (true);
			}
			__CLOVER_68_0.cloverRec.S[11430]++;_t = __t367;
			__CLOVER_68_0.cloverRec.S[11431]++;_t = _t.getNextSibling();
			
			
				
		}
		catch (RecognitionException ex) {
			__CLOVER_68_0.cloverRec.S[11432]++;reportError(ex);
			__CLOVER_68_0.cloverRec.S[11433]++;if ((((_t!=null) && (++__CLOVER_68_0.cloverRec.CT[2386]!=0|true)) || (++__CLOVER_68_0.cloverRec.CF[2386]==0&false))) {{__CLOVER_68_0.cloverRec.S[11434]++;_t = _t.getNextSibling();}
		}}
		__CLOVER_68_0.cloverRec.S[11435]++;_retTree = _t;
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
	
	}
	
