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
        BigDecimal sumXY = BigDecimal.ZERO;
        for (int i = 0; i < dataSet; i++)
        {
            System.out.printf("%-27s%d %-2c","Masukkan nilai x dan y ke-",(i + 1),':');
            x[i] = input.nextBigDecimal();
            y[i] = input.nextBigDecimal();
            sumX = sumX.add(x[i]);
            sumY = sumY.add(y[i]);
            sumXY = sumXY.add(sumX.multiply(sumY));
        }
        input.close();
    }
}