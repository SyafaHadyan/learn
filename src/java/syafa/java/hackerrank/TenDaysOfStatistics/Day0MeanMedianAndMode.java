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
        int mode = 0;
        int modeNumber = Integer.MAX_VALUE;
        //HashMap<Integer,Integer> modeHash = new HashMap<>();
        Arrays.sort(data);
        median = (data[(data.length / 2) - 1] + data[data.length / 2]) / 2.0;
        if (data.length % 2 != 0)
        {
            median = data[(data.length / 2)];
        }
        for (int i = 0; i < data.length - 1; i++)
        {
            currentMode = (int) data[i];
            if (currentMode == data[i + 1])
            {
                modeCount++;
            }
            else
            {
                modeCount = 1;
            }
            if (currentMode < modeNumber && modeCount >= mode)
            {
                modeNumber = currentMode;
                mode = modeCount;
                modeCount = 1;
            }
        }
        /*
        for (int i = data.length - 1; i >= 0; i--)
        {
            if (modeHash.get((int) data[i]) != null)
            {
                modeHash.merge((int) data[i],1,Integer::sum);
                continue;
            }
            modeHash.put((int) data[i],1);
        }
        for (int i = data.length - 1; i >= 0; i--)
        {
            if (modeHash.get((int) data[i]) >= modeCount && mode > (int) data[i])
            {
                modeCount = modeHash.get((int) data[i]);
                mode = (int) data[i];
            }
        }
        */
        /*
        for (int i = data.length - 1; i >= 0; i--)
        {
            int currentMaxVal = 0;
            for (int j = data.length - 1; j >= 0; j--)
            {
                if (data[i] == data[j])
                {
                    currentMaxVal++;
                }
            }
            if (currentMaxVal > maxValue)
            {
                maxValue = currentMaxVal;
                modeCount = (int) data[i];
            }
        }
        */
        System.out.printf("%.1f\n%.1f\n%d",mean,median,mode);
    }
}