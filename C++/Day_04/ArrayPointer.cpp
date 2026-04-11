#include<iostream>
using namespace std;
int main()
{
    int arr[5]={1,2,3,4,5};
    int* ptr=arr;
   //arr is constant pointer and ptr is non const pointer
  // arr++;//error //arr=arr+1 //arr=100+1 //arr=104
   ptr++;//ptr=ptr+1 //ptr=100+1 //ptr=104
   cout<<*ptr<<endl;
   ptr=ptr+2;//ptr=104+2 // ptr=112
   cout<<*ptr<<endl;//4
   ptr=ptr-3; //ptr=112-3 //ptr=100
   cout<<*ptr<<endl;//1
}