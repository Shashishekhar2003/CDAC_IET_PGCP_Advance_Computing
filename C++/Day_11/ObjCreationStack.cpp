#include<iostream>
using namespace std;

class Employee {
    int id;

public:
    Employee() {
        cout << "in default of emp" << endl;
        id = 0;
    }

    Employee(int i) {
        cout << "in para of emp" << endl;
        id = i;
    }

    void display() {
        cout << "id of an employee is " << id << endl;
    }

    int findsalary() {
        return 0;
    }
};

class wageemployee : public Employee {
    int hrs, rate;

public:
    wageemployee() {
        cout << "in default wageemployee" << endl;
        hrs = 0;
        rate = 0;
    }

    wageemployee(int h, int r) {
        cout << "in para wageemployee" << endl;
        hrs = h;
        rate = r;
    }

    void display() {
        Employee::display();
        cout << "hrs: " << hrs << endl;
        cout << "rate: " << rate << endl;
    }

    int findsalary() {
        return hrs * rate;
    }
};

int main() {
    Employee e1;
    e1.display();

    Employee* ptr;
    wageemployee we1(10, 500);

    ptr = &we1;

    cout << "salary is " << ptr->findsalary() << endl;
    ptr->display();

    return 0;
}