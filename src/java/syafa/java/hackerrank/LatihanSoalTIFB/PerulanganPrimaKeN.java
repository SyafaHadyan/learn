package syafa.java.hackerrank.LatihanSoalTIFB;
import java.util.*;

public class PerulanganPrimaKeN
{
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
            if ((i < bilanganSekarang) && (bilanganSekarang % i != 0))
            {
                bilanganPrimaSekarang = bilanganSekarang;
                bilanganPrimaKe++;
                i = 2;
            }
            bilanganSekarang++;
            if (cekBilangan == bilanganPrimaKe)
            {
                break;
            }
        }
        System.out.print(bilanganPrimaSekarang);
    }
}