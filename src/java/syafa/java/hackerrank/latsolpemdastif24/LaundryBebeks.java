package syafa.java.hackerrank.latsolpemdastif24;
import java.util.*;

public class LaundryBebeks
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String customerName = input.nextLine();
        String customerID = input.nextLine();
        int startHour = input.nextInt();
        int startMinute = input.nextInt();
        input.nextLine();
        String itemName0 = input.next();
        double itemPrice0 = input.nextDouble();
        double itemQuantity0 = input.nextDouble();
        input.nextLine();
        String itemName1 = input.next();
        double itemPrice1 = input.nextDouble();
        double itemQuantity1 = input.nextDouble();
        input.nextLine();
        String itemName2 = input.next();
        double itemPrice2 = input.nextDouble();
        double itemQuantity2 = input.nextDouble();
        input.nextLine();
        String itemName3 = input.next();
        double itemPrice3 = input.nextDouble();
        double itemQuantity3 = input.nextDouble();
        input.nextLine();
        int laundryMinute = Integer.parseInt(input.nextLine());
        int minuteFinish = (startMinute + laundryMinute) % 60;
        int hourFinish = startHour + ((startMinute + laundryMinute) / 60);
        hourFinish %= 24;
        input.close();
        double bill = ((itemPrice0 * itemQuantity0) + (itemPrice1 * itemQuantity1) + (itemPrice2  * itemQuantity2) + (itemPrice3 * itemQuantity3));
        System.out.println("====================================================================");
        System.out.printf("%-19s%s\n","","LAUNDRY BEBEKS (BEBAS EKSPRES)");
        System.out.printf("%41s\n",new String("Jam" + " " + startHour + " " + "Menit" + " " + startMinute));
        System.out.println("--------------------------------------------------------------------");
        System.out.printf("%-16s%-2s%s\n%-16s%-2s%s\n","Nama",":",customerName,"ID Pelanggan",":",customerID);
        System.out.println("--------------------------------------------------------------------");
        System.out.printf("%s%-2s%-26s%-2s%-16s%-2s%-16s%s\n","No.","|","Nama Pakaian","|","Kuantitas","|","Harga","|");
        System.out.println("--------------------------------------------------------------------");
        System.out.printf("%-2s | %-25s | %-15.0f | %-15.0f |\n", "1.", itemName0, itemQuantity0, itemPrice0);
        System.out.printf("%-2s | %-25s | %-15.0f | %-15.0f |\n", "2.", itemName1, itemQuantity1, itemPrice1);
        System.out.printf("%-2s | %-25s | %-15.0f | %-15.0f |\n", "3.", itemName2, itemQuantity2, itemPrice2);
        System.out.printf("%-2s | %-25s | %-15.0f | %-15.0f |\n", "4.", itemName3, itemQuantity3, itemPrice3);
        System.out.println("--------------------------------------------------------------------");
        System.out.printf("%-38s%s%-2s%-4s%.0f\n\n","","Total Harga","|","Rp.",(bill));
        System.out.printf("%68s\n",new String("Estimasi selesai" + ":" + " " + "Jam" + " " + hourFinish + " " + "Menit" + " " + minuteFinish));
        System.out.print("====================================================================");
    }
}