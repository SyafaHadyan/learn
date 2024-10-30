package syafa.java.hackerrank.latsolpemdastif24;
import java.util.*;

public class Pangram
{
    public static void main(String[] args)
    {
        /*
         * Tokoh qari bonceng juru xilofon di vespanya muzawir.
         * 
         * Input hanya pangram biasa saja :)
         * 
         * Blowzy night-frumps vex'd Jack Q.
         * 
         * Input merupakan pangram sempurna! :D
         */
        Scanner input = new Scanner(System.in);
        String inputWord = input.nextLine();
        inputWord = inputWord.replaceAll("[^\\p{L}\\p{Nd}]+", "");
        input.close();
        boolean specialPangram = false;
        String[] alphabet =
        {
            "a",
            "b",
            "c",
            "d",
            "e",
            "f",
            "g",
            "h",
            "i",
            "j",
            "k",
            "l",
            "m",
            "n",
            "o",
            "p",
            "q",
            "r",
            "s",
            "t",
            "u",
            "v",
            "w",
            "x",
            "y",
            "z",
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
                    specialPangram = true;
                    i--;
                }
            }
            catch (IndexOutOfBoundsException e)
            {
                //
            }
        }
        String[] wordChar = word.toArray(new String[word.size()]);
        if (Arrays.compare(wordChar,alphabet) == 0 && (wordChar.length == 26))
        {
            if (specialPangram)
            {
                System.out.print("pangram special");
                return;
            }
            System.out.print("pangram not special");
            return;
        }
        System.out.print("not pangram");
    }
}