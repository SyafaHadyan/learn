package syafa.java.hackerrank.TenDaysOfStatistics;
import java.util.*;

public class Day0MeanMedianAndMode
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int dataLength = Integer.parseInt(input.nextLine());
        int[] data = new int[dataLength];
        double mean = 0.0;
        double median = 0.0;
        int mode = Integer.MIN_VALUE;
        for (int i = 0; i < data.length; i++)
        {
            data[i] = Integer.parseInt(input.next());
        }
        input.close();
        for (int i = 0; i < data.length; i++)
        {
            mean += data[i];
            if (i == data.length - 1)
            {
                mean /= data.length;
            }
        }
        if (data.length % 2 == 0)
        {
            median = (data[(data.length / 2) - 1] + data[(data.length / 2) + 1]) / 2;
        }
        median = data[data.length / 2];
        // 1 2 3 4 5 6
        System.out.print(mean + "\n" + median + "\n" + mode);
    }
}