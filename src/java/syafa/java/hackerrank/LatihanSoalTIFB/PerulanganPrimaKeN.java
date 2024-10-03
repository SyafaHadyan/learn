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
        for (int i = 2; i < 100000; i++)
        {
            if (bilanganSekarang % i == 0)
            {
                bilanganPrimaKe++;
            }
        }
    }
}