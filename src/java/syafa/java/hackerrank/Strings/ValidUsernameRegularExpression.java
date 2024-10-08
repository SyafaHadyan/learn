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
            username = input.nextLine();
            if (username.length() < 8)
            {
                usernameArray.add("Invalid");
                continue;
            }
            else if (username.contains("?"))
            {
                usernameArray.add("Invalid");
                continue;
            }
            else if (!(username.matches("^[^\\W_\\d][\\w]{7,29}$")))
            {
                usernameArray.add("Invalid");
                continue;
            }
            usernameArray.add("Valid");
        }
        input.close();
        for (int i = 0; i < usernameArray.size(); i++)
        {
            System.out.print(usernameArray.get(i));
            if (i < usernameArray.size())
            {
                System.out.print("\n");
            }
        }
    }
}