import java.util.*;
import java.util.concurrent.TimeUnit;

public class MP 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to Microsoft Privacy Center" + "\n" + "Please log in to your account");
        System.out.print("\n" + "Username" + ":" + " ");
        String username = input.next();
        System.out.println("\n" + "Password" + ":" + " ");
        String password = input.next();
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Logging in");
        TimeUnit.SECONDS.sleep(5);
        System.out.println("We never sell your user data");
        TimeUnit.SECONDS.sleep(2);
        
        if (username == "admin" && password == "admin");
        {
            System.out.println("\n" + "Successfully logged in");
            System.out.println("\n" + "Welcome to Admin Center" + "\n" + "(0) Sell users' data");
            String select = input.next();
            if (select == "0")
            {
                
            }
        }
        else if (username.equalsIgnoreCase("admin"))
        {
            System.out.println("\n" + "Failed to log in");
            System.out.println("User did not exist, please enter a valid username");
        }
        else
        {
            System.out.println("\n" + "Successfully logged in");
            System.out.println("\n" + "Welcome" + username + "!")

        }
        input.close();
    }
}
