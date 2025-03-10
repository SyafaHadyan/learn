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
        double[] firstSetOriginalCopy = Arrays.copyOf(firstSet,dataLength);
        double[] secondSetOriginalCopy = Arrays.copyOf(secondSet,dataLength);
        Arrays.sort(firstSet);
        Arrays.sort(secondSet);
        input.close();
        double rankDifference = 0;
        HashMap<Double,Integer> firstSetMap = new HashMap<>();
        HashMap<Double,Integer> secondSetMap = new HashMap<>();
        for (int i = 0; i < dataLength; i++)
        {
            firstSetMap.put(firstSet[i],(i));
            secondSetMap.put(secondSet[i],(i));
        }
        for (int i = 0; i < dataLength; i++)
        {
            rankDifference += Math.pow(Math.abs((firstSetMap.get(firstSetOriginalCopy[i]) - secondSetMap.get(secondSetOriginalCopy[i]))),2);
        }
        System.out.printf("%.3f",(1 - ((6 * rankDifference) / (dataLength * ((Math.pow(dataLength,2)) - 1)))));
    }
}