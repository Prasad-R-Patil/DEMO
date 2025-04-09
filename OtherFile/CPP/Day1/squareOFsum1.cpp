#include<iostream>
using namespace std;


void Squar_Of_Sum1()
{
    int n=0;
    int sum=0;

    while(n!=(-100))
    {
       

        sum = sum + n*n;
        cin>>n;


    }

    

    cout<<"Square Of Sum is ==>> "<<sum<<endl;
}


int main()
{
    cout<<"Enter Number until  -100 then Exit.... "<<endl;
    
    Squar_Of_Sum1();

    return 0;
}