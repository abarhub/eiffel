#include<stdio.h>
#include "type_eiffel.h"

struct TEIF_Type global_type[1]={
{"TEST1",0,0,0,NULL,0,NULL}};

struct TEIF_NomFeature global_nomfeature[2]={
{TEIF_Nom_Normal,0,0,0,"make",NULL},
{TEIF_Nom_Normal,0,0,0,"make",NULL}};

struct TEIF_NomFeature *global_nomfeature_tab0[]={&(global_nomfeature[0])};
struct TEIF_NomFeature *global_nomfeature_tab1[]={&(global_nomfeature[1])};


struct TEIF_Feature global_feature[1]={
{TEIF_FeatureRoutine,&(global_nomfeature_tab0),NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,0}};

struct TEIF_Feature *global_feature_tab0[]={&(global_feature[0])};


struct TEIF_Creation global_creation[1]={
{NULL,&(global_nomfeature_tab1),0,1}};

struct TEIF_Creation *global_creation_tab0[]={&(global_creation[0])};


struct TEIF_Classe global_classe[1]={
{0,0,&(global_type[0]),&(global_feature_tab0),NULL,NULL,&(global_creation_tab0),NULL,NULL,NULL,1,0,0,1,0,0}};




void main()
{
	printf("Hello world!\n");
	printf("classe:taille_feature=%d,taille_heritage=%d,taille_invariant=%d,"
		"taille_creation=%d,taille_index=%d,taille_commentaire=%d\n",
		global_classe[0].taille_feature,global_classe[0].taille_heritage,
		global_classe[0].taille_invariant,global_classe[0].taille_creation,
		global_classe[0].taille_index,global_classe[0].taille_commentaire);
	printf("com=%p\n",global_classe[0].commentaires);
};

