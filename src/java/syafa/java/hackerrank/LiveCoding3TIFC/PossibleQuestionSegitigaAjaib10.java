package syafa.java.hackerrank.LiveCoding3TIFC;
import java.util.*;

public class PossibleQuestionSegitigaAjaib10
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int fibonacci = Integer.parseInt(input.nextLine());
        input.close();
        int previous = 0;
        int current = 1;
        int nextSequence = 0;
        if (fibonacci == 0)
        {
            System.out.print(0);
            return;
        }
        if (fibonacci == 1)
        {
            System.out.println(0);
            System.out.print(1);
            return;
        }
        for (int i = 2; i <= fibonacci; i++)
        {
            if (i == 2)
            {
                System.out.println(0 + "\n" + 1);
            }
            nextSequence = current + previous;
            previous = current;
            current = nextSequence;
            System.out.print(nextSequence);
            if (i != fibonacci)
            {
                System.out.print("\n");
            }
        }
    }
}