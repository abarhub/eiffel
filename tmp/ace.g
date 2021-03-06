header {
package tinyeiffel.lace;

import java.io.*;
import java.util.*;
import tinyeiffel.ast.*;
import tinyeiffel.erreur.*;
import tinyeiffel.compiler.*;
//41231231
}

class AceParser extends Parser;
options {
	buildAST = true;	// uses CommonAST by default
	ASTLabelType = "tinyeiffel.compiler.ASTDefaut";
	exportVocab=Ace; // les tokens sont exporte pour les treewalker
	//k=3;
	//importVocab=Eiffel;
}

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

}

ace returns [Ace res=null]
{
NomSysteme sys=null;
Type nom;
NomGrappe nomg=null;
NomFeature nomp=null;
Vector liste_grappe=null;
}
:
	SYSTEM sys=nom_systeme
	ROOT nom=nom_classe (LPAREN nomg=nom_grappe RPAREN)? 
				(DOUBLE_POINT nomp=nom_feature)?
	(defaut)?
	(liste_grappe=grappe)?
	(externe)?
	(generation)?
	END
	{
		res=new Ace(sys,nom,nomg,nomp,liste_grappe);
	}
;

defaut
:
	DEFAULT
	;

grappe returns [Vector res=new Vector()]
{
NomGrappe nom=null;
Chaine rep=null;
Grappe g=null;
}
:
	CLUSTER 
	(((nom_grappe DOUBLE_POINT) => nom=nom_grappe DOUBLE_POINT)? rep=string	
	{g=new Grappe(nom,rep);res.addElement(g);} SEMI
	)+
	;

externe
:
	EXTERNAL
	;

generation
:
	GENERATE
	;

nom_systeme returns [NomSysteme res=null]
{
tinyeiffel.ast.Token t;
}
:
	id:ID
	{
		t=remplitToken(id);
		res=new NomSysteme(t.text,t);
	}
	;

nom_grappe returns [NomGrappe res=null]
{
Chaine s;
}
:
	s=string	{res=new NomGrappe(s);}
	;

nom_classe returns [Type res=null]
{
Type d=null;
}
:
	d=type {res=d;}
	;
exception // for rule
	catch [RecognitionException ex] {
		logging.erreur(new ErreurSource("Erreur dans le nom de la classe",ex.getLine(),
					ex.getColumn(),ex.getFilename()));
	}

nom_feature returns [NomFeature res=null]
{
Chaine s1;
}
:
	id:ID	{
			res=new NomFeature(id.getText());
			res.set_token(remplitToken(id),null);
		}
	;
exception // for rule
	catch [RecognitionException ex] {
		logging.erreur(new ErreurSource("Erreur dans le nom d'attribut",ex.getLine(),
					ex.getColumn(),ex.getFilename()));
	}

type returns [Type res=null]
{
Expr e=null;
Vector t=new Vector();
Type t2;
boolean expanded=false;
}
:
	id1:ID (co:CROCHETO
		(t2=type {t.addElement(t2);}
			(VIRGULE t2=type {t.addElement(t2);})*)? cf:CROCHETF)?
	{
		res=new TypeSimple(expanded,id1.getText(),t);//ajoute_type(res);
		res.set_token(remplitToken(id1),remplitToken(co),remplitToken(cf));
	}
	;
exception // for rule
	catch [RecognitionException ex] {
		logging.erreur(new ErreurSource("Erreur dans le type",ex.getLine(),
					ex.getColumn(),ex.getFilename()));
	}



expr returns [Expr e=null]
{
Expr e1=null;
}
: e1=expr27 {e=e1;}
	;
exception // for rule
	catch [RecognitionException ex] {
		logging.erreur(new ErreurSource("Erreur dans l'expression",ex.getLine(),
					ex.getColumn(),ex.getFilename()));
	}

