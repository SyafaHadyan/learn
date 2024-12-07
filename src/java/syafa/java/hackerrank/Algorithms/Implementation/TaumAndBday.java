package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;
import java.util.stream.*;

public class TaumAndBday
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int testCase = Integer.parseInt(input.nextLine());
        for (int i = 0; i < testCase; i++)
        {
            int[] giftAmount = Stream.of(input.nextLine().split("\s")).mapToInt(Integer::parseInt).toArray();
            int[] giftCost = Stream.of(input.nextLine().split("\s")).mapToInt(Integer::parseInt).toArray();
        }
        input.close();
    }
}