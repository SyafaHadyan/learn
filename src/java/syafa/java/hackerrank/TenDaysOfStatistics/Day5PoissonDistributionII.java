package syafa.java.hackerrank.TenDaysOfStatistics;
import java.util.*;
import java.util.stream.*;

public class Day5PoissonDistributionII
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double[] machineOperationCost = Stream.of(input.nextLine().split("\s")).mapToDouble(Double::parseDouble).toArray();
        input.close();
        double dailyCostA = (160 + (40 * (Math.pow(machineOperationCost[0],2))));
        double dailyCostB = (128 + (40 * (Math.pow(machineOperationCost[1],2))));
        double factorialDailyCostA = 1d;
        double factorialDailyCostB = 1d;
        for (int i = (int) dailyCostA; i > 0; i--)
        {
            factorialDailyCostA *= i;
        }
        for (int i = (int) dailyCostB; i > 0; i--)
        {
            factorialDailyCostB *= i;
        }
        System.out.printf("%.3f\n%.3f",);
    }
}