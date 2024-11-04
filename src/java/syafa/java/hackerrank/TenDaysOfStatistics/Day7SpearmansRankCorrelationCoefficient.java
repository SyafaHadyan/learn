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
        double rankDifference = 0d;
        HashMap<Double,Integer> firstSetMap = new HashMap<Double,Integer>();
        HashMap<Double,Integer> secondSetMap = new HashMap<Double,Integer>();
        for (int i = 0; i < (firstSet.length + secondSet.length) / 2; i++)
        {
            firstSetMap.put(firstSet[i],(i + 1));
            secondSetMap.put(secondSet[i],(i + 1));
        }
        Arrays.sort(firstSet);
        Arrays.sort(secondSet);
        for (int i = 0; i < (firstSet.length + secondSet.length) / 2; i++)
        {
            rankDifference += Math.pow((firstSetMap.get(firstSet[i]) - secondSetMap.get(secondSet[i])),2);
        }
        System.out.print(rankDifference);
    }
}