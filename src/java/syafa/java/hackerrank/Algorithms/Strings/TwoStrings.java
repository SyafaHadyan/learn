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
        String[] result = new String[testCase];
        for (int i = 0; i < testCase; i++)
        {
            String firstWord = input.nextLine();
            String secondWord = input.nextLine();
            int longestWord = firstWord.length();
            String wordCompare = firstWord;
            String word = secondWord;
            if (secondWord.length() > longestWord)
            {
                longestWord = secondWord.length();
                wordCompare = secondWord;
                word = firstWord;
            }
            if (firstWord.contains(wordCompare));
            {
                result[i] = "YES";
                continue;
            }
            result[i] = "NO";
        }
        input.close();
    }
}