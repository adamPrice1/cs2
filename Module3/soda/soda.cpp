#include <iostream>
using namespace std;

struct soda
{
    int gramsOfSugar;
    float gramsOfCarbonation;
};

int main()
{
    soda **sodaArray = new soda *[3];
    sodaArray[0] = new soda;
    sodaArray[0]->gramsOfSugar = 12;
    sodaArray[0]->gramsOfCarbonation = 1.34;
    sodaArray[1] = new soda;
    sodaArray[1]->gramsOfSugar = 13;
    sodaArray[1]->gramsOfCarbonation = 4.16;
    sodaArray[2] = new soda;
    sodaArray[2]->gramsOfSugar = 15;
    sodaArray[2]->gramsOfCarbonation = 1.02;

    for (int i = 0; i < 3; i++)
    {
        cout << "grams of sugar: " + to_string(sodaArray[i]->gramsOfSugar) + " grams of Carbonation: " + to_string(sodaArray[i]->gramsOfCarbonation) << endl;
    }

    for (int i = 0; i < 3; i++)
    {
        delete sodaArray[i];
    }

    delete[] sodaArray;
}