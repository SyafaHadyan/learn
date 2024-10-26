#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main()
{
    int a;
    int b;
    float c;
    float d;
    scanf("%d %d\n%f %f",&a,&b,&c,&d);
    printf("%d %d\n%.1f %.1f",a + b,a - b,c + d,c - d);
    return 0;
}