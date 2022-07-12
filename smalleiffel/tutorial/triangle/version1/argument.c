#include<stdio.h>
#include<process.h>

int main(int argc,char *argv[],char *env[])
{
	int res;

	if(argc<2)
	{
		printf("Erreur: il faut un argument\n");
		return 1;
	}
	res=spawnvpe(P_WAIT,argv[1],argv+1,env);
	if(res==0)
		printf("Ok\n");
	else
		printf("Erreur\n");
	return res;
}
