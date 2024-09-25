import java.util.*;

public class Praktikum0
{
    public static void main(String[] args)
    {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        double hasilKeliling = 0;
        double hasilLuas = 0;
        String namaPilihan = "Bentuk";
        final double PI = 3.14159265358979323846;
        final String unitKeliling = "cm";
        final String unitLuas = unitKeliling + '2';
        boolean inputValid = true;
        int sisiSatu = 0;
        int sisiDua = 0;
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
                    try
                    {
                        System.out.printf("%s%-2c","Masukkan sisi 1",':');
                        sisiSatu = Integer.parseInt(input.nextLine());
                        System.out.printf("%s%-2c","Masukkan sisi 2",':');
                        sisiDua = Integer.parseInt(input.nextLine());   
                    }
                    catch (NumberFormatException e)
                    {
                        return;
                    }
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
                    try {
                        
                    }
                    catch (NumberFormatException e)
                    {
                        // TODO: handle exception
                    }
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
                    input.close();
                    return;
            }
            System.out.printf("%s%c%s%c%-2c%.0f%c%s\n","Keliling",' ',namaPilihan,' ',':',hasilKeliling,' ',unitKeliling);
            System.out.printf("%s%c%s%c%-2c%.0f%c%s\n","Luas",' ',namaPilihan,' ',':',hasilLuas,' ',unitLuas);
        }
    }
}