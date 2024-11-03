package syafa.java.hackerrank.TenDaysOfStatistics;
import java.util.*;
import java.util.stream.*;

public class Day4GeometricDistributionII
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] probabilityOfDefect = Stream.of(input.nextLine().split("\s")).mapToInt(Integer::parseInt).toArray();
        int defectAt = Integer.parseInt(input.nextLine());
        input.close();
        /*
         * 70% = 0.3^(n-1) * 0.7
         * 
         * 1 / 3 = (1-1/3)^4 * 1/3
         */
        System.out.printf("%.3f",);
    }
}