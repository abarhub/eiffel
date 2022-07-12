#include <stdio.h>
#include <process.h>
#include <stdlib.h>
#include <string.h>
//#include <winuser.h>

char compile_java[]="ant";
char compile_eiffel[]="java -classpath test_unitaire\junit.jar;.;E:\java\xerces-2_5_0\xercesImpl.jar;E:\java\xerces-2_5_0\xmlParserAPIs.jar;c:\antlr-2.7.3\antlr.jar -ea compiler.Eiffel -f %s";
char compile_c[]="bcc32 -w- -y -v genere_c\test1.c genere_c\programme.c genere_c\interprete.c";
char *execute="test1.exe";

int execution(char fichier[])
{
	int res;
	char buf[512],*p;
	strcpy(buf,fichier);
	p=buf;
	//res=execlpe(P_WAIT,p,p,NULL);
	//res=spawnlpe(P_WAIT,p,p,NULL);
	//res=system(fichier);
	res=system("genere_c\\run.bat test1.exe");
	//res=winexec(p,SW_SHOWNORMAL);
	return res;
}

void execution_ou_fin(char fichier[])
{
	int res;
	res=spawnlpe(P_WAIT,fichier,fichier,NULL);
	if(res!=0)
	{
		printf("Erreur:Il y a eu une erreur durant l'execution (%d)\n",res);
		exit(0);
	}
}


int main(int argc, char *argv[])
{
	int res;
	char *p;
	printf("Test des fichiers:\n");
	p="dir";
	p=".\\test1.exe";
	//p=execute;
	//res=spawnlpe(P_WAIT,p,p,NULL);
	//res=system(p);
	res=execution(p);
	//res=execution(execute);
	if(res!=0)
	{
		printf("Erreur:Il y a eu une erreur durant l'execution (%d)\n",res);
		exit(0);
	}
	
	printf("\nFin des testes(%d)\n",res);
	return 0;
}
