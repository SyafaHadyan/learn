package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;
import java.util.stream.*;;

public class TaumAndBday
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int testCase = Integer.parseInt(input.nextLine());
        int[] result = new int[testCase];
        for (int i = 0; i < testCase; i++)
        {
            int[] giftAmount = Stream.of(input.nextLine().split("\s")).mapToInt(Integer::parseInt).toArray();
            int[] giftPrice = Stream.of(input.nextLine().split("\s")).mapToInt(Integer::parseInt).toArray();
        }
        input.close();
    }
}