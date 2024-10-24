package syafa.java.Praktikum.Bab4;
import java.util.*;

public class N11Array2D
{
    @SuppressWarnings("unused")
    public static void main(String args[])
    { 
        Scanner in = new Scanner(System.in);
        in.close(); 
        String nama[] = new String[10];
        int[][] coba = {{1,2,3}, {4,5,6}, {7,8,9}, {10,11,12}};
        double [][] bank = new double [2][3];
        double nilaiMin = Double.MAX_VALUE;
        double nilaiMax = Double.MIN_VALUE;
        System.out.println(" i  j coba[i][j]");
        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                System.out.printf("%2d %2d %3d\n",i,j,coba[i][j]);
            }
        }
        for (int i = 0; i <= 1; i++)
        {
            for (int j = 0; j < 3 ; j++)
            {
                bank[i][j] = i * 0.5 + j * 0.25;
            }
        }
        for (int i = 0; i <= 1; i++)
        {
            for (int j = 0; j < 3 ; j++)
            { 
                System.out.print(bank[i][j] + " ");
            }
        }
        for (int i = 0; i < bank.length; i++)
        {
            for (int j = 0; j < bank[i].length; j++)
            {
                if (bank[i][j] > nilaiMax)
                {
                    nilaiMax = bank[i][j];
                }
                if (bank[i][j] < nilaiMin)
                {
                    nilaiMin = bank[i][j];
                }
            }
        }
        System.out.print("Nilai max" + "\n" + nilaiMax + "\n" + "Nilai min" + "\n" + nilaiMin);
    }
}
