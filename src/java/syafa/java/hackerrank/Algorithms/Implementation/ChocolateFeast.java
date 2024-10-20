package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;

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
         * chocolateCounter = 7
         * wrapperCounter = 1
         * chocolateWrapper = 2
         * 
         * 
         * # Other
         * 
         * convert wrapperCounter > chocolateCounter
         * wrapperCounter = wrapperCounter % (wrapperCounter / chocolateWrapper) = 1 (wrapperCounter now 1)
         * chocolateCounter += 
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
        for (int i = 0; i < testCase; i++)
        {
            //
        }
        input.close();
    }
}