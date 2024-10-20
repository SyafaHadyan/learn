package syafa.java.hackerrank.Algorithms.Strings;
import java.util.*;

public class HackerRankInAString
{
    public static void main(String[] args)
    {
        /*
         * 2
         * hereiamstackerrank
         * hackerworld
         * 
         * YES
         * NO
         * 
         * 1
         * hereiamstackerrank
         * 
         * H
         * A
         * C
         * K
         * E
         * R
         * R
         * A
         * N
         * K
         */
        Scanner input = new Scanner(System.in);
        int check = Integer.parseInt(input.nextLine());
        String[] checkString = new String[check];
        char[] hackerrank =
        {
            'H',
            'A',
            'C',
            'K',
            'E',
            'R',
            'R',
            'A',
            'N',
            'K'
        };
        for (int i = 0; i < check; i++)
        {
            checkString[i] = input.nextLine();
            checkString[i] = checkString[i].toUpperCase();
        }
        for (int i = 0; i < checkString.length; i++)
        {
            int counter = 0;
            ArrayList<String> tempCheckString = new ArrayList<>(Arrays.asList(checkString[i].split("")));
            for (int j = 0; j < checkString[i].length(); j++)
            {
                for (int k = 0; k < hackerrank.length; k++)
                {
                    if ()
                }
            }
        }
        input.close();
        for (int i = 0; i < checkString.length; i++)
        {
            System.out.println(checkString[i]);
        }
    }
}