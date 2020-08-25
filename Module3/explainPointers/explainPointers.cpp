#include <iostream>
using namespace std;

void changeValue(int *element)
{
    *element += 999;
}

int main()
{
    // This block of code declares the stuff array with a length of 5, and then the for loop writes the value of "i" to each index of the array.
    // After this block runs stuff looks like this: [0,1,2,3,4]
    int stuff[5];
    for (int i = 0; i < 5; i++)
    {
        stuff[i] = i;
    }

    //This block of code declares a pointer to the block of memory containing the stuff array. The proceeding for loop sets the values of the stuff array
    // (aliased by otherStuff) to the value of i*2
    // the stuff array now looks like this: [0,2,4,6,8]
    int *otherStuff = stuff;
    for (int i = 0; i < 5; i++)
    {
        otherStuff[i] = i * 2;
    }

    //This line passes in a reference to index 0 of otherStuff (which itself is an alias for stuff[]) to the changeValue function.
    // the function takes a pointer and dereferences it to set the value of the block provided to 999.
    changeValue(&(otherStuff[0]));

    //This loop simply prints the stuff array
    for (int i = 0; i < 5; i++)
    {
        cout << stuff[i] << endl;
    }

    return 0;
}