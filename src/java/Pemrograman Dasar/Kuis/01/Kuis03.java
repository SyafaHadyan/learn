import java.util.*;

public class Kuis03
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int hargaMakanan1 = 5000;
        int hargaMakanan2 = 10000;
        int hargaMakanan3 = 8000;
        int hargaMakanan4 = 3000;
        int hargaMakanan5 = 3000;

        int hargaMinuman1 = 5000;
        int hargaMinuman2 = 50000;
        int hargaMinuman3 = 8000;
        int hargaMinuman4 = 10000;
        int hargaMinuman5 = 22000;

        int total = 0;
        System.out.print("Makanan" + "\n" + 
                            "1. Nasi Rp. 5.000" + "\n" + 
                            "2. Ikan Rp. 10.000" + "\n" + 
                            "3. Udang Rp. 8.000" + "\n" + 
                            "4. Tempe Rp. 3.000" + "\n" + 
                            "5. Tempe Rp. 3.000" + "\n");
        System.out.print("\n" + "Minuman" + "\n" + 
                            "1. Air Putih Rp. 5.000" + "\n" + 
                            "2. Jus Uang Rp. 50.000" + "\n" + 
                            "3. Teh (Tanpa gula) Rp. 8.000" + "\n" + 
                            "4. Teh Manis  Rp. 10.000" + "\n" + 
                            "5. Jus Rp. 22.000" + "\n\n");
        System.out.printf("%-20s%-2c","Pilih makanan anda",':');
        int pilihanMakanan = Integer.parseInt(input.nextLine());
        System.out.printf("%-20s%-2c","Pilih minuman anda",':');
        int pilihanMinuman = Integer.parseInt(input.nextLine());
        input.close();
        switch (pilihanMakanan)
        {
            case 1:
                total = hargaMakanan1;
                break;
            case 2:
                total = hargaMakanan2;
                break;
            case 3:
                total = hargaMakanan3;
                break;
            case 4:
                total = hargaMakanan4;
                break;
            case 5:
                total = hargaMakanan5;
                break;
            default:
                break;
        }
        switch (pilihanMinuman)
        {
            case 1:
                total += hargaMinuman1;
                break;
            case 2:
                total += hargaMinuman2;
                break;
            case 3:
                total += hargaMinuman3;
                break;
            case 4:
                total += hargaMinuman4;
                break;
            case 5:
                total += hargaMinuman5;
                break;
            default:
                break;
        }
        System.out.println("\nAnda harus membayar");
        System.out.print(total);
    }
}