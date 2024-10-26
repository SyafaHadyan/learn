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
}

int main()
{
    int min;
    int max;
    scanf("%d\n%d",&min,&max);
    for (int i = min; i <= max; i++)
    {
        if (i <= 9)
        {
            checkNumber(i);
        }
        else
        {
            if (i % 2 == 0)
            {
                printf("%s","Even");
            }
            else
            {
                printf("%s","Odd");
            }
        }
        if (max - i  != 0)
        {
            printf("\n");
        }
    }
    return 0;
}