expr27 returns [Expr res=null]
{
Expr e=null,e1=null,e2=null;
Vector param=null;
Chaine str=null;
tinyeiffel.ast.Token opera=null;
}
:
	(ID (LPARENT)?) => n:ID (param=exec_param)?
		{
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
	| i:INT			{
						/*res=new Expr(Expr.Entier);
						res.str=i.getText();
						res.oper=remplitToken(i);*/
                                                res=new Expr_Entier(i.getText(),remplitToken(i));
					}
	| str=string		{res=new Expr_Chaine(str);}
	| r:REAL		{
						/*res=new Expr(Expr.Reel);
						res.str=r.getText();
						res.oper=remplitToken(r);*/
                                                res=new Expr_Reel(r.getText(),remplitToken(r));
					}
	| c:CHAR		{
						res=new Expr_Car(c.getText(),remplitToken(c));
						//res.str=c.getText();
						//res.oper=remplitToken(c);
                                                //assert(res.oper!=null);
					}
	| LPAREN e=expr RPAREN		{res=e;}
	| d:DEBUT_ARRAY {param=new Vector();}
		(e1=expr {param.addElement(e1);}
		(VIRGULE e2=expr {param.addElement(e2);})* )?
		FIN_ARRAY	{/*res=new Expr(Expr.Tableau);res.tableau=param;*/res=new Expr_Tableau(param,remplitToken(d));}
	| t:TRUE			{/*res=new Expr(Expr.Vrai);res.oper=remplitToken(t);*/res=new Expr_Vrai(remplitToken(t));}
	| f:FALSE			{/*res=new Expr(Expr.Faux);res.oper=remplitToken(f);*/res=new Expr_Faux(remplitToken(f));}
	;
exception // for rule
	catch [RecognitionException ex] {
		logging.erreur(new ErreurSource("Erreur dans l'expression",ex.getLine(),
					ex.getColumn(),ex.getFilename()));
	}

string returns [Chaine res=null]
{
Vector tmp=new Vector();
boolean suite=false;
String str="";
tinyeiffel.ast.Token opera=null;
}
:
	s:STRING
	{
                tmp.addElement(s.getText());
                opera=remplitToken(s);
		res=new Chaine(tmp,opera);
	}
	| s1:STRING2 {tmp.addElement(s1.getText());opera=remplitToken(s1);}
		( s2:STRING3
			{
				str=s2.getText();
				tmp.addElement(str);
			})*
		s3:STRING4 {tmp.addElement(s3.getText());}
	{
		res=new Chaine(tmp,opera);
	}
;
exception // for rule
	catch [RecognitionException ex] {
		logging.erreur(new ErreurSource("Erreur dans la chaine",ex.getLine(),
					ex.getColumn(),ex.getFilename()));
	}

exec_param returns [Vector res=new Vector()]
{
Expr e1=null,e2=null;
}
:
	LPAREN (e1=expr {res.addElement(e1);}
		(VIRGULE e2=expr {res.addElement(e2);})*)? RPAREN
	;
exception // for rule
	catch [RecognitionException ex] {
		logging.erreur(new ErreurSource("Erreur dans les parametres",ex.getLine(),
					ex.getColumn(),ex.getFilename()));
	}


class AceLexer extends Lexer;
options {
	testLiterals=false;
	k=2;
	//exportVocab=Eiffel;
	defaultErrorHandler=false;
}

tokens { // les mots cles
ADAPT="adapt";ALL="all";AS="as";
CHECK="check";CLUSTER="cluster";CREATION="creation";
DEFAULT="default";END="end";ENSURE="ensure";
EXCLUDE="exclude";EXPORT="export";EXTERNAL="external";
GENERATE="generate";IGNORE="ignore";INCLUDE="include";
INVARIANT="invariant";KEEP="keep";LOOP="loop";NO="no";
OPTION="option";REQUIRE="require";RENAME="rename";ROOT="root";
SYSTEM="system";USE="use";VISIBLE="visible";YES="yes";

/*AND="and";DO="do";ELSE="else";END="end";
IF="if";
NOT="not";OR="or";THEN="then";
XOR="xor";TRUE="true";FALSE="false";CLASS="class";
FEATURE="feature";IS="is";DEFERRED="deferred";
ALIAS="alias";ALL="all";
AS="as";CHECK="check";CREATION="creation";DEBUG="debug";
ELSEIF="elseif";ENSURE="ensure";EXPANDED="expanded";EXPORT="export";
EXTERNAL="external";FROM="from";
FROZEN="frozen";IMPLIES="implies";INDEXING="indexing";INFIX="infix";
INHERIT="inherit";INSPECT="inspect";
INVARIANT="invariant";LIKE="like";LOCAL="local";LOOP="loop";
OBSOLETE="obsolete";OLD="old";ONCE="once";
PREFIX="prefix";REDEFINE="redefine";RENAME="rename";REQUIRE="require";
RESCUE="rescue";RETRY="retry";SELECT="select";
SEPARATE="separate";UNDEFINE="undefine";UNTIL="until";VARIANT="variant";
WHEN="when";STRIP="strip";UNIQUE="unique";*/
//STRING2;STRING3;STRING4;
}

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
}

