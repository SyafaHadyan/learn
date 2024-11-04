package syafa.java.hackerrank.TenDaysOfStatistics;
import java.util.*;
import java.util.stream.*;

public class Day0MeanMedianAndMode
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int dataLength = Integer.parseInt(input.nextLine());
        double[] data = Stream.of(input.nextLine().split("\s")).mapToDouble(Double::parseDouble).toArray();
        double mean = Arrays.stream(data).average().orElse(0.0);
        double median = 0d;
        int maxValue = 0;
        int counter = 0;
        int mode = 0;
        input.close();
        Arrays.sort(data);
        median = (data[(data.length / 2) - 1] + data[data.length / 2]) / 2.0;
        if (data.length % 2 != 0)
        {
            median = data[(data.length / 2)];
        }
        for (int i = data.length - 2; i >= 0; i--)
        {
            if (data[i] >= data[mode])
            {
                mode = i;
            }
        }
        System.out.printf("%.1f\n%.1f\n%.0f",mean,median,data[mode]);
    }
}