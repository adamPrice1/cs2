#include <iostream>
#include <vector>
#include <string>

using namespace std;
const int ARRAY_SIZE = 10;

int upperCaseCount(char charArray[ARRAY_SIZE], int length)
{
    int upperCount = 0;
    for (int i = 0; i < length - 1; i++)
    {
        if (isupper(charArray[i]))
            upperCount++;
    }
    return upperCount;
}

int main()
{
    char charArray[ARRAY_SIZE] = {'a', 'b', 'c', 'D', 'e', 'a', 'b', 'c', 'D', 'e'};
    cout << "Number of uppercase letters: " << upperCaseCount(charArray, ARRAY_SIZE) << endl;
}