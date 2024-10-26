#include <stdio.h>

int main()
{
    int input;
    int total = 0;
    scanf("%d",&input);
    for (int i = 1; i <= 5; i++)
    {
        total += input % 10;
        input /= 10;
    }
    printf("%d",total);
    return 0;
}