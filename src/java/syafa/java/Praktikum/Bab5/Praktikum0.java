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
    static final char[] VALUE =
    {
        'n',
        'r'
    };
    public static double permutation(double[] number)
    {
        number[1] = number[0] - number[1];
        for (int i = 0; i < number.length / 2; i++)
        {
            number[i + 2] = 1;
            for (double j = number[i]; j > 0; j--)
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
        double[] nr = {0,0,1,1,0};
        while (true)
        {
            System.out.println(WELCOME_MESSAGE);
            for (int i = 0; i < OPTION.length; i++)
            {
                System.out.printf("%d%-2s%s\n",(i + 1),'.',OPTION[i]);
            }
            System.out.printf("%-22s%-2c","Masukkan pilihan anda",':');
            menuChoose = Integer.parseInt(input.nextLine());
            if (menuChoose == 1)
            {
                for (int i = 0; i < VALUE.length; i++)
                {
                    System.out.printf("%-15s%-2c%-2c","Masukkan nilai",VALUE[i],':');
                    nr[i] = Double.parseDouble(input.nextLine());
                }
                nr[4] = permutation(nr);
                System.out.printf
                (
                    "%9c\n%-4s%-2c%-7s%-2c%.0f\n%12s\n%-31s%-2c%.0f\n\n",
                    'n',
                    "nPr",'=',"------",'=',nr[4],
                    "(n-r)!",
                    "Maka Hasil Permutasinya adalah",':',nr[4]
                );
            }
            else if (menuChoose == 2)
            {
                for (int i = 0; i < VALUE.length; i++)
                {
                    System.out.printf("%-15s%-2c%-2c","Masukkan nilai",VALUE[i],':');
                    nr[i] = Double.parseDouble(input.nextLine());
                }
                nr[4] = permutation(nr);
            }
            else if (menuChoose == 3)
            {
                input.close();
                System.exit(0);
            }
        }
    }
}