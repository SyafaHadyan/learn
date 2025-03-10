package syafa.java.hackerrank.latsolpemdastif24;
import java.util.*;

public class RestoGKM
{
    static final int[] POINT_REDEEM = {10,5,2};
    static final String[] REDEEM_LIST = {"Ramen","Gyoza","Ocha"};
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int point = 31 - (Integer.parseInt(input.nextLine()));
        input.close();
        int[] possibleRedeem = new int[POINT_REDEEM.length];
        int counter = 0;
        System.out.printf
        (
        "%s%-2c%d\n",
        "Tanggal awal makan di resto",':',(31 - point)
        );
        for (int i = 0; i < POINT_REDEEM.length; i++)
        {
            while (point - POINT_REDEEM[i] >= 0)
            {
                point -= POINT_REDEEM[i];
                possibleRedeem[i]++;
            }
            counter += possibleRedeem[i];
        }
        if (counter != 0)
        {
            int printCount = 0;
            System.out.print("Hyde O'Brien mendapat");
            for (int i = 0; i < possibleRedeem.length; i++)
            {
                if (possibleRedeem[i] != 0)
                {
                    if (printCount > 0 && i < possibleRedeem.length && (possibleRedeem[1] != 0 || possibleRedeem[2] != 0))
                    {
                        System.out.print(",");
                    }
                    System.out.print(" " + possibleRedeem[i] + " " + REDEEM_LIST[i]);
                    printCount++;
                }
            }
            System.exit(0);
        }
        System.out.print("Poin tidak cukup untuk ditukarkan.");
    }
}