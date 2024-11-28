package syafa.java.leetcode;

public class ValidPalindrome
{
    class Solution
    {
        public boolean isPalindrome(String s)
        {
            return String.valueOf(new StringBuilder(s.replaceAll("[(\\W+)(_)]","")).reverse()).equalsIgnoreCase(s.replaceAll("[(\\W+)(_)]",""));
        }
    }
}