package syafa.java.hackerrank.LatihanSoalTIFB;
import java.util.*;

public class PercabanganHubunganTigaAngka
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        input.close();
        int bilanganTerkecil = a;
        int bilanganTengah = a;
        int bilanganTerbesar = a;
        if (bilanganTerkecil > b)
        {
            bilanganTerkecil = b;
        }
        if (bilanganTerkecil > c)
        {
            bilanganTerkecil = c;
        }
        if ((a > bilanganTerkecil && a < bilanganTerbesar) || (a < bilanganTerkecil && a > bilanganTerbesar))
        {
            bilanganTengah = a;
        }
        else if ((b > bilanganTerkecil && b < bilanganTerbesar) || (b < bilanganTerkecil && b > bilanganTerbesar))
        {
            bilanganTengah = b;
        }
        else
        {
            bilanganTengah = c;
        }
        if (bilanganTerbesar < b)
        {
            bilanganTerbesar = b;
        }
        if (bilanganTerbesar < c)
        {
            bilanganTerbesar = c;
        }
        System.out.print(bilanganTerkecil + ' ' + " " + ' ' + bilanganTengah + ' ' + " " + ' ' + bilanganTerbesar);
    }
}