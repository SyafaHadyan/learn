package syafa.java.stp.regresi;
import java.util.*;
import java.util.stream.*;;
import java.math.*;

public class RegresiLinierSatuVariabelBebas
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.printf("%-25s%-2c","Masukkan jumlah data set",':');
        int dataSet = Integer.parseInt(input.nextLine());
        BigDecimal[] x = new BigDecimal[dataSet];
        BigDecimal[] y = new BigDecimal[dataSet];
        BigDecimal sumX = BigDecimal.ZERO;
        BigDecimal sumY = BigDecimal.ZERO;
        BigDecimal sumXPowTwo = BigDecimal.ZERO;
        BigDecimal sumXY = BigDecimal.ZERO;
        BigDecimal a = BigDecimal.ZERO;
        BigDecimal b = BigDecimal.ZERO;
        for (int i = 0; i < dataSet; i++)
        {
            System.out.printf("%-27s%d %-2c","Masukkan nilai x dan y ke-",(i + 1),':');
            x[i] = input.nextBigDecimal();
            y[i] = input.nextBigDecimal();
            sumX = sumX.add(x[i]);
            sumY = sumY.add(y[i]);
            sumXPowTwo = sumXPowTwo.add(sumX.pow(2));
            sumXY = sumXY.add(sumX.multiply(sumY));
        }
        b = (BigDecimal.valueOf(dataSet).multiply(sumXY).subtract(sumX.multiply(sumY))).divide(BigDecimal.valueOf(dataSet).multiply(sumXPowTwo).subtract(sumX.pow(2)));
        a = (sumY.subtract(b.multiply(sumX))).divide(BigDecimal.valueOf(dataSet));
        input.close();
        System.out.printf("Nilai A %.3f\n Nilai B %.3f",a,b);
    }
}