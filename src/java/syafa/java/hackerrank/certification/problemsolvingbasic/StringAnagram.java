package syafa.java.hackerrank.certification.problemsolvingbasic;
import java.util.*;

public class StringAnagram
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String[] dictonary = new String[Integer.parseInt(input.nextLine())];
        for (int i = 0; i < dictonary.length; i++)
        {
            String tempString = input.nextLine();
            char[] tempChar = tempString.toCharArray();
            Arrays.sort(tempChar);
            dictonary[i] = new String(tempChar);
        }
        int[] match = new int[Integer.parseInt(input.nextLine())];
        input.close();
    }
}