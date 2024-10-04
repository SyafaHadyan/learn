package syafa.java.hackerrank.Strings;
import java.util.*;

public class JavaSubstringComparisons
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String string = input.nextLine();
        int split = Integer.parseInt(input.nextLine());
        input.close();
        ArrayList<Character>splitAt = new ArrayList<Character>();
        for (int i = 0; i < args.length; i++)
        {
            splitAt.add(string.charAt(i));
        }
    }
}