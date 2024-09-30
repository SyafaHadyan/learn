package syafa.java.hackerrank.LatihanSoalTIFB;
import java.util.*;

public class PercabanganBankDigital
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int saldo = Integer.parseInt(input.nextLine());
        String fungsi = input.nextLine();
        int transaksi = Integer.parseInt(input.nextLine());
        input.close();
        if (fungsi.equalsIgnoreCase("Tarik"))
        {
            if (transaksi > saldo)
            {
                System.out.print("Penarikan gagal, saldo tidak cukup");
            }
            else
            {
                System.out.println("Penarikan berhasil");
                System.out.print("Saldo" + " : Rp. " + (saldo - transaksi));
            }
        }
        else if (fungsi.equalsIgnoreCase("Tabung"))
        {
            System.out.println("Penabungan berhasil");
            System.out.print("Saldo" + " : Rp. " + (saldo + transaksi));
        }
    }
}