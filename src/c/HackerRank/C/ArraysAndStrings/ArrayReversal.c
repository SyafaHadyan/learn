#include <stdio.h>

int main()
{
    int arraySize;
    int array[arraySize];
    scanf("%d",&arraySize);
    for (int i = 0; i < arraySize; i++)
    {
        scanf("%d",&array[i]);
    }
    for (int i = arraySize - 1; i >= 0; i--)
    {
        printf("%d",array[i]);
        if (i != 0)
        {
            printf(" ");
        }
    }
}