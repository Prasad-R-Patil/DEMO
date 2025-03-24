#include<stdio.h>


int main()
{
    char name[5][20];
    int cnt=0;

    for(int i=0; i<5; i++)
    {
        printf("\n==========================================\n");
        printf("name[%d] = ",i);
        scanf("%s",name[i]);

    }

    for(int o=0 ; o<5; o++)
    {
       
        for(int i=0; name[o][i]!='\0'; i++)
        {
            if(((name[o][i])=='A')||((name[o][i])=='a'))
            {
                cnt++;
            }
        }
        printf("\n==========================================\n");
        printf("\n Nmae of Occrence => name[%d]=%s =%d",o,name[o],cnt);
    }

    for(int j=0; j<5; j++)
    {
        printf("\n==========================================\n");
        printf("\nname[%d] = %s",j,name[j]);
    }

    return 0;
}