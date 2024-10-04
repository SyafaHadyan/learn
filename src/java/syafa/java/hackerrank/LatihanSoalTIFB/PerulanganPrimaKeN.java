package syafa.java.hackerrank.LatihanSoalTIFB;
import java.util.*;

public class PerulanganPrimaKeN
{
    @SuppressWarnings("unused")
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int cekBilangan = Integer.parseInt(input.nextLine());
        input.close();
        int bilanganSekarang = 2;
        int bilanganPrimaKe = 0;
        int bilanganPrimaSekarang = 0;
        for (int i = 2; i <= bilanganSekarang; i++)
        {
            if (cekPrima(bilanganSekarang))
            {
                bilanganPrimaSekarang = bilanganSekarang;
                bilanganPrimaKe++;
                i = 2;
            }
            bilanganSekarang++;
        }
        System.out.print(bilanganPrimaSekarang);
    }
    private static boolean cekPrima(int bilanganSekarang)
    {
        for (int i = 2; i <= Math.sqrt(bilanganSekarang); i++)
        {
            if (bilanganSekarang % i != 0)
            {
                return false;
            }
        }
        return true;
    }
}