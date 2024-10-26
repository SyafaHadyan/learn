#include <stdio.h>

int main()
{
    char input[100];
    scanf("%[^\n]%*c",input);
    printf("Hello, World!\n%s",input);
    return 0;
}