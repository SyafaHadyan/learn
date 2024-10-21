package syafa.java.hackerrank.TenDaysOfStatistics;
import java.util.*;
import java.util.stream.*;

public class Day1StandardDeviation
{
    public static void main(String[] args)
    {
        /*
         * 1 2 3 4 5 6 7
         * 
         * 
         * 2 5 2 7 4
         * sum = 20
         * mean = 4
         * 
         * substract mean from each element > square the result > take sum > average 1 digit precision
         * 
         * 5
         * 10 40 30 50 20
         * 
         * 14.1
         * 
         * STDIN           Function
         * -----           --------
         * 5               arr[] size n = 5
         * 10 40 30 50 20  arr =[10, 40, 30, 50, 20]
         * 
         * 10
         * 64630 11735 14216 99233 14470 4978 73429 38120 51135 67060
         * 
         * 30466.9
         */
        Scanner input = new Scanner(System.in);
        int arraySize = Integer.parseInt(input.nextLine());
        int[] data = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        input.close();
        Arrays.sort(data);
        double standardDeviation = 0d;
        double mean = (data[(data.length / 2) - 1] + data[(data.length / 2) + 1]) / 2.0;
        if (data.length % 2 != 0)
        {
            mean = data[(data.length / 2)];
        }
        for (int i = 0; i < data.length; i++)
        {
            standardDeviation += Math.pow((data[i] - mean),2);
        }
        double result = (Math.sqrt(standardDeviation / data.length));
        System.out.printf("%.1f",result);
    }
}