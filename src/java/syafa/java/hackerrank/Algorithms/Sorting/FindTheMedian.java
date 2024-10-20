package syafa.java.hackerrank.Algorithms.Sorting;
import java.util.*;
import java.util.stream.*;

public class FindTheMedian
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int arrayLength = Integer.parseInt(input.nextLine());
        int[] number = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        input.close();
        Arrays.sort(number);
        if (number.length % 2 == 0)
        {
            System.out.printf("%.0f",(number[(number.length / 2) - 1]) + (number[number.length / 2] + 1) / 2.0);
        }
    }
}