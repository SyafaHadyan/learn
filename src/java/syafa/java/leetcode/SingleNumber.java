package syafa.java.leetcode;
import java.util.HashMap;

public class SingleNumber
{
    class Solution
    {
        public int singleNumber(int[] nums)
        {
            HashMap<Integer,Integer> registeredNumber = new HashMap<>();
            for (int i = 0; i < nums.length; i++)
            {
                registeredNumber.merge(nums[i],1,Integer::sum);
            }
            for (int i : registeredNumber.keySet())
            {
                if (registeredNumber.get(i) == 1)
                {
                    return i;
                }
            }
            return 0;
        }
    }
}