package syafa.java.hackerrank.ProjectEulerPlus;
import java.util.*;

public class ProjectEuler1MultiplesOf3And5
{
    static class getMultiple
    {
        public static int multipleOfTen(int number)
        {
            int multiple = 0;
            for (int i = 1; i <= number; i++)
            {
                if (i % 3 == 0 || i % 5 == 0)
                {
                    //
                }
            }
            return 0;
        }
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int testCase = Integer.parseInt(input.nextLine());
        int[] result = new int[testCase];
        for (int i = 0; i < result.length; i++)
        {
            result[i] = getMultiple.multipleOfTen(Integer.parseInt(input.nextLine()));
        }
        input.close();
    }
}