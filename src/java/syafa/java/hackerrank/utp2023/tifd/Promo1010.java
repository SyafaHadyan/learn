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
        for (int i = 0; i < purchaseCoffee.length; i++)
        {
            if (i == 0)
            {
                if (purchaseCoffee[i] > 3)
                {
                    totalPrice += 0.95 * (purchaseCoffee[i] * 20000);

                }
                else if (purchaseCoffee[i] > 0)
                {
                    totalPrice += 20000 * purchaseCoffee[i];
                }
                i++;
            }
            else if (i == 1)
            {
                if (purchaseCoffee[i] > 2)
                {
                    totalPrice += 0.92 * (purchaseCoffee[i] * 28000);
                }
                else if (purchaseCoffee[i] > 0)
                {
                    totalPrice += 28000 * purchaseCoffee[i];
                }
                i++;
            }
        }
        //System.out.printf("%-12s%-13s%-2c%s%.1f\n","Harga total kopi","n");
    }
}