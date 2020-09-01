#include <iostream>
#include <string.h>

using namespace std;

class flower
{
public:
    string color;
    int height;
    float percentWater;

    flower(string newColor, int newHeight, float newPercentWater)
    {
        this->color = newColor;
        this->height = newHeight;
        this->percentWater = newPercentWater;
    }

    void print()
    {
        cout << this->color << " (" << this->height << " cm, "
             << this->percentWater << "% water)" << endl;
    }

    void growFlower()
    {
        this->height += 2;
        this->percentWater -= 0.05f;
    }

    void waterFlower()
    {
        this->percentWater += 0.1f;
    }
};

int main()
{
    flower f("purple", 10, 0.5f);

    f.print();
    f.waterFlower();
    f.print();
    f.growFlower();
    f.print();

    return 0;
}