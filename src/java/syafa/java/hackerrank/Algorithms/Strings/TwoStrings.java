package syafa.java.hackerrank.Algorithms.Strings;
import java.util.*;

public class TwoStrings
{
    public static void main(String[] args)
    {
        /*
         * testCase
         * hello
         * world
         * hi
         * world
         * 
         * YES
         * NO
         * 
         * 
         * testCase 0
         * 
         * hello
         * world
         * 
         * both contains o and l
         * YES
         * 
         * testCase1
         * 
         * hi
         * world
         * 
         * both string does not contain any mutual character
         * NO
         * 
         */
        Scanner input = new Scanner(System.in);
        int testCase = Integer.parseInt(input.nextLine());
        for (int i = 0; i < testCase; i++)
        {
            String firstWord = input.nextLine();
            String secondWord = input.nextLine();
            int longestWord = firstWord.length();
            if (secondWord.length() > longestWord)
            {
                longestWord = secondWord.length();
            }
            for (int j = 0; j < longestWord; j++)
            {
                if (firstWord.contains(secondWord))
            }
        }
        input.close();
    }
}