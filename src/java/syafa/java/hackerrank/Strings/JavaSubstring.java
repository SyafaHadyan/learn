package syafa.java.hackerrank.Strings;
import java.util.*;

public class JavaSubstring
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String singleString = input.nextLine();
        int start = input.nextInt();
        int end = input.nextInt();
        input.close();
        String output = "";
        for (int i = start; i < end; i++)
        {
            output += singleString.charAt(i);
        }
        System.out.print(output);
    }
}