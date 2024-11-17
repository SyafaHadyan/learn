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
        int maxCityDistance = Integer.MIN_VALUE;
        for (int i = 0; i < cityConfig[1]; i++)
        {
            stationConfig[input.nextInt()] = 1;
        }
        input.close();
        for (int i = 0; i < cityConfig[0]; i++)
        {
            int distanceLeft = 0;
            int distanceRight = 0;
            if (stationConfig[i] == 0)
            {
                //
            }
        }
        System.out.print(maxCityDistance);
    }
}