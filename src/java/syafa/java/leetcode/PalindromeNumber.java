package syafa.java.leetcode;

public class PalindromeNumber
{
    class Solution
    {
        public boolean isPalindrome(int x)
        {
            return new StringBuilder(String.valueOf(x)).toString().equalsIgnoreCase(new StringBuilder(String.valueOf(x)).reverse().toString());
        }
    }
}