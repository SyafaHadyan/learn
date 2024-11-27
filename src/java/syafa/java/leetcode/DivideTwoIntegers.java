package syafa.java.leetcode;

public class DivideTwoIntegers
{
    class Solution
    {
        public int divide(int dividend,int divisor)
        {
            System.err.println((-1 / -2));
            int result = dividend / divisor;
            if (dividend <= 0 && divisor <= 0)
            {
                try
                {
                    result = Integer.parseInt(String.valueOf(result).replaceAll("-",""));
                }
                catch (NumberFormatException e)
                {
                    return Integer.MAX_VALUE;
                }
            }
            if (result == Integer.MAX_VALUE)
            {
                return Integer.MAX_VALUE;
            }
            else if (result == Integer.MIN_VALUE)
            {
                return Integer.MIN_VALUE;
            }
            return result;
        }
    }
}