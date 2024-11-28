package syafa.java.leetcode;
import java.util.HashMap;

public class ContainsDuplicate
{
    class Solution
    {
        public boolean containsDuplicate(int[] nums)
        {
            HashMap<Integer,Boolean> registeredNumbers = new HashMap<>();
            for (int i = 0; i < nums.length; i++)
            {
                if (!(registeredNumbers.containsKey(nums[i])))
                {
                    registeredNumbers.put(nums[i],true);
                    continue;
                }
                return true;
            }
            return false;
        }
    }
}