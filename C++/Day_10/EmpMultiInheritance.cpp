#include<iostream>
using namespace std;

class Employee
{
    int id;
	
	public:
	Employee()
	{
		cout<<"No Arug Constructor is called"<<endl;
		id=0;
		}	
		
		Employee(int id)
		{
			cout<<"Empolyee para constructor is called"<<endl;
			id=id;
		}
		
		void display()
		{
			cout<<"Employee id is"<<id<<endl;
		}
		
		int computesalary()
		{
			return 0;
		}
};

	class WageEmployee:public Employee
	{
		int hrs,rate;
		public:
			WageEmployee()
			{
				cout<<"No Arug constructor is called"<<endl;
				hrs=0;
				rate=0;
			}
			
			WageEmployee(int hrs,int rate)
			{
				cout<<"WageEmployee Para constructor is called"<<hrs<<rate<<endl;
				hrs=hrs;
				rate=rate;
			}
			
			void display()
			{
				cout<<"WageEmployee of the hrs is\n"<<endl;
		    	cout<<"WageEmployee of the rate is"<<endl;
			}
			
			int computesalary()
			{
				return rate*hrs;
			}
			
	};
	
	
	class SalesPerson:public WageEmployee
	{
		int sales,comm;
		public:
			SalesPerson()
			{
				cout<<"no arug para is called"<<endl;
//				sales=0;
//				comm=0;
			}
			
			SalesPerson(int sales,int comm ,int id,int hrs,int rate)
			{
				cout<<"Sales Person para constructor is called"<<endl;
				sales=sales;
				comm=comm;
			}
			
			void display()
			{
				cout<<"SalesPerson of sale is \n"<< sales<<endl;
				cout<<"SalesPerson of comm is"<<comm<<endl;
			}
			
			int computeSalary()
	{
		return   WageEmployee:: computesalary()+(sales*comm);
		
	}
	};

int main()
{
	Employee e1;
	e1.display();
	
	WageEmployee we1;
	we1.display();
	
	SalesPerson se1(1000,500,4561,1,10000);
	se1.display();
	
	SalesPerson s(101,5,1000,10000,1);
		s.display();
		cout<<"salary  is "<<s.computeSalary();
}