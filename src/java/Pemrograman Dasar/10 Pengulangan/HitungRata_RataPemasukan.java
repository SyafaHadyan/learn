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
        for (int i = jumlahPemasukan; i <= jumlahPemasukan; i++)
        {
            pemasukan = Double.parseDouble(input.nextLine());
            totalPemasukan = totalPemasukan + pemasukan;
        }
    }
}