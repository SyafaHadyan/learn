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
        int evenModulo = stringArray.length % 2;
        int oddModulo = stringArray.length % 3;
    }
}