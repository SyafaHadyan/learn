package syafa.java.stp.regresi;
import java.util.*;
import java.math.*;
import syafa.java.lib.*;
import syafa.java.lib.BigDecimalUtil.BigDecimalMath;

public class RegresiNonLinierSatuVariabelBebas
{
    static Scanner input = new Scanner(System.in);
    static final MathContext ROUNDING_MODE = new MathContext(3,RoundingMode.HALF_UP);
    static final String[] CALCULATION_OPTION =
    {
        "Eksponensial",
        "Pangkat",
        "Polinomial"
    };
    /*public static BigDecimal BigDecimalPow(BigDecimal a,BigDecimal b)
    {
        //return pow(a, b, Constant.MACH_SCALE);
    }
    */
    public static BigDecimal[] calculateAB(int dataSet,BigDecimal sumX,BigDecimal sumY,BigDecimal sumXPowTwo,BigDecimal sumXY)
    {
        BigDecimal a = BigDecimal.ZERO;
        BigDecimal b = BigDecimal.ZERO;
        b = (BigDecimal.valueOf(dataSet).multiply(sumXY).subtract(sumX.multiply(sumY))).divide(BigDecimal.valueOf(dataSet).multiply(sumXPowTwo).subtract(sumX.pow(2)),ROUNDING_MODE);
        a = (sumY.subtract(b.multiply(sumX))).divide(BigDecimal.valueOf(dataSet));
        return new BigDecimal[]{a,b};
    }
    public static void exponential(int dataSet,BigDecimal sumX,BigDecimal sumY,BigDecimal sumXPowTwo,BigDecimal sumXY)
    {
        //BigDecimal[] ab = calculateAB(dataSet,sumX,sumY,sumXPowTwo,sumXY);
        //System.out.printf("Hasil: %.3f",ab[0].add(ab[1].multiply(input.nextBigDecimal())));
    }
    public static void pow(int dataSet,BigDecimal sumX,BigDecimal sumY,BigDecimal sumXPowTwo,BigDecimal sumXY)
    {
        BigDecimal[] ab = calculateAB(dataSet,sumX,sumY,sumXPowTwo,sumXY);
        System.out.printf("Hasil: %.3f",ab[0].multiply(BigDecimalMath.pow(input.nextBigDecimal(),ab[1])));;
    }
    public static void polynomial(int dataSet,BigDecimal sumX,BigDecimal sumY,BigDecimal sumXPowTwo,BigDecimal sumXY)
    {
        //
    }
    public static void printAB(BigDecimal a,BigDecimal b)
    {
        System.out.printf("Nilai A: %.3f\nNilai B: %.3f\n",a,b);
    }
    public static void main(String[] args)
    {
        System.out.printf("%-25s%-2c","Masukkan jumlah data set",':');
        int dataSet = Integer.parseInt(input.nextLine());
        BigDecimal[] x = new BigDecimal[dataSet];
        BigDecimal[] y = new BigDecimal[dataSet];
        BigDecimal sumX = BigDecimal.ZERO;
        BigDecimal sumY = BigDecimal.ZERO;
        BigDecimal sumXPowTwo = BigDecimal.ZERO;
        BigDecimal sumXY = BigDecimal.ZERO;
        for (int i = 0; i < dataSet; i++)
        {
            System.out.printf("%-27s%d %-2c","Masukkan nilai x dan y ke-",(i + 1),':');
            x[i] = input.nextBigDecimal();
            y[i] = input.nextBigDecimal();
            sumX = sumX.add(x[i]);
            sumY = sumY.add(y[i]);
            sumXPowTwo = sumXPowTwo.add(x[i].pow(2));
            sumXY = sumXY.add(x[i].multiply(y[i]));
        }
        while (true)
        {
            for (int i = 0; i < CALCULATION_OPTION.length; i++)
            {
                System.out.println((i + 1) + " " + CALCULATION_OPTION[i]);
            }
            System.out.printf("%-26s%-2c","Masukkan bentuk kalkulasi",':');
            int menu = Integer.parseInt(input.nextLine());
            if (menu == 1)
            {
                exponential(dataSet,sumX,sumY,sumXPowTwo,sumXY);
                break;
            }
            else if (menu == 2)
            {
                pow(dataSet,sumX,sumY,sumXPowTwo,sumXY);
                break;
            }
            else if (menu == 3)
            {
                polynomial(dataSet,sumX,sumY,sumXPowTwo,sumXY);
                break;
            }
        }
        System.out.printf("%-38s%-2c","Masukkan nilai x yang akan diprediksi",':');
        //System.out.printf("Hasil: %.3f",a.add(b.multiply(input.nextBigDecimal())));
        input.close();
    }
}