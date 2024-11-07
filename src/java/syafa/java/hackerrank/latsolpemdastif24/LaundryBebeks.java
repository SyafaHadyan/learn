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
        int minuteFinish = (startMinute + laundryMinute) % 60;
        int hourFinish = startHour + ((laundryMinute + minuteFinish) / 60);
        input.close();
        System.out.println("====================================================================");
        System.out.printf("%-19s%s\n","","LAUNDRY BEBEKS (BEBAS EKSPRES)");
        System.out.printf("%-26s%s %d %-6s%d\n","","Jam",startHour,"Menit",startMinute);
        System.out.println("--------------------------------------------------------------------");
        System.out.printf("%-16s%-2c%s\n%-16s%-2c%s\n","Nama",':',customerName,"ID Pelanggan",':',customerID);
        System.out.println("--------------------------------------------------------------------");
        System.out.printf("%s%-2c%-26s%-2c%-16s%-2c%-16s%c\n","No.",'|',"Nama Pakaian",'|',"Kuantitas",'|',"Harga",'|');
        System.out.println("--------------------------------------------------------------------");
        System.out.printf("%-3s%-2c%-26s%-2c%-16d%-2c%-16d%c\n","1.",'|',itemName0,'|',itemQuantity0,'|',itemPrice0,'|');
        System.out.printf("%-3s%-2c%-26s%-2c%-16d%-2c%-16d%c\n","2.",'|',itemName1,'|',itemQuantity1,'|',itemPrice1,'|');
        System.out.printf("%-3s%-2c%-26s%-2c%-16d%-2c%-16d%c\n","3.",'|',itemName2,'|',itemQuantity2,'|',itemPrice2,'|');
        System.out.printf("%-3s%-2c%-26s%-2c%-16d%-2c%-16d%c\n","4.",'|',itemName3,'|',itemQuantity3,'|',itemPrice3,'|');
        System.out.println("--------------------------------------------------------------------");
        System.out.printf("%-38s%s%-2c%-4s%d\n\n","","Total Harga",'|',"Rp.",((itemPrice0 * itemQuantity0) + (itemPrice1 * itemQuantity1) + (itemPrice2  * itemQuantity2) + (itemPrice3 * itemQuantity3)));
        System.out.printf("%68s\n",new String("Estimasi selesai" + ':' + " " + "Jam" + " " + hourFinish + " " + "Menit" + " " + minuteFinish));
        System.out.print("====================================================================");
    }
}