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
            int[] bitwise = IntStream.range(1,config[0] + 1).toArray();
            for (int i = 0; i < bitwise.length; i++)
            {
                for (int j = 1 + i; j < bitwise.length - i; j++)
                {
                    if ((max < (bitwise[i] & bitwise[j])) && (config[1] > (bitwise[i] & bitwise[j])))
                    {
                        max = (bitwise[i] & bitwise[j]);
                        if (config[1] - max == 1)
                        {
                            return max;
                        }
                    }
                }
            }
            return 0;
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
    }
}