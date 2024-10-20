package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;
import java.util.stream.*;

public class HalloweenSale
{
    public static void main(String[] args)
    {
        /*
         * p = firstGamePrice
         * d = discountPrevious (discount from previous game price)
         * m = minimumGameCost (minimum game cost)
         * s = budget (starting budget)
         * 
         * p  d m s
         * 20 3 6 70
         * 
         * 5
         * 
         * 20 17 14 11 8 6 6 6 6 6
         * 
         * gameCount = 0;
         * while (budget >= 0)
         * {
         *      budget -= firstGamePrice;
         *      gameCount++;
         *      if (firstGamePrice != minimumGameCost)
         *      {
         *          firstGamePrice -= discountPrevious;
         *      }
         * }
         */
        Scanner input = new Scanner(System.in);
        int[] initialSetup = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int gameCount = 0;
        input.close();
        while (initialSetup[3] >= 0)
        {
            initialSetup[3] -= initialSetup[0];
            gameCount++;
            if (initialSetup[0] != initialSetup[2])
            {
                initialSetup[0] -= initialSetup[1];
            }
        }
        System.out.print(gameCount);
    }
}