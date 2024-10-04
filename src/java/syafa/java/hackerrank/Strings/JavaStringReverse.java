package syafa.java.hackerrank.Strings;
import java.util.*;

public class JavaStringReverse
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String initial = input.nextLine();
        input.close();
        String reversedInitial = "";
        String result = "No";
        char initialLengthArray[] = new char[initial.length()];
        for (int i = initial.length() - 1 ; i >= 0; i--)
        {
            initialLengthArray[i] = initial.charAt(i);
            reversedInitial += initialLengthArray[i];
        }
        if (initial.equalsIgnoreCase(reversedInitial))
        {
            result = "Yes";
        }
        System.out.print(result);
    }
}