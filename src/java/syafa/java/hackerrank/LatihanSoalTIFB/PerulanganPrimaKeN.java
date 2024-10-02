package syafa.java.hackerrank.LatihanSoalTIFB;
import java.util.*;

public class PerulanganPrimaKeN
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int cekBilangan = Integer.parseInt(input.nextLine());
        input.close();
        int bilanganPrima = 0;
        int bilanganPrimaSekarang = 0;
        boolean prima;
        for (int i = 2; i < 100000; i++)
        {
            for (int j = 2; j < 100000; j++)
            {
                if (i % j == 0)
                {
                    prima = false;
                }
                else
                {
                    prima = true;
                    bilanganPrimaSekarang++;
                    bilanganPrima = i;
                    break;
                }
            }
            if (bilanganPrimaSekarang == cekBilangan)
            {
                System.out.print(bilanganPrima);
            }
        }
    }
}