package syafa.java.leetcode;

public class AddDigits
{
    class Solution
    {
        public int addDigits(int num)
        {
            while (num >= 10)
            {
                String numberString = String.valueOf(num);
                num = 0;
                for (int i = 0; i < numberString.length(); i++)
                {
                    num += Integer.parseInt(String.valueOf(numberString.charAt(i)));
                }
            }
            return num;
        }
    }
}