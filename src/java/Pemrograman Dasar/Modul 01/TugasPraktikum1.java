import java.util.*;
import java.util.concurrent.*;

public class TugasPraktikum1
{
    static void randload()
    {
        int loading = ThreadLocalRandom.current().nextInt(3000, 6000 + 1);
        try
        {
            Thread.sleep(loading);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
    public static void main(String[] args)
    {
        boolean repeat = true;
        boolean checkinput = true;
        int k_initial = 0;
        int k_final = 0;
        int beban = 0;
        int ppj = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Selamat datang di portal pembayaran listrik PLN" + "\n" + "Silahkan masukkan data pengguna" + "\n");
        System.out.printf("%-25s%c%c","Nama lengkap",':',' ');
        String fullname = input.nextLine();
        System.out.printf("%-25s%c%c","Kelurahan",':',' ');
        String kelurahan = input.nextLine();
        while (checkinput)
        {
            System.out.printf("%-25s%c%c","Posisi awal kWh",':',' ');
            k_initial = Integer.parseInt(input.nextLine());
            System.out.printf("%-25s%c%c","Posisi akhir kWh",':',' ');
            k_final = Integer.parseInt(input.nextLine());
            if (k_initial > k_final)
            {
                System.out.println("kWh awal tidak boleh lebih besar dari kWh akhir");
                checkinput = true;
            }
            else if (k_initial == k_final)
            {
                System.out.println("kWh awal tidak boleh sama dengan kWh akhir");
                checkinput = true;
            }
            else
            {
                checkinput = false;
            }
        }
        checkinput = true;
        while (checkinput)
        {
            System.out.printf("%-25s%c%c","Biaya beban",':',' ');
            beban = Integer.parseInt(input.nextLine());
            if (beban < 0)
            {
                System.out.println("Biaya beban tidak boleh kurang dari nol");
                checkinput = true;
            }
            else if (beban == 0)
            {
                System.out.println("Biaya beban tidak boleh sama dengan nol");
                checkinput = true;
            }
            else
            {
                checkinput = false;
            }
        }
        checkinput = true;
        while (checkinput)
        {
            System.out.printf("%-25s%c%c","PPJ (dalam persen)",':',' ');
            ppj = Integer.parseInt(input.nextLine());
            if(ppj < 0)
            {
                System.out.println("PPJ tidak boleh kurang dari nol");
                checkinput = true;
            }
            else if (ppj == 0)
            {
                System.out.println("PPJ tidak boleh sama dengan nol");
                checkinput = true;
            }
            else
            {
                checkinput = false;
            }
        }
        double tariflistrik = beban * (k_final - k_initial);
        double tax = tariflistrik * ppj / 100;
        double total = tariflistrik + tax;
        double cicilan = total / 12;
        double virtualaccount = total + 2500;
        String header = "=========================" + ' ' + "PLN Kelurahan" + ' ' + kelurahan + ' ' + "====================================================================================================";
        System.out.printf("%s%.87s%s%s","\n",header,"\n","\n");
        System.out.printf("%-25s%c%c%s\n","Nama lengkap",':',' ',fullname);
        System.out.printf("%-25s%c%c%s\n","Kelurahan",':',' ',kelurahan);
        System.out.printf("%-25s%c%c%d%c%s\n","Pemakaian bulan ini",':',' ',k_final - k_initial,' ',"kWh Meter");
        System.out.printf("%-25s%c%c%s%c%.2f\n","Tarif Listrik",':',' ',"Rp",' ',tariflistrik);
        System.out.printf("%-25s%c%c%s%c%.2f\n","PPJ",':',' ',"Rp",' ',tax);
        System.out.printf("%-25s%c%c%s%c%.2f%s\n","Tarif Listrik",':',' ',"Rp",' ',total,"\n");
        System.out.print("================================ Portal Pembayaran PLN ================================");
        int no_rek_0 = ThreadLocalRandom.current().nextInt(1000, 9000 + 1);
        int no_rek_1 = ThreadLocalRandom.current().nextInt(1000, 9000 + 1);
        int no_rek_2 = ThreadLocalRandom.current().nextInt(1000, 9000 + 1);
        int no_rek_3 = ThreadLocalRandom.current().nextInt(1000, 9000 + 1);
        int no_pembayaran_0 = ThreadLocalRandom.current().nextInt(1000, 9000 + 1);
        int no_pembayaran_1 = ThreadLocalRandom.current().nextInt(1000, 9000 + 1);
        int no_pembayaran_2 = ThreadLocalRandom.current().nextInt(1000, 9000 + 1);
        int no_pembayaran_3 = ThreadLocalRandom.current().nextInt(1000, 9000 + 1);
        while (repeat)
        {
            repeat = false;
            System.out.printf("%s%s%s%s%-45s%c%c%s%c%.2f%s%-45s%c%c%s%c%.2f%s%-45s%c%c%s%c%.2f%c%s","\n","\n","Pilih opsi pembayaran","\n","(0) Tunai",':',' ',"Rp",' ',total,"\n","(1) Virtual Account + Biaya Admin (Rp 2500)",':',' ',"Rp",' ',virtualaccount,"\n","(2) Cicilan 12 bulan",':',' ',"Rp",' ',cicilan,' ',"Per bulan");
            System.out.printf("%s%-45s%c%c","\n","Masukkan pilihan pembayaran",':',' ');
            int payment = Integer.parseInt(input.nextLine());
            System.out.print("Membuat kode pembayaran" + "...");
            randload();
            System.out.println();
    
            if (payment == 0)
            {
                System.out.printf("%s%-45s%c%c%s%c%s%c%s%c%s\n","\n","Kode pembayaran anda adalah",':',' ',no_pembayaran_0,' ',no_pembayaran_1,' ',no_pembayaran_2,' ',no_pembayaran_3);
                System.out.println("Silahkan simpan dan bawa kode pembayaran ke PLN terdekat");
                repeat = false;
            }
            else if (payment == 1)
            {
                System.out.printf("%s%-45s%c%c%s%c%s%c%s%c%s\n","\n","Kode pembayaran anda adalah",':',' ',no_pembayaran_0,' ',no_pembayaran_1,' ',no_pembayaran_2,' ',no_pembayaran_3);
                System.out.printf("%-45s%c%c%s%s%s%s\n","Silahkan lakukan pembayaran ke nomor",':',' ',no_rek_0,no_rek_1,no_rek_2,no_rek_3);
                System.out.println("Kode pembayaran anda valid selama 24 jam");
                repeat = false;
            }
            else if (payment == 2)
            {
                System.out.printf("%s%-45s%c%c%s%c%s%c%s%c%s\n","\n","Kode pembayaran anda adalah",':',' ',no_pembayaran_0,' ',no_pembayaran_1,' ',no_pembayaran_2,' ',no_pembayaran_3);
                System.out.printf("%-45s%c%c%s%s%s%s\n","Silahkan lakukan pembayaran ke nomor",':',' ',no_rek_0,no_rek_1,no_rek_2,no_rek_3);
                System.out.println("Silahkan simpan kode pembayaran yang akan digunakan saat pembayaran selanjutnya");
                repeat = false;
            }
            else
            {
                System.out.print("\n" + "Pilihan yang anda masukkan salah, silahkan coba lagi");
                repeat = true;
            }
        }
        System.out.print("\n" + "Terima kasih telah menggunakan layanan pembayaran PLN");
        System.out.printf("%s%s%-25s%c%c%s%s%-25s%c%c%s","\n","\n","Program made by",':',' ',"Syafa Hadyan Rasendriya","\n","NIM",':',' ',"245150207111047");
        input.close();
    }
}