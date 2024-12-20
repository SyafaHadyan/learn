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
         * 
         * Praktikum PemDas TIF-A 2024
         * 
         * Input bukan merupakan pangram karena tidak memiliki huruf B, C, G, H, J, L, N, O, Q, V, W, X, Y, Z :(
         *                                                              A D E F I K M P R S T U
         */
        Scanner input = new Scanner(System.in);
        String inputWord = input.nextLine();
        inputWord = inputWord.replaceAll("[^\\p{L}\\p{Nd}]+", "");
        input.close();
        boolean specialPangram = true;
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
                    specialPangram = false;
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
                System.out.print("Input merupakan pangram sempurna! :D");
                return;
            }
            System.out.print("Input hanya pangram biasa saja :)");
            return;
        }
        System.out.print("Input bukan merupakan pangram karena tidak memiliki huruf ");
        Set<String> alphabetSet = new HashSet<>(Arrays.asList(alphabet));
        Set<String> containWord = new HashSet<>(Arrays.asList(wordChar));
        alphabetSet.removeAll(containWord);
        for (String missing : alphabetSet)
        {
            System.out.print((missing.toUpperCase()) + " ");
        }
        System.out.print(":(");
        //ArrayList<String> miss = new ArrayList<>();
        /*
        for (int i = 0; i < word.size(); i++)
        {
            if (alphabet[i] != word.get(i))
            {
                miss.add(alphabet[i]);
            }
        }
        for (int i = 0; i < miss.size(); i++)
        {
            System.out.print(miss.get(i));
            if (miss.size() - i != 1)
            {
                System.out.print(" ");
            }
        }
        */
    }
}