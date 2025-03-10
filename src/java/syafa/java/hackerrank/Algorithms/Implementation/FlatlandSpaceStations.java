package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;
import java.util.stream.*;

public class FlatlandSpaceStations
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] cityConfig = Stream.of(input.nextLine().split("\s")).mapToInt(Integer::parseInt).toArray();
        int[] stationConfig = new int[cityConfig[0]];
        int maxCityDistance = 0;
        for (int i = 0; i < cityConfig[1]; i++)
        {
            stationConfig[input.nextInt()] = 1;
        }
        input.close();
        for (int i = 0; i < cityConfig[0]; i++)
        {
            if (stationConfig[i] == 0)
            {
                int countLeft = 0;
                int countRight = 0;
                int indexLeft = i;
                int indexRight = i;
                int minCurrentDistance = 0;
                try
                {
                    while (stationConfig[indexLeft] != 1)
                    {
                        countLeft++;
                        indexLeft--;
                    }
                }
                catch (IndexOutOfBoundsException e)
                {
                    countLeft = Integer.MAX_VALUE;
                }
                try
                {
                    while (stationConfig[indexRight] != 1)
                    {
                        countRight++;
                        indexRight++;
                    }
                }
                catch (IndexOutOfBoundsException e)
                {
                    countRight = Integer.MAX_VALUE;
                }
                minCurrentDistance = Math.min(countLeft,countRight);
                if (minCurrentDistance > maxCityDistance)
                {
                    maxCityDistance = minCurrentDistance;
                }
            }
        }
        System.out.print(maxCityDistance);
    }
}