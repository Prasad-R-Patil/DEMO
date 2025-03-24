#include<stdio.h>
void display_array(int *);
int main()
{
	int i, arr[5] = {11,42,53,74,25};
	
	for(i=0 ; i<5 ; i++)
    {
    	printf("\n arr[%d] = %d", i, arr[i]);
    }
	display_array(arr);
	
	for(i=0 ; i<5 ; i++)
    {
    	printf("\n arr[%d] = %d", i, arr[i]);
    }
	return 0;
}

void display_array(int *ptr)
{
	int i;
	printf("\n ptr = %d",ptr);
	for(i=0 ; i<5 ; i++)
    {
       	printf(" *ptr = ",*ptr);
       	ptr = ptr + 1;
	}
	
}


/* 
arr = some address
arr[0] = 11
arr[1] = 42
arr[2] = 53
*/
