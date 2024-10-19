package syafa.java.hackerrank.Algorithms.Strings;
import java.util.*;

public class Pangrams
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        //char[] word = input.nextLine().toCharArray();
        String inputWord = input.nextLine();
        ArrayList<String> word = new ArrayList<>(Arrays.asList(inputWord.toLowerCase().split("")));

        Collections.sort(word);
        input.close();
        for (int i = 0; i < word.size(); i++)
        {
            try
            {
                if (word.get(i).equalsIgnoreCase(word.get(i + 1)))
                {
                    word.remove(i);
                    i--;
                }
            }
            catch (IndexOutOfBoundsException e)
            {
                //
            }
        }
        for (int i = 0; i < word.size(); i++)
        {
            System.out.println(word.get(i));
        }
    }
}