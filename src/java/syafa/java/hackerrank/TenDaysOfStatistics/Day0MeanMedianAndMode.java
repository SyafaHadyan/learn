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
        input.close();
        double mean = Arrays.stream(data).average().orElse(0.0);
        double median = 0d;
        int modeCount = 1;
        int currentMode = 0;
        int mode = 1;
        int modeNumber = Integer.MAX_VALUE;
        Arrays.sort(data);
        median = (data[(dataLength / 2) - 1] + data[dataLength / 2]) / 2.0;
        if (dataLength % 2 != 0)
        {
            median = data[(dataLength / 2)];
        }
        for (int i = dataLength - 1; i >= 0; i--)
        {
            try
            {
                currentMode = (int) data[i];
                if (currentMode == data[i - 1])
                {
                    modeCount++;
                }
                if ((modeCount >= mode) && (currentMode < modeNumber))
                {
                    modeNumber = currentMode;
                    mode = modeCount;
                    modeCount = 1;
                }
            }
            catch (IndexOutOfBoundsException e)
            {
                modeCount = 1;
                if (data[0] == data[1])
                {
                    modeCount++;
                }
                if (modeCount >= mode && currentMode < modeNumber)
                {
                    modeNumber = (int) data[0];
                }
            }
        }
        System.out.printf("%.1f\n%.1f\n%d",mean,median,modeNumber);
    }
}