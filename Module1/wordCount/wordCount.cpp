#include <iostream>
#include <vector>
#include <string>

using namespace std;

/* 
1. Write code that will use cin.get() to read characters in one by one until a newline is encountered. 
Report how many words there were in the input, how long the longest word was, and the largest number of vowels in a word 
(work on one of these at a time!). You may not store any of the characters but you can have other variables that store 
information about them as you go along.

2. Think about all potential cases. What types of input could break your program? What if someone presses
 enter right away? What if there’s only one word? What if there are many words? What if there are multiple spaces
  between words? etc… Make sure it all works.

For this portion, copy and paste the log of your console interactions in a new log.txt file (to be included in the PR).
 This log will demonstrate the good coverage of your program. You can manually divide and annotate test cases if it 
 gives more clarity. 
*/

int main()
{
    char nextChar;
    int longestWord = 0;
    int wordCount = 0;
    int highestVowels = 0;
    int currentWordLength = 0;
    int currentVowelCount = 0;

    while (nextChar != '\n')
    {
        //account for uppercase by lowercasing everything
        nextChar = tolower(cin.get());
        //check if character is alpha-numeric
        if (isalnum(nextChar))
        {
            currentWordLength += 1;
            //check if the current character is a vowel
            if (nextChar == 'a' || nextChar == 'e' || nextChar == 'i' || nextChar == 'o' || nextChar == 'u')
            {
                currentVowelCount += 1;
                // only compare the vowel count to the highest vowels if the current char is actually a vowel, saves redunt runs of this if statement.
                if (currentVowelCount > highestVowels)
                {
                    highestVowels = currentVowelCount;
                }
            }
            if (currentWordLength > longestWord)
            {
                longestWord = currentWordLength;
            }
        }
        else
        {
            //reset all word specific variables when a non alpha-numeric character is detected
            // check that atleast one alphanumeric character has been entered before incrementing word count
            if (currentWordLength > 0)
            {
                wordCount += 1;
            }
            currentWordLength = 0;
            currentVowelCount = 0;
        }
    }

    cout << "Number of words: " << wordCount << endl;
    cout << "Longest word length: " << longestWord << endl;
    cout << "Largest number of vowels: " << highestVowels << endl;
}