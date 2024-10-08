package syafa.java.hackerrank.Algorithms.Strings;
import java.util.*;

public class FunnyString
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int queries = Integer.parseInt(input.nextLine());
        ArrayList<Integer> checkAscii = new ArrayList<Integer>();
        ArrayList<Integer> checkAsciiReversed = new ArrayList<Integer>();
        ArrayList<String> checkFunny = new ArrayList<String>();
        String checkString = "";
        for (int i = 0; i < queries; i++)
        {
            checkString = input.nextLine();
            for (int j = 0; j < checkString.length(); j++)
            {
                checkAscii.add((int) checkString.charAt(j));
            }
            for (int j = checkString.length() - 1; j >= 0; j--)
            {
                checkAsciiReversed.add((int) checkString.charAt(j));
            }
            for (int j = 0; j < checkString.length() - 1; j++)
            {
                
            }
            if (checkAscii.equals(checkAsciiReversed))
            {
                checkFunny.add("Funny");
                continue;
            }
            checkFunny.add("Not funny");
        }
        input.close();
        for (int i = 0; i < checkFunny.size(); i++)
        {
            System.out.print(checkFunny.get(i));
            if (i < checkFunny.size())
            {
                System.out.print("\n");
            }
        }
        System.out.println(checkAscii);
        System.out.print(checkAsciiReversed);
    }
}