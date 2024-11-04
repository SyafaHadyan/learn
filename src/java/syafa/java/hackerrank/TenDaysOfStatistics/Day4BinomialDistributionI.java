package syafa.java.hackerrank.TenDaysOfStatistics;
import java.util.*;
import java.util.stream.*;

public class Day4BinomialDistributionI
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
        double ratioBoy = data[0] / (data[0] + data[1]);
        double result = 0d;
        for (int i = 3; i < 7; i++)
        {
            double binomialCoefficient = 720 / (factorial(i) * factorial(6 - i));
            double probability = binomialCoefficient * Math.pow(ratioBoy,i) * Math.pow(1 - ratioBoy,6 - i);
            result += probability;
        }
        System.out.printf("%.3f",result);
    }
}