package syafa.java.hackerrank.TenDaysOfStatistics;
import java.util.*;
import java.util.stream.*;

public class Day1InterquartileRange
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int dataSize = Integer.parseInt(input.nextLine());
        int[] data = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] frequency = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        input.close();
    }
}