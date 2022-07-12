// $ANTLR 2.7.3: "ace.g" -> "AceParser.java"$

package tinyeiffel.lace;

import java.io.*;
import java.util.*;
import tinyeiffel.ast.*;
import tinyeiffel.erreur.*;
import tinyeiffel.compiler.*;
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

public class AceParser extends antlr.LLkParser       implements AceTokenTypes
 {

	public AceLexer lexer=null;
	public int last_feature1=-1,last_feature2=-1;

	public Vector type_utilisee=new Vector();
	public Logging logging;

	/*public void ajoute_type(Type t)
	{
		int j;

		if(t!=null&&!((Type)t).is_like)
		{
			for(j=0;j<type_utilisee.size();j++)
			{
				if(((Type)type_utilisee.elementAt(j)).egaux(t))
				{
					return;
				}
			}
			type_utilisee.addElement(t);
		}
	}
	public void ajoute_type(Vector t)
	{
		int i,j;
		boolean trouve;

		if(t!=null)
		{
			for(i=0;i<t.size();i++)
			{
				if(!((Type)t.elementAt(i)).is_like)
				{
					trouve=false;
					for(j=0;!trouve&&j<type_utilisee.size();j++)
					{
						if(((Type)type_utilisee.elementAt(j)).egaux(
							((Type)t.elementAt(i))))
						{
								trouve=true;
						}
					}
					if(!trouve)
					{
						ajoute_type((Type)t.elementAt(i));
					}
				}
			}
		}
	}*/

        //public String nom_fichier;

	public tinyeiffel.ast.Token remplitToken(Token n)
	{
                //assert(n!=null);
		if(n==null)
			return null;
		return new tinyeiffel.ast.Token(n.getLine(),n.getColumn(),n.getText(),getFilename());
	}


protected AceParser(TokenBuffer tokenBuf, int k) {
  super(tokenBuf,k);
  tokenNames = _tokenNames;
  buildTokenTypeASTClassMap();
  astFactory = new ASTFactory(getTokenTypeToASTClassMap());
}

public AceParser(TokenBuffer tokenBuf) {
  this(tokenBuf,1);
}

protected AceParser(TokenStream lexer, int k) {
  super(lexer,k);
  tokenNames = _tokenNames;
  buildTokenTypeASTClassMap();
  astFactory = new ASTFactory(getTokenTypeToASTClassMap());
}

public AceParser(TokenStream lexer) {
  this(lexer,1);
}

public AceParser(ParserSharedInputState state) {
  super(state,1);
  tokenNames = _tokenNames;
  buildTokenTypeASTClassMap();
  astFactory = new ASTFactory(getTokenTypeToASTClassMap());
}

	public final Ace  ace() throws RecognitionException, TokenStreamException {
		Ace res=null;
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		tinyeiffel.compiler.ASTDefaut ace_AST = null;
		
		NomSysteme sys=null;
		Type nom;
		NomGrappe nomg=null;
		NomFeature nomp=null;
		Vector liste_grappe=null;
		
		
		try {      // for error handling
			tinyeiffel.compiler.ASTDefaut tmp1_AST = null;
			tmp1_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp1_AST);
			match(SYSTEM);
			sys=nom_systeme();
			astFactory.addASTChild(currentAST, returnAST);
			tinyeiffel.compiler.ASTDefaut tmp2_AST = null;
			tmp2_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp2_AST);
			match(ROOT);
			nom=nom_classe();
			astFactory.addASTChild(currentAST, returnAST);
			{
			switch ( LA(1)) {
			case LPAREN:
			{
				tinyeiffel.compiler.ASTDefaut tmp3_AST = null;
				tmp3_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp3_AST);
				match(LPAREN);
				nomg=nom_grappe();
				astFactory.addASTChild(currentAST, returnAST);
				tinyeiffel.compiler.ASTDefaut tmp4_AST = null;
				tmp4_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp4_AST);
				match(RPAREN);
				break;
			}
			case DOUBLE_POINT:
			case END:
			case DEFAULT:
			case CLUSTER:
			case EXTERNAL:
			case GENERATE:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			{
			switch ( LA(1)) {
			case DOUBLE_POINT:
			{
				tinyeiffel.compiler.ASTDefaut tmp5_AST = null;
				tmp5_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp5_AST);
				match(DOUBLE_POINT);
				nomp=nom_feature();
				astFactory.addASTChild(currentAST, returnAST);
				break;
			}
			case END:
			case DEFAULT:
			case CLUSTER:
			case EXTERNAL:
			case GENERATE:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			{
			switch ( LA(1)) {
			case DEFAULT:
			{
				defaut();
				astFactory.addASTChild(currentAST, returnAST);
				break;
			}
			case END:
			case CLUSTER:
			case EXTERNAL:
			case GENERATE:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			{
			switch ( LA(1)) {
			case CLUSTER:
			{
				liste_grappe=grappe();
				astFactory.addASTChild(currentAST, returnAST);
				break;
			}
			case END:
			case EXTERNAL:
			case GENERATE:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			{
			switch ( LA(1)) {
			case EXTERNAL:
			{
				externe();
				astFactory.addASTChild(currentAST, returnAST);
				break;
			}
			case END:
			case GENERATE:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			{
			switch ( LA(1)) {
			case GENERATE:
			{
				generation();
				astFactory.addASTChild(currentAST, returnAST);
				break;
			}
			case END:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			tinyeiffel.compiler.ASTDefaut tmp6_AST = null;
			tmp6_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp6_AST);
			match(END);
			if ( inputState.guessing==0 ) {
				
						res=new Ace(sys,nom,nomg,nomp,liste_grappe);
					
			}
			ace_AST = (tinyeiffel.compiler.ASTDefaut)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				consume();
				consumeUntil(_tokenSet_0);
			} else {
			  throw ex;
			}
		}
		returnAST = ace_AST;
		return res;
	}
	
	public final NomSysteme  nom_systeme() throws RecognitionException, TokenStreamException {
		NomSysteme res=null;
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		tinyeiffel.compiler.ASTDefaut nom_systeme_AST = null;
		Token  id = null;
		tinyeiffel.compiler.ASTDefaut id_AST = null;
		
		tinyeiffel.ast.Token t;
		
		
		try {      // for error handling
			id = LT(1);
			id_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(id);
			astFactory.addASTChild(currentAST, id_AST);
			match(ID);
			if ( inputState.guessing==0 ) {
				
						t=remplitToken(id);
						res=new NomSysteme(t.text,t);
					
			}
			nom_systeme_AST = (tinyeiffel.compiler.ASTDefaut)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				consume();
				consumeUntil(_tokenSet_1);
			} else {
			  throw ex;
			}
		}
		returnAST = nom_systeme_AST;
		return res;
	}
	
	public final Type  nom_classe() throws RecognitionException, TokenStreamException {
		Type res=null;
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		tinyeiffel.compiler.ASTDefaut nom_classe_AST = null;
		
		Type d=null;
		
		
		try {      // for error handling
			d=type();
			astFactory.addASTChild(currentAST, returnAST);
			if ( inputState.guessing==0 ) {
				res=d;
			}
			nom_classe_AST = (tinyeiffel.compiler.ASTDefaut)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				
						logging.erreur(new ErreurSource("Erreur dans le nom de la classe",ex.getLine(),
									ex.getColumn(),ex.getFilename()));
					
			} else {
				throw ex;
			}
		}
		returnAST = nom_classe_AST;
		return res;
	}
	
	public final NomGrappe  nom_grappe() throws RecognitionException, TokenStreamException {
		NomGrappe res=null;
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		tinyeiffel.compiler.ASTDefaut nom_grappe_AST = null;
		
		Chaine s;
		
		
		try {      // for error handling
			s=string();
			astFactory.addASTChild(currentAST, returnAST);
			if ( inputState.guessing==0 ) {
				res=new NomGrappe(s);
			}
			nom_grappe_AST = (tinyeiffel.compiler.ASTDefaut)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				consume();
				consumeUntil(_tokenSet_2);
			} else {
			  throw ex;
			}
		}
		returnAST = nom_grappe_AST;
		return res;
	}
	
	public final NomFeature  nom_feature() throws RecognitionException, TokenStreamException {
		NomFeature res=null;
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		tinyeiffel.compiler.ASTDefaut nom_feature_AST = null;
		Token  id = null;
		tinyeiffel.compiler.ASTDefaut id_AST = null;
		
		Chaine s1;
		
		
		try {      // for error handling
			id = LT(1);
			id_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(id);
			astFactory.addASTChild(currentAST, id_AST);
			match(ID);
			if ( inputState.guessing==0 ) {
				
							res=new NomFeature(id.getText());
							res.set_token(remplitToken(id),null);
						
			}
			nom_feature_AST = (tinyeiffel.compiler.ASTDefaut)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				
						logging.erreur(new ErreurSource("Erreur dans le nom d'attribut",ex.getLine(),
									ex.getColumn(),ex.getFilename()));
					
			} else {
				throw ex;
			}
		}
		returnAST = nom_feature_AST;
		return res;
	}
	
	public final void defaut() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		tinyeiffel.compiler.ASTDefaut defaut_AST = null;
		
		try {      // for error handling
			tinyeiffel.compiler.ASTDefaut tmp7_AST = null;
			tmp7_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp7_AST);
			match(DEFAULT);
			defaut_AST = (tinyeiffel.compiler.ASTDefaut)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				consume();
				consumeUntil(_tokenSet_3);
			} else {
			  throw ex;
			}
		}
		returnAST = defaut_AST;
	}
	
	public final Vector  grappe() throws RecognitionException, TokenStreamException {
		Vector res=new Vector();
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		tinyeiffel.compiler.ASTDefaut grappe_AST = null;
		
		NomGrappe nom=null;
		Chaine rep=null;
		Grappe g=null;
		
		
		try {      // for error handling
			tinyeiffel.compiler.ASTDefaut tmp8_AST = null;
			tmp8_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp8_AST);
			match(CLUSTER);
			{
			int _cnt14=0;
			_loop14:
			do {
				if ((LA(1)==STRING||LA(1)==STRING2)) {
					{
					boolean synPredMatched13 = false;
					if (((LA(1)==STRING||LA(1)==STRING2))) {
						int _m13 = mark();
						synPredMatched13 = true;
						inputState.guessing++;
						try {
							{
							nom_grappe();
							match(DOUBLE_POINT);
							}
						}
						catch (RecognitionException pe) {
							synPredMatched13 = false;
						}
						rewind(_m13);
						inputState.guessing--;
					}
					if ( synPredMatched13 ) {
						nom=nom_grappe();
						astFactory.addASTChild(currentAST, returnAST);
						tinyeiffel.compiler.ASTDefaut tmp9_AST = null;
						tmp9_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(LT(1));
						astFactory.addASTChild(currentAST, tmp9_AST);
						match(DOUBLE_POINT);
					}
					else if ((LA(1)==STRING||LA(1)==STRING2)) {
					}
					else {
						throw new NoViableAltException(LT(1), getFilename());
					}
					
					}
					rep=string();
					astFactory.addASTChild(currentAST, returnAST);
					if ( inputState.guessing==0 ) {
						g=new Grappe(nom,rep);res.addElement(g);
					}
					tinyeiffel.compiler.ASTDefaut tmp10_AST = null;
					tmp10_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(LT(1));
					astFactory.addASTChild(currentAST, tmp10_AST);
					match(SEMI);
				}
				else {
					if ( _cnt14>=1 ) { break _loop14; } else {throw new NoViableAltException(LT(1), getFilename());}
				}
				
				_cnt14++;
			} while (true);
			}
			grappe_AST = (tinyeiffel.compiler.ASTDefaut)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				consume();
				consumeUntil(_tokenSet_4);
			} else {
			  throw ex;
			}
		}
		returnAST = grappe_AST;
		return res;
	}
	
	public final void externe() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		tinyeiffel.compiler.ASTDefaut externe_AST = null;
		
		try {      // for error handling
			tinyeiffel.compiler.ASTDefaut tmp11_AST = null;
			tmp11_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp11_AST);
			match(EXTERNAL);
			externe_AST = (tinyeiffel.compiler.ASTDefaut)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				consume();
				consumeUntil(_tokenSet_5);
			} else {
			  throw ex;
			}
		}
		returnAST = externe_AST;
	}
	
	public final void generation() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		tinyeiffel.compiler.ASTDefaut generation_AST = null;
		
		try {      // for error handling
			tinyeiffel.compiler.ASTDefaut tmp12_AST = null;
			tmp12_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp12_AST);
			match(GENERATE);
			generation_AST = (tinyeiffel.compiler.ASTDefaut)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				consume();
				consumeUntil(_tokenSet_6);
			} else {
			  throw ex;
			}
		}
		returnAST = generation_AST;
	}
	
	public final Chaine  string() throws RecognitionException, TokenStreamException {
		Chaine res=null;
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		tinyeiffel.compiler.ASTDefaut string_AST = null;
		Token  s = null;
		tinyeiffel.compiler.ASTDefaut s_AST = null;
		Token  s1 = null;
		tinyeiffel.compiler.ASTDefaut s1_AST = null;
		Token  s2 = null;
		tinyeiffel.compiler.ASTDefaut s2_AST = null;
		Token  s3 = null;
		tinyeiffel.compiler.ASTDefaut s3_AST = null;
		
		Vector tmp=new Vector();
		boolean suite=false;
		String str="";
		tinyeiffel.ast.Token opera=null;
		
		
		try {      // for error handling
			switch ( LA(1)) {
			case STRING:
			{
				s = LT(1);
				s_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(s);
				astFactory.addASTChild(currentAST, s_AST);
				match(STRING);
				if ( inputState.guessing==0 ) {
					
					tmp.addElement(s.getText());
					opera=remplitToken(s);
							res=new Chaine(tmp,opera);
						
				}
				string_AST = (tinyeiffel.compiler.ASTDefaut)currentAST.root;
				break;
			}
			case STRING2:
			{
				s1 = LT(1);
				s1_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(s1);
				astFactory.addASTChild(currentAST, s1_AST);
				match(STRING2);
				if ( inputState.guessing==0 ) {
					tmp.addElement(s1.getText());opera=remplitToken(s1);
				}
				{
				_loop37:
				do {
					if ((LA(1)==STRING3)) {
						s2 = LT(1);
						s2_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(s2);
						astFactory.addASTChild(currentAST, s2_AST);
						match(STRING3);
						if ( inputState.guessing==0 ) {
							
											str=s2.getText();
											tmp.addElement(str);
										
						}
					}
					else {
						break _loop37;
					}
					
				} while (true);
				}
				s3 = LT(1);
				s3_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(s3);
				astFactory.addASTChild(currentAST, s3_AST);
				match(STRING4);
				if ( inputState.guessing==0 ) {
					tmp.addElement(s3.getText());
				}
				if ( inputState.guessing==0 ) {
					
							res=new Chaine(tmp,opera);
						
				}
				string_AST = (tinyeiffel.compiler.ASTDefaut)currentAST.root;
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				
						logging.erreur(new ErreurSource("Erreur dans la chaine",ex.getLine(),
									ex.getColumn(),ex.getFilename()));
					
			} else {
				throw ex;
			}
		}
		returnAST = string_AST;
		return res;
	}
	
	public final Type  type() throws RecognitionException, TokenStreamException {
		Type res=null;
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		tinyeiffel.compiler.ASTDefaut type_AST = null;
		Token  id1 = null;
		tinyeiffel.compiler.ASTDefaut id1_AST = null;
		Token  co = null;
		tinyeiffel.compiler.ASTDefaut co_AST = null;
		Token  cf = null;
		tinyeiffel.compiler.ASTDefaut cf_AST = null;
		
		Expr e=null;
		Vector t=new Vector();
		Type t2;
		boolean expanded=false;
		
		
		try {      // for error handling
			id1 = LT(1);
			id1_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(id1);
			astFactory.addASTChild(currentAST, id1_AST);
			match(ID);
			{
			switch ( LA(1)) {
			case CROCHETO:
			{
				co = LT(1);
				co_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(co);
				astFactory.addASTChild(currentAST, co_AST);
				match(CROCHETO);
				{
				switch ( LA(1)) {
				case ID:
				{
					t2=type();
					astFactory.addASTChild(currentAST, returnAST);
					if ( inputState.guessing==0 ) {
						t.addElement(t2);
					}
					{
					_loop25:
					do {
						if ((LA(1)==VIRGULE)) {
							tinyeiffel.compiler.ASTDefaut tmp13_AST = null;
							tmp13_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(LT(1));
							astFactory.addASTChild(currentAST, tmp13_AST);
							match(VIRGULE);
							t2=type();
							astFactory.addASTChild(currentAST, returnAST);
							if ( inputState.guessing==0 ) {
								t.addElement(t2);
							}
						}
						else {
							break _loop25;
						}
						
					} while (true);
					}
					break;
				}
				case CROCHETF:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(LT(1), getFilename());
				}
				}
				}
				cf = LT(1);
				cf_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(cf);
				astFactory.addASTChild(currentAST, cf_AST);
				match(CROCHETF);
				break;
			}
			case LPAREN:
			case DOUBLE_POINT:
			case END:
			case DEFAULT:
			case CLUSTER:
			case EXTERNAL:
			case GENERATE:
			case VIRGULE:
			case CROCHETF:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			if ( inputState.guessing==0 ) {
				
						res=new TypeSimple(expanded,id1.getText(),t);//ajoute_type(res);
						res.set_token(remplitToken(id1),remplitToken(co),remplitToken(cf));
					
			}
			type_AST = (tinyeiffel.compiler.ASTDefaut)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				
						logging.erreur(new ErreurSource("Erreur dans le type",ex.getLine(),
									ex.getColumn(),ex.getFilename()));
					
			} else {
				throw ex;
			}
		}
		returnAST = type_AST;
		return res;
	}
	
	public final Expr  expr() throws RecognitionException, TokenStreamException {
		Expr e=null;
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		tinyeiffel.compiler.ASTDefaut expr_AST = null;
		
		Expr e1=null;
		
		
		try {      // for error handling
			e1=expr27();
			astFactory.addASTChild(currentAST, returnAST);
			if ( inputState.guessing==0 ) {
				e=e1;
			}
			expr_AST = (tinyeiffel.compiler.ASTDefaut)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				
						logging.erreur(new ErreurSource("Erreur dans l'expression",ex.getLine(),
									ex.getColumn(),ex.getFilename()));
					
			} else {
				throw ex;
			}
		}
		returnAST = expr_AST;
		return e;
	}
	
	public final Expr  expr27() throws RecognitionException, TokenStreamException {
		Expr res=null;
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		tinyeiffel.compiler.ASTDefaut expr27_AST = null;
		Token  n = null;
		tinyeiffel.compiler.ASTDefaut n_AST = null;
		Token  i = null;
		tinyeiffel.compiler.ASTDefaut i_AST = null;
		Token  r = null;
		tinyeiffel.compiler.ASTDefaut r_AST = null;
		Token  c = null;
		tinyeiffel.compiler.ASTDefaut c_AST = null;
		Token  d = null;
		tinyeiffel.compiler.ASTDefaut d_AST = null;
		Token  t = null;
		tinyeiffel.compiler.ASTDefaut t_AST = null;
		Token  f = null;
		tinyeiffel.compiler.ASTDefaut f_AST = null;
		
		Expr e=null,e1=null,e2=null;
		Vector param=null;
		Chaine str=null;
		tinyeiffel.ast.Token opera=null;
		
		
		try {      // for error handling
			switch ( LA(1)) {
			case ID:
			{
				n = LT(1);
				n_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(n);
				astFactory.addASTChild(currentAST, n_AST);
				match(ID);
				{
				switch ( LA(1)) {
				case LPAREN:
				{
					param=exec_param();
					astFactory.addASTChild(currentAST, returnAST);
					break;
				}
				case RPAREN:
				case VIRGULE:
				case FIN_ARRAY:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(LT(1), getFilename());
				}
				}
				}
				if ( inputState.guessing==0 ) {
					
								if(param!=null)
					{
									//res=new Expr(n.getText(),param);
					res=new Expr_Appel(n.getText(),param,remplitToken(n));
					}
								else
					{
									//res=new Expr(n.getText());
					res=new Expr_Var(n.getText(),remplitToken(n));
					}
								//res.oper=remplitToken(n);
							
				}
				expr27_AST = (tinyeiffel.compiler.ASTDefaut)currentAST.root;
				break;
			}
			case INT:
			{
				i = LT(1);
				i_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(i);
				astFactory.addASTChild(currentAST, i_AST);
				match(INT);
				if ( inputState.guessing==0 ) {
					
											/*res=new Expr(Expr.Entier);
											res.str=i.getText();
											res.oper=remplitToken(i);*/
					res=new Expr_Entier(i.getText(),remplitToken(i));
										
				}
				expr27_AST = (tinyeiffel.compiler.ASTDefaut)currentAST.root;
				break;
			}
			case STRING:
			case STRING2:
			{
				str=string();
				astFactory.addASTChild(currentAST, returnAST);
				if ( inputState.guessing==0 ) {
					res=new Expr_Chaine(str);
				}
				expr27_AST = (tinyeiffel.compiler.ASTDefaut)currentAST.root;
				break;
			}
			case REAL:
			{
				r = LT(1);
				r_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(r);
				astFactory.addASTChild(currentAST, r_AST);
				match(REAL);
				if ( inputState.guessing==0 ) {
					
											/*res=new Expr(Expr.Reel);
											res.str=r.getText();
											res.oper=remplitToken(r);*/
					res=new Expr_Reel(r.getText(),remplitToken(r));
										
				}
				expr27_AST = (tinyeiffel.compiler.ASTDefaut)currentAST.root;
				break;
			}
			case CHAR:
			{
				c = LT(1);
				c_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(c);
				astFactory.addASTChild(currentAST, c_AST);
				match(CHAR);
				if ( inputState.guessing==0 ) {
					
											res=new Expr_Car(c.getText(),remplitToken(c));
											//res.str=c.getText();
											//res.oper=remplitToken(c);
					//assert(res.oper!=null);
										
				}
				expr27_AST = (tinyeiffel.compiler.ASTDefaut)currentAST.root;
				break;
			}
			case LPAREN:
			{
				tinyeiffel.compiler.ASTDefaut tmp14_AST = null;
				tmp14_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp14_AST);
				match(LPAREN);
				e=expr();
				astFactory.addASTChild(currentAST, returnAST);
				tinyeiffel.compiler.ASTDefaut tmp15_AST = null;
				tmp15_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp15_AST);
				match(RPAREN);
				if ( inputState.guessing==0 ) {
					res=e;
				}
				expr27_AST = (tinyeiffel.compiler.ASTDefaut)currentAST.root;
				break;
			}
			case DEBUT_ARRAY:
			{
				d = LT(1);
				d_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(d);
				astFactory.addASTChild(currentAST, d_AST);
				match(DEBUT_ARRAY);
				if ( inputState.guessing==0 ) {
					param=new Vector();
				}
				{
				switch ( LA(1)) {
				case LPAREN:
				case ID:
				case INT:
				case REAL:
				case CHAR:
				case DEBUT_ARRAY:
				case TRUE:
				case FALSE:
				case STRING:
				case STRING2:
				{
					e1=expr();
					astFactory.addASTChild(currentAST, returnAST);
					if ( inputState.guessing==0 ) {
						param.addElement(e1);
					}
					{
					_loop34:
					do {
						if ((LA(1)==VIRGULE)) {
							tinyeiffel.compiler.ASTDefaut tmp16_AST = null;
							tmp16_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(LT(1));
							astFactory.addASTChild(currentAST, tmp16_AST);
							match(VIRGULE);
							e2=expr();
							astFactory.addASTChild(currentAST, returnAST);
							if ( inputState.guessing==0 ) {
								param.addElement(e2);
							}
						}
						else {
							break _loop34;
						}
						
					} while (true);
					}
					break;
				}
				case FIN_ARRAY:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(LT(1), getFilename());
				}
				}
				}
				tinyeiffel.compiler.ASTDefaut tmp17_AST = null;
				tmp17_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp17_AST);
				match(FIN_ARRAY);
				if ( inputState.guessing==0 ) {
					/*res=new Expr(Expr.Tableau);res.tableau=param;*/res=new Expr_Tableau(param,remplitToken(d));
				}
				expr27_AST = (tinyeiffel.compiler.ASTDefaut)currentAST.root;
				break;
			}
			case TRUE:
			{
				t = LT(1);
				t_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(t);
				astFactory.addASTChild(currentAST, t_AST);
				match(TRUE);
				if ( inputState.guessing==0 ) {
					/*res=new Expr(Expr.Vrai);res.oper=remplitToken(t);*/res=new Expr_Vrai(remplitToken(t));
				}
				expr27_AST = (tinyeiffel.compiler.ASTDefaut)currentAST.root;
				break;
			}
			case FALSE:
			{
				f = LT(1);
				f_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(f);
				astFactory.addASTChild(currentAST, f_AST);
				match(FALSE);
				if ( inputState.guessing==0 ) {
					/*res=new Expr(Expr.Faux);res.oper=remplitToken(f);*/res=new Expr_Faux(remplitToken(f));
				}
				expr27_AST = (tinyeiffel.compiler.ASTDefaut)currentAST.root;
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				
						logging.erreur(new ErreurSource("Erreur dans l'expression",ex.getLine(),
									ex.getColumn(),ex.getFilename()));
					
			} else {
				throw ex;
			}
		}
		returnAST = expr27_AST;
		return res;
	}
	
	public final Vector  exec_param() throws RecognitionException, TokenStreamException {
		Vector res=new Vector();
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		tinyeiffel.compiler.ASTDefaut exec_param_AST = null;
		
		Expr e1=null,e2=null;
		
		
		try {      // for error handling
			tinyeiffel.compiler.ASTDefaut tmp18_AST = null;
			tmp18_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp18_AST);
			match(LPAREN);
			{
			switch ( LA(1)) {
			case LPAREN:
			case ID:
			case INT:
			case REAL:
			case CHAR:
			case DEBUT_ARRAY:
			case TRUE:
			case FALSE:
			case STRING:
			case STRING2:
			{
				e1=expr();
				astFactory.addASTChild(currentAST, returnAST);
				if ( inputState.guessing==0 ) {
					res.addElement(e1);
				}
				{
				_loop41:
				do {
					if ((LA(1)==VIRGULE)) {
						tinyeiffel.compiler.ASTDefaut tmp19_AST = null;
						tmp19_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(LT(1));
						astFactory.addASTChild(currentAST, tmp19_AST);
						match(VIRGULE);
						e2=expr();
						astFactory.addASTChild(currentAST, returnAST);
						if ( inputState.guessing==0 ) {
							res.addElement(e2);
						}
					}
					else {
						break _loop41;
					}
					
				} while (true);
				}
				break;
			}
			case RPAREN:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			tinyeiffel.compiler.ASTDefaut tmp20_AST = null;
			tmp20_AST = (tinyeiffel.compiler.ASTDefaut)astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp20_AST);
			match(RPAREN);
			exec_param_AST = (tinyeiffel.compiler.ASTDefaut)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				
						logging.erreur(new ErreurSource("Erreur dans les parametres",ex.getLine(),
									ex.getColumn(),ex.getFilename()));
					
			} else {
				throw ex;
			}
		}
		returnAST = exec_param_AST;
		return res;
	}
	
	
	public static final String[] _tokenNames = {
		"<0>",
		"EOF",
		"<2>",
		"NULL_TREE_LOOKAHEAD",
		"\"system\"",
		"\"root\"",
		"LPAREN",
		"RPAREN",
		"DOUBLE_POINT",
		"\"end\"",
		"\"default\"",
		"\"cluster\"",
		"SEMI",
		"\"external\"",
		"\"generate\"",
		"ID",
		"CROCHETO",
		"VIRGULE",
		"CROCHETF",
		"LPARENT",
		"INT",
		"REAL",
		"CHAR",
		"DEBUT_ARRAY",
		"FIN_ARRAY",
		"TRUE",
		"FALSE",
		"STRING",
		"STRING2",
		"STRING3",
		"STRING4",
		"\"adapt\"",
		"\"all\"",
		"\"as\"",
		"\"check\"",
		"\"creation\"",
		"\"ensure\"",
		"\"exclude\"",
		"\"export\"",
		"\"ignore\"",
		"\"include\"",
		"\"invariant\"",
		"\"keep\"",
		"\"loop\"",
		"\"no\"",
		"\"option\"",
		"\"require\"",
		"\"rename\"",
		"\"use\"",
		"\"visible\"",
		"\"yes\"",
		"WS",
		"COMMENTAIRE",
		"FLECHED",
		"DEUX_POINT",
		"PLUS",
		"MOINS",
		"FOIS",
		"DIFF",
		"DIV_ENTIER",
		"DIV",
		"MOD",
		"EGAL",
		"INFS",
		"SUPS",
		"INF",
		"SUP",
		"POINT",
		"AFFECT",
		"TENTATIVE_AFFECT",
		"PUISS",
		"EXCLAMATION",
		"ACOLADEO",
		"ACOLADEF",
		"DIGIT",
		"EXPOSANT",
		"CLASS",
		"FEATURE",
		"INDEXING"
	};
	
	protected void buildTokenTypeASTClassMap() {
		tokenTypeToASTClassMap=null;
	};
	
	private static final long[] mk_tokenSet_0() {
		long[] data = { 2L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_0 = new BitSet(mk_tokenSet_0());
	private static final long[] mk_tokenSet_1() {
		long[] data = { 32L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_1 = new BitSet(mk_tokenSet_1());
	private static final long[] mk_tokenSet_2() {
		long[] data = { 384L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_2 = new BitSet(mk_tokenSet_2());
	private static final long[] mk_tokenSet_3() {
		long[] data = { 27136L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_3 = new BitSet(mk_tokenSet_3());
	private static final long[] mk_tokenSet_4() {
		long[] data = { 25088L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_4 = new BitSet(mk_tokenSet_4());
	private static final long[] mk_tokenSet_5() {
		long[] data = { 16896L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_5 = new BitSet(mk_tokenSet_5());
	private static final long[] mk_tokenSet_6() {
		long[] data = { 512L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_6 = new BitSet(mk_tokenSet_6());
	
	}
