<<<<<<< HEAD
/*

//old code

=======
>>>>>>> 7dbe379dd13eb771515615d48b2313cb49034e72
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

<<<<<<< HEAD
*/


// update new code

#include <stdio.h>

struct stud {
    int rno;
    char name[15];
    float m1, m2, m3;
    float total;
};

void display(struct stud *s) {
    printf("\n rno=%d name=%s total=%f", s->rno, s->name, s->total);
}

void accept(struct stud *s)
 {
    for (int i = 0; i < 3; i++) {
        printf("\n Enter rno: ");
        scanf("%d", &s[i].rno);
        printf("\n Enter name: ");
        scanf("%s", s[i].name);
        printf("\n Enter marks: ");
        scanf("%f %f %f", &s[i].m1, &s[i].m2, &s[i].m3);

        s[i].total = s[i].m1 + s[i].m2 + s[i].m3;
        
    }
}

int main() {
    struct stud s[3];

    accept(s);

    printf("\n-----------------------------");
    printf("\n rno\tname\t\ttotal");
    printf("\n-----------------------------");

    for (int i = 0; i < 3; i++) {
        printf("\n %d\t%s\t\t%f", s[i].rno, s[i].name, s[i].total);
    }

    return 0;
}
=======

>>>>>>> 7dbe379dd13eb771515615d48b2313cb49034e72
