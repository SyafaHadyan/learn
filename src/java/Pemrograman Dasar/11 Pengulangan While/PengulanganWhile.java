import java.util.*;

public class PengulanganWhile
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.printf("%-25s%-2c","Masukkan angka awal",':');
        int angkaAwal = Integer.parseInt(input.nextLine());
        System.out.printf("%-25s%-2c","Masukkan angka maksimal",':');
        int angkaMaksimal = Integer.parseInt(input.nextLine());
        input.close();
        int totalAngka = 0;
        while (angkaAwal <= angkaMaksimal)
        {
            System.out.println(angkaAwal);
            totalAngka += angkaAwal;
            angkaAwal++;
        }
        System.out.printf("%-25s%-2c%d","Total angka",':',totalAngka);
    }
}