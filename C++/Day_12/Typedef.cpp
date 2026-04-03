#include <iostream>
using namespace std;
typedef class Student {
public:
    int id;
    void show() {
        cout << "Student ID: " << id << endl;
    }
} Stu;   // Alias name

int main() {
    Stu s;      // using alias instead of Student
    s.id = 101;
    s.show();
    return 0;
}