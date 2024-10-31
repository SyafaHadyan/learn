package syafa.java.hackerrank.Algorithms.Implementation;
import static java.util.stream.Collectors.reducing;

import java.util.*;
import java.util.stream.*;;

public class TaumAndBday
{
    static class purchase
    {
        public static int getGift(int[] giftAmount,int[] giftPrice)
        {
            if ((giftPrice[2] < giftPrice[0]) && (giftPrice[2] < giftPrice[1]))
            {
                if (giftPrice[0] > (giftPrice[1] + giftPrice[2]))
                {
                    return (giftPrice[1] * (giftAmount[0] + giftAmount[1])) + (giftPrice[2] * giftAmount[0]);
                }
                else if (/*2 is higher */)
                {
                    //
                }
            }
            if ((giftPrice[0] == giftPrice[1]) || ((giftPrice[2] > giftPrice[0]) && (giftPrice[2] > giftPrice[1])))
            {
                return (giftAmount[0] * giftPrice[0]) + (giftAmount[1] * giftPrice[1]);
            }
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
        for (int i = 0; i < result.length; i++)
        {
            System.out.print(result[i]);
            if (result.length - i != 1)
            {
                System.out.print("\n");
            }
        }
    }
}