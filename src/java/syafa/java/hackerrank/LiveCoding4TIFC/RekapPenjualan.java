// dilarang melakukan import package selain yang sudah disediakan
package syafa.java.hackerrank.LiveCoding4TIFC;
import java.util.Scanner;

public class RekapPenjualan
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int workerAmount = input.nextInt();
        int sellAmount = input.nextInt();
        input.nextLine();
        int maxSell = 0;
        int mostWorker = 0;
        String[] sellResult = new String[workerAmount];
        for (int i = 0; i < workerAmount; i++)
        {
            int tempSell = 0;
            for (int j = 0; j < sellAmount; j++)
            {
                tempSell += input.nextInt();
            }
            sellResult[i] = ("Pegawai ke-" + (i + 1) + " melakukan penjualan sebanyak " + tempSell);
            if (tempSell > maxSell)
            {
                mostWorker = (i + 1);
                maxSell = tempSell;
            }
        }
        input.close();
        for (int i = 0; i < sellResult.length; i++)
        {
            System.out.println(sellResult[i]);
        }
        System.out.print("\n");
        System.out.print("Penjualan Terbanyak diraih oleh Pegawai ke-" + mostWorker);
    }
}