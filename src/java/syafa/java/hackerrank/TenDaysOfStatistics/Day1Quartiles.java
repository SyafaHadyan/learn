package syafa.java.hackerrank.TenDaysOfStatistics;
import java.util.*;
import java.util.stream.*;

public class Day1Quartiles
{
    public static void main(String[] args)
    {
        /*
         * TODO: Fix median calculation
         * 
         * STDIN                   Function
         * -----                   --------    
         * 9                       arr[] size n = 9 
         * 3 7 8 5 12 14 21 13 18  arr = [3, 7, 8, 5, 12, 14, 21, 13,18]
         * 
         * 6    lowerHalf median
         * 12   median
         * 16   upperHalf median
         * 
         * 6, 7, 15, 36, 39, 40, 41, 42, 43, 47, 49
         * 
         * 0 1 2 3 4 5 6
         * lowerHalf    median  upperHalf
         * 0 1 2        3       4 5 6
         * 
         * 3 7 8 5 12 14 21 13 18
         * sort
         * 3 5 7 8 12 13 14 18 21
         * lowerHalf    median  upperHalf
         * 3 5 7 8      12      13 14 18 21
         * 
         */
        Scanner input = new Scanner(System.in);
        int arraySize = Integer.parseInt(input.nextLine());
        int[] data = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        input.close();
        Arrays.sort(data);
        if (data.length % 2 == 0)
        {
            int[] lowerHalf = Arrays.copyOfRange(data,0,(data.length / 2 - 1));
            int[] upperHalf = Arrays.copyOfRange(data,(data.length / 2),(data.length - 1));
            double q1 = lowerHalf[(lowerHalf.length / 2)];
            double q2 = (data[((data.length / 2) - 1)] + data[(data.length / 2)]) / 2.0;
            double q3 = upperHalf[(upperHalf.length / 2)];
            System.out.printf("%.0f\n%.0f\n%.0f",q1,q2,q3);
            return;
        }
        int[] lowerHalf = Arrays.copyOfRange(data,0,(data.length / 2));
        int[] upperHalf = Arrays.copyOfRange(data,(data.length / 2),data.length - 1);
        double q1 = lowerHalf[(lowerHalf.length / 2)];
        double q2 = (data[(data.length / 2)]);
        double q3 = upperHalf[(upperHalf.length / 2) + 1];
        if ((lowerHalf.length % 2 == 0) && (upperHalf.length % 2 == 0))
        {
            q1 = (lowerHalf[(lowerHalf.length / 2) - 1] + lowerHalf[(lowerHalf.length / 2) + 1]) / 2.0;
            q3 = (upperHalf[(upperHalf.length / 2) - 1] + upperHalf[(upperHalf.length / 2) + 1]) / 2.0;
        }
        System.out.printf("%.0f\n%.0f\n%.0f",q1,q2,q3);
    }
}