package syafa.java.Praktikum.Bab3;
import java.util.*;

public class Praktikum2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.printf("%s\n%s\n%s\n%s\n%s\n%s\n%s\n\n%-25s%-2c",
                            "MENU",
                            "0. KELUAR",
                            "1. HITUNG VOLUME BALOK",
                            "2. HITUNG VOLUME BOLA",
                            "3. HITUNG VOLUME KERUCUT",
                            "4. HITUNG VOLUME SILINDER",
                            "5. HITUNG VOLUME LIMAS SEGITIGA",
                            "MASUKKAN PILIHAN ANDA",':');
        boolean inputValid = false;
        double selection = 0d;
        double radius = 0d;
        double height = 0d;
        final double PI = 3.1415926535;
        while (!inputValid)
        {
            selection = Double.parseDouble(input.nextLine());
            inputValid = true;
            if (selection == 0)
            {
                return;
            }
            else if (selection == 1)
            {
                selection = Math.pow(selection,3);
            }
            else if (selection == 2)
            {
                System.out.printf("-25s%-2c","Masukkan radius",':');
                radius = Double.parseDouble(input.nextLine());
                selection = (4.0/3.0) * PI * Math.pow(radius,3);
            }
            else if (selection == 3)
            {
                System.out.printf("-25s%-2c","Masukkan radius",':');
                radius = Double.parseDouble(input.nextLine());
                System.out.printf("-25s%-2c","Masukkan tinggi",':');
                height = Double.parseDouble(input.nextLine());
                selection = (1.0/3.0) * PI * Math.pow(radius,2) * height;
            }
            else if (selection == 4)
            {
                System.out.printf("-25s%-2c","Masukkan radius",':');
                radius = Double.parseDouble(input.nextLine());
                System.out.printf("-25s%-2c","Masukkan tinggi",':');
                height = Double.parseDouble(input.nextLine());
                selection = PI * Math.pow(radius,2) * height;
            }
            else if (selection == 5)
            {
                //
            }
            else
            {
                System.out.print("\n\n" + "Pilihan yang anda masukkan salah, silahkan masukkan kembali pilihan anda" + "\n\n");
                inputValid = false;
            }
        }
        input.close();
        System.out.printf("%s25s%-2c%.8f","Hasil",':',selection);
    }
}