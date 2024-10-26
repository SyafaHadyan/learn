#include <stdio.h>

int calculateAt(int a,int b,int c,int counter,int currentCount,int result)
{
    result = a + b + c;
    a = b;
    b = c;
    c = result;
    currentCount++;
    return result;
}

int main()
{
    int dataSize;
    int result = 0;
    int currentCount = 3;
    int a,b,c;
    scanf("%d",&dataSize);
    scanf("%d" "%d" "%d",&a,&b,&c);
    while (currentCount != dataSize)
    {
        result = a + b + c;
        a = b;
        b = c;
        c = result;
        currentCount++;
    }
    printf("%d",result);
    return 0;
}