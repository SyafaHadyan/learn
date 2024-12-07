package syafa.java.hackerrank.Algorithms.Strings;
import java.util.*;

public class HackerRankInAString
{
    static final String[] STRING_ARRAY = "HACKERRANK".split("");
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int testCase = Integer.parseInt(input.nextLine());
        boolean[] containString = new boolean[testCase];
        for (int i = 0; i < testCase; i++)
        {
            String[] tempInput = input.nextLine().split("");
            long currentCounter = 0;
            for (int j = 0, counter = 0; j < tempInput.length; j++)
            {
                if (tempInput[j].equalsIgnoreCase(STRING_ARRAY[counter]))
                {
                    counter++;
                    currentCounter++;
                }
                if (currentCounter == STRING_ARRAY.length)
                {
                    containString[i] = true;
                    break;
                }
            }
        }
        input.close();
        for (int i = 0; i < containString.length; i++)
        {
            if (containString[i])
            {
                System.out.println("YES");
                continue;
            }
            System.out.println("NO");
        }
    }
}