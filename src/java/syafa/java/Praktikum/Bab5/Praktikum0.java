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
    public static int permutation(double n,double r)
    {
        return 0;
    }
    public static int combination(int n,int r)
    {
        return 0;
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int menuChoose = 0;
        int n = 0;
        int r = 0;
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
                n = Integer.parseInt(input.nextLine());
                System.out.printf("%-17s%-2c","Masukkan nilai r",':');
                r = Integer.parseInt(input.nextLine());
            }
            else if (menuChoose == 2)
            {
                System.out.printf("%-17s%-2c","Masukkan nilai n",':');
                n = Integer.parseInt(input.nextLine());
                System.out.printf("%-17s%-2c","Masukkan nilai r",':');
                r = Integer.parseInt(input.nextLine());
            }
            else if (menuChoose == 3)
            {
                input.close();
                System.exit(0);
            }
        }
    }
}