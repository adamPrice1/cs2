#include <iostream>
#include <vector>
#include <string>

using namespace std;
const int ARRAY_SIZE = 50;

// This will allocate space for 50 chars in memory, the non written too parts will just be garbage until they are written too
char charArray[ARRAY_SIZE];

void addToArray(char element)
{
    //find the next null character in our list to overwrite
    int emptyIndex = 0;
    while (charArray[emptyIndex] != '-')
    {
        emptyIndex++;
    }
    //set the value of that character to the inserted element
    charArray[emptyIndex] = element;
}

int storedCharacters()
{
    //simply counts all the characters in our array that aren't our null character
    //could be done with a while loop as all non-null characters will be at the start of the array. Saves on operations.
    int charCount = 0;
    for (int i = 0; i < ARRAY_SIZE; i++)
    {
        if (charArray[i] != '-')
        {
            charCount++;
        }
    }
    return charCount;
}

void removeFromArray(char element)
{
    // find index of the element we wish to delete with a really quick while search (I know this doesn't handle duplicate values but its just illustrative)
    int elementIndex = 0;
    while (charArray[elementIndex] != element && elementIndex < ARRAY_SIZE)
    {
        elementIndex++;
    }
    // catch cases where the element is not in the array
    if (elementIndex == ARRAY_SIZE)
    {
        return;
    }
    // Okay so we have the index now we need to overwrite the element to our null character
    charArray[elementIndex] = '-';

    // now we need to shift everything after this down an index in the array
    int i = elementIndex;
    while (charArray[i + 1] != 0 && i < ARRAY_SIZE - 1)
    {
        charArray[i] = charArray[i + 1];
        i++;
    }
}

int main()
{

    // The for loop below will initalise every value in the array to be a '-' character, in the real world we would want to use a 0 null character
    // for this but the output is clearer with a dash.

    for (int i = 0; i < ARRAY_SIZE; i++)
    {
        charArray[i] = '-';
    }

    // we can then do things like checking how many characters we currently have stored by counting the number of non-null characters
    // adding to the array is a simple matter of looking for the next null character and overwriting it.
    // removal is slightly harder as the indexes of the later elements need to be decremented to account for the removed element.

    addToArray('b');
    addToArray('c');
    addToArray('d');
    removeFromArray('b');
    addToArray('e');
    cout << charArray << endl;
    cout << storedCharacters() << endl;
}