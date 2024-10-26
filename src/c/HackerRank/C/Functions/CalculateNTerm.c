#include <stdio.h>

int calculateAt(int a,int b,int c);

int main()
{
    int dataSize;
    int a,b,c;
    scanf("%d",&dataSize);
    scanf("%d" "%d" "%d",&a,&b,&c);
    printf("%d",calculateAt(a,b,c));
    return 0;
}