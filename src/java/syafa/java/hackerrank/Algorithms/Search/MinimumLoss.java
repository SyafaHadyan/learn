package syafa.java.hackerrank.Algorithms.Search;
import java.util.*;
import java.util.stream.*;

public class MinimumLoss
{
    public static void main(String[] args)
    {
        /*
         * 3
         * 5 10 3
         * 
         * 2
         * 
         * 5
         * 20 7 8 2 5
         * 
         * 2
         * 
         * int lowestPrice = Integer.MAX_VALUE;
         * sort housePrice
         * iterate through element
         * if ((i + 1) - i < lowestPrice)
         * {
         *      lowestPrice = (i + 1) - i;
         * }
         * 
         * iterate through i > last element then Math.abs(i > last element)
         * 
         */
        Scanner input = new Scanner(System.in);
        //int arrayLength = Integer.parseInt(input.nextLine());
        int[] housePrice = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        input.close();
        //Arrays.sort(housePrice);
        int lowestPrice = Integer.MAX_VALUE;
        for (int i = 0; i < housePrice.length; i++)
        {
            for (int j = 0 + i; j < housePrice.length - i; j++) 
            {
                if (Math.abs(housePrice[j]) - housePrice[j + 1] < lowestPrice)
                {
                    lowestPrice = Math.abs(housePrice[j] - housePrice[j + 1]);
                }
            }
        }
        System.out.print(lowestPrice);
    }
}