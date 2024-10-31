package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;
import java.util.stream.*;;

public class TaumAndBday
{
    static class purchase
    {
        public static int getGift(int[] giftAmount,int[] giftPrice)
        {
            return 0;
        }
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int testCase = Integer.parseInt(input.nextLine());
        int[] result = new int[testCase];
        for (int i = 0; i < testCase; i++)
        {
            int[] giftAmount = Stream.of(input.nextLine().split("\s")).mapToInt(Integer::parseInt).toArray();
            int[] giftPrice = Stream.of(input.nextLine().split("\s")).mapToInt(Integer::parseInt).toArray();
            result[i] = purchase.getGift(giftAmount,giftPrice);
        }
        input.close();
    }
}