package syafa.java.hackerrank.LiveCoding3TIFC;
import java.util.*;

public class PossibleQuestionSegitigaAjaib10
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int fibonacci = Integer.parseInt(input.nextLine());
        input.close();
        int currentSeq = 0;
        int currentIncr = 1;
        for (int i = 0; i <= fibonacci; i++)
        {
            currentSeq += currentIncr;
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
        System.out.print(currentSeq);
    }
}