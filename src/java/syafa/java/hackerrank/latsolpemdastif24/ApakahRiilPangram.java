package syafa.java.hackerrank.latsolpemdastif24;
import java.util.*;
import java.util.regex.*;

public class ApakahRiilPangram
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String[] word = input.nextLine().replaceAll("\\W+","").toLowerCase().split("-");
        input.close();
        ArrayList<String> validAlphabetList = new ArrayList<>(Arrays.asList("abcdefghijklmnopqrstuvwxyz".split("")));
        boolean isPerfectPangram = true;
        Arrays.sort(word);
        int counter = 0;
        for (int i = 0; i < word.length; i++)
        {
            if (word[i].equalsIgnoreCase(validAlphabetList.get(counter)))
            {
                validAlphabetList.remove(counter);
            }
            counter++;
        }
        System.out.print(Arrays.toString(word));
    }
}