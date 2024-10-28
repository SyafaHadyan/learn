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
        int test_cases;
        Scanner in = new Scanner(System.in);
        test_cases = in.nextInt();
        int num;
        for(int i = 0; i < test_cases; i++)
        {
            num = in.nextInt();
            if (isSmartNumber(num))
            {
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
        in.close();
    }
}