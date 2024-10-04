package syafa.java.hackerrank.Strings;
import java.util.*;

public class JavaStringsIntroduction
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String firstString = input.nextLine();
        String secondString = input.nextLine();
        input.close();
        int sumLength = firstString.length() +  secondString.length();
        int firstCharInt = 0;
        int secondCharInt = 0;
        switch (firstString.charAt(0))
        {
            case 'a':
                firstCharInt = 1;
                break;
            case 'b':
                firstCharInt = 2;
                break;
            default:
                break;
        }
    }
}