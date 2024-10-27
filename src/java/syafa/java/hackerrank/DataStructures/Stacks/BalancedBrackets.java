package syafa.java.hackerrank.DataStructures.Stacks;
import java.util.*;
import java.util.stream.*;

public class BalancedBrackets
{
    static class checkBalance
    {
        public static String sortBracket(String unsortedBracket)
        {
            char[] sort = unsortedBracket.toCharArray();
            Arrays.sort(sort);
            return new String(sort);
        }
        public static boolean matchedPair(String bracket)
        {
            bracket = checkBalance.sortBracket(bracket);
            Map<Character,Character> pair = Stream.of(new Object[][]
            {
                {'(',')'},
                {'{','}'},
                {'[',']'},
            }).collect(Collectors.toMap(data -> (Character) data[0],data -> (Character) data[1]));
            for (int i = 0; i < bracket.length(); i++)
            {
                
            }
            /*
            if (pair.get(openingBracket).equals(closingBracket))
            {
                return true;
            }
            return false;
            */
        }
        public static String isBalanced(String bracket)
        {
            if (checkBalance.matchedPair(bracket))
            {
                return "YES";
            }
            /*
            for (int i = 0; i < (bracket.length() / 2); i++)
            {
                if (checkBalance.matchedPair(bracket.charAt(i),bracket.charAt(bracket.length() - i - 1)))
                {
                    continue;
                }
                return "NO";
            }
            */
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