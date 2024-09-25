import java.util.*;

public class Praktikum0
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double hasilKeliling = 0;
        double hasilLuas = 0;
        String namaPilihan = "Bentuk";
        final double PI = 3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679;
        final String unitKeliling = "cm";
        final String unitLuas = unitKeliling + '2';
        boolean outputHasilPerhitungan = true;
        boolean inputValid = true;
        System.out.println("1. menghitung luas dan keliling persegi panjang");
        System.out.println("2. menghitung luas dan keliling lingkaran");
        System.out.println("3. menghitung luas dan keliling segitiga");
        while(inputValid)
        {
            System.out.printf("%s%-2c","Pilihan anda",':');
            int pilihanKonversi = Integer.parseInt(input.nextLine());
            switch (pilihanKonversi)
            {
                case 1:
                    namaPilihan = "persegi panjang";
                    System.out.printf("%s%-2c","Masukkan sisi 1",':');
                    int sisiSatu = Integer.parseInt(input.nextLine());
                    System.out.printf("%s%-2c","Masukkan sisi 2",':');
                    int sisiDua = Integer.parseInt(input.nextLine());
                    hasilKeliling = (sisiSatu * 2) + (sisiDua * 2);
                    hasilLuas = sisiSatu * sisiDua;
                    break;
                case 2:
                    namaPilihan = "lingkaran";
                    System.out.printf("%s%-2c","Masukkan radius",':');
                    int radius = Integer.parseInt(input.nextLine());
                    hasilKeliling = 2 * PI * radius;
                    hasilLuas = radius * radius * PI;
                    break;
                case 3:
                    namaPilihan = "segitiga";
                    System.out.printf("%s%-2c","Masukkan a",':');
                    int a = Integer.parseInt(input.nextLine());
                    System.out.printf("%s%-2c","Masukkan b",':');
                    int b = Integer.parseInt(input.nextLine());
                    System.out.printf("%s%-2c","Masukkan r",':');
                    int c = Integer.parseInt(input.nextLine());
                    hasilKeliling = a + b + c;
                    hasilLuas = a * b;
                    break;
                default:
                    System.out.print("Data tak ditemukan, program dihentikan ...");
                    outputHasilPerhitungan = false;
                    inputValid = false;
                    input.close();
                    break;
            }
            if (outputHasilPerhitungan)
            {
                System.out.printf("%s%c%s%c%-2c%.3f%c%s\n","Keliling",' ',namaPilihan,' ',':',hasilKeliling,' ',unitKeliling);
                System.out.printf("%s%c%s%c%-2c%.3f%c%s\n","Keliling",' ',namaPilihan,' ',':',hasilLuas,' ',unitLuas);
            }
        }
    }
}