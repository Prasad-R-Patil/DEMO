// Display record where total is higest


#include<stdio.h>

struct stud
{
    int rno;
    char name[15];
    int m1,m2,m3;
    int total;

};


void findAvrage(struct stud *s)
{
    printf("\n---------------------------------------------------------");
    printf("\n rno\tname\t\ttotal\t\tAvrage");
    printf("\n---------------------------------------------------------"); 

    int Avg = 0; 

    for (int i = 0; i < 3; i++) 
    {
        Avg = ((s[i].m1 + s[i].m2 + s[i].m3) / 3);

        printf("\n %d\t%s\t\t%d\t\t%d", s[i].rno, s[i].name, s[i].total,Avg);

    }
   
}
void DisplyRecord(struct stud *s)
{
    printf("\n-----------------------------");
    printf("\n rno\tname\t\ttotal");
    printf("\n-----------------------------"); 

    for(int i = 0; i < 3; i++)
    {
                   
            printf("\n %d\t%s\t\t%d", s[i].rno, s[i].name, s[i].total);
       
    }
}

int main()
{
    struct stud s1[3];

    for(int i=0; i<3; i++)
    {
        printf("\n==================================================\n");
        printf("\nEnter Rno :- ");
        scanf("%d",&s1[i].rno);

        printf("\nEnter Name :- ");
        scanf("%s",&s1[i].name);

        printf("\nEnter m1 :- ");
        scanf("%d",&s1[i].m1);

        printf("\nEnter m2 :- ");
        scanf("%d",&s1[i].m2);

        printf("\nEnter m3 :- ");
        scanf("%d",&s1[i].m3);

        s1[i].total = s1[i].m1 + s1[i].m2 + s1[i].m3;
    }

    findAvrage(s1);
    DisplyRecord(s1);




    return 0;

}