package syafa.java.hackerrank.Strings;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternSyntaxChecker
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int numberOfInput = Integer.parseInt(input.nextLine());
        ArrayList<String> validArray = new ArrayList<String>();
        String check;
        for (int i = 0; i < numberOfInput; i++)
        {
            check = input.nextLine();
            try 
            {
                Pattern.compile(check);
                validArray.add("Valid");
            }
            catch (PatternSyntaxException e)
            {
                validArray.add("Invalid");
            }
        }
        input.close();
        for (int i = 0; i < validArray.size(); i++)
        {
            System.out.print(validArray.get(i));
            if (i < validArray.size())
            {
                System.out.print("\n");
            }
        }
    }
}