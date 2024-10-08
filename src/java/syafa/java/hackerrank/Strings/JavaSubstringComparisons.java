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
        string.toLowerCase();
        ArrayList<String>splitAt = new ArrayList<String>();
        for (int i = 0; i <= string.length(); i++)
        {
            splitAt.add(string.substring(i,Math.min(string.length(),i + split)));
        }
        Collections.sort(splitAt);
        System.out.print(splitAt.getFirst() + "\n" + splitAt.getLast());
        System.out.print("\n");
        for (int i = 0; i < splitAt.size(); i++)
        {
            System.out.print(splitAt.get(i));
            if (i < splitAt.size())
            {
                System.out.print(' ');
            }
        }
    }
}