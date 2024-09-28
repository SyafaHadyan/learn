import java.util.*;

public class Praktikum0
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        final double PI = 3.14159265358979323846;
        final String unitKeliling = "cm";
        final String unitLuas = unitKeliling + '2';
        String namaPilihanKeliling = "Keliling";
        String namaPilihanLuas = "Luas";
        double hasilKeliling = 0;
        double hasilLuas = 0;
        int pilihanKonversi = 0;
        int sisiSatu = 0;
        int sisiDua = 0;
        int radius = 0;
        int a = 0;
        int b = 0;
        int r = 0;
        System.out.println("1. menghitung luas dan keliling persegi panjang");
        System.out.println("2. menghitung luas dan keliling lingkaran");
        System.out.println("3. menghitung luas dan keliling segitiga" + "\n");
        try
        {
            System.out.printf("%s%-2c","Pilihan anda",':');
            pilihanKonversi = Integer.parseInt(input.nextLine());
        }
        catch (NumberFormatException e)
        {
            input.close();
            return;
        }
        switch (pilihanKonversi)
        {
            case 1:
                try
                {
                    System.out.printf("%s%-2c","Masukkan sisi 1",':');
                    sisiSatu = Integer.parseInt(input.nextLine());
                    System.out.printf("%s%-2c","Masukkan sisi 2",':');
                    sisiDua = Integer.parseInt(input.nextLine());   
                }
                catch (NumberFormatException e)
                {
                    input.close();
                    return;
                }
                namaPilihanKeliling += ' ' + "persegi panjang";
                namaPilihanLuas += ' ' + "persegi panjang";
                hasilKeliling = (sisiSatu * 2) + (sisiDua * 2);
                hasilLuas = sisiSatu * sisiDua;
                break;
            case 2:
                try
                {
                    System.out.printf("%s%-2c","Masukkan radius",':');
                    radius = Integer.parseInt(input.nextLine());
                }
                catch (NumberFormatException e)
                {
                    input.close();
                    return;
                }
                namaPilihanKeliling += ' ' + "lingkaran";
                namaPilihanLuas += ' ' + "lingkaran";
                hasilKeliling = 2 * PI * radius;
                hasilLuas = radius * radius * PI;
                break;
            case 3:
                try
                {
                    System.out.printf("%s%-2c","Masukkan a",':');
                    a = Integer.parseInt(input.nextLine());
                    System.out.printf("%s%-2c","Masukkan b",':');
                    b = Integer.parseInt(input.nextLine());
                    System.out.printf("%s%-2c","Masukkan r",':');
                    r = Integer.parseInt(input.nextLine());
                }
                catch (NumberFormatException e)
                {
                    input.close();
                    return;
                }
                namaPilihanKeliling += ' ' + "segitiga";
                namaPilihanLuas += ' ' + "segitiga";
                hasilKeliling = a + b + r;
                hasilLuas = a * b / 2;
                break;
            default:
                System.out.print("Data tak ditemukan, program dihentikan ...");
                input.close();
                return;
        }
        input.close();
        System.out.printf("\n%-25s%c%c%c%.0f%c%s\n",namaPilihanKeliling,' ',':',' ',hasilKeliling,' ',unitKeliling);
        System.out.printf("%-25s%c%c%c%.0f%c%s\n\n",namaPilihanLuas,' ',':',' ',hasilLuas,' ',unitLuas);
    }
}