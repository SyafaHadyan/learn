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

        // Bilangan Terkecil
        if (bilanganTerkecil > b)
        {
            bilanganTerkecil = b;
        }
        if (bilanganTerkecil > c)
        {
            bilanganTerkecil = c;
        }

        // Bilangan Tengah
        if ((bilanganTengah < b && bilanganTengah < c) && (b < c))
        {
            bilanganTengah = b;
        }
        if ((bilanganTengah < b && bilanganTengah < c) && (b > c))
        {
            bilanganTengah = c;
        }
        if ((bilanganTengah > b && bilanganTengah > c) && (b > c))
        {
            bilanganTengah = b;
        }
        if ((bilanganTengah > b && bilanganTengah > c) && (b < c))
        {
            bilanganTengah = c;
        }

        // Bilangan Terbesar
        if (bilanganTerbesar < b)
        {
            bilanganTerbesar = b;
        }
        if (bilanganTerbesar < c)
        {
            bilanganTerbesar = c;
        }

        // Tanda
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