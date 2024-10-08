package syafa.java.hackerrank.Algorithms.Strings;
import java.util.*;

public class FunnyString
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int queries = Integer.parseInt(input.nextLine());
        ArrayList<String> checkFunny = new ArrayList<String>();
        String checkString = "";
        for (int i = 0; i < queries; i++)
        {
            checkString = input.nextLine();
            for (int j = checkString.length() - 1; j >= 0; j--)
            {
                System.out.println(checkString.charAt(j));
            }
        }
        input.close();
    }
}