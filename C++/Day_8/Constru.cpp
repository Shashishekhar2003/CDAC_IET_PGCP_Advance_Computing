#include<iostream>
using namespace std;
#include<stdlib.h>

class Test
{
	int x;
	
	public:
		Test()
		{
			cout<<"Constructor is called\n"<<endl;
		}
		~Test()
		{
			cout<<"Destructor is called\n"<<endl;
		}
};

int main()
{
	Test * ptr = new Test();
	delete ptr;  //delete will call destructor
	Test *ptr1=(Test*)malloc(sizeof(Test));
	free(ptr);//free() will not call destructor
	
}