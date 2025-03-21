package syafa.java.Praktikum.Bab5;
import java.util.*;
import java.math.*;

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
    public static BigInteger[] permutation(BigInteger[] number)
    {
        number[1] = number[0].subtract(number[1]);
        for (int i = 0; i < 2; i++)
        {
            number[i + 2] = BigInteger.ONE;
            for (BigInteger j = number[i]; (j.compareTo(BigInteger.ZERO) == 1); j = j.subtract(BigInteger.ONE))
            {
                number[i + 2] = number[i + 2].multiply(j);
            }
        }
        return new BigInteger[]{number[2],number[3]};
    }
    public static BigInteger combination(BigInteger[] number)
    {
        number[2] = number[1];
        number[4] = BigInteger.ONE;
        for (BigInteger i = number[2]; (i.compareTo(BigInteger.ZERO) == 1); i = i.subtract(BigInteger.ONE))
        {
            number[4] = number[4].multiply(i);
        }
        BigInteger[] result = permutation(number);
        return result[0].divide(result[1].multiply(number[4]));
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int menuChoose = 0;
        BigInteger[] nr = {BigInteger.ZERO,BigInteger.ZERO,BigInteger.ONE,BigInteger.ONE,BigInteger.ONE};
        BigInteger[] result = new BigInteger[2];
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
                    nr[i] = input.nextBigInteger();
                }
                input.nextLine();
                result = permutation(nr);
                nr[4] = result[0].divide(result[1]);
                System.out.printf
                (
                    "%9c\n%-4s%-2c%-7s%-2c%d\n%12s\n%-31s%-2c%d\n\n",
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
                    nr[i] = input.nextBigInteger();
                }
                input.nextLine();
                result[0] = combination(nr);
                System.out.printf
                (
                    "%12c\n%-4s%-2c%-12s%-2c%d\n%17s\n%-31s%-2c%d\n\n",
                    'n',
                    "nCr",'=',"-----------",'=',result[0],
                    "(n-r)! x r!",
                    "Maka Hasil Kombinasinya adalah",':',result[0]
                );
            }
            else if (menuChoose == 3)
            {
                System.out.print("Keluar...");
                input.close();
                System.exit(0);
            }
        }
    }
}