package syafa.java.hackerrank.ThirtyDaysOfCode;
import java.util.*;

public class Day6
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int testCase = Integer.parseInt(input.nextLine());
        String stringArray[] = new String[testCase];
        for (int i = 0; i < stringArray.length; i++)
        {
            String str = input.nextLine();
            stringArray[i] = str;
        }
        input.close();
        if (stringArray.length % 2 == 0)
        {
            System.out.println("even");
        }
        else
        {
            System.out.println("odd");
        }
        System.out.println(stringArray.length);
    }
}