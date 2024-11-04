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
        StringBuilder uselesss = new StringBuilder(input.nextLine());
        uselesss.delete(0,uselesss.length());
        double[] data = Stream.of(input.nextLine().split("\s")).mapToDouble(Double::parseDouble).toArray();
        input.close();
        Arrays.sort(data);
        double mean = Arrays.stream(data).average().orElse(0.0);
        double standardDeviation = 0d;
        for (int i = 0; i < data.length; i++)
        {
            standardDeviation += Math.pow((data[i] - mean),2);
        }
        System.out.printf("%.1f",(Math.sqrt(standardDeviation / data.length)));
    }
}