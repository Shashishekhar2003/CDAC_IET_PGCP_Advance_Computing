#include<iostream>
using namespace std;

class A
{
    int a;

public:
    A();
    void display();

    A(int z)
    {
        cout << "para constructor of A is..." << endl;
        a = z;
    }
};

A::A()
{
    cout << "in default of a" << endl;
}

void A::display()
{
    cout << a << endl;
}

class B : public A
{
    int b;

public:
    B() : A(100)
    {
        b = 200;
    }

    void display();
};


void B::display()
{
    A::display();  
    cout << b << endl;
}

int main()
{
    B bobj;
    bobj.display();
}