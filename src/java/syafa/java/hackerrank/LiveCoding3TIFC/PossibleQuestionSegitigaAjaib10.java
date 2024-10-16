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
        for (int i = 0; i <= fibonacci; i++)
        {
            if (i == 0)
            {
                //currentIncr = 1;
            }
            nextSequence = previous + current;
            current = nextSequence;
            /*
             * 0
             * 1
             * 1
             * 2
             * 3
             * 5
             * 8
             */
        }
        System.out.print(nextSequence);
    }
}