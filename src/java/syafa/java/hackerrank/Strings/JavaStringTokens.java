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
    }
}