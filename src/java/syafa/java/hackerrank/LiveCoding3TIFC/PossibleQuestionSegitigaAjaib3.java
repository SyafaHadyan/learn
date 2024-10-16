package syafa.java.hackerrank.LiveCoding3TIFC;
import java.util.*;

public class PossibleQuestionSegitigaAjaib3
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int staricaseSize = Integer.parseInt(input.nextLine());
        input.close();
        for (int i = 0; i < staricaseSize; i++)
        {
            for (int j = 0; j < 2; j++)
            {
                for (int k = 0; k <= i; k++)
                {
                    System.out.print('*');
                    if ((k - staricaseSize != 0) && (i != 0))
                    {
                        System.out.print(' ');
                    }
                }
                if (j != 1)
                {
                    System.out.print("\n");
                }
            }
            if (staricaseSize - i != 1)
            {
                System.out.print("\n");
            }
        }
    }
}