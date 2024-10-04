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
        int arrayLength = splitRegularArray.length;
        for (int i = 0; i < splitRegularArray.length; i++)
        {
            if (splitRegularArray[i].equalsIgnoreCase(""))
            {
                arrayLength--;
                ArrayUtils.remove
            }
        }
        for (int i = 0; i < splitRegularArray.length; i++)
        {
            if (i == 0)
            {
                System.out.println(arrayLength - 1);
            }
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