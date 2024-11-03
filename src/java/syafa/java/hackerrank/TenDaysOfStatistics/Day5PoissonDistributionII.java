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
        System.out.printf("%.3f\n%.3f",(160 + (40 * (machineOperationCost[0] + (Math.pow(machineOperationCost[0],2))))),(128 + (40 * (machineOperationCost[1] + (Math.pow(machineOperationCost[1],2))))));
    }
}