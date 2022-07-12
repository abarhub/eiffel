// $ANTLR 2.7.3: "ace.g" -> "AceLexer.java"$

package tinyeiffel.lace;

import java.io.*;
import java.util.*;
import tinyeiffel.ast.*;
import tinyeiffel.erreur.*;
import tinyeiffel.compiler.*;
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

public class AceLexer extends antlr.CharScanner implements AceTokenTypes, TokenStream
 {

	public Vector liste_commentaire=new Vector();
	public void ajoute_commentaire(String com,tinyeiffel.ast.Token token)
	{
		liste_commentaire.addElement(new Commentaire(com,token));
	}

	public int donne_dernier()
	{
		return liste_commentaire.size()-1;
	}
public AceLexer(InputStream in) {
	this(new ByteBuffer(in));
}
public AceLexer(Reader in) {
	this(new CharBuffer(in));
}
public AceLexer(InputBuffer ib) {
	this(new LexerSharedInputState(ib));
}
public AceLexer(LexerSharedInputState state) {
	super(state);
	caseSensitiveLiterals = true;
	setCaseSensitive(true);
	literals = new Hashtable();
	literals.put(new ANTLRHashString("creation", this), new Integer(35));
	literals.put(new ANTLRHashString("all", this), new Integer(32));
	literals.put(new ANTLRHashString("external", this), new Integer(13));
	literals.put(new ANTLRHashString("rename", this), new Integer(47));
	literals.put(new ANTLRHashString("loop", this), new Integer(43));
	literals.put(new ANTLRHashString("exclude", this), new Integer(37));
	literals.put(new ANTLRHashString("ignore", this), new Integer(39));
	literals.put(new ANTLRHashString("adapt", this), new Integer(31));
	literals.put(new ANTLRHashString("no", this), new Integer(44));
	literals.put(new ANTLRHashString("require", this), new Integer(46));
	literals.put(new ANTLRHashString("root", this), new Integer(5));
	literals.put(new ANTLRHashString("ensure", this), new Integer(36));
	literals.put(new ANTLRHashString("keep", this), new Integer(42));
	literals.put(new ANTLRHashString("generate", this), new Integer(14));
	literals.put(new ANTLRHashString("invariant", this), new Integer(41));
	literals.put(new ANTLRHashString("end", this), new Integer(9));
	literals.put(new ANTLRHashString("use", this), new Integer(48));
	literals.put(new ANTLRHashString("system", this), new Integer(4));
	literals.put(new ANTLRHashString("cluster", this), new Integer(11));
	literals.put(new ANTLRHashString("yes", this), new Integer(50));
	literals.put(new ANTLRHashString("include", this), new Integer(40));
	literals.put(new ANTLRHashString("check", this), new Integer(34));
	literals.put(new ANTLRHashString("export", this), new Integer(38));
	literals.put(new ANTLRHashString("option", this), new Integer(45));
	literals.put(new ANTLRHashString("default", this), new Integer(10));
	literals.put(new ANTLRHashString("visible", this), new Integer(49));
	literals.put(new ANTLRHashString("as", this), new Integer(33));
}

public Token nextToken() throws TokenStreamException {
	Token theRetToken=null;
tryAgain:
	for (;;) {
		Token _token = null;
		int _ttype = Token.INVALID_TYPE;
		resetText();
		try {   // for char stream error handling
			try {   // for lexical error handling
				switch ( LA(1)) {
				case '\t':  case '\n':  case '\r':  case ' ':
				{
					mWS(true);
					theRetToken=_returnToken;
					break;
				}
				case '(':
				{
					mLPAREN(true);
					theRetToken=_returnToken;
					break;
				}
				case ')':
				{
					mRPAREN(true);
					theRetToken=_returnToken;
					break;
				}
				case '[':
				{
					mCROCHETO(true);
					theRetToken=_returnToken;
					break;
				}
				case ']':
				{
					mCROCHETF(true);
					theRetToken=_returnToken;
					break;
				}
				case '+':
				{
					mPLUS(true);
					theRetToken=_returnToken;
					break;
				}
				case '*':
				{
					mFOIS(true);
					theRetToken=_returnToken;
					break;
				}
				case '\\':
				{
					mMOD(true);
					theRetToken=_returnToken;
					break;
				}
				case '=':
				{
					mEGAL(true);
					theRetToken=_returnToken;
					break;
				}
				case ';':
				{
					mSEMI(true);
					theRetToken=_returnToken;
					break;
				}
				case ',':
				{
					mVIRGULE(true);
					theRetToken=_returnToken;
					break;
				}
				case '?':
				{
					mTENTATIVE_AFFECT(true);
					theRetToken=_returnToken;
					break;
				}
				case '^':
				{
					mPUISS(true);
					theRetToken=_returnToken;
					break;
				}
				case '!':
				{
					mEXCLAMATION(true);
					theRetToken=_returnToken;
					break;
				}
				case '{':
				{
					mACOLADEO(true);
					theRetToken=_returnToken;
					break;
				}
				case '}':
				{
					mACOLADEF(true);
					theRetToken=_returnToken;
					break;
				}
				case '0':  case '1':  case '2':  case '3':
				case '4':  case '5':  case '6':  case '7':
				case '8':  case '9':
				{
					mINT(true);
					theRetToken=_returnToken;
					break;
				}
				case '"':  case '%':
				{
					mSTRING(true);
					theRetToken=_returnToken;
					break;
				}
				case '\'':
				{
					mCHAR(true);
					theRetToken=_returnToken;
					break;
				}
				default:
					if ((LA(1)=='-') && (LA(2)=='-')) {
						mCOMMENTAIRE(true);
						theRetToken=_returnToken;
					}
					else if ((LA(1)=='-') && (LA(2)=='>')) {
						mFLECHED(true);
						theRetToken=_returnToken;
					}
					else if ((LA(1)=='.') && (LA(2)=='.')) {
						mDEUX_POINT(true);
						theRetToken=_returnToken;
					}
					else if ((LA(1)=='/') && (LA(2)=='=')) {
						mDIFF(true);
						theRetToken=_returnToken;
					}
					else if ((LA(1)=='/') && (LA(2)=='/')) {
						mDIV_ENTIER(true);
						theRetToken=_returnToken;
					}
					else if ((LA(1)=='<') && (LA(2)=='<')) {
						mDEBUT_ARRAY(true);
						theRetToken=_returnToken;
					}
					else if ((LA(1)=='>') && (LA(2)=='>')) {
						mFIN_ARRAY(true);
						theRetToken=_returnToken;
					}
					else if ((LA(1)=='<') && (LA(2)=='=')) {
						mINF(true);
						theRetToken=_returnToken;
					}
					else if ((LA(1)=='>') && (LA(2)=='=')) {
						mSUP(true);
						theRetToken=_returnToken;
					}
					else if ((LA(1)==':') && (LA(2)=='=')) {
						mAFFECT(true);
						theRetToken=_returnToken;
					}
					else if (((LA(1)=='e') && (_tokenSet_0.member(LA(2))))&&(LA(1)=='e')) {
						mEXPOSANT(true);
						theRetToken=_returnToken;
					}
					else if (((LA(1)=='.') && ((LA(2) >= '0' && LA(2) <= '9')))&&(LA(2)!='.')) {
						mREAL(true);
						theRetToken=_returnToken;
					}
					else if ((LA(1)=='-') && (true)) {
						mMOINS(true);
						theRetToken=_returnToken;
					}
					else if ((LA(1)=='/') && (true)) {
						mDIV(true);
						theRetToken=_returnToken;
					}
					else if ((LA(1)=='<') && (true)) {
						mINFS(true);
						theRetToken=_returnToken;
					}
					else if ((LA(1)=='>') && (true)) {
						mSUPS(true);
						theRetToken=_returnToken;
					}
					else if ((LA(1)=='.') && (true)) {
						mPOINT(true);
						theRetToken=_returnToken;
					}
					else if ((LA(1)==':') && (true)) {
						mDOUBLE_POINT(true);
						theRetToken=_returnToken;
					}
					else if ((_tokenSet_1.member(LA(1))) && (true)) {
						mID(true);
						theRetToken=_returnToken;
					}
				else {
					if (LA(1)==EOF_CHAR) {uponEOF(); _returnToken = makeToken(Token.EOF_TYPE);}
				else {throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());}
				}
				}
				if ( _returnToken==null ) continue tryAgain; // found SKIP token
				_ttype = _returnToken.getType();
				_returnToken.setType(_ttype);
				return _returnToken;
			}
			catch (RecognitionException e) {
				throw new TokenStreamRecognitionException(e);
			}
		}
		catch (CharStreamException cse) {
			if ( cse instanceof CharStreamIOException ) {
				throw new TokenStreamIOException(((CharStreamIOException)cse).io);
			}
			else {
				throw new TokenStreamException(cse.getMessage());
			}
		}
	}
}

	public final void mWS(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = WS;
		int _saveIndex;
		
		{
		switch ( LA(1)) {
		case ' ':
		{
			match(' ');
			break;
		}
		case '\t':
		{
			match('\t');
			break;
		}
		case '\n':
		{
			match('\n');
			newline();
			break;
		}
		case '\r':
		{
			match('\r');
			break;
		}
		default:
		{
			throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());
		}
		}
		}
		_ttype = Token.SKIP;
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mCOMMENTAIRE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = COMMENTAIRE;
		int _saveIndex;
		
		int ligne=-1,colonne=-1;
		
		
		match("--");
		ligne=getLine();colonne=getColumn();
		{
		_loop47:
		do {
			if ((_tokenSet_2.member(LA(1)))) {
				{
				match(_tokenSet_2);
				}
			}
			else {
				break _loop47;
			}
			
		} while (true);
		}
		_ttype = Token.SKIP;
						ajoute_commentaire(new String(text.getBuffer(),_begin,text.length()-_begin),
							new tinyeiffel.ast.Token(ligne,colonne,
									new String(text.getBuffer(),_begin,text.length()-_begin),""));
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mLPAREN(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = LPAREN;
		int _saveIndex;
		
		match("(");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mRPAREN(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = RPAREN;
		int _saveIndex;
		
		match(")");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mCROCHETO(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = CROCHETO;
		int _saveIndex;
		
		match("[");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mCROCHETF(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = CROCHETF;
		int _saveIndex;
		
		match("]");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mFLECHED(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = FLECHED;
		int _saveIndex;
		
		match("->");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mDEUX_POINT(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = DEUX_POINT;
		int _saveIndex;
		
		match("..");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mPLUS(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = PLUS;
		int _saveIndex;
		
		match("+");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mMOINS(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = MOINS;
		int _saveIndex;
		
		match("-");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mFOIS(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = FOIS;
		int _saveIndex;
		
		match("*");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mDIFF(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = DIFF;
		int _saveIndex;
		
		match("/=");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mDIV_ENTIER(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = DIV_ENTIER;
		int _saveIndex;
		
		match("//");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mDIV(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = DIV;
		int _saveIndex;
		
		match("/");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mMOD(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = MOD;
		int _saveIndex;
		
		match("\\\\");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mEGAL(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = EGAL;
		int _saveIndex;
		
		match("=");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mDEBUT_ARRAY(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = DEBUT_ARRAY;
		int _saveIndex;
		
		match("<<");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mFIN_ARRAY(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = FIN_ARRAY;
		int _saveIndex;
		
		match(">>");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mINFS(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = INFS;
		int _saveIndex;
		
		match("<");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mSUPS(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = SUPS;
		int _saveIndex;
		
		match(">");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mINF(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = INF;
		int _saveIndex;
		
		match("<=");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mSUP(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = SUP;
		int _saveIndex;
		
		match(">=");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mSEMI(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = SEMI;
		int _saveIndex;
		
		match(";");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mVIRGULE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = VIRGULE;
		int _saveIndex;
		
		match(",");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mPOINT(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = POINT;
		int _saveIndex;
		
		match(".");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mDOUBLE_POINT(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = DOUBLE_POINT;
		int _saveIndex;
		
		match(":");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mAFFECT(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = AFFECT;
		int _saveIndex;
		
		match(":=");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mTENTATIVE_AFFECT(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = TENTATIVE_AFFECT;
		int _saveIndex;
		
		match("?=");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mPUISS(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = PUISS;
		int _saveIndex;
		
		match("^");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mEXCLAMATION(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = EXCLAMATION;
		int _saveIndex;
		
		match("!");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mACOLADEO(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = ACOLADEO;
		int _saveIndex;
		
		match("{");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mACOLADEF(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = ACOLADEF;
		int _saveIndex;
		
		match("}");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mINT(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = INT;
		int _saveIndex;
		
		{
		int _cnt80=0;
		_loop80:
		do {
			if (((LA(1) >= '0' && LA(1) <= '9'))) {
				mDIGIT(false);
			}
			else {
				if ( _cnt80>=1 ) { break _loop80; } else {throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());}
			}
			
			_cnt80++;
		} while (true);
		}
		{
		if (((LA(1)=='.'))&&(LA(2)!='.')) {
			match('.');
			{
			_loop83:
			do {
				if (((LA(1) >= '0' && LA(1) <= '9'))) {
					mDIGIT(false);
				}
				else {
					break _loop83;
				}
				
			} while (true);
			}
			{
			if ((LA(1)=='e')) {
				mEXPOSANT(false);
			}
			else {
			}
			
			}
			_ttype=REAL;
		}
		else {
		}
		
		}
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	protected final void mDIGIT(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = DIGIT;
		int _saveIndex;
		
		matchRange('0','9');
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mEXPOSANT(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = EXPOSANT;
		int _saveIndex;
		
		if (!(LA(1)=='e'))
		  throw new SemanticException("LA(1)=='e'");
		match('e');
		{
		switch ( LA(1)) {
		case '+':
		{
			match('+');
			break;
		}
		case '-':
		{
			match('-');
			break;
		}
		case '0':  case '1':  case '2':  case '3':
		case '4':  case '5':  case '6':  case '7':
		case '8':  case '9':
		{
			break;
		}
		default:
		{
			throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());
		}
		}
		}
		{
		int _cnt110=0;
		_loop110:
		do {
			if (((LA(1) >= '0' && LA(1) <= '9'))) {
				mDIGIT(false);
			}
			else {
				if ( _cnt110>=1 ) { break _loop110; } else {throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());}
			}
			
			_cnt110++;
		} while (true);
		}
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mREAL(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = REAL;
		int _saveIndex;
		
		if (!(LA(2)!='.'))
		  throw new SemanticException("LA(2)!='.'");
		match('.');
		{
		int _cnt87=0;
		_loop87:
		do {
			if (((LA(1) >= '0' && LA(1) <= '9'))) {
				mDIGIT(false);
			}
			else {
				if ( _cnt87>=1 ) { break _loop87; } else {throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());}
			}
			
			_cnt87++;
		} while (true);
		}
		{
		if ((LA(1)=='e')) {
			mEXPOSANT(false);
		}
		else {
		}
		
		}
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mID(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = ID;
		int _saveIndex;
		
		{
		switch ( LA(1)) {
		case 'a':  case 'b':  case 'c':  case 'd':
		case 'e':  case 'f':  case 'g':  case 'h':
		case 'i':  case 'j':  case 'k':  case 'l':
		case 'm':  case 'n':  case 'o':  case 'p':
		case 'q':  case 'r':  case 's':  case 't':
		case 'u':  case 'v':  case 'w':  case 'x':
		case 'y':  case 'z':
		{
			matchRange('a','z');
			break;
		}
		case 'A':  case 'B':  case 'C':  case 'D':
		case 'E':  case 'F':  case 'G':  case 'H':
		case 'I':  case 'J':  case 'K':  case 'L':
		case 'M':  case 'N':  case 'O':  case 'P':
		case 'Q':  case 'R':  case 'S':  case 'T':
		case 'U':  case 'V':  case 'W':  case 'X':
		case 'Y':  case 'Z':
		{
			matchRange('A','Z');
			break;
		}
		case '_':
		{
			match('_');
			break;
		}
		default:
		{
			throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());
		}
		}
		}
		{
		_loop92:
		do {
			switch ( LA(1)) {
			case 'a':  case 'b':  case 'c':  case 'd':
			case 'e':  case 'f':  case 'g':  case 'h':
			case 'i':  case 'j':  case 'k':  case 'l':
			case 'm':  case 'n':  case 'o':  case 'p':
			case 'q':  case 'r':  case 's':  case 't':
			case 'u':  case 'v':  case 'w':  case 'x':
			case 'y':  case 'z':
			{
				matchRange('a','z');
				break;
			}
			case 'A':  case 'B':  case 'C':  case 'D':
			case 'E':  case 'F':  case 'G':  case 'H':
			case 'I':  case 'J':  case 'K':  case 'L':
			case 'M':  case 'N':  case 'O':  case 'P':
			case 'Q':  case 'R':  case 'S':  case 'T':
			case 'U':  case 'V':  case 'W':  case 'X':
			case 'Y':  case 'Z':
			{
				matchRange('A','Z');
				break;
			}
			case '_':
			{
				match('_');
				break;
			}
			case '0':  case '1':  case '2':  case '3':
			case '4':  case '5':  case '6':  case '7':
			case '8':  case '9':
			{
				mDIGIT(false);
				break;
			}
			default:
			{
				break _loop92;
			}
			}
		} while (true);
		}
		/*System.out.println("mot trouve:"+getText());*/
		_ttype = testLiteralsTable(_ttype);
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mSTRING(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = STRING;
		int _saveIndex;
		
		String s;
		
		
		{
		switch ( LA(1)) {
		case '"':
		{
			match("\"");
			break;
		}
		case '%':
		{
			match("%");
			break;
		}
		default:
		{
			throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());
		}
		}
		}
		{
		int _cnt99=0;
		_loop99:
		do {
			if ((LA(1)=='%') && (_tokenSet_3.member(LA(2)))) {
				{
				match('%');
				{
				match(_tokenSet_3);
				}
				}
			}
			else if ((_tokenSet_4.member(LA(1)))) {
				{
				match(_tokenSet_4);
				}
			}
			else {
				if ( _cnt99>=1 ) { break _loop99; } else {throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());}
			}
			
			_cnt99++;
		} while (true);
		}
		{
		switch ( LA(1)) {
		case '"':
		{
			match("\"");
			break;
		}
		case '%':
		{
			match("%");
			break;
		}
		default:
		{
			throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());
		}
		}
		}
		
						//System.out.println("string :"+getText());
						s=getText();
						if(s.endsWith("%")&&s.startsWith("%"))
							_ttype=STRING3;
						else if(s.endsWith("%"))
							_ttype=STRING2;
						else if(s.startsWith("%"))
							_ttype=STRING4;
					
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mCHAR(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = CHAR;
		int _saveIndex;
		
		match("'");
		{
		int _cnt105=0;
		_loop105:
		do {
			switch ( LA(1)) {
			case '%':
			{
				{
				match('%');
				matchNot(EOF_CHAR);
				}
				break;
			}
			case '\t':  case '\n':  case '\r':  case ' ':
			case '!':  case '"':  case '(':  case ')':
			case '*':  case '+':  case ',':  case '-':
			case '.':  case '/':  case '0':  case '1':
			case '2':  case '3':  case '4':  case '5':
			case '6':  case '7':  case '8':  case '9':
			case ':':  case ';':  case '<':  case '=':
			case '>':  case '?':  case 'A':  case 'B':
			case 'C':  case 'D':  case 'E':  case 'F':
			case 'G':  case 'H':  case 'I':  case 'J':
			case 'K':  case 'L':  case 'M':  case 'N':
			case 'O':  case 'P':  case 'Q':  case 'R':
			case 'S':  case 'T':  case 'U':  case 'V':
			case 'W':  case 'X':  case 'Y':  case 'Z':
			case '[':  case '\\':  case ']':  case '^':
			case '_':  case 'a':  case 'b':  case 'c':
			case 'd':  case 'e':  case 'f':  case 'g':
			case 'h':  case 'i':  case 'j':  case 'k':
			case 'l':  case 'm':  case 'n':  case 'o':
			case 'p':  case 'q':  case 'r':  case 's':
			case 't':  case 'u':  case 'v':  case 'w':
			case 'x':  case 'y':  case 'z':  case '{':
			case '}':
			{
				{
				match(_tokenSet_5);
				}
				break;
			}
			default:
			{
				if ( _cnt105>=1 ) { break _loop105; } else {throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());}
			}
			}
			_cnt105++;
		} while (true);
		}
		match("'");
		/*System.out.println("char :"+getText());*/
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	
	private static final long[] mk_tokenSet_0() {
		long[] data = { 287992881640112128L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_0 = new BitSet(mk_tokenSet_0());
	private static final long[] mk_tokenSet_1() {
		long[] data = { 0L, 576460745995190270L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_1 = new BitSet(mk_tokenSet_1());
	private static final long[] mk_tokenSet_2() {
		long[] data = { -382252080640L, 3458764509525573630L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_2 = new BitSet(mk_tokenSet_2());
	private static final long[] mk_tokenSet_3() {
		long[] data = { -382252089344L, 3458764509525573630L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_3 = new BitSet(mk_tokenSet_3());
	private static final long[] mk_tokenSet_4() {
		long[] data = { -536870902272L, 3458764509525573630L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_4 = new BitSet(mk_tokenSet_4());
	private static final long[] mk_tokenSet_5() {
		long[] data = { -1069446846976L, 3458764509525573630L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_5 = new BitSet(mk_tokenSet_5());
	
	}
