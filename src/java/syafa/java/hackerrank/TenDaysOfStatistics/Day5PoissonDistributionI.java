package syafa.java.hackerrank.TenDaysOfStatistics;
import java.util.*;

public class Day5PoissonDistributionI
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double averageNumberOfSuccess = Double.parseDouble(input.nextLine());
        double probabilityValue = Double.parseDouble(input.nextLine());
        double factorialOfProbabilityValue = 1d;
        for (int i = (int) probabilityValue; i > 0; i--)
        {
            factorialOfProbabilityValue *= i;
        }
        input.close();
        System.out.printf("%.3f",(((Math.pow(averageNumberOfSuccess,probabilityValue)) * (Math.pow(Math.E,(-averageNumberOfSuccess)))) / factorialOfProbabilityValue));
    }
}