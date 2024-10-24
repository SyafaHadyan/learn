package syafa.java.Praktikum.Bab4;
import java.util.*;
import java.util.stream.*;

public class N10Array2D
{
    @SuppressWarnings("unused")
    public static void main(String args[])
    { 
        Scanner in = new Scanner(System.in);
        in.close(); 
        String nama[] = new String[10];
        int[][] coba = {{1,2,3}, {4,5,6}, {7,8,9}, {10,11,12}};
        double [][] bank = new double [2][3];
        double nilaiRata2 = 0d;
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
                nilaiRata2 += i * 0.5 + j * 0.25;
            }
        }
        for (int i = 0; i <= 1; i++)
        {
            for (int j = 0; j < 3 ; j++)
            { 
                System.out.print(bank[i][j] + " ");
            }
        }
        System.out.println("\nCara manual");
        System.out.println(nilaiRata2 / (bank[0].length+ bank[1].length));
        System.out.println("Cara lain");
        System.out.printf("%.3f",((DoubleStream.of(bank[0]).sum() + DoubleStream.of(bank[1]).sum()) / ((bank[0].length + bank[1].length))));
    }
}