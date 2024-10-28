package syafa.java.hackerrank.Algorithms.Debugging;
import java.util.*;

public class SmartNumber
{
    public static boolean isSmartNumber(int num)
    {
        int val = (int) Math.sqrt(num);    
        if (val * val == num)
        {
            return true;
        }
        return false;
    }

    public static void main(String[] args)
    {
        int testCase;
        Scanner input = new Scanner(System.in);
        testCase = input.nextInt();
        int num;
        String[] result = new String[testCase];
        for(int i = 0; i < testCase; i++)
        {
            num = Integer.parseInt(input.nextLine());
            if (isSmartNumber(num))
            {
                result[i] = "YES";
                continue;
            }
            result[i] = "NO";
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