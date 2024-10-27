package syafa.java.hackerrank.Algorithms.Search;
import java.util.*;
import java.util.stream.*;

public class IceCreamParlor
{
    static class iceCreamShop
    {
        public static int[] iceCreamPurchase(int money,int iceCreamTypeAmount,int[] iceCreamType)
        {
            int[] purchasedIceCream = new int[2];
            return purchasedIceCream;
        }
    }
    public static void main(String[] args)
    {
        /*
         * STDIN       Function
         * -----       --------
         * 2           t = 2
         * 4           k = 4
         * 5           cost[] size n = 5
         * 1 4 5 3 2   cost = [1, 4, 5, 3, 2]
         * 4           k = 4
         * 4           cost[] size n = 4
         * 2 2 4 3     cost=[2, 2,4, 3]
         * 
         * 1 4
         * 1 2
         * 
         * Two friends like to pool their money and go to the ice cream parlor.
         * They always choose two distinct flavors and they spend all of their money.
         * Given a list of prices for the flavors of ice cream, select the two that will cost all of the money they have. 
         */
        Scanner input = new Scanner(System.in);
        int testCase = Integer.parseInt(input.nextLine());
        int[][] purchasedIceCream = new int[testCase][2];
        for (int i = 0; i < testCase; i++)
        {
            int money = Integer.parseInt(input.nextLine());
            int iceCreamTypeAmount = Integer.parseInt(input.nextLine());
            int[] iceCreamType = Stream.of(input.nextLine().split("\s")).mapToInt(Integer::parseInt).toArray();
            purchasedIceCream[i] = iceCreamShop.iceCreamPurchase(money,iceCreamTypeAmount,iceCreamType);
        }
        input.close();
    }
}