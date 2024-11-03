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
        System.out.printf("%.3f",1 - (Math.pow(((double) 1) - ((double) probabilityOfDefect[0] / (double) probabilityOfDefect[1]),defectAt)));
    }
}