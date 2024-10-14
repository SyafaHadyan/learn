package syafa.java.hackerrank.TenDaysOfStatistics;
import java.util.*;
import java.util.stream.*;

public class Day0WeightedMean
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int arrayLength = Integer.parseInt(input.nextLine());
        String[] firstArray = input.nextLine().split(" ");
        String secondArrayString = input.nextLine();
        double[] secondArray = Stream.of(secondArrayString.split("\\s+")).mapToDouble(Double::parseDouble).toArray();
        input.close();
        double result = 0d;
        for (int i = 0; i < arrayLength; i++)
        {
            result += (Double.parseDouble(firstArray[i]) * secondArray[i]);
            if (i == arrayLength - 1)
            {
                System.out.printf("%.1f",result / DoubleStream.of(secondArray).sum());
                return;
            }
        }
    }
}