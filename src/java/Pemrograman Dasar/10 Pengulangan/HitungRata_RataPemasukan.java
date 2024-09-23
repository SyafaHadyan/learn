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
            System.out.printf("%-30s%d%-2c","Pemasukan ke ",i,':');
            pemasukan = Double.parseDouble(input.nextLine());
            totalPemasukan = totalPemasukan + pemasukan;
        }
        input.close();
        rataRata = totalPemasukan / jumlahPemasukan;
        System.out.printf("%-30s%-2c%s%.2f","Total pemasukan",':',"Rp ",totalPemasukan);
        System.out.printf("%-30s%-2c%s%.2f","Rata-rata pemasukan",':',"Rp ",rataRata);
    }
}