#include <iostream> 
using namespace std; 
  
int main() 
{ 
  
    // Define an array 
    int arr[] = { 11, 22, 33, 44 }; 
  
    // Print elements of an array 
    cout << "first element: " << *arr << endl; 
    cout << "Second element: " << *(arr + 1) << endl; 
    cout << "Third element: " << *(arr + 2) << endl; 
    cout << "fourth element: " << *(arr + 3) << endl; 
  
    return 0; 
}