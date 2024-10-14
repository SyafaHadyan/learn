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
        int currentMinVal = Integer.MIN_VALUE;
        int currentMaxMode = Integer.MIN_VALUE;
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
        median = (data[(data.length / 2) - 1] + data[(data.length / 2) + 1]) / 2;
        if (data.length % 2 != 0)
        {
            median = data[data.length / 2];
        }
        Arrays.sort(data);
        for (int i = 0; i < data.length; i++)
        {
            try
            {
                if (i == 0)
                {
                    currentMinVal = 0;
                    currentMaxMode = 0;
                    mode = 1;
                }
                if (data[i] > currentMinVal && currentMaxMode > mode)
                {
                    currentMinVal = data[i];
                    mode = currentMaxMode;
                    currentMaxMode = 1;
                }
                else if (data[i] == data[i + 1])
                {
                    currentMaxMode++;
                }
            }
            catch (IndexOutOfBoundsException e)
            {
                System.out.printf("%.1f%.1f%d",mean,median,mode);
            }
        }
    }
}