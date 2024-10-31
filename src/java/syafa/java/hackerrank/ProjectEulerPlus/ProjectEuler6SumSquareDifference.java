package syafa.java.hackerrank.ProjectEulerPlus;
import java.util.*;

public class ProjectEuler6SumSquareDifference
{
    static class getDifference
    {
        public static int squareNumber(int number)
        {
            return 0;
        }
        public static int squareSum(int number)
        {
            return 0;
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
            result[i] = getDifference.squareNumber(temp) - getDifference.squareNumber(temp);
        }
        input.close();
    }
}