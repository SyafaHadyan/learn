package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;
import java.util.stream.*;

public class ServiceLane
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] highwayCar = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        input.close();
    }
}