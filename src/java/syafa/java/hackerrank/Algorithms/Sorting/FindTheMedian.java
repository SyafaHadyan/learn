package syafa.java.hackerrank.Algorithms.Sorting;
import java.util.*;
import java.util.stream.*;

public class FindTheMedian
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        StringBuilder useless = new StringBuilder(input.nextLine());
        useless.delete(0,useless.length());
        int[] number = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        input.close();
        Arrays.sort(number);
        if (number.length % 2 == 0)
        {
            System.out.printf("%d",(number[(number.length / 2) - 1]) + (number[number.length / 2] + 1) / 2.0);
            return;
        }
        System.out.printf("%d",(number[number.length / 2]));
    }
}