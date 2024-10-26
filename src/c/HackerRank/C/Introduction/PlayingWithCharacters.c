#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int main()
{
    char a;
    char b[100];
    char c[100];
    scanf("%c\n%s\n%[^\n]%*c",&a,&b,&c);
    printf("%c\n%s\n%s",a,b,c);
}