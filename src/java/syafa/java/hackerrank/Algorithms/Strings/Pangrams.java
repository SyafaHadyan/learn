package syafa.java.hackerrank.Algorithms.Strings;
import java.util.*;

public class Pangrams
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String inputWord = input.nextLine();
        input.close();
        char[] alphabet =
        {
            'a',
            'b',
            'c',
            'd',
            'e',
            'f',
            'g',
            'h',
            'i',
            'j',
            'k',
            'l',
            'm',
            'n',
            'o',
            'p',
            'q',
            'r',
            's',
            't',
            'u',
            'v',
            'w',
            'x',
            'y',
            'z',
        };
        ArrayList<String> word = new ArrayList<>(Arrays.asList(inputWord.toLowerCase().split("")));
        Collections.sort(word);
        for (int i = 0; i < word.size(); i++)
        {
            try
            {
                if (word.get(0).charAt(0) == ' ')
                {
                    word.remove(0);
                }
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
        if (word.equals(Arrays.asList(alphabet)))
        {
            System.out.print("pangram");
            return;
        }
        System.out.print("pangram");
    }
}