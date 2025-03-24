#include<stdio.h>

 int isPrime(int);
 void accept_array_elements(int *);       
 void display(int *);
 int sum(int *);
 void print_even(int *);
 int max(int *);
 //int min(int *);
 void prime_numbers(int *);
 int sum_prime(int *);

int main()
{
  int arr[10] = {11,22,31,43,5,67,72,81,9,177}, ch;
  do {
  	printf("\n 1. Accept values for array elements ");     // void accept_array_elements(int *);       
    printf("\n 2. Display array elements ");                      // void display(int *);
    printf("\n 3. Sum of array elements ");                       // int sum(int *);
    printf("\n 4. Print all even numbers from array");    // void print_even(int *);
    printf("\n 5. Biggest number in array  ");                   // int max(int *);
    printf("\n 6. Lowest number in array ");                    // int min(int *);
    printf("\n 7. Print all prime numbers in array  ");      // void prime_numbers(int *);
    printf("\n 8. Sum of all prime numbers in array ");  //  int sum_prime(int *);
    printf("\n 9. Exit");
    printf("\n Enter your choice (1..9) ");
    scanf(" %d",&ch);
    if(!((ch>=1) && (ch<=9)))
    {
    	printf("\n Invalid choice. (Enter 1..9)");
    	continue;
	}
	switch(ch)
	{
		case 1: accept_array_elements(arr); break;
		case 2: display(arr); break;
		case 3: printf("\n  Sum = %d",sum(arr)); break;
		case 4: print_even(arr); break;
		case 5: printf("\n Max = %d",max(arr)); break;
		case 6: // complete it
		case 7: prime_numbers(arr) ; break;
		case 8: printf("\n Sum of all prime numbers = %d",sum_prime(arr)); break;
	}
	
	
  }while(ch != 9);
  printf("\n The End.....");
  return 0;
}

int sum_prime(int *p)
{
	int sum = 0, i;
	for(i = 0; i<10 ; i++)
	{
		if(isPrime(p[i]))
		    sum = sum + p[i];
	}
	return sum;
}

void accept_array_elements(int *arr)
{
	int i;
	
	for(i=0; i<10; i++)
	{
		printf("\n Enter a number :");
		scanf(" %d",&arr[i]);
	}
	
}

void display(int *a)
{
	int i;
	printf("\n Array Elements are :");
	for(i=0 ; i<10 ; i++)
	{
		printf("   %d", a[i]);
	}
	printf("\n\n");
}

int sum(int *p)
{
	int i, sum = 0;
	for(i=0 ; i<10 ; i++)
	     sum = sum + p[i];
	
	return sum;
}

void print_even(int *ptr)
{
	int i;
	printf("\n \n Even Numbers : ");
	for(i=0 ; i<10 ; i++)
	{
		if((ptr[i] % 2) == 0)
		   printf("  %d",ptr[i]);
	}
}

int max(int *a)
{
	int i, max = a[0];
	for(i = 1 ; i<10 ; i++)
	{
		if(a[i] > max)
		    max = a[i];
	}
	return max;
}

int isPrime(int num)
{
	int i;
	for(i=2 ; i<num ; i++)
	{
		if((num % i) == 0)
		    break;
	}
	if(num == i)
	   return 1;
	else
	   return 0;
}

void prime_numbers(int *a)     // a = 500
{
	int i;
	printf("\n\n\n Prime numbers are :");
	for(i = 0 ; i<10 ; i++)    // i = 2
	{
		if(isPrime(a[i]))
		   printf("   %d", a[i]);
	}
}





