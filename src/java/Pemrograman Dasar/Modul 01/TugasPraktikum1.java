import java.util.*;

public class TugasPraktikum1
{
    public static void main(String[] args)
    {
        boolean repeat = false;
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
        System.out.printf("%s%s%s%s%-45s%c%c%s%c%.2f%s%-45s%c%c%s%c%.2f%s%-45s%c%c%s%c%.2f%c%s","\n","\n","Pilih opsi pembayaran","\n","(0) Tunai",':',' ',"Rp",' ',total,"\n","(1) Transfer Bank + Biaya Admin (Rp 2500)",':',' ',"Rp",' ',transferbank,"\n","(2) Cicilan 12 bulan",':',' ',"Rp",' ',cicilan,' ',"Per bulan");
        String pembayaran = input.nextLine();
        while (repeat)
        {
            if (pembayaran == "0")
            {
                System.out.println();
                repeat = false;
            }
            else if (pembayaran == "1")
            {
                System.out.println();
                repeat = false;
            }
            else if (pembayaran == "2")
            {
                System.out.println();
                repeat = false;
            }
            else
            {
                System.out.println();
                repeat = true;
            }
        }
        input.close();
    }
}