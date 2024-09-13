import java.util.*;
import java.util.concurrent.*;

public class TugasPraktikum1
{
    public static void main(String[] args)
    {
        boolean repeat = true;
        Scanner input = new Scanner(System.in);
        System.out.println("Selamat datang di portal pembayaran listrik PLN" + "\n" + "Silahkan masukkan data pengguna" + "\n");
        System.out.printf("%-25s%c%c","Nama lengkap",':',' ');
        String fullname = input.nextLine();
        System.out.printf("%-25s%c%c","Kelurahan",':',' ');
        String kelurahan = input.nextLine();
        System.out.printf("%-25s%c%c","Posisi awal kWh",':',' ');
        int k_initial = Integer.parseInt(input.nextLine());
        System.out.printf("%-25s%c%c","Posisi akhir kWh",':',' ');
        int k_final = Integer.parseInt(input.nextLine());
        System.out.printf("%-25s%c%c","Biaya beban",':',' ');
        int beban = Integer.parseInt(input.nextLine());
        System.out.printf("%-25s%c%c","PPJ (dalam persen)",':',' ');
        int ppj = Integer.parseInt(input.nextLine());
        double tariflistrik = beban * (k_final - k_initial);
        double pajak = tariflistrik * ppj / 100;
        double total = tariflistrik + pajak;
        double cicilan = total / 12;
        double transferbank = total + 2500;
        String header = "\n" + "=========================" + ' ' + "PLN Kelurahan" + ' ' + kelurahan + ' ' + "=========================";
        System.out.printf("%.87s%s%s",header,"\n","\n");
        System.out.printf("%-25s%c%c%s\n","Nama lengkap",':',' ',fullname);
        System.out.printf("%-25s%c%c%s\n","Kelurahan",':',' ',kelurahan);
        System.out.printf("%-25s%c%c%d%c%s\n","Pemakaian bulan ini",':',' ',k_final - k_initial,' ',"kWh Meter");
        System.out.printf("%-25s%c%c%s%c%.2f\n","Tarif Listrik",':',' ',"Rp",' ',tariflistrik);
        System.out.printf("%-25s%c%c%s%c%.2f\n","PPJ",':',' ',"Rp",' ',pajak);
        System.out.printf("%-25s%c%c%s%c%.2f\n","Tarif Listrik",':',' ',"Rp",' ',total);
        System.out.print("\n" + "================================ Portal Pembayaran PLN ================================");
        System.out.printf("%s%s%s%s%-45s%c%c%s%c%.2f%s%-45s%c%c%s%c%.2f%s%-45s%c%c%s%c%.2f%c%s","\n","\n","Pilih opsi pembayaran","\n","(0) Tunai",':',' ',"Rp",' ',total,"\n","(1) Virtual Account + Biaya Admin (Rp 2500)",':',' ',"Rp",' ',transferbank,"\n","(2) Cicilan 12 bulan",':',' ',"Rp",' ',cicilan,' ',"Per bulan");
        System.out.printf("%s%-45s%c%c","\n","Masukkan pilihan pembayaran",':',' ');
        int pembayaran = Integer.parseInt(input.nextLine());
        int no_rek_0 = ThreadLocalRandom.current().nextInt(1000, 9000 + 1);
        int no_rek_1 = ThreadLocalRandom.current().nextInt(1000, 9000 + 1);
        int no_rek_2 = ThreadLocalRandom.current().nextInt(1000, 9000 + 1);
        int no_rek_3 = ThreadLocalRandom.current().nextInt(1000, 9000 + 1);
        int no_pembayaran_0 = ThreadLocalRandom.current().nextInt(1000, 9000 + 1);
        int no_pembayaran_1 = ThreadLocalRandom.current().nextInt(1000, 9000 + 1);
        int no_pembayaran_2 = ThreadLocalRandom.current().nextInt(1000, 9000 + 1);
        int no_pembayaran_3 = ThreadLocalRandom.current().nextInt(1000, 9000 + 1);
        do
        {
            repeat = false;
            if (pembayaran == 0)
            {
                System.out.printf("%s%-45s%c%c%s%c%s%c%s%c%s\n","\n","Kode pembayaran anda adalah",':',' ',no_pembayaran_0,' ',no_pembayaran_1,' ',no_pembayaran_2,' ',no_pembayaran_3);
                System.out.println("Silahkan simpan dan bawa kode pembayaran ke PLN terdekat");
                repeat = false;
            }
            else if (pembayaran == 1)
            {
                System.out.printf("%s%-45s%c%c%s%c%s%c%s%c%s\n","\n","Kode pembayaran anda adalah",':',' ',no_pembayaran_0,' ',no_pembayaran_1,' ',no_pembayaran_2,' ',no_pembayaran_3);
                System.out.printf("%-45s%c%c%s%s%s%s\n","Silahkan lakukan pembayaran ke nomor",':',' ',no_rek_0,no_rek_1,no_rek_2,no_rek_3);
                repeat = false;
            }
            else if (pembayaran == 2)
            {
                System.out.printf("%s%-45s%c%c%s%c%s%c%s%c%s\n","\n","Kode pembayaran anda adalah",':',' ',no_pembayaran_0,' ',no_pembayaran_1,' ',no_pembayaran_2,' ',no_pembayaran_3);
                System.out.printf("%-45s%c%c%s%s%s%s\n","Silahkan lakukan pembayaran ke nomor rekening",':',' ',no_rek_0,no_rek_1,no_rek_2,no_rek_3);
                System.out.println("Silahkan simpan kode pembayaran yang akan digunakan saat pembayaran selanjutnya");
                repeat = false;
            }
            else
            {
                System.out.println("Pilihan yang anda masukkan salah, silahkan coba lagi");
                repeat = true;
            }
        }
        while (repeat);
        System.out.print("\n" + "Terima kasih telah menggunakan layanan pembayaran PLN");
        input.close();
    }
}