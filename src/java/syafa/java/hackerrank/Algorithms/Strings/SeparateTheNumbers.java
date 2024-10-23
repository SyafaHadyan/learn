package syafa.java.hackerrank.Algorithms.Strings;
import java.util.*;
import java.util.stream.*;

public class SeparateTheNumbers
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int testCase = Integer.parseInt(input.nextLine());
        String numberStr = input.nextLine();
        String[] validity = new String[testCase];
        for (int i = 0; i < testCase; i++)
        {
            for (int j = 0; j < numberStr.length(); j++)
            {
                try
                {
                    if (Integer.parseInt(String.valueOf(numberStr.charAt(j + 1))) - Integer.parseInt(String.valueOf(numberStr.charAt(j))) == 1)
                    {
                        System.out.println("True");
                    }
                }
                catch (IndexOutOfBoundsException e)
                {
                    //
                }
            }
        }
        input.close();
        System.out.println();
    }
}