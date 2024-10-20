package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;
import java.util.stream.*;

public class ChocolateFeast
{
    public static void main(String[] args)
    {
        /*
         * n = money
         * c = chocolatePrice
         * m = chocolateWrapper
         * 
         * chocolateCounter
         * wrapperCounter
         * 
         * ex.
         * 
         * 15 3 2
         * 
         * money = 15 and chocolatePrice = 3
         * chocolateCounter = 5
         * wrapperCounter = 5
         * chocolateWrapper = 2
         * 
         * # Loop
         * 
         * chocolateCounter = 5
         * wrapperCounter = 5
         * chocolateWrapper = 2
         * 
         * while (wraperCounter >= chocolateWrapper)
         * {
         *      wrapperCounter - chocolateWrapper;
         *      chocolateCounter++;
         *      wrapperCounter++;
         * }
         * 
         * ## first iterate
         * 
         * chocolateCounter = 6
         * wrapperCounter = 5 - 2 = 3 + 1 = 4
         * 
         * ## second iterate
         * 
         * chocolateCounter = 7
         * wrapperCounter = 4 - 2 = 2 + 1 = 3
         * 
         * ## third iterate
         * 
         * chocolateCounter = 8
         * wrapperCounter = 3 - 2 = 1 + 1 = 2
         * 
         * ## fourth iterate
         * 
         * chocolateCounter = 9
         * wrapperCounter = 2 - 1 = 1 + 1 = 1
         * 
         * *End of iteration*
         * 
         * 
         *  3       t = 3 (test cases)
         * 10 2 5  n = 10, c = 2, m = 5 (first test case)
         * 12 4 4  n = 12, c = 4, m = 4 (second test case)
         * 6 2 2   n = 6,  c = 2, m = 2 (third test case)
         * 
         * 6
         * 3
         * 5
         */
        Scanner input = new Scanner(System.in);
        int testCase = Integer.parseInt(input.nextLine());
        int[] result = new int[testCase];
        for (int i = 0; i < testCase; i++)
        {
            /*
             * money chocolatePrice chocolateWrapper
             */
            int[] chocolate = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int chocolateCounter = chocolate[0] / chocolate[1];
            int wrapperCounter = chocolateCounter;
            while (wrapperCounter > chocolate[2])
            {
                wrapperCounter -= chocolate[2];
                chocolateCounter++;
                wrapperCounter++;
            }
            result[i] = chocolateCounter;
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