package syafa.java.hackerrank.LatihanSoalTIFB;
import java.util.*;

public class PercabanganTiketMasuk
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int harga = Integer.parseInt(input.nextLine());
        int saldo = Integer.parseInt(input.nextLine());
        input.close();
        if (harga <= saldo)
        {
            System.out.print("Selamat bermain");
        }
        else if (harga > saldo)
        {
            System.out.print("Maaf, saldo tidak cukup");
        }
    }
}