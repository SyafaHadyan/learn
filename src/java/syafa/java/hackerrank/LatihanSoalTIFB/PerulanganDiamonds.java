package syafa.java.hackerrank.LatihanSoalTIFB;
import java.util.*;

public class PerulanganDiamonds
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int ukuranBentuk = Integer.parseInt(input.nextLine());
        input.close();
        char simbol = '*';
        int panjangSebelumTengah = ukuranBentuk / 2;
        //int posisiTengah = panjangSebelumTengah + 1;
        for (int i = 1; i <= panjangSebelumTengah; i++)
        {
            for (int j = panjangSebelumTengah; j > 0; j--)
            {
                System.out.print(' ');
            }
            for (int j = 1; j <= i; j++)
            {
                System.out.print(simbol);
                if (j > 1)
                {
                    System.out.print(' ');
                }
            }
        }
            /*
            for (int j = spasiAwalAkhir - i + 1; j > 0; j--)
            {
                System.out.print(' ');
            }
            for (int j = 1; j <= panjangSebelumTengah; j++)
            {
                System.out.print(simbol);
                for (int k = panjangSebelumTengah; k >= 0; k--)
                {
                    System.out.print(' ');
                }
            }
            */

    }
}