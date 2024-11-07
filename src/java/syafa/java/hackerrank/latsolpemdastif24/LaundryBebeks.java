package syafa.java.hackerrank.latsolpemdastif24;
import java.util.*;

public class LaundryBebeks
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String customerName = input.nextLine();
        int customerID = Integer.parseInt(input.nextLine());
        int startHour = input.nextInt();
        int startMinute = input.nextInt();
        input.nextLine();
        String itemName0 = input.next();
        int itemPrice0 = input.nextInt();
        int itemQuantity0 = input.nextInt();
        input.nextLine();
        String itemName1 = input.next();
        int itemPrice1 = input.nextInt();
        int itemQuantity1 = input.nextInt();
        input.nextLine();
        String itemName2 = input.next();
        int itemPrice2 = input.nextInt();
        int itemQuantity2 = input.nextInt();
        input.nextLine();
        String itemName3 = input.next();
        int itemPrice3 = input.nextInt();
        int itemQuantity3 = input.nextInt();
        input.nextLine();
        int laundryMinute = Integer.parseInt(input.nextLine());
        input.close();
    }
}