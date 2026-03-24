#include<iostream>
using namespace std;
class Test {
		int a;
	public:
		void get() {
			cout<<"enter value of a\n";
			cin>>a;
		}
		Test add(Test& new_aobj2) {
			Test aobj3;
			aobj3.a=this->a + new_aobj2.a;
			return aobj3;//returning object from the function

		}
		void display() {
			cout<<"value is "<<this->a;
		}

};
int main() {
	Test aobj1,aobj2,aobj4;
	aobj1.get();
	aobj2.get();
	aobj4=aobj1.add(aobj2);
	aobj4.display();
}