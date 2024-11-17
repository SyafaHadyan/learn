package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;
import java.util.stream.*;

public class FlatlandSpaceStations
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] cityConfig = Stream.of(input.nextLine().split("\s")).mapToInt(Integer::parseInt).toArray();
        int[] stationConfig = Stream.of(input.nextLine().split("\s")).mapToInt(Integer::parseInt).toArray();
        input.close();
    }
}