#include<iostream>
#include<string.h>
using namespace std;

class String1
{
    int len;
	char*ptr;
	public:
	        void display();
	        String1 (char *);
	        String1 & operator = (String1&);
	        String1 (String1&)
	        {
	        	cout<<"copy constructor is called"<<endl;
			}
};			
			
			String1& String1::operator=(String1& s)
			{
				cout<<"Assignmengt is called\n"<<endl;
				len=s.len;
				delete[] ptr;
				ptr=new char [len+1];
				strcpy (ptr,s.ptr);
				return (*this);
				
			}
			
			void String1::display()
			{
				cout<<"length is"<<endl;
				cout<<"string is"<<endl;
			}
			
			String1 :: String1(char * sptr)
			{
			len =strlen(sptr);
			ptr = new char[len+1];
			strcpy(ptr,sptr);
			}
		


int main()
{
	String1 s1("abc");
	String1 s2("xyz");
	s2=s1;
	s2.display();
	
	
}











