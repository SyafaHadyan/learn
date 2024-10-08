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
        String checkString = "";
        for (int i = 0; i < queries; i++)
        {
            checkString = input.nextLine();
            checkAscii.add((int) checkString.charAt(i));
            for (int j = checkString.length() - 1; j >= 0; j--)
            {
                
            }
        }
        input.close();
    }
}