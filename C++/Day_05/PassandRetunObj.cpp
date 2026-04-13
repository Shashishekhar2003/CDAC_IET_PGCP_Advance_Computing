#include<iostream>
using namespace std;
class Test
{
  int a;
  public:
  void get()
  {
    cout<<"enter value of a\n";
    cin>>a;
  }
  void add(Test& new_aobj2)
  {
    cout<<this->a<<endl;//10
    cout<<a<<endl;//10
    cout<<new_aobj2.a<<endl;//5
  }
  
};
int main()
{
  Test aobj1,aobj2;
  aobj1.get();
  aobj2.get();
  aobj1.add(aobj2);  
}