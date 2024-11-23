package syafa.java.hackerrank.LatihanUAPKelasC;
import java.util.*;

public class LC3DataPenjualanHarian
{
    static final int SALE_DAY_INPUT = 7;
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] saleEntry = new int[SALE_DAY_INPUT];
        int lowestSale = Integer.MAX_VALUE;
        int highestSale = Integer.MIN_VALUE;
        int consecutiveSaleIncrease = 0;
        int currentConsecutiveSaleIncrease = 0;
        int totalSaleWithoutMinMaxValue = 0;
        for (int i = 0; i < saleEntry.length; i++)
        {
            saleEntry[i] = Integer.parseInt(input.nextLine());
            if (saleEntry[i] < lowestSale)
            {
                lowestSale = saleEntry[i];
            }
            if (saleEntry[i] > highestSale)
            {
                highestSale = saleEntry[i];
            }
            if (i != 0 && saleEntry[i] > saleEntry[i - 1])
            {
                currentConsecutiveSaleIncrease++;
                System.err.println("CCS " + currentConsecutiveSaleIncrease);
            }
            if ((i != 0 && saleEntry[i] < saleEntry[i - 1]) || saleEntry.length - i == 1)
            {
                System.err.println("CCS " + currentConsecutiveSaleIncrease);
                if (consecutiveSaleIncrease < currentConsecutiveSaleIncrease)
                {
                    consecutiveSaleIncrease = currentConsecutiveSaleIncrease;
                    currentConsecutiveSaleIncrease = 0;
                    System.err.println("CC " + consecutiveSaleIncrease);
                }
            }
            totalSaleWithoutMinMaxValue += saleEntry[i];
        }
        input.close();
        System.err.println("TS " + totalSaleWithoutMinMaxValue);
        totalSaleWithoutMinMaxValue -= (highestSale + lowestSale);
        System.err.println("TSF " + totalSaleWithoutMinMaxValue);
        System.out.println("Penjualan tertinggi adalah" + " " + highestSale);
        System.out.println("Penjualan terendah adalah" + " " + lowestSale);
        System.out.println("Jumlah hari berturut-turut dengan kenaikan penjualan" + ": " + consecutiveSaleIncrease);
        System.out.printf("%s%-2c%.2f\n","Rata-rata penjualan harian tanpa hari tertinggi dan terendah",':',(totalSaleWithoutMinMaxValue / ((double) (saleEntry.length - 2))));
    }
}