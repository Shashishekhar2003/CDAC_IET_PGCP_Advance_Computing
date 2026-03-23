#include<iostream>
using namespace std;
int main() {
	int a[5];
	int i;
	cout<<"accept elements\n";
	for(i=0; i<=4; i++) {
		cin>>*(a+i);
	}
	cout<<"display elements\n";
	for(i=0; i<=4; i++) {
		cout<<*(a+i)<<"\t";
	}



}