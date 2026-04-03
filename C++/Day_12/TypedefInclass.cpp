#include <iostream>
using namespace std;

class Student {
public:
    typedef int Marks;   // alias for int

    Marks score;         // using typedef inside class

    void display() {
        cout << "Score: " << score << endl;
    }
};

int main() {
    Student s;
    s.score = 85;
    s.display();
    return 0;
}