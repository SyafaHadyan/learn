package syafa.java.hackerrank.latsolpemdastif24;
import java.util.*;
import java.util.regex.*;

public class ApakahRiilPangram
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String[] word = input.nextLine().replaceAll("\\W+","").toLowerCase().split("");
        input.close();
        ArrayList<String> validAlphabetList = new ArrayList<>(Arrays.asList("abcdefghijklmnopqrstuvwxyz".split("")));
        ArrayList<String> missingAlphabet = new ArrayList<>();
        for (int i = 0; i < word.length; i++)
        {
            if (validAlphabetList.contains(word[i]))
            {
                continue;
            }
            missingAlphabet.add(validAlphabetList.get(i));
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