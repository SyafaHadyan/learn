package syafa.java.hackerrank.TenDaysOfStatistics;
import java.util.*;
import java.util.stream.*;

public class Day1InterquartileRange
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        StringBuilder useless = new StringBuilder(input.nextLine());
        useless.delete(0,useless.length());
        int[][] dataFrequency = new int[2][];
        dataFrequency[0] = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        dataFrequency[1] = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        input.close();
        int counter = 0;
        int[] data = new int[IntStream.of(dataFrequency[1]).sum()];
        for (int i = 0; i < (dataFrequency[0].length + dataFrequency[1].length) / 2; i++)
        {
            for (int j = 0; j < dataFrequency[1][i]; j++)
            {
                data[counter] = dataFrequency[0][i];
                counter++;
            }
        }
        Arrays.sort(data);
        if (data.length % 2 == 0)
        {
            int[] lowerHalf = Arrays.copyOfRange(data,0,(data.length / 2));
            int[] upperHalf = Arrays.copyOfRange(data,(data.length / 2),data.length);
            double q1 = lowerHalf[(lowerHalf.length / 2)];
            double q3 = upperHalf[(upperHalf.length / 2)];
            if ((lowerHalf.length % 2 == 0) && (upperHalf.length % 2 == 0))
            {
                q1 = (lowerHalf[(lowerHalf.length / 2) - 1] + lowerHalf[(lowerHalf.length / 2)]) / 2.0;
                q3 = (upperHalf[(upperHalf.length / 2) - 1] + upperHalf[(upperHalf.length / 2)]) / 2.0;
            }
            System.out.printf("%.1f",(q3 - q1));
            return;
        }
        int[] lowerHalf = Arrays.copyOfRange(data,0,(data.length / 2));
        int[] upperHalf = Arrays.copyOfRange(data,((data.length / 2) + 1),data.length);
        double q1 = lowerHalf[(lowerHalf.length / 2)];
        double q3 = upperHalf[(upperHalf.length / 2)];
        if ((lowerHalf.length % 2 == 0) && (upperHalf.length % 2 == 0))
        {
            q1 = (lowerHalf[(lowerHalf.length / 2) - 1] + lowerHalf[(lowerHalf.length / 2)]) / 2.0;
            q3 = (upperHalf[(upperHalf.length / 2) - 1] + upperHalf[(upperHalf.length / 2)]) / 2.0;
        }
        System.out.printf("%.1f",(q3 - q1));
    }
}