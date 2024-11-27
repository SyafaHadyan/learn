package syafa.java.neetcode.ArraysAndHashing;
import java.util.HashMap;

public class ValidAnagram
{
    class Solution
    {
        public boolean isAnagram(String s,String t)
        {
            HashMap<Character,Integer> first = new HashMap<>();
            HashMap<Character,Integer> second = new HashMap<>();
            for (int i = 0; i < Math.max(s.length(),t.length()); i++)
            {
                try
                {
                    first.putIfAbsent(s.charAt(i),0);
                    second.putIfAbsent(t.charAt(i),0);
                    first.merge(s.charAt(i),1,Integer::sum);
                    second.merge(t.charAt(i),1,Integer::sum);
                }
                catch (StringIndexOutOfBoundsException e)
                {
                    return false;
                }
            }
            return first.equals(second);
        }
    }
}