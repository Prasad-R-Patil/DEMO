#include<iostream>
using namespace std;

void Squar_Of_Sum()
{
    int n=0;
    int sum=0;

    while(n!=(-100))
    {
       
        sum = sum + n;
        cin>>n;



    }

    int Square = sum * sum;

    cout<<"Square Of Sum is ==>> "<<Square<<endl;
}




int main()
{
    cout<<"Enter Number until  -100 then Exit.... "<<endl;
    Squar_Of_Sum();
    
    return 0;
}