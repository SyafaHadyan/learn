package syafa.java.hackerrank.Algorithms.Strings;
import java.util.*;

public class Pangrams
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        //char[] word = input.nextLine().toCharArray();
        ArrayList<String> word = new ArrayList<>(Arrays.asList(input.nextLine().split("")));
        Collections.sort(word);
        input.close();
        for (int i = 0; i < word.size(); i++)
        {
            if (word.get(i) == word.get(i + 1))
            {
                //
            }
        }
    }
}