package syafa.java.hackerrank.LatihanUAPKelasC;
import java.util.*;

public class LC3DataPenjualanHarian
{
    static final int SALE_DAY_INPUT = 7;
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] saleEntry = new int[SALE_DAY_INPUT];
        for (int i = 0; i < saleEntry.length; i++)
        {
            saleEntry[i] = Integer.parseInt(input.nextLine());
        }
        input.close();
    }
}