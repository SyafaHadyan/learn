package syafa.java.hackerrank.latsolpemdastif24;
import java.lang.reflect.Array;
import java.util.*;
import java.util.regex.*;

public class ApakahRiilPangram
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String[] word = input.nextLine().replaceAll("[\\W+\\d+]","").toLowerCase().split("");
        input.close();
        Arrays.sort(word);
        ArrayList<String> inputWord = new ArrayList<>(Arrays.asList(word));
        ArrayList<String> validAlphabetList = new ArrayList<>(Arrays.asList("abcdefghijklmnopqrstuvwxyz".split("")));
        ArrayList<String> missingAlphabet = new ArrayList<>();
        for (int i = 0; i < inputWord.size(); i++)
        {
            if (validAlphabetList.contains(inputWord.get(i)))
            {
                continue;
            }
            //if (!(missingAlphabet.contains(inputWord.get(i))))
            {
                missingAlphabet.add(inputWord.get(i));
            }
        }
        System.out.println(validAlphabetList);
        System.out.println(missingAlphabet);
        System.out.println(Arrays.toString(word));
        if (word.length > 26 && missingAlphabet.isEmpty())
        {
            System.out.print("Input hanya pangram biasa saja ");
            System.exit(0);
        }
        if (missingAlphabet.isEmpty())
        {
            System.out.print("Input merupakan pangram sempurna! :D");
            System.exit(0);
        }
    }
}