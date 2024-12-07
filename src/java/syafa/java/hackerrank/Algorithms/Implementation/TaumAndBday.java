package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;
import java.util.stream.*;

public class TaumAndBday
{
    private static long purchaseGift(long[] giftAmount,long[] giftCost)
    {
        long black = ((giftAmount[0] + giftAmount[1]) * giftCost[0]) + (giftCost[2] * giftAmount[1]);
        long white = ((giftAmount[0] + giftAmount[1]) * giftCost[1]) + (giftCost[2] * giftAmount[0]);
        long individual = (giftAmount[0] * giftCost[0]) + (giftAmount[1] * giftCost[1]);
        System.err.println(black + " " + white + " " + individual);
        return Math.min(individual,(Math.min(black,white)));
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int testCase = Integer.parseInt(input.nextLine());
        long[] totalGiftCost = new long[testCase];
        for (int i = 0; i < testCase; i++)
        {
            long[] giftAmount = Stream.of(input.nextLine().split("\s")).mapToLong(Long::parseLong).toArray();
            long[] giftCost = Stream.of(input.nextLine().split("\s")).mapToLong(Long::parseLong).toArray();
            totalGiftCost[i] = purchaseGift(giftAmount,giftCost);
        }
        input.close();
        for (int i = 0; i < totalGiftCost.length; i++)
        {
            System.out.println(totalGiftCost[i]);
        }
    }
}