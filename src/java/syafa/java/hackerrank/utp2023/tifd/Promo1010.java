package syafa.java.hackerrank.utp2023.tifd;
import java.util.*;
import java.util.stream.*;

public class Promo1010
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int[] purchaseCoffee = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        input.close();
        int counter = 0;
        double totalPrice = 0d;
        double kopiAmericano = 20000d;
        double kopiSusu = 28000d;
        double kopiVietnam = 23000d;
        double kopiCappucino = 31000d;
        double kopiMochaRum = 35000d;
        /*
         * am 20000
         * ks 28000
         * kv 23000
         * cp 31000
         * mr 35000
         * 
         * americano > 3 disc 5
         * kopiSusu > 2	disc 8
         * vietnam > 4 disc 12
         * if totalPurchase >= 250000 disc 10 after coffee disc
         */
        while (counter < purchaseCoffee.length)
        {
            if (counter == 0)
            {
                if (purchaseCoffee[counter] > 3)
                {
                    totalPrice += 0.95 * (purchaseCoffee[counter] * kopiAmericano);
                    kopiAmericano = 0.95 * (purchaseCoffee[counter] * kopiAmericano);
                }
                else if (purchaseCoffee[counter] > 0)
                {
                    totalPrice += kopiAmericano * purchaseCoffee[counter];
                    kopiAmericano = kopiAmericano * purchaseCoffee[counter];
                }
                counter++;
            }
            else if (counter == 1)
            {
                if (purchaseCoffee[counter] > 2)
                {
                    totalPrice += 0.92 * (purchaseCoffee[counter] * kopiSusu);
                    kopiSusu = 0.92 * (purchaseCoffee[counter] * kopiSusu);
                }
                else if (purchaseCoffee[counter] > 0)
                {
                    totalPrice += kopiSusu * purchaseCoffee[counter];
                    kopiSusu = kopiSusu * purchaseCoffee[counter];
                }
                counter++;
            }
            else if (counter == 2)
            {
                if (purchaseCoffee[counter] > 4)
                {
                    totalPrice += 0.88 * (purchaseCoffee[counter] * kopiVietnam);
                    kopiVietnam = 0.88 * (purchaseCoffee[counter] * kopiVietnam);
                }
                else if (purchaseCoffee[counter] > 0)
                {
                    totalPrice += kopiSusu * purchaseCoffee[counter];
                    kopiVietnam = kopiVietnam * purchaseCoffee[counter];
                }
                counter++;
            }
            else if (counter == 3)
            {
                totalPrice += kopiCappucino * purchaseCoffee[counter];
                kopiCappucino = kopiCappucino * purchaseCoffee[counter];
                counter++;
            }
            else if (counter == 4)
            {
                totalPrice += kopiMochaRum * purchaseCoffee[counter];
                kopiMochaRum = kopiMochaRum * purchaseCoffee[counter];
                counter++;
            }
        }
        /*
         * Total harga pesanan      : Rp364480.0
         * Harga yang harus dibayar : Rp328032.0
         */
        System.out.printf("%-12s%-13s%-2c%s%.1f\n","Harga total","americano",':',"Rp",kopiAmericano);
        System.out.printf("%-12s%-13s%-2c%s%.1f\n","Harga total","kopi susu",':',"Rp",kopiSusu);
        System.out.printf("%-12s%-13s%-2c%s%.1f\n","Harga total","kopi vietnam",':',"Rp",kopiVietnam);
        System.out.printf("%-12s%-13s%-2c%s%.1f\n","Harga total","cappucino",':',"Rp",kopiCappucino);
        System.out.printf("%-12s%-13s%-2c%s%.1f\n","Harga total","mocha rum",':',"Rp",kopiMochaRum);
        System.out.println("=====================================");
        //System.out.printf("%-25s%-2c%s%.1f\n","Total harga pesanan",':',"Rp",totalPrice);
        System.out.printf("%-25s%-2c%s%.1f\n","Harga yang harus dibayar",':',"Rp",totalPrice);
    }
}