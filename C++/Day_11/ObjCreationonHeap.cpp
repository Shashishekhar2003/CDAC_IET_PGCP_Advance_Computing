//case 2: object creation on heap with new operator without virtual keyword

#include<iostream>
using namespace std;
class Employee{
	int id;
	
	public:
		Employee();
		Employee(int);
		void display();
		int findsalary()
		{
			return 0;
		}
};

Employee::Employee()
{
	cout<<"in default of emp"<<endl;
	id=0;
}

Employee::Employee(int i)
{
	cout<<"in para of emp"<<endl;
	id=i;
}

void Employee::display()
{
	cout<<"id of employee is"<<id<<endl;
}

class wageemployee:public Employee{
	int hrs,rate;
	
	public:
		
		wageemployee();
		wageemployee(int,int,int);
		void display();
		int findsalary();
};

wageemployee::wageemployee()
{
	cout<<"is default emp"<<endl;
	rate=0;
	hrs=0;
}

//wageemployee::wageemployee(int i ,int h, int r):employee (i)
//{
//	cout<<"is para emp"<<endl;
//	rate=r;
//	hrs=h;
//}

int wageemployee::findsalary()
{
	return hrs*rate;
}

void wageemployee::display()
{
	Employee::display();
	cout<<hrs<<endl;
	cout<<rate<<endl;
}

int main()
{
	Employee * ptr=new wageemployee(101,5,500);
	cout<<"salary is "<<ptr->findsalary();//without virtual keyword binding takes
	//at compile time and at compile time type of pointer is checked rather than type 
	//of object.depending on type of object,function of that class will be 
	//executed
	ptr->display();
}



















