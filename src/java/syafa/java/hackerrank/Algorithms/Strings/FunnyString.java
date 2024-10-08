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
        ArrayList<Integer> compareAscii = new ArrayList<Integer>();
        ArrayList<Integer> compareAsciiReversed = new ArrayList<Integer>();
        String checkString = "";
        for (int i = 0; i < queries; i++)
        {
            compareAscii.clear();
            compareAsciiReversed.clear();
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
                compareAscii.add(Math.abs(checkAscii.get(j + 1) - checkAscii.get(j)));
                compareAsciiReversed.add(Math.abs(checkAsciiReversed.get(j + 1) - checkAsciiReversed.get(j)));
            }
            if (compareAscii.equals(compareAsciiReversed))
            {
                checkFunny.add("Funny");
                compareAscii.clear();
                compareAsciiReversed.clear();
                continue;
            }
            checkFunny.add("Not funny");
            compareAscii.clear();
            compareAsciiReversed.clear();
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
        System.out.println(compareAscii);
        System.out.print(compareAsciiReversed);
    }
}