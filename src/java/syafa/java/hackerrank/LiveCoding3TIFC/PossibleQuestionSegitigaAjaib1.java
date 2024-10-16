package syafa.java.hackerrank.LiveCoding3TIFC;
import java.util.*;

public class PossibleQuestionSegitigaAjaib1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int staricaseSize = Integer.parseInt(input.nextLine());
        input.close();
        for (int i = 0; i < staricaseSize; i++)
        {
            for (int j = 0; j <= i; j++)
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