package syafa.java.hackerrank.LatihanSoalTIFB;
import java.util.*;

public class PerulanganDiamonds
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int ukuranDiamond = Integer.parseInt(input.nextLine());
        input.close();
        char simbol = '*';
        int panjangSebelumTengah = ukuranDiamond / 2;
        int posisiTengah = panjangSebelumTengah + 1;
        int spasiAwalAkhir = panjangSebelumTengah;
        for (int i = 1; i <= panjangSebelumTengah; i++)
        {
            for (int j = spasiAwalAkhir; j > 0; j--)
            {
                System.out.print(' ');
            }
            System.out.println(simbol);
        }
    }
}