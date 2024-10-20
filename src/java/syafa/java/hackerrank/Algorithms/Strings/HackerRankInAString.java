package syafa.java.hackerrank.Algorithms.Strings;
import java.util.*;

public class HackerRankInAString
{
    public static void main(String[] args)
    {
        /*
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
        input.close();
        String[] hackerrank =
        {
            "H",
            "A",
            "C",
            "K",
            "E",
            "R",
            "R",
            "A",
            "N",
            "K"
        };
        for (int i = 0; i < check; i++)
        {
            checkString[i] = input.nextLine();
        }
        for (int i = 0; i < checkString.length; i++)
        {
            for (int j = 0; j < checkString[i].length(); j++)
            {
                
            }
        }
    }
}