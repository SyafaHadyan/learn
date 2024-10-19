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
        char[] word = input.nextLine().toCharArray();
        input.close();
        ArrayList<Character> result = new ArrayList<>();
        for (int i = 0; i < word.length; i++)
        {
            try
            {
                if (word[i] == word[i + 1])
                {
                    //
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