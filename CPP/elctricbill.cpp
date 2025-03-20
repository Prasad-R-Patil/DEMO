#include<iostream>
using namespace std;

int main()
{   

    float unit;
    float total=0.0f;	
	cout<<" Enter unit :- "<<endl;
	cin>>unit;
	
	if (unit<=50)
	{
		total=unit*8.5;
	}
	else if ((unit>=50) && (unit<=250))
	{
		
		total = (50*8.5)+( (unit-50)*13.00);
	}
	else if (unit>250)
	{
		total= (50*8.5)+( 200*13.00)+((unit-250)*18.25);
	}
	
	cout<<" Total bill ="<<total<<endl;
	
	return 0;
}