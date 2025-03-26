#include<iostream>
using namespace std;

class emp
{
	protected:
	
		int empno;
		string name;
		float bsal;
	
	public:
		//setter getter
		
		emp()
		{
			cout<<"\n default constructor of emp..";
			empno=0;
			name="sagar";
			bsal=0.0f;
		}
		
		emp(int n,string nm,float bs)
		{
			empno=n;
			name=nm;
			bsal=bs;
		}
		
		~emp()
		{
			cout<<"\n dest of emp";
		}
		
		virtual float cal_sal()
		{
			cout<<"\n calculate sal"<<bsal;
			return bsal;
		}
		
		
		
	
	
};


class manager:public emp
{
	
	protected:
	
	float bonus;

		public:
		
		manager()
		{
			bonus=0.0f;
		}
		
		manager(int a)
		{
			bonus=a;
		}
		manager(int n,string nm,float bs,float b):emp(n,nm,bs)
		{
			bonus=b;
		}
		
		float cal_sal()
		{
			bsal=bsal+bonus;
			return bsal;
		}
		
		~manager()
		{
			
		}
		
};

int main()
{
	
	//manager m(10,"sagar",5000.0,500.0);
	
	emp *ptr= new manager(10,"sagar",5000.0,500.0);
	
	cout<<"bonus of emp = "<<ptr->cal_sal(); 
	return 0;
	
	
}
