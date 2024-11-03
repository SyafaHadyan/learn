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
    }
}