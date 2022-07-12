/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ */// $ANTLR 2.7.3: "eiffel.g" -> "EiffelLexer.java"$

package tinyeiffel.compiler;

import java.io.*;
import java.util.*;
import tinyeiffel.ast.*;
import tinyeiffel.erreur.*;
import antlr.*;
//41231231

import java.io.InputStream;
import antlr.TokenStreamException;
import antlr.TokenStreamIOException;
import antlr.TokenStreamRecognitionException;
import antlr.CharStreamException;
import antlr.CharStreamIOException;
import antlr.ANTLRException;
import java.io.Reader;
import java.util.Hashtable;
import antlr.CharScanner;
import antlr.InputBuffer;
import antlr.ByteBuffer;
import antlr.CharBuffer;
import antlr.Token;
import antlr.CommonToken;
import antlr.RecognitionException;
import antlr.NoViableAltForCharException;
import antlr.MismatchedCharException;
import antlr.TokenStream;
import antlr.ANTLRHashString;
import antlr.LexerSharedInputState;
import antlr.collections.impl.BitSet;
import antlr.SemanticException;

public class EiffelLexer extends antlr.CharScanner implements EiffelTokenTypes, TokenStream
 {static class __CLOVER_65_0{static com_cenqua_clover.l cloverRec;static{try{if(20050811161021793L!=com_cenqua_clover.CloverVersionInfo.getBuildMagic()){java.lang.System.err.println("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");java.lang.System.err.println("[CLOVER] WARNING: Instr=1.3.9#20050811161021793,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum() + "#"+com_cenqua_clover.CloverVersionInfo.getBuildMagic());}cloverRec = com_cenqua_clover.d.getRecorder(new char[] {69,58,92,112,114,111,106,101,116,92,101,105,102,102,101,108,92,46,99,108,111,118,101,114,92,99,111,118,101,114,97,103,101,46,100,98},1129378909078L);}catch (Throwable t) {java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+t.getClass()+":"+ t.getMessage()+")");}}}

	public Vector liste_commentaire=new Vector();
	public void ajoute_commentaire(String com,tinyeiffel.ast.Token token)
	{__CLOVER_65_0.cloverRec.M[479]++;
		__CLOVER_65_0.cloverRec.S[5865]++;liste_commentaire.addElement(new Commentaire(com,token));
	}

	public int donne_dernier()
	{__CLOVER_65_0.cloverRec.M[480]++;
		__CLOVER_65_0.cloverRec.S[5866]++;return liste_commentaire.size()-1;
	}
public EiffelLexer(InputStream in) {
	this(new ByteBuffer(in));__CLOVER_65_0.cloverRec.S[5867]++;__CLOVER_65_0.cloverRec.M[481]++;
}
public EiffelLexer(Reader in) {
	this(new CharBuffer(in));__CLOVER_65_0.cloverRec.S[5868]++;__CLOVER_65_0.cloverRec.M[482]++;
}
public EiffelLexer(InputBuffer ib) {
	this(new LexerSharedInputState(ib));__CLOVER_65_0.cloverRec.S[5869]++;__CLOVER_65_0.cloverRec.M[483]++;
}
public EiffelLexer(LexerSharedInputState state) {
	super(state);__CLOVER_65_0.cloverRec.S[5870]++;__CLOVER_65_0.cloverRec.M[484]++;
	__CLOVER_65_0.cloverRec.S[5871]++;caseSensitiveLiterals = true;
	__CLOVER_65_0.cloverRec.S[5872]++;setCaseSensitive(true);
	__CLOVER_65_0.cloverRec.S[5873]++;literals = new Hashtable();
	__CLOVER_65_0.cloverRec.S[5874]++;literals.put(new ANTLRHashString("local", this), new Integer(44));
	__CLOVER_65_0.cloverRec.S[5875]++;literals.put(new ANTLRHashString("frozen", this), new Integer(36));
	__CLOVER_65_0.cloverRec.S[5876]++;literals.put(new ANTLRHashString("undefine", this), new Integer(24));
	__CLOVER_65_0.cloverRec.S[5877]++;literals.put(new ANTLRHashString("obsolete", this), new Integer(7));
	__CLOVER_65_0.cloverRec.S[5878]++;literals.put(new ANTLRHashString("end", this), new Integer(14));
	__CLOVER_65_0.cloverRec.S[5879]++;literals.put(new ANTLRHashString("infix", this), new Integer(28));
	__CLOVER_65_0.cloverRec.S[5880]++;literals.put(new ANTLRHashString("check", this), new Integer(67));
	__CLOVER_65_0.cloverRec.S[5881]++;literals.put(new ANTLRHashString("creation", this), new Integer(27));
	__CLOVER_65_0.cloverRec.S[5882]++;literals.put(new ANTLRHashString("then", this), new Integer(41));
	__CLOVER_65_0.cloverRec.S[5883]++;literals.put(new ANTLRHashString("select", this), new Integer(26));
	__CLOVER_65_0.cloverRec.S[5884]++;literals.put(new ANTLRHashString("until", this), new Integer(59));
	__CLOVER_65_0.cloverRec.S[5885]++;literals.put(new ANTLRHashString("and", this), new Integer(73));
	__CLOVER_65_0.cloverRec.S[5886]++;literals.put(new ANTLRHashString("inspect", this), new Integer(65));
	__CLOVER_65_0.cloverRec.S[5887]++;literals.put(new ANTLRHashString("strip", this), new Integer(99));
	__CLOVER_65_0.cloverRec.S[5888]++;literals.put(new ANTLRHashString("not", this), new Integer(89));
	__CLOVER_65_0.cloverRec.S[5889]++;literals.put(new ANTLRHashString("separate", this), new Integer(98));
	__CLOVER_65_0.cloverRec.S[5890]++;literals.put(new ANTLRHashString("inherit", this), new Integer(19));
	__CLOVER_65_0.cloverRec.S[5891]++;literals.put(new ANTLRHashString("external", this), new Integer(47));
	__CLOVER_65_0.cloverRec.S[5892]++;literals.put(new ANTLRHashString("old", this), new Integer(88));
	__CLOVER_65_0.cloverRec.S[5893]++;literals.put(new ANTLRHashString("from", this), new Integer(57));
	__CLOVER_65_0.cloverRec.S[5894]++;literals.put(new ANTLRHashString("like", this), new Integer(35));
	__CLOVER_65_0.cloverRec.S[5895]++;literals.put(new ANTLRHashString("retry", this), new Integer(64));
	__CLOVER_65_0.cloverRec.S[5896]++;literals.put(new ANTLRHashString("when", this), new Integer(66));
	__CLOVER_65_0.cloverRec.S[5897]++;literals.put(new ANTLRHashString("class", this), new Integer(6));
	__CLOVER_65_0.cloverRec.S[5898]++;literals.put(new ANTLRHashString("do", this), new Integer(45));
	__CLOVER_65_0.cloverRec.S[5899]++;literals.put(new ANTLRHashString("redefine", this), new Integer(25));
	__CLOVER_65_0.cloverRec.S[5900]++;literals.put(new ANTLRHashString("prefix", this), new Integer(29));
	__CLOVER_65_0.cloverRec.S[5901]++;literals.put(new ANTLRHashString("elseif", this), new Integer(62));
	__CLOVER_65_0.cloverRec.S[5902]++;literals.put(new ANTLRHashString("is", this), new Integer(37));
	__CLOVER_65_0.cloverRec.S[5903]++;literals.put(new ANTLRHashString("implies", this), new Integer(71));
	__CLOVER_65_0.cloverRec.S[5904]++;literals.put(new ANTLRHashString("invariant", this), new Integer(13));
	__CLOVER_65_0.cloverRec.S[5905]++;literals.put(new ANTLRHashString("or", this), new Integer(72));
	__CLOVER_65_0.cloverRec.S[5906]++;literals.put(new ANTLRHashString("if", this), new Integer(61));
	__CLOVER_65_0.cloverRec.S[5907]++;literals.put(new ANTLRHashString("as", this), new Integer(21));
	__CLOVER_65_0.cloverRec.S[5908]++;literals.put(new ANTLRHashString("xor", this), new Integer(70));
	__CLOVER_65_0.cloverRec.S[5909]++;literals.put(new ANTLRHashString("all", this), new Integer(23));
	__CLOVER_65_0.cloverRec.S[5910]++;literals.put(new ANTLRHashString("require", this), new Integer(38));
	__CLOVER_65_0.cloverRec.S[5911]++;literals.put(new ANTLRHashString("once", this), new Integer(46));
	__CLOVER_65_0.cloverRec.S[5912]++;literals.put(new ANTLRHashString("variant", this), new Integer(58));
	__CLOVER_65_0.cloverRec.S[5913]++;literals.put(new ANTLRHashString("loop", this), new Integer(60));
	__CLOVER_65_0.cloverRec.S[5914]++;literals.put(new ANTLRHashString("alias", this), new Integer(48));
	__CLOVER_65_0.cloverRec.S[5915]++;literals.put(new ANTLRHashString("false", this), new Integer(94));
	__CLOVER_65_0.cloverRec.S[5916]++;literals.put(new ANTLRHashString("debug", this), new Integer(68));
	__CLOVER_65_0.cloverRec.S[5917]++;literals.put(new ANTLRHashString("feature", this), new Integer(8));
	__CLOVER_65_0.cloverRec.S[5918]++;literals.put(new ANTLRHashString("rescue", this), new Integer(42));
	__CLOVER_65_0.cloverRec.S[5919]++;literals.put(new ANTLRHashString("export", this), new Integer(22));
	__CLOVER_65_0.cloverRec.S[5920]++;literals.put(new ANTLRHashString("rename", this), new Integer(20));
	__CLOVER_65_0.cloverRec.S[5921]++;literals.put(new ANTLRHashString("else", this), new Integer(39));
	__CLOVER_65_0.cloverRec.S[5922]++;literals.put(new ANTLRHashString("expanded", this), new Integer(4));
	__CLOVER_65_0.cloverRec.S[5923]++;literals.put(new ANTLRHashString("indexing", this), new Integer(15));
	__CLOVER_65_0.cloverRec.S[5924]++;literals.put(new ANTLRHashString("ensure", this), new Integer(40));
	__CLOVER_65_0.cloverRec.S[5925]++;literals.put(new ANTLRHashString("true", this), new Integer(93));
	__CLOVER_65_0.cloverRec.S[5926]++;literals.put(new ANTLRHashString("unique", this), new Integer(43));
	__CLOVER_65_0.cloverRec.S[5927]++;literals.put(new ANTLRHashString("deferred", this), new Integer(5));
}

public Token nextToken() throws TokenStreamException {__CLOVER_65_0.cloverRec.M[485]++;
	__CLOVER_65_0.cloverRec.S[5928]++;Token theRetToken=null;
__CLOVER_65_0.cloverRec.S[5929]++;tryAgain:
	for (;;) {{
		__CLOVER_65_0.cloverRec.S[5930]++;Token _token = null;
		__CLOVER_65_0.cloverRec.S[5931]++;int _ttype = Token.INVALID_TYPE;
		__CLOVER_65_0.cloverRec.S[5932]++;resetText();
		__CLOVER_65_0.cloverRec.S[5933]++;try {   // for char stream error handling
			__CLOVER_65_0.cloverRec.S[5934]++;try {   // for lexical error handling
				__CLOVER_65_0.cloverRec.S[5935]++;boolean __CLOVER_bool0=false;switch ( LA(1)) {
				case '\t':if (!__CLOVER_bool0) {__CLOVER_65_0.cloverRec.S[5936]++;__CLOVER_bool0=true;}  case '\n':if (!__CLOVER_bool0) {__CLOVER_65_0.cloverRec.S[5937]++;__CLOVER_bool0=true;}  case '\r':if (!__CLOVER_bool0) {__CLOVER_65_0.cloverRec.S[5938]++;__CLOVER_bool0=true;}  case ' ':if (!__CLOVER_bool0) {__CLOVER_65_0.cloverRec.S[5939]++;__CLOVER_bool0=true;}
				{
					__CLOVER_65_0.cloverRec.S[5940]++;mWS(true);
					__CLOVER_65_0.cloverRec.S[5941]++;theRetToken=_returnToken;
					__CLOVER_65_0.cloverRec.S[5942]++;break;
				}
				case '(':if (!__CLOVER_bool0) {__CLOVER_65_0.cloverRec.S[5943]++;__CLOVER_bool0=true;}
				{
					__CLOVER_65_0.cloverRec.S[5944]++;mLPAREN(true);
					__CLOVER_65_0.cloverRec.S[5945]++;theRetToken=_returnToken;
					__CLOVER_65_0.cloverRec.S[5946]++;break;
				}
				case ')':if (!__CLOVER_bool0) {__CLOVER_65_0.cloverRec.S[5947]++;__CLOVER_bool0=true;}
				{
					__CLOVER_65_0.cloverRec.S[5948]++;mRPAREN(true);
					__CLOVER_65_0.cloverRec.S[5949]++;theRetToken=_returnToken;
					__CLOVER_65_0.cloverRec.S[5950]++;break;
				}
				case '[':if (!__CLOVER_bool0) {__CLOVER_65_0.cloverRec.S[5951]++;__CLOVER_bool0=true;}
				{
					__CLOVER_65_0.cloverRec.S[5952]++;mCROCHETO(true);
					__CLOVER_65_0.cloverRec.S[5953]++;theRetToken=_returnToken;
					__CLOVER_65_0.cloverRec.S[5954]++;break;
				}
				case ']':if (!__CLOVER_bool0) {__CLOVER_65_0.cloverRec.S[5955]++;__CLOVER_bool0=true;}
				{
					__CLOVER_65_0.cloverRec.S[5956]++;mCROCHETF(true);
					__CLOVER_65_0.cloverRec.S[5957]++;theRetToken=_returnToken;
					__CLOVER_65_0.cloverRec.S[5958]++;break;
				}
				case '+':if (!__CLOVER_bool0) {__CLOVER_65_0.cloverRec.S[5959]++;__CLOVER_bool0=true;}
				{
					__CLOVER_65_0.cloverRec.S[5960]++;mPLUS(true);
					__CLOVER_65_0.cloverRec.S[5961]++;theRetToken=_returnToken;
					__CLOVER_65_0.cloverRec.S[5962]++;break;
				}
				case '*':if (!__CLOVER_bool0) {__CLOVER_65_0.cloverRec.S[5963]++;__CLOVER_bool0=true;}
				{
					__CLOVER_65_0.cloverRec.S[5964]++;mFOIS(true);
					__CLOVER_65_0.cloverRec.S[5965]++;theRetToken=_returnToken;
					__CLOVER_65_0.cloverRec.S[5966]++;break;
				}
				case '\\':if (!__CLOVER_bool0) {__CLOVER_65_0.cloverRec.S[5967]++;__CLOVER_bool0=true;}
				{
					__CLOVER_65_0.cloverRec.S[5968]++;mMOD(true);
					__CLOVER_65_0.cloverRec.S[5969]++;theRetToken=_returnToken;
					__CLOVER_65_0.cloverRec.S[5970]++;break;
				}
				case '=':if (!__CLOVER_bool0) {__CLOVER_65_0.cloverRec.S[5971]++;__CLOVER_bool0=true;}
				{
					__CLOVER_65_0.cloverRec.S[5972]++;mEGAL(true);
					__CLOVER_65_0.cloverRec.S[5973]++;theRetToken=_returnToken;
					__CLOVER_65_0.cloverRec.S[5974]++;break;
				}
				case ';':if (!__CLOVER_bool0) {__CLOVER_65_0.cloverRec.S[5975]++;__CLOVER_bool0=true;}
				{
					__CLOVER_65_0.cloverRec.S[5976]++;mSEMI(true);
					__CLOVER_65_0.cloverRec.S[5977]++;theRetToken=_returnToken;
					__CLOVER_65_0.cloverRec.S[5978]++;break;
				}
				case ',':if (!__CLOVER_bool0) {__CLOVER_65_0.cloverRec.S[5979]++;__CLOVER_bool0=true;}
				{
					__CLOVER_65_0.cloverRec.S[5980]++;mVIRGULE(true);
					__CLOVER_65_0.cloverRec.S[5981]++;theRetToken=_returnToken;
					__CLOVER_65_0.cloverRec.S[5982]++;break;
				}
				case '?':if (!__CLOVER_bool0) {__CLOVER_65_0.cloverRec.S[5983]++;__CLOVER_bool0=true;}
				{
					__CLOVER_65_0.cloverRec.S[5984]++;mTENTATIVE_AFFECT(true);
					__CLOVER_65_0.cloverRec.S[5985]++;theRetToken=_returnToken;
					__CLOVER_65_0.cloverRec.S[5986]++;break;
				}
				case '^':if (!__CLOVER_bool0) {__CLOVER_65_0.cloverRec.S[5987]++;__CLOVER_bool0=true;}
				{
					__CLOVER_65_0.cloverRec.S[5988]++;mPUISS(true);
					__CLOVER_65_0.cloverRec.S[5989]++;theRetToken=_returnToken;
					__CLOVER_65_0.cloverRec.S[5990]++;break;
				}
				case '!':if (!__CLOVER_bool0) {__CLOVER_65_0.cloverRec.S[5991]++;__CLOVER_bool0=true;}
				{
					__CLOVER_65_0.cloverRec.S[5992]++;mEXCLAMATION(true);
					__CLOVER_65_0.cloverRec.S[5993]++;theRetToken=_returnToken;
					__CLOVER_65_0.cloverRec.S[5994]++;break;
				}
				case '{':if (!__CLOVER_bool0) {__CLOVER_65_0.cloverRec.S[5995]++;__CLOVER_bool0=true;}
				{
					__CLOVER_65_0.cloverRec.S[5996]++;mACOLADEO(true);
					__CLOVER_65_0.cloverRec.S[5997]++;theRetToken=_returnToken;
					__CLOVER_65_0.cloverRec.S[5998]++;break;
				}
				case '}':if (!__CLOVER_bool0) {__CLOVER_65_0.cloverRec.S[5999]++;__CLOVER_bool0=true;}
				{
					__CLOVER_65_0.cloverRec.S[6000]++;mACOLADEF(true);
					__CLOVER_65_0.cloverRec.S[6001]++;theRetToken=_returnToken;
					__CLOVER_65_0.cloverRec.S[6002]++;break;
				}
				case '$':if (!__CLOVER_bool0) {__CLOVER_65_0.cloverRec.S[6003]++;__CLOVER_bool0=true;}
				{
					__CLOVER_65_0.cloverRec.S[6004]++;mDOLLARD(true);
					__CLOVER_65_0.cloverRec.S[6005]++;theRetToken=_returnToken;
					__CLOVER_65_0.cloverRec.S[6006]++;break;
				}
				case '0':if (!__CLOVER_bool0) {__CLOVER_65_0.cloverRec.S[6007]++;__CLOVER_bool0=true;}  case '1':if (!__CLOVER_bool0) {__CLOVER_65_0.cloverRec.S[6008]++;__CLOVER_bool0=true;}  case '2':if (!__CLOVER_bool0) {__CLOVER_65_0.cloverRec.S[6009]++;__CLOVER_bool0=true;}  case '3':if (!__CLOVER_bool0) {__CLOVER_65_0.cloverRec.S[6010]++;__CLOVER_bool0=true;}
				case '4':if (!__CLOVER_bool0) {__CLOVER_65_0.cloverRec.S[6011]++;__CLOVER_bool0=true;}  case '5':if (!__CLOVER_bool0) {__CLOVER_65_0.cloverRec.S[6012]++;__CLOVER_bool0=true;}  case '6':if (!__CLOVER_bool0) {__CLOVER_65_0.cloverRec.S[6013]++;__CLOVER_bool0=true;}  case '7':if (!__CLOVER_bool0) {__CLOVER_65_0.cloverRec.S[6014]++;__CLOVER_bool0=true;}
				case '8':if (!__CLOVER_bool0) {__CLOVER_65_0.cloverRec.S[6015]++;__CLOVER_bool0=true;}  case '9':if (!__CLOVER_bool0) {__CLOVER_65_0.cloverRec.S[6016]++;__CLOVER_bool0=true;}
				{
					__CLOVER_65_0.cloverRec.S[6017]++;mINT(true);
					__CLOVER_65_0.cloverRec.S[6018]++;theRetToken=_returnToken;
					__CLOVER_65_0.cloverRec.S[6019]++;break;
				}
				case 'A':if (!__CLOVER_bool0) {__CLOVER_65_0.cloverRec.S[6020]++;__CLOVER_bool0=true;}  case 'B':if (!__CLOVER_bool0) {__CLOVER_65_0.cloverRec.S[6021]++;__CLOVER_bool0=true;}  case 'C':if (!__CLOVER_bool0) {__CLOVER_65_0.cloverRec.S[6022]++;__CLOVER_bool0=true;}  case 'D':if (!__CLOVER_bool0) {__CLOVER_65_0.cloverRec.S[6023]++;__CLOVER_bool0=true;}
				case 'E':if (!__CLOVER_bool0) {__CLOVER_65_0.cloverRec.S[6024]++;__CLOVER_bool0=true;}  case 'F':if (!__CLOVER_bool0) {__CLOVER_65_0.cloverRec.S[6025]++;__CLOVER_bool0=true;}  case 'G':if (!__CLOVER_bool0) {__CLOVER_65_0.cloverRec.S[6026]++;__CLOVER_bool0=true;}  case 'H':if (!__CLOVER_bool0) {__CLOVER_65_0.cloverRec.S[6027]++;__CLOVER_bool0=true;}
				case 'I':if (!__CLOVER_bool0) {__CLOVER_65_0.cloverRec.S[6028]++;__CLOVER_bool0=true;}  case 'J':if (!__CLOVER_bool0) {__CLOVER_65_0.cloverRec.S[6029]++;__CLOVER_bool0=true;}  case 'K':if (!__CLOVER_bool0) {__CLOVER_65_0.cloverRec.S[6030]++;__CLOVER_bool0=true;}  case 'L':if (!__CLOVER_bool0) {__CLOVER_65_0.cloverRec.S[6031]++;__CLOVER_bool0=true;}
				case 'M':if (!__CLOVER_bool0) {__CLOVER_65_0.cloverRec.S[6032]++;__CLOVER_bool0=true;}  case 'N':if (!__CLOVER_bool0) {__CLOVER_65_0.cloverRec.S[6033]++;__CLOVER_bool0=true;}  case 'O':if (!__CLOVER_bool0) {__CLOVER_65_0.cloverRec.S[6034]++;__CLOVER_bool0=true;}  case 'P':if (!__CLOVER_bool0) {__CLOVER_65_0.cloverRec.S[6035]++;__CLOVER_bool0=true;}
				case 'Q':if (!__CLOVER_bool0) {__CLOVER_65_0.cloverRec.S[6036]++;__CLOVER_bool0=true;}  case 'R':if (!__CLOVER_bool0) {__CLOVER_65_0.cloverRec.S[6037]++;__CLOVER_bool0=true;}  case 'S':if (!__CLOVER_bool0) {__CLOVER_65_0.cloverRec.S[6038]++;__CLOVER_bool0=true;}  case 'T':if (!__CLOVER_bool0) {__CLOVER_65_0.cloverRec.S[6039]++;__CLOVER_bool0=true;}
				case 'U':if (!__CLOVER_bool0) {__CLOVER_65_0.cloverRec.S[6040]++;__CLOVER_bool0=true;}  case 'V':if (!__CLOVER_bool0) {__CLOVER_65_0.cloverRec.S[6041]++;__CLOVER_bool0=true;}  case 'W':if (!__CLOVER_bool0) {__CLOVER_65_0.cloverRec.S[6042]++;__CLOVER_bool0=true;}  case 'X':if (!__CLOVER_bool0) {__CLOVER_65_0.cloverRec.S[6043]++;__CLOVER_bool0=true;}
				case 'Y':if (!__CLOVER_bool0) {__CLOVER_65_0.cloverRec.S[6044]++;__CLOVER_bool0=true;}  case 'Z':if (!__CLOVER_bool0) {__CLOVER_65_0.cloverRec.S[6045]++;__CLOVER_bool0=true;}  case '_':if (!__CLOVER_bool0) {__CLOVER_65_0.cloverRec.S[6046]++;__CLOVER_bool0=true;}  case 'a':if (!__CLOVER_bool0) {__CLOVER_65_0.cloverRec.S[6047]++;__CLOVER_bool0=true;}
				case 'b':if (!__CLOVER_bool0) {__CLOVER_65_0.cloverRec.S[6048]++;__CLOVER_bool0=true;}  case 'c':if (!__CLOVER_bool0) {__CLOVER_65_0.cloverRec.S[6049]++;__CLOVER_bool0=true;}  case 'd':if (!__CLOVER_bool0) {__CLOVER_65_0.cloverRec.S[6050]++;__CLOVER_bool0=true;}  case 'e':if (!__CLOVER_bool0) {__CLOVER_65_0.cloverRec.S[6051]++;__CLOVER_bool0=true;}
				case 'f':if (!__CLOVER_bool0) {__CLOVER_65_0.cloverRec.S[6052]++;__CLOVER_bool0=true;}  case 'g':if (!__CLOVER_bool0) {__CLOVER_65_0.cloverRec.S[6053]++;__CLOVER_bool0=true;}  case 'h':if (!__CLOVER_bool0) {__CLOVER_65_0.cloverRec.S[6054]++;__CLOVER_bool0=true;}  case 'i':if (!__CLOVER_bool0) {__CLOVER_65_0.cloverRec.S[6055]++;__CLOVER_bool0=true;}
				case 'j':if (!__CLOVER_bool0) {__CLOVER_65_0.cloverRec.S[6056]++;__CLOVER_bool0=true;}  case 'k':if (!__CLOVER_bool0) {__CLOVER_65_0.cloverRec.S[6057]++;__CLOVER_bool0=true;}  case 'l':if (!__CLOVER_bool0) {__CLOVER_65_0.cloverRec.S[6058]++;__CLOVER_bool0=true;}  case 'm':if (!__CLOVER_bool0) {__CLOVER_65_0.cloverRec.S[6059]++;__CLOVER_bool0=true;}
				case 'n':if (!__CLOVER_bool0) {__CLOVER_65_0.cloverRec.S[6060]++;__CLOVER_bool0=true;}  case 'o':if (!__CLOVER_bool0) {__CLOVER_65_0.cloverRec.S[6061]++;__CLOVER_bool0=true;}  case 'p':if (!__CLOVER_bool0) {__CLOVER_65_0.cloverRec.S[6062]++;__CLOVER_bool0=true;}  case 'q':if (!__CLOVER_bool0) {__CLOVER_65_0.cloverRec.S[6063]++;__CLOVER_bool0=true;}
				case 'r':if (!__CLOVER_bool0) {__CLOVER_65_0.cloverRec.S[6064]++;__CLOVER_bool0=true;}  case 's':if (!__CLOVER_bool0) {__CLOVER_65_0.cloverRec.S[6065]++;__CLOVER_bool0=true;}  case 't':if (!__CLOVER_bool0) {__CLOVER_65_0.cloverRec.S[6066]++;__CLOVER_bool0=true;}  case 'u':if (!__CLOVER_bool0) {__CLOVER_65_0.cloverRec.S[6067]++;__CLOVER_bool0=true;}
				case 'v':if (!__CLOVER_bool0) {__CLOVER_65_0.cloverRec.S[6068]++;__CLOVER_bool0=true;}  case 'w':if (!__CLOVER_bool0) {__CLOVER_65_0.cloverRec.S[6069]++;__CLOVER_bool0=true;}  case 'x':if (!__CLOVER_bool0) {__CLOVER_65_0.cloverRec.S[6070]++;__CLOVER_bool0=true;}  case 'y':if (!__CLOVER_bool0) {__CLOVER_65_0.cloverRec.S[6071]++;__CLOVER_bool0=true;}
				case 'z':if (!__CLOVER_bool0) {__CLOVER_65_0.cloverRec.S[6072]++;__CLOVER_bool0=true;}
				{
					__CLOVER_65_0.cloverRec.S[6073]++;mID(true);
					__CLOVER_65_0.cloverRec.S[6074]++;theRetToken=_returnToken;
					__CLOVER_65_0.cloverRec.S[6075]++;break;
				}
				case '"':if (!__CLOVER_bool0) {__CLOVER_65_0.cloverRec.S[6076]++;__CLOVER_bool0=true;}  case '%':if (!__CLOVER_bool0) {__CLOVER_65_0.cloverRec.S[6077]++;__CLOVER_bool0=true;}
				{
					__CLOVER_65_0.cloverRec.S[6078]++;mSTRING(true);
					__CLOVER_65_0.cloverRec.S[6079]++;theRetToken=_returnToken;
					__CLOVER_65_0.cloverRec.S[6080]++;break;
				}
				case '\'':if (!__CLOVER_bool0) {__CLOVER_65_0.cloverRec.S[6081]++;__CLOVER_bool0=true;}
				{
					__CLOVER_65_0.cloverRec.S[6082]++;mCHAR(true);
					__CLOVER_65_0.cloverRec.S[6083]++;theRetToken=_returnToken;
					__CLOVER_65_0.cloverRec.S[6084]++;break;
				}
				case '#':if (!__CLOVER_bool0) {__CLOVER_65_0.cloverRec.S[6085]++;__CLOVER_bool0=true;}  case '&':if (!__CLOVER_bool0) {__CLOVER_65_0.cloverRec.S[6086]++;__CLOVER_bool0=true;}  case '@':if (!__CLOVER_bool0) {__CLOVER_65_0.cloverRec.S[6087]++;__CLOVER_bool0=true;}  case '|':if (!__CLOVER_bool0) {__CLOVER_65_0.cloverRec.S[6088]++;__CLOVER_bool0=true;}
				{
					__CLOVER_65_0.cloverRec.S[6089]++;mFREEOP(true);
					__CLOVER_65_0.cloverRec.S[6090]++;theRetToken=_returnToken;
					__CLOVER_65_0.cloverRec.S[6091]++;break;
				}
				default:if (!__CLOVER_bool0) {__CLOVER_65_0.cloverRec.S[6092]++;__CLOVER_bool0=true;}
					__CLOVER_65_0.cloverRec.S[6093]++;if (((((LA(1)=='-') && (LA(2)=='-')) && (++__CLOVER_65_0.cloverRec.CT[1903]!=0|true)) || (++__CLOVER_65_0.cloverRec.CF[1903]==0&false))) {{
						__CLOVER_65_0.cloverRec.S[6094]++;mCOMMENTAIRE(true);
						__CLOVER_65_0.cloverRec.S[6095]++;theRetToken=_returnToken;
					}
					}else {__CLOVER_65_0.cloverRec.S[6096]++;if (((((LA(1)=='-') && (LA(2)=='>')) && (++__CLOVER_65_0.cloverRec.CT[1904]!=0|true)) || (++__CLOVER_65_0.cloverRec.CF[1904]==0&false))) {{
						__CLOVER_65_0.cloverRec.S[6097]++;mFLECHED(true);
						__CLOVER_65_0.cloverRec.S[6098]++;theRetToken=_returnToken;
					}
					}else {__CLOVER_65_0.cloverRec.S[6099]++;if (((((LA(1)=='.') && (LA(2)=='.')) && (++__CLOVER_65_0.cloverRec.CT[1905]!=0|true)) || (++__CLOVER_65_0.cloverRec.CF[1905]==0&false))) {{
						__CLOVER_65_0.cloverRec.S[6100]++;mDEUX_POINT(true);
						__CLOVER_65_0.cloverRec.S[6101]++;theRetToken=_returnToken;
					}
					}else {__CLOVER_65_0.cloverRec.S[6102]++;if (((((LA(1)=='/') && (LA(2)=='=')) && (++__CLOVER_65_0.cloverRec.CT[1906]!=0|true)) || (++__CLOVER_65_0.cloverRec.CF[1906]==0&false))) {{
						__CLOVER_65_0.cloverRec.S[6103]++;mDIFF(true);
						__CLOVER_65_0.cloverRec.S[6104]++;theRetToken=_returnToken;
					}
					}else {__CLOVER_65_0.cloverRec.S[6105]++;if (((((LA(1)=='/') && (LA(2)=='/')) && (++__CLOVER_65_0.cloverRec.CT[1907]!=0|true)) || (++__CLOVER_65_0.cloverRec.CF[1907]==0&false))) {{
						__CLOVER_65_0.cloverRec.S[6106]++;mDIV_ENTIER(true);
						__CLOVER_65_0.cloverRec.S[6107]++;theRetToken=_returnToken;
					}
					}else {__CLOVER_65_0.cloverRec.S[6108]++;if (((((LA(1)=='<') && (LA(2)=='<')) && (++__CLOVER_65_0.cloverRec.CT[1908]!=0|true)) || (++__CLOVER_65_0.cloverRec.CF[1908]==0&false))) {{
						__CLOVER_65_0.cloverRec.S[6109]++;mDEBUT_ARRAY(true);
						__CLOVER_65_0.cloverRec.S[6110]++;theRetToken=_returnToken;
					}
					}else {__CLOVER_65_0.cloverRec.S[6111]++;if (((((LA(1)=='>') && (LA(2)=='>')) && (++__CLOVER_65_0.cloverRec.CT[1909]!=0|true)) || (++__CLOVER_65_0.cloverRec.CF[1909]==0&false))) {{
						__CLOVER_65_0.cloverRec.S[6112]++;mFIN_ARRAY(true);
						__CLOVER_65_0.cloverRec.S[6113]++;theRetToken=_returnToken;
					}
					}else {__CLOVER_65_0.cloverRec.S[6114]++;if (((((LA(1)=='<') && (LA(2)=='=')) && (++__CLOVER_65_0.cloverRec.CT[1910]!=0|true)) || (++__CLOVER_65_0.cloverRec.CF[1910]==0&false))) {{
						__CLOVER_65_0.cloverRec.S[6115]++;mINF(true);
						__CLOVER_65_0.cloverRec.S[6116]++;theRetToken=_returnToken;
					}
					}else {__CLOVER_65_0.cloverRec.S[6117]++;if (((((LA(1)=='>') && (LA(2)=='=')) && (++__CLOVER_65_0.cloverRec.CT[1911]!=0|true)) || (++__CLOVER_65_0.cloverRec.CF[1911]==0&false))) {{
						__CLOVER_65_0.cloverRec.S[6118]++;mSUP(true);
						__CLOVER_65_0.cloverRec.S[6119]++;theRetToken=_returnToken;
					}
					}else {__CLOVER_65_0.cloverRec.S[6120]++;if (((((LA(1)==':') && (LA(2)=='=')) && (++__CLOVER_65_0.cloverRec.CT[1912]!=0|true)) || (++__CLOVER_65_0.cloverRec.CF[1912]==0&false))) {{
						__CLOVER_65_0.cloverRec.S[6121]++;mAFFECT(true);
						__CLOVER_65_0.cloverRec.S[6122]++;theRetToken=_returnToken;
					}
					}else {__CLOVER_65_0.cloverRec.S[6123]++;if ((((((LA(1)=='.') && ((LA(2) >= '0' && LA(2) <= '9')))&&(LA(2)!='.')) && (++__CLOVER_65_0.cloverRec.CT[1913]!=0|true)) || (++__CLOVER_65_0.cloverRec.CF[1913]==0&false))) {{
						__CLOVER_65_0.cloverRec.S[6124]++;mREAL(true);
						__CLOVER_65_0.cloverRec.S[6125]++;theRetToken=_returnToken;
					}
					}else {__CLOVER_65_0.cloverRec.S[6126]++;if (((((LA(1)=='-') && (true)) && (++__CLOVER_65_0.cloverRec.CT[1914]!=0|true)) || (++__CLOVER_65_0.cloverRec.CF[1914]==0&false))) {{
						__CLOVER_65_0.cloverRec.S[6127]++;mMOINS(true);
						__CLOVER_65_0.cloverRec.S[6128]++;theRetToken=_returnToken;
					}
					}else {__CLOVER_65_0.cloverRec.S[6129]++;if (((((LA(1)=='/') && (true)) && (++__CLOVER_65_0.cloverRec.CT[1915]!=0|true)) || (++__CLOVER_65_0.cloverRec.CF[1915]==0&false))) {{
						__CLOVER_65_0.cloverRec.S[6130]++;mDIV(true);
						__CLOVER_65_0.cloverRec.S[6131]++;theRetToken=_returnToken;
					}
					}else {__CLOVER_65_0.cloverRec.S[6132]++;if (((((LA(1)=='<') && (true)) && (++__CLOVER_65_0.cloverRec.CT[1916]!=0|true)) || (++__CLOVER_65_0.cloverRec.CF[1916]==0&false))) {{
						__CLOVER_65_0.cloverRec.S[6133]++;mINFS(true);
						__CLOVER_65_0.cloverRec.S[6134]++;theRetToken=_returnToken;
					}
					}else {__CLOVER_65_0.cloverRec.S[6135]++;if (((((LA(1)=='>') && (true)) && (++__CLOVER_65_0.cloverRec.CT[1917]!=0|true)) || (++__CLOVER_65_0.cloverRec.CF[1917]==0&false))) {{
						__CLOVER_65_0.cloverRec.S[6136]++;mSUPS(true);
						__CLOVER_65_0.cloverRec.S[6137]++;theRetToken=_returnToken;
					}
					}else {__CLOVER_65_0.cloverRec.S[6138]++;if (((((LA(1)=='.') && (true)) && (++__CLOVER_65_0.cloverRec.CT[1918]!=0|true)) || (++__CLOVER_65_0.cloverRec.CF[1918]==0&false))) {{
						__CLOVER_65_0.cloverRec.S[6139]++;mPOINT(true);
						__CLOVER_65_0.cloverRec.S[6140]++;theRetToken=_returnToken;
					}
					}else {__CLOVER_65_0.cloverRec.S[6141]++;if (((((LA(1)==':') && (true)) && (++__CLOVER_65_0.cloverRec.CT[1919]!=0|true)) || (++__CLOVER_65_0.cloverRec.CF[1919]==0&false))) {{
						__CLOVER_65_0.cloverRec.S[6142]++;mDOUBLE_POINT(true);
						__CLOVER_65_0.cloverRec.S[6143]++;theRetToken=_returnToken;
					}
				}else {{
					__CLOVER_65_0.cloverRec.S[6144]++;if ((((LA(1)==EOF_CHAR) && (++__CLOVER_65_0.cloverRec.CT[1920]!=0|true)) || (++__CLOVER_65_0.cloverRec.CF[1920]==0&false))) {{__CLOVER_65_0.cloverRec.S[6145]++;uponEOF(); __CLOVER_65_0.cloverRec.S[6146]++;_returnToken = makeToken(Token.EOF_TYPE);}
				}else {{__CLOVER_65_0.cloverRec.S[6147]++;throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());}
				}}
				}}}}}}}}}}}}}}}}}}
				__CLOVER_65_0.cloverRec.S[6148]++;if ( (((_returnToken==null ) && (++__CLOVER_65_0.cloverRec.CT[1921]!=0|true)) || (++__CLOVER_65_0.cloverRec.CF[1921]==0&false))) {__CLOVER_65_0.cloverRec.S[6149]++;continue tryAgain; // found SKIP token
				}__CLOVER_65_0.cloverRec.S[6150]++;_ttype = _returnToken.getType();
				__CLOVER_65_0.cloverRec.S[6151]++;_returnToken.setType(_ttype);
				__CLOVER_65_0.cloverRec.S[6152]++;return _returnToken;
			}
			catch (RecognitionException e) {
				__CLOVER_65_0.cloverRec.S[6153]++;throw new TokenStreamRecognitionException(e);
			}
		}
		catch (CharStreamException cse) {
			__CLOVER_65_0.cloverRec.S[6154]++;if ( (((cse instanceof CharStreamIOException ) && (++__CLOVER_65_0.cloverRec.CT[1922]!=0|true)) || (++__CLOVER_65_0.cloverRec.CF[1922]==0&false))) {{
				__CLOVER_65_0.cloverRec.S[6155]++;throw new TokenStreamIOException(((CharStreamIOException)cse).io);
			}
			}else {{
				__CLOVER_65_0.cloverRec.S[6156]++;throw new TokenStreamException(cse.getMessage());
			}
		}}
	}
}}

	public final void mWS(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {__CLOVER_65_0.cloverRec.M[486]++;
		__CLOVER_65_0.cloverRec.S[6157]++;int _ttype; __CLOVER_65_0.cloverRec.S[6158]++;Token _token=null; __CLOVER_65_0.cloverRec.S[6159]++;int _begin=text.length();
		__CLOVER_65_0.cloverRec.S[6160]++;_ttype = WS;
		__CLOVER_65_0.cloverRec.S[6161]++;int _saveIndex;
		
		{
		__CLOVER_65_0.cloverRec.S[6162]++;boolean __CLOVER_bool1=false;switch ( LA(1)) {
		case ' ':if (!__CLOVER_bool1) {__CLOVER_65_0.cloverRec.S[6163]++;__CLOVER_bool1=true;}
		{
			__CLOVER_65_0.cloverRec.S[6164]++;match(' ');
			__CLOVER_65_0.cloverRec.S[6165]++;break;
		}
		case '\t':if (!__CLOVER_bool1) {__CLOVER_65_0.cloverRec.S[6166]++;__CLOVER_bool1=true;}
		{
			__CLOVER_65_0.cloverRec.S[6167]++;match('\t');
			__CLOVER_65_0.cloverRec.S[6168]++;break;
		}
		case '\n':if (!__CLOVER_bool1) {__CLOVER_65_0.cloverRec.S[6169]++;__CLOVER_bool1=true;}
		{
			__CLOVER_65_0.cloverRec.S[6170]++;match('\n');
			__CLOVER_65_0.cloverRec.S[6171]++;newline();
			__CLOVER_65_0.cloverRec.S[6172]++;break;
		}
		case '\r':if (!__CLOVER_bool1) {__CLOVER_65_0.cloverRec.S[6173]++;__CLOVER_bool1=true;}
		{
			__CLOVER_65_0.cloverRec.S[6174]++;match('\r');
			__CLOVER_65_0.cloverRec.S[6175]++;break;
		}
		default:if (!__CLOVER_bool1) {__CLOVER_65_0.cloverRec.S[6176]++;__CLOVER_bool1=true;}
		{
			__CLOVER_65_0.cloverRec.S[6177]++;throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());
		}
		}
		}
		__CLOVER_65_0.cloverRec.S[6178]++;_ttype = Token.SKIP;
		__CLOVER_65_0.cloverRec.S[6179]++;if ( (((_createToken && _token==null && _ttype!=Token.SKIP ) && (++__CLOVER_65_0.cloverRec.CT[1923]!=0|true)) || (++__CLOVER_65_0.cloverRec.CF[1923]==0&false))) {{
			__CLOVER_65_0.cloverRec.S[6180]++;_token = makeToken(_ttype);
			__CLOVER_65_0.cloverRec.S[6181]++;_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		}__CLOVER_65_0.cloverRec.S[6182]++;_returnToken = _token;
	}
	
	public final void mCOMMENTAIRE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {__CLOVER_65_0.cloverRec.M[487]++;
		__CLOVER_65_0.cloverRec.S[6183]++;int _ttype; __CLOVER_65_0.cloverRec.S[6184]++;Token _token=null; __CLOVER_65_0.cloverRec.S[6185]++;int _begin=text.length();
		__CLOVER_65_0.cloverRec.S[6186]++;_ttype = COMMENTAIRE;
		__CLOVER_65_0.cloverRec.S[6187]++;int _saveIndex;
		
		__CLOVER_65_0.cloverRec.S[6188]++;int ligne=-1,colonne=-1;
		
		
		__CLOVER_65_0.cloverRec.S[6189]++;match("--");
		__CLOVER_65_0.cloverRec.S[6190]++;ligne=getLine();__CLOVER_65_0.cloverRec.S[6191]++;colonne=getColumn();
		{
		__CLOVER_65_0.cloverRec.S[6192]++;_loop294:
		do {{
			__CLOVER_65_0.cloverRec.S[6193]++;if (((((_tokenSet_0.member(LA(1)))) && (++__CLOVER_65_0.cloverRec.CT[1924]!=0|true)) || (++__CLOVER_65_0.cloverRec.CF[1924]==0&false))) {{
				{
				__CLOVER_65_0.cloverRec.S[6194]++;boolean __CLOVER_bool2=false;switch ( LA(1)) {
				case '\t':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6195]++;__CLOVER_bool2=true;}
				{
					__CLOVER_65_0.cloverRec.S[6196]++;match('\t');
					__CLOVER_65_0.cloverRec.S[6197]++;break;
				}
				case ' ':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6198]++;__CLOVER_bool2=true;}
				{
					__CLOVER_65_0.cloverRec.S[6199]++;match(' ');
					__CLOVER_65_0.cloverRec.S[6200]++;break;
				}
				case '@':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6201]++;__CLOVER_bool2=true;}
				{
					__CLOVER_65_0.cloverRec.S[6202]++;match('@');
					__CLOVER_65_0.cloverRec.S[6203]++;break;
				}
				case '#':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6204]++;__CLOVER_bool2=true;}
				{
					__CLOVER_65_0.cloverRec.S[6205]++;match('#');
					__CLOVER_65_0.cloverRec.S[6206]++;break;
				}
				case '|':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6207]++;__CLOVER_bool2=true;}
				{
					__CLOVER_65_0.cloverRec.S[6208]++;match('|');
					__CLOVER_65_0.cloverRec.S[6209]++;break;
				}
				case '&':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6210]++;__CLOVER_bool2=true;}
				{
					__CLOVER_65_0.cloverRec.S[6211]++;match('&');
					__CLOVER_65_0.cloverRec.S[6212]++;break;
				}
				case 'a':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6213]++;__CLOVER_bool2=true;}  case 'b':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6214]++;__CLOVER_bool2=true;}  case 'c':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6215]++;__CLOVER_bool2=true;}  case 'd':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6216]++;__CLOVER_bool2=true;}
				case 'e':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6217]++;__CLOVER_bool2=true;}  case 'f':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6218]++;__CLOVER_bool2=true;}  case 'g':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6219]++;__CLOVER_bool2=true;}  case 'h':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6220]++;__CLOVER_bool2=true;}
				case 'i':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6221]++;__CLOVER_bool2=true;}  case 'j':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6222]++;__CLOVER_bool2=true;}  case 'k':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6223]++;__CLOVER_bool2=true;}  case 'l':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6224]++;__CLOVER_bool2=true;}
				case 'm':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6225]++;__CLOVER_bool2=true;}  case 'n':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6226]++;__CLOVER_bool2=true;}  case 'o':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6227]++;__CLOVER_bool2=true;}  case 'p':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6228]++;__CLOVER_bool2=true;}
				case 'q':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6229]++;__CLOVER_bool2=true;}  case 'r':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6230]++;__CLOVER_bool2=true;}  case 's':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6231]++;__CLOVER_bool2=true;}  case 't':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6232]++;__CLOVER_bool2=true;}
				case 'u':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6233]++;__CLOVER_bool2=true;}  case 'v':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6234]++;__CLOVER_bool2=true;}  case 'w':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6235]++;__CLOVER_bool2=true;}  case 'x':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6236]++;__CLOVER_bool2=true;}
				case 'y':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6237]++;__CLOVER_bool2=true;}  case 'z':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6238]++;__CLOVER_bool2=true;}
				{
					__CLOVER_65_0.cloverRec.S[6239]++;matchRange('a','z');
					__CLOVER_65_0.cloverRec.S[6240]++;break;
				}
				case 'A':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6241]++;__CLOVER_bool2=true;}  case 'B':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6242]++;__CLOVER_bool2=true;}  case 'C':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6243]++;__CLOVER_bool2=true;}  case 'D':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6244]++;__CLOVER_bool2=true;}
				case 'E':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6245]++;__CLOVER_bool2=true;}  case 'F':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6246]++;__CLOVER_bool2=true;}  case 'G':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6247]++;__CLOVER_bool2=true;}  case 'H':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6248]++;__CLOVER_bool2=true;}
				case 'I':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6249]++;__CLOVER_bool2=true;}  case 'J':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6250]++;__CLOVER_bool2=true;}  case 'K':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6251]++;__CLOVER_bool2=true;}  case 'L':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6252]++;__CLOVER_bool2=true;}
				case 'M':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6253]++;__CLOVER_bool2=true;}  case 'N':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6254]++;__CLOVER_bool2=true;}  case 'O':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6255]++;__CLOVER_bool2=true;}  case 'P':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6256]++;__CLOVER_bool2=true;}
				case 'Q':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6257]++;__CLOVER_bool2=true;}  case 'R':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6258]++;__CLOVER_bool2=true;}  case 'S':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6259]++;__CLOVER_bool2=true;}  case 'T':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6260]++;__CLOVER_bool2=true;}
				case 'U':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6261]++;__CLOVER_bool2=true;}  case 'V':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6262]++;__CLOVER_bool2=true;}  case 'W':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6263]++;__CLOVER_bool2=true;}  case 'X':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6264]++;__CLOVER_bool2=true;}
				case 'Y':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6265]++;__CLOVER_bool2=true;}  case 'Z':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6266]++;__CLOVER_bool2=true;}
				{
					__CLOVER_65_0.cloverRec.S[6267]++;matchRange('A','Z');
					__CLOVER_65_0.cloverRec.S[6268]++;break;
				}
				case '_':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6269]++;__CLOVER_bool2=true;}
				{
					__CLOVER_65_0.cloverRec.S[6270]++;match('_');
					__CLOVER_65_0.cloverRec.S[6271]++;break;
				}
				case '0':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6272]++;__CLOVER_bool2=true;}  case '1':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6273]++;__CLOVER_bool2=true;}  case '2':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6274]++;__CLOVER_bool2=true;}  case '3':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6275]++;__CLOVER_bool2=true;}
				case '4':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6276]++;__CLOVER_bool2=true;}  case '5':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6277]++;__CLOVER_bool2=true;}  case '6':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6278]++;__CLOVER_bool2=true;}  case '7':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6279]++;__CLOVER_bool2=true;}
				case '8':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6280]++;__CLOVER_bool2=true;}  case '9':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6281]++;__CLOVER_bool2=true;}
				{
					__CLOVER_65_0.cloverRec.S[6282]++;matchRange('0','9');
					__CLOVER_65_0.cloverRec.S[6283]++;break;
				}
				case '"':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6284]++;__CLOVER_bool2=true;}
				{
					__CLOVER_65_0.cloverRec.S[6285]++;match('"');
					__CLOVER_65_0.cloverRec.S[6286]++;break;
				}
				case '\'':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6287]++;__CLOVER_bool2=true;}
				{
					__CLOVER_65_0.cloverRec.S[6288]++;match('\'');
					__CLOVER_65_0.cloverRec.S[6289]++;break;
				}
				case '{':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6290]++;__CLOVER_bool2=true;}
				{
					__CLOVER_65_0.cloverRec.S[6291]++;match('{');
					__CLOVER_65_0.cloverRec.S[6292]++;break;
				}
				case '}':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6293]++;__CLOVER_bool2=true;}
				{
					__CLOVER_65_0.cloverRec.S[6294]++;match('}');
					__CLOVER_65_0.cloverRec.S[6295]++;break;
				}
				case '[':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6296]++;__CLOVER_bool2=true;}
				{
					__CLOVER_65_0.cloverRec.S[6297]++;match('[');
					__CLOVER_65_0.cloverRec.S[6298]++;break;
				}
				case ']':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6299]++;__CLOVER_bool2=true;}
				{
					__CLOVER_65_0.cloverRec.S[6300]++;match(']');
					__CLOVER_65_0.cloverRec.S[6301]++;break;
				}
				case '(':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6302]++;__CLOVER_bool2=true;}
				{
					__CLOVER_65_0.cloverRec.S[6303]++;match('(');
					__CLOVER_65_0.cloverRec.S[6304]++;break;
				}
				case ')':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6305]++;__CLOVER_bool2=true;}
				{
					__CLOVER_65_0.cloverRec.S[6306]++;match(')');
					__CLOVER_65_0.cloverRec.S[6307]++;break;
				}
				case '=':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6308]++;__CLOVER_bool2=true;}
				{
					__CLOVER_65_0.cloverRec.S[6309]++;match('=');
					__CLOVER_65_0.cloverRec.S[6310]++;break;
				}
				case '+':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6311]++;__CLOVER_bool2=true;}
				{
					__CLOVER_65_0.cloverRec.S[6312]++;match('+');
					__CLOVER_65_0.cloverRec.S[6313]++;break;
				}
				case '-':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6314]++;__CLOVER_bool2=true;}
				{
					__CLOVER_65_0.cloverRec.S[6315]++;match('-');
					__CLOVER_65_0.cloverRec.S[6316]++;break;
				}
				case '\u00e9':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6317]++;__CLOVER_bool2=true;}
				{
					__CLOVER_65_0.cloverRec.S[6318]++;match('\u00e9');
					__CLOVER_65_0.cloverRec.S[6319]++;break;
				}
				case '\u00e8':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6320]++;__CLOVER_bool2=true;}
				{
					__CLOVER_65_0.cloverRec.S[6321]++;match('\u00e8');
					__CLOVER_65_0.cloverRec.S[6322]++;break;
				}
				case '\u00e7':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6323]++;__CLOVER_bool2=true;}
				{
					__CLOVER_65_0.cloverRec.S[6324]++;match('\u00e7');
					__CLOVER_65_0.cloverRec.S[6325]++;break;
				}
				case '\u00e0':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6326]++;__CLOVER_bool2=true;}
				{
					__CLOVER_65_0.cloverRec.S[6327]++;match('\u00e0');
					__CLOVER_65_0.cloverRec.S[6328]++;break;
				}
				case '~':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6329]++;__CLOVER_bool2=true;}
				{
					__CLOVER_65_0.cloverRec.S[6330]++;match('~');
					__CLOVER_65_0.cloverRec.S[6331]++;break;
				}
				case '`':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6332]++;__CLOVER_bool2=true;}
				{
					__CLOVER_65_0.cloverRec.S[6333]++;match('`');
					__CLOVER_65_0.cloverRec.S[6334]++;break;
				}
				case '\\':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6335]++;__CLOVER_bool2=true;}
				{
					__CLOVER_65_0.cloverRec.S[6336]++;match('\\');
					__CLOVER_65_0.cloverRec.S[6337]++;break;
				}
				case '^':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6338]++;__CLOVER_bool2=true;}
				{
					__CLOVER_65_0.cloverRec.S[6339]++;match('^');
					__CLOVER_65_0.cloverRec.S[6340]++;break;
				}
				case '\u00b0':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6341]++;__CLOVER_bool2=true;}
				{
					__CLOVER_65_0.cloverRec.S[6342]++;match('\u00b0');
					__CLOVER_65_0.cloverRec.S[6343]++;break;
				}
				case '/':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6344]++;__CLOVER_bool2=true;}
				{
					__CLOVER_65_0.cloverRec.S[6345]++;match('/');
					__CLOVER_65_0.cloverRec.S[6346]++;break;
				}
				case '.':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6347]++;__CLOVER_bool2=true;}
				{
					__CLOVER_65_0.cloverRec.S[6348]++;match('.');
					__CLOVER_65_0.cloverRec.S[6349]++;break;
				}
				case '?':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6350]++;__CLOVER_bool2=true;}
				{
					__CLOVER_65_0.cloverRec.S[6351]++;match('?');
					__CLOVER_65_0.cloverRec.S[6352]++;break;
				}
				case ',':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6353]++;__CLOVER_bool2=true;}
				{
					__CLOVER_65_0.cloverRec.S[6354]++;match(',');
					__CLOVER_65_0.cloverRec.S[6355]++;break;
				}
				case ';':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6356]++;__CLOVER_bool2=true;}
				{
					__CLOVER_65_0.cloverRec.S[6357]++;match(';');
					__CLOVER_65_0.cloverRec.S[6358]++;break;
				}
				case ':':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6359]++;__CLOVER_bool2=true;}
				{
					__CLOVER_65_0.cloverRec.S[6360]++;match(':');
					__CLOVER_65_0.cloverRec.S[6361]++;break;
				}
				case '!':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6362]++;__CLOVER_bool2=true;}
				{
					__CLOVER_65_0.cloverRec.S[6363]++;match('!');
					__CLOVER_65_0.cloverRec.S[6364]++;break;
				}
				case '\u00a7':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6365]++;__CLOVER_bool2=true;}
				{
					__CLOVER_65_0.cloverRec.S[6366]++;match('\u00a7');
					__CLOVER_65_0.cloverRec.S[6367]++;break;
				}
				case '%':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6368]++;__CLOVER_bool2=true;}
				{
					__CLOVER_65_0.cloverRec.S[6369]++;match('%');
					__CLOVER_65_0.cloverRec.S[6370]++;break;
				}
				case '\u00f9':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6371]++;__CLOVER_bool2=true;}
				{
					__CLOVER_65_0.cloverRec.S[6372]++;match('\u00f9');
					__CLOVER_65_0.cloverRec.S[6373]++;break;
				}
				case '*':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6374]++;__CLOVER_bool2=true;}
				{
					__CLOVER_65_0.cloverRec.S[6375]++;match('*');
					__CLOVER_65_0.cloverRec.S[6376]++;break;
				}
				case '\u00b5':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6377]++;__CLOVER_bool2=true;}
				{
					__CLOVER_65_0.cloverRec.S[6378]++;match('\u00b5');
					__CLOVER_65_0.cloverRec.S[6379]++;break;
				}
				case '\u00a8':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6380]++;__CLOVER_bool2=true;}
				{
					__CLOVER_65_0.cloverRec.S[6381]++;match('\u00a8');
					__CLOVER_65_0.cloverRec.S[6382]++;break;
				}
				case '$':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6383]++;__CLOVER_bool2=true;}
				{
					__CLOVER_65_0.cloverRec.S[6384]++;match('$');
					__CLOVER_65_0.cloverRec.S[6385]++;break;
				}
				case '\u00a4':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6386]++;__CLOVER_bool2=true;}
				{
					__CLOVER_65_0.cloverRec.S[6387]++;match('\u00a4');
					__CLOVER_65_0.cloverRec.S[6388]++;break;
				}
				case '\u00a3':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6389]++;__CLOVER_bool2=true;}
				{
					__CLOVER_65_0.cloverRec.S[6390]++;match('\u00a3');
					__CLOVER_65_0.cloverRec.S[6391]++;break;
				}
				case '\u00b2':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6392]++;__CLOVER_bool2=true;}
				{
					__CLOVER_65_0.cloverRec.S[6393]++;match('\u00b2');
					__CLOVER_65_0.cloverRec.S[6394]++;break;
				}
				case '<':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6395]++;__CLOVER_bool2=true;}
				{
					__CLOVER_65_0.cloverRec.S[6396]++;match('<');
					__CLOVER_65_0.cloverRec.S[6397]++;break;
				}
				case '>':if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6398]++;__CLOVER_bool2=true;}
				{
					__CLOVER_65_0.cloverRec.S[6399]++;match('>');
					__CLOVER_65_0.cloverRec.S[6400]++;break;
				}
				default:if (!__CLOVER_bool2) {__CLOVER_65_0.cloverRec.S[6401]++;__CLOVER_bool2=true;}
				{
					__CLOVER_65_0.cloverRec.S[6402]++;throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());
				}
				}
				}
			}
			}else {{
				__CLOVER_65_0.cloverRec.S[6403]++;break _loop294;
			}
			
		}} }while (true);
		}
		__CLOVER_65_0.cloverRec.S[6404]++;_ttype = Token.SKIP;
						__CLOVER_65_0.cloverRec.S[6405]++;ajoute_commentaire(new String(text.getBuffer(),_begin,text.length()-_begin),
							new tinyeiffel.ast.Token(ligne,colonne,
									new String(text.getBuffer(),_begin,text.length()-_begin),""));
		__CLOVER_65_0.cloverRec.S[6406]++;if ( (((_createToken && _token==null && _ttype!=Token.SKIP ) && (++__CLOVER_65_0.cloverRec.CT[1925]!=0|true)) || (++__CLOVER_65_0.cloverRec.CF[1925]==0&false))) {{
			__CLOVER_65_0.cloverRec.S[6407]++;_token = makeToken(_ttype);
			__CLOVER_65_0.cloverRec.S[6408]++;_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		}__CLOVER_65_0.cloverRec.S[6409]++;_returnToken = _token;
	}
	
	public final void mLPAREN(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {__CLOVER_65_0.cloverRec.M[488]++;
		__CLOVER_65_0.cloverRec.S[6410]++;int _ttype; __CLOVER_65_0.cloverRec.S[6411]++;Token _token=null; __CLOVER_65_0.cloverRec.S[6412]++;int _begin=text.length();
		__CLOVER_65_0.cloverRec.S[6413]++;_ttype = LPAREN;
		__CLOVER_65_0.cloverRec.S[6414]++;int _saveIndex;
		
		__CLOVER_65_0.cloverRec.S[6415]++;match("(");
		__CLOVER_65_0.cloverRec.S[6416]++;if ( (((_createToken && _token==null && _ttype!=Token.SKIP ) && (++__CLOVER_65_0.cloverRec.CT[1926]!=0|true)) || (++__CLOVER_65_0.cloverRec.CF[1926]==0&false))) {{
			__CLOVER_65_0.cloverRec.S[6417]++;_token = makeToken(_ttype);
			__CLOVER_65_0.cloverRec.S[6418]++;_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		}__CLOVER_65_0.cloverRec.S[6419]++;_returnToken = _token;
	}
	
	public final void mRPAREN(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {__CLOVER_65_0.cloverRec.M[489]++;
		__CLOVER_65_0.cloverRec.S[6420]++;int _ttype; __CLOVER_65_0.cloverRec.S[6421]++;Token _token=null; __CLOVER_65_0.cloverRec.S[6422]++;int _begin=text.length();
		__CLOVER_65_0.cloverRec.S[6423]++;_ttype = RPAREN;
		__CLOVER_65_0.cloverRec.S[6424]++;int _saveIndex;
		
		__CLOVER_65_0.cloverRec.S[6425]++;match(")");
		__CLOVER_65_0.cloverRec.S[6426]++;if ( (((_createToken && _token==null && _ttype!=Token.SKIP ) && (++__CLOVER_65_0.cloverRec.CT[1927]!=0|true)) || (++__CLOVER_65_0.cloverRec.CF[1927]==0&false))) {{
			__CLOVER_65_0.cloverRec.S[6427]++;_token = makeToken(_ttype);
			__CLOVER_65_0.cloverRec.S[6428]++;_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		}__CLOVER_65_0.cloverRec.S[6429]++;_returnToken = _token;
	}
	
	public final void mCROCHETO(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {__CLOVER_65_0.cloverRec.M[490]++;
		__CLOVER_65_0.cloverRec.S[6430]++;int _ttype; __CLOVER_65_0.cloverRec.S[6431]++;Token _token=null; __CLOVER_65_0.cloverRec.S[6432]++;int _begin=text.length();
		__CLOVER_65_0.cloverRec.S[6433]++;_ttype = CROCHETO;
		__CLOVER_65_0.cloverRec.S[6434]++;int _saveIndex;
		
		__CLOVER_65_0.cloverRec.S[6435]++;match("[");
		__CLOVER_65_0.cloverRec.S[6436]++;if ( (((_createToken && _token==null && _ttype!=Token.SKIP ) && (++__CLOVER_65_0.cloverRec.CT[1928]!=0|true)) || (++__CLOVER_65_0.cloverRec.CF[1928]==0&false))) {{
			__CLOVER_65_0.cloverRec.S[6437]++;_token = makeToken(_ttype);
			__CLOVER_65_0.cloverRec.S[6438]++;_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		}__CLOVER_65_0.cloverRec.S[6439]++;_returnToken = _token;
	}
	
	public final void mCROCHETF(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {__CLOVER_65_0.cloverRec.M[491]++;
		__CLOVER_65_0.cloverRec.S[6440]++;int _ttype; __CLOVER_65_0.cloverRec.S[6441]++;Token _token=null; __CLOVER_65_0.cloverRec.S[6442]++;int _begin=text.length();
		__CLOVER_65_0.cloverRec.S[6443]++;_ttype = CROCHETF;
		__CLOVER_65_0.cloverRec.S[6444]++;int _saveIndex;
		
		__CLOVER_65_0.cloverRec.S[6445]++;match("]");
		__CLOVER_65_0.cloverRec.S[6446]++;if ( (((_createToken && _token==null && _ttype!=Token.SKIP ) && (++__CLOVER_65_0.cloverRec.CT[1929]!=0|true)) || (++__CLOVER_65_0.cloverRec.CF[1929]==0&false))) {{
			__CLOVER_65_0.cloverRec.S[6447]++;_token = makeToken(_ttype);
			__CLOVER_65_0.cloverRec.S[6448]++;_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		}__CLOVER_65_0.cloverRec.S[6449]++;_returnToken = _token;
	}
	
	public final void mFLECHED(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {__CLOVER_65_0.cloverRec.M[492]++;
		__CLOVER_65_0.cloverRec.S[6450]++;int _ttype; __CLOVER_65_0.cloverRec.S[6451]++;Token _token=null; __CLOVER_65_0.cloverRec.S[6452]++;int _begin=text.length();
		__CLOVER_65_0.cloverRec.S[6453]++;_ttype = FLECHED;
		__CLOVER_65_0.cloverRec.S[6454]++;int _saveIndex;
		
		__CLOVER_65_0.cloverRec.S[6455]++;match("->");
		__CLOVER_65_0.cloverRec.S[6456]++;if ( (((_createToken && _token==null && _ttype!=Token.SKIP ) && (++__CLOVER_65_0.cloverRec.CT[1930]!=0|true)) || (++__CLOVER_65_0.cloverRec.CF[1930]==0&false))) {{
			__CLOVER_65_0.cloverRec.S[6457]++;_token = makeToken(_ttype);
			__CLOVER_65_0.cloverRec.S[6458]++;_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		}__CLOVER_65_0.cloverRec.S[6459]++;_returnToken = _token;
	}
	
	public final void mDEUX_POINT(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {__CLOVER_65_0.cloverRec.M[493]++;
		__CLOVER_65_0.cloverRec.S[6460]++;int _ttype; __CLOVER_65_0.cloverRec.S[6461]++;Token _token=null; __CLOVER_65_0.cloverRec.S[6462]++;int _begin=text.length();
		__CLOVER_65_0.cloverRec.S[6463]++;_ttype = DEUX_POINT;
		__CLOVER_65_0.cloverRec.S[6464]++;int _saveIndex;
		
		__CLOVER_65_0.cloverRec.S[6465]++;match("..");
		__CLOVER_65_0.cloverRec.S[6466]++;if ( (((_createToken && _token==null && _ttype!=Token.SKIP ) && (++__CLOVER_65_0.cloverRec.CT[1931]!=0|true)) || (++__CLOVER_65_0.cloverRec.CF[1931]==0&false))) {{
			__CLOVER_65_0.cloverRec.S[6467]++;_token = makeToken(_ttype);
			__CLOVER_65_0.cloverRec.S[6468]++;_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		}__CLOVER_65_0.cloverRec.S[6469]++;_returnToken = _token;
	}
	
	public final void mPLUS(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {__CLOVER_65_0.cloverRec.M[494]++;
		__CLOVER_65_0.cloverRec.S[6470]++;int _ttype; __CLOVER_65_0.cloverRec.S[6471]++;Token _token=null; __CLOVER_65_0.cloverRec.S[6472]++;int _begin=text.length();
		__CLOVER_65_0.cloverRec.S[6473]++;_ttype = PLUS;
		__CLOVER_65_0.cloverRec.S[6474]++;int _saveIndex;
		
		__CLOVER_65_0.cloverRec.S[6475]++;match("+");
		__CLOVER_65_0.cloverRec.S[6476]++;if ( (((_createToken && _token==null && _ttype!=Token.SKIP ) && (++__CLOVER_65_0.cloverRec.CT[1932]!=0|true)) || (++__CLOVER_65_0.cloverRec.CF[1932]==0&false))) {{
			__CLOVER_65_0.cloverRec.S[6477]++;_token = makeToken(_ttype);
			__CLOVER_65_0.cloverRec.S[6478]++;_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		}__CLOVER_65_0.cloverRec.S[6479]++;_returnToken = _token;
	}
	
	public final void mMOINS(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {__CLOVER_65_0.cloverRec.M[495]++;
		__CLOVER_65_0.cloverRec.S[6480]++;int _ttype; __CLOVER_65_0.cloverRec.S[6481]++;Token _token=null; __CLOVER_65_0.cloverRec.S[6482]++;int _begin=text.length();
		__CLOVER_65_0.cloverRec.S[6483]++;_ttype = MOINS;
		__CLOVER_65_0.cloverRec.S[6484]++;int _saveIndex;
		
		__CLOVER_65_0.cloverRec.S[6485]++;match("-");
		__CLOVER_65_0.cloverRec.S[6486]++;if ( (((_createToken && _token==null && _ttype!=Token.SKIP ) && (++__CLOVER_65_0.cloverRec.CT[1933]!=0|true)) || (++__CLOVER_65_0.cloverRec.CF[1933]==0&false))) {{
			__CLOVER_65_0.cloverRec.S[6487]++;_token = makeToken(_ttype);
			__CLOVER_65_0.cloverRec.S[6488]++;_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		}__CLOVER_65_0.cloverRec.S[6489]++;_returnToken = _token;
	}
	
	public final void mFOIS(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {__CLOVER_65_0.cloverRec.M[496]++;
		__CLOVER_65_0.cloverRec.S[6490]++;int _ttype; __CLOVER_65_0.cloverRec.S[6491]++;Token _token=null; __CLOVER_65_0.cloverRec.S[6492]++;int _begin=text.length();
		__CLOVER_65_0.cloverRec.S[6493]++;_ttype = FOIS;
		__CLOVER_65_0.cloverRec.S[6494]++;int _saveIndex;
		
		__CLOVER_65_0.cloverRec.S[6495]++;match("*");
		__CLOVER_65_0.cloverRec.S[6496]++;if ( (((_createToken && _token==null && _ttype!=Token.SKIP ) && (++__CLOVER_65_0.cloverRec.CT[1934]!=0|true)) || (++__CLOVER_65_0.cloverRec.CF[1934]==0&false))) {{
			__CLOVER_65_0.cloverRec.S[6497]++;_token = makeToken(_ttype);
			__CLOVER_65_0.cloverRec.S[6498]++;_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		}__CLOVER_65_0.cloverRec.S[6499]++;_returnToken = _token;
	}
	
	public final void mDIFF(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {__CLOVER_65_0.cloverRec.M[497]++;
		__CLOVER_65_0.cloverRec.S[6500]++;int _ttype; __CLOVER_65_0.cloverRec.S[6501]++;Token _token=null; __CLOVER_65_0.cloverRec.S[6502]++;int _begin=text.length();
		__CLOVER_65_0.cloverRec.S[6503]++;_ttype = DIFF;
		__CLOVER_65_0.cloverRec.S[6504]++;int _saveIndex;
		
		__CLOVER_65_0.cloverRec.S[6505]++;match("/=");
		__CLOVER_65_0.cloverRec.S[6506]++;if ( (((_createToken && _token==null && _ttype!=Token.SKIP ) && (++__CLOVER_65_0.cloverRec.CT[1935]!=0|true)) || (++__CLOVER_65_0.cloverRec.CF[1935]==0&false))) {{
			__CLOVER_65_0.cloverRec.S[6507]++;_token = makeToken(_ttype);
			__CLOVER_65_0.cloverRec.S[6508]++;_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		}__CLOVER_65_0.cloverRec.S[6509]++;_returnToken = _token;
	}
	
	public final void mDIV_ENTIER(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {__CLOVER_65_0.cloverRec.M[498]++;
		__CLOVER_65_0.cloverRec.S[6510]++;int _ttype; __CLOVER_65_0.cloverRec.S[6511]++;Token _token=null; __CLOVER_65_0.cloverRec.S[6512]++;int _begin=text.length();
		__CLOVER_65_0.cloverRec.S[6513]++;_ttype = DIV_ENTIER;
		__CLOVER_65_0.cloverRec.S[6514]++;int _saveIndex;
		
		__CLOVER_65_0.cloverRec.S[6515]++;match("//");
		__CLOVER_65_0.cloverRec.S[6516]++;if ( (((_createToken && _token==null && _ttype!=Token.SKIP ) && (++__CLOVER_65_0.cloverRec.CT[1936]!=0|true)) || (++__CLOVER_65_0.cloverRec.CF[1936]==0&false))) {{
			__CLOVER_65_0.cloverRec.S[6517]++;_token = makeToken(_ttype);
			__CLOVER_65_0.cloverRec.S[6518]++;_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		}__CLOVER_65_0.cloverRec.S[6519]++;_returnToken = _token;
	}
	
	public final void mDIV(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {__CLOVER_65_0.cloverRec.M[499]++;
		__CLOVER_65_0.cloverRec.S[6520]++;int _ttype; __CLOVER_65_0.cloverRec.S[6521]++;Token _token=null; __CLOVER_65_0.cloverRec.S[6522]++;int _begin=text.length();
		__CLOVER_65_0.cloverRec.S[6523]++;_ttype = DIV;
		__CLOVER_65_0.cloverRec.S[6524]++;int _saveIndex;
		
		__CLOVER_65_0.cloverRec.S[6525]++;match("/");
		__CLOVER_65_0.cloverRec.S[6526]++;if ( (((_createToken && _token==null && _ttype!=Token.SKIP ) && (++__CLOVER_65_0.cloverRec.CT[1937]!=0|true)) || (++__CLOVER_65_0.cloverRec.CF[1937]==0&false))) {{
			__CLOVER_65_0.cloverRec.S[6527]++;_token = makeToken(_ttype);
			__CLOVER_65_0.cloverRec.S[6528]++;_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		}__CLOVER_65_0.cloverRec.S[6529]++;_returnToken = _token;
	}
	
	public final void mMOD(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {__CLOVER_65_0.cloverRec.M[500]++;
		__CLOVER_65_0.cloverRec.S[6530]++;int _ttype; __CLOVER_65_0.cloverRec.S[6531]++;Token _token=null; __CLOVER_65_0.cloverRec.S[6532]++;int _begin=text.length();
		__CLOVER_65_0.cloverRec.S[6533]++;_ttype = MOD;
		__CLOVER_65_0.cloverRec.S[6534]++;int _saveIndex;
		
		__CLOVER_65_0.cloverRec.S[6535]++;match("\\\\");
		__CLOVER_65_0.cloverRec.S[6536]++;if ( (((_createToken && _token==null && _ttype!=Token.SKIP ) && (++__CLOVER_65_0.cloverRec.CT[1938]!=0|true)) || (++__CLOVER_65_0.cloverRec.CF[1938]==0&false))) {{
			__CLOVER_65_0.cloverRec.S[6537]++;_token = makeToken(_ttype);
			__CLOVER_65_0.cloverRec.S[6538]++;_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		}__CLOVER_65_0.cloverRec.S[6539]++;_returnToken = _token;
	}
	
	public final void mEGAL(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {__CLOVER_65_0.cloverRec.M[501]++;
		__CLOVER_65_0.cloverRec.S[6540]++;int _ttype; __CLOVER_65_0.cloverRec.S[6541]++;Token _token=null; __CLOVER_65_0.cloverRec.S[6542]++;int _begin=text.length();
		__CLOVER_65_0.cloverRec.S[6543]++;_ttype = EGAL;
		__CLOVER_65_0.cloverRec.S[6544]++;int _saveIndex;
		
		__CLOVER_65_0.cloverRec.S[6545]++;match("=");
		__CLOVER_65_0.cloverRec.S[6546]++;if ( (((_createToken && _token==null && _ttype!=Token.SKIP ) && (++__CLOVER_65_0.cloverRec.CT[1939]!=0|true)) || (++__CLOVER_65_0.cloverRec.CF[1939]==0&false))) {{
			__CLOVER_65_0.cloverRec.S[6547]++;_token = makeToken(_ttype);
			__CLOVER_65_0.cloverRec.S[6548]++;_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		}__CLOVER_65_0.cloverRec.S[6549]++;_returnToken = _token;
	}
	
	public final void mDEBUT_ARRAY(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {__CLOVER_65_0.cloverRec.M[502]++;
		__CLOVER_65_0.cloverRec.S[6550]++;int _ttype; __CLOVER_65_0.cloverRec.S[6551]++;Token _token=null; __CLOVER_65_0.cloverRec.S[6552]++;int _begin=text.length();
		__CLOVER_65_0.cloverRec.S[6553]++;_ttype = DEBUT_ARRAY;
		__CLOVER_65_0.cloverRec.S[6554]++;int _saveIndex;
		
		__CLOVER_65_0.cloverRec.S[6555]++;match("<<");
		__CLOVER_65_0.cloverRec.S[6556]++;if ( (((_createToken && _token==null && _ttype!=Token.SKIP ) && (++__CLOVER_65_0.cloverRec.CT[1940]!=0|true)) || (++__CLOVER_65_0.cloverRec.CF[1940]==0&false))) {{
			__CLOVER_65_0.cloverRec.S[6557]++;_token = makeToken(_ttype);
			__CLOVER_65_0.cloverRec.S[6558]++;_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		}__CLOVER_65_0.cloverRec.S[6559]++;_returnToken = _token;
	}
	
	public final void mFIN_ARRAY(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {__CLOVER_65_0.cloverRec.M[503]++;
		__CLOVER_65_0.cloverRec.S[6560]++;int _ttype; __CLOVER_65_0.cloverRec.S[6561]++;Token _token=null; __CLOVER_65_0.cloverRec.S[6562]++;int _begin=text.length();
		__CLOVER_65_0.cloverRec.S[6563]++;_ttype = FIN_ARRAY;
		__CLOVER_65_0.cloverRec.S[6564]++;int _saveIndex;
		
		__CLOVER_65_0.cloverRec.S[6565]++;match(">>");
		__CLOVER_65_0.cloverRec.S[6566]++;if ( (((_createToken && _token==null && _ttype!=Token.SKIP ) && (++__CLOVER_65_0.cloverRec.CT[1941]!=0|true)) || (++__CLOVER_65_0.cloverRec.CF[1941]==0&false))) {{
			__CLOVER_65_0.cloverRec.S[6567]++;_token = makeToken(_ttype);
			__CLOVER_65_0.cloverRec.S[6568]++;_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		}__CLOVER_65_0.cloverRec.S[6569]++;_returnToken = _token;
	}
	
	public final void mINFS(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {__CLOVER_65_0.cloverRec.M[504]++;
		__CLOVER_65_0.cloverRec.S[6570]++;int _ttype; __CLOVER_65_0.cloverRec.S[6571]++;Token _token=null; __CLOVER_65_0.cloverRec.S[6572]++;int _begin=text.length();
		__CLOVER_65_0.cloverRec.S[6573]++;_ttype = INFS;
		__CLOVER_65_0.cloverRec.S[6574]++;int _saveIndex;
		
		__CLOVER_65_0.cloverRec.S[6575]++;match("<");
		__CLOVER_65_0.cloverRec.S[6576]++;if ( (((_createToken && _token==null && _ttype!=Token.SKIP ) && (++__CLOVER_65_0.cloverRec.CT[1942]!=0|true)) || (++__CLOVER_65_0.cloverRec.CF[1942]==0&false))) {{
			__CLOVER_65_0.cloverRec.S[6577]++;_token = makeToken(_ttype);
			__CLOVER_65_0.cloverRec.S[6578]++;_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		}__CLOVER_65_0.cloverRec.S[6579]++;_returnToken = _token;
	}
	
	public final void mSUPS(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {__CLOVER_65_0.cloverRec.M[505]++;
		__CLOVER_65_0.cloverRec.S[6580]++;int _ttype; __CLOVER_65_0.cloverRec.S[6581]++;Token _token=null; __CLOVER_65_0.cloverRec.S[6582]++;int _begin=text.length();
		__CLOVER_65_0.cloverRec.S[6583]++;_ttype = SUPS;
		__CLOVER_65_0.cloverRec.S[6584]++;int _saveIndex;
		
		__CLOVER_65_0.cloverRec.S[6585]++;match(">");
		__CLOVER_65_0.cloverRec.S[6586]++;if ( (((_createToken && _token==null && _ttype!=Token.SKIP ) && (++__CLOVER_65_0.cloverRec.CT[1943]!=0|true)) || (++__CLOVER_65_0.cloverRec.CF[1943]==0&false))) {{
			__CLOVER_65_0.cloverRec.S[6587]++;_token = makeToken(_ttype);
			__CLOVER_65_0.cloverRec.S[6588]++;_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		}__CLOVER_65_0.cloverRec.S[6589]++;_returnToken = _token;
	}
	
	public final void mINF(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {__CLOVER_65_0.cloverRec.M[506]++;
		__CLOVER_65_0.cloverRec.S[6590]++;int _ttype; __CLOVER_65_0.cloverRec.S[6591]++;Token _token=null; __CLOVER_65_0.cloverRec.S[6592]++;int _begin=text.length();
		__CLOVER_65_0.cloverRec.S[6593]++;_ttype = INF;
		__CLOVER_65_0.cloverRec.S[6594]++;int _saveIndex;
		
		__CLOVER_65_0.cloverRec.S[6595]++;match("<=");
		__CLOVER_65_0.cloverRec.S[6596]++;if ( (((_createToken && _token==null && _ttype!=Token.SKIP ) && (++__CLOVER_65_0.cloverRec.CT[1944]!=0|true)) || (++__CLOVER_65_0.cloverRec.CF[1944]==0&false))) {{
			__CLOVER_65_0.cloverRec.S[6597]++;_token = makeToken(_ttype);
			__CLOVER_65_0.cloverRec.S[6598]++;_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		}__CLOVER_65_0.cloverRec.S[6599]++;_returnToken = _token;
	}
	
	public final void mSUP(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {__CLOVER_65_0.cloverRec.M[507]++;
		__CLOVER_65_0.cloverRec.S[6600]++;int _ttype; __CLOVER_65_0.cloverRec.S[6601]++;Token _token=null; __CLOVER_65_0.cloverRec.S[6602]++;int _begin=text.length();
		__CLOVER_65_0.cloverRec.S[6603]++;_ttype = SUP;
		__CLOVER_65_0.cloverRec.S[6604]++;int _saveIndex;
		
		__CLOVER_65_0.cloverRec.S[6605]++;match(">=");
		__CLOVER_65_0.cloverRec.S[6606]++;if ( (((_createToken && _token==null && _ttype!=Token.SKIP ) && (++__CLOVER_65_0.cloverRec.CT[1945]!=0|true)) || (++__CLOVER_65_0.cloverRec.CF[1945]==0&false))) {{
			__CLOVER_65_0.cloverRec.S[6607]++;_token = makeToken(_ttype);
			__CLOVER_65_0.cloverRec.S[6608]++;_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		}__CLOVER_65_0.cloverRec.S[6609]++;_returnToken = _token;
	}
	
	public final void mSEMI(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {__CLOVER_65_0.cloverRec.M[508]++;
		__CLOVER_65_0.cloverRec.S[6610]++;int _ttype; __CLOVER_65_0.cloverRec.S[6611]++;Token _token=null; __CLOVER_65_0.cloverRec.S[6612]++;int _begin=text.length();
		__CLOVER_65_0.cloverRec.S[6613]++;_ttype = SEMI;
		__CLOVER_65_0.cloverRec.S[6614]++;int _saveIndex;
		
		__CLOVER_65_0.cloverRec.S[6615]++;match(";");
		__CLOVER_65_0.cloverRec.S[6616]++;if ( (((_createToken && _token==null && _ttype!=Token.SKIP ) && (++__CLOVER_65_0.cloverRec.CT[1946]!=0|true)) || (++__CLOVER_65_0.cloverRec.CF[1946]==0&false))) {{
			__CLOVER_65_0.cloverRec.S[6617]++;_token = makeToken(_ttype);
			__CLOVER_65_0.cloverRec.S[6618]++;_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		}__CLOVER_65_0.cloverRec.S[6619]++;_returnToken = _token;
	}
	
	public final void mVIRGULE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {__CLOVER_65_0.cloverRec.M[509]++;
		__CLOVER_65_0.cloverRec.S[6620]++;int _ttype; __CLOVER_65_0.cloverRec.S[6621]++;Token _token=null; __CLOVER_65_0.cloverRec.S[6622]++;int _begin=text.length();
		__CLOVER_65_0.cloverRec.S[6623]++;_ttype = VIRGULE;
		__CLOVER_65_0.cloverRec.S[6624]++;int _saveIndex;
		
		__CLOVER_65_0.cloverRec.S[6625]++;match(",");
		__CLOVER_65_0.cloverRec.S[6626]++;if ( (((_createToken && _token==null && _ttype!=Token.SKIP ) && (++__CLOVER_65_0.cloverRec.CT[1947]!=0|true)) || (++__CLOVER_65_0.cloverRec.CF[1947]==0&false))) {{
			__CLOVER_65_0.cloverRec.S[6627]++;_token = makeToken(_ttype);
			__CLOVER_65_0.cloverRec.S[6628]++;_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		}__CLOVER_65_0.cloverRec.S[6629]++;_returnToken = _token;
	}
	
	public final void mPOINT(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {__CLOVER_65_0.cloverRec.M[510]++;
		__CLOVER_65_0.cloverRec.S[6630]++;int _ttype; __CLOVER_65_0.cloverRec.S[6631]++;Token _token=null; __CLOVER_65_0.cloverRec.S[6632]++;int _begin=text.length();
		__CLOVER_65_0.cloverRec.S[6633]++;_ttype = POINT;
		__CLOVER_65_0.cloverRec.S[6634]++;int _saveIndex;
		
		__CLOVER_65_0.cloverRec.S[6635]++;match(".");
		__CLOVER_65_0.cloverRec.S[6636]++;if ( (((_createToken && _token==null && _ttype!=Token.SKIP ) && (++__CLOVER_65_0.cloverRec.CT[1948]!=0|true)) || (++__CLOVER_65_0.cloverRec.CF[1948]==0&false))) {{
			__CLOVER_65_0.cloverRec.S[6637]++;_token = makeToken(_ttype);
			__CLOVER_65_0.cloverRec.S[6638]++;_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		}__CLOVER_65_0.cloverRec.S[6639]++;_returnToken = _token;
	}
	
	public final void mDOUBLE_POINT(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {__CLOVER_65_0.cloverRec.M[511]++;
		__CLOVER_65_0.cloverRec.S[6640]++;int _ttype; __CLOVER_65_0.cloverRec.S[6641]++;Token _token=null; __CLOVER_65_0.cloverRec.S[6642]++;int _begin=text.length();
		__CLOVER_65_0.cloverRec.S[6643]++;_ttype = DOUBLE_POINT;
		__CLOVER_65_0.cloverRec.S[6644]++;int _saveIndex;
		
		__CLOVER_65_0.cloverRec.S[6645]++;match(":");
		__CLOVER_65_0.cloverRec.S[6646]++;if ( (((_createToken && _token==null && _ttype!=Token.SKIP ) && (++__CLOVER_65_0.cloverRec.CT[1949]!=0|true)) || (++__CLOVER_65_0.cloverRec.CF[1949]==0&false))) {{
			__CLOVER_65_0.cloverRec.S[6647]++;_token = makeToken(_ttype);
			__CLOVER_65_0.cloverRec.S[6648]++;_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		}__CLOVER_65_0.cloverRec.S[6649]++;_returnToken = _token;
	}
	
	public final void mAFFECT(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {__CLOVER_65_0.cloverRec.M[512]++;
		__CLOVER_65_0.cloverRec.S[6650]++;int _ttype; __CLOVER_65_0.cloverRec.S[6651]++;Token _token=null; __CLOVER_65_0.cloverRec.S[6652]++;int _begin=text.length();
		__CLOVER_65_0.cloverRec.S[6653]++;_ttype = AFFECT;
		__CLOVER_65_0.cloverRec.S[6654]++;int _saveIndex;
		
		__CLOVER_65_0.cloverRec.S[6655]++;match(":=");
		__CLOVER_65_0.cloverRec.S[6656]++;if ( (((_createToken && _token==null && _ttype!=Token.SKIP ) && (++__CLOVER_65_0.cloverRec.CT[1950]!=0|true)) || (++__CLOVER_65_0.cloverRec.CF[1950]==0&false))) {{
			__CLOVER_65_0.cloverRec.S[6657]++;_token = makeToken(_ttype);
			__CLOVER_65_0.cloverRec.S[6658]++;_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		}__CLOVER_65_0.cloverRec.S[6659]++;_returnToken = _token;
	}
	
	public final void mTENTATIVE_AFFECT(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {__CLOVER_65_0.cloverRec.M[513]++;
		__CLOVER_65_0.cloverRec.S[6660]++;int _ttype; __CLOVER_65_0.cloverRec.S[6661]++;Token _token=null; __CLOVER_65_0.cloverRec.S[6662]++;int _begin=text.length();
		__CLOVER_65_0.cloverRec.S[6663]++;_ttype = TENTATIVE_AFFECT;
		__CLOVER_65_0.cloverRec.S[6664]++;int _saveIndex;
		
		__CLOVER_65_0.cloverRec.S[6665]++;match("?=");
		__CLOVER_65_0.cloverRec.S[6666]++;if ( (((_createToken && _token==null && _ttype!=Token.SKIP ) && (++__CLOVER_65_0.cloverRec.CT[1951]!=0|true)) || (++__CLOVER_65_0.cloverRec.CF[1951]==0&false))) {{
			__CLOVER_65_0.cloverRec.S[6667]++;_token = makeToken(_ttype);
			__CLOVER_65_0.cloverRec.S[6668]++;_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		}__CLOVER_65_0.cloverRec.S[6669]++;_returnToken = _token;
	}
	
	public final void mPUISS(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {__CLOVER_65_0.cloverRec.M[514]++;
		__CLOVER_65_0.cloverRec.S[6670]++;int _ttype; __CLOVER_65_0.cloverRec.S[6671]++;Token _token=null; __CLOVER_65_0.cloverRec.S[6672]++;int _begin=text.length();
		__CLOVER_65_0.cloverRec.S[6673]++;_ttype = PUISS;
		__CLOVER_65_0.cloverRec.S[6674]++;int _saveIndex;
		
		__CLOVER_65_0.cloverRec.S[6675]++;match("^");
		__CLOVER_65_0.cloverRec.S[6676]++;if ( (((_createToken && _token==null && _ttype!=Token.SKIP ) && (++__CLOVER_65_0.cloverRec.CT[1952]!=0|true)) || (++__CLOVER_65_0.cloverRec.CF[1952]==0&false))) {{
			__CLOVER_65_0.cloverRec.S[6677]++;_token = makeToken(_ttype);
			__CLOVER_65_0.cloverRec.S[6678]++;_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		}__CLOVER_65_0.cloverRec.S[6679]++;_returnToken = _token;
	}
	
	public final void mEXCLAMATION(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {__CLOVER_65_0.cloverRec.M[515]++;
		__CLOVER_65_0.cloverRec.S[6680]++;int _ttype; __CLOVER_65_0.cloverRec.S[6681]++;Token _token=null; __CLOVER_65_0.cloverRec.S[6682]++;int _begin=text.length();
		__CLOVER_65_0.cloverRec.S[6683]++;_ttype = EXCLAMATION;
		__CLOVER_65_0.cloverRec.S[6684]++;int _saveIndex;
		
		__CLOVER_65_0.cloverRec.S[6685]++;match("!");
		__CLOVER_65_0.cloverRec.S[6686]++;if ( (((_createToken && _token==null && _ttype!=Token.SKIP ) && (++__CLOVER_65_0.cloverRec.CT[1953]!=0|true)) || (++__CLOVER_65_0.cloverRec.CF[1953]==0&false))) {{
			__CLOVER_65_0.cloverRec.S[6687]++;_token = makeToken(_ttype);
			__CLOVER_65_0.cloverRec.S[6688]++;_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		}__CLOVER_65_0.cloverRec.S[6689]++;_returnToken = _token;
	}
	
	public final void mACOLADEO(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {__CLOVER_65_0.cloverRec.M[516]++;
		__CLOVER_65_0.cloverRec.S[6690]++;int _ttype; __CLOVER_65_0.cloverRec.S[6691]++;Token _token=null; __CLOVER_65_0.cloverRec.S[6692]++;int _begin=text.length();
		__CLOVER_65_0.cloverRec.S[6693]++;_ttype = ACOLADEO;
		__CLOVER_65_0.cloverRec.S[6694]++;int _saveIndex;
		
		__CLOVER_65_0.cloverRec.S[6695]++;match("{");
		__CLOVER_65_0.cloverRec.S[6696]++;if ( (((_createToken && _token==null && _ttype!=Token.SKIP ) && (++__CLOVER_65_0.cloverRec.CT[1954]!=0|true)) || (++__CLOVER_65_0.cloverRec.CF[1954]==0&false))) {{
			__CLOVER_65_0.cloverRec.S[6697]++;_token = makeToken(_ttype);
			__CLOVER_65_0.cloverRec.S[6698]++;_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		}__CLOVER_65_0.cloverRec.S[6699]++;_returnToken = _token;
	}
	
	public final void mACOLADEF(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {__CLOVER_65_0.cloverRec.M[517]++;
		__CLOVER_65_0.cloverRec.S[6700]++;int _ttype; __CLOVER_65_0.cloverRec.S[6701]++;Token _token=null; __CLOVER_65_0.cloverRec.S[6702]++;int _begin=text.length();
		__CLOVER_65_0.cloverRec.S[6703]++;_ttype = ACOLADEF;
		__CLOVER_65_0.cloverRec.S[6704]++;int _saveIndex;
		
		__CLOVER_65_0.cloverRec.S[6705]++;match("}");
		__CLOVER_65_0.cloverRec.S[6706]++;if ( (((_createToken && _token==null && _ttype!=Token.SKIP ) && (++__CLOVER_65_0.cloverRec.CT[1955]!=0|true)) || (++__CLOVER_65_0.cloverRec.CF[1955]==0&false))) {{
			__CLOVER_65_0.cloverRec.S[6707]++;_token = makeToken(_ttype);
			__CLOVER_65_0.cloverRec.S[6708]++;_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		}__CLOVER_65_0.cloverRec.S[6709]++;_returnToken = _token;
	}
	
	public final void mDOLLARD(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {__CLOVER_65_0.cloverRec.M[518]++;
		__CLOVER_65_0.cloverRec.S[6710]++;int _ttype; __CLOVER_65_0.cloverRec.S[6711]++;Token _token=null; __CLOVER_65_0.cloverRec.S[6712]++;int _begin=text.length();
		__CLOVER_65_0.cloverRec.S[6713]++;_ttype = DOLLARD;
		__CLOVER_65_0.cloverRec.S[6714]++;int _saveIndex;
		
		__CLOVER_65_0.cloverRec.S[6715]++;match("$");
		__CLOVER_65_0.cloverRec.S[6716]++;if ( (((_createToken && _token==null && _ttype!=Token.SKIP ) && (++__CLOVER_65_0.cloverRec.CT[1956]!=0|true)) || (++__CLOVER_65_0.cloverRec.CF[1956]==0&false))) {{
			__CLOVER_65_0.cloverRec.S[6717]++;_token = makeToken(_ttype);
			__CLOVER_65_0.cloverRec.S[6718]++;_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		}__CLOVER_65_0.cloverRec.S[6719]++;_returnToken = _token;
	}
	
	public final void mINT(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {__CLOVER_65_0.cloverRec.M[519]++;
		__CLOVER_65_0.cloverRec.S[6720]++;int _ttype; __CLOVER_65_0.cloverRec.S[6721]++;Token _token=null; __CLOVER_65_0.cloverRec.S[6722]++;int _begin=text.length();
		__CLOVER_65_0.cloverRec.S[6723]++;_ttype = INT;
		__CLOVER_65_0.cloverRec.S[6724]++;int _saveIndex;
		
		__CLOVER_65_0.cloverRec.S[6725]++;mDIGIT(false);
		{
		__CLOVER_65_0.cloverRec.S[6726]++;_loop328:
		do {{
			__CLOVER_65_0.cloverRec.S[6727]++;boolean __CLOVER_bool3=false;switch ( LA(1)) {
			case '0':if (!__CLOVER_bool3) {__CLOVER_65_0.cloverRec.S[6728]++;__CLOVER_bool3=true;}  case '1':if (!__CLOVER_bool3) {__CLOVER_65_0.cloverRec.S[6729]++;__CLOVER_bool3=true;}  case '2':if (!__CLOVER_bool3) {__CLOVER_65_0.cloverRec.S[6730]++;__CLOVER_bool3=true;}  case '3':if (!__CLOVER_bool3) {__CLOVER_65_0.cloverRec.S[6731]++;__CLOVER_bool3=true;}
			case '4':if (!__CLOVER_bool3) {__CLOVER_65_0.cloverRec.S[6732]++;__CLOVER_bool3=true;}  case '5':if (!__CLOVER_bool3) {__CLOVER_65_0.cloverRec.S[6733]++;__CLOVER_bool3=true;}  case '6':if (!__CLOVER_bool3) {__CLOVER_65_0.cloverRec.S[6734]++;__CLOVER_bool3=true;}  case '7':if (!__CLOVER_bool3) {__CLOVER_65_0.cloverRec.S[6735]++;__CLOVER_bool3=true;}
			case '8':if (!__CLOVER_bool3) {__CLOVER_65_0.cloverRec.S[6736]++;__CLOVER_bool3=true;}  case '9':if (!__CLOVER_bool3) {__CLOVER_65_0.cloverRec.S[6737]++;__CLOVER_bool3=true;}
			{
				__CLOVER_65_0.cloverRec.S[6738]++;mDIGIT(false);
				__CLOVER_65_0.cloverRec.S[6739]++;break;
			}
			case '_':if (!__CLOVER_bool3) {__CLOVER_65_0.cloverRec.S[6740]++;__CLOVER_bool3=true;}
			{
				__CLOVER_65_0.cloverRec.S[6741]++;match('_');
				__CLOVER_65_0.cloverRec.S[6742]++;break;
			}
			default:if (!__CLOVER_bool3) {__CLOVER_65_0.cloverRec.S[6743]++;__CLOVER_bool3=true;}
			{
				__CLOVER_65_0.cloverRec.S[6744]++;break _loop328;
			}
			}
		} }while (true);
		}
		{
		__CLOVER_65_0.cloverRec.S[6745]++;if ((((((LA(1)=='.'))&&(LA(2)!='.')) && (++__CLOVER_65_0.cloverRec.CT[1957]!=0|true)) || (++__CLOVER_65_0.cloverRec.CF[1957]==0&false))) {{
			__CLOVER_65_0.cloverRec.S[6746]++;match('.');
			{
			__CLOVER_65_0.cloverRec.S[6747]++;_loop331:
			do {{
				__CLOVER_65_0.cloverRec.S[6748]++;boolean __CLOVER_bool4=false;switch ( LA(1)) {
				case '0':if (!__CLOVER_bool4) {__CLOVER_65_0.cloverRec.S[6749]++;__CLOVER_bool4=true;}  case '1':if (!__CLOVER_bool4) {__CLOVER_65_0.cloverRec.S[6750]++;__CLOVER_bool4=true;}  case '2':if (!__CLOVER_bool4) {__CLOVER_65_0.cloverRec.S[6751]++;__CLOVER_bool4=true;}  case '3':if (!__CLOVER_bool4) {__CLOVER_65_0.cloverRec.S[6752]++;__CLOVER_bool4=true;}
				case '4':if (!__CLOVER_bool4) {__CLOVER_65_0.cloverRec.S[6753]++;__CLOVER_bool4=true;}  case '5':if (!__CLOVER_bool4) {__CLOVER_65_0.cloverRec.S[6754]++;__CLOVER_bool4=true;}  case '6':if (!__CLOVER_bool4) {__CLOVER_65_0.cloverRec.S[6755]++;__CLOVER_bool4=true;}  case '7':if (!__CLOVER_bool4) {__CLOVER_65_0.cloverRec.S[6756]++;__CLOVER_bool4=true;}
				case '8':if (!__CLOVER_bool4) {__CLOVER_65_0.cloverRec.S[6757]++;__CLOVER_bool4=true;}  case '9':if (!__CLOVER_bool4) {__CLOVER_65_0.cloverRec.S[6758]++;__CLOVER_bool4=true;}
				{
					__CLOVER_65_0.cloverRec.S[6759]++;mDIGIT(false);
					__CLOVER_65_0.cloverRec.S[6760]++;break;
				}
				case '_':if (!__CLOVER_bool4) {__CLOVER_65_0.cloverRec.S[6761]++;__CLOVER_bool4=true;}
				{
					__CLOVER_65_0.cloverRec.S[6762]++;match('_');
					__CLOVER_65_0.cloverRec.S[6763]++;break;
				}
				default:if (!__CLOVER_bool4) {__CLOVER_65_0.cloverRec.S[6764]++;__CLOVER_bool4=true;}
				{
					__CLOVER_65_0.cloverRec.S[6765]++;break _loop331;
				}
				}
			} }while (true);
			}
			{
			__CLOVER_65_0.cloverRec.S[6766]++;if (((((LA(1)=='e')) && (++__CLOVER_65_0.cloverRec.CT[1958]!=0|true)) || (++__CLOVER_65_0.cloverRec.CF[1958]==0&false))) {{
				__CLOVER_65_0.cloverRec.S[6767]++;mEXPOSANT(false);
			}
			}else {{
			}
			
			}}
			__CLOVER_65_0.cloverRec.S[6768]++;_ttype=REAL;
		}
		}else {{
		}
		
		}}
		__CLOVER_65_0.cloverRec.S[6769]++;if ( (((_createToken && _token==null && _ttype!=Token.SKIP ) && (++__CLOVER_65_0.cloverRec.CT[1959]!=0|true)) || (++__CLOVER_65_0.cloverRec.CF[1959]==0&false))) {{
			__CLOVER_65_0.cloverRec.S[6770]++;_token = makeToken(_ttype);
			__CLOVER_65_0.cloverRec.S[6771]++;_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		}__CLOVER_65_0.cloverRec.S[6772]++;_returnToken = _token;
	}
	
	protected final void mDIGIT(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {__CLOVER_65_0.cloverRec.M[520]++;
		__CLOVER_65_0.cloverRec.S[6773]++;int _ttype; __CLOVER_65_0.cloverRec.S[6774]++;Token _token=null; __CLOVER_65_0.cloverRec.S[6775]++;int _begin=text.length();
		__CLOVER_65_0.cloverRec.S[6776]++;_ttype = DIGIT;
		__CLOVER_65_0.cloverRec.S[6777]++;int _saveIndex;
		
		__CLOVER_65_0.cloverRec.S[6778]++;matchRange('0','9');
		__CLOVER_65_0.cloverRec.S[6779]++;if ( (((_createToken && _token==null && _ttype!=Token.SKIP ) && (++__CLOVER_65_0.cloverRec.CT[1960]!=0|true)) || (++__CLOVER_65_0.cloverRec.CF[1960]==0&false))) {{
			__CLOVER_65_0.cloverRec.S[6780]++;_token = makeToken(_ttype);
			__CLOVER_65_0.cloverRec.S[6781]++;_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		}__CLOVER_65_0.cloverRec.S[6782]++;_returnToken = _token;
	}
	
	protected final void mEXPOSANT(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {__CLOVER_65_0.cloverRec.M[521]++;
		__CLOVER_65_0.cloverRec.S[6783]++;int _ttype; __CLOVER_65_0.cloverRec.S[6784]++;Token _token=null; __CLOVER_65_0.cloverRec.S[6785]++;int _begin=text.length();
		__CLOVER_65_0.cloverRec.S[6786]++;_ttype = EXPOSANT;
		__CLOVER_65_0.cloverRec.S[6787]++;int _saveIndex;
		
		__CLOVER_65_0.cloverRec.S[6788]++;match('e');
		{
		__CLOVER_65_0.cloverRec.S[6789]++;boolean __CLOVER_bool5=false;switch ( LA(1)) {
		case '+':if (!__CLOVER_bool5) {__CLOVER_65_0.cloverRec.S[6790]++;__CLOVER_bool5=true;}
		{
			__CLOVER_65_0.cloverRec.S[6791]++;match('+');
			__CLOVER_65_0.cloverRec.S[6792]++;break;
		}
		case '-':if (!__CLOVER_bool5) {__CLOVER_65_0.cloverRec.S[6793]++;__CLOVER_bool5=true;}
		{
			__CLOVER_65_0.cloverRec.S[6794]++;match('-');
			__CLOVER_65_0.cloverRec.S[6795]++;break;
		}
		case '0':if (!__CLOVER_bool5) {__CLOVER_65_0.cloverRec.S[6796]++;__CLOVER_bool5=true;}  case '1':if (!__CLOVER_bool5) {__CLOVER_65_0.cloverRec.S[6797]++;__CLOVER_bool5=true;}  case '2':if (!__CLOVER_bool5) {__CLOVER_65_0.cloverRec.S[6798]++;__CLOVER_bool5=true;}  case '3':if (!__CLOVER_bool5) {__CLOVER_65_0.cloverRec.S[6799]++;__CLOVER_bool5=true;}
		case '4':if (!__CLOVER_bool5) {__CLOVER_65_0.cloverRec.S[6800]++;__CLOVER_bool5=true;}  case '5':if (!__CLOVER_bool5) {__CLOVER_65_0.cloverRec.S[6801]++;__CLOVER_bool5=true;}  case '6':if (!__CLOVER_bool5) {__CLOVER_65_0.cloverRec.S[6802]++;__CLOVER_bool5=true;}  case '7':if (!__CLOVER_bool5) {__CLOVER_65_0.cloverRec.S[6803]++;__CLOVER_bool5=true;}
		case '8':if (!__CLOVER_bool5) {__CLOVER_65_0.cloverRec.S[6804]++;__CLOVER_bool5=true;}  case '9':if (!__CLOVER_bool5) {__CLOVER_65_0.cloverRec.S[6805]++;__CLOVER_bool5=true;}  case '_':if (!__CLOVER_bool5) {__CLOVER_65_0.cloverRec.S[6806]++;__CLOVER_bool5=true;}
		{
			__CLOVER_65_0.cloverRec.S[6807]++;break;
		}
		default:if (!__CLOVER_bool5) {__CLOVER_65_0.cloverRec.S[6808]++;__CLOVER_bool5=true;}
		{
			__CLOVER_65_0.cloverRec.S[6809]++;throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());
		}
		}
		}
		{
		__CLOVER_65_0.cloverRec.S[6810]++;int _cnt362=0;
		__CLOVER_65_0.cloverRec.S[6811]++;_loop362:
		do {{
			__CLOVER_65_0.cloverRec.S[6812]++;boolean __CLOVER_bool6=false;switch ( LA(1)) {
			case '0':if (!__CLOVER_bool6) {__CLOVER_65_0.cloverRec.S[6813]++;__CLOVER_bool6=true;}  case '1':if (!__CLOVER_bool6) {__CLOVER_65_0.cloverRec.S[6814]++;__CLOVER_bool6=true;}  case '2':if (!__CLOVER_bool6) {__CLOVER_65_0.cloverRec.S[6815]++;__CLOVER_bool6=true;}  case '3':if (!__CLOVER_bool6) {__CLOVER_65_0.cloverRec.S[6816]++;__CLOVER_bool6=true;}
			case '4':if (!__CLOVER_bool6) {__CLOVER_65_0.cloverRec.S[6817]++;__CLOVER_bool6=true;}  case '5':if (!__CLOVER_bool6) {__CLOVER_65_0.cloverRec.S[6818]++;__CLOVER_bool6=true;}  case '6':if (!__CLOVER_bool6) {__CLOVER_65_0.cloverRec.S[6819]++;__CLOVER_bool6=true;}  case '7':if (!__CLOVER_bool6) {__CLOVER_65_0.cloverRec.S[6820]++;__CLOVER_bool6=true;}
			case '8':if (!__CLOVER_bool6) {__CLOVER_65_0.cloverRec.S[6821]++;__CLOVER_bool6=true;}  case '9':if (!__CLOVER_bool6) {__CLOVER_65_0.cloverRec.S[6822]++;__CLOVER_bool6=true;}
			{
				__CLOVER_65_0.cloverRec.S[6823]++;mDIGIT(false);
				__CLOVER_65_0.cloverRec.S[6824]++;break;
			}
			case '_':if (!__CLOVER_bool6) {__CLOVER_65_0.cloverRec.S[6825]++;__CLOVER_bool6=true;}
			{
				__CLOVER_65_0.cloverRec.S[6826]++;match('_');
				__CLOVER_65_0.cloverRec.S[6827]++;break;
			}
			default:if (!__CLOVER_bool6) {__CLOVER_65_0.cloverRec.S[6828]++;__CLOVER_bool6=true;}
			{
				__CLOVER_65_0.cloverRec.S[6829]++;if ( (((_cnt362>=1 ) && (++__CLOVER_65_0.cloverRec.CT[1961]!=0|true)) || (++__CLOVER_65_0.cloverRec.CF[1961]==0&false))) {{ __CLOVER_65_0.cloverRec.S[6830]++;break _loop362; } }else {{__CLOVER_65_0.cloverRec.S[6831]++;throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());}
			}}
			}
			__CLOVER_65_0.cloverRec.S[6832]++;_cnt362++;
		} }while (true);
		}
		__CLOVER_65_0.cloverRec.S[6833]++;if ( (((_createToken && _token==null && _ttype!=Token.SKIP ) && (++__CLOVER_65_0.cloverRec.CT[1962]!=0|true)) || (++__CLOVER_65_0.cloverRec.CF[1962]==0&false))) {{
			__CLOVER_65_0.cloverRec.S[6834]++;_token = makeToken(_ttype);
			__CLOVER_65_0.cloverRec.S[6835]++;_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		}__CLOVER_65_0.cloverRec.S[6836]++;_returnToken = _token;
	}
	
	public final void mREAL(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {__CLOVER_65_0.cloverRec.M[522]++;
		__CLOVER_65_0.cloverRec.S[6837]++;int _ttype; __CLOVER_65_0.cloverRec.S[6838]++;Token _token=null; __CLOVER_65_0.cloverRec.S[6839]++;int _begin=text.length();
		__CLOVER_65_0.cloverRec.S[6840]++;_ttype = REAL;
		__CLOVER_65_0.cloverRec.S[6841]++;int _saveIndex;
		
		__CLOVER_65_0.cloverRec.S[6842]++;if ((((!(LA(2)!='.')) && (++__CLOVER_65_0.cloverRec.CT[1963]!=0|true)) || (++__CLOVER_65_0.cloverRec.CF[1963]==0&false)))
		  {__CLOVER_65_0.cloverRec.S[6843]++;throw new SemanticException("LA(2)!='.'");
		}__CLOVER_65_0.cloverRec.S[6844]++;match('.');
		{
		__CLOVER_65_0.cloverRec.S[6845]++;int _cnt335=0;
		__CLOVER_65_0.cloverRec.S[6846]++;_loop335:
		do {{
			__CLOVER_65_0.cloverRec.S[6847]++;if ((((((LA(1) >= '0' && LA(1) <= '9'))) && (++__CLOVER_65_0.cloverRec.CT[1964]!=0|true)) || (++__CLOVER_65_0.cloverRec.CF[1964]==0&false))) {{
				__CLOVER_65_0.cloverRec.S[6848]++;mDIGIT(false);
			}
			}else {{
				__CLOVER_65_0.cloverRec.S[6849]++;if ( (((_cnt335>=1 ) && (++__CLOVER_65_0.cloverRec.CT[1965]!=0|true)) || (++__CLOVER_65_0.cloverRec.CF[1965]==0&false))) {{ __CLOVER_65_0.cloverRec.S[6850]++;break _loop335; } }else {{__CLOVER_65_0.cloverRec.S[6851]++;throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());}
			}}
			
			}__CLOVER_65_0.cloverRec.S[6852]++;_cnt335++;
		} }while (true);
		}
		{
		__CLOVER_65_0.cloverRec.S[6853]++;if (((((LA(1)=='e')) && (++__CLOVER_65_0.cloverRec.CT[1966]!=0|true)) || (++__CLOVER_65_0.cloverRec.CF[1966]==0&false))) {{
			__CLOVER_65_0.cloverRec.S[6854]++;mEXPOSANT(false);
		}
		}else {{
		}
		
		}}
		__CLOVER_65_0.cloverRec.S[6855]++;if ( (((_createToken && _token==null && _ttype!=Token.SKIP ) && (++__CLOVER_65_0.cloverRec.CT[1967]!=0|true)) || (++__CLOVER_65_0.cloverRec.CF[1967]==0&false))) {{
			__CLOVER_65_0.cloverRec.S[6856]++;_token = makeToken(_ttype);
			__CLOVER_65_0.cloverRec.S[6857]++;_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		}__CLOVER_65_0.cloverRec.S[6858]++;_returnToken = _token;
	}
	
	public final void mID(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {__CLOVER_65_0.cloverRec.M[523]++;
		__CLOVER_65_0.cloverRec.S[6859]++;int _ttype; __CLOVER_65_0.cloverRec.S[6860]++;Token _token=null; __CLOVER_65_0.cloverRec.S[6861]++;int _begin=text.length();
		__CLOVER_65_0.cloverRec.S[6862]++;_ttype = ID;
		__CLOVER_65_0.cloverRec.S[6863]++;int _saveIndex;
		
		{
		__CLOVER_65_0.cloverRec.S[6864]++;boolean __CLOVER_bool7=false;switch ( LA(1)) {
		case 'a':if (!__CLOVER_bool7) {__CLOVER_65_0.cloverRec.S[6865]++;__CLOVER_bool7=true;}  case 'b':if (!__CLOVER_bool7) {__CLOVER_65_0.cloverRec.S[6866]++;__CLOVER_bool7=true;}  case 'c':if (!__CLOVER_bool7) {__CLOVER_65_0.cloverRec.S[6867]++;__CLOVER_bool7=true;}  case 'd':if (!__CLOVER_bool7) {__CLOVER_65_0.cloverRec.S[6868]++;__CLOVER_bool7=true;}
		case 'e':if (!__CLOVER_bool7) {__CLOVER_65_0.cloverRec.S[6869]++;__CLOVER_bool7=true;}  case 'f':if (!__CLOVER_bool7) {__CLOVER_65_0.cloverRec.S[6870]++;__CLOVER_bool7=true;}  case 'g':if (!__CLOVER_bool7) {__CLOVER_65_0.cloverRec.S[6871]++;__CLOVER_bool7=true;}  case 'h':if (!__CLOVER_bool7) {__CLOVER_65_0.cloverRec.S[6872]++;__CLOVER_bool7=true;}
		case 'i':if (!__CLOVER_bool7) {__CLOVER_65_0.cloverRec.S[6873]++;__CLOVER_bool7=true;}  case 'j':if (!__CLOVER_bool7) {__CLOVER_65_0.cloverRec.S[6874]++;__CLOVER_bool7=true;}  case 'k':if (!__CLOVER_bool7) {__CLOVER_65_0.cloverRec.S[6875]++;__CLOVER_bool7=true;}  case 'l':if (!__CLOVER_bool7) {__CLOVER_65_0.cloverRec.S[6876]++;__CLOVER_bool7=true;}
		case 'm':if (!__CLOVER_bool7) {__CLOVER_65_0.cloverRec.S[6877]++;__CLOVER_bool7=true;}  case 'n':if (!__CLOVER_bool7) {__CLOVER_65_0.cloverRec.S[6878]++;__CLOVER_bool7=true;}  case 'o':if (!__CLOVER_bool7) {__CLOVER_65_0.cloverRec.S[6879]++;__CLOVER_bool7=true;}  case 'p':if (!__CLOVER_bool7) {__CLOVER_65_0.cloverRec.S[6880]++;__CLOVER_bool7=true;}
		case 'q':if (!__CLOVER_bool7) {__CLOVER_65_0.cloverRec.S[6881]++;__CLOVER_bool7=true;}  case 'r':if (!__CLOVER_bool7) {__CLOVER_65_0.cloverRec.S[6882]++;__CLOVER_bool7=true;}  case 's':if (!__CLOVER_bool7) {__CLOVER_65_0.cloverRec.S[6883]++;__CLOVER_bool7=true;}  case 't':if (!__CLOVER_bool7) {__CLOVER_65_0.cloverRec.S[6884]++;__CLOVER_bool7=true;}
		case 'u':if (!__CLOVER_bool7) {__CLOVER_65_0.cloverRec.S[6885]++;__CLOVER_bool7=true;}  case 'v':if (!__CLOVER_bool7) {__CLOVER_65_0.cloverRec.S[6886]++;__CLOVER_bool7=true;}  case 'w':if (!__CLOVER_bool7) {__CLOVER_65_0.cloverRec.S[6887]++;__CLOVER_bool7=true;}  case 'x':if (!__CLOVER_bool7) {__CLOVER_65_0.cloverRec.S[6888]++;__CLOVER_bool7=true;}
		case 'y':if (!__CLOVER_bool7) {__CLOVER_65_0.cloverRec.S[6889]++;__CLOVER_bool7=true;}  case 'z':if (!__CLOVER_bool7) {__CLOVER_65_0.cloverRec.S[6890]++;__CLOVER_bool7=true;}
		{
			__CLOVER_65_0.cloverRec.S[6891]++;matchRange('a','z');
			__CLOVER_65_0.cloverRec.S[6892]++;break;
		}
		case 'A':if (!__CLOVER_bool7) {__CLOVER_65_0.cloverRec.S[6893]++;__CLOVER_bool7=true;}  case 'B':if (!__CLOVER_bool7) {__CLOVER_65_0.cloverRec.S[6894]++;__CLOVER_bool7=true;}  case 'C':if (!__CLOVER_bool7) {__CLOVER_65_0.cloverRec.S[6895]++;__CLOVER_bool7=true;}  case 'D':if (!__CLOVER_bool7) {__CLOVER_65_0.cloverRec.S[6896]++;__CLOVER_bool7=true;}
		case 'E':if (!__CLOVER_bool7) {__CLOVER_65_0.cloverRec.S[6897]++;__CLOVER_bool7=true;}  case 'F':if (!__CLOVER_bool7) {__CLOVER_65_0.cloverRec.S[6898]++;__CLOVER_bool7=true;}  case 'G':if (!__CLOVER_bool7) {__CLOVER_65_0.cloverRec.S[6899]++;__CLOVER_bool7=true;}  case 'H':if (!__CLOVER_bool7) {__CLOVER_65_0.cloverRec.S[6900]++;__CLOVER_bool7=true;}
		case 'I':if (!__CLOVER_bool7) {__CLOVER_65_0.cloverRec.S[6901]++;__CLOVER_bool7=true;}  case 'J':if (!__CLOVER_bool7) {__CLOVER_65_0.cloverRec.S[6902]++;__CLOVER_bool7=true;}  case 'K':if (!__CLOVER_bool7) {__CLOVER_65_0.cloverRec.S[6903]++;__CLOVER_bool7=true;}  case 'L':if (!__CLOVER_bool7) {__CLOVER_65_0.cloverRec.S[6904]++;__CLOVER_bool7=true;}
		case 'M':if (!__CLOVER_bool7) {__CLOVER_65_0.cloverRec.S[6905]++;__CLOVER_bool7=true;}  case 'N':if (!__CLOVER_bool7) {__CLOVER_65_0.cloverRec.S[6906]++;__CLOVER_bool7=true;}  case 'O':if (!__CLOVER_bool7) {__CLOVER_65_0.cloverRec.S[6907]++;__CLOVER_bool7=true;}  case 'P':if (!__CLOVER_bool7) {__CLOVER_65_0.cloverRec.S[6908]++;__CLOVER_bool7=true;}
		case 'Q':if (!__CLOVER_bool7) {__CLOVER_65_0.cloverRec.S[6909]++;__CLOVER_bool7=true;}  case 'R':if (!__CLOVER_bool7) {__CLOVER_65_0.cloverRec.S[6910]++;__CLOVER_bool7=true;}  case 'S':if (!__CLOVER_bool7) {__CLOVER_65_0.cloverRec.S[6911]++;__CLOVER_bool7=true;}  case 'T':if (!__CLOVER_bool7) {__CLOVER_65_0.cloverRec.S[6912]++;__CLOVER_bool7=true;}
		case 'U':if (!__CLOVER_bool7) {__CLOVER_65_0.cloverRec.S[6913]++;__CLOVER_bool7=true;}  case 'V':if (!__CLOVER_bool7) {__CLOVER_65_0.cloverRec.S[6914]++;__CLOVER_bool7=true;}  case 'W':if (!__CLOVER_bool7) {__CLOVER_65_0.cloverRec.S[6915]++;__CLOVER_bool7=true;}  case 'X':if (!__CLOVER_bool7) {__CLOVER_65_0.cloverRec.S[6916]++;__CLOVER_bool7=true;}
		case 'Y':if (!__CLOVER_bool7) {__CLOVER_65_0.cloverRec.S[6917]++;__CLOVER_bool7=true;}  case 'Z':if (!__CLOVER_bool7) {__CLOVER_65_0.cloverRec.S[6918]++;__CLOVER_bool7=true;}
		{
			__CLOVER_65_0.cloverRec.S[6919]++;matchRange('A','Z');
			__CLOVER_65_0.cloverRec.S[6920]++;break;
		}
		case '_':if (!__CLOVER_bool7) {__CLOVER_65_0.cloverRec.S[6921]++;__CLOVER_bool7=true;}
		{
			__CLOVER_65_0.cloverRec.S[6922]++;match('_');
			__CLOVER_65_0.cloverRec.S[6923]++;break;
		}
		default:if (!__CLOVER_bool7) {__CLOVER_65_0.cloverRec.S[6924]++;__CLOVER_bool7=true;}
		{
			__CLOVER_65_0.cloverRec.S[6925]++;throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());
		}
		}
		}
		{
		__CLOVER_65_0.cloverRec.S[6926]++;_loop340:
		do {{
			__CLOVER_65_0.cloverRec.S[6927]++;boolean __CLOVER_bool8=false;switch ( LA(1)) {
			case 'a':if (!__CLOVER_bool8) {__CLOVER_65_0.cloverRec.S[6928]++;__CLOVER_bool8=true;}  case 'b':if (!__CLOVER_bool8) {__CLOVER_65_0.cloverRec.S[6929]++;__CLOVER_bool8=true;}  case 'c':if (!__CLOVER_bool8) {__CLOVER_65_0.cloverRec.S[6930]++;__CLOVER_bool8=true;}  case 'd':if (!__CLOVER_bool8) {__CLOVER_65_0.cloverRec.S[6931]++;__CLOVER_bool8=true;}
			case 'e':if (!__CLOVER_bool8) {__CLOVER_65_0.cloverRec.S[6932]++;__CLOVER_bool8=true;}  case 'f':if (!__CLOVER_bool8) {__CLOVER_65_0.cloverRec.S[6933]++;__CLOVER_bool8=true;}  case 'g':if (!__CLOVER_bool8) {__CLOVER_65_0.cloverRec.S[6934]++;__CLOVER_bool8=true;}  case 'h':if (!__CLOVER_bool8) {__CLOVER_65_0.cloverRec.S[6935]++;__CLOVER_bool8=true;}
			case 'i':if (!__CLOVER_bool8) {__CLOVER_65_0.cloverRec.S[6936]++;__CLOVER_bool8=true;}  case 'j':if (!__CLOVER_bool8) {__CLOVER_65_0.cloverRec.S[6937]++;__CLOVER_bool8=true;}  case 'k':if (!__CLOVER_bool8) {__CLOVER_65_0.cloverRec.S[6938]++;__CLOVER_bool8=true;}  case 'l':if (!__CLOVER_bool8) {__CLOVER_65_0.cloverRec.S[6939]++;__CLOVER_bool8=true;}
			case 'm':if (!__CLOVER_bool8) {__CLOVER_65_0.cloverRec.S[6940]++;__CLOVER_bool8=true;}  case 'n':if (!__CLOVER_bool8) {__CLOVER_65_0.cloverRec.S[6941]++;__CLOVER_bool8=true;}  case 'o':if (!__CLOVER_bool8) {__CLOVER_65_0.cloverRec.S[6942]++;__CLOVER_bool8=true;}  case 'p':if (!__CLOVER_bool8) {__CLOVER_65_0.cloverRec.S[6943]++;__CLOVER_bool8=true;}
			case 'q':if (!__CLOVER_bool8) {__CLOVER_65_0.cloverRec.S[6944]++;__CLOVER_bool8=true;}  case 'r':if (!__CLOVER_bool8) {__CLOVER_65_0.cloverRec.S[6945]++;__CLOVER_bool8=true;}  case 's':if (!__CLOVER_bool8) {__CLOVER_65_0.cloverRec.S[6946]++;__CLOVER_bool8=true;}  case 't':if (!__CLOVER_bool8) {__CLOVER_65_0.cloverRec.S[6947]++;__CLOVER_bool8=true;}
			case 'u':if (!__CLOVER_bool8) {__CLOVER_65_0.cloverRec.S[6948]++;__CLOVER_bool8=true;}  case 'v':if (!__CLOVER_bool8) {__CLOVER_65_0.cloverRec.S[6949]++;__CLOVER_bool8=true;}  case 'w':if (!__CLOVER_bool8) {__CLOVER_65_0.cloverRec.S[6950]++;__CLOVER_bool8=true;}  case 'x':if (!__CLOVER_bool8) {__CLOVER_65_0.cloverRec.S[6951]++;__CLOVER_bool8=true;}
			case 'y':if (!__CLOVER_bool8) {__CLOVER_65_0.cloverRec.S[6952]++;__CLOVER_bool8=true;}  case 'z':if (!__CLOVER_bool8) {__CLOVER_65_0.cloverRec.S[6953]++;__CLOVER_bool8=true;}
			{
				__CLOVER_65_0.cloverRec.S[6954]++;matchRange('a','z');
				__CLOVER_65_0.cloverRec.S[6955]++;break;
			}
			case 'A':if (!__CLOVER_bool8) {__CLOVER_65_0.cloverRec.S[6956]++;__CLOVER_bool8=true;}  case 'B':if (!__CLOVER_bool8) {__CLOVER_65_0.cloverRec.S[6957]++;__CLOVER_bool8=true;}  case 'C':if (!__CLOVER_bool8) {__CLOVER_65_0.cloverRec.S[6958]++;__CLOVER_bool8=true;}  case 'D':if (!__CLOVER_bool8) {__CLOVER_65_0.cloverRec.S[6959]++;__CLOVER_bool8=true;}
			case 'E':if (!__CLOVER_bool8) {__CLOVER_65_0.cloverRec.S[6960]++;__CLOVER_bool8=true;}  case 'F':if (!__CLOVER_bool8) {__CLOVER_65_0.cloverRec.S[6961]++;__CLOVER_bool8=true;}  case 'G':if (!__CLOVER_bool8) {__CLOVER_65_0.cloverRec.S[6962]++;__CLOVER_bool8=true;}  case 'H':if (!__CLOVER_bool8) {__CLOVER_65_0.cloverRec.S[6963]++;__CLOVER_bool8=true;}
			case 'I':if (!__CLOVER_bool8) {__CLOVER_65_0.cloverRec.S[6964]++;__CLOVER_bool8=true;}  case 'J':if (!__CLOVER_bool8) {__CLOVER_65_0.cloverRec.S[6965]++;__CLOVER_bool8=true;}  case 'K':if (!__CLOVER_bool8) {__CLOVER_65_0.cloverRec.S[6966]++;__CLOVER_bool8=true;}  case 'L':if (!__CLOVER_bool8) {__CLOVER_65_0.cloverRec.S[6967]++;__CLOVER_bool8=true;}
			case 'M':if (!__CLOVER_bool8) {__CLOVER_65_0.cloverRec.S[6968]++;__CLOVER_bool8=true;}  case 'N':if (!__CLOVER_bool8) {__CLOVER_65_0.cloverRec.S[6969]++;__CLOVER_bool8=true;}  case 'O':if (!__CLOVER_bool8) {__CLOVER_65_0.cloverRec.S[6970]++;__CLOVER_bool8=true;}  case 'P':if (!__CLOVER_bool8) {__CLOVER_65_0.cloverRec.S[6971]++;__CLOVER_bool8=true;}
			case 'Q':if (!__CLOVER_bool8) {__CLOVER_65_0.cloverRec.S[6972]++;__CLOVER_bool8=true;}  case 'R':if (!__CLOVER_bool8) {__CLOVER_65_0.cloverRec.S[6973]++;__CLOVER_bool8=true;}  case 'S':if (!__CLOVER_bool8) {__CLOVER_65_0.cloverRec.S[6974]++;__CLOVER_bool8=true;}  case 'T':if (!__CLOVER_bool8) {__CLOVER_65_0.cloverRec.S[6975]++;__CLOVER_bool8=true;}
			case 'U':if (!__CLOVER_bool8) {__CLOVER_65_0.cloverRec.S[6976]++;__CLOVER_bool8=true;}  case 'V':if (!__CLOVER_bool8) {__CLOVER_65_0.cloverRec.S[6977]++;__CLOVER_bool8=true;}  case 'W':if (!__CLOVER_bool8) {__CLOVER_65_0.cloverRec.S[6978]++;__CLOVER_bool8=true;}  case 'X':if (!__CLOVER_bool8) {__CLOVER_65_0.cloverRec.S[6979]++;__CLOVER_bool8=true;}
			case 'Y':if (!__CLOVER_bool8) {__CLOVER_65_0.cloverRec.S[6980]++;__CLOVER_bool8=true;}  case 'Z':if (!__CLOVER_bool8) {__CLOVER_65_0.cloverRec.S[6981]++;__CLOVER_bool8=true;}
			{
				__CLOVER_65_0.cloverRec.S[6982]++;matchRange('A','Z');
				__CLOVER_65_0.cloverRec.S[6983]++;break;
			}
			case '_':if (!__CLOVER_bool8) {__CLOVER_65_0.cloverRec.S[6984]++;__CLOVER_bool8=true;}
			{
				__CLOVER_65_0.cloverRec.S[6985]++;match('_');
				__CLOVER_65_0.cloverRec.S[6986]++;break;
			}
			case '0':if (!__CLOVER_bool8) {__CLOVER_65_0.cloverRec.S[6987]++;__CLOVER_bool8=true;}  case '1':if (!__CLOVER_bool8) {__CLOVER_65_0.cloverRec.S[6988]++;__CLOVER_bool8=true;}  case '2':if (!__CLOVER_bool8) {__CLOVER_65_0.cloverRec.S[6989]++;__CLOVER_bool8=true;}  case '3':if (!__CLOVER_bool8) {__CLOVER_65_0.cloverRec.S[6990]++;__CLOVER_bool8=true;}
			case '4':if (!__CLOVER_bool8) {__CLOVER_65_0.cloverRec.S[6991]++;__CLOVER_bool8=true;}  case '5':if (!__CLOVER_bool8) {__CLOVER_65_0.cloverRec.S[6992]++;__CLOVER_bool8=true;}  case '6':if (!__CLOVER_bool8) {__CLOVER_65_0.cloverRec.S[6993]++;__CLOVER_bool8=true;}  case '7':if (!__CLOVER_bool8) {__CLOVER_65_0.cloverRec.S[6994]++;__CLOVER_bool8=true;}
			case '8':if (!__CLOVER_bool8) {__CLOVER_65_0.cloverRec.S[6995]++;__CLOVER_bool8=true;}  case '9':if (!__CLOVER_bool8) {__CLOVER_65_0.cloverRec.S[6996]++;__CLOVER_bool8=true;}
			{
				__CLOVER_65_0.cloverRec.S[6997]++;mDIGIT(false);
				__CLOVER_65_0.cloverRec.S[6998]++;break;
			}
			default:if (!__CLOVER_bool8) {__CLOVER_65_0.cloverRec.S[6999]++;__CLOVER_bool8=true;}
			{
				__CLOVER_65_0.cloverRec.S[7000]++;break _loop340;
			}
			}
		} }while (true);
		}
		/*System.out.println("mot trouve:"+getText());*/
		__CLOVER_65_0.cloverRec.S[7001]++;_ttype = testLiteralsTable(_ttype);
		__CLOVER_65_0.cloverRec.S[7002]++;if ( (((_createToken && _token==null && _ttype!=Token.SKIP ) && (++__CLOVER_65_0.cloverRec.CT[1968]!=0|true)) || (++__CLOVER_65_0.cloverRec.CF[1968]==0&false))) {{
			__CLOVER_65_0.cloverRec.S[7003]++;_token = makeToken(_ttype);
			__CLOVER_65_0.cloverRec.S[7004]++;_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		}__CLOVER_65_0.cloverRec.S[7005]++;_returnToken = _token;
	}
	
	public final void mSTRING(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {__CLOVER_65_0.cloverRec.M[524]++;
		__CLOVER_65_0.cloverRec.S[7006]++;int _ttype; __CLOVER_65_0.cloverRec.S[7007]++;Token _token=null; __CLOVER_65_0.cloverRec.S[7008]++;int _begin=text.length();
		__CLOVER_65_0.cloverRec.S[7009]++;_ttype = STRING;
		__CLOVER_65_0.cloverRec.S[7010]++;int _saveIndex;
		
		__CLOVER_65_0.cloverRec.S[7011]++;String s;
		
		
		{
		__CLOVER_65_0.cloverRec.S[7012]++;boolean __CLOVER_bool9=false;switch ( LA(1)) {
		case '"':if (!__CLOVER_bool9) {__CLOVER_65_0.cloverRec.S[7013]++;__CLOVER_bool9=true;}
		{
			__CLOVER_65_0.cloverRec.S[7014]++;match("\"");
			__CLOVER_65_0.cloverRec.S[7015]++;break;
		}
		case '%':if (!__CLOVER_bool9) {__CLOVER_65_0.cloverRec.S[7016]++;__CLOVER_bool9=true;}
		{
			__CLOVER_65_0.cloverRec.S[7017]++;match("%");
			__CLOVER_65_0.cloverRec.S[7018]++;break;
		}
		default:if (!__CLOVER_bool9) {__CLOVER_65_0.cloverRec.S[7019]++;__CLOVER_bool9=true;}
		{
			__CLOVER_65_0.cloverRec.S[7020]++;throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());
		}
		}
		}
		{
		__CLOVER_65_0.cloverRec.S[7021]++;int _cnt347=0;
		__CLOVER_65_0.cloverRec.S[7022]++;_loop347:
		do {{
			__CLOVER_65_0.cloverRec.S[7023]++;if (((((LA(1)=='%') && (_tokenSet_1.member(LA(2)))) && (++__CLOVER_65_0.cloverRec.CT[1969]!=0|true)) || (++__CLOVER_65_0.cloverRec.CF[1969]==0&false))) {{
				{
				__CLOVER_65_0.cloverRec.S[7024]++;match('%');
				{
				__CLOVER_65_0.cloverRec.S[7025]++;match(_tokenSet_1);
				}
				}
			}
			}else {__CLOVER_65_0.cloverRec.S[7026]++;if (((((_tokenSet_2.member(LA(1)))) && (++__CLOVER_65_0.cloverRec.CT[1970]!=0|true)) || (++__CLOVER_65_0.cloverRec.CF[1970]==0&false))) {{
				{
				__CLOVER_65_0.cloverRec.S[7027]++;match(_tokenSet_2);
				}
			}
			}else {{
				__CLOVER_65_0.cloverRec.S[7028]++;if ( (((_cnt347>=1 ) && (++__CLOVER_65_0.cloverRec.CT[1971]!=0|true)) || (++__CLOVER_65_0.cloverRec.CF[1971]==0&false))) {{ __CLOVER_65_0.cloverRec.S[7029]++;break _loop347; } }else {{__CLOVER_65_0.cloverRec.S[7030]++;throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());}
			}}
			
			}}__CLOVER_65_0.cloverRec.S[7031]++;_cnt347++;
		} }while (true);
		}
		{
		__CLOVER_65_0.cloverRec.S[7032]++;boolean __CLOVER_bool10=false;switch ( LA(1)) {
		case '"':if (!__CLOVER_bool10) {__CLOVER_65_0.cloverRec.S[7033]++;__CLOVER_bool10=true;}
		{
			__CLOVER_65_0.cloverRec.S[7034]++;match("\"");
			__CLOVER_65_0.cloverRec.S[7035]++;break;
		}
		case '%':if (!__CLOVER_bool10) {__CLOVER_65_0.cloverRec.S[7036]++;__CLOVER_bool10=true;}
		{
			__CLOVER_65_0.cloverRec.S[7037]++;match("%");
			__CLOVER_65_0.cloverRec.S[7038]++;break;
		}
		default:if (!__CLOVER_bool10) {__CLOVER_65_0.cloverRec.S[7039]++;__CLOVER_bool10=true;}
		{
			__CLOVER_65_0.cloverRec.S[7040]++;throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());
		}
		}
		}
		
						//System.out.println("string :"+getText());
						__CLOVER_65_0.cloverRec.S[7041]++;s=getText();
						__CLOVER_65_0.cloverRec.S[7042]++;if((((s.endsWith("%")&&s.startsWith("%")) && (++__CLOVER_65_0.cloverRec.CT[1972]!=0|true)) || (++__CLOVER_65_0.cloverRec.CF[1972]==0&false)))
							{__CLOVER_65_0.cloverRec.S[7043]++;_ttype=STRING3;
						}else {__CLOVER_65_0.cloverRec.S[7044]++;if((((s.endsWith("%")) && (++__CLOVER_65_0.cloverRec.CT[1973]!=0|true)) || (++__CLOVER_65_0.cloverRec.CF[1973]==0&false)))
							{__CLOVER_65_0.cloverRec.S[7045]++;_ttype=STRING2;
						}else {__CLOVER_65_0.cloverRec.S[7046]++;if((((s.startsWith("%")) && (++__CLOVER_65_0.cloverRec.CT[1974]!=0|true)) || (++__CLOVER_65_0.cloverRec.CF[1974]==0&false)))
							{__CLOVER_65_0.cloverRec.S[7047]++;_ttype=STRING4;
					
		}}}__CLOVER_65_0.cloverRec.S[7048]++;if ( (((_createToken && _token==null && _ttype!=Token.SKIP ) && (++__CLOVER_65_0.cloverRec.CT[1975]!=0|true)) || (++__CLOVER_65_0.cloverRec.CF[1975]==0&false))) {{
			__CLOVER_65_0.cloverRec.S[7049]++;_token = makeToken(_ttype);
			__CLOVER_65_0.cloverRec.S[7050]++;_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		}__CLOVER_65_0.cloverRec.S[7051]++;_returnToken = _token;
	}
	
	public final void mCHAR(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {__CLOVER_65_0.cloverRec.M[525]++;
		__CLOVER_65_0.cloverRec.S[7052]++;int _ttype; __CLOVER_65_0.cloverRec.S[7053]++;Token _token=null; __CLOVER_65_0.cloverRec.S[7054]++;int _begin=text.length();
		__CLOVER_65_0.cloverRec.S[7055]++;_ttype = CHAR;
		__CLOVER_65_0.cloverRec.S[7056]++;int _saveIndex;
		
		__CLOVER_65_0.cloverRec.S[7057]++;match("'");
		{
		__CLOVER_65_0.cloverRec.S[7058]++;int _cnt353=0;
		__CLOVER_65_0.cloverRec.S[7059]++;_loop353:
		do {{
			__CLOVER_65_0.cloverRec.S[7060]++;boolean __CLOVER_bool11=false;switch ( LA(1)) {
			case '%':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7061]++;__CLOVER_bool11=true;}
			{
				{
				__CLOVER_65_0.cloverRec.S[7062]++;match('%');
				__CLOVER_65_0.cloverRec.S[7063]++;matchNot(EOF_CHAR);
				}
				__CLOVER_65_0.cloverRec.S[7064]++;break;
			}
			case '\t':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7065]++;__CLOVER_bool11=true;}  case '\n':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7066]++;__CLOVER_bool11=true;}  case '\r':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7067]++;__CLOVER_bool11=true;}  case ' ':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7068]++;__CLOVER_bool11=true;}
			case '!':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7069]++;__CLOVER_bool11=true;}  case '"':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7070]++;__CLOVER_bool11=true;}  case '#':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7071]++;__CLOVER_bool11=true;}  case '$':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7072]++;__CLOVER_bool11=true;}
			case '&':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7073]++;__CLOVER_bool11=true;}  case '(':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7074]++;__CLOVER_bool11=true;}  case ')':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7075]++;__CLOVER_bool11=true;}  case '*':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7076]++;__CLOVER_bool11=true;}
			case '+':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7077]++;__CLOVER_bool11=true;}  case ',':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7078]++;__CLOVER_bool11=true;}  case '-':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7079]++;__CLOVER_bool11=true;}  case '.':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7080]++;__CLOVER_bool11=true;}
			case '/':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7081]++;__CLOVER_bool11=true;}  case '0':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7082]++;__CLOVER_bool11=true;}  case '1':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7083]++;__CLOVER_bool11=true;}  case '2':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7084]++;__CLOVER_bool11=true;}
			case '3':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7085]++;__CLOVER_bool11=true;}  case '4':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7086]++;__CLOVER_bool11=true;}  case '5':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7087]++;__CLOVER_bool11=true;}  case '6':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7088]++;__CLOVER_bool11=true;}
			case '7':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7089]++;__CLOVER_bool11=true;}  case '8':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7090]++;__CLOVER_bool11=true;}  case '9':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7091]++;__CLOVER_bool11=true;}  case ':':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7092]++;__CLOVER_bool11=true;}
			case ';':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7093]++;__CLOVER_bool11=true;}  case '<':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7094]++;__CLOVER_bool11=true;}  case '=':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7095]++;__CLOVER_bool11=true;}  case '>':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7096]++;__CLOVER_bool11=true;}
			case '?':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7097]++;__CLOVER_bool11=true;}  case '@':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7098]++;__CLOVER_bool11=true;}  case 'A':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7099]++;__CLOVER_bool11=true;}  case 'B':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7100]++;__CLOVER_bool11=true;}
			case 'C':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7101]++;__CLOVER_bool11=true;}  case 'D':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7102]++;__CLOVER_bool11=true;}  case 'E':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7103]++;__CLOVER_bool11=true;}  case 'F':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7104]++;__CLOVER_bool11=true;}
			case 'G':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7105]++;__CLOVER_bool11=true;}  case 'H':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7106]++;__CLOVER_bool11=true;}  case 'I':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7107]++;__CLOVER_bool11=true;}  case 'J':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7108]++;__CLOVER_bool11=true;}
			case 'K':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7109]++;__CLOVER_bool11=true;}  case 'L':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7110]++;__CLOVER_bool11=true;}  case 'M':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7111]++;__CLOVER_bool11=true;}  case 'N':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7112]++;__CLOVER_bool11=true;}
			case 'O':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7113]++;__CLOVER_bool11=true;}  case 'P':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7114]++;__CLOVER_bool11=true;}  case 'Q':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7115]++;__CLOVER_bool11=true;}  case 'R':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7116]++;__CLOVER_bool11=true;}
			case 'S':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7117]++;__CLOVER_bool11=true;}  case 'T':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7118]++;__CLOVER_bool11=true;}  case 'U':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7119]++;__CLOVER_bool11=true;}  case 'V':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7120]++;__CLOVER_bool11=true;}
			case 'W':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7121]++;__CLOVER_bool11=true;}  case 'X':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7122]++;__CLOVER_bool11=true;}  case 'Y':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7123]++;__CLOVER_bool11=true;}  case 'Z':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7124]++;__CLOVER_bool11=true;}
			case '[':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7125]++;__CLOVER_bool11=true;}  case '\\':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7126]++;__CLOVER_bool11=true;}  case ']':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7127]++;__CLOVER_bool11=true;}  case '^':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7128]++;__CLOVER_bool11=true;}
			case '_':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7129]++;__CLOVER_bool11=true;}  case '`':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7130]++;__CLOVER_bool11=true;}  case 'a':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7131]++;__CLOVER_bool11=true;}  case 'b':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7132]++;__CLOVER_bool11=true;}
			case 'c':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7133]++;__CLOVER_bool11=true;}  case 'd':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7134]++;__CLOVER_bool11=true;}  case 'e':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7135]++;__CLOVER_bool11=true;}  case 'f':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7136]++;__CLOVER_bool11=true;}
			case 'g':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7137]++;__CLOVER_bool11=true;}  case 'h':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7138]++;__CLOVER_bool11=true;}  case 'i':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7139]++;__CLOVER_bool11=true;}  case 'j':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7140]++;__CLOVER_bool11=true;}
			case 'k':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7141]++;__CLOVER_bool11=true;}  case 'l':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7142]++;__CLOVER_bool11=true;}  case 'm':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7143]++;__CLOVER_bool11=true;}  case 'n':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7144]++;__CLOVER_bool11=true;}
			case 'o':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7145]++;__CLOVER_bool11=true;}  case 'p':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7146]++;__CLOVER_bool11=true;}  case 'q':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7147]++;__CLOVER_bool11=true;}  case 'r':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7148]++;__CLOVER_bool11=true;}
			case 's':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7149]++;__CLOVER_bool11=true;}  case 't':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7150]++;__CLOVER_bool11=true;}  case 'u':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7151]++;__CLOVER_bool11=true;}  case 'v':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7152]++;__CLOVER_bool11=true;}
			case 'w':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7153]++;__CLOVER_bool11=true;}  case 'x':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7154]++;__CLOVER_bool11=true;}  case 'y':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7155]++;__CLOVER_bool11=true;}  case 'z':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7156]++;__CLOVER_bool11=true;}
			case '{':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7157]++;__CLOVER_bool11=true;}  case '|':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7158]++;__CLOVER_bool11=true;}  case '}':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7159]++;__CLOVER_bool11=true;}  case '~':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7160]++;__CLOVER_bool11=true;}
			case '\u00a3':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7161]++;__CLOVER_bool11=true;}  case '\u00a4':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7162]++;__CLOVER_bool11=true;}  case '\u00a7':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7163]++;__CLOVER_bool11=true;}  case '\u00a8':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7164]++;__CLOVER_bool11=true;}
			case '\u00b0':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7165]++;__CLOVER_bool11=true;}  case '\u00b2':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7166]++;__CLOVER_bool11=true;}  case '\u00b5':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7167]++;__CLOVER_bool11=true;}  case '\u00e0':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7168]++;__CLOVER_bool11=true;}
			case '\u00e7':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7169]++;__CLOVER_bool11=true;}  case '\u00e8':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7170]++;__CLOVER_bool11=true;}  case '\u00e9':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7171]++;__CLOVER_bool11=true;}  case '\u00f9':if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7172]++;__CLOVER_bool11=true;}
			{
				{
				__CLOVER_65_0.cloverRec.S[7173]++;match(_tokenSet_3);
				}
				__CLOVER_65_0.cloverRec.S[7174]++;break;
			}
			default:if (!__CLOVER_bool11) {__CLOVER_65_0.cloverRec.S[7175]++;__CLOVER_bool11=true;}
			{
				__CLOVER_65_0.cloverRec.S[7176]++;if ( (((_cnt353>=1 ) && (++__CLOVER_65_0.cloverRec.CT[1976]!=0|true)) || (++__CLOVER_65_0.cloverRec.CF[1976]==0&false))) {{ __CLOVER_65_0.cloverRec.S[7177]++;break _loop353; } }else {{__CLOVER_65_0.cloverRec.S[7178]++;throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());}
			}}
			}
			__CLOVER_65_0.cloverRec.S[7179]++;_cnt353++;
		} }while (true);
		}
		__CLOVER_65_0.cloverRec.S[7180]++;match("'");
		/*System.out.println("char :"+getText());*/
		__CLOVER_65_0.cloverRec.S[7181]++;if ( (((_createToken && _token==null && _ttype!=Token.SKIP ) && (++__CLOVER_65_0.cloverRec.CT[1977]!=0|true)) || (++__CLOVER_65_0.cloverRec.CF[1977]==0&false))) {{
			__CLOVER_65_0.cloverRec.S[7182]++;_token = makeToken(_ttype);
			__CLOVER_65_0.cloverRec.S[7183]++;_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		}__CLOVER_65_0.cloverRec.S[7184]++;_returnToken = _token;
	}
	
	public final void mFREEOP(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {__CLOVER_65_0.cloverRec.M[526]++;
		__CLOVER_65_0.cloverRec.S[7185]++;int _ttype; __CLOVER_65_0.cloverRec.S[7186]++;Token _token=null; __CLOVER_65_0.cloverRec.S[7187]++;int _begin=text.length();
		__CLOVER_65_0.cloverRec.S[7188]++;_ttype = FREEOP;
		__CLOVER_65_0.cloverRec.S[7189]++;int _saveIndex;
		
		{
		__CLOVER_65_0.cloverRec.S[7190]++;boolean __CLOVER_bool12=false;switch ( LA(1)) {
		case '@':if (!__CLOVER_bool12) {__CLOVER_65_0.cloverRec.S[7191]++;__CLOVER_bool12=true;}
		{
			__CLOVER_65_0.cloverRec.S[7192]++;match('@');
			__CLOVER_65_0.cloverRec.S[7193]++;break;
		}
		case '#':if (!__CLOVER_bool12) {__CLOVER_65_0.cloverRec.S[7194]++;__CLOVER_bool12=true;}
		{
			__CLOVER_65_0.cloverRec.S[7195]++;match('#');
			__CLOVER_65_0.cloverRec.S[7196]++;break;
		}
		case '|':if (!__CLOVER_bool12) {__CLOVER_65_0.cloverRec.S[7197]++;__CLOVER_bool12=true;}
		{
			__CLOVER_65_0.cloverRec.S[7198]++;match('|');
			__CLOVER_65_0.cloverRec.S[7199]++;break;
		}
		case '&':if (!__CLOVER_bool12) {__CLOVER_65_0.cloverRec.S[7200]++;__CLOVER_bool12=true;}
		{
			__CLOVER_65_0.cloverRec.S[7201]++;match('&');
			__CLOVER_65_0.cloverRec.S[7202]++;break;
		}
		default:if (!__CLOVER_bool12) {__CLOVER_65_0.cloverRec.S[7203]++;__CLOVER_bool12=true;}
		{
			__CLOVER_65_0.cloverRec.S[7204]++;throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());
		}
		}
		}
		{
		__CLOVER_65_0.cloverRec.S[7205]++;_loop357:
		do {{
			__CLOVER_65_0.cloverRec.S[7206]++;boolean __CLOVER_bool13=false;switch ( LA(1)) {
			case 'a':if (!__CLOVER_bool13) {__CLOVER_65_0.cloverRec.S[7207]++;__CLOVER_bool13=true;}  case 'b':if (!__CLOVER_bool13) {__CLOVER_65_0.cloverRec.S[7208]++;__CLOVER_bool13=true;}  case 'c':if (!__CLOVER_bool13) {__CLOVER_65_0.cloverRec.S[7209]++;__CLOVER_bool13=true;}  case 'd':if (!__CLOVER_bool13) {__CLOVER_65_0.cloverRec.S[7210]++;__CLOVER_bool13=true;}
			case 'e':if (!__CLOVER_bool13) {__CLOVER_65_0.cloverRec.S[7211]++;__CLOVER_bool13=true;}  case 'f':if (!__CLOVER_bool13) {__CLOVER_65_0.cloverRec.S[7212]++;__CLOVER_bool13=true;}  case 'g':if (!__CLOVER_bool13) {__CLOVER_65_0.cloverRec.S[7213]++;__CLOVER_bool13=true;}  case 'h':if (!__CLOVER_bool13) {__CLOVER_65_0.cloverRec.S[7214]++;__CLOVER_bool13=true;}
			case 'i':if (!__CLOVER_bool13) {__CLOVER_65_0.cloverRec.S[7215]++;__CLOVER_bool13=true;}  case 'j':if (!__CLOVER_bool13) {__CLOVER_65_0.cloverRec.S[7216]++;__CLOVER_bool13=true;}  case 'k':if (!__CLOVER_bool13) {__CLOVER_65_0.cloverRec.S[7217]++;__CLOVER_bool13=true;}  case 'l':if (!__CLOVER_bool13) {__CLOVER_65_0.cloverRec.S[7218]++;__CLOVER_bool13=true;}
			case 'm':if (!__CLOVER_bool13) {__CLOVER_65_0.cloverRec.S[7219]++;__CLOVER_bool13=true;}  case 'n':if (!__CLOVER_bool13) {__CLOVER_65_0.cloverRec.S[7220]++;__CLOVER_bool13=true;}  case 'o':if (!__CLOVER_bool13) {__CLOVER_65_0.cloverRec.S[7221]++;__CLOVER_bool13=true;}  case 'p':if (!__CLOVER_bool13) {__CLOVER_65_0.cloverRec.S[7222]++;__CLOVER_bool13=true;}
			case 'q':if (!__CLOVER_bool13) {__CLOVER_65_0.cloverRec.S[7223]++;__CLOVER_bool13=true;}  case 'r':if (!__CLOVER_bool13) {__CLOVER_65_0.cloverRec.S[7224]++;__CLOVER_bool13=true;}  case 's':if (!__CLOVER_bool13) {__CLOVER_65_0.cloverRec.S[7225]++;__CLOVER_bool13=true;}  case 't':if (!__CLOVER_bool13) {__CLOVER_65_0.cloverRec.S[7226]++;__CLOVER_bool13=true;}
			case 'u':if (!__CLOVER_bool13) {__CLOVER_65_0.cloverRec.S[7227]++;__CLOVER_bool13=true;}  case 'v':if (!__CLOVER_bool13) {__CLOVER_65_0.cloverRec.S[7228]++;__CLOVER_bool13=true;}  case 'w':if (!__CLOVER_bool13) {__CLOVER_65_0.cloverRec.S[7229]++;__CLOVER_bool13=true;}  case 'x':if (!__CLOVER_bool13) {__CLOVER_65_0.cloverRec.S[7230]++;__CLOVER_bool13=true;}
			case 'y':if (!__CLOVER_bool13) {__CLOVER_65_0.cloverRec.S[7231]++;__CLOVER_bool13=true;}  case 'z':if (!__CLOVER_bool13) {__CLOVER_65_0.cloverRec.S[7232]++;__CLOVER_bool13=true;}
			{
				__CLOVER_65_0.cloverRec.S[7233]++;matchRange('a','z');
				__CLOVER_65_0.cloverRec.S[7234]++;break;
			}
			case 'A':if (!__CLOVER_bool13) {__CLOVER_65_0.cloverRec.S[7235]++;__CLOVER_bool13=true;}  case 'B':if (!__CLOVER_bool13) {__CLOVER_65_0.cloverRec.S[7236]++;__CLOVER_bool13=true;}  case 'C':if (!__CLOVER_bool13) {__CLOVER_65_0.cloverRec.S[7237]++;__CLOVER_bool13=true;}  case 'D':if (!__CLOVER_bool13) {__CLOVER_65_0.cloverRec.S[7238]++;__CLOVER_bool13=true;}
			case 'E':if (!__CLOVER_bool13) {__CLOVER_65_0.cloverRec.S[7239]++;__CLOVER_bool13=true;}  case 'F':if (!__CLOVER_bool13) {__CLOVER_65_0.cloverRec.S[7240]++;__CLOVER_bool13=true;}  case 'G':if (!__CLOVER_bool13) {__CLOVER_65_0.cloverRec.S[7241]++;__CLOVER_bool13=true;}  case 'H':if (!__CLOVER_bool13) {__CLOVER_65_0.cloverRec.S[7242]++;__CLOVER_bool13=true;}
			case 'I':if (!__CLOVER_bool13) {__CLOVER_65_0.cloverRec.S[7243]++;__CLOVER_bool13=true;}  case 'J':if (!__CLOVER_bool13) {__CLOVER_65_0.cloverRec.S[7244]++;__CLOVER_bool13=true;}  case 'K':if (!__CLOVER_bool13) {__CLOVER_65_0.cloverRec.S[7245]++;__CLOVER_bool13=true;}  case 'L':if (!__CLOVER_bool13) {__CLOVER_65_0.cloverRec.S[7246]++;__CLOVER_bool13=true;}
			case 'M':if (!__CLOVER_bool13) {__CLOVER_65_0.cloverRec.S[7247]++;__CLOVER_bool13=true;}  case 'N':if (!__CLOVER_bool13) {__CLOVER_65_0.cloverRec.S[7248]++;__CLOVER_bool13=true;}  case 'O':if (!__CLOVER_bool13) {__CLOVER_65_0.cloverRec.S[7249]++;__CLOVER_bool13=true;}  case 'P':if (!__CLOVER_bool13) {__CLOVER_65_0.cloverRec.S[7250]++;__CLOVER_bool13=true;}
			case 'Q':if (!__CLOVER_bool13) {__CLOVER_65_0.cloverRec.S[7251]++;__CLOVER_bool13=true;}  case 'R':if (!__CLOVER_bool13) {__CLOVER_65_0.cloverRec.S[7252]++;__CLOVER_bool13=true;}  case 'S':if (!__CLOVER_bool13) {__CLOVER_65_0.cloverRec.S[7253]++;__CLOVER_bool13=true;}  case 'T':if (!__CLOVER_bool13) {__CLOVER_65_0.cloverRec.S[7254]++;__CLOVER_bool13=true;}
			case 'U':if (!__CLOVER_bool13) {__CLOVER_65_0.cloverRec.S[7255]++;__CLOVER_bool13=true;}  case 'V':if (!__CLOVER_bool13) {__CLOVER_65_0.cloverRec.S[7256]++;__CLOVER_bool13=true;}  case 'W':if (!__CLOVER_bool13) {__CLOVER_65_0.cloverRec.S[7257]++;__CLOVER_bool13=true;}  case 'X':if (!__CLOVER_bool13) {__CLOVER_65_0.cloverRec.S[7258]++;__CLOVER_bool13=true;}
			case 'Y':if (!__CLOVER_bool13) {__CLOVER_65_0.cloverRec.S[7259]++;__CLOVER_bool13=true;}  case 'Z':if (!__CLOVER_bool13) {__CLOVER_65_0.cloverRec.S[7260]++;__CLOVER_bool13=true;}
			{
				__CLOVER_65_0.cloverRec.S[7261]++;matchRange('A','Z');
				__CLOVER_65_0.cloverRec.S[7262]++;break;
			}
			case '_':if (!__CLOVER_bool13) {__CLOVER_65_0.cloverRec.S[7263]++;__CLOVER_bool13=true;}
			{
				__CLOVER_65_0.cloverRec.S[7264]++;match('_');
				__CLOVER_65_0.cloverRec.S[7265]++;break;
			}
			case '0':if (!__CLOVER_bool13) {__CLOVER_65_0.cloverRec.S[7266]++;__CLOVER_bool13=true;}  case '1':if (!__CLOVER_bool13) {__CLOVER_65_0.cloverRec.S[7267]++;__CLOVER_bool13=true;}  case '2':if (!__CLOVER_bool13) {__CLOVER_65_0.cloverRec.S[7268]++;__CLOVER_bool13=true;}  case '3':if (!__CLOVER_bool13) {__CLOVER_65_0.cloverRec.S[7269]++;__CLOVER_bool13=true;}
			case '4':if (!__CLOVER_bool13) {__CLOVER_65_0.cloverRec.S[7270]++;__CLOVER_bool13=true;}  case '5':if (!__CLOVER_bool13) {__CLOVER_65_0.cloverRec.S[7271]++;__CLOVER_bool13=true;}  case '6':if (!__CLOVER_bool13) {__CLOVER_65_0.cloverRec.S[7272]++;__CLOVER_bool13=true;}  case '7':if (!__CLOVER_bool13) {__CLOVER_65_0.cloverRec.S[7273]++;__CLOVER_bool13=true;}
			case '8':if (!__CLOVER_bool13) {__CLOVER_65_0.cloverRec.S[7274]++;__CLOVER_bool13=true;}  case '9':if (!__CLOVER_bool13) {__CLOVER_65_0.cloverRec.S[7275]++;__CLOVER_bool13=true;}
			{
				__CLOVER_65_0.cloverRec.S[7276]++;matchRange('0','9');
				__CLOVER_65_0.cloverRec.S[7277]++;break;
			}
			case '=':if (!__CLOVER_bool13) {__CLOVER_65_0.cloverRec.S[7278]++;__CLOVER_bool13=true;}
			{
				__CLOVER_65_0.cloverRec.S[7279]++;match('=');
				__CLOVER_65_0.cloverRec.S[7280]++;break;
			}
			case '<':if (!__CLOVER_bool13) {__CLOVER_65_0.cloverRec.S[7281]++;__CLOVER_bool13=true;}
			{
				__CLOVER_65_0.cloverRec.S[7282]++;match('<');
				__CLOVER_65_0.cloverRec.S[7283]++;break;
			}
			case '>':if (!__CLOVER_bool13) {__CLOVER_65_0.cloverRec.S[7284]++;__CLOVER_bool13=true;}
			{
				__CLOVER_65_0.cloverRec.S[7285]++;match('>');
				__CLOVER_65_0.cloverRec.S[7286]++;break;
			}
			case '/':if (!__CLOVER_bool13) {__CLOVER_65_0.cloverRec.S[7287]++;__CLOVER_bool13=true;}
			{
				__CLOVER_65_0.cloverRec.S[7288]++;match('/');
				__CLOVER_65_0.cloverRec.S[7289]++;break;
			}
			case '@':if (!__CLOVER_bool13) {__CLOVER_65_0.cloverRec.S[7290]++;__CLOVER_bool13=true;}
			{
				__CLOVER_65_0.cloverRec.S[7291]++;match('@');
				__CLOVER_65_0.cloverRec.S[7292]++;break;
			}
			case '#':if (!__CLOVER_bool13) {__CLOVER_65_0.cloverRec.S[7293]++;__CLOVER_bool13=true;}
			{
				__CLOVER_65_0.cloverRec.S[7294]++;match('#');
				__CLOVER_65_0.cloverRec.S[7295]++;break;
			}
			case '|':if (!__CLOVER_bool13) {__CLOVER_65_0.cloverRec.S[7296]++;__CLOVER_bool13=true;}
			{
				__CLOVER_65_0.cloverRec.S[7297]++;match('|');
				__CLOVER_65_0.cloverRec.S[7298]++;break;
			}
			case '&':if (!__CLOVER_bool13) {__CLOVER_65_0.cloverRec.S[7299]++;__CLOVER_bool13=true;}
			{
				__CLOVER_65_0.cloverRec.S[7300]++;match('&');
				__CLOVER_65_0.cloverRec.S[7301]++;break;
			}
			case '\\':if (!__CLOVER_bool13) {__CLOVER_65_0.cloverRec.S[7302]++;__CLOVER_bool13=true;}
			{
				__CLOVER_65_0.cloverRec.S[7303]++;match('\\');
				__CLOVER_65_0.cloverRec.S[7304]++;break;
			}
			case '^':if (!__CLOVER_bool13) {__CLOVER_65_0.cloverRec.S[7305]++;__CLOVER_bool13=true;}
			{
				__CLOVER_65_0.cloverRec.S[7306]++;match('^');
				__CLOVER_65_0.cloverRec.S[7307]++;break;
			}
			case '*':if (!__CLOVER_bool13) {__CLOVER_65_0.cloverRec.S[7308]++;__CLOVER_bool13=true;}
			{
				__CLOVER_65_0.cloverRec.S[7309]++;match('*');
				__CLOVER_65_0.cloverRec.S[7310]++;break;
			}
			default:if (!__CLOVER_bool13) {__CLOVER_65_0.cloverRec.S[7311]++;__CLOVER_bool13=true;}
			{
				__CLOVER_65_0.cloverRec.S[7312]++;break _loop357;
			}
			}
		} }while (true);
		}
		__CLOVER_65_0.cloverRec.S[7313]++;if ( (((_createToken && _token==null && _ttype!=Token.SKIP ) && (++__CLOVER_65_0.cloverRec.CT[1978]!=0|true)) || (++__CLOVER_65_0.cloverRec.CF[1978]==0&false))) {{
			__CLOVER_65_0.cloverRec.S[7314]++;_token = makeToken(_ttype);
			__CLOVER_65_0.cloverRec.S[7315]++;_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		}__CLOVER_65_0.cloverRec.S[7316]++;_returnToken = _token;
	}
	
	
	private static final long[] mk_tokenSet_0() {__CLOVER_65_0.cloverRec.M[527]++;
		__CLOVER_65_0.cloverRec.S[7317]++;long[] data = new long[8];
		__CLOVER_65_0.cloverRec.S[7318]++;data[0]=-4294966784L;
		__CLOVER_65_0.cloverRec.S[7319]++;data[1]=9223372036854775807L;
		__CLOVER_65_0.cloverRec.S[7320]++;data[2]=10416326484951040L;
		__CLOVER_65_0.cloverRec.S[7321]++;data[3]=144119040661520384L;
		__CLOVER_65_0.cloverRec.S[7322]++;return data;
	}
	public static final BitSet _tokenSet_0 = new BitSet(mk_tokenSet_0());
	private static final long[] mk_tokenSet_1() {__CLOVER_65_0.cloverRec.M[528]++;
		__CLOVER_65_0.cloverRec.S[7323]++;long[] data = new long[8];
		__CLOVER_65_0.cloverRec.S[7324]++;data[0]=-4294967296L;
		__CLOVER_65_0.cloverRec.S[7325]++;data[1]=9223372036854775807L;
		__CLOVER_65_0.cloverRec.S[7326]++;data[2]=10416326484951040L;
		__CLOVER_65_0.cloverRec.S[7327]++;data[3]=144119040661520384L;
		__CLOVER_65_0.cloverRec.S[7328]++;return data;
	}
	public static final BitSet _tokenSet_1 = new BitSet(mk_tokenSet_1());
	private static final long[] mk_tokenSet_2() {__CLOVER_65_0.cloverRec.M[529]++;
		__CLOVER_65_0.cloverRec.S[7329]++;long[] data = new long[8];
		__CLOVER_65_0.cloverRec.S[7330]++;data[0]=-158913780224L;
		__CLOVER_65_0.cloverRec.S[7331]++;data[1]=9223372036854775807L;
		__CLOVER_65_0.cloverRec.S[7332]++;data[2]=10416326484951040L;
		__CLOVER_65_0.cloverRec.S[7333]++;data[3]=144119040661520384L;
		__CLOVER_65_0.cloverRec.S[7334]++;return data;
	}
	public static final BitSet _tokenSet_2 = new BitSet(mk_tokenSet_2());
	private static final long[] mk_tokenSet_3() {__CLOVER_65_0.cloverRec.M[530]++;
		__CLOVER_65_0.cloverRec.S[7335]++;long[] data = new long[8];
		__CLOVER_65_0.cloverRec.S[7336]++;data[0]=-691489724928L;
		__CLOVER_65_0.cloverRec.S[7337]++;data[1]=9223372036854775807L;
		__CLOVER_65_0.cloverRec.S[7338]++;data[2]=10416326484951040L;
		__CLOVER_65_0.cloverRec.S[7339]++;data[3]=144119040661520384L;
		__CLOVER_65_0.cloverRec.S[7340]++;return data;
	}
	public static final BitSet _tokenSet_3 = new BitSet(mk_tokenSet_3());
	
	}
