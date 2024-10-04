package syafa.java.hackerrank.Strings;
import java.util.*;

public class JavaStringTokens
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String regularString = input.nextLine();
        input.close();
        String splitRegularArray[] = regularString.split("[\\p{P} \\t\\n\\r]");
        ArrayList<String>arrayWithoutBlank = new ArrayList<String>();
        for (int i = 0; i < splitRegularArray.length; i++)
        {
            if (splitRegularArray[i].equalsIgnoreCase(""))
            {
                continue;
            }
            arrayWithoutBlank.add(splitRegularArray[i]);
        }
        System.out.println(arrayWithoutBlank.size());
        for (int i = 0; i < splitRegularArray.length; i++)
        {
            if (splitRegularArray[i].equalsIgnoreCase(""))
            {
                continue;
            }
            System.out.print(splitRegularArray[i]);
            if (i < splitRegularArray.length)
            {
                System.out.print("\n");
            }
        }
    }
}