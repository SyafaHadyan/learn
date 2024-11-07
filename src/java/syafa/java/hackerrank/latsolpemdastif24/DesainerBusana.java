package syafa.java.hackerrank.latsolpemdastif24;
import java.util.*;

public class DesainerBusana
{
    /*
     * Jika bahan tidak cukup untuk membuat minimal 1 baju dari masing-masing ukuran, cetak:
     * Bahan tidak cukup untuk membuat baju.
     * 
     * Jika bahan cukup, cetak:
     * Nonput dapat membuat X ukuran S, Y ukuran M, Z ukuran L.
     * 
     * 12
     * 8
     * 
     * Jumlah Kain: 12.0
     * Jumlah Pita: 8.0
     * Nonput dapat membuat 2 ukuran S, 1 ukuran M, 4 ukuran L.
     * 
     * Karena Nonput ingin membuat minimal satu baju untuk masing-masing ukuran maka
     * jumlah kain dan pita yang tersisa setelah digunakan adalah 7.3 meter kain dan 4.9 meter pita.
     * Sisa kain dan pita tersebut cukup untuk membuat 3 baju ukuran L dan 1 baju ukuran S.
     * 
     * 5
     * 4
     * 
     * Jumlah Kain: 5.0
     * Jumlah Pita: 4.0
     * Nonput dapat membuat 1 ukuran S, 1 ukuran M, 1 ukuran L.
     * 
     * 10
     * 3
     * 
     * Jumlah Kain: 10.0
     * Jumlah Pita: 3.0
     * Bahan tidak cukup untuk membuat baju.
     */
    static final double[][] CLOTH_RIBBON =
    {
        {1.2,1.5,2.0},
        {0.8,1.0,1.3}
    };
    static final char[] SIZE_LIST =
    {
        'S',
        'M',
        'L'
    };
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double[] material = new double[2];
        for (int i = 0; i < 2; i++)
        {
            material[i] = Double.parseDouble(input.nextLine());
        }
        input.close();
        System.out.printf
        (
            "%-12s%-2c%.1f\n%-12s%-2c%.1f\n",
            "Jumlah Kain",':',material[0],"Jumlah Pita",':',material[1]
        );
        int[] product = {1,1,1};
        for (int i = 0; i < CLOTH_RIBBON.length; i++)
        {
            for (int j = 0; j < CLOTH_RIBBON[i].length; j++)
            {
                material[i] -= CLOTH_RIBBON[i][j];
            }
            if (material[i] < 0)
            {
                System.out.print("Bahan tidak cukup untuk membuat baju.");
                System.exit(0);
            }
        }
        for (int i = 2; i >= 0; i--)
        {
            if (material[0] - CLOTH_RIBBON[0][i] >= 0 && material[1] - CLOTH_RIBBON[1][i] >= 0)
            {
                for (int j = 0; j < material.length; j++)
                {
                    material[j] -= CLOTH_RIBBON[j][i];
                }
                product[i]++;
                i++;
            }
        }
        System.out.println("Nonput dapat membuat");
        /*
         * Nonput dapat membuat 2 ukuran S, 1 ukuran M, 4 ukuran L.
         */
        for (int i = 0; i < product.length; i++)
        {
            System.out.printf(" %2d%-7s%c%c",product[i],"ukuran",SIZE_LIST[i],(product.length - i == 1) ? '.' : ',');
        }
    }
}