package syafa.java.hackerrank.ProjectEulerPlus;
import java.util.*;

public class ProjectEuler6SumSquareDifference
{
    static class getDifference
    {
        public static int squareNumber(int number)
        {
            int result = 0;
            for (int i = 1; i <= number; i++)
            {
                result += Math.pow(i,2);
            }
            return result;
        }
        public static int squareSum(int number)
        {
            int result = 0;
            for (int i = 1; i <= number; i++)
            {
                result += i;
            }
            return (int) Math.pow(result,2);
        }
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int testCase = Integer.parseInt(input.nextLine());
        int[] result = new int[testCase];
        for (int i = 0; i < testCase; i++)
        {
            int temp = Integer.parseInt(input.nextLine());
            result[i] = getDifference.squareSum(temp) - getDifference.squareNumber(temp);
        }
        input.close();
        for (int i = 0; i < result.length; i++)
        {
            System.out.print(result[i]);
            if (result.length - i != 1)
            {
                System.out.print("\n");
            }
        }
    }
}