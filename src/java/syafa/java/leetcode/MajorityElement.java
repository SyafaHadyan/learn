package syafa.java.leetcode;
import java.util.HashMap;

public class MajorityElement
{
    class Solution
    {
        public int majorityElement(int[] nums)
        {
            HashMap<Integer,Integer> registeredNumbers = new HashMap<>();
            for (int i = 0; i < nums.length; i++)
            {
                registeredNumbers.merge(nums[i],1,Integer::sum);
            }
            for (int i : registeredNumbers.keySet())
            {
                if (registeredNumbers.get(i) > (nums.length / 2))
                {
                    return i;
                }
            }
            return 0;
        }
    }
}