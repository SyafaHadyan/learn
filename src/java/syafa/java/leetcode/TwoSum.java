package syafa.java.leetcode;

public class TwoSum
{
    class Solution
    {
        public int[] twoSum(int[] nums, int target)
        {
            for (int i = 0; i < nums.length; i++)
            {
                for (int j = 1 + i; j < nums.length; j++)
                {
                    if (nums[i] + nums[j] == target)
                    {
                        return new int[]{i,j};
                    }
                }
            }
            return new int[]{0,0};
        }
    }
}