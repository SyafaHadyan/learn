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
        StringBuilder checkString = new StringBuilder();
        for (int i = 0; i < queries; i++)
        {
            compareAscii.clear();
            compareAsciiReversed.clear();
            checkString.append(input.nextLine());
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
            System.out.println(compareAscii + "\n" + compareAsciiReversed);
            if (compareAscii.equals(compareAsciiReversed))
            {
                checkFunny.add("Funny");
            }
            else
            {
                checkFunny.add("Not funny");
            }
            checkAscii.clear();
            checkAsciiReversed.clear();
            compareAscii.clear();
            compareAsciiReversed.clear();
            checkString.delete(0,checkString.length());
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
    }
}