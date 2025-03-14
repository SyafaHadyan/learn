package syafa.java.leetcode;

public class PowerOfTwo
{
    class Solution
    {
        public boolean isPowerOfTwo(int n)
        {
            if (n == 1)
            {
                return true;
            }
            if (n % 2 != 0)
            {
                return false;
            }
            while (n != 0 && n % 2 == 0)
            {
                n /= 2;
                if (n == 1)
                {
                    return true;
                }
            }
            return false;
        }
    }
}