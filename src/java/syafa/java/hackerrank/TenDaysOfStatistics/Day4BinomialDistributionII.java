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
    public static double factorial(double number)
    {
        double result = 1d;
        for (int i = (int) number; i > 0; i--)
        {
            result *= i;
        }
        return result;
    }
    public static void main(String[] args)
    {
        /*
         * 12 10
         * 
         * 0.891
         * 0.342
         */
        Scanner input = new Scanner(System.in);
        double[] data = Stream.of(input.nextLine().split("\s")).mapToDouble(Double::parseDouble).toArray();
        input.close();
        double result = 0d;
        for (int i = 1; i <= 2; i++)
        {
            result += (factorial(10) / (factorial(i) * factorial(data[0] / 100))) * Math.pow((data[1] / (data[0] + data[1])),i) * Math.pow(1 - (data[1] / (data[0] + data[1])),10 - i);
        }
        System.out.printf("%.3f",result);
        result = 0d;
        for (int i = 1; i <= 10; i++)
        {
            result += (720 / (factorial(i) * factorial(6 - i))) * Math.pow((data[0] / (data[0] + data[1])),i) * Math.pow(1 - (data[0] / (data[0] + data[1])),6 - i);
        }
        System.out.printf("\n%.3f",result);
    }
}