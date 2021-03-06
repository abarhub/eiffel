#ifndef STRUCT_TEIF
#define STRUCT_TEIF

#ifdef __cplusplus
//extern "C" {
#endif

#define TEIF_Bool int

struct TEIF_Classe;
struct TEIF_Expr;

struct TEIF_Token
{
	int x,y;
	char *text,*file;
};

struct TEIF_Position
{
	int x,y;
};

struct TEIF_Type
{
	char *nom;
	TEIF_Bool est_like,is_from,expanded;
	struct TEIF_Type **(*generique) /* *(*x)[] */;
	int taille_generique;
	struct TEIF_Expr *like;
	struct TEIF_Token *tnom,*tcrochet_ouvr,*tcrochet_ferm,
            *tlike,*tfleche;
	struct TEIF_Position *debut,*fin;
};

struct TEIF_Chaine
{
	char *(*liste)[] /* *(*x)[] */;
	int taille_liste;
	struct TEIF_Token *token;
};

struct TEIF_Indexing
{
	char *nom;
	char **(*liste) /* *(*x)[] */;
	int taille_liste;
};

enum EExpr {Plus=1,Moins=2,Fois=3,Div=4,Div_entier=5,Chaine=6,Entier=7,
		Reel=8,Char=9,Vrai=10,Faux=11,Mod=12,Old=13,Not=14,PlusU=15,MoinsU=16,
		Point=17,Puiss=18,Xor=19,Or=20,And=21,And_Then=22,Or_Else=23,Implies=24,
		Egal=25,Diff=26,Infs=27,Inf=28,Sup=29,Sups=30,Appel=31,Var=32,Tableau=33,
		Free_Op=34,Free_OpU=35,Dollard=36};

struct TEIF_Expr
{
	//enum{TEIF_Var,TEIF_Entier} type;
	enum EExpr /*{Plus=1,Moins=2,Fois=3,Div=4,Div_entier=5,Chaine=6,Entier=7,
		Reel=8,Char=9,Vrai=10,Faux=11,Mod=12,Old=13,Not=14,PlusU=15,MoinsU=16,
		Point=17,Puiss=18,Xor=19,Or=20,And=21,And_Then=22,Or_Else=23,Implies=24,
		Egal=25,Diff=26,Infs=27,Inf=28,Sup=29,Sups=30,Appel=31,Var=32,Tableau=33,
		Free_Op=34,Free_OpU=35,Dollard=36}*/ op;
	struct TEIF_Type *type_retour;
	TEIF_Bool erreur;
	struct TEIF_Classe *classe;
	char *nom,*free_op,*str;
	struct TEIF_Expr *(*parametre)[] /* *(*x)[] */,*expr1,*expr2,
	    *(*tableau)[] /* *(*x)[] */;
	int taille_parametre,taille_tableau;
	struct TEIF_Chaine *str2;
	struct TEIF_Token *token;
};

struct TEIF_Assert
{
	char *nom;
	struct TEIF_Expr *expr;
};

enum EInstr {TEIF_Affect,TEIF_Appel,TEIF_Check,TEIF_Creation,TEIF_Debug,
	    TEIF_Else,TEIF_ElseIf,TEIF_If,TEIF_Inspect,TEIF_Loop,TEIF_Retry,
	    TEIF_TentAffect};

struct TEIF_Instr
{
	enum EInstr /*{TEIF_Affect,TEIF_Appel,TEIF_Check,TEIF_Creation,TEIF_Debug,
	    TEIF_Else,TEIF_ElseIf,TEIF_If,TEIF_Inspect,TEIF_Loop,TEIF_Retry,
	    TEIF_TentAffect}*/ type;
	struct TEIF_Expr *expr,*(*parametre)[] /* *(*x)[] */,*variant,
	    **(*when) /* *(*x)[] */ /*double tableau*/;
	char *nom,*var_current,*nom2;
	struct TEIF_Instr *suivant,*(*instr)[] /* *(*x)[] */,
	    *(*liste_instr)[] /* *(*x)[] */,*(*from)[] /* *(*x)[] */,
	    *(*loop)[] /* *(*x)[] */;
	struct TEIF_Assert **(*liste_expr) /* *(*x)[] */,
	    **(*invariant) /* *(*x)[] */;
	struct TEIF_Type *type_creation;
	struct TEIF_Chaine **(*chaine) /* *(*x)[] */;
	int taille_parametre,taille_when,taille_instr,taille_liste_instr,
	    taille_from,taille_loop,taille_liste_expr,taille_invariant,
	    taille_chaine;
	struct TEIF_Token *token1,*token2,*token3,*token4,*token5,*token6;
};

enum ENomFeature {TEIF_Nom_Normal,TEIF_Nom_Operateur};

struct TEIF_NomFeature
{
	enum ENomFeature /*{TEIF_Nom_Normal,TEIF_Nom_Operateur}*/ type;
	TEIF_Bool prefix,infix,frozen;
	char *nom;
	struct TEIF_Chaine *nom2;
	struct TEIF_Token *tnom,*tpre_in,*tfrozen;
	struct TEIF_Position *debut,*fin;
};

