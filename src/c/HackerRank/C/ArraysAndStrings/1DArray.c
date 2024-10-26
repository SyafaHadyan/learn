#include <stdio.h>

int main()
{
    int arraySize;
    scanf("%d",&arraySize);
    int total = 0;
    int array[arraySize];
    for (int i = 0; i < arraySize; i++)
    {
        scanf("%d",&array[i]);
        total += array[i];
    }
    printf("%d",total);
    return 0;
}