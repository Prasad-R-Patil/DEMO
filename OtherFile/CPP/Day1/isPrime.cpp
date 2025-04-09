#include<iostream>
using namespace std;

bool CkeckPrime(int n)
{
    
    
    for (int i=2; i<n/2; i++)
    {
        if((n%i)==0)
        {
            return false;
            break;
        }
        else
        {
            return true;
            
        }

    }
}

int main()
{
    int n=0;
    cout<<"Enter a Number To chaeck Prime or not ==>> ";
    cin>>n;

    bool isPrime = CkeckPrime(n);

    if(isPrime == 1)
    {
        cout<<n<<" is a Prime Number....."<<endl;
    }
    else
    {
        cout<<n<<" is Not a Prime Number....."<<endl;   
    }

   





    return 0;
}