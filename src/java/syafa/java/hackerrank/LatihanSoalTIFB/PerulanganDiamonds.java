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
        for (int i = 1; i <= panjangSebelumTengah; i++)
        {
            for (int j = 1; j <= spasi; j++)
            {
                System.out.print(' ');
            }
            spasi--;
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
        System.out.print("\n");
        spasi = 1;
        for (int i = panjangSebelumTengah; i >= 1; i--)
        {
            for (int j = spasi; j >= 1; j--)
            {
                System.out.print(' ');
            }
            spasi++;
            for (int j = i; j >= 1; j--)
            {
                System.out.print(simbol);
                if (j != 1)
                {
                    System.out.print(' ');
                }
            }
            System.out.print("\n");
        }
    }
}