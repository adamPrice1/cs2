#include <iostream>
using namespace std;

// When you comment out the check for NULL below the program prints out the first two values, but throws a segmentation fault
// error when it trys to print out the third value which has been set to NULL.
// A segmentation fault occurs when a program tries to access a memory address that does not exist. The pointer for pointerArray[2] is NULL
// ie, not valid, which is why this error occurs.

int main()
{
    int *pointerArray[4];

    pointerArray[0] = new int;
    pointerArray[1] = new int;
    pointerArray[2] = NULL;
    pointerArray[3] = new int;

    *(pointerArray[0]) = 1;
    *(pointerArray[1]) = 10;
    *(pointerArray[3]) = 50;

    for (int i = 0; i < 4; i++)
    {
        //if (pointerArray[i] != NULL)
        //{
        cout << *(pointerArray[i]) << endl;
        // }
    }

    for (int i = 0; i < 4; i++)
    {
        //if (pointerArray[i] != NULL)
        // {
        delete pointerArray[i];
        pointerArray[i] = NULL;
        // }
    }

    return 0;
}