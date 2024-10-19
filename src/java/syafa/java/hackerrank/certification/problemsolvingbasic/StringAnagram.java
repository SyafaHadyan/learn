package syafa.java.hackerrank.certification.problemsolvingbasic;
import java.util.*;

public class StringAnagram
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int dictionarySize = Integer.parseInt(input.nextLine());
        String[] dictonary = new String[dictionarySize];
        for (int i = 0; i < dictionarySize; i++)
        {
            String tempString = input.nextLine();
            char[] tempChar = tempString.toCharArray();
            Arrays.sort(tempChar);
            dictonary[i] = new String(tempChar);
        }
        input.close();
    }
}