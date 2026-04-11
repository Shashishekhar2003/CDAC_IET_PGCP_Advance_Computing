#include<stdio.h>
int main()
{
	int a=10;
	 printf("%d",a);//10
	 {
		 int a=100;
		 printf("%d",a);//100
	 }
	 printf("%d",a);//10
}