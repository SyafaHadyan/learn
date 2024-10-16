package syafa.java.hackerrank.LiveCoding3TIFC;
import java.util.*;

public class PossibleQuestionSegitigaAjaib11
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int triangleLevel = Integer.parseInt(input.nextLine());
        input.close();
        int[] values = new int[triangleLevel + 1];
        /*
         * 1
         * 1 1
         * 1 2 1
         * 1 3 3 1
         * 1 4 6 4 1
         * 1 5 10 10 5 1
         */
        for (int i = 0; i < triangleLevel; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print(values[j]);
            }
        }
    }
}