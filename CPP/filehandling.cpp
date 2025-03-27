#include<fstream>
#include<iostream>
using namespace std;
int main()
{
char ch;
ifstream f1("king.txt");
 f1.seekg(2,ios::beg);
while(f1)
{
f1.get(ch);
cout<<ch;
/* if(ch=='E')
 f1.seekg(1,ios::cur);
 f1.get(ch);
cout<<ch;
*/}
}