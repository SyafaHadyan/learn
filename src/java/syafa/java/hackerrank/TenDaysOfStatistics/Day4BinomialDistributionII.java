package syafa.java.hackerrank.TenDaysOfStatistics;
import java.util.*;
import java.util.stream.*;

public class Day4BinomialDistributionII
{
    public static double factorial(int number)
    {
        double result = 1d;
        for (int i = number; i > 0; i--)
        {
            result *= i;
        }
        return result;
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double[] data = Stream.of(input.nextLine().split("\s")).mapToDouble(Double::parseDouble).toArray();
        input.close();
        double result = 0d;
        for (int i = 3; i < 7; i++)
        {
            result += (720 / (factorial(i) * factorial(6 - i))) * Math.pow((data[0] / (data[0] + data[1])),i) * Math.pow(1 - (data[0] / (data[0] + data[1])),6 - i);
        }
        System.out.printf("%.3f",result);
    }
}