package syafa.java.hackerrank.LiveCoding3TIFC;
import java.util.*;

public class PossibleQuestionSegitigaAjaib7
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
            }
            space--;
            for (int j = 0; j <= i; j++)
            {
                System.out.print('*');
                if ((j - staricaseSize != 0) && (i != 0))
                {
                    System.out.print(' ');
                }
            }
            if (staricaseSize - i != 1)
            {
                System.out.print("\n");
            }
        }
        System.out.println();
        space = 1;
        for (int i = staricaseSize - 1; i > 0; i--)
        {
            for (int j = space; j > 0; j--)
            {
                System.out.print(' ');
            }
            space++;
            for (int j = i; j > 0; j--)
            {
                System.out.print('*');
                if (j != 1)
                {
                    System.out.print(' ');
                }
            }
            if (i != 1)
            {
                System.out.print("\n");
            }
        }
    }
}