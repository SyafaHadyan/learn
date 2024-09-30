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
        String tandaSatu = "<";
        String tandaDua = "<";
        if (bilanganTerkecil > b)
        {
            bilanganTerkecil = b;
        }
        if (bilanganTerkecil > c)
        {
            bilanganTerkecil = c;
        }
        if (b > bilanganTerbesar)
        {
            bilanganTerbesar = b;
        }
        if (c > bilanganTerbesar)
        {
            bilanganTerbesar = c;
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
        if (bilanganTerkecil == bilanganTengah)
        {
            tandaSatu = "=";
        }
        if (bilanganTengah == bilanganTerbesar)
        {
            tandaDua = "=";
        }
        System.out.print(bilanganTerkecil + " " + tandaSatu + " " + bilanganTengah + " " + tandaDua + " " + bilanganTerbesar);
    }
}