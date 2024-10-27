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
            for (int i = 0; i < iceCreamTypeAmount; i++)
            {
                for (int j = 1 + i; j < iceCreamTypeAmount; j++)
                {
                    try
                    {
                        if (iceCreamType[i] + iceCreamType[j] == money)
                        {
                            purchasedIceCream[0] = i + 1;
                            purchasedIceCream[1] = j + 1;
                        }
                    }
                    catch (IndexOutOfBoundsException e)
                    {
                        //
                    }
                }
            }
            return purchasedIceCream;
        }
    }
    public static void main(String[] args)
    {
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
        for (int i = 0; i < purchasedIceCream.length; i++)
        {
            System.out.print(purchasedIceCream[i][0] + " " + purchasedIceCream[i][1]);
            if (purchasedIceCream.length - i != 1)
            {
                System.out.print("\n");
            }
        }
    }
}