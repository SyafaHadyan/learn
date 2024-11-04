package syafa.java.hackerrank.TenDaysOfStatistics;
import java.util.*;
import java.util.stream.*;

public class Day7SpearmansRankCorrelationCoefficient
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int dataLength = Integer.parseInt(input.nextLine());
        double[] firstSet = Stream.of(input.nextLine().split("\s")).mapToDouble(Double::parseDouble).toArray();
        double[] secondSet = Stream.of(input.nextLine().split("\s")).mapToDouble(Double::parseDouble).toArray();
        input.close();
    }
}