#include <iostream>
#include <vector>
#include <string>

using namespace std;

/* 
The prettyBoxer function is a black-box in that a string is supplied, and a string is returned
with the inclusion of a nice border around the text.
The name is self descriptive, prettyBoxer, and the use is easily deduced from looking at the code.
*/

string prettyBoxer(string inputString)
{
    string borderLine;
    string midLine;
    for (int i = 0; i <= (inputString.length() + 3); i++)
    {
        borderLine += "*";
    }
    midLine = "* " + inputString + " *";
    return borderLine + "\n" + midLine + "\n" + borderLine;
}

int main()
{
    cout << prettyBoxer("hello hello") << endl;

    cout << prettyBoxer("Hello Hello Hello") << endl;

    cout << prettyBoxer("Simple border output") << endl;

    cout << prettyBoxer("Dev Zoom") << endl;
}