#include <stdio.h>

int calculateAt(int a,int b,int c,int counter,int currentCount,int result)
{
    int result = 0;
    result += a + b + c;
    a = b;
    b = c;
    c = result;
    currentCount++;
    if (currentCount != counter)
    {
        calculateAt(a,b,c,counter,currentCount,result);
    }
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
    printf("%d",calculateAt(a,b,c,dataSize,currentCount,result));
    return 0;
}