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
        final double PI = 3.1415926535;
        double radius = 0d;
        while (!inputValid)
        {
            double selection = Double.parseDouble(input.nextLine());
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
                radius = Double.parseDouble(input.nextLine());
                selection = (4/3) * PI * Math.pow(radius,3);
            }
            else if (selection == 3)
            {
                //
            }
            else if (selection == 4)
            {
                //
            }
            else if (selection == 5)
            {
                //
            }
            else
            {
                inputValid = false;
            }
        }
        input.close();
    }
}