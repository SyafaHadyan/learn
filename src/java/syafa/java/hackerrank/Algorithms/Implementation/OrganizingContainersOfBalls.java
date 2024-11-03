package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;
import java.util.stream.*;

public class OrganizingContainersOfBalls
{
    static class ballContainer
    {
        public static String sortBall(int[][] ball)
        {
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
        }
    }
    public static void main(String[] args)
    {
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