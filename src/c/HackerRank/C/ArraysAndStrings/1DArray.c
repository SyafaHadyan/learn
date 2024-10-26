#include <stdio.h>

int main()
{
    int arraySize;
    int total;
    int array[arraySize];
    scanf("%d",&arraySize);
    for (size_t i = 0; i < arraySize; i++)
    {
        array[i] = scanf("%d");
    }
    printf("%s","Test");
    return 0;
}