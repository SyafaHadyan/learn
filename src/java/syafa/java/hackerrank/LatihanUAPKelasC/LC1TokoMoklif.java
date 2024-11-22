package syafa.java.hackerrank.LatihanUAPKelasC;
import java.util.*;
import java.math.*;

public class LC1TokoMoklif
{
    static final int ITEM_AMOUNT = 3;
    public static void main(String[] args)
    {
        /*
         * ========================================
         *               Toko Moklif
         *            14 September 2024
         * ----------------------------------------
         * Name     : Dengklek
         * NIM      : 245150200000001
         * ----------------------------------------
         * Nama Barang                     Harga($)
         * ----------------------------------------
         * Mikrosoft 345                  365000.00
         * Abode Cloud                    200000.00
         * Windos 9                       300000.00
         * ----------------------------------------
         * subTotal                       865000.00
         * Total                          951500.00
         * Bayar                         1000000.00
         * Kembali                         48500.00
         * ========================================
         */
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        BigInteger NIM = input.nextBigInteger(); input.nextLine();
        String[][] item = new String[ITEM_AMOUNT][2];
        for (int i = 0; i < item.length; i++)
        {
            for (int j = 0; j < item[i].length; j++)
            {
                item[i][j] = input.nextLine();
            }
        }
        int tax = Integer.parseInt(input.nextLine());
        BigDecimal money = input.nextBigDecimal(); input.nextLine();
        input.close();
    }
}