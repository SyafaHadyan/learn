package syafa.java.Praktikum.Bab5;
import java.util.*;


public class Praktikum0
{
    static final String WELCOME_MESSAGE = "Program Penghitung Kombinasi dan Permutasi";
    static final String PROMPT = "Masukkan nilai";
    static final String[] OPTION =
    {
        "Menghitung Permutasi",
        "Menghitung Kombinasi",
        "Keluar"
    };
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int menuChoose = 0;
        double n = 0d;
        double r = 0d;
        while (menuChoose != 3)
        {
            System.out.println(WELCOME_MESSAGE);
            for (int i = 0; i < OPTION.length; i++)
            {
                System.out.println((i + 1) + "." + " " + OPTION[i]);
            }
            System.out.printf("%-22s%-2c","Masukkan pilihan anda",':');
            menuChoose = Integer.parseInt(input.nextLine());
            if (menuChoose == 1)
            {
                System.out.printf("%-17s%-2c","Masukkan nilai n",':');
                n = Double.parseDouble(input.nextLine());
                System.out.printf("%-17s%-2c","Masukkan nilai r",':');
                r = Double.parseDouble(input.nextLine());
            }
            else if (menuChoose == 2)
            {
                //
            }
            else if (menuChoose == 3)
            {
                input.close();
                System.exit(0);
            }
        }
    }
}