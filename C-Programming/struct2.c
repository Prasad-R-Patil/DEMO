<<<<<<< HEAD

=======
>>>>>>> 7dbe379dd13eb771515615d48b2313cb49034e72
#include<stdio.h>



struct stud{
	int rno;
	char name[15];
	float m1,m2,m3;
	float total;
};

<<<<<<< HEAD
void display(struct stud *s)
{
	printf("\n-----------------------------");
    printf("\n rno\tname\t\ttotal");
    printf("\n-----------------------------");

    for (int i = 0; i < 3; i++) {
        printf("\n %d\t%s\t\t%f", s[i].rno, s[i].name, s[i].total);
    }

=======
void display(struct stud s)
{
	printf(" \n rno=%d name=%s total=%f",s.rno,s.name,s.total);
>>>>>>> 7dbe379dd13eb771515615d48b2313cb49034e72
}

int main()
{
<<<<<<< HEAD
	struct stud s[3];
    
	int i=0;
	for(i=0; i<3; i++)
	{
		printf("\n enter rno: ");
	scanf("%d",&s[i].rno);
	printf("\n enter name: ");
	scanf("%s",&s[i].name);
	printf("\n enter marks: ");
	scanf("%f",&s[i].m1);
	scanf("%f",&s[i].m2);
	scanf("%f",&s[i].m3);
	
	s[i].total=s[i].m1+s[i].m2+s[i].m3;
	}
	
    display(s) ;   
	printf(" \n print in main function=> rno=%d name=%s total=%f",s[i].rno, s[i].name, s[i].total);
=======
	struct stud s1;
    
	printf("\n enter rno: ");
	scanf("%d",&s1.rno);
	printf("\n enter name: ");
	scanf("%s",&s1.name);
	printf("\n enter marks: ");
	scanf("%f",&s1.m1);
	scanf("%f",&s1.m2);
	scanf("%f",&s1.m3);
	
	s1.total=s1.m1+s1.m2+s1.m3;
    display(s1) ;   
	// printf(" \n rno=%d name=%s total=%f",s1.rno,s1.name,s1.total);
>>>>>>> 7dbe379dd13eb771515615d48b2313cb49034e72
	
	return 0;
}


