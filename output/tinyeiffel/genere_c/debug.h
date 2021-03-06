#ifndef _DEBUG_AFF_
#define _DEBUG_AFF_

#include <stdio.h>
#include "interprete.h"
#include "type_eiffel.h"

void affiche0(struct TEIF_Donnee *objet,FILE *out,int no_level);
void affiche_type(struct TEIF_Type *type,FILE *f);
void affiche_membre(struct TEIF_Membre **(tab),FILE *f);
void affiche_stack(struct TEIF_Frame *frame);

#define affiche(x,y)   affiche0(x,y,2)

#endif