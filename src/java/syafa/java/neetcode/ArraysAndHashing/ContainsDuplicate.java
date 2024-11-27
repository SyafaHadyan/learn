package syafa.java.neetcode.ArraysAndHashing;
import java.util.HashMap;

public class ContainsDuplicate
{
    class Solution
    {
        public boolean hasDuplicate(int[] nums)
        {
            HashMap<Integer,Boolean> registeredNumbers = new HashMap<>();
            for (int i = 0; i < nums.length; i++)
            {
                if (registeredNumbers.get(nums[i]) == null)
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