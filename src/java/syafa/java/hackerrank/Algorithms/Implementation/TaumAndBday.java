package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;
import java.util.stream.*;

public class TaumAndBday
{
    private static int purchaseGift(int[] giftAmount,int[] giftCost)
    {
        int black = ((giftAmount[0] + giftAmount[1]) * giftCost[0]) + (giftCost[2] * giftAmount[1]);
        int white = ((giftAmount[0] + giftAmount[1]) * giftCost[1]) + (giftCost[2] * giftAmount[0]);
        int individual = (giftAmount[0] * giftCost[0]) + (giftAmount[1] * giftCost[1]);
        System.err.println(black + " " + white + " " + individual);
        return Math.min(individual,(Math.min(black,white)));
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int testCase = Integer.parseInt(input.nextLine());
        int[] totalGiftCost = new int[testCase];
        for (int i = 0; i < testCase; i++)
        {
            int[] giftAmount = Stream.of(input.nextLine().split("\s")).mapToInt(Integer::parseInt).toArray();
            int[] giftCost = Stream.of(input.nextLine().split("\s")).mapToInt(Integer::parseInt).toArray();
            totalGiftCost[i] = purchaseGift(giftAmount,giftCost);
        }
        input.close();
    }
}