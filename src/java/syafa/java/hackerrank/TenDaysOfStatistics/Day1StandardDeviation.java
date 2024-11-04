package syafa.java.hackerrank.TenDaysOfStatistics;
import java.util.*;
import java.util.stream.*;

public class Day1StandardDeviation
{
    public static void main(String[] args)
    {
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