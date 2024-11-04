package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;
import java.util.stream.*;

public class MinimumDistances
{
    public static void main(String[] args)
    {
        /*
         * STDIN           Function
         * -----           --------
         * 6               arr[] size n = 6
         * 7 1 3 4 1 7     arr = [7, 1, 3, 4, 1, 7]
         * 
         * 3
         * 
         * 6
         * 7 1 3 4 1 7
         */
        Scanner input = new Scanner(System.in);
        int arrayLength = Integer.parseInt(input.nextLine());
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