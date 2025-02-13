import java.util.*;

public class Kuis01
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.printf("%-20s%-2c","Masukkan gaji kotor",':');
        double gajikotor = Double.parseDouble(input.nextLine());
        System.out.printf("%-20s%-2c","Masukkan gaji lembur",':');
        double uangLembur = Double.parseDouble(input.nextLine());
        input.close();
        double gajiSebelumPajak = gajikotor + uangLembur;
        double pajak = 0.025;
        double gajiBersih = gajiSebelumPajak - (gajiSebelumPajak * pajak);
        if (gajiSebelumPajak >= 2000000)
        {
            pajak = 0.05;
            gajiBersih = gajiSebelumPajak - (gajiSebelumPajak * pajak);
        }
        System.out.printf("%-20s%-2c","Gaji bersih",':');
        System.out.printf("%.3f",gajiBersih);
    }
}