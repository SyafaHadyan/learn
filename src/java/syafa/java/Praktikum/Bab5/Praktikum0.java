package syafa.java.Praktikum.Bab5;
import java.util.*;


public class Praktikum0
{
    static final String WELCOME_MESSAGE = "Program Penghitung Kombinasi dan Permutasi";
    static final String[] OPTION =
    {
        "Menghitung Permutasi",
        "Menghitung Kombinasi",
        "Keluar"
    };
    public static int permutation(int[] number)
    {
        number[1] = number[0] - number[1];
        for (int i = 0; i < number.length / 2; i++)
        {
            for (int j = number[i]; j > 0; j--)
            {
                number[i + 2] *= j;
            }
        }
        return number[2] / number[3];
    }
    public static int combination(int n,int r)
    {
        return 0;
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int menuChoose = 0;
        int[] nr = {0,0,1,1};
        while (true)
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
                nr[0] = Integer.parseInt(input.nextLine());
                System.out.printf("%-17s%-2c","Masukkan nilai r",':');
                nr[1] = Integer.parseInt(input.nextLine());
                menuChoose = permutation(nr);
                System.out.printf
                (
                    "%9c\n%-4s%-2c%-7s%-2c%d\n%12s\n%-31s%-2c%d\n\n",
                    'n',
                    "nPr",'=',"------",'=',menuChoose,
                    "(n-r)!",
                    "Maka Hasil Permutasinya adalah",':',menuChoose
                );
            }
            else if (menuChoose == 2)
            {
                System.out.printf("%-17s%-2c","Masukkan nilai n",':');
                nr[0] = Integer.parseInt(input.nextLine());
                System.out.printf("%-17s%-2c","Masukkan nilai r",':');
                nr[1] = Integer.parseInt(input.nextLine());
            }
            else if (menuChoose == 3)
            {
                input.close();
                System.exit(0);
            }
        }
    }
}