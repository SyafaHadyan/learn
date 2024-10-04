package syafa.java.hackerrank.Strings;
import java.util.*;

public class ValidUsernameRegularExpression
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int amountOfUsername = Integer.parseInt(input.nextLine());
        String username = "";
        ArrayList<String> usernameArray = new ArrayList<String>();
        for (int i = 0; i < amountOfUsername; i++)
        {
            usernameArray.add(input.nextLine());
        }
    }
}