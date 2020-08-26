#include <iostream>
using namespace std;

struct song
{
    string title;
    string artist;
    int releaseYear;
};

string songToString(song s)
{
    return "The song '" + s.title + "' was recorded by " + s.artist + " in " + to_string(s.releaseYear) + "\n";
}

song **songsFromYear(song **songs, int size, int year, int *resultSize)
{
    //this loop counts the amount of structs in the given release Year
    for (int i = 0; i < size; i++)
    {
        if (songs[i]->releaseYear == year)
        {
            *resultSize += 1;
        }
    }
    //initialises an array of pointers the same siza as the number of structs matching criteria
    song **songsInYear = new song *[*resultSize];
    int outputIndex = 0;
    for (int i = 0; i < size; i++)
    {
        if (songs[i]->releaseYear == year)
        {
            songsInYear[outputIndex] = new song;
            songsInYear[outputIndex]->title = songs[i]->title;
            songsInYear[outputIndex]->artist = songs[i]->artist;
            songsInYear[outputIndex]->releaseYear = songs[i]->releaseYear;
            outputIndex++;
        }
    }
    return songsInYear;
}

int main()
{
    const int ARRAY_SIZE = 5;
    song **songArray;
    songArray = new song *[ARRAY_SIZE];
    songArray[0] = new song;
    songArray[0]->title = "It's Code";
    songArray[0]->artist = "Janelle Monae";
    songArray[0]->releaseYear = 2013;
    songArray[1] = new song;
    songArray[1]->title = "Don't break the code";
    songArray[1]->artist = "The Oak Ridge boys";
    songArray[1]->releaseYear = 1986;
    songArray[2] = new song;
    songArray[2]->title = "Code of the Streets";
    songArray[2]->artist = "Ice T";
    songArray[2]->releaseYear = 2006;
    songArray[3] = new song;
    songArray[3]->title = "Crack the code";
    songArray[3]->artist = "311";
    songArray[3]->releaseYear = 2003;
    songArray[4] = new song;
    songArray[4]->title = "Code of silence";
    songArray[4]->artist = "Cyndi Lauper and Billy Joel";
    songArray[4]->releaseYear = 1986;

    for (int i = 0; i < ARRAY_SIZE; i++)
    {
        cout << songToString(*songArray[i]);
    }

    cout << " --------------------- " << endl;

    int *resultSize = new int;
    *resultSize = 0;

    //initialise array of pointers to song structs with 2006 release year
    song **songsIn2006 = songsFromYear(songArray, ARRAY_SIZE, 2006, resultSize);
    //loop through and print structs
    for (int i = 0; i < *resultSize; i++)
    {
        cout << songToString(*songsIn2006[i]);
    }

    //loop through and delete pointers to 2006 songs
    for (int i = 0; i < *resultSize; i++)
    {
        delete songsIn2006[i];
    }
    //delete the array itself
    delete[] songsIn2006;

    cout << " --------------------- " << endl;

    //reset resultSize
    *resultSize = 0;
    //declare array of pointers to structs with 1986 release year
    song **songsIn1986 = songsFromYear(songArray, ARRAY_SIZE, 1986, resultSize);
    //loop through and print structs
    for (int i = 0; i < *resultSize; i++)
    {
        cout << songToString(*songsIn1986[i]);
    }

    //loop through and delete pointers in array
    for (int i = 0; i < *resultSize; i++)
    {
        delete songsIn1986[i];
    }
    //delete the 1986 array itself
    delete[] songsIn1986;

    // loop through and delete pointers in array
    for (int i = 0; i < ARRAY_SIZE; i++)
    {
        delete songArray[i];
    }
    //delete array itself
    delete[] songArray;
}