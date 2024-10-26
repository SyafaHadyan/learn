#include <stdio.h>

int calculateAt(int a,int b,int c,int counter)
{
    while (counter)
    {
        
        calculateAt();
    }
    
}

int main()
{
    int dataSize;
    int a,b,c;
    scanf("%d",&dataSize);
    scanf("%d" "%d" "%d",&a,&b,&c);
    printf("%d",calculateAt(a,b,c,dataSize));
    return 0;
}