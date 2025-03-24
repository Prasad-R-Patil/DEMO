#include<stdio.h>
struct stud {
      int rno;
      char name[15];
      float m1, m2, m3;
      float total;
};

void display(struct stud *);   // function declaration

int main()
{
    struct stud s1;
    printf("\n Enter Rno :");
    scanf(" %d",&s1.rno);
    printf("\n Enter Name :");
    scanf(" %s",s1.name);
    printf("\n Enter 3 marks :");
    scanf(" %f",&s1.m1);
    scanf(" %f",&s1.m2);
    scanf(" %f",&s1.m3);
    s1.total = s1.m1 + s1.m2 + s1.m3;
    display(&s1);
    printf("\n After display () Rno = %d   Name = %s   Total = %f",s1.rno, s1.name, s1.total);
    printf("\n The End..");
    return 0;
}


void display(struct stud *s)
{
    s->rno = 100;   // (*s).rno
    printf("\n Rno = %d   Name = %s   Total = %f",s->rno, s->name, s->total);

}
