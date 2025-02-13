import java.util.*;

public class CCNumber
{
    public static void main(String[] args)
    {
        String fullname = "Name";
        int ccnum0 = 4209;
        int ccnum1 = 3489;
        int ccnum2 = 9353;
        int ccnum3 = 8239;
        int cvc = 894;
        System.out.println();
        System.out.printf("%10s","Full Name");
        System.out.println(" " + "|" + " " + fullname);
        System.out.printf("%10s","CC ");
        System.out.println(" " + "|" + " " + ccnum0 + " " +  ccnum1 + " " +  ccnum2 + " " +  ccnum3);
        System.out.printf("%10s","CVC");
        System.out.println(" " + "|" + " " + cvc);
        Scanner input = new Scanner(System.in);
        System.out.println("\n" + "Sell user data" + "?" + "\n" + "(Yes) Sell" + "\n" + "(No) Sell to 3rd party");
        System.out.print("Enter" + ":" + " ");
        String selluserdata = input.next();
        if (selluserdata.equalsIgnoreCase("Y") || selluserdata.equalsIgnoreCase("YES"))
        {
            System.out.print("\n" + "Data has been sold");
        }
        else
        {
            System.out.print("\n" + "Data has been sold to 3rd party");
        }
        input.close();
    }
}
