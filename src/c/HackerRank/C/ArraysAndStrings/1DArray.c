#include <stdio.h>

int main()
{
    int arraySize;
    int total;
    int array[arraySize];
    scanf("%d",&arraySize);
    for (int i = 0; i < arraySize; i++)
    {
        scanf("%d",&array[i]);
        total += array[i];
    }
    printf("%d",total);
    return 0;
}