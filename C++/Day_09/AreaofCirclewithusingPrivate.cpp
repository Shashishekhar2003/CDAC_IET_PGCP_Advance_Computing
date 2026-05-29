#include<iostream>
using namespace std;
 class Circle
{   
    // private data member
    private: 
        double radius;
    // public member function    
    public:    
        double  compute_area()
        {   // member function can access private 
            // data member radius
            return 3.14*radius*radius;
        }
     
};
 
int main()
{   
    // creating object of the class
    Circle obj;
     obj.radius = 1.5;//error
        cout << "Area is:" << obj.compute_area();
    return 0;
}

//Compile Time Error