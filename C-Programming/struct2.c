
#include<stdio.h>



struct stud{
	int rno;
	char name[15];
	float m1,m2,m3;
	float total;
};

void display(struct stud *s)
{
	printf("\n-----------------------------");
    printf("\n rno\tname\t\ttotal");
    printf("\n-----------------------------");

    for (int i = 0; i < 3; i++) {
        printf("\n %d\t%s\t\t%f", s[i].rno, s[i].name, s[i].total);
    }

}

int main()
{
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
	
	return 0;
}


