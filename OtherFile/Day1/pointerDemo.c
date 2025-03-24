#include<stdio.h>
int main()
{
   int  *ptr, num;
   ptr = (int *)malloc(sizeof(int));
   printf("\n Address of num = %d  ptr = %d",&num,ptr);
   *ptr = 50;
   printf("\n Value of ptr = %d",*ptr);
   free(ptr);
   printf("\n The End..");
   return 0;
}

