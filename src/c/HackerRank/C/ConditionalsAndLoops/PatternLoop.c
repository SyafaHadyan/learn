#include <stdio.h>
#include <stdbool.h>

int main()
{
    /*
    2 2 2
    2 1 2
    2 2 2

    4 4 4 4 4 4 4  
    4 3 3 3 3 3 4   
    4 3 2 2 2 3 4   
    4 3 2 1 2 3 4   
    4 3 2 2 2 3 4   
    4 3 3 3 3 3 4   
    4 4 4 4 4 4 4   
    */
    int loop;
    scanf("%d",&loop);
    int number = loop;
    bool counter = false;
    for (int i = number; i <= number;)
    {
        for (int j = 0; j <= loop; j++)
        {
            printf("%d",loop);
            if (loop - j != 0)
            {
                printf(" ");
            }
        }
        if (loop - i != 0)
        {
            printf("\n");
        }
        if (!counter)
        {
            i--;
            continue;
        }
        if (i == 1)
        {
            counter = true;
        }
        if (counter)
        {
            i++;
        }
    }
    
}