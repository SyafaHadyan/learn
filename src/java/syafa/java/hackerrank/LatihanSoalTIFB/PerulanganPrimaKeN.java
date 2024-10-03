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
        int bilanganPrimaKe = 1;
        int bilanganPrimaSekarang = 2;
        for (int i = 2; i <= bilanganSekarang; i++)
        {
            if ((i < bilanganSekarang) && (bilanganSekarang % i != 0))
            {
                bilanganPrimaSekarang = bilanganSekarang;
                bilanganPrimaKe++;
            }
            bilanganSekarang++;
        }
        System.out.print(bilanganPrimaSekarang);
    }
}