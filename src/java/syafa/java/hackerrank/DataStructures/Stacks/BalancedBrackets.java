package syafa.java.hackerrank.DataStructures.Stacks;
import java.util.*;
import java.util.stream.*;

public class BalancedBrackets
{
    static class checkBalance
    {
        public static void matchedPair()
        {
            Map<Character,Character> pair = Stream.of(new Object[][]
            {
                {'(',')'},
                {'{','}'},
                {'[',']'},
            }).collect(Collectors.toMap(data -> (Character) data[0],data -> (Character) data[1]));
        }
        public static String isBalanced(String bracket)
        {
            for (int i = 0; i < (bracket.length() / 2); i++)
            {
                if ()
            }
            return "NO";
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
        String[] result = new String[testCase];
        for (int i = 0; i < testCase; i++)
        {
            result[i] = checkBalance.isBalanced(input.nextLine());
        }
        input.close();
    }
}