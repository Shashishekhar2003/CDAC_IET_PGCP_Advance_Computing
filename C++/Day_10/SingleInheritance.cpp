#include<iostream>
using namespace std;
class A
{
	int a;
	
	public:
		A();
		void display();
};

A::A()
{
	cout<<"in dafault of A"<<endl;
	a=100;
}

void A::display()
{
	cout<<a<<endl;
}

class B: public A
{
	int b;
public:
	B();
	void display();
};

B::B()
{
	cout<<"in dafault of B"<<endl;
	b=20;
}

void B::display()
{
	A::display();
	cout<<b<<endl;
}

int main()
{
	A Aobj;
	Aobj.display();
	
	B Bobj;
	Bobj.display();
}