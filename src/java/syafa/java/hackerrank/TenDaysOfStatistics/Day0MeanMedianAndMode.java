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
        int mode = 0;
        int currentMinVal = 0;
        int currentMaxMode = 0;
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
                    mode = data[i];
                    currentMinVal = data[i];
                }
                if (data[i] == data[i + 1])
                {
                    if (data[i] == currentMinVal)
                    {
                        currentMaxMode++;
                    }
                }
                if (currentMaxMode > mode)
                {
                    mode = data[i];
                    currentMinVal = data[i];
                }
            }
            catch (IndexOutOfBoundsException e)
            {
                System.out.printf("%.1f\n%.1f\n%d",mean,median,mode);
            }
        }
    }
}