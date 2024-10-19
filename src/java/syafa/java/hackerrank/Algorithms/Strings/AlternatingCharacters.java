package syafa.java.hackerrank.Algorithms.Strings;
import java.util.*;

public class AlternatingCharacters
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String wordString = input.nextLine();
        int testCase = Integer.parseInt(input.nextLine());
        input.close();
        int counter = 0;
        ArrayList<Character> word = new ArrayList<>();
        for (int i = 0; i < testCase; i++)
        {
            for (int j = 0; j < wordString.length(); j++)
            {
                word.add(wordString.charAt(j));
            }
            //ArrayList<Character> result = new ArrayList<>();
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
                    System.out.print(counter);
                    if (testCase - i != 1)
                    {
                        System.out.print("\n");
                    }
                }
            }
        }
    }
}