package syafa.java.hackerrank.TenDaysOfStatistics;
import java.util.*;
import java.util.stream.*;

public class Day4BinomialDistributionI
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double[] data = Stream.of(input.nextLine().split("\s")).mapToDouble(Double::parseDouble).toArray();
        input.close();
        double ratioBoy = data[0] / (data[0] + data[1]);
        double factorialK = 6;
        double factorialN = 720;
        double result = 0d;
        for (int i = 3; i <= 6; i++)
        {
            double factorial = 1d;
            for (int j = i; j > 0; j--)
            {
                factorial *= j;
            }
            result += factorial;
        }
    }
}