WS	:	(' '
	|	'\t'
	|	'\n' {newline();}
	|	'\r')
		{ _ttype = Token.SKIP; }
	;

COMMENTAIRE
{
int ligne=-1,colonne=-1;
}
:
	"--" {ligne=getLine();colonne=getColumn();} 
		(~('\n'))*  { _ttype = Token.SKIP;
				ajoute_commentaire($getText,
					new tinyeiffel.ast.Token(ligne,colonne,
							$getText,"")); }
	;

LPAREN:	"(";
RPAREN:	")";
CROCHETO: "[";
CROCHETF: "]";
FLECHED:	"->";
DEUX_POINT: "..";
PLUS:	"+";
MOINS:	"-";
FOIS:	"*";
DIFF: "/=";
DIV_ENTIER:	"//";
DIV:	"/";
MOD:	"\\\\";
EGAL: "=" ;
DEBUT_ARRAY: "<<";
FIN_ARRAY: ">>";
INFS: "<";
SUPS: ">";
INF: "<=";
SUP: ">=";
SEMI:	";" ;
VIRGULE: "," ;
POINT:	"." ;
DOUBLE_POINT: ":" ;
AFFECT:	":=" ;
TENTATIVE_AFFECT:"?=" ;
PUISS: "^";
EXCLAMATION: "!";
ACOLADEO:	"{";
ACOLADEF:	"}";

INT	:	/*(("-")? DIGIT ) => ("-")?*/ (DIGIT)+ //{_ttype=INT;}
		({LA(2)!='.'}? '.' (DIGIT)* (/*('e' DIGIT)=>*/EXPOSANT)? {_ttype=REAL;}
		| //{_ttype=INT;}
		) //{_ttype=INT;}
		//| "-" {_ttype=MOINS;}
	;
REAL	:	{LA(2)!='.'}? '.'(DIGIT)+ (/*('e' DIGIT)=>*/EXPOSANT)?
	;
ID	options {testLiterals=true;}:
	('a'..'z'|'A'..'Z'|'_')('a'..'z'|'A'..'Z'|'_'|DIGIT)*
	{/*System.out.println("mot trouve:"+getText());*/}
	;

STRING
{
String s;
}
:
	("\""|"%") (('%' ~('\n'|'\r'|'\t'))|~('\"'|'%'))+ ("\""|"%")
			{
				//System.out.println("string :"+getText());
				s=getText();
				if(s.endsWith("%")&&s.startsWith("%"))
					_ttype=STRING3;
				else if(s.endsWith("%"))
					_ttype=STRING2;
				else if(s.startsWith("%"))
					_ttype=STRING4;
			}
	;

CHAR:
	"'" (('%' .)|~('\''|'%'))+ "'"		{/*System.out.println("char :"+getText());*/}
	;

protected
DIGIT
	:	'0'..'9'
	;

// a ameliorer (ici, pb si erreur de syntaxe)
EXPOSANT:	{LA(1)=='e'}? 'e' ('+'|'-')? (DIGIT)+
	;

