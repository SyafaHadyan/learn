package syafa.java.leetcode;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.stream.Stream;

public class PlusOne
{
    class Solution
    {
        public int[] plusOne(int[] digits)
        {
            return Stream.of(String.valueOf(new BigInteger(Arrays.toString(digits).replaceAll("[(\\[)(, )(\\])]","")).add(BigInteger.ONE)).split("")).mapToInt(Integer::parseInt).toArray();
        }
    }
}