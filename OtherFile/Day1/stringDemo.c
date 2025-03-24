#include<stdio.h>
int main()
{
    char name[20];
    int i, cnt = 0;
    printf("\n Enter char :");
    scanf(" %s",name);

   printf("\n Entered name is : %s",name);

   for(i = 0; name[i]!='\0' ; i++)
    {
        if(name[i] == 'a')
            cnt++;
    }
   printf("\n Occ of a = %d",cnt);
   printf("\n The End...");
   return 0;
}
