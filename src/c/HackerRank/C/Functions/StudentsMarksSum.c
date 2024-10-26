#include <stdio.h>
#include <setjmp.h>

#define TRY do{ jmp_buf ex_buf__; if( !setjmp(ex_buf__) ){
#define CATCH } else {

int main()
{
    int studentAmount;
    scanf("%d",&studentAmount);
    int studentGrade[studentAmount];
    char sumGradeCheck;
    int sumGrade = 0;
    for (int i = 0; i < studentAmount; i++)
    {
        scanf("%d",&studentGrade[i]);
    }
    scanf("%c",&sumGradeCheck);
    if (sumGradeCheck == 'b')
    {
        TRY
        {
            for (int i = 0; i < studentAmount; i += 2)
            {
                sumGrade += studentGrade[i];
            }
            
        }
        CATCH
        {
            //
        }
    }
    else if (sumGradeCheck == 'g')
    {
        //
    }
    return 0;
}