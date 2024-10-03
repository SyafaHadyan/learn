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
        int posisiTengah = panjangSebelumTengah + 1;
        int spasi = panjangSebelumTengah;
        char spasiArray[] = new char[panjangSebelumTengah];
        spasiArray[0] = ' ';
        for (int i = 1; i <= panjangSebelumTengah; i++)
        {
            for (int j = spasi; j > 0; j--)
            {
                System.out.print(spasiArray[0]);
            }
            for (int j = 1; j <= i; j++)
            {
                System.out.print(simbol);
                if (j != i)
                {
                    System.out.print(' ');
                }
            }
            System.out.print("\n");
        }
        for (int i = 1; i <= posisiTengah; i++)
        {
            System.out.print(simbol);
            if (i != posisiTengah)
            {
                System.out.print(' ');
            }
        }
        for (int i = panjangSebelumTengah; i >= 1; i--)
        {
            for (int j = spasi; j > 0; j++)
            {
                System.out.print(spasiArray[0]);
            }
            for (int j = i; j >= 1; j--)
            {
                System.out.print(simbol);
                if (j != i)
                {
                    System.out.print(' ');
                }
            }
            System.out.print("\n");
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