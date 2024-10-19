package syafa.java.hackerrank.Algorithms.Strings;
import java.util.*;

public class AlternatingCharacters
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int testCase = Integer.parseInt(input.nextLine());
        int[] result = new int[testCase];
        ArrayList<Character> word = new ArrayList<>();
        for (int i = 0; i < testCase; i++)
        {
            String wordString = input.nextLine();
            int counter = 0;
            for (int j = 0; j < wordString.length(); j++)
            {
                word.add(wordString.charAt(j));
            }
            for (int j = 0; j < word.size(); j++)
            {
                try
                {
                    if (word.get(j) == word.get(j + 1))
                    {
                        word.remove(j);
                        counter++;
                        j--;
                    }
                }
                catch (IndexOutOfBoundsException e)
                {
                    result[i] = counter;
                }
            }
        }
        input.close();
    }
}