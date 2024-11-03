package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;
import java.util.stream.*;

public class OrganizingContainersOfBalls
{
    static class ballContainer
    {
        public static String sortBall(int[][] ball)
        {
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
    }
}