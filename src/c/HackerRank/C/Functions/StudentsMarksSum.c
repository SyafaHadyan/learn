#include <stdio.h>

int main()
{
    int studentAmount;
    scanf("%d",&studentAmount);
    int studentGrade[studentAmount];
    char sumGrade;
    for (int i = 0; i < studentAmount; i++)
    {
        scanf("%d",&studentGrade[i]);
    }
    scanf("%c",&sumGrade);
    if (sumGrade == 'b')
    {
        //
    }
    else if (sumGrade = 'g')
    {
        //
    }
    return 0;
}