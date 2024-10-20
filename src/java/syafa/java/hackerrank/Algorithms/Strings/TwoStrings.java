package syafa.java.hackerrank.Algorithms.Strings;
import java.util.*;

public class TwoStrings
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int testCase = Integer.parseInt(input.nextLine());
        String[] result = new String[testCase];
        for (int i = 0; i < testCase; i++)
        {
            String firstWord = input.nextLine();
            String secondWord = input.nextLine();
            int longestWord = firstWord.length();
            String longestString = firstWord;
            String shortestString = secondWord;
            if (secondWord.length() > longestWord)
            {
                longestWord = secondWord.length();
                longestString = secondWord;
                shortestString = firstWord;
            }
            for (int j = 0; j < longestWord; j++)
            {
                for (int k = 0; k < shortestString.length(); k++)
                {
                    if (shortestString.charAt(k) == longestString.charAt(j))
                    {
                        result[i] = "YES";
                        break;
                    }
                }
                if (longestWord - j == 1 && result[i] == null)
                {
                    result[i] = "NO";
                }
            }
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