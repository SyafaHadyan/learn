import java.util.*;

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
            System.out.print("Password" + ":" + " ");
            String password = input.next();
            System.out.println("Logging in" + "...");
            if (username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin"))
            {
                System.out.println("Successfully logged in");
                System.out.println("\n" + "Welcome to Admin Center" + "\n");
                System.out.println("Select an option" + "\n" + "(0) Sell users' data" + "\n" + "(1) Log out");
                System.out.print("Enter" + ":" + " ");
                int select = input.nextInt();
                if (select == 0)
                {
                    System.out.println("\n" + "Loading users' data" + "...");
                    System.out.println("Never tell users that we're selling their data!");
                    System.out.println("Don't forget to promote Windows 11!");
                    System.out.println("...");
                    Random random = new Random();
                    int a = random.nextInt(10000);
                    int b = random.nextInt(100);
                    int users = a + b + 2;
                    System.out.println("Successfully sold" + " " + users + " " + "users' data");
                    System.out.println("Logging out" + "...");
                    repeat = false;
                }
                else if (select == 1)
                {
                    System.out.println("Logging out" + "...");
                    System.out.println("Successfully logged out");
                    repeat = false;
                }
            }
            else if (username.equalsIgnoreCase("admin"))
            {
                System.out.println("\n" + "Failed to log in");
                System.out.println("User did not exist, please enter a valid username" + "\n");
                repeat = true;
            }
            else
            {
                System.out.println("Successfully logged in");
                System.out.println("\n" + "\n" + "Welcome" + " " + username + "!");
                System.out.println("We never sell your data to any third party");
                System.out.println("\n" + "Select an option" + "\n" + "(0) Manage your personal information" + "\n" + "(1) Log out");
                System.out.print("Enter" + ":" + " ");
                int choose = input.nextInt();
                if (choose == 0)
                {
                    System.out.println("\n" + "Select an option" + "\n" + "(0) Delete your data" + "\n" + "(1) Log out");
                    System.out.print("Enter" + ":" + " ");
                    int usrchs = input.nextInt();
                    
                    if (usrchs == 0)
                    {
                        //Don't let users delete their data
                        System.out.println("\n" + "Our website is on high demand, please try again later" + "\n");
                        repeat = true;
                    }
                    else if (usrchs == 1)
                    {
                        System.out.println("\n" + "Logging out" + "...");
                        System.out.println("Sucessfully logged out");
                        repeat = false;
                    }
                }
                else if (choose == 1)
                {
                    System.out.println("Logging out" + "...");
                    System.out.println("Successfully logged out");
                    repeat = false;
                }
            }
        }   
        input.close();
    }
}