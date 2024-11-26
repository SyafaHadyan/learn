package syafa.java.leetcode;
import java.util.HashSet;
import java.util.Set;

public class LongestCommonPrefix
{
    class Solution
    {
        public String longestCommonPrefix(String[] strs)
        {
            int index = 0;
            String result = "";
            while(true)
            {
                Set<String> prefixStore = new HashSet<>();
                try
                {
                    for (int i = 0; i < strs.length; i++)
                    {
                        prefixStore.add(strs[i].substring(0,index));
                    }
                }
                catch (IndexOutOfBoundsException e)
                {
                    break;
                }
                if (prefixStore.size() == 1)
                {
                    result = prefixStore.toString().replaceAll("[\\[\\]]","");
                }
                index++;
            }
            return result;
        }
    }
}