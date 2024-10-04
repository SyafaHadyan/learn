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
        for (int i = 0; i < splitRegularArray.length; i++)
        {
            if (i == 1)
            {
                System.out.println(splitRegularArray.length - 1);
            }
            System.out.print(splitRegularArray[i]);
            if (i < splitRegularArray.length)
            {
                System.out.print("\n");
            }
        }
    }
}