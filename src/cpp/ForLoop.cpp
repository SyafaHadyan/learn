#include <iostream>
using namespace std;

int main()
{
    int first;
    int second;
    cin >> first;
    cin >> second;

    string numbers[] = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

    for (int i = first; i <= second; i++)
    {
        if (i >= 1 && i <= 9)
        {
            cout << numbers[i] << endl;
        }
        else if (i > 9 && i % 2 == 0)
        {
            cout << "even" << endl;
        }
        else if (i > 9 && i % 2 != 0)
        {
            cout << "odd" << endl;
        }
    }

    return 0;
}