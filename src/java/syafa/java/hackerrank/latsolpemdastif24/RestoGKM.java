package syafa.java.hackerrank.latsolpemdastif24;
import java.util.*;

public class RestoGKM
{
    static final int[] POINT_REDEEM = {10,5,2};
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int point = 31 - (Integer.parseInt(input.nextLine()));
        input.close();
        int[] possibleRedeem = new int[POINT_REDEEM.length];
        System.out.printf
        (
        "%s%-2c%d\n",
        "Tanggal awal makan di resto",':',(31 - point)
        );
        for (int i = 0; i < POINT_REDEEM.length; i--)
        {
            while (point - POINT_REDEEM[i] >= 0)
            {
                point -= POINT_REDEEM[i];
                possibleRedeem[i]++;
            }
        }
    }
}