package syafa.java.leetcode;
import java.util.*;

public class RomanToInteger
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        input.close();
        int result = 0;
        final Map<String,Integer> INTEGER_ROMAN = Map.ofEntries
        (
            Map.entry("I",1),
            Map.entry("V",5),
            Map.entry("X",10),
            Map.entry("L",50),
            Map.entry("C",100),
            Map.entry("D",500),
            Map.entry("M",1000)
        );
        for (int i = 0; i < s.length(); i++)
        {
            result += INTEGER_ROMAN.get(String.valueOf(s.charAt(i)));
        }
        System.out.println(result);
    }
}