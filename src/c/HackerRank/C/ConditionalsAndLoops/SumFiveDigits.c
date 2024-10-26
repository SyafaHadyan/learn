#include <stdio.h>
#include <stdlib.h>

int main()
{
    char input[5];
    int total;
    scanf("%s",&input);
    for (int i = 0; i < sizeof(input); i++)
    {
        total += atoi(input[i]);
    }
    
}