#include<iostream>
using namespace std;
void swap(int&, int&);
int main()
{
	int a=10,b=20;
	cout<<"enter values of a & b\n"<<endl;
	cin>>a>>b;
	swap(a,b);
	cout<<"after swapping "<<endl;
	cout<<"values of a & b is"<<a<<b<<endl;
	return 0;
}
void swap(int& p, int& q)
{
	int temp;
	temp=p;
	 p=q;
	q=temp;
}
