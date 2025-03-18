#include<stdio.h>



struct stud{
	int rno;
	char name[15];
	float m1,m2,m3;
	float total;
};

void display(struct stud *s)
{
	printf(" \n rno=%d name=%s total=%f",s->rno,s->name,s->total);
}


struct stud accept(struct stud *s)
{
	
    for(int i=0;i<3;i++)
	{
		printf("\n enter rno: ");
	scanf("%d",&s->rno);
	printf("\n enter name: ");
	scanf("%s",&s->name);
	printf("\n enter marks: ");
	scanf("%f",&s->m1);
	scanf("%f",&s->m2);
	scanf("%f",&s->m3);
	
	s->total=s->m1+s->m2+s->m3;
	display(s);
	}
	
}


int main()
{
	struct stud s[3];
	
	accept(s);
    //display(s1) ;
	printf("\n-----------------------------");
	printf("\n rno\tname\t\ttotal");
	printf("\n-----------------------------------");
	for(int i=0;i<3;i++)
	{
	 printf("\n %d\t%s\t\t=%f",s->rno,s->name,s->total);	
	}
	
	
	return 0;
}


