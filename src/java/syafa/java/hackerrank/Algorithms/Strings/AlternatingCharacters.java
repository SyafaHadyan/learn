package syafa.java.hackerrank.Algorithms.Strings;
import java.util.*;

public class AlternatingCharacters
{
    public static void main(String[] args)
    {
        /*
         * 5
         * AAAA
         * BBBBB
         * ABABABAB
         * BABABA
         * AAABBB
         * 
         * 3
         * 4
         * 0
         * 0
         * 4
         */
        Scanner input = new Scanner(System.in);
        int testCase = Integer.parseInt(input.nextLine());
        int[] result = new int[testCase];
        for (int i = 0; i < testCase; i++)
        {
            int counter = 0;
            char[] word = input.nextLine().toCharArray();
            for (int j = 0; j < word.length; j++)
            {
                try
                {
                    if (word[j] == word[j + 1])
                    {
                        counter++;
                    }
                }
                catch (IndexOutOfBoundsException e)
                {
                    result[i] = counter;
                }
            }
        }
        input.close();
        for (int i = 0; i < result.length; i++)
        {
            System.out.print(result[i]);
            if (result.length - i != 1)
            {
                System.out.print("\n");
            }
        }
    }
}