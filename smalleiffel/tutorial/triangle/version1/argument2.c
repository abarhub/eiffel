#include<stdio.h>
#include<process.h>
#include<malloc.h>

int main(int argc,char *argv[],char *env[])
{
	int res,len,i,len2;
	char **arg1,*env1[]={""},**p,*arg2[]={"compile1","-cc lcc-win32","-clean",""};

	if(argc<2)
	{
		printf("Erreur: il faut un argument\n");
		return 1;
	}
	//res=spawnvpe(P_WAIT,argv[1],argv+1,env);
	len=argc-2;
	len2=sizeof(arg2)/sizeof(char*);
	arg1=calloc(sizeof(char*),len+1+len2);
	for(i=0;i<len2;i++)
		arg1[i]=arg2[i];

	for(i=0;i<len;i++)
		arg1[i+len2]=argv[i+2];

	arg1[len+len2]=NULL;
	for(p=arg1,i=0;*p!=NULL;p++,i++)
		printf("%d:%s\n",i,*p);
	res=spawnvpe(P_WAIT,arg1[0],arg1,env);
	if(res==0)
		printf("Ok\n");
	else
		printf("Erreur\n");
	free(arg1);
	return res;
}
