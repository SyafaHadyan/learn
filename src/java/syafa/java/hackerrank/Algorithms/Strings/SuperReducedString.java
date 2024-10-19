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
        for (int i = 0; i < wordString.length(); i++)
        {
            word.add(wordString.charAt(i));
        }
        Collections.sort(word);
        //ArrayList<Character> result = new ArrayList<>();
        for (int i = 0; i < word.size(); i++)
        {
            try
            {
                if (word.get(i) == word.get(i + 1))
                {
                    word.remove(i);
                }
                /*
                else if (word.get(i) != word.get(i))
                {
                    result.add(word.get(i));
                }
                */
            }
            catch (IndexOutOfBoundsException e)
            {
                if (word.isEmpty())
                {
                    System.out.print("Empty string");
                    return;
                }
                for (int j = 0; j < word.size(); j++)
                {
                    System.out.print(word.get(j));
                }
            }
        }
    }
}