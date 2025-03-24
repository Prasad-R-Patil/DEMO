/*
#include<stdio.h>
int main()
{
   short i = 10;
   printf("\n Good morning!!!");
   for(  ;  ;  )
   {
      printf("\n Hello  %d", i);
      i = i - 2;
      if( i < = 0)   break;
   }
  printf("\n i = %d",i);
  printf("\n The End...");
  return 0;
}


________________________________________________________________

Assignments -

1.  print all even numbers from 1 to 50,   print sum of all even numbers also
2.  take a number from user and prints its table
3.  take a number and print its number of digits
4.  take a number print its sum of digits
5.  take a number and print its reverse
6.  sum of all numbers from 1 to 50
7.  take a number print factorial
8.  print series -
         1   4    9     25 ...   n terms
9.  take a number and print it is palindrome or not


#include<stdio.h>
int main()
{
    int i, sum = 0;
    for(i=2 ; i<=50 ; i++)
    {
      if((i % 2)==0)
      {
         printf("%d\t",i);
         sum = sum + i;        // sum = 6
      }

    }
    printf("\n i = %d",i);
    return 0;
}


#include<stdio.h>
int main()
{
   int i, num;

   printf("\n Enter  a number :");
   scanf(" %d", &num);                       //num = 3
   for(i = 1; i<=10 ; i++)                       // i = 4
      printf("\n %d * %d = %d", num, i, num * i);

   return 0;
}

3 * 1  = 3
3 * 2 = 6

num = 73589
output = 98537


num = 73589 / 10  =  7358  /  10 = 735  / 10 = 73 / 10 = 7 /10 = 0
    73589 % 10 = 9

 73589

 rev_num = 0
#include<stdio.h>
int main()
{
    int num, rev_num = 0, rem;
    printf("\n Enter  a number :");
    scanf(" %d", &num);                   
    for( ; num  > 0 ;  )
    {
        rem = num % 10;      // rem = 7
        rev_num = rev_num * 10  + rem;    // rev_num = 98537
        num = num / 10;        // num =  0                           
    }               

    printf("\n reverse number   = %d", rev_num);
    return 0;
}


num = 7

7 * 6 * 5 * 4 * 3 * 2 * 1


#include<stdio.h>
int main()
{
   int i, num, fact = 1;

   printf("\n Enter  a number :");
   scanf(" %d", &num);       

  for( i = 2 ; i<=num ;i++)
      fact = fact * i;


  printf("\n Factorial of %d = %d",num,fact);
  return 0;
}


#include<stdio.h>
int main()
{
   int i, num;

   printf("\n Enter  number of terms :");
   scanf(" %d", &num);       
  for(i = 1 ; i<=num; i++)
         printf("  %d", i * i);

   return 0;
}


#include<stdio.h>
int main()
{
    int num, rev_num = 0, temp ;
    printf("\n Enter  a number :");
    scanf(" %d", &num);           
    temp = num;        
    for( ; num  > 0 ;  )
    {
        rem = num % 10;      // rem = 7
        rev_num = rev_num * 10  + rem;    // rev_num = 98537
        num = num / 10;        // num =  0                           
    }               
    if(rev_num == temp)
       printf("\n Palindrome");

    return 0;
}

_______________________________________________

 1    3    6    10      15     21 .. n terms
    2    3     4       5      6                            t

#include<stdio.h>
int main()
{
    int i, n, t = 0;
    printf("\n Enter terms :");
    scanf(" %d", &n);
    for( i = 1 ; i<= n ;  i++)    // i = 4
    {
           t = t + i;                  t  = 10
           printf("  %d", t);    //   1      3      6     10
   }

_________________________________________________________________________

loop from 1 to 300
 print "Hi" if loop counter is divisible by 3
 print "Hello" if loop counter is divisible by 5
 print "Hello World" if loop counter is divisible by 3 and 5 both



#include<stdio.h>
int main()
{
    int i;
    for(i=1; i<= 300 ;i++)
    {
        if(((i%3)==0) && ((i%5) == 0)))
          printf("\n Hello World");
       else if((i%3) == 0)
          printf("\n Hi");
      else if((i % 5) == 0)
         printf("\n Hello");
    
    }
    return 0;
}

___________________________________________________


Take a number and find it is Prime number or not ?

#include<stdio.h>
int main()
{
   int num, i;

   printf("\n Enter a number :");
   scanf(" %d", &num);

   for( i = 2 ; i < num ; i++)  // i = 2
   {
       if((num % i) == 0)
       {
          break;
       }
   }

   if(num == i) 
       printf("\n %d is prime", num);
   else
      printf("\n %d is not prime", num);

   return 0;
}

__________________________________


H. W.

1 + 2 +  4 +  7  +  11 + 16 ...... n  terms

________________________________________


while loop

while(expression)  pre-condition
{
  stat-1;
  stat-2;
  stat-3;
}
stat-4;

_________________________________________


#include<stdio.h>
int main()
{
   int num, i;

   printf("\n Enter a number :");
   scanf(" %d", &num);
   i = 2 ;
   while(  i < num)  // i = 2
   {
       if((num % i) == 0)
       {
          break;
       }
       i++
   }

   if(num == i) 
       printf("\n %d is prime", num);
   else
      printf("\n %d is not prime", num);

   return 0;
}




take numbers from user and add all those number. User will enter -999 to stop this actitivty.


#include<stdio.h>
int main()
{
    int num, sum = 0;
    while(1)
    {
         printf("\n Enter a number (-999 to stop):");
         scanf(" %d", &num);
         

        sum = sum + num;
        if(num == -999)
             break;
     }
     printf("\n Sum = %d", sum);
     return 0;
}

take 3 numbers from user and print average of these 3 numbers
Repeat this until user gives 0 for all three numbers


#include<stdio.h>
int main()
{
    int num1, num2, num3, sum;
    float avg;
   for( ; ; )
    {
       printf("\n Enter 3 numbers (0, 0, 0 to Exit) : ");
       scanf(" %d %d %d", &num1, &num2, &num3);
       if((num1==0) &&(num2 == 0) && (num3==0))
            break;
       sum = num1 + num2 + num3;
       avg = sum / 3;
       printf("\n Avg = %f", avg);
   }
    return 0;
}

________________________________________




#include<stdio.h>
int main()
{
    int i;
    for(i=0 ;i<=255 ;i++)
        printf(" \n %c  -  %d", i, i);

    printf("\n The End..");
    return 0;
}

Find sum of all number from 1 to 1000, exclude multiple of 3 while doing sum

#include<stdio.h>
int main()
{
    int i, sum = 0;
    for(i=1 ; i<=1000 ; i++)
    {
        if(( i % 3) == 0)
           continue;
        sum = sum + i;
    }
    printf("\n Sum = %d", sum);
    return 0;
}

_______________________________________________________________________


Function -
*/

#include<stdio.h>

int factorial(int);      // function prototype / declaration / signature

int main()
{
   int num1,f;
   printf("\n Enter a number :");
   scanf(" %d", &num1);
   f = factorial(num1);
   printf("\n Factorial = %d", f);
   return 0;
}

int factorial()
{
   int i, f = 1;
   for(i=1 ;i <=5 ; i++)
        f = f * i;

    return f;
}
 































    


















  
































