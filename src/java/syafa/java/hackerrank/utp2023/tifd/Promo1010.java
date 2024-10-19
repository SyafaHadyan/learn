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
        /*
         * am 20000
         * ks 28000
         * kv 23000
         * cp 31000
         * mr 35000
         * americano > 3 disc 5
         * kopiSusu > 2	disc 8
         * vietnam > 4 disc 12
         * if totalPurchase >= 250000 disc 10 after coffee disc
         */
        if (purchaseCoffee[0] > 3)
        {
            
        }
        //System.out.printf("%-12s%-13s%-2c%s%.1f\n","Harga total kopi","n");
    }
}