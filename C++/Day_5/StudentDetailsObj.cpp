#include<iostream>
using namespace std;
class Student {
		int rollNo;
		int marks;
		
	public :
		
		void get();
		void display();

};
void Student::get() {
	
	
	cout<<"enter rolllno and marks\n";
	cin>>rollNo;
	cin>>marks;
}
void Student::display() {
	
	
	cout<<"rollno and marks  is \n"<<rollNo<<"  "<<marks<<endl;
}
int main() {
	
	
	int i;
	Student s[3]; //s is an arary containing 3 objects of type Student
	for(i=0; i<=2; i++) {
		s[i].get();	
	}
	
	for(i=0; i<=2; i++) {
		s[i].display();
	}
}