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
        switch (pilihanKonversi)
        {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                System.out.print("Data tak ditemukan, program dihentikan ...");
                break;
        }
    }
}