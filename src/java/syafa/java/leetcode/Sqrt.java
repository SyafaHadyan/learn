package syafa.java.leetcode;

public class Sqrt
{
    class Solution
    {
        public int mySqrt(int x)
        {
            for (long i = 1; i <= (long) x; i++)
            {
                if (i * i == x)
                {
                    return (int) i;
                }
                if (i * i > x)
                {
                    return (int) (i - 1);
                }
            }
            return 0;
        }
    }
}