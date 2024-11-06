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
    public static double[] permutation(double[] number)
    {
        number[1] = number[0] - number[1];
        for (int i = 0; i < 2; i++)
        {
            number[i + 2] = 1;
            for (double j = number[i]; j > 0; j--)
            {
                number[i + 2] *= j;
            }
        }
        return new double[]{number[2],number[3]};
    }
    public static double combination(double[] number)
    {
        double[] result = permutation(number);
        number[3] = 1;
        for (double i = number[1]; i > 0; i--)
        {
            number[3] *= i;
        }
        return result[0] / (result[1] * number[3]);
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int menuChoose = 0;
        double[] nr = {0,0,1,1};
        double[] result = new double[2];
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
                result = permutation(nr);
                System.out.printf
                (
                    "%9c\n%-4s%-2c%-7s%-2c%.0f\n%12s\n%-31s%-2c%.0f\n\n",
                    'n',
                    "nPr",'=',"------",'=',result[0] / result[1],
                    "(n-r)!",
                    "Maka Hasil Permutasinya adalah",':',result[0] / result[1]
                );
            }
            else if (menuChoose == 2)
            {
                for (int i = 0; i < VALUE.length; i++)
                {
                    System.out.printf("%-15s%-2c%-2c","Masukkan nilai",VALUE[i],':');
                    nr[i] = Double.parseDouble(input.nextLine());
                }
                //nr[2],nr[3] = combination(nr);
                System.out.println(nr[4]);
            }
            else if (menuChoose == 3)
            {
                input.close();
                System.exit(0);
            }
        }
    }
}