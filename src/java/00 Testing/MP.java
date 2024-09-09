import java.util.*;
import java.util.concurrent.TimeUnit;

public class MP 
{
    public static void main(String[] args)
    {
        Scanner login = new Scanner(System.in);
        System.out.print("Welcome to Microsoft Privacy Center" + "\n" + "Please log in to your account");
        System.out.print("\n" + "Username" + ":" + " ");
        String username = login.next();
        System.out.println("\n" + "Password" + ":" + " ");
        String password = login.next();
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Logging in");
        TimeUnit.SECONDS.sleep(5);
        System.out.println("We never sell your user data");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Successfully logged in");
        
        if (username == "admin" && password == "admin");
        {
            System.out.println("\n" + "Welcome to Admin Center" + "\n" + "(0) View user data" + "\n" + );
        }
        else
        {
            System.out.println("\n" + "Welcome" + username + "!")
        }
        login.close();
    }
}
