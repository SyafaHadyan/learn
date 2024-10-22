package syafa.java.hackerrank.TenDaysOfStatistics;
import java.util.*;
import java.util.stream.*;

public class Day1InterquartileRange
{
    public static void main(String[] args)
    {
        /*
         * STDIN           Function
         * -----           --------
         * 6               arrays size n = 6
         * 6 12 8 10 20 16 values = [6, 12, 8, 10, 20, 16]
         * 5 4 3 2 1 5     freqs = [5, 4, 3, 2, 1, 5]
         * 
         * 9.0
         * 
         * 6
         * 6 12 8 10 20 16
         * 5 4 3 2 1 5
         * 
         * sort
         * 
         * create 6 5 times
         * create 8 3 times
         * 
         * Lower half (L): 6, 6, 6, 6, 6, 8, 8, 8, 10, 10
         * Upper half (U): 12, 12, 12, 12, 16, 16, 16, 16, 16, 20
         * 
         * Q1 = 7.0
         * Q2 = 16.0
         * 
         * interquartileRange = 16.0 - 7.0 = 9.0
         * 
         * 
         */
        Scanner input = new Scanner(System.in);
        int dataSize = Integer.parseInt(input.nextLine());
        int[][] dataFrequency = new int[2][];
        dataFrequency[0] = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        dataFrequency[1] = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        input.close();
        int counter = 0;
        int[] data = new int[IntStream.of(dataFrequency[1]).sum()];
        for (int i = 0; i < dataFrequency[0].length; i++)
        {
            for (int j = 0; j < dataFrequency[1][i]; j++)
            {
                data[counter] = dataFrequency[0][i];
            }
        }
        System.out.println();
    }
}