class AceTreeWalker extends TreeParser;
options {
	//buildAST = true;	// uses CommonAST by default
	ASTLabelType = "ASTDefaut";
	//exportVocab=Eiffel; // les tokens sont exporte pour les treewalker
	//k=3;
}


programme:
	#(CLASS (index)? n:ID FEATURE/* (feature)* END*/)
		{
			System.out.println("Programme:");
			Classe c=new Classe(false,false,/*#n.getText()*/null,null,null,
						null,null,null,null,null);
			//#programme.ast=c;
		}
	;

index:
	#(INDEXING (ID DOUBLE_POINT (ID|STRING)+ SEMI )+)
	{

	}
	;
/*
feature:
	#(ID (FEATURE)? (decl_param)? IS corps)
	;

decl_param:
	#(LPAREN (ID)* RPAREN)
	;

corps:
	(REQUIRE liste_expr)? corps2 (ENSURE expr)? END
	| expr
	;

/*var: #(VAR ((i:ID {System.out.println("declaration var :"+i.getText());})+
		DOUBLE_POINT type)+ );

type:
	t1:ID	{System.out.println("type:"+t1.getText());}
	| #(t2:ARRAY type)
		{System.out.println("type:"+t2.getText()+"["/*+n1.getText()+".."+n2.getText()//+"]");}
	| #(LPAREN (ID)+)
		{System.out.println("type liste");}
	| #(DEUX_POINT inf:INT sup:INT)
		{System.out.println("type intervalle:"+inf.getText()+".."+sup.getText());}
	;

begin:
	#(BEGIN (instr) *)
	;

instr:
	#(AFFECT ID expr)	  {System.out.println("Affectation");}
	| #(i:ID (expr)*)	{System.out.println("Appel de procedure:"+i.getText());}
	| #(IF expr THEN instr (ELSE instr)?)  {System.out.println("if");}
	| #(BEGIN (instr)*)	{System.out.println("bloc if");}
	| #(CASE {System.out.println("coucou1/2");} expr {System.out.println("coucou1");}
		(constante DOUBLE_POINT instr)+)
		{System.out.println("case");}
	| #(FOR ID AFFECT expr (TO|DOWNTO) expr DO instr) {System.out.println("for");}
	| #(WHILE expr DO instr) {System.out.println("while");}
	| #(REPEAT (instr)+ UNTIL expr) {System.out.println("repeat");}
	;

constante:
	ID
	| INT
	| STRING
	| REAL
	;

expr
{
Expr e;
}
:
	( #(PLUS expr expr) ) => #(PLUS expr expr) {System.out.println("plus"/*+#PLUS.//);}
	| ( #(MOINS expr expr) ) => #(MOINS expr expr)
	| #(FOIS expr expr)
	| #(DIV expr expr)
	| i:INT			{System.out.println("nombre:"+i.getText());}
	// il faut considere que s'il n'y a pas de parametre, c'est dans id qu'il est
	| (#(ID expr)) => #(n:ID (expr)+)	{System.out.println("Appel de fonction:"+n.getText());}
	| id:ID			{System.out.println("variable:"+id.getText());					}
	| str:STRING		{System.out.println("Chaine:"+str.getText());}
	| #(EGAL expr expr)
	| #(DIFF expr expr)
	| #(INFS expr expr)
	| #(SUPS expr expr)
	| #(INF expr expr)
	| #(SUP expr expr)
	| #(IN expr expr)
	| #(OR expr expr)
	| #(XOR expr expr)
	| #(DIV_ENTIER expr expr)
	| #(MOD expr expr)
	| #(AND expr expr)
	| #(SHL expr expr)
	| #(SHR expr expr)
	| #(NOT expr)
	| #(PLUS expr)		 {System.out.println("plus unaire");}
	| #(MOINS expr)
	| r:REAL
		{
		System.out.println("nombre reel:"+r.getText());
		e=new Expr();
		e.op=Expr.Reel;
		e.reel=0.2;
		#r.ast=e;
		}
	| TRUE			{System.out.println("true");}
	| FALSE			{System.out.println("false");}
	;
*/