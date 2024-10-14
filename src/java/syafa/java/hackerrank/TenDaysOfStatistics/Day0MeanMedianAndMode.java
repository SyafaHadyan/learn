package syafa.java.hackerrank.TenDaysOfStatistics;
import java.util.*;

public class Day0MeanMedianAndMode
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int dataLength = Integer.parseInt(input.nextLine());
        int[] data = new int[dataLength];
        double mean = -Double.MAX_VALUE;
        double median = -Double.MAX_VALUE;
        int mode = Integer.MIN_VALUE;
        for (int i = 0; i < dataLength; i++)
        {
            data[i] = Integer.parseInt(input.next());
        }
        input.close();
    }
}