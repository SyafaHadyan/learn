#include <stdio.h>

int main()
{
    int arraySize;
    int total;
    int *array = (int*)malloc(arraySize * sizeof(int));
    scanf("%d",&arraySize);
    for (size_t i = 0; i < arraySize; i++)
    {
        array[i] = scanf("%d",&array[i]);
    }
    printf("%s","Test");
    return 0;
}