package syafa.java.hackerrank.ThirtyDaysOfCode;
import java.util.*;
import java.util.stream.*;

public class Day29BitwiseAND
{
    static class bitOperation
    {
        public static int maxBitwise(int[] config)
        {
            int max = 0;
            for (int i = 1; i <= config[0]; i++)
            {
                for (int j = 1 + i; j <= config[0]; j++)
                {
                    if ((max < (i & j)) && (config[1] > (i & j)))
                    {
                        max = (i & j);
                        if (config[1] - max == 1)
                        {
                            return max;
                        }
                    }
                }
            }
            return max;
        }
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int testCase = Integer.parseInt(input.nextLine());
        int[] result = new int[testCase];
        for (int i = 0; i < testCase; i++)
        {
            result[i] = bitOperation.maxBitwise(Stream.of(input.nextLine().split("\s")).mapToInt(Integer::parseInt).toArray());
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