// Display record where name start S char


#include<stdio.h>

struct stud
{
    int rno;
    char name[15];
    int m1,m2,m3;
    int total;

};


void DisplyRecord(struct stud *s)
{
    printf("\n-----------------------------");
    printf("\n rno\tname\t\ttotal");
    printf("\n-----------------------------"); 

    for(int i = 0; i < 3; i++)
    {
        if(((s[i].name[0])=='s')||((s[i].name[0])=='S'))
        {
                   
            printf("\n %d\t%s\t\t%d", s[i].rno, s[i].name, s[i].total);
        }
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

    DisplyRecord(s1);




    return 0;

}