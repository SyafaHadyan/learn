import java.util.*;

public class Praktikum0
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("1. menghitung luas dan keliling persegi panjang");
        System.out.println("1. menghitung luas dan keliling lingkaran");
        System.out.println("1. menghitung luas dan keliling segitiga");
        System.out.printf("%s%-2c","Pilihan anda",':');
        int pilihanKonversi = Integer.parseInt(input.nextLine());
        int hasilKeliling = 0;
        int hasilLuas = 0;
        boolean outputHasilPerhitungan = true;
        switch (pilihanKonversi)
        {
            case 1:
                System.out.printf("%s%-2c","Masukkan sisi 1",':');
                int sisiSatu = Integer.parseInt(input.nextLine());
                System.out.printf("%s%-2c","Masukkan sisi 2",':');
                int sisiDua = Integer.parseInt(input.nextLine());
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                System.out.print("Data tak ditemukan, program dihentikan ...");
                outputHasilPerhitungan = false;
                break;
        }
        if (outputHasilPerhitungan)
        {
            System.out.printf("%s%-2c%d","Keliling",':',hasilLuas);
        }
    }
}