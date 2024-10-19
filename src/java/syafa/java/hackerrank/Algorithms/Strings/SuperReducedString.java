package syafa.java.hackerrank.Algorithms.Strings;
import java.util.*;

public class SuperReducedString
{
    public static void main(String[] args)
    {
        /*
         * aaabccddd
         * 
         * abd
         * 
         * aa
         * 
         * Empty String
         * 
         * baab
         * 
         * Empty String
         */
        Scanner input = new Scanner(System.in);
        String wordString = input.nextLine();
        input.close();
        ArrayList<Character> word = new ArrayList<>();
        for (int i = 0; i < args.length; i++)
        {
            word.add(wordString.charAt(i));
        }
        ArrayList<Character> result = new ArrayList<>();
        for (int i = 0; i < word.length; i++)
        {
            try
            {
                if (word[i] == word[i + 1])
                {
                    
                }
                else if (word[i] != word[i])
                {
                    result.add(word[i]);
                }
            }
            catch (IndexOutOfBoundsException e)
            {
                //
            }
        }
    }
}