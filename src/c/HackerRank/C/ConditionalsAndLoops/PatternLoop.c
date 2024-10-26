#include <stdio.h>

int main()
{
    int loop;
    scanf("%d",&loop);
    for (int i = 0; i < loop; i++)
    {
        for (int j = 0; j < loop; j++)
        {
            printf("%d",loop);
            if (loop - j != 1)
            {
                printf(" ");
            }
        }
        if (loop - i != 1)
        {
            printf("\n");
        }
    }
    
}