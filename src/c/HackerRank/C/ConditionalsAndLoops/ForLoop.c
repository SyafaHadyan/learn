#include <stdio.h>

void checkNumber(int min)
{
    if (min == 1)
    {
        printf("%s","one");
    }
    else if (min == 2)
    {
        printf("%s","two");
    }
    else if (min == 3)
    {
        printf("%s","three");
    }
    else if (min == 4)
    {
        printf("%s","four");
    }
    else if (min == 5)
    {
        printf("%s","five");
    }
    else if (min == 6)
    {
        printf("%s","six");
    }
    else if (min == 7)
    {
        printf("%s","seven");
    }
    else if (min == 8)
    {
        printf("%s","eight");
    }
    else if (min == 9)
    {
        printf("%s","nine");
    }
    else
    {
        printf("%s","Greater than 9");
    }
}

int main()
{
    int min;
    int max;
    scanf("%d\n%d",&min,&max);
    for (int i = min; i <= max; i++)
    {
        //
    }
    return 0;
}