package syafa.java.hackerrank.DataStructures.Stacks;
import java.util.*;

public class BalancedBrackets
{
    static class checkBalance
    {
        public static void matchedPair()
        {
            char[] pair =
            {
                ')',
                '}',
                ']'
            };
        }
        public static boolean isBalanced(String bracket)
        {
            return false;
        }
    }
    public static void main(String[] args)
    {
        /*
         * STDIN           Function
         * -----           --------
         * 3               n = 3
         * {[()]}          first s = '{[()]}'
         * {[(])}          second s = '{[(])}'
         * {{[[(())]]}}    third s ='{{[[(())]]}}'
         * 
         * YES
         * NO
         * YES
         * 
         * (, ), {, }, [, or ].
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