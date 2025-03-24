<<<<<<< HEAD
<<<<<<< HEAD
#include<stdio.h>
int main()
{
	char name[5][10];
	
	int i;
	int cnt =0;
	
	for(i=0;i<5;i++)
	{
	 printf("enter names _:");
	 scanf("%s",name[i]);
	}
	for(i=0;i<5;i++)
	{   
		for(int j=0;name[i][j]!='\0';j++)
		{
			if((name[i][j]=='a')||(name[i][j]=='e')||(name[i][j]=='i')||(name[i][j]=='o')||(name[i][j]=='u'))
		cnt++;
		}
		
	}
	printf("\n Count of vowel id :- %d ",cnt);
	
	
	return 0;
}
=======
=======
>>>>>>> 7dbe379dd13eb771515615d48b2313cb49034e72
#include<stdio.h>
int main()
{
	char name[5][10];
	
	int i;
	int cnt =0;
	
	for(i=0;i<5;i++)
	{
	 printf("enter names _:");
	 scanf("%s",name[i]);
	}
	for(i=0;i<5;i++)
	{   
		for(int j=0;name[i][j]!='\0';j++)
		{
			if((name[i][j]=='a')||(name[i][j]=='e')||(name[i][j]=='i')||(name[i][j]=='o')||(name[i][j]=='u'))
		cnt++;
		}
		
	}
	printf("\n Count of vowel id :- %d ",cnt);
	
	
	return 0;
}
<<<<<<< HEAD
>>>>>>> 7dbe379 (cmt)
=======
>>>>>>> 7dbe379dd13eb771515615d48b2313cb49034e72
