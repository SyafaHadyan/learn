package syafa.java.hackerrank.uappemrogramandasar2023tifa;
import java.util.*;
import java.util.stream.*;

public class AwasRedZone
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] firstCoordinate = Stream.of(input.nextLine().split("\s")).mapToInt(Integer::parseInt).toArray();
        int[] secondCoordinate = Stream.of(input.nextLine().split("\s")).mapToInt(Integer::parseInt).toArray();
        int[] currentCoordinate = Stream.of(input.nextLine().split("\s")).mapToInt(Integer::parseInt).toArray();
        input.close();
    }
}