import java.util.*;

public class TugasPraktikum1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Selamat datang di portal pembayaran listrik PLN" + "\n" + "Silahkan masukkan data pengguna" + "\n");
        System.out.printf("%-25s%c%c","Nama lengkap",':',' ');
        String fullname = input.nextLine();
        System.out.printf("%-25s%c%c","Kelurahan",':',' ');
        String kelurahan = input.nextLine();
        System.out.printf("%-25s%c%c","Posisi awal kWh",':',' ');
        int k_initial = input.nextInt();
        System.out.printf("%-25s%c%c","Posisi akhir kWh",':',' ');
        int k_final = input.nextInt();
        System.out.printf("%-25s%c%c","Biaya beban",':',' ');
        int beban = input.nextInt();
        System.out.printf("%-25s%c%c","PPJ (dalam persen)",':',' ');
        int ppj = input.nextInt();
        double tariflistrik = beban * (k_final - k_initial);
        double pajak = tariflistrik * ppj / 100;
        double total = tariflistrik + pajak;
        System.out.println("\n" + "=========================" + ' ' + "PLN Kelurahan" + ' ' + kelurahan + ' ' + "=========================" + "\n");
        System.out.printf("%-25s%c%c%s\n","Nama lengkap",':',' ',fullname);
        System.out.printf("%-25s%c%c%s\n","Kelurahan",':',' ',kelurahan);
        System.out.printf("%-25s%c%c%d%c%s\n","Pemakaian bulan ini",':',' ',k_final - k_initial,' ',"kWh Meter");
        System.out.printf("%-25s%c%c%s%c%.2f\n","Tarif Listrik",':',' ',"Rp",' ',tariflistrik);
        System.out.printf("%-25s%c%c%s%c%.2f\n","PPJ",':',' ',"Rp",' ',pajak);
        System.out.printf("%-25s%c%c%s%c%.2f\n","Tarif Listrik",':',' ',"Rp",' ',total);
        input.close();
    }
}