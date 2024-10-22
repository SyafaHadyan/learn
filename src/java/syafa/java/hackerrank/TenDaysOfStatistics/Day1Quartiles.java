package syafa.java.hackerrank.TenDaysOfStatistics;
import java.util.*;
import java.util.stream.*;

public class Day1Quartiles
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        StringBuilder useless = new StringBuilder(input.nextLine());
        useless.delete(0,useless.length());
        int[] data = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        input.close();
        Arrays.sort(data);
        if (data.length % 2 == 0)
        {
            int[] lowerHalf = Arrays.copyOfRange(data,0,(data.length / 2));
            int[] upperHalf = Arrays.copyOfRange(data,(data.length / 2),data.length);
            double q1 = lowerHalf[(lowerHalf.length / 2)];
            double q2 = (data[((data.length / 2) - 1)] + data[(data.length / 2)]) / 2.0;
            double q3 = upperHalf[(upperHalf.length / 2)];
            if ((lowerHalf.length % 2 == 0) && (upperHalf.length % 2 == 0))
            {
                q1 = (lowerHalf[(lowerHalf.length / 2) - 1] + lowerHalf[(lowerHalf.length / 2)]) / 2.0;
                q3 = (upperHalf[(upperHalf.length / 2) - 1] + upperHalf[(upperHalf.length / 2)]) / 2.0;
            }
            System.out.printf("%.0f\n%.0f\n%.0f",q1,q2,q3);
            return;
        }
        int[] lowerHalf = Arrays.copyOfRange(data,0,(data.length / 2));
        int[] upperHalf = Arrays.copyOfRange(data,((data.length / 2) + 1),data.length);
        double q1 = lowerHalf[(lowerHalf.length / 2)];
        double q2 = (data[(data.length / 2)]);
        double q3 = upperHalf[(upperHalf.length / 2) + 1];
        if ((lowerHalf.length % 2 == 0) && (upperHalf.length % 2 == 0))
        {
            q1 = (lowerHalf[(lowerHalf.length / 2) - 1] + lowerHalf[(lowerHalf.length / 2)]) / 2.0;
            q3 = (upperHalf[(upperHalf.length / 2) - 1] + upperHalf[(upperHalf.length / 2)]) / 2.0;
        }
        System.out.printf("%.0f\n%.0f\n%.0f",q1,q2,q3);
    }
}