package syafa.java.leetcode;

public class FindTheIndexOfTheFirstOccurrenceInAString
{
    class Solution
    {
        public int strStr(String haystack,String needle)
        {
            if (haystack.equalsIgnoreCase(needle))
            {
                return 0;
            }
            for (int i = 0; i <= haystack.length() - needle.length(); i++)
            {
                if (haystack.substring(i,needle.length() + i).equalsIgnoreCase(needle))
                {
                    return i;
                }
            }
            return -1;
        }
    }
}