package syafa.java.leetcode;

public class ContainsDuplicateTwo
{
    class Solution
    {
        public boolean containsNearbyDuplicate(int[] nums,int k)
        {
            for (int i = 0; i < nums.length; i++)
            {
                for (int j = 1 + i; j < nums.length && (Math.abs(i - j) <= k); j++)
                {
                    if (nums[i] == nums[j] && Math.abs(i - j) <= k)
                    {
                        return true;
                    }
                }
            }
            return false;
        }
    }
}