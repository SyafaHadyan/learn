package syafa.java.leetcode;

public class LengthOfLastWord
{
    class Solution
    {
        public int lengthOfLastWord(String s)
        {
            String[] result = s.split("\\s+");
            return result[result.length - 1].length();
        }
    }
}