#include <iostream>
using namespace std;

const int ARRAY_SIZE = 28;

struct dominoe
{
    int side1;
    int side2;
};

void printSide(int side)
{

    switch (side)
    {
    case 0:
        cout << "|   |" << endl;
        cout << "|   |" << endl;
        cout << "|   |" << endl;
        break;
    case 1:
        cout << "|   |" << endl;
        cout << "| * |" << endl;
        cout << "|   |" << endl;
        break;
    case 2:
        cout << "|   |" << endl;
        cout << "|* *|" << endl;
        cout << "|   |" << endl;
        break;
    case 3:
        cout << "| * |" << endl;
        cout << "| * |" << endl;
        cout << "| * |" << endl;
        break;
    case 4:
        cout << "|* *|" << endl;
        cout << "|   |" << endl;
        cout << "|* *|" << endl;
        break;
    case 5:
        cout << "|* *|" << endl;
        cout << "| * |" << endl;
        cout << "|* *|" << endl;
        break;
    case 6:
        cout << "|* *|" << endl;
        cout << "|* *|" << endl;
        cout << "|* *|" << endl;
        break;
    }
}

void printDominoe(dominoe toPrint)
{
    cout << " --- " << endl;
    printSide(toPrint.side1);
    cout << "  -  " << endl;
    printSide(toPrint.side2);
    cout << " --- " << endl;
}

void reverseTheOrder(struct dominoe (&dominoes)[ARRAY_SIZE])
{
    dominoe dominoesReversed[ARRAY_SIZE];

    //create sorted array as a function variable
    for (int i = 0; i < ARRAY_SIZE; i++)
    {
        dominoesReversed[i].side1 = dominoes[ARRAY_SIZE - 1 - i].side1;
        dominoesReversed[i].side2 = dominoes[ARRAY_SIZE - 1 - i].side2;
    }

    //Copy the array over to original array
    for (int i = 0; i < ARRAY_SIZE; i++)
    {
        dominoes[i].side1 = dominoesReversed[i].side1;
        dominoes[i].side2 = dominoesReversed[i].side2;
    }
}

int main()
{
    //Generate all 28 dominoes
    dominoe dominoeSet[ARRAY_SIZE];
    int arrayIndex = 0;
    for (int i = 0; arrayIndex < ARRAY_SIZE; i++)
    {
        for (int j = 0; j <= i; j++)
        {
            dominoeSet[arrayIndex].side1 = j;
            dominoeSet[arrayIndex].side2 = i;
            arrayIndex++;
        }
    }

    //print all the dominoes in the dominoe set
    for (int i = 0; i < ARRAY_SIZE; i++)
    {
        printDominoe(dominoeSet[i]);
        //divider to separate dominoes
        cout << "_________________________"
             << "\n";
    }

    //print a divider to separate the first array from the second sorted array
    cout << "******************** SORTED ARRAY ********************"
         << "\n";

    // sort the array
    reverseTheOrder(dominoeSet);

    //print the sorted array
    for (int i = 0; i < ARRAY_SIZE; i++)
    {
        printDominoe(dominoeSet[i]);
        //divider to separate dominoes
        cout << "_________________________"
             << "\n";
    }
}