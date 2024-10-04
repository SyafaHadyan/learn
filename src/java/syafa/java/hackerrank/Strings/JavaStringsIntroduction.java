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
        char compareFirstChar[] = new char[2];
        int sumLength = firstString.length() +  secondString.length();
        String lexic = "Yes";
        compareFirstChar[0] = firstString.charAt(0);
        compareFirstChar[1] = secondString.charAt(0);
        Arrays.sort(compareFirstChar);
        if (compareFirstChar[0] == firstString.charAt(0))
        {
            lexic = "No";
        }
        firstString = firstString.replace(firstString.charAt(0), Character.toUpperCase(firstString.charAt(0)));
        secondString = secondString.replace(secondString.charAt(0), Character.toUpperCase(secondString.charAt(0)));
        System.out.print(sumLength + "\n" + lexic + "\n" + firstString + ' ' + secondString);
    }
}