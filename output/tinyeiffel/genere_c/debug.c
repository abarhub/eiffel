#include "memoire.h"
#include <stdio.h>
#include <assert.h>
#include "interprete.h"
#include "type_eiffel.h"
#include "debug.h"

void affiche0(struct TEIF_Donnee *objet,FILE *out,int no_level)
{
	assert(out!=NULL);
	assert(no_level>=0);
	if(objet==NULL)
	{
		fprintf(out,"Void");
	}
	else
	{
		double d;
		char *s="Void";
		switch(objet->type_donnee)
		{
			case EInt:
				fprintf(out,"I%d",objet->u.val_int);
				break;
			case EBool:
				fprintf(out,"B%s",((objet->u.val_bool==0)?"false":"true"));
				break;
			case EDouble:
				//d=objet->u.val_double;
				fprintf(out,"D%lf",objet->u.val_double);
				break;
			case EReal:
				fprintf(out,"R%f",objet->u.val_real);
				break;
			case EChar:
				fprintf(out,"C%c",objet->u.val_char);
				break;
			case EString:
				if(objet->u.val_string!=NULL)
					s=objet->u.val_string;
				fprintf(out,"S%s",s);
				break;
			case ENormal:
				if(no_level>0)
				{
					int i,j;
					struct TEIF_Membre *m;
					struct TEIF_Donnee *o;
					fprintf(out,"N[");	
					affiche_membre(objet->valeurs,out);
					/*j=0;
					for(i=0;i<NB_TABLE;i++)
					{
						m=objet->valeurs[i];
						while(m!=NULL)
						{
							if(j>0)
								fprintf(out,",");
							affiche0(m->donnee,out,no_level-1);
							j++;
							m=m->suivant;
						}
					}*/
					fprintf(out,"]");
				}
				else
				{
					fprintf(out,"N[...]");
				}
				break;
			default:
				assert(0);
		}
	}
}

void affiche_type(struct TEIF_Type *type,FILE *f)
{
	assert(f!=NULL);
	if(type==NULL)
	{
		return;
	}
	else
	{
		fprintf(f,"%s",type->nom);
	}
}

void affiche_membre(struct TEIF_Membre **(tab),FILE *f)
{
	int i,j;
	assert(f!=NULL);
	if(tab==NULL)
	{
		return;
	}
	else
	{
		struct TEIF_Membre *m;
		j=0;
		for(i=0;i<NB_TABLE;i++)
		{
			m=tab[i];
			while(m!=NULL)
			{
				if(j>0)
					fprintf(f,",");
				fprintf(f,"%s:",m->nom);
				affiche_type(m->type,f);
				fprintf(f,"=");
				affiche(m->donnee,f);
				j++;
				m=m->suivant;
			}
		}
	}
}

void affiche_stack(struct TEIF_Frame *frame)
{
	int i;
	struct TEIF_Frame *f;
	FILE *file=stdout;
	f=frame;
	i=0;
	fprintf(file,"Liste des frames:\n");
	while(f!=NULL)
	{
		fprintf(file,"%d) ",i);
		affiche(f->objet_courant,file);
		fprintf(file,"local:{");
		affiche_membre(f->local,file);
		fprintf(file,"}\n");
		fprintf(file,"param:{");
		affiche_membre(f->param,file);
		fprintf(file,"}\n");
		fprintf(file,"\n",i);
		i++;
		f=f->precedant;
	}
	fprintf(file,"Fin de la liste des frames\n");
}
