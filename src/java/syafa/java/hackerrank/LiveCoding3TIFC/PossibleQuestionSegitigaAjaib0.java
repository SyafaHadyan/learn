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
        for (int i = 0; i < staricaseSize; i++)
        {
            for (int j = 0; j < space; j++)
            {
                System.out.print(' ');
                if (j - space != 0)
                {
                    System.out.print(' ');
                }
            }
            space--;
            for (int j = 0; j <= i; j++)
            {
                System.out.print('*');
                if (j - staricaseSize != 0)
                {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }
}