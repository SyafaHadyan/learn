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
            for (int j = space; j > 0; j--)
            {
                System.out.print(' ');
                if (j != 0)
                {
                    System.out.print(' ');
                }
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