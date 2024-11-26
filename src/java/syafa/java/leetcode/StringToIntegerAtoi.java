package syafa.java.leetcode;

public class StringToIntegerAtoi
{
    class Solution
    {
        public int myAtoi(String s)
        {
            s = s.replaceAll("^\\s+","");
            String[] inputString = s.split("");
            String digitString = "";
            int i = 0;
            int digitPositive = 1;
            if (inputString[0].equals("-"))
            {
                digitPositive = -1;
                i++;
            }
            else if (inputString[0].equals("+"))
            {
                i++;
            }
            for (; i < inputString.length; i++)
            {
                try
                {
                    Integer.parseInt(inputString[i]);
                    digitString = digitString.concat(inputString[i]);
                }
                catch (NumberFormatException e)
                {
                    break;
                }
            }
            try
            {
                return Integer.parseInt(digitString) * digitPositive;
            }
            catch (NumberFormatException e)
            {
                if (digitString.isEmpty())
                {
                    return 0;
                }
                if (digitPositive == 1)
                {
                    return 2147483647;
                }
                return -2147483648;
            }
        }
    }
}