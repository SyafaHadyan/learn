import java.util.*;

public class PengulanganWhile
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.printf("%-30s%-2c","Masukkan angka awal",':');
        int angkaAwal = Integer.parseInt(input.nextLine());
        System.out.printf("%-30s%-2c","Masukkan angka maksimal",':');
        int angkaMaksimal = Integer.parseInt(input.nextLine());
        input.close();
        while (angkaAwal <= angkaMaksimal)
        {
            System.out.println(angkaAwal);
            angkaAwal++;
        }
    }
}