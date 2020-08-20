#include <iostream>
using namespace std;

const int ARRAY_SIZE = 10;

struct course
{
    string departmentCode;
    int coursenumber;
    string title;
};

int numCoursesInDepartment(course courseArray[], string department)
{
    int count = 0;
    for (int i = 0; i < ARRAY_SIZE; i++)
    {
        if (courseArray[i].departmentCode == department)
        {
            count++;
        }
    }
    return count;
}

int main()
{
    struct course courseArray[ARRAY_SIZE] = {
        {"COMP", 1046, "Introduction to Computer Science II"},
        {"GEO", 1083, "Introduction to Geology II"},
        {"GEO", 1011, "Introduction to Geology Science I"},
        {"PHYS", 1013, "Introduction to Physics I"},
        {"PHYS", 1014, "Introduction to Physics II"},
        {"PHYS", 1015, "Introduction to Physics III"},
        {"PHYS", 1016, "Introduction to Physics IIII"},
        {"CHEM", 1053, "Introduction to Chemistry I"},
        {"COMP", 1002, "Introduction to Agorithms I"},
        {"COMP", 1003, "Introduction to Data structures I"}};

    cout << numCoursesInDepartment(courseArray, "GEO");
}