package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;
import java.util.stream.*;

public class OrganizingContainersOfBalls
{
    static class ballContainer
    {
        public static String sortBall(int[][] ball)
        {
            //int sum = 0;
            int[] container = new int[ball.length];
            int[] ballCount = new int[ball.length];
            for (int i = 0; i < ball.length; i++)
            {
                for (int j = 0; j < ball.length; j++)
                {
                    container[i] += ball[i][j];
                    ballCount[i] += ball[j][i];
                }
            }
            Arrays.sort(container);
            Arrays.sort(ballCount);
            if (Arrays.equals(container,ballCount))
            {
                return "Possible";
            }
            return "Impossible";
            /*
            for (int i = 0; i < ball.length; i++)
            {
                sum += ball[i][0];
            }
            for (int i = 1; i < ball[0].length; i++)
            {
                int tempSum = 0;
                for (int j = 0; j < ball.length; j++)
                {
                    tempSum += ball[j][i];
                }
                if (tempSum != sum)
                {
                    return "Impossible";
                }
            }
            return "Possible";
            */
        }
    }
    public static void main(String[] args)
    {
        /*
         * 0 1 2
         * 
         * 0 2 1
         * 1 1 1
         * 2 0 0
         * 
         * 0 = 3
         * 1 = 3
         * 2 = 2
         */
        Scanner input = new Scanner(System.in);
        int testCase = Integer.parseInt(input.nextLine());
        String[] result = new String[testCase];
        for (int i = 0; i < testCase; i++)
        {
            int containerAmount = Integer.parseInt(input.nextLine());
            int[][] container = new int[containerAmount][];
            for (int j = 0; j < containerAmount; j++)
            {
                container[j] = Stream.of(input.nextLine().split("\s")).mapToInt(Integer::parseInt).toArray();
            }
            result[i] = ballContainer.sortBall(container);
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