package syafa.java.hackerrank.LiveCoding3TIFC;
import java.util.*;

public class PossibleQuestionSegitigaAjaib4
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int staricaseSize = Integer.parseInt(input.nextLine());
        int space = 0;
        input.close();
        for (int i = staricaseSize; i > 0; i--)
        {
            for (int j = 0; j < space; j++)
            {
                System.out.print(' ');
                if (space - j != 0)
                {
                    System.out.print(' ');
                }
            }
            space++;
            for (int j = 1; j >= 0; j++)
            {
                System.out.print('*');
                if ((j - staricaseSize != 0) && (i != 0))
                {
                    System.out.print(' ');
                }
            }
            if (staricaseSize - i != 1)
            System.out.print("\n");
        }
    }
}