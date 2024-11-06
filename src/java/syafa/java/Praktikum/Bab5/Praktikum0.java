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
    public static int permutation(int[] number)
    {
        //int result = 1;
        int[] numeratorDenuminator = new int[2];
        number[1] = number[0] - number[1];
        for (int i = 0; i < number.length; i++)
        {
            numeratorDenuminator[i] = 1;
            for (int j = number[0]; j > 0; j--)
            {
                numeratorDenuminator[i] *= j;
            }
        }
        return numeratorDenuminator[0] / numeratorDenuminator[1];
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
                n = Integer.parseInt(input.nextLine());
                System.out.printf("%-17s%-2c","Masukkan nilai r",':');
                r = Integer.parseInt(input.nextLine());
                menuChoose = permutation(new int[]{n,r});
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