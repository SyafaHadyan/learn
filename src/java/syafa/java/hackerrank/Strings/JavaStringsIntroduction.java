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
        compareFirstChar[0] = firstString.charAt(0);
        compareFirstChar[1] = secondString.charAt(0);
        Arrays.sort(compareFirstChar);
        for (int i = 0; i < 2; i++)
        {
            System.out.println(compareFirstChar[i]);
        }
    }
}