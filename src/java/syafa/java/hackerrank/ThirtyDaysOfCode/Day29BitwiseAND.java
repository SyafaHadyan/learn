package syafa.java.hackerrank.ThirtyDaysOfCode;
import java.util.*;
import java.util.stream.*;

public class Day29BitwiseAND
{
    static class bitOperation
    {
        public static int maxBitwise(int[] bitwise)
        {
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