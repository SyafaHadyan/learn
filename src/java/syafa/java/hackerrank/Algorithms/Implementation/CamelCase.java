package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;

public class CamelCase
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String checkString = input.nextLine();
        input.close();
        int sentenceCount = 1;
        for (int i = 0; i < checkString.length(); i++)
        {
            if (Character.isUpperCase(checkString.charAt(i)))
            {
                sentenceCount++;
            }
        }
        System.out.print(sentenceCount);
    }
}