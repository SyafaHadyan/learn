package syafa.java.hackerrank.latsolpemdastif24;
import java.util.*;

public class LaundryBebeks
{
    /*
Gabriel
1234
14 37
Baju_Berkerah 2000 4
Celana_Jeans 3000 2
Selimut_Tebal 13000 1
Boneka 13000 2
45

Gabriel
1234
14 37
Baju_Berkerah 1000000 1000000
Celana_Jeans 1000000 2
Selimut_Tebal 13000 1
Boneka 13000 2
45
     */
    /*
     * ====================================================================
     *                    LAUNDRY BEBEKS (BEBAS EKSPRES)
     *                           Jam 14 Menit 37
     * --------------------------------------------------------------------
     * Nama            : Gabriel
     * ID Pelanggan    : 1234
     * --------------------------------------------------------------------
     * No.| Nama Pakaian              | Kuantitas       | Harga           |
     * --------------------------------------------------------------------
     * 1. | Baju_Berkerah             | 4               | 2000            |
     * 2. | Celana_Jeans              | 2               | 3000            |
     * 3. | Selimut_Tebal             | 1               | 13000           |
     * 4. | Boneka                    | 2               | 13000           |
     * --------------------------------------------------------------------
     *                                       Total Harga| Rp. 53000
     *                                    Estimasi selesai: Jam 15 Menit 22
     * ====================================================================
     * 
     * Baju_Berkerahaaaaaaaaaaaa
     */
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
        //System.out.printf("%-3s%-2s%-26s%-2s%-16d%-2s%-16d%s\n","1.","|",itemName0,"|",itemQuantity0,"|",itemPrice0,"|");
        //System.out.printf("%-3s%-2s%-26s%-2s%-16d%-2s%-16d%s\n","2.","|",itemName1,"|",itemQuantity1,"|",itemPrice1,"|");
        //System.out.printf("%-3s%-2s%-26s%-2s%-16d%-2s%-16d%s\n","3.","|",itemName2,"|",itemQuantity2,"|",itemPrice2,"|");
        //System.out.printf("%-3s%-2s%-26s%-2s%-16d%-2s%-16d%s\n","4.","|",itemName3,"|",itemQuantity3,"|",itemPrice3,"|");
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