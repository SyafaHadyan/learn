package syafa.java.hackerrank.TenDaysOfStatistics;
import java.util.*;

public class Day0MeanMedianAndMode
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int dataLength = Integer.parseInt(input.nextLine());
        int[] data = new int[dataLength];
        double mean = 0d;
        double median = 0d;
        int mode = 0;
        int currentMinVal = 0;
        int currentMaxMode = 1;
        int maxMode = 0;
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
        Arrays.sort(data);
        median = (data[(data.length / 2) - 1] + data[data.length / 2]) / 2.0;
        if (data.length % 2 != 0)
        {
            median = data[(data.length / 2)];
        }
        for (int i = 0; i < data.length; i++)
        {
            try
            {
                if (i == 0)
                {
                    mode = data[i];
                    maxMode = data[i];
                }
                if (data[i] == data[i + 1])
                {
                    currentMaxMode++;
                }
                if ((currentMaxMode > mode) && (data[i] > currentMinVal))
                {
                    mode = currentMaxMode;
                    currentMinVal = data[i];
                    maxMode = data[i];
                    currentMaxMode = 1;
                }
            }
            catch (IndexOutOfBoundsException e)
            {
                System.out.printf("%.1f\n%.1f\n%d",mean,median,maxMode);
            }
        }
    }
}