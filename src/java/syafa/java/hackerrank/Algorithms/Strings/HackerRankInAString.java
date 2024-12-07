package syafa.java.hackerrank.Algorithms.Strings;
import java.util.*;

public class HackerRankInAString
{
    static final char[] STRING_ARRAY = "HACKERRANK".toCharArray();
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int testCase = Integer.parseInt(input.nextLine());
        boolean[] containString = new boolean[testCase];
        for (int i = 0; i < testCase; i++)
        {
            char[] tempInput = input.nextLine().toCharArray();
            for (int j = 0, counter = 0; j < tempInput.length; j++)
            {
                if (tempInput[i] == STRING_ARRAY[counter])
                {
                    counter++;
                }
            }
        }
        input.close();
    }
}