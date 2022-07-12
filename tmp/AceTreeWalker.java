// $ANTLR 2.7.3: "ace.g" -> "AceTreeWalker.java"$

package tinyeiffel.lace;

import java.io.*;
import java.util.*;
import tinyeiffel.ast.*;
import tinyeiffel.erreur.*;
import tinyeiffel.compiler.*;
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


public class AceTreeWalker extends antlr.TreeParser       implements AceTokenTypes
 {
public AceTreeWalker() {
	tokenNames = _tokenNames;
}

	public final void programme(AST _t) throws RecognitionException {
		
		ASTDefaut programme_AST_in = (_t == ASTNULL) ? null : (ASTDefaut)_t;
		ASTDefaut n = null;
		
		try {      // for error handling
			AST __t112 = _t;
			ASTDefaut tmp21_AST_in = (ASTDefaut)_t;
			match(_t,CLASS);
			_t = _t.getFirstChild();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case INDEXING:
			{
				index(_t);
				_t = _retTree;
				break;
			}
			case ID:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			n = (ASTDefaut)_t;
			match(_t,ID);
			_t = _t.getNextSibling();
			ASTDefaut tmp22_AST_in = (ASTDefaut)_t;
			match(_t,FEATURE);
			_t = _t.getNextSibling();
			_t = __t112;
			_t = _t.getNextSibling();
			
						System.out.println("Programme:");
						Classe c=new Classe(false,false,/*#n.getText()*/null,null,null,
									null,null,null,null,null);
						//#programme.ast=c;
					
		}
		catch (RecognitionException ex) {
			reportError(ex);
			if (_t!=null) {_t = _t.getNextSibling();}
		}
		_retTree = _t;
	}
	
	public final void index(AST _t) throws RecognitionException {
		
		ASTDefaut index_AST_in = (_t == ASTNULL) ? null : (ASTDefaut)_t;
		
		try {      // for error handling
			AST __t115 = _t;
			ASTDefaut tmp23_AST_in = (ASTDefaut)_t;
			match(_t,INDEXING);
			_t = _t.getFirstChild();
			{
			int _cnt119=0;
			_loop119:
			do {
				if (_t==null) _t=ASTNULL;
				if ((_t.getType()==ID)) {
					ASTDefaut tmp24_AST_in = (ASTDefaut)_t;
					match(_t,ID);
					_t = _t.getNextSibling();
					ASTDefaut tmp25_AST_in = (ASTDefaut)_t;
					match(_t,DOUBLE_POINT);
					_t = _t.getNextSibling();
					{
					int _cnt118=0;
					_loop118:
					do {
						if (_t==null) _t=ASTNULL;
						switch ( _t.getType()) {
						case ID:
						{
							ASTDefaut tmp26_AST_in = (ASTDefaut)_t;
							match(_t,ID);
							_t = _t.getNextSibling();
							break;
						}
						case STRING:
						{
							ASTDefaut tmp27_AST_in = (ASTDefaut)_t;
							match(_t,STRING);
							_t = _t.getNextSibling();
							break;
						}
						default:
						{
							if ( _cnt118>=1 ) { break _loop118; } else {throw new NoViableAltException(_t);}
						}
						}
						_cnt118++;
					} while (true);
					}
					ASTDefaut tmp28_AST_in = (ASTDefaut)_t;
					match(_t,SEMI);
					_t = _t.getNextSibling();
				}
				else {
					if ( _cnt119>=1 ) { break _loop119; } else {throw new NoViableAltException(_t);}
				}
				
				_cnt119++;
			} while (true);
			}
			_t = __t115;
			_t = _t.getNextSibling();
			
			
				
		}
		catch (RecognitionException ex) {
			reportError(ex);
			if (_t!=null) {_t = _t.getNextSibling();}
		}
		_retTree = _t;
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
	
	}
	