struct TEIF_DeclareVar
{
	char *nom;
	struct TEIF_Type *type;
	struct TEIF_Token *tnom;
};

struct TEIF_Commentaire
{
	char *str;
	struct TEIF_Token *debut;
};

typedef struct TEIF_Donnee *(TEIF_Fun_extern)(struct TEIF_Donnee *objet,
			struct TEIF_NomFeature *nom,
			struct TEIF_Donnee *(*param)[],int taille_param);

enum EFeature {TEIF_FeatureAttr,TEIF_FeatureDeferred,TEIF_FeatureExpr,
	    TEIF_FeatureExternal,TEIF_FeatureRoutine,TEIF_FeatureUnique};

struct TEIF_Feature
{
	enum EFeature /*{TEIF_FeatureAttr,TEIF_FeatureDeferred,TEIF_FeatureExpr,
	    TEIF_FeatureExternal,TEIF_FeatureRoutine,TEIF_FeatureUnique}*/ type;
	struct TEIF_NomFeature *(*liste_nom)[]/*[]*/;
	struct TEIF_DeclareVar *(*param)[] /* *(*x)[] */,*(*local)[] /* *(*x)[] */;
	struct TEIF_Assert *(*require)[] /* *(*x)[] */,*(*ensure)[] /* *(*x)[] */;
	struct TEIF_Type *type_retour,**(*export0) /* *(*x)[] */;
	struct TEIF_Instr **(*rescue) /* *(*x)[] */,*(*liste_instr)[] /* *(*x)[] */;
	struct TEIF_Commentaire **(*commentaire1) /* *(*x)[] */,
	    **(*commentaire2) /* *(*x)[] */,**(*commentaire3) /* *(*x)[] */;
	struct TEIF_Chaine *obsolete,*str,*alias;
	struct TEIF_Classe *classe;
	struct TEIF_Expr *expr;
	TEIF_Bool once;
	TEIF_Fun_extern *function_ext;
	int taille_liste_nom,taille_param,taille_local,taille_require,
		taille_ensure,taille_rescue,taille_liste_instr,
		taille_commentaire1,taille_commentaire2,taille_commentaire3;
	struct TEIF_Token *tfeature,*tobsolete,*trequire,*tensure,
            *trescue,*tunique,*tdeferred,*texternal,*talias,*tdo;
};

struct TEIF_Heritage
{
	struct TEIF_Type *type,**(*export_) /* *(*x)[] */;
	struct TEIF_NomFeature *(*rename)[] /* *(*x)[] */,
	    *(*undefine)[] /* *(*x)[] */,*(*redefine)[] /* *(*x)[] */,
	    *(*select)[] /* *(*x)[] */;
	int taille_export,taille_rename,taille_undefine,
	    taille_redefine,taille_select;
	struct TEIF_Token *therit,*trename,*texport,*tundefine,*tredefine,
		*tselect,*tend;
	struct TEIF_Position *debut,*fin;
};

struct TEIF_Creation
{
	struct TEIF_Type **(*type) /* *(*x)[] */;
	struct TEIF_NomFeature *(*nom_fonction)[] /* *(*x)[] */;
	int taille_type,taille_nomf;
	struct TEIF_Token *tcreation;
	struct TEIF_Position *debut,*fin;
};

struct TEIF_AttrAncetre
{
	struct TEIF_Type *type;
	struct TEIF_NomFeature *nom;
	//struct TEIF_Heritage *heritage;
	int ancetre;
};

struct TEIF_Attribut
{
	struct TEIF_NomFeature *nom;
	struct TEIF_Type *type;
	struct TEIF_Feature *feature_directe,*feature_reel;
	struct TEIF_AttrAncetre *(*ancetre)[] /* *(*x)[] */,
	    *(*descendant)[] /* *(*x)[] */;
	int taille_ancetre,taille_descendant;
};

struct TEIF_Classe
{
	TEIF_Bool deferred,expanded;
	struct TEIF_Type *type;
	struct TEIF_Feature *(*feature)[] /* *(*x)[] */;
	struct TEIF_Heritage *(*heritage)[] /* *(*x)[] */;
	struct TEIF_Assert **(*invariant) /* *(*x)[] */;
	struct TEIF_Creation *(*creation)[] /* *(*x)[] */;
	struct TEIF_Chaine *obsolete;
	struct TEIF_Indexing **(*index) /* *(*x)[] */;
	char **(*commentaires) /* *(*x)[] */;
	struct TEIF_Attribut *(*attr)[] /* *(*x)[] */;
	int taille_feature,taille_heritage,taille_invariant,
	    taille_creation,taille_index,taille_commentaire,
	    taille_attr;
	struct TEIF_Token *tclass,*texp_defer,
			*tobsolete,*tinvariant,*tend;
};

#ifdef __cplusplus
//}
#endif

#endif


