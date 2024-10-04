package syafa.java.hackerrank.Strings;
import java.util.*;

public class JavaAnagrams
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String first = input.nextLine();
        String second = input.nextLine();
        input.close();
        String anagrams = "Not Anagrams";
        ArrayList<Character>firstStringLength = new ArrayList<Character>();
        ArrayList<Character>secondStringLength = new ArrayList<Character>();
        first = first.toLowerCase();
        second = second.toLowerCase();
        for (int i = 0; i < first.length(); i++)
        {
            firstStringLength.add(first.charAt(i));
            secondStringLength.add(second.charAt(i));
        }
        Collections.sort(firstStringLength);
        Collections.sort(secondStringLength);
        first = "";
        second = "";
        for (int i = 0; i < firstStringLength.size(); i++)
        {
            first += firstStringLength.get(i);
            second += secondStringLength.get(i);
        }
        if (first.equalsIgnoreCase(second))
        {
            anagrams = "Anagrams";
        }
        System.out.println(first + "\n" + second);
        System.out.print(anagrams);
    }
}