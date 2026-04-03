#include <iostream>
#include <fstream>
using namespace std; 
int main() {

    // open a text file for reading
    ifstream my_file("tt.txt");

    // check the file for errors
    if(!my_file) {
        cout << "Error: Unable to open the file." << endl;
    }
    else
    cout<<"file opened";

    string line;

    while (!my_file.eof()) {
        getline(my_file, line);

        // print the line variable
        cout << line << endl;
    }
    // close the file
    my_file.close();

    return 0;
}