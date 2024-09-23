import java.util.*;

public class HitungRata_RataPemasukan
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.printf("%-30s%-2c","Masukkan jumlah pemasukan",':');
        int jumlahPemasukan = Integer.parseInt(input.nextLine());
        double pemasukan = 0;
        double totalPemasukan = 0;
        double rataRata = 0;
        for (int i = 1; i <= jumlahPemasukan; i++)
        {
            String pemasukanKe = "Pemasukan ke" + ' ' + i;
            System.out.printf("%-30s%-2c",pemasukanKe,':');
            pemasukan = Double.parseDouble(input.nextLine());
            totalPemasukan = totalPemasukan + pemasukan;
        }
        input.close();
        rataRata = totalPemasukan / jumlahPemasukan;
        System.out.printf("%-30s%-2c%s%c%.2f\n","Total pemasukan",':',"Rp",' ',totalPemasukan);
        System.out.printf("%-30s%-2c%s%c%.2f","Rata-rata pemasukan",':',"Rp",' ',rataRata);
    }
}