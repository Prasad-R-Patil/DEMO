/* Assignment:  Write function to accept record values
                Write function to display all records
                Write function to print all records where name is starting from a passed character
                Write function to return record where total is highest
*/
#include<stdio.h>
struct stud {
      int rno;
      char name[15];
      int m1, m2, m3;
      int total;
};

void accept_records(struct stud *);
void display_records(struct stud s[]);
void display_record_nameWise(struct stud *, char);
struct stud highest_total(struct stud *);
// lowest total
// average total marks

int main()
{
    struct stud s[3],res;
    char ch;
    accept_records(s);
  //  display_records(s);
  //  printf("\n Enter character to search in name :");
  //  scanf(" %c",&ch);

   // display_record_nameWise(s, ch);

    res = highest_total(s);

    printf("\n Rno = %d   name = %s    Total = %d",res.rno, res.name,res.total);
    printf("\n\n The End...");
    return 0;
}


void accept_records(struct stud *r)
{
    int i;
     for(i=0 ; i<3 ;i++)
    {
        printf("\n Enter Rno :");
        scanf(" %d",&r[i].rno);
        printf("\n Enter Name :");
        scanf(" %s",r[i].name);
        printf("\n Enter Marks :");
        scanf(" %d",&r[i].m1);
        scanf(" %d",&r[i].m2);
        scanf(" %d",&r[i].m3);
        r[i].total = r[i].m1 + r[i].m2 + r[i].m3;
    }

}

void display_records(struct stud *s)
{
   int i;
   printf("\n -------------------------------");
   printf("\n Rno\tName\t\tTotal ");
   printf("\n -------------------------------");
   for(i = 0;i<3;i++)
       printf("\n %d\t%s\t\t%d",s[i].rno,s[i].name,s[i].total);
}

void display_record_nameWise(struct stud *r, char ch)
{
    int i;
    for(i=0 ; i<3; i++)
    {
        if(r[i].name[0] == ch)
            printf("\n %d\t%s\t\t%d",r[i].rno,r[i].name,r[i].total);
    }
}

struct stud highest_total(struct stud *s)
{
  struct stud result;
  int i;
  result = s[0];
  for(i = 1; i<3 ; i++)
  {
      if(s[i].total > result.total)
        result = s[i];
  }

  return result;
} // end of function
