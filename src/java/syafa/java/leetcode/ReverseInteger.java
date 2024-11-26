package syafa.java.leetcode;

public class ReverseInteger
{
    class Solution
    {
        public int reverse(int x)
        {
            StringBuilder reversed = new StringBuilder();
            String result = "";
            if (x < 0)
            {
                x = Math.abs(x);
                StringBuilder negative = new StringBuilder("-");
                StringBuilder numberNegative = new StringBuilder(String.valueOf(x));
                numberNegative.reverse();
                negative.append(numberNegative);
                result = negative.toString();
            }
            else
            {
                reversed.append(String.valueOf(x));
                reversed.reverse();
                result = reversed.toString();
            }
            try
            {
                Integer.parseInt(result);
            }
            catch (NumberFormatException e)
            {
                return 0;
            }
            return Integer.parseInt(result);
        }
    }
}