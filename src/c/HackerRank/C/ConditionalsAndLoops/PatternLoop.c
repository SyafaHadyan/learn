#include <stdio.h>

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