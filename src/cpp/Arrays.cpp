#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main()
{
    int array_number;
    cin >> array_number;
    int array[array_number];

    int array_size = sizeof(array)/sizeof(int);
    int val;

    for(int i = 0; i < array_size; i++)
    {
        cin >> val;
        array[i] = val;
    }
    for(int k = array_size-1; k >= 0; k--)
    {
        cout << array[k] << " ";
    }
    cout << endl;

    return 0;
}