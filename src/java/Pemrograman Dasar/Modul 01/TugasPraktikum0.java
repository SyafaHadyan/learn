import java.util.*;

public class TugasPraktikum0
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.printf("%-30s%-1c%-1c","Masukkan Operator Pertama",':',' ');
        double first = input.nextDouble();
        System.out.printf("%-30s%-1c%-1c","Masukkan Operator Kedua",':',' ');
        double second = input.nextDouble();
        System.out.println("--------------------------------------------------");
        System.out.printf("%-30s%-1c%-1c%1.3f\n","Hasil Penjumlahan",':',' ',first + second);
        System.out.printf("%-30s%-1c%-1c%1.3f\n","Hasil Pengurangan",':',' ',first - second);
        System.out.printf("%-30s%-1c%-1c%1.3f\n","Hasil Perkalian",':',' ',first * second);
        System.out.printf("%-30s%-1c%-1c%1.3f","Hasil Pembagian",':',' ',first / second);
        input.close();
    }
}