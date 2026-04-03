#include<iostream>
using namespace std;
class A
{
	int a;
	public:
		A(int);
		void display();
};

A::A (int p)
{
	cout<<"in para of a"<<endl;
	a=p;
}

void A::display()
{
	cout<<a<<endl;
}

class B:public A
{
	int b;
	public:
		B(int ,int );
		void display();
};

B::B (int p, int q):A(p)
{
	cout<<"in para of b"<<endl;
	b=q;
}

void B::display()
{
	A::display();
	cout<<b<<endl;
}

int main()
{
	B bobj(100,10);
	bobj.display();
}