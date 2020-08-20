#include <iostream>
using namespace std;

struct time
{
    string timePeriod;
    int hour;
    int minute;
    int second;
};

bool isLaterThan(struct time time1, struct time time2)

{
    if (time1.timePeriod == "AM" && time2.timePeriod == "PM")
    {
        return false;
    }
    else if (time1.timePeriod == "PM" && time2.timePeriod == "AM")
    {
        return true;
    }
    if (time1.hour != time2.hour)
    {
        return time1.hour > time2.hour;
    }
    if (time1.minute != time2.minute)
    {
        return time1.minute > time2.minute;
    }
    if (time1.second != time2.second)
    {
        return time1.hour > time2.hour;
    }
    return false;
}

void addAnHour(struct time &inputTime)
{
    if (inputTime.hour == 12)
    {
        inputTime.hour = 1;
    }
    else
    {
        inputTime.hour++;
    }
}

int main()
{
    struct time time1 = {"PM", 0, 0, 0};
    addAnHour(time1);
    addAnHour(time1);
    cout << time1.hour << endl;
    struct time time2 = {"PM", 0, 0, 0};
    cout << isLaterThan(time1, time2);
}