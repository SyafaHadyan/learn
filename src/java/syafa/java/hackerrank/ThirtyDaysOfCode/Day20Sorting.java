package syafa.java.hackerrank.ThirtyDaysOfCode;
import java.util.*;
import java.util.stream.*;

public class Day20Sorting
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int arrayLength = Integer.parseInt(input.nextLine());
        int[] array = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        input.close();
    }
}