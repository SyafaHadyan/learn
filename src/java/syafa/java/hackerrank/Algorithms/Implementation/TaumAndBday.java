package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;
import java.util.stream.*;;

public class TaumAndBday
{
    static class purchase
    {
        public static int getGift(int[] giftAmount,int[] giftPrice)
        {
            if (giftPrice[0] > (giftPrice[1] + giftPrice[2]))
            {
                return (giftPrice[1] * (giftAmount[0] + giftAmount[1])) + (giftPrice[2] * giftAmount[0]);
            }
            else if (giftPrice[1] > (giftPrice[0] + giftPrice[2]))
            {
                return (giftPrice[0] * (giftAmount[0] + giftAmount[1]) + giftPrice[2] * giftAmount[1]);
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
        /*
         * STDIN   Function
         * -----   --------
         * 5       t = 5
         * 10 10   b = 10, w = 10
         * 1 1 1   bc = 1, wc = 1, z = 1
         * 5 9     b = 5, w = 5
         * 2 3 4   bc = 2, wc = 3, z = 4
         * 3 6     b = 3, w = 6
         * 9 1 1   bc = 9, wc = 1, z = 1
         * 7 7     b = 7, w = 7
         * 4 2 1   bc = 4, wc = 2, z = 1
         * 3 3     b = 3, w = 3
         * 1 9 2   bc = 1, wc = 9, z = 2
         * 
         * 5
         * 10 10
         * 1 1 1
         * 5 9
         * 2 3 4
         * 3 6
         * 9 1 1
         * 7 7
         * 4 2 1
         * 3 3
         * 1 9 2
         */
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