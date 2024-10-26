#include <stdio.h>
#include <setjmp.h>

#define TRY do{ jmp_buf ex_buf__; if( !setjmp(ex_buf__) ){
#define CATCH } else {

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
        TRY
        {
            //
        }
        CATCH
        {
            //
        }
    }
    else if (sumGrade == 'g')
    {
        //
    }
    return 0;
}