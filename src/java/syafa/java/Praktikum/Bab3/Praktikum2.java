package syafa.java.Praktikum.Bab3;
import java.util.*;

public class Praktikum2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        boolean inputValid = false;
        double selection = 0d;
        double radius = 0d;
        double height = 0d;
        double firstSide = 0d;
        double secondSide = 0d;
        final double PI = 3.1415926535;
        while (!inputValid)
        {
            System.out.printf("%s\n%s\n%s\n%s\n%s\n%s\n%s\n\n%-25s%-2c",
            "MENU",
            "0. KELUAR",
            "1. HITUNG VOLUME BALOK",
            "2. HITUNG VOLUME BOLA",
            "3. HITUNG VOLUME KERUCUT",
            "4. HITUNG VOLUME SILINDER",
            "5. HITUNG VOLUME LIMAS SEGITIGA",
            "MASUKKAN PILIHAN ANDA",':');
            selection = Double.parseDouble(input.nextLine());
            if (selection == 0)
            {
                input.close();
                return;
            }
            else if (selection == 1)
            {
                System.out.printf("%-25s%-2c","Masukkan radius",':');
                radius = Double.parseDouble(input.nextLine());
                selection = Math.pow(radius,3);
            }
            else if (selection == 2)
            {
                System.out.printf("%-25s%-2c","Masukkan radius",':');
                radius = Double.parseDouble(input.nextLine());
                selection = (4.0 / 3.0) * PI * Math.pow(radius,3);
            }
            else if (selection == 3)
            {
                System.out.printf("%-25s%-2c","Masukkan radius",':');
                radius = Double.parseDouble(input.nextLine());
                System.out.printf("%-25s%-2c","Masukkan tinggi",':');
                height = Double.parseDouble(input.nextLine());
                selection = (1.0 / 3.0) * PI * Math.pow(radius,2) * height;
            }
            else if (selection == 4)
            {
                System.out.printf("%-25s%-2c","Masukkan radius",':');
                radius = Double.parseDouble(input.nextLine());
                System.out.printf("%-25s%-2c","Masukkan tinggi",':');
                height = Double.parseDouble(input.nextLine());
                selection = PI * Math.pow(radius,2) * height;
            }
            else if (selection == 5)
            {
                System.out.printf("%-25s%-2c","Masukkan tinggi",':');
                height = Double.parseDouble(input.nextLine());
                System.out.printf("%-25s%-2c","Masukkan sisi pertama",':');
                firstSide = Double.parseDouble(input.nextLine());
                System.out.printf("%-25s%-2c","Masukkan sisi kedua",':');
                secondSide = Double.parseDouble(input.nextLine());
                selection = (1.0 / 3.0) * (firstSide * secondSide) * height;
            }
            else
            {
                System.out.print("\n" + "Pilihan yang anda masukkan salah, silahkan masukkan kembali pilihan anda" + "\n\n");
                inputValid = false;
                continue;
            }
            System.out.printf("%-25s%-2c%.5f\n\n","Hasil",':',selection);
        }
        input.close();
    }
}