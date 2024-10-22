package syafa.java.hackerrank.TenDaysOfStatistics;
import java.util.*;
import java.util.stream.*;

public class Day1Quartiles
{
    public static void main(String[] args)
    {
        /*
         * STDIN                   Function
         * -----                   --------    
         * 9                       arr[] size n = 9 
         * 3 7 8 5 12 14 21 13 18  arr = [3, 7, 8, 5, 12, 14, 21, 13,18]
         * 
         * 6    lowerHalf median
         * 12   median
         * 16   upperHalf median
         */
        Scanner input = new Scanner(System.in);
        int arraySize = Integer.parseInt(input.nextLine());
        int[] data = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        input.close();
        Arrays.sort(data);
        if (data.length % 2 == 0)
        {
            int[] lowerHalf = Arrays.copyOfRange(data,0,(data.length / 2 - 1));
            int[] upperHalf = Arrays.copyOfRange(data,(data.length),(data.length - 1));
            double median = data[((data.length / 2) - 1)] + data[(data.length / 2)];
        }
    }
}