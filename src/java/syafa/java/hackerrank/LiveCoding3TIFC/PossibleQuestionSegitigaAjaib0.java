package syafa.java.hackerrank.LiveCoding3TIFC;
import java.util.*;

public class PossibleQuestionSegitigaAjaib0
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int staricaseSize = Integer.parseInt(input.nextLine());
        int space = staricaseSize - 1;
        input.close();
        for (int i = 0; i < space; i++)
        {
            System.out.print(' ');
        }
        space--;
        for (int i = 0; i < staricaseSize; i++)
        {
            System.out.print('*');
            if (i - staricaseSize != 0)
            {
                System.out.print(' ');
            }
        }
    }
}