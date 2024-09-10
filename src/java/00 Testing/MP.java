import java.util.*;
import java.util.concurrent.*;
import java.io.*;
import java.lang.*;

public class MP 
{
    public static void main(String[] args)
    {
        boolean repeat = true;
        Scanner input = new Scanner(System.in);

        while (repeat)
        {
            System.out.print("Welcome to Microsoft Privacy Center" + "\n" + "Please log in to your account");
            System.out.print("\n" + "Username" + ":" + " ");
            String username = input.next();
            System.out.println("\n" + "Password" + ":" + " ");
            String password = input.next();
            TimeUnit.SECONDS.sleep(3);
            System.out.println("Logging in");
            TimeUnit.SECONDS.sleep(3);
            System.out.println("We never sell your user data");
            TimeUnit.SECONDS.sleep(3);
            
            if (username == "admin" && password == "admin")
            {
                System.out.println("\n" + "Successfully logged in");
                System.out.println("\n" + "Welcome to Admin Center" + "\n" + "(0) Sell users' data");
                System.out.print("Enter" + ":" + " ");
                String select = input.next();
                if (select == "0")
                {
                    System.out.println("\n" + "Loading users' data" + "...");
                    TimeUnit.SECONDS.sleep(3);
                    System.out.println("Never tell users that we're selling their data!");
                    TimeUnit.SECONDS.sleep(3);
                    System.out.println("Don't forget to promote Windows 11!");
                    TimeUnit.SECONDS.sleep(3);
                    System.out.println("...");
                    TimeUnit.SECONDS.sleep(3);
                    System.out.println("Successfully sold" + " " + ThreadLocalRandom.current().nextInt(1000, 5000) + " " + "users' data");
                    TimeUnit.SECONDS.sleep(3);
                    System.out.println("Logging out" + "...");
                    repeat = false;
                }
            }
            else if (username.equalsIgnoreCase("admin"))
            {
                System.out.println("\n" + "Failed to log in");
                System.out.println("User did not exist, please enter a valid username");
                repeat = true;
            }
            else
            {
                System.out.println("\n" + "Successfully logged in");
                System.out.println("\n" + "Welcome" + username + "!");
                System.out.println("We never sell your data to any third party");
                System.out.println("Please choose an option" + "\n" + "(0) View your personal information" + "\n" + "(1) Log out");
                System.out.print("Enter" + ":" + " ");
                String choose = input.next();
                if (choose == "0")
                {
                    String usrchs = input.next();
                    System.out.println("Select an option" + "\n" + "(0) Delete your data" + "");
                    System.out.print("Enter" + ":" + " ");
                    
                    if (usrchs == "0")
                    {
                        //Don't let users delete their data
                        System.out.println("\n" + "Our website is on high demand, please try again");
                        repeat = true;
                    }
                    else if (usrchs == "1")
                    {
                        System.out.println("\n" + "Logging out" + "...");
                        TimeUnit.SECONDS.sleep(3);
                        System.out.println("Sucessfully logged out");
                        repeat = false;
                    }
                }
                else if (choose == "1")
                {
                    System.out.println("Logging out" + "...");
                    Thread.sleep(5000);
                    System.out.println("Successfully logged out");
                    repeat = false;
                }
            }
        }   
        input.close();
    }
}