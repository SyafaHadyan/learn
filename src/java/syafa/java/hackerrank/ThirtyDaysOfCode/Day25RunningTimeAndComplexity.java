package syafa.java.hackerrank.ThirtyDaysOfCode;
import java.util.*;

public class Day25RunningTimeAndComplexity
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        ArrayList<String> result = new ArrayList<>();
        int testCase = Integer.parseInt(input.nextLine());
        int numberCheck = 0;
        for (int i = 0; i < testCase; i++)
        {
            numberCheck = Integer.parseInt(input.nextLine());
            for (int j = 2; j < args.length; j++)
            {
                if (numberCheck % j != 0)
                {
                    continue;
                }
                result.add("Not prime");
                break;
            }
        }
        input.close();
    }
}