package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;
import java.util.stream.*;

public class MinimumDistances
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        StringBuilder useless = new StringBuilder(input.nextLine());
        useless.delete(0, useless.length());
        int[] array = Stream.of(input.nextLine().split("\s")).mapToInt(Integer::parseInt).toArray();
        input.close();
        int minDistance = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 1 + i; j < array.length; j++)
            {
                if (array[i] == array[j] && Math.abs(j - i) < minDistance)
                {
                    minDistance = Math.abs(j - i);
                }
            }
        }
        if (minDistance == Integer.MAX_VALUE)
        {
            System.out.print(-1);
            System.exit(0);
        }
        System.out.print(minDistance);
    }
}