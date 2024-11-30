package syafa.java.leetcode;

import java.util.Arrays;

public class ValidAnagram
{
    class Solution
    {
        public boolean isAnagram(String s,String t)
        {
            char[] first = s.toCharArray();
            char[] second = t.toCharArray();
            Arrays.sort(first);
            Arrays.sort(second);
            return Arrays.equals(first,second);
        }
    }
}