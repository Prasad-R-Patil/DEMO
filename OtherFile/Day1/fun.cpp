#include<stdio.h>

int main()
{
	int arr[2][3] = {{12,3},{4,5},{11,23}}, i, j;
	printf("\n\n\n");
	printf("\n arr = %d", arr);
	for(i= 0 ;i<7 ; i++)    //  i  =  0
	{
		printf("\n arr[%d] = %d",i,arr[i]);
		for(j = 0; j< 3; j++)   // j = 2
		{
	        printf("\naddress of arr[%d][%d] =  %d",i,j,&arr[i][j]);   		
		}
	   //printf("\n");
	}
	   
	printf("\n The End...");
	   
	return 0;
}
