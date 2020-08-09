#include <iostream>
#include <vector>
#include <string>

using namespace std;

/* 
#                 #
 ##             ##
  ###         ###
   ####     ####
    ###########
    ###########
   ####     ####
  ###         ###
 ##             ##
#                 #
*/

/*

PART ONE: DRAW THE RIGHT AMOUNT OF #'S

int main()
{
    for (int i = -5; i < 6; i++)
    {
        for (int a = 0; a < (2 * (6 - abs(i))); a++)
        {
            cout << "#";
        }
        cout << "\n";
    }
}

 
##
####
######
########
##########
############
##########
########
######
####
##
 
PART TWO: GET THE CORRECT AMOUNT OF SPACES AND COMBINE WITH THE ABOVE TO PRODUCE FIRST HALF

int main()
{
    for (int i = -5; i < 6; i++)
    {

        for (int a = 0; a < (5 - abs(i)); a++)
        {
            cout << " ";
        }

        for (int b = 0; b < 6 - abs(i); b++)
        {
            cout << "#";
        }
        cout << "\n";

    }
}
#
 ##
  ###
   ####
    #####
     ######
    #####
   ####
  ###
 ##
#

PART THREE: DRAW THE CORRECT AMOUNT OF SPACES FOR FIRST HALF

int main()
{
    for (int i = -5; i < 6; i++)
    {

        for (int a = 0; a < (5 - abs(i)); a++)
        {
            cout << " ";
        }

        for (int b = 0; b < 6 - abs(i); b++)
        {
            cout << "#";
        }

        for (int c = 0; c < 2 * (abs(i)); c++)
        {
            cout << "-";
        }

        cout << "\n";
    }
}

#----------
 ##--------
  ###------
   ####----
    #####--
     ######
    #####--
   ####----
  ###------
 ##--------
#----------
*/

int main()
{
    for (int i = -5; i < 6; i++)
    {
        if (i != 0)
        {
            //first series of spaces
            for (int a = 0; a < (5 - abs(i)); a++)
            {
                cout << " ";
            }
            //first half of #'s
            for (int b = 0; b < 6 - abs(i); b++)
            {
                cout << "#";
            }
            // checking if abs(i) == 1 accounts for the centre where we add an extra hash
            if (abs(i) == 1)
            {
                cout << "#";
            }
            else
            // middle spaces
            {
                for (int c = 0; c < (4 * abs(i)) - 3; c++)
                {
                    cout << " ";
                }
            }
            // last #'s
            for (int d = 0; d < 6 - abs(i); d++)
            {
                cout << "#";
            }

            cout << "\n";
        }
    }
}