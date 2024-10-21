package syafa.java.hackerrank.TenDaysOfStatistics;
import java.util.*;
import java.util.stream.*;

public class Day1StandardDeviation
{
    public static void main(String[] args)
    {
        /*
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
         */
        Scanner input = new Scanner(System.in);
        int arraySize = Integer.parseInt(input.nextLine());
        int[] data = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        input.close();
        Arrays.sort(data);
        double mean = (data[(data.length / 2) - 1] + data[(data.length / 2) + 1]) / 2.0;
    }
}