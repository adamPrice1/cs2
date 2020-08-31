
#include <iostream>
using namespace std;

string getAverageScore(int scoreArray[], int score_num)
{
    float total = 0;
    for (int i = 0; i < score_num; i++)
    {
        total += scoreArray[i];
    }
    return to_string(total / score_num);
}

int main()
{

    const int SCORE_NUM = 10;
    int scores[SCORE_NUM];

    for (int i = 0; i < SCORE_NUM; i++)
    {
        scores[i] = i;
    }

    cout << "Average score: " << getAverageScore(scores, SCORE_NUM) << endl;
}