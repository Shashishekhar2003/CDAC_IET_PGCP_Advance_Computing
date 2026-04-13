#include<iostream>
using namespace std;

class Test
{
	int a,b;
	public:
		void show( int a, int b)
		{
//			a=10;
//			b=20;
//			cout<<"Obj Add"<<this<<endl;  //print current class object address
//			cout<<"a"<<this->a<<endl;
//			cout<<"b"<<this->b<<endl;
//			
            this->a=a;
            (*this).b=b;
            a=a;
            b=b;
//            this->a=a  ======= (*this).a=a;(pointer to member)
            
		}
		
		void display()
		{
			cout<<a<<" "<<b<<endl;
		}
};

int main()
{
//	Test t;
//	cout<<&t<<endl;
//	&t.show();

    Test t;
    t.show(10,20);
    t.display();
    
    
    
}