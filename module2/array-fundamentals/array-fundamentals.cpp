#include <iostream>
#include <vector>
#include <string>

using namespace std;
const int ARRAY_SIZE = 5;

bool isSequential(int intArray[ARRAY_SIZE], int length)
{
    for (int i = 0; i < length - 1; i++)
    {
        if (intArray[i] > intArray[i + 1])
            return false;
    }
    return true;
}

int main()
{
    int intArray[ARRAY_SIZE] = {1, 2, 5, 4, 5};
    cout << "Array is sequential? : " << isSequential(intArray, ARRAY_SIZE) << endl;
}