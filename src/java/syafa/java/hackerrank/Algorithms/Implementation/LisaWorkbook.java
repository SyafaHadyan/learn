package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;
import java.util.stream.*;

public class LisaWorkbook
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] book = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] problem = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        input.close();
        int specialProblem = 0;
        int pageNumber = 1;
        for (int i = 0; i < problem.length; i++)
        {
            for (int j = 1; j <= problem[i]; j++)
            {
                if (j == pageNumber)
                {
                    specialProblem++;
                }
                if (j % book[1] == 0 || j == problem[i])
                {
                    pageNumber++;
                }
            }
        }
        System.out.print(specialProblem);
    }
}