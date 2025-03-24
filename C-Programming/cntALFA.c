<<<<<<< HEAD
<<<<<<< HEAD
#include<stdio.h>
int main()
{
	char name[20];
	int cnt=0;
	
	printf("Enter Name :");
	scanf("%s",name);
	
	for(int i=0;name[i]!='\0';i++)
	{
		if (((name[i]>='a') && (name[i]<='z'))||((name[i]>='A') && (name[i]<='Z')))
			cnt++;
	}
	printf("%d",cnt);
=======
=======
>>>>>>> 7dbe379dd13eb771515615d48b2313cb49034e72
#include<stdio.h>
int main()
{
	char name[20];
	int cnt=0;
	
	printf("Enter Name :");
	scanf("%s",name);
	
	for(int i=0;name[i]!='\0';i++)
	{
		if (((name[i]>='a') && (name[i]<='z'))||((name[i]>='A') && (name[i]<='Z')))
			cnt++;
	}
	printf("%d",cnt);
<<<<<<< HEAD
>>>>>>> 7dbe379 (cmt)
=======
>>>>>>> 7dbe379dd13eb771515615d48b2313cb49034e72
}