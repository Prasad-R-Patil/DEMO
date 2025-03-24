#include<stdio.h>
#include<limits.h>
int main()
{
   printf("\n size of int = %d",sizeof(int));
   printf("\n Min value of int = %d", INT_MIN);
   printf("\n Max value of int = %d", INT_MAX);
   printf("\n Max value of unsigned int = %u", UINT_MAX);

   printf("\n size of char = %d",sizeof(char));
   printf("\n Min value of char = %d", SCHAR_MIN);
   printf("\n Max value of char = %d", SCHAR_MAX);
   printf("\n Max value of unsigned char = %d", UCHAR_MAX);

   
   printf("\n size of short = %d",sizeof(short));
   printf("\n Min value of short = %d", SHRT_MIN);
   printf("\n Max value of short = %d", SHRT_MAX);
   printf("\n Max value of unsigned short = %d", USHRT_MAX);

   printf("\n size of long = %d",sizeof(long));
   printf("\n Min value of long = %d", LONG_MIN);
   printf("\n Max value of long = %d", LONG_MAX);
   printf("\n Max value of unsigned long = %u", ULONG_MAX);

  //FLT_MIN , FLT_MAX, DBL_MIN,  DBL_MAX  LDBL_MIN, LDBL_MAX

   return 0;
}

  
